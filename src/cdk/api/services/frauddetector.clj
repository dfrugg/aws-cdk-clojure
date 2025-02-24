(ns cdk.api.services.frauddetector
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.frauddetector package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.frauddetector CfnDetector$Builder
                                                          CfnDetector$EntityTypeProperty$Builder
                                                          CfnDetector$EventTypeProperty$Builder
                                                          CfnDetector$EventVariableProperty$Builder
                                                          CfnDetector$LabelProperty$Builder
                                                          CfnDetector$ModelProperty$Builder
                                                          CfnDetector$OutcomeProperty$Builder
                                                          CfnDetector$RuleProperty$Builder
                                                          CfnDetectorProps$Builder
                                                          CfnEntityType$Builder
                                                          CfnEntityTypeProps$Builder
                                                          CfnEventType$Builder
                                                          CfnEventType$EntityTypeProperty$Builder
                                                          CfnEventType$EventVariableProperty$Builder
                                                          CfnEventType$LabelProperty$Builder
                                                          CfnEventTypeProps$Builder
                                                          CfnLabel$Builder
                                                          CfnLabelProps$Builder
                                                          CfnList$Builder
                                                          CfnListProps$Builder
                                                          CfnOutcome$Builder
                                                          CfnOutcomeProps$Builder
                                                          CfnVariable$Builder
                                                          CfnVariableProps$Builder]))


(defn build-cfn-detector-builder
  "The build-cfn-detector-builder function updates a CfnDetector$Builder instance using the provided configuration.
  The function takes the CfnDetector$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedModels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:associated-models` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `detectorVersionStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-version-status` |
| `eventType` | software.amazon.awscdk.services.frauddetector.CfnDetector$EventTypeProperty | [[cdk.support/lookup-entry]] | `:event-type` |
| `ruleExecutionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-execution-mode` |
| `rules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDetector$Builder builder id config]
  (when-let [data (lookup-entry config id :associated-models)]
    (. builder associatedModels data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-let [data (lookup-entry config id :detector-version-status)]
    (. builder detectorVersionStatus data))
  (when-let [data (lookup-entry config id :event-type)]
    (. builder eventType data))
  (when-let [data (lookup-entry config id :rule-execution-mode)]
    (. builder ruleExecutionMode data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-detector-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-detector-builder (CfnDetector$Builder/create scope (name id)) id config))


(defn build-cfn-detector-entity-type-property-builder
  "The build-cfn-detector-entity-type-property-builder function updates a CfnDetector$EntityTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$EntityTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDetector$EntityTypeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :created-time)]
    (. builder createdTime data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :inline)]
    (. builder inline data))
  (when-let [data (lookup-entry config id :last-updated-time)]
    (. builder lastUpdatedTime data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-detector-entity-type-property-builder
  ""
  [id config]
  (build-cfn-detector-entity-type-property-builder (new CfnDetector$EntityTypeProperty$Builder) id config))


(defn build-cfn-detector-event-type-property-builder
  "The build-cfn-detector-event-type-property-builder function updates a CfnDetector$EventTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$EventTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:entity-types` |
| `eventVariables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-variables` |
| `inline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inline` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDetector$EventTypeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :created-time)]
    (. builder createdTime data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :entity-types)]
    (. builder entityTypes data))
  (when-let [data (lookup-entry config id :event-variables)]
    (. builder eventVariables data))
  (when-let [data (lookup-entry config id :inline)]
    (. builder inline data))
  (when-let [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-let [data (lookup-entry config id :last-updated-time)]
    (. builder lastUpdatedTime data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-detector-event-type-property-builder
  ""
  [id config]
  (build-cfn-detector-event-type-property-builder (new CfnDetector$EventTypeProperty$Builder) id config))


(defn build-cfn-detector-event-variable-property-builder
  "The build-cfn-detector-event-variable-property-builder function updates a CfnDetector$EventVariableProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$EventVariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |
"
  [^CfnDetector$EventVariableProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :created-time)]
    (. builder createdTime data))
  (when-let [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-let [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :inline)]
    (. builder inline data))
  (when-let [data (lookup-entry config id :last-updated-time)]
    (. builder lastUpdatedTime data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variable-type)]
    (. builder variableType data))
  (.build builder))


(defn cfn-detector-event-variable-property-builder
  ""
  [id config]
  (build-cfn-detector-event-variable-property-builder (new CfnDetector$EventVariableProperty$Builder) id config))


(defn build-cfn-detector-label-property-builder
  "The build-cfn-detector-label-property-builder function updates a CfnDetector$LabelProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$LabelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDetector$LabelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :created-time)]
    (. builder createdTime data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :inline)]
    (. builder inline data))
  (when-let [data (lookup-entry config id :last-updated-time)]
    (. builder lastUpdatedTime data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-detector-label-property-builder
  ""
  [id config]
  (build-cfn-detector-label-property-builder (new CfnDetector$LabelProperty$Builder) id config))


(defn build-cfn-detector-model-property-builder
  "The build-cfn-detector-model-property-builder function updates a CfnDetector$ModelProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$ModelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnDetector$ModelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-detector-model-property-builder
  ""
  [id config]
  (build-cfn-detector-model-property-builder (new CfnDetector$ModelProperty$Builder) id config))


(defn build-cfn-detector-outcome-property-builder
  "The build-cfn-detector-outcome-property-builder function updates a CfnDetector$OutcomeProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$OutcomeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDetector$OutcomeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :created-time)]
    (. builder createdTime data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :inline)]
    (. builder inline data))
  (when-let [data (lookup-entry config id :last-updated-time)]
    (. builder lastUpdatedTime data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-detector-outcome-property-builder
  ""
  [id config]
  (build-cfn-detector-outcome-property-builder (new CfnDetector$OutcomeProperty$Builder) id config))


(defn build-cfn-detector-props-builder
  "The build-cfn-detector-props-builder function updates a CfnDetectorProps$Builder instance using the provided configuration.
  The function takes the CfnDetectorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedModels` | java.util.List | [[cdk.support/lookup-entry]] | `:associated-models` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `detectorVersionStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-version-status` |
| `eventType` | software.amazon.awscdk.services.frauddetector.CfnDetector$EventTypeProperty | [[cdk.support/lookup-entry]] | `:event-type` |
| `ruleExecutionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-execution-mode` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDetectorProps$Builder builder id config]
  (when-let [data (lookup-entry config id :associated-models)]
    (. builder associatedModels data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-let [data (lookup-entry config id :detector-version-status)]
    (. builder detectorVersionStatus data))
  (when-let [data (lookup-entry config id :event-type)]
    (. builder eventType data))
  (when-let [data (lookup-entry config id :rule-execution-mode)]
    (. builder ruleExecutionMode data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-detector-props-builder
  ""
  [id config]
  (build-cfn-detector-props-builder (new CfnDetectorProps$Builder) id config))


(defn build-cfn-detector-rule-property-builder
  "The build-cfn-detector-rule-property-builder function updates a CfnDetector$RuleProperty$Builder instance using the provided configuration.
  The function takes the CfnDetector$RuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `language` | java.lang.String | [[cdk.support/lookup-entry]] | `:language` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `outcomes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outcomes` |
| `ruleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-id` |
| `ruleVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-version` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDetector$RuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :created-time)]
    (. builder createdTime data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :detector-id)]
    (. builder detectorId data))
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :language)]
    (. builder language data))
  (when-let [data (lookup-entry config id :last-updated-time)]
    (. builder lastUpdatedTime data))
  (when-let [data (lookup-entry config id :outcomes)]
    (. builder outcomes data))
  (when-let [data (lookup-entry config id :rule-id)]
    (. builder ruleId data))
  (when-let [data (lookup-entry config id :rule-version)]
    (. builder ruleVersion data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-detector-rule-property-builder
  ""
  [id config]
  (build-cfn-detector-rule-property-builder (new CfnDetector$RuleProperty$Builder) id config))


(defn build-cfn-entity-type-builder
  "The build-cfn-entity-type-builder function updates a CfnEntityType$Builder instance using the provided configuration.
  The function takes the CfnEntityType$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEntityType$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-entity-type-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-entity-type-builder (CfnEntityType$Builder/create scope (name id)) id config))


(defn build-cfn-entity-type-props-builder
  "The build-cfn-entity-type-props-builder function updates a CfnEntityTypeProps$Builder instance using the provided configuration.
  The function takes the CfnEntityTypeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEntityTypeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-entity-type-props-builder
  ""
  [id config]
  (build-cfn-entity-type-props-builder (new CfnEntityTypeProps$Builder) id config))


(defn build-cfn-event-type-builder
  "The build-cfn-event-type-builder function updates a CfnEventType$Builder instance using the provided configuration.
  The function takes the CfnEventType$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:entity-types` |
| `eventVariables` | java.util.List | [[cdk.support/lookup-entry]] | `:event-variables` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEventType$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :entity-types)]
    (. builder entityTypes data))
  (when-let [data (lookup-entry config id :event-variables)]
    (. builder eventVariables data))
  (when-let [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-event-type-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-event-type-builder (CfnEventType$Builder/create scope (name id)) id config))


(defn build-cfn-event-type-entity-type-property-builder
  "The build-cfn-event-type-entity-type-property-builder function updates a CfnEventType$EntityTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnEventType$EntityTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEventType$EntityTypeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :created-time)]
    (. builder createdTime data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :inline)]
    (. builder inline data))
  (when-let [data (lookup-entry config id :last-updated-time)]
    (. builder lastUpdatedTime data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-event-type-entity-type-property-builder
  ""
  [id config]
  (build-cfn-event-type-entity-type-property-builder (new CfnEventType$EntityTypeProperty$Builder) id config))


(defn build-cfn-event-type-event-variable-property-builder
  "The build-cfn-event-type-event-variable-property-builder function updates a CfnEventType$EventVariableProperty$Builder instance using the provided configuration.
  The function takes the CfnEventType$EventVariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |
"
  [^CfnEventType$EventVariableProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :created-time)]
    (. builder createdTime data))
  (when-let [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-let [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :inline)]
    (. builder inline data))
  (when-let [data (lookup-entry config id :last-updated-time)]
    (. builder lastUpdatedTime data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variable-type)]
    (. builder variableType data))
  (.build builder))


(defn cfn-event-type-event-variable-property-builder
  ""
  [id config]
  (build-cfn-event-type-event-variable-property-builder (new CfnEventType$EventVariableProperty$Builder) id config))


(defn build-cfn-event-type-label-property-builder
  "The build-cfn-event-type-label-property-builder function updates a CfnEventType$LabelProperty$Builder instance using the provided configuration.
  The function takes the CfnEventType$LabelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEventType$LabelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :created-time)]
    (. builder createdTime data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :inline)]
    (. builder inline data))
  (when-let [data (lookup-entry config id :last-updated-time)]
    (. builder lastUpdatedTime data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-event-type-label-property-builder
  ""
  [id config]
  (build-cfn-event-type-label-property-builder (new CfnEventType$LabelProperty$Builder) id config))


(defn build-cfn-event-type-props-builder
  "The build-cfn-event-type-props-builder function updates a CfnEventTypeProps$Builder instance using the provided configuration.
  The function takes the CfnEventTypeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:entity-types` |
| `eventVariables` | java.util.List | [[cdk.support/lookup-entry]] | `:event-variables` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEventTypeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :entity-types)]
    (. builder entityTypes data))
  (when-let [data (lookup-entry config id :event-variables)]
    (. builder eventVariables data))
  (when-let [data (lookup-entry config id :labels)]
    (. builder labels data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-event-type-props-builder
  ""
  [id config]
  (build-cfn-event-type-props-builder (new CfnEventTypeProps$Builder) id config))


(defn build-cfn-label-builder
  "The build-cfn-label-builder function updates a CfnLabel$Builder instance using the provided configuration.
  The function takes the CfnLabel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLabel$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-label-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-label-builder (CfnLabel$Builder/create scope (name id)) id config))


(defn build-cfn-label-props-builder
  "The build-cfn-label-props-builder function updates a CfnLabelProps$Builder instance using the provided configuration.
  The function takes the CfnLabelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnLabelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-label-props-builder
  ""
  [id config]
  (build-cfn-label-props-builder (new CfnLabelProps$Builder) id config))


(defn build-cfn-list-builder
  "The build-cfn-list-builder function updates a CfnList$Builder instance using the provided configuration.
  The function takes the CfnList$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `elements` | java.util.List | [[cdk.support/lookup-entry]] | `:elements` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |
"
  [^CfnList$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :elements)]
    (. builder elements data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variable-type)]
    (. builder variableType data))
  (.build builder))


(defn cfn-list-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-list-builder (CfnList$Builder/create scope (name id)) id config))


(defn build-cfn-list-props-builder
  "The build-cfn-list-props-builder function updates a CfnListProps$Builder instance using the provided configuration.
  The function takes the CfnListProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `elements` | java.util.List | [[cdk.support/lookup-entry]] | `:elements` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |
"
  [^CfnListProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :elements)]
    (. builder elements data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variable-type)]
    (. builder variableType data))
  (.build builder))


(defn cfn-list-props-builder
  ""
  [id config]
  (build-cfn-list-props-builder (new CfnListProps$Builder) id config))


(defn build-cfn-outcome-builder
  "The build-cfn-outcome-builder function updates a CfnOutcome$Builder instance using the provided configuration.
  The function takes the CfnOutcome$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnOutcome$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-outcome-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-outcome-builder (CfnOutcome$Builder/create scope (name id)) id config))


(defn build-cfn-outcome-props-builder
  "The build-cfn-outcome-props-builder function updates a CfnOutcomeProps$Builder instance using the provided configuration.
  The function takes the CfnOutcomeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnOutcomeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-outcome-props-builder
  ""
  [id config]
  (build-cfn-outcome-props-builder (new CfnOutcomeProps$Builder) id config))


(defn build-cfn-variable-builder
  "The build-cfn-variable-builder function updates a CfnVariable$Builder instance using the provided configuration.
  The function takes the CfnVariable$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |
"
  [^CfnVariable$Builder builder id config]
  (when-let [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-let [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variable-type)]
    (. builder variableType data))
  (.build builder))


(defn cfn-variable-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-variable-builder (CfnVariable$Builder/create scope (name id)) id config))


(defn build-cfn-variable-props-builder
  "The build-cfn-variable-props-builder function updates a CfnVariableProps$Builder instance using the provided configuration.
  The function takes the CfnVariableProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |
"
  [^CfnVariableProps$Builder builder id config]
  (when-let [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-let [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variable-type)]
    (. builder variableType data))
  (.build builder))


(defn cfn-variable-props-builder
  ""
  [id config]
  (build-cfn-variable-props-builder (new CfnVariableProps$Builder) id config))