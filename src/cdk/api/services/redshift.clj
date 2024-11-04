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


(defn cfn-cluster-builder
  "The cfn-cluster-builder function buildes out new instances of 
CfnCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allow-version-upgrade)]
      (. builder allowVersionUpgrade data))
    (when-let [data (lookup-entry config id :aqua-configuration-status)]
      (. builder aquaConfigurationStatus data))
    (when-let [data (lookup-entry config id :automated-snapshot-retention-period)]
      (. builder automatedSnapshotRetentionPeriod data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :availability-zone-relocation)]
      (. builder availabilityZoneRelocation data))
    (when-let [data (lookup-entry config id :availability-zone-relocation-status)]
      (. builder availabilityZoneRelocationStatus data))
    (when-let [data (lookup-entry config id :classic)]
      (. builder classic data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :cluster-parameter-group-name)]
      (. builder clusterParameterGroupName data))
    (when-let [data (lookup-entry config id :cluster-security-groups)]
      (. builder clusterSecurityGroups data))
    (when-let [data (lookup-entry config id :cluster-subnet-group-name)]
      (. builder clusterSubnetGroupName data))
    (when-let [data (lookup-entry config id :cluster-type)]
      (. builder clusterType data))
    (when-let [data (lookup-entry config id :cluster-version)]
      (. builder clusterVersion data))
    (when-let [data (lookup-entry config id :db-name)]
      (. builder dbName data))
    (when-let [data (lookup-entry config id :defer-maintenance)]
      (. builder deferMaintenance data))
    (when-let [data (lookup-entry config id :defer-maintenance-duration)]
      (. builder deferMaintenanceDuration data))
    (when-let [data (lookup-entry config id :defer-maintenance-end-time)]
      (. builder deferMaintenanceEndTime data))
    (when-let [data (lookup-entry config id :defer-maintenance-start-time)]
      (. builder deferMaintenanceStartTime data))
    (when-let [data (lookup-entry config id :destination-region)]
      (. builder destinationRegion data))
    (when-let [data (lookup-entry config id :elastic-ip)]
      (. builder elasticIp data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :enhanced-vpc-routing)]
      (. builder enhancedVpcRouting data))
    (when-let [data (lookup-entry config id :hsm-client-certificate-identifier)]
      (. builder hsmClientCertificateIdentifier data))
    (when-let [data (lookup-entry config id :hsm-configuration-identifier)]
      (. builder hsmConfigurationIdentifier data))
    (when-let [data (lookup-entry config id :iam-roles)]
      (. builder iamRoles data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :logging-properties)]
      (. builder loggingProperties data))
    (when-let [data (lookup-entry config id :maintenance-track-name)]
      (. builder maintenanceTrackName data))
    (when-let [data (lookup-entry config id :manage-master-password)]
      (. builder manageMasterPassword data))
    (when-let [data (lookup-entry config id :manual-snapshot-retention-period)]
      (. builder manualSnapshotRetentionPeriod data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (when-let [data (lookup-entry config id :master-username)]
      (. builder masterUsername data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (lookup-entry config id :namespace-resource-policy)]
      (. builder namespaceResourcePolicy data))
    (when-let [data (lookup-entry config id :node-type)]
      (. builder nodeType data))
    (when-let [data (lookup-entry config id :number-of-nodes)]
      (. builder numberOfNodes data))
    (when-let [data (lookup-entry config id :owner-account)]
      (. builder ownerAccount data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :resource-action)]
      (. builder resourceAction data))
    (when-let [data (lookup-entry config id :revision-target)]
      (. builder revisionTarget data))
    (when-let [data (lookup-entry config id :rotate-encryption-key)]
      (. builder rotateEncryptionKey data))
    (when-let [data (lookup-entry config id :snapshot-cluster-identifier)]
      (. builder snapshotClusterIdentifier data))
    (when-let [data (lookup-entry config id :snapshot-copy-grant-name)]
      (. builder snapshotCopyGrantName data))
    (when-let [data (lookup-entry config id :snapshot-copy-manual)]
      (. builder snapshotCopyManual data))
    (when-let [data (lookup-entry config id :snapshot-copy-retention-period)]
      (. builder snapshotCopyRetentionPeriod data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-cluster-endpoint-property-builder
  "The cfn-cluster-endpoint-property-builder function buildes out new instances of 
CfnCluster$EndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnCluster$EndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-cluster-logging-properties-property-builder
  "The cfn-cluster-logging-properties-property-builder function buildes out new instances of 
CfnCluster$LoggingPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |"
  [stack id config]
  (let [builder (CfnCluster$LoggingPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (.build builder)))


(defn cfn-cluster-parameter-group-builder
  "The cfn-cluster-parameter-group-builder function buildes out new instances of 
CfnClusterParameterGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterGroupFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-family` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClusterParameterGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :parameter-group-family)]
      (. builder parameterGroupFamily data))
    (when-let [data (lookup-entry config id :parameter-group-name)]
      (. builder parameterGroupName data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-parameter-group-parameter-property-builder
  "The cfn-cluster-parameter-group-parameter-property-builder function buildes out new instances of 
CfnClusterParameterGroup$ParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |"
  [stack id config]
  (let [builder (CfnClusterParameterGroup$ParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameter-name)]
      (. builder parameterName data))
    (when-let [data (lookup-entry config id :parameter-value)]
      (. builder parameterValue data))
    (.build builder)))


(defn cfn-cluster-parameter-group-props-builder
  "The cfn-cluster-parameter-group-props-builder function buildes out new instances of 
CfnClusterParameterGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterGroupFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-family` |
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClusterParameterGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :parameter-group-family)]
      (. builder parameterGroupFamily data))
    (when-let [data (lookup-entry config id :parameter-group-name)]
      (. builder parameterGroupName data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-props-builder
  "The cfn-cluster-props-builder function buildes out new instances of 
CfnClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-version-upgrade)]
      (. builder allowVersionUpgrade data))
    (when-let [data (lookup-entry config id :aqua-configuration-status)]
      (. builder aquaConfigurationStatus data))
    (when-let [data (lookup-entry config id :automated-snapshot-retention-period)]
      (. builder automatedSnapshotRetentionPeriod data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :availability-zone-relocation)]
      (. builder availabilityZoneRelocation data))
    (when-let [data (lookup-entry config id :availability-zone-relocation-status)]
      (. builder availabilityZoneRelocationStatus data))
    (when-let [data (lookup-entry config id :classic)]
      (. builder classic data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :cluster-parameter-group-name)]
      (. builder clusterParameterGroupName data))
    (when-let [data (lookup-entry config id :cluster-security-groups)]
      (. builder clusterSecurityGroups data))
    (when-let [data (lookup-entry config id :cluster-subnet-group-name)]
      (. builder clusterSubnetGroupName data))
    (when-let [data (lookup-entry config id :cluster-type)]
      (. builder clusterType data))
    (when-let [data (lookup-entry config id :cluster-version)]
      (. builder clusterVersion data))
    (when-let [data (lookup-entry config id :db-name)]
      (. builder dbName data))
    (when-let [data (lookup-entry config id :defer-maintenance)]
      (. builder deferMaintenance data))
    (when-let [data (lookup-entry config id :defer-maintenance-duration)]
      (. builder deferMaintenanceDuration data))
    (when-let [data (lookup-entry config id :defer-maintenance-end-time)]
      (. builder deferMaintenanceEndTime data))
    (when-let [data (lookup-entry config id :defer-maintenance-start-time)]
      (. builder deferMaintenanceStartTime data))
    (when-let [data (lookup-entry config id :destination-region)]
      (. builder destinationRegion data))
    (when-let [data (lookup-entry config id :elastic-ip)]
      (. builder elasticIp data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :enhanced-vpc-routing)]
      (. builder enhancedVpcRouting data))
    (when-let [data (lookup-entry config id :hsm-client-certificate-identifier)]
      (. builder hsmClientCertificateIdentifier data))
    (when-let [data (lookup-entry config id :hsm-configuration-identifier)]
      (. builder hsmConfigurationIdentifier data))
    (when-let [data (lookup-entry config id :iam-roles)]
      (. builder iamRoles data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :logging-properties)]
      (. builder loggingProperties data))
    (when-let [data (lookup-entry config id :maintenance-track-name)]
      (. builder maintenanceTrackName data))
    (when-let [data (lookup-entry config id :manage-master-password)]
      (. builder manageMasterPassword data))
    (when-let [data (lookup-entry config id :manual-snapshot-retention-period)]
      (. builder manualSnapshotRetentionPeriod data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (when-let [data (lookup-entry config id :master-username)]
      (. builder masterUsername data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (lookup-entry config id :namespace-resource-policy)]
      (. builder namespaceResourcePolicy data))
    (when-let [data (lookup-entry config id :node-type)]
      (. builder nodeType data))
    (when-let [data (lookup-entry config id :number-of-nodes)]
      (. builder numberOfNodes data))
    (when-let [data (lookup-entry config id :owner-account)]
      (. builder ownerAccount data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :resource-action)]
      (. builder resourceAction data))
    (when-let [data (lookup-entry config id :revision-target)]
      (. builder revisionTarget data))
    (when-let [data (lookup-entry config id :rotate-encryption-key)]
      (. builder rotateEncryptionKey data))
    (when-let [data (lookup-entry config id :snapshot-cluster-identifier)]
      (. builder snapshotClusterIdentifier data))
    (when-let [data (lookup-entry config id :snapshot-copy-grant-name)]
      (. builder snapshotCopyGrantName data))
    (when-let [data (lookup-entry config id :snapshot-copy-manual)]
      (. builder snapshotCopyManual data))
    (when-let [data (lookup-entry config id :snapshot-copy-retention-period)]
      (. builder snapshotCopyRetentionPeriod data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-cluster-security-group-builder
  "The cfn-cluster-security-group-builder function buildes out new instances of 
CfnClusterSecurityGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClusterSecurityGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-security-group-ingress-builder
  "The cfn-cluster-security-group-ingress-builder function buildes out new instances of 
CfnClusterSecurityGroupIngress$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrip` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidrip` |
| `clusterSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-security-group-name` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |"
  [stack id config]
  (let [builder (CfnClusterSecurityGroupIngress$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidrip)]
      (. builder cidrip data))
    (when-let [data (lookup-entry config id :cluster-security-group-name)]
      (. builder clusterSecurityGroupName data))
    (when-let [data (lookup-entry config id :ec2-security-group-name)]
      (. builder ec2SecurityGroupName data))
    (when-let [data (lookup-entry config id :ec2-security-group-owner-id)]
      (. builder ec2SecurityGroupOwnerId data))
    (.build builder)))


(defn cfn-cluster-security-group-ingress-props-builder
  "The cfn-cluster-security-group-ingress-props-builder function buildes out new instances of 
CfnClusterSecurityGroupIngressProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrip` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidrip` |
| `clusterSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-security-group-name` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |"
  [stack id config]
  (let [builder (CfnClusterSecurityGroupIngressProps$Builder.)]
    (when-let [data (lookup-entry config id :cidrip)]
      (. builder cidrip data))
    (when-let [data (lookup-entry config id :cluster-security-group-name)]
      (. builder clusterSecurityGroupName data))
    (when-let [data (lookup-entry config id :ec2-security-group-name)]
      (. builder ec2SecurityGroupName data))
    (when-let [data (lookup-entry config id :ec2-security-group-owner-id)]
      (. builder ec2SecurityGroupOwnerId data))
    (.build builder)))


(defn cfn-cluster-security-group-props-builder
  "The cfn-cluster-security-group-props-builder function buildes out new instances of 
CfnClusterSecurityGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClusterSecurityGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-subnet-group-builder
  "The cfn-cluster-subnet-group-builder function buildes out new instances of 
CfnClusterSubnetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClusterSubnetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-cluster-subnet-group-props-builder
  "The cfn-cluster-subnet-group-props-builder function buildes out new instances of 
CfnClusterSubnetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnClusterSubnetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-endpoint-access-builder
  "The cfn-endpoint-access-builder function buildes out new instances of 
CfnEndpointAccess$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `resourceOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-owner` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnEndpointAccess$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :endpoint-name)]
      (. builder endpointName data))
    (when-let [data (lookup-entry config id :resource-owner)]
      (. builder resourceOwner data))
    (when-let [data (lookup-entry config id :subnet-group-name)]
      (. builder subnetGroupName data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-endpoint-access-network-interface-property-builder
  "The cfn-endpoint-access-network-interface-property-builder function buildes out new instances of 
CfnEndpointAccess$NetworkInterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnEndpointAccess$NetworkInterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-endpoint-access-props-builder
  "The cfn-endpoint-access-props-builder function buildes out new instances of 
CfnEndpointAccessProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `endpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint-name` |
| `resourceOwner` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-owner` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnEndpointAccessProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :endpoint-name)]
      (. builder endpointName data))
    (when-let [data (lookup-entry config id :resource-owner)]
      (. builder resourceOwner data))
    (when-let [data (lookup-entry config id :subnet-group-name)]
      (. builder subnetGroupName data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-endpoint-access-vpc-endpoint-property-builder
  "The cfn-endpoint-access-vpc-endpoint-property-builder function buildes out new instances of 
CfnEndpointAccess$VpcEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkInterfaces` | java.util.List | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnEndpointAccess$VpcEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :network-interfaces)]
      (. builder networkInterfaces data))
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-endpoint-access-vpc-security-group-property-builder
  "The cfn-endpoint-access-vpc-security-group-property-builder function buildes out new instances of 
CfnEndpointAccess$VpcSecurityGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `vpcSecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-security-group-id` |"
  [stack id config]
  (let [builder (CfnEndpointAccess$VpcSecurityGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :vpc-security-group-id)]
      (. builder vpcSecurityGroupId data))
    (.build builder)))


(defn cfn-endpoint-authorization-builder
  "The cfn-endpoint-authorization-builder function buildes out new instances of 
CfnEndpointAuthorization$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `force` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:force` |
| `vpcIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-ids` |"
  [stack id config]
  (let [builder (CfnEndpointAuthorization$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :force)]
      (. builder force data))
    (when-let [data (lookup-entry config id :vpc-ids)]
      (. builder vpcIds data))
    (.build builder)))


(defn cfn-endpoint-authorization-props-builder
  "The cfn-endpoint-authorization-props-builder function buildes out new instances of 
CfnEndpointAuthorizationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.lang.String | [[cdk.support/lookup-entry]] | `:account` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `force` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:force` |
| `vpcIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-ids` |"
  [stack id config]
  (let [builder (CfnEndpointAuthorizationProps$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :force)]
      (. builder force data))
    (when-let [data (lookup-entry config id :vpc-ids)]
      (. builder vpcIds data))
    (.build builder)))


(defn cfn-event-subscription-builder
  "The cfn-event-subscription-builder function buildes out new instances of 
CfnEventSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
| `severity` | java.lang.String | [[cdk.support/lookup-entry]] | `:severity` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `sourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ids` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventSubscription$Builder/create stack id)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :event-categories)]
      (. builder eventCategories data))
    (when-let [data (lookup-entry config id :severity)]
      (. builder severity data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (when-let [data (lookup-entry config id :source-ids)]
      (. builder sourceIds data))
    (when-let [data (lookup-entry config id :source-type)]
      (. builder sourceType data))
    (when-let [data (lookup-entry config id :subscription-name)]
      (. builder subscriptionName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-event-subscription-props-builder
  "The cfn-event-subscription-props-builder function buildes out new instances of 
CfnEventSubscriptionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
| `severity` | java.lang.String | [[cdk.support/lookup-entry]] | `:severity` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
| `sourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ids` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `subscriptionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subscription-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventSubscriptionProps$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :event-categories)]
      (. builder eventCategories data))
    (when-let [data (lookup-entry config id :severity)]
      (. builder severity data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (when-let [data (lookup-entry config id :source-ids)]
      (. builder sourceIds data))
    (when-let [data (lookup-entry config id :source-type)]
      (. builder sourceType data))
    (when-let [data (lookup-entry config id :subscription-name)]
      (. builder subscriptionName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-scheduled-action-builder
  "The cfn-scheduled-action-builder function buildes out new instances of 
CfnScheduledAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable` |
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `iamRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `scheduledActionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-action-description` |
| `scheduledActionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-action-name` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `targetAction` | software.amazon.awscdk.services.redshift.CfnScheduledAction$ScheduledActionTypeProperty | [[cdk.support/lookup-entry]] | `:target-action` |"
  [stack id config]
  (let [builder (CfnScheduledAction$Builder/create stack id)]
    (when-let [data (lookup-entry config id :enable)]
      (. builder enable data))
    (when-let [data (lookup-entry config id :end-time)]
      (. builder endTime data))
    (when-let [data (lookup-entry config id :iam-role)]
      (. builder iamRole data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :scheduled-action-description)]
      (. builder scheduledActionDescription data))
    (when-let [data (lookup-entry config id :scheduled-action-name)]
      (. builder scheduledActionName data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (when-let [data (lookup-entry config id :target-action)]
      (. builder targetAction data))
    (.build builder)))


(defn cfn-scheduled-action-pause-cluster-message-property-builder
  "The cfn-scheduled-action-pause-cluster-message-property-builder function buildes out new instances of 
CfnScheduledAction$PauseClusterMessageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |"
  [stack id config]
  (let [builder (CfnScheduledAction$PauseClusterMessageProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (.build builder)))


(defn cfn-scheduled-action-props-builder
  "The cfn-scheduled-action-props-builder function buildes out new instances of 
CfnScheduledActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enable` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable` |
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `iamRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `scheduledActionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-action-description` |
| `scheduledActionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-action-name` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `targetAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-action` |"
  [stack id config]
  (let [builder (CfnScheduledActionProps$Builder.)]
    (when-let [data (lookup-entry config id :enable)]
      (. builder enable data))
    (when-let [data (lookup-entry config id :end-time)]
      (. builder endTime data))
    (when-let [data (lookup-entry config id :iam-role)]
      (. builder iamRole data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :scheduled-action-description)]
      (. builder scheduledActionDescription data))
    (when-let [data (lookup-entry config id :scheduled-action-name)]
      (. builder scheduledActionName data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (when-let [data (lookup-entry config id :target-action)]
      (. builder targetAction data))
    (.build builder)))


(defn cfn-scheduled-action-resize-cluster-message-property-builder
  "The cfn-scheduled-action-resize-cluster-message-property-builder function buildes out new instances of 
CfnScheduledAction$ResizeClusterMessageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `classic` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:classic` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `clusterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-type` |
| `nodeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:node-type` |
| `numberOfNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-nodes` |"
  [stack id config]
  (let [builder (CfnScheduledAction$ResizeClusterMessageProperty$Builder.)]
    (when-let [data (lookup-entry config id :classic)]
      (. builder classic data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :cluster-type)]
      (. builder clusterType data))
    (when-let [data (lookup-entry config id :node-type)]
      (. builder nodeType data))
    (when-let [data (lookup-entry config id :number-of-nodes)]
      (. builder numberOfNodes data))
    (.build builder)))


(defn cfn-scheduled-action-resume-cluster-message-property-builder
  "The cfn-scheduled-action-resume-cluster-message-property-builder function buildes out new instances of 
CfnScheduledAction$ResumeClusterMessageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |"
  [stack id config]
  (let [builder (CfnScheduledAction$ResumeClusterMessageProperty$Builder.)]
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (.build builder)))


(defn cfn-scheduled-action-scheduled-action-type-property-builder
  "The cfn-scheduled-action-scheduled-action-type-property-builder function buildes out new instances of 
CfnScheduledAction$ScheduledActionTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pauseCluster` | software.amazon.awscdk.services.redshift.CfnScheduledAction$PauseClusterMessageProperty | [[cdk.support/lookup-entry]] | `:pause-cluster` |
| `resizeCluster` | software.amazon.awscdk.services.redshift.CfnScheduledAction$ResizeClusterMessageProperty | [[cdk.support/lookup-entry]] | `:resize-cluster` |
| `resumeCluster` | software.amazon.awscdk.services.redshift.CfnScheduledAction$ResumeClusterMessageProperty | [[cdk.support/lookup-entry]] | `:resume-cluster` |"
  [stack id config]
  (let [builder (CfnScheduledAction$ScheduledActionTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :pause-cluster)]
      (. builder pauseCluster data))
    (when-let [data (lookup-entry config id :resize-cluster)]
      (. builder resizeCluster data))
    (when-let [data (lookup-entry config id :resume-cluster)]
      (. builder resumeCluster data))
    (.build builder)))