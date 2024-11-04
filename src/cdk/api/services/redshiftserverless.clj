(ns cdk.api.services.redshiftserverless
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.redshiftserverless package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.redshiftserverless CfnNamespace$Builder
                                                               CfnNamespace$NamespaceProperty$Builder
                                                               CfnNamespace$SnapshotCopyConfigurationProperty$Builder
                                                               CfnNamespaceProps$Builder
                                                               CfnWorkgroup$Builder
                                                               CfnWorkgroup$ConfigParameterProperty$Builder
                                                               CfnWorkgroup$EndpointProperty$Builder
                                                               CfnWorkgroup$NetworkInterfaceProperty$Builder
                                                               CfnWorkgroup$VpcEndpointProperty$Builder
                                                               CfnWorkgroup$WorkgroupProperty$Builder
                                                               CfnWorkgroupProps$Builder]))


(defn cfn-namespace-builder
  "The cfn-namespace-builder function buildes out new instances of 
CfnNamespace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminPasswordSecretKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-password-secret-kms-key-id` |
| `adminUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-user-password` |
| `adminUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-username` |
| `dbName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-name` |
| `defaultIamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-iam-role-arn` |
| `finalSnapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:final-snapshot-name` |
| `finalSnapshotRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:final-snapshot-retention-period` |
| `iamRoles` | java.util.List | [[cdk.support/lookup-entry]] | `:iam-roles` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logExports` | java.util.List | [[cdk.support/lookup-entry]] | `:log-exports` |
| `manageAdminPassword` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:manage-admin-password` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |
| `namespaceResourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:namespace-resource-policy` |
| `redshiftIdcApplicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:redshift-idc-application-arn` |
| `snapshotCopyConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:snapshot-copy-configurations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNamespace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :admin-password-secret-kms-key-id)]
      (. builder adminPasswordSecretKmsKeyId data))
    (when-let [data (lookup-entry config id :admin-user-password)]
      (. builder adminUserPassword data))
    (when-let [data (lookup-entry config id :admin-username)]
      (. builder adminUsername data))
    (when-let [data (lookup-entry config id :db-name)]
      (. builder dbName data))
    (when-let [data (lookup-entry config id :default-iam-role-arn)]
      (. builder defaultIamRoleArn data))
    (when-let [data (lookup-entry config id :final-snapshot-name)]
      (. builder finalSnapshotName data))
    (when-let [data (lookup-entry config id :final-snapshot-retention-period)]
      (. builder finalSnapshotRetentionPeriod data))
    (when-let [data (lookup-entry config id :iam-roles)]
      (. builder iamRoles data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :log-exports)]
      (. builder logExports data))
    (when-let [data (lookup-entry config id :manage-admin-password)]
      (. builder manageAdminPassword data))
    (when-let [data (lookup-entry config id :namespace-name)]
      (. builder namespaceName data))
    (when-let [data (lookup-entry config id :namespace-resource-policy)]
      (. builder namespaceResourcePolicy data))
    (when-let [data (lookup-entry config id :redshift-idc-application-arn)]
      (. builder redshiftIdcApplicationArn data))
    (when-let [data (lookup-entry config id :snapshot-copy-configurations)]
      (. builder snapshotCopyConfigurations data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-namespace-namespace-property-builder
  "The cfn-namespace-namespace-property-builder function buildes out new instances of 
CfnNamespace$NamespaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminPasswordSecretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-password-secret-arn` |
| `adminPasswordSecretKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-password-secret-kms-key-id` |
| `adminUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-username` |
| `creationDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:creation-date` |
| `dbName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-name` |
| `defaultIamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-iam-role-arn` |
| `iamRoles` | java.util.List | [[cdk.support/lookup-entry]] | `:iam-roles` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logExports` | java.util.List | [[cdk.support/lookup-entry]] | `:log-exports` |
| `namespaceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-arn` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnNamespace$NamespaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :admin-password-secret-arn)]
      (. builder adminPasswordSecretArn data))
    (when-let [data (lookup-entry config id :admin-password-secret-kms-key-id)]
      (. builder adminPasswordSecretKmsKeyId data))
    (when-let [data (lookup-entry config id :admin-username)]
      (. builder adminUsername data))
    (when-let [data (lookup-entry config id :creation-date)]
      (. builder creationDate data))
    (when-let [data (lookup-entry config id :db-name)]
      (. builder dbName data))
    (when-let [data (lookup-entry config id :default-iam-role-arn)]
      (. builder defaultIamRoleArn data))
    (when-let [data (lookup-entry config id :iam-roles)]
      (. builder iamRoles data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :log-exports)]
      (. builder logExports data))
    (when-let [data (lookup-entry config id :namespace-arn)]
      (. builder namespaceArn data))
    (when-let [data (lookup-entry config id :namespace-id)]
      (. builder namespaceId data))
    (when-let [data (lookup-entry config id :namespace-name)]
      (. builder namespaceName data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-namespace-props-builder
  "The cfn-namespace-props-builder function buildes out new instances of 
CfnNamespaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adminPasswordSecretKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-password-secret-kms-key-id` |
| `adminUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-user-password` |
| `adminUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:admin-username` |
| `dbName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-name` |
| `defaultIamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-iam-role-arn` |
| `finalSnapshotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:final-snapshot-name` |
| `finalSnapshotRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:final-snapshot-retention-period` |
| `iamRoles` | java.util.List | [[cdk.support/lookup-entry]] | `:iam-roles` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `logExports` | java.util.List | [[cdk.support/lookup-entry]] | `:log-exports` |
| `manageAdminPassword` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:manage-admin-password` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |
| `namespaceResourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:namespace-resource-policy` |
| `redshiftIdcApplicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:redshift-idc-application-arn` |
| `snapshotCopyConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshot-copy-configurations` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnNamespaceProps$Builder.)]
    (when-let [data (lookup-entry config id :admin-password-secret-kms-key-id)]
      (. builder adminPasswordSecretKmsKeyId data))
    (when-let [data (lookup-entry config id :admin-user-password)]
      (. builder adminUserPassword data))
    (when-let [data (lookup-entry config id :admin-username)]
      (. builder adminUsername data))
    (when-let [data (lookup-entry config id :db-name)]
      (. builder dbName data))
    (when-let [data (lookup-entry config id :default-iam-role-arn)]
      (. builder defaultIamRoleArn data))
    (when-let [data (lookup-entry config id :final-snapshot-name)]
      (. builder finalSnapshotName data))
    (when-let [data (lookup-entry config id :final-snapshot-retention-period)]
      (. builder finalSnapshotRetentionPeriod data))
    (when-let [data (lookup-entry config id :iam-roles)]
      (. builder iamRoles data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :log-exports)]
      (. builder logExports data))
    (when-let [data (lookup-entry config id :manage-admin-password)]
      (. builder manageAdminPassword data))
    (when-let [data (lookup-entry config id :namespace-name)]
      (. builder namespaceName data))
    (when-let [data (lookup-entry config id :namespace-resource-policy)]
      (. builder namespaceResourcePolicy data))
    (when-let [data (lookup-entry config id :redshift-idc-application-arn)]
      (. builder redshiftIdcApplicationArn data))
    (when-let [data (lookup-entry config id :snapshot-copy-configurations)]
      (. builder snapshotCopyConfigurations data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-namespace-snapshot-copy-configuration-property-builder
  "The cfn-namespace-snapshot-copy-configuration-property-builder function buildes out new instances of 
CfnNamespace$SnapshotCopyConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-kms-key-id` |
| `destinationRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-region` |
| `snapshotRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-retention-period` |"
  [stack id config]
  (let [builder (CfnNamespace$SnapshotCopyConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-kms-key-id)]
      (. builder destinationKmsKeyId data))
    (when-let [data (lookup-entry config id :destination-region)]
      (. builder destinationRegion data))
    (when-let [data (lookup-entry config id :snapshot-retention-period)]
      (. builder snapshotRetentionPeriod data))
    (.build builder)))


(defn cfn-workgroup-builder
  "The cfn-workgroup-builder function buildes out new instances of 
CfnWorkgroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base-capacity` |
| `configParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:config-parameters` |
| `enhancedVpcRouting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enhanced-vpc-routing` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workgroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-name` |"
  [stack id config]
  (let [builder (CfnWorkgroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :base-capacity)]
      (. builder baseCapacity data))
    (when-let [data (lookup-entry config id :config-parameters)]
      (. builder configParameters data))
    (when-let [data (lookup-entry config id :enhanced-vpc-routing)]
      (. builder enhancedVpcRouting data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :namespace-name)]
      (. builder namespaceName data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workgroup-name)]
      (. builder workgroupName data))
    (.build builder)))


(defn cfn-workgroup-config-parameter-property-builder
  "The cfn-workgroup-config-parameter-property-builder function buildes out new instances of 
CfnWorkgroup$ConfigParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-key` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |"
  [stack id config]
  (let [builder (CfnWorkgroup$ConfigParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameter-key)]
      (. builder parameterKey data))
    (when-let [data (lookup-entry config id :parameter-value)]
      (. builder parameterValue data))
    (.build builder)))


(defn cfn-workgroup-endpoint-property-builder
  "The cfn-workgroup-endpoint-property-builder function buildes out new instances of 
CfnWorkgroup$EndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `vpcEndpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-endpoints` |"
  [stack id config]
  (let [builder (CfnWorkgroup$EndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :vpc-endpoints)]
      (. builder vpcEndpoints data))
    (.build builder)))


(defn cfn-workgroup-network-interface-property-builder
  "The cfn-workgroup-network-interface-property-builder function buildes out new instances of 
CfnWorkgroup$NetworkInterfaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnWorkgroup$NetworkInterfaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :network-interface-id)]
      (. builder networkInterfaceId data))
    (when-let [data (lookup-entry config id :private-ip-address)]
      (. builder privateIpAddress data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-workgroup-props-builder
  "The cfn-workgroup-props-builder function buildes out new instances of 
CfnWorkgroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base-capacity` |
| `configParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:config-parameters` |
| `enhancedVpcRouting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enhanced-vpc-routing` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `workgroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-name` |"
  [stack id config]
  (let [builder (CfnWorkgroupProps$Builder.)]
    (when-let [data (lookup-entry config id :base-capacity)]
      (. builder baseCapacity data))
    (when-let [data (lookup-entry config id :config-parameters)]
      (. builder configParameters data))
    (when-let [data (lookup-entry config id :enhanced-vpc-routing)]
      (. builder enhancedVpcRouting data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :namespace-name)]
      (. builder namespaceName data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workgroup-name)]
      (. builder workgroupName data))
    (.build builder)))


(defn cfn-workgroup-vpc-endpoint-property-builder
  "The cfn-workgroup-vpc-endpoint-property-builder function buildes out new instances of 
CfnWorkgroup$VpcEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkInterfaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnWorkgroup$VpcEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :network-interfaces)]
      (. builder networkInterfaces data))
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-workgroup-workgroup-property-builder
  "The cfn-workgroup-workgroup-property-builder function buildes out new instances of 
CfnWorkgroup$WorkgroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base-capacity` |
| `configParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config-parameters` |
| `creationDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:creation-date` |
| `endpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint` |
| `enhancedVpcRouting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enhanced-vpc-routing` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `workgroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-arn` |
| `workgroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-id` |
| `workgroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-name` |"
  [stack id config]
  (let [builder (CfnWorkgroup$WorkgroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :base-capacity)]
      (. builder baseCapacity data))
    (when-let [data (lookup-entry config id :config-parameters)]
      (. builder configParameters data))
    (when-let [data (lookup-entry config id :creation-date)]
      (. builder creationDate data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :enhanced-vpc-routing)]
      (. builder enhancedVpcRouting data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :namespace-name)]
      (. builder namespaceName data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :workgroup-arn)]
      (. builder workgroupArn data))
    (when-let [data (lookup-entry config id :workgroup-id)]
      (. builder workgroupId data))
    (when-let [data (lookup-entry config id :workgroup-name)]
      (. builder workgroupName data))
    (.build builder)))