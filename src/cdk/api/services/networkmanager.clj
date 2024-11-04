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


(defn cfn-connect-attachment-builder
  "The cfn-connect-attachment-builder function buildes out new instances of 
CfnConnectAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `edgeLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:edge-location` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transportAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transport-attachment-id` |"
  [stack id config]
  (let [builder (CfnConnectAttachment$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-connect-attachment-connect-attachment-options-property-builder
  "The cfn-connect-attachment-connect-attachment-options-property-builder function buildes out new instances of 
CfnConnectAttachment$ConnectAttachmentOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnConnectAttachment$ConnectAttachmentOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn cfn-connect-attachment-proposed-segment-change-property-builder
  "The cfn-connect-attachment-proposed-segment-change-property-builder function buildes out new instances of 
CfnConnectAttachment$ProposedSegmentChangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentPolicyRuleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attachment-policy-rule-number` |
| `segmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConnectAttachment$ProposedSegmentChangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :attachment-policy-rule-number)]
      (. builder attachmentPolicyRuleNumber data))
    (when-let [data (lookup-entry config id :segment-name)]
      (. builder segmentName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-connect-attachment-props-builder
  "The cfn-connect-attachment-props-builder function buildes out new instances of 
CfnConnectAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `edgeLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:edge-location` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transportAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transport-attachment-id` |"
  [stack id config]
  (let [builder (CfnConnectAttachmentProps$Builder.)]
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
    (.build builder)))


(defn cfn-connect-peer-bgp-options-property-builder
  "The cfn-connect-peer-bgp-options-property-builder function buildes out new instances of 
CfnConnectPeer$BgpOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `peerAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:peer-asn` |"
  [stack id config]
  (let [builder (CfnConnectPeer$BgpOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :peer-asn)]
      (. builder peerAsn data))
    (.build builder)))


(defn cfn-connect-peer-builder
  "The cfn-connect-peer-builder function buildes out new instances of 
CfnConnectPeer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bgpOptions` | software.amazon.awscdk.services.networkmanager.CfnConnectPeer$BgpOptionsProperty | [[cdk.support/lookup-entry]] | `:bgp-options` |
| `connectAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-attachment-id` |
| `coreNetworkAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-address` |
| `insideCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:inside-cidr-blocks` |
| `peerAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-address` |
| `subnetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConnectPeer$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-connect-peer-connect-peer-bgp-configuration-property-builder
  "The cfn-connect-peer-connect-peer-bgp-configuration-property-builder function buildes out new instances of 
CfnConnectPeer$ConnectPeerBgpConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-address` |
| `coreNetworkAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:core-network-asn` |
| `peerAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-address` |
| `peerAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:peer-asn` |"
  [stack id config]
  (let [builder (CfnConnectPeer$ConnectPeerBgpConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :core-network-address)]
      (. builder coreNetworkAddress data))
    (when-let [data (lookup-entry config id :core-network-asn)]
      (. builder coreNetworkAsn data))
    (when-let [data (lookup-entry config id :peer-address)]
      (. builder peerAddress data))
    (when-let [data (lookup-entry config id :peer-asn)]
      (. builder peerAsn data))
    (.build builder)))


(defn cfn-connect-peer-connect-peer-configuration-property-builder
  "The cfn-connect-peer-connect-peer-configuration-property-builder function buildes out new instances of 
CfnConnectPeer$ConnectPeerConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bgpConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bgp-configurations` |
| `coreNetworkAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-address` |
| `insideCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:inside-cidr-blocks` |
| `peerAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-address` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnConnectPeer$ConnectPeerConfigurationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-connect-peer-props-builder
  "The cfn-connect-peer-props-builder function buildes out new instances of 
CfnConnectPeerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bgpOptions` | software.amazon.awscdk.services.networkmanager.CfnConnectPeer$BgpOptionsProperty | [[cdk.support/lookup-entry]] | `:bgp-options` |
| `connectAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-attachment-id` |
| `coreNetworkAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-address` |
| `insideCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:inside-cidr-blocks` |
| `peerAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-address` |
| `subnetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConnectPeerProps$Builder.)]
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
    (.build builder)))


(defn cfn-core-network-builder
  "The cfn-core-network-builder function buildes out new instances of 
CfnCoreNetwork$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCoreNetwork$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :global-network-id)]
      (. builder globalNetworkId data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-core-network-core-network-edge-property-builder
  "The cfn-core-network-core-network-edge-property-builder function buildes out new instances of 
CfnCoreNetwork$CoreNetworkEdgeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `asn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:asn` |
| `edgeLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:edge-location` |
| `insideCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:inside-cidr-blocks` |"
  [stack id config]
  (let [builder (CfnCoreNetwork$CoreNetworkEdgeProperty$Builder.)]
    (when-let [data (lookup-entry config id :asn)]
      (. builder asn data))
    (when-let [data (lookup-entry config id :edge-location)]
      (. builder edgeLocation data))
    (when-let [data (lookup-entry config id :inside-cidr-blocks)]
      (. builder insideCidrBlocks data))
    (.build builder)))


(defn cfn-core-network-core-network-segment-property-builder
  "The cfn-core-network-core-network-segment-property-builder function buildes out new instances of 
CfnCoreNetwork$CoreNetworkSegmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `edgeLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:edge-locations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sharedSegments` | java.util.List | [[cdk.support/lookup-entry]] | `:shared-segments` |"
  [stack id config]
  (let [builder (CfnCoreNetwork$CoreNetworkSegmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :edge-locations)]
      (. builder edgeLocations data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :shared-segments)]
      (. builder sharedSegments data))
    (.build builder)))


(defn cfn-core-network-props-builder
  "The cfn-core-network-props-builder function buildes out new instances of 
CfnCoreNetworkProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCoreNetworkProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :global-network-id)]
      (. builder globalNetworkId data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-customer-gateway-association-builder
  "The cfn-customer-gateway-association-builder function buildes out new instances of 
CfnCustomerGatewayAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-gateway-arn` |
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `linkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:link-id` |"
  [stack id config]
  (let [builder (CfnCustomerGatewayAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :customer-gateway-arn)]
      (. builder customerGatewayArn data))
    (when-let [data (lookup-entry config id :device-id)]
      (. builder deviceId data))
    (when-let [data (lookup-entry config id :global-network-id)]
      (. builder globalNetworkId data))
    (when-let [data (lookup-entry config id :link-id)]
      (. builder linkId data))
    (.build builder)))


(defn cfn-customer-gateway-association-props-builder
  "The cfn-customer-gateway-association-props-builder function buildes out new instances of 
CfnCustomerGatewayAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-gateway-arn` |
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `linkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:link-id` |"
  [stack id config]
  (let [builder (CfnCustomerGatewayAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :customer-gateway-arn)]
      (. builder customerGatewayArn data))
    (when-let [data (lookup-entry config id :device-id)]
      (. builder deviceId data))
    (when-let [data (lookup-entry config id :global-network-id)]
      (. builder globalNetworkId data))
    (when-let [data (lookup-entry config id :link-id)]
      (. builder linkId data))
    (.build builder)))


(defn cfn-device-aws-location-property-builder
  "The cfn-device-aws-location-property-builder function buildes out new instances of 
CfnDevice$AWSLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subnetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-arn` |
| `zone` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (CfnDevice$AWSLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :subnet-arn)]
      (. builder subnetArn data))
    (when-let [data (lookup-entry config id :zone)]
      (. builder zone data))
    (.build builder)))


(defn cfn-device-builder
  "The cfn-device-builder function buildes out new instances of 
CfnDevice$Builder using the provided configuration.  Each field is set as follows:

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
| `vendor` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor` |"
  [stack id config]
  (let [builder (CfnDevice$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-device-location-property-builder
  "The cfn-device-location-property-builder function buildes out new instances of 
CfnDevice$LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `latitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:longitude` |"
  [stack id config]
  (let [builder (CfnDevice$LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :latitude)]
      (. builder latitude data))
    (when-let [data (lookup-entry config id :longitude)]
      (. builder longitude data))
    (.build builder)))


(defn cfn-device-props-builder
  "The cfn-device-props-builder function buildes out new instances of 
CfnDeviceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vendor` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor` |"
  [stack id config]
  (let [builder (CfnDeviceProps$Builder.)]
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
    (.build builder)))


(defn cfn-global-network-builder
  "The cfn-global-network-builder function buildes out new instances of 
CfnGlobalNetwork$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createdAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-at` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGlobalNetwork$Builder/create stack id)]
    (when-let [data (lookup-entry config id :created-at)]
      (. builder createdAt data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-global-network-props-builder
  "The cfn-global-network-props-builder function buildes out new instances of 
CfnGlobalNetworkProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createdAt` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-at` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGlobalNetworkProps$Builder.)]
    (when-let [data (lookup-entry config id :created-at)]
      (. builder createdAt data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-link-association-builder
  "The cfn-link-association-builder function buildes out new instances of 
CfnLinkAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `linkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:link-id` |"
  [stack id config]
  (let [builder (CfnLinkAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :device-id)]
      (. builder deviceId data))
    (when-let [data (lookup-entry config id :global-network-id)]
      (. builder globalNetworkId data))
    (when-let [data (lookup-entry config id :link-id)]
      (. builder linkId data))
    (.build builder)))


(defn cfn-link-association-props-builder
  "The cfn-link-association-props-builder function buildes out new instances of 
CfnLinkAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `linkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:link-id` |"
  [stack id config]
  (let [builder (CfnLinkAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :device-id)]
      (. builder deviceId data))
    (when-let [data (lookup-entry config id :global-network-id)]
      (. builder globalNetworkId data))
    (when-let [data (lookup-entry config id :link-id)]
      (. builder linkId data))
    (.build builder)))


(defn cfn-link-bandwidth-property-builder
  "The cfn-link-bandwidth-property-builder function buildes out new instances of 
CfnLink$BandwidthProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `downloadSpeed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:download-speed` |
| `uploadSpeed` | java.lang.Number | [[cdk.support/lookup-entry]] | `:upload-speed` |"
  [stack id config]
  (let [builder (CfnLink$BandwidthProperty$Builder.)]
    (when-let [data (lookup-entry config id :download-speed)]
      (. builder downloadSpeed data))
    (when-let [data (lookup-entry config id :upload-speed)]
      (. builder uploadSpeed data))
    (.build builder)))


(defn cfn-link-builder
  "The cfn-link-builder function buildes out new instances of 
CfnLink$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bandwidth` | software.amazon.awscdk.services.networkmanager.CfnLink$BandwidthProperty | [[cdk.support/lookup-entry]] | `:bandwidth` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `siteId` | java.lang.String | [[cdk.support/lookup-entry]] | `:site-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnLink$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-link-props-builder
  "The cfn-link-props-builder function buildes out new instances of 
CfnLinkProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bandwidth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bandwidth` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `provider` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider` |
| `siteId` | java.lang.String | [[cdk.support/lookup-entry]] | `:site-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnLinkProps$Builder.)]
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
    (.build builder)))


(defn cfn-site-builder
  "The cfn-site-builder function buildes out new instances of 
CfnSite$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSite$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :global-network-id)]
      (. builder globalNetworkId data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-site-location-property-builder
  "The cfn-site-location-property-builder function buildes out new instances of 
CfnSite$LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `latitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:longitude` |"
  [stack id config]
  (let [builder (CfnSite$LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :latitude)]
      (. builder latitude data))
    (when-let [data (lookup-entry config id :longitude)]
      (. builder longitude data))
    (.build builder)))


(defn cfn-site-props-builder
  "The cfn-site-props-builder function buildes out new instances of 
CfnSiteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSiteProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :global-network-id)]
      (. builder globalNetworkId data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-site-to-site-vpn-attachment-builder
  "The cfn-site-to-site-vpn-attachment-builder function buildes out new instances of 
CfnSiteToSiteVpnAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpnConnectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-connection-arn` |"
  [stack id config]
  (let [builder (CfnSiteToSiteVpnAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :core-network-id)]
      (. builder coreNetworkId data))
    (when-let [data (lookup-entry config id :proposed-segment-change)]
      (. builder proposedSegmentChange data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpn-connection-arn)]
      (. builder vpnConnectionArn data))
    (.build builder)))


(defn cfn-site-to-site-vpn-attachment-proposed-segment-change-property-builder
  "The cfn-site-to-site-vpn-attachment-proposed-segment-change-property-builder function buildes out new instances of 
CfnSiteToSiteVpnAttachment$ProposedSegmentChangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentPolicyRuleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attachment-policy-rule-number` |
| `segmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSiteToSiteVpnAttachment$ProposedSegmentChangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :attachment-policy-rule-number)]
      (. builder attachmentPolicyRuleNumber data))
    (when-let [data (lookup-entry config id :segment-name)]
      (. builder segmentName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-site-to-site-vpn-attachment-props-builder
  "The cfn-site-to-site-vpn-attachment-props-builder function buildes out new instances of 
CfnSiteToSiteVpnAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpnConnectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-connection-arn` |"
  [stack id config]
  (let [builder (CfnSiteToSiteVpnAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :core-network-id)]
      (. builder coreNetworkId data))
    (when-let [data (lookup-entry config id :proposed-segment-change)]
      (. builder proposedSegmentChange data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpn-connection-arn)]
      (. builder vpnConnectionArn data))
    (.build builder)))


(defn cfn-transit-gateway-peering-builder
  "The cfn-transit-gateway-peering-builder function buildes out new instances of 
CfnTransitGatewayPeering$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-arn` |"
  [stack id config]
  (let [builder (CfnTransitGatewayPeering$Builder/create stack id)]
    (when-let [data (lookup-entry config id :core-network-id)]
      (. builder coreNetworkId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-arn)]
      (. builder transitGatewayArn data))
    (.build builder)))


(defn cfn-transit-gateway-peering-props-builder
  "The cfn-transit-gateway-peering-props-builder function buildes out new instances of 
CfnTransitGatewayPeeringProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-arn` |"
  [stack id config]
  (let [builder (CfnTransitGatewayPeeringProps$Builder.)]
    (when-let [data (lookup-entry config id :core-network-id)]
      (. builder coreNetworkId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-arn)]
      (. builder transitGatewayArn data))
    (.build builder)))


(defn cfn-transit-gateway-registration-builder
  "The cfn-transit-gateway-registration-builder function buildes out new instances of 
CfnTransitGatewayRegistration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `transitGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-arn` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRegistration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :global-network-id)]
      (. builder globalNetworkId data))
    (when-let [data (lookup-entry config id :transit-gateway-arn)]
      (. builder transitGatewayArn data))
    (.build builder)))


(defn cfn-transit-gateway-registration-props-builder
  "The cfn-transit-gateway-registration-props-builder function buildes out new instances of 
CfnTransitGatewayRegistrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `globalNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-network-id` |
| `transitGatewayArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-arn` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRegistrationProps$Builder.)]
    (when-let [data (lookup-entry config id :global-network-id)]
      (. builder globalNetworkId data))
    (when-let [data (lookup-entry config id :transit-gateway-arn)]
      (. builder transitGatewayArn data))
    (.build builder)))


(defn cfn-transit-gateway-route-table-attachment-builder
  "The cfn-transit-gateway-route-table-attachment-builder function buildes out new instances of 
CfnTransitGatewayRouteTableAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `peeringId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peering-id` |
| `proposedSegmentChange` | software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment$ProposedSegmentChangeProperty | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayRouteTableArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-arn` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRouteTableAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :peering-id)]
      (. builder peeringId data))
    (when-let [data (lookup-entry config id :proposed-segment-change)]
      (. builder proposedSegmentChange data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-route-table-arn)]
      (. builder transitGatewayRouteTableArn data))
    (.build builder)))


(defn cfn-transit-gateway-route-table-attachment-proposed-segment-change-property-builder
  "The cfn-transit-gateway-route-table-attachment-proposed-segment-change-property-builder function buildes out new instances of 
CfnTransitGatewayRouteTableAttachment$ProposedSegmentChangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentPolicyRuleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attachment-policy-rule-number` |
| `segmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRouteTableAttachment$ProposedSegmentChangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :attachment-policy-rule-number)]
      (. builder attachmentPolicyRuleNumber data))
    (when-let [data (lookup-entry config id :segment-name)]
      (. builder segmentName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-transit-gateway-route-table-attachment-props-builder
  "The cfn-transit-gateway-route-table-attachment-props-builder function buildes out new instances of 
CfnTransitGatewayRouteTableAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `peeringId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peering-id` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayRouteTableArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-arn` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRouteTableAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :peering-id)]
      (. builder peeringId data))
    (when-let [data (lookup-entry config id :proposed-segment-change)]
      (. builder proposedSegmentChange data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-route-table-arn)]
      (. builder transitGatewayRouteTableArn data))
    (.build builder)))


(defn cfn-vpc-attachment-builder
  "The cfn-vpc-attachment-builder function buildes out new instances of 
CfnVpcAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
| `proposedSegmentChange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `subnetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-arn` |"
  [stack id config]
  (let [builder (CfnVpcAttachment$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-vpc-attachment-proposed-segment-change-property-builder
  "The cfn-vpc-attachment-proposed-segment-change-property-builder function buildes out new instances of 
CfnVpcAttachment$ProposedSegmentChangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentPolicyRuleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:attachment-policy-rule-number` |
| `segmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnVpcAttachment$ProposedSegmentChangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :attachment-policy-rule-number)]
      (. builder attachmentPolicyRuleNumber data))
    (when-let [data (lookup-entry config id :segment-name)]
      (. builder segmentName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-vpc-attachment-props-builder
  "The cfn-vpc-attachment-props-builder function buildes out new instances of 
CfnVpcAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreNetworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-id` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
| `proposedSegmentChange` | software.amazon.awscdk.services.networkmanager.CfnVpcAttachment$ProposedSegmentChangeProperty | [[cdk.support/lookup-entry]] | `:proposed-segment-change` |
| `subnetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-arn` |"
  [stack id config]
  (let [builder (CfnVpcAttachmentProps$Builder.)]
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
    (.build builder)))


(defn cfn-vpc-attachment-vpc-options-property-builder
  "The cfn-vpc-attachment-vpc-options-property-builder function buildes out new instances of 
CfnVpcAttachment$VpcOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applianceModeSupport` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:appliance-mode-support` |
| `ipv6Support` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-support` |"
  [stack id config]
  (let [builder (CfnVpcAttachment$VpcOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :appliance-mode-support)]
      (. builder applianceModeSupport data))
    (when-let [data (lookup-entry config id :ipv6-support)]
      (. builder ipv6Support data))
    (.build builder)))