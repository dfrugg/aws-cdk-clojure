(ns cdk.api.services.apprunner
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.apprunner package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.apprunner CfnAutoScalingConfiguration$Builder
                                                      CfnAutoScalingConfigurationProps$Builder
                                                      CfnObservabilityConfiguration$Builder
                                                      CfnObservabilityConfiguration$TraceConfigurationProperty$Builder
                                                      CfnObservabilityConfigurationProps$Builder
                                                      CfnService$AuthenticationConfigurationProperty$Builder
                                                      CfnService$Builder
                                                      CfnService$CodeConfigurationProperty$Builder
                                                      CfnService$CodeConfigurationValuesProperty$Builder
                                                      CfnService$CodeRepositoryProperty$Builder
                                                      CfnService$EgressConfigurationProperty$Builder
                                                      CfnService$EncryptionConfigurationProperty$Builder
                                                      CfnService$HealthCheckConfigurationProperty$Builder
                                                      CfnService$ImageConfigurationProperty$Builder
                                                      CfnService$ImageRepositoryProperty$Builder
                                                      CfnService$IngressConfigurationProperty$Builder
                                                      CfnService$InstanceConfigurationProperty$Builder
                                                      CfnService$KeyValuePairProperty$Builder
                                                      CfnService$NetworkConfigurationProperty$Builder
                                                      CfnService$ServiceObservabilityConfigurationProperty$Builder
                                                      CfnService$SourceCodeVersionProperty$Builder
                                                      CfnService$SourceConfigurationProperty$Builder
                                                      CfnServiceProps$Builder
                                                      CfnVpcConnector$Builder
                                                      CfnVpcConnectorProps$Builder
                                                      CfnVpcIngressConnection$Builder
                                                      CfnVpcIngressConnection$IngressVpcConfigurationProperty$Builder
                                                      CfnVpcIngressConnectionProps$Builder]))


(defn cfn-auto-scaling-configuration-builder
  "The cfn-auto-scaling-configuration-builder function buildes out new instances of 
CfnAutoScalingConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-configuration-name` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAutoScalingConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-configuration-name)]
      (. builder autoScalingConfigurationName data))
    (when-let [data (lookup-entry config id :max-concurrency)]
      (. builder maxConcurrency data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-auto-scaling-configuration-props-builder
  "The cfn-auto-scaling-configuration-props-builder function buildes out new instances of 
CfnAutoScalingConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-configuration-name` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAutoScalingConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-configuration-name)]
      (. builder autoScalingConfigurationName data))
    (when-let [data (lookup-entry config id :max-concurrency)]
      (. builder maxConcurrency data))
    (when-let [data (lookup-entry config id :max-size)]
      (. builder maxSize data))
    (when-let [data (lookup-entry config id :min-size)]
      (. builder minSize data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-observability-configuration-builder
  "The cfn-observability-configuration-builder function buildes out new instances of 
CfnObservabilityConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `observabilityConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:observability-configuration-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `traceConfiguration` | software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration$TraceConfigurationProperty | [[cdk.support/lookup-entry]] | `:trace-configuration` |"
  [stack id config]
  (let [builder (CfnObservabilityConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :observability-configuration-name)]
      (. builder observabilityConfigurationName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trace-configuration)]
      (. builder traceConfiguration data))
    (.build builder)))


(defn cfn-observability-configuration-props-builder
  "The cfn-observability-configuration-props-builder function buildes out new instances of 
CfnObservabilityConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `observabilityConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:observability-configuration-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `traceConfiguration` | software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration$TraceConfigurationProperty | [[cdk.support/lookup-entry]] | `:trace-configuration` |"
  [stack id config]
  (let [builder (CfnObservabilityConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :observability-configuration-name)]
      (. builder observabilityConfigurationName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trace-configuration)]
      (. builder traceConfiguration data))
    (.build builder)))


(defn cfn-observability-configuration-trace-configuration-property-builder
  "The cfn-observability-configuration-trace-configuration-property-builder function buildes out new instances of 
CfnObservabilityConfiguration$TraceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vendor` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor` |"
  [stack id config]
  (let [builder (CfnObservabilityConfiguration$TraceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :vendor)]
      (. builder vendor data))
    (.build builder)))


(defn cfn-service-authentication-configuration-property-builder
  "The cfn-service-authentication-configuration-property-builder function buildes out new instances of 
CfnService$AuthenticationConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-role-arn` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |"
  [stack id config]
  (let [builder (CfnService$AuthenticationConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :access-role-arn)]
      (. builder accessRoleArn data))
    (when-let [data (lookup-entry config id :connection-arn)]
      (. builder connectionArn data))
    (.build builder)))


(defn cfn-service-builder
  "The cfn-service-builder function buildes out new instances of 
CfnService$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-configuration-arn` |
| `encryptionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `healthCheckConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$HealthCheckConfigurationProperty | [[cdk.support/lookup-entry]] | `:health-check-configuration` |
| `instanceConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$InstanceConfigurationProperty | [[cdk.support/lookup-entry]] | `:instance-configuration` |
| `networkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `observabilityConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$ServiceObservabilityConfigurationProperty | [[cdk.support/lookup-entry]] | `:observability-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `sourceConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$SourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:source-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :auto-scaling-configuration-arn)]
      (. builder autoScalingConfigurationArn data))
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :health-check-configuration)]
      (. builder healthCheckConfiguration data))
    (when-let [data (lookup-entry config id :instance-configuration)]
      (. builder instanceConfiguration data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :observability-configuration)]
      (. builder observabilityConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :source-configuration)]
      (. builder sourceConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-code-configuration-property-builder
  "The cfn-service-code-configuration-property-builder function buildes out new instances of 
CfnService$CodeConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeConfigurationValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-configuration-values` |
| `configurationSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-source` |"
  [stack id config]
  (let [builder (CfnService$CodeConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-configuration-values)]
      (. builder codeConfigurationValues data))
    (when-let [data (lookup-entry config id :configuration-source)]
      (. builder configurationSource data))
    (.build builder)))


(defn cfn-service-code-configuration-values-property-builder
  "The cfn-service-code-configuration-values-property-builder function buildes out new instances of 
CfnService$CodeConfigurationValuesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildCommand` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-command` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |
| `runtimeEnvironmentSecrets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime-environment-secrets` |
| `runtimeEnvironmentVariables` | java.util.List | [[cdk.support/lookup-entry]] | `:runtime-environment-variables` |
| `startCommand` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-command` |"
  [stack id config]
  (let [builder (CfnService$CodeConfigurationValuesProperty$Builder.)]
    (when-let [data (lookup-entry config id :build-command)]
      (. builder buildCommand data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :runtime-environment-secrets)]
      (. builder runtimeEnvironmentSecrets data))
    (when-let [data (lookup-entry config id :runtime-environment-variables)]
      (. builder runtimeEnvironmentVariables data))
    (when-let [data (lookup-entry config id :start-command)]
      (. builder startCommand data))
    (.build builder)))


(defn cfn-service-code-repository-property-builder
  "The cfn-service-code-repository-property-builder function buildes out new instances of 
CfnService$CodeRepositoryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-configuration` |
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |
| `sourceCodeVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-code-version` |
| `sourceDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-directory` |"
  [stack id config]
  (let [builder (CfnService$CodeRepositoryProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-configuration)]
      (. builder codeConfiguration data))
    (when-let [data (lookup-entry config id :repository-url)]
      (. builder repositoryUrl data))
    (when-let [data (lookup-entry config id :source-code-version)]
      (. builder sourceCodeVersion data))
    (when-let [data (lookup-entry config id :source-directory)]
      (. builder sourceDirectory data))
    (.build builder)))


(defn cfn-service-egress-configuration-property-builder
  "The cfn-service-egress-configuration-property-builder function buildes out new instances of 
CfnService$EgressConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:egress-type` |
| `vpcConnectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-connector-arn` |"
  [stack id config]
  (let [builder (CfnService$EgressConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :egress-type)]
      (. builder egressType data))
    (when-let [data (lookup-entry config id :vpc-connector-arn)]
      (. builder vpcConnectorArn data))
    (.build builder)))


(defn cfn-service-encryption-configuration-property-builder
  "The cfn-service-encryption-configuration-property-builder function buildes out new instances of 
CfnService$EncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |"
  [stack id config]
  (let [builder (CfnService$EncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (.build builder)))


(defn cfn-service-health-check-configuration-property-builder
  "The cfn-service-health-check-configuration-property-builder function buildes out new instances of 
CfnService$HealthCheckConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |"
  [stack id config]
  (let [builder (CfnService$HealthCheckConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :healthy-threshold)]
      (. builder healthyThreshold data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :unhealthy-threshold)]
      (. builder unhealthyThreshold data))
    (.build builder)))


(defn cfn-service-image-configuration-property-builder
  "The cfn-service-image-configuration-property-builder function buildes out new instances of 
CfnService$ImageConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `runtimeEnvironmentSecrets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime-environment-secrets` |
| `runtimeEnvironmentVariables` | java.util.List | [[cdk.support/lookup-entry]] | `:runtime-environment-variables` |
| `startCommand` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-command` |"
  [stack id config]
  (let [builder (CfnService$ImageConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :runtime-environment-secrets)]
      (. builder runtimeEnvironmentSecrets data))
    (when-let [data (lookup-entry config id :runtime-environment-variables)]
      (. builder runtimeEnvironmentVariables data))
    (when-let [data (lookup-entry config id :start-command)]
      (. builder startCommand data))
    (.build builder)))


(defn cfn-service-image-repository-property-builder
  "The cfn-service-image-repository-property-builder function buildes out new instances of 
CfnService$ImageRepositoryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$ImageConfigurationProperty | [[cdk.support/lookup-entry]] | `:image-configuration` |
| `imageIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-identifier` |
| `imageRepositoryType` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-repository-type` |"
  [stack id config]
  (let [builder (CfnService$ImageRepositoryProperty$Builder.)]
    (when-let [data (lookup-entry config id :image-configuration)]
      (. builder imageConfiguration data))
    (when-let [data (lookup-entry config id :image-identifier)]
      (. builder imageIdentifier data))
    (when-let [data (lookup-entry config id :image-repository-type)]
      (. builder imageRepositoryType data))
    (.build builder)))


(defn cfn-service-ingress-configuration-property-builder
  "The cfn-service-ingress-configuration-property-builder function buildes out new instances of 
CfnService$IngressConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isPubliclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-publicly-accessible` |"
  [stack id config]
  (let [builder (CfnService$IngressConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :is-publicly-accessible)]
      (. builder isPubliclyAccessible data))
    (.build builder)))


(defn cfn-service-instance-configuration-property-builder
  "The cfn-service-instance-configuration-property-builder function buildes out new instances of 
CfnService$InstanceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `instanceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-role-arn` |
| `memory` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory` |"
  [stack id config]
  (let [builder (CfnService$InstanceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :instance-role-arn)]
      (. builder instanceRoleArn data))
    (when-let [data (lookup-entry config id :memory)]
      (. builder memory data))
    (.build builder)))


(defn cfn-service-key-value-pair-property-builder
  "The cfn-service-key-value-pair-property-builder function buildes out new instances of 
CfnService$KeyValuePairProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnService$KeyValuePairProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-service-network-configuration-property-builder
  "The cfn-service-network-configuration-property-builder function buildes out new instances of 
CfnService$NetworkConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$EgressConfigurationProperty | [[cdk.support/lookup-entry]] | `:egress-configuration` |
| `ingressConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$IngressConfigurationProperty | [[cdk.support/lookup-entry]] | `:ingress-configuration` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |"
  [stack id config]
  (let [builder (CfnService$NetworkConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :egress-configuration)]
      (. builder egressConfiguration data))
    (when-let [data (lookup-entry config id :ingress-configuration)]
      (. builder ingressConfiguration data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (.build builder)))


(defn cfn-service-props-builder
  "The cfn-service-props-builder function buildes out new instances of 
CfnServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-configuration-arn` |
| `encryptionConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$EncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `healthCheckConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-configuration` |
| `instanceConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$InstanceConfigurationProperty | [[cdk.support/lookup-entry]] | `:instance-configuration` |
| `networkConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-configuration` |
| `observabilityConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:observability-configuration` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `sourceConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$SourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:source-configuration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :auto-scaling-configuration-arn)]
      (. builder autoScalingConfigurationArn data))
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :health-check-configuration)]
      (. builder healthCheckConfiguration data))
    (when-let [data (lookup-entry config id :instance-configuration)]
      (. builder instanceConfiguration data))
    (when-let [data (lookup-entry config id :network-configuration)]
      (. builder networkConfiguration data))
    (when-let [data (lookup-entry config id :observability-configuration)]
      (. builder observabilityConfiguration data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :source-configuration)]
      (. builder sourceConfiguration data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-service-service-observability-configuration-property-builder
  "The cfn-service-service-observability-configuration-property-builder function buildes out new instances of 
CfnService$ServiceObservabilityConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `observabilityConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:observability-configuration-arn` |
| `observabilityEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:observability-enabled` |"
  [stack id config]
  (let [builder (CfnService$ServiceObservabilityConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :observability-configuration-arn)]
      (. builder observabilityConfigurationArn data))
    (when-let [data (lookup-entry config id :observability-enabled)]
      (. builder observabilityEnabled data))
    (.build builder)))


(defn cfn-service-source-code-version-property-builder
  "The cfn-service-source-code-version-property-builder function buildes out new instances of 
CfnService$SourceCodeVersionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnService$SourceCodeVersionProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-service-source-configuration-property-builder
  "The cfn-service-source-configuration-property-builder function buildes out new instances of 
CfnService$SourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `autoDeploymentsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-deployments-enabled` |
| `codeRepository` | software.amazon.awscdk.services.apprunner.CfnService$CodeRepositoryProperty | [[cdk.support/lookup-entry]] | `:code-repository` |
| `imageRepository` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-repository` |"
  [stack id config]
  (let [builder (CfnService$SourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :authentication-configuration)]
      (. builder authenticationConfiguration data))
    (when-let [data (lookup-entry config id :auto-deployments-enabled)]
      (. builder autoDeploymentsEnabled data))
    (when-let [data (lookup-entry config id :code-repository)]
      (. builder codeRepository data))
    (when-let [data (lookup-entry config id :image-repository)]
      (. builder imageRepository data))
    (.build builder)))


(defn cfn-vpc-connector-builder
  "The cfn-vpc-connector-builder function buildes out new instances of 
CfnVpcConnector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConnectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-connector-name` |"
  [stack id config]
  (let [builder (CfnVpcConnector$Builder/create stack id)]
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-connector-name)]
      (. builder vpcConnectorName data))
    (.build builder)))


(defn cfn-vpc-connector-props-builder
  "The cfn-vpc-connector-props-builder function buildes out new instances of 
CfnVpcConnectorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConnectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-connector-name` |"
  [stack id config]
  (let [builder (CfnVpcConnectorProps$Builder.)]
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-connector-name)]
      (. builder vpcConnectorName data))
    (.build builder)))


(defn cfn-vpc-ingress-connection-builder
  "The cfn-vpc-ingress-connection-builder function buildes out new instances of 
CfnVpcIngressConnection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ingressVpcConfiguration` | software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection$IngressVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:ingress-vpc-configuration` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcIngressConnectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-ingress-connection-name` |"
  [stack id config]
  (let [builder (CfnVpcIngressConnection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :ingress-vpc-configuration)]
      (. builder ingressVpcConfiguration data))
    (when-let [data (lookup-entry config id :service-arn)]
      (. builder serviceArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-ingress-connection-name)]
      (. builder vpcIngressConnectionName data))
    (.build builder)))


(defn cfn-vpc-ingress-connection-ingress-vpc-configuration-property-builder
  "The cfn-vpc-ingress-connection-ingress-vpc-configuration-property-builder function buildes out new instances of 
CfnVpcIngressConnection$IngressVpcConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnVpcIngressConnection$IngressVpcConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :vpc-endpoint-id)]
      (. builder vpcEndpointId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-vpc-ingress-connection-props-builder
  "The cfn-vpc-ingress-connection-props-builder function buildes out new instances of 
CfnVpcIngressConnectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ingressVpcConfiguration` | software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection$IngressVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:ingress-vpc-configuration` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcIngressConnectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-ingress-connection-name` |"
  [stack id config]
  (let [builder (CfnVpcIngressConnectionProps$Builder.)]
    (when-let [data (lookup-entry config id :ingress-vpc-configuration)]
      (. builder ingressVpcConfiguration data))
    (when-let [data (lookup-entry config id :service-arn)]
      (. builder serviceArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-ingress-connection-name)]
      (. builder vpcIngressConnectionName data))
    (.build builder)))