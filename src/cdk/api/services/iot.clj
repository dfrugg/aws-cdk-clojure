(ns cdk.api.services.iot
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iot package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iot CfnAccountAuditConfiguration$AuditCheckConfigurationProperty$Builder
                                                CfnAccountAuditConfiguration$AuditCheckConfigurationsProperty$Builder
                                                CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty$Builder
                                                CfnAccountAuditConfiguration$AuditNotificationTargetProperty$Builder
                                                CfnAccountAuditConfiguration$Builder
                                                CfnAccountAuditConfigurationProps$Builder
                                                CfnAuthorizer$Builder
                                                CfnAuthorizerProps$Builder
                                                CfnBillingGroup$BillingGroupPropertiesProperty$Builder
                                                CfnBillingGroup$Builder
                                                CfnBillingGroupProps$Builder
                                                CfnCACertificate$Builder
                                                CfnCACertificate$RegistrationConfigProperty$Builder
                                                CfnCACertificateProps$Builder
                                                CfnCertificate$Builder
                                                CfnCertificateProps$Builder
                                                CfnCertificateProvider$Builder
                                                CfnCertificateProviderProps$Builder
                                                CfnCustomMetric$Builder
                                                CfnCustomMetricProps$Builder
                                                CfnDimension$Builder
                                                CfnDimensionProps$Builder
                                                CfnDomainConfiguration$AuthorizerConfigProperty$Builder
                                                CfnDomainConfiguration$Builder
                                                CfnDomainConfiguration$ServerCertificateConfigProperty$Builder
                                                CfnDomainConfiguration$ServerCertificateSummaryProperty$Builder
                                                CfnDomainConfiguration$TlsConfigProperty$Builder
                                                CfnDomainConfigurationProps$Builder
                                                CfnFleetMetric$AggregationTypeProperty$Builder
                                                CfnFleetMetric$Builder
                                                CfnFleetMetricProps$Builder
                                                CfnJobTemplate$AbortConfigProperty$Builder
                                                CfnJobTemplate$AbortCriteriaProperty$Builder
                                                CfnJobTemplate$Builder
                                                CfnJobTemplate$ExponentialRolloutRateProperty$Builder
                                                CfnJobTemplate$JobExecutionsRetryConfigProperty$Builder
                                                CfnJobTemplate$JobExecutionsRolloutConfigProperty$Builder
                                                CfnJobTemplate$MaintenanceWindowProperty$Builder
                                                CfnJobTemplate$PresignedUrlConfigProperty$Builder
                                                CfnJobTemplate$RateIncreaseCriteriaProperty$Builder
                                                CfnJobTemplate$RetryCriteriaProperty$Builder
                                                CfnJobTemplate$TimeoutConfigProperty$Builder
                                                CfnJobTemplateProps$Builder
                                                CfnLogging$Builder
                                                CfnLoggingProps$Builder
                                                CfnMitigationAction$ActionParamsProperty$Builder
                                                CfnMitigationAction$AddThingsToThingGroupParamsProperty$Builder
                                                CfnMitigationAction$Builder
                                                CfnMitigationAction$EnableIoTLoggingParamsProperty$Builder
                                                CfnMitigationAction$PublishFindingToSnsParamsProperty$Builder
                                                CfnMitigationAction$ReplaceDefaultPolicyVersionParamsProperty$Builder
                                                CfnMitigationAction$UpdateCACertificateParamsProperty$Builder
                                                CfnMitigationAction$UpdateDeviceCertificateParamsProperty$Builder
                                                CfnMitigationActionProps$Builder
                                                CfnPolicy$Builder
                                                CfnPolicyPrincipalAttachment$Builder
                                                CfnPolicyPrincipalAttachmentProps$Builder
                                                CfnPolicyProps$Builder
                                                CfnProvisioningTemplate$Builder
                                                CfnProvisioningTemplate$ProvisioningHookProperty$Builder
                                                CfnProvisioningTemplateProps$Builder
                                                CfnResourceSpecificLogging$Builder
                                                CfnResourceSpecificLoggingProps$Builder
                                                CfnRoleAlias$Builder
                                                CfnRoleAliasProps$Builder
                                                CfnScheduledAudit$Builder
                                                CfnScheduledAuditProps$Builder
                                                CfnSecurityProfile$AlertTargetProperty$Builder
                                                CfnSecurityProfile$BehaviorCriteriaProperty$Builder
                                                CfnSecurityProfile$BehaviorProperty$Builder
                                                CfnSecurityProfile$Builder
                                                CfnSecurityProfile$MachineLearningDetectionConfigProperty$Builder
                                                CfnSecurityProfile$MetricDimensionProperty$Builder
                                                CfnSecurityProfile$MetricToRetainProperty$Builder
                                                CfnSecurityProfile$MetricValueProperty$Builder
                                                CfnSecurityProfile$MetricsExportConfigProperty$Builder
                                                CfnSecurityProfile$StatisticalThresholdProperty$Builder
                                                CfnSecurityProfileProps$Builder
                                                CfnSoftwarePackage$Builder
                                                CfnSoftwarePackageProps$Builder
                                                CfnSoftwarePackageVersion$Builder
                                                CfnSoftwarePackageVersionProps$Builder
                                                CfnThing$AttributePayloadProperty$Builder
                                                CfnThing$Builder
                                                CfnThingGroup$AttributePayloadProperty$Builder
                                                CfnThingGroup$Builder
                                                CfnThingGroup$ThingGroupPropertiesProperty$Builder
                                                CfnThingGroupProps$Builder
                                                CfnThingPrincipalAttachment$Builder
                                                CfnThingPrincipalAttachmentProps$Builder
                                                CfnThingProps$Builder
                                                CfnThingType$Builder
                                                CfnThingType$ThingTypePropertiesProperty$Builder
                                                CfnThingTypeProps$Builder
                                                CfnTopicRule$ActionProperty$Builder
                                                CfnTopicRule$AssetPropertyTimestampProperty$Builder
                                                CfnTopicRule$AssetPropertyValueProperty$Builder
                                                CfnTopicRule$AssetPropertyVariantProperty$Builder
                                                CfnTopicRule$Builder
                                                CfnTopicRule$CloudwatchAlarmActionProperty$Builder
                                                CfnTopicRule$CloudwatchLogsActionProperty$Builder
                                                CfnTopicRule$CloudwatchMetricActionProperty$Builder
                                                CfnTopicRule$DynamoDBActionProperty$Builder
                                                CfnTopicRule$DynamoDBv2ActionProperty$Builder
                                                CfnTopicRule$ElasticsearchActionProperty$Builder
                                                CfnTopicRule$FirehoseActionProperty$Builder
                                                CfnTopicRule$HttpActionHeaderProperty$Builder
                                                CfnTopicRule$HttpActionProperty$Builder
                                                CfnTopicRule$HttpAuthorizationProperty$Builder
                                                CfnTopicRule$IotAnalyticsActionProperty$Builder
                                                CfnTopicRule$IotEventsActionProperty$Builder
                                                CfnTopicRule$IotSiteWiseActionProperty$Builder
                                                CfnTopicRule$KafkaActionHeaderProperty$Builder
                                                CfnTopicRule$KafkaActionProperty$Builder
                                                CfnTopicRule$KinesisActionProperty$Builder
                                                CfnTopicRule$LambdaActionProperty$Builder
                                                CfnTopicRule$LocationActionProperty$Builder
                                                CfnTopicRule$OpenSearchActionProperty$Builder
                                                CfnTopicRule$PutAssetPropertyValueEntryProperty$Builder
                                                CfnTopicRule$PutItemInputProperty$Builder
                                                CfnTopicRule$RepublishActionHeadersProperty$Builder
                                                CfnTopicRule$RepublishActionProperty$Builder
                                                CfnTopicRule$S3ActionProperty$Builder
                                                CfnTopicRule$SigV4AuthorizationProperty$Builder
                                                CfnTopicRule$SnsActionProperty$Builder
                                                CfnTopicRule$SqsActionProperty$Builder
                                                CfnTopicRule$StepFunctionsActionProperty$Builder
                                                CfnTopicRule$TimestampProperty$Builder
                                                CfnTopicRule$TimestreamActionProperty$Builder
                                                CfnTopicRule$TimestreamDimensionProperty$Builder
                                                CfnTopicRule$TimestreamTimestampProperty$Builder
                                                CfnTopicRule$TopicRulePayloadProperty$Builder
                                                CfnTopicRule$UserPropertyProperty$Builder
                                                CfnTopicRuleDestination$Builder
                                                CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty$Builder
                                                CfnTopicRuleDestination$VpcDestinationPropertiesProperty$Builder
                                                CfnTopicRuleDestinationProps$Builder
                                                CfnTopicRuleProps$Builder]))


(defn cfn-account-audit-configuration-audit-check-configuration-property-builder>
  "The cfn-account-audit-configuration-audit-check-configuration-property-builder> function updates a CfnAccountAuditConfiguration$AuditCheckConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccountAuditConfiguration$AuditCheckConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnAccountAuditConfiguration$AuditCheckConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-account-audit-configuration-audit-check-configuration-property-builder
  "Creates a  `CfnAccountAuditConfiguration$AuditCheckConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-account-audit-configuration-audit-check-configuration-property-builder> (new CfnAccountAuditConfiguration$AuditCheckConfigurationProperty$Builder) id config))


(defn cfn-account-audit-configuration-audit-check-configurations-property-builder>
  "The cfn-account-audit-configuration-audit-check-configurations-property-builder> function updates a CfnAccountAuditConfiguration$AuditCheckConfigurationsProperty$Builder instance using the provided configuration.
  The function takes the CfnAccountAuditConfiguration$AuditCheckConfigurationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticatedCognitoRoleOverlyPermissiveCheck` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditCheckConfigurationProperty | [[cdk.support/lookup-entry]] | `:authenticated-cognito-role-overly-permissive-check` |
| `caCertificateExpiringCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ca-certificate-expiring-check` |
| `caCertificateKeyQualityCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ca-certificate-key-quality-check` |
| `conflictingClientIdsCheck` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditCheckConfigurationProperty | [[cdk.support/lookup-entry]] | `:conflicting-client-ids-check` |
| `deviceCertificateExpiringCheck` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditCheckConfigurationProperty | [[cdk.support/lookup-entry]] | `:device-certificate-expiring-check` |
| `deviceCertificateKeyQualityCheck` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditCheckConfigurationProperty | [[cdk.support/lookup-entry]] | `:device-certificate-key-quality-check` |
| `deviceCertificateSharedCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:device-certificate-shared-check` |
| `intermediateCaRevokedForActiveDeviceCertificatesCheck` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditCheckConfigurationProperty | [[cdk.support/lookup-entry]] | `:intermediate-ca-revoked-for-active-device-certificates-check` |
| `ioTPolicyPotentialMisConfigurationCheck` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditCheckConfigurationProperty | [[cdk.support/lookup-entry]] | `:io-t-policy-potential-mis-configuration-check` |
| `iotPolicyOverlyPermissiveCheck` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditCheckConfigurationProperty | [[cdk.support/lookup-entry]] | `:iot-policy-overly-permissive-check` |
| `iotRoleAliasAllowsAccessToUnusedServicesCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iot-role-alias-allows-access-to-unused-services-check` |
| `iotRoleAliasOverlyPermissiveCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iot-role-alias-overly-permissive-check` |
| `loggingDisabledCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-disabled-check` |
| `revokedCaCertificateStillActiveCheck` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditCheckConfigurationProperty | [[cdk.support/lookup-entry]] | `:revoked-ca-certificate-still-active-check` |
| `revokedDeviceCertificateStillActiveCheck` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditCheckConfigurationProperty | [[cdk.support/lookup-entry]] | `:revoked-device-certificate-still-active-check` |
| `unauthenticatedCognitoRoleOverlyPermissiveCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unauthenticated-cognito-role-overly-permissive-check` |
"
  [^CfnAccountAuditConfiguration$AuditCheckConfigurationsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :authenticated-cognito-role-overly-permissive-check)]
    (. builder authenticatedCognitoRoleOverlyPermissiveCheck data))
  (when-some [data (lookup-entry config id :ca-certificate-expiring-check)]
    (. builder caCertificateExpiringCheck data))
  (when-some [data (lookup-entry config id :ca-certificate-key-quality-check)]
    (. builder caCertificateKeyQualityCheck data))
  (when-some [data (lookup-entry config id :conflicting-client-ids-check)]
    (. builder conflictingClientIdsCheck data))
  (when-some [data (lookup-entry config id :device-certificate-expiring-check)]
    (. builder deviceCertificateExpiringCheck data))
  (when-some [data (lookup-entry config id :device-certificate-key-quality-check)]
    (. builder deviceCertificateKeyQualityCheck data))
  (when-some [data (lookup-entry config id :device-certificate-shared-check)]
    (. builder deviceCertificateSharedCheck data))
  (when-some [data (lookup-entry config id :intermediate-ca-revoked-for-active-device-certificates-check)]
    (. builder intermediateCaRevokedForActiveDeviceCertificatesCheck data))
  (when-some [data (lookup-entry config id :io-t-policy-potential-mis-configuration-check)]
    (. builder ioTPolicyPotentialMisConfigurationCheck data))
  (when-some [data (lookup-entry config id :iot-policy-overly-permissive-check)]
    (. builder iotPolicyOverlyPermissiveCheck data))
  (when-some [data (lookup-entry config id :iot-role-alias-allows-access-to-unused-services-check)]
    (. builder iotRoleAliasAllowsAccessToUnusedServicesCheck data))
  (when-some [data (lookup-entry config id :iot-role-alias-overly-permissive-check)]
    (. builder iotRoleAliasOverlyPermissiveCheck data))
  (when-some [data (lookup-entry config id :logging-disabled-check)]
    (. builder loggingDisabledCheck data))
  (when-some [data (lookup-entry config id :revoked-ca-certificate-still-active-check)]
    (. builder revokedCaCertificateStillActiveCheck data))
  (when-some [data (lookup-entry config id :revoked-device-certificate-still-active-check)]
    (. builder revokedDeviceCertificateStillActiveCheck data))
  (when-some [data (lookup-entry config id :unauthenticated-cognito-role-overly-permissive-check)]
    (. builder unauthenticatedCognitoRoleOverlyPermissiveCheck data))
  (.build builder))


(defn cfn-account-audit-configuration-audit-check-configurations-property-builder
  "Creates a  `CfnAccountAuditConfiguration$AuditCheckConfigurationsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-account-audit-configuration-audit-check-configurations-property-builder> (new CfnAccountAuditConfiguration$AuditCheckConfigurationsProperty$Builder) id config))


(defn cfn-account-audit-configuration-audit-notification-target-configurations-property-builder>
  "The cfn-account-audit-configuration-audit-notification-target-configurations-property-builder> function updates a CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty$Builder instance using the provided configuration.
  The function takes the CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns` |
"
  [^CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :sns)]
    (. builder sns data))
  (.build builder))


(defn cfn-account-audit-configuration-audit-notification-target-configurations-property-builder
  "Creates a  `CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-account-audit-configuration-audit-notification-target-configurations-property-builder> (new CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty$Builder) id config))


(defn cfn-account-audit-configuration-audit-notification-target-property-builder>
  "The cfn-account-audit-configuration-audit-notification-target-property-builder> function updates a CfnAccountAuditConfiguration$AuditNotificationTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnAccountAuditConfiguration$AuditNotificationTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnAccountAuditConfiguration$AuditNotificationTargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-account-audit-configuration-audit-notification-target-property-builder
  "Creates a  `CfnAccountAuditConfiguration$AuditNotificationTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-account-audit-configuration-audit-notification-target-property-builder> (new CfnAccountAuditConfiguration$AuditNotificationTargetProperty$Builder) id config))


(defn cfn-account-audit-configuration-builder>
  "The cfn-account-audit-configuration-builder> function updates a CfnAccountAuditConfiguration$Builder instance using the provided configuration.
  The function takes the CfnAccountAuditConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `auditCheckConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audit-check-configurations` |
| `auditNotificationTargetConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audit-notification-target-configurations` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnAccountAuditConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :audit-check-configurations)]
    (. builder auditCheckConfigurations data))
  (when-some [data (lookup-entry config id :audit-notification-target-configurations)]
    (. builder auditNotificationTargetConfigurations data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-account-audit-configuration-builder
  "Creates a  `CfnAccountAuditConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-account-audit-configuration-builder> (CfnAccountAuditConfiguration$Builder/create scope (name id)) id config))


(defn cfn-account-audit-configuration-props-builder>
  "The cfn-account-audit-configuration-props-builder> function updates a CfnAccountAuditConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnAccountAuditConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `auditCheckConfigurations` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditCheckConfigurationsProperty | [[cdk.support/lookup-entry]] | `:audit-check-configurations` |
| `auditNotificationTargetConfigurations` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty | [[cdk.support/lookup-entry]] | `:audit-notification-target-configurations` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnAccountAuditConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :audit-check-configurations)]
    (. builder auditCheckConfigurations data))
  (when-some [data (lookup-entry config id :audit-notification-target-configurations)]
    (. builder auditNotificationTargetConfigurations data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-account-audit-configuration-props-builder
  "Creates a  `CfnAccountAuditConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-account-audit-configuration-props-builder> (new CfnAccountAuditConfigurationProps$Builder) id config))


(defn cfn-authorizer-builder>
  "The cfn-authorizer-builder> function updates a CfnAuthorizer$Builder instance using the provided configuration.
  The function takes the CfnAuthorizer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-function-arn` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `enableCachingForHttp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-caching-for-http` |
| `signingDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:signing-disabled` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tokenKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-name` |
| `tokenSigningPublicKeys` | java.util.Map | [[cdk.support/lookup-entry]] | `:token-signing-public-keys` |
"
  [^CfnAuthorizer$Builder builder id config]
  (when-some [data (lookup-entry config id :authorizer-function-arn)]
    (. builder authorizerFunctionArn data))
  (when-some [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-some [data (lookup-entry config id :enable-caching-for-http)]
    (. builder enableCachingForHttp data))
  (when-some [data (lookup-entry config id :signing-disabled)]
    (. builder signingDisabled data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :token-key-name)]
    (. builder tokenKeyName data))
  (when-some [data (lookup-entry config id :token-signing-public-keys)]
    (. builder tokenSigningPublicKeys data))
  (.build builder))


(defn cfn-authorizer-builder
  "Creates a  `CfnAuthorizer$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-authorizer-builder> (CfnAuthorizer$Builder/create scope (name id)) id config))


(defn cfn-authorizer-props-builder>
  "The cfn-authorizer-props-builder> function updates a CfnAuthorizerProps$Builder instance using the provided configuration.
  The function takes the CfnAuthorizerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-function-arn` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `enableCachingForHttp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-caching-for-http` |
| `signingDisabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:signing-disabled` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tokenKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-name` |
| `tokenSigningPublicKeys` | java.util.Map | [[cdk.support/lookup-entry]] | `:token-signing-public-keys` |
"
  [^CfnAuthorizerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :authorizer-function-arn)]
    (. builder authorizerFunctionArn data))
  (when-some [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-some [data (lookup-entry config id :enable-caching-for-http)]
    (. builder enableCachingForHttp data))
  (when-some [data (lookup-entry config id :signing-disabled)]
    (. builder signingDisabled data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :token-key-name)]
    (. builder tokenKeyName data))
  (when-some [data (lookup-entry config id :token-signing-public-keys)]
    (. builder tokenSigningPublicKeys data))
  (.build builder))


(defn cfn-authorizer-props-builder
  "Creates a  `CfnAuthorizerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-authorizer-props-builder> (new CfnAuthorizerProps$Builder) id config))


(defn cfn-billing-group-billing-group-properties-property-builder>
  "The cfn-billing-group-billing-group-properties-property-builder> function updates a CfnBillingGroup$BillingGroupPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnBillingGroup$BillingGroupPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-group-description` |
"
  [^CfnBillingGroup$BillingGroupPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :billing-group-description)]
    (. builder billingGroupDescription data))
  (.build builder))


(defn cfn-billing-group-billing-group-properties-property-builder
  "Creates a  `CfnBillingGroup$BillingGroupPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-billing-group-billing-group-properties-property-builder> (new CfnBillingGroup$BillingGroupPropertiesProperty$Builder) id config))


(defn cfn-billing-group-builder>
  "The cfn-billing-group-builder> function updates a CfnBillingGroup$Builder instance using the provided configuration.
  The function takes the CfnBillingGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-group-name` |
| `billingGroupProperties` | software.amazon.awscdk.services.iot.CfnBillingGroup$BillingGroupPropertiesProperty | [[cdk.support/lookup-entry]] | `:billing-group-properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnBillingGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :billing-group-name)]
    (. builder billingGroupName data))
  (when-some [data (lookup-entry config id :billing-group-properties)]
    (. builder billingGroupProperties data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-billing-group-builder
  "Creates a  `CfnBillingGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-billing-group-builder> (CfnBillingGroup$Builder/create scope (name id)) id config))


(defn cfn-billing-group-props-builder>
  "The cfn-billing-group-props-builder> function updates a CfnBillingGroupProps$Builder instance using the provided configuration.
  The function takes the CfnBillingGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-group-name` |
| `billingGroupProperties` | software.amazon.awscdk.services.iot.CfnBillingGroup$BillingGroupPropertiesProperty | [[cdk.support/lookup-entry]] | `:billing-group-properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnBillingGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :billing-group-name)]
    (. builder billingGroupName data))
  (when-some [data (lookup-entry config id :billing-group-properties)]
    (. builder billingGroupProperties data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-billing-group-props-builder
  "Creates a  `CfnBillingGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-billing-group-props-builder> (new CfnBillingGroupProps$Builder) id config))


(defn cfn-ca-certificate-builder>
  "The cfn-ca-certificate-builder> function updates a CfnCACertificate$Builder instance using the provided configuration.
  The function takes the CfnCACertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoRegistrationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-registration-status` |
| `caCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-pem` |
| `certificateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-mode` |
| `registrationConfig` | software.amazon.awscdk.services.iot.CfnCACertificate$RegistrationConfigProperty | [[cdk.support/lookup-entry]] | `:registration-config` |
| `removeAutoRegistration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-auto-registration` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `verificationCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:verification-certificate-pem` |
"
  [^CfnCACertificate$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-registration-status)]
    (. builder autoRegistrationStatus data))
  (when-some [data (lookup-entry config id :ca-certificate-pem)]
    (. builder caCertificatePem data))
  (when-some [data (lookup-entry config id :certificate-mode)]
    (. builder certificateMode data))
  (when-some [data (lookup-entry config id :registration-config)]
    (. builder registrationConfig data))
  (when-some [data (lookup-entry config id :remove-auto-registration)]
    (. builder removeAutoRegistration data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :verification-certificate-pem)]
    (. builder verificationCertificatePem data))
  (.build builder))


(defn cfn-ca-certificate-builder
  "Creates a  `CfnCACertificate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-ca-certificate-builder> (CfnCACertificate$Builder/create scope (name id)) id config))


(defn cfn-ca-certificate-props-builder>
  "The cfn-ca-certificate-props-builder> function updates a CfnCACertificateProps$Builder instance using the provided configuration.
  The function takes the CfnCACertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoRegistrationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-registration-status` |
| `caCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-pem` |
| `certificateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-mode` |
| `registrationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:registration-config` |
| `removeAutoRegistration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-auto-registration` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `verificationCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:verification-certificate-pem` |
"
  [^CfnCACertificateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-registration-status)]
    (. builder autoRegistrationStatus data))
  (when-some [data (lookup-entry config id :ca-certificate-pem)]
    (. builder caCertificatePem data))
  (when-some [data (lookup-entry config id :certificate-mode)]
    (. builder certificateMode data))
  (when-some [data (lookup-entry config id :registration-config)]
    (. builder registrationConfig data))
  (when-some [data (lookup-entry config id :remove-auto-registration)]
    (. builder removeAutoRegistration data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :verification-certificate-pem)]
    (. builder verificationCertificatePem data))
  (.build builder))


(defn cfn-ca-certificate-props-builder
  "Creates a  `CfnCACertificateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ca-certificate-props-builder> (new CfnCACertificateProps$Builder) id config))


(defn cfn-ca-certificate-registration-config-property-builder>
  "The cfn-ca-certificate-registration-config-property-builder> function updates a CfnCACertificate$RegistrationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCACertificate$RegistrationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
"
  [^CfnCACertificate$RegistrationConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :template-body)]
    (. builder templateBody data))
  (when-some [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (.build builder))


(defn cfn-ca-certificate-registration-config-property-builder
  "Creates a  `CfnCACertificate$RegistrationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ca-certificate-registration-config-property-builder> (new CfnCACertificate$RegistrationConfigProperty$Builder) id config))


(defn cfn-certificate-builder>
  "The cfn-certificate-builder> function updates a CfnCertificate$Builder instance using the provided configuration.
  The function takes the CfnCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-pem` |
| `certificateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-mode` |
| `certificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-pem` |
| `certificateSigningRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-signing-request` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnCertificate$Builder builder id config]
  (when-some [data (lookup-entry config id :ca-certificate-pem)]
    (. builder caCertificatePem data))
  (when-some [data (lookup-entry config id :certificate-mode)]
    (. builder certificateMode data))
  (when-some [data (lookup-entry config id :certificate-pem)]
    (. builder certificatePem data))
  (when-some [data (lookup-entry config id :certificate-signing-request)]
    (. builder certificateSigningRequest data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-certificate-builder
  "Creates a  `CfnCertificate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-certificate-builder> (CfnCertificate$Builder/create scope (name id)) id config))


(defn cfn-certificate-props-builder>
  "The cfn-certificate-props-builder> function updates a CfnCertificateProps$Builder instance using the provided configuration.
  The function takes the CfnCertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-pem` |
| `certificateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-mode` |
| `certificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-pem` |
| `certificateSigningRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-signing-request` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnCertificateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :ca-certificate-pem)]
    (. builder caCertificatePem data))
  (when-some [data (lookup-entry config id :certificate-mode)]
    (. builder certificateMode data))
  (when-some [data (lookup-entry config id :certificate-pem)]
    (. builder certificatePem data))
  (when-some [data (lookup-entry config id :certificate-signing-request)]
    (. builder certificateSigningRequest data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-certificate-props-builder
  "Creates a  `CfnCertificateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-certificate-props-builder> (new CfnCertificateProps$Builder) id config))


(defn cfn-certificate-provider-builder>
  "The cfn-certificate-provider-builder> function updates a CfnCertificateProvider$Builder instance using the provided configuration.
  The function takes the CfnCertificateProvider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountDefaultForOperations` | java.util.List | [[cdk.support/lookup-entry]] | `:account-default-for-operations` |
| `certificateProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-provider-name` |
| `lambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCertificateProvider$Builder builder id config]
  (when-some [data (lookup-entry config id :account-default-for-operations)]
    (. builder accountDefaultForOperations data))
  (when-some [data (lookup-entry config id :certificate-provider-name)]
    (. builder certificateProviderName data))
  (when-some [data (lookup-entry config id :lambda-function-arn)]
    (. builder lambdaFunctionArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-certificate-provider-builder
  "Creates a  `CfnCertificateProvider$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-certificate-provider-builder> (CfnCertificateProvider$Builder/create scope (name id)) id config))


(defn cfn-certificate-provider-props-builder>
  "The cfn-certificate-provider-props-builder> function updates a CfnCertificateProviderProps$Builder instance using the provided configuration.
  The function takes the CfnCertificateProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountDefaultForOperations` | java.util.List | [[cdk.support/lookup-entry]] | `:account-default-for-operations` |
| `certificateProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-provider-name` |
| `lambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCertificateProviderProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-default-for-operations)]
    (. builder accountDefaultForOperations data))
  (when-some [data (lookup-entry config id :certificate-provider-name)]
    (. builder certificateProviderName data))
  (when-some [data (lookup-entry config id :lambda-function-arn)]
    (. builder lambdaFunctionArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-certificate-provider-props-builder
  "Creates a  `CfnCertificateProviderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-certificate-provider-props-builder> (new CfnCertificateProviderProps$Builder) id config))


(defn cfn-custom-metric-builder>
  "The cfn-custom-metric-builder> function updates a CfnCustomMetric$Builder instance using the provided configuration.
  The function takes the CfnCustomMetric$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCustomMetric$Builder builder id config]
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :metric-type)]
    (. builder metricType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-custom-metric-builder
  "Creates a  `CfnCustomMetric$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-custom-metric-builder> (CfnCustomMetric$Builder/create scope (name id)) id config))


(defn cfn-custom-metric-props-builder>
  "The cfn-custom-metric-props-builder> function updates a CfnCustomMetricProps$Builder instance using the provided configuration.
  The function takes the CfnCustomMetricProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCustomMetricProps$Builder builder id config]
  (when-some [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :metric-type)]
    (. builder metricType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-custom-metric-props-builder
  "Creates a  `CfnCustomMetricProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-custom-metric-props-builder> (new CfnCustomMetricProps$Builder) id config))


(defn cfn-dimension-builder>
  "The cfn-dimension-builder> function updates a CfnDimension$Builder instance using the provided configuration.
  The function takes the CfnDimension$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stringValues` | java.util.List | [[cdk.support/lookup-entry]] | `:string-values` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDimension$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :string-values)]
    (. builder stringValues data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-dimension-builder
  "Creates a  `CfnDimension$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-dimension-builder> (CfnDimension$Builder/create scope (name id)) id config))


(defn cfn-dimension-props-builder>
  "The cfn-dimension-props-builder> function updates a CfnDimensionProps$Builder instance using the provided configuration.
  The function takes the CfnDimensionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stringValues` | java.util.List | [[cdk.support/lookup-entry]] | `:string-values` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnDimensionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :string-values)]
    (. builder stringValues data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-dimension-props-builder
  "Creates a  `CfnDimensionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-dimension-props-builder> (new CfnDimensionProps$Builder) id config))


(defn cfn-domain-configuration-authorizer-config-property-builder>
  "The cfn-domain-configuration-authorizer-config-property-builder> function updates a CfnDomainConfiguration$AuthorizerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomainConfiguration$AuthorizerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAuthorizerOverride` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-authorizer-override` |
| `defaultAuthorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authorizer-name` |
"
  [^CfnDomainConfiguration$AuthorizerConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-authorizer-override)]
    (. builder allowAuthorizerOverride data))
  (when-some [data (lookup-entry config id :default-authorizer-name)]
    (. builder defaultAuthorizerName data))
  (.build builder))


(defn cfn-domain-configuration-authorizer-config-property-builder
  "Creates a  `CfnDomainConfiguration$AuthorizerConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-domain-configuration-authorizer-config-property-builder> (new CfnDomainConfiguration$AuthorizerConfigProperty$Builder) id config))


(defn cfn-domain-configuration-builder>
  "The cfn-domain-configuration-builder> function updates a CfnDomainConfiguration$Builder instance using the provided configuration.
  The function takes the CfnDomainConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerConfig` | software.amazon.awscdk.services.iot.CfnDomainConfiguration$AuthorizerConfigProperty | [[cdk.support/lookup-entry]] | `:authorizer-config` |
| `domainConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-configuration-name` |
| `domainConfigurationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-configuration-status` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `serverCertificateArns` | java.util.List | [[cdk.support/lookup-entry]] | `:server-certificate-arns` |
| `serverCertificateConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-certificate-config` |
| `serviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tlsConfig` | software.amazon.awscdk.services.iot.CfnDomainConfiguration$TlsConfigProperty | [[cdk.support/lookup-entry]] | `:tls-config` |
| `validationCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-certificate-arn` |
"
  [^CfnDomainConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :authorizer-config)]
    (. builder authorizerConfig data))
  (when-some [data (lookup-entry config id :domain-configuration-name)]
    (. builder domainConfigurationName data))
  (when-some [data (lookup-entry config id :domain-configuration-status)]
    (. builder domainConfigurationStatus data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :server-certificate-arns)]
    (. builder serverCertificateArns data))
  (when-some [data (lookup-entry config id :server-certificate-config)]
    (. builder serverCertificateConfig data))
  (when-some [data (lookup-entry config id :service-type)]
    (. builder serviceType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tls-config)]
    (. builder tlsConfig data))
  (when-some [data (lookup-entry config id :validation-certificate-arn)]
    (. builder validationCertificateArn data))
  (.build builder))


(defn cfn-domain-configuration-builder
  "Creates a  `CfnDomainConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-domain-configuration-builder> (CfnDomainConfiguration$Builder/create scope (name id)) id config))


(defn cfn-domain-configuration-props-builder>
  "The cfn-domain-configuration-props-builder> function updates a CfnDomainConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnDomainConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerConfig` | software.amazon.awscdk.services.iot.CfnDomainConfiguration$AuthorizerConfigProperty | [[cdk.support/lookup-entry]] | `:authorizer-config` |
| `domainConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-configuration-name` |
| `domainConfigurationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-configuration-status` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `serverCertificateArns` | java.util.List | [[cdk.support/lookup-entry]] | `:server-certificate-arns` |
| `serverCertificateConfig` | software.amazon.awscdk.services.iot.CfnDomainConfiguration$ServerCertificateConfigProperty | [[cdk.support/lookup-entry]] | `:server-certificate-config` |
| `serviceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tlsConfig` | software.amazon.awscdk.services.iot.CfnDomainConfiguration$TlsConfigProperty | [[cdk.support/lookup-entry]] | `:tls-config` |
| `validationCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-certificate-arn` |
"
  [^CfnDomainConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :authorizer-config)]
    (. builder authorizerConfig data))
  (when-some [data (lookup-entry config id :domain-configuration-name)]
    (. builder domainConfigurationName data))
  (when-some [data (lookup-entry config id :domain-configuration-status)]
    (. builder domainConfigurationStatus data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :server-certificate-arns)]
    (. builder serverCertificateArns data))
  (when-some [data (lookup-entry config id :server-certificate-config)]
    (. builder serverCertificateConfig data))
  (when-some [data (lookup-entry config id :service-type)]
    (. builder serviceType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tls-config)]
    (. builder tlsConfig data))
  (when-some [data (lookup-entry config id :validation-certificate-arn)]
    (. builder validationCertificateArn data))
  (.build builder))


(defn cfn-domain-configuration-props-builder
  "Creates a  `CfnDomainConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-domain-configuration-props-builder> (new CfnDomainConfigurationProps$Builder) id config))


(defn cfn-domain-configuration-server-certificate-config-property-builder>
  "The cfn-domain-configuration-server-certificate-config-property-builder> function updates a CfnDomainConfiguration$ServerCertificateConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomainConfiguration$ServerCertificateConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableOcspCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-ocsp-check` |
"
  [^CfnDomainConfiguration$ServerCertificateConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :enable-ocsp-check)]
    (. builder enableOcspCheck data))
  (.build builder))


(defn cfn-domain-configuration-server-certificate-config-property-builder
  "Creates a  `CfnDomainConfiguration$ServerCertificateConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-domain-configuration-server-certificate-config-property-builder> (new CfnDomainConfiguration$ServerCertificateConfigProperty$Builder) id config))


(defn cfn-domain-configuration-server-certificate-summary-property-builder>
  "The cfn-domain-configuration-server-certificate-summary-property-builder> function updates a CfnDomainConfiguration$ServerCertificateSummaryProperty$Builder instance using the provided configuration.
  The function takes the CfnDomainConfiguration$ServerCertificateSummaryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serverCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-arn` |
| `serverCertificateStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-status` |
| `serverCertificateStatusDetail` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-status-detail` |
"
  [^CfnDomainConfiguration$ServerCertificateSummaryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :server-certificate-arn)]
    (. builder serverCertificateArn data))
  (when-some [data (lookup-entry config id :server-certificate-status)]
    (. builder serverCertificateStatus data))
  (when-some [data (lookup-entry config id :server-certificate-status-detail)]
    (. builder serverCertificateStatusDetail data))
  (.build builder))


(defn cfn-domain-configuration-server-certificate-summary-property-builder
  "Creates a  `CfnDomainConfiguration$ServerCertificateSummaryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-domain-configuration-server-certificate-summary-property-builder> (new CfnDomainConfiguration$ServerCertificateSummaryProperty$Builder) id config))


(defn cfn-domain-configuration-tls-config-property-builder>
  "The cfn-domain-configuration-tls-config-property-builder> function updates a CfnDomainConfiguration$TlsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomainConfiguration$TlsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |
"
  [^CfnDomainConfiguration$TlsConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :security-policy)]
    (. builder securityPolicy data))
  (.build builder))


(defn cfn-domain-configuration-tls-config-property-builder
  "Creates a  `CfnDomainConfiguration$TlsConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-domain-configuration-tls-config-property-builder> (new CfnDomainConfiguration$TlsConfigProperty$Builder) id config))


(defn cfn-fleet-metric-aggregation-type-property-builder>
  "The cfn-fleet-metric-aggregation-type-property-builder> function updates a CfnFleetMetric$AggregationTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnFleetMetric$AggregationTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnFleetMetric$AggregationTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-fleet-metric-aggregation-type-property-builder
  "Creates a  `CfnFleetMetric$AggregationTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-metric-aggregation-type-property-builder> (new CfnFleetMetric$AggregationTypeProperty$Builder) id config))


(defn cfn-fleet-metric-builder>
  "The cfn-fleet-metric-builder> function updates a CfnFleetMetric$Builder instance using the provided configuration.
  The function takes the CfnFleetMetric$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationField` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregation-field` |
| `aggregationType` | software.amazon.awscdk.services.iot.CfnFleetMetric$AggregationTypeProperty | [[cdk.support/lookup-entry]] | `:aggregation-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `queryVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-version` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnFleetMetric$Builder builder id config]
  (when-some [data (lookup-entry config id :aggregation-field)]
    (. builder aggregationField data))
  (when-some [data (lookup-entry config id :aggregation-type)]
    (. builder aggregationType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :index-name)]
    (. builder indexName data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :query-version)]
    (. builder queryVersion data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-fleet-metric-builder
  "Creates a  `CfnFleetMetric$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-fleet-metric-builder> (CfnFleetMetric$Builder/create scope (name id)) id config))


(defn cfn-fleet-metric-props-builder>
  "The cfn-fleet-metric-props-builder> function updates a CfnFleetMetricProps$Builder instance using the provided configuration.
  The function takes the CfnFleetMetricProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregationField` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregation-field` |
| `aggregationType` | software.amazon.awscdk.services.iot.CfnFleetMetric$AggregationTypeProperty | [[cdk.support/lookup-entry]] | `:aggregation-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `period` | java.lang.Number | [[cdk.support/lookup-entry]] | `:period` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `queryVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-version` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnFleetMetricProps$Builder builder id config]
  (when-some [data (lookup-entry config id :aggregation-field)]
    (. builder aggregationField data))
  (when-some [data (lookup-entry config id :aggregation-type)]
    (. builder aggregationType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :index-name)]
    (. builder indexName data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :period)]
    (. builder period data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :query-version)]
    (. builder queryVersion data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-fleet-metric-props-builder
  "Creates a  `CfnFleetMetricProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-metric-props-builder> (new CfnFleetMetricProps$Builder) id config))


(defn cfn-job-template-abort-config-property-builder>
  "The cfn-job-template-abort-config-property-builder> function updates a CfnJobTemplate$AbortConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$AbortConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criteriaList` | java.util.List | [[cdk.support/lookup-entry]] | `:criteria-list` |
"
  [^CfnJobTemplate$AbortConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :criteria-list)]
    (. builder criteriaList data))
  (.build builder))


(defn cfn-job-template-abort-config-property-builder
  "Creates a  `CfnJobTemplate$AbortConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-template-abort-config-property-builder> (new CfnJobTemplate$AbortConfigProperty$Builder) id config))


(defn cfn-job-template-abort-criteria-property-builder>
  "The cfn-job-template-abort-criteria-property-builder> function updates a CfnJobTemplate$AbortCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$AbortCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `failureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-type` |
| `minNumberOfExecutedThings` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-number-of-executed-things` |
| `thresholdPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold-percentage` |
"
  [^CfnJobTemplate$AbortCriteriaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :failure-type)]
    (. builder failureType data))
  (when-some [data (lookup-entry config id :min-number-of-executed-things)]
    (. builder minNumberOfExecutedThings data))
  (when-some [data (lookup-entry config id :threshold-percentage)]
    (. builder thresholdPercentage data))
  (.build builder))


(defn cfn-job-template-abort-criteria-property-builder
  "Creates a  `CfnJobTemplate$AbortCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-template-abort-criteria-property-builder> (new CfnJobTemplate$AbortCriteriaProperty$Builder) id config))


(defn cfn-job-template-builder>
  "The cfn-job-template-builder> function updates a CfnJobTemplate$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `abortConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:abort-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationPackageVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:destination-package-versions` |
| `document` | java.lang.String | [[cdk.support/lookup-entry]] | `:document` |
| `documentSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-source` |
| `jobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-arn` |
| `jobExecutionsRetryConfig` | software.amazon.awscdk.services.iot.CfnJobTemplate$JobExecutionsRetryConfigProperty | [[cdk.support/lookup-entry]] | `:job-executions-retry-config` |
| `jobExecutionsRolloutConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:job-executions-rollout-config` |
| `jobTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-template-id` |
| `maintenanceWindows` | java.util.List | [[cdk.support/lookup-entry]] | `:maintenance-windows` |
| `presignedUrlConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:presigned-url-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeoutConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:timeout-config` |
"
  [^CfnJobTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :abort-config)]
    (. builder abortConfig data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :destination-package-versions)]
    (. builder destinationPackageVersions data))
  (when-some [data (lookup-entry config id :document)]
    (. builder document data))
  (when-some [data (lookup-entry config id :document-source)]
    (. builder documentSource data))
  (when-some [data (lookup-entry config id :job-arn)]
    (. builder jobArn data))
  (when-some [data (lookup-entry config id :job-executions-retry-config)]
    (. builder jobExecutionsRetryConfig data))
  (when-some [data (lookup-entry config id :job-executions-rollout-config)]
    (. builder jobExecutionsRolloutConfig data))
  (when-some [data (lookup-entry config id :job-template-id)]
    (. builder jobTemplateId data))
  (when-some [data (lookup-entry config id :maintenance-windows)]
    (. builder maintenanceWindows data))
  (when-some [data (lookup-entry config id :presigned-url-config)]
    (. builder presignedUrlConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout-config)]
    (. builder timeoutConfig data))
  (.build builder))


(defn cfn-job-template-builder
  "Creates a  `CfnJobTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-job-template-builder> (CfnJobTemplate$Builder/create scope (name id)) id config))


(defn cfn-job-template-exponential-rollout-rate-property-builder>
  "The cfn-job-template-exponential-rollout-rate-property-builder> function updates a CfnJobTemplate$ExponentialRolloutRateProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$ExponentialRolloutRateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseRatePerMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base-rate-per-minute` |
| `incrementFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:increment-factor` |
| `rateIncreaseCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rate-increase-criteria` |
"
  [^CfnJobTemplate$ExponentialRolloutRateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :base-rate-per-minute)]
    (. builder baseRatePerMinute data))
  (when-some [data (lookup-entry config id :increment-factor)]
    (. builder incrementFactor data))
  (when-some [data (lookup-entry config id :rate-increase-criteria)]
    (. builder rateIncreaseCriteria data))
  (.build builder))


(defn cfn-job-template-exponential-rollout-rate-property-builder
  "Creates a  `CfnJobTemplate$ExponentialRolloutRateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-template-exponential-rollout-rate-property-builder> (new CfnJobTemplate$ExponentialRolloutRateProperty$Builder) id config))


(defn cfn-job-template-job-executions-retry-config-property-builder>
  "The cfn-job-template-job-executions-retry-config-property-builder> function updates a CfnJobTemplate$JobExecutionsRetryConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$JobExecutionsRetryConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `retryCriteriaList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-criteria-list` |
"
  [^CfnJobTemplate$JobExecutionsRetryConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :retry-criteria-list)]
    (. builder retryCriteriaList data))
  (.build builder))


(defn cfn-job-template-job-executions-retry-config-property-builder
  "Creates a  `CfnJobTemplate$JobExecutionsRetryConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-template-job-executions-retry-config-property-builder> (new CfnJobTemplate$JobExecutionsRetryConfigProperty$Builder) id config))


(defn cfn-job-template-job-executions-rollout-config-property-builder>
  "The cfn-job-template-job-executions-rollout-config-property-builder> function updates a CfnJobTemplate$JobExecutionsRolloutConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$JobExecutionsRolloutConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exponentialRolloutRate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exponential-rollout-rate` |
| `maximumPerMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-per-minute` |
"
  [^CfnJobTemplate$JobExecutionsRolloutConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :exponential-rollout-rate)]
    (. builder exponentialRolloutRate data))
  (when-some [data (lookup-entry config id :maximum-per-minute)]
    (. builder maximumPerMinute data))
  (.build builder))


(defn cfn-job-template-job-executions-rollout-config-property-builder
  "Creates a  `CfnJobTemplate$JobExecutionsRolloutConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-template-job-executions-rollout-config-property-builder> (new CfnJobTemplate$JobExecutionsRolloutConfigProperty$Builder) id config))


(defn cfn-job-template-maintenance-window-property-builder>
  "The cfn-job-template-maintenance-window-property-builder> function updates a CfnJobTemplate$MaintenanceWindowProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$MaintenanceWindowProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-minutes` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
"
  [^CfnJobTemplate$MaintenanceWindowProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :duration-in-minutes)]
    (. builder durationInMinutes data))
  (when-some [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (.build builder))


(defn cfn-job-template-maintenance-window-property-builder
  "Creates a  `CfnJobTemplate$MaintenanceWindowProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-template-maintenance-window-property-builder> (new CfnJobTemplate$MaintenanceWindowProperty$Builder) id config))


(defn cfn-job-template-presigned-url-config-property-builder>
  "The cfn-job-template-presigned-url-config-property-builder> function updates a CfnJobTemplate$PresignedUrlConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$PresignedUrlConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expiresInSec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expires-in-sec` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnJobTemplate$PresignedUrlConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :expires-in-sec)]
    (. builder expiresInSec data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-job-template-presigned-url-config-property-builder
  "Creates a  `CfnJobTemplate$PresignedUrlConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-template-presigned-url-config-property-builder> (new CfnJobTemplate$PresignedUrlConfigProperty$Builder) id config))


(defn cfn-job-template-props-builder>
  "The cfn-job-template-props-builder> function updates a CfnJobTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnJobTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `abortConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:abort-config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `destinationPackageVersions` | java.util.List | [[cdk.support/lookup-entry]] | `:destination-package-versions` |
| `document` | java.lang.String | [[cdk.support/lookup-entry]] | `:document` |
| `documentSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-source` |
| `jobArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-arn` |
| `jobExecutionsRetryConfig` | software.amazon.awscdk.services.iot.CfnJobTemplate$JobExecutionsRetryConfigProperty | [[cdk.support/lookup-entry]] | `:job-executions-retry-config` |
| `jobExecutionsRolloutConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:job-executions-rollout-config` |
| `jobTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:job-template-id` |
| `maintenanceWindows` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maintenance-windows` |
| `presignedUrlConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:presigned-url-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeoutConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:timeout-config` |
"
  [^CfnJobTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :abort-config)]
    (. builder abortConfig data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :destination-package-versions)]
    (. builder destinationPackageVersions data))
  (when-some [data (lookup-entry config id :document)]
    (. builder document data))
  (when-some [data (lookup-entry config id :document-source)]
    (. builder documentSource data))
  (when-some [data (lookup-entry config id :job-arn)]
    (. builder jobArn data))
  (when-some [data (lookup-entry config id :job-executions-retry-config)]
    (. builder jobExecutionsRetryConfig data))
  (when-some [data (lookup-entry config id :job-executions-rollout-config)]
    (. builder jobExecutionsRolloutConfig data))
  (when-some [data (lookup-entry config id :job-template-id)]
    (. builder jobTemplateId data))
  (when-some [data (lookup-entry config id :maintenance-windows)]
    (. builder maintenanceWindows data))
  (when-some [data (lookup-entry config id :presigned-url-config)]
    (. builder presignedUrlConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :timeout-config)]
    (. builder timeoutConfig data))
  (.build builder))


(defn cfn-job-template-props-builder
  "Creates a  `CfnJobTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-template-props-builder> (new CfnJobTemplateProps$Builder) id config))


(defn cfn-job-template-rate-increase-criteria-property-builder>
  "The cfn-job-template-rate-increase-criteria-property-builder> function updates a CfnJobTemplate$RateIncreaseCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$RateIncreaseCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfNotifiedThings` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-notified-things` |
| `numberOfSucceededThings` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-succeeded-things` |
"
  [^CfnJobTemplate$RateIncreaseCriteriaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :number-of-notified-things)]
    (. builder numberOfNotifiedThings data))
  (when-some [data (lookup-entry config id :number-of-succeeded-things)]
    (. builder numberOfSucceededThings data))
  (.build builder))


(defn cfn-job-template-rate-increase-criteria-property-builder
  "Creates a  `CfnJobTemplate$RateIncreaseCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-template-rate-increase-criteria-property-builder> (new CfnJobTemplate$RateIncreaseCriteriaProperty$Builder) id config))


(defn cfn-job-template-retry-criteria-property-builder>
  "The cfn-job-template-retry-criteria-property-builder> function updates a CfnJobTemplate$RetryCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$RetryCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-type` |
| `numberOfRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-retries` |
"
  [^CfnJobTemplate$RetryCriteriaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :failure-type)]
    (. builder failureType data))
  (when-some [data (lookup-entry config id :number-of-retries)]
    (. builder numberOfRetries data))
  (.build builder))


(defn cfn-job-template-retry-criteria-property-builder
  "Creates a  `CfnJobTemplate$RetryCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-template-retry-criteria-property-builder> (new CfnJobTemplate$RetryCriteriaProperty$Builder) id config))


(defn cfn-job-template-timeout-config-property-builder>
  "The cfn-job-template-timeout-config-property-builder> function updates a CfnJobTemplate$TimeoutConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$TimeoutConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inProgressTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:in-progress-timeout-in-minutes` |
"
  [^CfnJobTemplate$TimeoutConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :in-progress-timeout-in-minutes)]
    (. builder inProgressTimeoutInMinutes data))
  (.build builder))


(defn cfn-job-template-timeout-config-property-builder
  "Creates a  `CfnJobTemplate$TimeoutConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-job-template-timeout-config-property-builder> (new CfnJobTemplate$TimeoutConfigProperty$Builder) id config))


(defn cfn-logging-builder>
  "The cfn-logging-builder> function updates a CfnLogging$Builder instance using the provided configuration.
  The function takes the CfnLogging$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `defaultLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-log-level` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnLogging$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :default-log-level)]
    (. builder defaultLogLevel data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-logging-builder
  "Creates a  `CfnLogging$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-logging-builder> (CfnLogging$Builder/create scope (name id)) id config))


(defn cfn-logging-props-builder>
  "The cfn-logging-props-builder> function updates a CfnLoggingProps$Builder instance using the provided configuration.
  The function takes the CfnLoggingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `defaultLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-log-level` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnLoggingProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :default-log-level)]
    (. builder defaultLogLevel data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-logging-props-builder
  "Creates a  `CfnLoggingProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-logging-props-builder> (new CfnLoggingProps$Builder) id config))


(defn cfn-mitigation-action-action-params-property-builder>
  "The cfn-mitigation-action-action-params-property-builder> function updates a CfnMitigationAction$ActionParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$ActionParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addThingsToThingGroupParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:add-things-to-thing-group-params` |
| `enableIoTLoggingParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-io-t-logging-params` |
| `publishFindingToSnsParams` | software.amazon.awscdk.services.iot.CfnMitigationAction$PublishFindingToSnsParamsProperty | [[cdk.support/lookup-entry]] | `:publish-finding-to-sns-params` |
| `replaceDefaultPolicyVersionParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replace-default-policy-version-params` |
| `updateCaCertificateParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:update-ca-certificate-params` |
| `updateDeviceCertificateParams` | software.amazon.awscdk.services.iot.CfnMitigationAction$UpdateDeviceCertificateParamsProperty | [[cdk.support/lookup-entry]] | `:update-device-certificate-params` |
"
  [^CfnMitigationAction$ActionParamsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :add-things-to-thing-group-params)]
    (. builder addThingsToThingGroupParams data))
  (when-some [data (lookup-entry config id :enable-io-t-logging-params)]
    (. builder enableIoTLoggingParams data))
  (when-some [data (lookup-entry config id :publish-finding-to-sns-params)]
    (. builder publishFindingToSnsParams data))
  (when-some [data (lookup-entry config id :replace-default-policy-version-params)]
    (. builder replaceDefaultPolicyVersionParams data))
  (when-some [data (lookup-entry config id :update-ca-certificate-params)]
    (. builder updateCaCertificateParams data))
  (when-some [data (lookup-entry config id :update-device-certificate-params)]
    (. builder updateDeviceCertificateParams data))
  (.build builder))


(defn cfn-mitigation-action-action-params-property-builder
  "Creates a  `CfnMitigationAction$ActionParamsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-mitigation-action-action-params-property-builder> (new CfnMitigationAction$ActionParamsProperty$Builder) id config))


(defn cfn-mitigation-action-add-things-to-thing-group-params-property-builder>
  "The cfn-mitigation-action-add-things-to-thing-group-params-property-builder> function updates a CfnMitigationAction$AddThingsToThingGroupParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$AddThingsToThingGroupParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `overrideDynamicGroups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override-dynamic-groups` |
| `thingGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:thing-group-names` |
"
  [^CfnMitigationAction$AddThingsToThingGroupParamsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :override-dynamic-groups)]
    (. builder overrideDynamicGroups data))
  (when-some [data (lookup-entry config id :thing-group-names)]
    (. builder thingGroupNames data))
  (.build builder))


(defn cfn-mitigation-action-add-things-to-thing-group-params-property-builder
  "Creates a  `CfnMitigationAction$AddThingsToThingGroupParamsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-mitigation-action-add-things-to-thing-group-params-property-builder> (new CfnMitigationAction$AddThingsToThingGroupParamsProperty$Builder) id config))


(defn cfn-mitigation-action-builder>
  "The cfn-mitigation-action-builder> function updates a CfnMitigationAction$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `actionParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action-params` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMitigationAction$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :action-params)]
    (. builder actionParams data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-mitigation-action-builder
  "Creates a  `CfnMitigationAction$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-mitigation-action-builder> (CfnMitigationAction$Builder/create scope (name id)) id config))


(defn cfn-mitigation-action-enable-io-t-logging-params-property-builder>
  "The cfn-mitigation-action-enable-io-t-logging-params-property-builder> function updates a CfnMitigationAction$EnableIoTLoggingParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$EnableIoTLoggingParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `roleArnForLogging` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn-for-logging` |
"
  [^CfnMitigationAction$EnableIoTLoggingParamsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-some [data (lookup-entry config id :role-arn-for-logging)]
    (. builder roleArnForLogging data))
  (.build builder))


(defn cfn-mitigation-action-enable-io-t-logging-params-property-builder
  "Creates a  `CfnMitigationAction$EnableIoTLoggingParamsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-mitigation-action-enable-io-t-logging-params-property-builder> (new CfnMitigationAction$EnableIoTLoggingParamsProperty$Builder) id config))


(defn cfn-mitigation-action-props-builder>
  "The cfn-mitigation-action-props-builder> function updates a CfnMitigationActionProps$Builder instance using the provided configuration.
  The function takes the CfnMitigationActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `actionParams` | software.amazon.awscdk.services.iot.CfnMitigationAction$ActionParamsProperty | [[cdk.support/lookup-entry]] | `:action-params` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMitigationActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-some [data (lookup-entry config id :action-params)]
    (. builder actionParams data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-mitigation-action-props-builder
  "Creates a  `CfnMitigationActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-mitigation-action-props-builder> (new CfnMitigationActionProps$Builder) id config))


(defn cfn-mitigation-action-publish-finding-to-sns-params-property-builder>
  "The cfn-mitigation-action-publish-finding-to-sns-params-property-builder> function updates a CfnMitigationAction$PublishFindingToSnsParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$PublishFindingToSnsParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnMitigationAction$PublishFindingToSnsParamsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn cfn-mitigation-action-publish-finding-to-sns-params-property-builder
  "Creates a  `CfnMitigationAction$PublishFindingToSnsParamsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-mitigation-action-publish-finding-to-sns-params-property-builder> (new CfnMitigationAction$PublishFindingToSnsParamsProperty$Builder) id config))


(defn cfn-mitigation-action-replace-default-policy-version-params-property-builder>
  "The cfn-mitigation-action-replace-default-policy-version-params-property-builder> function updates a CfnMitigationAction$ReplaceDefaultPolicyVersionParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$ReplaceDefaultPolicyVersionParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
"
  [^CfnMitigationAction$ReplaceDefaultPolicyVersionParamsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (.build builder))


(defn cfn-mitigation-action-replace-default-policy-version-params-property-builder
  "Creates a  `CfnMitigationAction$ReplaceDefaultPolicyVersionParamsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-mitigation-action-replace-default-policy-version-params-property-builder> (new CfnMitigationAction$ReplaceDefaultPolicyVersionParamsProperty$Builder) id config))


(defn cfn-mitigation-action-update-ca-certificate-params-property-builder>
  "The cfn-mitigation-action-update-ca-certificate-params-property-builder> function updates a CfnMitigationAction$UpdateCACertificateParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$UpdateCACertificateParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
"
  [^CfnMitigationAction$UpdateCACertificateParamsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (.build builder))


(defn cfn-mitigation-action-update-ca-certificate-params-property-builder
  "Creates a  `CfnMitigationAction$UpdateCACertificateParamsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-mitigation-action-update-ca-certificate-params-property-builder> (new CfnMitigationAction$UpdateCACertificateParamsProperty$Builder) id config))


(defn cfn-mitigation-action-update-device-certificate-params-property-builder>
  "The cfn-mitigation-action-update-device-certificate-params-property-builder> function updates a CfnMitigationAction$UpdateDeviceCertificateParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$UpdateDeviceCertificateParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
"
  [^CfnMitigationAction$UpdateDeviceCertificateParamsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (.build builder))


(defn cfn-mitigation-action-update-device-certificate-params-property-builder
  "Creates a  `CfnMitigationAction$UpdateDeviceCertificateParamsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-mitigation-action-update-device-certificate-params-property-builder> (new CfnMitigationAction$UpdateDeviceCertificateParamsProperty$Builder) id config))


(defn cfn-policy-builder>
  "The cfn-policy-builder> function updates a CfnPolicy$Builder instance using the provided configuration.
  The function takes the CfnPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-policy-builder
  "Creates a  `CfnPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-policy-builder> (CfnPolicy$Builder/create scope (name id)) id config))


(defn cfn-policy-principal-attachment-builder>
  "The cfn-policy-principal-attachment-builder> function updates a CfnPolicyPrincipalAttachment$Builder instance using the provided configuration.
  The function takes the CfnPolicyPrincipalAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
"
  [^CfnPolicyPrincipalAttachment$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :principal)]
    (. builder principal data))
  (.build builder))


(defn cfn-policy-principal-attachment-builder
  "Creates a  `CfnPolicyPrincipalAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-policy-principal-attachment-builder> (CfnPolicyPrincipalAttachment$Builder/create scope (name id)) id config))


(defn cfn-policy-principal-attachment-props-builder>
  "The cfn-policy-principal-attachment-props-builder> function updates a CfnPolicyPrincipalAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnPolicyPrincipalAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
"
  [^CfnPolicyPrincipalAttachmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :principal)]
    (. builder principal data))
  (.build builder))


(defn cfn-policy-principal-attachment-props-builder
  "Creates a  `CfnPolicyPrincipalAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-policy-principal-attachment-props-builder> (new CfnPolicyPrincipalAttachmentProps$Builder) id config))


(defn cfn-policy-props-builder>
  "The cfn-policy-props-builder> function updates a CfnPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-policy-props-builder
  "Creates a  `CfnPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-policy-props-builder> (new CfnPolicyProps$Builder) id config))


(defn cfn-provisioning-template-builder>
  "The cfn-provisioning-template-builder> function updates a CfnProvisioningTemplate$Builder instance using the provided configuration.
  The function takes the CfnProvisioningTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `preProvisioningHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pre-provisioning-hook` |
| `provisioningRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `templateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-type` |
"
  [^CfnProvisioningTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :pre-provisioning-hook)]
    (. builder preProvisioningHook data))
  (when-some [data (lookup-entry config id :provisioning-role-arn)]
    (. builder provisioningRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-body)]
    (. builder templateBody data))
  (when-some [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (when-some [data (lookup-entry config id :template-type)]
    (. builder templateType data))
  (.build builder))


(defn cfn-provisioning-template-builder
  "Creates a  `CfnProvisioningTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-provisioning-template-builder> (CfnProvisioningTemplate$Builder/create scope (name id)) id config))


(defn cfn-provisioning-template-props-builder>
  "The cfn-provisioning-template-props-builder> function updates a CfnProvisioningTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnProvisioningTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `preProvisioningHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pre-provisioning-hook` |
| `provisioningRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `templateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-type` |
"
  [^CfnProvisioningTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :pre-provisioning-hook)]
    (. builder preProvisioningHook data))
  (when-some [data (lookup-entry config id :provisioning-role-arn)]
    (. builder provisioningRoleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template-body)]
    (. builder templateBody data))
  (when-some [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (when-some [data (lookup-entry config id :template-type)]
    (. builder templateType data))
  (.build builder))


(defn cfn-provisioning-template-props-builder
  "Creates a  `CfnProvisioningTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-provisioning-template-props-builder> (new CfnProvisioningTemplateProps$Builder) id config))


(defn cfn-provisioning-template-provisioning-hook-property-builder>
  "The cfn-provisioning-template-provisioning-hook-property-builder> function updates a CfnProvisioningTemplate$ProvisioningHookProperty$Builder instance using the provided configuration.
  The function takes the CfnProvisioningTemplate$ProvisioningHookProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payloadVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-version` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnProvisioningTemplate$ProvisioningHookProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :payload-version)]
    (. builder payloadVersion data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-provisioning-template-provisioning-hook-property-builder
  "Creates a  `CfnProvisioningTemplate$ProvisioningHookProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-provisioning-template-provisioning-hook-property-builder> (new CfnProvisioningTemplate$ProvisioningHookProperty$Builder) id config))


(defn cfn-resource-specific-logging-builder>
  "The cfn-resource-specific-logging-builder> function updates a CfnResourceSpecificLogging$Builder instance using the provided configuration.
  The function takes the CfnResourceSpecificLogging$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `targetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-name` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
"
  [^CfnResourceSpecificLogging$Builder builder id config]
  (when-some [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-some [data (lookup-entry config id :target-name)]
    (. builder targetName data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn cfn-resource-specific-logging-builder
  "Creates a  `CfnResourceSpecificLogging$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-specific-logging-builder> (CfnResourceSpecificLogging$Builder/create scope (name id)) id config))


(defn cfn-resource-specific-logging-props-builder>
  "The cfn-resource-specific-logging-props-builder> function updates a CfnResourceSpecificLoggingProps$Builder instance using the provided configuration.
  The function takes the CfnResourceSpecificLoggingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `targetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-name` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
"
  [^CfnResourceSpecificLoggingProps$Builder builder id config]
  (when-some [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-some [data (lookup-entry config id :target-name)]
    (. builder targetName data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn cfn-resource-specific-logging-props-builder
  "Creates a  `CfnResourceSpecificLoggingProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-resource-specific-logging-props-builder> (new CfnResourceSpecificLoggingProps$Builder) id config))


(defn cfn-role-alias-builder>
  "The cfn-role-alias-builder> function updates a CfnRoleAlias$Builder instance using the provided configuration.
  The function takes the CfnRoleAlias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:credential-duration-seconds` |
| `roleAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-alias` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRoleAlias$Builder builder id config]
  (when-some [data (lookup-entry config id :credential-duration-seconds)]
    (. builder credentialDurationSeconds data))
  (when-some [data (lookup-entry config id :role-alias)]
    (. builder roleAlias data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-role-alias-builder
  "Creates a  `CfnRoleAlias$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-role-alias-builder> (CfnRoleAlias$Builder/create scope (name id)) id config))


(defn cfn-role-alias-props-builder>
  "The cfn-role-alias-props-builder> function updates a CfnRoleAliasProps$Builder instance using the provided configuration.
  The function takes the CfnRoleAliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:credential-duration-seconds` |
| `roleAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-alias` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRoleAliasProps$Builder builder id config]
  (when-some [data (lookup-entry config id :credential-duration-seconds)]
    (. builder credentialDurationSeconds data))
  (when-some [data (lookup-entry config id :role-alias)]
    (. builder roleAlias data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-role-alias-props-builder
  "Creates a  `CfnRoleAliasProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-role-alias-props-builder> (new CfnRoleAliasProps$Builder) id config))


(defn cfn-scheduled-audit-builder>
  "The cfn-scheduled-audit-builder> function updates a CfnScheduledAudit$Builder instance using the provided configuration.
  The function takes the CfnScheduledAudit$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfMonth` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-month` |
| `dayOfWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-week` |
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |
| `scheduledAuditName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-audit-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetCheckNames` | java.util.List | [[cdk.support/lookup-entry]] | `:target-check-names` |
"
  [^CfnScheduledAudit$Builder builder id config]
  (when-some [data (lookup-entry config id :day-of-month)]
    (. builder dayOfMonth data))
  (when-some [data (lookup-entry config id :day-of-week)]
    (. builder dayOfWeek data))
  (when-some [data (lookup-entry config id :frequency)]
    (. builder frequency data))
  (when-some [data (lookup-entry config id :scheduled-audit-name)]
    (. builder scheduledAuditName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-check-names)]
    (. builder targetCheckNames data))
  (.build builder))


(defn cfn-scheduled-audit-builder
  "Creates a  `CfnScheduledAudit$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-scheduled-audit-builder> (CfnScheduledAudit$Builder/create scope (name id)) id config))


(defn cfn-scheduled-audit-props-builder>
  "The cfn-scheduled-audit-props-builder> function updates a CfnScheduledAuditProps$Builder instance using the provided configuration.
  The function takes the CfnScheduledAuditProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfMonth` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-month` |
| `dayOfWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-week` |
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |
| `scheduledAuditName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-audit-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetCheckNames` | java.util.List | [[cdk.support/lookup-entry]] | `:target-check-names` |
"
  [^CfnScheduledAuditProps$Builder builder id config]
  (when-some [data (lookup-entry config id :day-of-month)]
    (. builder dayOfMonth data))
  (when-some [data (lookup-entry config id :day-of-week)]
    (. builder dayOfWeek data))
  (when-some [data (lookup-entry config id :frequency)]
    (. builder frequency data))
  (when-some [data (lookup-entry config id :scheduled-audit-name)]
    (. builder scheduledAuditName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-check-names)]
    (. builder targetCheckNames data))
  (.build builder))


(defn cfn-scheduled-audit-props-builder
  "Creates a  `CfnScheduledAuditProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-scheduled-audit-props-builder> (new CfnScheduledAuditProps$Builder) id config))


(defn cfn-security-profile-alert-target-property-builder>
  "The cfn-security-profile-alert-target-property-builder> function updates a CfnSecurityProfile$AlertTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$AlertTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alertTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-target-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnSecurityProfile$AlertTargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alert-target-arn)]
    (. builder alertTargetArn data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-security-profile-alert-target-property-builder
  "Creates a  `CfnSecurityProfile$AlertTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-profile-alert-target-property-builder> (new CfnSecurityProfile$AlertTargetProperty$Builder) id config))


(defn cfn-security-profile-behavior-criteria-property-builder>
  "The cfn-security-profile-behavior-criteria-property-builder> function updates a CfnSecurityProfile$BehaviorCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$BehaviorCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `consecutiveDatapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:consecutive-datapoints-to-alarm` |
| `consecutiveDatapointsToClear` | java.lang.Number | [[cdk.support/lookup-entry]] | `:consecutive-datapoints-to-clear` |
| `durationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-seconds` |
| `mlDetectionConfig` | software.amazon.awscdk.services.iot.CfnSecurityProfile$MachineLearningDetectionConfigProperty | [[cdk.support/lookup-entry]] | `:ml-detection-config` |
| `statisticalThreshold` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:statistical-threshold` |
| `value` | software.amazon.awscdk.services.iot.CfnSecurityProfile$MetricValueProperty | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnSecurityProfile$BehaviorCriteriaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :consecutive-datapoints-to-alarm)]
    (. builder consecutiveDatapointsToAlarm data))
  (when-some [data (lookup-entry config id :consecutive-datapoints-to-clear)]
    (. builder consecutiveDatapointsToClear data))
  (when-some [data (lookup-entry config id :duration-seconds)]
    (. builder durationSeconds data))
  (when-some [data (lookup-entry config id :ml-detection-config)]
    (. builder mlDetectionConfig data))
  (when-some [data (lookup-entry config id :statistical-threshold)]
    (. builder statisticalThreshold data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-security-profile-behavior-criteria-property-builder
  "Creates a  `CfnSecurityProfile$BehaviorCriteriaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-profile-behavior-criteria-property-builder> (new CfnSecurityProfile$BehaviorCriteriaProperty$Builder) id config))


(defn cfn-security-profile-behavior-property-builder>
  "The cfn-security-profile-behavior-property-builder> function updates a CfnSecurityProfile$BehaviorProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$BehaviorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:criteria` |
| `exportMetric` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:export-metric` |
| `metric` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric` |
| `metricDimension` | software.amazon.awscdk.services.iot.CfnSecurityProfile$MetricDimensionProperty | [[cdk.support/lookup-entry]] | `:metric-dimension` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `suppressAlerts` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:suppress-alerts` |
"
  [^CfnSecurityProfile$BehaviorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :criteria)]
    (. builder criteria data))
  (when-some [data (lookup-entry config id :export-metric)]
    (. builder exportMetric data))
  (when-some [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-some [data (lookup-entry config id :metric-dimension)]
    (. builder metricDimension data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :suppress-alerts)]
    (. builder suppressAlerts data))
  (.build builder))


(defn cfn-security-profile-behavior-property-builder
  "Creates a  `CfnSecurityProfile$BehaviorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-profile-behavior-property-builder> (new CfnSecurityProfile$BehaviorProperty$Builder) id config))


(defn cfn-security-profile-builder>
  "The cfn-security-profile-builder> function updates a CfnSecurityProfile$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalMetricsToRetainV2` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-metrics-to-retain-v2` |
| `alertTargets` | java.util.Map | [[cdk.support/lookup-entry]] | `:alert-targets` |
| `behaviors` | java.util.List | [[cdk.support/lookup-entry]] | `:behaviors` |
| `metricsExportConfig` | software.amazon.awscdk.services.iot.CfnSecurityProfile$MetricsExportConfigProperty | [[cdk.support/lookup-entry]] | `:metrics-export-config` |
| `securityProfileDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-profile-description` |
| `securityProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-profile-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:target-arns` |
"
  [^CfnSecurityProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-metrics-to-retain-v2)]
    (. builder additionalMetricsToRetainV2 data))
  (when-some [data (lookup-entry config id :alert-targets)]
    (. builder alertTargets data))
  (when-some [data (lookup-entry config id :behaviors)]
    (. builder behaviors data))
  (when-some [data (lookup-entry config id :metrics-export-config)]
    (. builder metricsExportConfig data))
  (when-some [data (lookup-entry config id :security-profile-description)]
    (. builder securityProfileDescription data))
  (when-some [data (lookup-entry config id :security-profile-name)]
    (. builder securityProfileName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-arns)]
    (. builder targetArns data))
  (.build builder))


(defn cfn-security-profile-builder
  "Creates a  `CfnSecurityProfile$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-security-profile-builder> (CfnSecurityProfile$Builder/create scope (name id)) id config))


(defn cfn-security-profile-machine-learning-detection-config-property-builder>
  "The cfn-security-profile-machine-learning-detection-config-property-builder> function updates a CfnSecurityProfile$MachineLearningDetectionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$MachineLearningDetectionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `confidenceLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:confidence-level` |
"
  [^CfnSecurityProfile$MachineLearningDetectionConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :confidence-level)]
    (. builder confidenceLevel data))
  (.build builder))


(defn cfn-security-profile-machine-learning-detection-config-property-builder
  "Creates a  `CfnSecurityProfile$MachineLearningDetectionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-profile-machine-learning-detection-config-property-builder> (new CfnSecurityProfile$MachineLearningDetectionConfigProperty$Builder) id config))


(defn cfn-security-profile-metric-dimension-property-builder>
  "The cfn-security-profile-metric-dimension-property-builder> function updates a CfnSecurityProfile$MetricDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$MetricDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-name` |
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |
"
  [^CfnSecurityProfile$MetricDimensionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dimension-name)]
    (. builder dimensionName data))
  (when-some [data (lookup-entry config id :operator)]
    (. builder operator data))
  (.build builder))


(defn cfn-security-profile-metric-dimension-property-builder
  "Creates a  `CfnSecurityProfile$MetricDimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-profile-metric-dimension-property-builder> (new CfnSecurityProfile$MetricDimensionProperty$Builder) id config))


(defn cfn-security-profile-metric-to-retain-property-builder>
  "The cfn-security-profile-metric-to-retain-property-builder> function updates a CfnSecurityProfile$MetricToRetainProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$MetricToRetainProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exportMetric` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:export-metric` |
| `metric` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric` |
| `metricDimension` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-dimension` |
"
  [^CfnSecurityProfile$MetricToRetainProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :export-metric)]
    (. builder exportMetric data))
  (when-some [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-some [data (lookup-entry config id :metric-dimension)]
    (. builder metricDimension data))
  (.build builder))


(defn cfn-security-profile-metric-to-retain-property-builder
  "Creates a  `CfnSecurityProfile$MetricToRetainProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-profile-metric-to-retain-property-builder> (new CfnSecurityProfile$MetricToRetainProperty$Builder) id config))


(defn cfn-security-profile-metric-value-property-builder>
  "The cfn-security-profile-metric-value-property-builder> function updates a CfnSecurityProfile$MetricValueProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$MetricValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrs` | java.util.List | [[cdk.support/lookup-entry]] | `:cidrs` |
| `count` | java.lang.String | [[cdk.support/lookup-entry]] | `:count` |
| `number` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number` |
| `numbers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:numbers` |
| `ports` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ports` |
| `strings` | java.util.List | [[cdk.support/lookup-entry]] | `:strings` |
"
  [^CfnSecurityProfile$MetricValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cidrs)]
    (. builder cidrs data))
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (when-some [data (lookup-entry config id :number)]
    (. builder number data))
  (when-some [data (lookup-entry config id :numbers)]
    (. builder numbers data))
  (when-some [data (lookup-entry config id :ports)]
    (. builder ports data))
  (when-some [data (lookup-entry config id :strings)]
    (. builder strings data))
  (.build builder))


(defn cfn-security-profile-metric-value-property-builder
  "Creates a  `CfnSecurityProfile$MetricValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-profile-metric-value-property-builder> (new CfnSecurityProfile$MetricValueProperty$Builder) id config))


(defn cfn-security-profile-metrics-export-config-property-builder>
  "The cfn-security-profile-metrics-export-config-property-builder> function updates a CfnSecurityProfile$MetricsExportConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$MetricsExportConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mqttTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:mqtt-topic` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnSecurityProfile$MetricsExportConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mqtt-topic)]
    (. builder mqttTopic data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-security-profile-metrics-export-config-property-builder
  "Creates a  `CfnSecurityProfile$MetricsExportConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-profile-metrics-export-config-property-builder> (new CfnSecurityProfile$MetricsExportConfigProperty$Builder) id config))


(defn cfn-security-profile-props-builder>
  "The cfn-security-profile-props-builder> function updates a CfnSecurityProfileProps$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalMetricsToRetainV2` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-metrics-to-retain-v2` |
| `alertTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alert-targets` |
| `behaviors` | java.util.List | [[cdk.support/lookup-entry]] | `:behaviors` |
| `metricsExportConfig` | software.amazon.awscdk.services.iot.CfnSecurityProfile$MetricsExportConfigProperty | [[cdk.support/lookup-entry]] | `:metrics-export-config` |
| `securityProfileDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-profile-description` |
| `securityProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-profile-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:target-arns` |
"
  [^CfnSecurityProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :additional-metrics-to-retain-v2)]
    (. builder additionalMetricsToRetainV2 data))
  (when-some [data (lookup-entry config id :alert-targets)]
    (. builder alertTargets data))
  (when-some [data (lookup-entry config id :behaviors)]
    (. builder behaviors data))
  (when-some [data (lookup-entry config id :metrics-export-config)]
    (. builder metricsExportConfig data))
  (when-some [data (lookup-entry config id :security-profile-description)]
    (. builder securityProfileDescription data))
  (when-some [data (lookup-entry config id :security-profile-name)]
    (. builder securityProfileName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-arns)]
    (. builder targetArns data))
  (.build builder))


(defn cfn-security-profile-props-builder
  "Creates a  `CfnSecurityProfileProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-profile-props-builder> (new CfnSecurityProfileProps$Builder) id config))


(defn cfn-security-profile-statistical-threshold-property-builder>
  "The cfn-security-profile-statistical-threshold-property-builder> function updates a CfnSecurityProfile$StatisticalThresholdProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$StatisticalThresholdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
"
  [^CfnSecurityProfile$StatisticalThresholdProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (.build builder))


(defn cfn-security-profile-statistical-threshold-property-builder
  "Creates a  `CfnSecurityProfile$StatisticalThresholdProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-security-profile-statistical-threshold-property-builder> (new CfnSecurityProfile$StatisticalThresholdProperty$Builder) id config))


(defn cfn-software-package-builder>
  "The cfn-software-package-builder> function updates a CfnSoftwarePackage$Builder instance using the provided configuration.
  The function takes the CfnSoftwarePackage$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSoftwarePackage$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :package-name)]
    (. builder packageName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-software-package-builder
  "Creates a  `CfnSoftwarePackage$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-software-package-builder> (CfnSoftwarePackage$Builder/create scope (name id)) id config))


(defn cfn-software-package-props-builder>
  "The cfn-software-package-props-builder> function updates a CfnSoftwarePackageProps$Builder instance using the provided configuration.
  The function takes the CfnSoftwarePackageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSoftwarePackageProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :package-name)]
    (. builder packageName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-software-package-props-builder
  "Creates a  `CfnSoftwarePackageProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-software-package-props-builder> (new CfnSoftwarePackageProps$Builder) id config))


(defn cfn-software-package-version-builder>
  "The cfn-software-package-version-builder> function updates a CfnSoftwarePackageVersion$Builder instance using the provided configuration.
  The function takes the CfnSoftwarePackageVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `versionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-name` |
"
  [^CfnSoftwarePackageVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :package-name)]
    (. builder packageName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :version-name)]
    (. builder versionName data))
  (.build builder))


(defn cfn-software-package-version-builder
  "Creates a  `CfnSoftwarePackageVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-software-package-version-builder> (CfnSoftwarePackageVersion$Builder/create scope (name id)) id config))


(defn cfn-software-package-version-props-builder>
  "The cfn-software-package-version-props-builder> function updates a CfnSoftwarePackageVersionProps$Builder instance using the provided configuration.
  The function takes the CfnSoftwarePackageVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `versionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-name` |
"
  [^CfnSoftwarePackageVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :package-name)]
    (. builder packageName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :version-name)]
    (. builder versionName data))
  (.build builder))


(defn cfn-software-package-version-props-builder
  "Creates a  `CfnSoftwarePackageVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-software-package-version-props-builder> (new CfnSoftwarePackageVersionProps$Builder) id config))


(defn cfn-thing-attribute-payload-property-builder>
  "The cfn-thing-attribute-payload-property-builder> function updates a CfnThing$AttributePayloadProperty$Builder instance using the provided configuration.
  The function takes the CfnThing$AttributePayloadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |
"
  [^CfnThing$AttributePayloadProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (.build builder))


(defn cfn-thing-attribute-payload-property-builder
  "Creates a  `CfnThing$AttributePayloadProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-thing-attribute-payload-property-builder> (new CfnThing$AttributePayloadProperty$Builder) id config))


(defn cfn-thing-builder>
  "The cfn-thing-builder> function updates a CfnThing$Builder instance using the provided configuration.
  The function takes the CfnThing$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributePayload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-payload` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnThing$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-payload)]
    (. builder attributePayload data))
  (when-some [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn cfn-thing-builder
  "Creates a  `CfnThing$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-thing-builder> (CfnThing$Builder/create scope (name id)) id config))


(defn cfn-thing-group-attribute-payload-property-builder>
  "The cfn-thing-group-attribute-payload-property-builder> function updates a CfnThingGroup$AttributePayloadProperty$Builder instance using the provided configuration.
  The function takes the CfnThingGroup$AttributePayloadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |
"
  [^CfnThingGroup$AttributePayloadProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (.build builder))


(defn cfn-thing-group-attribute-payload-property-builder
  "Creates a  `CfnThingGroup$AttributePayloadProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-thing-group-attribute-payload-property-builder> (new CfnThingGroup$AttributePayloadProperty$Builder) id config))


(defn cfn-thing-group-builder>
  "The cfn-thing-group-builder> function updates a CfnThingGroup$Builder instance using the provided configuration.
  The function takes the CfnThingGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-group-name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-group-name` |
| `thingGroupProperties` | software.amazon.awscdk.services.iot.CfnThingGroup$ThingGroupPropertiesProperty | [[cdk.support/lookup-entry]] | `:thing-group-properties` |
"
  [^CfnThingGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :parent-group-name)]
    (. builder parentGroupName data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thing-group-name)]
    (. builder thingGroupName data))
  (when-some [data (lookup-entry config id :thing-group-properties)]
    (. builder thingGroupProperties data))
  (.build builder))


(defn cfn-thing-group-builder
  "Creates a  `CfnThingGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-thing-group-builder> (CfnThingGroup$Builder/create scope (name id)) id config))


(defn cfn-thing-group-props-builder>
  "The cfn-thing-group-props-builder> function updates a CfnThingGroupProps$Builder instance using the provided configuration.
  The function takes the CfnThingGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-group-name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-group-name` |
| `thingGroupProperties` | software.amazon.awscdk.services.iot.CfnThingGroup$ThingGroupPropertiesProperty | [[cdk.support/lookup-entry]] | `:thing-group-properties` |
"
  [^CfnThingGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :parent-group-name)]
    (. builder parentGroupName data))
  (when-some [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thing-group-name)]
    (. builder thingGroupName data))
  (when-some [data (lookup-entry config id :thing-group-properties)]
    (. builder thingGroupProperties data))
  (.build builder))


(defn cfn-thing-group-props-builder
  "Creates a  `CfnThingGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-thing-group-props-builder> (new CfnThingGroupProps$Builder) id config))


(defn cfn-thing-group-thing-group-properties-property-builder>
  "The cfn-thing-group-thing-group-properties-property-builder> function updates a CfnThingGroup$ThingGroupPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnThingGroup$ThingGroupPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributePayload` | software.amazon.awscdk.services.iot.CfnThingGroup$AttributePayloadProperty | [[cdk.support/lookup-entry]] | `:attribute-payload` |
| `thingGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-group-description` |
"
  [^CfnThingGroup$ThingGroupPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-payload)]
    (. builder attributePayload data))
  (when-some [data (lookup-entry config id :thing-group-description)]
    (. builder thingGroupDescription data))
  (.build builder))


(defn cfn-thing-group-thing-group-properties-property-builder
  "Creates a  `CfnThingGroup$ThingGroupPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-thing-group-thing-group-properties-property-builder> (new CfnThingGroup$ThingGroupPropertiesProperty$Builder) id config))


(defn cfn-thing-principal-attachment-builder>
  "The cfn-thing-principal-attachment-builder> function updates a CfnThingPrincipalAttachment$Builder instance using the provided configuration.
  The function takes the CfnThingPrincipalAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnThingPrincipalAttachment$Builder builder id config]
  (when-some [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-some [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn cfn-thing-principal-attachment-builder
  "Creates a  `CfnThingPrincipalAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-thing-principal-attachment-builder> (CfnThingPrincipalAttachment$Builder/create scope (name id)) id config))


(defn cfn-thing-principal-attachment-props-builder>
  "The cfn-thing-principal-attachment-props-builder> function updates a CfnThingPrincipalAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnThingPrincipalAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnThingPrincipalAttachmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-some [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn cfn-thing-principal-attachment-props-builder
  "Creates a  `CfnThingPrincipalAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-thing-principal-attachment-props-builder> (new CfnThingPrincipalAttachmentProps$Builder) id config))


(defn cfn-thing-props-builder>
  "The cfn-thing-props-builder> function updates a CfnThingProps$Builder instance using the provided configuration.
  The function takes the CfnThingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributePayload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-payload` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnThingProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-payload)]
    (. builder attributePayload data))
  (when-some [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn cfn-thing-props-builder
  "Creates a  `CfnThingProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-thing-props-builder> (new CfnThingProps$Builder) id config))


(defn cfn-thing-type-builder>
  "The cfn-thing-type-builder> function updates a CfnThingType$Builder instance using the provided configuration.
  The function takes the CfnThingType$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deprecateThingType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deprecate-thing-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-type-name` |
| `thingTypeProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:thing-type-properties` |
"
  [^CfnThingType$Builder builder id config]
  (when-some [data (lookup-entry config id :deprecate-thing-type)]
    (. builder deprecateThingType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thing-type-name)]
    (. builder thingTypeName data))
  (when-some [data (lookup-entry config id :thing-type-properties)]
    (. builder thingTypeProperties data))
  (.build builder))


(defn cfn-thing-type-builder
  "Creates a  `CfnThingType$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-thing-type-builder> (CfnThingType$Builder/create scope (name id)) id config))


(defn cfn-thing-type-props-builder>
  "The cfn-thing-type-props-builder> function updates a CfnThingTypeProps$Builder instance using the provided configuration.
  The function takes the CfnThingTypeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deprecateThingType` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deprecate-thing-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-type-name` |
| `thingTypeProperties` | software.amazon.awscdk.services.iot.CfnThingType$ThingTypePropertiesProperty | [[cdk.support/lookup-entry]] | `:thing-type-properties` |
"
  [^CfnThingTypeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :deprecate-thing-type)]
    (. builder deprecateThingType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :thing-type-name)]
    (. builder thingTypeName data))
  (when-some [data (lookup-entry config id :thing-type-properties)]
    (. builder thingTypeProperties data))
  (.build builder))


(defn cfn-thing-type-props-builder
  "Creates a  `CfnThingTypeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-thing-type-props-builder> (new CfnThingTypeProps$Builder) id config))


(defn cfn-thing-type-thing-type-properties-property-builder>
  "The cfn-thing-type-thing-type-properties-property-builder> function updates a CfnThingType$ThingTypePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnThingType$ThingTypePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `searchableAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:searchable-attributes` |
| `thingTypeDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-type-description` |
"
  [^CfnThingType$ThingTypePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :searchable-attributes)]
    (. builder searchableAttributes data))
  (when-some [data (lookup-entry config id :thing-type-description)]
    (. builder thingTypeDescription data))
  (.build builder))


(defn cfn-thing-type-thing-type-properties-property-builder
  "Creates a  `CfnThingType$ThingTypePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-thing-type-thing-type-properties-property-builder> (new CfnThingType$ThingTypePropertiesProperty$Builder) id config))


(defn cfn-topic-rule-action-property-builder>
  "The cfn-topic-rule-action-property-builder> function updates a CfnTopicRule$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudwatchAlarm` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloudwatch-alarm` |
| `cloudwatchLogs` | software.amazon.awscdk.services.iot.CfnTopicRule$CloudwatchLogsActionProperty | [[cdk.support/lookup-entry]] | `:cloudwatch-logs` |
| `cloudwatchMetric` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloudwatch-metric` |
| `dynamoDBv2` | software.amazon.awscdk.services.iot.CfnTopicRule$DynamoDBv2ActionProperty | [[cdk.support/lookup-entry]] | `:dynamo-d-bv2` |
| `dynamoDb` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dynamo-db` |
| `elasticsearch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:elasticsearch` |
| `firehose` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:firehose` |
| `http` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http` |
| `iotAnalytics` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iot-analytics` |
| `iotEvents` | software.amazon.awscdk.services.iot.CfnTopicRule$IotEventsActionProperty | [[cdk.support/lookup-entry]] | `:iot-events` |
| `iotSiteWise` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iot-site-wise` |
| `kafka` | software.amazon.awscdk.services.iot.CfnTopicRule$KafkaActionProperty | [[cdk.support/lookup-entry]] | `:kafka` |
| `kinesis` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis` |
| `lambda` | software.amazon.awscdk.services.iot.CfnTopicRule$LambdaActionProperty | [[cdk.support/lookup-entry]] | `:lambda` |
| `location` | software.amazon.awscdk.services.iot.CfnTopicRule$LocationActionProperty | [[cdk.support/lookup-entry]] | `:location` |
| `openSearch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:open-search` |
| `republish` | software.amazon.awscdk.services.iot.CfnTopicRule$RepublishActionProperty | [[cdk.support/lookup-entry]] | `:republish` |
| `s3` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3` |
| `sns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns` |
| `sqs` | software.amazon.awscdk.services.iot.CfnTopicRule$SqsActionProperty | [[cdk.support/lookup-entry]] | `:sqs` |
| `stepFunctions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:step-functions` |
| `timestream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestream` |
"
  [^CfnTopicRule$ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloudwatch-alarm)]
    (. builder cloudwatchAlarm data))
  (when-some [data (lookup-entry config id :cloudwatch-logs)]
    (. builder cloudwatchLogs data))
  (when-some [data (lookup-entry config id :cloudwatch-metric)]
    (. builder cloudwatchMetric data))
  (when-some [data (lookup-entry config id :dynamo-d-bv2)]
    (. builder dynamoDBv2 data))
  (when-some [data (lookup-entry config id :dynamo-db)]
    (. builder dynamoDb data))
  (when-some [data (lookup-entry config id :elasticsearch)]
    (. builder elasticsearch data))
  (when-some [data (lookup-entry config id :firehose)]
    (. builder firehose data))
  (when-some [data (lookup-entry config id :http)]
    (. builder http data))
  (when-some [data (lookup-entry config id :iot-analytics)]
    (. builder iotAnalytics data))
  (when-some [data (lookup-entry config id :iot-events)]
    (. builder iotEvents data))
  (when-some [data (lookup-entry config id :iot-site-wise)]
    (. builder iotSiteWise data))
  (when-some [data (lookup-entry config id :kafka)]
    (. builder kafka data))
  (when-some [data (lookup-entry config id :kinesis)]
    (. builder kinesis data))
  (when-some [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :open-search)]
    (. builder openSearch data))
  (when-some [data (lookup-entry config id :republish)]
    (. builder republish data))
  (when-some [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-some [data (lookup-entry config id :sns)]
    (. builder sns data))
  (when-some [data (lookup-entry config id :sqs)]
    (. builder sqs data))
  (when-some [data (lookup-entry config id :step-functions)]
    (. builder stepFunctions data))
  (when-some [data (lookup-entry config id :timestream)]
    (. builder timestream data))
  (.build builder))


(defn cfn-topic-rule-action-property-builder
  "Creates a  `CfnTopicRule$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-action-property-builder> (new CfnTopicRule$ActionProperty$Builder) id config))


(defn cfn-topic-rule-asset-property-timestamp-property-builder>
  "The cfn-topic-rule-asset-property-timestamp-property-builder> function updates a CfnTopicRule$AssetPropertyTimestampProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$AssetPropertyTimestampProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `offsetInNanos` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset-in-nanos` |
| `timeInSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-in-seconds` |
"
  [^CfnTopicRule$AssetPropertyTimestampProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :offset-in-nanos)]
    (. builder offsetInNanos data))
  (when-some [data (lookup-entry config id :time-in-seconds)]
    (. builder timeInSeconds data))
  (.build builder))


(defn cfn-topic-rule-asset-property-timestamp-property-builder
  "Creates a  `CfnTopicRule$AssetPropertyTimestampProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-asset-property-timestamp-property-builder> (new CfnTopicRule$AssetPropertyTimestampProperty$Builder) id config))


(defn cfn-topic-rule-asset-property-value-property-builder>
  "The cfn-topic-rule-asset-property-value-property-builder> function updates a CfnTopicRule$AssetPropertyValueProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$AssetPropertyValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `quality` | java.lang.String | [[cdk.support/lookup-entry]] | `:quality` |
| `timestamp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestamp` |
| `value` | software.amazon.awscdk.services.iot.CfnTopicRule$AssetPropertyVariantProperty | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$AssetPropertyValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :quality)]
    (. builder quality data))
  (when-some [data (lookup-entry config id :timestamp)]
    (. builder timestamp data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-topic-rule-asset-property-value-property-builder
  "Creates a  `CfnTopicRule$AssetPropertyValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-asset-property-value-property-builder> (new CfnTopicRule$AssetPropertyValueProperty$Builder) id config))


(defn cfn-topic-rule-asset-property-variant-property-builder>
  "The cfn-topic-rule-asset-property-variant-property-builder> function updates a CfnTopicRule$AssetPropertyVariantProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$AssetPropertyVariantProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:double-value` |
| `integerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:integer-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
"
  [^CfnTopicRule$AssetPropertyVariantProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :boolean-value)]
    (. builder booleanValue data))
  (when-some [data (lookup-entry config id :double-value)]
    (. builder doubleValue data))
  (when-some [data (lookup-entry config id :integer-value)]
    (. builder integerValue data))
  (when-some [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn cfn-topic-rule-asset-property-variant-property-builder
  "Creates a  `CfnTopicRule$AssetPropertyVariantProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-asset-property-variant-property-builder> (new CfnTopicRule$AssetPropertyVariantProperty$Builder) id config))


(defn cfn-topic-rule-builder>
  "The cfn-topic-rule-builder> function updates a CfnTopicRule$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topicRulePayload` | software.amazon.awscdk.services.iot.CfnTopicRule$TopicRulePayloadProperty | [[cdk.support/lookup-entry]] | `:topic-rule-payload` |
"
  [^CfnTopicRule$Builder builder id config]
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :topic-rule-payload)]
    (. builder topicRulePayload data))
  (.build builder))


(defn cfn-topic-rule-builder
  "Creates a  `CfnTopicRule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-topic-rule-builder> (CfnTopicRule$Builder/create scope (name id)) id config))


(defn cfn-topic-rule-cloudwatch-alarm-action-property-builder>
  "The cfn-topic-rule-cloudwatch-alarm-action-property-builder> function updates a CfnTopicRule$CloudwatchAlarmActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$CloudwatchAlarmActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stateReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-reason` |
| `stateValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-value` |
"
  [^CfnTopicRule$CloudwatchAlarmActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :state-reason)]
    (. builder stateReason data))
  (when-some [data (lookup-entry config id :state-value)]
    (. builder stateValue data))
  (.build builder))


(defn cfn-topic-rule-cloudwatch-alarm-action-property-builder
  "Creates a  `CfnTopicRule$CloudwatchAlarmActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-cloudwatch-alarm-action-property-builder> (new CfnTopicRule$CloudwatchAlarmActionProperty$Builder) id config))


(defn cfn-topic-rule-cloudwatch-logs-action-property-builder>
  "The cfn-topic-rule-cloudwatch-logs-action-property-builder> function updates a CfnTopicRule$CloudwatchLogsActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$CloudwatchLogsActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-mode` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTopicRule$CloudwatchLogsActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-mode)]
    (. builder batchMode data))
  (when-some [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-topic-rule-cloudwatch-logs-action-property-builder
  "Creates a  `CfnTopicRule$CloudwatchLogsActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-cloudwatch-logs-action-property-builder> (new CfnTopicRule$CloudwatchLogsActionProperty$Builder) id config))


(defn cfn-topic-rule-cloudwatch-metric-action-property-builder>
  "The cfn-topic-rule-cloudwatch-metric-action-property-builder> function updates a CfnTopicRule$CloudwatchMetricActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$CloudwatchMetricActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-namespace` |
| `metricTimestamp` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-timestamp` |
| `metricUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-unit` |
| `metricValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-value` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTopicRule$CloudwatchMetricActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :metric-namespace)]
    (. builder metricNamespace data))
  (when-some [data (lookup-entry config id :metric-timestamp)]
    (. builder metricTimestamp data))
  (when-some [data (lookup-entry config id :metric-unit)]
    (. builder metricUnit data))
  (when-some [data (lookup-entry config id :metric-value)]
    (. builder metricValue data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-topic-rule-cloudwatch-metric-action-property-builder
  "Creates a  `CfnTopicRule$CloudwatchMetricActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-cloudwatch-metric-action-property-builder> (new CfnTopicRule$CloudwatchMetricActionProperty$Builder) id config))


(defn cfn-topic-rule-destination-builder>
  "The cfn-topic-rule-destination-builder> function updates a CfnTopicRuleDestination$Builder instance using the provided configuration.
  The function takes the CfnTopicRuleDestination$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpUrlProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-url-properties` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `vpcProperties` | software.amazon.awscdk.services.iot.CfnTopicRuleDestination$VpcDestinationPropertiesProperty | [[cdk.support/lookup-entry]] | `:vpc-properties` |
"
  [^CfnTopicRuleDestination$Builder builder id config]
  (when-some [data (lookup-entry config id :http-url-properties)]
    (. builder httpUrlProperties data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :vpc-properties)]
    (. builder vpcProperties data))
  (.build builder))


(defn cfn-topic-rule-destination-builder
  "Creates a  `CfnTopicRuleDestination$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-topic-rule-destination-builder> (CfnTopicRuleDestination$Builder/create scope (name id)) id config))


(defn cfn-topic-rule-destination-http-url-destination-summary-property-builder>
  "The cfn-topic-rule-destination-http-url-destination-summary-property-builder> function updates a CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `confirmationUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:confirmation-url` |
"
  [^CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :confirmation-url)]
    (. builder confirmationUrl data))
  (.build builder))


(defn cfn-topic-rule-destination-http-url-destination-summary-property-builder
  "Creates a  `CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-destination-http-url-destination-summary-property-builder> (new CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty$Builder) id config))


(defn cfn-topic-rule-destination-props-builder>
  "The cfn-topic-rule-destination-props-builder> function updates a CfnTopicRuleDestinationProps$Builder instance using the provided configuration.
  The function takes the CfnTopicRuleDestinationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpUrlProperties` | software.amazon.awscdk.services.iot.CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty | [[cdk.support/lookup-entry]] | `:http-url-properties` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `vpcProperties` | software.amazon.awscdk.services.iot.CfnTopicRuleDestination$VpcDestinationPropertiesProperty | [[cdk.support/lookup-entry]] | `:vpc-properties` |
"
  [^CfnTopicRuleDestinationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :http-url-properties)]
    (. builder httpUrlProperties data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :vpc-properties)]
    (. builder vpcProperties data))
  (.build builder))


(defn cfn-topic-rule-destination-props-builder
  "Creates a  `CfnTopicRuleDestinationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-destination-props-builder> (new CfnTopicRuleDestinationProps$Builder) id config))


(defn cfn-topic-rule-destination-vpc-destination-properties-property-builder>
  "The cfn-topic-rule-destination-vpc-destination-properties-property-builder> function updates a CfnTopicRuleDestination$VpcDestinationPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRuleDestination$VpcDestinationPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnTopicRuleDestination$VpcDestinationPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-topic-rule-destination-vpc-destination-properties-property-builder
  "Creates a  `CfnTopicRuleDestination$VpcDestinationPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-destination-vpc-destination-properties-property-builder> (new CfnTopicRuleDestination$VpcDestinationPropertiesProperty$Builder) id config))


(defn cfn-topic-rule-dynamo-d-bv2-action-property-builder>
  "The cfn-topic-rule-dynamo-d-bv2-action-property-builder> function updates a CfnTopicRule$DynamoDBv2ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$DynamoDBv2ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `putItem` | software.amazon.awscdk.services.iot.CfnTopicRule$PutItemInputProperty | [[cdk.support/lookup-entry]] | `:put-item` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTopicRule$DynamoDBv2ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :put-item)]
    (. builder putItem data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-topic-rule-dynamo-d-bv2-action-property-builder
  "Creates a  `CfnTopicRule$DynamoDBv2ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-dynamo-d-bv2-action-property-builder> (new CfnTopicRule$DynamoDBv2ActionProperty$Builder) id config))


(defn cfn-topic-rule-dynamo-db-action-property-builder>
  "The cfn-topic-rule-dynamo-db-action-property-builder> function updates a CfnTopicRule$DynamoDBActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$DynamoDBActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hashKeyField` | java.lang.String | [[cdk.support/lookup-entry]] | `:hash-key-field` |
| `hashKeyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:hash-key-type` |
| `hashKeyValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:hash-key-value` |
| `payloadField` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-field` |
| `rangeKeyField` | java.lang.String | [[cdk.support/lookup-entry]] | `:range-key-field` |
| `rangeKeyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:range-key-type` |
| `rangeKeyValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:range-key-value` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnTopicRule$DynamoDBActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :hash-key-field)]
    (. builder hashKeyField data))
  (when-some [data (lookup-entry config id :hash-key-type)]
    (. builder hashKeyType data))
  (when-some [data (lookup-entry config id :hash-key-value)]
    (. builder hashKeyValue data))
  (when-some [data (lookup-entry config id :payload-field)]
    (. builder payloadField data))
  (when-some [data (lookup-entry config id :range-key-field)]
    (. builder rangeKeyField data))
  (when-some [data (lookup-entry config id :range-key-type)]
    (. builder rangeKeyType data))
  (when-some [data (lookup-entry config id :range-key-value)]
    (. builder rangeKeyValue data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-topic-rule-dynamo-db-action-property-builder
  "Creates a  `CfnTopicRule$DynamoDBActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-dynamo-db-action-property-builder> (new CfnTopicRule$DynamoDBActionProperty$Builder) id config))


(defn cfn-topic-rule-elasticsearch-action-property-builder>
  "The cfn-topic-rule-elasticsearch-action-property-builder> function updates a CfnTopicRule$ElasticsearchActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$ElasticsearchActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `index` | java.lang.String | [[cdk.support/lookup-entry]] | `:index` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTopicRule$ElasticsearchActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :index)]
    (. builder index data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-topic-rule-elasticsearch-action-property-builder
  "Creates a  `CfnTopicRule$ElasticsearchActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-elasticsearch-action-property-builder> (new CfnTopicRule$ElasticsearchActionProperty$Builder) id config))


(defn cfn-topic-rule-firehose-action-property-builder>
  "The cfn-topic-rule-firehose-action-property-builder> function updates a CfnTopicRule$FirehoseActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$FirehoseActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-mode` |
| `deliveryStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `separator` | java.lang.String | [[cdk.support/lookup-entry]] | `:separator` |
"
  [^CfnTopicRule$FirehoseActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-mode)]
    (. builder batchMode data))
  (when-some [data (lookup-entry config id :delivery-stream-name)]
    (. builder deliveryStreamName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :separator)]
    (. builder separator data))
  (.build builder))


(defn cfn-topic-rule-firehose-action-property-builder
  "Creates a  `CfnTopicRule$FirehoseActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-firehose-action-property-builder> (new CfnTopicRule$FirehoseActionProperty$Builder) id config))


(defn cfn-topic-rule-http-action-header-property-builder>
  "The cfn-topic-rule-http-action-header-property-builder> function updates a CfnTopicRule$HttpActionHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$HttpActionHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$HttpActionHeaderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-topic-rule-http-action-header-property-builder
  "Creates a  `CfnTopicRule$HttpActionHeaderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-http-action-header-property-builder> (new CfnTopicRule$HttpActionHeaderProperty$Builder) id config))


(defn cfn-topic-rule-http-action-property-builder>
  "The cfn-topic-rule-http-action-property-builder> function updates a CfnTopicRule$HttpActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$HttpActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `confirmationUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:confirmation-url` |
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnTopicRule$HttpActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auth)]
    (. builder auth data))
  (when-some [data (lookup-entry config id :confirmation-url)]
    (. builder confirmationUrl data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-some [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn cfn-topic-rule-http-action-property-builder
  "Creates a  `CfnTopicRule$HttpActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-http-action-property-builder> (new CfnTopicRule$HttpActionProperty$Builder) id config))


(defn cfn-topic-rule-http-authorization-property-builder>
  "The cfn-topic-rule-http-authorization-property-builder> function updates a CfnTopicRule$HttpAuthorizationProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$HttpAuthorizationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sigv4` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sigv4` |
"
  [^CfnTopicRule$HttpAuthorizationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :sigv4)]
    (. builder sigv4 data))
  (.build builder))


(defn cfn-topic-rule-http-authorization-property-builder
  "Creates a  `CfnTopicRule$HttpAuthorizationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-http-authorization-property-builder> (new CfnTopicRule$HttpAuthorizationProperty$Builder) id config))


(defn cfn-topic-rule-iot-analytics-action-property-builder>
  "The cfn-topic-rule-iot-analytics-action-property-builder> function updates a CfnTopicRule$IotAnalyticsActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$IotAnalyticsActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-mode` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTopicRule$IotAnalyticsActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-mode)]
    (. builder batchMode data))
  (when-some [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-topic-rule-iot-analytics-action-property-builder
  "Creates a  `CfnTopicRule$IotAnalyticsActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-iot-analytics-action-property-builder> (new CfnTopicRule$IotAnalyticsActionProperty$Builder) id config))


(defn cfn-topic-rule-iot-events-action-property-builder>
  "The cfn-topic-rule-iot-events-action-property-builder> function updates a CfnTopicRule$IotEventsActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$IotEventsActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-mode` |
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `messageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTopicRule$IotEventsActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :batch-mode)]
    (. builder batchMode data))
  (when-some [data (lookup-entry config id :input-name)]
    (. builder inputName data))
  (when-some [data (lookup-entry config id :message-id)]
    (. builder messageId data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-topic-rule-iot-events-action-property-builder
  "Creates a  `CfnTopicRule$IotEventsActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-iot-events-action-property-builder> (new CfnTopicRule$IotEventsActionProperty$Builder) id config))


(defn cfn-topic-rule-iot-site-wise-action-property-builder>
  "The cfn-topic-rule-iot-site-wise-action-property-builder> function updates a CfnTopicRule$IotSiteWiseActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$IotSiteWiseActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `putAssetPropertyValueEntries` | java.util.List | [[cdk.support/lookup-entry]] | `:put-asset-property-value-entries` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTopicRule$IotSiteWiseActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :put-asset-property-value-entries)]
    (. builder putAssetPropertyValueEntries data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-topic-rule-iot-site-wise-action-property-builder
  "Creates a  `CfnTopicRule$IotSiteWiseActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-iot-site-wise-action-property-builder> (new CfnTopicRule$IotSiteWiseActionProperty$Builder) id config))


(defn cfn-topic-rule-kafka-action-header-property-builder>
  "The cfn-topic-rule-kafka-action-header-property-builder> function updates a CfnTopicRule$KafkaActionHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$KafkaActionHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$KafkaActionHeaderProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-topic-rule-kafka-action-header-property-builder
  "Creates a  `CfnTopicRule$KafkaActionHeaderProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-kafka-action-header-property-builder> (new CfnTopicRule$KafkaActionHeaderProperty$Builder) id config))


(defn cfn-topic-rule-kafka-action-property-builder>
  "The cfn-topic-rule-kafka-action-property-builder> function updates a CfnTopicRule$KafkaActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$KafkaActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-properties` |
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `headers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:headers` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `partition` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition` |
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^CfnTopicRule$KafkaActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :client-properties)]
    (. builder clientProperties data))
  (when-some [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :partition)]
    (. builder partition data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn cfn-topic-rule-kafka-action-property-builder
  "Creates a  `CfnTopicRule$KafkaActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-kafka-action-property-builder> (new CfnTopicRule$KafkaActionProperty$Builder) id config))


(defn cfn-topic-rule-kinesis-action-property-builder>
  "The cfn-topic-rule-kinesis-action-property-builder> function updates a CfnTopicRule$KinesisActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$KinesisActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |
"
  [^CfnTopicRule$KinesisActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :partition-key)]
    (. builder partitionKey data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (.build builder))


(defn cfn-topic-rule-kinesis-action-property-builder
  "Creates a  `CfnTopicRule$KinesisActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-kinesis-action-property-builder> (new CfnTopicRule$KinesisActionProperty$Builder) id config))


(defn cfn-topic-rule-lambda-action-property-builder>
  "The cfn-topic-rule-lambda-action-property-builder> function updates a CfnTopicRule$LambdaActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$LambdaActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
"
  [^CfnTopicRule$LambdaActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (.build builder))


(defn cfn-topic-rule-lambda-action-property-builder
  "Creates a  `CfnTopicRule$LambdaActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-lambda-action-property-builder> (new CfnTopicRule$LambdaActionProperty$Builder) id config))


(defn cfn-topic-rule-location-action-property-builder>
  "The cfn-topic-rule-location-action-property-builder> function updates a CfnTopicRule$LocationActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$LocationActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `latitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:longitude` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `timestamp` | software.amazon.awscdk.services.iot.CfnTopicRule$TimestampProperty | [[cdk.support/lookup-entry]] | `:timestamp` |
| `trackerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracker-name` |
"
  [^CfnTopicRule$LocationActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :device-id)]
    (. builder deviceId data))
  (when-some [data (lookup-entry config id :latitude)]
    (. builder latitude data))
  (when-some [data (lookup-entry config id :longitude)]
    (. builder longitude data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :timestamp)]
    (. builder timestamp data))
  (when-some [data (lookup-entry config id :tracker-name)]
    (. builder trackerName data))
  (.build builder))


(defn cfn-topic-rule-location-action-property-builder
  "Creates a  `CfnTopicRule$LocationActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-location-action-property-builder> (new CfnTopicRule$LocationActionProperty$Builder) id config))


(defn cfn-topic-rule-open-search-action-property-builder>
  "The cfn-topic-rule-open-search-action-property-builder> function updates a CfnTopicRule$OpenSearchActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$OpenSearchActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `index` | java.lang.String | [[cdk.support/lookup-entry]] | `:index` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTopicRule$OpenSearchActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :index)]
    (. builder index data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-topic-rule-open-search-action-property-builder
  "Creates a  `CfnTopicRule$OpenSearchActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-open-search-action-property-builder> (new CfnTopicRule$OpenSearchActionProperty$Builder) id config))


(defn cfn-topic-rule-props-builder>
  "The cfn-topic-rule-props-builder> function updates a CfnTopicRuleProps$Builder instance using the provided configuration.
  The function takes the CfnTopicRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topicRulePayload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:topic-rule-payload` |
"
  [^CfnTopicRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :topic-rule-payload)]
    (. builder topicRulePayload data))
  (.build builder))


(defn cfn-topic-rule-props-builder
  "Creates a  `CfnTopicRuleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-props-builder> (new CfnTopicRuleProps$Builder) id config))


(defn cfn-topic-rule-put-asset-property-value-entry-property-builder>
  "The cfn-topic-rule-put-asset-property-value-entry-property-builder> function updates a CfnTopicRule$PutAssetPropertyValueEntryProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$PutAssetPropertyValueEntryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-id` |
| `entryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry-id` |
| `propertyAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-alias` |
| `propertyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-id` |
| `propertyValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-values` |
"
  [^CfnTopicRule$PutAssetPropertyValueEntryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :asset-id)]
    (. builder assetId data))
  (when-some [data (lookup-entry config id :entry-id)]
    (. builder entryId data))
  (when-some [data (lookup-entry config id :property-alias)]
    (. builder propertyAlias data))
  (when-some [data (lookup-entry config id :property-id)]
    (. builder propertyId data))
  (when-some [data (lookup-entry config id :property-values)]
    (. builder propertyValues data))
  (.build builder))


(defn cfn-topic-rule-put-asset-property-value-entry-property-builder
  "Creates a  `CfnTopicRule$PutAssetPropertyValueEntryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-put-asset-property-value-entry-property-builder> (new CfnTopicRule$PutAssetPropertyValueEntryProperty$Builder) id config))


(defn cfn-topic-rule-put-item-input-property-builder>
  "The cfn-topic-rule-put-item-input-property-builder> function updates a CfnTopicRule$PutItemInputProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$PutItemInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnTopicRule$PutItemInputProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn cfn-topic-rule-put-item-input-property-builder
  "Creates a  `CfnTopicRule$PutItemInputProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-put-item-input-property-builder> (new CfnTopicRule$PutItemInputProperty$Builder) id config))


(defn cfn-topic-rule-republish-action-headers-property-builder>
  "The cfn-topic-rule-republish-action-headers-property-builder> function updates a CfnTopicRule$RepublishActionHeadersProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$RepublishActionHeadersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `correlationData` | java.lang.String | [[cdk.support/lookup-entry]] | `:correlation-data` |
| `messageExpiry` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-expiry` |
| `payloadFormatIndicator` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-format-indicator` |
| `responseTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-topic` |
| `userProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:user-properties` |
"
  [^CfnTopicRule$RepublishActionHeadersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (lookup-entry config id :correlation-data)]
    (. builder correlationData data))
  (when-some [data (lookup-entry config id :message-expiry)]
    (. builder messageExpiry data))
  (when-some [data (lookup-entry config id :payload-format-indicator)]
    (. builder payloadFormatIndicator data))
  (when-some [data (lookup-entry config id :response-topic)]
    (. builder responseTopic data))
  (when-some [data (lookup-entry config id :user-properties)]
    (. builder userProperties data))
  (.build builder))


(defn cfn-topic-rule-republish-action-headers-property-builder
  "Creates a  `CfnTopicRule$RepublishActionHeadersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-republish-action-headers-property-builder> (new CfnTopicRule$RepublishActionHeadersProperty$Builder) id config))


(defn cfn-topic-rule-republish-action-property-builder>
  "The cfn-topic-rule-republish-action-property-builder> function updates a CfnTopicRule$RepublishActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$RepublishActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headers` | software.amazon.awscdk.services.iot.CfnTopicRule$RepublishActionHeadersProperty | [[cdk.support/lookup-entry]] | `:headers` |
| `qos` | java.lang.Number | [[cdk.support/lookup-entry]] | `:qos` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |
"
  [^CfnTopicRule$RepublishActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-some [data (lookup-entry config id :qos)]
    (. builder qos data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn cfn-topic-rule-republish-action-property-builder
  "Creates a  `CfnTopicRule$RepublishActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-republish-action-property-builder> (new CfnTopicRule$RepublishActionProperty$Builder) id config))


(defn cfn-topic-rule-s3-action-property-builder>
  "The cfn-topic-rule-s3-action-property-builder> function updates a CfnTopicRule$S3ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$S3ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `cannedAcl` | java.lang.String | [[cdk.support/lookup-entry]] | `:canned-acl` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTopicRule$S3ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :canned-acl)]
    (. builder cannedAcl data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-topic-rule-s3-action-property-builder
  "Creates a  `CfnTopicRule$S3ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-s3-action-property-builder> (new CfnTopicRule$S3ActionProperty$Builder) id config))


(defn cfn-topic-rule-sig-v4-authorization-property-builder>
  "The cfn-topic-rule-sig-v4-authorization-property-builder> function updates a CfnTopicRule$SigV4AuthorizationProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$SigV4AuthorizationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `signingRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-region` |
"
  [^CfnTopicRule$SigV4AuthorizationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :signing-region)]
    (. builder signingRegion data))
  (.build builder))


(defn cfn-topic-rule-sig-v4-authorization-property-builder
  "Creates a  `CfnTopicRule$SigV4AuthorizationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-sig-v4-authorization-property-builder> (new CfnTopicRule$SigV4AuthorizationProperty$Builder) id config))


(defn cfn-topic-rule-sns-action-property-builder>
  "The cfn-topic-rule-sns-action-property-builder> function updates a CfnTopicRule$SnsActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$SnsActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-format` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnTopicRule$SnsActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :message-format)]
    (. builder messageFormat data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn cfn-topic-rule-sns-action-property-builder
  "Creates a  `CfnTopicRule$SnsActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-sns-action-property-builder> (new CfnTopicRule$SnsActionProperty$Builder) id config))


(defn cfn-topic-rule-sqs-action-property-builder>
  "The cfn-topic-rule-sqs-action-property-builder> function updates a CfnTopicRule$SqsActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$SqsActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queueUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-url` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `useBase64` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-base64` |
"
  [^CfnTopicRule$SqsActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :queue-url)]
    (. builder queueUrl data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :use-base64)]
    (. builder useBase64 data))
  (.build builder))


(defn cfn-topic-rule-sqs-action-property-builder
  "Creates a  `CfnTopicRule$SqsActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-sqs-action-property-builder> (new CfnTopicRule$SqsActionProperty$Builder) id config))


(defn cfn-topic-rule-step-functions-action-property-builder>
  "The cfn-topic-rule-step-functions-action-property-builder> function updates a CfnTopicRule$StepFunctionsActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$StepFunctionsActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionNamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-name-prefix` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stateMachineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-name` |
"
  [^CfnTopicRule$StepFunctionsActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :execution-name-prefix)]
    (. builder executionNamePrefix data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :state-machine-name)]
    (. builder stateMachineName data))
  (.build builder))


(defn cfn-topic-rule-step-functions-action-property-builder
  "Creates a  `CfnTopicRule$StepFunctionsActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-step-functions-action-property-builder> (new CfnTopicRule$StepFunctionsActionProperty$Builder) id config))


(defn cfn-topic-rule-timestamp-property-builder>
  "The cfn-topic-rule-timestamp-property-builder> function updates a CfnTopicRule$TimestampProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$TimestampProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$TimestampProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-topic-rule-timestamp-property-builder
  "Creates a  `CfnTopicRule$TimestampProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-timestamp-property-builder> (new CfnTopicRule$TimestampProperty$Builder) id config))


(defn cfn-topic-rule-timestream-action-property-builder>
  "The cfn-topic-rule-timestream-action-property-builder> function updates a CfnTopicRule$TimestreamActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$TimestreamActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `timestamp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestamp` |
"
  [^CfnTopicRule$TimestreamActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-some [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-some [data (lookup-entry config id :timestamp)]
    (. builder timestamp data))
  (.build builder))


(defn cfn-topic-rule-timestream-action-property-builder
  "Creates a  `CfnTopicRule$TimestreamActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-timestream-action-property-builder> (new CfnTopicRule$TimestreamActionProperty$Builder) id config))


(defn cfn-topic-rule-timestream-dimension-property-builder>
  "The cfn-topic-rule-timestream-dimension-property-builder> function updates a CfnTopicRule$TimestreamDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$TimestreamDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$TimestreamDimensionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-topic-rule-timestream-dimension-property-builder
  "Creates a  `CfnTopicRule$TimestreamDimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-timestream-dimension-property-builder> (new CfnTopicRule$TimestreamDimensionProperty$Builder) id config))


(defn cfn-topic-rule-timestream-timestamp-property-builder>
  "The cfn-topic-rule-timestream-timestamp-property-builder> function updates a CfnTopicRule$TimestreamTimestampProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$TimestreamTimestampProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$TimestreamTimestampProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-topic-rule-timestream-timestamp-property-builder
  "Creates a  `CfnTopicRule$TimestreamTimestampProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-timestream-timestamp-property-builder> (new CfnTopicRule$TimestreamTimestampProperty$Builder) id config))


(defn cfn-topic-rule-topic-rule-payload-property-builder>
  "The cfn-topic-rule-topic-rule-payload-property-builder> function updates a CfnTopicRule$TopicRulePayloadProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$TopicRulePayloadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `awsIotSqlVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-iot-sql-version` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `errorAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-action` |
| `ruleDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rule-disabled` |
| `sql` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql` |
"
  [^CfnTopicRule$TopicRulePayloadProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :aws-iot-sql-version)]
    (. builder awsIotSqlVersion data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :error-action)]
    (. builder errorAction data))
  (when-some [data (lookup-entry config id :rule-disabled)]
    (. builder ruleDisabled data))
  (when-some [data (lookup-entry config id :sql)]
    (. builder sql data))
  (.build builder))


(defn cfn-topic-rule-topic-rule-payload-property-builder
  "Creates a  `CfnTopicRule$TopicRulePayloadProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-topic-rule-payload-property-builder> (new CfnTopicRule$TopicRulePayloadProperty$Builder) id config))


(defn cfn-topic-rule-user-property-property-builder>
  "The cfn-topic-rule-user-property-property-builder> function updates a CfnTopicRule$UserPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$UserPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$UserPropertyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-topic-rule-user-property-property-builder
  "Creates a  `CfnTopicRule$UserPropertyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-topic-rule-user-property-property-builder> (new CfnTopicRule$UserPropertyProperty$Builder) id config))