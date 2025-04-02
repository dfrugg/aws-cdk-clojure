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


(defn cfn-auto-scaling-configuration-builder>
  "The cfn-auto-scaling-configuration-builder> function updates a CfnAutoScalingConfiguration$Builder instance using the provided configuration.
  The function takes the CfnAutoScalingConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-configuration-name` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAutoScalingConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-scaling-configuration-name)]
    (. builder autoScalingConfigurationName data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-some [data (lookup-entry config id :min-size)]
    (. builder minSize data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-auto-scaling-configuration-builder
  "Creates a  `CfnAutoScalingConfiguration$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-auto-scaling-configuration-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-auto-scaling-configuration-builder> (CfnAutoScalingConfiguration$Builder/create scope (name id)) id config))


(defn cfn-auto-scaling-configuration-props-builder>
  "The cfn-auto-scaling-configuration-props-builder> function updates a CfnAutoScalingConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnAutoScalingConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoScalingConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-scaling-configuration-name` |
| `maxConcurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `minSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-size` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAutoScalingConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-scaling-configuration-name)]
    (. builder autoScalingConfigurationName data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-some [data (lookup-entry config id :min-size)]
    (. builder minSize data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-auto-scaling-configuration-props-builder
  "Creates a  `CfnAutoScalingConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-auto-scaling-configuration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-auto-scaling-configuration-props-builder> (new CfnAutoScalingConfigurationProps$Builder) id config))


(defn cfn-observability-configuration-builder>
  "The cfn-observability-configuration-builder> function updates a CfnObservabilityConfiguration$Builder instance using the provided configuration.
  The function takes the CfnObservabilityConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `observabilityConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:observability-configuration-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `traceConfiguration` | software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration$TraceConfigurationProperty | [[cdk.support/lookup-entry]] | `:trace-configuration` |
"
  [^CfnObservabilityConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :observability-configuration-name)]
    (. builder observabilityConfigurationName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :trace-configuration)]
    (. builder traceConfiguration data))
  (.build builder))


(defn cfn-observability-configuration-builder
  "Creates a  `CfnObservabilityConfiguration$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-observability-configuration-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-observability-configuration-builder> (CfnObservabilityConfiguration$Builder/create scope (name id)) id config))


(defn cfn-observability-configuration-props-builder>
  "The cfn-observability-configuration-props-builder> function updates a CfnObservabilityConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnObservabilityConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `observabilityConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:observability-configuration-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `traceConfiguration` | software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration$TraceConfigurationProperty | [[cdk.support/lookup-entry]] | `:trace-configuration` |
"
  [^CfnObservabilityConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :observability-configuration-name)]
    (. builder observabilityConfigurationName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :trace-configuration)]
    (. builder traceConfiguration data))
  (.build builder))


(defn cfn-observability-configuration-props-builder
  "Creates a  `CfnObservabilityConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-observability-configuration-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-observability-configuration-props-builder> (new CfnObservabilityConfigurationProps$Builder) id config))


(defn cfn-observability-configuration-trace-configuration-property-builder>
  "The cfn-observability-configuration-trace-configuration-property-builder> function updates a CfnObservabilityConfiguration$TraceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnObservabilityConfiguration$TraceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vendor` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor` |
"
  [^CfnObservabilityConfiguration$TraceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :vendor)]
    (. builder vendor data))
  (.build builder))


(defn cfn-observability-configuration-trace-configuration-property-builder
  "Creates a  `CfnObservabilityConfiguration$TraceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-observability-configuration-trace-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-observability-configuration-trace-configuration-property-builder> (new CfnObservabilityConfiguration$TraceConfigurationProperty$Builder) id config))


(defn cfn-service-authentication-configuration-property-builder>
  "The cfn-service-authentication-configuration-property-builder> function updates a CfnService$AuthenticationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$AuthenticationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-role-arn` |
| `connectionArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-arn` |
"
  [^CfnService$AuthenticationConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-role-arn)]
    (. builder accessRoleArn data))
  (when-some [data (lookup-entry config id :connection-arn)]
    (. builder connectionArn data))
  (.build builder))


(defn cfn-service-authentication-configuration-property-builder
  "Creates a  `CfnService$AuthenticationConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-authentication-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-authentication-configuration-property-builder> (new CfnService$AuthenticationConfigurationProperty$Builder) id config))


(defn cfn-service-builder>
  "The cfn-service-builder> function updates a CfnService$Builder instance using the provided configuration.
  The function takes the CfnService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnService$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-scaling-configuration-arn)]
    (. builder autoScalingConfigurationArn data))
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :health-check-configuration)]
    (. builder healthCheckConfiguration data))
  (when-some [data (lookup-entry config id :instance-configuration)]
    (. builder instanceConfiguration data))
  (when-some [data (lookup-entry config id :network-configuration)]
    (. builder networkConfiguration data))
  (when-some [data (lookup-entry config id :observability-configuration)]
    (. builder observabilityConfiguration data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :source-configuration)]
    (. builder sourceConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-builder
  "Creates a  `CfnService$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-service-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-service-builder> (CfnService$Builder/create scope (name id)) id config))


(defn cfn-service-code-configuration-property-builder>
  "The cfn-service-code-configuration-property-builder> function updates a CfnService$CodeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$CodeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeConfigurationValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-configuration-values` |
| `configurationSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-source` |
"
  [^CfnService$CodeConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :code-configuration-values)]
    (. builder codeConfigurationValues data))
  (when-some [data (lookup-entry config id :configuration-source)]
    (. builder configurationSource data))
  (.build builder))


(defn cfn-service-code-configuration-property-builder
  "Creates a  `CfnService$CodeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-code-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-code-configuration-property-builder> (new CfnService$CodeConfigurationProperty$Builder) id config))


(defn cfn-service-code-configuration-values-property-builder>
  "The cfn-service-code-configuration-values-property-builder> function updates a CfnService$CodeConfigurationValuesProperty$Builder instance using the provided configuration.
  The function takes the CfnService$CodeConfigurationValuesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buildCommand` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-command` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |
| `runtimeEnvironmentSecrets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime-environment-secrets` |
| `runtimeEnvironmentVariables` | java.util.List | [[cdk.support/lookup-entry]] | `:runtime-environment-variables` |
| `startCommand` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-command` |
"
  [^CfnService$CodeConfigurationValuesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :build-command)]
    (. builder buildCommand data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-some [data (lookup-entry config id :runtime-environment-secrets)]
    (. builder runtimeEnvironmentSecrets data))
  (when-some [data (lookup-entry config id :runtime-environment-variables)]
    (. builder runtimeEnvironmentVariables data))
  (when-some [data (lookup-entry config id :start-command)]
    (. builder startCommand data))
  (.build builder))


(defn cfn-service-code-configuration-values-property-builder
  "Creates a  `CfnService$CodeConfigurationValuesProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-code-configuration-values-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-code-configuration-values-property-builder> (new CfnService$CodeConfigurationValuesProperty$Builder) id config))


(defn cfn-service-code-repository-property-builder>
  "The cfn-service-code-repository-property-builder> function updates a CfnService$CodeRepositoryProperty$Builder instance using the provided configuration.
  The function takes the CfnService$CodeRepositoryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-configuration` |
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |
| `sourceCodeVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-code-version` |
| `sourceDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-directory` |
"
  [^CfnService$CodeRepositoryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :code-configuration)]
    (. builder codeConfiguration data))
  (when-some [data (lookup-entry config id :repository-url)]
    (. builder repositoryUrl data))
  (when-some [data (lookup-entry config id :source-code-version)]
    (. builder sourceCodeVersion data))
  (when-some [data (lookup-entry config id :source-directory)]
    (. builder sourceDirectory data))
  (.build builder))


(defn cfn-service-code-repository-property-builder
  "Creates a  `CfnService$CodeRepositoryProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-code-repository-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-code-repository-property-builder> (new CfnService$CodeRepositoryProperty$Builder) id config))


(defn cfn-service-egress-configuration-property-builder>
  "The cfn-service-egress-configuration-property-builder> function updates a CfnService$EgressConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$EgressConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:egress-type` |
| `vpcConnectorArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-connector-arn` |
"
  [^CfnService$EgressConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :egress-type)]
    (. builder egressType data))
  (when-some [data (lookup-entry config id :vpc-connector-arn)]
    (. builder vpcConnectorArn data))
  (.build builder))


(defn cfn-service-egress-configuration-property-builder
  "Creates a  `CfnService$EgressConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-egress-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-egress-configuration-property-builder> (new CfnService$EgressConfigurationProperty$Builder) id config))


(defn cfn-service-encryption-configuration-property-builder>
  "The cfn-service-encryption-configuration-property-builder> function updates a CfnService$EncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$EncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key` |
"
  [^CfnService$EncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (.build builder))


(defn cfn-service-encryption-configuration-property-builder
  "Creates a  `CfnService$EncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-encryption-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-encryption-configuration-property-builder> (new CfnService$EncryptionConfigurationProperty$Builder) id config))


(defn cfn-service-health-check-configuration-property-builder>
  "The cfn-service-health-check-configuration-property-builder> function updates a CfnService$HealthCheckConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$HealthCheckConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |
"
  [^CfnService$HealthCheckConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :healthy-threshold)]
    (. builder healthyThreshold data))
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-some [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-some [data (lookup-entry config id :unhealthy-threshold)]
    (. builder unhealthyThreshold data))
  (.build builder))


(defn cfn-service-health-check-configuration-property-builder
  "Creates a  `CfnService$HealthCheckConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-health-check-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-health-check-configuration-property-builder> (new CfnService$HealthCheckConfigurationProperty$Builder) id config))


(defn cfn-service-image-configuration-property-builder>
  "The cfn-service-image-configuration-property-builder> function updates a CfnService$ImageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$ImageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `runtimeEnvironmentSecrets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:runtime-environment-secrets` |
| `runtimeEnvironmentVariables` | java.util.List | [[cdk.support/lookup-entry]] | `:runtime-environment-variables` |
| `startCommand` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-command` |
"
  [^CfnService$ImageConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :runtime-environment-secrets)]
    (. builder runtimeEnvironmentSecrets data))
  (when-some [data (lookup-entry config id :runtime-environment-variables)]
    (. builder runtimeEnvironmentVariables data))
  (when-some [data (lookup-entry config id :start-command)]
    (. builder startCommand data))
  (.build builder))


(defn cfn-service-image-configuration-property-builder
  "Creates a  `CfnService$ImageConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-image-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-image-configuration-property-builder> (new CfnService$ImageConfigurationProperty$Builder) id config))


(defn cfn-service-image-repository-property-builder>
  "The cfn-service-image-repository-property-builder> function updates a CfnService$ImageRepositoryProperty$Builder instance using the provided configuration.
  The function takes the CfnService$ImageRepositoryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `imageConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$ImageConfigurationProperty | [[cdk.support/lookup-entry]] | `:image-configuration` |
| `imageIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-identifier` |
| `imageRepositoryType` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-repository-type` |
"
  [^CfnService$ImageRepositoryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :image-configuration)]
    (. builder imageConfiguration data))
  (when-some [data (lookup-entry config id :image-identifier)]
    (. builder imageIdentifier data))
  (when-some [data (lookup-entry config id :image-repository-type)]
    (. builder imageRepositoryType data))
  (.build builder))


(defn cfn-service-image-repository-property-builder
  "Creates a  `CfnService$ImageRepositoryProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-image-repository-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-image-repository-property-builder> (new CfnService$ImageRepositoryProperty$Builder) id config))


(defn cfn-service-ingress-configuration-property-builder>
  "The cfn-service-ingress-configuration-property-builder> function updates a CfnService$IngressConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$IngressConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isPubliclyAccessible` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-publicly-accessible` |
"
  [^CfnService$IngressConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :is-publicly-accessible)]
    (. builder isPubliclyAccessible data))
  (.build builder))


(defn cfn-service-ingress-configuration-property-builder
  "Creates a  `CfnService$IngressConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-ingress-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-ingress-configuration-property-builder> (new CfnService$IngressConfigurationProperty$Builder) id config))


(defn cfn-service-instance-configuration-property-builder>
  "The cfn-service-instance-configuration-property-builder> function updates a CfnService$InstanceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$InstanceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpu` | java.lang.String | [[cdk.support/lookup-entry]] | `:cpu` |
| `instanceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-role-arn` |
| `memory` | java.lang.String | [[cdk.support/lookup-entry]] | `:memory` |
"
  [^CfnService$InstanceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :instance-role-arn)]
    (. builder instanceRoleArn data))
  (when-some [data (lookup-entry config id :memory)]
    (. builder memory data))
  (.build builder))


(defn cfn-service-instance-configuration-property-builder
  "Creates a  `CfnService$InstanceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-instance-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-instance-configuration-property-builder> (new CfnService$InstanceConfigurationProperty$Builder) id config))


(defn cfn-service-key-value-pair-property-builder>
  "The cfn-service-key-value-pair-property-builder> function updates a CfnService$KeyValuePairProperty$Builder instance using the provided configuration.
  The function takes the CfnService$KeyValuePairProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnService$KeyValuePairProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-service-key-value-pair-property-builder
  "Creates a  `CfnService$KeyValuePairProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-key-value-pair-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-key-value-pair-property-builder> (new CfnService$KeyValuePairProperty$Builder) id config))


(defn cfn-service-network-configuration-property-builder>
  "The cfn-service-network-configuration-property-builder> function updates a CfnService$NetworkConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$NetworkConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `egressConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$EgressConfigurationProperty | [[cdk.support/lookup-entry]] | `:egress-configuration` |
| `ingressConfiguration` | software.amazon.awscdk.services.apprunner.CfnService$IngressConfigurationProperty | [[cdk.support/lookup-entry]] | `:ingress-configuration` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
"
  [^CfnService$NetworkConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :egress-configuration)]
    (. builder egressConfiguration data))
  (when-some [data (lookup-entry config id :ingress-configuration)]
    (. builder ingressConfiguration data))
  (when-some [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (.build builder))


(defn cfn-service-network-configuration-property-builder
  "Creates a  `CfnService$NetworkConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-network-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-network-configuration-property-builder> (new CfnService$NetworkConfigurationProperty$Builder) id config))


(defn cfn-service-props-builder>
  "The cfn-service-props-builder> function updates a CfnServiceProps$Builder instance using the provided configuration.
  The function takes the CfnServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-scaling-configuration-arn)]
    (. builder autoScalingConfigurationArn data))
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :health-check-configuration)]
    (. builder healthCheckConfiguration data))
  (when-some [data (lookup-entry config id :instance-configuration)]
    (. builder instanceConfiguration data))
  (when-some [data (lookup-entry config id :network-configuration)]
    (. builder networkConfiguration data))
  (when-some [data (lookup-entry config id :observability-configuration)]
    (. builder observabilityConfiguration data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :source-configuration)]
    (. builder sourceConfiguration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-service-props-builder
  "Creates a  `CfnServiceProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-props-builder> (new CfnServiceProps$Builder) id config))


(defn cfn-service-service-observability-configuration-property-builder>
  "The cfn-service-service-observability-configuration-property-builder> function updates a CfnService$ServiceObservabilityConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$ServiceObservabilityConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `observabilityConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:observability-configuration-arn` |
| `observabilityEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:observability-enabled` |
"
  [^CfnService$ServiceObservabilityConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :observability-configuration-arn)]
    (. builder observabilityConfigurationArn data))
  (when-some [data (lookup-entry config id :observability-enabled)]
    (. builder observabilityEnabled data))
  (.build builder))


(defn cfn-service-service-observability-configuration-property-builder
  "Creates a  `CfnService$ServiceObservabilityConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-service-observability-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-service-observability-configuration-property-builder> (new CfnService$ServiceObservabilityConfigurationProperty$Builder) id config))


(defn cfn-service-source-code-version-property-builder>
  "The cfn-service-source-code-version-property-builder> function updates a CfnService$SourceCodeVersionProperty$Builder instance using the provided configuration.
  The function takes the CfnService$SourceCodeVersionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnService$SourceCodeVersionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-service-source-code-version-property-builder
  "Creates a  `CfnService$SourceCodeVersionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-source-code-version-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-source-code-version-property-builder> (new CfnService$SourceCodeVersionProperty$Builder) id config))


(defn cfn-service-source-configuration-property-builder>
  "The cfn-service-source-configuration-property-builder> function updates a CfnService$SourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnService$SourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `authenticationConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:authentication-configuration` |
| `autoDeploymentsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-deployments-enabled` |
| `codeRepository` | software.amazon.awscdk.services.apprunner.CfnService$CodeRepositoryProperty | [[cdk.support/lookup-entry]] | `:code-repository` |
| `imageRepository` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:image-repository` |
"
  [^CfnService$SourceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :authentication-configuration)]
    (. builder authenticationConfiguration data))
  (when-some [data (lookup-entry config id :auto-deployments-enabled)]
    (. builder autoDeploymentsEnabled data))
  (when-some [data (lookup-entry config id :code-repository)]
    (. builder codeRepository data))
  (when-some [data (lookup-entry config id :image-repository)]
    (. builder imageRepository data))
  (.build builder))


(defn cfn-service-source-configuration-property-builder
  "Creates a  `CfnService$SourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-service-source-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-service-source-configuration-property-builder> (new CfnService$SourceConfigurationProperty$Builder) id config))


(defn cfn-vpc-connector-builder>
  "The cfn-vpc-connector-builder> function updates a CfnVpcConnector$Builder instance using the provided configuration.
  The function takes the CfnVpcConnector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConnectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-connector-name` |
"
  [^CfnVpcConnector$Builder builder id config]
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-connector-name)]
    (. builder vpcConnectorName data))
  (.build builder))


(defn cfn-vpc-connector-builder
  "Creates a  `CfnVpcConnector$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-vpc-connector-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-vpc-connector-builder> (CfnVpcConnector$Builder/create scope (name id)) id config))


(defn cfn-vpc-connector-props-builder>
  "The cfn-vpc-connector-props-builder> function updates a CfnVpcConnectorProps$Builder instance using the provided configuration.
  The function takes the CfnVpcConnectorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcConnectorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-connector-name` |
"
  [^CfnVpcConnectorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnets)]
    (. builder subnets data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-connector-name)]
    (. builder vpcConnectorName data))
  (.build builder))


(defn cfn-vpc-connector-props-builder
  "Creates a  `CfnVpcConnectorProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-vpc-connector-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-vpc-connector-props-builder> (new CfnVpcConnectorProps$Builder) id config))


(defn cfn-vpc-ingress-connection-builder>
  "The cfn-vpc-ingress-connection-builder> function updates a CfnVpcIngressConnection$Builder instance using the provided configuration.
  The function takes the CfnVpcIngressConnection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ingressVpcConfiguration` | software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection$IngressVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:ingress-vpc-configuration` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcIngressConnectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-ingress-connection-name` |
"
  [^CfnVpcIngressConnection$Builder builder id config]
  (when-some [data (lookup-entry config id :ingress-vpc-configuration)]
    (. builder ingressVpcConfiguration data))
  (when-some [data (lookup-entry config id :service-arn)]
    (. builder serviceArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-ingress-connection-name)]
    (. builder vpcIngressConnectionName data))
  (.build builder))


(defn cfn-vpc-ingress-connection-builder
  "Creates a  `CfnVpcIngressConnection$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-vpc-ingress-connection-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-vpc-ingress-connection-builder> (CfnVpcIngressConnection$Builder/create scope (name id)) id config))


(defn cfn-vpc-ingress-connection-ingress-vpc-configuration-property-builder>
  "The cfn-vpc-ingress-connection-ingress-vpc-configuration-property-builder> function updates a CfnVpcIngressConnection$IngressVpcConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnVpcIngressConnection$IngressVpcConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-endpoint-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnVpcIngressConnection$IngressVpcConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :vpc-endpoint-id)]
    (. builder vpcEndpointId data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-vpc-ingress-connection-ingress-vpc-configuration-property-builder
  "Creates a  `CfnVpcIngressConnection$IngressVpcConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-vpc-ingress-connection-ingress-vpc-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-vpc-ingress-connection-ingress-vpc-configuration-property-builder> (new CfnVpcIngressConnection$IngressVpcConfigurationProperty$Builder) id config))


(defn cfn-vpc-ingress-connection-props-builder>
  "The cfn-vpc-ingress-connection-props-builder> function updates a CfnVpcIngressConnectionProps$Builder instance using the provided configuration.
  The function takes the CfnVpcIngressConnectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ingressVpcConfiguration` | software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection$IngressVpcConfigurationProperty | [[cdk.support/lookup-entry]] | `:ingress-vpc-configuration` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcIngressConnectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-ingress-connection-name` |
"
  [^CfnVpcIngressConnectionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :ingress-vpc-configuration)]
    (. builder ingressVpcConfiguration data))
  (when-some [data (lookup-entry config id :service-arn)]
    (. builder serviceArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc-ingress-connection-name)]
    (. builder vpcIngressConnectionName data))
  (.build builder))


(defn cfn-vpc-ingress-connection-props-builder
  "Creates a  `CfnVpcIngressConnectionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-vpc-ingress-connection-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-vpc-ingress-connection-props-builder> (new CfnVpcIngressConnectionProps$Builder) id config))