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


(defn cfn-broker-builder>
  "The cfn-broker-builder> function updates a CfnBroker$Builder instance using the provided configuration.
  The function takes the CfnBroker$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `users` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:users` |
"
  [^CfnBroker$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication-strategy)]
    (. builder authenticationStrategy data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :broker-name)]
    (. builder brokerName data))
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :data-replication-mode)]
    (. builder dataReplicationMode data))
  (when-some [data (lookup-entry config id :data-replication-primary-broker-arn)]
    (. builder dataReplicationPrimaryBrokerArn data))
  (when-some [data (lookup-entry config id :deployment-mode)]
    (. builder deploymentMode data))
  (when-some [data (lookup-entry config id :encryption-options)]
    (. builder encryptionOptions data))
  (when-some [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :host-instance-type)]
    (. builder hostInstanceType data))
  (when-some [data (lookup-entry config id :ldap-server-metadata)]
    (. builder ldapServerMetadata data))
  (when-some [data (lookup-entry config id :logs)]
    (. builder logs data))
  (when-some [data (lookup-entry config id :maintenance-window-start-time)]
    (. builder maintenanceWindowStartTime data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn cfn-broker-builder
  "Creates a  `CfnBroker$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-broker-builder> (CfnBroker$Builder/create scope (name id)) id config))


(defn cfn-broker-configuration-id-property-builder>
  "The cfn-broker-configuration-id-property-builder> function updates a CfnBroker$ConfigurationIdProperty$Builder instance using the provided configuration.
  The function takes the CfnBroker$ConfigurationIdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |
"
  [^CfnBroker$ConfigurationIdProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :revision)]
    (. builder revision data))
  (.build builder))


(defn cfn-broker-configuration-id-property-builder
  "Creates a  `CfnBroker$ConfigurationIdProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-broker-configuration-id-property-builder> (new CfnBroker$ConfigurationIdProperty$Builder) id config))


(defn cfn-broker-encryption-options-property-builder>
  "The cfn-broker-encryption-options-property-builder> function updates a CfnBroker$EncryptionOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnBroker$EncryptionOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `useAwsOwnedKey` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-aws-owned-key` |
"
  [^CfnBroker$EncryptionOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :use-aws-owned-key)]
    (. builder useAwsOwnedKey data))
  (.build builder))


(defn cfn-broker-encryption-options-property-builder
  "Creates a  `CfnBroker$EncryptionOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-broker-encryption-options-property-builder> (new CfnBroker$EncryptionOptionsProperty$Builder) id config))


(defn cfn-broker-ldap-server-metadata-property-builder>
  "The cfn-broker-ldap-server-metadata-property-builder> function updates a CfnBroker$LdapServerMetadataProperty$Builder instance using the provided configuration.
  The function takes the CfnBroker$LdapServerMetadataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `userSearchSubtree` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:user-search-subtree` |
"
  [^CfnBroker$LdapServerMetadataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :hosts)]
    (. builder hosts data))
  (when-some [data (lookup-entry config id :role-base)]
    (. builder roleBase data))
  (when-some [data (lookup-entry config id :role-name)]
    (. builder roleName data))
  (when-some [data (lookup-entry config id :role-search-matching)]
    (. builder roleSearchMatching data))
  (when-some [data (lookup-entry config id :role-search-subtree)]
    (. builder roleSearchSubtree data))
  (when-some [data (lookup-entry config id :service-account-password)]
    (. builder serviceAccountPassword data))
  (when-some [data (lookup-entry config id :service-account-username)]
    (. builder serviceAccountUsername data))
  (when-some [data (lookup-entry config id :user-base)]
    (. builder userBase data))
  (when-some [data (lookup-entry config id :user-role-name)]
    (. builder userRoleName data))
  (when-some [data (lookup-entry config id :user-search-matching)]
    (. builder userSearchMatching data))
  (when-some [data (lookup-entry config id :user-search-subtree)]
    (. builder userSearchSubtree data))
  (.build builder))


(defn cfn-broker-ldap-server-metadata-property-builder
  "Creates a  `CfnBroker$LdapServerMetadataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-broker-ldap-server-metadata-property-builder> (new CfnBroker$LdapServerMetadataProperty$Builder) id config))


(defn cfn-broker-log-list-property-builder>
  "The cfn-broker-log-list-property-builder> function updates a CfnBroker$LogListProperty$Builder instance using the provided configuration.
  The function takes the CfnBroker$LogListProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audit` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audit` |
| `general` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:general` |
"
  [^CfnBroker$LogListProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :audit)]
    (. builder audit data))
  (when-some [data (lookup-entry config id :general)]
    (. builder general data))
  (.build builder))


(defn cfn-broker-log-list-property-builder
  "Creates a  `CfnBroker$LogListProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-broker-log-list-property-builder> (new CfnBroker$LogListProperty$Builder) id config))


(defn cfn-broker-maintenance-window-property-builder>
  "The cfn-broker-maintenance-window-property-builder> function updates a CfnBroker$MaintenanceWindowProperty$Builder instance using the provided configuration.
  The function takes the CfnBroker$MaintenanceWindowProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-week` |
| `timeOfDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-of-day` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |
"
  [^CfnBroker$MaintenanceWindowProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :day-of-week)]
    (. builder dayOfWeek data))
  (when-some [data (lookup-entry config id :time-of-day)]
    (. builder timeOfDay data))
  (when-some [data (lookup-entry config id :time-zone)]
    (. builder timeZone data))
  (.build builder))


(defn cfn-broker-maintenance-window-property-builder
  "Creates a  `CfnBroker$MaintenanceWindowProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-broker-maintenance-window-property-builder> (new CfnBroker$MaintenanceWindowProperty$Builder) id config))


(defn cfn-broker-props-builder>
  "The cfn-broker-props-builder> function updates a CfnBrokerProps$Builder instance using the provided configuration.
  The function takes the CfnBrokerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `users` | java.util.List | [[cdk.support/lookup-entry]] | `:users` |
"
  [^CfnBrokerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication-strategy)]
    (. builder authenticationStrategy data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :broker-name)]
    (. builder brokerName data))
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :data-replication-mode)]
    (. builder dataReplicationMode data))
  (when-some [data (lookup-entry config id :data-replication-primary-broker-arn)]
    (. builder dataReplicationPrimaryBrokerArn data))
  (when-some [data (lookup-entry config id :deployment-mode)]
    (. builder deploymentMode data))
  (when-some [data (lookup-entry config id :encryption-options)]
    (. builder encryptionOptions data))
  (when-some [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :host-instance-type)]
    (. builder hostInstanceType data))
  (when-some [data (lookup-entry config id :ldap-server-metadata)]
    (. builder ldapServerMetadata data))
  (when-some [data (lookup-entry config id :logs)]
    (. builder logs data))
  (when-some [data (lookup-entry config id :maintenance-window-start-time)]
    (. builder maintenanceWindowStartTime data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :users)]
    (. builder users data))
  (.build builder))


(defn cfn-broker-props-builder
  "Creates a  `CfnBrokerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-broker-props-builder> (new CfnBrokerProps$Builder) id config))


(defn cfn-broker-tags-entry-property-builder>
  "The cfn-broker-tags-entry-property-builder> function updates a CfnBroker$TagsEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnBroker$TagsEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBroker$TagsEntryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-broker-tags-entry-property-builder
  "Creates a  `CfnBroker$TagsEntryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-broker-tags-entry-property-builder> (new CfnBroker$TagsEntryProperty$Builder) id config))


(defn cfn-broker-user-property-builder>
  "The cfn-broker-user-property-builder> function updates a CfnBroker$UserProperty$Builder instance using the provided configuration.
  The function takes the CfnBroker$UserProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consoleAccess` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:console-access` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `replicationUser` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replication-user` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnBroker$UserProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :console-access)]
    (. builder consoleAccess data))
  (when-some [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :replication-user)]
    (. builder replicationUser data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-broker-user-property-builder
  "Creates a  `CfnBroker$UserProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-broker-user-property-builder> (new CfnBroker$UserProperty$Builder) id config))


(defn cfn-configuration-association-builder>
  "The cfn-configuration-association-builder> function updates a CfnConfigurationAssociation$Builder instance using the provided configuration.
  The function takes the CfnConfigurationAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `broker` | java.lang.String | [[cdk.support/lookup-entry]] | `:broker` |
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
"
  [^CfnConfigurationAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :broker)]
    (. builder broker data))
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (.build builder))


(defn cfn-configuration-association-builder
  "Creates a  `CfnConfigurationAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-configuration-association-builder> (CfnConfigurationAssociation$Builder/create scope (name id)) id config))


(defn cfn-configuration-association-configuration-id-property-builder>
  "The cfn-configuration-association-configuration-id-property-builder> function updates a CfnConfigurationAssociation$ConfigurationIdProperty$Builder instance using the provided configuration.
  The function takes the CfnConfigurationAssociation$ConfigurationIdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `revision` | java.lang.Number | [[cdk.support/lookup-entry]] | `:revision` |
"
  [^CfnConfigurationAssociation$ConfigurationIdProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :revision)]
    (. builder revision data))
  (.build builder))


(defn cfn-configuration-association-configuration-id-property-builder
  "Creates a  `CfnConfigurationAssociation$ConfigurationIdProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-configuration-association-configuration-id-property-builder> (new CfnConfigurationAssociation$ConfigurationIdProperty$Builder) id config))


(defn cfn-configuration-association-props-builder>
  "The cfn-configuration-association-props-builder> function updates a CfnConfigurationAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnConfigurationAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `broker` | java.lang.String | [[cdk.support/lookup-entry]] | `:broker` |
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
"
  [^CfnConfigurationAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :broker)]
    (. builder broker data))
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (.build builder))


(defn cfn-configuration-association-props-builder
  "Creates a  `CfnConfigurationAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-configuration-association-props-builder> (new CfnConfigurationAssociationProps$Builder) id config))


(defn cfn-configuration-builder>
  "The cfn-configuration-builder> function updates a CfnConfiguration$Builder instance using the provided configuration.
  The function takes the CfnConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-strategy` |
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication-strategy)]
    (. builder authenticationStrategy data))
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-configuration-builder
  "Creates a  `CfnConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-configuration-builder> (CfnConfiguration$Builder/create scope (name id)) id config))


(defn cfn-configuration-props-builder>
  "The cfn-configuration-props-builder> function updates a CfnConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:authentication-strategy` |
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engineType` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-type` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication-strategy)]
    (. builder authenticationStrategy data))
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine-type)]
    (. builder engineType data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-configuration-props-builder
  "Creates a  `CfnConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-configuration-props-builder> (new CfnConfigurationProps$Builder) id config))


(defn cfn-configuration-tags-entry-property-builder>
  "The cfn-configuration-tags-entry-property-builder> function updates a CfnConfiguration$TagsEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnConfiguration$TagsEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnConfiguration$TagsEntryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-configuration-tags-entry-property-builder
  "Creates a  `CfnConfiguration$TagsEntryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-configuration-tags-entry-property-builder> (new CfnConfiguration$TagsEntryProperty$Builder) id config))