(ns cdk.api.services.codecommit-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codecommit package. "
  (:require [cdk.api.services.codecommit :refer [repository-event-trigger
                                                 repository-notification-events]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.codecommit RepositoryEventTrigger
                                                       RepositoryNotificationEvents]))


(deftest repository-event-trigger-test
  (testing "Testing enum function repository-event-trigger"
    (is (= RepositoryEventTrigger/DELETE_REF (repository-event-trigger {:item RepositoryEventTrigger/DELETE_REF} "test" :item)))
    (is (= RepositoryEventTrigger/DELETE_REF (repository-event-trigger {:test/item RepositoryEventTrigger/DELETE_REF} "test" :item)))
    (is (= RepositoryEventTrigger/CREATE_REF (repository-event-trigger {:item RepositoryEventTrigger/CREATE_REF} "test" :item)))
    (is (= RepositoryEventTrigger/CREATE_REF (repository-event-trigger {:test/item RepositoryEventTrigger/CREATE_REF} "test" :item)))
    (is (= RepositoryEventTrigger/ALL (repository-event-trigger {:item RepositoryEventTrigger/ALL} "test" :item)))
    (is (= RepositoryEventTrigger/ALL (repository-event-trigger {:test/item RepositoryEventTrigger/ALL} "test" :item)))
    (is (= RepositoryEventTrigger/UPDATE_REF (repository-event-trigger {:item RepositoryEventTrigger/UPDATE_REF} "test" :item)))
    (is (= RepositoryEventTrigger/UPDATE_REF (repository-event-trigger {:test/item RepositoryEventTrigger/UPDATE_REF} "test" :item)))
    (is (= RepositoryEventTrigger/DELETE_REF (repository-event-trigger {:item :delete-ref} "test" :item)))
    (is (= RepositoryEventTrigger/DELETE_REF (repository-event-trigger {:test/item :delete-ref} "test" :item)))
    (is (= RepositoryEventTrigger/CREATE_REF (repository-event-trigger {:item :create-ref} "test" :item)))
    (is (= RepositoryEventTrigger/CREATE_REF (repository-event-trigger {:test/item :create-ref} "test" :item)))
    (is (= RepositoryEventTrigger/ALL (repository-event-trigger {:item :all} "test" :item)))
    (is (= RepositoryEventTrigger/ALL (repository-event-trigger {:test/item :all} "test" :item)))
    (is (= RepositoryEventTrigger/UPDATE_REF (repository-event-trigger {:item :update-ref} "test" :item)))
    (is (= RepositoryEventTrigger/UPDATE_REF (repository-event-trigger {:test/item :update-ref} "test" :item)))))


(deftest repository-notification-events-test
  (testing "Testing enum function repository-notification-events"
    (is (= RepositoryNotificationEvents/PULL_REQUEST_CREATED (repository-notification-events {:item RepositoryNotificationEvents/PULL_REQUEST_CREATED} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_CREATED (repository-notification-events {:test/item RepositoryNotificationEvents/PULL_REQUEST_CREATED} "test" :item)))
    (is (= RepositoryNotificationEvents/APPROVAL_STATUS_CHANGED (repository-notification-events {:item RepositoryNotificationEvents/APPROVAL_STATUS_CHANGED} "test" :item)))
    (is (= RepositoryNotificationEvents/APPROVAL_STATUS_CHANGED (repository-notification-events {:test/item RepositoryNotificationEvents/APPROVAL_STATUS_CHANGED} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_DELETED (repository-notification-events {:item RepositoryNotificationEvents/BRANCH_OR_TAG_DELETED} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_DELETED (repository-notification-events {:test/item RepositoryNotificationEvents/BRANCH_OR_TAG_DELETED} "test" :item)))
    (is (= RepositoryNotificationEvents/COMMIT_COMMENT (repository-notification-events {:item RepositoryNotificationEvents/COMMIT_COMMENT} "test" :item)))
    (is (= RepositoryNotificationEvents/COMMIT_COMMENT (repository-notification-events {:test/item RepositoryNotificationEvents/COMMIT_COMMENT} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_SOURCE_UPDATED (repository-notification-events {:item RepositoryNotificationEvents/PULL_REQUEST_SOURCE_UPDATED} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_SOURCE_UPDATED (repository-notification-events {:test/item RepositoryNotificationEvents/PULL_REQUEST_SOURCE_UPDATED} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_STATUS_CHANGED (repository-notification-events {:item RepositoryNotificationEvents/PULL_REQUEST_STATUS_CHANGED} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_STATUS_CHANGED (repository-notification-events {:test/item RepositoryNotificationEvents/PULL_REQUEST_STATUS_CHANGED} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_UPDATED (repository-notification-events {:item RepositoryNotificationEvents/BRANCH_OR_TAG_UPDATED} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_UPDATED (repository-notification-events {:test/item RepositoryNotificationEvents/BRANCH_OR_TAG_UPDATED} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_CREATED (repository-notification-events {:item RepositoryNotificationEvents/BRANCH_OR_TAG_CREATED} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_CREATED (repository-notification-events {:test/item RepositoryNotificationEvents/BRANCH_OR_TAG_CREATED} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_MERGED (repository-notification-events {:item RepositoryNotificationEvents/PULL_REQUEST_MERGED} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_MERGED (repository-notification-events {:test/item RepositoryNotificationEvents/PULL_REQUEST_MERGED} "test" :item)))
    (is (= RepositoryNotificationEvents/APPROVAL_RULE_OVERRIDDEN (repository-notification-events {:item RepositoryNotificationEvents/APPROVAL_RULE_OVERRIDDEN} "test" :item)))
    (is (= RepositoryNotificationEvents/APPROVAL_RULE_OVERRIDDEN (repository-notification-events {:test/item RepositoryNotificationEvents/APPROVAL_RULE_OVERRIDDEN} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_COMMENT (repository-notification-events {:item RepositoryNotificationEvents/PULL_REQUEST_COMMENT} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_COMMENT (repository-notification-events {:test/item RepositoryNotificationEvents/PULL_REQUEST_COMMENT} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_CREATED (repository-notification-events {:item :pull-request-created} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_CREATED (repository-notification-events {:test/item :pull-request-created} "test" :item)))
    (is (= RepositoryNotificationEvents/APPROVAL_STATUS_CHANGED (repository-notification-events {:item :approval-status-changed} "test" :item)))
    (is (= RepositoryNotificationEvents/APPROVAL_STATUS_CHANGED (repository-notification-events {:test/item :approval-status-changed} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_DELETED (repository-notification-events {:item :branch-or-tag-deleted} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_DELETED (repository-notification-events {:test/item :branch-or-tag-deleted} "test" :item)))
    (is (= RepositoryNotificationEvents/COMMIT_COMMENT (repository-notification-events {:item :commit-comment} "test" :item)))
    (is (= RepositoryNotificationEvents/COMMIT_COMMENT (repository-notification-events {:test/item :commit-comment} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_SOURCE_UPDATED (repository-notification-events {:item :pull-request-source-updated} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_SOURCE_UPDATED (repository-notification-events {:test/item :pull-request-source-updated} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_STATUS_CHANGED (repository-notification-events {:item :pull-request-status-changed} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_STATUS_CHANGED (repository-notification-events {:test/item :pull-request-status-changed} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_UPDATED (repository-notification-events {:item :branch-or-tag-updated} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_UPDATED (repository-notification-events {:test/item :branch-or-tag-updated} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_CREATED (repository-notification-events {:item :branch-or-tag-created} "test" :item)))
    (is (= RepositoryNotificationEvents/BRANCH_OR_TAG_CREATED (repository-notification-events {:test/item :branch-or-tag-created} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_MERGED (repository-notification-events {:item :pull-request-merged} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_MERGED (repository-notification-events {:test/item :pull-request-merged} "test" :item)))
    (is (= RepositoryNotificationEvents/APPROVAL_RULE_OVERRIDDEN (repository-notification-events {:item :approval-rule-overridden} "test" :item)))
    (is (= RepositoryNotificationEvents/APPROVAL_RULE_OVERRIDDEN (repository-notification-events {:test/item :approval-rule-overridden} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_COMMENT (repository-notification-events {:item :pull-request-comment} "test" :item)))
    (is (= RepositoryNotificationEvents/PULL_REQUEST_COMMENT (repository-notification-events {:test/item :pull-request-comment} "test" :item)))))