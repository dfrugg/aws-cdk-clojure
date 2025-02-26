(ns cdk.api.services.networkmanager
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.networkmanager package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.networkmanager CfnConnectAttachment$Builder
                                                           CfnConnectAttachment$ConnectAttachmentOptionsProperty$Builder
                                                           CfnConnectAttachment$ProposedSegmentChangeProperty$Builder
                                                           CfnConnectAttachmentProps$Builder
                                                           CfnConnectPeer$BgpOptionsProperty$Builder
                                                           CfnConnectPeer$Builder
                                                           CfnConnectPeer$ConnectPeerBgpConfigurationProperty$Builder
                                                           CfnConnectPeer$ConnectPeerConfigurationProperty$Builder
                                                           CfnConnectPeerProps$Builder
                                                           CfnCoreNetwork$Builder
                                                           CfnCoreNetwork$CoreNetworkEdgeProperty$Builder
                                                           CfnCoreNetwork$CoreNetworkSegmentProperty$Builder
                                                           CfnCoreNetworkProps$Builder
                                                           CfnCustomerGatewayAssociation$Builder
                                                           CfnCustomerGatewayAssociationProps$Builder
                                                           CfnDevice$AWSLocationProperty$Builder
                                                           CfnDevice$Builder
                                                           CfnDevice$LocationProperty$Builder
                                                           CfnDeviceProps$Builder
                                                           CfnGlobalNetwork$Builder
                                                           CfnGlobalNetworkProps$Builder
                                                           CfnLink$BandwidthProperty$Builder
                                                           CfnLink$Builder
                                                           CfnLinkAssociation$Builder
                                                           CfnLinkAssociationProps$Builder
                                                           CfnLinkProps$Builder
                                                           CfnSite$Builder
                                                           CfnSite$LocationProperty$Builder
                                                           CfnSiteProps$Builder
                                                           CfnSiteToSiteVpnAttachment$Builder
                                                           CfnSiteToSiteVpnAttachment$ProposedSegmentChangeProperty$Builder
                                                           CfnSiteToSiteVpnAttachmentProps$Builder
                                                           CfnTransitGatewayPeering$Builder
                                                           CfnTransitGatewayPeeringProps$Builder
                                                           CfnTransitGatewayRegistration$Builder
                                                           CfnTransitGatewayRegistrationProps$Builder
                                                           CfnTransitGatewayRouteTableAttachment$Builder
                                                           CfnTransitGatewayRouteTableAttachment$ProposedSegmentChangeProperty$Builder
                                                           CfnTransitGatewayRouteTableAttachmentProps$Builder
                                                           CfnVpcAttachment$Builder
                                                           CfnVpcAttachment$ProposedSegmentChangeProperty$Builder
                                                           CfnVpcAttachment$VpcOptionsProperty$Builder
                                                           CfnVpcAttachmentProps$Builder]))


(defn build-cfn-connect-attachment-builder
  "The build-cfn-connect-attachment-builder function updates a CfnConnectAttachment$Builder instance using the provided configuration.
  The function takes the CfnConnectAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `edgeLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:edge-location` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transportAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transport-attachment-id` |
"
  [^CfnConnectAttachment$Builder builder id config]
  (when-let [data (lookup-entry config id :core-network-id)]
    (. builder coreNetworkId data))
  (when-let [data (lookup-entry config id :edge-location)]
    (. builder edgeLocation data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :proposed-segment-change)]
    (. builder proposedSegmentChange data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :transport-attachment-id)]
    (. builder transportAttachmentId data))
  (.build builder))


(defn cfn-connect-attachment-builder
  "Creates a  `CfnConnectAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-connect-attachment-builder (CfnConnectAttachment$Builder/create scope (name id)) id config))


(defn build-cfn-connect-attachment-connect-attachment-options-property-builder
  "The build-cfn-connect-attachment-connect-attachment-options-property-builder function updates a CfnConnectAttachment$ConnectAttachmentOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectAttachment$ConnectAttachmentOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnConnectAttachment$ConnectAttachmentOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn cfn-connect-attachment-connect-attachment-options-property-builder
  "Creates a  `CfnConnectAttachment$ConnectAttachmentOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connect-attachment-connect-attachment-options-property-builder (new CfnConnectAttachment$ConnectAttachmentOptionsProperty$Builder) id config))


(defn build-cfn-connect-attachment-proposed-segment-change-property-builder
  "The build-cfn-connect-attachment-proposed-segment-change-property-builder function updates a CfnConnectAttachment$ProposedSegmentChangeProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectAttachment$ProposedSegmentChangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentPolicyRuleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attachment-policy-rule-number` |
| `segmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConnectAttachment$ProposedSegmentChangeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attachment-policy-rule-number)]
    (. builder attachmentPolicyRuleNumber data))
  (when-let [data (lookup-entry config id :segment-name)]
    (. builder segmentName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-connect-attachment-proposed-segment-change-property-builder
  "Creates a  `CfnConnectAttachment$ProposedSegmentChangeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connect-attachment-proposed-segment-change-property-builder (new CfnConnectAttachment$ProposedSegmentChangeProperty$Builder) id config))


(defn build-cfn-connect-attachment-props-builder
  "The build-cfn-connect-attachment-props-builder function updates a CfnConnectAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnConnectAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `edgeLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:edge-location` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transportAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transport-attachment-id` |
"
  [^CfnConnectAttachmentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :core-network-id)]
    (. builder coreNetworkId data))
  (when-let [data (lookup-entry config id :edge-location)]
    (. builder edgeLocation data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :proposed-segment-change)]
    (. builder proposedSegmentChange data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :transport-attachment-id)]
    (. builder transportAttachmentId data))
  (.build builder))


(defn cfn-connect-attachment-props-builder
  "Creates a  `CfnConnectAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connect-attachment-props-builder (new CfnConnectAttachmentProps$Builder) id config))


(defn build-cfn-connect-peer-bgp-options-property-builder
  "The build-cfn-connect-peer-bgp-options-property-builder function updates a CfnConnectPeer$BgpOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectPeer$BgpOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `peerAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:peer-asn` |
"
  [^CfnConnectPeer$BgpOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :peer-asn)]
    (. builder peerAsn data))
  (.build builder))


(defn cfn-connect-peer-bgp-options-property-builder
  "Creates a  `CfnConnectPeer$BgpOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connect-peer-bgp-options-property-builder (new CfnConnectPeer$BgpOptionsProperty$Builder) id config))


(defn build-cfn-connect-peer-builder
  "The build-cfn-connect-peer-builder function updates a CfnConnectPeer$Builder instance using the provided configuration.
  The function takes the CfnConnectPeer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bgpOptions` | software.amazon.awscdk.services.networkmanager.CfnConnectPeer$BgpOptionsProperty | [[cdk.support/lookup-entry]] | `:bgp-options` |
| `connectAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-attachment-id` |
| `coreNetworkAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-address` |
| `insideCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:inside-cidr-blocks` |
| `peerAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-address` |
| `subnetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConnectPeer$Builder builder id config]
  (when-let [data (lookup-entry config id :bgp-options)]
    (. builder bgpOptions data))
  (when-let [data (lookup-entry config id :connect-attachment-id)]
    (. builder connectAttachmentId data))
  (when-let [data (lookup-entry config id :core-network-address)]
    (. builder coreNetworkAddress data))
  (when-let [data (lookup-entry config id :inside-cidr-blocks)]
    (. builder insideCidrBlocks data))
  (when-let [data (lookup-entry config id :peer-address)]
    (. builder peerAddress data))
  (when-let [data (lookup-entry config id :subnet-arn)]
    (. builder subnetArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-connect-peer-builder
  "Creates a  `CfnConnectPeer$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-connect-peer-builder (CfnConnectPeer$Builder/create scope (name id)) id config))


(defn build-cfn-connect-peer-connect-peer-bgp-configuration-property-builder
  "The build-cfn-connect-peer-connect-peer-bgp-configuration-property-builder function updates a CfnConnectPeer$ConnectPeerBgpConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectPeer$ConnectPeerBgpConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-address` |
| `coreNetworkAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:core-network-asn` |
| `peerAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-address` |
| `peerAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:peer-asn` |
"
  [^CfnConnectPeer$ConnectPeerBgpConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :core-network-address)]
    (. builder coreNetworkAddress data))
  (when-let [data (lookup-entry config id :core-network-asn)]
    (. builder coreNetworkAsn data))
  (when-let [data (lookup-entry config id :peer-address)]
    (. builder peerAddress data))
  (when-let [data (lookup-entry config id :peer-asn)]
    (. builder peerAsn data))
  (.build builder))


(defn cfn-connect-peer-connect-peer-bgp-configuration-property-builder
  "Creates a  `CfnConnectPeer$ConnectPeerBgpConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connect-peer-connect-peer-bgp-configuration-property-builder (new CfnConnectPeer$ConnectPeerBgpConfigurationProperty$Builder) id config))


(defn build-cfn-connect-peer-connect-peer-configuration-property-builder
  "The build-cfn-connect-peer-connect-peer-configuration-property-builder function updates a CfnConnectPeer$ConnectPeerConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnConnectPeer$ConnectPeerConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bgpConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bgp-configurations` |
| `coreNetworkAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-address` |
| `insideCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:inside-cidr-blocks` |
| `peerAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-address` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnConnectPeer$ConnectPeerConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bgp-configurations)]
    (. builder bgpConfigurations data))
  (when-let [data (lookup-entry config id :core-network-address)]
    (. builder coreNetworkAddress data))
  (when-let [data (lookup-entry config id :inside-cidr-blocks)]
    (. builder insideCidrBlocks data))
  (when-let [data (lookup-entry config id :peer-address)]
    (. builder peerAddress data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn cfn-connect-peer-connect-peer-configuration-property-builder
  "Creates a  `CfnConnectPeer$ConnectPeerConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connect-peer-connect-peer-configuration-property-builder (new CfnConnectPeer$ConnectPeerConfigurationProperty$Builder) id config))


(defn build-cfn-connect-peer-props-builder
  "The build-cfn-connect-peer-props-builder function updates a CfnConnectPeerProps$Builder instance using the provided configuration.
  The function takes the CfnConnectPeerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bgpOptions` | software.amazon.awscdk.services.networkmanager.CfnConnectPeer$BgpOptionsProperty | [[cdk.support/lookup-entry]] | `:bgp-options` |
| `connectAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-attachment-id` |
| `coreNetworkAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-address` |
| `insideCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:inside-cidr-blocks` |
| `peerAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-address` |
| `subnetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConnectPeerProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bgp-options)]
    (. builder bgpOptions data))
  (when-let [data (lookup-entry config id :connect-attachment-id)]
    (. builder connectAttachmentId data))
  (when-let [data (lookup-entry config id :core-network-address)]
    (. builder coreNetworkAddress data))
  (when-let [data (lookup-entry config id :inside-cidr-blocks)]
    (. builder insideCidrBlocks data))
  (when-let [data (lookup-entry config id :peer-address)]
    (. builder peerAddress data))
  (when-let [data (lookup-entry config id :subnet-arn)]
    (. builder subnetArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-connect-peer-props-builder
  "Creates a  `CfnConnectPeerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-connect-peer-props-builder (new CfnConnectPeerProps$Builder) id config))


(defn build-cfn-core-network-builder
  "The build-cfn-core-network-builder function updates a CfnCoreNetwork$Builder instance using the provided configuration.
  The function takes the CfnCoreNetwork$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCoreNetwork$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-core-network-builder
  "Creates a  `CfnCoreNetwork$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-core-network-builder (CfnCoreNetwork$Builder/create scope (name id)) id config))


(defn build-cfn-core-network-core-network-edge-property-builder
  "The build-cfn-core-network-core-network-edge-property-builder function updates a CfnCoreNetwork$CoreNetworkEdgeProperty$Builder instance using the provided configuration.
  The function takes the CfnCoreNetwork$CoreNetworkEdgeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `asn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:asn` |
| `edgeLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:edge-location` |
| `insideCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:inside-cidr-blocks` |
"
  [^CfnCoreNetwork$CoreNetworkEdgeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :asn)]
    (. builder asn data))
  (when-let [data (lookup-entry config id :edge-location)]
    (. builder edgeLocation data))
  (when-let [data (lookup-entry config id :inside-cidr-blocks)]
    (. builder insideCidrBlocks data))
  (.build builder))


(defn cfn-core-network-core-network-edge-property-builder
  "Creates a  `CfnCoreNetwork$CoreNetworkEdgeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-core-network-core-network-edge-property-builder (new CfnCoreNetwork$CoreNetworkEdgeProperty$Builder) id config))


(defn build-cfn-core-network-core-network-segment-property-builder
  "The build-cfn-core-network-core-network-segment-property-builder function updates a CfnCoreNetwork$CoreNetworkSegmentProperty$Builder instance using the provided configuration.
  The function takes the CfnCoreNetwork$CoreNetworkSegmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `edgeLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:edge-locations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sharedSegments` | java.util.List | [[cdk.support/lookup-entry]] | `:shared-segments` |
"
  [^CfnCoreNetwork$CoreNetworkSegmentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :edge-locations)]
    (. builder edgeLocations data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :shared-segments)]
    (. builder sharedSegments data))
  (.build builder))


(defn cfn-core-network-core-network-segment-property-builder
  "Creates a  `CfnCoreNetwork$CoreNetworkSegmentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-core-network-core-network-segment-property-builder (new CfnCoreNetwork$CoreNetworkSegmentProperty$Builder) id config))


(defn build-cfn-core-network-props-builder
  "The build-cfn-core-network-props-builder function updates a CfnCoreNetworkProps$Builder instance using the provided configuration.
  The function takes the CfnCoreNetworkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCoreNetworkProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-core-network-props-builder
  "Creates a  `CfnCoreNetworkProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-core-network-props-builder (new CfnCoreNetworkProps$Builder) id config))


(defn build-cfn-customer-gateway-association-builder
  "The build-cfn-customer-gateway-association-builder function updates a CfnCustomerGatewayAssociation$Builder instance using the provided configuration.
  The function takes the CfnCustomerGatewayAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-gateway-arn` |
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `linkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:link-id` |
"
  [^CfnCustomerGatewayAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :customer-gateway-arn)]
    (. builder customerGatewayArn data))
  (when-let [data (lookup-entry config id :device-id)]
    (. builder deviceId data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :link-id)]
    (. builder linkId data))
  (.build builder))


(defn cfn-customer-gateway-association-builder
  "Creates a  `CfnCustomerGatewayAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-customer-gateway-association-builder (CfnCustomerGatewayAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-customer-gateway-association-props-builder
  "The build-cfn-customer-gateway-association-props-builder function updates a CfnCustomerGatewayAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnCustomerGatewayAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-gateway-arn` |
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `linkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:link-id` |
"
  [^CfnCustomerGatewayAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :customer-gateway-arn)]
    (. builder customerGatewayArn data))
  (when-let [data (lookup-entry config id :device-id)]
    (. builder deviceId data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :link-id)]
    (. builder linkId data))
  (.build builder))


(defn cfn-customer-gateway-association-props-builder
  "Creates a  `CfnCustomerGatewayAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-customer-gateway-association-props-builder (new CfnCustomerGatewayAssociationProps$Builder) id config))


(defn build-cfn-device-aws-location-property-builder
  "The build-cfn-device-aws-location-property-builder function updates a CfnDevice$AWSLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnDevice$AWSLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subnetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-arn` |
| `zone` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^CfnDevice$AWSLocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :subnet-arn)]
    (. builder subnetArn data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn cfn-device-aws-location-property-builder
  "Creates a  `CfnDevice$AWSLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-device-aws-location-property-builder (new CfnDevice$AWSLocationProperty$Builder) id config))


(defn build-cfn-device-builder
  "The build-cfn-device-builder function updates a CfnDevice$Builder instance using the provided configuration.
  The function takes the CfnDevice$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-location` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `model` | java.lang.String | [[cdk.support/lookup-entry]] | `:model` |
| `serialNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:serial-number` |
| `siteId` | java.lang.String | [[cdk.support/lookup-entry]] | `:site-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `vendor` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor` |
"
  [^CfnDevice$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-location)]
    (. builder awsLocation data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :model)]
    (. builder model data))
  (when-let [data (lookup-entry config id :serial-number)]
    (. builder serialNumber data))
  (when-let [data (lookup-entry config id :site-id)]
    (. builder siteId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :vendor)]
    (. builder vendor data))
  (.build builder))


(defn cfn-device-builder
  "Creates a  `CfnDevice$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-device-builder (CfnDevice$Builder/create scope (name id)) id config))


(defn build-cfn-device-location-property-builder
  "The build-cfn-device-location-property-builder function updates a CfnDevice$LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnDevice$LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `latitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:longitude` |
"
  [^CfnDevice$LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :address)]
    (. builder address data))
  (when-let [data (lookup-entry config id :latitude)]
    (. builder latitude data))
  (when-let [data (lookup-entry config id :longitude)]
    (. builder longitude data))
  (.build builder))


(defn cfn-device-location-property-builder
  "Creates a  `CfnDevice$LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-device-location-property-builder (new CfnDevice$LocationProperty$Builder) id config))


(defn build-cfn-device-props-builder
  "The build-cfn-device-props-builder function updates a CfnDeviceProps$Builder instance using the provided configuration.
  The function takes the CfnDeviceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-location` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `location` | software.amazon.awscdk.services.networkmanager.CfnDevice$LocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `model` | java.lang.String | [[cdk.support/lookup-entry]] | `:model` |
| `serialNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:serial-number` |
| `siteId` | java.lang.String | [[cdk.support/lookup-entry]] | `:site-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `vendor` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor` |
"
  [^CfnDeviceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-location)]
    (. builder awsLocation data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :model)]
    (. builder model data))
  (when-let [data (lookup-entry config id :serial-number)]
    (. builder serialNumber data))
  (when-let [data (lookup-entry config id :site-id)]
    (. builder siteId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :vendor)]
    (. builder vendor data))
  (.build builder))


(defn cfn-device-props-builder
  "Creates a  `CfnDeviceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-device-props-builder (new CfnDeviceProps$Builder) id config))


(defn build-cfn-global-network-builder
  "The build-cfn-global-network-builder function updates a CfnGlobalNetwork$Builder instance using the provided configuration.
  The function takes the CfnGlobalNetwork$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createdAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-at` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGlobalNetwork$Builder builder id config]
  (when-let [data (lookup-entry config id :created-at)]
    (. builder createdAt data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :state)]
    (. builder state data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-global-network-builder
  "Creates a  `CfnGlobalNetwork$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-global-network-builder (CfnGlobalNetwork$Builder/create scope (name id)) id config))


(defn build-cfn-global-network-props-builder
  "The build-cfn-global-network-props-builder function updates a CfnGlobalNetworkProps$Builder instance using the provided configuration.
  The function takes the CfnGlobalNetworkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createdAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-at` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGlobalNetworkProps$Builder builder id config]
  (when-let [data (lookup-entry config id :created-at)]
    (. builder createdAt data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :state)]
    (. builder state data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-global-network-props-builder
  "Creates a  `CfnGlobalNetworkProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-global-network-props-builder (new CfnGlobalNetworkProps$Builder) id config))


(defn build-cfn-link-association-builder
  "The build-cfn-link-association-builder function updates a CfnLinkAssociation$Builder instance using the provided configuration.
  The function takes the CfnLinkAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `linkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:link-id` |
"
  [^CfnLinkAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :device-id)]
    (. builder deviceId data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :link-id)]
    (. builder linkId data))
  (.build builder))


(defn cfn-link-association-builder
  "Creates a  `CfnLinkAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-link-association-builder (CfnLinkAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-link-association-props-builder
  "The build-cfn-link-association-props-builder function updates a CfnLinkAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnLinkAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `linkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:link-id` |
"
  [^CfnLinkAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :device-id)]
    (. builder deviceId data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :link-id)]
    (. builder linkId data))
  (.build builder))


(defn cfn-link-association-props-builder
  "Creates a  `CfnLinkAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-link-association-props-builder (new CfnLinkAssociationProps$Builder) id config))


(defn build-cfn-link-bandwidth-property-builder
  "The build-cfn-link-bandwidth-property-builder function updates a CfnLink$BandwidthProperty$Builder instance using the provided configuration.
  The function takes the CfnLink$BandwidthProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `downloadSpeed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:download-speed` |
| `uploadSpeed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upload-speed` |
"
  [^CfnLink$BandwidthProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :download-speed)]
    (. builder downloadSpeed data))
  (when-let [data (lookup-entry config id :upload-speed)]
    (. builder uploadSpeed data))
  (.build builder))


(defn cfn-link-bandwidth-property-builder
  "Creates a  `CfnLink$BandwidthProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-link-bandwidth-property-builder (new CfnLink$BandwidthProperty$Builder) id config))


(defn build-cfn-link-builder
  "The build-cfn-link-builder function updates a CfnLink$Builder instance using the provided configuration.
  The function takes the CfnLink$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bandwidth` | software.amazon.awscdk.services.networkmanager.CfnLink$BandwidthProperty | [[cdk.support/lookup-entry]] | `:bandwidth` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `siteId` | java.lang.String | [[cdk.support/lookup-entry]] | `:site-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnLink$Builder builder id config]
  (when-let [data (lookup-entry config id :bandwidth)]
    (. builder bandwidth data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :provider)]
    (. builder provider data))
  (when-let [data (lookup-entry config id :site-id)]
    (. builder siteId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-link-builder
  "Creates a  `CfnLink$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-link-builder (CfnLink$Builder/create scope (name id)) id config))


(defn build-cfn-link-props-builder
  "The build-cfn-link-props-builder function updates a CfnLinkProps$Builder instance using the provided configuration.
  The function takes the CfnLinkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bandwidth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bandwidth` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `siteId` | java.lang.String | [[cdk.support/lookup-entry]] | `:site-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnLinkProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bandwidth)]
    (. builder bandwidth data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :provider)]
    (. builder provider data))
  (when-let [data (lookup-entry config id :site-id)]
    (. builder siteId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-link-props-builder
  "Creates a  `CfnLinkProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-link-props-builder (new CfnLinkProps$Builder) id config))


(defn build-cfn-site-builder
  "The build-cfn-site-builder function updates a CfnSite$Builder instance using the provided configuration.
  The function takes the CfnSite$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSite$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-site-builder
  "Creates a  `CfnSite$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-site-builder (CfnSite$Builder/create scope (name id)) id config))


(defn build-cfn-site-location-property-builder
  "The build-cfn-site-location-property-builder function updates a CfnSite$LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnSite$LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `latitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:longitude` |
"
  [^CfnSite$LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :address)]
    (. builder address data))
  (when-let [data (lookup-entry config id :latitude)]
    (. builder latitude data))
  (when-let [data (lookup-entry config id :longitude)]
    (. builder longitude data))
  (.build builder))


(defn cfn-site-location-property-builder
  "Creates a  `CfnSite$LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-site-location-property-builder (new CfnSite$LocationProperty$Builder) id config))


(defn build-cfn-site-props-builder
  "The build-cfn-site-props-builder function updates a CfnSiteProps$Builder instance using the provided configuration.
  The function takes the CfnSiteProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSiteProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-site-props-builder
  "Creates a  `CfnSiteProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-site-props-builder (new CfnSiteProps$Builder) id config))


(defn build-cfn-site-to-site-vpn-attachment-builder
  "The build-cfn-site-to-site-vpn-attachment-builder function updates a CfnSiteToSiteVpnAttachment$Builder instance using the provided configuration.
  The function takes the CfnSiteToSiteVpnAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpnConnectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-connection-arn` |
"
  [^CfnSiteToSiteVpnAttachment$Builder builder id config]
  (when-let [data (lookup-entry config id :core-network-id)]
    (. builder coreNetworkId data))
  (when-let [data (lookup-entry config id :proposed-segment-change)]
    (. builder proposedSegmentChange data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpn-connection-arn)]
    (. builder vpnConnectionArn data))
  (.build builder))


(defn cfn-site-to-site-vpn-attachment-builder
  "Creates a  `CfnSiteToSiteVpnAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-site-to-site-vpn-attachment-builder (CfnSiteToSiteVpnAttachment$Builder/create scope (name id)) id config))


(defn build-cfn-site-to-site-vpn-attachment-proposed-segment-change-property-builder
  "The build-cfn-site-to-site-vpn-attachment-proposed-segment-change-property-builder function updates a CfnSiteToSiteVpnAttachment$ProposedSegmentChangeProperty$Builder instance using the provided configuration.
  The function takes the CfnSiteToSiteVpnAttachment$ProposedSegmentChangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentPolicyRuleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attachment-policy-rule-number` |
| `segmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSiteToSiteVpnAttachment$ProposedSegmentChangeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attachment-policy-rule-number)]
    (. builder attachmentPolicyRuleNumber data))
  (when-let [data (lookup-entry config id :segment-name)]
    (. builder segmentName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-site-to-site-vpn-attachment-proposed-segment-change-property-builder
  "Creates a  `CfnSiteToSiteVpnAttachment$ProposedSegmentChangeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-site-to-site-vpn-attachment-proposed-segment-change-property-builder (new CfnSiteToSiteVpnAttachment$ProposedSegmentChangeProperty$Builder) id config))


(defn build-cfn-site-to-site-vpn-attachment-props-builder
  "The build-cfn-site-to-site-vpn-attachment-props-builder function updates a CfnSiteToSiteVpnAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnSiteToSiteVpnAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpnConnectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-connection-arn` |
"
  [^CfnSiteToSiteVpnAttachmentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :core-network-id)]
    (. builder coreNetworkId data))
  (when-let [data (lookup-entry config id :proposed-segment-change)]
    (. builder proposedSegmentChange data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpn-connection-arn)]
    (. builder vpnConnectionArn data))
  (.build builder))


(defn cfn-site-to-site-vpn-attachment-props-builder
  "Creates a  `CfnSiteToSiteVpnAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-site-to-site-vpn-attachment-props-builder (new CfnSiteToSiteVpnAttachmentProps$Builder) id config))


(defn build-cfn-transit-gateway-peering-builder
  "The build-cfn-transit-gateway-peering-builder function updates a CfnTransitGatewayPeering$Builder instance using the provided configuration.
  The function takes the CfnTransitGatewayPeering$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-arn` |
"
  [^CfnTransitGatewayPeering$Builder builder id config]
  (when-let [data (lookup-entry config id :core-network-id)]
    (. builder coreNetworkId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :transit-gateway-arn)]
    (. builder transitGatewayArn data))
  (.build builder))


(defn cfn-transit-gateway-peering-builder
  "Creates a  `CfnTransitGatewayPeering$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-transit-gateway-peering-builder (CfnTransitGatewayPeering$Builder/create scope (name id)) id config))


(defn build-cfn-transit-gateway-peering-props-builder
  "The build-cfn-transit-gateway-peering-props-builder function updates a CfnTransitGatewayPeeringProps$Builder instance using the provided configuration.
  The function takes the CfnTransitGatewayPeeringProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-arn` |
"
  [^CfnTransitGatewayPeeringProps$Builder builder id config]
  (when-let [data (lookup-entry config id :core-network-id)]
    (. builder coreNetworkId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :transit-gateway-arn)]
    (. builder transitGatewayArn data))
  (.build builder))


(defn cfn-transit-gateway-peering-props-builder
  "Creates a  `CfnTransitGatewayPeeringProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-transit-gateway-peering-props-builder (new CfnTransitGatewayPeeringProps$Builder) id config))


(defn build-cfn-transit-gateway-registration-builder
  "The build-cfn-transit-gateway-registration-builder function updates a CfnTransitGatewayRegistration$Builder instance using the provided configuration.
  The function takes the CfnTransitGatewayRegistration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `transitGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-arn` |
"
  [^CfnTransitGatewayRegistration$Builder builder id config]
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :transit-gateway-arn)]
    (. builder transitGatewayArn data))
  (.build builder))


(defn cfn-transit-gateway-registration-builder
  "Creates a  `CfnTransitGatewayRegistration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-transit-gateway-registration-builder (CfnTransitGatewayRegistration$Builder/create scope (name id)) id config))


(defn build-cfn-transit-gateway-registration-props-builder
  "The build-cfn-transit-gateway-registration-props-builder function updates a CfnTransitGatewayRegistrationProps$Builder instance using the provided configuration.
  The function takes the CfnTransitGatewayRegistrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `transitGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-arn` |
"
  [^CfnTransitGatewayRegistrationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :global-network-id)]
    (. builder globalNetworkId data))
  (when-let [data (lookup-entry config id :transit-gateway-arn)]
    (. builder transitGatewayArn data))
  (.build builder))


(defn cfn-transit-gateway-registration-props-builder
  "Creates a  `CfnTransitGatewayRegistrationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-transit-gateway-registration-props-builder (new CfnTransitGatewayRegistrationProps$Builder) id config))


(defn build-cfn-transit-gateway-route-table-attachment-builder
  "The build-cfn-transit-gateway-route-table-attachment-builder function updates a CfnTransitGatewayRouteTableAttachment$Builder instance using the provided configuration.
  The function takes the CfnTransitGatewayRouteTableAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `peeringId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peering-id` |
| `proposedSegmentChange` | software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment$ProposedSegmentChangeProperty | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayRouteTableArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-arn` |
"
  [^CfnTransitGatewayRouteTableAttachment$Builder builder id config]
  (when-let [data (lookup-entry config id :peering-id)]
    (. builder peeringId data))
  (when-let [data (lookup-entry config id :proposed-segment-change)]
    (. builder proposedSegmentChange data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :transit-gateway-route-table-arn)]
    (. builder transitGatewayRouteTableArn data))
  (.build builder))


(defn cfn-transit-gateway-route-table-attachment-builder
  "Creates a  `CfnTransitGatewayRouteTableAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-transit-gateway-route-table-attachment-builder (CfnTransitGatewayRouteTableAttachment$Builder/create scope (name id)) id config))


(defn build-cfn-transit-gateway-route-table-attachment-proposed-segment-change-property-builder
  "The build-cfn-transit-gateway-route-table-attachment-proposed-segment-change-property-builder function updates a CfnTransitGatewayRouteTableAttachment$ProposedSegmentChangeProperty$Builder instance using the provided configuration.
  The function takes the CfnTransitGatewayRouteTableAttachment$ProposedSegmentChangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentPolicyRuleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attachment-policy-rule-number` |
| `segmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTransitGatewayRouteTableAttachment$ProposedSegmentChangeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attachment-policy-rule-number)]
    (. builder attachmentPolicyRuleNumber data))
  (when-let [data (lookup-entry config id :segment-name)]
    (. builder segmentName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-transit-gateway-route-table-attachment-proposed-segment-change-property-builder
  "Creates a  `CfnTransitGatewayRouteTableAttachment$ProposedSegmentChangeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-transit-gateway-route-table-attachment-proposed-segment-change-property-builder (new CfnTransitGatewayRouteTableAttachment$ProposedSegmentChangeProperty$Builder) id config))


(defn build-cfn-transit-gateway-route-table-attachment-props-builder
  "The build-cfn-transit-gateway-route-table-attachment-props-builder function updates a CfnTransitGatewayRouteTableAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnTransitGatewayRouteTableAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `peeringId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peering-id` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayRouteTableArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-arn` |
"
  [^CfnTransitGatewayRouteTableAttachmentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :peering-id)]
    (. builder peeringId data))
  (when-let [data (lookup-entry config id :proposed-segment-change)]
    (. builder proposedSegmentChange data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :transit-gateway-route-table-arn)]
    (. builder transitGatewayRouteTableArn data))
  (.build builder))


(defn cfn-transit-gateway-route-table-attachment-props-builder
  "Creates a  `CfnTransitGatewayRouteTableAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-transit-gateway-route-table-attachment-props-builder (new CfnTransitGatewayRouteTableAttachmentProps$Builder) id config))


(defn build-cfn-vpc-attachment-builder
  "The build-cfn-vpc-attachment-builder function updates a CfnVpcAttachment$Builder instance using the provided configuration.
  The function takes the CfnVpcAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `subnetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-arn` |
"
  [^CfnVpcAttachment$Builder builder id config]
  (when-let [data (lookup-entry config id :core-network-id)]
    (. builder coreNetworkId data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :proposed-segment-change)]
    (. builder proposedSegmentChange data))
  (when-let [data (lookup-entry config id :subnet-arns)]
    (. builder subnetArns data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-arn)]
    (. builder vpcArn data))
  (.build builder))


(defn cfn-vpc-attachment-builder
  "Creates a  `CfnVpcAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-vpc-attachment-builder (CfnVpcAttachment$Builder/create scope (name id)) id config))


(defn build-cfn-vpc-attachment-proposed-segment-change-property-builder
  "The build-cfn-vpc-attachment-proposed-segment-change-property-builder function updates a CfnVpcAttachment$ProposedSegmentChangeProperty$Builder instance using the provided configuration.
  The function takes the CfnVpcAttachment$ProposedSegmentChangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentPolicyRuleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attachment-policy-rule-number` |
| `segmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnVpcAttachment$ProposedSegmentChangeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attachment-policy-rule-number)]
    (. builder attachmentPolicyRuleNumber data))
  (when-let [data (lookup-entry config id :segment-name)]
    (. builder segmentName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-vpc-attachment-proposed-segment-change-property-builder
  "Creates a  `CfnVpcAttachment$ProposedSegmentChangeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-vpc-attachment-proposed-segment-change-property-builder (new CfnVpcAttachment$ProposedSegmentChangeProperty$Builder) id config))


(defn build-cfn-vpc-attachment-props-builder
  "The build-cfn-vpc-attachment-props-builder function updates a CfnVpcAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnVpcAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
| `proposedSegmentChange` | software.amazon.awscdk.services.networkmanager.CfnVpcAttachment$ProposedSegmentChangeProperty | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `subnetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-arn` |
"
  [^CfnVpcAttachmentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :core-network-id)]
    (. builder coreNetworkId data))
  (when-let [data (lookup-entry config id :options)]
    (. builder options data))
  (when-let [data (lookup-entry config id :proposed-segment-change)]
    (. builder proposedSegmentChange data))
  (when-let [data (lookup-entry config id :subnet-arns)]
    (. builder subnetArns data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-arn)]
    (. builder vpcArn data))
  (.build builder))


(defn cfn-vpc-attachment-props-builder
  "Creates a  `CfnVpcAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-vpc-attachment-props-builder (new CfnVpcAttachmentProps$Builder) id config))


(defn build-cfn-vpc-attachment-vpc-options-property-builder
  "The build-cfn-vpc-attachment-vpc-options-property-builder function updates a CfnVpcAttachment$VpcOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnVpcAttachment$VpcOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applianceModeSupport` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:appliance-mode-support` |
| `ipv6Support` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-support` |
"
  [^CfnVpcAttachment$VpcOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :appliance-mode-support)]
    (. builder applianceModeSupport data))
  (when-let [data (lookup-entry config id :ipv6-support)]
    (. builder ipv6Support data))
  (.build builder))


(defn cfn-vpc-attachment-vpc-options-property-builder
  "Creates a  `CfnVpcAttachment$VpcOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-vpc-attachment-vpc-options-property-builder (new CfnVpcAttachment$VpcOptionsProperty$Builder) id config))