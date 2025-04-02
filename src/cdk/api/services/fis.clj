(ns cdk.api.services.fis
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.fis package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.fis CfnExperimentTemplate$Builder
                                                CfnExperimentTemplate$CloudWatchLogsConfigurationProperty$Builder
                                                CfnExperimentTemplate$ExperimentTemplateActionProperty$Builder
                                                CfnExperimentTemplate$ExperimentTemplateExperimentOptionsProperty$Builder
                                                CfnExperimentTemplate$ExperimentTemplateLogConfigurationProperty$Builder
                                                CfnExperimentTemplate$ExperimentTemplateStopConditionProperty$Builder
                                                CfnExperimentTemplate$ExperimentTemplateTargetFilterProperty$Builder
                                                CfnExperimentTemplate$ExperimentTemplateTargetProperty$Builder
                                                CfnExperimentTemplate$S3ConfigurationProperty$Builder
                                                CfnExperimentTemplateProps$Builder
                                                CfnTargetAccountConfiguration$Builder
                                                CfnTargetAccountConfigurationProps$Builder]))


(defn cfn-experiment-template-builder>
  "The cfn-experiment-template-builder> function updates a CfnExperimentTemplate$Builder instance using the provided configuration.
  The function takes the CfnExperimentTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.Map | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `experimentOptions` | software.amazon.awscdk.services.fis.CfnExperimentTemplate$ExperimentTemplateExperimentOptionsProperty | [[cdk.support/lookup-entry]] | `:experiment-options` |
| `logConfiguration` | software.amazon.awscdk.services.fis.CfnExperimentTemplate$ExperimentTemplateLogConfigurationProperty | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stopConditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stop-conditions` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | java.util.Map | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnExperimentTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :experiment-options)]
    (. builder experimentOptions data))
  (when-some [data (lookup-entry config id :log-configuration)]
    (. builder logConfiguration data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :stop-conditions)]
    (. builder stopConditions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn cfn-experiment-template-builder
  "Creates a  `CfnExperimentTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-experiment-template-builder> (CfnExperimentTemplate$Builder/create scope (name id)) id config))


(defn cfn-experiment-template-cloud-watch-logs-configuration-property-builder>
  "The cfn-experiment-template-cloud-watch-logs-configuration-property-builder> function updates a CfnExperimentTemplate$CloudWatchLogsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnExperimentTemplate$CloudWatchLogsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group-arn` |
"
  [^CfnExperimentTemplate$CloudWatchLogsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :log-group-arn)]
    (. builder logGroupArn data))
  (.build builder))


(defn cfn-experiment-template-cloud-watch-logs-configuration-property-builder
  "Creates a  `CfnExperimentTemplate$CloudWatchLogsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-experiment-template-cloud-watch-logs-configuration-property-builder> (new CfnExperimentTemplate$CloudWatchLogsConfigurationProperty$Builder) id config))


(defn cfn-experiment-template-experiment-template-action-property-builder>
  "The cfn-experiment-template-experiment-template-action-property-builder> function updates a CfnExperimentTemplate$ExperimentTemplateActionProperty$Builder instance using the provided configuration.
  The function takes the CfnExperimentTemplate$ExperimentTemplateActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameters` | java.util.Map | [[cdk.support/lookup-entry]] | `:parameters` |
| `startAfter` | java.util.List | [[cdk.support/lookup-entry]] | `:start-after` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnExperimentTemplate$ExperimentTemplateActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action-id)]
    (. builder actionId data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :start-after)]
    (. builder startAfter data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn cfn-experiment-template-experiment-template-action-property-builder
  "Creates a  `CfnExperimentTemplate$ExperimentTemplateActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-experiment-template-experiment-template-action-property-builder> (new CfnExperimentTemplate$ExperimentTemplateActionProperty$Builder) id config))


(defn cfn-experiment-template-experiment-template-experiment-options-property-builder>
  "The cfn-experiment-template-experiment-template-experiment-options-property-builder> function updates a CfnExperimentTemplate$ExperimentTemplateExperimentOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnExperimentTemplate$ExperimentTemplateExperimentOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountTargeting` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-targeting` |
| `emptyTargetResolutionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:empty-target-resolution-mode` |
"
  [^CfnExperimentTemplate$ExperimentTemplateExperimentOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :account-targeting)]
    (. builder accountTargeting data))
  (when-some [data (lookup-entry config id :empty-target-resolution-mode)]
    (. builder emptyTargetResolutionMode data))
  (.build builder))


(defn cfn-experiment-template-experiment-template-experiment-options-property-builder
  "Creates a  `CfnExperimentTemplate$ExperimentTemplateExperimentOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-experiment-template-experiment-template-experiment-options-property-builder> (new CfnExperimentTemplate$ExperimentTemplateExperimentOptionsProperty$Builder) id config))


(defn cfn-experiment-template-experiment-template-log-configuration-property-builder>
  "The cfn-experiment-template-experiment-template-log-configuration-property-builder> function updates a CfnExperimentTemplate$ExperimentTemplateLogConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnExperimentTemplate$ExperimentTemplateLogConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsConfiguration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-configuration` |
| `logSchemaVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:log-schema-version` |
| `s3Configuration` | java.lang.Object | [[cdk.support/lookup-entry]] | `:s3-configuration` |
"
  [^CfnExperimentTemplate$ExperimentTemplateLogConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-logs-configuration)]
    (. builder cloudWatchLogsConfiguration data))
  (when-some [data (lookup-entry config id :log-schema-version)]
    (. builder logSchemaVersion data))
  (when-some [data (lookup-entry config id :s3-configuration)]
    (. builder s3Configuration data))
  (.build builder))


(defn cfn-experiment-template-experiment-template-log-configuration-property-builder
  "Creates a  `CfnExperimentTemplate$ExperimentTemplateLogConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-experiment-template-experiment-template-log-configuration-property-builder> (new CfnExperimentTemplate$ExperimentTemplateLogConfigurationProperty$Builder) id config))


(defn cfn-experiment-template-experiment-template-stop-condition-property-builder>
  "The cfn-experiment-template-experiment-template-stop-condition-property-builder> function updates a CfnExperimentTemplate$ExperimentTemplateStopConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnExperimentTemplate$ExperimentTemplateStopConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnExperimentTemplate$ExperimentTemplateStopConditionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-experiment-template-experiment-template-stop-condition-property-builder
  "Creates a  `CfnExperimentTemplate$ExperimentTemplateStopConditionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-experiment-template-experiment-template-stop-condition-property-builder> (new CfnExperimentTemplate$ExperimentTemplateStopConditionProperty$Builder) id config))


(defn cfn-experiment-template-experiment-template-target-filter-property-builder>
  "The cfn-experiment-template-experiment-template-target-filter-property-builder> function updates a CfnExperimentTemplate$ExperimentTemplateTargetFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnExperimentTemplate$ExperimentTemplateTargetFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnExperimentTemplate$ExperimentTemplateTargetFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-experiment-template-experiment-template-target-filter-property-builder
  "Creates a  `CfnExperimentTemplate$ExperimentTemplateTargetFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-experiment-template-experiment-template-target-filter-property-builder> (new CfnExperimentTemplate$ExperimentTemplateTargetFilterProperty$Builder) id config))


(defn cfn-experiment-template-experiment-template-target-property-builder>
  "The cfn-experiment-template-experiment-template-target-property-builder> function updates a CfnExperimentTemplate$ExperimentTemplateTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnExperimentTemplate$ExperimentTemplateTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `filters` | java.util.List | [[cdk.support/lookup-entry]] | `:filters` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
| `resourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-arns` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `selectionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:selection-mode` |
"
  [^CfnExperimentTemplate$ExperimentTemplateTargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :filters)]
    (. builder filters data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :resource-arns)]
    (. builder resourceArns data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :selection-mode)]
    (. builder selectionMode data))
  (.build builder))


(defn cfn-experiment-template-experiment-template-target-property-builder
  "Creates a  `CfnExperimentTemplate$ExperimentTemplateTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-experiment-template-experiment-template-target-property-builder> (new CfnExperimentTemplate$ExperimentTemplateTargetProperty$Builder) id config))


(defn cfn-experiment-template-props-builder>
  "The cfn-experiment-template-props-builder> function updates a CfnExperimentTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnExperimentTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `experimentOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:experiment-options` |
| `logConfiguration` | software.amazon.awscdk.services.fis.CfnExperimentTemplate$ExperimentTemplateLogConfigurationProperty | [[cdk.support/lookup-entry]] | `:log-configuration` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `stopConditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stop-conditions` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `targets` | java.util.Map | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnExperimentTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :experiment-options)]
    (. builder experimentOptions data))
  (when-some [data (lookup-entry config id :log-configuration)]
    (. builder logConfiguration data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :stop-conditions)]
    (. builder stopConditions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn cfn-experiment-template-props-builder
  "Creates a  `CfnExperimentTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-experiment-template-props-builder> (new CfnExperimentTemplateProps$Builder) id config))


(defn cfn-experiment-template-s3-configuration-property-builder>
  "The cfn-experiment-template-s3-configuration-property-builder> function updates a CfnExperimentTemplate$S3ConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnExperimentTemplate$S3ConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnExperimentTemplate$S3ConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cfn-experiment-template-s3-configuration-property-builder
  "Creates a  `CfnExperimentTemplate$S3ConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-experiment-template-s3-configuration-property-builder> (new CfnExperimentTemplate$S3ConfigurationProperty$Builder) id config))


(defn cfn-target-account-configuration-builder>
  "The cfn-target-account-configuration-builder> function updates a CfnTargetAccountConfiguration$Builder instance using the provided configuration.
  The function takes the CfnTargetAccountConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `experimentTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:experiment-template-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTargetAccountConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :experiment-template-id)]
    (. builder experimentTemplateId data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-target-account-configuration-builder
  "Creates a  `CfnTargetAccountConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-target-account-configuration-builder> (CfnTargetAccountConfiguration$Builder/create scope (name id)) id config))


(defn cfn-target-account-configuration-props-builder>
  "The cfn-target-account-configuration-props-builder> function updates a CfnTargetAccountConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnTargetAccountConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:account-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `experimentTemplateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:experiment-template-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnTargetAccountConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :account-id)]
    (. builder accountId data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :experiment-template-id)]
    (. builder experimentTemplateId data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-target-account-configuration-props-builder
  "Creates a  `CfnTargetAccountConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-target-account-configuration-props-builder> (new CfnTargetAccountConfigurationProps$Builder) id config))