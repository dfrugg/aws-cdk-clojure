(ns cdk.api.services.gamelift
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.gamelift package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.gamelift CfnAlias$Builder
                                                     CfnAlias$RoutingStrategyProperty$Builder
                                                     CfnAliasProps$Builder
                                                     CfnBuild$Builder
                                                     CfnBuild$StorageLocationProperty$Builder
                                                     CfnBuildProps$Builder
                                                     CfnContainerGroupDefinition$Builder
                                                     CfnContainerGroupDefinition$ContainerDefinitionProperty$Builder
                                                     CfnContainerGroupDefinition$ContainerDependencyProperty$Builder
                                                     CfnContainerGroupDefinition$ContainerEnvironmentProperty$Builder
                                                     CfnContainerGroupDefinition$ContainerHealthCheckProperty$Builder
                                                     CfnContainerGroupDefinition$ContainerPortRangeProperty$Builder
                                                     CfnContainerGroupDefinition$MemoryLimitsProperty$Builder
                                                     CfnContainerGroupDefinition$PortConfigurationProperty$Builder
                                                     CfnContainerGroupDefinitionProps$Builder
                                                     CfnFleet$AnywhereConfigurationProperty$Builder
                                                     CfnFleet$Builder
                                                     CfnFleet$CertificateConfigurationProperty$Builder
                                                     CfnFleet$ConnectionPortRangeProperty$Builder
                                                     CfnFleet$ContainerGroupsConfigurationProperty$Builder
                                                     CfnFleet$ContainerGroupsPerInstanceProperty$Builder
                                                     CfnFleet$IpPermissionProperty$Builder
                                                     CfnFleet$LocationCapacityProperty$Builder
                                                     CfnFleet$LocationConfigurationProperty$Builder
                                                     CfnFleet$ResourceCreationLimitPolicyProperty$Builder
                                                     CfnFleet$RuntimeConfigurationProperty$Builder
                                                     CfnFleet$ScalingPolicyProperty$Builder
                                                     CfnFleet$ServerProcessProperty$Builder
                                                     CfnFleet$TargetConfigurationProperty$Builder
                                                     CfnFleetProps$Builder
                                                     CfnGameServerGroup$AutoScalingPolicyProperty$Builder
                                                     CfnGameServerGroup$Builder
                                                     CfnGameServerGroup$InstanceDefinitionProperty$Builder
                                                     CfnGameServerGroup$LaunchTemplateProperty$Builder
                                                     CfnGameServerGroup$TargetTrackingConfigurationProperty$Builder
                                                     CfnGameServerGroupProps$Builder
                                                     CfnGameSessionQueue$Builder
                                                     CfnGameSessionQueue$DestinationProperty$Builder
                                                     CfnGameSessionQueue$FilterConfigurationProperty$Builder
                                                     CfnGameSessionQueue$GameSessionQueueDestinationProperty$Builder
                                                     CfnGameSessionQueue$PlayerLatencyPolicyProperty$Builder
                                                     CfnGameSessionQueue$PriorityConfigurationProperty$Builder
                                                     CfnGameSessionQueueProps$Builder
                                                     CfnLocation$Builder
                                                     CfnLocationProps$Builder
                                                     CfnMatchmakingConfiguration$Builder
                                                     CfnMatchmakingConfiguration$GamePropertyProperty$Builder
                                                     CfnMatchmakingConfigurationProps$Builder
                                                     CfnMatchmakingRuleSet$Builder
                                                     CfnMatchmakingRuleSetProps$Builder
                                                     CfnScript$Builder
                                                     CfnScript$S3LocationProperty$Builder
                                                     CfnScriptProps$Builder]))


(defn cfn-alias-builder>
  "The cfn-alias-builder> function updates a CfnAlias$Builder instance using the provided configuration.
  The function takes the CfnAlias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `routingStrategy` | software.amazon.awscdk.services.gamelift.CfnAlias$RoutingStrategyProperty | [[cdk.support/lookup-entry]] | `:routing-strategy` |
"
  [^CfnAlias$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :routing-strategy)]
    (. builder routingStrategy data))
  (.build builder))


(defn cfn-alias-builder
  "Creates a  `CfnAlias$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-alias-builder> (CfnAlias$Builder/create scope (name id)) id config))


(defn cfn-alias-props-builder>
  "The cfn-alias-props-builder> function updates a CfnAliasProps$Builder instance using the provided configuration.
  The function takes the CfnAliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `routingStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-strategy` |
"
  [^CfnAliasProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :routing-strategy)]
    (. builder routingStrategy data))
  (.build builder))


(defn cfn-alias-props-builder
  "Creates a  `CfnAliasProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-alias-props-builder> (new CfnAliasProps$Builder) id config))


(defn cfn-alias-routing-strategy-property-builder>
  "The cfn-alias-routing-strategy-property-builder> function updates a CfnAlias$RoutingStrategyProperty$Builder instance using the provided configuration.
  The function takes the CfnAlias$RoutingStrategyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fleetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-id` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAlias$RoutingStrategyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :fleet-id)]
    (. builder fleetId data))
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-alias-routing-strategy-property-builder
  "Creates a  `CfnAlias$RoutingStrategyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-alias-routing-strategy-property-builder> (new CfnAlias$RoutingStrategyProperty$Builder) id config))


(defn cfn-build-builder>
  "The cfn-build-builder> function updates a CfnBuild$Builder instance using the provided configuration.
  The function takes the CfnBuild$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operatingSystem` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system` |
| `serverSdkVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-sdk-version` |
| `storageLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-location` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnBuild$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :operating-system)]
    (. builder operatingSystem data))
  (when-some [data (lookup-entry config id :server-sdk-version)]
    (. builder serverSdkVersion data))
  (when-some [data (lookup-entry config id :storage-location)]
    (. builder storageLocation data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-build-builder
  "Creates a  `CfnBuild$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-build-builder> (CfnBuild$Builder/create scope (name id)) id config))


(defn cfn-build-props-builder>
  "The cfn-build-props-builder> function updates a CfnBuildProps$Builder instance using the provided configuration.
  The function takes the CfnBuildProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operatingSystem` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system` |
| `serverSdkVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-sdk-version` |
| `storageLocation` | software.amazon.awscdk.services.gamelift.CfnBuild$StorageLocationProperty | [[cdk.support/lookup-entry]] | `:storage-location` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnBuildProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :operating-system)]
    (. builder operatingSystem data))
  (when-some [data (lookup-entry config id :server-sdk-version)]
    (. builder serverSdkVersion data))
  (when-some [data (lookup-entry config id :storage-location)]
    (. builder storageLocation data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-build-props-builder
  "Creates a  `CfnBuildProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-build-props-builder> (new CfnBuildProps$Builder) id config))


(defn cfn-build-storage-location-property-builder>
  "The cfn-build-storage-location-property-builder> function updates a CfnBuild$StorageLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnBuild$StorageLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnBuild$StorageLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :object-version)]
    (. builder objectVersion data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-build-storage-location-property-builder
  "Creates a  `CfnBuild$StorageLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-build-storage-location-property-builder> (new CfnBuild$StorageLocationProperty$Builder) id config))


(defn cfn-container-group-definition-builder>
  "The cfn-container-group-definition-builder> function updates a CfnContainerGroupDefinition$Builder instance using the provided configuration.
  The function takes the CfnContainerGroupDefinition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-definitions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operatingSystem` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system` |
| `schedulingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-strategy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `totalCpuLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-cpu-limit` |
| `totalMemoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-memory-limit` |
"
  [^CfnContainerGroupDefinition$Builder builder id config]
  (when-some [data (lookup-entry config id :container-definitions)]
    (. builder containerDefinitions data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :operating-system)]
    (. builder operatingSystem data))
  (when-some [data (lookup-entry config id :scheduling-strategy)]
    (. builder schedulingStrategy data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :total-cpu-limit)]
    (. builder totalCpuLimit data))
  (when-some [data (lookup-entry config id :total-memory-limit)]
    (. builder totalMemoryLimit data))
  (.build builder))


(defn cfn-container-group-definition-builder
  "Creates a  `CfnContainerGroupDefinition$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-container-group-definition-builder> (CfnContainerGroupDefinition$Builder/create scope (name id)) id config))


(defn cfn-container-group-definition-container-definition-property-builder>
  "The cfn-container-group-definition-container-definition-property-builder> function updates a CfnContainerGroupDefinition$ContainerDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerGroupDefinition$ContainerDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `dependsOn` | java.util.List | [[cdk.support/lookup-entry]] | `:depends-on` |
| `entryPoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entry-point` |
| `environment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment` |
| `essential` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:essential` |
| `healthCheck` | software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition$ContainerHealthCheckProperty | [[cdk.support/lookup-entry]] | `:health-check` |
| `imageUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-uri` |
| `memoryLimits` | software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition$MemoryLimitsProperty | [[cdk.support/lookup-entry]] | `:memory-limits` |
| `portConfiguration` | software.amazon.awscdk.services.gamelift.CfnContainerGroupDefinition$PortConfigurationProperty | [[cdk.support/lookup-entry]] | `:port-configuration` |
| `resolvedImageDigest` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolved-image-digest` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^CfnContainerGroupDefinition$ContainerDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :depends-on)]
    (. builder dependsOn data))
  (when-some [data (lookup-entry config id :entry-point)]
    (. builder entryPoint data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :essential)]
    (. builder essential data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :image-uri)]
    (. builder imageUri data))
  (when-some [data (lookup-entry config id :memory-limits)]
    (. builder memoryLimits data))
  (when-some [data (lookup-entry config id :port-configuration)]
    (. builder portConfiguration data))
  (when-some [data (lookup-entry config id :resolved-image-digest)]
    (. builder resolvedImageDigest data))
  (when-some [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn cfn-container-group-definition-container-definition-property-builder
  "Creates a  `CfnContainerGroupDefinition$ContainerDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-group-definition-container-definition-property-builder> (new CfnContainerGroupDefinition$ContainerDefinitionProperty$Builder) id config))


(defn cfn-container-group-definition-container-dependency-property-builder>
  "The cfn-container-group-definition-container-dependency-property-builder> function updates a CfnContainerGroupDefinition$ContainerDependencyProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerGroupDefinition$ContainerDependencyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
"
  [^CfnContainerGroupDefinition$ContainerDependencyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (.build builder))


(defn cfn-container-group-definition-container-dependency-property-builder
  "Creates a  `CfnContainerGroupDefinition$ContainerDependencyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-group-definition-container-dependency-property-builder> (new CfnContainerGroupDefinition$ContainerDependencyProperty$Builder) id config))


(defn cfn-container-group-definition-container-environment-property-builder>
  "The cfn-container-group-definition-container-environment-property-builder> function updates a CfnContainerGroupDefinition$ContainerEnvironmentProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerGroupDefinition$ContainerEnvironmentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnContainerGroupDefinition$ContainerEnvironmentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-container-group-definition-container-environment-property-builder
  "Creates a  `CfnContainerGroupDefinition$ContainerEnvironmentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-group-definition-container-environment-property-builder> (new CfnContainerGroupDefinition$ContainerEnvironmentProperty$Builder) id config))


(defn cfn-container-group-definition-container-health-check-property-builder>
  "The cfn-container-group-definition-container-health-check-property-builder> function updates a CfnContainerGroupDefinition$ContainerHealthCheckProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerGroupDefinition$ContainerHealthCheckProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `retries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retries` |
| `startPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-period` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
"
  [^CfnContainerGroupDefinition$ContainerHealthCheckProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :retries)]
    (. builder retries data))
  (when-some [data (lookup-entry config id :start-period)]
    (. builder startPeriod data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (.build builder))


(defn cfn-container-group-definition-container-health-check-property-builder
  "Creates a  `CfnContainerGroupDefinition$ContainerHealthCheckProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-group-definition-container-health-check-property-builder> (new CfnContainerGroupDefinition$ContainerHealthCheckProperty$Builder) id config))


(defn cfn-container-group-definition-container-port-range-property-builder>
  "The cfn-container-group-definition-container-port-range-property-builder> function updates a CfnContainerGroupDefinition$ContainerPortRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerGroupDefinition$ContainerPortRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |
"
  [^CfnContainerGroupDefinition$ContainerPortRangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :from-port)]
    (. builder fromPort data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :to-port)]
    (. builder toPort data))
  (.build builder))


(defn cfn-container-group-definition-container-port-range-property-builder
  "Creates a  `CfnContainerGroupDefinition$ContainerPortRangeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-group-definition-container-port-range-property-builder> (new CfnContainerGroupDefinition$ContainerPortRangeProperty$Builder) id config))


(defn cfn-container-group-definition-memory-limits-property-builder>
  "The cfn-container-group-definition-memory-limits-property-builder> function updates a CfnContainerGroupDefinition$MemoryLimitsProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerGroupDefinition$MemoryLimitsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hardLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hard-limit` |
| `softLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:soft-limit` |
"
  [^CfnContainerGroupDefinition$MemoryLimitsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :hard-limit)]
    (. builder hardLimit data))
  (when-some [data (lookup-entry config id :soft-limit)]
    (. builder softLimit data))
  (.build builder))


(defn cfn-container-group-definition-memory-limits-property-builder
  "Creates a  `CfnContainerGroupDefinition$MemoryLimitsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-group-definition-memory-limits-property-builder> (new CfnContainerGroupDefinition$MemoryLimitsProperty$Builder) id config))


(defn cfn-container-group-definition-port-configuration-property-builder>
  "The cfn-container-group-definition-port-configuration-property-builder> function updates a CfnContainerGroupDefinition$PortConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnContainerGroupDefinition$PortConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPortRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:container-port-ranges` |
"
  [^CfnContainerGroupDefinition$PortConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :container-port-ranges)]
    (. builder containerPortRanges data))
  (.build builder))


(defn cfn-container-group-definition-port-configuration-property-builder
  "Creates a  `CfnContainerGroupDefinition$PortConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-group-definition-port-configuration-property-builder> (new CfnContainerGroupDefinition$PortConfigurationProperty$Builder) id config))


(defn cfn-container-group-definition-props-builder>
  "The cfn-container-group-definition-props-builder> function updates a CfnContainerGroupDefinitionProps$Builder instance using the provided configuration.
  The function takes the CfnContainerGroupDefinitionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:container-definitions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operatingSystem` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system` |
| `schedulingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-strategy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `totalCpuLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-cpu-limit` |
| `totalMemoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-memory-limit` |
"
  [^CfnContainerGroupDefinitionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container-definitions)]
    (. builder containerDefinitions data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :operating-system)]
    (. builder operatingSystem data))
  (when-some [data (lookup-entry config id :scheduling-strategy)]
    (. builder schedulingStrategy data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :total-cpu-limit)]
    (. builder totalCpuLimit data))
  (when-some [data (lookup-entry config id :total-memory-limit)]
    (. builder totalMemoryLimit data))
  (.build builder))


(defn cfn-container-group-definition-props-builder
  "Creates a  `CfnContainerGroupDefinitionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-group-definition-props-builder> (new CfnContainerGroupDefinitionProps$Builder) id config))


(defn cfn-fleet-anywhere-configuration-property-builder>
  "The cfn-fleet-anywhere-configuration-property-builder> function updates a CfnFleet$AnywhereConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$AnywhereConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cost` | java.lang.String | [[cdk.support/lookup-entry]] | `:cost` |
"
  [^CfnFleet$AnywhereConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cost)]
    (. builder cost data))
  (.build builder))


(defn cfn-fleet-anywhere-configuration-property-builder
  "Creates a  `CfnFleet$AnywhereConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-anywhere-configuration-property-builder> (new CfnFleet$AnywhereConfigurationProperty$Builder) id config))


(defn cfn-fleet-builder>
  "The cfn-fleet-builder> function updates a CfnFleet$Builder instance using the provided configuration.
  The function takes the CfnFleet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anywhereConfiguration` | software.amazon.awscdk.services.gamelift.CfnFleet$AnywhereConfigurationProperty | [[cdk.support/lookup-entry]] | `:anywhere-configuration` |
| `applyCapacity` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-capacity` |
| `buildId` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-id` |
| `certificateConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate-configuration` |
| `computeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-type` |
| `containerGroupsConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-groups-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `desiredEc2Instances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-ec2-instances` |
| `ec2InboundPermissions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ec2-inbound-permissions` |
| `ec2InstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-instance-type` |
| `fleetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-type` |
| `instanceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-role-arn` |
| `instanceRoleCredentialsProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-role-credentials-provider` |
| `locations` | java.util.List | [[cdk.support/lookup-entry]] | `:locations` |
| `logPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:log-paths` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `metricGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-groups` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `newGameSessionProtectionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:new-game-session-protection-policy` |
| `peerVpcAwsAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-vpc-aws-account-id` |
| `peerVpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-vpc-id` |
| `resourceCreationLimitPolicy` | software.amazon.awscdk.services.gamelift.CfnFleet$ResourceCreationLimitPolicyProperty | [[cdk.support/lookup-entry]] | `:resource-creation-limit-policy` |
| `runtimeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime-configuration` |
| `scalingPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-policies` |
| `scriptId` | java.lang.String | [[cdk.support/lookup-entry]] | `:script-id` |
| `serverLaunchParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-launch-parameters` |
| `serverLaunchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-launch-path` |
"
  [^CfnFleet$Builder builder id config]
  (when-some [data (lookup-entry config id :anywhere-configuration)]
    (. builder anywhereConfiguration data))
  (when-some [data (lookup-entry config id :apply-capacity)]
    (. builder applyCapacity data))
  (when-some [data (lookup-entry config id :build-id)]
    (. builder buildId data))
  (when-some [data (lookup-entry config id :certificate-configuration)]
    (. builder certificateConfiguration data))
  (when-some [data (lookup-entry config id :compute-type)]
    (. builder computeType data))
  (when-some [data (lookup-entry config id :container-groups-configuration)]
    (. builder containerGroupsConfiguration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :desired-ec2-instances)]
    (. builder desiredEc2Instances data))
  (when-some [data (lookup-entry config id :ec2-inbound-permissions)]
    (. builder ec2InboundPermissions data))
  (when-some [data (lookup-entry config id :ec2-instance-type)]
    (. builder ec2InstanceType data))
  (when-some [data (lookup-entry config id :fleet-type)]
    (. builder fleetType data))
  (when-some [data (lookup-entry config id :instance-role-arn)]
    (. builder instanceRoleArn data))
  (when-some [data (lookup-entry config id :instance-role-credentials-provider)]
    (. builder instanceRoleCredentialsProvider data))
  (when-some [data (lookup-entry config id :locations)]
    (. builder locations data))
  (when-some [data (lookup-entry config id :log-paths)]
    (. builder logPaths data))
  (when-some [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-some [data (lookup-entry config id :metric-groups)]
    (. builder metricGroups data))
  (when-some [data (lookup-entry config id :min-size)]
    (. builder minSize data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :new-game-session-protection-policy)]
    (. builder newGameSessionProtectionPolicy data))
  (when-some [data (lookup-entry config id :peer-vpc-aws-account-id)]
    (. builder peerVpcAwsAccountId data))
  (when-some [data (lookup-entry config id :peer-vpc-id)]
    (. builder peerVpcId data))
  (when-some [data (lookup-entry config id :resource-creation-limit-policy)]
    (. builder resourceCreationLimitPolicy data))
  (when-some [data (lookup-entry config id :runtime-configuration)]
    (. builder runtimeConfiguration data))
  (when-some [data (lookup-entry config id :scaling-policies)]
    (. builder scalingPolicies data))
  (when-some [data (lookup-entry config id :script-id)]
    (. builder scriptId data))
  (when-some [data (lookup-entry config id :server-launch-parameters)]
    (. builder serverLaunchParameters data))
  (when-some [data (lookup-entry config id :server-launch-path)]
    (. builder serverLaunchPath data))
  (.build builder))


(defn cfn-fleet-builder
  "Creates a  `CfnFleet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-fleet-builder> (CfnFleet$Builder/create scope (name id)) id config))


(defn cfn-fleet-certificate-configuration-property-builder>
  "The cfn-fleet-certificate-configuration-property-builder> function updates a CfnFleet$CertificateConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$CertificateConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-type` |
"
  [^CfnFleet$CertificateConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-type)]
    (. builder certificateType data))
  (.build builder))


(defn cfn-fleet-certificate-configuration-property-builder
  "Creates a  `CfnFleet$CertificateConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-certificate-configuration-property-builder> (new CfnFleet$CertificateConfigurationProperty$Builder) id config))


(defn cfn-fleet-connection-port-range-property-builder>
  "The cfn-fleet-connection-port-range-property-builder> function updates a CfnFleet$ConnectionPortRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$ConnectionPortRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |
"
  [^CfnFleet$ConnectionPortRangeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :from-port)]
    (. builder fromPort data))
  (when-some [data (lookup-entry config id :to-port)]
    (. builder toPort data))
  (.build builder))


(defn cfn-fleet-connection-port-range-property-builder
  "Creates a  `CfnFleet$ConnectionPortRangeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-connection-port-range-property-builder> (new CfnFleet$ConnectionPortRangeProperty$Builder) id config))


(defn cfn-fleet-container-groups-configuration-property-builder>
  "The cfn-fleet-container-groups-configuration-property-builder> function updates a CfnFleet$ContainerGroupsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$ContainerGroupsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPortRange` | software.amazon.awscdk.services.gamelift.CfnFleet$ConnectionPortRangeProperty | [[cdk.support/lookup-entry]] | `:connection-port-range` |
| `containerGroupDefinitionNames` | java.util.List | [[cdk.support/lookup-entry]] | `:container-group-definition-names` |
| `containerGroupsPerInstance` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-groups-per-instance` |
"
  [^CfnFleet$ContainerGroupsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-port-range)]
    (. builder connectionPortRange data))
  (when-some [data (lookup-entry config id :container-group-definition-names)]
    (. builder containerGroupDefinitionNames data))
  (when-some [data (lookup-entry config id :container-groups-per-instance)]
    (. builder containerGroupsPerInstance data))
  (.build builder))


(defn cfn-fleet-container-groups-configuration-property-builder
  "Creates a  `CfnFleet$ContainerGroupsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-container-groups-configuration-property-builder> (new CfnFleet$ContainerGroupsConfigurationProperty$Builder) id config))


(defn cfn-fleet-container-groups-per-instance-property-builder>
  "The cfn-fleet-container-groups-per-instance-property-builder> function updates a CfnFleet$ContainerGroupsPerInstanceProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$ContainerGroupsPerInstanceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredReplicaContainerGroupsPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-replica-container-groups-per-instance` |
| `maxReplicaContainerGroupsPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-replica-container-groups-per-instance` |
"
  [^CfnFleet$ContainerGroupsPerInstanceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :desired-replica-container-groups-per-instance)]
    (. builder desiredReplicaContainerGroupsPerInstance data))
  (when-some [data (lookup-entry config id :max-replica-container-groups-per-instance)]
    (. builder maxReplicaContainerGroupsPerInstance data))
  (.build builder))


(defn cfn-fleet-container-groups-per-instance-property-builder
  "Creates a  `CfnFleet$ContainerGroupsPerInstanceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-container-groups-per-instance-property-builder> (new CfnFleet$ContainerGroupsPerInstanceProperty$Builder) id config))


(defn cfn-fleet-ip-permission-property-builder>
  "The cfn-fleet-ip-permission-property-builder> function updates a CfnFleet$IpPermissionProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$IpPermissionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `ipRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-range` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |
"
  [^CfnFleet$IpPermissionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :from-port)]
    (. builder fromPort data))
  (when-some [data (lookup-entry config id :ip-range)]
    (. builder ipRange data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :to-port)]
    (. builder toPort data))
  (.build builder))


(defn cfn-fleet-ip-permission-property-builder
  "Creates a  `CfnFleet$IpPermissionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-ip-permission-property-builder> (new CfnFleet$IpPermissionProperty$Builder) id config))


(defn cfn-fleet-location-capacity-property-builder>
  "The cfn-fleet-location-capacity-property-builder> function updates a CfnFleet$LocationCapacityProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$LocationCapacityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredEc2Instances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-ec2-instances` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
"
  [^CfnFleet$LocationCapacityProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :desired-ec2-instances)]
    (. builder desiredEc2Instances data))
  (when-some [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-some [data (lookup-entry config id :min-size)]
    (. builder minSize data))
  (.build builder))


(defn cfn-fleet-location-capacity-property-builder
  "Creates a  `CfnFleet$LocationCapacityProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-location-capacity-property-builder> (new CfnFleet$LocationCapacityProperty$Builder) id config))


(defn cfn-fleet-location-configuration-property-builder>
  "The cfn-fleet-location-configuration-property-builder> function updates a CfnFleet$LocationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$LocationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `locationCapacity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location-capacity` |
"
  [^CfnFleet$LocationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :location-capacity)]
    (. builder locationCapacity data))
  (.build builder))


(defn cfn-fleet-location-configuration-property-builder
  "Creates a  `CfnFleet$LocationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-location-configuration-property-builder> (new CfnFleet$LocationConfigurationProperty$Builder) id config))


(defn cfn-fleet-props-builder>
  "The cfn-fleet-props-builder> function updates a CfnFleetProps$Builder instance using the provided configuration.
  The function takes the CfnFleetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anywhereConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:anywhere-configuration` |
| `applyCapacity` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-capacity` |
| `buildId` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-id` |
| `certificateConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate-configuration` |
| `computeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:compute-type` |
| `containerGroupsConfiguration` | software.amazon.awscdk.services.gamelift.CfnFleet$ContainerGroupsConfigurationProperty | [[cdk.support/lookup-entry]] | `:container-groups-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `desiredEc2Instances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-ec2-instances` |
| `ec2InboundPermissions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ec2-inbound-permissions` |
| `ec2InstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-instance-type` |
| `fleetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-type` |
| `instanceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-role-arn` |
| `instanceRoleCredentialsProvider` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-role-credentials-provider` |
| `locations` | java.util.List | [[cdk.support/lookup-entry]] | `:locations` |
| `logPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:log-paths` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `metricGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-groups` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `newGameSessionProtectionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:new-game-session-protection-policy` |
| `peerVpcAwsAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-vpc-aws-account-id` |
| `peerVpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:peer-vpc-id` |
| `resourceCreationLimitPolicy` | software.amazon.awscdk.services.gamelift.CfnFleet$ResourceCreationLimitPolicyProperty | [[cdk.support/lookup-entry]] | `:resource-creation-limit-policy` |
| `runtimeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime-configuration` |
| `scalingPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scaling-policies` |
| `scriptId` | java.lang.String | [[cdk.support/lookup-entry]] | `:script-id` |
| `serverLaunchParameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-launch-parameters` |
| `serverLaunchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-launch-path` |
"
  [^CfnFleetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :anywhere-configuration)]
    (. builder anywhereConfiguration data))
  (when-some [data (lookup-entry config id :apply-capacity)]
    (. builder applyCapacity data))
  (when-some [data (lookup-entry config id :build-id)]
    (. builder buildId data))
  (when-some [data (lookup-entry config id :certificate-configuration)]
    (. builder certificateConfiguration data))
  (when-some [data (lookup-entry config id :compute-type)]
    (. builder computeType data))
  (when-some [data (lookup-entry config id :container-groups-configuration)]
    (. builder containerGroupsConfiguration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :desired-ec2-instances)]
    (. builder desiredEc2Instances data))
  (when-some [data (lookup-entry config id :ec2-inbound-permissions)]
    (. builder ec2InboundPermissions data))
  (when-some [data (lookup-entry config id :ec2-instance-type)]
    (. builder ec2InstanceType data))
  (when-some [data (lookup-entry config id :fleet-type)]
    (. builder fleetType data))
  (when-some [data (lookup-entry config id :instance-role-arn)]
    (. builder instanceRoleArn data))
  (when-some [data (lookup-entry config id :instance-role-credentials-provider)]
    (. builder instanceRoleCredentialsProvider data))
  (when-some [data (lookup-entry config id :locations)]
    (. builder locations data))
  (when-some [data (lookup-entry config id :log-paths)]
    (. builder logPaths data))
  (when-some [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-some [data (lookup-entry config id :metric-groups)]
    (. builder metricGroups data))
  (when-some [data (lookup-entry config id :min-size)]
    (. builder minSize data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :new-game-session-protection-policy)]
    (. builder newGameSessionProtectionPolicy data))
  (when-some [data (lookup-entry config id :peer-vpc-aws-account-id)]
    (. builder peerVpcAwsAccountId data))
  (when-some [data (lookup-entry config id :peer-vpc-id)]
    (. builder peerVpcId data))
  (when-some [data (lookup-entry config id :resource-creation-limit-policy)]
    (. builder resourceCreationLimitPolicy data))
  (when-some [data (lookup-entry config id :runtime-configuration)]
    (. builder runtimeConfiguration data))
  (when-some [data (lookup-entry config id :scaling-policies)]
    (. builder scalingPolicies data))
  (when-some [data (lookup-entry config id :script-id)]
    (. builder scriptId data))
  (when-some [data (lookup-entry config id :server-launch-parameters)]
    (. builder serverLaunchParameters data))
  (when-some [data (lookup-entry config id :server-launch-path)]
    (. builder serverLaunchPath data))
  (.build builder))


(defn cfn-fleet-props-builder
  "Creates a  `CfnFleetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-props-builder> (new CfnFleetProps$Builder) id config))


(defn cfn-fleet-resource-creation-limit-policy-property-builder>
  "The cfn-fleet-resource-creation-limit-policy-property-builder> function updates a CfnFleet$ResourceCreationLimitPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$ResourceCreationLimitPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `newGameSessionsPerCreator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:new-game-sessions-per-creator` |
| `policyPeriodInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:policy-period-in-minutes` |
"
  [^CfnFleet$ResourceCreationLimitPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :new-game-sessions-per-creator)]
    (. builder newGameSessionsPerCreator data))
  (when-some [data (lookup-entry config id :policy-period-in-minutes)]
    (. builder policyPeriodInMinutes data))
  (.build builder))


(defn cfn-fleet-resource-creation-limit-policy-property-builder
  "Creates a  `CfnFleet$ResourceCreationLimitPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-resource-creation-limit-policy-property-builder> (new CfnFleet$ResourceCreationLimitPolicyProperty$Builder) id config))


(defn cfn-fleet-runtime-configuration-property-builder>
  "The cfn-fleet-runtime-configuration-property-builder> function updates a CfnFleet$RuntimeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$RuntimeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gameSessionActivationTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:game-session-activation-timeout-seconds` |
| `maxConcurrentGameSessionActivations` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-game-session-activations` |
| `serverProcesses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-processes` |
"
  [^CfnFleet$RuntimeConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :game-session-activation-timeout-seconds)]
    (. builder gameSessionActivationTimeoutSeconds data))
  (when-some [data (lookup-entry config id :max-concurrent-game-session-activations)]
    (. builder maxConcurrentGameSessionActivations data))
  (when-some [data (lookup-entry config id :server-processes)]
    (. builder serverProcesses data))
  (.build builder))


(defn cfn-fleet-runtime-configuration-property-builder
  "Creates a  `CfnFleet$RuntimeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-runtime-configuration-property-builder> (new CfnFleet$RuntimeConfigurationProperty$Builder) id config))


(defn cfn-fleet-scaling-policy-property-builder>
  "The cfn-fleet-scaling-policy-property-builder> function updates a CfnFleet$ScalingPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$ScalingPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |
| `scalingAdjustment` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scaling-adjustment` |
| `scalingAdjustmentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:scaling-adjustment-type` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `targetConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-configuration` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `updateStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-status` |
"
  [^CfnFleet$ScalingPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :policy-type)]
    (. builder policyType data))
  (when-some [data (lookup-entry config id :scaling-adjustment)]
    (. builder scalingAdjustment data))
  (when-some [data (lookup-entry config id :scaling-adjustment-type)]
    (. builder scalingAdjustmentType data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :target-configuration)]
    (. builder targetConfiguration data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (lookup-entry config id :update-status)]
    (. builder updateStatus data))
  (.build builder))


(defn cfn-fleet-scaling-policy-property-builder
  "Creates a  `CfnFleet$ScalingPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-scaling-policy-property-builder> (new CfnFleet$ScalingPolicyProperty$Builder) id config))


(defn cfn-fleet-server-process-property-builder>
  "The cfn-fleet-server-process-property-builder> function updates a CfnFleet$ServerProcessProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$ServerProcessProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `concurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrent-executions` |
| `launchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-path` |
| `parameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^CfnFleet$ServerProcessProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :concurrent-executions)]
    (. builder concurrentExecutions data))
  (when-some [data (lookup-entry config id :launch-path)]
    (. builder launchPath data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn cfn-fleet-server-process-property-builder
  "Creates a  `CfnFleet$ServerProcessProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-server-process-property-builder> (new CfnFleet$ServerProcessProperty$Builder) id config))


(defn cfn-fleet-target-configuration-property-builder>
  "The cfn-fleet-target-configuration-property-builder> function updates a CfnFleet$TargetConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnFleet$TargetConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |
"
  [^CfnFleet$TargetConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-value)]
    (. builder targetValue data))
  (.build builder))


(defn cfn-fleet-target-configuration-property-builder
  "Creates a  `CfnFleet$TargetConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-target-configuration-property-builder> (new CfnFleet$TargetConfigurationProperty$Builder) id config))


(defn cfn-game-server-group-auto-scaling-policy-property-builder>
  "The cfn-game-server-group-auto-scaling-policy-property-builder> function updates a CfnGameServerGroup$AutoScalingPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnGameServerGroup$AutoScalingPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `estimatedInstanceWarmup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `targetTrackingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-tracking-configuration` |
"
  [^CfnGameServerGroup$AutoScalingPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :estimated-instance-warmup)]
    (. builder estimatedInstanceWarmup data))
  (when-some [data (lookup-entry config id :target-tracking-configuration)]
    (. builder targetTrackingConfiguration data))
  (.build builder))


(defn cfn-game-server-group-auto-scaling-policy-property-builder
  "Creates a  `CfnGameServerGroup$AutoScalingPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-game-server-group-auto-scaling-policy-property-builder> (new CfnGameServerGroup$AutoScalingPolicyProperty$Builder) id config))


(defn cfn-game-server-group-builder>
  "The cfn-game-server-group-builder> function updates a CfnGameServerGroup$Builder instance using the provided configuration.
  The function takes the CfnGameServerGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-scaling-policy` |
| `balancingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:balancing-strategy` |
| `deleteOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:delete-option` |
| `gameServerGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:game-server-group-name` |
| `gameServerProtectionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:game-server-protection-policy` |
| `instanceDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-definitions` |
| `launchTemplate` | software.amazon.awscdk.services.gamelift.CfnGameServerGroup$LaunchTemplateProperty | [[cdk.support/lookup-entry]] | `:launch-template` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^CfnGameServerGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-scaling-policy)]
    (. builder autoScalingPolicy data))
  (when-some [data (lookup-entry config id :balancing-strategy)]
    (. builder balancingStrategy data))
  (when-some [data (lookup-entry config id :delete-option)]
    (. builder deleteOption data))
  (when-some [data (lookup-entry config id :game-server-group-name)]
    (. builder gameServerGroupName data))
  (when-some [data (lookup-entry config id :game-server-protection-policy)]
    (. builder gameServerProtectionPolicy data))
  (when-some [data (lookup-entry config id :instance-definitions)]
    (. builder instanceDefinitions data))
  (when-some [data (lookup-entry config id :launch-template)]
    (. builder launchTemplate data))
  (when-some [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-some [data (lookup-entry config id :min-size)]
    (. builder minSize data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn cfn-game-server-group-builder
  "Creates a  `CfnGameServerGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-game-server-group-builder> (CfnGameServerGroup$Builder/create scope (name id)) id config))


(defn cfn-game-server-group-instance-definition-property-builder>
  "The cfn-game-server-group-instance-definition-property-builder> function updates a CfnGameServerGroup$InstanceDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnGameServerGroup$InstanceDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `weightedCapacity` | java.lang.String | [[cdk.support/lookup-entry]] | `:weighted-capacity` |
"
  [^CfnGameServerGroup$InstanceDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :weighted-capacity)]
    (. builder weightedCapacity data))
  (.build builder))


(defn cfn-game-server-group-instance-definition-property-builder
  "Creates a  `CfnGameServerGroup$InstanceDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-game-server-group-instance-definition-property-builder> (new CfnGameServerGroup$InstanceDefinitionProperty$Builder) id config))


(defn cfn-game-server-group-launch-template-property-builder>
  "The cfn-game-server-group-launch-template-property-builder> function updates a CfnGameServerGroup$LaunchTemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnGameServerGroup$LaunchTemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnGameServerGroup$LaunchTemplateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :launch-template-id)]
    (. builder launchTemplateId data))
  (when-some [data (lookup-entry config id :launch-template-name)]
    (. builder launchTemplateName data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-game-server-group-launch-template-property-builder
  "Creates a  `CfnGameServerGroup$LaunchTemplateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-game-server-group-launch-template-property-builder> (new CfnGameServerGroup$LaunchTemplateProperty$Builder) id config))


(defn cfn-game-server-group-props-builder>
  "The cfn-game-server-group-props-builder> function updates a CfnGameServerGroupProps$Builder instance using the provided configuration.
  The function takes the CfnGameServerGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingPolicy` | software.amazon.awscdk.services.gamelift.CfnGameServerGroup$AutoScalingPolicyProperty | [[cdk.support/lookup-entry]] | `:auto-scaling-policy` |
| `balancingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:balancing-strategy` |
| `deleteOption` | java.lang.String | [[cdk.support/lookup-entry]] | `:delete-option` |
| `gameServerGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:game-server-group-name` |
| `gameServerProtectionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:game-server-protection-policy` |
| `instanceDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-definitions` |
| `launchTemplate` | software.amazon.awscdk.services.gamelift.CfnGameServerGroup$LaunchTemplateProperty | [[cdk.support/lookup-entry]] | `:launch-template` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^CfnGameServerGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-scaling-policy)]
    (. builder autoScalingPolicy data))
  (when-some [data (lookup-entry config id :balancing-strategy)]
    (. builder balancingStrategy data))
  (when-some [data (lookup-entry config id :delete-option)]
    (. builder deleteOption data))
  (when-some [data (lookup-entry config id :game-server-group-name)]
    (. builder gameServerGroupName data))
  (when-some [data (lookup-entry config id :game-server-protection-policy)]
    (. builder gameServerProtectionPolicy data))
  (when-some [data (lookup-entry config id :instance-definitions)]
    (. builder instanceDefinitions data))
  (when-some [data (lookup-entry config id :launch-template)]
    (. builder launchTemplate data))
  (when-some [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-some [data (lookup-entry config id :min-size)]
    (. builder minSize data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn cfn-game-server-group-props-builder
  "Creates a  `CfnGameServerGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-game-server-group-props-builder> (new CfnGameServerGroupProps$Builder) id config))


(defn cfn-game-server-group-target-tracking-configuration-property-builder>
  "The cfn-game-server-group-target-tracking-configuration-property-builder> function updates a CfnGameServerGroup$TargetTrackingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnGameServerGroup$TargetTrackingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |
"
  [^CfnGameServerGroup$TargetTrackingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-value)]
    (. builder targetValue data))
  (.build builder))


(defn cfn-game-server-group-target-tracking-configuration-property-builder
  "Creates a  `CfnGameServerGroup$TargetTrackingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-game-server-group-target-tracking-configuration-property-builder> (new CfnGameServerGroup$TargetTrackingConfigurationProperty$Builder) id config))


(defn cfn-game-session-queue-builder>
  "The cfn-game-session-queue-builder> function updates a CfnGameSessionQueue$Builder instance using the provided configuration.
  The function takes the CfnGameSessionQueue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customEventData` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-event-data` |
| `destinations` | java.util.List | [[cdk.support/lookup-entry]] | `:destinations` |
| `filterConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filter-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notificationTarget` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-target` |
| `playerLatencyPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:player-latency-policies` |
| `priorityConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:priority-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |
"
  [^CfnGameSessionQueue$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-event-data)]
    (. builder customEventData data))
  (when-some [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-some [data (lookup-entry config id :filter-configuration)]
    (. builder filterConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :notification-target)]
    (. builder notificationTarget data))
  (when-some [data (lookup-entry config id :player-latency-policies)]
    (. builder playerLatencyPolicies data))
  (when-some [data (lookup-entry config id :priority-configuration)]
    (. builder priorityConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout-in-seconds)]
    (. builder timeoutInSeconds data))
  (.build builder))


(defn cfn-game-session-queue-builder
  "Creates a  `CfnGameSessionQueue$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-game-session-queue-builder> (CfnGameSessionQueue$Builder/create scope (name id)) id config))


(defn cfn-game-session-queue-destination-property-builder>
  "The cfn-game-session-queue-destination-property-builder> function updates a CfnGameSessionQueue$DestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnGameSessionQueue$DestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
"
  [^CfnGameSessionQueue$DestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (.build builder))


(defn cfn-game-session-queue-destination-property-builder
  "Creates a  `CfnGameSessionQueue$DestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-game-session-queue-destination-property-builder> (new CfnGameSessionQueue$DestinationProperty$Builder) id config))


(defn cfn-game-session-queue-filter-configuration-property-builder>
  "The cfn-game-session-queue-filter-configuration-property-builder> function updates a CfnGameSessionQueue$FilterConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnGameSessionQueue$FilterConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-locations` |
"
  [^CfnGameSessionQueue$FilterConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-locations)]
    (. builder allowedLocations data))
  (.build builder))


(defn cfn-game-session-queue-filter-configuration-property-builder
  "Creates a  `CfnGameSessionQueue$FilterConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-game-session-queue-filter-configuration-property-builder> (new CfnGameSessionQueue$FilterConfigurationProperty$Builder) id config))


(defn cfn-game-session-queue-game-session-queue-destination-property-builder>
  "The cfn-game-session-queue-game-session-queue-destination-property-builder> function updates a CfnGameSessionQueue$GameSessionQueueDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnGameSessionQueue$GameSessionQueueDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
"
  [^CfnGameSessionQueue$GameSessionQueueDestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (.build builder))


(defn cfn-game-session-queue-game-session-queue-destination-property-builder
  "Creates a  `CfnGameSessionQueue$GameSessionQueueDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-game-session-queue-game-session-queue-destination-property-builder> (new CfnGameSessionQueue$GameSessionQueueDestinationProperty$Builder) id config))


(defn cfn-game-session-queue-player-latency-policy-property-builder>
  "The cfn-game-session-queue-player-latency-policy-property-builder> function updates a CfnGameSessionQueue$PlayerLatencyPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnGameSessionQueue$PlayerLatencyPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumIndividualPlayerLatencyMilliseconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-individual-player-latency-milliseconds` |
| `policyDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:policy-duration-seconds` |
"
  [^CfnGameSessionQueue$PlayerLatencyPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :maximum-individual-player-latency-milliseconds)]
    (. builder maximumIndividualPlayerLatencyMilliseconds data))
  (when-some [data (lookup-entry config id :policy-duration-seconds)]
    (. builder policyDurationSeconds data))
  (.build builder))


(defn cfn-game-session-queue-player-latency-policy-property-builder
  "Creates a  `CfnGameSessionQueue$PlayerLatencyPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-game-session-queue-player-latency-policy-property-builder> (new CfnGameSessionQueue$PlayerLatencyPolicyProperty$Builder) id config))


(defn cfn-game-session-queue-priority-configuration-property-builder>
  "The cfn-game-session-queue-priority-configuration-property-builder> function updates a CfnGameSessionQueue$PriorityConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnGameSessionQueue$PriorityConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locationOrder` | java.util.List | [[cdk.support/lookup-entry]] | `:location-order` |
| `priorityOrder` | java.util.List | [[cdk.support/lookup-entry]] | `:priority-order` |
"
  [^CfnGameSessionQueue$PriorityConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :location-order)]
    (. builder locationOrder data))
  (when-some [data (lookup-entry config id :priority-order)]
    (. builder priorityOrder data))
  (.build builder))


(defn cfn-game-session-queue-priority-configuration-property-builder
  "Creates a  `CfnGameSessionQueue$PriorityConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-game-session-queue-priority-configuration-property-builder> (new CfnGameSessionQueue$PriorityConfigurationProperty$Builder) id config))


(defn cfn-game-session-queue-props-builder>
  "The cfn-game-session-queue-props-builder> function updates a CfnGameSessionQueueProps$Builder instance using the provided configuration.
  The function takes the CfnGameSessionQueueProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customEventData` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-event-data` |
| `destinations` | java.util.List | [[cdk.support/lookup-entry]] | `:destinations` |
| `filterConfiguration` | software.amazon.awscdk.services.gamelift.CfnGameSessionQueue$FilterConfigurationProperty | [[cdk.support/lookup-entry]] | `:filter-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notificationTarget` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-target` |
| `playerLatencyPolicies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:player-latency-policies` |
| `priorityConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:priority-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |
"
  [^CfnGameSessionQueueProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-event-data)]
    (. builder customEventData data))
  (when-some [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-some [data (lookup-entry config id :filter-configuration)]
    (. builder filterConfiguration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :notification-target)]
    (. builder notificationTarget data))
  (when-some [data (lookup-entry config id :player-latency-policies)]
    (. builder playerLatencyPolicies data))
  (when-some [data (lookup-entry config id :priority-configuration)]
    (. builder priorityConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout-in-seconds)]
    (. builder timeoutInSeconds data))
  (.build builder))


(defn cfn-game-session-queue-props-builder
  "Creates a  `CfnGameSessionQueueProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-game-session-queue-props-builder> (new CfnGameSessionQueueProps$Builder) id config))


(defn cfn-location-builder>
  "The cfn-location-builder> function updates a CfnLocation$Builder instance using the provided configuration.
  The function takes the CfnLocation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocation$Builder builder id config]
  (when-some [data (lookup-entry config id :location-name)]
    (. builder locationName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-builder
  "Creates a  `CfnLocation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-location-builder> (CfnLocation$Builder/create scope (name id)) id config))


(defn cfn-location-props-builder>
  "The cfn-location-props-builder> function updates a CfnLocationProps$Builder instance using the provided configuration.
  The function takes the CfnLocationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLocationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :location-name)]
    (. builder locationName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-location-props-builder
  "Creates a  `CfnLocationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-location-props-builder> (new CfnLocationProps$Builder) id config))


(defn cfn-matchmaking-configuration-builder>
  "The cfn-matchmaking-configuration-builder> function updates a CfnMatchmakingConfiguration$Builder instance using the provided configuration.
  The function takes the CfnMatchmakingConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptanceRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:acceptance-required` |
| `acceptanceTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:acceptance-timeout-seconds` |
| `additionalPlayerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:additional-player-count` |
| `backfillMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:backfill-mode` |
| `creationTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:creation-time` |
| `customEventData` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-event-data` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `flexMatchMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:flex-match-mode` |
| `gameProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:game-properties` |
| `gameSessionData` | java.lang.String | [[cdk.support/lookup-entry]] | `:game-session-data` |
| `gameSessionQueueArns` | java.util.List | [[cdk.support/lookup-entry]] | `:game-session-queue-arns` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notificationTarget` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-target` |
| `requestTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:request-timeout-seconds` |
| `ruleSetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-arn` |
| `ruleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMatchmakingConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :acceptance-required)]
    (. builder acceptanceRequired data))
  (when-some [data (lookup-entry config id :acceptance-timeout-seconds)]
    (. builder acceptanceTimeoutSeconds data))
  (when-some [data (lookup-entry config id :additional-player-count)]
    (. builder additionalPlayerCount data))
  (when-some [data (lookup-entry config id :backfill-mode)]
    (. builder backfillMode data))
  (when-some [data (lookup-entry config id :creation-time)]
    (. builder creationTime data))
  (when-some [data (lookup-entry config id :custom-event-data)]
    (. builder customEventData data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :flex-match-mode)]
    (. builder flexMatchMode data))
  (when-some [data (lookup-entry config id :game-properties)]
    (. builder gameProperties data))
  (when-some [data (lookup-entry config id :game-session-data)]
    (. builder gameSessionData data))
  (when-some [data (lookup-entry config id :game-session-queue-arns)]
    (. builder gameSessionQueueArns data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :notification-target)]
    (. builder notificationTarget data))
  (when-some [data (lookup-entry config id :request-timeout-seconds)]
    (. builder requestTimeoutSeconds data))
  (when-some [data (lookup-entry config id :rule-set-arn)]
    (. builder ruleSetArn data))
  (when-some [data (lookup-entry config id :rule-set-name)]
    (. builder ruleSetName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-matchmaking-configuration-builder
  "Creates a  `CfnMatchmakingConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-matchmaking-configuration-builder> (CfnMatchmakingConfiguration$Builder/create scope (name id)) id config))


(defn cfn-matchmaking-configuration-game-property-property-builder>
  "The cfn-matchmaking-configuration-game-property-property-builder> function updates a CfnMatchmakingConfiguration$GamePropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnMatchmakingConfiguration$GamePropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnMatchmakingConfiguration$GamePropertyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-matchmaking-configuration-game-property-property-builder
  "Creates a  `CfnMatchmakingConfiguration$GamePropertyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-matchmaking-configuration-game-property-property-builder> (new CfnMatchmakingConfiguration$GamePropertyProperty$Builder) id config))


(defn cfn-matchmaking-configuration-props-builder>
  "The cfn-matchmaking-configuration-props-builder> function updates a CfnMatchmakingConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnMatchmakingConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptanceRequired` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:acceptance-required` |
| `acceptanceTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:acceptance-timeout-seconds` |
| `additionalPlayerCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:additional-player-count` |
| `backfillMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:backfill-mode` |
| `creationTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:creation-time` |
| `customEventData` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-event-data` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `flexMatchMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:flex-match-mode` |
| `gameProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:game-properties` |
| `gameSessionData` | java.lang.String | [[cdk.support/lookup-entry]] | `:game-session-data` |
| `gameSessionQueueArns` | java.util.List | [[cdk.support/lookup-entry]] | `:game-session-queue-arns` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `notificationTarget` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-target` |
| `requestTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:request-timeout-seconds` |
| `ruleSetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-arn` |
| `ruleSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMatchmakingConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :acceptance-required)]
    (. builder acceptanceRequired data))
  (when-some [data (lookup-entry config id :acceptance-timeout-seconds)]
    (. builder acceptanceTimeoutSeconds data))
  (when-some [data (lookup-entry config id :additional-player-count)]
    (. builder additionalPlayerCount data))
  (when-some [data (lookup-entry config id :backfill-mode)]
    (. builder backfillMode data))
  (when-some [data (lookup-entry config id :creation-time)]
    (. builder creationTime data))
  (when-some [data (lookup-entry config id :custom-event-data)]
    (. builder customEventData data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :flex-match-mode)]
    (. builder flexMatchMode data))
  (when-some [data (lookup-entry config id :game-properties)]
    (. builder gameProperties data))
  (when-some [data (lookup-entry config id :game-session-data)]
    (. builder gameSessionData data))
  (when-some [data (lookup-entry config id :game-session-queue-arns)]
    (. builder gameSessionQueueArns data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :notification-target)]
    (. builder notificationTarget data))
  (when-some [data (lookup-entry config id :request-timeout-seconds)]
    (. builder requestTimeoutSeconds data))
  (when-some [data (lookup-entry config id :rule-set-arn)]
    (. builder ruleSetArn data))
  (when-some [data (lookup-entry config id :rule-set-name)]
    (. builder ruleSetName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-matchmaking-configuration-props-builder
  "Creates a  `CfnMatchmakingConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-matchmaking-configuration-props-builder> (new CfnMatchmakingConfigurationProps$Builder) id config))


(defn cfn-matchmaking-rule-set-builder>
  "The cfn-matchmaking-rule-set-builder> function updates a CfnMatchmakingRuleSet$Builder instance using the provided configuration.
  The function takes the CfnMatchmakingRuleSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleSetBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-body` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMatchmakingRuleSet$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rule-set-body)]
    (. builder ruleSetBody data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-matchmaking-rule-set-builder
  "Creates a  `CfnMatchmakingRuleSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-matchmaking-rule-set-builder> (CfnMatchmakingRuleSet$Builder/create scope (name id)) id config))


(defn cfn-matchmaking-rule-set-props-builder>
  "The cfn-matchmaking-rule-set-props-builder> function updates a CfnMatchmakingRuleSetProps$Builder instance using the provided configuration.
  The function takes the CfnMatchmakingRuleSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleSetBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-body` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMatchmakingRuleSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rule-set-body)]
    (. builder ruleSetBody data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-matchmaking-rule-set-props-builder
  "Creates a  `CfnMatchmakingRuleSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-matchmaking-rule-set-props-builder> (new CfnMatchmakingRuleSetProps$Builder) id config))


(defn cfn-script-builder>
  "The cfn-script-builder> function updates a CfnScript$Builder instance using the provided configuration.
  The function takes the CfnScript$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `storageLocation` | software.amazon.awscdk.services.gamelift.CfnScript$S3LocationProperty | [[cdk.support/lookup-entry]] | `:storage-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnScript$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :storage-location)]
    (. builder storageLocation data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-script-builder
  "Creates a  `CfnScript$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-script-builder> (CfnScript$Builder/create scope (name id)) id config))


(defn cfn-script-props-builder>
  "The cfn-script-props-builder> function updates a CfnScriptProps$Builder instance using the provided configuration.
  The function takes the CfnScriptProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `storageLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnScriptProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :storage-location)]
    (. builder storageLocation data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-script-props-builder
  "Creates a  `CfnScriptProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-script-props-builder> (new CfnScriptProps$Builder) id config))


(defn cfn-script-s3-location-property-builder>
  "The cfn-script-s3-location-property-builder> function updates a CfnScript$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnScript$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnScript$S3LocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :object-version)]
    (. builder objectVersion data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-script-s3-location-property-builder
  "Creates a  `CfnScript$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-script-s3-location-property-builder> (new CfnScript$S3LocationProperty$Builder) id config))