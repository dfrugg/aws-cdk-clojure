(ns cdk.api.services.nimblestudio
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.nimblestudio package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.nimblestudio CfnLaunchProfile$Builder
                                                         CfnLaunchProfile$StreamConfigurationProperty$Builder
                                                         CfnLaunchProfile$StreamConfigurationSessionBackupProperty$Builder
                                                         CfnLaunchProfile$StreamConfigurationSessionStorageProperty$Builder
                                                         CfnLaunchProfile$StreamingSessionStorageRootProperty$Builder
                                                         CfnLaunchProfile$VolumeConfigurationProperty$Builder
                                                         CfnLaunchProfileProps$Builder
                                                         CfnStreamingImage$Builder
                                                         CfnStreamingImage$StreamingImageEncryptionConfigurationProperty$Builder
                                                         CfnStreamingImageProps$Builder
                                                         CfnStudio$Builder
                                                         CfnStudio$StudioEncryptionConfigurationProperty$Builder
                                                         CfnStudioComponent$ActiveDirectoryComputerAttributeProperty$Builder
                                                         CfnStudioComponent$ActiveDirectoryConfigurationProperty$Builder
                                                         CfnStudioComponent$Builder
                                                         CfnStudioComponent$ComputeFarmConfigurationProperty$Builder
                                                         CfnStudioComponent$LicenseServiceConfigurationProperty$Builder
                                                         CfnStudioComponent$ScriptParameterKeyValueProperty$Builder
                                                         CfnStudioComponent$SharedFileSystemConfigurationProperty$Builder
                                                         CfnStudioComponent$StudioComponentConfigurationProperty$Builder
                                                         CfnStudioComponent$StudioComponentInitializationScriptProperty$Builder
                                                         CfnStudioComponentProps$Builder
                                                         CfnStudioProps$Builder]))


(defn cfn-launch-profile-builder
  "The cfn-launch-profile-builder function buildes out new instances of 
CfnLaunchProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ec2SubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-subnet-ids` |
| `launchProfileProtocolVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:launch-profile-protocol-versions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `streamConfiguration` | software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile$StreamConfigurationProperty | [[cdk.support/lookup-entry]] | `:stream-configuration` |
| `studioComponentIds` | java.util.List | [[cdk.support/lookup-entry]] | `:studio-component-ids` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLaunchProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ec2-subnet-ids)]
      (. builder ec2SubnetIds data))
    (when-let [data (lookup-entry config id :launch-profile-protocol-versions)]
      (. builder launchProfileProtocolVersions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :stream-configuration)]
      (. builder streamConfiguration data))
    (when-let [data (lookup-entry config id :studio-component-ids)]
      (. builder studioComponentIds data))
    (when-let [data (lookup-entry config id :studio-id)]
      (. builder studioId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-launch-profile-props-builder
  "The cfn-launch-profile-props-builder function buildes out new instances of 
CfnLaunchProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ec2SubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-subnet-ids` |
| `launchProfileProtocolVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:launch-profile-protocol-versions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `streamConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-configuration` |
| `studioComponentIds` | java.util.List | [[cdk.support/lookup-entry]] | `:studio-component-ids` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLaunchProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ec2-subnet-ids)]
      (. builder ec2SubnetIds data))
    (when-let [data (lookup-entry config id :launch-profile-protocol-versions)]
      (. builder launchProfileProtocolVersions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :stream-configuration)]
      (. builder streamConfiguration data))
    (when-let [data (lookup-entry config id :studio-component-ids)]
      (. builder studioComponentIds data))
    (when-let [data (lookup-entry config id :studio-id)]
      (. builder studioId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-launch-profile-stream-configuration-property-builder
  "The cfn-launch-profile-stream-configuration-property-builder function buildes out new instances of 
CfnLaunchProfile$StreamConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticTerminationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:automatic-termination-mode` |
| `clipboardMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:clipboard-mode` |
| `ec2InstanceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-instance-types` |
| `maxSessionLengthInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-session-length-in-minutes` |
| `maxStoppedSessionLengthInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-stopped-session-length-in-minutes` |
| `sessionBackup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:session-backup` |
| `sessionPersistenceMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-persistence-mode` |
| `sessionStorage` | software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile$StreamConfigurationSessionStorageProperty | [[cdk.support/lookup-entry]] | `:session-storage` |
| `streamingImageIds` | java.util.List | [[cdk.support/lookup-entry]] | `:streaming-image-ids` |
| `volumeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volume-configuration` |"
  [stack id config]
  (let [builder (CfnLaunchProfile$StreamConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :automatic-termination-mode)]
      (. builder automaticTerminationMode data))
    (when-let [data (lookup-entry config id :clipboard-mode)]
      (. builder clipboardMode data))
    (when-let [data (lookup-entry config id :ec2-instance-types)]
      (. builder ec2InstanceTypes data))
    (when-let [data (lookup-entry config id :max-session-length-in-minutes)]
      (. builder maxSessionLengthInMinutes data))
    (when-let [data (lookup-entry config id :max-stopped-session-length-in-minutes)]
      (. builder maxStoppedSessionLengthInMinutes data))
    (when-let [data (lookup-entry config id :session-backup)]
      (. builder sessionBackup data))
    (when-let [data (lookup-entry config id :session-persistence-mode)]
      (. builder sessionPersistenceMode data))
    (when-let [data (lookup-entry config id :session-storage)]
      (. builder sessionStorage data))
    (when-let [data (lookup-entry config id :streaming-image-ids)]
      (. builder streamingImageIds data))
    (when-let [data (lookup-entry config id :volume-configuration)]
      (. builder volumeConfiguration data))
    (.build builder)))


(defn cfn-launch-profile-stream-configuration-session-backup-property-builder
  "The cfn-launch-profile-stream-configuration-session-backup-property-builder function buildes out new instances of 
CfnLaunchProfile$StreamConfigurationSessionBackupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxBackupsToRetain` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-backups-to-retain` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |"
  [stack id config]
  (let [builder (CfnLaunchProfile$StreamConfigurationSessionBackupProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-backups-to-retain)]
      (. builder maxBackupsToRetain data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (.build builder)))


(defn cfn-launch-profile-stream-configuration-session-storage-property-builder
  "The cfn-launch-profile-stream-configuration-session-storage-property-builder function buildes out new instances of 
CfnLaunchProfile$StreamConfigurationSessionStorageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.util.List | [[cdk.support/lookup-entry]] | `:mode` |
| `root` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:root` |"
  [stack id config]
  (let [builder (CfnLaunchProfile$StreamConfigurationSessionStorageProperty$Builder.)]
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :root)]
      (. builder root data))
    (.build builder)))


(defn cfn-launch-profile-streaming-session-storage-root-property-builder
  "The cfn-launch-profile-streaming-session-storage-root-property-builder function buildes out new instances of 
CfnLaunchProfile$StreamingSessionStorageRootProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `linux` | java.lang.String | [[cdk.support/lookup-entry]] | `:linux` |
| `windows` | java.lang.String | [[cdk.support/lookup-entry]] | `:windows` |"
  [stack id config]
  (let [builder (CfnLaunchProfile$StreamingSessionStorageRootProperty$Builder.)]
    (when-let [data (lookup-entry config id :linux)]
      (. builder linux data))
    (when-let [data (lookup-entry config id :windows)]
      (. builder windows data))
    (.build builder)))


(defn cfn-launch-profile-volume-configuration-property-builder
  "The cfn-launch-profile-volume-configuration-property-builder function buildes out new instances of 
CfnLaunchProfile$VolumeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |"
  [stack id config]
  (let [builder (CfnLaunchProfile$VolumeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (.build builder)))


(defn cfn-streaming-image-builder
  "The cfn-streaming-image-builder function buildes out new instances of 
CfnStreamingImage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ec2ImageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-image-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStreamingImage$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ec2-image-id)]
      (. builder ec2ImageId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :studio-id)]
      (. builder studioId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-streaming-image-props-builder
  "The cfn-streaming-image-props-builder function buildes out new instances of 
CfnStreamingImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ec2ImageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-image-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnStreamingImageProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ec2-image-id)]
      (. builder ec2ImageId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :studio-id)]
      (. builder studioId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-streaming-image-streaming-image-encryption-configuration-property-builder
  "The cfn-streaming-image-streaming-image-encryption-configuration-property-builder function buildes out new instances of 
CfnStreamingImage$StreamingImageEncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |"
  [stack id config]
  (let [builder (CfnStreamingImage$StreamingImageEncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-arn)]
      (. builder keyArn data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (.build builder)))


(defn cfn-studio-builder
  "The cfn-studio-builder function buildes out new instances of 
CfnStudio$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-role-arn` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `studioEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:studio-encryption-configuration` |
| `studioName` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `userRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-role-arn` |"
  [stack id config]
  (let [builder (CfnStudio$Builder/create stack id)]
    (when-let [data (lookup-entry config id :admin-role-arn)]
      (. builder adminRoleArn data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :studio-encryption-configuration)]
      (. builder studioEncryptionConfiguration data))
    (when-let [data (lookup-entry config id :studio-name)]
      (. builder studioName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-role-arn)]
      (. builder userRoleArn data))
    (.build builder)))


(defn cfn-studio-component-active-directory-computer-attribute-property-builder
  "The cfn-studio-component-active-directory-computer-attribute-property-builder function buildes out new instances of 
CfnStudioComponent$ActiveDirectoryComputerAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnStudioComponent$ActiveDirectoryComputerAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-studio-component-active-directory-configuration-property-builder
  "The cfn-studio-component-active-directory-configuration-property-builder function buildes out new instances of 
CfnStudioComponent$ActiveDirectoryConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computerAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:computer-attributes` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `organizationalUnitDistinguishedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-name` |"
  [stack id config]
  (let [builder (CfnStudioComponent$ActiveDirectoryConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :computer-attributes)]
      (. builder computerAttributes data))
    (when-let [data (lookup-entry config id :directory-id)]
      (. builder directoryId data))
    (when-let [data (lookup-entry config id :organizational-unit-distinguished-name)]
      (. builder organizationalUnitDistinguishedName data))
    (.build builder)))


(defn cfn-studio-component-builder
  "The cfn-studio-component-builder function buildes out new instances of 
CfnStudioComponent$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.nimblestudio.CfnStudioComponent$StudioComponentConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ec2SecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-security-group-ids` |
| `initializationScripts` | java.util.List | [[cdk.support/lookup-entry]] | `:initialization-scripts` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-role-arn` |
| `scriptParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:script-parameters` |
| `secureInitializationRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-initialization-role-arn` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
| `subtype` | java.lang.String | [[cdk.support/lookup-entry]] | `:subtype` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnStudioComponent$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ec2-security-group-ids)]
      (. builder ec2SecurityGroupIds data))
    (when-let [data (lookup-entry config id :initialization-scripts)]
      (. builder initializationScripts data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :runtime-role-arn)]
      (. builder runtimeRoleArn data))
    (when-let [data (lookup-entry config id :script-parameters)]
      (. builder scriptParameters data))
    (when-let [data (lookup-entry config id :secure-initialization-role-arn)]
      (. builder secureInitializationRoleArn data))
    (when-let [data (lookup-entry config id :studio-id)]
      (. builder studioId data))
    (when-let [data (lookup-entry config id :subtype)]
      (. builder subtype data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-studio-component-compute-farm-configuration-property-builder
  "The cfn-studio-component-compute-farm-configuration-property-builder function buildes out new instances of 
CfnStudioComponent$ComputeFarmConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDirectoryUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-directory-user` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |"
  [stack id config]
  (let [builder (CfnStudioComponent$ComputeFarmConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :active-directory-user)]
      (. builder activeDirectoryUser data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (.build builder)))


(defn cfn-studio-component-license-service-configuration-property-builder
  "The cfn-studio-component-license-service-configuration-property-builder function buildes out new instances of 
CfnStudioComponent$LicenseServiceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |"
  [stack id config]
  (let [builder (CfnStudioComponent$LicenseServiceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (.build builder)))


(defn cfn-studio-component-props-builder
  "The cfn-studio-component-props-builder function buildes out new instances of 
CfnStudioComponentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.services.nimblestudio.CfnStudioComponent$StudioComponentConfigurationProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ec2SecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-security-group-ids` |
| `initializationScripts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initialization-scripts` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `runtimeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime-role-arn` |
| `scriptParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:script-parameters` |
| `secureInitializationRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secure-initialization-role-arn` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
| `subtype` | java.lang.String | [[cdk.support/lookup-entry]] | `:subtype` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnStudioComponentProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :ec2-security-group-ids)]
      (. builder ec2SecurityGroupIds data))
    (when-let [data (lookup-entry config id :initialization-scripts)]
      (. builder initializationScripts data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :runtime-role-arn)]
      (. builder runtimeRoleArn data))
    (when-let [data (lookup-entry config id :script-parameters)]
      (. builder scriptParameters data))
    (when-let [data (lookup-entry config id :secure-initialization-role-arn)]
      (. builder secureInitializationRoleArn data))
    (when-let [data (lookup-entry config id :studio-id)]
      (. builder studioId data))
    (when-let [data (lookup-entry config id :subtype)]
      (. builder subtype data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-studio-component-script-parameter-key-value-property-builder
  "The cfn-studio-component-script-parameter-key-value-property-builder function buildes out new instances of 
CfnStudioComponent$ScriptParameterKeyValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnStudioComponent$ScriptParameterKeyValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-studio-component-shared-file-system-configuration-property-builder
  "The cfn-studio-component-shared-file-system-configuration-property-builder function buildes out new instances of 
CfnStudioComponent$SharedFileSystemConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `linuxMountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:linux-mount-point` |
| `shareName` | java.lang.String | [[cdk.support/lookup-entry]] | `:share-name` |
| `windowsMountDrive` | java.lang.String | [[cdk.support/lookup-entry]] | `:windows-mount-drive` |"
  [stack id config]
  (let [builder (CfnStudioComponent$SharedFileSystemConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :file-system-id)]
      (. builder fileSystemId data))
    (when-let [data (lookup-entry config id :linux-mount-point)]
      (. builder linuxMountPoint data))
    (when-let [data (lookup-entry config id :share-name)]
      (. builder shareName data))
    (when-let [data (lookup-entry config id :windows-mount-drive)]
      (. builder windowsMountDrive data))
    (.build builder)))


(defn cfn-studio-component-studio-component-configuration-property-builder
  "The cfn-studio-component-studio-component-configuration-property-builder function buildes out new instances of 
CfnStudioComponent$StudioComponentConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDirectoryConfiguration` | software.amazon.awscdk.services.nimblestudio.CfnStudioComponent$ActiveDirectoryConfigurationProperty | [[cdk.support/lookup-entry]] | `:active-directory-configuration` |
| `computeFarmConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compute-farm-configuration` |
| `licenseServiceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:license-service-configuration` |
| `sharedFileSystemConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:shared-file-system-configuration` |"
  [stack id config]
  (let [builder (CfnStudioComponent$StudioComponentConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :active-directory-configuration)]
      (. builder activeDirectoryConfiguration data))
    (when-let [data (lookup-entry config id :compute-farm-configuration)]
      (. builder computeFarmConfiguration data))
    (when-let [data (lookup-entry config id :license-service-configuration)]
      (. builder licenseServiceConfiguration data))
    (when-let [data (lookup-entry config id :shared-file-system-configuration)]
      (. builder sharedFileSystemConfiguration data))
    (.build builder)))


(defn cfn-studio-component-studio-component-initialization-script-property-builder
  "The cfn-studio-component-studio-component-initialization-script-property-builder function buildes out new instances of 
CfnStudioComponent$StudioComponentInitializationScriptProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchProfileProtocolVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-profile-protocol-version` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `runContext` | java.lang.String | [[cdk.support/lookup-entry]] | `:run-context` |
| `script` | java.lang.String | [[cdk.support/lookup-entry]] | `:script` |"
  [stack id config]
  (let [builder (CfnStudioComponent$StudioComponentInitializationScriptProperty$Builder.)]
    (when-let [data (lookup-entry config id :launch-profile-protocol-version)]
      (. builder launchProfileProtocolVersion data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :run-context)]
      (. builder runContext data))
    (when-let [data (lookup-entry config id :script)]
      (. builder script data))
    (.build builder)))


(defn cfn-studio-props-builder
  "The cfn-studio-props-builder function buildes out new instances of 
CfnStudioProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-role-arn` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `studioEncryptionConfiguration` | software.amazon.awscdk.services.nimblestudio.CfnStudio$StudioEncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:studio-encryption-configuration` |
| `studioName` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `userRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-role-arn` |"
  [stack id config]
  (let [builder (CfnStudioProps$Builder.)]
    (when-let [data (lookup-entry config id :admin-role-arn)]
      (. builder adminRoleArn data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :studio-encryption-configuration)]
      (. builder studioEncryptionConfiguration data))
    (when-let [data (lookup-entry config id :studio-name)]
      (. builder studioName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-role-arn)]
      (. builder userRoleArn data))
    (.build builder)))


(defn cfn-studio-studio-encryption-configuration-property-builder
  "The cfn-studio-studio-encryption-configuration-property-builder function buildes out new instances of 
CfnStudio$StudioEncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |"
  [stack id config]
  (let [builder (CfnStudio$StudioEncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :key-arn)]
      (. builder keyArn data))
    (when-let [data (lookup-entry config id :key-type)]
      (. builder keyType data))
    (.build builder)))