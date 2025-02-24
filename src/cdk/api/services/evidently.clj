(ns cdk.api.services.evidently
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.evidently package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.evidently CfnExperiment$Builder
                                                      CfnExperiment$MetricGoalObjectProperty$Builder
                                                      CfnExperiment$OnlineAbConfigObjectProperty$Builder
                                                      CfnExperiment$RunningStatusObjectProperty$Builder
                                                      CfnExperiment$TreatmentObjectProperty$Builder
                                                      CfnExperiment$TreatmentToWeightProperty$Builder
                                                      CfnExperimentProps$Builder
                                                      CfnFeature$Builder
                                                      CfnFeature$EntityOverrideProperty$Builder
                                                      CfnFeature$VariationObjectProperty$Builder
                                                      CfnFeatureProps$Builder
                                                      CfnLaunch$Builder
                                                      CfnLaunch$ExecutionStatusObjectProperty$Builder
                                                      CfnLaunch$GroupToWeightProperty$Builder
                                                      CfnLaunch$LaunchGroupObjectProperty$Builder
                                                      CfnLaunch$MetricDefinitionObjectProperty$Builder
                                                      CfnLaunch$SegmentOverrideProperty$Builder
                                                      CfnLaunch$StepConfigProperty$Builder
                                                      CfnLaunchProps$Builder
                                                      CfnProject$AppConfigResourceObjectProperty$Builder
                                                      CfnProject$Builder
                                                      CfnProject$DataDeliveryObjectProperty$Builder
                                                      CfnProject$S3DestinationProperty$Builder
                                                      CfnProjectProps$Builder
                                                      CfnSegment$Builder
                                                      CfnSegmentProps$Builder]))


(defn build-cfn-experiment-builder
  "The build-cfn-experiment-builder function updates a CfnExperiment$Builder instance using the provided configuration.
  The function takes the CfnExperiment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `metricGoals` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:metric-goals` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `onlineAbConfig` | software.amazon.awscdk.services.evidently.CfnExperiment$OnlineAbConfigObjectProperty | [[cdk.support/lookup-entry]] | `:online-ab-config` |
| `project` | java.lang.String | [[cdk.support/lookup-entry]] | `:project` |
| `randomizationSalt` | java.lang.String | [[cdk.support/lookup-entry]] | `:randomization-salt` |
| `removeSegment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-segment` |
| `runningStatus` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:running-status` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |
| `segment` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `treatments` | java.util.List | [[cdk.support/lookup-entry]] | `:treatments` |
"
  [^CfnExperiment$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :metric-goals)]
    (. builder metricGoals data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :online-ab-config)]
    (. builder onlineAbConfig data))
  (when-let [data (lookup-entry config id :project)]
    (. builder project data))
  (when-let [data (lookup-entry config id :randomization-salt)]
    (. builder randomizationSalt data))
  (when-let [data (lookup-entry config id :remove-segment)]
    (. builder removeSegment data))
  (when-let [data (lookup-entry config id :running-status)]
    (. builder runningStatus data))
  (when-let [data (lookup-entry config id :sampling-rate)]
    (. builder samplingRate data))
  (when-let [data (lookup-entry config id :segment)]
    (. builder segment data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :treatments)]
    (. builder treatments data))
  (.build builder))


(defn cfn-experiment-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-experiment-builder (CfnExperiment$Builder/create scope (name id)) id config))


(defn build-cfn-experiment-metric-goal-object-property-builder
  "The build-cfn-experiment-metric-goal-object-property-builder function updates a CfnExperiment$MetricGoalObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnExperiment$MetricGoalObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredChange` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-change` |
| `entityIdKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id-key` |
| `eventPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `unitLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-label` |
| `valueKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-key` |
"
  [^CfnExperiment$MetricGoalObjectProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :desired-change)]
    (. builder desiredChange data))
  (when-let [data (lookup-entry config id :entity-id-key)]
    (. builder entityIdKey data))
  (when-let [data (lookup-entry config id :event-pattern)]
    (. builder eventPattern data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :unit-label)]
    (. builder unitLabel data))
  (when-let [data (lookup-entry config id :value-key)]
    (. builder valueKey data))
  (.build builder))


(defn cfn-experiment-metric-goal-object-property-builder
  ""
  [id config]
  (build-cfn-experiment-metric-goal-object-property-builder (new CfnExperiment$MetricGoalObjectProperty$Builder) id config))


(defn build-cfn-experiment-online-ab-config-object-property-builder
  "The build-cfn-experiment-online-ab-config-object-property-builder function updates a CfnExperiment$OnlineAbConfigObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnExperiment$OnlineAbConfigObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `controlTreatmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-treatment-name` |
| `treatmentWeights` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:treatment-weights` |
"
  [^CfnExperiment$OnlineAbConfigObjectProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :control-treatment-name)]
    (. builder controlTreatmentName data))
  (when-let [data (lookup-entry config id :treatment-weights)]
    (. builder treatmentWeights data))
  (.build builder))


(defn cfn-experiment-online-ab-config-object-property-builder
  ""
  [id config]
  (build-cfn-experiment-online-ab-config-object-property-builder (new CfnExperiment$OnlineAbConfigObjectProperty$Builder) id config))


(defn build-cfn-experiment-props-builder
  "The build-cfn-experiment-props-builder function updates a CfnExperimentProps$Builder instance using the provided configuration.
  The function takes the CfnExperimentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `metricGoals` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-goals` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `onlineAbConfig` | software.amazon.awscdk.services.evidently.CfnExperiment$OnlineAbConfigObjectProperty | [[cdk.support/lookup-entry]] | `:online-ab-config` |
| `project` | java.lang.String | [[cdk.support/lookup-entry]] | `:project` |
| `randomizationSalt` | java.lang.String | [[cdk.support/lookup-entry]] | `:randomization-salt` |
| `removeSegment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remove-segment` |
| `runningStatus` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:running-status` |
| `samplingRate` | java.lang.Number | [[cdk.support/lookup-entry]] | `:sampling-rate` |
| `segment` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `treatments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:treatments` |
"
  [^CfnExperimentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :metric-goals)]
    (. builder metricGoals data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :online-ab-config)]
    (. builder onlineAbConfig data))
  (when-let [data (lookup-entry config id :project)]
    (. builder project data))
  (when-let [data (lookup-entry config id :randomization-salt)]
    (. builder randomizationSalt data))
  (when-let [data (lookup-entry config id :remove-segment)]
    (. builder removeSegment data))
  (when-let [data (lookup-entry config id :running-status)]
    (. builder runningStatus data))
  (when-let [data (lookup-entry config id :sampling-rate)]
    (. builder samplingRate data))
  (when-let [data (lookup-entry config id :segment)]
    (. builder segment data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :treatments)]
    (. builder treatments data))
  (.build builder))


(defn cfn-experiment-props-builder
  ""
  [id config]
  (build-cfn-experiment-props-builder (new CfnExperimentProps$Builder) id config))


(defn build-cfn-experiment-running-status-object-property-builder
  "The build-cfn-experiment-running-status-object-property-builder function updates a CfnExperiment$RunningStatusObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnExperiment$RunningStatusObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analysisCompleteTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:analysis-complete-time` |
| `desiredState` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-state` |
| `reason` | java.lang.String | [[cdk.support/lookup-entry]] | `:reason` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnExperiment$RunningStatusObjectProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :analysis-complete-time)]
    (. builder analysisCompleteTime data))
  (when-let [data (lookup-entry config id :desired-state)]
    (. builder desiredState data))
  (when-let [data (lookup-entry config id :reason)]
    (. builder reason data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-experiment-running-status-object-property-builder
  ""
  [id config]
  (build-cfn-experiment-running-status-object-property-builder (new CfnExperiment$RunningStatusObjectProperty$Builder) id config))


(defn build-cfn-experiment-treatment-object-property-builder
  "The build-cfn-experiment-treatment-object-property-builder function updates a CfnExperiment$TreatmentObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnExperiment$TreatmentObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `feature` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature` |
| `treatmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-name` |
| `variation` | java.lang.String | [[cdk.support/lookup-entry]] | `:variation` |
"
  [^CfnExperiment$TreatmentObjectProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :feature)]
    (. builder feature data))
  (when-let [data (lookup-entry config id :treatment-name)]
    (. builder treatmentName data))
  (when-let [data (lookup-entry config id :variation)]
    (. builder variation data))
  (.build builder))


(defn cfn-experiment-treatment-object-property-builder
  ""
  [id config]
  (build-cfn-experiment-treatment-object-property-builder (new CfnExperiment$TreatmentObjectProperty$Builder) id config))


(defn build-cfn-experiment-treatment-to-weight-property-builder
  "The build-cfn-experiment-treatment-to-weight-property-builder function updates a CfnExperiment$TreatmentToWeightProperty$Builder instance using the provided configuration.
  The function takes the CfnExperiment$TreatmentToWeightProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `splitWeight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:split-weight` |
| `treatment` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment` |
"
  [^CfnExperiment$TreatmentToWeightProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :split-weight)]
    (. builder splitWeight data))
  (when-let [data (lookup-entry config id :treatment)]
    (. builder treatment data))
  (.build builder))


(defn cfn-experiment-treatment-to-weight-property-builder
  ""
  [id config]
  (build-cfn-experiment-treatment-to-weight-property-builder (new CfnExperiment$TreatmentToWeightProperty$Builder) id config))


(defn build-cfn-feature-builder
  "The build-cfn-feature-builder function updates a CfnFeature$Builder instance using the provided configuration.
  The function takes the CfnFeature$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultVariation` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-variation` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:entity-overrides` |
| `evaluationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-strategy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `project` | java.lang.String | [[cdk.support/lookup-entry]] | `:project` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variations` |
"
  [^CfnFeature$Builder builder id config]
  (when-let [data (lookup-entry config id :default-variation)]
    (. builder defaultVariation data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :entity-overrides)]
    (. builder entityOverrides data))
  (when-let [data (lookup-entry config id :evaluation-strategy)]
    (. builder evaluationStrategy data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :project)]
    (. builder project data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variations)]
    (. builder variations data))
  (.build builder))


(defn cfn-feature-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-feature-builder (CfnFeature$Builder/create scope (name id)) id config))


(defn build-cfn-feature-entity-override-property-builder
  "The build-cfn-feature-entity-override-property-builder function updates a CfnFeature$EntityOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnFeature$EntityOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id` |
| `variation` | java.lang.String | [[cdk.support/lookup-entry]] | `:variation` |
"
  [^CfnFeature$EntityOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :entity-id)]
    (. builder entityId data))
  (when-let [data (lookup-entry config id :variation)]
    (. builder variation data))
  (.build builder))


(defn cfn-feature-entity-override-property-builder
  ""
  [id config]
  (build-cfn-feature-entity-override-property-builder (new CfnFeature$EntityOverrideProperty$Builder) id config))


(defn build-cfn-feature-props-builder
  "The build-cfn-feature-props-builder function updates a CfnFeatureProps$Builder instance using the provided configuration.
  The function takes the CfnFeatureProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultVariation` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-variation` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:entity-overrides` |
| `evaluationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-strategy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `project` | java.lang.String | [[cdk.support/lookup-entry]] | `:project` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variations` | java.util.List | [[cdk.support/lookup-entry]] | `:variations` |
"
  [^CfnFeatureProps$Builder builder id config]
  (when-let [data (lookup-entry config id :default-variation)]
    (. builder defaultVariation data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :entity-overrides)]
    (. builder entityOverrides data))
  (when-let [data (lookup-entry config id :evaluation-strategy)]
    (. builder evaluationStrategy data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :project)]
    (. builder project data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variations)]
    (. builder variations data))
  (.build builder))


(defn cfn-feature-props-builder
  ""
  [id config]
  (build-cfn-feature-props-builder (new CfnFeatureProps$Builder) id config))


(defn build-cfn-feature-variation-object-property-builder
  "The build-cfn-feature-variation-object-property-builder function updates a CfnFeature$VariationObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnFeature$VariationObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:double-value` |
| `longValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:long-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
| `variationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variation-name` |
"
  [^CfnFeature$VariationObjectProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :boolean-value)]
    (. builder booleanValue data))
  (when-let [data (lookup-entry config id :double-value)]
    (. builder doubleValue data))
  (when-let [data (lookup-entry config id :long-value)]
    (. builder longValue data))
  (when-let [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (when-let [data (lookup-entry config id :variation-name)]
    (. builder variationName data))
  (.build builder))


(defn cfn-feature-variation-object-property-builder
  ""
  [id config]
  (build-cfn-feature-variation-object-property-builder (new CfnFeature$VariationObjectProperty$Builder) id config))


(defn build-cfn-launch-builder
  "The build-cfn-launch-builder function updates a CfnLaunch$Builder instance using the provided configuration.
  The function takes the CfnLaunch$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionStatus` | software.amazon.awscdk.services.evidently.CfnLaunch$ExecutionStatusObjectProperty | [[cdk.support/lookup-entry]] | `:execution-status` |
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `metricMonitors` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-monitors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `project` | java.lang.String | [[cdk.support/lookup-entry]] | `:project` |
| `randomizationSalt` | java.lang.String | [[cdk.support/lookup-entry]] | `:randomization-salt` |
| `scheduledSplitsConfig` | java.util.List | [[cdk.support/lookup-entry]] | `:scheduled-splits-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLaunch$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :execution-status)]
    (. builder executionStatus data))
  (when-let [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-let [data (lookup-entry config id :metric-monitors)]
    (. builder metricMonitors data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :project)]
    (. builder project data))
  (when-let [data (lookup-entry config id :randomization-salt)]
    (. builder randomizationSalt data))
  (when-let [data (lookup-entry config id :scheduled-splits-config)]
    (. builder scheduledSplitsConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-launch-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-launch-builder (CfnLaunch$Builder/create scope (name id)) id config))


(defn build-cfn-launch-execution-status-object-property-builder
  "The build-cfn-launch-execution-status-object-property-builder function updates a CfnLaunch$ExecutionStatusObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnLaunch$ExecutionStatusObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredState` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-state` |
| `reason` | java.lang.String | [[cdk.support/lookup-entry]] | `:reason` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnLaunch$ExecutionStatusObjectProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :desired-state)]
    (. builder desiredState data))
  (when-let [data (lookup-entry config id :reason)]
    (. builder reason data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-launch-execution-status-object-property-builder
  ""
  [id config]
  (build-cfn-launch-execution-status-object-property-builder (new CfnLaunch$ExecutionStatusObjectProperty$Builder) id config))


(defn build-cfn-launch-group-to-weight-property-builder
  "The build-cfn-launch-group-to-weight-property-builder function updates a CfnLaunch$GroupToWeightProperty$Builder instance using the provided configuration.
  The function takes the CfnLaunch$GroupToWeightProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `splitWeight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:split-weight` |
"
  [^CfnLaunch$GroupToWeightProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-let [data (lookup-entry config id :split-weight)]
    (. builder splitWeight data))
  (.build builder))


(defn cfn-launch-group-to-weight-property-builder
  ""
  [id config]
  (build-cfn-launch-group-to-weight-property-builder (new CfnLaunch$GroupToWeightProperty$Builder) id config))


(defn build-cfn-launch-launch-group-object-property-builder
  "The build-cfn-launch-launch-group-object-property-builder function updates a CfnLaunch$LaunchGroupObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnLaunch$LaunchGroupObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `feature` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `variation` | java.lang.String | [[cdk.support/lookup-entry]] | `:variation` |
"
  [^CfnLaunch$LaunchGroupObjectProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :feature)]
    (. builder feature data))
  (when-let [data (lookup-entry config id :group-name)]
    (. builder groupName data))
  (when-let [data (lookup-entry config id :variation)]
    (. builder variation data))
  (.build builder))


(defn cfn-launch-launch-group-object-property-builder
  ""
  [id config]
  (build-cfn-launch-launch-group-object-property-builder (new CfnLaunch$LaunchGroupObjectProperty$Builder) id config))


(defn build-cfn-launch-metric-definition-object-property-builder
  "The build-cfn-launch-metric-definition-object-property-builder function updates a CfnLaunch$MetricDefinitionObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnLaunch$MetricDefinitionObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entityIdKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id-key` |
| `eventPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `unitLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-label` |
| `valueKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-key` |
"
  [^CfnLaunch$MetricDefinitionObjectProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :entity-id-key)]
    (. builder entityIdKey data))
  (when-let [data (lookup-entry config id :event-pattern)]
    (. builder eventPattern data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :unit-label)]
    (. builder unitLabel data))
  (when-let [data (lookup-entry config id :value-key)]
    (. builder valueKey data))
  (.build builder))


(defn cfn-launch-metric-definition-object-property-builder
  ""
  [id config]
  (build-cfn-launch-metric-definition-object-property-builder (new CfnLaunch$MetricDefinitionObjectProperty$Builder) id config))


(defn build-cfn-launch-props-builder
  "The build-cfn-launch-props-builder function updates a CfnLaunchProps$Builder instance using the provided configuration.
  The function takes the CfnLaunchProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `executionStatus` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:execution-status` |
| `groups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:groups` |
| `metricMonitors` | java.util.List | [[cdk.support/lookup-entry]] | `:metric-monitors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `project` | java.lang.String | [[cdk.support/lookup-entry]] | `:project` |
| `randomizationSalt` | java.lang.String | [[cdk.support/lookup-entry]] | `:randomization-salt` |
| `scheduledSplitsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scheduled-splits-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLaunchProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :execution-status)]
    (. builder executionStatus data))
  (when-let [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-let [data (lookup-entry config id :metric-monitors)]
    (. builder metricMonitors data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :project)]
    (. builder project data))
  (when-let [data (lookup-entry config id :randomization-salt)]
    (. builder randomizationSalt data))
  (when-let [data (lookup-entry config id :scheduled-splits-config)]
    (. builder scheduledSplitsConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-launch-props-builder
  ""
  [id config]
  (build-cfn-launch-props-builder (new CfnLaunchProps$Builder) id config))


(defn build-cfn-launch-segment-override-property-builder
  "The build-cfn-launch-segment-override-property-builder function updates a CfnLaunch$SegmentOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnLaunch$SegmentOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `evaluationOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-order` |
| `segment` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment` |
| `weights` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:weights` |
"
  [^CfnLaunch$SegmentOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :evaluation-order)]
    (. builder evaluationOrder data))
  (when-let [data (lookup-entry config id :segment)]
    (. builder segment data))
  (when-let [data (lookup-entry config id :weights)]
    (. builder weights data))
  (.build builder))


(defn cfn-launch-segment-override-property-builder
  ""
  [id config]
  (build-cfn-launch-segment-override-property-builder (new CfnLaunch$SegmentOverrideProperty$Builder) id config))


(defn build-cfn-launch-step-config-property-builder
  "The build-cfn-launch-step-config-property-builder function updates a CfnLaunch$StepConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnLaunch$StepConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupWeights` | java.util.List | [[cdk.support/lookup-entry]] | `:group-weights` |
| `segmentOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:segment-overrides` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
"
  [^CfnLaunch$StepConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :group-weights)]
    (. builder groupWeights data))
  (when-let [data (lookup-entry config id :segment-overrides)]
    (. builder segmentOverrides data))
  (when-let [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (.build builder))


(defn cfn-launch-step-config-property-builder
  ""
  [id config]
  (build-cfn-launch-step-config-property-builder (new CfnLaunch$StepConfigProperty$Builder) id config))


(defn build-cfn-project-app-config-resource-object-property-builder
  "The build-cfn-project-app-config-resource-object-property-builder function updates a CfnProject$AppConfigResourceObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$AppConfigResourceObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `environmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-id` |
"
  [^CfnProject$AppConfigResourceObjectProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :environment-id)]
    (. builder environmentId data))
  (.build builder))


(defn cfn-project-app-config-resource-object-property-builder
  ""
  [id config]
  (build-cfn-project-app-config-resource-object-property-builder (new CfnProject$AppConfigResourceObjectProperty$Builder) id config))


(defn build-cfn-project-builder
  "The build-cfn-project-builder function updates a CfnProject$Builder instance using the provided configuration.
  The function takes the CfnProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appConfigResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:app-config-resource` |
| `dataDelivery` | software.amazon.awscdk.services.evidently.CfnProject$DataDeliveryObjectProperty | [[cdk.support/lookup-entry]] | `:data-delivery` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProject$Builder builder id config]
  (when-let [data (lookup-entry config id :app-config-resource)]
    (. builder appConfigResource data))
  (when-let [data (lookup-entry config id :data-delivery)]
    (. builder dataDelivery data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-project-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-project-builder (CfnProject$Builder/create scope (name id)) id config))


(defn build-cfn-project-data-delivery-object-property-builder
  "The build-cfn-project-data-delivery-object-property-builder function updates a CfnProject$DataDeliveryObjectProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$DataDeliveryObjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |
| `s3` | software.amazon.awscdk.services.evidently.CfnProject$S3DestinationProperty | [[cdk.support/lookup-entry]] | `:s3` |
"
  [^CfnProject$DataDeliveryObjectProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-group)]
    (. builder logGroup data))
  (when-let [data (lookup-entry config id :s3)]
    (. builder s3 data))
  (.build builder))


(defn cfn-project-data-delivery-object-property-builder
  ""
  [id config]
  (build-cfn-project-data-delivery-object-property-builder (new CfnProject$DataDeliveryObjectProperty$Builder) id config))


(defn build-cfn-project-props-builder
  "The build-cfn-project-props-builder function updates a CfnProjectProps$Builder instance using the provided configuration.
  The function takes the CfnProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appConfigResource` | software.amazon.awscdk.services.evidently.CfnProject$AppConfigResourceObjectProperty | [[cdk.support/lookup-entry]] | `:app-config-resource` |
| `dataDelivery` | software.amazon.awscdk.services.evidently.CfnProject$DataDeliveryObjectProperty | [[cdk.support/lookup-entry]] | `:data-delivery` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProjectProps$Builder builder id config]
  (when-let [data (lookup-entry config id :app-config-resource)]
    (. builder appConfigResource data))
  (when-let [data (lookup-entry config id :data-delivery)]
    (. builder dataDelivery data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-project-props-builder
  ""
  [id config]
  (build-cfn-project-props-builder (new CfnProjectProps$Builder) id config))


(defn build-cfn-project-s3-destination-property-builder
  "The build-cfn-project-s3-destination-property-builder function updates a CfnProject$S3DestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnProject$S3DestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
"
  [^CfnProject$S3DestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-let [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (.build builder))


(defn cfn-project-s3-destination-property-builder
  ""
  [id config]
  (build-cfn-project-s3-destination-property-builder (new CfnProject$S3DestinationProperty$Builder) id config))


(defn build-cfn-segment-builder
  "The build-cfn-segment-builder function updates a CfnSegment$Builder instance using the provided configuration.
  The function takes the CfnSegment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSegment$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-segment-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-segment-builder (CfnSegment$Builder/create scope (name id)) id config))


(defn build-cfn-segment-props-builder
  "The build-cfn-segment-props-builder function updates a CfnSegmentProps$Builder instance using the provided configuration.
  The function takes the CfnSegmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSegmentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-segment-props-builder
  ""
  [id config]
  (build-cfn-segment-props-builder (new CfnSegmentProps$Builder) id config))