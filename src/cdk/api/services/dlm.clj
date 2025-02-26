(ns cdk.api.services.dlm
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.dlm package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.dlm CfnLifecyclePolicy$ActionProperty$Builder
                                                CfnLifecyclePolicy$ArchiveRetainRuleProperty$Builder
                                                CfnLifecyclePolicy$ArchiveRuleProperty$Builder
                                                CfnLifecyclePolicy$Builder
                                                CfnLifecyclePolicy$CreateRuleProperty$Builder
                                                CfnLifecyclePolicy$CrossRegionCopyActionProperty$Builder
                                                CfnLifecyclePolicy$CrossRegionCopyDeprecateRuleProperty$Builder
                                                CfnLifecyclePolicy$CrossRegionCopyRetainRuleProperty$Builder
                                                CfnLifecyclePolicy$CrossRegionCopyRuleProperty$Builder
                                                CfnLifecyclePolicy$DeprecateRuleProperty$Builder
                                                CfnLifecyclePolicy$EncryptionConfigurationProperty$Builder
                                                CfnLifecyclePolicy$EventParametersProperty$Builder
                                                CfnLifecyclePolicy$EventSourceProperty$Builder
                                                CfnLifecyclePolicy$ExclusionsProperty$Builder
                                                CfnLifecyclePolicy$FastRestoreRuleProperty$Builder
                                                CfnLifecyclePolicy$ParametersProperty$Builder
                                                CfnLifecyclePolicy$PolicyDetailsProperty$Builder
                                                CfnLifecyclePolicy$RetainRuleProperty$Builder
                                                CfnLifecyclePolicy$RetentionArchiveTierProperty$Builder
                                                CfnLifecyclePolicy$ScheduleProperty$Builder
                                                CfnLifecyclePolicy$ScriptProperty$Builder
                                                CfnLifecyclePolicy$ShareRuleProperty$Builder
                                                CfnLifecyclePolicyProps$Builder]))


(defn build-cfn-lifecycle-policy-action-property-builder
  "The build-cfn-lifecycle-policy-action-property-builder function updates a CfnLifecyclePolicy$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossRegionCopy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cross-region-copy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnLifecyclePolicy$ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cross-region-copy)]
    (. builder crossRegionCopy data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-lifecycle-policy-action-property-builder
  "Creates a  `CfnLifecyclePolicy$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-action-property-builder (new CfnLifecyclePolicy$ActionProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-archive-retain-rule-property-builder
  "The build-cfn-lifecycle-policy-archive-retain-rule-property-builder function updates a CfnLifecyclePolicy$ArchiveRetainRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$ArchiveRetainRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `retentionArchiveTier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retention-archive-tier` |
"
  [^CfnLifecyclePolicy$ArchiveRetainRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :retention-archive-tier)]
    (. builder retentionArchiveTier data))
  (.build builder))


(defn cfn-lifecycle-policy-archive-retain-rule-property-builder
  "Creates a  `CfnLifecyclePolicy$ArchiveRetainRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-archive-retain-rule-property-builder (new CfnLifecyclePolicy$ArchiveRetainRuleProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-archive-rule-property-builder
  "The build-cfn-lifecycle-policy-archive-rule-property-builder function updates a CfnLifecyclePolicy$ArchiveRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$ArchiveRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `retainRule` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$ArchiveRetainRuleProperty | [[cdk.support/lookup-entry]] | `:retain-rule` |
"
  [^CfnLifecyclePolicy$ArchiveRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :retain-rule)]
    (. builder retainRule data))
  (.build builder))


(defn cfn-lifecycle-policy-archive-rule-property-builder
  "Creates a  `CfnLifecyclePolicy$ArchiveRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-archive-rule-property-builder (new CfnLifecyclePolicy$ArchiveRuleProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-builder
  "The build-cfn-lifecycle-policy-builder function updates a CfnLifecyclePolicy$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:copy-tags` |
| `createInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:create-interval` |
| `crossRegionCopyTargets` | java.lang.Object | [[cdk.support/lookup-entry]] | `:cross-region-copy-targets` |
| `defaultPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-policy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `exclusions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclusions` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `extendDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:extend-deletion` |
| `policyDetails` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$PolicyDetailsProperty | [[cdk.support/lookup-entry]] | `:policy-details` |
| `retainInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retain-interval` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLifecyclePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :copy-tags)]
    (. builder copyTags data))
  (when-some [data (lookup-entry config id :create-interval)]
    (. builder createInterval data))
  (when-some [data (lookup-entry config id :cross-region-copy-targets)]
    (. builder crossRegionCopyTargets data))
  (when-some [data (lookup-entry config id :default-policy)]
    (. builder defaultPolicy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :exclusions)]
    (. builder exclusions data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :extend-deletion)]
    (. builder extendDeletion data))
  (when-some [data (lookup-entry config id :policy-details)]
    (. builder policyDetails data))
  (when-some [data (lookup-entry config id :retain-interval)]
    (. builder retainInterval data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-lifecycle-policy-builder
  "Creates a  `CfnLifecyclePolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-lifecycle-policy-builder (CfnLifecyclePolicy$Builder/create scope (name id)) id config))


(defn build-cfn-lifecycle-policy-create-rule-property-builder
  "The build-cfn-lifecycle-policy-create-rule-property-builder function updates a CfnLifecyclePolicy$CreateRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$CreateRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cronExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:cron-expression` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `scripts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scripts` |
| `times` | java.util.List | [[cdk.support/lookup-entry]] | `:times` |
"
  [^CfnLifecyclePolicy$CreateRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cron-expression)]
    (. builder cronExpression data))
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :interval-unit)]
    (. builder intervalUnit data))
  (when-some [data (lookup-entry config id :location)]
    (. builder location data))
  (when-some [data (lookup-entry config id :scripts)]
    (. builder scripts data))
  (when-some [data (lookup-entry config id :times)]
    (. builder times data))
  (.build builder))


(defn cfn-lifecycle-policy-create-rule-property-builder
  "Creates a  `CfnLifecyclePolicy$CreateRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-create-rule-property-builder (new CfnLifecyclePolicy$CreateRuleProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-cross-region-copy-action-property-builder
  "The build-cfn-lifecycle-policy-cross-region-copy-action-property-builder function updates a CfnLifecyclePolicy$CrossRegionCopyActionProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$CrossRegionCopyActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$EncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `retainRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-rule` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
"
  [^CfnLifecyclePolicy$CrossRegionCopyActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-configuration)]
    (. builder encryptionConfiguration data))
  (when-some [data (lookup-entry config id :retain-rule)]
    (. builder retainRule data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn cfn-lifecycle-policy-cross-region-copy-action-property-builder
  "Creates a  `CfnLifecyclePolicy$CrossRegionCopyActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-cross-region-copy-action-property-builder (new CfnLifecyclePolicy$CrossRegionCopyActionProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-cross-region-copy-deprecate-rule-property-builder
  "The build-cfn-lifecycle-policy-cross-region-copy-deprecate-rule-property-builder function updates a CfnLifecyclePolicy$CrossRegionCopyDeprecateRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$CrossRegionCopyDeprecateRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |
"
  [^CfnLifecyclePolicy$CrossRegionCopyDeprecateRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :interval-unit)]
    (. builder intervalUnit data))
  (.build builder))


(defn cfn-lifecycle-policy-cross-region-copy-deprecate-rule-property-builder
  "Creates a  `CfnLifecyclePolicy$CrossRegionCopyDeprecateRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-cross-region-copy-deprecate-rule-property-builder (new CfnLifecyclePolicy$CrossRegionCopyDeprecateRuleProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-cross-region-copy-retain-rule-property-builder
  "The build-cfn-lifecycle-policy-cross-region-copy-retain-rule-property-builder function updates a CfnLifecyclePolicy$CrossRegionCopyRetainRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$CrossRegionCopyRetainRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |
"
  [^CfnLifecyclePolicy$CrossRegionCopyRetainRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :interval-unit)]
    (. builder intervalUnit data))
  (.build builder))


(defn cfn-lifecycle-policy-cross-region-copy-retain-rule-property-builder
  "Creates a  `CfnLifecyclePolicy$CrossRegionCopyRetainRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-cross-region-copy-retain-rule-property-builder (new CfnLifecyclePolicy$CrossRegionCopyRetainRuleProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-cross-region-copy-rule-property-builder
  "The build-cfn-lifecycle-policy-cross-region-copy-rule-property-builder function updates a CfnLifecyclePolicy$CrossRegionCopyRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$CrossRegionCopyRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmkArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cmk-arn` |
| `copyTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:copy-tags` |
| `deprecateRule` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$CrossRegionCopyDeprecateRuleProperty | [[cdk.support/lookup-entry]] | `:deprecate-rule` |
| `encrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encrypted` |
| `retainRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-rule` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `targetRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-region` |
"
  [^CfnLifecyclePolicy$CrossRegionCopyRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cmk-arn)]
    (. builder cmkArn data))
  (when-some [data (lookup-entry config id :copy-tags)]
    (. builder copyTags data))
  (when-some [data (lookup-entry config id :deprecate-rule)]
    (. builder deprecateRule data))
  (when-some [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (when-some [data (lookup-entry config id :retain-rule)]
    (. builder retainRule data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (when-some [data (lookup-entry config id :target-region)]
    (. builder targetRegion data))
  (.build builder))


(defn cfn-lifecycle-policy-cross-region-copy-rule-property-builder
  "Creates a  `CfnLifecyclePolicy$CrossRegionCopyRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-cross-region-copy-rule-property-builder (new CfnLifecyclePolicy$CrossRegionCopyRuleProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-deprecate-rule-property-builder
  "The build-cfn-lifecycle-policy-deprecate-rule-property-builder function updates a CfnLifecyclePolicy$DeprecateRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$DeprecateRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |
"
  [^CfnLifecyclePolicy$DeprecateRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :interval-unit)]
    (. builder intervalUnit data))
  (.build builder))


(defn cfn-lifecycle-policy-deprecate-rule-property-builder
  "Creates a  `CfnLifecyclePolicy$DeprecateRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-deprecate-rule-property-builder (new CfnLifecyclePolicy$DeprecateRuleProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-encryption-configuration-property-builder
  "The build-cfn-lifecycle-policy-encryption-configuration-property-builder function updates a CfnLifecyclePolicy$EncryptionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$EncryptionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmkArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cmk-arn` |
| `encrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encrypted` |
"
  [^CfnLifecyclePolicy$EncryptionConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cmk-arn)]
    (. builder cmkArn data))
  (when-some [data (lookup-entry config id :encrypted)]
    (. builder encrypted data))
  (.build builder))


(defn cfn-lifecycle-policy-encryption-configuration-property-builder
  "Creates a  `CfnLifecyclePolicy$EncryptionConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-encryption-configuration-property-builder (new CfnLifecyclePolicy$EncryptionConfigurationProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-event-parameters-property-builder
  "The build-cfn-lifecycle-policy-event-parameters-property-builder function updates a CfnLifecyclePolicy$EventParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$EventParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `descriptionRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:description-regex` |
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `snapshotOwner` | java.util.List | [[cdk.support/lookup-entry]] | `:snapshot-owner` |
"
  [^CfnLifecyclePolicy$EventParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description-regex)]
    (. builder descriptionRegex data))
  (when-some [data (lookup-entry config id :event-type)]
    (. builder eventType data))
  (when-some [data (lookup-entry config id :snapshot-owner)]
    (. builder snapshotOwner data))
  (.build builder))


(defn cfn-lifecycle-policy-event-parameters-property-builder
  "Creates a  `CfnLifecyclePolicy$EventParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-event-parameters-property-builder (new CfnLifecyclePolicy$EventParametersProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-event-source-property-builder
  "The build-cfn-lifecycle-policy-event-source-property-builder function updates a CfnLifecyclePolicy$EventSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$EventSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$EventParametersProperty | [[cdk.support/lookup-entry]] | `:parameters` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnLifecyclePolicy$EventSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-lifecycle-policy-event-source-property-builder
  "Creates a  `CfnLifecyclePolicy$EventSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-event-source-property-builder (new CfnLifecyclePolicy$EventSourceProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-exclusions-property-builder
  "The build-cfn-lifecycle-policy-exclusions-property-builder function updates a CfnLifecyclePolicy$ExclusionsProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$ExclusionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeBootVolumes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-boot-volumes` |
| `excludeTags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:exclude-tags` |
| `excludeVolumeTypes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:exclude-volume-types` |
"
  [^CfnLifecyclePolicy$ExclusionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :exclude-boot-volumes)]
    (. builder excludeBootVolumes data))
  (when-some [data (lookup-entry config id :exclude-tags)]
    (. builder excludeTags data))
  (when-some [data (lookup-entry config id :exclude-volume-types)]
    (. builder excludeVolumeTypes data))
  (.build builder))


(defn cfn-lifecycle-policy-exclusions-property-builder
  "Creates a  `CfnLifecyclePolicy$ExclusionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-exclusions-property-builder (new CfnLifecyclePolicy$ExclusionsProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-fast-restore-rule-property-builder
  "The build-cfn-lifecycle-policy-fast-restore-rule-property-builder function updates a CfnLifecyclePolicy$FastRestoreRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$FastRestoreRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |
"
  [^CfnLifecyclePolicy$FastRestoreRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :availability-zones)]
    (. builder availabilityZones data))
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :interval-unit)]
    (. builder intervalUnit data))
  (.build builder))


(defn cfn-lifecycle-policy-fast-restore-rule-property-builder
  "Creates a  `CfnLifecyclePolicy$FastRestoreRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-fast-restore-rule-property-builder (new CfnLifecyclePolicy$FastRestoreRuleProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-parameters-property-builder
  "The build-cfn-lifecycle-policy-parameters-property-builder function updates a CfnLifecyclePolicy$ParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$ParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeBootVolume` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-boot-volume` |
| `excludeDataVolumeTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-data-volume-tags` |
| `noReboot` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-reboot` |
"
  [^CfnLifecyclePolicy$ParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :exclude-boot-volume)]
    (. builder excludeBootVolume data))
  (when-some [data (lookup-entry config id :exclude-data-volume-tags)]
    (. builder excludeDataVolumeTags data))
  (when-some [data (lookup-entry config id :no-reboot)]
    (. builder noReboot data))
  (.build builder))


(defn cfn-lifecycle-policy-parameters-property-builder
  "Creates a  `CfnLifecyclePolicy$ParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-parameters-property-builder (new CfnLifecyclePolicy$ParametersProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-policy-details-property-builder
  "The build-cfn-lifecycle-policy-policy-details-property-builder function updates a CfnLifecyclePolicy$PolicyDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$PolicyDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `copyTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:copy-tags` |
| `createInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:create-interval` |
| `crossRegionCopyTargets` | java.lang.Object | [[cdk.support/lookup-entry]] | `:cross-region-copy-targets` |
| `eventSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-source` |
| `exclusions` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$ExclusionsProperty | [[cdk.support/lookup-entry]] | `:exclusions` |
| `extendDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:extend-deletion` |
| `parameters` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$ParametersProperty | [[cdk.support/lookup-entry]] | `:parameters` |
| `policyLanguage` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-language` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |
| `resourceLocations` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-locations` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `resourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-types` |
| `retainInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retain-interval` |
| `schedules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedules` |
| `targetTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-tags` |
"
  [^CfnLifecyclePolicy$PolicyDetailsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :copy-tags)]
    (. builder copyTags data))
  (when-some [data (lookup-entry config id :create-interval)]
    (. builder createInterval data))
  (when-some [data (lookup-entry config id :cross-region-copy-targets)]
    (. builder crossRegionCopyTargets data))
  (when-some [data (lookup-entry config id :event-source)]
    (. builder eventSource data))
  (when-some [data (lookup-entry config id :exclusions)]
    (. builder exclusions data))
  (when-some [data (lookup-entry config id :extend-deletion)]
    (. builder extendDeletion data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :policy-language)]
    (. builder policyLanguage data))
  (when-some [data (lookup-entry config id :policy-type)]
    (. builder policyType data))
  (when-some [data (lookup-entry config id :resource-locations)]
    (. builder resourceLocations data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :resource-types)]
    (. builder resourceTypes data))
  (when-some [data (lookup-entry config id :retain-interval)]
    (. builder retainInterval data))
  (when-some [data (lookup-entry config id :schedules)]
    (. builder schedules data))
  (when-some [data (lookup-entry config id :target-tags)]
    (. builder targetTags data))
  (.build builder))


(defn cfn-lifecycle-policy-policy-details-property-builder
  "Creates a  `CfnLifecyclePolicy$PolicyDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-policy-details-property-builder (new CfnLifecyclePolicy$PolicyDetailsProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-props-builder
  "The build-cfn-lifecycle-policy-props-builder function updates a CfnLifecyclePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `copyTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:copy-tags` |
| `createInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:create-interval` |
| `crossRegionCopyTargets` | java.lang.Object | [[cdk.support/lookup-entry]] | `:cross-region-copy-targets` |
| `defaultPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-policy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `exclusions` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$ExclusionsProperty | [[cdk.support/lookup-entry]] | `:exclusions` |
| `executionRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-role-arn` |
| `extendDeletion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:extend-deletion` |
| `policyDetails` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$PolicyDetailsProperty | [[cdk.support/lookup-entry]] | `:policy-details` |
| `retainInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retain-interval` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLifecyclePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :copy-tags)]
    (. builder copyTags data))
  (when-some [data (lookup-entry config id :create-interval)]
    (. builder createInterval data))
  (when-some [data (lookup-entry config id :cross-region-copy-targets)]
    (. builder crossRegionCopyTargets data))
  (when-some [data (lookup-entry config id :default-policy)]
    (. builder defaultPolicy data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :exclusions)]
    (. builder exclusions data))
  (when-some [data (lookup-entry config id :execution-role-arn)]
    (. builder executionRoleArn data))
  (when-some [data (lookup-entry config id :extend-deletion)]
    (. builder extendDeletion data))
  (when-some [data (lookup-entry config id :policy-details)]
    (. builder policyDetails data))
  (when-some [data (lookup-entry config id :retain-interval)]
    (. builder retainInterval data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-lifecycle-policy-props-builder
  "Creates a  `CfnLifecyclePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-props-builder (new CfnLifecyclePolicyProps$Builder) id config))


(defn build-cfn-lifecycle-policy-retain-rule-property-builder
  "The build-cfn-lifecycle-policy-retain-rule-property-builder function updates a CfnLifecyclePolicy$RetainRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$RetainRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |
"
  [^CfnLifecyclePolicy$RetainRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :interval-unit)]
    (. builder intervalUnit data))
  (.build builder))


(defn cfn-lifecycle-policy-retain-rule-property-builder
  "Creates a  `CfnLifecyclePolicy$RetainRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-retain-rule-property-builder (new CfnLifecyclePolicy$RetainRuleProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-retention-archive-tier-property-builder
  "The build-cfn-lifecycle-policy-retention-archive-tier-property-builder function updates a CfnLifecyclePolicy$RetentionArchiveTierProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$RetentionArchiveTierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |
"
  [^CfnLifecyclePolicy$RetentionArchiveTierProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :count)]
    (. builder count data))
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :interval-unit)]
    (. builder intervalUnit data))
  (.build builder))


(defn cfn-lifecycle-policy-retention-archive-tier-property-builder
  "Creates a  `CfnLifecyclePolicy$RetentionArchiveTierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-retention-archive-tier-property-builder (new CfnLifecyclePolicy$RetentionArchiveTierProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-schedule-property-builder
  "The build-cfn-lifecycle-policy-schedule-property-builder function updates a CfnLifecyclePolicy$ScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$ScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `archiveRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:archive-rule` |
| `copyTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:copy-tags` |
| `createRule` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$CreateRuleProperty | [[cdk.support/lookup-entry]] | `:create-rule` |
| `crossRegionCopyRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cross-region-copy-rules` |
| `deprecateRule` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$DeprecateRuleProperty | [[cdk.support/lookup-entry]] | `:deprecate-rule` |
| `fastRestoreRule` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$FastRestoreRuleProperty | [[cdk.support/lookup-entry]] | `:fast-restore-rule` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `retainRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-rule` |
| `shareRules` | java.util.List | [[cdk.support/lookup-entry]] | `:share-rules` |
| `tagsToAdd` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tags-to-add` |
| `variableTags` | java.util.List | [[cdk.support/lookup-entry]] | `:variable-tags` |
"
  [^CfnLifecyclePolicy$ScheduleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :archive-rule)]
    (. builder archiveRule data))
  (when-some [data (lookup-entry config id :copy-tags)]
    (. builder copyTags data))
  (when-some [data (lookup-entry config id :create-rule)]
    (. builder createRule data))
  (when-some [data (lookup-entry config id :cross-region-copy-rules)]
    (. builder crossRegionCopyRules data))
  (when-some [data (lookup-entry config id :deprecate-rule)]
    (. builder deprecateRule data))
  (when-some [data (lookup-entry config id :fast-restore-rule)]
    (. builder fastRestoreRule data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :retain-rule)]
    (. builder retainRule data))
  (when-some [data (lookup-entry config id :share-rules)]
    (. builder shareRules data))
  (when-some [data (lookup-entry config id :tags-to-add)]
    (. builder tagsToAdd data))
  (when-some [data (lookup-entry config id :variable-tags)]
    (. builder variableTags data))
  (.build builder))


(defn cfn-lifecycle-policy-schedule-property-builder
  "Creates a  `CfnLifecyclePolicy$ScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-schedule-property-builder (new CfnLifecyclePolicy$ScheduleProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-script-property-builder
  "The build-cfn-lifecycle-policy-script-property-builder function updates a CfnLifecyclePolicy$ScriptProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$ScriptProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executeOperationOnScriptFailure` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execute-operation-on-script-failure` |
| `executionHandler` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-handler` |
| `executionHandlerService` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-handler-service` |
| `executionTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:execution-timeout` |
| `maximumRetryCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-count` |
| `stages` | java.util.List | [[cdk.support/lookup-entry]] | `:stages` |
"
  [^CfnLifecyclePolicy$ScriptProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :execute-operation-on-script-failure)]
    (. builder executeOperationOnScriptFailure data))
  (when-some [data (lookup-entry config id :execution-handler)]
    (. builder executionHandler data))
  (when-some [data (lookup-entry config id :execution-handler-service)]
    (. builder executionHandlerService data))
  (when-some [data (lookup-entry config id :execution-timeout)]
    (. builder executionTimeout data))
  (when-some [data (lookup-entry config id :maximum-retry-count)]
    (. builder maximumRetryCount data))
  (when-some [data (lookup-entry config id :stages)]
    (. builder stages data))
  (.build builder))


(defn cfn-lifecycle-policy-script-property-builder
  "Creates a  `CfnLifecyclePolicy$ScriptProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-script-property-builder (new CfnLifecyclePolicy$ScriptProperty$Builder) id config))


(defn build-cfn-lifecycle-policy-share-rule-property-builder
  "The build-cfn-lifecycle-policy-share-rule-property-builder function updates a CfnLifecyclePolicy$ShareRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$ShareRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:target-accounts` |
| `unshareInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unshare-interval` |
| `unshareIntervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unshare-interval-unit` |
"
  [^CfnLifecyclePolicy$ShareRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :target-accounts)]
    (. builder targetAccounts data))
  (when-some [data (lookup-entry config id :unshare-interval)]
    (. builder unshareInterval data))
  (when-some [data (lookup-entry config id :unshare-interval-unit)]
    (. builder unshareIntervalUnit data))
  (.build builder))


(defn cfn-lifecycle-policy-share-rule-property-builder
  "Creates a  `CfnLifecyclePolicy$ShareRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-lifecycle-policy-share-rule-property-builder (new CfnLifecyclePolicy$ShareRuleProperty$Builder) id config))