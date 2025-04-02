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


(defn cfn-namespace-builder>
  "The cfn-namespace-builder> function updates a CfnNamespace$Builder instance using the provided configuration.
  The function takes the CfnNamespace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnNamespace$Builder builder id config]
  (when-some [data (lookup-entry config id :admin-password-secret-kms-key-id)]
    (. builder adminPasswordSecretKmsKeyId data))
  (when-some [data (lookup-entry config id :admin-user-password)]
    (. builder adminUserPassword data))
  (when-some [data (lookup-entry config id :admin-username)]
    (. builder adminUsername data))
  (when-some [data (lookup-entry config id :db-name)]
    (. builder dbName data))
  (when-some [data (lookup-entry config id :default-iam-role-arn)]
    (. builder defaultIamRoleArn data))
  (when-some [data (lookup-entry config id :final-snapshot-name)]
    (. builder finalSnapshotName data))
  (when-some [data (lookup-entry config id :final-snapshot-retention-period)]
    (. builder finalSnapshotRetentionPeriod data))
  (when-some [data (lookup-entry config id :iam-roles)]
    (. builder iamRoles data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :log-exports)]
    (. builder logExports data))
  (when-some [data (lookup-entry config id :manage-admin-password)]
    (. builder manageAdminPassword data))
  (when-some [data (lookup-entry config id :namespace-name)]
    (. builder namespaceName data))
  (when-some [data (lookup-entry config id :namespace-resource-policy)]
    (. builder namespaceResourcePolicy data))
  (when-some [data (lookup-entry config id :redshift-idc-application-arn)]
    (. builder redshiftIdcApplicationArn data))
  (when-some [data (lookup-entry config id :snapshot-copy-configurations)]
    (. builder snapshotCopyConfigurations data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-namespace-builder
  "Creates a  `CfnNamespace$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-namespace-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-namespace-builder> (CfnNamespace$Builder/create scope (name id)) id config))


(defn cfn-namespace-namespace-property-builder>
  "The cfn-namespace-namespace-property-builder> function updates a CfnNamespace$NamespaceProperty$Builder instance using the provided configuration.
  The function takes the CfnNamespace$NamespaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnNamespace$NamespaceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :admin-password-secret-arn)]
    (. builder adminPasswordSecretArn data))
  (when-some [data (lookup-entry config id :admin-password-secret-kms-key-id)]
    (. builder adminPasswordSecretKmsKeyId data))
  (when-some [data (lookup-entry config id :admin-username)]
    (. builder adminUsername data))
  (when-some [data (lookup-entry config id :creation-date)]
    (. builder creationDate data))
  (when-some [data (lookup-entry config id :db-name)]
    (. builder dbName data))
  (when-some [data (lookup-entry config id :default-iam-role-arn)]
    (. builder defaultIamRoleArn data))
  (when-some [data (lookup-entry config id :iam-roles)]
    (. builder iamRoles data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :log-exports)]
    (. builder logExports data))
  (when-some [data (lookup-entry config id :namespace-arn)]
    (. builder namespaceArn data))
  (when-some [data (lookup-entry config id :namespace-id)]
    (. builder namespaceId data))
  (when-some [data (lookup-entry config id :namespace-name)]
    (. builder namespaceName data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-namespace-namespace-property-builder
  "Creates a  `CfnNamespace$NamespaceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-namespace-namespace-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-namespace-namespace-property-builder> (new CfnNamespace$NamespaceProperty$Builder) id config))


(defn cfn-namespace-props-builder>
  "The cfn-namespace-props-builder> function updates a CfnNamespaceProps$Builder instance using the provided configuration.
  The function takes the CfnNamespaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnNamespaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :admin-password-secret-kms-key-id)]
    (. builder adminPasswordSecretKmsKeyId data))
  (when-some [data (lookup-entry config id :admin-user-password)]
    (. builder adminUserPassword data))
  (when-some [data (lookup-entry config id :admin-username)]
    (. builder adminUsername data))
  (when-some [data (lookup-entry config id :db-name)]
    (. builder dbName data))
  (when-some [data (lookup-entry config id :default-iam-role-arn)]
    (. builder defaultIamRoleArn data))
  (when-some [data (lookup-entry config id :final-snapshot-name)]
    (. builder finalSnapshotName data))
  (when-some [data (lookup-entry config id :final-snapshot-retention-period)]
    (. builder finalSnapshotRetentionPeriod data))
  (when-some [data (lookup-entry config id :iam-roles)]
    (. builder iamRoles data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :log-exports)]
    (. builder logExports data))
  (when-some [data (lookup-entry config id :manage-admin-password)]
    (. builder manageAdminPassword data))
  (when-some [data (lookup-entry config id :namespace-name)]
    (. builder namespaceName data))
  (when-some [data (lookup-entry config id :namespace-resource-policy)]
    (. builder namespaceResourcePolicy data))
  (when-some [data (lookup-entry config id :redshift-idc-application-arn)]
    (. builder redshiftIdcApplicationArn data))
  (when-some [data (lookup-entry config id :snapshot-copy-configurations)]
    (. builder snapshotCopyConfigurations data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-namespace-props-builder
  "Creates a  `CfnNamespaceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-namespace-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-namespace-props-builder> (new CfnNamespaceProps$Builder) id config))


(defn cfn-namespace-snapshot-copy-configuration-property-builder>
  "The cfn-namespace-snapshot-copy-configuration-property-builder> function updates a CfnNamespace$SnapshotCopyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnNamespace$SnapshotCopyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-kms-key-id` |
| `destinationRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-region` |
| `snapshotRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:snapshot-retention-period` |
"
  [^CfnNamespace$SnapshotCopyConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-kms-key-id)]
    (. builder destinationKmsKeyId data))
  (when-some [data (lookup-entry config id :destination-region)]
    (. builder destinationRegion data))
  (when-some [data (lookup-entry config id :snapshot-retention-period)]
    (. builder snapshotRetentionPeriod data))
  (.build builder))


(defn cfn-namespace-snapshot-copy-configuration-property-builder
  "Creates a  `CfnNamespace$SnapshotCopyConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-namespace-snapshot-copy-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-namespace-snapshot-copy-configuration-property-builder> (new CfnNamespace$SnapshotCopyConfigurationProperty$Builder) id config))


(defn cfn-workgroup-builder>
  "The cfn-workgroup-builder> function updates a CfnWorkgroup$Builder instance using the provided configuration.
  The function takes the CfnWorkgroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workgroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-name` |
"
  [^CfnWorkgroup$Builder builder id config]
  (when-some [data (lookup-entry config id :base-capacity)]
    (. builder baseCapacity data))
  (when-some [data (lookup-entry config id :config-parameters)]
    (. builder configParameters data))
  (when-some [data (lookup-entry config id :enhanced-vpc-routing)]
    (. builder enhancedVpcRouting data))
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :namespace-name)]
    (. builder namespaceName data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workgroup-name)]
    (. builder workgroupName data))
  (.build builder))


(defn cfn-workgroup-builder
  "Creates a  `CfnWorkgroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-workgroup-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-workgroup-builder> (CfnWorkgroup$Builder/create scope (name id)) id config))


(defn cfn-workgroup-config-parameter-property-builder>
  "The cfn-workgroup-config-parameter-property-builder> function updates a CfnWorkgroup$ConfigParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkgroup$ConfigParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-key` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnWorkgroup$ConfigParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :parameter-key)]
    (. builder parameterKey data))
  (when-some [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn cfn-workgroup-config-parameter-property-builder
  "Creates a  `CfnWorkgroup$ConfigParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workgroup-config-parameter-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workgroup-config-parameter-property-builder> (new CfnWorkgroup$ConfigParameterProperty$Builder) id config))


(defn cfn-workgroup-endpoint-property-builder>
  "The cfn-workgroup-endpoint-property-builder> function updates a CfnWorkgroup$EndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkgroup$EndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `vpcEndpoints` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-endpoints` |
"
  [^CfnWorkgroup$EndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :vpc-endpoints)]
    (. builder vpcEndpoints data))
  (.build builder))


(defn cfn-workgroup-endpoint-property-builder
  "Creates a  `CfnWorkgroup$EndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workgroup-endpoint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workgroup-endpoint-property-builder> (new CfnWorkgroup$EndpointProperty$Builder) id config))


(defn cfn-workgroup-network-interface-property-builder>
  "The cfn-workgroup-network-interface-property-builder> function updates a CfnWorkgroup$NetworkInterfaceProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkgroup$NetworkInterfaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `networkInterfaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-interface-id` |
| `privateIpAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-ip-address` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnWorkgroup$NetworkInterfaceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :network-interface-id)]
    (. builder networkInterfaceId data))
  (when-some [data (lookup-entry config id :private-ip-address)]
    (. builder privateIpAddress data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-workgroup-network-interface-property-builder
  "Creates a  `CfnWorkgroup$NetworkInterfaceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workgroup-network-interface-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workgroup-network-interface-property-builder> (new CfnWorkgroup$NetworkInterfaceProperty$Builder) id config))


(defn cfn-workgroup-props-builder>
  "The cfn-workgroup-props-builder> function updates a CfnWorkgroupProps$Builder instance using the provided configuration.
  The function takes the CfnWorkgroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workgroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-name` |
"
  [^CfnWorkgroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :base-capacity)]
    (. builder baseCapacity data))
  (when-some [data (lookup-entry config id :config-parameters)]
    (. builder configParameters data))
  (when-some [data (lookup-entry config id :enhanced-vpc-routing)]
    (. builder enhancedVpcRouting data))
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :namespace-name)]
    (. builder namespaceName data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :workgroup-name)]
    (. builder workgroupName data))
  (.build builder))


(defn cfn-workgroup-props-builder
  "Creates a  `CfnWorkgroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workgroup-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workgroup-props-builder> (new CfnWorkgroupProps$Builder) id config))


(defn cfn-workgroup-vpc-endpoint-property-builder>
  "The cfn-workgroup-vpc-endpoint-property-builder> function updates a CfnWorkgroup$VpcEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkgroup$VpcEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkInterfaces` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-interfaces` |
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnWorkgroup$VpcEndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :network-interfaces)]
    (. builder networkInterfaces data))
  (when-some [data (lookup-entry config id :vpc-endpoint-id)]
    (. builder vpcEndpointId data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-workgroup-vpc-endpoint-property-builder
  "Creates a  `CfnWorkgroup$VpcEndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workgroup-vpc-endpoint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workgroup-vpc-endpoint-property-builder> (new CfnWorkgroup$VpcEndpointProperty$Builder) id config))


(defn cfn-workgroup-workgroup-property-builder>
  "The cfn-workgroup-workgroup-property-builder> function updates a CfnWorkgroup$WorkgroupProperty$Builder instance using the provided configuration.
  The function takes the CfnWorkgroup$WorkgroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `workgroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:workgroup-name` |
"
  [^CfnWorkgroup$WorkgroupProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :base-capacity)]
    (. builder baseCapacity data))
  (when-some [data (lookup-entry config id :config-parameters)]
    (. builder configParameters data))
  (when-some [data (lookup-entry config id :creation-date)]
    (. builder creationDate data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :enhanced-vpc-routing)]
    (. builder enhancedVpcRouting data))
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :namespace-name)]
    (. builder namespaceName data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :workgroup-arn)]
    (. builder workgroupArn data))
  (when-some [data (lookup-entry config id :workgroup-id)]
    (. builder workgroupId data))
  (when-some [data (lookup-entry config id :workgroup-name)]
    (. builder workgroupName data))
  (.build builder))


(defn cfn-workgroup-workgroup-property-builder
  "Creates a  `CfnWorkgroup$WorkgroupProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-workgroup-workgroup-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-workgroup-workgroup-property-builder> (new CfnWorkgroup$WorkgroupProperty$Builder) id config))