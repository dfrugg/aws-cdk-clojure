(ns cdk.api.services.redshift
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.redshift package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.redshift CfnCluster$Builder
                                                     CfnCluster$EndpointProperty$Builder
                                                     CfnCluster$LoggingPropertiesProperty$Builder
                                                     CfnClusterParameterGroup$Builder
                                                     CfnClusterParameterGroup$ParameterProperty$Builder
                                                     CfnClusterParameterGroupProps$Builder
                                                     CfnClusterProps$Builder
                                                     CfnClusterSecurityGroup$Builder
                                                     CfnClusterSecurityGroupIngress$Builder
                                                     CfnClusterSecurityGroupIngressProps$Builder
                                                     CfnClusterSecurityGroupProps$Builder
                                                     CfnClusterSubnetGroup$Builder
                                                     CfnClusterSubnetGroupProps$Builder
                                                     CfnEndpointAccess$Builder
                                                     CfnEndpointAccess$NetworkInterfaceProperty$Builder
                                                     CfnEndpointAccess$VpcEndpointProperty$Builder
                                                     CfnEndpointAccess$VpcSecurityGroupProperty$Builder
                                                     CfnEndpointAccessProps$Builder
                                                     CfnEndpointAuthorization$Builder
                                                     CfnEndpointAuthorizationProps$Builder
                                                     CfnEventSubscription$Builder
                                                     CfnEventSubscriptionProps$Builder
                                                     CfnScheduledAction$Builder
                                                     CfnScheduledAction$PauseClusterMessageProperty$Builder
                                                     CfnScheduledAction$ResizeClusterMessageProperty$Builder
                                                     CfnScheduledAction$ResumeClusterMessageProperty$Builder
                                                     CfnScheduledAction$ScheduledActionTypeProperty$Builder
                                                     CfnScheduledActionProps$Builder]))


(defn cfn-cluster-builder>
  "The cfn-cluster-builder> function updates a CfnCluster$Builder instance using the provided configuration.
  The function takes the CfnCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-version-upgrade` |
| `aquaConfigurationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:aqua-configuration-status` |
| `automatedSnapshotRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automated-snapshot-retention-period` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `availabilityZoneRelocation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:availability-zone-relocation` |
| `availabilityZoneRelocationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone-relocation-status` |
| `classic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:classic` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `clusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-parameter-group-name` |
| `clusterSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:cluster-security-groups` |
| `clusterSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-subnet-group-name` |
| `clusterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-type` |
| `clusterVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-version` |
| `dbName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-name` |
| `deferMaintenance` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:defer-maintenance` |
| `deferMaintenanceDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:defer-maintenance-duration` |
| `deferMaintenanceEndTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:defer-maintenance-end-time` |
| `deferMaintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:defer-maintenance-start-time` |
| `destinationRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-region` |
| `elasticIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:elastic-ip` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `endpoint` | software.amazon.awscdk.services.redshift.CfnCluster$EndpointProperty | [[cdk.support/lookup-entry]] | `:endpoint` |
| `enhancedVpcRouting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enhanced-vpc-routing` |
| `hsmClientCertificateIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:hsm-client-certificate-identifier` |
| `hsmConfigurationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:hsm-configuration-identifier` |
| `iamRoles` | java.util.List | [[cdk.support/lookup-entry]] | `:iam-roles` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `loggingProperties` | software.amazon.awscdk.services.redshift.CfnCluster$LoggingPropertiesProperty | [[cdk.support/lookup-entry]] | `:logging-properties` |
| `maintenanceTrackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-track-name` |
| `manageMasterPassword` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:manage-master-password` |
| `manualSnapshotRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manual-snapshot-retention-period` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |
| `masterUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-username` |
| `multiAz` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-az` |
| `namespaceResourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:namespace-resource-policy` |
| `nodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-type` |
| `numberOfNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-nodes` |
| `ownerAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-account` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `resourceAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-action` |
| `revisionTarget` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision-target` |
| `rotateEncryptionKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rotate-encryption-key` |
| `snapshotClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-cluster-identifier` |
| `snapshotCopyGrantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-copy-grant-name` |
| `snapshotCopyManual` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshot-copy-manual` |
| `snapshotCopyRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-copy-retention-period` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-version-upgrade)]
    (. builder allowVersionUpgrade data))
  (when-some [data (lookup-entry config id :aqua-configuration-status)]
    (. builder aquaConfigurationStatus data))
  (when-some [data (lookup-entry config id :automated-snapshot-retention-period)]
    (. builder automatedSnapshotRetentionPeriod data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :availability-zone-relocation)]
    (. builder availabilityZoneRelocation data))
  (when-some [data (lookup-entry config id :availability-zone-relocation-status)]
    (. builder availabilityZoneRelocationStatus data))
  (when-some [data (lookup-entry config id :classic)]
    (. builder classic data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :cluster-parameter-group-name)]
    (. builder clusterParameterGroupName data))
  (when-some [data (lookup-entry config id :cluster-security-groups)]
    (. builder clusterSecurityGroups data))
  (when-some [data (lookup-entry config id :cluster-subnet-group-name)]
    (. builder clusterSubnetGroupName data))
  (when-some [data (lookup-entry config id :cluster-type)]
    (. builder clusterType data))
  (when-some [data (lookup-entry config id :cluster-version)]
    (. builder clusterVersion data))
  (when-some [data (lookup-entry config id :db-name)]
    (. builder dbName data))
  (when-some [data (lookup-entry config id :defer-maintenance)]
    (. builder deferMaintenance data))
  (when-some [data (lookup-entry config id :defer-maintenance-duration)]
    (. builder deferMaintenanceDuration data))
  (when-some [data (lookup-entry config id :defer-maintenance-end-time)]
    (. builder deferMaintenanceEndTime data))
  (when-some [data (lookup-entry config id :defer-maintenance-start-time)]
    (. builder deferMaintenanceStartTime data))
  (when-some [data (lookup-entry config id :destination-region)]
    (. builder destinationRegion data))
  (when-some [data (lookup-entry config id :elastic-ip)]
    (. builder elasticIp data))
  (when-some [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :enhanced-vpc-routing)]
    (. builder enhancedVpcRouting data))
  (when-some [data (lookup-entry config id :hsm-client-certificate-identifier)]
    (. builder hsmClientCertificateIdentifier data))
  (when-some [data (lookup-entry config id :hsm-configuration-identifier)]
    (. builder hsmConfigurationIdentifier data))
  (when-some [data (lookup-entry config id :iam-roles)]
    (. builder iamRoles data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :logging-properties)]
    (. builder loggingProperties data))
  (when-some [data (lookup-entry config id :maintenance-track-name)]
    (. builder maintenanceTrackName data))
  (when-some [data (lookup-entry config id :manage-master-password)]
    (. builder manageMasterPassword data))
  (when-some [data (lookup-entry config id :manual-snapshot-retention-period)]
    (. builder manualSnapshotRetentionPeriod data))
  (when-some [data (lookup-entry config id :master-user-password)]
    (. builder masterUserPassword data))
  (when-some [data (lookup-entry config id :master-username)]
    (. builder masterUsername data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (lookup-entry config id :namespace-resource-policy)]
    (. builder namespaceResourcePolicy data))
  (when-some [data (lookup-entry config id :node-type)]
    (. builder nodeType data))
  (when-some [data (lookup-entry config id :number-of-nodes)]
    (. builder numberOfNodes data))
  (when-some [data (lookup-entry config id :owner-account)]
    (. builder ownerAccount data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :resource-action)]
    (. builder resourceAction data))
  (when-some [data (lookup-entry config id :revision-target)]
    (. builder revisionTarget data))
  (when-some [data (lookup-entry config id :rotate-encryption-key)]
    (. builder rotateEncryptionKey data))
  (when-some [data (lookup-entry config id :snapshot-cluster-identifier)]
    (. builder snapshotClusterIdentifier data))
  (when-some [data (lookup-entry config id :snapshot-copy-grant-name)]
    (. builder snapshotCopyGrantName data))
  (when-some [data (lookup-entry config id :snapshot-copy-manual)]
    (. builder snapshotCopyManual data))
  (when-some [data (lookup-entry config id :snapshot-copy-retention-period)]
    (. builder snapshotCopyRetentionPeriod data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-cluster-builder
  "Creates a  `CfnCluster$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cluster-builder> (CfnCluster$Builder/create scope (name id)) id config))


(defn cfn-cluster-endpoint-property-builder>
  "The cfn-cluster-endpoint-property-builder> function updates a CfnCluster$EndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$EndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnCluster$EndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-cluster-endpoint-property-builder
  "Creates a  `CfnCluster$EndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-endpoint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-endpoint-property-builder> (new CfnCluster$EndpointProperty$Builder) id config))


(defn cfn-cluster-logging-properties-property-builder>
  "The cfn-cluster-logging-properties-property-builder> function updates a CfnCluster$LoggingPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnCluster$LoggingPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
"
  [^CfnCluster$LoggingPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :s3-key-prefix)]
    (. builder s3KeyPrefix data))
  (.build builder))


(defn cfn-cluster-logging-properties-property-builder
  "Creates a  `CfnCluster$LoggingPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-logging-properties-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-logging-properties-property-builder> (new CfnCluster$LoggingPropertiesProperty$Builder) id config))


(defn cfn-cluster-parameter-group-builder>
  "The cfn-cluster-parameter-group-builder> function updates a CfnClusterParameterGroup$Builder instance using the provided configuration.
  The function takes the CfnClusterParameterGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterGroupFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-family` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClusterParameterGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :parameter-group-family)]
    (. builder parameterGroupFamily data))
  (when-some [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cluster-parameter-group-builder
  "Creates a  `CfnClusterParameterGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-cluster-parameter-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cluster-parameter-group-builder> (CfnClusterParameterGroup$Builder/create scope (name id)) id config))


(defn cfn-cluster-parameter-group-parameter-property-builder>
  "The cfn-cluster-parameter-group-parameter-property-builder> function updates a CfnClusterParameterGroup$ParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnClusterParameterGroup$ParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnClusterParameterGroup$ParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn cfn-cluster-parameter-group-parameter-property-builder
  "Creates a  `CfnClusterParameterGroup$ParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-parameter-group-parameter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-parameter-group-parameter-property-builder> (new CfnClusterParameterGroup$ParameterProperty$Builder) id config))


(defn cfn-cluster-parameter-group-props-builder>
  "The cfn-cluster-parameter-group-props-builder> function updates a CfnClusterParameterGroupProps$Builder instance using the provided configuration.
  The function takes the CfnClusterParameterGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterGroupFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-family` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClusterParameterGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :parameter-group-family)]
    (. builder parameterGroupFamily data))
  (when-some [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cluster-parameter-group-props-builder
  "Creates a  `CfnClusterParameterGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-parameter-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-parameter-group-props-builder> (new CfnClusterParameterGroupProps$Builder) id config))


(defn cfn-cluster-props-builder>
  "The cfn-cluster-props-builder> function updates a CfnClusterProps$Builder instance using the provided configuration.
  The function takes the CfnClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-version-upgrade` |
| `aquaConfigurationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:aqua-configuration-status` |
| `automatedSnapshotRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automated-snapshot-retention-period` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `availabilityZoneRelocation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:availability-zone-relocation` |
| `availabilityZoneRelocationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone-relocation-status` |
| `classic` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:classic` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `clusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-parameter-group-name` |
| `clusterSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:cluster-security-groups` |
| `clusterSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-subnet-group-name` |
| `clusterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-type` |
| `clusterVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-version` |
| `dbName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-name` |
| `deferMaintenance` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:defer-maintenance` |
| `deferMaintenanceDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:defer-maintenance-duration` |
| `deferMaintenanceEndTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:defer-maintenance-end-time` |
| `deferMaintenanceStartTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:defer-maintenance-start-time` |
| `destinationRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-region` |
| `elasticIp` | java.lang.String | [[cdk.support/lookup-entry]] | `:elastic-ip` |
| `encrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:encrypted` |
| `endpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint` |
| `enhancedVpcRouting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enhanced-vpc-routing` |
| `hsmClientCertificateIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:hsm-client-certificate-identifier` |
| `hsmConfigurationIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:hsm-configuration-identifier` |
| `iamRoles` | java.util.List | [[cdk.support/lookup-entry]] | `:iam-roles` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `loggingProperties` | software.amazon.awscdk.services.redshift.CfnCluster$LoggingPropertiesProperty | [[cdk.support/lookup-entry]] | `:logging-properties` |
| `maintenanceTrackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:maintenance-track-name` |
| `manageMasterPassword` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:manage-master-password` |
| `manualSnapshotRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:manual-snapshot-retention-period` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |
| `masterUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-username` |
| `multiAz` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az` |
| `namespaceResourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:namespace-resource-policy` |
| `nodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-type` |
| `numberOfNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-nodes` |
| `ownerAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-account` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `resourceAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-action` |
| `revisionTarget` | java.lang.String | [[cdk.support/lookup-entry]] | `:revision-target` |
| `rotateEncryptionKey` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-encryption-key` |
| `snapshotClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-cluster-identifier` |
| `snapshotCopyGrantName` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-copy-grant-name` |
| `snapshotCopyManual` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:snapshot-copy-manual` |
| `snapshotCopyRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-copy-retention-period` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-version-upgrade)]
    (. builder allowVersionUpgrade data))
  (when-some [data (lookup-entry config id :aqua-configuration-status)]
    (. builder aquaConfigurationStatus data))
  (when-some [data (lookup-entry config id :automated-snapshot-retention-period)]
    (. builder automatedSnapshotRetentionPeriod data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :availability-zone-relocation)]
    (. builder availabilityZoneRelocation data))
  (when-some [data (lookup-entry config id :availability-zone-relocation-status)]
    (. builder availabilityZoneRelocationStatus data))
  (when-some [data (lookup-entry config id :classic)]
    (. builder classic data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :cluster-parameter-group-name)]
    (. builder clusterParameterGroupName data))
  (when-some [data (lookup-entry config id :cluster-security-groups)]
    (. builder clusterSecurityGroups data))
  (when-some [data (lookup-entry config id :cluster-subnet-group-name)]
    (. builder clusterSubnetGroupName data))
  (when-some [data (lookup-entry config id :cluster-type)]
    (. builder clusterType data))
  (when-some [data (lookup-entry config id :cluster-version)]
    (. builder clusterVersion data))
  (when-some [data (lookup-entry config id :db-name)]
    (. builder dbName data))
  (when-some [data (lookup-entry config id :defer-maintenance)]
    (. builder deferMaintenance data))
  (when-some [data (lookup-entry config id :defer-maintenance-duration)]
    (. builder deferMaintenanceDuration data))
  (when-some [data (lookup-entry config id :defer-maintenance-end-time)]
    (. builder deferMaintenanceEndTime data))
  (when-some [data (lookup-entry config id :defer-maintenance-start-time)]
    (. builder deferMaintenanceStartTime data))
  (when-some [data (lookup-entry config id :destination-region)]
    (. builder destinationRegion data))
  (when-some [data (lookup-entry config id :elastic-ip)]
    (. builder elasticIp data))
  (when-some [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :enhanced-vpc-routing)]
    (. builder enhancedVpcRouting data))
  (when-some [data (lookup-entry config id :hsm-client-certificate-identifier)]
    (. builder hsmClientCertificateIdentifier data))
  (when-some [data (lookup-entry config id :hsm-configuration-identifier)]
    (. builder hsmConfigurationIdentifier data))
  (when-some [data (lookup-entry config id :iam-roles)]
    (. builder iamRoles data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :logging-properties)]
    (. builder loggingProperties data))
  (when-some [data (lookup-entry config id :maintenance-track-name)]
    (. builder maintenanceTrackName data))
  (when-some [data (lookup-entry config id :manage-master-password)]
    (. builder manageMasterPassword data))
  (when-some [data (lookup-entry config id :manual-snapshot-retention-period)]
    (. builder manualSnapshotRetentionPeriod data))
  (when-some [data (lookup-entry config id :master-user-password)]
    (. builder masterUserPassword data))
  (when-some [data (lookup-entry config id :master-username)]
    (. builder masterUsername data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (lookup-entry config id :namespace-resource-policy)]
    (. builder namespaceResourcePolicy data))
  (when-some [data (lookup-entry config id :node-type)]
    (. builder nodeType data))
  (when-some [data (lookup-entry config id :number-of-nodes)]
    (. builder numberOfNodes data))
  (when-some [data (lookup-entry config id :owner-account)]
    (. builder ownerAccount data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :resource-action)]
    (. builder resourceAction data))
  (when-some [data (lookup-entry config id :revision-target)]
    (. builder revisionTarget data))
  (when-some [data (lookup-entry config id :rotate-encryption-key)]
    (. builder rotateEncryptionKey data))
  (when-some [data (lookup-entry config id :snapshot-cluster-identifier)]
    (. builder snapshotClusterIdentifier data))
  (when-some [data (lookup-entry config id :snapshot-copy-grant-name)]
    (. builder snapshotCopyGrantName data))
  (when-some [data (lookup-entry config id :snapshot-copy-manual)]
    (. builder snapshotCopyManual data))
  (when-some [data (lookup-entry config id :snapshot-copy-retention-period)]
    (. builder snapshotCopyRetentionPeriod data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-cluster-props-builder
  "Creates a  `CfnClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-props-builder> (new CfnClusterProps$Builder) id config))


(defn cfn-cluster-security-group-builder>
  "The cfn-cluster-security-group-builder> function updates a CfnClusterSecurityGroup$Builder instance using the provided configuration.
  The function takes the CfnClusterSecurityGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClusterSecurityGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cluster-security-group-builder
  "Creates a  `CfnClusterSecurityGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-cluster-security-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cluster-security-group-builder> (CfnClusterSecurityGroup$Builder/create scope (name id)) id config))


(defn cfn-cluster-security-group-ingress-builder>
  "The cfn-cluster-security-group-ingress-builder> function updates a CfnClusterSecurityGroupIngress$Builder instance using the provided configuration.
  The function takes the CfnClusterSecurityGroupIngress$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrip` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidrip` |
| `clusterSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-security-group-name` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |
"
  [^CfnClusterSecurityGroupIngress$Builder builder id config]
  (when-some [data (lookup-entry config id :cidrip)]
    (. builder cidrip data))
  (when-some [data (lookup-entry config id :cluster-security-group-name)]
    (. builder clusterSecurityGroupName data))
  (when-some [data (lookup-entry config id :ec2-security-group-name)]
    (. builder ec2SecurityGroupName data))
  (when-some [data (lookup-entry config id :ec2-security-group-owner-id)]
    (. builder ec2SecurityGroupOwnerId data))
  (.build builder))


(defn cfn-cluster-security-group-ingress-builder
  "Creates a  `CfnClusterSecurityGroupIngress$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-cluster-security-group-ingress-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cluster-security-group-ingress-builder> (CfnClusterSecurityGroupIngress$Builder/create scope (name id)) id config))


(defn cfn-cluster-security-group-ingress-props-builder>
  "The cfn-cluster-security-group-ingress-props-builder> function updates a CfnClusterSecurityGroupIngressProps$Builder instance using the provided configuration.
  The function takes the CfnClusterSecurityGroupIngressProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrip` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidrip` |
| `clusterSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-security-group-name` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |
"
  [^CfnClusterSecurityGroupIngressProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cidrip)]
    (. builder cidrip data))
  (when-some [data (lookup-entry config id :cluster-security-group-name)]
    (. builder clusterSecurityGroupName data))
  (when-some [data (lookup-entry config id :ec2-security-group-name)]
    (. builder ec2SecurityGroupName data))
  (when-some [data (lookup-entry config id :ec2-security-group-owner-id)]
    (. builder ec2SecurityGroupOwnerId data))
  (.build builder))


(defn cfn-cluster-security-group-ingress-props-builder
  "Creates a  `CfnClusterSecurityGroupIngressProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-security-group-ingress-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-security-group-ingress-props-builder> (new CfnClusterSecurityGroupIngressProps$Builder) id config))


(defn cfn-cluster-security-group-props-builder>
  "The cfn-cluster-security-group-props-builder> function updates a CfnClusterSecurityGroupProps$Builder instance using the provided configuration.
  The function takes the CfnClusterSecurityGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClusterSecurityGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cluster-security-group-props-builder
  "Creates a  `CfnClusterSecurityGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-security-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-security-group-props-builder> (new CfnClusterSecurityGroupProps$Builder) id config))


(defn cfn-cluster-subnet-group-builder>
  "The cfn-cluster-subnet-group-builder> function updates a CfnClusterSubnetGroup$Builder instance using the provided configuration.
  The function takes the CfnClusterSubnetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClusterSubnetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cluster-subnet-group-builder
  "Creates a  `CfnClusterSubnetGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-cluster-subnet-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-cluster-subnet-group-builder> (CfnClusterSubnetGroup$Builder/create scope (name id)) id config))


(defn cfn-cluster-subnet-group-props-builder>
  "The cfn-cluster-subnet-group-props-builder> function updates a CfnClusterSubnetGroupProps$Builder instance using the provided configuration.
  The function takes the CfnClusterSubnetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnClusterSubnetGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-cluster-subnet-group-props-builder
  "Creates a  `CfnClusterSubnetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-cluster-subnet-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-cluster-subnet-group-props-builder> (new CfnClusterSubnetGroupProps$Builder) id config))


(defn cfn-endpoint-access-builder>
  "The cfn-endpoint-access-builder> function updates a CfnEndpointAccess$Builder instance using the provided configuration.
  The function takes the CfnEndpointAccess$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `resourceOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-owner` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnEndpointAccess$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-some [data (lookup-entry config id :resource-owner)]
    (. builder resourceOwner data))
  (when-some [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-endpoint-access-builder
  "Creates a  `CfnEndpointAccess$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-endpoint-access-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-endpoint-access-builder> (CfnEndpointAccess$Builder/create scope (name id)) id config))


(defn cfn-endpoint-access-network-interface-property-builder>
  "The cfn-endpoint-access-network-interface-property-builder> function updates a CfnEndpointAccess$NetworkInterfaceProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointAccess$NetworkInterfaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnEndpointAccess$NetworkInterfaceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :network-interface-id)]
    (. builder networkInterfaceId data))
  (when-some [data (lookup-entry config id :private-ip-address)]
    (. builder privateIpAddress data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-endpoint-access-network-interface-property-builder
  "Creates a  `CfnEndpointAccess$NetworkInterfaceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-endpoint-access-network-interface-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-endpoint-access-network-interface-property-builder> (new CfnEndpointAccess$NetworkInterfaceProperty$Builder) id config))


(defn cfn-endpoint-access-props-builder>
  "The cfn-endpoint-access-props-builder> function updates a CfnEndpointAccessProps$Builder instance using the provided configuration.
  The function takes the CfnEndpointAccessProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `resourceOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-owner` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnEndpointAccessProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :endpoint-name)]
    (. builder endpointName data))
  (when-some [data (lookup-entry config id :resource-owner)]
    (. builder resourceOwner data))
  (when-some [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-endpoint-access-props-builder
  "Creates a  `CfnEndpointAccessProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-endpoint-access-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-endpoint-access-props-builder> (new CfnEndpointAccessProps$Builder) id config))


(defn cfn-endpoint-access-vpc-endpoint-property-builder>
  "The cfn-endpoint-access-vpc-endpoint-property-builder> function updates a CfnEndpointAccess$VpcEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointAccess$VpcEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkInterfaces` | java.util.List | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnEndpointAccess$VpcEndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :network-interfaces)]
    (. builder networkInterfaces data))
  (when-some [data (lookup-entry config id :vpc-endpoint-id)]
    (. builder vpcEndpointId data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-endpoint-access-vpc-endpoint-property-builder
  "Creates a  `CfnEndpointAccess$VpcEndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-endpoint-access-vpc-endpoint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-endpoint-access-vpc-endpoint-property-builder> (new CfnEndpointAccess$VpcEndpointProperty$Builder) id config))


(defn cfn-endpoint-access-vpc-security-group-property-builder>
  "The cfn-endpoint-access-vpc-security-group-property-builder> function updates a CfnEndpointAccess$VpcSecurityGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnEndpointAccess$VpcSecurityGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `vpcSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-security-group-id` |
"
  [^CfnEndpointAccess$VpcSecurityGroupProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :vpc-security-group-id)]
    (. builder vpcSecurityGroupId data))
  (.build builder))


(defn cfn-endpoint-access-vpc-security-group-property-builder
  "Creates a  `CfnEndpointAccess$VpcSecurityGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-endpoint-access-vpc-security-group-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-endpoint-access-vpc-security-group-property-builder> (new CfnEndpointAccess$VpcSecurityGroupProperty$Builder) id config))


(defn cfn-endpoint-authorization-builder>
  "The cfn-endpoint-authorization-builder> function updates a CfnEndpointAuthorization$Builder instance using the provided configuration.
  The function takes the CfnEndpointAuthorization$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `force` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:force` |
| `vpcIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-ids` |
"
  [^CfnEndpointAuthorization$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :force)]
    (. builder force data))
  (when-some [data (lookup-entry config id :vpc-ids)]
    (. builder vpcIds data))
  (.build builder))


(defn cfn-endpoint-authorization-builder
  "Creates a  `CfnEndpointAuthorization$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-endpoint-authorization-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-endpoint-authorization-builder> (CfnEndpointAuthorization$Builder/create scope (name id)) id config))


(defn cfn-endpoint-authorization-props-builder>
  "The cfn-endpoint-authorization-props-builder> function updates a CfnEndpointAuthorizationProps$Builder instance using the provided configuration.
  The function takes the CfnEndpointAuthorizationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `force` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:force` |
| `vpcIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-ids` |
"
  [^CfnEndpointAuthorizationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :force)]
    (. builder force data))
  (when-some [data (lookup-entry config id :vpc-ids)]
    (. builder vpcIds data))
  (.build builder))


(defn cfn-endpoint-authorization-props-builder
  "Creates a  `CfnEndpointAuthorizationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-endpoint-authorization-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-endpoint-authorization-props-builder> (new CfnEndpointAuthorizationProps$Builder) id config))


(defn cfn-event-subscription-builder>
  "The cfn-event-subscription-builder> function updates a CfnEventSubscription$Builder instance using the provided configuration.
  The function takes the CfnEventSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
| `severity` | java.lang.String | [[cdk.support/lookup-entry]] | `:severity` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `sourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ids` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEventSubscription$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :event-categories)]
    (. builder eventCategories data))
  (when-some [data (lookup-entry config id :severity)]
    (. builder severity data))
  (when-some [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (when-some [data (lookup-entry config id :source-ids)]
    (. builder sourceIds data))
  (when-some [data (lookup-entry config id :source-type)]
    (. builder sourceType data))
  (when-some [data (lookup-entry config id :subscription-name)]
    (. builder subscriptionName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-event-subscription-builder
  "Creates a  `CfnEventSubscription$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-event-subscription-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-event-subscription-builder> (CfnEventSubscription$Builder/create scope (name id)) id config))


(defn cfn-event-subscription-props-builder>
  "The cfn-event-subscription-props-builder> function updates a CfnEventSubscriptionProps$Builder instance using the provided configuration.
  The function takes the CfnEventSubscriptionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
| `severity` | java.lang.String | [[cdk.support/lookup-entry]] | `:severity` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `sourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ids` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEventSubscriptionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :event-categories)]
    (. builder eventCategories data))
  (when-some [data (lookup-entry config id :severity)]
    (. builder severity data))
  (when-some [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (when-some [data (lookup-entry config id :source-ids)]
    (. builder sourceIds data))
  (when-some [data (lookup-entry config id :source-type)]
    (. builder sourceType data))
  (when-some [data (lookup-entry config id :subscription-name)]
    (. builder subscriptionName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-event-subscription-props-builder
  "Creates a  `CfnEventSubscriptionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-event-subscription-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-event-subscription-props-builder> (new CfnEventSubscriptionProps$Builder) id config))


(defn cfn-scheduled-action-builder>
  "The cfn-scheduled-action-builder> function updates a CfnScheduledAction$Builder instance using the provided configuration.
  The function takes the CfnScheduledAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable` |
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `iamRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `scheduledActionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-action-description` |
| `scheduledActionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-action-name` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `targetAction` | software.amazon.awscdk.services.redshift.CfnScheduledAction$ScheduledActionTypeProperty | [[cdk.support/lookup-entry]] | `:target-action` |
"
  [^CfnScheduledAction$Builder builder id config]
  (when-some [data (lookup-entry config id :enable)]
    (. builder enable data))
  (when-some [data (lookup-entry config id :end-time)]
    (. builder endTime data))
  (when-some [data (lookup-entry config id :iam-role)]
    (. builder iamRole data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :scheduled-action-description)]
    (. builder scheduledActionDescription data))
  (when-some [data (lookup-entry config id :scheduled-action-name)]
    (. builder scheduledActionName data))
  (when-some [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (when-some [data (lookup-entry config id :target-action)]
    (. builder targetAction data))
  (.build builder))


(defn cfn-scheduled-action-builder
  "Creates a  `CfnScheduledAction$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-scheduled-action-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-scheduled-action-builder> (CfnScheduledAction$Builder/create scope (name id)) id config))


(defn cfn-scheduled-action-pause-cluster-message-property-builder>
  "The cfn-scheduled-action-pause-cluster-message-property-builder> function updates a CfnScheduledAction$PauseClusterMessageProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledAction$PauseClusterMessageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
"
  [^CfnScheduledAction$PauseClusterMessageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (.build builder))


(defn cfn-scheduled-action-pause-cluster-message-property-builder
  "Creates a  `CfnScheduledAction$PauseClusterMessageProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-scheduled-action-pause-cluster-message-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-scheduled-action-pause-cluster-message-property-builder> (new CfnScheduledAction$PauseClusterMessageProperty$Builder) id config))


(defn cfn-scheduled-action-props-builder>
  "The cfn-scheduled-action-props-builder> function updates a CfnScheduledActionProps$Builder instance using the provided configuration.
  The function takes the CfnScheduledActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable` |
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `iamRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `scheduledActionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-action-description` |
| `scheduledActionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-action-name` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `targetAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-action` |
"
  [^CfnScheduledActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :enable)]
    (. builder enable data))
  (when-some [data (lookup-entry config id :end-time)]
    (. builder endTime data))
  (when-some [data (lookup-entry config id :iam-role)]
    (. builder iamRole data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :scheduled-action-description)]
    (. builder scheduledActionDescription data))
  (when-some [data (lookup-entry config id :scheduled-action-name)]
    (. builder scheduledActionName data))
  (when-some [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (when-some [data (lookup-entry config id :target-action)]
    (. builder targetAction data))
  (.build builder))


(defn cfn-scheduled-action-props-builder
  "Creates a  `CfnScheduledActionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-scheduled-action-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-scheduled-action-props-builder> (new CfnScheduledActionProps$Builder) id config))


(defn cfn-scheduled-action-resize-cluster-message-property-builder>
  "The cfn-scheduled-action-resize-cluster-message-property-builder> function updates a CfnScheduledAction$ResizeClusterMessageProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledAction$ResizeClusterMessageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:classic` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `clusterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-type` |
| `nodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-type` |
| `numberOfNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-nodes` |
"
  [^CfnScheduledAction$ResizeClusterMessageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :classic)]
    (. builder classic data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :cluster-type)]
    (. builder clusterType data))
  (when-some [data (lookup-entry config id :node-type)]
    (. builder nodeType data))
  (when-some [data (lookup-entry config id :number-of-nodes)]
    (. builder numberOfNodes data))
  (.build builder))


(defn cfn-scheduled-action-resize-cluster-message-property-builder
  "Creates a  `CfnScheduledAction$ResizeClusterMessageProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-scheduled-action-resize-cluster-message-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-scheduled-action-resize-cluster-message-property-builder> (new CfnScheduledAction$ResizeClusterMessageProperty$Builder) id config))


(defn cfn-scheduled-action-resume-cluster-message-property-builder>
  "The cfn-scheduled-action-resume-cluster-message-property-builder> function updates a CfnScheduledAction$ResumeClusterMessageProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledAction$ResumeClusterMessageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
"
  [^CfnScheduledAction$ResumeClusterMessageProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (.build builder))


(defn cfn-scheduled-action-resume-cluster-message-property-builder
  "Creates a  `CfnScheduledAction$ResumeClusterMessageProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-scheduled-action-resume-cluster-message-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-scheduled-action-resume-cluster-message-property-builder> (new CfnScheduledAction$ResumeClusterMessageProperty$Builder) id config))


(defn cfn-scheduled-action-scheduled-action-type-property-builder>
  "The cfn-scheduled-action-scheduled-action-type-property-builder> function updates a CfnScheduledAction$ScheduledActionTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnScheduledAction$ScheduledActionTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pauseCluster` | software.amazon.awscdk.services.redshift.CfnScheduledAction$PauseClusterMessageProperty | [[cdk.support/lookup-entry]] | `:pause-cluster` |
| `resizeCluster` | software.amazon.awscdk.services.redshift.CfnScheduledAction$ResizeClusterMessageProperty | [[cdk.support/lookup-entry]] | `:resize-cluster` |
| `resumeCluster` | software.amazon.awscdk.services.redshift.CfnScheduledAction$ResumeClusterMessageProperty | [[cdk.support/lookup-entry]] | `:resume-cluster` |
"
  [^CfnScheduledAction$ScheduledActionTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :pause-cluster)]
    (. builder pauseCluster data))
  (when-some [data (lookup-entry config id :resize-cluster)]
    (. builder resizeCluster data))
  (when-some [data (lookup-entry config id :resume-cluster)]
    (. builder resumeCluster data))
  (.build builder))


(defn cfn-scheduled-action-scheduled-action-type-property-builder
  "Creates a  `CfnScheduledAction$ScheduledActionTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-scheduled-action-scheduled-action-type-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-scheduled-action-scheduled-action-type-property-builder> (new CfnScheduledAction$ScheduledActionTypeProperty$Builder) id config))