(ns cdk.api.services.ssmcontacts
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ssmcontacts package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ssmcontacts CfnContact$Builder
                                                        CfnContact$ChannelTargetInfoProperty$Builder
                                                        CfnContact$ContactTargetInfoProperty$Builder
                                                        CfnContact$StageProperty$Builder
                                                        CfnContact$TargetsProperty$Builder
                                                        CfnContactChannel$Builder
                                                        CfnContactChannelProps$Builder
                                                        CfnContactProps$Builder
                                                        CfnPlan$Builder
                                                        CfnPlan$ChannelTargetInfoProperty$Builder
                                                        CfnPlan$ContactTargetInfoProperty$Builder
                                                        CfnPlan$StageProperty$Builder
                                                        CfnPlan$TargetsProperty$Builder
                                                        CfnPlanProps$Builder
                                                        CfnRotation$Builder
                                                        CfnRotation$CoverageTimeProperty$Builder
                                                        CfnRotation$MonthlySettingProperty$Builder
                                                        CfnRotation$RecurrenceSettingsProperty$Builder
                                                        CfnRotation$ShiftCoverageProperty$Builder
                                                        CfnRotation$WeeklySettingProperty$Builder
                                                        CfnRotationProps$Builder]))


(defn cfn-contact-builder
  "The cfn-contact-builder function buildes out new instances of 
CfnContact$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `plan` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:plan` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnContact$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alias)]
      (. builder alias data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :plan)]
      (. builder plan data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-contact-channel-builder
  "The cfn-contact-channel-builder function buildes out new instances of 
CfnContactChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-address` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-type` |
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `deferActivation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:defer-activation` |"
  [stack id config]
  (let [builder (CfnContactChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :channel-address)]
      (. builder channelAddress data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :channel-type)]
      (. builder channelType data))
    (when-let [data (lookup-entry config id :contact-id)]
      (. builder contactId data))
    (when-let [data (lookup-entry config id :defer-activation)]
      (. builder deferActivation data))
    (.build builder)))


(defn cfn-contact-channel-props-builder
  "The cfn-contact-channel-props-builder function buildes out new instances of 
CfnContactChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-address` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-type` |
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `deferActivation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:defer-activation` |"
  [stack id config]
  (let [builder (CfnContactChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :channel-address)]
      (. builder channelAddress data))
    (when-let [data (lookup-entry config id :channel-name)]
      (. builder channelName data))
    (when-let [data (lookup-entry config id :channel-type)]
      (. builder channelType data))
    (when-let [data (lookup-entry config id :contact-id)]
      (. builder contactId data))
    (when-let [data (lookup-entry config id :defer-activation)]
      (. builder deferActivation data))
    (.build builder)))


(defn cfn-contact-channel-target-info-property-builder
  "The cfn-contact-channel-target-info-property-builder function buildes out new instances of 
CfnContact$ChannelTargetInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `retryIntervalInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-interval-in-minutes` |"
  [stack id config]
  (let [builder (CfnContact$ChannelTargetInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :channel-id)]
      (. builder channelId data))
    (when-let [data (lookup-entry config id :retry-interval-in-minutes)]
      (. builder retryIntervalInMinutes data))
    (.build builder)))


(defn cfn-contact-contact-target-info-property-builder
  "The cfn-contact-contact-target-info-property-builder function buildes out new instances of 
CfnContact$ContactTargetInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `isEssential` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-essential` |"
  [stack id config]
  (let [builder (CfnContact$ContactTargetInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :contact-id)]
      (. builder contactId data))
    (when-let [data (lookup-entry config id :is-essential)]
      (. builder isEssential data))
    (.build builder)))


(defn cfn-contact-props-builder
  "The cfn-contact-props-builder function buildes out new instances of 
CfnContactProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `plan` | java.util.List | [[cdk.support/lookup-entry]] | `:plan` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnContactProps$Builder.)]
    (when-let [data (lookup-entry config id :alias)]
      (. builder alias data))
    (when-let [data (lookup-entry config id :display-name)]
      (. builder displayName data))
    (when-let [data (lookup-entry config id :plan)]
      (. builder plan data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-contact-stage-property-builder
  "The cfn-contact-stage-property-builder function buildes out new instances of 
CfnContact$StageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-minutes` |
| `rotationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:rotation-ids` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (CfnContact$StageProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-in-minutes)]
      (. builder durationInMinutes data))
    (when-let [data (lookup-entry config id :rotation-ids)]
      (. builder rotationIds data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn cfn-contact-targets-property-builder
  "The cfn-contact-targets-property-builder function buildes out new instances of 
CfnContact$TargetsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelTargetInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:channel-target-info` |
| `contactTargetInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contact-target-info` |"
  [stack id config]
  (let [builder (CfnContact$TargetsProperty$Builder.)]
    (when-let [data (lookup-entry config id :channel-target-info)]
      (. builder channelTargetInfo data))
    (when-let [data (lookup-entry config id :contact-target-info)]
      (. builder contactTargetInfo data))
    (.build builder)))


(defn cfn-plan-builder
  "The cfn-plan-builder function buildes out new instances of 
CfnPlan$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `rotationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:rotation-ids` |
| `stages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stages` |"
  [stack id config]
  (let [builder (CfnPlan$Builder/create stack id)]
    (when-let [data (lookup-entry config id :contact-id)]
      (. builder contactId data))
    (when-let [data (lookup-entry config id :rotation-ids)]
      (. builder rotationIds data))
    (when-let [data (lookup-entry config id :stages)]
      (. builder stages data))
    (.build builder)))


(defn cfn-plan-channel-target-info-property-builder
  "The cfn-plan-channel-target-info-property-builder function buildes out new instances of 
CfnPlan$ChannelTargetInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `retryIntervalInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-interval-in-minutes` |"
  [stack id config]
  (let [builder (CfnPlan$ChannelTargetInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :channel-id)]
      (. builder channelId data))
    (when-let [data (lookup-entry config id :retry-interval-in-minutes)]
      (. builder retryIntervalInMinutes data))
    (.build builder)))


(defn cfn-plan-contact-target-info-property-builder
  "The cfn-plan-contact-target-info-property-builder function buildes out new instances of 
CfnPlan$ContactTargetInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `isEssential` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-essential` |"
  [stack id config]
  (let [builder (CfnPlan$ContactTargetInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :contact-id)]
      (. builder contactId data))
    (when-let [data (lookup-entry config id :is-essential)]
      (. builder isEssential data))
    (.build builder)))


(defn cfn-plan-props-builder
  "The cfn-plan-props-builder function buildes out new instances of 
CfnPlanProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `rotationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:rotation-ids` |
| `stages` | java.util.List | [[cdk.support/lookup-entry]] | `:stages` |"
  [stack id config]
  (let [builder (CfnPlanProps$Builder.)]
    (when-let [data (lookup-entry config id :contact-id)]
      (. builder contactId data))
    (when-let [data (lookup-entry config id :rotation-ids)]
      (. builder rotationIds data))
    (when-let [data (lookup-entry config id :stages)]
      (. builder stages data))
    (.build builder)))


(defn cfn-plan-stage-property-builder
  "The cfn-plan-stage-property-builder function buildes out new instances of 
CfnPlan$StageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-minutes` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (CfnPlan$StageProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration-in-minutes)]
      (. builder durationInMinutes data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn cfn-plan-targets-property-builder
  "The cfn-plan-targets-property-builder function buildes out new instances of 
CfnPlan$TargetsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelTargetInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:channel-target-info` |
| `contactTargetInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contact-target-info` |"
  [stack id config]
  (let [builder (CfnPlan$TargetsProperty$Builder.)]
    (when-let [data (lookup-entry config id :channel-target-info)]
      (. builder channelTargetInfo data))
    (when-let [data (lookup-entry config id :contact-target-info)]
      (. builder contactTargetInfo data))
    (.build builder)))


(defn cfn-rotation-builder
  "The cfn-rotation-builder function buildes out new instances of 
CfnRotation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactIds` | java.util.List | [[cdk.support/lookup-entry]] | `:contact-ids` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recurrence` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recurrence` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone-id` |"
  [stack id config]
  (let [builder (CfnRotation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :contact-ids)]
      (. builder contactIds data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recurrence)]
      (. builder recurrence data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :time-zone-id)]
      (. builder timeZoneId data))
    (.build builder)))


(defn cfn-rotation-coverage-time-property-builder
  "The cfn-rotation-coverage-time-property-builder function buildes out new instances of 
CfnRotation$CoverageTimeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |"
  [stack id config]
  (let [builder (CfnRotation$CoverageTimeProperty$Builder.)]
    (when-let [data (lookup-entry config id :end-time)]
      (. builder endTime data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (.build builder)))


(defn cfn-rotation-monthly-setting-property-builder
  "The cfn-rotation-monthly-setting-property-builder function buildes out new instances of 
CfnRotation$MonthlySettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfMonth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:day-of-month` |
| `handOffTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:hand-off-time` |"
  [stack id config]
  (let [builder (CfnRotation$MonthlySettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :day-of-month)]
      (. builder dayOfMonth data))
    (when-let [data (lookup-entry config id :hand-off-time)]
      (. builder handOffTime data))
    (.build builder)))


(defn cfn-rotation-props-builder
  "The cfn-rotation-props-builder function buildes out new instances of 
CfnRotationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactIds` | java.util.List | [[cdk.support/lookup-entry]] | `:contact-ids` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recurrence` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recurrence` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone-id` |"
  [stack id config]
  (let [builder (CfnRotationProps$Builder.)]
    (when-let [data (lookup-entry config id :contact-ids)]
      (. builder contactIds data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :recurrence)]
      (. builder recurrence data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :time-zone-id)]
      (. builder timeZoneId data))
    (.build builder)))


(defn cfn-rotation-recurrence-settings-property-builder
  "The cfn-rotation-recurrence-settings-property-builder function buildes out new instances of 
CfnRotation$RecurrenceSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dailySettings` | java.util.List | [[cdk.support/lookup-entry]] | `:daily-settings` |
| `monthlySettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monthly-settings` |
| `numberOfOnCalls` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-on-calls` |
| `recurrenceMultiplier` | java.lang.Number | [[cdk.support/lookup-entry]] | `:recurrence-multiplier` |
| `shiftCoverages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:shift-coverages` |
| `weeklySettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:weekly-settings` |"
  [stack id config]
  (let [builder (CfnRotation$RecurrenceSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :daily-settings)]
      (. builder dailySettings data))
    (when-let [data (lookup-entry config id :monthly-settings)]
      (. builder monthlySettings data))
    (when-let [data (lookup-entry config id :number-of-on-calls)]
      (. builder numberOfOnCalls data))
    (when-let [data (lookup-entry config id :recurrence-multiplier)]
      (. builder recurrenceMultiplier data))
    (when-let [data (lookup-entry config id :shift-coverages)]
      (. builder shiftCoverages data))
    (when-let [data (lookup-entry config id :weekly-settings)]
      (. builder weeklySettings data))
    (.build builder)))


(defn cfn-rotation-shift-coverage-property-builder
  "The cfn-rotation-shift-coverage-property-builder function buildes out new instances of 
CfnRotation$ShiftCoverageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coverageTimes` | java.util.List | [[cdk.support/lookup-entry]] | `:coverage-times` |
| `dayOfWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-week` |"
  [stack id config]
  (let [builder (CfnRotation$ShiftCoverageProperty$Builder.)]
    (when-let [data (lookup-entry config id :coverage-times)]
      (. builder coverageTimes data))
    (when-let [data (lookup-entry config id :day-of-week)]
      (. builder dayOfWeek data))
    (.build builder)))


(defn cfn-rotation-weekly-setting-property-builder
  "The cfn-rotation-weekly-setting-property-builder function buildes out new instances of 
CfnRotation$WeeklySettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-week` |
| `handOffTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:hand-off-time` |"
  [stack id config]
  (let [builder (CfnRotation$WeeklySettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :day-of-week)]
      (. builder dayOfWeek data))
    (when-let [data (lookup-entry config id :hand-off-time)]
      (. builder handOffTime data))
    (.build builder)))