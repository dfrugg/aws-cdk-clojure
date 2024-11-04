(ns cdk.api.services.codecommit
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codecommit package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.codestarnotifications :refer [detail-type]])
  (:import [software.amazon.awscdk.services.codecommit CfnRepository$Builder
                                                       CfnRepository$CodeProperty$Builder
                                                       CfnRepository$RepositoryTriggerProperty$Builder
                                                       CfnRepository$S3Property$Builder
                                                       CfnRepositoryProps$Builder
                                                       CodeConfig$Builder
                                                       OnCommitOptions$Builder
                                                       Repository$Builder
                                                       RepositoryEventTrigger
                                                       RepositoryNotificationEvents
                                                       RepositoryNotifyOnOptions$Builder
                                                       RepositoryProps$Builder
                                                       RepositoryTriggerOptions$Builder]))


(defn repository-event-trigger
  "The `repository-event-trigger` function data interprets values in the provided config data into a 
`RepositoryEventTrigger` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RepositoryEventTrigger` - the value is returned.
* is `:delete-ref` - `RepositoryEventTrigger/DELETE_REF` is returned
* is `:create-ref` - `RepositoryEventTrigger/CREATE_REF` is returned
* is `:all` - `RepositoryEventTrigger/ALL` is returned
* is `:update-ref` - `RepositoryEventTrigger/UPDATE_REF` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RepositoryEventTrigger data) data
      (= :delete-ref data) RepositoryEventTrigger/DELETE_REF
      (= :create-ref data) RepositoryEventTrigger/CREATE_REF
      (= :all data) RepositoryEventTrigger/ALL
      (= :update-ref data) RepositoryEventTrigger/UPDATE_REF)))


(defn repository-notification-events
  "The `repository-notification-events` function data interprets values in the provided config data into a 
`RepositoryNotificationEvents` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RepositoryNotificationEvents` - the value is returned.
* is `:pull-request-created` - `RepositoryNotificationEvents/PULL_REQUEST_CREATED` is returned
* is `:approval-status-changed` - `RepositoryNotificationEvents/APPROVAL_STATUS_CHANGED` is returned
* is `:branch-or-tag-deleted` - `RepositoryNotificationEvents/BRANCH_OR_TAG_DELETED` is returned
* is `:commit-comment` - `RepositoryNotificationEvents/COMMIT_COMMENT` is returned
* is `:pull-request-source-updated` - `RepositoryNotificationEvents/PULL_REQUEST_SOURCE_UPDATED` is returned
* is `:pull-request-status-changed` - `RepositoryNotificationEvents/PULL_REQUEST_STATUS_CHANGED` is returned
* is `:branch-or-tag-updated` - `RepositoryNotificationEvents/BRANCH_OR_TAG_UPDATED` is returned
* is `:branch-or-tag-created` - `RepositoryNotificationEvents/BRANCH_OR_TAG_CREATED` is returned
* is `:pull-request-merged` - `RepositoryNotificationEvents/PULL_REQUEST_MERGED` is returned
* is `:approval-rule-overridden` - `RepositoryNotificationEvents/APPROVAL_RULE_OVERRIDDEN` is returned
* is `:pull-request-comment` - `RepositoryNotificationEvents/PULL_REQUEST_COMMENT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RepositoryNotificationEvents data) data
      (= :pull-request-created data) RepositoryNotificationEvents/PULL_REQUEST_CREATED
      (= :approval-status-changed data) RepositoryNotificationEvents/APPROVAL_STATUS_CHANGED
      (= :branch-or-tag-deleted data) RepositoryNotificationEvents/BRANCH_OR_TAG_DELETED
      (= :commit-comment data) RepositoryNotificationEvents/COMMIT_COMMENT
      (= :pull-request-source-updated data) RepositoryNotificationEvents/PULL_REQUEST_SOURCE_UPDATED
      (= :pull-request-status-changed data) RepositoryNotificationEvents/PULL_REQUEST_STATUS_CHANGED
      (= :branch-or-tag-updated data) RepositoryNotificationEvents/BRANCH_OR_TAG_UPDATED
      (= :branch-or-tag-created data) RepositoryNotificationEvents/BRANCH_OR_TAG_CREATED
      (= :pull-request-merged data) RepositoryNotificationEvents/PULL_REQUEST_MERGED
      (= :approval-rule-overridden data) RepositoryNotificationEvents/APPROVAL_RULE_OVERRIDDEN
      (= :pull-request-comment data) RepositoryNotificationEvents/PULL_REQUEST_COMMENT)))


(defn cfn-repository-builder
  "The cfn-repository-builder function buildes out new instances of 
CfnRepository$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `repositoryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-description` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggers` | java.util.List | [[cdk.support/lookup-entry]] | `:triggers` |"
  [stack id config]
  (let [builder (CfnRepository$Builder/create stack id)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :repository-description)]
      (. builder repositoryDescription data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :triggers)]
      (. builder triggers data))
    (.build builder)))


(defn cfn-repository-code-property-builder
  "The cfn-repository-code-property-builder function buildes out new instances of 
CfnRepository$CodeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branchName` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-name` |
| `s3` | software.amazon.awscdk.services.codecommit.CfnRepository$S3Property | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnRepository$CodeProperty$Builder.)]
    (when-let [data (lookup-entry config id :branch-name)]
      (. builder branchName data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-repository-props-builder
  "The cfn-repository-props-builder function buildes out new instances of 
CfnRepositoryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `repositoryDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-description` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:triggers` |"
  [stack id config]
  (let [builder (CfnRepositoryProps$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :repository-description)]
      (. builder repositoryDescription data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :triggers)]
      (. builder triggers data))
    (.build builder)))


(defn cfn-repository-repository-trigger-property-builder
  "The cfn-repository-repository-trigger-property-builder function buildes out new instances of 
CfnRepository$RepositoryTriggerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branches` | java.util.List | [[cdk.support/lookup-entry]] | `:branches` |
| `customData` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-data` |
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRepository$RepositoryTriggerProperty$Builder.)]
    (when-let [data (lookup-entry config id :branches)]
      (. builder branches data))
    (when-let [data (lookup-entry config id :custom-data)]
      (. builder customData data))
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-repository-s3-property-builder
  "The cfn-repository-s3-property-builder function buildes out new instances of 
CfnRepository$S3Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `objectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-version` |"
  [stack id config]
  (let [builder (CfnRepository$S3Property$Builder.)]
    (when-let [data (lookup-entry config id :bucket)]
      (. builder bucket data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :object-version)]
      (. builder objectVersion data))
    (.build builder)))


(defn code-config-builder
  "The code-config-builder function buildes out new instances of 
CodeConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.codecommit.CfnRepository$CodeProperty | [[cdk.support/lookup-entry]] | `:code` |"
  [stack id config]
  (let [builder (CodeConfig$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (.build builder)))


(defn on-commit-options-builder
  "The on-commit-options-builder function buildes out new instances of 
OnCommitOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branches` | java.util.List | [[cdk.support/lookup-entry]] | `:branches` |
| `crossStackScope` | software.constructs.Construct | [[cdk.support/lookup-entry]] | `:cross-stack-scope` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventPattern` | software.amazon.awscdk.services.events.EventPattern | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `target` | software.amazon.awscdk.services.events.IRuleTarget | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (OnCommitOptions$Builder.)]
    (when-let [data (lookup-entry config id :branches)]
      (. builder branches data))
    (when-let [data (lookup-entry config id :cross-stack-scope)]
      (. builder crossStackScope data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-pattern)]
      (. builder eventPattern data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn repository-builder
  "The repository-builder function buildes out new instances of 
Repository$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.codecommit.Code | [[cdk.support/lookup-entry]] | `:code` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |"
  [stack id config]
  (let [builder (Repository$Builder/create stack id)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (.build builder)))


(defn repository-notify-on-options-builder
  "The repository-notify-on-options-builder function buildes out new instances of 
RepositoryNotifyOnOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | software.amazon.awscdk.services.codestarnotifications.DetailType | [[cdk.api.services.codestarnotifications/detail-type]] | `:detail-type` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `notificationRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-rule-name` |"
  [stack id config]
  (let [builder (RepositoryNotifyOnOptions$Builder.)]
    (when-let [data (detail-type config id :detail-type)]
      (. builder detailType data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :notification-rule-name)]
      (. builder notificationRuleName data))
    (.build builder)))


(defn repository-props-builder
  "The repository-props-builder function buildes out new instances of 
RepositoryProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | software.amazon.awscdk.services.codecommit.Code | [[cdk.support/lookup-entry]] | `:code` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `repositoryName` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-name` |"
  [stack id config]
  (let [builder (RepositoryProps$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (lookup-entry config id :repository-name)]
      (. builder repositoryName data))
    (.build builder)))


(defn repository-trigger-options-builder
  "The repository-trigger-options-builder function buildes out new instances of 
RepositoryTriggerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branches` | java.util.List | [[cdk.support/lookup-entry]] | `:branches` |
| `customData` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-data` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (RepositoryTriggerOptions$Builder.)]
    (when-let [data (lookup-entry config id :branches)]
      (. builder branches data))
    (when-let [data (lookup-entry config id :custom-data)]
      (. builder customData data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))