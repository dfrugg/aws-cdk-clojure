(ns cdk.api.services.rds
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.rds package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.api.services.logs :refer [retention-days]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.rds AuroraCapacityUnit
                                                AuroraClusterEngineProps$Builder
                                                AuroraMysqlClusterEngineProps$Builder
                                                AuroraPostgresClusterEngineProps$Builder
                                                AuroraPostgresEngineFeatures$Builder
                                                BackupProps$Builder
                                                CfnCustomDBEngineVersion$Builder
                                                CfnCustomDBEngineVersionProps$Builder
                                                CfnDBCluster$Builder
                                                CfnDBCluster$DBClusterRoleProperty$Builder
                                                CfnDBCluster$EndpointProperty$Builder
                                                CfnDBCluster$MasterUserSecretProperty$Builder
                                                CfnDBCluster$ReadEndpointProperty$Builder
                                                CfnDBCluster$ScalingConfigurationProperty$Builder
                                                CfnDBCluster$ServerlessV2ScalingConfigurationProperty$Builder
                                                CfnDBClusterParameterGroup$Builder
                                                CfnDBClusterParameterGroupProps$Builder
                                                CfnDBClusterProps$Builder
                                                CfnDBInstance$Builder
                                                CfnDBInstance$CertificateDetailsProperty$Builder
                                                CfnDBInstance$DBInstanceRoleProperty$Builder
                                                CfnDBInstance$EndpointProperty$Builder
                                                CfnDBInstance$MasterUserSecretProperty$Builder
                                                CfnDBInstance$ProcessorFeatureProperty$Builder
                                                CfnDBInstanceProps$Builder
                                                CfnDBParameterGroup$Builder
                                                CfnDBParameterGroupProps$Builder
                                                CfnDBProxy$AuthFormatProperty$Builder
                                                CfnDBProxy$Builder
                                                CfnDBProxy$TagFormatProperty$Builder
                                                CfnDBProxyEndpoint$Builder
                                                CfnDBProxyEndpoint$TagFormatProperty$Builder
                                                CfnDBProxyEndpointProps$Builder
                                                CfnDBProxyProps$Builder
                                                CfnDBProxyTargetGroup$Builder
                                                CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty$Builder
                                                CfnDBProxyTargetGroupProps$Builder
                                                CfnDBSecurityGroup$Builder
                                                CfnDBSecurityGroup$IngressProperty$Builder
                                                CfnDBSecurityGroupIngress$Builder
                                                CfnDBSecurityGroupIngressProps$Builder
                                                CfnDBSecurityGroupProps$Builder
                                                CfnDBSubnetGroup$Builder
                                                CfnDBSubnetGroupProps$Builder
                                                CfnEventSubscription$Builder
                                                CfnEventSubscriptionProps$Builder
                                                CfnGlobalCluster$Builder
                                                CfnGlobalClusterProps$Builder
                                                CfnIntegration$Builder
                                                CfnIntegrationProps$Builder
                                                CfnOptionGroup$Builder
                                                CfnOptionGroup$OptionConfigurationProperty$Builder
                                                CfnOptionGroup$OptionSettingProperty$Builder
                                                CfnOptionGroupProps$Builder
                                                ClientPasswordAuthType
                                                ClusterEngineBindOptions$Builder
                                                ClusterEngineConfig$Builder
                                                ClusterEngineFeatures$Builder
                                                ClusterInstanceBindOptions$Builder
                                                ClusterInstanceOptions$Builder
                                                ClusterInstanceProps$Builder
                                                CommonRotationUserOptions$Builder
                                                CredentialsBaseOptions$Builder
                                                CredentialsFromUsernameOptions$Builder
                                                DBClusterStorageType
                                                DatabaseCluster$Builder
                                                DatabaseClusterAttributes$Builder
                                                DatabaseClusterFromSnapshot$Builder
                                                DatabaseClusterFromSnapshotProps$Builder
                                                DatabaseClusterProps$Builder
                                                DatabaseInstance$Builder
                                                DatabaseInstanceAttributes$Builder
                                                DatabaseInstanceFromSnapshot$Builder
                                                DatabaseInstanceFromSnapshotProps$Builder
                                                DatabaseInstanceNewProps$Builder
                                                DatabaseInstanceProps$Builder
                                                DatabaseInstanceReadReplica$Builder
                                                DatabaseInstanceReadReplicaProps$Builder
                                                DatabaseInstanceSourceProps$Builder
                                                DatabaseProxy$Builder
                                                DatabaseProxyAttributes$Builder
                                                DatabaseProxyOptions$Builder
                                                DatabaseProxyProps$Builder
                                                DatabaseSecret$Builder
                                                DatabaseSecretProps$Builder
                                                EngineVersion$Builder
                                                InstanceEngineBindOptions$Builder
                                                InstanceEngineConfig$Builder
                                                InstanceEngineFeatures$Builder
                                                InstanceProps$Builder
                                                InstanceType
                                                InstanceUpdateBehaviour
                                                LicenseModel
                                                MariaDbInstanceEngineProps$Builder
                                                MySqlInstanceEngineProps$Builder
                                                NetworkType
                                                OptionConfiguration$Builder
                                                OptionGroup$Builder
                                                OptionGroupProps$Builder
                                                OracleEeCdbInstanceEngineProps$Builder
                                                OracleEeInstanceEngineProps$Builder
                                                OracleSe2CdbInstanceEngineProps$Builder
                                                OracleSe2InstanceEngineProps$Builder
                                                ParameterGroup$Builder
                                                ParameterGroupClusterBindOptions$Builder
                                                ParameterGroupClusterConfig$Builder
                                                ParameterGroupInstanceBindOptions$Builder
                                                ParameterGroupInstanceConfig$Builder
                                                ParameterGroupProps$Builder
                                                PerformanceInsightRetention
                                                PostgresEngineFeatures$Builder
                                                PostgresInstanceEngineProps$Builder
                                                ProcessorFeatures$Builder
                                                ProvisionedClusterInstanceProps$Builder
                                                ProxyTargetConfig$Builder
                                                RotationMultiUserOptions$Builder
                                                RotationSingleUserOptions$Builder
                                                ServerlessCluster$Builder
                                                ServerlessClusterAttributes$Builder
                                                ServerlessClusterFromSnapshot$Builder
                                                ServerlessClusterFromSnapshotProps$Builder
                                                ServerlessClusterProps$Builder
                                                ServerlessScalingOptions$Builder
                                                ServerlessV2ClusterInstanceProps$Builder
                                                SnapshotCredentialsFromGeneratedPasswordOptions$Builder
                                                SqlServerEeInstanceEngineProps$Builder
                                                SqlServerExInstanceEngineProps$Builder
                                                SqlServerSeInstanceEngineProps$Builder
                                                SqlServerWebInstanceEngineProps$Builder
                                                StorageType
                                                SubnetGroup$Builder
                                                SubnetGroupProps$Builder
                                                TimeoutAction]))


(defn aurora-capacity-unit
  "The `aurora-capacity-unit` function data interprets values in the provided config data into a 
`AuroraCapacityUnit` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AuroraCapacityUnit` - the value is returned.
* is `:acu-32` - `AuroraCapacityUnit/ACU_32` is returned
* is `:acu-8` - `AuroraCapacityUnit/ACU_8` is returned
* is `:acu-16` - `AuroraCapacityUnit/ACU_16` is returned
* is `:acu-128` - `AuroraCapacityUnit/ACU_128` is returned
* is `:acu-1` - `AuroraCapacityUnit/ACU_1` is returned
* is `:acu-384` - `AuroraCapacityUnit/ACU_384` is returned
* is `:acu-4` - `AuroraCapacityUnit/ACU_4` is returned
* is `:acu-64` - `AuroraCapacityUnit/ACU_64` is returned
* is `:acu-256` - `AuroraCapacityUnit/ACU_256` is returned
* is `:acu-2` - `AuroraCapacityUnit/ACU_2` is returned
* is `:acu-192` - `AuroraCapacityUnit/ACU_192` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AuroraCapacityUnit data) data
      (= :acu-32 data) AuroraCapacityUnit/ACU_32
      (= :acu-8 data) AuroraCapacityUnit/ACU_8
      (= :acu-16 data) AuroraCapacityUnit/ACU_16
      (= :acu-128 data) AuroraCapacityUnit/ACU_128
      (= :acu-1 data) AuroraCapacityUnit/ACU_1
      (= :acu-384 data) AuroraCapacityUnit/ACU_384
      (= :acu-4 data) AuroraCapacityUnit/ACU_4
      (= :acu-64 data) AuroraCapacityUnit/ACU_64
      (= :acu-256 data) AuroraCapacityUnit/ACU_256
      (= :acu-2 data) AuroraCapacityUnit/ACU_2
      (= :acu-192 data) AuroraCapacityUnit/ACU_192)))


(defn client-password-auth-type
  "The `client-password-auth-type` function data interprets values in the provided config data into a 
`ClientPasswordAuthType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ClientPasswordAuthType` - the value is returned.
* is `:mysql-native-password` - `ClientPasswordAuthType/MYSQL_NATIVE_PASSWORD` is returned
* is `:sql-server-authentication` - `ClientPasswordAuthType/SQL_SERVER_AUTHENTICATION` is returned
* is `:postgres-md5` - `ClientPasswordAuthType/POSTGRES_MD5` is returned
* is `:postgres-scram-sha-256` - `ClientPasswordAuthType/POSTGRES_SCRAM_SHA_256` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ClientPasswordAuthType data) data
      (= :mysql-native-password data) ClientPasswordAuthType/MYSQL_NATIVE_PASSWORD
      (= :sql-server-authentication data) ClientPasswordAuthType/SQL_SERVER_AUTHENTICATION
      (= :postgres-md5 data) ClientPasswordAuthType/POSTGRES_MD5
      (= :postgres-scram-sha-256 data) ClientPasswordAuthType/POSTGRES_SCRAM_SHA_256)))


(defn db-cluster-storage-type
  "The `db-cluster-storage-type` function data interprets values in the provided config data into a 
`DBClusterStorageType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DBClusterStorageType` - the value is returned.
* is `:aurora` - `DBClusterStorageType/AURORA` is returned
* is `:aurora-iopt1` - `DBClusterStorageType/AURORA_IOPT1` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DBClusterStorageType data) data
      (= :aurora data) DBClusterStorageType/AURORA
      (= :aurora-iopt1 data) DBClusterStorageType/AURORA_IOPT1)))


(defn instance-type
  "The `instance-type` function data interprets values in the provided config data into a 
`InstanceType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InstanceType` - the value is returned.
* is `:provisioned` - `InstanceType/PROVISIONED` is returned
* is `:serverless-v2` - `InstanceType/SERVERLESS_V2` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InstanceType data) data
      (= :provisioned data) InstanceType/PROVISIONED
      (= :serverless-v2 data) InstanceType/SERVERLESS_V2)))


(defn instance-update-behaviour
  "The `instance-update-behaviour` function data interprets values in the provided config data into a 
`InstanceUpdateBehaviour` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InstanceUpdateBehaviour` - the value is returned.
* is `:rolling` - `InstanceUpdateBehaviour/ROLLING` is returned
* is `:bulk` - `InstanceUpdateBehaviour/BULK` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InstanceUpdateBehaviour data) data
      (= :rolling data) InstanceUpdateBehaviour/ROLLING
      (= :bulk data) InstanceUpdateBehaviour/BULK)))


(defn license-model
  "The `license-model` function data interprets values in the provided config data into a 
`LicenseModel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LicenseModel` - the value is returned.
* is `:license-included` - `LicenseModel/LICENSE_INCLUDED` is returned
* is `:general-public-license` - `LicenseModel/GENERAL_PUBLIC_LICENSE` is returned
* is `:bring-your-own-license` - `LicenseModel/BRING_YOUR_OWN_LICENSE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LicenseModel data) data
      (= :license-included data) LicenseModel/LICENSE_INCLUDED
      (= :general-public-license data) LicenseModel/GENERAL_PUBLIC_LICENSE
      (= :bring-your-own-license data) LicenseModel/BRING_YOUR_OWN_LICENSE)))


(defn network-type
  "The `network-type` function data interprets values in the provided config data into a 
`NetworkType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `NetworkType` - the value is returned.
* is `:dual` - `NetworkType/DUAL` is returned
* is `:ipv4` - `NetworkType/IPV4` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? NetworkType data) data
      (= :dual data) NetworkType/DUAL
      (= :ipv4 data) NetworkType/IPV4)))


(defn performance-insight-retention
  "The `performance-insight-retention` function data interprets values in the provided config data into a 
`PerformanceInsightRetention` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `PerformanceInsightRetention` - the value is returned.
* is `:months-1` - `PerformanceInsightRetention/MONTHS_1` is returned
* is `:months-2` - `PerformanceInsightRetention/MONTHS_2` is returned
* is `:months-9` - `PerformanceInsightRetention/MONTHS_9` is returned
* is `:default` - `PerformanceInsightRetention/DEFAULT` is returned
* is `:months-15` - `PerformanceInsightRetention/MONTHS_15` is returned
* is `:months-19` - `PerformanceInsightRetention/MONTHS_19` is returned
* is `:months-5` - `PerformanceInsightRetention/MONTHS_5` is returned
* is `:months-7` - `PerformanceInsightRetention/MONTHS_7` is returned
* is `:months-20` - `PerformanceInsightRetention/MONTHS_20` is returned
* is `:months-21` - `PerformanceInsightRetention/MONTHS_21` is returned
* is `:months-22` - `PerformanceInsightRetention/MONTHS_22` is returned
* is `:months-18` - `PerformanceInsightRetention/MONTHS_18` is returned
* is `:months-10` - `PerformanceInsightRetention/MONTHS_10` is returned
* is `:months-11` - `PerformanceInsightRetention/MONTHS_11` is returned
* is `:months-16` - `PerformanceInsightRetention/MONTHS_16` is returned
* is `:months-12` - `PerformanceInsightRetention/MONTHS_12` is returned
* is `:months-23` - `PerformanceInsightRetention/MONTHS_23` is returned
* is `:months-14` - `PerformanceInsightRetention/MONTHS_14` is returned
* is `:months-6` - `PerformanceInsightRetention/MONTHS_6` is returned
* is `:months-3` - `PerformanceInsightRetention/MONTHS_3` is returned
* is `:months-17` - `PerformanceInsightRetention/MONTHS_17` is returned
* is `:months-13` - `PerformanceInsightRetention/MONTHS_13` is returned
* is `:long-term` - `PerformanceInsightRetention/LONG_TERM` is returned
* is `:months-4` - `PerformanceInsightRetention/MONTHS_4` is returned
* is `:months-8` - `PerformanceInsightRetention/MONTHS_8` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? PerformanceInsightRetention data) data
      (= :months-1 data) PerformanceInsightRetention/MONTHS_1
      (= :months-2 data) PerformanceInsightRetention/MONTHS_2
      (= :months-9 data) PerformanceInsightRetention/MONTHS_9
      (= :default data) PerformanceInsightRetention/DEFAULT
      (= :months-15 data) PerformanceInsightRetention/MONTHS_15
      (= :months-19 data) PerformanceInsightRetention/MONTHS_19
      (= :months-5 data) PerformanceInsightRetention/MONTHS_5
      (= :months-7 data) PerformanceInsightRetention/MONTHS_7
      (= :months-20 data) PerformanceInsightRetention/MONTHS_20
      (= :months-21 data) PerformanceInsightRetention/MONTHS_21
      (= :months-22 data) PerformanceInsightRetention/MONTHS_22
      (= :months-18 data) PerformanceInsightRetention/MONTHS_18
      (= :months-10 data) PerformanceInsightRetention/MONTHS_10
      (= :months-11 data) PerformanceInsightRetention/MONTHS_11
      (= :months-16 data) PerformanceInsightRetention/MONTHS_16
      (= :months-12 data) PerformanceInsightRetention/MONTHS_12
      (= :months-23 data) PerformanceInsightRetention/MONTHS_23
      (= :months-14 data) PerformanceInsightRetention/MONTHS_14
      (= :months-6 data) PerformanceInsightRetention/MONTHS_6
      (= :months-3 data) PerformanceInsightRetention/MONTHS_3
      (= :months-17 data) PerformanceInsightRetention/MONTHS_17
      (= :months-13 data) PerformanceInsightRetention/MONTHS_13
      (= :long-term data) PerformanceInsightRetention/LONG_TERM
      (= :months-4 data) PerformanceInsightRetention/MONTHS_4
      (= :months-8 data) PerformanceInsightRetention/MONTHS_8)))


(defn storage-type
  "The `storage-type` function data interprets values in the provided config data into a 
`StorageType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `StorageType` - the value is returned.
* is `:gp2` - `StorageType/GP2` is returned
* is `:gp3` - `StorageType/GP3` is returned
* is `:io1` - `StorageType/IO1` is returned
* is `:io2` - `StorageType/IO2` is returned
* is `:standard` - `StorageType/STANDARD` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? StorageType data) data
      (= :gp2 data) StorageType/GP2
      (= :gp3 data) StorageType/GP3
      (= :io1 data) StorageType/IO1
      (= :io2 data) StorageType/IO2
      (= :standard data) StorageType/STANDARD)))


(defn timeout-action
  "The `timeout-action` function data interprets values in the provided config data into a 
`TimeoutAction` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TimeoutAction` - the value is returned.
* is `:rollback-capacity-change` - `TimeoutAction/ROLLBACK_CAPACITY_CHANGE` is returned
* is `:force-apply-capacity-change` - `TimeoutAction/FORCE_APPLY_CAPACITY_CHANGE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TimeoutAction data) data
      (= :rollback-capacity-change data) TimeoutAction/ROLLBACK_CAPACITY_CHANGE
      (= :force-apply-capacity-change data) TimeoutAction/FORCE_APPLY_CAPACITY_CHANGE)))


(defn aurora-cluster-engine-props-builder>
  "The aurora-cluster-engine-props-builder> function updates a AuroraClusterEngineProps$Builder instance using the provided configuration.
  The function takes the AuroraClusterEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.AuroraEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^AuroraClusterEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn aurora-cluster-engine-props-builder
  "Creates a  `AuroraClusterEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[aurora-cluster-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (aurora-cluster-engine-props-builder> (new AuroraClusterEngineProps$Builder) id config))


(defn aurora-mysql-cluster-engine-props-builder>
  "The aurora-mysql-cluster-engine-props-builder> function updates a AuroraMysqlClusterEngineProps$Builder instance using the provided configuration.
  The function takes the AuroraMysqlClusterEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^AuroraMysqlClusterEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn aurora-mysql-cluster-engine-props-builder
  "Creates a  `AuroraMysqlClusterEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[aurora-mysql-cluster-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (aurora-mysql-cluster-engine-props-builder> (new AuroraMysqlClusterEngineProps$Builder) id config))


(defn aurora-postgres-cluster-engine-props-builder>
  "The aurora-postgres-cluster-engine-props-builder> function updates a AuroraPostgresClusterEngineProps$Builder instance using the provided configuration.
  The function takes the AuroraPostgresClusterEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^AuroraPostgresClusterEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn aurora-postgres-cluster-engine-props-builder
  "Creates a  `AuroraPostgresClusterEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[aurora-postgres-cluster-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (aurora-postgres-cluster-engine-props-builder> (new AuroraPostgresClusterEngineProps$Builder) id config))


(defn aurora-postgres-engine-features-builder>
  "The aurora-postgres-engine-features-builder> function updates a AuroraPostgresEngineFeatures$Builder instance using the provided configuration.
  The function takes the AuroraPostgresEngineFeatures$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Export` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-export` |
| `s3Import` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-import` |
"
  [^AuroraPostgresEngineFeatures$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-export)]
    (. builder s3Export data))
  (when-some [data (lookup-entry config id :s3-import)]
    (. builder s3Import data))
  (.build builder))


(defn aurora-postgres-engine-features-builder
  "Creates a  `AuroraPostgresEngineFeatures$Builder` instance using a no-argument constructor, applies the data configuration using the [[aurora-postgres-engine-features-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (aurora-postgres-engine-features-builder> (new AuroraPostgresEngineFeatures$Builder) id config))


(defn backup-props-builder>
  "The backup-props-builder> function updates a BackupProps$Builder instance using the provided configuration.
  The function takes the BackupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preferredWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-window` |
| `retention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention` |
"
  [^BackupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :preferred-window)]
    (. builder preferredWindow data))
  (when-some [data (lookup-entry config id :retention)]
    (. builder retention data))
  (.build builder))


(defn backup-props-builder
  "Creates a  `BackupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[backup-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (backup-props-builder> (new BackupProps$Builder) id config))


(defn cfn-custom-db-engine-version-builder>
  "The cfn-custom-db-engine-version-builder> function updates a CfnCustomDBEngineVersion$Builder instance using the provided configuration.
  The function takes the CfnCustomDBEngineVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseInstallationFilesS3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-installation-files-s3-bucket-name` |
| `databaseInstallationFilesS3Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-installation-files-s3-prefix` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `manifest` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest` |
| `sourceCustomDbEngineVersionIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-custom-db-engine-version-identifier` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `useAwsProvidedLatestImage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-aws-provided-latest-image` |
"
  [^CfnCustomDBEngineVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :database-installation-files-s3-bucket-name)]
    (. builder databaseInstallationFilesS3BucketName data))
  (when-some [data (lookup-entry config id :database-installation-files-s3-prefix)]
    (. builder databaseInstallationFilesS3Prefix data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :image-id)]
    (. builder imageId data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :manifest)]
    (. builder manifest data))
  (when-some [data (lookup-entry config id :source-custom-db-engine-version-identifier)]
    (. builder sourceCustomDbEngineVersionIdentifier data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :use-aws-provided-latest-image)]
    (. builder useAwsProvidedLatestImage data))
  (.build builder))


(defn cfn-custom-db-engine-version-builder
  "Creates a  `CfnCustomDBEngineVersion$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-custom-db-engine-version-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-custom-db-engine-version-builder> (CfnCustomDBEngineVersion$Builder/create scope (name id)) id config))


(defn cfn-custom-db-engine-version-props-builder>
  "The cfn-custom-db-engine-version-props-builder> function updates a CfnCustomDBEngineVersionProps$Builder instance using the provided configuration.
  The function takes the CfnCustomDBEngineVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseInstallationFilesS3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-installation-files-s3-bucket-name` |
| `databaseInstallationFilesS3Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-installation-files-s3-prefix` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `manifest` | java.lang.String | [[cdk.support/lookup-entry]] | `:manifest` |
| `sourceCustomDbEngineVersionIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-custom-db-engine-version-identifier` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `useAwsProvidedLatestImage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-aws-provided-latest-image` |
"
  [^CfnCustomDBEngineVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :database-installation-files-s3-bucket-name)]
    (. builder databaseInstallationFilesS3BucketName data))
  (when-some [data (lookup-entry config id :database-installation-files-s3-prefix)]
    (. builder databaseInstallationFilesS3Prefix data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :image-id)]
    (. builder imageId data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :manifest)]
    (. builder manifest data))
  (when-some [data (lookup-entry config id :source-custom-db-engine-version-identifier)]
    (. builder sourceCustomDbEngineVersionIdentifier data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :use-aws-provided-latest-image)]
    (. builder useAwsProvidedLatestImage data))
  (.build builder))


(defn cfn-custom-db-engine-version-props-builder
  "Creates a  `CfnCustomDBEngineVersionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-custom-db-engine-version-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-custom-db-engine-version-props-builder> (new CfnCustomDBEngineVersionProps$Builder) id config))


(defn cfn-db-cluster-builder>
  "The cfn-db-cluster-builder> function updates a CfnDBCluster$Builder instance using the provided configuration.
  The function takes the CfnDBCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `associatedRoles` | java.util.List | [[cdk.support/lookup-entry]] | `:associated-roles` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `backtrackWindow` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backtrack-window` |
| `backupRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-period` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbClusterInstanceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-instance-class` |
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `dbInstanceParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-parameter-group-name` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `dbSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-system-id` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainIamRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-iam-role-name` |
| `enableCloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:enable-cloudwatch-logs-exports` |
| `enableGlobalWriteForwarding` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-global-write-forwarding` |
| `enableHttpEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-http-endpoint` |
| `enableIamDatabaseAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-iam-database-authentication` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-mode` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `globalClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-cluster-identifier` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `manageMasterUserPassword` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:manage-master-user-password` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |
| `masterUserSecret` | software.amazon.awscdk.services.rds.CfnDBCluster$MasterUserSecretProperty | [[cdk.support/lookup-entry]] | `:master-user-secret` |
| `masterUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-username` |
| `monitoringInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-role-arn` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `performanceInsightsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:performance-insights-enabled` |
| `performanceInsightsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:performance-insights-kms-key-id` |
| `performanceInsightsRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:performance-insights-retention-period` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `replicationSourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-source-identifier` |
| `restoreToTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-to-time` |
| `restoreType` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-type` |
| `scalingConfiguration` | software.amazon.awscdk.services.rds.CfnDBCluster$ScalingConfigurationProperty | [[cdk.support/lookup-entry]] | `:scaling-configuration` |
| `serverlessV2ScalingConfiguration` | software.amazon.awscdk.services.rds.CfnDBCluster$ServerlessV2ScalingConfigurationProperty | [[cdk.support/lookup-entry]] | `:serverless-v2-scaling-configuration` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `sourceRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-region` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `useLatestRestorableTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-latest-restorable-time` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnDBCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :associated-roles)]
    (. builder associatedRoles data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zones)]
    (. builder availabilityZones data))
  (when-some [data (lookup-entry config id :backtrack-window)]
    (. builder backtrackWindow data))
  (when-some [data (lookup-entry config id :backup-retention-period)]
    (. builder backupRetentionPeriod data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :db-cluster-identifier)]
    (. builder dbClusterIdentifier data))
  (when-some [data (lookup-entry config id :db-cluster-instance-class)]
    (. builder dbClusterInstanceClass data))
  (when-some [data (lookup-entry config id :db-cluster-parameter-group-name)]
    (. builder dbClusterParameterGroupName data))
  (when-some [data (lookup-entry config id :db-instance-parameter-group-name)]
    (. builder dbInstanceParameterGroupName data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :db-system-id)]
    (. builder dbSystemId data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-iam-role-name)]
    (. builder domainIamRoleName data))
  (when-some [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
    (. builder enableCloudwatchLogsExports data))
  (when-some [data (lookup-entry config id :enable-global-write-forwarding)]
    (. builder enableGlobalWriteForwarding data))
  (when-some [data (lookup-entry config id :enable-http-endpoint)]
    (. builder enableHttpEndpoint data))
  (when-some [data (lookup-entry config id :enable-iam-database-authentication)]
    (. builder enableIamDatabaseAuthentication data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :engine-mode)]
    (. builder engineMode data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :global-cluster-identifier)]
    (. builder globalClusterIdentifier data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :manage-master-user-password)]
    (. builder manageMasterUserPassword data))
  (when-some [data (lookup-entry config id :master-user-password)]
    (. builder masterUserPassword data))
  (when-some [data (lookup-entry config id :master-user-secret)]
    (. builder masterUserSecret data))
  (when-some [data (lookup-entry config id :master-username)]
    (. builder masterUsername data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role-arn)]
    (. builder monitoringRoleArn data))
  (when-some [data (lookup-entry config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :performance-insights-enabled)]
    (. builder performanceInsightsEnabled data))
  (when-some [data (lookup-entry config id :performance-insights-kms-key-id)]
    (. builder performanceInsightsKmsKeyId data))
  (when-some [data (lookup-entry config id :performance-insights-retention-period)]
    (. builder performanceInsightsRetentionPeriod data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :replication-source-identifier)]
    (. builder replicationSourceIdentifier data))
  (when-some [data (lookup-entry config id :restore-to-time)]
    (. builder restoreToTime data))
  (when-some [data (lookup-entry config id :restore-type)]
    (. builder restoreType data))
  (when-some [data (lookup-entry config id :scaling-configuration)]
    (. builder scalingConfiguration data))
  (when-some [data (lookup-entry config id :serverless-v2-scaling-configuration)]
    (. builder serverlessV2ScalingConfiguration data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :source-db-cluster-identifier)]
    (. builder sourceDbClusterIdentifier data))
  (when-some [data (lookup-entry config id :source-region)]
    (. builder sourceRegion data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :use-latest-restorable-time)]
    (. builder useLatestRestorableTime data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-db-cluster-builder
  "Creates a  `CfnDBCluster$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-cluster-builder> (CfnDBCluster$Builder/create scope (name id)) id config))


(defn cfn-db-cluster-db-cluster-role-property-builder>
  "The cfn-db-cluster-db-cluster-role-property-builder> function updates a CfnDBCluster$DBClusterRoleProperty$Builder instance using the provided configuration.
  The function takes the CfnDBCluster$DBClusterRoleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDBCluster$DBClusterRoleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :feature-name)]
    (. builder featureName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-db-cluster-db-cluster-role-property-builder
  "Creates a  `CfnDBCluster$DBClusterRoleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-cluster-db-cluster-role-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-cluster-db-cluster-role-property-builder> (new CfnDBCluster$DBClusterRoleProperty$Builder) id config))


(defn cfn-db-cluster-endpoint-property-builder>
  "The cfn-db-cluster-endpoint-property-builder> function updates a CfnDBCluster$EndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnDBCluster$EndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnDBCluster$EndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-db-cluster-endpoint-property-builder
  "Creates a  `CfnDBCluster$EndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-cluster-endpoint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-cluster-endpoint-property-builder> (new CfnDBCluster$EndpointProperty$Builder) id config))


(defn cfn-db-cluster-master-user-secret-property-builder>
  "The cfn-db-cluster-master-user-secret-property-builder> function updates a CfnDBCluster$MasterUserSecretProperty$Builder instance using the provided configuration.
  The function takes the CfnDBCluster$MasterUserSecretProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
"
  [^CfnDBCluster$MasterUserSecretProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (.build builder))


(defn cfn-db-cluster-master-user-secret-property-builder
  "Creates a  `CfnDBCluster$MasterUserSecretProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-cluster-master-user-secret-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-cluster-master-user-secret-property-builder> (new CfnDBCluster$MasterUserSecretProperty$Builder) id config))


(defn cfn-db-cluster-parameter-group-builder>
  "The cfn-db-cluster-parameter-group-builder> function updates a CfnDBClusterParameterGroup$Builder instance using the provided configuration.
  The function takes the CfnDBClusterParameterGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBClusterParameterGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :db-cluster-parameter-group-name)]
    (. builder dbClusterParameterGroupName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-cluster-parameter-group-builder
  "Creates a  `CfnDBClusterParameterGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-cluster-parameter-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-cluster-parameter-group-builder> (CfnDBClusterParameterGroup$Builder/create scope (name id)) id config))


(defn cfn-db-cluster-parameter-group-props-builder>
  "The cfn-db-cluster-parameter-group-props-builder> function updates a CfnDBClusterParameterGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDBClusterParameterGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBClusterParameterGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :db-cluster-parameter-group-name)]
    (. builder dbClusterParameterGroupName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-cluster-parameter-group-props-builder
  "Creates a  `CfnDBClusterParameterGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-cluster-parameter-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-cluster-parameter-group-props-builder> (new CfnDBClusterParameterGroupProps$Builder) id config))


(defn cfn-db-cluster-props-builder>
  "The cfn-db-cluster-props-builder> function updates a CfnDBClusterProps$Builder instance using the provided configuration.
  The function takes the CfnDBClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `associatedRoles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:associated-roles` |
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `backtrackWindow` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backtrack-window` |
| `backupRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-period` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbClusterInstanceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-instance-class` |
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `dbInstanceParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-parameter-group-name` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `dbSystemId` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-system-id` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainIamRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-iam-role-name` |
| `enableCloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:enable-cloudwatch-logs-exports` |
| `enableGlobalWriteForwarding` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-global-write-forwarding` |
| `enableHttpEndpoint` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-http-endpoint` |
| `enableIamDatabaseAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-iam-database-authentication` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-mode` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `globalClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-cluster-identifier` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `manageMasterUserPassword` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:manage-master-user-password` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |
| `masterUserSecret` | software.amazon.awscdk.services.rds.CfnDBCluster$MasterUserSecretProperty | [[cdk.support/lookup-entry]] | `:master-user-secret` |
| `masterUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-username` |
| `monitoringInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-role-arn` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `performanceInsightsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:performance-insights-enabled` |
| `performanceInsightsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:performance-insights-kms-key-id` |
| `performanceInsightsRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:performance-insights-retention-period` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `replicationSourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:replication-source-identifier` |
| `restoreToTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-to-time` |
| `restoreType` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-type` |
| `scalingConfiguration` | software.amazon.awscdk.services.rds.CfnDBCluster$ScalingConfigurationProperty | [[cdk.support/lookup-entry]] | `:scaling-configuration` |
| `serverlessV2ScalingConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:serverless-v2-scaling-configuration` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `sourceRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-region` |
| `storageEncrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `useLatestRestorableTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-latest-restorable-time` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
"
  [^CfnDBClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :associated-roles)]
    (. builder associatedRoles data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zones)]
    (. builder availabilityZones data))
  (when-some [data (lookup-entry config id :backtrack-window)]
    (. builder backtrackWindow data))
  (when-some [data (lookup-entry config id :backup-retention-period)]
    (. builder backupRetentionPeriod data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :db-cluster-identifier)]
    (. builder dbClusterIdentifier data))
  (when-some [data (lookup-entry config id :db-cluster-instance-class)]
    (. builder dbClusterInstanceClass data))
  (when-some [data (lookup-entry config id :db-cluster-parameter-group-name)]
    (. builder dbClusterParameterGroupName data))
  (when-some [data (lookup-entry config id :db-instance-parameter-group-name)]
    (. builder dbInstanceParameterGroupName data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :db-system-id)]
    (. builder dbSystemId data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-iam-role-name)]
    (. builder domainIamRoleName data))
  (when-some [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
    (. builder enableCloudwatchLogsExports data))
  (when-some [data (lookup-entry config id :enable-global-write-forwarding)]
    (. builder enableGlobalWriteForwarding data))
  (when-some [data (lookup-entry config id :enable-http-endpoint)]
    (. builder enableHttpEndpoint data))
  (when-some [data (lookup-entry config id :enable-iam-database-authentication)]
    (. builder enableIamDatabaseAuthentication data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :engine-mode)]
    (. builder engineMode data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :global-cluster-identifier)]
    (. builder globalClusterIdentifier data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :manage-master-user-password)]
    (. builder manageMasterUserPassword data))
  (when-some [data (lookup-entry config id :master-user-password)]
    (. builder masterUserPassword data))
  (when-some [data (lookup-entry config id :master-user-secret)]
    (. builder masterUserSecret data))
  (when-some [data (lookup-entry config id :master-username)]
    (. builder masterUsername data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role-arn)]
    (. builder monitoringRoleArn data))
  (when-some [data (lookup-entry config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :performance-insights-enabled)]
    (. builder performanceInsightsEnabled data))
  (when-some [data (lookup-entry config id :performance-insights-kms-key-id)]
    (. builder performanceInsightsKmsKeyId data))
  (when-some [data (lookup-entry config id :performance-insights-retention-period)]
    (. builder performanceInsightsRetentionPeriod data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :replication-source-identifier)]
    (. builder replicationSourceIdentifier data))
  (when-some [data (lookup-entry config id :restore-to-time)]
    (. builder restoreToTime data))
  (when-some [data (lookup-entry config id :restore-type)]
    (. builder restoreType data))
  (when-some [data (lookup-entry config id :scaling-configuration)]
    (. builder scalingConfiguration data))
  (when-some [data (lookup-entry config id :serverless-v2-scaling-configuration)]
    (. builder serverlessV2ScalingConfiguration data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :source-db-cluster-identifier)]
    (. builder sourceDbClusterIdentifier data))
  (when-some [data (lookup-entry config id :source-region)]
    (. builder sourceRegion data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :use-latest-restorable-time)]
    (. builder useLatestRestorableTime data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (.build builder))


(defn cfn-db-cluster-props-builder
  "Creates a  `CfnDBClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-cluster-props-builder> (new CfnDBClusterProps$Builder) id config))


(defn cfn-db-cluster-read-endpoint-property-builder>
  "The cfn-db-cluster-read-endpoint-property-builder> function updates a CfnDBCluster$ReadEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnDBCluster$ReadEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
"
  [^CfnDBCluster$ReadEndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (.build builder))


(defn cfn-db-cluster-read-endpoint-property-builder
  "Creates a  `CfnDBCluster$ReadEndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-cluster-read-endpoint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-cluster-read-endpoint-property-builder> (new CfnDBCluster$ReadEndpointProperty$Builder) id config))


(defn cfn-db-cluster-scaling-configuration-property-builder>
  "The cfn-db-cluster-scaling-configuration-property-builder> function updates a CfnDBCluster$ScalingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDBCluster$ScalingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPause` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-pause` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `secondsBeforeTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seconds-before-timeout` |
| `secondsUntilAutoPause` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seconds-until-auto-pause` |
| `timeoutAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout-action` |
"
  [^CfnDBCluster$ScalingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-pause)]
    (. builder autoPause data))
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (when-some [data (lookup-entry config id :seconds-before-timeout)]
    (. builder secondsBeforeTimeout data))
  (when-some [data (lookup-entry config id :seconds-until-auto-pause)]
    (. builder secondsUntilAutoPause data))
  (when-some [data (lookup-entry config id :timeout-action)]
    (. builder timeoutAction data))
  (.build builder))


(defn cfn-db-cluster-scaling-configuration-property-builder
  "Creates a  `CfnDBCluster$ScalingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-cluster-scaling-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-cluster-scaling-configuration-property-builder> (new CfnDBCluster$ScalingConfigurationProperty$Builder) id config))


(defn cfn-db-cluster-serverless-v2-scaling-configuration-property-builder>
  "The cfn-db-cluster-serverless-v2-scaling-configuration-property-builder> function updates a CfnDBCluster$ServerlessV2ScalingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnDBCluster$ServerlessV2ScalingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
"
  [^CfnDBCluster$ServerlessV2ScalingConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (lookup-entry config id :min-capacity)]
    (. builder minCapacity data))
  (.build builder))


(defn cfn-db-cluster-serverless-v2-scaling-configuration-property-builder
  "Creates a  `CfnDBCluster$ServerlessV2ScalingConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-cluster-serverless-v2-scaling-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-cluster-serverless-v2-scaling-configuration-property-builder> (new CfnDBCluster$ServerlessV2ScalingConfigurationProperty$Builder) id config))


(defn cfn-db-instance-builder>
  "The cfn-db-instance-builder> function updates a CfnDBInstance$Builder instance using the provided configuration.
  The function takes the CfnDBInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `allowMajorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `associatedRoles` | java.util.List | [[cdk.support/lookup-entry]] | `:associated-roles` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `automaticBackupReplicationKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:automatic-backup-replication-kms-key-id` |
| `automaticBackupReplicationRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:automatic-backup-replication-region` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-period` |
| `caCertificateIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-identifier` |
| `certificateDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate-details` |
| `certificateRotationRestart` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate-rotation-restart` |
| `characterSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:character-set-name` |
| `copyTagsToSnapshot` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `customIamInstanceProfile` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-iam-instance-profile` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbClusterSnapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-snapshot-identifier` |
| `dbInstanceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-class` |
| `dbInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-identifier` |
| `dbName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-name` |
| `dbParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-parameter-group-name` |
| `dbSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:db-security-groups` |
| `dbSnapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-snapshot-identifier` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `dedicatedLogVolume` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dedicated-log-volume` |
| `deleteAutomatedBackups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-automated-backups` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainAuthSecretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-auth-secret-arn` |
| `domainDnsIps` | java.util.List | [[cdk.support/lookup-entry]] | `:domain-dns-ips` |
| `domainFqdn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-fqdn` |
| `domainIamRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-iam-role-name` |
| `domainOu` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-ou` |
| `enableCloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:enable-cloudwatch-logs-exports` |
| `enableIamDatabaseAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-iam-database-authentication` |
| `enablePerformanceInsights` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `endpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `licenseModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-model` |
| `manageMasterUserPassword` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:manage-master-user-password` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |
| `masterUserSecret` | software.amazon.awscdk.services.rds.CfnDBInstance$MasterUserSecretProperty | [[cdk.support/lookup-entry]] | `:master-user-secret` |
| `masterUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-username` |
| `maxAllocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allocated-storage` |
| `monitoringInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-role-arn` |
| `multiAz` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-az` |
| `ncharCharacterSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:nchar-character-set-name` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `optionGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-group-name` |
| `performanceInsightsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:performance-insights-kms-key-id` |
| `performanceInsightsRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:performance-insights-retention-period` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `processorFeatures` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:processor-features` |
| `promotionTier` | java.lang.Number | [[cdk.support/lookup-entry]] | `:promotion-tier` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `replicaMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:replica-mode` |
| `restoreTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-time` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `sourceDbInstanceAutomatedBackupsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-instance-automated-backups-arn` |
| `sourceDbInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-instance-identifier` |
| `sourceDbiResourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-dbi-resource-id` |
| `sourceRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-region` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-throughput` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tdeCredentialArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:tde-credential-arn` |
| `tdeCredentialPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:tde-credential-password` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
| `useDefaultProcessorFeatures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-default-processor-features` |
| `useLatestRestorableTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-latest-restorable-time` |
| `vpcSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-groups` |
"
  [^CfnDBInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :associated-roles)]
    (. builder associatedRoles data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :automatic-backup-replication-kms-key-id)]
    (. builder automaticBackupReplicationKmsKeyId data))
  (when-some [data (lookup-entry config id :automatic-backup-replication-region)]
    (. builder automaticBackupReplicationRegion data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention-period)]
    (. builder backupRetentionPeriod data))
  (when-some [data (lookup-entry config id :ca-certificate-identifier)]
    (. builder caCertificateIdentifier data))
  (when-some [data (lookup-entry config id :certificate-details)]
    (. builder certificateDetails data))
  (when-some [data (lookup-entry config id :certificate-rotation-restart)]
    (. builder certificateRotationRestart data))
  (when-some [data (lookup-entry config id :character-set-name)]
    (. builder characterSetName data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :custom-iam-instance-profile)]
    (. builder customIamInstanceProfile data))
  (when-some [data (lookup-entry config id :db-cluster-identifier)]
    (. builder dbClusterIdentifier data))
  (when-some [data (lookup-entry config id :db-cluster-snapshot-identifier)]
    (. builder dbClusterSnapshotIdentifier data))
  (when-some [data (lookup-entry config id :db-instance-class)]
    (. builder dbInstanceClass data))
  (when-some [data (lookup-entry config id :db-instance-identifier)]
    (. builder dbInstanceIdentifier data))
  (when-some [data (lookup-entry config id :db-name)]
    (. builder dbName data))
  (when-some [data (lookup-entry config id :db-parameter-group-name)]
    (. builder dbParameterGroupName data))
  (when-some [data (lookup-entry config id :db-security-groups)]
    (. builder dbSecurityGroups data))
  (when-some [data (lookup-entry config id :db-snapshot-identifier)]
    (. builder dbSnapshotIdentifier data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :dedicated-log-volume)]
    (. builder dedicatedLogVolume data))
  (when-some [data (lookup-entry config id :delete-automated-backups)]
    (. builder deleteAutomatedBackups data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-auth-secret-arn)]
    (. builder domainAuthSecretArn data))
  (when-some [data (lookup-entry config id :domain-dns-ips)]
    (. builder domainDnsIps data))
  (when-some [data (lookup-entry config id :domain-fqdn)]
    (. builder domainFqdn data))
  (when-some [data (lookup-entry config id :domain-iam-role-name)]
    (. builder domainIamRoleName data))
  (when-some [data (lookup-entry config id :domain-ou)]
    (. builder domainOu data))
  (when-some [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
    (. builder enableCloudwatchLogsExports data))
  (when-some [data (lookup-entry config id :enable-iam-database-authentication)]
    (. builder enableIamDatabaseAuthentication data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :license-model)]
    (. builder licenseModel data))
  (when-some [data (lookup-entry config id :manage-master-user-password)]
    (. builder manageMasterUserPassword data))
  (when-some [data (lookup-entry config id :master-user-password)]
    (. builder masterUserPassword data))
  (when-some [data (lookup-entry config id :master-user-secret)]
    (. builder masterUserSecret data))
  (when-some [data (lookup-entry config id :master-username)]
    (. builder masterUsername data))
  (when-some [data (lookup-entry config id :max-allocated-storage)]
    (. builder maxAllocatedStorage data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role-arn)]
    (. builder monitoringRoleArn data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (lookup-entry config id :nchar-character-set-name)]
    (. builder ncharCharacterSetName data))
  (when-some [data (lookup-entry config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :option-group-name)]
    (. builder optionGroupName data))
  (when-some [data (lookup-entry config id :performance-insights-kms-key-id)]
    (. builder performanceInsightsKmsKeyId data))
  (when-some [data (lookup-entry config id :performance-insights-retention-period)]
    (. builder performanceInsightsRetentionPeriod data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :processor-features)]
    (. builder processorFeatures data))
  (when-some [data (lookup-entry config id :promotion-tier)]
    (. builder promotionTier data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :replica-mode)]
    (. builder replicaMode data))
  (when-some [data (lookup-entry config id :restore-time)]
    (. builder restoreTime data))
  (when-some [data (lookup-entry config id :source-db-cluster-identifier)]
    (. builder sourceDbClusterIdentifier data))
  (when-some [data (lookup-entry config id :source-db-instance-automated-backups-arn)]
    (. builder sourceDbInstanceAutomatedBackupsArn data))
  (when-some [data (lookup-entry config id :source-db-instance-identifier)]
    (. builder sourceDbInstanceIdentifier data))
  (when-some [data (lookup-entry config id :source-dbi-resource-id)]
    (. builder sourceDbiResourceId data))
  (when-some [data (lookup-entry config id :source-region)]
    (. builder sourceRegion data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-throughput)]
    (. builder storageThroughput data))
  (when-some [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tde-credential-arn)]
    (. builder tdeCredentialArn data))
  (when-some [data (lookup-entry config id :tde-credential-password)]
    (. builder tdeCredentialPassword data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (when-some [data (lookup-entry config id :use-default-processor-features)]
    (. builder useDefaultProcessorFeatures data))
  (when-some [data (lookup-entry config id :use-latest-restorable-time)]
    (. builder useLatestRestorableTime data))
  (when-some [data (lookup-entry config id :vpc-security-groups)]
    (. builder vpcSecurityGroups data))
  (.build builder))


(defn cfn-db-instance-builder
  "Creates a  `CfnDBInstance$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-instance-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-instance-builder> (CfnDBInstance$Builder/create scope (name id)) id config))


(defn cfn-db-instance-certificate-details-property-builder>
  "The cfn-db-instance-certificate-details-property-builder> function updates a CfnDBInstance$CertificateDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnDBInstance$CertificateDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-identifier` |
| `validTill` | java.lang.String | [[cdk.support/lookup-entry]] | `:valid-till` |
"
  [^CfnDBInstance$CertificateDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ca-identifier)]
    (. builder caIdentifier data))
  (when-some [data (lookup-entry config id :valid-till)]
    (. builder validTill data))
  (.build builder))


(defn cfn-db-instance-certificate-details-property-builder
  "Creates a  `CfnDBInstance$CertificateDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-instance-certificate-details-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-instance-certificate-details-property-builder> (new CfnDBInstance$CertificateDetailsProperty$Builder) id config))


(defn cfn-db-instance-db-instance-role-property-builder>
  "The cfn-db-instance-db-instance-role-property-builder> function updates a CfnDBInstance$DBInstanceRoleProperty$Builder instance using the provided configuration.
  The function takes the CfnDBInstance$DBInstanceRoleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDBInstance$DBInstanceRoleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :feature-name)]
    (. builder featureName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-db-instance-db-instance-role-property-builder
  "Creates a  `CfnDBInstance$DBInstanceRoleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-instance-db-instance-role-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-instance-db-instance-role-property-builder> (new CfnDBInstance$DBInstanceRoleProperty$Builder) id config))


(defn cfn-db-instance-endpoint-property-builder>
  "The cfn-db-instance-endpoint-property-builder> function updates a CfnDBInstance$EndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnDBInstance$EndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
"
  [^CfnDBInstance$EndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :address)]
    (. builder address data))
  (when-some [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cfn-db-instance-endpoint-property-builder
  "Creates a  `CfnDBInstance$EndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-instance-endpoint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-instance-endpoint-property-builder> (new CfnDBInstance$EndpointProperty$Builder) id config))


(defn cfn-db-instance-master-user-secret-property-builder>
  "The cfn-db-instance-master-user-secret-property-builder> function updates a CfnDBInstance$MasterUserSecretProperty$Builder instance using the provided configuration.
  The function takes the CfnDBInstance$MasterUserSecretProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
"
  [^CfnDBInstance$MasterUserSecretProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (.build builder))


(defn cfn-db-instance-master-user-secret-property-builder
  "Creates a  `CfnDBInstance$MasterUserSecretProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-instance-master-user-secret-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-instance-master-user-secret-property-builder> (new CfnDBInstance$MasterUserSecretProperty$Builder) id config))


(defn cfn-db-instance-processor-feature-property-builder>
  "The cfn-db-instance-processor-feature-property-builder> function updates a CfnDBInstance$ProcessorFeatureProperty$Builder instance using the provided configuration.
  The function takes the CfnDBInstance$ProcessorFeatureProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDBInstance$ProcessorFeatureProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-db-instance-processor-feature-property-builder
  "Creates a  `CfnDBInstance$ProcessorFeatureProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-instance-processor-feature-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-instance-processor-feature-property-builder> (new CfnDBInstance$ProcessorFeatureProperty$Builder) id config))


(defn cfn-db-instance-props-builder>
  "The cfn-db-instance-props-builder> function updates a CfnDBInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnDBInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.String | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `allowMajorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `associatedRoles` | java.util.List | [[cdk.support/lookup-entry]] | `:associated-roles` |
| `autoMinorVersionUpgrade` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `automaticBackupReplicationKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:automatic-backup-replication-kms-key-id` |
| `automaticBackupReplicationRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:automatic-backup-replication-region` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backup-retention-period` |
| `caCertificateIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-identifier` |
| `certificateDetails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate-details` |
| `certificateRotationRestart` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate-rotation-restart` |
| `characterSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:character-set-name` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `customIamInstanceProfile` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-iam-instance-profile` |
| `dbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-identifier` |
| `dbClusterSnapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-snapshot-identifier` |
| `dbInstanceClass` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-class` |
| `dbInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-instance-identifier` |
| `dbName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-name` |
| `dbParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-parameter-group-name` |
| `dbSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:db-security-groups` |
| `dbSnapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-snapshot-identifier` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `dedicatedLogVolume` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dedicated-log-volume` |
| `deleteAutomatedBackups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-automated-backups` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainAuthSecretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-auth-secret-arn` |
| `domainDnsIps` | java.util.List | [[cdk.support/lookup-entry]] | `:domain-dns-ips` |
| `domainFqdn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-fqdn` |
| `domainIamRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-iam-role-name` |
| `domainOu` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-ou` |
| `enableCloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:enable-cloudwatch-logs-exports` |
| `enableIamDatabaseAuthentication` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-iam-database-authentication` |
| `enablePerformanceInsights` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `endpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:endpoint` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `licenseModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:license-model` |
| `manageMasterUserPassword` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:manage-master-user-password` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |
| `masterUserSecret` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:master-user-secret` |
| `masterUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-username` |
| `maxAllocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allocated-storage` |
| `monitoringInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitoring-role-arn` |
| `multiAz` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-az` |
| `ncharCharacterSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:nchar-character-set-name` |
| `networkType` | java.lang.String | [[cdk.support/lookup-entry]] | `:network-type` |
| `optionGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-group-name` |
| `performanceInsightsKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:performance-insights-kms-key-id` |
| `performanceInsightsRetentionPeriod` | java.lang.Number | [[cdk.support/lookup-entry]] | `:performance-insights-retention-period` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `processorFeatures` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:processor-features` |
| `promotionTier` | java.lang.Number | [[cdk.support/lookup-entry]] | `:promotion-tier` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `replicaMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:replica-mode` |
| `restoreTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-time` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `sourceDbInstanceAutomatedBackupsArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-instance-automated-backups-arn` |
| `sourceDbInstanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-instance-identifier` |
| `sourceDbiResourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-dbi-resource-id` |
| `sourceRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-region` |
| `storageEncrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-throughput` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tdeCredentialArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:tde-credential-arn` |
| `tdeCredentialPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:tde-credential-password` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
| `useDefaultProcessorFeatures` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-default-processor-features` |
| `useLatestRestorableTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-latest-restorable-time` |
| `vpcSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-groups` |
"
  [^CfnDBInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :associated-roles)]
    (. builder associatedRoles data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :automatic-backup-replication-kms-key-id)]
    (. builder automaticBackupReplicationKmsKeyId data))
  (when-some [data (lookup-entry config id :automatic-backup-replication-region)]
    (. builder automaticBackupReplicationRegion data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention-period)]
    (. builder backupRetentionPeriod data))
  (when-some [data (lookup-entry config id :ca-certificate-identifier)]
    (. builder caCertificateIdentifier data))
  (when-some [data (lookup-entry config id :certificate-details)]
    (. builder certificateDetails data))
  (when-some [data (lookup-entry config id :certificate-rotation-restart)]
    (. builder certificateRotationRestart data))
  (when-some [data (lookup-entry config id :character-set-name)]
    (. builder characterSetName data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :custom-iam-instance-profile)]
    (. builder customIamInstanceProfile data))
  (when-some [data (lookup-entry config id :db-cluster-identifier)]
    (. builder dbClusterIdentifier data))
  (when-some [data (lookup-entry config id :db-cluster-snapshot-identifier)]
    (. builder dbClusterSnapshotIdentifier data))
  (when-some [data (lookup-entry config id :db-instance-class)]
    (. builder dbInstanceClass data))
  (when-some [data (lookup-entry config id :db-instance-identifier)]
    (. builder dbInstanceIdentifier data))
  (when-some [data (lookup-entry config id :db-name)]
    (. builder dbName data))
  (when-some [data (lookup-entry config id :db-parameter-group-name)]
    (. builder dbParameterGroupName data))
  (when-some [data (lookup-entry config id :db-security-groups)]
    (. builder dbSecurityGroups data))
  (when-some [data (lookup-entry config id :db-snapshot-identifier)]
    (. builder dbSnapshotIdentifier data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :dedicated-log-volume)]
    (. builder dedicatedLogVolume data))
  (when-some [data (lookup-entry config id :delete-automated-backups)]
    (. builder deleteAutomatedBackups data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-auth-secret-arn)]
    (. builder domainAuthSecretArn data))
  (when-some [data (lookup-entry config id :domain-dns-ips)]
    (. builder domainDnsIps data))
  (when-some [data (lookup-entry config id :domain-fqdn)]
    (. builder domainFqdn data))
  (when-some [data (lookup-entry config id :domain-iam-role-name)]
    (. builder domainIamRoleName data))
  (when-some [data (lookup-entry config id :domain-ou)]
    (. builder domainOu data))
  (when-some [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
    (. builder enableCloudwatchLogsExports data))
  (when-some [data (lookup-entry config id :enable-iam-database-authentication)]
    (. builder enableIamDatabaseAuthentication data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :license-model)]
    (. builder licenseModel data))
  (when-some [data (lookup-entry config id :manage-master-user-password)]
    (. builder manageMasterUserPassword data))
  (when-some [data (lookup-entry config id :master-user-password)]
    (. builder masterUserPassword data))
  (when-some [data (lookup-entry config id :master-user-secret)]
    (. builder masterUserSecret data))
  (when-some [data (lookup-entry config id :master-username)]
    (. builder masterUsername data))
  (when-some [data (lookup-entry config id :max-allocated-storage)]
    (. builder maxAllocatedStorage data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role-arn)]
    (. builder monitoringRoleArn data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (lookup-entry config id :nchar-character-set-name)]
    (. builder ncharCharacterSetName data))
  (when-some [data (lookup-entry config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :option-group-name)]
    (. builder optionGroupName data))
  (when-some [data (lookup-entry config id :performance-insights-kms-key-id)]
    (. builder performanceInsightsKmsKeyId data))
  (when-some [data (lookup-entry config id :performance-insights-retention-period)]
    (. builder performanceInsightsRetentionPeriod data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :processor-features)]
    (. builder processorFeatures data))
  (when-some [data (lookup-entry config id :promotion-tier)]
    (. builder promotionTier data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :replica-mode)]
    (. builder replicaMode data))
  (when-some [data (lookup-entry config id :restore-time)]
    (. builder restoreTime data))
  (when-some [data (lookup-entry config id :source-db-cluster-identifier)]
    (. builder sourceDbClusterIdentifier data))
  (when-some [data (lookup-entry config id :source-db-instance-automated-backups-arn)]
    (. builder sourceDbInstanceAutomatedBackupsArn data))
  (when-some [data (lookup-entry config id :source-db-instance-identifier)]
    (. builder sourceDbInstanceIdentifier data))
  (when-some [data (lookup-entry config id :source-dbi-resource-id)]
    (. builder sourceDbiResourceId data))
  (when-some [data (lookup-entry config id :source-region)]
    (. builder sourceRegion data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-throughput)]
    (. builder storageThroughput data))
  (when-some [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tde-credential-arn)]
    (. builder tdeCredentialArn data))
  (when-some [data (lookup-entry config id :tde-credential-password)]
    (. builder tdeCredentialPassword data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (when-some [data (lookup-entry config id :use-default-processor-features)]
    (. builder useDefaultProcessorFeatures data))
  (when-some [data (lookup-entry config id :use-latest-restorable-time)]
    (. builder useLatestRestorableTime data))
  (when-some [data (lookup-entry config id :vpc-security-groups)]
    (. builder vpcSecurityGroups data))
  (.build builder))


(defn cfn-db-instance-props-builder
  "Creates a  `CfnDBInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-instance-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-instance-props-builder> (new CfnDBInstanceProps$Builder) id config))


(defn cfn-db-parameter-group-builder>
  "The cfn-db-parameter-group-builder> function updates a CfnDBParameterGroup$Builder instance using the provided configuration.
  The function takes the CfnDBParameterGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBParameterGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :db-parameter-group-name)]
    (. builder dbParameterGroupName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-parameter-group-builder
  "Creates a  `CfnDBParameterGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-parameter-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-parameter-group-builder> (CfnDBParameterGroup$Builder/create scope (name id)) id config))


(defn cfn-db-parameter-group-props-builder>
  "The cfn-db-parameter-group-props-builder> function updates a CfnDBParameterGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDBParameterGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBParameterGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :db-parameter-group-name)]
    (. builder dbParameterGroupName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-parameter-group-props-builder
  "Creates a  `CfnDBParameterGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-parameter-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-parameter-group-props-builder> (new CfnDBParameterGroupProps$Builder) id config))


(defn cfn-db-proxy-auth-format-property-builder>
  "The cfn-db-proxy-auth-format-property-builder> function updates a CfnDBProxy$AuthFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnDBProxy$AuthFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authScheme` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-scheme` |
| `clientPasswordAuthType` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-password-auth-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `iamAuth` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-auth` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |
"
  [^CfnDBProxy$AuthFormatProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auth-scheme)]
    (. builder authScheme data))
  (when-some [data (lookup-entry config id :client-password-auth-type)]
    (. builder clientPasswordAuthType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :iam-auth)]
    (. builder iamAuth data))
  (when-some [data (lookup-entry config id :secret-arn)]
    (. builder secretArn data))
  (.build builder))


(defn cfn-db-proxy-auth-format-property-builder
  "Creates a  `CfnDBProxy$AuthFormatProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-proxy-auth-format-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-proxy-auth-format-property-builder> (new CfnDBProxy$AuthFormatProperty$Builder) id config))


(defn cfn-db-proxy-builder>
  "The cfn-db-proxy-builder> function updates a CfnDBProxy$Builder instance using the provided configuration.
  The function takes the CfnDBProxy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `debugLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:debug-logging` |
| `engineFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-family` |
| `idleClientTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-client-timeout` |
| `requireTls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-tls` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |
"
  [^CfnDBProxy$Builder builder id config]
  (when-some [data (lookup-entry config id :auth)]
    (. builder auth data))
  (when-some [data (lookup-entry config id :db-proxy-name)]
    (. builder dbProxyName data))
  (when-some [data (lookup-entry config id :debug-logging)]
    (. builder debugLogging data))
  (when-some [data (lookup-entry config id :engine-family)]
    (. builder engineFamily data))
  (when-some [data (lookup-entry config id :idle-client-timeout)]
    (. builder idleClientTimeout data))
  (when-some [data (lookup-entry config id :require-tls)]
    (. builder requireTls data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (when-some [data (lookup-entry config id :vpc-subnet-ids)]
    (. builder vpcSubnetIds data))
  (.build builder))


(defn cfn-db-proxy-builder
  "Creates a  `CfnDBProxy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-proxy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-proxy-builder> (CfnDBProxy$Builder/create scope (name id)) id config))


(defn cfn-db-proxy-endpoint-builder>
  "The cfn-db-proxy-endpoint-builder> function updates a CfnDBProxyEndpoint$Builder instance using the provided configuration.
  The function takes the CfnDBProxyEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbProxyEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-endpoint-name` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-role` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |
"
  [^CfnDBProxyEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :db-proxy-endpoint-name)]
    (. builder dbProxyEndpointName data))
  (when-some [data (lookup-entry config id :db-proxy-name)]
    (. builder dbProxyName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-role)]
    (. builder targetRole data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (when-some [data (lookup-entry config id :vpc-subnet-ids)]
    (. builder vpcSubnetIds data))
  (.build builder))


(defn cfn-db-proxy-endpoint-builder
  "Creates a  `CfnDBProxyEndpoint$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-proxy-endpoint-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-proxy-endpoint-builder> (CfnDBProxyEndpoint$Builder/create scope (name id)) id config))


(defn cfn-db-proxy-endpoint-props-builder>
  "The cfn-db-proxy-endpoint-props-builder> function updates a CfnDBProxyEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnDBProxyEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbProxyEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-endpoint-name` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-role` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |
"
  [^CfnDBProxyEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :db-proxy-endpoint-name)]
    (. builder dbProxyEndpointName data))
  (when-some [data (lookup-entry config id :db-proxy-name)]
    (. builder dbProxyName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-role)]
    (. builder targetRole data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (when-some [data (lookup-entry config id :vpc-subnet-ids)]
    (. builder vpcSubnetIds data))
  (.build builder))


(defn cfn-db-proxy-endpoint-props-builder
  "Creates a  `CfnDBProxyEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-proxy-endpoint-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-proxy-endpoint-props-builder> (new CfnDBProxyEndpointProps$Builder) id config))


(defn cfn-db-proxy-endpoint-tag-format-property-builder>
  "The cfn-db-proxy-endpoint-tag-format-property-builder> function updates a CfnDBProxyEndpoint$TagFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnDBProxyEndpoint$TagFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDBProxyEndpoint$TagFormatProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-db-proxy-endpoint-tag-format-property-builder
  "Creates a  `CfnDBProxyEndpoint$TagFormatProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-proxy-endpoint-tag-format-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-proxy-endpoint-tag-format-property-builder> (new CfnDBProxyEndpoint$TagFormatProperty$Builder) id config))


(defn cfn-db-proxy-props-builder>
  "The cfn-db-proxy-props-builder> function updates a CfnDBProxyProps$Builder instance using the provided configuration.
  The function takes the CfnDBProxyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auth` | java.util.List | [[cdk.support/lookup-entry]] | `:auth` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `debugLogging` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:debug-logging` |
| `engineFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-family` |
| `idleClientTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-client-timeout` |
| `requireTls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-tls` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |
"
  [^CfnDBProxyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auth)]
    (. builder auth data))
  (when-some [data (lookup-entry config id :db-proxy-name)]
    (. builder dbProxyName data))
  (when-some [data (lookup-entry config id :debug-logging)]
    (. builder debugLogging data))
  (when-some [data (lookup-entry config id :engine-family)]
    (. builder engineFamily data))
  (when-some [data (lookup-entry config id :idle-client-timeout)]
    (. builder idleClientTimeout data))
  (when-some [data (lookup-entry config id :require-tls)]
    (. builder requireTls data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (when-some [data (lookup-entry config id :vpc-subnet-ids)]
    (. builder vpcSubnetIds data))
  (.build builder))


(defn cfn-db-proxy-props-builder
  "Creates a  `CfnDBProxyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-proxy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-proxy-props-builder> (new CfnDBProxyProps$Builder) id config))


(defn cfn-db-proxy-tag-format-property-builder>
  "The cfn-db-proxy-tag-format-property-builder> function updates a CfnDBProxy$TagFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnDBProxy$TagFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnDBProxy$TagFormatProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-db-proxy-tag-format-property-builder
  "Creates a  `CfnDBProxy$TagFormatProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-proxy-tag-format-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-proxy-tag-format-property-builder> (new CfnDBProxy$TagFormatProperty$Builder) id config))


(defn cfn-db-proxy-target-group-builder>
  "The cfn-db-proxy-target-group-builder> function updates a CfnDBProxyTargetGroup$Builder instance using the provided configuration.
  The function takes the CfnDBProxyTargetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPoolConfigurationInfo` | software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty | [[cdk.support/lookup-entry]] | `:connection-pool-configuration-info` |
| `dbClusterIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:db-cluster-identifiers` |
| `dbInstanceIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:db-instance-identifiers` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |
"
  [^CfnDBProxyTargetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-pool-configuration-info)]
    (. builder connectionPoolConfigurationInfo data))
  (when-some [data (lookup-entry config id :db-cluster-identifiers)]
    (. builder dbClusterIdentifiers data))
  (when-some [data (lookup-entry config id :db-instance-identifiers)]
    (. builder dbInstanceIdentifiers data))
  (when-some [data (lookup-entry config id :db-proxy-name)]
    (. builder dbProxyName data))
  (when-some [data (lookup-entry config id :target-group-name)]
    (. builder targetGroupName data))
  (.build builder))


(defn cfn-db-proxy-target-group-builder
  "Creates a  `CfnDBProxyTargetGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-proxy-target-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-proxy-target-group-builder> (CfnDBProxyTargetGroup$Builder/create scope (name id)) id config))


(defn cfn-db-proxy-target-group-connection-pool-configuration-info-format-property-builder>
  "The cfn-db-proxy-target-group-connection-pool-configuration-info-format-property-builder> function updates a CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty$Builder instance using the provided configuration.
  The function takes the CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionBorrowTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-borrow-timeout` |
| `initQuery` | java.lang.String | [[cdk.support/lookup-entry]] | `:init-query` |
| `maxConnectionsPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections-percent` |
| `maxIdleConnectionsPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-idle-connections-percent` |
| `sessionPinningFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:session-pinning-filters` |
"
  [^CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-borrow-timeout)]
    (. builder connectionBorrowTimeout data))
  (when-some [data (lookup-entry config id :init-query)]
    (. builder initQuery data))
  (when-some [data (lookup-entry config id :max-connections-percent)]
    (. builder maxConnectionsPercent data))
  (when-some [data (lookup-entry config id :max-idle-connections-percent)]
    (. builder maxIdleConnectionsPercent data))
  (when-some [data (lookup-entry config id :session-pinning-filters)]
    (. builder sessionPinningFilters data))
  (.build builder))


(defn cfn-db-proxy-target-group-connection-pool-configuration-info-format-property-builder
  "Creates a  `CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-proxy-target-group-connection-pool-configuration-info-format-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-proxy-target-group-connection-pool-configuration-info-format-property-builder> (new CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty$Builder) id config))


(defn cfn-db-proxy-target-group-props-builder>
  "The cfn-db-proxy-target-group-props-builder> function updates a CfnDBProxyTargetGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDBProxyTargetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPoolConfigurationInfo` | software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty | [[cdk.support/lookup-entry]] | `:connection-pool-configuration-info` |
| `dbClusterIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:db-cluster-identifiers` |
| `dbInstanceIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:db-instance-identifiers` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |
"
  [^CfnDBProxyTargetGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :connection-pool-configuration-info)]
    (. builder connectionPoolConfigurationInfo data))
  (when-some [data (lookup-entry config id :db-cluster-identifiers)]
    (. builder dbClusterIdentifiers data))
  (when-some [data (lookup-entry config id :db-instance-identifiers)]
    (. builder dbInstanceIdentifiers data))
  (when-some [data (lookup-entry config id :db-proxy-name)]
    (. builder dbProxyName data))
  (when-some [data (lookup-entry config id :target-group-name)]
    (. builder targetGroupName data))
  (.build builder))


(defn cfn-db-proxy-target-group-props-builder
  "Creates a  `CfnDBProxyTargetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-proxy-target-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-proxy-target-group-props-builder> (new CfnDBProxyTargetGroupProps$Builder) id config))


(defn cfn-db-security-group-builder>
  "The cfn-db-security-group-builder> function updates a CfnDBSecurityGroup$Builder instance using the provided configuration.
  The function takes the CfnDBSecurityGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSecurityGroupIngress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:db-security-group-ingress` |
| `ec2VpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-vpc-id` |
| `groupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBSecurityGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :db-security-group-ingress)]
    (. builder dbSecurityGroupIngress data))
  (when-some [data (lookup-entry config id :ec2-vpc-id)]
    (. builder ec2VpcId data))
  (when-some [data (lookup-entry config id :group-description)]
    (. builder groupDescription data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-security-group-builder
  "Creates a  `CfnDBSecurityGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-security-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-security-group-builder> (CfnDBSecurityGroup$Builder/create scope (name id)) id config))


(defn cfn-db-security-group-ingress-builder>
  "The cfn-db-security-group-ingress-builder> function updates a CfnDBSecurityGroupIngress$Builder instance using the provided configuration.
  The function takes the CfnDBSecurityGroupIngress$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrip` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidrip` |
| `dbSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-security-group-name` |
| `ec2SecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-id` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |
"
  [^CfnDBSecurityGroupIngress$Builder builder id config]
  (when-some [data (lookup-entry config id :cidrip)]
    (. builder cidrip data))
  (when-some [data (lookup-entry config id :db-security-group-name)]
    (. builder dbSecurityGroupName data))
  (when-some [data (lookup-entry config id :ec2-security-group-id)]
    (. builder ec2SecurityGroupId data))
  (when-some [data (lookup-entry config id :ec2-security-group-name)]
    (. builder ec2SecurityGroupName data))
  (when-some [data (lookup-entry config id :ec2-security-group-owner-id)]
    (. builder ec2SecurityGroupOwnerId data))
  (.build builder))


(defn cfn-db-security-group-ingress-builder
  "Creates a  `CfnDBSecurityGroupIngress$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-security-group-ingress-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-security-group-ingress-builder> (CfnDBSecurityGroupIngress$Builder/create scope (name id)) id config))


(defn cfn-db-security-group-ingress-property-builder>
  "The cfn-db-security-group-ingress-property-builder> function updates a CfnDBSecurityGroup$IngressProperty$Builder instance using the provided configuration.
  The function takes the CfnDBSecurityGroup$IngressProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrip` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidrip` |
| `ec2SecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-id` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |
"
  [^CfnDBSecurityGroup$IngressProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cidrip)]
    (. builder cidrip data))
  (when-some [data (lookup-entry config id :ec2-security-group-id)]
    (. builder ec2SecurityGroupId data))
  (when-some [data (lookup-entry config id :ec2-security-group-name)]
    (. builder ec2SecurityGroupName data))
  (when-some [data (lookup-entry config id :ec2-security-group-owner-id)]
    (. builder ec2SecurityGroupOwnerId data))
  (.build builder))


(defn cfn-db-security-group-ingress-property-builder
  "Creates a  `CfnDBSecurityGroup$IngressProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-security-group-ingress-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-security-group-ingress-property-builder> (new CfnDBSecurityGroup$IngressProperty$Builder) id config))


(defn cfn-db-security-group-ingress-props-builder>
  "The cfn-db-security-group-ingress-props-builder> function updates a CfnDBSecurityGroupIngressProps$Builder instance using the provided configuration.
  The function takes the CfnDBSecurityGroupIngressProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrip` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidrip` |
| `dbSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-security-group-name` |
| `ec2SecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-id` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |
"
  [^CfnDBSecurityGroupIngressProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cidrip)]
    (. builder cidrip data))
  (when-some [data (lookup-entry config id :db-security-group-name)]
    (. builder dbSecurityGroupName data))
  (when-some [data (lookup-entry config id :ec2-security-group-id)]
    (. builder ec2SecurityGroupId data))
  (when-some [data (lookup-entry config id :ec2-security-group-name)]
    (. builder ec2SecurityGroupName data))
  (when-some [data (lookup-entry config id :ec2-security-group-owner-id)]
    (. builder ec2SecurityGroupOwnerId data))
  (.build builder))


(defn cfn-db-security-group-ingress-props-builder
  "Creates a  `CfnDBSecurityGroupIngressProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-security-group-ingress-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-security-group-ingress-props-builder> (new CfnDBSecurityGroupIngressProps$Builder) id config))


(defn cfn-db-security-group-props-builder>
  "The cfn-db-security-group-props-builder> function updates a CfnDBSecurityGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDBSecurityGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSecurityGroupIngress` | java.util.List | [[cdk.support/lookup-entry]] | `:db-security-group-ingress` |
| `ec2VpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-vpc-id` |
| `groupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBSecurityGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :db-security-group-ingress)]
    (. builder dbSecurityGroupIngress data))
  (when-some [data (lookup-entry config id :ec2-vpc-id)]
    (. builder ec2VpcId data))
  (when-some [data (lookup-entry config id :group-description)]
    (. builder groupDescription data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-security-group-props-builder
  "Creates a  `CfnDBSecurityGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-security-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-security-group-props-builder> (new CfnDBSecurityGroupProps$Builder) id config))


(defn cfn-db-subnet-group-builder>
  "The cfn-db-subnet-group-builder> function updates a CfnDBSubnetGroup$Builder instance using the provided configuration.
  The function takes the CfnDBSubnetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSubnetGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-description` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBSubnetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :db-subnet-group-description)]
    (. builder dbSubnetGroupDescription data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-subnet-group-builder
  "Creates a  `CfnDBSubnetGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-db-subnet-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-db-subnet-group-builder> (CfnDBSubnetGroup$Builder/create scope (name id)) id config))


(defn cfn-db-subnet-group-props-builder>
  "The cfn-db-subnet-group-props-builder> function updates a CfnDBSubnetGroupProps$Builder instance using the provided configuration.
  The function takes the CfnDBSubnetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSubnetGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-description` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDBSubnetGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :db-subnet-group-description)]
    (. builder dbSubnetGroupDescription data))
  (when-some [data (lookup-entry config id :db-subnet-group-name)]
    (. builder dbSubnetGroupName data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-db-subnet-group-props-builder
  "Creates a  `CfnDBSubnetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-db-subnet-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-db-subnet-group-props-builder> (new CfnDBSubnetGroupProps$Builder) id config))


(defn cfn-event-subscription-builder>
  "The cfn-event-subscription-builder> function updates a CfnEventSubscription$Builder instance using the provided configuration.
  The function takes the CfnEventSubscription$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
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


(defn cfn-global-cluster-builder>
  "The cfn-global-cluster-builder> function updates a CfnGlobalCluster$Builder instance using the provided configuration.
  The function takes the CfnGlobalCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `globalClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-cluster-identifier` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
"
  [^CfnGlobalCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :global-cluster-identifier)]
    (. builder globalClusterIdentifier data))
  (when-some [data (lookup-entry config id :source-db-cluster-identifier)]
    (. builder sourceDbClusterIdentifier data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (.build builder))


(defn cfn-global-cluster-builder
  "Creates a  `CfnGlobalCluster$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-global-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-global-cluster-builder> (CfnGlobalCluster$Builder/create scope (name id)) id config))


(defn cfn-global-cluster-props-builder>
  "The cfn-global-cluster-props-builder> function updates a CfnGlobalClusterProps$Builder instance using the provided configuration.
  The function takes the CfnGlobalClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `globalClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-cluster-identifier` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `storageEncrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
"
  [^CfnGlobalClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :engine-version)]
    (. builder engineVersion data))
  (when-some [data (lookup-entry config id :global-cluster-identifier)]
    (. builder globalClusterIdentifier data))
  (when-some [data (lookup-entry config id :source-db-cluster-identifier)]
    (. builder sourceDbClusterIdentifier data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (.build builder))


(defn cfn-global-cluster-props-builder
  "Creates a  `CfnGlobalClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-global-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-global-cluster-props-builder> (new CfnGlobalClusterProps$Builder) id config))


(defn cfn-integration-builder>
  "The cfn-integration-builder> function updates a CfnIntegration$Builder instance using the provided configuration.
  The function takes the CfnIntegration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `dataFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-filter` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `integrationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnIntegration$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-encryption-context)]
    (. builder additionalEncryptionContext data))
  (when-some [data (lookup-entry config id :data-filter)]
    (. builder dataFilter data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :integration-name)]
    (. builder integrationName data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-integration-builder
  "Creates a  `CfnIntegration$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-integration-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-integration-builder> (CfnIntegration$Builder/create scope (name id)) id config))


(defn cfn-integration-props-builder>
  "The cfn-integration-props-builder> function updates a CfnIntegrationProps$Builder instance using the provided configuration.
  The function takes the CfnIntegrationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `dataFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-filter` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `integrationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnIntegrationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-encryption-context)]
    (. builder additionalEncryptionContext data))
  (when-some [data (lookup-entry config id :data-filter)]
    (. builder dataFilter data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :integration-name)]
    (. builder integrationName data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-integration-props-builder
  "Creates a  `CfnIntegrationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-integration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-integration-props-builder> (new CfnIntegrationProps$Builder) id config))


(defn cfn-option-group-builder>
  "The cfn-option-group-builder> function updates a CfnOptionGroup$Builder instance using the provided configuration.
  The function takes the CfnOptionGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-name` |
| `majorEngineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-engine-version` |
| `optionConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:option-configurations` |
| `optionGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-group-description` |
| `optionGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnOptionGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :engine-name)]
    (. builder engineName data))
  (when-some [data (lookup-entry config id :major-engine-version)]
    (. builder majorEngineVersion data))
  (when-some [data (lookup-entry config id :option-configurations)]
    (. builder optionConfigurations data))
  (when-some [data (lookup-entry config id :option-group-description)]
    (. builder optionGroupDescription data))
  (when-some [data (lookup-entry config id :option-group-name)]
    (. builder optionGroupName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-option-group-builder
  "Creates a  `CfnOptionGroup$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-option-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-option-group-builder> (CfnOptionGroup$Builder/create scope (name id)) id config))


(defn cfn-option-group-option-configuration-property-builder>
  "The cfn-option-group-option-configuration-property-builder> function updates a CfnOptionGroup$OptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnOptionGroup$OptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSecurityGroupMemberships` | java.util.List | [[cdk.support/lookup-entry]] | `:db-security-group-memberships` |
| `optionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-name` |
| `optionSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:option-settings` |
| `optionVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-version` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `vpcSecurityGroupMemberships` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-memberships` |
"
  [^CfnOptionGroup$OptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :db-security-group-memberships)]
    (. builder dbSecurityGroupMemberships data))
  (when-some [data (lookup-entry config id :option-name)]
    (. builder optionName data))
  (when-some [data (lookup-entry config id :option-settings)]
    (. builder optionSettings data))
  (when-some [data (lookup-entry config id :option-version)]
    (. builder optionVersion data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :vpc-security-group-memberships)]
    (. builder vpcSecurityGroupMemberships data))
  (.build builder))


(defn cfn-option-group-option-configuration-property-builder
  "Creates a  `CfnOptionGroup$OptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-option-group-option-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-option-group-option-configuration-property-builder> (new CfnOptionGroup$OptionConfigurationProperty$Builder) id config))


(defn cfn-option-group-option-setting-property-builder>
  "The cfn-option-group-option-setting-property-builder> function updates a CfnOptionGroup$OptionSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnOptionGroup$OptionSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnOptionGroup$OptionSettingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-option-group-option-setting-property-builder
  "Creates a  `CfnOptionGroup$OptionSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-option-group-option-setting-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-option-group-option-setting-property-builder> (new CfnOptionGroup$OptionSettingProperty$Builder) id config))


(defn cfn-option-group-props-builder>
  "The cfn-option-group-props-builder> function updates a CfnOptionGroupProps$Builder instance using the provided configuration.
  The function takes the CfnOptionGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-name` |
| `majorEngineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-engine-version` |
| `optionConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:option-configurations` |
| `optionGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-group-description` |
| `optionGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnOptionGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :engine-name)]
    (. builder engineName data))
  (when-some [data (lookup-entry config id :major-engine-version)]
    (. builder majorEngineVersion data))
  (when-some [data (lookup-entry config id :option-configurations)]
    (. builder optionConfigurations data))
  (when-some [data (lookup-entry config id :option-group-description)]
    (. builder optionGroupDescription data))
  (when-some [data (lookup-entry config id :option-group-name)]
    (. builder optionGroupName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-option-group-props-builder
  "Creates a  `CfnOptionGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-option-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-option-group-props-builder> (new CfnOptionGroupProps$Builder) id config))


(defn cluster-engine-bind-options-builder>
  "The cluster-engine-bind-options-builder> function updates a ClusterEngineBindOptions$Builder instance using the provided configuration.
  The function takes the ClusterEngineBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
"
  [^ClusterEngineBindOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (.build builder))


(defn cluster-engine-bind-options-builder
  "Creates a  `ClusterEngineBindOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[cluster-engine-bind-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cluster-engine-bind-options-builder> (new ClusterEngineBindOptions$Builder) id config))


(defn cluster-engine-config-builder>
  "The cluster-engine-config-builder> function updates a ClusterEngineConfig$Builder instance using the provided configuration.
  The function takes the ClusterEngineConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `features` | software.amazon.awscdk.services.rds.ClusterEngineFeatures | [[cdk.support/lookup-entry]] | `:features` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^ClusterEngineConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :features)]
    (. builder features data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn cluster-engine-config-builder
  "Creates a  `ClusterEngineConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[cluster-engine-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cluster-engine-config-builder> (new ClusterEngineConfig$Builder) id config))


(defn cluster-engine-features-builder>
  "The cluster-engine-features-builder> function updates a ClusterEngineFeatures$Builder instance using the provided configuration.
  The function takes the ClusterEngineFeatures$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Export` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-export` |
| `s3Import` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-import` |
"
  [^ClusterEngineFeatures$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-export)]
    (. builder s3Export data))
  (when-some [data (lookup-entry config id :s3-import)]
    (. builder s3Import data))
  (.build builder))


(defn cluster-engine-features-builder
  "Creates a  `ClusterEngineFeatures$Builder` instance using a no-argument constructor, applies the data configuration using the [[cluster-engine-features-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cluster-engine-features-builder> (new ClusterEngineFeatures$Builder) id config))


(defn cluster-instance-bind-options-builder>
  "The cluster-instance-bind-options-builder> function updates a ClusterInstanceBindOptions$Builder instance using the provided configuration.
  The function takes the ClusterInstanceBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `promotionTier` | java.lang.Number | [[cdk.support/lookup-entry]] | `:promotion-tier` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
"
  [^ClusterInstanceBindOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (lookup-entry config id :promotion-tier)]
    (. builder promotionTier data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (.build builder))


(defn cluster-instance-bind-options-builder
  "Creates a  `ClusterInstanceBindOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[cluster-instance-bind-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cluster-instance-bind-options-builder> (new ClusterInstanceBindOptions$Builder) id config))


(defn cluster-instance-options-builder>
  "The cluster-instance-options-builder> function updates a ClusterInstanceOptions$Builder instance using the provided configuration.
  The function takes the ClusterInstanceOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `isFromLegacyInstanceProps` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-from-legacy-instance-props` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
"
  [^ClusterInstanceOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :is-from-legacy-instance-props)]
    (. builder isFromLegacyInstanceProps data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (.build builder))


(defn cluster-instance-options-builder
  "Creates a  `ClusterInstanceOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[cluster-instance-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cluster-instance-options-builder> (new ClusterInstanceOptions$Builder) id config))


(defn cluster-instance-props-builder>
  "The cluster-instance-props-builder> function updates a ClusterInstanceProps$Builder instance using the provided configuration.
  The function takes the ClusterInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `instanceType` | software.amazon.awscdk.services.rds.ClusterInstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `isFromLegacyInstanceProps` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-from-legacy-instance-props` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `promotionTier` | java.lang.Number | [[cdk.support/lookup-entry]] | `:promotion-tier` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
"
  [^ClusterInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :is-from-legacy-instance-props)]
    (. builder isFromLegacyInstanceProps data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :promotion-tier)]
    (. builder promotionTier data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (.build builder))


(defn cluster-instance-props-builder
  "Creates a  `ClusterInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cluster-instance-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cluster-instance-props-builder> (new ClusterInstanceProps$Builder) id config))


(defn common-rotation-user-options-builder>
  "The common-rotation-user-options-builder> function updates a CommonRotationUserOptions$Builder instance using the provided configuration.
  The function takes the CommonRotationUserOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `endpoint` | software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint | [[cdk.support/lookup-entry]] | `:endpoint` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^CommonRotationUserOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :automatically-after)]
    (. builder automaticallyAfter data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :rotate-immediately-on-update)]
    (. builder rotateImmediatelyOnUpdate data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn common-rotation-user-options-builder
  "Creates a  `CommonRotationUserOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[common-rotation-user-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (common-rotation-user-options-builder> (new CommonRotationUserOptions$Builder) id config))


(defn credentials-base-options-builder>
  "The credentials-base-options-builder> function updates a CredentialsBaseOptions$Builder instance using the provided configuration.
  The function takes the CredentialsBaseOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
"
  [^CredentialsBaseOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :replica-regions)]
    (. builder replicaRegions data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (.build builder))


(defn credentials-base-options-builder
  "Creates a  `CredentialsBaseOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[credentials-base-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (credentials-base-options-builder> (new CredentialsBaseOptions$Builder) id config))


(defn credentials-from-username-options-builder>
  "The credentials-from-username-options-builder> function updates a CredentialsFromUsernameOptions$Builder instance using the provided configuration.
  The function takes the CredentialsFromUsernameOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
"
  [^CredentialsFromUsernameOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :replica-regions)]
    (. builder replicaRegions data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (.build builder))


(defn credentials-from-username-options-builder
  "Creates a  `CredentialsFromUsernameOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[credentials-from-username-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (credentials-from-username-options-builder> (new CredentialsFromUsernameOptions$Builder) id config))


(defn database-cluster-attributes-builder>
  "The database-cluster-attributes-builder> function updates a DatabaseClusterAttributes$Builder instance using the provided configuration.
  The function takes the DatabaseClusterAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-endpoint-address` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `clusterResourceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-resource-identifier` |
| `engine` | software.amazon.awscdk.services.rds.IClusterEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `instanceEndpointAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-endpoint-addresses` |
| `instanceIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-identifiers` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `readerEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:reader-endpoint-address` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
"
  [^DatabaseClusterAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-endpoint-address)]
    (. builder clusterEndpointAddress data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :cluster-resource-identifier)]
    (. builder clusterResourceIdentifier data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :instance-endpoint-addresses)]
    (. builder instanceEndpointAddresses data))
  (when-some [data (lookup-entry config id :instance-identifiers)]
    (. builder instanceIdentifiers data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :reader-endpoint-address)]
    (. builder readerEndpointAddress data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (.build builder))


(defn database-cluster-attributes-builder
  "Creates a  `DatabaseClusterAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-cluster-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-cluster-attributes-builder> (new DatabaseClusterAttributes$Builder) id config))


(defn database-cluster-builder>
  "The database-cluster-builder> function updates a DatabaseCluster$Builder instance using the provided configuration.
  The function takes the DatabaseCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backtrackWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backtrack-window` |
| `backup` | software.amazon.awscdk.services.rds.BackupProps | [[cdk.support/lookup-entry]] | `:backup` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `defaultDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-database-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enableDataApi` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-data-api` |
| `engine` | software.amazon.awscdk.services.rds.IClusterEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifierBase` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier-base` |
| `instanceProps` | software.amazon.awscdk.services.rds.InstanceProps | [[cdk.support/lookup-entry]] | `:instance-props` |
| `instanceUpdateBehaviour` | software.amazon.awscdk.services.rds.InstanceUpdateBehaviour | [[cdk.api.services.rds/instance-update-behaviour]] | `:instance-update-behaviour` |
| `instances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instances` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serverlessV2MaxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serverless-v2-max-capacity` |
| `serverlessV2MinCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serverless-v2-min-capacity` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:storage-encryption-key` |
| `storageType` | software.amazon.awscdk.services.rds.DBClusterStorageType | [[cdk.api.services.rds/db-cluster-storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `writer` | software.amazon.awscdk.services.rds.IClusterInstance | [[cdk.support/lookup-entry]] | `:writer` |
"
  [^DatabaseCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :backtrack-window)]
    (. builder backtrackWindow data))
  (when-some [data (lookup-entry config id :backup)]
    (. builder backup data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :default-database-name)]
    (. builder defaultDatabaseName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-data-api)]
    (. builder enableDataApi data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier-base)]
    (. builder instanceIdentifierBase data))
  (when-some [data (lookup-entry config id :instance-props)]
    (. builder instanceProps data))
  (when-some [data (instance-update-behaviour config id :instance-update-behaviour)]
    (. builder instanceUpdateBehaviour data))
  (when-some [data (lookup-entry config id :instances)]
    (. builder instances data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :readers)]
    (. builder readers data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :serverless-v2-max-capacity)]
    (. builder serverlessV2MaxCapacity data))
  (when-some [data (lookup-entry config id :serverless-v2-min-capacity)]
    (. builder serverlessV2MinCapacity data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-encryption-key)]
    (. builder storageEncryptionKey data))
  (when-some [data (db-cluster-storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (when-some [data (lookup-entry config id :writer)]
    (. builder writer data))
  (.build builder))


(defn database-cluster-builder
  "Creates a  `DatabaseCluster$Builder` instance using a scope and ID, applies the data configuration using the [[database-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (database-cluster-builder> (DatabaseCluster$Builder/create scope (name id)) id config))


(defn database-cluster-from-snapshot-builder>
  "The database-cluster-from-snapshot-builder> function updates a DatabaseClusterFromSnapshot$Builder instance using the provided configuration.
  The function takes the DatabaseClusterFromSnapshot$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backtrackWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backtrack-window` |
| `backup` | software.amazon.awscdk.services.rds.BackupProps | [[cdk.support/lookup-entry]] | `:backup` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `defaultDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-database-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enableDataApi` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-data-api` |
| `engine` | software.amazon.awscdk.services.rds.IClusterEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifierBase` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier-base` |
| `instanceProps` | software.amazon.awscdk.services.rds.InstanceProps | [[cdk.support/lookup-entry]] | `:instance-props` |
| `instanceUpdateBehaviour` | software.amazon.awscdk.services.rds.InstanceUpdateBehaviour | [[cdk.api.services.rds/instance-update-behaviour]] | `:instance-update-behaviour` |
| `instances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instances` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serverlessV2MaxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serverless-v2-max-capacity` |
| `serverlessV2MinCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serverless-v2-min-capacity` |
| `snapshotCredentials` | software.amazon.awscdk.services.rds.SnapshotCredentials | [[cdk.support/lookup-entry]] | `:snapshot-credentials` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:storage-encryption-key` |
| `storageType` | software.amazon.awscdk.services.rds.DBClusterStorageType | [[cdk.api.services.rds/db-cluster-storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `writer` | software.amazon.awscdk.services.rds.IClusterInstance | [[cdk.support/lookup-entry]] | `:writer` |
"
  [^DatabaseClusterFromSnapshot$Builder builder id config]
  (when-some [data (lookup-entry config id :backtrack-window)]
    (. builder backtrackWindow data))
  (when-some [data (lookup-entry config id :backup)]
    (. builder backup data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :default-database-name)]
    (. builder defaultDatabaseName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-data-api)]
    (. builder enableDataApi data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier-base)]
    (. builder instanceIdentifierBase data))
  (when-some [data (lookup-entry config id :instance-props)]
    (. builder instanceProps data))
  (when-some [data (instance-update-behaviour config id :instance-update-behaviour)]
    (. builder instanceUpdateBehaviour data))
  (when-some [data (lookup-entry config id :instances)]
    (. builder instances data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :readers)]
    (. builder readers data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :serverless-v2-max-capacity)]
    (. builder serverlessV2MaxCapacity data))
  (when-some [data (lookup-entry config id :serverless-v2-min-capacity)]
    (. builder serverlessV2MinCapacity data))
  (when-some [data (lookup-entry config id :snapshot-credentials)]
    (. builder snapshotCredentials data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-encryption-key)]
    (. builder storageEncryptionKey data))
  (when-some [data (db-cluster-storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (when-some [data (lookup-entry config id :writer)]
    (. builder writer data))
  (.build builder))


(defn database-cluster-from-snapshot-builder
  "Creates a  `DatabaseClusterFromSnapshot$Builder` instance using a scope and ID, applies the data configuration using the [[database-cluster-from-snapshot-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (database-cluster-from-snapshot-builder> (DatabaseClusterFromSnapshot$Builder/create scope (name id)) id config))


(defn database-cluster-from-snapshot-props-builder>
  "The database-cluster-from-snapshot-props-builder> function updates a DatabaseClusterFromSnapshotProps$Builder instance using the provided configuration.
  The function takes the DatabaseClusterFromSnapshotProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backtrackWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backtrack-window` |
| `backup` | software.amazon.awscdk.services.rds.BackupProps | [[cdk.support/lookup-entry]] | `:backup` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `defaultDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-database-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enableDataApi` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-data-api` |
| `engine` | software.amazon.awscdk.services.rds.IClusterEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifierBase` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier-base` |
| `instanceProps` | software.amazon.awscdk.services.rds.InstanceProps | [[cdk.support/lookup-entry]] | `:instance-props` |
| `instanceUpdateBehaviour` | software.amazon.awscdk.services.rds.InstanceUpdateBehaviour | [[cdk.api.services.rds/instance-update-behaviour]] | `:instance-update-behaviour` |
| `instances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instances` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serverlessV2MaxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serverless-v2-max-capacity` |
| `serverlessV2MinCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serverless-v2-min-capacity` |
| `snapshotCredentials` | software.amazon.awscdk.services.rds.SnapshotCredentials | [[cdk.support/lookup-entry]] | `:snapshot-credentials` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:storage-encryption-key` |
| `storageType` | software.amazon.awscdk.services.rds.DBClusterStorageType | [[cdk.api.services.rds/db-cluster-storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `writer` | software.amazon.awscdk.services.rds.IClusterInstance | [[cdk.support/lookup-entry]] | `:writer` |
"
  [^DatabaseClusterFromSnapshotProps$Builder builder id config]
  (when-some [data (lookup-entry config id :backtrack-window)]
    (. builder backtrackWindow data))
  (when-some [data (lookup-entry config id :backup)]
    (. builder backup data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :default-database-name)]
    (. builder defaultDatabaseName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-data-api)]
    (. builder enableDataApi data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier-base)]
    (. builder instanceIdentifierBase data))
  (when-some [data (lookup-entry config id :instance-props)]
    (. builder instanceProps data))
  (when-some [data (instance-update-behaviour config id :instance-update-behaviour)]
    (. builder instanceUpdateBehaviour data))
  (when-some [data (lookup-entry config id :instances)]
    (. builder instances data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :readers)]
    (. builder readers data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :serverless-v2-max-capacity)]
    (. builder serverlessV2MaxCapacity data))
  (when-some [data (lookup-entry config id :serverless-v2-min-capacity)]
    (. builder serverlessV2MinCapacity data))
  (when-some [data (lookup-entry config id :snapshot-credentials)]
    (. builder snapshotCredentials data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-encryption-key)]
    (. builder storageEncryptionKey data))
  (when-some [data (db-cluster-storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (when-some [data (lookup-entry config id :writer)]
    (. builder writer data))
  (.build builder))


(defn database-cluster-from-snapshot-props-builder
  "Creates a  `DatabaseClusterFromSnapshotProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-cluster-from-snapshot-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-cluster-from-snapshot-props-builder> (new DatabaseClusterFromSnapshotProps$Builder) id config))


(defn database-cluster-props-builder>
  "The database-cluster-props-builder> function updates a DatabaseClusterProps$Builder instance using the provided configuration.
  The function takes the DatabaseClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backtrackWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backtrack-window` |
| `backup` | software.amazon.awscdk.services.rds.BackupProps | [[cdk.support/lookup-entry]] | `:backup` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `defaultDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-database-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enableDataApi` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-data-api` |
| `engine` | software.amazon.awscdk.services.rds.IClusterEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifierBase` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier-base` |
| `instanceProps` | software.amazon.awscdk.services.rds.InstanceProps | [[cdk.support/lookup-entry]] | `:instance-props` |
| `instanceUpdateBehaviour` | software.amazon.awscdk.services.rds.InstanceUpdateBehaviour | [[cdk.api.services.rds/instance-update-behaviour]] | `:instance-update-behaviour` |
| `instances` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instances` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `readers` | java.util.List | [[cdk.support/lookup-entry]] | `:readers` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serverlessV2MaxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serverless-v2-max-capacity` |
| `serverlessV2MinCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:serverless-v2-min-capacity` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:storage-encryption-key` |
| `storageType` | software.amazon.awscdk.services.rds.DBClusterStorageType | [[cdk.api.services.rds/db-cluster-storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `writer` | software.amazon.awscdk.services.rds.IClusterInstance | [[cdk.support/lookup-entry]] | `:writer` |
"
  [^DatabaseClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :backtrack-window)]
    (. builder backtrackWindow data))
  (when-some [data (lookup-entry config id :backup)]
    (. builder backup data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :default-database-name)]
    (. builder defaultDatabaseName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-data-api)]
    (. builder enableDataApi data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier-base)]
    (. builder instanceIdentifierBase data))
  (when-some [data (lookup-entry config id :instance-props)]
    (. builder instanceProps data))
  (when-some [data (instance-update-behaviour config id :instance-update-behaviour)]
    (. builder instanceUpdateBehaviour data))
  (when-some [data (lookup-entry config id :instances)]
    (. builder instances data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :readers)]
    (. builder readers data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :serverless-v2-max-capacity)]
    (. builder serverlessV2MaxCapacity data))
  (when-some [data (lookup-entry config id :serverless-v2-min-capacity)]
    (. builder serverlessV2MinCapacity data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-encryption-key)]
    (. builder storageEncryptionKey data))
  (when-some [data (db-cluster-storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (when-some [data (lookup-entry config id :writer)]
    (. builder writer data))
  (.build builder))


(defn database-cluster-props-builder
  "Creates a  `DatabaseClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-cluster-props-builder> (new DatabaseClusterProps$Builder) id config))


(defn database-instance-attributes-builder>
  "The database-instance-attributes-builder> function updates a DatabaseInstanceAttributes$Builder instance using the provided configuration.
  The function takes the DatabaseInstanceAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engine` | software.amazon.awscdk.services.rds.IInstanceEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `instanceEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-endpoint-address` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `instanceResourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-resource-id` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
"
  [^DatabaseInstanceAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :instance-endpoint-address)]
    (. builder instanceEndpointAddress data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :instance-resource-id)]
    (. builder instanceResourceId data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (.build builder))


(defn database-instance-attributes-builder
  "Creates a  `DatabaseInstanceAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-instance-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-instance-attributes-builder> (new DatabaseInstanceAttributes$Builder) id config))


(defn database-instance-builder>
  "The database-instance-builder> function updates a DatabaseInstance$Builder instance using the provided configuration.
  The function takes the DatabaseInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `characterSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:character-set-name` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `deleteAutomatedBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-automated-backups` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `engine` | software.amazon.awscdk.services.rds.IInstanceEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `licenseModel` | software.amazon.awscdk.services.rds.LicenseModel | [[cdk.api.services.rds/license-model]] | `:license-model` |
| `maxAllocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allocated-storage` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `multiAz` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `processorFeatures` | software.amazon.awscdk.services.rds.ProcessorFeatures | [[cdk.support/lookup-entry]] | `:processor-features` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:storage-encryption-key` |
| `storageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-throughput` |
| `storageType` | software.amazon.awscdk.services.rds.StorageType | [[cdk.api.services.rds/storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :character-set-name)]
    (. builder characterSetName data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :delete-automated-backups)]
    (. builder deleteAutomatedBackups data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (license-model config id :license-model)]
    (. builder licenseModel data))
  (when-some [data (lookup-entry config id :max-allocated-storage)]
    (. builder maxAllocatedStorage data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :option-group)]
    (. builder optionGroup data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :processor-features)]
    (. builder processorFeatures data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-encryption-key)]
    (. builder storageEncryptionKey data))
  (when-some [data (lookup-entry config id :storage-throughput)]
    (. builder storageThroughput data))
  (when-some [data (storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-instance-builder
  "Creates a  `DatabaseInstance$Builder` instance using a scope and ID, applies the data configuration using the [[database-instance-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (database-instance-builder> (DatabaseInstance$Builder/create scope (name id)) id config))


(defn database-instance-from-snapshot-builder>
  "The database-instance-from-snapshot-builder> function updates a DatabaseInstanceFromSnapshot$Builder instance using the provided configuration.
  The function takes the DatabaseInstanceFromSnapshot$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.SnapshotCredentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `deleteAutomatedBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-automated-backups` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `engine` | software.amazon.awscdk.services.rds.IInstanceEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `licenseModel` | software.amazon.awscdk.services.rds.LicenseModel | [[cdk.api.services.rds/license-model]] | `:license-model` |
| `maxAllocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allocated-storage` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `multiAz` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `processorFeatures` | software.amazon.awscdk.services.rds.ProcessorFeatures | [[cdk.support/lookup-entry]] | `:processor-features` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `storageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-throughput` |
| `storageType` | software.amazon.awscdk.services.rds.StorageType | [[cdk.api.services.rds/storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseInstanceFromSnapshot$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :delete-automated-backups)]
    (. builder deleteAutomatedBackups data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (license-model config id :license-model)]
    (. builder licenseModel data))
  (when-some [data (lookup-entry config id :max-allocated-storage)]
    (. builder maxAllocatedStorage data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :option-group)]
    (. builder optionGroup data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :processor-features)]
    (. builder processorFeatures data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :storage-throughput)]
    (. builder storageThroughput data))
  (when-some [data (storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-instance-from-snapshot-builder
  "Creates a  `DatabaseInstanceFromSnapshot$Builder` instance using a scope and ID, applies the data configuration using the [[database-instance-from-snapshot-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (database-instance-from-snapshot-builder> (DatabaseInstanceFromSnapshot$Builder/create scope (name id)) id config))


(defn database-instance-from-snapshot-props-builder>
  "The database-instance-from-snapshot-props-builder> function updates a DatabaseInstanceFromSnapshotProps$Builder instance using the provided configuration.
  The function takes the DatabaseInstanceFromSnapshotProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.SnapshotCredentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `deleteAutomatedBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-automated-backups` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `engine` | software.amazon.awscdk.services.rds.IInstanceEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `licenseModel` | software.amazon.awscdk.services.rds.LicenseModel | [[cdk.api.services.rds/license-model]] | `:license-model` |
| `maxAllocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allocated-storage` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `multiAz` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `processorFeatures` | software.amazon.awscdk.services.rds.ProcessorFeatures | [[cdk.support/lookup-entry]] | `:processor-features` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `storageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-throughput` |
| `storageType` | software.amazon.awscdk.services.rds.StorageType | [[cdk.api.services.rds/storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseInstanceFromSnapshotProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :delete-automated-backups)]
    (. builder deleteAutomatedBackups data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (license-model config id :license-model)]
    (. builder licenseModel data))
  (when-some [data (lookup-entry config id :max-allocated-storage)]
    (. builder maxAllocatedStorage data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :option-group)]
    (. builder optionGroup data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :processor-features)]
    (. builder processorFeatures data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :storage-throughput)]
    (. builder storageThroughput data))
  (when-some [data (storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-instance-from-snapshot-props-builder
  "Creates a  `DatabaseInstanceFromSnapshotProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-instance-from-snapshot-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-instance-from-snapshot-props-builder> (new DatabaseInstanceFromSnapshotProps$Builder) id config))


(defn database-instance-new-props-builder>
  "The database-instance-new-props-builder> function updates a DatabaseInstanceNewProps$Builder instance using the provided configuration.
  The function takes the DatabaseInstanceNewProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `deleteAutomatedBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-automated-backups` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `maxAllocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allocated-storage` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `multiAz` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `processorFeatures` | software.amazon.awscdk.services.rds.ProcessorFeatures | [[cdk.support/lookup-entry]] | `:processor-features` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `storageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-throughput` |
| `storageType` | software.amazon.awscdk.services.rds.StorageType | [[cdk.api.services.rds/storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseInstanceNewProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :delete-automated-backups)]
    (. builder deleteAutomatedBackups data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :max-allocated-storage)]
    (. builder maxAllocatedStorage data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :option-group)]
    (. builder optionGroup data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :processor-features)]
    (. builder processorFeatures data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :storage-throughput)]
    (. builder storageThroughput data))
  (when-some [data (storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-instance-new-props-builder
  "Creates a  `DatabaseInstanceNewProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-instance-new-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-instance-new-props-builder> (new DatabaseInstanceNewProps$Builder) id config))


(defn database-instance-props-builder>
  "The database-instance-props-builder> function updates a DatabaseInstanceProps$Builder instance using the provided configuration.
  The function takes the DatabaseInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `characterSetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:character-set-name` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `deleteAutomatedBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-automated-backups` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `engine` | software.amazon.awscdk.services.rds.IInstanceEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `licenseModel` | software.amazon.awscdk.services.rds.LicenseModel | [[cdk.api.services.rds/license-model]] | `:license-model` |
| `maxAllocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allocated-storage` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `multiAz` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `processorFeatures` | software.amazon.awscdk.services.rds.ProcessorFeatures | [[cdk.support/lookup-entry]] | `:processor-features` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:storage-encryption-key` |
| `storageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-throughput` |
| `storageType` | software.amazon.awscdk.services.rds.StorageType | [[cdk.api.services.rds/storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :character-set-name)]
    (. builder characterSetName data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :delete-automated-backups)]
    (. builder deleteAutomatedBackups data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (license-model config id :license-model)]
    (. builder licenseModel data))
  (when-some [data (lookup-entry config id :max-allocated-storage)]
    (. builder maxAllocatedStorage data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :option-group)]
    (. builder optionGroup data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :processor-features)]
    (. builder processorFeatures data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-encryption-key)]
    (. builder storageEncryptionKey data))
  (when-some [data (lookup-entry config id :storage-throughput)]
    (. builder storageThroughput data))
  (when-some [data (storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-instance-props-builder
  "Creates a  `DatabaseInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-instance-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-instance-props-builder> (new DatabaseInstanceProps$Builder) id config))


(defn database-instance-read-replica-builder>
  "The database-instance-read-replica-builder> function updates a DatabaseInstanceReadReplica$Builder instance using the provided configuration.
  The function takes the DatabaseInstanceReadReplica$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `deleteAutomatedBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-automated-backups` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `maxAllocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allocated-storage` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `multiAz` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `processorFeatures` | software.amazon.awscdk.services.rds.ProcessorFeatures | [[cdk.support/lookup-entry]] | `:processor-features` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `sourceDatabaseInstance` | software.amazon.awscdk.services.rds.IDatabaseInstance | [[cdk.support/lookup-entry]] | `:source-database-instance` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:storage-encryption-key` |
| `storageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-throughput` |
| `storageType` | software.amazon.awscdk.services.rds.StorageType | [[cdk.api.services.rds/storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseInstanceReadReplica$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :delete-automated-backups)]
    (. builder deleteAutomatedBackups data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :max-allocated-storage)]
    (. builder maxAllocatedStorage data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :option-group)]
    (. builder optionGroup data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :processor-features)]
    (. builder processorFeatures data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :source-database-instance)]
    (. builder sourceDatabaseInstance data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-encryption-key)]
    (. builder storageEncryptionKey data))
  (when-some [data (lookup-entry config id :storage-throughput)]
    (. builder storageThroughput data))
  (when-some [data (storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-instance-read-replica-builder
  "Creates a  `DatabaseInstanceReadReplica$Builder` instance using a scope and ID, applies the data configuration using the [[database-instance-read-replica-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (database-instance-read-replica-builder> (DatabaseInstanceReadReplica$Builder/create scope (name id)) id config))


(defn database-instance-read-replica-props-builder>
  "The database-instance-read-replica-props-builder> function updates a DatabaseInstanceReadReplicaProps$Builder instance using the provided configuration.
  The function takes the DatabaseInstanceReadReplicaProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `deleteAutomatedBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-automated-backups` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `maxAllocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allocated-storage` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `multiAz` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `processorFeatures` | software.amazon.awscdk.services.rds.ProcessorFeatures | [[cdk.support/lookup-entry]] | `:processor-features` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `sourceDatabaseInstance` | software.amazon.awscdk.services.rds.IDatabaseInstance | [[cdk.support/lookup-entry]] | `:source-database-instance` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |
| `storageEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:storage-encryption-key` |
| `storageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-throughput` |
| `storageType` | software.amazon.awscdk.services.rds.StorageType | [[cdk.api.services.rds/storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseInstanceReadReplicaProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :delete-automated-backups)]
    (. builder deleteAutomatedBackups data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :max-allocated-storage)]
    (. builder maxAllocatedStorage data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :option-group)]
    (. builder optionGroup data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :processor-features)]
    (. builder processorFeatures data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :source-database-instance)]
    (. builder sourceDatabaseInstance data))
  (when-some [data (lookup-entry config id :storage-encrypted)]
    (. builder storageEncrypted data))
  (when-some [data (lookup-entry config id :storage-encryption-key)]
    (. builder storageEncryptionKey data))
  (when-some [data (lookup-entry config id :storage-throughput)]
    (. builder storageThroughput data))
  (when-some [data (storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-instance-read-replica-props-builder
  "Creates a  `DatabaseInstanceReadReplicaProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-instance-read-replica-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-instance-read-replica-props-builder> (new DatabaseInstanceReadReplicaProps$Builder) id config))


(defn database-instance-source-props-builder>
  "The database-instance-source-props-builder> function updates a DatabaseInstanceSourceProps$Builder instance using the provided configuration.
  The function takes the DatabaseInstanceSourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:allocated-storage` |
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `cloudwatchLogsExports` | java.util.List | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-exports` |
| `cloudwatchLogsRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:cloudwatch-logs-retention` |
| `cloudwatchLogsRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:cloudwatch-logs-retention-role` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `deleteAutomatedBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-automated-backups` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `domainRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:domain-role` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `engine` | software.amazon.awscdk.services.rds.IInstanceEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `iamAuthentication` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-authentication` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `licenseModel` | software.amazon.awscdk.services.rds.LicenseModel | [[cdk.api.services.rds/license-model]] | `:license-model` |
| `maxAllocatedStorage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-allocated-storage` |
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `multiAz` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az` |
| `networkType` | software.amazon.awscdk.services.rds.NetworkType | [[cdk.api.services.rds/network-type]] | `:network-type` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `processorFeatures` | software.amazon.awscdk.services.rds.ProcessorFeatures | [[cdk.support/lookup-entry]] | `:processor-features` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `s3ExportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-export-buckets` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportBuckets` | java.util.List | [[cdk.support/lookup-entry]] | `:s3-import-buckets` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `storageThroughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:storage-throughput` |
| `storageType` | software.amazon.awscdk.services.rds.StorageType | [[cdk.api.services.rds/storage-type]] | `:storage-type` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseInstanceSourceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allocated-storage)]
    (. builder allocatedStorage data))
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-exports)]
    (. builder cloudwatchLogsExports data))
  (when-some [data (retention-days config id :cloudwatch-logs-retention)]
    (. builder cloudwatchLogsRetention data))
  (when-some [data (lookup-entry config id :cloudwatch-logs-retention-role)]
    (. builder cloudwatchLogsRetentionRole data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :delete-automated-backups)]
    (. builder deleteAutomatedBackups data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :domain-role)]
    (. builder domainRole data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :iam-authentication)]
    (. builder iamAuthentication data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (license-model config id :license-model)]
    (. builder licenseModel data))
  (when-some [data (lookup-entry config id :max-allocated-storage)]
    (. builder maxAllocatedStorage data))
  (when-some [data (lookup-entry config id :monitoring-interval)]
    (. builder monitoringInterval data))
  (when-some [data (lookup-entry config id :monitoring-role)]
    (. builder monitoringRole data))
  (when-some [data (lookup-entry config id :multi-az)]
    (. builder multiAz data))
  (when-some [data (network-type config id :network-type)]
    (. builder networkType data))
  (when-some [data (lookup-entry config id :option-group)]
    (. builder optionGroup data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :processor-features)]
    (. builder processorFeatures data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :s3-export-buckets)]
    (. builder s3ExportBuckets data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-buckets)]
    (. builder s3ImportBuckets data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :storage-throughput)]
    (. builder storageThroughput data))
  (when-some [data (storage-type config id :storage-type)]
    (. builder storageType data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-instance-source-props-builder
  "Creates a  `DatabaseInstanceSourceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-instance-source-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-instance-source-props-builder> (new DatabaseInstanceSourceProps$Builder) id config))


(defn database-proxy-attributes-builder>
  "The database-proxy-attributes-builder> function updates a DatabaseProxyAttributes$Builder instance using the provided configuration.
  The function takes the DatabaseProxyAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbProxyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-arn` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
"
  [^DatabaseProxyAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :db-proxy-arn)]
    (. builder dbProxyArn data))
  (when-some [data (lookup-entry config id :db-proxy-name)]
    (. builder dbProxyName data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (.build builder))


(defn database-proxy-attributes-builder
  "Creates a  `DatabaseProxyAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-proxy-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-proxy-attributes-builder> (new DatabaseProxyAttributes$Builder) id config))


(defn database-proxy-builder>
  "The database-proxy-builder> function updates a DatabaseProxy$Builder instance using the provided configuration.
  The function takes the DatabaseProxy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `borrowTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:borrow-timeout` |
| `clientPasswordAuthType` | software.amazon.awscdk.services.rds.ClientPasswordAuthType | [[cdk.api.services.rds/client-password-auth-type]] | `:client-password-auth-type` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `debugLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:debug-logging` |
| `iamAuth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-auth` |
| `idleClientTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-client-timeout` |
| `initQuery` | java.lang.String | [[cdk.support/lookup-entry]] | `:init-query` |
| `maxConnectionsPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections-percent` |
| `maxIdleConnectionsPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-idle-connections-percent` |
| `proxyTarget` | software.amazon.awscdk.services.rds.ProxyTarget | [[cdk.support/lookup-entry]] | `:proxy-target` |
| `requireTls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-tls` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `secrets` | java.util.List | [[cdk.support/lookup-entry]] | `:secrets` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `sessionPinningFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:session-pinning-filters` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseProxy$Builder builder id config]
  (when-some [data (lookup-entry config id :borrow-timeout)]
    (. builder borrowTimeout data))
  (when-some [data (client-password-auth-type config id :client-password-auth-type)]
    (. builder clientPasswordAuthType data))
  (when-some [data (lookup-entry config id :db-proxy-name)]
    (. builder dbProxyName data))
  (when-some [data (lookup-entry config id :debug-logging)]
    (. builder debugLogging data))
  (when-some [data (lookup-entry config id :iam-auth)]
    (. builder iamAuth data))
  (when-some [data (lookup-entry config id :idle-client-timeout)]
    (. builder idleClientTimeout data))
  (when-some [data (lookup-entry config id :init-query)]
    (. builder initQuery data))
  (when-some [data (lookup-entry config id :max-connections-percent)]
    (. builder maxConnectionsPercent data))
  (when-some [data (lookup-entry config id :max-idle-connections-percent)]
    (. builder maxIdleConnectionsPercent data))
  (when-some [data (lookup-entry config id :proxy-target)]
    (. builder proxyTarget data))
  (when-some [data (lookup-entry config id :require-tls)]
    (. builder requireTls data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :session-pinning-filters)]
    (. builder sessionPinningFilters data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-proxy-builder
  "Creates a  `DatabaseProxy$Builder` instance using a scope and ID, applies the data configuration using the [[database-proxy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (database-proxy-builder> (DatabaseProxy$Builder/create scope (name id)) id config))


(defn database-proxy-options-builder>
  "The database-proxy-options-builder> function updates a DatabaseProxyOptions$Builder instance using the provided configuration.
  The function takes the DatabaseProxyOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `borrowTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:borrow-timeout` |
| `clientPasswordAuthType` | software.amazon.awscdk.services.rds.ClientPasswordAuthType | [[cdk.api.services.rds/client-password-auth-type]] | `:client-password-auth-type` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `debugLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:debug-logging` |
| `iamAuth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-auth` |
| `idleClientTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-client-timeout` |
| `initQuery` | java.lang.String | [[cdk.support/lookup-entry]] | `:init-query` |
| `maxConnectionsPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections-percent` |
| `maxIdleConnectionsPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-idle-connections-percent` |
| `requireTls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-tls` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `secrets` | java.util.List | [[cdk.support/lookup-entry]] | `:secrets` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `sessionPinningFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:session-pinning-filters` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseProxyOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :borrow-timeout)]
    (. builder borrowTimeout data))
  (when-some [data (client-password-auth-type config id :client-password-auth-type)]
    (. builder clientPasswordAuthType data))
  (when-some [data (lookup-entry config id :db-proxy-name)]
    (. builder dbProxyName data))
  (when-some [data (lookup-entry config id :debug-logging)]
    (. builder debugLogging data))
  (when-some [data (lookup-entry config id :iam-auth)]
    (. builder iamAuth data))
  (when-some [data (lookup-entry config id :idle-client-timeout)]
    (. builder idleClientTimeout data))
  (when-some [data (lookup-entry config id :init-query)]
    (. builder initQuery data))
  (when-some [data (lookup-entry config id :max-connections-percent)]
    (. builder maxConnectionsPercent data))
  (when-some [data (lookup-entry config id :max-idle-connections-percent)]
    (. builder maxIdleConnectionsPercent data))
  (when-some [data (lookup-entry config id :require-tls)]
    (. builder requireTls data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :session-pinning-filters)]
    (. builder sessionPinningFilters data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-proxy-options-builder
  "Creates a  `DatabaseProxyOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-proxy-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-proxy-options-builder> (new DatabaseProxyOptions$Builder) id config))


(defn database-proxy-props-builder>
  "The database-proxy-props-builder> function updates a DatabaseProxyProps$Builder instance using the provided configuration.
  The function takes the DatabaseProxyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `borrowTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:borrow-timeout` |
| `clientPasswordAuthType` | software.amazon.awscdk.services.rds.ClientPasswordAuthType | [[cdk.api.services.rds/client-password-auth-type]] | `:client-password-auth-type` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `debugLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:debug-logging` |
| `iamAuth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:iam-auth` |
| `idleClientTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-client-timeout` |
| `initQuery` | java.lang.String | [[cdk.support/lookup-entry]] | `:init-query` |
| `maxConnectionsPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections-percent` |
| `maxIdleConnectionsPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-idle-connections-percent` |
| `proxyTarget` | software.amazon.awscdk.services.rds.ProxyTarget | [[cdk.support/lookup-entry]] | `:proxy-target` |
| `requireTls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-tls` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `secrets` | java.util.List | [[cdk.support/lookup-entry]] | `:secrets` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `sessionPinningFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:session-pinning-filters` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^DatabaseProxyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :borrow-timeout)]
    (. builder borrowTimeout data))
  (when-some [data (client-password-auth-type config id :client-password-auth-type)]
    (. builder clientPasswordAuthType data))
  (when-some [data (lookup-entry config id :db-proxy-name)]
    (. builder dbProxyName data))
  (when-some [data (lookup-entry config id :debug-logging)]
    (. builder debugLogging data))
  (when-some [data (lookup-entry config id :iam-auth)]
    (. builder iamAuth data))
  (when-some [data (lookup-entry config id :idle-client-timeout)]
    (. builder idleClientTimeout data))
  (when-some [data (lookup-entry config id :init-query)]
    (. builder initQuery data))
  (when-some [data (lookup-entry config id :max-connections-percent)]
    (. builder maxConnectionsPercent data))
  (when-some [data (lookup-entry config id :max-idle-connections-percent)]
    (. builder maxIdleConnectionsPercent data))
  (when-some [data (lookup-entry config id :proxy-target)]
    (. builder proxyTarget data))
  (when-some [data (lookup-entry config id :require-tls)]
    (. builder requireTls data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :session-pinning-filters)]
    (. builder sessionPinningFilters data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn database-proxy-props-builder
  "Creates a  `DatabaseProxyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-proxy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-proxy-props-builder> (new DatabaseProxyProps$Builder) id config))


(defn database-secret-builder>
  "The database-secret-builder> function updates a DatabaseSecret$Builder instance using the provided configuration.
  The function takes the DatabaseSecret$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbname` | java.lang.String | [[cdk.support/lookup-entry]] | `:dbname` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `replaceOnPasswordCriteriaChanges` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-on-password-criteria-changes` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^DatabaseSecret$Builder builder id config]
  (when-some [data (lookup-entry config id :dbname)]
    (. builder dbname data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :master-secret)]
    (. builder masterSecret data))
  (when-some [data (lookup-entry config id :replace-on-password-criteria-changes)]
    (. builder replaceOnPasswordCriteriaChanges data))
  (when-some [data (lookup-entry config id :replica-regions)]
    (. builder replicaRegions data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn database-secret-builder
  "Creates a  `DatabaseSecret$Builder` instance using a scope and ID, applies the data configuration using the [[database-secret-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (database-secret-builder> (DatabaseSecret$Builder/create scope (name id)) id config))


(defn database-secret-props-builder>
  "The database-secret-props-builder> function updates a DatabaseSecretProps$Builder instance using the provided configuration.
  The function takes the DatabaseSecretProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbname` | java.lang.String | [[cdk.support/lookup-entry]] | `:dbname` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `replaceOnPasswordCriteriaChanges` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-on-password-criteria-changes` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^DatabaseSecretProps$Builder builder id config]
  (when-some [data (lookup-entry config id :dbname)]
    (. builder dbname data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :master-secret)]
    (. builder masterSecret data))
  (when-some [data (lookup-entry config id :replace-on-password-criteria-changes)]
    (. builder replaceOnPasswordCriteriaChanges data))
  (when-some [data (lookup-entry config id :replica-regions)]
    (. builder replicaRegions data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn database-secret-props-builder
  "Creates a  `DatabaseSecretProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[database-secret-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (database-secret-props-builder> (new DatabaseSecretProps$Builder) id config))


(defn engine-version-builder>
  "The engine-version-builder> function updates a EngineVersion$Builder instance using the provided configuration.
  The function takes the EngineVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fullVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:full-version` |
| `majorVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-version` |
"
  [^EngineVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :full-version)]
    (. builder fullVersion data))
  (when-some [data (lookup-entry config id :major-version)]
    (. builder majorVersion data))
  (.build builder))


(defn engine-version-builder
  "Creates a  `EngineVersion$Builder` instance using a no-argument constructor, applies the data configuration using the [[engine-version-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (engine-version-builder> (new EngineVersion$Builder) id config))


(defn instance-engine-bind-options-builder>
  "The instance-engine-bind-options-builder> function updates a InstanceEngineBindOptions$Builder instance using the provided configuration.
  The function takes the InstanceEngineBindOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |
"
  [^InstanceEngineBindOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :domain)]
    (. builder domain data))
  (when-some [data (lookup-entry config id :option-group)]
    (. builder optionGroup data))
  (when-some [data (lookup-entry config id :s3-export-role)]
    (. builder s3ExportRole data))
  (when-some [data (lookup-entry config id :s3-import-role)]
    (. builder s3ImportRole data))
  (when-some [data (lookup-entry config id :timezone)]
    (. builder timezone data))
  (.build builder))


(defn instance-engine-bind-options-builder
  "Creates a  `InstanceEngineBindOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[instance-engine-bind-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (instance-engine-bind-options-builder> (new InstanceEngineBindOptions$Builder) id config))


(defn instance-engine-config-builder>
  "The instance-engine-config-builder> function updates a InstanceEngineConfig$Builder instance using the provided configuration.
  The function takes the InstanceEngineConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `features` | software.amazon.awscdk.services.rds.InstanceEngineFeatures | [[cdk.support/lookup-entry]] | `:features` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |
"
  [^InstanceEngineConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :features)]
    (. builder features data))
  (when-some [data (lookup-entry config id :option-group)]
    (. builder optionGroup data))
  (.build builder))


(defn instance-engine-config-builder
  "Creates a  `InstanceEngineConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[instance-engine-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (instance-engine-config-builder> (new InstanceEngineConfig$Builder) id config))


(defn instance-engine-features-builder>
  "The instance-engine-features-builder> function updates a InstanceEngineFeatures$Builder instance using the provided configuration.
  The function takes the InstanceEngineFeatures$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Export` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-export` |
| `s3Import` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-import` |
"
  [^InstanceEngineFeatures$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-export)]
    (. builder s3Export data))
  (when-some [data (lookup-entry config id :s3-import)]
    (. builder s3Import data))
  (.build builder))


(defn instance-engine-features-builder
  "Creates a  `InstanceEngineFeatures$Builder` instance using a no-argument constructor, applies the data configuration using the [[instance-engine-features-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (instance-engine-features-builder> (new InstanceEngineFeatures$Builder) id config))


(defn instance-props-builder>
  "The instance-props-builder> function updates a InstanceProps$Builder instance using the provided configuration.
  The function takes the InstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `deleteAutomatedBackups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-automated-backups` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^InstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :delete-automated-backups)]
    (. builder deleteAutomatedBackups data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn instance-props-builder
  "Creates a  `InstanceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[instance-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (instance-props-builder> (new InstanceProps$Builder) id config))


(defn maria-db-instance-engine-props-builder>
  "The maria-db-instance-engine-props-builder> function updates a MariaDbInstanceEngineProps$Builder instance using the provided configuration.
  The function takes the MariaDbInstanceEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.MariaDbEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^MariaDbInstanceEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn maria-db-instance-engine-props-builder
  "Creates a  `MariaDbInstanceEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[maria-db-instance-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (maria-db-instance-engine-props-builder> (new MariaDbInstanceEngineProps$Builder) id config))


(defn my-sql-instance-engine-props-builder>
  "The my-sql-instance-engine-props-builder> function updates a MySqlInstanceEngineProps$Builder instance using the provided configuration.
  The function takes the MySqlInstanceEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.MysqlEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^MySqlInstanceEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn my-sql-instance-engine-props-builder
  "Creates a  `MySqlInstanceEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[my-sql-instance-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (my-sql-instance-engine-props-builder> (new MySqlInstanceEngineProps$Builder) id config))


(defn option-configuration-builder>
  "The option-configuration-builder> function updates a OptionConfiguration$Builder instance using the provided configuration.
  The function takes the OptionConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `settings` | java.util.Map | [[cdk.support/lookup-entry]] | `:settings` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^OptionConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :settings)]
    (. builder settings data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn option-configuration-builder
  "Creates a  `OptionConfiguration$Builder` instance using a no-argument constructor, applies the data configuration using the [[option-configuration-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (option-configuration-builder> (new OptionConfiguration$Builder) id config))


(defn option-group-builder>
  "The option-group-builder> function updates a OptionGroup$Builder instance using the provided configuration.
  The function takes the OptionGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | software.amazon.awscdk.services.rds.IInstanceEngine | [[cdk.support/lookup-entry]] | `:engine` |
"
  [^OptionGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (.build builder))


(defn option-group-builder
  "Creates a  `OptionGroup$Builder` instance using a scope and ID, applies the data configuration using the [[option-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (option-group-builder> (OptionGroup$Builder/create scope (name id)) id config))


(defn option-group-props-builder>
  "The option-group-props-builder> function updates a OptionGroupProps$Builder instance using the provided configuration.
  The function takes the OptionGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | software.amazon.awscdk.services.rds.IInstanceEngine | [[cdk.support/lookup-entry]] | `:engine` |
"
  [^OptionGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (.build builder))


(defn option-group-props-builder
  "Creates a  `OptionGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[option-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (option-group-props-builder> (new OptionGroupProps$Builder) id config))


(defn oracle-ee-cdb-instance-engine-props-builder>
  "The oracle-ee-cdb-instance-engine-props-builder> function updates a OracleEeCdbInstanceEngineProps$Builder instance using the provided configuration.
  The function takes the OracleEeCdbInstanceEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.OracleEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^OracleEeCdbInstanceEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn oracle-ee-cdb-instance-engine-props-builder
  "Creates a  `OracleEeCdbInstanceEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[oracle-ee-cdb-instance-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (oracle-ee-cdb-instance-engine-props-builder> (new OracleEeCdbInstanceEngineProps$Builder) id config))


(defn oracle-ee-instance-engine-props-builder>
  "The oracle-ee-instance-engine-props-builder> function updates a OracleEeInstanceEngineProps$Builder instance using the provided configuration.
  The function takes the OracleEeInstanceEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.OracleEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^OracleEeInstanceEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn oracle-ee-instance-engine-props-builder
  "Creates a  `OracleEeInstanceEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[oracle-ee-instance-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (oracle-ee-instance-engine-props-builder> (new OracleEeInstanceEngineProps$Builder) id config))


(defn oracle-se2-cdb-instance-engine-props-builder>
  "The oracle-se2-cdb-instance-engine-props-builder> function updates a OracleSe2CdbInstanceEngineProps$Builder instance using the provided configuration.
  The function takes the OracleSe2CdbInstanceEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.OracleEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^OracleSe2CdbInstanceEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn oracle-se2-cdb-instance-engine-props-builder
  "Creates a  `OracleSe2CdbInstanceEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[oracle-se2-cdb-instance-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (oracle-se2-cdb-instance-engine-props-builder> (new OracleSe2CdbInstanceEngineProps$Builder) id config))


(defn oracle-se2-instance-engine-props-builder>
  "The oracle-se2-instance-engine-props-builder> function updates a OracleSe2InstanceEngineProps$Builder instance using the provided configuration.
  The function takes the OracleSe2InstanceEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.OracleEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^OracleSe2InstanceEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn oracle-se2-instance-engine-props-builder
  "Creates a  `OracleSe2InstanceEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[oracle-se2-instance-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (oracle-se2-instance-engine-props-builder> (new OracleSe2InstanceEngineProps$Builder) id config))


(defn parameter-group-builder>
  "The parameter-group-builder> function updates a ParameterGroup$Builder instance using the provided configuration.
  The function takes the ParameterGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | software.amazon.awscdk.services.rds.IEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^ParameterGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn parameter-group-builder
  "Creates a  `ParameterGroup$Builder` instance using a scope and ID, applies the data configuration using the [[parameter-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (parameter-group-builder> (ParameterGroup$Builder/create scope (name id)) id config))


(defn parameter-group-cluster-bind-options-builder
  "Creates a  `ParameterGroupClusterBindOptions$Builder` instance using a no-argument construct, then builds it."
  []
  (.build (new ParameterGroupClusterBindOptions$Builder)))


(defn parameter-group-cluster-config-builder>
  "The parameter-group-cluster-config-builder> function updates a ParameterGroupClusterConfig$Builder instance using the provided configuration.
  The function takes the ParameterGroupClusterConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
"
  [^ParameterGroupClusterConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (.build builder))


(defn parameter-group-cluster-config-builder
  "Creates a  `ParameterGroupClusterConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[parameter-group-cluster-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (parameter-group-cluster-config-builder> (new ParameterGroupClusterConfig$Builder) id config))


(defn parameter-group-instance-bind-options-builder
  "Creates a  `ParameterGroupInstanceBindOptions$Builder` instance using a no-argument construct, then builds it."
  []
  (.build (new ParameterGroupInstanceBindOptions$Builder)))


(defn parameter-group-instance-config-builder>
  "The parameter-group-instance-config-builder> function updates a ParameterGroupInstanceConfig$Builder instance using the provided configuration.
  The function takes the ParameterGroupInstanceConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |
"
  [^ParameterGroupInstanceConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :parameter-group-name)]
    (. builder parameterGroupName data))
  (.build builder))


(defn parameter-group-instance-config-builder
  "Creates a  `ParameterGroupInstanceConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[parameter-group-instance-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (parameter-group-instance-config-builder> (new ParameterGroupInstanceConfig$Builder) id config))


(defn parameter-group-props-builder>
  "The parameter-group-props-builder> function updates a ParameterGroupProps$Builder instance using the provided configuration.
  The function takes the ParameterGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | software.amazon.awscdk.services.rds.IEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^ParameterGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn parameter-group-props-builder
  "Creates a  `ParameterGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[parameter-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (parameter-group-props-builder> (new ParameterGroupProps$Builder) id config))


(defn postgres-engine-features-builder>
  "The postgres-engine-features-builder> function updates a PostgresEngineFeatures$Builder instance using the provided configuration.
  The function takes the PostgresEngineFeatures$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Export` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-export` |
| `s3Import` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-import` |
"
  [^PostgresEngineFeatures$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-export)]
    (. builder s3Export data))
  (when-some [data (lookup-entry config id :s3-import)]
    (. builder s3Import data))
  (.build builder))


(defn postgres-engine-features-builder
  "Creates a  `PostgresEngineFeatures$Builder` instance using a no-argument constructor, applies the data configuration using the [[postgres-engine-features-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (postgres-engine-features-builder> (new PostgresEngineFeatures$Builder) id config))


(defn postgres-instance-engine-props-builder>
  "The postgres-instance-engine-props-builder> function updates a PostgresInstanceEngineProps$Builder instance using the provided configuration.
  The function takes the PostgresInstanceEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.PostgresEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^PostgresInstanceEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn postgres-instance-engine-props-builder
  "Creates a  `PostgresInstanceEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[postgres-instance-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (postgres-instance-engine-props-builder> (new PostgresInstanceEngineProps$Builder) id config))


(defn processor-features-builder>
  "The processor-features-builder> function updates a ProcessorFeatures$Builder instance using the provided configuration.
  The function takes the ProcessorFeatures$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:core-count` |
| `threadsPerCore` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threads-per-core` |
"
  [^ProcessorFeatures$Builder builder id config]
  (when-some [data (lookup-entry config id :core-count)]
    (. builder coreCount data))
  (when-some [data (lookup-entry config id :threads-per-core)]
    (. builder threadsPerCore data))
  (.build builder))


(defn processor-features-builder
  "Creates a  `ProcessorFeatures$Builder` instance using a no-argument constructor, applies the data configuration using the [[processor-features-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (processor-features-builder> (new ProcessorFeatures$Builder) id config))


(defn provisioned-cluster-instance-props-builder>
  "The provisioned-cluster-instance-props-builder> function updates a ProvisionedClusterInstanceProps$Builder instance using the provided configuration.
  The function takes the ProvisionedClusterInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `instanceType` | software.amazon.awscdk.services.ec2.InstanceType | [[cdk.support/lookup-entry]] | `:instance-type` |
| `isFromLegacyInstanceProps` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-from-legacy-instance-props` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `promotionTier` | java.lang.Number | [[cdk.support/lookup-entry]] | `:promotion-tier` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
"
  [^ProvisionedClusterInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :is-from-legacy-instance-props)]
    (. builder isFromLegacyInstanceProps data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :promotion-tier)]
    (. builder promotionTier data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (.build builder))


(defn provisioned-cluster-instance-props-builder
  "Creates a  `ProvisionedClusterInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[provisioned-cluster-instance-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (provisioned-cluster-instance-props-builder> (new ProvisionedClusterInstanceProps$Builder) id config))


(defn proxy-target-config-builder>
  "The proxy-target-config-builder> function updates a ProxyTargetConfig$Builder instance using the provided configuration.
  The function takes the ProxyTargetConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbClusters` | java.util.List | [[cdk.support/lookup-entry]] | `:db-clusters` |
| `dbInstances` | java.util.List | [[cdk.support/lookup-entry]] | `:db-instances` |
| `engineFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-family` |
"
  [^ProxyTargetConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :db-clusters)]
    (. builder dbClusters data))
  (when-some [data (lookup-entry config id :db-instances)]
    (. builder dbInstances data))
  (when-some [data (lookup-entry config id :engine-family)]
    (. builder engineFamily data))
  (.build builder))


(defn proxy-target-config-builder
  "Creates a  `ProxyTargetConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[proxy-target-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (proxy-target-config-builder> (new ProxyTargetConfig$Builder) id config))


(defn rotation-multi-user-options-builder>
  "The rotation-multi-user-options-builder> function updates a RotationMultiUserOptions$Builder instance using the provided configuration.
  The function takes the RotationMultiUserOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `endpoint` | software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint | [[cdk.support/lookup-entry]] | `:endpoint` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^RotationMultiUserOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :automatically-after)]
    (. builder automaticallyAfter data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :rotate-immediately-on-update)]
    (. builder rotateImmediatelyOnUpdate data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn rotation-multi-user-options-builder
  "Creates a  `RotationMultiUserOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[rotation-multi-user-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (rotation-multi-user-options-builder> (new RotationMultiUserOptions$Builder) id config))


(defn rotation-single-user-options-builder>
  "The rotation-single-user-options-builder> function updates a RotationSingleUserOptions$Builder instance using the provided configuration.
  The function takes the RotationSingleUserOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `endpoint` | software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint | [[cdk.support/lookup-entry]] | `:endpoint` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^RotationSingleUserOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :automatically-after)]
    (. builder automaticallyAfter data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :rotate-immediately-on-update)]
    (. builder rotateImmediatelyOnUpdate data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn rotation-single-user-options-builder
  "Creates a  `RotationSingleUserOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[rotation-single-user-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (rotation-single-user-options-builder> (new RotationSingleUserOptions$Builder) id config))


(defn serverless-cluster-attributes-builder>
  "The serverless-cluster-attributes-builder> function updates a ServerlessClusterAttributes$Builder instance using the provided configuration.
  The function takes the ServerlessClusterAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-endpoint-address` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `readerEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:reader-endpoint-address` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
"
  [^ServerlessClusterAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster-endpoint-address)]
    (. builder clusterEndpointAddress data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :reader-endpoint-address)]
    (. builder readerEndpointAddress data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (.build builder))


(defn serverless-cluster-attributes-builder
  "Creates a  `ServerlessClusterAttributes$Builder` instance using a no-argument constructor, applies the data configuration using the [[serverless-cluster-attributes-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (serverless-cluster-attributes-builder> (new ServerlessClusterAttributes$Builder) id config))


(defn serverless-cluster-builder>
  "The serverless-cluster-builder> function updates a ServerlessCluster$Builder instance using the provided configuration.
  The function takes the ServerlessCluster$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `defaultDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-database-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `enableDataApi` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-data-api` |
| `engine` | software.amazon.awscdk.services.rds.IClusterEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `scaling` | software.amazon.awscdk.services.rds.ServerlessScalingOptions | [[cdk.support/lookup-entry]] | `:scaling` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `storageEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:storage-encryption-key` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^ServerlessCluster$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :default-database-name)]
    (. builder defaultDatabaseName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :enable-data-api)]
    (. builder enableDataApi data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :scaling)]
    (. builder scaling data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :storage-encryption-key)]
    (. builder storageEncryptionKey data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn serverless-cluster-builder
  "Creates a  `ServerlessCluster$Builder` instance using a scope and ID, applies the data configuration using the [[serverless-cluster-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (serverless-cluster-builder> (ServerlessCluster$Builder/create scope (name id)) id config))


(defn serverless-cluster-from-snapshot-builder>
  "The serverless-cluster-from-snapshot-builder> function updates a ServerlessClusterFromSnapshot$Builder instance using the provided configuration.
  The function takes the ServerlessClusterFromSnapshot$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.SnapshotCredentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `defaultDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-database-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `enableDataApi` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-data-api` |
| `engine` | software.amazon.awscdk.services.rds.IClusterEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `scaling` | software.amazon.awscdk.services.rds.ServerlessScalingOptions | [[cdk.support/lookup-entry]] | `:scaling` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^ServerlessClusterFromSnapshot$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :default-database-name)]
    (. builder defaultDatabaseName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :enable-data-api)]
    (. builder enableDataApi data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :scaling)]
    (. builder scaling data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn serverless-cluster-from-snapshot-builder
  "Creates a  `ServerlessClusterFromSnapshot$Builder` instance using a scope and ID, applies the data configuration using the [[serverless-cluster-from-snapshot-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (serverless-cluster-from-snapshot-builder> (ServerlessClusterFromSnapshot$Builder/create scope (name id)) id config))


(defn serverless-cluster-from-snapshot-props-builder>
  "The serverless-cluster-from-snapshot-props-builder> function updates a ServerlessClusterFromSnapshotProps$Builder instance using the provided configuration.
  The function takes the ServerlessClusterFromSnapshotProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.SnapshotCredentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `defaultDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-database-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `enableDataApi` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-data-api` |
| `engine` | software.amazon.awscdk.services.rds.IClusterEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `scaling` | software.amazon.awscdk.services.rds.ServerlessScalingOptions | [[cdk.support/lookup-entry]] | `:scaling` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapshotIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-identifier` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^ServerlessClusterFromSnapshotProps$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :default-database-name)]
    (. builder defaultDatabaseName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :enable-data-api)]
    (. builder enableDataApi data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :scaling)]
    (. builder scaling data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :snapshot-identifier)]
    (. builder snapshotIdentifier data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn serverless-cluster-from-snapshot-props-builder
  "Creates a  `ServerlessClusterFromSnapshotProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[serverless-cluster-from-snapshot-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (serverless-cluster-from-snapshot-props-builder> (new ServerlessClusterFromSnapshotProps$Builder) id config))


(defn serverless-cluster-props-builder>
  "The serverless-cluster-props-builder> function updates a ServerlessClusterProps$Builder instance using the provided configuration.
  The function takes the ServerlessClusterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `copyTagsToSnapshot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags-to-snapshot` |
| `credentials` | software.amazon.awscdk.services.rds.Credentials | [[cdk.support/lookup-entry]] | `:credentials` |
| `defaultDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-database-name` |
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `enableDataApi` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-data-api` |
| `engine` | software.amazon.awscdk.services.rds.IClusterEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `scaling` | software.amazon.awscdk.services.rds.ServerlessScalingOptions | [[cdk.support/lookup-entry]] | `:scaling` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `storageEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:storage-encryption-key` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^ServerlessClusterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :cluster-identifier)]
    (. builder clusterIdentifier data))
  (when-some [data (lookup-entry config id :copy-tags-to-snapshot)]
    (. builder copyTagsToSnapshot data))
  (when-some [data (lookup-entry config id :credentials)]
    (. builder credentials data))
  (when-some [data (lookup-entry config id :default-database-name)]
    (. builder defaultDatabaseName data))
  (when-some [data (lookup-entry config id :deletion-protection)]
    (. builder deletionProtection data))
  (when-some [data (lookup-entry config id :enable-data-api)]
    (. builder enableDataApi data))
  (when-some [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :scaling)]
    (. builder scaling data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :storage-encryption-key)]
    (. builder storageEncryptionKey data))
  (when-some [data (lookup-entry config id :subnet-group)]
    (. builder subnetGroup data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn serverless-cluster-props-builder
  "Creates a  `ServerlessClusterProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[serverless-cluster-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (serverless-cluster-props-builder> (new ServerlessClusterProps$Builder) id config))


(defn serverless-scaling-options-builder>
  "The serverless-scaling-options-builder> function updates a ServerlessScalingOptions$Builder instance using the provided configuration.
  The function takes the ServerlessScalingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPause` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:auto-pause` |
| `maxCapacity` | software.amazon.awscdk.services.rds.AuroraCapacityUnit | [[cdk.api.services.rds/aurora-capacity-unit]] | `:max-capacity` |
| `minCapacity` | software.amazon.awscdk.services.rds.AuroraCapacityUnit | [[cdk.api.services.rds/aurora-capacity-unit]] | `:min-capacity` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `timeoutAction` | software.amazon.awscdk.services.rds.TimeoutAction | [[cdk.api.services.rds/timeout-action]] | `:timeout-action` |
"
  [^ServerlessScalingOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-pause)]
    (. builder autoPause data))
  (when-some [data (aurora-capacity-unit config id :max-capacity)]
    (. builder maxCapacity data))
  (when-some [data (aurora-capacity-unit config id :min-capacity)]
    (. builder minCapacity data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (timeout-action config id :timeout-action)]
    (. builder timeoutAction data))
  (.build builder))


(defn serverless-scaling-options-builder
  "Creates a  `ServerlessScalingOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[serverless-scaling-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (serverless-scaling-options-builder> (new ServerlessScalingOptions$Builder) id config))


(defn serverless-v2-cluster-instance-props-builder>
  "The serverless-v2-cluster-instance-props-builder> function updates a ServerlessV2ClusterInstanceProps$Builder instance using the provided configuration.
  The function takes the ServerlessV2ClusterInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowMajorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-major-version-upgrade` |
| `autoMinorVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-minor-version-upgrade` |
| `caCertificate` | software.amazon.awscdk.services.rds.CaCertificate | [[cdk.support/lookup-entry]] | `:ca-certificate` |
| `enablePerformanceInsights` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-insights` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `isFromLegacyInstanceProps` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-from-legacy-instance-props` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `performanceInsightEncryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:performance-insight-encryption-key` |
| `performanceInsightRetention` | software.amazon.awscdk.services.rds.PerformanceInsightRetention | [[cdk.api.services.rds/performance-insight-retention]] | `:performance-insight-retention` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `scaleWithWriter` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scale-with-writer` |
"
  [^ServerlessV2ClusterInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-major-version-upgrade)]
    (. builder allowMajorVersionUpgrade data))
  (when-some [data (lookup-entry config id :auto-minor-version-upgrade)]
    (. builder autoMinorVersionUpgrade data))
  (when-some [data (lookup-entry config id :ca-certificate)]
    (. builder caCertificate data))
  (when-some [data (lookup-entry config id :enable-performance-insights)]
    (. builder enablePerformanceInsights data))
  (when-some [data (lookup-entry config id :instance-identifier)]
    (. builder instanceIdentifier data))
  (when-some [data (lookup-entry config id :is-from-legacy-instance-props)]
    (. builder isFromLegacyInstanceProps data))
  (when-some [data (lookup-entry config id :parameter-group)]
    (. builder parameterGroup data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :performance-insight-encryption-key)]
    (. builder performanceInsightEncryptionKey data))
  (when-some [data (performance-insight-retention config id :performance-insight-retention)]
    (. builder performanceInsightRetention data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :scale-with-writer)]
    (. builder scaleWithWriter data))
  (.build builder))


(defn serverless-v2-cluster-instance-props-builder
  "Creates a  `ServerlessV2ClusterInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[serverless-v2-cluster-instance-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (serverless-v2-cluster-instance-props-builder> (new ServerlessV2ClusterInstanceProps$Builder) id config))


(defn snapshot-credentials-from-generated-password-options-builder>
  "The snapshot-credentials-from-generated-password-options-builder> function updates a SnapshotCredentialsFromGeneratedPasswordOptions$Builder instance using the provided configuration.
  The function takes the SnapshotCredentialsFromGeneratedPasswordOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
"
  [^SnapshotCredentialsFromGeneratedPasswordOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :replica-regions)]
    (. builder replicaRegions data))
  (.build builder))


(defn snapshot-credentials-from-generated-password-options-builder
  "Creates a  `SnapshotCredentialsFromGeneratedPasswordOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[snapshot-credentials-from-generated-password-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (snapshot-credentials-from-generated-password-options-builder> (new SnapshotCredentialsFromGeneratedPasswordOptions$Builder) id config))


(defn sql-server-ee-instance-engine-props-builder>
  "The sql-server-ee-instance-engine-props-builder> function updates a SqlServerEeInstanceEngineProps$Builder instance using the provided configuration.
  The function takes the SqlServerEeInstanceEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.SqlServerEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^SqlServerEeInstanceEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn sql-server-ee-instance-engine-props-builder
  "Creates a  `SqlServerEeInstanceEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[sql-server-ee-instance-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (sql-server-ee-instance-engine-props-builder> (new SqlServerEeInstanceEngineProps$Builder) id config))


(defn sql-server-ex-instance-engine-props-builder>
  "The sql-server-ex-instance-engine-props-builder> function updates a SqlServerExInstanceEngineProps$Builder instance using the provided configuration.
  The function takes the SqlServerExInstanceEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.SqlServerEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^SqlServerExInstanceEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn sql-server-ex-instance-engine-props-builder
  "Creates a  `SqlServerExInstanceEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[sql-server-ex-instance-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (sql-server-ex-instance-engine-props-builder> (new SqlServerExInstanceEngineProps$Builder) id config))


(defn sql-server-se-instance-engine-props-builder>
  "The sql-server-se-instance-engine-props-builder> function updates a SqlServerSeInstanceEngineProps$Builder instance using the provided configuration.
  The function takes the SqlServerSeInstanceEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.SqlServerEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^SqlServerSeInstanceEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn sql-server-se-instance-engine-props-builder
  "Creates a  `SqlServerSeInstanceEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[sql-server-se-instance-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (sql-server-se-instance-engine-props-builder> (new SqlServerSeInstanceEngineProps$Builder) id config))


(defn sql-server-web-instance-engine-props-builder>
  "The sql-server-web-instance-engine-props-builder> function updates a SqlServerWebInstanceEngineProps$Builder instance using the provided configuration.
  The function takes the SqlServerWebInstanceEngineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.SqlServerEngineVersion | [[cdk.support/lookup-entry]] | `:version` |
"
  [^SqlServerWebInstanceEngineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn sql-server-web-instance-engine-props-builder
  "Creates a  `SqlServerWebInstanceEngineProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[sql-server-web-instance-engine-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (sql-server-web-instance-engine-props-builder> (new SqlServerWebInstanceEngineProps$Builder) id config))


(defn subnet-group-builder>
  "The subnet-group-builder> function updates a SubnetGroup$Builder instance using the provided configuration.
  The function takes the SubnetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^SubnetGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn subnet-group-builder
  "Creates a  `SubnetGroup$Builder` instance using a scope and ID, applies the data configuration using the [[subnet-group-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (subnet-group-builder> (SubnetGroup$Builder/create scope (name id)) id config))


(defn subnet-group-props-builder>
  "The subnet-group-props-builder> function updates a SubnetGroupProps$Builder instance using the provided configuration.
  The function takes the SubnetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^SubnetGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :subnet-group-name)]
    (. builder subnetGroupName data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn subnet-group-props-builder
  "Creates a  `SubnetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[subnet-group-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (subnet-group-props-builder> (new SubnetGroupProps$Builder) id config))