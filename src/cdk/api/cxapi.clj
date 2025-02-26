(ns cdk.api.cxapi
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.cxapi package. "
  (:require [cdk.api.cloudassembly.schema :refer [artifact-type]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.cxapi AssemblyBuildOptions$Builder
                                         AssetManifestArtifact$Builder
                                         AwsCloudFormationStackProperties$Builder
                                         CloudAssembly
                                         CloudAssembly$Builder
                                         CloudAssemblyBuilder$Builder
                                         CloudAssemblyBuilderProps$Builder
                                         CloudFormationStackArtifact$Builder
                                         EndpointServiceAvailabilityZonesContextQuery$Builder
                                         Environment$Builder
                                         EnvironmentPlaceholderValues$Builder
                                         KeyContextResponse$Builder
                                         LoadBalancerContextResponse$Builder
                                         LoadBalancerIpAddressType
                                         LoadBalancerListenerContextResponse$Builder
                                         MetadataEntryResult$Builder
                                         NestedCloudAssemblyArtifact$Builder
                                         SecurityGroupContextResponse$Builder
                                         SynthesisMessage$Builder
                                         SynthesisMessageLevel
                                         TreeCloudArtifact$Builder
                                         VpcContextResponse$Builder
                                         VpcSubnet$Builder
                                         VpcSubnetGroup$Builder
                                         VpcSubnetGroupType]))


(defn load-balancer-ip-address-type
  "The `load-balancer-ip-address-type` function data interprets values in the provided config data into a 
`LoadBalancerIpAddressType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LoadBalancerIpAddressType` - the value is returned.
* is `:dual-stack` - `LoadBalancerIpAddressType/DUAL_STACK` is returned
* is `:ipv4` - `LoadBalancerIpAddressType/IPV4` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LoadBalancerIpAddressType data) data
      (= :dual-stack data) LoadBalancerIpAddressType/DUAL_STACK
      (= :ipv4 data) LoadBalancerIpAddressType/IPV4)))


(defn synthesis-message-level
  "The `synthesis-message-level` function data interprets values in the provided config data into a 
`SynthesisMessageLevel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SynthesisMessageLevel` - the value is returned.
* is `:error` - `SynthesisMessageLevel/ERROR` is returned
* is `:info` - `SynthesisMessageLevel/INFO` is returned
* is `:warning` - `SynthesisMessageLevel/WARNING` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SynthesisMessageLevel data) data
      (= :error data) SynthesisMessageLevel/ERROR
      (= :info data) SynthesisMessageLevel/INFO
      (= :warning data) SynthesisMessageLevel/WARNING)))


(defn vpc-subnet-group-type
  "The `vpc-subnet-group-type` function data interprets values in the provided config data into a 
`VpcSubnetGroupType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `VpcSubnetGroupType` - the value is returned.
* is `:isolated` - `VpcSubnetGroupType/ISOLATED` is returned
* is `:public` - `VpcSubnetGroupType/PUBLIC` is returned
* is `:private` - `VpcSubnetGroupType/PRIVATE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? VpcSubnetGroupType data) data
      (= :isolated data) VpcSubnetGroupType/ISOLATED
      (= :public data) VpcSubnetGroupType/PUBLIC
      (= :private data) VpcSubnetGroupType/PRIVATE)))


(defn assembly-build-options-builder
  "Creates a  `AssemblyBuildOptions$Builder` instance using a no-argument construct,then builds it."
  []
  (.build (new AssemblyBuildOptions$Builder)))


(defn build-asset-manifest-artifact-builder
  "The build-asset-manifest-artifact-builder function updates a AssetManifestArtifact$Builder instance using the provided configuration.
  The function takes the AssetManifestArtifact$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dependencies` | java.util.List | [[cdk.support/lookup-entry]] | `:dependencies` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `properties` | software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | software.amazon.awscdk.cloudassembly.schema.ArtifactType | [[cdk.api.cloudassembly.schema/artifact-type]] | `:type` |
"
  [^AssetManifestArtifact$Builder builder id config]
  (when-let [data (lookup-entry config id :dependencies)]
    (. builder dependencies data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (artifact-type config id :type)]
    (. builder type data))
  (.build builder))


(defn asset-manifest-artifact-builder
  "Creates a  `AssetManifestArtifact$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.cxapi.CloudAssembly java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| assembly | software.amazon.awscdk.cxapi.CloudAssembly |  |
| artifact-name | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^CloudAssembly assembly ^String artifact-name id config]
  (build-asset-manifest-artifact-builder (AssetManifestArtifact$Builder/create assembly artifact-name) id config))


(defn build-aws-cloud-formation-stack-properties-builder
  "The build-aws-cloud-formation-stack-properties-builder function updates a AwsCloudFormationStackProperties$Builder instance using the provided configuration.
  The function takes the AwsCloudFormationStackProperties$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `templateFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-file` |
| `terminationProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protection` |
"
  [^AwsCloudFormationStackProperties$Builder builder id config]
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :stack-name)]
    (. builder stackName data))
  (when-let [data (lookup-entry config id :template-file)]
    (. builder templateFile data))
  (when-let [data (lookup-entry config id :termination-protection)]
    (. builder terminationProtection data))
  (.build builder))


(defn aws-cloud-formation-stack-properties-builder
  "Creates a  `AwsCloudFormationStackProperties$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-aws-cloud-formation-stack-properties-builder (new AwsCloudFormationStackProperties$Builder) id config))


(defn build-cloud-assembly-builder
  "The build-cloud-assembly-builder function updates a CloudAssembly$Builder instance using the provided configuration.
  The function takes the CloudAssembly$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `skipEnumCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-enum-check` |
| `skipVersionCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-version-check` |
| `topoSort` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:topo-sort` |
"
  [^CloudAssembly$Builder builder id config]
  (when-let [data (lookup-entry config id :skip-enum-check)]
    (. builder skipEnumCheck data))
  (when-let [data (lookup-entry config id :skip-version-check)]
    (. builder skipVersionCheck data))
  (when-let [data (lookup-entry config id :topo-sort)]
    (. builder topoSort data))
  (.build builder))


(defn cloud-assembly-builder
  "Creates a  `CloudAssembly$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| directory | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^String directory id config]
  (build-cloud-assembly-builder (CloudAssembly$Builder/create directory) id config))


(defn build-cloud-assembly-builder-builder
  "The build-cloud-assembly-builder-builder function updates a CloudAssemblyBuilder$Builder instance using the provided configuration.
  The function takes the CloudAssemblyBuilder$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetOutdir` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-outdir` |
| `parentBuilder` | software.amazon.awscdk.cxapi.CloudAssemblyBuilder | [[cdk.support/lookup-entry]] | `:parent-builder` |
"
  [^CloudAssemblyBuilder$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-outdir)]
    (. builder assetOutdir data))
  (when-let [data (lookup-entry config id :parent-builder)]
    (. builder parentBuilder data))
  (.build builder))


(defn cloud-assembly-builder-builder
  "Creates a  `CloudAssemblyBuilder$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| out-dir | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |


__Create Form:__ ____[]___
| Argument | DataType | Description |
|---|---|---|

| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  ([^String out-dir id config]
   (build-cloud-assembly-builder-builder (CloudAssemblyBuilder$Builder/create out-dir) id config))
  ([id config]
   (build-cloud-assembly-builder-builder (CloudAssemblyBuilder$Builder/create) id config)))


(defn build-cloud-assembly-builder-props-builder
  "The build-cloud-assembly-builder-props-builder function updates a CloudAssemblyBuilderProps$Builder instance using the provided configuration.
  The function takes the CloudAssemblyBuilderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetOutdir` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-outdir` |
| `parentBuilder` | software.amazon.awscdk.cxapi.CloudAssemblyBuilder | [[cdk.support/lookup-entry]] | `:parent-builder` |
"
  [^CloudAssemblyBuilderProps$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-outdir)]
    (. builder assetOutdir data))
  (when-let [data (lookup-entry config id :parent-builder)]
    (. builder parentBuilder data))
  (.build builder))


(defn cloud-assembly-builder-props-builder
  "Creates a  `CloudAssemblyBuilderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cloud-assembly-builder-props-builder (new CloudAssemblyBuilderProps$Builder) id config))


(defn build-cloud-formation-stack-artifact-builder
  "The build-cloud-formation-stack-artifact-builder function updates a CloudFormationStackArtifact$Builder instance using the provided configuration.
  The function takes the CloudFormationStackArtifact$Builder instance, an optional namespace to use when looking up a value in the configuration,
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
  [^CloudFormationStackArtifact$Builder builder id config]
  (when-let [data (lookup-entry config id :dependencies)]
    (. builder dependencies data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (artifact-type config id :type)]
    (. builder type data))
  (.build builder))


(defn cloud-formation-stack-artifact-builder
  "Creates a  `CloudFormationStackArtifact$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.cxapi.CloudAssembly java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| assembly | software.amazon.awscdk.cxapi.CloudAssembly |  |
| artifact-id | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^CloudAssembly assembly ^String artifact-id id config]
  (build-cloud-formation-stack-artifact-builder (CloudFormationStackArtifact$Builder/create assembly artifact-id) id config))


(defn build-endpoint-service-availability-zones-context-query-builder
  "The build-endpoint-service-availability-zones-context-query-builder function updates a EndpointServiceAvailabilityZonesContextQuery$Builder instance using the provided configuration.
  The function takes the EndpointServiceAvailabilityZonesContextQuery$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^EndpointServiceAvailabilityZonesContextQuery$Builder builder id config]
  (when-let [data (lookup-entry config id :account)]
    (. builder account data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn endpoint-service-availability-zones-context-query-builder
  "Creates a  `EndpointServiceAvailabilityZonesContextQuery$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-endpoint-service-availability-zones-context-query-builder (new EndpointServiceAvailabilityZonesContextQuery$Builder) id config))


(defn build-environment-builder
  "The build-environment-builder function updates a Environment$Builder instance using the provided configuration.
  The function takes the Environment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^Environment$Builder builder id config]
  (when-let [data (lookup-entry config id :account)]
    (. builder account data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn environment-builder
  "Creates a  `Environment$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-environment-builder (new Environment$Builder) id config))


(defn build-environment-placeholder-values-builder
  "The build-environment-placeholder-values-builder function updates a EnvironmentPlaceholderValues$Builder instance using the provided configuration.
  The function takes the EnvironmentPlaceholderValues$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `partition` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^EnvironmentPlaceholderValues$Builder builder id config]
  (when-let [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-let [data (lookup-entry config id :partition)]
    (. builder partition data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn environment-placeholder-values-builder
  "Creates a  `EnvironmentPlaceholderValues$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-environment-placeholder-values-builder (new EnvironmentPlaceholderValues$Builder) id config))


(defn build-key-context-response-builder
  "The build-key-context-response-builder function updates a KeyContextResponse$Builder instance using the provided configuration.
  The function takes the KeyContextResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |
"
  [^KeyContextResponse$Builder builder id config]
  (when-let [data (lookup-entry config id :key-id)]
    (. builder keyId data))
  (.build builder))


(defn key-context-response-builder
  "Creates a  `KeyContextResponse$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-key-context-response-builder (new KeyContextResponse$Builder) id config))


(defn build-load-balancer-context-response-builder
  "The build-load-balancer-context-response-builder function updates a LoadBalancerContextResponse$Builder instance using the provided configuration.
  The function takes the LoadBalancerContextResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipAddressType` | software.amazon.awscdk.cxapi.LoadBalancerIpAddressType | [[cdk.api.cxapi/load-balancer-ip-address-type]] | `:ip-address-type` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerCanonicalHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-canonical-hosted-zone-id` |
| `loadBalancerDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-dns-name` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^LoadBalancerContextResponse$Builder builder id config]
  (when-let [data (load-balancer-ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-let [data (lookup-entry config id :load-balancer-arn)]
    (. builder loadBalancerArn data))
  (when-let [data (lookup-entry config id :load-balancer-canonical-hosted-zone-id)]
    (. builder loadBalancerCanonicalHostedZoneId data))
  (when-let [data (lookup-entry config id :load-balancer-dns-name)]
    (. builder loadBalancerDnsName data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn load-balancer-context-response-builder
  "Creates a  `LoadBalancerContextResponse$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-load-balancer-context-response-builder (new LoadBalancerContextResponse$Builder) id config))


(defn build-load-balancer-listener-context-response-builder
  "The build-load-balancer-listener-context-response-builder function updates a LoadBalancerListenerContextResponse$Builder instance using the provided configuration.
  The function takes the LoadBalancerListenerContextResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
"
  [^LoadBalancerListenerContextResponse$Builder builder id config]
  (when-let [data (lookup-entry config id :listener-arn)]
    (. builder listenerArn data))
  (when-let [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (.build builder))


(defn load-balancer-listener-context-response-builder
  "Creates a  `LoadBalancerListenerContextResponse$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-load-balancer-listener-context-response-builder (new LoadBalancerListenerContextResponse$Builder) id config))


(defn build-metadata-entry-result-builder
  "The build-metadata-entry-result-builder function updates a MetadataEntryResult$Builder instance using the provided configuration.
  The function takes the MetadataEntryResult$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.util.List | [[cdk.support/lookup-entry]] | `:data` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `trace` | java.util.List | [[cdk.support/lookup-entry]] | `:trace` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^MetadataEntryResult$Builder builder id config]
  (when-let [data (lookup-entry config id :data)]
    (. builder data data))
  (when-let [data (lookup-entry config id :path)]
    (. builder path data))
  (when-let [data (lookup-entry config id :trace)]
    (. builder trace data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn metadata-entry-result-builder
  "Creates a  `MetadataEntryResult$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-metadata-entry-result-builder (new MetadataEntryResult$Builder) id config))


(defn build-nested-cloud-assembly-artifact-builder
  "The build-nested-cloud-assembly-artifact-builder function updates a NestedCloudAssemblyArtifact$Builder instance using the provided configuration.
  The function takes the NestedCloudAssemblyArtifact$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dependencies` | java.util.List | [[cdk.support/lookup-entry]] | `:dependencies` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `properties` | software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | software.amazon.awscdk.cloudassembly.schema.ArtifactType | [[cdk.api.cloudassembly.schema/artifact-type]] | `:type` |
"
  [^NestedCloudAssemblyArtifact$Builder builder id config]
  (when-let [data (lookup-entry config id :dependencies)]
    (. builder dependencies data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (artifact-type config id :type)]
    (. builder type data))
  (.build builder))


(defn nested-cloud-assembly-artifact-builder
  "Creates a  `NestedCloudAssemblyArtifact$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.cxapi.CloudAssembly java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| assembly | software.amazon.awscdk.cxapi.CloudAssembly |  |
| artifact-name | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^CloudAssembly assembly ^String artifact-name id config]
  (build-nested-cloud-assembly-artifact-builder (NestedCloudAssemblyArtifact$Builder/create assembly artifact-name) id config))


(defn build-security-group-context-response-builder
  "The build-security-group-context-response-builder function updates a SecurityGroupContextResponse$Builder instance using the provided configuration.
  The function takes the SecurityGroupContextResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `securityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-id` |
"
  [^SecurityGroupContextResponse$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-all-outbound)]
    (. builder allowAllOutbound data))
  (when-let [data (lookup-entry config id :security-group-id)]
    (. builder securityGroupId data))
  (.build builder))


(defn security-group-context-response-builder
  "Creates a  `SecurityGroupContextResponse$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-security-group-context-response-builder (new SecurityGroupContextResponse$Builder) id config))


(defn build-synthesis-message-builder
  "The build-synthesis-message-builder function updates a SynthesisMessage$Builder instance using the provided configuration.
  The function takes the SynthesisMessage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entry` | software.amazon.awscdk.cloudassembly.schema.MetadataEntry | [[cdk.support/lookup-entry]] | `:entry` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `level` | software.amazon.awscdk.cxapi.SynthesisMessageLevel | [[cdk.api.cxapi/synthesis-message-level]] | `:level` |
"
  [^SynthesisMessage$Builder builder id config]
  (when-let [data (lookup-entry config id :entry)]
    (. builder entry data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (synthesis-message-level config id :level)]
    (. builder level data))
  (.build builder))


(defn synthesis-message-builder
  "Creates a  `SynthesisMessage$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-synthesis-message-builder (new SynthesisMessage$Builder) id config))


(defn build-tree-cloud-artifact-builder
  "The build-tree-cloud-artifact-builder function updates a TreeCloudArtifact$Builder instance using the provided configuration.
  The function takes the TreeCloudArtifact$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dependencies` | java.util.List | [[cdk.support/lookup-entry]] | `:dependencies` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `properties` | software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | software.amazon.awscdk.cloudassembly.schema.ArtifactType | [[cdk.api.cloudassembly.schema/artifact-type]] | `:type` |
"
  [^TreeCloudArtifact$Builder builder id config]
  (when-let [data (lookup-entry config id :dependencies)]
    (. builder dependencies data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (artifact-type config id :type)]
    (. builder type data))
  (.build builder))


(defn tree-cloud-artifact-builder
  "Creates a  `TreeCloudArtifact$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[software.amazon.awscdk.cxapi.CloudAssembly java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| assembly | software.amazon.awscdk.cxapi.CloudAssembly |  |
| artifact-name | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^CloudAssembly assembly ^String artifact-name id config]
  (build-tree-cloud-artifact-builder (TreeCloudArtifact$Builder/create assembly artifact-name) id config))


(defn build-vpc-context-response-builder
  "The build-vpc-context-response-builder function updates a VpcContextResponse$Builder instance using the provided configuration.
  The function takes the VpcContextResponse$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `isolatedSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:isolated-subnet-ids` |
| `isolatedSubnetNames` | java.util.List | [[cdk.support/lookup-entry]] | `:isolated-subnet-names` |
| `isolatedSubnetRouteTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:isolated-subnet-route-table-ids` |
| `ownerAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-account-id` |
| `privateSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:private-subnet-ids` |
| `privateSubnetNames` | java.util.List | [[cdk.support/lookup-entry]] | `:private-subnet-names` |
| `privateSubnetRouteTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:private-subnet-route-table-ids` |
| `publicSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:public-subnet-ids` |
| `publicSubnetNames` | java.util.List | [[cdk.support/lookup-entry]] | `:public-subnet-names` |
| `publicSubnetRouteTableIds` | java.util.List | [[cdk.support/lookup-entry]] | `:public-subnet-route-table-ids` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `subnetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-groups` |
| `vpcCidrBlock` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-cidr-block` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `vpnGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-gateway-id` |
"
  [^VpcContextResponse$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zones)]
    (. builder availabilityZones data))
  (when-let [data (lookup-entry config id :isolated-subnet-ids)]
    (. builder isolatedSubnetIds data))
  (when-let [data (lookup-entry config id :isolated-subnet-names)]
    (. builder isolatedSubnetNames data))
  (when-let [data (lookup-entry config id :isolated-subnet-route-table-ids)]
    (. builder isolatedSubnetRouteTableIds data))
  (when-let [data (lookup-entry config id :owner-account-id)]
    (. builder ownerAccountId data))
  (when-let [data (lookup-entry config id :private-subnet-ids)]
    (. builder privateSubnetIds data))
  (when-let [data (lookup-entry config id :private-subnet-names)]
    (. builder privateSubnetNames data))
  (when-let [data (lookup-entry config id :private-subnet-route-table-ids)]
    (. builder privateSubnetRouteTableIds data))
  (when-let [data (lookup-entry config id :public-subnet-ids)]
    (. builder publicSubnetIds data))
  (when-let [data (lookup-entry config id :public-subnet-names)]
    (. builder publicSubnetNames data))
  (when-let [data (lookup-entry config id :public-subnet-route-table-ids)]
    (. builder publicSubnetRouteTableIds data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :subnet-groups)]
    (. builder subnetGroups data))
  (when-let [data (lookup-entry config id :vpc-cidr-block)]
    (. builder vpcCidrBlock data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (when-let [data (lookup-entry config id :vpn-gateway-id)]
    (. builder vpnGatewayId data))
  (.build builder))


(defn vpc-context-response-builder
  "Creates a  `VpcContextResponse$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-vpc-context-response-builder (new VpcContextResponse$Builder) id config))


(defn build-vpc-subnet-builder
  "The build-vpc-subnet-builder function updates a VpcSubnet$Builder instance using the provided configuration.
  The function takes the VpcSubnet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `routeTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-table-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^VpcSubnet$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-let [data (lookup-entry config id :cidr)]
    (. builder cidr data))
  (when-let [data (lookup-entry config id :route-table-id)]
    (. builder routeTableId data))
  (when-let [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn vpc-subnet-builder
  "Creates a  `VpcSubnet$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-vpc-subnet-builder (new VpcSubnet$Builder) id config))


(defn build-vpc-subnet-group-builder
  "The build-vpc-subnet-group-builder function updates a VpcSubnetGroup$Builder instance using the provided configuration.
  The function takes the VpcSubnetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `type` | software.amazon.awscdk.cxapi.VpcSubnetGroupType | [[cdk.api.cxapi/vpc-subnet-group-type]] | `:type` |
"
  [^VpcSubnetGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-let [data (vpc-subnet-group-type config id :type)]
    (. builder type data))
  (.build builder))


(defn vpc-subnet-group-builder
  "Creates a  `VpcSubnetGroup$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-vpc-subnet-group-builder (new VpcSubnetGroup$Builder) id config))