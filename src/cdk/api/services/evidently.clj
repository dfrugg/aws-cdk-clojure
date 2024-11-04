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


(defn cfn-experiment-builder
  "The cfn-experiment-builder function buildes out new instances of 
CfnExperiment$Builder using the provided configuration.  Each field is set as follows:

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
| `treatments` | java.util.List | [[cdk.support/lookup-entry]] | `:treatments` |"
  [stack id config]
  (let [builder (CfnExperiment$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-experiment-metric-goal-object-property-builder
  "The cfn-experiment-metric-goal-object-property-builder function buildes out new instances of 
CfnExperiment$MetricGoalObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredChange` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-change` |
| `entityIdKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id-key` |
| `eventPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `unitLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-label` |
| `valueKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-key` |"
  [stack id config]
  (let [builder (CfnExperiment$MetricGoalObjectProperty$Builder.)]
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
    (.build builder)))


(defn cfn-experiment-online-ab-config-object-property-builder
  "The cfn-experiment-online-ab-config-object-property-builder function buildes out new instances of 
CfnExperiment$OnlineAbConfigObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `controlTreatmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-treatment-name` |
| `treatmentWeights` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:treatment-weights` |"
  [stack id config]
  (let [builder (CfnExperiment$OnlineAbConfigObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :control-treatment-name)]
      (. builder controlTreatmentName data))
    (when-let [data (lookup-entry config id :treatment-weights)]
      (. builder treatmentWeights data))
    (.build builder)))


(defn cfn-experiment-props-builder
  "The cfn-experiment-props-builder function buildes out new instances of 
CfnExperimentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `treatments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:treatments` |"
  [stack id config]
  (let [builder (CfnExperimentProps$Builder.)]
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
    (.build builder)))


(defn cfn-experiment-running-status-object-property-builder
  "The cfn-experiment-running-status-object-property-builder function buildes out new instances of 
CfnExperiment$RunningStatusObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `analysisCompleteTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:analysis-complete-time` |
| `desiredState` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-state` |
| `reason` | java.lang.String | [[cdk.support/lookup-entry]] | `:reason` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnExperiment$RunningStatusObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :analysis-complete-time)]
      (. builder analysisCompleteTime data))
    (when-let [data (lookup-entry config id :desired-state)]
      (. builder desiredState data))
    (when-let [data (lookup-entry config id :reason)]
      (. builder reason data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-experiment-treatment-object-property-builder
  "The cfn-experiment-treatment-object-property-builder function buildes out new instances of 
CfnExperiment$TreatmentObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `feature` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature` |
| `treatmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-name` |
| `variation` | java.lang.String | [[cdk.support/lookup-entry]] | `:variation` |"
  [stack id config]
  (let [builder (CfnExperiment$TreatmentObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :feature)]
      (. builder feature data))
    (when-let [data (lookup-entry config id :treatment-name)]
      (. builder treatmentName data))
    (when-let [data (lookup-entry config id :variation)]
      (. builder variation data))
    (.build builder)))


(defn cfn-experiment-treatment-to-weight-property-builder
  "The cfn-experiment-treatment-to-weight-property-builder function buildes out new instances of 
CfnExperiment$TreatmentToWeightProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `splitWeight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:split-weight` |
| `treatment` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment` |"
  [stack id config]
  (let [builder (CfnExperiment$TreatmentToWeightProperty$Builder.)]
    (when-let [data (lookup-entry config id :split-weight)]
      (. builder splitWeight data))
    (when-let [data (lookup-entry config id :treatment)]
      (. builder treatment data))
    (.build builder)))


(defn cfn-feature-builder
  "The cfn-feature-builder function buildes out new instances of 
CfnFeature$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultVariation` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-variation` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:entity-overrides` |
| `evaluationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-strategy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `project` | java.lang.String | [[cdk.support/lookup-entry]] | `:project` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variations` |"
  [stack id config]
  (let [builder (CfnFeature$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-feature-entity-override-property-builder
  "The cfn-feature-entity-override-property-builder function buildes out new instances of 
CfnFeature$EntityOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id` |
| `variation` | java.lang.String | [[cdk.support/lookup-entry]] | `:variation` |"
  [stack id config]
  (let [builder (CfnFeature$EntityOverrideProperty$Builder.)]
    (when-let [data (lookup-entry config id :entity-id)]
      (. builder entityId data))
    (when-let [data (lookup-entry config id :variation)]
      (. builder variation data))
    (.build builder)))


(defn cfn-feature-props-builder
  "The cfn-feature-props-builder function buildes out new instances of 
CfnFeatureProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultVariation` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-variation` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:entity-overrides` |
| `evaluationStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:evaluation-strategy` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `project` | java.lang.String | [[cdk.support/lookup-entry]] | `:project` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variations` | java.util.List | [[cdk.support/lookup-entry]] | `:variations` |"
  [stack id config]
  (let [builder (CfnFeatureProps$Builder.)]
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
    (.build builder)))


(defn cfn-feature-variation-object-property-builder
  "The cfn-feature-variation-object-property-builder function buildes out new instances of 
CfnFeature$VariationObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:double-value` |
| `longValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:long-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
| `variationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:variation-name` |"
  [stack id config]
  (let [builder (CfnFeature$VariationObjectProperty$Builder.)]
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
    (.build builder)))


(defn cfn-launch-builder
  "The cfn-launch-builder function buildes out new instances of 
CfnLaunch$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLaunch$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-launch-execution-status-object-property-builder
  "The cfn-launch-execution-status-object-property-builder function buildes out new instances of 
CfnLaunch$ExecutionStatusObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `desiredState` | java.lang.String | [[cdk.support/lookup-entry]] | `:desired-state` |
| `reason` | java.lang.String | [[cdk.support/lookup-entry]] | `:reason` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnLaunch$ExecutionStatusObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :desired-state)]
      (. builder desiredState data))
    (when-let [data (lookup-entry config id :reason)]
      (. builder reason data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-launch-group-to-weight-property-builder
  "The cfn-launch-group-to-weight-property-builder function buildes out new instances of 
CfnLaunch$GroupToWeightProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `splitWeight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:split-weight` |"
  [stack id config]
  (let [builder (CfnLaunch$GroupToWeightProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :split-weight)]
      (. builder splitWeight data))
    (.build builder)))


(defn cfn-launch-launch-group-object-property-builder
  "The cfn-launch-launch-group-object-property-builder function buildes out new instances of 
CfnLaunch$LaunchGroupObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `feature` | java.lang.String | [[cdk.support/lookup-entry]] | `:feature` |
| `groupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-name` |
| `variation` | java.lang.String | [[cdk.support/lookup-entry]] | `:variation` |"
  [stack id config]
  (let [builder (CfnLaunch$LaunchGroupObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :feature)]
      (. builder feature data))
    (when-let [data (lookup-entry config id :group-name)]
      (. builder groupName data))
    (when-let [data (lookup-entry config id :variation)]
      (. builder variation data))
    (.build builder)))


(defn cfn-launch-metric-definition-object-property-builder
  "The cfn-launch-metric-definition-object-property-builder function buildes out new instances of 
CfnLaunch$MetricDefinitionObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entityIdKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id-key` |
| `eventPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-pattern` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `unitLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-label` |
| `valueKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:value-key` |"
  [stack id config]
  (let [builder (CfnLaunch$MetricDefinitionObjectProperty$Builder.)]
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
    (.build builder)))


(defn cfn-launch-props-builder
  "The cfn-launch-props-builder function buildes out new instances of 
CfnLaunchProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLaunchProps$Builder.)]
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
    (.build builder)))


(defn cfn-launch-segment-override-property-builder
  "The cfn-launch-segment-override-property-builder function buildes out new instances of 
CfnLaunch$SegmentOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `evaluationOrder` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-order` |
| `segment` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment` |
| `weights` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:weights` |"
  [stack id config]
  (let [builder (CfnLaunch$SegmentOverrideProperty$Builder.)]
    (when-let [data (lookup-entry config id :evaluation-order)]
      (. builder evaluationOrder data))
    (when-let [data (lookup-entry config id :segment)]
      (. builder segment data))
    (when-let [data (lookup-entry config id :weights)]
      (. builder weights data))
    (.build builder)))


(defn cfn-launch-step-config-property-builder
  "The cfn-launch-step-config-property-builder function buildes out new instances of 
CfnLaunch$StepConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupWeights` | java.util.List | [[cdk.support/lookup-entry]] | `:group-weights` |
| `segmentOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:segment-overrides` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |"
  [stack id config]
  (let [builder (CfnLaunch$StepConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-weights)]
      (. builder groupWeights data))
    (when-let [data (lookup-entry config id :segment-overrides)]
      (. builder segmentOverrides data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (.build builder)))


(defn cfn-project-app-config-resource-object-property-builder
  "The cfn-project-app-config-resource-object-property-builder function buildes out new instances of 
CfnProject$AppConfigResourceObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `environmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-id` |"
  [stack id config]
  (let [builder (CfnProject$AppConfigResourceObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :environment-id)]
      (. builder environmentId data))
    (.build builder)))


(defn cfn-project-builder
  "The cfn-project-builder function buildes out new instances of 
CfnProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appConfigResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:app-config-resource` |
| `dataDelivery` | software.amazon.awscdk.services.evidently.CfnProject$DataDeliveryObjectProperty | [[cdk.support/lookup-entry]] | `:data-delivery` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProject$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-project-data-delivery-object-property-builder
  "The cfn-project-data-delivery-object-property-builder function buildes out new instances of 
CfnProject$DataDeliveryObjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-group` |
| `s3` | software.amazon.awscdk.services.evidently.CfnProject$S3DestinationProperty | [[cdk.support/lookup-entry]] | `:s3` |"
  [stack id config]
  (let [builder (CfnProject$DataDeliveryObjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-group)]
      (. builder logGroup data))
    (when-let [data (lookup-entry config id :s3)]
      (. builder s3 data))
    (.build builder)))


(defn cfn-project-props-builder
  "The cfn-project-props-builder function buildes out new instances of 
CfnProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appConfigResource` | software.amazon.awscdk.services.evidently.CfnProject$AppConfigResourceObjectProperty | [[cdk.support/lookup-entry]] | `:app-config-resource` |
| `dataDelivery` | software.amazon.awscdk.services.evidently.CfnProject$DataDeliveryObjectProperty | [[cdk.support/lookup-entry]] | `:data-delivery` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProjectProps$Builder.)]
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
    (.build builder)))


(defn cfn-project-s3-destination-property-builder
  "The cfn-project-s3-destination-property-builder function buildes out new instances of 
CfnProject$S3DestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnProject$S3DestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))


(defn cfn-segment-builder
  "The cfn-segment-builder function buildes out new instances of 
CfnSegment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSegment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-segment-props-builder
  "The cfn-segment-props-builder function buildes out new instances of 
CfnSegmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSegmentProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))