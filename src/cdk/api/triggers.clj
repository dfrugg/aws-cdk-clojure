(ns cdk.api.triggers
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.triggers package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.lambda :refer [application-log-level
                                             logging-format
                                             system-log-level
                                             tracing]]
            [cdk.api.services.logs :refer [retention-days]])
  (:import [software.amazon.awscdk.triggers InvocationType
                                            Trigger$Builder
                                            TriggerFunction$Builder
                                            TriggerFunctionProps$Builder
                                            TriggerInvalidation
                                            TriggerOptions$Builder
                                            TriggerProps$Builder]))


(defn invocation-type
  "The `invocation-type` function data interprets values in the provided config data into a 
`InvocationType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `InvocationType` - the value is returned.
* is `:dry-run` - `InvocationType/DRY_RUN` is returned
* is `:event` - `InvocationType/EVENT` is returned
* is `:request-response` - `InvocationType/REQUEST_RESPONSE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? InvocationType data) data
      (= :dry-run data) InvocationType/DRY_RUN
      (= :event data) InvocationType/EVENT
      (= :request-response data) InvocationType/REQUEST_RESPONSE)))


(defn trigger-invalidation
  "The `trigger-invalidation` function data interprets values in the provided config data into a 
`TriggerInvalidation` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TriggerInvalidation` - the value is returned.
* is `:handler-change` - `TriggerInvalidation/HANDLER_CHANGE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TriggerInvalidation data) data
      (= :handler-change data) TriggerInvalidation/HANDLER_CHANGE)))


(defn trigger-builder
  "The trigger-builder function buildes out new instances of 
Trigger$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executeAfter` | java.util.List | [[cdk.support/lookup-entry]] | `:execute-after` |
| `executeBefore` | java.util.List | [[cdk.support/lookup-entry]] | `:execute-before` |
| `executeOnHandlerChange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:execute-on-handler-change` |
| `handler` | software.amazon.awscdk.services.lambda.Function | [[cdk.support/lookup-entry]] | `:handler` |
| `invocationType` | software.amazon.awscdk.triggers.InvocationType | [[cdk.api.triggers/invocation-type]] | `:invocation-type` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (Trigger$Builder/create stack id)]
    (when-let [data (lookup-entry config id :execute-after)]
      (. builder executeAfter data))
    (when-let [data (lookup-entry config id :execute-before)]
      (. builder executeBefore data))
    (when-let [data (lookup-entry config id :execute-on-handler-change)]
      (. builder executeOnHandlerChange data))
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (invocation-type config id :invocation-type)]
      (. builder invocationType data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn trigger-function-builder
  "The trigger-function-builder function buildes out new instances of 
TriggerFunction$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adotInstrumentation` | software.amazon.awscdk.services.lambda.AdotInstrumentationConfig | [[cdk.support/lookup-entry]] | `:adot-instrumentation` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `allowPublicSubnet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-subnet` |
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `applicationLogLevelV2` | software.amazon.awscdk.services.lambda.ApplicationLogLevel | [[cdk.api.services.lambda/application-log-level]] | `:application-log-level-v2` |
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfig` | software.amazon.awscdk.services.lambda.ICodeSigningConfig | [[cdk.support/lookup-entry]] | `:code-signing-config` |
| `currentVersionOptions` | software.amazon.awscdk.services.lambda.VersionOptions | [[cdk.support/lookup-entry]] | `:current-version-options` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deadLetterQueueEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dead-letter-queue-enabled` |
| `deadLetterTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:dead-letter-topic` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:environment-encryption` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `executeAfter` | java.util.List | [[cdk.support/lookup-entry]] | `:execute-after` |
| `executeBefore` | java.util.List | [[cdk.support/lookup-entry]] | `:execute-before` |
| `executeOnHandlerChange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:execute-on-handler-change` |
| `filesystem` | software.amazon.awscdk.services.lambda.FileSystem | [[cdk.support/lookup-entry]] | `:filesystem` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
| `initialPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:initial-policy` |
| `insightsVersion` | software.amazon.awscdk.services.lambda.LambdaInsightsVersion | [[cdk.support/lookup-entry]] | `:insights-version` |
| `ipv6AllowedForDualStack` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-allowed-for-dual-stack` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.lambda.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `logRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:log-retention-role` |
| `loggingFormat` | software.amazon.awscdk.services.lambda.LoggingFormat | [[cdk.api.services.lambda/logging-format]] | `:logging-format` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `paramsAndSecrets` | software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion | [[cdk.support/lookup-entry]] | `:params-and-secrets` |
| `profiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:profiling` |
| `profilingGroup` | software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup | [[cdk.support/lookup-entry]] | `:profiling-group` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | software.amazon.awscdk.services.lambda.Runtime | [[cdk.support/lookup-entry]] | `:runtime` |
| `runtimeManagementMode` | software.amazon.awscdk.services.lambda.RuntimeManagementMode | [[cdk.support/lookup-entry]] | `:runtime-management-mode` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapStart` | software.amazon.awscdk.services.lambda.SnapStartConf | [[cdk.support/lookup-entry]] | `:snap-start` |
| `systemLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-log-level` |
| `systemLogLevelV2` | software.amazon.awscdk.services.lambda.SystemLogLevel | [[cdk.api.services.lambda/system-log-level]] | `:system-log-level-v2` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracing` | software.amazon.awscdk.services.lambda.Tracing | [[cdk.api.services.lambda/tracing]] | `:tracing` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (TriggerFunction$Builder/create stack id)]
    (when-let [data (lookup-entry config id :adot-instrumentation)]
      (. builder adotInstrumentation data))
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :allow-public-subnet)]
      (. builder allowPublicSubnet data))
    (when-let [data (lookup-entry config id :application-log-level)]
      (. builder applicationLogLevel data))
    (when-let [data (application-log-level config id :application-log-level-v2)]
      (. builder applicationLogLevelV2 data))
    (when-let [data (lookup-entry config id :architecture)]
      (. builder architecture data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :code-signing-config)]
      (. builder codeSigningConfig data))
    (when-let [data (lookup-entry config id :current-version-options)]
      (. builder currentVersionOptions data))
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :dead-letter-queue-enabled)]
      (. builder deadLetterQueueEnabled data))
    (when-let [data (lookup-entry config id :dead-letter-topic)]
      (. builder deadLetterTopic data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-encryption)]
      (. builder environmentEncryption data))
    (when-let [data (lookup-entry config id :ephemeral-storage-size)]
      (. builder ephemeralStorageSize data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :execute-after)]
      (. builder executeAfter data))
    (when-let [data (lookup-entry config id :execute-before)]
      (. builder executeBefore data))
    (when-let [data (lookup-entry config id :execute-on-handler-change)]
      (. builder executeOnHandlerChange data))
    (when-let [data (lookup-entry config id :filesystem)]
      (. builder filesystem data))
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (lookup-entry config id :initial-policy)]
      (. builder initialPolicy data))
    (when-let [data (lookup-entry config id :insights-version)]
      (. builder insightsVersion data))
    (when-let [data (lookup-entry config id :ipv6-allowed-for-dual-stack)]
      (. builder ipv6AllowedForDualStack data))
    (when-let [data (lookup-entry config id :layers)]
      (. builder layers data))
    (when-let [data (lookup-entry config id :log-format)]
      (. builder logFormat data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (retention-days config id :log-retention)]
      (. builder logRetention data))
    (when-let [data (lookup-entry config id :log-retention-retry-options)]
      (. builder logRetentionRetryOptions data))
    (when-let [data (lookup-entry config id :log-retention-role)]
      (. builder logRetentionRole data))
    (when-let [data (logging-format config id :logging-format)]
      (. builder loggingFormat data))
    (when-let [data (lookup-entry config id :max-event-age)]
      (. builder maxEventAge data))
    (when-let [data (lookup-entry config id :memory-size)]
      (. builder memorySize data))
    (when-let [data (lookup-entry config id :on-failure)]
      (. builder onFailure data))
    (when-let [data (lookup-entry config id :on-success)]
      (. builder onSuccess data))
    (when-let [data (lookup-entry config id :params-and-secrets)]
      (. builder paramsAndSecrets data))
    (when-let [data (lookup-entry config id :profiling)]
      (. builder profiling data))
    (when-let [data (lookup-entry config id :profiling-group)]
      (. builder profilingGroup data))
    (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
      (. builder reservedConcurrentExecutions data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :runtime-management-mode)]
      (. builder runtimeManagementMode data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :snap-start)]
      (. builder snapStart data))
    (when-let [data (lookup-entry config id :system-log-level)]
      (. builder systemLogLevel data))
    (when-let [data (system-log-level config id :system-log-level-v2)]
      (. builder systemLogLevelV2 data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (tracing config id :tracing)]
      (. builder tracing data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn trigger-function-props-builder
  "The trigger-function-props-builder function buildes out new instances of 
TriggerFunctionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adotInstrumentation` | software.amazon.awscdk.services.lambda.AdotInstrumentationConfig | [[cdk.support/lookup-entry]] | `:adot-instrumentation` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `allowPublicSubnet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-subnet` |
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `applicationLogLevelV2` | software.amazon.awscdk.services.lambda.ApplicationLogLevel | [[cdk.api.services.lambda/application-log-level]] | `:application-log-level-v2` |
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfig` | software.amazon.awscdk.services.lambda.ICodeSigningConfig | [[cdk.support/lookup-entry]] | `:code-signing-config` |
| `currentVersionOptions` | software.amazon.awscdk.services.lambda.VersionOptions | [[cdk.support/lookup-entry]] | `:current-version-options` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deadLetterQueueEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dead-letter-queue-enabled` |
| `deadLetterTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:dead-letter-topic` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:environment-encryption` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
| `executeAfter` | java.util.List | [[cdk.support/lookup-entry]] | `:execute-after` |
| `executeBefore` | java.util.List | [[cdk.support/lookup-entry]] | `:execute-before` |
| `executeOnHandlerChange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:execute-on-handler-change` |
| `filesystem` | software.amazon.awscdk.services.lambda.FileSystem | [[cdk.support/lookup-entry]] | `:filesystem` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `handler` | java.lang.String | [[cdk.support/lookup-entry]] | `:handler` |
| `initialPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:initial-policy` |
| `insightsVersion` | software.amazon.awscdk.services.lambda.LambdaInsightsVersion | [[cdk.support/lookup-entry]] | `:insights-version` |
| `ipv6AllowedForDualStack` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ipv6-allowed-for-dual-stack` |
| `layers` | java.util.List | [[cdk.support/lookup-entry]] | `:layers` |
| `logFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-format` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `logRetentionRetryOptions` | software.amazon.awscdk.services.lambda.LogRetentionRetryOptions | [[cdk.support/lookup-entry]] | `:log-retention-retry-options` |
| `logRetentionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:log-retention-role` |
| `loggingFormat` | software.amazon.awscdk.services.lambda.LoggingFormat | [[cdk.api.services.lambda/logging-format]] | `:logging-format` |
| `maxEventAge` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-event-age` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `onFailure` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-failure` |
| `onSuccess` | software.amazon.awscdk.services.lambda.IDestination | [[cdk.support/lookup-entry]] | `:on-success` |
| `paramsAndSecrets` | software.amazon.awscdk.services.lambda.ParamsAndSecretsLayerVersion | [[cdk.support/lookup-entry]] | `:params-and-secrets` |
| `profiling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:profiling` |
| `profilingGroup` | software.amazon.awscdk.services.codeguruprofiler.IProfilingGroup | [[cdk.support/lookup-entry]] | `:profiling-group` |
| `reservedConcurrentExecutions` | java.lang.Number | [[cdk.support/lookup-entry]] | `:reserved-concurrent-executions` |
| `retryAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-attempts` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `runtime` | software.amazon.awscdk.services.lambda.Runtime | [[cdk.support/lookup-entry]] | `:runtime` |
| `runtimeManagementMode` | software.amazon.awscdk.services.lambda.RuntimeManagementMode | [[cdk.support/lookup-entry]] | `:runtime-management-mode` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `snapStart` | software.amazon.awscdk.services.lambda.SnapStartConf | [[cdk.support/lookup-entry]] | `:snap-start` |
| `systemLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:system-log-level` |
| `systemLogLevelV2` | software.amazon.awscdk.services.lambda.SystemLogLevel | [[cdk.api.services.lambda/system-log-level]] | `:system-log-level-v2` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `tracing` | software.amazon.awscdk.services.lambda.Tracing | [[cdk.api.services.lambda/tracing]] | `:tracing` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (TriggerFunctionProps$Builder.)]
    (when-let [data (lookup-entry config id :adot-instrumentation)]
      (. builder adotInstrumentation data))
    (when-let [data (lookup-entry config id :allow-all-outbound)]
      (. builder allowAllOutbound data))
    (when-let [data (lookup-entry config id :allow-public-subnet)]
      (. builder allowPublicSubnet data))
    (when-let [data (lookup-entry config id :application-log-level)]
      (. builder applicationLogLevel data))
    (when-let [data (application-log-level config id :application-log-level-v2)]
      (. builder applicationLogLevelV2 data))
    (when-let [data (lookup-entry config id :architecture)]
      (. builder architecture data))
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :code-signing-config)]
      (. builder codeSigningConfig data))
    (when-let [data (lookup-entry config id :current-version-options)]
      (. builder currentVersionOptions data))
    (when-let [data (lookup-entry config id :dead-letter-queue)]
      (. builder deadLetterQueue data))
    (when-let [data (lookup-entry config id :dead-letter-queue-enabled)]
      (. builder deadLetterQueueEnabled data))
    (when-let [data (lookup-entry config id :dead-letter-topic)]
      (. builder deadLetterTopic data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :environment-encryption)]
      (. builder environmentEncryption data))
    (when-let [data (lookup-entry config id :ephemeral-storage-size)]
      (. builder ephemeralStorageSize data))
    (when-let [data (lookup-entry config id :events)]
      (. builder events data))
    (when-let [data (lookup-entry config id :execute-after)]
      (. builder executeAfter data))
    (when-let [data (lookup-entry config id :execute-before)]
      (. builder executeBefore data))
    (when-let [data (lookup-entry config id :execute-on-handler-change)]
      (. builder executeOnHandlerChange data))
    (when-let [data (lookup-entry config id :filesystem)]
      (. builder filesystem data))
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (lookup-entry config id :initial-policy)]
      (. builder initialPolicy data))
    (when-let [data (lookup-entry config id :insights-version)]
      (. builder insightsVersion data))
    (when-let [data (lookup-entry config id :ipv6-allowed-for-dual-stack)]
      (. builder ipv6AllowedForDualStack data))
    (when-let [data (lookup-entry config id :layers)]
      (. builder layers data))
    (when-let [data (lookup-entry config id :log-format)]
      (. builder logFormat data))
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (retention-days config id :log-retention)]
      (. builder logRetention data))
    (when-let [data (lookup-entry config id :log-retention-retry-options)]
      (. builder logRetentionRetryOptions data))
    (when-let [data (lookup-entry config id :log-retention-role)]
      (. builder logRetentionRole data))
    (when-let [data (logging-format config id :logging-format)]
      (. builder loggingFormat data))
    (when-let [data (lookup-entry config id :max-event-age)]
      (. builder maxEventAge data))
    (when-let [data (lookup-entry config id :memory-size)]
      (. builder memorySize data))
    (when-let [data (lookup-entry config id :on-failure)]
      (. builder onFailure data))
    (when-let [data (lookup-entry config id :on-success)]
      (. builder onSuccess data))
    (when-let [data (lookup-entry config id :params-and-secrets)]
      (. builder paramsAndSecrets data))
    (when-let [data (lookup-entry config id :profiling)]
      (. builder profiling data))
    (when-let [data (lookup-entry config id :profiling-group)]
      (. builder profilingGroup data))
    (when-let [data (lookup-entry config id :reserved-concurrent-executions)]
      (. builder reservedConcurrentExecutions data))
    (when-let [data (lookup-entry config id :retry-attempts)]
      (. builder retryAttempts data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :runtime-management-mode)]
      (. builder runtimeManagementMode data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :snap-start)]
      (. builder snapStart data))
    (when-let [data (lookup-entry config id :system-log-level)]
      (. builder systemLogLevel data))
    (when-let [data (system-log-level config id :system-log-level-v2)]
      (. builder systemLogLevelV2 data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (tracing config id :tracing)]
      (. builder tracing data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn trigger-options-builder
  "The trigger-options-builder function buildes out new instances of 
TriggerOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executeAfter` | java.util.List | [[cdk.support/lookup-entry]] | `:execute-after` |
| `executeBefore` | java.util.List | [[cdk.support/lookup-entry]] | `:execute-before` |
| `executeOnHandlerChange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:execute-on-handler-change` |"
  [stack id config]
  (let [builder (TriggerOptions$Builder.)]
    (when-let [data (lookup-entry config id :execute-after)]
      (. builder executeAfter data))
    (when-let [data (lookup-entry config id :execute-before)]
      (. builder executeBefore data))
    (when-let [data (lookup-entry config id :execute-on-handler-change)]
      (. builder executeOnHandlerChange data))
    (.build builder)))


(defn trigger-props-builder
  "The trigger-props-builder function buildes out new instances of 
TriggerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executeAfter` | java.util.List | [[cdk.support/lookup-entry]] | `:execute-after` |
| `executeBefore` | java.util.List | [[cdk.support/lookup-entry]] | `:execute-before` |
| `executeOnHandlerChange` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:execute-on-handler-change` |
| `handler` | software.amazon.awscdk.services.lambda.Function | [[cdk.support/lookup-entry]] | `:handler` |
| `invocationType` | software.amazon.awscdk.triggers.InvocationType | [[cdk.api.triggers/invocation-type]] | `:invocation-type` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (TriggerProps$Builder.)]
    (when-let [data (lookup-entry config id :execute-after)]
      (. builder executeAfter data))
    (when-let [data (lookup-entry config id :execute-before)]
      (. builder executeBefore data))
    (when-let [data (lookup-entry config id :execute-on-handler-change)]
      (. builder executeOnHandlerChange data))
    (when-let [data (lookup-entry config id :handler)]
      (. builder handler data))
    (when-let [data (invocation-type config id :invocation-type)]
      (. builder invocationType data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))