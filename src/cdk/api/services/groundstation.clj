(ns cdk.api.services.groundstation
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.groundstation package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.groundstation CfnConfig$AntennaDownlinkConfigProperty$Builder
                                                          CfnConfig$AntennaDownlinkDemodDecodeConfigProperty$Builder
                                                          CfnConfig$AntennaUplinkConfigProperty$Builder
                                                          CfnConfig$Builder
                                                          CfnConfig$ConfigDataProperty$Builder
                                                          CfnConfig$DataflowEndpointConfigProperty$Builder
                                                          CfnConfig$DecodeConfigProperty$Builder
                                                          CfnConfig$DemodulationConfigProperty$Builder
                                                          CfnConfig$EirpProperty$Builder
                                                          CfnConfig$FrequencyBandwidthProperty$Builder
                                                          CfnConfig$FrequencyProperty$Builder
                                                          CfnConfig$S3RecordingConfigProperty$Builder
                                                          CfnConfig$SpectrumConfigProperty$Builder
                                                          CfnConfig$TrackingConfigProperty$Builder
                                                          CfnConfig$UplinkEchoConfigProperty$Builder
                                                          CfnConfig$UplinkSpectrumConfigProperty$Builder
                                                          CfnConfigProps$Builder
                                                          CfnDataflowEndpointGroup$AwsGroundStationAgentEndpointProperty$Builder
                                                          CfnDataflowEndpointGroup$Builder
                                                          CfnDataflowEndpointGroup$ConnectionDetailsProperty$Builder
                                                          CfnDataflowEndpointGroup$DataflowEndpointProperty$Builder
                                                          CfnDataflowEndpointGroup$EndpointDetailsProperty$Builder
                                                          CfnDataflowEndpointGroup$IntegerRangeProperty$Builder
                                                          CfnDataflowEndpointGroup$RangedConnectionDetailsProperty$Builder
                                                          CfnDataflowEndpointGroup$RangedSocketAddressProperty$Builder
                                                          CfnDataflowEndpointGroup$SecurityDetailsProperty$Builder
                                                          CfnDataflowEndpointGroup$SocketAddressProperty$Builder
                                                          CfnDataflowEndpointGroupProps$Builder
                                                          CfnMissionProfile$Builder
                                                          CfnMissionProfile$DataflowEdgeProperty$Builder
                                                          CfnMissionProfile$StreamsKmsKeyProperty$Builder
                                                          CfnMissionProfileProps$Builder]))


(defn build-cfn-config-antenna-downlink-config-property-builder
  "The build-cfn-config-antenna-downlink-config-property-builder function updates a CfnConfig$AntennaDownlinkConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$AntennaDownlinkConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spectrumConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spectrum-config` |
"
  [^CfnConfig$AntennaDownlinkConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :spectrum-config)]
    (. builder spectrumConfig data))
  (.build builder))


(defn cfn-config-antenna-downlink-config-property-builder
  "Creates a  `CfnConfig$AntennaDownlinkConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-antenna-downlink-config-property-builder (new CfnConfig$AntennaDownlinkConfigProperty$Builder) id config))


(defn build-cfn-config-antenna-downlink-demod-decode-config-property-builder
  "The build-cfn-config-antenna-downlink-demod-decode-config-property-builder function updates a CfnConfig$AntennaDownlinkDemodDecodeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$AntennaDownlinkDemodDecodeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `decodeConfig` | software.amazon.awscdk.services.groundstation.CfnConfig$DecodeConfigProperty | [[cdk.support/lookup-entry]] | `:decode-config` |
| `demodulationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:demodulation-config` |
| `spectrumConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spectrum-config` |
"
  [^CfnConfig$AntennaDownlinkDemodDecodeConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :decode-config)]
    (. builder decodeConfig data))
  (when-some [data (lookup-entry config id :demodulation-config)]
    (. builder demodulationConfig data))
  (when-some [data (lookup-entry config id :spectrum-config)]
    (. builder spectrumConfig data))
  (.build builder))


(defn cfn-config-antenna-downlink-demod-decode-config-property-builder
  "Creates a  `CfnConfig$AntennaDownlinkDemodDecodeConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-antenna-downlink-demod-decode-config-property-builder (new CfnConfig$AntennaDownlinkDemodDecodeConfigProperty$Builder) id config))


(defn build-cfn-config-antenna-uplink-config-property-builder
  "The build-cfn-config-antenna-uplink-config-property-builder function updates a CfnConfig$AntennaUplinkConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$AntennaUplinkConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spectrumConfig` | software.amazon.awscdk.services.groundstation.CfnConfig$UplinkSpectrumConfigProperty | [[cdk.support/lookup-entry]] | `:spectrum-config` |
| `targetEirp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-eirp` |
| `transmitDisabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transmit-disabled` |
"
  [^CfnConfig$AntennaUplinkConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :spectrum-config)]
    (. builder spectrumConfig data))
  (when-some [data (lookup-entry config id :target-eirp)]
    (. builder targetEirp data))
  (when-some [data (lookup-entry config id :transmit-disabled)]
    (. builder transmitDisabled data))
  (.build builder))


(defn cfn-config-antenna-uplink-config-property-builder
  "Creates a  `CfnConfig$AntennaUplinkConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-antenna-uplink-config-property-builder (new CfnConfig$AntennaUplinkConfigProperty$Builder) id config))


(defn build-cfn-config-builder
  "The build-cfn-config-builder function updates a CfnConfig$Builder instance using the provided configuration.
  The function takes the CfnConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configData` | software.amazon.awscdk.services.groundstation.CfnConfig$ConfigDataProperty | [[cdk.support/lookup-entry]] | `:config-data` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :config-data)]
    (. builder configData data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-config-builder
  "Creates a  `CfnConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-config-builder (CfnConfig$Builder/create scope (name id)) id config))


(defn build-cfn-config-config-data-property-builder
  "The build-cfn-config-config-data-property-builder function updates a CfnConfig$ConfigDataProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$ConfigDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `antennaDownlinkConfig` | software.amazon.awscdk.services.groundstation.CfnConfig$AntennaDownlinkConfigProperty | [[cdk.support/lookup-entry]] | `:antenna-downlink-config` |
| `antennaDownlinkDemodDecodeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:antenna-downlink-demod-decode-config` |
| `antennaUplinkConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:antenna-uplink-config` |
| `dataflowEndpointConfig` | software.amazon.awscdk.services.groundstation.CfnConfig$DataflowEndpointConfigProperty | [[cdk.support/lookup-entry]] | `:dataflow-endpoint-config` |
| `s3RecordingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-recording-config` |
| `trackingConfig` | software.amazon.awscdk.services.groundstation.CfnConfig$TrackingConfigProperty | [[cdk.support/lookup-entry]] | `:tracking-config` |
| `uplinkEchoConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:uplink-echo-config` |
"
  [^CfnConfig$ConfigDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :antenna-downlink-config)]
    (. builder antennaDownlinkConfig data))
  (when-some [data (lookup-entry config id :antenna-downlink-demod-decode-config)]
    (. builder antennaDownlinkDemodDecodeConfig data))
  (when-some [data (lookup-entry config id :antenna-uplink-config)]
    (. builder antennaUplinkConfig data))
  (when-some [data (lookup-entry config id :dataflow-endpoint-config)]
    (. builder dataflowEndpointConfig data))
  (when-some [data (lookup-entry config id :s3-recording-config)]
    (. builder s3RecordingConfig data))
  (when-some [data (lookup-entry config id :tracking-config)]
    (. builder trackingConfig data))
  (when-some [data (lookup-entry config id :uplink-echo-config)]
    (. builder uplinkEchoConfig data))
  (.build builder))


(defn cfn-config-config-data-property-builder
  "Creates a  `CfnConfig$ConfigDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-config-data-property-builder (new CfnConfig$ConfigDataProperty$Builder) id config))


(defn build-cfn-config-dataflow-endpoint-config-property-builder
  "The build-cfn-config-dataflow-endpoint-config-property-builder function updates a CfnConfig$DataflowEndpointConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$DataflowEndpointConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataflowEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataflow-endpoint-name` |
| `dataflowEndpointRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataflow-endpoint-region` |
"
  [^CfnConfig$DataflowEndpointConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dataflow-endpoint-name)]
    (. builder dataflowEndpointName data))
  (when-some [data (lookup-entry config id :dataflow-endpoint-region)]
    (. builder dataflowEndpointRegion data))
  (.build builder))


(defn cfn-config-dataflow-endpoint-config-property-builder
  "Creates a  `CfnConfig$DataflowEndpointConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-dataflow-endpoint-config-property-builder (new CfnConfig$DataflowEndpointConfigProperty$Builder) id config))


(defn build-cfn-config-decode-config-property-builder
  "The build-cfn-config-decode-config-property-builder function updates a CfnConfig$DecodeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$DecodeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unvalidatedJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:unvalidated-json` |
"
  [^CfnConfig$DecodeConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :unvalidated-json)]
    (. builder unvalidatedJson data))
  (.build builder))


(defn cfn-config-decode-config-property-builder
  "Creates a  `CfnConfig$DecodeConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-decode-config-property-builder (new CfnConfig$DecodeConfigProperty$Builder) id config))


(defn build-cfn-config-demodulation-config-property-builder
  "The build-cfn-config-demodulation-config-property-builder function updates a CfnConfig$DemodulationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$DemodulationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unvalidatedJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:unvalidated-json` |
"
  [^CfnConfig$DemodulationConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :unvalidated-json)]
    (. builder unvalidatedJson data))
  (.build builder))


(defn cfn-config-demodulation-config-property-builder
  "Creates a  `CfnConfig$DemodulationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-demodulation-config-property-builder (new CfnConfig$DemodulationConfigProperty$Builder) id config))


(defn build-cfn-config-eirp-property-builder
  "The build-cfn-config-eirp-property-builder function updates a CfnConfig$EirpProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$EirpProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `units` | java.lang.String | [[cdk.support/lookup-entry]] | `:units` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnConfig$EirpProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :units)]
    (. builder units data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-config-eirp-property-builder
  "Creates a  `CfnConfig$EirpProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-eirp-property-builder (new CfnConfig$EirpProperty$Builder) id config))


(defn build-cfn-config-frequency-bandwidth-property-builder
  "The build-cfn-config-frequency-bandwidth-property-builder function updates a CfnConfig$FrequencyBandwidthProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$FrequencyBandwidthProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `units` | java.lang.String | [[cdk.support/lookup-entry]] | `:units` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnConfig$FrequencyBandwidthProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :units)]
    (. builder units data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-config-frequency-bandwidth-property-builder
  "Creates a  `CfnConfig$FrequencyBandwidthProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-frequency-bandwidth-property-builder (new CfnConfig$FrequencyBandwidthProperty$Builder) id config))


(defn build-cfn-config-frequency-property-builder
  "The build-cfn-config-frequency-property-builder function updates a CfnConfig$FrequencyProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$FrequencyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `units` | java.lang.String | [[cdk.support/lookup-entry]] | `:units` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnConfig$FrequencyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :units)]
    (. builder units data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-config-frequency-property-builder
  "Creates a  `CfnConfig$FrequencyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-frequency-property-builder (new CfnConfig$FrequencyProperty$Builder) id config))


(defn build-cfn-config-props-builder
  "The build-cfn-config-props-builder function updates a CfnConfigProps$Builder instance using the provided configuration.
  The function takes the CfnConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config-data` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :config-data)]
    (. builder configData data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-config-props-builder
  "Creates a  `CfnConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-props-builder (new CfnConfigProps$Builder) id config))


(defn build-cfn-config-s3-recording-config-property-builder
  "The build-cfn-config-s3-recording-config-property-builder function updates a CfnConfig$S3RecordingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$S3RecordingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnConfig$S3RecordingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-arn)]
    (. builder bucketArn data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-config-s3-recording-config-property-builder
  "Creates a  `CfnConfig$S3RecordingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-s3-recording-config-property-builder (new CfnConfig$S3RecordingConfigProperty$Builder) id config))


(defn build-cfn-config-spectrum-config-property-builder
  "The build-cfn-config-spectrum-config-property-builder function updates a CfnConfig$SpectrumConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$SpectrumConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bandwidth` | software.amazon.awscdk.services.groundstation.CfnConfig$FrequencyBandwidthProperty | [[cdk.support/lookup-entry]] | `:bandwidth` |
| `centerFrequency` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:center-frequency` |
| `polarization` | java.lang.String | [[cdk.support/lookup-entry]] | `:polarization` |
"
  [^CfnConfig$SpectrumConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bandwidth)]
    (. builder bandwidth data))
  (when-some [data (lookup-entry config id :center-frequency)]
    (. builder centerFrequency data))
  (when-some [data (lookup-entry config id :polarization)]
    (. builder polarization data))
  (.build builder))


(defn cfn-config-spectrum-config-property-builder
  "Creates a  `CfnConfig$SpectrumConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-spectrum-config-property-builder (new CfnConfig$SpectrumConfigProperty$Builder) id config))


(defn build-cfn-config-tracking-config-property-builder
  "The build-cfn-config-tracking-config-property-builder function updates a CfnConfig$TrackingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$TrackingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autotrack` | java.lang.String | [[cdk.support/lookup-entry]] | `:autotrack` |
"
  [^CfnConfig$TrackingConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :autotrack)]
    (. builder autotrack data))
  (.build builder))


(defn cfn-config-tracking-config-property-builder
  "Creates a  `CfnConfig$TrackingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-tracking-config-property-builder (new CfnConfig$TrackingConfigProperty$Builder) id config))


(defn build-cfn-config-uplink-echo-config-property-builder
  "The build-cfn-config-uplink-echo-config-property-builder function updates a CfnConfig$UplinkEchoConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$UplinkEchoConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `antennaUplinkConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:antenna-uplink-config-arn` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnConfig$UplinkEchoConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :antenna-uplink-config-arn)]
    (. builder antennaUplinkConfigArn data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-config-uplink-echo-config-property-builder
  "Creates a  `CfnConfig$UplinkEchoConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-uplink-echo-config-property-builder (new CfnConfig$UplinkEchoConfigProperty$Builder) id config))


(defn build-cfn-config-uplink-spectrum-config-property-builder
  "The build-cfn-config-uplink-spectrum-config-property-builder function updates a CfnConfig$UplinkSpectrumConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnConfig$UplinkSpectrumConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `centerFrequency` | software.amazon.awscdk.services.groundstation.CfnConfig$FrequencyProperty | [[cdk.support/lookup-entry]] | `:center-frequency` |
| `polarization` | java.lang.String | [[cdk.support/lookup-entry]] | `:polarization` |
"
  [^CfnConfig$UplinkSpectrumConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :center-frequency)]
    (. builder centerFrequency data))
  (when-some [data (lookup-entry config id :polarization)]
    (. builder polarization data))
  (.build builder))


(defn cfn-config-uplink-spectrum-config-property-builder
  "Creates a  `CfnConfig$UplinkSpectrumConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-config-uplink-spectrum-config-property-builder (new CfnConfig$UplinkSpectrumConfigProperty$Builder) id config))


(defn build-cfn-dataflow-endpoint-group-aws-ground-station-agent-endpoint-property-builder
  "The build-cfn-dataflow-endpoint-group-aws-ground-station-agent-endpoint-property-builder function updates a CfnDataflowEndpointGroup$AwsGroundStationAgentEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnDataflowEndpointGroup$AwsGroundStationAgentEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-status` |
| `auditResults` | java.lang.String | [[cdk.support/lookup-entry]] | `:audit-results` |
| `egressAddress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:egress-address` |
| `ingressAddress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ingress-address` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnDataflowEndpointGroup$AwsGroundStationAgentEndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-status)]
    (. builder agentStatus data))
  (when-some [data (lookup-entry config id :audit-results)]
    (. builder auditResults data))
  (when-some [data (lookup-entry config id :egress-address)]
    (. builder egressAddress data))
  (when-some [data (lookup-entry config id :ingress-address)]
    (. builder ingressAddress data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-dataflow-endpoint-group-aws-ground-station-agent-endpoint-property-builder
  "Creates a  `CfnDataflowEndpointGroup$AwsGroundStationAgentEndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataflow-endpoint-group-aws-ground-station-agent-endpoint-property-builder (new CfnDataflowEndpointGroup$AwsGroundStationAgentEndpointProperty$Builder) id config))


(defn build-cfn-dataflow-endpoint-group-builder
  "The build-cfn-dataflow-endpoint-group-builder function updates a CfnDataflowEndpointGroup$Builder instance using the provided configuration.
  The function takes the CfnDataflowEndpointGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactPostPassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-post-pass-duration-seconds` |
| `contactPrePassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-pre-pass-duration-seconds` |
| `endpointDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataflowEndpointGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :contact-post-pass-duration-seconds)]
    (. builder contactPostPassDurationSeconds data))
  (when-some [data (lookup-entry config id :contact-pre-pass-duration-seconds)]
    (. builder contactPrePassDurationSeconds data))
  (when-some [data (lookup-entry config id :endpoint-details)]
    (. builder endpointDetails data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-dataflow-endpoint-group-builder
  "Creates a  `CfnDataflowEndpointGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-dataflow-endpoint-group-builder (CfnDataflowEndpointGroup$Builder/create scope (name id)) id config))


(defn build-cfn-dataflow-endpoint-group-connection-details-property-builder
  "The build-cfn-dataflow-endpoint-group-connection-details-property-builder function updates a CfnDataflowEndpointGroup$ConnectionDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataflowEndpointGroup$ConnectionDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mtu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:mtu` |
| `socketAddress` | software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup$SocketAddressProperty | [[cdk.support/lookup-entry]] | `:socket-address` |
"
  [^CfnDataflowEndpointGroup$ConnectionDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mtu)]
    (. builder mtu data))
  (when-some [data (lookup-entry config id :socket-address)]
    (. builder socketAddress data))
  (.build builder))


(defn cfn-dataflow-endpoint-group-connection-details-property-builder
  "Creates a  `CfnDataflowEndpointGroup$ConnectionDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataflow-endpoint-group-connection-details-property-builder (new CfnDataflowEndpointGroup$ConnectionDetailsProperty$Builder) id config))


(defn build-cfn-dataflow-endpoint-group-dataflow-endpoint-property-builder
  "The build-cfn-dataflow-endpoint-group-dataflow-endpoint-property-builder function updates a CfnDataflowEndpointGroup$DataflowEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnDataflowEndpointGroup$DataflowEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup$SocketAddressProperty | [[cdk.support/lookup-entry]] | `:address` |
| `mtu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:mtu` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnDataflowEndpointGroup$DataflowEndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :mtu)]
    (. builder mtu data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-dataflow-endpoint-group-dataflow-endpoint-property-builder
  "Creates a  `CfnDataflowEndpointGroup$DataflowEndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataflow-endpoint-group-dataflow-endpoint-property-builder (new CfnDataflowEndpointGroup$DataflowEndpointProperty$Builder) id config))


(defn build-cfn-dataflow-endpoint-group-endpoint-details-property-builder
  "The build-cfn-dataflow-endpoint-group-endpoint-details-property-builder function updates a CfnDataflowEndpointGroup$EndpointDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataflowEndpointGroup$EndpointDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsGroundStationAgentEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-ground-station-agent-endpoint` |
| `endpoint` | software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup$DataflowEndpointProperty | [[cdk.support/lookup-entry]] | `:endpoint` |
| `securityDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-details` |
"
  [^CfnDataflowEndpointGroup$EndpointDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aws-ground-station-agent-endpoint)]
    (. builder awsGroundStationAgentEndpoint data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :security-details)]
    (. builder securityDetails data))
  (.build builder))


(defn cfn-dataflow-endpoint-group-endpoint-details-property-builder
  "Creates a  `CfnDataflowEndpointGroup$EndpointDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataflow-endpoint-group-endpoint-details-property-builder (new CfnDataflowEndpointGroup$EndpointDetailsProperty$Builder) id config))


(defn build-cfn-dataflow-endpoint-group-integer-range-property-builder
  "The build-cfn-dataflow-endpoint-group-integer-range-property-builder function updates a CfnDataflowEndpointGroup$IntegerRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnDataflowEndpointGroup$IntegerRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum` |
| `minimum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum` |
"
  [^CfnDataflowEndpointGroup$IntegerRangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :maximum)]
    (. builder maximum data))
  (when-some [data (lookup-entry config id :minimum)]
    (. builder minimum data))
  (.build builder))


(defn cfn-dataflow-endpoint-group-integer-range-property-builder
  "Creates a  `CfnDataflowEndpointGroup$IntegerRangeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataflow-endpoint-group-integer-range-property-builder (new CfnDataflowEndpointGroup$IntegerRangeProperty$Builder) id config))


(defn build-cfn-dataflow-endpoint-group-props-builder
  "The build-cfn-dataflow-endpoint-group-props-builder function updates a CfnDataflowEndpointGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDataflowEndpointGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactPostPassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-post-pass-duration-seconds` |
| `contactPrePassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-pre-pass-duration-seconds` |
| `endpointDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDataflowEndpointGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :contact-post-pass-duration-seconds)]
    (. builder contactPostPassDurationSeconds data))
  (when-some [data (lookup-entry config id :contact-pre-pass-duration-seconds)]
    (. builder contactPrePassDurationSeconds data))
  (when-some [data (lookup-entry config id :endpoint-details)]
    (. builder endpointDetails data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-dataflow-endpoint-group-props-builder
  "Creates a  `CfnDataflowEndpointGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataflow-endpoint-group-props-builder (new CfnDataflowEndpointGroupProps$Builder) id config))


(defn build-cfn-dataflow-endpoint-group-ranged-connection-details-property-builder
  "The build-cfn-dataflow-endpoint-group-ranged-connection-details-property-builder function updates a CfnDataflowEndpointGroup$RangedConnectionDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataflowEndpointGroup$RangedConnectionDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mtu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:mtu` |
| `socketAddress` | software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup$RangedSocketAddressProperty | [[cdk.support/lookup-entry]] | `:socket-address` |
"
  [^CfnDataflowEndpointGroup$RangedConnectionDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mtu)]
    (. builder mtu data))
  (when-some [data (lookup-entry config id :socket-address)]
    (. builder socketAddress data))
  (.build builder))


(defn cfn-dataflow-endpoint-group-ranged-connection-details-property-builder
  "Creates a  `CfnDataflowEndpointGroup$RangedConnectionDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataflow-endpoint-group-ranged-connection-details-property-builder (new CfnDataflowEndpointGroup$RangedConnectionDetailsProperty$Builder) id config))


(defn build-cfn-dataflow-endpoint-group-ranged-socket-address-property-builder
  "The build-cfn-dataflow-endpoint-group-ranged-socket-address-property-builder function updates a CfnDataflowEndpointGroup$RangedSocketAddressProperty$Builder instance using the provided configuration.
  The function takes the CfnDataflowEndpointGroup$RangedSocketAddressProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `portRange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:port-range` |
"
  [^CfnDataflowEndpointGroup$RangedSocketAddressProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :port-range)]
    (. builder portRange data))
  (.build builder))


(defn cfn-dataflow-endpoint-group-ranged-socket-address-property-builder
  "Creates a  `CfnDataflowEndpointGroup$RangedSocketAddressProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataflow-endpoint-group-ranged-socket-address-property-builder (new CfnDataflowEndpointGroup$RangedSocketAddressProperty$Builder) id config))


(defn build-cfn-dataflow-endpoint-group-security-details-property-builder
  "The build-cfn-dataflow-endpoint-group-security-details-property-builder function updates a CfnDataflowEndpointGroup$SecurityDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnDataflowEndpointGroup$SecurityDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnDataflowEndpointGroup$SecurityDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-dataflow-endpoint-group-security-details-property-builder
  "Creates a  `CfnDataflowEndpointGroup$SecurityDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataflow-endpoint-group-security-details-property-builder (new CfnDataflowEndpointGroup$SecurityDetailsProperty$Builder) id config))


(defn build-cfn-dataflow-endpoint-group-socket-address-property-builder
  "The build-cfn-dataflow-endpoint-group-socket-address-property-builder function updates a CfnDataflowEndpointGroup$SocketAddressProperty$Builder instance using the provided configuration.
  The function takes the CfnDataflowEndpointGroup$SocketAddressProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnDataflowEndpointGroup$SocketAddressProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-dataflow-endpoint-group-socket-address-property-builder
  "Creates a  `CfnDataflowEndpointGroup$SocketAddressProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dataflow-endpoint-group-socket-address-property-builder (new CfnDataflowEndpointGroup$SocketAddressProperty$Builder) id config))


(defn build-cfn-mission-profile-builder
  "The build-cfn-mission-profile-builder function updates a CfnMissionProfile$Builder instance using the provided configuration.
  The function takes the CfnMissionProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactPostPassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-post-pass-duration-seconds` |
| `contactPrePassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-pre-pass-duration-seconds` |
| `dataflowEdges` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dataflow-edges` |
| `minimumViableContactDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-viable-contact-duration-seconds` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `streamsKmsKey` | software.amazon.awscdk.services.groundstation.CfnMissionProfile$StreamsKmsKeyProperty | [[cdk.support/lookup-entry]] | `:streams-kms-key` |
| `streamsKmsRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:streams-kms-role` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trackingConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracking-config-arn` |
"
  [^CfnMissionProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :contact-post-pass-duration-seconds)]
    (. builder contactPostPassDurationSeconds data))
  (when-some [data (lookup-entry config id :contact-pre-pass-duration-seconds)]
    (. builder contactPrePassDurationSeconds data))
  (when-some [data (lookup-entry config id :dataflow-edges)]
    (. builder dataflowEdges data))
  (when-some [data (lookup-entry config id :minimum-viable-contact-duration-seconds)]
    (. builder minimumViableContactDurationSeconds data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :streams-kms-key)]
    (. builder streamsKmsKey data))
  (when-some [data (lookup-entry config id :streams-kms-role)]
    (. builder streamsKmsRole data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tracking-config-arn)]
    (. builder trackingConfigArn data))
  (.build builder))


(defn cfn-mission-profile-builder
  "Creates a  `CfnMissionProfile$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-mission-profile-builder (CfnMissionProfile$Builder/create scope (name id)) id config))


(defn build-cfn-mission-profile-dataflow-edge-property-builder
  "The build-cfn-mission-profile-dataflow-edge-property-builder function updates a CfnMissionProfile$DataflowEdgeProperty$Builder instance using the provided configuration.
  The function takes the CfnMissionProfile$DataflowEdgeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
"
  [^CfnMissionProfile$DataflowEdgeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn cfn-mission-profile-dataflow-edge-property-builder
  "Creates a  `CfnMissionProfile$DataflowEdgeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-mission-profile-dataflow-edge-property-builder (new CfnMissionProfile$DataflowEdgeProperty$Builder) id config))


(defn build-cfn-mission-profile-props-builder
  "The build-cfn-mission-profile-props-builder function updates a CfnMissionProfileProps$Builder instance using the provided configuration.
  The function takes the CfnMissionProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactPostPassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-post-pass-duration-seconds` |
| `contactPrePassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-pre-pass-duration-seconds` |
| `dataflowEdges` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dataflow-edges` |
| `minimumViableContactDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-viable-contact-duration-seconds` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `streamsKmsKey` | software.amazon.awscdk.services.groundstation.CfnMissionProfile$StreamsKmsKeyProperty | [[cdk.support/lookup-entry]] | `:streams-kms-key` |
| `streamsKmsRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:streams-kms-role` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trackingConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracking-config-arn` |
"
  [^CfnMissionProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :contact-post-pass-duration-seconds)]
    (. builder contactPostPassDurationSeconds data))
  (when-some [data (lookup-entry config id :contact-pre-pass-duration-seconds)]
    (. builder contactPrePassDurationSeconds data))
  (when-some [data (lookup-entry config id :dataflow-edges)]
    (. builder dataflowEdges data))
  (when-some [data (lookup-entry config id :minimum-viable-contact-duration-seconds)]
    (. builder minimumViableContactDurationSeconds data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :streams-kms-key)]
    (. builder streamsKmsKey data))
  (when-some [data (lookup-entry config id :streams-kms-role)]
    (. builder streamsKmsRole data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tracking-config-arn)]
    (. builder trackingConfigArn data))
  (.build builder))


(defn cfn-mission-profile-props-builder
  "Creates a  `CfnMissionProfileProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-mission-profile-props-builder (new CfnMissionProfileProps$Builder) id config))


(defn build-cfn-mission-profile-streams-kms-key-property-builder
  "The build-cfn-mission-profile-streams-kms-key-property-builder function updates a CfnMissionProfile$StreamsKmsKeyProperty$Builder instance using the provided configuration.
  The function takes the CfnMissionProfile$StreamsKmsKeyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsAliasArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-alias-arn` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
"
  [^CfnMissionProfile$StreamsKmsKeyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-alias-arn)]
    (. builder kmsAliasArn data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (.build builder))


(defn cfn-mission-profile-streams-kms-key-property-builder
  "Creates a  `CfnMissionProfile$StreamsKmsKeyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-mission-profile-streams-kms-key-property-builder (new CfnMissionProfile$StreamsKmsKeyProperty$Builder) id config))