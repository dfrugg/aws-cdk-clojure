(ns cdk.api.services.opsworkscm
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.opsworkscm package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.opsworkscm CfnServer$Builder
                                                       CfnServer$EngineAttributeProperty$Builder
                                                       CfnServerProps$Builder]))


(defn cfn-server-builder>
  "The cfn-server-builder> function updates a CfnServer$Builder instance using the provided configuration.
  The function takes the CfnServer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatePublicIpAddress` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `backupRetentionCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-count` |
| `customCertificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-certificate` |
| `customDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-domain` |
| `customPrivateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-private-key` |
| `disableAutomatedBackup` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-automated-backup` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:engine-attributes` |
| `engineModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-model` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `instanceProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-arn` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `keyPair` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-pair` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `serverName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-name` |
| `serviceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role-arn` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServer$Builder builder id config]
  (when-some [data (lookup-entry config id :associate-public-ip-address)]
    (. builder associatePublicIpAddress data))
  (when-some [data (lookup-entry config id :backup-id)]
    (. builder backupId data))
  (when-some [data (lookup-entry config id :backup-retention-count)]
    (. builder backupRetentionCount data))
  (when-some [data (lookup-entry config id :custom-certificate)]
    (. builder customCertificate data))
  (when-some [data (lookup-entry config id :custom-domain)]
    (. builder customDomain data))
  (when-some [data (lookup-entry config id :custom-private-key)]
    (. builder customPrivateKey data))
  (when-some [data (lookup-entry config id :disable-automated-backup)]
    (. builder disableAutomatedBackup data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :engine-attributes)]
    (. builder engineAttributes data))
  (when-some [data (lookup-entry config id :engine-model)]
    (. builder engineModel data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :instance-profile-arn)]
    (. builder instanceProfileArn data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :key-pair)]
    (. builder keyPair data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :server-name)]
    (. builder serverName data))
  (when-some [data (lookup-entry config id :service-role-arn)]
    (. builder serviceRoleArn data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-server-builder
  "Creates a  `CfnServer$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-server-builder> (CfnServer$Builder/create scope (name id)) id config))


(defn cfn-server-engine-attribute-property-builder>
  "The cfn-server-engine-attribute-property-builder> function updates a CfnServer$EngineAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnServer$EngineAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnServer$EngineAttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-server-engine-attribute-property-builder
  "Creates a  `CfnServer$EngineAttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-server-engine-attribute-property-builder> (new CfnServer$EngineAttributeProperty$Builder) id config))


(defn cfn-server-props-builder>
  "The cfn-server-props-builder> function updates a CfnServerProps$Builder instance using the provided configuration.
  The function takes the CfnServerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatePublicIpAddress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:associate-public-ip-address` |
| `backupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-id` |
| `backupRetentionCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-count` |
| `customCertificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-certificate` |
| `customDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-domain` |
| `customPrivateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-private-key` |
| `disableAutomatedBackup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:disable-automated-backup` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:engine-attributes` |
| `engineModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-model` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `instanceProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-profile-arn` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `keyPair` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-pair` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `serverName` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-name` |
| `serviceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role-arn` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :associate-public-ip-address)]
    (. builder associatePublicIpAddress data))
  (when-some [data (lookup-entry config id :backup-id)]
    (. builder backupId data))
  (when-some [data (lookup-entry config id :backup-retention-count)]
    (. builder backupRetentionCount data))
  (when-some [data (lookup-entry config id :custom-certificate)]
    (. builder customCertificate data))
  (when-some [data (lookup-entry config id :custom-domain)]
    (. builder customDomain data))
  (when-some [data (lookup-entry config id :custom-private-key)]
    (. builder customPrivateKey data))
  (when-some [data (lookup-entry config id :disable-automated-backup)]
    (. builder disableAutomatedBackup data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :engine-attributes)]
    (. builder engineAttributes data))
  (when-some [data (lookup-entry config id :engine-model)]
    (. builder engineModel data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :instance-profile-arn)]
    (. builder instanceProfileArn data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :key-pair)]
    (. builder keyPair data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :server-name)]
    (. builder serverName data))
  (when-some [data (lookup-entry config id :service-role-arn)]
    (. builder serviceRoleArn data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-server-props-builder
  "Creates a  `CfnServerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-server-props-builder> (new CfnServerProps$Builder) id config))