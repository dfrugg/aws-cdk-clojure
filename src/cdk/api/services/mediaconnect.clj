(ns cdk.api.services.mediaconnect
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.mediaconnect package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.mediaconnect CfnBridge$BridgeFlowSourceProperty$Builder
                                                         CfnBridge$BridgeNetworkOutputProperty$Builder
                                                         CfnBridge$BridgeNetworkSourceProperty$Builder
                                                         CfnBridge$BridgeOutputProperty$Builder
                                                         CfnBridge$BridgeSourceProperty$Builder
                                                         CfnBridge$Builder
                                                         CfnBridge$EgressGatewayBridgeProperty$Builder
                                                         CfnBridge$FailoverConfigProperty$Builder
                                                         CfnBridge$IngressGatewayBridgeProperty$Builder
                                                         CfnBridge$SourcePriorityProperty$Builder
                                                         CfnBridge$VpcInterfaceAttachmentProperty$Builder
                                                         CfnBridgeOutput$BridgeNetworkOutputProperty$Builder
                                                         CfnBridgeOutput$Builder
                                                         CfnBridgeOutputProps$Builder
                                                         CfnBridgeProps$Builder
                                                         CfnBridgeSource$BridgeFlowSourceProperty$Builder
                                                         CfnBridgeSource$BridgeNetworkSourceProperty$Builder
                                                         CfnBridgeSource$Builder
                                                         CfnBridgeSource$VpcInterfaceAttachmentProperty$Builder
                                                         CfnBridgeSourceProps$Builder
                                                         CfnFlow$Builder
                                                         CfnFlow$EncryptionProperty$Builder
                                                         CfnFlow$FailoverConfigProperty$Builder
                                                         CfnFlow$FmtpProperty$Builder
                                                         CfnFlow$GatewayBridgeSourceProperty$Builder
                                                         CfnFlow$InputConfigurationProperty$Builder
                                                         CfnFlow$InterfaceProperty$Builder
                                                         CfnFlow$MaintenanceProperty$Builder
                                                         CfnFlow$MediaStreamAttributesProperty$Builder
                                                         CfnFlow$MediaStreamProperty$Builder
                                                         CfnFlow$MediaStreamSourceConfigurationProperty$Builder
                                                         CfnFlow$SourcePriorityProperty$Builder
                                                         CfnFlow$SourceProperty$Builder
                                                         CfnFlow$VpcInterfaceAttachmentProperty$Builder
                                                         CfnFlow$VpcInterfaceProperty$Builder
                                                         CfnFlowEntitlement$Builder
                                                         CfnFlowEntitlement$EncryptionProperty$Builder
                                                         CfnFlowEntitlementProps$Builder
                                                         CfnFlowOutput$Builder
                                                         CfnFlowOutput$DestinationConfigurationProperty$Builder
                                                         CfnFlowOutput$EncodingParametersProperty$Builder
                                                         CfnFlowOutput$EncryptionProperty$Builder
                                                         CfnFlowOutput$InterfaceProperty$Builder
                                                         CfnFlowOutput$MediaStreamOutputConfigurationProperty$Builder
                                                         CfnFlowOutput$VpcInterfaceAttachmentProperty$Builder
                                                         CfnFlowOutputProps$Builder
                                                         CfnFlowProps$Builder
                                                         CfnFlowSource$Builder
                                                         CfnFlowSource$EncryptionProperty$Builder
                                                         CfnFlowSource$GatewayBridgeSourceProperty$Builder
                                                         CfnFlowSource$VpcInterfaceAttachmentProperty$Builder
                                                         CfnFlowSourceProps$Builder
                                                         CfnFlowVpcInterface$Builder
                                                         CfnFlowVpcInterfaceProps$Builder
                                                         CfnGateway$Builder
                                                         CfnGateway$GatewayNetworkProperty$Builder
                                                         CfnGatewayProps$Builder]))


(defn cfn-bridge-bridge-flow-source-property-builder
  "The cfn-bridge-bridge-flow-source-property-builder function buildes out new instances of 
CfnBridge$BridgeFlowSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `flowVpcInterfaceAttachment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flow-vpc-interface-attachment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnBridge$BridgeFlowSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :flow-arn)]
      (. builder flowArn data))
    (when-let [data (lookup-entry config id :flow-vpc-interface-attachment)]
      (. builder flowVpcInterfaceAttachment data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-bridge-bridge-network-output-property-builder
  "The cfn-bridge-bridge-network-output-property-builder function buildes out new instances of 
CfnBridge$BridgeNetworkOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |"
  [stack id config]
  (let [builder (CfnBridge$BridgeNetworkOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :ip-address)]
      (. builder ipAddress data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-name)]
      (. builder networkName data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :ttl)]
      (. builder ttl data))
    (.build builder)))


(defn cfn-bridge-bridge-network-source-property-builder
  "The cfn-bridge-bridge-network-source-property-builder function buildes out new instances of 
CfnBridge$BridgeNetworkSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `multicastIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:multicast-ip` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnBridge$BridgeNetworkSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :multicast-ip)]
      (. builder multicastIp data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-name)]
      (. builder networkName data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn cfn-bridge-bridge-output-property-builder
  "The cfn-bridge-bridge-output-property-builder function buildes out new instances of 
CfnBridge$BridgeOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkOutput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-output` |"
  [stack id config]
  (let [builder (CfnBridge$BridgeOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :network-output)]
      (. builder networkOutput data))
    (.build builder)))


(defn cfn-bridge-bridge-source-property-builder
  "The cfn-bridge-bridge-source-property-builder function buildes out new instances of 
CfnBridge$BridgeSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowSource` | software.amazon.awscdk.services.mediaconnect.CfnBridge$BridgeFlowSourceProperty | [[cdk.support/lookup-entry]] | `:flow-source` |
| `networkSource` | software.amazon.awscdk.services.mediaconnect.CfnBridge$BridgeNetworkSourceProperty | [[cdk.support/lookup-entry]] | `:network-source` |"
  [stack id config]
  (let [builder (CfnBridge$BridgeSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :flow-source)]
      (. builder flowSource data))
    (when-let [data (lookup-entry config id :network-source)]
      (. builder networkSource data))
    (.build builder)))


(defn cfn-bridge-builder
  "The cfn-bridge-builder function buildes out new instances of 
CfnBridge$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressGatewayBridge` | software.amazon.awscdk.services.mediaconnect.CfnBridge$EgressGatewayBridgeProperty | [[cdk.support/lookup-entry]] | `:egress-gateway-bridge` |
| `ingressGatewayBridge` | software.amazon.awscdk.services.mediaconnect.CfnBridge$IngressGatewayBridgeProperty | [[cdk.support/lookup-entry]] | `:ingress-gateway-bridge` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `placementArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-arn` |
| `sourceFailoverConfig` | software.amazon.awscdk.services.mediaconnect.CfnBridge$FailoverConfigProperty | [[cdk.support/lookup-entry]] | `:source-failover-config` |
| `sources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sources` |"
  [stack id config]
  (let [builder (CfnBridge$Builder/create stack id)]
    (when-let [data (lookup-entry config id :egress-gateway-bridge)]
      (. builder egressGatewayBridge data))
    (when-let [data (lookup-entry config id :ingress-gateway-bridge)]
      (. builder ingressGatewayBridge data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :placement-arn)]
      (. builder placementArn data))
    (when-let [data (lookup-entry config id :source-failover-config)]
      (. builder sourceFailoverConfig data))
    (when-let [data (lookup-entry config id :sources)]
      (. builder sources data))
    (.build builder)))


(defn cfn-bridge-egress-gateway-bridge-property-builder
  "The cfn-bridge-egress-gateway-bridge-property-builder function buildes out new instances of 
CfnBridge$EgressGatewayBridgeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-bitrate` |"
  [stack id config]
  (let [builder (CfnBridge$EgressGatewayBridgeProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-bitrate)]
      (. builder maxBitrate data))
    (.build builder)))


(defn cfn-bridge-failover-config-property-builder
  "The cfn-bridge-failover-config-property-builder function buildes out new instances of 
CfnBridge$FailoverConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:failover-mode` |
| `sourcePriority` | software.amazon.awscdk.services.mediaconnect.CfnBridge$SourcePriorityProperty | [[cdk.support/lookup-entry]] | `:source-priority` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |"
  [stack id config]
  (let [builder (CfnBridge$FailoverConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :failover-mode)]
      (. builder failoverMode data))
    (when-let [data (lookup-entry config id :source-priority)]
      (. builder sourcePriority data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (.build builder)))


(defn cfn-bridge-ingress-gateway-bridge-property-builder
  "The cfn-bridge-ingress-gateway-bridge-property-builder function buildes out new instances of 
CfnBridge$IngressGatewayBridgeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-bitrate` |
| `maxOutputs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-outputs` |"
  [stack id config]
  (let [builder (CfnBridge$IngressGatewayBridgeProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-bitrate)]
      (. builder maxBitrate data))
    (when-let [data (lookup-entry config id :max-outputs)]
      (. builder maxOutputs data))
    (.build builder)))


(defn cfn-bridge-output-bridge-network-output-property-builder
  "The cfn-bridge-output-bridge-network-output-property-builder function buildes out new instances of 
CfnBridgeOutput$BridgeNetworkOutputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `networkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |"
  [stack id config]
  (let [builder (CfnBridgeOutput$BridgeNetworkOutputProperty$Builder.)]
    (when-let [data (lookup-entry config id :ip-address)]
      (. builder ipAddress data))
    (when-let [data (lookup-entry config id :network-name)]
      (. builder networkName data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :ttl)]
      (. builder ttl data))
    (.build builder)))


(defn cfn-bridge-output-builder
  "The cfn-bridge-output-builder function buildes out new instances of 
CfnBridgeOutput$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkOutput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-output` |"
  [stack id config]
  (let [builder (CfnBridgeOutput$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bridge-arn)]
      (. builder bridgeArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-output)]
      (. builder networkOutput data))
    (.build builder)))


(defn cfn-bridge-output-props-builder
  "The cfn-bridge-output-props-builder function buildes out new instances of 
CfnBridgeOutputProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkOutput` | software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput$BridgeNetworkOutputProperty | [[cdk.support/lookup-entry]] | `:network-output` |"
  [stack id config]
  (let [builder (CfnBridgeOutputProps$Builder.)]
    (when-let [data (lookup-entry config id :bridge-arn)]
      (. builder bridgeArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-output)]
      (. builder networkOutput data))
    (.build builder)))


(defn cfn-bridge-props-builder
  "The cfn-bridge-props-builder function buildes out new instances of 
CfnBridgeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressGatewayBridge` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:egress-gateway-bridge` |
| `ingressGatewayBridge` | software.amazon.awscdk.services.mediaconnect.CfnBridge$IngressGatewayBridgeProperty | [[cdk.support/lookup-entry]] | `:ingress-gateway-bridge` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outputs` |
| `placementArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-arn` |
| `sourceFailoverConfig` | software.amazon.awscdk.services.mediaconnect.CfnBridge$FailoverConfigProperty | [[cdk.support/lookup-entry]] | `:source-failover-config` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |"
  [stack id config]
  (let [builder (CfnBridgeProps$Builder.)]
    (when-let [data (lookup-entry config id :egress-gateway-bridge)]
      (. builder egressGatewayBridge data))
    (when-let [data (lookup-entry config id :ingress-gateway-bridge)]
      (. builder ingressGatewayBridge data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :outputs)]
      (. builder outputs data))
    (when-let [data (lookup-entry config id :placement-arn)]
      (. builder placementArn data))
    (when-let [data (lookup-entry config id :source-failover-config)]
      (. builder sourceFailoverConfig data))
    (when-let [data (lookup-entry config id :sources)]
      (. builder sources data))
    (.build builder)))


(defn cfn-bridge-source-bridge-flow-source-property-builder
  "The cfn-bridge-source-bridge-flow-source-property-builder function buildes out new instances of 
CfnBridgeSource$BridgeFlowSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `flowVpcInterfaceAttachment` | software.amazon.awscdk.services.mediaconnect.CfnBridgeSource$VpcInterfaceAttachmentProperty | [[cdk.support/lookup-entry]] | `:flow-vpc-interface-attachment` |"
  [stack id config]
  (let [builder (CfnBridgeSource$BridgeFlowSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :flow-arn)]
      (. builder flowArn data))
    (when-let [data (lookup-entry config id :flow-vpc-interface-attachment)]
      (. builder flowVpcInterfaceAttachment data))
    (.build builder)))


(defn cfn-bridge-source-bridge-network-source-property-builder
  "The cfn-bridge-source-bridge-network-source-property-builder function buildes out new instances of 
CfnBridgeSource$BridgeNetworkSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `multicastIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:multicast-ip` |
| `networkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnBridgeSource$BridgeNetworkSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :multicast-ip)]
      (. builder multicastIp data))
    (when-let [data (lookup-entry config id :network-name)]
      (. builder networkName data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn cfn-bridge-source-builder
  "The cfn-bridge-source-builder function buildes out new instances of 
CfnBridgeSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `flowSource` | software.amazon.awscdk.services.mediaconnect.CfnBridgeSource$BridgeFlowSourceProperty | [[cdk.support/lookup-entry]] | `:flow-source` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-source` |"
  [stack id config]
  (let [builder (CfnBridgeSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bridge-arn)]
      (. builder bridgeArn data))
    (when-let [data (lookup-entry config id :flow-source)]
      (. builder flowSource data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-source)]
      (. builder networkSource data))
    (.build builder)))


(defn cfn-bridge-source-priority-property-builder
  "The cfn-bridge-source-priority-property-builder function buildes out new instances of 
CfnBridge$SourcePriorityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primarySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-source` |"
  [stack id config]
  (let [builder (CfnBridge$SourcePriorityProperty$Builder.)]
    (when-let [data (lookup-entry config id :primary-source)]
      (. builder primarySource data))
    (.build builder)))


(defn cfn-bridge-source-props-builder
  "The cfn-bridge-source-props-builder function buildes out new instances of 
CfnBridgeSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `flowSource` | software.amazon.awscdk.services.mediaconnect.CfnBridgeSource$BridgeFlowSourceProperty | [[cdk.support/lookup-entry]] | `:flow-source` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-source` |"
  [stack id config]
  (let [builder (CfnBridgeSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :bridge-arn)]
      (. builder bridgeArn data))
    (when-let [data (lookup-entry config id :flow-source)]
      (. builder flowSource data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-source)]
      (. builder networkSource data))
    (.build builder)))


(defn cfn-bridge-source-vpc-interface-attachment-property-builder
  "The cfn-bridge-source-vpc-interface-attachment-property-builder function buildes out new instances of 
CfnBridgeSource$VpcInterfaceAttachmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |"
  [stack id config]
  (let [builder (CfnBridgeSource$VpcInterfaceAttachmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :vpc-interface-name)]
      (. builder vpcInterfaceName data))
    (.build builder)))


(defn cfn-bridge-vpc-interface-attachment-property-builder
  "The cfn-bridge-vpc-interface-attachment-property-builder function buildes out new instances of 
CfnBridge$VpcInterfaceAttachmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |"
  [stack id config]
  (let [builder (CfnBridge$VpcInterfaceAttachmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :vpc-interface-name)]
      (. builder vpcInterfaceName data))
    (.build builder)))


(defn cfn-flow-builder
  "The cfn-flow-builder function buildes out new instances of 
CfnFlow$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `maintenance` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maintenance` |
| `mediaStreams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:media-streams` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
| `sourceFailoverConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-failover-config` |
| `vpcInterfaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-interfaces` |"
  [stack id config]
  (let [builder (CfnFlow$Builder/create stack id)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :maintenance)]
      (. builder maintenance data))
    (when-let [data (lookup-entry config id :media-streams)]
      (. builder mediaStreams data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :source-failover-config)]
      (. builder sourceFailoverConfig data))
    (when-let [data (lookup-entry config id :vpc-interfaces)]
      (. builder vpcInterfaces data))
    (.build builder)))


(defn cfn-flow-encryption-property-builder
  "The cfn-flow-encryption-property-builder function buildes out new instances of 
CfnFlow$EncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `constantInitializationVector` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-initialization-vector` |
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnFlow$EncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :algorithm)]
      (. builder algorithm data))
    (when-let [data (lookup-entry config id :constant-initialization-vector)]
      (. builder constantInitializationVector data))
    (when-let [data (lookup-entry config id :device-id)]
      (. builder deviceId data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-flow-entitlement-builder
  "The cfn-flow-entitlement-builder function buildes out new instances of 
CfnFlowEntitlement$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTransferSubscriberFeePercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-transfer-subscriber-fee-percent` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `entitlementStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-status` |
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |"
  [stack id config]
  (let [builder (CfnFlowEntitlement$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data-transfer-subscriber-fee-percent)]
      (. builder dataTransferSubscriberFeePercent data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :entitlement-status)]
      (. builder entitlementStatus data))
    (when-let [data (lookup-entry config id :flow-arn)]
      (. builder flowArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :subscribers)]
      (. builder subscribers data))
    (.build builder)))


(defn cfn-flow-entitlement-encryption-property-builder
  "The cfn-flow-entitlement-encryption-property-builder function buildes out new instances of 
CfnFlowEntitlement$EncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `constantInitializationVector` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-initialization-vector` |
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnFlowEntitlement$EncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :algorithm)]
      (. builder algorithm data))
    (when-let [data (lookup-entry config id :constant-initialization-vector)]
      (. builder constantInitializationVector data))
    (when-let [data (lookup-entry config id :device-id)]
      (. builder deviceId data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-flow-entitlement-props-builder
  "The cfn-flow-entitlement-props-builder function buildes out new instances of 
CfnFlowEntitlementProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTransferSubscriberFeePercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-transfer-subscriber-fee-percent` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `entitlementStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-status` |
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |"
  [stack id config]
  (let [builder (CfnFlowEntitlementProps$Builder.)]
    (when-let [data (lookup-entry config id :data-transfer-subscriber-fee-percent)]
      (. builder dataTransferSubscriberFeePercent data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :entitlement-status)]
      (. builder entitlementStatus data))
    (when-let [data (lookup-entry config id :flow-arn)]
      (. builder flowArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :subscribers)]
      (. builder subscribers data))
    (.build builder)))


(defn cfn-flow-failover-config-property-builder
  "The cfn-flow-failover-config-property-builder function buildes out new instances of 
CfnFlow$FailoverConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:failover-mode` |
| `recoveryWindow` | java.lang.Number | [[cdk.support/lookup-entry]] | `:recovery-window` |
| `sourcePriority` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-priority` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |"
  [stack id config]
  (let [builder (CfnFlow$FailoverConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :failover-mode)]
      (. builder failoverMode data))
    (when-let [data (lookup-entry config id :recovery-window)]
      (. builder recoveryWindow data))
    (when-let [data (lookup-entry config id :source-priority)]
      (. builder sourcePriority data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (.build builder)))


(defn cfn-flow-fmtp-property-builder
  "The cfn-flow-fmtp-property-builder function buildes out new instances of 
CfnFlow$FmtpProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-order` |
| `colorimetry` | java.lang.String | [[cdk.support/lookup-entry]] | `:colorimetry` |
| `exactFramerate` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact-framerate` |
| `par` | java.lang.String | [[cdk.support/lookup-entry]] | `:par` |
| `range` | java.lang.String | [[cdk.support/lookup-entry]] | `:range` |
| `scanMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:scan-mode` |
| `tcs` | java.lang.String | [[cdk.support/lookup-entry]] | `:tcs` |"
  [stack id config]
  (let [builder (CfnFlow$FmtpProperty$Builder.)]
    (when-let [data (lookup-entry config id :channel-order)]
      (. builder channelOrder data))
    (when-let [data (lookup-entry config id :colorimetry)]
      (. builder colorimetry data))
    (when-let [data (lookup-entry config id :exact-framerate)]
      (. builder exactFramerate data))
    (when-let [data (lookup-entry config id :par)]
      (. builder par data))
    (when-let [data (lookup-entry config id :range)]
      (. builder range data))
    (when-let [data (lookup-entry config id :scan-mode)]
      (. builder scanMode data))
    (when-let [data (lookup-entry config id :tcs)]
      (. builder tcs data))
    (.build builder)))


(defn cfn-flow-gateway-bridge-source-property-builder
  "The cfn-flow-gateway-bridge-source-property-builder function buildes out new instances of 
CfnFlow$GatewayBridgeSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `vpcInterfaceAttachment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-interface-attachment` |"
  [stack id config]
  (let [builder (CfnFlow$GatewayBridgeSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :bridge-arn)]
      (. builder bridgeArn data))
    (when-let [data (lookup-entry config id :vpc-interface-attachment)]
      (. builder vpcInterfaceAttachment data))
    (.build builder)))


(defn cfn-flow-input-configuration-property-builder
  "The cfn-flow-input-configuration-property-builder function buildes out new instances of 
CfnFlow$InputConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:input-port` |
| `interfaceValue` | software.amazon.awscdk.services.mediaconnect.CfnFlow$InterfaceProperty | [[cdk.support/lookup-entry]] | `:interface-value` |"
  [stack id config]
  (let [builder (CfnFlow$InputConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :input-port)]
      (. builder inputPort data))
    (when-let [data (lookup-entry config id :interface-value)]
      (. builder interfaceValue data))
    (.build builder)))


(defn cfn-flow-interface-property-builder
  "The cfn-flow-interface-property-builder function buildes out new instances of 
CfnFlow$InterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnFlow$InterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-flow-maintenance-property-builder
  "The cfn-flow-maintenance-property-builder function buildes out new instances of 
CfnFlow$MaintenanceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maintenanceDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-day` |
| `maintenanceStartHour` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-start-hour` |"
  [stack id config]
  (let [builder (CfnFlow$MaintenanceProperty$Builder.)]
    (when-let [data (lookup-entry config id :maintenance-day)]
      (. builder maintenanceDay data))
    (when-let [data (lookup-entry config id :maintenance-start-hour)]
      (. builder maintenanceStartHour data))
    (.build builder)))


(defn cfn-flow-media-stream-attributes-property-builder
  "The cfn-flow-media-stream-attributes-property-builder function buildes out new instances of 
CfnFlow$MediaStreamAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fmtp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fmtp` |
| `lang` | java.lang.String | [[cdk.support/lookup-entry]] | `:lang` |"
  [stack id config]
  (let [builder (CfnFlow$MediaStreamAttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :fmtp)]
      (. builder fmtp data))
    (when-let [data (lookup-entry config id :lang)]
      (. builder lang data))
    (.build builder)))


(defn cfn-flow-media-stream-property-builder
  "The cfn-flow-media-stream-property-builder function buildes out new instances of 
CfnFlow$MediaStreamProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.services.mediaconnect.CfnFlow$MediaStreamAttributesProperty | [[cdk.support/lookup-entry]] | `:attributes` |
| `clockRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:clock-rate` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fmt` | java.lang.Number | [[cdk.support/lookup-entry]] | `:fmt` |
| `mediaStreamId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:media-stream-id` |
| `mediaStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-stream-name` |
| `mediaStreamType` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-stream-type` |
| `videoFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:video-format` |"
  [stack id config]
  (let [builder (CfnFlow$MediaStreamProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :clock-rate)]
      (. builder clockRate data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fmt)]
      (. builder fmt data))
    (when-let [data (lookup-entry config id :media-stream-id)]
      (. builder mediaStreamId data))
    (when-let [data (lookup-entry config id :media-stream-name)]
      (. builder mediaStreamName data))
    (when-let [data (lookup-entry config id :media-stream-type)]
      (. builder mediaStreamType data))
    (when-let [data (lookup-entry config id :video-format)]
      (. builder videoFormat data))
    (.build builder)))


(defn cfn-flow-media-stream-source-configuration-property-builder
  "The cfn-flow-media-stream-source-configuration-property-builder function buildes out new instances of 
CfnFlow$MediaStreamSourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encodingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding-name` |
| `inputConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:input-configurations` |
| `mediaStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-stream-name` |"
  [stack id config]
  (let [builder (CfnFlow$MediaStreamSourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :encoding-name)]
      (. builder encodingName data))
    (when-let [data (lookup-entry config id :input-configurations)]
      (. builder inputConfigurations data))
    (when-let [data (lookup-entry config id :media-stream-name)]
      (. builder mediaStreamName data))
    (.build builder)))


(defn cfn-flow-output-builder
  "The cfn-flow-output-builder function buildes out new instances of 
CfnFlowOutput$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrAllowList` | java.util.List | [[cdk.support/lookup-entry]] | `:cidr-allow-list` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `encryption` | software.amazon.awscdk.services.mediaconnect.CfnFlowOutput$EncryptionProperty | [[cdk.support/lookup-entry]] | `:encryption` |
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `maxLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-latency` |
| `mediaStreamOutputConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:media-stream-output-configurations` |
| `minLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-latency` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `remoteId` | java.lang.String | [[cdk.support/lookup-entry]] | `:remote-id` |
| `smoothingLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:smoothing-latency` |
| `streamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-id` |
| `vpcInterfaceAttachment` | software.amazon.awscdk.services.mediaconnect.CfnFlowOutput$VpcInterfaceAttachmentProperty | [[cdk.support/lookup-entry]] | `:vpc-interface-attachment` |"
  [stack id config]
  (let [builder (CfnFlowOutput$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidr-allow-list)]
      (. builder cidrAllowList data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :flow-arn)]
      (. builder flowArn data))
    (when-let [data (lookup-entry config id :max-latency)]
      (. builder maxLatency data))
    (when-let [data (lookup-entry config id :media-stream-output-configurations)]
      (. builder mediaStreamOutputConfigurations data))
    (when-let [data (lookup-entry config id :min-latency)]
      (. builder minLatency data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :remote-id)]
      (. builder remoteId data))
    (when-let [data (lookup-entry config id :smoothing-latency)]
      (. builder smoothingLatency data))
    (when-let [data (lookup-entry config id :stream-id)]
      (. builder streamId data))
    (when-let [data (lookup-entry config id :vpc-interface-attachment)]
      (. builder vpcInterfaceAttachment data))
    (.build builder)))


(defn cfn-flow-output-destination-configuration-property-builder
  "The cfn-flow-output-destination-configuration-property-builder function buildes out new instances of 
CfnFlowOutput$DestinationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-ip` |
| `destinationPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:destination-port` |
| `interfaceValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:interface-value` |"
  [stack id config]
  (let [builder (CfnFlowOutput$DestinationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-ip)]
      (. builder destinationIp data))
    (when-let [data (lookup-entry config id :destination-port)]
      (. builder destinationPort data))
    (when-let [data (lookup-entry config id :interface-value)]
      (. builder interfaceValue data))
    (.build builder)))


(defn cfn-flow-output-encoding-parameters-property-builder
  "The cfn-flow-output-encoding-parameters-property-builder function buildes out new instances of 
CfnFlowOutput$EncodingParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compressionFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compression-factor` |
| `encoderProfile` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoder-profile` |"
  [stack id config]
  (let [builder (CfnFlowOutput$EncodingParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :compression-factor)]
      (. builder compressionFactor data))
    (when-let [data (lookup-entry config id :encoder-profile)]
      (. builder encoderProfile data))
    (.build builder)))


(defn cfn-flow-output-encryption-property-builder
  "The cfn-flow-output-encryption-property-builder function buildes out new instances of 
CfnFlowOutput$EncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |"
  [stack id config]
  (let [builder (CfnFlowOutput$EncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :algorithm)]
      (. builder algorithm data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (.build builder)))


(defn cfn-flow-output-interface-property-builder
  "The cfn-flow-output-interface-property-builder function buildes out new instances of 
CfnFlowOutput$InterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnFlowOutput$InterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-flow-output-media-stream-output-configuration-property-builder
  "The cfn-flow-output-media-stream-output-configuration-property-builder function buildes out new instances of 
CfnFlowOutput$MediaStreamOutputConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-configurations` |
| `encodingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding-name` |
| `encodingParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encoding-parameters` |
| `mediaStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-stream-name` |"
  [stack id config]
  (let [builder (CfnFlowOutput$MediaStreamOutputConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-configurations)]
      (. builder destinationConfigurations data))
    (when-let [data (lookup-entry config id :encoding-name)]
      (. builder encodingName data))
    (when-let [data (lookup-entry config id :encoding-parameters)]
      (. builder encodingParameters data))
    (when-let [data (lookup-entry config id :media-stream-name)]
      (. builder mediaStreamName data))
    (.build builder)))


(defn cfn-flow-output-props-builder
  "The cfn-flow-output-props-builder function buildes out new instances of 
CfnFlowOutputProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrAllowList` | java.util.List | [[cdk.support/lookup-entry]] | `:cidr-allow-list` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `maxLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-latency` |
| `mediaStreamOutputConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:media-stream-output-configurations` |
| `minLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-latency` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `remoteId` | java.lang.String | [[cdk.support/lookup-entry]] | `:remote-id` |
| `smoothingLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:smoothing-latency` |
| `streamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-id` |
| `vpcInterfaceAttachment` | software.amazon.awscdk.services.mediaconnect.CfnFlowOutput$VpcInterfaceAttachmentProperty | [[cdk.support/lookup-entry]] | `:vpc-interface-attachment` |"
  [stack id config]
  (let [builder (CfnFlowOutputProps$Builder.)]
    (when-let [data (lookup-entry config id :cidr-allow-list)]
      (. builder cidrAllowList data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :encryption)]
      (. builder encryption data))
    (when-let [data (lookup-entry config id :flow-arn)]
      (. builder flowArn data))
    (when-let [data (lookup-entry config id :max-latency)]
      (. builder maxLatency data))
    (when-let [data (lookup-entry config id :media-stream-output-configurations)]
      (. builder mediaStreamOutputConfigurations data))
    (when-let [data (lookup-entry config id :min-latency)]
      (. builder minLatency data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :remote-id)]
      (. builder remoteId data))
    (when-let [data (lookup-entry config id :smoothing-latency)]
      (. builder smoothingLatency data))
    (when-let [data (lookup-entry config id :stream-id)]
      (. builder streamId data))
    (when-let [data (lookup-entry config id :vpc-interface-attachment)]
      (. builder vpcInterfaceAttachment data))
    (.build builder)))


(defn cfn-flow-output-vpc-interface-attachment-property-builder
  "The cfn-flow-output-vpc-interface-attachment-property-builder function buildes out new instances of 
CfnFlowOutput$VpcInterfaceAttachmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |"
  [stack id config]
  (let [builder (CfnFlowOutput$VpcInterfaceAttachmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :vpc-interface-name)]
      (. builder vpcInterfaceName data))
    (.build builder)))


(defn cfn-flow-props-builder
  "The cfn-flow-props-builder function buildes out new instances of 
CfnFlowProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `maintenance` | software.amazon.awscdk.services.mediaconnect.CfnFlow$MaintenanceProperty | [[cdk.support/lookup-entry]] | `:maintenance` |
| `mediaStreams` | java.util.List | [[cdk.support/lookup-entry]] | `:media-streams` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
| `sourceFailoverConfig` | software.amazon.awscdk.services.mediaconnect.CfnFlow$FailoverConfigProperty | [[cdk.support/lookup-entry]] | `:source-failover-config` |
| `vpcInterfaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-interfaces` |"
  [stack id config]
  (let [builder (CfnFlowProps$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :maintenance)]
      (. builder maintenance data))
    (when-let [data (lookup-entry config id :media-streams)]
      (. builder mediaStreams data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :source-failover-config)]
      (. builder sourceFailoverConfig data))
    (when-let [data (lookup-entry config id :vpc-interfaces)]
      (. builder vpcInterfaces data))
    (.build builder)))


(defn cfn-flow-source-builder
  "The cfn-flow-source-builder function buildes out new instances of 
CfnFlowSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `decryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:decryption` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entitlementArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-arn` |
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `gatewayBridgeSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gateway-bridge-source` |
| `ingestPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ingest-port` |
| `maxBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-bitrate` |
| `maxLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-latency` |
| `minLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-latency` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `senderControlPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sender-control-port` |
| `senderIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender-ip-address` |
| `sourceListenerAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-listener-address` |
| `sourceListenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:source-listener-port` |
| `streamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-id` |
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |
| `whitelistCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:whitelist-cidr` |"
  [stack id config]
  (let [builder (CfnFlowSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :decryption)]
      (. builder decryption data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :entitlement-arn)]
      (. builder entitlementArn data))
    (when-let [data (lookup-entry config id :flow-arn)]
      (. builder flowArn data))
    (when-let [data (lookup-entry config id :gateway-bridge-source)]
      (. builder gatewayBridgeSource data))
    (when-let [data (lookup-entry config id :ingest-port)]
      (. builder ingestPort data))
    (when-let [data (lookup-entry config id :max-bitrate)]
      (. builder maxBitrate data))
    (when-let [data (lookup-entry config id :max-latency)]
      (. builder maxLatency data))
    (when-let [data (lookup-entry config id :min-latency)]
      (. builder minLatency data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :sender-control-port)]
      (. builder senderControlPort data))
    (when-let [data (lookup-entry config id :sender-ip-address)]
      (. builder senderIpAddress data))
    (when-let [data (lookup-entry config id :source-listener-address)]
      (. builder sourceListenerAddress data))
    (when-let [data (lookup-entry config id :source-listener-port)]
      (. builder sourceListenerPort data))
    (when-let [data (lookup-entry config id :stream-id)]
      (. builder streamId data))
    (when-let [data (lookup-entry config id :vpc-interface-name)]
      (. builder vpcInterfaceName data))
    (when-let [data (lookup-entry config id :whitelist-cidr)]
      (. builder whitelistCidr data))
    (.build builder)))


(defn cfn-flow-source-encryption-property-builder
  "The cfn-flow-source-encryption-property-builder function buildes out new instances of 
CfnFlowSource$EncryptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `constantInitializationVector` | java.lang.String | [[cdk.support/lookup-entry]] | `:constant-initialization-vector` |
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnFlowSource$EncryptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :algorithm)]
      (. builder algorithm data))
    (when-let [data (lookup-entry config id :constant-initialization-vector)]
      (. builder constantInitializationVector data))
    (when-let [data (lookup-entry config id :device-id)]
      (. builder deviceId data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-flow-source-gateway-bridge-source-property-builder
  "The cfn-flow-source-gateway-bridge-source-property-builder function buildes out new instances of 
CfnFlowSource$GatewayBridgeSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `vpcInterfaceAttachment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-interface-attachment` |"
  [stack id config]
  (let [builder (CfnFlowSource$GatewayBridgeSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :bridge-arn)]
      (. builder bridgeArn data))
    (when-let [data (lookup-entry config id :vpc-interface-attachment)]
      (. builder vpcInterfaceAttachment data))
    (.build builder)))


(defn cfn-flow-source-priority-property-builder
  "The cfn-flow-source-priority-property-builder function buildes out new instances of 
CfnFlow$SourcePriorityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primarySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-source` |"
  [stack id config]
  (let [builder (CfnFlow$SourcePriorityProperty$Builder.)]
    (when-let [data (lookup-entry config id :primary-source)]
      (. builder primarySource data))
    (.build builder)))


(defn cfn-flow-source-property-builder
  "The cfn-flow-source-property-builder function buildes out new instances of 
CfnFlow$SourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `decryption` | software.amazon.awscdk.services.mediaconnect.CfnFlow$EncryptionProperty | [[cdk.support/lookup-entry]] | `:decryption` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entitlementArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-arn` |
| `gatewayBridgeSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gateway-bridge-source` |
| `ingestIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:ingest-ip` |
| `ingestPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ingest-port` |
| `maxBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-bitrate` |
| `maxLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-latency` |
| `maxSyncBuffer` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-sync-buffer` |
| `mediaStreamSourceConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:media-stream-source-configurations` |
| `minLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-latency` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `senderControlPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sender-control-port` |
| `senderIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender-ip-address` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `sourceIngestPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-ingest-port` |
| `sourceListenerAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-listener-address` |
| `sourceListenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:source-listener-port` |
| `streamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-id` |
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |
| `whitelistCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:whitelist-cidr` |"
  [stack id config]
  (let [builder (CfnFlow$SourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :decryption)]
      (. builder decryption data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :entitlement-arn)]
      (. builder entitlementArn data))
    (when-let [data (lookup-entry config id :gateway-bridge-source)]
      (. builder gatewayBridgeSource data))
    (when-let [data (lookup-entry config id :ingest-ip)]
      (. builder ingestIp data))
    (when-let [data (lookup-entry config id :ingest-port)]
      (. builder ingestPort data))
    (when-let [data (lookup-entry config id :max-bitrate)]
      (. builder maxBitrate data))
    (when-let [data (lookup-entry config id :max-latency)]
      (. builder maxLatency data))
    (when-let [data (lookup-entry config id :max-sync-buffer)]
      (. builder maxSyncBuffer data))
    (when-let [data (lookup-entry config id :media-stream-source-configurations)]
      (. builder mediaStreamSourceConfigurations data))
    (when-let [data (lookup-entry config id :min-latency)]
      (. builder minLatency data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :sender-control-port)]
      (. builder senderControlPort data))
    (when-let [data (lookup-entry config id :sender-ip-address)]
      (. builder senderIpAddress data))
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (when-let [data (lookup-entry config id :source-ingest-port)]
      (. builder sourceIngestPort data))
    (when-let [data (lookup-entry config id :source-listener-address)]
      (. builder sourceListenerAddress data))
    (when-let [data (lookup-entry config id :source-listener-port)]
      (. builder sourceListenerPort data))
    (when-let [data (lookup-entry config id :stream-id)]
      (. builder streamId data))
    (when-let [data (lookup-entry config id :vpc-interface-name)]
      (. builder vpcInterfaceName data))
    (when-let [data (lookup-entry config id :whitelist-cidr)]
      (. builder whitelistCidr data))
    (.build builder)))


(defn cfn-flow-source-props-builder
  "The cfn-flow-source-props-builder function buildes out new instances of 
CfnFlowSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `decryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:decryption` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entitlementArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-arn` |
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `gatewayBridgeSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gateway-bridge-source` |
| `ingestPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ingest-port` |
| `maxBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-bitrate` |
| `maxLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-latency` |
| `minLatency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-latency` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `senderControlPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sender-control-port` |
| `senderIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender-ip-address` |
| `sourceListenerAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-listener-address` |
| `sourceListenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:source-listener-port` |
| `streamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-id` |
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |
| `whitelistCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:whitelist-cidr` |"
  [stack id config]
  (let [builder (CfnFlowSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :decryption)]
      (. builder decryption data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :entitlement-arn)]
      (. builder entitlementArn data))
    (when-let [data (lookup-entry config id :flow-arn)]
      (. builder flowArn data))
    (when-let [data (lookup-entry config id :gateway-bridge-source)]
      (. builder gatewayBridgeSource data))
    (when-let [data (lookup-entry config id :ingest-port)]
      (. builder ingestPort data))
    (when-let [data (lookup-entry config id :max-bitrate)]
      (. builder maxBitrate data))
    (when-let [data (lookup-entry config id :max-latency)]
      (. builder maxLatency data))
    (when-let [data (lookup-entry config id :min-latency)]
      (. builder minLatency data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :sender-control-port)]
      (. builder senderControlPort data))
    (when-let [data (lookup-entry config id :sender-ip-address)]
      (. builder senderIpAddress data))
    (when-let [data (lookup-entry config id :source-listener-address)]
      (. builder sourceListenerAddress data))
    (when-let [data (lookup-entry config id :source-listener-port)]
      (. builder sourceListenerPort data))
    (when-let [data (lookup-entry config id :stream-id)]
      (. builder streamId data))
    (when-let [data (lookup-entry config id :vpc-interface-name)]
      (. builder vpcInterfaceName data))
    (when-let [data (lookup-entry config id :whitelist-cidr)]
      (. builder whitelistCidr data))
    (.build builder)))


(defn cfn-flow-source-vpc-interface-attachment-property-builder
  "The cfn-flow-source-vpc-interface-attachment-property-builder function buildes out new instances of 
CfnFlowSource$VpcInterfaceAttachmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |"
  [stack id config]
  (let [builder (CfnFlowSource$VpcInterfaceAttachmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :vpc-interface-name)]
      (. builder vpcInterfaceName data))
    (.build builder)))


(defn cfn-flow-vpc-interface-attachment-property-builder
  "The cfn-flow-vpc-interface-attachment-property-builder function buildes out new instances of 
CfnFlow$VpcInterfaceAttachmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |"
  [stack id config]
  (let [builder (CfnFlow$VpcInterfaceAttachmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :vpc-interface-name)]
      (. builder vpcInterfaceName data))
    (.build builder)))


(defn cfn-flow-vpc-interface-builder
  "The cfn-flow-vpc-interface-builder function buildes out new instances of 
CfnFlowVpcInterface$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnFlowVpcInterface$Builder/create stack id)]
    (when-let [data (lookup-entry config id :flow-arn)]
      (. builder flowArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-flow-vpc-interface-property-builder
  "The cfn-flow-vpc-interface-property-builder function buildes out new instances of 
CfnFlow$VpcInterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkInterfaceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:network-interface-ids` |
| `networkInterfaceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-type` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnFlow$VpcInterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :network-interface-ids)]
      (. builder networkInterfaceIds data))
    (when-let [data (lookup-entry config id :network-interface-type)]
      (. builder networkInterfaceType data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-flow-vpc-interface-props-builder
  "The cfn-flow-vpc-interface-props-builder function buildes out new instances of 
CfnFlowVpcInterfaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnFlowVpcInterfaceProps$Builder.)]
    (when-let [data (lookup-entry config id :flow-arn)]
      (. builder flowArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-gateway-builder
  "The cfn-gateway-builder function buildes out new instances of 
CfnGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:egress-cidr-blocks` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networks` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:networks` |"
  [stack id config]
  (let [builder (CfnGateway$Builder/create stack id)]
    (when-let [data (lookup-entry config id :egress-cidr-blocks)]
      (. builder egressCidrBlocks data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :networks)]
      (. builder networks data))
    (.build builder)))


(defn cfn-gateway-gateway-network-property-builder
  "The cfn-gateway-gateway-network-property-builder function buildes out new instances of 
CfnGateway$GatewayNetworkProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnGateway$GatewayNetworkProperty$Builder.)]
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-gateway-props-builder
  "The cfn-gateway-props-builder function buildes out new instances of 
CfnGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:egress-cidr-blocks` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networks` | java.util.List | [[cdk.support/lookup-entry]] | `:networks` |"
  [stack id config]
  (let [builder (CfnGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :egress-cidr-blocks)]
      (. builder egressCidrBlocks data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :networks)]
      (. builder networks data))
    (.build builder)))