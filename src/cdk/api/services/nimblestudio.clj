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


(defn cfn-launch-profile-builder>
  "The cfn-launch-profile-builder> function updates a CfnLaunchProfile$Builder instance using the provided configuration.
  The function takes the CfnLaunchProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ec2SubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-subnet-ids` |
| `launchProfileProtocolVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:launch-profile-protocol-versions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `streamConfiguration` | software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile$StreamConfigurationProperty | [[cdk.support/lookup-entry]] | `:stream-configuration` |
| `studioComponentIds` | java.util.List | [[cdk.support/lookup-entry]] | `:studio-component-ids` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLaunchProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :ec2-subnet-ids)]
    (. builder ec2SubnetIds data))
  (when-some [data (lookup-entry config id :launch-profile-protocol-versions)]
    (. builder launchProfileProtocolVersions data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :stream-configuration)]
    (. builder streamConfiguration data))
  (when-some [data (lookup-entry config id :studio-component-ids)]
    (. builder studioComponentIds data))
  (when-some [data (lookup-entry config id :studio-id)]
    (. builder studioId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-launch-profile-builder
  "Creates a  `CfnLaunchProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-launch-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-launch-profile-builder> (CfnLaunchProfile$Builder/create scope (name id)) id config))


(defn cfn-launch-profile-props-builder>
  "The cfn-launch-profile-props-builder> function updates a CfnLaunchProfileProps$Builder instance using the provided configuration.
  The function takes the CfnLaunchProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ec2SubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:ec2-subnet-ids` |
| `launchProfileProtocolVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:launch-profile-protocol-versions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `streamConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stream-configuration` |
| `studioComponentIds` | java.util.List | [[cdk.support/lookup-entry]] | `:studio-component-ids` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLaunchProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :ec2-subnet-ids)]
    (. builder ec2SubnetIds data))
  (when-some [data (lookup-entry config id :launch-profile-protocol-versions)]
    (. builder launchProfileProtocolVersions data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :stream-configuration)]
    (. builder streamConfiguration data))
  (when-some [data (lookup-entry config id :studio-component-ids)]
    (. builder studioComponentIds data))
  (when-some [data (lookup-entry config id :studio-id)]
    (. builder studioId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-launch-profile-props-builder
  "Creates a  `CfnLaunchProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-launch-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-launch-profile-props-builder> (new CfnLaunchProfileProps$Builder) id config))


(defn cfn-launch-profile-stream-configuration-property-builder>
  "The cfn-launch-profile-stream-configuration-property-builder> function updates a CfnLaunchProfile$StreamConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLaunchProfile$StreamConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `volumeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volume-configuration` |
"
  [^CfnLaunchProfile$StreamConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :automatic-termination-mode)]
    (. builder automaticTerminationMode data))
  (when-some [data (lookup-entry config id :clipboard-mode)]
    (. builder clipboardMode data))
  (when-some [data (lookup-entry config id :ec2-instance-types)]
    (. builder ec2InstanceTypes data))
  (when-some [data (lookup-entry config id :max-session-length-in-minutes)]
    (. builder maxSessionLengthInMinutes data))
  (when-some [data (lookup-entry config id :max-stopped-session-length-in-minutes)]
    (. builder maxStoppedSessionLengthInMinutes data))
  (when-some [data (lookup-entry config id :session-backup)]
    (. builder sessionBackup data))
  (when-some [data (lookup-entry config id :session-persistence-mode)]
    (. builder sessionPersistenceMode data))
  (when-some [data (lookup-entry config id :session-storage)]
    (. builder sessionStorage data))
  (when-some [data (lookup-entry config id :streaming-image-ids)]
    (. builder streamingImageIds data))
  (when-some [data (lookup-entry config id :volume-configuration)]
    (. builder volumeConfiguration data))
  (.build builder))


(defn cfn-launch-profile-stream-configuration-property-builder
  "Creates a  `CfnLaunchProfile$StreamConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-launch-profile-stream-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-launch-profile-stream-configuration-property-builder> (new CfnLaunchProfile$StreamConfigurationProperty$Builder) id config))


(defn cfn-launch-profile-stream-configuration-session-backup-property-builder>
  "The cfn-launch-profile-stream-configuration-session-backup-property-builder> function updates a CfnLaunchProfile$StreamConfigurationSessionBackupProperty$Builder instance using the provided configuration.
  The function takes the CfnLaunchProfile$StreamConfigurationSessionBackupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxBackupsToRetain` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-backups-to-retain` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
"
  [^CfnLaunchProfile$StreamConfigurationSessionBackupProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-backups-to-retain)]
    (. builder maxBackupsToRetain data))
  (when-some [data (lookup-entry config id :mode)]
    (. builder mode data))
  (.build builder))


(defn cfn-launch-profile-stream-configuration-session-backup-property-builder
  "Creates a  `CfnLaunchProfile$StreamConfigurationSessionBackupProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-launch-profile-stream-configuration-session-backup-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-launch-profile-stream-configuration-session-backup-property-builder> (new CfnLaunchProfile$StreamConfigurationSessionBackupProperty$Builder) id config))


(defn cfn-launch-profile-stream-configuration-session-storage-property-builder>
  "The cfn-launch-profile-stream-configuration-session-storage-property-builder> function updates a CfnLaunchProfile$StreamConfigurationSessionStorageProperty$Builder instance using the provided configuration.
  The function takes the CfnLaunchProfile$StreamConfigurationSessionStorageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.util.List | [[cdk.support/lookup-entry]] | `:mode` |
| `root` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:root` |
"
  [^CfnLaunchProfile$StreamConfigurationSessionStorageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-some [data (lookup-entry config id :root)]
    (. builder root data))
  (.build builder))


(defn cfn-launch-profile-stream-configuration-session-storage-property-builder
  "Creates a  `CfnLaunchProfile$StreamConfigurationSessionStorageProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-launch-profile-stream-configuration-session-storage-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-launch-profile-stream-configuration-session-storage-property-builder> (new CfnLaunchProfile$StreamConfigurationSessionStorageProperty$Builder) id config))


(defn cfn-launch-profile-streaming-session-storage-root-property-builder>
  "The cfn-launch-profile-streaming-session-storage-root-property-builder> function updates a CfnLaunchProfile$StreamingSessionStorageRootProperty$Builder instance using the provided configuration.
  The function takes the CfnLaunchProfile$StreamingSessionStorageRootProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `linux` | java.lang.String | [[cdk.support/lookup-entry]] | `:linux` |
| `windows` | java.lang.String | [[cdk.support/lookup-entry]] | `:windows` |
"
  [^CfnLaunchProfile$StreamingSessionStorageRootProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :linux)]
    (. builder linux data))
  (when-some [data (lookup-entry config id :windows)]
    (. builder windows data))
  (.build builder))


(defn cfn-launch-profile-streaming-session-storage-root-property-builder
  "Creates a  `CfnLaunchProfile$StreamingSessionStorageRootProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-launch-profile-streaming-session-storage-root-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-launch-profile-streaming-session-storage-root-property-builder> (new CfnLaunchProfile$StreamingSessionStorageRootProperty$Builder) id config))


(defn cfn-launch-profile-volume-configuration-property-builder>
  "The cfn-launch-profile-volume-configuration-property-builder> function updates a CfnLaunchProfile$VolumeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLaunchProfile$VolumeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
"
  [^CfnLaunchProfile$VolumeConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :size)]
    (. builder size data))
  (when-some [data (lookup-entry config id :throughput)]
    (. builder throughput data))
  (.build builder))


(defn cfn-launch-profile-volume-configuration-property-builder
  "Creates a  `CfnLaunchProfile$VolumeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-launch-profile-volume-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-launch-profile-volume-configuration-property-builder> (new CfnLaunchProfile$VolumeConfigurationProperty$Builder) id config))


(defn cfn-streaming-image-builder>
  "The cfn-streaming-image-builder> function updates a CfnStreamingImage$Builder instance using the provided configuration.
  The function takes the CfnStreamingImage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ec2ImageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-image-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamingImage$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :ec2-image-id)]
    (. builder ec2ImageId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :studio-id)]
    (. builder studioId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-streaming-image-builder
  "Creates a  `CfnStreamingImage$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-streaming-image-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-streaming-image-builder> (CfnStreamingImage$Builder/create scope (name id)) id config))


(defn cfn-streaming-image-props-builder>
  "The cfn-streaming-image-props-builder> function updates a CfnStreamingImageProps$Builder instance using the provided configuration.
  The function takes the CfnStreamingImageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ec2ImageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-image-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `studioId` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnStreamingImageProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :ec2-image-id)]
    (. builder ec2ImageId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :studio-id)]
    (. builder studioId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-streaming-image-props-builder
  "Creates a  `CfnStreamingImageProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-streaming-image-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-streaming-image-props-builder> (new CfnStreamingImageProps$Builder) id config))


(defn cfn-streaming-image-streaming-image-encryption-configuration-property-builder>
  "The cfn-streaming-image-streaming-image-encryption-configuration-property-builder> function updates a CfnStreamingImage$StreamingImageEncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStreamingImage$StreamingImageEncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
"
  [^CfnStreamingImage$StreamingImageEncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key-arn)]
    (. builder keyArn data))
  (when-some [data (lookup-entry config id :key-type)]
    (. builder keyType data))
  (.build builder))


(defn cfn-streaming-image-streaming-image-encryption-configuration-property-builder
  "Creates a  `CfnStreamingImage$StreamingImageEncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-streaming-image-streaming-image-encryption-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-streaming-image-streaming-image-encryption-configuration-property-builder> (new CfnStreamingImage$StreamingImageEncryptionConfigurationProperty$Builder) id config))


(defn cfn-studio-builder>
  "The cfn-studio-builder> function updates a CfnStudio$Builder instance using the provided configuration.
  The function takes the CfnStudio$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-role-arn` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `studioEncryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:studio-encryption-configuration` |
| `studioName` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `userRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-role-arn` |
"
  [^CfnStudio$Builder builder id config]
  (when-some [data (lookup-entry config id :admin-role-arn)]
    (. builder adminRoleArn data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :studio-encryption-configuration)]
    (. builder studioEncryptionConfiguration data))
  (when-some [data (lookup-entry config id :studio-name)]
    (. builder studioName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-role-arn)]
    (. builder userRoleArn data))
  (.build builder))


(defn cfn-studio-builder
  "Creates a  `CfnStudio$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-studio-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-studio-builder> (CfnStudio$Builder/create scope (name id)) id config))


(defn cfn-studio-component-active-directory-computer-attribute-property-builder>
  "The cfn-studio-component-active-directory-computer-attribute-property-builder> function updates a CfnStudioComponent$ActiveDirectoryComputerAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnStudioComponent$ActiveDirectoryComputerAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnStudioComponent$ActiveDirectoryComputerAttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-studio-component-active-directory-computer-attribute-property-builder
  "Creates a  `CfnStudioComponent$ActiveDirectoryComputerAttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-studio-component-active-directory-computer-attribute-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-studio-component-active-directory-computer-attribute-property-builder> (new CfnStudioComponent$ActiveDirectoryComputerAttributeProperty$Builder) id config))


(defn cfn-studio-component-active-directory-configuration-property-builder>
  "The cfn-studio-component-active-directory-configuration-property-builder> function updates a CfnStudioComponent$ActiveDirectoryConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStudioComponent$ActiveDirectoryConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `computerAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:computer-attributes` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `organizationalUnitDistinguishedName` | java.lang.String | [[cdk.support/lookup-entry]] | `:organizational-unit-distinguished-name` |
"
  [^CfnStudioComponent$ActiveDirectoryConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :computer-attributes)]
    (. builder computerAttributes data))
  (when-some [data (lookup-entry config id :directory-id)]
    (. builder directoryId data))
  (when-some [data (lookup-entry config id :organizational-unit-distinguished-name)]
    (. builder organizationalUnitDistinguishedName data))
  (.build builder))


(defn cfn-studio-component-active-directory-configuration-property-builder
  "Creates a  `CfnStudioComponent$ActiveDirectoryConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-studio-component-active-directory-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-studio-component-active-directory-configuration-property-builder> (new CfnStudioComponent$ActiveDirectoryConfigurationProperty$Builder) id config))


(defn cfn-studio-component-builder>
  "The cfn-studio-component-builder> function updates a CfnStudioComponent$Builder instance using the provided configuration.
  The function takes the CfnStudioComponent$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnStudioComponent$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :ec2-security-group-ids)]
    (. builder ec2SecurityGroupIds data))
  (when-some [data (lookup-entry config id :initialization-scripts)]
    (. builder initializationScripts data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :runtime-role-arn)]
    (. builder runtimeRoleArn data))
  (when-some [data (lookup-entry config id :script-parameters)]
    (. builder scriptParameters data))
  (when-some [data (lookup-entry config id :secure-initialization-role-arn)]
    (. builder secureInitializationRoleArn data))
  (when-some [data (lookup-entry config id :studio-id)]
    (. builder studioId data))
  (when-some [data (lookup-entry config id :subtype)]
    (. builder subtype data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-studio-component-builder
  "Creates a  `CfnStudioComponent$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-studio-component-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-studio-component-builder> (CfnStudioComponent$Builder/create scope (name id)) id config))


(defn cfn-studio-component-compute-farm-configuration-property-builder>
  "The cfn-studio-component-compute-farm-configuration-property-builder> function updates a CfnStudioComponent$ComputeFarmConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStudioComponent$ComputeFarmConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDirectoryUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:active-directory-user` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
"
  [^CfnStudioComponent$ComputeFarmConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :active-directory-user)]
    (. builder activeDirectoryUser data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (.build builder))


(defn cfn-studio-component-compute-farm-configuration-property-builder
  "Creates a  `CfnStudioComponent$ComputeFarmConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-studio-component-compute-farm-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-studio-component-compute-farm-configuration-property-builder> (new CfnStudioComponent$ComputeFarmConfigurationProperty$Builder) id config))


(defn cfn-studio-component-license-service-configuration-property-builder>
  "The cfn-studio-component-license-service-configuration-property-builder> function updates a CfnStudioComponent$LicenseServiceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStudioComponent$LicenseServiceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
"
  [^CfnStudioComponent$LicenseServiceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (.build builder))


(defn cfn-studio-component-license-service-configuration-property-builder
  "Creates a  `CfnStudioComponent$LicenseServiceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-studio-component-license-service-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-studio-component-license-service-configuration-property-builder> (new CfnStudioComponent$LicenseServiceConfigurationProperty$Builder) id config))


(defn cfn-studio-component-props-builder>
  "The cfn-studio-component-props-builder> function updates a CfnStudioComponentProps$Builder instance using the provided configuration.
  The function takes the CfnStudioComponentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnStudioComponentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :ec2-security-group-ids)]
    (. builder ec2SecurityGroupIds data))
  (when-some [data (lookup-entry config id :initialization-scripts)]
    (. builder initializationScripts data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :runtime-role-arn)]
    (. builder runtimeRoleArn data))
  (when-some [data (lookup-entry config id :script-parameters)]
    (. builder scriptParameters data))
  (when-some [data (lookup-entry config id :secure-initialization-role-arn)]
    (. builder secureInitializationRoleArn data))
  (when-some [data (lookup-entry config id :studio-id)]
    (. builder studioId data))
  (when-some [data (lookup-entry config id :subtype)]
    (. builder subtype data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-studio-component-props-builder
  "Creates a  `CfnStudioComponentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-studio-component-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-studio-component-props-builder> (new CfnStudioComponentProps$Builder) id config))


(defn cfn-studio-component-script-parameter-key-value-property-builder>
  "The cfn-studio-component-script-parameter-key-value-property-builder> function updates a CfnStudioComponent$ScriptParameterKeyValueProperty$Builder instance using the provided configuration.
  The function takes the CfnStudioComponent$ScriptParameterKeyValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnStudioComponent$ScriptParameterKeyValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-studio-component-script-parameter-key-value-property-builder
  "Creates a  `CfnStudioComponent$ScriptParameterKeyValueProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-studio-component-script-parameter-key-value-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-studio-component-script-parameter-key-value-property-builder> (new CfnStudioComponent$ScriptParameterKeyValueProperty$Builder) id config))


(defn cfn-studio-component-shared-file-system-configuration-property-builder>
  "The cfn-studio-component-shared-file-system-configuration-property-builder> function updates a CfnStudioComponent$SharedFileSystemConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStudioComponent$SharedFileSystemConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `fileSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:file-system-id` |
| `linuxMountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:linux-mount-point` |
| `shareName` | java.lang.String | [[cdk.support/lookup-entry]] | `:share-name` |
| `windowsMountDrive` | java.lang.String | [[cdk.support/lookup-entry]] | `:windows-mount-drive` |
"
  [^CfnStudioComponent$SharedFileSystemConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :file-system-id)]
    (. builder fileSystemId data))
  (when-some [data (lookup-entry config id :linux-mount-point)]
    (. builder linuxMountPoint data))
  (when-some [data (lookup-entry config id :share-name)]
    (. builder shareName data))
  (when-some [data (lookup-entry config id :windows-mount-drive)]
    (. builder windowsMountDrive data))
  (.build builder))


(defn cfn-studio-component-shared-file-system-configuration-property-builder
  "Creates a  `CfnStudioComponent$SharedFileSystemConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-studio-component-shared-file-system-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-studio-component-shared-file-system-configuration-property-builder> (new CfnStudioComponent$SharedFileSystemConfigurationProperty$Builder) id config))


(defn cfn-studio-component-studio-component-configuration-property-builder>
  "The cfn-studio-component-studio-component-configuration-property-builder> function updates a CfnStudioComponent$StudioComponentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStudioComponent$StudioComponentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `activeDirectoryConfiguration` | software.amazon.awscdk.services.nimblestudio.CfnStudioComponent$ActiveDirectoryConfigurationProperty | [[cdk.support/lookup-entry]] | `:active-directory-configuration` |
| `computeFarmConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:compute-farm-configuration` |
| `licenseServiceConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:license-service-configuration` |
| `sharedFileSystemConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:shared-file-system-configuration` |
"
  [^CfnStudioComponent$StudioComponentConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :active-directory-configuration)]
    (. builder activeDirectoryConfiguration data))
  (when-some [data (lookup-entry config id :compute-farm-configuration)]
    (. builder computeFarmConfiguration data))
  (when-some [data (lookup-entry config id :license-service-configuration)]
    (. builder licenseServiceConfiguration data))
  (when-some [data (lookup-entry config id :shared-file-system-configuration)]
    (. builder sharedFileSystemConfiguration data))
  (.build builder))


(defn cfn-studio-component-studio-component-configuration-property-builder
  "Creates a  `CfnStudioComponent$StudioComponentConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-studio-component-studio-component-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-studio-component-studio-component-configuration-property-builder> (new CfnStudioComponent$StudioComponentConfigurationProperty$Builder) id config))


(defn cfn-studio-component-studio-component-initialization-script-property-builder>
  "The cfn-studio-component-studio-component-initialization-script-property-builder> function updates a CfnStudioComponent$StudioComponentInitializationScriptProperty$Builder instance using the provided configuration.
  The function takes the CfnStudioComponent$StudioComponentInitializationScriptProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchProfileProtocolVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-profile-protocol-version` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `runContext` | java.lang.String | [[cdk.support/lookup-entry]] | `:run-context` |
| `script` | java.lang.String | [[cdk.support/lookup-entry]] | `:script` |
"
  [^CfnStudioComponent$StudioComponentInitializationScriptProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :launch-profile-protocol-version)]
    (. builder launchProfileProtocolVersion data))
  (when-some [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-some [data (lookup-entry config id :run-context)]
    (. builder runContext data))
  (when-some [data (lookup-entry config id :script)]
    (. builder script data))
  (.build builder))


(defn cfn-studio-component-studio-component-initialization-script-property-builder
  "Creates a  `CfnStudioComponent$StudioComponentInitializationScriptProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-studio-component-studio-component-initialization-script-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-studio-component-studio-component-initialization-script-property-builder> (new CfnStudioComponent$StudioComponentInitializationScriptProperty$Builder) id config))


(defn cfn-studio-props-builder>
  "The cfn-studio-props-builder> function updates a CfnStudioProps$Builder instance using the provided configuration.
  The function takes the CfnStudioProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-role-arn` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `studioEncryptionConfiguration` | software.amazon.awscdk.services.nimblestudio.CfnStudio$StudioEncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:studio-encryption-configuration` |
| `studioName` | java.lang.String | [[cdk.support/lookup-entry]] | `:studio-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `userRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-role-arn` |
"
  [^CfnStudioProps$Builder builder id config]
  (when-some [data (lookup-entry config id :admin-role-arn)]
    (. builder adminRoleArn data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :studio-encryption-configuration)]
    (. builder studioEncryptionConfiguration data))
  (when-some [data (lookup-entry config id :studio-name)]
    (. builder studioName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-role-arn)]
    (. builder userRoleArn data))
  (.build builder))


(defn cfn-studio-props-builder
  "Creates a  `CfnStudioProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-studio-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-studio-props-builder> (new CfnStudioProps$Builder) id config))


(defn cfn-studio-studio-encryption-configuration-property-builder>
  "The cfn-studio-studio-encryption-configuration-property-builder> function updates a CfnStudio$StudioEncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStudio$StudioEncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-arn` |
| `keyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-type` |
"
  [^CfnStudio$StudioEncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key-arn)]
    (. builder keyArn data))
  (when-some [data (lookup-entry config id :key-type)]
    (. builder keyType data))
  (.build builder))


(defn cfn-studio-studio-encryption-configuration-property-builder
  "Creates a  `CfnStudio$StudioEncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-studio-studio-encryption-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-studio-studio-encryption-configuration-property-builder> (new CfnStudio$StudioEncryptionConfigurationProperty$Builder) id config))