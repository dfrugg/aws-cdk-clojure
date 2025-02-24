(ns cdk.api.services.lambda.nodejs
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lambda.nodejs package. "
  (:require [cdk.api :refer [bundling-file-access]]
            [cdk.api.services.lambda :refer [application-log-level
                                             logging-format
                                             system-log-level
                                             tracing]]
            [cdk.api.services.logs :refer [retention-days]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lambda.nodejs BundlingOptions$Builder
                                                          Charset
                                                          LogLevel
                                                          NodejsFunction$Builder
                                                          NodejsFunctionProps$Builder
                                                          OutputFormat
                                                          SourceMapMode]))


(defn charset
  "The `charset` function data interprets values in the provided config data into a 
`Charset` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Charset` - the value is returned.
* is `:ascii` - `Charset/ASCII` is returned
* is `:utf8` - `Charset/UTF8` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Charset data) data
      (= :ascii data) Charset/ASCII
      (= :utf8 data) Charset/UTF8)))


(defn log-level
  "The `log-level` function data interprets values in the provided config data into a 
`LogLevel` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LogLevel` - the value is returned.
* is `:info` - `LogLevel/INFO` is returned
* is `:warning` - `LogLevel/WARNING` is returned
* is `:error` - `LogLevel/ERROR` is returned
* is `:verbose` - `LogLevel/VERBOSE` is returned
* is `:silent` - `LogLevel/SILENT` is returned
* is `:debug` - `LogLevel/DEBUG` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LogLevel data) data
      (= :info data) LogLevel/INFO
      (= :warning data) LogLevel/WARNING
      (= :error data) LogLevel/ERROR
      (= :verbose data) LogLevel/VERBOSE
      (= :silent data) LogLevel/SILENT
      (= :debug data) LogLevel/DEBUG)))


(defn output-format
  "The `output-format` function data interprets values in the provided config data into a 
`OutputFormat` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `OutputFormat` - the value is returned.
* is `:esm` - `OutputFormat/ESM` is returned
* is `:cjs` - `OutputFormat/CJS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? OutputFormat data) data
      (= :esm data) OutputFormat/ESM
      (= :cjs data) OutputFormat/CJS)))


(defn source-map-mode
  "The `source-map-mode` function data interprets values in the provided config data into a 
`SourceMapMode` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `SourceMapMode` - the value is returned.
* is `:external` - `SourceMapMode/EXTERNAL` is returned
* is `:default` - `SourceMapMode/DEFAULT` is returned
* is `:inline` - `SourceMapMode/INLINE` is returned
* is `:both` - `SourceMapMode/BOTH` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? SourceMapMode data) data
      (= :external data) SourceMapMode/EXTERNAL
      (= :default data) SourceMapMode/DEFAULT
      (= :inline data) SourceMapMode/INLINE
      (= :both data) SourceMapMode/BOTH)))


(defn build-bundling-options-builder
  "The build-bundling-options-builder function updates a BundlingOptions$Builder instance using the provided configuration.
  The function takes the BundlingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-hash` |
| `banner` | java.lang.String | [[cdk.support/lookup-entry]] | `:banner` |
| `buildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:build-args` |
| `bundleAwsSdk` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:bundle-aws-sdk` |
| `bundlingFileAccess` | software.amazon.awscdk.BundlingFileAccess | [[cdk.api/bundling-file-access]] | `:bundling-file-access` |
| `charset` | software.amazon.awscdk.services.lambda.nodejs.Charset | [[cdk.api.services.lambda.nodejs/charset]] | `:charset` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `commandHooks` | software.amazon.awscdk.services.lambda.nodejs.ICommandHooks | [[cdk.support/lookup-entry]] | `:command-hooks` |
| `define` | java.util.Map | [[cdk.support/lookup-entry]] | `:define` |
| `dockerImage` | software.amazon.awscdk.DockerImage | [[cdk.support/lookup-entry]] | `:docker-image` |
| `entrypoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entrypoint` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `esbuildArgs` | java.util.Map | [[cdk.support/lookup-entry]] | `:esbuild-args` |
| `esbuildVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:esbuild-version` |
| `externalModules` | java.util.List | [[cdk.support/lookup-entry]] | `:external-modules` |
| `footer` | java.lang.String | [[cdk.support/lookup-entry]] | `:footer` |
| `forceDockerBundling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-docker-bundling` |
| `format` | software.amazon.awscdk.services.lambda.nodejs.OutputFormat | [[cdk.api.services.lambda.nodejs/output-format]] | `:format` |
| `inject` | java.util.List | [[cdk.support/lookup-entry]] | `:inject` |
| `keepNames` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:keep-names` |
| `loader` | java.util.Map | [[cdk.support/lookup-entry]] | `:loader` |
| `logLevel` | software.amazon.awscdk.services.lambda.nodejs.LogLevel | [[cdk.api.services.lambda.nodejs/log-level]] | `:log-level` |
| `mainFields` | java.util.List | [[cdk.support/lookup-entry]] | `:main-fields` |
| `metafile` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:metafile` |
| `minify` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:minify` |
| `network` | java.lang.String | [[cdk.support/lookup-entry]] | `:network` |
| `nodeModules` | java.util.List | [[cdk.support/lookup-entry]] | `:node-modules` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `preCompilation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:pre-compilation` |
| `securityOpt` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-opt` |
| `sourceMap` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:source-map` |
| `sourceMapMode` | software.amazon.awscdk.services.lambda.nodejs.SourceMapMode | [[cdk.api.services.lambda.nodejs/source-map-mode]] | `:source-map-mode` |
| `sourcesContent` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sources-content` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `tsconfig` | java.lang.String | [[cdk.support/lookup-entry]] | `:tsconfig` |
| `user` | java.lang.String | [[cdk.support/lookup-entry]] | `:user` |
| `volumes` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes` |
| `volumesFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:volumes-from` |
| `workingDirectory` | java.lang.String | [[cdk.support/lookup-entry]] | `:working-directory` |
"
  [^BundlingOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :asset-hash)]
    (. builder assetHash data))
  (when-let [data (lookup-entry config id :banner)]
    (. builder banner data))
  (when-let [data (lookup-entry config id :build-args)]
    (. builder buildArgs data))
  (when-let [data (lookup-entry config id :bundle-aws-sdk)]
    (. builder bundleAwsSdk data))
  (when-let [data (bundling-file-access config id :bundling-file-access)]
    (. builder bundlingFileAccess data))
  (when-let [data (charset config id :charset)]
    (. builder charset data))
  (when-let [data (lookup-entry config id :command)]
    (. builder command data))
  (when-let [data (lookup-entry config id :command-hooks)]
    (. builder commandHooks data))
  (when-let [data (lookup-entry config id :define)]
    (. builder define data))
  (when-let [data (lookup-entry config id :docker-image)]
    (. builder dockerImage data))
  (when-let [data (lookup-entry config id :entrypoint)]
    (. builder entrypoint data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :esbuild-args)]
    (. builder esbuildArgs data))
  (when-let [data (lookup-entry config id :esbuild-version)]
    (. builder esbuildVersion data))
  (when-let [data (lookup-entry config id :external-modules)]
    (. builder externalModules data))
  (when-let [data (lookup-entry config id :footer)]
    (. builder footer data))
  (when-let [data (lookup-entry config id :force-docker-bundling)]
    (. builder forceDockerBundling data))
  (when-let [data (output-format config id :format)]
    (. builder format data))
  (when-let [data (lookup-entry config id :inject)]
    (. builder inject data))
  (when-let [data (lookup-entry config id :keep-names)]
    (. builder keepNames data))
  (when-let [data (lookup-entry config id :loader)]
    (. builder loader data))
  (when-let [data (log-level config id :log-level)]
    (. builder logLevel data))
  (when-let [data (lookup-entry config id :main-fields)]
    (. builder mainFields data))
  (when-let [data (lookup-entry config id :metafile)]
    (. builder metafile data))
  (when-let [data (lookup-entry config id :minify)]
    (. builder minify data))
  (when-let [data (lookup-entry config id :network)]
    (. builder network data))
  (when-let [data (lookup-entry config id :node-modules)]
    (. builder nodeModules data))
  (when-let [data (lookup-entry config id :platform)]
    (. builder platform data))
  (when-let [data (lookup-entry config id :pre-compilation)]
    (. builder preCompilation data))
  (when-let [data (lookup-entry config id :security-opt)]
    (. builder securityOpt data))
  (when-let [data (lookup-entry config id :source-map)]
    (. builder sourceMap data))
  (when-let [data (source-map-mode config id :source-map-mode)]
    (. builder sourceMapMode data))
  (when-let [data (lookup-entry config id :sources-content)]
    (. builder sourcesContent data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :tsconfig)]
    (. builder tsconfig data))
  (when-let [data (lookup-entry config id :user)]
    (. builder user data))
  (when-let [data (lookup-entry config id :volumes)]
    (. builder volumes data))
  (when-let [data (lookup-entry config id :volumes-from)]
    (. builder volumesFrom data))
  (when-let [data (lookup-entry config id :working-directory)]
    (. builder workingDirectory data))
  (.build builder))


(defn bundling-options-builder
  ""
  [id config]
  (build-bundling-options-builder (new BundlingOptions$Builder) id config))


(defn build-nodejs-function-builder
  "The build-nodejs-function-builder function updates a NodejsFunction$Builder instance using the provided configuration.
  The function takes the NodejsFunction$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adotInstrumentation` | software.amazon.awscdk.services.lambda.AdotInstrumentationConfig | [[cdk.support/lookup-entry]] | `:adot-instrumentation` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `allowPublicSubnet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-subnet` |
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `applicationLogLevelV2` | software.amazon.awscdk.services.lambda.ApplicationLogLevel | [[cdk.api.services.lambda/application-log-level]] | `:application-log-level-v2` |
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `awsSdkConnectionReuse` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:aws-sdk-connection-reuse` |
| `bundling` | software.amazon.awscdk.services.lambda.nodejs.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfig` | software.amazon.awscdk.services.lambda.ICodeSigningConfig | [[cdk.support/lookup-entry]] | `:code-signing-config` |
| `currentVersionOptions` | software.amazon.awscdk.services.lambda.VersionOptions | [[cdk.support/lookup-entry]] | `:current-version-options` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deadLetterQueueEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dead-letter-queue-enabled` |
| `deadLetterTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:dead-letter-topic` |
| `depsLockFilePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:deps-lock-file-path` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entry` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:environment-encryption` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
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
| `projectRoot` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-root` |
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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^NodejsFunction$Builder builder id config]
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
  (when-let [data (lookup-entry config id :aws-sdk-connection-reuse)]
    (. builder awsSdkConnectionReuse data))
  (when-let [data (lookup-entry config id :bundling)]
    (. builder bundling data))
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
  (when-let [data (lookup-entry config id :deps-lock-file-path)]
    (. builder depsLockFilePath data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :entry)]
    (. builder entry data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :environment-encryption)]
    (. builder environmentEncryption data))
  (when-let [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
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
  (when-let [data (lookup-entry config id :project-root)]
    (. builder projectRoot data))
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
  (.build builder))


(defn nodejs-function-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-nodejs-function-builder (NodejsFunction$Builder/create scope (name id)) id config))


(defn build-nodejs-function-props-builder
  "The build-nodejs-function-props-builder function updates a NodejsFunctionProps$Builder instance using the provided configuration.
  The function takes the NodejsFunctionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adotInstrumentation` | software.amazon.awscdk.services.lambda.AdotInstrumentationConfig | [[cdk.support/lookup-entry]] | `:adot-instrumentation` |
| `allowAllOutbound` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-all-outbound` |
| `allowPublicSubnet` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-public-subnet` |
| `applicationLogLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-log-level` |
| `applicationLogLevelV2` | software.amazon.awscdk.services.lambda.ApplicationLogLevel | [[cdk.api.services.lambda/application-log-level]] | `:application-log-level-v2` |
| `architecture` | software.amazon.awscdk.services.lambda.Architecture | [[cdk.support/lookup-entry]] | `:architecture` |
| `awsSdkConnectionReuse` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:aws-sdk-connection-reuse` |
| `bundling` | software.amazon.awscdk.services.lambda.nodejs.BundlingOptions | [[cdk.support/lookup-entry]] | `:bundling` |
| `code` | software.amazon.awscdk.services.lambda.Code | [[cdk.support/lookup-entry]] | `:code` |
| `codeSigningConfig` | software.amazon.awscdk.services.lambda.ICodeSigningConfig | [[cdk.support/lookup-entry]] | `:code-signing-config` |
| `currentVersionOptions` | software.amazon.awscdk.services.lambda.VersionOptions | [[cdk.support/lookup-entry]] | `:current-version-options` |
| `deadLetterQueue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:dead-letter-queue` |
| `deadLetterQueueEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dead-letter-queue-enabled` |
| `deadLetterTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:dead-letter-topic` |
| `depsLockFilePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:deps-lock-file-path` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entry` | java.lang.String | [[cdk.support/lookup-entry]] | `:entry` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `environmentEncryption` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:environment-encryption` |
| `ephemeralStorageSize` | software.amazon.awscdk.Size | [[cdk.support/lookup-entry]] | `:ephemeral-storage-size` |
| `events` | java.util.List | [[cdk.support/lookup-entry]] | `:events` |
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
| `projectRoot` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-root` |
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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^NodejsFunctionProps$Builder builder id config]
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
  (when-let [data (lookup-entry config id :aws-sdk-connection-reuse)]
    (. builder awsSdkConnectionReuse data))
  (when-let [data (lookup-entry config id :bundling)]
    (. builder bundling data))
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
  (when-let [data (lookup-entry config id :deps-lock-file-path)]
    (. builder depsLockFilePath data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :entry)]
    (. builder entry data))
  (when-let [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-let [data (lookup-entry config id :environment-encryption)]
    (. builder environmentEncryption data))
  (when-let [data (lookup-entry config id :ephemeral-storage-size)]
    (. builder ephemeralStorageSize data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
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
  (when-let [data (lookup-entry config id :project-root)]
    (. builder projectRoot data))
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
  (.build builder))


(defn nodejs-function-props-builder
  ""
  [id config]
  (build-nodejs-function-props-builder (new NodejsFunctionProps$Builder) id config))