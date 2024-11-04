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


(defn cfn-config-antenna-downlink-config-property-builder
  "The cfn-config-antenna-downlink-config-property-builder function buildes out new instances of 
CfnConfig$AntennaDownlinkConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spectrumConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spectrum-config` |"
  [stack id config]
  (let [builder (CfnConfig$AntennaDownlinkConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :spectrum-config)]
      (. builder spectrumConfig data))
    (.build builder)))


(defn cfn-config-antenna-downlink-demod-decode-config-property-builder
  "The cfn-config-antenna-downlink-demod-decode-config-property-builder function buildes out new instances of 
CfnConfig$AntennaDownlinkDemodDecodeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `decodeConfig` | software.amazon.awscdk.services.groundstation.CfnConfig$DecodeConfigProperty | [[cdk.support/lookup-entry]] | `:decode-config` |
| `demodulationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:demodulation-config` |
| `spectrumConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spectrum-config` |"
  [stack id config]
  (let [builder (CfnConfig$AntennaDownlinkDemodDecodeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :decode-config)]
      (. builder decodeConfig data))
    (when-let [data (lookup-entry config id :demodulation-config)]
      (. builder demodulationConfig data))
    (when-let [data (lookup-entry config id :spectrum-config)]
      (. builder spectrumConfig data))
    (.build builder)))


(defn cfn-config-antenna-uplink-config-property-builder
  "The cfn-config-antenna-uplink-config-property-builder function buildes out new instances of 
CfnConfig$AntennaUplinkConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spectrumConfig` | software.amazon.awscdk.services.groundstation.CfnConfig$UplinkSpectrumConfigProperty | [[cdk.support/lookup-entry]] | `:spectrum-config` |
| `targetEirp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-eirp` |
| `transmitDisabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transmit-disabled` |"
  [stack id config]
  (let [builder (CfnConfig$AntennaUplinkConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :spectrum-config)]
      (. builder spectrumConfig data))
    (when-let [data (lookup-entry config id :target-eirp)]
      (. builder targetEirp data))
    (when-let [data (lookup-entry config id :transmit-disabled)]
      (. builder transmitDisabled data))
    (.build builder)))


(defn cfn-config-builder
  "The cfn-config-builder function buildes out new instances of 
CfnConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configData` | software.amazon.awscdk.services.groundstation.CfnConfig$ConfigDataProperty | [[cdk.support/lookup-entry]] | `:config-data` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :config-data)]
      (. builder configData data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-config-config-data-property-builder
  "The cfn-config-config-data-property-builder function buildes out new instances of 
CfnConfig$ConfigDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `antennaDownlinkConfig` | software.amazon.awscdk.services.groundstation.CfnConfig$AntennaDownlinkConfigProperty | [[cdk.support/lookup-entry]] | `:antenna-downlink-config` |
| `antennaDownlinkDemodDecodeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:antenna-downlink-demod-decode-config` |
| `antennaUplinkConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:antenna-uplink-config` |
| `dataflowEndpointConfig` | software.amazon.awscdk.services.groundstation.CfnConfig$DataflowEndpointConfigProperty | [[cdk.support/lookup-entry]] | `:dataflow-endpoint-config` |
| `s3RecordingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-recording-config` |
| `trackingConfig` | software.amazon.awscdk.services.groundstation.CfnConfig$TrackingConfigProperty | [[cdk.support/lookup-entry]] | `:tracking-config` |
| `uplinkEchoConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:uplink-echo-config` |"
  [stack id config]
  (let [builder (CfnConfig$ConfigDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :antenna-downlink-config)]
      (. builder antennaDownlinkConfig data))
    (when-let [data (lookup-entry config id :antenna-downlink-demod-decode-config)]
      (. builder antennaDownlinkDemodDecodeConfig data))
    (when-let [data (lookup-entry config id :antenna-uplink-config)]
      (. builder antennaUplinkConfig data))
    (when-let [data (lookup-entry config id :dataflow-endpoint-config)]
      (. builder dataflowEndpointConfig data))
    (when-let [data (lookup-entry config id :s3-recording-config)]
      (. builder s3RecordingConfig data))
    (when-let [data (lookup-entry config id :tracking-config)]
      (. builder trackingConfig data))
    (when-let [data (lookup-entry config id :uplink-echo-config)]
      (. builder uplinkEchoConfig data))
    (.build builder)))


(defn cfn-config-dataflow-endpoint-config-property-builder
  "The cfn-config-dataflow-endpoint-config-property-builder function buildes out new instances of 
CfnConfig$DataflowEndpointConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataflowEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataflow-endpoint-name` |
| `dataflowEndpointRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:dataflow-endpoint-region` |"
  [stack id config]
  (let [builder (CfnConfig$DataflowEndpointConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :dataflow-endpoint-name)]
      (. builder dataflowEndpointName data))
    (when-let [data (lookup-entry config id :dataflow-endpoint-region)]
      (. builder dataflowEndpointRegion data))
    (.build builder)))


(defn cfn-config-decode-config-property-builder
  "The cfn-config-decode-config-property-builder function buildes out new instances of 
CfnConfig$DecodeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unvalidatedJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:unvalidated-json` |"
  [stack id config]
  (let [builder (CfnConfig$DecodeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :unvalidated-json)]
      (. builder unvalidatedJson data))
    (.build builder)))


(defn cfn-config-demodulation-config-property-builder
  "The cfn-config-demodulation-config-property-builder function buildes out new instances of 
CfnConfig$DemodulationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unvalidatedJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:unvalidated-json` |"
  [stack id config]
  (let [builder (CfnConfig$DemodulationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :unvalidated-json)]
      (. builder unvalidatedJson data))
    (.build builder)))


(defn cfn-config-eirp-property-builder
  "The cfn-config-eirp-property-builder function buildes out new instances of 
CfnConfig$EirpProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `units` | java.lang.String | [[cdk.support/lookup-entry]] | `:units` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnConfig$EirpProperty$Builder.)]
    (when-let [data (lookup-entry config id :units)]
      (. builder units data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-config-frequency-bandwidth-property-builder
  "The cfn-config-frequency-bandwidth-property-builder function buildes out new instances of 
CfnConfig$FrequencyBandwidthProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `units` | java.lang.String | [[cdk.support/lookup-entry]] | `:units` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnConfig$FrequencyBandwidthProperty$Builder.)]
    (when-let [data (lookup-entry config id :units)]
      (. builder units data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-config-frequency-property-builder
  "The cfn-config-frequency-property-builder function buildes out new instances of 
CfnConfig$FrequencyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `units` | java.lang.String | [[cdk.support/lookup-entry]] | `:units` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnConfig$FrequencyProperty$Builder.)]
    (when-let [data (lookup-entry config id :units)]
      (. builder units data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-config-props-builder
  "The cfn-config-props-builder function buildes out new instances of 
CfnConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config-data` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :config-data)]
      (. builder configData data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-config-s3-recording-config-property-builder
  "The cfn-config-s3-recording-config-property-builder function buildes out new instances of 
CfnConfig$S3RecordingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-arn` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnConfig$S3RecordingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-arn)]
      (. builder bucketArn data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-config-spectrum-config-property-builder
  "The cfn-config-spectrum-config-property-builder function buildes out new instances of 
CfnConfig$SpectrumConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bandwidth` | software.amazon.awscdk.services.groundstation.CfnConfig$FrequencyBandwidthProperty | [[cdk.support/lookup-entry]] | `:bandwidth` |
| `centerFrequency` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:center-frequency` |
| `polarization` | java.lang.String | [[cdk.support/lookup-entry]] | `:polarization` |"
  [stack id config]
  (let [builder (CfnConfig$SpectrumConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bandwidth)]
      (. builder bandwidth data))
    (when-let [data (lookup-entry config id :center-frequency)]
      (. builder centerFrequency data))
    (when-let [data (lookup-entry config id :polarization)]
      (. builder polarization data))
    (.build builder)))


(defn cfn-config-tracking-config-property-builder
  "The cfn-config-tracking-config-property-builder function buildes out new instances of 
CfnConfig$TrackingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autotrack` | java.lang.String | [[cdk.support/lookup-entry]] | `:autotrack` |"
  [stack id config]
  (let [builder (CfnConfig$TrackingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :autotrack)]
      (. builder autotrack data))
    (.build builder)))


(defn cfn-config-uplink-echo-config-property-builder
  "The cfn-config-uplink-echo-config-property-builder function buildes out new instances of 
CfnConfig$UplinkEchoConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `antennaUplinkConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:antenna-uplink-config-arn` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnConfig$UplinkEchoConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :antenna-uplink-config-arn)]
      (. builder antennaUplinkConfigArn data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-config-uplink-spectrum-config-property-builder
  "The cfn-config-uplink-spectrum-config-property-builder function buildes out new instances of 
CfnConfig$UplinkSpectrumConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `centerFrequency` | software.amazon.awscdk.services.groundstation.CfnConfig$FrequencyProperty | [[cdk.support/lookup-entry]] | `:center-frequency` |
| `polarization` | java.lang.String | [[cdk.support/lookup-entry]] | `:polarization` |"
  [stack id config]
  (let [builder (CfnConfig$UplinkSpectrumConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :center-frequency)]
      (. builder centerFrequency data))
    (when-let [data (lookup-entry config id :polarization)]
      (. builder polarization data))
    (.build builder)))


(defn cfn-dataflow-endpoint-group-aws-ground-station-agent-endpoint-property-builder
  "The cfn-dataflow-endpoint-group-aws-ground-station-agent-endpoint-property-builder function buildes out new instances of 
CfnDataflowEndpointGroup$AwsGroundStationAgentEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-status` |
| `auditResults` | java.lang.String | [[cdk.support/lookup-entry]] | `:audit-results` |
| `egressAddress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:egress-address` |
| `ingressAddress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ingress-address` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnDataflowEndpointGroup$AwsGroundStationAgentEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :agent-status)]
      (. builder agentStatus data))
    (when-let [data (lookup-entry config id :audit-results)]
      (. builder auditResults data))
    (when-let [data (lookup-entry config id :egress-address)]
      (. builder egressAddress data))
    (when-let [data (lookup-entry config id :ingress-address)]
      (. builder ingressAddress data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-dataflow-endpoint-group-builder
  "The cfn-dataflow-endpoint-group-builder function buildes out new instances of 
CfnDataflowEndpointGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactPostPassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-post-pass-duration-seconds` |
| `contactPrePassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-pre-pass-duration-seconds` |
| `endpointDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataflowEndpointGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :contact-post-pass-duration-seconds)]
      (. builder contactPostPassDurationSeconds data))
    (when-let [data (lookup-entry config id :contact-pre-pass-duration-seconds)]
      (. builder contactPrePassDurationSeconds data))
    (when-let [data (lookup-entry config id :endpoint-details)]
      (. builder endpointDetails data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dataflow-endpoint-group-connection-details-property-builder
  "The cfn-dataflow-endpoint-group-connection-details-property-builder function buildes out new instances of 
CfnDataflowEndpointGroup$ConnectionDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mtu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:mtu` |
| `socketAddress` | software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup$SocketAddressProperty | [[cdk.support/lookup-entry]] | `:socket-address` |"
  [stack id config]
  (let [builder (CfnDataflowEndpointGroup$ConnectionDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :mtu)]
      (. builder mtu data))
    (when-let [data (lookup-entry config id :socket-address)]
      (. builder socketAddress data))
    (.build builder)))


(defn cfn-dataflow-endpoint-group-dataflow-endpoint-property-builder
  "The cfn-dataflow-endpoint-group-dataflow-endpoint-property-builder function buildes out new instances of 
CfnDataflowEndpointGroup$DataflowEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup$SocketAddressProperty | [[cdk.support/lookup-entry]] | `:address` |
| `mtu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:mtu` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnDataflowEndpointGroup$DataflowEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :mtu)]
      (. builder mtu data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-dataflow-endpoint-group-endpoint-details-property-builder
  "The cfn-dataflow-endpoint-group-endpoint-details-property-builder function buildes out new instances of 
CfnDataflowEndpointGroup$EndpointDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsGroundStationAgentEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-ground-station-agent-endpoint` |
| `endpoint` | software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup$DataflowEndpointProperty | [[cdk.support/lookup-entry]] | `:endpoint` |
| `securityDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-details` |"
  [stack id config]
  (let [builder (CfnDataflowEndpointGroup$EndpointDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-ground-station-agent-endpoint)]
      (. builder awsGroundStationAgentEndpoint data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :security-details)]
      (. builder securityDetails data))
    (.build builder)))


(defn cfn-dataflow-endpoint-group-integer-range-property-builder
  "The cfn-dataflow-endpoint-group-integer-range-property-builder function buildes out new instances of 
CfnDataflowEndpointGroup$IntegerRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum` |
| `minimum` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum` |"
  [stack id config]
  (let [builder (CfnDataflowEndpointGroup$IntegerRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :maximum)]
      (. builder maximum data))
    (when-let [data (lookup-entry config id :minimum)]
      (. builder minimum data))
    (.build builder)))


(defn cfn-dataflow-endpoint-group-props-builder
  "The cfn-dataflow-endpoint-group-props-builder function buildes out new instances of 
CfnDataflowEndpointGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactPostPassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-post-pass-duration-seconds` |
| `contactPrePassDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:contact-pre-pass-duration-seconds` |
| `endpointDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint-details` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDataflowEndpointGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :contact-post-pass-duration-seconds)]
      (. builder contactPostPassDurationSeconds data))
    (when-let [data (lookup-entry config id :contact-pre-pass-duration-seconds)]
      (. builder contactPrePassDurationSeconds data))
    (when-let [data (lookup-entry config id :endpoint-details)]
      (. builder endpointDetails data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dataflow-endpoint-group-ranged-connection-details-property-builder
  "The cfn-dataflow-endpoint-group-ranged-connection-details-property-builder function buildes out new instances of 
CfnDataflowEndpointGroup$RangedConnectionDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mtu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:mtu` |
| `socketAddress` | software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup$RangedSocketAddressProperty | [[cdk.support/lookup-entry]] | `:socket-address` |"
  [stack id config]
  (let [builder (CfnDataflowEndpointGroup$RangedConnectionDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :mtu)]
      (. builder mtu data))
    (when-let [data (lookup-entry config id :socket-address)]
      (. builder socketAddress data))
    (.build builder)))


(defn cfn-dataflow-endpoint-group-ranged-socket-address-property-builder
  "The cfn-dataflow-endpoint-group-ranged-socket-address-property-builder function buildes out new instances of 
CfnDataflowEndpointGroup$RangedSocketAddressProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `portRange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:port-range` |"
  [stack id config]
  (let [builder (CfnDataflowEndpointGroup$RangedSocketAddressProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port-range)]
      (. builder portRange data))
    (.build builder)))


(defn cfn-dataflow-endpoint-group-security-details-property-builder
  "The cfn-dataflow-endpoint-group-security-details-property-builder function buildes out new instances of 
CfnDataflowEndpointGroup$SecurityDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnDataflowEndpointGroup$SecurityDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-dataflow-endpoint-group-socket-address-property-builder
  "The cfn-dataflow-endpoint-group-socket-address-property-builder function buildes out new instances of 
CfnDataflowEndpointGroup$SocketAddressProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnDataflowEndpointGroup$SocketAddressProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-mission-profile-builder
  "The cfn-mission-profile-builder function buildes out new instances of 
CfnMissionProfile$Builder using the provided configuration.  Each field is set as follows:

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
| `trackingConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracking-config-arn` |"
  [stack id config]
  (let [builder (CfnMissionProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :contact-post-pass-duration-seconds)]
      (. builder contactPostPassDurationSeconds data))
    (when-let [data (lookup-entry config id :contact-pre-pass-duration-seconds)]
      (. builder contactPrePassDurationSeconds data))
    (when-let [data (lookup-entry config id :dataflow-edges)]
      (. builder dataflowEdges data))
    (when-let [data (lookup-entry config id :minimum-viable-contact-duration-seconds)]
      (. builder minimumViableContactDurationSeconds data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :streams-kms-key)]
      (. builder streamsKmsKey data))
    (when-let [data (lookup-entry config id :streams-kms-role)]
      (. builder streamsKmsRole data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tracking-config-arn)]
      (. builder trackingConfigArn data))
    (.build builder)))


(defn cfn-mission-profile-dataflow-edge-property-builder
  "The cfn-mission-profile-dataflow-edge-property-builder function buildes out new instances of 
CfnMissionProfile$DataflowEdgeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |"
  [stack id config]
  (let [builder (CfnMissionProfile$DataflowEdgeProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (.build builder)))


(defn cfn-mission-profile-props-builder
  "The cfn-mission-profile-props-builder function buildes out new instances of 
CfnMissionProfileProps$Builder using the provided configuration.  Each field is set as follows:

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
| `trackingConfigArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracking-config-arn` |"
  [stack id config]
  (let [builder (CfnMissionProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :contact-post-pass-duration-seconds)]
      (. builder contactPostPassDurationSeconds data))
    (when-let [data (lookup-entry config id :contact-pre-pass-duration-seconds)]
      (. builder contactPrePassDurationSeconds data))
    (when-let [data (lookup-entry config id :dataflow-edges)]
      (. builder dataflowEdges data))
    (when-let [data (lookup-entry config id :minimum-viable-contact-duration-seconds)]
      (. builder minimumViableContactDurationSeconds data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :streams-kms-key)]
      (. builder streamsKmsKey data))
    (when-let [data (lookup-entry config id :streams-kms-role)]
      (. builder streamsKmsRole data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tracking-config-arn)]
      (. builder trackingConfigArn data))
    (.build builder)))


(defn cfn-mission-profile-streams-kms-key-property-builder
  "The cfn-mission-profile-streams-kms-key-property-builder function buildes out new instances of 
CfnMissionProfile$StreamsKmsKeyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsAliasArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-alias-arn` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |"
  [stack id config]
  (let [builder (CfnMissionProfile$StreamsKmsKeyProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-alias-arn)]
      (. builder kmsAliasArn data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (.build builder)))