(ns cdk.api.services.codebuild-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codebuild package. "
  (:require [cdk.api.services.codebuild :refer [build-environment-variable-type
                                                compute-type
                                                event-action
                                                image-pull-principal-type
                                                local-cache-mode
                                                project-notification-events
                                                report-group-type
                                                windows-image-type]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.codebuild BuildEnvironmentVariableType
                                                      ComputeType
                                                      EventAction
                                                      ImagePullPrincipalType
                                                      LocalCacheMode
                                                      ProjectNotificationEvents
                                                      ReportGroupType
                                                      WindowsImageType]))


(deftest build-environment-variable-type-test
  (testing "Testing enum function build-environment-variable-type"
    (is (= BuildEnvironmentVariableType/SECRETS_MANAGER (build-environment-variable-type {:item BuildEnvironmentVariableType/SECRETS_MANAGER} "test" :item)))
    (is (= BuildEnvironmentVariableType/SECRETS_MANAGER (build-environment-variable-type {:test/item BuildEnvironmentVariableType/SECRETS_MANAGER} "test" :item)))
    (is (= BuildEnvironmentVariableType/PLAINTEXT (build-environment-variable-type {:item BuildEnvironmentVariableType/PLAINTEXT} "test" :item)))
    (is (= BuildEnvironmentVariableType/PLAINTEXT (build-environment-variable-type {:test/item BuildEnvironmentVariableType/PLAINTEXT} "test" :item)))
    (is (= BuildEnvironmentVariableType/PARAMETER_STORE (build-environment-variable-type {:item BuildEnvironmentVariableType/PARAMETER_STORE} "test" :item)))
    (is (= BuildEnvironmentVariableType/PARAMETER_STORE (build-environment-variable-type {:test/item BuildEnvironmentVariableType/PARAMETER_STORE} "test" :item)))
    (is (= BuildEnvironmentVariableType/SECRETS_MANAGER (build-environment-variable-type {:item :secrets-manager} "test" :item)))
    (is (= BuildEnvironmentVariableType/SECRETS_MANAGER (build-environment-variable-type {:test/item :secrets-manager} "test" :item)))
    (is (= BuildEnvironmentVariableType/PLAINTEXT (build-environment-variable-type {:item :plaintext} "test" :item)))
    (is (= BuildEnvironmentVariableType/PLAINTEXT (build-environment-variable-type {:test/item :plaintext} "test" :item)))
    (is (= BuildEnvironmentVariableType/PARAMETER_STORE (build-environment-variable-type {:item :parameter-store} "test" :item)))
    (is (= BuildEnvironmentVariableType/PARAMETER_STORE (build-environment-variable-type {:test/item :parameter-store} "test" :item)))))


(deftest compute-type-test
  (testing "Testing enum function compute-type"
    (is (= ComputeType/SMALL (compute-type {:item ComputeType/SMALL} "test" :item)))
    (is (= ComputeType/SMALL (compute-type {:test/item ComputeType/SMALL} "test" :item)))
    (is (= ComputeType/LARGE (compute-type {:item ComputeType/LARGE} "test" :item)))
    (is (= ComputeType/LARGE (compute-type {:test/item ComputeType/LARGE} "test" :item)))
    (is (= ComputeType/X_LARGE (compute-type {:item ComputeType/X_LARGE} "test" :item)))
    (is (= ComputeType/X_LARGE (compute-type {:test/item ComputeType/X_LARGE} "test" :item)))
    (is (= ComputeType/LAMBDA_10GB (compute-type {:item ComputeType/LAMBDA_10GB} "test" :item)))
    (is (= ComputeType/LAMBDA_10GB (compute-type {:test/item ComputeType/LAMBDA_10GB} "test" :item)))
    (is (= ComputeType/LAMBDA_2GB (compute-type {:item ComputeType/LAMBDA_2GB} "test" :item)))
    (is (= ComputeType/LAMBDA_2GB (compute-type {:test/item ComputeType/LAMBDA_2GB} "test" :item)))
    (is (= ComputeType/MEDIUM (compute-type {:item ComputeType/MEDIUM} "test" :item)))
    (is (= ComputeType/MEDIUM (compute-type {:test/item ComputeType/MEDIUM} "test" :item)))
    (is (= ComputeType/X2_LARGE (compute-type {:item ComputeType/X2_LARGE} "test" :item)))
    (is (= ComputeType/X2_LARGE (compute-type {:test/item ComputeType/X2_LARGE} "test" :item)))
    (is (= ComputeType/LAMBDA_1GB (compute-type {:item ComputeType/LAMBDA_1GB} "test" :item)))
    (is (= ComputeType/LAMBDA_1GB (compute-type {:test/item ComputeType/LAMBDA_1GB} "test" :item)))
    (is (= ComputeType/LAMBDA_4GB (compute-type {:item ComputeType/LAMBDA_4GB} "test" :item)))
    (is (= ComputeType/LAMBDA_4GB (compute-type {:test/item ComputeType/LAMBDA_4GB} "test" :item)))
    (is (= ComputeType/LAMBDA_8GB (compute-type {:item ComputeType/LAMBDA_8GB} "test" :item)))
    (is (= ComputeType/LAMBDA_8GB (compute-type {:test/item ComputeType/LAMBDA_8GB} "test" :item)))
    (is (= ComputeType/SMALL (compute-type {:item :small} "test" :item)))
    (is (= ComputeType/SMALL (compute-type {:test/item :small} "test" :item)))
    (is (= ComputeType/LARGE (compute-type {:item :large} "test" :item)))
    (is (= ComputeType/LARGE (compute-type {:test/item :large} "test" :item)))
    (is (= ComputeType/X_LARGE (compute-type {:item :x-large} "test" :item)))
    (is (= ComputeType/X_LARGE (compute-type {:test/item :x-large} "test" :item)))
    (is (= ComputeType/LAMBDA_10GB (compute-type {:item :lambda-10gb} "test" :item)))
    (is (= ComputeType/LAMBDA_10GB (compute-type {:test/item :lambda-10gb} "test" :item)))
    (is (= ComputeType/LAMBDA_2GB (compute-type {:item :lambda-2gb} "test" :item)))
    (is (= ComputeType/LAMBDA_2GB (compute-type {:test/item :lambda-2gb} "test" :item)))
    (is (= ComputeType/MEDIUM (compute-type {:item :medium} "test" :item)))
    (is (= ComputeType/MEDIUM (compute-type {:test/item :medium} "test" :item)))
    (is (= ComputeType/X2_LARGE (compute-type {:item :x2-large} "test" :item)))
    (is (= ComputeType/X2_LARGE (compute-type {:test/item :x2-large} "test" :item)))
    (is (= ComputeType/LAMBDA_1GB (compute-type {:item :lambda-1gb} "test" :item)))
    (is (= ComputeType/LAMBDA_1GB (compute-type {:test/item :lambda-1gb} "test" :item)))
    (is (= ComputeType/LAMBDA_4GB (compute-type {:item :lambda-4gb} "test" :item)))
    (is (= ComputeType/LAMBDA_4GB (compute-type {:test/item :lambda-4gb} "test" :item)))
    (is (= ComputeType/LAMBDA_8GB (compute-type {:item :lambda-8gb} "test" :item)))
    (is (= ComputeType/LAMBDA_8GB (compute-type {:test/item :lambda-8gb} "test" :item)))))


(deftest event-action-test
  (testing "Testing enum function event-action"
    (is (= EventAction/PULL_REQUEST_MERGED (event-action {:item EventAction/PULL_REQUEST_MERGED} "test" :item)))
    (is (= EventAction/PULL_REQUEST_MERGED (event-action {:test/item EventAction/PULL_REQUEST_MERGED} "test" :item)))
    (is (= EventAction/PULL_REQUEST_REOPENED (event-action {:item EventAction/PULL_REQUEST_REOPENED} "test" :item)))
    (is (= EventAction/PULL_REQUEST_REOPENED (event-action {:test/item EventAction/PULL_REQUEST_REOPENED} "test" :item)))
    (is (= EventAction/PULL_REQUEST_CREATED (event-action {:item EventAction/PULL_REQUEST_CREATED} "test" :item)))
    (is (= EventAction/PULL_REQUEST_CREATED (event-action {:test/item EventAction/PULL_REQUEST_CREATED} "test" :item)))
    (is (= EventAction/PULL_REQUEST_UPDATED (event-action {:item EventAction/PULL_REQUEST_UPDATED} "test" :item)))
    (is (= EventAction/PULL_REQUEST_UPDATED (event-action {:test/item EventAction/PULL_REQUEST_UPDATED} "test" :item)))
    (is (= EventAction/PUSH (event-action {:item EventAction/PUSH} "test" :item)))
    (is (= EventAction/PUSH (event-action {:test/item EventAction/PUSH} "test" :item)))
    (is (= EventAction/PULL_REQUEST_MERGED (event-action {:item :pull-request-merged} "test" :item)))
    (is (= EventAction/PULL_REQUEST_MERGED (event-action {:test/item :pull-request-merged} "test" :item)))
    (is (= EventAction/PULL_REQUEST_REOPENED (event-action {:item :pull-request-reopened} "test" :item)))
    (is (= EventAction/PULL_REQUEST_REOPENED (event-action {:test/item :pull-request-reopened} "test" :item)))
    (is (= EventAction/PULL_REQUEST_CREATED (event-action {:item :pull-request-created} "test" :item)))
    (is (= EventAction/PULL_REQUEST_CREATED (event-action {:test/item :pull-request-created} "test" :item)))
    (is (= EventAction/PULL_REQUEST_UPDATED (event-action {:item :pull-request-updated} "test" :item)))
    (is (= EventAction/PULL_REQUEST_UPDATED (event-action {:test/item :pull-request-updated} "test" :item)))
    (is (= EventAction/PUSH (event-action {:item :push} "test" :item)))
    (is (= EventAction/PUSH (event-action {:test/item :push} "test" :item)))))


(deftest image-pull-principal-type-test
  (testing "Testing enum function image-pull-principal-type"
    (is (= ImagePullPrincipalType/SERVICE_ROLE (image-pull-principal-type {:item ImagePullPrincipalType/SERVICE_ROLE} "test" :item)))
    (is (= ImagePullPrincipalType/SERVICE_ROLE (image-pull-principal-type {:test/item ImagePullPrincipalType/SERVICE_ROLE} "test" :item)))
    (is (= ImagePullPrincipalType/CODEBUILD (image-pull-principal-type {:item ImagePullPrincipalType/CODEBUILD} "test" :item)))
    (is (= ImagePullPrincipalType/CODEBUILD (image-pull-principal-type {:test/item ImagePullPrincipalType/CODEBUILD} "test" :item)))
    (is (= ImagePullPrincipalType/SERVICE_ROLE (image-pull-principal-type {:item :service-role} "test" :item)))
    (is (= ImagePullPrincipalType/SERVICE_ROLE (image-pull-principal-type {:test/item :service-role} "test" :item)))
    (is (= ImagePullPrincipalType/CODEBUILD (image-pull-principal-type {:item :codebuild} "test" :item)))
    (is (= ImagePullPrincipalType/CODEBUILD (image-pull-principal-type {:test/item :codebuild} "test" :item)))))


(deftest local-cache-mode-test
  (testing "Testing enum function local-cache-mode"
    (is (= LocalCacheMode/CUSTOM (local-cache-mode {:item LocalCacheMode/CUSTOM} "test" :item)))
    (is (= LocalCacheMode/CUSTOM (local-cache-mode {:test/item LocalCacheMode/CUSTOM} "test" :item)))
    (is (= LocalCacheMode/DOCKER_LAYER (local-cache-mode {:item LocalCacheMode/DOCKER_LAYER} "test" :item)))
    (is (= LocalCacheMode/DOCKER_LAYER (local-cache-mode {:test/item LocalCacheMode/DOCKER_LAYER} "test" :item)))
    (is (= LocalCacheMode/SOURCE (local-cache-mode {:item LocalCacheMode/SOURCE} "test" :item)))
    (is (= LocalCacheMode/SOURCE (local-cache-mode {:test/item LocalCacheMode/SOURCE} "test" :item)))
    (is (= LocalCacheMode/CUSTOM (local-cache-mode {:item :custom} "test" :item)))
    (is (= LocalCacheMode/CUSTOM (local-cache-mode {:test/item :custom} "test" :item)))
    (is (= LocalCacheMode/DOCKER_LAYER (local-cache-mode {:item :docker-layer} "test" :item)))
    (is (= LocalCacheMode/DOCKER_LAYER (local-cache-mode {:test/item :docker-layer} "test" :item)))
    (is (= LocalCacheMode/SOURCE (local-cache-mode {:item :source} "test" :item)))
    (is (= LocalCacheMode/SOURCE (local-cache-mode {:test/item :source} "test" :item)))))


(deftest project-notification-events-test
  (testing "Testing enum function project-notification-events"
    (is (= ProjectNotificationEvents/BUILD_STOPPED (project-notification-events {:item ProjectNotificationEvents/BUILD_STOPPED} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_STOPPED (project-notification-events {:test/item ProjectNotificationEvents/BUILD_STOPPED} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_FAILED (project-notification-events {:item ProjectNotificationEvents/BUILD_FAILED} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_FAILED (project-notification-events {:test/item ProjectNotificationEvents/BUILD_FAILED} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_SUCCEEDED (project-notification-events {:item ProjectNotificationEvents/BUILD_SUCCEEDED} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_SUCCEEDED (project-notification-events {:test/item ProjectNotificationEvents/BUILD_SUCCEEDED} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_PHASE_FAILED (project-notification-events {:item ProjectNotificationEvents/BUILD_PHASE_FAILED} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_PHASE_FAILED (project-notification-events {:test/item ProjectNotificationEvents/BUILD_PHASE_FAILED} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_IN_PROGRESS (project-notification-events {:item ProjectNotificationEvents/BUILD_IN_PROGRESS} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_IN_PROGRESS (project-notification-events {:test/item ProjectNotificationEvents/BUILD_IN_PROGRESS} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_PHASE_SUCCEEDED (project-notification-events {:item ProjectNotificationEvents/BUILD_PHASE_SUCCEEDED} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_PHASE_SUCCEEDED (project-notification-events {:test/item ProjectNotificationEvents/BUILD_PHASE_SUCCEEDED} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_STOPPED (project-notification-events {:item :build-stopped} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_STOPPED (project-notification-events {:test/item :build-stopped} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_FAILED (project-notification-events {:item :build-failed} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_FAILED (project-notification-events {:test/item :build-failed} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_SUCCEEDED (project-notification-events {:item :build-succeeded} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_SUCCEEDED (project-notification-events {:test/item :build-succeeded} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_PHASE_FAILED (project-notification-events {:item :build-phase-failed} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_PHASE_FAILED (project-notification-events {:test/item :build-phase-failed} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_IN_PROGRESS (project-notification-events {:item :build-in-progress} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_IN_PROGRESS (project-notification-events {:test/item :build-in-progress} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_PHASE_SUCCEEDED (project-notification-events {:item :build-phase-succeeded} "test" :item)))
    (is (= ProjectNotificationEvents/BUILD_PHASE_SUCCEEDED (project-notification-events {:test/item :build-phase-succeeded} "test" :item)))))


(deftest report-group-type-test
  (testing "Testing enum function report-group-type"
    (is (= ReportGroupType/CODE_COVERAGE (report-group-type {:item ReportGroupType/CODE_COVERAGE} "test" :item)))
    (is (= ReportGroupType/CODE_COVERAGE (report-group-type {:test/item ReportGroupType/CODE_COVERAGE} "test" :item)))
    (is (= ReportGroupType/TEST (report-group-type {:item ReportGroupType/TEST} "test" :item)))
    (is (= ReportGroupType/TEST (report-group-type {:test/item ReportGroupType/TEST} "test" :item)))
    (is (= ReportGroupType/CODE_COVERAGE (report-group-type {:item :code-coverage} "test" :item)))
    (is (= ReportGroupType/CODE_COVERAGE (report-group-type {:test/item :code-coverage} "test" :item)))
    (is (= ReportGroupType/TEST (report-group-type {:item :test} "test" :item)))
    (is (= ReportGroupType/TEST (report-group-type {:test/item :test} "test" :item)))))


(deftest windows-image-type-test
  (testing "Testing enum function windows-image-type"
    (is (= WindowsImageType/SERVER_2019 (windows-image-type {:item WindowsImageType/SERVER_2019} "test" :item)))
    (is (= WindowsImageType/SERVER_2019 (windows-image-type {:test/item WindowsImageType/SERVER_2019} "test" :item)))
    (is (= WindowsImageType/STANDARD (windows-image-type {:item WindowsImageType/STANDARD} "test" :item)))
    (is (= WindowsImageType/STANDARD (windows-image-type {:test/item WindowsImageType/STANDARD} "test" :item)))
    (is (= WindowsImageType/SERVER_2019 (windows-image-type {:item :server-2019} "test" :item)))
    (is (= WindowsImageType/SERVER_2019 (windows-image-type {:test/item :server-2019} "test" :item)))
    (is (= WindowsImageType/STANDARD (windows-image-type {:item :standard} "test" :item)))
    (is (= WindowsImageType/STANDARD (windows-image-type {:test/item :standard} "test" :item)))))