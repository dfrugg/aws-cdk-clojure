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


(defn build-cfn-account-audit-configuration-audit-check-configuration-property-builder
  "The build-cfn-account-audit-configuration-audit-check-configuration-property-builder function updates a CfnAccountAuditConfiguration$AuditCheckConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnAccountAuditConfiguration$AuditCheckConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnAccountAuditConfiguration$AuditCheckConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn build-cfn-account-audit-configuration-audit-check-configurations-property-builder
  "The build-cfn-account-audit-configuration-audit-check-configurations-property-builder function updates a CfnAccountAuditConfiguration$AuditCheckConfigurationsProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :authenticated-cognito-role-overly-permissive-check)]
    (. builder authenticatedCognitoRoleOverlyPermissiveCheck data))
  (when-let [data (lookup-entry config id :ca-certificate-expiring-check)]
    (. builder caCertificateExpiringCheck data))
  (when-let [data (lookup-entry config id :ca-certificate-key-quality-check)]
    (. builder caCertificateKeyQualityCheck data))
  (when-let [data (lookup-entry config id :conflicting-client-ids-check)]
    (. builder conflictingClientIdsCheck data))
  (when-let [data (lookup-entry config id :device-certificate-expiring-check)]
    (. builder deviceCertificateExpiringCheck data))
  (when-let [data (lookup-entry config id :device-certificate-key-quality-check)]
    (. builder deviceCertificateKeyQualityCheck data))
  (when-let [data (lookup-entry config id :device-certificate-shared-check)]
    (. builder deviceCertificateSharedCheck data))
  (when-let [data (lookup-entry config id :intermediate-ca-revoked-for-active-device-certificates-check)]
    (. builder intermediateCaRevokedForActiveDeviceCertificatesCheck data))
  (when-let [data (lookup-entry config id :io-t-policy-potential-mis-configuration-check)]
    (. builder ioTPolicyPotentialMisConfigurationCheck data))
  (when-let [data (lookup-entry config id :iot-policy-overly-permissive-check)]
    (. builder iotPolicyOverlyPermissiveCheck data))
  (when-let [data (lookup-entry config id :iot-role-alias-allows-access-to-unused-services-check)]
    (. builder iotRoleAliasAllowsAccessToUnusedServicesCheck data))
  (when-let [data (lookup-entry config id :iot-role-alias-overly-permissive-check)]
    (. builder iotRoleAliasOverlyPermissiveCheck data))
  (when-let [data (lookup-entry config id :logging-disabled-check)]
    (. builder loggingDisabledCheck data))
  (when-let [data (lookup-entry config id :revoked-ca-certificate-still-active-check)]
    (. builder revokedCaCertificateStillActiveCheck data))
  (when-let [data (lookup-entry config id :revoked-device-certificate-still-active-check)]
    (. builder revokedDeviceCertificateStillActiveCheck data))
  (when-let [data (lookup-entry config id :unauthenticated-cognito-role-overly-permissive-check)]
    (. builder unauthenticatedCognitoRoleOverlyPermissiveCheck data))
  (.build builder))


(defn build-cfn-account-audit-configuration-audit-notification-target-configurations-property-builder
  "The build-cfn-account-audit-configuration-audit-notification-target-configurations-property-builder function updates a CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty$Builder instance using the provided configuration.
  The function takes the CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns` |
"
  [^CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sns)]
    (. builder sns data))
  (.build builder))


(defn build-cfn-account-audit-configuration-audit-notification-target-property-builder
  "The build-cfn-account-audit-configuration-audit-notification-target-property-builder function updates a CfnAccountAuditConfiguration$AuditNotificationTargetProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn build-cfn-account-audit-configuration-builder
  "The build-cfn-account-audit-configuration-builder function updates a CfnAccountAuditConfiguration$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-let [data (lookup-entry config id :audit-check-configurations)]
    (. builder auditCheckConfigurations data))
  (when-let [data (lookup-entry config id :audit-notification-target-configurations)]
    (. builder auditNotificationTargetConfigurations data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-account-audit-configuration-props-builder
  "The build-cfn-account-audit-configuration-props-builder function updates a CfnAccountAuditConfigurationProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-let [data (lookup-entry config id :audit-check-configurations)]
    (. builder auditCheckConfigurations data))
  (when-let [data (lookup-entry config id :audit-notification-target-configurations)]
    (. builder auditNotificationTargetConfigurations data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-authorizer-builder
  "The build-cfn-authorizer-builder function updates a CfnAuthorizer$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :authorizer-function-arn)]
    (. builder authorizerFunctionArn data))
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :enable-caching-for-http)]
    (. builder enableCachingForHttp data))
  (when-let [data (lookup-entry config id :signing-disabled)]
    (. builder signingDisabled data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :token-key-name)]
    (. builder tokenKeyName data))
  (when-let [data (lookup-entry config id :token-signing-public-keys)]
    (. builder tokenSigningPublicKeys data))
  (.build builder))


(defn build-cfn-authorizer-props-builder
  "The build-cfn-authorizer-props-builder function updates a CfnAuthorizerProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :authorizer-function-arn)]
    (. builder authorizerFunctionArn data))
  (when-let [data (lookup-entry config id :authorizer-name)]
    (. builder authorizerName data))
  (when-let [data (lookup-entry config id :enable-caching-for-http)]
    (. builder enableCachingForHttp data))
  (when-let [data (lookup-entry config id :signing-disabled)]
    (. builder signingDisabled data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :token-key-name)]
    (. builder tokenKeyName data))
  (when-let [data (lookup-entry config id :token-signing-public-keys)]
    (. builder tokenSigningPublicKeys data))
  (.build builder))


(defn build-cfn-billing-group-billing-group-properties-property-builder
  "The build-cfn-billing-group-billing-group-properties-property-builder function updates a CfnBillingGroup$BillingGroupPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnBillingGroup$BillingGroupPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-group-description` |
"
  [^CfnBillingGroup$BillingGroupPropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :billing-group-description)]
    (. builder billingGroupDescription data))
  (.build builder))


(defn build-cfn-billing-group-builder
  "The build-cfn-billing-group-builder function updates a CfnBillingGroup$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :billing-group-name)]
    (. builder billingGroupName data))
  (when-let [data (lookup-entry config id :billing-group-properties)]
    (. builder billingGroupProperties data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-billing-group-props-builder
  "The build-cfn-billing-group-props-builder function updates a CfnBillingGroupProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :billing-group-name)]
    (. builder billingGroupName data))
  (when-let [data (lookup-entry config id :billing-group-properties)]
    (. builder billingGroupProperties data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-ca-certificate-builder
  "The build-cfn-ca-certificate-builder function updates a CfnCACertificate$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :auto-registration-status)]
    (. builder autoRegistrationStatus data))
  (when-let [data (lookup-entry config id :ca-certificate-pem)]
    (. builder caCertificatePem data))
  (when-let [data (lookup-entry config id :certificate-mode)]
    (. builder certificateMode data))
  (when-let [data (lookup-entry config id :registration-config)]
    (. builder registrationConfig data))
  (when-let [data (lookup-entry config id :remove-auto-registration)]
    (. builder removeAutoRegistration data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :verification-certificate-pem)]
    (. builder verificationCertificatePem data))
  (.build builder))


(defn build-cfn-ca-certificate-props-builder
  "The build-cfn-ca-certificate-props-builder function updates a CfnCACertificateProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :auto-registration-status)]
    (. builder autoRegistrationStatus data))
  (when-let [data (lookup-entry config id :ca-certificate-pem)]
    (. builder caCertificatePem data))
  (when-let [data (lookup-entry config id :certificate-mode)]
    (. builder certificateMode data))
  (when-let [data (lookup-entry config id :registration-config)]
    (. builder registrationConfig data))
  (when-let [data (lookup-entry config id :remove-auto-registration)]
    (. builder removeAutoRegistration data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :verification-certificate-pem)]
    (. builder verificationCertificatePem data))
  (.build builder))


(defn build-cfn-ca-certificate-registration-config-property-builder
  "The build-cfn-ca-certificate-registration-config-property-builder function updates a CfnCACertificate$RegistrationConfigProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :template-body)]
    (. builder templateBody data))
  (when-let [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (.build builder))


(defn build-cfn-certificate-builder
  "The build-cfn-certificate-builder function updates a CfnCertificate$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :ca-certificate-pem)]
    (. builder caCertificatePem data))
  (when-let [data (lookup-entry config id :certificate-mode)]
    (. builder certificateMode data))
  (when-let [data (lookup-entry config id :certificate-pem)]
    (. builder certificatePem data))
  (when-let [data (lookup-entry config id :certificate-signing-request)]
    (. builder certificateSigningRequest data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-certificate-props-builder
  "The build-cfn-certificate-props-builder function updates a CfnCertificateProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :ca-certificate-pem)]
    (. builder caCertificatePem data))
  (when-let [data (lookup-entry config id :certificate-mode)]
    (. builder certificateMode data))
  (when-let [data (lookup-entry config id :certificate-pem)]
    (. builder certificatePem data))
  (when-let [data (lookup-entry config id :certificate-signing-request)]
    (. builder certificateSigningRequest data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn build-cfn-certificate-provider-builder
  "The build-cfn-certificate-provider-builder function updates a CfnCertificateProvider$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :account-default-for-operations)]
    (. builder accountDefaultForOperations data))
  (when-let [data (lookup-entry config id :certificate-provider-name)]
    (. builder certificateProviderName data))
  (when-let [data (lookup-entry config id :lambda-function-arn)]
    (. builder lambdaFunctionArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-certificate-provider-props-builder
  "The build-cfn-certificate-provider-props-builder function updates a CfnCertificateProviderProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :account-default-for-operations)]
    (. builder accountDefaultForOperations data))
  (when-let [data (lookup-entry config id :certificate-provider-name)]
    (. builder certificateProviderName data))
  (when-let [data (lookup-entry config id :lambda-function-arn)]
    (. builder lambdaFunctionArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-custom-metric-builder
  "The build-cfn-custom-metric-builder function updates a CfnCustomMetric$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :metric-type)]
    (. builder metricType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-custom-metric-props-builder
  "The build-cfn-custom-metric-props-builder function updates a CfnCustomMetricProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :metric-type)]
    (. builder metricType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-dimension-builder
  "The build-cfn-dimension-builder function updates a CfnDimension$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :string-values)]
    (. builder stringValues data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-dimension-props-builder
  "The build-cfn-dimension-props-builder function updates a CfnDimensionProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :string-values)]
    (. builder stringValues data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-domain-configuration-authorizer-config-property-builder
  "The build-cfn-domain-configuration-authorizer-config-property-builder function updates a CfnDomainConfiguration$AuthorizerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomainConfiguration$AuthorizerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAuthorizerOverride` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-authorizer-override` |
| `defaultAuthorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authorizer-name` |
"
  [^CfnDomainConfiguration$AuthorizerConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-authorizer-override)]
    (. builder allowAuthorizerOverride data))
  (when-let [data (lookup-entry config id :default-authorizer-name)]
    (. builder defaultAuthorizerName data))
  (.build builder))


(defn build-cfn-domain-configuration-builder
  "The build-cfn-domain-configuration-builder function updates a CfnDomainConfiguration$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :authorizer-config)]
    (. builder authorizerConfig data))
  (when-let [data (lookup-entry config id :domain-configuration-name)]
    (. builder domainConfigurationName data))
  (when-let [data (lookup-entry config id :domain-configuration-status)]
    (. builder domainConfigurationStatus data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :server-certificate-arns)]
    (. builder serverCertificateArns data))
  (when-let [data (lookup-entry config id :server-certificate-config)]
    (. builder serverCertificateConfig data))
  (when-let [data (lookup-entry config id :service-type)]
    (. builder serviceType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :tls-config)]
    (. builder tlsConfig data))
  (when-let [data (lookup-entry config id :validation-certificate-arn)]
    (. builder validationCertificateArn data))
  (.build builder))


(defn build-cfn-domain-configuration-props-builder
  "The build-cfn-domain-configuration-props-builder function updates a CfnDomainConfigurationProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :authorizer-config)]
    (. builder authorizerConfig data))
  (when-let [data (lookup-entry config id :domain-configuration-name)]
    (. builder domainConfigurationName data))
  (when-let [data (lookup-entry config id :domain-configuration-status)]
    (. builder domainConfigurationStatus data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :server-certificate-arns)]
    (. builder serverCertificateArns data))
  (when-let [data (lookup-entry config id :server-certificate-config)]
    (. builder serverCertificateConfig data))
  (when-let [data (lookup-entry config id :service-type)]
    (. builder serviceType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :tls-config)]
    (. builder tlsConfig data))
  (when-let [data (lookup-entry config id :validation-certificate-arn)]
    (. builder validationCertificateArn data))
  (.build builder))


(defn build-cfn-domain-configuration-server-certificate-config-property-builder
  "The build-cfn-domain-configuration-server-certificate-config-property-builder function updates a CfnDomainConfiguration$ServerCertificateConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomainConfiguration$ServerCertificateConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableOcspCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-ocsp-check` |
"
  [^CfnDomainConfiguration$ServerCertificateConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-ocsp-check)]
    (. builder enableOcspCheck data))
  (.build builder))


(defn build-cfn-domain-configuration-server-certificate-summary-property-builder
  "The build-cfn-domain-configuration-server-certificate-summary-property-builder function updates a CfnDomainConfiguration$ServerCertificateSummaryProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :server-certificate-arn)]
    (. builder serverCertificateArn data))
  (when-let [data (lookup-entry config id :server-certificate-status)]
    (. builder serverCertificateStatus data))
  (when-let [data (lookup-entry config id :server-certificate-status-detail)]
    (. builder serverCertificateStatusDetail data))
  (.build builder))


(defn build-cfn-domain-configuration-tls-config-property-builder
  "The build-cfn-domain-configuration-tls-config-property-builder function updates a CfnDomainConfiguration$TlsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomainConfiguration$TlsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |
"
  [^CfnDomainConfiguration$TlsConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-policy)]
    (. builder securityPolicy data))
  (.build builder))


(defn build-cfn-fleet-metric-aggregation-type-property-builder
  "The build-cfn-fleet-metric-aggregation-type-property-builder function updates a CfnFleetMetric$AggregationTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnFleetMetric$AggregationTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnFleetMetric$AggregationTypeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn build-cfn-fleet-metric-builder
  "The build-cfn-fleet-metric-builder function updates a CfnFleetMetric$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :aggregation-field)]
    (. builder aggregationField data))
  (when-let [data (lookup-entry config id :aggregation-type)]
    (. builder aggregationType data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :index-name)]
    (. builder indexName data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :period)]
    (. builder period data))
  (when-let [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-let [data (lookup-entry config id :query-version)]
    (. builder queryVersion data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn build-cfn-fleet-metric-props-builder
  "The build-cfn-fleet-metric-props-builder function updates a CfnFleetMetricProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :aggregation-field)]
    (. builder aggregationField data))
  (when-let [data (lookup-entry config id :aggregation-type)]
    (. builder aggregationType data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :index-name)]
    (. builder indexName data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :period)]
    (. builder period data))
  (when-let [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-let [data (lookup-entry config id :query-version)]
    (. builder queryVersion data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn build-cfn-job-template-abort-config-property-builder
  "The build-cfn-job-template-abort-config-property-builder function updates a CfnJobTemplate$AbortConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$AbortConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criteriaList` | java.util.List | [[cdk.support/lookup-entry]] | `:criteria-list` |
"
  [^CfnJobTemplate$AbortConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :criteria-list)]
    (. builder criteriaList data))
  (.build builder))


(defn build-cfn-job-template-abort-criteria-property-builder
  "The build-cfn-job-template-abort-criteria-property-builder function updates a CfnJobTemplate$AbortCriteriaProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :failure-type)]
    (. builder failureType data))
  (when-let [data (lookup-entry config id :min-number-of-executed-things)]
    (. builder minNumberOfExecutedThings data))
  (when-let [data (lookup-entry config id :threshold-percentage)]
    (. builder thresholdPercentage data))
  (.build builder))


(defn build-cfn-job-template-builder
  "The build-cfn-job-template-builder function updates a CfnJobTemplate$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :abort-config)]
    (. builder abortConfig data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :destination-package-versions)]
    (. builder destinationPackageVersions data))
  (when-let [data (lookup-entry config id :document)]
    (. builder document data))
  (when-let [data (lookup-entry config id :document-source)]
    (. builder documentSource data))
  (when-let [data (lookup-entry config id :job-arn)]
    (. builder jobArn data))
  (when-let [data (lookup-entry config id :job-executions-retry-config)]
    (. builder jobExecutionsRetryConfig data))
  (when-let [data (lookup-entry config id :job-executions-rollout-config)]
    (. builder jobExecutionsRolloutConfig data))
  (when-let [data (lookup-entry config id :job-template-id)]
    (. builder jobTemplateId data))
  (when-let [data (lookup-entry config id :maintenance-windows)]
    (. builder maintenanceWindows data))
  (when-let [data (lookup-entry config id :presigned-url-config)]
    (. builder presignedUrlConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :timeout-config)]
    (. builder timeoutConfig data))
  (.build builder))


(defn build-cfn-job-template-exponential-rollout-rate-property-builder
  "The build-cfn-job-template-exponential-rollout-rate-property-builder function updates a CfnJobTemplate$ExponentialRolloutRateProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :base-rate-per-minute)]
    (. builder baseRatePerMinute data))
  (when-let [data (lookup-entry config id :increment-factor)]
    (. builder incrementFactor data))
  (when-let [data (lookup-entry config id :rate-increase-criteria)]
    (. builder rateIncreaseCriteria data))
  (.build builder))


(defn build-cfn-job-template-job-executions-retry-config-property-builder
  "The build-cfn-job-template-job-executions-retry-config-property-builder function updates a CfnJobTemplate$JobExecutionsRetryConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$JobExecutionsRetryConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `retryCriteriaList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-criteria-list` |
"
  [^CfnJobTemplate$JobExecutionsRetryConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :retry-criteria-list)]
    (. builder retryCriteriaList data))
  (.build builder))


(defn build-cfn-job-template-job-executions-rollout-config-property-builder
  "The build-cfn-job-template-job-executions-rollout-config-property-builder function updates a CfnJobTemplate$JobExecutionsRolloutConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$JobExecutionsRolloutConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exponentialRolloutRate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exponential-rollout-rate` |
| `maximumPerMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-per-minute` |
"
  [^CfnJobTemplate$JobExecutionsRolloutConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :exponential-rollout-rate)]
    (. builder exponentialRolloutRate data))
  (when-let [data (lookup-entry config id :maximum-per-minute)]
    (. builder maximumPerMinute data))
  (.build builder))


(defn build-cfn-job-template-maintenance-window-property-builder
  "The build-cfn-job-template-maintenance-window-property-builder function updates a CfnJobTemplate$MaintenanceWindowProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$MaintenanceWindowProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-minutes` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
"
  [^CfnJobTemplate$MaintenanceWindowProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :duration-in-minutes)]
    (. builder durationInMinutes data))
  (when-let [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (.build builder))


(defn build-cfn-job-template-presigned-url-config-property-builder
  "The build-cfn-job-template-presigned-url-config-property-builder function updates a CfnJobTemplate$PresignedUrlConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$PresignedUrlConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expiresInSec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expires-in-sec` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnJobTemplate$PresignedUrlConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :expires-in-sec)]
    (. builder expiresInSec data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-job-template-props-builder
  "The build-cfn-job-template-props-builder function updates a CfnJobTemplateProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :abort-config)]
    (. builder abortConfig data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :destination-package-versions)]
    (. builder destinationPackageVersions data))
  (when-let [data (lookup-entry config id :document)]
    (. builder document data))
  (when-let [data (lookup-entry config id :document-source)]
    (. builder documentSource data))
  (when-let [data (lookup-entry config id :job-arn)]
    (. builder jobArn data))
  (when-let [data (lookup-entry config id :job-executions-retry-config)]
    (. builder jobExecutionsRetryConfig data))
  (when-let [data (lookup-entry config id :job-executions-rollout-config)]
    (. builder jobExecutionsRolloutConfig data))
  (when-let [data (lookup-entry config id :job-template-id)]
    (. builder jobTemplateId data))
  (when-let [data (lookup-entry config id :maintenance-windows)]
    (. builder maintenanceWindows data))
  (when-let [data (lookup-entry config id :presigned-url-config)]
    (. builder presignedUrlConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :timeout-config)]
    (. builder timeoutConfig data))
  (.build builder))


(defn build-cfn-job-template-rate-increase-criteria-property-builder
  "The build-cfn-job-template-rate-increase-criteria-property-builder function updates a CfnJobTemplate$RateIncreaseCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$RateIncreaseCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfNotifiedThings` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-notified-things` |
| `numberOfSucceededThings` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-succeeded-things` |
"
  [^CfnJobTemplate$RateIncreaseCriteriaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :number-of-notified-things)]
    (. builder numberOfNotifiedThings data))
  (when-let [data (lookup-entry config id :number-of-succeeded-things)]
    (. builder numberOfSucceededThings data))
  (.build builder))


(defn build-cfn-job-template-retry-criteria-property-builder
  "The build-cfn-job-template-retry-criteria-property-builder function updates a CfnJobTemplate$RetryCriteriaProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$RetryCriteriaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-type` |
| `numberOfRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-retries` |
"
  [^CfnJobTemplate$RetryCriteriaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :failure-type)]
    (. builder failureType data))
  (when-let [data (lookup-entry config id :number-of-retries)]
    (. builder numberOfRetries data))
  (.build builder))


(defn build-cfn-job-template-timeout-config-property-builder
  "The build-cfn-job-template-timeout-config-property-builder function updates a CfnJobTemplate$TimeoutConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnJobTemplate$TimeoutConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inProgressTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:in-progress-timeout-in-minutes` |
"
  [^CfnJobTemplate$TimeoutConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :in-progress-timeout-in-minutes)]
    (. builder inProgressTimeoutInMinutes data))
  (.build builder))


(defn build-cfn-logging-builder
  "The build-cfn-logging-builder function updates a CfnLogging$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-let [data (lookup-entry config id :default-log-level)]
    (. builder defaultLogLevel data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-logging-props-builder
  "The build-cfn-logging-props-builder function updates a CfnLoggingProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-let [data (lookup-entry config id :default-log-level)]
    (. builder defaultLogLevel data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-mitigation-action-action-params-property-builder
  "The build-cfn-mitigation-action-action-params-property-builder function updates a CfnMitigationAction$ActionParamsProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :add-things-to-thing-group-params)]
    (. builder addThingsToThingGroupParams data))
  (when-let [data (lookup-entry config id :enable-io-t-logging-params)]
    (. builder enableIoTLoggingParams data))
  (when-let [data (lookup-entry config id :publish-finding-to-sns-params)]
    (. builder publishFindingToSnsParams data))
  (when-let [data (lookup-entry config id :replace-default-policy-version-params)]
    (. builder replaceDefaultPolicyVersionParams data))
  (when-let [data (lookup-entry config id :update-ca-certificate-params)]
    (. builder updateCaCertificateParams data))
  (when-let [data (lookup-entry config id :update-device-certificate-params)]
    (. builder updateDeviceCertificateParams data))
  (.build builder))


(defn build-cfn-mitigation-action-add-things-to-thing-group-params-property-builder
  "The build-cfn-mitigation-action-add-things-to-thing-group-params-property-builder function updates a CfnMitigationAction$AddThingsToThingGroupParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$AddThingsToThingGroupParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `overrideDynamicGroups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override-dynamic-groups` |
| `thingGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:thing-group-names` |
"
  [^CfnMitigationAction$AddThingsToThingGroupParamsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :override-dynamic-groups)]
    (. builder overrideDynamicGroups data))
  (when-let [data (lookup-entry config id :thing-group-names)]
    (. builder thingGroupNames data))
  (.build builder))


(defn build-cfn-mitigation-action-builder
  "The build-cfn-mitigation-action-builder function updates a CfnMitigationAction$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-let [data (lookup-entry config id :action-params)]
    (. builder actionParams data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-mitigation-action-enable-io-t-logging-params-property-builder
  "The build-cfn-mitigation-action-enable-io-t-logging-params-property-builder function updates a CfnMitigationAction$EnableIoTLoggingParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$EnableIoTLoggingParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `roleArnForLogging` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn-for-logging` |
"
  [^CfnMitigationAction$EnableIoTLoggingParamsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-let [data (lookup-entry config id :role-arn-for-logging)]
    (. builder roleArnForLogging data))
  (.build builder))


(defn build-cfn-mitigation-action-props-builder
  "The build-cfn-mitigation-action-props-builder function updates a CfnMitigationActionProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (when-let [data (lookup-entry config id :action-params)]
    (. builder actionParams data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-mitigation-action-publish-finding-to-sns-params-property-builder
  "The build-cfn-mitigation-action-publish-finding-to-sns-params-property-builder function updates a CfnMitigationAction$PublishFindingToSnsParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$PublishFindingToSnsParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |
"
  [^CfnMitigationAction$PublishFindingToSnsParamsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :topic-arn)]
    (. builder topicArn data))
  (.build builder))


(defn build-cfn-mitigation-action-replace-default-policy-version-params-property-builder
  "The build-cfn-mitigation-action-replace-default-policy-version-params-property-builder function updates a CfnMitigationAction$ReplaceDefaultPolicyVersionParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$ReplaceDefaultPolicyVersionParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
"
  [^CfnMitigationAction$ReplaceDefaultPolicyVersionParamsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (.build builder))


(defn build-cfn-mitigation-action-update-ca-certificate-params-property-builder
  "The build-cfn-mitigation-action-update-ca-certificate-params-property-builder function updates a CfnMitigationAction$UpdateCACertificateParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$UpdateCACertificateParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
"
  [^CfnMitigationAction$UpdateCACertificateParamsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (.build builder))


(defn build-cfn-mitigation-action-update-device-certificate-params-property-builder
  "The build-cfn-mitigation-action-update-device-certificate-params-property-builder function updates a CfnMitigationAction$UpdateDeviceCertificateParamsProperty$Builder instance using the provided configuration.
  The function takes the CfnMitigationAction$UpdateDeviceCertificateParamsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
"
  [^CfnMitigationAction$UpdateDeviceCertificateParamsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (.build builder))


(defn build-cfn-policy-builder
  "The build-cfn-policy-builder function updates a CfnPolicy$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-policy-principal-attachment-builder
  "The build-cfn-policy-principal-attachment-builder function updates a CfnPolicyPrincipalAttachment$Builder instance using the provided configuration.
  The function takes the CfnPolicyPrincipalAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
"
  [^CfnPolicyPrincipalAttachment$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (.build builder))


(defn build-cfn-policy-principal-attachment-props-builder
  "The build-cfn-policy-principal-attachment-props-builder function updates a CfnPolicyPrincipalAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnPolicyPrincipalAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
"
  [^CfnPolicyPrincipalAttachmentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (.build builder))


(defn build-cfn-policy-props-builder
  "The build-cfn-policy-props-builder function updates a CfnPolicyProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :policy-document)]
    (. builder policyDocument data))
  (when-let [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-provisioning-template-builder
  "The build-cfn-provisioning-template-builder function updates a CfnProvisioningTemplate$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :pre-provisioning-hook)]
    (. builder preProvisioningHook data))
  (when-let [data (lookup-entry config id :provisioning-role-arn)]
    (. builder provisioningRoleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :template-body)]
    (. builder templateBody data))
  (when-let [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (when-let [data (lookup-entry config id :template-type)]
    (. builder templateType data))
  (.build builder))


(defn build-cfn-provisioning-template-props-builder
  "The build-cfn-provisioning-template-props-builder function updates a CfnProvisioningTemplateProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :pre-provisioning-hook)]
    (. builder preProvisioningHook data))
  (when-let [data (lookup-entry config id :provisioning-role-arn)]
    (. builder provisioningRoleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :template-body)]
    (. builder templateBody data))
  (when-let [data (lookup-entry config id :template-name)]
    (. builder templateName data))
  (when-let [data (lookup-entry config id :template-type)]
    (. builder templateType data))
  (.build builder))


(defn build-cfn-provisioning-template-provisioning-hook-property-builder
  "The build-cfn-provisioning-template-provisioning-hook-property-builder function updates a CfnProvisioningTemplate$ProvisioningHookProperty$Builder instance using the provided configuration.
  The function takes the CfnProvisioningTemplate$ProvisioningHookProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payloadVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-version` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
"
  [^CfnProvisioningTemplate$ProvisioningHookProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :payload-version)]
    (. builder payloadVersion data))
  (when-let [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn build-cfn-resource-specific-logging-builder
  "The build-cfn-resource-specific-logging-builder function updates a CfnResourceSpecificLogging$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-let [data (lookup-entry config id :target-name)]
    (. builder targetName data))
  (when-let [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn build-cfn-resource-specific-logging-props-builder
  "The build-cfn-resource-specific-logging-props-builder function updates a CfnResourceSpecificLoggingProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :log-level)]
    (. builder logLevel data))
  (when-let [data (lookup-entry config id :target-name)]
    (. builder targetName data))
  (when-let [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn build-cfn-role-alias-builder
  "The build-cfn-role-alias-builder function updates a CfnRoleAlias$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :credential-duration-seconds)]
    (. builder credentialDurationSeconds data))
  (when-let [data (lookup-entry config id :role-alias)]
    (. builder roleAlias data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-role-alias-props-builder
  "The build-cfn-role-alias-props-builder function updates a CfnRoleAliasProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :credential-duration-seconds)]
    (. builder credentialDurationSeconds data))
  (when-let [data (lookup-entry config id :role-alias)]
    (. builder roleAlias data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-scheduled-audit-builder
  "The build-cfn-scheduled-audit-builder function updates a CfnScheduledAudit$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :day-of-month)]
    (. builder dayOfMonth data))
  (when-let [data (lookup-entry config id :day-of-week)]
    (. builder dayOfWeek data))
  (when-let [data (lookup-entry config id :frequency)]
    (. builder frequency data))
  (when-let [data (lookup-entry config id :scheduled-audit-name)]
    (. builder scheduledAuditName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-check-names)]
    (. builder targetCheckNames data))
  (.build builder))


(defn build-cfn-scheduled-audit-props-builder
  "The build-cfn-scheduled-audit-props-builder function updates a CfnScheduledAuditProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :day-of-month)]
    (. builder dayOfMonth data))
  (when-let [data (lookup-entry config id :day-of-week)]
    (. builder dayOfWeek data))
  (when-let [data (lookup-entry config id :frequency)]
    (. builder frequency data))
  (when-let [data (lookup-entry config id :scheduled-audit-name)]
    (. builder scheduledAuditName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-check-names)]
    (. builder targetCheckNames data))
  (.build builder))


(defn build-cfn-security-profile-alert-target-property-builder
  "The build-cfn-security-profile-alert-target-property-builder function updates a CfnSecurityProfile$AlertTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$AlertTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alertTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-target-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnSecurityProfile$AlertTargetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alert-target-arn)]
    (. builder alertTargetArn data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-security-profile-behavior-criteria-property-builder
  "The build-cfn-security-profile-behavior-criteria-property-builder function updates a CfnSecurityProfile$BehaviorCriteriaProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-let [data (lookup-entry config id :consecutive-datapoints-to-alarm)]
    (. builder consecutiveDatapointsToAlarm data))
  (when-let [data (lookup-entry config id :consecutive-datapoints-to-clear)]
    (. builder consecutiveDatapointsToClear data))
  (when-let [data (lookup-entry config id :duration-seconds)]
    (. builder durationSeconds data))
  (when-let [data (lookup-entry config id :ml-detection-config)]
    (. builder mlDetectionConfig data))
  (when-let [data (lookup-entry config id :statistical-threshold)]
    (. builder statisticalThreshold data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-security-profile-behavior-property-builder
  "The build-cfn-security-profile-behavior-property-builder function updates a CfnSecurityProfile$BehaviorProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :criteria)]
    (. builder criteria data))
  (when-let [data (lookup-entry config id :export-metric)]
    (. builder exportMetric data))
  (when-let [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-let [data (lookup-entry config id :metric-dimension)]
    (. builder metricDimension data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :suppress-alerts)]
    (. builder suppressAlerts data))
  (.build builder))


(defn build-cfn-security-profile-builder
  "The build-cfn-security-profile-builder function updates a CfnSecurityProfile$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :additional-metrics-to-retain-v2)]
    (. builder additionalMetricsToRetainV2 data))
  (when-let [data (lookup-entry config id :alert-targets)]
    (. builder alertTargets data))
  (when-let [data (lookup-entry config id :behaviors)]
    (. builder behaviors data))
  (when-let [data (lookup-entry config id :metrics-export-config)]
    (. builder metricsExportConfig data))
  (when-let [data (lookup-entry config id :security-profile-description)]
    (. builder securityProfileDescription data))
  (when-let [data (lookup-entry config id :security-profile-name)]
    (. builder securityProfileName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-arns)]
    (. builder targetArns data))
  (.build builder))


(defn build-cfn-security-profile-machine-learning-detection-config-property-builder
  "The build-cfn-security-profile-machine-learning-detection-config-property-builder function updates a CfnSecurityProfile$MachineLearningDetectionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$MachineLearningDetectionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `confidenceLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:confidence-level` |
"
  [^CfnSecurityProfile$MachineLearningDetectionConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :confidence-level)]
    (. builder confidenceLevel data))
  (.build builder))


(defn build-cfn-security-profile-metric-dimension-property-builder
  "The build-cfn-security-profile-metric-dimension-property-builder function updates a CfnSecurityProfile$MetricDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$MetricDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-name` |
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |
"
  [^CfnSecurityProfile$MetricDimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dimension-name)]
    (. builder dimensionName data))
  (when-let [data (lookup-entry config id :operator)]
    (. builder operator data))
  (.build builder))


(defn build-cfn-security-profile-metric-to-retain-property-builder
  "The build-cfn-security-profile-metric-to-retain-property-builder function updates a CfnSecurityProfile$MetricToRetainProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :export-metric)]
    (. builder exportMetric data))
  (when-let [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-let [data (lookup-entry config id :metric-dimension)]
    (. builder metricDimension data))
  (.build builder))


(defn build-cfn-security-profile-metric-value-property-builder
  "The build-cfn-security-profile-metric-value-property-builder function updates a CfnSecurityProfile$MetricValueProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :cidrs)]
    (. builder cidrs data))
  (when-let [data (lookup-entry config id :count)]
    (. builder count data))
  (when-let [data (lookup-entry config id :number)]
    (. builder number data))
  (when-let [data (lookup-entry config id :numbers)]
    (. builder numbers data))
  (when-let [data (lookup-entry config id :ports)]
    (. builder ports data))
  (when-let [data (lookup-entry config id :strings)]
    (. builder strings data))
  (.build builder))


(defn build-cfn-security-profile-metrics-export-config-property-builder
  "The build-cfn-security-profile-metrics-export-config-property-builder function updates a CfnSecurityProfile$MetricsExportConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$MetricsExportConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mqttTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:mqtt-topic` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnSecurityProfile$MetricsExportConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :mqtt-topic)]
    (. builder mqttTopic data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-security-profile-props-builder
  "The build-cfn-security-profile-props-builder function updates a CfnSecurityProfileProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :additional-metrics-to-retain-v2)]
    (. builder additionalMetricsToRetainV2 data))
  (when-let [data (lookup-entry config id :alert-targets)]
    (. builder alertTargets data))
  (when-let [data (lookup-entry config id :behaviors)]
    (. builder behaviors data))
  (when-let [data (lookup-entry config id :metrics-export-config)]
    (. builder metricsExportConfig data))
  (when-let [data (lookup-entry config id :security-profile-description)]
    (. builder securityProfileDescription data))
  (when-let [data (lookup-entry config id :security-profile-name)]
    (. builder securityProfileName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-arns)]
    (. builder targetArns data))
  (.build builder))


(defn build-cfn-security-profile-statistical-threshold-property-builder
  "The build-cfn-security-profile-statistical-threshold-property-builder function updates a CfnSecurityProfile$StatisticalThresholdProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$StatisticalThresholdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |
"
  [^CfnSecurityProfile$StatisticalThresholdProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :statistic)]
    (. builder statistic data))
  (.build builder))


(defn build-cfn-software-package-builder
  "The build-cfn-software-package-builder function updates a CfnSoftwarePackage$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :package-name)]
    (. builder packageName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-software-package-props-builder
  "The build-cfn-software-package-props-builder function updates a CfnSoftwarePackageProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :package-name)]
    (. builder packageName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-software-package-version-builder
  "The build-cfn-software-package-version-builder function updates a CfnSoftwarePackageVersion$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :package-name)]
    (. builder packageName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :version-name)]
    (. builder versionName data))
  (.build builder))


(defn build-cfn-software-package-version-props-builder
  "The build-cfn-software-package-version-props-builder function updates a CfnSoftwarePackageVersionProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :package-name)]
    (. builder packageName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :version-name)]
    (. builder versionName data))
  (.build builder))


(defn build-cfn-thing-attribute-payload-property-builder
  "The build-cfn-thing-attribute-payload-property-builder function updates a CfnThing$AttributePayloadProperty$Builder instance using the provided configuration.
  The function takes the CfnThing$AttributePayloadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |
"
  [^CfnThing$AttributePayloadProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (.build builder))


(defn build-cfn-thing-builder
  "The build-cfn-thing-builder function updates a CfnThing$Builder instance using the provided configuration.
  The function takes the CfnThing$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributePayload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-payload` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnThing$Builder builder id config]
  (when-let [data (lookup-entry config id :attribute-payload)]
    (. builder attributePayload data))
  (when-let [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn build-cfn-thing-group-attribute-payload-property-builder
  "The build-cfn-thing-group-attribute-payload-property-builder function updates a CfnThingGroup$AttributePayloadProperty$Builder instance using the provided configuration.
  The function takes the CfnThingGroup$AttributePayloadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |
"
  [^CfnThingGroup$AttributePayloadProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (.build builder))


(defn build-cfn-thing-group-builder
  "The build-cfn-thing-group-builder function updates a CfnThingGroup$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :parent-group-name)]
    (. builder parentGroupName data))
  (when-let [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :thing-group-name)]
    (. builder thingGroupName data))
  (when-let [data (lookup-entry config id :thing-group-properties)]
    (. builder thingGroupProperties data))
  (.build builder))


(defn build-cfn-thing-group-props-builder
  "The build-cfn-thing-group-props-builder function updates a CfnThingGroupProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :parent-group-name)]
    (. builder parentGroupName data))
  (when-let [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :thing-group-name)]
    (. builder thingGroupName data))
  (when-let [data (lookup-entry config id :thing-group-properties)]
    (. builder thingGroupProperties data))
  (.build builder))


(defn build-cfn-thing-group-thing-group-properties-property-builder
  "The build-cfn-thing-group-thing-group-properties-property-builder function updates a CfnThingGroup$ThingGroupPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnThingGroup$ThingGroupPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributePayload` | software.amazon.awscdk.services.iot.CfnThingGroup$AttributePayloadProperty | [[cdk.support/lookup-entry]] | `:attribute-payload` |
| `thingGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-group-description` |
"
  [^CfnThingGroup$ThingGroupPropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attribute-payload)]
    (. builder attributePayload data))
  (when-let [data (lookup-entry config id :thing-group-description)]
    (. builder thingGroupDescription data))
  (.build builder))


(defn build-cfn-thing-principal-attachment-builder
  "The build-cfn-thing-principal-attachment-builder function updates a CfnThingPrincipalAttachment$Builder instance using the provided configuration.
  The function takes the CfnThingPrincipalAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnThingPrincipalAttachment$Builder builder id config]
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-let [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn build-cfn-thing-principal-attachment-props-builder
  "The build-cfn-thing-principal-attachment-props-builder function updates a CfnThingPrincipalAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnThingPrincipalAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnThingPrincipalAttachmentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :principal)]
    (. builder principal data))
  (when-let [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn build-cfn-thing-props-builder
  "The build-cfn-thing-props-builder function updates a CfnThingProps$Builder instance using the provided configuration.
  The function takes the CfnThingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributePayload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-payload` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |
"
  [^CfnThingProps$Builder builder id config]
  (when-let [data (lookup-entry config id :attribute-payload)]
    (. builder attributePayload data))
  (when-let [data (lookup-entry config id :thing-name)]
    (. builder thingName data))
  (.build builder))


(defn build-cfn-thing-type-builder
  "The build-cfn-thing-type-builder function updates a CfnThingType$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :deprecate-thing-type)]
    (. builder deprecateThingType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :thing-type-name)]
    (. builder thingTypeName data))
  (when-let [data (lookup-entry config id :thing-type-properties)]
    (. builder thingTypeProperties data))
  (.build builder))


(defn build-cfn-thing-type-props-builder
  "The build-cfn-thing-type-props-builder function updates a CfnThingTypeProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :deprecate-thing-type)]
    (. builder deprecateThingType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :thing-type-name)]
    (. builder thingTypeName data))
  (when-let [data (lookup-entry config id :thing-type-properties)]
    (. builder thingTypeProperties data))
  (.build builder))


(defn build-cfn-thing-type-thing-type-properties-property-builder
  "The build-cfn-thing-type-thing-type-properties-property-builder function updates a CfnThingType$ThingTypePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnThingType$ThingTypePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `searchableAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:searchable-attributes` |
| `thingTypeDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-type-description` |
"
  [^CfnThingType$ThingTypePropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :searchable-attributes)]
    (. builder searchableAttributes data))
  (when-let [data (lookup-entry config id :thing-type-description)]
    (. builder thingTypeDescription data))
  (.build builder))


(defn build-cfn-topic-rule-action-property-builder
  "The build-cfn-topic-rule-action-property-builder function updates a CfnTopicRule$ActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :cloudwatch-alarm)]
    (. builder cloudwatchAlarm data))
  (when-let [data (lookup-entry config id :cloudwatch-logs)]
    (. builder cloudwatchLogs data))
  (when-let [data (lookup-entry config id :cloudwatch-metric)]
    (. builder cloudwatchMetric data))
  (when-let [data (lookup-entry config id :dynamo-d-bv2)]
    (. builder dynamoDBv2 data))
  (when-let [data (lookup-entry config id :dynamo-db)]
    (. builder dynamoDb data))
  (when-let [data (lookup-entry config id :elasticsearch)]
    (. builder elasticsearch data))
  (when-let [data (lookup-entry config id :firehose)]
    (. builder firehose data))
  (when-let [data (lookup-entry config id :http)]
    (. builder http data))
  (when-let [data (lookup-entry config id :iot-analytics)]
    (. builder iotAnalytics data))
  (when-let [data (lookup-entry config id :iot-events)]
    (. builder iotEvents data))
  (when-let [data (lookup-entry config id :iot-site-wise)]
    (. builder iotSiteWise data))
  (when-let [data (lookup-entry config id :kafka)]
    (. builder kafka data))
  (when-let [data (lookup-entry config id :kinesis)]
    (. builder kinesis data))
  (when-let [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (when-let [data (lookup-entry config id :location)]
    (. builder location data))
  (when-let [data (lookup-entry config id :open-search)]
    (. builder openSearch data))
  (when-let [data (lookup-entry config id :republish)]
    (. builder republish data))
  (when-let [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (when-let [data (lookup-entry config id :sns)]
    (. builder sns data))
  (when-let [data (lookup-entry config id :sqs)]
    (. builder sqs data))
  (when-let [data (lookup-entry config id :step-functions)]
    (. builder stepFunctions data))
  (when-let [data (lookup-entry config id :timestream)]
    (. builder timestream data))
  (.build builder))


(defn build-cfn-topic-rule-asset-property-timestamp-property-builder
  "The build-cfn-topic-rule-asset-property-timestamp-property-builder function updates a CfnTopicRule$AssetPropertyTimestampProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$AssetPropertyTimestampProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `offsetInNanos` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset-in-nanos` |
| `timeInSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-in-seconds` |
"
  [^CfnTopicRule$AssetPropertyTimestampProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :offset-in-nanos)]
    (. builder offsetInNanos data))
  (when-let [data (lookup-entry config id :time-in-seconds)]
    (. builder timeInSeconds data))
  (.build builder))


(defn build-cfn-topic-rule-asset-property-value-property-builder
  "The build-cfn-topic-rule-asset-property-value-property-builder function updates a CfnTopicRule$AssetPropertyValueProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :quality)]
    (. builder quality data))
  (when-let [data (lookup-entry config id :timestamp)]
    (. builder timestamp data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-topic-rule-asset-property-variant-property-builder
  "The build-cfn-topic-rule-asset-property-variant-property-builder function updates a CfnTopicRule$AssetPropertyVariantProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :boolean-value)]
    (. builder booleanValue data))
  (when-let [data (lookup-entry config id :double-value)]
    (. builder doubleValue data))
  (when-let [data (lookup-entry config id :integer-value)]
    (. builder integerValue data))
  (when-let [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn build-cfn-topic-rule-builder
  "The build-cfn-topic-rule-builder function updates a CfnTopicRule$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :topic-rule-payload)]
    (. builder topicRulePayload data))
  (.build builder))


(defn build-cfn-topic-rule-cloudwatch-alarm-action-property-builder
  "The build-cfn-topic-rule-cloudwatch-alarm-action-property-builder function updates a CfnTopicRule$CloudwatchAlarmActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :state-reason)]
    (. builder stateReason data))
  (when-let [data (lookup-entry config id :state-value)]
    (. builder stateValue data))
  (.build builder))


(defn build-cfn-topic-rule-cloudwatch-logs-action-property-builder
  "The build-cfn-topic-rule-cloudwatch-logs-action-property-builder function updates a CfnTopicRule$CloudwatchLogsActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-mode)]
    (. builder batchMode data))
  (when-let [data (lookup-entry config id :log-group-name)]
    (. builder logGroupName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-topic-rule-cloudwatch-metric-action-property-builder
  "The build-cfn-topic-rule-cloudwatch-metric-action-property-builder function updates a CfnTopicRule$CloudwatchMetricActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :metric-namespace)]
    (. builder metricNamespace data))
  (when-let [data (lookup-entry config id :metric-timestamp)]
    (. builder metricTimestamp data))
  (when-let [data (lookup-entry config id :metric-unit)]
    (. builder metricUnit data))
  (when-let [data (lookup-entry config id :metric-value)]
    (. builder metricValue data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-topic-rule-destination-builder
  "The build-cfn-topic-rule-destination-builder function updates a CfnTopicRuleDestination$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :http-url-properties)]
    (. builder httpUrlProperties data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :vpc-properties)]
    (. builder vpcProperties data))
  (.build builder))


(defn build-cfn-topic-rule-destination-http-url-destination-summary-property-builder
  "The build-cfn-topic-rule-destination-http-url-destination-summary-property-builder function updates a CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `confirmationUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:confirmation-url` |
"
  [^CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :confirmation-url)]
    (. builder confirmationUrl data))
  (.build builder))


(defn build-cfn-topic-rule-destination-props-builder
  "The build-cfn-topic-rule-destination-props-builder function updates a CfnTopicRuleDestinationProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :http-url-properties)]
    (. builder httpUrlProperties data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (when-let [data (lookup-entry config id :vpc-properties)]
    (. builder vpcProperties data))
  (.build builder))


(defn build-cfn-topic-rule-destination-vpc-destination-properties-property-builder
  "The build-cfn-topic-rule-destination-vpc-destination-properties-property-builder function updates a CfnTopicRuleDestination$VpcDestinationPropertiesProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn build-cfn-topic-rule-dynamo-d-bv2-action-property-builder
  "The build-cfn-topic-rule-dynamo-d-bv2-action-property-builder function updates a CfnTopicRule$DynamoDBv2ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$DynamoDBv2ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `putItem` | software.amazon.awscdk.services.iot.CfnTopicRule$PutItemInputProperty | [[cdk.support/lookup-entry]] | `:put-item` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTopicRule$DynamoDBv2ActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :put-item)]
    (. builder putItem data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-topic-rule-dynamo-db-action-property-builder
  "The build-cfn-topic-rule-dynamo-db-action-property-builder function updates a CfnTopicRule$DynamoDBActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :hash-key-field)]
    (. builder hashKeyField data))
  (when-let [data (lookup-entry config id :hash-key-type)]
    (. builder hashKeyType data))
  (when-let [data (lookup-entry config id :hash-key-value)]
    (. builder hashKeyValue data))
  (when-let [data (lookup-entry config id :payload-field)]
    (. builder payloadField data))
  (when-let [data (lookup-entry config id :range-key-field)]
    (. builder rangeKeyField data))
  (when-let [data (lookup-entry config id :range-key-type)]
    (. builder rangeKeyType data))
  (when-let [data (lookup-entry config id :range-key-value)]
    (. builder rangeKeyValue data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn build-cfn-topic-rule-elasticsearch-action-property-builder
  "The build-cfn-topic-rule-elasticsearch-action-property-builder function updates a CfnTopicRule$ElasticsearchActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :index)]
    (. builder index data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-topic-rule-firehose-action-property-builder
  "The build-cfn-topic-rule-firehose-action-property-builder function updates a CfnTopicRule$FirehoseActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-mode)]
    (. builder batchMode data))
  (when-let [data (lookup-entry config id :delivery-stream-name)]
    (. builder deliveryStreamName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :separator)]
    (. builder separator data))
  (.build builder))


(defn build-cfn-topic-rule-http-action-header-property-builder
  "The build-cfn-topic-rule-http-action-header-property-builder function updates a CfnTopicRule$HttpActionHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$HttpActionHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$HttpActionHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-topic-rule-http-action-property-builder
  "The build-cfn-topic-rule-http-action-property-builder function updates a CfnTopicRule$HttpActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :auth)]
    (. builder auth data))
  (when-let [data (lookup-entry config id :confirmation-url)]
    (. builder confirmationUrl data))
  (when-let [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-let [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn build-cfn-topic-rule-http-authorization-property-builder
  "The build-cfn-topic-rule-http-authorization-property-builder function updates a CfnTopicRule$HttpAuthorizationProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$HttpAuthorizationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sigv4` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sigv4` |
"
  [^CfnTopicRule$HttpAuthorizationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sigv4)]
    (. builder sigv4 data))
  (.build builder))


(defn build-cfn-topic-rule-iot-analytics-action-property-builder
  "The build-cfn-topic-rule-iot-analytics-action-property-builder function updates a CfnTopicRule$IotAnalyticsActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-mode)]
    (. builder batchMode data))
  (when-let [data (lookup-entry config id :channel-name)]
    (. builder channelName data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-topic-rule-iot-events-action-property-builder
  "The build-cfn-topic-rule-iot-events-action-property-builder function updates a CfnTopicRule$IotEventsActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :batch-mode)]
    (. builder batchMode data))
  (when-let [data (lookup-entry config id :input-name)]
    (. builder inputName data))
  (when-let [data (lookup-entry config id :message-id)]
    (. builder messageId data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-topic-rule-iot-site-wise-action-property-builder
  "The build-cfn-topic-rule-iot-site-wise-action-property-builder function updates a CfnTopicRule$IotSiteWiseActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$IotSiteWiseActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `putAssetPropertyValueEntries` | java.util.List | [[cdk.support/lookup-entry]] | `:put-asset-property-value-entries` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTopicRule$IotSiteWiseActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :put-asset-property-value-entries)]
    (. builder putAssetPropertyValueEntries data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-topic-rule-kafka-action-header-property-builder
  "The build-cfn-topic-rule-kafka-action-header-property-builder function updates a CfnTopicRule$KafkaActionHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$KafkaActionHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$KafkaActionHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-topic-rule-kafka-action-property-builder
  "The build-cfn-topic-rule-kafka-action-property-builder function updates a CfnTopicRule$KafkaActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :client-properties)]
    (. builder clientProperties data))
  (when-let [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-let [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :partition)]
    (. builder partition data))
  (when-let [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn build-cfn-topic-rule-kinesis-action-property-builder
  "The build-cfn-topic-rule-kinesis-action-property-builder function updates a CfnTopicRule$KinesisActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :partition-key)]
    (. builder partitionKey data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :stream-name)]
    (. builder streamName data))
  (.build builder))


(defn build-cfn-topic-rule-lambda-action-property-builder
  "The build-cfn-topic-rule-lambda-action-property-builder function updates a CfnTopicRule$LambdaActionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$LambdaActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |
"
  [^CfnTopicRule$LambdaActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :function-arn)]
    (. builder functionArn data))
  (.build builder))


(defn build-cfn-topic-rule-location-action-property-builder
  "The build-cfn-topic-rule-location-action-property-builder function updates a CfnTopicRule$LocationActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :device-id)]
    (. builder deviceId data))
  (when-let [data (lookup-entry config id :latitude)]
    (. builder latitude data))
  (when-let [data (lookup-entry config id :longitude)]
    (. builder longitude data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :timestamp)]
    (. builder timestamp data))
  (when-let [data (lookup-entry config id :tracker-name)]
    (. builder trackerName data))
  (.build builder))


(defn build-cfn-topic-rule-open-search-action-property-builder
  "The build-cfn-topic-rule-open-search-action-property-builder function updates a CfnTopicRule$OpenSearchActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :index)]
    (. builder index data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-topic-rule-props-builder
  "The build-cfn-topic-rule-props-builder function updates a CfnTopicRuleProps$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :topic-rule-payload)]
    (. builder topicRulePayload data))
  (.build builder))


(defn build-cfn-topic-rule-put-asset-property-value-entry-property-builder
  "The build-cfn-topic-rule-put-asset-property-value-entry-property-builder function updates a CfnTopicRule$PutAssetPropertyValueEntryProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :asset-id)]
    (. builder assetId data))
  (when-let [data (lookup-entry config id :entry-id)]
    (. builder entryId data))
  (when-let [data (lookup-entry config id :property-alias)]
    (. builder propertyAlias data))
  (when-let [data (lookup-entry config id :property-id)]
    (. builder propertyId data))
  (when-let [data (lookup-entry config id :property-values)]
    (. builder propertyValues data))
  (.build builder))


(defn build-cfn-topic-rule-put-item-input-property-builder
  "The build-cfn-topic-rule-put-item-input-property-builder function updates a CfnTopicRule$PutItemInputProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$PutItemInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
"
  [^CfnTopicRule$PutItemInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (.build builder))


(defn build-cfn-topic-rule-republish-action-headers-property-builder
  "The build-cfn-topic-rule-republish-action-headers-property-builder function updates a CfnTopicRule$RepublishActionHeadersProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-let [data (lookup-entry config id :correlation-data)]
    (. builder correlationData data))
  (when-let [data (lookup-entry config id :message-expiry)]
    (. builder messageExpiry data))
  (when-let [data (lookup-entry config id :payload-format-indicator)]
    (. builder payloadFormatIndicator data))
  (when-let [data (lookup-entry config id :response-topic)]
    (. builder responseTopic data))
  (when-let [data (lookup-entry config id :user-properties)]
    (. builder userProperties data))
  (.build builder))


(defn build-cfn-topic-rule-republish-action-property-builder
  "The build-cfn-topic-rule-republish-action-property-builder function updates a CfnTopicRule$RepublishActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-let [data (lookup-entry config id :qos)]
    (. builder qos data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :topic)]
    (. builder topic data))
  (.build builder))


(defn build-cfn-topic-rule-s3-action-property-builder
  "The build-cfn-topic-rule-s3-action-property-builder function updates a CfnTopicRule$S3ActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :canned-acl)]
    (. builder cannedAcl data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn build-cfn-topic-rule-sig-v4-authorization-property-builder
  "The build-cfn-topic-rule-sig-v4-authorization-property-builder function updates a CfnTopicRule$SigV4AuthorizationProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-let [data (lookup-entry config id :signing-region)]
    (. builder signingRegion data))
  (.build builder))


(defn build-cfn-topic-rule-sns-action-property-builder
  "The build-cfn-topic-rule-sns-action-property-builder function updates a CfnTopicRule$SnsActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :message-format)]
    (. builder messageFormat data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (.build builder))


(defn build-cfn-topic-rule-sqs-action-property-builder
  "The build-cfn-topic-rule-sqs-action-property-builder function updates a CfnTopicRule$SqsActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :queue-url)]
    (. builder queueUrl data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :use-base64)]
    (. builder useBase64 data))
  (.build builder))


(defn build-cfn-topic-rule-step-functions-action-property-builder
  "The build-cfn-topic-rule-step-functions-action-property-builder function updates a CfnTopicRule$StepFunctionsActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :execution-name-prefix)]
    (. builder executionNamePrefix data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :state-machine-name)]
    (. builder stateMachineName data))
  (.build builder))


(defn build-cfn-topic-rule-timestamp-property-builder
  "The build-cfn-topic-rule-timestamp-property-builder function updates a CfnTopicRule$TimestampProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$TimestampProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$TimestampProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-topic-rule-timestream-action-property-builder
  "The build-cfn-topic-rule-timestream-action-property-builder function updates a CfnTopicRule$TimestreamActionProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :database-name)]
    (. builder databaseName data))
  (when-let [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :table-name)]
    (. builder tableName data))
  (when-let [data (lookup-entry config id :timestamp)]
    (. builder timestamp data))
  (.build builder))


(defn build-cfn-topic-rule-timestream-dimension-property-builder
  "The build-cfn-topic-rule-timestream-dimension-property-builder function updates a CfnTopicRule$TimestreamDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$TimestreamDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$TimestreamDimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-topic-rule-timestream-timestamp-property-builder
  "The build-cfn-topic-rule-timestream-timestamp-property-builder function updates a CfnTopicRule$TimestreamTimestampProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$TimestreamTimestampProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$TimestreamTimestampProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :unit)]
    (. builder unit data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-topic-rule-topic-rule-payload-property-builder
  "The build-cfn-topic-rule-topic-rule-payload-property-builder function updates a CfnTopicRule$TopicRulePayloadProperty$Builder instance using the provided configuration.
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
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :aws-iot-sql-version)]
    (. builder awsIotSqlVersion data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :error-action)]
    (. builder errorAction data))
  (when-let [data (lookup-entry config id :rule-disabled)]
    (. builder ruleDisabled data))
  (when-let [data (lookup-entry config id :sql)]
    (. builder sql data))
  (.build builder))


(defn build-cfn-topic-rule-user-property-property-builder
  "The build-cfn-topic-rule-user-property-property-builder function updates a CfnTopicRule$UserPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnTopicRule$UserPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTopicRule$UserPropertyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))