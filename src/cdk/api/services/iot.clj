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


(defn cfn-account-audit-configuration-audit-check-configuration-property-builder
  "The cfn-account-audit-configuration-audit-check-configuration-property-builder function buildes out new instances of 
CfnAccountAuditConfiguration$AuditCheckConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnAccountAuditConfiguration$AuditCheckConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-account-audit-configuration-audit-check-configurations-property-builder
  "The cfn-account-audit-configuration-audit-check-configurations-property-builder function buildes out new instances of 
CfnAccountAuditConfiguration$AuditCheckConfigurationsProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `unauthenticatedCognitoRoleOverlyPermissiveCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:unauthenticated-cognito-role-overly-permissive-check` |"
  [stack id config]
  (let [builder (CfnAccountAuditConfiguration$AuditCheckConfigurationsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-account-audit-configuration-audit-notification-target-configurations-property-builder
  "The cfn-account-audit-configuration-audit-notification-target-configurations-property-builder function buildes out new instances of 
CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sns` |"
  [stack id config]
  (let [builder (CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty$Builder.)]
    (when-let [data (lookup-entry config id :sns)]
      (. builder sns data))
    (.build builder)))


(defn cfn-account-audit-configuration-audit-notification-target-property-builder
  "The cfn-account-audit-configuration-audit-notification-target-property-builder function buildes out new instances of 
CfnAccountAuditConfiguration$AuditNotificationTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnAccountAuditConfiguration$AuditNotificationTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-account-audit-configuration-builder
  "The cfn-account-audit-configuration-builder function buildes out new instances of 
CfnAccountAuditConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `auditCheckConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audit-check-configurations` |
| `auditNotificationTargetConfigurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audit-notification-target-configurations` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnAccountAuditConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :audit-check-configurations)]
      (. builder auditCheckConfigurations data))
    (when-let [data (lookup-entry config id :audit-notification-target-configurations)]
      (. builder auditNotificationTargetConfigurations data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-account-audit-configuration-props-builder
  "The cfn-account-audit-configuration-props-builder function buildes out new instances of 
CfnAccountAuditConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `auditCheckConfigurations` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditCheckConfigurationsProperty | [[cdk.support/lookup-entry]] | `:audit-check-configurations` |
| `auditNotificationTargetConfigurations` | software.amazon.awscdk.services.iot.CfnAccountAuditConfiguration$AuditNotificationTargetConfigurationsProperty | [[cdk.support/lookup-entry]] | `:audit-notification-target-configurations` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnAccountAuditConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :audit-check-configurations)]
      (. builder auditCheckConfigurations data))
    (when-let [data (lookup-entry config id :audit-notification-target-configurations)]
      (. builder auditNotificationTargetConfigurations data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-authorizer-builder
  "The cfn-authorizer-builder function buildes out new instances of 
CfnAuthorizer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-function-arn` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `enableCachingForHttp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-caching-for-http` |
| `signingDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:signing-disabled` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tokenKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-name` |
| `tokenSigningPublicKeys` | java.util.Map | [[cdk.support/lookup-entry]] | `:token-signing-public-keys` |"
  [stack id config]
  (let [builder (CfnAuthorizer$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-authorizer-props-builder
  "The cfn-authorizer-props-builder function buildes out new instances of 
CfnAuthorizerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authorizerFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-function-arn` |
| `authorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:authorizer-name` |
| `enableCachingForHttp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-caching-for-http` |
| `signingDisabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:signing-disabled` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tokenKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-name` |
| `tokenSigningPublicKeys` | java.util.Map | [[cdk.support/lookup-entry]] | `:token-signing-public-keys` |"
  [stack id config]
  (let [builder (CfnAuthorizerProps$Builder.)]
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
    (.build builder)))


(defn cfn-billing-group-billing-group-properties-property-builder
  "The cfn-billing-group-billing-group-properties-property-builder function buildes out new instances of 
CfnBillingGroup$BillingGroupPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-group-description` |"
  [stack id config]
  (let [builder (CfnBillingGroup$BillingGroupPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :billing-group-description)]
      (. builder billingGroupDescription data))
    (.build builder)))


(defn cfn-billing-group-builder
  "The cfn-billing-group-builder function buildes out new instances of 
CfnBillingGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-group-name` |
| `billingGroupProperties` | software.amazon.awscdk.services.iot.CfnBillingGroup$BillingGroupPropertiesProperty | [[cdk.support/lookup-entry]] | `:billing-group-properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBillingGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :billing-group-name)]
      (. builder billingGroupName data))
    (when-let [data (lookup-entry config id :billing-group-properties)]
      (. builder billingGroupProperties data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-billing-group-props-builder
  "The cfn-billing-group-props-builder function buildes out new instances of 
CfnBillingGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `billingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:billing-group-name` |
| `billingGroupProperties` | software.amazon.awscdk.services.iot.CfnBillingGroup$BillingGroupPropertiesProperty | [[cdk.support/lookup-entry]] | `:billing-group-properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBillingGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :billing-group-name)]
      (. builder billingGroupName data))
    (when-let [data (lookup-entry config id :billing-group-properties)]
      (. builder billingGroupProperties data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-ca-certificate-builder
  "The cfn-ca-certificate-builder function buildes out new instances of 
CfnCACertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoRegistrationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-registration-status` |
| `caCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-pem` |
| `certificateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-mode` |
| `registrationConfig` | software.amazon.awscdk.services.iot.CfnCACertificate$RegistrationConfigProperty | [[cdk.support/lookup-entry]] | `:registration-config` |
| `removeAutoRegistration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-auto-registration` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `verificationCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:verification-certificate-pem` |"
  [stack id config]
  (let [builder (CfnCACertificate$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-ca-certificate-props-builder
  "The cfn-ca-certificate-props-builder function buildes out new instances of 
CfnCACertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoRegistrationStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-registration-status` |
| `caCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-pem` |
| `certificateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-mode` |
| `registrationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:registration-config` |
| `removeAutoRegistration` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-auto-registration` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `verificationCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:verification-certificate-pem` |"
  [stack id config]
  (let [builder (CfnCACertificateProps$Builder.)]
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
    (.build builder)))


(defn cfn-ca-certificate-registration-config-property-builder
  "The cfn-ca-certificate-registration-config-property-builder function buildes out new instances of 
CfnCACertificate$RegistrationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |"
  [stack id config]
  (let [builder (CfnCACertificate$RegistrationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :template-body)]
      (. builder templateBody data))
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (.build builder)))


(defn cfn-certificate-builder
  "The cfn-certificate-builder function buildes out new instances of 
CfnCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-pem` |
| `certificateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-mode` |
| `certificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-pem` |
| `certificateSigningRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-signing-request` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnCertificate$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-certificate-props-builder
  "The cfn-certificate-props-builder function buildes out new instances of 
CfnCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `caCertificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-pem` |
| `certificateMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-mode` |
| `certificatePem` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-pem` |
| `certificateSigningRequest` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-signing-request` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnCertificateProps$Builder.)]
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
    (.build builder)))


(defn cfn-certificate-provider-builder
  "The cfn-certificate-provider-builder function buildes out new instances of 
CfnCertificateProvider$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountDefaultForOperations` | java.util.List | [[cdk.support/lookup-entry]] | `:account-default-for-operations` |
| `certificateProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-provider-name` |
| `lambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCertificateProvider$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-default-for-operations)]
      (. builder accountDefaultForOperations data))
    (when-let [data (lookup-entry config id :certificate-provider-name)]
      (. builder certificateProviderName data))
    (when-let [data (lookup-entry config id :lambda-function-arn)]
      (. builder lambdaFunctionArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-certificate-provider-props-builder
  "The cfn-certificate-provider-props-builder function buildes out new instances of 
CfnCertificateProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountDefaultForOperations` | java.util.List | [[cdk.support/lookup-entry]] | `:account-default-for-operations` |
| `certificateProviderName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-provider-name` |
| `lambdaFunctionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCertificateProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :account-default-for-operations)]
      (. builder accountDefaultForOperations data))
    (when-let [data (lookup-entry config id :certificate-provider-name)]
      (. builder certificateProviderName data))
    (when-let [data (lookup-entry config id :lambda-function-arn)]
      (. builder lambdaFunctionArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-custom-metric-builder
  "The cfn-custom-metric-builder function buildes out new instances of 
CfnCustomMetric$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCustomMetric$Builder/create stack id)]
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :metric-type)]
      (. builder metricType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-custom-metric-props-builder
  "The cfn-custom-metric-props-builder function buildes out new instances of 
CfnCustomMetricProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricType` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCustomMetricProps$Builder.)]
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :metric-type)]
      (. builder metricType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dimension-builder
  "The cfn-dimension-builder function buildes out new instances of 
CfnDimension$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stringValues` | java.util.List | [[cdk.support/lookup-entry]] | `:string-values` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDimension$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :string-values)]
      (. builder stringValues data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-dimension-props-builder
  "The cfn-dimension-props-builder function buildes out new instances of 
CfnDimensionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `stringValues` | java.util.List | [[cdk.support/lookup-entry]] | `:string-values` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnDimensionProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :string-values)]
      (. builder stringValues data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-domain-configuration-authorizer-config-property-builder
  "The cfn-domain-configuration-authorizer-config-property-builder function buildes out new instances of 
CfnDomainConfiguration$AuthorizerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAuthorizerOverride` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-authorizer-override` |
| `defaultAuthorizerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authorizer-name` |"
  [stack id config]
  (let [builder (CfnDomainConfiguration$AuthorizerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-authorizer-override)]
      (. builder allowAuthorizerOverride data))
    (when-let [data (lookup-entry config id :default-authorizer-name)]
      (. builder defaultAuthorizerName data))
    (.build builder)))


(defn cfn-domain-configuration-builder
  "The cfn-domain-configuration-builder function buildes out new instances of 
CfnDomainConfiguration$Builder using the provided configuration.  Each field is set as follows:

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
| `validationCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-certificate-arn` |"
  [stack id config]
  (let [builder (CfnDomainConfiguration$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-domain-configuration-props-builder
  "The cfn-domain-configuration-props-builder function buildes out new instances of 
CfnDomainConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

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
| `validationCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-certificate-arn` |"
  [stack id config]
  (let [builder (CfnDomainConfigurationProps$Builder.)]
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
    (.build builder)))


(defn cfn-domain-configuration-server-certificate-config-property-builder
  "The cfn-domain-configuration-server-certificate-config-property-builder function buildes out new instances of 
CfnDomainConfiguration$ServerCertificateConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableOcspCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-ocsp-check` |"
  [stack id config]
  (let [builder (CfnDomainConfiguration$ServerCertificateConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-ocsp-check)]
      (. builder enableOcspCheck data))
    (.build builder)))


(defn cfn-domain-configuration-server-certificate-summary-property-builder
  "The cfn-domain-configuration-server-certificate-summary-property-builder function buildes out new instances of 
CfnDomainConfiguration$ServerCertificateSummaryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serverCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-arn` |
| `serverCertificateStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-status` |
| `serverCertificateStatusDetail` | java.lang.String | [[cdk.support/lookup-entry]] | `:server-certificate-status-detail` |"
  [stack id config]
  (let [builder (CfnDomainConfiguration$ServerCertificateSummaryProperty$Builder.)]
    (when-let [data (lookup-entry config id :server-certificate-arn)]
      (. builder serverCertificateArn data))
    (when-let [data (lookup-entry config id :server-certificate-status)]
      (. builder serverCertificateStatus data))
    (when-let [data (lookup-entry config id :server-certificate-status-detail)]
      (. builder serverCertificateStatusDetail data))
    (.build builder)))


(defn cfn-domain-configuration-tls-config-property-builder
  "The cfn-domain-configuration-tls-config-property-builder function buildes out new instances of 
CfnDomainConfiguration$TlsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-policy` |"
  [stack id config]
  (let [builder (CfnDomainConfiguration$TlsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-policy)]
      (. builder securityPolicy data))
    (.build builder)))


(defn cfn-fleet-metric-aggregation-type-property-builder
  "The cfn-fleet-metric-aggregation-type-property-builder function buildes out new instances of 
CfnFleetMetric$AggregationTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnFleetMetric$AggregationTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-fleet-metric-builder
  "The cfn-fleet-metric-builder function buildes out new instances of 
CfnFleetMetric$Builder using the provided configuration.  Each field is set as follows:

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
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnFleetMetric$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-fleet-metric-props-builder
  "The cfn-fleet-metric-props-builder function buildes out new instances of 
CfnFleetMetricProps$Builder using the provided configuration.  Each field is set as follows:

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
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnFleetMetricProps$Builder.)]
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
    (.build builder)))


(defn cfn-job-template-abort-config-property-builder
  "The cfn-job-template-abort-config-property-builder function buildes out new instances of 
CfnJobTemplate$AbortConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criteriaList` | java.util.List | [[cdk.support/lookup-entry]] | `:criteria-list` |"
  [stack id config]
  (let [builder (CfnJobTemplate$AbortConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :criteria-list)]
      (. builder criteriaList data))
    (.build builder)))


(defn cfn-job-template-abort-criteria-property-builder
  "The cfn-job-template-abort-criteria-property-builder function buildes out new instances of 
CfnJobTemplate$AbortCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `failureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-type` |
| `minNumberOfExecutedThings` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-number-of-executed-things` |
| `thresholdPercentage` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold-percentage` |"
  [stack id config]
  (let [builder (CfnJobTemplate$AbortCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :failure-type)]
      (. builder failureType data))
    (when-let [data (lookup-entry config id :min-number-of-executed-things)]
      (. builder minNumberOfExecutedThings data))
    (when-let [data (lookup-entry config id :threshold-percentage)]
      (. builder thresholdPercentage data))
    (.build builder)))


(defn cfn-job-template-builder
  "The cfn-job-template-builder function buildes out new instances of 
CfnJobTemplate$Builder using the provided configuration.  Each field is set as follows:

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
| `timeoutConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:timeout-config` |"
  [stack id config]
  (let [builder (CfnJobTemplate$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-job-template-exponential-rollout-rate-property-builder
  "The cfn-job-template-exponential-rollout-rate-property-builder function buildes out new instances of 
CfnJobTemplate$ExponentialRolloutRateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baseRatePerMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:base-rate-per-minute` |
| `incrementFactor` | java.lang.Number | [[cdk.support/lookup-entry]] | `:increment-factor` |
| `rateIncreaseCriteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rate-increase-criteria` |"
  [stack id config]
  (let [builder (CfnJobTemplate$ExponentialRolloutRateProperty$Builder.)]
    (when-let [data (lookup-entry config id :base-rate-per-minute)]
      (. builder baseRatePerMinute data))
    (when-let [data (lookup-entry config id :increment-factor)]
      (. builder incrementFactor data))
    (when-let [data (lookup-entry config id :rate-increase-criteria)]
      (. builder rateIncreaseCriteria data))
    (.build builder)))


(defn cfn-job-template-job-executions-retry-config-property-builder
  "The cfn-job-template-job-executions-retry-config-property-builder function buildes out new instances of 
CfnJobTemplate$JobExecutionsRetryConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `retryCriteriaList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retry-criteria-list` |"
  [stack id config]
  (let [builder (CfnJobTemplate$JobExecutionsRetryConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :retry-criteria-list)]
      (. builder retryCriteriaList data))
    (.build builder)))


(defn cfn-job-template-job-executions-rollout-config-property-builder
  "The cfn-job-template-job-executions-rollout-config-property-builder function buildes out new instances of 
CfnJobTemplate$JobExecutionsRolloutConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exponentialRolloutRate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exponential-rollout-rate` |
| `maximumPerMinute` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-per-minute` |"
  [stack id config]
  (let [builder (CfnJobTemplate$JobExecutionsRolloutConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :exponential-rollout-rate)]
      (. builder exponentialRolloutRate data))
    (when-let [data (lookup-entry config id :maximum-per-minute)]
      (. builder maximumPerMinute data))
    (.build builder)))


(defn cfn-job-template-maintenance-window-property-builder
  "The cfn-job-template-maintenance-window-property-builder function buildes out new instances of 
CfnJobTemplate$MaintenanceWindowProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-minutes` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |"
  [stack id config]
  (let [builder (CfnJobTemplate$MaintenanceWindowProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-in-minutes)]
      (. builder durationInMinutes data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (.build builder)))


(defn cfn-job-template-presigned-url-config-property-builder
  "The cfn-job-template-presigned-url-config-property-builder function buildes out new instances of 
CfnJobTemplate$PresignedUrlConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expiresInSec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:expires-in-sec` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnJobTemplate$PresignedUrlConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :expires-in-sec)]
      (. builder expiresInSec data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-job-template-props-builder
  "The cfn-job-template-props-builder function buildes out new instances of 
CfnJobTemplateProps$Builder using the provided configuration.  Each field is set as follows:

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
| `timeoutConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:timeout-config` |"
  [stack id config]
  (let [builder (CfnJobTemplateProps$Builder.)]
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
    (.build builder)))


(defn cfn-job-template-rate-increase-criteria-property-builder
  "The cfn-job-template-rate-increase-criteria-property-builder function buildes out new instances of 
CfnJobTemplate$RateIncreaseCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numberOfNotifiedThings` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-notified-things` |
| `numberOfSucceededThings` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-succeeded-things` |"
  [stack id config]
  (let [builder (CfnJobTemplate$RateIncreaseCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :number-of-notified-things)]
      (. builder numberOfNotifiedThings data))
    (when-let [data (lookup-entry config id :number-of-succeeded-things)]
      (. builder numberOfSucceededThings data))
    (.build builder)))


(defn cfn-job-template-retry-criteria-property-builder
  "The cfn-job-template-retry-criteria-property-builder function buildes out new instances of 
CfnJobTemplate$RetryCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureType` | java.lang.String | [[cdk.support/lookup-entry]] | `:failure-type` |
| `numberOfRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-retries` |"
  [stack id config]
  (let [builder (CfnJobTemplate$RetryCriteriaProperty$Builder.)]
    (when-let [data (lookup-entry config id :failure-type)]
      (. builder failureType data))
    (when-let [data (lookup-entry config id :number-of-retries)]
      (. builder numberOfRetries data))
    (.build builder)))


(defn cfn-job-template-timeout-config-property-builder
  "The cfn-job-template-timeout-config-property-builder function buildes out new instances of 
CfnJobTemplate$TimeoutConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `inProgressTimeoutInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:in-progress-timeout-in-minutes` |"
  [stack id config]
  (let [builder (CfnJobTemplate$TimeoutConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :in-progress-timeout-in-minutes)]
      (. builder inProgressTimeoutInMinutes data))
    (.build builder)))


(defn cfn-logging-builder
  "The cfn-logging-builder function buildes out new instances of 
CfnLogging$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `defaultLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-log-level` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnLogging$Builder/create stack id)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :default-log-level)]
      (. builder defaultLogLevel data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-logging-props-builder
  "The cfn-logging-props-builder function buildes out new instances of 
CfnLoggingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `defaultLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-log-level` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnLoggingProps$Builder.)]
    (when-let [data (lookup-entry config id :account-id)]
      (. builder accountId data))
    (when-let [data (lookup-entry config id :default-log-level)]
      (. builder defaultLogLevel data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-mitigation-action-action-params-property-builder
  "The cfn-mitigation-action-action-params-property-builder function buildes out new instances of 
CfnMitigationAction$ActionParamsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addThingsToThingGroupParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:add-things-to-thing-group-params` |
| `enableIoTLoggingParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-io-t-logging-params` |
| `publishFindingToSnsParams` | software.amazon.awscdk.services.iot.CfnMitigationAction$PublishFindingToSnsParamsProperty | [[cdk.support/lookup-entry]] | `:publish-finding-to-sns-params` |
| `replaceDefaultPolicyVersionParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replace-default-policy-version-params` |
| `updateCaCertificateParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:update-ca-certificate-params` |
| `updateDeviceCertificateParams` | software.amazon.awscdk.services.iot.CfnMitigationAction$UpdateDeviceCertificateParamsProperty | [[cdk.support/lookup-entry]] | `:update-device-certificate-params` |"
  [stack id config]
  (let [builder (CfnMitigationAction$ActionParamsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-mitigation-action-add-things-to-thing-group-params-property-builder
  "The cfn-mitigation-action-add-things-to-thing-group-params-property-builder function buildes out new instances of 
CfnMitigationAction$AddThingsToThingGroupParamsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `overrideDynamicGroups` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:override-dynamic-groups` |
| `thingGroupNames` | java.util.List | [[cdk.support/lookup-entry]] | `:thing-group-names` |"
  [stack id config]
  (let [builder (CfnMitigationAction$AddThingsToThingGroupParamsProperty$Builder.)]
    (when-let [data (lookup-entry config id :override-dynamic-groups)]
      (. builder overrideDynamicGroups data))
    (when-let [data (lookup-entry config id :thing-group-names)]
      (. builder thingGroupNames data))
    (.build builder)))


(defn cfn-mitigation-action-builder
  "The cfn-mitigation-action-builder function buildes out new instances of 
CfnMitigationAction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `actionParams` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action-params` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMitigationAction$Builder/create stack id)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :action-params)]
      (. builder actionParams data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-mitigation-action-enable-io-t-logging-params-property-builder
  "The cfn-mitigation-action-enable-io-t-logging-params-property-builder function buildes out new instances of 
CfnMitigationAction$EnableIoTLoggingParamsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `roleArnForLogging` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn-for-logging` |"
  [stack id config]
  (let [builder (CfnMitigationAction$EnableIoTLoggingParamsProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-level)]
      (. builder logLevel data))
    (when-let [data (lookup-entry config id :role-arn-for-logging)]
      (. builder roleArnForLogging data))
    (.build builder)))


(defn cfn-mitigation-action-props-builder
  "The cfn-mitigation-action-props-builder function buildes out new instances of 
CfnMitigationActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
| `actionParams` | software.amazon.awscdk.services.iot.CfnMitigationAction$ActionParamsProperty | [[cdk.support/lookup-entry]] | `:action-params` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMitigationActionProps$Builder.)]
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (when-let [data (lookup-entry config id :action-params)]
      (. builder actionParams data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-mitigation-action-publish-finding-to-sns-params-property-builder
  "The cfn-mitigation-action-publish-finding-to-sns-params-property-builder function buildes out new instances of 
CfnMitigationAction$PublishFindingToSnsParamsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `topicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic-arn` |"
  [stack id config]
  (let [builder (CfnMitigationAction$PublishFindingToSnsParamsProperty$Builder.)]
    (when-let [data (lookup-entry config id :topic-arn)]
      (. builder topicArn data))
    (.build builder)))


(defn cfn-mitigation-action-replace-default-policy-version-params-property-builder
  "The cfn-mitigation-action-replace-default-policy-version-params-property-builder function buildes out new instances of 
CfnMitigationAction$ReplaceDefaultPolicyVersionParamsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |"
  [stack id config]
  (let [builder (CfnMitigationAction$ReplaceDefaultPolicyVersionParamsProperty$Builder.)]
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (.build builder)))


(defn cfn-mitigation-action-update-ca-certificate-params-property-builder
  "The cfn-mitigation-action-update-ca-certificate-params-property-builder function buildes out new instances of 
CfnMitigationAction$UpdateCACertificateParamsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |"
  [stack id config]
  (let [builder (CfnMitigationAction$UpdateCACertificateParamsProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (.build builder)))


(defn cfn-mitigation-action-update-device-certificate-params-property-builder
  "The cfn-mitigation-action-update-device-certificate-params-property-builder function buildes out new instances of 
CfnMitigationAction$UpdateDeviceCertificateParamsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |"
  [stack id config]
  (let [builder (CfnMitigationAction$UpdateDeviceCertificateParamsProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (.build builder)))


(defn cfn-policy-builder
  "The cfn-policy-builder function buildes out new instances of 
CfnPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-policy-principal-attachment-builder
  "The cfn-policy-principal-attachment-builder function buildes out new instances of 
CfnPolicyPrincipalAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |"
  [stack id config]
  (let [builder (CfnPolicyPrincipalAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (.build builder)))


(defn cfn-policy-principal-attachment-props-builder
  "The cfn-policy-principal-attachment-props-builder function buildes out new instances of 
CfnPolicyPrincipalAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |"
  [stack id config]
  (let [builder (CfnPolicyPrincipalAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (.build builder)))


(defn cfn-policy-props-builder
  "The cfn-policy-props-builder function buildes out new instances of 
CfnPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyDocument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy-document` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy-document)]
      (. builder policyDocument data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-provisioning-template-builder
  "The cfn-provisioning-template-builder function buildes out new instances of 
CfnProvisioningTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `preProvisioningHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pre-provisioning-hook` |
| `provisioningRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `templateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-type` |"
  [stack id config]
  (let [builder (CfnProvisioningTemplate$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-provisioning-template-props-builder
  "The cfn-provisioning-template-props-builder function buildes out new instances of 
CfnProvisioningTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `preProvisioningHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:pre-provisioning-hook` |
| `provisioningRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:provisioning-role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `templateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-body` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `templateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-type` |"
  [stack id config]
  (let [builder (CfnProvisioningTemplateProps$Builder.)]
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
    (.build builder)))


(defn cfn-provisioning-template-provisioning-hook-property-builder
  "The cfn-provisioning-template-provisioning-hook-property-builder function buildes out new instances of 
CfnProvisioningTemplate$ProvisioningHookProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `payloadVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-version` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnProvisioningTemplate$ProvisioningHookProperty$Builder.)]
    (when-let [data (lookup-entry config id :payload-version)]
      (. builder payloadVersion data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-resource-specific-logging-builder
  "The cfn-resource-specific-logging-builder function buildes out new instances of 
CfnResourceSpecificLogging$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `targetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-name` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |"
  [stack id config]
  (let [builder (CfnResourceSpecificLogging$Builder/create stack id)]
    (when-let [data (lookup-entry config id :log-level)]
      (. builder logLevel data))
    (when-let [data (lookup-entry config id :target-name)]
      (. builder targetName data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (.build builder)))


(defn cfn-resource-specific-logging-props-builder
  "The cfn-resource-specific-logging-props-builder function buildes out new instances of 
CfnResourceSpecificLoggingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-level` |
| `targetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-name` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |"
  [stack id config]
  (let [builder (CfnResourceSpecificLoggingProps$Builder.)]
    (when-let [data (lookup-entry config id :log-level)]
      (. builder logLevel data))
    (when-let [data (lookup-entry config id :target-name)]
      (. builder targetName data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (.build builder)))


(defn cfn-role-alias-builder
  "The cfn-role-alias-builder function buildes out new instances of 
CfnRoleAlias$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:credential-duration-seconds` |
| `roleAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-alias` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRoleAlias$Builder/create stack id)]
    (when-let [data (lookup-entry config id :credential-duration-seconds)]
      (. builder credentialDurationSeconds data))
    (when-let [data (lookup-entry config id :role-alias)]
      (. builder roleAlias data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-role-alias-props-builder
  "The cfn-role-alias-props-builder function buildes out new instances of 
CfnRoleAliasProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `credentialDurationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:credential-duration-seconds` |
| `roleAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-alias` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRoleAliasProps$Builder.)]
    (when-let [data (lookup-entry config id :credential-duration-seconds)]
      (. builder credentialDurationSeconds data))
    (when-let [data (lookup-entry config id :role-alias)]
      (. builder roleAlias data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-scheduled-audit-builder
  "The cfn-scheduled-audit-builder function buildes out new instances of 
CfnScheduledAudit$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfMonth` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-month` |
| `dayOfWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-week` |
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |
| `scheduledAuditName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-audit-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetCheckNames` | java.util.List | [[cdk.support/lookup-entry]] | `:target-check-names` |"
  [stack id config]
  (let [builder (CfnScheduledAudit$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-scheduled-audit-props-builder
  "The cfn-scheduled-audit-props-builder function buildes out new instances of 
CfnScheduledAuditProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfMonth` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-month` |
| `dayOfWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-week` |
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |
| `scheduledAuditName` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheduled-audit-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetCheckNames` | java.util.List | [[cdk.support/lookup-entry]] | `:target-check-names` |"
  [stack id config]
  (let [builder (CfnScheduledAuditProps$Builder.)]
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
    (.build builder)))


(defn cfn-security-profile-alert-target-property-builder
  "The cfn-security-profile-alert-target-property-builder function buildes out new instances of 
CfnSecurityProfile$AlertTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alertTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alert-target-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$AlertTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :alert-target-arn)]
      (. builder alertTargetArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-security-profile-behavior-criteria-property-builder
  "The cfn-security-profile-behavior-criteria-property-builder function buildes out new instances of 
CfnSecurityProfile$BehaviorCriteriaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `consecutiveDatapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:consecutive-datapoints-to-alarm` |
| `consecutiveDatapointsToClear` | java.lang.Number | [[cdk.support/lookup-entry]] | `:consecutive-datapoints-to-clear` |
| `durationSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-seconds` |
| `mlDetectionConfig` | software.amazon.awscdk.services.iot.CfnSecurityProfile$MachineLearningDetectionConfigProperty | [[cdk.support/lookup-entry]] | `:ml-detection-config` |
| `statisticalThreshold` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:statistical-threshold` |
| `value` | software.amazon.awscdk.services.iot.CfnSecurityProfile$MetricValueProperty | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$BehaviorCriteriaProperty$Builder.)]
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
    (.build builder)))


(defn cfn-security-profile-behavior-property-builder
  "The cfn-security-profile-behavior-property-builder function buildes out new instances of 
CfnSecurityProfile$BehaviorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `criteria` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:criteria` |
| `exportMetric` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:export-metric` |
| `metric` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric` |
| `metricDimension` | software.amazon.awscdk.services.iot.CfnSecurityProfile$MetricDimensionProperty | [[cdk.support/lookup-entry]] | `:metric-dimension` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `suppressAlerts` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:suppress-alerts` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$BehaviorProperty$Builder.)]
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
    (.build builder)))


(defn cfn-security-profile-builder
  "The cfn-security-profile-builder function buildes out new instances of 
CfnSecurityProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalMetricsToRetainV2` | java.util.List | [[cdk.support/lookup-entry]] | `:additional-metrics-to-retain-v2` |
| `alertTargets` | java.util.Map | [[cdk.support/lookup-entry]] | `:alert-targets` |
| `behaviors` | java.util.List | [[cdk.support/lookup-entry]] | `:behaviors` |
| `metricsExportConfig` | software.amazon.awscdk.services.iot.CfnSecurityProfile$MetricsExportConfigProperty | [[cdk.support/lookup-entry]] | `:metrics-export-config` |
| `securityProfileDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-profile-description` |
| `securityProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-profile-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:target-arns` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-security-profile-machine-learning-detection-config-property-builder
  "The cfn-security-profile-machine-learning-detection-config-property-builder function buildes out new instances of 
CfnSecurityProfile$MachineLearningDetectionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `confidenceLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:confidence-level` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$MachineLearningDetectionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :confidence-level)]
      (. builder confidenceLevel data))
    (.build builder)))


(defn cfn-security-profile-metric-dimension-property-builder
  "The cfn-security-profile-metric-dimension-property-builder function buildes out new instances of 
CfnSecurityProfile$MetricDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-name` |
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$MetricDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimension-name)]
      (. builder dimensionName data))
    (when-let [data (lookup-entry config id :operator)]
      (. builder operator data))
    (.build builder)))


(defn cfn-security-profile-metric-to-retain-property-builder
  "The cfn-security-profile-metric-to-retain-property-builder function buildes out new instances of 
CfnSecurityProfile$MetricToRetainProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `exportMetric` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:export-metric` |
| `metric` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric` |
| `metricDimension` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-dimension` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$MetricToRetainProperty$Builder.)]
    (when-let [data (lookup-entry config id :export-metric)]
      (. builder exportMetric data))
    (when-let [data (lookup-entry config id :metric)]
      (. builder metric data))
    (when-let [data (lookup-entry config id :metric-dimension)]
      (. builder metricDimension data))
    (.build builder)))


(defn cfn-security-profile-metric-value-property-builder
  "The cfn-security-profile-metric-value-property-builder function buildes out new instances of 
CfnSecurityProfile$MetricValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrs` | java.util.List | [[cdk.support/lookup-entry]] | `:cidrs` |
| `count` | java.lang.String | [[cdk.support/lookup-entry]] | `:count` |
| `number` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number` |
| `numbers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:numbers` |
| `ports` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ports` |
| `strings` | java.util.List | [[cdk.support/lookup-entry]] | `:strings` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$MetricValueProperty$Builder.)]
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
    (.build builder)))


(defn cfn-security-profile-metrics-export-config-property-builder
  "The cfn-security-profile-metrics-export-config-property-builder function buildes out new instances of 
CfnSecurityProfile$MetricsExportConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mqttTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:mqtt-topic` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$MetricsExportConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :mqtt-topic)]
      (. builder mqttTopic data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-security-profile-props-builder
  "The cfn-security-profile-props-builder function buildes out new instances of 
CfnSecurityProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalMetricsToRetainV2` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-metrics-to-retain-v2` |
| `alertTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alert-targets` |
| `behaviors` | java.util.List | [[cdk.support/lookup-entry]] | `:behaviors` |
| `metricsExportConfig` | software.amazon.awscdk.services.iot.CfnSecurityProfile$MetricsExportConfigProperty | [[cdk.support/lookup-entry]] | `:metrics-export-config` |
| `securityProfileDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-profile-description` |
| `securityProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-profile-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArns` | java.util.List | [[cdk.support/lookup-entry]] | `:target-arns` |"
  [stack id config]
  (let [builder (CfnSecurityProfileProps$Builder.)]
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
    (.build builder)))


(defn cfn-security-profile-statistical-threshold-property-builder
  "The cfn-security-profile-statistical-threshold-property-builder function buildes out new instances of 
CfnSecurityProfile$StatisticalThresholdProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statistic` | java.lang.String | [[cdk.support/lookup-entry]] | `:statistic` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$StatisticalThresholdProperty$Builder.)]
    (when-let [data (lookup-entry config id :statistic)]
      (. builder statistic data))
    (.build builder)))


(defn cfn-software-package-builder
  "The cfn-software-package-builder function buildes out new instances of 
CfnSoftwarePackage$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSoftwarePackage$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :package-name)]
      (. builder packageName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-software-package-props-builder
  "The cfn-software-package-props-builder function buildes out new instances of 
CfnSoftwarePackageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSoftwarePackageProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :package-name)]
      (. builder packageName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-software-package-version-builder
  "The cfn-software-package-version-builder function buildes out new instances of 
CfnSoftwarePackageVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `versionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-name` |"
  [stack id config]
  (let [builder (CfnSoftwarePackageVersion$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-software-package-version-props-builder
  "The cfn-software-package-version-props-builder function buildes out new instances of 
CfnSoftwarePackageVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `packageName` | java.lang.String | [[cdk.support/lookup-entry]] | `:package-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `versionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-name` |"
  [stack id config]
  (let [builder (CfnSoftwarePackageVersionProps$Builder.)]
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
    (.build builder)))


(defn cfn-thing-attribute-payload-property-builder
  "The cfn-thing-attribute-payload-property-builder function buildes out new instances of 
CfnThing$AttributePayloadProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |"
  [stack id config]
  (let [builder (CfnThing$AttributePayloadProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (.build builder)))


(defn cfn-thing-builder
  "The cfn-thing-builder function buildes out new instances of 
CfnThing$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributePayload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-payload` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |"
  [stack id config]
  (let [builder (CfnThing$Builder/create stack id)]
    (when-let [data (lookup-entry config id :attribute-payload)]
      (. builder attributePayload data))
    (when-let [data (lookup-entry config id :thing-name)]
      (. builder thingName data))
    (.build builder)))


(defn cfn-thing-group-attribute-payload-property-builder
  "The cfn-thing-group-attribute-payload-property-builder function buildes out new instances of 
CfnThingGroup$AttributePayloadProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:attributes` |"
  [stack id config]
  (let [builder (CfnThingGroup$AttributePayloadProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (.build builder)))


(defn cfn-thing-group-builder
  "The cfn-thing-group-builder function buildes out new instances of 
CfnThingGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-group-name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-group-name` |
| `thingGroupProperties` | software.amazon.awscdk.services.iot.CfnThingGroup$ThingGroupPropertiesProperty | [[cdk.support/lookup-entry]] | `:thing-group-properties` |"
  [stack id config]
  (let [builder (CfnThingGroup$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-thing-group-props-builder
  "The cfn-thing-group-props-builder function buildes out new instances of 
CfnThingGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parentGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-group-name` |
| `queryString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-group-name` |
| `thingGroupProperties` | software.amazon.awscdk.services.iot.CfnThingGroup$ThingGroupPropertiesProperty | [[cdk.support/lookup-entry]] | `:thing-group-properties` |"
  [stack id config]
  (let [builder (CfnThingGroupProps$Builder.)]
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
    (.build builder)))


(defn cfn-thing-group-thing-group-properties-property-builder
  "The cfn-thing-group-thing-group-properties-property-builder function buildes out new instances of 
CfnThingGroup$ThingGroupPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributePayload` | software.amazon.awscdk.services.iot.CfnThingGroup$AttributePayloadProperty | [[cdk.support/lookup-entry]] | `:attribute-payload` |
| `thingGroupDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-group-description` |"
  [stack id config]
  (let [builder (CfnThingGroup$ThingGroupPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-payload)]
      (. builder attributePayload data))
    (when-let [data (lookup-entry config id :thing-group-description)]
      (. builder thingGroupDescription data))
    (.build builder)))


(defn cfn-thing-principal-attachment-builder
  "The cfn-thing-principal-attachment-builder function buildes out new instances of 
CfnThingPrincipalAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |"
  [stack id config]
  (let [builder (CfnThingPrincipalAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (when-let [data (lookup-entry config id :thing-name)]
      (. builder thingName data))
    (.build builder)))


(defn cfn-thing-principal-attachment-props-builder
  "The cfn-thing-principal-attachment-props-builder function buildes out new instances of 
CfnThingPrincipalAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `principal` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |"
  [stack id config]
  (let [builder (CfnThingPrincipalAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :principal)]
      (. builder principal data))
    (when-let [data (lookup-entry config id :thing-name)]
      (. builder thingName data))
    (.build builder)))


(defn cfn-thing-props-builder
  "The cfn-thing-props-builder function buildes out new instances of 
CfnThingProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributePayload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute-payload` |
| `thingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-name` |"
  [stack id config]
  (let [builder (CfnThingProps$Builder.)]
    (when-let [data (lookup-entry config id :attribute-payload)]
      (. builder attributePayload data))
    (when-let [data (lookup-entry config id :thing-name)]
      (. builder thingName data))
    (.build builder)))


(defn cfn-thing-type-builder
  "The cfn-thing-type-builder function buildes out new instances of 
CfnThingType$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deprecateThingType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:deprecate-thing-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-type-name` |
| `thingTypeProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:thing-type-properties` |"
  [stack id config]
  (let [builder (CfnThingType$Builder/create stack id)]
    (when-let [data (lookup-entry config id :deprecate-thing-type)]
      (. builder deprecateThingType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :thing-type-name)]
      (. builder thingTypeName data))
    (when-let [data (lookup-entry config id :thing-type-properties)]
      (. builder thingTypeProperties data))
    (.build builder)))


(defn cfn-thing-type-props-builder
  "The cfn-thing-type-props-builder function buildes out new instances of 
CfnThingTypeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deprecateThingType` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:deprecate-thing-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `thingTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-type-name` |
| `thingTypeProperties` | software.amazon.awscdk.services.iot.CfnThingType$ThingTypePropertiesProperty | [[cdk.support/lookup-entry]] | `:thing-type-properties` |"
  [stack id config]
  (let [builder (CfnThingTypeProps$Builder.)]
    (when-let [data (lookup-entry config id :deprecate-thing-type)]
      (. builder deprecateThingType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :thing-type-name)]
      (. builder thingTypeName data))
    (when-let [data (lookup-entry config id :thing-type-properties)]
      (. builder thingTypeProperties data))
    (.build builder)))


(defn cfn-thing-type-thing-type-properties-property-builder
  "The cfn-thing-type-thing-type-properties-property-builder function buildes out new instances of 
CfnThingType$ThingTypePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `searchableAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:searchable-attributes` |
| `thingTypeDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:thing-type-description` |"
  [stack id config]
  (let [builder (CfnThingType$ThingTypePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :searchable-attributes)]
      (. builder searchableAttributes data))
    (when-let [data (lookup-entry config id :thing-type-description)]
      (. builder thingTypeDescription data))
    (.build builder)))


(defn cfn-topic-rule-action-property-builder
  "The cfn-topic-rule-action-property-builder function buildes out new instances of 
CfnTopicRule$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `timestream` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestream` |"
  [stack id config]
  (let [builder (CfnTopicRule$ActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-topic-rule-asset-property-timestamp-property-builder
  "The cfn-topic-rule-asset-property-timestamp-property-builder function buildes out new instances of 
CfnTopicRule$AssetPropertyTimestampProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `offsetInNanos` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset-in-nanos` |
| `timeInSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-in-seconds` |"
  [stack id config]
  (let [builder (CfnTopicRule$AssetPropertyTimestampProperty$Builder.)]
    (when-let [data (lookup-entry config id :offset-in-nanos)]
      (. builder offsetInNanos data))
    (when-let [data (lookup-entry config id :time-in-seconds)]
      (. builder timeInSeconds data))
    (.build builder)))


(defn cfn-topic-rule-asset-property-value-property-builder
  "The cfn-topic-rule-asset-property-value-property-builder function buildes out new instances of 
CfnTopicRule$AssetPropertyValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `quality` | java.lang.String | [[cdk.support/lookup-entry]] | `:quality` |
| `timestamp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestamp` |
| `value` | software.amazon.awscdk.services.iot.CfnTopicRule$AssetPropertyVariantProperty | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTopicRule$AssetPropertyValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :quality)]
      (. builder quality data))
    (when-let [data (lookup-entry config id :timestamp)]
      (. builder timestamp data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-topic-rule-asset-property-variant-property-builder
  "The cfn-topic-rule-asset-property-variant-property-builder function buildes out new instances of 
CfnTopicRule$AssetPropertyVariantProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:double-value` |
| `integerValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:integer-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |"
  [stack id config]
  (let [builder (CfnTopicRule$AssetPropertyVariantProperty$Builder.)]
    (when-let [data (lookup-entry config id :boolean-value)]
      (. builder booleanValue data))
    (when-let [data (lookup-entry config id :double-value)]
      (. builder doubleValue data))
    (when-let [data (lookup-entry config id :integer-value)]
      (. builder integerValue data))
    (when-let [data (lookup-entry config id :string-value)]
      (. builder stringValue data))
    (.build builder)))


(defn cfn-topic-rule-builder
  "The cfn-topic-rule-builder function buildes out new instances of 
CfnTopicRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topicRulePayload` | software.amazon.awscdk.services.iot.CfnTopicRule$TopicRulePayloadProperty | [[cdk.support/lookup-entry]] | `:topic-rule-payload` |"
  [stack id config]
  (let [builder (CfnTopicRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :topic-rule-payload)]
      (. builder topicRulePayload data))
    (.build builder)))


(defn cfn-topic-rule-cloudwatch-alarm-action-property-builder
  "The cfn-topic-rule-cloudwatch-alarm-action-property-builder function buildes out new instances of 
CfnTopicRule$CloudwatchAlarmActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stateReason` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-reason` |
| `stateValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-value` |"
  [stack id config]
  (let [builder (CfnTopicRule$CloudwatchAlarmActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :state-reason)]
      (. builder stateReason data))
    (when-let [data (lookup-entry config id :state-value)]
      (. builder stateValue data))
    (.build builder)))


(defn cfn-topic-rule-cloudwatch-logs-action-property-builder
  "The cfn-topic-rule-cloudwatch-logs-action-property-builder function buildes out new instances of 
CfnTopicRule$CloudwatchLogsActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-mode` |
| `logGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnTopicRule$CloudwatchLogsActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-mode)]
      (. builder batchMode data))
    (when-let [data (lookup-entry config id :log-group-name)]
      (. builder logGroupName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-topic-rule-cloudwatch-metric-action-property-builder
  "The cfn-topic-rule-cloudwatch-metric-action-property-builder function buildes out new instances of 
CfnTopicRule$CloudwatchMetricActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `metricNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-namespace` |
| `metricTimestamp` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-timestamp` |
| `metricUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-unit` |
| `metricValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-value` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnTopicRule$CloudwatchMetricActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-topic-rule-destination-builder
  "The cfn-topic-rule-destination-builder function buildes out new instances of 
CfnTopicRuleDestination$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpUrlProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:http-url-properties` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `vpcProperties` | software.amazon.awscdk.services.iot.CfnTopicRuleDestination$VpcDestinationPropertiesProperty | [[cdk.support/lookup-entry]] | `:vpc-properties` |"
  [stack id config]
  (let [builder (CfnTopicRuleDestination$Builder/create stack id)]
    (when-let [data (lookup-entry config id :http-url-properties)]
      (. builder httpUrlProperties data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :vpc-properties)]
      (. builder vpcProperties data))
    (.build builder)))


(defn cfn-topic-rule-destination-http-url-destination-summary-property-builder
  "The cfn-topic-rule-destination-http-url-destination-summary-property-builder function buildes out new instances of 
CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `confirmationUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:confirmation-url` |"
  [stack id config]
  (let [builder (CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty$Builder.)]
    (when-let [data (lookup-entry config id :confirmation-url)]
      (. builder confirmationUrl data))
    (.build builder)))


(defn cfn-topic-rule-destination-props-builder
  "The cfn-topic-rule-destination-props-builder function buildes out new instances of 
CfnTopicRuleDestinationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `httpUrlProperties` | software.amazon.awscdk.services.iot.CfnTopicRuleDestination$HttpUrlDestinationSummaryProperty | [[cdk.support/lookup-entry]] | `:http-url-properties` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `vpcProperties` | software.amazon.awscdk.services.iot.CfnTopicRuleDestination$VpcDestinationPropertiesProperty | [[cdk.support/lookup-entry]] | `:vpc-properties` |"
  [stack id config]
  (let [builder (CfnTopicRuleDestinationProps$Builder.)]
    (when-let [data (lookup-entry config id :http-url-properties)]
      (. builder httpUrlProperties data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :vpc-properties)]
      (. builder vpcProperties data))
    (.build builder)))


(defn cfn-topic-rule-destination-vpc-destination-properties-property-builder
  "The cfn-topic-rule-destination-vpc-destination-properties-property-builder function buildes out new instances of 
CfnTopicRuleDestination$VpcDestinationPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnTopicRuleDestination$VpcDestinationPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-topic-rule-dynamo-d-bv2-action-property-builder
  "The cfn-topic-rule-dynamo-d-bv2-action-property-builder function buildes out new instances of 
CfnTopicRule$DynamoDBv2ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `putItem` | software.amazon.awscdk.services.iot.CfnTopicRule$PutItemInputProperty | [[cdk.support/lookup-entry]] | `:put-item` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnTopicRule$DynamoDBv2ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :put-item)]
      (. builder putItem data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-topic-rule-dynamo-db-action-property-builder
  "The cfn-topic-rule-dynamo-db-action-property-builder function buildes out new instances of 
CfnTopicRule$DynamoDBActionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnTopicRule$DynamoDBActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-topic-rule-elasticsearch-action-property-builder
  "The cfn-topic-rule-elasticsearch-action-property-builder function buildes out new instances of 
CfnTopicRule$ElasticsearchActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `index` | java.lang.String | [[cdk.support/lookup-entry]] | `:index` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTopicRule$ElasticsearchActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-topic-rule-firehose-action-property-builder
  "The cfn-topic-rule-firehose-action-property-builder function buildes out new instances of 
CfnTopicRule$FirehoseActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-mode` |
| `deliveryStreamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-stream-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `separator` | java.lang.String | [[cdk.support/lookup-entry]] | `:separator` |"
  [stack id config]
  (let [builder (CfnTopicRule$FirehoseActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-mode)]
      (. builder batchMode data))
    (when-let [data (lookup-entry config id :delivery-stream-name)]
      (. builder deliveryStreamName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :separator)]
      (. builder separator data))
    (.build builder)))


(defn cfn-topic-rule-http-action-header-property-builder
  "The cfn-topic-rule-http-action-header-property-builder function buildes out new instances of 
CfnTopicRule$HttpActionHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTopicRule$HttpActionHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-topic-rule-http-action-property-builder
  "The cfn-topic-rule-http-action-property-builder function buildes out new instances of 
CfnTopicRule$HttpActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `auth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auth` |
| `confirmationUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:confirmation-url` |
| `headers` | java.util.List | [[cdk.support/lookup-entry]] | `:headers` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnTopicRule$HttpActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :auth)]
      (. builder auth data))
    (when-let [data (lookup-entry config id :confirmation-url)]
      (. builder confirmationUrl data))
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-topic-rule-http-authorization-property-builder
  "The cfn-topic-rule-http-authorization-property-builder function buildes out new instances of 
CfnTopicRule$HttpAuthorizationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sigv4` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sigv4` |"
  [stack id config]
  (let [builder (CfnTopicRule$HttpAuthorizationProperty$Builder.)]
    (when-let [data (lookup-entry config id :sigv4)]
      (. builder sigv4 data))
    (.build builder)))


(defn cfn-topic-rule-iot-analytics-action-property-builder
  "The cfn-topic-rule-iot-analytics-action-property-builder function buildes out new instances of 
CfnTopicRule$IotAnalyticsActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-mode` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnTopicRule$IotAnalyticsActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-mode)]
      (. builder batchMode data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-topic-rule-iot-events-action-property-builder
  "The cfn-topic-rule-iot-events-action-property-builder function buildes out new instances of 
CfnTopicRule$IotEventsActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `batchMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:batch-mode` |
| `inputName` | java.lang.String | [[cdk.support/lookup-entry]] | `:input-name` |
| `messageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnTopicRule$IotEventsActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :batch-mode)]
      (. builder batchMode data))
    (when-let [data (lookup-entry config id :input-name)]
      (. builder inputName data))
    (when-let [data (lookup-entry config id :message-id)]
      (. builder messageId data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-topic-rule-iot-site-wise-action-property-builder
  "The cfn-topic-rule-iot-site-wise-action-property-builder function buildes out new instances of 
CfnTopicRule$IotSiteWiseActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `putAssetPropertyValueEntries` | java.util.List | [[cdk.support/lookup-entry]] | `:put-asset-property-value-entries` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnTopicRule$IotSiteWiseActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :put-asset-property-value-entries)]
      (. builder putAssetPropertyValueEntries data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-topic-rule-kafka-action-header-property-builder
  "The cfn-topic-rule-kafka-action-header-property-builder function buildes out new instances of 
CfnTopicRule$KafkaActionHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTopicRule$KafkaActionHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-topic-rule-kafka-action-property-builder
  "The cfn-topic-rule-kafka-action-property-builder function buildes out new instances of 
CfnTopicRule$KafkaActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:client-properties` |
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `headers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:headers` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `partition` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition` |
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (CfnTopicRule$KafkaActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-topic-rule-kinesis-action-property-builder
  "The cfn-topic-rule-kinesis-action-property-builder function buildes out new instances of 
CfnTopicRule$KinesisActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `partitionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:partition-key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `streamName` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-name` |"
  [stack id config]
  (let [builder (CfnTopicRule$KinesisActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :partition-key)]
      (. builder partitionKey data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :stream-name)]
      (. builder streamName data))
    (.build builder)))


(defn cfn-topic-rule-lambda-action-property-builder
  "The cfn-topic-rule-lambda-action-property-builder function buildes out new instances of 
CfnTopicRule$LambdaActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-arn` |"
  [stack id config]
  (let [builder (CfnTopicRule$LambdaActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :function-arn)]
      (. builder functionArn data))
    (.build builder)))


(defn cfn-topic-rule-location-action-property-builder
  "The cfn-topic-rule-location-action-property-builder function buildes out new instances of 
CfnTopicRule$LocationActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:device-id` |
| `latitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:longitude` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `timestamp` | software.amazon.awscdk.services.iot.CfnTopicRule$TimestampProperty | [[cdk.support/lookup-entry]] | `:timestamp` |
| `trackerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracker-name` |"
  [stack id config]
  (let [builder (CfnTopicRule$LocationActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-topic-rule-open-search-action-property-builder
  "The cfn-topic-rule-open-search-action-property-builder function buildes out new instances of 
CfnTopicRule$OpenSearchActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:endpoint` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `index` | java.lang.String | [[cdk.support/lookup-entry]] | `:index` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTopicRule$OpenSearchActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-topic-rule-props-builder
  "The cfn-topic-rule-props-builder function buildes out new instances of 
CfnTopicRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `topicRulePayload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:topic-rule-payload` |"
  [stack id config]
  (let [builder (CfnTopicRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :topic-rule-payload)]
      (. builder topicRulePayload data))
    (.build builder)))


(defn cfn-topic-rule-put-asset-property-value-entry-property-builder
  "The cfn-topic-rule-put-asset-property-value-entry-property-builder function buildes out new instances of 
CfnTopicRule$PutAssetPropertyValueEntryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-id` |
| `entryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry-id` |
| `propertyAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-alias` |
| `propertyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-id` |
| `propertyValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-values` |"
  [stack id config]
  (let [builder (CfnTopicRule$PutAssetPropertyValueEntryProperty$Builder.)]
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
    (.build builder)))


(defn cfn-topic-rule-put-item-input-property-builder
  "The cfn-topic-rule-put-item-input-property-builder function buildes out new instances of 
CfnTopicRule$PutItemInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |"
  [stack id config]
  (let [builder (CfnTopicRule$PutItemInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :table-name)]
      (. builder tableName data))
    (.build builder)))


(defn cfn-topic-rule-republish-action-headers-property-builder
  "The cfn-topic-rule-republish-action-headers-property-builder function buildes out new instances of 
CfnTopicRule$RepublishActionHeadersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `correlationData` | java.lang.String | [[cdk.support/lookup-entry]] | `:correlation-data` |
| `messageExpiry` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-expiry` |
| `payloadFormatIndicator` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-format-indicator` |
| `responseTopic` | java.lang.String | [[cdk.support/lookup-entry]] | `:response-topic` |
| `userProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:user-properties` |"
  [stack id config]
  (let [builder (CfnTopicRule$RepublishActionHeadersProperty$Builder.)]
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
    (.build builder)))


(defn cfn-topic-rule-republish-action-property-builder
  "The cfn-topic-rule-republish-action-property-builder function buildes out new instances of 
CfnTopicRule$RepublishActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headers` | software.amazon.awscdk.services.iot.CfnTopicRule$RepublishActionHeadersProperty | [[cdk.support/lookup-entry]] | `:headers` |
| `qos` | java.lang.Number | [[cdk.support/lookup-entry]] | `:qos` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `topic` | java.lang.String | [[cdk.support/lookup-entry]] | `:topic` |"
  [stack id config]
  (let [builder (CfnTopicRule$RepublishActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :headers)]
      (. builder headers data))
    (when-let [data (lookup-entry config id :qos)]
      (. builder qos data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :topic)]
      (. builder topic data))
    (.build builder)))


(defn cfn-topic-rule-s3-action-property-builder
  "The cfn-topic-rule-s3-action-property-builder function buildes out new instances of 
CfnTopicRule$S3ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `cannedAcl` | java.lang.String | [[cdk.support/lookup-entry]] | `:canned-acl` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnTopicRule$S3ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :canned-acl)]
      (. builder cannedAcl data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-topic-rule-sig-v4-authorization-property-builder
  "The cfn-topic-rule-sig-v4-authorization-property-builder function buildes out new instances of 
CfnTopicRule$SigV4AuthorizationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `signingRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:signing-region` |"
  [stack id config]
  (let [builder (CfnTopicRule$SigV4AuthorizationProperty$Builder.)]
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :signing-region)]
      (. builder signingRegion data))
    (.build builder)))


(defn cfn-topic-rule-sns-action-property-builder
  "The cfn-topic-rule-sns-action-property-builder function buildes out new instances of 
CfnTopicRule$SnsActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `messageFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-format` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |"
  [stack id config]
  (let [builder (CfnTopicRule$SnsActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :message-format)]
      (. builder messageFormat data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (.build builder)))


(defn cfn-topic-rule-sqs-action-property-builder
  "The cfn-topic-rule-sqs-action-property-builder function buildes out new instances of 
CfnTopicRule$SqsActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `queueUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-url` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `useBase64` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-base64` |"
  [stack id config]
  (let [builder (CfnTopicRule$SqsActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :queue-url)]
      (. builder queueUrl data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :use-base64)]
      (. builder useBase64 data))
    (.build builder)))


(defn cfn-topic-rule-step-functions-action-property-builder
  "The cfn-topic-rule-step-functions-action-property-builder function buildes out new instances of 
CfnTopicRule$StepFunctionsActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executionNamePrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-name-prefix` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stateMachineName` | java.lang.String | [[cdk.support/lookup-entry]] | `:state-machine-name` |"
  [stack id config]
  (let [builder (CfnTopicRule$StepFunctionsActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :execution-name-prefix)]
      (. builder executionNamePrefix data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :state-machine-name)]
      (. builder stateMachineName data))
    (.build builder)))


(defn cfn-topic-rule-timestamp-property-builder
  "The cfn-topic-rule-timestamp-property-builder function buildes out new instances of 
CfnTopicRule$TimestampProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTopicRule$TimestampProperty$Builder.)]
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-topic-rule-timestream-action-property-builder
  "The cfn-topic-rule-timestream-action-property-builder function buildes out new instances of 
CfnTopicRule$TimestreamActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `databaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:database-name` |
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tableName` | java.lang.String | [[cdk.support/lookup-entry]] | `:table-name` |
| `timestamp` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timestamp` |"
  [stack id config]
  (let [builder (CfnTopicRule$TimestreamActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-topic-rule-timestream-dimension-property-builder
  "The cfn-topic-rule-timestream-dimension-property-builder function buildes out new instances of 
CfnTopicRule$TimestreamDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTopicRule$TimestreamDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-topic-rule-timestream-timestamp-property-builder
  "The cfn-topic-rule-timestream-timestamp-property-builder function buildes out new instances of 
CfnTopicRule$TimestreamTimestampProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTopicRule$TimestreamTimestampProperty$Builder.)]
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-topic-rule-topic-rule-payload-property-builder
  "The cfn-topic-rule-topic-rule-payload-property-builder function buildes out new instances of 
CfnTopicRule$TopicRulePayloadProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `awsIotSqlVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-iot-sql-version` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `errorAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error-action` |
| `ruleDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rule-disabled` |
| `sql` | java.lang.String | [[cdk.support/lookup-entry]] | `:sql` |"
  [stack id config]
  (let [builder (CfnTopicRule$TopicRulePayloadProperty$Builder.)]
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
    (.build builder)))


(defn cfn-topic-rule-user-property-property-builder
  "The cfn-topic-rule-user-property-property-builder function buildes out new instances of 
CfnTopicRule$UserPropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnTopicRule$UserPropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))