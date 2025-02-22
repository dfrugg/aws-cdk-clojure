(ns cdk.api.services.codepipeline.actions-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codepipeline.actions package. "
  (:require [cdk.api.services.codepipeline.actions :refer [code-build-action-type
                                                           code-commit-trigger
                                                           git-hub-trigger
                                                           jenkins-action-type
                                                           s3-trigger
                                                           stack-set-organizations-auto-deployment]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.codepipeline.actions CodeBuildActionType
                                                                 CodeCommitTrigger
                                                                 GitHubTrigger
                                                                 JenkinsActionType
                                                                 S3Trigger
                                                                 StackSetOrganizationsAutoDeployment]))


(deftest code-build-action-type-test
  (testing "Testing enum function code-build-action-type"
    (is (= CodeBuildActionType/BUILD (code-build-action-type {:item CodeBuildActionType/BUILD} "test" :item)))
    (is (= CodeBuildActionType/BUILD (code-build-action-type {:test/item CodeBuildActionType/BUILD} "test" :item)))
    (is (= CodeBuildActionType/TEST (code-build-action-type {:item CodeBuildActionType/TEST} "test" :item)))
    (is (= CodeBuildActionType/TEST (code-build-action-type {:test/item CodeBuildActionType/TEST} "test" :item)))
    (is (= CodeBuildActionType/BUILD (code-build-action-type {:item :build} "test" :item)))
    (is (= CodeBuildActionType/BUILD (code-build-action-type {:test/item :build} "test" :item)))
    (is (= CodeBuildActionType/TEST (code-build-action-type {:item :test} "test" :item)))
    (is (= CodeBuildActionType/TEST (code-build-action-type {:test/item :test} "test" :item)))))


(deftest code-commit-trigger-test
  (testing "Testing enum function code-commit-trigger"
    (is (= CodeCommitTrigger/POLL (code-commit-trigger {:item CodeCommitTrigger/POLL} "test" :item)))
    (is (= CodeCommitTrigger/POLL (code-commit-trigger {:test/item CodeCommitTrigger/POLL} "test" :item)))
    (is (= CodeCommitTrigger/EVENTS (code-commit-trigger {:item CodeCommitTrigger/EVENTS} "test" :item)))
    (is (= CodeCommitTrigger/EVENTS (code-commit-trigger {:test/item CodeCommitTrigger/EVENTS} "test" :item)))
    (is (= CodeCommitTrigger/NONE (code-commit-trigger {:item CodeCommitTrigger/NONE} "test" :item)))
    (is (= CodeCommitTrigger/NONE (code-commit-trigger {:test/item CodeCommitTrigger/NONE} "test" :item)))
    (is (= CodeCommitTrigger/POLL (code-commit-trigger {:item :poll} "test" :item)))
    (is (= CodeCommitTrigger/POLL (code-commit-trigger {:test/item :poll} "test" :item)))
    (is (= CodeCommitTrigger/EVENTS (code-commit-trigger {:item :events} "test" :item)))
    (is (= CodeCommitTrigger/EVENTS (code-commit-trigger {:test/item :events} "test" :item)))
    (is (= CodeCommitTrigger/NONE (code-commit-trigger {:item :none} "test" :item)))
    (is (= CodeCommitTrigger/NONE (code-commit-trigger {:test/item :none} "test" :item)))))


(deftest git-hub-trigger-test
  (testing "Testing enum function git-hub-trigger"
    (is (= GitHubTrigger/NONE (git-hub-trigger {:item GitHubTrigger/NONE} "test" :item)))
    (is (= GitHubTrigger/NONE (git-hub-trigger {:test/item GitHubTrigger/NONE} "test" :item)))
    (is (= GitHubTrigger/WEBHOOK (git-hub-trigger {:item GitHubTrigger/WEBHOOK} "test" :item)))
    (is (= GitHubTrigger/WEBHOOK (git-hub-trigger {:test/item GitHubTrigger/WEBHOOK} "test" :item)))
    (is (= GitHubTrigger/POLL (git-hub-trigger {:item GitHubTrigger/POLL} "test" :item)))
    (is (= GitHubTrigger/POLL (git-hub-trigger {:test/item GitHubTrigger/POLL} "test" :item)))
    (is (= GitHubTrigger/NONE (git-hub-trigger {:item :none} "test" :item)))
    (is (= GitHubTrigger/NONE (git-hub-trigger {:test/item :none} "test" :item)))
    (is (= GitHubTrigger/WEBHOOK (git-hub-trigger {:item :webhook} "test" :item)))
    (is (= GitHubTrigger/WEBHOOK (git-hub-trigger {:test/item :webhook} "test" :item)))
    (is (= GitHubTrigger/POLL (git-hub-trigger {:item :poll} "test" :item)))
    (is (= GitHubTrigger/POLL (git-hub-trigger {:test/item :poll} "test" :item)))))


(deftest jenkins-action-type-test
  (testing "Testing enum function jenkins-action-type"
    (is (= JenkinsActionType/TEST (jenkins-action-type {:item JenkinsActionType/TEST} "test" :item)))
    (is (= JenkinsActionType/TEST (jenkins-action-type {:test/item JenkinsActionType/TEST} "test" :item)))
    (is (= JenkinsActionType/BUILD (jenkins-action-type {:item JenkinsActionType/BUILD} "test" :item)))
    (is (= JenkinsActionType/BUILD (jenkins-action-type {:test/item JenkinsActionType/BUILD} "test" :item)))
    (is (= JenkinsActionType/TEST (jenkins-action-type {:item :test} "test" :item)))
    (is (= JenkinsActionType/TEST (jenkins-action-type {:test/item :test} "test" :item)))
    (is (= JenkinsActionType/BUILD (jenkins-action-type {:item :build} "test" :item)))
    (is (= JenkinsActionType/BUILD (jenkins-action-type {:test/item :build} "test" :item)))))


(deftest s3-trigger-test
  (testing "Testing enum function s3-trigger"
    (is (= S3Trigger/EVENTS (s3-trigger {:item S3Trigger/EVENTS} "test" :item)))
    (is (= S3Trigger/EVENTS (s3-trigger {:test/item S3Trigger/EVENTS} "test" :item)))
    (is (= S3Trigger/POLL (s3-trigger {:item S3Trigger/POLL} "test" :item)))
    (is (= S3Trigger/POLL (s3-trigger {:test/item S3Trigger/POLL} "test" :item)))
    (is (= S3Trigger/NONE (s3-trigger {:item S3Trigger/NONE} "test" :item)))
    (is (= S3Trigger/NONE (s3-trigger {:test/item S3Trigger/NONE} "test" :item)))
    (is (= S3Trigger/EVENTS (s3-trigger {:item :events} "test" :item)))
    (is (= S3Trigger/EVENTS (s3-trigger {:test/item :events} "test" :item)))
    (is (= S3Trigger/POLL (s3-trigger {:item :poll} "test" :item)))
    (is (= S3Trigger/POLL (s3-trigger {:test/item :poll} "test" :item)))
    (is (= S3Trigger/NONE (s3-trigger {:item :none} "test" :item)))
    (is (= S3Trigger/NONE (s3-trigger {:test/item :none} "test" :item)))))


(deftest stack-set-organizations-auto-deployment-test
  (testing "Testing enum function stack-set-organizations-auto-deployment"
    (is (= StackSetOrganizationsAutoDeployment/ENABLED_WITH_STACK_RETENTION (stack-set-organizations-auto-deployment {:item StackSetOrganizationsAutoDeployment/ENABLED_WITH_STACK_RETENTION} "test" :item)))
    (is (= StackSetOrganizationsAutoDeployment/ENABLED_WITH_STACK_RETENTION (stack-set-organizations-auto-deployment {:test/item StackSetOrganizationsAutoDeployment/ENABLED_WITH_STACK_RETENTION} "test" :item)))
    (is (= StackSetOrganizationsAutoDeployment/DISABLED (stack-set-organizations-auto-deployment {:item StackSetOrganizationsAutoDeployment/DISABLED} "test" :item)))
    (is (= StackSetOrganizationsAutoDeployment/DISABLED (stack-set-organizations-auto-deployment {:test/item StackSetOrganizationsAutoDeployment/DISABLED} "test" :item)))
    (is (= StackSetOrganizationsAutoDeployment/ENABLED (stack-set-organizations-auto-deployment {:item StackSetOrganizationsAutoDeployment/ENABLED} "test" :item)))
    (is (= StackSetOrganizationsAutoDeployment/ENABLED (stack-set-organizations-auto-deployment {:test/item StackSetOrganizationsAutoDeployment/ENABLED} "test" :item)))
    (is (= StackSetOrganizationsAutoDeployment/ENABLED_WITH_STACK_RETENTION (stack-set-organizations-auto-deployment {:item :enabled-with-stack-retention} "test" :item)))
    (is (= StackSetOrganizationsAutoDeployment/ENABLED_WITH_STACK_RETENTION (stack-set-organizations-auto-deployment {:test/item :enabled-with-stack-retention} "test" :item)))
    (is (= StackSetOrganizationsAutoDeployment/DISABLED (stack-set-organizations-auto-deployment {:item :disabled} "test" :item)))
    (is (= StackSetOrganizationsAutoDeployment/DISABLED (stack-set-organizations-auto-deployment {:test/item :disabled} "test" :item)))
    (is (= StackSetOrganizationsAutoDeployment/ENABLED (stack-set-organizations-auto-deployment {:item :enabled} "test" :item)))
    (is (= StackSetOrganizationsAutoDeployment/ENABLED (stack-set-organizations-auto-deployment {:test/item :enabled} "test" :item)))))