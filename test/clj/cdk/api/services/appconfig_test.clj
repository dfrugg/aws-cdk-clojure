(ns cdk.api.services.appconfig-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.appconfig package. "
  (:require [cdk.api.services.appconfig :refer [action-point
                                                configuration-source-type
                                                configuration-type
                                                growth-type
                                                monitor-type
                                                platform
                                                source-type
                                                validator-type]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.appconfig ActionPoint
                                                      ConfigurationSourceType
                                                      ConfigurationType
                                                      GrowthType
                                                      MonitorType
                                                      Platform
                                                      SourceType
                                                      ValidatorType]))


(deftest action-point-test
  (testing "Testing enum function action-point"
    (is (= ActionPoint/ON_DEPLOYMENT_START (action-point {:item ActionPoint/ON_DEPLOYMENT_START} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_START (action-point {:test/item ActionPoint/ON_DEPLOYMENT_START} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_STEP (action-point {:item ActionPoint/ON_DEPLOYMENT_STEP} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_STEP (action-point {:test/item ActionPoint/ON_DEPLOYMENT_STEP} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_BAKING (action-point {:item ActionPoint/ON_DEPLOYMENT_BAKING} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_BAKING (action-point {:test/item ActionPoint/ON_DEPLOYMENT_BAKING} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_COMPLETE (action-point {:item ActionPoint/ON_DEPLOYMENT_COMPLETE} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_COMPLETE (action-point {:test/item ActionPoint/ON_DEPLOYMENT_COMPLETE} "test" :item)))
    (is (= ActionPoint/PRE_START_DEPLOYMENT (action-point {:item ActionPoint/PRE_START_DEPLOYMENT} "test" :item)))
    (is (= ActionPoint/PRE_START_DEPLOYMENT (action-point {:test/item ActionPoint/PRE_START_DEPLOYMENT} "test" :item)))
    (is (= ActionPoint/PRE_CREATE_HOSTED_CONFIGURATION_VERSION (action-point {:item ActionPoint/PRE_CREATE_HOSTED_CONFIGURATION_VERSION} "test" :item)))
    (is (= ActionPoint/PRE_CREATE_HOSTED_CONFIGURATION_VERSION (action-point {:test/item ActionPoint/PRE_CREATE_HOSTED_CONFIGURATION_VERSION} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_ROLLED_BACK (action-point {:item ActionPoint/ON_DEPLOYMENT_ROLLED_BACK} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_ROLLED_BACK (action-point {:test/item ActionPoint/ON_DEPLOYMENT_ROLLED_BACK} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_START (action-point {:item :on-deployment-start} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_START (action-point {:test/item :on-deployment-start} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_STEP (action-point {:item :on-deployment-step} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_STEP (action-point {:test/item :on-deployment-step} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_BAKING (action-point {:item :on-deployment-baking} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_BAKING (action-point {:test/item :on-deployment-baking} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_COMPLETE (action-point {:item :on-deployment-complete} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_COMPLETE (action-point {:test/item :on-deployment-complete} "test" :item)))
    (is (= ActionPoint/PRE_START_DEPLOYMENT (action-point {:item :pre-start-deployment} "test" :item)))
    (is (= ActionPoint/PRE_START_DEPLOYMENT (action-point {:test/item :pre-start-deployment} "test" :item)))
    (is (= ActionPoint/PRE_CREATE_HOSTED_CONFIGURATION_VERSION (action-point {:item :pre-create-hosted-configuration-version} "test" :item)))
    (is (= ActionPoint/PRE_CREATE_HOSTED_CONFIGURATION_VERSION (action-point {:test/item :pre-create-hosted-configuration-version} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_ROLLED_BACK (action-point {:item :on-deployment-rolled-back} "test" :item)))
    (is (= ActionPoint/ON_DEPLOYMENT_ROLLED_BACK (action-point {:test/item :on-deployment-rolled-back} "test" :item)))))


(deftest configuration-source-type-test
  (testing "Testing enum function configuration-source-type"
    (is (= ConfigurationSourceType/SECRETS_MANAGER (configuration-source-type {:item ConfigurationSourceType/SECRETS_MANAGER} "test" :item)))
    (is (= ConfigurationSourceType/SECRETS_MANAGER (configuration-source-type {:test/item ConfigurationSourceType/SECRETS_MANAGER} "test" :item)))
    (is (= ConfigurationSourceType/SSM_PARAMETER (configuration-source-type {:item ConfigurationSourceType/SSM_PARAMETER} "test" :item)))
    (is (= ConfigurationSourceType/SSM_PARAMETER (configuration-source-type {:test/item ConfigurationSourceType/SSM_PARAMETER} "test" :item)))
    (is (= ConfigurationSourceType/S3 (configuration-source-type {:item ConfigurationSourceType/S3} "test" :item)))
    (is (= ConfigurationSourceType/S3 (configuration-source-type {:test/item ConfigurationSourceType/S3} "test" :item)))
    (is (= ConfigurationSourceType/CODE_PIPELINE (configuration-source-type {:item ConfigurationSourceType/CODE_PIPELINE} "test" :item)))
    (is (= ConfigurationSourceType/CODE_PIPELINE (configuration-source-type {:test/item ConfigurationSourceType/CODE_PIPELINE} "test" :item)))
    (is (= ConfigurationSourceType/SSM_DOCUMENT (configuration-source-type {:item ConfigurationSourceType/SSM_DOCUMENT} "test" :item)))
    (is (= ConfigurationSourceType/SSM_DOCUMENT (configuration-source-type {:test/item ConfigurationSourceType/SSM_DOCUMENT} "test" :item)))
    (is (= ConfigurationSourceType/SECRETS_MANAGER (configuration-source-type {:item :secrets-manager} "test" :item)))
    (is (= ConfigurationSourceType/SECRETS_MANAGER (configuration-source-type {:test/item :secrets-manager} "test" :item)))
    (is (= ConfigurationSourceType/SSM_PARAMETER (configuration-source-type {:item :ssm-parameter} "test" :item)))
    (is (= ConfigurationSourceType/SSM_PARAMETER (configuration-source-type {:test/item :ssm-parameter} "test" :item)))
    (is (= ConfigurationSourceType/S3 (configuration-source-type {:item :s3} "test" :item)))
    (is (= ConfigurationSourceType/S3 (configuration-source-type {:test/item :s3} "test" :item)))
    (is (= ConfigurationSourceType/CODE_PIPELINE (configuration-source-type {:item :code-pipeline} "test" :item)))
    (is (= ConfigurationSourceType/CODE_PIPELINE (configuration-source-type {:test/item :code-pipeline} "test" :item)))
    (is (= ConfigurationSourceType/SSM_DOCUMENT (configuration-source-type {:item :ssm-document} "test" :item)))
    (is (= ConfigurationSourceType/SSM_DOCUMENT (configuration-source-type {:test/item :ssm-document} "test" :item)))))


(deftest configuration-type-test
  (testing "Testing enum function configuration-type"
    (is (= ConfigurationType/FREEFORM (configuration-type {:item ConfigurationType/FREEFORM} "test" :item)))
    (is (= ConfigurationType/FREEFORM (configuration-type {:test/item ConfigurationType/FREEFORM} "test" :item)))
    (is (= ConfigurationType/FEATURE_FLAGS (configuration-type {:item ConfigurationType/FEATURE_FLAGS} "test" :item)))
    (is (= ConfigurationType/FEATURE_FLAGS (configuration-type {:test/item ConfigurationType/FEATURE_FLAGS} "test" :item)))
    (is (= ConfigurationType/FREEFORM (configuration-type {:item :freeform} "test" :item)))
    (is (= ConfigurationType/FREEFORM (configuration-type {:test/item :freeform} "test" :item)))
    (is (= ConfigurationType/FEATURE_FLAGS (configuration-type {:item :feature-flags} "test" :item)))
    (is (= ConfigurationType/FEATURE_FLAGS (configuration-type {:test/item :feature-flags} "test" :item)))))


(deftest growth-type-test
  (testing "Testing enum function growth-type"
    (is (= GrowthType/LINEAR (growth-type {:item GrowthType/LINEAR} "test" :item)))
    (is (= GrowthType/LINEAR (growth-type {:test/item GrowthType/LINEAR} "test" :item)))
    (is (= GrowthType/EXPONENTIAL (growth-type {:item GrowthType/EXPONENTIAL} "test" :item)))
    (is (= GrowthType/EXPONENTIAL (growth-type {:test/item GrowthType/EXPONENTIAL} "test" :item)))
    (is (= GrowthType/LINEAR (growth-type {:item :linear} "test" :item)))
    (is (= GrowthType/LINEAR (growth-type {:test/item :linear} "test" :item)))
    (is (= GrowthType/EXPONENTIAL (growth-type {:item :exponential} "test" :item)))
    (is (= GrowthType/EXPONENTIAL (growth-type {:test/item :exponential} "test" :item)))))


(deftest monitor-type-test
  (testing "Testing enum function monitor-type"
    (is (= MonitorType/CLOUDWATCH (monitor-type {:item MonitorType/CLOUDWATCH} "test" :item)))
    (is (= MonitorType/CLOUDWATCH (monitor-type {:test/item MonitorType/CLOUDWATCH} "test" :item)))
    (is (= MonitorType/CFN_MONITORS_PROPERTY (monitor-type {:item MonitorType/CFN_MONITORS_PROPERTY} "test" :item)))
    (is (= MonitorType/CFN_MONITORS_PROPERTY (monitor-type {:test/item MonitorType/CFN_MONITORS_PROPERTY} "test" :item)))
    (is (= MonitorType/CLOUDWATCH (monitor-type {:item :cloudwatch} "test" :item)))
    (is (= MonitorType/CLOUDWATCH (monitor-type {:test/item :cloudwatch} "test" :item)))
    (is (= MonitorType/CFN_MONITORS_PROPERTY (monitor-type {:item :cfn-monitors-property} "test" :item)))
    (is (= MonitorType/CFN_MONITORS_PROPERTY (monitor-type {:test/item :cfn-monitors-property} "test" :item)))))


(deftest platform-test
  (testing "Testing enum function platform"
    (is (= Platform/X86_64 (platform {:item Platform/X86_64} "test" :item)))
    (is (= Platform/X86_64 (platform {:test/item Platform/X86_64} "test" :item)))
    (is (= Platform/ARM_64 (platform {:item Platform/ARM_64} "test" :item)))
    (is (= Platform/ARM_64 (platform {:test/item Platform/ARM_64} "test" :item)))
    (is (= Platform/X86_64 (platform {:item :x86-64} "test" :item)))
    (is (= Platform/X86_64 (platform {:test/item :x86-64} "test" :item)))
    (is (= Platform/ARM_64 (platform {:item :arm-64} "test" :item)))
    (is (= Platform/ARM_64 (platform {:test/item :arm-64} "test" :item)))))


(deftest source-type-test
  (testing "Testing enum function source-type"
    (is (= SourceType/EVENTS (source-type {:item SourceType/EVENTS} "test" :item)))
    (is (= SourceType/EVENTS (source-type {:test/item SourceType/EVENTS} "test" :item)))
    (is (= SourceType/LAMBDA (source-type {:item SourceType/LAMBDA} "test" :item)))
    (is (= SourceType/LAMBDA (source-type {:test/item SourceType/LAMBDA} "test" :item)))
    (is (= SourceType/SQS (source-type {:item SourceType/SQS} "test" :item)))
    (is (= SourceType/SQS (source-type {:test/item SourceType/SQS} "test" :item)))
    (is (= SourceType/SNS (source-type {:item SourceType/SNS} "test" :item)))
    (is (= SourceType/SNS (source-type {:test/item SourceType/SNS} "test" :item)))
    (is (= SourceType/EVENTS (source-type {:item :events} "test" :item)))
    (is (= SourceType/EVENTS (source-type {:test/item :events} "test" :item)))
    (is (= SourceType/LAMBDA (source-type {:item :lambda} "test" :item)))
    (is (= SourceType/LAMBDA (source-type {:test/item :lambda} "test" :item)))
    (is (= SourceType/SQS (source-type {:item :sqs} "test" :item)))
    (is (= SourceType/SQS (source-type {:test/item :sqs} "test" :item)))
    (is (= SourceType/SNS (source-type {:item :sns} "test" :item)))
    (is (= SourceType/SNS (source-type {:test/item :sns} "test" :item)))))


(deftest validator-type-test
  (testing "Testing enum function validator-type"
    (is (= ValidatorType/JSON_SCHEMA (validator-type {:item ValidatorType/JSON_SCHEMA} "test" :item)))
    (is (= ValidatorType/JSON_SCHEMA (validator-type {:test/item ValidatorType/JSON_SCHEMA} "test" :item)))
    (is (= ValidatorType/LAMBDA (validator-type {:item ValidatorType/LAMBDA} "test" :item)))
    (is (= ValidatorType/LAMBDA (validator-type {:test/item ValidatorType/LAMBDA} "test" :item)))
    (is (= ValidatorType/JSON_SCHEMA (validator-type {:item :json-schema} "test" :item)))
    (is (= ValidatorType/JSON_SCHEMA (validator-type {:test/item :json-schema} "test" :item)))
    (is (= ValidatorType/LAMBDA (validator-type {:item :lambda} "test" :item)))
    (is (= ValidatorType/LAMBDA (validator-type {:test/item :lambda} "test" :item)))))