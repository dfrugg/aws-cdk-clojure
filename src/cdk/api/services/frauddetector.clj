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


(defn cfn-detector-builder
  "The cfn-detector-builder function buildes out new instances of 
CfnDetector$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedModels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:associated-models` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `detectorVersionStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-version-status` |
| `eventType` | software.amazon.awscdk.services.frauddetector.CfnDetector$EventTypeProperty | [[cdk.support/lookup-entry]] | `:event-type` |
| `ruleExecutionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-execution-mode` |
| `rules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDetector$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-detector-entity-type-property-builder
  "The cfn-detector-entity-type-property-builder function buildes out new instances of 
CfnDetector$EntityTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDetector$EntityTypeProperty$Builder.)]
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
    (.build builder)))


(defn cfn-detector-event-type-property-builder
  "The cfn-detector-event-type-property-builder function buildes out new instances of 
CfnDetector$EventTypeProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDetector$EventTypeProperty$Builder.)]
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
    (.build builder)))


(defn cfn-detector-event-variable-property-builder
  "The cfn-detector-event-variable-property-builder function buildes out new instances of 
CfnDetector$EventVariableProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |"
  [stack id config]
  (let [builder (CfnDetector$EventVariableProperty$Builder.)]
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
    (.build builder)))


(defn cfn-detector-label-property-builder
  "The cfn-detector-label-property-builder function buildes out new instances of 
CfnDetector$LabelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDetector$LabelProperty$Builder.)]
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
    (.build builder)))


(defn cfn-detector-model-property-builder
  "The cfn-detector-model-property-builder function buildes out new instances of 
CfnDetector$ModelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnDetector$ModelProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-detector-outcome-property-builder
  "The cfn-detector-outcome-property-builder function buildes out new instances of 
CfnDetector$OutcomeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDetector$OutcomeProperty$Builder.)]
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
    (.build builder)))


(defn cfn-detector-props-builder
  "The cfn-detector-props-builder function buildes out new instances of 
CfnDetectorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associatedModels` | java.util.List | [[cdk.support/lookup-entry]] | `:associated-models` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `detectorId` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-id` |
| `detectorVersionStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:detector-version-status` |
| `eventType` | software.amazon.awscdk.services.frauddetector.CfnDetector$EventTypeProperty | [[cdk.support/lookup-entry]] | `:event-type` |
| `ruleExecutionMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-execution-mode` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDetectorProps$Builder.)]
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
    (.build builder)))


(defn cfn-detector-rule-property-builder
  "The cfn-detector-rule-property-builder function buildes out new instances of 
CfnDetector$RuleProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDetector$RuleProperty$Builder.)]
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
    (.build builder)))


(defn cfn-entity-type-builder
  "The cfn-entity-type-builder function buildes out new instances of 
CfnEntityType$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEntityType$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-entity-type-props-builder
  "The cfn-entity-type-props-builder function buildes out new instances of 
CfnEntityTypeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEntityTypeProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-event-type-builder
  "The cfn-event-type-builder function buildes out new instances of 
CfnEventType$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:entity-types` |
| `eventVariables` | java.util.List | [[cdk.support/lookup-entry]] | `:event-variables` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventType$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-event-type-entity-type-property-builder
  "The cfn-event-type-entity-type-property-builder function buildes out new instances of 
CfnEventType$EntityTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventType$EntityTypeProperty$Builder.)]
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
    (.build builder)))


(defn cfn-event-type-event-variable-property-builder
  "The cfn-event-type-event-variable-property-builder function buildes out new instances of 
CfnEventType$EventVariableProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |"
  [stack id config]
  (let [builder (CfnEventType$EventVariableProperty$Builder.)]
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
    (.build builder)))


(defn cfn-event-type-label-property-builder
  "The cfn-event-type-label-property-builder function buildes out new instances of 
CfnEventType$LabelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `createdTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-time` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inline` |
| `lastUpdatedTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-updated-time` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventType$LabelProperty$Builder.)]
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
    (.build builder)))


(defn cfn-event-type-props-builder
  "The cfn-event-type-props-builder function buildes out new instances of 
CfnEventTypeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:entity-types` |
| `eventVariables` | java.util.List | [[cdk.support/lookup-entry]] | `:event-variables` |
| `labels` | java.util.List | [[cdk.support/lookup-entry]] | `:labels` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEventTypeProps$Builder.)]
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
    (.build builder)))


(defn cfn-label-builder
  "The cfn-label-builder function buildes out new instances of 
CfnLabel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLabel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-label-props-builder
  "The cfn-label-props-builder function buildes out new instances of 
CfnLabelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLabelProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-list-builder
  "The cfn-list-builder function buildes out new instances of 
CfnList$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `elements` | java.util.List | [[cdk.support/lookup-entry]] | `:elements` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |"
  [stack id config]
  (let [builder (CfnList$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-list-props-builder
  "The cfn-list-props-builder function buildes out new instances of 
CfnListProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `elements` | java.util.List | [[cdk.support/lookup-entry]] | `:elements` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |"
  [stack id config]
  (let [builder (CfnListProps$Builder.)]
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
    (.build builder)))


(defn cfn-outcome-builder
  "The cfn-outcome-builder function buildes out new instances of 
CfnOutcome$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnOutcome$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-outcome-props-builder
  "The cfn-outcome-props-builder function buildes out new instances of 
CfnOutcomeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnOutcomeProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-variable-builder
  "The cfn-variable-builder function buildes out new instances of 
CfnVariable$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |"
  [stack id config]
  (let [builder (CfnVariable$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-variable-props-builder
  "The cfn-variable-props-builder function buildes out new instances of 
CfnVariableProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `variableType` | java.lang.String | [[cdk.support/lookup-entry]] | `:variable-type` |"
  [stack id config]
  (let [builder (CfnVariableProps$Builder.)]
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
    (.build builder)))