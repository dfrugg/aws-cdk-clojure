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


(defn cfn-destination-builder>
  "The cfn-destination-builder> function updates a CfnDestination$Builder instance using the provided configuration.
  The function takes the CfnDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `expressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDestination$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :expression-type)]
    (. builder expressionType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-destination-builder
  "Creates a  `CfnDestination$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-destination-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-destination-builder> (CfnDestination$Builder/create scope (name id)) id config))


(defn cfn-destination-props-builder>
  "The cfn-destination-props-builder> function updates a CfnDestinationProps$Builder instance using the provided configuration.
  The function takes the CfnDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `expressionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDestinationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :expression-type)]
    (. builder expressionType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-destination-props-builder
  "Creates a  `CfnDestinationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-destination-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-destination-props-builder> (new CfnDestinationProps$Builder) id config))


(defn cfn-device-profile-builder>
  "The cfn-device-profile-builder> function updates a CfnDeviceProfile$Builder instance using the provided configuration.
  The function takes the CfnDeviceProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnDeviceProfile$LoRaWANDeviceProfileProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeviceProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-device-profile-builder
  "Creates a  `CfnDeviceProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-device-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-device-profile-builder> (CfnDeviceProfile$Builder/create scope (name id)) id config))


(defn cfn-device-profile-lo-ra-wan-device-profile-property-builder>
  "The cfn-device-profile-lo-ra-wan-device-profile-property-builder> function updates a CfnDeviceProfile$LoRaWANDeviceProfileProperty$Builder instance using the provided configuration.
  The function takes the CfnDeviceProfile$LoRaWANDeviceProfileProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `supportsJoin` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:supports-join` |
"
  [^CfnDeviceProfile$LoRaWANDeviceProfileProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :class-b-timeout)]
    (. builder classBTimeout data))
  (when-some [data (lookup-entry config id :class-c-timeout)]
    (. builder classCTimeout data))
  (when-some [data (lookup-entry config id :factory-preset-freqs-list)]
    (. builder factoryPresetFreqsList data))
  (when-some [data (lookup-entry config id :mac-version)]
    (. builder macVersion data))
  (when-some [data (lookup-entry config id :max-duty-cycle)]
    (. builder maxDutyCycle data))
  (when-some [data (lookup-entry config id :max-eirp)]
    (. builder maxEirp data))
  (when-some [data (lookup-entry config id :ping-slot-dr)]
    (. builder pingSlotDr data))
  (when-some [data (lookup-entry config id :ping-slot-freq)]
    (. builder pingSlotFreq data))
  (when-some [data (lookup-entry config id :ping-slot-period)]
    (. builder pingSlotPeriod data))
  (when-some [data (lookup-entry config id :reg-params-revision)]
    (. builder regParamsRevision data))
  (when-some [data (lookup-entry config id :rf-region)]
    (. builder rfRegion data))
  (when-some [data (lookup-entry config id :rx-data-rate2)]
    (. builder rxDataRate2 data))
  (when-some [data (lookup-entry config id :rx-delay1)]
    (. builder rxDelay1 data))
  (when-some [data (lookup-entry config id :rx-dr-offset1)]
    (. builder rxDrOffset1 data))
  (when-some [data (lookup-entry config id :rx-freq2)]
    (. builder rxFreq2 data))
  (when-some [data (lookup-entry config id :supports32-bit-f-cnt)]
    (. builder supports32BitFCnt data))
  (when-some [data (lookup-entry config id :supports-class-b)]
    (. builder supportsClassB data))
  (when-some [data (lookup-entry config id :supports-class-c)]
    (. builder supportsClassC data))
  (when-some [data (lookup-entry config id :supports-join)]
    (. builder supportsJoin data))
  (.build builder))


(defn cfn-device-profile-lo-ra-wan-device-profile-property-builder
  "Creates a  `CfnDeviceProfile$LoRaWANDeviceProfileProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-device-profile-lo-ra-wan-device-profile-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-device-profile-lo-ra-wan-device-profile-property-builder> (new CfnDeviceProfile$LoRaWANDeviceProfileProperty$Builder) id config))


(defn cfn-device-profile-props-builder>
  "The cfn-device-profile-props-builder> function updates a CfnDeviceProfileProps$Builder instance using the provided configuration.
  The function takes the CfnDeviceProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loRaWan` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDeviceProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-device-profile-props-builder
  "Creates a  `CfnDeviceProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-device-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-device-profile-props-builder> (new CfnDeviceProfileProps$Builder) id config))


(defn cfn-fuota-task-builder>
  "The cfn-fuota-task-builder> function updates a CfnFuotaTask$Builder instance using the provided configuration.
  The function takes the CfnFuotaTask$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFuotaTask$Builder builder id config]
  (when-some [data (lookup-entry config id :associate-multicast-group)]
    (. builder associateMulticastGroup data))
  (when-some [data (lookup-entry config id :associate-wireless-device)]
    (. builder associateWirelessDevice data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :disassociate-multicast-group)]
    (. builder disassociateMulticastGroup data))
  (when-some [data (lookup-entry config id :disassociate-wireless-device)]
    (. builder disassociateWirelessDevice data))
  (when-some [data (lookup-entry config id :firmware-update-image)]
    (. builder firmwareUpdateImage data))
  (when-some [data (lookup-entry config id :firmware-update-role)]
    (. builder firmwareUpdateRole data))
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-fuota-task-builder
  "Creates a  `CfnFuotaTask$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-fuota-task-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-fuota-task-builder> (CfnFuotaTask$Builder/create scope (name id)) id config))


(defn cfn-fuota-task-lo-ra-wan-property-builder>
  "The cfn-fuota-task-lo-ra-wan-property-builder> function updates a CfnFuotaTask$LoRaWANProperty$Builder instance using the provided configuration.
  The function takes the CfnFuotaTask$LoRaWANProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rfRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rf-region` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
"
  [^CfnFuotaTask$LoRaWANProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :rf-region)]
    (. builder rfRegion data))
  (when-some [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (.build builder))


(defn cfn-fuota-task-lo-ra-wan-property-builder
  "Creates a  `CfnFuotaTask$LoRaWANProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fuota-task-lo-ra-wan-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fuota-task-lo-ra-wan-property-builder> (new CfnFuotaTask$LoRaWANProperty$Builder) id config))


(defn cfn-fuota-task-props-builder>
  "The cfn-fuota-task-props-builder> function updates a CfnFuotaTaskProps$Builder instance using the provided configuration.
  The function takes the CfnFuotaTaskProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFuotaTaskProps$Builder builder id config]
  (when-some [data (lookup-entry config id :associate-multicast-group)]
    (. builder associateMulticastGroup data))
  (when-some [data (lookup-entry config id :associate-wireless-device)]
    (. builder associateWirelessDevice data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :disassociate-multicast-group)]
    (. builder disassociateMulticastGroup data))
  (when-some [data (lookup-entry config id :disassociate-wireless-device)]
    (. builder disassociateWirelessDevice data))
  (when-some [data (lookup-entry config id :firmware-update-image)]
    (. builder firmwareUpdateImage data))
  (when-some [data (lookup-entry config id :firmware-update-role)]
    (. builder firmwareUpdateRole data))
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-fuota-task-props-builder
  "Creates a  `CfnFuotaTaskProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-fuota-task-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-fuota-task-props-builder> (new CfnFuotaTaskProps$Builder) id config))


(defn cfn-multicast-group-builder>
  "The cfn-multicast-group-builder> function updates a CfnMulticastGroup$Builder instance using the provided configuration.
  The function takes the CfnMulticastGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:associate-wireless-device` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disassociateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:disassociate-wireless-device` |
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnMulticastGroup$LoRaWANProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMulticastGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :associate-wireless-device)]
    (. builder associateWirelessDevice data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :disassociate-wireless-device)]
    (. builder disassociateWirelessDevice data))
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-multicast-group-builder
  "Creates a  `CfnMulticastGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-multicast-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-multicast-group-builder> (CfnMulticastGroup$Builder/create scope (name id)) id config))


(defn cfn-multicast-group-lo-ra-wan-property-builder>
  "The cfn-multicast-group-lo-ra-wan-property-builder> function updates a CfnMulticastGroup$LoRaWANProperty$Builder instance using the provided configuration.
  The function takes the CfnMulticastGroup$LoRaWANProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dlClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:dl-class` |
| `numberOfDevicesInGroup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-devices-in-group` |
| `numberOfDevicesRequested` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-devices-requested` |
| `rfRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rf-region` |
"
  [^CfnMulticastGroup$LoRaWANProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dl-class)]
    (. builder dlClass data))
  (when-some [data (lookup-entry config id :number-of-devices-in-group)]
    (. builder numberOfDevicesInGroup data))
  (when-some [data (lookup-entry config id :number-of-devices-requested)]
    (. builder numberOfDevicesRequested data))
  (when-some [data (lookup-entry config id :rf-region)]
    (. builder rfRegion data))
  (.build builder))


(defn cfn-multicast-group-lo-ra-wan-property-builder
  "Creates a  `CfnMulticastGroup$LoRaWANProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-multicast-group-lo-ra-wan-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-multicast-group-lo-ra-wan-property-builder> (new CfnMulticastGroup$LoRaWANProperty$Builder) id config))


(defn cfn-multicast-group-props-builder>
  "The cfn-multicast-group-props-builder> function updates a CfnMulticastGroupProps$Builder instance using the provided configuration.
  The function takes the CfnMulticastGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:associate-wireless-device` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disassociateWirelessDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:disassociate-wireless-device` |
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnMulticastGroup$LoRaWANProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMulticastGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :associate-wireless-device)]
    (. builder associateWirelessDevice data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :disassociate-wireless-device)]
    (. builder disassociateWirelessDevice data))
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-multicast-group-props-builder
  "Creates a  `CfnMulticastGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-multicast-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-multicast-group-props-builder> (new CfnMulticastGroupProps$Builder) id config))


(defn cfn-network-analyzer-configuration-builder>
  "The cfn-network-analyzer-configuration-builder> function updates a CfnNetworkAnalyzerConfiguration$Builder instance using the provided configuration.
  The function takes the CfnNetworkAnalyzerConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `traceContent` | java.lang.Object | [[cdk.support/lookup-entry]] | `:trace-content` |
| `wirelessDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:wireless-devices` |
| `wirelessGateways` | java.util.List | [[cdk.support/lookup-entry]] | `:wireless-gateways` |
"
  [^CfnNetworkAnalyzerConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :trace-content)]
    (. builder traceContent data))
  (when-some [data (lookup-entry config id :wireless-devices)]
    (. builder wirelessDevices data))
  (when-some [data (lookup-entry config id :wireless-gateways)]
    (. builder wirelessGateways data))
  (.build builder))


(defn cfn-network-analyzer-configuration-builder
  "Creates a  `CfnNetworkAnalyzerConfiguration$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-network-analyzer-configuration-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-network-analyzer-configuration-builder> (CfnNetworkAnalyzerConfiguration$Builder/create scope (name id)) id config))


(defn cfn-network-analyzer-configuration-props-builder>
  "The cfn-network-analyzer-configuration-props-builder> function updates a CfnNetworkAnalyzerConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnNetworkAnalyzerConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `traceContent` | java.lang.Object | [[cdk.support/lookup-entry]] | `:trace-content` |
| `wirelessDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:wireless-devices` |
| `wirelessGateways` | java.util.List | [[cdk.support/lookup-entry]] | `:wireless-gateways` |
"
  [^CfnNetworkAnalyzerConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :trace-content)]
    (. builder traceContent data))
  (when-some [data (lookup-entry config id :wireless-devices)]
    (. builder wirelessDevices data))
  (when-some [data (lookup-entry config id :wireless-gateways)]
    (. builder wirelessGateways data))
  (.build builder))


(defn cfn-network-analyzer-configuration-props-builder
  "Creates a  `CfnNetworkAnalyzerConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-network-analyzer-configuration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-network-analyzer-configuration-props-builder> (new CfnNetworkAnalyzerConfigurationProps$Builder) id config))


(defn cfn-network-analyzer-configuration-trace-content-property-builder>
  "The cfn-network-analyzer-configuration-trace-content-property-builder> function updates a CfnNetworkAnalyzerConfiguration$TraceContentProperty$Builder instance using the provided configuration.
  The function takes the CfnNetworkAnalyzerConfiguration$TraceContentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `wirelessDeviceFrameInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:wireless-device-frame-info` |
"
  [^CfnNetworkAnalyzerConfiguration$TraceContentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-some [data (lookup-entry config id :wireless-device-frame-info)]
    (. builder wirelessDeviceFrameInfo data))
  (.build builder))


(defn cfn-network-analyzer-configuration-trace-content-property-builder
  "Creates a  `CfnNetworkAnalyzerConfiguration$TraceContentProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-network-analyzer-configuration-trace-content-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-network-analyzer-configuration-trace-content-property-builder> (new CfnNetworkAnalyzerConfiguration$TraceContentProperty$Builder) id config))


(defn cfn-partner-account-builder>
  "The cfn-partner-account-builder> function updates a CfnPartnerAccount$Builder instance using the provided configuration.
  The function takes the CfnPartnerAccount$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountLinked` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:account-linked` |
| `partnerAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-account-id` |
| `partnerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-type` |
| `sidewalk` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sidewalk` |
| `sidewalkResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sidewalk-response` |
| `sidewalkUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sidewalk-update` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPartnerAccount$Builder builder id config]
  (when-some [data (lookup-entry config id :account-linked)]
    (. builder accountLinked data))
  (when-some [data (lookup-entry config id :partner-account-id)]
    (. builder partnerAccountId data))
  (when-some [data (lookup-entry config id :partner-type)]
    (. builder partnerType data))
  (when-some [data (lookup-entry config id :sidewalk)]
    (. builder sidewalk data))
  (when-some [data (lookup-entry config id :sidewalk-response)]
    (. builder sidewalkResponse data))
  (when-some [data (lookup-entry config id :sidewalk-update)]
    (. builder sidewalkUpdate data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-partner-account-builder
  "Creates a  `CfnPartnerAccount$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-partner-account-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-partner-account-builder> (CfnPartnerAccount$Builder/create scope (name id)) id config))


(defn cfn-partner-account-props-builder>
  "The cfn-partner-account-props-builder> function updates a CfnPartnerAccountProps$Builder instance using the provided configuration.
  The function takes the CfnPartnerAccountProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountLinked` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:account-linked` |
| `partnerAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-account-id` |
| `partnerType` | java.lang.String | [[cdk.support/lookup-entry]] | `:partner-type` |
| `sidewalk` | software.amazon.awscdk.services.iotwireless.CfnPartnerAccount$SidewalkAccountInfoProperty | [[cdk.support/lookup-entry]] | `:sidewalk` |
| `sidewalkResponse` | software.amazon.awscdk.services.iotwireless.CfnPartnerAccount$SidewalkAccountInfoWithFingerprintProperty | [[cdk.support/lookup-entry]] | `:sidewalk-response` |
| `sidewalkUpdate` | software.amazon.awscdk.services.iotwireless.CfnPartnerAccount$SidewalkUpdateAccountProperty | [[cdk.support/lookup-entry]] | `:sidewalk-update` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPartnerAccountProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-linked)]
    (. builder accountLinked data))
  (when-some [data (lookup-entry config id :partner-account-id)]
    (. builder partnerAccountId data))
  (when-some [data (lookup-entry config id :partner-type)]
    (. builder partnerType data))
  (when-some [data (lookup-entry config id :sidewalk)]
    (. builder sidewalk data))
  (when-some [data (lookup-entry config id :sidewalk-response)]
    (. builder sidewalkResponse data))
  (when-some [data (lookup-entry config id :sidewalk-update)]
    (. builder sidewalkUpdate data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-partner-account-props-builder
  "Creates a  `CfnPartnerAccountProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-partner-account-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-partner-account-props-builder> (new CfnPartnerAccountProps$Builder) id config))


(defn cfn-partner-account-sidewalk-account-info-property-builder>
  "The cfn-partner-account-sidewalk-account-info-property-builder> function updates a CfnPartnerAccount$SidewalkAccountInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnPartnerAccount$SidewalkAccountInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appServerPrivateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-server-private-key` |
"
  [^CfnPartnerAccount$SidewalkAccountInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :app-server-private-key)]
    (. builder appServerPrivateKey data))
  (.build builder))


(defn cfn-partner-account-sidewalk-account-info-property-builder
  "Creates a  `CfnPartnerAccount$SidewalkAccountInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-partner-account-sidewalk-account-info-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-partner-account-sidewalk-account-info-property-builder> (new CfnPartnerAccount$SidewalkAccountInfoProperty$Builder) id config))


(defn cfn-partner-account-sidewalk-account-info-with-fingerprint-property-builder>
  "The cfn-partner-account-sidewalk-account-info-with-fingerprint-property-builder> function updates a CfnPartnerAccount$SidewalkAccountInfoWithFingerprintProperty$Builder instance using the provided configuration.
  The function takes the CfnPartnerAccount$SidewalkAccountInfoWithFingerprintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonId` | java.lang.String | [[cdk.support/lookup-entry]] | `:amazon-id` |
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `fingerprint` | java.lang.String | [[cdk.support/lookup-entry]] | `:fingerprint` |
"
  [^CfnPartnerAccount$SidewalkAccountInfoWithFingerprintProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :amazon-id)]
    (. builder amazonId data))
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :fingerprint)]
    (. builder fingerprint data))
  (.build builder))


(defn cfn-partner-account-sidewalk-account-info-with-fingerprint-property-builder
  "Creates a  `CfnPartnerAccount$SidewalkAccountInfoWithFingerprintProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-partner-account-sidewalk-account-info-with-fingerprint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-partner-account-sidewalk-account-info-with-fingerprint-property-builder> (new CfnPartnerAccount$SidewalkAccountInfoWithFingerprintProperty$Builder) id config))


(defn cfn-partner-account-sidewalk-update-account-property-builder>
  "The cfn-partner-account-sidewalk-update-account-property-builder> function updates a CfnPartnerAccount$SidewalkUpdateAccountProperty$Builder instance using the provided configuration.
  The function takes the CfnPartnerAccount$SidewalkUpdateAccountProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appServerPrivateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-server-private-key` |
"
  [^CfnPartnerAccount$SidewalkUpdateAccountProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :app-server-private-key)]
    (. builder appServerPrivateKey data))
  (.build builder))


(defn cfn-partner-account-sidewalk-update-account-property-builder
  "Creates a  `CfnPartnerAccount$SidewalkUpdateAccountProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-partner-account-sidewalk-update-account-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-partner-account-sidewalk-update-account-property-builder> (new CfnPartnerAccount$SidewalkUpdateAccountProperty$Builder) id config))


(defn cfn-service-profile-builder>
  "The cfn-service-profile-builder> function updates a CfnServiceProfile$Builder instance using the provided configuration.
  The function takes the CfnServiceProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnServiceProfile$LoRaWANServiceProfileProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServiceProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-profile-builder
  "Creates a  `CfnServiceProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-service-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-service-profile-builder> (CfnServiceProfile$Builder/create scope (name id)) id config))


(defn cfn-service-profile-lo-ra-wan-service-profile-property-builder>
  "The cfn-service-profile-lo-ra-wan-service-profile-property-builder> function updates a CfnServiceProfile$LoRaWANServiceProfileProperty$Builder instance using the provided configuration.
  The function takes the CfnServiceProfile$LoRaWANServiceProfileProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `ulRatePolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:ul-rate-policy` |
"
  [^CfnServiceProfile$LoRaWANServiceProfileProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :add-gw-metadata)]
    (. builder addGwMetadata data))
  (when-some [data (lookup-entry config id :channel-mask)]
    (. builder channelMask data))
  (when-some [data (lookup-entry config id :dev-status-req-freq)]
    (. builder devStatusReqFreq data))
  (when-some [data (lookup-entry config id :dl-bucket-size)]
    (. builder dlBucketSize data))
  (when-some [data (lookup-entry config id :dl-rate)]
    (. builder dlRate data))
  (when-some [data (lookup-entry config id :dl-rate-policy)]
    (. builder dlRatePolicy data))
  (when-some [data (lookup-entry config id :dr-max)]
    (. builder drMax data))
  (when-some [data (lookup-entry config id :dr-min)]
    (. builder drMin data))
  (when-some [data (lookup-entry config id :hr-allowed)]
    (. builder hrAllowed data))
  (when-some [data (lookup-entry config id :min-gw-diversity)]
    (. builder minGwDiversity data))
  (when-some [data (lookup-entry config id :nwk-geo-loc)]
    (. builder nwkGeoLoc data))
  (when-some [data (lookup-entry config id :pr-allowed)]
    (. builder prAllowed data))
  (when-some [data (lookup-entry config id :ra-allowed)]
    (. builder raAllowed data))
  (when-some [data (lookup-entry config id :report-dev-status-battery)]
    (. builder reportDevStatusBattery data))
  (when-some [data (lookup-entry config id :report-dev-status-margin)]
    (. builder reportDevStatusMargin data))
  (when-some [data (lookup-entry config id :target-per)]
    (. builder targetPer data))
  (when-some [data (lookup-entry config id :ul-bucket-size)]
    (. builder ulBucketSize data))
  (when-some [data (lookup-entry config id :ul-rate)]
    (. builder ulRate data))
  (when-some [data (lookup-entry config id :ul-rate-policy)]
    (. builder ulRatePolicy data))
  (.build builder))


(defn cfn-service-profile-lo-ra-wan-service-profile-property-builder
  "Creates a  `CfnServiceProfile$LoRaWANServiceProfileProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-profile-lo-ra-wan-service-profile-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-profile-lo-ra-wan-service-profile-property-builder> (new CfnServiceProfile$LoRaWANServiceProfileProperty$Builder) id config))


(defn cfn-service-profile-props-builder>
  "The cfn-service-profile-props-builder> function updates a CfnServiceProfileProps$Builder instance using the provided configuration.
  The function takes the CfnServiceProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnServiceProfile$LoRaWANServiceProfileProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServiceProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-profile-props-builder
  "Creates a  `CfnServiceProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-profile-props-builder> (new CfnServiceProfileProps$Builder) id config))


(defn cfn-task-definition-builder>
  "The cfn-task-definition-builder> function updates a CfnTaskDefinition$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoCreateTasks` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-create-tasks` |
| `loRaWanUpdateGatewayTaskEntry` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan-update-gateway-task-entry` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskDefinitionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-type` |
| `update` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:update` |
"
  [^CfnTaskDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-create-tasks)]
    (. builder autoCreateTasks data))
  (when-some [data (lookup-entry config id :lo-ra-wan-update-gateway-task-entry)]
    (. builder loRaWanUpdateGatewayTaskEntry data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-definition-type)]
    (. builder taskDefinitionType data))
  (when-some [data (lookup-entry config id :update)]
    (. builder update data))
  (.build builder))


(defn cfn-task-definition-builder
  "Creates a  `CfnTaskDefinition$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-task-definition-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-task-definition-builder> (CfnTaskDefinition$Builder/create scope (name id)) id config))


(defn cfn-task-definition-lo-ra-wan-gateway-version-property-builder>
  "The cfn-task-definition-lo-ra-wan-gateway-version-property-builder> function updates a CfnTaskDefinition$LoRaWANGatewayVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$LoRaWANGatewayVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `model` | java.lang.String | [[cdk.support/lookup-entry]] | `:model` |
| `packageVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-version` |
| `station` | java.lang.String | [[cdk.support/lookup-entry]] | `:station` |
"
  [^CfnTaskDefinition$LoRaWANGatewayVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :model)]
    (. builder model data))
  (when-some [data (lookup-entry config id :package-version)]
    (. builder packageVersion data))
  (when-some [data (lookup-entry config id :station)]
    (. builder station data))
  (.build builder))


(defn cfn-task-definition-lo-ra-wan-gateway-version-property-builder
  "Creates a  `CfnTaskDefinition$LoRaWANGatewayVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-definition-lo-ra-wan-gateway-version-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-definition-lo-ra-wan-gateway-version-property-builder> (new CfnTaskDefinition$LoRaWANGatewayVersionProperty$Builder) id config))


(defn cfn-task-definition-lo-ra-wan-update-gateway-task-create-property-builder>
  "The cfn-task-definition-lo-ra-wan-update-gateway-task-create-property-builder> function updates a CfnTaskDefinition$LoRaWANUpdateGatewayTaskCreateProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$LoRaWANUpdateGatewayTaskCreateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersion` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANGatewayVersionProperty | [[cdk.support/lookup-entry]] | `:current-version` |
| `sigKeyCrc` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sig-key-crc` |
| `updateSignature` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-signature` |
| `updateVersion` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANGatewayVersionProperty | [[cdk.support/lookup-entry]] | `:update-version` |
"
  [^CfnTaskDefinition$LoRaWANUpdateGatewayTaskCreateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :current-version)]
    (. builder currentVersion data))
  (when-some [data (lookup-entry config id :sig-key-crc)]
    (. builder sigKeyCrc data))
  (when-some [data (lookup-entry config id :update-signature)]
    (. builder updateSignature data))
  (when-some [data (lookup-entry config id :update-version)]
    (. builder updateVersion data))
  (.build builder))


(defn cfn-task-definition-lo-ra-wan-update-gateway-task-create-property-builder
  "Creates a  `CfnTaskDefinition$LoRaWANUpdateGatewayTaskCreateProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-definition-lo-ra-wan-update-gateway-task-create-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-definition-lo-ra-wan-update-gateway-task-create-property-builder> (new CfnTaskDefinition$LoRaWANUpdateGatewayTaskCreateProperty$Builder) id config))


(defn cfn-task-definition-lo-ra-wan-update-gateway-task-entry-property-builder>
  "The cfn-task-definition-lo-ra-wan-update-gateway-task-entry-property-builder> function updates a CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentVersion` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANGatewayVersionProperty | [[cdk.support/lookup-entry]] | `:current-version` |
| `updateVersion` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANGatewayVersionProperty | [[cdk.support/lookup-entry]] | `:update-version` |
"
  [^CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :current-version)]
    (. builder currentVersion data))
  (when-some [data (lookup-entry config id :update-version)]
    (. builder updateVersion data))
  (.build builder))


(defn cfn-task-definition-lo-ra-wan-update-gateway-task-entry-property-builder
  "Creates a  `CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-definition-lo-ra-wan-update-gateway-task-entry-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-definition-lo-ra-wan-update-gateway-task-entry-property-builder> (new CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty$Builder) id config))


(defn cfn-task-definition-props-builder>
  "The cfn-task-definition-props-builder> function updates a CfnTaskDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoCreateTasks` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-create-tasks` |
| `loRaWanUpdateGatewayTaskEntry` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANUpdateGatewayTaskEntryProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan-update-gateway-task-entry` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskDefinitionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-definition-type` |
| `update` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:update` |
"
  [^CfnTaskDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-create-tasks)]
    (. builder autoCreateTasks data))
  (when-some [data (lookup-entry config id :lo-ra-wan-update-gateway-task-entry)]
    (. builder loRaWanUpdateGatewayTaskEntry data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-definition-type)]
    (. builder taskDefinitionType data))
  (when-some [data (lookup-entry config id :update)]
    (. builder update data))
  (.build builder))


(defn cfn-task-definition-props-builder
  "Creates a  `CfnTaskDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-definition-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-definition-props-builder> (new CfnTaskDefinitionProps$Builder) id config))


(defn cfn-task-definition-update-wireless-gateway-task-create-property-builder>
  "The cfn-task-definition-update-wireless-gateway-task-create-property-builder> function updates a CfnTaskDefinition$UpdateWirelessGatewayTaskCreateProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskDefinition$UpdateWirelessGatewayTaskCreateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loRaWan` | software.amazon.awscdk.services.iotwireless.CfnTaskDefinition$LoRaWANUpdateGatewayTaskCreateProperty | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `updateDataRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-data-role` |
| `updateDataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-data-source` |
"
  [^CfnTaskDefinition$UpdateWirelessGatewayTaskCreateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :update-data-role)]
    (. builder updateDataRole data))
  (when-some [data (lookup-entry config id :update-data-source)]
    (. builder updateDataSource data))
  (.build builder))


(defn cfn-task-definition-update-wireless-gateway-task-create-property-builder
  "Creates a  `CfnTaskDefinition$UpdateWirelessGatewayTaskCreateProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-definition-update-wireless-gateway-task-create-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-definition-update-wireless-gateway-task-create-property-builder> (new CfnTaskDefinition$UpdateWirelessGatewayTaskCreateProperty$Builder) id config))


(defn cfn-wireless-device-abp-v10x-property-builder>
  "The cfn-wireless-device-abp-v10x-property-builder> function updates a CfnWirelessDevice$AbpV10xProperty$Builder instance using the provided configuration.
  The function takes the CfnWirelessDevice$AbpV10xProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devAddr` | java.lang.String | [[cdk.support/lookup-entry]] | `:dev-addr` |
| `sessionKeys` | software.amazon.awscdk.services.iotwireless.CfnWirelessDevice$SessionKeysAbpV10xProperty | [[cdk.support/lookup-entry]] | `:session-keys` |
"
  [^CfnWirelessDevice$AbpV10xProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dev-addr)]
    (. builder devAddr data))
  (when-some [data (lookup-entry config id :session-keys)]
    (. builder sessionKeys data))
  (.build builder))


(defn cfn-wireless-device-abp-v10x-property-builder
  "Creates a  `CfnWirelessDevice$AbpV10xProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-device-abp-v10x-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-device-abp-v10x-property-builder> (new CfnWirelessDevice$AbpV10xProperty$Builder) id config))


(defn cfn-wireless-device-abp-v11-property-builder>
  "The cfn-wireless-device-abp-v11-property-builder> function updates a CfnWirelessDevice$AbpV11Property$Builder instance using the provided configuration.
  The function takes the CfnWirelessDevice$AbpV11Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `devAddr` | java.lang.String | [[cdk.support/lookup-entry]] | `:dev-addr` |
| `sessionKeys` | software.amazon.awscdk.services.iotwireless.CfnWirelessDevice$SessionKeysAbpV11Property | [[cdk.support/lookup-entry]] | `:session-keys` |
"
  [^CfnWirelessDevice$AbpV11Property$Builder builder id config]
  (when-some [data (lookup-entry config id :dev-addr)]
    (. builder devAddr data))
  (when-some [data (lookup-entry config id :session-keys)]
    (. builder sessionKeys data))
  (.build builder))


(defn cfn-wireless-device-abp-v11-property-builder
  "Creates a  `CfnWirelessDevice$AbpV11Property$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-device-abp-v11-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-device-abp-v11-property-builder> (new CfnWirelessDevice$AbpV11Property$Builder) id config))


(defn cfn-wireless-device-builder>
  "The cfn-wireless-device-builder> function updates a CfnWirelessDevice$Builder instance using the provided configuration.
  The function takes the CfnWirelessDevice$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnWirelessDevice$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :destination-name)]
    (. builder destinationName data))
  (when-some [data (lookup-entry config id :last-uplink-received-at)]
    (. builder lastUplinkReceivedAt data))
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :positioning)]
    (. builder positioning data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thing-arn)]
    (. builder thingArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-wireless-device-builder
  "Creates a  `CfnWirelessDevice$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-wireless-device-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-wireless-device-builder> (CfnWirelessDevice$Builder/create scope (name id)) id config))


(defn cfn-wireless-device-import-task-builder>
  "The cfn-wireless-device-import-task-builder> function updates a CfnWirelessDeviceImportTask$Builder instance using the provided configuration.
  The function takes the CfnWirelessDeviceImportTask$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `sidewalk` | software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask$SidewalkProperty | [[cdk.support/lookup-entry]] | `:sidewalk` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWirelessDeviceImportTask$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-name)]
    (. builder destinationName data))
  (when-some [data (lookup-entry config id :sidewalk)]
    (. builder sidewalk data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-wireless-device-import-task-builder
  "Creates a  `CfnWirelessDeviceImportTask$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-wireless-device-import-task-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-wireless-device-import-task-builder> (CfnWirelessDeviceImportTask$Builder/create scope (name id)) id config))


(defn cfn-wireless-device-import-task-props-builder>
  "The cfn-wireless-device-import-task-props-builder> function updates a CfnWirelessDeviceImportTaskProps$Builder instance using the provided configuration.
  The function takes the CfnWirelessDeviceImportTaskProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-name` |
| `sidewalk` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sidewalk` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnWirelessDeviceImportTaskProps$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-name)]
    (. builder destinationName data))
  (when-some [data (lookup-entry config id :sidewalk)]
    (. builder sidewalk data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-wireless-device-import-task-props-builder
  "Creates a  `CfnWirelessDeviceImportTaskProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-device-import-task-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-device-import-task-props-builder> (new CfnWirelessDeviceImportTaskProps$Builder) id config))


(defn cfn-wireless-device-import-task-sidewalk-property-builder>
  "The cfn-wireless-device-import-task-sidewalk-property-builder> function updates a CfnWirelessDeviceImportTask$SidewalkProperty$Builder instance using the provided configuration.
  The function takes the CfnWirelessDeviceImportTask$SidewalkProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceCreationFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-creation-file` |
| `deviceCreationFileList` | java.util.List | [[cdk.support/lookup-entry]] | `:device-creation-file-list` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `sidewalkManufacturingSn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sidewalk-manufacturing-sn` |
"
  [^CfnWirelessDeviceImportTask$SidewalkProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :device-creation-file)]
    (. builder deviceCreationFile data))
  (when-some [data (lookup-entry config id :device-creation-file-list)]
    (. builder deviceCreationFileList data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :sidewalk-manufacturing-sn)]
    (. builder sidewalkManufacturingSn data))
  (.build builder))


(defn cfn-wireless-device-import-task-sidewalk-property-builder
  "Creates a  `CfnWirelessDeviceImportTask$SidewalkProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-device-import-task-sidewalk-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-device-import-task-sidewalk-property-builder> (new CfnWirelessDeviceImportTask$SidewalkProperty$Builder) id config))


(defn cfn-wireless-device-lo-ra-wan-device-property-builder>
  "The cfn-wireless-device-lo-ra-wan-device-property-builder> function updates a CfnWirelessDevice$LoRaWANDeviceProperty$Builder instance using the provided configuration.
  The function takes the CfnWirelessDevice$LoRaWANDeviceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `abpV10X` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:abp-v10-x` |
| `abpV11` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:abp-v11` |
| `devEui` | java.lang.String | [[cdk.support/lookup-entry]] | `:dev-eui` |
| `deviceProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-profile-id` |
| `otaaV10X` | software.amazon.awscdk.services.iotwireless.CfnWirelessDevice$OtaaV10xProperty | [[cdk.support/lookup-entry]] | `:otaa-v10-x` |
| `otaaV11` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:otaa-v11` |
| `serviceProfileId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-profile-id` |
"
  [^CfnWirelessDevice$LoRaWANDeviceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :abp-v10-x)]
    (. builder abpV10X data))
  (when-some [data (lookup-entry config id :abp-v11)]
    (. builder abpV11 data))
  (when-some [data (lookup-entry config id :dev-eui)]
    (. builder devEui data))
  (when-some [data (lookup-entry config id :device-profile-id)]
    (. builder deviceProfileId data))
  (when-some [data (lookup-entry config id :otaa-v10-x)]
    (. builder otaaV10X data))
  (when-some [data (lookup-entry config id :otaa-v11)]
    (. builder otaaV11 data))
  (when-some [data (lookup-entry config id :service-profile-id)]
    (. builder serviceProfileId data))
  (.build builder))


(defn cfn-wireless-device-lo-ra-wan-device-property-builder
  "Creates a  `CfnWirelessDevice$LoRaWANDeviceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-device-lo-ra-wan-device-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-device-lo-ra-wan-device-property-builder> (new CfnWirelessDevice$LoRaWANDeviceProperty$Builder) id config))


(defn cfn-wireless-device-otaa-v10x-property-builder>
  "The cfn-wireless-device-otaa-v10x-property-builder> function updates a CfnWirelessDevice$OtaaV10xProperty$Builder instance using the provided configuration.
  The function takes the CfnWirelessDevice$OtaaV10xProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appEui` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-eui` |
| `appKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-key` |
"
  [^CfnWirelessDevice$OtaaV10xProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :app-eui)]
    (. builder appEui data))
  (when-some [data (lookup-entry config id :app-key)]
    (. builder appKey data))
  (.build builder))


(defn cfn-wireless-device-otaa-v10x-property-builder
  "Creates a  `CfnWirelessDevice$OtaaV10xProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-device-otaa-v10x-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-device-otaa-v10x-property-builder> (new CfnWirelessDevice$OtaaV10xProperty$Builder) id config))


(defn cfn-wireless-device-otaa-v11-property-builder>
  "The cfn-wireless-device-otaa-v11-property-builder> function updates a CfnWirelessDevice$OtaaV11Property$Builder instance using the provided configuration.
  The function takes the CfnWirelessDevice$OtaaV11Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-key` |
| `joinEui` | java.lang.String | [[cdk.support/lookup-entry]] | `:join-eui` |
| `nwkKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:nwk-key` |
"
  [^CfnWirelessDevice$OtaaV11Property$Builder builder id config]
  (when-some [data (lookup-entry config id :app-key)]
    (. builder appKey data))
  (when-some [data (lookup-entry config id :join-eui)]
    (. builder joinEui data))
  (when-some [data (lookup-entry config id :nwk-key)]
    (. builder nwkKey data))
  (.build builder))


(defn cfn-wireless-device-otaa-v11-property-builder
  "Creates a  `CfnWirelessDevice$OtaaV11Property$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-device-otaa-v11-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-device-otaa-v11-property-builder> (new CfnWirelessDevice$OtaaV11Property$Builder) id config))


(defn cfn-wireless-device-props-builder>
  "The cfn-wireless-device-props-builder> function updates a CfnWirelessDeviceProps$Builder instance using the provided configuration.
  The function takes the CfnWirelessDeviceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnWirelessDeviceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :destination-name)]
    (. builder destinationName data))
  (when-some [data (lookup-entry config id :last-uplink-received-at)]
    (. builder lastUplinkReceivedAt data))
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :positioning)]
    (. builder positioning data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thing-arn)]
    (. builder thingArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-wireless-device-props-builder
  "Creates a  `CfnWirelessDeviceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-device-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-device-props-builder> (new CfnWirelessDeviceProps$Builder) id config))


(defn cfn-wireless-device-session-keys-abp-v10x-property-builder>
  "The cfn-wireless-device-session-keys-abp-v10x-property-builder> function updates a CfnWirelessDevice$SessionKeysAbpV10xProperty$Builder instance using the provided configuration.
  The function takes the CfnWirelessDevice$SessionKeysAbpV10xProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appSKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-s-key` |
| `nwkSKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:nwk-s-key` |
"
  [^CfnWirelessDevice$SessionKeysAbpV10xProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :app-s-key)]
    (. builder appSKey data))
  (when-some [data (lookup-entry config id :nwk-s-key)]
    (. builder nwkSKey data))
  (.build builder))


(defn cfn-wireless-device-session-keys-abp-v10x-property-builder
  "Creates a  `CfnWirelessDevice$SessionKeysAbpV10xProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-device-session-keys-abp-v10x-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-device-session-keys-abp-v10x-property-builder> (new CfnWirelessDevice$SessionKeysAbpV10xProperty$Builder) id config))


(defn cfn-wireless-device-session-keys-abp-v11-property-builder>
  "The cfn-wireless-device-session-keys-abp-v11-property-builder> function updates a CfnWirelessDevice$SessionKeysAbpV11Property$Builder instance using the provided configuration.
  The function takes the CfnWirelessDevice$SessionKeysAbpV11Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appSKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-s-key` |
| `fNwkSIntKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:f-nwk-s-int-key` |
| `nwkSEncKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:nwk-s-enc-key` |
| `sNwkSIntKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:s-nwk-s-int-key` |
"
  [^CfnWirelessDevice$SessionKeysAbpV11Property$Builder builder id config]
  (when-some [data (lookup-entry config id :app-s-key)]
    (. builder appSKey data))
  (when-some [data (lookup-entry config id :f-nwk-s-int-key)]
    (. builder fNwkSIntKey data))
  (when-some [data (lookup-entry config id :nwk-s-enc-key)]
    (. builder nwkSEncKey data))
  (when-some [data (lookup-entry config id :s-nwk-s-int-key)]
    (. builder sNwkSIntKey data))
  (.build builder))


(defn cfn-wireless-device-session-keys-abp-v11-property-builder
  "Creates a  `CfnWirelessDevice$SessionKeysAbpV11Property$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-device-session-keys-abp-v11-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-device-session-keys-abp-v11-property-builder> (new CfnWirelessDevice$SessionKeysAbpV11Property$Builder) id config))


(defn cfn-wireless-gateway-builder>
  "The cfn-wireless-gateway-builder> function updates a CfnWirelessGateway$Builder instance using the provided configuration.
  The function takes the CfnWirelessGateway$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lastUplinkReceivedAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-uplink-received-at` |
| `loRaWan` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnWirelessGateway$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :last-uplink-received-at)]
    (. builder lastUplinkReceivedAt data))
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thing-arn)]
    (. builder thingArn data))
  (when-some [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn cfn-wireless-gateway-builder
  "Creates a  `CfnWirelessGateway$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-wireless-gateway-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-wireless-gateway-builder> (CfnWirelessGateway$Builder/create scope (name id)) id config))


(defn cfn-wireless-gateway-lo-ra-wan-gateway-property-builder>
  "The cfn-wireless-gateway-lo-ra-wan-gateway-property-builder> function updates a CfnWirelessGateway$LoRaWANGatewayProperty$Builder instance using the provided configuration.
  The function takes the CfnWirelessGateway$LoRaWANGatewayProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayEui` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-eui` |
| `rfRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rf-region` |
"
  [^CfnWirelessGateway$LoRaWANGatewayProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :gateway-eui)]
    (. builder gatewayEui data))
  (when-some [data (lookup-entry config id :rf-region)]
    (. builder rfRegion data))
  (.build builder))


(defn cfn-wireless-gateway-lo-ra-wan-gateway-property-builder
  "Creates a  `CfnWirelessGateway$LoRaWANGatewayProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-gateway-lo-ra-wan-gateway-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-gateway-lo-ra-wan-gateway-property-builder> (new CfnWirelessGateway$LoRaWANGatewayProperty$Builder) id config))


(defn cfn-wireless-gateway-props-builder>
  "The cfn-wireless-gateway-props-builder> function updates a CfnWirelessGatewayProps$Builder instance using the provided configuration.
  The function takes the CfnWirelessGatewayProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `lastUplinkReceivedAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-uplink-received-at` |
| `loRaWan` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lo-ra-wan` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-arn` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnWirelessGatewayProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :last-uplink-received-at)]
    (. builder lastUplinkReceivedAt data))
  (when-some [data (lookup-entry config id :lo-ra-wan)]
    (. builder loRaWan data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thing-arn)]
    (. builder thingArn data))
  (when-some [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn cfn-wireless-gateway-props-builder
  "Creates a  `CfnWirelessGatewayProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-wireless-gateway-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-wireless-gateway-props-builder> (new CfnWirelessGatewayProps$Builder) id config))