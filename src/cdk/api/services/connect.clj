(ns cdk.api.services.connect
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.connect package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.connect CfnApprovedOrigin$Builder
                                                    CfnApprovedOriginProps$Builder
                                                    CfnContactFlow$Builder
                                                    CfnContactFlowModule$Builder
                                                    CfnContactFlowModuleProps$Builder
                                                    CfnContactFlowProps$Builder
                                                    CfnEvaluationForm$Builder
                                                    CfnEvaluationForm$EvaluationFormBaseItemProperty$Builder
                                                    CfnEvaluationForm$EvaluationFormItemProperty$Builder
                                                    CfnEvaluationForm$EvaluationFormNumericQuestionAutomationProperty$Builder
                                                    CfnEvaluationForm$EvaluationFormNumericQuestionOptionProperty$Builder
                                                    CfnEvaluationForm$EvaluationFormNumericQuestionPropertiesProperty$Builder
                                                    CfnEvaluationForm$EvaluationFormQuestionProperty$Builder
                                                    CfnEvaluationForm$EvaluationFormQuestionTypePropertiesProperty$Builder
                                                    CfnEvaluationForm$EvaluationFormSectionProperty$Builder
                                                    CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationOptionProperty$Builder
                                                    CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationProperty$Builder
                                                    CfnEvaluationForm$EvaluationFormSingleSelectQuestionOptionProperty$Builder
                                                    CfnEvaluationForm$EvaluationFormSingleSelectQuestionPropertiesProperty$Builder
                                                    CfnEvaluationForm$NumericQuestionPropertyValueAutomationProperty$Builder
                                                    CfnEvaluationForm$ScoringStrategyProperty$Builder
                                                    CfnEvaluationForm$SingleSelectQuestionRuleCategoryAutomationProperty$Builder
                                                    CfnEvaluationFormProps$Builder
                                                    CfnHoursOfOperation$Builder
                                                    CfnHoursOfOperation$HoursOfOperationConfigProperty$Builder
                                                    CfnHoursOfOperation$HoursOfOperationTimeSliceProperty$Builder
                                                    CfnHoursOfOperationProps$Builder
                                                    CfnInstance$AttributesProperty$Builder
                                                    CfnInstance$Builder
                                                    CfnInstanceProps$Builder
                                                    CfnInstanceStorageConfig$Builder
                                                    CfnInstanceStorageConfig$EncryptionConfigProperty$Builder
                                                    CfnInstanceStorageConfig$KinesisFirehoseConfigProperty$Builder
                                                    CfnInstanceStorageConfig$KinesisStreamConfigProperty$Builder
                                                    CfnInstanceStorageConfig$KinesisVideoStreamConfigProperty$Builder
                                                    CfnInstanceStorageConfig$S3ConfigProperty$Builder
                                                    CfnInstanceStorageConfigProps$Builder
                                                    CfnIntegrationAssociation$Builder
                                                    CfnIntegrationAssociationProps$Builder
                                                    CfnPhoneNumber$Builder
                                                    CfnPhoneNumberProps$Builder
                                                    CfnPredefinedAttribute$Builder
                                                    CfnPredefinedAttribute$ValuesProperty$Builder
                                                    CfnPredefinedAttributeProps$Builder
                                                    CfnPrompt$Builder
                                                    CfnPromptProps$Builder
                                                    CfnQueue$Builder
                                                    CfnQueue$OutboundCallerConfigProperty$Builder
                                                    CfnQueueProps$Builder
                                                    CfnQuickConnect$Builder
                                                    CfnQuickConnect$PhoneNumberQuickConnectConfigProperty$Builder
                                                    CfnQuickConnect$QueueQuickConnectConfigProperty$Builder
                                                    CfnQuickConnect$QuickConnectConfigProperty$Builder
                                                    CfnQuickConnect$UserQuickConnectConfigProperty$Builder
                                                    CfnQuickConnectProps$Builder
                                                    CfnRoutingProfile$Builder
                                                    CfnRoutingProfile$CrossChannelBehaviorProperty$Builder
                                                    CfnRoutingProfile$MediaConcurrencyProperty$Builder
                                                    CfnRoutingProfile$RoutingProfileQueueConfigProperty$Builder
                                                    CfnRoutingProfile$RoutingProfileQueueReferenceProperty$Builder
                                                    CfnRoutingProfileProps$Builder
                                                    CfnRule$ActionsProperty$Builder
                                                    CfnRule$Builder
                                                    CfnRule$CreateCaseActionProperty$Builder
                                                    CfnRule$EventBridgeActionProperty$Builder
                                                    CfnRule$FieldProperty$Builder
                                                    CfnRule$FieldValueProperty$Builder
                                                    CfnRule$NotificationRecipientTypeProperty$Builder
                                                    CfnRule$ReferenceProperty$Builder
                                                    CfnRule$RuleTriggerEventSourceProperty$Builder
                                                    CfnRule$SendNotificationActionProperty$Builder
                                                    CfnRule$TaskActionProperty$Builder
                                                    CfnRule$UpdateCaseActionProperty$Builder
                                                    CfnRuleProps$Builder
                                                    CfnSecurityKey$Builder
                                                    CfnSecurityKeyProps$Builder
                                                    CfnSecurityProfile$ApplicationProperty$Builder
                                                    CfnSecurityProfile$Builder
                                                    CfnSecurityProfileProps$Builder
                                                    CfnTaskTemplate$Builder
                                                    CfnTaskTemplate$ConstraintsProperty$Builder
                                                    CfnTaskTemplate$DefaultFieldValueProperty$Builder
                                                    CfnTaskTemplate$FieldIdentifierProperty$Builder
                                                    CfnTaskTemplate$FieldProperty$Builder
                                                    CfnTaskTemplate$InvisibleFieldInfoProperty$Builder
                                                    CfnTaskTemplate$ReadOnlyFieldInfoProperty$Builder
                                                    CfnTaskTemplate$RequiredFieldInfoProperty$Builder
                                                    CfnTaskTemplateProps$Builder
                                                    CfnTrafficDistributionGroup$Builder
                                                    CfnTrafficDistributionGroupProps$Builder
                                                    CfnUser$Builder
                                                    CfnUser$UserIdentityInfoProperty$Builder
                                                    CfnUser$UserPhoneConfigProperty$Builder
                                                    CfnUser$UserProficiencyProperty$Builder
                                                    CfnUserHierarchyGroup$Builder
                                                    CfnUserHierarchyGroupProps$Builder
                                                    CfnUserProps$Builder
                                                    CfnView$Builder
                                                    CfnViewProps$Builder
                                                    CfnViewVersion$Builder
                                                    CfnViewVersionProps$Builder]))


(defn cfn-approved-origin-builder
  "The cfn-approved-origin-builder function buildes out new instances of 
CfnApprovedOrigin$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `origin` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin` |"
  [stack id config]
  (let [builder (CfnApprovedOrigin$Builder/create stack id)]
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :origin)]
      (. builder origin data))
    (.build builder)))


(defn cfn-approved-origin-props-builder
  "The cfn-approved-origin-props-builder function buildes out new instances of 
CfnApprovedOriginProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `origin` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin` |"
  [stack id config]
  (let [builder (CfnApprovedOriginProps$Builder.)]
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :origin)]
      (. builder origin data))
    (.build builder)))


(defn cfn-contact-flow-builder
  "The cfn-contact-flow-builder function buildes out new instances of 
CfnContactFlow$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnContactFlow$Builder/create stack id)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-contact-flow-module-builder
  "The cfn-contact-flow-module-builder function buildes out new instances of 
CfnContactFlowModule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnContactFlowModule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-contact-flow-module-props-builder
  "The cfn-contact-flow-module-props-builder function buildes out new instances of 
CfnContactFlowModuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnContactFlowModuleProps$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-contact-flow-props-builder
  "The cfn-contact-flow-props-builder function buildes out new instances of 
CfnContactFlowProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnContactFlowProps$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-evaluation-form-builder
  "The cfn-evaluation-form-builder function buildes out new instances of 
CfnEvaluationForm$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `items` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:items` |
| `scoringStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scoring-strategy` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (when-let [data (lookup-entry config id :scoring-strategy)]
      (. builder scoringStrategy data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-base-item-property-builder
  "The cfn-evaluation-form-evaluation-form-base-item-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormBaseItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `section` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:section` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormBaseItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :section)]
      (. builder section data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-item-property-builder
  "The cfn-evaluation-form-evaluation-form-item-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `question` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:question` |
| `section` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:section` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :question)]
      (. builder question data))
    (when-let [data (lookup-entry config id :section)]
      (. builder section data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-numeric-question-automation-property-builder
  "The cfn-evaluation-form-evaluation-form-numeric-question-automation-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormNumericQuestionAutomationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propertyValue` | software.amazon.awscdk.services.connect.CfnEvaluationForm$NumericQuestionPropertyValueAutomationProperty | [[cdk.support/lookup-entry]] | `:property-value` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormNumericQuestionAutomationProperty$Builder.)]
    (when-let [data (lookup-entry config id :property-value)]
      (. builder propertyValue data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-numeric-question-option-property-builder
  "The cfn-evaluation-form-evaluation-form-numeric-question-option-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormNumericQuestionOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticFail` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:automatic-fail` |
| `maxValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-value` |
| `minValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-value` |
| `score` | java.lang.Number | [[cdk.support/lookup-entry]] | `:score` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormNumericQuestionOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :automatic-fail)]
      (. builder automaticFail data))
    (when-let [data (lookup-entry config id :max-value)]
      (. builder maxValue data))
    (when-let [data (lookup-entry config id :min-value)]
      (. builder minValue data))
    (when-let [data (lookup-entry config id :score)]
      (. builder score data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-numeric-question-properties-property-builder
  "The cfn-evaluation-form-evaluation-form-numeric-question-properties-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormNumericQuestionPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automation` | software.amazon.awscdk.services.connect.CfnEvaluationForm$EvaluationFormNumericQuestionAutomationProperty | [[cdk.support/lookup-entry]] | `:automation` |
| `maxValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-value` |
| `minValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-value` |
| `options` | java.util.List | [[cdk.support/lookup-entry]] | `:options` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormNumericQuestionPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :automation)]
      (. builder automation data))
    (when-let [data (lookup-entry config id :max-value)]
      (. builder maxValue data))
    (when-let [data (lookup-entry config id :min-value)]
      (. builder minValue data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-question-property-builder
  "The cfn-evaluation-form-evaluation-form-question-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormQuestionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instructions` | java.lang.String | [[cdk.support/lookup-entry]] | `:instructions` |
| `notApplicableEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:not-applicable-enabled` |
| `questionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:question-type` |
| `questionTypeProperties` | software.amazon.awscdk.services.connect.CfnEvaluationForm$EvaluationFormQuestionTypePropertiesProperty | [[cdk.support/lookup-entry]] | `:question-type-properties` |
| `refId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ref-id` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormQuestionProperty$Builder.)]
    (when-let [data (lookup-entry config id :instructions)]
      (. builder instructions data))
    (when-let [data (lookup-entry config id :not-applicable-enabled)]
      (. builder notApplicableEnabled data))
    (when-let [data (lookup-entry config id :question-type)]
      (. builder questionType data))
    (when-let [data (lookup-entry config id :question-type-properties)]
      (. builder questionTypeProperties data))
    (when-let [data (lookup-entry config id :ref-id)]
      (. builder refId data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-question-type-properties-property-builder
  "The cfn-evaluation-form-evaluation-form-question-type-properties-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormQuestionTypePropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numeric` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:numeric` |
| `singleSelect` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:single-select` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormQuestionTypePropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :numeric)]
      (. builder numeric data))
    (when-let [data (lookup-entry config id :single-select)]
      (. builder singleSelect data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-section-property-builder
  "The cfn-evaluation-form-evaluation-form-section-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormSectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instructions` | java.lang.String | [[cdk.support/lookup-entry]] | `:instructions` |
| `items` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:items` |
| `refId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ref-id` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormSectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :instructions)]
      (. builder instructions data))
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (when-let [data (lookup-entry config id :ref-id)]
      (. builder refId data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-single-select-question-automation-option-property-builder
  "The cfn-evaluation-form-evaluation-form-single-select-question-automation-option-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleCategory` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-category` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :rule-category)]
      (. builder ruleCategory data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-single-select-question-automation-property-builder
  "The cfn-evaluation-form-evaluation-form-single-select-question-automation-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultOptionRefId` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-option-ref-id` |
| `options` | java.util.List | [[cdk.support/lookup-entry]] | `:options` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-option-ref-id)]
      (. builder defaultOptionRefId data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-single-select-question-option-property-builder
  "The cfn-evaluation-form-evaluation-form-single-select-question-option-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormSingleSelectQuestionOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticFail` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:automatic-fail` |
| `refId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ref-id` |
| `score` | java.lang.Number | [[cdk.support/lookup-entry]] | `:score` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormSingleSelectQuestionOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :automatic-fail)]
      (. builder automaticFail data))
    (when-let [data (lookup-entry config id :ref-id)]
      (. builder refId data))
    (when-let [data (lookup-entry config id :score)]
      (. builder score data))
    (when-let [data (lookup-entry config id :text)]
      (. builder text data))
    (.build builder)))


(defn cfn-evaluation-form-evaluation-form-single-select-question-properties-property-builder
  "The cfn-evaluation-form-evaluation-form-single-select-question-properties-property-builder function buildes out new instances of 
CfnEvaluationForm$EvaluationFormSingleSelectQuestionPropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:automation` |
| `displayAs` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-as` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$EvaluationFormSingleSelectQuestionPropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :automation)]
      (. builder automation data))
    (when-let [data (lookup-entry config id :display-as)]
      (. builder displayAs data))
    (when-let [data (lookup-entry config id :options)]
      (. builder options data))
    (.build builder)))


(defn cfn-evaluation-form-numeric-question-property-value-automation-property-builder
  "The cfn-evaluation-form-numeric-question-property-value-automation-property-builder function buildes out new instances of 
CfnEvaluationForm$NumericQuestionPropertyValueAutomationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$NumericQuestionPropertyValueAutomationProperty$Builder.)]
    (when-let [data (lookup-entry config id :label)]
      (. builder label data))
    (.build builder)))


(defn cfn-evaluation-form-props-builder
  "The cfn-evaluation-form-props-builder function buildes out new instances of 
CfnEvaluationFormProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `scoringStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scoring-strategy` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |"
  [stack id config]
  (let [builder (CfnEvaluationFormProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :items)]
      (. builder items data))
    (when-let [data (lookup-entry config id :scoring-strategy)]
      (. builder scoringStrategy data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (.build builder)))


(defn cfn-evaluation-form-scoring-strategy-property-builder
  "The cfn-evaluation-form-scoring-strategy-property-builder function buildes out new instances of 
CfnEvaluationForm$ScoringStrategyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$ScoringStrategyProperty$Builder.)]
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-evaluation-form-single-select-question-rule-category-automation-property-builder
  "The cfn-evaluation-form-single-select-question-rule-category-automation-property-builder function buildes out new instances of 
CfnEvaluationForm$SingleSelectQuestionRuleCategoryAutomationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `optionRefId` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-ref-id` |"
  [stack id config]
  (let [builder (CfnEvaluationForm$SingleSelectQuestionRuleCategoryAutomationProperty$Builder.)]
    (when-let [data (lookup-entry config id :category)]
      (. builder category data))
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :option-ref-id)]
      (. builder optionRefId data))
    (.build builder)))


(defn cfn-hours-of-operation-builder
  "The cfn-hours-of-operation-builder function buildes out new instances of 
CfnHoursOfOperation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |"
  [stack id config]
  (let [builder (CfnHoursOfOperation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :config)]
      (. builder config data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :time-zone)]
      (. builder timeZone data))
    (.build builder)))


(defn cfn-hours-of-operation-hours-of-operation-config-property-builder
  "The cfn-hours-of-operation-hours-of-operation-config-property-builder function buildes out new instances of 
CfnHoursOfOperation$HoursOfOperationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | java.lang.String | [[cdk.support/lookup-entry]] | `:day` |
| `endTime` | software.amazon.awscdk.services.connect.CfnHoursOfOperation$HoursOfOperationTimeSliceProperty | [[cdk.support/lookup-entry]] | `:end-time` |
| `startTime` | software.amazon.awscdk.services.connect.CfnHoursOfOperation$HoursOfOperationTimeSliceProperty | [[cdk.support/lookup-entry]] | `:start-time` |"
  [stack id config]
  (let [builder (CfnHoursOfOperation$HoursOfOperationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :day)]
      (. builder day data))
    (when-let [data (lookup-entry config id :end-time)]
      (. builder endTime data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (.build builder)))


(defn cfn-hours-of-operation-hours-of-operation-time-slice-property-builder
  "The cfn-hours-of-operation-hours-of-operation-time-slice-property-builder function buildes out new instances of 
CfnHoursOfOperation$HoursOfOperationTimeSliceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hours` |
| `minutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minutes` |"
  [stack id config]
  (let [builder (CfnHoursOfOperation$HoursOfOperationTimeSliceProperty$Builder.)]
    (when-let [data (lookup-entry config id :hours)]
      (. builder hours data))
    (when-let [data (lookup-entry config id :minutes)]
      (. builder minutes data))
    (.build builder)))


(defn cfn-hours-of-operation-props-builder
  "The cfn-hours-of-operation-props-builder function buildes out new instances of 
CfnHoursOfOperationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |"
  [stack id config]
  (let [builder (CfnHoursOfOperationProps$Builder.)]
    (when-let [data (lookup-entry config id :config)]
      (. builder config data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :time-zone)]
      (. builder timeZone data))
    (.build builder)))


(defn cfn-instance-attributes-property-builder
  "The cfn-instance-attributes-property-builder function buildes out new instances of 
CfnInstance$AttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoResolveBestVoices` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-resolve-best-voices` |
| `contactLens` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contact-lens` |
| `contactflowLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contactflow-logs` |
| `earlyMedia` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:early-media` |
| `inboundCalls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:inbound-calls` |
| `outboundCalls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outbound-calls` |
| `useCustomTtsVoices` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-custom-tts-voices` |"
  [stack id config]
  (let [builder (CfnInstance$AttributesProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-resolve-best-voices)]
      (. builder autoResolveBestVoices data))
    (when-let [data (lookup-entry config id :contact-lens)]
      (. builder contactLens data))
    (when-let [data (lookup-entry config id :contactflow-logs)]
      (. builder contactflowLogs data))
    (when-let [data (lookup-entry config id :early-media)]
      (. builder earlyMedia data))
    (when-let [data (lookup-entry config id :inbound-calls)]
      (. builder inboundCalls data))
    (when-let [data (lookup-entry config id :outbound-calls)]
      (. builder outboundCalls data))
    (when-let [data (lookup-entry config id :use-custom-tts-voices)]
      (. builder useCustomTtsVoices data))
    (.build builder)))


(defn cfn-instance-builder
  "The cfn-instance-builder function buildes out new instances of 
CfnInstance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.services.connect.CfnInstance$AttributesProperty | [[cdk.support/lookup-entry]] | `:attributes` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `identityManagementType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-management-type` |
| `instanceAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-alias` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :directory-id)]
      (. builder directoryId data))
    (when-let [data (lookup-entry config id :identity-management-type)]
      (. builder identityManagementType data))
    (when-let [data (lookup-entry config id :instance-alias)]
      (. builder instanceAlias data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-instance-props-builder
  "The cfn-instance-props-builder function buildes out new instances of 
CfnInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.services.connect.CfnInstance$AttributesProperty | [[cdk.support/lookup-entry]] | `:attributes` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `identityManagementType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-management-type` |
| `instanceAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-alias` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :directory-id)]
      (. builder directoryId data))
    (when-let [data (lookup-entry config id :identity-management-type)]
      (. builder identityManagementType data))
    (when-let [data (lookup-entry config id :instance-alias)]
      (. builder instanceAlias data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-instance-storage-config-builder
  "The cfn-instance-storage-config-builder function buildes out new instances of 
CfnInstanceStorageConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `kinesisFirehoseConfig` | software.amazon.awscdk.services.connect.CfnInstanceStorageConfig$KinesisFirehoseConfigProperty | [[cdk.support/lookup-entry]] | `:kinesis-firehose-config` |
| `kinesisStreamConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-stream-config` |
| `kinesisVideoStreamConfig` | software.amazon.awscdk.services.connect.CfnInstanceStorageConfig$KinesisVideoStreamConfigProperty | [[cdk.support/lookup-entry]] | `:kinesis-video-stream-config` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `s3Config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-config` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |"
  [stack id config]
  (let [builder (CfnInstanceStorageConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :kinesis-firehose-config)]
      (. builder kinesisFirehoseConfig data))
    (when-let [data (lookup-entry config id :kinesis-stream-config)]
      (. builder kinesisStreamConfig data))
    (when-let [data (lookup-entry config id :kinesis-video-stream-config)]
      (. builder kinesisVideoStreamConfig data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :s3-config)]
      (. builder s3Config data))
    (when-let [data (lookup-entry config id :storage-type)]
      (. builder storageType data))
    (.build builder)))


(defn cfn-instance-storage-config-encryption-config-property-builder
  "The cfn-instance-storage-config-encryption-config-property-builder function buildes out new instances of 
CfnInstanceStorageConfig$EncryptionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |"
  [stack id config]
  (let [builder (CfnInstanceStorageConfig$EncryptionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-type)]
      (. builder encryptionType data))
    (when-let [data (lookup-entry config id :key-id)]
      (. builder keyId data))
    (.build builder)))


(defn cfn-instance-storage-config-kinesis-firehose-config-property-builder
  "The cfn-instance-storage-config-kinesis-firehose-config-property-builder function buildes out new instances of 
CfnInstanceStorageConfig$KinesisFirehoseConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firehoseArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:firehose-arn` |"
  [stack id config]
  (let [builder (CfnInstanceStorageConfig$KinesisFirehoseConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :firehose-arn)]
      (. builder firehoseArn data))
    (.build builder)))


(defn cfn-instance-storage-config-kinesis-stream-config-property-builder
  "The cfn-instance-storage-config-kinesis-stream-config-property-builder function buildes out new instances of 
CfnInstanceStorageConfig$KinesisStreamConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |"
  [stack id config]
  (let [builder (CfnInstanceStorageConfig$KinesisStreamConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :stream-arn)]
      (. builder streamArn data))
    (.build builder)))


(defn cfn-instance-storage-config-kinesis-video-stream-config-property-builder
  "The cfn-instance-storage-config-kinesis-video-stream-config-property-builder function buildes out new instances of 
CfnInstanceStorageConfig$KinesisVideoStreamConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-config` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `retentionPeriodHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-period-hours` |"
  [stack id config]
  (let [builder (CfnInstanceStorageConfig$KinesisVideoStreamConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :encryption-config)]
      (. builder encryptionConfig data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (when-let [data (lookup-entry config id :retention-period-hours)]
      (. builder retentionPeriodHours data))
    (.build builder)))


(defn cfn-instance-storage-config-props-builder
  "The cfn-instance-storage-config-props-builder function buildes out new instances of 
CfnInstanceStorageConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `kinesisFirehoseConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-firehose-config` |
| `kinesisStreamConfig` | software.amazon.awscdk.services.connect.CfnInstanceStorageConfig$KinesisStreamConfigProperty | [[cdk.support/lookup-entry]] | `:kinesis-stream-config` |
| `kinesisVideoStreamConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-video-stream-config` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `s3Config` | software.amazon.awscdk.services.connect.CfnInstanceStorageConfig$S3ConfigProperty | [[cdk.support/lookup-entry]] | `:s3-config` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |"
  [stack id config]
  (let [builder (CfnInstanceStorageConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :kinesis-firehose-config)]
      (. builder kinesisFirehoseConfig data))
    (when-let [data (lookup-entry config id :kinesis-stream-config)]
      (. builder kinesisStreamConfig data))
    (when-let [data (lookup-entry config id :kinesis-video-stream-config)]
      (. builder kinesisVideoStreamConfig data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :s3-config)]
      (. builder s3Config data))
    (when-let [data (lookup-entry config id :storage-type)]
      (. builder storageType data))
    (.build builder)))


(defn cfn-instance-storage-config-s3-config-property-builder
  "The cfn-instance-storage-config-s3-config-property-builder function buildes out new instances of 
CfnInstanceStorageConfig$S3ConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `encryptionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-config` |"
  [stack id config]
  (let [builder (CfnInstanceStorageConfig$S3ConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bucket-name)]
      (. builder bucketName data))
    (when-let [data (lookup-entry config id :bucket-prefix)]
      (. builder bucketPrefix data))
    (when-let [data (lookup-entry config id :encryption-config)]
      (. builder encryptionConfig data))
    (.build builder)))


(defn cfn-integration-association-builder
  "The cfn-integration-association-builder function buildes out new instances of 
CfnIntegrationAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `integrationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-arn` |
| `integrationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-type` |"
  [stack id config]
  (let [builder (CfnIntegrationAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :integration-arn)]
      (. builder integrationArn data))
    (when-let [data (lookup-entry config id :integration-type)]
      (. builder integrationType data))
    (.build builder)))


(defn cfn-integration-association-props-builder
  "The cfn-integration-association-props-builder function buildes out new instances of 
CfnIntegrationAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `integrationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-arn` |
| `integrationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-type` |"
  [stack id config]
  (let [builder (CfnIntegrationAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :integration-arn)]
      (. builder integrationArn data))
    (when-let [data (lookup-entry config id :integration-type)]
      (. builder integrationType data))
    (.build builder)))


(defn cfn-phone-number-builder
  "The cfn-phone-number-builder function buildes out new instances of 
CfnPhoneNumber$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `countryCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:country-code` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `sourcePhoneNumberArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-phone-number-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPhoneNumber$Builder/create stack id)]
    (when-let [data (lookup-entry config id :country-code)]
      (. builder countryCode data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (when-let [data (lookup-entry config id :source-phone-number-arn)]
      (. builder sourcePhoneNumberArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-phone-number-props-builder
  "The cfn-phone-number-props-builder function buildes out new instances of 
CfnPhoneNumberProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `countryCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:country-code` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `sourcePhoneNumberArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-phone-number-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPhoneNumberProps$Builder.)]
    (when-let [data (lookup-entry config id :country-code)]
      (. builder countryCode data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (when-let [data (lookup-entry config id :source-phone-number-arn)]
      (. builder sourcePhoneNumberArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-arn)]
      (. builder targetArn data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-predefined-attribute-builder
  "The cfn-predefined-attribute-builder function buildes out new instances of 
CfnPredefinedAttribute$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnPredefinedAttribute$Builder/create stack id)]
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-predefined-attribute-props-builder
  "The cfn-predefined-attribute-props-builder function buildes out new instances of 
CfnPredefinedAttributeProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnPredefinedAttributeProps$Builder.)]
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-predefined-attribute-values-property-builder
  "The cfn-predefined-attribute-values-property-builder function buildes out new instances of 
CfnPredefinedAttribute$ValuesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stringList` | java.util.List | [[cdk.support/lookup-entry]] | `:string-list` |"
  [stack id config]
  (let [builder (CfnPredefinedAttribute$ValuesProperty$Builder.)]
    (when-let [data (lookup-entry config id :string-list)]
      (. builder stringList data))
    (.build builder)))


(defn cfn-prompt-builder
  "The cfn-prompt-builder function buildes out new instances of 
CfnPrompt$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPrompt$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-prompt-props-builder
  "The cfn-prompt-props-builder function buildes out new instances of 
CfnPromptProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPromptProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :s3-uri)]
      (. builder s3Uri data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-queue-builder
  "The cfn-queue-builder function buildes out new instances of 
CfnQueue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `hoursOfOperationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:hours-of-operation-arn` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `maxContacts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-contacts` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outboundCallerConfig` | software.amazon.awscdk.services.connect.CfnQueue$OutboundCallerConfigProperty | [[cdk.support/lookup-entry]] | `:outbound-caller-config` |
| `quickConnectArns` | java.util.List | [[cdk.support/lookup-entry]] | `:quick-connect-arns` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnQueue$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :hours-of-operation-arn)]
      (. builder hoursOfOperationArn data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :max-contacts)]
      (. builder maxContacts data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :outbound-caller-config)]
      (. builder outboundCallerConfig data))
    (when-let [data (lookup-entry config id :quick-connect-arns)]
      (. builder quickConnectArns data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-queue-outbound-caller-config-property-builder
  "The cfn-queue-outbound-caller-config-property-builder function buildes out new instances of 
CfnQueue$OutboundCallerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `outboundCallerIdName` | java.lang.String | [[cdk.support/lookup-entry]] | `:outbound-caller-id-name` |
| `outboundCallerIdNumberArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outbound-caller-id-number-arn` |
| `outboundFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outbound-flow-arn` |"
  [stack id config]
  (let [builder (CfnQueue$OutboundCallerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :outbound-caller-id-name)]
      (. builder outboundCallerIdName data))
    (when-let [data (lookup-entry config id :outbound-caller-id-number-arn)]
      (. builder outboundCallerIdNumberArn data))
    (when-let [data (lookup-entry config id :outbound-flow-arn)]
      (. builder outboundFlowArn data))
    (.build builder)))


(defn cfn-queue-props-builder
  "The cfn-queue-props-builder function buildes out new instances of 
CfnQueueProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `hoursOfOperationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:hours-of-operation-arn` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `maxContacts` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-contacts` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outboundCallerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outbound-caller-config` |
| `quickConnectArns` | java.util.List | [[cdk.support/lookup-entry]] | `:quick-connect-arns` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnQueueProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :hours-of-operation-arn)]
      (. builder hoursOfOperationArn data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :max-contacts)]
      (. builder maxContacts data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :outbound-caller-config)]
      (. builder outboundCallerConfig data))
    (when-let [data (lookup-entry config id :quick-connect-arns)]
      (. builder quickConnectArns data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-quick-connect-builder
  "The cfn-quick-connect-builder function buildes out new instances of 
CfnQuickConnect$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `quickConnectConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:quick-connect-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnQuickConnect$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :quick-connect-config)]
      (. builder quickConnectConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-quick-connect-phone-number-quick-connect-config-property-builder
  "The cfn-quick-connect-phone-number-quick-connect-config-property-builder function buildes out new instances of 
CfnQuickConnect$PhoneNumberQuickConnectConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `phoneNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone-number` |"
  [stack id config]
  (let [builder (CfnQuickConnect$PhoneNumberQuickConnectConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :phone-number)]
      (. builder phoneNumber data))
    (.build builder)))


(defn cfn-quick-connect-props-builder
  "The cfn-quick-connect-props-builder function buildes out new instances of 
CfnQuickConnectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `quickConnectConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:quick-connect-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnQuickConnectProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :quick-connect-config)]
      (. builder quickConnectConfig data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-quick-connect-queue-quick-connect-config-property-builder
  "The cfn-quick-connect-queue-quick-connect-config-property-builder function buildes out new instances of 
CfnQuickConnect$QueueQuickConnectConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-flow-arn` |
| `queueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-arn` |"
  [stack id config]
  (let [builder (CfnQuickConnect$QueueQuickConnectConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :contact-flow-arn)]
      (. builder contactFlowArn data))
    (when-let [data (lookup-entry config id :queue-arn)]
      (. builder queueArn data))
    (.build builder)))


(defn cfn-quick-connect-quick-connect-config-property-builder
  "The cfn-quick-connect-quick-connect-config-property-builder function buildes out new instances of 
CfnQuickConnect$QuickConnectConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `phoneConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:phone-config` |
| `queueConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:queue-config` |
| `quickConnectType` | java.lang.String | [[cdk.support/lookup-entry]] | `:quick-connect-type` |
| `userConfig` | software.amazon.awscdk.services.connect.CfnQuickConnect$UserQuickConnectConfigProperty | [[cdk.support/lookup-entry]] | `:user-config` |"
  [stack id config]
  (let [builder (CfnQuickConnect$QuickConnectConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :phone-config)]
      (. builder phoneConfig data))
    (when-let [data (lookup-entry config id :queue-config)]
      (. builder queueConfig data))
    (when-let [data (lookup-entry config id :quick-connect-type)]
      (. builder quickConnectType data))
    (when-let [data (lookup-entry config id :user-config)]
      (. builder userConfig data))
    (.build builder)))


(defn cfn-quick-connect-user-quick-connect-config-property-builder
  "The cfn-quick-connect-user-quick-connect-config-property-builder function buildes out new instances of 
CfnQuickConnect$UserQuickConnectConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-flow-arn` |
| `userArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-arn` |"
  [stack id config]
  (let [builder (CfnQuickConnect$UserQuickConnectConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :contact-flow-arn)]
      (. builder contactFlowArn data))
    (when-let [data (lookup-entry config id :user-arn)]
      (. builder userArn data))
    (.build builder)))


(defn cfn-routing-profile-builder
  "The cfn-routing-profile-builder function buildes out new instances of 
CfnRoutingProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentAvailabilityTimer` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-availability-timer` |
| `defaultOutboundQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-outbound-queue-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `mediaConcurrencies` | java.util.List | [[cdk.support/lookup-entry]] | `:media-concurrencies` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queueConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:queue-configs` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRoutingProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :agent-availability-timer)]
      (. builder agentAvailabilityTimer data))
    (when-let [data (lookup-entry config id :default-outbound-queue-arn)]
      (. builder defaultOutboundQueueArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :media-concurrencies)]
      (. builder mediaConcurrencies data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :queue-configs)]
      (. builder queueConfigs data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-routing-profile-cross-channel-behavior-property-builder
  "The cfn-routing-profile-cross-channel-behavior-property-builder function buildes out new instances of 
CfnRoutingProfile$CrossChannelBehaviorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behaviorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior-type` |"
  [stack id config]
  (let [builder (CfnRoutingProfile$CrossChannelBehaviorProperty$Builder.)]
    (when-let [data (lookup-entry config id :behavior-type)]
      (. builder behaviorType data))
    (.build builder)))


(defn cfn-routing-profile-media-concurrency-property-builder
  "The cfn-routing-profile-media-concurrency-property-builder function buildes out new instances of 
CfnRoutingProfile$MediaConcurrencyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channel` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel` |
| `concurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrency` |
| `crossChannelBehavior` | software.amazon.awscdk.services.connect.CfnRoutingProfile$CrossChannelBehaviorProperty | [[cdk.support/lookup-entry]] | `:cross-channel-behavior` |"
  [stack id config]
  (let [builder (CfnRoutingProfile$MediaConcurrencyProperty$Builder.)]
    (when-let [data (lookup-entry config id :channel)]
      (. builder channel data))
    (when-let [data (lookup-entry config id :concurrency)]
      (. builder concurrency data))
    (when-let [data (lookup-entry config id :cross-channel-behavior)]
      (. builder crossChannelBehavior data))
    (.build builder)))


(defn cfn-routing-profile-props-builder
  "The cfn-routing-profile-props-builder function buildes out new instances of 
CfnRoutingProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentAvailabilityTimer` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-availability-timer` |
| `defaultOutboundQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-outbound-queue-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `mediaConcurrencies` | java.util.List | [[cdk.support/lookup-entry]] | `:media-concurrencies` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queueConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:queue-configs` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRoutingProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :agent-availability-timer)]
      (. builder agentAvailabilityTimer data))
    (when-let [data (lookup-entry config id :default-outbound-queue-arn)]
      (. builder defaultOutboundQueueArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :media-concurrencies)]
      (. builder mediaConcurrencies data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :queue-configs)]
      (. builder queueConfigs data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-routing-profile-routing-profile-queue-config-property-builder
  "The cfn-routing-profile-routing-profile-queue-config-property-builder function buildes out new instances of 
CfnRoutingProfile$RoutingProfileQueueConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `delay` | java.lang.Number | [[cdk.support/lookup-entry]] | `:delay` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `queueReference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:queue-reference` |"
  [stack id config]
  (let [builder (CfnRoutingProfile$RoutingProfileQueueConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :delay)]
      (. builder delay data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :queue-reference)]
      (. builder queueReference data))
    (.build builder)))


(defn cfn-routing-profile-routing-profile-queue-reference-property-builder
  "The cfn-routing-profile-routing-profile-queue-reference-property-builder function buildes out new instances of 
CfnRoutingProfile$RoutingProfileQueueReferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channel` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel` |
| `queueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-arn` |"
  [stack id config]
  (let [builder (CfnRoutingProfile$RoutingProfileQueueReferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :channel)]
      (. builder channel data))
    (when-let [data (lookup-entry config id :queue-arn)]
      (. builder queueArn data))
    (.build builder)))


(defn cfn-rule-actions-property-builder
  "The cfn-rule-actions-property-builder function buildes out new instances of 
CfnRule$ActionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignContactCategoryActions` | java.util.List | [[cdk.support/lookup-entry]] | `:assign-contact-category-actions` |
| `createCaseActions` | java.util.List | [[cdk.support/lookup-entry]] | `:create-case-actions` |
| `endAssociatedTasksActions` | java.util.List | [[cdk.support/lookup-entry]] | `:end-associated-tasks-actions` |
| `eventBridgeActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-bridge-actions` |
| `sendNotificationActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:send-notification-actions` |
| `taskActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:task-actions` |
| `updateCaseActions` | java.util.List | [[cdk.support/lookup-entry]] | `:update-case-actions` |"
  [stack id config]
  (let [builder (CfnRule$ActionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :assign-contact-category-actions)]
      (. builder assignContactCategoryActions data))
    (when-let [data (lookup-entry config id :create-case-actions)]
      (. builder createCaseActions data))
    (when-let [data (lookup-entry config id :end-associated-tasks-actions)]
      (. builder endAssociatedTasksActions data))
    (when-let [data (lookup-entry config id :event-bridge-actions)]
      (. builder eventBridgeActions data))
    (when-let [data (lookup-entry config id :send-notification-actions)]
      (. builder sendNotificationActions data))
    (when-let [data (lookup-entry config id :task-actions)]
      (. builder taskActions data))
    (when-let [data (lookup-entry config id :update-case-actions)]
      (. builder updateCaseActions data))
    (.build builder)))


(defn cfn-rule-builder
  "The cfn-rule-builder function buildes out new instances of 
CfnRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `function` | java.lang.String | [[cdk.support/lookup-entry]] | `:function` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publishStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:publish-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggerEventSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-event-source` |"
  [stack id config]
  (let [builder (CfnRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :function)]
      (. builder function data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :publish-status)]
      (. builder publishStatus data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trigger-event-source)]
      (. builder triggerEventSource data))
    (.build builder)))


(defn cfn-rule-create-case-action-property-builder
  "The cfn-rule-create-case-action-property-builder function buildes out new instances of 
CfnRule$CreateCaseActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fields` |
| `templateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-id` |"
  [stack id config]
  (let [builder (CfnRule$CreateCaseActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :template-id)]
      (. builder templateId data))
    (.build builder)))


(defn cfn-rule-event-bridge-action-property-builder
  "The cfn-rule-event-bridge-action-property-builder function buildes out new instances of 
CfnRule$EventBridgeActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRule$EventBridgeActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-rule-field-property-builder
  "The cfn-rule-field-property-builder function buildes out new instances of 
CfnRule$FieldProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `value` | software.amazon.awscdk.services.connect.CfnRule$FieldValueProperty | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRule$FieldProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-rule-field-value-property-builder
  "The cfn-rule-field-value-property-builder function buildes out new instances of 
CfnRule$FieldValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:double-value` |
| `emptyValue` | java.lang.Object | [[cdk.support/lookup-entry]] | `:empty-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |"
  [stack id config]
  (let [builder (CfnRule$FieldValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :boolean-value)]
      (. builder booleanValue data))
    (when-let [data (lookup-entry config id :double-value)]
      (. builder doubleValue data))
    (when-let [data (lookup-entry config id :empty-value)]
      (. builder emptyValue data))
    (when-let [data (lookup-entry config id :string-value)]
      (. builder stringValue data))
    (.build builder)))


(defn cfn-rule-notification-recipient-type-property-builder
  "The cfn-rule-notification-recipient-type-property-builder function buildes out new instances of 
CfnRule$NotificationRecipientTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userArns` | java.util.List | [[cdk.support/lookup-entry]] | `:user-arns` |
| `userTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-tags` |"
  [stack id config]
  (let [builder (CfnRule$NotificationRecipientTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :user-arns)]
      (. builder userArns data))
    (when-let [data (lookup-entry config id :user-tags)]
      (. builder userTags data))
    (.build builder)))


(defn cfn-rule-props-builder
  "The cfn-rule-props-builder function buildes out new instances of 
CfnRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `function` | java.lang.String | [[cdk.support/lookup-entry]] | `:function` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publishStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:publish-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggerEventSource` | software.amazon.awscdk.services.connect.CfnRule$RuleTriggerEventSourceProperty | [[cdk.support/lookup-entry]] | `:trigger-event-source` |"
  [stack id config]
  (let [builder (CfnRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :function)]
      (. builder function data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :publish-status)]
      (. builder publishStatus data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :trigger-event-source)]
      (. builder triggerEventSource data))
    (.build builder)))


(defn cfn-rule-reference-property-builder
  "The cfn-rule-reference-property-builder function buildes out new instances of 
CfnRule$ReferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRule$ReferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-rule-rule-trigger-event-source-property-builder
  "The cfn-rule-rule-trigger-event-source-property-builder function buildes out new instances of 
CfnRule$RuleTriggerEventSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |
| `integrationAssociationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-association-arn` |"
  [stack id config]
  (let [builder (CfnRule$RuleTriggerEventSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :event-source-name)]
      (. builder eventSourceName data))
    (when-let [data (lookup-entry config id :integration-association-arn)]
      (. builder integrationAssociationArn data))
    (.build builder)))


(defn cfn-rule-send-notification-action-property-builder
  "The cfn-rule-send-notification-action-property-builder function buildes out new instances of 
CfnRule$SendNotificationActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `deliveryMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-method` |
| `recipient` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recipient` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |"
  [stack id config]
  (let [builder (CfnRule$SendNotificationActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (when-let [data (lookup-entry config id :delivery-method)]
      (. builder deliveryMethod data))
    (when-let [data (lookup-entry config id :recipient)]
      (. builder recipient data))
    (when-let [data (lookup-entry config id :subject)]
      (. builder subject data))
    (.build builder)))


(defn cfn-rule-task-action-property-builder
  "The cfn-rule-task-action-property-builder function buildes out new instances of 
CfnRule$TaskActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-flow-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `references` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:references` |"
  [stack id config]
  (let [builder (CfnRule$TaskActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :contact-flow-arn)]
      (. builder contactFlowArn data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :references)]
      (. builder references data))
    (.build builder)))


(defn cfn-rule-update-case-action-property-builder
  "The cfn-rule-update-case-action-property-builder function buildes out new instances of 
CfnRule$UpdateCaseActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fields` |"
  [stack id config]
  (let [builder (CfnRule$UpdateCaseActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (.build builder)))


(defn cfn-security-key-builder
  "The cfn-security-key-builder function buildes out new instances of 
CfnSecurityKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |"
  [stack id config]
  (let [builder (CfnSecurityKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (.build builder)))


(defn cfn-security-key-props-builder
  "The cfn-security-key-props-builder function buildes out new instances of 
CfnSecurityKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |"
  [stack id config]
  (let [builder (CfnSecurityKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (.build builder)))


(defn cfn-security-profile-application-property-builder
  "The cfn-security-profile-application-property-builder function buildes out new instances of 
CfnSecurityProfile$ApplicationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationPermissions` | java.util.List | [[cdk.support/lookup-entry]] | `:application-permissions` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$ApplicationProperty$Builder.)]
    (when-let [data (lookup-entry config id :application-permissions)]
      (. builder applicationPermissions data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-security-profile-builder
  "The cfn-security-profile-builder function buildes out new instances of 
CfnSecurityProfile$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedAccessControlHierarchyGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-access-control-hierarchy-group-id` |
| `allowedAccessControlTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allowed-access-control-tags` |
| `applications` | java.util.List | [[cdk.support/lookup-entry]] | `:applications` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `hierarchyRestrictedResources` | java.util.List | [[cdk.support/lookup-entry]] | `:hierarchy-restricted-resources` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `securityProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-profile-name` |
| `tagRestrictedResources` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-restricted-resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSecurityProfile$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allowed-access-control-hierarchy-group-id)]
      (. builder allowedAccessControlHierarchyGroupId data))
    (when-let [data (lookup-entry config id :allowed-access-control-tags)]
      (. builder allowedAccessControlTags data))
    (when-let [data (lookup-entry config id :applications)]
      (. builder applications data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :hierarchy-restricted-resources)]
      (. builder hierarchyRestrictedResources data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :permissions)]
      (. builder permissions data))
    (when-let [data (lookup-entry config id :security-profile-name)]
      (. builder securityProfileName data))
    (when-let [data (lookup-entry config id :tag-restricted-resources)]
      (. builder tagRestrictedResources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-security-profile-props-builder
  "The cfn-security-profile-props-builder function buildes out new instances of 
CfnSecurityProfileProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedAccessControlHierarchyGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-access-control-hierarchy-group-id` |
| `allowedAccessControlTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allowed-access-control-tags` |
| `applications` | java.util.List | [[cdk.support/lookup-entry]] | `:applications` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `hierarchyRestrictedResources` | java.util.List | [[cdk.support/lookup-entry]] | `:hierarchy-restricted-resources` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `permissions` | java.util.List | [[cdk.support/lookup-entry]] | `:permissions` |
| `securityProfileName` | java.lang.String | [[cdk.support/lookup-entry]] | `:security-profile-name` |
| `tagRestrictedResources` | java.util.List | [[cdk.support/lookup-entry]] | `:tag-restricted-resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSecurityProfileProps$Builder.)]
    (when-let [data (lookup-entry config id :allowed-access-control-hierarchy-group-id)]
      (. builder allowedAccessControlHierarchyGroupId data))
    (when-let [data (lookup-entry config id :allowed-access-control-tags)]
      (. builder allowedAccessControlTags data))
    (when-let [data (lookup-entry config id :applications)]
      (. builder applications data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :hierarchy-restricted-resources)]
      (. builder hierarchyRestrictedResources data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :permissions)]
      (. builder permissions data))
    (when-let [data (lookup-entry config id :security-profile-name)]
      (. builder securityProfileName data))
    (when-let [data (lookup-entry config id :tag-restricted-resources)]
      (. builder tagRestrictedResources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-task-template-builder
  "The cfn-task-template-builder function buildes out new instances of 
CfnTaskTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `constraints` | java.lang.Object | [[cdk.support/lookup-entry]] | `:constraints` |
| `contactFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-flow-arn` |
| `defaults` | java.util.List | [[cdk.support/lookup-entry]] | `:defaults` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fields` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTaskTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :client-token)]
      (. builder clientToken data))
    (when-let [data (lookup-entry config id :constraints)]
      (. builder constraints data))
    (when-let [data (lookup-entry config id :contact-flow-arn)]
      (. builder contactFlowArn data))
    (when-let [data (lookup-entry config id :defaults)]
      (. builder defaults data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-task-template-constraints-property-builder
  "The cfn-task-template-constraints-property-builder function buildes out new instances of 
CfnTaskTemplate$ConstraintsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invisibleFields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invisible-fields` |
| `readOnlyFields` | java.util.List | [[cdk.support/lookup-entry]] | `:read-only-fields` |
| `requiredFields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:required-fields` |"
  [stack id config]
  (let [builder (CfnTaskTemplate$ConstraintsProperty$Builder.)]
    (when-let [data (lookup-entry config id :invisible-fields)]
      (. builder invisibleFields data))
    (when-let [data (lookup-entry config id :read-only-fields)]
      (. builder readOnlyFields data))
    (when-let [data (lookup-entry config id :required-fields)]
      (. builder requiredFields data))
    (.build builder)))


(defn cfn-task-template-default-field-value-property-builder
  "The cfn-task-template-default-field-value-property-builder function buildes out new instances of 
CfnTaskTemplate$DefaultFieldValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `id` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id` |"
  [stack id config]
  (let [builder (CfnTaskTemplate$DefaultFieldValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (.build builder)))


(defn cfn-task-template-field-identifier-property-builder
  "The cfn-task-template-field-identifier-property-builder function buildes out new instances of 
CfnTaskTemplate$FieldIdentifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnTaskTemplate$FieldIdentifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-task-template-field-property-builder
  "The cfn-task-template-field-property-builder function buildes out new instances of 
CfnTaskTemplate$FieldProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `id` | software.amazon.awscdk.services.connect.CfnTaskTemplate$FieldIdentifierProperty | [[cdk.support/lookup-entry]] | `:id` |
| `singleSelectOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:single-select-options` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnTaskTemplate$FieldProperty$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :single-select-options)]
      (. builder singleSelectOptions data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-task-template-invisible-field-info-property-builder
  "The cfn-task-template-invisible-field-info-property-builder function buildes out new instances of 
CfnTaskTemplate$InvisibleFieldInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id` |"
  [stack id config]
  (let [builder (CfnTaskTemplate$InvisibleFieldInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (.build builder)))


(defn cfn-task-template-props-builder
  "The cfn-task-template-props-builder function buildes out new instances of 
CfnTaskTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-token` |
| `constraints` | java.lang.Object | [[cdk.support/lookup-entry]] | `:constraints` |
| `contactFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-flow-arn` |
| `defaults` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:defaults` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `fields` | java.util.List | [[cdk.support/lookup-entry]] | `:fields` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTaskTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :client-token)]
      (. builder clientToken data))
    (when-let [data (lookup-entry config id :constraints)]
      (. builder constraints data))
    (when-let [data (lookup-entry config id :contact-flow-arn)]
      (. builder contactFlowArn data))
    (when-let [data (lookup-entry config id :defaults)]
      (. builder defaults data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :fields)]
      (. builder fields data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-task-template-read-only-field-info-property-builder
  "The cfn-task-template-read-only-field-info-property-builder function buildes out new instances of 
CfnTaskTemplate$ReadOnlyFieldInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id` |"
  [stack id config]
  (let [builder (CfnTaskTemplate$ReadOnlyFieldInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (.build builder)))


(defn cfn-task-template-required-field-info-property-builder
  "The cfn-task-template-required-field-info-property-builder function buildes out new instances of 
CfnTaskTemplate$RequiredFieldInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id` |"
  [stack id config]
  (let [builder (CfnTaskTemplate$RequiredFieldInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (.build builder)))


(defn cfn-traffic-distribution-group-builder
  "The cfn-traffic-distribution-group-builder function buildes out new instances of 
CfnTrafficDistributionGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrafficDistributionGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-traffic-distribution-group-props-builder
  "The cfn-traffic-distribution-group-props-builder function buildes out new instances of 
CfnTrafficDistributionGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnTrafficDistributionGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-user-builder
  "The cfn-user-builder function buildes out new instances of 
CfnUser$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryUserId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-user-id` |
| `hierarchyGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:hierarchy-group-arn` |
| `identityInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:identity-info` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `phoneConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:phone-config` |
| `routingProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:routing-profile-arn` |
| `securityProfileArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-profile-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userProficiencies` | java.util.List | [[cdk.support/lookup-entry]] | `:user-proficiencies` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnUser$Builder/create stack id)]
    (when-let [data (lookup-entry config id :directory-user-id)]
      (. builder directoryUserId data))
    (when-let [data (lookup-entry config id :hierarchy-group-arn)]
      (. builder hierarchyGroupArn data))
    (when-let [data (lookup-entry config id :identity-info)]
      (. builder identityInfo data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :phone-config)]
      (. builder phoneConfig data))
    (when-let [data (lookup-entry config id :routing-profile-arn)]
      (. builder routingProfileArn data))
    (when-let [data (lookup-entry config id :security-profile-arns)]
      (. builder securityProfileArns data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-proficiencies)]
      (. builder userProficiencies data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-user-hierarchy-group-builder
  "The cfn-user-hierarchy-group-builder function buildes out new instances of 
CfnUserHierarchyGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-group-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnUserHierarchyGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parent-group-arn)]
      (. builder parentGroupArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-user-hierarchy-group-props-builder
  "The cfn-user-hierarchy-group-props-builder function buildes out new instances of 
CfnUserHierarchyGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-group-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnUserHierarchyGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parent-group-arn)]
      (. builder parentGroupArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-user-props-builder
  "The cfn-user-props-builder function buildes out new instances of 
CfnUserProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `directoryUserId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-user-id` |
| `hierarchyGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:hierarchy-group-arn` |
| `identityInfo` | software.amazon.awscdk.services.connect.CfnUser$UserIdentityInfoProperty | [[cdk.support/lookup-entry]] | `:identity-info` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `phoneConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:phone-config` |
| `routingProfileArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:routing-profile-arn` |
| `securityProfileArns` | java.util.List | [[cdk.support/lookup-entry]] | `:security-profile-arns` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `userProficiencies` | java.util.List | [[cdk.support/lookup-entry]] | `:user-proficiencies` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnUserProps$Builder.)]
    (when-let [data (lookup-entry config id :directory-user-id)]
      (. builder directoryUserId data))
    (when-let [data (lookup-entry config id :hierarchy-group-arn)]
      (. builder hierarchyGroupArn data))
    (when-let [data (lookup-entry config id :identity-info)]
      (. builder identityInfo data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :phone-config)]
      (. builder phoneConfig data))
    (when-let [data (lookup-entry config id :routing-profile-arn)]
      (. builder routingProfileArn data))
    (when-let [data (lookup-entry config id :security-profile-arns)]
      (. builder securityProfileArns data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :user-proficiencies)]
      (. builder userProficiencies data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-user-user-identity-info-property-builder
  "The cfn-user-user-identity-info-property-builder function buildes out new instances of 
CfnUser$UserIdentityInfoProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `firstName` | java.lang.String | [[cdk.support/lookup-entry]] | `:first-name` |
| `lastName` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-name` |
| `mobile` | java.lang.String | [[cdk.support/lookup-entry]] | `:mobile` |
| `secondaryEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:secondary-email` |"
  [stack id config]
  (let [builder (CfnUser$UserIdentityInfoProperty$Builder.)]
    (when-let [data (lookup-entry config id :email)]
      (. builder email data))
    (when-let [data (lookup-entry config id :first-name)]
      (. builder firstName data))
    (when-let [data (lookup-entry config id :last-name)]
      (. builder lastName data))
    (when-let [data (lookup-entry config id :mobile)]
      (. builder mobile data))
    (when-let [data (lookup-entry config id :secondary-email)]
      (. builder secondaryEmail data))
    (.build builder)))


(defn cfn-user-user-phone-config-property-builder
  "The cfn-user-user-phone-config-property-builder function buildes out new instances of 
CfnUser$UserPhoneConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `afterContactWorkTimeLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:after-contact-work-time-limit` |
| `autoAccept` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-accept` |
| `deskPhoneNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:desk-phone-number` |
| `phoneType` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone-type` |"
  [stack id config]
  (let [builder (CfnUser$UserPhoneConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :after-contact-work-time-limit)]
      (. builder afterContactWorkTimeLimit data))
    (when-let [data (lookup-entry config id :auto-accept)]
      (. builder autoAccept data))
    (when-let [data (lookup-entry config id :desk-phone-number)]
      (. builder deskPhoneNumber data))
    (when-let [data (lookup-entry config id :phone-type)]
      (. builder phoneType data))
    (.build builder)))


(defn cfn-user-user-proficiency-property-builder
  "The cfn-user-user-proficiency-property-builder function buildes out new instances of 
CfnUser$UserProficiencyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `attributeValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-value` |
| `level` | java.lang.Number | [[cdk.support/lookup-entry]] | `:level` |"
  [stack id config]
  (let [builder (CfnUser$UserProficiencyProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-name)]
      (. builder attributeName data))
    (when-let [data (lookup-entry config id :attribute-value)]
      (. builder attributeValue data))
    (when-let [data (lookup-entry config id :level)]
      (. builder level data))
    (.build builder)))


(defn cfn-view-builder
  "The cfn-view-builder function buildes out new instances of 
CfnView$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `template` | java.lang.Object | [[cdk.support/lookup-entry]] | `:template` |"
  [stack id config]
  (let [builder (CfnView$Builder/create stack id)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template)]
      (. builder template data))
    (.build builder)))


(defn cfn-view-props-builder
  "The cfn-view-props-builder function buildes out new instances of 
CfnViewProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `template` | java.lang.Object | [[cdk.support/lookup-entry]] | `:template` |"
  [stack id config]
  (let [builder (CfnViewProps$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :instance-arn)]
      (. builder instanceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template)]
      (. builder template data))
    (.build builder)))


(defn cfn-view-version-builder
  "The cfn-view-version-builder function buildes out new instances of 
CfnViewVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `versionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-description` |
| `viewArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-arn` |
| `viewContentSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-content-sha256` |"
  [stack id config]
  (let [builder (CfnViewVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :version-description)]
      (. builder versionDescription data))
    (when-let [data (lookup-entry config id :view-arn)]
      (. builder viewArn data))
    (when-let [data (lookup-entry config id :view-content-sha256)]
      (. builder viewContentSha256 data))
    (.build builder)))


(defn cfn-view-version-props-builder
  "The cfn-view-version-props-builder function buildes out new instances of 
CfnViewVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `versionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-description` |
| `viewArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-arn` |
| `viewContentSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-content-sha256` |"
  [stack id config]
  (let [builder (CfnViewVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :version-description)]
      (. builder versionDescription data))
    (when-let [data (lookup-entry config id :view-arn)]
      (. builder viewArn data))
    (when-let [data (lookup-entry config id :view-content-sha256)]
      (. builder viewContentSha256 data))
    (.build builder)))