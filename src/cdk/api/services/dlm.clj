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


(defn cfn-lifecycle-policy-action-property-builder
  "The cfn-lifecycle-policy-action-property-builder function buildes out new instances of 
CfnLifecyclePolicy$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossRegionCopy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cross-region-copy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :cross-region-copy)]
      (. builder crossRegionCopy data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-lifecycle-policy-archive-retain-rule-property-builder
  "The cfn-lifecycle-policy-archive-retain-rule-property-builder function buildes out new instances of 
CfnLifecyclePolicy$ArchiveRetainRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `retentionArchiveTier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retention-archive-tier` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$ArchiveRetainRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :retention-archive-tier)]
      (. builder retentionArchiveTier data))
    (.build builder)))


(defn cfn-lifecycle-policy-archive-rule-property-builder
  "The cfn-lifecycle-policy-archive-rule-property-builder function buildes out new instances of 
CfnLifecyclePolicy$ArchiveRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `retainRule` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$ArchiveRetainRuleProperty | [[cdk.support/lookup-entry]] | `:retain-rule` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$ArchiveRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :retain-rule)]
      (. builder retainRule data))
    (.build builder)))


(defn cfn-lifecycle-policy-builder
  "The cfn-lifecycle-policy-builder function buildes out new instances of 
CfnLifecyclePolicy$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :copy-tags)]
      (. builder copyTags data))
    (when-let [data (lookup-entry config id :create-interval)]
      (. builder createInterval data))
    (when-let [data (lookup-entry config id :cross-region-copy-targets)]
      (. builder crossRegionCopyTargets data))
    (when-let [data (lookup-entry config id :default-policy)]
      (. builder defaultPolicy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :exclusions)]
      (. builder exclusions data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :extend-deletion)]
      (. builder extendDeletion data))
    (when-let [data (lookup-entry config id :policy-details)]
      (. builder policyDetails data))
    (when-let [data (lookup-entry config id :retain-interval)]
      (. builder retainInterval data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-lifecycle-policy-create-rule-property-builder
  "The cfn-lifecycle-policy-create-rule-property-builder function buildes out new instances of 
CfnLifecyclePolicy$CreateRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cronExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:cron-expression` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |
| `location` | java.lang.String | [[cdk.support/lookup-entry]] | `:location` |
| `scripts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scripts` |
| `times` | java.util.List | [[cdk.support/lookup-entry]] | `:times` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$CreateRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :cron-expression)]
      (. builder cronExpression data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :interval-unit)]
      (. builder intervalUnit data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :scripts)]
      (. builder scripts data))
    (when-let [data (lookup-entry config id :times)]
      (. builder times data))
    (.build builder)))


(defn cfn-lifecycle-policy-cross-region-copy-action-property-builder
  "The cfn-lifecycle-policy-cross-region-copy-action-property-builder function buildes out new instances of 
CfnLifecyclePolicy$CrossRegionCopyActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfiguration` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$EncryptionConfigurationProperty | [[cdk.support/lookup-entry]] | `:encryption-configuration` |
| `retainRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-rule` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$CrossRegionCopyActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-configuration)]
      (. builder encryptionConfiguration data))
    (when-let [data (lookup-entry config id :retain-rule)]
      (. builder retainRule data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-lifecycle-policy-cross-region-copy-deprecate-rule-property-builder
  "The cfn-lifecycle-policy-cross-region-copy-deprecate-rule-property-builder function buildes out new instances of 
CfnLifecyclePolicy$CrossRegionCopyDeprecateRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$CrossRegionCopyDeprecateRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :interval-unit)]
      (. builder intervalUnit data))
    (.build builder)))


(defn cfn-lifecycle-policy-cross-region-copy-retain-rule-property-builder
  "The cfn-lifecycle-policy-cross-region-copy-retain-rule-property-builder function buildes out new instances of 
CfnLifecyclePolicy$CrossRegionCopyRetainRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$CrossRegionCopyRetainRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :interval-unit)]
      (. builder intervalUnit data))
    (.build builder)))


(defn cfn-lifecycle-policy-cross-region-copy-rule-property-builder
  "The cfn-lifecycle-policy-cross-region-copy-rule-property-builder function buildes out new instances of 
CfnLifecyclePolicy$CrossRegionCopyRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmkArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cmk-arn` |
| `copyTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:copy-tags` |
| `deprecateRule` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$CrossRegionCopyDeprecateRuleProperty | [[cdk.support/lookup-entry]] | `:deprecate-rule` |
| `encrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encrypted` |
| `retainRule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:retain-rule` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `targetRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-region` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$CrossRegionCopyRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :cmk-arn)]
      (. builder cmkArn data))
    (when-let [data (lookup-entry config id :copy-tags)]
      (. builder copyTags data))
    (when-let [data (lookup-entry config id :deprecate-rule)]
      (. builder deprecateRule data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (when-let [data (lookup-entry config id :retain-rule)]
      (. builder retainRule data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (when-let [data (lookup-entry config id :target-region)]
      (. builder targetRegion data))
    (.build builder)))


(defn cfn-lifecycle-policy-deprecate-rule-property-builder
  "The cfn-lifecycle-policy-deprecate-rule-property-builder function buildes out new instances of 
CfnLifecyclePolicy$DeprecateRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$DeprecateRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :interval-unit)]
      (. builder intervalUnit data))
    (.build builder)))


(defn cfn-lifecycle-policy-encryption-configuration-property-builder
  "The cfn-lifecycle-policy-encryption-configuration-property-builder function buildes out new instances of 
CfnLifecyclePolicy$EncryptionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cmkArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cmk-arn` |
| `encrypted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encrypted` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$EncryptionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cmk-arn)]
      (. builder cmkArn data))
    (when-let [data (lookup-entry config id :encrypted)]
      (. builder encrypted data))
    (.build builder)))


(defn cfn-lifecycle-policy-event-parameters-property-builder
  "The cfn-lifecycle-policy-event-parameters-property-builder function buildes out new instances of 
CfnLifecyclePolicy$EventParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `descriptionRegex` | java.lang.String | [[cdk.support/lookup-entry]] | `:description-regex` |
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `snapshotOwner` | java.util.List | [[cdk.support/lookup-entry]] | `:snapshot-owner` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$EventParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :description-regex)]
      (. builder descriptionRegex data))
    (when-let [data (lookup-entry config id :event-type)]
      (. builder eventType data))
    (when-let [data (lookup-entry config id :snapshot-owner)]
      (. builder snapshotOwner data))
    (.build builder)))


(defn cfn-lifecycle-policy-event-source-property-builder
  "The cfn-lifecycle-policy-event-source-property-builder function buildes out new instances of 
CfnLifecyclePolicy$EventSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameters` | software.amazon.awscdk.services.dlm.CfnLifecyclePolicy$EventParametersProperty | [[cdk.support/lookup-entry]] | `:parameters` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$EventSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-lifecycle-policy-exclusions-property-builder
  "The cfn-lifecycle-policy-exclusions-property-builder function buildes out new instances of 
CfnLifecyclePolicy$ExclusionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeBootVolumes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-boot-volumes` |
| `excludeTags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:exclude-tags` |
| `excludeVolumeTypes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:exclude-volume-types` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$ExclusionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :exclude-boot-volumes)]
      (. builder excludeBootVolumes data))
    (when-let [data (lookup-entry config id :exclude-tags)]
      (. builder excludeTags data))
    (when-let [data (lookup-entry config id :exclude-volume-types)]
      (. builder excludeVolumeTypes data))
    (.build builder)))


(defn cfn-lifecycle-policy-fast-restore-rule-property-builder
  "The cfn-lifecycle-policy-fast-restore-rule-property-builder function buildes out new instances of 
CfnLifecyclePolicy$FastRestoreRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$FastRestoreRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :interval-unit)]
      (. builder intervalUnit data))
    (.build builder)))


(defn cfn-lifecycle-policy-parameters-property-builder
  "The cfn-lifecycle-policy-parameters-property-builder function buildes out new instances of 
CfnLifecyclePolicy$ParametersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeBootVolume` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-boot-volume` |
| `excludeDataVolumeTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-data-volume-tags` |
| `noReboot` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-reboot` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$ParametersProperty$Builder.)]
    (when-let [data (lookup-entry config id :exclude-boot-volume)]
      (. builder excludeBootVolume data))
    (when-let [data (lookup-entry config id :exclude-data-volume-tags)]
      (. builder excludeDataVolumeTags data))
    (when-let [data (lookup-entry config id :no-reboot)]
      (. builder noReboot data))
    (.build builder)))


(defn cfn-lifecycle-policy-policy-details-property-builder
  "The cfn-lifecycle-policy-policy-details-property-builder function buildes out new instances of 
CfnLifecyclePolicy$PolicyDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `targetTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-tags` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$PolicyDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :copy-tags)]
      (. builder copyTags data))
    (when-let [data (lookup-entry config id :create-interval)]
      (. builder createInterval data))
    (when-let [data (lookup-entry config id :cross-region-copy-targets)]
      (. builder crossRegionCopyTargets data))
    (when-let [data (lookup-entry config id :event-source)]
      (. builder eventSource data))
    (when-let [data (lookup-entry config id :exclusions)]
      (. builder exclusions data))
    (when-let [data (lookup-entry config id :extend-deletion)]
      (. builder extendDeletion data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :policy-language)]
      (. builder policyLanguage data))
    (when-let [data (lookup-entry config id :policy-type)]
      (. builder policyType data))
    (when-let [data (lookup-entry config id :resource-locations)]
      (. builder resourceLocations data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :resource-types)]
      (. builder resourceTypes data))
    (when-let [data (lookup-entry config id :retain-interval)]
      (. builder retainInterval data))
    (when-let [data (lookup-entry config id :schedules)]
      (. builder schedules data))
    (when-let [data (lookup-entry config id :target-tags)]
      (. builder targetTags data))
    (.build builder)))


(defn cfn-lifecycle-policy-props-builder
  "The cfn-lifecycle-policy-props-builder function buildes out new instances of 
CfnLifecyclePolicyProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :copy-tags)]
      (. builder copyTags data))
    (when-let [data (lookup-entry config id :create-interval)]
      (. builder createInterval data))
    (when-let [data (lookup-entry config id :cross-region-copy-targets)]
      (. builder crossRegionCopyTargets data))
    (when-let [data (lookup-entry config id :default-policy)]
      (. builder defaultPolicy data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :exclusions)]
      (. builder exclusions data))
    (when-let [data (lookup-entry config id :execution-role-arn)]
      (. builder executionRoleArn data))
    (when-let [data (lookup-entry config id :extend-deletion)]
      (. builder extendDeletion data))
    (when-let [data (lookup-entry config id :policy-details)]
      (. builder policyDetails data))
    (when-let [data (lookup-entry config id :retain-interval)]
      (. builder retainInterval data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-lifecycle-policy-retain-rule-property-builder
  "The cfn-lifecycle-policy-retain-rule-property-builder function buildes out new instances of 
CfnLifecyclePolicy$RetainRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$RetainRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :interval-unit)]
      (. builder intervalUnit data))
    (.build builder)))


(defn cfn-lifecycle-policy-retention-archive-tier-property-builder
  "The cfn-lifecycle-policy-retention-archive-tier-property-builder function buildes out new instances of 
CfnLifecyclePolicy$RetentionArchiveTierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Number | [[cdk.support/lookup-entry]] | `:count` |
| `interval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:interval` |
| `intervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval-unit` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$RetentionArchiveTierProperty$Builder.)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :interval-unit)]
      (. builder intervalUnit data))
    (.build builder)))


(defn cfn-lifecycle-policy-schedule-property-builder
  "The cfn-lifecycle-policy-schedule-property-builder function buildes out new instances of 
CfnLifecyclePolicy$ScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `variableTags` | java.util.List | [[cdk.support/lookup-entry]] | `:variable-tags` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$ScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :archive-rule)]
      (. builder archiveRule data))
    (when-let [data (lookup-entry config id :copy-tags)]
      (. builder copyTags data))
    (when-let [data (lookup-entry config id :create-rule)]
      (. builder createRule data))
    (when-let [data (lookup-entry config id :cross-region-copy-rules)]
      (. builder crossRegionCopyRules data))
    (when-let [data (lookup-entry config id :deprecate-rule)]
      (. builder deprecateRule data))
    (when-let [data (lookup-entry config id :fast-restore-rule)]
      (. builder fastRestoreRule data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :retain-rule)]
      (. builder retainRule data))
    (when-let [data (lookup-entry config id :share-rules)]
      (. builder shareRules data))
    (when-let [data (lookup-entry config id :tags-to-add)]
      (. builder tagsToAdd data))
    (when-let [data (lookup-entry config id :variable-tags)]
      (. builder variableTags data))
    (.build builder)))


(defn cfn-lifecycle-policy-script-property-builder
  "The cfn-lifecycle-policy-script-property-builder function buildes out new instances of 
CfnLifecyclePolicy$ScriptProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `executeOperationOnScriptFailure` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execute-operation-on-script-failure` |
| `executionHandler` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-handler` |
| `executionHandlerService` | java.lang.String | [[cdk.support/lookup-entry]] | `:execution-handler-service` |
| `executionTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:execution-timeout` |
| `maximumRetryCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-retry-count` |
| `stages` | java.util.List | [[cdk.support/lookup-entry]] | `:stages` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$ScriptProperty$Builder.)]
    (when-let [data (lookup-entry config id :execute-operation-on-script-failure)]
      (. builder executeOperationOnScriptFailure data))
    (when-let [data (lookup-entry config id :execution-handler)]
      (. builder executionHandler data))
    (when-let [data (lookup-entry config id :execution-handler-service)]
      (. builder executionHandlerService data))
    (when-let [data (lookup-entry config id :execution-timeout)]
      (. builder executionTimeout data))
    (when-let [data (lookup-entry config id :maximum-retry-count)]
      (. builder maximumRetryCount data))
    (when-let [data (lookup-entry config id :stages)]
      (. builder stages data))
    (.build builder)))


(defn cfn-lifecycle-policy-share-rule-property-builder
  "The cfn-lifecycle-policy-share-rule-property-builder function buildes out new instances of 
CfnLifecyclePolicy$ShareRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetAccounts` | java.util.List | [[cdk.support/lookup-entry]] | `:target-accounts` |
| `unshareInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unshare-interval` |
| `unshareIntervalUnit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unshare-interval-unit` |"
  [stack id config]
  (let [builder (CfnLifecyclePolicy$ShareRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-accounts)]
      (. builder targetAccounts data))
    (when-let [data (lookup-entry config id :unshare-interval)]
      (. builder unshareInterval data))
    (when-let [data (lookup-entry config id :unshare-interval-unit)]
      (. builder unshareIntervalUnit data))
    (.build builder)))