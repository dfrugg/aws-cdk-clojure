(ns cdk.api.services.codepipeline-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codepipeline package. "
  (:require [cdk.api.services.codepipeline :refer [action-category
                                                   execution-mode
                                                   git-pull-request-event
                                                   pipeline-notification-events
                                                   pipeline-type
                                                   provider-type]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.codepipeline ActionCategory
                                                         ExecutionMode
                                                         GitPullRequestEvent
                                                         PipelineNotificationEvents
                                                         PipelineType
                                                         ProviderType]))


(deftest action-category-test
  (testing "Testing enum function action-category"
    (is (= ActionCategory/DEPLOY (action-category {:item ActionCategory/DEPLOY} "test" :item)))
    (is (= ActionCategory/DEPLOY (action-category {:test/item ActionCategory/DEPLOY} "test" :item)))
    (is (= ActionCategory/APPROVAL (action-category {:item ActionCategory/APPROVAL} "test" :item)))
    (is (= ActionCategory/APPROVAL (action-category {:test/item ActionCategory/APPROVAL} "test" :item)))
    (is (= ActionCategory/TEST (action-category {:item ActionCategory/TEST} "test" :item)))
    (is (= ActionCategory/TEST (action-category {:test/item ActionCategory/TEST} "test" :item)))
    (is (= ActionCategory/INVOKE (action-category {:item ActionCategory/INVOKE} "test" :item)))
    (is (= ActionCategory/INVOKE (action-category {:test/item ActionCategory/INVOKE} "test" :item)))
    (is (= ActionCategory/BUILD (action-category {:item ActionCategory/BUILD} "test" :item)))
    (is (= ActionCategory/BUILD (action-category {:test/item ActionCategory/BUILD} "test" :item)))
    (is (= ActionCategory/SOURCE (action-category {:item ActionCategory/SOURCE} "test" :item)))
    (is (= ActionCategory/SOURCE (action-category {:test/item ActionCategory/SOURCE} "test" :item)))
    (is (= ActionCategory/DEPLOY (action-category {:item :deploy} "test" :item)))
    (is (= ActionCategory/DEPLOY (action-category {:test/item :deploy} "test" :item)))
    (is (= ActionCategory/APPROVAL (action-category {:item :approval} "test" :item)))
    (is (= ActionCategory/APPROVAL (action-category {:test/item :approval} "test" :item)))
    (is (= ActionCategory/TEST (action-category {:item :test} "test" :item)))
    (is (= ActionCategory/TEST (action-category {:test/item :test} "test" :item)))
    (is (= ActionCategory/INVOKE (action-category {:item :invoke} "test" :item)))
    (is (= ActionCategory/INVOKE (action-category {:test/item :invoke} "test" :item)))
    (is (= ActionCategory/BUILD (action-category {:item :build} "test" :item)))
    (is (= ActionCategory/BUILD (action-category {:test/item :build} "test" :item)))
    (is (= ActionCategory/SOURCE (action-category {:item :source} "test" :item)))
    (is (= ActionCategory/SOURCE (action-category {:test/item :source} "test" :item)))))


(deftest execution-mode-test
  (testing "Testing enum function execution-mode"
    (is (= ExecutionMode/SUPERSEDED (execution-mode {:item ExecutionMode/SUPERSEDED} "test" :item)))
    (is (= ExecutionMode/SUPERSEDED (execution-mode {:test/item ExecutionMode/SUPERSEDED} "test" :item)))
    (is (= ExecutionMode/PARALLEL (execution-mode {:item ExecutionMode/PARALLEL} "test" :item)))
    (is (= ExecutionMode/PARALLEL (execution-mode {:test/item ExecutionMode/PARALLEL} "test" :item)))
    (is (= ExecutionMode/QUEUED (execution-mode {:item ExecutionMode/QUEUED} "test" :item)))
    (is (= ExecutionMode/QUEUED (execution-mode {:test/item ExecutionMode/QUEUED} "test" :item)))
    (is (= ExecutionMode/SUPERSEDED (execution-mode {:item :superseded} "test" :item)))
    (is (= ExecutionMode/SUPERSEDED (execution-mode {:test/item :superseded} "test" :item)))
    (is (= ExecutionMode/PARALLEL (execution-mode {:item :parallel} "test" :item)))
    (is (= ExecutionMode/PARALLEL (execution-mode {:test/item :parallel} "test" :item)))
    (is (= ExecutionMode/QUEUED (execution-mode {:item :queued} "test" :item)))
    (is (= ExecutionMode/QUEUED (execution-mode {:test/item :queued} "test" :item)))))


(deftest git-pull-request-event-test
  (testing "Testing enum function git-pull-request-event"
    (is (= GitPullRequestEvent/UPDATED (git-pull-request-event {:item GitPullRequestEvent/UPDATED} "test" :item)))
    (is (= GitPullRequestEvent/UPDATED (git-pull-request-event {:test/item GitPullRequestEvent/UPDATED} "test" :item)))
    (is (= GitPullRequestEvent/OPEN (git-pull-request-event {:item GitPullRequestEvent/OPEN} "test" :item)))
    (is (= GitPullRequestEvent/OPEN (git-pull-request-event {:test/item GitPullRequestEvent/OPEN} "test" :item)))
    (is (= GitPullRequestEvent/CLOSED (git-pull-request-event {:item GitPullRequestEvent/CLOSED} "test" :item)))
    (is (= GitPullRequestEvent/CLOSED (git-pull-request-event {:test/item GitPullRequestEvent/CLOSED} "test" :item)))
    (is (= GitPullRequestEvent/UPDATED (git-pull-request-event {:item :updated} "test" :item)))
    (is (= GitPullRequestEvent/UPDATED (git-pull-request-event {:test/item :updated} "test" :item)))
    (is (= GitPullRequestEvent/OPEN (git-pull-request-event {:item :open} "test" :item)))
    (is (= GitPullRequestEvent/OPEN (git-pull-request-event {:test/item :open} "test" :item)))
    (is (= GitPullRequestEvent/CLOSED (git-pull-request-event {:item :closed} "test" :item)))
    (is (= GitPullRequestEvent/CLOSED (git-pull-request-event {:test/item :closed} "test" :item)))))


(deftest pipeline-notification-events-test
  (testing "Testing enum function pipeline-notification-events"
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_STARTED (pipeline-notification-events {:item PipelineNotificationEvents/PIPELINE_EXECUTION_STARTED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_STARTED (pipeline-notification-events {:test/item PipelineNotificationEvents/PIPELINE_EXECUTION_STARTED} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_STARTED (pipeline-notification-events {:item PipelineNotificationEvents/STAGE_EXECUTION_STARTED} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_STARTED (pipeline-notification-events {:test/item PipelineNotificationEvents/STAGE_EXECUTION_STARTED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_SUPERSEDED (pipeline-notification-events {:item PipelineNotificationEvents/PIPELINE_EXECUTION_SUPERSEDED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_SUPERSEDED (pipeline-notification-events {:test/item PipelineNotificationEvents/PIPELINE_EXECUTION_SUPERSEDED} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_FAILED (pipeline-notification-events {:item PipelineNotificationEvents/MANUAL_APPROVAL_FAILED} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_FAILED (pipeline-notification-events {:test/item PipelineNotificationEvents/MANUAL_APPROVAL_FAILED} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_STARTED (pipeline-notification-events {:item PipelineNotificationEvents/ACTION_EXECUTION_STARTED} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_STARTED (pipeline-notification-events {:test/item PipelineNotificationEvents/ACTION_EXECUTION_STARTED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_CANCELED (pipeline-notification-events {:item PipelineNotificationEvents/PIPELINE_EXECUTION_CANCELED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_CANCELED (pipeline-notification-events {:test/item PipelineNotificationEvents/PIPELINE_EXECUTION_CANCELED} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_SUCCEEDED (pipeline-notification-events {:item PipelineNotificationEvents/STAGE_EXECUTION_SUCCEEDED} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_SUCCEEDED (pipeline-notification-events {:test/item PipelineNotificationEvents/STAGE_EXECUTION_SUCCEEDED} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_FAILED (pipeline-notification-events {:item PipelineNotificationEvents/STAGE_EXECUTION_FAILED} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_FAILED (pipeline-notification-events {:test/item PipelineNotificationEvents/STAGE_EXECUTION_FAILED} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_CANCELED (pipeline-notification-events {:item PipelineNotificationEvents/STAGE_EXECUTION_CANCELED} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_CANCELED (pipeline-notification-events {:test/item PipelineNotificationEvents/STAGE_EXECUTION_CANCELED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_SUCCEEDED (pipeline-notification-events {:item PipelineNotificationEvents/PIPELINE_EXECUTION_SUCCEEDED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_SUCCEEDED (pipeline-notification-events {:test/item PipelineNotificationEvents/PIPELINE_EXECUTION_SUCCEEDED} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_NEEDED (pipeline-notification-events {:item PipelineNotificationEvents/MANUAL_APPROVAL_NEEDED} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_NEEDED (pipeline-notification-events {:test/item PipelineNotificationEvents/MANUAL_APPROVAL_NEEDED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_FAILED (pipeline-notification-events {:item PipelineNotificationEvents/PIPELINE_EXECUTION_FAILED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_FAILED (pipeline-notification-events {:test/item PipelineNotificationEvents/PIPELINE_EXECUTION_FAILED} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_FAILED (pipeline-notification-events {:item PipelineNotificationEvents/ACTION_EXECUTION_FAILED} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_FAILED (pipeline-notification-events {:test/item PipelineNotificationEvents/ACTION_EXECUTION_FAILED} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_RESUMED (pipeline-notification-events {:item PipelineNotificationEvents/STAGE_EXECUTION_RESUMED} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_RESUMED (pipeline-notification-events {:test/item PipelineNotificationEvents/STAGE_EXECUTION_RESUMED} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_SUCCEEDED (pipeline-notification-events {:item PipelineNotificationEvents/MANUAL_APPROVAL_SUCCEEDED} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_SUCCEEDED (pipeline-notification-events {:test/item PipelineNotificationEvents/MANUAL_APPROVAL_SUCCEEDED} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_SUCCEEDED (pipeline-notification-events {:item PipelineNotificationEvents/ACTION_EXECUTION_SUCCEEDED} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_SUCCEEDED (pipeline-notification-events {:test/item PipelineNotificationEvents/ACTION_EXECUTION_SUCCEEDED} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_CANCELED (pipeline-notification-events {:item PipelineNotificationEvents/ACTION_EXECUTION_CANCELED} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_CANCELED (pipeline-notification-events {:test/item PipelineNotificationEvents/ACTION_EXECUTION_CANCELED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_RESUMED (pipeline-notification-events {:item PipelineNotificationEvents/PIPELINE_EXECUTION_RESUMED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_RESUMED (pipeline-notification-events {:test/item PipelineNotificationEvents/PIPELINE_EXECUTION_RESUMED} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_STARTED (pipeline-notification-events {:item :pipeline-execution-started} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_STARTED (pipeline-notification-events {:test/item :pipeline-execution-started} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_STARTED (pipeline-notification-events {:item :stage-execution-started} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_STARTED (pipeline-notification-events {:test/item :stage-execution-started} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_SUPERSEDED (pipeline-notification-events {:item :pipeline-execution-superseded} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_SUPERSEDED (pipeline-notification-events {:test/item :pipeline-execution-superseded} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_FAILED (pipeline-notification-events {:item :manual-approval-failed} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_FAILED (pipeline-notification-events {:test/item :manual-approval-failed} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_STARTED (pipeline-notification-events {:item :action-execution-started} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_STARTED (pipeline-notification-events {:test/item :action-execution-started} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_CANCELED (pipeline-notification-events {:item :pipeline-execution-canceled} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_CANCELED (pipeline-notification-events {:test/item :pipeline-execution-canceled} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_SUCCEEDED (pipeline-notification-events {:item :stage-execution-succeeded} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_SUCCEEDED (pipeline-notification-events {:test/item :stage-execution-succeeded} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_FAILED (pipeline-notification-events {:item :stage-execution-failed} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_FAILED (pipeline-notification-events {:test/item :stage-execution-failed} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_CANCELED (pipeline-notification-events {:item :stage-execution-canceled} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_CANCELED (pipeline-notification-events {:test/item :stage-execution-canceled} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_SUCCEEDED (pipeline-notification-events {:item :pipeline-execution-succeeded} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_SUCCEEDED (pipeline-notification-events {:test/item :pipeline-execution-succeeded} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_NEEDED (pipeline-notification-events {:item :manual-approval-needed} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_NEEDED (pipeline-notification-events {:test/item :manual-approval-needed} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_FAILED (pipeline-notification-events {:item :pipeline-execution-failed} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_FAILED (pipeline-notification-events {:test/item :pipeline-execution-failed} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_FAILED (pipeline-notification-events {:item :action-execution-failed} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_FAILED (pipeline-notification-events {:test/item :action-execution-failed} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_RESUMED (pipeline-notification-events {:item :stage-execution-resumed} "test" :item)))
    (is (= PipelineNotificationEvents/STAGE_EXECUTION_RESUMED (pipeline-notification-events {:test/item :stage-execution-resumed} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_SUCCEEDED (pipeline-notification-events {:item :manual-approval-succeeded} "test" :item)))
    (is (= PipelineNotificationEvents/MANUAL_APPROVAL_SUCCEEDED (pipeline-notification-events {:test/item :manual-approval-succeeded} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_SUCCEEDED (pipeline-notification-events {:item :action-execution-succeeded} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_SUCCEEDED (pipeline-notification-events {:test/item :action-execution-succeeded} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_CANCELED (pipeline-notification-events {:item :action-execution-canceled} "test" :item)))
    (is (= PipelineNotificationEvents/ACTION_EXECUTION_CANCELED (pipeline-notification-events {:test/item :action-execution-canceled} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_RESUMED (pipeline-notification-events {:item :pipeline-execution-resumed} "test" :item)))
    (is (= PipelineNotificationEvents/PIPELINE_EXECUTION_RESUMED (pipeline-notification-events {:test/item :pipeline-execution-resumed} "test" :item)))))


(deftest pipeline-type-test
  (testing "Testing enum function pipeline-type"
    (is (= PipelineType/V2 (pipeline-type {:item PipelineType/V2} "test" :item)))
    (is (= PipelineType/V2 (pipeline-type {:test/item PipelineType/V2} "test" :item)))
    (is (= PipelineType/V1 (pipeline-type {:item PipelineType/V1} "test" :item)))
    (is (= PipelineType/V1 (pipeline-type {:test/item PipelineType/V1} "test" :item)))
    (is (= PipelineType/V2 (pipeline-type {:item :v2} "test" :item)))
    (is (= PipelineType/V2 (pipeline-type {:test/item :v2} "test" :item)))
    (is (= PipelineType/V1 (pipeline-type {:item :v1} "test" :item)))
    (is (= PipelineType/V1 (pipeline-type {:test/item :v1} "test" :item)))))


(deftest provider-type-test
  (testing "Testing enum function provider-type"
    (is (= ProviderType/CODE_STAR_SOURCE_CONNECTION (provider-type {:item ProviderType/CODE_STAR_SOURCE_CONNECTION} "test" :item)))
    (is (= ProviderType/CODE_STAR_SOURCE_CONNECTION (provider-type {:test/item ProviderType/CODE_STAR_SOURCE_CONNECTION} "test" :item)))
    (is (= ProviderType/CODE_STAR_SOURCE_CONNECTION (provider-type {:item :code-star-source-connection} "test" :item)))
    (is (= ProviderType/CODE_STAR_SOURCE_CONNECTION (provider-type {:test/item :code-star-source-connection} "test" :item)))))