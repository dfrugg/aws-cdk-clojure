(ns cdk.api.services.codestarnotifications
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.codestarnotifications package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.codestarnotifications CfnNotificationRule$Builder
                                                                  CfnNotificationRule$TargetProperty$Builder
                                                                  CfnNotificationRuleProps$Builder
                                                                  DetailType
                                                                  NotificationRule$Builder
                                                                  NotificationRuleOptions$Builder
                                                                  NotificationRuleProps$Builder
                                                                  NotificationRuleSourceConfig$Builder
                                                                  NotificationRuleTargetConfig$Builder]))


(defn detail-type
  "The `detail-type` function data interprets values in the provided config data into a 
`DetailType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DetailType` - the value is returned.
* is `:basic` - `DetailType/BASIC` is returned
* is `:full` - `DetailType/FULL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DetailType data) data
      (= :basic data) DetailType/BASIC
      (= :full data) DetailType/FULL)))


(defn cfn-notification-rule-builder
  "The cfn-notification-rule-builder function buildes out new instances of 
CfnNotificationRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createdBy` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-by` |
| `detailType` | java.lang.String | [[cdk.support/lookup-entry]] | `:detail-type` |
| `eventTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type-id` |
| `eventTypeIds` | java.util.List | [[cdk.support/lookup-entry]] | `:event-type-ids` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-address` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (CfnNotificationRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :created-by)]
      (. builder createdBy data))
    (when-let [data (lookup-entry config id :detail-type)]
      (. builder detailType data))
    (when-let [data (lookup-entry config id :event-type-id)]
      (. builder eventTypeId data))
    (when-let [data (lookup-entry config id :event-type-ids)]
      (. builder eventTypeIds data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-address)]
      (. builder targetAddress data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn cfn-notification-rule-props-builder
  "The cfn-notification-rule-props-builder function buildes out new instances of 
CfnNotificationRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `createdBy` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-by` |
| `detailType` | java.lang.String | [[cdk.support/lookup-entry]] | `:detail-type` |
| `eventTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type-id` |
| `eventTypeIds` | java.util.List | [[cdk.support/lookup-entry]] | `:event-type-ids` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resource` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targetAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-address` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (CfnNotificationRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :created-by)]
      (. builder createdBy data))
    (when-let [data (lookup-entry config id :detail-type)]
      (. builder detailType data))
    (when-let [data (lookup-entry config id :event-type-id)]
      (. builder eventTypeId data))
    (when-let [data (lookup-entry config id :event-type-ids)]
      (. builder eventTypeIds data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource)]
      (. builder resource data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-address)]
      (. builder targetAddress data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn cfn-notification-rule-target-property-builder
  "The cfn-notification-rule-target-property-builder function buildes out new instances of 
CfnNotificationRule$TargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-address` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |"
  [stack id config]
  (let [builder (CfnNotificationRule$TargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-address)]
      (. builder targetAddress data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (.build builder)))


(defn notification-rule-builder
  "The notification-rule-builder function buildes out new instances of 
NotificationRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | software.amazon.awscdk.services.codestarnotifications.DetailType | [[cdk.api.services.codestarnotifications/detail-type]] | `:detail-type` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `notificationRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-rule-name` |
| `source` | software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource | [[cdk.support/lookup-entry]] | `:source` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (NotificationRule$Builder/create stack id)]
    (when-let [data (detail-type config id :detail-type)]
      (. builder detailType data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :notification-rule-name)]
      (. builder notificationRuleName data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn notification-rule-options-builder
  "The notification-rule-options-builder function buildes out new instances of 
NotificationRuleOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | software.amazon.awscdk.services.codestarnotifications.DetailType | [[cdk.api.services.codestarnotifications/detail-type]] | `:detail-type` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `notificationRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-rule-name` |"
  [stack id config]
  (let [builder (NotificationRuleOptions$Builder.)]
    (when-let [data (detail-type config id :detail-type)]
      (. builder detailType data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :notification-rule-name)]
      (. builder notificationRuleName data))
    (.build builder)))


(defn notification-rule-props-builder
  "The notification-rule-props-builder function buildes out new instances of 
NotificationRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | software.amazon.awscdk.services.codestarnotifications.DetailType | [[cdk.api.services.codestarnotifications/detail-type]] | `:detail-type` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `notificationRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-rule-name` |
| `source` | software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource | [[cdk.support/lookup-entry]] | `:source` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (NotificationRuleProps$Builder.)]
    (when-let [data (detail-type config id :detail-type)]
      (. builder detailType data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :notification-rule-name)]
      (. builder notificationRuleName data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn notification-rule-source-config-builder
  "The notification-rule-source-config-builder function buildes out new instances of 
NotificationRuleSourceConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |"
  [stack id config]
  (let [builder (NotificationRuleSourceConfig$Builder.)]
    (when-let [data (lookup-entry config id :source-arn)]
      (. builder sourceArn data))
    (.build builder)))


(defn notification-rule-target-config-builder
  "The notification-rule-target-config-builder function buildes out new instances of 
NotificationRuleTargetConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-address` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |"
  [stack id config]
  (let [builder (NotificationRuleTargetConfig$Builder.)]
    (when-let [data (lookup-entry config id :target-address)]
      (. builder targetAddress data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (.build builder)))