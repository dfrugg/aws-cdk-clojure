(ns cdk.api.cxapi
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.cxapi package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.cloudassembly.schema :refer [artifact-type]])
  (:import [software.amazon.awscdk.cxapi AssemblyBuildOptions$Builder
                                         AssetManifestArtifact$Builder
                                         AwsCloudFormationStackProperties$Builder
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
  "The assembly-build-options-builder function buildes out new instances of 
AssemblyBuildOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (AssemblyBuildOptions$Builder.)]
    (.build builder)))


(defn asset-manifest-artifact-builder
  "The asset-manifest-artifact-builder function buildes out new instances of 
AssetManifestArtifact$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dependencies` | java.util.List | [[cdk.support/lookup-entry]] | `:dependencies` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `properties` | software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | software.amazon.awscdk.cloudassembly.schema.ArtifactType | [[cdk.api.cloudassembly.schema/artifact-type]] | `:type` |"
  [stack id config ^software.amazon.awscdk.cxapi.CloudAssembly assembly ^java.lang.String artifact-name]
  (let [builder (AssetManifestArtifact$Builder/create ^software.amazon.awscdk.cxapi.CloudAssembly assembly ^java.lang.String artifact-name)]
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
    (.build builder)))


(defn aws-cloud-formation-stack-properties-builder
  "The aws-cloud-formation-stack-properties-builder function buildes out new instances of 
AwsCloudFormationStackProperties$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `stackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-name` |
| `templateFile` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-file` |
| `terminationProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:termination-protection` |"
  [stack id config]
  (let [builder (AwsCloudFormationStackProperties$Builder.)]
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :stack-name)]
      (. builder stackName data))
    (when-let [data (lookup-entry config id :template-file)]
      (. builder templateFile data))
    (when-let [data (lookup-entry config id :termination-protection)]
      (. builder terminationProtection data))
    (.build builder)))


(defn cloud-assembly-builder
  "The cloud-assembly-builder function buildes out new instances of 
CloudAssembly$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `skipEnumCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-enum-check` |
| `skipVersionCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-version-check` |
| `topoSort` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:topo-sort` |"
  [stack id config ^java.lang.String directory]
  (let [builder (CloudAssembly$Builder/create ^java.lang.String directory)]
    (when-let [data (lookup-entry config id :skip-enum-check)]
      (. builder skipEnumCheck data))
    (when-let [data (lookup-entry config id :skip-version-check)]
      (. builder skipVersionCheck data))
    (when-let [data (lookup-entry config id :topo-sort)]
      (. builder topoSort data))
    (.build builder)))


(defn cloud-assembly-builder-props-builder
  "The cloud-assembly-builder-props-builder function buildes out new instances of 
CloudAssemblyBuilderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetOutdir` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-outdir` |
| `parentBuilder` | software.amazon.awscdk.cxapi.CloudAssemblyBuilder | [[cdk.support/lookup-entry]] | `:parent-builder` |"
  [stack id config]
  (let [builder (CloudAssemblyBuilderProps$Builder.)]
    (when-let [data (lookup-entry config id :asset-outdir)]
      (. builder assetOutdir data))
    (when-let [data (lookup-entry config id :parent-builder)]
      (. builder parentBuilder data))
    (.build builder)))


(defn cloud-formation-stack-artifact-builder
  "The cloud-formation-stack-artifact-builder function buildes out new instances of 
CloudFormationStackArtifact$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dependencies` | java.util.List | [[cdk.support/lookup-entry]] | `:dependencies` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `properties` | software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | software.amazon.awscdk.cloudassembly.schema.ArtifactType | [[cdk.api.cloudassembly.schema/artifact-type]] | `:type` |"
  [stack id config ^software.amazon.awscdk.cxapi.CloudAssembly assembly ^java.lang.String artifact-id]
  (let [builder (CloudFormationStackArtifact$Builder/create ^software.amazon.awscdk.cxapi.CloudAssembly assembly ^java.lang.String artifact-id)]
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
    (.build builder)))


(defn endpoint-service-availability-zones-context-query-builder
  "The endpoint-service-availability-zones-context-query-builder function buildes out new instances of 
EndpointServiceAvailabilityZonesContextQuery$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (EndpointServiceAvailabilityZonesContextQuery$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn environment-builder
  "The environment-builder function buildes out new instances of 
Environment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (Environment$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn environment-placeholder-values-builder
  "The environment-placeholder-values-builder function buildes out new instances of 
EnvironmentPlaceholderValues$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `partition` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (EnvironmentPlaceholderValues$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :partition)]
      (. builder partition data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn key-context-response-builder
  "The key-context-response-builder function buildes out new instances of 
KeyContextResponse$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |"
  [stack id config]
  (let [builder (KeyContextResponse$Builder.)]
    (when-let [data (lookup-entry config id :key-id)]
      (. builder keyId data))
    (.build builder)))


(defn load-balancer-context-response-builder
  "The load-balancer-context-response-builder function buildes out new instances of 
LoadBalancerContextResponse$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipAddressType` | software.amazon.awscdk.cxapi.LoadBalancerIpAddressType | [[cdk.api.cxapi/load-balancer-ip-address-type]] | `:ip-address-type` |
| `loadBalancerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-arn` |
| `loadBalancerCanonicalHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-canonical-hosted-zone-id` |
| `loadBalancerDnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-dns-name` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (LoadBalancerContextResponse$Builder.)]
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
    (.build builder)))


(defn load-balancer-listener-context-response-builder
  "The load-balancer-listener-context-response-builder function buildes out new instances of 
LoadBalancerListenerContextResponse$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `listenerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener-arn` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |"
  [stack id config]
  (let [builder (LoadBalancerListenerContextResponse$Builder.)]
    (when-let [data (lookup-entry config id :listener-arn)]
      (. builder listenerArn data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (.build builder)))


(defn metadata-entry-result-builder
  "The metadata-entry-result-builder function buildes out new instances of 
MetadataEntryResult$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.util.List | [[cdk.support/lookup-entry]] | `:data` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `trace` | java.util.List | [[cdk.support/lookup-entry]] | `:trace` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (MetadataEntryResult$Builder.)]
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :trace)]
      (. builder trace data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn nested-cloud-assembly-artifact-builder
  "The nested-cloud-assembly-artifact-builder function buildes out new instances of 
NestedCloudAssemblyArtifact$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dependencies` | java.util.List | [[cdk.support/lookup-entry]] | `:dependencies` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `properties` | software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | software.amazon.awscdk.cloudassembly.schema.ArtifactType | [[cdk.api.cloudassembly.schema/artifact-type]] | `:type` |"
  [stack id config ^software.amazon.awscdk.cxapi.CloudAssembly assembly ^java.lang.String artifact-name]
  (let [builder (NestedCloudAssemblyArtifact$Builder/create ^software.amazon.awscdk.cxapi.CloudAssembly assembly ^java.lang.String artifact-name)]
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
    (.build builder)))


(defn security-group-context-response-builder
  "The security-group-context-response-builder function buildes out new instances of 
SecurityGroupContextResponse$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `securityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-group-id` |"
  [stack id config]
  (let [builder (SecurityGroupContextResponse$Builder.)]
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :security-group-id)]
      (. builder securityGroupId data))
    (.build builder)))


(defn synthesis-message-builder
  "The synthesis-message-builder function buildes out new instances of 
SynthesisMessage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entry` | software.amazon.awscdk.cloudassembly.schema.MetadataEntry | [[cdk.support/lookup-entry]] | `:entry` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `level` | software.amazon.awscdk.cxapi.SynthesisMessageLevel | [[cdk.api.cxapi/synthesis-message-level]] | `:level` |"
  [stack id config]
  (let [builder (SynthesisMessage$Builder.)]
    (when-let [data (lookup-entry config id :entry)]
      (. builder entry data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (synthesis-message-level config id :level)]
      (. builder level data))
    (.build builder)))


(defn tree-cloud-artifact-builder
  "The tree-cloud-artifact-builder function buildes out new instances of 
TreeCloudArtifact$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dependencies` | java.util.List | [[cdk.support/lookup-entry]] | `:dependencies` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `metadata` | java.util.Map | [[cdk.support/lookup-entry]] | `:metadata` |
| `properties` | software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties | [[cdk.support/lookup-entry]] | `:properties` |
| `type` | software.amazon.awscdk.cloudassembly.schema.ArtifactType | [[cdk.api.cloudassembly.schema/artifact-type]] | `:type` |"
  [stack id config ^software.amazon.awscdk.cxapi.CloudAssembly assembly ^java.lang.String artifact-name]
  (let [builder (TreeCloudArtifact$Builder/create ^software.amazon.awscdk.cxapi.CloudAssembly assembly ^java.lang.String artifact-name)]
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
    (.build builder)))


(defn vpc-context-response-builder
  "The vpc-context-response-builder function buildes out new instances of 
VpcContextResponse$Builder using the provided configuration.  Each field is set as follows:

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
| `vpnGatewayId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpn-gateway-id` |"
  [stack id config]
  (let [builder (VpcContextResponse$Builder.)]
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
    (.build builder)))


(defn vpc-subnet-builder
  "The vpc-subnet-builder function buildes out new instances of 
VpcSubnet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `cidr` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidr` |
| `routeTableId` | java.lang.String | [[cdk.support/lookup-entry]] | `:route-table-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (VpcSubnet$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :cidr)]
      (. builder cidr data))
    (when-let [data (lookup-entry config id :route-table-id)]
      (. builder routeTableId data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn vpc-subnet-group-builder
  "The vpc-subnet-group-builder function buildes out new instances of 
VpcSubnetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `type` | software.amazon.awscdk.cxapi.VpcSubnetGroupType | [[cdk.api.cxapi/vpc-subnet-group-type]] | `:type` |"
  [stack id config]
  (let [builder (VpcSubnetGroup$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (vpc-subnet-group-type config id :type)]
      (. builder type data))
    (.build builder)))