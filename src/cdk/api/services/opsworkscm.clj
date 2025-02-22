(ns cdk.api.services.opsworkscm
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.opsworkscm package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.opsworkscm CfnServer$Builder
                                                       CfnServer$EngineAttributeProperty$Builder
                                                       CfnServerProps$Builder]))


(defn build-cfn-server-builder
  "The build-cfn-server-builder function updates a CfnServer$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :associate-public-ip-address)]
    (. builder associatePublicIpAddress data))
  (when-let [data (lookup-entry config id :backup-id)]
    (. builder backupId data))
  (when-let [data (lookup-entry config id :backup-retention-count)]
    (. builder backupRetentionCount data))
  (when-let [data (lookup-entry config id :custom-certificate)]
    (. builder customCertificate data))
  (when-let [data (lookup-entry config id :custom-domain)]
    (. builder customDomain data))
  (when-let [data (lookup-entry config id :custom-private-key)]
    (. builder customPrivateKey data))
  (when-let [data (lookup-entry config id :disable-automated-backup)]
    (. builder disableAutomatedBackup data))
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :engine-attributes)]
    (. builder engineAttributes data))
  (when-let [data (lookup-entry config id :engine-model)]
    (. builder engineModel data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :instance-profile-arn)]
    (. builder instanceProfileArn data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :key-pair)]
    (. builder keyPair data))
  (when-let [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-let [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :server-name)]
    (. builder serverName data))
  (when-let [data (lookup-entry config id :service-role-arn)]
    (. builder serviceRoleArn data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-server-engine-attribute-property-builder
  "The build-cfn-server-engine-attribute-property-builder function updates a CfnServer$EngineAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnServer$EngineAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnServer$EngineAttributeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-server-props-builder
  "The build-cfn-server-props-builder function updates a CfnServerProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :associate-public-ip-address)]
    (. builder associatePublicIpAddress data))
  (when-let [data (lookup-entry config id :backup-id)]
    (. builder backupId data))
  (when-let [data (lookup-entry config id :backup-retention-count)]
    (. builder backupRetentionCount data))
  (when-let [data (lookup-entry config id :custom-certificate)]
    (. builder customCertificate data))
  (when-let [data (lookup-entry config id :custom-domain)]
    (. builder customDomain data))
  (when-let [data (lookup-entry config id :custom-private-key)]
    (. builder customPrivateKey data))
  (when-let [data (lookup-entry config id :disable-automated-backup)]
    (. builder disableAutomatedBackup data))
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :engine-attributes)]
    (. builder engineAttributes data))
  (when-let [data (lookup-entry config id :engine-model)]
    (. builder engineModel data))
  (when-let [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-let [data (lookup-entry config id :instance-profile-arn)]
    (. builder instanceProfileArn data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :key-pair)]
    (. builder keyPair data))
  (when-let [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-let [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :server-name)]
    (. builder serverName data))
  (when-let [data (lookup-entry config id :service-role-arn)]
    (. builder serviceRoleArn data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))