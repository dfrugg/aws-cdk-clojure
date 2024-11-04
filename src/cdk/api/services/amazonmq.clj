(ns cdk.api.services.amazonmq
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.amazonmq package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.amazonmq CfnBroker$Builder
                                                     CfnBroker$ConfigurationIdProperty$Builder
                                                     CfnBroker$EncryptionOptionsProperty$Builder
                                                     CfnBroker$LdapServerMetadataProperty$Builder
                                                     CfnBroker$LogListProperty$Builder
                                                     CfnBroker$MaintenanceWindowProperty$Builder
                                                     CfnBroker$TagsEntryProperty$Builder
                                                     CfnBroker$UserProperty$Builder
                                                     CfnBrokerProps$Builder
                                                     CfnConfiguration$Builder
                                                     CfnConfiguration$TagsEntryProperty$Builder
                                                     CfnConfigurationAssociation$Builder
                                                     CfnConfigurationAssociation$ConfigurationIdProperty$Builder
                                                     CfnConfigurationAssociationProps$Builder
                                                     CfnConfigurationProps$Builder]))


(defn cfn-broker-builder
  "The cfn-broker-builder function buildes out new instances of 
CfnBroker$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-strategy` |
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `brokerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:broker-name` |
| `configuration` | software.amazon.awscdk.services.amazonmq.CfnBroker$ConfigurationIdProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `dataReplicationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-replication-mode` |
| `dataReplicationPrimaryBrokerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-replication-primary-broker-arn` |
| `deploymentMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-mode` |
| `encryptionOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-options` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `hostInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-instance-type` |
| `ldapServerMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ldap-server-metadata` |
| `logs` | software.amazon.awscdk.services.amazonmq.CfnBroker$LogListProperty | [[cdk.support/lookup-entry]] | `:logs` |
| `maintenanceWindowStartTime` | software.amazon.awscdk.services.amazonmq.CfnBroker$MaintenanceWindowProperty | [[cdk.support/lookup-entry]] | `:maintenance-window-start-time` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `users` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (CfnBroker$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authentication-strategy)]
      (. builder authenticationStrategy data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :broker-name)]
      (. builder brokerName data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :data-replication-mode)]
      (. builder dataReplicationMode data))
    (when-let [data (lookup-entry config id :data-replication-primary-broker-arn)]
      (. builder dataReplicationPrimaryBrokerArn data))
    (when-let [data (lookup-entry config id :deployment-mode)]
      (. builder deploymentMode data))
    (when-let [data (lookup-entry config id :encryption-options)]
      (. builder encryptionOptions data))
    (when-let [data (lookup-entry config id :engine-type)]
      (. builder engineType data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :host-instance-type)]
      (. builder hostInstanceType data))
    (when-let [data (lookup-entry config id :ldap-server-metadata)]
      (. builder ldapServerMetadata data))
    (when-let [data (lookup-entry config id :logs)]
      (. builder logs data))
    (when-let [data (lookup-entry config id :maintenance-window-start-time)]
      (. builder maintenanceWindowStartTime data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn cfn-broker-configuration-id-property-builder
  "The cfn-broker-configuration-id-property-builder function buildes out new instances of 
CfnBroker$ConfigurationIdProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |"
  [stack id config]
  (let [builder (CfnBroker$ConfigurationIdProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :revision)]
      (. builder revision data))
    (.build builder)))


(defn cfn-broker-encryption-options-property-builder
  "The cfn-broker-encryption-options-property-builder function buildes out new instances of 
CfnBroker$EncryptionOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `useAwsOwnedKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-aws-owned-key` |"
  [stack id config]
  (let [builder (CfnBroker$EncryptionOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :use-aws-owned-key)]
      (. builder useAwsOwnedKey data))
    (.build builder)))


(defn cfn-broker-ldap-server-metadata-property-builder
  "The cfn-broker-ldap-server-metadata-property-builder function buildes out new instances of 
CfnBroker$LdapServerMetadataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hosts` | java.util.List | [[cdk.support/lookup-entry]] | `:hosts` |
| `roleBase` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-base` |
| `roleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-name` |
| `roleSearchMatching` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-search-matching` |
| `roleSearchSubtree` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:role-search-subtree` |
| `serviceAccountPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account-password` |
| `serviceAccountUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-account-username` |
| `userBase` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-base` |
| `userRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-role-name` |
| `userSearchMatching` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-search-matching` |
| `userSearchSubtree` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-search-subtree` |"
  [stack id config]
  (let [builder (CfnBroker$LdapServerMetadataProperty$Builder.)]
    (when-let [data (lookup-entry config id :hosts)]
      (. builder hosts data))
    (when-let [data (lookup-entry config id :role-base)]
      (. builder roleBase data))
    (when-let [data (lookup-entry config id :role-name)]
      (. builder roleName data))
    (when-let [data (lookup-entry config id :role-search-matching)]
      (. builder roleSearchMatching data))
    (when-let [data (lookup-entry config id :role-search-subtree)]
      (. builder roleSearchSubtree data))
    (when-let [data (lookup-entry config id :service-account-password)]
      (. builder serviceAccountPassword data))
    (when-let [data (lookup-entry config id :service-account-username)]
      (. builder serviceAccountUsername data))
    (when-let [data (lookup-entry config id :user-base)]
      (. builder userBase data))
    (when-let [data (lookup-entry config id :user-role-name)]
      (. builder userRoleName data))
    (when-let [data (lookup-entry config id :user-search-matching)]
      (. builder userSearchMatching data))
    (when-let [data (lookup-entry config id :user-search-subtree)]
      (. builder userSearchSubtree data))
    (.build builder)))


(defn cfn-broker-log-list-property-builder
  "The cfn-broker-log-list-property-builder function buildes out new instances of 
CfnBroker$LogListProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audit` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audit` |
| `general` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:general` |"
  [stack id config]
  (let [builder (CfnBroker$LogListProperty$Builder.)]
    (when-let [data (lookup-entry config id :audit)]
      (. builder audit data))
    (when-let [data (lookup-entry config id :general)]
      (. builder general data))
    (.build builder)))


(defn cfn-broker-maintenance-window-property-builder
  "The cfn-broker-maintenance-window-property-builder function buildes out new instances of 
CfnBroker$MaintenanceWindowProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-week` |
| `timeOfDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-of-day` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |"
  [stack id config]
  (let [builder (CfnBroker$MaintenanceWindowProperty$Builder.)]
    (when-let [data (lookup-entry config id :day-of-week)]
      (. builder dayOfWeek data))
    (when-let [data (lookup-entry config id :time-of-day)]
      (. builder timeOfDay data))
    (when-let [data (lookup-entry config id :time-zone)]
      (. builder timeZone data))
    (.build builder)))


(defn cfn-broker-props-builder
  "The cfn-broker-props-builder function buildes out new instances of 
CfnBrokerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-strategy` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `brokerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:broker-name` |
| `configuration` | software.amazon.awscdk.services.amazonmq.CfnBroker$ConfigurationIdProperty | [[cdk.support/lookup-entry]] | `:configuration` |
| `dataReplicationMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-replication-mode` |
| `dataReplicationPrimaryBrokerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-replication-primary-broker-arn` |
| `deploymentMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:deployment-mode` |
| `encryptionOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-options` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `hostInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-instance-type` |
| `ldapServerMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ldap-server-metadata` |
| `logs` | software.amazon.awscdk.services.amazonmq.CfnBroker$LogListProperty | [[cdk.support/lookup-entry]] | `:logs` |
| `maintenanceWindowStartTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maintenance-window-start-time` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |"
  [stack id config]
  (let [builder (CfnBrokerProps$Builder.)]
    (when-let [data (lookup-entry config id :authentication-strategy)]
      (. builder authenticationStrategy data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :broker-name)]
      (. builder brokerName data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :data-replication-mode)]
      (. builder dataReplicationMode data))
    (when-let [data (lookup-entry config id :data-replication-primary-broker-arn)]
      (. builder dataReplicationPrimaryBrokerArn data))
    (when-let [data (lookup-entry config id :deployment-mode)]
      (. builder deploymentMode data))
    (when-let [data (lookup-entry config id :encryption-options)]
      (. builder encryptionOptions data))
    (when-let [data (lookup-entry config id :engine-type)]
      (. builder engineType data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :host-instance-type)]
      (. builder hostInstanceType data))
    (when-let [data (lookup-entry config id :ldap-server-metadata)]
      (. builder ldapServerMetadata data))
    (when-let [data (lookup-entry config id :logs)]
      (. builder logs data))
    (when-let [data (lookup-entry config id :maintenance-window-start-time)]
      (. builder maintenanceWindowStartTime data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :users)]
      (. builder users data))
    (.build builder)))


(defn cfn-broker-tags-entry-property-builder
  "The cfn-broker-tags-entry-property-builder function buildes out new instances of 
CfnBroker$TagsEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBroker$TagsEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-broker-user-property-builder
  "The cfn-broker-user-property-builder function buildes out new instances of 
CfnBroker$UserProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consoleAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:console-access` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `replicationUser` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-user` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnBroker$UserProperty$Builder.)]
    (when-let [data (lookup-entry config id :console-access)]
      (. builder consoleAccess data))
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :replication-user)]
      (. builder replicationUser data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-configuration-association-builder
  "The cfn-configuration-association-builder function buildes out new instances of 
CfnConfigurationAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `broker` | java.lang.String | [[cdk.support/lookup-entry]] | `:broker` |
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |"
  [stack id config]
  (let [builder (CfnConfigurationAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :broker)]
      (. builder broker data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (.build builder)))


(defn cfn-configuration-association-configuration-id-property-builder
  "The cfn-configuration-association-configuration-id-property-builder function buildes out new instances of 
CfnConfigurationAssociation$ConfigurationIdProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |"
  [stack id config]
  (let [builder (CfnConfigurationAssociation$ConfigurationIdProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :revision)]
      (. builder revision data))
    (.build builder)))


(defn cfn-configuration-association-props-builder
  "The cfn-configuration-association-props-builder function buildes out new instances of 
CfnConfigurationAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `broker` | java.lang.String | [[cdk.support/lookup-entry]] | `:broker` |
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |"
  [stack id config]
  (let [builder (CfnConfigurationAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :broker)]
      (. builder broker data))
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (.build builder)))


(defn cfn-configuration-builder
  "The cfn-configuration-builder function buildes out new instances of 
CfnConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-strategy` |
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :authentication-strategy)]
      (. builder authenticationStrategy data))
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine-type)]
      (. builder engineType data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-configuration-props-builder
  "The cfn-configuration-props-builder function buildes out new instances of 
CfnConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-strategy` |
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :authentication-strategy)]
      (. builder authenticationStrategy data))
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine-type)]
      (. builder engineType data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-configuration-tags-entry-property-builder
  "The cfn-configuration-tags-entry-property-builder function buildes out new instances of 
CfnConfiguration$TagsEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnConfiguration$TagsEntryProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))