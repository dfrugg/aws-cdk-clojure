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


(defn build-cfn-contact-builder
  "The build-cfn-contact-builder function updates a CfnContact$Builder instance using the provided configuration.
  The function takes the CfnContact$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `plan` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:plan` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnContact$Builder builder id config]
  (when-let [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :plan)]
    (. builder plan data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-contact-builder
  "Creates a  `CfnContact$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-contact-builder (CfnContact$Builder/create scope (name id)) id config))


(defn build-cfn-contact-channel-builder
  "The build-cfn-contact-channel-builder function updates a CfnContactChannel$Builder instance using the provided configuration.
  The function takes the CfnContactChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-address` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-type` |
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `deferActivation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:defer-activation` |
"
  [^CfnContactChannel$Builder builder id config]
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
  (.build builder))


(defn cfn-contact-channel-builder
  "Creates a  `CfnContactChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-contact-channel-builder (CfnContactChannel$Builder/create scope (name id)) id config))


(defn build-cfn-contact-channel-props-builder
  "The build-cfn-contact-channel-props-builder function updates a CfnContactChannelProps$Builder instance using the provided configuration.
  The function takes the CfnContactChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-address` |
| `channelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-name` |
| `channelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-type` |
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `deferActivation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:defer-activation` |
"
  [^CfnContactChannelProps$Builder builder id config]
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
  (.build builder))


(defn cfn-contact-channel-props-builder
  "Creates a  `CfnContactChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-contact-channel-props-builder (new CfnContactChannelProps$Builder) id config))


(defn build-cfn-contact-channel-target-info-property-builder
  "The build-cfn-contact-channel-target-info-property-builder function updates a CfnContact$ChannelTargetInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnContact$ChannelTargetInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `retryIntervalInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-interval-in-minutes` |
"
  [^CfnContact$ChannelTargetInfoProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-id)]
    (. builder channelId data))
  (when-let [data (lookup-entry config id :retry-interval-in-minutes)]
    (. builder retryIntervalInMinutes data))
  (.build builder))


(defn cfn-contact-channel-target-info-property-builder
  "Creates a  `CfnContact$ChannelTargetInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-contact-channel-target-info-property-builder (new CfnContact$ChannelTargetInfoProperty$Builder) id config))


(defn build-cfn-contact-contact-target-info-property-builder
  "The build-cfn-contact-contact-target-info-property-builder function updates a CfnContact$ContactTargetInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnContact$ContactTargetInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `isEssential` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-essential` |
"
  [^CfnContact$ContactTargetInfoProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :contact-id)]
    (. builder contactId data))
  (when-let [data (lookup-entry config id :is-essential)]
    (. builder isEssential data))
  (.build builder))


(defn cfn-contact-contact-target-info-property-builder
  "Creates a  `CfnContact$ContactTargetInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-contact-contact-target-info-property-builder (new CfnContact$ContactTargetInfoProperty$Builder) id config))


(defn build-cfn-contact-props-builder
  "The build-cfn-contact-props-builder function updates a CfnContactProps$Builder instance using the provided configuration.
  The function takes the CfnContactProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `displayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-name` |
| `plan` | java.util.List | [[cdk.support/lookup-entry]] | `:plan` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnContactProps$Builder builder id config]
  (when-let [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-let [data (lookup-entry config id :display-name)]
    (. builder displayName data))
  (when-let [data (lookup-entry config id :plan)]
    (. builder plan data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-contact-props-builder
  "Creates a  `CfnContactProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-contact-props-builder (new CfnContactProps$Builder) id config))


(defn build-cfn-contact-stage-property-builder
  "The build-cfn-contact-stage-property-builder function updates a CfnContact$StageProperty$Builder instance using the provided configuration.
  The function takes the CfnContact$StageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-minutes` |
| `rotationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:rotation-ids` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnContact$StageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :duration-in-minutes)]
    (. builder durationInMinutes data))
  (when-let [data (lookup-entry config id :rotation-ids)]
    (. builder rotationIds data))
  (when-let [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn cfn-contact-stage-property-builder
  "Creates a  `CfnContact$StageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-contact-stage-property-builder (new CfnContact$StageProperty$Builder) id config))


(defn build-cfn-contact-targets-property-builder
  "The build-cfn-contact-targets-property-builder function updates a CfnContact$TargetsProperty$Builder instance using the provided configuration.
  The function takes the CfnContact$TargetsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelTargetInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:channel-target-info` |
| `contactTargetInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contact-target-info` |
"
  [^CfnContact$TargetsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-target-info)]
    (. builder channelTargetInfo data))
  (when-let [data (lookup-entry config id :contact-target-info)]
    (. builder contactTargetInfo data))
  (.build builder))


(defn cfn-contact-targets-property-builder
  "Creates a  `CfnContact$TargetsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-contact-targets-property-builder (new CfnContact$TargetsProperty$Builder) id config))


(defn build-cfn-plan-builder
  "The build-cfn-plan-builder function updates a CfnPlan$Builder instance using the provided configuration.
  The function takes the CfnPlan$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `rotationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:rotation-ids` |
| `stages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:stages` |
"
  [^CfnPlan$Builder builder id config]
  (when-let [data (lookup-entry config id :contact-id)]
    (. builder contactId data))
  (when-let [data (lookup-entry config id :rotation-ids)]
    (. builder rotationIds data))
  (when-let [data (lookup-entry config id :stages)]
    (. builder stages data))
  (.build builder))


(defn cfn-plan-builder
  "Creates a  `CfnPlan$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-plan-builder (CfnPlan$Builder/create scope (name id)) id config))


(defn build-cfn-plan-channel-target-info-property-builder
  "The build-cfn-plan-channel-target-info-property-builder function updates a CfnPlan$ChannelTargetInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnPlan$ChannelTargetInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel-id` |
| `retryIntervalInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retry-interval-in-minutes` |
"
  [^CfnPlan$ChannelTargetInfoProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-id)]
    (. builder channelId data))
  (when-let [data (lookup-entry config id :retry-interval-in-minutes)]
    (. builder retryIntervalInMinutes data))
  (.build builder))


(defn cfn-plan-channel-target-info-property-builder
  "Creates a  `CfnPlan$ChannelTargetInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plan-channel-target-info-property-builder (new CfnPlan$ChannelTargetInfoProperty$Builder) id config))


(defn build-cfn-plan-contact-target-info-property-builder
  "The build-cfn-plan-contact-target-info-property-builder function updates a CfnPlan$ContactTargetInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnPlan$ContactTargetInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `isEssential` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-essential` |
"
  [^CfnPlan$ContactTargetInfoProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :contact-id)]
    (. builder contactId data))
  (when-let [data (lookup-entry config id :is-essential)]
    (. builder isEssential data))
  (.build builder))


(defn cfn-plan-contact-target-info-property-builder
  "Creates a  `CfnPlan$ContactTargetInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plan-contact-target-info-property-builder (new CfnPlan$ContactTargetInfoProperty$Builder) id config))


(defn build-cfn-plan-props-builder
  "The build-cfn-plan-props-builder function updates a CfnPlanProps$Builder instance using the provided configuration.
  The function takes the CfnPlanProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactId` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-id` |
| `rotationIds` | java.util.List | [[cdk.support/lookup-entry]] | `:rotation-ids` |
| `stages` | java.util.List | [[cdk.support/lookup-entry]] | `:stages` |
"
  [^CfnPlanProps$Builder builder id config]
  (when-let [data (lookup-entry config id :contact-id)]
    (. builder contactId data))
  (when-let [data (lookup-entry config id :rotation-ids)]
    (. builder rotationIds data))
  (when-let [data (lookup-entry config id :stages)]
    (. builder stages data))
  (.build builder))


(defn cfn-plan-props-builder
  "Creates a  `CfnPlanProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plan-props-builder (new CfnPlanProps$Builder) id config))


(defn build-cfn-plan-stage-property-builder
  "The build-cfn-plan-stage-property-builder function updates a CfnPlan$StageProperty$Builder instance using the provided configuration.
  The function takes the CfnPlan$StageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `durationInMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-minutes` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnPlan$StageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :duration-in-minutes)]
    (. builder durationInMinutes data))
  (when-let [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn cfn-plan-stage-property-builder
  "Creates a  `CfnPlan$StageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plan-stage-property-builder (new CfnPlan$StageProperty$Builder) id config))


(defn build-cfn-plan-targets-property-builder
  "The build-cfn-plan-targets-property-builder function updates a CfnPlan$TargetsProperty$Builder instance using the provided configuration.
  The function takes the CfnPlan$TargetsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channelTargetInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:channel-target-info` |
| `contactTargetInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contact-target-info` |
"
  [^CfnPlan$TargetsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :channel-target-info)]
    (. builder channelTargetInfo data))
  (when-let [data (lookup-entry config id :contact-target-info)]
    (. builder contactTargetInfo data))
  (.build builder))


(defn cfn-plan-targets-property-builder
  "Creates a  `CfnPlan$TargetsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-plan-targets-property-builder (new CfnPlan$TargetsProperty$Builder) id config))


(defn build-cfn-rotation-builder
  "The build-cfn-rotation-builder function updates a CfnRotation$Builder instance using the provided configuration.
  The function takes the CfnRotation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactIds` | java.util.List | [[cdk.support/lookup-entry]] | `:contact-ids` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recurrence` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recurrence` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone-id` |
"
  [^CfnRotation$Builder builder id config]
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
  (.build builder))


(defn cfn-rotation-builder
  "Creates a  `CfnRotation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-rotation-builder (CfnRotation$Builder/create scope (name id)) id config))


(defn build-cfn-rotation-coverage-time-property-builder
  "The build-cfn-rotation-coverage-time-property-builder function updates a CfnRotation$CoverageTimeProperty$Builder instance using the provided configuration.
  The function takes the CfnRotation$CoverageTimeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
"
  [^CfnRotation$CoverageTimeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :end-time)]
    (. builder endTime data))
  (when-let [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (.build builder))


(defn cfn-rotation-coverage-time-property-builder
  "Creates a  `CfnRotation$CoverageTimeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rotation-coverage-time-property-builder (new CfnRotation$CoverageTimeProperty$Builder) id config))


(defn build-cfn-rotation-monthly-setting-property-builder
  "The build-cfn-rotation-monthly-setting-property-builder function updates a CfnRotation$MonthlySettingProperty$Builder instance using the provided configuration.
  The function takes the CfnRotation$MonthlySettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfMonth` | java.lang.Number | [[cdk.support/lookup-entry]] | `:day-of-month` |
| `handOffTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:hand-off-time` |
"
  [^CfnRotation$MonthlySettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :day-of-month)]
    (. builder dayOfMonth data))
  (when-let [data (lookup-entry config id :hand-off-time)]
    (. builder handOffTime data))
  (.build builder))


(defn cfn-rotation-monthly-setting-property-builder
  "Creates a  `CfnRotation$MonthlySettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rotation-monthly-setting-property-builder (new CfnRotation$MonthlySettingProperty$Builder) id config))


(defn build-cfn-rotation-props-builder
  "The build-cfn-rotation-props-builder function updates a CfnRotationProps$Builder instance using the provided configuration.
  The function takes the CfnRotationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactIds` | java.util.List | [[cdk.support/lookup-entry]] | `:contact-ids` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `recurrence` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recurrence` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone-id` |
"
  [^CfnRotationProps$Builder builder id config]
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
  (.build builder))


(defn cfn-rotation-props-builder
  "Creates a  `CfnRotationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rotation-props-builder (new CfnRotationProps$Builder) id config))


(defn build-cfn-rotation-recurrence-settings-property-builder
  "The build-cfn-rotation-recurrence-settings-property-builder function updates a CfnRotation$RecurrenceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnRotation$RecurrenceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dailySettings` | java.util.List | [[cdk.support/lookup-entry]] | `:daily-settings` |
| `monthlySettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:monthly-settings` |
| `numberOfOnCalls` | java.lang.Number | [[cdk.support/lookup-entry]] | `:number-of-on-calls` |
| `recurrenceMultiplier` | java.lang.Number | [[cdk.support/lookup-entry]] | `:recurrence-multiplier` |
| `shiftCoverages` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:shift-coverages` |
| `weeklySettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:weekly-settings` |
"
  [^CfnRotation$RecurrenceSettingsProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-rotation-recurrence-settings-property-builder
  "Creates a  `CfnRotation$RecurrenceSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rotation-recurrence-settings-property-builder (new CfnRotation$RecurrenceSettingsProperty$Builder) id config))


(defn build-cfn-rotation-shift-coverage-property-builder
  "The build-cfn-rotation-shift-coverage-property-builder function updates a CfnRotation$ShiftCoverageProperty$Builder instance using the provided configuration.
  The function takes the CfnRotation$ShiftCoverageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coverageTimes` | java.util.List | [[cdk.support/lookup-entry]] | `:coverage-times` |
| `dayOfWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-week` |
"
  [^CfnRotation$ShiftCoverageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :coverage-times)]
    (. builder coverageTimes data))
  (when-let [data (lookup-entry config id :day-of-week)]
    (. builder dayOfWeek data))
  (.build builder))


(defn cfn-rotation-shift-coverage-property-builder
  "Creates a  `CfnRotation$ShiftCoverageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rotation-shift-coverage-property-builder (new CfnRotation$ShiftCoverageProperty$Builder) id config))


(defn build-cfn-rotation-weekly-setting-property-builder
  "The build-cfn-rotation-weekly-setting-property-builder function updates a CfnRotation$WeeklySettingProperty$Builder instance using the provided configuration.
  The function takes the CfnRotation$WeeklySettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dayOfWeek` | java.lang.String | [[cdk.support/lookup-entry]] | `:day-of-week` |
| `handOffTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:hand-off-time` |
"
  [^CfnRotation$WeeklySettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :day-of-week)]
    (. builder dayOfWeek data))
  (when-let [data (lookup-entry config id :hand-off-time)]
    (. builder handOffTime data))
  (.build builder))


(defn cfn-rotation-weekly-setting-property-builder
  "Creates a  `CfnRotation$WeeklySettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rotation-weekly-setting-property-builder (new CfnRotation$WeeklySettingProperty$Builder) id config))