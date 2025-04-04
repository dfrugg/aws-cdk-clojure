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


(defn cfn-bridge-bridge-flow-source-property-builder>
  "The cfn-bridge-bridge-flow-source-property-builder> function updates a CfnBridge$BridgeFlowSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnBridge$BridgeFlowSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `flowVpcInterfaceAttachment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:flow-vpc-interface-attachment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnBridge$BridgeFlowSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :flow-arn)]
    (. builder flowArn data))
  (when-some [data (lookup-entry config id :flow-vpc-interface-attachment)]
    (. builder flowVpcInterfaceAttachment data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-bridge-bridge-flow-source-property-builder
  "Creates a  `CfnBridge$BridgeFlowSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-bridge-flow-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-bridge-flow-source-property-builder> (new CfnBridge$BridgeFlowSourceProperty$Builder) id config))


(defn cfn-bridge-bridge-network-output-property-builder>
  "The cfn-bridge-bridge-network-output-property-builder> function updates a CfnBridge$BridgeNetworkOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnBridge$BridgeNetworkOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |
"
  [^CfnBridge$BridgeNetworkOutputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ip-address)]
    (. builder ipAddress data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-name)]
    (. builder networkName data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (.build builder))


(defn cfn-bridge-bridge-network-output-property-builder
  "Creates a  `CfnBridge$BridgeNetworkOutputProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-bridge-network-output-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-bridge-network-output-property-builder> (new CfnBridge$BridgeNetworkOutputProperty$Builder) id config))


(defn cfn-bridge-bridge-network-source-property-builder>
  "The cfn-bridge-bridge-network-source-property-builder> function updates a CfnBridge$BridgeNetworkSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnBridge$BridgeNetworkSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `multicastIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:multicast-ip` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnBridge$BridgeNetworkSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :multicast-ip)]
    (. builder multicastIp data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-name)]
    (. builder networkName data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn cfn-bridge-bridge-network-source-property-builder
  "Creates a  `CfnBridge$BridgeNetworkSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-bridge-network-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-bridge-network-source-property-builder> (new CfnBridge$BridgeNetworkSourceProperty$Builder) id config))


(defn cfn-bridge-bridge-output-property-builder>
  "The cfn-bridge-bridge-output-property-builder> function updates a CfnBridge$BridgeOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnBridge$BridgeOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkOutput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-output` |
"
  [^CfnBridge$BridgeOutputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :network-output)]
    (. builder networkOutput data))
  (.build builder))


(defn cfn-bridge-bridge-output-property-builder
  "Creates a  `CfnBridge$BridgeOutputProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-bridge-output-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-bridge-output-property-builder> (new CfnBridge$BridgeOutputProperty$Builder) id config))


(defn cfn-bridge-bridge-source-property-builder>
  "The cfn-bridge-bridge-source-property-builder> function updates a CfnBridge$BridgeSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnBridge$BridgeSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowSource` | software.amazon.awscdk.services.mediaconnect.CfnBridge$BridgeFlowSourceProperty | [[cdk.support/lookup-entry]] | `:flow-source` |
| `networkSource` | software.amazon.awscdk.services.mediaconnect.CfnBridge$BridgeNetworkSourceProperty | [[cdk.support/lookup-entry]] | `:network-source` |
"
  [^CfnBridge$BridgeSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :flow-source)]
    (. builder flowSource data))
  (when-some [data (lookup-entry config id :network-source)]
    (. builder networkSource data))
  (.build builder))


(defn cfn-bridge-bridge-source-property-builder
  "Creates a  `CfnBridge$BridgeSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-bridge-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-bridge-source-property-builder> (new CfnBridge$BridgeSourceProperty$Builder) id config))


(defn cfn-bridge-builder>
  "The cfn-bridge-builder> function updates a CfnBridge$Builder instance using the provided configuration.
  The function takes the CfnBridge$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressGatewayBridge` | software.amazon.awscdk.services.mediaconnect.CfnBridge$EgressGatewayBridgeProperty | [[cdk.support/lookup-entry]] | `:egress-gateway-bridge` |
| `ingressGatewayBridge` | software.amazon.awscdk.services.mediaconnect.CfnBridge$IngressGatewayBridgeProperty | [[cdk.support/lookup-entry]] | `:ingress-gateway-bridge` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `placementArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-arn` |
| `sourceFailoverConfig` | software.amazon.awscdk.services.mediaconnect.CfnBridge$FailoverConfigProperty | [[cdk.support/lookup-entry]] | `:source-failover-config` |
| `sources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sources` |
"
  [^CfnBridge$Builder builder id config]
  (when-some [data (lookup-entry config id :egress-gateway-bridge)]
    (. builder egressGatewayBridge data))
  (when-some [data (lookup-entry config id :ingress-gateway-bridge)]
    (. builder ingressGatewayBridge data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-some [data (lookup-entry config id :placement-arn)]
    (. builder placementArn data))
  (when-some [data (lookup-entry config id :source-failover-config)]
    (. builder sourceFailoverConfig data))
  (when-some [data (lookup-entry config id :sources)]
    (. builder sources data))
  (.build builder))


(defn cfn-bridge-builder
  "Creates a  `CfnBridge$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-bridge-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-bridge-builder> (CfnBridge$Builder/create scope (name id)) id config))


(defn cfn-bridge-egress-gateway-bridge-property-builder>
  "The cfn-bridge-egress-gateway-bridge-property-builder> function updates a CfnBridge$EgressGatewayBridgeProperty$Builder instance using the provided configuration.
  The function takes the CfnBridge$EgressGatewayBridgeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-bitrate` |
"
  [^CfnBridge$EgressGatewayBridgeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-bitrate)]
    (. builder maxBitrate data))
  (.build builder))


(defn cfn-bridge-egress-gateway-bridge-property-builder
  "Creates a  `CfnBridge$EgressGatewayBridgeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-egress-gateway-bridge-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-egress-gateway-bridge-property-builder> (new CfnBridge$EgressGatewayBridgeProperty$Builder) id config))


(defn cfn-bridge-failover-config-property-builder>
  "The cfn-bridge-failover-config-property-builder> function updates a CfnBridge$FailoverConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnBridge$FailoverConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:failover-mode` |
| `sourcePriority` | software.amazon.awscdk.services.mediaconnect.CfnBridge$SourcePriorityProperty | [[cdk.support/lookup-entry]] | `:source-priority` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
"
  [^CfnBridge$FailoverConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :failover-mode)]
    (. builder failoverMode data))
  (when-some [data (lookup-entry config id :source-priority)]
    (. builder sourcePriority data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (.build builder))


(defn cfn-bridge-failover-config-property-builder
  "Creates a  `CfnBridge$FailoverConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-failover-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-failover-config-property-builder> (new CfnBridge$FailoverConfigProperty$Builder) id config))


(defn cfn-bridge-ingress-gateway-bridge-property-builder>
  "The cfn-bridge-ingress-gateway-bridge-property-builder> function updates a CfnBridge$IngressGatewayBridgeProperty$Builder instance using the provided configuration.
  The function takes the CfnBridge$IngressGatewayBridgeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxBitrate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-bitrate` |
| `maxOutputs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-outputs` |
"
  [^CfnBridge$IngressGatewayBridgeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-bitrate)]
    (. builder maxBitrate data))
  (when-some [data (lookup-entry config id :max-outputs)]
    (. builder maxOutputs data))
  (.build builder))


(defn cfn-bridge-ingress-gateway-bridge-property-builder
  "Creates a  `CfnBridge$IngressGatewayBridgeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-ingress-gateway-bridge-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-ingress-gateway-bridge-property-builder> (new CfnBridge$IngressGatewayBridgeProperty$Builder) id config))


(defn cfn-bridge-output-bridge-network-output-property-builder>
  "The cfn-bridge-output-bridge-network-output-property-builder> function updates a CfnBridgeOutput$BridgeNetworkOutputProperty$Builder instance using the provided configuration.
  The function takes the CfnBridgeOutput$BridgeNetworkOutputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `networkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |
"
  [^CfnBridgeOutput$BridgeNetworkOutputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ip-address)]
    (. builder ipAddress data))
  (when-some [data (lookup-entry config id :network-name)]
    (. builder networkName data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (.build builder))


(defn cfn-bridge-output-bridge-network-output-property-builder
  "Creates a  `CfnBridgeOutput$BridgeNetworkOutputProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-output-bridge-network-output-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-output-bridge-network-output-property-builder> (new CfnBridgeOutput$BridgeNetworkOutputProperty$Builder) id config))


(defn cfn-bridge-output-builder>
  "The cfn-bridge-output-builder> function updates a CfnBridgeOutput$Builder instance using the provided configuration.
  The function takes the CfnBridgeOutput$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkOutput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-output` |
"
  [^CfnBridgeOutput$Builder builder id config]
  (when-some [data (lookup-entry config id :bridge-arn)]
    (. builder bridgeArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-output)]
    (. builder networkOutput data))
  (.build builder))


(defn cfn-bridge-output-builder
  "Creates a  `CfnBridgeOutput$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-bridge-output-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-bridge-output-builder> (CfnBridgeOutput$Builder/create scope (name id)) id config))


(defn cfn-bridge-output-props-builder>
  "The cfn-bridge-output-props-builder> function updates a CfnBridgeOutputProps$Builder instance using the provided configuration.
  The function takes the CfnBridgeOutputProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkOutput` | software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput$BridgeNetworkOutputProperty | [[cdk.support/lookup-entry]] | `:network-output` |
"
  [^CfnBridgeOutputProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bridge-arn)]
    (. builder bridgeArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-output)]
    (. builder networkOutput data))
  (.build builder))


(defn cfn-bridge-output-props-builder
  "Creates a  `CfnBridgeOutputProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-output-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-output-props-builder> (new CfnBridgeOutputProps$Builder) id config))


(defn cfn-bridge-props-builder>
  "The cfn-bridge-props-builder> function updates a CfnBridgeProps$Builder instance using the provided configuration.
  The function takes the CfnBridgeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressGatewayBridge` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:egress-gateway-bridge` |
| `ingressGatewayBridge` | software.amazon.awscdk.services.mediaconnect.CfnBridge$IngressGatewayBridgeProperty | [[cdk.support/lookup-entry]] | `:ingress-gateway-bridge` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outputs` |
| `placementArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-arn` |
| `sourceFailoverConfig` | software.amazon.awscdk.services.mediaconnect.CfnBridge$FailoverConfigProperty | [[cdk.support/lookup-entry]] | `:source-failover-config` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
"
  [^CfnBridgeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :egress-gateway-bridge)]
    (. builder egressGatewayBridge data))
  (when-some [data (lookup-entry config id :ingress-gateway-bridge)]
    (. builder ingressGatewayBridge data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-some [data (lookup-entry config id :placement-arn)]
    (. builder placementArn data))
  (when-some [data (lookup-entry config id :source-failover-config)]
    (. builder sourceFailoverConfig data))
  (when-some [data (lookup-entry config id :sources)]
    (. builder sources data))
  (.build builder))


(defn cfn-bridge-props-builder
  "Creates a  `CfnBridgeProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-props-builder> (new CfnBridgeProps$Builder) id config))


(defn cfn-bridge-source-bridge-flow-source-property-builder>
  "The cfn-bridge-source-bridge-flow-source-property-builder> function updates a CfnBridgeSource$BridgeFlowSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnBridgeSource$BridgeFlowSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `flowVpcInterfaceAttachment` | software.amazon.awscdk.services.mediaconnect.CfnBridgeSource$VpcInterfaceAttachmentProperty | [[cdk.support/lookup-entry]] | `:flow-vpc-interface-attachment` |
"
  [^CfnBridgeSource$BridgeFlowSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :flow-arn)]
    (. builder flowArn data))
  (when-some [data (lookup-entry config id :flow-vpc-interface-attachment)]
    (. builder flowVpcInterfaceAttachment data))
  (.build builder))


(defn cfn-bridge-source-bridge-flow-source-property-builder
  "Creates a  `CfnBridgeSource$BridgeFlowSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-source-bridge-flow-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-source-bridge-flow-source-property-builder> (new CfnBridgeSource$BridgeFlowSourceProperty$Builder) id config))


(defn cfn-bridge-source-bridge-network-source-property-builder>
  "The cfn-bridge-source-bridge-network-source-property-builder> function updates a CfnBridgeSource$BridgeNetworkSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnBridgeSource$BridgeNetworkSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `multicastIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:multicast-ip` |
| `networkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnBridgeSource$BridgeNetworkSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :multicast-ip)]
    (. builder multicastIp data))
  (when-some [data (lookup-entry config id :network-name)]
    (. builder networkName data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn cfn-bridge-source-bridge-network-source-property-builder
  "Creates a  `CfnBridgeSource$BridgeNetworkSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-source-bridge-network-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-source-bridge-network-source-property-builder> (new CfnBridgeSource$BridgeNetworkSourceProperty$Builder) id config))


(defn cfn-bridge-source-builder>
  "The cfn-bridge-source-builder> function updates a CfnBridgeSource$Builder instance using the provided configuration.
  The function takes the CfnBridgeSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `flowSource` | software.amazon.awscdk.services.mediaconnect.CfnBridgeSource$BridgeFlowSourceProperty | [[cdk.support/lookup-entry]] | `:flow-source` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-source` |
"
  [^CfnBridgeSource$Builder builder id config]
  (when-some [data (lookup-entry config id :bridge-arn)]
    (. builder bridgeArn data))
  (when-some [data (lookup-entry config id :flow-source)]
    (. builder flowSource data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-source)]
    (. builder networkSource data))
  (.build builder))


(defn cfn-bridge-source-builder
  "Creates a  `CfnBridgeSource$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-bridge-source-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-bridge-source-builder> (CfnBridgeSource$Builder/create scope (name id)) id config))


(defn cfn-bridge-source-priority-property-builder>
  "The cfn-bridge-source-priority-property-builder> function updates a CfnBridge$SourcePriorityProperty$Builder instance using the provided configuration.
  The function takes the CfnBridge$SourcePriorityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primarySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-source` |
"
  [^CfnBridge$SourcePriorityProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :primary-source)]
    (. builder primarySource data))
  (.build builder))


(defn cfn-bridge-source-priority-property-builder
  "Creates a  `CfnBridge$SourcePriorityProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-source-priority-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-source-priority-property-builder> (new CfnBridge$SourcePriorityProperty$Builder) id config))


(defn cfn-bridge-source-props-builder>
  "The cfn-bridge-source-props-builder> function updates a CfnBridgeSourceProps$Builder instance using the provided configuration.
  The function takes the CfnBridgeSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `flowSource` | software.amazon.awscdk.services.mediaconnect.CfnBridgeSource$BridgeFlowSourceProperty | [[cdk.support/lookup-entry]] | `:flow-source` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-source` |
"
  [^CfnBridgeSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bridge-arn)]
    (. builder bridgeArn data))
  (when-some [data (lookup-entry config id :flow-source)]
    (. builder flowSource data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-source)]
    (. builder networkSource data))
  (.build builder))


(defn cfn-bridge-source-props-builder
  "Creates a  `CfnBridgeSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-source-props-builder> (new CfnBridgeSourceProps$Builder) id config))


(defn cfn-bridge-source-vpc-interface-attachment-property-builder>
  "The cfn-bridge-source-vpc-interface-attachment-property-builder> function updates a CfnBridgeSource$VpcInterfaceAttachmentProperty$Builder instance using the provided configuration.
  The function takes the CfnBridgeSource$VpcInterfaceAttachmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |
"
  [^CfnBridgeSource$VpcInterfaceAttachmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :vpc-interface-name)]
    (. builder vpcInterfaceName data))
  (.build builder))


(defn cfn-bridge-source-vpc-interface-attachment-property-builder
  "Creates a  `CfnBridgeSource$VpcInterfaceAttachmentProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-source-vpc-interface-attachment-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-source-vpc-interface-attachment-property-builder> (new CfnBridgeSource$VpcInterfaceAttachmentProperty$Builder) id config))


(defn cfn-bridge-vpc-interface-attachment-property-builder>
  "The cfn-bridge-vpc-interface-attachment-property-builder> function updates a CfnBridge$VpcInterfaceAttachmentProperty$Builder instance using the provided configuration.
  The function takes the CfnBridge$VpcInterfaceAttachmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |
"
  [^CfnBridge$VpcInterfaceAttachmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :vpc-interface-name)]
    (. builder vpcInterfaceName data))
  (.build builder))


(defn cfn-bridge-vpc-interface-attachment-property-builder
  "Creates a  `CfnBridge$VpcInterfaceAttachmentProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-bridge-vpc-interface-attachment-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-bridge-vpc-interface-attachment-property-builder> (new CfnBridge$VpcInterfaceAttachmentProperty$Builder) id config))


(defn cfn-flow-builder>
  "The cfn-flow-builder> function updates a CfnFlow$Builder instance using the provided configuration.
  The function takes the CfnFlow$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `maintenance` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maintenance` |
| `mediaStreams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:media-streams` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
| `sourceFailoverConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-failover-config` |
| `vpcInterfaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-interfaces` |
"
  [^CfnFlow$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :maintenance)]
    (. builder maintenance data))
  (when-some [data (lookup-entry config id :media-streams)]
    (. builder mediaStreams data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :source-failover-config)]
    (. builder sourceFailoverConfig data))
  (when-some [data (lookup-entry config id :vpc-interfaces)]
    (. builder vpcInterfaces data))
  (.build builder))


(defn cfn-flow-builder
  "Creates a  `CfnFlow$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-flow-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-flow-builder> (CfnFlow$Builder/create scope (name id)) id config))


(defn cfn-flow-encryption-property-builder>
  "The cfn-flow-encryption-property-builder> function updates a CfnFlow$EncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$EncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnFlow$EncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm)]
    (. builder algorithm data))
  (when-some [data (lookup-entry config id :constant-initialization-vector)]
    (. builder constantInitializationVector data))
  (when-some [data (lookup-entry config id :device-id)]
    (. builder deviceId data))
  (when-some [data (lookup-entry config id :key-type)]
    (. builder keyType data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-flow-encryption-property-builder
  "Creates a  `CfnFlow$EncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-encryption-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-encryption-property-builder> (new CfnFlow$EncryptionProperty$Builder) id config))


(defn cfn-flow-entitlement-builder>
  "The cfn-flow-entitlement-builder> function updates a CfnFlowEntitlement$Builder instance using the provided configuration.
  The function takes the CfnFlowEntitlement$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTransferSubscriberFeePercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-transfer-subscriber-fee-percent` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `entitlementStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-status` |
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |
"
  [^CfnFlowEntitlement$Builder builder id config]
  (when-some [data (lookup-entry config id :data-transfer-subscriber-fee-percent)]
    (. builder dataTransferSubscriberFeePercent data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :entitlement-status)]
    (. builder entitlementStatus data))
  (when-some [data (lookup-entry config id :flow-arn)]
    (. builder flowArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :subscribers)]
    (. builder subscribers data))
  (.build builder))


(defn cfn-flow-entitlement-builder
  "Creates a  `CfnFlowEntitlement$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-flow-entitlement-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-flow-entitlement-builder> (CfnFlowEntitlement$Builder/create scope (name id)) id config))


(defn cfn-flow-entitlement-encryption-property-builder>
  "The cfn-flow-entitlement-encryption-property-builder> function updates a CfnFlowEntitlement$EncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnFlowEntitlement$EncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnFlowEntitlement$EncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm)]
    (. builder algorithm data))
  (when-some [data (lookup-entry config id :constant-initialization-vector)]
    (. builder constantInitializationVector data))
  (when-some [data (lookup-entry config id :device-id)]
    (. builder deviceId data))
  (when-some [data (lookup-entry config id :key-type)]
    (. builder keyType data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-flow-entitlement-encryption-property-builder
  "Creates a  `CfnFlowEntitlement$EncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-entitlement-encryption-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-entitlement-encryption-property-builder> (new CfnFlowEntitlement$EncryptionProperty$Builder) id config))


(defn cfn-flow-entitlement-props-builder>
  "The cfn-flow-entitlement-props-builder> function updates a CfnFlowEntitlementProps$Builder instance using the provided configuration.
  The function takes the CfnFlowEntitlementProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTransferSubscriberFeePercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-transfer-subscriber-fee-percent` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption` |
| `entitlementStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:entitlement-status` |
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `subscribers` | java.util.List | [[cdk.support/lookup-entry]] | `:subscribers` |
"
  [^CfnFlowEntitlementProps$Builder builder id config]
  (when-some [data (lookup-entry config id :data-transfer-subscriber-fee-percent)]
    (. builder dataTransferSubscriberFeePercent data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :entitlement-status)]
    (. builder entitlementStatus data))
  (when-some [data (lookup-entry config id :flow-arn)]
    (. builder flowArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :subscribers)]
    (. builder subscribers data))
  (.build builder))


(defn cfn-flow-entitlement-props-builder
  "Creates a  `CfnFlowEntitlementProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-entitlement-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-entitlement-props-builder> (new CfnFlowEntitlementProps$Builder) id config))


(defn cfn-flow-failover-config-property-builder>
  "The cfn-flow-failover-config-property-builder> function updates a CfnFlow$FailoverConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$FailoverConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failoverMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:failover-mode` |
| `recoveryWindow` | java.lang.Number | [[cdk.support/lookup-entry]] | `:recovery-window` |
| `sourcePriority` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-priority` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
"
  [^CfnFlow$FailoverConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :failover-mode)]
    (. builder failoverMode data))
  (when-some [data (lookup-entry config id :recovery-window)]
    (. builder recoveryWindow data))
  (when-some [data (lookup-entry config id :source-priority)]
    (. builder sourcePriority data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (.build builder))


(defn cfn-flow-failover-config-property-builder
  "Creates a  `CfnFlow$FailoverConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-failover-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-failover-config-property-builder> (new CfnFlow$FailoverConfigProperty$Builder) id config))


(defn cfn-flow-fmtp-property-builder>
  "The cfn-flow-fmtp-property-builder> function updates a CfnFlow$FmtpProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$FmtpProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-order` |
| `colorimetry` | java.lang.String | [[cdk.support/lookup-entry]] | `:colorimetry` |
| `exactFramerate` | java.lang.String | [[cdk.support/lookup-entry]] | `:exact-framerate` |
| `par` | java.lang.String | [[cdk.support/lookup-entry]] | `:par` |
| `range` | java.lang.String | [[cdk.support/lookup-entry]] | `:range` |
| `scanMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:scan-mode` |
| `tcs` | java.lang.String | [[cdk.support/lookup-entry]] | `:tcs` |
"
  [^CfnFlow$FmtpProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :channel-order)]
    (. builder channelOrder data))
  (when-some [data (lookup-entry config id :colorimetry)]
    (. builder colorimetry data))
  (when-some [data (lookup-entry config id :exact-framerate)]
    (. builder exactFramerate data))
  (when-some [data (lookup-entry config id :par)]
    (. builder par data))
  (when-some [data (lookup-entry config id :range)]
    (. builder range data))
  (when-some [data (lookup-entry config id :scan-mode)]
    (. builder scanMode data))
  (when-some [data (lookup-entry config id :tcs)]
    (. builder tcs data))
  (.build builder))


(defn cfn-flow-fmtp-property-builder
  "Creates a  `CfnFlow$FmtpProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-fmtp-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-fmtp-property-builder> (new CfnFlow$FmtpProperty$Builder) id config))


(defn cfn-flow-gateway-bridge-source-property-builder>
  "The cfn-flow-gateway-bridge-source-property-builder> function updates a CfnFlow$GatewayBridgeSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$GatewayBridgeSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `vpcInterfaceAttachment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-interface-attachment` |
"
  [^CfnFlow$GatewayBridgeSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bridge-arn)]
    (. builder bridgeArn data))
  (when-some [data (lookup-entry config id :vpc-interface-attachment)]
    (. builder vpcInterfaceAttachment data))
  (.build builder))


(defn cfn-flow-gateway-bridge-source-property-builder
  "Creates a  `CfnFlow$GatewayBridgeSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-gateway-bridge-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-gateway-bridge-source-property-builder> (new CfnFlow$GatewayBridgeSourceProperty$Builder) id config))


(defn cfn-flow-input-configuration-property-builder>
  "The cfn-flow-input-configuration-property-builder> function updates a CfnFlow$InputConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$InputConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inputPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:input-port` |
| `interfaceValue` | software.amazon.awscdk.services.mediaconnect.CfnFlow$InterfaceProperty | [[cdk.support/lookup-entry]] | `:interface-value` |
"
  [^CfnFlow$InputConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :input-port)]
    (. builder inputPort data))
  (when-some [data (lookup-entry config id :interface-value)]
    (. builder interfaceValue data))
  (.build builder))


(defn cfn-flow-input-configuration-property-builder
  "Creates a  `CfnFlow$InputConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-input-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-input-configuration-property-builder> (new CfnFlow$InputConfigurationProperty$Builder) id config))


(defn cfn-flow-interface-property-builder>
  "The cfn-flow-interface-property-builder> function updates a CfnFlow$InterfaceProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$InterfaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnFlow$InterfaceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-flow-interface-property-builder
  "Creates a  `CfnFlow$InterfaceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-interface-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-interface-property-builder> (new CfnFlow$InterfaceProperty$Builder) id config))


(defn cfn-flow-maintenance-property-builder>
  "The cfn-flow-maintenance-property-builder> function updates a CfnFlow$MaintenanceProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$MaintenanceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maintenanceDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-day` |
| `maintenanceStartHour` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-start-hour` |
"
  [^CfnFlow$MaintenanceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :maintenance-day)]
    (. builder maintenanceDay data))
  (when-some [data (lookup-entry config id :maintenance-start-hour)]
    (. builder maintenanceStartHour data))
  (.build builder))


(defn cfn-flow-maintenance-property-builder
  "Creates a  `CfnFlow$MaintenanceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-maintenance-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-maintenance-property-builder> (new CfnFlow$MaintenanceProperty$Builder) id config))


(defn cfn-flow-media-stream-attributes-property-builder>
  "The cfn-flow-media-stream-attributes-property-builder> function updates a CfnFlow$MediaStreamAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$MediaStreamAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fmtp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fmtp` |
| `lang` | java.lang.String | [[cdk.support/lookup-entry]] | `:lang` |
"
  [^CfnFlow$MediaStreamAttributesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :fmtp)]
    (. builder fmtp data))
  (when-some [data (lookup-entry config id :lang)]
    (. builder lang data))
  (.build builder))


(defn cfn-flow-media-stream-attributes-property-builder
  "Creates a  `CfnFlow$MediaStreamAttributesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-media-stream-attributes-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-media-stream-attributes-property-builder> (new CfnFlow$MediaStreamAttributesProperty$Builder) id config))


(defn cfn-flow-media-stream-property-builder>
  "The cfn-flow-media-stream-property-builder> function updates a CfnFlow$MediaStreamProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$MediaStreamProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.services.mediaconnect.CfnFlow$MediaStreamAttributesProperty | [[cdk.support/lookup-entry]] | `:attributes` |
| `clockRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:clock-rate` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fmt` | java.lang.Number | [[cdk.support/lookup-entry]] | `:fmt` |
| `mediaStreamId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:media-stream-id` |
| `mediaStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-stream-name` |
| `mediaStreamType` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-stream-type` |
| `videoFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:video-format` |
"
  [^CfnFlow$MediaStreamProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :clock-rate)]
    (. builder clockRate data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :fmt)]
    (. builder fmt data))
  (when-some [data (lookup-entry config id :media-stream-id)]
    (. builder mediaStreamId data))
  (when-some [data (lookup-entry config id :media-stream-name)]
    (. builder mediaStreamName data))
  (when-some [data (lookup-entry config id :media-stream-type)]
    (. builder mediaStreamType data))
  (when-some [data (lookup-entry config id :video-format)]
    (. builder videoFormat data))
  (.build builder))


(defn cfn-flow-media-stream-property-builder
  "Creates a  `CfnFlow$MediaStreamProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-media-stream-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-media-stream-property-builder> (new CfnFlow$MediaStreamProperty$Builder) id config))


(defn cfn-flow-media-stream-source-configuration-property-builder>
  "The cfn-flow-media-stream-source-configuration-property-builder> function updates a CfnFlow$MediaStreamSourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$MediaStreamSourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encodingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding-name` |
| `inputConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:input-configurations` |
| `mediaStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-stream-name` |
"
  [^CfnFlow$MediaStreamSourceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encoding-name)]
    (. builder encodingName data))
  (when-some [data (lookup-entry config id :input-configurations)]
    (. builder inputConfigurations data))
  (when-some [data (lookup-entry config id :media-stream-name)]
    (. builder mediaStreamName data))
  (.build builder))


(defn cfn-flow-media-stream-source-configuration-property-builder
  "Creates a  `CfnFlow$MediaStreamSourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-media-stream-source-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-media-stream-source-configuration-property-builder> (new CfnFlow$MediaStreamSourceConfigurationProperty$Builder) id config))


(defn cfn-flow-output-builder>
  "The cfn-flow-output-builder> function updates a CfnFlowOutput$Builder instance using the provided configuration.
  The function takes the CfnFlowOutput$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcInterfaceAttachment` | software.amazon.awscdk.services.mediaconnect.CfnFlowOutput$VpcInterfaceAttachmentProperty | [[cdk.support/lookup-entry]] | `:vpc-interface-attachment` |
"
  [^CfnFlowOutput$Builder builder id config]
  (when-some [data (lookup-entry config id :cidr-allow-list)]
    (. builder cidrAllowList data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :flow-arn)]
    (. builder flowArn data))
  (when-some [data (lookup-entry config id :max-latency)]
    (. builder maxLatency data))
  (when-some [data (lookup-entry config id :media-stream-output-configurations)]
    (. builder mediaStreamOutputConfigurations data))
  (when-some [data (lookup-entry config id :min-latency)]
    (. builder minLatency data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :remote-id)]
    (. builder remoteId data))
  (when-some [data (lookup-entry config id :smoothing-latency)]
    (. builder smoothingLatency data))
  (when-some [data (lookup-entry config id :stream-id)]
    (. builder streamId data))
  (when-some [data (lookup-entry config id :vpc-interface-attachment)]
    (. builder vpcInterfaceAttachment data))
  (.build builder))


(defn cfn-flow-output-builder
  "Creates a  `CfnFlowOutput$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-flow-output-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-flow-output-builder> (CfnFlowOutput$Builder/create scope (name id)) id config))


(defn cfn-flow-output-destination-configuration-property-builder>
  "The cfn-flow-output-destination-configuration-property-builder> function updates a CfnFlowOutput$DestinationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFlowOutput$DestinationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-ip` |
| `destinationPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:destination-port` |
| `interfaceValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:interface-value` |
"
  [^CfnFlowOutput$DestinationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-ip)]
    (. builder destinationIp data))
  (when-some [data (lookup-entry config id :destination-port)]
    (. builder destinationPort data))
  (when-some [data (lookup-entry config id :interface-value)]
    (. builder interfaceValue data))
  (.build builder))


(defn cfn-flow-output-destination-configuration-property-builder
  "Creates a  `CfnFlowOutput$DestinationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-output-destination-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-output-destination-configuration-property-builder> (new CfnFlowOutput$DestinationConfigurationProperty$Builder) id config))


(defn cfn-flow-output-encoding-parameters-property-builder>
  "The cfn-flow-output-encoding-parameters-property-builder> function updates a CfnFlowOutput$EncodingParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnFlowOutput$EncodingParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `compressionFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:compression-factor` |
| `encoderProfile` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoder-profile` |
"
  [^CfnFlowOutput$EncodingParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :compression-factor)]
    (. builder compressionFactor data))
  (when-some [data (lookup-entry config id :encoder-profile)]
    (. builder encoderProfile data))
  (.build builder))


(defn cfn-flow-output-encoding-parameters-property-builder
  "Creates a  `CfnFlowOutput$EncodingParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-output-encoding-parameters-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-output-encoding-parameters-property-builder> (new CfnFlowOutput$EncodingParametersProperty$Builder) id config))


(defn cfn-flow-output-encryption-property-builder>
  "The cfn-flow-output-encryption-property-builder> function updates a CfnFlowOutput$EncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnFlowOutput$EncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
"
  [^CfnFlowOutput$EncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm)]
    (. builder algorithm data))
  (when-some [data (lookup-entry config id :key-type)]
    (. builder keyType data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (.build builder))


(defn cfn-flow-output-encryption-property-builder
  "Creates a  `CfnFlowOutput$EncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-output-encryption-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-output-encryption-property-builder> (new CfnFlowOutput$EncryptionProperty$Builder) id config))


(defn cfn-flow-output-interface-property-builder>
  "The cfn-flow-output-interface-property-builder> function updates a CfnFlowOutput$InterfaceProperty$Builder instance using the provided configuration.
  The function takes the CfnFlowOutput$InterfaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnFlowOutput$InterfaceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-flow-output-interface-property-builder
  "Creates a  `CfnFlowOutput$InterfaceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-output-interface-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-output-interface-property-builder> (new CfnFlowOutput$InterfaceProperty$Builder) id config))


(defn cfn-flow-output-media-stream-output-configuration-property-builder>
  "The cfn-flow-output-media-stream-output-configuration-property-builder> function updates a CfnFlowOutput$MediaStreamOutputConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFlowOutput$MediaStreamOutputConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-configurations` |
| `encodingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:encoding-name` |
| `encodingParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encoding-parameters` |
| `mediaStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-stream-name` |
"
  [^CfnFlowOutput$MediaStreamOutputConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-configurations)]
    (. builder destinationConfigurations data))
  (when-some [data (lookup-entry config id :encoding-name)]
    (. builder encodingName data))
  (when-some [data (lookup-entry config id :encoding-parameters)]
    (. builder encodingParameters data))
  (when-some [data (lookup-entry config id :media-stream-name)]
    (. builder mediaStreamName data))
  (.build builder))


(defn cfn-flow-output-media-stream-output-configuration-property-builder
  "Creates a  `CfnFlowOutput$MediaStreamOutputConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-output-media-stream-output-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-output-media-stream-output-configuration-property-builder> (new CfnFlowOutput$MediaStreamOutputConfigurationProperty$Builder) id config))


(defn cfn-flow-output-props-builder>
  "The cfn-flow-output-props-builder> function updates a CfnFlowOutputProps$Builder instance using the provided configuration.
  The function takes the CfnFlowOutputProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcInterfaceAttachment` | software.amazon.awscdk.services.mediaconnect.CfnFlowOutput$VpcInterfaceAttachmentProperty | [[cdk.support/lookup-entry]] | `:vpc-interface-attachment` |
"
  [^CfnFlowOutputProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cidr-allow-list)]
    (. builder cidrAllowList data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :encryption)]
    (. builder encryption data))
  (when-some [data (lookup-entry config id :flow-arn)]
    (. builder flowArn data))
  (when-some [data (lookup-entry config id :max-latency)]
    (. builder maxLatency data))
  (when-some [data (lookup-entry config id :media-stream-output-configurations)]
    (. builder mediaStreamOutputConfigurations data))
  (when-some [data (lookup-entry config id :min-latency)]
    (. builder minLatency data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :remote-id)]
    (. builder remoteId data))
  (when-some [data (lookup-entry config id :smoothing-latency)]
    (. builder smoothingLatency data))
  (when-some [data (lookup-entry config id :stream-id)]
    (. builder streamId data))
  (when-some [data (lookup-entry config id :vpc-interface-attachment)]
    (. builder vpcInterfaceAttachment data))
  (.build builder))


(defn cfn-flow-output-props-builder
  "Creates a  `CfnFlowOutputProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-output-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-output-props-builder> (new CfnFlowOutputProps$Builder) id config))


(defn cfn-flow-output-vpc-interface-attachment-property-builder>
  "The cfn-flow-output-vpc-interface-attachment-property-builder> function updates a CfnFlowOutput$VpcInterfaceAttachmentProperty$Builder instance using the provided configuration.
  The function takes the CfnFlowOutput$VpcInterfaceAttachmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |
"
  [^CfnFlowOutput$VpcInterfaceAttachmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :vpc-interface-name)]
    (. builder vpcInterfaceName data))
  (.build builder))


(defn cfn-flow-output-vpc-interface-attachment-property-builder
  "Creates a  `CfnFlowOutput$VpcInterfaceAttachmentProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-output-vpc-interface-attachment-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-output-vpc-interface-attachment-property-builder> (new CfnFlowOutput$VpcInterfaceAttachmentProperty$Builder) id config))


(defn cfn-flow-props-builder>
  "The cfn-flow-props-builder> function updates a CfnFlowProps$Builder instance using the provided configuration.
  The function takes the CfnFlowProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `maintenance` | software.amazon.awscdk.services.mediaconnect.CfnFlow$MaintenanceProperty | [[cdk.support/lookup-entry]] | `:maintenance` |
| `mediaStreams` | java.util.List | [[cdk.support/lookup-entry]] | `:media-streams` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
| `sourceFailoverConfig` | software.amazon.awscdk.services.mediaconnect.CfnFlow$FailoverConfigProperty | [[cdk.support/lookup-entry]] | `:source-failover-config` |
| `vpcInterfaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-interfaces` |
"
  [^CfnFlowProps$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :maintenance)]
    (. builder maintenance data))
  (when-some [data (lookup-entry config id :media-streams)]
    (. builder mediaStreams data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :source-failover-config)]
    (. builder sourceFailoverConfig data))
  (when-some [data (lookup-entry config id :vpc-interfaces)]
    (. builder vpcInterfaces data))
  (.build builder))


(defn cfn-flow-props-builder
  "Creates a  `CfnFlowProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-props-builder> (new CfnFlowProps$Builder) id config))


(defn cfn-flow-source-builder>
  "The cfn-flow-source-builder> function updates a CfnFlowSource$Builder instance using the provided configuration.
  The function takes the CfnFlowSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `whitelistCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:whitelist-cidr` |
"
  [^CfnFlowSource$Builder builder id config]
  (when-some [data (lookup-entry config id :decryption)]
    (. builder decryption data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :entitlement-arn)]
    (. builder entitlementArn data))
  (when-some [data (lookup-entry config id :flow-arn)]
    (. builder flowArn data))
  (when-some [data (lookup-entry config id :gateway-bridge-source)]
    (. builder gatewayBridgeSource data))
  (when-some [data (lookup-entry config id :ingest-port)]
    (. builder ingestPort data))
  (when-some [data (lookup-entry config id :max-bitrate)]
    (. builder maxBitrate data))
  (when-some [data (lookup-entry config id :max-latency)]
    (. builder maxLatency data))
  (when-some [data (lookup-entry config id :min-latency)]
    (. builder minLatency data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :sender-control-port)]
    (. builder senderControlPort data))
  (when-some [data (lookup-entry config id :sender-ip-address)]
    (. builder senderIpAddress data))
  (when-some [data (lookup-entry config id :source-listener-address)]
    (. builder sourceListenerAddress data))
  (when-some [data (lookup-entry config id :source-listener-port)]
    (. builder sourceListenerPort data))
  (when-some [data (lookup-entry config id :stream-id)]
    (. builder streamId data))
  (when-some [data (lookup-entry config id :vpc-interface-name)]
    (. builder vpcInterfaceName data))
  (when-some [data (lookup-entry config id :whitelist-cidr)]
    (. builder whitelistCidr data))
  (.build builder))


(defn cfn-flow-source-builder
  "Creates a  `CfnFlowSource$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-flow-source-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-flow-source-builder> (CfnFlowSource$Builder/create scope (name id)) id config))


(defn cfn-flow-source-encryption-property-builder>
  "The cfn-flow-source-encryption-property-builder> function updates a CfnFlowSource$EncryptionProperty$Builder instance using the provided configuration.
  The function takes the CfnFlowSource$EncryptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnFlowSource$EncryptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm)]
    (. builder algorithm data))
  (when-some [data (lookup-entry config id :constant-initialization-vector)]
    (. builder constantInitializationVector data))
  (when-some [data (lookup-entry config id :device-id)]
    (. builder deviceId data))
  (when-some [data (lookup-entry config id :key-type)]
    (. builder keyType data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-flow-source-encryption-property-builder
  "Creates a  `CfnFlowSource$EncryptionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-source-encryption-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-source-encryption-property-builder> (new CfnFlowSource$EncryptionProperty$Builder) id config))


(defn cfn-flow-source-gateway-bridge-source-property-builder>
  "The cfn-flow-source-gateway-bridge-source-property-builder> function updates a CfnFlowSource$GatewayBridgeSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnFlowSource$GatewayBridgeSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bridgeArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bridge-arn` |
| `vpcInterfaceAttachment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-interface-attachment` |
"
  [^CfnFlowSource$GatewayBridgeSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bridge-arn)]
    (. builder bridgeArn data))
  (when-some [data (lookup-entry config id :vpc-interface-attachment)]
    (. builder vpcInterfaceAttachment data))
  (.build builder))


(defn cfn-flow-source-gateway-bridge-source-property-builder
  "Creates a  `CfnFlowSource$GatewayBridgeSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-source-gateway-bridge-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-source-gateway-bridge-source-property-builder> (new CfnFlowSource$GatewayBridgeSourceProperty$Builder) id config))


(defn cfn-flow-source-priority-property-builder>
  "The cfn-flow-source-priority-property-builder> function updates a CfnFlow$SourcePriorityProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SourcePriorityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primarySource` | java.lang.String | [[cdk.support/lookup-entry]] | `:primary-source` |
"
  [^CfnFlow$SourcePriorityProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :primary-source)]
    (. builder primarySource data))
  (.build builder))


(defn cfn-flow-source-priority-property-builder
  "Creates a  `CfnFlow$SourcePriorityProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-source-priority-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-source-priority-property-builder> (new CfnFlow$SourcePriorityProperty$Builder) id config))


(defn cfn-flow-source-property-builder>
  "The cfn-flow-source-property-builder> function updates a CfnFlow$SourceProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$SourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `whitelistCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:whitelist-cidr` |
"
  [^CfnFlow$SourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :decryption)]
    (. builder decryption data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :entitlement-arn)]
    (. builder entitlementArn data))
  (when-some [data (lookup-entry config id :gateway-bridge-source)]
    (. builder gatewayBridgeSource data))
  (when-some [data (lookup-entry config id :ingest-ip)]
    (. builder ingestIp data))
  (when-some [data (lookup-entry config id :ingest-port)]
    (. builder ingestPort data))
  (when-some [data (lookup-entry config id :max-bitrate)]
    (. builder maxBitrate data))
  (when-some [data (lookup-entry config id :max-latency)]
    (. builder maxLatency data))
  (when-some [data (lookup-entry config id :max-sync-buffer)]
    (. builder maxSyncBuffer data))
  (when-some [data (lookup-entry config id :media-stream-source-configurations)]
    (. builder mediaStreamSourceConfigurations data))
  (when-some [data (lookup-entry config id :min-latency)]
    (. builder minLatency data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :sender-control-port)]
    (. builder senderControlPort data))
  (when-some [data (lookup-entry config id :sender-ip-address)]
    (. builder senderIpAddress data))
  (when-some [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (when-some [data (lookup-entry config id :source-ingest-port)]
    (. builder sourceIngestPort data))
  (when-some [data (lookup-entry config id :source-listener-address)]
    (. builder sourceListenerAddress data))
  (when-some [data (lookup-entry config id :source-listener-port)]
    (. builder sourceListenerPort data))
  (when-some [data (lookup-entry config id :stream-id)]
    (. builder streamId data))
  (when-some [data (lookup-entry config id :vpc-interface-name)]
    (. builder vpcInterfaceName data))
  (when-some [data (lookup-entry config id :whitelist-cidr)]
    (. builder whitelistCidr data))
  (.build builder))


(defn cfn-flow-source-property-builder
  "Creates a  `CfnFlow$SourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-source-property-builder> (new CfnFlow$SourceProperty$Builder) id config))


(defn cfn-flow-source-props-builder>
  "The cfn-flow-source-props-builder> function updates a CfnFlowSourceProps$Builder instance using the provided configuration.
  The function takes the CfnFlowSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `whitelistCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:whitelist-cidr` |
"
  [^CfnFlowSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :decryption)]
    (. builder decryption data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :entitlement-arn)]
    (. builder entitlementArn data))
  (when-some [data (lookup-entry config id :flow-arn)]
    (. builder flowArn data))
  (when-some [data (lookup-entry config id :gateway-bridge-source)]
    (. builder gatewayBridgeSource data))
  (when-some [data (lookup-entry config id :ingest-port)]
    (. builder ingestPort data))
  (when-some [data (lookup-entry config id :max-bitrate)]
    (. builder maxBitrate data))
  (when-some [data (lookup-entry config id :max-latency)]
    (. builder maxLatency data))
  (when-some [data (lookup-entry config id :min-latency)]
    (. builder minLatency data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :sender-control-port)]
    (. builder senderControlPort data))
  (when-some [data (lookup-entry config id :sender-ip-address)]
    (. builder senderIpAddress data))
  (when-some [data (lookup-entry config id :source-listener-address)]
    (. builder sourceListenerAddress data))
  (when-some [data (lookup-entry config id :source-listener-port)]
    (. builder sourceListenerPort data))
  (when-some [data (lookup-entry config id :stream-id)]
    (. builder streamId data))
  (when-some [data (lookup-entry config id :vpc-interface-name)]
    (. builder vpcInterfaceName data))
  (when-some [data (lookup-entry config id :whitelist-cidr)]
    (. builder whitelistCidr data))
  (.build builder))


(defn cfn-flow-source-props-builder
  "Creates a  `CfnFlowSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-source-props-builder> (new CfnFlowSourceProps$Builder) id config))


(defn cfn-flow-source-vpc-interface-attachment-property-builder>
  "The cfn-flow-source-vpc-interface-attachment-property-builder> function updates a CfnFlowSource$VpcInterfaceAttachmentProperty$Builder instance using the provided configuration.
  The function takes the CfnFlowSource$VpcInterfaceAttachmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |
"
  [^CfnFlowSource$VpcInterfaceAttachmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :vpc-interface-name)]
    (. builder vpcInterfaceName data))
  (.build builder))


(defn cfn-flow-source-vpc-interface-attachment-property-builder
  "Creates a  `CfnFlowSource$VpcInterfaceAttachmentProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-source-vpc-interface-attachment-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-source-vpc-interface-attachment-property-builder> (new CfnFlowSource$VpcInterfaceAttachmentProperty$Builder) id config))


(defn cfn-flow-vpc-interface-attachment-property-builder>
  "The cfn-flow-vpc-interface-attachment-property-builder> function updates a CfnFlow$VpcInterfaceAttachmentProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$VpcInterfaceAttachmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcInterfaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-interface-name` |
"
  [^CfnFlow$VpcInterfaceAttachmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :vpc-interface-name)]
    (. builder vpcInterfaceName data))
  (.build builder))


(defn cfn-flow-vpc-interface-attachment-property-builder
  "Creates a  `CfnFlow$VpcInterfaceAttachmentProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-vpc-interface-attachment-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-vpc-interface-attachment-property-builder> (new CfnFlow$VpcInterfaceAttachmentProperty$Builder) id config))


(defn cfn-flow-vpc-interface-builder>
  "The cfn-flow-vpc-interface-builder> function updates a CfnFlowVpcInterface$Builder instance using the provided configuration.
  The function takes the CfnFlowVpcInterface$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnFlowVpcInterface$Builder builder id config]
  (when-some [data (lookup-entry config id :flow-arn)]
    (. builder flowArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-flow-vpc-interface-builder
  "Creates a  `CfnFlowVpcInterface$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-flow-vpc-interface-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-flow-vpc-interface-builder> (CfnFlowVpcInterface$Builder/create scope (name id)) id config))


(defn cfn-flow-vpc-interface-property-builder>
  "The cfn-flow-vpc-interface-property-builder> function updates a CfnFlow$VpcInterfaceProperty$Builder instance using the provided configuration.
  The function takes the CfnFlow$VpcInterfaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networkInterfaceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:network-interface-ids` |
| `networkInterfaceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-type` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnFlow$VpcInterfaceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :network-interface-ids)]
    (. builder networkInterfaceIds data))
  (when-some [data (lookup-entry config id :network-interface-type)]
    (. builder networkInterfaceType data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-flow-vpc-interface-property-builder
  "Creates a  `CfnFlow$VpcInterfaceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-vpc-interface-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-vpc-interface-property-builder> (new CfnFlow$VpcInterfaceProperty$Builder) id config))


(defn cfn-flow-vpc-interface-props-builder>
  "The cfn-flow-vpc-interface-props-builder> function updates a CfnFlowVpcInterfaceProps$Builder instance using the provided configuration.
  The function takes the CfnFlowVpcInterfaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnFlowVpcInterfaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :flow-arn)]
    (. builder flowArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-flow-vpc-interface-props-builder
  "Creates a  `CfnFlowVpcInterfaceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-flow-vpc-interface-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-flow-vpc-interface-props-builder> (new CfnFlowVpcInterfaceProps$Builder) id config))


(defn cfn-gateway-builder>
  "The cfn-gateway-builder> function updates a CfnGateway$Builder instance using the provided configuration.
  The function takes the CfnGateway$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:egress-cidr-blocks` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networks` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:networks` |
"
  [^CfnGateway$Builder builder id config]
  (when-some [data (lookup-entry config id :egress-cidr-blocks)]
    (. builder egressCidrBlocks data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :networks)]
    (. builder networks data))
  (.build builder))


(defn cfn-gateway-builder
  "Creates a  `CfnGateway$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-gateway-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-gateway-builder> (CfnGateway$Builder/create scope (name id)) id config))


(defn cfn-gateway-gateway-network-property-builder>
  "The cfn-gateway-gateway-network-property-builder> function updates a CfnGateway$GatewayNetworkProperty$Builder instance using the provided configuration.
  The function takes the CfnGateway$GatewayNetworkProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnGateway$GatewayNetworkProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cidr-block)]
    (. builder cidrBlock data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-gateway-gateway-network-property-builder
  "Creates a  `CfnGateway$GatewayNetworkProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-gateway-gateway-network-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-gateway-gateway-network-property-builder> (new CfnGateway$GatewayNetworkProperty$Builder) id config))


(defn cfn-gateway-props-builder>
  "The cfn-gateway-props-builder> function updates a CfnGatewayProps$Builder instance using the provided configuration.
  The function takes the CfnGatewayProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:egress-cidr-blocks` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `networks` | java.util.List | [[cdk.support/lookup-entry]] | `:networks` |
"
  [^CfnGatewayProps$Builder builder id config]
  (when-some [data (lookup-entry config id :egress-cidr-blocks)]
    (. builder egressCidrBlocks data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :networks)]
    (. builder networks data))
  (.build builder))


(defn cfn-gateway-props-builder
  "Creates a  `CfnGatewayProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-gateway-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-gateway-props-builder> (new CfnGatewayProps$Builder) id config))