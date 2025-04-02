(ns cdk.api.services.lightsail
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lightsail package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lightsail CfnAlarm$Builder
                                                      CfnAlarmProps$Builder
                                                      CfnBucket$AccessRulesProperty$Builder
                                                      CfnBucket$Builder
                                                      CfnBucketProps$Builder
                                                      CfnCertificate$Builder
                                                      CfnCertificateProps$Builder
                                                      CfnContainer$Builder
                                                      CfnContainer$ContainerProperty$Builder
                                                      CfnContainer$ContainerServiceDeploymentProperty$Builder
                                                      CfnContainer$EcrImagePullerRoleProperty$Builder
                                                      CfnContainer$EnvironmentVariableProperty$Builder
                                                      CfnContainer$HealthCheckConfigProperty$Builder
                                                      CfnContainer$PortInfoProperty$Builder
                                                      CfnContainer$PrivateRegistryAccessProperty$Builder
                                                      CfnContainer$PublicDomainNameProperty$Builder
                                                      CfnContainer$PublicEndpointProperty$Builder
                                                      CfnContainerProps$Builder
                                                      CfnDatabase$Builder
                                                      CfnDatabase$RelationalDatabaseParameterProperty$Builder
                                                      CfnDatabaseProps$Builder
                                                      CfnDisk$AddOnProperty$Builder
                                                      CfnDisk$AutoSnapshotAddOnProperty$Builder
                                                      CfnDisk$Builder
                                                      CfnDisk$LocationProperty$Builder
                                                      CfnDiskProps$Builder
                                                      CfnDistribution$Builder
                                                      CfnDistribution$CacheBehaviorPerPathProperty$Builder
                                                      CfnDistribution$CacheBehaviorProperty$Builder
                                                      CfnDistribution$CacheSettingsProperty$Builder
                                                      CfnDistribution$CookieObjectProperty$Builder
                                                      CfnDistribution$HeaderObjectProperty$Builder
                                                      CfnDistribution$InputOriginProperty$Builder
                                                      CfnDistribution$QueryStringObjectProperty$Builder
                                                      CfnDistributionProps$Builder
                                                      CfnInstance$AddOnProperty$Builder
                                                      CfnInstance$AutoSnapshotAddOnProperty$Builder
                                                      CfnInstance$Builder
                                                      CfnInstance$DiskProperty$Builder
                                                      CfnInstance$HardwareProperty$Builder
                                                      CfnInstance$LocationProperty$Builder
                                                      CfnInstance$MonthlyTransferProperty$Builder
                                                      CfnInstance$NetworkingProperty$Builder
                                                      CfnInstance$PortProperty$Builder
                                                      CfnInstance$StateProperty$Builder
                                                      CfnInstanceProps$Builder
                                                      CfnLoadBalancer$Builder
                                                      CfnLoadBalancerProps$Builder
                                                      CfnLoadBalancerTlsCertificate$Builder
                                                      CfnLoadBalancerTlsCertificateProps$Builder
                                                      CfnStaticIp$Builder
                                                      CfnStaticIpProps$Builder]))


(defn cfn-alarm-builder>
  "The cfn-alarm-builder> function updates a CfnAlarm$Builder instance using the provided configuration.
  The function takes the CfnAlarm$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `contactProtocols` | java.util.List | [[cdk.support/lookup-entry]] | `:contact-protocols` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `monitoredResourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitored-resource-name` |
| `notificationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:notification-enabled` |
| `notificationTriggers` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-triggers` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `treatMissingData` | java.lang.String | [[cdk.support/lookup-entry]] | `:treat-missing-data` |
"
  [^CfnAlarm$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-some [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :contact-protocols)]
    (. builder contactProtocols data))
  (when-some [data (lookup-entry config id :datapoints-to-alarm)]
    (. builder datapointsToAlarm data))
  (when-some [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :monitored-resource-name)]
    (. builder monitoredResourceName data))
  (when-some [data (lookup-entry config id :notification-enabled)]
    (. builder notificationEnabled data))
  (when-some [data (lookup-entry config id :notification-triggers)]
    (. builder notificationTriggers data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (lookup-entry config id :treat-missing-data)]
    (. builder treatMissingData data))
  (.build builder))


(defn cfn-alarm-builder
  "Creates a  `CfnAlarm$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-alarm-builder> (CfnAlarm$Builder/create scope (name id)) id config))


(defn cfn-alarm-props-builder>
  "The cfn-alarm-props-builder> function updates a CfnAlarmProps$Builder instance using the provided configuration.
  The function takes the CfnAlarmProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmName` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-name` |
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `contactProtocols` | java.util.List | [[cdk.support/lookup-entry]] | `:contact-protocols` |
| `datapointsToAlarm` | java.lang.Number | [[cdk.support/lookup-entry]] | `:datapoints-to-alarm` |
| `evaluationPeriods` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-periods` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `monitoredResourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:monitored-resource-name` |
| `notificationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:notification-enabled` |
| `notificationTriggers` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-triggers` |
| `threshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:threshold` |
| `treatMissingData` | java.lang.String | [[cdk.support/lookup-entry]] | `:treat-missing-data` |
"
  [^CfnAlarmProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-name)]
    (. builder alarmName data))
  (when-some [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :contact-protocols)]
    (. builder contactProtocols data))
  (when-some [data (lookup-entry config id :datapoints-to-alarm)]
    (. builder datapointsToAlarm data))
  (when-some [data (lookup-entry config id :evaluation-periods)]
    (. builder evaluationPeriods data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :monitored-resource-name)]
    (. builder monitoredResourceName data))
  (when-some [data (lookup-entry config id :notification-enabled)]
    (. builder notificationEnabled data))
  (when-some [data (lookup-entry config id :notification-triggers)]
    (. builder notificationTriggers data))
  (when-some [data (lookup-entry config id :threshold)]
    (. builder threshold data))
  (when-some [data (lookup-entry config id :treat-missing-data)]
    (. builder treatMissingData data))
  (.build builder))


(defn cfn-alarm-props-builder
  "Creates a  `CfnAlarmProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-alarm-props-builder> (new CfnAlarmProps$Builder) id config))


(defn cfn-bucket-access-rules-property-builder>
  "The cfn-bucket-access-rules-property-builder> function updates a CfnBucket$AccessRulesProperty$Builder instance using the provided configuration.
  The function takes the CfnBucket$AccessRulesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowPublicOverrides` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-overrides` |
| `objectAccess` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-access` |
"
  [^CfnBucket$AccessRulesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-public-overrides)]
    (. builder allowPublicOverrides data))
  (when-some [data (lookup-entry config id :object-access)]
    (. builder objectAccess data))
  (.build builder))


(defn cfn-bucket-access-rules-property-builder
  "Creates a  `CfnBucket$AccessRulesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-bucket-access-rules-property-builder> (new CfnBucket$AccessRulesProperty$Builder) id config))


(defn cfn-bucket-builder>
  "The cfn-bucket-builder> function updates a CfnBucket$Builder instance using the provided configuration.
  The function takes the CfnBucket$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRules` | software.amazon.awscdk.services.lightsail.CfnBucket$AccessRulesProperty | [[cdk.support/lookup-entry]] | `:access-rules` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `objectVersioning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:object-versioning` |
| `readOnlyAccessAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:read-only-access-accounts` |
| `resourcesReceivingAccess` | java.util.List | [[cdk.support/lookup-entry]] | `:resources-receiving-access` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnBucket$Builder builder id config]
  (when-some [data (lookup-entry config id :access-rules)]
    (. builder accessRules data))
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bundle-id)]
    (. builder bundleId data))
  (when-some [data (lookup-entry config id :object-versioning)]
    (. builder objectVersioning data))
  (when-some [data (lookup-entry config id :read-only-access-accounts)]
    (. builder readOnlyAccessAccounts data))
  (when-some [data (lookup-entry config id :resources-receiving-access)]
    (. builder resourcesReceivingAccess data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-bucket-builder
  "Creates a  `CfnBucket$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-bucket-builder> (CfnBucket$Builder/create scope (name id)) id config))


(defn cfn-bucket-props-builder>
  "The cfn-bucket-props-builder> function updates a CfnBucketProps$Builder instance using the provided configuration.
  The function takes the CfnBucketProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-rules` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `objectVersioning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:object-versioning` |
| `readOnlyAccessAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:read-only-access-accounts` |
| `resourcesReceivingAccess` | java.util.List | [[cdk.support/lookup-entry]] | `:resources-receiving-access` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnBucketProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-rules)]
    (. builder accessRules data))
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bundle-id)]
    (. builder bundleId data))
  (when-some [data (lookup-entry config id :object-versioning)]
    (. builder objectVersioning data))
  (when-some [data (lookup-entry config id :read-only-access-accounts)]
    (. builder readOnlyAccessAccounts data))
  (when-some [data (lookup-entry config id :resources-receiving-access)]
    (. builder resourcesReceivingAccess data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-bucket-props-builder
  "Creates a  `CfnBucketProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-bucket-props-builder> (new CfnBucketProps$Builder) id config))


(defn cfn-certificate-builder>
  "The cfn-certificate-builder> function updates a CfnCertificate$Builder instance using the provided configuration.
  The function takes the CfnCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCertificate$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
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
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCertificateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :subject-alternative-names)]
    (. builder subjectAlternativeNames data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-certificate-props-builder
  "Creates a  `CfnCertificateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-certificate-props-builder> (new CfnCertificateProps$Builder) id config))


(defn cfn-container-builder>
  "The cfn-container-builder> function updates a CfnContainer$Builder instance using the provided configuration.
  The function takes the CfnContainer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerServiceDeployment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-service-deployment` |
| `isDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-disabled` |
| `power` | java.lang.String | [[cdk.support/lookup-entry]] | `:power` |
| `privateRegistryAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-registry-access` |
| `publicDomainNames` | java.util.List | [[cdk.support/lookup-entry]] | `:public-domain-names` |
| `scale` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnContainer$Builder builder id config]
  (when-some [data (lookup-entry config id :container-service-deployment)]
    (. builder containerServiceDeployment data))
  (when-some [data (lookup-entry config id :is-disabled)]
    (. builder isDisabled data))
  (when-some [data (lookup-entry config id :power)]
    (. builder power data))
  (when-some [data (lookup-entry config id :private-registry-access)]
    (. builder privateRegistryAccess data))
  (when-some [data (lookup-entry config id :public-domain-names)]
    (. builder publicDomainNames data))
  (when-some [data (lookup-entry config id :scale)]
    (. builder scale data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-container-builder
  "Creates a  `CfnContainer$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-container-builder> (CfnContainer$Builder/create scope (name id)) id config))


(defn cfn-container-container-property-builder>
  "The cfn-container-container-property-builder> function updates a CfnContainer$ContainerProperty$Builder instance using the provided configuration.
  The function takes the CfnContainer$ContainerProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `environment` | java.util.List | [[cdk.support/lookup-entry]] | `:environment` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `ports` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ports` |
"
  [^CfnContainer$ContainerProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :ports)]
    (. builder ports data))
  (.build builder))


(defn cfn-container-container-property-builder
  "Creates a  `CfnContainer$ContainerProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-container-property-builder> (new CfnContainer$ContainerProperty$Builder) id config))


(defn cfn-container-container-service-deployment-property-builder>
  "The cfn-container-container-service-deployment-property-builder> function updates a CfnContainer$ContainerServiceDeploymentProperty$Builder instance using the provided configuration.
  The function takes the CfnContainer$ContainerServiceDeploymentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:containers` |
| `publicEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-endpoint` |
"
  [^CfnContainer$ContainerServiceDeploymentProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :containers)]
    (. builder containers data))
  (when-some [data (lookup-entry config id :public-endpoint)]
    (. builder publicEndpoint data))
  (.build builder))


(defn cfn-container-container-service-deployment-property-builder
  "Creates a  `CfnContainer$ContainerServiceDeploymentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-container-service-deployment-property-builder> (new CfnContainer$ContainerServiceDeploymentProperty$Builder) id config))


(defn cfn-container-ecr-image-puller-role-property-builder>
  "The cfn-container-ecr-image-puller-role-property-builder> function updates a CfnContainer$EcrImagePullerRoleProperty$Builder instance using the provided configuration.
  The function takes the CfnContainer$EcrImagePullerRoleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isActive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-active` |
| `principalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-arn` |
"
  [^CfnContainer$EcrImagePullerRoleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :is-active)]
    (. builder isActive data))
  (when-some [data (lookup-entry config id :principal-arn)]
    (. builder principalArn data))
  (.build builder))


(defn cfn-container-ecr-image-puller-role-property-builder
  "Creates a  `CfnContainer$EcrImagePullerRoleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-ecr-image-puller-role-property-builder> (new CfnContainer$EcrImagePullerRoleProperty$Builder) id config))


(defn cfn-container-environment-variable-property-builder>
  "The cfn-container-environment-variable-property-builder> function updates a CfnContainer$EnvironmentVariableProperty$Builder instance using the provided configuration.
  The function takes the CfnContainer$EnvironmentVariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `variable` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable` |
"
  [^CfnContainer$EnvironmentVariableProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (when-some [data (lookup-entry config id :variable)]
    (. builder variable data))
  (.build builder))


(defn cfn-container-environment-variable-property-builder
  "Creates a  `CfnContainer$EnvironmentVariableProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-environment-variable-property-builder> (new CfnContainer$EnvironmentVariableProperty$Builder) id config))


(defn cfn-container-health-check-config-property-builder>
  "The cfn-container-health-check-config-property-builder> function updates a CfnContainer$HealthCheckConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnContainer$HealthCheckConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `intervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-seconds` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `successCodes` | java.lang.String | [[cdk.support/lookup-entry]] | `:success-codes` |
| `timeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-seconds` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |
"
  [^CfnContainer$HealthCheckConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :healthy-threshold)]
    (. builder healthyThreshold data))
  (when-some [data (lookup-entry config id :interval-seconds)]
    (. builder intervalSeconds data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :success-codes)]
    (. builder successCodes data))
  (when-some [data (lookup-entry config id :timeout-seconds)]
    (. builder timeoutSeconds data))
  (when-some [data (lookup-entry config id :unhealthy-threshold)]
    (. builder unhealthyThreshold data))
  (.build builder))


(defn cfn-container-health-check-config-property-builder
  "Creates a  `CfnContainer$HealthCheckConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-health-check-config-property-builder> (new CfnContainer$HealthCheckConfigProperty$Builder) id config))


(defn cfn-container-port-info-property-builder>
  "The cfn-container-port-info-property-builder> function updates a CfnContainer$PortInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnContainer$PortInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnContainer$PortInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn cfn-container-port-info-property-builder
  "Creates a  `CfnContainer$PortInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-port-info-property-builder> (new CfnContainer$PortInfoProperty$Builder) id config))


(defn cfn-container-private-registry-access-property-builder>
  "The cfn-container-private-registry-access-property-builder> function updates a CfnContainer$PrivateRegistryAccessProperty$Builder instance using the provided configuration.
  The function takes the CfnContainer$PrivateRegistryAccessProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ecrImagePullerRole` | software.amazon.awscdk.services.lightsail.CfnContainer$EcrImagePullerRoleProperty | [[cdk.support/lookup-entry]] | `:ecr-image-puller-role` |
"
  [^CfnContainer$PrivateRegistryAccessProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ecr-image-puller-role)]
    (. builder ecrImagePullerRole data))
  (.build builder))


(defn cfn-container-private-registry-access-property-builder
  "Creates a  `CfnContainer$PrivateRegistryAccessProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-private-registry-access-property-builder> (new CfnContainer$PrivateRegistryAccessProperty$Builder) id config))


(defn cfn-container-props-builder>
  "The cfn-container-props-builder> function updates a CfnContainerProps$Builder instance using the provided configuration.
  The function takes the CfnContainerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerServiceDeployment` | software.amazon.awscdk.services.lightsail.CfnContainer$ContainerServiceDeploymentProperty | [[cdk.support/lookup-entry]] | `:container-service-deployment` |
| `isDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-disabled` |
| `power` | java.lang.String | [[cdk.support/lookup-entry]] | `:power` |
| `privateRegistryAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-registry-access` |
| `publicDomainNames` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-domain-names` |
| `scale` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnContainerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container-service-deployment)]
    (. builder containerServiceDeployment data))
  (when-some [data (lookup-entry config id :is-disabled)]
    (. builder isDisabled data))
  (when-some [data (lookup-entry config id :power)]
    (. builder power data))
  (when-some [data (lookup-entry config id :private-registry-access)]
    (. builder privateRegistryAccess data))
  (when-some [data (lookup-entry config id :public-domain-names)]
    (. builder publicDomainNames data))
  (when-some [data (lookup-entry config id :scale)]
    (. builder scale data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-container-props-builder
  "Creates a  `CfnContainerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-props-builder> (new CfnContainerProps$Builder) id config))


(defn cfn-container-public-domain-name-property-builder>
  "The cfn-container-public-domain-name-property-builder> function updates a CfnContainer$PublicDomainNameProperty$Builder instance using the provided configuration.
  The function takes the CfnContainer$PublicDomainNameProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainNames` | java.util.List | [[cdk.support/lookup-entry]] | `:domain-names` |
"
  [^CfnContainer$PublicDomainNameProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-some [data (lookup-entry config id :domain-names)]
    (. builder domainNames data))
  (.build builder))


(defn cfn-container-public-domain-name-property-builder
  "Creates a  `CfnContainer$PublicDomainNameProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-public-domain-name-property-builder> (new CfnContainer$PublicDomainNameProperty$Builder) id config))


(defn cfn-container-public-endpoint-property-builder>
  "The cfn-container-public-endpoint-property-builder> function updates a CfnContainer$PublicEndpointProperty$Builder instance using the provided configuration.
  The function takes the CfnContainer$PublicEndpointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `healthCheckConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-config` |
"
  [^CfnContainer$PublicEndpointProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :container-port)]
    (. builder containerPort data))
  (when-some [data (lookup-entry config id :health-check-config)]
    (. builder healthCheckConfig data))
  (.build builder))


(defn cfn-container-public-endpoint-property-builder
  "Creates a  `CfnContainer$PublicEndpointProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-container-public-endpoint-property-builder> (new CfnContainer$PublicEndpointProperty$Builder) id config))


(defn cfn-database-builder>
  "The cfn-database-builder> function updates a CfnDatabase$Builder instance using the provided configuration.
  The function takes the CfnDatabase$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetention` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `caCertificateIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-identifier` |
| `masterDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-database-name` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |
| `masterUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-username` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `relationalDatabaseBlueprintId` | java.lang.String | [[cdk.support/lookup-entry]] | `:relational-database-blueprint-id` |
| `relationalDatabaseBundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:relational-database-bundle-id` |
| `relationalDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:relational-database-name` |
| `relationalDatabaseParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:relational-database-parameters` |
| `rotateMasterUserPassword` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rotate-master-user-password` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatabase$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :ca-certificate-identifier)]
    (. builder caCertificateIdentifier data))
  (when-some [data (lookup-entry config id :master-database-name)]
    (. builder masterDatabaseName data))
  (when-some [data (lookup-entry config id :master-user-password)]
    (. builder masterUserPassword data))
  (when-some [data (lookup-entry config id :master-username)]
    (. builder masterUsername data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :relational-database-blueprint-id)]
    (. builder relationalDatabaseBlueprintId data))
  (when-some [data (lookup-entry config id :relational-database-bundle-id)]
    (. builder relationalDatabaseBundleId data))
  (when-some [data (lookup-entry config id :relational-database-name)]
    (. builder relationalDatabaseName data))
  (when-some [data (lookup-entry config id :relational-database-parameters)]
    (. builder relationalDatabaseParameters data))
  (when-some [data (lookup-entry config id :rotate-master-user-password)]
    (. builder rotateMasterUserPassword data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-database-builder
  "Creates a  `CfnDatabase$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-database-builder> (CfnDatabase$Builder/create scope (name id)) id config))


(defn cfn-database-props-builder>
  "The cfn-database-props-builder> function updates a CfnDatabaseProps$Builder instance using the provided configuration.
  The function takes the CfnDatabaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `backupRetention` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:backup-retention` |
| `caCertificateIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:ca-certificate-identifier` |
| `masterDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-database-name` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |
| `masterUsername` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-username` |
| `preferredBackupWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-backup-window` |
| `preferredMaintenanceWindow` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-maintenance-window` |
| `publiclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publicly-accessible` |
| `relationalDatabaseBlueprintId` | java.lang.String | [[cdk.support/lookup-entry]] | `:relational-database-blueprint-id` |
| `relationalDatabaseBundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:relational-database-bundle-id` |
| `relationalDatabaseName` | java.lang.String | [[cdk.support/lookup-entry]] | `:relational-database-name` |
| `relationalDatabaseParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:relational-database-parameters` |
| `rotateMasterUserPassword` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-master-user-password` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDatabaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :backup-retention)]
    (. builder backupRetention data))
  (when-some [data (lookup-entry config id :ca-certificate-identifier)]
    (. builder caCertificateIdentifier data))
  (when-some [data (lookup-entry config id :master-database-name)]
    (. builder masterDatabaseName data))
  (when-some [data (lookup-entry config id :master-user-password)]
    (. builder masterUserPassword data))
  (when-some [data (lookup-entry config id :master-username)]
    (. builder masterUsername data))
  (when-some [data (lookup-entry config id :preferred-backup-window)]
    (. builder preferredBackupWindow data))
  (when-some [data (lookup-entry config id :preferred-maintenance-window)]
    (. builder preferredMaintenanceWindow data))
  (when-some [data (lookup-entry config id :publicly-accessible)]
    (. builder publiclyAccessible data))
  (when-some [data (lookup-entry config id :relational-database-blueprint-id)]
    (. builder relationalDatabaseBlueprintId data))
  (when-some [data (lookup-entry config id :relational-database-bundle-id)]
    (. builder relationalDatabaseBundleId data))
  (when-some [data (lookup-entry config id :relational-database-name)]
    (. builder relationalDatabaseName data))
  (when-some [data (lookup-entry config id :relational-database-parameters)]
    (. builder relationalDatabaseParameters data))
  (when-some [data (lookup-entry config id :rotate-master-user-password)]
    (. builder rotateMasterUserPassword data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-database-props-builder
  "Creates a  `CfnDatabaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-database-props-builder> (new CfnDatabaseProps$Builder) id config))


(defn cfn-database-relational-database-parameter-property-builder>
  "The cfn-database-relational-database-parameter-property-builder> function updates a CfnDatabase$RelationalDatabaseParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnDatabase$RelationalDatabaseParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValues` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `applyMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-method` |
| `applyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-type` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `isModifiable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-modifiable` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnDatabase$RelationalDatabaseParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-values)]
    (. builder allowedValues data))
  (when-some [data (lookup-entry config id :apply-method)]
    (. builder applyMethod data))
  (when-some [data (lookup-entry config id :apply-type)]
    (. builder applyType data))
  (when-some [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :is-modifiable)]
    (. builder isModifiable data))
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn cfn-database-relational-database-parameter-property-builder
  "Creates a  `CfnDatabase$RelationalDatabaseParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-database-relational-database-parameter-property-builder> (new CfnDatabase$RelationalDatabaseParameterProperty$Builder) id config))


(defn cfn-disk-add-on-property-builder>
  "The cfn-disk-add-on-property-builder> function updates a CfnDisk$AddOnProperty$Builder instance using the provided configuration.
  The function takes the CfnDisk$AddOnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addOnType` | java.lang.String | [[cdk.support/lookup-entry]] | `:add-on-type` |
| `autoSnapshotAddOnRequest` | software.amazon.awscdk.services.lightsail.CfnDisk$AutoSnapshotAddOnProperty | [[cdk.support/lookup-entry]] | `:auto-snapshot-add-on-request` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnDisk$AddOnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :add-on-type)]
    (. builder addOnType data))
  (when-some [data (lookup-entry config id :auto-snapshot-add-on-request)]
    (. builder autoSnapshotAddOnRequest data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-disk-add-on-property-builder
  "Creates a  `CfnDisk$AddOnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-disk-add-on-property-builder> (new CfnDisk$AddOnProperty$Builder) id config))


(defn cfn-disk-auto-snapshot-add-on-property-builder>
  "The cfn-disk-auto-snapshot-add-on-property-builder> function updates a CfnDisk$AutoSnapshotAddOnProperty$Builder instance using the provided configuration.
  The function takes the CfnDisk$AutoSnapshotAddOnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snapshotTimeOfDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-time-of-day` |
"
  [^CfnDisk$AutoSnapshotAddOnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :snapshot-time-of-day)]
    (. builder snapshotTimeOfDay data))
  (.build builder))


(defn cfn-disk-auto-snapshot-add-on-property-builder
  "Creates a  `CfnDisk$AutoSnapshotAddOnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-disk-auto-snapshot-add-on-property-builder> (new CfnDisk$AutoSnapshotAddOnProperty$Builder) id config))


(defn cfn-disk-builder>
  "The cfn-disk-builder> function updates a CfnDisk$Builder instance using the provided configuration.
  The function takes the CfnDisk$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addOns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:add-ons` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `diskName` | java.lang.String | [[cdk.support/lookup-entry]] | `:disk-name` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `sizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gb` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDisk$Builder builder id config]
  (when-some [data (lookup-entry config id :add-ons)]
    (. builder addOns data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :disk-name)]
    (. builder diskName data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :size-in-gb)]
    (. builder sizeInGb data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-disk-builder
  "Creates a  `CfnDisk$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-disk-builder> (CfnDisk$Builder/create scope (name id)) id config))


(defn cfn-disk-location-property-builder>
  "The cfn-disk-location-property-builder> function updates a CfnDisk$LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnDisk$LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `regionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-name` |
"
  [^CfnDisk$LocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :region-name)]
    (. builder regionName data))
  (.build builder))


(defn cfn-disk-location-property-builder
  "Creates a  `CfnDisk$LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-disk-location-property-builder> (new CfnDisk$LocationProperty$Builder) id config))


(defn cfn-disk-props-builder>
  "The cfn-disk-props-builder> function updates a CfnDiskProps$Builder instance using the provided configuration.
  The function takes the CfnDiskProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addOns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:add-ons` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `diskName` | java.lang.String | [[cdk.support/lookup-entry]] | `:disk-name` |
| `location` | software.amazon.awscdk.services.lightsail.CfnDisk$LocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `sizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gb` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDiskProps$Builder builder id config]
  (when-some [data (lookup-entry config id :add-ons)]
    (. builder addOns data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :disk-name)]
    (. builder diskName data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :size-in-gb)]
    (. builder sizeInGb data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-disk-props-builder
  "Creates a  `CfnDiskProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-disk-props-builder> (new CfnDiskProps$Builder) id config))


(defn cfn-distribution-builder>
  "The cfn-distribution-builder> function updates a CfnDistribution$Builder instance using the provided configuration.
  The function takes the CfnDistribution$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `cacheBehaviorSettings` | software.amazon.awscdk.services.lightsail.CfnDistribution$CacheSettingsProperty | [[cdk.support/lookup-entry]] | `:cache-behavior-settings` |
| `cacheBehaviors` | java.util.List | [[cdk.support/lookup-entry]] | `:cache-behaviors` |
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `defaultCacheBehavior` | software.amazon.awscdk.services.lightsail.CfnDistribution$CacheBehaviorProperty | [[cdk.support/lookup-entry]] | `:default-cache-behavior` |
| `distributionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-name` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `isEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-enabled` |
| `origin` | software.amazon.awscdk.services.lightsail.CfnDistribution$InputOriginProperty | [[cdk.support/lookup-entry]] | `:origin` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDistribution$Builder builder id config]
  (when-some [data (lookup-entry config id :bundle-id)]
    (. builder bundleId data))
  (when-some [data (lookup-entry config id :cache-behavior-settings)]
    (. builder cacheBehaviorSettings data))
  (when-some [data (lookup-entry config id :cache-behaviors)]
    (. builder cacheBehaviors data))
  (when-some [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-some [data (lookup-entry config id :default-cache-behavior)]
    (. builder defaultCacheBehavior data))
  (when-some [data (lookup-entry config id :distribution-name)]
    (. builder distributionName data))
  (when-some [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :is-enabled)]
    (. builder isEnabled data))
  (when-some [data (lookup-entry config id :origin)]
    (. builder origin data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-distribution-builder
  "Creates a  `CfnDistribution$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-distribution-builder> (CfnDistribution$Builder/create scope (name id)) id config))


(defn cfn-distribution-cache-behavior-per-path-property-builder>
  "The cfn-distribution-cache-behavior-per-path-property-builder> function updates a CfnDistribution$CacheBehaviorPerPathProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$CacheBehaviorPerPathProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnDistribution$CacheBehaviorPerPathProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :behavior)]
    (. builder behavior data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-distribution-cache-behavior-per-path-property-builder
  "Creates a  `CfnDistribution$CacheBehaviorPerPathProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-cache-behavior-per-path-property-builder> (new CfnDistribution$CacheBehaviorPerPathProperty$Builder) id config))


(defn cfn-distribution-cache-behavior-property-builder>
  "The cfn-distribution-cache-behavior-property-builder> function updates a CfnDistribution$CacheBehaviorProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$CacheBehaviorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior` |
"
  [^CfnDistribution$CacheBehaviorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :behavior)]
    (. builder behavior data))
  (.build builder))


(defn cfn-distribution-cache-behavior-property-builder
  "Creates a  `CfnDistribution$CacheBehaviorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-cache-behavior-property-builder> (new CfnDistribution$CacheBehaviorProperty$Builder) id config))


(defn cfn-distribution-cache-settings-property-builder>
  "The cfn-distribution-cache-settings-property-builder> function updates a CfnDistribution$CacheSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$CacheSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedHttpMethods` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-http-methods` |
| `cachedHttpMethods` | java.lang.String | [[cdk.support/lookup-entry]] | `:cached-http-methods` |
| `defaultTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-ttl` |
| `forwardedCookies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forwarded-cookies` |
| `forwardedHeaders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forwarded-headers` |
| `forwardedQueryStrings` | software.amazon.awscdk.services.lightsail.CfnDistribution$QueryStringObjectProperty | [[cdk.support/lookup-entry]] | `:forwarded-query-strings` |
| `maximumTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-ttl` |
| `minimumTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-ttl` |
"
  [^CfnDistribution$CacheSettingsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-http-methods)]
    (. builder allowedHttpMethods data))
  (when-some [data (lookup-entry config id :cached-http-methods)]
    (. builder cachedHttpMethods data))
  (when-some [data (lookup-entry config id :default-ttl)]
    (. builder defaultTtl data))
  (when-some [data (lookup-entry config id :forwarded-cookies)]
    (. builder forwardedCookies data))
  (when-some [data (lookup-entry config id :forwarded-headers)]
    (. builder forwardedHeaders data))
  (when-some [data (lookup-entry config id :forwarded-query-strings)]
    (. builder forwardedQueryStrings data))
  (when-some [data (lookup-entry config id :maximum-ttl)]
    (. builder maximumTtl data))
  (when-some [data (lookup-entry config id :minimum-ttl)]
    (. builder minimumTtl data))
  (.build builder))


(defn cfn-distribution-cache-settings-property-builder
  "Creates a  `CfnDistribution$CacheSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-cache-settings-property-builder> (new CfnDistribution$CacheSettingsProperty$Builder) id config))


(defn cfn-distribution-cookie-object-property-builder>
  "The cfn-distribution-cookie-object-property-builder> function updates a CfnDistribution$CookieObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$CookieObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookiesAllowList` | java.util.List | [[cdk.support/lookup-entry]] | `:cookies-allow-list` |
| `option` | java.lang.String | [[cdk.support/lookup-entry]] | `:option` |
"
  [^CfnDistribution$CookieObjectProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cookies-allow-list)]
    (. builder cookiesAllowList data))
  (when-some [data (lookup-entry config id :option)]
    (. builder option data))
  (.build builder))


(defn cfn-distribution-cookie-object-property-builder
  "Creates a  `CfnDistribution$CookieObjectProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-cookie-object-property-builder> (new CfnDistribution$CookieObjectProperty$Builder) id config))


(defn cfn-distribution-header-object-property-builder>
  "The cfn-distribution-header-object-property-builder> function updates a CfnDistribution$HeaderObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$HeaderObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headersAllowList` | java.util.List | [[cdk.support/lookup-entry]] | `:headers-allow-list` |
| `option` | java.lang.String | [[cdk.support/lookup-entry]] | `:option` |
"
  [^CfnDistribution$HeaderObjectProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :headers-allow-list)]
    (. builder headersAllowList data))
  (when-some [data (lookup-entry config id :option)]
    (. builder option data))
  (.build builder))


(defn cfn-distribution-header-object-property-builder
  "Creates a  `CfnDistribution$HeaderObjectProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-header-object-property-builder> (new CfnDistribution$HeaderObjectProperty$Builder) id config))


(defn cfn-distribution-input-origin-property-builder>
  "The cfn-distribution-input-origin-property-builder> function updates a CfnDistribution$InputOriginProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$InputOriginProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocolPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-policy` |
| `regionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-name` |
"
  [^CfnDistribution$InputOriginProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :protocol-policy)]
    (. builder protocolPolicy data))
  (when-some [data (lookup-entry config id :region-name)]
    (. builder regionName data))
  (.build builder))


(defn cfn-distribution-input-origin-property-builder
  "Creates a  `CfnDistribution$InputOriginProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-input-origin-property-builder> (new CfnDistribution$InputOriginProperty$Builder) id config))


(defn cfn-distribution-props-builder>
  "The cfn-distribution-props-builder> function updates a CfnDistributionProps$Builder instance using the provided configuration.
  The function takes the CfnDistributionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `cacheBehaviorSettings` | software.amazon.awscdk.services.lightsail.CfnDistribution$CacheSettingsProperty | [[cdk.support/lookup-entry]] | `:cache-behavior-settings` |
| `cacheBehaviors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cache-behaviors` |
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `defaultCacheBehavior` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-cache-behavior` |
| `distributionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:distribution-name` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `isEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-enabled` |
| `origin` | software.amazon.awscdk.services.lightsail.CfnDistribution$InputOriginProperty | [[cdk.support/lookup-entry]] | `:origin` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDistributionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bundle-id)]
    (. builder bundleId data))
  (when-some [data (lookup-entry config id :cache-behavior-settings)]
    (. builder cacheBehaviorSettings data))
  (when-some [data (lookup-entry config id :cache-behaviors)]
    (. builder cacheBehaviors data))
  (when-some [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-some [data (lookup-entry config id :default-cache-behavior)]
    (. builder defaultCacheBehavior data))
  (when-some [data (lookup-entry config id :distribution-name)]
    (. builder distributionName data))
  (when-some [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :is-enabled)]
    (. builder isEnabled data))
  (when-some [data (lookup-entry config id :origin)]
    (. builder origin data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-distribution-props-builder
  "Creates a  `CfnDistributionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-props-builder> (new CfnDistributionProps$Builder) id config))


(defn cfn-distribution-query-string-object-property-builder>
  "The cfn-distribution-query-string-object-property-builder> function updates a CfnDistribution$QueryStringObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnDistribution$QueryStringObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `option` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:option` |
| `queryStringsAllowList` | java.util.List | [[cdk.support/lookup-entry]] | `:query-strings-allow-list` |
"
  [^CfnDistribution$QueryStringObjectProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :option)]
    (. builder option data))
  (when-some [data (lookup-entry config id :query-strings-allow-list)]
    (. builder queryStringsAllowList data))
  (.build builder))


(defn cfn-distribution-query-string-object-property-builder
  "Creates a  `CfnDistribution$QueryStringObjectProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-distribution-query-string-object-property-builder> (new CfnDistribution$QueryStringObjectProperty$Builder) id config))


(defn cfn-instance-add-on-property-builder>
  "The cfn-instance-add-on-property-builder> function updates a CfnInstance$AddOnProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$AddOnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addOnType` | java.lang.String | [[cdk.support/lookup-entry]] | `:add-on-type` |
| `autoSnapshotAddOnRequest` | software.amazon.awscdk.services.lightsail.CfnInstance$AutoSnapshotAddOnProperty | [[cdk.support/lookup-entry]] | `:auto-snapshot-add-on-request` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnInstance$AddOnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :add-on-type)]
    (. builder addOnType data))
  (when-some [data (lookup-entry config id :auto-snapshot-add-on-request)]
    (. builder autoSnapshotAddOnRequest data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-instance-add-on-property-builder
  "Creates a  `CfnInstance$AddOnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-add-on-property-builder> (new CfnInstance$AddOnProperty$Builder) id config))


(defn cfn-instance-auto-snapshot-add-on-property-builder>
  "The cfn-instance-auto-snapshot-add-on-property-builder> function updates a CfnInstance$AutoSnapshotAddOnProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$AutoSnapshotAddOnProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snapshotTimeOfDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-time-of-day` |
"
  [^CfnInstance$AutoSnapshotAddOnProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :snapshot-time-of-day)]
    (. builder snapshotTimeOfDay data))
  (.build builder))


(defn cfn-instance-auto-snapshot-add-on-property-builder
  "Creates a  `CfnInstance$AutoSnapshotAddOnProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-auto-snapshot-add-on-property-builder> (new CfnInstance$AutoSnapshotAddOnProperty$Builder) id config))


(defn cfn-instance-builder>
  "The cfn-instance-builder> function updates a CfnInstance$Builder instance using the provided configuration.
  The function takes the CfnInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addOns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:add-ons` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `blueprintId` | java.lang.String | [[cdk.support/lookup-entry]] | `:blueprint-id` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `hardware` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:hardware` |
| `instanceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-name` |
| `keyPairName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-pair-name` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `networking` | software.amazon.awscdk.services.lightsail.CfnInstance$NetworkingProperty | [[cdk.support/lookup-entry]] | `:networking` |
| `state` | software.amazon.awscdk.services.lightsail.CfnInstance$StateProperty | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userData` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data` |
"
  [^CfnInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :add-ons)]
    (. builder addOns data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :blueprint-id)]
    (. builder blueprintId data))
  (when-some [data (lookup-entry config id :bundle-id)]
    (. builder bundleId data))
  (when-some [data (lookup-entry config id :hardware)]
    (. builder hardware data))
  (when-some [data (lookup-entry config id :instance-name)]
    (. builder instanceName data))
  (when-some [data (lookup-entry config id :key-pair-name)]
    (. builder keyPairName data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :networking)]
    (. builder networking data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-data)]
    (. builder userData data))
  (.build builder))


(defn cfn-instance-builder
  "Creates a  `CfnInstance$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-instance-builder> (CfnInstance$Builder/create scope (name id)) id config))


(defn cfn-instance-disk-property-builder>
  "The cfn-instance-disk-property-builder> function updates a CfnInstance$DiskProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$DiskProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachedTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:attached-to` |
| `attachmentState` | java.lang.String | [[cdk.support/lookup-entry]] | `:attachment-state` |
| `diskName` | java.lang.String | [[cdk.support/lookup-entry]] | `:disk-name` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `isSystemDisk` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-system-disk` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `sizeInGb` | java.lang.String | [[cdk.support/lookup-entry]] | `:size-in-gb` |
"
  [^CfnInstance$DiskProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attached-to)]
    (. builder attachedTo data))
  (when-some [data (lookup-entry config id :attachment-state)]
    (. builder attachmentState data))
  (when-some [data (lookup-entry config id :disk-name)]
    (. builder diskName data))
  (when-some [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-some [data (lookup-entry config id :is-system-disk)]
    (. builder isSystemDisk data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :size-in-gb)]
    (. builder sizeInGb data))
  (.build builder))


(defn cfn-instance-disk-property-builder
  "Creates a  `CfnInstance$DiskProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-disk-property-builder> (new CfnInstance$DiskProperty$Builder) id config))


(defn cfn-instance-hardware-property-builder>
  "The cfn-instance-hardware-property-builder> function updates a CfnInstance$HardwareProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$HardwareProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-count` |
| `disks` | java.util.List | [[cdk.support/lookup-entry]] | `:disks` |
| `ramSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ram-size-in-gb` |
"
  [^CfnInstance$HardwareProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cpu-count)]
    (. builder cpuCount data))
  (when-some [data (lookup-entry config id :disks)]
    (. builder disks data))
  (when-some [data (lookup-entry config id :ram-size-in-gb)]
    (. builder ramSizeInGb data))
  (.build builder))


(defn cfn-instance-hardware-property-builder
  "Creates a  `CfnInstance$HardwareProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-hardware-property-builder> (new CfnInstance$HardwareProperty$Builder) id config))


(defn cfn-instance-location-property-builder>
  "The cfn-instance-location-property-builder> function updates a CfnInstance$LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `regionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-name` |
"
  [^CfnInstance$LocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :region-name)]
    (. builder regionName data))
  (.build builder))


(defn cfn-instance-location-property-builder
  "Creates a  `CfnInstance$LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-location-property-builder> (new CfnInstance$LocationProperty$Builder) id config))


(defn cfn-instance-monthly-transfer-property-builder>
  "The cfn-instance-monthly-transfer-property-builder> function updates a CfnInstance$MonthlyTransferProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$MonthlyTransferProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gbPerMonthAllocated` | java.lang.String | [[cdk.support/lookup-entry]] | `:gb-per-month-allocated` |
"
  [^CfnInstance$MonthlyTransferProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :gb-per-month-allocated)]
    (. builder gbPerMonthAllocated data))
  (.build builder))


(defn cfn-instance-monthly-transfer-property-builder
  "Creates a  `CfnInstance$MonthlyTransferProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-monthly-transfer-property-builder> (new CfnInstance$MonthlyTransferProperty$Builder) id config))


(defn cfn-instance-networking-property-builder>
  "The cfn-instance-networking-property-builder> function updates a CfnInstance$NetworkingProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$NetworkingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `monthlyTransfer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monthly-transfer` |
| `ports` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ports` |
"
  [^CfnInstance$NetworkingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :monthly-transfer)]
    (. builder monthlyTransfer data))
  (when-some [data (lookup-entry config id :ports)]
    (. builder ports data))
  (.build builder))


(defn cfn-instance-networking-property-builder
  "Creates a  `CfnInstance$NetworkingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-networking-property-builder> (new CfnInstance$NetworkingProperty$Builder) id config))


(defn cfn-instance-port-property-builder>
  "The cfn-instance-port-property-builder> function updates a CfnInstance$PortProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$PortProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessDirection` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-direction` |
| `accessFrom` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-from` |
| `accessType` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-type` |
| `cidrListAliases` | java.util.List | [[cdk.support/lookup-entry]] | `:cidr-list-aliases` |
| `cidrs` | java.util.List | [[cdk.support/lookup-entry]] | `:cidrs` |
| `commonName` | java.lang.String | [[cdk.support/lookup-entry]] | `:common-name` |
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `ipv6Cidrs` | java.util.List | [[cdk.support/lookup-entry]] | `:ipv6-cidrs` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |
"
  [^CfnInstance$PortProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-direction)]
    (. builder accessDirection data))
  (when-some [data (lookup-entry config id :access-from)]
    (. builder accessFrom data))
  (when-some [data (lookup-entry config id :access-type)]
    (. builder accessType data))
  (when-some [data (lookup-entry config id :cidr-list-aliases)]
    (. builder cidrListAliases data))
  (when-some [data (lookup-entry config id :cidrs)]
    (. builder cidrs data))
  (when-some [data (lookup-entry config id :common-name)]
    (. builder commonName data))
  (when-some [data (lookup-entry config id :from-port)]
    (. builder fromPort data))
  (when-some [data (lookup-entry config id :ipv6-cidrs)]
    (. builder ipv6Cidrs data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :to-port)]
    (. builder toPort data))
  (.build builder))


(defn cfn-instance-port-property-builder
  "Creates a  `CfnInstance$PortProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-port-property-builder> (new CfnInstance$PortProperty$Builder) id config))


(defn cfn-instance-props-builder>
  "The cfn-instance-props-builder> function updates a CfnInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addOns` | java.util.List | [[cdk.support/lookup-entry]] | `:add-ons` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `blueprintId` | java.lang.String | [[cdk.support/lookup-entry]] | `:blueprint-id` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `hardware` | software.amazon.awscdk.services.lightsail.CfnInstance$HardwareProperty | [[cdk.support/lookup-entry]] | `:hardware` |
| `instanceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-name` |
| `keyPairName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-pair-name` |
| `location` | software.amazon.awscdk.services.lightsail.CfnInstance$LocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `networking` | software.amazon.awscdk.services.lightsail.CfnInstance$NetworkingProperty | [[cdk.support/lookup-entry]] | `:networking` |
| `state` | software.amazon.awscdk.services.lightsail.CfnInstance$StateProperty | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userData` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data` |
"
  [^CfnInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :add-ons)]
    (. builder addOns data))
  (when-some [data (lookup-entry config id :availability-zone)]
    (. builder availabilityZone data))
  (when-some [data (lookup-entry config id :blueprint-id)]
    (. builder blueprintId data))
  (when-some [data (lookup-entry config id :bundle-id)]
    (. builder bundleId data))
  (when-some [data (lookup-entry config id :hardware)]
    (. builder hardware data))
  (when-some [data (lookup-entry config id :instance-name)]
    (. builder instanceName data))
  (when-some [data (lookup-entry config id :key-pair-name)]
    (. builder keyPairName data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :networking)]
    (. builder networking data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-data)]
    (. builder userData data))
  (.build builder))


(defn cfn-instance-props-builder
  "Creates a  `CfnInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-props-builder> (new CfnInstanceProps$Builder) id config))


(defn cfn-instance-state-property-builder>
  "The cfn-instance-state-property-builder> function updates a CfnInstance$StateProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$StateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | java.lang.Number | [[cdk.support/lookup-entry]] | `:code` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnInstance$StateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :code)]
    (. builder code data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-instance-state-property-builder
  "Creates a  `CfnInstance$StateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-state-property-builder> (new CfnInstance$StateProperty$Builder) id config))


(defn cfn-load-balancer-builder>
  "The cfn-load-balancer-builder> function updates a CfnLoadBalancer$Builder instance using the provided configuration.
  The function takes the CfnLoadBalancer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachedInstances` | java.util.List | [[cdk.support/lookup-entry]] | `:attached-instances` |
| `healthCheckPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-path` |
| `instancePort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-port` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `sessionStickinessEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:session-stickiness-enabled` |
| `sessionStickinessLbCookieDurationSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-stickiness-lb-cookie-duration-seconds` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tlsPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-policy-name` |
"
  [^CfnLoadBalancer$Builder builder id config]
  (when-some [data (lookup-entry config id :attached-instances)]
    (. builder attachedInstances data))
  (when-some [data (lookup-entry config id :health-check-path)]
    (. builder healthCheckPath data))
  (when-some [data (lookup-entry config id :instance-port)]
    (. builder instancePort data))
  (when-some [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :session-stickiness-enabled)]
    (. builder sessionStickinessEnabled data))
  (when-some [data (lookup-entry config id :session-stickiness-lb-cookie-duration-seconds)]
    (. builder sessionStickinessLbCookieDurationSeconds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tls-policy-name)]
    (. builder tlsPolicyName data))
  (.build builder))


(defn cfn-load-balancer-builder
  "Creates a  `CfnLoadBalancer$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-load-balancer-builder> (CfnLoadBalancer$Builder/create scope (name id)) id config))


(defn cfn-load-balancer-props-builder>
  "The cfn-load-balancer-props-builder> function updates a CfnLoadBalancerProps$Builder instance using the provided configuration.
  The function takes the CfnLoadBalancerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachedInstances` | java.util.List | [[cdk.support/lookup-entry]] | `:attached-instances` |
| `healthCheckPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-path` |
| `instancePort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-port` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `sessionStickinessEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:session-stickiness-enabled` |
| `sessionStickinessLbCookieDurationSeconds` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-stickiness-lb-cookie-duration-seconds` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tlsPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-policy-name` |
"
  [^CfnLoadBalancerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attached-instances)]
    (. builder attachedInstances data))
  (when-some [data (lookup-entry config id :health-check-path)]
    (. builder healthCheckPath data))
  (when-some [data (lookup-entry config id :instance-port)]
    (. builder instancePort data))
  (when-some [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :session-stickiness-enabled)]
    (. builder sessionStickinessEnabled data))
  (when-some [data (lookup-entry config id :session-stickiness-lb-cookie-duration-seconds)]
    (. builder sessionStickinessLbCookieDurationSeconds data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tls-policy-name)]
    (. builder tlsPolicyName data))
  (.build builder))


(defn cfn-load-balancer-props-builder
  "Creates a  `CfnLoadBalancerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-load-balancer-props-builder> (new CfnLoadBalancerProps$Builder) id config))


(defn cfn-load-balancer-tls-certificate-builder>
  "The cfn-load-balancer-tls-certificate-builder> function updates a CfnLoadBalancerTlsCertificate$Builder instance using the provided configuration.
  The function takes the CfnLoadBalancerTlsCertificate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-alternative-names` |
| `certificateDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-domain-name` |
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `httpsRedirectionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:https-redirection-enabled` |
| `isAttached` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-attached` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
"
  [^CfnLoadBalancerTlsCertificate$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-alternative-names)]
    (. builder certificateAlternativeNames data))
  (when-some [data (lookup-entry config id :certificate-domain-name)]
    (. builder certificateDomainName data))
  (when-some [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-some [data (lookup-entry config id :https-redirection-enabled)]
    (. builder httpsRedirectionEnabled data))
  (when-some [data (lookup-entry config id :is-attached)]
    (. builder isAttached data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (.build builder))


(defn cfn-load-balancer-tls-certificate-builder
  "Creates a  `CfnLoadBalancerTlsCertificate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-load-balancer-tls-certificate-builder> (CfnLoadBalancerTlsCertificate$Builder/create scope (name id)) id config))


(defn cfn-load-balancer-tls-certificate-props-builder>
  "The cfn-load-balancer-tls-certificate-props-builder> function updates a CfnLoadBalancerTlsCertificateProps$Builder instance using the provided configuration.
  The function takes the CfnLoadBalancerTlsCertificateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-alternative-names` |
| `certificateDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-domain-name` |
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `httpsRedirectionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:https-redirection-enabled` |
| `isAttached` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-attached` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
"
  [^CfnLoadBalancerTlsCertificateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate-alternative-names)]
    (. builder certificateAlternativeNames data))
  (when-some [data (lookup-entry config id :certificate-domain-name)]
    (. builder certificateDomainName data))
  (when-some [data (lookup-entry config id :certificate-name)]
    (. builder certificateName data))
  (when-some [data (lookup-entry config id :https-redirection-enabled)]
    (. builder httpsRedirectionEnabled data))
  (when-some [data (lookup-entry config id :is-attached)]
    (. builder isAttached data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (.build builder))


(defn cfn-load-balancer-tls-certificate-props-builder
  "Creates a  `CfnLoadBalancerTlsCertificateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-load-balancer-tls-certificate-props-builder> (new CfnLoadBalancerTlsCertificateProps$Builder) id config))


(defn cfn-static-ip-builder>
  "The cfn-static-ip-builder> function updates a CfnStaticIp$Builder instance using the provided configuration.
  The function takes the CfnStaticIp$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachedTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:attached-to` |
| `staticIpName` | java.lang.String | [[cdk.support/lookup-entry]] | `:static-ip-name` |
"
  [^CfnStaticIp$Builder builder id config]
  (when-some [data (lookup-entry config id :attached-to)]
    (. builder attachedTo data))
  (when-some [data (lookup-entry config id :static-ip-name)]
    (. builder staticIpName data))
  (.build builder))


(defn cfn-static-ip-builder
  "Creates a  `CfnStaticIp$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-static-ip-builder> (CfnStaticIp$Builder/create scope (name id)) id config))


(defn cfn-static-ip-props-builder>
  "The cfn-static-ip-props-builder> function updates a CfnStaticIpProps$Builder instance using the provided configuration.
  The function takes the CfnStaticIpProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachedTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:attached-to` |
| `staticIpName` | java.lang.String | [[cdk.support/lookup-entry]] | `:static-ip-name` |
"
  [^CfnStaticIpProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attached-to)]
    (. builder attachedTo data))
  (when-some [data (lookup-entry config id :static-ip-name)]
    (. builder staticIpName data))
  (.build builder))


(defn cfn-static-ip-props-builder
  "Creates a  `CfnStaticIpProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-static-ip-props-builder> (new CfnStaticIpProps$Builder) id config))