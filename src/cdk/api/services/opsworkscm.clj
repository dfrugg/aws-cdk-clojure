(ns cdk.api.services.opsworkscm
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.opsworkscm package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.opsworkscm CfnServer$Builder
                                                       CfnServer$EngineAttributeProperty$Builder
                                                       CfnServerProps$Builder]))


(defn cfn-server-builder
  "The cfn-server-builder function buildes out new instances of 
CfnServer$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServer$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-server-engine-attribute-property-builder
  "The cfn-server-engine-attribute-property-builder function buildes out new instances of 
CfnServer$EngineAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnServer$EngineAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-server-props-builder
  "The cfn-server-props-builder function buildes out new instances of 
CfnServerProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServerProps$Builder.)]
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
    (.build builder)))