(ns cdk.api.customresources
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.customresources package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.api.services.logs :refer [retention-days]]
            [cdk.api.services.stepfunctions :refer [log-level]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.customresources AwsCustomResource$Builder
                                                   AwsCustomResourceProps$Builder
                                                   AwsSdkCall$Builder
                                                   LogOptions$Builder
                                                   LoggingProps$Builder
                                                   Provider$Builder
                                                   ProviderProps$Builder
                                                   SdkCallsPolicyOptions$Builder
                                                   WaiterStateMachine$Builder
                                                   WaiterStateMachineProps$Builder]))


(defn build-aws-custom-resource-builder
  "The build-aws-custom-resource-builder function updates a AwsCustomResource$Builder instance using the provided configuration.
  The function takes the AwsCustomResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `installLatestAwsSdk` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:install-latest-aws-sdk` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `onCreate` | software.amazon.awscdk.customresources.AwsSdkCall | [[cdk.support/lookup-entry]] | `:on-create` |
| `onDelete` | software.amazon.awscdk.customresources.AwsSdkCall | [[cdk.support/lookup-entry]] | `:on-delete` |
| `onUpdate` | software.amazon.awscdk.customresources.AwsSdkCall | [[cdk.support/lookup-entry]] | `:on-update` |
| `policy` | software.amazon.awscdk.customresources.AwsCustomResourcePolicy | [[cdk.support/lookup-entry]] | `:policy` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^AwsCustomResource$Builder builder id config]
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :install-latest-aws-sdk)]
    (. builder installLatestAwsSdk data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :on-create)]
    (. builder onCreate data))
  (when-let [data (lookup-entry config id :on-delete)]
    (. builder onDelete data))
  (when-let [data (lookup-entry config id :on-update)]
    (. builder onUpdate data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn build-aws-custom-resource-props-builder
  "The build-aws-custom-resource-props-builder function updates a AwsCustomResourceProps$Builder instance using the provided configuration.
  The function takes the AwsCustomResourceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `installLatestAwsSdk` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:install-latest-aws-sdk` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `memorySize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-size` |
| `onCreate` | software.amazon.awscdk.customresources.AwsSdkCall | [[cdk.support/lookup-entry]] | `:on-create` |
| `onDelete` | software.amazon.awscdk.customresources.AwsSdkCall | [[cdk.support/lookup-entry]] | `:on-delete` |
| `onUpdate` | software.amazon.awscdk.customresources.AwsSdkCall | [[cdk.support/lookup-entry]] | `:on-update` |
| `policy` | software.amazon.awscdk.customresources.AwsCustomResourcePolicy | [[cdk.support/lookup-entry]] | `:policy` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^AwsCustomResourceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-let [data (lookup-entry config id :install-latest-aws-sdk)]
    (. builder installLatestAwsSdk data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :memory-size)]
    (. builder memorySize data))
  (when-let [data (lookup-entry config id :on-create)]
    (. builder onCreate data))
  (when-let [data (lookup-entry config id :on-delete)]
    (. builder onDelete data))
  (when-let [data (lookup-entry config id :on-update)]
    (. builder onUpdate data))
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :timeout)]
    (. builder timeout data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn build-aws-sdk-call-builder
  "The build-aws-sdk-call-builder function updates a AwsSdkCall$Builder instance using the provided configuration.
  The function takes the AwsSdkCall$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `apiVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-version` |
| `assumedRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assumed-role-arn` |
| `ignoreErrorCodesMatching` | java.lang.String | [[cdk.support/lookup-entry]] | `:ignore-error-codes-matching` |
| `logging` | software.amazon.awscdk.customresources.Logging | [[cdk.support/lookup-entry]] | `:logging` |
| `outputPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:output-paths` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `physicalResourceId` | software.amazon.awscdk.customresources.PhysicalResourceId | [[cdk.support/lookup-entry]] | `:physical-resource-id` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `service` | java.lang.String | [[cdk.support/lookup-entry]] | `:service` |
"
  [^AwsSdkCall$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :api-version)]
    (. builder apiVersion data))
  (when-let [data (lookup-entry config id :assumed-role-arn)]
    (. builder assumedRoleArn data))
  (when-let [data (lookup-entry config id :ignore-error-codes-matching)]
    (. builder ignoreErrorCodesMatching data))
  (when-let [data (lookup-entry config id :logging)]
    (. builder logging data))
  (when-let [data (lookup-entry config id :output-paths)]
    (. builder outputPaths data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :physical-resource-id)]
    (. builder physicalResourceId data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn build-log-options-builder
  "The build-log-options-builder function updates a LogOptions$Builder instance using the provided configuration.
  The function takes the LogOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:destination` |
| `includeExecutionData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-execution-data` |
| `level` | software.amazon.awscdk.services.stepfunctions.LogLevel | [[cdk.api.services.stepfunctions/log-level]] | `:level` |
"
  [^LogOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :include-execution-data)]
    (. builder includeExecutionData data))
  (when-let [data (log-level config id :level)]
    (. builder level data))
  (.build builder))


(defn build-logging-props-builder
  "The build-logging-props-builder function updates a LoggingProps$Builder instance using the provided configuration.
  The function takes the LoggingProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logApiResponseData` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:log-api-response-data` |
"
  [^LoggingProps$Builder builder id config]
  (when-let [data (lookup-entry config id :log-api-response-data)]
    (. builder logApiResponseData data))
  (.build builder))


(defn build-provider-builder
  "The build-provider-builder function updates a Provider$Builder instance using the provided configuration.
  The function takes the Provider$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableWaiterStateMachineLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-waiter-state-machine-logging` |
| `isCompleteHandler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:is-complete-handler` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `onEventHandler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:on-event-handler` |
| `providerFunctionEnvEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:provider-function-env-encryption` |
| `providerFunctionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-function-name` |
| `queryInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:query-interval` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `totalTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:total-timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `waiterStateMachineLogOptions` | software.amazon.awscdk.customresources.LogOptions | [[cdk.support/lookup-entry]] | `:waiter-state-machine-log-options` |
"
  [^Provider$Builder builder id config]
  (when-let [data (lookup-entry config id :disable-waiter-state-machine-logging)]
    (. builder disableWaiterStateMachineLogging data))
  (when-let [data (lookup-entry config id :is-complete-handler)]
    (. builder isCompleteHandler data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :on-event-handler)]
    (. builder onEventHandler data))
  (when-let [data (lookup-entry config id :provider-function-env-encryption)]
    (. builder providerFunctionEnvEncryption data))
  (when-let [data (lookup-entry config id :provider-function-name)]
    (. builder providerFunctionName data))
  (when-let [data (lookup-entry config id :query-interval)]
    (. builder queryInterval data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :total-timeout)]
    (. builder totalTimeout data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (when-let [data (lookup-entry config id :waiter-state-machine-log-options)]
    (. builder waiterStateMachineLogOptions data))
  (.build builder))


(defn build-provider-props-builder
  "The build-provider-props-builder function updates a ProviderProps$Builder instance using the provided configuration.
  The function takes the ProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `disableWaiterStateMachineLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-waiter-state-machine-logging` |
| `isCompleteHandler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:is-complete-handler` |
| `logGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:log-group` |
| `logRetention` | software.amazon.awscdk.services.logs.RetentionDays | [[cdk.api.services.logs/retention-days]] | `:log-retention` |
| `onEventHandler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:on-event-handler` |
| `providerFunctionEnvEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:provider-function-env-encryption` |
| `providerFunctionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:provider-function-name` |
| `queryInterval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:query-interval` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `totalTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:total-timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `waiterStateMachineLogOptions` | software.amazon.awscdk.customresources.LogOptions | [[cdk.support/lookup-entry]] | `:waiter-state-machine-log-options` |
"
  [^ProviderProps$Builder builder id config]
  (when-let [data (lookup-entry config id :disable-waiter-state-machine-logging)]
    (. builder disableWaiterStateMachineLogging data))
  (when-let [data (lookup-entry config id :is-complete-handler)]
    (. builder isCompleteHandler data))
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (retention-days config id :log-retention)]
    (. builder logRetention data))
  (when-let [data (lookup-entry config id :on-event-handler)]
    (. builder onEventHandler data))
  (when-let [data (lookup-entry config id :provider-function-env-encryption)]
    (. builder providerFunctionEnvEncryption data))
  (when-let [data (lookup-entry config id :provider-function-name)]
    (. builder providerFunctionName data))
  (when-let [data (lookup-entry config id :query-interval)]
    (. builder queryInterval data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-let [data (lookup-entry config id :total-timeout)]
    (. builder totalTimeout data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (when-let [data (lookup-entry config id :waiter-state-machine-log-options)]
    (. builder waiterStateMachineLogOptions data))
  (.build builder))


(defn build-sdk-calls-policy-options-builder
  "The build-sdk-calls-policy-options-builder function updates a SdkCallsPolicyOptions$Builder instance using the provided configuration.
  The function takes the SdkCallsPolicyOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
"
  [^SdkCallsPolicyOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :resources)]
    (. builder resources data))
  (.build builder))


(defn build-waiter-state-machine-builder
  "The build-waiter-state-machine-builder function updates a WaiterStateMachine$Builder instance using the provided configuration.
  The function takes the WaiterStateMachine$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backoffRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backoff-rate` |
| `disableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-logging` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `isCompleteHandler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:is-complete-handler` |
| `logOptions` | software.amazon.awscdk.customresources.LogOptions | [[cdk.support/lookup-entry]] | `:log-options` |
| `maxAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-attempts` |
| `timeoutHandler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:timeout-handler` |
"
  [^WaiterStateMachine$Builder builder id config]
  (when-let [data (lookup-entry config id :backoff-rate)]
    (. builder backoffRate data))
  (when-let [data (lookup-entry config id :disable-logging)]
    (. builder disableLogging data))
  (when-let [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-let [data (lookup-entry config id :is-complete-handler)]
    (. builder isCompleteHandler data))
  (when-let [data (lookup-entry config id :log-options)]
    (. builder logOptions data))
  (when-let [data (lookup-entry config id :max-attempts)]
    (. builder maxAttempts data))
  (when-let [data (lookup-entry config id :timeout-handler)]
    (. builder timeoutHandler data))
  (.build builder))


(defn build-waiter-state-machine-props-builder
  "The build-waiter-state-machine-props-builder function updates a WaiterStateMachineProps$Builder instance using the provided configuration.
  The function takes the WaiterStateMachineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backoffRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:backoff-rate` |
| `disableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-logging` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `isCompleteHandler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:is-complete-handler` |
| `logOptions` | software.amazon.awscdk.customresources.LogOptions | [[cdk.support/lookup-entry]] | `:log-options` |
| `maxAttempts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-attempts` |
| `timeoutHandler` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:timeout-handler` |
"
  [^WaiterStateMachineProps$Builder builder id config]
  (when-let [data (lookup-entry config id :backoff-rate)]
    (. builder backoffRate data))
  (when-let [data (lookup-entry config id :disable-logging)]
    (. builder disableLogging data))
  (when-let [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-let [data (lookup-entry config id :is-complete-handler)]
    (. builder isCompleteHandler data))
  (when-let [data (lookup-entry config id :log-options)]
    (. builder logOptions data))
  (when-let [data (lookup-entry config id :max-attempts)]
    (. builder maxAttempts data))
  (when-let [data (lookup-entry config id :timeout-handler)]
    (. builder timeoutHandler data))
  (.build builder))