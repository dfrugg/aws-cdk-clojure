(ns cdk.api.services.shield
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.shield package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.shield CfnDRTAccess$Builder
                                                   CfnDRTAccessProps$Builder
                                                   CfnProactiveEngagement$Builder
                                                   CfnProactiveEngagement$EmergencyContactProperty$Builder
                                                   CfnProactiveEngagementProps$Builder
                                                   CfnProtection$ActionProperty$Builder
                                                   CfnProtection$ApplicationLayerAutomaticResponseConfigurationProperty$Builder
                                                   CfnProtection$Builder
                                                   CfnProtectionGroup$Builder
                                                   CfnProtectionGroupProps$Builder
                                                   CfnProtectionProps$Builder]))


(defn build-cfn-drt-access-builder
  "The build-cfn-drt-access-builder function updates a CfnDRTAccess$Builder instance using the provided configuration.
  The function takes the CfnDRTAccess$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logBucketList` | java.util.List | [[cdk.support/lookup-entry]] | `:log-bucket-list` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDRTAccess$Builder builder id config]
  (when-let [data (lookup-entry config id :log-bucket-list)]
    (. builder logBucketList data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-drt-access-props-builder
  "The build-cfn-drt-access-props-builder function updates a CfnDRTAccessProps$Builder instance using the provided configuration.
  The function takes the CfnDRTAccessProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logBucketList` | java.util.List | [[cdk.support/lookup-entry]] | `:log-bucket-list` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnDRTAccessProps$Builder builder id config]
  (when-let [data (lookup-entry config id :log-bucket-list)]
    (. builder logBucketList data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-proactive-engagement-builder
  "The build-cfn-proactive-engagement-builder function updates a CfnProactiveEngagement$Builder instance using the provided configuration.
  The function takes the CfnProactiveEngagement$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emergencyContactList` | java.util.List | [[cdk.support/lookup-entry]] | `:emergency-contact-list` |
| `proactiveEngagementStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:proactive-engagement-status` |
"
  [^CfnProactiveEngagement$Builder builder id config]
  (when-let [data (lookup-entry config id :emergency-contact-list)]
    (. builder emergencyContactList data))
  (when-let [data (lookup-entry config id :proactive-engagement-status)]
    (. builder proactiveEngagementStatus data))
  (.build builder))


(defn build-cfn-proactive-engagement-emergency-contact-property-builder
  "The build-cfn-proactive-engagement-emergency-contact-property-builder function updates a CfnProactiveEngagement$EmergencyContactProperty$Builder instance using the provided configuration.
  The function takes the CfnProactiveEngagement$EmergencyContactProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactNotes` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-notes` |
| `emailAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-address` |
| `phoneNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone-number` |
"
  [^CfnProactiveEngagement$EmergencyContactProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :contact-notes)]
    (. builder contactNotes data))
  (when-let [data (lookup-entry config id :email-address)]
    (. builder emailAddress data))
  (when-let [data (lookup-entry config id :phone-number)]
    (. builder phoneNumber data))
  (.build builder))


(defn build-cfn-proactive-engagement-props-builder
  "The build-cfn-proactive-engagement-props-builder function updates a CfnProactiveEngagementProps$Builder instance using the provided configuration.
  The function takes the CfnProactiveEngagementProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emergencyContactList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:emergency-contact-list` |
| `proactiveEngagementStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:proactive-engagement-status` |
"
  [^CfnProactiveEngagementProps$Builder builder id config]
  (when-let [data (lookup-entry config id :emergency-contact-list)]
    (. builder emergencyContactList data))
  (when-let [data (lookup-entry config id :proactive-engagement-status)]
    (. builder proactiveEngagementStatus data))
  (.build builder))


(defn build-cfn-protection-action-property-builder
  "The build-cfn-protection-action-property-builder function updates a CfnProtection$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnProtection$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `block` | java.lang.Object | [[cdk.support/lookup-entry]] | `:block` |
| `count` | java.lang.Object | [[cdk.support/lookup-entry]] | `:count` |
"
  [^CfnProtection$ActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :block)]
    (. builder block data))
  (when-let [data (lookup-entry config id :count)]
    (. builder count data))
  (.build builder))


(defn build-cfn-protection-application-layer-automatic-response-configuration-property-builder
  "The build-cfn-protection-application-layer-automatic-response-configuration-property-builder function updates a CfnProtection$ApplicationLayerAutomaticResponseConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnProtection$ApplicationLayerAutomaticResponseConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnProtection$ApplicationLayerAutomaticResponseConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-protection-builder
  "The build-cfn-protection-builder function updates a CfnProtection$Builder instance using the provided configuration.
  The function takes the CfnProtection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationLayerAutomaticResponseConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-layer-automatic-response-configuration` |
| `healthCheckArns` | java.util.List | [[cdk.support/lookup-entry]] | `:health-check-arns` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProtection$Builder builder id config]
  (when-let [data (lookup-entry config id :application-layer-automatic-response-configuration)]
    (. builder applicationLayerAutomaticResponseConfiguration data))
  (when-let [data (lookup-entry config id :health-check-arns)]
    (. builder healthCheckArns data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-protection-group-builder
  "The build-cfn-protection-group-builder function updates a CfnProtectionGroup$Builder instance using the provided configuration.
  The function takes the CfnProtectionGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregation` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregation` |
| `members` | java.util.List | [[cdk.support/lookup-entry]] | `:members` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `protectionGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:protection-group-id` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProtectionGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :aggregation)]
    (. builder aggregation data))
  (when-let [data (lookup-entry config id :members)]
    (. builder members data))
  (when-let [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (when-let [data (lookup-entry config id :protection-group-id)]
    (. builder protectionGroupId data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-protection-group-props-builder
  "The build-cfn-protection-group-props-builder function updates a CfnProtectionGroupProps$Builder instance using the provided configuration.
  The function takes the CfnProtectionGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregation` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregation` |
| `members` | java.util.List | [[cdk.support/lookup-entry]] | `:members` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `protectionGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:protection-group-id` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProtectionGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :aggregation)]
    (. builder aggregation data))
  (when-let [data (lookup-entry config id :members)]
    (. builder members data))
  (when-let [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (when-let [data (lookup-entry config id :protection-group-id)]
    (. builder protectionGroupId data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-protection-props-builder
  "The build-cfn-protection-props-builder function updates a CfnProtectionProps$Builder instance using the provided configuration.
  The function takes the CfnProtectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationLayerAutomaticResponseConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-layer-automatic-response-configuration` |
| `healthCheckArns` | java.util.List | [[cdk.support/lookup-entry]] | `:health-check-arns` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProtectionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-layer-automatic-response-configuration)]
    (. builder applicationLayerAutomaticResponseConfiguration data))
  (when-let [data (lookup-entry config id :health-check-arns)]
    (. builder healthCheckArns data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))