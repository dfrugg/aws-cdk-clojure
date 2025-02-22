(ns cdk.api.services.ssmincidents
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ssmincidents package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ssmincidents CfnReplicationSet$Builder
                                                         CfnReplicationSet$RegionConfigurationProperty$Builder
                                                         CfnReplicationSet$ReplicationRegionProperty$Builder
                                                         CfnReplicationSetProps$Builder
                                                         CfnResponsePlan$ActionProperty$Builder
                                                         CfnResponsePlan$Builder
                                                         CfnResponsePlan$ChatChannelProperty$Builder
                                                         CfnResponsePlan$DynamicSsmParameterProperty$Builder
                                                         CfnResponsePlan$DynamicSsmParameterValueProperty$Builder
                                                         CfnResponsePlan$IncidentTemplateProperty$Builder
                                                         CfnResponsePlan$IntegrationProperty$Builder
                                                         CfnResponsePlan$NotificationTargetItemProperty$Builder
                                                         CfnResponsePlan$PagerDutyConfigurationProperty$Builder
                                                         CfnResponsePlan$PagerDutyIncidentConfigurationProperty$Builder
                                                         CfnResponsePlan$SsmAutomationProperty$Builder
                                                         CfnResponsePlan$SsmParameterProperty$Builder
                                                         CfnResponsePlanProps$Builder]))


(defn build-cfn-replication-set-builder
  "The build-cfn-replication-set-builder function updates a CfnReplicationSet$Builder instance using the provided configuration.
  The function takes the CfnReplicationSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtected` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deletion-protected` |
| `regions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:regions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnReplicationSet$Builder builder id config]
  (when-let [data (lookup-entry config id :deletion-protected)]
    (. builder deletionProtected data))
  (when-let [data (lookup-entry config id :regions)]
    (. builder regions data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-replication-set-props-builder
  "The build-cfn-replication-set-props-builder function updates a CfnReplicationSetProps$Builder instance using the provided configuration.
  The function takes the CfnReplicationSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionProtected` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deletion-protected` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnReplicationSetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :deletion-protected)]
    (. builder deletionProtected data))
  (when-let [data (lookup-entry config id :regions)]
    (. builder regions data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-replication-set-region-configuration-property-builder
  "The build-cfn-replication-set-region-configuration-property-builder function updates a CfnReplicationSet$RegionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicationSet$RegionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sseKmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:sse-kms-key-id` |
"
  [^CfnReplicationSet$RegionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sse-kms-key-id)]
    (. builder sseKmsKeyId data))
  (.build builder))


(defn build-cfn-replication-set-replication-region-property-builder
  "The build-cfn-replication-set-replication-region-property-builder function updates a CfnReplicationSet$ReplicationRegionProperty$Builder instance using the provided configuration.
  The function takes the CfnReplicationSet$ReplicationRegionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `regionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:region-configuration` |
| `regionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-name` |
"
  [^CfnReplicationSet$ReplicationRegionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :region-configuration)]
    (. builder regionConfiguration data))
  (when-let [data (lookup-entry config id :region-name)]
    (. builder regionName data))
  (.build builder))


(defn build-cfn-response-plan-action-property-builder
  "The build-cfn-response-plan-action-property-builder function updates a CfnResponsePlan$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ssmAutomation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ssm-automation` |
"
  [^CfnResponsePlan$ActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ssm-automation)]
    (. builder ssmAutomation data))
  (.build builder))


(defn build-cfn-response-plan-builder
  "The build-cfn-response-plan-builder function updates a CfnResponsePlan$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `chatChannel` | software.amazon.awscdk.services.ssmincidents.CfnResponsePlan$ChatChannelProperty | [[cdk.support/lookup-entry]] | `:chat-channel` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `engagements` | java.util.List | [[cdk.support/lookup-entry]] | `:engagements` |
| `incidentTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:incident-template` |
| `integrations` | java.util.List | [[cdk.support/lookup-entry]] | `:integrations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResponsePlan$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :chat-channel)]
    (. builder chatChannel data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :engagements)]
    (. builder engagements data))
  (when-let [data (lookup-entry config id :incident-template)]
    (. builder incidentTemplate data))
  (when-let [data (lookup-entry config id :integrations)]
    (. builder integrations data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-response-plan-chat-channel-property-builder
  "The build-cfn-response-plan-chat-channel-property-builder function updates a CfnResponsePlan$ChatChannelProperty$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$ChatChannelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `chatbotSns` | java.util.List | [[cdk.support/lookup-entry]] | `:chatbot-sns` |
"
  [^CfnResponsePlan$ChatChannelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :chatbot-sns)]
    (. builder chatbotSns data))
  (.build builder))


(defn build-cfn-response-plan-dynamic-ssm-parameter-property-builder
  "The build-cfn-response-plan-dynamic-ssm-parameter-property-builder function updates a CfnResponsePlan$DynamicSsmParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$DynamicSsmParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | software.amazon.awscdk.services.ssmincidents.CfnResponsePlan$DynamicSsmParameterValueProperty | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnResponsePlan$DynamicSsmParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-response-plan-dynamic-ssm-parameter-value-property-builder
  "The build-cfn-response-plan-dynamic-ssm-parameter-value-property-builder function updates a CfnResponsePlan$DynamicSsmParameterValueProperty$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$DynamicSsmParameterValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `variable` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable` |
"
  [^CfnResponsePlan$DynamicSsmParameterValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :variable)]
    (. builder variable data))
  (.build builder))


(defn build-cfn-response-plan-incident-template-property-builder
  "The build-cfn-response-plan-incident-template-property-builder function updates a CfnResponsePlan$IncidentTemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$IncidentTemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dedupeString` | java.lang.String | [[cdk.support/lookup-entry]] | `:dedupe-string` |
| `impact` | java.lang.Number | [[cdk.support/lookup-entry]] | `:impact` |
| `incidentTags` | java.util.List | [[cdk.support/lookup-entry]] | `:incident-tags` |
| `notificationTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notification-targets` |
| `summary` | java.lang.String | [[cdk.support/lookup-entry]] | `:summary` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
"
  [^CfnResponsePlan$IncidentTemplateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dedupe-string)]
    (. builder dedupeString data))
  (when-let [data (lookup-entry config id :impact)]
    (. builder impact data))
  (when-let [data (lookup-entry config id :incident-tags)]
    (. builder incidentTags data))
  (when-let [data (lookup-entry config id :notification-targets)]
    (. builder notificationTargets data))
  (when-let [data (lookup-entry config id :summary)]
    (. builder summary data))
  (when-let [data (lookup-entry config id :title)]
    (. builder title data))
  (.build builder))


(defn build-cfn-response-plan-integration-property-builder
  "The build-cfn-response-plan-integration-property-builder function updates a CfnResponsePlan$IntegrationProperty$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$IntegrationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pagerDutyConfiguration` | software.amazon.awscdk.services.ssmincidents.CfnResponsePlan$PagerDutyConfigurationProperty | [[cdk.support/lookup-entry]] | `:pager-duty-configuration` |
"
  [^CfnResponsePlan$IntegrationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :pager-duty-configuration)]
    (. builder pagerDutyConfiguration data))
  (.build builder))


(defn build-cfn-response-plan-notification-target-item-property-builder
  "The build-cfn-response-plan-notification-target-item-property-builder function updates a CfnResponsePlan$NotificationTargetItemProperty$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$NotificationTargetItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
"
  [^CfnResponsePlan$NotificationTargetItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (.build builder))


(defn build-cfn-response-plan-pager-duty-configuration-property-builder
  "The build-cfn-response-plan-pager-duty-configuration-property-builder function updates a CfnResponsePlan$PagerDutyConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$PagerDutyConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pagerDutyIncidentConfiguration` | software.amazon.awscdk.services.ssmincidents.CfnResponsePlan$PagerDutyIncidentConfigurationProperty | [[cdk.support/lookup-entry]] | `:pager-duty-incident-configuration` |
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |
"
  [^CfnResponsePlan$PagerDutyConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :pager-duty-incident-configuration)]
    (. builder pagerDutyIncidentConfiguration data))
  (when-let [data (lookup-entry config id :secret-id)]
    (. builder secretId data))
  (.build builder))


(defn build-cfn-response-plan-pager-duty-incident-configuration-property-builder
  "The build-cfn-response-plan-pager-duty-incident-configuration-property-builder function updates a CfnResponsePlan$PagerDutyIncidentConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$PagerDutyIncidentConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-id` |
"
  [^CfnResponsePlan$PagerDutyIncidentConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :service-id)]
    (. builder serviceId data))
  (.build builder))


(defn build-cfn-response-plan-props-builder
  "The build-cfn-response-plan-props-builder function updates a CfnResponsePlanProps$Builder instance using the provided configuration.
  The function takes the CfnResponsePlanProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `chatChannel` | software.amazon.awscdk.services.ssmincidents.CfnResponsePlan$ChatChannelProperty | [[cdk.support/lookup-entry]] | `:chat-channel` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `engagements` | java.util.List | [[cdk.support/lookup-entry]] | `:engagements` |
| `incidentTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:incident-template` |
| `integrations` | java.util.List | [[cdk.support/lookup-entry]] | `:integrations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResponsePlanProps$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :chat-channel)]
    (. builder chatChannel data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :engagements)]
    (. builder engagements data))
  (when-let [data (lookup-entry config id :incident-template)]
    (. builder incidentTemplate data))
  (when-let [data (lookup-entry config id :integrations)]
    (. builder integrations data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-response-plan-ssm-automation-property-builder
  "The build-cfn-response-plan-ssm-automation-property-builder function updates a CfnResponsePlan$SsmAutomationProperty$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$SsmAutomationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-name` |
| `documentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-version` |
| `dynamicParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamic-parameters` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `targetAccount` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-account` |
"
  [^CfnResponsePlan$SsmAutomationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :document-name)]
    (. builder documentName data))
  (when-let [data (lookup-entry config id :document-version)]
    (. builder documentVersion data))
  (when-let [data (lookup-entry config id :dynamic-parameters)]
    (. builder dynamicParameters data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :target-account)]
    (. builder targetAccount data))
  (.build builder))


(defn build-cfn-response-plan-ssm-parameter-property-builder
  "The build-cfn-response-plan-ssm-parameter-property-builder function updates a CfnResponsePlan$SsmParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnResponsePlan$SsmParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnResponsePlan$SsmParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))