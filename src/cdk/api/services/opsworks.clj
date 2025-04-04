(ns cdk.api.services.opsworks
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.opsworks package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.opsworks CfnApp$Builder
                                                     CfnApp$DataSourceProperty$Builder
                                                     CfnApp$EnvironmentVariableProperty$Builder
                                                     CfnApp$SourceProperty$Builder
                                                     CfnApp$SslConfigurationProperty$Builder
                                                     CfnAppProps$Builder
                                                     CfnElasticLoadBalancerAttachment$Builder
                                                     CfnElasticLoadBalancerAttachmentProps$Builder
                                                     CfnInstance$BlockDeviceMappingProperty$Builder
                                                     CfnInstance$Builder
                                                     CfnInstance$EbsBlockDeviceProperty$Builder
                                                     CfnInstance$TimeBasedAutoScalingProperty$Builder
                                                     CfnInstanceProps$Builder
                                                     CfnLayer$AutoScalingThresholdsProperty$Builder
                                                     CfnLayer$Builder
                                                     CfnLayer$LifecycleEventConfigurationProperty$Builder
                                                     CfnLayer$LoadBasedAutoScalingProperty$Builder
                                                     CfnLayer$RecipesProperty$Builder
                                                     CfnLayer$ShutdownEventConfigurationProperty$Builder
                                                     CfnLayer$VolumeConfigurationProperty$Builder
                                                     CfnLayerProps$Builder
                                                     CfnStack$Builder
                                                     CfnStack$ChefConfigurationProperty$Builder
                                                     CfnStack$ElasticIpProperty$Builder
                                                     CfnStack$RdsDbInstanceProperty$Builder
                                                     CfnStack$SourceProperty$Builder
                                                     CfnStack$StackConfigurationManagerProperty$Builder
                                                     CfnStackProps$Builder
                                                     CfnUserProfile$Builder
                                                     CfnUserProfileProps$Builder
                                                     CfnVolume$Builder
                                                     CfnVolumeProps$Builder]))


(defn cfn-app-builder>
  "The cfn-app-builder> function updates a CfnApp$Builder instance using the provided configuration.
  The function takes the CfnApp$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:app-source` |
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `dataSources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-sources` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domains` | java.util.List | [[cdk.support/lookup-entry]] | `:domains` |
| `enableSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ssl` |
| `environment` | java.util.List | [[cdk.support/lookup-entry]] | `:environment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `shortname` | java.lang.String | [[cdk.support/lookup-entry]] | `:shortname` |
| `sslConfiguration` | software.amazon.awscdk.services.opsworks.CfnApp$SslConfigurationProperty | [[cdk.support/lookup-entry]] | `:ssl-configuration` |
| `stackId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnApp$Builder builder id config]
  (when-some [data (lookup-entry config id :app-source)]
    (. builder appSource data))
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :data-sources)]
    (. builder dataSources data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :domains)]
    (. builder domains data))
  (when-some [data (lookup-entry config id :enable-ssl)]
    (. builder enableSsl data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :shortname)]
    (. builder shortname data))
  (when-some [data (lookup-entry config id :ssl-configuration)]
    (. builder sslConfiguration data))
  (when-some [data (lookup-entry config id :stack-id)]
    (. builder stackId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-app-builder
  "Creates a  `CfnApp$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-app-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-app-builder> (CfnApp$Builder/create scope (name id)) id config))


(defn cfn-app-data-source-property-builder>
  "The cfn-app-data-source-property-builder> function updates a CfnApp$DataSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnApp$DataSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnApp$DataSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-app-data-source-property-builder
  "Creates a  `CfnApp$DataSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-app-data-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-app-data-source-property-builder> (new CfnApp$DataSourceProperty$Builder) id config))


(defn cfn-app-environment-variable-property-builder>
  "The cfn-app-environment-variable-property-builder> function updates a CfnApp$EnvironmentVariableProperty$Builder instance using the provided configuration.
  The function takes the CfnApp$EnvironmentVariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `secure` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:secure` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnApp$EnvironmentVariableProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :secure)]
    (. builder secure data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-app-environment-variable-property-builder
  "Creates a  `CfnApp$EnvironmentVariableProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-app-environment-variable-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-app-environment-variable-property-builder> (new CfnApp$EnvironmentVariableProperty$Builder) id config))


(defn cfn-app-props-builder>
  "The cfn-app-props-builder> function updates a CfnAppProps$Builder instance using the provided configuration.
  The function takes the CfnAppProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appSource` | software.amazon.awscdk.services.opsworks.CfnApp$SourceProperty | [[cdk.support/lookup-entry]] | `:app-source` |
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `dataSources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-sources` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `domains` | java.util.List | [[cdk.support/lookup-entry]] | `:domains` |
| `enableSsl` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ssl` |
| `environment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `shortname` | java.lang.String | [[cdk.support/lookup-entry]] | `:shortname` |
| `sslConfiguration` | software.amazon.awscdk.services.opsworks.CfnApp$SslConfigurationProperty | [[cdk.support/lookup-entry]] | `:ssl-configuration` |
| `stackId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-id` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAppProps$Builder builder id config]
  (when-some [data (lookup-entry config id :app-source)]
    (. builder appSource data))
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :data-sources)]
    (. builder dataSources data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :domains)]
    (. builder domains data))
  (when-some [data (lookup-entry config id :enable-ssl)]
    (. builder enableSsl data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :shortname)]
    (. builder shortname data))
  (when-some [data (lookup-entry config id :ssl-configuration)]
    (. builder sslConfiguration data))
  (when-some [data (lookup-entry config id :stack-id)]
    (. builder stackId data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-app-props-builder
  "Creates a  `CfnAppProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-app-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-app-props-builder> (new CfnAppProps$Builder) id config))


(defn cfn-app-source-property-builder>
  "The cfn-app-source-property-builder> function updates a CfnApp$SourceProperty$Builder instance using the provided configuration.
  The function takes the CfnApp$SourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `revision` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision` |
| `sshKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssh-key` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnApp$SourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :revision)]
    (. builder revision data))
  (when-some [data (lookup-entry config id :ssh-key)]
    (. builder sshKey data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-app-source-property-builder
  "Creates a  `CfnApp$SourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-app-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-app-source-property-builder> (new CfnApp$SourceProperty$Builder) id config))


(defn cfn-app-ssl-configuration-property-builder>
  "The cfn-app-ssl-configuration-property-builder> function updates a CfnApp$SslConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApp$SslConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `chain` | java.lang.String | [[cdk.support/lookup-entry]] | `:chain` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
"
  [^CfnApp$SslConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :chain)]
    (. builder chain data))
  (when-some [data (lookup-entry config id :private-key)]
    (. builder privateKey data))
  (.build builder))


(defn cfn-app-ssl-configuration-property-builder
  "Creates a  `CfnApp$SslConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-app-ssl-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-app-ssl-configuration-property-builder> (new CfnApp$SslConfigurationProperty$Builder) id config))


(defn cfn-elastic-load-balancer-attachment-builder>
  "The cfn-elastic-load-balancer-attachment-builder> function updates a CfnElasticLoadBalancerAttachment$Builder instance using the provided configuration.
  The function takes the CfnElasticLoadBalancerAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `elasticLoadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:elastic-load-balancer-name` |
| `layerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-id` |
"
  [^CfnElasticLoadBalancerAttachment$Builder builder id config]
  (when-some [data (lookup-entry config id :elastic-load-balancer-name)]
    (. builder elasticLoadBalancerName data))
  (when-some [data (lookup-entry config id :layer-id)]
    (. builder layerId data))
  (.build builder))


(defn cfn-elastic-load-balancer-attachment-builder
  "Creates a  `CfnElasticLoadBalancerAttachment$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-elastic-load-balancer-attachment-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-elastic-load-balancer-attachment-builder> (CfnElasticLoadBalancerAttachment$Builder/create scope (name id)) id config))


(defn cfn-elastic-load-balancer-attachment-props-builder>
  "The cfn-elastic-load-balancer-attachment-props-builder> function updates a CfnElasticLoadBalancerAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnElasticLoadBalancerAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `elasticLoadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:elastic-load-balancer-name` |
| `layerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:layer-id` |
"
  [^CfnElasticLoadBalancerAttachmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :elastic-load-balancer-name)]
    (. builder elasticLoadBalancerName data))
  (when-some [data (lookup-entry config id :layer-id)]
    (. builder layerId data))
  (.build builder))


(defn cfn-elastic-load-balancer-attachment-props-builder
  "Creates a  `CfnElasticLoadBalancerAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-elastic-load-balancer-attachment-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-elastic-load-balancer-attachment-props-builder> (new CfnElasticLoadBalancerAttachmentProps$Builder) id config))


(defn cfn-instance-block-device-mapping-property-builder>
  "The cfn-instance-block-device-mapping-property-builder> function updates a CfnInstance$BlockDeviceMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$BlockDeviceMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-name` |
| `ebs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs` |
| `noDevice` | java.lang.String | [[cdk.support/lookup-entry]] | `:no-device` |
| `virtualName` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtual-name` |
"
  [^CfnInstance$BlockDeviceMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :device-name)]
    (. builder deviceName data))
  (when-some [data (lookup-entry config id :ebs)]
    (. builder ebs data))
  (when-some [data (lookup-entry config id :no-device)]
    (. builder noDevice data))
  (when-some [data (lookup-entry config id :virtual-name)]
    (. builder virtualName data))
  (.build builder))


(defn cfn-instance-block-device-mapping-property-builder
  "Creates a  `CfnInstance$BlockDeviceMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-instance-block-device-mapping-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-instance-block-device-mapping-property-builder> (new CfnInstance$BlockDeviceMappingProperty$Builder) id config))


(defn cfn-instance-builder>
  "The cfn-instance-builder> function updates a CfnInstance$Builder instance using the provided configuration.
  The function takes the CfnInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-version` |
| `amiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ami-id` |
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `autoScalingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-type` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `blockDeviceMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `ebsOptimized` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `elasticIps` | java.util.List | [[cdk.support/lookup-entry]] | `:elastic-ips` |
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `installUpdatesOnBoot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:install-updates-on-boot` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `layerIds` | java.util.List | [[cdk.support/lookup-entry]] | `:layer-ids` |
| `os` | java.lang.String | [[cdk.support/lookup-entry]] | `:os` |
| `rootDeviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-device-type` |
| `sshKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssh-key-name` |
| `stackId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenancy` |
| `timeBasedAutoScaling` | software.amazon.awscdk.services.opsworks.CfnInstance$TimeBasedAutoScalingProperty | [[cdk.support/lookup-entry]] | `:time-based-auto-scaling` |
| `virtualizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtualization-type` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^CfnInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-version)]
    (. builder agentVersion data))
  (when-some [data (lookup-entry config id :ami-id)]
    (. builder amiId data))
  (when-some [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-some [data (lookup-entry config id :auto-scaling-type)]
    (. builder autoScalingType data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :block-device-mappings)]
    (. builder blockDeviceMappings data))
  (when-some [data (lookup-entry config id :ebs-optimized)]
    (. builder ebsOptimized data))
  (when-some [data (lookup-entry config id :elastic-ips)]
    (. builder elasticIps data))
  (when-some [data (lookup-entry config id :hostname)]
    (. builder hostname data))
  (when-some [data (lookup-entry config id :install-updates-on-boot)]
    (. builder installUpdatesOnBoot data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :layer-ids)]
    (. builder layerIds data))
  (when-some [data (lookup-entry config id :os)]
    (. builder os data))
  (when-some [data (lookup-entry config id :root-device-type)]
    (. builder rootDeviceType data))
  (when-some [data (lookup-entry config id :ssh-key-name)]
    (. builder sshKeyName data))
  (when-some [data (lookup-entry config id :stack-id)]
    (. builder stackId data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (when-some [data (lookup-entry config id :tenancy)]
    (. builder tenancy data))
  (when-some [data (lookup-entry config id :time-based-auto-scaling)]
    (. builder timeBasedAutoScaling data))
  (when-some [data (lookup-entry config id :virtualization-type)]
    (. builder virtualizationType data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn cfn-instance-builder
  "Creates a  `CfnInstance$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-instance-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-instance-builder> (CfnInstance$Builder/create scope (name id)) id config))


(defn cfn-instance-ebs-block-device-property-builder>
  "The cfn-instance-ebs-block-device-property-builder> function updates a CfnInstance$EbsBlockDeviceProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$EbsBlockDeviceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteOnTermination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-on-termination` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `snapshotId` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-id` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |
"
  [^CfnInstance$EbsBlockDeviceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-on-termination)]
    (. builder deleteOnTermination data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :snapshot-id)]
    (. builder snapshotId data))
  (when-some [data (lookup-entry config id :volume-size)]
    (. builder volumeSize data))
  (when-some [data (lookup-entry config id :volume-type)]
    (. builder volumeType data))
  (.build builder))


(defn cfn-instance-ebs-block-device-property-builder
  "Creates a  `CfnInstance$EbsBlockDeviceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-instance-ebs-block-device-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-instance-ebs-block-device-property-builder> (new CfnInstance$EbsBlockDeviceProperty$Builder) id config))


(defn cfn-instance-props-builder>
  "The cfn-instance-props-builder> function updates a CfnInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-version` |
| `amiId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ami-id` |
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `autoScalingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-type` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `blockDeviceMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block-device-mappings` |
| `ebsOptimized` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-optimized` |
| `elasticIps` | java.util.List | [[cdk.support/lookup-entry]] | `:elastic-ips` |
| `hostname` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname` |
| `installUpdatesOnBoot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:install-updates-on-boot` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `layerIds` | java.util.List | [[cdk.support/lookup-entry]] | `:layer-ids` |
| `os` | java.lang.String | [[cdk.support/lookup-entry]] | `:os` |
| `rootDeviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:root-device-type` |
| `sshKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssh-key-name` |
| `stackId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-id` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tenancy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tenancy` |
| `timeBasedAutoScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:time-based-auto-scaling` |
| `virtualizationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:virtualization-type` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
"
  [^CfnInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-version)]
    (. builder agentVersion data))
  (when-some [data (lookup-entry config id :ami-id)]
    (. builder amiId data))
  (when-some [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-some [data (lookup-entry config id :auto-scaling-type)]
    (. builder autoScalingType data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :block-device-mappings)]
    (. builder blockDeviceMappings data))
  (when-some [data (lookup-entry config id :ebs-optimized)]
    (. builder ebsOptimized data))
  (when-some [data (lookup-entry config id :elastic-ips)]
    (. builder elasticIps data))
  (when-some [data (lookup-entry config id :hostname)]
    (. builder hostname data))
  (when-some [data (lookup-entry config id :install-updates-on-boot)]
    (. builder installUpdatesOnBoot data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :layer-ids)]
    (. builder layerIds data))
  (when-some [data (lookup-entry config id :os)]
    (. builder os data))
  (when-some [data (lookup-entry config id :root-device-type)]
    (. builder rootDeviceType data))
  (when-some [data (lookup-entry config id :ssh-key-name)]
    (. builder sshKeyName data))
  (when-some [data (lookup-entry config id :stack-id)]
    (. builder stackId data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (when-some [data (lookup-entry config id :tenancy)]
    (. builder tenancy data))
  (when-some [data (lookup-entry config id :time-based-auto-scaling)]
    (. builder timeBasedAutoScaling data))
  (when-some [data (lookup-entry config id :virtualization-type)]
    (. builder virtualizationType data))
  (when-some [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (.build builder))


(defn cfn-instance-props-builder
  "Creates a  `CfnInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-instance-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-instance-props-builder> (new CfnInstanceProps$Builder) id config))


(defn cfn-instance-time-based-auto-scaling-property-builder>
  "The cfn-instance-time-based-auto-scaling-property-builder> function updates a CfnInstance$TimeBasedAutoScalingProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$TimeBasedAutoScalingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `friday` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:friday` |
| `monday` | java.util.Map | [[cdk.support/lookup-entry]] | `:monday` |
| `saturday` | java.util.Map | [[cdk.support/lookup-entry]] | `:saturday` |
| `sunday` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sunday` |
| `thursday` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:thursday` |
| `tuesday` | java.util.Map | [[cdk.support/lookup-entry]] | `:tuesday` |
| `wednesday` | java.util.Map | [[cdk.support/lookup-entry]] | `:wednesday` |
"
  [^CfnInstance$TimeBasedAutoScalingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :friday)]
    (. builder friday data))
  (when-some [data (lookup-entry config id :monday)]
    (. builder monday data))
  (when-some [data (lookup-entry config id :saturday)]
    (. builder saturday data))
  (when-some [data (lookup-entry config id :sunday)]
    (. builder sunday data))
  (when-some [data (lookup-entry config id :thursday)]
    (. builder thursday data))
  (when-some [data (lookup-entry config id :tuesday)]
    (. builder tuesday data))
  (when-some [data (lookup-entry config id :wednesday)]
    (. builder wednesday data))
  (.build builder))


(defn cfn-instance-time-based-auto-scaling-property-builder
  "Creates a  `CfnInstance$TimeBasedAutoScalingProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-instance-time-based-auto-scaling-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-instance-time-based-auto-scaling-property-builder> (new CfnInstance$TimeBasedAutoScalingProperty$Builder) id config))


(defn cfn-layer-auto-scaling-thresholds-property-builder>
  "The cfn-layer-auto-scaling-thresholds-property-builder> function updates a CfnLayer$AutoScalingThresholdsProperty$Builder instance using the provided configuration.
  The function takes the CfnLayer$AutoScalingThresholdsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-threshold` |
| `ignoreMetricsTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ignore-metrics-time` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `loadThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:load-threshold` |
| `memoryThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-threshold` |
| `thresholdsWaitTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:thresholds-wait-time` |
"
  [^CfnLayer$AutoScalingThresholdsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cpu-threshold)]
    (. builder cpuThreshold data))
  (when-some [data (lookup-entry config id :ignore-metrics-time)]
    (. builder ignoreMetricsTime data))
  (when-some [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-some [data (lookup-entry config id :load-threshold)]
    (. builder loadThreshold data))
  (when-some [data (lookup-entry config id :memory-threshold)]
    (. builder memoryThreshold data))
  (when-some [data (lookup-entry config id :thresholds-wait-time)]
    (. builder thresholdsWaitTime data))
  (.build builder))


(defn cfn-layer-auto-scaling-thresholds-property-builder
  "Creates a  `CfnLayer$AutoScalingThresholdsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-layer-auto-scaling-thresholds-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-layer-auto-scaling-thresholds-property-builder> (new CfnLayer$AutoScalingThresholdsProperty$Builder) id config))


(defn cfn-layer-builder>
  "The cfn-layer-builder> function updates a CfnLayer$Builder instance using the provided configuration.
  The function takes the CfnLayer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `autoAssignElasticIps` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-assign-elastic-ips` |
| `autoAssignPublicIps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-assign-public-ips` |
| `customInstanceProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-instance-profile-arn` |
| `customJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-json` |
| `customRecipes` | software.amazon.awscdk.services.opsworks.CfnLayer$RecipesProperty | [[cdk.support/lookup-entry]] | `:custom-recipes` |
| `customSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-security-group-ids` |
| `enableAutoHealing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-auto-healing` |
| `installUpdatesOnBoot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:install-updates-on-boot` |
| `lifecycleEventConfiguration` | software.amazon.awscdk.services.opsworks.CfnLayer$LifecycleEventConfigurationProperty | [[cdk.support/lookup-entry]] | `:lifecycle-event-configuration` |
| `loadBasedAutoScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:load-based-auto-scaling` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packages` | java.util.List | [[cdk.support/lookup-entry]] | `:packages` |
| `shortname` | java.lang.String | [[cdk.support/lookup-entry]] | `:shortname` |
| `stackId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `useEbsOptimizedInstances` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-ebs-optimized-instances` |
| `volumeConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volume-configurations` |
"
  [^CfnLayer$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :auto-assign-elastic-ips)]
    (. builder autoAssignElasticIps data))
  (when-some [data (lookup-entry config id :auto-assign-public-ips)]
    (. builder autoAssignPublicIps data))
  (when-some [data (lookup-entry config id :custom-instance-profile-arn)]
    (. builder customInstanceProfileArn data))
  (when-some [data (lookup-entry config id :custom-json)]
    (. builder customJson data))
  (when-some [data (lookup-entry config id :custom-recipes)]
    (. builder customRecipes data))
  (when-some [data (lookup-entry config id :custom-security-group-ids)]
    (. builder customSecurityGroupIds data))
  (when-some [data (lookup-entry config id :enable-auto-healing)]
    (. builder enableAutoHealing data))
  (when-some [data (lookup-entry config id :install-updates-on-boot)]
    (. builder installUpdatesOnBoot data))
  (when-some [data (lookup-entry config id :lifecycle-event-configuration)]
    (. builder lifecycleEventConfiguration data))
  (when-some [data (lookup-entry config id :load-based-auto-scaling)]
    (. builder loadBasedAutoScaling data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :packages)]
    (. builder packages data))
  (when-some [data (lookup-entry config id :shortname)]
    (. builder shortname data))
  (when-some [data (lookup-entry config id :stack-id)]
    (. builder stackId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :use-ebs-optimized-instances)]
    (. builder useEbsOptimizedInstances data))
  (when-some [data (lookup-entry config id :volume-configurations)]
    (. builder volumeConfigurations data))
  (.build builder))


(defn cfn-layer-builder
  "Creates a  `CfnLayer$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-layer-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-layer-builder> (CfnLayer$Builder/create scope (name id)) id config))


(defn cfn-layer-lifecycle-event-configuration-property-builder>
  "The cfn-layer-lifecycle-event-configuration-property-builder> function updates a CfnLayer$LifecycleEventConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLayer$LifecycleEventConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `shutdownEventConfiguration` | software.amazon.awscdk.services.opsworks.CfnLayer$ShutdownEventConfigurationProperty | [[cdk.support/lookup-entry]] | `:shutdown-event-configuration` |
"
  [^CfnLayer$LifecycleEventConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :shutdown-event-configuration)]
    (. builder shutdownEventConfiguration data))
  (.build builder))


(defn cfn-layer-lifecycle-event-configuration-property-builder
  "Creates a  `CfnLayer$LifecycleEventConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-layer-lifecycle-event-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-layer-lifecycle-event-configuration-property-builder> (new CfnLayer$LifecycleEventConfigurationProperty$Builder) id config))


(defn cfn-layer-load-based-auto-scaling-property-builder>
  "The cfn-layer-load-based-auto-scaling-property-builder> function updates a CfnLayer$LoadBasedAutoScalingProperty$Builder instance using the provided configuration.
  The function takes the CfnLayer$LoadBasedAutoScalingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `downScaling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:down-scaling` |
| `enable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable` |
| `upScaling` | software.amazon.awscdk.services.opsworks.CfnLayer$AutoScalingThresholdsProperty | [[cdk.support/lookup-entry]] | `:up-scaling` |
"
  [^CfnLayer$LoadBasedAutoScalingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :down-scaling)]
    (. builder downScaling data))
  (when-some [data (lookup-entry config id :enable)]
    (. builder enable data))
  (when-some [data (lookup-entry config id :up-scaling)]
    (. builder upScaling data))
  (.build builder))


(defn cfn-layer-load-based-auto-scaling-property-builder
  "Creates a  `CfnLayer$LoadBasedAutoScalingProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-layer-load-based-auto-scaling-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-layer-load-based-auto-scaling-property-builder> (new CfnLayer$LoadBasedAutoScalingProperty$Builder) id config))


(defn cfn-layer-props-builder>
  "The cfn-layer-props-builder> function updates a CfnLayerProps$Builder instance using the provided configuration.
  The function takes the CfnLayerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `autoAssignElasticIps` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-assign-elastic-ips` |
| `autoAssignPublicIps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-assign-public-ips` |
| `customInstanceProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-instance-profile-arn` |
| `customJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-json` |
| `customRecipes` | software.amazon.awscdk.services.opsworks.CfnLayer$RecipesProperty | [[cdk.support/lookup-entry]] | `:custom-recipes` |
| `customSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-security-group-ids` |
| `enableAutoHealing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-auto-healing` |
| `installUpdatesOnBoot` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:install-updates-on-boot` |
| `lifecycleEventConfiguration` | software.amazon.awscdk.services.opsworks.CfnLayer$LifecycleEventConfigurationProperty | [[cdk.support/lookup-entry]] | `:lifecycle-event-configuration` |
| `loadBasedAutoScaling` | software.amazon.awscdk.services.opsworks.CfnLayer$LoadBasedAutoScalingProperty | [[cdk.support/lookup-entry]] | `:load-based-auto-scaling` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `packages` | java.util.List | [[cdk.support/lookup-entry]] | `:packages` |
| `shortname` | java.lang.String | [[cdk.support/lookup-entry]] | `:shortname` |
| `stackId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `useEbsOptimizedInstances` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-ebs-optimized-instances` |
| `volumeConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:volume-configurations` |
"
  [^CfnLayerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :auto-assign-elastic-ips)]
    (. builder autoAssignElasticIps data))
  (when-some [data (lookup-entry config id :auto-assign-public-ips)]
    (. builder autoAssignPublicIps data))
  (when-some [data (lookup-entry config id :custom-instance-profile-arn)]
    (. builder customInstanceProfileArn data))
  (when-some [data (lookup-entry config id :custom-json)]
    (. builder customJson data))
  (when-some [data (lookup-entry config id :custom-recipes)]
    (. builder customRecipes data))
  (when-some [data (lookup-entry config id :custom-security-group-ids)]
    (. builder customSecurityGroupIds data))
  (when-some [data (lookup-entry config id :enable-auto-healing)]
    (. builder enableAutoHealing data))
  (when-some [data (lookup-entry config id :install-updates-on-boot)]
    (. builder installUpdatesOnBoot data))
  (when-some [data (lookup-entry config id :lifecycle-event-configuration)]
    (. builder lifecycleEventConfiguration data))
  (when-some [data (lookup-entry config id :load-based-auto-scaling)]
    (. builder loadBasedAutoScaling data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :packages)]
    (. builder packages data))
  (when-some [data (lookup-entry config id :shortname)]
    (. builder shortname data))
  (when-some [data (lookup-entry config id :stack-id)]
    (. builder stackId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :use-ebs-optimized-instances)]
    (. builder useEbsOptimizedInstances data))
  (when-some [data (lookup-entry config id :volume-configurations)]
    (. builder volumeConfigurations data))
  (.build builder))


(defn cfn-layer-props-builder
  "Creates a  `CfnLayerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-layer-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-layer-props-builder> (new CfnLayerProps$Builder) id config))


(defn cfn-layer-recipes-property-builder>
  "The cfn-layer-recipes-property-builder> function updates a CfnLayer$RecipesProperty$Builder instance using the provided configuration.
  The function takes the CfnLayer$RecipesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configure` | java.util.List | [[cdk.support/lookup-entry]] | `:configure` |
| `deploy` | java.util.List | [[cdk.support/lookup-entry]] | `:deploy` |
| `setup` | java.util.List | [[cdk.support/lookup-entry]] | `:setup` |
| `shutdown` | java.util.List | [[cdk.support/lookup-entry]] | `:shutdown` |
| `undeploy` | java.util.List | [[cdk.support/lookup-entry]] | `:undeploy` |
"
  [^CfnLayer$RecipesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :configure)]
    (. builder configure data))
  (when-some [data (lookup-entry config id :deploy)]
    (. builder deploy data))
  (when-some [data (lookup-entry config id :setup)]
    (. builder setup data))
  (when-some [data (lookup-entry config id :shutdown)]
    (. builder shutdown data))
  (when-some [data (lookup-entry config id :undeploy)]
    (. builder undeploy data))
  (.build builder))


(defn cfn-layer-recipes-property-builder
  "Creates a  `CfnLayer$RecipesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-layer-recipes-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-layer-recipes-property-builder> (new CfnLayer$RecipesProperty$Builder) id config))


(defn cfn-layer-shutdown-event-configuration-property-builder>
  "The cfn-layer-shutdown-event-configuration-property-builder> function updates a CfnLayer$ShutdownEventConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLayer$ShutdownEventConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `delayUntilElbConnectionsDrained` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delay-until-elb-connections-drained` |
| `executionTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:execution-timeout` |
"
  [^CfnLayer$ShutdownEventConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :delay-until-elb-connections-drained)]
    (. builder delayUntilElbConnectionsDrained data))
  (when-some [data (lookup-entry config id :execution-timeout)]
    (. builder executionTimeout data))
  (.build builder))


(defn cfn-layer-shutdown-event-configuration-property-builder
  "Creates a  `CfnLayer$ShutdownEventConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-layer-shutdown-event-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-layer-shutdown-event-configuration-property-builder> (new CfnLayer$ShutdownEventConfigurationProperty$Builder) id config))


(defn cfn-layer-volume-configuration-property-builder>
  "The cfn-layer-volume-configuration-property-builder> function updates a CfnLayer$VolumeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLayer$VolumeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |
| `numberOfDisks` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-disks` |
| `raidLevel` | java.lang.Number | [[cdk.support/lookup-entry]] | `:raid-level` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |
"
  [^CfnLayer$VolumeConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :mount-point)]
    (. builder mountPoint data))
  (when-some [data (lookup-entry config id :number-of-disks)]
    (. builder numberOfDisks data))
  (when-some [data (lookup-entry config id :raid-level)]
    (. builder raidLevel data))
  (when-some [data (lookup-entry config id :size)]
    (. builder size data))
  (when-some [data (lookup-entry config id :volume-type)]
    (. builder volumeType data))
  (.build builder))


(defn cfn-layer-volume-configuration-property-builder
  "Creates a  `CfnLayer$VolumeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-layer-volume-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-layer-volume-configuration-property-builder> (new CfnLayer$VolumeConfigurationProperty$Builder) id config))


(defn cfn-stack-builder>
  "The cfn-stack-builder> function updates a CfnStack$Builder instance using the provided configuration.
  The function takes the CfnStack$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-version` |
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `chefConfiguration` | software.amazon.awscdk.services.opsworks.CfnStack$ChefConfigurationProperty | [[cdk.support/lookup-entry]] | `:chef-configuration` |
| `cloneAppIds` | java.util.List | [[cdk.support/lookup-entry]] | `:clone-app-ids` |
| `clonePermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:clone-permissions` |
| `configurationManager` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-manager` |
| `customCookbooksSource` | software.amazon.awscdk.services.opsworks.CfnStack$SourceProperty | [[cdk.support/lookup-entry]] | `:custom-cookbooks-source` |
| `customJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-json` |
| `defaultAvailabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-availability-zone` |
| `defaultInstanceProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-instance-profile-arn` |
| `defaultOs` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-os` |
| `defaultRootDeviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-root-device-type` |
| `defaultSshKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-ssh-key-name` |
| `defaultSubnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-subnet-id` |
| `ecsClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ecs-cluster-arn` |
| `elasticIps` | java.util.List | [[cdk.support/lookup-entry]] | `:elastic-ips` |
| `hostnameTheme` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname-theme` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rdsDbInstances` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rds-db-instances` |
| `serviceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role-arn` |
| `sourceStackId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-stack-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `useCustomCookbooks` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-custom-cookbooks` |
| `useOpsworksSecurityGroups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-opsworks-security-groups` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnStack$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-version)]
    (. builder agentVersion data))
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :chef-configuration)]
    (. builder chefConfiguration data))
  (when-some [data (lookup-entry config id :clone-app-ids)]
    (. builder cloneAppIds data))
  (when-some [data (lookup-entry config id :clone-permissions)]
    (. builder clonePermissions data))
  (when-some [data (lookup-entry config id :configuration-manager)]
    (. builder configurationManager data))
  (when-some [data (lookup-entry config id :custom-cookbooks-source)]
    (. builder customCookbooksSource data))
  (when-some [data (lookup-entry config id :custom-json)]
    (. builder customJson data))
  (when-some [data (lookup-entry config id :default-availability-zone)]
    (. builder defaultAvailabilityZone data))
  (when-some [data (lookup-entry config id :default-instance-profile-arn)]
    (. builder defaultInstanceProfileArn data))
  (when-some [data (lookup-entry config id :default-os)]
    (. builder defaultOs data))
  (when-some [data (lookup-entry config id :default-root-device-type)]
    (. builder defaultRootDeviceType data))
  (when-some [data (lookup-entry config id :default-ssh-key-name)]
    (. builder defaultSshKeyName data))
  (when-some [data (lookup-entry config id :default-subnet-id)]
    (. builder defaultSubnetId data))
  (when-some [data (lookup-entry config id :ecs-cluster-arn)]
    (. builder ecsClusterArn data))
  (when-some [data (lookup-entry config id :elastic-ips)]
    (. builder elasticIps data))
  (when-some [data (lookup-entry config id :hostname-theme)]
    (. builder hostnameTheme data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rds-db-instances)]
    (. builder rdsDbInstances data))
  (when-some [data (lookup-entry config id :service-role-arn)]
    (. builder serviceRoleArn data))
  (when-some [data (lookup-entry config id :source-stack-id)]
    (. builder sourceStackId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :use-custom-cookbooks)]
    (. builder useCustomCookbooks data))
  (when-some [data (lookup-entry config id :use-opsworks-security-groups)]
    (. builder useOpsworksSecurityGroups data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-stack-builder
  "Creates a  `CfnStack$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-stack-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-stack-builder> (CfnStack$Builder/create scope (name id)) id config))


(defn cfn-stack-chef-configuration-property-builder>
  "The cfn-stack-chef-configuration-property-builder> function updates a CfnStack$ChefConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$ChefConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `berkshelfVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:berkshelf-version` |
| `manageBerkshelf` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:manage-berkshelf` |
"
  [^CfnStack$ChefConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :berkshelf-version)]
    (. builder berkshelfVersion data))
  (when-some [data (lookup-entry config id :manage-berkshelf)]
    (. builder manageBerkshelf data))
  (.build builder))


(defn cfn-stack-chef-configuration-property-builder
  "Creates a  `CfnStack$ChefConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-chef-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-chef-configuration-property-builder> (new CfnStack$ChefConfigurationProperty$Builder) id config))


(defn cfn-stack-elastic-ip-property-builder>
  "The cfn-stack-elastic-ip-property-builder> function updates a CfnStack$ElasticIpProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$ElasticIpProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnStack$ElasticIpProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ip)]
    (. builder ip data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-stack-elastic-ip-property-builder
  "Creates a  `CfnStack$ElasticIpProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-elastic-ip-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-elastic-ip-property-builder> (new CfnStack$ElasticIpProperty$Builder) id config))


(defn cfn-stack-props-builder>
  "The cfn-stack-props-builder> function updates a CfnStackProps$Builder instance using the provided configuration.
  The function takes the CfnStackProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-version` |
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `chefConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:chef-configuration` |
| `cloneAppIds` | java.util.List | [[cdk.support/lookup-entry]] | `:clone-app-ids` |
| `clonePermissions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:clone-permissions` |
| `configurationManager` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration-manager` |
| `customCookbooksSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-cookbooks-source` |
| `customJson` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-json` |
| `defaultAvailabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-availability-zone` |
| `defaultInstanceProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-instance-profile-arn` |
| `defaultOs` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-os` |
| `defaultRootDeviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-root-device-type` |
| `defaultSshKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-ssh-key-name` |
| `defaultSubnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-subnet-id` |
| `ecsClusterArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ecs-cluster-arn` |
| `elasticIps` | java.util.List | [[cdk.support/lookup-entry]] | `:elastic-ips` |
| `hostnameTheme` | java.lang.String | [[cdk.support/lookup-entry]] | `:hostname-theme` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rdsDbInstances` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rds-db-instances` |
| `serviceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role-arn` |
| `sourceStackId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-stack-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `useCustomCookbooks` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-custom-cookbooks` |
| `useOpsworksSecurityGroups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-opsworks-security-groups` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnStackProps$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-version)]
    (. builder agentVersion data))
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :chef-configuration)]
    (. builder chefConfiguration data))
  (when-some [data (lookup-entry config id :clone-app-ids)]
    (. builder cloneAppIds data))
  (when-some [data (lookup-entry config id :clone-permissions)]
    (. builder clonePermissions data))
  (when-some [data (lookup-entry config id :configuration-manager)]
    (. builder configurationManager data))
  (when-some [data (lookup-entry config id :custom-cookbooks-source)]
    (. builder customCookbooksSource data))
  (when-some [data (lookup-entry config id :custom-json)]
    (. builder customJson data))
  (when-some [data (lookup-entry config id :default-availability-zone)]
    (. builder defaultAvailabilityZone data))
  (when-some [data (lookup-entry config id :default-instance-profile-arn)]
    (. builder defaultInstanceProfileArn data))
  (when-some [data (lookup-entry config id :default-os)]
    (. builder defaultOs data))
  (when-some [data (lookup-entry config id :default-root-device-type)]
    (. builder defaultRootDeviceType data))
  (when-some [data (lookup-entry config id :default-ssh-key-name)]
    (. builder defaultSshKeyName data))
  (when-some [data (lookup-entry config id :default-subnet-id)]
    (. builder defaultSubnetId data))
  (when-some [data (lookup-entry config id :ecs-cluster-arn)]
    (. builder ecsClusterArn data))
  (when-some [data (lookup-entry config id :elastic-ips)]
    (. builder elasticIps data))
  (when-some [data (lookup-entry config id :hostname-theme)]
    (. builder hostnameTheme data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rds-db-instances)]
    (. builder rdsDbInstances data))
  (when-some [data (lookup-entry config id :service-role-arn)]
    (. builder serviceRoleArn data))
  (when-some [data (lookup-entry config id :source-stack-id)]
    (. builder sourceStackId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :use-custom-cookbooks)]
    (. builder useCustomCookbooks data))
  (when-some [data (lookup-entry config id :use-opsworks-security-groups)]
    (. builder useOpsworksSecurityGroups data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-stack-props-builder
  "Creates a  `CfnStackProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-props-builder> (new CfnStackProps$Builder) id config))


(defn cfn-stack-rds-db-instance-property-builder>
  "The cfn-stack-rds-db-instance-property-builder> function updates a CfnStack$RdsDbInstanceProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$RdsDbInstanceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-password` |
| `dbUser` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-user` |
| `rdsDbInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:rds-db-instance-arn` |
"
  [^CfnStack$RdsDbInstanceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :db-password)]
    (. builder dbPassword data))
  (when-some [data (lookup-entry config id :db-user)]
    (. builder dbUser data))
  (when-some [data (lookup-entry config id :rds-db-instance-arn)]
    (. builder rdsDbInstanceArn data))
  (.build builder))


(defn cfn-stack-rds-db-instance-property-builder
  "Creates a  `CfnStack$RdsDbInstanceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-rds-db-instance-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-rds-db-instance-property-builder> (new CfnStack$RdsDbInstanceProperty$Builder) id config))


(defn cfn-stack-source-property-builder>
  "The cfn-stack-source-property-builder> function updates a CfnStack$SourceProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$SourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `revision` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision` |
| `sshKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssh-key` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnStack$SourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :revision)]
    (. builder revision data))
  (when-some [data (lookup-entry config id :ssh-key)]
    (. builder sshKey data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-stack-source-property-builder
  "Creates a  `CfnStack$SourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-source-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-source-property-builder> (new CfnStack$SourceProperty$Builder) id config))


(defn cfn-stack-stack-configuration-manager-property-builder>
  "The cfn-stack-stack-configuration-manager-property-builder> function updates a CfnStack$StackConfigurationManagerProperty$Builder instance using the provided configuration.
  The function takes the CfnStack$StackConfigurationManagerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnStack$StackConfigurationManagerProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-stack-stack-configuration-manager-property-builder
  "Creates a  `CfnStack$StackConfigurationManagerProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-stack-stack-configuration-manager-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-stack-stack-configuration-manager-property-builder> (new CfnStack$StackConfigurationManagerProperty$Builder) id config))


(defn cfn-user-profile-builder>
  "The cfn-user-profile-builder> function updates a CfnUserProfile$Builder instance using the provided configuration.
  The function takes the CfnUserProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowSelfManagement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-self-management` |
| `iamUserArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-user-arn` |
| `sshPublicKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssh-public-key` |
| `sshUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssh-username` |
"
  [^CfnUserProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-self-management)]
    (. builder allowSelfManagement data))
  (when-some [data (lookup-entry config id :iam-user-arn)]
    (. builder iamUserArn data))
  (when-some [data (lookup-entry config id :ssh-public-key)]
    (. builder sshPublicKey data))
  (when-some [data (lookup-entry config id :ssh-username)]
    (. builder sshUsername data))
  (.build builder))


(defn cfn-user-profile-builder
  "Creates a  `CfnUserProfile$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-user-profile-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-user-profile-builder> (CfnUserProfile$Builder/create scope (name id)) id config))


(defn cfn-user-profile-props-builder>
  "The cfn-user-profile-props-builder> function updates a CfnUserProfileProps$Builder instance using the provided configuration.
  The function takes the CfnUserProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowSelfManagement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-self-management` |
| `iamUserArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-user-arn` |
| `sshPublicKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssh-public-key` |
| `sshUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssh-username` |
"
  [^CfnUserProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-self-management)]
    (. builder allowSelfManagement data))
  (when-some [data (lookup-entry config id :iam-user-arn)]
    (. builder iamUserArn data))
  (when-some [data (lookup-entry config id :ssh-public-key)]
    (. builder sshPublicKey data))
  (when-some [data (lookup-entry config id :ssh-username)]
    (. builder sshUsername data))
  (.build builder))


(defn cfn-user-profile-props-builder
  "Creates a  `CfnUserProfileProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-user-profile-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-user-profile-props-builder> (new CfnUserProfileProps$Builder) id config))


(defn cfn-volume-builder>
  "The cfn-volume-builder> function updates a CfnVolume$Builder instance using the provided configuration.
  The function takes the CfnVolume$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ec2VolumeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-volume-id` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stackId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-id` |
"
  [^CfnVolume$Builder builder id config]
  (when-some [data (lookup-entry config id :ec2-volume-id)]
    (. builder ec2VolumeId data))
  (when-some [data (lookup-entry config id :mount-point)]
    (. builder mountPoint data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :stack-id)]
    (. builder stackId data))
  (.build builder))


(defn cfn-volume-builder
  "Creates a  `CfnVolume$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-volume-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-volume-builder> (CfnVolume$Builder/create scope (name id)) id config))


(defn cfn-volume-props-builder>
  "The cfn-volume-props-builder> function updates a CfnVolumeProps$Builder instance using the provided configuration.
  The function takes the CfnVolumeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ec2VolumeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-volume-id` |
| `mountPoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:mount-point` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stackId` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-id` |
"
  [^CfnVolumeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :ec2-volume-id)]
    (. builder ec2VolumeId data))
  (when-some [data (lookup-entry config id :mount-point)]
    (. builder mountPoint data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :stack-id)]
    (. builder stackId data))
  (.build builder))


(defn cfn-volume-props-builder
  "Creates a  `CfnVolumeProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-volume-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-volume-props-builder> (new CfnVolumeProps$Builder) id config))