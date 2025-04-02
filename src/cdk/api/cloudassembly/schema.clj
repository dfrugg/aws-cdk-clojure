(ns cdk.api.cloudassembly.schema
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.cloudassembly.schema package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.cloudassembly.schema AmiContextQuery$Builder
                                                        ArtifactManifest$Builder
                                                        ArtifactMetadataEntryType
                                                        ArtifactType
                                                        AssemblyManifest$Builder
                                                        AssetManifest$Builder
                                                        AssetManifestOptions$Builder
                                                        AssetManifestProperties$Builder
                                                        AvailabilityZonesContextQuery$Builder
                                                        AwsCloudFormationStackProperties$Builder
                                                        AwsDestination$Builder
                                                        BootstrapRole$Builder
                                                        CdkCommand$Builder
                                                        CdkCommands$Builder
                                                        ContainerImageAssetCacheOption$Builder
                                                        ContainerImageAssetMetadataEntry$Builder
                                                        ContextProvider
                                                        DefaultCdkOptions$Builder
                                                        DeployCommand$Builder
                                                        DeployOptions$Builder
                                                        DestroyCommand$Builder
                                                        DestroyOptions$Builder
                                                        DockerCacheOption$Builder
                                                        DockerImageAsset$Builder
                                                        DockerImageDestination$Builder
                                                        DockerImageSource$Builder
                                                        EndpointServiceAvailabilityZonesContextQuery$Builder
                                                        FileAsset$Builder
                                                        FileAssetMetadataEntry$Builder
                                                        FileAssetPackaging
                                                        FileDestination$Builder
                                                        FileSource$Builder
                                                        Hooks$Builder
                                                        HostedZoneContextQuery$Builder
                                                        IntegManifest$Builder
                                                        KeyContextQuery$Builder
                                                        LoadBalancerContextQuery$Builder
                                                        LoadBalancerFilter$Builder
                                                        LoadBalancerListenerContextQuery$Builder
                                                        LoadBalancerListenerProtocol
                                                        LoadBalancerType
                                                        LoadManifestOptions$Builder
                                                        MetadataEntry$Builder
                                                        MissingContext$Builder
                                                        NestedCloudAssemblyProperties$Builder
                                                        PluginContextQuery$Builder
                                                        RequireApproval
                                                        RuntimeInfo$Builder
                                                        SSMParameterContextQuery$Builder
                                                        SecurityGroupContextQuery$Builder
                                                        Tag$Builder
                                                        TestCase$Builder
                                                        TestOptions$Builder
                                                        TreeArtifactProperties$Builder
                                                        VpcContextQuery$Builder]))


(defn artifact-metadata-entry-type
  "The `artifact-metadata-entry-type` function data interprets values in the provided config data into a 
`ArtifactMetadataEntryType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ArtifactMetadataEntryType` - the value is returned.
* is `:logical-id` - `ArtifactMetadataEntryType/LOGICAL_ID` is returned
* is `:info` - `ArtifactMetadataEntryType/INFO` is returned
* is `:error` - `ArtifactMetadataEntryType/ERROR` is returned
* is `:warn` - `ArtifactMetadataEntryType/WARN` is returned
* is `:asset` - `ArtifactMetadataEntryType/ASSET` is returned
* is `:stack-tags` - `ArtifactMetadataEntryType/STACK_TAGS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ArtifactMetadataEntryType data) data
      (= :logical-id data) ArtifactMetadataEntryType/LOGICAL_ID
      (= :info data) ArtifactMetadataEntryType/INFO
      (= :error data) ArtifactMetadataEntryType/ERROR
      (= :warn data) ArtifactMetadataEntryType/WARN
      (= :asset data) ArtifactMetadataEntryType/ASSET
      (= :stack-tags data) ArtifactMetadataEntryType/STACK_TAGS)))


(defn artifact-type
  "The `artifact-type` function data interprets values in the provided config data into a 
`ArtifactType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ArtifactType` - the value is returned.
* is `:cdk-tree` - `ArtifactType/CDK_TREE` is returned
* is `:aws-cloudformation-stack` - `ArtifactType/AWS_CLOUDFORMATION_STACK` is returned
* is `:asset-manifest` - `ArtifactType/ASSET_MANIFEST` is returned
* is `:none` - `ArtifactType/NONE` is returned
* is `:nested-cloud-assembly` - `ArtifactType/NESTED_CLOUD_ASSEMBLY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ArtifactType data) data
      (= :cdk-tree data) ArtifactType/CDK_TREE
      (= :aws-cloudformation-stack data) ArtifactType/AWS_CLOUDFORMATION_STACK
      (= :asset-manifest data) ArtifactType/ASSET_MANIFEST
      (= :none data) ArtifactType/NONE
      (= :nested-cloud-assembly data) ArtifactType/NESTED_CLOUD_ASSEMBLY)))


(defn context-provider
  "The `context-provider` function data interprets values in the provided config data into a 
`ContextProvider` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ContextProvider` - the value is returned.
* is `:vpc-provider` - `ContextProvider/VPC_PROVIDER` is returned
* is `:hosted-zone-provider` - `ContextProvider/HOSTED_ZONE_PROVIDER` is returned
* is `:key-provider` - `ContextProvider/KEY_PROVIDER` is returned
* is `:load-balancer-listener-provider` - `ContextProvider/LOAD_BALANCER_LISTENER_PROVIDER` is returned
* is `:security-group-provider` - `ContextProvider/SECURITY_GROUP_PROVIDER` is returned
* is `:endpoint-service-availability-zone-provider` - `ContextProvider/ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER` is returned
* is `:ami-provider` - `ContextProvider/AMI_PROVIDER` is returned
* is `:plugin` - `ContextProvider/PLUGIN` is returned
* is `:availability-zone-provider` - `ContextProvider/AVAILABILITY_ZONE_PROVIDER` is returned
* is `:ssm-parameter-provider` - `ContextProvider/SSM_PARAMETER_PROVIDER` is returned
* is `:load-balancer-provider` - `ContextProvider/LOAD_BALANCER_PROVIDER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ContextProvider data) data
      (= :vpc-provider data) ContextProvider/VPC_PROVIDER
      (= :hosted-zone-provider data) ContextProvider/HOSTED_ZONE_PROVIDER
      (= :key-provider data) ContextProvider/KEY_PROVIDER
      (= :load-balancer-listener-provider data) ContextProvider/LOAD_BALANCER_LISTENER_PROVIDER
      (= :security-group-provider data) ContextProvider/SECURITY_GROUP_PROVIDER
      (= :endpoint-service-availability-zone-provider data) ContextProvider/ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER
      (= :ami-provider data) ContextProvider/AMI_PROVIDER
      (= :plugin data) ContextProvider/PLUGIN
      (= :availability-zone-provider data) ContextProvider/AVAILABILITY_ZONE_PROVIDER
      (= :ssm-parameter-provider data) ContextProvider/SSM_PARAMETER_PROVIDER
      (= :load-balancer-provider data) ContextProvider/LOAD_BALANCER_PROVIDER)))


(defn file-asset-packaging
  "The `file-asset-packaging` function data interprets values in the provided config data into a 
`FileAssetPackaging` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `FileAssetPackaging` - the value is returned.
* is `:file` - `FileAssetPackaging/FILE` is returned
* is `:zip-directory` - `FileAssetPackaging/ZIP_DIRECTORY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? FileAssetPackaging data) data
      (= :file data) FileAssetPackaging/FILE
      (= :zip-directory data) FileAssetPackaging/ZIP_DIRECTORY)))


(defn load-balancer-listener-protocol
  "The `load-balancer-listener-protocol` function data interprets values in the provided config data into a 
`LoadBalancerListenerProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LoadBalancerListenerProtocol` - the value is returned.
* is `:http` - `LoadBalancerListenerProtocol/HTTP` is returned
* is `:tls` - `LoadBalancerListenerProtocol/TLS` is returned
* is `:udp` - `LoadBalancerListenerProtocol/UDP` is returned
* is `:https` - `LoadBalancerListenerProtocol/HTTPS` is returned
* is `:tcp` - `LoadBalancerListenerProtocol/TCP` is returned
* is `:tcp-udp` - `LoadBalancerListenerProtocol/TCP_UDP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LoadBalancerListenerProtocol data) data
      (= :http data) LoadBalancerListenerProtocol/HTTP
      (= :tls data) LoadBalancerListenerProtocol/TLS
      (= :udp data) LoadBalancerListenerProtocol/UDP
      (= :https data) LoadBalancerListenerProtocol/HTTPS
      (= :tcp data) LoadBalancerListenerProtocol/TCP
      (= :tcp-udp data) LoadBalancerListenerProtocol/TCP_UDP)))


(defn load-balancer-type
  "The `load-balancer-type` function data interprets values in the provided config data into a 
`LoadBalancerType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LoadBalancerType` - the value is returned.
* is `:network` - `LoadBalancerType/NETWORK` is returned
* is `:application` - `LoadBalancerType/APPLICATION` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LoadBalancerType data) data
      (= :network data) LoadBalancerType/NETWORK
      (= :application data) LoadBalancerType/APPLICATION)))


(defn require-approval
  "The `require-approval` function data interprets values in the provided config data into a 
`RequireApproval` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RequireApproval` - the value is returned.
* is `:anychange` - `RequireApproval/ANYCHANGE` is returned
* is `:broadening` - `RequireApproval/BROADENING` is returned
* is `:never` - `RequireApproval/NEVER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RequireApproval data) data
      (= :anychange data) RequireApproval/ANYCHANGE
      (= :broadening data) RequireApproval/BROADENING
      (= :never data) RequireApproval/NEVER)))


(defn ami-context-query-builder>
  "The ami-context-query-builder> function updates a AmiContextQuery$Builder instance using the provided configuration.
  The function takes the AmiContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `filters` | java.util.Map | [[cdk.support/lookup-entry]] | `:filters` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `owners` | java.util.List | [[cdk.support/lookup-entry]] | `:owners` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^AmiContextQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :owners)]
    (. builder owners data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn ami-context-query-builder
  "Creates a  `AmiContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ami-context-query-builder> (new AmiContextQuery$Builder) id config))


(defn artifact-manifest-builder>
  "The artifact-manifest-builder> function updates a ArtifactManifest$Builder instance using the provided configuration.
  The function takes the ArtifactManifest$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dependencies` | java.util.List | [[cdk.support/lookup-entry]] | `:dependencies` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `properties` | software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | software.amazon.awscdk.cloudassembly.schema.ArtifactType | [[cdk.api.cloudassembly.schema/artifact-type]] | `:type` |
"
  [^ArtifactManifest$Builder builder id config]
  (when-some [data (lookup-entry config id :dependencies)]
    (. builder dependencies data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (artifact-type config id :type)]
    (. builder type data))
  (.build builder))


(defn artifact-manifest-builder
  "Creates a  `ArtifactManifest$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (artifact-manifest-builder> (new ArtifactManifest$Builder) id config))


(defn assembly-manifest-builder>
  "The assembly-manifest-builder> function updates a AssemblyManifest$Builder instance using the provided configuration.
  The function takes the AssemblyManifest$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifacts` | java.util.Map | [[cdk.support/lookup-entry]] | `:artifacts` |
| `missing` | java.util.List | [[cdk.support/lookup-entry]] | `:missing` |
| `runtime` | software.amazon.awscdk.cloudassembly.schema.RuntimeInfo | [[cdk.support/lookup-entry]] | `:runtime` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^AssemblyManifest$Builder builder id config]
  (when-some [data (lookup-entry config id :artifacts)]
    (. builder artifacts data))
  (when-some [data (lookup-entry config id :missing)]
    (. builder missing data))
  (when-some [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn assembly-manifest-builder
  "Creates a  `AssemblyManifest$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (assembly-manifest-builder> (new AssemblyManifest$Builder) id config))


(defn asset-manifest-builder>
  "The asset-manifest-builder> function updates a AssetManifest$Builder instance using the provided configuration.
  The function takes the AssetManifest$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dockerImages` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-images` |
| `files` | java.util.Map | [[cdk.support/lookup-entry]] | `:files` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^AssetManifest$Builder builder id config]
  (when-some [data (lookup-entry config id :docker-images)]
    (. builder dockerImages data))
  (when-some [data (lookup-entry config id :files)]
    (. builder files data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn asset-manifest-builder
  "Creates a  `AssetManifest$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (asset-manifest-builder> (new AssetManifest$Builder) id config))


(defn asset-manifest-options-builder>
  "The asset-manifest-options-builder> function updates a AssetManifestOptions$Builder instance using the provided configuration.
  The function takes the AssetManifestOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bootstrapStackVersionSsmParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:bootstrap-stack-version-ssm-parameter` |
| `requiresBootstrapStackVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:requires-bootstrap-stack-version` |
"
  [^AssetManifestOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :bootstrap-stack-version-ssm-parameter)]
    (. builder bootstrapStackVersionSsmParameter data))
  (when-some [data (lookup-entry config id :requires-bootstrap-stack-version)]
    (. builder requiresBootstrapStackVersion data))
  (.build builder))


(defn asset-manifest-options-builder
  "Creates a  `AssetManifestOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (asset-manifest-options-builder> (new AssetManifestOptions$Builder) id config))


(defn asset-manifest-properties-builder>
  "The asset-manifest-properties-builder> function updates a AssetManifestProperties$Builder instance using the provided configuration.
  The function takes the AssetManifestProperties$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bootstrapStackVersionSsmParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:bootstrap-stack-version-ssm-parameter` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `requiresBootstrapStackVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:requires-bootstrap-stack-version` |
"
  [^AssetManifestProperties$Builder builder id config]
  (when-some [data (lookup-entry config id :bootstrap-stack-version-ssm-parameter)]
    (. builder bootstrapStackVersionSsmParameter data))
  (when-some [data (lookup-entry config id :file)]
    (. builder file data))
  (when-some [data (lookup-entry config id :requires-bootstrap-stack-version)]
    (. builder requiresBootstrapStackVersion data))
  (.build builder))


(defn asset-manifest-properties-builder
  "Creates a  `AssetManifestProperties$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (asset-manifest-properties-builder> (new AssetManifestProperties$Builder) id config))


(defn availability-zones-context-query-builder>
  "The availability-zones-context-query-builder> function updates a AvailabilityZonesContextQuery$Builder instance using the provided configuration.
  The function takes the AvailabilityZonesContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^AvailabilityZonesContextQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn availability-zones-context-query-builder
  "Creates a  `AvailabilityZonesContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (availability-zones-context-query-builder> (new AvailabilityZonesContextQuery$Builder) id config))


(defn aws-cloud-formation-stack-properties-builder>
  "The aws-cloud-formation-stack-properties-builder> function updates a AwsCloudFormationStackProperties$Builder instance using the provided configuration.
  The function takes the AwsCloudFormationStackProperties$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-arn` |
| `assumeRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-external-id` |
| `bootstrapStackVersionSsmParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:bootstrap-stack-version-ssm-parameter` |
| `cloudFormationExecutionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-formation-execution-role-arn` |
| `lookupRole` | software.amazon.awscdk.cloudassembly.schema.BootstrapRole | [[cdk.support/lookup-entry]] | `:lookup-role` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `requiresBootstrapStackVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:requires-bootstrap-stack-version` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `stackTemplateAssetObjectUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-template-asset-object-url` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `templateFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-file` |
| `terminationProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protection` |
| `validateOnSynth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:validate-on-synth` |
"
  [^AwsCloudFormationStackProperties$Builder builder id config]
  (when-some [data (lookup-entry config id :assume-role-arn)]
    (. builder assumeRoleArn data))
  (when-some [data (lookup-entry config id :assume-role-external-id)]
    (. builder assumeRoleExternalId data))
  (when-some [data (lookup-entry config id :bootstrap-stack-version-ssm-parameter)]
    (. builder bootstrapStackVersionSsmParameter data))
  (when-some [data (lookup-entry config id :cloud-formation-execution-role-arn)]
    (. builder cloudFormationExecutionRoleArn data))
  (when-some [data (lookup-entry config id :lookup-role)]
    (. builder lookupRole data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :requires-bootstrap-stack-version)]
    (. builder requiresBootstrapStackVersion data))
  (when-some [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-some [data (lookup-entry config id :stack-template-asset-object-url)]
    (. builder stackTemplateAssetObjectUrl data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-file)]
    (. builder templateFile data))
  (when-some [data (lookup-entry config id :termination-protection)]
    (. builder terminationProtection data))
  (when-some [data (lookup-entry config id :validate-on-synth)]
    (. builder validateOnSynth data))
  (.build builder))


(defn aws-cloud-formation-stack-properties-builder
  "Creates a  `AwsCloudFormationStackProperties$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (aws-cloud-formation-stack-properties-builder> (new AwsCloudFormationStackProperties$Builder) id config))


(defn aws-destination-builder>
  "The aws-destination-builder> function updates a AwsDestination$Builder instance using the provided configuration.
  The function takes the AwsDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-arn` |
| `assumeRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-external-id` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^AwsDestination$Builder builder id config]
  (when-some [data (lookup-entry config id :assume-role-arn)]
    (. builder assumeRoleArn data))
  (when-some [data (lookup-entry config id :assume-role-external-id)]
    (. builder assumeRoleExternalId data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn aws-destination-builder
  "Creates a  `AwsDestination$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (aws-destination-builder> (new AwsDestination$Builder) id config))


(defn bootstrap-role-builder>
  "The bootstrap-role-builder> function updates a BootstrapRole$Builder instance using the provided configuration.
  The function takes the BootstrapRole$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `assumeRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-external-id` |
| `bootstrapStackVersionSsmParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:bootstrap-stack-version-ssm-parameter` |
| `requiresBootstrapStackVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:requires-bootstrap-stack-version` |
"
  [^BootstrapRole$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :assume-role-external-id)]
    (. builder assumeRoleExternalId data))
  (when-some [data (lookup-entry config id :bootstrap-stack-version-ssm-parameter)]
    (. builder bootstrapStackVersionSsmParameter data))
  (when-some [data (lookup-entry config id :requires-bootstrap-stack-version)]
    (. builder requiresBootstrapStackVersion data))
  (.build builder))


(defn bootstrap-role-builder
  "Creates a  `BootstrapRole$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (bootstrap-role-builder> (new BootstrapRole$Builder) id config))


(defn cdk-command-builder>
  "The cdk-command-builder> function updates a CdkCommand$Builder instance using the provided configuration.
  The function takes the CdkCommand$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `expectError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:expect-error` |
| `expectedMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:expected-message` |
"
  [^CdkCommand$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :expect-error)]
    (. builder expectError data))
  (when-some [data (lookup-entry config id :expected-message)]
    (. builder expectedMessage data))
  (.build builder))


(defn cdk-command-builder
  "Creates a  `CdkCommand$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cdk-command-builder> (new CdkCommand$Builder) id config))


(defn cdk-commands-builder>
  "The cdk-commands-builder> function updates a CdkCommands$Builder instance using the provided configuration.
  The function takes the CdkCommands$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deploy` | software.amazon.awscdk.cloudassembly.schema.DeployCommand | [[cdk.support/lookup-entry]] | `:deploy` |
| `destroy` | software.amazon.awscdk.cloudassembly.schema.DestroyCommand | [[cdk.support/lookup-entry]] | `:destroy` |
"
  [^CdkCommands$Builder builder id config]
  (when-some [data (lookup-entry config id :deploy)]
    (. builder deploy data))
  (when-some [data (lookup-entry config id :destroy)]
    (. builder destroy data))
  (.build builder))


(defn cdk-commands-builder
  "Creates a  `CdkCommands$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cdk-commands-builder> (new CdkCommands$Builder) id config))


(defn container-image-asset-cache-option-builder>
  "The container-image-asset-cache-option-builder> function updates a ContainerImageAssetCacheOption$Builder instance using the provided configuration.
  The function takes the ContainerImageAssetCacheOption$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `params` | java.util.Map | [[cdk.support/lookup-entry]] | `:params` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^ContainerImageAssetCacheOption$Builder builder id config]
  (when-some [data (lookup-entry config id :params)]
    (. builder params data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn container-image-asset-cache-option-builder
  "Creates a  `ContainerImageAssetCacheOption$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (container-image-asset-cache-option-builder> (new ContainerImageAssetCacheOption$Builder) id config))


(defn container-image-asset-metadata-entry-builder>
  "The container-image-asset-metadata-entry-builder> function updates a ContainerImageAssetMetadataEntry$Builder instance using the provided configuration.
  The function takes the ContainerImageAssetMetadataEntry$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `buildSecrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-secrets` |
| `buildSsh` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-ssh` |
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `networkMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-mode` |
| `outputs` | java.util.List | [[cdk.support/lookup-entry]] | `:outputs` |
| `packaging` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `sourceHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-hash` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^ContainerImageAssetMetadataEntry$Builder builder id config]
  (when-some [data (lookup-entry config id :build-args)]
    (. builder buildArgs data))
  (when-some [data (lookup-entry config id :build-secrets)]
    (. builder buildSecrets data))
  (when-some [data (lookup-entry config id :build-ssh)]
    (. builder buildSsh data))
  (when-some [data (lookup-entry config id :cache-disabled)]
    (. builder cacheDisabled data))
  (when-some [data (lookup-entry config id :cache-from)]
    (. builder cacheFrom data))
  (when-some [data (lookup-entry config id :cache-to)]
    (. builder cacheTo data))
  (when-some [data (lookup-entry config id :file)]
    (. builder file data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :image-tag)]
    (. builder imageTag data))
  (when-some [data (lookup-entry config id :network-mode)]
    (. builder networkMode data))
  (when-some [data (lookup-entry config id :outputs)]
    (. builder outputs data))
  (when-some [data (lookup-entry config id :packaging)]
    (. builder packaging data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (when-some [data (lookup-entry config id :source-hash)]
    (. builder sourceHash data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn container-image-asset-metadata-entry-builder
  "Creates a  `ContainerImageAssetMetadataEntry$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (container-image-asset-metadata-entry-builder> (new ContainerImageAssetMetadataEntry$Builder) id config))


(defn default-cdk-options-builder>
  "The default-cdk-options-builder> function updates a DefaultCdkOptions$Builder instance using the provided configuration.
  The function takes the DefaultCdkOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:all` |
| `app` | java.lang.String | [[cdk.support/lookup-entry]] | `:app` |
| `assetMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:asset-metadata` |
| `caBundlePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-bundle-path` |
| `color` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:color` |
| `context` | java.util.Map | [[cdk.support/lookup-entry]] | `:context` |
| `debug` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:debug` |
| `ec2Creds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ec2-creds` |
| `ignoreErrors` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-errors` |
| `json` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:json` |
| `lookups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lookups` |
| `notices` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:notices` |
| `output` | java.lang.String | [[cdk.support/lookup-entry]] | `:output` |
| `pathMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:path-metadata` |
| `profile` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile` |
| `proxy` | java.lang.String | [[cdk.support/lookup-entry]] | `:proxy` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stacks` | java.util.List | [[cdk.support/lookup-entry]] | `:stacks` |
| `staging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:staging` |
| `strict` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:strict` |
| `trace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:trace` |
| `verbose` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:verbose` |
| `versionReporting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:version-reporting` |
"
  [^DefaultCdkOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :all)]
    (. builder all data))
  (when-some [data (lookup-entry config id :app)]
    (. builder app data))
  (when-some [data (lookup-entry config id :asset-metadata)]
    (. builder assetMetadata data))
  (when-some [data (lookup-entry config id :ca-bundle-path)]
    (. builder caBundlePath data))
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (lookup-entry config id :context)]
    (. builder context data))
  (when-some [data (lookup-entry config id :debug)]
    (. builder debug data))
  (when-some [data (lookup-entry config id :ec2-creds)]
    (. builder ec2Creds data))
  (when-some [data (lookup-entry config id :ignore-errors)]
    (. builder ignoreErrors data))
  (when-some [data (lookup-entry config id :json)]
    (. builder json data))
  (when-some [data (lookup-entry config id :lookups)]
    (. builder lookups data))
  (when-some [data (lookup-entry config id :notices)]
    (. builder notices data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :path-metadata)]
    (. builder pathMetadata data))
  (when-some [data (lookup-entry config id :profile)]
    (. builder profile data))
  (when-some [data (lookup-entry config id :proxy)]
    (. builder proxy data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :stacks)]
    (. builder stacks data))
  (when-some [data (lookup-entry config id :staging)]
    (. builder staging data))
  (when-some [data (lookup-entry config id :strict)]
    (. builder strict data))
  (when-some [data (lookup-entry config id :trace)]
    (. builder trace data))
  (when-some [data (lookup-entry config id :verbose)]
    (. builder verbose data))
  (when-some [data (lookup-entry config id :version-reporting)]
    (. builder versionReporting data))
  (.build builder))


(defn default-cdk-options-builder
  "Creates a  `DefaultCdkOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (default-cdk-options-builder> (new DefaultCdkOptions$Builder) id config))


(defn deploy-command-builder>
  "The deploy-command-builder> function updates a DeployCommand$Builder instance using the provided configuration.
  The function takes the DeployCommand$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | software.amazon.awscdk.cloudassembly.schema.DeployOptions | [[cdk.support/lookup-entry]] | `:args` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `expectError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:expect-error` |
| `expectedMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:expected-message` |
"
  [^DeployCommand$Builder builder id config]
  (when-some [data (lookup-entry config id :args)]
    (. builder args data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :expect-error)]
    (. builder expectError data))
  (when-some [data (lookup-entry config id :expected-message)]
    (. builder expectedMessage data))
  (.build builder))


(defn deploy-command-builder
  "Creates a  `DeployCommand$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (deploy-command-builder> (new DeployCommand$Builder) id config))


(defn deploy-options-builder>
  "The deploy-options-builder> function updates a DeployOptions$Builder instance using the provided configuration.
  The function takes the DeployOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:all` |
| `app` | java.lang.String | [[cdk.support/lookup-entry]] | `:app` |
| `assetMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:asset-metadata` |
| `caBundlePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-bundle-path` |
| `changeSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:change-set-name` |
| `ci` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ci` |
| `color` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:color` |
| `concurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrency` |
| `context` | java.util.Map | [[cdk.support/lookup-entry]] | `:context` |
| `debug` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:debug` |
| `ec2Creds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ec2-creds` |
| `exclusively` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclusively` |
| `execute` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:execute` |
| `force` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force` |
| `ignoreErrors` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-errors` |
| `json` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:json` |
| `lookups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lookups` |
| `notices` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:notices` |
| `notificationArns` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-arns` |
| `output` | java.lang.String | [[cdk.support/lookup-entry]] | `:output` |
| `outputsFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:outputs-file` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `pathMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:path-metadata` |
| `profile` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile` |
| `proxy` | java.lang.String | [[cdk.support/lookup-entry]] | `:proxy` |
| `requireApproval` | software.amazon.awscdk.cloudassembly.schema.RequireApproval | [[cdk.api.cloudassembly.schema/require-approval]] | `:require-approval` |
| `reuseAssets` | java.util.List | [[cdk.support/lookup-entry]] | `:reuse-assets` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `rollback` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rollback` |
| `stacks` | java.util.List | [[cdk.support/lookup-entry]] | `:stacks` |
| `staging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:staging` |
| `strict` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:strict` |
| `toolkitStackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:toolkit-stack-name` |
| `trace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:trace` |
| `usePreviousParameters` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-previous-parameters` |
| `verbose` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:verbose` |
| `versionReporting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:version-reporting` |
"
  [^DeployOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :all)]
    (. builder all data))
  (when-some [data (lookup-entry config id :app)]
    (. builder app data))
  (when-some [data (lookup-entry config id :asset-metadata)]
    (. builder assetMetadata data))
  (when-some [data (lookup-entry config id :ca-bundle-path)]
    (. builder caBundlePath data))
  (when-some [data (lookup-entry config id :change-set-name)]
    (. builder changeSetName data))
  (when-some [data (lookup-entry config id :ci)]
    (. builder ci data))
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (lookup-entry config id :concurrency)]
    (. builder concurrency data))
  (when-some [data (lookup-entry config id :context)]
    (. builder context data))
  (when-some [data (lookup-entry config id :debug)]
    (. builder debug data))
  (when-some [data (lookup-entry config id :ec2-creds)]
    (. builder ec2Creds data))
  (when-some [data (lookup-entry config id :exclusively)]
    (. builder exclusively data))
  (when-some [data (lookup-entry config id :execute)]
    (. builder execute data))
  (when-some [data (lookup-entry config id :force)]
    (. builder force data))
  (when-some [data (lookup-entry config id :ignore-errors)]
    (. builder ignoreErrors data))
  (when-some [data (lookup-entry config id :json)]
    (. builder json data))
  (when-some [data (lookup-entry config id :lookups)]
    (. builder lookups data))
  (when-some [data (lookup-entry config id :notices)]
    (. builder notices data))
  (when-some [data (lookup-entry config id :notification-arns)]
    (. builder notificationArns data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :outputs-file)]
    (. builder outputsFile data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :path-metadata)]
    (. builder pathMetadata data))
  (when-some [data (lookup-entry config id :profile)]
    (. builder profile data))
  (when-some [data (lookup-entry config id :proxy)]
    (. builder proxy data))
  (when-some [data (require-approval config id :require-approval)]
    (. builder requireApproval data))
  (when-some [data (lookup-entry config id :reuse-assets)]
    (. builder reuseAssets data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :rollback)]
    (. builder rollback data))
  (when-some [data (lookup-entry config id :stacks)]
    (. builder stacks data))
  (when-some [data (lookup-entry config id :staging)]
    (. builder staging data))
  (when-some [data (lookup-entry config id :strict)]
    (. builder strict data))
  (when-some [data (lookup-entry config id :toolkit-stack-name)]
    (. builder toolkitStackName data))
  (when-some [data (lookup-entry config id :trace)]
    (. builder trace data))
  (when-some [data (lookup-entry config id :use-previous-parameters)]
    (. builder usePreviousParameters data))
  (when-some [data (lookup-entry config id :verbose)]
    (. builder verbose data))
  (when-some [data (lookup-entry config id :version-reporting)]
    (. builder versionReporting data))
  (.build builder))


(defn deploy-options-builder
  "Creates a  `DeployOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (deploy-options-builder> (new DeployOptions$Builder) id config))


(defn destroy-command-builder>
  "The destroy-command-builder> function updates a DestroyCommand$Builder instance using the provided configuration.
  The function takes the DestroyCommand$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `args` | software.amazon.awscdk.cloudassembly.schema.DestroyOptions | [[cdk.support/lookup-entry]] | `:args` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `expectError` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:expect-error` |
| `expectedMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:expected-message` |
"
  [^DestroyCommand$Builder builder id config]
  (when-some [data (lookup-entry config id :args)]
    (. builder args data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :expect-error)]
    (. builder expectError data))
  (when-some [data (lookup-entry config id :expected-message)]
    (. builder expectedMessage data))
  (.build builder))


(defn destroy-command-builder
  "Creates a  `DestroyCommand$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (destroy-command-builder> (new DestroyCommand$Builder) id config))


(defn destroy-options-builder>
  "The destroy-options-builder> function updates a DestroyOptions$Builder instance using the provided configuration.
  The function takes the DestroyOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:all` |
| `app` | java.lang.String | [[cdk.support/lookup-entry]] | `:app` |
| `assetMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:asset-metadata` |
| `caBundlePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-bundle-path` |
| `color` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:color` |
| `context` | java.util.Map | [[cdk.support/lookup-entry]] | `:context` |
| `debug` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:debug` |
| `ec2Creds` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ec2-creds` |
| `exclusively` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclusively` |
| `force` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force` |
| `ignoreErrors` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ignore-errors` |
| `json` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:json` |
| `lookups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:lookups` |
| `notices` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:notices` |
| `output` | java.lang.String | [[cdk.support/lookup-entry]] | `:output` |
| `pathMetadata` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:path-metadata` |
| `profile` | java.lang.String | [[cdk.support/lookup-entry]] | `:profile` |
| `proxy` | java.lang.String | [[cdk.support/lookup-entry]] | `:proxy` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stacks` | java.util.List | [[cdk.support/lookup-entry]] | `:stacks` |
| `staging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:staging` |
| `strict` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:strict` |
| `trace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:trace` |
| `verbose` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:verbose` |
| `versionReporting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:version-reporting` |
"
  [^DestroyOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :all)]
    (. builder all data))
  (when-some [data (lookup-entry config id :app)]
    (. builder app data))
  (when-some [data (lookup-entry config id :asset-metadata)]
    (. builder assetMetadata data))
  (when-some [data (lookup-entry config id :ca-bundle-path)]
    (. builder caBundlePath data))
  (when-some [data (lookup-entry config id :color)]
    (. builder color data))
  (when-some [data (lookup-entry config id :context)]
    (. builder context data))
  (when-some [data (lookup-entry config id :debug)]
    (. builder debug data))
  (when-some [data (lookup-entry config id :ec2-creds)]
    (. builder ec2Creds data))
  (when-some [data (lookup-entry config id :exclusively)]
    (. builder exclusively data))
  (when-some [data (lookup-entry config id :force)]
    (. builder force data))
  (when-some [data (lookup-entry config id :ignore-errors)]
    (. builder ignoreErrors data))
  (when-some [data (lookup-entry config id :json)]
    (. builder json data))
  (when-some [data (lookup-entry config id :lookups)]
    (. builder lookups data))
  (when-some [data (lookup-entry config id :notices)]
    (. builder notices data))
  (when-some [data (lookup-entry config id :output)]
    (. builder output data))
  (when-some [data (lookup-entry config id :path-metadata)]
    (. builder pathMetadata data))
  (when-some [data (lookup-entry config id :profile)]
    (. builder profile data))
  (when-some [data (lookup-entry config id :proxy)]
    (. builder proxy data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :stacks)]
    (. builder stacks data))
  (when-some [data (lookup-entry config id :staging)]
    (. builder staging data))
  (when-some [data (lookup-entry config id :strict)]
    (. builder strict data))
  (when-some [data (lookup-entry config id :trace)]
    (. builder trace data))
  (when-some [data (lookup-entry config id :verbose)]
    (. builder verbose data))
  (when-some [data (lookup-entry config id :version-reporting)]
    (. builder versionReporting data))
  (.build builder))


(defn destroy-options-builder
  "Creates a  `DestroyOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (destroy-options-builder> (new DestroyOptions$Builder) id config))


(defn docker-cache-option-builder>
  "The docker-cache-option-builder> function updates a DockerCacheOption$Builder instance using the provided configuration.
  The function takes the DockerCacheOption$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `params` | java.util.Map | [[cdk.support/lookup-entry]] | `:params` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^DockerCacheOption$Builder builder id config]
  (when-some [data (lookup-entry config id :params)]
    (. builder params data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn docker-cache-option-builder
  "Creates a  `DockerCacheOption$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (docker-cache-option-builder> (new DockerCacheOption$Builder) id config))


(defn docker-image-asset-builder>
  "The docker-image-asset-builder> function updates a DockerImageAsset$Builder instance using the provided configuration.
  The function takes the DockerImageAsset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | java.util.Map | [[cdk.support/lookup-entry]] | `:destinations` |
| `source` | software.amazon.awscdk.cloudassembly.schema.DockerImageSource | [[cdk.support/lookup-entry]] | `:source` |
"
  [^DockerImageAsset$Builder builder id config]
  (when-some [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn docker-image-asset-builder
  "Creates a  `DockerImageAsset$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (docker-image-asset-builder> (new DockerImageAsset$Builder) id config))


(defn docker-image-destination-builder>
  "The docker-image-destination-builder> function updates a DockerImageDestination$Builder instance using the provided configuration.
  The function takes the DockerImageDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-arn` |
| `assumeRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-external-id` |
| `imageTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-tag` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
"
  [^DockerImageDestination$Builder builder id config]
  (when-some [data (lookup-entry config id :assume-role-arn)]
    (. builder assumeRoleArn data))
  (when-some [data (lookup-entry config id :assume-role-external-id)]
    (. builder assumeRoleExternalId data))
  (when-some [data (lookup-entry config id :image-tag)]
    (. builder imageTag data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :repository-name)]
    (. builder repositoryName data))
  (.build builder))


(defn docker-image-destination-builder
  "Creates a  `DockerImageDestination$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (docker-image-destination-builder> (new DockerImageDestination$Builder) id config))


(defn docker-image-source-builder>
  "The docker-image-source-builder> function updates a DockerImageSource$Builder instance using the provided configuration.
  The function takes the DockerImageSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cacheDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cache-disabled` |
| `cacheFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-from` |
| `cacheTo` | software.amazon.awscdk.cloudassembly.schema.DockerCacheOption | [[cdk.support/lookup-entry]] | `:cache-to` |
| `directory` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory` |
| `dockerBuildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-build-args` |
| `dockerBuildSecrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-build-secrets` |
| `dockerBuildSsh` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-build-ssh` |
| `dockerBuildTarget` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-build-target` |
| `dockerFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:docker-file` |
| `dockerOutputs` | java.util.List | [[cdk.support/lookup-entry]] | `:docker-outputs` |
| `executable` | java.util.List | [[cdk.support/lookup-entry]] | `:executable` |
| `networkMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-mode` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
"
  [^DockerImageSource$Builder builder id config]
  (when-some [data (lookup-entry config id :cache-disabled)]
    (. builder cacheDisabled data))
  (when-some [data (lookup-entry config id :cache-from)]
    (. builder cacheFrom data))
  (when-some [data (lookup-entry config id :cache-to)]
    (. builder cacheTo data))
  (when-some [data (lookup-entry config id :directory)]
    (. builder directory data))
  (when-some [data (lookup-entry config id :docker-build-args)]
    (. builder dockerBuildArgs data))
  (when-some [data (lookup-entry config id :docker-build-secrets)]
    (. builder dockerBuildSecrets data))
  (when-some [data (lookup-entry config id :docker-build-ssh)]
    (. builder dockerBuildSsh data))
  (when-some [data (lookup-entry config id :docker-build-target)]
    (. builder dockerBuildTarget data))
  (when-some [data (lookup-entry config id :docker-file)]
    (. builder dockerFile data))
  (when-some [data (lookup-entry config id :docker-outputs)]
    (. builder dockerOutputs data))
  (when-some [data (lookup-entry config id :executable)]
    (. builder executable data))
  (when-some [data (lookup-entry config id :network-mode)]
    (. builder networkMode data))
  (when-some [data (lookup-entry config id :platform)]
    (. builder platform data))
  (.build builder))


(defn docker-image-source-builder
  "Creates a  `DockerImageSource$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (docker-image-source-builder> (new DockerImageSource$Builder) id config))


(defn endpoint-service-availability-zones-context-query-builder>
  "The endpoint-service-availability-zones-context-query-builder> function updates a EndpointServiceAvailabilityZonesContextQuery$Builder instance using the provided configuration.
  The function takes the EndpointServiceAvailabilityZonesContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^EndpointServiceAvailabilityZonesContextQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn endpoint-service-availability-zones-context-query-builder
  "Creates a  `EndpointServiceAvailabilityZonesContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (endpoint-service-availability-zones-context-query-builder> (new EndpointServiceAvailabilityZonesContextQuery$Builder) id config))


(defn file-asset-builder>
  "The file-asset-builder> function updates a FileAsset$Builder instance using the provided configuration.
  The function takes the FileAsset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinations` | java.util.Map | [[cdk.support/lookup-entry]] | `:destinations` |
| `source` | software.amazon.awscdk.cloudassembly.schema.FileSource | [[cdk.support/lookup-entry]] | `:source` |
"
  [^FileAsset$Builder builder id config]
  (when-some [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn file-asset-builder
  "Creates a  `FileAsset$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (file-asset-builder> (new FileAsset$Builder) id config))


(defn file-asset-metadata-entry-builder>
  "The file-asset-metadata-entry-builder> function updates a FileAssetMetadataEntry$Builder instance using the provided configuration.
  The function takes the FileAssetMetadataEntry$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `artifactHashParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:artifact-hash-parameter` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `packaging` | java.lang.String | [[cdk.support/lookup-entry]] | `:packaging` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `s3BucketParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-parameter` |
| `s3KeyParameter` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-parameter` |
| `sourceHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-hash` |
"
  [^FileAssetMetadataEntry$Builder builder id config]
  (when-some [data (lookup-entry config id :artifact-hash-parameter)]
    (. builder artifactHashParameter data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :packaging)]
    (. builder packaging data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :s3-bucket-parameter)]
    (. builder s3BucketParameter data))
  (when-some [data (lookup-entry config id :s3-key-parameter)]
    (. builder s3KeyParameter data))
  (when-some [data (lookup-entry config id :source-hash)]
    (. builder sourceHash data))
  (.build builder))


(defn file-asset-metadata-entry-builder
  "Creates a  `FileAssetMetadataEntry$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (file-asset-metadata-entry-builder> (new FileAssetMetadataEntry$Builder) id config))


(defn file-destination-builder>
  "The file-destination-builder> function updates a FileDestination$Builder instance using the provided configuration.
  The function takes the FileDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-arn` |
| `assumeRoleExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-external-id` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `objectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-key` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^FileDestination$Builder builder id config]
  (when-some [data (lookup-entry config id :assume-role-arn)]
    (. builder assumeRoleArn data))
  (when-some [data (lookup-entry config id :assume-role-external-id)]
    (. builder assumeRoleExternalId data))
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :object-key)]
    (. builder objectKey data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn file-destination-builder
  "Creates a  `FileDestination$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (file-destination-builder> (new FileDestination$Builder) id config))


(defn file-source-builder>
  "The file-source-builder> function updates a FileSource$Builder instance using the provided configuration.
  The function takes the FileSource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executable` | java.util.List | [[cdk.support/lookup-entry]] | `:executable` |
| `packaging` | software.amazon.awscdk.cloudassembly.schema.FileAssetPackaging | [[cdk.api.cloudassembly.schema/file-asset-packaging]] | `:packaging` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^FileSource$Builder builder id config]
  (when-some [data (lookup-entry config id :executable)]
    (. builder executable data))
  (when-some [data (file-asset-packaging config id :packaging)]
    (. builder packaging data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn file-source-builder
  "Creates a  `FileSource$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (file-source-builder> (new FileSource$Builder) id config))


(defn hooks-builder>
  "The hooks-builder> function updates a Hooks$Builder instance using the provided configuration.
  The function takes the Hooks$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `postDeploy` | java.util.List | [[cdk.support/lookup-entry]] | `:post-deploy` |
| `postDestroy` | java.util.List | [[cdk.support/lookup-entry]] | `:post-destroy` |
| `preDeploy` | java.util.List | [[cdk.support/lookup-entry]] | `:pre-deploy` |
| `preDestroy` | java.util.List | [[cdk.support/lookup-entry]] | `:pre-destroy` |
"
  [^Hooks$Builder builder id config]
  (when-some [data (lookup-entry config id :post-deploy)]
    (. builder postDeploy data))
  (when-some [data (lookup-entry config id :post-destroy)]
    (. builder postDestroy data))
  (when-some [data (lookup-entry config id :pre-deploy)]
    (. builder preDeploy data))
  (when-some [data (lookup-entry config id :pre-destroy)]
    (. builder preDestroy data))
  (.build builder))


(defn hooks-builder
  "Creates a  `Hooks$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (hooks-builder> (new Hooks$Builder) id config))


(defn hosted-zone-context-query-builder>
  "The hosted-zone-context-query-builder> function updates a HostedZoneContextQuery$Builder instance using the provided configuration.
  The function takes the HostedZoneContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `privateZone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:private-zone` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^HostedZoneContextQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :private-zone)]
    (. builder privateZone data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn hosted-zone-context-query-builder
  "Creates a  `HostedZoneContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (hosted-zone-context-query-builder> (new HostedZoneContextQuery$Builder) id config))


(defn integ-manifest-builder>
  "The integ-manifest-builder> function updates a IntegManifest$Builder instance using the provided configuration.
  The function takes the IntegManifest$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableLookups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-lookups` |
| `synthContext` | java.util.Map | [[cdk.support/lookup-entry]] | `:synth-context` |
| `testCases` | java.util.Map | [[cdk.support/lookup-entry]] | `:test-cases` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^IntegManifest$Builder builder id config]
  (when-some [data (lookup-entry config id :enable-lookups)]
    (. builder enableLookups data))
  (when-some [data (lookup-entry config id :synth-context)]
    (. builder synthContext data))
  (when-some [data (lookup-entry config id :test-cases)]
    (. builder testCases data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn integ-manifest-builder
  "Creates a  `IntegManifest$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (integ-manifest-builder> (new IntegManifest$Builder) id config))


(defn key-context-query-builder>
  "The key-context-query-builder> function updates a KeyContextQuery$Builder instance using the provided configuration.
  The function takes the KeyContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `aliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias-name` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^KeyContextQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :alias-name)]
    (. builder aliasName data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn key-context-query-builder
  "Creates a  `KeyContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (key-context-query-builder> (new KeyContextQuery$Builder) id config))


(defn load-balancer-context-query-builder>
  "The load-balancer-context-query-builder> function updates a LoadBalancerContextQuery$Builder instance using the provided configuration.
  The function takes the LoadBalancerContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |
| `loadBalancerType` | software.amazon.awscdk.cloudassembly.schema.LoadBalancerType | [[cdk.api.cloudassembly.schema/load-balancer-type]] | `:load-balancer-type` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^LoadBalancerContextQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :load-balancer-tags)]
    (. builder loadBalancerTags data))
  (when-some [data (load-balancer-type config id :load-balancer-type)]
    (. builder loadBalancerType data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn load-balancer-context-query-builder
  "Creates a  `LoadBalancerContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (load-balancer-context-query-builder> (new LoadBalancerContextQuery$Builder) id config))


(defn load-balancer-filter-builder>
  "The load-balancer-filter-builder> function updates a LoadBalancerFilter$Builder instance using the provided configuration.
  The function takes the LoadBalancerFilter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |
| `loadBalancerType` | software.amazon.awscdk.cloudassembly.schema.LoadBalancerType | [[cdk.api.cloudassembly.schema/load-balancer-type]] | `:load-balancer-type` |
"
  [^LoadBalancerFilter$Builder builder id config]
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :load-balancer-tags)]
    (. builder loadBalancerTags data))
  (when-some [data (load-balancer-type config id :load-balancer-type)]
    (. builder loadBalancerType data))
  (.build builder))


(defn load-balancer-filter-builder
  "Creates a  `LoadBalancerFilter$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (load-balancer-filter-builder> (new LoadBalancerFilter$Builder) id config))


(defn load-balancer-listener-context-query-builder>
  "The load-balancer-listener-context-query-builder> function updates a LoadBalancerListenerContextQuery$Builder instance using the provided configuration.
  The function takes the LoadBalancerListenerContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `listenerProtocol` | software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerProtocol | [[cdk.api.cloudassembly.schema/load-balancer-listener-protocol]] | `:listener-protocol` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerTags` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancer-tags` |
| `loadBalancerType` | software.amazon.awscdk.cloudassembly.schema.LoadBalancerType | [[cdk.api.cloudassembly.schema/load-balancer-type]] | `:load-balancer-type` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^LoadBalancerListenerContextQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :listener-arn)]
    (. builder listenerArn data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (load-balancer-listener-protocol config id :listener-protocol)]
    (. builder listenerProtocol data))
  (when-some [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-some [data (lookup-entry config id :load-balancer-tags)]
    (. builder loadBalancerTags data))
  (when-some [data (load-balancer-type config id :load-balancer-type)]
    (. builder loadBalancerType data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn load-balancer-listener-context-query-builder
  "Creates a  `LoadBalancerListenerContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (load-balancer-listener-context-query-builder> (new LoadBalancerListenerContextQuery$Builder) id config))


(defn load-manifest-options-builder>
  "The load-manifest-options-builder> function updates a LoadManifestOptions$Builder instance using the provided configuration.
  The function takes the LoadManifestOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `skipEnumCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-enum-check` |
| `skipVersionCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-version-check` |
| `topoSort` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:topo-sort` |
"
  [^LoadManifestOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :skip-enum-check)]
    (. builder skipEnumCheck data))
  (when-some [data (lookup-entry config id :skip-version-check)]
    (. builder skipVersionCheck data))
  (when-some [data (lookup-entry config id :topo-sort)]
    (. builder topoSort data))
  (.build builder))


(defn load-manifest-options-builder
  "Creates a  `LoadManifestOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (load-manifest-options-builder> (new LoadManifestOptions$Builder) id config))


(defn metadata-entry-builder>
  "The metadata-entry-builder> function updates a MetadataEntry$Builder instance using the provided configuration.
  The function takes the MetadataEntry$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry | [[cdk.support/lookup-entry]] | `:data` |
| `trace` | java.util.List | [[cdk.support/lookup-entry]] | `:trace` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^MetadataEntry$Builder builder id config]
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :trace)]
    (. builder trace data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn metadata-entry-builder
  "Creates a  `MetadataEntry$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (metadata-entry-builder> (new MetadataEntry$Builder) id config))


(defn missing-context-builder>
  "The missing-context-builder> function updates a MissingContext$Builder instance using the provided configuration.
  The function takes the MissingContext$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `props` | software.amazon.awscdk.cloudassembly.schema.AmiContextQuery | [[cdk.support/lookup-entry]] | `:props` |
| `provider` | software.amazon.awscdk.cloudassembly.schema.ContextProvider | [[cdk.api.cloudassembly.schema/context-provider]] | `:provider` |
"
  [^MissingContext$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :props)]
    (. builder props data))
  (when-some [data (context-provider config id :provider)]
    (. builder provider data))
  (.build builder))


(defn missing-context-builder
  "Creates a  `MissingContext$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (missing-context-builder> (new MissingContext$Builder) id config))


(defn nested-cloud-assembly-properties-builder>
  "The nested-cloud-assembly-properties-builder> function updates a NestedCloudAssemblyProperties$Builder instance using the provided configuration.
  The function takes the NestedCloudAssemblyProperties$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-name` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
"
  [^NestedCloudAssemblyProperties$Builder builder id config]
  (when-some [data (lookup-entry config id :directory-name)]
    (. builder directoryName data))
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (.build builder))


(defn nested-cloud-assembly-properties-builder
  "Creates a  `NestedCloudAssemblyProperties$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (nested-cloud-assembly-properties-builder> (new NestedCloudAssemblyProperties$Builder) id config))


(defn plugin-context-query-builder>
  "The plugin-context-query-builder> function updates a PluginContextQuery$Builder instance using the provided configuration.
  The function takes the PluginContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pluginName` | java.lang.String | [[cdk.support/lookup-entry]] | `:plugin-name` |
"
  [^PluginContextQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :plugin-name)]
    (. builder pluginName data))
  (.build builder))


(defn plugin-context-query-builder
  "Creates a  `PluginContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (plugin-context-query-builder> (new PluginContextQuery$Builder) id config))


(defn runtime-info-builder>
  "The runtime-info-builder> function updates a RuntimeInfo$Builder instance using the provided configuration.
  The function takes the RuntimeInfo$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `libraries` | java.util.Map | [[cdk.support/lookup-entry]] | `:libraries` |
"
  [^RuntimeInfo$Builder builder id config]
  (when-some [data (lookup-entry config id :libraries)]
    (. builder libraries data))
  (.build builder))


(defn runtime-info-builder
  "Creates a  `RuntimeInfo$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (runtime-info-builder> (new RuntimeInfo$Builder) id config))


(defn security-group-context-query-builder>
  "The security-group-context-query-builder> function updates a SecurityGroupContextQuery$Builder instance using the provided configuration.
  The function takes the SecurityGroupContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `securityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-id` |
| `securityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-name` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^SecurityGroupContextQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :security-group-id)]
    (. builder securityGroupId data))
  (when-some [data (lookup-entry config id :security-group-name)]
    (. builder securityGroupName data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn security-group-context-query-builder
  "Creates a  `SecurityGroupContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (security-group-context-query-builder> (new SecurityGroupContextQuery$Builder) id config))


(defn ssm-parameter-context-query-builder>
  "The ssm-parameter-context-query-builder> function updates a SSMParameterContextQuery$Builder instance using the provided configuration.
  The function takes the SSMParameterContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^SSMParameterContextQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn ssm-parameter-context-query-builder
  "Creates a  `SSMParameterContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (ssm-parameter-context-query-builder> (new SSMParameterContextQuery$Builder) id config))


(defn tag-builder>
  "The tag-builder> function updates a Tag$Builder instance using the provided configuration.
  The function takes the Tag$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^Tag$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn tag-builder
  "Creates a  `Tag$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (tag-builder> (new Tag$Builder) id config))


(defn test-case-builder>
  "The test-case-builder> function updates a TestCase$Builder instance using the provided configuration.
  The function takes the TestCase$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowDestroy` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-destroy` |
| `assertionStack` | java.lang.String | [[cdk.support/lookup-entry]] | `:assertion-stack` |
| `assertionStackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:assertion-stack-name` |
| `cdkCommandOptions` | software.amazon.awscdk.cloudassembly.schema.CdkCommands | [[cdk.support/lookup-entry]] | `:cdk-command-options` |
| `diffAssets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:diff-assets` |
| `hooks` | software.amazon.awscdk.cloudassembly.schema.Hooks | [[cdk.support/lookup-entry]] | `:hooks` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
| `stackUpdateWorkflow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stack-update-workflow` |
| `stacks` | java.util.List | [[cdk.support/lookup-entry]] | `:stacks` |
"
  [^TestCase$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-destroy)]
    (. builder allowDestroy data))
  (when-some [data (lookup-entry config id :assertion-stack)]
    (. builder assertionStack data))
  (when-some [data (lookup-entry config id :assertion-stack-name)]
    (. builder assertionStackName data))
  (when-some [data (lookup-entry config id :cdk-command-options)]
    (. builder cdkCommandOptions data))
  (when-some [data (lookup-entry config id :diff-assets)]
    (. builder diffAssets data))
  (when-some [data (lookup-entry config id :hooks)]
    (. builder hooks data))
  (when-some [data (lookup-entry config id :regions)]
    (. builder regions data))
  (when-some [data (lookup-entry config id :stack-update-workflow)]
    (. builder stackUpdateWorkflow data))
  (when-some [data (lookup-entry config id :stacks)]
    (. builder stacks data))
  (.build builder))


(defn test-case-builder
  "Creates a  `TestCase$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (test-case-builder> (new TestCase$Builder) id config))


(defn test-options-builder>
  "The test-options-builder> function updates a TestOptions$Builder instance using the provided configuration.
  The function takes the TestOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowDestroy` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-destroy` |
| `cdkCommandOptions` | software.amazon.awscdk.cloudassembly.schema.CdkCommands | [[cdk.support/lookup-entry]] | `:cdk-command-options` |
| `diffAssets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:diff-assets` |
| `hooks` | software.amazon.awscdk.cloudassembly.schema.Hooks | [[cdk.support/lookup-entry]] | `:hooks` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
| `stackUpdateWorkflow` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:stack-update-workflow` |
"
  [^TestOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-destroy)]
    (. builder allowDestroy data))
  (when-some [data (lookup-entry config id :cdk-command-options)]
    (. builder cdkCommandOptions data))
  (when-some [data (lookup-entry config id :diff-assets)]
    (. builder diffAssets data))
  (when-some [data (lookup-entry config id :hooks)]
    (. builder hooks data))
  (when-some [data (lookup-entry config id :regions)]
    (. builder regions data))
  (when-some [data (lookup-entry config id :stack-update-workflow)]
    (. builder stackUpdateWorkflow data))
  (.build builder))


(defn test-options-builder
  "Creates a  `TestOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (test-options-builder> (new TestOptions$Builder) id config))


(defn tree-artifact-properties-builder>
  "The tree-artifact-properties-builder> function updates a TreeArtifactProperties$Builder instance using the provided configuration.
  The function takes the TreeArtifactProperties$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `file` | java.lang.String | [[cdk.support/lookup-entry]] | `:file` |
"
  [^TreeArtifactProperties$Builder builder id config]
  (when-some [data (lookup-entry config id :file)]
    (. builder file data))
  (.build builder))


(defn tree-artifact-properties-builder
  "Creates a  `TreeArtifactProperties$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (tree-artifact-properties-builder> (new TreeArtifactProperties$Builder) id config))


(defn vpc-context-query-builder>
  "The vpc-context-query-builder> function updates a VpcContextQuery$Builder instance using the provided configuration.
  The function takes the VpcContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `filter` | java.util.Map | [[cdk.support/lookup-entry]] | `:filter` |
| `lookupRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lookup-role-arn` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `returnAsymmetricSubnets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:return-asymmetric-subnets` |
| `returnVpnGateways` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:return-vpn-gateways` |
| `subnetGroupNameTag` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name-tag` |
"
  [^VpcContextQuery$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :filter)]
    (. builder filter data))
  (when-some [data (lookup-entry config id :lookup-role-arn)]
    (. builder lookupRoleArn data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :return-asymmetric-subnets)]
    (. builder returnAsymmetricSubnets data))
  (when-some [data (lookup-entry config id :return-vpn-gateways)]
    (. builder returnVpnGateways data))
  (when-some [data (lookup-entry config id :subnet-group-name-tag)]
    (. builder subnetGroupNameTag data))
  (.build builder))


(defn vpc-context-query-builder
  "Creates a  `VpcContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (vpc-context-query-builder> (new VpcContextQuery$Builder) id config))