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


(defn cfn-alias-builder
  "The cfn-alias-builder function buildes out new instances of 
CfnAlias$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `routingStrategy` | software.amazon.awscdk.services.gamelift.CfnAlias$RoutingStrategyProperty | [[cdk.support/lookup-entry]] | `:routing-strategy` |"
  [stack id config]
  (let [builder (CfnAlias$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :routing-strategy)]
      (. builder routingStrategy data))
    (.build builder)))


(defn cfn-alias-props-builder
  "The cfn-alias-props-builder function buildes out new instances of 
CfnAliasProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `routingStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:routing-strategy` |"
  [stack id config]
  (let [builder (CfnAliasProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :routing-strategy)]
      (. builder routingStrategy data))
    (.build builder)))


(defn cfn-alias-routing-strategy-property-builder
  "The cfn-alias-routing-strategy-property-builder function buildes out new instances of 
CfnAlias$RoutingStrategyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fleetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet-id` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAlias$RoutingStrategyProperty$Builder.)]
    (when-let [data (lookup-entry config id :fleet-id)]
      (. builder fleetId data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-build-builder
  "The cfn-build-builder function buildes out new instances of 
CfnBuild$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operatingSystem` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system` |
| `serverSdkVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-sdk-version` |
| `storageLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-location` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnBuild$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :operating-system)]
      (. builder operatingSystem data))
    (when-let [data (lookup-entry config id :server-sdk-version)]
      (. builder serverSdkVersion data))
    (when-let [data (lookup-entry config id :storage-location)]
      (. builder storageLocation data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-build-props-builder
  "The cfn-build-props-builder function buildes out new instances of 
CfnBuildProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operatingSystem` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system` |
| `serverSdkVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-sdk-version` |
| `storageLocation` | software.amazon.awscdk.services.gamelift.CfnBuild$StorageLocationProperty | [[cdk.support/lookup-entry]] | `:storage-location` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnBuildProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :operating-system)]
      (. builder operatingSystem data))
    (when-let [data (lookup-entry config id :server-sdk-version)]
      (. builder serverSdkVersion data))
    (when-let [data (lookup-entry config id :storage-location)]
      (. builder storageLocation data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-build-storage-location-property-builder
  "The cfn-build-storage-location-property-builder function buildes out new instances of 
CfnBuild$StorageLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnBuild$StorageLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :object-version)]
      (. builder objectVersion data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-container-group-definition-builder
  "The cfn-container-group-definition-builder function buildes out new instances of 
CfnContainerGroupDefinition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-definitions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operatingSystem` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system` |
| `schedulingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-strategy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `totalCpuLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-cpu-limit` |
| `totalMemoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-memory-limit` |"
  [stack id config]
  (let [builder (CfnContainerGroupDefinition$Builder/create stack id)]
    (when-let [data (lookup-entry config id :container-definitions)]
      (. builder containerDefinitions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :operating-system)]
      (. builder operatingSystem data))
    (when-let [data (lookup-entry config id :scheduling-strategy)]
      (. builder schedulingStrategy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :total-cpu-limit)]
      (. builder totalCpuLimit data))
    (when-let [data (lookup-entry config id :total-memory-limit)]
      (. builder totalMemoryLimit data))
    (.build builder)))


(defn cfn-container-group-definition-container-definition-property-builder
  "The cfn-container-group-definition-container-definition-property-builder function buildes out new instances of 
CfnContainerGroupDefinition$ContainerDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |"
  [stack id config]
  (let [builder (CfnContainerGroupDefinition$ContainerDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :depends-on)]
      (. builder dependsOn data))
    (when-let [data (lookup-entry config id :entry-point)]
      (. builder entryPoint data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :essential)]
      (. builder essential data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :image-uri)]
      (. builder imageUri data))
    (when-let [data (lookup-entry config id :memory-limits)]
      (. builder memoryLimits data))
    (when-let [data (lookup-entry config id :port-configuration)]
      (. builder portConfiguration data))
    (when-let [data (lookup-entry config id :resolved-image-digest)]
      (. builder resolvedImageDigest data))
    (when-let [data (lookup-entry config id :working-directory)]
      (. builder workingDirectory data))
    (.build builder)))


(defn cfn-container-group-definition-container-dependency-property-builder
  "The cfn-container-group-definition-container-dependency-property-builder function buildes out new instances of 
CfnContainerGroupDefinition$ContainerDependencyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |"
  [stack id config]
  (let [builder (CfnContainerGroupDefinition$ContainerDependencyProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (.build builder)))


(defn cfn-container-group-definition-container-environment-property-builder
  "The cfn-container-group-definition-container-environment-property-builder function buildes out new instances of 
CfnContainerGroupDefinition$ContainerEnvironmentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnContainerGroupDefinition$ContainerEnvironmentProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-container-group-definition-container-health-check-property-builder
  "The cfn-container-group-definition-container-health-check-property-builder function buildes out new instances of 
CfnContainerGroupDefinition$ContainerHealthCheckProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `retries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retries` |
| `startPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-period` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnContainerGroupDefinition$ContainerHealthCheckProperty$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :retries)]
      (. builder retries data))
    (when-let [data (lookup-entry config id :start-period)]
      (. builder startPeriod data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-container-group-definition-container-port-range-property-builder
  "The cfn-container-group-definition-container-port-range-property-builder function buildes out new instances of 
CfnContainerGroupDefinition$ContainerPortRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnContainerGroupDefinition$ContainerPortRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-container-group-definition-memory-limits-property-builder
  "The cfn-container-group-definition-memory-limits-property-builder function buildes out new instances of 
CfnContainerGroupDefinition$MemoryLimitsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hardLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hard-limit` |
| `softLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:soft-limit` |"
  [stack id config]
  (let [builder (CfnContainerGroupDefinition$MemoryLimitsProperty$Builder.)]
    (when-let [data (lookup-entry config id :hard-limit)]
      (. builder hardLimit data))
    (when-let [data (lookup-entry config id :soft-limit)]
      (. builder softLimit data))
    (.build builder)))


(defn cfn-container-group-definition-port-configuration-property-builder
  "The cfn-container-group-definition-port-configuration-property-builder function buildes out new instances of 
CfnContainerGroupDefinition$PortConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPortRanges` | java.util.List | [[cdk.support/lookup-entry]] | `:container-port-ranges` |"
  [stack id config]
  (let [builder (CfnContainerGroupDefinition$PortConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-port-ranges)]
      (. builder containerPortRanges data))
    (.build builder)))


(defn cfn-container-group-definition-props-builder
  "The cfn-container-group-definition-props-builder function buildes out new instances of 
CfnContainerGroupDefinitionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerDefinitions` | java.util.List | [[cdk.support/lookup-entry]] | `:container-definitions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operatingSystem` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system` |
| `schedulingStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduling-strategy` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `totalCpuLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-cpu-limit` |
| `totalMemoryLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total-memory-limit` |"
  [stack id config]
  (let [builder (CfnContainerGroupDefinitionProps$Builder.)]
    (when-let [data (lookup-entry config id :container-definitions)]
      (. builder containerDefinitions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :operating-system)]
      (. builder operatingSystem data))
    (when-let [data (lookup-entry config id :scheduling-strategy)]
      (. builder schedulingStrategy data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :total-cpu-limit)]
      (. builder totalCpuLimit data))
    (when-let [data (lookup-entry config id :total-memory-limit)]
      (. builder totalMemoryLimit data))
    (.build builder)))


(defn cfn-fleet-anywhere-configuration-property-builder
  "The cfn-fleet-anywhere-configuration-property-builder function buildes out new instances of 
CfnFleet$AnywhereConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cost` | java.lang.String | [[cdk.support/lookup-entry]] | `:cost` |"
  [stack id config]
  (let [builder (CfnFleet$AnywhereConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cost)]
      (. builder cost data))
    (.build builder)))


(defn cfn-fleet-builder
  "The cfn-fleet-builder function buildes out new instances of 
CfnFleet$Builder using the provided configuration.  Each field is set as follows:

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
| `serverLaunchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-launch-path` |"
  [stack id config]
  (let [builder (CfnFleet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :anywhere-configuration)]
      (. builder anywhereConfiguration data))
    (when-let [data (lookup-entry config id :apply-capacity)]
      (. builder applyCapacity data))
    (when-let [data (lookup-entry config id :build-id)]
      (. builder buildId data))
    (when-let [data (lookup-entry config id :certificate-configuration)]
      (. builder certificateConfiguration data))
    (when-let [data (lookup-entry config id :compute-type)]
      (. builder computeType data))
    (when-let [data (lookup-entry config id :container-groups-configuration)]
      (. builder containerGroupsConfiguration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :desired-ec2-instances)]
      (. builder desiredEc2Instances data))
    (when-let [data (lookup-entry config id :ec2-inbound-permissions)]
      (. builder ec2InboundPermissions data))
    (when-let [data (lookup-entry config id :ec2-instance-type)]
      (. builder ec2InstanceType data))
    (when-let [data (lookup-entry config id :fleet-type)]
      (. builder fleetType data))
    (when-let [data (lookup-entry config id :instance-role-arn)]
      (. builder instanceRoleArn data))
    (when-let [data (lookup-entry config id :instance-role-credentials-provider)]
      (. builder instanceRoleCredentialsProvider data))
    (when-let [data (lookup-entry config id :locations)]
      (. builder locations data))
    (when-let [data (lookup-entry config id :log-paths)]
      (. builder logPaths data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :metric-groups)]
      (. builder metricGroups data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :new-game-session-protection-policy)]
      (. builder newGameSessionProtectionPolicy data))
    (when-let [data (lookup-entry config id :peer-vpc-aws-account-id)]
      (. builder peerVpcAwsAccountId data))
    (when-let [data (lookup-entry config id :peer-vpc-id)]
      (. builder peerVpcId data))
    (when-let [data (lookup-entry config id :resource-creation-limit-policy)]
      (. builder resourceCreationLimitPolicy data))
    (when-let [data (lookup-entry config id :runtime-configuration)]
      (. builder runtimeConfiguration data))
    (when-let [data (lookup-entry config id :scaling-policies)]
      (. builder scalingPolicies data))
    (when-let [data (lookup-entry config id :script-id)]
      (. builder scriptId data))
    (when-let [data (lookup-entry config id :server-launch-parameters)]
      (. builder serverLaunchParameters data))
    (when-let [data (lookup-entry config id :server-launch-path)]
      (. builder serverLaunchPath data))
    (.build builder)))


(defn cfn-fleet-certificate-configuration-property-builder
  "The cfn-fleet-certificate-configuration-property-builder function buildes out new instances of 
CfnFleet$CertificateConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-type` |"
  [stack id config]
  (let [builder (CfnFleet$CertificateConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-type)]
      (. builder certificateType data))
    (.build builder)))


(defn cfn-fleet-connection-port-range-property-builder
  "The cfn-fleet-connection-port-range-property-builder function buildes out new instances of 
CfnFleet$ConnectionPortRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnFleet$ConnectionPortRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-fleet-container-groups-configuration-property-builder
  "The cfn-fleet-container-groups-configuration-property-builder function buildes out new instances of 
CfnFleet$ContainerGroupsConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPortRange` | software.amazon.awscdk.services.gamelift.CfnFleet$ConnectionPortRangeProperty | [[cdk.support/lookup-entry]] | `:connection-port-range` |
| `containerGroupDefinitionNames` | java.util.List | [[cdk.support/lookup-entry]] | `:container-group-definition-names` |
| `containerGroupsPerInstance` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-groups-per-instance` |"
  [stack id config]
  (let [builder (CfnFleet$ContainerGroupsConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-port-range)]
      (. builder connectionPortRange data))
    (when-let [data (lookup-entry config id :container-group-definition-names)]
      (. builder containerGroupDefinitionNames data))
    (when-let [data (lookup-entry config id :container-groups-per-instance)]
      (. builder containerGroupsPerInstance data))
    (.build builder)))


(defn cfn-fleet-container-groups-per-instance-property-builder
  "The cfn-fleet-container-groups-per-instance-property-builder function buildes out new instances of 
CfnFleet$ContainerGroupsPerInstanceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredReplicaContainerGroupsPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-replica-container-groups-per-instance` |
| `maxReplicaContainerGroupsPerInstance` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-replica-container-groups-per-instance` |"
  [stack id config]
  (let [builder (CfnFleet$ContainerGroupsPerInstanceProperty$Builder.)]
    (when-let [data (lookup-entry config id :desired-replica-container-groups-per-instance)]
      (. builder desiredReplicaContainerGroupsPerInstance data))
    (when-let [data (lookup-entry config id :max-replica-container-groups-per-instance)]
      (. builder maxReplicaContainerGroupsPerInstance data))
    (.build builder)))


(defn cfn-fleet-ip-permission-property-builder
  "The cfn-fleet-ip-permission-property-builder function buildes out new instances of 
CfnFleet$IpPermissionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `ipRange` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-range` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnFleet$IpPermissionProperty$Builder.)]
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :ip-range)]
      (. builder ipRange data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-fleet-location-capacity-property-builder
  "The cfn-fleet-location-capacity-property-builder function buildes out new instances of 
CfnFleet$LocationCapacityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredEc2Instances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-ec2-instances` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |"
  [stack id config]
  (let [builder (CfnFleet$LocationCapacityProperty$Builder.)]
    (when-let [data (lookup-entry config id :desired-ec2-instances)]
      (. builder desiredEc2Instances data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (.build builder)))


(defn cfn-fleet-location-configuration-property-builder
  "The cfn-fleet-location-configuration-property-builder function buildes out new instances of 
CfnFleet$LocationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `locationCapacity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location-capacity` |"
  [stack id config]
  (let [builder (CfnFleet$LocationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :location-capacity)]
      (. builder locationCapacity data))
    (.build builder)))


(defn cfn-fleet-props-builder
  "The cfn-fleet-props-builder function buildes out new instances of 
CfnFleetProps$Builder using the provided configuration.  Each field is set as follows:

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
| `serverLaunchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-launch-path` |"
  [stack id config]
  (let [builder (CfnFleetProps$Builder.)]
    (when-let [data (lookup-entry config id :anywhere-configuration)]
      (. builder anywhereConfiguration data))
    (when-let [data (lookup-entry config id :apply-capacity)]
      (. builder applyCapacity data))
    (when-let [data (lookup-entry config id :build-id)]
      (. builder buildId data))
    (when-let [data (lookup-entry config id :certificate-configuration)]
      (. builder certificateConfiguration data))
    (when-let [data (lookup-entry config id :compute-type)]
      (. builder computeType data))
    (when-let [data (lookup-entry config id :container-groups-configuration)]
      (. builder containerGroupsConfiguration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :desired-ec2-instances)]
      (. builder desiredEc2Instances data))
    (when-let [data (lookup-entry config id :ec2-inbound-permissions)]
      (. builder ec2InboundPermissions data))
    (when-let [data (lookup-entry config id :ec2-instance-type)]
      (. builder ec2InstanceType data))
    (when-let [data (lookup-entry config id :fleet-type)]
      (. builder fleetType data))
    (when-let [data (lookup-entry config id :instance-role-arn)]
      (. builder instanceRoleArn data))
    (when-let [data (lookup-entry config id :instance-role-credentials-provider)]
      (. builder instanceRoleCredentialsProvider data))
    (when-let [data (lookup-entry config id :locations)]
      (. builder locations data))
    (when-let [data (lookup-entry config id :log-paths)]
      (. builder logPaths data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :metric-groups)]
      (. builder metricGroups data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :new-game-session-protection-policy)]
      (. builder newGameSessionProtectionPolicy data))
    (when-let [data (lookup-entry config id :peer-vpc-aws-account-id)]
      (. builder peerVpcAwsAccountId data))
    (when-let [data (lookup-entry config id :peer-vpc-id)]
      (. builder peerVpcId data))
    (when-let [data (lookup-entry config id :resource-creation-limit-policy)]
      (. builder resourceCreationLimitPolicy data))
    (when-let [data (lookup-entry config id :runtime-configuration)]
      (. builder runtimeConfiguration data))
    (when-let [data (lookup-entry config id :scaling-policies)]
      (. builder scalingPolicies data))
    (when-let [data (lookup-entry config id :script-id)]
      (. builder scriptId data))
    (when-let [data (lookup-entry config id :server-launch-parameters)]
      (. builder serverLaunchParameters data))
    (when-let [data (lookup-entry config id :server-launch-path)]
      (. builder serverLaunchPath data))
    (.build builder)))


(defn cfn-fleet-resource-creation-limit-policy-property-builder
  "The cfn-fleet-resource-creation-limit-policy-property-builder function buildes out new instances of 
CfnFleet$ResourceCreationLimitPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `newGameSessionsPerCreator` | java.lang.Number | [[cdk.support/lookup-entry]] | `:new-game-sessions-per-creator` |
| `policyPeriodInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:policy-period-in-minutes` |"
  [stack id config]
  (let [builder (CfnFleet$ResourceCreationLimitPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :new-game-sessions-per-creator)]
      (. builder newGameSessionsPerCreator data))
    (when-let [data (lookup-entry config id :policy-period-in-minutes)]
      (. builder policyPeriodInMinutes data))
    (.build builder)))


(defn cfn-fleet-runtime-configuration-property-builder
  "The cfn-fleet-runtime-configuration-property-builder function buildes out new instances of 
CfnFleet$RuntimeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gameSessionActivationTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:game-session-activation-timeout-seconds` |
| `maxConcurrentGameSessionActivations` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrent-game-session-activations` |
| `serverProcesses` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-processes` |"
  [stack id config]
  (let [builder (CfnFleet$RuntimeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :game-session-activation-timeout-seconds)]
      (. builder gameSessionActivationTimeoutSeconds data))
    (when-let [data (lookup-entry config id :max-concurrent-game-session-activations)]
      (. builder maxConcurrentGameSessionActivations data))
    (when-let [data (lookup-entry config id :server-processes)]
      (. builder serverProcesses data))
    (.build builder)))


(defn cfn-fleet-scaling-policy-property-builder
  "The cfn-fleet-scaling-policy-property-builder function buildes out new instances of 
CfnFleet$ScalingPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `updateStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-status` |"
  [stack id config]
  (let [builder (CfnFleet$ScalingPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :evaluation-periods)]
      (. builder evaluationPeriods data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :policy-type)]
      (. builder policyType data))
    (when-let [data (lookup-entry config id :scaling-adjustment)]
      (. builder scalingAdjustment data))
    (when-let [data (lookup-entry config id :scaling-adjustment-type)]
      (. builder scalingAdjustmentType data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :target-configuration)]
      (. builder targetConfiguration data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (lookup-entry config id :update-status)]
      (. builder updateStatus data))
    (.build builder)))


(defn cfn-fleet-server-process-property-builder
  "The cfn-fleet-server-process-property-builder function buildes out new instances of 
CfnFleet$ServerProcessProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `concurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrent-executions` |
| `launchPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-path` |
| `parameters` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameters` |"
  [stack id config]
  (let [builder (CfnFleet$ServerProcessProperty$Builder.)]
    (when-let [data (lookup-entry config id :concurrent-executions)]
      (. builder concurrentExecutions data))
    (when-let [data (lookup-entry config id :launch-path)]
      (. builder launchPath data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (.build builder)))


(defn cfn-fleet-target-configuration-property-builder
  "The cfn-fleet-target-configuration-property-builder function buildes out new instances of 
CfnFleet$TargetConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (CfnFleet$TargetConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))


(defn cfn-game-server-group-auto-scaling-policy-property-builder
  "The cfn-game-server-group-auto-scaling-policy-property-builder function buildes out new instances of 
CfnGameServerGroup$AutoScalingPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `estimatedInstanceWarmup` | java.lang.Number | [[cdk.support/lookup-entry]] | `:estimated-instance-warmup` |
| `targetTrackingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-tracking-configuration` |"
  [stack id config]
  (let [builder (CfnGameServerGroup$AutoScalingPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :estimated-instance-warmup)]
      (. builder estimatedInstanceWarmup data))
    (when-let [data (lookup-entry config id :target-tracking-configuration)]
      (. builder targetTrackingConfiguration data))
    (.build builder)))


(defn cfn-game-server-group-builder
  "The cfn-game-server-group-builder function buildes out new instances of 
CfnGameServerGroup$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (CfnGameServerGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-policy)]
      (. builder autoScalingPolicy data))
    (when-let [data (lookup-entry config id :balancing-strategy)]
      (. builder balancingStrategy data))
    (when-let [data (lookup-entry config id :delete-option)]
      (. builder deleteOption data))
    (when-let [data (lookup-entry config id :game-server-group-name)]
      (. builder gameServerGroupName data))
    (when-let [data (lookup-entry config id :game-server-protection-policy)]
      (. builder gameServerProtectionPolicy data))
    (when-let [data (lookup-entry config id :instance-definitions)]
      (. builder instanceDefinitions data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn cfn-game-server-group-instance-definition-property-builder
  "The cfn-game-server-group-instance-definition-property-builder function buildes out new instances of 
CfnGameServerGroup$InstanceDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `weightedCapacity` | java.lang.String | [[cdk.support/lookup-entry]] | `:weighted-capacity` |"
  [stack id config]
  (let [builder (CfnGameServerGroup$InstanceDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :weighted-capacity)]
      (. builder weightedCapacity data))
    (.build builder)))


(defn cfn-game-server-group-launch-template-property-builder
  "The cfn-game-server-group-launch-template-property-builder function buildes out new instances of 
CfnGameServerGroup$LaunchTemplateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `launchTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-id` |
| `launchTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:launch-template-name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnGameServerGroup$LaunchTemplateProperty$Builder.)]
    (when-let [data (lookup-entry config id :launch-template-id)]
      (. builder launchTemplateId data))
    (when-let [data (lookup-entry config id :launch-template-name)]
      (. builder launchTemplateName data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-game-server-group-props-builder
  "The cfn-game-server-group-props-builder function buildes out new instances of 
CfnGameServerGroupProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (CfnGameServerGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-policy)]
      (. builder autoScalingPolicy data))
    (when-let [data (lookup-entry config id :balancing-strategy)]
      (. builder balancingStrategy data))
    (when-let [data (lookup-entry config id :delete-option)]
      (. builder deleteOption data))
    (when-let [data (lookup-entry config id :game-server-group-name)]
      (. builder gameServerGroupName data))
    (when-let [data (lookup-entry config id :game-server-protection-policy)]
      (. builder gameServerProtectionPolicy data))
    (when-let [data (lookup-entry config id :instance-definitions)]
      (. builder instanceDefinitions data))
    (when-let [data (lookup-entry config id :launch-template)]
      (. builder launchTemplate data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn cfn-game-server-group-target-tracking-configuration-property-builder
  "The cfn-game-server-group-target-tracking-configuration-property-builder function buildes out new instances of 
CfnGameServerGroup$TargetTrackingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:target-value` |"
  [stack id config]
  (let [builder (CfnGameServerGroup$TargetTrackingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-value)]
      (. builder targetValue data))
    (.build builder)))


(defn cfn-game-session-queue-builder
  "The cfn-game-session-queue-builder function buildes out new instances of 
CfnGameSessionQueue$Builder using the provided configuration.  Each field is set as follows:

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
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |"
  [stack id config]
  (let [builder (CfnGameSessionQueue$Builder/create stack id)]
    (when-let [data (lookup-entry config id :custom-event-data)]
      (. builder customEventData data))
    (when-let [data (lookup-entry config id :destinations)]
      (. builder destinations data))
    (when-let [data (lookup-entry config id :filter-configuration)]
      (. builder filterConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :notification-target)]
      (. builder notificationTarget data))
    (when-let [data (lookup-entry config id :player-latency-policies)]
      (. builder playerLatencyPolicies data))
    (when-let [data (lookup-entry config id :priority-configuration)]
      (. builder priorityConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout-in-seconds)]
      (. builder timeoutInSeconds data))
    (.build builder)))


(defn cfn-game-session-queue-destination-property-builder
  "The cfn-game-session-queue-destination-property-builder function buildes out new instances of 
CfnGameSessionQueue$DestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |"
  [stack id config]
  (let [builder (CfnGameSessionQueue$DestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (.build builder)))


(defn cfn-game-session-queue-filter-configuration-property-builder
  "The cfn-game-session-queue-filter-configuration-property-builder function buildes out new instances of 
CfnGameSessionQueue$FilterConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-locations` |"
  [stack id config]
  (let [builder (CfnGameSessionQueue$FilterConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-locations)]
      (. builder allowedLocations data))
    (.build builder)))


(defn cfn-game-session-queue-game-session-queue-destination-property-builder
  "The cfn-game-session-queue-game-session-queue-destination-property-builder function buildes out new instances of 
CfnGameSessionQueue$GameSessionQueueDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |"
  [stack id config]
  (let [builder (CfnGameSessionQueue$GameSessionQueueDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (.build builder)))


(defn cfn-game-session-queue-player-latency-policy-property-builder
  "The cfn-game-session-queue-player-latency-policy-property-builder function buildes out new instances of 
CfnGameSessionQueue$PlayerLatencyPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maximumIndividualPlayerLatencyMilliseconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-individual-player-latency-milliseconds` |
| `policyDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:policy-duration-seconds` |"
  [stack id config]
  (let [builder (CfnGameSessionQueue$PlayerLatencyPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :maximum-individual-player-latency-milliseconds)]
      (. builder maximumIndividualPlayerLatencyMilliseconds data))
    (when-let [data (lookup-entry config id :policy-duration-seconds)]
      (. builder policyDurationSeconds data))
    (.build builder)))


(defn cfn-game-session-queue-priority-configuration-property-builder
  "The cfn-game-session-queue-priority-configuration-property-builder function buildes out new instances of 
CfnGameSessionQueue$PriorityConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locationOrder` | java.util.List | [[cdk.support/lookup-entry]] | `:location-order` |
| `priorityOrder` | java.util.List | [[cdk.support/lookup-entry]] | `:priority-order` |"
  [stack id config]
  (let [builder (CfnGameSessionQueue$PriorityConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :location-order)]
      (. builder locationOrder data))
    (when-let [data (lookup-entry config id :priority-order)]
      (. builder priorityOrder data))
    (.build builder)))


(defn cfn-game-session-queue-props-builder
  "The cfn-game-session-queue-props-builder function buildes out new instances of 
CfnGameSessionQueueProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |"
  [stack id config]
  (let [builder (CfnGameSessionQueueProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-event-data)]
      (. builder customEventData data))
    (when-let [data (lookup-entry config id :destinations)]
      (. builder destinations data))
    (when-let [data (lookup-entry config id :filter-configuration)]
      (. builder filterConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :notification-target)]
      (. builder notificationTarget data))
    (when-let [data (lookup-entry config id :player-latency-policies)]
      (. builder playerLatencyPolicies data))
    (when-let [data (lookup-entry config id :priority-configuration)]
      (. builder priorityConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :timeout-in-seconds)]
      (. builder timeoutInSeconds data))
    (.build builder)))


(defn cfn-location-builder
  "The cfn-location-builder function buildes out new instances of 
CfnLocation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :location-name)]
      (. builder locationName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-location-props-builder
  "The cfn-location-props-builder function buildes out new instances of 
CfnLocationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLocationProps$Builder.)]
    (when-let [data (lookup-entry config id :location-name)]
      (. builder locationName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-matchmaking-configuration-builder
  "The cfn-matchmaking-configuration-builder function buildes out new instances of 
CfnMatchmakingConfiguration$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMatchmakingConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :acceptance-required)]
      (. builder acceptanceRequired data))
    (when-let [data (lookup-entry config id :acceptance-timeout-seconds)]
      (. builder acceptanceTimeoutSeconds data))
    (when-let [data (lookup-entry config id :additional-player-count)]
      (. builder additionalPlayerCount data))
    (when-let [data (lookup-entry config id :backfill-mode)]
      (. builder backfillMode data))
    (when-let [data (lookup-entry config id :creation-time)]
      (. builder creationTime data))
    (when-let [data (lookup-entry config id :custom-event-data)]
      (. builder customEventData data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :flex-match-mode)]
      (. builder flexMatchMode data))
    (when-let [data (lookup-entry config id :game-properties)]
      (. builder gameProperties data))
    (when-let [data (lookup-entry config id :game-session-data)]
      (. builder gameSessionData data))
    (when-let [data (lookup-entry config id :game-session-queue-arns)]
      (. builder gameSessionQueueArns data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :notification-target)]
      (. builder notificationTarget data))
    (when-let [data (lookup-entry config id :request-timeout-seconds)]
      (. builder requestTimeoutSeconds data))
    (when-let [data (lookup-entry config id :rule-set-arn)]
      (. builder ruleSetArn data))
    (when-let [data (lookup-entry config id :rule-set-name)]
      (. builder ruleSetName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-matchmaking-configuration-game-property-property-builder
  "The cfn-matchmaking-configuration-game-property-property-builder function buildes out new instances of 
CfnMatchmakingConfiguration$GamePropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnMatchmakingConfiguration$GamePropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-matchmaking-configuration-props-builder
  "The cfn-matchmaking-configuration-props-builder function buildes out new instances of 
CfnMatchmakingConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMatchmakingConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :acceptance-required)]
      (. builder acceptanceRequired data))
    (when-let [data (lookup-entry config id :acceptance-timeout-seconds)]
      (. builder acceptanceTimeoutSeconds data))
    (when-let [data (lookup-entry config id :additional-player-count)]
      (. builder additionalPlayerCount data))
    (when-let [data (lookup-entry config id :backfill-mode)]
      (. builder backfillMode data))
    (when-let [data (lookup-entry config id :creation-time)]
      (. builder creationTime data))
    (when-let [data (lookup-entry config id :custom-event-data)]
      (. builder customEventData data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :flex-match-mode)]
      (. builder flexMatchMode data))
    (when-let [data (lookup-entry config id :game-properties)]
      (. builder gameProperties data))
    (when-let [data (lookup-entry config id :game-session-data)]
      (. builder gameSessionData data))
    (when-let [data (lookup-entry config id :game-session-queue-arns)]
      (. builder gameSessionQueueArns data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :notification-target)]
      (. builder notificationTarget data))
    (when-let [data (lookup-entry config id :request-timeout-seconds)]
      (. builder requestTimeoutSeconds data))
    (when-let [data (lookup-entry config id :rule-set-arn)]
      (. builder ruleSetArn data))
    (when-let [data (lookup-entry config id :rule-set-name)]
      (. builder ruleSetName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-matchmaking-rule-set-builder
  "The cfn-matchmaking-rule-set-builder function buildes out new instances of 
CfnMatchmakingRuleSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleSetBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-body` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMatchmakingRuleSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rule-set-body)]
      (. builder ruleSetBody data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-matchmaking-rule-set-props-builder
  "The cfn-matchmaking-rule-set-props-builder function buildes out new instances of 
CfnMatchmakingRuleSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleSetBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-set-body` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMatchmakingRuleSetProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rule-set-body)]
      (. builder ruleSetBody data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-script-builder
  "The cfn-script-builder function buildes out new instances of 
CfnScript$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `storageLocation` | software.amazon.awscdk.services.gamelift.CfnScript$S3LocationProperty | [[cdk.support/lookup-entry]] | `:storage-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnScript$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :storage-location)]
      (. builder storageLocation data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-script-props-builder
  "The cfn-script-props-builder function buildes out new instances of 
CfnScriptProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `storageLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-location` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnScriptProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :storage-location)]
      (. builder storageLocation data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-script-s3-location-property-builder
  "The cfn-script-s3-location-property-builder function buildes out new instances of 
CfnScript$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnScript$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :object-version)]
      (. builder objectVersion data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))