(ns cdk.api.services.rds
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.rds package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api :refer [removal-policy]]
            [cdk.api.services.logs :refer [retention-days]])
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


(defn aurora-cluster-engine-props-builder
  "The aurora-cluster-engine-props-builder function buildes out new instances of 
AuroraClusterEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.AuroraEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (AuroraClusterEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn aurora-mysql-cluster-engine-props-builder
  "The aurora-mysql-cluster-engine-props-builder function buildes out new instances of 
AuroraMysqlClusterEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (AuroraMysqlClusterEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn aurora-postgres-cluster-engine-props-builder
  "The aurora-postgres-cluster-engine-props-builder function buildes out new instances of 
AuroraPostgresClusterEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (AuroraPostgresClusterEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn aurora-postgres-engine-features-builder
  "The aurora-postgres-engine-features-builder function buildes out new instances of 
AuroraPostgresEngineFeatures$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Export` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-export` |
| `s3Import` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-import` |"
  [stack id config]
  (let [builder (AuroraPostgresEngineFeatures$Builder.)]
    (when-let [data (lookup-entry config id :s3-export)]
      (. builder s3Export data))
    (when-let [data (lookup-entry config id :s3-import)]
      (. builder s3Import data))
    (.build builder)))


(defn backup-props-builder
  "The backup-props-builder function buildes out new instances of 
BackupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `preferredWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-window` |
| `retention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention` |"
  [stack id config]
  (let [builder (BackupProps$Builder.)]
    (when-let [data (lookup-entry config id :preferred-window)]
      (. builder preferredWindow data))
    (when-let [data (lookup-entry config id :retention)]
      (. builder retention data))
    (.build builder)))


(defn cfn-custom-db-engine-version-builder
  "The cfn-custom-db-engine-version-builder function buildes out new instances of 
CfnCustomDBEngineVersion$Builder using the provided configuration.  Each field is set as follows:

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
| `useAwsProvidedLatestImage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:use-aws-provided-latest-image` |"
  [stack id config]
  (let [builder (CfnCustomDBEngineVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :database-installation-files-s3-bucket-name)]
      (. builder databaseInstallationFilesS3BucketName data))
    (when-let [data (lookup-entry config id :database-installation-files-s3-prefix)]
      (. builder databaseInstallationFilesS3Prefix data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :manifest)]
      (. builder manifest data))
    (when-let [data (lookup-entry config id :source-custom-db-engine-version-identifier)]
      (. builder sourceCustomDbEngineVersionIdentifier data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :use-aws-provided-latest-image)]
      (. builder useAwsProvidedLatestImage data))
    (.build builder)))


(defn cfn-custom-db-engine-version-props-builder
  "The cfn-custom-db-engine-version-props-builder function buildes out new instances of 
CfnCustomDBEngineVersionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `useAwsProvidedLatestImage` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-aws-provided-latest-image` |"
  [stack id config]
  (let [builder (CfnCustomDBEngineVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :database-installation-files-s3-bucket-name)]
      (. builder databaseInstallationFilesS3BucketName data))
    (when-let [data (lookup-entry config id :database-installation-files-s3-prefix)]
      (. builder databaseInstallationFilesS3Prefix data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :manifest)]
      (. builder manifest data))
    (when-let [data (lookup-entry config id :source-custom-db-engine-version-identifier)]
      (. builder sourceCustomDbEngineVersionIdentifier data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :use-aws-provided-latest-image)]
      (. builder useAwsProvidedLatestImage data))
    (.build builder)))


(defn cfn-db-cluster-builder
  "The cfn-db-cluster-builder function buildes out new instances of 
CfnDBCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnDBCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :associated-roles)]
      (. builder associatedRoles data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :backtrack-window)]
      (. builder backtrackWindow data))
    (when-let [data (lookup-entry config id :backup-retention-period)]
      (. builder backupRetentionPeriod data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :db-cluster-identifier)]
      (. builder dbClusterIdentifier data))
    (when-let [data (lookup-entry config id :db-cluster-instance-class)]
      (. builder dbClusterInstanceClass data))
    (when-let [data (lookup-entry config id :db-cluster-parameter-group-name)]
      (. builder dbClusterParameterGroupName data))
    (when-let [data (lookup-entry config id :db-instance-parameter-group-name)]
      (. builder dbInstanceParameterGroupName data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :db-system-id)]
      (. builder dbSystemId data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-iam-role-name)]
      (. builder domainIamRoleName data))
    (when-let [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
      (. builder enableCloudwatchLogsExports data))
    (when-let [data (lookup-entry config id :enable-global-write-forwarding)]
      (. builder enableGlobalWriteForwarding data))
    (when-let [data (lookup-entry config id :enable-http-endpoint)]
      (. builder enableHttpEndpoint data))
    (when-let [data (lookup-entry config id :enable-iam-database-authentication)]
      (. builder enableIamDatabaseAuthentication data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :engine-mode)]
      (. builder engineMode data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :global-cluster-identifier)]
      (. builder globalClusterIdentifier data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :manage-master-user-password)]
      (. builder manageMasterUserPassword data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (when-let [data (lookup-entry config id :master-user-secret)]
      (. builder masterUserSecret data))
    (when-let [data (lookup-entry config id :master-username)]
      (. builder masterUsername data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role-arn)]
      (. builder monitoringRoleArn data))
    (when-let [data (lookup-entry config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :performance-insights-enabled)]
      (. builder performanceInsightsEnabled data))
    (when-let [data (lookup-entry config id :performance-insights-kms-key-id)]
      (. builder performanceInsightsKmsKeyId data))
    (when-let [data (lookup-entry config id :performance-insights-retention-period)]
      (. builder performanceInsightsRetentionPeriod data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :replication-source-identifier)]
      (. builder replicationSourceIdentifier data))
    (when-let [data (lookup-entry config id :restore-to-time)]
      (. builder restoreToTime data))
    (when-let [data (lookup-entry config id :restore-type)]
      (. builder restoreType data))
    (when-let [data (lookup-entry config id :scaling-configuration)]
      (. builder scalingConfiguration data))
    (when-let [data (lookup-entry config id :serverless-v2-scaling-configuration)]
      (. builder serverlessV2ScalingConfiguration data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :source-db-cluster-identifier)]
      (. builder sourceDbClusterIdentifier data))
    (when-let [data (lookup-entry config id :source-region)]
      (. builder sourceRegion data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :use-latest-restorable-time)]
      (. builder useLatestRestorableTime data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-db-cluster-db-cluster-role-property-builder
  "The cfn-db-cluster-db-cluster-role-property-builder function buildes out new instances of 
CfnDBCluster$DBClusterRoleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDBCluster$DBClusterRoleProperty$Builder.)]
    (when-let [data (lookup-entry config id :feature-name)]
      (. builder featureName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-db-cluster-endpoint-property-builder
  "The cfn-db-cluster-endpoint-property-builder function buildes out new instances of 
CfnDBCluster$EndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnDBCluster$EndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-db-cluster-master-user-secret-property-builder
  "The cfn-db-cluster-master-user-secret-property-builder function buildes out new instances of 
CfnDBCluster$MasterUserSecretProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |"
  [stack id config]
  (let [builder (CfnDBCluster$MasterUserSecretProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (.build builder)))


(defn cfn-db-cluster-parameter-group-builder
  "The cfn-db-cluster-parameter-group-builder function buildes out new instances of 
CfnDBClusterParameterGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBClusterParameterGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :db-cluster-parameter-group-name)]
      (. builder dbClusterParameterGroupName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-cluster-parameter-group-props-builder
  "The cfn-db-cluster-parameter-group-props-builder function buildes out new instances of 
CfnDBClusterParameterGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbClusterParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-cluster-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBClusterParameterGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :db-cluster-parameter-group-name)]
      (. builder dbClusterParameterGroupName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-cluster-props-builder
  "The cfn-db-cluster-props-builder function buildes out new instances of 
CfnDBClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |"
  [stack id config]
  (let [builder (CfnDBClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :associated-roles)]
      (. builder associatedRoles data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :backtrack-window)]
      (. builder backtrackWindow data))
    (when-let [data (lookup-entry config id :backup-retention-period)]
      (. builder backupRetentionPeriod data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :db-cluster-identifier)]
      (. builder dbClusterIdentifier data))
    (when-let [data (lookup-entry config id :db-cluster-instance-class)]
      (. builder dbClusterInstanceClass data))
    (when-let [data (lookup-entry config id :db-cluster-parameter-group-name)]
      (. builder dbClusterParameterGroupName data))
    (when-let [data (lookup-entry config id :db-instance-parameter-group-name)]
      (. builder dbInstanceParameterGroupName data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :db-system-id)]
      (. builder dbSystemId data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-iam-role-name)]
      (. builder domainIamRoleName data))
    (when-let [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
      (. builder enableCloudwatchLogsExports data))
    (when-let [data (lookup-entry config id :enable-global-write-forwarding)]
      (. builder enableGlobalWriteForwarding data))
    (when-let [data (lookup-entry config id :enable-http-endpoint)]
      (. builder enableHttpEndpoint data))
    (when-let [data (lookup-entry config id :enable-iam-database-authentication)]
      (. builder enableIamDatabaseAuthentication data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :engine-mode)]
      (. builder engineMode data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :global-cluster-identifier)]
      (. builder globalClusterIdentifier data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :manage-master-user-password)]
      (. builder manageMasterUserPassword data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (when-let [data (lookup-entry config id :master-user-secret)]
      (. builder masterUserSecret data))
    (when-let [data (lookup-entry config id :master-username)]
      (. builder masterUsername data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role-arn)]
      (. builder monitoringRoleArn data))
    (when-let [data (lookup-entry config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :performance-insights-enabled)]
      (. builder performanceInsightsEnabled data))
    (when-let [data (lookup-entry config id :performance-insights-kms-key-id)]
      (. builder performanceInsightsKmsKeyId data))
    (when-let [data (lookup-entry config id :performance-insights-retention-period)]
      (. builder performanceInsightsRetentionPeriod data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :replication-source-identifier)]
      (. builder replicationSourceIdentifier data))
    (when-let [data (lookup-entry config id :restore-to-time)]
      (. builder restoreToTime data))
    (when-let [data (lookup-entry config id :restore-type)]
      (. builder restoreType data))
    (when-let [data (lookup-entry config id :scaling-configuration)]
      (. builder scalingConfiguration data))
    (when-let [data (lookup-entry config id :serverless-v2-scaling-configuration)]
      (. builder serverlessV2ScalingConfiguration data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :source-db-cluster-identifier)]
      (. builder sourceDbClusterIdentifier data))
    (when-let [data (lookup-entry config id :source-region)]
      (. builder sourceRegion data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :use-latest-restorable-time)]
      (. builder useLatestRestorableTime data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (.build builder)))


(defn cfn-db-cluster-read-endpoint-property-builder
  "The cfn-db-cluster-read-endpoint-property-builder function buildes out new instances of 
CfnDBCluster$ReadEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |"
  [stack id config]
  (let [builder (CfnDBCluster$ReadEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (.build builder)))


(defn cfn-db-cluster-scaling-configuration-property-builder
  "The cfn-db-cluster-scaling-configuration-property-builder function buildes out new instances of 
CfnDBCluster$ScalingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPause` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-pause` |
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |
| `secondsBeforeTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seconds-before-timeout` |
| `secondsUntilAutoPause` | java.lang.Number | [[cdk.support/lookup-entry]] | `:seconds-until-auto-pause` |
| `timeoutAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout-action` |"
  [stack id config]
  (let [builder (CfnDBCluster$ScalingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-pause)]
      (. builder autoPause data))
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (when-let [data (lookup-entry config id :seconds-before-timeout)]
      (. builder secondsBeforeTimeout data))
    (when-let [data (lookup-entry config id :seconds-until-auto-pause)]
      (. builder secondsUntilAutoPause data))
    (when-let [data (lookup-entry config id :timeout-action)]
      (. builder timeoutAction data))
    (.build builder)))


(defn cfn-db-cluster-serverless-v2-scaling-configuration-property-builder
  "The cfn-db-cluster-serverless-v2-scaling-configuration-property-builder function buildes out new instances of 
CfnDBCluster$ServerlessV2ScalingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maxCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-capacity` |
| `minCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-capacity` |"
  [stack id config]
  (let [builder (CfnDBCluster$ServerlessV2ScalingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (lookup-entry config id :min-capacity)]
      (. builder minCapacity data))
    (.build builder)))


(defn cfn-db-instance-builder
  "The cfn-db-instance-builder function buildes out new instances of 
CfnDBInstance$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-groups` |"
  [stack id config]
  (let [builder (CfnDBInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :associated-roles)]
      (. builder associatedRoles data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :automatic-backup-replication-kms-key-id)]
      (. builder automaticBackupReplicationKmsKeyId data))
    (when-let [data (lookup-entry config id :automatic-backup-replication-region)]
      (. builder automaticBackupReplicationRegion data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention-period)]
      (. builder backupRetentionPeriod data))
    (when-let [data (lookup-entry config id :ca-certificate-identifier)]
      (. builder caCertificateIdentifier data))
    (when-let [data (lookup-entry config id :certificate-details)]
      (. builder certificateDetails data))
    (when-let [data (lookup-entry config id :certificate-rotation-restart)]
      (. builder certificateRotationRestart data))
    (when-let [data (lookup-entry config id :character-set-name)]
      (. builder characterSetName data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :custom-iam-instance-profile)]
      (. builder customIamInstanceProfile data))
    (when-let [data (lookup-entry config id :db-cluster-identifier)]
      (. builder dbClusterIdentifier data))
    (when-let [data (lookup-entry config id :db-cluster-snapshot-identifier)]
      (. builder dbClusterSnapshotIdentifier data))
    (when-let [data (lookup-entry config id :db-instance-class)]
      (. builder dbInstanceClass data))
    (when-let [data (lookup-entry config id :db-instance-identifier)]
      (. builder dbInstanceIdentifier data))
    (when-let [data (lookup-entry config id :db-name)]
      (. builder dbName data))
    (when-let [data (lookup-entry config id :db-parameter-group-name)]
      (. builder dbParameterGroupName data))
    (when-let [data (lookup-entry config id :db-security-groups)]
      (. builder dbSecurityGroups data))
    (when-let [data (lookup-entry config id :db-snapshot-identifier)]
      (. builder dbSnapshotIdentifier data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :dedicated-log-volume)]
      (. builder dedicatedLogVolume data))
    (when-let [data (lookup-entry config id :delete-automated-backups)]
      (. builder deleteAutomatedBackups data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-auth-secret-arn)]
      (. builder domainAuthSecretArn data))
    (when-let [data (lookup-entry config id :domain-dns-ips)]
      (. builder domainDnsIps data))
    (when-let [data (lookup-entry config id :domain-fqdn)]
      (. builder domainFqdn data))
    (when-let [data (lookup-entry config id :domain-iam-role-name)]
      (. builder domainIamRoleName data))
    (when-let [data (lookup-entry config id :domain-ou)]
      (. builder domainOu data))
    (when-let [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
      (. builder enableCloudwatchLogsExports data))
    (when-let [data (lookup-entry config id :enable-iam-database-authentication)]
      (. builder enableIamDatabaseAuthentication data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :license-model)]
      (. builder licenseModel data))
    (when-let [data (lookup-entry config id :manage-master-user-password)]
      (. builder manageMasterUserPassword data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (when-let [data (lookup-entry config id :master-user-secret)]
      (. builder masterUserSecret data))
    (when-let [data (lookup-entry config id :master-username)]
      (. builder masterUsername data))
    (when-let [data (lookup-entry config id :max-allocated-storage)]
      (. builder maxAllocatedStorage data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role-arn)]
      (. builder monitoringRoleArn data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (lookup-entry config id :nchar-character-set-name)]
      (. builder ncharCharacterSetName data))
    (when-let [data (lookup-entry config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :option-group-name)]
      (. builder optionGroupName data))
    (when-let [data (lookup-entry config id :performance-insights-kms-key-id)]
      (. builder performanceInsightsKmsKeyId data))
    (when-let [data (lookup-entry config id :performance-insights-retention-period)]
      (. builder performanceInsightsRetentionPeriod data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :processor-features)]
      (. builder processorFeatures data))
    (when-let [data (lookup-entry config id :promotion-tier)]
      (. builder promotionTier data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :replica-mode)]
      (. builder replicaMode data))
    (when-let [data (lookup-entry config id :restore-time)]
      (. builder restoreTime data))
    (when-let [data (lookup-entry config id :source-db-cluster-identifier)]
      (. builder sourceDbClusterIdentifier data))
    (when-let [data (lookup-entry config id :source-db-instance-automated-backups-arn)]
      (. builder sourceDbInstanceAutomatedBackupsArn data))
    (when-let [data (lookup-entry config id :source-db-instance-identifier)]
      (. builder sourceDbInstanceIdentifier data))
    (when-let [data (lookup-entry config id :source-dbi-resource-id)]
      (. builder sourceDbiResourceId data))
    (when-let [data (lookup-entry config id :source-region)]
      (. builder sourceRegion data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-throughput)]
      (. builder storageThroughput data))
    (when-let [data (lookup-entry config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tde-credential-arn)]
      (. builder tdeCredentialArn data))
    (when-let [data (lookup-entry config id :tde-credential-password)]
      (. builder tdeCredentialPassword data))
    (when-let [data (lookup-entry config id :timezone)]
      (. builder timezone data))
    (when-let [data (lookup-entry config id :use-default-processor-features)]
      (. builder useDefaultProcessorFeatures data))
    (when-let [data (lookup-entry config id :use-latest-restorable-time)]
      (. builder useLatestRestorableTime data))
    (when-let [data (lookup-entry config id :vpc-security-groups)]
      (. builder vpcSecurityGroups data))
    (.build builder)))


(defn cfn-db-instance-certificate-details-property-builder
  "The cfn-db-instance-certificate-details-property-builder function buildes out new instances of 
CfnDBInstance$CertificateDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-identifier` |
| `validTill` | java.lang.String | [[cdk.support/lookup-entry]] | `:valid-till` |"
  [stack id config]
  (let [builder (CfnDBInstance$CertificateDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :ca-identifier)]
      (. builder caIdentifier data))
    (when-let [data (lookup-entry config id :valid-till)]
      (. builder validTill data))
    (.build builder)))


(defn cfn-db-instance-db-instance-role-property-builder
  "The cfn-db-instance-db-instance-role-property-builder function buildes out new instances of 
CfnDBInstance$DBInstanceRoleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `featureName` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDBInstance$DBInstanceRoleProperty$Builder.)]
    (when-let [data (lookup-entry config id :feature-name)]
      (. builder featureName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-db-instance-endpoint-property-builder
  "The cfn-db-instance-endpoint-property-builder function buildes out new instances of 
CfnDBInstance$EndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `address` | java.lang.String | [[cdk.support/lookup-entry]] | `:address` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (CfnDBInstance$EndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :address)]
      (. builder address data))
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cfn-db-instance-master-user-secret-property-builder
  "The cfn-db-instance-master-user-secret-property-builder function buildes out new instances of 
CfnDBInstance$MasterUserSecretProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |"
  [stack id config]
  (let [builder (CfnDBInstance$MasterUserSecretProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (.build builder)))


(defn cfn-db-instance-processor-feature-property-builder
  "The cfn-db-instance-processor-feature-property-builder function buildes out new instances of 
CfnDBInstance$ProcessorFeatureProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDBInstance$ProcessorFeatureProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-db-instance-props-builder
  "The cfn-db-instance-props-builder function buildes out new instances of 
CfnDBInstanceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSecurityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-groups` |"
  [stack id config]
  (let [builder (CfnDBInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :associated-roles)]
      (. builder associatedRoles data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :automatic-backup-replication-kms-key-id)]
      (. builder automaticBackupReplicationKmsKeyId data))
    (when-let [data (lookup-entry config id :automatic-backup-replication-region)]
      (. builder automaticBackupReplicationRegion data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention-period)]
      (. builder backupRetentionPeriod data))
    (when-let [data (lookup-entry config id :ca-certificate-identifier)]
      (. builder caCertificateIdentifier data))
    (when-let [data (lookup-entry config id :certificate-details)]
      (. builder certificateDetails data))
    (when-let [data (lookup-entry config id :certificate-rotation-restart)]
      (. builder certificateRotationRestart data))
    (when-let [data (lookup-entry config id :character-set-name)]
      (. builder characterSetName data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :custom-iam-instance-profile)]
      (. builder customIamInstanceProfile data))
    (when-let [data (lookup-entry config id :db-cluster-identifier)]
      (. builder dbClusterIdentifier data))
    (when-let [data (lookup-entry config id :db-cluster-snapshot-identifier)]
      (. builder dbClusterSnapshotIdentifier data))
    (when-let [data (lookup-entry config id :db-instance-class)]
      (. builder dbInstanceClass data))
    (when-let [data (lookup-entry config id :db-instance-identifier)]
      (. builder dbInstanceIdentifier data))
    (when-let [data (lookup-entry config id :db-name)]
      (. builder dbName data))
    (when-let [data (lookup-entry config id :db-parameter-group-name)]
      (. builder dbParameterGroupName data))
    (when-let [data (lookup-entry config id :db-security-groups)]
      (. builder dbSecurityGroups data))
    (when-let [data (lookup-entry config id :db-snapshot-identifier)]
      (. builder dbSnapshotIdentifier data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :dedicated-log-volume)]
      (. builder dedicatedLogVolume data))
    (when-let [data (lookup-entry config id :delete-automated-backups)]
      (. builder deleteAutomatedBackups data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-auth-secret-arn)]
      (. builder domainAuthSecretArn data))
    (when-let [data (lookup-entry config id :domain-dns-ips)]
      (. builder domainDnsIps data))
    (when-let [data (lookup-entry config id :domain-fqdn)]
      (. builder domainFqdn data))
    (when-let [data (lookup-entry config id :domain-iam-role-name)]
      (. builder domainIamRoleName data))
    (when-let [data (lookup-entry config id :domain-ou)]
      (. builder domainOu data))
    (when-let [data (lookup-entry config id :enable-cloudwatch-logs-exports)]
      (. builder enableCloudwatchLogsExports data))
    (when-let [data (lookup-entry config id :enable-iam-database-authentication)]
      (. builder enableIamDatabaseAuthentication data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :license-model)]
      (. builder licenseModel data))
    (when-let [data (lookup-entry config id :manage-master-user-password)]
      (. builder manageMasterUserPassword data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (when-let [data (lookup-entry config id :master-user-secret)]
      (. builder masterUserSecret data))
    (when-let [data (lookup-entry config id :master-username)]
      (. builder masterUsername data))
    (when-let [data (lookup-entry config id :max-allocated-storage)]
      (. builder maxAllocatedStorage data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role-arn)]
      (. builder monitoringRoleArn data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (lookup-entry config id :nchar-character-set-name)]
      (. builder ncharCharacterSetName data))
    (when-let [data (lookup-entry config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :option-group-name)]
      (. builder optionGroupName data))
    (when-let [data (lookup-entry config id :performance-insights-kms-key-id)]
      (. builder performanceInsightsKmsKeyId data))
    (when-let [data (lookup-entry config id :performance-insights-retention-period)]
      (. builder performanceInsightsRetentionPeriod data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :processor-features)]
      (. builder processorFeatures data))
    (when-let [data (lookup-entry config id :promotion-tier)]
      (. builder promotionTier data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :replica-mode)]
      (. builder replicaMode data))
    (when-let [data (lookup-entry config id :restore-time)]
      (. builder restoreTime data))
    (when-let [data (lookup-entry config id :source-db-cluster-identifier)]
      (. builder sourceDbClusterIdentifier data))
    (when-let [data (lookup-entry config id :source-db-instance-automated-backups-arn)]
      (. builder sourceDbInstanceAutomatedBackupsArn data))
    (when-let [data (lookup-entry config id :source-db-instance-identifier)]
      (. builder sourceDbInstanceIdentifier data))
    (when-let [data (lookup-entry config id :source-dbi-resource-id)]
      (. builder sourceDbiResourceId data))
    (when-let [data (lookup-entry config id :source-region)]
      (. builder sourceRegion data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-throughput)]
      (. builder storageThroughput data))
    (when-let [data (lookup-entry config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tde-credential-arn)]
      (. builder tdeCredentialArn data))
    (when-let [data (lookup-entry config id :tde-credential-password)]
      (. builder tdeCredentialPassword data))
    (when-let [data (lookup-entry config id :timezone)]
      (. builder timezone data))
    (when-let [data (lookup-entry config id :use-default-processor-features)]
      (. builder useDefaultProcessorFeatures data))
    (when-let [data (lookup-entry config id :use-latest-restorable-time)]
      (. builder useLatestRestorableTime data))
    (when-let [data (lookup-entry config id :vpc-security-groups)]
      (. builder vpcSecurityGroups data))
    (.build builder)))


(defn cfn-db-parameter-group-builder
  "The cfn-db-parameter-group-builder function buildes out new instances of 
CfnDBParameterGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBParameterGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :db-parameter-group-name)]
      (. builder dbParameterGroupName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-parameter-group-props-builder
  "The cfn-db-parameter-group-props-builder function buildes out new instances of 
CfnDBParameterGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbParameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-parameter-group-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBParameterGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :db-parameter-group-name)]
      (. builder dbParameterGroupName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-proxy-auth-format-property-builder
  "The cfn-db-proxy-auth-format-property-builder function buildes out new instances of 
CfnDBProxy$AuthFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authScheme` | java.lang.String | [[cdk.support/lookup-entry]] | `:auth-scheme` |
| `clientPasswordAuthType` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-password-auth-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `iamAuth` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-auth` |
| `secretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-arn` |"
  [stack id config]
  (let [builder (CfnDBProxy$AuthFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :auth-scheme)]
      (. builder authScheme data))
    (when-let [data (lookup-entry config id :client-password-auth-type)]
      (. builder clientPasswordAuthType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :iam-auth)]
      (. builder iamAuth data))
    (when-let [data (lookup-entry config id :secret-arn)]
      (. builder secretArn data))
    (.build builder)))


(defn cfn-db-proxy-builder
  "The cfn-db-proxy-builder function buildes out new instances of 
CfnDBProxy$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |"
  [stack id config]
  (let [builder (CfnDBProxy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auth)]
      (. builder auth data))
    (when-let [data (lookup-entry config id :db-proxy-name)]
      (. builder dbProxyName data))
    (when-let [data (lookup-entry config id :debug-logging)]
      (. builder debugLogging data))
    (when-let [data (lookup-entry config id :engine-family)]
      (. builder engineFamily data))
    (when-let [data (lookup-entry config id :idle-client-timeout)]
      (. builder idleClientTimeout data))
    (when-let [data (lookup-entry config id :require-tls)]
      (. builder requireTls data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (when-let [data (lookup-entry config id :vpc-subnet-ids)]
      (. builder vpcSubnetIds data))
    (.build builder)))


(defn cfn-db-proxy-endpoint-builder
  "The cfn-db-proxy-endpoint-builder function buildes out new instances of 
CfnDBProxyEndpoint$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbProxyEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-endpoint-name` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-role` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |"
  [stack id config]
  (let [builder (CfnDBProxyEndpoint$Builder/create stack id)]
    (when-let [data (lookup-entry config id :db-proxy-endpoint-name)]
      (. builder dbProxyEndpointName data))
    (when-let [data (lookup-entry config id :db-proxy-name)]
      (. builder dbProxyName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-role)]
      (. builder targetRole data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (when-let [data (lookup-entry config id :vpc-subnet-ids)]
      (. builder vpcSubnetIds data))
    (.build builder)))


(defn cfn-db-proxy-endpoint-props-builder
  "The cfn-db-proxy-endpoint-props-builder function buildes out new instances of 
CfnDBProxyEndpointProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbProxyEndpointName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-endpoint-name` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-role` |
| `vpcSecurityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |"
  [stack id config]
  (let [builder (CfnDBProxyEndpointProps$Builder.)]
    (when-let [data (lookup-entry config id :db-proxy-endpoint-name)]
      (. builder dbProxyEndpointName data))
    (when-let [data (lookup-entry config id :db-proxy-name)]
      (. builder dbProxyName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-role)]
      (. builder targetRole data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (when-let [data (lookup-entry config id :vpc-subnet-ids)]
      (. builder vpcSubnetIds data))
    (.build builder)))


(defn cfn-db-proxy-endpoint-tag-format-property-builder
  "The cfn-db-proxy-endpoint-tag-format-property-builder function buildes out new instances of 
CfnDBProxyEndpoint$TagFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDBProxyEndpoint$TagFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-db-proxy-props-builder
  "The cfn-db-proxy-props-builder function buildes out new instances of 
CfnDBProxyProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |"
  [stack id config]
  (let [builder (CfnDBProxyProps$Builder.)]
    (when-let [data (lookup-entry config id :auth)]
      (. builder auth data))
    (when-let [data (lookup-entry config id :db-proxy-name)]
      (. builder dbProxyName data))
    (when-let [data (lookup-entry config id :debug-logging)]
      (. builder debugLogging data))
    (when-let [data (lookup-entry config id :engine-family)]
      (. builder engineFamily data))
    (when-let [data (lookup-entry config id :idle-client-timeout)]
      (. builder idleClientTimeout data))
    (when-let [data (lookup-entry config id :require-tls)]
      (. builder requireTls data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (when-let [data (lookup-entry config id :vpc-subnet-ids)]
      (. builder vpcSubnetIds data))
    (.build builder)))


(defn cfn-db-proxy-tag-format-property-builder
  "The cfn-db-proxy-tag-format-property-builder function buildes out new instances of 
CfnDBProxy$TagFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnDBProxy$TagFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-db-proxy-target-group-builder
  "The cfn-db-proxy-target-group-builder function buildes out new instances of 
CfnDBProxyTargetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPoolConfigurationInfo` | software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty | [[cdk.support/lookup-entry]] | `:connection-pool-configuration-info` |
| `dbClusterIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:db-cluster-identifiers` |
| `dbInstanceIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:db-instance-identifiers` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |"
  [stack id config]
  (let [builder (CfnDBProxyTargetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :connection-pool-configuration-info)]
      (. builder connectionPoolConfigurationInfo data))
    (when-let [data (lookup-entry config id :db-cluster-identifiers)]
      (. builder dbClusterIdentifiers data))
    (when-let [data (lookup-entry config id :db-instance-identifiers)]
      (. builder dbInstanceIdentifiers data))
    (when-let [data (lookup-entry config id :db-proxy-name)]
      (. builder dbProxyName data))
    (when-let [data (lookup-entry config id :target-group-name)]
      (. builder targetGroupName data))
    (.build builder)))


(defn cfn-db-proxy-target-group-connection-pool-configuration-info-format-property-builder
  "The cfn-db-proxy-target-group-connection-pool-configuration-info-format-property-builder function buildes out new instances of 
CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionBorrowTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:connection-borrow-timeout` |
| `initQuery` | java.lang.String | [[cdk.support/lookup-entry]] | `:init-query` |
| `maxConnectionsPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-connections-percent` |
| `maxIdleConnectionsPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-idle-connections-percent` |
| `sessionPinningFilters` | java.util.List | [[cdk.support/lookup-entry]] | `:session-pinning-filters` |"
  [stack id config]
  (let [builder (CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty$Builder.)]
    (when-let [data (lookup-entry config id :connection-borrow-timeout)]
      (. builder connectionBorrowTimeout data))
    (when-let [data (lookup-entry config id :init-query)]
      (. builder initQuery data))
    (when-let [data (lookup-entry config id :max-connections-percent)]
      (. builder maxConnectionsPercent data))
    (when-let [data (lookup-entry config id :max-idle-connections-percent)]
      (. builder maxIdleConnectionsPercent data))
    (when-let [data (lookup-entry config id :session-pinning-filters)]
      (. builder sessionPinningFilters data))
    (.build builder)))


(defn cfn-db-proxy-target-group-props-builder
  "The cfn-db-proxy-target-group-props-builder function buildes out new instances of 
CfnDBProxyTargetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectionPoolConfigurationInfo` | software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup$ConnectionPoolConfigurationInfoFormatProperty | [[cdk.support/lookup-entry]] | `:connection-pool-configuration-info` |
| `dbClusterIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:db-cluster-identifiers` |
| `dbInstanceIdentifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:db-instance-identifiers` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `targetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-group-name` |"
  [stack id config]
  (let [builder (CfnDBProxyTargetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :connection-pool-configuration-info)]
      (. builder connectionPoolConfigurationInfo data))
    (when-let [data (lookup-entry config id :db-cluster-identifiers)]
      (. builder dbClusterIdentifiers data))
    (when-let [data (lookup-entry config id :db-instance-identifiers)]
      (. builder dbInstanceIdentifiers data))
    (when-let [data (lookup-entry config id :db-proxy-name)]
      (. builder dbProxyName data))
    (when-let [data (lookup-entry config id :target-group-name)]
      (. builder targetGroupName data))
    (.build builder)))


(defn cfn-db-security-group-builder
  "The cfn-db-security-group-builder function buildes out new instances of 
CfnDBSecurityGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSecurityGroupIngress` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:db-security-group-ingress` |
| `ec2VpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-vpc-id` |
| `groupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBSecurityGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :db-security-group-ingress)]
      (. builder dbSecurityGroupIngress data))
    (when-let [data (lookup-entry config id :ec2-vpc-id)]
      (. builder ec2VpcId data))
    (when-let [data (lookup-entry config id :group-description)]
      (. builder groupDescription data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-security-group-ingress-builder
  "The cfn-db-security-group-ingress-builder function buildes out new instances of 
CfnDBSecurityGroupIngress$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrip` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidrip` |
| `dbSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-security-group-name` |
| `ec2SecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-id` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |"
  [stack id config]
  (let [builder (CfnDBSecurityGroupIngress$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cidrip)]
      (. builder cidrip data))
    (when-let [data (lookup-entry config id :db-security-group-name)]
      (. builder dbSecurityGroupName data))
    (when-let [data (lookup-entry config id :ec2-security-group-id)]
      (. builder ec2SecurityGroupId data))
    (when-let [data (lookup-entry config id :ec2-security-group-name)]
      (. builder ec2SecurityGroupName data))
    (when-let [data (lookup-entry config id :ec2-security-group-owner-id)]
      (. builder ec2SecurityGroupOwnerId data))
    (.build builder)))


(defn cfn-db-security-group-ingress-property-builder
  "The cfn-db-security-group-ingress-property-builder function buildes out new instances of 
CfnDBSecurityGroup$IngressProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrip` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidrip` |
| `ec2SecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-id` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |"
  [stack id config]
  (let [builder (CfnDBSecurityGroup$IngressProperty$Builder.)]
    (when-let [data (lookup-entry config id :cidrip)]
      (. builder cidrip data))
    (when-let [data (lookup-entry config id :ec2-security-group-id)]
      (. builder ec2SecurityGroupId data))
    (when-let [data (lookup-entry config id :ec2-security-group-name)]
      (. builder ec2SecurityGroupName data))
    (when-let [data (lookup-entry config id :ec2-security-group-owner-id)]
      (. builder ec2SecurityGroupOwnerId data))
    (.build builder)))


(defn cfn-db-security-group-ingress-props-builder
  "The cfn-db-security-group-ingress-props-builder function buildes out new instances of 
CfnDBSecurityGroupIngressProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrip` | java.lang.String | [[cdk.support/lookup-entry]] | `:cidrip` |
| `dbSecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-security-group-name` |
| `ec2SecurityGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-id` |
| `ec2SecurityGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-name` |
| `ec2SecurityGroupOwnerId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-security-group-owner-id` |"
  [stack id config]
  (let [builder (CfnDBSecurityGroupIngressProps$Builder.)]
    (when-let [data (lookup-entry config id :cidrip)]
      (. builder cidrip data))
    (when-let [data (lookup-entry config id :db-security-group-name)]
      (. builder dbSecurityGroupName data))
    (when-let [data (lookup-entry config id :ec2-security-group-id)]
      (. builder ec2SecurityGroupId data))
    (when-let [data (lookup-entry config id :ec2-security-group-name)]
      (. builder ec2SecurityGroupName data))
    (when-let [data (lookup-entry config id :ec2-security-group-owner-id)]
      (. builder ec2SecurityGroupOwnerId data))
    (.build builder)))


(defn cfn-db-security-group-props-builder
  "The cfn-db-security-group-props-builder function buildes out new instances of 
CfnDBSecurityGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSecurityGroupIngress` | java.util.List | [[cdk.support/lookup-entry]] | `:db-security-group-ingress` |
| `ec2VpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ec2-vpc-id` |
| `groupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBSecurityGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :db-security-group-ingress)]
      (. builder dbSecurityGroupIngress data))
    (when-let [data (lookup-entry config id :ec2-vpc-id)]
      (. builder ec2VpcId data))
    (when-let [data (lookup-entry config id :group-description)]
      (. builder groupDescription data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-subnet-group-builder
  "The cfn-db-subnet-group-builder function buildes out new instances of 
CfnDBSubnetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSubnetGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-description` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBSubnetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :db-subnet-group-description)]
      (. builder dbSubnetGroupDescription data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-db-subnet-group-props-builder
  "The cfn-db-subnet-group-props-builder function buildes out new instances of 
CfnDBSubnetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSubnetGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-description` |
| `dbSubnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-subnet-group-name` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDBSubnetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :db-subnet-group-description)]
      (. builder dbSubnetGroupDescription data))
    (when-let [data (lookup-entry config id :db-subnet-group-name)]
      (. builder dbSubnetGroupName data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-event-subscription-builder
  "The cfn-event-subscription-builder function buildes out new instances of 
CfnEventSubscription$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `eventCategories` | java.util.List | [[cdk.support/lookup-entry]] | `:event-categories` |
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


(defn cfn-global-cluster-builder
  "The cfn-global-cluster-builder function buildes out new instances of 
CfnGlobalCluster$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `globalClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-cluster-identifier` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `storageEncrypted` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:storage-encrypted` |"
  [stack id config]
  (let [builder (CfnGlobalCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :global-cluster-identifier)]
      (. builder globalClusterIdentifier data))
    (when-let [data (lookup-entry config id :source-db-cluster-identifier)]
      (. builder sourceDbClusterIdentifier data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (.build builder)))


(defn cfn-global-cluster-props-builder
  "The cfn-global-cluster-props-builder function buildes out new instances of 
CfnGlobalClusterProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deletion-protection` |
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `globalClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:global-cluster-identifier` |
| `sourceDbClusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-db-cluster-identifier` |
| `storageEncrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:storage-encrypted` |"
  [stack id config]
  (let [builder (CfnGlobalClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :global-cluster-identifier)]
      (. builder globalClusterIdentifier data))
    (when-let [data (lookup-entry config id :source-db-cluster-identifier)]
      (. builder sourceDbClusterIdentifier data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (.build builder)))


(defn cfn-integration-builder
  "The cfn-integration-builder function buildes out new instances of 
CfnIntegration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `dataFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-filter` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `integrationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnIntegration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-encryption-context)]
      (. builder additionalEncryptionContext data))
    (when-let [data (lookup-entry config id :data-filter)]
      (. builder dataFilter data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :integration-name)]
      (. builder integrationName data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-integration-props-builder
  "The cfn-integration-props-builder function buildes out new instances of 
CfnIntegrationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalEncryptionContext` | java.util.Map | [[cdk.support/lookup-entry]] | `:additional-encryption-context` |
| `dataFilter` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-filter` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `integrationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-name` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnIntegrationProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-encryption-context)]
      (. builder additionalEncryptionContext data))
    (when-let [data (lookup-entry config id :data-filter)]
      (. builder dataFilter data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :integration-name)]
      (. builder integrationName data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-option-group-builder
  "The cfn-option-group-builder function buildes out new instances of 
CfnOptionGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-name` |
| `majorEngineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-engine-version` |
| `optionConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:option-configurations` |
| `optionGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-group-description` |
| `optionGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnOptionGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :engine-name)]
      (. builder engineName data))
    (when-let [data (lookup-entry config id :major-engine-version)]
      (. builder majorEngineVersion data))
    (when-let [data (lookup-entry config id :option-configurations)]
      (. builder optionConfigurations data))
    (when-let [data (lookup-entry config id :option-group-description)]
      (. builder optionGroupDescription data))
    (when-let [data (lookup-entry config id :option-group-name)]
      (. builder optionGroupName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-option-group-option-configuration-property-builder
  "The cfn-option-group-option-configuration-property-builder function buildes out new instances of 
CfnOptionGroup$OptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbSecurityGroupMemberships` | java.util.List | [[cdk.support/lookup-entry]] | `:db-security-group-memberships` |
| `optionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-name` |
| `optionSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:option-settings` |
| `optionVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-version` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `vpcSecurityGroupMemberships` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-security-group-memberships` |"
  [stack id config]
  (let [builder (CfnOptionGroup$OptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :db-security-group-memberships)]
      (. builder dbSecurityGroupMemberships data))
    (when-let [data (lookup-entry config id :option-name)]
      (. builder optionName data))
    (when-let [data (lookup-entry config id :option-settings)]
      (. builder optionSettings data))
    (when-let [data (lookup-entry config id :option-version)]
      (. builder optionVersion data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :vpc-security-group-memberships)]
      (. builder vpcSecurityGroupMemberships data))
    (.build builder)))


(defn cfn-option-group-option-setting-property-builder
  "The cfn-option-group-option-setting-property-builder function buildes out new instances of 
CfnOptionGroup$OptionSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnOptionGroup$OptionSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-option-group-props-builder
  "The cfn-option-group-props-builder function buildes out new instances of 
CfnOptionGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-name` |
| `majorEngineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-engine-version` |
| `optionConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:option-configurations` |
| `optionGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-group-description` |
| `optionGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnOptionGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :engine-name)]
      (. builder engineName data))
    (when-let [data (lookup-entry config id :major-engine-version)]
      (. builder majorEngineVersion data))
    (when-let [data (lookup-entry config id :option-configurations)]
      (. builder optionConfigurations data))
    (when-let [data (lookup-entry config id :option-group-description)]
      (. builder optionGroupDescription data))
    (when-let [data (lookup-entry config id :option-group-name)]
      (. builder optionGroupName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cluster-engine-bind-options-builder
  "The cluster-engine-bind-options-builder function buildes out new instances of 
ClusterEngineBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |"
  [stack id config]
  (let [builder (ClusterEngineBindOptions$Builder.)]
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (.build builder)))


(defn cluster-engine-config-builder
  "The cluster-engine-config-builder function buildes out new instances of 
ClusterEngineConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `features` | software.amazon.awscdk.services.rds.ClusterEngineFeatures | [[cdk.support/lookup-entry]] | `:features` |
| `parameterGroup` | software.amazon.awscdk.services.rds.IParameterGroup | [[cdk.support/lookup-entry]] | `:parameter-group` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (ClusterEngineConfig$Builder.)]
    (when-let [data (lookup-entry config id :features)]
      (. builder features data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn cluster-engine-features-builder
  "The cluster-engine-features-builder function buildes out new instances of 
ClusterEngineFeatures$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Export` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-export` |
| `s3Import` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-import` |"
  [stack id config]
  (let [builder (ClusterEngineFeatures$Builder.)]
    (when-let [data (lookup-entry config id :s3-export)]
      (. builder s3Export data))
    (when-let [data (lookup-entry config id :s3-import)]
      (. builder s3Import data))
    (.build builder)))


(defn cluster-instance-bind-options-builder
  "The cluster-instance-bind-options-builder function buildes out new instances of 
ClusterInstanceBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `monitoringInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:monitoring-interval` |
| `monitoringRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:monitoring-role` |
| `promotionTier` | java.lang.Number | [[cdk.support/lookup-entry]] | `:promotion-tier` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `subnetGroup` | software.amazon.awscdk.services.rds.ISubnetGroup | [[cdk.support/lookup-entry]] | `:subnet-group` |"
  [stack id config]
  (let [builder (ClusterInstanceBindOptions$Builder.)]
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (lookup-entry config id :promotion-tier)]
      (. builder promotionTier data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (.build builder)))


(defn cluster-instance-options-builder
  "The cluster-instance-options-builder function buildes out new instances of 
ClusterInstanceOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |"
  [stack id config]
  (let [builder (ClusterInstanceOptions$Builder.)]
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :is-from-legacy-instance-props)]
      (. builder isFromLegacyInstanceProps data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (.build builder)))


(defn cluster-instance-props-builder
  "The cluster-instance-props-builder function buildes out new instances of 
ClusterInstanceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |"
  [stack id config]
  (let [builder (ClusterInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :is-from-legacy-instance-props)]
      (. builder isFromLegacyInstanceProps data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :promotion-tier)]
      (. builder promotionTier data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (.build builder)))


(defn common-rotation-user-options-builder
  "The common-rotation-user-options-builder function buildes out new instances of 
CommonRotationUserOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `endpoint` | software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint | [[cdk.support/lookup-entry]] | `:endpoint` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (CommonRotationUserOptions$Builder.)]
    (when-let [data (lookup-entry config id :automatically-after)]
      (. builder automaticallyAfter data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :rotate-immediately-on-update)]
      (. builder rotateImmediatelyOnUpdate data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn credentials-base-options-builder
  "The credentials-base-options-builder function buildes out new instances of 
CredentialsBaseOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |"
  [stack id config]
  (let [builder (CredentialsBaseOptions$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :replica-regions)]
      (. builder replicaRegions data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (.build builder)))


(defn credentials-from-username-options-builder
  "The credentials-from-username-options-builder function buildes out new instances of 
CredentialsFromUsernameOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `password` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:password` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |"
  [stack id config]
  (let [builder (CredentialsFromUsernameOptions$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :replica-regions)]
      (. builder replicaRegions data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (.build builder)))


(defn database-cluster-attributes-builder
  "The database-cluster-attributes-builder function buildes out new instances of 
DatabaseClusterAttributes$Builder using the provided configuration.  Each field is set as follows:

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
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |"
  [stack id config]
  (let [builder (DatabaseClusterAttributes$Builder.)]
    (when-let [data (lookup-entry config id :cluster-endpoint-address)]
      (. builder clusterEndpointAddress data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :cluster-resource-identifier)]
      (. builder clusterResourceIdentifier data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :instance-endpoint-addresses)]
      (. builder instanceEndpointAddresses data))
    (when-let [data (lookup-entry config id :instance-identifiers)]
      (. builder instanceIdentifiers data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :reader-endpoint-address)]
      (. builder readerEndpointAddress data))
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (.build builder)))


(defn database-cluster-builder
  "The database-cluster-builder function buildes out new instances of 
DatabaseCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `writer` | software.amazon.awscdk.services.rds.IClusterInstance | [[cdk.support/lookup-entry]] | `:writer` |"
  [stack id config]
  (let [builder (DatabaseCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :backtrack-window)]
      (. builder backtrackWindow data))
    (when-let [data (lookup-entry config id :backup)]
      (. builder backup data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :default-database-name)]
      (. builder defaultDatabaseName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-data-api)]
      (. builder enableDataApi data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier-base)]
      (. builder instanceIdentifierBase data))
    (when-let [data (lookup-entry config id :instance-props)]
      (. builder instanceProps data))
    (when-let [data (instance-update-behaviour config id :instance-update-behaviour)]
      (. builder instanceUpdateBehaviour data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :readers)]
      (. builder readers data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :serverless-v2-max-capacity)]
      (. builder serverlessV2MaxCapacity data))
    (when-let [data (lookup-entry config id :serverless-v2-min-capacity)]
      (. builder serverlessV2MinCapacity data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-encryption-key)]
      (. builder storageEncryptionKey data))
    (when-let [data (db-cluster-storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (when-let [data (lookup-entry config id :writer)]
      (. builder writer data))
    (.build builder)))


(defn database-cluster-from-snapshot-builder
  "The database-cluster-from-snapshot-builder function buildes out new instances of 
DatabaseClusterFromSnapshot$Builder using the provided configuration.  Each field is set as follows:

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
| `writer` | software.amazon.awscdk.services.rds.IClusterInstance | [[cdk.support/lookup-entry]] | `:writer` |"
  [stack id config]
  (let [builder (DatabaseClusterFromSnapshot$Builder/create stack id)]
    (when-let [data (lookup-entry config id :backtrack-window)]
      (. builder backtrackWindow data))
    (when-let [data (lookup-entry config id :backup)]
      (. builder backup data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :default-database-name)]
      (. builder defaultDatabaseName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-data-api)]
      (. builder enableDataApi data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier-base)]
      (. builder instanceIdentifierBase data))
    (when-let [data (lookup-entry config id :instance-props)]
      (. builder instanceProps data))
    (when-let [data (instance-update-behaviour config id :instance-update-behaviour)]
      (. builder instanceUpdateBehaviour data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :readers)]
      (. builder readers data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :serverless-v2-max-capacity)]
      (. builder serverlessV2MaxCapacity data))
    (when-let [data (lookup-entry config id :serverless-v2-min-capacity)]
      (. builder serverlessV2MinCapacity data))
    (when-let [data (lookup-entry config id :snapshot-credentials)]
      (. builder snapshotCredentials data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-encryption-key)]
      (. builder storageEncryptionKey data))
    (when-let [data (db-cluster-storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (when-let [data (lookup-entry config id :writer)]
      (. builder writer data))
    (.build builder)))


(defn database-cluster-from-snapshot-props-builder
  "The database-cluster-from-snapshot-props-builder function buildes out new instances of 
DatabaseClusterFromSnapshotProps$Builder using the provided configuration.  Each field is set as follows:

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
| `writer` | software.amazon.awscdk.services.rds.IClusterInstance | [[cdk.support/lookup-entry]] | `:writer` |"
  [stack id config]
  (let [builder (DatabaseClusterFromSnapshotProps$Builder.)]
    (when-let [data (lookup-entry config id :backtrack-window)]
      (. builder backtrackWindow data))
    (when-let [data (lookup-entry config id :backup)]
      (. builder backup data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :default-database-name)]
      (. builder defaultDatabaseName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-data-api)]
      (. builder enableDataApi data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier-base)]
      (. builder instanceIdentifierBase data))
    (when-let [data (lookup-entry config id :instance-props)]
      (. builder instanceProps data))
    (when-let [data (instance-update-behaviour config id :instance-update-behaviour)]
      (. builder instanceUpdateBehaviour data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :readers)]
      (. builder readers data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :serverless-v2-max-capacity)]
      (. builder serverlessV2MaxCapacity data))
    (when-let [data (lookup-entry config id :serverless-v2-min-capacity)]
      (. builder serverlessV2MinCapacity data))
    (when-let [data (lookup-entry config id :snapshot-credentials)]
      (. builder snapshotCredentials data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-encryption-key)]
      (. builder storageEncryptionKey data))
    (when-let [data (db-cluster-storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (when-let [data (lookup-entry config id :writer)]
      (. builder writer data))
    (.build builder)))


(defn database-cluster-props-builder
  "The database-cluster-props-builder function buildes out new instances of 
DatabaseClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `writer` | software.amazon.awscdk.services.rds.IClusterInstance | [[cdk.support/lookup-entry]] | `:writer` |"
  [stack id config]
  (let [builder (DatabaseClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :backtrack-window)]
      (. builder backtrackWindow data))
    (when-let [data (lookup-entry config id :backup)]
      (. builder backup data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :default-database-name)]
      (. builder defaultDatabaseName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-data-api)]
      (. builder enableDataApi data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier-base)]
      (. builder instanceIdentifierBase data))
    (when-let [data (lookup-entry config id :instance-props)]
      (. builder instanceProps data))
    (when-let [data (instance-update-behaviour config id :instance-update-behaviour)]
      (. builder instanceUpdateBehaviour data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :readers)]
      (. builder readers data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :serverless-v2-max-capacity)]
      (. builder serverlessV2MaxCapacity data))
    (when-let [data (lookup-entry config id :serverless-v2-min-capacity)]
      (. builder serverlessV2MinCapacity data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-encryption-key)]
      (. builder storageEncryptionKey data))
    (when-let [data (db-cluster-storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (when-let [data (lookup-entry config id :writer)]
      (. builder writer data))
    (.build builder)))


(defn database-instance-attributes-builder
  "The database-instance-attributes-builder function buildes out new instances of 
DatabaseInstanceAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engine` | software.amazon.awscdk.services.rds.IInstanceEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `instanceEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-endpoint-address` |
| `instanceIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-identifier` |
| `instanceResourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-resource-id` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |"
  [stack id config]
  (let [builder (DatabaseInstanceAttributes$Builder.)]
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :instance-endpoint-address)]
      (. builder instanceEndpointAddress data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :instance-resource-id)]
      (. builder instanceResourceId data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (.build builder)))


(defn database-instance-builder
  "The database-instance-builder function buildes out new instances of 
DatabaseInstance$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :character-set-name)]
      (. builder characterSetName data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :delete-automated-backups)]
      (. builder deleteAutomatedBackups data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (license-model config id :license-model)]
      (. builder licenseModel data))
    (when-let [data (lookup-entry config id :max-allocated-storage)]
      (. builder maxAllocatedStorage data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :option-group)]
      (. builder optionGroup data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :processor-features)]
      (. builder processorFeatures data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-encryption-key)]
      (. builder storageEncryptionKey data))
    (when-let [data (lookup-entry config id :storage-throughput)]
      (. builder storageThroughput data))
    (when-let [data (storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :timezone)]
      (. builder timezone data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-instance-from-snapshot-builder
  "The database-instance-from-snapshot-builder function buildes out new instances of 
DatabaseInstanceFromSnapshot$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseInstanceFromSnapshot$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :delete-automated-backups)]
      (. builder deleteAutomatedBackups data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (license-model config id :license-model)]
      (. builder licenseModel data))
    (when-let [data (lookup-entry config id :max-allocated-storage)]
      (. builder maxAllocatedStorage data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :option-group)]
      (. builder optionGroup data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :processor-features)]
      (. builder processorFeatures data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :storage-throughput)]
      (. builder storageThroughput data))
    (when-let [data (storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :timezone)]
      (. builder timezone data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-instance-from-snapshot-props-builder
  "The database-instance-from-snapshot-props-builder function buildes out new instances of 
DatabaseInstanceFromSnapshotProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseInstanceFromSnapshotProps$Builder.)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :delete-automated-backups)]
      (. builder deleteAutomatedBackups data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (license-model config id :license-model)]
      (. builder licenseModel data))
    (when-let [data (lookup-entry config id :max-allocated-storage)]
      (. builder maxAllocatedStorage data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :option-group)]
      (. builder optionGroup data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :processor-features)]
      (. builder processorFeatures data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :storage-throughput)]
      (. builder storageThroughput data))
    (when-let [data (storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :timezone)]
      (. builder timezone data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-instance-new-props-builder
  "The database-instance-new-props-builder function buildes out new instances of 
DatabaseInstanceNewProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseInstanceNewProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :delete-automated-backups)]
      (. builder deleteAutomatedBackups data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :max-allocated-storage)]
      (. builder maxAllocatedStorage data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :option-group)]
      (. builder optionGroup data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :processor-features)]
      (. builder processorFeatures data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :storage-throughput)]
      (. builder storageThroughput data))
    (when-let [data (storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-instance-props-builder
  "The database-instance-props-builder function buildes out new instances of 
DatabaseInstanceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :character-set-name)]
      (. builder characterSetName data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :delete-automated-backups)]
      (. builder deleteAutomatedBackups data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (license-model config id :license-model)]
      (. builder licenseModel data))
    (when-let [data (lookup-entry config id :max-allocated-storage)]
      (. builder maxAllocatedStorage data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :option-group)]
      (. builder optionGroup data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :processor-features)]
      (. builder processorFeatures data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-encryption-key)]
      (. builder storageEncryptionKey data))
    (when-let [data (lookup-entry config id :storage-throughput)]
      (. builder storageThroughput data))
    (when-let [data (storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :timezone)]
      (. builder timezone data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-instance-read-replica-builder
  "The database-instance-read-replica-builder function buildes out new instances of 
DatabaseInstanceReadReplica$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseInstanceReadReplica$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :delete-automated-backups)]
      (. builder deleteAutomatedBackups data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :max-allocated-storage)]
      (. builder maxAllocatedStorage data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :option-group)]
      (. builder optionGroup data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :processor-features)]
      (. builder processorFeatures data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :source-database-instance)]
      (. builder sourceDatabaseInstance data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-encryption-key)]
      (. builder storageEncryptionKey data))
    (when-let [data (lookup-entry config id :storage-throughput)]
      (. builder storageThroughput data))
    (when-let [data (storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-instance-read-replica-props-builder
  "The database-instance-read-replica-props-builder function buildes out new instances of 
DatabaseInstanceReadReplicaProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseInstanceReadReplicaProps$Builder.)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :delete-automated-backups)]
      (. builder deleteAutomatedBackups data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :max-allocated-storage)]
      (. builder maxAllocatedStorage data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :option-group)]
      (. builder optionGroup data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :processor-features)]
      (. builder processorFeatures data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :source-database-instance)]
      (. builder sourceDatabaseInstance data))
    (when-let [data (lookup-entry config id :storage-encrypted)]
      (. builder storageEncrypted data))
    (when-let [data (lookup-entry config id :storage-encryption-key)]
      (. builder storageEncryptionKey data))
    (when-let [data (lookup-entry config id :storage-throughput)]
      (. builder storageThroughput data))
    (when-let [data (storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-instance-source-props-builder
  "The database-instance-source-props-builder function buildes out new instances of 
DatabaseInstanceSourceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseInstanceSourceProps$Builder.)]
    (when-let [data (lookup-entry config id :allocated-storage)]
      (. builder allocatedStorage data))
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-exports)]
      (. builder cloudwatchLogsExports data))
    (when-let [data (retention-days config id :cloudwatch-logs-retention)]
      (. builder cloudwatchLogsRetention data))
    (when-let [data (lookup-entry config id :cloudwatch-logs-retention-role)]
      (. builder cloudwatchLogsRetentionRole data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :database-name)]
      (. builder databaseName data))
    (when-let [data (lookup-entry config id :delete-automated-backups)]
      (. builder deleteAutomatedBackups data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :domain-role)]
      (. builder domainRole data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :iam-authentication)]
      (. builder iamAuthentication data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (license-model config id :license-model)]
      (. builder licenseModel data))
    (when-let [data (lookup-entry config id :max-allocated-storage)]
      (. builder maxAllocatedStorage data))
    (when-let [data (lookup-entry config id :monitoring-interval)]
      (. builder monitoringInterval data))
    (when-let [data (lookup-entry config id :monitoring-role)]
      (. builder monitoringRole data))
    (when-let [data (lookup-entry config id :multi-az)]
      (. builder multiAz data))
    (when-let [data (network-type config id :network-type)]
      (. builder networkType data))
    (when-let [data (lookup-entry config id :option-group)]
      (. builder optionGroup data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :processor-features)]
      (. builder processorFeatures data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :s3-export-buckets)]
      (. builder s3ExportBuckets data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-buckets)]
      (. builder s3ImportBuckets data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :storage-throughput)]
      (. builder storageThroughput data))
    (when-let [data (storage-type config id :storage-type)]
      (. builder storageType data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :timezone)]
      (. builder timezone data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-proxy-attributes-builder
  "The database-proxy-attributes-builder function buildes out new instances of 
DatabaseProxyAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbProxyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-arn` |
| `dbProxyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:db-proxy-name` |
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |"
  [stack id config]
  (let [builder (DatabaseProxyAttributes$Builder.)]
    (when-let [data (lookup-entry config id :db-proxy-arn)]
      (. builder dbProxyArn data))
    (when-let [data (lookup-entry config id :db-proxy-name)]
      (. builder dbProxyName data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (.build builder)))


(defn database-proxy-builder
  "The database-proxy-builder function buildes out new instances of 
DatabaseProxy$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseProxy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :borrow-timeout)]
      (. builder borrowTimeout data))
    (when-let [data (client-password-auth-type config id :client-password-auth-type)]
      (. builder clientPasswordAuthType data))
    (when-let [data (lookup-entry config id :db-proxy-name)]
      (. builder dbProxyName data))
    (when-let [data (lookup-entry config id :debug-logging)]
      (. builder debugLogging data))
    (when-let [data (lookup-entry config id :iam-auth)]
      (. builder iamAuth data))
    (when-let [data (lookup-entry config id :idle-client-timeout)]
      (. builder idleClientTimeout data))
    (when-let [data (lookup-entry config id :init-query)]
      (. builder initQuery data))
    (when-let [data (lookup-entry config id :max-connections-percent)]
      (. builder maxConnectionsPercent data))
    (when-let [data (lookup-entry config id :max-idle-connections-percent)]
      (. builder maxIdleConnectionsPercent data))
    (when-let [data (lookup-entry config id :proxy-target)]
      (. builder proxyTarget data))
    (when-let [data (lookup-entry config id :require-tls)]
      (. builder requireTls data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :session-pinning-filters)]
      (. builder sessionPinningFilters data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-proxy-options-builder
  "The database-proxy-options-builder function buildes out new instances of 
DatabaseProxyOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseProxyOptions$Builder.)]
    (when-let [data (lookup-entry config id :borrow-timeout)]
      (. builder borrowTimeout data))
    (when-let [data (client-password-auth-type config id :client-password-auth-type)]
      (. builder clientPasswordAuthType data))
    (when-let [data (lookup-entry config id :db-proxy-name)]
      (. builder dbProxyName data))
    (when-let [data (lookup-entry config id :debug-logging)]
      (. builder debugLogging data))
    (when-let [data (lookup-entry config id :iam-auth)]
      (. builder iamAuth data))
    (when-let [data (lookup-entry config id :idle-client-timeout)]
      (. builder idleClientTimeout data))
    (when-let [data (lookup-entry config id :init-query)]
      (. builder initQuery data))
    (when-let [data (lookup-entry config id :max-connections-percent)]
      (. builder maxConnectionsPercent data))
    (when-let [data (lookup-entry config id :max-idle-connections-percent)]
      (. builder maxIdleConnectionsPercent data))
    (when-let [data (lookup-entry config id :require-tls)]
      (. builder requireTls data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :session-pinning-filters)]
      (. builder sessionPinningFilters data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-proxy-props-builder
  "The database-proxy-props-builder function buildes out new instances of 
DatabaseProxyProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (DatabaseProxyProps$Builder.)]
    (when-let [data (lookup-entry config id :borrow-timeout)]
      (. builder borrowTimeout data))
    (when-let [data (client-password-auth-type config id :client-password-auth-type)]
      (. builder clientPasswordAuthType data))
    (when-let [data (lookup-entry config id :db-proxy-name)]
      (. builder dbProxyName data))
    (when-let [data (lookup-entry config id :debug-logging)]
      (. builder debugLogging data))
    (when-let [data (lookup-entry config id :iam-auth)]
      (. builder iamAuth data))
    (when-let [data (lookup-entry config id :idle-client-timeout)]
      (. builder idleClientTimeout data))
    (when-let [data (lookup-entry config id :init-query)]
      (. builder initQuery data))
    (when-let [data (lookup-entry config id :max-connections-percent)]
      (. builder maxConnectionsPercent data))
    (when-let [data (lookup-entry config id :max-idle-connections-percent)]
      (. builder maxIdleConnectionsPercent data))
    (when-let [data (lookup-entry config id :proxy-target)]
      (. builder proxyTarget data))
    (when-let [data (lookup-entry config id :require-tls)]
      (. builder requireTls data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :session-pinning-filters)]
      (. builder sessionPinningFilters data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn database-secret-builder
  "The database-secret-builder function buildes out new instances of 
DatabaseSecret$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbname` | java.lang.String | [[cdk.support/lookup-entry]] | `:dbname` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `replaceOnPasswordCriteriaChanges` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-on-password-criteria-changes` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (DatabaseSecret$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dbname)]
      (. builder dbname data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :master-secret)]
      (. builder masterSecret data))
    (when-let [data (lookup-entry config id :replace-on-password-criteria-changes)]
      (. builder replaceOnPasswordCriteriaChanges data))
    (when-let [data (lookup-entry config id :replica-regions)]
      (. builder replicaRegions data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn database-secret-props-builder
  "The database-secret-props-builder function buildes out new instances of 
DatabaseSecretProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbname` | java.lang.String | [[cdk.support/lookup-entry]] | `:dbname` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `replaceOnPasswordCriteriaChanges` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:replace-on-password-criteria-changes` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (DatabaseSecretProps$Builder.)]
    (when-let [data (lookup-entry config id :dbname)]
      (. builder dbname data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :master-secret)]
      (. builder masterSecret data))
    (when-let [data (lookup-entry config id :replace-on-password-criteria-changes)]
      (. builder replaceOnPasswordCriteriaChanges data))
    (when-let [data (lookup-entry config id :replica-regions)]
      (. builder replicaRegions data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn engine-version-builder
  "The engine-version-builder function buildes out new instances of 
EngineVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fullVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:full-version` |
| `majorVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:major-version` |"
  [stack id config]
  (let [builder (EngineVersion$Builder.)]
    (when-let [data (lookup-entry config id :full-version)]
      (. builder fullVersion data))
    (when-let [data (lookup-entry config id :major-version)]
      (. builder majorVersion data))
    (.build builder)))


(defn instance-engine-bind-options-builder
  "The instance-engine-bind-options-builder function buildes out new instances of 
InstanceEngineBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domain` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |
| `s3ExportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-export-role` |
| `s3ImportRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:s3-import-role` |
| `timezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:timezone` |"
  [stack id config]
  (let [builder (InstanceEngineBindOptions$Builder.)]
    (when-let [data (lookup-entry config id :domain)]
      (. builder domain data))
    (when-let [data (lookup-entry config id :option-group)]
      (. builder optionGroup data))
    (when-let [data (lookup-entry config id :s3-export-role)]
      (. builder s3ExportRole data))
    (when-let [data (lookup-entry config id :s3-import-role)]
      (. builder s3ImportRole data))
    (when-let [data (lookup-entry config id :timezone)]
      (. builder timezone data))
    (.build builder)))


(defn instance-engine-config-builder
  "The instance-engine-config-builder function buildes out new instances of 
InstanceEngineConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `features` | software.amazon.awscdk.services.rds.InstanceEngineFeatures | [[cdk.support/lookup-entry]] | `:features` |
| `optionGroup` | software.amazon.awscdk.services.rds.IOptionGroup | [[cdk.support/lookup-entry]] | `:option-group` |"
  [stack id config]
  (let [builder (InstanceEngineConfig$Builder.)]
    (when-let [data (lookup-entry config id :features)]
      (. builder features data))
    (when-let [data (lookup-entry config id :option-group)]
      (. builder optionGroup data))
    (.build builder)))


(defn instance-engine-features-builder
  "The instance-engine-features-builder function buildes out new instances of 
InstanceEngineFeatures$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Export` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-export` |
| `s3Import` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-import` |"
  [stack id config]
  (let [builder (InstanceEngineFeatures$Builder.)]
    (when-let [data (lookup-entry config id :s3-export)]
      (. builder s3Export data))
    (when-let [data (lookup-entry config id :s3-import)]
      (. builder s3Import data))
    (.build builder)))


(defn instance-props-builder
  "The instance-props-builder function buildes out new instances of 
InstanceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (InstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :delete-automated-backups)]
      (. builder deleteAutomatedBackups data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn maria-db-instance-engine-props-builder
  "The maria-db-instance-engine-props-builder function buildes out new instances of 
MariaDbInstanceEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.MariaDbEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (MariaDbInstanceEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn my-sql-instance-engine-props-builder
  "The my-sql-instance-engine-props-builder function buildes out new instances of 
MySqlInstanceEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.MysqlEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (MySqlInstanceEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn option-configuration-builder
  "The option-configuration-builder function buildes out new instances of 
OptionConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `settings` | java.util.Map | [[cdk.support/lookup-entry]] | `:settings` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (OptionConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :settings)]
      (. builder settings data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn option-group-builder
  "The option-group-builder function buildes out new instances of 
OptionGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | software.amazon.awscdk.services.rds.IInstanceEngine | [[cdk.support/lookup-entry]] | `:engine` |"
  [stack id config]
  (let [builder (OptionGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (.build builder)))


(defn option-group-props-builder
  "The option-group-props-builder function buildes out new instances of 
OptionGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurations` | java.util.List | [[cdk.support/lookup-entry]] | `:configurations` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | software.amazon.awscdk.services.rds.IInstanceEngine | [[cdk.support/lookup-entry]] | `:engine` |"
  [stack id config]
  (let [builder (OptionGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :configurations)]
      (. builder configurations data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (.build builder)))


(defn oracle-ee-cdb-instance-engine-props-builder
  "The oracle-ee-cdb-instance-engine-props-builder function buildes out new instances of 
OracleEeCdbInstanceEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.OracleEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (OracleEeCdbInstanceEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn oracle-ee-instance-engine-props-builder
  "The oracle-ee-instance-engine-props-builder function buildes out new instances of 
OracleEeInstanceEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.OracleEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (OracleEeInstanceEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn oracle-se2-cdb-instance-engine-props-builder
  "The oracle-se2-cdb-instance-engine-props-builder function buildes out new instances of 
OracleSe2CdbInstanceEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.OracleEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (OracleSe2CdbInstanceEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn oracle-se2-instance-engine-props-builder
  "The oracle-se2-instance-engine-props-builder function buildes out new instances of 
OracleSe2InstanceEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.OracleEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (OracleSe2InstanceEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn parameter-group-builder
  "The parameter-group-builder function buildes out new instances of 
ParameterGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | software.amazon.awscdk.services.rds.IEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |"
  [stack id config]
  (let [builder (ParameterGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (.build builder)))


(defn parameter-group-cluster-bind-options-builder
  "The parameter-group-cluster-bind-options-builder function buildes out new instances of 
ParameterGroupClusterBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (ParameterGroupClusterBindOptions$Builder.)]
    (.build builder)))


(defn parameter-group-cluster-config-builder
  "The parameter-group-cluster-config-builder function buildes out new instances of 
ParameterGroupClusterConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |"
  [stack id config]
  (let [builder (ParameterGroupClusterConfig$Builder.)]
    (when-let [data (lookup-entry config id :parameter-group-name)]
      (. builder parameterGroupName data))
    (.build builder)))


(defn parameter-group-instance-bind-options-builder
  "The parameter-group-instance-bind-options-builder function buildes out new instances of 
ParameterGroupInstanceBindOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|"
  [stack id config]
  (let [builder (ParameterGroupInstanceBindOptions$Builder.)]
    (.build builder)))


(defn parameter-group-instance-config-builder
  "The parameter-group-instance-config-builder function buildes out new instances of 
ParameterGroupInstanceConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-group-name` |"
  [stack id config]
  (let [builder (ParameterGroupInstanceConfig$Builder.)]
    (when-let [data (lookup-entry config id :parameter-group-name)]
      (. builder parameterGroupName data))
    (.build builder)))


(defn parameter-group-props-builder
  "The parameter-group-props-builder function buildes out new instances of 
ParameterGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `engine` | software.amazon.awscdk.services.rds.IEngine | [[cdk.support/lookup-entry]] | `:engine` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |"
  [stack id config]
  (let [builder (ParameterGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (.build builder)))


(defn postgres-engine-features-builder
  "The postgres-engine-features-builder function buildes out new instances of 
PostgresEngineFeatures$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Export` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-export` |
| `s3Import` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:s3-import` |"
  [stack id config]
  (let [builder (PostgresEngineFeatures$Builder.)]
    (when-let [data (lookup-entry config id :s3-export)]
      (. builder s3Export data))
    (when-let [data (lookup-entry config id :s3-import)]
      (. builder s3Import data))
    (.build builder)))


(defn postgres-instance-engine-props-builder
  "The postgres-instance-engine-props-builder function buildes out new instances of 
PostgresInstanceEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.PostgresEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (PostgresInstanceEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn processor-features-builder
  "The processor-features-builder function buildes out new instances of 
ProcessorFeatures$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:core-count` |
| `threadsPerCore` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threads-per-core` |"
  [stack id config]
  (let [builder (ProcessorFeatures$Builder.)]
    (when-let [data (lookup-entry config id :core-count)]
      (. builder coreCount data))
    (when-let [data (lookup-entry config id :threads-per-core)]
      (. builder threadsPerCore data))
    (.build builder)))


(defn provisioned-cluster-instance-props-builder
  "The provisioned-cluster-instance-props-builder function buildes out new instances of 
ProvisionedClusterInstanceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `publiclyAccessible` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:publicly-accessible` |"
  [stack id config]
  (let [builder (ProvisionedClusterInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :is-from-legacy-instance-props)]
      (. builder isFromLegacyInstanceProps data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :promotion-tier)]
      (. builder promotionTier data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (.build builder)))


(defn proxy-target-config-builder
  "The proxy-target-config-builder function buildes out new instances of 
ProxyTargetConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dbClusters` | java.util.List | [[cdk.support/lookup-entry]] | `:db-clusters` |
| `dbInstances` | java.util.List | [[cdk.support/lookup-entry]] | `:db-instances` |
| `engineFamily` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-family` |"
  [stack id config]
  (let [builder (ProxyTargetConfig$Builder.)]
    (when-let [data (lookup-entry config id :db-clusters)]
      (. builder dbClusters data))
    (when-let [data (lookup-entry config id :db-instances)]
      (. builder dbInstances data))
    (when-let [data (lookup-entry config id :engine-family)]
      (. builder engineFamily data))
    (.build builder)))


(defn rotation-multi-user-options-builder
  "The rotation-multi-user-options-builder function buildes out new instances of 
RotationMultiUserOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `endpoint` | software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint | [[cdk.support/lookup-entry]] | `:endpoint` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (RotationMultiUserOptions$Builder.)]
    (when-let [data (lookup-entry config id :automatically-after)]
      (. builder automaticallyAfter data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :rotate-immediately-on-update)]
      (. builder rotateImmediatelyOnUpdate data))
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn rotation-single-user-options-builder
  "The rotation-single-user-options-builder function buildes out new instances of 
RotationSingleUserOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `endpoint` | software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint | [[cdk.support/lookup-entry]] | `:endpoint` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (RotationSingleUserOptions$Builder.)]
    (when-let [data (lookup-entry config id :automatically-after)]
      (. builder automaticallyAfter data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :rotate-immediately-on-update)]
      (. builder rotateImmediatelyOnUpdate data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn serverless-cluster-attributes-builder
  "The serverless-cluster-attributes-builder function buildes out new instances of 
ServerlessClusterAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clusterEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-endpoint-address` |
| `clusterIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:cluster-identifier` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `readerEndpointAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:reader-endpoint-address` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |"
  [stack id config]
  (let [builder (ServerlessClusterAttributes$Builder.)]
    (when-let [data (lookup-entry config id :cluster-endpoint-address)]
      (. builder clusterEndpointAddress data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :reader-endpoint-address)]
      (. builder readerEndpointAddress data))
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (.build builder)))


(defn serverless-cluster-builder
  "The serverless-cluster-builder function buildes out new instances of 
ServerlessCluster$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ServerlessCluster$Builder/create stack id)]
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :default-database-name)]
      (. builder defaultDatabaseName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :enable-data-api)]
      (. builder enableDataApi data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :scaling)]
      (. builder scaling data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :storage-encryption-key)]
      (. builder storageEncryptionKey data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn serverless-cluster-from-snapshot-builder
  "The serverless-cluster-from-snapshot-builder function buildes out new instances of 
ServerlessClusterFromSnapshot$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ServerlessClusterFromSnapshot$Builder/create stack id)]
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :default-database-name)]
      (. builder defaultDatabaseName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :enable-data-api)]
      (. builder enableDataApi data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :scaling)]
      (. builder scaling data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn serverless-cluster-from-snapshot-props-builder
  "The serverless-cluster-from-snapshot-props-builder function buildes out new instances of 
ServerlessClusterFromSnapshotProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ServerlessClusterFromSnapshotProps$Builder.)]
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :default-database-name)]
      (. builder defaultDatabaseName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :enable-data-api)]
      (. builder enableDataApi data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :scaling)]
      (. builder scaling data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :snapshot-identifier)]
      (. builder snapshotIdentifier data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn serverless-cluster-props-builder
  "The serverless-cluster-props-builder function buildes out new instances of 
ServerlessClusterProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (ServerlessClusterProps$Builder.)]
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :cluster-identifier)]
      (. builder clusterIdentifier data))
    (when-let [data (lookup-entry config id :copy-tags-to-snapshot)]
      (. builder copyTagsToSnapshot data))
    (when-let [data (lookup-entry config id :credentials)]
      (. builder credentials data))
    (when-let [data (lookup-entry config id :default-database-name)]
      (. builder defaultDatabaseName data))
    (when-let [data (lookup-entry config id :deletion-protection)]
      (. builder deletionProtection data))
    (when-let [data (lookup-entry config id :enable-data-api)]
      (. builder enableDataApi data))
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :scaling)]
      (. builder scaling data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :storage-encryption-key)]
      (. builder storageEncryptionKey data))
    (when-let [data (lookup-entry config id :subnet-group)]
      (. builder subnetGroup data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn serverless-scaling-options-builder
  "The serverless-scaling-options-builder function buildes out new instances of 
ServerlessScalingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoPause` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:auto-pause` |
| `maxCapacity` | software.amazon.awscdk.services.rds.AuroraCapacityUnit | [[cdk.api.services.rds/aurora-capacity-unit]] | `:max-capacity` |
| `minCapacity` | software.amazon.awscdk.services.rds.AuroraCapacityUnit | [[cdk.api.services.rds/aurora-capacity-unit]] | `:min-capacity` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `timeoutAction` | software.amazon.awscdk.services.rds.TimeoutAction | [[cdk.api.services.rds/timeout-action]] | `:timeout-action` |"
  [stack id config]
  (let [builder (ServerlessScalingOptions$Builder.)]
    (when-let [data (lookup-entry config id :auto-pause)]
      (. builder autoPause data))
    (when-let [data (aurora-capacity-unit config id :max-capacity)]
      (. builder maxCapacity data))
    (when-let [data (aurora-capacity-unit config id :min-capacity)]
      (. builder minCapacity data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (timeout-action config id :timeout-action)]
      (. builder timeoutAction data))
    (.build builder)))


(defn serverless-v2-cluster-instance-props-builder
  "The serverless-v2-cluster-instance-props-builder function buildes out new instances of 
ServerlessV2ClusterInstanceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `scaleWithWriter` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:scale-with-writer` |"
  [stack id config]
  (let [builder (ServerlessV2ClusterInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-major-version-upgrade)]
      (. builder allowMajorVersionUpgrade data))
    (when-let [data (lookup-entry config id :auto-minor-version-upgrade)]
      (. builder autoMinorVersionUpgrade data))
    (when-let [data (lookup-entry config id :ca-certificate)]
      (. builder caCertificate data))
    (when-let [data (lookup-entry config id :enable-performance-insights)]
      (. builder enablePerformanceInsights data))
    (when-let [data (lookup-entry config id :instance-identifier)]
      (. builder instanceIdentifier data))
    (when-let [data (lookup-entry config id :is-from-legacy-instance-props)]
      (. builder isFromLegacyInstanceProps data))
    (when-let [data (lookup-entry config id :parameter-group)]
      (. builder parameterGroup data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :performance-insight-encryption-key)]
      (. builder performanceInsightEncryptionKey data))
    (when-let [data (performance-insight-retention config id :performance-insight-retention)]
      (. builder performanceInsightRetention data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :scale-with-writer)]
      (. builder scaleWithWriter data))
    (.build builder)))


(defn snapshot-credentials-from-generated-password-options-builder
  "The snapshot-credentials-from-generated-password-options-builder function buildes out new instances of 
SnapshotCredentialsFromGeneratedPasswordOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |"
  [stack id config]
  (let [builder (SnapshotCredentialsFromGeneratedPasswordOptions$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :replica-regions)]
      (. builder replicaRegions data))
    (.build builder)))


(defn sql-server-ee-instance-engine-props-builder
  "The sql-server-ee-instance-engine-props-builder function buildes out new instances of 
SqlServerEeInstanceEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.SqlServerEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (SqlServerEeInstanceEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn sql-server-ex-instance-engine-props-builder
  "The sql-server-ex-instance-engine-props-builder function buildes out new instances of 
SqlServerExInstanceEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.SqlServerEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (SqlServerExInstanceEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn sql-server-se-instance-engine-props-builder
  "The sql-server-se-instance-engine-props-builder function buildes out new instances of 
SqlServerSeInstanceEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.SqlServerEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (SqlServerSeInstanceEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn sql-server-web-instance-engine-props-builder
  "The sql-server-web-instance-engine-props-builder function buildes out new instances of 
SqlServerWebInstanceEngineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `version` | software.amazon.awscdk.services.rds.SqlServerEngineVersion | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (SqlServerWebInstanceEngineProps$Builder.)]
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn subnet-group-builder
  "The subnet-group-builder function buildes out new instances of 
SubnetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (SubnetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :subnet-group-name)]
      (. builder subnetGroupName data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn subnet-group-props-builder
  "The subnet-group-props-builder function buildes out new instances of 
SubnetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `subnetGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-group-name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (SubnetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :subnet-group-name)]
      (. builder subnetGroupName data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))