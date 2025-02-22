(ns cdk.api.services.rds-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.rds package. "
  (:require [cdk.api.services.rds :refer [aurora-capacity-unit
                                          client-password-auth-type
                                          db-cluster-storage-type
                                          instance-type
                                          instance-update-behaviour
                                          license-model
                                          network-type
                                          performance-insight-retention
                                          storage-type
                                          timeout-action]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.rds AuroraCapacityUnit
                                                ClientPasswordAuthType
                                                DBClusterStorageType
                                                InstanceType
                                                InstanceUpdateBehaviour
                                                LicenseModel
                                                NetworkType
                                                PerformanceInsightRetention
                                                StorageType
                                                TimeoutAction]))


(deftest aurora-capacity-unit-test
  (testing "Testing enum function aurora-capacity-unit"
    (is (= AuroraCapacityUnit/ACU_32 (aurora-capacity-unit {:item AuroraCapacityUnit/ACU_32} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_32 (aurora-capacity-unit {:test/item AuroraCapacityUnit/ACU_32} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_8 (aurora-capacity-unit {:item AuroraCapacityUnit/ACU_8} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_8 (aurora-capacity-unit {:test/item AuroraCapacityUnit/ACU_8} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_16 (aurora-capacity-unit {:item AuroraCapacityUnit/ACU_16} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_16 (aurora-capacity-unit {:test/item AuroraCapacityUnit/ACU_16} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_128 (aurora-capacity-unit {:item AuroraCapacityUnit/ACU_128} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_128 (aurora-capacity-unit {:test/item AuroraCapacityUnit/ACU_128} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_1 (aurora-capacity-unit {:item AuroraCapacityUnit/ACU_1} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_1 (aurora-capacity-unit {:test/item AuroraCapacityUnit/ACU_1} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_384 (aurora-capacity-unit {:item AuroraCapacityUnit/ACU_384} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_384 (aurora-capacity-unit {:test/item AuroraCapacityUnit/ACU_384} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_4 (aurora-capacity-unit {:item AuroraCapacityUnit/ACU_4} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_4 (aurora-capacity-unit {:test/item AuroraCapacityUnit/ACU_4} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_64 (aurora-capacity-unit {:item AuroraCapacityUnit/ACU_64} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_64 (aurora-capacity-unit {:test/item AuroraCapacityUnit/ACU_64} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_256 (aurora-capacity-unit {:item AuroraCapacityUnit/ACU_256} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_256 (aurora-capacity-unit {:test/item AuroraCapacityUnit/ACU_256} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_2 (aurora-capacity-unit {:item AuroraCapacityUnit/ACU_2} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_2 (aurora-capacity-unit {:test/item AuroraCapacityUnit/ACU_2} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_192 (aurora-capacity-unit {:item AuroraCapacityUnit/ACU_192} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_192 (aurora-capacity-unit {:test/item AuroraCapacityUnit/ACU_192} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_32 (aurora-capacity-unit {:item :acu-32} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_32 (aurora-capacity-unit {:test/item :acu-32} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_8 (aurora-capacity-unit {:item :acu-8} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_8 (aurora-capacity-unit {:test/item :acu-8} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_16 (aurora-capacity-unit {:item :acu-16} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_16 (aurora-capacity-unit {:test/item :acu-16} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_128 (aurora-capacity-unit {:item :acu-128} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_128 (aurora-capacity-unit {:test/item :acu-128} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_1 (aurora-capacity-unit {:item :acu-1} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_1 (aurora-capacity-unit {:test/item :acu-1} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_384 (aurora-capacity-unit {:item :acu-384} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_384 (aurora-capacity-unit {:test/item :acu-384} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_4 (aurora-capacity-unit {:item :acu-4} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_4 (aurora-capacity-unit {:test/item :acu-4} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_64 (aurora-capacity-unit {:item :acu-64} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_64 (aurora-capacity-unit {:test/item :acu-64} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_256 (aurora-capacity-unit {:item :acu-256} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_256 (aurora-capacity-unit {:test/item :acu-256} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_2 (aurora-capacity-unit {:item :acu-2} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_2 (aurora-capacity-unit {:test/item :acu-2} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_192 (aurora-capacity-unit {:item :acu-192} "test" :item)))
    (is (= AuroraCapacityUnit/ACU_192 (aurora-capacity-unit {:test/item :acu-192} "test" :item)))))


(deftest client-password-auth-type-test
  (testing "Testing enum function client-password-auth-type"
    (is (= ClientPasswordAuthType/MYSQL_NATIVE_PASSWORD (client-password-auth-type {:item ClientPasswordAuthType/MYSQL_NATIVE_PASSWORD} "test" :item)))
    (is (= ClientPasswordAuthType/MYSQL_NATIVE_PASSWORD (client-password-auth-type {:test/item ClientPasswordAuthType/MYSQL_NATIVE_PASSWORD} "test" :item)))
    (is (= ClientPasswordAuthType/SQL_SERVER_AUTHENTICATION (client-password-auth-type {:item ClientPasswordAuthType/SQL_SERVER_AUTHENTICATION} "test" :item)))
    (is (= ClientPasswordAuthType/SQL_SERVER_AUTHENTICATION (client-password-auth-type {:test/item ClientPasswordAuthType/SQL_SERVER_AUTHENTICATION} "test" :item)))
    (is (= ClientPasswordAuthType/POSTGRES_MD5 (client-password-auth-type {:item ClientPasswordAuthType/POSTGRES_MD5} "test" :item)))
    (is (= ClientPasswordAuthType/POSTGRES_MD5 (client-password-auth-type {:test/item ClientPasswordAuthType/POSTGRES_MD5} "test" :item)))
    (is (= ClientPasswordAuthType/POSTGRES_SCRAM_SHA_256 (client-password-auth-type {:item ClientPasswordAuthType/POSTGRES_SCRAM_SHA_256} "test" :item)))
    (is (= ClientPasswordAuthType/POSTGRES_SCRAM_SHA_256 (client-password-auth-type {:test/item ClientPasswordAuthType/POSTGRES_SCRAM_SHA_256} "test" :item)))
    (is (= ClientPasswordAuthType/MYSQL_NATIVE_PASSWORD (client-password-auth-type {:item :mysql-native-password} "test" :item)))
    (is (= ClientPasswordAuthType/MYSQL_NATIVE_PASSWORD (client-password-auth-type {:test/item :mysql-native-password} "test" :item)))
    (is (= ClientPasswordAuthType/SQL_SERVER_AUTHENTICATION (client-password-auth-type {:item :sql-server-authentication} "test" :item)))
    (is (= ClientPasswordAuthType/SQL_SERVER_AUTHENTICATION (client-password-auth-type {:test/item :sql-server-authentication} "test" :item)))
    (is (= ClientPasswordAuthType/POSTGRES_MD5 (client-password-auth-type {:item :postgres-md5} "test" :item)))
    (is (= ClientPasswordAuthType/POSTGRES_MD5 (client-password-auth-type {:test/item :postgres-md5} "test" :item)))
    (is (= ClientPasswordAuthType/POSTGRES_SCRAM_SHA_256 (client-password-auth-type {:item :postgres-scram-sha-256} "test" :item)))
    (is (= ClientPasswordAuthType/POSTGRES_SCRAM_SHA_256 (client-password-auth-type {:test/item :postgres-scram-sha-256} "test" :item)))))


(deftest db-cluster-storage-type-test
  (testing "Testing enum function db-cluster-storage-type"
    (is (= DBClusterStorageType/AURORA (db-cluster-storage-type {:item DBClusterStorageType/AURORA} "test" :item)))
    (is (= DBClusterStorageType/AURORA (db-cluster-storage-type {:test/item DBClusterStorageType/AURORA} "test" :item)))
    (is (= DBClusterStorageType/AURORA_IOPT1 (db-cluster-storage-type {:item DBClusterStorageType/AURORA_IOPT1} "test" :item)))
    (is (= DBClusterStorageType/AURORA_IOPT1 (db-cluster-storage-type {:test/item DBClusterStorageType/AURORA_IOPT1} "test" :item)))
    (is (= DBClusterStorageType/AURORA (db-cluster-storage-type {:item :aurora} "test" :item)))
    (is (= DBClusterStorageType/AURORA (db-cluster-storage-type {:test/item :aurora} "test" :item)))
    (is (= DBClusterStorageType/AURORA_IOPT1 (db-cluster-storage-type {:item :aurora-iopt1} "test" :item)))
    (is (= DBClusterStorageType/AURORA_IOPT1 (db-cluster-storage-type {:test/item :aurora-iopt1} "test" :item)))))


(deftest instance-type-test
  (testing "Testing enum function instance-type"
    (is (= InstanceType/PROVISIONED (instance-type {:item InstanceType/PROVISIONED} "test" :item)))
    (is (= InstanceType/PROVISIONED (instance-type {:test/item InstanceType/PROVISIONED} "test" :item)))
    (is (= InstanceType/SERVERLESS_V2 (instance-type {:item InstanceType/SERVERLESS_V2} "test" :item)))
    (is (= InstanceType/SERVERLESS_V2 (instance-type {:test/item InstanceType/SERVERLESS_V2} "test" :item)))
    (is (= InstanceType/PROVISIONED (instance-type {:item :provisioned} "test" :item)))
    (is (= InstanceType/PROVISIONED (instance-type {:test/item :provisioned} "test" :item)))
    (is (= InstanceType/SERVERLESS_V2 (instance-type {:item :serverless-v2} "test" :item)))
    (is (= InstanceType/SERVERLESS_V2 (instance-type {:test/item :serverless-v2} "test" :item)))))


(deftest instance-update-behaviour-test
  (testing "Testing enum function instance-update-behaviour"
    (is (= InstanceUpdateBehaviour/ROLLING (instance-update-behaviour {:item InstanceUpdateBehaviour/ROLLING} "test" :item)))
    (is (= InstanceUpdateBehaviour/ROLLING (instance-update-behaviour {:test/item InstanceUpdateBehaviour/ROLLING} "test" :item)))
    (is (= InstanceUpdateBehaviour/BULK (instance-update-behaviour {:item InstanceUpdateBehaviour/BULK} "test" :item)))
    (is (= InstanceUpdateBehaviour/BULK (instance-update-behaviour {:test/item InstanceUpdateBehaviour/BULK} "test" :item)))
    (is (= InstanceUpdateBehaviour/ROLLING (instance-update-behaviour {:item :rolling} "test" :item)))
    (is (= InstanceUpdateBehaviour/ROLLING (instance-update-behaviour {:test/item :rolling} "test" :item)))
    (is (= InstanceUpdateBehaviour/BULK (instance-update-behaviour {:item :bulk} "test" :item)))
    (is (= InstanceUpdateBehaviour/BULK (instance-update-behaviour {:test/item :bulk} "test" :item)))))


(deftest license-model-test
  (testing "Testing enum function license-model"
    (is (= LicenseModel/LICENSE_INCLUDED (license-model {:item LicenseModel/LICENSE_INCLUDED} "test" :item)))
    (is (= LicenseModel/LICENSE_INCLUDED (license-model {:test/item LicenseModel/LICENSE_INCLUDED} "test" :item)))
    (is (= LicenseModel/GENERAL_PUBLIC_LICENSE (license-model {:item LicenseModel/GENERAL_PUBLIC_LICENSE} "test" :item)))
    (is (= LicenseModel/GENERAL_PUBLIC_LICENSE (license-model {:test/item LicenseModel/GENERAL_PUBLIC_LICENSE} "test" :item)))
    (is (= LicenseModel/BRING_YOUR_OWN_LICENSE (license-model {:item LicenseModel/BRING_YOUR_OWN_LICENSE} "test" :item)))
    (is (= LicenseModel/BRING_YOUR_OWN_LICENSE (license-model {:test/item LicenseModel/BRING_YOUR_OWN_LICENSE} "test" :item)))
    (is (= LicenseModel/LICENSE_INCLUDED (license-model {:item :license-included} "test" :item)))
    (is (= LicenseModel/LICENSE_INCLUDED (license-model {:test/item :license-included} "test" :item)))
    (is (= LicenseModel/GENERAL_PUBLIC_LICENSE (license-model {:item :general-public-license} "test" :item)))
    (is (= LicenseModel/GENERAL_PUBLIC_LICENSE (license-model {:test/item :general-public-license} "test" :item)))
    (is (= LicenseModel/BRING_YOUR_OWN_LICENSE (license-model {:item :bring-your-own-license} "test" :item)))
    (is (= LicenseModel/BRING_YOUR_OWN_LICENSE (license-model {:test/item :bring-your-own-license} "test" :item)))))


(deftest network-type-test
  (testing "Testing enum function network-type"
    (is (= NetworkType/DUAL (network-type {:item NetworkType/DUAL} "test" :item)))
    (is (= NetworkType/DUAL (network-type {:test/item NetworkType/DUAL} "test" :item)))
    (is (= NetworkType/IPV4 (network-type {:item NetworkType/IPV4} "test" :item)))
    (is (= NetworkType/IPV4 (network-type {:test/item NetworkType/IPV4} "test" :item)))
    (is (= NetworkType/DUAL (network-type {:item :dual} "test" :item)))
    (is (= NetworkType/DUAL (network-type {:test/item :dual} "test" :item)))
    (is (= NetworkType/IPV4 (network-type {:item :ipv4} "test" :item)))
    (is (= NetworkType/IPV4 (network-type {:test/item :ipv4} "test" :item)))))


(deftest performance-insight-retention-test
  (testing "Testing enum function performance-insight-retention"
    (is (= PerformanceInsightRetention/MONTHS_1 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_1} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_1 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_1} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_2 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_2} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_2 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_2} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_9 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_9} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_9 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_9} "test" :item)))
    (is (= PerformanceInsightRetention/DEFAULT (performance-insight-retention {:item PerformanceInsightRetention/DEFAULT} "test" :item)))
    (is (= PerformanceInsightRetention/DEFAULT (performance-insight-retention {:test/item PerformanceInsightRetention/DEFAULT} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_15 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_15} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_15 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_15} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_19 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_19} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_19 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_19} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_5 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_5} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_5 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_5} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_7 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_7} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_7 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_7} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_20 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_20} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_20 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_20} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_21 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_21} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_21 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_21} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_22 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_22} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_22 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_22} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_18 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_18} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_18 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_18} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_10 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_10} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_10 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_10} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_11 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_11} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_11 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_11} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_16 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_16} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_16 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_16} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_12 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_12} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_12 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_12} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_23 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_23} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_23 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_23} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_14 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_14} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_14 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_14} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_6 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_6} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_6 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_6} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_3 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_3} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_3 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_3} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_17 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_17} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_17 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_17} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_13 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_13} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_13 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_13} "test" :item)))
    (is (= PerformanceInsightRetention/LONG_TERM (performance-insight-retention {:item PerformanceInsightRetention/LONG_TERM} "test" :item)))
    (is (= PerformanceInsightRetention/LONG_TERM (performance-insight-retention {:test/item PerformanceInsightRetention/LONG_TERM} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_4 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_4} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_4 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_4} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_8 (performance-insight-retention {:item PerformanceInsightRetention/MONTHS_8} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_8 (performance-insight-retention {:test/item PerformanceInsightRetention/MONTHS_8} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_1 (performance-insight-retention {:item :months-1} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_1 (performance-insight-retention {:test/item :months-1} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_2 (performance-insight-retention {:item :months-2} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_2 (performance-insight-retention {:test/item :months-2} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_9 (performance-insight-retention {:item :months-9} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_9 (performance-insight-retention {:test/item :months-9} "test" :item)))
    (is (= PerformanceInsightRetention/DEFAULT (performance-insight-retention {:item :default} "test" :item)))
    (is (= PerformanceInsightRetention/DEFAULT (performance-insight-retention {:test/item :default} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_15 (performance-insight-retention {:item :months-15} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_15 (performance-insight-retention {:test/item :months-15} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_19 (performance-insight-retention {:item :months-19} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_19 (performance-insight-retention {:test/item :months-19} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_5 (performance-insight-retention {:item :months-5} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_5 (performance-insight-retention {:test/item :months-5} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_7 (performance-insight-retention {:item :months-7} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_7 (performance-insight-retention {:test/item :months-7} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_20 (performance-insight-retention {:item :months-20} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_20 (performance-insight-retention {:test/item :months-20} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_21 (performance-insight-retention {:item :months-21} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_21 (performance-insight-retention {:test/item :months-21} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_22 (performance-insight-retention {:item :months-22} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_22 (performance-insight-retention {:test/item :months-22} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_18 (performance-insight-retention {:item :months-18} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_18 (performance-insight-retention {:test/item :months-18} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_10 (performance-insight-retention {:item :months-10} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_10 (performance-insight-retention {:test/item :months-10} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_11 (performance-insight-retention {:item :months-11} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_11 (performance-insight-retention {:test/item :months-11} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_16 (performance-insight-retention {:item :months-16} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_16 (performance-insight-retention {:test/item :months-16} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_12 (performance-insight-retention {:item :months-12} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_12 (performance-insight-retention {:test/item :months-12} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_23 (performance-insight-retention {:item :months-23} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_23 (performance-insight-retention {:test/item :months-23} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_14 (performance-insight-retention {:item :months-14} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_14 (performance-insight-retention {:test/item :months-14} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_6 (performance-insight-retention {:item :months-6} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_6 (performance-insight-retention {:test/item :months-6} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_3 (performance-insight-retention {:item :months-3} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_3 (performance-insight-retention {:test/item :months-3} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_17 (performance-insight-retention {:item :months-17} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_17 (performance-insight-retention {:test/item :months-17} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_13 (performance-insight-retention {:item :months-13} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_13 (performance-insight-retention {:test/item :months-13} "test" :item)))
    (is (= PerformanceInsightRetention/LONG_TERM (performance-insight-retention {:item :long-term} "test" :item)))
    (is (= PerformanceInsightRetention/LONG_TERM (performance-insight-retention {:test/item :long-term} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_4 (performance-insight-retention {:item :months-4} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_4 (performance-insight-retention {:test/item :months-4} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_8 (performance-insight-retention {:item :months-8} "test" :item)))
    (is (= PerformanceInsightRetention/MONTHS_8 (performance-insight-retention {:test/item :months-8} "test" :item)))))


(deftest storage-type-test
  (testing "Testing enum function storage-type"
    (is (= StorageType/GP2 (storage-type {:item StorageType/GP2} "test" :item)))
    (is (= StorageType/GP2 (storage-type {:test/item StorageType/GP2} "test" :item)))
    (is (= StorageType/GP3 (storage-type {:item StorageType/GP3} "test" :item)))
    (is (= StorageType/GP3 (storage-type {:test/item StorageType/GP3} "test" :item)))
    (is (= StorageType/IO1 (storage-type {:item StorageType/IO1} "test" :item)))
    (is (= StorageType/IO1 (storage-type {:test/item StorageType/IO1} "test" :item)))
    (is (= StorageType/IO2 (storage-type {:item StorageType/IO2} "test" :item)))
    (is (= StorageType/IO2 (storage-type {:test/item StorageType/IO2} "test" :item)))
    (is (= StorageType/STANDARD (storage-type {:item StorageType/STANDARD} "test" :item)))
    (is (= StorageType/STANDARD (storage-type {:test/item StorageType/STANDARD} "test" :item)))
    (is (= StorageType/GP2 (storage-type {:item :gp2} "test" :item)))
    (is (= StorageType/GP2 (storage-type {:test/item :gp2} "test" :item)))
    (is (= StorageType/GP3 (storage-type {:item :gp3} "test" :item)))
    (is (= StorageType/GP3 (storage-type {:test/item :gp3} "test" :item)))
    (is (= StorageType/IO1 (storage-type {:item :io1} "test" :item)))
    (is (= StorageType/IO1 (storage-type {:test/item :io1} "test" :item)))
    (is (= StorageType/IO2 (storage-type {:item :io2} "test" :item)))
    (is (= StorageType/IO2 (storage-type {:test/item :io2} "test" :item)))
    (is (= StorageType/STANDARD (storage-type {:item :standard} "test" :item)))
    (is (= StorageType/STANDARD (storage-type {:test/item :standard} "test" :item)))))


(deftest timeout-action-test
  (testing "Testing enum function timeout-action"
    (is (= TimeoutAction/ROLLBACK_CAPACITY_CHANGE (timeout-action {:item TimeoutAction/ROLLBACK_CAPACITY_CHANGE} "test" :item)))
    (is (= TimeoutAction/ROLLBACK_CAPACITY_CHANGE (timeout-action {:test/item TimeoutAction/ROLLBACK_CAPACITY_CHANGE} "test" :item)))
    (is (= TimeoutAction/FORCE_APPLY_CAPACITY_CHANGE (timeout-action {:item TimeoutAction/FORCE_APPLY_CAPACITY_CHANGE} "test" :item)))
    (is (= TimeoutAction/FORCE_APPLY_CAPACITY_CHANGE (timeout-action {:test/item TimeoutAction/FORCE_APPLY_CAPACITY_CHANGE} "test" :item)))
    (is (= TimeoutAction/ROLLBACK_CAPACITY_CHANGE (timeout-action {:item :rollback-capacity-change} "test" :item)))
    (is (= TimeoutAction/ROLLBACK_CAPACITY_CHANGE (timeout-action {:test/item :rollback-capacity-change} "test" :item)))
    (is (= TimeoutAction/FORCE_APPLY_CAPACITY_CHANGE (timeout-action {:item :force-apply-capacity-change} "test" :item)))
    (is (= TimeoutAction/FORCE_APPLY_CAPACITY_CHANGE (timeout-action {:test/item :force-apply-capacity-change} "test" :item)))))