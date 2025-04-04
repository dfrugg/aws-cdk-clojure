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


(defn cfn-notification-rule-builder>
  "The cfn-notification-rule-builder> function updates a CfnNotificationRule$Builder instance using the provided configuration.
  The function takes the CfnNotificationRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnNotificationRule$Builder builder id config]
  (when-some [data (lookup-entry config id :created-by)]
    (. builder createdBy data))
  (when-some [data (lookup-entry config id :detail-type)]
    (. builder detailType data))
  (when-some [data (lookup-entry config id :event-type-id)]
    (. builder eventTypeId data))
  (when-some [data (lookup-entry config id :event-type-ids)]
    (. builder eventTypeIds data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource)]
    (. builder resource data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-address)]
    (. builder targetAddress data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn cfn-notification-rule-builder
  "Creates a  `CfnNotificationRule$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-notification-rule-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-notification-rule-builder> (CfnNotificationRule$Builder/create scope (name id)) id config))


(defn cfn-notification-rule-props-builder>
  "The cfn-notification-rule-props-builder> function updates a CfnNotificationRuleProps$Builder instance using the provided configuration.
  The function takes the CfnNotificationRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnNotificationRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :created-by)]
    (. builder createdBy data))
  (when-some [data (lookup-entry config id :detail-type)]
    (. builder detailType data))
  (when-some [data (lookup-entry config id :event-type-id)]
    (. builder eventTypeId data))
  (when-some [data (lookup-entry config id :event-type-ids)]
    (. builder eventTypeIds data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource)]
    (. builder resource data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-address)]
    (. builder targetAddress data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn cfn-notification-rule-props-builder
  "Creates a  `CfnNotificationRuleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-notification-rule-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-notification-rule-props-builder> (new CfnNotificationRuleProps$Builder) id config))


(defn cfn-notification-rule-target-property-builder>
  "The cfn-notification-rule-target-property-builder> function updates a CfnNotificationRule$TargetProperty$Builder instance using the provided configuration.
  The function takes the CfnNotificationRule$TargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-address` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
"
  [^CfnNotificationRule$TargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-address)]
    (. builder targetAddress data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn cfn-notification-rule-target-property-builder
  "Creates a  `CfnNotificationRule$TargetProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-notification-rule-target-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-notification-rule-target-property-builder> (new CfnNotificationRule$TargetProperty$Builder) id config))


(defn notification-rule-builder>
  "The notification-rule-builder> function updates a NotificationRule$Builder instance using the provided configuration.
  The function takes the NotificationRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | software.amazon.awscdk.services.codestarnotifications.DetailType | [[cdk.api.services.codestarnotifications/detail-type]] | `:detail-type` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `notificationRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-rule-name` |
| `source` | software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource | [[cdk.support/lookup-entry]] | `:source` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^NotificationRule$Builder builder id config]
  (when-some [data (detail-type config id :detail-type)]
    (. builder detailType data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :events)]
    (. builder events data))
  (when-some [data (lookup-entry config id :notification-rule-name)]
    (. builder notificationRuleName data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn notification-rule-builder
  "Creates a  `NotificationRule$Builder` instance using a scope and ID, applies the data configuration using the [[notification-rule-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (notification-rule-builder> (NotificationRule$Builder/create scope (name id)) id config))


(defn notification-rule-options-builder>
  "The notification-rule-options-builder> function updates a NotificationRuleOptions$Builder instance using the provided configuration.
  The function takes the NotificationRuleOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | software.amazon.awscdk.services.codestarnotifications.DetailType | [[cdk.api.services.codestarnotifications/detail-type]] | `:detail-type` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `notificationRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-rule-name` |
"
  [^NotificationRuleOptions$Builder builder id config]
  (when-some [data (detail-type config id :detail-type)]
    (. builder detailType data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :notification-rule-name)]
    (. builder notificationRuleName data))
  (.build builder))


(defn notification-rule-options-builder
  "Creates a  `NotificationRuleOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[notification-rule-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (notification-rule-options-builder> (new NotificationRuleOptions$Builder) id config))


(defn notification-rule-props-builder>
  "The notification-rule-props-builder> function updates a NotificationRuleProps$Builder instance using the provided configuration.
  The function takes the NotificationRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detailType` | software.amazon.awscdk.services.codestarnotifications.DetailType | [[cdk.api.services.codestarnotifications/detail-type]] | `:detail-type` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `notificationRuleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-rule-name` |
| `source` | software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource | [[cdk.support/lookup-entry]] | `:source` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^NotificationRuleProps$Builder builder id config]
  (when-some [data (detail-type config id :detail-type)]
    (. builder detailType data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :events)]
    (. builder events data))
  (when-some [data (lookup-entry config id :notification-rule-name)]
    (. builder notificationRuleName data))
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn notification-rule-props-builder
  "Creates a  `NotificationRuleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[notification-rule-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (notification-rule-props-builder> (new NotificationRuleProps$Builder) id config))


(defn notification-rule-source-config-builder>
  "The notification-rule-source-config-builder> function updates a NotificationRuleSourceConfig$Builder instance using the provided configuration.
  The function takes the NotificationRuleSourceConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-arn` |
"
  [^NotificationRuleSourceConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :source-arn)]
    (. builder sourceArn data))
  (.build builder))


(defn notification-rule-source-config-builder
  "Creates a  `NotificationRuleSourceConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[notification-rule-source-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (notification-rule-source-config-builder> (new NotificationRuleSourceConfig$Builder) id config))


(defn notification-rule-target-config-builder>
  "The notification-rule-target-config-builder> function updates a NotificationRuleTargetConfig$Builder instance using the provided configuration.
  The function takes the NotificationRuleTargetConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-address` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
"
  [^NotificationRuleTargetConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :target-address)]
    (. builder targetAddress data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn notification-rule-target-config-builder
  "Creates a  `NotificationRuleTargetConfig$Builder` instance using a no-argument constructor, applies the data configuration using the [[notification-rule-target-config-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (notification-rule-target-config-builder> (new NotificationRuleTargetConfig$Builder) id config))