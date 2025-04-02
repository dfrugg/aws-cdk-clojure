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


(defn cfn-agent-builder>
  "The cfn-agent-builder> function updates a CfnAgent$Builder instance using the provided configuration.
  The function takes the CfnAgent$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activationKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:activation-key` |
| `agentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-name` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subnetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
"
  [^CfnAgent$Builder builder id config]
  (when-some [data (lookup-entry config id :activation-key)]
    (. builder activationKey data))
  (when-some [data (lookup-entry config id :agent-name)]
    (. builder agentName data))
  (when-some [data (lookup-entry config id :security-group-arns)]
    (. builder securityGroupArns data))
  (when-some [data (lookup-entry config id :subnet-arns)]
    (. builder subnetArns data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-endpoint-id)]
    (. builder vpcEndpointId data))
  (.build builder))


(defn cfn-agent-builder
  "Creates a  `CfnAgent$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-agent-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-agent-builder> (CfnAgent$Builder/create scope (name id)) id config))


(defn cfn-agent-props-builder>
  "The cfn-agent-props-builder> function updates a CfnAgentProps$Builder instance using the provided configuration.
  The function takes the CfnAgentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activationKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:activation-key` |
| `agentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-name` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subnetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
"
  [^CfnAgentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :activation-key)]
    (. builder activationKey data))
  (when-some [data (lookup-entry config id :agent-name)]
    (. builder agentName data))
  (when-some [data (lookup-entry config id :security-group-arns)]
    (. builder securityGroupArns data))
  (when-some [data (lookup-entry config id :subnet-arns)]
    (. builder subnetArns data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-endpoint-id)]
    (. builder vpcEndpointId data))
  (.build builder))


(defn cfn-agent-props-builder
  "Creates a  `CfnAgentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-agent-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-agent-props-builder> (new CfnAgentProps$Builder) id config))


(defn cfn-location-azure-blob-azure-blob-sas-configuration-property-builder>
  "The cfn-location-azure-blob-azure-blob-sas-configuration-property-builder> function updates a CfnLocationAzureBlob$AzureBlobSasConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationAzureBlob$AzureBlobSasConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `azureBlobSasToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-sas-token` |
"
  [^CfnLocationAzureBlob$AzureBlobSasConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :azure-blob-sas-token)]
    (. builder azureBlobSasToken data))
  (.build builder))


(defn cfn-location-azure-blob-azure-blob-sas-configuration-property-builder
  "Creates a  `CfnLocationAzureBlob$AzureBlobSasConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-azure-blob-azure-blob-sas-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-azure-blob-azure-blob-sas-configuration-property-builder> (new CfnLocationAzureBlob$AzureBlobSasConfigurationProperty$Builder) id config))


(defn cfn-location-azure-blob-builder>
  "The cfn-location-azure-blob-builder> function updates a CfnLocationAzureBlob$Builder instance using the provided configuration.
  The function takes the CfnLocationAzureBlob$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `azureAccessTier` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-access-tier` |
| `azureBlobAuthenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-authentication-type` |
| `azureBlobContainerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-container-url` |
| `azureBlobSasConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:azure-blob-sas-configuration` |
| `azureBlobType` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-type` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationAzureBlob$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-arns)]
    (. builder agentArns data))
  (when-some [data (lookup-entry config id :azure-access-tier)]
    (. builder azureAccessTier data))
  (when-some [data (lookup-entry config id :azure-blob-authentication-type)]
    (. builder azureBlobAuthenticationType data))
  (when-some [data (lookup-entry config id :azure-blob-container-url)]
    (. builder azureBlobContainerUrl data))
  (when-some [data (lookup-entry config id :azure-blob-sas-configuration)]
    (. builder azureBlobSasConfiguration data))
  (when-some [data (lookup-entry config id :azure-blob-type)]
    (. builder azureBlobType data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-azure-blob-builder
  "Creates a  `CfnLocationAzureBlob$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-location-azure-blob-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-azure-blob-builder> (CfnLocationAzureBlob$Builder/create scope (name id)) id config))


(defn cfn-location-azure-blob-props-builder>
  "The cfn-location-azure-blob-props-builder> function updates a CfnLocationAzureBlobProps$Builder instance using the provided configuration.
  The function takes the CfnLocationAzureBlobProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `azureAccessTier` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-access-tier` |
| `azureBlobAuthenticationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-authentication-type` |
| `azureBlobContainerUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-container-url` |
| `azureBlobSasConfiguration` | software.amazon.awscdk.services.datasync.CfnLocationAzureBlob$AzureBlobSasConfigurationProperty | [[cdk.support/lookup-entry]] | `:azure-blob-sas-configuration` |
| `azureBlobType` | java.lang.String | [[cdk.support/lookup-entry]] | `:azure-blob-type` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationAzureBlobProps$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-arns)]
    (. builder agentArns data))
  (when-some [data (lookup-entry config id :azure-access-tier)]
    (. builder azureAccessTier data))
  (when-some [data (lookup-entry config id :azure-blob-authentication-type)]
    (. builder azureBlobAuthenticationType data))
  (when-some [data (lookup-entry config id :azure-blob-container-url)]
    (. builder azureBlobContainerUrl data))
  (when-some [data (lookup-entry config id :azure-blob-sas-configuration)]
    (. builder azureBlobSasConfiguration data))
  (when-some [data (lookup-entry config id :azure-blob-type)]
    (. builder azureBlobType data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-azure-blob-props-builder
  "Creates a  `CfnLocationAzureBlobProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-azure-blob-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-azure-blob-props-builder> (new CfnLocationAzureBlobProps$Builder) id config))


(defn cfn-location-efs-builder>
  "The cfn-location-efs-builder> function updates a CfnLocationEFS$Builder instance using the provided configuration.
  The function takes the CfnLocationEFS$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-arn` |
| `ec2Config` | software.amazon.awscdk.services.datasync.CfnLocationEFS$Ec2ConfigProperty | [[cdk.support/lookup-entry]] | `:ec2-config` |
| `efsFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:efs-filesystem-arn` |
| `fileSystemAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-access-role-arn` |
| `inTransitEncryption` | java.lang.String | [[cdk.support/lookup-entry]] | `:in-transit-encryption` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationEFS$Builder builder id config]
  (when-some [data (lookup-entry config id :access-point-arn)]
    (. builder accessPointArn data))
  (when-some [data (lookup-entry config id :ec2-config)]
    (. builder ec2Config data))
  (when-some [data (lookup-entry config id :efs-filesystem-arn)]
    (. builder efsFilesystemArn data))
  (when-some [data (lookup-entry config id :file-system-access-role-arn)]
    (. builder fileSystemAccessRoleArn data))
  (when-some [data (lookup-entry config id :in-transit-encryption)]
    (. builder inTransitEncryption data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-efs-builder
  "Creates a  `CfnLocationEFS$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-location-efs-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-efs-builder> (CfnLocationEFS$Builder/create scope (name id)) id config))


(defn cfn-location-efs-ec2-config-property-builder>
  "The cfn-location-efs-ec2-config-property-builder> function updates a CfnLocationEFS$Ec2ConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationEFS$Ec2ConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subnetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-arn` |
"
  [^CfnLocationEFS$Ec2ConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-group-arns)]
    (. builder securityGroupArns data))
  (when-some [data (lookup-entry config id :subnet-arn)]
    (. builder subnetArn data))
  (.build builder))


(defn cfn-location-efs-ec2-config-property-builder
  "Creates a  `CfnLocationEFS$Ec2ConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-efs-ec2-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-efs-ec2-config-property-builder> (new CfnLocationEFS$Ec2ConfigProperty$Builder) id config))


(defn cfn-location-efs-props-builder>
  "The cfn-location-efs-props-builder> function updates a CfnLocationEFSProps$Builder instance using the provided configuration.
  The function takes the CfnLocationEFSProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPointArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-point-arn` |
| `ec2Config` | software.amazon.awscdk.services.datasync.CfnLocationEFS$Ec2ConfigProperty | [[cdk.support/lookup-entry]] | `:ec2-config` |
| `efsFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:efs-filesystem-arn` |
| `fileSystemAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-access-role-arn` |
| `inTransitEncryption` | java.lang.String | [[cdk.support/lookup-entry]] | `:in-transit-encryption` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationEFSProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-point-arn)]
    (. builder accessPointArn data))
  (when-some [data (lookup-entry config id :ec2-config)]
    (. builder ec2Config data))
  (when-some [data (lookup-entry config id :efs-filesystem-arn)]
    (. builder efsFilesystemArn data))
  (when-some [data (lookup-entry config id :file-system-access-role-arn)]
    (. builder fileSystemAccessRoleArn data))
  (when-some [data (lookup-entry config id :in-transit-encryption)]
    (. builder inTransitEncryption data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-efs-props-builder
  "Creates a  `CfnLocationEFSProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-efs-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-efs-props-builder> (new CfnLocationEFSProps$Builder) id config))


(defn cfn-location-f-sx-lustre-builder>
  "The cfn-location-f-sx-lustre-builder> function updates a CfnLocationFSxLustre$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxLustre$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationFSxLustre$Builder builder id config]
  (when-some [data (lookup-entry config id :fsx-filesystem-arn)]
    (. builder fsxFilesystemArn data))
  (when-some [data (lookup-entry config id :security-group-arns)]
    (. builder securityGroupArns data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-f-sx-lustre-builder
  "Creates a  `CfnLocationFSxLustre$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-location-f-sx-lustre-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-f-sx-lustre-builder> (CfnLocationFSxLustre$Builder/create scope (name id)) id config))


(defn cfn-location-f-sx-lustre-props-builder>
  "The cfn-location-f-sx-lustre-props-builder> function updates a CfnLocationFSxLustreProps$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxLustreProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationFSxLustreProps$Builder builder id config]
  (when-some [data (lookup-entry config id :fsx-filesystem-arn)]
    (. builder fsxFilesystemArn data))
  (when-some [data (lookup-entry config id :security-group-arns)]
    (. builder securityGroupArns data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-f-sx-lustre-props-builder
  "Creates a  `CfnLocationFSxLustreProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-lustre-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-lustre-props-builder> (new CfnLocationFSxLustreProps$Builder) id config))


(defn cfn-location-f-sx-ontap-builder>
  "The cfn-location-f-sx-ontap-builder> function updates a CfnLocationFSxONTAP$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxONTAP$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `protocol` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:protocol` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `storageVirtualMachineArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-virtual-machine-arn` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationFSxONTAP$Builder builder id config]
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :security-group-arns)]
    (. builder securityGroupArns data))
  (when-some [data (lookup-entry config id :storage-virtual-machine-arn)]
    (. builder storageVirtualMachineArn data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-f-sx-ontap-builder
  "Creates a  `CfnLocationFSxONTAP$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-location-f-sx-ontap-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-f-sx-ontap-builder> (CfnLocationFSxONTAP$Builder/create scope (name id)) id config))


(defn cfn-location-f-sx-ontap-nfs-mount-options-property-builder>
  "The cfn-location-f-sx-ontap-nfs-mount-options-property-builder> function updates a CfnLocationFSxONTAP$NfsMountOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxONTAP$NfsMountOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnLocationFSxONTAP$NfsMountOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-location-f-sx-ontap-nfs-mount-options-property-builder
  "Creates a  `CfnLocationFSxONTAP$NfsMountOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-ontap-nfs-mount-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-ontap-nfs-mount-options-property-builder> (new CfnLocationFSxONTAP$NfsMountOptionsProperty$Builder) id config))


(defn cfn-location-f-sx-ontap-nfs-property-builder>
  "The cfn-location-f-sx-ontap-nfs-property-builder> function updates a CfnLocationFSxONTAP$NFSProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxONTAP$NFSProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mount-options` |
"
  [^CfnLocationFSxONTAP$NFSProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (.build builder))


(defn cfn-location-f-sx-ontap-nfs-property-builder
  "Creates a  `CfnLocationFSxONTAP$NFSProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-ontap-nfs-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-ontap-nfs-property-builder> (new CfnLocationFSxONTAP$NFSProperty$Builder) id config))


(defn cfn-location-f-sx-ontap-props-builder>
  "The cfn-location-f-sx-ontap-props-builder> function updates a CfnLocationFSxONTAPProps$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxONTAPProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `protocol` | software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP$ProtocolProperty | [[cdk.support/lookup-entry]] | `:protocol` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `storageVirtualMachineArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-virtual-machine-arn` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationFSxONTAPProps$Builder builder id config]
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :security-group-arns)]
    (. builder securityGroupArns data))
  (when-some [data (lookup-entry config id :storage-virtual-machine-arn)]
    (. builder storageVirtualMachineArn data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-f-sx-ontap-props-builder
  "Creates a  `CfnLocationFSxONTAPProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-ontap-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-ontap-props-builder> (new CfnLocationFSxONTAPProps$Builder) id config))


(defn cfn-location-f-sx-ontap-protocol-property-builder>
  "The cfn-location-f-sx-ontap-protocol-property-builder> function updates a CfnLocationFSxONTAP$ProtocolProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxONTAP$ProtocolProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nfs` | software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP$NFSProperty | [[cdk.support/lookup-entry]] | `:nfs` |
| `smb` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:smb` |
"
  [^CfnLocationFSxONTAP$ProtocolProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :nfs)]
    (. builder nfs data))
  (when-some [data (lookup-entry config id :smb)]
    (. builder smb data))
  (.build builder))


(defn cfn-location-f-sx-ontap-protocol-property-builder
  "Creates a  `CfnLocationFSxONTAP$ProtocolProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-ontap-protocol-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-ontap-protocol-property-builder> (new CfnLocationFSxONTAP$ProtocolProperty$Builder) id config))


(defn cfn-location-f-sx-ontap-smb-mount-options-property-builder>
  "The cfn-location-f-sx-ontap-smb-mount-options-property-builder> function updates a CfnLocationFSxONTAP$SmbMountOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxONTAP$SmbMountOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnLocationFSxONTAP$SmbMountOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-location-f-sx-ontap-smb-mount-options-property-builder
  "Creates a  `CfnLocationFSxONTAP$SmbMountOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-ontap-smb-mount-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-ontap-smb-mount-options-property-builder> (new CfnLocationFSxONTAP$SmbMountOptionsProperty$Builder) id config))


(defn cfn-location-f-sx-ontap-smb-property-builder>
  "The cfn-location-f-sx-ontap-smb-property-builder> function updates a CfnLocationFSxONTAP$SMBProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxONTAP$SMBProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `mountOptions` | software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP$SmbMountOptionsProperty | [[cdk.support/lookup-entry]] | `:mount-options` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
"
  [^CfnLocationFSxONTAP$SMBProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn cfn-location-f-sx-ontap-smb-property-builder
  "Creates a  `CfnLocationFSxONTAP$SMBProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-ontap-smb-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-ontap-smb-property-builder> (new CfnLocationFSxONTAP$SMBProperty$Builder) id config))


(defn cfn-location-f-sx-open-zfs-builder>
  "The cfn-location-f-sx-open-zfs-builder> function updates a CfnLocationFSxOpenZFS$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxOpenZFS$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `protocol` | software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS$ProtocolProperty | [[cdk.support/lookup-entry]] | `:protocol` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationFSxOpenZFS$Builder builder id config]
  (when-some [data (lookup-entry config id :fsx-filesystem-arn)]
    (. builder fsxFilesystemArn data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :security-group-arns)]
    (. builder securityGroupArns data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-f-sx-open-zfs-builder
  "Creates a  `CfnLocationFSxOpenZFS$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-location-f-sx-open-zfs-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-f-sx-open-zfs-builder> (CfnLocationFSxOpenZFS$Builder/create scope (name id)) id config))


(defn cfn-location-f-sx-open-zfs-mount-options-property-builder>
  "The cfn-location-f-sx-open-zfs-mount-options-property-builder> function updates a CfnLocationFSxOpenZFS$MountOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxOpenZFS$MountOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnLocationFSxOpenZFS$MountOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-location-f-sx-open-zfs-mount-options-property-builder
  "Creates a  `CfnLocationFSxOpenZFS$MountOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-open-zfs-mount-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-open-zfs-mount-options-property-builder> (new CfnLocationFSxOpenZFS$MountOptionsProperty$Builder) id config))


(defn cfn-location-f-sx-open-zfs-nfs-property-builder>
  "The cfn-location-f-sx-open-zfs-nfs-property-builder> function updates a CfnLocationFSxOpenZFS$NFSProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxOpenZFS$NFSProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountOptions` | software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS$MountOptionsProperty | [[cdk.support/lookup-entry]] | `:mount-options` |
"
  [^CfnLocationFSxOpenZFS$NFSProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (.build builder))


(defn cfn-location-f-sx-open-zfs-nfs-property-builder
  "Creates a  `CfnLocationFSxOpenZFS$NFSProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-open-zfs-nfs-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-open-zfs-nfs-property-builder> (new CfnLocationFSxOpenZFS$NFSProperty$Builder) id config))


(defn cfn-location-f-sx-open-zfs-props-builder>
  "The cfn-location-f-sx-open-zfs-props-builder> function updates a CfnLocationFSxOpenZFSProps$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxOpenZFSProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `protocol` | software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS$ProtocolProperty | [[cdk.support/lookup-entry]] | `:protocol` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationFSxOpenZFSProps$Builder builder id config]
  (when-some [data (lookup-entry config id :fsx-filesystem-arn)]
    (. builder fsxFilesystemArn data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :security-group-arns)]
    (. builder securityGroupArns data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-f-sx-open-zfs-props-builder
  "Creates a  `CfnLocationFSxOpenZFSProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-open-zfs-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-open-zfs-props-builder> (new CfnLocationFSxOpenZFSProps$Builder) id config))


(defn cfn-location-f-sx-open-zfs-protocol-property-builder>
  "The cfn-location-f-sx-open-zfs-protocol-property-builder> function updates a CfnLocationFSxOpenZFS$ProtocolProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxOpenZFS$ProtocolProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nfs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:nfs` |
"
  [^CfnLocationFSxOpenZFS$ProtocolProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :nfs)]
    (. builder nfs data))
  (.build builder))


(defn cfn-location-f-sx-open-zfs-protocol-property-builder
  "Creates a  `CfnLocationFSxOpenZFS$ProtocolProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-open-zfs-protocol-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-open-zfs-protocol-property-builder> (new CfnLocationFSxOpenZFS$ProtocolProperty$Builder) id config))


(defn cfn-location-f-sx-windows-builder>
  "The cfn-location-f-sx-windows-builder> function updates a CfnLocationFSxWindows$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxWindows$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
"
  [^CfnLocationFSxWindows$Builder builder id config]
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :fsx-filesystem-arn)]
    (. builder fsxFilesystemArn data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :security-group-arns)]
    (. builder securityGroupArns data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn cfn-location-f-sx-windows-builder
  "Creates a  `CfnLocationFSxWindows$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-location-f-sx-windows-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-f-sx-windows-builder> (CfnLocationFSxWindows$Builder/create scope (name id)) id config))


(defn cfn-location-f-sx-windows-props-builder>
  "The cfn-location-f-sx-windows-props-builder> function updates a CfnLocationFSxWindowsProps$Builder instance using the provided configuration.
  The function takes the CfnLocationFSxWindowsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `fsxFilesystemArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:fsx-filesystem-arn` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `securityGroupArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-arns` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
"
  [^CfnLocationFSxWindowsProps$Builder builder id config]
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :fsx-filesystem-arn)]
    (. builder fsxFilesystemArn data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :security-group-arns)]
    (. builder securityGroupArns data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn cfn-location-f-sx-windows-props-builder
  "Creates a  `CfnLocationFSxWindowsProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-f-sx-windows-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-f-sx-windows-props-builder> (new CfnLocationFSxWindowsProps$Builder) id config))


(defn cfn-location-hdfs-builder>
  "The cfn-location-hdfs-builder> function updates a CfnLocationHDFS$Builder instance using the provided configuration.
  The function takes the CfnLocationHDFS$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationHDFS$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-arns)]
    (. builder agentArns data))
  (when-some [data (lookup-entry config id :authentication-type)]
    (. builder authenticationType data))
  (when-some [data (lookup-entry config id :block-size)]
    (. builder blockSize data))
  (when-some [data (lookup-entry config id :kerberos-keytab)]
    (. builder kerberosKeytab data))
  (when-some [data (lookup-entry config id :kerberos-krb5-conf)]
    (. builder kerberosKrb5Conf data))
  (when-some [data (lookup-entry config id :kerberos-principal)]
    (. builder kerberosPrincipal data))
  (when-some [data (lookup-entry config id :kms-key-provider-uri)]
    (. builder kmsKeyProviderUri data))
  (when-some [data (lookup-entry config id :name-nodes)]
    (. builder nameNodes data))
  (when-some [data (lookup-entry config id :qop-configuration)]
    (. builder qopConfiguration data))
  (when-some [data (lookup-entry config id :replication-factor)]
    (. builder replicationFactor data))
  (when-some [data (lookup-entry config id :simple-user)]
    (. builder simpleUser data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-hdfs-builder
  "Creates a  `CfnLocationHDFS$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-location-hdfs-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-hdfs-builder> (CfnLocationHDFS$Builder/create scope (name id)) id config))


(defn cfn-location-hdfs-name-node-property-builder>
  "The cfn-location-hdfs-name-node-property-builder> function updates a CfnLocationHDFS$NameNodeProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationHDFS$NameNodeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnLocationHDFS$NameNodeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :hostname)]
    (. builder hostname data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-location-hdfs-name-node-property-builder
  "Creates a  `CfnLocationHDFS$NameNodeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-hdfs-name-node-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-hdfs-name-node-property-builder> (new CfnLocationHDFS$NameNodeProperty$Builder) id config))


(defn cfn-location-hdfs-props-builder>
  "The cfn-location-hdfs-props-builder> function updates a CfnLocationHDFSProps$Builder instance using the provided configuration.
  The function takes the CfnLocationHDFSProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationHDFSProps$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-arns)]
    (. builder agentArns data))
  (when-some [data (lookup-entry config id :authentication-type)]
    (. builder authenticationType data))
  (when-some [data (lookup-entry config id :block-size)]
    (. builder blockSize data))
  (when-some [data (lookup-entry config id :kerberos-keytab)]
    (. builder kerberosKeytab data))
  (when-some [data (lookup-entry config id :kerberos-krb5-conf)]
    (. builder kerberosKrb5Conf data))
  (when-some [data (lookup-entry config id :kerberos-principal)]
    (. builder kerberosPrincipal data))
  (when-some [data (lookup-entry config id :kms-key-provider-uri)]
    (. builder kmsKeyProviderUri data))
  (when-some [data (lookup-entry config id :name-nodes)]
    (. builder nameNodes data))
  (when-some [data (lookup-entry config id :qop-configuration)]
    (. builder qopConfiguration data))
  (when-some [data (lookup-entry config id :replication-factor)]
    (. builder replicationFactor data))
  (when-some [data (lookup-entry config id :simple-user)]
    (. builder simpleUser data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-hdfs-props-builder
  "Creates a  `CfnLocationHDFSProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-hdfs-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-hdfs-props-builder> (new CfnLocationHDFSProps$Builder) id config))


(defn cfn-location-hdfs-qop-configuration-property-builder>
  "The cfn-location-hdfs-qop-configuration-property-builder> function updates a CfnLocationHDFS$QopConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationHDFS$QopConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataTransferProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-transfer-protection` |
| `rpcProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:rpc-protection` |
"
  [^CfnLocationHDFS$QopConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-transfer-protection)]
    (. builder dataTransferProtection data))
  (when-some [data (lookup-entry config id :rpc-protection)]
    (. builder rpcProtection data))
  (.build builder))


(defn cfn-location-hdfs-qop-configuration-property-builder
  "Creates a  `CfnLocationHDFS$QopConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-hdfs-qop-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-hdfs-qop-configuration-property-builder> (new CfnLocationHDFS$QopConfigurationProperty$Builder) id config))


(defn cfn-location-nfs-builder>
  "The cfn-location-nfs-builder> function updates a CfnLocationNFS$Builder instance using the provided configuration.
  The function takes the CfnLocationNFS$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountOptions` | software.amazon.awscdk.services.datasync.CfnLocationNFS$MountOptionsProperty | [[cdk.support/lookup-entry]] | `:mount-options` |
| `onPremConfig` | software.amazon.awscdk.services.datasync.CfnLocationNFS$OnPremConfigProperty | [[cdk.support/lookup-entry]] | `:on-prem-config` |
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationNFS$Builder builder id config]
  (when-some [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (when-some [data (lookup-entry config id :on-prem-config)]
    (. builder onPremConfig data))
  (when-some [data (lookup-entry config id :server-hostname)]
    (. builder serverHostname data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-nfs-builder
  "Creates a  `CfnLocationNFS$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-location-nfs-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-nfs-builder> (CfnLocationNFS$Builder/create scope (name id)) id config))


(defn cfn-location-nfs-mount-options-property-builder>
  "The cfn-location-nfs-mount-options-property-builder> function updates a CfnLocationNFS$MountOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationNFS$MountOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnLocationNFS$MountOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-location-nfs-mount-options-property-builder
  "Creates a  `CfnLocationNFS$MountOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-nfs-mount-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-nfs-mount-options-property-builder> (new CfnLocationNFS$MountOptionsProperty$Builder) id config))


(defn cfn-location-nfs-on-prem-config-property-builder>
  "The cfn-location-nfs-on-prem-config-property-builder> function updates a CfnLocationNFS$OnPremConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationNFS$OnPremConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
"
  [^CfnLocationNFS$OnPremConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-arns)]
    (. builder agentArns data))
  (.build builder))


(defn cfn-location-nfs-on-prem-config-property-builder
  "Creates a  `CfnLocationNFS$OnPremConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-nfs-on-prem-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-nfs-on-prem-config-property-builder> (new CfnLocationNFS$OnPremConfigProperty$Builder) id config))


(defn cfn-location-nfs-props-builder>
  "The cfn-location-nfs-props-builder> function updates a CfnLocationNFSProps$Builder instance using the provided configuration.
  The function takes the CfnLocationNFSProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mountOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mount-options` |
| `onPremConfig` | software.amazon.awscdk.services.datasync.CfnLocationNFS$OnPremConfigProperty | [[cdk.support/lookup-entry]] | `:on-prem-config` |
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationNFSProps$Builder builder id config]
  (when-some [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (when-some [data (lookup-entry config id :on-prem-config)]
    (. builder onPremConfig data))
  (when-some [data (lookup-entry config id :server-hostname)]
    (. builder serverHostname data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-nfs-props-builder
  "Creates a  `CfnLocationNFSProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-nfs-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-nfs-props-builder> (new CfnLocationNFSProps$Builder) id config))


(defn cfn-location-object-storage-builder>
  "The cfn-location-object-storage-builder> function updates a CfnLocationObjectStorage$Builder instance using the provided configuration.
  The function takes the CfnLocationObjectStorage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationObjectStorage$Builder builder id config]
  (when-some [data (lookup-entry config id :access-key)]
    (. builder accessKey data))
  (when-some [data (lookup-entry config id :agent-arns)]
    (. builder agentArns data))
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :secret-key)]
    (. builder secretKey data))
  (when-some [data (lookup-entry config id :server-certificate)]
    (. builder serverCertificate data))
  (when-some [data (lookup-entry config id :server-hostname)]
    (. builder serverHostname data))
  (when-some [data (lookup-entry config id :server-port)]
    (. builder serverPort data))
  (when-some [data (lookup-entry config id :server-protocol)]
    (. builder serverProtocol data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-object-storage-builder
  "Creates a  `CfnLocationObjectStorage$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-location-object-storage-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-object-storage-builder> (CfnLocationObjectStorage$Builder/create scope (name id)) id config))


(defn cfn-location-object-storage-props-builder>
  "The cfn-location-object-storage-props-builder> function updates a CfnLocationObjectStorageProps$Builder instance using the provided configuration.
  The function takes the CfnLocationObjectStorageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationObjectStorageProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-key)]
    (. builder accessKey data))
  (when-some [data (lookup-entry config id :agent-arns)]
    (. builder agentArns data))
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :secret-key)]
    (. builder secretKey data))
  (when-some [data (lookup-entry config id :server-certificate)]
    (. builder serverCertificate data))
  (when-some [data (lookup-entry config id :server-hostname)]
    (. builder serverHostname data))
  (when-some [data (lookup-entry config id :server-port)]
    (. builder serverPort data))
  (when-some [data (lookup-entry config id :server-protocol)]
    (. builder serverProtocol data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-object-storage-props-builder
  "Creates a  `CfnLocationObjectStorageProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-object-storage-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-object-storage-props-builder> (new CfnLocationObjectStorageProps$Builder) id config))


(defn cfn-location-s3-builder>
  "The cfn-location-s3-builder> function updates a CfnLocationS3$Builder instance using the provided configuration.
  The function takes the CfnLocationS3$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |
| `s3Config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-config` |
| `s3StorageClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-storage-class` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationS3$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-bucket-arn)]
    (. builder s3BucketArn data))
  (when-some [data (lookup-entry config id :s3-config)]
    (. builder s3Config data))
  (when-some [data (lookup-entry config id :s3-storage-class)]
    (. builder s3StorageClass data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-s3-builder
  "Creates a  `CfnLocationS3$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-location-s3-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-s3-builder> (CfnLocationS3$Builder/create scope (name id)) id config))


(defn cfn-location-s3-props-builder>
  "The cfn-location-s3-props-builder> function updates a CfnLocationS3Props$Builder instance using the provided configuration.
  The function takes the CfnLocationS3Props$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |
| `s3Config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-config` |
| `s3StorageClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-storage-class` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationS3Props$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-bucket-arn)]
    (. builder s3BucketArn data))
  (when-some [data (lookup-entry config id :s3-config)]
    (. builder s3Config data))
  (when-some [data (lookup-entry config id :s3-storage-class)]
    (. builder s3StorageClass data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-s3-props-builder
  "Creates a  `CfnLocationS3Props$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-s3-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-s3-props-builder> (new CfnLocationS3Props$Builder) id config))


(defn cfn-location-s3-s3-config-property-builder>
  "The cfn-location-s3-s3-config-property-builder> function updates a CfnLocationS3$S3ConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationS3$S3ConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-access-role-arn` |
"
  [^CfnLocationS3$S3ConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-access-role-arn)]
    (. builder bucketAccessRoleArn data))
  (.build builder))


(defn cfn-location-s3-s3-config-property-builder
  "Creates a  `CfnLocationS3$S3ConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-s3-s3-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-s3-s3-config-property-builder> (new CfnLocationS3$S3ConfigProperty$Builder) id config))


(defn cfn-location-smb-builder>
  "The cfn-location-smb-builder> function updates a CfnLocationSMB$Builder instance using the provided configuration.
  The function takes the CfnLocationSMB$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `mountOptions` | software.amazon.awscdk.services.datasync.CfnLocationSMB$MountOptionsProperty | [[cdk.support/lookup-entry]] | `:mount-options` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
"
  [^CfnLocationSMB$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-arns)]
    (. builder agentArns data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :server-hostname)]
    (. builder serverHostname data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn cfn-location-smb-builder
  "Creates a  `CfnLocationSMB$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-location-smb-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-smb-builder> (CfnLocationSMB$Builder/create scope (name id)) id config))


(defn cfn-location-smb-mount-options-property-builder>
  "The cfn-location-smb-mount-options-property-builder> function updates a CfnLocationSMB$MountOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnLocationSMB$MountOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnLocationSMB$MountOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-location-smb-mount-options-property-builder
  "Creates a  `CfnLocationSMB$MountOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-smb-mount-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-smb-mount-options-property-builder> (new CfnLocationSMB$MountOptionsProperty$Builder) id config))


(defn cfn-location-smb-props-builder>
  "The cfn-location-smb-props-builder> function updates a CfnLocationSMBProps$Builder instance using the provided configuration.
  The function takes the CfnLocationSMBProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `mountOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:mount-options` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
"
  [^CfnLocationSMBProps$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-arns)]
    (. builder agentArns data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :mount-options)]
    (. builder mountOptions data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :server-hostname)]
    (. builder serverHostname data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn cfn-location-smb-props-builder
  "Creates a  `CfnLocationSMBProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-location-smb-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-location-smb-props-builder> (new CfnLocationSMBProps$Builder) id config))


(defn cfn-storage-system-builder>
  "The cfn-storage-system-builder> function updates a CfnStorageSystem$Builder instance using the provided configuration.
  The function takes the CfnStorageSystem$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `cloudWatchLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverConfiguration` | software.amazon.awscdk.services.datasync.CfnStorageSystem$ServerConfigurationProperty | [[cdk.support/lookup-entry]] | `:server-configuration` |
| `serverCredentials` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-credentials` |
| `systemType` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStorageSystem$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-arns)]
    (. builder agentArns data))
  (when-some [data (lookup-entry config id :cloud-watch-log-group-arn)]
    (. builder cloudWatchLogGroupArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :server-configuration)]
    (. builder serverConfiguration data))
  (when-some [data (lookup-entry config id :server-credentials)]
    (. builder serverCredentials data))
  (when-some [data (lookup-entry config id :system-type)]
    (. builder systemType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-storage-system-builder
  "Creates a  `CfnStorageSystem$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-storage-system-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-storage-system-builder> (CfnStorageSystem$Builder/create scope (name id)) id config))


(defn cfn-storage-system-props-builder>
  "The cfn-storage-system-props-builder> function updates a CfnStorageSystemProps$Builder instance using the provided configuration.
  The function takes the CfnStorageSystemProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentArns` | java.util.List | [[cdk.support/lookup-entry]] | `:agent-arns` |
| `cloudWatchLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `serverConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-configuration` |
| `serverCredentials` | software.amazon.awscdk.services.datasync.CfnStorageSystem$ServerCredentialsProperty | [[cdk.support/lookup-entry]] | `:server-credentials` |
| `systemType` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStorageSystemProps$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-arns)]
    (. builder agentArns data))
  (when-some [data (lookup-entry config id :cloud-watch-log-group-arn)]
    (. builder cloudWatchLogGroupArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :server-configuration)]
    (. builder serverConfiguration data))
  (when-some [data (lookup-entry config id :server-credentials)]
    (. builder serverCredentials data))
  (when-some [data (lookup-entry config id :system-type)]
    (. builder systemType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-storage-system-props-builder
  "Creates a  `CfnStorageSystemProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-storage-system-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-storage-system-props-builder> (new CfnStorageSystemProps$Builder) id config))


(defn cfn-storage-system-server-configuration-property-builder>
  "The cfn-storage-system-server-configuration-property-builder> function updates a CfnStorageSystem$ServerConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageSystem$ServerConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serverHostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-hostname` |
| `serverPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:server-port` |
"
  [^CfnStorageSystem$ServerConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :server-hostname)]
    (. builder serverHostname data))
  (when-some [data (lookup-entry config id :server-port)]
    (. builder serverPort data))
  (.build builder))


(defn cfn-storage-system-server-configuration-property-builder
  "Creates a  `CfnStorageSystem$ServerConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-storage-system-server-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-storage-system-server-configuration-property-builder> (new CfnStorageSystem$ServerConfigurationProperty$Builder) id config))


(defn cfn-storage-system-server-credentials-property-builder>
  "The cfn-storage-system-server-credentials-property-builder> function updates a CfnStorageSystem$ServerCredentialsProperty$Builder instance using the provided configuration.
  The function takes the CfnStorageSystem$ServerCredentialsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnStorageSystem$ServerCredentialsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-storage-system-server-credentials-property-builder
  "Creates a  `CfnStorageSystem$ServerCredentialsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-storage-system-server-credentials-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-storage-system-server-credentials-property-builder> (new CfnStorageSystem$ServerCredentialsProperty$Builder) id config))


(defn cfn-task-builder>
  "The cfn-task-builder> function updates a CfnTask$Builder instance using the provided configuration.
  The function takes the CfnTask$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `taskReportConfig` | software.amazon.awscdk.services.datasync.CfnTask$TaskReportConfigProperty | [[cdk.support/lookup-entry]] | `:task-report-config` |
"
  [^CfnTask$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-log-group-arn)]
    (. builder cloudWatchLogGroupArn data))
  (when-some [data (lookup-entry config id :destination-location-arn)]
    (. builder destinationLocationArn data))
  (when-some [data (lookup-entry config id :excludes)]
    (. builder excludes data))
  (when-some [data (lookup-entry config id :includes)]
    (. builder includes data))
  (when-some [data (lookup-entry config id :manifest-config)]
    (. builder manifestConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :options)]
    (. builder options data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :source-location-arn)]
    (. builder sourceLocationArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-report-config)]
    (. builder taskReportConfig data))
  (.build builder))


(defn cfn-task-builder
  "Creates a  `CfnTask$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-task-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-task-builder> (CfnTask$Builder/create scope (name id)) id config))


(defn cfn-task-deleted-property-builder>
  "The cfn-task-deleted-property-builder> function updates a CfnTask$DeletedProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$DeletedProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-level` |
"
  [^CfnTask$DeletedProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :report-level)]
    (. builder reportLevel data))
  (.build builder))


(defn cfn-task-deleted-property-builder
  "Creates a  `CfnTask$DeletedProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-deleted-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-deleted-property-builder> (new CfnTask$DeletedProperty$Builder) id config))


(defn cfn-task-destination-property-builder>
  "The cfn-task-destination-property-builder> function updates a CfnTask$DestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$DestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3` | software.amazon.awscdk.services.datasync.CfnTask$S3Property | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnTask$DestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn cfn-task-destination-property-builder
  "Creates a  `CfnTask$DestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-destination-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-destination-property-builder> (new CfnTask$DestinationProperty$Builder) id config))


(defn cfn-task-filter-rule-property-builder>
  "The cfn-task-filter-rule-property-builder> function updates a CfnTask$FilterRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$FilterRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTask$FilterRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :filter-type)]
    (. builder filterType data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-task-filter-rule-property-builder
  "Creates a  `CfnTask$FilterRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-filter-rule-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-filter-rule-property-builder> (new CfnTask$FilterRuleProperty$Builder) id config))


(defn cfn-task-manifest-config-property-builder>
  "The cfn-task-manifest-config-property-builder> function updates a CfnTask$ManifestConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$ManifestConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `format` | java.lang.String | [[cdk.support/lookup-entry]] | `:format` |
| `source` | software.amazon.awscdk.services.datasync.CfnTask$SourceProperty | [[cdk.support/lookup-entry]] | `:source` |
"
  [^CfnTask$ManifestConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :format)]
    (. builder format data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn cfn-task-manifest-config-property-builder
  "Creates a  `CfnTask$ManifestConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-manifest-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-manifest-config-property-builder> (new CfnTask$ManifestConfigProperty$Builder) id config))


(defn cfn-task-manifest-config-source-s3-property-builder>
  "The cfn-task-manifest-config-source-s3-property-builder> function updates a CfnTask$ManifestConfigSourceS3Property$Builder instance using the provided configuration.
  The function takes the CfnTask$ManifestConfigSourceS3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-access-role-arn` |
| `manifestObjectPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-object-path` |
| `manifestObjectVersionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest-object-version-id` |
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |
"
  [^CfnTask$ManifestConfigSourceS3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-access-role-arn)]
    (. builder bucketAccessRoleArn data))
  (when-some [data (lookup-entry config id :manifest-object-path)]
    (. builder manifestObjectPath data))
  (when-some [data (lookup-entry config id :manifest-object-version-id)]
    (. builder manifestObjectVersionId data))
  (when-some [data (lookup-entry config id :s3-bucket-arn)]
    (. builder s3BucketArn data))
  (.build builder))


(defn cfn-task-manifest-config-source-s3-property-builder
  "Creates a  `CfnTask$ManifestConfigSourceS3Property$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-manifest-config-source-s3-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-manifest-config-source-s3-property-builder> (new CfnTask$ManifestConfigSourceS3Property$Builder) id config))


(defn cfn-task-options-property-builder>
  "The cfn-task-options-property-builder> function updates a CfnTask$OptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$OptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `verifyMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:verify-mode` |
"
  [^CfnTask$OptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :atime)]
    (. builder atime data))
  (when-some [data (lookup-entry config id :bytes-per-second)]
    (. builder bytesPerSecond data))
  (when-some [data (lookup-entry config id :gid)]
    (. builder gid data))
  (when-some [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-some [data (lookup-entry config id :mtime)]
    (. builder mtime data))
  (when-some [data (lookup-entry config id :object-tags)]
    (. builder objectTags data))
  (when-some [data (lookup-entry config id :overwrite-mode)]
    (. builder overwriteMode data))
  (when-some [data (lookup-entry config id :posix-permissions)]
    (. builder posixPermissions data))
  (when-some [data (lookup-entry config id :preserve-deleted-files)]
    (. builder preserveDeletedFiles data))
  (when-some [data (lookup-entry config id :preserve-devices)]
    (. builder preserveDevices data))
  (when-some [data (lookup-entry config id :security-descriptor-copy-flags)]
    (. builder securityDescriptorCopyFlags data))
  (when-some [data (lookup-entry config id :task-queueing)]
    (. builder taskQueueing data))
  (when-some [data (lookup-entry config id :transfer-mode)]
    (. builder transferMode data))
  (when-some [data (lookup-entry config id :uid)]
    (. builder uid data))
  (when-some [data (lookup-entry config id :verify-mode)]
    (. builder verifyMode data))
  (.build builder))


(defn cfn-task-options-property-builder
  "Creates a  `CfnTask$OptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-options-property-builder> (new CfnTask$OptionsProperty$Builder) id config))


(defn cfn-task-overrides-property-builder>
  "The cfn-task-overrides-property-builder> function updates a CfnTask$OverridesProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$OverridesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deleted` |
| `skipped` | software.amazon.awscdk.services.datasync.CfnTask$SkippedProperty | [[cdk.support/lookup-entry]] | `:skipped` |
| `transferred` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transferred` |
| `verified` | software.amazon.awscdk.services.datasync.CfnTask$VerifiedProperty | [[cdk.support/lookup-entry]] | `:verified` |
"
  [^CfnTask$OverridesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :deleted)]
    (. builder deleted data))
  (when-some [data (lookup-entry config id :skipped)]
    (. builder skipped data))
  (when-some [data (lookup-entry config id :transferred)]
    (. builder transferred data))
  (when-some [data (lookup-entry config id :verified)]
    (. builder verified data))
  (.build builder))


(defn cfn-task-overrides-property-builder
  "Creates a  `CfnTask$OverridesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-overrides-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-overrides-property-builder> (new CfnTask$OverridesProperty$Builder) id config))


(defn cfn-task-props-builder>
  "The cfn-task-props-builder> function updates a CfnTaskProps$Builder instance using the provided configuration.
  The function takes the CfnTaskProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `taskReportConfig` | software.amazon.awscdk.services.datasync.CfnTask$TaskReportConfigProperty | [[cdk.support/lookup-entry]] | `:task-report-config` |
"
  [^CfnTaskProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-log-group-arn)]
    (. builder cloudWatchLogGroupArn data))
  (when-some [data (lookup-entry config id :destination-location-arn)]
    (. builder destinationLocationArn data))
  (when-some [data (lookup-entry config id :excludes)]
    (. builder excludes data))
  (when-some [data (lookup-entry config id :includes)]
    (. builder includes data))
  (when-some [data (lookup-entry config id :manifest-config)]
    (. builder manifestConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :options)]
    (. builder options data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :source-location-arn)]
    (. builder sourceLocationArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-report-config)]
    (. builder taskReportConfig data))
  (.build builder))


(defn cfn-task-props-builder
  "Creates a  `CfnTaskProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-props-builder> (new CfnTaskProps$Builder) id config))


(defn cfn-task-s3-property-builder>
  "The cfn-task-s3-property-builder> function updates a CfnTask$S3Property$Builder instance using the provided configuration.
  The function takes the CfnTask$S3Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketAccessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-access-role-arn` |
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |
| `subdirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdirectory` |
"
  [^CfnTask$S3Property$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-access-role-arn)]
    (. builder bucketAccessRoleArn data))
  (when-some [data (lookup-entry config id :s3-bucket-arn)]
    (. builder s3BucketArn data))
  (when-some [data (lookup-entry config id :subdirectory)]
    (. builder subdirectory data))
  (.build builder))


(defn cfn-task-s3-property-builder
  "Creates a  `CfnTask$S3Property$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-s3-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-s3-property-builder> (new CfnTask$S3Property$Builder) id config))


(defn cfn-task-skipped-property-builder>
  "The cfn-task-skipped-property-builder> function updates a CfnTask$SkippedProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$SkippedProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-level` |
"
  [^CfnTask$SkippedProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :report-level)]
    (. builder reportLevel data))
  (.build builder))


(defn cfn-task-skipped-property-builder
  "Creates a  `CfnTask$SkippedProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-skipped-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-skipped-property-builder> (new CfnTask$SkippedProperty$Builder) id config))


(defn cfn-task-source-property-builder>
  "The cfn-task-source-property-builder> function updates a CfnTask$SourceProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$SourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnTask$SourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn cfn-task-source-property-builder
  "Creates a  `CfnTask$SourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-source-property-builder> (new CfnTask$SourceProperty$Builder) id config))


(defn cfn-task-task-report-config-property-builder>
  "The cfn-task-task-report-config-property-builder> function updates a CfnTask$TaskReportConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$TaskReportConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `objectVersionIds` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version-ids` |
| `outputType` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-type` |
| `overrides` | software.amazon.awscdk.services.datasync.CfnTask$OverridesProperty | [[cdk.support/lookup-entry]] | `:overrides` |
| `reportLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-level` |
"
  [^CfnTask$TaskReportConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :object-version-ids)]
    (. builder objectVersionIds data))
  (when-some [data (lookup-entry config id :output-type)]
    (. builder outputType data))
  (when-some [data (lookup-entry config id :overrides)]
    (. builder overrides data))
  (when-some [data (lookup-entry config id :report-level)]
    (. builder reportLevel data))
  (.build builder))


(defn cfn-task-task-report-config-property-builder
  "Creates a  `CfnTask$TaskReportConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-task-report-config-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-task-report-config-property-builder> (new CfnTask$TaskReportConfigProperty$Builder) id config))


(defn cfn-task-task-schedule-property-builder>
  "The cfn-task-task-schedule-property-builder> function updates a CfnTask$TaskScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$TaskScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnTask$TaskScheduleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-task-task-schedule-property-builder
  "Creates a  `CfnTask$TaskScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-task-schedule-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-task-schedule-property-builder> (new CfnTask$TaskScheduleProperty$Builder) id config))


(defn cfn-task-transferred-property-builder>
  "The cfn-task-transferred-property-builder> function updates a CfnTask$TransferredProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$TransferredProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-level` |
"
  [^CfnTask$TransferredProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :report-level)]
    (. builder reportLevel data))
  (.build builder))


(defn cfn-task-transferred-property-builder
  "Creates a  `CfnTask$TransferredProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-transferred-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-transferred-property-builder> (new CfnTask$TransferredProperty$Builder) id config))


(defn cfn-task-verified-property-builder>
  "The cfn-task-verified-property-builder> function updates a CfnTask$VerifiedProperty$Builder instance using the provided configuration.
  The function takes the CfnTask$VerifiedProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-level` |
"
  [^CfnTask$VerifiedProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :report-level)]
    (. builder reportLevel data))
  (.build builder))


(defn cfn-task-verified-property-builder
  "Creates a  `CfnTask$VerifiedProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-task-verified-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-task-verified-property-builder> (new CfnTask$VerifiedProperty$Builder) id config))