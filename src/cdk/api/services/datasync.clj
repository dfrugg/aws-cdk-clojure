(ns cdk.api.services.datasync
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.datasync package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.datasync CfnAgent$Builder
                                                     CfnAgentProps$Builder
                                                     CfnLocationAzureBlob$AzureBlobSasConfigurationProperty$Builder
                                                     CfnLocationAzureBlob$Builder
                                                     CfnLocationAzureBlobProps$Builder
                                                     CfnLocationEFS$Builder
                                                     CfnLocationEFS$Ec2ConfigProperty$Builder
                                                     CfnLocationEFSProps$Builder
                                                     CfnLocationFSxLustre$Builder
                                                     CfnLocationFSxLustreProps$Builder
                                                     CfnLocationFSxONTAP$Builder
                                                     CfnLocationFSxONTAP$NFSProperty$Builder
                                                     CfnLocationFSxONTAP$NfsMountOptionsProperty$Builder
                                                     CfnLocationFSxONTAP$ProtocolProperty$Builder
                                                     CfnLocationFSxONTAP$SMBProperty$Builder
                                                     CfnLocationFSxONTAP$SmbMountOptionsProperty$Builder
                                                     CfnLocationFSxONTAPProps$Builder
                                                     CfnLocationFSxOpenZFS$Builder
                                                     CfnLocationFSxOpenZFS$MountOptionsProperty$Builder
                                                     CfnLocationFSxOpenZFS$NFSProperty$Builder
                                                     CfnLocationFSxOpenZFS$ProtocolProperty$Builder
                                                     CfnLocationFSxOpenZFSProps$Builder
                                                     CfnLocationFSxWindows$Builder
                                                     CfnLocationFSxWindowsProps$Builder
                                                     CfnLocationHDFS$Builder
                                                     CfnLocationHDFS$NameNodeProperty$Builder
                                                     CfnLocationHDFS$QopConfigurationProperty$Builder
                                                     CfnLocationHDFSProps$Builder
                                                     CfnLocationNFS$Builder
                                                     CfnLocationNFS$MountOptionsProperty$Builder
                                                     CfnLocationNFS$OnPremConfigProperty$Builder
                                                     CfnLocationNFSProps$Builder
                                                     CfnLocationObjectStorage$Builder
                                                     CfnLocationObjectStorageProps$Builder
                                                     CfnLocationS3$Builder
                                                     CfnLocationS3$S3ConfigProperty$Builder
                                                     CfnLocationS3Props$Builder
                                                     CfnLocationSMB$Builder
                                                     CfnLocationSMB$MountOptionsProperty$Builder
                                                     CfnLocationSMBProps$Builder
                                                     CfnStorageSystem$Builder
                                                     CfnStorageSystem$ServerConfigurationProperty$Builder
                                                     CfnStorageSystem$ServerCredentialsProperty$Builder
                                                     CfnStorageSystemProps$Builder
                                                     CfnTask$Builder
                                                     CfnTask$DeletedProperty$Builder
                                                     CfnTask$DestinationProperty$Builder
                                                     CfnTask$FilterRuleProperty$Builder
                                                     CfnTask$ManifestConfigProperty$Builder
                                                     CfnTask$ManifestConfigSourceS3Property$Builder
                                                     CfnTask$OptionsProperty$Builder
                                                     CfnTask$OverridesProperty$Builder
                                                     CfnTask$S3Property$Builder
                                                     CfnTask$SkippedProperty$Builder
                                                     CfnTask$SourceProperty$Builder
                                                     CfnTask$TaskReportConfigProperty$Builder
                                                     CfnTask$TaskScheduleProperty$Builder
                                                     CfnTask$TransferredProperty$Builder
                                                     CfnTask$VerifiedProperty$Builder
                                                     CfnTaskProps$Builder]))


(defn cfn-agent-builder
  "The cfn-agent-builder function buildes out new instances of 
CfnAgent$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activationKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:activation-key` |
| `agentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-name` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subnetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |"
  [stack id config]
  (let [builder (CfnAgent$Builder/create stack id)]
    (when-let [data (lookup-entry config id :activation-key)]
      (. builder activationKey data))
    (when-let [data (lookup-entry config id :agent-name)]
      (. builder agentName data))
    (when-let [data (lookup-entry config id :security-group-arns)]
      (. builder securityGroupArns data))
    (when-let [data (lookup-entry config id :subnet-arns)]
      (. builder subnetArns data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (.build builder)))


(defn cfn-agent-props-builder
  "The cfn-agent-props-builder function buildes out new instances of 
CfnAgentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activationKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:activation-key` |
| `agentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-name` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subnetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |"
  [stack id config]
  (let [builder (CfnAgentProps$Builder.)]
    (when-let [data (lookup-entry config id :activation-key)]
      (. builder activationKey data))
    (when-let [data (lookup-entry config id :agent-name)]
      (. builder agentName data))
    (when-let [data (lookup-entry config id :security-group-arns)]
      (. builder securityGroupArns data))
    (when-let [data (lookup-entry config id :subnet-arns)]
      (. builder subnetArns data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (.build builder)))


(defn cfn-location-azure-blob-azure-blob-sas-configuration-property-builder
  "The cfn-location-azure-blob-azure-blob-sas-configuration-property-builder function buildes out new instances of 
CfnLocationAzureBlob$AzureBlobSasConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `azureBlobSasToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-sas-token` |"
  [stack id config]
  (let [builder (CfnLocationAzureBlob$AzureBlobSasConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :azure-blob-sas-token)]
      (. builder azureBlobSasToken data))
    (.build builder)))


(defn cfn-location-azure-blob-builder
  "The cfn-location-azure-blob-builder function buildes out new instances of 
CfnLocationAzureBlob$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `azureAccessTier` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-access-tier` |
| `azureBlobAuthenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-authentication-type` |
| `azureBlobContainerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-container-url` |
| `azureBlobSasConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:azure-blob-sas-configuration` |
| `azureBlobType` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-type` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationAzureBlob$Builder/create stack id)]
    (when-let [data (lookup-entry config id :agent-arns)]
      (. builder agentArns data))
    (when-let [data (lookup-entry config id :azure-access-tier)]
      (. builder azureAccessTier data))
    (when-let [data (lookup-entry config id :azure-blob-authentication-type)]
      (. builder azureBlobAuthenticationType data))
    (when-let [data (lookup-entry config id :azure-blob-container-url)]
      (. builder azureBlobContainerUrl data))
    (when-let [data (lookup-entry config id :azure-blob-sas-configuration)]
      (. builder azureBlobSasConfiguration data))
    (when-let [data (lookup-entry config id :azure-blob-type)]
      (. builder azureBlobType data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-azure-blob-props-builder
  "The cfn-location-azure-blob-props-builder function buildes out new instances of 
CfnLocationAzureBlobProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `azureAccessTier` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-access-tier` |
| `azureBlobAuthenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-authentication-type` |
| `azureBlobContainerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-container-url` |
| `azureBlobSasConfiguration` | software.amazon.awscdk.services.datasync.CfnLocationAzureBlob$AzureBlobSasConfigurationProperty | [[cdk.support/lookup-entry]] | `:azure-blob-sas-configuration` |
| `azureBlobType` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-type` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationAzureBlobProps$Builder.)]
    (when-let [data (lookup-entry config id :agent-arns)]
      (. builder agentArns data))
    (when-let [data (lookup-entry config id :azure-access-tier)]
      (. builder azureAccessTier data))
    (when-let [data (lookup-entry config id :azure-blob-authentication-type)]
      (. builder azureBlobAuthenticationType data))
    (when-let [data (lookup-entry config id :azure-blob-container-url)]
      (. builder azureBlobContainerUrl data))
    (when-let [data (lookup-entry config id :azure-blob-sas-configuration)]
      (. builder azureBlobSasConfiguration data))
    (when-let [data (lookup-entry config id :azure-blob-type)]
      (. builder azureBlobType data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-efs-builder
  "The cfn-location-efs-builder function buildes out new instances of 
CfnLocationEFS$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-arn` |
| `ec2Config` | software.amazon.awscdk.services.datasync.CfnLocationEFS$Ec2ConfigProperty | [[cdk.support/lookup-entry]] | `:ec2-config` |
| `efsFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:efs-filesystem-arn` |
| `fileSystemAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-access-role-arn` |
| `inTransitEncryption` | java.lang.String | [[cdk.support/lookup-entry]] | `:in-transit-encryption` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationEFS$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-point-arn)]
      (. builder accessPointArn data))
    (when-let [data (lookup-entry config id :ec2-config)]
      (. builder ec2Config data))
    (when-let [data (lookup-entry config id :efs-filesystem-arn)]
      (. builder efsFilesystemArn data))
    (when-let [data (lookup-entry config id :file-system-access-role-arn)]
      (. builder fileSystemAccessRoleArn data))
    (when-let [data (lookup-entry config id :in-transit-encryption)]
      (. builder inTransitEncryption data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-efs-ec2-config-property-builder
  "The cfn-location-efs-ec2-config-property-builder function buildes out new instances of 
CfnLocationEFS$Ec2ConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subnetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-arn` |"
  [stack id config]
  (let [builder (CfnLocationEFS$Ec2ConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-arns)]
      (. builder securityGroupArns data))
    (when-let [data (lookup-entry config id :subnet-arn)]
      (. builder subnetArn data))
    (.build builder)))


(defn cfn-location-efs-props-builder
  "The cfn-location-efs-props-builder function buildes out new instances of 
CfnLocationEFSProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-arn` |
| `ec2Config` | software.amazon.awscdk.services.datasync.CfnLocationEFS$Ec2ConfigProperty | [[cdk.support/lookup-entry]] | `:ec2-config` |
| `efsFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:efs-filesystem-arn` |
| `fileSystemAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-access-role-arn` |
| `inTransitEncryption` | java.lang.String | [[cdk.support/lookup-entry]] | `:in-transit-encryption` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationEFSProps$Builder.)]
    (when-let [data (lookup-entry config id :access-point-arn)]
      (. builder accessPointArn data))
    (when-let [data (lookup-entry config id :ec2-config)]
      (. builder ec2Config data))
    (when-let [data (lookup-entry config id :efs-filesystem-arn)]
      (. builder efsFilesystemArn data))
    (when-let [data (lookup-entry config id :file-system-access-role-arn)]
      (. builder fileSystemAccessRoleArn data))
    (when-let [data (lookup-entry config id :in-transit-encryption)]
      (. builder inTransitEncryption data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-f-sx-lustre-builder
  "The cfn-location-f-sx-lustre-builder function buildes out new instances of 
CfnLocationFSxLustre$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationFSxLustre$Builder/create stack id)]
    (when-let [data (lookup-entry config id :fsx-filesystem-arn)]
      (. builder fsxFilesystemArn data))
    (when-let [data (lookup-entry config id :security-group-arns)]
      (. builder securityGroupArns data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-f-sx-lustre-props-builder
  "The cfn-location-f-sx-lustre-props-builder function buildes out new instances of 
CfnLocationFSxLustreProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationFSxLustreProps$Builder.)]
    (when-let [data (lookup-entry config id :fsx-filesystem-arn)]
      (. builder fsxFilesystemArn data))
    (when-let [data (lookup-entry config id :security-group-arns)]
      (. builder securityGroupArns data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-f-sx-ontap-builder
  "The cfn-location-f-sx-ontap-builder function buildes out new instances of 
CfnLocationFSxONTAP$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `protocol` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:protocol` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `storageVirtualMachineArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-virtual-machine-arn` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationFSxONTAP$Builder/create stack id)]
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :security-group-arns)]
      (. builder securityGroupArns data))
    (when-let [data (lookup-entry config id :storage-virtual-machine-arn)]
      (. builder storageVirtualMachineArn data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-f-sx-ontap-nfs-mount-options-property-builder
  "The cfn-location-f-sx-ontap-nfs-mount-options-property-builder function buildes out new instances of 
CfnLocationFSxONTAP$NfsMountOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnLocationFSxONTAP$NfsMountOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-location-f-sx-ontap-nfs-property-builder
  "The cfn-location-f-sx-ontap-nfs-property-builder function buildes out new instances of 
CfnLocationFSxONTAP$NFSProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mount-options` |"
  [stack id config]
  (let [builder (CfnLocationFSxONTAP$NFSProperty$Builder.)]
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (.build builder)))


(defn cfn-location-f-sx-ontap-props-builder
  "The cfn-location-f-sx-ontap-props-builder function buildes out new instances of 
CfnLocationFSxONTAPProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `protocol` | software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP$ProtocolProperty | [[cdk.support/lookup-entry]] | `:protocol` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `storageVirtualMachineArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-virtual-machine-arn` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationFSxONTAPProps$Builder.)]
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :security-group-arns)]
      (. builder securityGroupArns data))
    (when-let [data (lookup-entry config id :storage-virtual-machine-arn)]
      (. builder storageVirtualMachineArn data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-f-sx-ontap-protocol-property-builder
  "The cfn-location-f-sx-ontap-protocol-property-builder function buildes out new instances of 
CfnLocationFSxONTAP$ProtocolProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nfs` | software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP$NFSProperty | [[cdk.support/lookup-entry]] | `:nfs` |
| `smb` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:smb` |"
  [stack id config]
  (let [builder (CfnLocationFSxONTAP$ProtocolProperty$Builder.)]
    (when-let [data (lookup-entry config id :nfs)]
      (. builder nfs data))
    (when-let [data (lookup-entry config id :smb)]
      (. builder smb data))
    (.build builder)))


(defn cfn-location-f-sx-ontap-smb-mount-options-property-builder
  "The cfn-location-f-sx-ontap-smb-mount-options-property-builder function buildes out new instances of 
CfnLocationFSxONTAP$SmbMountOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnLocationFSxONTAP$SmbMountOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-location-f-sx-ontap-smb-property-builder
  "The cfn-location-f-sx-ontap-smb-property-builder function buildes out new instances of 
CfnLocationFSxONTAP$SMBProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `mountOptions` | software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP$SmbMountOptionsProperty | [[cdk.support/lookup-entry]] | `:mount-options` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (CfnLocationFSxONTAP$SMBProperty$Builder.)]
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn cfn-location-f-sx-open-zfs-builder
  "The cfn-location-f-sx-open-zfs-builder function buildes out new instances of 
CfnLocationFSxOpenZFS$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `protocol` | software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS$ProtocolProperty | [[cdk.support/lookup-entry]] | `:protocol` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationFSxOpenZFS$Builder/create stack id)]
    (when-let [data (lookup-entry config id :fsx-filesystem-arn)]
      (. builder fsxFilesystemArn data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :security-group-arns)]
      (. builder securityGroupArns data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-f-sx-open-zfs-mount-options-property-builder
  "The cfn-location-f-sx-open-zfs-mount-options-property-builder function buildes out new instances of 
CfnLocationFSxOpenZFS$MountOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnLocationFSxOpenZFS$MountOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-location-f-sx-open-zfs-nfs-property-builder
  "The cfn-location-f-sx-open-zfs-nfs-property-builder function buildes out new instances of 
CfnLocationFSxOpenZFS$NFSProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountOptions` | software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS$MountOptionsProperty | [[cdk.support/lookup-entry]] | `:mount-options` |"
  [stack id config]
  (let [builder (CfnLocationFSxOpenZFS$NFSProperty$Builder.)]
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (.build builder)))


(defn cfn-location-f-sx-open-zfs-props-builder
  "The cfn-location-f-sx-open-zfs-props-builder function buildes out new instances of 
CfnLocationFSxOpenZFSProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `protocol` | software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS$ProtocolProperty | [[cdk.support/lookup-entry]] | `:protocol` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationFSxOpenZFSProps$Builder.)]
    (when-let [data (lookup-entry config id :fsx-filesystem-arn)]
      (. builder fsxFilesystemArn data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :security-group-arns)]
      (. builder securityGroupArns data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-f-sx-open-zfs-protocol-property-builder
  "The cfn-location-f-sx-open-zfs-protocol-property-builder function buildes out new instances of 
CfnLocationFSxOpenZFS$ProtocolProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nfs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:nfs` |"
  [stack id config]
  (let [builder (CfnLocationFSxOpenZFS$ProtocolProperty$Builder.)]
    (when-let [data (lookup-entry config id :nfs)]
      (. builder nfs data))
    (.build builder)))


(defn cfn-location-f-sx-windows-builder
  "The cfn-location-f-sx-windows-builder function buildes out new instances of 
CfnLocationFSxWindows$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (CfnLocationFSxWindows$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :fsx-filesystem-arn)]
      (. builder fsxFilesystemArn data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :security-group-arns)]
      (. builder securityGroupArns data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn cfn-location-f-sx-windows-props-builder
  "The cfn-location-f-sx-windows-props-builder function buildes out new instances of 
CfnLocationFSxWindowsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (CfnLocationFSxWindowsProps$Builder.)]
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :fsx-filesystem-arn)]
      (. builder fsxFilesystemArn data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :security-group-arns)]
      (. builder securityGroupArns data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn cfn-location-hdfs-builder
  "The cfn-location-hdfs-builder function buildes out new instances of 
CfnLocationHDFS$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `blockSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-size` |
| `kerberosKeytab` | java.lang.String | [[cdk.support/lookup-entry]] | `:kerberos-keytab` |
| `kerberosKrb5Conf` | java.lang.String | [[cdk.support/lookup-entry]] | `:kerberos-krb5-conf` |
| `kerberosPrincipal` | java.lang.String | [[cdk.support/lookup-entry]] | `:kerberos-principal` |
| `kmsKeyProviderUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-provider-uri` |
| `nameNodes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:name-nodes` |
| `qopConfiguration` | software.amazon.awscdk.services.datasync.CfnLocationHDFS$QopConfigurationProperty | [[cdk.support/lookup-entry]] | `:qop-configuration` |
| `replicationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:replication-factor` |
| `simpleUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:simple-user` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationHDFS$Builder/create stack id)]
    (when-let [data (lookup-entry config id :agent-arns)]
      (. builder agentArns data))
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :block-size)]
      (. builder blockSize data))
    (when-let [data (lookup-entry config id :kerberos-keytab)]
      (. builder kerberosKeytab data))
    (when-let [data (lookup-entry config id :kerberos-krb5-conf)]
      (. builder kerberosKrb5Conf data))
    (when-let [data (lookup-entry config id :kerberos-principal)]
      (. builder kerberosPrincipal data))
    (when-let [data (lookup-entry config id :kms-key-provider-uri)]
      (. builder kmsKeyProviderUri data))
    (when-let [data (lookup-entry config id :name-nodes)]
      (. builder nameNodes data))
    (when-let [data (lookup-entry config id :qop-configuration)]
      (. builder qopConfiguration data))
    (when-let [data (lookup-entry config id :replication-factor)]
      (. builder replicationFactor data))
    (when-let [data (lookup-entry config id :simple-user)]
      (. builder simpleUser data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-hdfs-name-node-property-builder
  "The cfn-location-hdfs-name-node-property-builder function buildes out new instances of 
CfnLocationHDFS$NameNodeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnLocationHDFS$NameNodeProperty$Builder.)]
    (when-let [data (lookup-entry config id :hostname)]
      (. builder hostname data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-location-hdfs-props-builder
  "The cfn-location-hdfs-props-builder function buildes out new instances of 
CfnLocationHDFSProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `authenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-type` |
| `blockSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-size` |
| `kerberosKeytab` | java.lang.String | [[cdk.support/lookup-entry]] | `:kerberos-keytab` |
| `kerberosKrb5Conf` | java.lang.String | [[cdk.support/lookup-entry]] | `:kerberos-krb5-conf` |
| `kerberosPrincipal` | java.lang.String | [[cdk.support/lookup-entry]] | `:kerberos-principal` |
| `kmsKeyProviderUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-provider-uri` |
| `nameNodes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:name-nodes` |
| `qopConfiguration` | software.amazon.awscdk.services.datasync.CfnLocationHDFS$QopConfigurationProperty | [[cdk.support/lookup-entry]] | `:qop-configuration` |
| `replicationFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:replication-factor` |
| `simpleUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:simple-user` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationHDFSProps$Builder.)]
    (when-let [data (lookup-entry config id :agent-arns)]
      (. builder agentArns data))
    (when-let [data (lookup-entry config id :authentication-type)]
      (. builder authenticationType data))
    (when-let [data (lookup-entry config id :block-size)]
      (. builder blockSize data))
    (when-let [data (lookup-entry config id :kerberos-keytab)]
      (. builder kerberosKeytab data))
    (when-let [data (lookup-entry config id :kerberos-krb5-conf)]
      (. builder kerberosKrb5Conf data))
    (when-let [data (lookup-entry config id :kerberos-principal)]
      (. builder kerberosPrincipal data))
    (when-let [data (lookup-entry config id :kms-key-provider-uri)]
      (. builder kmsKeyProviderUri data))
    (when-let [data (lookup-entry config id :name-nodes)]
      (. builder nameNodes data))
    (when-let [data (lookup-entry config id :qop-configuration)]
      (. builder qopConfiguration data))
    (when-let [data (lookup-entry config id :replication-factor)]
      (. builder replicationFactor data))
    (when-let [data (lookup-entry config id :simple-user)]
      (. builder simpleUser data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-hdfs-qop-configuration-property-builder
  "The cfn-location-hdfs-qop-configuration-property-builder function buildes out new instances of 
CfnLocationHDFS$QopConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTransferProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-transfer-protection` |
| `rpcProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:rpc-protection` |"
  [stack id config]
  (let [builder (CfnLocationHDFS$QopConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-transfer-protection)]
      (. builder dataTransferProtection data))
    (when-let [data (lookup-entry config id :rpc-protection)]
      (. builder rpcProtection data))
    (.build builder)))


(defn cfn-location-nfs-builder
  "The cfn-location-nfs-builder function buildes out new instances of 
CfnLocationNFS$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountOptions` | software.amazon.awscdk.services.datasync.CfnLocationNFS$MountOptionsProperty | [[cdk.support/lookup-entry]] | `:mount-options` |
| `onPremConfig` | software.amazon.awscdk.services.datasync.CfnLocationNFS$OnPremConfigProperty | [[cdk.support/lookup-entry]] | `:on-prem-config` |
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationNFS$Builder/create stack id)]
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (when-let [data (lookup-entry config id :on-prem-config)]
      (. builder onPremConfig data))
    (when-let [data (lookup-entry config id :server-hostname)]
      (. builder serverHostname data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-nfs-mount-options-property-builder
  "The cfn-location-nfs-mount-options-property-builder function buildes out new instances of 
CfnLocationNFS$MountOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnLocationNFS$MountOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-location-nfs-on-prem-config-property-builder
  "The cfn-location-nfs-on-prem-config-property-builder function buildes out new instances of 
CfnLocationNFS$OnPremConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |"
  [stack id config]
  (let [builder (CfnLocationNFS$OnPremConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :agent-arns)]
      (. builder agentArns data))
    (.build builder)))


(defn cfn-location-nfs-props-builder
  "The cfn-location-nfs-props-builder function buildes out new instances of 
CfnLocationNFSProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mount-options` |
| `onPremConfig` | software.amazon.awscdk.services.datasync.CfnLocationNFS$OnPremConfigProperty | [[cdk.support/lookup-entry]] | `:on-prem-config` |
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationNFSProps$Builder.)]
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (when-let [data (lookup-entry config id :on-prem-config)]
      (. builder onPremConfig data))
    (when-let [data (lookup-entry config id :server-hostname)]
      (. builder serverHostname data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-object-storage-builder
  "The cfn-location-object-storage-builder function buildes out new instances of 
CfnLocationObjectStorage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-key` |
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `secretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-key` |
| `serverCertificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate` |
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `serverPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:server-port` |
| `serverProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-protocol` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationObjectStorage$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-key)]
      (. builder accessKey data))
    (when-let [data (lookup-entry config id :agent-arns)]
      (. builder agentArns data))
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :secret-key)]
      (. builder secretKey data))
    (when-let [data (lookup-entry config id :server-certificate)]
      (. builder serverCertificate data))
    (when-let [data (lookup-entry config id :server-hostname)]
      (. builder serverHostname data))
    (when-let [data (lookup-entry config id :server-port)]
      (. builder serverPort data))
    (when-let [data (lookup-entry config id :server-protocol)]
      (. builder serverProtocol data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-object-storage-props-builder
  "The cfn-location-object-storage-props-builder function buildes out new instances of 
CfnLocationObjectStorageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-key` |
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `secretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-key` |
| `serverCertificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate` |
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `serverPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:server-port` |
| `serverProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-protocol` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationObjectStorageProps$Builder.)]
    (when-let [data (lookup-entry config id :access-key)]
      (. builder accessKey data))
    (when-let [data (lookup-entry config id :agent-arns)]
      (. builder agentArns data))
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :secret-key)]
      (. builder secretKey data))
    (when-let [data (lookup-entry config id :server-certificate)]
      (. builder serverCertificate data))
    (when-let [data (lookup-entry config id :server-hostname)]
      (. builder serverHostname data))
    (when-let [data (lookup-entry config id :server-port)]
      (. builder serverPort data))
    (when-let [data (lookup-entry config id :server-protocol)]
      (. builder serverProtocol data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-s3-builder
  "The cfn-location-s3-builder function buildes out new instances of 
CfnLocationS3$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |
| `s3Config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-config` |
| `s3StorageClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-storage-class` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationS3$Builder/create stack id)]
    (when-let [data (lookup-entry config id :s3-bucket-arn)]
      (. builder s3BucketArn data))
    (when-let [data (lookup-entry config id :s3-config)]
      (. builder s3Config data))
    (when-let [data (lookup-entry config id :s3-storage-class)]
      (. builder s3StorageClass data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-s3-props-builder
  "The cfn-location-s3-props-builder function buildes out new instances of 
CfnLocationS3Props$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |
| `s3Config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-config` |
| `s3StorageClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-storage-class` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationS3Props$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket-arn)]
      (. builder s3BucketArn data))
    (when-let [data (lookup-entry config id :s3-config)]
      (. builder s3Config data))
    (when-let [data (lookup-entry config id :s3-storage-class)]
      (. builder s3StorageClass data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-s3-s3-config-property-builder
  "The cfn-location-s3-s3-config-property-builder function buildes out new instances of 
CfnLocationS3$S3ConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-access-role-arn` |"
  [stack id config]
  (let [builder (CfnLocationS3$S3ConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-access-role-arn)]
      (. builder bucketAccessRoleArn data))
    (.build builder)))


(defn cfn-location-smb-builder
  "The cfn-location-smb-builder function buildes out new instances of 
CfnLocationSMB$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `mountOptions` | software.amazon.awscdk.services.datasync.CfnLocationSMB$MountOptionsProperty | [[cdk.support/lookup-entry]] | `:mount-options` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (CfnLocationSMB$Builder/create stack id)]
    (when-let [data (lookup-entry config id :agent-arns)]
      (. builder agentArns data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :server-hostname)]
      (. builder serverHostname data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn cfn-location-smb-mount-options-property-builder
  "The cfn-location-smb-mount-options-property-builder function buildes out new instances of 
CfnLocationSMB$MountOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnLocationSMB$MountOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-location-smb-props-builder
  "The cfn-location-smb-props-builder function buildes out new instances of 
CfnLocationSMBProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `mountOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mount-options` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (CfnLocationSMBProps$Builder.)]
    (when-let [data (lookup-entry config id :agent-arns)]
      (. builder agentArns data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :mount-options)]
      (. builder mountOptions data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :server-hostname)]
      (. builder serverHostname data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn cfn-storage-system-builder
  "The cfn-storage-system-builder function buildes out new instances of 
CfnStorageSystem$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `cloudWatchLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverConfiguration` | software.amazon.awscdk.services.datasync.CfnStorageSystem$ServerConfigurationProperty | [[cdk.support/lookup-entry]] | `:server-configuration` |
| `serverCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-credentials` |
| `systemType` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStorageSystem$Builder/create stack id)]
    (when-let [data (lookup-entry config id :agent-arns)]
      (. builder agentArns data))
    (when-let [data (lookup-entry config id :cloud-watch-log-group-arn)]
      (. builder cloudWatchLogGroupArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :server-configuration)]
      (. builder serverConfiguration data))
    (when-let [data (lookup-entry config id :server-credentials)]
      (. builder serverCredentials data))
    (when-let [data (lookup-entry config id :system-type)]
      (. builder systemType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-storage-system-props-builder
  "The cfn-storage-system-props-builder function buildes out new instances of 
CfnStorageSystemProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `cloudWatchLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-configuration` |
| `serverCredentials` | software.amazon.awscdk.services.datasync.CfnStorageSystem$ServerCredentialsProperty | [[cdk.support/lookup-entry]] | `:server-credentials` |
| `systemType` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStorageSystemProps$Builder.)]
    (when-let [data (lookup-entry config id :agent-arns)]
      (. builder agentArns data))
    (when-let [data (lookup-entry config id :cloud-watch-log-group-arn)]
      (. builder cloudWatchLogGroupArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :server-configuration)]
      (. builder serverConfiguration data))
    (when-let [data (lookup-entry config id :server-credentials)]
      (. builder serverCredentials data))
    (when-let [data (lookup-entry config id :system-type)]
      (. builder systemType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-storage-system-server-configuration-property-builder
  "The cfn-storage-system-server-configuration-property-builder function buildes out new instances of 
CfnStorageSystem$ServerConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `serverPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:server-port` |"
  [stack id config]
  (let [builder (CfnStorageSystem$ServerConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :server-hostname)]
      (. builder serverHostname data))
    (when-let [data (lookup-entry config id :server-port)]
      (. builder serverPort data))
    (.build builder)))


(defn cfn-storage-system-server-credentials-property-builder
  "The cfn-storage-system-server-credentials-property-builder function buildes out new instances of 
CfnStorageSystem$ServerCredentialsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnStorageSystem$ServerCredentialsProperty$Builder.)]
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-task-builder
  "The cfn-task-builder function buildes out new instances of 
CfnTask$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-arn` |
| `destinationLocationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-location-arn` |
| `excludes` | java.util.List | [[cdk.support/lookup-entry]] | `:excludes` |
| `includes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:includes` |
| `manifestConfig` | software.amazon.awscdk.services.datasync.CfnTask$ManifestConfigProperty | [[cdk.support/lookup-entry]] | `:manifest-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `sourceLocationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskReportConfig` | software.amazon.awscdk.services.datasync.CfnTask$TaskReportConfigProperty | [[cdk.support/lookup-entry]] | `:task-report-config` |"
  [stack id config]
  (let [builder (CfnTask$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cloud-watch-log-group-arn)]
      (. builder cloudWatchLogGroupArn data))
    (when-let [data (lookup-entry config id :destination-location-arn)]
      (. builder destinationLocationArn data))
    (when-let [data (lookup-entry config id :excludes)]
      (. builder excludes data))
    (when-let [data (lookup-entry config id :includes)]
      (. builder includes data))
    (when-let [data (lookup-entry config id :manifest-config)]
      (. builder manifestConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :source-location-arn)]
      (. builder sourceLocationArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-report-config)]
      (. builder taskReportConfig data))
    (.build builder)))


(defn cfn-task-deleted-property-builder
  "The cfn-task-deleted-property-builder function buildes out new instances of 
CfnTask$DeletedProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-level` |"
  [stack id config]
  (let [builder (CfnTask$DeletedProperty$Builder.)]
    (when-let [data (lookup-entry config id :report-level)]
      (. builder reportLevel data))
    (.build builder)))


(defn cfn-task-destination-property-builder
  "The cfn-task-destination-property-builder function buildes out new instances of 
CfnTask$DestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3` | software.amazon.awscdk.services.datasync.CfnTask$S3Property | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnTask$DestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-task-filter-rule-property-builder
  "The cfn-task-filter-rule-property-builder function buildes out new instances of 
CfnTask$FilterRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTask$FilterRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :filter-type)]
      (. builder filterType data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-task-manifest-config-property-builder
  "The cfn-task-manifest-config-property-builder function buildes out new instances of 
CfnTask$ManifestConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `source` | software.amazon.awscdk.services.datasync.CfnTask$SourceProperty | [[cdk.support/lookup-entry]] | `:source` |"
  [stack id config]
  (let [builder (CfnTask$ManifestConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :format)]
      (. builder format data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (.build builder)))


(defn cfn-task-manifest-config-source-s3-property-builder
  "The cfn-task-manifest-config-source-s3-property-builder function buildes out new instances of 
CfnTask$ManifestConfigSourceS3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-access-role-arn` |
| `manifestObjectPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-object-path` |
| `manifestObjectVersionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-object-version-id` |
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |"
  [stack id config]
  (let [builder (CfnTask$ManifestConfigSourceS3Property$Builder.)]
    (when-let [data (lookup-entry config id :bucket-access-role-arn)]
      (. builder bucketAccessRoleArn data))
    (when-let [data (lookup-entry config id :manifest-object-path)]
      (. builder manifestObjectPath data))
    (when-let [data (lookup-entry config id :manifest-object-version-id)]
      (. builder manifestObjectVersionId data))
    (when-let [data (lookup-entry config id :s3-bucket-arn)]
      (. builder s3BucketArn data))
    (.build builder)))


(defn cfn-task-options-property-builder
  "The cfn-task-options-property-builder function buildes out new instances of 
CfnTask$OptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `atime` | java.lang.String | [[cdk.support/lookup-entry]] | `:atime` |
| `bytesPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bytes-per-second` |
| `gid` | java.lang.String | [[cdk.support/lookup-entry]] | `:gid` |
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `mtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:mtime` |
| `objectTags` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-tags` |
| `overwriteMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:overwrite-mode` |
| `posixPermissions` | java.lang.String | [[cdk.support/lookup-entry]] | `:posix-permissions` |
| `preserveDeletedFiles` | java.lang.String | [[cdk.support/lookup-entry]] | `:preserve-deleted-files` |
| `preserveDevices` | java.lang.String | [[cdk.support/lookup-entry]] | `:preserve-devices` |
| `securityDescriptorCopyFlags` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-descriptor-copy-flags` |
| `taskQueueing` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-queueing` |
| `transferMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:transfer-mode` |
| `uid` | java.lang.String | [[cdk.support/lookup-entry]] | `:uid` |
| `verifyMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:verify-mode` |"
  [stack id config]
  (let [builder (CfnTask$OptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :atime)]
      (. builder atime data))
    (when-let [data (lookup-entry config id :bytes-per-second)]
      (. builder bytesPerSecond data))
    (when-let [data (lookup-entry config id :gid)]
      (. builder gid data))
    (when-let [data (lookup-entry config id :log-level)]
      (. builder logLevel data))
    (when-let [data (lookup-entry config id :mtime)]
      (. builder mtime data))
    (when-let [data (lookup-entry config id :object-tags)]
      (. builder objectTags data))
    (when-let [data (lookup-entry config id :overwrite-mode)]
      (. builder overwriteMode data))
    (when-let [data (lookup-entry config id :posix-permissions)]
      (. builder posixPermissions data))
    (when-let [data (lookup-entry config id :preserve-deleted-files)]
      (. builder preserveDeletedFiles data))
    (when-let [data (lookup-entry config id :preserve-devices)]
      (. builder preserveDevices data))
    (when-let [data (lookup-entry config id :security-descriptor-copy-flags)]
      (. builder securityDescriptorCopyFlags data))
    (when-let [data (lookup-entry config id :task-queueing)]
      (. builder taskQueueing data))
    (when-let [data (lookup-entry config id :transfer-mode)]
      (. builder transferMode data))
    (when-let [data (lookup-entry config id :uid)]
      (. builder uid data))
    (when-let [data (lookup-entry config id :verify-mode)]
      (. builder verifyMode data))
    (.build builder)))


(defn cfn-task-overrides-property-builder
  "The cfn-task-overrides-property-builder function buildes out new instances of 
CfnTask$OverridesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deleted` |
| `skipped` | software.amazon.awscdk.services.datasync.CfnTask$SkippedProperty | [[cdk.support/lookup-entry]] | `:skipped` |
| `transferred` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transferred` |
| `verified` | software.amazon.awscdk.services.datasync.CfnTask$VerifiedProperty | [[cdk.support/lookup-entry]] | `:verified` |"
  [stack id config]
  (let [builder (CfnTask$OverridesProperty$Builder.)]
    (when-let [data (lookup-entry config id :deleted)]
      (. builder deleted data))
    (when-let [data (lookup-entry config id :skipped)]
      (. builder skipped data))
    (when-let [data (lookup-entry config id :transferred)]
      (. builder transferred data))
    (when-let [data (lookup-entry config id :verified)]
      (. builder verified data))
    (.build builder)))


(defn cfn-task-props-builder
  "The cfn-task-props-builder function buildes out new instances of 
CfnTaskProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-arn` |
| `destinationLocationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-location-arn` |
| `excludes` | java.util.List | [[cdk.support/lookup-entry]] | `:excludes` |
| `includes` | java.util.List | [[cdk.support/lookup-entry]] | `:includes` |
| `manifestConfig` | software.amazon.awscdk.services.datasync.CfnTask$ManifestConfigProperty | [[cdk.support/lookup-entry]] | `:manifest-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `sourceLocationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-location-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskReportConfig` | software.amazon.awscdk.services.datasync.CfnTask$TaskReportConfigProperty | [[cdk.support/lookup-entry]] | `:task-report-config` |"
  [stack id config]
  (let [builder (CfnTaskProps$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-log-group-arn)]
      (. builder cloudWatchLogGroupArn data))
    (when-let [data (lookup-entry config id :destination-location-arn)]
      (. builder destinationLocationArn data))
    (when-let [data (lookup-entry config id :excludes)]
      (. builder excludes data))
    (when-let [data (lookup-entry config id :includes)]
      (. builder includes data))
    (when-let [data (lookup-entry config id :manifest-config)]
      (. builder manifestConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :source-location-arn)]
      (. builder sourceLocationArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-report-config)]
      (. builder taskReportConfig data))
    (.build builder)))


(defn cfn-task-s3-property-builder
  "The cfn-task-s3-property-builder function buildes out new instances of 
CfnTask$S3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-access-role-arn` |
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |"
  [stack id config]
  (let [builder (CfnTask$S3Property$Builder.)]
    (when-let [data (lookup-entry config id :bucket-access-role-arn)]
      (. builder bucketAccessRoleArn data))
    (when-let [data (lookup-entry config id :s3-bucket-arn)]
      (. builder s3BucketArn data))
    (when-let [data (lookup-entry config id :subdirectory)]
      (. builder subdirectory data))
    (.build builder)))


(defn cfn-task-skipped-property-builder
  "The cfn-task-skipped-property-builder function buildes out new instances of 
CfnTask$SkippedProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-level` |"
  [stack id config]
  (let [builder (CfnTask$SkippedProperty$Builder.)]
    (when-let [data (lookup-entry config id :report-level)]
      (. builder reportLevel data))
    (.build builder)))


(defn cfn-task-source-property-builder
  "The cfn-task-source-property-builder function buildes out new instances of 
CfnTask$SourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnTask$SourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-task-task-report-config-property-builder
  "The cfn-task-task-report-config-property-builder function buildes out new instances of 
CfnTask$TaskReportConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `objectVersionIds` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version-ids` |
| `outputType` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-type` |
| `overrides` | software.amazon.awscdk.services.datasync.CfnTask$OverridesProperty | [[cdk.support/lookup-entry]] | `:overrides` |
| `reportLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-level` |"
  [stack id config]
  (let [builder (CfnTask$TaskReportConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :object-version-ids)]
      (. builder objectVersionIds data))
    (when-let [data (lookup-entry config id :output-type)]
      (. builder outputType data))
    (when-let [data (lookup-entry config id :overrides)]
      (. builder overrides data))
    (when-let [data (lookup-entry config id :report-level)]
      (. builder reportLevel data))
    (.build builder)))


(defn cfn-task-task-schedule-property-builder
  "The cfn-task-task-schedule-property-builder function buildes out new instances of 
CfnTask$TaskScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnTask$TaskScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-task-transferred-property-builder
  "The cfn-task-transferred-property-builder function buildes out new instances of 
CfnTask$TransferredProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-level` |"
  [stack id config]
  (let [builder (CfnTask$TransferredProperty$Builder.)]
    (when-let [data (lookup-entry config id :report-level)]
      (. builder reportLevel data))
    (.build builder)))


(defn cfn-task-verified-property-builder
  "The cfn-task-verified-property-builder function buildes out new instances of 
CfnTask$VerifiedProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-level` |"
  [stack id config]
  (let [builder (CfnTask$VerifiedProperty$Builder.)]
    (when-let [data (lookup-entry config id :report-level)]
      (. builder reportLevel data))
    (.build builder)))