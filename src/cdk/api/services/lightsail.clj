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


(defn cfn-alarm-builder
  "The cfn-alarm-builder function buildes out new instances of 
CfnAlarm$Builder using the provided configuration.  Each field is set as follows:

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
| `treatMissingData` | java.lang.String | [[cdk.support/lookup-entry]] | `:treat-missing-data` |"
  [stack id config]
  (let [builder (CfnAlarm$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (when-let [data (lookup-entry config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :contact-protocols)]
      (. builder contactProtocols data))
    (when-let [data (lookup-entry config id :datapoints-to-alarm)]
      (. builder datapointsToAlarm data))
    (when-let [data (lookup-entry config id :evaluation-periods)]
      (. builder evaluationPeriods data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :monitored-resource-name)]
      (. builder monitoredResourceName data))
    (when-let [data (lookup-entry config id :notification-enabled)]
      (. builder notificationEnabled data))
    (when-let [data (lookup-entry config id :notification-triggers)]
      (. builder notificationTriggers data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (lookup-entry config id :treat-missing-data)]
      (. builder treatMissingData data))
    (.build builder)))


(defn cfn-alarm-props-builder
  "The cfn-alarm-props-builder function buildes out new instances of 
CfnAlarmProps$Builder using the provided configuration.  Each field is set as follows:

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
| `treatMissingData` | java.lang.String | [[cdk.support/lookup-entry]] | `:treat-missing-data` |"
  [stack id config]
  (let [builder (CfnAlarmProps$Builder.)]
    (when-let [data (lookup-entry config id :alarm-name)]
      (. builder alarmName data))
    (when-let [data (lookup-entry config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :contact-protocols)]
      (. builder contactProtocols data))
    (when-let [data (lookup-entry config id :datapoints-to-alarm)]
      (. builder datapointsToAlarm data))
    (when-let [data (lookup-entry config id :evaluation-periods)]
      (. builder evaluationPeriods data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :monitored-resource-name)]
      (. builder monitoredResourceName data))
    (when-let [data (lookup-entry config id :notification-enabled)]
      (. builder notificationEnabled data))
    (when-let [data (lookup-entry config id :notification-triggers)]
      (. builder notificationTriggers data))
    (when-let [data (lookup-entry config id :threshold)]
      (. builder threshold data))
    (when-let [data (lookup-entry config id :treat-missing-data)]
      (. builder treatMissingData data))
    (.build builder)))


(defn cfn-bucket-access-rules-property-builder
  "The cfn-bucket-access-rules-property-builder function buildes out new instances of 
CfnBucket$AccessRulesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowPublicOverrides` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-overrides` |
| `objectAccess` | java.lang.String | [[cdk.support/lookup-entry]] | `:object-access` |"
  [stack id config]
  (let [builder (CfnBucket$AccessRulesProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-public-overrides)]
      (. builder allowPublicOverrides data))
    (when-let [data (lookup-entry config id :object-access)]
      (. builder objectAccess data))
    (.build builder)))


(defn cfn-bucket-builder
  "The cfn-bucket-builder function buildes out new instances of 
CfnBucket$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRules` | software.amazon.awscdk.services.lightsail.CfnBucket$AccessRulesProperty | [[cdk.support/lookup-entry]] | `:access-rules` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `objectVersioning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:object-versioning` |
| `readOnlyAccessAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:read-only-access-accounts` |
| `resourcesReceivingAccess` | java.util.List | [[cdk.support/lookup-entry]] | `:resources-receiving-access` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBucket$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-rules)]
      (. builder accessRules data))
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :object-versioning)]
      (. builder objectVersioning data))
    (when-let [data (lookup-entry config id :read-only-access-accounts)]
      (. builder readOnlyAccessAccounts data))
    (when-let [data (lookup-entry config id :resources-receiving-access)]
      (. builder resourcesReceivingAccess data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-bucket-props-builder
  "The cfn-bucket-props-builder function buildes out new instances of 
CfnBucketProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-rules` |
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `objectVersioning` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:object-versioning` |
| `readOnlyAccessAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:read-only-access-accounts` |
| `resourcesReceivingAccess` | java.util.List | [[cdk.support/lookup-entry]] | `:resources-receiving-access` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBucketProps$Builder.)]
    (when-let [data (lookup-entry config id :access-rules)]
      (. builder accessRules data))
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :object-versioning)]
      (. builder objectVersioning data))
    (when-let [data (lookup-entry config id :read-only-access-accounts)]
      (. builder readOnlyAccessAccounts data))
    (when-let [data (lookup-entry config id :resources-receiving-access)]
      (. builder resourcesReceivingAccess data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-certificate-builder
  "The cfn-certificate-builder function buildes out new instances of 
CfnCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCertificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-name)]
      (. builder certificateName data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-certificate-props-builder
  "The cfn-certificate-props-builder function buildes out new instances of 
CfnCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `subjectAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:subject-alternative-names` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-name)]
      (. builder certificateName data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :subject-alternative-names)]
      (. builder subjectAlternativeNames data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-container-builder
  "The cfn-container-builder function buildes out new instances of 
CfnContainer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerServiceDeployment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:container-service-deployment` |
| `isDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-disabled` |
| `power` | java.lang.String | [[cdk.support/lookup-entry]] | `:power` |
| `privateRegistryAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-registry-access` |
| `publicDomainNames` | java.util.List | [[cdk.support/lookup-entry]] | `:public-domain-names` |
| `scale` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnContainer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :container-service-deployment)]
      (. builder containerServiceDeployment data))
    (when-let [data (lookup-entry config id :is-disabled)]
      (. builder isDisabled data))
    (when-let [data (lookup-entry config id :power)]
      (. builder power data))
    (when-let [data (lookup-entry config id :private-registry-access)]
      (. builder privateRegistryAccess data))
    (when-let [data (lookup-entry config id :public-domain-names)]
      (. builder publicDomainNames data))
    (when-let [data (lookup-entry config id :scale)]
      (. builder scale data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-container-container-property-builder
  "The cfn-container-container-property-builder function buildes out new instances of 
CfnContainer$ContainerProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `environment` | java.util.List | [[cdk.support/lookup-entry]] | `:environment` |
| `image` | java.lang.String | [[cdk.support/lookup-entry]] | `:image` |
| `ports` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ports` |"
  [stack id config]
  (let [builder (CfnContainer$ContainerProperty$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :ports)]
      (. builder ports data))
    (.build builder)))


(defn cfn-container-container-service-deployment-property-builder
  "The cfn-container-container-service-deployment-property-builder function buildes out new instances of 
CfnContainer$ContainerServiceDeploymentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:containers` |
| `publicEndpoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-endpoint` |"
  [stack id config]
  (let [builder (CfnContainer$ContainerServiceDeploymentProperty$Builder.)]
    (when-let [data (lookup-entry config id :containers)]
      (. builder containers data))
    (when-let [data (lookup-entry config id :public-endpoint)]
      (. builder publicEndpoint data))
    (.build builder)))


(defn cfn-container-ecr-image-puller-role-property-builder
  "The cfn-container-ecr-image-puller-role-property-builder function buildes out new instances of 
CfnContainer$EcrImagePullerRoleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isActive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-active` |
| `principalArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-arn` |"
  [stack id config]
  (let [builder (CfnContainer$EcrImagePullerRoleProperty$Builder.)]
    (when-let [data (lookup-entry config id :is-active)]
      (. builder isActive data))
    (when-let [data (lookup-entry config id :principal-arn)]
      (. builder principalArn data))
    (.build builder)))


(defn cfn-container-environment-variable-property-builder
  "The cfn-container-environment-variable-property-builder function buildes out new instances of 
CfnContainer$EnvironmentVariableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `variable` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable` |"
  [stack id config]
  (let [builder (CfnContainer$EnvironmentVariableProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (when-let [data (lookup-entry config id :variable)]
      (. builder variable data))
    (.build builder)))


(defn cfn-container-health-check-config-property-builder
  "The cfn-container-health-check-config-property-builder function buildes out new instances of 
CfnContainer$HealthCheckConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `intervalSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval-seconds` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `successCodes` | java.lang.String | [[cdk.support/lookup-entry]] | `:success-codes` |
| `timeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-seconds` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |"
  [stack id config]
  (let [builder (CfnContainer$HealthCheckConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :healthy-threshold)]
      (. builder healthyThreshold data))
    (when-let [data (lookup-entry config id :interval-seconds)]
      (. builder intervalSeconds data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :success-codes)]
      (. builder successCodes data))
    (when-let [data (lookup-entry config id :timeout-seconds)]
      (. builder timeoutSeconds data))
    (when-let [data (lookup-entry config id :unhealthy-threshold)]
      (. builder unhealthyThreshold data))
    (.build builder)))


(defn cfn-container-port-info-property-builder
  "The cfn-container-port-info-property-builder function buildes out new instances of 
CfnContainer$PortInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnContainer$PortInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn cfn-container-private-registry-access-property-builder
  "The cfn-container-private-registry-access-property-builder function buildes out new instances of 
CfnContainer$PrivateRegistryAccessProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ecrImagePullerRole` | software.amazon.awscdk.services.lightsail.CfnContainer$EcrImagePullerRoleProperty | [[cdk.support/lookup-entry]] | `:ecr-image-puller-role` |"
  [stack id config]
  (let [builder (CfnContainer$PrivateRegistryAccessProperty$Builder.)]
    (when-let [data (lookup-entry config id :ecr-image-puller-role)]
      (. builder ecrImagePullerRole data))
    (.build builder)))


(defn cfn-container-props-builder
  "The cfn-container-props-builder function buildes out new instances of 
CfnContainerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerServiceDeployment` | software.amazon.awscdk.services.lightsail.CfnContainer$ContainerServiceDeploymentProperty | [[cdk.support/lookup-entry]] | `:container-service-deployment` |
| `isDisabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-disabled` |
| `power` | java.lang.String | [[cdk.support/lookup-entry]] | `:power` |
| `privateRegistryAccess` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:private-registry-access` |
| `publicDomainNames` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:public-domain-names` |
| `scale` | java.lang.Number | [[cdk.support/lookup-entry]] | `:scale` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnContainerProps$Builder.)]
    (when-let [data (lookup-entry config id :container-service-deployment)]
      (. builder containerServiceDeployment data))
    (when-let [data (lookup-entry config id :is-disabled)]
      (. builder isDisabled data))
    (when-let [data (lookup-entry config id :power)]
      (. builder power data))
    (when-let [data (lookup-entry config id :private-registry-access)]
      (. builder privateRegistryAccess data))
    (when-let [data (lookup-entry config id :public-domain-names)]
      (. builder publicDomainNames data))
    (when-let [data (lookup-entry config id :scale)]
      (. builder scale data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-container-public-domain-name-property-builder
  "The cfn-container-public-domain-name-property-builder function buildes out new instances of 
CfnContainer$PublicDomainNameProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `domainNames` | java.util.List | [[cdk.support/lookup-entry]] | `:domain-names` |"
  [stack id config]
  (let [builder (CfnContainer$PublicDomainNameProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-name)]
      (. builder certificateName data))
    (when-let [data (lookup-entry config id :domain-names)]
      (. builder domainNames data))
    (.build builder)))


(defn cfn-container-public-endpoint-property-builder
  "The cfn-container-public-endpoint-property-builder function buildes out new instances of 
CfnContainer$PublicEndpointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `healthCheckConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-config` |"
  [stack id config]
  (let [builder (CfnContainer$PublicEndpointProperty$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :health-check-config)]
      (. builder healthCheckConfig data))
    (.build builder)))


(defn cfn-database-builder
  "The cfn-database-builder function buildes out new instances of 
CfnDatabase$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatabase$Builder/create stack id)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :ca-certificate-identifier)]
      (. builder caCertificateIdentifier data))
    (when-let [data (lookup-entry config id :master-database-name)]
      (. builder masterDatabaseName data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (when-let [data (lookup-entry config id :master-username)]
      (. builder masterUsername data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :relational-database-blueprint-id)]
      (. builder relationalDatabaseBlueprintId data))
    (when-let [data (lookup-entry config id :relational-database-bundle-id)]
      (. builder relationalDatabaseBundleId data))
    (when-let [data (lookup-entry config id :relational-database-name)]
      (. builder relationalDatabaseName data))
    (when-let [data (lookup-entry config id :relational-database-parameters)]
      (. builder relationalDatabaseParameters data))
    (when-let [data (lookup-entry config id :rotate-master-user-password)]
      (. builder rotateMasterUserPassword data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-database-props-builder
  "The cfn-database-props-builder function buildes out new instances of 
CfnDatabaseProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDatabaseProps$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :backup-retention)]
      (. builder backupRetention data))
    (when-let [data (lookup-entry config id :ca-certificate-identifier)]
      (. builder caCertificateIdentifier data))
    (when-let [data (lookup-entry config id :master-database-name)]
      (. builder masterDatabaseName data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (when-let [data (lookup-entry config id :master-username)]
      (. builder masterUsername data))
    (when-let [data (lookup-entry config id :preferred-backup-window)]
      (. builder preferredBackupWindow data))
    (when-let [data (lookup-entry config id :preferred-maintenance-window)]
      (. builder preferredMaintenanceWindow data))
    (when-let [data (lookup-entry config id :publicly-accessible)]
      (. builder publiclyAccessible data))
    (when-let [data (lookup-entry config id :relational-database-blueprint-id)]
      (. builder relationalDatabaseBlueprintId data))
    (when-let [data (lookup-entry config id :relational-database-bundle-id)]
      (. builder relationalDatabaseBundleId data))
    (when-let [data (lookup-entry config id :relational-database-name)]
      (. builder relationalDatabaseName data))
    (when-let [data (lookup-entry config id :relational-database-parameters)]
      (. builder relationalDatabaseParameters data))
    (when-let [data (lookup-entry config id :rotate-master-user-password)]
      (. builder rotateMasterUserPassword data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-database-relational-database-parameter-property-builder
  "The cfn-database-relational-database-parameter-property-builder function buildes out new instances of 
CfnDatabase$RelationalDatabaseParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValues` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `applyMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-method` |
| `applyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:apply-type` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `isModifiable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-modifiable` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |"
  [stack id config]
  (let [builder (CfnDatabase$RelationalDatabaseParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-values)]
      (. builder allowedValues data))
    (when-let [data (lookup-entry config id :apply-method)]
      (. builder applyMethod data))
    (when-let [data (lookup-entry config id :apply-type)]
      (. builder applyType data))
    (when-let [data (lookup-entry config id :data-type)]
      (. builder dataType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :is-modifiable)]
      (. builder isModifiable data))
    (when-let [data (lookup-entry config id :parameter-name)]
      (. builder parameterName data))
    (when-let [data (lookup-entry config id :parameter-value)]
      (. builder parameterValue data))
    (.build builder)))


(defn cfn-disk-add-on-property-builder
  "The cfn-disk-add-on-property-builder function buildes out new instances of 
CfnDisk$AddOnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addOnType` | java.lang.String | [[cdk.support/lookup-entry]] | `:add-on-type` |
| `autoSnapshotAddOnRequest` | software.amazon.awscdk.services.lightsail.CfnDisk$AutoSnapshotAddOnProperty | [[cdk.support/lookup-entry]] | `:auto-snapshot-add-on-request` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnDisk$AddOnProperty$Builder.)]
    (when-let [data (lookup-entry config id :add-on-type)]
      (. builder addOnType data))
    (when-let [data (lookup-entry config id :auto-snapshot-add-on-request)]
      (. builder autoSnapshotAddOnRequest data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-disk-auto-snapshot-add-on-property-builder
  "The cfn-disk-auto-snapshot-add-on-property-builder function buildes out new instances of 
CfnDisk$AutoSnapshotAddOnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snapshotTimeOfDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-time-of-day` |"
  [stack id config]
  (let [builder (CfnDisk$AutoSnapshotAddOnProperty$Builder.)]
    (when-let [data (lookup-entry config id :snapshot-time-of-day)]
      (. builder snapshotTimeOfDay data))
    (.build builder)))


(defn cfn-disk-builder
  "The cfn-disk-builder function buildes out new instances of 
CfnDisk$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addOns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:add-ons` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `diskName` | java.lang.String | [[cdk.support/lookup-entry]] | `:disk-name` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `sizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gb` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDisk$Builder/create stack id)]
    (when-let [data (lookup-entry config id :add-ons)]
      (. builder addOns data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :disk-name)]
      (. builder diskName data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :size-in-gb)]
      (. builder sizeInGb data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-disk-location-property-builder
  "The cfn-disk-location-property-builder function buildes out new instances of 
CfnDisk$LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `regionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-name` |"
  [stack id config]
  (let [builder (CfnDisk$LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :region-name)]
      (. builder regionName data))
    (.build builder)))


(defn cfn-disk-props-builder
  "The cfn-disk-props-builder function buildes out new instances of 
CfnDiskProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addOns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:add-ons` |
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `diskName` | java.lang.String | [[cdk.support/lookup-entry]] | `:disk-name` |
| `location` | software.amazon.awscdk.services.lightsail.CfnDisk$LocationProperty | [[cdk.support/lookup-entry]] | `:location` |
| `sizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-in-gb` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDiskProps$Builder.)]
    (when-let [data (lookup-entry config id :add-ons)]
      (. builder addOns data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :disk-name)]
      (. builder diskName data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :size-in-gb)]
      (. builder sizeInGb data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-distribution-builder
  "The cfn-distribution-builder function buildes out new instances of 
CfnDistribution$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDistribution$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :cache-behavior-settings)]
      (. builder cacheBehaviorSettings data))
    (when-let [data (lookup-entry config id :cache-behaviors)]
      (. builder cacheBehaviors data))
    (when-let [data (lookup-entry config id :certificate-name)]
      (. builder certificateName data))
    (when-let [data (lookup-entry config id :default-cache-behavior)]
      (. builder defaultCacheBehavior data))
    (when-let [data (lookup-entry config id :distribution-name)]
      (. builder distributionName data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :is-enabled)]
      (. builder isEnabled data))
    (when-let [data (lookup-entry config id :origin)]
      (. builder origin data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-distribution-cache-behavior-per-path-property-builder
  "The cfn-distribution-cache-behavior-per-path-property-builder function buildes out new instances of 
CfnDistribution$CacheBehaviorPerPathProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (CfnDistribution$CacheBehaviorPerPathProperty$Builder.)]
    (when-let [data (lookup-entry config id :behavior)]
      (. builder behavior data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn cfn-distribution-cache-behavior-property-builder
  "The cfn-distribution-cache-behavior-property-builder function buildes out new instances of 
CfnDistribution$CacheBehaviorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior` |"
  [stack id config]
  (let [builder (CfnDistribution$CacheBehaviorProperty$Builder.)]
    (when-let [data (lookup-entry config id :behavior)]
      (. builder behavior data))
    (.build builder)))


(defn cfn-distribution-cache-settings-property-builder
  "The cfn-distribution-cache-settings-property-builder function buildes out new instances of 
CfnDistribution$CacheSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedHttpMethods` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-http-methods` |
| `cachedHttpMethods` | java.lang.String | [[cdk.support/lookup-entry]] | `:cached-http-methods` |
| `defaultTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:default-ttl` |
| `forwardedCookies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forwarded-cookies` |
| `forwardedHeaders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forwarded-headers` |
| `forwardedQueryStrings` | software.amazon.awscdk.services.lightsail.CfnDistribution$QueryStringObjectProperty | [[cdk.support/lookup-entry]] | `:forwarded-query-strings` |
| `maximumTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-ttl` |
| `minimumTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minimum-ttl` |"
  [stack id config]
  (let [builder (CfnDistribution$CacheSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :allowed-http-methods)]
      (. builder allowedHttpMethods data))
    (when-let [data (lookup-entry config id :cached-http-methods)]
      (. builder cachedHttpMethods data))
    (when-let [data (lookup-entry config id :default-ttl)]
      (. builder defaultTtl data))
    (when-let [data (lookup-entry config id :forwarded-cookies)]
      (. builder forwardedCookies data))
    (when-let [data (lookup-entry config id :forwarded-headers)]
      (. builder forwardedHeaders data))
    (when-let [data (lookup-entry config id :forwarded-query-strings)]
      (. builder forwardedQueryStrings data))
    (when-let [data (lookup-entry config id :maximum-ttl)]
      (. builder maximumTtl data))
    (when-let [data (lookup-entry config id :minimum-ttl)]
      (. builder minimumTtl data))
    (.build builder)))


(defn cfn-distribution-cookie-object-property-builder
  "The cfn-distribution-cookie-object-property-builder function buildes out new instances of 
CfnDistribution$CookieObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookiesAllowList` | java.util.List | [[cdk.support/lookup-entry]] | `:cookies-allow-list` |
| `option` | java.lang.String | [[cdk.support/lookup-entry]] | `:option` |"
  [stack id config]
  (let [builder (CfnDistribution$CookieObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :cookies-allow-list)]
      (. builder cookiesAllowList data))
    (when-let [data (lookup-entry config id :option)]
      (. builder option data))
    (.build builder)))


(defn cfn-distribution-header-object-property-builder
  "The cfn-distribution-header-object-property-builder function buildes out new instances of 
CfnDistribution$HeaderObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `headersAllowList` | java.util.List | [[cdk.support/lookup-entry]] | `:headers-allow-list` |
| `option` | java.lang.String | [[cdk.support/lookup-entry]] | `:option` |"
  [stack id config]
  (let [builder (CfnDistribution$HeaderObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :headers-allow-list)]
      (. builder headersAllowList data))
    (when-let [data (lookup-entry config id :option)]
      (. builder option data))
    (.build builder)))


(defn cfn-distribution-input-origin-property-builder
  "The cfn-distribution-input-origin-property-builder function buildes out new instances of 
CfnDistribution$InputOriginProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `protocolPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol-policy` |
| `regionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-name` |"
  [stack id config]
  (let [builder (CfnDistribution$InputOriginProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :protocol-policy)]
      (. builder protocolPolicy data))
    (when-let [data (lookup-entry config id :region-name)]
      (. builder regionName data))
    (.build builder)))


(defn cfn-distribution-props-builder
  "The cfn-distribution-props-builder function buildes out new instances of 
CfnDistributionProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDistributionProps$Builder.)]
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :cache-behavior-settings)]
      (. builder cacheBehaviorSettings data))
    (when-let [data (lookup-entry config id :cache-behaviors)]
      (. builder cacheBehaviors data))
    (when-let [data (lookup-entry config id :certificate-name)]
      (. builder certificateName data))
    (when-let [data (lookup-entry config id :default-cache-behavior)]
      (. builder defaultCacheBehavior data))
    (when-let [data (lookup-entry config id :distribution-name)]
      (. builder distributionName data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :is-enabled)]
      (. builder isEnabled data))
    (when-let [data (lookup-entry config id :origin)]
      (. builder origin data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-distribution-query-string-object-property-builder
  "The cfn-distribution-query-string-object-property-builder function buildes out new instances of 
CfnDistribution$QueryStringObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `option` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:option` |
| `queryStringsAllowList` | java.util.List | [[cdk.support/lookup-entry]] | `:query-strings-allow-list` |"
  [stack id config]
  (let [builder (CfnDistribution$QueryStringObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :option)]
      (. builder option data))
    (when-let [data (lookup-entry config id :query-strings-allow-list)]
      (. builder queryStringsAllowList data))
    (.build builder)))


(defn cfn-instance-add-on-property-builder
  "The cfn-instance-add-on-property-builder function buildes out new instances of 
CfnInstance$AddOnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addOnType` | java.lang.String | [[cdk.support/lookup-entry]] | `:add-on-type` |
| `autoSnapshotAddOnRequest` | software.amazon.awscdk.services.lightsail.CfnInstance$AutoSnapshotAddOnProperty | [[cdk.support/lookup-entry]] | `:auto-snapshot-add-on-request` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnInstance$AddOnProperty$Builder.)]
    (when-let [data (lookup-entry config id :add-on-type)]
      (. builder addOnType data))
    (when-let [data (lookup-entry config id :auto-snapshot-add-on-request)]
      (. builder autoSnapshotAddOnRequest data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-instance-auto-snapshot-add-on-property-builder
  "The cfn-instance-auto-snapshot-add-on-property-builder function buildes out new instances of 
CfnInstance$AutoSnapshotAddOnProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snapshotTimeOfDay` | java.lang.String | [[cdk.support/lookup-entry]] | `:snapshot-time-of-day` |"
  [stack id config]
  (let [builder (CfnInstance$AutoSnapshotAddOnProperty$Builder.)]
    (when-let [data (lookup-entry config id :snapshot-time-of-day)]
      (. builder snapshotTimeOfDay data))
    (.build builder)))


(defn cfn-instance-builder
  "The cfn-instance-builder function buildes out new instances of 
CfnInstance$Builder using the provided configuration.  Each field is set as follows:

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
| `userData` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (CfnInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :add-ons)]
      (. builder addOns data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :blueprint-id)]
      (. builder blueprintId data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :hardware)]
      (. builder hardware data))
    (when-let [data (lookup-entry config id :instance-name)]
      (. builder instanceName data))
    (when-let [data (lookup-entry config id :key-pair-name)]
      (. builder keyPairName data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :networking)]
      (. builder networking data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn cfn-instance-disk-property-builder
  "The cfn-instance-disk-property-builder function buildes out new instances of 
CfnInstance$DiskProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachedTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:attached-to` |
| `attachmentState` | java.lang.String | [[cdk.support/lookup-entry]] | `:attachment-state` |
| `diskName` | java.lang.String | [[cdk.support/lookup-entry]] | `:disk-name` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `isSystemDisk` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-system-disk` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `sizeInGb` | java.lang.String | [[cdk.support/lookup-entry]] | `:size-in-gb` |"
  [stack id config]
  (let [builder (CfnInstance$DiskProperty$Builder.)]
    (when-let [data (lookup-entry config id :attached-to)]
      (. builder attachedTo data))
    (when-let [data (lookup-entry config id :attachment-state)]
      (. builder attachmentState data))
    (when-let [data (lookup-entry config id :disk-name)]
      (. builder diskName data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :is-system-disk)]
      (. builder isSystemDisk data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :size-in-gb)]
      (. builder sizeInGb data))
    (.build builder)))


(defn cfn-instance-hardware-property-builder
  "The cfn-instance-hardware-property-builder function buildes out new instances of 
CfnInstance$HardwareProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-count` |
| `disks` | java.util.List | [[cdk.support/lookup-entry]] | `:disks` |
| `ramSizeInGb` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ram-size-in-gb` |"
  [stack id config]
  (let [builder (CfnInstance$HardwareProperty$Builder.)]
    (when-let [data (lookup-entry config id :cpu-count)]
      (. builder cpuCount data))
    (when-let [data (lookup-entry config id :disks)]
      (. builder disks data))
    (when-let [data (lookup-entry config id :ram-size-in-gb)]
      (. builder ramSizeInGb data))
    (.build builder)))


(defn cfn-instance-location-property-builder
  "The cfn-instance-location-property-builder function buildes out new instances of 
CfnInstance$LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:availability-zone` |
| `regionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:region-name` |"
  [stack id config]
  (let [builder (CfnInstance$LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :region-name)]
      (. builder regionName data))
    (.build builder)))


(defn cfn-instance-monthly-transfer-property-builder
  "The cfn-instance-monthly-transfer-property-builder function buildes out new instances of 
CfnInstance$MonthlyTransferProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gbPerMonthAllocated` | java.lang.String | [[cdk.support/lookup-entry]] | `:gb-per-month-allocated` |"
  [stack id config]
  (let [builder (CfnInstance$MonthlyTransferProperty$Builder.)]
    (when-let [data (lookup-entry config id :gb-per-month-allocated)]
      (. builder gbPerMonthAllocated data))
    (.build builder)))


(defn cfn-instance-networking-property-builder
  "The cfn-instance-networking-property-builder function buildes out new instances of 
CfnInstance$NetworkingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `monthlyTransfer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monthly-transfer` |
| `ports` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ports` |"
  [stack id config]
  (let [builder (CfnInstance$NetworkingProperty$Builder.)]
    (when-let [data (lookup-entry config id :monthly-transfer)]
      (. builder monthlyTransfer data))
    (when-let [data (lookup-entry config id :ports)]
      (. builder ports data))
    (.build builder)))


(defn cfn-instance-port-property-builder
  "The cfn-instance-port-property-builder function buildes out new instances of 
CfnInstance$PortProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnInstance$PortProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-direction)]
      (. builder accessDirection data))
    (when-let [data (lookup-entry config id :access-from)]
      (. builder accessFrom data))
    (when-let [data (lookup-entry config id :access-type)]
      (. builder accessType data))
    (when-let [data (lookup-entry config id :cidr-list-aliases)]
      (. builder cidrListAliases data))
    (when-let [data (lookup-entry config id :cidrs)]
      (. builder cidrs data))
    (when-let [data (lookup-entry config id :common-name)]
      (. builder commonName data))
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :ipv6-cidrs)]
      (. builder ipv6Cidrs data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-instance-props-builder
  "The cfn-instance-props-builder function buildes out new instances of 
CfnInstanceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `userData` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-data` |"
  [stack id config]
  (let [builder (CfnInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :add-ons)]
      (. builder addOns data))
    (when-let [data (lookup-entry config id :availability-zone)]
      (. builder availabilityZone data))
    (when-let [data (lookup-entry config id :blueprint-id)]
      (. builder blueprintId data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :hardware)]
      (. builder hardware data))
    (when-let [data (lookup-entry config id :instance-name)]
      (. builder instanceName data))
    (when-let [data (lookup-entry config id :key-pair-name)]
      (. builder keyPairName data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :networking)]
      (. builder networking data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-data)]
      (. builder userData data))
    (.build builder)))


(defn cfn-instance-state-property-builder
  "The cfn-instance-state-property-builder function buildes out new instances of 
CfnInstance$StateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | java.lang.Number | [[cdk.support/lookup-entry]] | `:code` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnInstance$StateProperty$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-load-balancer-builder
  "The cfn-load-balancer-builder function buildes out new instances of 
CfnLoadBalancer$Builder using the provided configuration.  Each field is set as follows:

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
| `tlsPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-policy-name` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :attached-instances)]
      (. builder attachedInstances data))
    (when-let [data (lookup-entry config id :health-check-path)]
      (. builder healthCheckPath data))
    (when-let [data (lookup-entry config id :instance-port)]
      (. builder instancePort data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :session-stickiness-enabled)]
      (. builder sessionStickinessEnabled data))
    (when-let [data (lookup-entry config id :session-stickiness-lb-cookie-duration-seconds)]
      (. builder sessionStickinessLbCookieDurationSeconds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tls-policy-name)]
      (. builder tlsPolicyName data))
    (.build builder)))


(defn cfn-load-balancer-props-builder
  "The cfn-load-balancer-props-builder function buildes out new instances of 
CfnLoadBalancerProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tlsPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-policy-name` |"
  [stack id config]
  (let [builder (CfnLoadBalancerProps$Builder.)]
    (when-let [data (lookup-entry config id :attached-instances)]
      (. builder attachedInstances data))
    (when-let [data (lookup-entry config id :health-check-path)]
      (. builder healthCheckPath data))
    (when-let [data (lookup-entry config id :instance-port)]
      (. builder instancePort data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :session-stickiness-enabled)]
      (. builder sessionStickinessEnabled data))
    (when-let [data (lookup-entry config id :session-stickiness-lb-cookie-duration-seconds)]
      (. builder sessionStickinessLbCookieDurationSeconds data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tls-policy-name)]
      (. builder tlsPolicyName data))
    (.build builder)))


(defn cfn-load-balancer-tls-certificate-builder
  "The cfn-load-balancer-tls-certificate-builder function buildes out new instances of 
CfnLoadBalancerTlsCertificate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-alternative-names` |
| `certificateDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-domain-name` |
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `httpsRedirectionEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:https-redirection-enabled` |
| `isAttached` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-attached` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |"
  [stack id config]
  (let [builder (CfnLoadBalancerTlsCertificate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :certificate-alternative-names)]
      (. builder certificateAlternativeNames data))
    (when-let [data (lookup-entry config id :certificate-domain-name)]
      (. builder certificateDomainName data))
    (when-let [data (lookup-entry config id :certificate-name)]
      (. builder certificateName data))
    (when-let [data (lookup-entry config id :https-redirection-enabled)]
      (. builder httpsRedirectionEnabled data))
    (when-let [data (lookup-entry config id :is-attached)]
      (. builder isAttached data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (.build builder)))


(defn cfn-load-balancer-tls-certificate-props-builder
  "The cfn-load-balancer-tls-certificate-props-builder function buildes out new instances of 
CfnLoadBalancerTlsCertificateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAlternativeNames` | java.util.List | [[cdk.support/lookup-entry]] | `:certificate-alternative-names` |
| `certificateDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-domain-name` |
| `certificateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-name` |
| `httpsRedirectionEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:https-redirection-enabled` |
| `isAttached` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-attached` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |"
  [stack id config]
  (let [builder (CfnLoadBalancerTlsCertificateProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate-alternative-names)]
      (. builder certificateAlternativeNames data))
    (when-let [data (lookup-entry config id :certificate-domain-name)]
      (. builder certificateDomainName data))
    (when-let [data (lookup-entry config id :certificate-name)]
      (. builder certificateName data))
    (when-let [data (lookup-entry config id :https-redirection-enabled)]
      (. builder httpsRedirectionEnabled data))
    (when-let [data (lookup-entry config id :is-attached)]
      (. builder isAttached data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (.build builder)))


(defn cfn-static-ip-builder
  "The cfn-static-ip-builder function buildes out new instances of 
CfnStaticIp$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachedTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:attached-to` |
| `staticIpName` | java.lang.String | [[cdk.support/lookup-entry]] | `:static-ip-name` |"
  [stack id config]
  (let [builder (CfnStaticIp$Builder/create stack id)]
    (when-let [data (lookup-entry config id :attached-to)]
      (. builder attachedTo data))
    (when-let [data (lookup-entry config id :static-ip-name)]
      (. builder staticIpName data))
    (.build builder)))


(defn cfn-static-ip-props-builder
  "The cfn-static-ip-props-builder function buildes out new instances of 
CfnStaticIpProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachedTo` | java.lang.String | [[cdk.support/lookup-entry]] | `:attached-to` |
| `staticIpName` | java.lang.String | [[cdk.support/lookup-entry]] | `:static-ip-name` |"
  [stack id config]
  (let [builder (CfnStaticIpProps$Builder.)]
    (when-let [data (lookup-entry config id :attached-to)]
      (. builder attachedTo data))
    (when-let [data (lookup-entry config id :static-ip-name)]
      (. builder staticIpName data))
    (.build builder)))