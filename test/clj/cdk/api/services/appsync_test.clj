(ns cdk.api.services.appsync-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.appsync package. "
  (:require [cdk.api.services.appsync :refer [authorization-type
                                              field-log-level
                                              function-runtime-family
                                              introspection-config
                                              merge-type
                                              user-pool-default-action
                                              visibility]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.appsync AuthorizationType
                                                    FieldLogLevel
                                                    FunctionRuntimeFamily
                                                    IntrospectionConfig
                                                    MergeType
                                                    UserPoolDefaultAction
                                                    Visibility]))


(deftest authorization-type-test
  (testing "Testing enum function authorization-type"
    (is (= AuthorizationType/LAMBDA (authorization-type {:item AuthorizationType/LAMBDA} "test" :item)))
    (is (= AuthorizationType/LAMBDA (authorization-type {:test/item AuthorizationType/LAMBDA} "test" :item)))
    (is (= AuthorizationType/USER_POOL (authorization-type {:item AuthorizationType/USER_POOL} "test" :item)))
    (is (= AuthorizationType/USER_POOL (authorization-type {:test/item AuthorizationType/USER_POOL} "test" :item)))
    (is (= AuthorizationType/IAM (authorization-type {:item AuthorizationType/IAM} "test" :item)))
    (is (= AuthorizationType/IAM (authorization-type {:test/item AuthorizationType/IAM} "test" :item)))
    (is (= AuthorizationType/OIDC (authorization-type {:item AuthorizationType/OIDC} "test" :item)))
    (is (= AuthorizationType/OIDC (authorization-type {:test/item AuthorizationType/OIDC} "test" :item)))
    (is (= AuthorizationType/API_KEY (authorization-type {:item AuthorizationType/API_KEY} "test" :item)))
    (is (= AuthorizationType/API_KEY (authorization-type {:test/item AuthorizationType/API_KEY} "test" :item)))
    (is (= AuthorizationType/LAMBDA (authorization-type {:item :lambda} "test" :item)))
    (is (= AuthorizationType/LAMBDA (authorization-type {:test/item :lambda} "test" :item)))
    (is (= AuthorizationType/USER_POOL (authorization-type {:item :user-pool} "test" :item)))
    (is (= AuthorizationType/USER_POOL (authorization-type {:test/item :user-pool} "test" :item)))
    (is (= AuthorizationType/IAM (authorization-type {:item :iam} "test" :item)))
    (is (= AuthorizationType/IAM (authorization-type {:test/item :iam} "test" :item)))
    (is (= AuthorizationType/OIDC (authorization-type {:item :oidc} "test" :item)))
    (is (= AuthorizationType/OIDC (authorization-type {:test/item :oidc} "test" :item)))
    (is (= AuthorizationType/API_KEY (authorization-type {:item :api-key} "test" :item)))
    (is (= AuthorizationType/API_KEY (authorization-type {:test/item :api-key} "test" :item)))))


(deftest field-log-level-test
  (testing "Testing enum function field-log-level"
    (is (= FieldLogLevel/ALL (field-log-level {:item FieldLogLevel/ALL} "test" :item)))
    (is (= FieldLogLevel/ALL (field-log-level {:test/item FieldLogLevel/ALL} "test" :item)))
    (is (= FieldLogLevel/NONE (field-log-level {:item FieldLogLevel/NONE} "test" :item)))
    (is (= FieldLogLevel/NONE (field-log-level {:test/item FieldLogLevel/NONE} "test" :item)))
    (is (= FieldLogLevel/ERROR (field-log-level {:item FieldLogLevel/ERROR} "test" :item)))
    (is (= FieldLogLevel/ERROR (field-log-level {:test/item FieldLogLevel/ERROR} "test" :item)))
    (is (= FieldLogLevel/ALL (field-log-level {:item :all} "test" :item)))
    (is (= FieldLogLevel/ALL (field-log-level {:test/item :all} "test" :item)))
    (is (= FieldLogLevel/NONE (field-log-level {:item :none} "test" :item)))
    (is (= FieldLogLevel/NONE (field-log-level {:test/item :none} "test" :item)))
    (is (= FieldLogLevel/ERROR (field-log-level {:item :error} "test" :item)))
    (is (= FieldLogLevel/ERROR (field-log-level {:test/item :error} "test" :item)))))


(deftest function-runtime-family-test
  (testing "Testing enum function function-runtime-family"
    (is (= FunctionRuntimeFamily/JS (function-runtime-family {:item FunctionRuntimeFamily/JS} "test" :item)))
    (is (= FunctionRuntimeFamily/JS (function-runtime-family {:test/item FunctionRuntimeFamily/JS} "test" :item)))
    (is (= FunctionRuntimeFamily/JS (function-runtime-family {:item :js} "test" :item)))
    (is (= FunctionRuntimeFamily/JS (function-runtime-family {:test/item :js} "test" :item)))))


(deftest introspection-config-test
  (testing "Testing enum function introspection-config"
    (is (= IntrospectionConfig/ENABLED (introspection-config {:item IntrospectionConfig/ENABLED} "test" :item)))
    (is (= IntrospectionConfig/ENABLED (introspection-config {:test/item IntrospectionConfig/ENABLED} "test" :item)))
    (is (= IntrospectionConfig/DISABLED (introspection-config {:item IntrospectionConfig/DISABLED} "test" :item)))
    (is (= IntrospectionConfig/DISABLED (introspection-config {:test/item IntrospectionConfig/DISABLED} "test" :item)))
    (is (= IntrospectionConfig/ENABLED (introspection-config {:item :enabled} "test" :item)))
    (is (= IntrospectionConfig/ENABLED (introspection-config {:test/item :enabled} "test" :item)))
    (is (= IntrospectionConfig/DISABLED (introspection-config {:item :disabled} "test" :item)))
    (is (= IntrospectionConfig/DISABLED (introspection-config {:test/item :disabled} "test" :item)))))


(deftest merge-type-test
  (testing "Testing enum function merge-type"
    (is (= MergeType/MANUAL_MERGE (merge-type {:item MergeType/MANUAL_MERGE} "test" :item)))
    (is (= MergeType/MANUAL_MERGE (merge-type {:test/item MergeType/MANUAL_MERGE} "test" :item)))
    (is (= MergeType/AUTO_MERGE (merge-type {:item MergeType/AUTO_MERGE} "test" :item)))
    (is (= MergeType/AUTO_MERGE (merge-type {:test/item MergeType/AUTO_MERGE} "test" :item)))
    (is (= MergeType/MANUAL_MERGE (merge-type {:item :manual-merge} "test" :item)))
    (is (= MergeType/MANUAL_MERGE (merge-type {:test/item :manual-merge} "test" :item)))
    (is (= MergeType/AUTO_MERGE (merge-type {:item :auto-merge} "test" :item)))
    (is (= MergeType/AUTO_MERGE (merge-type {:test/item :auto-merge} "test" :item)))))


(deftest user-pool-default-action-test
  (testing "Testing enum function user-pool-default-action"
    (is (= UserPoolDefaultAction/ALLOW (user-pool-default-action {:item UserPoolDefaultAction/ALLOW} "test" :item)))
    (is (= UserPoolDefaultAction/ALLOW (user-pool-default-action {:test/item UserPoolDefaultAction/ALLOW} "test" :item)))
    (is (= UserPoolDefaultAction/DENY (user-pool-default-action {:item UserPoolDefaultAction/DENY} "test" :item)))
    (is (= UserPoolDefaultAction/DENY (user-pool-default-action {:test/item UserPoolDefaultAction/DENY} "test" :item)))
    (is (= UserPoolDefaultAction/ALLOW (user-pool-default-action {:item :allow} "test" :item)))
    (is (= UserPoolDefaultAction/ALLOW (user-pool-default-action {:test/item :allow} "test" :item)))
    (is (= UserPoolDefaultAction/DENY (user-pool-default-action {:item :deny} "test" :item)))
    (is (= UserPoolDefaultAction/DENY (user-pool-default-action {:test/item :deny} "test" :item)))))


(deftest visibility-test
  (testing "Testing enum function visibility"
    (is (= Visibility/GLOBAL (visibility {:item Visibility/GLOBAL} "test" :item)))
    (is (= Visibility/GLOBAL (visibility {:test/item Visibility/GLOBAL} "test" :item)))
    (is (= Visibility/PRIVATE (visibility {:item Visibility/PRIVATE} "test" :item)))
    (is (= Visibility/PRIVATE (visibility {:test/item Visibility/PRIVATE} "test" :item)))
    (is (= Visibility/GLOBAL (visibility {:item :global} "test" :item)))
    (is (= Visibility/GLOBAL (visibility {:test/item :global} "test" :item)))
    (is (= Visibility/PRIVATE (visibility {:item :private} "test" :item)))
    (is (= Visibility/PRIVATE (visibility {:test/item :private} "test" :item)))))