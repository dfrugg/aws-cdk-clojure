(ns cdk.api.services.ec2
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ec2 package. "
  (:require [cdk.api :refer [asset-hash-type
                             ignore-mode
                             removal-policy
                             symlink-follow-mode]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ec2 AclCidrConfig$Builder
                                                AclIcmp$Builder
                                                AclPortRange$Builder
                                                AclTrafficConfig$Builder
                                                Action
                                                AddRouteOptions$Builder
                                                AddressFamily
                                                AllocateCidrRequest$Builder
                                                AllocateIpv6CidrRequest$Builder
                                                AllocateVpcIpv6CidrRequest$Builder
                                                AllocatedSubnet$Builder
                                                AmazonLinux2022ImageSsmParameter$Builder
                                                AmazonLinux2022ImageSsmParameterProps$Builder
                                                AmazonLinux2023ImageSsmParameter$Builder
                                                AmazonLinux2023ImageSsmParameterProps$Builder
                                                AmazonLinux2ImageSsmParameter$Builder
                                                AmazonLinux2ImageSsmParameterProps$Builder
                                                AmazonLinuxCpuType
                                                AmazonLinuxEdition
                                                AmazonLinuxGeneration
                                                AmazonLinuxImage$Builder
                                                AmazonLinuxImageProps$Builder
                                                AmazonLinuxImageSsmParameterBaseOptions$Builder
                                                AmazonLinuxImageSsmParameterBaseProps$Builder
                                                AmazonLinuxImageSsmParameterCommonOptions$Builder
                                                AmazonLinuxKernel
                                                AmazonLinuxStorage
                                                AmazonLinuxVirt
                                                ApplyCloudFormationInitOptions$Builder
                                                AttachInitOptions$Builder
                                                AwsIpamProps$Builder
                                                BastionHostLinux$Builder
                                                BastionHostLinuxProps$Builder
                                                BlockDevice$Builder
                                                CfnCapacityReservation$Builder
                                                CfnCapacityReservation$TagSpecificationProperty$Builder
                                                CfnCapacityReservationFleet$Builder
                                                CfnCapacityReservationFleet$InstanceTypeSpecificationProperty$Builder
                                                CfnCapacityReservationFleet$TagSpecificationProperty$Builder
                                                CfnCapacityReservationFleetProps$Builder
                                                CfnCapacityReservationProps$Builder
                                                CfnCarrierGateway$Builder
                                                CfnCarrierGatewayProps$Builder
                                                CfnClientVpnAuthorizationRule$Builder
                                                CfnClientVpnAuthorizationRuleProps$Builder
                                                CfnClientVpnEndpoint$Builder
                                                CfnClientVpnEndpoint$CertificateAuthenticationRequestProperty$Builder
                                                CfnClientVpnEndpoint$ClientAuthenticationRequestProperty$Builder
                                                CfnClientVpnEndpoint$ClientConnectOptionsProperty$Builder
                                                CfnClientVpnEndpoint$ClientLoginBannerOptionsProperty$Builder
                                                CfnClientVpnEndpoint$ConnectionLogOptionsProperty$Builder
                                                CfnClientVpnEndpoint$DirectoryServiceAuthenticationRequestProperty$Builder
                                                CfnClientVpnEndpoint$FederatedAuthenticationRequestProperty$Builder
                                                CfnClientVpnEndpoint$TagSpecificationProperty$Builder
                                                CfnClientVpnEndpointProps$Builder
                                                CfnClientVpnRoute$Builder
                                                CfnClientVpnRouteProps$Builder
                                                CfnClientVpnTargetNetworkAssociation$Builder
                                                CfnClientVpnTargetNetworkAssociationProps$Builder
                                                CfnCustomerGateway$Builder
                                                CfnCustomerGatewayProps$Builder
                                                CfnDHCPOptions$Builder
                                                CfnDHCPOptionsProps$Builder
                                                CfnEC2Fleet$AcceleratorCountRequestProperty$Builder
                                                CfnEC2Fleet$AcceleratorTotalMemoryMiBRequestProperty$Builder
                                                CfnEC2Fleet$BaselineEbsBandwidthMbpsRequestProperty$Builder
                                                CfnEC2Fleet$Builder
                                                CfnEC2Fleet$CapacityRebalanceProperty$Builder
                                                CfnEC2Fleet$CapacityReservationOptionsRequestProperty$Builder
                                                CfnEC2Fleet$FleetLaunchTemplateConfigRequestProperty$Builder
                                                CfnEC2Fleet$FleetLaunchTemplateOverridesRequestProperty$Builder
                                                CfnEC2Fleet$FleetLaunchTemplateSpecificationRequestProperty$Builder
                                                CfnEC2Fleet$InstanceRequirementsRequestProperty$Builder
                                                CfnEC2Fleet$MaintenanceStrategiesProperty$Builder
                                                CfnEC2Fleet$MemoryGiBPerVCpuRequestProperty$Builder
                                                CfnEC2Fleet$MemoryMiBRequestProperty$Builder
                                                CfnEC2Fleet$NetworkBandwidthGbpsRequestProperty$Builder
                                                CfnEC2Fleet$NetworkInterfaceCountRequestProperty$Builder
                                                CfnEC2Fleet$OnDemandOptionsRequestProperty$Builder
                                                CfnEC2Fleet$PlacementProperty$Builder
                                                CfnEC2Fleet$SpotOptionsRequestProperty$Builder
                                                CfnEC2Fleet$TagSpecificationProperty$Builder
                                                CfnEC2Fleet$TargetCapacitySpecificationRequestProperty$Builder
                                                CfnEC2Fleet$TotalLocalStorageGBRequestProperty$Builder
                                                CfnEC2Fleet$VCpuCountRangeRequestProperty$Builder
                                                CfnEC2FleetProps$Builder
                                                CfnEIP$Builder
                                                CfnEIPAssociation$Builder
                                                CfnEIPAssociationProps$Builder
                                                CfnEIPProps$Builder
                                                CfnEgressOnlyInternetGateway$Builder
                                                CfnEgressOnlyInternetGatewayProps$Builder
                                                CfnEnclaveCertificateIamRoleAssociation$Builder
                                                CfnEnclaveCertificateIamRoleAssociationProps$Builder
                                                CfnFlowLog$Builder
                                                CfnFlowLog$DestinationOptionsProperty$Builder
                                                CfnFlowLogProps$Builder
                                                CfnGatewayRouteTableAssociation$Builder
                                                CfnGatewayRouteTableAssociationProps$Builder
                                                CfnHost$Builder
                                                CfnHostProps$Builder
                                                CfnIPAM$Builder
                                                CfnIPAM$IpamOperatingRegionProperty$Builder
                                                CfnIPAMAllocation$Builder
                                                CfnIPAMAllocationProps$Builder
                                                CfnIPAMPool$Builder
                                                CfnIPAMPool$ProvisionedCidrProperty$Builder
                                                CfnIPAMPool$SourceResourceProperty$Builder
                                                CfnIPAMPoolCidr$Builder
                                                CfnIPAMPoolCidrProps$Builder
                                                CfnIPAMPoolProps$Builder
                                                CfnIPAMProps$Builder
                                                CfnIPAMResourceDiscovery$Builder
                                                CfnIPAMResourceDiscovery$IpamOperatingRegionProperty$Builder
                                                CfnIPAMResourceDiscoveryAssociation$Builder
                                                CfnIPAMResourceDiscoveryAssociationProps$Builder
                                                CfnIPAMResourceDiscoveryProps$Builder
                                                CfnIPAMScope$Builder
                                                CfnIPAMScopeProps$Builder
                                                CfnInstance$AssociationParameterProperty$Builder
                                                CfnInstance$BlockDeviceMappingProperty$Builder
                                                CfnInstance$Builder
                                                CfnInstance$CpuOptionsProperty$Builder
                                                CfnInstance$CreditSpecificationProperty$Builder
                                                CfnInstance$EbsProperty$Builder
                                                CfnInstance$ElasticGpuSpecificationProperty$Builder
                                                CfnInstance$ElasticInferenceAcceleratorProperty$Builder
                                                CfnInstance$EnclaveOptionsProperty$Builder
                                                CfnInstance$HibernationOptionsProperty$Builder
                                                CfnInstance$InstanceIpv6AddressProperty$Builder
                                                CfnInstance$LaunchTemplateSpecificationProperty$Builder
                                                CfnInstance$LicenseSpecificationProperty$Builder
                                                CfnInstance$NetworkInterfaceProperty$Builder
                                                CfnInstance$NoDeviceProperty$Builder
                                                CfnInstance$PrivateDnsNameOptionsProperty$Builder
                                                CfnInstance$PrivateIpAddressSpecificationProperty$Builder
                                                CfnInstance$SsmAssociationProperty$Builder
                                                CfnInstance$StateProperty$Builder
                                                CfnInstance$VolumeProperty$Builder
                                                CfnInstanceConnectEndpoint$Builder
                                                CfnInstanceConnectEndpointProps$Builder
                                                CfnInstanceProps$Builder
                                                CfnInternetGateway$Builder
                                                CfnInternetGatewayProps$Builder
                                                CfnKeyPair$Builder
                                                CfnKeyPairProps$Builder
                                                CfnLaunchTemplate$AcceleratorCountProperty$Builder
                                                CfnLaunchTemplate$AcceleratorTotalMemoryMiBProperty$Builder
                                                CfnLaunchTemplate$BaselineEbsBandwidthMbpsProperty$Builder
                                                CfnLaunchTemplate$BlockDeviceMappingProperty$Builder
                                                CfnLaunchTemplate$Builder
                                                CfnLaunchTemplate$CapacityReservationSpecificationProperty$Builder
                                                CfnLaunchTemplate$CapacityReservationTargetProperty$Builder
                                                CfnLaunchTemplate$ConnectionTrackingSpecificationProperty$Builder
                                                CfnLaunchTemplate$CpuOptionsProperty$Builder
                                                CfnLaunchTemplate$CreditSpecificationProperty$Builder
                                                CfnLaunchTemplate$EbsProperty$Builder
                                                CfnLaunchTemplate$ElasticGpuSpecificationProperty$Builder
                                                CfnLaunchTemplate$EnaSrdSpecificationProperty$Builder
                                                CfnLaunchTemplate$EnaSrdUdpSpecificationProperty$Builder
                                                CfnLaunchTemplate$EnclaveOptionsProperty$Builder
                                                CfnLaunchTemplate$HibernationOptionsProperty$Builder
                                                CfnLaunchTemplate$IamInstanceProfileProperty$Builder
                                                CfnLaunchTemplate$InstanceMarketOptionsProperty$Builder
                                                CfnLaunchTemplate$InstanceRequirementsProperty$Builder
                                                CfnLaunchTemplate$Ipv4PrefixSpecificationProperty$Builder
                                                CfnLaunchTemplate$Ipv6AddProperty$Builder
                                                CfnLaunchTemplate$Ipv6PrefixSpecificationProperty$Builder
                                                CfnLaunchTemplate$LaunchTemplateDataProperty$Builder
                                                CfnLaunchTemplate$LaunchTemplateElasticInferenceAcceleratorProperty$Builder
                                                CfnLaunchTemplate$LaunchTemplateTagSpecificationProperty$Builder
                                                CfnLaunchTemplate$LicenseSpecificationProperty$Builder
                                                CfnLaunchTemplate$MaintenanceOptionsProperty$Builder
                                                CfnLaunchTemplate$MemoryGiBPerVCpuProperty$Builder
                                                CfnLaunchTemplate$MemoryMiBProperty$Builder
                                                CfnLaunchTemplate$MetadataOptionsProperty$Builder
                                                CfnLaunchTemplate$MonitoringProperty$Builder
                                                CfnLaunchTemplate$NetworkBandwidthGbpsProperty$Builder
                                                CfnLaunchTemplate$NetworkInterfaceCountProperty$Builder
                                                CfnLaunchTemplate$NetworkInterfaceProperty$Builder
                                                CfnLaunchTemplate$PlacementProperty$Builder
                                                CfnLaunchTemplate$PrivateDnsNameOptionsProperty$Builder
                                                CfnLaunchTemplate$PrivateIpAddProperty$Builder
                                                CfnLaunchTemplate$SpotOptionsProperty$Builder
                                                CfnLaunchTemplate$TagSpecificationProperty$Builder
                                                CfnLaunchTemplate$TotalLocalStorageGBProperty$Builder
                                                CfnLaunchTemplate$VCpuCountProperty$Builder
                                                CfnLaunchTemplateProps$Builder
                                                CfnLocalGatewayRoute$Builder
                                                CfnLocalGatewayRouteProps$Builder
                                                CfnLocalGatewayRouteTable$Builder
                                                CfnLocalGatewayRouteTableProps$Builder
                                                CfnLocalGatewayRouteTableVPCAssociation$Builder
                                                CfnLocalGatewayRouteTableVPCAssociationProps$Builder
                                                CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation$Builder
                                                CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps$Builder
                                                CfnNatGateway$Builder
                                                CfnNatGatewayProps$Builder
                                                CfnNetworkAcl$Builder
                                                CfnNetworkAclEntry$Builder
                                                CfnNetworkAclEntry$IcmpProperty$Builder
                                                CfnNetworkAclEntry$PortRangeProperty$Builder
                                                CfnNetworkAclEntryProps$Builder
                                                CfnNetworkAclProps$Builder
                                                CfnNetworkInsightsAccessScope$AccessScopePathRequestProperty$Builder
                                                CfnNetworkInsightsAccessScope$Builder
                                                CfnNetworkInsightsAccessScope$PacketHeaderStatementRequestProperty$Builder
                                                CfnNetworkInsightsAccessScope$PathStatementRequestProperty$Builder
                                                CfnNetworkInsightsAccessScope$ResourceStatementRequestProperty$Builder
                                                CfnNetworkInsightsAccessScope$ThroughResourcesStatementRequestProperty$Builder
                                                CfnNetworkInsightsAccessScopeAnalysis$Builder
                                                CfnNetworkInsightsAccessScopeAnalysisProps$Builder
                                                CfnNetworkInsightsAccessScopeProps$Builder
                                                CfnNetworkInsightsAnalysis$AdditionalDetailProperty$Builder
                                                CfnNetworkInsightsAnalysis$AlternatePathHintProperty$Builder
                                                CfnNetworkInsightsAnalysis$AnalysisAclRuleProperty$Builder
                                                CfnNetworkInsightsAnalysis$AnalysisComponentProperty$Builder
                                                CfnNetworkInsightsAnalysis$AnalysisLoadBalancerListenerProperty$Builder
                                                CfnNetworkInsightsAnalysis$AnalysisLoadBalancerTargetProperty$Builder
                                                CfnNetworkInsightsAnalysis$AnalysisPacketHeaderProperty$Builder
                                                CfnNetworkInsightsAnalysis$AnalysisRouteTableRouteProperty$Builder
                                                CfnNetworkInsightsAnalysis$AnalysisSecurityGroupRuleProperty$Builder
                                                CfnNetworkInsightsAnalysis$Builder
                                                CfnNetworkInsightsAnalysis$ExplanationProperty$Builder
                                                CfnNetworkInsightsAnalysis$PathComponentProperty$Builder
                                                CfnNetworkInsightsAnalysis$PortRangeProperty$Builder
                                                CfnNetworkInsightsAnalysis$TransitGatewayRouteTableRouteProperty$Builder
                                                CfnNetworkInsightsAnalysisProps$Builder
                                                CfnNetworkInsightsPath$Builder
                                                CfnNetworkInsightsPath$FilterPortRangeProperty$Builder
                                                CfnNetworkInsightsPath$PathFilterProperty$Builder
                                                CfnNetworkInsightsPathProps$Builder
                                                CfnNetworkInterface$Builder
                                                CfnNetworkInterface$ConnectionTrackingSpecificationProperty$Builder
                                                CfnNetworkInterface$InstanceIpv6AddressProperty$Builder
                                                CfnNetworkInterface$Ipv4PrefixSpecificationProperty$Builder
                                                CfnNetworkInterface$Ipv6PrefixSpecificationProperty$Builder
                                                CfnNetworkInterface$PrivateIpAddressSpecificationProperty$Builder
                                                CfnNetworkInterfaceAttachment$Builder
                                                CfnNetworkInterfaceAttachment$EnaSrdSpecificationProperty$Builder
                                                CfnNetworkInterfaceAttachment$EnaSrdUdpSpecificationProperty$Builder
                                                CfnNetworkInterfaceAttachmentProps$Builder
                                                CfnNetworkInterfacePermission$Builder
                                                CfnNetworkInterfacePermissionProps$Builder
                                                CfnNetworkInterfaceProps$Builder
                                                CfnNetworkPerformanceMetricSubscription$Builder
                                                CfnNetworkPerformanceMetricSubscriptionProps$Builder
                                                CfnPlacementGroup$Builder
                                                CfnPlacementGroupProps$Builder
                                                CfnPrefixList$Builder
                                                CfnPrefixList$EntryProperty$Builder
                                                CfnPrefixListProps$Builder
                                                CfnRoute$Builder
                                                CfnRouteProps$Builder
                                                CfnRouteTable$Builder
                                                CfnRouteTableProps$Builder
                                                CfnSecurityGroup$Builder
                                                CfnSecurityGroup$EgressProperty$Builder
                                                CfnSecurityGroup$IngressProperty$Builder
                                                CfnSecurityGroupEgress$Builder
                                                CfnSecurityGroupEgressProps$Builder
                                                CfnSecurityGroupIngress$Builder
                                                CfnSecurityGroupIngressProps$Builder
                                                CfnSecurityGroupProps$Builder
                                                CfnSnapshotBlockPublicAccess$Builder
                                                CfnSnapshotBlockPublicAccessProps$Builder
                                                CfnSpotFleet$AcceleratorCountRequestProperty$Builder
                                                CfnSpotFleet$AcceleratorTotalMemoryMiBRequestProperty$Builder
                                                CfnSpotFleet$BaselineEbsBandwidthMbpsRequestProperty$Builder
                                                CfnSpotFleet$BlockDeviceMappingProperty$Builder
                                                CfnSpotFleet$Builder
                                                CfnSpotFleet$ClassicLoadBalancerProperty$Builder
                                                CfnSpotFleet$ClassicLoadBalancersConfigProperty$Builder
                                                CfnSpotFleet$EbsBlockDeviceProperty$Builder
                                                CfnSpotFleet$FleetLaunchTemplateSpecificationProperty$Builder
                                                CfnSpotFleet$GroupIdentifierProperty$Builder
                                                CfnSpotFleet$IamInstanceProfileSpecificationProperty$Builder
                                                CfnSpotFleet$InstanceIpv6AddressProperty$Builder
                                                CfnSpotFleet$InstanceNetworkInterfaceSpecificationProperty$Builder
                                                CfnSpotFleet$InstanceRequirementsRequestProperty$Builder
                                                CfnSpotFleet$LaunchTemplateConfigProperty$Builder
                                                CfnSpotFleet$LaunchTemplateOverridesProperty$Builder
                                                CfnSpotFleet$LoadBalancersConfigProperty$Builder
                                                CfnSpotFleet$MemoryGiBPerVCpuRequestProperty$Builder
                                                CfnSpotFleet$MemoryMiBRequestProperty$Builder
                                                CfnSpotFleet$NetworkBandwidthGbpsRequestProperty$Builder
                                                CfnSpotFleet$NetworkInterfaceCountRequestProperty$Builder
                                                CfnSpotFleet$PrivateIpAddressSpecificationProperty$Builder
                                                CfnSpotFleet$SpotCapacityRebalanceProperty$Builder
                                                CfnSpotFleet$SpotFleetLaunchSpecificationProperty$Builder
                                                CfnSpotFleet$SpotFleetMonitoringProperty$Builder
                                                CfnSpotFleet$SpotFleetRequestConfigDataProperty$Builder
                                                CfnSpotFleet$SpotFleetTagSpecificationProperty$Builder
                                                CfnSpotFleet$SpotMaintenanceStrategiesProperty$Builder
                                                CfnSpotFleet$SpotPlacementProperty$Builder
                                                CfnSpotFleet$TargetGroupProperty$Builder
                                                CfnSpotFleet$TargetGroupsConfigProperty$Builder
                                                CfnSpotFleet$TotalLocalStorageGBRequestProperty$Builder
                                                CfnSpotFleet$VCpuCountRangeRequestProperty$Builder
                                                CfnSpotFleetProps$Builder
                                                CfnSubnet$Builder
                                                CfnSubnet$PrivateDnsNameOptionsOnLaunchProperty$Builder
                                                CfnSubnetCidrBlock$Builder
                                                CfnSubnetCidrBlockProps$Builder
                                                CfnSubnetNetworkAclAssociation$Builder
                                                CfnSubnetNetworkAclAssociationProps$Builder
                                                CfnSubnetProps$Builder
                                                CfnSubnetRouteTableAssociation$Builder
                                                CfnSubnetRouteTableAssociationProps$Builder
                                                CfnTrafficMirrorFilter$Builder
                                                CfnTrafficMirrorFilterProps$Builder
                                                CfnTrafficMirrorFilterRule$Builder
                                                CfnTrafficMirrorFilterRule$TrafficMirrorPortRangeProperty$Builder
                                                CfnTrafficMirrorFilterRuleProps$Builder
                                                CfnTrafficMirrorSession$Builder
                                                CfnTrafficMirrorSessionProps$Builder
                                                CfnTrafficMirrorTarget$Builder
                                                CfnTrafficMirrorTargetProps$Builder
                                                CfnTransitGateway$Builder
                                                CfnTransitGatewayAttachment$Builder
                                                CfnTransitGatewayAttachment$OptionsProperty$Builder
                                                CfnTransitGatewayAttachmentProps$Builder
                                                CfnTransitGatewayConnect$Builder
                                                CfnTransitGatewayConnect$TransitGatewayConnectOptionsProperty$Builder
                                                CfnTransitGatewayConnectProps$Builder
                                                CfnTransitGatewayMulticastDomain$Builder
                                                CfnTransitGatewayMulticastDomain$OptionsProperty$Builder
                                                CfnTransitGatewayMulticastDomainAssociation$Builder
                                                CfnTransitGatewayMulticastDomainAssociationProps$Builder
                                                CfnTransitGatewayMulticastDomainProps$Builder
                                                CfnTransitGatewayMulticastGroupMember$Builder
                                                CfnTransitGatewayMulticastGroupMemberProps$Builder
                                                CfnTransitGatewayMulticastGroupSource$Builder
                                                CfnTransitGatewayMulticastGroupSourceProps$Builder
                                                CfnTransitGatewayPeeringAttachment$Builder
                                                CfnTransitGatewayPeeringAttachment$PeeringAttachmentStatusProperty$Builder
                                                CfnTransitGatewayPeeringAttachmentProps$Builder
                                                CfnTransitGatewayProps$Builder
                                                CfnTransitGatewayRoute$Builder
                                                CfnTransitGatewayRouteProps$Builder
                                                CfnTransitGatewayRouteTable$Builder
                                                CfnTransitGatewayRouteTableAssociation$Builder
                                                CfnTransitGatewayRouteTableAssociationProps$Builder
                                                CfnTransitGatewayRouteTablePropagation$Builder
                                                CfnTransitGatewayRouteTablePropagationProps$Builder
                                                CfnTransitGatewayRouteTableProps$Builder
                                                CfnTransitGatewayVpcAttachment$Builder
                                                CfnTransitGatewayVpcAttachment$OptionsProperty$Builder
                                                CfnTransitGatewayVpcAttachmentProps$Builder
                                                CfnVPC$Builder
                                                CfnVPCCidrBlock$Builder
                                                CfnVPCCidrBlockProps$Builder
                                                CfnVPCDHCPOptionsAssociation$Builder
                                                CfnVPCDHCPOptionsAssociationProps$Builder
                                                CfnVPCEndpoint$Builder
                                                CfnVPCEndpointConnectionNotification$Builder
                                                CfnVPCEndpointConnectionNotificationProps$Builder
                                                CfnVPCEndpointProps$Builder
                                                CfnVPCEndpointService$Builder
                                                CfnVPCEndpointServicePermissions$Builder
                                                CfnVPCEndpointServicePermissionsProps$Builder
                                                CfnVPCEndpointServiceProps$Builder
                                                CfnVPCGatewayAttachment$Builder
                                                CfnVPCGatewayAttachmentProps$Builder
                                                CfnVPCPeeringConnection$Builder
                                                CfnVPCPeeringConnectionProps$Builder
                                                CfnVPCProps$Builder
                                                CfnVPNConnection$Builder
                                                CfnVPNConnection$VpnTunnelOptionsSpecificationProperty$Builder
                                                CfnVPNConnectionProps$Builder
                                                CfnVPNConnectionRoute$Builder
                                                CfnVPNConnectionRouteProps$Builder
                                                CfnVPNGateway$Builder
                                                CfnVPNGatewayProps$Builder
                                                CfnVPNGatewayRoutePropagation$Builder
                                                CfnVPNGatewayRoutePropagationProps$Builder
                                                CfnVerifiedAccessEndpoint$Builder
                                                CfnVerifiedAccessEndpoint$LoadBalancerOptionsProperty$Builder
                                                CfnVerifiedAccessEndpoint$NetworkInterfaceOptionsProperty$Builder
                                                CfnVerifiedAccessEndpoint$SseSpecificationProperty$Builder
                                                CfnVerifiedAccessEndpointProps$Builder
                                                CfnVerifiedAccessGroup$Builder
                                                CfnVerifiedAccessGroup$SseSpecificationProperty$Builder
                                                CfnVerifiedAccessGroupProps$Builder
                                                CfnVerifiedAccessInstance$Builder
                                                CfnVerifiedAccessInstance$CloudWatchLogsProperty$Builder
                                                CfnVerifiedAccessInstance$KinesisDataFirehoseProperty$Builder
                                                CfnVerifiedAccessInstance$S3Property$Builder
                                                CfnVerifiedAccessInstance$VerifiedAccessLogsProperty$Builder
                                                CfnVerifiedAccessInstance$VerifiedAccessTrustProviderProperty$Builder
                                                CfnVerifiedAccessInstanceProps$Builder
                                                CfnVerifiedAccessTrustProvider$Builder
                                                CfnVerifiedAccessTrustProvider$DeviceOptionsProperty$Builder
                                                CfnVerifiedAccessTrustProvider$OidcOptionsProperty$Builder
                                                CfnVerifiedAccessTrustProvider$SseSpecificationProperty$Builder
                                                CfnVerifiedAccessTrustProviderProps$Builder
                                                CfnVolume$Builder
                                                CfnVolumeAttachment$Builder
                                                CfnVolumeAttachmentProps$Builder
                                                CfnVolumeProps$Builder
                                                ClientVpnAuthorizationRule$Builder
                                                ClientVpnAuthorizationRuleOptions$Builder
                                                ClientVpnAuthorizationRuleProps$Builder
                                                ClientVpnEndpoint$Builder
                                                ClientVpnEndpointAttributes$Builder
                                                ClientVpnEndpointOptions$Builder
                                                ClientVpnEndpointProps$Builder
                                                ClientVpnRoute$Builder
                                                ClientVpnRouteOptions$Builder
                                                ClientVpnRouteProps$Builder
                                                ClientVpnSessionTimeout
                                                CommonNetworkAclEntryOptions$Builder
                                                ConfigSetProps$Builder
                                                ConfigureNatOptions$Builder
                                                ConnectionRule$Builder
                                                Connections$Builder
                                                ConnectionsProps$Builder
                                                CpuCredits
                                                CreateIpv6CidrBlocksRequest$Builder
                                                DefaultInstanceTenancy
                                                DestinationOptions$Builder
                                                EbsDeviceOptions$Builder
                                                EbsDeviceOptionsBase$Builder
                                                EbsDeviceProps$Builder
                                                EbsDeviceSnapshotOptions$Builder
                                                EbsDeviceVolumeType
                                                EnableVpnGatewayOptions$Builder
                                                ExecuteFileOptions$Builder
                                                FlowLog$Builder
                                                FlowLogDestinationConfig$Builder
                                                FlowLogDestinationType
                                                FlowLogFileFormat
                                                FlowLogMaxAggregationInterval
                                                FlowLogOptions$Builder
                                                FlowLogProps$Builder
                                                FlowLogTrafficType
                                                GatewayConfig$Builder
                                                GatewayVpcEndpoint$Builder
                                                GatewayVpcEndpointOptions$Builder
                                                GatewayVpcEndpointProps$Builder
                                                GenericLinuxImage$Builder
                                                GenericLinuxImageProps$Builder
                                                GenericWindowsImage$Builder
                                                GenericWindowsImageProps$Builder
                                                InitCommandOptions$Builder
                                                InitFileAssetOptions$Builder
                                                InitFileOptions$Builder
                                                InitServiceOptions$Builder
                                                InitSourceAssetOptions$Builder
                                                InitSourceOptions$Builder
                                                InitUserOptions$Builder
                                                Instance$Builder
                                                InstanceArchitecture
                                                InstanceClass
                                                InstanceInitiatedShutdownBehavior
                                                InstanceProps$Builder
                                                InstanceRequireImdsv2Aspect$Builder
                                                InstanceRequireImdsv2AspectProps$Builder
                                                InstanceSize
                                                InterfaceVpcEndpoint$Builder
                                                InterfaceVpcEndpointAttributes$Builder
                                                InterfaceVpcEndpointAwsService$Builder
                                                InterfaceVpcEndpointAwsServiceProps$Builder
                                                InterfaceVpcEndpointOptions$Builder
                                                InterfaceVpcEndpointProps$Builder
                                                IpProtocol
                                                KeyPair$Builder
                                                KeyPairAttributes$Builder
                                                KeyPairFormat
                                                KeyPairProps$Builder
                                                KeyPairType
                                                LaunchTemplate$Builder
                                                LaunchTemplateAttributes$Builder
                                                LaunchTemplateHttpTokens
                                                LaunchTemplateProps$Builder
                                                LaunchTemplateRequireImdsv2Aspect$Builder
                                                LaunchTemplateRequireImdsv2AspectProps$Builder
                                                LaunchTemplateSpotOptions$Builder
                                                LinuxUserDataOptions$Builder
                                                LocationPackageOptions$Builder
                                                LookupMachineImage$Builder
                                                LookupMachineImageProps$Builder
                                                MachineImageConfig$Builder
                                                MultipartBodyOptions$Builder
                                                MultipartUserData$Builder
                                                MultipartUserDataOptions$Builder
                                                NamedPackageOptions$Builder
                                                NatGatewayProps$Builder
                                                NatInstanceProps$Builder
                                                NatInstanceProviderV2$Builder
                                                NatTrafficDirection
                                                NetworkAcl$Builder
                                                NetworkAclEntry$Builder
                                                NetworkAclEntryProps$Builder
                                                NetworkAclProps$Builder
                                                OperatingSystemType
                                                PlacementGroup$Builder
                                                PlacementGroupProps$Builder
                                                PlacementGroupSpreadLevel
                                                PlacementGroupStrategy
                                                Port$Builder
                                                PortProps$Builder
                                                PrefixList$Builder
                                                PrefixListOptions$Builder
                                                PrefixListProps$Builder
                                                PrivateSubnet$Builder
                                                PrivateSubnetAttributes$Builder
                                                PrivateSubnetProps$Builder
                                                Protocol
                                                PublicSubnet$Builder
                                                PublicSubnetAttributes$Builder
                                                PublicSubnetProps$Builder
                                                RequestedSubnet$Builder
                                                ResolveSsmParameterAtLaunchImage$Builder
                                                RouterType
                                                RuleScope$Builder
                                                S3DestinationOptions$Builder
                                                S3DownloadOptions$Builder
                                                SecurityGroup$Builder
                                                SecurityGroupImportOptions$Builder
                                                SecurityGroupProps$Builder
                                                SelectedSubnets$Builder
                                                ServiceManager
                                                SpotInstanceInterruption
                                                SpotRequestType
                                                SsmParameterImageOptions$Builder
                                                Subnet$Builder
                                                SubnetAttributes$Builder
                                                SubnetConfiguration$Builder
                                                SubnetIpamOptions$Builder
                                                SubnetNetworkAclAssociation$Builder
                                                SubnetNetworkAclAssociationProps$Builder
                                                SubnetProps$Builder
                                                SubnetSelection$Builder
                                                SubnetType
                                                SystemdConfigFileOptions$Builder
                                                TrafficDirection
                                                TransportProtocol
                                                Volume$Builder
                                                VolumeAttributes$Builder
                                                VolumeProps$Builder
                                                Vpc$Builder
                                                VpcAttributes$Builder
                                                VpcEndpointService$Builder
                                                VpcEndpointServiceProps$Builder
                                                VpcEndpointType
                                                VpcIpamOptions$Builder
                                                VpcLookupOptions$Builder
                                                VpcProps$Builder
                                                VpnConnection$Builder
                                                VpnConnectionAttributes$Builder
                                                VpnConnectionOptions$Builder
                                                VpnConnectionProps$Builder
                                                VpnConnectionType
                                                VpnGateway$Builder
                                                VpnGatewayProps$Builder
                                                VpnPort
                                                VpnTunnelOption$Builder
                                                WindowsImage$Builder
                                                WindowsImageProps$Builder
                                                WindowsUserDataOptions$Builder
                                                WindowsVersion]))


(defn action
  "The `action` function data interprets values in the provided config data into a 
`Action` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Action` - the value is returned.
* is `:deny` - `Action/DENY` is returned
* is `:allow` - `Action/ALLOW` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Action data) data
      (= :deny data) Action/DENY
      (= :allow data) Action/ALLOW)))


(defn address-family
  "The `address-family` function data interprets values in the provided config data into a 
`AddressFamily` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AddressFamily` - the value is returned.
* is `:ip-v4` - `AddressFamily/IP_V4` is returned
* is `:ip-v6` - `AddressFamily/IP_V6` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AddressFamily data) data
      (= :ip-v4 data) AddressFamily/IP_V4
      (= :ip-v6 data) AddressFamily/IP_V6)))


(defn amazon-linux-cpu-type
  "The `amazon-linux-cpu-type` function data interprets values in the provided config data into a 
`AmazonLinuxCpuType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AmazonLinuxCpuType` - the value is returned.
* is `:arm-64` - `AmazonLinuxCpuType/ARM_64` is returned
* is `:x86-64` - `AmazonLinuxCpuType/X86_64` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AmazonLinuxCpuType data) data
      (= :arm-64 data) AmazonLinuxCpuType/ARM_64
      (= :x86-64 data) AmazonLinuxCpuType/X86_64)))


(defn amazon-linux-edition
  "The `amazon-linux-edition` function data interprets values in the provided config data into a 
`AmazonLinuxEdition` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AmazonLinuxEdition` - the value is returned.
* is `:minimal` - `AmazonLinuxEdition/MINIMAL` is returned
* is `:standard` - `AmazonLinuxEdition/STANDARD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AmazonLinuxEdition data) data
      (= :minimal data) AmazonLinuxEdition/MINIMAL
      (= :standard data) AmazonLinuxEdition/STANDARD)))


(defn amazon-linux-generation
  "The `amazon-linux-generation` function data interprets values in the provided config data into a 
`AmazonLinuxGeneration` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AmazonLinuxGeneration` - the value is returned.
* is `:amazon-linux-2` - `AmazonLinuxGeneration/AMAZON_LINUX_2` is returned
* is `:amazon-linux` - `AmazonLinuxGeneration/AMAZON_LINUX` is returned
* is `:amazon-linux-2022` - `AmazonLinuxGeneration/AMAZON_LINUX_2022` is returned
* is `:amazon-linux-2023` - `AmazonLinuxGeneration/AMAZON_LINUX_2023` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AmazonLinuxGeneration data) data
      (= :amazon-linux-2 data) AmazonLinuxGeneration/AMAZON_LINUX_2
      (= :amazon-linux data) AmazonLinuxGeneration/AMAZON_LINUX
      (= :amazon-linux-2022 data) AmazonLinuxGeneration/AMAZON_LINUX_2022
      (= :amazon-linux-2023 data) AmazonLinuxGeneration/AMAZON_LINUX_2023)))


(defn amazon-linux-kernel
  "The `amazon-linux-kernel` function data interprets values in the provided config data into a 
`AmazonLinuxKernel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AmazonLinuxKernel` - the value is returned.
* is `:kernel6-1` - `AmazonLinuxKernel/KERNEL6_1` is returned
* is `:kernel5-x` - `AmazonLinuxKernel/KERNEL5_X` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AmazonLinuxKernel data) data
      (= :kernel6-1 data) AmazonLinuxKernel/KERNEL6_1
      (= :kernel5-x data) AmazonLinuxKernel/KERNEL5_X)))


(defn amazon-linux-storage
  "The `amazon-linux-storage` function data interprets values in the provided config data into a 
`AmazonLinuxStorage` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AmazonLinuxStorage` - the value is returned.
* is `:ebs` - `AmazonLinuxStorage/EBS` is returned
* is `:s3` - `AmazonLinuxStorage/S3` is returned
* is `:general-purpose` - `AmazonLinuxStorage/GENERAL_PURPOSE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AmazonLinuxStorage data) data
      (= :ebs data) AmazonLinuxStorage/EBS
      (= :s3 data) AmazonLinuxStorage/S3
      (= :general-purpose data) AmazonLinuxStorage/GENERAL_PURPOSE)))


(defn amazon-linux-virt
  "The `amazon-linux-virt` function data interprets values in the provided config data into a 
`AmazonLinuxVirt` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AmazonLinuxVirt` - the value is returned.
* is `:pv` - `AmazonLinuxVirt/PV` is returned
* is `:hvm` - `AmazonLinuxVirt/HVM` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AmazonLinuxVirt data) data
      (= :pv data) AmazonLinuxVirt/PV
      (= :hvm data) AmazonLinuxVirt/HVM)))


(defn client-vpn-session-timeout
  "The `client-vpn-session-timeout` function data interprets values in the provided config data into a 
`ClientVpnSessionTimeout` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ClientVpnSessionTimeout` - the value is returned.
* is `:eight-hours` - `ClientVpnSessionTimeout/EIGHT_HOURS` is returned
* is `:twenty-four-hours` - `ClientVpnSessionTimeout/TWENTY_FOUR_HOURS` is returned
* is `:twelve-hours` - `ClientVpnSessionTimeout/TWELVE_HOURS` is returned
* is `:ten-hours` - `ClientVpnSessionTimeout/TEN_HOURS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ClientVpnSessionTimeout data) data
      (= :eight-hours data) ClientVpnSessionTimeout/EIGHT_HOURS
      (= :twenty-four-hours data) ClientVpnSessionTimeout/TWENTY_FOUR_HOURS
      (= :twelve-hours data) ClientVpnSessionTimeout/TWELVE_HOURS
      (= :ten-hours data) ClientVpnSessionTimeout/TEN_HOURS)))


(defn cpu-credits
  "The `cpu-credits` function data interprets values in the provided config data into a 
`CpuCredits` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CpuCredits` - the value is returned.
* is `:unlimited` - `CpuCredits/UNLIMITED` is returned
* is `:standard` - `CpuCredits/STANDARD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CpuCredits data) data
      (= :unlimited data) CpuCredits/UNLIMITED
      (= :standard data) CpuCredits/STANDARD)))


(defn default-instance-tenancy
  "The `default-instance-tenancy` function data interprets values in the provided config data into a 
`DefaultInstanceTenancy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DefaultInstanceTenancy` - the value is returned.
* is `:dedicated` - `DefaultInstanceTenancy/DEDICATED` is returned
* is `:default` - `DefaultInstanceTenancy/DEFAULT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DefaultInstanceTenancy data) data
      (= :dedicated data) DefaultInstanceTenancy/DEDICATED
      (= :default data) DefaultInstanceTenancy/DEFAULT)))


(defn ebs-device-volume-type
  "The `ebs-device-volume-type` function data interprets values in the provided config data into a 
`EbsDeviceVolumeType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `EbsDeviceVolumeType` - the value is returned.
* is `:io1` - `EbsDeviceVolumeType/IO1` is returned
* is `:gp2` - `EbsDeviceVolumeType/GP2` is returned
* is `:sc1` - `EbsDeviceVolumeType/SC1` is returned
* is `:gp3` - `EbsDeviceVolumeType/GP3` is returned
* is `:standard` - `EbsDeviceVolumeType/STANDARD` is returned
* is `:st1` - `EbsDeviceVolumeType/ST1` is returned
* is `:io2` - `EbsDeviceVolumeType/IO2` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? EbsDeviceVolumeType data) data
      (= :io1 data) EbsDeviceVolumeType/IO1
      (= :gp2 data) EbsDeviceVolumeType/GP2
      (= :sc1 data) EbsDeviceVolumeType/SC1
      (= :gp3 data) EbsDeviceVolumeType/GP3
      (= :standard data) EbsDeviceVolumeType/STANDARD
      (= :st1 data) EbsDeviceVolumeType/ST1
      (= :io2 data) EbsDeviceVolumeType/IO2)))


(defn flow-log-destination-type
  "The `flow-log-destination-type` function data interprets values in the provided config data into a 
`FlowLogDestinationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FlowLogDestinationType` - the value is returned.
* is `:s3` - `FlowLogDestinationType/S3` is returned
* is `:cloud-watch-logs` - `FlowLogDestinationType/CLOUD_WATCH_LOGS` is returned
* is `:kinesis-data-firehose` - `FlowLogDestinationType/KINESIS_DATA_FIREHOSE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FlowLogDestinationType data) data
      (= :s3 data) FlowLogDestinationType/S3
      (= :cloud-watch-logs data) FlowLogDestinationType/CLOUD_WATCH_LOGS
      (= :kinesis-data-firehose data) FlowLogDestinationType/KINESIS_DATA_FIREHOSE)))


(defn flow-log-file-format
  "The `flow-log-file-format` function data interprets values in the provided config data into a 
`FlowLogFileFormat` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FlowLogFileFormat` - the value is returned.
* is `:parquet` - `FlowLogFileFormat/PARQUET` is returned
* is `:plain-text` - `FlowLogFileFormat/PLAIN_TEXT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FlowLogFileFormat data) data
      (= :parquet data) FlowLogFileFormat/PARQUET
      (= :plain-text data) FlowLogFileFormat/PLAIN_TEXT)))


(defn flow-log-max-aggregation-interval
  "The `flow-log-max-aggregation-interval` function data interprets values in the provided config data into a 
`FlowLogMaxAggregationInterval` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FlowLogMaxAggregationInterval` - the value is returned.
* is `:ten-minutes` - `FlowLogMaxAggregationInterval/TEN_MINUTES` is returned
* is `:one-minute` - `FlowLogMaxAggregationInterval/ONE_MINUTE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FlowLogMaxAggregationInterval data) data
      (= :ten-minutes data) FlowLogMaxAggregationInterval/TEN_MINUTES
      (= :one-minute data) FlowLogMaxAggregationInterval/ONE_MINUTE)))


(defn flow-log-traffic-type
  "The `flow-log-traffic-type` function data interprets values in the provided config data into a 
`FlowLogTrafficType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FlowLogTrafficType` - the value is returned.
* is `:all` - `FlowLogTrafficType/ALL` is returned
* is `:reject` - `FlowLogTrafficType/REJECT` is returned
* is `:accept` - `FlowLogTrafficType/ACCEPT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FlowLogTrafficType data) data
      (= :all data) FlowLogTrafficType/ALL
      (= :reject data) FlowLogTrafficType/REJECT
      (= :accept data) FlowLogTrafficType/ACCEPT)))


(defn instance-architecture
  "The `instance-architecture` function data interprets values in the provided config data into a 
`InstanceArchitecture` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InstanceArchitecture` - the value is returned.
* is `:x86-64` - `InstanceArchitecture/X86_64` is returned
* is `:arm-64` - `InstanceArchitecture/ARM_64` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InstanceArchitecture data) data
      (= :x86-64 data) InstanceArchitecture/X86_64
      (= :arm-64 data) InstanceArchitecture/ARM_64)))


(defn instance-class
  "The `instance-class` function data interprets values in the provided config data into a 
`InstanceClass` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InstanceClass` - the value is returned.
* is `:c5d` - `InstanceClass/C5D` is returned
* is `:standard7-amd` - `InstanceClass/STANDARD7_AMD` is returned
* is `:fpga1` - `InstanceClass/FPGA1` is returned
* is `:standard7-graviton` - `InstanceClass/STANDARD7_GRAVITON` is returned
* is `:r4` - `InstanceClass/R4` is returned
* is `:p3dn` - `InstanceClass/P3DN` is returned
* is `:memory5-amd` - `InstanceClass/MEMORY5_AMD` is returned
* is `:memory-intensive-2-graviton2-nvme-drive` - `InstanceClass/MEMORY_INTENSIVE_2_GRAVITON2_NVME_DRIVE` is returned
* is `:standard5` - `InstanceClass/STANDARD5` is returned
* is `:memory5-high-performance` - `InstanceClass/MEMORY5_HIGH_PERFORMANCE` is returned
* is `:standard6-amd` - `InstanceClass/STANDARD6_AMD` is returned
* is `:standard5-high-compute` - `InstanceClass/STANDARD5_HIGH_COMPUTE` is returned
* is `:memory6-intel-nvme-drive` - `InstanceClass/MEMORY6_INTEL_NVME_DRIVE` is returned
* is `:high-memory-24tb-1` - `InstanceClass/HIGH_MEMORY_24TB_1` is returned
* is `:i4g` - `InstanceClass/I4G` is returned
* is `:m5n` - `InstanceClass/M5N` is returned
* is `:c6i` - `InstanceClass/C6I` is returned
* is `:dl1` - `InstanceClass/DL1` is returned
* is `:memory5-ebs-optimized` - `InstanceClass/MEMORY5_EBS_OPTIMIZED` is returned
* is `:compute5-amd` - `InstanceClass/COMPUTE5_AMD` is returned
* is `:compute5` - `InstanceClass/COMPUTE5` is returned
* is `:parallel2` - `InstanceClass/PARALLEL2` is returned
* is `:m6in` - `InstanceClass/M6IN` is returned
* is `:hpc6id` - `InstanceClass/HPC6ID` is returned
* is `:r7g` - `InstanceClass/R7G` is returned
* is `:trn1` - `InstanceClass/TRN1` is returned
* is `:compute5-amd-nvme-drive` - `InstanceClass/COMPUTE5_AMD_NVME_DRIVE` is returned
* is `:standard5-high-performance` - `InstanceClass/STANDARD5_HIGH_PERFORMANCE` is returned
* is `:i4i` - `InstanceClass/I4I` is returned
* is `:a1` - `InstanceClass/A1` is returned
* is `:c6gn` - `InstanceClass/C6GN` is returned
* is `:graphics4-nvme-drive-high-performance` - `InstanceClass/GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE` is returned
* is `:storage3` - `InstanceClass/STORAGE3` is returned
* is `:storage4-graviton-network-storage-optimized` - `InstanceClass/STORAGE4_GRAVITON_NETWORK_STORAGE_OPTIMIZED` is returned
* is `:c7g` - `InstanceClass/C7G` is returned
* is `:high-memory-6tb-1` - `InstanceClass/HIGH_MEMORY_6TB_1` is returned
* is `:compute6-intel-nvme-drive` - `InstanceClass/COMPUTE6_INTEL_NVME_DRIVE` is returned
* is `:r5dn` - `InstanceClass/R5DN` is returned
* is `:t3a` - `InstanceClass/T3A` is returned
* is `:u-6tb1` - `InstanceClass/U_6TB1` is returned
* is `:mac2-m2pro` - `InstanceClass/MAC2_M2PRO` is returned
* is `:memory6-graviton2-nvme-drive` - `InstanceClass/MEMORY6_GRAVITON2_NVME_DRIVE` is returned
* is `:x2iedn` - `InstanceClass/X2IEDN` is returned
* is `:inference1` - `InstanceClass/INFERENCE1` is returned
* is `:high-compute-memory1` - `InstanceClass/HIGH_COMPUTE_MEMORY1` is returned
* is `:m6id` - `InstanceClass/M6ID` is returned
* is `:memory7-intel` - `InstanceClass/MEMORY7_INTEL` is returned
* is `:graphics5-graviton2` - `InstanceClass/GRAPHICS5_GRAVITON2` is returned
* is `:parallel3` - `InstanceClass/PARALLEL3` is returned
* is `:memory5-amd-nvme-drive` - `InstanceClass/MEMORY5_AMD_NVME_DRIVE` is returned
* is `:r5a` - `InstanceClass/R5A` is returned
* is `:m5d` - `InstanceClass/M5D` is returned
* is `:m6gd` - `InstanceClass/M6GD` is returned
* is `:r5d` - `InstanceClass/R5D` is returned
* is `:trn1n` - `InstanceClass/TRN1N` is returned
* is `:hpc7g` - `InstanceClass/HPC7G` is returned
* is `:r7iz` - `InstanceClass/R7IZ` is returned
* is `:compute7-graviton3` - `InstanceClass/COMPUTE7_GRAVITON3` is returned
* is `:c7a` - `InstanceClass/C7A` is returned
* is `:m3` - `InstanceClass/M3` is returned
* is `:m5a` - `InstanceClass/M5A` is returned
* is `:compute5-nvme-drive` - `InstanceClass/COMPUTE5_NVME_DRIVE` is returned
* is `:memory7-intel-base` - `InstanceClass/MEMORY7_INTEL_BASE` is returned
* is `:training-accelerator1-enhanced-network` - `InstanceClass/TRAINING_ACCELERATOR1_ENHANCED_NETWORK` is returned
* is `:standard5-amd` - `InstanceClass/STANDARD5_AMD` is returned
* is `:r6i` - `InstanceClass/R6I` is returned
* is `:u-18tb1` - `InstanceClass/U_18TB1` is returned
* is `:m7i` - `InstanceClass/M7I` is returned
* is `:c6g` - `InstanceClass/C6G` is returned
* is `:r6in` - `InstanceClass/R6IN` is returned
* is `:parallel3-nvme-drive-high-performance` - `InstanceClass/PARALLEL3_NVME_DRIVE_HIGH_PERFORMANCE` is returned
* is `:high-memory-12tb-1` - `InstanceClass/HIGH_MEMORY_12TB_1` is returned
* is `:memory6-amd` - `InstanceClass/MEMORY6_AMD` is returned
* is `:r6a` - `InstanceClass/R6A` is returned
* is `:m4` - `InstanceClass/M4` is returned
* is `:graphics3` - `InstanceClass/GRAPHICS3` is returned
* is `:g5` - `InstanceClass/G5` is returned
* is `:high-memory-18tb-1` - `InstanceClass/HIGH_MEMORY_18TB_1` is returned
* is `:c5` - `InstanceClass/C5` is returned
* is `:training-accelerator1` - `InstanceClass/TRAINING_ACCELERATOR1` is returned
* is `:x1` - `InstanceClass/X1` is returned
* is `:x2iezn` - `InstanceClass/X2IEZN` is returned
* is `:i3en` - `InstanceClass/I3EN` is returned
* is `:memory3` - `InstanceClass/MEMORY3` is returned
* is `:m7gd` - `InstanceClass/M7GD` is returned
* is `:x2g` - `InstanceClass/X2G` is returned
* is `:io3-dense-nvme-drive` - `InstanceClass/IO3_DENSE_NVME_DRIVE` is returned
* is `:standard6-intel-high-performance` - `InstanceClass/STANDARD6_INTEL_HIGH_PERFORMANCE` is returned
* is `:r6gd` - `InstanceClass/R6GD` is returned
* is `:video-transcoding1` - `InstanceClass/VIDEO_TRANSCODING1` is returned
* is `:macintosh2-m1` - `InstanceClass/MACINTOSH2_M1` is returned
* is `:m5dn` - `InstanceClass/M5DN` is returned
* is `:storage4-graviton-network-optimized` - `InstanceClass/STORAGE4_GRAVITON_NETWORK_OPTIMIZED` is returned
* is `:r5` - `InstanceClass/R5` is returned
* is `:x2gd` - `InstanceClass/X2GD` is returned
* is `:memory-intensive-1-extended` - `InstanceClass/MEMORY_INTENSIVE_1_EXTENDED` is returned
* is `:c5ad` - `InstanceClass/C5AD` is returned
* is `:parallel4` - `InstanceClass/PARALLEL4` is returned
* is `:parallel4-nvme-drive-extended` - `InstanceClass/PARALLEL4_NVME_DRIVE_EXTENDED` is returned
* is `:c6id` - `InstanceClass/C6ID` is returned
* is `:m5ad` - `InstanceClass/M5AD` is returned
* is `:c5n` - `InstanceClass/C5N` is returned
* is `:macintosh1-intel` - `InstanceClass/MACINTOSH1_INTEL` is returned
* is `:standard6-intel` - `InstanceClass/STANDARD6_INTEL` is returned
* is `:memory-intensive-2-graviton2` - `InstanceClass/MEMORY_INTENSIVE_2_GRAVITON2` is returned
* is `:inference2` - `InstanceClass/INFERENCE2` is returned
* is `:compute6-intel-high-performance` - `InstanceClass/COMPUTE6_INTEL_HIGH_PERFORMANCE` is returned
* is `:vt1` - `InstanceClass/VT1` is returned
* is `:memory5-nvme-drive-high-performance` - `InstanceClass/MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE` is returned
* is `:standard6-intel-nvme-drive-high-performance` - `InstanceClass/STANDARD6_INTEL_NVME_DRIVE_HIGH_PERFORMANCE` is returned
* is `:storage2` - `InstanceClass/STORAGE2` is returned
* is `:high-performance-computing6-amd` - `InstanceClass/HIGH_PERFORMANCE_COMPUTING6_AMD` is returned
* is `:arm1` - `InstanceClass/ARM1` is returned
* is `:x1e` - `InstanceClass/X1E` is returned
* is `:inf1` - `InstanceClass/INF1` is returned
* is `:hpc6a` - `InstanceClass/HPC6A` is returned
* is `:memory6-graviton` - `InstanceClass/MEMORY6_GRAVITON` is returned
* is `:c3` - `InstanceClass/C3` is returned
* is `:macintosh2-m2-pro` - `InstanceClass/MACINTOSH2_M2_PRO` is returned
* is `:c6in` - `InstanceClass/C6IN` is returned
* is `:high-memory-3tb-1` - `InstanceClass/HIGH_MEMORY_3TB_1` is returned
* is `:graphics4-amd-nvme-drive` - `InstanceClass/GRAPHICS4_AMD_NVME_DRIVE` is returned
* is `:mac1` - `InstanceClass/MAC1` is returned
* is `:standard5-nvme-drive` - `InstanceClass/STANDARD5_NVME_DRIVE` is returned
* is `:memory6-intel-high-performance` - `InstanceClass/MEMORY6_INTEL_HIGH_PERFORMANCE` is returned
* is `:m7g` - `InstanceClass/M7G` is returned
* is `:hpc7a` - `InstanceClass/HPC7A` is returned
* is `:compute7-graviton3-high-network-bandwidth` - `InstanceClass/COMPUTE7_GRAVITON3_HIGH_NETWORK_BANDWIDTH` is returned
* is `:h1` - `InstanceClass/H1` is returned
* is `:inf2` - `InstanceClass/INF2` is returned
* is `:u-24tb1` - `InstanceClass/U_24TB1` is returned
* is `:im4gn` - `InstanceClass/IM4GN` is returned
* is `:m6idn` - `InstanceClass/M6IDN` is returned
* is `:memory5` - `InstanceClass/MEMORY5` is returned
* is `:standard5-nvme-drive-high-performance` - `InstanceClass/STANDARD5_NVME_DRIVE_HIGH_PERFORMANCE` is returned
* is `:standard4` - `InstanceClass/STANDARD4` is returned
* is `:r7gd` - `InstanceClass/R7GD` is returned
* is `:r5ad` - `InstanceClass/R5AD` is returned
* is `:c7gn` - `InstanceClass/C7GN` is returned
* is `:p4d` - `InstanceClass/P4D` is returned
* is `:f1` - `InstanceClass/F1` is returned
* is `:io3` - `InstanceClass/IO3` is returned
* is `:m7a` - `InstanceClass/M7A` is returned
* is `:m6a` - `InstanceClass/M6A` is returned
* is `:compute6-graviton2-nvme-drive` - `InstanceClass/COMPUTE6_GRAVITON2_NVME_DRIVE` is returned
* is `:u-9tb1` - `InstanceClass/U_9TB1` is returned
* is `:memory-intensive-1` - `InstanceClass/MEMORY_INTENSIVE_1` is returned
* is `:storage4-graviton` - `InstanceClass/STORAGE4_GRAVITON` is returned
* is `:standard6-graviton` - `InstanceClass/STANDARD6_GRAVITON` is returned
* is `:m5` - `InstanceClass/M5` is returned
* is `:standard6-intel-nvme-drive` - `InstanceClass/STANDARD6_INTEL_NVME_DRIVE` is returned
* is `:i3` - `InstanceClass/I3` is returned
* is `:burstable3` - `InstanceClass/BURSTABLE3` is returned
* is `:r5n` - `InstanceClass/R5N` is returned
* is `:storage-compute-1` - `InstanceClass/STORAGE_COMPUTE_1` is returned
* is `:d3en` - `InstanceClass/D3EN` is returned
* is `:standard7-graviton3-nvme-drive` - `InstanceClass/STANDARD7_GRAVITON3_NVME_DRIVE` is returned
* is `:g5g` - `InstanceClass/G5G` is returned
* is `:high-performance-computing6-intel-nvme-drive` - `InstanceClass/HIGH_PERFORMANCE_COMPUTING6_INTEL_NVME_DRIVE` is returned
* is `:compute4` - `InstanceClass/COMPUTE4` is returned
* is `:p3` - `InstanceClass/P3` is returned
* is `:standard6-graviton2-nvme-drive` - `InstanceClass/STANDARD6_GRAVITON2_NVME_DRIVE` is returned
* is `:g4ad` - `InstanceClass/G4AD` is returned
* is `:p4de` - `InstanceClass/P4DE` is returned
* is `:memory4` - `InstanceClass/MEMORY4` is returned
* is `:parallel5` - `InstanceClass/PARALLEL5` is returned
* is `:mac2` - `InstanceClass/MAC2` is returned
* is `:t4g` - `InstanceClass/T4G` is returned
* is `:compute7-amd` - `InstanceClass/COMPUTE7_AMD` is returned
* is `:t2` - `InstanceClass/T2` is returned
* is `:r6id` - `InstanceClass/R6ID` is returned
* is `:c6a` - `InstanceClass/C6A` is returned
* is `:u-3tb1` - `InstanceClass/U_3TB1` is returned
* is `:deep-learning2-qualcomm` - `InstanceClass/DEEP_LEARNING2_QUALCOMM` is returned
* is `:compute6-graviton2` - `InstanceClass/COMPUTE6_GRAVITON2` is returned
* is `:standard7-intel-flex` - `InstanceClass/STANDARD7_INTEL_FLEX` is returned
* is `:compute5-high-performance` - `InstanceClass/COMPUTE5_HIGH_PERFORMANCE` is returned
* is `:mac2-m2` - `InstanceClass/MAC2_M2` is returned
* is `:compute7-graviton3-nvme-drive` - `InstanceClass/COMPUTE7_GRAVITON3_NVME_DRIVE` is returned
* is `:m6g` - `InstanceClass/M6G` is returned
* is `:r5b` - `InstanceClass/R5B` is returned
* is `:memory-intensive-2-intel` - `InstanceClass/MEMORY_INTENSIVE_2_INTEL` is returned
* is `:burstable4-graviton` - `InstanceClass/BURSTABLE4_GRAVITON` is returned
* is `:memory7-amd` - `InstanceClass/MEMORY7_AMD` is returned
* is `:r3` - `InstanceClass/R3` is returned
* is `:deep-learning1` - `InstanceClass/DEEP_LEARNING1` is returned
* is `:m6i` - `InstanceClass/M6I` is returned
* is `:standard5-amd-nvme-drive` - `InstanceClass/STANDARD5_AMD_NVME_DRIVE` is returned
* is `:compute3` - `InstanceClass/COMPUTE3` is returned
* is `:standard7-intel` - `InstanceClass/STANDARD7_INTEL` is returned
* is `:c6gd` - `InstanceClass/C6GD` is returned
* is `:memory-intensive-2-xt-intel` - `InstanceClass/MEMORY_INTENSIVE_2_XT_INTEL` is returned
* is `:d2` - `InstanceClass/D2` is returned
* is `:c7i` - `InstanceClass/C7I` is returned
* is `:graphics5` - `InstanceClass/GRAPHICS5` is returned
* is `:compute6-intel` - `InstanceClass/COMPUTE6_INTEL` is returned
* is `:memory-intensive-2-xtz-intel` - `InstanceClass/MEMORY_INTENSIVE_2_XTZ_INTEL` is returned
* is `:t3` - `InstanceClass/T3` is returned
* is `:compute6-graviton2-high-network-bandwidth` - `InstanceClass/COMPUTE6_GRAVITON2_HIGH_NETWORK_BANDWIDTH` is returned
* is `:storage3-enhanced-network` - `InstanceClass/STORAGE3_ENHANCED_NETWORK` is returned
* is `:c7gd` - `InstanceClass/C7GD` is returned
* is `:x2idn` - `InstanceClass/X2IDN` is returned
* is `:c5a` - `InstanceClass/C5A` is returned
* is `:memory6-intel-nvme-drive-high-performance` - `InstanceClass/MEMORY6_INTEL_NVME_DRIVE_HIGH_PERFORMANCE` is returned
* is `:high-performance-computing7-graviton` - `InstanceClass/HIGH_PERFORMANCE_COMPUTING7_GRAVITON` is returned
* is `:graphics3-small` - `InstanceClass/GRAPHICS3_SMALL` is returned
* is `:c4` - `InstanceClass/C4` is returned
* is `:memory5-nvme-drive` - `InstanceClass/MEMORY5_NVME_DRIVE` is returned
* is `:u-12tb1` - `InstanceClass/U_12TB1` is returned
* is `:burstable2` - `InstanceClass/BURSTABLE2` is returned
* is `:r6idn` - `InstanceClass/R6IDN` is returned
* is `:m7i-flex` - `InstanceClass/M7I_FLEX` is returned
* is `:high-performance-computing7-amd` - `InstanceClass/HIGH_PERFORMANCE_COMPUTING7_AMD` is returned
* is `:burstable3-amd` - `InstanceClass/BURSTABLE3_AMD` is returned
* is `:g3s` - `InstanceClass/G3S` is returned
* is `:memory7-graviton` - `InstanceClass/MEMORY7_GRAVITON` is returned
* is `:d3` - `InstanceClass/D3` is returned
* is `:compute7-intel` - `InstanceClass/COMPUTE7_INTEL` is returned
* is `:memory6-intel` - `InstanceClass/MEMORY6_INTEL` is returned
* is `:g3` - `InstanceClass/G3` is returned
* is `:m5zn` - `InstanceClass/M5ZN` is returned
* is `:p5` - `InstanceClass/P5` is returned
* is `:g4dn` - `InstanceClass/G4DN` is returned
* is `:z1d` - `InstanceClass/Z1D` is returned
* is `:r6g` - `InstanceClass/R6G` is returned
* is `:r7a` - `InstanceClass/R7A` is returned
* is `:memory7-graviton3-nvme-drive` - `InstanceClass/MEMORY7_GRAVITON3_NVME_DRIVE` is returned
* is `:io4-intel` - `InstanceClass/IO4_INTEL` is returned
* is `:is4gen` - `InstanceClass/IS4GEN` is returned
* is `:compute6-amd` - `InstanceClass/COMPUTE6_AMD` is returned
* is `:dl2q` - `InstanceClass/DL2Q` is returned
* is `:macintosh2-m2` - `InstanceClass/MACINTOSH2_M2` is returned
* is `:standard3` - `InstanceClass/STANDARD3` is returned
* is `:r7i` - `InstanceClass/R7I` is returned
* is `:p2` - `InstanceClass/P2` is returned
* is `:high-memory-9tb-1` - `InstanceClass/HIGH_MEMORY_9TB_1` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InstanceClass data) data
      (= :c5d data) InstanceClass/C5D
      (= :standard7-amd data) InstanceClass/STANDARD7_AMD
      (= :fpga1 data) InstanceClass/FPGA1
      (= :standard7-graviton data) InstanceClass/STANDARD7_GRAVITON
      (= :r4 data) InstanceClass/R4
      (= :p3dn data) InstanceClass/P3DN
      (= :memory5-amd data) InstanceClass/MEMORY5_AMD
      (= :memory-intensive-2-graviton2-nvme-drive data) InstanceClass/MEMORY_INTENSIVE_2_GRAVITON2_NVME_DRIVE
      (= :standard5 data) InstanceClass/STANDARD5
      (= :memory5-high-performance data) InstanceClass/MEMORY5_HIGH_PERFORMANCE
      (= :standard6-amd data) InstanceClass/STANDARD6_AMD
      (= :standard5-high-compute data) InstanceClass/STANDARD5_HIGH_COMPUTE
      (= :memory6-intel-nvme-drive data) InstanceClass/MEMORY6_INTEL_NVME_DRIVE
      (= :high-memory-24tb-1 data) InstanceClass/HIGH_MEMORY_24TB_1
      (= :i4g data) InstanceClass/I4G
      (= :m5n data) InstanceClass/M5N
      (= :c6i data) InstanceClass/C6I
      (= :dl1 data) InstanceClass/DL1
      (= :memory5-ebs-optimized data) InstanceClass/MEMORY5_EBS_OPTIMIZED
      (= :compute5-amd data) InstanceClass/COMPUTE5_AMD
      (= :compute5 data) InstanceClass/COMPUTE5
      (= :parallel2 data) InstanceClass/PARALLEL2
      (= :m6in data) InstanceClass/M6IN
      (= :hpc6id data) InstanceClass/HPC6ID
      (= :r7g data) InstanceClass/R7G
      (= :trn1 data) InstanceClass/TRN1
      (= :compute5-amd-nvme-drive data) InstanceClass/COMPUTE5_AMD_NVME_DRIVE
      (= :standard5-high-performance data) InstanceClass/STANDARD5_HIGH_PERFORMANCE
      (= :i4i data) InstanceClass/I4I
      (= :a1 data) InstanceClass/A1
      (= :c6gn data) InstanceClass/C6GN
      (= :graphics4-nvme-drive-high-performance data) InstanceClass/GRAPHICS4_NVME_DRIVE_HIGH_PERFORMANCE
      (= :storage3 data) InstanceClass/STORAGE3
      (= :storage4-graviton-network-storage-optimized data) InstanceClass/STORAGE4_GRAVITON_NETWORK_STORAGE_OPTIMIZED
      (= :c7g data) InstanceClass/C7G
      (= :high-memory-6tb-1 data) InstanceClass/HIGH_MEMORY_6TB_1
      (= :compute6-intel-nvme-drive data) InstanceClass/COMPUTE6_INTEL_NVME_DRIVE
      (= :r5dn data) InstanceClass/R5DN
      (= :t3a data) InstanceClass/T3A
      (= :u-6tb1 data) InstanceClass/U_6TB1
      (= :mac2-m2pro data) InstanceClass/MAC2_M2PRO
      (= :memory6-graviton2-nvme-drive data) InstanceClass/MEMORY6_GRAVITON2_NVME_DRIVE
      (= :x2iedn data) InstanceClass/X2IEDN
      (= :inference1 data) InstanceClass/INFERENCE1
      (= :high-compute-memory1 data) InstanceClass/HIGH_COMPUTE_MEMORY1
      (= :m6id data) InstanceClass/M6ID
      (= :memory7-intel data) InstanceClass/MEMORY7_INTEL
      (= :graphics5-graviton2 data) InstanceClass/GRAPHICS5_GRAVITON2
      (= :parallel3 data) InstanceClass/PARALLEL3
      (= :memory5-amd-nvme-drive data) InstanceClass/MEMORY5_AMD_NVME_DRIVE
      (= :r5a data) InstanceClass/R5A
      (= :m5d data) InstanceClass/M5D
      (= :m6gd data) InstanceClass/M6GD
      (= :r5d data) InstanceClass/R5D
      (= :trn1n data) InstanceClass/TRN1N
      (= :hpc7g data) InstanceClass/HPC7G
      (= :r7iz data) InstanceClass/R7IZ
      (= :compute7-graviton3 data) InstanceClass/COMPUTE7_GRAVITON3
      (= :c7a data) InstanceClass/C7A
      (= :m3 data) InstanceClass/M3
      (= :m5a data) InstanceClass/M5A
      (= :compute5-nvme-drive data) InstanceClass/COMPUTE5_NVME_DRIVE
      (= :memory7-intel-base data) InstanceClass/MEMORY7_INTEL_BASE
      (= :training-accelerator1-enhanced-network data) InstanceClass/TRAINING_ACCELERATOR1_ENHANCED_NETWORK
      (= :standard5-amd data) InstanceClass/STANDARD5_AMD
      (= :r6i data) InstanceClass/R6I
      (= :u-18tb1 data) InstanceClass/U_18TB1
      (= :m7i data) InstanceClass/M7I
      (= :c6g data) InstanceClass/C6G
      (= :r6in data) InstanceClass/R6IN
      (= :parallel3-nvme-drive-high-performance data) InstanceClass/PARALLEL3_NVME_DRIVE_HIGH_PERFORMANCE
      (= :high-memory-12tb-1 data) InstanceClass/HIGH_MEMORY_12TB_1
      (= :memory6-amd data) InstanceClass/MEMORY6_AMD
      (= :r6a data) InstanceClass/R6A
      (= :m4 data) InstanceClass/M4
      (= :graphics3 data) InstanceClass/GRAPHICS3
      (= :g5 data) InstanceClass/G5
      (= :high-memory-18tb-1 data) InstanceClass/HIGH_MEMORY_18TB_1
      (= :c5 data) InstanceClass/C5
      (= :training-accelerator1 data) InstanceClass/TRAINING_ACCELERATOR1
      (= :x1 data) InstanceClass/X1
      (= :x2iezn data) InstanceClass/X2IEZN
      (= :i3en data) InstanceClass/I3EN
      (= :memory3 data) InstanceClass/MEMORY3
      (= :m7gd data) InstanceClass/M7GD
      (= :x2g data) InstanceClass/X2G
      (= :io3-dense-nvme-drive data) InstanceClass/IO3_DENSE_NVME_DRIVE
      (= :standard6-intel-high-performance data) InstanceClass/STANDARD6_INTEL_HIGH_PERFORMANCE
      (= :r6gd data) InstanceClass/R6GD
      (= :video-transcoding1 data) InstanceClass/VIDEO_TRANSCODING1
      (= :macintosh2-m1 data) InstanceClass/MACINTOSH2_M1
      (= :m5dn data) InstanceClass/M5DN
      (= :storage4-graviton-network-optimized data) InstanceClass/STORAGE4_GRAVITON_NETWORK_OPTIMIZED
      (= :r5 data) InstanceClass/R5
      (= :x2gd data) InstanceClass/X2GD
      (= :memory-intensive-1-extended data) InstanceClass/MEMORY_INTENSIVE_1_EXTENDED
      (= :c5ad data) InstanceClass/C5AD
      (= :parallel4 data) InstanceClass/PARALLEL4
      (= :parallel4-nvme-drive-extended data) InstanceClass/PARALLEL4_NVME_DRIVE_EXTENDED
      (= :c6id data) InstanceClass/C6ID
      (= :m5ad data) InstanceClass/M5AD
      (= :c5n data) InstanceClass/C5N
      (= :macintosh1-intel data) InstanceClass/MACINTOSH1_INTEL
      (= :standard6-intel data) InstanceClass/STANDARD6_INTEL
      (= :memory-intensive-2-graviton2 data) InstanceClass/MEMORY_INTENSIVE_2_GRAVITON2
      (= :inference2 data) InstanceClass/INFERENCE2
      (= :compute6-intel-high-performance data) InstanceClass/COMPUTE6_INTEL_HIGH_PERFORMANCE
      (= :vt1 data) InstanceClass/VT1
      (= :memory5-nvme-drive-high-performance data) InstanceClass/MEMORY5_NVME_DRIVE_HIGH_PERFORMANCE
      (= :standard6-intel-nvme-drive-high-performance data) InstanceClass/STANDARD6_INTEL_NVME_DRIVE_HIGH_PERFORMANCE
      (= :storage2 data) InstanceClass/STORAGE2
      (= :high-performance-computing6-amd data) InstanceClass/HIGH_PERFORMANCE_COMPUTING6_AMD
      (= :arm1 data) InstanceClass/ARM1
      (= :x1e data) InstanceClass/X1E
      (= :inf1 data) InstanceClass/INF1
      (= :hpc6a data) InstanceClass/HPC6A
      (= :memory6-graviton data) InstanceClass/MEMORY6_GRAVITON
      (= :c3 data) InstanceClass/C3
      (= :macintosh2-m2-pro data) InstanceClass/MACINTOSH2_M2_PRO
      (= :c6in data) InstanceClass/C6IN
      (= :high-memory-3tb-1 data) InstanceClass/HIGH_MEMORY_3TB_1
      (= :graphics4-amd-nvme-drive data) InstanceClass/GRAPHICS4_AMD_NVME_DRIVE
      (= :mac1 data) InstanceClass/MAC1
      (= :standard5-nvme-drive data) InstanceClass/STANDARD5_NVME_DRIVE
      (= :memory6-intel-high-performance data) InstanceClass/MEMORY6_INTEL_HIGH_PERFORMANCE
      (= :m7g data) InstanceClass/M7G
      (= :hpc7a data) InstanceClass/HPC7A
      (= :compute7-graviton3-high-network-bandwidth data) InstanceClass/COMPUTE7_GRAVITON3_HIGH_NETWORK_BANDWIDTH
      (= :h1 data) InstanceClass/H1
      (= :inf2 data) InstanceClass/INF2
      (= :u-24tb1 data) InstanceClass/U_24TB1
      (= :im4gn data) InstanceClass/IM4GN
      (= :m6idn data) InstanceClass/M6IDN
      (= :memory5 data) InstanceClass/MEMORY5
      (= :standard5-nvme-drive-high-performance data) InstanceClass/STANDARD5_NVME_DRIVE_HIGH_PERFORMANCE
      (= :standard4 data) InstanceClass/STANDARD4
      (= :r7gd data) InstanceClass/R7GD
      (= :r5ad data) InstanceClass/R5AD
      (= :c7gn data) InstanceClass/C7GN
      (= :p4d data) InstanceClass/P4D
      (= :f1 data) InstanceClass/F1
      (= :io3 data) InstanceClass/IO3
      (= :m7a data) InstanceClass/M7A
      (= :m6a data) InstanceClass/M6A
      (= :compute6-graviton2-nvme-drive data) InstanceClass/COMPUTE6_GRAVITON2_NVME_DRIVE
      (= :u-9tb1 data) InstanceClass/U_9TB1
      (= :memory-intensive-1 data) InstanceClass/MEMORY_INTENSIVE_1
      (= :storage4-graviton data) InstanceClass/STORAGE4_GRAVITON
      (= :standard6-graviton data) InstanceClass/STANDARD6_GRAVITON
      (= :m5 data) InstanceClass/M5
      (= :standard6-intel-nvme-drive data) InstanceClass/STANDARD6_INTEL_NVME_DRIVE
      (= :i3 data) InstanceClass/I3
      (= :burstable3 data) InstanceClass/BURSTABLE3
      (= :r5n data) InstanceClass/R5N
      (= :storage-compute-1 data) InstanceClass/STORAGE_COMPUTE_1
      (= :d3en data) InstanceClass/D3EN
      (= :standard7-graviton3-nvme-drive data) InstanceClass/STANDARD7_GRAVITON3_NVME_DRIVE
      (= :g5g data) InstanceClass/G5G
      (= :high-performance-computing6-intel-nvme-drive data) InstanceClass/HIGH_PERFORMANCE_COMPUTING6_INTEL_NVME_DRIVE
      (= :compute4 data) InstanceClass/COMPUTE4
      (= :p3 data) InstanceClass/P3
      (= :standard6-graviton2-nvme-drive data) InstanceClass/STANDARD6_GRAVITON2_NVME_DRIVE
      (= :g4ad data) InstanceClass/G4AD
      (= :p4de data) InstanceClass/P4DE
      (= :memory4 data) InstanceClass/MEMORY4
      (= :parallel5 data) InstanceClass/PARALLEL5
      (= :mac2 data) InstanceClass/MAC2
      (= :t4g data) InstanceClass/T4G
      (= :compute7-amd data) InstanceClass/COMPUTE7_AMD
      (= :t2 data) InstanceClass/T2
      (= :r6id data) InstanceClass/R6ID
      (= :c6a data) InstanceClass/C6A
      (= :u-3tb1 data) InstanceClass/U_3TB1
      (= :deep-learning2-qualcomm data) InstanceClass/DEEP_LEARNING2_QUALCOMM
      (= :compute6-graviton2 data) InstanceClass/COMPUTE6_GRAVITON2
      (= :standard7-intel-flex data) InstanceClass/STANDARD7_INTEL_FLEX
      (= :compute5-high-performance data) InstanceClass/COMPUTE5_HIGH_PERFORMANCE
      (= :mac2-m2 data) InstanceClass/MAC2_M2
      (= :compute7-graviton3-nvme-drive data) InstanceClass/COMPUTE7_GRAVITON3_NVME_DRIVE
      (= :m6g data) InstanceClass/M6G
      (= :r5b data) InstanceClass/R5B
      (= :memory-intensive-2-intel data) InstanceClass/MEMORY_INTENSIVE_2_INTEL
      (= :burstable4-graviton data) InstanceClass/BURSTABLE4_GRAVITON
      (= :memory7-amd data) InstanceClass/MEMORY7_AMD
      (= :r3 data) InstanceClass/R3
      (= :deep-learning1 data) InstanceClass/DEEP_LEARNING1
      (= :m6i data) InstanceClass/M6I
      (= :standard5-amd-nvme-drive data) InstanceClass/STANDARD5_AMD_NVME_DRIVE
      (= :compute3 data) InstanceClass/COMPUTE3
      (= :standard7-intel data) InstanceClass/STANDARD7_INTEL
      (= :c6gd data) InstanceClass/C6GD
      (= :memory-intensive-2-xt-intel data) InstanceClass/MEMORY_INTENSIVE_2_XT_INTEL
      (= :d2 data) InstanceClass/D2
      (= :c7i data) InstanceClass/C7I
      (= :graphics5 data) InstanceClass/GRAPHICS5
      (= :compute6-intel data) InstanceClass/COMPUTE6_INTEL
      (= :memory-intensive-2-xtz-intel data) InstanceClass/MEMORY_INTENSIVE_2_XTZ_INTEL
      (= :t3 data) InstanceClass/T3
      (= :compute6-graviton2-high-network-bandwidth data) InstanceClass/COMPUTE6_GRAVITON2_HIGH_NETWORK_BANDWIDTH
      (= :storage3-enhanced-network data) InstanceClass/STORAGE3_ENHANCED_NETWORK
      (= :c7gd data) InstanceClass/C7GD
      (= :x2idn data) InstanceClass/X2IDN
      (= :c5a data) InstanceClass/C5A
      (= :memory6-intel-nvme-drive-high-performance data) InstanceClass/MEMORY6_INTEL_NVME_DRIVE_HIGH_PERFORMANCE
      (= :high-performance-computing7-graviton data) InstanceClass/HIGH_PERFORMANCE_COMPUTING7_GRAVITON
      (= :graphics3-small data) InstanceClass/GRAPHICS3_SMALL
      (= :c4 data) InstanceClass/C4
      (= :memory5-nvme-drive data) InstanceClass/MEMORY5_NVME_DRIVE
      (= :u-12tb1 data) InstanceClass/U_12TB1
      (= :burstable2 data) InstanceClass/BURSTABLE2
      (= :r6idn data) InstanceClass/R6IDN
      (= :m7i-flex data) InstanceClass/M7I_FLEX
      (= :high-performance-computing7-amd data) InstanceClass/HIGH_PERFORMANCE_COMPUTING7_AMD
      (= :burstable3-amd data) InstanceClass/BURSTABLE3_AMD
      (= :g3s data) InstanceClass/G3S
      (= :memory7-graviton data) InstanceClass/MEMORY7_GRAVITON
      (= :d3 data) InstanceClass/D3
      (= :compute7-intel data) InstanceClass/COMPUTE7_INTEL
      (= :memory6-intel data) InstanceClass/MEMORY6_INTEL
      (= :g3 data) InstanceClass/G3
      (= :m5zn data) InstanceClass/M5ZN
      (= :p5 data) InstanceClass/P5
      (= :g4dn data) InstanceClass/G4DN
      (= :z1d data) InstanceClass/Z1D
      (= :r6g data) InstanceClass/R6G
      (= :r7a data) InstanceClass/R7A
      (= :memory7-graviton3-nvme-drive data) InstanceClass/MEMORY7_GRAVITON3_NVME_DRIVE
      (= :io4-intel data) InstanceClass/IO4_INTEL
      (= :is4gen data) InstanceClass/IS4GEN
      (= :compute6-amd data) InstanceClass/COMPUTE6_AMD
      (= :dl2q data) InstanceClass/DL2Q
      (= :macintosh2-m2 data) InstanceClass/MACINTOSH2_M2
      (= :standard3 data) InstanceClass/STANDARD3
      (= :r7i data) InstanceClass/R7I
      (= :p2 data) InstanceClass/P2
      (= :high-memory-9tb-1 data) InstanceClass/HIGH_MEMORY_9TB_1)))


(defn instance-initiated-shutdown-behavior
  "The `instance-initiated-shutdown-behavior` function data interprets values in the provided config data into a 
`InstanceInitiatedShutdownBehavior` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InstanceInitiatedShutdownBehavior` - the value is returned.
* is `:stop` - `InstanceInitiatedShutdownBehavior/STOP` is returned
* is `:terminate` - `InstanceInitiatedShutdownBehavior/TERMINATE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InstanceInitiatedShutdownBehavior data) data
      (= :stop data) InstanceInitiatedShutdownBehavior/STOP
      (= :terminate data) InstanceInitiatedShutdownBehavior/TERMINATE)))


(defn instance-size
  "The `instance-size` function data interprets values in the provided config data into a 
`InstanceSize` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InstanceSize` - the value is returned.
* is `:small` - `InstanceSize/SMALL` is returned
* is `:xlarge6` - `InstanceSize/XLARGE6` is returned
* is `:large` - `InstanceSize/LARGE` is returned
* is `:metal` - `InstanceSize/METAL` is returned
* is `:xlarge48` - `InstanceSize/XLARGE48` is returned
* is `:xlarge9` - `InstanceSize/XLARGE9` is returned
* is `:xlarge24metal` - `InstanceSize/XLARGE24METAL` is returned
* is `:xlarge48metal` - `InstanceSize/XLARGE48METAL` is returned
* is `:xlarge112` - `InstanceSize/XLARGE112` is returned
* is `:xlarge16metal` - `InstanceSize/XLARGE16METAL` is returned
* is `:xlarge18` - `InstanceSize/XLARGE18` is returned
* is `:xlarge8` - `InstanceSize/XLARGE8` is returned
* is `:medium` - `InstanceSize/MEDIUM` is returned
* is `:nano` - `InstanceSize/NANO` is returned
* is `:xlarge16` - `InstanceSize/XLARGE16` is returned
* is `:xlarge12` - `InstanceSize/XLARGE12` is returned
* is `:xlarge3` - `InstanceSize/XLARGE3` is returned
* is `:micro` - `InstanceSize/MICRO` is returned
* is `:xlarge32` - `InstanceSize/XLARGE32` is returned
* is `:xlarge10` - `InstanceSize/XLARGE10` is returned
* is `:xlarge24` - `InstanceSize/XLARGE24` is returned
* is `:xlarge56` - `InstanceSize/XLARGE56` is returned
* is `:xlarge4` - `InstanceSize/XLARGE4` is returned
* is `:xlarge32metal` - `InstanceSize/XLARGE32METAL` is returned
* is `:xlarge2` - `InstanceSize/XLARGE2` is returned
* is `:xlarge` - `InstanceSize/XLARGE` is returned
* is `:xlarge96` - `InstanceSize/XLARGE96` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InstanceSize data) data
      (= :small data) InstanceSize/SMALL
      (= :xlarge6 data) InstanceSize/XLARGE6
      (= :large data) InstanceSize/LARGE
      (= :metal data) InstanceSize/METAL
      (= :xlarge48 data) InstanceSize/XLARGE48
      (= :xlarge9 data) InstanceSize/XLARGE9
      (= :xlarge24metal data) InstanceSize/XLARGE24METAL
      (= :xlarge48metal data) InstanceSize/XLARGE48METAL
      (= :xlarge112 data) InstanceSize/XLARGE112
      (= :xlarge16metal data) InstanceSize/XLARGE16METAL
      (= :xlarge18 data) InstanceSize/XLARGE18
      (= :xlarge8 data) InstanceSize/XLARGE8
      (= :medium data) InstanceSize/MEDIUM
      (= :nano data) InstanceSize/NANO
      (= :xlarge16 data) InstanceSize/XLARGE16
      (= :xlarge12 data) InstanceSize/XLARGE12
      (= :xlarge3 data) InstanceSize/XLARGE3
      (= :micro data) InstanceSize/MICRO
      (= :xlarge32 data) InstanceSize/XLARGE32
      (= :xlarge10 data) InstanceSize/XLARGE10
      (= :xlarge24 data) InstanceSize/XLARGE24
      (= :xlarge56 data) InstanceSize/XLARGE56
      (= :xlarge4 data) InstanceSize/XLARGE4
      (= :xlarge32metal data) InstanceSize/XLARGE32METAL
      (= :xlarge2 data) InstanceSize/XLARGE2
      (= :xlarge data) InstanceSize/XLARGE
      (= :xlarge96 data) InstanceSize/XLARGE96)))


(defn ip-protocol
  "The `ip-protocol` function data interprets values in the provided config data into a 
`IpProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `IpProtocol` - the value is returned.
* is `:ipv4-only` - `IpProtocol/IPV4_ONLY` is returned
* is `:dual-stack` - `IpProtocol/DUAL_STACK` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? IpProtocol data) data
      (= :ipv4-only data) IpProtocol/IPV4_ONLY
      (= :dual-stack data) IpProtocol/DUAL_STACK)))


(defn key-pair-format
  "The `key-pair-format` function data interprets values in the provided config data into a 
`KeyPairFormat` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `KeyPairFormat` - the value is returned.
* is `:ppk` - `KeyPairFormat/PPK` is returned
* is `:pem` - `KeyPairFormat/PEM` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? KeyPairFormat data) data
      (= :ppk data) KeyPairFormat/PPK
      (= :pem data) KeyPairFormat/PEM)))


(defn key-pair-type
  "The `key-pair-type` function data interprets values in the provided config data into a 
`KeyPairType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `KeyPairType` - the value is returned.
* is `:ed25519` - `KeyPairType/ED25519` is returned
* is `:rsa` - `KeyPairType/RSA` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? KeyPairType data) data
      (= :ed25519 data) KeyPairType/ED25519
      (= :rsa data) KeyPairType/RSA)))


(defn launch-template-http-tokens
  "The `launch-template-http-tokens` function data interprets values in the provided config data into a 
`LaunchTemplateHttpTokens` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LaunchTemplateHttpTokens` - the value is returned.
* is `:optional` - `LaunchTemplateHttpTokens/OPTIONAL` is returned
* is `:required` - `LaunchTemplateHttpTokens/REQUIRED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LaunchTemplateHttpTokens data) data
      (= :optional data) LaunchTemplateHttpTokens/OPTIONAL
      (= :required data) LaunchTemplateHttpTokens/REQUIRED)))


(defn nat-traffic-direction
  "The `nat-traffic-direction` function data interprets values in the provided config data into a 
`NatTrafficDirection` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `NatTrafficDirection` - the value is returned.
* is `:outbound-only` - `NatTrafficDirection/OUTBOUND_ONLY` is returned
* is `:inbound-and-outbound` - `NatTrafficDirection/INBOUND_AND_OUTBOUND` is returned
* is `:none` - `NatTrafficDirection/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? NatTrafficDirection data) data
      (= :outbound-only data) NatTrafficDirection/OUTBOUND_ONLY
      (= :inbound-and-outbound data) NatTrafficDirection/INBOUND_AND_OUTBOUND
      (= :none data) NatTrafficDirection/NONE)))


(defn operating-system-type
  "The `operating-system-type` function data interprets values in the provided config data into a 
`OperatingSystemType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `OperatingSystemType` - the value is returned.
* is `:windows` - `OperatingSystemType/WINDOWS` is returned
* is `:linux` - `OperatingSystemType/LINUX` is returned
* is `:unknown` - `OperatingSystemType/UNKNOWN` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? OperatingSystemType data) data
      (= :windows data) OperatingSystemType/WINDOWS
      (= :linux data) OperatingSystemType/LINUX
      (= :unknown data) OperatingSystemType/UNKNOWN)))


(defn placement-group-spread-level
  "The `placement-group-spread-level` function data interprets values in the provided config data into a 
`PlacementGroupSpreadLevel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PlacementGroupSpreadLevel` - the value is returned.
* is `:rack` - `PlacementGroupSpreadLevel/RACK` is returned
* is `:host` - `PlacementGroupSpreadLevel/HOST` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PlacementGroupSpreadLevel data) data
      (= :rack data) PlacementGroupSpreadLevel/RACK
      (= :host data) PlacementGroupSpreadLevel/HOST)))


(defn placement-group-strategy
  "The `placement-group-strategy` function data interprets values in the provided config data into a 
`PlacementGroupStrategy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PlacementGroupStrategy` - the value is returned.
* is `:partition` - `PlacementGroupStrategy/PARTITION` is returned
* is `:spread` - `PlacementGroupStrategy/SPREAD` is returned
* is `:cluster` - `PlacementGroupStrategy/CLUSTER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PlacementGroupStrategy data) data
      (= :partition data) PlacementGroupStrategy/PARTITION
      (= :spread data) PlacementGroupStrategy/SPREAD
      (= :cluster data) PlacementGroupStrategy/CLUSTER)))


(defn protocol
  "The `protocol` function data interprets values in the provided config data into a 
`Protocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Protocol` - the value is returned.
* is `:tpplusplus` - `Protocol/TPPLUSPLUS` is returned
* is `:netblt` - `Protocol/NETBLT` is returned
* is `:ipv6-frag` - `Protocol/IPV6_FRAG` is returned
* is `:sscopmce` - `Protocol/SSCOPMCE` is returned
* is `:pup` - `Protocol/PUP` is returned
* is `:tcf` - `Protocol/TCF` is returned
* is `:ggp` - `Protocol/GGP` is returned
* is `:mobile` - `Protocol/MOBILE` is returned
* is `:iptm` - `Protocol/IPTM` is returned
* is `:igp` - `Protocol/IGP` is returned
* is `:cftp` - `Protocol/CFTP` is returned
* is `:snp` - `Protocol/SNP` is returned
* is `:qnx` - `Protocol/QNX` is returned
* is `:sps` - `Protocol/SPS` is returned
* is `:wb-mon` - `Protocol/WB_MON` is returned
* is `:ttp` - `Protocol/TTP` is returned
* is `:smp` - `Protocol/SMP` is returned
* is `:uti` - `Protocol/UTI` is returned
* is `:narp` - `Protocol/NARP` is returned
* is `:fc` - `Protocol/FC` is returned
* is `:chaos` - `Protocol/CHAOS` is returned
* is `:ifmp` - `Protocol/IFMP` is returned
* is `:tcp` - `Protocol/TCP` is returned
* is `:ipv6-route` - `Protocol/IPV6_ROUTE` is returned
* is `:experiment-2` - `Protocol/EXPERIMENT_2` is returned
* is `:srp` - `Protocol/SRP` is returned
* is `:ipv6` - `Protocol/IPV6` is returned
* is `:micp` - `Protocol/MICP` is returned
* is `:stp` - `Protocol/STP` is returned
* is `:i-nlsp` - `Protocol/I_NLSP` is returned
* is `:mfe-nsp` - `Protocol/MFE_NSP` is returned
* is `:sat-mon` - `Protocol/SAT_MON` is returned
* is `:il` - `Protocol/IL` is returned
* is `:l2-t-p` - `Protocol/L2_T_P` is returned
* is `:reserved` - `Protocol/RESERVED` is returned
* is `:gre` - `Protocol/GRE` is returned
* is `:experiment-1` - `Protocol/EXPERIMENT_1` is returned
* is `:trunk-1` - `Protocol/TRUNK_1` is returned
* is `:icmp` - `Protocol/ICMP` is returned
* is `:gmtp` - `Protocol/GMTP` is returned
* is `:aris` - `Protocol/ARIS` is returned
* is `:swipe` - `Protocol/SWIPE` is returned
* is `:emcon` - `Protocol/EMCON` is returned
* is `:eigrp` - `Protocol/EIGRP` is returned
* is `:merit-inp` - `Protocol/MERIT_INP` is returned
* is `:etherip` - `Protocol/ETHERIP` is returned
* is `:ddx` - `Protocol/DDX` is returned
* is `:vines` - `Protocol/VINES` is returned
* is `:fire` - `Protocol/FIRE` is returned
* is `:wb-expak` - `Protocol/WB_EXPAK` is returned
* is `:idpr-cmtp` - `Protocol/IDPR_CMTP` is returned
* is `:ipv6-opts` - `Protocol/IPV6_OPTS` is returned
* is `:iso-ip` - `Protocol/ISO_IP` is returned
* is `:vmtp` - `Protocol/VMTP` is returned
* is `:any-dfs` - `Protocol/ANY_DFS` is returned
* is `:st` - `Protocol/ST` is returned
* is `:encap` - `Protocol/ENCAP` is returned
* is `:bna` - `Protocol/BNA` is returned
* is `:iplt` - `Protocol/IPLT` is returned
* is `:any-0-hop` - `Protocol/ANY_0_HOP` is returned
* is `:sm` - `Protocol/SM` is returned
* is `:pgm` - `Protocol/PGM` is returned
* is `:ptp` - `Protocol/PTP` is returned
* is `:tlsp` - `Protocol/TLSP` is returned
* is `:iso-tp4` - `Protocol/ISO_TP4` is returned
* is `:crtp` - `Protocol/CRTP` is returned
* is `:udp` - `Protocol/UDP` is returned
* is `:trunk-2` - `Protocol/TRUNK_2` is returned
* is `:sun-nd` - `Protocol/SUN_ND` is returned
* is `:ipv6-nonxt` - `Protocol/IPV6_NONXT` is returned
* is `:dccp` - `Protocol/DCCP` is returned
* is `:nvp-ii` - `Protocol/NVP_II` is returned
* is `:dcn-meas` - `Protocol/DCN_MEAS` is returned
* is `:rdp` - `Protocol/RDP` is returned
* is `:xnet` - `Protocol/XNET` is returned
* is `:ipx-in-ip` - `Protocol/IPX_IN_IP` is returned
* is `:esp` - `Protocol/ESP` is returned
* is `:crudp` - `Protocol/CRUDP` is returned
* is `:shim6` - `Protocol/SHIM6` is returned
* is `:br-sat-mon` - `Protocol/BR_SAT_MON` is returned
* is `:hip` - `Protocol/HIP` is returned
* is `:sdrp` - `Protocol/SDRP` is returned
* is `:larp` - `Protocol/LARP` is returned
* is `:rsvp` - `Protocol/RSVP` is returned
* is `:ah` - `Protocol/AH` is returned
* is `:hopopt` - `Protocol/HOPOPT` is returned
* is `:isis-ipv4` - `Protocol/ISIS_IPV4` is returned
* is `:rohc` - `Protocol/ROHC` is returned
* is `:mtp` - `Protocol/MTP` is returned
* is `:nsfnet-igp` - `Protocol/NSFNET_IGP` is returned
* is `:vrrp` - `Protocol/VRRP` is returned
* is `:a-n` - `Protocol/A_N` is returned
* is `:rsvp-e2e-ignore` - `Protocol/RSVP_E2E_IGNORE` is returned
* is `:sctp` - `Protocol/SCTP` is returned
* is `:kryptolan` - `Protocol/KRYPTOLAN` is returned
* is `:ethernet` - `Protocol/ETHERNET` is returned
* is `:mpls-in-ip` - `Protocol/MPLS_IN_IP` is returned
* is `:ippc` - `Protocol/IPPC` is returned
* is `:ipv4` - `Protocol/IPV4` is returned
* is `:any-enc` - `Protocol/ANY_ENC` is returned
* is `:xtp` - `Protocol/XTP` is returned
* is `:scc-sp` - `Protocol/SCC_SP` is returned
* is `:manet` - `Protocol/MANET` is returned
* is `:pnni` - `Protocol/PNNI` is returned
* is `:pim` - `Protocol/PIM` is returned
* is `:igmp` - `Protocol/IGMP` is returned
* is `:cbt` - `Protocol/CBT` is returned
* is `:ipcomp` - `Protocol/IPCOMP` is returned
* is `:prm` - `Protocol/PRM` is returned
* is `:irtp` - `Protocol/IRTP` is returned
* is `:pvp` - `Protocol/PVP` is returned
* is `:sat-expak` - `Protocol/SAT_EXPAK` is returned
* is `:mobility-header` - `Protocol/MOBILITY_HEADER` is returned
* is `:icmpv6` - `Protocol/ICMPV6` is returned
* is `:leaf-2` - `Protocol/LEAF_2` is returned
* is `:compaq-peer` - `Protocol/COMPAQ_PEER` is returned
* is `:cphb` - `Protocol/CPHB` is returned
* is `:cpnx` - `Protocol/CPNX` is returned
* is `:egp` - `Protocol/EGP` is returned
* is `:xns-idp` - `Protocol/XNS_IDP` is returned
* is `:mux` - `Protocol/MUX` is returned
* is `:bbn-rcc-mon` - `Protocol/BBN_RCC_MON` is returned
* is `:dsr` - `Protocol/DSR` is returned
* is `:udplite` - `Protocol/UDPLITE` is returned
* is `:dgp` - `Protocol/DGP` is returned
* is `:secure-vmtp` - `Protocol/SECURE_VMTP` is returned
* is `:idrp` - `Protocol/IDRP` is returned
* is `:ipcv` - `Protocol/IPCV` is returned
* is `:leaf-1` - `Protocol/LEAF_1` is returned
* is `:idpr` - `Protocol/IDPR` is returned
* is `:ipip` - `Protocol/IPIP` is returned
* is `:rvd` - `Protocol/RVD` is returned
* is `:hmp` - `Protocol/HMP` is returned
* is `:iatp` - `Protocol/IATP` is returned
* is `:skip` - `Protocol/SKIP` is returned
* is `:threepc` - `Protocol/THREEPC` is returned
* is `:scps` - `Protocol/SCPS` is returned
* is `:sprite-rpc` - `Protocol/SPRITE_RPC` is returned
* is `:visa` - `Protocol/VISA` is returned
* is `:ax-25` - `Protocol/AX_25` is returned
* is `:ospfigp` - `Protocol/OSPFIGP` is returned
* is `:wsn` - `Protocol/WSN` is returned
* is `:pipe` - `Protocol/PIPE` is returned
* is `:ddp` - `Protocol/DDP` is returned
* is `:wesp` - `Protocol/WESP` is returned
* is `:all` - `Protocol/ALL` is returned
* is `:any-local` - `Protocol/ANY_LOCAL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Protocol data) data
      (= :tpplusplus data) Protocol/TPPLUSPLUS
      (= :netblt data) Protocol/NETBLT
      (= :ipv6-frag data) Protocol/IPV6_FRAG
      (= :sscopmce data) Protocol/SSCOPMCE
      (= :pup data) Protocol/PUP
      (= :tcf data) Protocol/TCF
      (= :ggp data) Protocol/GGP
      (= :mobile data) Protocol/MOBILE
      (= :iptm data) Protocol/IPTM
      (= :igp data) Protocol/IGP
      (= :cftp data) Protocol/CFTP
      (= :snp data) Protocol/SNP
      (= :qnx data) Protocol/QNX
      (= :sps data) Protocol/SPS
      (= :wb-mon data) Protocol/WB_MON
      (= :ttp data) Protocol/TTP
      (= :smp data) Protocol/SMP
      (= :uti data) Protocol/UTI
      (= :narp data) Protocol/NARP
      (= :fc data) Protocol/FC
      (= :chaos data) Protocol/CHAOS
      (= :ifmp data) Protocol/IFMP
      (= :tcp data) Protocol/TCP
      (= :ipv6-route data) Protocol/IPV6_ROUTE
      (= :experiment-2 data) Protocol/EXPERIMENT_2
      (= :srp data) Protocol/SRP
      (= :ipv6 data) Protocol/IPV6
      (= :micp data) Protocol/MICP
      (= :stp data) Protocol/STP
      (= :i-nlsp data) Protocol/I_NLSP
      (= :mfe-nsp data) Protocol/MFE_NSP
      (= :sat-mon data) Protocol/SAT_MON
      (= :il data) Protocol/IL
      (= :l2-t-p data) Protocol/L2_T_P
      (= :reserved data) Protocol/RESERVED
      (= :gre data) Protocol/GRE
      (= :experiment-1 data) Protocol/EXPERIMENT_1
      (= :trunk-1 data) Protocol/TRUNK_1
      (= :icmp data) Protocol/ICMP
      (= :gmtp data) Protocol/GMTP
      (= :aris data) Protocol/ARIS
      (= :swipe data) Protocol/SWIPE
      (= :emcon data) Protocol/EMCON
      (= :eigrp data) Protocol/EIGRP
      (= :merit-inp data) Protocol/MERIT_INP
      (= :etherip data) Protocol/ETHERIP
      (= :ddx data) Protocol/DDX
      (= :vines data) Protocol/VINES
      (= :fire data) Protocol/FIRE
      (= :wb-expak data) Protocol/WB_EXPAK
      (= :idpr-cmtp data) Protocol/IDPR_CMTP
      (= :ipv6-opts data) Protocol/IPV6_OPTS
      (= :iso-ip data) Protocol/ISO_IP
      (= :vmtp data) Protocol/VMTP
      (= :any-dfs data) Protocol/ANY_DFS
      (= :st data) Protocol/ST
      (= :encap data) Protocol/ENCAP
      (= :bna data) Protocol/BNA
      (= :iplt data) Protocol/IPLT
      (= :any-0-hop data) Protocol/ANY_0_HOP
      (= :sm data) Protocol/SM
      (= :pgm data) Protocol/PGM
      (= :ptp data) Protocol/PTP
      (= :tlsp data) Protocol/TLSP
      (= :iso-tp4 data) Protocol/ISO_TP4
      (= :crtp data) Protocol/CRTP
      (= :udp data) Protocol/UDP
      (= :trunk-2 data) Protocol/TRUNK_2
      (= :sun-nd data) Protocol/SUN_ND
      (= :ipv6-nonxt data) Protocol/IPV6_NONXT
      (= :dccp data) Protocol/DCCP
      (= :nvp-ii data) Protocol/NVP_II
      (= :dcn-meas data) Protocol/DCN_MEAS
      (= :rdp data) Protocol/RDP
      (= :xnet data) Protocol/XNET
      (= :ipx-in-ip data) Protocol/IPX_IN_IP
      (= :esp data) Protocol/ESP
      (= :crudp data) Protocol/CRUDP
      (= :shim6 data) Protocol/SHIM6
      (= :br-sat-mon data) Protocol/BR_SAT_MON
      (= :hip data) Protocol/HIP
      (= :sdrp data) Protocol/SDRP
      (= :larp data) Protocol/LARP
      (= :rsvp data) Protocol/RSVP
      (= :ah data) Protocol/AH
      (= :hopopt data) Protocol/HOPOPT
      (= :isis-ipv4 data) Protocol/ISIS_IPV4
      (= :rohc data) Protocol/ROHC
      (= :mtp data) Protocol/MTP
      (= :nsfnet-igp data) Protocol/NSFNET_IGP
      (= :vrrp data) Protocol/VRRP
      (= :a-n data) Protocol/A_N
      (= :rsvp-e2e-ignore data) Protocol/RSVP_E2E_IGNORE
      (= :sctp data) Protocol/SCTP
      (= :kryptolan data) Protocol/KRYPTOLAN
      (= :ethernet data) Protocol/ETHERNET
      (= :mpls-in-ip data) Protocol/MPLS_IN_IP
      (= :ippc data) Protocol/IPPC
      (= :ipv4 data) Protocol/IPV4
      (= :any-enc data) Protocol/ANY_ENC
      (= :xtp data) Protocol/XTP
      (= :scc-sp data) Protocol/SCC_SP
      (= :manet data) Protocol/MANET
      (= :pnni data) Protocol/PNNI
      (= :pim data) Protocol/PIM
      (= :igmp data) Protocol/IGMP
      (= :cbt data) Protocol/CBT
      (= :ipcomp data) Protocol/IPCOMP
      (= :prm data) Protocol/PRM
      (= :irtp data) Protocol/IRTP
      (= :pvp data) Protocol/PVP
      (= :sat-expak data) Protocol/SAT_EXPAK
      (= :mobility-header data) Protocol/MOBILITY_HEADER
      (= :icmpv6 data) Protocol/ICMPV6
      (= :leaf-2 data) Protocol/LEAF_2
      (= :compaq-peer data) Protocol/COMPAQ_PEER
      (= :cphb data) Protocol/CPHB
      (= :cpnx data) Protocol/CPNX
      (= :egp data) Protocol/EGP
      (= :xns-idp data) Protocol/XNS_IDP
      (= :mux data) Protocol/MUX
      (= :bbn-rcc-mon data) Protocol/BBN_RCC_MON
      (= :dsr data) Protocol/DSR
      (= :udplite data) Protocol/UDPLITE
      (= :dgp data) Protocol/DGP
      (= :secure-vmtp data) Protocol/SECURE_VMTP
      (= :idrp data) Protocol/IDRP
      (= :ipcv data) Protocol/IPCV
      (= :leaf-1 data) Protocol/LEAF_1
      (= :idpr data) Protocol/IDPR
      (= :ipip data) Protocol/IPIP
      (= :rvd data) Protocol/RVD
      (= :hmp data) Protocol/HMP
      (= :iatp data) Protocol/IATP
      (= :skip data) Protocol/SKIP
      (= :threepc data) Protocol/THREEPC
      (= :scps data) Protocol/SCPS
      (= :sprite-rpc data) Protocol/SPRITE_RPC
      (= :visa data) Protocol/VISA
      (= :ax-25 data) Protocol/AX_25
      (= :ospfigp data) Protocol/OSPFIGP
      (= :wsn data) Protocol/WSN
      (= :pipe data) Protocol/PIPE
      (= :ddp data) Protocol/DDP
      (= :wesp data) Protocol/WESP
      (= :all data) Protocol/ALL
      (= :any-local data) Protocol/ANY_LOCAL)))


(defn router-type
  "The `router-type` function data interprets values in the provided config data into a 
`RouterType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RouterType` - the value is returned.
* is `:nat-gateway` - `RouterType/NAT_GATEWAY` is returned
* is `:carrier-gateway` - `RouterType/CARRIER_GATEWAY` is returned
* is `:transit-gateway` - `RouterType/TRANSIT_GATEWAY` is returned
* is `:network-interface` - `RouterType/NETWORK_INTERFACE` is returned
* is `:egress-only-internet-gateway` - `RouterType/EGRESS_ONLY_INTERNET_GATEWAY` is returned
* is `:instance` - `RouterType/INSTANCE` is returned
* is `:gateway` - `RouterType/GATEWAY` is returned
* is `:vpc-peering-connection` - `RouterType/VPC_PEERING_CONNECTION` is returned
* is `:vpc-endpoint` - `RouterType/VPC_ENDPOINT` is returned
* is `:local-gateway` - `RouterType/LOCAL_GATEWAY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RouterType data) data
      (= :nat-gateway data) RouterType/NAT_GATEWAY
      (= :carrier-gateway data) RouterType/CARRIER_GATEWAY
      (= :transit-gateway data) RouterType/TRANSIT_GATEWAY
      (= :network-interface data) RouterType/NETWORK_INTERFACE
      (= :egress-only-internet-gateway data) RouterType/EGRESS_ONLY_INTERNET_GATEWAY
      (= :instance data) RouterType/INSTANCE
      (= :gateway data) RouterType/GATEWAY
      (= :vpc-peering-connection data) RouterType/VPC_PEERING_CONNECTION
      (= :vpc-endpoint data) RouterType/VPC_ENDPOINT
      (= :local-gateway data) RouterType/LOCAL_GATEWAY)))


(defn service-manager
  "The `service-manager` function data interprets values in the provided config data into a 
`ServiceManager` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ServiceManager` - the value is returned.
* is `:sysvinit` - `ServiceManager/SYSVINIT` is returned
* is `:windows` - `ServiceManager/WINDOWS` is returned
* is `:systemd` - `ServiceManager/SYSTEMD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ServiceManager data) data
      (= :sysvinit data) ServiceManager/SYSVINIT
      (= :windows data) ServiceManager/WINDOWS
      (= :systemd data) ServiceManager/SYSTEMD)))


(defn spot-instance-interruption
  "The `spot-instance-interruption` function data interprets values in the provided config data into a 
`SpotInstanceInterruption` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SpotInstanceInterruption` - the value is returned.
* is `:terminate` - `SpotInstanceInterruption/TERMINATE` is returned
* is `:hibernate` - `SpotInstanceInterruption/HIBERNATE` is returned
* is `:stop` - `SpotInstanceInterruption/STOP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SpotInstanceInterruption data) data
      (= :terminate data) SpotInstanceInterruption/TERMINATE
      (= :hibernate data) SpotInstanceInterruption/HIBERNATE
      (= :stop data) SpotInstanceInterruption/STOP)))


(defn spot-request-type
  "The `spot-request-type` function data interprets values in the provided config data into a 
`SpotRequestType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SpotRequestType` - the value is returned.
* is `:one-time` - `SpotRequestType/ONE_TIME` is returned
* is `:persistent` - `SpotRequestType/PERSISTENT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SpotRequestType data) data
      (= :one-time data) SpotRequestType/ONE_TIME
      (= :persistent data) SpotRequestType/PERSISTENT)))


(defn subnet-type
  "The `subnet-type` function data interprets values in the provided config data into a 
`SubnetType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SubnetType` - the value is returned.
* is `:private-with-egress` - `SubnetType/PRIVATE_WITH_EGRESS` is returned
* is `:public` - `SubnetType/PUBLIC` is returned
* is `:private-isolated` - `SubnetType/PRIVATE_ISOLATED` is returned
* is `:private-with-nat` - `SubnetType/PRIVATE_WITH_NAT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SubnetType data) data
      (= :private-with-egress data) SubnetType/PRIVATE_WITH_EGRESS
      (= :public data) SubnetType/PUBLIC
      (= :private-isolated data) SubnetType/PRIVATE_ISOLATED
      (= :private-with-nat data) SubnetType/PRIVATE_WITH_NAT)))


(defn traffic-direction
  "The `traffic-direction` function data interprets values in the provided config data into a 
`TrafficDirection` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TrafficDirection` - the value is returned.
* is `:egress` - `TrafficDirection/EGRESS` is returned
* is `:ingress` - `TrafficDirection/INGRESS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TrafficDirection data) data
      (= :egress data) TrafficDirection/EGRESS
      (= :ingress data) TrafficDirection/INGRESS)))


(defn transport-protocol
  "The `transport-protocol` function data interprets values in the provided config data into a 
`TransportProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TransportProtocol` - the value is returned.
* is `:udp` - `TransportProtocol/UDP` is returned
* is `:tcp` - `TransportProtocol/TCP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TransportProtocol data) data
      (= :udp data) TransportProtocol/UDP
      (= :tcp data) TransportProtocol/TCP)))


(defn vpc-endpoint-type
  "The `vpc-endpoint-type` function data interprets values in the provided config data into a 
`VpcEndpointType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `VpcEndpointType` - the value is returned.
* is `:gateway` - `VpcEndpointType/GATEWAY` is returned
* is `:interface` - `VpcEndpointType/INTERFACE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? VpcEndpointType data) data
      (= :gateway data) VpcEndpointType/GATEWAY
      (= :interface data) VpcEndpointType/INTERFACE)))


(defn vpn-connection-type
  "The `vpn-connection-type` function data interprets values in the provided config data into a 
`VpnConnectionType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `VpnConnectionType` - the value is returned.
* is `:dummy` - `VpnConnectionType/DUMMY` is returned
* is `:ipsec-1` - `VpnConnectionType/IPSEC_1` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? VpnConnectionType data) data
      (= :dummy data) VpnConnectionType/DUMMY
      (= :ipsec-1 data) VpnConnectionType/IPSEC_1)))


(defn vpn-port
  "The `vpn-port` function data interprets values in the provided config data into a 
`VpnPort` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `VpnPort` - the value is returned.
* is `:openvpn` - `VpnPort/OPENVPN` is returned
* is `:https` - `VpnPort/HTTPS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? VpnPort data) data
      (= :openvpn data) VpnPort/OPENVPN
      (= :https data) VpnPort/HTTPS)))


(defn windows-version
  "The `windows-version` function data interprets values in the provided config data into a 
`WindowsVersion` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `WindowsVersion` - the value is returned.
* is `:windows-server-2019-english-full-hyperv` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_HYPERV` is returned
* is `:windows-server-2022-english-full-eks-optimized-1-25` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_25` is returned
* is `:windows-server-2016-czech-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_CZECH_FULL_BASE` is returned
* is `:windows-server-2016-english-full-sql-2016-sp2-web` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_WEB` is returned
* is `:windows-server-2019-chinese-traditional-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_CHINESE_TRADITIONAL_FULL_BASE` is returned
* is `:windows-server-2016-english-full-sql-2017-web` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_WEB` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP3_EXPRESS` is returned
* is `:windows-server-2016-english-full-containers` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_CONTAINERS` is returned
* is `:windows-server-2019-japanese-full-sql-2017-web` - `WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2017_WEB` is returned
* is `:windows-server-2019-japanese-full-sql-2019-standard` - `WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2019_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-german-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_GERMAN_64BIT_BASE` is returned
* is `:windows-server-2016-chinese-simplified-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_CHINESE_SIMPLIFIED_FULL_BASE` is returned
* is `:windows-server-2016-turkish-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_TURKISH_FULL_BASE` is returned
* is `:windows-server-2012-rtm-japanese-64bit-sql-2014-sp2-web` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_WEB` is returned
* is `:windows-server-2016-japanese-full-sql-2017-web` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2017_WEB` is returned
* is `:windows-server-2012-rtm-japanese-64bit-sql-2014-sp2-standard` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_STANDARD` is returned
* is `:windows-server-2016-polish-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_POLISH_FULL_BASE` is returned
* is `:windows-server-2016-japanese-full-sql-2016-sp2-standard` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_STANDARD` is returned
* is `:windows-server-2008-r2-sp1-korean-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_KOREAN_64BIT_BASE` is returned
* is `:windows-server-2019-english-stig-core` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_STIG_CORE` is returned
* is `:windows-server-2012-rtm-english-full-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_FULL_BASE` is returned
* is `:windows-server-2019-english-full-sql-2016-sp2-web` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_WEB` is returned
* is `:windows-server-2022-japanese-full-sql-2019-web` - `WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2019_WEB` is returned
* is `:windows-server-2012-rtm-portuguese-brazil-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_PORTUGUESE_BRAZIL_64BIT_BASE` is returned
* is `:windows-server-2016-japanese-full-sql-2016-sp1-standard` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_STANDARD` is returned
* is `:windows-server-2022-english-full-sql-2019-standard` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2019_STANDARD` is returned
* is `:windows-server-2022-czech-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_CZECH_FULL_BASE` is returned
* is `:windows-server-2022-english-full-sql-2019-express` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2019_EXPRESS` is returned
* is `:windows-server-2008-r2-sp1-portuguese-brazil-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_PORTUGUESE_BRAZIL_64BIT_BASE` is returned
* is `:windows-server-2016-japanese-full-sql-2019-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2019_ENTERPRISE` is returned
* is `:windows-server-2019-english-full-sql-2016-sp2-standard` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-italian-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ITALIAN_64BIT_BASE` is returned
* is `:windows-server-2016-swedish-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_SWEDISH_FULL_BASE` is returned
* is `:windows-server-2016-english-core-sql-2016-sp2-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_ENTERPRISE` is returned
* is `:windows-server-2022-hungarian-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_HUNGARIAN_FULL_BASE` is returned
* is `:windows-server-2016-english-full-sql-2019-standard` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2019_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp2-standard` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_STANDARD` is returned
* is `:windows-server-2016-english-full-sql-2016-sp2-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_ENTERPRISE` is returned
* is `:windows-server-2019-english-core-ecs-optimized` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_ECS_OPTIMIZED` is returned
* is `:windows-server-2008-sp2-english-64bit-sql-2008-sp4-express` - `WindowsVersion/WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_SQL_2008_SP4_EXPRESS` is returned
* is `:windows-server-2003-r2-sp2-english-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_BASE` is returned
* is `:windows-server-2022-japanese-full-sql-2022-standard` - `WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2022_STANDARD` is returned
* is `:windows-server-2008-r2-sp1-english-64bit-sql-2012-sp4-web` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_WEB` is returned
* is `:windows-server-2016-portuguese-portugal-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_PORTUGUESE_PORTUGAL_FULL_BASE` is returned
* is `:windows-server-2008-r2-sp1-japanese-64bit-sql-2008-r2-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_WEB` is returned
* is `:windows-server-2012-rtm-portuguese-portugal-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_PORTUGUESE_PORTUGAL_64BIT_BASE` is returned
* is `:windows-server-2012-rtm-english-64bit-sql-2014-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP3_EXPRESS` is returned
* is `:windows-server-2012-rtm-french-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_FRENCH_64BIT_BASE` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp2-standard` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_STANDARD` is returned
* is `:windows-server-2016-english-core-sql-2016-sp2-standard` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_STANDARD` is returned
* is `:windows-server-2016-english-full-sql-2016-sp1-web` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_WEB` is returned
* is `:windows-server-2012-r2-rtm-french-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_FRENCH_64BIT_BASE` is returned
* is `:windows-server-2019-english-full-sql-2016-sp3-enterprise` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP3_ENTERPRISE` is returned
* is `:windows-server-2012-rtm-english-64bit-sql-2008-r2-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2008_R2_SP3_EXPRESS` is returned
* is `:windows-server-2022-dutch-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_DUTCH_FULL_BASE` is returned
* is `:windows-server-2022-english-full-eks-optimized-1-28` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_28` is returned
* is `:windows-server-2016-japanese-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_BASE` is returned
* is `:windows-server-1809-english-core-base` - `WindowsVersion/WINDOWS_SERVER_1809_ENGLISH_CORE_BASE` is returned
* is `:windows-server-2012-rtm-russian-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_RUSSIAN_64BIT_BASE` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP3_EXPRESS` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2014-sp2-standard` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_STANDARD` is returned
* is `:windows-server-2016-italian-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_ITALIAN_FULL_BASE` is returned
* is `:windows-server-2003-r2-sp2-language-packs-64bit-sql-2005-sp4-standard` - `WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_SQL_2005_SP4_STANDARD` is returned
* is `:windows-server-2012-rtm-english-64bit-sql-2012-sp4-standard` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_STANDARD` is returned
* is `:windows-server-2022-french-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_FRENCH_FULL_BASE` is returned
* is `:windows-server-2016-english-full-sql-2016-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP3_EXPRESS` is returned
* is `:windows-server-2019-portuguese-portugal-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_PORTUGUESE_PORTUGAL_FULL_BASE` is returned
* is `:windows-server-2008-r2-sp1-english-64bit-core` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_CORE` is returned
* is `:windows-server-2012-rtm-italian-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ITALIAN_64BIT_BASE` is returned
* is `:windows-server-2008-sp2-english-32bit-base` - `WindowsVersion/WINDOWS_SERVER_2008_SP2_ENGLISH_32BIT_BASE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP3_WEB` is returned
* is `:windows-server-2012-rtm-japanese-64bit-sql-2008-r2-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2008_R2_SP3_EXPRESS` is returned
* is `:windows-server-2016-japanese-full-sql-2016-sp3-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP3_ENTERPRISE` is returned
* is `:windows-server-2016-english-full-sql-2016-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP3_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp2-web` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_WEB` is returned
* is `:windows-server-2012-r2-rtm-english-p3` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_P3` is returned
* is `:windows-server-2008-r2-sp1-english-64bit-sql-2008-r2-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_EXPRESS` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP3_WEB` is returned
* is `:windows-server-2019-english-core-eks-optimized-1-27` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_27` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp1-enterprise` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_ENTERPRISE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2014-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_STANDARD` is returned
* is `:windows-server-2016-japanese-full-sql-2019-standard` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2019_STANDARD` is returned
* is `:windows-server-2003-r2-sp2-language-packs-64bit-sql-2005-sp4-express` - `WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_SQL_2005_SP4_EXPRESS` is returned
* is `:windows-server-2016-english-core-sql-2016-sp1-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_ENTERPRISE` is returned
* is `:windows-server-2022-english-full-sql-2019-enterprise` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2019_ENTERPRISE` is returned
* is `:windows-server-2016-portuguese-brazil-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_PORTUGUESE_BRAZIL_FULL_BASE` is returned
* is `:windows-server-2019-english-full-sql-2019-express` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2019_EXPRESS` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp1-enterprise` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_ENTERPRISE` is returned
* is `:windows-server-2012-rtm-chinese-traditional-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_CHINESE_TRADITIONAL_64BIT_BASE` is returned
* is `:windows-server-2016-english-full-sql-2016-sp3-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP3_ENTERPRISE` is returned
* is `:windows-server-2012-rtm-czech-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_CZECH_64BIT_BASE` is returned
* is `:windows-server-2022-german-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_GERMAN_FULL_BASE` is returned
* is `:windows-server-1709-english-core-base` - `WindowsVersion/WINDOWS_SERVER_1709_ENGLISH_CORE_BASE` is returned
* is `:windows-server-2012-rtm-chinese-simplified-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_CHINESE_SIMPLIFIED_64BIT_BASE` is returned
* is `:windows-server-2012-rtm-english-64bit-sql-2014-sp2-express` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_EXPRESS` is returned
* is `:windows-server-2016-english-core-sql-2016-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP3_EXPRESS` is returned
* is `:windows-server-2022-turkish-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_TURKISH_FULL_BASE` is returned
* is `:windows-server-2012-rtm-english-64bit-2014-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_2014_SP3_WEB` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp2-web` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_WEB` is returned
* is `:windows-server-2022-english-full-containerslatest` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_CONTAINERSLATEST` is returned
* is `:windows-server-2007-r2-sp1-language-packs-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2007_R2_SP1_LANGUAGE_PACKS_64BIT_BASE` is returned
* is `:windows-server-2012-rtm-english-64bit-sql-2012-sp4-web` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_WEB` is returned
* is `:windows-server-1709-english-core-containerslatest` - `WindowsVersion/WINDOWS_SERVER_1709_ENGLISH_CORE_CONTAINERSLATEST` is returned
* is `:windows-server-2012-rtm-english-64bit-sql-2014-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP3_STANDARD` is returned
* is `:windows-server-2016-english-full-sql-2016-sp1-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_ENTERPRISE` is returned
* is `:windows-server-2022-english-full-eks-optimized-1-24` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_24` is returned
* is `:windows-server-2019-japanese-full-sql-2019-enterprise` - `WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2019_ENTERPRISE` is returned
* is `:windows-server-2008-r2-sp1-english-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_BASE` is returned
* is `:windows-server-2016-japanese-full-sql-2016-sp2-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_ENTERPRISE` is returned
* is `:windows-server-2008-r2-sp1-japanese-64bit-sql-2008-r2-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_STANDARD` is returned
* is `:windows-server-2022-chinese-simplified-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_CHINESE_SIMPLIFIED_FULL_BASE` is returned
* is `:windows-server-2022-english-full-sql-2019-web` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2019_WEB` is returned
* is `:windows-server-2012-r2-rtm-portuguese-portugal-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_PORTUGUESE_PORTUGAL_64BIT_BASE` is returned
* is `:windows-server-2022-english-full-eks-optimized-1-23` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_23` is returned
* is `:windows-server-2012-rtm-english-64bit-sql-2012-sp4-express` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_EXPRESS` is returned
* is `:windows-server-2022-italian-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_ITALIAN_FULL_BASE` is returned
* is `:windows-server-2022-portuguese-portugal-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_PORTUGUESE_PORTUGAL_FULL_BASE` is returned
* is `:windows-server-2008-r2-sp1-japanese-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_BASE` is returned
* is `:windows-server-2016-english-deep-learning` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_DEEP_LEARNING` is returned
* is `:windows-server-2019-english-full-containerslatest` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_CONTAINERSLATEST` is returned
* is `:windows-server-2022-english-core-base` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_BASE` is returned
* is `:windows-server-2022-english-full-sql-2017-standard` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2017_STANDARD` is returned
* is `:windows-server-2012-rtm-english-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_BASE` is returned
* is `:windows-server-2016-japanese-full-sql-2017-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2017_ENTERPRISE` is returned
* is `:windows-server-2019-japanese-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_BASE` is returned
* is `:windows-server-2019-english-core-eks-optimized-1-25` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_25` is returned
* is `:windows-server-2008-r2-sp1-english-64bit-core-sql-2012-sp4-standard` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_CORE_SQL_2012_SP4_STANDARD` is returned
* is `:windows-server-2019-czech-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_CZECH_FULL_BASE` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2014-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP3_STANDARD` is returned
* is `:windows-server-2016-russian-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_RUSSIAN_FULL_BASE` is returned
* is `:windows-server-2019-german-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_GERMAN_FULL_BASE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2014-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_EXPRESS` is returned
* is `:windows-server-2016-english-core-sql-2016-sp3-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP3_ENTERPRISE` is returned
* is `:windows-server-2016-english-tesla` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_TESLA` is returned
* is `:windows-server-2008-r2-sp1-english-61bit-sql-2012-rtm-sp2-enterprise` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_61BIT_SQL_2012_RTM_SP2_ENTERPRISE` is returned
* is `:windows-server-2019-english-full-sql-2022-enterprise` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2022_ENTERPRISE` is returned
* is `:windows-server-2016-english-core-sql-2016-sp1-web` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_WEB` is returned
* is `:windows-server-2022-japanese-full-sql-2022-enterprise` - `WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2022_ENTERPRISE` is returned
* is `:windows-server-2022-english-stig-full` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_STIG_FULL` is returned
* is `:windows-server-2019-english-full-eks-optimized-1-24` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_24` is returned
* is `:windows-server-2022-russian-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_RUSSIAN_FULL_BASE` is returned
* is `:windows-server-1809-english-core-containerslatest` - `WindowsVersion/WINDOWS_SERVER_1809_ENGLISH_CORE_CONTAINERSLATEST` is returned
* is `:windows-server-2019-english-full-sql-2016-sp2-express` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_EXPRESS` is returned
* is `:windows-server-2003-r2-sp2-language-packs-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_BASE` is returned
* is `:windows-server-2012-r2-rtm-russian-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_RUSSIAN_64BIT_BASE` is returned
* is `:windows-server-2022-chinese-traditional-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_CHINESE_TRADITIONAL_FULL_BASE` is returned
* is `:windows-server-2016-japanese-full-fql-2016-sp2-web` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_FQL_2016_SP2_WEB` is returned
* is `:windows-server-2016-english-full-sql-2017-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_ENTERPRISE` is returned
* is `:windows-server-2012-rtm-japanese-64bit-sql-2008-r2-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2008_R2_SP3_STANDARD` is returned
* is `:windows-server-2019-english-full-sql-2016-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP3_STANDARD` is returned
* is `:windows-server-2016-english-core-sql-2016-sp1-standard` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_STANDARD` is returned
* is `:windows-server-2016-english-core-sql-2016-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP3_STANDARD` is returned
* is `:windows-server-2008-sp2-english-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_BASE` is returned
* is `:windows-server-2019-japanese-full-sql-2017-standard` - `WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2017_STANDARD` is returned
* is `:windows-server-2022-korean-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_KOREAN_FULL_BASE` is returned
* is `:windows-server-2003-r2-sp2-english-32bit-base` - `WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_ENGLISH_32BIT_BASE` is returned
* is `:windows-server-2019-english-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_BASE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2014-sp2-enterprise` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_ENTERPRISE` is returned
* is `:windows-server-2008-r2-sp1-japanese-64bit-sql-2012-sp4-express` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2012_SP4_EXPRESS` is returned
* is `:windows-server-2016-english-full-sql-2014-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2014_SP3_STANDARD` is returned
* is `:windows-server-2012-rtm-turkish-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_TURKISH_64BIT_BASE` is returned
* is `:windows-server-2022-portuguese-brazil-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_PORTUGUESE_BRAZIL_FULL_BASE` is returned
* is `:windows-server-2022-japanese-full-sql-2022-web` - `WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2022_WEB` is returned
* is `:windows-server-2022-english-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_BASE` is returned
* is `:windows-server-2022-english-full-sql-2017-enterprise` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2017_ENTERPRISE` is returned
* is `:windows-server-2016-english-full-sql-2016-sp1-standard` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_STANDARD` is returned
* is `:windows-server-2022-english-stig-core` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_STIG_CORE` is returned
* is `:windows-server-2003-r2-sp2-english-64bit-sql-2005-sp4-express` - `WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_SQL_2005_SP4_EXPRESS` is returned
* is `:windows-server-2012-r2-rtm-czech-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_CZECH_64BIT_BASE` is returned
* is `:windows-server-2016-english-core-containers` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_CONTAINERS` is returned
* is `:windows-server-2012-rtm-polish-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_POLISH_64BIT_BASE` is returned
* is `:windows-server-2008-r2-sp1-chinese-prc-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_CHINESE_PRC_64BIT_BASE` is returned
* is `:windows-server-2019-japanese-full-sql-2022-standard` - `WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2022_STANDARD` is returned
* is `:windows-server-2012-rtm-dutch-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_DUTCH_64BIT_BASE` is returned
* is `:windows-server-2016-english-full-sql-2019-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2019_ENTERPRISE` is returned
* is `:windows-server-2019-english-full-sql-2022-standard` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2022_STANDARD` is returned
* is `:windows-server-2019-japanese-full-sql-2022-web` - `WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2022_WEB` is returned
* is `:windows-server-2016-english-full-hyperv` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_HYPERV` is returned
* is `:windows-server-2019-english-full-eks-optimized-1-27` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_27` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2014-sp3-enterprise` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_ENTERPRISE` is returned
* is `:windows-server-2016-spanish-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_SPANISH_FULL_BASE` is returned
* is `:windows-server-2019-chinese-simplified-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_CHINESE_SIMPLIFIED_FULL_BASE` is returned
* is `:windows-server-2022-japanese-full-sql-2017-standard` - `WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2017_STANDARD` is returned
* is `:windows-server-2019-hungarian-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_HUNGARIAN_FULL_BASE` is returned
* is `:windows-server-2012-r2-sp1-portuguese-brazil-64bit-core` - `WindowsVersion/WINDOWS_SERVER_2012_R2_SP1_PORTUGUESE_BRAZIL_64BIT_CORE` is returned
* is `:windows-server-2016-french-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_FRENCH_FULL_BASE` is returned
* is `:windows-server-2012-rtm-japanese-64bit-sql-2014-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_WEB` is returned
* is `:windows-server-2016-korean-full-sql-2016-sp1-standard` - `WindowsVersion/WINDOWS_SERVER_2016_KOREAN_FULL_SQL_2016_SP1_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp1-express` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_EXPRESS` is returned
* is `:windows-server-2019-dutch-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_DUTCH_FULL_BASE` is returned
* is `:windows-server-2016-japanese-full-sql-2016-sp1-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_ENTERPRISE` is returned
* is `:windows-server-2016-hungarian-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_HUNGARIAN_FULL_BASE` is returned
* is `:windows-server-2019-english-core-eks-optimized-1-26` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_26` is returned
* is `:windows-server-2022-english-core-eks-optimized-1-28` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_28` is returned
* is `:windows-server-2016-english-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_BASE` is returned
* is `:windows-server-2012-rtm-japanese-64bit-sql-2012-sp4-express` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2012_SP4_EXPRESS` is returned
* is `:windows-server-2016-english-full-sql-2016-sp2-standard` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_STANDARD` is returned
* is `:windows-server-2019-polish-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_POLISH_FULL_BASE` is returned
* is `:windows-server-2022-japanese-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_BASE` is returned
* is `:windows-server-2022-english-full-sql-2017-express` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2017_EXPRESS` is returned
* is `:windows-server-2008-sp2-english-64bit-sql-2008-sp4-standard` - `WindowsVersion/WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_SQL_2008_SP4_STANDARD` is returned
* is `:windows-server-2019-english-deep-learning` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_DEEP_LEARNING` is returned
* is `:windows-server-2016-english-full-sql-2017-express` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_EXPRESS` is returned
* is `:windows-server-2022-polish-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_POLISH_FULL_BASE` is returned
* is `:windows-server-2019-english-full-sql-2017-standard` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_STANDARD` is returned
* is `:windows-server-2008-r2-sp1-language-packs-64bit-sql-2008-r2-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_LANGUAGE_PACKS_64BIT_SQL_2008_R2_SP3_EXPRESS` is returned
* is `:windows-server-2012-rtm-japanese-64bit-sql-2014-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_EXPRESS` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2014-sp2-web` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_WEB` is returned
* is `:windows-server-1803-english-core-base` - `WindowsVersion/WINDOWS_SERVER_1803_ENGLISH_CORE_BASE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp2-express` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_EXPRESS` is returned
* is `:windows-server-2022-english-full-sql-2022-standard` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2022_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-polish-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_POLISH_64BIT_BASE` is returned
* is `:windows-server-2022-swedish-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_SWEDISH_FULL_BASE` is returned
* is `:windows-server-2016-japanese-full-sql-2016-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP3_STANDARD` is returned
* is `:windows-server-2016-chinese-traditional-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_CHINESE_TRADITIONAL_FULL_BASE` is returned
* is `:windows-server-2022-spanish-full-base` - `WindowsVersion/WINDOWS_SERVER_2022_SPANISH_FULL_BASE` is returned
* is `:windows-server-2022-english-full-sql-2017-web` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2017_WEB` is returned
* is `:windows-server-2019-english-core-eks-optimized-1-28` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_28` is returned
* is `:windows-server-2019-japanese-full-sql-2019-web` - `WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2019_WEB` is returned
* is `:windows-server-2022-english-full-sql-2022-express` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2022_EXPRESS` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP3_STANDARD` is returned
* is `:windows-server-2016-english-core-sql-2016-sp2-express` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_EXPRESS` is returned
* is `:windows-server-2022-english-core-eks-optimized-1-24` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_24` is returned
* is `:windows-server-2012-rtm-english-64bit-sql-2007-r2-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2007_R2_SP3_WEB` is returned
* is `:windows-server-2019-italian-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_ITALIAN_FULL_BASE` is returned
* is `:windows-server-2022-english-core-eks-optimized-1-25` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_25` is returned
* is `:windows-server-2019-english-full-sql-2019-standard` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2019_STANDARD` is returned
* is `:windows-server-2019-english-full-eks-optimized-1-25` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_25` is returned
* is `:windows-server-2022-english-full-eks-optimized-1-26` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_26` is returned
* is `:windows-server-2016-english-full-ecs-optimized` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_ECS_OPTIMIZED` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp2-enterprise` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_ENTERPRISE` is returned
* is `:windows-server-2008-r2-sp1-japanese-64bit-sql-2012-sp4-standard` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2012_SP4_STANDARD` is returned
* is `:windows-server-2022-japanese-full-sql-2019-standard` - `WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2019_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2014-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_WEB` is returned
* is `:windows-server-2016-japanese-full-sql-2017-standard` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2017_STANDARD` is returned
* is `:windows-server-2016-english-full-sql-2014-sp3-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2014_SP3_ENTERPRISE` is returned
* is `:windows-server-2019-russian-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_RUSSIAN_FULL_BASE` is returned
* is `:windows-server-2012-rtm-hungarian-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_HUNGARIAN_64BIT_BASE` is returned
* is `:windows-server-2016-english-full-sql-2019-express` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2019_EXPRESS` is returned
* is `:windows-server-2019-english-core-containerslatest` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_CONTAINERSLATEST` is returned
* is `:windows-server-2008-sp2-portuguese-brazil-32bit-base` - `WindowsVersion/WINDOWS_SERVER_2008_SP2_PORTUGUESE_BRAZIL_32BIT_BASE` is returned
* is `:windows-server-2022-english-core-containerslatest` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_CONTAINERSLATEST` is returned
* is `:windows-server-2019-japanese-full-sql-2022-enterprise` - `WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2022_ENTERPRISE` is returned
* is `:windows-server-2016-japanese-full-sql-2016-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP3_WEB` is returned
* is `:windows-server-2019-english-full-sql-2016-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP3_EXPRESS` is returned
* is `:windows-server-2019-english-full-sql-2022-web` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2022_WEB` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp1-web` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_WEB` is returned
* is `:windows-server-2022-english-full-sql-2022-enterprise` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2022_ENTERPRISE` is returned
* is `:windows-server-2019-english-full-ecs-optimized` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_ECS_OPTIMIZED` is returned
* is `:windows-server-2019-portuguese-brazil-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_PORTUGUESE_BRAZIL_FULL_BASE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp2-enterprise` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_ENTERPRISE` is returned
* is `:windows-server-2019-turkish-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_TURKISH_FULL_BASE` is returned
* is `:windows-server-2012-r2-rtm-english-deep-learning` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_DEEP_LEARNING` is returned
* is `:windows-server-2016-english-full-sql-2017-standard` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_STANDARD` is returned
* is `:windows-server-2019-english-full-eks-optimized-1-28` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_28` is returned
* is `:windows-server-2012-r2-rtm-chinese-traditional-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_CHINESE_TRADITIONAL_64BIT_BASE` is returned
* is `:windows-server-2022-english-full-eks-optimized-1-27` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_27` is returned
* is `:windows-server-2022-english-core-eks-optimized-1-27` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_27` is returned
* is `:windows-server-2019-english-full-eks-optimized-1-23` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_23` is returned
* is `:windows-server-2012-r2-rtm-swedish-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_SWEDISH_64BIT_BASE` is returned
* is `:windows-server-2012-rtm-chinese-traditional-hong-kong-sar-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_CHINESE_TRADITIONAL_HONG_KONG_SAR_64BIT_BASE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2014-sp2-express` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_EXPRESS` is returned
* is `:windows-server-2019-english-full-sql-2016-sp2-enterprise` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_ENTERPRISE` is returned
* is `:windows-server-2016-japanese-full-sql-2019-web` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2019_WEB` is returned
* is `:windows-server-2019-english-core-base` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_BASE` is returned
* is `:windows-server-2019-swedish-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_SWEDISH_FULL_BASE` is returned
* is `:windows-server-2016-dutch-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_DUTCH_FULL_BASE` is returned
* is `:windows-server-2012-r2-rtm-portuguese-brazil-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_PORTUGUESE_BRAZIL_64BIT_BASE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-hyperv` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_HYPERV` is returned
* is `:windows-server-2008-r2-sp1-language-packs-64bit-sql-2008-r2-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_LANGUAGE_PACKS_64BIT_SQL_2008_R2_SP3_STANDARD` is returned
* is `:windows-server-2016-english-core-sql-2016-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP3_WEB` is returned
* is `:windows-server-2016-english-64bit-sql-2012-sp4-enterprise` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2014-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP3_EXPRESS` is returned
* is `:windows-server-2012-r2-rtm-turkish-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_TURKISH_64BIT_BASE` is returned
* is `:windows-server-2016-english-core-base` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_BASE` is returned
* is `:windows-server-2019-english-core-eks-optimized-1-22` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_22` is returned
* is `:windows-server-2012-r2-rtm-english-full-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_FULL_BASE` is returned
* is `:windows-server-2012-rtm-english-64bit-sql-2008-r2-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2008_R2_SP3_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2014-sp2-express` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP2_EXPRESS` is returned
* is `:windows-server-2019-english-full-sql-2019-web` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2019_WEB` is returned
* is `:windows-server-2022-japanese-full-sql-2019-enterprise` - `WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2019_ENTERPRISE` is returned
* is `:windows-server-2019-english-stig-full` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_STIG_FULL` is returned
* is `:windows-server-2012-sp2-portuguese-brazil-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_SP2_PORTUGUESE_BRAZIL_64BIT_BASE` is returned
* is `:windows-server-2012-rtm-japanese-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_BASE` is returned
* is `:windows-server-2012-rtm-japanese-64bit-sql-2016-sp2-express` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2016_SP2_EXPRESS` is returned
* is `:windows-server-2012-r2-rtm-korean-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_KOREAN_64BIT_BASE` is returned
* is `:windows-server-2016-korean-full-sql-2016-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2016_KOREAN_FULL_SQL_2016_SP3_STANDARD` is returned
* is `:windows-server-2019-english-core-eks-optimized-1-24` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_24` is returned
* is `:windows-server-2008-r2-sp1-english-64bit-sharepoint-2010-sp2-foundation` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SHAREPOINT_2010_SP2_FOUNDATION` is returned
* is `:windows-server-1803-english-core-containerslatest` - `WindowsVersion/WINDOWS_SERVER_1803_ENGLISH_CORE_CONTAINERSLATEST` is returned
* is `:windows-server-2022-english-full-ecs-optimized` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_ECS_OPTIMIZED` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2012-sp4-enterprise` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE` is returned
* is `:windows-server-2016-english-full-sql-2016-sp2-express` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_EXPRESS` is returned
* is `:windows-server-2019-spanish-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_SPANISH_FULL_BASE` is returned
* is `:windows-server-2012-r2-english-stig-full` - `WindowsVersion/WINDOWS_SERVER_2012_R2_ENGLISH_STIG_FULL` is returned
* is `:windows-server-2012-r2-rtm-dutch-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_DUTCH_64BIT_BASE` is returned
* is `:windows-server-2012-r2-rtm-hungarian-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_HUNGARIAN_64BIT_BASE` is returned
* is `:windows-server-2022-japanese-full-sql-2017-web` - `WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2017_WEB` is returned
* is `:windows-server-2016-english-full-sql-2016-sp1-express` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_EXPRESS` is returned
* is `:windows-server-2016-english-core-sql-2016-sp1-express` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_EXPRESS` is returned
* is `:windows-server-2016-japanese-full-sql-2016-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP3_EXPRESS` is returned
* is `:windows-server-2016-english-full-sql-2019-web` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2019_WEB` is returned
* is `:windows-server-2019-english-core-eks-optimized-1-23` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_23` is returned
* is `:windows-server-2019-english-full-sql-2016-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP3_WEB` is returned
* is `:windows-server-2016-english-stig-core` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_STIG_CORE` is returned
* is `:windows-server-2008-r2-sp1-english-64bit-sql-2008-r2-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_WEB` is returned
* is `:windows-server-2016-korean-full-sql-2016-sp2-standard` - `WindowsVersion/WINDOWS_SERVER_2016_KOREAN_FULL_SQL_2016_SP2_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_BASE` is returned
* is `:windows-server-2016-japanese-full-sql-2016-sp1-web` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_WEB` is returned
* is `:windows-server-2019-english-full-sql-2022-express` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2022_EXPRESS` is returned
* is `:windows-server-2003-r2-sp2-english-64bit-sql-2005-sp4-standard` - `WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_SQL_2005_SP4_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp1-express` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_EXPRESS` is returned
* is `:windows-server-2012-rtm-japanese-64bit-sql-2014-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_STANDARD` is returned
* is `:windows-server-2016-english-core-sql-2016-sp2-web` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_WEB` is returned
* is `:windows-server-2012-rtm-japanese-64bit-sql-2012-sp4-web` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2012_SP4_WEB` is returned
* is `:windows-server-2022-english-core-eks-optimized-1-26` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_26` is returned
* is `:windows-server-2012-r2-rtm-chinese-traditional-hong-kong-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_CHINESE_TRADITIONAL_HONG_KONG_64BIT_BASE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_BASE` is returned
* is `:windows-server-2012-rtm-spanish-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_SPANISH_64BIT_BASE` is returned
* is `:windows-server-2003-r2-sp2-language-packs-32bit-base` - `WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_32BIT_BASE` is returned
* is `:windows-server-2019-english-full-sql-2017-web` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_WEB` is returned
* is `:windows-server-2022-english-full-sql-2022-web` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2022_WEB` is returned
* is `:windows-server-2012-rtm-german-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_GERMAN_64BIT_BASE` is returned
* is `:windows-server-2008-r2-sp1-english-64bit-sql-2008-r2-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_STANDARD` is returned
* is `:windows-server-2016-english-stig-full` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_STIG_FULL` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp1-standard` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-chinese-simplified-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_CHINESE_SIMPLIFIED_64BIT_BASE` is returned
* is `:windows-server-2019-french-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_FRENCH_FULL_BASE` is returned
* is `:windows-server-2012-r2-rtm-spanish-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_SPANISH_64BIT_BASE` is returned
* is `:windows-server-2012-r2-english-stig-core` - `WindowsVersion/WINDOWS_SERVER_2012_R2_ENGLISH_STIG_CORE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp3-enterprise` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP3_ENTERPRISE` is returned
* is `:windows-server-2008-r2-sp1-english-64bit-sql-2012-sp4-express` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_EXPRESS` is returned
* is `:windows-server-2019-english-full-eks-optimized-1-22` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_22` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-core` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_CORE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp1-web` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_WEB` is returned
* is `:windows-server-2008-r2-sp1-english-64bit-sql-2012-sp4-standard` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_STANDARD` is returned
* is `:windows-server-2016-english-full-sql-2016-sp3-web` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP3_WEB` is returned
* is `:windows-server-2008-r2-sp1-english-64bit-sql-2012-sp4-enterprise` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE` is returned
* is `:windows-server-2019-english-full-sql-2019-enterprise` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2019_ENTERPRISE` is returned
* is `:windows-server-2008-r2-sp1-japanese-64bit-sql-2008-r2-sp3-express` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_EXPRESS` is returned
* is `:windows-server-2022-english-core-eks-optimized-1-23` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_23` is returned
* is `:windows-server-2012-rtm-english-64bit-sql-2014-sp2-web` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_WEB` is returned
* is `:windows-server-2016-japanese-full-sql-2016-sp2-express` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_EXPRESS` is returned
* is `:windows-server-2016-english-p3` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_P3` is returned
* is `:windows-server-2012-rtm-swedish-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_SWEDISH_64BIT_BASE` is returned
* is `:windows-server-2019-japanese-full-sql-2017-enterprise` - `WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2017_ENTERPRISE` is returned
* is `:windows-server-2022-japanese-full-sql-2017-enterprise` - `WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2017_ENTERPRISE` is returned
* is `:windows-server-2016-english-core-containerslatest` - `WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_CONTAINERSLATEST` is returned
* is `:windows-server-2012-rtm-english-64bit-sql-2014-sp2-standard` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_STANDARD` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp3-enterprise` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP3_ENTERPRISE` is returned
* is `:windows-server-2008-r2-sp1-chinese-hong-kong-sar-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_CHINESE_HONG_KONG_SAR_64BIT_BASE` is returned
* is `:windows-server-2019-korean-full-base` - `WindowsVersion/WINDOWS_SERVER_2019_KOREAN_FULL_BASE` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp3-standard` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP3_STANDARD` is returned
* is `:windows-server-2019-english-full-sql-2017-express` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_EXPRESS` is returned
* is `:windows-server-2019-english-tesla` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_TESLA` is returned
* is `:windows-server-2019-english-full-sql-2017-enterprise` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_ENTERPRISE` is returned
* is `:windows-server-2016-german-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_GERMAN_FULL_BASE` is returned
* is `:windows-server-2012-rtm-korean-64bit-base` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_KOREAN_64BIT_BASE` is returned
* is `:windows-server-2012-r2-rtm-english-64bit-sql-2016-sp1-standard` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_STANDARD` is returned
* is `:windows-server-2019-english-full-eks-optimized-1-26` - `WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_26` is returned
* is `:windows-server-2016-japanese-full-sql-2016-sp1-express` - `WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_EXPRESS` is returned
* is `:windows-server-2022-english-core-ecs-optimized` - `WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_ECS_OPTIMIZED` is returned
* is `:windows-server-2012-rtm-japanese-64bit-2012-sp4-standard` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_2012_SP4_STANDARD` is returned
* is `:windows-server-2016-korean-full-base` - `WindowsVersion/WINDOWS_SERVER_2016_KOREAN_FULL_BASE` is returned
* is `:windows-server-2012-r2-rtm-japanese-64bit-sql-2014-sp2-standard` - `WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP2_STANDARD` is returned
* is `:windows-server-2012-rtm-japanese-64bit-sql-2014-sp2-express` - `WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_EXPRESS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? WindowsVersion data) data
      (= :windows-server-2019-english-full-hyperv data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_HYPERV
      (= :windows-server-2022-english-full-eks-optimized-1-25 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_25
      (= :windows-server-2016-czech-full-base data) WindowsVersion/WINDOWS_SERVER_2016_CZECH_FULL_BASE
      (= :windows-server-2016-english-full-sql-2016-sp2-web data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_WEB
      (= :windows-server-2019-chinese-traditional-full-base data) WindowsVersion/WINDOWS_SERVER_2019_CHINESE_TRADITIONAL_FULL_BASE
      (= :windows-server-2016-english-full-sql-2017-web data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_WEB
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp3-express data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP3_EXPRESS
      (= :windows-server-2016-english-full-containers data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_CONTAINERS
      (= :windows-server-2019-japanese-full-sql-2017-web data) WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2017_WEB
      (= :windows-server-2019-japanese-full-sql-2019-standard data) WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2019_STANDARD
      (= :windows-server-2012-r2-rtm-german-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_GERMAN_64BIT_BASE
      (= :windows-server-2016-chinese-simplified-full-base data) WindowsVersion/WINDOWS_SERVER_2016_CHINESE_SIMPLIFIED_FULL_BASE
      (= :windows-server-2016-turkish-full-base data) WindowsVersion/WINDOWS_SERVER_2016_TURKISH_FULL_BASE
      (= :windows-server-2012-rtm-japanese-64bit-sql-2014-sp2-web data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_WEB
      (= :windows-server-2016-japanese-full-sql-2017-web data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2017_WEB
      (= :windows-server-2012-rtm-japanese-64bit-sql-2014-sp2-standard data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_STANDARD
      (= :windows-server-2016-polish-full-base data) WindowsVersion/WINDOWS_SERVER_2016_POLISH_FULL_BASE
      (= :windows-server-2016-japanese-full-sql-2016-sp2-standard data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_STANDARD
      (= :windows-server-2008-r2-sp1-korean-64bit-base data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_KOREAN_64BIT_BASE
      (= :windows-server-2019-english-stig-core data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_STIG_CORE
      (= :windows-server-2012-rtm-english-full-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_FULL_BASE
      (= :windows-server-2019-english-full-sql-2016-sp2-web data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_WEB
      (= :windows-server-2022-japanese-full-sql-2019-web data) WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2019_WEB
      (= :windows-server-2012-rtm-portuguese-brazil-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_PORTUGUESE_BRAZIL_64BIT_BASE
      (= :windows-server-2016-japanese-full-sql-2016-sp1-standard data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_STANDARD
      (= :windows-server-2022-english-full-sql-2019-standard data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2019_STANDARD
      (= :windows-server-2022-czech-full-base data) WindowsVersion/WINDOWS_SERVER_2022_CZECH_FULL_BASE
      (= :windows-server-2022-english-full-sql-2019-express data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2019_EXPRESS
      (= :windows-server-2008-r2-sp1-portuguese-brazil-64bit-base data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_PORTUGUESE_BRAZIL_64BIT_BASE
      (= :windows-server-2016-japanese-full-sql-2019-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2019_ENTERPRISE
      (= :windows-server-2019-english-full-sql-2016-sp2-standard data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_STANDARD
      (= :windows-server-2012-r2-rtm-italian-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ITALIAN_64BIT_BASE
      (= :windows-server-2016-swedish-full-base data) WindowsVersion/WINDOWS_SERVER_2016_SWEDISH_FULL_BASE
      (= :windows-server-2016-english-core-sql-2016-sp2-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_ENTERPRISE
      (= :windows-server-2022-hungarian-full-base data) WindowsVersion/WINDOWS_SERVER_2022_HUNGARIAN_FULL_BASE
      (= :windows-server-2016-english-full-sql-2019-standard data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2019_STANDARD
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp2-standard data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_STANDARD
      (= :windows-server-2016-english-full-sql-2016-sp2-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_ENTERPRISE
      (= :windows-server-2019-english-core-ecs-optimized data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_ECS_OPTIMIZED
      (= :windows-server-2008-sp2-english-64bit-sql-2008-sp4-express data) WindowsVersion/WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_SQL_2008_SP4_EXPRESS
      (= :windows-server-2003-r2-sp2-english-64bit-base data) WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_BASE
      (= :windows-server-2022-japanese-full-sql-2022-standard data) WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2022_STANDARD
      (= :windows-server-2008-r2-sp1-english-64bit-sql-2012-sp4-web data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_WEB
      (= :windows-server-2016-portuguese-portugal-full-base data) WindowsVersion/WINDOWS_SERVER_2016_PORTUGUESE_PORTUGAL_FULL_BASE
      (= :windows-server-2008-r2-sp1-japanese-64bit-sql-2008-r2-sp3-web data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_WEB
      (= :windows-server-2012-rtm-portuguese-portugal-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_PORTUGUESE_PORTUGAL_64BIT_BASE
      (= :windows-server-2012-rtm-english-64bit-sql-2014-sp3-express data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP3_EXPRESS
      (= :windows-server-2012-rtm-french-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_FRENCH_64BIT_BASE
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp2-standard data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_STANDARD
      (= :windows-server-2016-english-core-sql-2016-sp2-standard data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_STANDARD
      (= :windows-server-2016-english-full-sql-2016-sp1-web data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_WEB
      (= :windows-server-2012-r2-rtm-french-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_FRENCH_64BIT_BASE
      (= :windows-server-2019-english-full-sql-2016-sp3-enterprise data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP3_ENTERPRISE
      (= :windows-server-2012-rtm-english-64bit-sql-2008-r2-sp3-express data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2008_R2_SP3_EXPRESS
      (= :windows-server-2022-dutch-full-base data) WindowsVersion/WINDOWS_SERVER_2022_DUTCH_FULL_BASE
      (= :windows-server-2022-english-full-eks-optimized-1-28 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_28
      (= :windows-server-2016-japanese-full-base data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_BASE
      (= :windows-server-1809-english-core-base data) WindowsVersion/WINDOWS_SERVER_1809_ENGLISH_CORE_BASE
      (= :windows-server-2012-rtm-russian-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_RUSSIAN_64BIT_BASE
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp3-express data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP3_EXPRESS
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2014-sp2-standard data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_STANDARD
      (= :windows-server-2016-italian-full-base data) WindowsVersion/WINDOWS_SERVER_2016_ITALIAN_FULL_BASE
      (= :windows-server-2003-r2-sp2-language-packs-64bit-sql-2005-sp4-standard data) WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_SQL_2005_SP4_STANDARD
      (= :windows-server-2012-rtm-english-64bit-sql-2012-sp4-standard data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_STANDARD
      (= :windows-server-2022-french-full-base data) WindowsVersion/WINDOWS_SERVER_2022_FRENCH_FULL_BASE
      (= :windows-server-2016-english-full-sql-2016-sp3-express data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP3_EXPRESS
      (= :windows-server-2019-portuguese-portugal-full-base data) WindowsVersion/WINDOWS_SERVER_2019_PORTUGUESE_PORTUGAL_FULL_BASE
      (= :windows-server-2008-r2-sp1-english-64bit-core data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_CORE
      (= :windows-server-2012-rtm-italian-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ITALIAN_64BIT_BASE
      (= :windows-server-2008-sp2-english-32bit-base data) WindowsVersion/WINDOWS_SERVER_2008_SP2_ENGLISH_32BIT_BASE
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp3-web data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP3_WEB
      (= :windows-server-2012-rtm-japanese-64bit-sql-2008-r2-sp3-express data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2008_R2_SP3_EXPRESS
      (= :windows-server-2016-japanese-full-sql-2016-sp3-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP3_ENTERPRISE
      (= :windows-server-2016-english-full-sql-2016-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP3_STANDARD
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp2-web data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_WEB
      (= :windows-server-2012-r2-rtm-english-p3 data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_P3
      (= :windows-server-2008-r2-sp1-english-64bit-sql-2008-r2-sp3-express data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_EXPRESS
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp3-web data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP3_WEB
      (= :windows-server-2019-english-core-eks-optimized-1-27 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_27
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp1-enterprise data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_ENTERPRISE
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2014-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_STANDARD
      (= :windows-server-2016-japanese-full-sql-2019-standard data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2019_STANDARD
      (= :windows-server-2003-r2-sp2-language-packs-64bit-sql-2005-sp4-express data) WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_SQL_2005_SP4_EXPRESS
      (= :windows-server-2016-english-core-sql-2016-sp1-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_ENTERPRISE
      (= :windows-server-2022-english-full-sql-2019-enterprise data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2019_ENTERPRISE
      (= :windows-server-2016-portuguese-brazil-full-base data) WindowsVersion/WINDOWS_SERVER_2016_PORTUGUESE_BRAZIL_FULL_BASE
      (= :windows-server-2019-english-full-sql-2019-express data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2019_EXPRESS
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp1-enterprise data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_ENTERPRISE
      (= :windows-server-2012-rtm-chinese-traditional-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_CHINESE_TRADITIONAL_64BIT_BASE
      (= :windows-server-2016-english-full-sql-2016-sp3-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP3_ENTERPRISE
      (= :windows-server-2012-rtm-czech-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_CZECH_64BIT_BASE
      (= :windows-server-2022-german-full-base data) WindowsVersion/WINDOWS_SERVER_2022_GERMAN_FULL_BASE
      (= :windows-server-1709-english-core-base data) WindowsVersion/WINDOWS_SERVER_1709_ENGLISH_CORE_BASE
      (= :windows-server-2012-rtm-chinese-simplified-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_CHINESE_SIMPLIFIED_64BIT_BASE
      (= :windows-server-2012-rtm-english-64bit-sql-2014-sp2-express data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_EXPRESS
      (= :windows-server-2016-english-core-sql-2016-sp3-express data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP3_EXPRESS
      (= :windows-server-2022-turkish-full-base data) WindowsVersion/WINDOWS_SERVER_2022_TURKISH_FULL_BASE
      (= :windows-server-2012-rtm-english-64bit-2014-sp3-web data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_2014_SP3_WEB
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp2-web data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_WEB
      (= :windows-server-2022-english-full-containerslatest data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_CONTAINERSLATEST
      (= :windows-server-2007-r2-sp1-language-packs-64bit-base data) WindowsVersion/WINDOWS_SERVER_2007_R2_SP1_LANGUAGE_PACKS_64BIT_BASE
      (= :windows-server-2012-rtm-english-64bit-sql-2012-sp4-web data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_WEB
      (= :windows-server-1709-english-core-containerslatest data) WindowsVersion/WINDOWS_SERVER_1709_ENGLISH_CORE_CONTAINERSLATEST
      (= :windows-server-2012-rtm-english-64bit-sql-2014-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP3_STANDARD
      (= :windows-server-2016-english-full-sql-2016-sp1-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_ENTERPRISE
      (= :windows-server-2022-english-full-eks-optimized-1-24 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_24
      (= :windows-server-2019-japanese-full-sql-2019-enterprise data) WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2019_ENTERPRISE
      (= :windows-server-2008-r2-sp1-english-64bit-base data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_BASE
      (= :windows-server-2016-japanese-full-sql-2016-sp2-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_ENTERPRISE
      (= :windows-server-2008-r2-sp1-japanese-64bit-sql-2008-r2-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_STANDARD
      (= :windows-server-2022-chinese-simplified-full-base data) WindowsVersion/WINDOWS_SERVER_2022_CHINESE_SIMPLIFIED_FULL_BASE
      (= :windows-server-2022-english-full-sql-2019-web data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2019_WEB
      (= :windows-server-2012-r2-rtm-portuguese-portugal-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_PORTUGUESE_PORTUGAL_64BIT_BASE
      (= :windows-server-2022-english-full-eks-optimized-1-23 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_23
      (= :windows-server-2012-rtm-english-64bit-sql-2012-sp4-express data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2012_SP4_EXPRESS
      (= :windows-server-2022-italian-full-base data) WindowsVersion/WINDOWS_SERVER_2022_ITALIAN_FULL_BASE
      (= :windows-server-2022-portuguese-portugal-full-base data) WindowsVersion/WINDOWS_SERVER_2022_PORTUGUESE_PORTUGAL_FULL_BASE
      (= :windows-server-2008-r2-sp1-japanese-64bit-base data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_BASE
      (= :windows-server-2016-english-deep-learning data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_DEEP_LEARNING
      (= :windows-server-2019-english-full-containerslatest data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_CONTAINERSLATEST
      (= :windows-server-2022-english-core-base data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_BASE
      (= :windows-server-2022-english-full-sql-2017-standard data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2017_STANDARD
      (= :windows-server-2012-rtm-english-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_BASE
      (= :windows-server-2016-japanese-full-sql-2017-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2017_ENTERPRISE
      (= :windows-server-2019-japanese-full-base data) WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_BASE
      (= :windows-server-2019-english-core-eks-optimized-1-25 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_25
      (= :windows-server-2008-r2-sp1-english-64bit-core-sql-2012-sp4-standard data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_CORE_SQL_2012_SP4_STANDARD
      (= :windows-server-2019-czech-full-base data) WindowsVersion/WINDOWS_SERVER_2019_CZECH_FULL_BASE
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2014-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP3_STANDARD
      (= :windows-server-2016-russian-full-base data) WindowsVersion/WINDOWS_SERVER_2016_RUSSIAN_FULL_BASE
      (= :windows-server-2019-german-full-base data) WindowsVersion/WINDOWS_SERVER_2019_GERMAN_FULL_BASE
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2014-sp3-express data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_EXPRESS
      (= :windows-server-2016-english-core-sql-2016-sp3-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP3_ENTERPRISE
      (= :windows-server-2016-english-tesla data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_TESLA
      (= :windows-server-2008-r2-sp1-english-61bit-sql-2012-rtm-sp2-enterprise data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_61BIT_SQL_2012_RTM_SP2_ENTERPRISE
      (= :windows-server-2019-english-full-sql-2022-enterprise data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2022_ENTERPRISE
      (= :windows-server-2016-english-core-sql-2016-sp1-web data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_WEB
      (= :windows-server-2022-japanese-full-sql-2022-enterprise data) WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2022_ENTERPRISE
      (= :windows-server-2022-english-stig-full data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_STIG_FULL
      (= :windows-server-2019-english-full-eks-optimized-1-24 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_24
      (= :windows-server-2022-russian-full-base data) WindowsVersion/WINDOWS_SERVER_2022_RUSSIAN_FULL_BASE
      (= :windows-server-1809-english-core-containerslatest data) WindowsVersion/WINDOWS_SERVER_1809_ENGLISH_CORE_CONTAINERSLATEST
      (= :windows-server-2019-english-full-sql-2016-sp2-express data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_EXPRESS
      (= :windows-server-2003-r2-sp2-language-packs-64bit-base data) WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_64BIT_BASE
      (= :windows-server-2012-r2-rtm-russian-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_RUSSIAN_64BIT_BASE
      (= :windows-server-2022-chinese-traditional-full-base data) WindowsVersion/WINDOWS_SERVER_2022_CHINESE_TRADITIONAL_FULL_BASE
      (= :windows-server-2016-japanese-full-fql-2016-sp2-web data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_FQL_2016_SP2_WEB
      (= :windows-server-2016-english-full-sql-2017-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_ENTERPRISE
      (= :windows-server-2012-rtm-japanese-64bit-sql-2008-r2-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2008_R2_SP3_STANDARD
      (= :windows-server-2019-english-full-sql-2016-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP3_STANDARD
      (= :windows-server-2016-english-core-sql-2016-sp1-standard data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_STANDARD
      (= :windows-server-2016-english-core-sql-2016-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP3_STANDARD
      (= :windows-server-2008-sp2-english-64bit-base data) WindowsVersion/WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_BASE
      (= :windows-server-2019-japanese-full-sql-2017-standard data) WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2017_STANDARD
      (= :windows-server-2022-korean-full-base data) WindowsVersion/WINDOWS_SERVER_2022_KOREAN_FULL_BASE
      (= :windows-server-2003-r2-sp2-english-32bit-base data) WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_ENGLISH_32BIT_BASE
      (= :windows-server-2019-english-full-base data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_BASE
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2014-sp2-enterprise data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_ENTERPRISE
      (= :windows-server-2008-r2-sp1-japanese-64bit-sql-2012-sp4-express data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2012_SP4_EXPRESS
      (= :windows-server-2016-english-full-sql-2014-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2014_SP3_STANDARD
      (= :windows-server-2012-rtm-turkish-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_TURKISH_64BIT_BASE
      (= :windows-server-2022-portuguese-brazil-full-base data) WindowsVersion/WINDOWS_SERVER_2022_PORTUGUESE_BRAZIL_FULL_BASE
      (= :windows-server-2022-japanese-full-sql-2022-web data) WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2022_WEB
      (= :windows-server-2022-english-full-base data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_BASE
      (= :windows-server-2022-english-full-sql-2017-enterprise data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2017_ENTERPRISE
      (= :windows-server-2016-english-full-sql-2016-sp1-standard data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_STANDARD
      (= :windows-server-2022-english-stig-core data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_STIG_CORE
      (= :windows-server-2003-r2-sp2-english-64bit-sql-2005-sp4-express data) WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_SQL_2005_SP4_EXPRESS
      (= :windows-server-2012-r2-rtm-czech-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_CZECH_64BIT_BASE
      (= :windows-server-2016-english-core-containers data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_CONTAINERS
      (= :windows-server-2012-rtm-polish-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_POLISH_64BIT_BASE
      (= :windows-server-2008-r2-sp1-chinese-prc-64bit-base data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_CHINESE_PRC_64BIT_BASE
      (= :windows-server-2019-japanese-full-sql-2022-standard data) WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2022_STANDARD
      (= :windows-server-2012-rtm-dutch-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_DUTCH_64BIT_BASE
      (= :windows-server-2016-english-full-sql-2019-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2019_ENTERPRISE
      (= :windows-server-2019-english-full-sql-2022-standard data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2022_STANDARD
      (= :windows-server-2019-japanese-full-sql-2022-web data) WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2022_WEB
      (= :windows-server-2016-english-full-hyperv data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_HYPERV
      (= :windows-server-2019-english-full-eks-optimized-1-27 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_27
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2014-sp3-enterprise data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_ENTERPRISE
      (= :windows-server-2016-spanish-full-base data) WindowsVersion/WINDOWS_SERVER_2016_SPANISH_FULL_BASE
      (= :windows-server-2019-chinese-simplified-full-base data) WindowsVersion/WINDOWS_SERVER_2019_CHINESE_SIMPLIFIED_FULL_BASE
      (= :windows-server-2022-japanese-full-sql-2017-standard data) WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2017_STANDARD
      (= :windows-server-2019-hungarian-full-base data) WindowsVersion/WINDOWS_SERVER_2019_HUNGARIAN_FULL_BASE
      (= :windows-server-2012-r2-sp1-portuguese-brazil-64bit-core data) WindowsVersion/WINDOWS_SERVER_2012_R2_SP1_PORTUGUESE_BRAZIL_64BIT_CORE
      (= :windows-server-2016-french-full-base data) WindowsVersion/WINDOWS_SERVER_2016_FRENCH_FULL_BASE
      (= :windows-server-2012-rtm-japanese-64bit-sql-2014-sp3-web data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_WEB
      (= :windows-server-2016-korean-full-sql-2016-sp1-standard data) WindowsVersion/WINDOWS_SERVER_2016_KOREAN_FULL_SQL_2016_SP1_STANDARD
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp1-express data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_EXPRESS
      (= :windows-server-2019-dutch-full-base data) WindowsVersion/WINDOWS_SERVER_2019_DUTCH_FULL_BASE
      (= :windows-server-2016-japanese-full-sql-2016-sp1-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_ENTERPRISE
      (= :windows-server-2016-hungarian-full-base data) WindowsVersion/WINDOWS_SERVER_2016_HUNGARIAN_FULL_BASE
      (= :windows-server-2019-english-core-eks-optimized-1-26 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_26
      (= :windows-server-2022-english-core-eks-optimized-1-28 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_28
      (= :windows-server-2016-english-full-base data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_BASE
      (= :windows-server-2012-rtm-japanese-64bit-sql-2012-sp4-express data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2012_SP4_EXPRESS
      (= :windows-server-2016-english-full-sql-2016-sp2-standard data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_STANDARD
      (= :windows-server-2019-polish-full-base data) WindowsVersion/WINDOWS_SERVER_2019_POLISH_FULL_BASE
      (= :windows-server-2022-japanese-full-base data) WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_BASE
      (= :windows-server-2022-english-full-sql-2017-express data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2017_EXPRESS
      (= :windows-server-2008-sp2-english-64bit-sql-2008-sp4-standard data) WindowsVersion/WINDOWS_SERVER_2008_SP2_ENGLISH_64BIT_SQL_2008_SP4_STANDARD
      (= :windows-server-2019-english-deep-learning data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_DEEP_LEARNING
      (= :windows-server-2016-english-full-sql-2017-express data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_EXPRESS
      (= :windows-server-2022-polish-full-base data) WindowsVersion/WINDOWS_SERVER_2022_POLISH_FULL_BASE
      (= :windows-server-2019-english-full-sql-2017-standard data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_STANDARD
      (= :windows-server-2008-r2-sp1-language-packs-64bit-sql-2008-r2-sp3-express data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_LANGUAGE_PACKS_64BIT_SQL_2008_R2_SP3_EXPRESS
      (= :windows-server-2012-rtm-japanese-64bit-sql-2014-sp3-express data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_EXPRESS
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2014-sp2-web data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_WEB
      (= :windows-server-1803-english-core-base data) WindowsVersion/WINDOWS_SERVER_1803_ENGLISH_CORE_BASE
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp2-express data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_EXPRESS
      (= :windows-server-2022-english-full-sql-2022-standard data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2022_STANDARD
      (= :windows-server-2012-r2-rtm-polish-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_POLISH_64BIT_BASE
      (= :windows-server-2022-swedish-full-base data) WindowsVersion/WINDOWS_SERVER_2022_SWEDISH_FULL_BASE
      (= :windows-server-2016-japanese-full-sql-2016-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP3_STANDARD
      (= :windows-server-2016-chinese-traditional-full-base data) WindowsVersion/WINDOWS_SERVER_2016_CHINESE_TRADITIONAL_FULL_BASE
      (= :windows-server-2022-spanish-full-base data) WindowsVersion/WINDOWS_SERVER_2022_SPANISH_FULL_BASE
      (= :windows-server-2022-english-full-sql-2017-web data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2017_WEB
      (= :windows-server-2019-english-core-eks-optimized-1-28 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_28
      (= :windows-server-2019-japanese-full-sql-2019-web data) WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2019_WEB
      (= :windows-server-2022-english-full-sql-2022-express data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2022_EXPRESS
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP3_STANDARD
      (= :windows-server-2016-english-core-sql-2016-sp2-express data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_EXPRESS
      (= :windows-server-2022-english-core-eks-optimized-1-24 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_24
      (= :windows-server-2012-rtm-english-64bit-sql-2007-r2-sp3-web data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2007_R2_SP3_WEB
      (= :windows-server-2019-italian-full-base data) WindowsVersion/WINDOWS_SERVER_2019_ITALIAN_FULL_BASE
      (= :windows-server-2022-english-core-eks-optimized-1-25 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_25
      (= :windows-server-2019-english-full-sql-2019-standard data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2019_STANDARD
      (= :windows-server-2019-english-full-eks-optimized-1-25 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_25
      (= :windows-server-2022-english-full-eks-optimized-1-26 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_26
      (= :windows-server-2016-english-full-ecs-optimized data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_ECS_OPTIMIZED
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp2-enterprise data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP2_ENTERPRISE
      (= :windows-server-2008-r2-sp1-japanese-64bit-sql-2012-sp4-standard data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2012_SP4_STANDARD
      (= :windows-server-2022-japanese-full-sql-2019-standard data) WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2019_STANDARD
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2014-sp3-web data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP3_WEB
      (= :windows-server-2016-japanese-full-sql-2017-standard data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2017_STANDARD
      (= :windows-server-2016-english-full-sql-2014-sp3-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2014_SP3_ENTERPRISE
      (= :windows-server-2019-russian-full-base data) WindowsVersion/WINDOWS_SERVER_2019_RUSSIAN_FULL_BASE
      (= :windows-server-2012-rtm-hungarian-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_HUNGARIAN_64BIT_BASE
      (= :windows-server-2016-english-full-sql-2019-express data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2019_EXPRESS
      (= :windows-server-2019-english-core-containerslatest data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_CONTAINERSLATEST
      (= :windows-server-2008-sp2-portuguese-brazil-32bit-base data) WindowsVersion/WINDOWS_SERVER_2008_SP2_PORTUGUESE_BRAZIL_32BIT_BASE
      (= :windows-server-2022-english-core-containerslatest data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_CONTAINERSLATEST
      (= :windows-server-2019-japanese-full-sql-2022-enterprise data) WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2022_ENTERPRISE
      (= :windows-server-2016-japanese-full-sql-2016-sp3-web data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP3_WEB
      (= :windows-server-2019-english-full-sql-2016-sp3-express data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP3_EXPRESS
      (= :windows-server-2019-english-full-sql-2022-web data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2022_WEB
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp1-web data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_WEB
      (= :windows-server-2022-english-full-sql-2022-enterprise data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2022_ENTERPRISE
      (= :windows-server-2019-english-full-ecs-optimized data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_ECS_OPTIMIZED
      (= :windows-server-2019-portuguese-brazil-full-base data) WindowsVersion/WINDOWS_SERVER_2019_PORTUGUESE_BRAZIL_FULL_BASE
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp2-enterprise data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP2_ENTERPRISE
      (= :windows-server-2019-turkish-full-base data) WindowsVersion/WINDOWS_SERVER_2019_TURKISH_FULL_BASE
      (= :windows-server-2012-r2-rtm-english-deep-learning data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_DEEP_LEARNING
      (= :windows-server-2016-english-full-sql-2017-standard data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2017_STANDARD
      (= :windows-server-2019-english-full-eks-optimized-1-28 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_28
      (= :windows-server-2012-r2-rtm-chinese-traditional-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_CHINESE_TRADITIONAL_64BIT_BASE
      (= :windows-server-2022-english-full-eks-optimized-1-27 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_EKS_OPTIMIZED_1_27
      (= :windows-server-2022-english-core-eks-optimized-1-27 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_27
      (= :windows-server-2019-english-full-eks-optimized-1-23 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_23
      (= :windows-server-2012-r2-rtm-swedish-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_SWEDISH_64BIT_BASE
      (= :windows-server-2012-rtm-chinese-traditional-hong-kong-sar-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_CHINESE_TRADITIONAL_HONG_KONG_SAR_64BIT_BASE
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2014-sp2-express data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2014_SP2_EXPRESS
      (= :windows-server-2019-english-full-sql-2016-sp2-enterprise data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP2_ENTERPRISE
      (= :windows-server-2016-japanese-full-sql-2019-web data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2019_WEB
      (= :windows-server-2019-english-core-base data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_BASE
      (= :windows-server-2019-swedish-full-base data) WindowsVersion/WINDOWS_SERVER_2019_SWEDISH_FULL_BASE
      (= :windows-server-2016-dutch-full-base data) WindowsVersion/WINDOWS_SERVER_2016_DUTCH_FULL_BASE
      (= :windows-server-2012-r2-rtm-portuguese-brazil-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_PORTUGUESE_BRAZIL_64BIT_BASE
      (= :windows-server-2012-r2-rtm-english-64bit-hyperv data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_HYPERV
      (= :windows-server-2008-r2-sp1-language-packs-64bit-sql-2008-r2-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_LANGUAGE_PACKS_64BIT_SQL_2008_R2_SP3_STANDARD
      (= :windows-server-2016-english-core-sql-2016-sp3-web data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP3_WEB
      (= :windows-server-2016-english-64bit-sql-2012-sp4-enterprise data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2014-sp3-express data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP3_EXPRESS
      (= :windows-server-2012-r2-rtm-turkish-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_TURKISH_64BIT_BASE
      (= :windows-server-2016-english-core-base data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_BASE
      (= :windows-server-2019-english-core-eks-optimized-1-22 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_22
      (= :windows-server-2012-r2-rtm-english-full-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_FULL_BASE
      (= :windows-server-2012-rtm-english-64bit-sql-2008-r2-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2008_R2_SP3_STANDARD
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2014-sp2-express data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP2_EXPRESS
      (= :windows-server-2019-english-full-sql-2019-web data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2019_WEB
      (= :windows-server-2022-japanese-full-sql-2019-enterprise data) WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2019_ENTERPRISE
      (= :windows-server-2019-english-stig-full data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_STIG_FULL
      (= :windows-server-2012-sp2-portuguese-brazil-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_SP2_PORTUGUESE_BRAZIL_64BIT_BASE
      (= :windows-server-2012-rtm-japanese-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_BASE
      (= :windows-server-2012-rtm-japanese-64bit-sql-2016-sp2-express data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2016_SP2_EXPRESS
      (= :windows-server-2012-r2-rtm-korean-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_KOREAN_64BIT_BASE
      (= :windows-server-2016-korean-full-sql-2016-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2016_KOREAN_FULL_SQL_2016_SP3_STANDARD
      (= :windows-server-2019-english-core-eks-optimized-1-24 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_24
      (= :windows-server-2008-r2-sp1-english-64bit-sharepoint-2010-sp2-foundation data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SHAREPOINT_2010_SP2_FOUNDATION
      (= :windows-server-1803-english-core-containerslatest data) WindowsVersion/WINDOWS_SERVER_1803_ENGLISH_CORE_CONTAINERSLATEST
      (= :windows-server-2022-english-full-ecs-optimized data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_ECS_OPTIMIZED
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2012-sp4-enterprise data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE
      (= :windows-server-2016-english-full-sql-2016-sp2-express data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP2_EXPRESS
      (= :windows-server-2019-spanish-full-base data) WindowsVersion/WINDOWS_SERVER_2019_SPANISH_FULL_BASE
      (= :windows-server-2012-r2-english-stig-full data) WindowsVersion/WINDOWS_SERVER_2012_R2_ENGLISH_STIG_FULL
      (= :windows-server-2012-r2-rtm-dutch-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_DUTCH_64BIT_BASE
      (= :windows-server-2012-r2-rtm-hungarian-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_HUNGARIAN_64BIT_BASE
      (= :windows-server-2022-japanese-full-sql-2017-web data) WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2017_WEB
      (= :windows-server-2016-english-full-sql-2016-sp1-express data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP1_EXPRESS
      (= :windows-server-2016-english-core-sql-2016-sp1-express data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP1_EXPRESS
      (= :windows-server-2016-japanese-full-sql-2016-sp3-express data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP3_EXPRESS
      (= :windows-server-2016-english-full-sql-2019-web data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2019_WEB
      (= :windows-server-2019-english-core-eks-optimized-1-23 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_CORE_EKS_OPTIMIZED_1_23
      (= :windows-server-2019-english-full-sql-2016-sp3-web data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2016_SP3_WEB
      (= :windows-server-2016-english-stig-core data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_STIG_CORE
      (= :windows-server-2008-r2-sp1-english-64bit-sql-2008-r2-sp3-web data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_WEB
      (= :windows-server-2016-korean-full-sql-2016-sp2-standard data) WindowsVersion/WINDOWS_SERVER_2016_KOREAN_FULL_SQL_2016_SP2_STANDARD
      (= :windows-server-2012-r2-rtm-japanese-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_BASE
      (= :windows-server-2016-japanese-full-sql-2016-sp1-web data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_WEB
      (= :windows-server-2019-english-full-sql-2022-express data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2022_EXPRESS
      (= :windows-server-2003-r2-sp2-english-64bit-sql-2005-sp4-standard data) WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_ENGLISH_64BIT_SQL_2005_SP4_STANDARD
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp1-express data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_EXPRESS
      (= :windows-server-2012-rtm-japanese-64bit-sql-2014-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP3_STANDARD
      (= :windows-server-2016-english-core-sql-2016-sp2-web data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_SQL_2016_SP2_WEB
      (= :windows-server-2012-rtm-japanese-64bit-sql-2012-sp4-web data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2012_SP4_WEB
      (= :windows-server-2022-english-core-eks-optimized-1-26 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_26
      (= :windows-server-2012-r2-rtm-chinese-traditional-hong-kong-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_CHINESE_TRADITIONAL_HONG_KONG_64BIT_BASE
      (= :windows-server-2012-r2-rtm-english-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_BASE
      (= :windows-server-2012-rtm-spanish-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_SPANISH_64BIT_BASE
      (= :windows-server-2003-r2-sp2-language-packs-32bit-base data) WindowsVersion/WINDOWS_SERVER_2003_R2_SP2_LANGUAGE_PACKS_32BIT_BASE
      (= :windows-server-2019-english-full-sql-2017-web data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_WEB
      (= :windows-server-2022-english-full-sql-2022-web data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_FULL_SQL_2022_WEB
      (= :windows-server-2012-rtm-german-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_GERMAN_64BIT_BASE
      (= :windows-server-2008-r2-sp1-english-64bit-sql-2008-r2-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2008_R2_SP3_STANDARD
      (= :windows-server-2016-english-stig-full data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_STIG_FULL
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp1-standard data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP1_STANDARD
      (= :windows-server-2012-r2-rtm-chinese-simplified-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_CHINESE_SIMPLIFIED_64BIT_BASE
      (= :windows-server-2019-french-full-base data) WindowsVersion/WINDOWS_SERVER_2019_FRENCH_FULL_BASE
      (= :windows-server-2012-r2-rtm-spanish-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_SPANISH_64BIT_BASE
      (= :windows-server-2012-r2-english-stig-core data) WindowsVersion/WINDOWS_SERVER_2012_R2_ENGLISH_STIG_CORE
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp3-enterprise data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP3_ENTERPRISE
      (= :windows-server-2008-r2-sp1-english-64bit-sql-2012-sp4-express data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_EXPRESS
      (= :windows-server-2019-english-full-eks-optimized-1-22 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_22
      (= :windows-server-2012-r2-rtm-english-64bit-core data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_CORE
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp1-web data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_WEB
      (= :windows-server-2008-r2-sp1-english-64bit-sql-2012-sp4-standard data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_STANDARD
      (= :windows-server-2016-english-full-sql-2016-sp3-web data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_FULL_SQL_2016_SP3_WEB
      (= :windows-server-2008-r2-sp1-english-64bit-sql-2012-sp4-enterprise data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_ENGLISH_64BIT_SQL_2012_SP4_ENTERPRISE
      (= :windows-server-2019-english-full-sql-2019-enterprise data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2019_ENTERPRISE
      (= :windows-server-2008-r2-sp1-japanese-64bit-sql-2008-r2-sp3-express data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_JAPANESE_64BIT_SQL_2008_R2_SP3_EXPRESS
      (= :windows-server-2022-english-core-eks-optimized-1-23 data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_EKS_OPTIMIZED_1_23
      (= :windows-server-2012-rtm-english-64bit-sql-2014-sp2-web data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_WEB
      (= :windows-server-2016-japanese-full-sql-2016-sp2-express data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP2_EXPRESS
      (= :windows-server-2016-english-p3 data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_P3
      (= :windows-server-2012-rtm-swedish-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_SWEDISH_64BIT_BASE
      (= :windows-server-2019-japanese-full-sql-2017-enterprise data) WindowsVersion/WINDOWS_SERVER_2019_JAPANESE_FULL_SQL_2017_ENTERPRISE
      (= :windows-server-2022-japanese-full-sql-2017-enterprise data) WindowsVersion/WINDOWS_SERVER_2022_JAPANESE_FULL_SQL_2017_ENTERPRISE
      (= :windows-server-2016-english-core-containerslatest data) WindowsVersion/WINDOWS_SERVER_2016_ENGLISH_CORE_CONTAINERSLATEST
      (= :windows-server-2012-rtm-english-64bit-sql-2014-sp2-standard data) WindowsVersion/WINDOWS_SERVER_2012_RTM_ENGLISH_64BIT_SQL_2014_SP2_STANDARD
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp3-enterprise data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP3_ENTERPRISE
      (= :windows-server-2008-r2-sp1-chinese-hong-kong-sar-64bit-base data) WindowsVersion/WINDOWS_SERVER_2008_R2_SP1_CHINESE_HONG_KONG_SAR_64BIT_BASE
      (= :windows-server-2019-korean-full-base data) WindowsVersion/WINDOWS_SERVER_2019_KOREAN_FULL_BASE
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2016-sp3-standard data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2016_SP3_STANDARD
      (= :windows-server-2019-english-full-sql-2017-express data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_EXPRESS
      (= :windows-server-2019-english-tesla data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_TESLA
      (= :windows-server-2019-english-full-sql-2017-enterprise data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_SQL_2017_ENTERPRISE
      (= :windows-server-2016-german-full-base data) WindowsVersion/WINDOWS_SERVER_2016_GERMAN_FULL_BASE
      (= :windows-server-2012-rtm-korean-64bit-base data) WindowsVersion/WINDOWS_SERVER_2012_RTM_KOREAN_64BIT_BASE
      (= :windows-server-2012-r2-rtm-english-64bit-sql-2016-sp1-standard data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_ENGLISH_64BIT_SQL_2016_SP1_STANDARD
      (= :windows-server-2019-english-full-eks-optimized-1-26 data) WindowsVersion/WINDOWS_SERVER_2019_ENGLISH_FULL_EKS_OPTIMIZED_1_26
      (= :windows-server-2016-japanese-full-sql-2016-sp1-express data) WindowsVersion/WINDOWS_SERVER_2016_JAPANESE_FULL_SQL_2016_SP1_EXPRESS
      (= :windows-server-2022-english-core-ecs-optimized data) WindowsVersion/WINDOWS_SERVER_2022_ENGLISH_CORE_ECS_OPTIMIZED
      (= :windows-server-2012-rtm-japanese-64bit-2012-sp4-standard data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_2012_SP4_STANDARD
      (= :windows-server-2016-korean-full-base data) WindowsVersion/WINDOWS_SERVER_2016_KOREAN_FULL_BASE
      (= :windows-server-2012-r2-rtm-japanese-64bit-sql-2014-sp2-standard data) WindowsVersion/WINDOWS_SERVER_2012_R2_RTM_JAPANESE_64BIT_SQL_2014_SP2_STANDARD
      (= :windows-server-2012-rtm-japanese-64bit-sql-2014-sp2-express data) WindowsVersion/WINDOWS_SERVER_2012_RTM_JAPANESE_64BIT_SQL_2014_SP2_EXPRESS)))





(defn acl-cidr-config-builder
  "The acl-cidr-config-builder function buildes out new instances of 
AclCidrConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |"
  [stack id config]
  (let [builder (AclCidrConfig$Builder.)]
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (.build builder)))


(defn acl-icmp-builder
  "The acl-icmp-builder function buildes out new instances of 
AclIcmp$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | java.lang.Number | [[cdk.support/lookup-entry]] | `:code` |
| `type` | java.lang.Number | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (AclIcmp$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn acl-port-range-builder
  "The acl-port-range-builder function buildes out new instances of 
AclPortRange$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `from` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from` |
| `to` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to` |"
  [stack id config]
  (let [builder (AclPortRange$Builder.)]
    (when-let [data (lookup-entry config id :from)]
      (. builder from data))
    (when-let [data (lookup-entry config id :to)]
      (. builder to data))
    (.build builder)))


(defn acl-traffic-config-builder
  "The acl-traffic-config-builder function buildes out new instances of 
AclTrafficConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `icmp` | software.amazon.awscdk.services.ec2.AclIcmp | [[cdk.support/lookup-entry]] | `:icmp` |
| `portRange` | software.amazon.awscdk.services.ec2.AclPortRange | [[cdk.support/lookup-entry]] | `:port-range` |
| `protocol` | java.lang.Number | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (AclTrafficConfig$Builder.)]
    (when-let [data (lookup-entry config id :icmp)]
      (. builder icmp data))
    (when-let [data (lookup-entry config id :port-range)]
      (. builder portRange data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn add-route-options-builder
  "The add-route-options-builder function buildes out new instances of 
AddRouteOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `destinationIpv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-ipv6-cidr-block` |
| `enablesInternetConnectivity` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enables-internet-connectivity` |
| `routerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:router-id` |
| `routerType` | software.amazon.awscdk.services.ec2.RouterType | [[cdk.api.services.ec2/router-type]] | `:router-type` |"
  [stack id config]
  (let [builder (AddRouteOptions$Builder.)]
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :destination-ipv6-cidr-block)]
      (. builder destinationIpv6CidrBlock data))
    (when-let [data (lookup-entry config id :enables-internet-connectivity)]
      (. builder enablesInternetConnectivity data))
    (when-let [data (lookup-entry config id :router-id)]
      (. builder routerId data))
    (when-let [data (router-type config id :router-type)]
      (. builder routerType data))
    (.build builder)))


(defn allocate-cidr-request-builder
  "The allocate-cidr-request-builder function buildes out new instances of 
AllocateCidrRequest$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requestedSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:requested-subnets` |
| `vpcCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-cidr` |"
  [stack id config]
  (let [builder (AllocateCidrRequest$Builder.)]
    (when-let [data (lookup-entry config id :requested-subnets)]
      (. builder requestedSubnets data))
    (when-let [data (lookup-entry config id :vpc-cidr)]
      (. builder vpcCidr data))
    (.build builder)))


(defn allocate-ipv6-cidr-request-builder
  "The allocate-ipv6-cidr-request-builder function buildes out new instances of 
AllocateIpv6CidrRequest$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:allocated-subnets` |
| `ipv6Cidrs` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv6-cidrs` |"
  [stack id config]
  (let [builder (AllocateIpv6CidrRequest$Builder.)]
    (when-let [data (lookup-entry config id :allocated-subnets)]
      (. builder allocatedSubnets data))
    (when-let [data (lookup-entry config id :ipv6-cidrs)]
      (. builder ipv6Cidrs data))
    (.build builder)))


(defn allocate-vpc-ipv6-cidr-request-builder
  "The allocate-vpc-ipv6-cidr-request-builder function buildes out new instances of 
AllocateVpcIpv6CidrRequest$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:scope` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (AllocateVpcIpv6CidrRequest$Builder.)]
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn allocated-subnet-builder
  "The allocated-subnet-builder function buildes out new instances of 
AllocatedSubnet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `ipv6Cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr` |"
  [stack id config]
  (let [builder (AllocatedSubnet$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :ipv6-cidr)]
      (. builder ipv6Cidr data))
    (.build builder)))


(defn amazon-linux-image-builder
  "The amazon-linux-image-builder function buildes out new instances of 
AmazonLinuxImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `cpuType` | software.amazon.awscdk.services.ec2.AmazonLinuxCpuType | [[cdk.api.services.ec2/amazon-linux-cpu-type]] | `:cpu-type` |
| `edition` | software.amazon.awscdk.services.ec2.AmazonLinuxEdition | [[cdk.api.services.ec2/amazon-linux-edition]] | `:edition` |
| `generation` | software.amazon.awscdk.services.ec2.AmazonLinuxGeneration | [[cdk.api.services.ec2/amazon-linux-generation]] | `:generation` |
| `kernel` | software.amazon.awscdk.services.ec2.AmazonLinuxKernel | [[cdk.api.services.ec2/amazon-linux-kernel]] | `:kernel` |
| `storage` | software.amazon.awscdk.services.ec2.AmazonLinuxStorage | [[cdk.api.services.ec2/amazon-linux-storage]] | `:storage` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |
| `virtualization` | software.amazon.awscdk.services.ec2.AmazonLinuxVirt | [[cdk.api.services.ec2/amazon-linux-virt]] | `:virtualization` |"
  [stack id config]
  (let [builder (AmazonLinuxImage$Builder/create)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (amazon-linux-cpu-type config id :cpu-type)]
      (. builder cpuType data))
    (when-let [data (amazon-linux-edition config id :edition)]
      (. builder edition data))
    (when-let [data (amazon-linux-generation config id :generation)]
      (. builder generation data))
    (when-let [data (amazon-linux-kernel config id :kernel)]
      (. builder kernel data))
    (when-let [data (amazon-linux-storage config id :storage)]
      (. builder storage data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (amazon-linux-virt config id :virtualization)]
      (. builder virtualization data))
    (.build builder)))


(defn amazon-linux-image-props-builder
  "The amazon-linux-image-props-builder function buildes out new instances of 
AmazonLinuxImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `cpuType` | software.amazon.awscdk.services.ec2.AmazonLinuxCpuType | [[cdk.api.services.ec2/amazon-linux-cpu-type]] | `:cpu-type` |
| `edition` | software.amazon.awscdk.services.ec2.AmazonLinuxEdition | [[cdk.api.services.ec2/amazon-linux-edition]] | `:edition` |
| `generation` | software.amazon.awscdk.services.ec2.AmazonLinuxGeneration | [[cdk.api.services.ec2/amazon-linux-generation]] | `:generation` |
| `kernel` | software.amazon.awscdk.services.ec2.AmazonLinuxKernel | [[cdk.api.services.ec2/amazon-linux-kernel]] | `:kernel` |
| `storage` | software.amazon.awscdk.services.ec2.AmazonLinuxStorage | [[cdk.api.services.ec2/amazon-linux-storage]] | `:storage` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |
| `virtualization` | software.amazon.awscdk.services.ec2.AmazonLinuxVirt | [[cdk.api.services.ec2/amazon-linux-virt]] | `:virtualization` |"
  [stack id config]
  (let [builder (AmazonLinuxImageProps$Builder.)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (amazon-linux-cpu-type config id :cpu-type)]
      (. builder cpuType data))
    (when-let [data (amazon-linux-edition config id :edition)]
      (. builder edition data))
    (when-let [data (amazon-linux-generation config id :generation)]
      (. builder generation data))
    (when-let [data (amazon-linux-kernel config id :kernel)]
      (. builder kernel data))
    (when-let [data (amazon-linux-storage config id :storage)]
      (. builder storage data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (amazon-linux-virt config id :virtualization)]
      (. builder virtualization data))
    (.build builder)))


(defn amazon-linux-image-ssm-parameter-base-options-builder
  "The amazon-linux-image-ssm-parameter-base-options-builder function buildes out new instances of 
AmazonLinuxImageSsmParameterBaseOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (AmazonLinuxImageSsmParameterBaseOptions$Builder.)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn amazon-linux-image-ssm-parameter-base-props-builder
  "The amazon-linux-image-ssm-parameter-base-props-builder function buildes out new instances of 
AmazonLinuxImageSsmParameterBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (AmazonLinuxImageSsmParameterBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (lookup-entry config id :parameter-name)]
      (. builder parameterName data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn amazon-linux-image-ssm-parameter-common-options-builder
  "The amazon-linux-image-ssm-parameter-common-options-builder function buildes out new instances of 
AmazonLinuxImageSsmParameterCommonOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `cpuType` | software.amazon.awscdk.services.ec2.AmazonLinuxCpuType | [[cdk.api.services.ec2/amazon-linux-cpu-type]] | `:cpu-type` |
| `edition` | software.amazon.awscdk.services.ec2.AmazonLinuxEdition | [[cdk.api.services.ec2/amazon-linux-edition]] | `:edition` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (AmazonLinuxImageSsmParameterCommonOptions$Builder.)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (amazon-linux-cpu-type config id :cpu-type)]
      (. builder cpuType data))
    (when-let [data (amazon-linux-edition config id :edition)]
      (. builder edition data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn amazon-linux2-image-ssm-parameter-builder
  "The amazon-linux2-image-ssm-parameter-builder function buildes out new instances of 
AmazonLinux2ImageSsmParameter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `cpuType` | software.amazon.awscdk.services.ec2.AmazonLinuxCpuType | [[cdk.api.services.ec2/amazon-linux-cpu-type]] | `:cpu-type` |
| `edition` | software.amazon.awscdk.services.ec2.AmazonLinuxEdition | [[cdk.api.services.ec2/amazon-linux-edition]] | `:edition` |
| `kernel` | software.amazon.awscdk.services.ec2.AmazonLinux2Kernel | [[cdk.support/lookup-entry]] | `:kernel` |
| `storage` | software.amazon.awscdk.services.ec2.AmazonLinuxStorage | [[cdk.api.services.ec2/amazon-linux-storage]] | `:storage` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |
| `virtualization` | software.amazon.awscdk.services.ec2.AmazonLinuxVirt | [[cdk.api.services.ec2/amazon-linux-virt]] | `:virtualization` |"
  [stack id config]
  (let [builder (AmazonLinux2ImageSsmParameter$Builder/create)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (amazon-linux-cpu-type config id :cpu-type)]
      (. builder cpuType data))
    (when-let [data (amazon-linux-edition config id :edition)]
      (. builder edition data))
    (when-let [data (lookup-entry config id :kernel)]
      (. builder kernel data))
    (when-let [data (amazon-linux-storage config id :storage)]
      (. builder storage data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (amazon-linux-virt config id :virtualization)]
      (. builder virtualization data))
    (.build builder)))


(defn amazon-linux2-image-ssm-parameter-props-builder
  "The amazon-linux2-image-ssm-parameter-props-builder function buildes out new instances of 
AmazonLinux2ImageSsmParameterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `cpuType` | software.amazon.awscdk.services.ec2.AmazonLinuxCpuType | [[cdk.api.services.ec2/amazon-linux-cpu-type]] | `:cpu-type` |
| `edition` | software.amazon.awscdk.services.ec2.AmazonLinuxEdition | [[cdk.api.services.ec2/amazon-linux-edition]] | `:edition` |
| `kernel` | software.amazon.awscdk.services.ec2.AmazonLinux2Kernel | [[cdk.support/lookup-entry]] | `:kernel` |
| `storage` | software.amazon.awscdk.services.ec2.AmazonLinuxStorage | [[cdk.api.services.ec2/amazon-linux-storage]] | `:storage` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |
| `virtualization` | software.amazon.awscdk.services.ec2.AmazonLinuxVirt | [[cdk.api.services.ec2/amazon-linux-virt]] | `:virtualization` |"
  [stack id config]
  (let [builder (AmazonLinux2ImageSsmParameterProps$Builder.)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (amazon-linux-cpu-type config id :cpu-type)]
      (. builder cpuType data))
    (when-let [data (amazon-linux-edition config id :edition)]
      (. builder edition data))
    (when-let [data (lookup-entry config id :kernel)]
      (. builder kernel data))
    (when-let [data (amazon-linux-storage config id :storage)]
      (. builder storage data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (amazon-linux-virt config id :virtualization)]
      (. builder virtualization data))
    (.build builder)))


(defn amazon-linux2022-image-ssm-parameter-builder
  "The amazon-linux2022-image-ssm-parameter-builder function buildes out new instances of 
AmazonLinux2022ImageSsmParameter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `cpuType` | software.amazon.awscdk.services.ec2.AmazonLinuxCpuType | [[cdk.api.services.ec2/amazon-linux-cpu-type]] | `:cpu-type` |
| `edition` | software.amazon.awscdk.services.ec2.AmazonLinuxEdition | [[cdk.api.services.ec2/amazon-linux-edition]] | `:edition` |
| `kernel` | software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel | [[cdk.support/lookup-entry]] | `:kernel` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (AmazonLinux2022ImageSsmParameter$Builder/create)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (amazon-linux-cpu-type config id :cpu-type)]
      (. builder cpuType data))
    (when-let [data (amazon-linux-edition config id :edition)]
      (. builder edition data))
    (when-let [data (lookup-entry config id :kernel)]
      (. builder kernel data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn amazon-linux2022-image-ssm-parameter-props-builder
  "The amazon-linux2022-image-ssm-parameter-props-builder function buildes out new instances of 
AmazonLinux2022ImageSsmParameterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `cpuType` | software.amazon.awscdk.services.ec2.AmazonLinuxCpuType | [[cdk.api.services.ec2/amazon-linux-cpu-type]] | `:cpu-type` |
| `edition` | software.amazon.awscdk.services.ec2.AmazonLinuxEdition | [[cdk.api.services.ec2/amazon-linux-edition]] | `:edition` |
| `kernel` | software.amazon.awscdk.services.ec2.AmazonLinux2022Kernel | [[cdk.support/lookup-entry]] | `:kernel` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (AmazonLinux2022ImageSsmParameterProps$Builder.)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (amazon-linux-cpu-type config id :cpu-type)]
      (. builder cpuType data))
    (when-let [data (amazon-linux-edition config id :edition)]
      (. builder edition data))
    (when-let [data (lookup-entry config id :kernel)]
      (. builder kernel data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn amazon-linux2023-image-ssm-parameter-builder
  "The amazon-linux2023-image-ssm-parameter-builder function buildes out new instances of 
AmazonLinux2023ImageSsmParameter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `cpuType` | software.amazon.awscdk.services.ec2.AmazonLinuxCpuType | [[cdk.api.services.ec2/amazon-linux-cpu-type]] | `:cpu-type` |
| `edition` | software.amazon.awscdk.services.ec2.AmazonLinuxEdition | [[cdk.api.services.ec2/amazon-linux-edition]] | `:edition` |
| `kernel` | software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel | [[cdk.support/lookup-entry]] | `:kernel` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (AmazonLinux2023ImageSsmParameter$Builder/create)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (amazon-linux-cpu-type config id :cpu-type)]
      (. builder cpuType data))
    (when-let [data (amazon-linux-edition config id :edition)]
      (. builder edition data))
    (when-let [data (lookup-entry config id :kernel)]
      (. builder kernel data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn amazon-linux2023-image-ssm-parameter-props-builder
  "The amazon-linux2023-image-ssm-parameter-props-builder function buildes out new instances of 
AmazonLinux2023ImageSsmParameterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `cpuType` | software.amazon.awscdk.services.ec2.AmazonLinuxCpuType | [[cdk.api.services.ec2/amazon-linux-cpu-type]] | `:cpu-type` |
| `edition` | software.amazon.awscdk.services.ec2.AmazonLinuxEdition | [[cdk.api.services.ec2/amazon-linux-edition]] | `:edition` |
| `kernel` | software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel | [[cdk.support/lookup-entry]] | `:kernel` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (AmazonLinux2023ImageSsmParameterProps$Builder.)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (amazon-linux-cpu-type config id :cpu-type)]
      (. builder cpuType data))
    (when-let [data (amazon-linux-edition config id :edition)]
      (. builder edition data))
    (when-let [data (lookup-entry config id :kernel)]
      (. builder kernel data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn apply-cloud-formation-init-options-builder
  "The apply-cloud-formation-init-options-builder function buildes out new instances of 
ApplyCloudFormationInitOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configSets` | java.util.List | [[cdk.support/lookup-entry]] | `:config-sets` |
| `embedFingerprint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:embed-fingerprint` |
| `ignoreFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-failures` |
| `includeRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-role` |
| `includeUrl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-url` |
| `printLog` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:print-log` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (ApplyCloudFormationInitOptions$Builder.)]
    (when-let [data (lookup-entry config id :config-sets)]
      (. builder configSets data))
    (when-let [data (lookup-entry config id :embed-fingerprint)]
      (. builder embedFingerprint data))
    (when-let [data (lookup-entry config id :ignore-failures)]
      (. builder ignoreFailures data))
    (when-let [data (lookup-entry config id :include-role)]
      (. builder includeRole data))
    (when-let [data (lookup-entry config id :include-url)]
      (. builder includeUrl data))
    (when-let [data (lookup-entry config id :print-log)]
      (. builder printLog data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn attach-init-options-builder
  "The attach-init-options-builder function buildes out new instances of 
AttachInitOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configSets` | java.util.List | [[cdk.support/lookup-entry]] | `:config-sets` |
| `embedFingerprint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:embed-fingerprint` |
| `ignoreFailures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-failures` |
| `includeRole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-role` |
| `includeUrl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-url` |
| `instanceRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:instance-role` |
| `platform` | software.amazon.awscdk.services.ec2.OperatingSystemType | [[cdk.api.services.ec2/operating-system-type]] | `:platform` |
| `printLog` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:print-log` |
| `signalResource` | software.amazon.awscdk.CfnResource | [[cdk.support/lookup-entry]] | `:signal-resource` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (AttachInitOptions$Builder.)]
    (when-let [data (lookup-entry config id :config-sets)]
      (. builder configSets data))
    (when-let [data (lookup-entry config id :embed-fingerprint)]
      (. builder embedFingerprint data))
    (when-let [data (lookup-entry config id :ignore-failures)]
      (. builder ignoreFailures data))
    (when-let [data (lookup-entry config id :include-role)]
      (. builder includeRole data))
    (when-let [data (lookup-entry config id :include-url)]
      (. builder includeUrl data))
    (when-let [data (lookup-entry config id :instance-role)]
      (. builder instanceRole data))
    (when-let [data (operating-system-type config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :print-log)]
      (. builder printLog data))
    (when-let [data (lookup-entry config id :signal-resource)]
      (. builder signalResource data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn aws-ipam-props-builder
  "The aws-ipam-props-builder function buildes out new instances of 
AwsIpamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultSubnetIpv4NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-subnet-ipv4-netmask-length` |
| `ipv4IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-ipam-pool-id` |
| `ipv4NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv4-netmask-length` |"
  [stack id config]
  (let [builder (AwsIpamProps$Builder.)]
    (when-let [data (lookup-entry config id :default-subnet-ipv4-netmask-length)]
      (. builder defaultSubnetIpv4NetmaskLength data))
    (when-let [data (lookup-entry config id :ipv4-ipam-pool-id)]
      (. builder ipv4IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv4-netmask-length)]
      (. builder ipv4NetmaskLength data))
    (.build builder)))


(defn bastion-host-linux-builder
  "The bastion-host-linux-builder function buildes out new instances of 
BastionHostLinux$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `blockDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:block-devices` |
| `init` | software.amazon.awscdk.services.ec2.CloudFormationInit | [[cdk.support/lookup-entry]] | `:init` |
| `initOptions` | software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions | [[cdk.support/lookup-entry]] | `:init-options` |
| `instanceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-name` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `machineImage` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:machine-image` |
| `requireImdsv2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-imdsv2` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (BastionHostLinux$Builder/create stack id)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :block-devices)]
      (. builder blockDevices data))
    (when-let [data (lookup-entry config id :init)]
      (. builder init data))
    (when-let [data (lookup-entry config id :init-options)]
      (. builder initOptions data))
    (when-let [data (lookup-entry config id :instance-name)]
      (. builder instanceName data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :machine-image)]
      (. builder machineImage data))
    (when-let [data (lookup-entry config id :require-imdsv2)]
      (. builder requireImdsv2 data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn bastion-host-linux-props-builder
  "The bastion-host-linux-props-builder function buildes out new instances of 
BastionHostLinuxProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `blockDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:block-devices` |
| `init` | software.amazon.awscdk.services.ec2.CloudFormationInit | [[cdk.support/lookup-entry]] | `:init` |
| `initOptions` | software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions | [[cdk.support/lookup-entry]] | `:init-options` |
| `instanceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-name` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `machineImage` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:machine-image` |
| `requireImdsv2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-imdsv2` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (BastionHostLinuxProps$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :block-devices)]
      (. builder blockDevices data))
    (when-let [data (lookup-entry config id :init)]
      (. builder init data))
    (when-let [data (lookup-entry config id :init-options)]
      (. builder initOptions data))
    (when-let [data (lookup-entry config id :instance-name)]
      (. builder instanceName data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :machine-image)]
      (. builder machineImage data))
    (when-let [data (lookup-entry config id :require-imdsv2)]
      (. builder requireImdsv2 data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn block-device-builder
  "The block-device-builder function buildes out new instances of 
BlockDevice$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `mappingEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mapping-enabled` |
| `volume` | software.amazon.awscdk.services.ec2.BlockDeviceVolume | [[cdk.support/lookup-entry]] | `:volume` |"
  [stack id config]
  (let [builder (BlockDevice$Builder.)]
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :mapping-enabled)]
      (. builder mappingEnabled data))
    (when-let [data (lookup-entry config id :volume)]
      (. builder volume data))
    (.build builder)))


(defn cfn-capacity-reservation-builder
  "The cfn-capacity-reservation-builder function buildes out new instances of 
CfnCapacityReservation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `ebsOptimized` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `endDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date` |
| `endDateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date-type` |
| `ephemeralStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceMatchCriteria` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-match-criteria` |
| `instancePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-platform` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `outPostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:out-post-arn` |
| `placementGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-group-arn` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `tenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenancy` |"
  [stack id config]
  (let [builder (CfnCapacityReservation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :end-date)]
      (. builder endDate data))
    (when-let [data (lookup-entry config id :end-date-type)]
      (. builder endDateType data))
    (when-let [data (lookup-entry config id :ephemeral-storage)]
      (. builder ephemeralStorage data))
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-match-criteria)]
      (. builder instanceMatchCriteria data))
    (when-let [data (lookup-entry config id :instance-platform)]
      (. builder instancePlatform data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :out-post-arn)]
      (. builder outPostArn data))
    (when-let [data (lookup-entry config id :placement-group-arn)]
      (. builder placementGroupArn data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :tenancy)]
      (. builder tenancy data))
    (.build builder)))


(defn cfn-capacity-reservation-fleet-builder
  "The cfn-capacity-reservation-fleet-builder function buildes out new instances of 
CfnCapacityReservationFleet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
| `endDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date` |
| `instanceMatchCriteria` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-match-criteria` |
| `instanceTypeSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-type-specifications` |
| `noRemoveEndDate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:no-remove-end-date` |
| `removeEndDate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-end-date` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `tenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenancy` |
| `totalTargetCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-target-capacity` |"
  [stack id config]
  (let [builder (CfnCapacityReservationFleet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :end-date)]
      (. builder endDate data))
    (when-let [data (lookup-entry config id :instance-match-criteria)]
      (. builder instanceMatchCriteria data))
    (when-let [data (lookup-entry config id :instance-type-specifications)]
      (. builder instanceTypeSpecifications data))
    (when-let [data (lookup-entry config id :no-remove-end-date)]
      (. builder noRemoveEndDate data))
    (when-let [data (lookup-entry config id :remove-end-date)]
      (. builder removeEndDate data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :tenancy)]
      (. builder tenancy data))
    (when-let [data (lookup-entry config id :total-target-capacity)]
      (. builder totalTargetCapacity data))
    (.build builder)))


(defn cfn-capacity-reservation-fleet-instance-type-specification-property-builder
  "The cfn-capacity-reservation-fleet-instance-type-specification-property-builder function buildes out new instances of 
CfnCapacityReservationFleet$InstanceTypeSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `availabilityZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone-id` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `instancePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-platform` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnCapacityReservationFleet$InstanceTypeSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :availability-zone-id)]
      (. builder availabilityZoneId data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :instance-platform)]
      (. builder instancePlatform data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-capacity-reservation-fleet-props-builder
  "The cfn-capacity-reservation-fleet-props-builder function buildes out new instances of 
CfnCapacityReservationFleetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
| `endDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date` |
| `instanceMatchCriteria` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-match-criteria` |
| `instanceTypeSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-type-specifications` |
| `noRemoveEndDate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-remove-end-date` |
| `removeEndDate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:remove-end-date` |
| `tagSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `tenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenancy` |
| `totalTargetCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-target-capacity` |"
  [stack id config]
  (let [builder (CfnCapacityReservationFleetProps$Builder.)]
    (when-let [data (lookup-entry config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :end-date)]
      (. builder endDate data))
    (when-let [data (lookup-entry config id :instance-match-criteria)]
      (. builder instanceMatchCriteria data))
    (when-let [data (lookup-entry config id :instance-type-specifications)]
      (. builder instanceTypeSpecifications data))
    (when-let [data (lookup-entry config id :no-remove-end-date)]
      (. builder noRemoveEndDate data))
    (when-let [data (lookup-entry config id :remove-end-date)]
      (. builder removeEndDate data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :tenancy)]
      (. builder tenancy data))
    (when-let [data (lookup-entry config id :total-target-capacity)]
      (. builder totalTargetCapacity data))
    (.build builder)))


(defn cfn-capacity-reservation-fleet-tag-specification-property-builder
  "The cfn-capacity-reservation-fleet-tag-specification-property-builder function buildes out new instances of 
CfnCapacityReservationFleet$TagSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCapacityReservationFleet$TagSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-capacity-reservation-props-builder
  "The cfn-capacity-reservation-props-builder function buildes out new instances of 
CfnCapacityReservationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `endDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date` |
| `endDateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date-type` |
| `ephemeralStorage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ephemeral-storage` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceMatchCriteria` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-match-criteria` |
| `instancePlatform` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-platform` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `outPostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:out-post-arn` |
| `placementGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-group-arn` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `tenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenancy` |"
  [stack id config]
  (let [builder (CfnCapacityReservationProps$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :end-date)]
      (. builder endDate data))
    (when-let [data (lookup-entry config id :end-date-type)]
      (. builder endDateType data))
    (when-let [data (lookup-entry config id :ephemeral-storage)]
      (. builder ephemeralStorage data))
    (when-let [data (lookup-entry config id :instance-count)]
      (. builder instanceCount data))
    (when-let [data (lookup-entry config id :instance-match-criteria)]
      (. builder instanceMatchCriteria data))
    (when-let [data (lookup-entry config id :instance-platform)]
      (. builder instancePlatform data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :out-post-arn)]
      (. builder outPostArn data))
    (when-let [data (lookup-entry config id :placement-group-arn)]
      (. builder placementGroupArn data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :tenancy)]
      (. builder tenancy data))
    (.build builder)))


(defn cfn-capacity-reservation-tag-specification-property-builder
  "The cfn-capacity-reservation-tag-specification-property-builder function buildes out new instances of 
CfnCapacityReservation$TagSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCapacityReservation$TagSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-carrier-gateway-builder
  "The cfn-carrier-gateway-builder function buildes out new instances of 
CfnCarrierGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnCarrierGateway$Builder/create stack id)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-carrier-gateway-props-builder
  "The cfn-carrier-gateway-props-builder function buildes out new instances of 
CfnCarrierGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnCarrierGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-client-vpn-authorization-rule-builder
  "The cfn-client-vpn-authorization-rule-builder function buildes out new instances of 
CfnClientVpnAuthorizationRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-group-id` |
| `authorizeAllGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authorize-all-groups` |
| `clientVpnEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-vpn-endpoint-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `targetNetworkCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-network-cidr` |"
  [stack id config]
  (let [builder (CfnClientVpnAuthorizationRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-group-id)]
      (. builder accessGroupId data))
    (when-let [data (lookup-entry config id :authorize-all-groups)]
      (. builder authorizeAllGroups data))
    (when-let [data (lookup-entry config id :client-vpn-endpoint-id)]
      (. builder clientVpnEndpointId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :target-network-cidr)]
      (. builder targetNetworkCidr data))
    (.build builder)))


(defn cfn-client-vpn-authorization-rule-props-builder
  "The cfn-client-vpn-authorization-rule-props-builder function buildes out new instances of 
CfnClientVpnAuthorizationRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-group-id` |
| `authorizeAllGroups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:authorize-all-groups` |
| `clientVpnEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-vpn-endpoint-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `targetNetworkCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-network-cidr` |"
  [stack id config]
  (let [builder (CfnClientVpnAuthorizationRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :access-group-id)]
      (. builder accessGroupId data))
    (when-let [data (lookup-entry config id :authorize-all-groups)]
      (. builder authorizeAllGroups data))
    (when-let [data (lookup-entry config id :client-vpn-endpoint-id)]
      (. builder clientVpnEndpointId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :target-network-cidr)]
      (. builder targetNetworkCidr data))
    (.build builder)))


(defn cfn-client-vpn-endpoint-builder
  "The cfn-client-vpn-endpoint-builder function buildes out new instances of 
CfnClientVpnEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:authentication-options` |
| `clientCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-cidr-block` |
| `clientConnectOptions` | software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint$ClientConnectOptionsProperty | [[cdk.support/lookup-entry]] | `:client-connect-options` |
| `clientLoginBannerOptions` | software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint$ClientLoginBannerOptionsProperty | [[cdk.support/lookup-entry]] | `:client-login-banner-options` |
| `connectionLogOptions` | software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint$ConnectionLogOptionsProperty | [[cdk.support/lookup-entry]] | `:connection-log-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `selfServicePortal` | java.lang.String | [[cdk.support/lookup-entry]] | `:self-service-portal` |
| `serverCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-arn` |
| `sessionTimeoutHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session-timeout-hours` |
| `splitTunnel` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:split-tunnel` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `transportProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:transport-protocol` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `vpnPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:vpn-port` |"
  [stack id config]
  (let [builder (CfnClientVpnEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authentication-options)]
      (. builder authenticationOptions data))
    (when-let [data (lookup-entry config id :client-cidr-block)]
      (. builder clientCidrBlock data))
    (when-let [data (lookup-entry config id :client-connect-options)]
      (. builder clientConnectOptions data))
    (when-let [data (lookup-entry config id :client-login-banner-options)]
      (. builder clientLoginBannerOptions data))
    (when-let [data (lookup-entry config id :connection-log-options)]
      (. builder connectionLogOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :self-service-portal)]
      (. builder selfServicePortal data))
    (when-let [data (lookup-entry config id :server-certificate-arn)]
      (. builder serverCertificateArn data))
    (when-let [data (lookup-entry config id :session-timeout-hours)]
      (. builder sessionTimeoutHours data))
    (when-let [data (lookup-entry config id :split-tunnel)]
      (. builder splitTunnel data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :transport-protocol)]
      (. builder transportProtocol data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (when-let [data (lookup-entry config id :vpn-port)]
      (. builder vpnPort data))
    (.build builder)))


(defn cfn-client-vpn-endpoint-certificate-authentication-request-property-builder
  "The cfn-client-vpn-endpoint-certificate-authentication-request-property-builder function buildes out new instances of 
CfnClientVpnEndpoint$CertificateAuthenticationRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientRootCertificateChainArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-root-certificate-chain-arn` |"
  [stack id config]
  (let [builder (CfnClientVpnEndpoint$CertificateAuthenticationRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :client-root-certificate-chain-arn)]
      (. builder clientRootCertificateChainArn data))
    (.build builder)))


(defn cfn-client-vpn-endpoint-client-authentication-request-property-builder
  "The cfn-client-vpn-endpoint-client-authentication-request-property-builder function buildes out new instances of 
CfnClientVpnEndpoint$ClientAuthenticationRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDirectory` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:active-directory` |
| `federatedAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:federated-authentication` |
| `mutualAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mutual-authentication` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnClientVpnEndpoint$ClientAuthenticationRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :active-directory)]
      (. builder activeDirectory data))
    (when-let [data (lookup-entry config id :federated-authentication)]
      (. builder federatedAuthentication data))
    (when-let [data (lookup-entry config id :mutual-authentication)]
      (. builder mutualAuthentication data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-client-vpn-endpoint-client-connect-options-property-builder
  "The cfn-client-vpn-endpoint-client-connect-options-property-builder function buildes out new instances of 
CfnClientVpnEndpoint$ClientConnectOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `lambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-arn` |"
  [stack id config]
  (let [builder (CfnClientVpnEndpoint$ClientConnectOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :lambda-function-arn)]
      (. builder lambdaFunctionArn data))
    (.build builder)))


(defn cfn-client-vpn-endpoint-client-login-banner-options-property-builder
  "The cfn-client-vpn-endpoint-client-login-banner-options-property-builder function buildes out new instances of 
CfnClientVpnEndpoint$ClientLoginBannerOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bannerText` | java.lang.String | [[cdk.support/lookup-entry]] | `:banner-text` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnClientVpnEndpoint$ClientLoginBannerOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :banner-text)]
      (. builder bannerText data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-client-vpn-endpoint-connection-log-options-property-builder
  "The cfn-client-vpn-endpoint-connection-log-options-property-builder function buildes out new instances of 
CfnClientVpnEndpoint$ConnectionLogOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudwatchLogGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloudwatch-log-group` |
| `cloudwatchLogStream` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloudwatch-log-stream` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnClientVpnEndpoint$ConnectionLogOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloudwatch-log-group)]
      (. builder cloudwatchLogGroup data))
    (when-let [data (lookup-entry config id :cloudwatch-log-stream)]
      (. builder cloudwatchLogStream data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-client-vpn-endpoint-directory-service-authentication-request-property-builder
  "The cfn-client-vpn-endpoint-directory-service-authentication-request-property-builder function buildes out new instances of 
CfnClientVpnEndpoint$DirectoryServiceAuthenticationRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |"
  [stack id config]
  (let [builder (CfnClientVpnEndpoint$DirectoryServiceAuthenticationRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :directory-id)]
      (. builder directoryId data))
    (.build builder)))


(defn cfn-client-vpn-endpoint-federated-authentication-request-property-builder
  "The cfn-client-vpn-endpoint-federated-authentication-request-property-builder function buildes out new instances of 
CfnClientVpnEndpoint$FederatedAuthenticationRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `samlProviderArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:saml-provider-arn` |
| `selfServiceSamlProviderArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:self-service-saml-provider-arn` |"
  [stack id config]
  (let [builder (CfnClientVpnEndpoint$FederatedAuthenticationRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :saml-provider-arn)]
      (. builder samlProviderArn data))
    (when-let [data (lookup-entry config id :self-service-saml-provider-arn)]
      (. builder selfServiceSamlProviderArn data))
    (.build builder)))


(defn cfn-client-vpn-endpoint-props-builder
  "The cfn-client-vpn-endpoint-props-builder function buildes out new instances of 
CfnClientVpnEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-options` |
| `clientCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-cidr-block` |
| `clientConnectOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-connect-options` |
| `clientLoginBannerOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-login-banner-options` |
| `connectionLogOptions` | software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint$ConnectionLogOptionsProperty | [[cdk.support/lookup-entry]] | `:connection-log-options` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `selfServicePortal` | java.lang.String | [[cdk.support/lookup-entry]] | `:self-service-portal` |
| `serverCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-arn` |
| `sessionTimeoutHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session-timeout-hours` |
| `splitTunnel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:split-tunnel` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `transportProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:transport-protocol` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `vpnPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:vpn-port` |"
  [stack id config]
  (let [builder (CfnClientVpnEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :authentication-options)]
      (. builder authenticationOptions data))
    (when-let [data (lookup-entry config id :client-cidr-block)]
      (. builder clientCidrBlock data))
    (when-let [data (lookup-entry config id :client-connect-options)]
      (. builder clientConnectOptions data))
    (when-let [data (lookup-entry config id :client-login-banner-options)]
      (. builder clientLoginBannerOptions data))
    (when-let [data (lookup-entry config id :connection-log-options)]
      (. builder connectionLogOptions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :self-service-portal)]
      (. builder selfServicePortal data))
    (when-let [data (lookup-entry config id :server-certificate-arn)]
      (. builder serverCertificateArn data))
    (when-let [data (lookup-entry config id :session-timeout-hours)]
      (. builder sessionTimeoutHours data))
    (when-let [data (lookup-entry config id :split-tunnel)]
      (. builder splitTunnel data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :transport-protocol)]
      (. builder transportProtocol data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (when-let [data (lookup-entry config id :vpn-port)]
      (. builder vpnPort data))
    (.build builder)))


(defn cfn-client-vpn-endpoint-tag-specification-property-builder
  "The cfn-client-vpn-endpoint-tag-specification-property-builder function buildes out new instances of 
CfnClientVpnEndpoint$TagSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClientVpnEndpoint$TagSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-client-vpn-route-builder
  "The cfn-client-vpn-route-builder function buildes out new instances of 
CfnClientVpnRoute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientVpnEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-vpn-endpoint-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `targetVpcSubnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-vpc-subnet-id` |"
  [stack id config]
  (let [builder (CfnClientVpnRoute$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-vpn-endpoint-id)]
      (. builder clientVpnEndpointId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :target-vpc-subnet-id)]
      (. builder targetVpcSubnetId data))
    (.build builder)))


(defn cfn-client-vpn-route-props-builder
  "The cfn-client-vpn-route-props-builder function buildes out new instances of 
CfnClientVpnRouteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientVpnEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-vpn-endpoint-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `targetVpcSubnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-vpc-subnet-id` |"
  [stack id config]
  (let [builder (CfnClientVpnRouteProps$Builder.)]
    (when-let [data (lookup-entry config id :client-vpn-endpoint-id)]
      (. builder clientVpnEndpointId data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :target-vpc-subnet-id)]
      (. builder targetVpcSubnetId data))
    (.build builder)))


(defn cfn-client-vpn-target-network-association-builder
  "The cfn-client-vpn-target-network-association-builder function buildes out new instances of 
CfnClientVpnTargetNetworkAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientVpnEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-vpn-endpoint-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnClientVpnTargetNetworkAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-vpn-endpoint-id)]
      (. builder clientVpnEndpointId data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-client-vpn-target-network-association-props-builder
  "The cfn-client-vpn-target-network-association-props-builder function buildes out new instances of 
CfnClientVpnTargetNetworkAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientVpnEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-vpn-endpoint-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnClientVpnTargetNetworkAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :client-vpn-endpoint-id)]
      (. builder clientVpnEndpointId data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-customer-gateway-builder
  "The cfn-customer-gateway-builder function buildes out new instances of 
CfnCustomerGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bgpAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bgp-asn` |
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCustomerGateway$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bgp-asn)]
      (. builder bgpAsn data))
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :ip-address)]
      (. builder ipAddress data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-customer-gateway-props-builder
  "The cfn-customer-gateway-props-builder function buildes out new instances of 
CfnCustomerGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bgpAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bgp-asn` |
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnCustomerGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :bgp-asn)]
      (. builder bgpAsn data))
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :ip-address)]
      (. builder ipAddress data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-dhcp-options-builder
  "The cfn-dhcp-options-builder function buildes out new instances of 
CfnDHCPOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainNameServers` | java.util.List | [[cdk.support/lookup-entry]] | `:domain-name-servers` |
| `ipv6AddressPreferredLeaseTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-address-preferred-lease-time` |
| `netbiosNameServers` | java.util.List | [[cdk.support/lookup-entry]] | `:netbios-name-servers` |
| `netbiosNodeType` | java.lang.Number | [[cdk.support/lookup-entry]] | `:netbios-node-type` |
| `ntpServers` | java.util.List | [[cdk.support/lookup-entry]] | `:ntp-servers` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDHCPOptions$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-name-servers)]
      (. builder domainNameServers data))
    (when-let [data (lookup-entry config id :ipv6-address-preferred-lease-time)]
      (. builder ipv6AddressPreferredLeaseTime data))
    (when-let [data (lookup-entry config id :netbios-name-servers)]
      (. builder netbiosNameServers data))
    (when-let [data (lookup-entry config id :netbios-node-type)]
      (. builder netbiosNodeType data))
    (when-let [data (lookup-entry config id :ntp-servers)]
      (. builder ntpServers data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dhcp-options-props-builder
  "The cfn-dhcp-options-props-builder function buildes out new instances of 
CfnDHCPOptionsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainNameServers` | java.util.List | [[cdk.support/lookup-entry]] | `:domain-name-servers` |
| `ipv6AddressPreferredLeaseTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-address-preferred-lease-time` |
| `netbiosNameServers` | java.util.List | [[cdk.support/lookup-entry]] | `:netbios-name-servers` |
| `netbiosNodeType` | java.lang.Number | [[cdk.support/lookup-entry]] | `:netbios-node-type` |
| `ntpServers` | java.util.List | [[cdk.support/lookup-entry]] | `:ntp-servers` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDHCPOptionsProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-name-servers)]
      (. builder domainNameServers data))
    (when-let [data (lookup-entry config id :ipv6-address-preferred-lease-time)]
      (. builder ipv6AddressPreferredLeaseTime data))
    (when-let [data (lookup-entry config id :netbios-name-servers)]
      (. builder netbiosNameServers data))
    (when-let [data (lookup-entry config id :netbios-node-type)]
      (. builder netbiosNodeType data))
    (when-let [data (lookup-entry config id :ntp-servers)]
      (. builder ntpServers data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ec2-fleet-accelerator-count-request-property-builder
  "The cfn-ec2-fleet-accelerator-count-request-property-builder function buildes out new instances of 
CfnEC2Fleet$AcceleratorCountRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$AcceleratorCountRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-ec2-fleet-accelerator-total-memory-mi-b-request-property-builder
  "The cfn-ec2-fleet-accelerator-total-memory-mi-b-request-property-builder function buildes out new instances of 
CfnEC2Fleet$AcceleratorTotalMemoryMiBRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$AcceleratorTotalMemoryMiBRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-ec2-fleet-baseline-ebs-bandwidth-mbps-request-property-builder
  "The cfn-ec2-fleet-baseline-ebs-bandwidth-mbps-request-property-builder function buildes out new instances of 
CfnEC2Fleet$BaselineEbsBandwidthMbpsRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$BaselineEbsBandwidthMbpsRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-ec2-fleet-builder
  "The cfn-ec2-fleet-builder function buildes out new instances of 
CfnEC2Fleet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `context` | java.lang.String | [[cdk.support/lookup-entry]] | `:context` |
| `excessCapacityTerminationPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:excess-capacity-termination-policy` |
| `launchTemplateConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template-configs` |
| `onDemandOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:on-demand-options` |
| `replaceUnhealthyInstances` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-unhealthy-instances` |
| `spotOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spot-options` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `targetCapacitySpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-capacity-specification` |
| `terminateInstancesWithExpiration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:terminate-instances-with-expiration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `validFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:valid-from` |
| `validUntil` | java.lang.String | [[cdk.support/lookup-entry]] | `:valid-until` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :context)]
      (. builder context data))
    (when-let [data (lookup-entry config id :excess-capacity-termination-policy)]
      (. builder excessCapacityTerminationPolicy data))
    (when-let [data (lookup-entry config id :launch-template-configs)]
      (. builder launchTemplateConfigs data))
    (when-let [data (lookup-entry config id :on-demand-options)]
      (. builder onDemandOptions data))
    (when-let [data (lookup-entry config id :replace-unhealthy-instances)]
      (. builder replaceUnhealthyInstances data))
    (when-let [data (lookup-entry config id :spot-options)]
      (. builder spotOptions data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :target-capacity-specification)]
      (. builder targetCapacitySpecification data))
    (when-let [data (lookup-entry config id :terminate-instances-with-expiration)]
      (. builder terminateInstancesWithExpiration data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :valid-from)]
      (. builder validFrom data))
    (when-let [data (lookup-entry config id :valid-until)]
      (. builder validUntil data))
    (.build builder)))


(defn cfn-ec2-fleet-capacity-rebalance-property-builder
  "The cfn-ec2-fleet-capacity-rebalance-property-builder function buildes out new instances of 
CfnEC2Fleet$CapacityRebalanceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replacementStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:replacement-strategy` |
| `terminationDelay` | java.lang.Number | [[cdk.support/lookup-entry]] | `:termination-delay` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$CapacityRebalanceProperty$Builder.)]
    (when-let [data (lookup-entry config id :replacement-strategy)]
      (. builder replacementStrategy data))
    (when-let [data (lookup-entry config id :termination-delay)]
      (. builder terminationDelay data))
    (.build builder)))


(defn cfn-ec2-fleet-capacity-reservation-options-request-property-builder
  "The cfn-ec2-fleet-capacity-reservation-options-request-property-builder function buildes out new instances of 
CfnEC2Fleet$CapacityReservationOptionsRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `usageStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:usage-strategy` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$CapacityReservationOptionsRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :usage-strategy)]
      (. builder usageStrategy data))
    (.build builder)))


(defn cfn-ec2-fleet-fleet-launch-template-config-request-property-builder
  "The cfn-ec2-fleet-fleet-launch-template-config-request-property-builder function buildes out new instances of 
CfnEC2Fleet$FleetLaunchTemplateConfigRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateSpecification` | software.amazon.awscdk.services.ec2.CfnEC2Fleet$FleetLaunchTemplateSpecificationRequestProperty | [[cdk.support/lookup-entry]] | `:launch-template-specification` |
| `overrides` | java.util.List | [[cdk.support/lookup-entry]] | `:overrides` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$FleetLaunchTemplateConfigRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-specification)]
      (. builder launchTemplateSpecification data))
    (when-let [data (lookup-entry config id :overrides)]
      (. builder overrides data))
    (.build builder)))


(defn cfn-ec2-fleet-fleet-launch-template-overrides-request-property-builder
  "The cfn-ec2-fleet-fleet-launch-template-overrides-request-property-builder function buildes out new instances of 
CfnEC2Fleet$FleetLaunchTemplateOverridesRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `instanceRequirements` | software.amazon.awscdk.services.ec2.CfnEC2Fleet$InstanceRequirementsRequestProperty | [[cdk.support/lookup-entry]] | `:instance-requirements` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `maxPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-price` |
| `placement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `weightedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weighted-capacity` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$FleetLaunchTemplateOverridesRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :instance-requirements)]
      (. builder instanceRequirements data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :max-price)]
      (. builder maxPrice data))
    (when-let [data (lookup-entry config id :placement)]
      (. builder placement data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :weighted-capacity)]
      (. builder weightedCapacity data))
    (.build builder)))


(defn cfn-ec2-fleet-fleet-launch-template-specification-request-property-builder
  "The cfn-ec2-fleet-fleet-launch-template-specification-request-property-builder function buildes out new instances of 
CfnEC2Fleet$FleetLaunchTemplateSpecificationRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$FleetLaunchTemplateSpecificationRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-id)]
      (. builder launchTemplateId data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-ec2-fleet-instance-requirements-request-property-builder
  "The cfn-ec2-fleet-instance-requirements-request-property-builder function buildes out new instances of 
CfnEC2Fleet$InstanceRequirementsRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorCount` | software.amazon.awscdk.services.ec2.CfnEC2Fleet$AcceleratorCountRequestProperty | [[cdk.support/lookup-entry]] | `:accelerator-count` |
| `acceleratorManufacturers` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-manufacturers` |
| `acceleratorNames` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-names` |
| `acceleratorTotalMemoryMiB` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:accelerator-total-memory-mi-b` |
| `acceleratorTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-types` |
| `allowedInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-instance-types` |
| `bareMetal` | java.lang.String | [[cdk.support/lookup-entry]] | `:bare-metal` |
| `baselineEbsBandwidthMbps` | software.amazon.awscdk.services.ec2.CfnEC2Fleet$BaselineEbsBandwidthMbpsRequestProperty | [[cdk.support/lookup-entry]] | `:baseline-ebs-bandwidth-mbps` |
| `burstablePerformance` | java.lang.String | [[cdk.support/lookup-entry]] | `:burstable-performance` |
| `cpuManufacturers` | java.util.List | [[cdk.support/lookup-entry]] | `:cpu-manufacturers` |
| `excludedInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-instance-types` |
| `instanceGenerations` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-generations` |
| `localStorage` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-storage` |
| `localStorageTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:local-storage-types` |
| `maxSpotPriceAsPercentageOfOptimalOnDemandPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-spot-price-as-percentage-of-optimal-on-demand-price` |
| `memoryGiBPerVCpu` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:memory-gi-b-per-v-cpu` |
| `memoryMiB` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:memory-mi-b` |
| `networkBandwidthGbps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-bandwidth-gbps` |
| `networkInterfaceCount` | software.amazon.awscdk.services.ec2.CfnEC2Fleet$NetworkInterfaceCountRequestProperty | [[cdk.support/lookup-entry]] | `:network-interface-count` |
| `onDemandMaxPricePercentageOverLowestPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:on-demand-max-price-percentage-over-lowest-price` |
| `requireHibernateSupport` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-hibernate-support` |
| `spotMaxPricePercentageOverLowestPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:spot-max-price-percentage-over-lowest-price` |
| `totalLocalStorageGb` | software.amazon.awscdk.services.ec2.CfnEC2Fleet$TotalLocalStorageGBRequestProperty | [[cdk.support/lookup-entry]] | `:total-local-storage-gb` |
| `vCpuCount` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:v-cpu-count` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$InstanceRequirementsRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :accelerator-count)]
      (. builder acceleratorCount data))
    (when-let [data (lookup-entry config id :accelerator-manufacturers)]
      (. builder acceleratorManufacturers data))
    (when-let [data (lookup-entry config id :accelerator-names)]
      (. builder acceleratorNames data))
    (when-let [data (lookup-entry config id :accelerator-total-memory-mi-b)]
      (. builder acceleratorTotalMemoryMiB data))
    (when-let [data (lookup-entry config id :accelerator-types)]
      (. builder acceleratorTypes data))
    (when-let [data (lookup-entry config id :allowed-instance-types)]
      (. builder allowedInstanceTypes data))
    (when-let [data (lookup-entry config id :bare-metal)]
      (. builder bareMetal data))
    (when-let [data (lookup-entry config id :baseline-ebs-bandwidth-mbps)]
      (. builder baselineEbsBandwidthMbps data))
    (when-let [data (lookup-entry config id :burstable-performance)]
      (. builder burstablePerformance data))
    (when-let [data (lookup-entry config id :cpu-manufacturers)]
      (. builder cpuManufacturers data))
    (when-let [data (lookup-entry config id :excluded-instance-types)]
      (. builder excludedInstanceTypes data))
    (when-let [data (lookup-entry config id :instance-generations)]
      (. builder instanceGenerations data))
    (when-let [data (lookup-entry config id :local-storage)]
      (. builder localStorage data))
    (when-let [data (lookup-entry config id :local-storage-types)]
      (. builder localStorageTypes data))
    (when-let [data (lookup-entry config id :max-spot-price-as-percentage-of-optimal-on-demand-price)]
      (. builder maxSpotPriceAsPercentageOfOptimalOnDemandPrice data))
    (when-let [data (lookup-entry config id :memory-gi-b-per-v-cpu)]
      (. builder memoryGiBPerVCpu data))
    (when-let [data (lookup-entry config id :memory-mi-b)]
      (. builder memoryMiB data))
    (when-let [data (lookup-entry config id :network-bandwidth-gbps)]
      (. builder networkBandwidthGbps data))
    (when-let [data (lookup-entry config id :network-interface-count)]
      (. builder networkInterfaceCount data))
    (when-let [data (lookup-entry config id :on-demand-max-price-percentage-over-lowest-price)]
      (. builder onDemandMaxPricePercentageOverLowestPrice data))
    (when-let [data (lookup-entry config id :require-hibernate-support)]
      (. builder requireHibernateSupport data))
    (when-let [data (lookup-entry config id :spot-max-price-percentage-over-lowest-price)]
      (. builder spotMaxPricePercentageOverLowestPrice data))
    (when-let [data (lookup-entry config id :total-local-storage-gb)]
      (. builder totalLocalStorageGb data))
    (when-let [data (lookup-entry config id :v-cpu-count)]
      (. builder vCpuCount data))
    (.build builder)))


(defn cfn-ec2-fleet-maintenance-strategies-property-builder
  "The cfn-ec2-fleet-maintenance-strategies-property-builder function buildes out new instances of 
CfnEC2Fleet$MaintenanceStrategiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityRebalance` | software.amazon.awscdk.services.ec2.CfnEC2Fleet$CapacityRebalanceProperty | [[cdk.support/lookup-entry]] | `:capacity-rebalance` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$MaintenanceStrategiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :capacity-rebalance)]
      (. builder capacityRebalance data))
    (.build builder)))


(defn cfn-ec2-fleet-memory-gi-b-per-v-cpu-request-property-builder
  "The cfn-ec2-fleet-memory-gi-b-per-v-cpu-request-property-builder function buildes out new instances of 
CfnEC2Fleet$MemoryGiBPerVCpuRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$MemoryGiBPerVCpuRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-ec2-fleet-memory-mi-b-request-property-builder
  "The cfn-ec2-fleet-memory-mi-b-request-property-builder function buildes out new instances of 
CfnEC2Fleet$MemoryMiBRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$MemoryMiBRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-ec2-fleet-network-bandwidth-gbps-request-property-builder
  "The cfn-ec2-fleet-network-bandwidth-gbps-request-property-builder function buildes out new instances of 
CfnEC2Fleet$NetworkBandwidthGbpsRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$NetworkBandwidthGbpsRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-ec2-fleet-network-interface-count-request-property-builder
  "The cfn-ec2-fleet-network-interface-count-request-property-builder function buildes out new instances of 
CfnEC2Fleet$NetworkInterfaceCountRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$NetworkInterfaceCountRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-ec2-fleet-on-demand-options-request-property-builder
  "The cfn-ec2-fleet-on-demand-options-request-property-builder function buildes out new instances of 
CfnEC2Fleet$OnDemandOptionsRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
| `capacityReservationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capacity-reservation-options` |
| `maxTotalPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-total-price` |
| `minTargetCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-target-capacity` |
| `singleAvailabilityZone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:single-availability-zone` |
| `singleInstanceType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:single-instance-type` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$OnDemandOptionsRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :capacity-reservation-options)]
      (. builder capacityReservationOptions data))
    (when-let [data (lookup-entry config id :max-total-price)]
      (. builder maxTotalPrice data))
    (when-let [data (lookup-entry config id :min-target-capacity)]
      (. builder minTargetCapacity data))
    (when-let [data (lookup-entry config id :single-availability-zone)]
      (. builder singleAvailabilityZone data))
    (when-let [data (lookup-entry config id :single-instance-type)]
      (. builder singleInstanceType data))
    (.build builder)))


(defn cfn-ec2-fleet-placement-property-builder
  "The cfn-ec2-fleet-placement-property-builder function buildes out new instances of 
CfnEC2Fleet$PlacementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `affinity` | java.lang.String | [[cdk.support/lookup-entry]] | `:affinity` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `hostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-id` |
| `hostResourceGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-resource-group-arn` |
| `partitionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:partition-number` |
| `spreadDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:spread-domain` |
| `tenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenancy` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$PlacementProperty$Builder.)]
    (when-let [data (lookup-entry config id :affinity)]
      (. builder affinity data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :host-id)]
      (. builder hostId data))
    (when-let [data (lookup-entry config id :host-resource-group-arn)]
      (. builder hostResourceGroupArn data))
    (when-let [data (lookup-entry config id :partition-number)]
      (. builder partitionNumber data))
    (when-let [data (lookup-entry config id :spread-domain)]
      (. builder spreadDomain data))
    (when-let [data (lookup-entry config id :tenancy)]
      (. builder tenancy data))
    (.build builder)))


(defn cfn-ec2-fleet-props-builder
  "The cfn-ec2-fleet-props-builder function buildes out new instances of 
CfnEC2FleetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `context` | java.lang.String | [[cdk.support/lookup-entry]] | `:context` |
| `excessCapacityTerminationPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:excess-capacity-termination-policy` |
| `launchTemplateConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template-configs` |
| `onDemandOptions` | software.amazon.awscdk.services.ec2.CfnEC2Fleet$OnDemandOptionsRequestProperty | [[cdk.support/lookup-entry]] | `:on-demand-options` |
| `replaceUnhealthyInstances` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-unhealthy-instances` |
| `spotOptions` | software.amazon.awscdk.services.ec2.CfnEC2Fleet$SpotOptionsRequestProperty | [[cdk.support/lookup-entry]] | `:spot-options` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `targetCapacitySpecification` | software.amazon.awscdk.services.ec2.CfnEC2Fleet$TargetCapacitySpecificationRequestProperty | [[cdk.support/lookup-entry]] | `:target-capacity-specification` |
| `terminateInstancesWithExpiration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-instances-with-expiration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `validFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:valid-from` |
| `validUntil` | java.lang.String | [[cdk.support/lookup-entry]] | `:valid-until` |"
  [stack id config]
  (let [builder (CfnEC2FleetProps$Builder.)]
    (when-let [data (lookup-entry config id :context)]
      (. builder context data))
    (when-let [data (lookup-entry config id :excess-capacity-termination-policy)]
      (. builder excessCapacityTerminationPolicy data))
    (when-let [data (lookup-entry config id :launch-template-configs)]
      (. builder launchTemplateConfigs data))
    (when-let [data (lookup-entry config id :on-demand-options)]
      (. builder onDemandOptions data))
    (when-let [data (lookup-entry config id :replace-unhealthy-instances)]
      (. builder replaceUnhealthyInstances data))
    (when-let [data (lookup-entry config id :spot-options)]
      (. builder spotOptions data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :target-capacity-specification)]
      (. builder targetCapacitySpecification data))
    (when-let [data (lookup-entry config id :terminate-instances-with-expiration)]
      (. builder terminateInstancesWithExpiration data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :valid-from)]
      (. builder validFrom data))
    (when-let [data (lookup-entry config id :valid-until)]
      (. builder validUntil data))
    (.build builder)))


(defn cfn-ec2-fleet-spot-options-request-property-builder
  "The cfn-ec2-fleet-spot-options-request-property-builder function buildes out new instances of 
CfnEC2Fleet$SpotOptionsRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
| `instanceInterruptionBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-interruption-behavior` |
| `instancePoolsToUseCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-pools-to-use-count` |
| `maintenanceStrategies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maintenance-strategies` |
| `maxTotalPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-total-price` |
| `minTargetCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-target-capacity` |
| `singleAvailabilityZone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:single-availability-zone` |
| `singleInstanceType` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:single-instance-type` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$SpotOptionsRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :instance-interruption-behavior)]
      (. builder instanceInterruptionBehavior data))
    (when-let [data (lookup-entry config id :instance-pools-to-use-count)]
      (. builder instancePoolsToUseCount data))
    (when-let [data (lookup-entry config id :maintenance-strategies)]
      (. builder maintenanceStrategies data))
    (when-let [data (lookup-entry config id :max-total-price)]
      (. builder maxTotalPrice data))
    (when-let [data (lookup-entry config id :min-target-capacity)]
      (. builder minTargetCapacity data))
    (when-let [data (lookup-entry config id :single-availability-zone)]
      (. builder singleAvailabilityZone data))
    (when-let [data (lookup-entry config id :single-instance-type)]
      (. builder singleInstanceType data))
    (.build builder)))


(defn cfn-ec2-fleet-tag-specification-property-builder
  "The cfn-ec2-fleet-tag-specification-property-builder function buildes out new instances of 
CfnEC2Fleet$TagSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$TagSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ec2-fleet-target-capacity-specification-request-property-builder
  "The cfn-ec2-fleet-target-capacity-specification-request-property-builder function buildes out new instances of 
CfnEC2Fleet$TargetCapacitySpecificationRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultTargetCapacityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-target-capacity-type` |
| `onDemandTargetCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:on-demand-target-capacity` |
| `spotTargetCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:spot-target-capacity` |
| `targetCapacityUnitType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-capacity-unit-type` |
| `totalTargetCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-target-capacity` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$TargetCapacitySpecificationRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-target-capacity-type)]
      (. builder defaultTargetCapacityType data))
    (when-let [data (lookup-entry config id :on-demand-target-capacity)]
      (. builder onDemandTargetCapacity data))
    (when-let [data (lookup-entry config id :spot-target-capacity)]
      (. builder spotTargetCapacity data))
    (when-let [data (lookup-entry config id :target-capacity-unit-type)]
      (. builder targetCapacityUnitType data))
    (when-let [data (lookup-entry config id :total-target-capacity)]
      (. builder totalTargetCapacity data))
    (.build builder)))


(defn cfn-ec2-fleet-total-local-storage-gb-request-property-builder
  "The cfn-ec2-fleet-total-local-storage-gb-request-property-builder function buildes out new instances of 
CfnEC2Fleet$TotalLocalStorageGBRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$TotalLocalStorageGBRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-ec2-fleet-v-cpu-count-range-request-property-builder
  "The cfn-ec2-fleet-v-cpu-count-range-request-property-builder function buildes out new instances of 
CfnEC2Fleet$VCpuCountRangeRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnEC2Fleet$VCpuCountRangeRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-egress-only-internet-gateway-builder
  "The cfn-egress-only-internet-gateway-builder function buildes out new instances of 
CfnEgressOnlyInternetGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnEgressOnlyInternetGateway$Builder/create stack id)]
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-egress-only-internet-gateway-props-builder
  "The cfn-egress-only-internet-gateway-props-builder function buildes out new instances of 
CfnEgressOnlyInternetGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnEgressOnlyInternetGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-eip-association-builder
  "The cfn-eip-association-builder function buildes out new instances of 
CfnEIPAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-id` |
| `eip` | java.lang.String | [[cdk.support/lookup-entry]] | `:eip` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |"
  [stack id config]
  (let [builder (CfnEIPAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allocation-id)]
      (. builder allocationId data))
    (when-let [data (lookup-entry config id :eip)]
      (. builder eip data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (.build builder)))


(defn cfn-eip-association-props-builder
  "The cfn-eip-association-props-builder function buildes out new instances of 
CfnEIPAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-id` |
| `eip` | java.lang.String | [[cdk.support/lookup-entry]] | `:eip` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |"
  [stack id config]
  (let [builder (CfnEIPAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :allocation-id)]
      (. builder allocationId data))
    (when-let [data (lookup-entry config id :eip)]
      (. builder eip data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (.build builder)))


(defn cfn-eip-builder
  "The cfn-eip-builder function buildes out new instances of 
CfnEIP$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `networkBorderGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-border-group` |
| `publicIpv4Pool` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-ipv4-pool` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transferAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:transfer-address` |"
  [stack id config]
  (let [builder (CfnEIP$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :network-border-group)]
      (. builder networkBorderGroup data))
    (when-let [data (lookup-entry config id :public-ipv4-pool)]
      (. builder publicIpv4Pool data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transfer-address)]
      (. builder transferAddress data))
    (.build builder)))


(defn cfn-eip-props-builder
  "The cfn-eip-props-builder function buildes out new instances of 
CfnEIPProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `networkBorderGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-border-group` |
| `publicIpv4Pool` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-ipv4-pool` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transferAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:transfer-address` |"
  [stack id config]
  (let [builder (CfnEIPProps$Builder.)]
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :network-border-group)]
      (. builder networkBorderGroup data))
    (when-let [data (lookup-entry config id :public-ipv4-pool)]
      (. builder publicIpv4Pool data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transfer-address)]
      (. builder transferAddress data))
    (.build builder)))


(defn cfn-enclave-certificate-iam-role-association-builder
  "The cfn-enclave-certificate-iam-role-association-builder function buildes out new instances of 
CfnEnclaveCertificateIamRoleAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnEnclaveCertificateIamRoleAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-enclave-certificate-iam-role-association-props-builder
  "The cfn-enclave-certificate-iam-role-association-props-builder function buildes out new instances of 
CfnEnclaveCertificateIamRoleAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnEnclaveCertificateIamRoleAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-flow-log-builder
  "The cfn-flow-log-builder function buildes out new instances of 
CfnFlowLog$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliverCrossAccountRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:deliver-cross-account-role` |
| `deliverLogsPermissionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:deliver-logs-permission-arn` |
| `destinationOptions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:destination-options` |
| `logDestination` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-destination` |
| `logDestinationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-destination-type` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `maxAggregationInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-aggregation-interval` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trafficType` | java.lang.String | [[cdk.support/lookup-entry]] | `:traffic-type` |"
  [stack id config]
  (let [builder (CfnFlowLog$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deliver-cross-account-role)]
      (. builder deliverCrossAccountRole data))
    (when-let [data (lookup-entry config id :deliver-logs-permission-arn)]
      (. builder deliverLogsPermissionArn data))
    (when-let [data (lookup-entry config id :destination-options)]
      (. builder destinationOptions data))
    (when-let [data (lookup-entry config id :log-destination)]
      (. builder logDestination data))
    (when-let [data (lookup-entry config id :log-destination-type)]
      (. builder logDestinationType data))
    (when-let [data (lookup-entry config id :log-format)]
      (. builder logFormat data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :max-aggregation-interval)]
      (. builder maxAggregationInterval data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :traffic-type)]
      (. builder trafficType data))
    (.build builder)))


(defn cfn-flow-log-destination-options-property-builder
  "The cfn-flow-log-destination-options-property-builder function buildes out new instances of 
CfnFlowLog$DestinationOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-format` |
| `hiveCompatiblePartitions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:hive-compatible-partitions` |
| `perHourPartition` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:per-hour-partition` |"
  [stack id config]
  (let [builder (CfnFlowLog$DestinationOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :file-format)]
      (. builder fileFormat data))
    (when-let [data (lookup-entry config id :hive-compatible-partitions)]
      (. builder hiveCompatiblePartitions data))
    (when-let [data (lookup-entry config id :per-hour-partition)]
      (. builder perHourPartition data))
    (.build builder)))


(defn cfn-flow-log-props-builder
  "The cfn-flow-log-props-builder function buildes out new instances of 
CfnFlowLogProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliverCrossAccountRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:deliver-cross-account-role` |
| `deliverLogsPermissionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:deliver-logs-permission-arn` |
| `destinationOptions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:destination-options` |
| `logDestination` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-destination` |
| `logDestinationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-destination-type` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `maxAggregationInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-aggregation-interval` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trafficType` | java.lang.String | [[cdk.support/lookup-entry]] | `:traffic-type` |"
  [stack id config]
  (let [builder (CfnFlowLogProps$Builder.)]
    (when-let [data (lookup-entry config id :deliver-cross-account-role)]
      (. builder deliverCrossAccountRole data))
    (when-let [data (lookup-entry config id :deliver-logs-permission-arn)]
      (. builder deliverLogsPermissionArn data))
    (when-let [data (lookup-entry config id :destination-options)]
      (. builder destinationOptions data))
    (when-let [data (lookup-entry config id :log-destination)]
      (. builder logDestination data))
    (when-let [data (lookup-entry config id :log-destination-type)]
      (. builder logDestinationType data))
    (when-let [data (lookup-entry config id :log-format)]
      (. builder logFormat data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :max-aggregation-interval)]
      (. builder maxAggregationInterval data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :traffic-type)]
      (. builder trafficType data))
    (.build builder)))


(defn cfn-gateway-route-table-association-builder
  "The cfn-gateway-route-table-association-builder function buildes out new instances of 
CfnGatewayRouteTableAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-id` |
| `routeTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-table-id` |"
  [stack id config]
  (let [builder (CfnGatewayRouteTableAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :gateway-id)]
      (. builder gatewayId data))
    (when-let [data (lookup-entry config id :route-table-id)]
      (. builder routeTableId data))
    (.build builder)))


(defn cfn-gateway-route-table-association-props-builder
  "The cfn-gateway-route-table-association-props-builder function buildes out new instances of 
CfnGatewayRouteTableAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-id` |
| `routeTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-table-id` |"
  [stack id config]
  (let [builder (CfnGatewayRouteTableAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :gateway-id)]
      (. builder gatewayId data))
    (when-let [data (lookup-entry config id :route-table-id)]
      (. builder routeTableId data))
    (.build builder)))


(defn cfn-host-builder
  "The cfn-host-builder function buildes out new instances of 
CfnHost$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-id` |
| `autoPlacement` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-placement` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `hostMaintenance` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-maintenance` |
| `hostRecovery` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-recovery` |
| `instanceFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-family` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |"
  [stack id config]
  (let [builder (CfnHost$Builder/create stack id)]
    (when-let [data (lookup-entry config id :asset-id)]
      (. builder assetId data))
    (when-let [data (lookup-entry config id :auto-placement)]
      (. builder autoPlacement data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :host-maintenance)]
      (. builder hostMaintenance data))
    (when-let [data (lookup-entry config id :host-recovery)]
      (. builder hostRecovery data))
    (when-let [data (lookup-entry config id :instance-family)]
      (. builder instanceFamily data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :outpost-arn)]
      (. builder outpostArn data))
    (.build builder)))


(defn cfn-host-props-builder
  "The cfn-host-props-builder function buildes out new instances of 
CfnHostProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-id` |
| `autoPlacement` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-placement` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `hostMaintenance` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-maintenance` |
| `hostRecovery` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-recovery` |
| `instanceFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-family` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |"
  [stack id config]
  (let [builder (CfnHostProps$Builder.)]
    (when-let [data (lookup-entry config id :asset-id)]
      (. builder assetId data))
    (when-let [data (lookup-entry config id :auto-placement)]
      (. builder autoPlacement data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :host-maintenance)]
      (. builder hostMaintenance data))
    (when-let [data (lookup-entry config id :host-recovery)]
      (. builder hostRecovery data))
    (when-let [data (lookup-entry config id :instance-family)]
      (. builder instanceFamily data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :outpost-arn)]
      (. builder outpostArn data))
    (.build builder)))


(defn cfn-instance-association-parameter-property-builder
  "The cfn-instance-association-parameter-property-builder function buildes out new instances of 
CfnInstance$AssociationParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.util.List | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnInstance$AssociationParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-instance-block-device-mapping-property-builder
  "The cfn-instance-block-device-mapping-property-builder function buildes out new instances of 
CfnInstance$BlockDeviceMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `ebs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs` |
| `noDevice` | software.amazon.awscdk.services.ec2.CfnInstance$NoDeviceProperty | [[cdk.support/lookup-entry]] | `:no-device` |
| `virtualName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-name` |"
  [stack id config]
  (let [builder (CfnInstance$BlockDeviceMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :ebs)]
      (. builder ebs data))
    (when-let [data (lookup-entry config id :no-device)]
      (. builder noDevice data))
    (when-let [data (lookup-entry config id :virtual-name)]
      (. builder virtualName data))
    (.build builder)))


(defn cfn-instance-builder
  "The cfn-instance-builder function buildes out new instances of 
CfnInstance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-info` |
| `affinity` | java.lang.String | [[cdk.support/lookup-entry]] | `:affinity` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `blockDeviceMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `cpuOptions` | software.amazon.awscdk.services.ec2.CfnInstance$CpuOptionsProperty | [[cdk.support/lookup-entry]] | `:cpu-options` |
| `creditSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:credit-specification` |
| `disableApiTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-api-termination` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `elasticGpuSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:elastic-gpu-specifications` |
| `elasticInferenceAccelerators` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:elastic-inference-accelerators` |
| `enclaveOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enclave-options` |
| `hibernationOptions` | software.amazon.awscdk.services.ec2.CfnInstance$HibernationOptionsProperty | [[cdk.support/lookup-entry]] | `:hibernation-options` |
| `hostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-id` |
| `hostResourceGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-resource-group-arn` |
| `iamInstanceProfile` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-instance-profile` |
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `instanceInitiatedShutdownBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-initiated-shutdown-behavior` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `ipv6AddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-address-count` |
| `ipv6Addresses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ipv6-addresses` |
| `kernelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kernel-id` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `launchTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template` |
| `licenseSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:license-specifications` |
| `monitoring` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring` |
| `networkInterfaces` | java.util.List | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `placementGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-group-name` |
| `privateDnsNameOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-dns-name-options` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `propagateTagsToVolumeOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags-to-volume-on-creation` |
| `ramdiskId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ramdisk-id` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `sourceDestCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-dest-check` |
| `ssmAssociations` | java.util.List | [[cdk.support/lookup-entry]] | `:ssm-associations` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenancy` |
| `userData` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (CfnInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-info)]
      (. builder additionalInfo data))
    (when-let [data (lookup-entry config id :affinity)]
      (. builder affinity data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :block-device-mappings)]
      (. builder blockDeviceMappings data))
    (when-let [data (lookup-entry config id :cpu-options)]
      (. builder cpuOptions data))
    (when-let [data (lookup-entry config id :credit-specification)]
      (. builder creditSpecification data))
    (when-let [data (lookup-entry config id :disable-api-termination)]
      (. builder disableApiTermination data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :elastic-gpu-specifications)]
      (. builder elasticGpuSpecifications data))
    (when-let [data (lookup-entry config id :elastic-inference-accelerators)]
      (. builder elasticInferenceAccelerators data))
    (when-let [data (lookup-entry config id :enclave-options)]
      (. builder enclaveOptions data))
    (when-let [data (lookup-entry config id :hibernation-options)]
      (. builder hibernationOptions data))
    (when-let [data (lookup-entry config id :host-id)]
      (. builder hostId data))
    (when-let [data (lookup-entry config id :host-resource-group-arn)]
      (. builder hostResourceGroupArn data))
    (when-let [data (lookup-entry config id :iam-instance-profile)]
      (. builder iamInstanceProfile data))
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (lookup-entry config id :instance-initiated-shutdown-behavior)]
      (. builder instanceInitiatedShutdownBehavior data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :ipv6-address-count)]
      (. builder ipv6AddressCount data))
    (when-let [data (lookup-entry config id :ipv6-addresses)]
      (. builder ipv6Addresses data))
    (when-let [data (lookup-entry config id :kernel-id)]
      (. builder kernelId data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :license-specifications)]
      (. builder licenseSpecifications data))
    (when-let [data (lookup-entry config id :monitoring)]
      (. builder monitoring data))
    (when-let [data (lookup-entry config id :network-interfaces)]
      (. builder networkInterfaces data))
    (when-let [data (lookup-entry config id :placement-group-name)]
      (. builder placementGroupName data))
    (when-let [data (lookup-entry config id :private-dns-name-options)]
      (. builder privateDnsNameOptions data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :propagate-tags-to-volume-on-creation)]
      (. builder propagateTagsToVolumeOnCreation data))
    (when-let [data (lookup-entry config id :ramdisk-id)]
      (. builder ramdiskId data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :source-dest-check)]
      (. builder sourceDestCheck data))
    (when-let [data (lookup-entry config id :ssm-associations)]
      (. builder ssmAssociations data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tenancy)]
      (. builder tenancy data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn cfn-instance-connect-endpoint-builder
  "The cfn-instance-connect-endpoint-builder function buildes out new instances of 
CfnInstanceConnectEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `preserveClientIp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInstanceConnectEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-token)]
      (. builder clientToken data))
    (when-let [data (lookup-entry config id :preserve-client-ip)]
      (. builder preserveClientIp data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-instance-connect-endpoint-props-builder
  "The cfn-instance-connect-endpoint-props-builder function buildes out new instances of 
CfnInstanceConnectEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `preserveClientIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:preserve-client-ip` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInstanceConnectEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :client-token)]
      (. builder clientToken data))
    (when-let [data (lookup-entry config id :preserve-client-ip)]
      (. builder preserveClientIp data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-instance-cpu-options-property-builder
  "The cfn-instance-cpu-options-property-builder function buildes out new instances of 
CfnInstance$CpuOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:core-count` |
| `threadsPerCore` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threads-per-core` |"
  [stack id config]
  (let [builder (CfnInstance$CpuOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :core-count)]
      (. builder coreCount data))
    (when-let [data (lookup-entry config id :threads-per-core)]
      (. builder threadsPerCore data))
    (.build builder)))


(defn cfn-instance-credit-specification-property-builder
  "The cfn-instance-credit-specification-property-builder function buildes out new instances of 
CfnInstance$CreditSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuCredits` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu-credits` |"
  [stack id config]
  (let [builder (CfnInstance$CreditSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cpu-credits)]
      (. builder cpuCredits data))
    (.build builder)))


(defn cfn-instance-ebs-property-builder
  "The cfn-instance-ebs-property-builder function buildes out new instances of 
CfnInstance$EbsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `encrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnInstance$EbsProperty$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-instance-elastic-gpu-specification-property-builder
  "The cfn-instance-elastic-gpu-specification-property-builder function buildes out new instances of 
CfnInstance$ElasticGpuSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnInstance$ElasticGpuSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-instance-elastic-inference-accelerator-property-builder
  "The cfn-instance-elastic-inference-accelerator-property-builder function buildes out new instances of 
CfnInstance$ElasticInferenceAcceleratorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnInstance$ElasticInferenceAcceleratorProperty$Builder.)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-instance-enclave-options-property-builder
  "The cfn-instance-enclave-options-property-builder function buildes out new instances of 
CfnInstance$EnclaveOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnInstance$EnclaveOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-instance-hibernation-options-property-builder
  "The cfn-instance-hibernation-options-property-builder function buildes out new instances of 
CfnInstance$HibernationOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configured` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:configured` |"
  [stack id config]
  (let [builder (CfnInstance$HibernationOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :configured)]
      (. builder configured data))
    (.build builder)))


(defn cfn-instance-instance-ipv6-address-property-builder
  "The cfn-instance-instance-ipv6-address-property-builder function buildes out new instances of 
CfnInstance$InstanceIpv6AddressProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv6Address` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-address` |"
  [stack id config]
  (let [builder (CfnInstance$InstanceIpv6AddressProperty$Builder.)]
    (when-let [data (lookup-entry config id :ipv6-address)]
      (. builder ipv6Address data))
    (.build builder)))


(defn cfn-instance-launch-template-specification-property-builder
  "The cfn-instance-launch-template-specification-property-builder function buildes out new instances of 
CfnInstance$LaunchTemplateSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnInstance$LaunchTemplateSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-id)]
      (. builder launchTemplateId data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-instance-license-specification-property-builder
  "The cfn-instance-license-specification-property-builder function buildes out new instances of 
CfnInstance$LicenseSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `licenseConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-configuration-arn` |"
  [stack id config]
  (let [builder (CfnInstance$LicenseSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :license-configuration-arn)]
      (. builder licenseConfigurationArn data))
    (.build builder)))


(defn cfn-instance-network-interface-property-builder
  "The cfn-instance-network-interface-property-builder function buildes out new instances of 
CfnInstance$NetworkInterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associateCarrierIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-carrier-ip-address` |
| `associatePublicIpAddress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceIndex` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-index` |
| `groupSet` | java.util.List | [[cdk.support/lookup-entry]] | `:group-set` |
| `ipv6AddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-address-count` |
| `ipv6Addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv6-addresses` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `privateIpAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:private-ip-addresses` |
| `secondaryPrivateIpAddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:secondary-private-ip-address-count` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnInstance$NetworkInterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :associate-carrier-ip-address)]
      (. builder associateCarrierIpAddress data))
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :device-index)]
      (. builder deviceIndex data))
    (when-let [data (lookup-entry config id :group-set)]
      (. builder groupSet data))
    (when-let [data (lookup-entry config id :ipv6-address-count)]
      (. builder ipv6AddressCount data))
    (when-let [data (lookup-entry config id :ipv6-addresses)]
      (. builder ipv6Addresses data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :private-ip-addresses)]
      (. builder privateIpAddresses data))
    (when-let [data (lookup-entry config id :secondary-private-ip-address-count)]
      (. builder secondaryPrivateIpAddressCount data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-instance-no-device-property-builder
  "The cfn-instance-no-device-property-builder function buildes out new instances of 
CfnInstance$NoDeviceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (CfnInstance$NoDeviceProperty$Builder.)]
    (.build builder)))


(defn cfn-instance-private-dns-name-options-property-builder
  "The cfn-instance-private-dns-name-options-property-builder function buildes out new instances of 
CfnInstance$PrivateDnsNameOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableResourceNameDnsARecord` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-resource-name-dns-a-record` |
| `enableResourceNameDnsAaaaRecord` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-resource-name-dns-aaaa-record` |
| `hostnameType` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname-type` |"
  [stack id config]
  (let [builder (CfnInstance$PrivateDnsNameOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-resource-name-dns-a-record)]
      (. builder enableResourceNameDnsARecord data))
    (when-let [data (lookup-entry config id :enable-resource-name-dns-aaaa-record)]
      (. builder enableResourceNameDnsAaaaRecord data))
    (when-let [data (lookup-entry config id :hostname-type)]
      (. builder hostnameType data))
    (.build builder)))


(defn cfn-instance-private-ip-address-specification-property-builder
  "The cfn-instance-private-ip-address-specification-property-builder function buildes out new instances of 
CfnInstance$PrivateIpAddressSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |"
  [stack id config]
  (let [builder (CfnInstance$PrivateIpAddressSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :primary)]
      (. builder primary data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (.build builder)))


(defn cfn-instance-props-builder
  "The cfn-instance-props-builder function buildes out new instances of 
CfnInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalInfo` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-info` |
| `affinity` | java.lang.String | [[cdk.support/lookup-entry]] | `:affinity` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `blockDeviceMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `cpuOptions` | software.amazon.awscdk.services.ec2.CfnInstance$CpuOptionsProperty | [[cdk.support/lookup-entry]] | `:cpu-options` |
| `creditSpecification` | software.amazon.awscdk.services.ec2.CfnInstance$CreditSpecificationProperty | [[cdk.support/lookup-entry]] | `:credit-specification` |
| `disableApiTermination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-api-termination` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `elasticGpuSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:elastic-gpu-specifications` |
| `elasticInferenceAccelerators` | java.util.List | [[cdk.support/lookup-entry]] | `:elastic-inference-accelerators` |
| `enclaveOptions` | software.amazon.awscdk.services.ec2.CfnInstance$EnclaveOptionsProperty | [[cdk.support/lookup-entry]] | `:enclave-options` |
| `hibernationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hibernation-options` |
| `hostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-id` |
| `hostResourceGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-resource-group-arn` |
| `iamInstanceProfile` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-instance-profile` |
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `instanceInitiatedShutdownBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-initiated-shutdown-behavior` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `ipv6AddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-address-count` |
| `ipv6Addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv6-addresses` |
| `kernelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kernel-id` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `launchTemplate` | software.amazon.awscdk.services.ec2.CfnInstance$LaunchTemplateSpecificationProperty | [[cdk.support/lookup-entry]] | `:launch-template` |
| `licenseSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:license-specifications` |
| `monitoring` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:monitoring` |
| `networkInterfaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `placementGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-group-name` |
| `privateDnsNameOptions` | software.amazon.awscdk.services.ec2.CfnInstance$PrivateDnsNameOptionsProperty | [[cdk.support/lookup-entry]] | `:private-dns-name-options` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `propagateTagsToVolumeOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags-to-volume-on-creation` |
| `ramdiskId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ramdisk-id` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `sourceDestCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-dest-check` |
| `ssmAssociations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ssm-associations` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenancy` |
| `userData` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |"
  [stack id config]
  (let [builder (CfnInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-info)]
      (. builder additionalInfo data))
    (when-let [data (lookup-entry config id :affinity)]
      (. builder affinity data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :block-device-mappings)]
      (. builder blockDeviceMappings data))
    (when-let [data (lookup-entry config id :cpu-options)]
      (. builder cpuOptions data))
    (when-let [data (lookup-entry config id :credit-specification)]
      (. builder creditSpecification data))
    (when-let [data (lookup-entry config id :disable-api-termination)]
      (. builder disableApiTermination data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :elastic-gpu-specifications)]
      (. builder elasticGpuSpecifications data))
    (when-let [data (lookup-entry config id :elastic-inference-accelerators)]
      (. builder elasticInferenceAccelerators data))
    (when-let [data (lookup-entry config id :enclave-options)]
      (. builder enclaveOptions data))
    (when-let [data (lookup-entry config id :hibernation-options)]
      (. builder hibernationOptions data))
    (when-let [data (lookup-entry config id :host-id)]
      (. builder hostId data))
    (when-let [data (lookup-entry config id :host-resource-group-arn)]
      (. builder hostResourceGroupArn data))
    (when-let [data (lookup-entry config id :iam-instance-profile)]
      (. builder iamInstanceProfile data))
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (lookup-entry config id :instance-initiated-shutdown-behavior)]
      (. builder instanceInitiatedShutdownBehavior data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :ipv6-address-count)]
      (. builder ipv6AddressCount data))
    (when-let [data (lookup-entry config id :ipv6-addresses)]
      (. builder ipv6Addresses data))
    (when-let [data (lookup-entry config id :kernel-id)]
      (. builder kernelId data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :license-specifications)]
      (. builder licenseSpecifications data))
    (when-let [data (lookup-entry config id :monitoring)]
      (. builder monitoring data))
    (when-let [data (lookup-entry config id :network-interfaces)]
      (. builder networkInterfaces data))
    (when-let [data (lookup-entry config id :placement-group-name)]
      (. builder placementGroupName data))
    (when-let [data (lookup-entry config id :private-dns-name-options)]
      (. builder privateDnsNameOptions data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :propagate-tags-to-volume-on-creation)]
      (. builder propagateTagsToVolumeOnCreation data))
    (when-let [data (lookup-entry config id :ramdisk-id)]
      (. builder ramdiskId data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :source-dest-check)]
      (. builder sourceDestCheck data))
    (when-let [data (lookup-entry config id :ssm-associations)]
      (. builder ssmAssociations data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tenancy)]
      (. builder tenancy data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (lookup-entry config id :volumes)]
      (. builder volumes data))
    (.build builder)))


(defn cfn-instance-ssm-association-property-builder
  "The cfn-instance-ssm-association-property-builder function buildes out new instances of 
CfnInstance$SsmAssociationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associationParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:association-parameters` |
| `documentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-name` |"
  [stack id config]
  (let [builder (CfnInstance$SsmAssociationProperty$Builder.)]
    (when-let [data (lookup-entry config id :association-parameters)]
      (. builder associationParameters data))
    (when-let [data (lookup-entry config id :document-name)]
      (. builder documentName data))
    (.build builder)))


(defn cfn-instance-state-property-builder
  "The cfn-instance-state-property-builder function buildes out new instances of 
CfnInstance$StateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | java.lang.String | [[cdk.support/lookup-entry]] | `:code` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnInstance$StateProperty$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-instance-volume-property-builder
  "The cfn-instance-volume-property-builder function buildes out new instances of 
CfnInstance$VolumeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `device` | java.lang.String | [[cdk.support/lookup-entry]] | `:device` |
| `volumeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-id` |"
  [stack id config]
  (let [builder (CfnInstance$VolumeProperty$Builder.)]
    (when-let [data (lookup-entry config id :device)]
      (. builder device data))
    (when-let [data (lookup-entry config id :volume-id)]
      (. builder volumeId data))
    (.build builder)))


(defn cfn-internet-gateway-builder
  "The cfn-internet-gateway-builder function buildes out new instances of 
CfnInternetGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInternetGateway$Builder/create stack id)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-internet-gateway-props-builder
  "The cfn-internet-gateway-props-builder function buildes out new instances of 
CfnInternetGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInternetGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ipam-allocation-builder
  "The cfn-ipam-allocation-builder function buildes out new instances of 
CfnIPAMAllocation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-pool-id` |
| `netmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:netmask-length` |"
  [stack id config]
  (let [builder (CfnIPAMAllocation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ipam-pool-id)]
      (. builder ipamPoolId data))
    (when-let [data (lookup-entry config id :netmask-length)]
      (. builder netmaskLength data))
    (.build builder)))


(defn cfn-ipam-allocation-props-builder
  "The cfn-ipam-allocation-props-builder function buildes out new instances of 
CfnIPAMAllocationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-pool-id` |
| `netmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:netmask-length` |"
  [stack id config]
  (let [builder (CfnIPAMAllocationProps$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ipam-pool-id)]
      (. builder ipamPoolId data))
    (when-let [data (lookup-entry config id :netmask-length)]
      (. builder netmaskLength data))
    (.build builder)))


(defn cfn-ipam-builder
  "The cfn-ipam-builder function buildes out new instances of 
CfnIPAM$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `operatingRegions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:operating-regions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |"
  [stack id config]
  (let [builder (CfnIPAM$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :operating-regions)]
      (. builder operatingRegions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tier)]
      (. builder tier data))
    (.build builder)))


(defn cfn-ipam-ipam-operating-region-property-builder
  "The cfn-ipam-ipam-operating-region-property-builder function buildes out new instances of 
CfnIPAM$IpamOperatingRegionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `regionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-name` |"
  [stack id config]
  (let [builder (CfnIPAM$IpamOperatingRegionProperty$Builder.)]
    (when-let [data (lookup-entry config id :region-name)]
      (. builder regionName data))
    (.build builder)))


(defn cfn-ipam-pool-builder
  "The cfn-ipam-pool-builder function buildes out new instances of 
CfnIPAMPool$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:address-family` |
| `allocationDefaultNetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocation-default-netmask-length` |
| `allocationMaxNetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocation-max-netmask-length` |
| `allocationMinNetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocation-min-netmask-length` |
| `allocationResourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:allocation-resource-tags` |
| `autoImport` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-import` |
| `awsService` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-service` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipamScopeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-scope-id` |
| `locale` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale` |
| `provisionedCidrs` | java.util.List | [[cdk.support/lookup-entry]] | `:provisioned-cidrs` |
| `publicIpSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-ip-source` |
| `publiclyAdvertisable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-advertisable` |
| `sourceIpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-ipam-pool-id` |
| `sourceResource` | software.amazon.awscdk.services.ec2.CfnIPAMPool$SourceResourceProperty | [[cdk.support/lookup-entry]] | `:source-resource` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPAMPool$Builder/create stack id)]
    (when-let [data (lookup-entry config id :address-family)]
      (. builder addressFamily data))
    (when-let [data (lookup-entry config id :allocation-default-netmask-length)]
      (. builder allocationDefaultNetmaskLength data))
    (when-let [data (lookup-entry config id :allocation-max-netmask-length)]
      (. builder allocationMaxNetmaskLength data))
    (when-let [data (lookup-entry config id :allocation-min-netmask-length)]
      (. builder allocationMinNetmaskLength data))
    (when-let [data (lookup-entry config id :allocation-resource-tags)]
      (. builder allocationResourceTags data))
    (when-let [data (lookup-entry config id :auto-import)]
      (. builder autoImport data))
    (when-let [data (lookup-entry config id :aws-service)]
      (. builder awsService data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ipam-scope-id)]
      (. builder ipamScopeId data))
    (when-let [data (lookup-entry config id :locale)]
      (. builder locale data))
    (when-let [data (lookup-entry config id :provisioned-cidrs)]
      (. builder provisionedCidrs data))
    (when-let [data (lookup-entry config id :public-ip-source)]
      (. builder publicIpSource data))
    (when-let [data (lookup-entry config id :publicly-advertisable)]
      (. builder publiclyAdvertisable data))
    (when-let [data (lookup-entry config id :source-ipam-pool-id)]
      (. builder sourceIpamPoolId data))
    (when-let [data (lookup-entry config id :source-resource)]
      (. builder sourceResource data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ipam-pool-cidr-builder
  "The cfn-ipam-pool-cidr-builder function buildes out new instances of 
CfnIPAMPoolCidr$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `ipamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-pool-id` |
| `netmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:netmask-length` |"
  [stack id config]
  (let [builder (CfnIPAMPoolCidr$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :ipam-pool-id)]
      (. builder ipamPoolId data))
    (when-let [data (lookup-entry config id :netmask-length)]
      (. builder netmaskLength data))
    (.build builder)))


(defn cfn-ipam-pool-cidr-props-builder
  "The cfn-ipam-pool-cidr-props-builder function buildes out new instances of 
CfnIPAMPoolCidrProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `ipamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-pool-id` |
| `netmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:netmask-length` |"
  [stack id config]
  (let [builder (CfnIPAMPoolCidrProps$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :ipam-pool-id)]
      (. builder ipamPoolId data))
    (when-let [data (lookup-entry config id :netmask-length)]
      (. builder netmaskLength data))
    (.build builder)))


(defn cfn-ipam-pool-props-builder
  "The cfn-ipam-pool-props-builder function buildes out new instances of 
CfnIPAMPoolProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:address-family` |
| `allocationDefaultNetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocation-default-netmask-length` |
| `allocationMaxNetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocation-max-netmask-length` |
| `allocationMinNetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocation-min-netmask-length` |
| `allocationResourceTags` | java.util.List | [[cdk.support/lookup-entry]] | `:allocation-resource-tags` |
| `autoImport` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-import` |
| `awsService` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-service` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipamScopeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-scope-id` |
| `locale` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale` |
| `provisionedCidrs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:provisioned-cidrs` |
| `publicIpSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-ip-source` |
| `publiclyAdvertisable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-advertisable` |
| `sourceIpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-ipam-pool-id` |
| `sourceResource` | software.amazon.awscdk.services.ec2.CfnIPAMPool$SourceResourceProperty | [[cdk.support/lookup-entry]] | `:source-resource` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPAMPoolProps$Builder.)]
    (when-let [data (lookup-entry config id :address-family)]
      (. builder addressFamily data))
    (when-let [data (lookup-entry config id :allocation-default-netmask-length)]
      (. builder allocationDefaultNetmaskLength data))
    (when-let [data (lookup-entry config id :allocation-max-netmask-length)]
      (. builder allocationMaxNetmaskLength data))
    (when-let [data (lookup-entry config id :allocation-min-netmask-length)]
      (. builder allocationMinNetmaskLength data))
    (when-let [data (lookup-entry config id :allocation-resource-tags)]
      (. builder allocationResourceTags data))
    (when-let [data (lookup-entry config id :auto-import)]
      (. builder autoImport data))
    (when-let [data (lookup-entry config id :aws-service)]
      (. builder awsService data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ipam-scope-id)]
      (. builder ipamScopeId data))
    (when-let [data (lookup-entry config id :locale)]
      (. builder locale data))
    (when-let [data (lookup-entry config id :provisioned-cidrs)]
      (. builder provisionedCidrs data))
    (when-let [data (lookup-entry config id :public-ip-source)]
      (. builder publicIpSource data))
    (when-let [data (lookup-entry config id :publicly-advertisable)]
      (. builder publiclyAdvertisable data))
    (when-let [data (lookup-entry config id :source-ipam-pool-id)]
      (. builder sourceIpamPoolId data))
    (when-let [data (lookup-entry config id :source-resource)]
      (. builder sourceResource data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ipam-pool-provisioned-cidr-property-builder
  "The cfn-ipam-pool-provisioned-cidr-property-builder function buildes out new instances of 
CfnIPAMPool$ProvisionedCidrProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |"
  [stack id config]
  (let [builder (CfnIPAMPool$ProvisionedCidrProperty$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (.build builder)))


(defn cfn-ipam-pool-source-resource-property-builder
  "The cfn-ipam-pool-source-resource-property-builder function buildes out new instances of 
CfnIPAMPool$SourceResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `resourceOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-owner` |
| `resourceRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-region` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |"
  [stack id config]
  (let [builder (CfnIPAMPool$SourceResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :resource-owner)]
      (. builder resourceOwner data))
    (when-let [data (lookup-entry config id :resource-region)]
      (. builder resourceRegion data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (.build builder)))


(defn cfn-ipam-props-builder
  "The cfn-ipam-props-builder function buildes out new instances of 
CfnIPAMProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `operatingRegions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:operating-regions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |"
  [stack id config]
  (let [builder (CfnIPAMProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :operating-regions)]
      (. builder operatingRegions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tier)]
      (. builder tier data))
    (.build builder)))


(defn cfn-ipam-resource-discovery-association-builder
  "The cfn-ipam-resource-discovery-association-builder function buildes out new instances of 
CfnIPAMResourceDiscoveryAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-id` |
| `ipamResourceDiscoveryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-resource-discovery-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPAMResourceDiscoveryAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :ipam-id)]
      (. builder ipamId data))
    (when-let [data (lookup-entry config id :ipam-resource-discovery-id)]
      (. builder ipamResourceDiscoveryId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ipam-resource-discovery-association-props-builder
  "The cfn-ipam-resource-discovery-association-props-builder function buildes out new instances of 
CfnIPAMResourceDiscoveryAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-id` |
| `ipamResourceDiscoveryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-resource-discovery-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPAMResourceDiscoveryAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :ipam-id)]
      (. builder ipamId data))
    (when-let [data (lookup-entry config id :ipam-resource-discovery-id)]
      (. builder ipamResourceDiscoveryId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ipam-resource-discovery-builder
  "The cfn-ipam-resource-discovery-builder function buildes out new instances of 
CfnIPAMResourceDiscovery$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `operatingRegions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:operating-regions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPAMResourceDiscovery$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :operating-regions)]
      (. builder operatingRegions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ipam-resource-discovery-ipam-operating-region-property-builder
  "The cfn-ipam-resource-discovery-ipam-operating-region-property-builder function buildes out new instances of 
CfnIPAMResourceDiscovery$IpamOperatingRegionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `regionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-name` |"
  [stack id config]
  (let [builder (CfnIPAMResourceDiscovery$IpamOperatingRegionProperty$Builder.)]
    (when-let [data (lookup-entry config id :region-name)]
      (. builder regionName data))
    (.build builder)))


(defn cfn-ipam-resource-discovery-props-builder
  "The cfn-ipam-resource-discovery-props-builder function buildes out new instances of 
CfnIPAMResourceDiscoveryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `operatingRegions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:operating-regions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPAMResourceDiscoveryProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :operating-regions)]
      (. builder operatingRegions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ipam-scope-builder
  "The cfn-ipam-scope-builder function buildes out new instances of 
CfnIPAMScope$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPAMScope$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ipam-id)]
      (. builder ipamId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ipam-scope-props-builder
  "The cfn-ipam-scope-props-builder function buildes out new instances of 
CfnIPAMScopeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipam-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPAMScopeProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ipam-id)]
      (. builder ipamId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-key-pair-builder
  "The cfn-key-pair-builder function buildes out new instances of 
CfnKeyPair$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-format` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
| `publicKeyMaterial` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-material` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnKeyPair$Builder/create stack id)]
    (when-let [data (lookup-entry config id :key-format)]
      (. builder keyFormat data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (when-let [data (lookup-entry config id :public-key-material)]
      (. builder publicKeyMaterial data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-key-pair-props-builder
  "The cfn-key-pair-props-builder function buildes out new instances of 
CfnKeyPairProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-format` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
| `publicKeyMaterial` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-material` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnKeyPairProps$Builder.)]
    (when-let [data (lookup-entry config id :key-format)]
      (. builder keyFormat data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (when-let [data (lookup-entry config id :public-key-material)]
      (. builder publicKeyMaterial data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-launch-template-accelerator-count-property-builder
  "The cfn-launch-template-accelerator-count-property-builder function buildes out new instances of 
CfnLaunchTemplate$AcceleratorCountProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$AcceleratorCountProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-launch-template-accelerator-total-memory-mi-b-property-builder
  "The cfn-launch-template-accelerator-total-memory-mi-b-property-builder function buildes out new instances of 
CfnLaunchTemplate$AcceleratorTotalMemoryMiBProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$AcceleratorTotalMemoryMiBProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-launch-template-baseline-ebs-bandwidth-mbps-property-builder
  "The cfn-launch-template-baseline-ebs-bandwidth-mbps-property-builder function buildes out new instances of 
CfnLaunchTemplate$BaselineEbsBandwidthMbpsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$BaselineEbsBandwidthMbpsProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-launch-template-block-device-mapping-property-builder
  "The cfn-launch-template-block-device-mapping-property-builder function buildes out new instances of 
CfnLaunchTemplate$BlockDeviceMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `ebs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs` |
| `noDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:no-device` |
| `virtualName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-name` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$BlockDeviceMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :ebs)]
      (. builder ebs data))
    (when-let [data (lookup-entry config id :no-device)]
      (. builder noDevice data))
    (when-let [data (lookup-entry config id :virtual-name)]
      (. builder virtualName data))
    (.build builder)))


(defn cfn-launch-template-builder
  "The cfn-launch-template-builder function buildes out new instances of 
CfnLaunchTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateData` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$LaunchTemplateDataProperty | [[cdk.support/lookup-entry]] | `:launch-template-data` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `versionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-description` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :launch-template-data)]
      (. builder launchTemplateData data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :version-description)]
      (. builder versionDescription data))
    (.build builder)))


(defn cfn-launch-template-capacity-reservation-specification-property-builder
  "The cfn-launch-template-capacity-reservation-specification-property-builder function buildes out new instances of 
CfnLaunchTemplate$CapacityReservationSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityReservationPreference` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-reservation-preference` |
| `capacityReservationTarget` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$CapacityReservationTargetProperty | [[cdk.support/lookup-entry]] | `:capacity-reservation-target` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$CapacityReservationSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :capacity-reservation-preference)]
      (. builder capacityReservationPreference data))
    (when-let [data (lookup-entry config id :capacity-reservation-target)]
      (. builder capacityReservationTarget data))
    (.build builder)))


(defn cfn-launch-template-capacity-reservation-target-property-builder
  "The cfn-launch-template-capacity-reservation-target-property-builder function buildes out new instances of 
CfnLaunchTemplate$CapacityReservationTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityReservationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-reservation-id` |
| `capacityReservationResourceGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:capacity-reservation-resource-group-arn` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$CapacityReservationTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :capacity-reservation-id)]
      (. builder capacityReservationId data))
    (when-let [data (lookup-entry config id :capacity-reservation-resource-group-arn)]
      (. builder capacityReservationResourceGroupArn data))
    (.build builder)))


(defn cfn-launch-template-connection-tracking-specification-property-builder
  "The cfn-launch-template-connection-tracking-specification-property-builder function buildes out new instances of 
CfnLaunchTemplate$ConnectionTrackingSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tcpEstablishedTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tcp-established-timeout` |
| `udpStreamTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:udp-stream-timeout` |
| `udpTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:udp-timeout` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$ConnectionTrackingSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :tcp-established-timeout)]
      (. builder tcpEstablishedTimeout data))
    (when-let [data (lookup-entry config id :udp-stream-timeout)]
      (. builder udpStreamTimeout data))
    (when-let [data (lookup-entry config id :udp-timeout)]
      (. builder udpTimeout data))
    (.build builder)))


(defn cfn-launch-template-cpu-options-property-builder
  "The cfn-launch-template-cpu-options-property-builder function buildes out new instances of 
CfnLaunchTemplate$CpuOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amdSevSnp` | java.lang.String | [[cdk.support/lookup-entry]] | `:amd-sev-snp` |
| `coreCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:core-count` |
| `threadsPerCore` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threads-per-core` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$CpuOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :amd-sev-snp)]
      (. builder amdSevSnp data))
    (when-let [data (lookup-entry config id :core-count)]
      (. builder coreCount data))
    (when-let [data (lookup-entry config id :threads-per-core)]
      (. builder threadsPerCore data))
    (.build builder)))


(defn cfn-launch-template-credit-specification-property-builder
  "The cfn-launch-template-credit-specification-property-builder function buildes out new instances of 
CfnLaunchTemplate$CreditSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuCredits` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu-credits` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$CreditSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cpu-credits)]
      (. builder cpuCredits data))
    (.build builder)))


(defn cfn-launch-template-ebs-property-builder
  "The cfn-launch-template-ebs-property-builder function buildes out new instances of 
CfnLaunchTemplate$EbsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$EbsProperty$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-launch-template-elastic-gpu-specification-property-builder
  "The cfn-launch-template-elastic-gpu-specification-property-builder function buildes out new instances of 
CfnLaunchTemplate$ElasticGpuSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$ElasticGpuSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-launch-template-ena-srd-specification-property-builder
  "The cfn-launch-template-ena-srd-specification-property-builder function buildes out new instances of 
CfnLaunchTemplate$EnaSrdSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enaSrdEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ena-srd-enabled` |
| `enaSrdUdpSpecification` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$EnaSrdUdpSpecificationProperty | [[cdk.support/lookup-entry]] | `:ena-srd-udp-specification` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$EnaSrdSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ena-srd-enabled)]
      (. builder enaSrdEnabled data))
    (when-let [data (lookup-entry config id :ena-srd-udp-specification)]
      (. builder enaSrdUdpSpecification data))
    (.build builder)))


(defn cfn-launch-template-ena-srd-udp-specification-property-builder
  "The cfn-launch-template-ena-srd-udp-specification-property-builder function buildes out new instances of 
CfnLaunchTemplate$EnaSrdUdpSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enaSrdUdpEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ena-srd-udp-enabled` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$EnaSrdUdpSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ena-srd-udp-enabled)]
      (. builder enaSrdUdpEnabled data))
    (.build builder)))


(defn cfn-launch-template-enclave-options-property-builder
  "The cfn-launch-template-enclave-options-property-builder function buildes out new instances of 
CfnLaunchTemplate$EnclaveOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$EnclaveOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-launch-template-hibernation-options-property-builder
  "The cfn-launch-template-hibernation-options-property-builder function buildes out new instances of 
CfnLaunchTemplate$HibernationOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configured` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:configured` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$HibernationOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :configured)]
      (. builder configured data))
    (.build builder)))


(defn cfn-launch-template-iam-instance-profile-property-builder
  "The cfn-launch-template-iam-instance-profile-property-builder function buildes out new instances of 
CfnLaunchTemplate$IamInstanceProfileProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$IamInstanceProfileProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-launch-template-instance-market-options-property-builder
  "The cfn-launch-template-instance-market-options-property-builder function buildes out new instances of 
CfnLaunchTemplate$InstanceMarketOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `marketType` | java.lang.String | [[cdk.support/lookup-entry]] | `:market-type` |
| `spotOptions` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$SpotOptionsProperty | [[cdk.support/lookup-entry]] | `:spot-options` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$InstanceMarketOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :market-type)]
      (. builder marketType data))
    (when-let [data (lookup-entry config id :spot-options)]
      (. builder spotOptions data))
    (.build builder)))


(defn cfn-launch-template-instance-requirements-property-builder
  "The cfn-launch-template-instance-requirements-property-builder function buildes out new instances of 
CfnLaunchTemplate$InstanceRequirementsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorCount` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:accelerator-count` |
| `acceleratorManufacturers` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-manufacturers` |
| `acceleratorNames` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-names` |
| `acceleratorTotalMemoryMiB` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$AcceleratorTotalMemoryMiBProperty | [[cdk.support/lookup-entry]] | `:accelerator-total-memory-mi-b` |
| `acceleratorTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-types` |
| `allowedInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-instance-types` |
| `bareMetal` | java.lang.String | [[cdk.support/lookup-entry]] | `:bare-metal` |
| `baselineEbsBandwidthMbps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:baseline-ebs-bandwidth-mbps` |
| `burstablePerformance` | java.lang.String | [[cdk.support/lookup-entry]] | `:burstable-performance` |
| `cpuManufacturers` | java.util.List | [[cdk.support/lookup-entry]] | `:cpu-manufacturers` |
| `excludedInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-instance-types` |
| `instanceGenerations` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-generations` |
| `localStorage` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-storage` |
| `localStorageTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:local-storage-types` |
| `maxSpotPriceAsPercentageOfOptimalOnDemandPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-spot-price-as-percentage-of-optimal-on-demand-price` |
| `memoryGiBPerVCpu` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$MemoryGiBPerVCpuProperty | [[cdk.support/lookup-entry]] | `:memory-gi-b-per-v-cpu` |
| `memoryMiB` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$MemoryMiBProperty | [[cdk.support/lookup-entry]] | `:memory-mi-b` |
| `networkBandwidthGbps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-bandwidth-gbps` |
| `networkInterfaceCount` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$NetworkInterfaceCountProperty | [[cdk.support/lookup-entry]] | `:network-interface-count` |
| `onDemandMaxPricePercentageOverLowestPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:on-demand-max-price-percentage-over-lowest-price` |
| `requireHibernateSupport` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-hibernate-support` |
| `spotMaxPricePercentageOverLowestPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:spot-max-price-percentage-over-lowest-price` |
| `totalLocalStorageGb` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:total-local-storage-gb` |
| `vCpuCount` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$VCpuCountProperty | [[cdk.support/lookup-entry]] | `:v-cpu-count` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$InstanceRequirementsProperty$Builder.)]
    (when-let [data (lookup-entry config id :accelerator-count)]
      (. builder acceleratorCount data))
    (when-let [data (lookup-entry config id :accelerator-manufacturers)]
      (. builder acceleratorManufacturers data))
    (when-let [data (lookup-entry config id :accelerator-names)]
      (. builder acceleratorNames data))
    (when-let [data (lookup-entry config id :accelerator-total-memory-mi-b)]
      (. builder acceleratorTotalMemoryMiB data))
    (when-let [data (lookup-entry config id :accelerator-types)]
      (. builder acceleratorTypes data))
    (when-let [data (lookup-entry config id :allowed-instance-types)]
      (. builder allowedInstanceTypes data))
    (when-let [data (lookup-entry config id :bare-metal)]
      (. builder bareMetal data))
    (when-let [data (lookup-entry config id :baseline-ebs-bandwidth-mbps)]
      (. builder baselineEbsBandwidthMbps data))
    (when-let [data (lookup-entry config id :burstable-performance)]
      (. builder burstablePerformance data))
    (when-let [data (lookup-entry config id :cpu-manufacturers)]
      (. builder cpuManufacturers data))
    (when-let [data (lookup-entry config id :excluded-instance-types)]
      (. builder excludedInstanceTypes data))
    (when-let [data (lookup-entry config id :instance-generations)]
      (. builder instanceGenerations data))
    (when-let [data (lookup-entry config id :local-storage)]
      (. builder localStorage data))
    (when-let [data (lookup-entry config id :local-storage-types)]
      (. builder localStorageTypes data))
    (when-let [data (lookup-entry config id :max-spot-price-as-percentage-of-optimal-on-demand-price)]
      (. builder maxSpotPriceAsPercentageOfOptimalOnDemandPrice data))
    (when-let [data (lookup-entry config id :memory-gi-b-per-v-cpu)]
      (. builder memoryGiBPerVCpu data))
    (when-let [data (lookup-entry config id :memory-mi-b)]
      (. builder memoryMiB data))
    (when-let [data (lookup-entry config id :network-bandwidth-gbps)]
      (. builder networkBandwidthGbps data))
    (when-let [data (lookup-entry config id :network-interface-count)]
      (. builder networkInterfaceCount data))
    (when-let [data (lookup-entry config id :on-demand-max-price-percentage-over-lowest-price)]
      (. builder onDemandMaxPricePercentageOverLowestPrice data))
    (when-let [data (lookup-entry config id :require-hibernate-support)]
      (. builder requireHibernateSupport data))
    (when-let [data (lookup-entry config id :spot-max-price-percentage-over-lowest-price)]
      (. builder spotMaxPricePercentageOverLowestPrice data))
    (when-let [data (lookup-entry config id :total-local-storage-gb)]
      (. builder totalLocalStorageGb data))
    (when-let [data (lookup-entry config id :v-cpu-count)]
      (. builder vCpuCount data))
    (.build builder)))


(defn cfn-launch-template-ipv4-prefix-specification-property-builder
  "The cfn-launch-template-ipv4-prefix-specification-property-builder function buildes out new instances of 
CfnLaunchTemplate$Ipv4PrefixSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv4Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-prefix` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$Ipv4PrefixSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ipv4-prefix)]
      (. builder ipv4Prefix data))
    (.build builder)))


(defn cfn-launch-template-ipv6-add-property-builder
  "The cfn-launch-template-ipv6-add-property-builder function buildes out new instances of 
CfnLaunchTemplate$Ipv6AddProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv6Address` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-address` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$Ipv6AddProperty$Builder.)]
    (when-let [data (lookup-entry config id :ipv6-address)]
      (. builder ipv6Address data))
    (.build builder)))


(defn cfn-launch-template-ipv6-prefix-specification-property-builder
  "The cfn-launch-template-ipv6-prefix-specification-property-builder function buildes out new instances of 
CfnLaunchTemplate$Ipv6PrefixSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv6Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-prefix` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$Ipv6PrefixSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ipv6-prefix)]
      (. builder ipv6Prefix data))
    (.build builder)))


(defn cfn-launch-template-launch-template-data-property-builder
  "The cfn-launch-template-launch-template-data-property-builder function buildes out new instances of 
CfnLaunchTemplate$LaunchTemplateDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockDeviceMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `capacityReservationSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capacity-reservation-specification` |
| `cpuOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cpu-options` |
| `creditSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:credit-specification` |
| `disableApiStop` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-api-stop` |
| `disableApiTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-api-termination` |
| `ebsOptimized` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `elasticGpuSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:elastic-gpu-specifications` |
| `elasticInferenceAccelerators` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:elastic-inference-accelerators` |
| `enclaveOptions` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$EnclaveOptionsProperty | [[cdk.support/lookup-entry]] | `:enclave-options` |
| `hibernationOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hibernation-options` |
| `iamInstanceProfile` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$IamInstanceProfileProperty | [[cdk.support/lookup-entry]] | `:iam-instance-profile` |
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `instanceInitiatedShutdownBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-initiated-shutdown-behavior` |
| `instanceMarketOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-market-options` |
| `instanceRequirements` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-requirements` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `kernelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kernel-id` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `licenseSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:license-specifications` |
| `maintenanceOptions` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$MaintenanceOptionsProperty | [[cdk.support/lookup-entry]] | `:maintenance-options` |
| `metadataOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metadata-options` |
| `monitoring` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$MonitoringProperty | [[cdk.support/lookup-entry]] | `:monitoring` |
| `networkInterfaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `placement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:placement` |
| `privateDnsNameOptions` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$PrivateDnsNameOptionsProperty | [[cdk.support/lookup-entry]] | `:private-dns-name-options` |
| `ramDiskId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ram-disk-id` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `userData` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$LaunchTemplateDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :block-device-mappings)]
      (. builder blockDeviceMappings data))
    (when-let [data (lookup-entry config id :capacity-reservation-specification)]
      (. builder capacityReservationSpecification data))
    (when-let [data (lookup-entry config id :cpu-options)]
      (. builder cpuOptions data))
    (when-let [data (lookup-entry config id :credit-specification)]
      (. builder creditSpecification data))
    (when-let [data (lookup-entry config id :disable-api-stop)]
      (. builder disableApiStop data))
    (when-let [data (lookup-entry config id :disable-api-termination)]
      (. builder disableApiTermination data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :elastic-gpu-specifications)]
      (. builder elasticGpuSpecifications data))
    (when-let [data (lookup-entry config id :elastic-inference-accelerators)]
      (. builder elasticInferenceAccelerators data))
    (when-let [data (lookup-entry config id :enclave-options)]
      (. builder enclaveOptions data))
    (when-let [data (lookup-entry config id :hibernation-options)]
      (. builder hibernationOptions data))
    (when-let [data (lookup-entry config id :iam-instance-profile)]
      (. builder iamInstanceProfile data))
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (lookup-entry config id :instance-initiated-shutdown-behavior)]
      (. builder instanceInitiatedShutdownBehavior data))
    (when-let [data (lookup-entry config id :instance-market-options)]
      (. builder instanceMarketOptions data))
    (when-let [data (lookup-entry config id :instance-requirements)]
      (. builder instanceRequirements data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :kernel-id)]
      (. builder kernelId data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :license-specifications)]
      (. builder licenseSpecifications data))
    (when-let [data (lookup-entry config id :maintenance-options)]
      (. builder maintenanceOptions data))
    (when-let [data (lookup-entry config id :metadata-options)]
      (. builder metadataOptions data))
    (when-let [data (lookup-entry config id :monitoring)]
      (. builder monitoring data))
    (when-let [data (lookup-entry config id :network-interfaces)]
      (. builder networkInterfaces data))
    (when-let [data (lookup-entry config id :placement)]
      (. builder placement data))
    (when-let [data (lookup-entry config id :private-dns-name-options)]
      (. builder privateDnsNameOptions data))
    (when-let [data (lookup-entry config id :ram-disk-id)]
      (. builder ramDiskId data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn cfn-launch-template-launch-template-elastic-inference-accelerator-property-builder
  "The cfn-launch-template-launch-template-elastic-inference-accelerator-property-builder function buildes out new instances of 
CfnLaunchTemplate$LaunchTemplateElasticInferenceAcceleratorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$LaunchTemplateElasticInferenceAcceleratorProperty$Builder.)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-launch-template-launch-template-tag-specification-property-builder
  "The cfn-launch-template-launch-template-tag-specification-property-builder function buildes out new instances of 
CfnLaunchTemplate$LaunchTemplateTagSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$LaunchTemplateTagSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-launch-template-license-specification-property-builder
  "The cfn-launch-template-license-specification-property-builder function buildes out new instances of 
CfnLaunchTemplate$LicenseSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `licenseConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-configuration-arn` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$LicenseSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :license-configuration-arn)]
      (. builder licenseConfigurationArn data))
    (.build builder)))


(defn cfn-launch-template-maintenance-options-property-builder
  "The cfn-launch-template-maintenance-options-property-builder function buildes out new instances of 
CfnLaunchTemplate$MaintenanceOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoRecovery` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-recovery` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$MaintenanceOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-recovery)]
      (. builder autoRecovery data))
    (.build builder)))


(defn cfn-launch-template-memory-gi-b-per-v-cpu-property-builder
  "The cfn-launch-template-memory-gi-b-per-v-cpu-property-builder function buildes out new instances of 
CfnLaunchTemplate$MemoryGiBPerVCpuProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$MemoryGiBPerVCpuProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-launch-template-memory-mi-b-property-builder
  "The cfn-launch-template-memory-mi-b-property-builder function buildes out new instances of 
CfnLaunchTemplate$MemoryMiBProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$MemoryMiBProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-launch-template-metadata-options-property-builder
  "The cfn-launch-template-metadata-options-property-builder function buildes out new instances of 
CfnLaunchTemplate$MetadataOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-endpoint` |
| `httpProtocolIpv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-protocol-ipv6` |
| `httpPutResponseHopLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-put-response-hop-limit` |
| `httpTokens` | java.lang.String | [[cdk.support/lookup-entry]] | `:http-tokens` |
| `instanceMetadataTags` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-metadata-tags` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$MetadataOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :http-endpoint)]
      (. builder httpEndpoint data))
    (when-let [data (lookup-entry config id :http-protocol-ipv6)]
      (. builder httpProtocolIpv6 data))
    (when-let [data (lookup-entry config id :http-put-response-hop-limit)]
      (. builder httpPutResponseHopLimit data))
    (when-let [data (lookup-entry config id :http-tokens)]
      (. builder httpTokens data))
    (when-let [data (lookup-entry config id :instance-metadata-tags)]
      (. builder instanceMetadataTags data))
    (.build builder)))


(defn cfn-launch-template-monitoring-property-builder
  "The cfn-launch-template-monitoring-property-builder function buildes out new instances of 
CfnLaunchTemplate$MonitoringProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$MonitoringProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-launch-template-network-bandwidth-gbps-property-builder
  "The cfn-launch-template-network-bandwidth-gbps-property-builder function buildes out new instances of 
CfnLaunchTemplate$NetworkBandwidthGbpsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$NetworkBandwidthGbpsProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-launch-template-network-interface-count-property-builder
  "The cfn-launch-template-network-interface-count-property-builder function buildes out new instances of 
CfnLaunchTemplate$NetworkInterfaceCountProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$NetworkInterfaceCountProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-launch-template-network-interface-property-builder
  "The cfn-launch-template-network-interface-property-builder function buildes out new instances of 
CfnLaunchTemplate$NetworkInterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associateCarrierIpAddress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:associate-carrier-ip-address` |
| `associatePublicIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `connectionTrackingSpecification` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$ConnectionTrackingSpecificationProperty | [[cdk.support/lookup-entry]] | `:connection-tracking-specification` |
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:device-index` |
| `enaSrdSpecification` | software.amazon.awscdk.services.ec2.CfnLaunchTemplate$EnaSrdSpecificationProperty | [[cdk.support/lookup-entry]] | `:ena-srd-specification` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `interfaceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-type` |
| `ipv4PrefixCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv4-prefix-count` |
| `ipv4Prefixes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ipv4-prefixes` |
| `ipv6AddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-address-count` |
| `ipv6Addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv6-addresses` |
| `ipv6PrefixCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-prefix-count` |
| `ipv6Prefixes` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv6-prefixes` |
| `networkCardIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:network-card-index` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `primaryIpv6` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary-ipv6` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `privateIpAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:private-ip-addresses` |
| `secondaryPrivateIpAddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:secondary-private-ip-address-count` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$NetworkInterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :associate-carrier-ip-address)]
      (. builder associateCarrierIpAddress data))
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :connection-tracking-specification)]
      (. builder connectionTrackingSpecification data))
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :device-index)]
      (. builder deviceIndex data))
    (when-let [data (lookup-entry config id :ena-srd-specification)]
      (. builder enaSrdSpecification data))
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :interface-type)]
      (. builder interfaceType data))
    (when-let [data (lookup-entry config id :ipv4-prefix-count)]
      (. builder ipv4PrefixCount data))
    (when-let [data (lookup-entry config id :ipv4-prefixes)]
      (. builder ipv4Prefixes data))
    (when-let [data (lookup-entry config id :ipv6-address-count)]
      (. builder ipv6AddressCount data))
    (when-let [data (lookup-entry config id :ipv6-addresses)]
      (. builder ipv6Addresses data))
    (when-let [data (lookup-entry config id :ipv6-prefix-count)]
      (. builder ipv6PrefixCount data))
    (when-let [data (lookup-entry config id :ipv6-prefixes)]
      (. builder ipv6Prefixes data))
    (when-let [data (lookup-entry config id :network-card-index)]
      (. builder networkCardIndex data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :primary-ipv6)]
      (. builder primaryIpv6 data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :private-ip-addresses)]
      (. builder privateIpAddresses data))
    (when-let [data (lookup-entry config id :secondary-private-ip-address-count)]
      (. builder secondaryPrivateIpAddressCount data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-launch-template-placement-property-builder
  "The cfn-launch-template-placement-property-builder function buildes out new instances of 
CfnLaunchTemplate$PlacementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `affinity` | java.lang.String | [[cdk.support/lookup-entry]] | `:affinity` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `hostId` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-id` |
| `hostResourceGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-resource-group-arn` |
| `partitionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:partition-number` |
| `spreadDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:spread-domain` |
| `tenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenancy` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$PlacementProperty$Builder.)]
    (when-let [data (lookup-entry config id :affinity)]
      (. builder affinity data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :host-id)]
      (. builder hostId data))
    (when-let [data (lookup-entry config id :host-resource-group-arn)]
      (. builder hostResourceGroupArn data))
    (when-let [data (lookup-entry config id :partition-number)]
      (. builder partitionNumber data))
    (when-let [data (lookup-entry config id :spread-domain)]
      (. builder spreadDomain data))
    (when-let [data (lookup-entry config id :tenancy)]
      (. builder tenancy data))
    (.build builder)))


(defn cfn-launch-template-private-dns-name-options-property-builder
  "The cfn-launch-template-private-dns-name-options-property-builder function buildes out new instances of 
CfnLaunchTemplate$PrivateDnsNameOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableResourceNameDnsARecord` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-resource-name-dns-a-record` |
| `enableResourceNameDnsAaaaRecord` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-resource-name-dns-aaaa-record` |
| `hostnameType` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname-type` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$PrivateDnsNameOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-resource-name-dns-a-record)]
      (. builder enableResourceNameDnsARecord data))
    (when-let [data (lookup-entry config id :enable-resource-name-dns-aaaa-record)]
      (. builder enableResourceNameDnsAaaaRecord data))
    (when-let [data (lookup-entry config id :hostname-type)]
      (. builder hostnameType data))
    (.build builder)))


(defn cfn-launch-template-private-ip-add-property-builder
  "The cfn-launch-template-private-ip-add-property-builder function buildes out new instances of 
CfnLaunchTemplate$PrivateIpAddProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$PrivateIpAddProperty$Builder.)]
    (when-let [data (lookup-entry config id :primary)]
      (. builder primary data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (.build builder)))


(defn cfn-launch-template-props-builder
  "The cfn-launch-template-props-builder function buildes out new instances of 
CfnLaunchTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template-data` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `tagSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `versionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-description` |"
  [stack id config]
  (let [builder (CfnLaunchTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-data)]
      (. builder launchTemplateData data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :version-description)]
      (. builder versionDescription data))
    (.build builder)))


(defn cfn-launch-template-spot-options-property-builder
  "The cfn-launch-template-spot-options-property-builder function buildes out new instances of 
CfnLaunchTemplate$SpotOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockDurationMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-duration-minutes` |
| `instanceInterruptionBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-interruption-behavior` |
| `maxPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-price` |
| `spotInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-instance-type` |
| `validUntil` | java.lang.String | [[cdk.support/lookup-entry]] | `:valid-until` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$SpotOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :block-duration-minutes)]
      (. builder blockDurationMinutes data))
    (when-let [data (lookup-entry config id :instance-interruption-behavior)]
      (. builder instanceInterruptionBehavior data))
    (when-let [data (lookup-entry config id :max-price)]
      (. builder maxPrice data))
    (when-let [data (lookup-entry config id :spot-instance-type)]
      (. builder spotInstanceType data))
    (when-let [data (lookup-entry config id :valid-until)]
      (. builder validUntil data))
    (.build builder)))


(defn cfn-launch-template-tag-specification-property-builder
  "The cfn-launch-template-tag-specification-property-builder function buildes out new instances of 
CfnLaunchTemplate$TagSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$TagSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-launch-template-total-local-storage-gb-property-builder
  "The cfn-launch-template-total-local-storage-gb-property-builder function buildes out new instances of 
CfnLaunchTemplate$TotalLocalStorageGBProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$TotalLocalStorageGBProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-launch-template-v-cpu-count-property-builder
  "The cfn-launch-template-v-cpu-count-property-builder function buildes out new instances of 
CfnLaunchTemplate$VCpuCountProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnLaunchTemplate$VCpuCountProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-local-gateway-route-builder
  "The cfn-local-gateway-route-builder function buildes out new instances of 
CfnLocalGatewayRoute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `localGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-route-table-id` |
| `localGatewayVirtualInterfaceGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-virtual-interface-group-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |"
  [stack id config]
  (let [builder (CfnLocalGatewayRoute$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :local-gateway-route-table-id)]
      (. builder localGatewayRouteTableId data))
    (when-let [data (lookup-entry config id :local-gateway-virtual-interface-group-id)]
      (. builder localGatewayVirtualInterfaceGroupId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (.build builder)))


(defn cfn-local-gateway-route-props-builder
  "The cfn-local-gateway-route-props-builder function buildes out new instances of 
CfnLocalGatewayRouteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `localGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-route-table-id` |
| `localGatewayVirtualInterfaceGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-virtual-interface-group-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |"
  [stack id config]
  (let [builder (CfnLocalGatewayRouteProps$Builder.)]
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :local-gateway-route-table-id)]
      (. builder localGatewayRouteTableId data))
    (when-let [data (lookup-entry config id :local-gateway-virtual-interface-group-id)]
      (. builder localGatewayVirtualInterfaceGroupId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (.build builder)))


(defn cfn-local-gateway-route-table-builder
  "The cfn-local-gateway-route-table-builder function buildes out new instances of 
CfnLocalGatewayRouteTable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-id` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocalGatewayRouteTable$Builder/create stack id)]
    (when-let [data (lookup-entry config id :local-gateway-id)]
      (. builder localGatewayId data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-local-gateway-route-table-props-builder
  "The cfn-local-gateway-route-table-props-builder function buildes out new instances of 
CfnLocalGatewayRouteTableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-id` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocalGatewayRouteTableProps$Builder.)]
    (when-let [data (lookup-entry config id :local-gateway-id)]
      (. builder localGatewayId data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-local-gateway-route-table-virtual-interface-group-association-builder
  "The cfn-local-gateway-route-table-virtual-interface-group-association-builder function buildes out new instances of 
CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-route-table-id` |
| `localGatewayVirtualInterfaceGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-virtual-interface-group-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :local-gateway-route-table-id)]
      (. builder localGatewayRouteTableId data))
    (when-let [data (lookup-entry config id :local-gateway-virtual-interface-group-id)]
      (. builder localGatewayVirtualInterfaceGroupId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-local-gateway-route-table-virtual-interface-group-association-props-builder
  "The cfn-local-gateway-route-table-virtual-interface-group-association-props-builder function buildes out new instances of 
CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-route-table-id` |
| `localGatewayVirtualInterfaceGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-virtual-interface-group-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :local-gateway-route-table-id)]
      (. builder localGatewayRouteTableId data))
    (when-let [data (lookup-entry config id :local-gateway-virtual-interface-group-id)]
      (. builder localGatewayVirtualInterfaceGroupId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-local-gateway-route-table-vpc-association-builder
  "The cfn-local-gateway-route-table-vpc-association-builder function buildes out new instances of 
CfnLocalGatewayRouteTableVPCAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-route-table-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnLocalGatewayRouteTableVPCAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :local-gateway-route-table-id)]
      (. builder localGatewayRouteTableId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-local-gateway-route-table-vpc-association-props-builder
  "The cfn-local-gateway-route-table-vpc-association-props-builder function buildes out new instances of 
CfnLocalGatewayRouteTableVPCAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `localGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-route-table-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnLocalGatewayRouteTableVPCAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :local-gateway-route-table-id)]
      (. builder localGatewayRouteTableId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-nat-gateway-builder
  "The cfn-nat-gateway-builder function buildes out new instances of 
CfnNatGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-id` |
| `connectivityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connectivity-type` |
| `maxDrainDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-drain-duration-seconds` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `secondaryAllocationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-allocation-ids` |
| `secondaryPrivateIpAddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:secondary-private-ip-address-count` |
| `secondaryPrivateIpAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-private-ip-addresses` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNatGateway$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allocation-id)]
      (. builder allocationId data))
    (when-let [data (lookup-entry config id :connectivity-type)]
      (. builder connectivityType data))
    (when-let [data (lookup-entry config id :max-drain-duration-seconds)]
      (. builder maxDrainDurationSeconds data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :secondary-allocation-ids)]
      (. builder secondaryAllocationIds data))
    (when-let [data (lookup-entry config id :secondary-private-ip-address-count)]
      (. builder secondaryPrivateIpAddressCount data))
    (when-let [data (lookup-entry config id :secondary-private-ip-addresses)]
      (. builder secondaryPrivateIpAddresses data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-nat-gateway-props-builder
  "The cfn-nat-gateway-props-builder function buildes out new instances of 
CfnNatGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-id` |
| `connectivityType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connectivity-type` |
| `maxDrainDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-drain-duration-seconds` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `secondaryAllocationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-allocation-ids` |
| `secondaryPrivateIpAddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:secondary-private-ip-address-count` |
| `secondaryPrivateIpAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:secondary-private-ip-addresses` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNatGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :allocation-id)]
      (. builder allocationId data))
    (when-let [data (lookup-entry config id :connectivity-type)]
      (. builder connectivityType data))
    (when-let [data (lookup-entry config id :max-drain-duration-seconds)]
      (. builder maxDrainDurationSeconds data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :secondary-allocation-ids)]
      (. builder secondaryAllocationIds data))
    (when-let [data (lookup-entry config id :secondary-private-ip-address-count)]
      (. builder secondaryPrivateIpAddressCount data))
    (when-let [data (lookup-entry config id :secondary-private-ip-addresses)]
      (. builder secondaryPrivateIpAddresses data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-acl-builder
  "The cfn-network-acl-builder function buildes out new instances of 
CfnNetworkAcl$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnNetworkAcl$Builder/create stack id)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-network-acl-entry-builder
  "The cfn-network-acl-entry-builder function buildes out new instances of 
CfnNetworkAclEntry$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `egress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:egress` |
| `icmp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:icmp` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `networkAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-acl-id` |
| `portRange` | software.amazon.awscdk.services.ec2.CfnNetworkAclEntry$PortRangeProperty | [[cdk.support/lookup-entry]] | `:port-range` |
| `protocol` | java.lang.Number | [[cdk.support/lookup-entry]] | `:protocol` |
| `ruleAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-action` |
| `ruleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-number` |"
  [stack id config]
  (let [builder (CfnNetworkAclEntry$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :egress)]
      (. builder egress data))
    (when-let [data (lookup-entry config id :icmp)]
      (. builder icmp data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :network-acl-id)]
      (. builder networkAclId data))
    (when-let [data (lookup-entry config id :port-range)]
      (. builder portRange data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :rule-action)]
      (. builder ruleAction data))
    (when-let [data (lookup-entry config id :rule-number)]
      (. builder ruleNumber data))
    (.build builder)))


(defn cfn-network-acl-entry-icmp-property-builder
  "The cfn-network-acl-entry-icmp-property-builder function buildes out new instances of 
CfnNetworkAclEntry$IcmpProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | java.lang.Number | [[cdk.support/lookup-entry]] | `:code` |
| `type` | java.lang.Number | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnNetworkAclEntry$IcmpProperty$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-network-acl-entry-port-range-property-builder
  "The cfn-network-acl-entry-port-range-property-builder function buildes out new instances of 
CfnNetworkAclEntry$PortRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `from` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from` |
| `to` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to` |"
  [stack id config]
  (let [builder (CfnNetworkAclEntry$PortRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :from)]
      (. builder from data))
    (when-let [data (lookup-entry config id :to)]
      (. builder to data))
    (.build builder)))


(defn cfn-network-acl-entry-props-builder
  "The cfn-network-acl-entry-props-builder function buildes out new instances of 
CfnNetworkAclEntryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `egress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:egress` |
| `icmp` | software.amazon.awscdk.services.ec2.CfnNetworkAclEntry$IcmpProperty | [[cdk.support/lookup-entry]] | `:icmp` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `networkAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-acl-id` |
| `portRange` | software.amazon.awscdk.services.ec2.CfnNetworkAclEntry$PortRangeProperty | [[cdk.support/lookup-entry]] | `:port-range` |
| `protocol` | java.lang.Number | [[cdk.support/lookup-entry]] | `:protocol` |
| `ruleAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-action` |
| `ruleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-number` |"
  [stack id config]
  (let [builder (CfnNetworkAclEntryProps$Builder.)]
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :egress)]
      (. builder egress data))
    (when-let [data (lookup-entry config id :icmp)]
      (. builder icmp data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :network-acl-id)]
      (. builder networkAclId data))
    (when-let [data (lookup-entry config id :port-range)]
      (. builder portRange data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :rule-action)]
      (. builder ruleAction data))
    (when-let [data (lookup-entry config id :rule-number)]
      (. builder ruleNumber data))
    (.build builder)))


(defn cfn-network-acl-props-builder
  "The cfn-network-acl-props-builder function buildes out new instances of 
CfnNetworkAclProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnNetworkAclProps$Builder.)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-network-insights-access-scope-access-scope-path-request-property-builder
  "The cfn-network-insights-access-scope-access-scope-path-request-property-builder function buildes out new instances of 
CfnNetworkInsightsAccessScope$AccessScopePathRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope$PathStatementRequestProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
| `throughResources` | java.util.List | [[cdk.support/lookup-entry]] | `:through-resources` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAccessScope$AccessScopePathRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :through-resources)]
      (. builder throughResources data))
    (.build builder)))


(defn cfn-network-insights-access-scope-analysis-builder
  "The cfn-network-insights-access-scope-analysis-builder function buildes out new instances of 
CfnNetworkInsightsAccessScopeAnalysis$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkInsightsAccessScopeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-insights-access-scope-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAccessScopeAnalysis$Builder/create stack id)]
    (when-let [data (lookup-entry config id :network-insights-access-scope-id)]
      (. builder networkInsightsAccessScopeId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-insights-access-scope-analysis-props-builder
  "The cfn-network-insights-access-scope-analysis-props-builder function buildes out new instances of 
CfnNetworkInsightsAccessScopeAnalysisProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkInsightsAccessScopeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-insights-access-scope-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAccessScopeAnalysisProps$Builder.)]
    (when-let [data (lookup-entry config id :network-insights-access-scope-id)]
      (. builder networkInsightsAccessScopeId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-insights-access-scope-builder
  "The cfn-network-insights-access-scope-builder function buildes out new instances of 
CfnNetworkInsightsAccessScope$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludePaths` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-paths` |
| `matchPaths` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match-paths` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAccessScope$Builder/create stack id)]
    (when-let [data (lookup-entry config id :exclude-paths)]
      (. builder excludePaths data))
    (when-let [data (lookup-entry config id :match-paths)]
      (. builder matchPaths data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-insights-access-scope-packet-header-statement-request-property-builder
  "The cfn-network-insights-access-scope-packet-header-statement-request-property-builder function buildes out new instances of 
CfnNetworkInsightsAccessScope$PacketHeaderStatementRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:destination-addresses` |
| `destinationPorts` | java.util.List | [[cdk.support/lookup-entry]] | `:destination-ports` |
| `destinationPrefixLists` | java.util.List | [[cdk.support/lookup-entry]] | `:destination-prefix-lists` |
| `protocols` | java.util.List | [[cdk.support/lookup-entry]] | `:protocols` |
| `sourceAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:source-addresses` |
| `sourcePorts` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ports` |
| `sourcePrefixLists` | java.util.List | [[cdk.support/lookup-entry]] | `:source-prefix-lists` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAccessScope$PacketHeaderStatementRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-addresses)]
      (. builder destinationAddresses data))
    (when-let [data (lookup-entry config id :destination-ports)]
      (. builder destinationPorts data))
    (when-let [data (lookup-entry config id :destination-prefix-lists)]
      (. builder destinationPrefixLists data))
    (when-let [data (lookup-entry config id :protocols)]
      (. builder protocols data))
    (when-let [data (lookup-entry config id :source-addresses)]
      (. builder sourceAddresses data))
    (when-let [data (lookup-entry config id :source-ports)]
      (. builder sourcePorts data))
    (when-let [data (lookup-entry config id :source-prefix-lists)]
      (. builder sourcePrefixLists data))
    (.build builder)))


(defn cfn-network-insights-access-scope-path-statement-request-property-builder
  "The cfn-network-insights-access-scope-path-statement-request-property-builder function buildes out new instances of 
CfnNetworkInsightsAccessScope$PathStatementRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `packetHeaderStatement` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope$PacketHeaderStatementRequestProperty | [[cdk.support/lookup-entry]] | `:packet-header-statement` |
| `resourceStatement` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope$ResourceStatementRequestProperty | [[cdk.support/lookup-entry]] | `:resource-statement` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAccessScope$PathStatementRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :packet-header-statement)]
      (. builder packetHeaderStatement data))
    (when-let [data (lookup-entry config id :resource-statement)]
      (. builder resourceStatement data))
    (.build builder)))


(defn cfn-network-insights-access-scope-props-builder
  "The cfn-network-insights-access-scope-props-builder function buildes out new instances of 
CfnNetworkInsightsAccessScopeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludePaths` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-paths` |
| `matchPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:match-paths` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAccessScopeProps$Builder.)]
    (when-let [data (lookup-entry config id :exclude-paths)]
      (. builder excludePaths data))
    (when-let [data (lookup-entry config id :match-paths)]
      (. builder matchPaths data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-insights-access-scope-resource-statement-request-property-builder
  "The cfn-network-insights-access-scope-resource-statement-request-property-builder function buildes out new instances of 
CfnNetworkInsightsAccessScope$ResourceStatementRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAccessScope$ResourceStatementRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-types)]
      (. builder resourceTypes data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (.build builder)))


(defn cfn-network-insights-access-scope-through-resources-statement-request-property-builder
  "The cfn-network-insights-access-scope-through-resources-statement-request-property-builder function buildes out new instances of 
CfnNetworkInsightsAccessScope$ThroughResourcesStatementRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-statement` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAccessScope$ThroughResourcesStatementRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-statement)]
      (. builder resourceStatement data))
    (.build builder)))


(defn cfn-network-insights-analysis-additional-detail-property-builder
  "The cfn-network-insights-analysis-additional-detail-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$AdditionalDetailProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalDetailType` | java.lang.String | [[cdk.support/lookup-entry]] | `:additional-detail-type` |
| `component` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:component` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$AdditionalDetailProperty$Builder.)]
    (when-let [data (lookup-entry config id :additional-detail-type)]
      (. builder additionalDetailType data))
    (when-let [data (lookup-entry config id :component)]
      (. builder component data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn cfn-network-insights-analysis-alternate-path-hint-property-builder
  "The cfn-network-insights-analysis-alternate-path-hint-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$AlternatePathHintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-arn` |
| `componentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-id` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$AlternatePathHintProperty$Builder.)]
    (when-let [data (lookup-entry config id :component-arn)]
      (. builder componentArn data))
    (when-let [data (lookup-entry config id :component-id)]
      (. builder componentId data))
    (.build builder)))


(defn cfn-network-insights-analysis-analysis-acl-rule-property-builder
  "The cfn-network-insights-analysis-analysis-acl-rule-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$AnalysisAclRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `egress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:egress` |
| `portRange` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$PortRangeProperty | [[cdk.support/lookup-entry]] | `:port-range` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `ruleAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-action` |
| `ruleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-number` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$AnalysisAclRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :egress)]
      (. builder egress data))
    (when-let [data (lookup-entry config id :port-range)]
      (. builder portRange data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :rule-action)]
      (. builder ruleAction data))
    (when-let [data (lookup-entry config id :rule-number)]
      (. builder ruleNumber data))
    (.build builder)))


(defn cfn-network-insights-analysis-analysis-component-property-builder
  "The cfn-network-insights-analysis-analysis-component-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$AnalysisComponentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$AnalysisComponentProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (.build builder)))


(defn cfn-network-insights-analysis-analysis-load-balancer-listener-property-builder
  "The cfn-network-insights-analysis-analysis-load-balancer-listener-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$AnalysisLoadBalancerListenerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instancePort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-port` |
| `loadBalancerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:load-balancer-port` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$AnalysisLoadBalancerListenerProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-port)]
      (. builder instancePort data))
    (when-let [data (lookup-entry config id :load-balancer-port)]
      (. builder loadBalancerPort data))
    (.build builder)))


(defn cfn-network-insights-analysis-analysis-load-balancer-target-property-builder
  "The cfn-network-insights-analysis-analysis-load-balancer-target-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$AnalysisLoadBalancerTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `instance` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$AnalysisLoadBalancerTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :instance)]
      (. builder instance data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-network-insights-analysis-analysis-packet-header-property-builder
  "The cfn-network-insights-analysis-analysis-packet-header-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$AnalysisPacketHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:destination-addresses` |
| `destinationPortRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:destination-port-ranges` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `sourceAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:source-addresses` |
| `sourcePortRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:source-port-ranges` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$AnalysisPacketHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-addresses)]
      (. builder destinationAddresses data))
    (when-let [data (lookup-entry config id :destination-port-ranges)]
      (. builder destinationPortRanges data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :source-addresses)]
      (. builder sourceAddresses data))
    (when-let [data (lookup-entry config id :source-port-ranges)]
      (. builder sourcePortRanges data))
    (.build builder)))


(defn cfn-network-insights-analysis-analysis-route-table-route-property-builder
  "The cfn-network-insights-analysis-analysis-route-table-route-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$AnalysisRouteTableRouteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr` |
| `destinationPrefixListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-prefix-list-id` |
| `egressOnlyInternetGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:egress-only-internet-gateway-id` |
| `gatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-id` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `natGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:nat-gateway-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `origin` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |
| `vpcPeeringConnectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-peering-connection-id` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$AnalysisRouteTableRouteProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-cidr)]
      (. builder destinationCidr data))
    (when-let [data (lookup-entry config id :destination-prefix-list-id)]
      (. builder destinationPrefixListId data))
    (when-let [data (lookup-entry config id :egress-only-internet-gateway-id)]
      (. builder egressOnlyInternetGatewayId data))
    (when-let [data (lookup-entry config id :gateway-id)]
      (. builder gatewayId data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :nat-gateway-id)]
      (. builder natGatewayId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :origin)]
      (. builder origin data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (when-let [data (lookup-entry config id :vpc-peering-connection-id)]
      (. builder vpcPeeringConnectionId data))
    (.build builder)))


(defn cfn-network-insights-analysis-analysis-security-group-rule-property-builder
  "The cfn-network-insights-analysis-analysis-security-group-rule-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$AnalysisSecurityGroupRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `direction` | java.lang.String | [[cdk.support/lookup-entry]] | `:direction` |
| `portRange` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$PortRangeProperty | [[cdk.support/lookup-entry]] | `:port-range` |
| `prefixListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-list-id` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `securityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-id` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$AnalysisSecurityGroupRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :direction)]
      (. builder direction data))
    (when-let [data (lookup-entry config id :port-range)]
      (. builder portRange data))
    (when-let [data (lookup-entry config id :prefix-list-id)]
      (. builder prefixListId data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :security-group-id)]
      (. builder securityGroupId data))
    (.build builder)))


(defn cfn-network-insights-analysis-builder
  "The cfn-network-insights-analysis-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-accounts` |
| `filterInArns` | java.util.List | [[cdk.support/lookup-entry]] | `:filter-in-arns` |
| `networkInsightsPathId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-insights-path-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-accounts)]
      (. builder additionalAccounts data))
    (when-let [data (lookup-entry config id :filter-in-arns)]
      (. builder filterInArns data))
    (when-let [data (lookup-entry config id :network-insights-path-id)]
      (. builder networkInsightsPathId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-insights-analysis-explanation-property-builder
  "The cfn-network-insights-analysis-explanation-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$ExplanationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acl` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:acl` |
| `aclRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:acl-rule` |
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:addresses` |
| `attachedTo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attached-to` |
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `cidrs` | java.util.List | [[cdk.support/lookup-entry]] | `:cidrs` |
| `classicLoadBalancerListener` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisLoadBalancerListenerProperty | [[cdk.support/lookup-entry]] | `:classic-load-balancer-listener` |
| `component` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:component` |
| `componentAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-account` |
| `componentRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-region` |
| `customerGateway` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customer-gateway` |
| `destination` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `destinationVpc` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:destination-vpc` |
| `direction` | java.lang.String | [[cdk.support/lookup-entry]] | `:direction` |
| `elasticLoadBalancerListener` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:elastic-load-balancer-listener` |
| `explanationCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:explanation-code` |
| `ingressRouteTable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ingress-route-table` |
| `internetGateway` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:internet-gateway` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerListenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:load-balancer-listener-port` |
| `loadBalancerTarget` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:load-balancer-target` |
| `loadBalancerTargetGroup` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:load-balancer-target-group` |
| `loadBalancerTargetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancer-target-groups` |
| `loadBalancerTargetPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:load-balancer-target-port` |
| `missingComponent` | java.lang.String | [[cdk.support/lookup-entry]] | `:missing-component` |
| `natGateway` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:nat-gateway` |
| `networkInterface` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-interface` |
| `packetField` | java.lang.String | [[cdk.support/lookup-entry]] | `:packet-field` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `portRanges` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:port-ranges` |
| `prefixList` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:prefix-list` |
| `protocols` | java.util.List | [[cdk.support/lookup-entry]] | `:protocols` |
| `routeTable` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:route-table` |
| `routeTableRoute` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisRouteTableRouteProperty | [[cdk.support/lookup-entry]] | `:route-table-route` |
| `securityGroup` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:security-group` |
| `securityGroupRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-group-rule` |
| `securityGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-groups` |
| `sourceVpc` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:source-vpc` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `subnet` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:subnet` |
| `subnetRouteTable` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:subnet-route-table` |
| `transitGateway` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:transit-gateway` |
| `transitGatewayAttachment` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:transit-gateway-attachment` |
| `transitGatewayRouteTable` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table` |
| `transitGatewayRouteTableRoute` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$TransitGatewayRouteTableRouteProperty | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-route` |
| `vpc` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcEndpoint` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:vpc-endpoint` |
| `vpcPeeringConnection` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:vpc-peering-connection` |
| `vpnConnection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpn-connection` |
| `vpnGateway` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:vpn-gateway` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$ExplanationProperty$Builder.)]
    (when-let [data (lookup-entry config id :acl)]
      (. builder acl data))
    (when-let [data (lookup-entry config id :acl-rule)]
      (. builder aclRule data))
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :addresses)]
      (. builder addresses data))
    (when-let [data (lookup-entry config id :attached-to)]
      (. builder attachedTo data))
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :cidrs)]
      (. builder cidrs data))
    (when-let [data (lookup-entry config id :classic-load-balancer-listener)]
      (. builder classicLoadBalancerListener data))
    (when-let [data (lookup-entry config id :component)]
      (. builder component data))
    (when-let [data (lookup-entry config id :component-account)]
      (. builder componentAccount data))
    (when-let [data (lookup-entry config id :component-region)]
      (. builder componentRegion data))
    (when-let [data (lookup-entry config id :customer-gateway)]
      (. builder customerGateway data))
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :destination-vpc)]
      (. builder destinationVpc data))
    (when-let [data (lookup-entry config id :direction)]
      (. builder direction data))
    (when-let [data (lookup-entry config id :elastic-load-balancer-listener)]
      (. builder elasticLoadBalancerListener data))
    (when-let [data (lookup-entry config id :explanation-code)]
      (. builder explanationCode data))
    (when-let [data (lookup-entry config id :ingress-route-table)]
      (. builder ingressRouteTable data))
    (when-let [data (lookup-entry config id :internet-gateway)]
      (. builder internetGateway data))
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :load-balancer-listener-port)]
      (. builder loadBalancerListenerPort data))
    (when-let [data (lookup-entry config id :load-balancer-target)]
      (. builder loadBalancerTarget data))
    (when-let [data (lookup-entry config id :load-balancer-target-group)]
      (. builder loadBalancerTargetGroup data))
    (when-let [data (lookup-entry config id :load-balancer-target-groups)]
      (. builder loadBalancerTargetGroups data))
    (when-let [data (lookup-entry config id :load-balancer-target-port)]
      (. builder loadBalancerTargetPort data))
    (when-let [data (lookup-entry config id :missing-component)]
      (. builder missingComponent data))
    (when-let [data (lookup-entry config id :nat-gateway)]
      (. builder natGateway data))
    (when-let [data (lookup-entry config id :network-interface)]
      (. builder networkInterface data))
    (when-let [data (lookup-entry config id :packet-field)]
      (. builder packetField data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :port-ranges)]
      (. builder portRanges data))
    (when-let [data (lookup-entry config id :prefix-list)]
      (. builder prefixList data))
    (when-let [data (lookup-entry config id :protocols)]
      (. builder protocols data))
    (when-let [data (lookup-entry config id :route-table)]
      (. builder routeTable data))
    (when-let [data (lookup-entry config id :route-table-route)]
      (. builder routeTableRoute data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :security-group-rule)]
      (. builder securityGroupRule data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :source-vpc)]
      (. builder sourceVpc data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :subnet)]
      (. builder subnet data))
    (when-let [data (lookup-entry config id :subnet-route-table)]
      (. builder subnetRouteTable data))
    (when-let [data (lookup-entry config id :transit-gateway)]
      (. builder transitGateway data))
    (when-let [data (lookup-entry config id :transit-gateway-attachment)]
      (. builder transitGatewayAttachment data))
    (when-let [data (lookup-entry config id :transit-gateway-route-table)]
      (. builder transitGatewayRouteTable data))
    (when-let [data (lookup-entry config id :transit-gateway-route-table-route)]
      (. builder transitGatewayRouteTableRoute data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-endpoint)]
      (. builder vpcEndpoint data))
    (when-let [data (lookup-entry config id :vpc-peering-connection)]
      (. builder vpcPeeringConnection data))
    (when-let [data (lookup-entry config id :vpn-connection)]
      (. builder vpnConnection data))
    (when-let [data (lookup-entry config id :vpn-gateway)]
      (. builder vpnGateway data))
    (.build builder)))


(defn cfn-network-insights-analysis-path-component-property-builder
  "The cfn-network-insights-analysis-path-component-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$PathComponentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aclRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:acl-rule` |
| `additionalDetails` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-details` |
| `component` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:component` |
| `destinationVpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-vpc` |
| `elasticLoadBalancerListener` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:elastic-load-balancer-listener` |
| `explanations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:explanations` |
| `inboundHeader` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inbound-header` |
| `outboundHeader` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outbound-header` |
| `routeTableRoute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:route-table-route` |
| `securityGroupRule` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisSecurityGroupRuleProperty | [[cdk.support/lookup-entry]] | `:security-group-rule` |
| `sequenceNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sequence-number` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `sourceVpc` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$AnalysisComponentProperty | [[cdk.support/lookup-entry]] | `:source-vpc` |
| `subnet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subnet` |
| `transitGateway` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transit-gateway` |
| `transitGatewayRouteTableRoute` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis$TransitGatewayRouteTableRouteProperty | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-route` |
| `vpc` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$PathComponentProperty$Builder.)]
    (when-let [data (lookup-entry config id :acl-rule)]
      (. builder aclRule data))
    (when-let [data (lookup-entry config id :additional-details)]
      (. builder additionalDetails data))
    (when-let [data (lookup-entry config id :component)]
      (. builder component data))
    (when-let [data (lookup-entry config id :destination-vpc)]
      (. builder destinationVpc data))
    (when-let [data (lookup-entry config id :elastic-load-balancer-listener)]
      (. builder elasticLoadBalancerListener data))
    (when-let [data (lookup-entry config id :explanations)]
      (. builder explanations data))
    (when-let [data (lookup-entry config id :inbound-header)]
      (. builder inboundHeader data))
    (when-let [data (lookup-entry config id :outbound-header)]
      (. builder outboundHeader data))
    (when-let [data (lookup-entry config id :route-table-route)]
      (. builder routeTableRoute data))
    (when-let [data (lookup-entry config id :security-group-rule)]
      (. builder securityGroupRule data))
    (when-let [data (lookup-entry config id :sequence-number)]
      (. builder sequenceNumber data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :source-vpc)]
      (. builder sourceVpc data))
    (when-let [data (lookup-entry config id :subnet)]
      (. builder subnet data))
    (when-let [data (lookup-entry config id :transit-gateway)]
      (. builder transitGateway data))
    (when-let [data (lookup-entry config id :transit-gateway-route-table-route)]
      (. builder transitGatewayRouteTableRoute data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn cfn-network-insights-analysis-port-range-property-builder
  "The cfn-network-insights-analysis-port-range-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$PortRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `from` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from` |
| `to` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$PortRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :from)]
      (. builder from data))
    (when-let [data (lookup-entry config id :to)]
      (. builder to data))
    (.build builder)))


(defn cfn-network-insights-analysis-props-builder
  "The cfn-network-insights-analysis-props-builder function buildes out new instances of 
CfnNetworkInsightsAnalysisProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-accounts` |
| `filterInArns` | java.util.List | [[cdk.support/lookup-entry]] | `:filter-in-arns` |
| `networkInsightsPathId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-insights-path-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysisProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-accounts)]
      (. builder additionalAccounts data))
    (when-let [data (lookup-entry config id :filter-in-arns)]
      (. builder filterInArns data))
    (when-let [data (lookup-entry config id :network-insights-path-id)]
      (. builder networkInsightsPathId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-insights-analysis-transit-gateway-route-table-route-property-builder
  "The cfn-network-insights-analysis-transit-gateway-route-table-route-property-builder function buildes out new instances of 
CfnNetworkInsightsAnalysis$TransitGatewayRouteTableRouteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:attachment-id` |
| `destinationCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr` |
| `prefixListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-list-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `routeOrigin` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-origin` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsAnalysis$TransitGatewayRouteTableRouteProperty$Builder.)]
    (when-let [data (lookup-entry config id :attachment-id)]
      (. builder attachmentId data))
    (when-let [data (lookup-entry config id :destination-cidr)]
      (. builder destinationCidr data))
    (when-let [data (lookup-entry config id :prefix-list-id)]
      (. builder prefixListId data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :route-origin)]
      (. builder routeOrigin data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (.build builder)))


(defn cfn-network-insights-path-builder
  "The cfn-network-insights-path-builder function buildes out new instances of 
CfnNetworkInsightsPath$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `destinationIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-ip` |
| `destinationPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:destination-port` |
| `filterAtDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-at-destination` |
| `filterAtSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-at-source` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `sourceIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-ip` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsPath$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :destination-ip)]
      (. builder destinationIp data))
    (when-let [data (lookup-entry config id :destination-port)]
      (. builder destinationPort data))
    (when-let [data (lookup-entry config id :filter-at-destination)]
      (. builder filterAtDestination data))
    (when-let [data (lookup-entry config id :filter-at-source)]
      (. builder filterAtSource data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :source-ip)]
      (. builder sourceIp data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-insights-path-filter-port-range-property-builder
  "The cfn-network-insights-path-filter-port-range-property-builder function buildes out new instances of 
CfnNetworkInsightsPath$FilterPortRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsPath$FilterPortRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-network-insights-path-path-filter-property-builder
  "The cfn-network-insights-path-path-filter-property-builder function buildes out new instances of 
CfnNetworkInsightsPath$PathFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-address` |
| `destinationPortRange` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath$FilterPortRangeProperty | [[cdk.support/lookup-entry]] | `:destination-port-range` |
| `sourceAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-address` |
| `sourcePortRange` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath$FilterPortRangeProperty | [[cdk.support/lookup-entry]] | `:source-port-range` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsPath$PathFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-address)]
      (. builder destinationAddress data))
    (when-let [data (lookup-entry config id :destination-port-range)]
      (. builder destinationPortRange data))
    (when-let [data (lookup-entry config id :source-address)]
      (. builder sourceAddress data))
    (when-let [data (lookup-entry config id :source-port-range)]
      (. builder sourcePortRange data))
    (.build builder)))


(defn cfn-network-insights-path-props-builder
  "The cfn-network-insights-path-props-builder function buildes out new instances of 
CfnNetworkInsightsPathProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `destinationIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-ip` |
| `destinationPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:destination-port` |
| `filterAtDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-at-destination` |
| `filterAtSource` | software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath$PathFilterProperty | [[cdk.support/lookup-entry]] | `:filter-at-source` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `sourceIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-ip` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNetworkInsightsPathProps$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :destination-ip)]
      (. builder destinationIp data))
    (when-let [data (lookup-entry config id :destination-port)]
      (. builder destinationPort data))
    (when-let [data (lookup-entry config id :filter-at-destination)]
      (. builder filterAtDestination data))
    (when-let [data (lookup-entry config id :filter-at-source)]
      (. builder filterAtSource data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :source-ip)]
      (. builder sourceIp data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-interface-attachment-builder
  "The cfn-network-interface-attachment-builder function buildes out new instances of 
CfnNetworkInterfaceAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `deviceIndex` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-index` |
| `enaSrdSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ena-srd-specification` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |"
  [stack id config]
  (let [builder (CfnNetworkInterfaceAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :device-index)]
      (. builder deviceIndex data))
    (when-let [data (lookup-entry config id :ena-srd-specification)]
      (. builder enaSrdSpecification data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (.build builder)))


(defn cfn-network-interface-attachment-ena-srd-specification-property-builder
  "The cfn-network-interface-attachment-ena-srd-specification-property-builder function buildes out new instances of 
CfnNetworkInterfaceAttachment$EnaSrdSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enaSrdEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ena-srd-enabled` |
| `enaSrdUdpSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ena-srd-udp-specification` |"
  [stack id config]
  (let [builder (CfnNetworkInterfaceAttachment$EnaSrdSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ena-srd-enabled)]
      (. builder enaSrdEnabled data))
    (when-let [data (lookup-entry config id :ena-srd-udp-specification)]
      (. builder enaSrdUdpSpecification data))
    (.build builder)))


(defn cfn-network-interface-attachment-ena-srd-udp-specification-property-builder
  "The cfn-network-interface-attachment-ena-srd-udp-specification-property-builder function buildes out new instances of 
CfnNetworkInterfaceAttachment$EnaSrdUdpSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enaSrdUdpEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ena-srd-udp-enabled` |"
  [stack id config]
  (let [builder (CfnNetworkInterfaceAttachment$EnaSrdUdpSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ena-srd-udp-enabled)]
      (. builder enaSrdUdpEnabled data))
    (.build builder)))


(defn cfn-network-interface-attachment-props-builder
  "The cfn-network-interface-attachment-props-builder function buildes out new instances of 
CfnNetworkInterfaceAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `deviceIndex` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-index` |
| `enaSrdSpecification` | software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment$EnaSrdSpecificationProperty | [[cdk.support/lookup-entry]] | `:ena-srd-specification` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |"
  [stack id config]
  (let [builder (CfnNetworkInterfaceAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :device-index)]
      (. builder deviceIndex data))
    (when-let [data (lookup-entry config id :ena-srd-specification)]
      (. builder enaSrdSpecification data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (.build builder)))


(defn cfn-network-interface-builder
  "The cfn-network-interface-builder function buildes out new instances of 
CfnNetworkInterface$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionTrackingSpecification` | software.amazon.awscdk.services.ec2.CfnNetworkInterface$ConnectionTrackingSpecificationProperty | [[cdk.support/lookup-entry]] | `:connection-tracking-specification` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enablePrimaryIpv6` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-primary-ipv6` |
| `groupSet` | java.util.List | [[cdk.support/lookup-entry]] | `:group-set` |
| `interfaceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-type` |
| `ipv4PrefixCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv4-prefix-count` |
| `ipv4Prefixes` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv4-prefixes` |
| `ipv6AddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-address-count` |
| `ipv6Addresses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ipv6-addresses` |
| `ipv6PrefixCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-prefix-count` |
| `ipv6Prefixes` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv6-prefixes` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `privateIpAddresses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-ip-addresses` |
| `secondaryPrivateIpAddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:secondary-private-ip-address-count` |
| `sourceDestCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:source-dest-check` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNetworkInterface$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connection-tracking-specification)]
      (. builder connectionTrackingSpecification data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enable-primary-ipv6)]
      (. builder enablePrimaryIpv6 data))
    (when-let [data (lookup-entry config id :group-set)]
      (. builder groupSet data))
    (when-let [data (lookup-entry config id :interface-type)]
      (. builder interfaceType data))
    (when-let [data (lookup-entry config id :ipv4-prefix-count)]
      (. builder ipv4PrefixCount data))
    (when-let [data (lookup-entry config id :ipv4-prefixes)]
      (. builder ipv4Prefixes data))
    (when-let [data (lookup-entry config id :ipv6-address-count)]
      (. builder ipv6AddressCount data))
    (when-let [data (lookup-entry config id :ipv6-addresses)]
      (. builder ipv6Addresses data))
    (when-let [data (lookup-entry config id :ipv6-prefix-count)]
      (. builder ipv6PrefixCount data))
    (when-let [data (lookup-entry config id :ipv6-prefixes)]
      (. builder ipv6Prefixes data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :private-ip-addresses)]
      (. builder privateIpAddresses data))
    (when-let [data (lookup-entry config id :secondary-private-ip-address-count)]
      (. builder secondaryPrivateIpAddressCount data))
    (when-let [data (lookup-entry config id :source-dest-check)]
      (. builder sourceDestCheck data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-interface-connection-tracking-specification-property-builder
  "The cfn-network-interface-connection-tracking-specification-property-builder function buildes out new instances of 
CfnNetworkInterface$ConnectionTrackingSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tcpEstablishedTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:tcp-established-timeout` |
| `udpStreamTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:udp-stream-timeout` |
| `udpTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:udp-timeout` |"
  [stack id config]
  (let [builder (CfnNetworkInterface$ConnectionTrackingSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :tcp-established-timeout)]
      (. builder tcpEstablishedTimeout data))
    (when-let [data (lookup-entry config id :udp-stream-timeout)]
      (. builder udpStreamTimeout data))
    (when-let [data (lookup-entry config id :udp-timeout)]
      (. builder udpTimeout data))
    (.build builder)))


(defn cfn-network-interface-instance-ipv6-address-property-builder
  "The cfn-network-interface-instance-ipv6-address-property-builder function buildes out new instances of 
CfnNetworkInterface$InstanceIpv6AddressProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv6Address` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-address` |"
  [stack id config]
  (let [builder (CfnNetworkInterface$InstanceIpv6AddressProperty$Builder.)]
    (when-let [data (lookup-entry config id :ipv6-address)]
      (. builder ipv6Address data))
    (.build builder)))


(defn cfn-network-interface-ipv4-prefix-specification-property-builder
  "The cfn-network-interface-ipv4-prefix-specification-property-builder function buildes out new instances of 
CfnNetworkInterface$Ipv4PrefixSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv4Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-prefix` |"
  [stack id config]
  (let [builder (CfnNetworkInterface$Ipv4PrefixSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ipv4-prefix)]
      (. builder ipv4Prefix data))
    (.build builder)))


(defn cfn-network-interface-ipv6-prefix-specification-property-builder
  "The cfn-network-interface-ipv6-prefix-specification-property-builder function buildes out new instances of 
CfnNetworkInterface$Ipv6PrefixSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv6Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-prefix` |"
  [stack id config]
  (let [builder (CfnNetworkInterface$Ipv6PrefixSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :ipv6-prefix)]
      (. builder ipv6Prefix data))
    (.build builder)))


(defn cfn-network-interface-permission-builder
  "The cfn-network-interface-permission-builder function buildes out new instances of 
CfnNetworkInterfacePermission$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |"
  [stack id config]
  (let [builder (CfnNetworkInterfacePermission$Builder/create stack id)]
    (when-let [data (lookup-entry config id :aws-account-id)]
      (. builder awsAccountId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :permission)]
      (. builder permission data))
    (.build builder)))


(defn cfn-network-interface-permission-props-builder
  "The cfn-network-interface-permission-props-builder function buildes out new instances of 
CfnNetworkInterfacePermissionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `permission` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission` |"
  [stack id config]
  (let [builder (CfnNetworkInterfacePermissionProps$Builder.)]
    (when-let [data (lookup-entry config id :aws-account-id)]
      (. builder awsAccountId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :permission)]
      (. builder permission data))
    (.build builder)))


(defn cfn-network-interface-private-ip-address-specification-property-builder
  "The cfn-network-interface-private-ip-address-specification-property-builder function buildes out new instances of 
CfnNetworkInterface$PrivateIpAddressSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |"
  [stack id config]
  (let [builder (CfnNetworkInterface$PrivateIpAddressSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :primary)]
      (. builder primary data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (.build builder)))


(defn cfn-network-interface-props-builder
  "The cfn-network-interface-props-builder function buildes out new instances of 
CfnNetworkInterfaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionTrackingSpecification` | software.amazon.awscdk.services.ec2.CfnNetworkInterface$ConnectionTrackingSpecificationProperty | [[cdk.support/lookup-entry]] | `:connection-tracking-specification` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enablePrimaryIpv6` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-primary-ipv6` |
| `groupSet` | java.util.List | [[cdk.support/lookup-entry]] | `:group-set` |
| `interfaceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:interface-type` |
| `ipv4PrefixCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv4-prefix-count` |
| `ipv4Prefixes` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv4-prefixes` |
| `ipv6AddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-address-count` |
| `ipv6Addresses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ipv6-addresses` |
| `ipv6PrefixCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-prefix-count` |
| `ipv6Prefixes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ipv6-prefixes` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `privateIpAddresses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-ip-addresses` |
| `secondaryPrivateIpAddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:secondary-private-ip-address-count` |
| `sourceDestCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-dest-check` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNetworkInterfaceProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-tracking-specification)]
      (. builder connectionTrackingSpecification data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enable-primary-ipv6)]
      (. builder enablePrimaryIpv6 data))
    (when-let [data (lookup-entry config id :group-set)]
      (. builder groupSet data))
    (when-let [data (lookup-entry config id :interface-type)]
      (. builder interfaceType data))
    (when-let [data (lookup-entry config id :ipv4-prefix-count)]
      (. builder ipv4PrefixCount data))
    (when-let [data (lookup-entry config id :ipv4-prefixes)]
      (. builder ipv4Prefixes data))
    (when-let [data (lookup-entry config id :ipv6-address-count)]
      (. builder ipv6AddressCount data))
    (when-let [data (lookup-entry config id :ipv6-addresses)]
      (. builder ipv6Addresses data))
    (when-let [data (lookup-entry config id :ipv6-prefix-count)]
      (. builder ipv6PrefixCount data))
    (when-let [data (lookup-entry config id :ipv6-prefixes)]
      (. builder ipv6Prefixes data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :private-ip-addresses)]
      (. builder privateIpAddresses data))
    (when-let [data (lookup-entry config id :secondary-private-ip-address-count)]
      (. builder secondaryPrivateIpAddressCount data))
    (when-let [data (lookup-entry config id :source-dest-check)]
      (. builder sourceDestCheck data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-network-performance-metric-subscription-builder
  "The cfn-network-performance-metric-subscription-builder function buildes out new instances of 
CfnNetworkPerformanceMetricSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `metric` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |"
  [stack id config]
  (let [builder (CfnNetworkPerformanceMetricSubscription$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :metric)]
      (. builder metric data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (.build builder)))


(defn cfn-network-performance-metric-subscription-props-builder
  "The cfn-network-performance-metric-subscription-props-builder function buildes out new instances of 
CfnNetworkPerformanceMetricSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `metric` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |"
  [stack id config]
  (let [builder (CfnNetworkPerformanceMetricSubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :metric)]
      (. builder metric data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (.build builder)))


(defn cfn-placement-group-builder
  "The cfn-placement-group-builder function buildes out new instances of 
CfnPlacementGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:partition-count` |
| `spreadLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:spread-level` |
| `strategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:strategy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPlacementGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :partition-count)]
      (. builder partitionCount data))
    (when-let [data (lookup-entry config id :spread-level)]
      (. builder spreadLevel data))
    (when-let [data (lookup-entry config id :strategy)]
      (. builder strategy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-placement-group-props-builder
  "The cfn-placement-group-props-builder function buildes out new instances of 
CfnPlacementGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:partition-count` |
| `spreadLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:spread-level` |
| `strategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:strategy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPlacementGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :partition-count)]
      (. builder partitionCount data))
    (when-let [data (lookup-entry config id :spread-level)]
      (. builder spreadLevel data))
    (when-let [data (lookup-entry config id :strategy)]
      (. builder strategy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-prefix-list-builder
  "The cfn-prefix-list-builder function buildes out new instances of 
CfnPrefixList$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:address-family` |
| `entries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:entries` |
| `maxEntries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-entries` |
| `prefixListName` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-list-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPrefixList$Builder/create stack id)]
    (when-let [data (lookup-entry config id :address-family)]
      (. builder addressFamily data))
    (when-let [data (lookup-entry config id :entries)]
      (. builder entries data))
    (when-let [data (lookup-entry config id :max-entries)]
      (. builder maxEntries data))
    (when-let [data (lookup-entry config id :prefix-list-name)]
      (. builder prefixListName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-prefix-list-entry-property-builder
  "The cfn-prefix-list-entry-property-builder function buildes out new instances of 
CfnPrefixList$EntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnPrefixList$EntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-prefix-list-props-builder
  "The cfn-prefix-list-props-builder function buildes out new instances of 
CfnPrefixListProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:address-family` |
| `entries` | java.util.List | [[cdk.support/lookup-entry]] | `:entries` |
| `maxEntries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-entries` |
| `prefixListName` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-list-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPrefixListProps$Builder.)]
    (when-let [data (lookup-entry config id :address-family)]
      (. builder addressFamily data))
    (when-let [data (lookup-entry config id :entries)]
      (. builder entries data))
    (when-let [data (lookup-entry config id :max-entries)]
      (. builder maxEntries data))
    (when-let [data (lookup-entry config id :prefix-list-name)]
      (. builder prefixListName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-route-builder
  "The cfn-route-builder function buildes out new instances of 
CfnRoute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `carrierGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:carrier-gateway-id` |
| `coreNetworkArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-arn` |
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `destinationIpv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-ipv6-cidr-block` |
| `destinationPrefixListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-prefix-list-id` |
| `egressOnlyInternetGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:egress-only-internet-gateway-id` |
| `gatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-id` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `localGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-id` |
| `natGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:nat-gateway-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `routeTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-table-id` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcPeeringConnectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-peering-connection-id` |"
  [stack id config]
  (let [builder (CfnRoute$Builder/create stack id)]
    (when-let [data (lookup-entry config id :carrier-gateway-id)]
      (. builder carrierGatewayId data))
    (when-let [data (lookup-entry config id :core-network-arn)]
      (. builder coreNetworkArn data))
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :destination-ipv6-cidr-block)]
      (. builder destinationIpv6CidrBlock data))
    (when-let [data (lookup-entry config id :destination-prefix-list-id)]
      (. builder destinationPrefixListId data))
    (when-let [data (lookup-entry config id :egress-only-internet-gateway-id)]
      (. builder egressOnlyInternetGatewayId data))
    (when-let [data (lookup-entry config id :gateway-id)]
      (. builder gatewayId data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :local-gateway-id)]
      (. builder localGatewayId data))
    (when-let [data (lookup-entry config id :nat-gateway-id)]
      (. builder natGatewayId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :route-table-id)]
      (. builder routeTableId data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (when-let [data (lookup-entry config id :vpc-peering-connection-id)]
      (. builder vpcPeeringConnectionId data))
    (.build builder)))


(defn cfn-route-props-builder
  "The cfn-route-props-builder function buildes out new instances of 
CfnRouteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `carrierGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:carrier-gateway-id` |
| `coreNetworkArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-network-arn` |
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `destinationIpv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-ipv6-cidr-block` |
| `destinationPrefixListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-prefix-list-id` |
| `egressOnlyInternetGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:egress-only-internet-gateway-id` |
| `gatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-id` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `localGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-gateway-id` |
| `natGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:nat-gateway-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `routeTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-table-id` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcPeeringConnectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-peering-connection-id` |"
  [stack id config]
  (let [builder (CfnRouteProps$Builder.)]
    (when-let [data (lookup-entry config id :carrier-gateway-id)]
      (. builder carrierGatewayId data))
    (when-let [data (lookup-entry config id :core-network-arn)]
      (. builder coreNetworkArn data))
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :destination-ipv6-cidr-block)]
      (. builder destinationIpv6CidrBlock data))
    (when-let [data (lookup-entry config id :destination-prefix-list-id)]
      (. builder destinationPrefixListId data))
    (when-let [data (lookup-entry config id :egress-only-internet-gateway-id)]
      (. builder egressOnlyInternetGatewayId data))
    (when-let [data (lookup-entry config id :gateway-id)]
      (. builder gatewayId data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :local-gateway-id)]
      (. builder localGatewayId data))
    (when-let [data (lookup-entry config id :nat-gateway-id)]
      (. builder natGatewayId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :route-table-id)]
      (. builder routeTableId data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (when-let [data (lookup-entry config id :vpc-peering-connection-id)]
      (. builder vpcPeeringConnectionId data))
    (.build builder)))


(defn cfn-route-table-builder
  "The cfn-route-table-builder function buildes out new instances of 
CfnRouteTable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnRouteTable$Builder/create stack id)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-route-table-props-builder
  "The cfn-route-table-props-builder function buildes out new instances of 
CfnRouteTableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnRouteTableProps$Builder.)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-security-group-builder
  "The cfn-security-group-builder function buildes out new instances of 
CfnSecurityGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-description` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `securityGroupEgress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-group-egress` |
| `securityGroupIngress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-group-ingress` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnSecurityGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :group-description)]
      (. builder groupDescription data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :security-group-egress)]
      (. builder securityGroupEgress data))
    (when-let [data (lookup-entry config id :security-group-ingress)]
      (. builder securityGroupIngress data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-security-group-egress-builder
  "The cfn-security-group-egress-builder function buildes out new instances of 
CfnSecurityGroupEgress$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ip` |
| `cidrIpv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ipv6` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationPrefixListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-prefix-list-id` |
| `destinationSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-security-group-id` |
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `ipProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-protocol` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnSecurityGroupEgress$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidr-ip)]
      (. builder cidrIp data))
    (when-let [data (lookup-entry config id :cidr-ipv6)]
      (. builder cidrIpv6 data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-prefix-list-id)]
      (. builder destinationPrefixListId data))
    (when-let [data (lookup-entry config id :destination-security-group-id)]
      (. builder destinationSecurityGroupId data))
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (when-let [data (lookup-entry config id :ip-protocol)]
      (. builder ipProtocol data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-security-group-egress-property-builder
  "The cfn-security-group-egress-property-builder function buildes out new instances of 
CfnSecurityGroup$EgressProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ip` |
| `cidrIpv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ipv6` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationPrefixListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-prefix-list-id` |
| `destinationSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-security-group-id` |
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `ipProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-protocol` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnSecurityGroup$EgressProperty$Builder.)]
    (when-let [data (lookup-entry config id :cidr-ip)]
      (. builder cidrIp data))
    (when-let [data (lookup-entry config id :cidr-ipv6)]
      (. builder cidrIpv6 data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-prefix-list-id)]
      (. builder destinationPrefixListId data))
    (when-let [data (lookup-entry config id :destination-security-group-id)]
      (. builder destinationSecurityGroupId data))
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :ip-protocol)]
      (. builder ipProtocol data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-security-group-egress-props-builder
  "The cfn-security-group-egress-props-builder function buildes out new instances of 
CfnSecurityGroupEgressProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ip` |
| `cidrIpv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ipv6` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationPrefixListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-prefix-list-id` |
| `destinationSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-security-group-id` |
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `ipProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-protocol` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnSecurityGroupEgressProps$Builder.)]
    (when-let [data (lookup-entry config id :cidr-ip)]
      (. builder cidrIp data))
    (when-let [data (lookup-entry config id :cidr-ipv6)]
      (. builder cidrIpv6 data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-prefix-list-id)]
      (. builder destinationPrefixListId data))
    (when-let [data (lookup-entry config id :destination-security-group-id)]
      (. builder destinationSecurityGroupId data))
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (when-let [data (lookup-entry config id :ip-protocol)]
      (. builder ipProtocol data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-security-group-ingress-builder
  "The cfn-security-group-ingress-builder function buildes out new instances of 
CfnSecurityGroupIngress$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ip` |
| `cidrIpv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ipv6` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `ipProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-protocol` |
| `sourcePrefixListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-prefix-list-id` |
| `sourceSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-security-group-id` |
| `sourceSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-security-group-name` |
| `sourceSecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-security-group-owner-id` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnSecurityGroupIngress$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidr-ip)]
      (. builder cidrIp data))
    (when-let [data (lookup-entry config id :cidr-ipv6)]
      (. builder cidrIpv6 data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :ip-protocol)]
      (. builder ipProtocol data))
    (when-let [data (lookup-entry config id :source-prefix-list-id)]
      (. builder sourcePrefixListId data))
    (when-let [data (lookup-entry config id :source-security-group-id)]
      (. builder sourceSecurityGroupId data))
    (when-let [data (lookup-entry config id :source-security-group-name)]
      (. builder sourceSecurityGroupName data))
    (when-let [data (lookup-entry config id :source-security-group-owner-id)]
      (. builder sourceSecurityGroupOwnerId data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-security-group-ingress-property-builder
  "The cfn-security-group-ingress-property-builder function buildes out new instances of 
CfnSecurityGroup$IngressProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ip` |
| `cidrIpv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ipv6` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `ipProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-protocol` |
| `sourcePrefixListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-prefix-list-id` |
| `sourceSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-security-group-id` |
| `sourceSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-security-group-name` |
| `sourceSecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-security-group-owner-id` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnSecurityGroup$IngressProperty$Builder.)]
    (when-let [data (lookup-entry config id :cidr-ip)]
      (. builder cidrIp data))
    (when-let [data (lookup-entry config id :cidr-ipv6)]
      (. builder cidrIpv6 data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :ip-protocol)]
      (. builder ipProtocol data))
    (when-let [data (lookup-entry config id :source-prefix-list-id)]
      (. builder sourcePrefixListId data))
    (when-let [data (lookup-entry config id :source-security-group-id)]
      (. builder sourceSecurityGroupId data))
    (when-let [data (lookup-entry config id :source-security-group-name)]
      (. builder sourceSecurityGroupName data))
    (when-let [data (lookup-entry config id :source-security-group-owner-id)]
      (. builder sourceSecurityGroupOwnerId data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-security-group-ingress-props-builder
  "The cfn-security-group-ingress-props-builder function buildes out new instances of 
CfnSecurityGroupIngressProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ip` |
| `cidrIpv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-ipv6` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `ipProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-protocol` |
| `sourcePrefixListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-prefix-list-id` |
| `sourceSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-security-group-id` |
| `sourceSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-security-group-name` |
| `sourceSecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-security-group-owner-id` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnSecurityGroupIngressProps$Builder.)]
    (when-let [data (lookup-entry config id :cidr-ip)]
      (. builder cidrIp data))
    (when-let [data (lookup-entry config id :cidr-ipv6)]
      (. builder cidrIpv6 data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :ip-protocol)]
      (. builder ipProtocol data))
    (when-let [data (lookup-entry config id :source-prefix-list-id)]
      (. builder sourcePrefixListId data))
    (when-let [data (lookup-entry config id :source-security-group-id)]
      (. builder sourceSecurityGroupId data))
    (when-let [data (lookup-entry config id :source-security-group-name)]
      (. builder sourceSecurityGroupName data))
    (when-let [data (lookup-entry config id :source-security-group-owner-id)]
      (. builder sourceSecurityGroupOwnerId data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-security-group-props-builder
  "The cfn-security-group-props-builder function buildes out new instances of 
CfnSecurityGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-description` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `securityGroupEgress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-group-egress` |
| `securityGroupIngress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-group-ingress` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnSecurityGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :group-description)]
      (. builder groupDescription data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :security-group-egress)]
      (. builder securityGroupEgress data))
    (when-let [data (lookup-entry config id :security-group-ingress)]
      (. builder securityGroupIngress data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-snapshot-block-public-access-builder
  "The cfn-snapshot-block-public-access-builder function buildes out new instances of 
CfnSnapshotBlockPublicAccess$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |"
  [stack id config]
  (let [builder (CfnSnapshotBlockPublicAccess$Builder/create stack id)]
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (.build builder)))


(defn cfn-snapshot-block-public-access-props-builder
  "The cfn-snapshot-block-public-access-props-builder function buildes out new instances of 
CfnSnapshotBlockPublicAccessProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |"
  [stack id config]
  (let [builder (CfnSnapshotBlockPublicAccessProps$Builder.)]
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (.build builder)))


(defn cfn-spot-fleet-accelerator-count-request-property-builder
  "The cfn-spot-fleet-accelerator-count-request-property-builder function buildes out new instances of 
CfnSpotFleet$AcceleratorCountRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnSpotFleet$AcceleratorCountRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-spot-fleet-accelerator-total-memory-mi-b-request-property-builder
  "The cfn-spot-fleet-accelerator-total-memory-mi-b-request-property-builder function buildes out new instances of 
CfnSpotFleet$AcceleratorTotalMemoryMiBRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnSpotFleet$AcceleratorTotalMemoryMiBRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-spot-fleet-baseline-ebs-bandwidth-mbps-request-property-builder
  "The cfn-spot-fleet-baseline-ebs-bandwidth-mbps-request-property-builder function buildes out new instances of 
CfnSpotFleet$BaselineEbsBandwidthMbpsRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnSpotFleet$BaselineEbsBandwidthMbpsRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-spot-fleet-block-device-mapping-property-builder
  "The cfn-spot-fleet-block-device-mapping-property-builder function buildes out new instances of 
CfnSpotFleet$BlockDeviceMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `ebs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs` |
| `noDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:no-device` |
| `virtualName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-name` |"
  [stack id config]
  (let [builder (CfnSpotFleet$BlockDeviceMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :device-name)]
      (. builder deviceName data))
    (when-let [data (lookup-entry config id :ebs)]
      (. builder ebs data))
    (when-let [data (lookup-entry config id :no-device)]
      (. builder noDevice data))
    (when-let [data (lookup-entry config id :virtual-name)]
      (. builder virtualName data))
    (.build builder)))


(defn cfn-spot-fleet-builder
  "The cfn-spot-fleet-builder function buildes out new instances of 
CfnSpotFleet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spotFleetRequestConfigData` | software.amazon.awscdk.services.ec2.CfnSpotFleet$SpotFleetRequestConfigDataProperty | [[cdk.support/lookup-entry]] | `:spot-fleet-request-config-data` |"
  [stack id config]
  (let [builder (CfnSpotFleet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :spot-fleet-request-config-data)]
      (. builder spotFleetRequestConfigData data))
    (.build builder)))


(defn cfn-spot-fleet-classic-load-balancer-property-builder
  "The cfn-spot-fleet-classic-load-balancer-property-builder function buildes out new instances of 
CfnSpotFleet$ClassicLoadBalancerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnSpotFleet$ClassicLoadBalancerProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-spot-fleet-classic-load-balancers-config-property-builder
  "The cfn-spot-fleet-classic-load-balancers-config-property-builder function buildes out new instances of 
CfnSpotFleet$ClassicLoadBalancersConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classicLoadBalancers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:classic-load-balancers` |"
  [stack id config]
  (let [builder (CfnSpotFleet$ClassicLoadBalancersConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :classic-load-balancers)]
      (. builder classicLoadBalancers data))
    (.build builder)))


(defn cfn-spot-fleet-ebs-block-device-property-builder
  "The cfn-spot-fleet-ebs-block-device-property-builder function buildes out new instances of 
CfnSpotFleet$EbsBlockDeviceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnSpotFleet$EbsBlockDeviceProperty$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-spot-fleet-fleet-launch-template-specification-property-builder
  "The cfn-spot-fleet-fleet-launch-template-specification-property-builder function buildes out new instances of 
CfnSpotFleet$FleetLaunchTemplateSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnSpotFleet$FleetLaunchTemplateSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-id)]
      (. builder launchTemplateId data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-spot-fleet-group-identifier-property-builder
  "The cfn-spot-fleet-group-identifier-property-builder function buildes out new instances of 
CfnSpotFleet$GroupIdentifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |"
  [stack id config]
  (let [builder (CfnSpotFleet$GroupIdentifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (.build builder)))


(defn cfn-spot-fleet-iam-instance-profile-specification-property-builder
  "The cfn-spot-fleet-iam-instance-profile-specification-property-builder function buildes out new instances of 
CfnSpotFleet$IamInstanceProfileSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnSpotFleet$IamInstanceProfileSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-spot-fleet-instance-ipv6-address-property-builder
  "The cfn-spot-fleet-instance-ipv6-address-property-builder function buildes out new instances of 
CfnSpotFleet$InstanceIpv6AddressProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv6Address` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-address` |"
  [stack id config]
  (let [builder (CfnSpotFleet$InstanceIpv6AddressProperty$Builder.)]
    (when-let [data (lookup-entry config id :ipv6-address)]
      (. builder ipv6Address data))
    (.build builder)))


(defn cfn-spot-fleet-instance-network-interface-specification-property-builder
  "The cfn-spot-fleet-instance-network-interface-specification-property-builder function buildes out new instances of 
CfnSpotFleet$InstanceNetworkInterfaceSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatePublicIpAddress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `deleteOnTermination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:device-index` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `ipv6AddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-address-count` |
| `ipv6Addresses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ipv6-addresses` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `privateIpAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:private-ip-addresses` |
| `secondaryPrivateIpAddressCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:secondary-private-ip-address-count` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnSpotFleet$InstanceNetworkInterfaceSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :device-index)]
      (. builder deviceIndex data))
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :ipv6-address-count)]
      (. builder ipv6AddressCount data))
    (when-let [data (lookup-entry config id :ipv6-addresses)]
      (. builder ipv6Addresses data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :private-ip-addresses)]
      (. builder privateIpAddresses data))
    (when-let [data (lookup-entry config id :secondary-private-ip-address-count)]
      (. builder secondaryPrivateIpAddressCount data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-spot-fleet-instance-requirements-request-property-builder
  "The cfn-spot-fleet-instance-requirements-request-property-builder function buildes out new instances of 
CfnSpotFleet$InstanceRequirementsRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceleratorCount` | software.amazon.awscdk.services.ec2.CfnSpotFleet$AcceleratorCountRequestProperty | [[cdk.support/lookup-entry]] | `:accelerator-count` |
| `acceleratorManufacturers` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-manufacturers` |
| `acceleratorNames` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-names` |
| `acceleratorTotalMemoryMiB` | software.amazon.awscdk.services.ec2.CfnSpotFleet$AcceleratorTotalMemoryMiBRequestProperty | [[cdk.support/lookup-entry]] | `:accelerator-total-memory-mi-b` |
| `acceleratorTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:accelerator-types` |
| `allowedInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-instance-types` |
| `bareMetal` | java.lang.String | [[cdk.support/lookup-entry]] | `:bare-metal` |
| `baselineEbsBandwidthMbps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:baseline-ebs-bandwidth-mbps` |
| `burstablePerformance` | java.lang.String | [[cdk.support/lookup-entry]] | `:burstable-performance` |
| `cpuManufacturers` | java.util.List | [[cdk.support/lookup-entry]] | `:cpu-manufacturers` |
| `excludedInstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-instance-types` |
| `instanceGenerations` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-generations` |
| `localStorage` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-storage` |
| `localStorageTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:local-storage-types` |
| `maxSpotPriceAsPercentageOfOptimalOnDemandPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-spot-price-as-percentage-of-optimal-on-demand-price` |
| `memoryGiBPerVCpu` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:memory-gi-b-per-v-cpu` |
| `memoryMiB` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:memory-mi-b` |
| `networkBandwidthGbps` | software.amazon.awscdk.services.ec2.CfnSpotFleet$NetworkBandwidthGbpsRequestProperty | [[cdk.support/lookup-entry]] | `:network-bandwidth-gbps` |
| `networkInterfaceCount` | software.amazon.awscdk.services.ec2.CfnSpotFleet$NetworkInterfaceCountRequestProperty | [[cdk.support/lookup-entry]] | `:network-interface-count` |
| `onDemandMaxPricePercentageOverLowestPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:on-demand-max-price-percentage-over-lowest-price` |
| `requireHibernateSupport` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:require-hibernate-support` |
| `spotMaxPricePercentageOverLowestPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:spot-max-price-percentage-over-lowest-price` |
| `totalLocalStorageGb` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:total-local-storage-gb` |
| `vCpuCount` | software.amazon.awscdk.services.ec2.CfnSpotFleet$VCpuCountRangeRequestProperty | [[cdk.support/lookup-entry]] | `:v-cpu-count` |"
  [stack id config]
  (let [builder (CfnSpotFleet$InstanceRequirementsRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :accelerator-count)]
      (. builder acceleratorCount data))
    (when-let [data (lookup-entry config id :accelerator-manufacturers)]
      (. builder acceleratorManufacturers data))
    (when-let [data (lookup-entry config id :accelerator-names)]
      (. builder acceleratorNames data))
    (when-let [data (lookup-entry config id :accelerator-total-memory-mi-b)]
      (. builder acceleratorTotalMemoryMiB data))
    (when-let [data (lookup-entry config id :accelerator-types)]
      (. builder acceleratorTypes data))
    (when-let [data (lookup-entry config id :allowed-instance-types)]
      (. builder allowedInstanceTypes data))
    (when-let [data (lookup-entry config id :bare-metal)]
      (. builder bareMetal data))
    (when-let [data (lookup-entry config id :baseline-ebs-bandwidth-mbps)]
      (. builder baselineEbsBandwidthMbps data))
    (when-let [data (lookup-entry config id :burstable-performance)]
      (. builder burstablePerformance data))
    (when-let [data (lookup-entry config id :cpu-manufacturers)]
      (. builder cpuManufacturers data))
    (when-let [data (lookup-entry config id :excluded-instance-types)]
      (. builder excludedInstanceTypes data))
    (when-let [data (lookup-entry config id :instance-generations)]
      (. builder instanceGenerations data))
    (when-let [data (lookup-entry config id :local-storage)]
      (. builder localStorage data))
    (when-let [data (lookup-entry config id :local-storage-types)]
      (. builder localStorageTypes data))
    (when-let [data (lookup-entry config id :max-spot-price-as-percentage-of-optimal-on-demand-price)]
      (. builder maxSpotPriceAsPercentageOfOptimalOnDemandPrice data))
    (when-let [data (lookup-entry config id :memory-gi-b-per-v-cpu)]
      (. builder memoryGiBPerVCpu data))
    (when-let [data (lookup-entry config id :memory-mi-b)]
      (. builder memoryMiB data))
    (when-let [data (lookup-entry config id :network-bandwidth-gbps)]
      (. builder networkBandwidthGbps data))
    (when-let [data (lookup-entry config id :network-interface-count)]
      (. builder networkInterfaceCount data))
    (when-let [data (lookup-entry config id :on-demand-max-price-percentage-over-lowest-price)]
      (. builder onDemandMaxPricePercentageOverLowestPrice data))
    (when-let [data (lookup-entry config id :require-hibernate-support)]
      (. builder requireHibernateSupport data))
    (when-let [data (lookup-entry config id :spot-max-price-percentage-over-lowest-price)]
      (. builder spotMaxPricePercentageOverLowestPrice data))
    (when-let [data (lookup-entry config id :total-local-storage-gb)]
      (. builder totalLocalStorageGb data))
    (when-let [data (lookup-entry config id :v-cpu-count)]
      (. builder vCpuCount data))
    (.build builder)))


(defn cfn-spot-fleet-launch-template-config-property-builder
  "The cfn-spot-fleet-launch-template-config-property-builder function buildes out new instances of 
CfnSpotFleet$LaunchTemplateConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-template-specification` |
| `overrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:overrides` |"
  [stack id config]
  (let [builder (CfnSpotFleet$LaunchTemplateConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-specification)]
      (. builder launchTemplateSpecification data))
    (when-let [data (lookup-entry config id :overrides)]
      (. builder overrides data))
    (.build builder)))


(defn cfn-spot-fleet-launch-template-overrides-property-builder
  "The cfn-spot-fleet-launch-template-overrides-property-builder function buildes out new instances of 
CfnSpotFleet$LaunchTemplateOverridesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `instanceRequirements` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-requirements` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `spotPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-price` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `weightedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weighted-capacity` |"
  [stack id config]
  (let [builder (CfnSpotFleet$LaunchTemplateOverridesProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :instance-requirements)]
      (. builder instanceRequirements data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :spot-price)]
      (. builder spotPrice data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :weighted-capacity)]
      (. builder weightedCapacity data))
    (.build builder)))


(defn cfn-spot-fleet-load-balancers-config-property-builder
  "The cfn-spot-fleet-load-balancers-config-property-builder function buildes out new instances of 
CfnSpotFleet$LoadBalancersConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classicLoadBalancersConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:classic-load-balancers-config` |
| `targetGroupsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-groups-config` |"
  [stack id config]
  (let [builder (CfnSpotFleet$LoadBalancersConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :classic-load-balancers-config)]
      (. builder classicLoadBalancersConfig data))
    (when-let [data (lookup-entry config id :target-groups-config)]
      (. builder targetGroupsConfig data))
    (.build builder)))


(defn cfn-spot-fleet-memory-gi-b-per-v-cpu-request-property-builder
  "The cfn-spot-fleet-memory-gi-b-per-v-cpu-request-property-builder function buildes out new instances of 
CfnSpotFleet$MemoryGiBPerVCpuRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnSpotFleet$MemoryGiBPerVCpuRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-spot-fleet-memory-mi-b-request-property-builder
  "The cfn-spot-fleet-memory-mi-b-request-property-builder function buildes out new instances of 
CfnSpotFleet$MemoryMiBRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnSpotFleet$MemoryMiBRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-spot-fleet-network-bandwidth-gbps-request-property-builder
  "The cfn-spot-fleet-network-bandwidth-gbps-request-property-builder function buildes out new instances of 
CfnSpotFleet$NetworkBandwidthGbpsRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnSpotFleet$NetworkBandwidthGbpsRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-spot-fleet-network-interface-count-request-property-builder
  "The cfn-spot-fleet-network-interface-count-request-property-builder function buildes out new instances of 
CfnSpotFleet$NetworkInterfaceCountRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnSpotFleet$NetworkInterfaceCountRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-spot-fleet-private-ip-address-specification-property-builder
  "The cfn-spot-fleet-private-ip-address-specification-property-builder function buildes out new instances of 
CfnSpotFleet$PrivateIpAddressSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `primary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |"
  [stack id config]
  (let [builder (CfnSpotFleet$PrivateIpAddressSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :primary)]
      (. builder primary data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (.build builder)))


(defn cfn-spot-fleet-props-builder
  "The cfn-spot-fleet-props-builder function buildes out new instances of 
CfnSpotFleetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `spotFleetRequestConfigData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spot-fleet-request-config-data` |"
  [stack id config]
  (let [builder (CfnSpotFleetProps$Builder.)]
    (when-let [data (lookup-entry config id :spot-fleet-request-config-data)]
      (. builder spotFleetRequestConfigData data))
    (.build builder)))


(defn cfn-spot-fleet-spot-capacity-rebalance-property-builder
  "The cfn-spot-fleet-spot-capacity-rebalance-property-builder function buildes out new instances of 
CfnSpotFleet$SpotCapacityRebalanceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `replacementStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:replacement-strategy` |
| `terminationDelay` | java.lang.Number | [[cdk.support/lookup-entry]] | `:termination-delay` |"
  [stack id config]
  (let [builder (CfnSpotFleet$SpotCapacityRebalanceProperty$Builder.)]
    (when-let [data (lookup-entry config id :replacement-strategy)]
      (. builder replacementStrategy data))
    (when-let [data (lookup-entry config id :termination-delay)]
      (. builder terminationDelay data))
    (.build builder)))


(defn cfn-spot-fleet-spot-fleet-launch-specification-property-builder
  "The cfn-spot-fleet-spot-fleet-launch-specification-property-builder function buildes out new instances of 
CfnSpotFleet$SpotFleetLaunchSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockDeviceMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `iamInstanceProfile` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iam-instance-profile` |
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `instanceRequirements` | software.amazon.awscdk.services.ec2.CfnSpotFleet$InstanceRequirementsRequestProperty | [[cdk.support/lookup-entry]] | `:instance-requirements` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `kernelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kernel-id` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `monitoring` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monitoring` |
| `networkInterfaces` | java.util.List | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `placement` | software.amazon.awscdk.services.ec2.CfnSpotFleet$SpotPlacementProperty | [[cdk.support/lookup-entry]] | `:placement` |
| `ramdiskId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ramdisk-id` |
| `securityGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-groups` |
| `spotPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-price` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `userData` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data` |
| `weightedCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weighted-capacity` |"
  [stack id config]
  (let [builder (CfnSpotFleet$SpotFleetLaunchSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :block-device-mappings)]
      (. builder blockDeviceMappings data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :iam-instance-profile)]
      (. builder iamInstanceProfile data))
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (lookup-entry config id :instance-requirements)]
      (. builder instanceRequirements data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :kernel-id)]
      (. builder kernelId data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :monitoring)]
      (. builder monitoring data))
    (when-let [data (lookup-entry config id :network-interfaces)]
      (. builder networkInterfaces data))
    (when-let [data (lookup-entry config id :placement)]
      (. builder placement data))
    (when-let [data (lookup-entry config id :ramdisk-id)]
      (. builder ramdiskId data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :spot-price)]
      (. builder spotPrice data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (lookup-entry config id :weighted-capacity)]
      (. builder weightedCapacity data))
    (.build builder)))


(defn cfn-spot-fleet-spot-fleet-monitoring-property-builder
  "The cfn-spot-fleet-spot-fleet-monitoring-property-builder function buildes out new instances of 
CfnSpotFleet$SpotFleetMonitoringProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnSpotFleet$SpotFleetMonitoringProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-spot-fleet-spot-fleet-request-config-data-property-builder
  "The cfn-spot-fleet-spot-fleet-request-config-data-property-builder function buildes out new instances of 
CfnSpotFleet$SpotFleetRequestConfigDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocation-strategy` |
| `context` | java.lang.String | [[cdk.support/lookup-entry]] | `:context` |
| `excessCapacityTerminationPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:excess-capacity-termination-policy` |
| `iamFleetRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-fleet-role` |
| `instanceInterruptionBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-interruption-behavior` |
| `instancePoolsToUseCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-pools-to-use-count` |
| `launchSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:launch-specifications` |
| `launchTemplateConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:launch-template-configs` |
| `loadBalancersConfig` | software.amazon.awscdk.services.ec2.CfnSpotFleet$LoadBalancersConfigProperty | [[cdk.support/lookup-entry]] | `:load-balancers-config` |
| `onDemandAllocationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-demand-allocation-strategy` |
| `onDemandMaxTotalPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:on-demand-max-total-price` |
| `onDemandTargetCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:on-demand-target-capacity` |
| `replaceUnhealthyInstances` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replace-unhealthy-instances` |
| `spotMaintenanceStrategies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:spot-maintenance-strategies` |
| `spotMaxTotalPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-max-total-price` |
| `spotPrice` | java.lang.String | [[cdk.support/lookup-entry]] | `:spot-price` |
| `tagSpecifications` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-specifications` |
| `targetCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-capacity` |
| `targetCapacityUnitType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-capacity-unit-type` |
| `terminateInstancesWithExpiration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:terminate-instances-with-expiration` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `validFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:valid-from` |
| `validUntil` | java.lang.String | [[cdk.support/lookup-entry]] | `:valid-until` |"
  [stack id config]
  (let [builder (CfnSpotFleet$SpotFleetRequestConfigDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :allocation-strategy)]
      (. builder allocationStrategy data))
    (when-let [data (lookup-entry config id :context)]
      (. builder context data))
    (when-let [data (lookup-entry config id :excess-capacity-termination-policy)]
      (. builder excessCapacityTerminationPolicy data))
    (when-let [data (lookup-entry config id :iam-fleet-role)]
      (. builder iamFleetRole data))
    (when-let [data (lookup-entry config id :instance-interruption-behavior)]
      (. builder instanceInterruptionBehavior data))
    (when-let [data (lookup-entry config id :instance-pools-to-use-count)]
      (. builder instancePoolsToUseCount data))
    (when-let [data (lookup-entry config id :launch-specifications)]
      (. builder launchSpecifications data))
    (when-let [data (lookup-entry config id :launch-template-configs)]
      (. builder launchTemplateConfigs data))
    (when-let [data (lookup-entry config id :load-balancers-config)]
      (. builder loadBalancersConfig data))
    (when-let [data (lookup-entry config id :on-demand-allocation-strategy)]
      (. builder onDemandAllocationStrategy data))
    (when-let [data (lookup-entry config id :on-demand-max-total-price)]
      (. builder onDemandMaxTotalPrice data))
    (when-let [data (lookup-entry config id :on-demand-target-capacity)]
      (. builder onDemandTargetCapacity data))
    (when-let [data (lookup-entry config id :replace-unhealthy-instances)]
      (. builder replaceUnhealthyInstances data))
    (when-let [data (lookup-entry config id :spot-maintenance-strategies)]
      (. builder spotMaintenanceStrategies data))
    (when-let [data (lookup-entry config id :spot-max-total-price)]
      (. builder spotMaxTotalPrice data))
    (when-let [data (lookup-entry config id :spot-price)]
      (. builder spotPrice data))
    (when-let [data (lookup-entry config id :tag-specifications)]
      (. builder tagSpecifications data))
    (when-let [data (lookup-entry config id :target-capacity)]
      (. builder targetCapacity data))
    (when-let [data (lookup-entry config id :target-capacity-unit-type)]
      (. builder targetCapacityUnitType data))
    (when-let [data (lookup-entry config id :terminate-instances-with-expiration)]
      (. builder terminateInstancesWithExpiration data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :valid-from)]
      (. builder validFrom data))
    (when-let [data (lookup-entry config id :valid-until)]
      (. builder validUntil data))
    (.build builder)))


(defn cfn-spot-fleet-spot-fleet-tag-specification-property-builder
  "The cfn-spot-fleet-spot-fleet-tag-specification-property-builder function buildes out new instances of 
CfnSpotFleet$SpotFleetTagSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSpotFleet$SpotFleetTagSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-spot-fleet-spot-maintenance-strategies-property-builder
  "The cfn-spot-fleet-spot-maintenance-strategies-property-builder function buildes out new instances of 
CfnSpotFleet$SpotMaintenanceStrategiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityRebalance` | software.amazon.awscdk.services.ec2.CfnSpotFleet$SpotCapacityRebalanceProperty | [[cdk.support/lookup-entry]] | `:capacity-rebalance` |"
  [stack id config]
  (let [builder (CfnSpotFleet$SpotMaintenanceStrategiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :capacity-rebalance)]
      (. builder capacityRebalance data))
    (.build builder)))


(defn cfn-spot-fleet-spot-placement-property-builder
  "The cfn-spot-fleet-spot-placement-property-builder function buildes out new instances of 
CfnSpotFleet$SpotPlacementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `tenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenancy` |"
  [stack id config]
  (let [builder (CfnSpotFleet$SpotPlacementProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :tenancy)]
      (. builder tenancy data))
    (.build builder)))


(defn cfn-spot-fleet-target-group-property-builder
  "The cfn-spot-fleet-target-group-property-builder function buildes out new instances of 
CfnSpotFleet$TargetGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnSpotFleet$TargetGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-spot-fleet-target-groups-config-property-builder
  "The cfn-spot-fleet-target-groups-config-property-builder function buildes out new instances of 
CfnSpotFleet$TargetGroupsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-groups` |"
  [stack id config]
  (let [builder (CfnSpotFleet$TargetGroupsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (.build builder)))


(defn cfn-spot-fleet-total-local-storage-gb-request-property-builder
  "The cfn-spot-fleet-total-local-storage-gb-request-property-builder function buildes out new instances of 
CfnSpotFleet$TotalLocalStorageGBRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnSpotFleet$TotalLocalStorageGBRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-spot-fleet-v-cpu-count-range-request-property-builder
  "The cfn-spot-fleet-v-cpu-count-range-request-property-builder function buildes out new instances of 
CfnSpotFleet$VCpuCountRangeRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `max` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max` |
| `min` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min` |"
  [stack id config]
  (let [builder (CfnSpotFleet$VCpuCountRangeRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :max)]
      (. builder max data))
    (when-let [data (lookup-entry config id :min)]
      (. builder min data))
    (.build builder)))


(defn cfn-subnet-builder
  "The cfn-subnet-builder function buildes out new instances of 
CfnSubnet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignIpv6AddressOnCreation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:assign-ipv6-address-on-creation` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `availabilityZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone-id` |
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `enableDns64` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-dns64` |
| `enableLniAtDeviceIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:enable-lni-at-device-index` |
| `ipv4IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-ipam-pool-id` |
| `ipv4NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv4-netmask-length` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `ipv6CidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv6-cidr-blocks` |
| `ipv6IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-ipam-pool-id` |
| `ipv6Native` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-native` |
| `ipv6NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-netmask-length` |
| `mapPublicIpOnLaunch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-public-ip-on-launch` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |
| `privateDnsNameOptionsOnLaunch` | java.lang.Object | [[cdk.support/lookup-entry]] | `:private-dns-name-options-on-launch` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnSubnet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-ipv6-address-on-creation)]
      (. builder assignIpv6AddressOnCreation data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :availability-zone-id)]
      (. builder availabilityZoneId data))
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :enable-dns64)]
      (. builder enableDns64 data))
    (when-let [data (lookup-entry config id :enable-lni-at-device-index)]
      (. builder enableLniAtDeviceIndex data))
    (when-let [data (lookup-entry config id :ipv4-ipam-pool-id)]
      (. builder ipv4IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv4-netmask-length)]
      (. builder ipv4NetmaskLength data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-cidr-blocks)]
      (. builder ipv6CidrBlocks data))
    (when-let [data (lookup-entry config id :ipv6-ipam-pool-id)]
      (. builder ipv6IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv6-native)]
      (. builder ipv6Native data))
    (when-let [data (lookup-entry config id :ipv6-netmask-length)]
      (. builder ipv6NetmaskLength data))
    (when-let [data (lookup-entry config id :map-public-ip-on-launch)]
      (. builder mapPublicIpOnLaunch data))
    (when-let [data (lookup-entry config id :outpost-arn)]
      (. builder outpostArn data))
    (when-let [data (lookup-entry config id :private-dns-name-options-on-launch)]
      (. builder privateDnsNameOptionsOnLaunch data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-subnet-cidr-block-builder
  "The cfn-subnet-cidr-block-builder function buildes out new instances of 
CfnSubnetCidrBlock$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `ipv6IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-ipam-pool-id` |
| `ipv6NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-netmask-length` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnSubnetCidrBlock$Builder/create stack id)]
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-ipam-pool-id)]
      (. builder ipv6IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv6-netmask-length)]
      (. builder ipv6NetmaskLength data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-subnet-cidr-block-props-builder
  "The cfn-subnet-cidr-block-props-builder function buildes out new instances of 
CfnSubnetCidrBlockProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `ipv6IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-ipam-pool-id` |
| `ipv6NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-netmask-length` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnSubnetCidrBlockProps$Builder.)]
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-ipam-pool-id)]
      (. builder ipv6IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv6-netmask-length)]
      (. builder ipv6NetmaskLength data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-subnet-network-acl-association-builder
  "The cfn-subnet-network-acl-association-builder function buildes out new instances of 
CfnSubnetNetworkAclAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-acl-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnSubnetNetworkAclAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :network-acl-id)]
      (. builder networkAclId data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-subnet-network-acl-association-props-builder
  "The cfn-subnet-network-acl-association-props-builder function buildes out new instances of 
CfnSubnetNetworkAclAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-acl-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnSubnetNetworkAclAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :network-acl-id)]
      (. builder networkAclId data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-subnet-private-dns-name-options-on-launch-property-builder
  "The cfn-subnet-private-dns-name-options-on-launch-property-builder function buildes out new instances of 
CfnSubnet$PrivateDnsNameOptionsOnLaunchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableResourceNameDnsARecord` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-resource-name-dns-a-record` |
| `enableResourceNameDnsAaaaRecord` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-resource-name-dns-aaaa-record` |
| `hostnameType` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname-type` |"
  [stack id config]
  (let [builder (CfnSubnet$PrivateDnsNameOptionsOnLaunchProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-resource-name-dns-a-record)]
      (. builder enableResourceNameDnsARecord data))
    (when-let [data (lookup-entry config id :enable-resource-name-dns-aaaa-record)]
      (. builder enableResourceNameDnsAaaaRecord data))
    (when-let [data (lookup-entry config id :hostname-type)]
      (. builder hostnameType data))
    (.build builder)))


(defn cfn-subnet-props-builder
  "The cfn-subnet-props-builder function buildes out new instances of 
CfnSubnetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignIpv6AddressOnCreation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:assign-ipv6-address-on-creation` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `availabilityZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone-id` |
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `enableDns64` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-dns64` |
| `enableLniAtDeviceIndex` | java.lang.Number | [[cdk.support/lookup-entry]] | `:enable-lni-at-device-index` |
| `ipv4IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-ipam-pool-id` |
| `ipv4NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv4-netmask-length` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `ipv6CidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv6-cidr-blocks` |
| `ipv6IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-ipam-pool-id` |
| `ipv6Native` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-native` |
| `ipv6NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-netmask-length` |
| `mapPublicIpOnLaunch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-public-ip-on-launch` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |
| `privateDnsNameOptionsOnLaunch` | java.lang.Object | [[cdk.support/lookup-entry]] | `:private-dns-name-options-on-launch` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnSubnetProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-ipv6-address-on-creation)]
      (. builder assignIpv6AddressOnCreation data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :availability-zone-id)]
      (. builder availabilityZoneId data))
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :enable-dns64)]
      (. builder enableDns64 data))
    (when-let [data (lookup-entry config id :enable-lni-at-device-index)]
      (. builder enableLniAtDeviceIndex data))
    (when-let [data (lookup-entry config id :ipv4-ipam-pool-id)]
      (. builder ipv4IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv4-netmask-length)]
      (. builder ipv4NetmaskLength data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-cidr-blocks)]
      (. builder ipv6CidrBlocks data))
    (when-let [data (lookup-entry config id :ipv6-ipam-pool-id)]
      (. builder ipv6IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv6-native)]
      (. builder ipv6Native data))
    (when-let [data (lookup-entry config id :ipv6-netmask-length)]
      (. builder ipv6NetmaskLength data))
    (when-let [data (lookup-entry config id :map-public-ip-on-launch)]
      (. builder mapPublicIpOnLaunch data))
    (when-let [data (lookup-entry config id :outpost-arn)]
      (. builder outpostArn data))
    (when-let [data (lookup-entry config id :private-dns-name-options-on-launch)]
      (. builder privateDnsNameOptionsOnLaunch data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-subnet-route-table-association-builder
  "The cfn-subnet-route-table-association-builder function buildes out new instances of 
CfnSubnetRouteTableAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `routeTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-table-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnSubnetRouteTableAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :route-table-id)]
      (. builder routeTableId data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-subnet-route-table-association-props-builder
  "The cfn-subnet-route-table-association-props-builder function buildes out new instances of 
CfnSubnetRouteTableAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `routeTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-table-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnSubnetRouteTableAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :route-table-id)]
      (. builder routeTableId data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-traffic-mirror-filter-builder
  "The cfn-traffic-mirror-filter-builder function buildes out new instances of 
CfnTrafficMirrorFilter$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `networkServices` | java.util.List | [[cdk.support/lookup-entry]] | `:network-services` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrafficMirrorFilter$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :network-services)]
      (. builder networkServices data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-traffic-mirror-filter-props-builder
  "The cfn-traffic-mirror-filter-props-builder function buildes out new instances of 
CfnTrafficMirrorFilterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `networkServices` | java.util.List | [[cdk.support/lookup-entry]] | `:network-services` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrafficMirrorFilterProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :network-services)]
      (. builder networkServices data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-traffic-mirror-filter-rule-builder
  "The cfn-traffic-mirror-filter-rule-builder function buildes out new instances of 
CfnTrafficMirrorFilterRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `destinationPortRange` | software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule$TrafficMirrorPortRangeProperty | [[cdk.support/lookup-entry]] | `:destination-port-range` |
| `protocol` | java.lang.Number | [[cdk.support/lookup-entry]] | `:protocol` |
| `ruleAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-action` |
| `ruleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-number` |
| `sourceCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-cidr-block` |
| `sourcePortRange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-port-range` |
| `trafficDirection` | java.lang.String | [[cdk.support/lookup-entry]] | `:traffic-direction` |
| `trafficMirrorFilterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:traffic-mirror-filter-id` |"
  [stack id config]
  (let [builder (CfnTrafficMirrorFilterRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :destination-port-range)]
      (. builder destinationPortRange data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :rule-action)]
      (. builder ruleAction data))
    (when-let [data (lookup-entry config id :rule-number)]
      (. builder ruleNumber data))
    (when-let [data (lookup-entry config id :source-cidr-block)]
      (. builder sourceCidrBlock data))
    (when-let [data (lookup-entry config id :source-port-range)]
      (. builder sourcePortRange data))
    (when-let [data (lookup-entry config id :traffic-direction)]
      (. builder trafficDirection data))
    (when-let [data (lookup-entry config id :traffic-mirror-filter-id)]
      (. builder trafficMirrorFilterId data))
    (.build builder)))


(defn cfn-traffic-mirror-filter-rule-props-builder
  "The cfn-traffic-mirror-filter-rule-props-builder function buildes out new instances of 
CfnTrafficMirrorFilterRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `destinationPortRange` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-port-range` |
| `protocol` | java.lang.Number | [[cdk.support/lookup-entry]] | `:protocol` |
| `ruleAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-action` |
| `ruleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-number` |
| `sourceCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-cidr-block` |
| `sourcePortRange` | software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule$TrafficMirrorPortRangeProperty | [[cdk.support/lookup-entry]] | `:source-port-range` |
| `trafficDirection` | java.lang.String | [[cdk.support/lookup-entry]] | `:traffic-direction` |
| `trafficMirrorFilterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:traffic-mirror-filter-id` |"
  [stack id config]
  (let [builder (CfnTrafficMirrorFilterRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :destination-port-range)]
      (. builder destinationPortRange data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :rule-action)]
      (. builder ruleAction data))
    (when-let [data (lookup-entry config id :rule-number)]
      (. builder ruleNumber data))
    (when-let [data (lookup-entry config id :source-cidr-block)]
      (. builder sourceCidrBlock data))
    (when-let [data (lookup-entry config id :source-port-range)]
      (. builder sourcePortRange data))
    (when-let [data (lookup-entry config id :traffic-direction)]
      (. builder trafficDirection data))
    (when-let [data (lookup-entry config id :traffic-mirror-filter-id)]
      (. builder trafficMirrorFilterId data))
    (.build builder)))


(defn cfn-traffic-mirror-filter-rule-traffic-mirror-port-range-property-builder
  "The cfn-traffic-mirror-filter-rule-traffic-mirror-port-range-property-builder function buildes out new instances of 
CfnTrafficMirrorFilterRule$TrafficMirrorPortRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnTrafficMirrorFilterRule$TrafficMirrorPortRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-traffic-mirror-session-builder
  "The cfn-traffic-mirror-session-builder function buildes out new instances of 
CfnTrafficMirrorSession$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `packetLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:packet-length` |
| `sessionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session-number` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trafficMirrorFilterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:traffic-mirror-filter-id` |
| `trafficMirrorTargetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:traffic-mirror-target-id` |
| `virtualNetworkId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:virtual-network-id` |"
  [stack id config]
  (let [builder (CfnTrafficMirrorSession$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :packet-length)]
      (. builder packetLength data))
    (when-let [data (lookup-entry config id :session-number)]
      (. builder sessionNumber data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :traffic-mirror-filter-id)]
      (. builder trafficMirrorFilterId data))
    (when-let [data (lookup-entry config id :traffic-mirror-target-id)]
      (. builder trafficMirrorTargetId data))
    (when-let [data (lookup-entry config id :virtual-network-id)]
      (. builder virtualNetworkId data))
    (.build builder)))


(defn cfn-traffic-mirror-session-props-builder
  "The cfn-traffic-mirror-session-props-builder function buildes out new instances of 
CfnTrafficMirrorSessionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `packetLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:packet-length` |
| `sessionNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session-number` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trafficMirrorFilterId` | java.lang.String | [[cdk.support/lookup-entry]] | `:traffic-mirror-filter-id` |
| `trafficMirrorTargetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:traffic-mirror-target-id` |
| `virtualNetworkId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:virtual-network-id` |"
  [stack id config]
  (let [builder (CfnTrafficMirrorSessionProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :packet-length)]
      (. builder packetLength data))
    (when-let [data (lookup-entry config id :session-number)]
      (. builder sessionNumber data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :traffic-mirror-filter-id)]
      (. builder trafficMirrorFilterId data))
    (when-let [data (lookup-entry config id :traffic-mirror-target-id)]
      (. builder trafficMirrorTargetId data))
    (when-let [data (lookup-entry config id :virtual-network-id)]
      (. builder virtualNetworkId data))
    (.build builder)))


(defn cfn-traffic-mirror-target-builder
  "The cfn-traffic-mirror-target-builder function buildes out new instances of 
CfnTrafficMirrorTarget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `gatewayLoadBalancerEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-load-balancer-endpoint-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `networkLoadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-load-balancer-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrafficMirrorTarget$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :gateway-load-balancer-endpoint-id)]
      (. builder gatewayLoadBalancerEndpointId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :network-load-balancer-arn)]
      (. builder networkLoadBalancerArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-traffic-mirror-target-props-builder
  "The cfn-traffic-mirror-target-props-builder function buildes out new instances of 
CfnTrafficMirrorTargetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `gatewayLoadBalancerEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-load-balancer-endpoint-id` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `networkLoadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-load-balancer-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrafficMirrorTargetProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :gateway-load-balancer-endpoint-id)]
      (. builder gatewayLoadBalancerEndpointId data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :network-load-balancer-arn)]
      (. builder networkLoadBalancerArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-transit-gateway-attachment-builder
  "The cfn-transit-gateway-attachment-builder function buildes out new instances of 
CfnTransitGatewayAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `options` | java.lang.Object | [[cdk.support/lookup-entry]] | `:options` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-transit-gateway-attachment-options-property-builder
  "The cfn-transit-gateway-attachment-options-property-builder function buildes out new instances of 
CfnTransitGatewayAttachment$OptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applianceModeSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:appliance-mode-support` |
| `dnsSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-support` |
| `ipv6Support` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-support` |
| `securityGroupReferencingSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-referencing-support` |"
  [stack id config]
  (let [builder (CfnTransitGatewayAttachment$OptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :appliance-mode-support)]
      (. builder applianceModeSupport data))
    (when-let [data (lookup-entry config id :dns-support)]
      (. builder dnsSupport data))
    (when-let [data (lookup-entry config id :ipv6-support)]
      (. builder ipv6Support data))
    (when-let [data (lookup-entry config id :security-group-referencing-support)]
      (. builder securityGroupReferencingSupport data))
    (.build builder)))


(defn cfn-transit-gateway-attachment-props-builder
  "The cfn-transit-gateway-attachment-props-builder function buildes out new instances of 
CfnTransitGatewayAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `options` | java.lang.Object | [[cdk.support/lookup-entry]] | `:options` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-transit-gateway-builder
  "The cfn-transit-gateway-builder function buildes out new instances of 
CfnTransitGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonSideAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:amazon-side-asn` |
| `associationDefaultRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-default-route-table-id` |
| `autoAcceptSharedAttachments` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-accept-shared-attachments` |
| `defaultRouteTableAssociation` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-route-table-association` |
| `defaultRouteTablePropagation` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-route-table-propagation` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dnsSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-support` |
| `multicastSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:multicast-support` |
| `propagationDefaultRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:propagation-default-route-table-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:transit-gateway-cidr-blocks` |
| `vpnEcmpSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-ecmp-support` |"
  [stack id config]
  (let [builder (CfnTransitGateway$Builder/create stack id)]
    (when-let [data (lookup-entry config id :amazon-side-asn)]
      (. builder amazonSideAsn data))
    (when-let [data (lookup-entry config id :association-default-route-table-id)]
      (. builder associationDefaultRouteTableId data))
    (when-let [data (lookup-entry config id :auto-accept-shared-attachments)]
      (. builder autoAcceptSharedAttachments data))
    (when-let [data (lookup-entry config id :default-route-table-association)]
      (. builder defaultRouteTableAssociation data))
    (when-let [data (lookup-entry config id :default-route-table-propagation)]
      (. builder defaultRouteTablePropagation data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dns-support)]
      (. builder dnsSupport data))
    (when-let [data (lookup-entry config id :multicast-support)]
      (. builder multicastSupport data))
    (when-let [data (lookup-entry config id :propagation-default-route-table-id)]
      (. builder propagationDefaultRouteTableId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-cidr-blocks)]
      (. builder transitGatewayCidrBlocks data))
    (when-let [data (lookup-entry config id :vpn-ecmp-support)]
      (. builder vpnEcmpSupport data))
    (.build builder)))


(defn cfn-transit-gateway-connect-builder
  "The cfn-transit-gateway-connect-builder function buildes out new instances of 
CfnTransitGatewayConnect$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `options` | software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect$TransitGatewayConnectOptionsProperty | [[cdk.support/lookup-entry]] | `:options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transportTransitGatewayAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transport-transit-gateway-attachment-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayConnect$Builder/create stack id)]
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transport-transit-gateway-attachment-id)]
      (. builder transportTransitGatewayAttachmentId data))
    (.build builder)))


(defn cfn-transit-gateway-connect-props-builder
  "The cfn-transit-gateway-connect-props-builder function buildes out new instances of 
CfnTransitGatewayConnectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transportTransitGatewayAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transport-transit-gateway-attachment-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayConnectProps$Builder.)]
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transport-transit-gateway-attachment-id)]
      (. builder transportTransitGatewayAttachmentId data))
    (.build builder)))


(defn cfn-transit-gateway-connect-transit-gateway-connect-options-property-builder
  "The cfn-transit-gateway-connect-transit-gateway-connect-options-property-builder function buildes out new instances of 
CfnTransitGatewayConnect$TransitGatewayConnectOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnTransitGatewayConnect$TransitGatewayConnectOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn cfn-transit-gateway-multicast-domain-association-builder
  "The cfn-transit-gateway-multicast-domain-association-builder function buildes out new instances of 
CfnTransitGatewayMulticastDomainAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `transitGatewayAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-attachment-id` |
| `transitGatewayMulticastDomainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-multicast-domain-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayMulticastDomainAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :transit-gateway-attachment-id)]
      (. builder transitGatewayAttachmentId data))
    (when-let [data (lookup-entry config id :transit-gateway-multicast-domain-id)]
      (. builder transitGatewayMulticastDomainId data))
    (.build builder)))


(defn cfn-transit-gateway-multicast-domain-association-props-builder
  "The cfn-transit-gateway-multicast-domain-association-props-builder function buildes out new instances of 
CfnTransitGatewayMulticastDomainAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `transitGatewayAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-attachment-id` |
| `transitGatewayMulticastDomainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-multicast-domain-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayMulticastDomainAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :transit-gateway-attachment-id)]
      (. builder transitGatewayAttachmentId data))
    (when-let [data (lookup-entry config id :transit-gateway-multicast-domain-id)]
      (. builder transitGatewayMulticastDomainId data))
    (.build builder)))


(defn cfn-transit-gateway-multicast-domain-builder
  "The cfn-transit-gateway-multicast-domain-builder function buildes out new instances of 
CfnTransitGatewayMulticastDomain$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `options` | java.lang.Object | [[cdk.support/lookup-entry]] | `:options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayMulticastDomain$Builder/create stack id)]
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (.build builder)))


(defn cfn-transit-gateway-multicast-domain-options-property-builder
  "The cfn-transit-gateway-multicast-domain-options-property-builder function buildes out new instances of 
CfnTransitGatewayMulticastDomain$OptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoAcceptSharedAssociations` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-accept-shared-associations` |
| `igmpv2Support` | java.lang.String | [[cdk.support/lookup-entry]] | `:igmpv2-support` |
| `staticSourcesSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:static-sources-support` |"
  [stack id config]
  (let [builder (CfnTransitGatewayMulticastDomain$OptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-accept-shared-associations)]
      (. builder autoAcceptSharedAssociations data))
    (when-let [data (lookup-entry config id :igmpv2-support)]
      (. builder igmpv2Support data))
    (when-let [data (lookup-entry config id :static-sources-support)]
      (. builder staticSourcesSupport data))
    (.build builder)))


(defn cfn-transit-gateway-multicast-domain-props-builder
  "The cfn-transit-gateway-multicast-domain-props-builder function buildes out new instances of 
CfnTransitGatewayMulticastDomainProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `options` | java.lang.Object | [[cdk.support/lookup-entry]] | `:options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayMulticastDomainProps$Builder.)]
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (.build builder)))


(defn cfn-transit-gateway-multicast-group-member-builder
  "The cfn-transit-gateway-multicast-group-member-builder function buildes out new instances of 
CfnTransitGatewayMulticastGroupMember$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-ip-address` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `transitGatewayMulticastDomainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-multicast-domain-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayMulticastGroupMember$Builder/create stack id)]
    (when-let [data (lookup-entry config id :group-ip-address)]
      (. builder groupIpAddress data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :transit-gateway-multicast-domain-id)]
      (. builder transitGatewayMulticastDomainId data))
    (.build builder)))


(defn cfn-transit-gateway-multicast-group-member-props-builder
  "The cfn-transit-gateway-multicast-group-member-props-builder function buildes out new instances of 
CfnTransitGatewayMulticastGroupMemberProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-ip-address` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `transitGatewayMulticastDomainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-multicast-domain-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayMulticastGroupMemberProps$Builder.)]
    (when-let [data (lookup-entry config id :group-ip-address)]
      (. builder groupIpAddress data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :transit-gateway-multicast-domain-id)]
      (. builder transitGatewayMulticastDomainId data))
    (.build builder)))


(defn cfn-transit-gateway-multicast-group-source-builder
  "The cfn-transit-gateway-multicast-group-source-builder function buildes out new instances of 
CfnTransitGatewayMulticastGroupSource$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-ip-address` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `transitGatewayMulticastDomainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-multicast-domain-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayMulticastGroupSource$Builder/create stack id)]
    (when-let [data (lookup-entry config id :group-ip-address)]
      (. builder groupIpAddress data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :transit-gateway-multicast-domain-id)]
      (. builder transitGatewayMulticastDomainId data))
    (.build builder)))


(defn cfn-transit-gateway-multicast-group-source-props-builder
  "The cfn-transit-gateway-multicast-group-source-props-builder function buildes out new instances of 
CfnTransitGatewayMulticastGroupSourceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-ip-address` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `transitGatewayMulticastDomainId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-multicast-domain-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayMulticastGroupSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :group-ip-address)]
      (. builder groupIpAddress data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :transit-gateway-multicast-domain-id)]
      (. builder transitGatewayMulticastDomainId data))
    (.build builder)))


(defn cfn-transit-gateway-peering-attachment-builder
  "The cfn-transit-gateway-peering-attachment-builder function buildes out new instances of 
CfnTransitGatewayPeeringAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `peerAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-account-id` |
| `peerRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-region` |
| `peerTransitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-transit-gateway-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayPeeringAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :peer-account-id)]
      (. builder peerAccountId data))
    (when-let [data (lookup-entry config id :peer-region)]
      (. builder peerRegion data))
    (when-let [data (lookup-entry config id :peer-transit-gateway-id)]
      (. builder peerTransitGatewayId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (.build builder)))


(defn cfn-transit-gateway-peering-attachment-peering-attachment-status-property-builder
  "The cfn-transit-gateway-peering-attachment-peering-attachment-status-property-builder function buildes out new instances of 
CfnTransitGatewayPeeringAttachment$PeeringAttachmentStatusProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | java.lang.String | [[cdk.support/lookup-entry]] | `:code` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |"
  [stack id config]
  (let [builder (CfnTransitGatewayPeeringAttachment$PeeringAttachmentStatusProperty$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (.build builder)))


(defn cfn-transit-gateway-peering-attachment-props-builder
  "The cfn-transit-gateway-peering-attachment-props-builder function buildes out new instances of 
CfnTransitGatewayPeeringAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `peerAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-account-id` |
| `peerRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-region` |
| `peerTransitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-transit-gateway-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayPeeringAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :peer-account-id)]
      (. builder peerAccountId data))
    (when-let [data (lookup-entry config id :peer-region)]
      (. builder peerRegion data))
    (when-let [data (lookup-entry config id :peer-transit-gateway-id)]
      (. builder peerTransitGatewayId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (.build builder)))


(defn cfn-transit-gateway-props-builder
  "The cfn-transit-gateway-props-builder function buildes out new instances of 
CfnTransitGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonSideAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:amazon-side-asn` |
| `associationDefaultRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-default-route-table-id` |
| `autoAcceptSharedAttachments` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-accept-shared-attachments` |
| `defaultRouteTableAssociation` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-route-table-association` |
| `defaultRouteTablePropagation` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-route-table-propagation` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dnsSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-support` |
| `multicastSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:multicast-support` |
| `propagationDefaultRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:propagation-default-route-table-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayCidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:transit-gateway-cidr-blocks` |
| `vpnEcmpSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-ecmp-support` |"
  [stack id config]
  (let [builder (CfnTransitGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :amazon-side-asn)]
      (. builder amazonSideAsn data))
    (when-let [data (lookup-entry config id :association-default-route-table-id)]
      (. builder associationDefaultRouteTableId data))
    (when-let [data (lookup-entry config id :auto-accept-shared-attachments)]
      (. builder autoAcceptSharedAttachments data))
    (when-let [data (lookup-entry config id :default-route-table-association)]
      (. builder defaultRouteTableAssociation data))
    (when-let [data (lookup-entry config id :default-route-table-propagation)]
      (. builder defaultRouteTablePropagation data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dns-support)]
      (. builder dnsSupport data))
    (when-let [data (lookup-entry config id :multicast-support)]
      (. builder multicastSupport data))
    (when-let [data (lookup-entry config id :propagation-default-route-table-id)]
      (. builder propagationDefaultRouteTableId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-cidr-blocks)]
      (. builder transitGatewayCidrBlocks data))
    (when-let [data (lookup-entry config id :vpn-ecmp-support)]
      (. builder vpnEcmpSupport data))
    (.build builder)))


(defn cfn-transit-gateway-route-builder
  "The cfn-transit-gateway-route-builder function buildes out new instances of 
CfnTransitGatewayRoute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blackhole` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:blackhole` |
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `transitGatewayAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-attachment-id` |
| `transitGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRoute$Builder/create stack id)]
    (when-let [data (lookup-entry config id :blackhole)]
      (. builder blackhole data))
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :transit-gateway-attachment-id)]
      (. builder transitGatewayAttachmentId data))
    (when-let [data (lookup-entry config id :transit-gateway-route-table-id)]
      (. builder transitGatewayRouteTableId data))
    (.build builder)))


(defn cfn-transit-gateway-route-props-builder
  "The cfn-transit-gateway-route-props-builder function buildes out new instances of 
CfnTransitGatewayRouteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blackhole` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:blackhole` |
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `transitGatewayAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-attachment-id` |
| `transitGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRouteProps$Builder.)]
    (when-let [data (lookup-entry config id :blackhole)]
      (. builder blackhole data))
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :transit-gateway-attachment-id)]
      (. builder transitGatewayAttachmentId data))
    (when-let [data (lookup-entry config id :transit-gateway-route-table-id)]
      (. builder transitGatewayRouteTableId data))
    (.build builder)))


(defn cfn-transit-gateway-route-table-association-builder
  "The cfn-transit-gateway-route-table-association-builder function buildes out new instances of 
CfnTransitGatewayRouteTableAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `transitGatewayAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-attachment-id` |
| `transitGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRouteTableAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :transit-gateway-attachment-id)]
      (. builder transitGatewayAttachmentId data))
    (when-let [data (lookup-entry config id :transit-gateway-route-table-id)]
      (. builder transitGatewayRouteTableId data))
    (.build builder)))


(defn cfn-transit-gateway-route-table-association-props-builder
  "The cfn-transit-gateway-route-table-association-props-builder function buildes out new instances of 
CfnTransitGatewayRouteTableAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `transitGatewayAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-attachment-id` |
| `transitGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRouteTableAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :transit-gateway-attachment-id)]
      (. builder transitGatewayAttachmentId data))
    (when-let [data (lookup-entry config id :transit-gateway-route-table-id)]
      (. builder transitGatewayRouteTableId data))
    (.build builder)))


(defn cfn-transit-gateway-route-table-builder
  "The cfn-transit-gateway-route-table-builder function buildes out new instances of 
CfnTransitGatewayRouteTable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRouteTable$Builder/create stack id)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (.build builder)))


(defn cfn-transit-gateway-route-table-propagation-builder
  "The cfn-transit-gateway-route-table-propagation-builder function buildes out new instances of 
CfnTransitGatewayRouteTablePropagation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `transitGatewayAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-attachment-id` |
| `transitGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRouteTablePropagation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :transit-gateway-attachment-id)]
      (. builder transitGatewayAttachmentId data))
    (when-let [data (lookup-entry config id :transit-gateway-route-table-id)]
      (. builder transitGatewayRouteTableId data))
    (.build builder)))


(defn cfn-transit-gateway-route-table-propagation-props-builder
  "The cfn-transit-gateway-route-table-propagation-props-builder function buildes out new instances of 
CfnTransitGatewayRouteTablePropagationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `transitGatewayAttachmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-attachment-id` |
| `transitGatewayRouteTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-route-table-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRouteTablePropagationProps$Builder.)]
    (when-let [data (lookup-entry config id :transit-gateway-attachment-id)]
      (. builder transitGatewayAttachmentId data))
    (when-let [data (lookup-entry config id :transit-gateway-route-table-id)]
      (. builder transitGatewayRouteTableId data))
    (.build builder)))


(defn cfn-transit-gateway-route-table-props-builder
  "The cfn-transit-gateway-route-table-props-builder function buildes out new instances of 
CfnTransitGatewayRouteTableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayRouteTableProps$Builder.)]
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (.build builder)))


(defn cfn-transit-gateway-vpc-attachment-builder
  "The cfn-transit-gateway-vpc-attachment-builder function buildes out new instances of 
CfnTransitGatewayVpcAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:add-subnet-ids` |
| `options` | java.lang.Object | [[cdk.support/lookup-entry]] | `:options` |
| `removeSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:remove-subnet-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayVpcAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :add-subnet-ids)]
      (. builder addSubnetIds data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :remove-subnet-ids)]
      (. builder removeSubnetIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-transit-gateway-vpc-attachment-options-property-builder
  "The cfn-transit-gateway-vpc-attachment-options-property-builder function buildes out new instances of 
CfnTransitGatewayVpcAttachment$OptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applianceModeSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:appliance-mode-support` |
| `dnsSupport` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-support` |
| `ipv6Support` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-support` |"
  [stack id config]
  (let [builder (CfnTransitGatewayVpcAttachment$OptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :appliance-mode-support)]
      (. builder applianceModeSupport data))
    (when-let [data (lookup-entry config id :dns-support)]
      (. builder dnsSupport data))
    (when-let [data (lookup-entry config id :ipv6-support)]
      (. builder ipv6Support data))
    (.build builder)))


(defn cfn-transit-gateway-vpc-attachment-props-builder
  "The cfn-transit-gateway-vpc-attachment-props-builder function buildes out new instances of 
CfnTransitGatewayVpcAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:add-subnet-ids` |
| `options` | java.lang.Object | [[cdk.support/lookup-entry]] | `:options` |
| `removeSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:remove-subnet-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnTransitGatewayVpcAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :add-subnet-ids)]
      (. builder addSubnetIds data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :remove-subnet-ids)]
      (. builder removeSubnetIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-verified-access-endpoint-builder
  "The cfn-verified-access-endpoint-builder function buildes out new instances of 
CfnVerifiedAccessEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-domain` |
| `attachmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:attachment-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-certificate-arn` |
| `endpointDomainPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-domain-prefix` |
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `loadBalancerOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:load-balancer-options` |
| `networkInterfaceOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-interface-options` |
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy-enabled` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `sseSpecification` | software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint$SseSpecificationProperty | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `verifiedAccessGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:verified-access-group-id` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-domain)]
      (. builder applicationDomain data))
    (when-let [data (lookup-entry config id :attachment-type)]
      (. builder attachmentType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-certificate-arn)]
      (. builder domainCertificateArn data))
    (when-let [data (lookup-entry config id :endpoint-domain-prefix)]
      (. builder endpointDomainPrefix data))
    (when-let [data (lookup-entry config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :load-balancer-options)]
      (. builder loadBalancerOptions data))
    (when-let [data (lookup-entry config id :network-interface-options)]
      (. builder networkInterfaceOptions data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-enabled)]
      (. builder policyEnabled data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :sse-specification)]
      (. builder sseSpecification data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :verified-access-group-id)]
      (. builder verifiedAccessGroupId data))
    (.build builder)))


(defn cfn-verified-access-endpoint-load-balancer-options-property-builder
  "The cfn-verified-access-endpoint-load-balancer-options-property-builder function buildes out new instances of 
CfnVerifiedAccessEndpoint$LoadBalancerOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessEndpoint$LoadBalancerOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :load-balancer-arn)]
      (. builder loadBalancerArn data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-verified-access-endpoint-network-interface-options-property-builder
  "The cfn-verified-access-endpoint-network-interface-options-property-builder function buildes out new instances of 
CfnVerifiedAccessEndpoint$NetworkInterfaceOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessEndpoint$NetworkInterfaceOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn cfn-verified-access-endpoint-props-builder
  "The cfn-verified-access-endpoint-props-builder function buildes out new instances of 
CfnVerifiedAccessEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-domain` |
| `attachmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:attachment-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domainCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-certificate-arn` |
| `endpointDomainPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-domain-prefix` |
| `endpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-type` |
| `loadBalancerOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:load-balancer-options` |
| `networkInterfaceOptions` | software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint$NetworkInterfaceOptionsProperty | [[cdk.support/lookup-entry]] | `:network-interface-options` |
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy-enabled` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `sseSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `verifiedAccessGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:verified-access-group-id` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :application-domain)]
      (. builder applicationDomain data))
    (when-let [data (lookup-entry config id :attachment-type)]
      (. builder attachmentType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :domain-certificate-arn)]
      (. builder domainCertificateArn data))
    (when-let [data (lookup-entry config id :endpoint-domain-prefix)]
      (. builder endpointDomainPrefix data))
    (when-let [data (lookup-entry config id :endpoint-type)]
      (. builder endpointType data))
    (when-let [data (lookup-entry config id :load-balancer-options)]
      (. builder loadBalancerOptions data))
    (when-let [data (lookup-entry config id :network-interface-options)]
      (. builder networkInterfaceOptions data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-enabled)]
      (. builder policyEnabled data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :sse-specification)]
      (. builder sseSpecification data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :verified-access-group-id)]
      (. builder verifiedAccessGroupId data))
    (.build builder)))


(defn cfn-verified-access-endpoint-sse-specification-property-builder
  "The cfn-verified-access-endpoint-sse-specification-property-builder function buildes out new instances of 
CfnVerifiedAccessEndpoint$SseSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedKeyEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:customer-managed-key-enabled` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessEndpoint$SseSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :customer-managed-key-enabled)]
      (. builder customerManagedKeyEnabled data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (.build builder)))


(defn cfn-verified-access-group-builder
  "The cfn-verified-access-group-builder function buildes out new instances of 
CfnVerifiedAccessGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:policy-enabled` |
| `sseSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `verifiedAccessInstanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:verified-access-instance-id` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-enabled)]
      (. builder policyEnabled data))
    (when-let [data (lookup-entry config id :sse-specification)]
      (. builder sseSpecification data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :verified-access-instance-id)]
      (. builder verifiedAccessInstanceId data))
    (.build builder)))


(defn cfn-verified-access-group-props-builder
  "The cfn-verified-access-group-props-builder function buildes out new instances of 
CfnVerifiedAccessGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `policyDocument` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy-enabled` |
| `sseSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `verifiedAccessInstanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:verified-access-instance-id` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-enabled)]
      (. builder policyEnabled data))
    (when-let [data (lookup-entry config id :sse-specification)]
      (. builder sseSpecification data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :verified-access-instance-id)]
      (. builder verifiedAccessInstanceId data))
    (.build builder)))


(defn cfn-verified-access-group-sse-specification-property-builder
  "The cfn-verified-access-group-sse-specification-property-builder function buildes out new instances of 
CfnVerifiedAccessGroup$SseSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedKeyEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:customer-managed-key-enabled` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessGroup$SseSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :customer-managed-key-enabled)]
      (. builder customerManagedKeyEnabled data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (.build builder)))


(defn cfn-verified-access-instance-builder
  "The cfn-verified-access-instance-builder function buildes out new instances of 
CfnVerifiedAccessInstance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fipsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:fips-enabled` |
| `loggingConfigurations` | software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance$VerifiedAccessLogsProperty | [[cdk.support/lookup-entry]] | `:logging-configurations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `verifiedAccessTrustProviderIds` | java.util.List | [[cdk.support/lookup-entry]] | `:verified-access-trust-provider-ids` |
| `verifiedAccessTrustProviders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:verified-access-trust-providers` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fips-enabled)]
      (. builder fipsEnabled data))
    (when-let [data (lookup-entry config id :logging-configurations)]
      (. builder loggingConfigurations data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :verified-access-trust-provider-ids)]
      (. builder verifiedAccessTrustProviderIds data))
    (when-let [data (lookup-entry config id :verified-access-trust-providers)]
      (. builder verifiedAccessTrustProviders data))
    (.build builder)))


(defn cfn-verified-access-instance-cloud-watch-logs-property-builder
  "The cfn-verified-access-instance-cloud-watch-logs-property-builder function buildes out new instances of 
CfnVerifiedAccessInstance$CloudWatchLogsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessInstance$CloudWatchLogsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (.build builder)))


(defn cfn-verified-access-instance-kinesis-data-firehose-property-builder
  "The cfn-verified-access-instance-kinesis-data-firehose-property-builder function buildes out new instances of 
CfnVerifiedAccessInstance$KinesisDataFirehoseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStream` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessInstance$KinesisDataFirehoseProperty$Builder.)]
    (when-let [data (lookup-entry config id :delivery-stream)]
      (. builder deliveryStream data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-verified-access-instance-props-builder
  "The cfn-verified-access-instance-props-builder function buildes out new instances of 
CfnVerifiedAccessInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fipsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fips-enabled` |
| `loggingConfigurations` | software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance$VerifiedAccessLogsProperty | [[cdk.support/lookup-entry]] | `:logging-configurations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `verifiedAccessTrustProviderIds` | java.util.List | [[cdk.support/lookup-entry]] | `:verified-access-trust-provider-ids` |
| `verifiedAccessTrustProviders` | java.util.List | [[cdk.support/lookup-entry]] | `:verified-access-trust-providers` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fips-enabled)]
      (. builder fipsEnabled data))
    (when-let [data (lookup-entry config id :logging-configurations)]
      (. builder loggingConfigurations data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :verified-access-trust-provider-ids)]
      (. builder verifiedAccessTrustProviderIds data))
    (when-let [data (lookup-entry config id :verified-access-trust-providers)]
      (. builder verifiedAccessTrustProviders data))
    (.build builder)))


(defn cfn-verified-access-instance-s3-property-builder
  "The cfn-verified-access-instance-s3-property-builder function buildes out new instances of 
CfnVerifiedAccessInstance$S3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-owner` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessInstance$S3Property$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-owner)]
      (. builder bucketOwner data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn cfn-verified-access-instance-verified-access-logs-property-builder
  "The cfn-verified-access-instance-verified-access-logs-property-builder function buildes out new instances of 
CfnVerifiedAccessInstance$VerifiedAccessLogsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogs` | software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance$CloudWatchLogsProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-logs` |
| `includeTrustContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-trust-context` |
| `kinesisDataFirehose` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-data-firehose` |
| `logVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-version` |
| `s3` | software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance$S3Property | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessInstance$VerifiedAccessLogsProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logs)]
      (. builder cloudWatchLogs data))
    (when-let [data (lookup-entry config id :include-trust-context)]
      (. builder includeTrustContext data))
    (when-let [data (lookup-entry config id :kinesis-data-firehose)]
      (. builder kinesisDataFirehose data))
    (when-let [data (lookup-entry config id :log-version)]
      (. builder logVersion data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-verified-access-instance-verified-access-trust-provider-property-builder
  "The cfn-verified-access-instance-verified-access-trust-provider-property-builder function buildes out new instances of 
CfnVerifiedAccessInstance$VerifiedAccessTrustProviderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceTrustProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-trust-provider-type` |
| `trustProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-provider-type` |
| `userTrustProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-trust-provider-type` |
| `verifiedAccessTrustProviderId` | java.lang.String | [[cdk.support/lookup-entry]] | `:verified-access-trust-provider-id` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessInstance$VerifiedAccessTrustProviderProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :device-trust-provider-type)]
      (. builder deviceTrustProviderType data))
    (when-let [data (lookup-entry config id :trust-provider-type)]
      (. builder trustProviderType data))
    (when-let [data (lookup-entry config id :user-trust-provider-type)]
      (. builder userTrustProviderType data))
    (when-let [data (lookup-entry config id :verified-access-trust-provider-id)]
      (. builder verifiedAccessTrustProviderId data))
    (.build builder)))


(defn cfn-verified-access-trust-provider-builder
  "The cfn-verified-access-trust-provider-builder function buildes out new instances of 
CfnVerifiedAccessTrustProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceOptions` | software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider$DeviceOptionsProperty | [[cdk.support/lookup-entry]] | `:device-options` |
| `deviceTrustProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-trust-provider-type` |
| `oidcOptions` | software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider$OidcOptionsProperty | [[cdk.support/lookup-entry]] | `:oidc-options` |
| `policyReferenceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-reference-name` |
| `sseSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trustProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-provider-type` |
| `userTrustProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-trust-provider-type` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessTrustProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :device-options)]
      (. builder deviceOptions data))
    (when-let [data (lookup-entry config id :device-trust-provider-type)]
      (. builder deviceTrustProviderType data))
    (when-let [data (lookup-entry config id :oidc-options)]
      (. builder oidcOptions data))
    (when-let [data (lookup-entry config id :policy-reference-name)]
      (. builder policyReferenceName data))
    (when-let [data (lookup-entry config id :sse-specification)]
      (. builder sseSpecification data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trust-provider-type)]
      (. builder trustProviderType data))
    (when-let [data (lookup-entry config id :user-trust-provider-type)]
      (. builder userTrustProviderType data))
    (.build builder)))


(defn cfn-verified-access-trust-provider-device-options-property-builder
  "The cfn-verified-access-trust-provider-device-options-property-builder function buildes out new instances of 
CfnVerifiedAccessTrustProvider$DeviceOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publicSigningKeyUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-signing-key-url` |
| `tenantId` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenant-id` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessTrustProvider$DeviceOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :public-signing-key-url)]
      (. builder publicSigningKeyUrl data))
    (when-let [data (lookup-entry config id :tenant-id)]
      (. builder tenantId data))
    (.build builder)))


(defn cfn-verified-access-trust-provider-oidc-options-property-builder
  "The cfn-verified-access-trust-provider-oidc-options-property-builder function buildes out new instances of 
CfnVerifiedAccessTrustProvider$OidcOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizationEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorization-endpoint` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `issuer` | java.lang.String | [[cdk.support/lookup-entry]] | `:issuer` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tokenEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-endpoint` |
| `userInfoEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-info-endpoint` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessTrustProvider$OidcOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :authorization-endpoint)]
      (. builder authorizationEndpoint data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :issuer)]
      (. builder issuer data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :token-endpoint)]
      (. builder tokenEndpoint data))
    (when-let [data (lookup-entry config id :user-info-endpoint)]
      (. builder userInfoEndpoint data))
    (.build builder)))


(defn cfn-verified-access-trust-provider-props-builder
  "The cfn-verified-access-trust-provider-props-builder function buildes out new instances of 
CfnVerifiedAccessTrustProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `deviceOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:device-options` |
| `deviceTrustProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-trust-provider-type` |
| `oidcOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:oidc-options` |
| `policyReferenceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-reference-name` |
| `sseSpecification` | software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider$SseSpecificationProperty | [[cdk.support/lookup-entry]] | `:sse-specification` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trustProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:trust-provider-type` |
| `userTrustProviderType` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-trust-provider-type` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessTrustProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :device-options)]
      (. builder deviceOptions data))
    (when-let [data (lookup-entry config id :device-trust-provider-type)]
      (. builder deviceTrustProviderType data))
    (when-let [data (lookup-entry config id :oidc-options)]
      (. builder oidcOptions data))
    (when-let [data (lookup-entry config id :policy-reference-name)]
      (. builder policyReferenceName data))
    (when-let [data (lookup-entry config id :sse-specification)]
      (. builder sseSpecification data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trust-provider-type)]
      (. builder trustProviderType data))
    (when-let [data (lookup-entry config id :user-trust-provider-type)]
      (. builder userTrustProviderType data))
    (.build builder)))


(defn cfn-verified-access-trust-provider-sse-specification-property-builder
  "The cfn-verified-access-trust-provider-sse-specification-property-builder function buildes out new instances of 
CfnVerifiedAccessTrustProvider$SseSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedKeyEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customer-managed-key-enabled` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |"
  [stack id config]
  (let [builder (CfnVerifiedAccessTrustProvider$SseSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :customer-managed-key-enabled)]
      (. builder customerManagedKeyEnabled data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (.build builder)))


(defn cfn-volume-attachment-builder
  "The cfn-volume-attachment-builder function buildes out new instances of 
CfnVolumeAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `device` | java.lang.String | [[cdk.support/lookup-entry]] | `:device` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `volumeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-id` |"
  [stack id config]
  (let [builder (CfnVolumeAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :device)]
      (. builder device data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :volume-id)]
      (. builder volumeId data))
    (.build builder)))


(defn cfn-volume-attachment-props-builder
  "The cfn-volume-attachment-props-builder function buildes out new instances of 
CfnVolumeAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `device` | java.lang.String | [[cdk.support/lookup-entry]] | `:device` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `volumeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-id` |"
  [stack id config]
  (let [builder (CfnVolumeAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :device)]
      (. builder device data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :volume-id)]
      (. builder volumeId data))
    (.build builder)))


(defn cfn-volume-builder
  "The cfn-volume-builder function buildes out new instances of 
CfnVolume$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnableIo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-enable-io` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `encrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `multiAttachEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-attach-enabled` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnVolume$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-enable-io)]
      (. builder autoEnableIo data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :multi-attach-enabled)]
      (. builder multiAttachEnabled data))
    (when-let [data (lookup-entry config id :outpost-arn)]
      (. builder outpostArn data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-volume-props-builder
  "The cfn-volume-props-builder function buildes out new instances of 
CfnVolumeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnableIo` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-enable-io` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `multiAttachEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-attach-enabled` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnVolumeProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-enable-io)]
      (. builder autoEnableIo data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :multi-attach-enabled)]
      (. builder multiAttachEnabled data))
    (when-let [data (lookup-entry config id :outpost-arn)]
      (. builder outpostArn data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-vpc-builder
  "The cfn-vpc-builder function buildes out new instances of 
CfnVPC$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `enableDnsHostnames` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-dns-hostnames` |
| `enableDnsSupport` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-dns-support` |
| `instanceTenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-tenancy` |
| `ipv4IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-ipam-pool-id` |
| `ipv4NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv4-netmask-length` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnVPC$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :enable-dns-hostnames)]
      (. builder enableDnsHostnames data))
    (when-let [data (lookup-entry config id :enable-dns-support)]
      (. builder enableDnsSupport data))
    (when-let [data (lookup-entry config id :instance-tenancy)]
      (. builder instanceTenancy data))
    (when-let [data (lookup-entry config id :ipv4-ipam-pool-id)]
      (. builder ipv4IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv4-netmask-length)]
      (. builder ipv4NetmaskLength data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-vpc-cidr-block-builder
  "The cfn-vpc-cidr-block-builder function buildes out new instances of 
CfnVPCCidrBlock$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonProvidedIpv6CidrBlock` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:amazon-provided-ipv6-cidr-block` |
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `ipv4IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-ipam-pool-id` |
| `ipv4NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv4-netmask-length` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `ipv6IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-ipam-pool-id` |
| `ipv6NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-netmask-length` |
| `ipv6Pool` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-pool` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnVPCCidrBlock$Builder/create stack id)]
    (when-let [data (lookup-entry config id :amazon-provided-ipv6-cidr-block)]
      (. builder amazonProvidedIpv6CidrBlock data))
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :ipv4-ipam-pool-id)]
      (. builder ipv4IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv4-netmask-length)]
      (. builder ipv4NetmaskLength data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-ipam-pool-id)]
      (. builder ipv6IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv6-netmask-length)]
      (. builder ipv6NetmaskLength data))
    (when-let [data (lookup-entry config id :ipv6-pool)]
      (. builder ipv6Pool data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-vpc-cidr-block-props-builder
  "The cfn-vpc-cidr-block-props-builder function buildes out new instances of 
CfnVPCCidrBlockProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonProvidedIpv6CidrBlock` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:amazon-provided-ipv6-cidr-block` |
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `ipv4IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-ipam-pool-id` |
| `ipv4NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv4-netmask-length` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `ipv6IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-ipam-pool-id` |
| `ipv6NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv6-netmask-length` |
| `ipv6Pool` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-pool` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnVPCCidrBlockProps$Builder.)]
    (when-let [data (lookup-entry config id :amazon-provided-ipv6-cidr-block)]
      (. builder amazonProvidedIpv6CidrBlock data))
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :ipv4-ipam-pool-id)]
      (. builder ipv4IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv4-netmask-length)]
      (. builder ipv4NetmaskLength data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-ipam-pool-id)]
      (. builder ipv6IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv6-netmask-length)]
      (. builder ipv6NetmaskLength data))
    (when-let [data (lookup-entry config id :ipv6-pool)]
      (. builder ipv6Pool data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-vpc-endpoint-builder
  "The cfn-vpc-endpoint-builder function buildes out new instances of 
CfnVPCEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `privateDnsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:private-dns-enabled` |
| `routeTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:route-table-ids` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcEndpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-type` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnVPCEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :private-dns-enabled)]
      (. builder privateDnsEnabled data))
    (when-let [data (lookup-entry config id :route-table-ids)]
      (. builder routeTableIds data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-endpoint-type)]
      (. builder vpcEndpointType data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-vpc-endpoint-connection-notification-builder
  "The cfn-vpc-endpoint-connection-notification-builder function buildes out new instances of 
CfnVPCEndpointConnectionNotification$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:connection-events` |
| `connectionNotificationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-notification-arn` |
| `serviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-id` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |"
  [stack id config]
  (let [builder (CfnVPCEndpointConnectionNotification$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connection-events)]
      (. builder connectionEvents data))
    (when-let [data (lookup-entry config id :connection-notification-arn)]
      (. builder connectionNotificationArn data))
    (when-let [data (lookup-entry config id :service-id)]
      (. builder serviceId data))
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (.build builder)))


(defn cfn-vpc-endpoint-connection-notification-props-builder
  "The cfn-vpc-endpoint-connection-notification-props-builder function buildes out new instances of 
CfnVPCEndpointConnectionNotificationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:connection-events` |
| `connectionNotificationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-notification-arn` |
| `serviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-id` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |"
  [stack id config]
  (let [builder (CfnVPCEndpointConnectionNotificationProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-events)]
      (. builder connectionEvents data))
    (when-let [data (lookup-entry config id :connection-notification-arn)]
      (. builder connectionNotificationArn data))
    (when-let [data (lookup-entry config id :service-id)]
      (. builder serviceId data))
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (.build builder)))


(defn cfn-vpc-endpoint-props-builder
  "The cfn-vpc-endpoint-props-builder function buildes out new instances of 
CfnVPCEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `privateDnsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-dns-enabled` |
| `routeTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:route-table-ids` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcEndpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-type` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnVPCEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :private-dns-enabled)]
      (. builder privateDnsEnabled data))
    (when-let [data (lookup-entry config id :route-table-ids)]
      (. builder routeTableIds data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-endpoint-type)]
      (. builder vpcEndpointType data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-vpc-endpoint-service-builder
  "The cfn-vpc-endpoint-service-builder function buildes out new instances of 
CfnVPCEndpointService$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptanceRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:acceptance-required` |
| `contributorInsightsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contributor-insights-enabled` |
| `gatewayLoadBalancerArns` | java.util.List | [[cdk.support/lookup-entry]] | `:gateway-load-balancer-arns` |
| `networkLoadBalancerArns` | java.util.List | [[cdk.support/lookup-entry]] | `:network-load-balancer-arns` |
| `payerResponsibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:payer-responsibility` |"
  [stack id config]
  (let [builder (CfnVPCEndpointService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :acceptance-required)]
      (. builder acceptanceRequired data))
    (when-let [data (lookup-entry config id :contributor-insights-enabled)]
      (. builder contributorInsightsEnabled data))
    (when-let [data (lookup-entry config id :gateway-load-balancer-arns)]
      (. builder gatewayLoadBalancerArns data))
    (when-let [data (lookup-entry config id :network-load-balancer-arns)]
      (. builder networkLoadBalancerArns data))
    (when-let [data (lookup-entry config id :payer-responsibility)]
      (. builder payerResponsibility data))
    (.build builder)))


(defn cfn-vpc-endpoint-service-permissions-builder
  "The cfn-vpc-endpoint-service-permissions-builder function buildes out new instances of 
CfnVPCEndpointServicePermissions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPrincipals` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-principals` |
| `serviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-id` |"
  [stack id config]
  (let [builder (CfnVPCEndpointServicePermissions$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allowed-principals)]
      (. builder allowedPrincipals data))
    (when-let [data (lookup-entry config id :service-id)]
      (. builder serviceId data))
    (.build builder)))


(defn cfn-vpc-endpoint-service-permissions-props-builder
  "The cfn-vpc-endpoint-service-permissions-props-builder function buildes out new instances of 
CfnVPCEndpointServicePermissionsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPrincipals` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-principals` |
| `serviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-id` |"
  [stack id config]
  (let [builder (CfnVPCEndpointServicePermissionsProps$Builder.)]
    (when-let [data (lookup-entry config id :allowed-principals)]
      (. builder allowedPrincipals data))
    (when-let [data (lookup-entry config id :service-id)]
      (. builder serviceId data))
    (.build builder)))


(defn cfn-vpc-endpoint-service-props-builder
  "The cfn-vpc-endpoint-service-props-builder function buildes out new instances of 
CfnVPCEndpointServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptanceRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:acceptance-required` |
| `contributorInsightsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:contributor-insights-enabled` |
| `gatewayLoadBalancerArns` | java.util.List | [[cdk.support/lookup-entry]] | `:gateway-load-balancer-arns` |
| `networkLoadBalancerArns` | java.util.List | [[cdk.support/lookup-entry]] | `:network-load-balancer-arns` |
| `payerResponsibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:payer-responsibility` |"
  [stack id config]
  (let [builder (CfnVPCEndpointServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :acceptance-required)]
      (. builder acceptanceRequired data))
    (when-let [data (lookup-entry config id :contributor-insights-enabled)]
      (. builder contributorInsightsEnabled data))
    (when-let [data (lookup-entry config id :gateway-load-balancer-arns)]
      (. builder gatewayLoadBalancerArns data))
    (when-let [data (lookup-entry config id :network-load-balancer-arns)]
      (. builder networkLoadBalancerArns data))
    (when-let [data (lookup-entry config id :payer-responsibility)]
      (. builder payerResponsibility data))
    (.build builder)))


(defn cfn-vpc-gateway-attachment-builder
  "The cfn-vpc-gateway-attachment-builder function buildes out new instances of 
CfnVPCGatewayAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `internetGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:internet-gateway-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `vpnGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-gateway-id` |"
  [stack id config]
  (let [builder (CfnVPCGatewayAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :internet-gateway-id)]
      (. builder internetGatewayId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (when-let [data (lookup-entry config id :vpn-gateway-id)]
      (. builder vpnGatewayId data))
    (.build builder)))


(defn cfn-vpc-gateway-attachment-props-builder
  "The cfn-vpc-gateway-attachment-props-builder function buildes out new instances of 
CfnVPCGatewayAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `internetGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:internet-gateway-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `vpnGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-gateway-id` |"
  [stack id config]
  (let [builder (CfnVPCGatewayAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :internet-gateway-id)]
      (. builder internetGatewayId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (when-let [data (lookup-entry config id :vpn-gateway-id)]
      (. builder vpnGatewayId data))
    (.build builder)))


(defn cfn-vpc-peering-connection-builder
  "The cfn-vpc-peering-connection-builder function buildes out new instances of 
CfnVPCPeeringConnection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `peerOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-owner-id` |
| `peerRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-region` |
| `peerRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-role-arn` |
| `peerVpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-vpc-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnVPCPeeringConnection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :peer-owner-id)]
      (. builder peerOwnerId data))
    (when-let [data (lookup-entry config id :peer-region)]
      (. builder peerRegion data))
    (when-let [data (lookup-entry config id :peer-role-arn)]
      (. builder peerRoleArn data))
    (when-let [data (lookup-entry config id :peer-vpc-id)]
      (. builder peerVpcId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-vpc-peering-connection-props-builder
  "The cfn-vpc-peering-connection-props-builder function buildes out new instances of 
CfnVPCPeeringConnectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `peerOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-owner-id` |
| `peerRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-region` |
| `peerRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-role-arn` |
| `peerVpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-vpc-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnVPCPeeringConnectionProps$Builder.)]
    (when-let [data (lookup-entry config id :peer-owner-id)]
      (. builder peerOwnerId data))
    (when-let [data (lookup-entry config id :peer-region)]
      (. builder peerRegion data))
    (when-let [data (lookup-entry config id :peer-role-arn)]
      (. builder peerRoleArn data))
    (when-let [data (lookup-entry config id :peer-vpc-id)]
      (. builder peerVpcId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-vpc-props-builder
  "The cfn-vpc-props-builder function buildes out new instances of 
CfnVPCProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `enableDnsHostnames` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-dns-hostnames` |
| `enableDnsSupport` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-dns-support` |
| `instanceTenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-tenancy` |
| `ipv4IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-ipam-pool-id` |
| `ipv4NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv4-netmask-length` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnVPCProps$Builder.)]
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :enable-dns-hostnames)]
      (. builder enableDnsHostnames data))
    (when-let [data (lookup-entry config id :enable-dns-support)]
      (. builder enableDnsSupport data))
    (when-let [data (lookup-entry config id :instance-tenancy)]
      (. builder instanceTenancy data))
    (when-let [data (lookup-entry config id :ipv4-ipam-pool-id)]
      (. builder ipv4IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv4-netmask-length)]
      (. builder ipv4NetmaskLength data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-vpcdhcp-options-association-builder
  "The cfn-vpcdhcp-options-association-builder function buildes out new instances of 
CfnVPCDHCPOptionsAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dhcpOptionsId` | java.lang.String | [[cdk.support/lookup-entry]] | `:dhcp-options-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnVPCDHCPOptionsAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dhcp-options-id)]
      (. builder dhcpOptionsId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-vpcdhcp-options-association-props-builder
  "The cfn-vpcdhcp-options-association-props-builder function buildes out new instances of 
CfnVPCDHCPOptionsAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dhcpOptionsId` | java.lang.String | [[cdk.support/lookup-entry]] | `:dhcp-options-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnVPCDHCPOptionsAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :dhcp-options-id)]
      (. builder dhcpOptionsId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-vpn-connection-builder
  "The cfn-vpn-connection-builder function buildes out new instances of 
CfnVPNConnection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-gateway-id` |
| `staticRoutesOnly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:static-routes-only` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `vpnGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-gateway-id` |
| `vpnTunnelOptionsSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpn-tunnel-options-specifications` |"
  [stack id config]
  (let [builder (CfnVPNConnection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :customer-gateway-id)]
      (. builder customerGatewayId data))
    (when-let [data (lookup-entry config id :static-routes-only)]
      (. builder staticRoutesOnly data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :vpn-gateway-id)]
      (. builder vpnGatewayId data))
    (when-let [data (lookup-entry config id :vpn-tunnel-options-specifications)]
      (. builder vpnTunnelOptionsSpecifications data))
    (.build builder)))


(defn cfn-vpn-connection-props-builder
  "The cfn-vpn-connection-props-builder function buildes out new instances of 
CfnVPNConnectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-gateway-id` |
| `staticRoutesOnly` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:static-routes-only` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `transitGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:transit-gateway-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `vpnGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-gateway-id` |
| `vpnTunnelOptionsSpecifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpn-tunnel-options-specifications` |"
  [stack id config]
  (let [builder (CfnVPNConnectionProps$Builder.)]
    (when-let [data (lookup-entry config id :customer-gateway-id)]
      (. builder customerGatewayId data))
    (when-let [data (lookup-entry config id :static-routes-only)]
      (. builder staticRoutesOnly data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :transit-gateway-id)]
      (. builder transitGatewayId data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :vpn-gateway-id)]
      (. builder vpnGatewayId data))
    (when-let [data (lookup-entry config id :vpn-tunnel-options-specifications)]
      (. builder vpnTunnelOptionsSpecifications data))
    (.build builder)))


(defn cfn-vpn-connection-route-builder
  "The cfn-vpn-connection-route-builder function buildes out new instances of 
CfnVPNConnectionRoute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `vpnConnectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-connection-id` |"
  [stack id config]
  (let [builder (CfnVPNConnectionRoute$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :vpn-connection-id)]
      (. builder vpnConnectionId data))
    (.build builder)))


(defn cfn-vpn-connection-route-props-builder
  "The cfn-vpn-connection-route-props-builder function buildes out new instances of 
CfnVPNConnectionRouteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-cidr-block` |
| `vpnConnectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-connection-id` |"
  [stack id config]
  (let [builder (CfnVPNConnectionRouteProps$Builder.)]
    (when-let [data (lookup-entry config id :destination-cidr-block)]
      (. builder destinationCidrBlock data))
    (when-let [data (lookup-entry config id :vpn-connection-id)]
      (. builder vpnConnectionId data))
    (.build builder)))


(defn cfn-vpn-connection-vpn-tunnel-options-specification-property-builder
  "The cfn-vpn-connection-vpn-tunnel-options-specification-property-builder function buildes out new instances of 
CfnVPNConnection$VpnTunnelOptionsSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preSharedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:pre-shared-key` |
| `tunnelInsideCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:tunnel-inside-cidr` |"
  [stack id config]
  (let [builder (CfnVPNConnection$VpnTunnelOptionsSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :pre-shared-key)]
      (. builder preSharedKey data))
    (when-let [data (lookup-entry config id :tunnel-inside-cidr)]
      (. builder tunnelInsideCidr data))
    (.build builder)))


(defn cfn-vpn-gateway-builder
  "The cfn-vpn-gateway-builder function buildes out new instances of 
CfnVPNGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonSideAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:amazon-side-asn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnVPNGateway$Builder/create stack id)]
    (when-let [data (lookup-entry config id :amazon-side-asn)]
      (. builder amazonSideAsn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-vpn-gateway-props-builder
  "The cfn-vpn-gateway-props-builder function buildes out new instances of 
CfnVPNGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonSideAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:amazon-side-asn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnVPNGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :amazon-side-asn)]
      (. builder amazonSideAsn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-vpn-gateway-route-propagation-builder
  "The cfn-vpn-gateway-route-propagation-builder function buildes out new instances of 
CfnVPNGatewayRoutePropagation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `routeTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:route-table-ids` |
| `vpnGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-gateway-id` |"
  [stack id config]
  (let [builder (CfnVPNGatewayRoutePropagation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :route-table-ids)]
      (. builder routeTableIds data))
    (when-let [data (lookup-entry config id :vpn-gateway-id)]
      (. builder vpnGatewayId data))
    (.build builder)))


(defn cfn-vpn-gateway-route-propagation-props-builder
  "The cfn-vpn-gateway-route-propagation-props-builder function buildes out new instances of 
CfnVPNGatewayRoutePropagationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `routeTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:route-table-ids` |
| `vpnGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-gateway-id` |"
  [stack id config]
  (let [builder (CfnVPNGatewayRoutePropagationProps$Builder.)]
    (when-let [data (lookup-entry config id :route-table-ids)]
      (. builder routeTableIds data))
    (when-let [data (lookup-entry config id :vpn-gateway-id)]
      (. builder vpnGatewayId data))
    (.build builder)))


(defn client-vpn-authorization-rule-builder
  "The client-vpn-authorization-rule-builder function buildes out new instances of 
ClientVpnAuthorizationRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `clientVpnEndpoint` | software.amazon.awscdk.services.ec2.IClientVpnEndpoint | [[cdk.support/lookup-entry]] | `:client-vpn-endpoint` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |"
  [stack id config]
  (let [builder (ClientVpnAuthorizationRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :client-vpn-endpoint)]
      (. builder clientVpnEndpoint data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (.build builder)))


(defn client-vpn-authorization-rule-options-builder
  "The client-vpn-authorization-rule-options-builder function buildes out new instances of 
ClientVpnAuthorizationRuleOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |"
  [stack id config]
  (let [builder (ClientVpnAuthorizationRuleOptions$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (.build builder)))


(defn client-vpn-authorization-rule-props-builder
  "The client-vpn-authorization-rule-props-builder function buildes out new instances of 
ClientVpnAuthorizationRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `clientVpnEndpoint` | software.amazon.awscdk.services.ec2.IClientVpnEndpoint | [[cdk.support/lookup-entry]] | `:client-vpn-endpoint` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `groupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-id` |"
  [stack id config]
  (let [builder (ClientVpnAuthorizationRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :client-vpn-endpoint)]
      (. builder clientVpnEndpoint data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :group-id)]
      (. builder groupId data))
    (.build builder)))


(defn client-vpn-endpoint-attributes-builder
  "The client-vpn-endpoint-attributes-builder function buildes out new instances of 
ClientVpnEndpointAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-id` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |"
  [stack id config]
  (let [builder (ClientVpnEndpointAttributes$Builder.)]
    (when-let [data (lookup-entry config id :endpoint-id)]
      (. builder endpointId data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (.build builder)))


(defn client-vpn-endpoint-builder
  "The client-vpn-endpoint-builder function buildes out new instances of 
ClientVpnEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizeAllUsersToVpcCidr` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:authorize-all-users-to-vpc-cidr` |
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `clientCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-arn` |
| `clientConnectionHandler` | software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler | [[cdk.support/lookup-entry]] | `:client-connection-handler` |
| `clientLoginBanner` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-login-banner` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logStream` | software.amazon.awscdk.services.logs.ILogStream | [[cdk.support/lookup-entry]] | `:log-stream` |
| `logging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:logging` |
| `port` | software.amazon.awscdk.services.ec2.VpnPort | [[cdk.api.services.ec2/vpn-port]] | `:port` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `selfServicePortal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:self-service-portal` |
| `serverCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-arn` |
| `sessionTimeout` | software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout | [[cdk.api.services.ec2/client-vpn-session-timeout]] | `:session-timeout` |
| `splitTunnel` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:split-tunnel` |
| `transportProtocol` | software.amazon.awscdk.services.ec2.TransportProtocol | [[cdk.api.services.ec2/transport-protocol]] | `:transport-protocol` |
| `userBasedAuthentication` | software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication | [[cdk.support/lookup-entry]] | `:user-based-authentication` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ClientVpnEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authorize-all-users-to-vpc-cidr)]
      (. builder authorizeAllUsersToVpcCidr data))
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :client-certificate-arn)]
      (. builder clientCertificateArn data))
    (when-let [data (lookup-entry config id :client-connection-handler)]
      (. builder clientConnectionHandler data))
    (when-let [data (lookup-entry config id :client-login-banner)]
      (. builder clientLoginBanner data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :log-stream)]
      (. builder logStream data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (vpn-port config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :self-service-portal)]
      (. builder selfServicePortal data))
    (when-let [data (lookup-entry config id :server-certificate-arn)]
      (. builder serverCertificateArn data))
    (when-let [data (client-vpn-session-timeout config id :session-timeout)]
      (. builder sessionTimeout data))
    (when-let [data (lookup-entry config id :split-tunnel)]
      (. builder splitTunnel data))
    (when-let [data (transport-protocol config id :transport-protocol)]
      (. builder transportProtocol data))
    (when-let [data (lookup-entry config id :user-based-authentication)]
      (. builder userBasedAuthentication data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn client-vpn-endpoint-options-builder
  "The client-vpn-endpoint-options-builder function buildes out new instances of 
ClientVpnEndpointOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizeAllUsersToVpcCidr` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:authorize-all-users-to-vpc-cidr` |
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `clientCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-arn` |
| `clientConnectionHandler` | software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler | [[cdk.support/lookup-entry]] | `:client-connection-handler` |
| `clientLoginBanner` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-login-banner` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logStream` | software.amazon.awscdk.services.logs.ILogStream | [[cdk.support/lookup-entry]] | `:log-stream` |
| `logging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:logging` |
| `port` | software.amazon.awscdk.services.ec2.VpnPort | [[cdk.api.services.ec2/vpn-port]] | `:port` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `selfServicePortal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:self-service-portal` |
| `serverCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-arn` |
| `sessionTimeout` | software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout | [[cdk.api.services.ec2/client-vpn-session-timeout]] | `:session-timeout` |
| `splitTunnel` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:split-tunnel` |
| `transportProtocol` | software.amazon.awscdk.services.ec2.TransportProtocol | [[cdk.api.services.ec2/transport-protocol]] | `:transport-protocol` |
| `userBasedAuthentication` | software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication | [[cdk.support/lookup-entry]] | `:user-based-authentication` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ClientVpnEndpointOptions$Builder.)]
    (when-let [data (lookup-entry config id :authorize-all-users-to-vpc-cidr)]
      (. builder authorizeAllUsersToVpcCidr data))
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :client-certificate-arn)]
      (. builder clientCertificateArn data))
    (when-let [data (lookup-entry config id :client-connection-handler)]
      (. builder clientConnectionHandler data))
    (when-let [data (lookup-entry config id :client-login-banner)]
      (. builder clientLoginBanner data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :log-stream)]
      (. builder logStream data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (vpn-port config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :self-service-portal)]
      (. builder selfServicePortal data))
    (when-let [data (lookup-entry config id :server-certificate-arn)]
      (. builder serverCertificateArn data))
    (when-let [data (client-vpn-session-timeout config id :session-timeout)]
      (. builder sessionTimeout data))
    (when-let [data (lookup-entry config id :split-tunnel)]
      (. builder splitTunnel data))
    (when-let [data (transport-protocol config id :transport-protocol)]
      (. builder transportProtocol data))
    (when-let [data (lookup-entry config id :user-based-authentication)]
      (. builder userBasedAuthentication data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn client-vpn-endpoint-props-builder
  "The client-vpn-endpoint-props-builder function buildes out new instances of 
ClientVpnEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizeAllUsersToVpcCidr` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:authorize-all-users-to-vpc-cidr` |
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `clientCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-certificate-arn` |
| `clientConnectionHandler` | software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler | [[cdk.support/lookup-entry]] | `:client-connection-handler` |
| `clientLoginBanner` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-login-banner` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dnsServers` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-servers` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logStream` | software.amazon.awscdk.services.logs.ILogStream | [[cdk.support/lookup-entry]] | `:log-stream` |
| `logging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:logging` |
| `port` | software.amazon.awscdk.services.ec2.VpnPort | [[cdk.api.services.ec2/vpn-port]] | `:port` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `selfServicePortal` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:self-service-portal` |
| `serverCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-arn` |
| `sessionTimeout` | software.amazon.awscdk.services.ec2.ClientVpnSessionTimeout | [[cdk.api.services.ec2/client-vpn-session-timeout]] | `:session-timeout` |
| `splitTunnel` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:split-tunnel` |
| `transportProtocol` | software.amazon.awscdk.services.ec2.TransportProtocol | [[cdk.api.services.ec2/transport-protocol]] | `:transport-protocol` |
| `userBasedAuthentication` | software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication | [[cdk.support/lookup-entry]] | `:user-based-authentication` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ClientVpnEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :authorize-all-users-to-vpc-cidr)]
      (. builder authorizeAllUsersToVpcCidr data))
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :client-certificate-arn)]
      (. builder clientCertificateArn data))
    (when-let [data (lookup-entry config id :client-connection-handler)]
      (. builder clientConnectionHandler data))
    (when-let [data (lookup-entry config id :client-login-banner)]
      (. builder clientLoginBanner data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dns-servers)]
      (. builder dnsServers data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :log-stream)]
      (. builder logStream data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (vpn-port config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :self-service-portal)]
      (. builder selfServicePortal data))
    (when-let [data (lookup-entry config id :server-certificate-arn)]
      (. builder serverCertificateArn data))
    (when-let [data (client-vpn-session-timeout config id :session-timeout)]
      (. builder sessionTimeout data))
    (when-let [data (lookup-entry config id :split-tunnel)]
      (. builder splitTunnel data))
    (when-let [data (transport-protocol config id :transport-protocol)]
      (. builder transportProtocol data))
    (when-let [data (lookup-entry config id :user-based-authentication)]
      (. builder userBasedAuthentication data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn client-vpn-route-builder
  "The client-vpn-route-builder function buildes out new instances of 
ClientVpnRoute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `clientVpnEndpoint` | software.amazon.awscdk.services.ec2.IClientVpnEndpoint | [[cdk.support/lookup-entry]] | `:client-vpn-endpoint` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `target` | software.amazon.awscdk.services.ec2.ClientVpnRouteTarget | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (ClientVpnRoute$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :client-vpn-endpoint)]
      (. builder clientVpnEndpoint data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn client-vpn-route-options-builder
  "The client-vpn-route-options-builder function buildes out new instances of 
ClientVpnRouteOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `target` | software.amazon.awscdk.services.ec2.ClientVpnRouteTarget | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (ClientVpnRouteOptions$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn client-vpn-route-props-builder
  "The client-vpn-route-props-builder function buildes out new instances of 
ClientVpnRouteProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `clientVpnEndpoint` | software.amazon.awscdk.services.ec2.IClientVpnEndpoint | [[cdk.support/lookup-entry]] | `:client-vpn-endpoint` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `target` | software.amazon.awscdk.services.ec2.ClientVpnRouteTarget | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (ClientVpnRouteProps$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :client-vpn-endpoint)]
      (. builder clientVpnEndpoint data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn common-network-acl-entry-options-builder
  "The common-network-acl-entry-options-builder function buildes out new instances of 
CommonNetworkAclEntryOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | software.amazon.awscdk.services.ec2.AclCidr | [[cdk.support/lookup-entry]] | `:cidr` |
| `direction` | software.amazon.awscdk.services.ec2.TrafficDirection | [[cdk.api.services.ec2/traffic-direction]] | `:direction` |
| `networkAclEntryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-acl-entry-name` |
| `ruleAction` | software.amazon.awscdk.services.ec2.Action | [[cdk.api.services.ec2/action]] | `:rule-action` |
| `ruleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-number` |
| `traffic` | software.amazon.awscdk.services.ec2.AclTraffic | [[cdk.support/lookup-entry]] | `:traffic` |"
  [stack id config]
  (let [builder (CommonNetworkAclEntryOptions$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (traffic-direction config id :direction)]
      (. builder direction data))
    (when-let [data (lookup-entry config id :network-acl-entry-name)]
      (. builder networkAclEntryName data))
    (when-let [data (action config id :rule-action)]
      (. builder ruleAction data))
    (when-let [data (lookup-entry config id :rule-number)]
      (. builder ruleNumber data))
    (when-let [data (lookup-entry config id :traffic)]
      (. builder traffic data))
    (.build builder)))


(defn config-set-props-builder
  "The config-set-props-builder function buildes out new instances of 
ConfigSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configSets` | java.util.Map | [[cdk.support/lookup-entry]] | `:config-sets` |
| `configs` | java.util.Map | [[cdk.support/lookup-entry]] | `:configs` |"
  [stack id config]
  (let [builder (ConfigSetProps$Builder.)]
    (when-let [data (lookup-entry config id :config-sets)]
      (. builder configSets data))
    (when-let [data (lookup-entry config id :configs)]
      (. builder configs data))
    (.build builder)))


(defn configure-nat-options-builder
  "The configure-nat-options-builder function buildes out new instances of 
ConfigureNatOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `natSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:nat-subnets` |
| `privateSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:private-subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.Vpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ConfigureNatOptions$Builder.)]
    (when-let [data (lookup-entry config id :nat-subnets)]
      (. builder natSubnets data))
    (when-let [data (lookup-entry config id :private-subnets)]
      (. builder privateSubnets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn connection-rule-builder
  "The connection-rule-builder function buildes out new instances of 
ConnectionRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (ConnectionRule$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn connections-builder
  "The connections-builder function buildes out new instances of 
Connections$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultPort` | software.amazon.awscdk.services.ec2.Port | [[cdk.support/lookup-entry]] | `:default-port` |
| `peer` | software.amazon.awscdk.services.ec2.IPeer | [[cdk.support/lookup-entry]] | `:peer` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |"
  [stack id config]
  (let [builder (Connections$Builder/create)]
    (when-let [data (lookup-entry config id :default-port)]
      (. builder defaultPort data))
    (when-let [data (lookup-entry config id :peer)]
      (. builder peer data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (.build builder)))


(defn connections-props-builder
  "The connections-props-builder function buildes out new instances of 
ConnectionsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultPort` | software.amazon.awscdk.services.ec2.Port | [[cdk.support/lookup-entry]] | `:default-port` |
| `peer` | software.amazon.awscdk.services.ec2.IPeer | [[cdk.support/lookup-entry]] | `:peer` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |"
  [stack id config]
  (let [builder (ConnectionsProps$Builder.)]
    (when-let [data (lookup-entry config id :default-port)]
      (. builder defaultPort data))
    (when-let [data (lookup-entry config id :peer)]
      (. builder peer data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (.build builder)))


(defn create-ipv6-cidr-blocks-request-builder
  "The create-ipv6-cidr-blocks-request-builder function buildes out new instances of 
CreateIpv6CidrBlocksRequest$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipv6SelectedCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-selected-cidr` |
| `sizeMask` | java.lang.String | [[cdk.support/lookup-entry]] | `:size-mask` |
| `subnetCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:subnet-count` |"
  [stack id config]
  (let [builder (CreateIpv6CidrBlocksRequest$Builder.)]
    (when-let [data (lookup-entry config id :ipv6-selected-cidr)]
      (. builder ipv6SelectedCidr data))
    (when-let [data (lookup-entry config id :size-mask)]
      (. builder sizeMask data))
    (when-let [data (lookup-entry config id :subnet-count)]
      (. builder subnetCount data))
    (.build builder)))


(defn destination-options-builder
  "The destination-options-builder function buildes out new instances of 
DestinationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileFormat` | software.amazon.awscdk.services.ec2.FlowLogFileFormat | [[cdk.api.services.ec2/flow-log-file-format]] | `:file-format` |
| `hiveCompatiblePartitions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:hive-compatible-partitions` |
| `perHourPartition` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:per-hour-partition` |"
  [stack id config]
  (let [builder (DestinationOptions$Builder.)]
    (when-let [data (flow-log-file-format config id :file-format)]
      (. builder fileFormat data))
    (when-let [data (lookup-entry config id :hive-compatible-partitions)]
      (. builder hiveCompatiblePartitions data))
    (when-let [data (lookup-entry config id :per-hour-partition)]
      (. builder perHourPartition data))
    (.build builder)))


(defn ebs-device-options-base-builder
  "The ebs-device-options-base-builder function buildes out new instances of 
EbsDeviceOptionsBase$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `volumeType` | software.amazon.awscdk.services.ec2.EbsDeviceVolumeType | [[cdk.api.services.ec2/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (EbsDeviceOptionsBase$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn ebs-device-options-builder
  "The ebs-device-options-builder function buildes out new instances of 
EbsDeviceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `volumeType` | software.amazon.awscdk.services.ec2.EbsDeviceVolumeType | [[cdk.api.services.ec2/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (EbsDeviceOptions$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn ebs-device-props-builder
  "The ebs-device-props-builder function buildes out new instances of 
EbsDeviceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | software.amazon.awscdk.services.ec2.EbsDeviceVolumeType | [[cdk.api.services.ec2/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (EbsDeviceProps$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn ebs-device-snapshot-options-builder
  "The ebs-device-snapshot-options-builder function buildes out new instances of 
EbsDeviceSnapshotOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | software.amazon.awscdk.services.ec2.EbsDeviceVolumeType | [[cdk.api.services.ec2/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (EbsDeviceSnapshotOptions$Builder.)]
    (when-let [data (lookup-entry config id :delete-on-termination)]
      (. builder deleteOnTermination data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn enable-vpn-gateway-options-builder
  "The enable-vpn-gateway-options-builder function buildes out new instances of 
EnableVpnGatewayOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonSideAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:amazon-side-asn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `vpnRoutePropagation` | java.util.List | [[cdk.support/lookup-entry]] | `:vpn-route-propagation` |"
  [stack id config]
  (let [builder (EnableVpnGatewayOptions$Builder.)]
    (when-let [data (lookup-entry config id :amazon-side-asn)]
      (. builder amazonSideAsn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :vpn-route-propagation)]
      (. builder vpnRoutePropagation data))
    (.build builder)))


(defn execute-file-options-builder
  "The execute-file-options-builder function buildes out new instances of 
ExecuteFileOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arguments` | java.lang.String | [[cdk.support/lookup-entry]] | `:arguments` |
| `filePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-path` |"
  [stack id config]
  (let [builder (ExecuteFileOptions$Builder.)]
    (when-let [data (lookup-entry config id :arguments)]
      (. builder arguments data))
    (when-let [data (lookup-entry config id :file-path)]
      (. builder filePath data))
    (.build builder)))


(defn flow-log-builder
  "The flow-log-builder function buildes out new instances of 
FlowLog$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.ec2.FlowLogDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `flowLogName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-log-name` |
| `logFormat` | java.util.List | [[cdk.support/lookup-entry]] | `:log-format` |
| `maxAggregationInterval` | software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval | [[cdk.api.services.ec2/flow-log-max-aggregation-interval]] | `:max-aggregation-interval` |
| `resourceType` | software.amazon.awscdk.services.ec2.FlowLogResourceType | [[cdk.support/lookup-entry]] | `:resource-type` |
| `trafficType` | software.amazon.awscdk.services.ec2.FlowLogTrafficType | [[cdk.api.services.ec2/flow-log-traffic-type]] | `:traffic-type` |"
  [stack id config]
  (let [builder (FlowLog$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :flow-log-name)]
      (. builder flowLogName data))
    (when-let [data (lookup-entry config id :log-format)]
      (. builder logFormat data))
    (when-let [data (flow-log-max-aggregation-interval config id :max-aggregation-interval)]
      (. builder maxAggregationInterval data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (flow-log-traffic-type config id :traffic-type)]
      (. builder trafficType data))
    (.build builder)))


(defn flow-log-destination-config-builder
  "The flow-log-destination-config-builder function buildes out new instances of 
FlowLogDestinationConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-arn` |
| `destinationOptions` | software.amazon.awscdk.services.ec2.DestinationOptions | [[cdk.support/lookup-entry]] | `:destination-options` |
| `iamRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:iam-role` |
| `keyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-prefix` |
| `logDestinationType` | software.amazon.awscdk.services.ec2.FlowLogDestinationType | [[cdk.api.services.ec2/flow-log-destination-type]] | `:log-destination-type` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `s3Bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:s3-bucket` |"
  [stack id config]
  (let [builder (FlowLogDestinationConfig$Builder.)]
    (when-let [data (lookup-entry config id :delivery-stream-arn)]
      (. builder deliveryStreamArn data))
    (when-let [data (lookup-entry config id :destination-options)]
      (. builder destinationOptions data))
    (when-let [data (lookup-entry config id :iam-role)]
      (. builder iamRole data))
    (when-let [data (lookup-entry config id :key-prefix)]
      (. builder keyPrefix data))
    (when-let [data (flow-log-destination-type config id :log-destination-type)]
      (. builder logDestinationType data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (.build builder)))


(defn flow-log-options-builder
  "The flow-log-options-builder function buildes out new instances of 
FlowLogOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.ec2.FlowLogDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `logFormat` | java.util.List | [[cdk.support/lookup-entry]] | `:log-format` |
| `maxAggregationInterval` | software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval | [[cdk.api.services.ec2/flow-log-max-aggregation-interval]] | `:max-aggregation-interval` |
| `trafficType` | software.amazon.awscdk.services.ec2.FlowLogTrafficType | [[cdk.api.services.ec2/flow-log-traffic-type]] | `:traffic-type` |"
  [stack id config]
  (let [builder (FlowLogOptions$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :log-format)]
      (. builder logFormat data))
    (when-let [data (flow-log-max-aggregation-interval config id :max-aggregation-interval)]
      (. builder maxAggregationInterval data))
    (when-let [data (flow-log-traffic-type config id :traffic-type)]
      (. builder trafficType data))
    (.build builder)))


(defn flow-log-props-builder
  "The flow-log-props-builder function buildes out new instances of 
FlowLogProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.ec2.FlowLogDestination | [[cdk.support/lookup-entry]] | `:destination` |
| `flowLogName` | java.lang.String | [[cdk.support/lookup-entry]] | `:flow-log-name` |
| `logFormat` | java.util.List | [[cdk.support/lookup-entry]] | `:log-format` |
| `maxAggregationInterval` | software.amazon.awscdk.services.ec2.FlowLogMaxAggregationInterval | [[cdk.api.services.ec2/flow-log-max-aggregation-interval]] | `:max-aggregation-interval` |
| `resourceType` | software.amazon.awscdk.services.ec2.FlowLogResourceType | [[cdk.support/lookup-entry]] | `:resource-type` |
| `trafficType` | software.amazon.awscdk.services.ec2.FlowLogTrafficType | [[cdk.api.services.ec2/flow-log-traffic-type]] | `:traffic-type` |"
  [stack id config]
  (let [builder (FlowLogProps$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :flow-log-name)]
      (. builder flowLogName data))
    (when-let [data (lookup-entry config id :log-format)]
      (. builder logFormat data))
    (when-let [data (flow-log-max-aggregation-interval config id :max-aggregation-interval)]
      (. builder maxAggregationInterval data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (flow-log-traffic-type config id :traffic-type)]
      (. builder trafficType data))
    (.build builder)))


(defn gateway-config-builder
  "The gateway-config-builder function buildes out new instances of 
GatewayConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `az` | java.lang.String | [[cdk.support/lookup-entry]] | `:az` |
| `gatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-id` |"
  [stack id config]
  (let [builder (GatewayConfig$Builder.)]
    (when-let [data (lookup-entry config id :az)]
      (. builder az data))
    (when-let [data (lookup-entry config id :gateway-id)]
      (. builder gatewayId data))
    (.build builder)))


(defn gateway-vpc-endpoint-builder
  "The gateway-vpc-endpoint-builder function buildes out new instances of 
GatewayVpcEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `service` | software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService | [[cdk.support/lookup-entry]] | `:service` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (GatewayVpcEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn gateway-vpc-endpoint-options-builder
  "The gateway-vpc-endpoint-options-builder function buildes out new instances of 
GatewayVpcEndpointOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `service` | software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService | [[cdk.support/lookup-entry]] | `:service` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (GatewayVpcEndpointOptions$Builder.)]
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn gateway-vpc-endpoint-props-builder
  "The gateway-vpc-endpoint-props-builder function buildes out new instances of 
GatewayVpcEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `service` | software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService | [[cdk.support/lookup-entry]] | `:service` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (GatewayVpcEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn generic-linux-image-builder
  "The generic-linux-image-builder function buildes out new instances of 
GenericLinuxImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config ^java.util.Map ami-map]
  (let [builder (GenericLinuxImage$Builder/create ^java.util.Map ami-map)]
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn generic-linux-image-props-builder
  "The generic-linux-image-props-builder function buildes out new instances of 
GenericLinuxImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (GenericLinuxImageProps$Builder.)]
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn generic-windows-image-builder
  "The generic-windows-image-builder function buildes out new instances of 
GenericWindowsImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config ^java.util.Map ami-map]
  (let [builder (GenericWindowsImage$Builder/create ^java.util.Map ami-map)]
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn generic-windows-image-props-builder
  "The generic-windows-image-props-builder function buildes out new instances of 
GenericWindowsImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (GenericWindowsImageProps$Builder.)]
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn init-command-options-builder
  "The init-command-options-builder function buildes out new instances of 
InitCommandOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cwd` | java.lang.String | [[cdk.support/lookup-entry]] | `:cwd` |
| `env` | java.util.Map | [[cdk.support/lookup-entry]] | `:env` |
| `ignoreErrors` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-errors` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `serviceRestartHandles` | java.util.List | [[cdk.support/lookup-entry]] | `:service-restart-handles` |
| `testCmd` | java.lang.String | [[cdk.support/lookup-entry]] | `:test-cmd` |
| `waitAfterCompletion` | software.amazon.awscdk.services.ec2.InitCommandWaitDuration | [[cdk.support/lookup-entry]] | `:wait-after-completion` |"
  [stack id config]
  (let [builder (InitCommandOptions$Builder.)]
    (when-let [data (lookup-entry config id :cwd)]
      (. builder cwd data))
    (when-let [data (lookup-entry config id :env)]
      (. builder env data))
    (when-let [data (lookup-entry config id :ignore-errors)]
      (. builder ignoreErrors data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :service-restart-handles)]
      (. builder serviceRestartHandles data))
    (when-let [data (lookup-entry config id :test-cmd)]
      (. builder testCmd data))
    (when-let [data (lookup-entry config id :wait-after-completion)]
      (. builder waitAfterCompletion data))
    (.build builder)))


(defn init-file-asset-options-builder
  "The init-file-asset-options-builder function buildes out new instances of 
InitFileAssetOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `base64Encoded` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:base64-encoded` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `group` | java.lang.String | [[cdk.support/lookup-entry]] | `:group` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
| `serviceRestartHandles` | java.util.List | [[cdk.support/lookup-entry]] | `:service-restart-handles` |"
  [stack id config]
  (let [builder (InitFileAssetOptions$Builder.)]
    (when-let [data (lookup-entry config id :asset-hash)]
      (. builder assetHash data))
    (when-let [data (asset-hash-type config id :asset-hash-type)]
      (. builder assetHashType data))
    (when-let [data (lookup-entry config id :base64-encoded)]
      (. builder base64Encoded data))
    (when-let [data (lookup-entry config id :bundling)]
      (. builder bundling data))
    (when-let [data (lookup-entry config id :deploy-time)]
      (. builder deployTime data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (lookup-entry config id :group)]
      (. builder group data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :readers)]
      (. builder readers data))
    (when-let [data (lookup-entry config id :service-restart-handles)]
      (. builder serviceRestartHandles data))
    (.build builder)))


(defn init-file-options-builder
  "The init-file-options-builder function buildes out new instances of 
InitFileOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `base64Encoded` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:base64-encoded` |
| `group` | java.lang.String | [[cdk.support/lookup-entry]] | `:group` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `owner` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner` |
| `serviceRestartHandles` | java.util.List | [[cdk.support/lookup-entry]] | `:service-restart-handles` |"
  [stack id config]
  (let [builder (InitFileOptions$Builder.)]
    (when-let [data (lookup-entry config id :base64-encoded)]
      (. builder base64Encoded data))
    (when-let [data (lookup-entry config id :group)]
      (. builder group data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :owner)]
      (. builder owner data))
    (when-let [data (lookup-entry config id :service-restart-handles)]
      (. builder serviceRestartHandles data))
    (.build builder)))


(defn init-service-options-builder
  "The init-service-options-builder function buildes out new instances of 
InitServiceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `ensureRunning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ensure-running` |
| `serviceManager` | software.amazon.awscdk.services.ec2.ServiceManager | [[cdk.api.services.ec2/service-manager]] | `:service-manager` |
| `serviceRestartHandle` | software.amazon.awscdk.services.ec2.InitServiceRestartHandle | [[cdk.support/lookup-entry]] | `:service-restart-handle` |"
  [stack id config]
  (let [builder (InitServiceOptions$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :ensure-running)]
      (. builder ensureRunning data))
    (when-let [data (service-manager config id :service-manager)]
      (. builder serviceManager data))
    (when-let [data (lookup-entry config id :service-restart-handle)]
      (. builder serviceRestartHandle data))
    (.build builder)))


(defn init-source-asset-options-builder
  "The init-source-asset-options-builder function buildes out new instances of 
InitSourceAssetOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `assetHashType` | software.amazon.awscdk.AssetHashType | [[cdk.api/asset-hash-type]] | `:asset-hash-type` |
| `bundling` | software.amazon.awscdk.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `deployTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deploy-time` |
| `exclude` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude` |
| `followSymlinks` | software.amazon.awscdk.SymlinkFollowMode | [[cdk.api/symlink-follow-mode]] | `:follow-symlinks` |
| `ignoreMode` | software.amazon.awscdk.IgnoreMode | [[cdk.api/ignore-mode]] | `:ignore-mode` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
| `serviceRestartHandles` | java.util.List | [[cdk.support/lookup-entry]] | `:service-restart-handles` |"
  [stack id config]
  (let [builder (InitSourceAssetOptions$Builder.)]
    (when-let [data (lookup-entry config id :asset-hash)]
      (. builder assetHash data))
    (when-let [data (asset-hash-type config id :asset-hash-type)]
      (. builder assetHashType data))
    (when-let [data (lookup-entry config id :bundling)]
      (. builder bundling data))
    (when-let [data (lookup-entry config id :deploy-time)]
      (. builder deployTime data))
    (when-let [data (lookup-entry config id :exclude)]
      (. builder exclude data))
    (when-let [data (symlink-follow-mode config id :follow-symlinks)]
      (. builder followSymlinks data))
    (when-let [data (ignore-mode config id :ignore-mode)]
      (. builder ignoreMode data))
    (when-let [data (lookup-entry config id :readers)]
      (. builder readers data))
    (when-let [data (lookup-entry config id :service-restart-handles)]
      (. builder serviceRestartHandles data))
    (.build builder)))


(defn init-source-options-builder
  "The init-source-options-builder function buildes out new instances of 
InitSourceOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceRestartHandles` | java.util.List | [[cdk.support/lookup-entry]] | `:service-restart-handles` |"
  [stack id config]
  (let [builder (InitSourceOptions$Builder.)]
    (when-let [data (lookup-entry config id :service-restart-handles)]
      (. builder serviceRestartHandles data))
    (.build builder)))


(defn init-user-options-builder
  "The init-user-options-builder function buildes out new instances of 
InitUserOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `homeDir` | java.lang.String | [[cdk.support/lookup-entry]] | `:home-dir` |
| `userId` | java.lang.Number | [[cdk.support/lookup-entry]] | `:user-id` |"
  [stack id config]
  (let [builder (InitUserOptions$Builder.)]
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :home-dir)]
      (. builder homeDir data))
    (when-let [data (lookup-entry config id :user-id)]
      (. builder userId data))
    (.build builder)))


(defn instance-builder
  "The instance-builder function buildes out new instances of 
Instance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllIpv6Outbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-ipv6-outbound` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `associatePublicIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `blockDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:block-devices` |
| `creditSpecification` | software.amazon.awscdk.services.ec2.CpuCredits | [[cdk.api.services.ec2/cpu-credits]] | `:credit-specification` |
| `detailedMonitoring` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:detailed-monitoring` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `init` | software.amazon.awscdk.services.ec2.CloudFormationInit | [[cdk.support/lookup-entry]] | `:init` |
| `initOptions` | software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions | [[cdk.support/lookup-entry]] | `:init-options` |
| `instanceInitiatedShutdownBehavior` | software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior | [[cdk.api.services.ec2/instance-initiated-shutdown-behavior]] | `:instance-initiated-shutdown-behavior` |
| `instanceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-name` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyPair` | software.amazon.awscdk.services.ec2.IKeyPair | [[cdk.support/lookup-entry]] | `:key-pair` |
| `machineImage` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:machine-image` |
| `placementGroup` | software.amazon.awscdk.services.ec2.IPlacementGroup | [[cdk.support/lookup-entry]] | `:placement-group` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `propagateTagsToVolumeOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags-to-volume-on-creation` |
| `requireImdsv2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-imdsv2` |
| `resourceSignalTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:resource-signal-timeout` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `sourceDestCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:source-dest-check` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |
| `userDataCausesReplacement` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-data-causes-replacement` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (Instance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allow-all-ipv6-outbound)]
      (. builder allowAllIpv6Outbound data))
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :block-devices)]
      (. builder blockDevices data))
    (when-let [data (cpu-credits config id :credit-specification)]
      (. builder creditSpecification data))
    (when-let [data (lookup-entry config id :detailed-monitoring)]
      (. builder detailedMonitoring data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :init)]
      (. builder init data))
    (when-let [data (lookup-entry config id :init-options)]
      (. builder initOptions data))
    (when-let [data (instance-initiated-shutdown-behavior config id :instance-initiated-shutdown-behavior)]
      (. builder instanceInitiatedShutdownBehavior data))
    (when-let [data (lookup-entry config id :instance-name)]
      (. builder instanceName data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (lookup-entry config id :machine-image)]
      (. builder machineImage data))
    (when-let [data (lookup-entry config id :placement-group)]
      (. builder placementGroup data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :propagate-tags-to-volume-on-creation)]
      (. builder propagateTagsToVolumeOnCreation data))
    (when-let [data (lookup-entry config id :require-imdsv2)]
      (. builder requireImdsv2 data))
    (when-let [data (lookup-entry config id :resource-signal-timeout)]
      (. builder resourceSignalTimeout data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :source-dest-check)]
      (. builder sourceDestCheck data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (lookup-entry config id :user-data-causes-replacement)]
      (. builder userDataCausesReplacement data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn instance-props-builder
  "The instance-props-builder function buildes out new instances of 
InstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllIpv6Outbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-ipv6-outbound` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `associatePublicIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `blockDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:block-devices` |
| `creditSpecification` | software.amazon.awscdk.services.ec2.CpuCredits | [[cdk.api.services.ec2/cpu-credits]] | `:credit-specification` |
| `detailedMonitoring` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:detailed-monitoring` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `init` | software.amazon.awscdk.services.ec2.CloudFormationInit | [[cdk.support/lookup-entry]] | `:init` |
| `initOptions` | software.amazon.awscdk.services.ec2.ApplyCloudFormationInitOptions | [[cdk.support/lookup-entry]] | `:init-options` |
| `instanceInitiatedShutdownBehavior` | software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior | [[cdk.api.services.ec2/instance-initiated-shutdown-behavior]] | `:instance-initiated-shutdown-behavior` |
| `instanceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-name` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyPair` | software.amazon.awscdk.services.ec2.IKeyPair | [[cdk.support/lookup-entry]] | `:key-pair` |
| `machineImage` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:machine-image` |
| `placementGroup` | software.amazon.awscdk.services.ec2.IPlacementGroup | [[cdk.support/lookup-entry]] | `:placement-group` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `propagateTagsToVolumeOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:propagate-tags-to-volume-on-creation` |
| `requireImdsv2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-imdsv2` |
| `resourceSignalTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:resource-signal-timeout` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `sourceDestCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:source-dest-check` |
| `ssmSessionPermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ssm-session-permissions` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |
| `userDataCausesReplacement` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-data-causes-replacement` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (InstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-all-ipv6-outbound)]
      (. builder allowAllIpv6Outbound data))
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :block-devices)]
      (. builder blockDevices data))
    (when-let [data (cpu-credits config id :credit-specification)]
      (. builder creditSpecification data))
    (when-let [data (lookup-entry config id :detailed-monitoring)]
      (. builder detailedMonitoring data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :init)]
      (. builder init data))
    (when-let [data (lookup-entry config id :init-options)]
      (. builder initOptions data))
    (when-let [data (instance-initiated-shutdown-behavior config id :instance-initiated-shutdown-behavior)]
      (. builder instanceInitiatedShutdownBehavior data))
    (when-let [data (lookup-entry config id :instance-name)]
      (. builder instanceName data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (lookup-entry config id :machine-image)]
      (. builder machineImage data))
    (when-let [data (lookup-entry config id :placement-group)]
      (. builder placementGroup data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :propagate-tags-to-volume-on-creation)]
      (. builder propagateTagsToVolumeOnCreation data))
    (when-let [data (lookup-entry config id :require-imdsv2)]
      (. builder requireImdsv2 data))
    (when-let [data (lookup-entry config id :resource-signal-timeout)]
      (. builder resourceSignalTimeout data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :source-dest-check)]
      (. builder sourceDestCheck data))
    (when-let [data (lookup-entry config id :ssm-session-permissions)]
      (. builder ssmSessionPermissions data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (lookup-entry config id :user-data-causes-replacement)]
      (. builder userDataCausesReplacement data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn instance-require-imdsv2-aspect-builder
  "The instance-require-imdsv2-aspect-builder function buildes out new instances of 
InstanceRequireImdsv2Aspect$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `suppressLaunchTemplateWarning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:suppress-launch-template-warning` |
| `suppressWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:suppress-warnings` |"
  [stack id config]
  (let [builder (InstanceRequireImdsv2Aspect$Builder/create)]
    (when-let [data (lookup-entry config id :suppress-launch-template-warning)]
      (. builder suppressLaunchTemplateWarning data))
    (when-let [data (lookup-entry config id :suppress-warnings)]
      (. builder suppressWarnings data))
    (.build builder)))


(defn instance-require-imdsv2-aspect-props-builder
  "The instance-require-imdsv2-aspect-props-builder function buildes out new instances of 
InstanceRequireImdsv2AspectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `suppressLaunchTemplateWarning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:suppress-launch-template-warning` |
| `suppressWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:suppress-warnings` |"
  [stack id config]
  (let [builder (InstanceRequireImdsv2AspectProps$Builder.)]
    (when-let [data (lookup-entry config id :suppress-launch-template-warning)]
      (. builder suppressLaunchTemplateWarning data))
    (when-let [data (lookup-entry config id :suppress-warnings)]
      (. builder suppressWarnings data))
    (.build builder)))


(defn interface-vpc-endpoint-attributes-builder
  "The interface-vpc-endpoint-attributes-builder function buildes out new instances of 
InterfaceVpcEndpointAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |"
  [stack id config]
  (let [builder (InterfaceVpcEndpointAttributes$Builder.)]
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (.build builder)))


(defn interface-vpc-endpoint-aws-service-props-builder
  "The interface-vpc-endpoint-aws-service-props-builder function buildes out new instances of 
InterfaceVpcEndpointAwsServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `global` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:global` |"
  [stack id config]
  (let [builder (InterfaceVpcEndpointAwsServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :global)]
      (. builder global data))
    (.build builder)))


(defn interface-vpc-endpoint-builder
  "The interface-vpc-endpoint-builder function buildes out new instances of 
InterfaceVpcEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lookupSupportedAzs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lookup-supported-azs` |
| `open` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open` |
| `privateDnsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:private-dns-enabled` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `service` | software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService | [[cdk.support/lookup-entry]] | `:service` |
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (InterfaceVpcEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :lookup-supported-azs)]
      (. builder lookupSupportedAzs data))
    (when-let [data (lookup-entry config id :open)]
      (. builder open data))
    (when-let [data (lookup-entry config id :private-dns-enabled)]
      (. builder privateDnsEnabled data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn interface-vpc-endpoint-options-builder
  "The interface-vpc-endpoint-options-builder function buildes out new instances of 
InterfaceVpcEndpointOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lookupSupportedAzs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lookup-supported-azs` |
| `open` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open` |
| `privateDnsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:private-dns-enabled` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `service` | software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService | [[cdk.support/lookup-entry]] | `:service` |
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (InterfaceVpcEndpointOptions$Builder.)]
    (when-let [data (lookup-entry config id :lookup-supported-azs)]
      (. builder lookupSupportedAzs data))
    (when-let [data (lookup-entry config id :open)]
      (. builder open data))
    (when-let [data (lookup-entry config id :private-dns-enabled)]
      (. builder privateDnsEnabled data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn interface-vpc-endpoint-props-builder
  "The interface-vpc-endpoint-props-builder function buildes out new instances of 
InterfaceVpcEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lookupSupportedAzs` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lookup-supported-azs` |
| `open` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open` |
| `privateDnsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:private-dns-enabled` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `service` | software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService | [[cdk.support/lookup-entry]] | `:service` |
| `subnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (InterfaceVpcEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :lookup-supported-azs)]
      (. builder lookupSupportedAzs data))
    (when-let [data (lookup-entry config id :open)]
      (. builder open data))
    (when-let [data (lookup-entry config id :private-dns-enabled)]
      (. builder privateDnsEnabled data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn key-pair-attributes-builder
  "The key-pair-attributes-builder function buildes out new instances of 
KeyPairAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyPairName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-pair-name` |
| `type` | software.amazon.awscdk.services.ec2.KeyPairType | [[cdk.api.services.ec2/key-pair-type]] | `:type` |"
  [stack id config]
  (let [builder (KeyPairAttributes$Builder.)]
    (when-let [data (lookup-entry config id :key-pair-name)]
      (. builder keyPairName data))
    (when-let [data (key-pair-type config id :type)]
      (. builder type data))
    (.build builder)))


(defn key-pair-builder
  "The key-pair-builder function buildes out new instances of 
KeyPair$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `environmentFromArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-from-arn` |
| `format` | software.amazon.awscdk.services.ec2.KeyPairFormat | [[cdk.api.services.ec2/key-pair-format]] | `:format` |
| `keyPairName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-pair-name` |
| `physicalName` | java.lang.String | [[cdk.support/lookup-entry]] | `:physical-name` |
| `publicKeyMaterial` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-material` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `type` | software.amazon.awscdk.services.ec2.KeyPairType | [[cdk.api.services.ec2/key-pair-type]] | `:type` |"
  [stack id config]
  (let [builder (KeyPair$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :environment-from-arn)]
      (. builder environmentFromArn data))
    (when-let [data (key-pair-format config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :key-pair-name)]
      (. builder keyPairName data))
    (when-let [data (lookup-entry config id :physical-name)]
      (. builder physicalName data))
    (when-let [data (lookup-entry config id :public-key-material)]
      (. builder publicKeyMaterial data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (key-pair-type config id :type)]
      (. builder type data))
    (.build builder)))


(defn key-pair-props-builder
  "The key-pair-props-builder function buildes out new instances of 
KeyPairProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `environmentFromArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-from-arn` |
| `format` | software.amazon.awscdk.services.ec2.KeyPairFormat | [[cdk.api.services.ec2/key-pair-format]] | `:format` |
| `keyPairName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-pair-name` |
| `physicalName` | java.lang.String | [[cdk.support/lookup-entry]] | `:physical-name` |
| `publicKeyMaterial` | java.lang.String | [[cdk.support/lookup-entry]] | `:public-key-material` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `type` | software.amazon.awscdk.services.ec2.KeyPairType | [[cdk.api.services.ec2/key-pair-type]] | `:type` |"
  [stack id config]
  (let [builder (KeyPairProps$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :environment-from-arn)]
      (. builder environmentFromArn data))
    (when-let [data (key-pair-format config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :key-pair-name)]
      (. builder keyPairName data))
    (when-let [data (lookup-entry config id :physical-name)]
      (. builder physicalName data))
    (when-let [data (lookup-entry config id :public-key-material)]
      (. builder publicKeyMaterial data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (key-pair-type config id :type)]
      (. builder type data))
    (.build builder)))


(defn launch-template-attributes-builder
  "The launch-template-attributes-builder function buildes out new instances of 
LaunchTemplateAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `versionNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-number` |"
  [stack id config]
  (let [builder (LaunchTemplateAttributes$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-id)]
      (. builder launchTemplateId data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :version-number)]
      (. builder versionNumber data))
    (.build builder)))


(defn launch-template-builder
  "The launch-template-builder function buildes out new instances of 
LaunchTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatePublicIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `blockDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:block-devices` |
| `cpuCredits` | software.amazon.awscdk.services.ec2.CpuCredits | [[cdk.api.services.ec2/cpu-credits]] | `:cpu-credits` |
| `detailedMonitoring` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:detailed-monitoring` |
| `disableApiTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-api-termination` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `hibernationConfigured` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:hibernation-configured` |
| `httpEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:http-endpoint` |
| `httpProtocolIpv6` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:http-protocol-ipv6` |
| `httpPutResponseHopLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-put-response-hop-limit` |
| `httpTokens` | software.amazon.awscdk.services.ec2.LaunchTemplateHttpTokens | [[cdk.api.services.ec2/launch-template-http-tokens]] | `:http-tokens` |
| `instanceInitiatedShutdownBehavior` | software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior | [[cdk.api.services.ec2/instance-initiated-shutdown-behavior]] | `:instance-initiated-shutdown-behavior` |
| `instanceMetadataTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:instance-metadata-tags` |
| `instanceProfile` | software.amazon.awscdk.services.iam.IInstanceProfile | [[cdk.support/lookup-entry]] | `:instance-profile` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyPair` | software.amazon.awscdk.services.ec2.IKeyPair | [[cdk.support/lookup-entry]] | `:key-pair` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `machineImage` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:machine-image` |
| `nitroEnclaveEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:nitro-enclave-enabled` |
| `requireImdsv2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-imdsv2` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `spotOptions` | software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions | [[cdk.support/lookup-entry]] | `:spot-options` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (LaunchTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :block-devices)]
      (. builder blockDevices data))
    (when-let [data (cpu-credits config id :cpu-credits)]
      (. builder cpuCredits data))
    (when-let [data (lookup-entry config id :detailed-monitoring)]
      (. builder detailedMonitoring data))
    (when-let [data (lookup-entry config id :disable-api-termination)]
      (. builder disableApiTermination data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :hibernation-configured)]
      (. builder hibernationConfigured data))
    (when-let [data (lookup-entry config id :http-endpoint)]
      (. builder httpEndpoint data))
    (when-let [data (lookup-entry config id :http-protocol-ipv6)]
      (. builder httpProtocolIpv6 data))
    (when-let [data (lookup-entry config id :http-put-response-hop-limit)]
      (. builder httpPutResponseHopLimit data))
    (when-let [data (launch-template-http-tokens config id :http-tokens)]
      (. builder httpTokens data))
    (when-let [data (instance-initiated-shutdown-behavior config id :instance-initiated-shutdown-behavior)]
      (. builder instanceInitiatedShutdownBehavior data))
    (when-let [data (lookup-entry config id :instance-metadata-tags)]
      (. builder instanceMetadataTags data))
    (when-let [data (lookup-entry config id :instance-profile)]
      (. builder instanceProfile data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :machine-image)]
      (. builder machineImage data))
    (when-let [data (lookup-entry config id :nitro-enclave-enabled)]
      (. builder nitroEnclaveEnabled data))
    (when-let [data (lookup-entry config id :require-imdsv2)]
      (. builder requireImdsv2 data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :spot-options)]
      (. builder spotOptions data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn launch-template-props-builder
  "The launch-template-props-builder function buildes out new instances of 
LaunchTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatePublicIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `blockDevices` | java.util.List | [[cdk.support/lookup-entry]] | `:block-devices` |
| `cpuCredits` | software.amazon.awscdk.services.ec2.CpuCredits | [[cdk.api.services.ec2/cpu-credits]] | `:cpu-credits` |
| `detailedMonitoring` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:detailed-monitoring` |
| `disableApiTermination` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-api-termination` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `hibernationConfigured` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:hibernation-configured` |
| `httpEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:http-endpoint` |
| `httpProtocolIpv6` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:http-protocol-ipv6` |
| `httpPutResponseHopLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:http-put-response-hop-limit` |
| `httpTokens` | software.amazon.awscdk.services.ec2.LaunchTemplateHttpTokens | [[cdk.api.services.ec2/launch-template-http-tokens]] | `:http-tokens` |
| `instanceInitiatedShutdownBehavior` | software.amazon.awscdk.services.ec2.InstanceInitiatedShutdownBehavior | [[cdk.api.services.ec2/instance-initiated-shutdown-behavior]] | `:instance-initiated-shutdown-behavior` |
| `instanceMetadataTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:instance-metadata-tags` |
| `instanceProfile` | software.amazon.awscdk.services.iam.IInstanceProfile | [[cdk.support/lookup-entry]] | `:instance-profile` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyPair` | software.amazon.awscdk.services.ec2.IKeyPair | [[cdk.support/lookup-entry]] | `:key-pair` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `machineImage` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:machine-image` |
| `nitroEnclaveEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:nitro-enclave-enabled` |
| `requireImdsv2` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-imdsv2` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `spotOptions` | software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions | [[cdk.support/lookup-entry]] | `:spot-options` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (LaunchTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :associate-public-ip-address)]
      (. builder associatePublicIpAddress data))
    (when-let [data (lookup-entry config id :block-devices)]
      (. builder blockDevices data))
    (when-let [data (cpu-credits config id :cpu-credits)]
      (. builder cpuCredits data))
    (when-let [data (lookup-entry config id :detailed-monitoring)]
      (. builder detailedMonitoring data))
    (when-let [data (lookup-entry config id :disable-api-termination)]
      (. builder disableApiTermination data))
    (when-let [data (lookup-entry config id :ebs-optimized)]
      (. builder ebsOptimized data))
    (when-let [data (lookup-entry config id :hibernation-configured)]
      (. builder hibernationConfigured data))
    (when-let [data (lookup-entry config id :http-endpoint)]
      (. builder httpEndpoint data))
    (when-let [data (lookup-entry config id :http-protocol-ipv6)]
      (. builder httpProtocolIpv6 data))
    (when-let [data (lookup-entry config id :http-put-response-hop-limit)]
      (. builder httpPutResponseHopLimit data))
    (when-let [data (launch-template-http-tokens config id :http-tokens)]
      (. builder httpTokens data))
    (when-let [data (instance-initiated-shutdown-behavior config id :instance-initiated-shutdown-behavior)]
      (. builder instanceInitiatedShutdownBehavior data))
    (when-let [data (lookup-entry config id :instance-metadata-tags)]
      (. builder instanceMetadataTags data))
    (when-let [data (lookup-entry config id :instance-profile)]
      (. builder instanceProfile data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :machine-image)]
      (. builder machineImage data))
    (when-let [data (lookup-entry config id :nitro-enclave-enabled)]
      (. builder nitroEnclaveEnabled data))
    (when-let [data (lookup-entry config id :require-imdsv2)]
      (. builder requireImdsv2 data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :spot-options)]
      (. builder spotOptions data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn launch-template-require-imdsv2-aspect-builder
  "The launch-template-require-imdsv2-aspect-builder function buildes out new instances of 
LaunchTemplateRequireImdsv2Aspect$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `suppressWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:suppress-warnings` |"
  [stack id config]
  (let [builder (LaunchTemplateRequireImdsv2Aspect$Builder/create)]
    (when-let [data (lookup-entry config id :suppress-warnings)]
      (. builder suppressWarnings data))
    (.build builder)))


(defn launch-template-require-imdsv2-aspect-props-builder
  "The launch-template-require-imdsv2-aspect-props-builder function buildes out new instances of 
LaunchTemplateRequireImdsv2AspectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `suppressWarnings` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:suppress-warnings` |"
  [stack id config]
  (let [builder (LaunchTemplateRequireImdsv2AspectProps$Builder.)]
    (when-let [data (lookup-entry config id :suppress-warnings)]
      (. builder suppressWarnings data))
    (.build builder)))


(defn launch-template-spot-options-builder
  "The launch-template-spot-options-builder function buildes out new instances of 
LaunchTemplateSpotOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockDuration` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:block-duration` |
| `interruptionBehavior` | software.amazon.awscdk.services.ec2.SpotInstanceInterruption | [[cdk.api.services.ec2/spot-instance-interruption]] | `:interruption-behavior` |
| `maxPrice` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-price` |
| `requestType` | software.amazon.awscdk.services.ec2.SpotRequestType | [[cdk.api.services.ec2/spot-request-type]] | `:request-type` |
| `validUntil` | software.amazon.awscdk.Expiration | [[cdk.support/lookup-entry]] | `:valid-until` |"
  [stack id config]
  (let [builder (LaunchTemplateSpotOptions$Builder.)]
    (when-let [data (lookup-entry config id :block-duration)]
      (. builder blockDuration data))
    (when-let [data (spot-instance-interruption config id :interruption-behavior)]
      (. builder interruptionBehavior data))
    (when-let [data (lookup-entry config id :max-price)]
      (. builder maxPrice data))
    (when-let [data (spot-request-type config id :request-type)]
      (. builder requestType data))
    (when-let [data (lookup-entry config id :valid-until)]
      (. builder validUntil data))
    (.build builder)))


(defn linux-user-data-options-builder
  "The linux-user-data-options-builder function buildes out new instances of 
LinuxUserDataOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `shebang` | java.lang.String | [[cdk.support/lookup-entry]] | `:shebang` |"
  [stack id config]
  (let [builder (LinuxUserDataOptions$Builder.)]
    (when-let [data (lookup-entry config id :shebang)]
      (. builder shebang data))
    (.build builder)))


(defn location-package-options-builder
  "The location-package-options-builder function buildes out new instances of 
LocationPackageOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `serviceRestartHandles` | java.util.List | [[cdk.support/lookup-entry]] | `:service-restart-handles` |"
  [stack id config]
  (let [builder (LocationPackageOptions$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :service-restart-handles)]
      (. builder serviceRestartHandles data))
    (.build builder)))


(defn lookup-machine-image-builder
  "The lookup-machine-image-builder function buildes out new instances of 
LookupMachineImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | java.util.Map | [[cdk.support/lookup-entry]] | `:filters` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `owners` | java.util.List | [[cdk.support/lookup-entry]] | `:owners` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |
| `windows` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:windows` |"
  [stack id config]
  (let [builder (LookupMachineImage$Builder/create)]
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :owners)]
      (. builder owners data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (lookup-entry config id :windows)]
      (. builder windows data))
    (.build builder)))


(defn lookup-machine-image-props-builder
  "The lookup-machine-image-props-builder function buildes out new instances of 
LookupMachineImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | java.util.Map | [[cdk.support/lookup-entry]] | `:filters` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `owners` | java.util.List | [[cdk.support/lookup-entry]] | `:owners` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |
| `windows` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:windows` |"
  [stack id config]
  (let [builder (LookupMachineImageProps$Builder.)]
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :owners)]
      (. builder owners data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (when-let [data (lookup-entry config id :windows)]
      (. builder windows data))
    (.build builder)))


(defn machine-image-config-builder
  "The machine-image-config-builder function buildes out new instances of 
MachineImageConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `osType` | software.amazon.awscdk.services.ec2.OperatingSystemType | [[cdk.api.services.ec2/operating-system-type]] | `:os-type` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (MachineImageConfig$Builder.)]
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (operating-system-type config id :os-type)]
      (. builder osType data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn multipart-body-options-builder
  "The multipart-body-options-builder function buildes out new instances of 
MultipartBodyOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `transferEncoding` | java.lang.String | [[cdk.support/lookup-entry]] | `:transfer-encoding` |"
  [stack id config]
  (let [builder (MultipartBodyOptions$Builder.)]
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :transfer-encoding)]
      (. builder transferEncoding data))
    (.build builder)))


(defn multipart-user-data-builder
  "The multipart-user-data-builder function buildes out new instances of 
MultipartUserData$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partsSeparator` | java.lang.String | [[cdk.support/lookup-entry]] | `:parts-separator` |"
  [stack id config]
  (let [builder (MultipartUserData$Builder/create)]
    (when-let [data (lookup-entry config id :parts-separator)]
      (. builder partsSeparator data))
    (.build builder)))


(defn multipart-user-data-options-builder
  "The multipart-user-data-options-builder function buildes out new instances of 
MultipartUserDataOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partsSeparator` | java.lang.String | [[cdk.support/lookup-entry]] | `:parts-separator` |"
  [stack id config]
  (let [builder (MultipartUserDataOptions$Builder.)]
    (when-let [data (lookup-entry config id :parts-separator)]
      (. builder partsSeparator data))
    (.build builder)))


(defn named-package-options-builder
  "The named-package-options-builder function buildes out new instances of 
NamedPackageOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceRestartHandles` | java.util.List | [[cdk.support/lookup-entry]] | `:service-restart-handles` |
| `version` | java.util.List | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (NamedPackageOptions$Builder.)]
    (when-let [data (lookup-entry config id :service-restart-handles)]
      (. builder serviceRestartHandles data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn nat-gateway-props-builder
  "The nat-gateway-props-builder function buildes out new instances of 
NatGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eipAllocationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:eip-allocation-ids` |"
  [stack id config]
  (let [builder (NatGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :eip-allocation-ids)]
      (. builder eipAllocationIds data))
    (.build builder)))


(defn nat-instance-props-builder
  "The nat-instance-props-builder function buildes out new instances of 
NatInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `creditSpecification` | software.amazon.awscdk.services.ec2.CpuCredits | [[cdk.api.services.ec2/cpu-credits]] | `:credit-specification` |
| `defaultAllowedTraffic` | software.amazon.awscdk.services.ec2.NatTrafficDirection | [[cdk.api.services.ec2/nat-traffic-direction]] | `:default-allowed-traffic` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyPair` | software.amazon.awscdk.services.ec2.IKeyPair | [[cdk.support/lookup-entry]] | `:key-pair` |
| `machineImage` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:machine-image` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (NatInstanceProps$Builder.)]
    (when-let [data (cpu-credits config id :credit-specification)]
      (. builder creditSpecification data))
    (when-let [data (nat-traffic-direction config id :default-allowed-traffic)]
      (. builder defaultAllowedTraffic data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (lookup-entry config id :machine-image)]
      (. builder machineImage data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn nat-instance-provider-v2-builder
  "The nat-instance-provider-v2-builder function buildes out new instances of 
NatInstanceProviderV2$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `creditSpecification` | software.amazon.awscdk.services.ec2.CpuCredits | [[cdk.api.services.ec2/cpu-credits]] | `:credit-specification` |
| `defaultAllowedTraffic` | software.amazon.awscdk.services.ec2.NatTrafficDirection | [[cdk.api.services.ec2/nat-traffic-direction]] | `:default-allowed-traffic` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `keyPair` | software.amazon.awscdk.services.ec2.IKeyPair | [[cdk.support/lookup-entry]] | `:key-pair` |
| `machineImage` | software.amazon.awscdk.services.ec2.IMachineImage | [[cdk.support/lookup-entry]] | `:machine-image` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (NatInstanceProviderV2$Builder/create)]
    (when-let [data (cpu-credits config id :credit-specification)]
      (. builder creditSpecification data))
    (when-let [data (nat-traffic-direction config id :default-allowed-traffic)]
      (. builder defaultAllowedTraffic data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :key-pair)]
      (. builder keyPair data))
    (when-let [data (lookup-entry config id :machine-image)]
      (. builder machineImage data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn network-acl-builder
  "The network-acl-builder function buildes out new instances of 
NetworkAcl$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkAclName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-acl-name` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkAcl$Builder/create stack id)]
    (when-let [data (lookup-entry config id :network-acl-name)]
      (. builder networkAclName data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-acl-entry-builder
  "The network-acl-entry-builder function buildes out new instances of 
NetworkAclEntry$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | software.amazon.awscdk.services.ec2.AclCidr | [[cdk.support/lookup-entry]] | `:cidr` |
| `direction` | software.amazon.awscdk.services.ec2.TrafficDirection | [[cdk.api.services.ec2/traffic-direction]] | `:direction` |
| `networkAcl` | software.amazon.awscdk.services.ec2.INetworkAcl | [[cdk.support/lookup-entry]] | `:network-acl` |
| `networkAclEntryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-acl-entry-name` |
| `ruleAction` | software.amazon.awscdk.services.ec2.Action | [[cdk.api.services.ec2/action]] | `:rule-action` |
| `ruleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-number` |
| `traffic` | software.amazon.awscdk.services.ec2.AclTraffic | [[cdk.support/lookup-entry]] | `:traffic` |"
  [stack id config]
  (let [builder (NetworkAclEntry$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (traffic-direction config id :direction)]
      (. builder direction data))
    (when-let [data (lookup-entry config id :network-acl)]
      (. builder networkAcl data))
    (when-let [data (lookup-entry config id :network-acl-entry-name)]
      (. builder networkAclEntryName data))
    (when-let [data (action config id :rule-action)]
      (. builder ruleAction data))
    (when-let [data (lookup-entry config id :rule-number)]
      (. builder ruleNumber data))
    (when-let [data (lookup-entry config id :traffic)]
      (. builder traffic data))
    (.build builder)))


(defn network-acl-entry-props-builder
  "The network-acl-entry-props-builder function buildes out new instances of 
NetworkAclEntryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidr` | software.amazon.awscdk.services.ec2.AclCidr | [[cdk.support/lookup-entry]] | `:cidr` |
| `direction` | software.amazon.awscdk.services.ec2.TrafficDirection | [[cdk.api.services.ec2/traffic-direction]] | `:direction` |
| `networkAcl` | software.amazon.awscdk.services.ec2.INetworkAcl | [[cdk.support/lookup-entry]] | `:network-acl` |
| `networkAclEntryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-acl-entry-name` |
| `ruleAction` | software.amazon.awscdk.services.ec2.Action | [[cdk.api.services.ec2/action]] | `:rule-action` |
| `ruleNumber` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rule-number` |
| `traffic` | software.amazon.awscdk.services.ec2.AclTraffic | [[cdk.support/lookup-entry]] | `:traffic` |"
  [stack id config]
  (let [builder (NetworkAclEntryProps$Builder.)]
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (traffic-direction config id :direction)]
      (. builder direction data))
    (when-let [data (lookup-entry config id :network-acl)]
      (. builder networkAcl data))
    (when-let [data (lookup-entry config id :network-acl-entry-name)]
      (. builder networkAclEntryName data))
    (when-let [data (action config id :rule-action)]
      (. builder ruleAction data))
    (when-let [data (lookup-entry config id :rule-number)]
      (. builder ruleNumber data))
    (when-let [data (lookup-entry config id :traffic)]
      (. builder traffic data))
    (.build builder)))


(defn network-acl-props-builder
  "The network-acl-props-builder function buildes out new instances of 
NetworkAclProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkAclName` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-acl-name` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkAclProps$Builder.)]
    (when-let [data (lookup-entry config id :network-acl-name)]
      (. builder networkAclName data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn placement-group-builder
  "The placement-group-builder function buildes out new instances of 
PlacementGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:partitions` |
| `placementGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-group-name` |
| `spreadLevel` | software.amazon.awscdk.services.ec2.PlacementGroupSpreadLevel | [[cdk.api.services.ec2/placement-group-spread-level]] | `:spread-level` |
| `strategy` | software.amazon.awscdk.services.ec2.PlacementGroupStrategy | [[cdk.api.services.ec2/placement-group-strategy]] | `:strategy` |"
  [stack id config]
  (let [builder (PlacementGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :partitions)]
      (. builder partitions data))
    (when-let [data (lookup-entry config id :placement-group-name)]
      (. builder placementGroupName data))
    (when-let [data (placement-group-spread-level config id :spread-level)]
      (. builder spreadLevel data))
    (when-let [data (placement-group-strategy config id :strategy)]
      (. builder strategy data))
    (.build builder)))


(defn placement-group-props-builder
  "The placement-group-props-builder function buildes out new instances of 
PlacementGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:partitions` |
| `placementGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:placement-group-name` |
| `spreadLevel` | software.amazon.awscdk.services.ec2.PlacementGroupSpreadLevel | [[cdk.api.services.ec2/placement-group-spread-level]] | `:spread-level` |
| `strategy` | software.amazon.awscdk.services.ec2.PlacementGroupStrategy | [[cdk.api.services.ec2/placement-group-strategy]] | `:strategy` |"
  [stack id config]
  (let [builder (PlacementGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :partitions)]
      (. builder partitions data))
    (when-let [data (lookup-entry config id :placement-group-name)]
      (. builder placementGroupName data))
    (when-let [data (placement-group-spread-level config id :spread-level)]
      (. builder spreadLevel data))
    (when-let [data (placement-group-strategy config id :strategy)]
      (. builder strategy data))
    (.build builder)))


(defn port-builder
  "The port-builder function buildes out new instances of 
Port$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `protocol` | software.amazon.awscdk.services.ec2.Protocol | [[cdk.api.services.ec2/protocol]] | `:protocol` |
| `stringRepresentation` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-representation` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (Port$Builder/create)]
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :string-representation)]
      (. builder stringRepresentation data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn port-props-builder
  "The port-props-builder function buildes out new instances of 
PortProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `protocol` | software.amazon.awscdk.services.ec2.Protocol | [[cdk.api.services.ec2/protocol]] | `:protocol` |
| `stringRepresentation` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-representation` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (PortProps$Builder.)]
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :string-representation)]
      (. builder stringRepresentation data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn prefix-list-builder
  "The prefix-list-builder function buildes out new instances of 
PrefixList$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressFamily` | software.amazon.awscdk.services.ec2.AddressFamily | [[cdk.api.services.ec2/address-family]] | `:address-family` |
| `entries` | java.util.List | [[cdk.support/lookup-entry]] | `:entries` |
| `maxEntries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-entries` |
| `prefixListName` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-list-name` |"
  [stack id config]
  (let [builder (PrefixList$Builder/create stack id)]
    (when-let [data (address-family config id :address-family)]
      (. builder addressFamily data))
    (when-let [data (lookup-entry config id :entries)]
      (. builder entries data))
    (when-let [data (lookup-entry config id :max-entries)]
      (. builder maxEntries data))
    (when-let [data (lookup-entry config id :prefix-list-name)]
      (. builder prefixListName data))
    (.build builder)))


(defn prefix-list-options-builder
  "The prefix-list-options-builder function buildes out new instances of 
PrefixListOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxEntries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-entries` |"
  [stack id config]
  (let [builder (PrefixListOptions$Builder.)]
    (when-let [data (lookup-entry config id :max-entries)]
      (. builder maxEntries data))
    (.build builder)))


(defn prefix-list-props-builder
  "The prefix-list-props-builder function buildes out new instances of 
PrefixListProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressFamily` | software.amazon.awscdk.services.ec2.AddressFamily | [[cdk.api.services.ec2/address-family]] | `:address-family` |
| `entries` | java.util.List | [[cdk.support/lookup-entry]] | `:entries` |
| `maxEntries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-entries` |
| `prefixListName` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix-list-name` |"
  [stack id config]
  (let [builder (PrefixListProps$Builder.)]
    (when-let [data (address-family config id :address-family)]
      (. builder addressFamily data))
    (when-let [data (lookup-entry config id :entries)]
      (. builder entries data))
    (when-let [data (lookup-entry config id :max-entries)]
      (. builder maxEntries data))
    (when-let [data (lookup-entry config id :prefix-list-name)]
      (. builder prefixListName data))
    (.build builder)))


(defn private-subnet-attributes-builder
  "The private-subnet-attributes-builder function buildes out new instances of 
PrivateSubnetAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `ipv4CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-cidr-block` |
| `routeTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-table-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (PrivateSubnetAttributes$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :ipv4-cidr-block)]
      (. builder ipv4CidrBlock data))
    (when-let [data (lookup-entry config id :route-table-id)]
      (. builder routeTableId data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn private-subnet-builder
  "The private-subnet-builder function buildes out new instances of 
PrivateSubnet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignIpv6AddressOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-ipv6-address-on-creation` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `mapPublicIpOnLaunch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-public-ip-on-launch` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (PrivateSubnet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-ipv6-address-on-creation)]
      (. builder assignIpv6AddressOnCreation data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :map-public-ip-on-launch)]
      (. builder mapPublicIpOnLaunch data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn private-subnet-props-builder
  "The private-subnet-props-builder function buildes out new instances of 
PrivateSubnetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignIpv6AddressOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-ipv6-address-on-creation` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `mapPublicIpOnLaunch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-public-ip-on-launch` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (PrivateSubnetProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-ipv6-address-on-creation)]
      (. builder assignIpv6AddressOnCreation data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :map-public-ip-on-launch)]
      (. builder mapPublicIpOnLaunch data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn public-subnet-attributes-builder
  "The public-subnet-attributes-builder function buildes out new instances of 
PublicSubnetAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `ipv4CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-cidr-block` |
| `routeTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-table-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (PublicSubnetAttributes$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :ipv4-cidr-block)]
      (. builder ipv4CidrBlock data))
    (when-let [data (lookup-entry config id :route-table-id)]
      (. builder routeTableId data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn public-subnet-builder
  "The public-subnet-builder function buildes out new instances of 
PublicSubnet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignIpv6AddressOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-ipv6-address-on-creation` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `mapPublicIpOnLaunch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-public-ip-on-launch` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (PublicSubnet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-ipv6-address-on-creation)]
      (. builder assignIpv6AddressOnCreation data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :map-public-ip-on-launch)]
      (. builder mapPublicIpOnLaunch data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn public-subnet-props-builder
  "The public-subnet-props-builder function buildes out new instances of 
PublicSubnetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignIpv6AddressOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-ipv6-address-on-creation` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `mapPublicIpOnLaunch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-public-ip-on-launch` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (PublicSubnetProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-ipv6-address-on-creation)]
      (. builder assignIpv6AddressOnCreation data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :map-public-ip-on-launch)]
      (. builder mapPublicIpOnLaunch data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn requested-subnet-builder
  "The requested-subnet-builder function buildes out new instances of 
RequestedSubnet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `configuration` | software.amazon.awscdk.services.ec2.SubnetConfiguration | [[cdk.support/lookup-entry]] | `:configuration` |
| `subnetConstructId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-construct-id` |"
  [stack id config]
  (let [builder (RequestedSubnet$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :subnet-construct-id)]
      (. builder subnetConstructId data))
    (.build builder)))


(defn resolve-ssm-parameter-at-launch-image-builder
  "The resolve-ssm-parameter-at-launch-image-builder function buildes out new instances of 
ResolveSsmParameterAtLaunchImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `os` | software.amazon.awscdk.services.ec2.OperatingSystemType | [[cdk.api.services.ec2/operating-system-type]] | `:os` |
| `parameterVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-version` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config ^java.lang.String parameter-name]
  (let [builder (ResolveSsmParameterAtLaunchImage$Builder/create ^java.lang.String parameter-name)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (operating-system-type config id :os)]
      (. builder os data))
    (when-let [data (lookup-entry config id :parameter-version)]
      (. builder parameterVersion data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn rule-scope-builder
  "The rule-scope-builder function buildes out new instances of 
RuleScope$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `scope` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:scope` |"
  [stack id config]
  (let [builder (RuleScope$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (.build builder)))


(defn s3-destination-options-builder
  "The s3-destination-options-builder function buildes out new instances of 
S3DestinationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fileFormat` | software.amazon.awscdk.services.ec2.FlowLogFileFormat | [[cdk.api.services.ec2/flow-log-file-format]] | `:file-format` |
| `hiveCompatiblePartitions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:hive-compatible-partitions` |
| `perHourPartition` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:per-hour-partition` |"
  [stack id config]
  (let [builder (S3DestinationOptions$Builder.)]
    (when-let [data (flow-log-file-format config id :file-format)]
      (. builder fileFormat data))
    (when-let [data (lookup-entry config id :hive-compatible-partitions)]
      (. builder hiveCompatiblePartitions data))
    (when-let [data (lookup-entry config id :per-hour-partition)]
      (. builder perHourPartition data))
    (.build builder)))


(defn s3-download-options-builder
  "The s3-download-options-builder function buildes out new instances of 
S3DownloadOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | software.amazon.awscdk.services.s3.IBucket | [[cdk.support/lookup-entry]] | `:bucket` |
| `bucketKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-key` |
| `localFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-file` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (S3DownloadOptions$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :bucket-key)]
      (. builder bucketKey data))
    (when-let [data (lookup-entry config id :local-file)]
      (. builder localFile data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn security-group-builder
  "The security-group-builder function buildes out new instances of 
SecurityGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllIpv6Outbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-ipv6-outbound` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableInlineRules` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-inline-rules` |
| `securityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (SecurityGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allow-all-ipv6-outbound)]
      (. builder allowAllIpv6Outbound data))
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-inline-rules)]
      (. builder disableInlineRules data))
    (when-let [data (lookup-entry config id :security-group-name)]
      (. builder securityGroupName data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn security-group-import-options-builder
  "The security-group-import-options-builder function buildes out new instances of 
SecurityGroupImportOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllIpv6Outbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-ipv6-outbound` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `mutable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:mutable` |"
  [stack id config]
  (let [builder (SecurityGroupImportOptions$Builder.)]
    (when-let [data (lookup-entry config id :allow-all-ipv6-outbound)]
      (. builder allowAllIpv6Outbound data))
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :mutable)]
      (. builder mutable data))
    (.build builder)))


(defn security-group-props-builder
  "The security-group-props-builder function buildes out new instances of 
SecurityGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllIpv6Outbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-ipv6-outbound` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `disableInlineRules` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-inline-rules` |
| `securityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (SecurityGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-all-ipv6-outbound)]
      (. builder allowAllIpv6Outbound data))
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :disable-inline-rules)]
      (. builder disableInlineRules data))
    (when-let [data (lookup-entry config id :security-group-name)]
      (. builder securityGroupName data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn selected-subnets-builder
  "The selected-subnets-builder function buildes out new instances of 
SelectedSubnets$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `hasPublic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:has-public` |
| `internetConnectivityEstablished` | software.constructs.IDependable | [[cdk.support/lookup-entry]] | `:internet-connectivity-established` |
| `isPendingLookup` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-pending-lookup` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (SelectedSubnets$Builder.)]
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :has-public)]
      (. builder hasPublic data))
    (when-let [data (lookup-entry config id :internet-connectivity-established)]
      (. builder internetConnectivityEstablished data))
    (when-let [data (lookup-entry config id :is-pending-lookup)]
      (. builder isPendingLookup data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn ssm-parameter-image-options-builder
  "The ssm-parameter-image-options-builder function buildes out new instances of 
SsmParameterImageOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cachedInContext` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cached-in-context` |
| `os` | software.amazon.awscdk.services.ec2.OperatingSystemType | [[cdk.api.services.ec2/operating-system-type]] | `:os` |
| `parameterVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-version` |
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (SsmParameterImageOptions$Builder.)]
    (when-let [data (lookup-entry config id :cached-in-context)]
      (. builder cachedInContext data))
    (when-let [data (operating-system-type config id :os)]
      (. builder os data))
    (when-let [data (lookup-entry config id :parameter-version)]
      (. builder parameterVersion data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn subnet-attributes-builder
  "The subnet-attributes-builder function buildes out new instances of 
SubnetAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `ipv4CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-cidr-block` |
| `routeTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-table-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (SubnetAttributes$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :ipv4-cidr-block)]
      (. builder ipv4CidrBlock data))
    (when-let [data (lookup-entry config id :route-table-id)]
      (. builder routeTableId data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn subnet-builder
  "The subnet-builder function buildes out new instances of 
Subnet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignIpv6AddressOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-ipv6-address-on-creation` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `mapPublicIpOnLaunch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-public-ip-on-launch` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (Subnet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-ipv6-address-on-creation)]
      (. builder assignIpv6AddressOnCreation data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :map-public-ip-on-launch)]
      (. builder mapPublicIpOnLaunch data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn subnet-configuration-builder
  "The subnet-configuration-builder function buildes out new instances of 
SubnetConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrMask` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cidr-mask` |
| `ipv6AssignAddressOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-assign-address-on-creation` |
| `mapPublicIpOnLaunch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-public-ip-on-launch` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `reserved` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:reserved` |
| `subnetType` | software.amazon.awscdk.services.ec2.SubnetType | [[cdk.api.services.ec2/subnet-type]] | `:subnet-type` |"
  [stack id config]
  (let [builder (SubnetConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :cidr-mask)]
      (. builder cidrMask data))
    (when-let [data (lookup-entry config id :ipv6-assign-address-on-creation)]
      (. builder ipv6AssignAddressOnCreation data))
    (when-let [data (lookup-entry config id :map-public-ip-on-launch)]
      (. builder mapPublicIpOnLaunch data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :reserved)]
      (. builder reserved data))
    (when-let [data (subnet-type config id :subnet-type)]
      (. builder subnetType data))
    (.build builder)))


(defn subnet-ipam-options-builder
  "The subnet-ipam-options-builder function buildes out new instances of 
SubnetIpamOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:allocated-subnets` |"
  [stack id config]
  (let [builder (SubnetIpamOptions$Builder.)]
    (when-let [data (lookup-entry config id :allocated-subnets)]
      (. builder allocatedSubnets data))
    (.build builder)))


(defn subnet-network-acl-association-builder
  "The subnet-network-acl-association-builder function buildes out new instances of 
SubnetNetworkAclAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkAcl` | software.amazon.awscdk.services.ec2.INetworkAcl | [[cdk.support/lookup-entry]] | `:network-acl` |
| `subnet` | software.amazon.awscdk.services.ec2.ISubnet | [[cdk.support/lookup-entry]] | `:subnet` |
| `subnetNetworkAclAssociationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-network-acl-association-name` |"
  [stack id config]
  (let [builder (SubnetNetworkAclAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :network-acl)]
      (. builder networkAcl data))
    (when-let [data (lookup-entry config id :subnet)]
      (. builder subnet data))
    (when-let [data (lookup-entry config id :subnet-network-acl-association-name)]
      (. builder subnetNetworkAclAssociationName data))
    (.build builder)))


(defn subnet-network-acl-association-props-builder
  "The subnet-network-acl-association-props-builder function buildes out new instances of 
SubnetNetworkAclAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkAcl` | software.amazon.awscdk.services.ec2.INetworkAcl | [[cdk.support/lookup-entry]] | `:network-acl` |
| `subnet` | software.amazon.awscdk.services.ec2.ISubnet | [[cdk.support/lookup-entry]] | `:subnet` |
| `subnetNetworkAclAssociationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-network-acl-association-name` |"
  [stack id config]
  (let [builder (SubnetNetworkAclAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :network-acl)]
      (. builder networkAcl data))
    (when-let [data (lookup-entry config id :subnet)]
      (. builder subnet data))
    (when-let [data (lookup-entry config id :subnet-network-acl-association-name)]
      (. builder subnetNetworkAclAssociationName data))
    (.build builder)))


(defn subnet-props-builder
  "The subnet-props-builder function buildes out new instances of 
SubnetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignIpv6AddressOnCreation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-ipv6-address-on-creation` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `ipv6CidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6-cidr-block` |
| `mapPublicIpOnLaunch` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:map-public-ip-on-launch` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (SubnetProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-ipv6-address-on-creation)]
      (. builder assignIpv6AddressOnCreation data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :ipv6-cidr-block)]
      (. builder ipv6CidrBlock data))
    (when-let [data (lookup-entry config id :map-public-ip-on-launch)]
      (. builder mapPublicIpOnLaunch data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn subnet-selection-builder
  "The subnet-selection-builder function buildes out new instances of 
SubnetSelection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `onePerAz` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:one-per-az` |
| `subnetFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-filters` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `subnetType` | software.amazon.awscdk.services.ec2.SubnetType | [[cdk.api.services.ec2/subnet-type]] | `:subnet-type` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |"
  [stack id config]
  (let [builder (SubnetSelection$Builder.)]
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :one-per-az)]
      (. builder onePerAz data))
    (when-let [data (lookup-entry config id :subnet-filters)]
      (. builder subnetFilters data))
    (when-let [data (lookup-entry config id :subnet-group-name)]
      (. builder subnetGroupName data))
    (when-let [data (subnet-type config id :subnet-type)]
      (. builder subnetType data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (.build builder)))


(defn systemd-config-file-options-builder
  "The systemd-config-file-options-builder function buildes out new instances of 
SystemdConfigFileOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `afterNetwork` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:after-network` |
| `command` | java.lang.String | [[cdk.support/lookup-entry]] | `:command` |
| `cwd` | java.lang.String | [[cdk.support/lookup-entry]] | `:cwd` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environmentFiles` | java.util.List | [[cdk.support/lookup-entry]] | `:environment-files` |
| `environmentVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `group` | java.lang.String | [[cdk.support/lookup-entry]] | `:group` |
| `keepRunning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:keep-running` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (SystemdConfigFileOptions$Builder.)]
    (when-let [data (lookup-entry config id :after-network)]
      (. builder afterNetwork data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :cwd)]
      (. builder cwd data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :environment-files)]
      (. builder environmentFiles data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :group)]
      (. builder group data))
    (when-let [data (lookup-entry config id :keep-running)]
      (. builder keepRunning data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn volume-attributes-builder
  "The volume-attributes-builder function buildes out new instances of 
VolumeAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `volumeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-id` |"
  [stack id config]
  (let [builder (VolumeAttributes$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :volume-id)]
      (. builder volumeId data))
    (.build builder)))


(defn volume-builder
  "The volume-builder function buildes out new instances of 
Volume$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnableIo` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-enable-io` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `enableMultiAttach` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-multi-attach` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `size` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:size` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-name` |
| `volumeType` | software.amazon.awscdk.services.ec2.EbsDeviceVolumeType | [[cdk.api.services.ec2/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (Volume$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-enable-io)]
      (. builder autoEnableIo data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :enable-multi-attach)]
      (. builder enableMultiAttach data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-name)]
      (. builder volumeName data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn volume-props-builder
  "The volume-props-builder function buildes out new instances of 
VolumeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoEnableIo` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-enable-io` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `enableMultiAttach` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-multi-attach` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `size` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:size` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-name` |
| `volumeType` | software.amazon.awscdk.services.ec2.EbsDeviceVolumeType | [[cdk.api.services.ec2/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (VolumeProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-enable-io)]
      (. builder autoEnableIo data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :enable-multi-attach)]
      (. builder enableMultiAttach data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :snapshot-id)]
      (. builder snapshotId data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-name)]
      (. builder volumeName data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn vpc-attributes-builder
  "The vpc-attributes-builder function buildes out new instances of 
VpcAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `isolatedSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:isolated-subnet-ids` |
| `isolatedSubnetIpv4CidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:isolated-subnet-ipv4-cidr-blocks` |
| `isolatedSubnetNames` | java.util.List | [[cdk.support/lookup-entry]] | `:isolated-subnet-names` |
| `isolatedSubnetRouteTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:isolated-subnet-route-table-ids` |
| `privateSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:private-subnet-ids` |
| `privateSubnetIpv4CidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:private-subnet-ipv4-cidr-blocks` |
| `privateSubnetNames` | java.util.List | [[cdk.support/lookup-entry]] | `:private-subnet-names` |
| `privateSubnetRouteTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:private-subnet-route-table-ids` |
| `publicSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:public-subnet-ids` |
| `publicSubnetIpv4CidrBlocks` | java.util.List | [[cdk.support/lookup-entry]] | `:public-subnet-ipv4-cidr-blocks` |
| `publicSubnetNames` | java.util.List | [[cdk.support/lookup-entry]] | `:public-subnet-names` |
| `publicSubnetRouteTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:public-subnet-route-table-ids` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `vpcCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-cidr-block` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `vpnGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-gateway-id` |"
  [stack id config]
  (let [builder (VpcAttributes$Builder.)]
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :isolated-subnet-ids)]
      (. builder isolatedSubnetIds data))
    (when-let [data (lookup-entry config id :isolated-subnet-ipv4-cidr-blocks)]
      (. builder isolatedSubnetIpv4CidrBlocks data))
    (when-let [data (lookup-entry config id :isolated-subnet-names)]
      (. builder isolatedSubnetNames data))
    (when-let [data (lookup-entry config id :isolated-subnet-route-table-ids)]
      (. builder isolatedSubnetRouteTableIds data))
    (when-let [data (lookup-entry config id :private-subnet-ids)]
      (. builder privateSubnetIds data))
    (when-let [data (lookup-entry config id :private-subnet-ipv4-cidr-blocks)]
      (. builder privateSubnetIpv4CidrBlocks data))
    (when-let [data (lookup-entry config id :private-subnet-names)]
      (. builder privateSubnetNames data))
    (when-let [data (lookup-entry config id :private-subnet-route-table-ids)]
      (. builder privateSubnetRouteTableIds data))
    (when-let [data (lookup-entry config id :public-subnet-ids)]
      (. builder publicSubnetIds data))
    (when-let [data (lookup-entry config id :public-subnet-ipv4-cidr-blocks)]
      (. builder publicSubnetIpv4CidrBlocks data))
    (when-let [data (lookup-entry config id :public-subnet-names)]
      (. builder publicSubnetNames data))
    (when-let [data (lookup-entry config id :public-subnet-route-table-ids)]
      (. builder publicSubnetRouteTableIds data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :vpc-cidr-block)]
      (. builder vpcCidrBlock data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (when-let [data (lookup-entry config id :vpn-gateway-id)]
      (. builder vpnGatewayId data))
    (.build builder)))


(defn vpc-builder
  "The vpc-builder function buildes out new instances of 
Vpc$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `createInternetGateway` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:create-internet-gateway` |
| `defaultInstanceTenancy` | software.amazon.awscdk.services.ec2.DefaultInstanceTenancy | [[cdk.api.services.ec2/default-instance-tenancy]] | `:default-instance-tenancy` |
| `enableDnsHostnames` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-dns-hostnames` |
| `enableDnsSupport` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-dns-support` |
| `flowLogs` | java.util.Map | [[cdk.support/lookup-entry]] | `:flow-logs` |
| `gatewayEndpoints` | java.util.Map | [[cdk.support/lookup-entry]] | `:gateway-endpoints` |
| `ipAddresses` | software.amazon.awscdk.services.ec2.IIpAddresses | [[cdk.support/lookup-entry]] | `:ip-addresses` |
| `ipProtocol` | software.amazon.awscdk.services.ec2.IpProtocol | [[cdk.api.services.ec2/ip-protocol]] | `:ip-protocol` |
| `ipv6Addresses` | software.amazon.awscdk.services.ec2.IIpv6Addresses | [[cdk.support/lookup-entry]] | `:ipv6-addresses` |
| `maxAzs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-azs` |
| `natGatewayProvider` | software.amazon.awscdk.services.ec2.NatProvider | [[cdk.support/lookup-entry]] | `:nat-gateway-provider` |
| `natGatewaySubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:nat-gateway-subnets` |
| `natGateways` | java.lang.Number | [[cdk.support/lookup-entry]] | `:nat-gateways` |
| `reservedAzs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-azs` |
| `restrictDefaultSecurityGroup` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:restrict-default-security-group` |
| `subnetConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-configuration` |
| `vpcName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-name` |
| `vpnConnections` | java.util.Map | [[cdk.support/lookup-entry]] | `:vpn-connections` |
| `vpnGateway` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:vpn-gateway` |
| `vpnGatewayAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:vpn-gateway-asn` |
| `vpnRoutePropagation` | java.util.List | [[cdk.support/lookup-entry]] | `:vpn-route-propagation` |"
  [stack id config]
  (let [builder (Vpc$Builder/create stack id)]
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :create-internet-gateway)]
      (. builder createInternetGateway data))
    (when-let [data (default-instance-tenancy config id :default-instance-tenancy)]
      (. builder defaultInstanceTenancy data))
    (when-let [data (lookup-entry config id :enable-dns-hostnames)]
      (. builder enableDnsHostnames data))
    (when-let [data (lookup-entry config id :enable-dns-support)]
      (. builder enableDnsSupport data))
    (when-let [data (lookup-entry config id :flow-logs)]
      (. builder flowLogs data))
    (when-let [data (lookup-entry config id :gateway-endpoints)]
      (. builder gatewayEndpoints data))
    (when-let [data (lookup-entry config id :ip-addresses)]
      (. builder ipAddresses data))
    (when-let [data (ip-protocol config id :ip-protocol)]
      (. builder ipProtocol data))
    (when-let [data (lookup-entry config id :ipv6-addresses)]
      (. builder ipv6Addresses data))
    (when-let [data (lookup-entry config id :max-azs)]
      (. builder maxAzs data))
    (when-let [data (lookup-entry config id :nat-gateway-provider)]
      (. builder natGatewayProvider data))
    (when-let [data (lookup-entry config id :nat-gateway-subnets)]
      (. builder natGatewaySubnets data))
    (when-let [data (lookup-entry config id :nat-gateways)]
      (. builder natGateways data))
    (when-let [data (lookup-entry config id :reserved-azs)]
      (. builder reservedAzs data))
    (when-let [data (lookup-entry config id :restrict-default-security-group)]
      (. builder restrictDefaultSecurityGroup data))
    (when-let [data (lookup-entry config id :subnet-configuration)]
      (. builder subnetConfiguration data))
    (when-let [data (lookup-entry config id :vpc-name)]
      (. builder vpcName data))
    (when-let [data (lookup-entry config id :vpn-connections)]
      (. builder vpnConnections data))
    (when-let [data (lookup-entry config id :vpn-gateway)]
      (. builder vpnGateway data))
    (when-let [data (lookup-entry config id :vpn-gateway-asn)]
      (. builder vpnGatewayAsn data))
    (when-let [data (lookup-entry config id :vpn-route-propagation)]
      (. builder vpnRoutePropagation data))
    (.build builder)))


(defn vpc-endpoint-service-builder
  "The vpc-endpoint-service-builder function buildes out new instances of 
VpcEndpointService$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptanceRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:acceptance-required` |
| `allowedPrincipals` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-principals` |
| `contributorInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:contributor-insights` |
| `vpcEndpointServiceLoadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-endpoint-service-load-balancers` |"
  [stack id config]
  (let [builder (VpcEndpointService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :acceptance-required)]
      (. builder acceptanceRequired data))
    (when-let [data (lookup-entry config id :allowed-principals)]
      (. builder allowedPrincipals data))
    (when-let [data (lookup-entry config id :contributor-insights)]
      (. builder contributorInsights data))
    (when-let [data (lookup-entry config id :vpc-endpoint-service-load-balancers)]
      (. builder vpcEndpointServiceLoadBalancers data))
    (.build builder)))


(defn vpc-endpoint-service-props-builder
  "The vpc-endpoint-service-props-builder function buildes out new instances of 
VpcEndpointServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptanceRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:acceptance-required` |
| `allowedPrincipals` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-principals` |
| `contributorInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:contributor-insights` |
| `vpcEndpointServiceLoadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-endpoint-service-load-balancers` |"
  [stack id config]
  (let [builder (VpcEndpointServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :acceptance-required)]
      (. builder acceptanceRequired data))
    (when-let [data (lookup-entry config id :allowed-principals)]
      (. builder allowedPrincipals data))
    (when-let [data (lookup-entry config id :contributor-insights)]
      (. builder contributorInsights data))
    (when-let [data (lookup-entry config id :vpc-endpoint-service-load-balancers)]
      (. builder vpcEndpointServiceLoadBalancers data))
    (.build builder)))


(defn vpc-ipam-options-builder
  "The vpc-ipam-options-builder function buildes out new instances of 
VpcIpamOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr-block` |
| `ipv4IpamPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4-ipam-pool-id` |
| `ipv4NetmaskLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ipv4-netmask-length` |"
  [stack id config]
  (let [builder (VpcIpamOptions$Builder.)]
    (when-let [data (lookup-entry config id :cidr-block)]
      (. builder cidrBlock data))
    (when-let [data (lookup-entry config id :ipv4-ipam-pool-id)]
      (. builder ipv4IpamPoolId data))
    (when-let [data (lookup-entry config id :ipv4-netmask-length)]
      (. builder ipv4NetmaskLength data))
    (.build builder)))


(defn vpc-lookup-options-builder
  "The vpc-lookup-options-builder function buildes out new instances of 
VpcLookupOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isDefault` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-default` |
| `ownerAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-account-id` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `returnVpnGateways` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:return-vpn-gateways` |
| `subnetGroupNameTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name-tag` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `vpcName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-name` |"
  [stack id config]
  (let [builder (VpcLookupOptions$Builder.)]
    (when-let [data (lookup-entry config id :is-default)]
      (. builder isDefault data))
    (when-let [data (lookup-entry config id :owner-account-id)]
      (. builder ownerAccountId data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :return-vpn-gateways)]
      (. builder returnVpnGateways data))
    (when-let [data (lookup-entry config id :subnet-group-name-tag)]
      (. builder subnetGroupNameTag data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (when-let [data (lookup-entry config id :vpc-name)]
      (. builder vpcName data))
    (.build builder)))


(defn vpc-props-builder
  "The vpc-props-builder function buildes out new instances of 
VpcProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `createInternetGateway` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:create-internet-gateway` |
| `defaultInstanceTenancy` | software.amazon.awscdk.services.ec2.DefaultInstanceTenancy | [[cdk.api.services.ec2/default-instance-tenancy]] | `:default-instance-tenancy` |
| `enableDnsHostnames` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-dns-hostnames` |
| `enableDnsSupport` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-dns-support` |
| `flowLogs` | java.util.Map | [[cdk.support/lookup-entry]] | `:flow-logs` |
| `gatewayEndpoints` | java.util.Map | [[cdk.support/lookup-entry]] | `:gateway-endpoints` |
| `ipAddresses` | software.amazon.awscdk.services.ec2.IIpAddresses | [[cdk.support/lookup-entry]] | `:ip-addresses` |
| `ipProtocol` | software.amazon.awscdk.services.ec2.IpProtocol | [[cdk.api.services.ec2/ip-protocol]] | `:ip-protocol` |
| `ipv6Addresses` | software.amazon.awscdk.services.ec2.IIpv6Addresses | [[cdk.support/lookup-entry]] | `:ipv6-addresses` |
| `maxAzs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-azs` |
| `natGatewayProvider` | software.amazon.awscdk.services.ec2.NatProvider | [[cdk.support/lookup-entry]] | `:nat-gateway-provider` |
| `natGatewaySubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:nat-gateway-subnets` |
| `natGateways` | java.lang.Number | [[cdk.support/lookup-entry]] | `:nat-gateways` |
| `reservedAzs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-azs` |
| `restrictDefaultSecurityGroup` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:restrict-default-security-group` |
| `subnetConfiguration` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-configuration` |
| `vpcName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-name` |
| `vpnConnections` | java.util.Map | [[cdk.support/lookup-entry]] | `:vpn-connections` |
| `vpnGateway` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:vpn-gateway` |
| `vpnGatewayAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:vpn-gateway-asn` |
| `vpnRoutePropagation` | java.util.List | [[cdk.support/lookup-entry]] | `:vpn-route-propagation` |"
  [stack id config]
  (let [builder (VpcProps$Builder.)]
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :create-internet-gateway)]
      (. builder createInternetGateway data))
    (when-let [data (default-instance-tenancy config id :default-instance-tenancy)]
      (. builder defaultInstanceTenancy data))
    (when-let [data (lookup-entry config id :enable-dns-hostnames)]
      (. builder enableDnsHostnames data))
    (when-let [data (lookup-entry config id :enable-dns-support)]
      (. builder enableDnsSupport data))
    (when-let [data (lookup-entry config id :flow-logs)]
      (. builder flowLogs data))
    (when-let [data (lookup-entry config id :gateway-endpoints)]
      (. builder gatewayEndpoints data))
    (when-let [data (lookup-entry config id :ip-addresses)]
      (. builder ipAddresses data))
    (when-let [data (ip-protocol config id :ip-protocol)]
      (. builder ipProtocol data))
    (when-let [data (lookup-entry config id :ipv6-addresses)]
      (. builder ipv6Addresses data))
    (when-let [data (lookup-entry config id :max-azs)]
      (. builder maxAzs data))
    (when-let [data (lookup-entry config id :nat-gateway-provider)]
      (. builder natGatewayProvider data))
    (when-let [data (lookup-entry config id :nat-gateway-subnets)]
      (. builder natGatewaySubnets data))
    (when-let [data (lookup-entry config id :nat-gateways)]
      (. builder natGateways data))
    (when-let [data (lookup-entry config id :reserved-azs)]
      (. builder reservedAzs data))
    (when-let [data (lookup-entry config id :restrict-default-security-group)]
      (. builder restrictDefaultSecurityGroup data))
    (when-let [data (lookup-entry config id :subnet-configuration)]
      (. builder subnetConfiguration data))
    (when-let [data (lookup-entry config id :vpc-name)]
      (. builder vpcName data))
    (when-let [data (lookup-entry config id :vpn-connections)]
      (. builder vpnConnections data))
    (when-let [data (lookup-entry config id :vpn-gateway)]
      (. builder vpnGateway data))
    (when-let [data (lookup-entry config id :vpn-gateway-asn)]
      (. builder vpnGatewayAsn data))
    (when-let [data (lookup-entry config id :vpn-route-propagation)]
      (. builder vpnRoutePropagation data))
    (.build builder)))


(defn vpn-connection-attributes-builder
  "The vpn-connection-attributes-builder function buildes out new instances of 
VpnConnectionAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerGatewayAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:customer-gateway-asn` |
| `customerGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-gateway-id` |
| `customerGatewayIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:customer-gateway-ip` |
| `vpnId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-id` |"
  [stack id config]
  (let [builder (VpnConnectionAttributes$Builder.)]
    (when-let [data (lookup-entry config id :customer-gateway-asn)]
      (. builder customerGatewayAsn data))
    (when-let [data (lookup-entry config id :customer-gateway-id)]
      (. builder customerGatewayId data))
    (when-let [data (lookup-entry config id :customer-gateway-ip)]
      (. builder customerGatewayIp data))
    (when-let [data (lookup-entry config id :vpn-id)]
      (. builder vpnId data))
    (.build builder)))


(defn vpn-connection-builder
  "The vpn-connection-builder function buildes out new instances of 
VpnConnection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `asn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:asn` |
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `staticRoutes` | java.util.List | [[cdk.support/lookup-entry]] | `:static-routes` |
| `tunnelOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:tunnel-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (VpnConnection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :asn)]
      (. builder asn data))
    (when-let [data (lookup-entry config id :ip)]
      (. builder ip data))
    (when-let [data (lookup-entry config id :static-routes)]
      (. builder staticRoutes data))
    (when-let [data (lookup-entry config id :tunnel-options)]
      (. builder tunnelOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn vpn-connection-options-builder
  "The vpn-connection-options-builder function buildes out new instances of 
VpnConnectionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `asn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:asn` |
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `staticRoutes` | java.util.List | [[cdk.support/lookup-entry]] | `:static-routes` |
| `tunnelOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:tunnel-options` |"
  [stack id config]
  (let [builder (VpnConnectionOptions$Builder.)]
    (when-let [data (lookup-entry config id :asn)]
      (. builder asn data))
    (when-let [data (lookup-entry config id :ip)]
      (. builder ip data))
    (when-let [data (lookup-entry config id :static-routes)]
      (. builder staticRoutes data))
    (when-let [data (lookup-entry config id :tunnel-options)]
      (. builder tunnelOptions data))
    (.build builder)))


(defn vpn-connection-props-builder
  "The vpn-connection-props-builder function buildes out new instances of 
VpnConnectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `asn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:asn` |
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `staticRoutes` | java.util.List | [[cdk.support/lookup-entry]] | `:static-routes` |
| `tunnelOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:tunnel-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (VpnConnectionProps$Builder.)]
    (when-let [data (lookup-entry config id :asn)]
      (. builder asn data))
    (when-let [data (lookup-entry config id :ip)]
      (. builder ip data))
    (when-let [data (lookup-entry config id :static-routes)]
      (. builder staticRoutes data))
    (when-let [data (lookup-entry config id :tunnel-options)]
      (. builder tunnelOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn vpn-gateway-builder
  "The vpn-gateway-builder function buildes out new instances of 
VpnGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonSideAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:amazon-side-asn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (VpnGateway$Builder/create stack id)]
    (when-let [data (lookup-entry config id :amazon-side-asn)]
      (. builder amazonSideAsn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn vpn-gateway-props-builder
  "The vpn-gateway-props-builder function buildes out new instances of 
VpnGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `amazonSideAsn` | java.lang.Number | [[cdk.support/lookup-entry]] | `:amazon-side-asn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (VpnGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :amazon-side-asn)]
      (. builder amazonSideAsn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn vpn-tunnel-option-builder
  "The vpn-tunnel-option-builder function buildes out new instances of 
VpnTunnelOption$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preSharedKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:pre-shared-key` |
| `preSharedKeySecret` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:pre-shared-key-secret` |
| `tunnelInsideCidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:tunnel-inside-cidr` |"
  [stack id config]
  (let [builder (VpnTunnelOption$Builder.)]
    (when-let [data (lookup-entry config id :pre-shared-key)]
      (. builder preSharedKey data))
    (when-let [data (lookup-entry config id :pre-shared-key-secret)]
      (. builder preSharedKeySecret data))
    (when-let [data (lookup-entry config id :tunnel-inside-cidr)]
      (. builder tunnelInsideCidr data))
    (.build builder)))


(defn windows-image-builder
  "The windows-image-builder function buildes out new instances of 
WindowsImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config ^software.amazon.awscdk.services.ec2.WindowsVersion windows-version]
  (let [builder (WindowsImage$Builder/create ^software.amazon.awscdk.services.ec2.WindowsVersion windows-version)]
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn windows-image-props-builder
  "The windows-image-props-builder function buildes out new instances of 
WindowsImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userData` | software.amazon.awscdk.services.ec2.UserData | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (WindowsImageProps$Builder.)]
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn windows-user-data-options-builder
  "The windows-user-data-options-builder function buildes out new instances of 
WindowsUserDataOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `persist` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:persist` |"
  [stack id config]
  (let [builder (WindowsUserDataOptions$Builder.)]
    (when-let [data (lookup-entry config id :persist)]
      (. builder persist data))
    (.build builder)))