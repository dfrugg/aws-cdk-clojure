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


(defn build-cfn-approved-origin-builder
  "The build-cfn-approved-origin-builder function updates a CfnApprovedOrigin$Builder instance using the provided configuration.
  The function takes the CfnApprovedOrigin$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `origin` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin` |
"
  [^CfnApprovedOrigin$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :origin)]
    (. builder origin data))
  (.build builder))


(defn cfn-approved-origin-builder
  "Creates a  `CfnApprovedOrigin$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-approved-origin-builder (CfnApprovedOrigin$Builder/create scope (name id)) id config))


(defn build-cfn-approved-origin-props-builder
  "The build-cfn-approved-origin-props-builder function updates a CfnApprovedOriginProps$Builder instance using the provided configuration.
  The function takes the CfnApprovedOriginProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `origin` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin` |
"
  [^CfnApprovedOriginProps$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :origin)]
    (. builder origin data))
  (.build builder))


(defn cfn-approved-origin-props-builder
  "Creates a  `CfnApprovedOriginProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-approved-origin-props-builder (new CfnApprovedOriginProps$Builder) id config))


(defn build-cfn-contact-flow-builder
  "The build-cfn-contact-flow-builder function updates a CfnContactFlow$Builder instance using the provided configuration.
  The function takes the CfnContactFlow$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnContactFlow$Builder builder id config]
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-contact-flow-builder
  "Creates a  `CfnContactFlow$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-contact-flow-builder (CfnContactFlow$Builder/create scope (name id)) id config))


(defn build-cfn-contact-flow-module-builder
  "The build-cfn-contact-flow-module-builder function updates a CfnContactFlowModule$Builder instance using the provided configuration.
  The function takes the CfnContactFlowModule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnContactFlowModule$Builder builder id config]
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-contact-flow-module-builder
  "Creates a  `CfnContactFlowModule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-contact-flow-module-builder (CfnContactFlowModule$Builder/create scope (name id)) id config))


(defn build-cfn-contact-flow-module-props-builder
  "The build-cfn-contact-flow-module-props-builder function updates a CfnContactFlowModuleProps$Builder instance using the provided configuration.
  The function takes the CfnContactFlowModuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnContactFlowModuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-contact-flow-module-props-builder
  "Creates a  `CfnContactFlowModuleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-contact-flow-module-props-builder (new CfnContactFlowModuleProps$Builder) id config))


(defn build-cfn-contact-flow-props-builder
  "The build-cfn-contact-flow-props-builder function updates a CfnContactFlowProps$Builder instance using the provided configuration.
  The function takes the CfnContactFlowProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnContactFlowProps$Builder builder id config]
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :state)]
    (. builder state data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-contact-flow-props-builder
  "Creates a  `CfnContactFlowProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-contact-flow-props-builder (new CfnContactFlowProps$Builder) id config))


(defn build-cfn-evaluation-form-builder
  "The build-cfn-evaluation-form-builder function updates a CfnEvaluationForm$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `items` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:items` |
| `scoringStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scoring-strategy` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
"
  [^CfnEvaluationForm$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (when-some [data (lookup-entry config id :scoring-strategy)]
    (. builder scoringStrategy data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (.build builder))


(defn cfn-evaluation-form-builder
  "Creates a  `CfnEvaluationForm$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-evaluation-form-builder (CfnEvaluationForm$Builder/create scope (name id)) id config))


(defn build-cfn-evaluation-form-evaluation-form-base-item-property-builder
  "The build-cfn-evaluation-form-evaluation-form-base-item-property-builder function updates a CfnEvaluationForm$EvaluationFormBaseItemProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormBaseItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `section` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:section` |
"
  [^CfnEvaluationForm$EvaluationFormBaseItemProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :section)]
    (. builder section data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-base-item-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormBaseItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-base-item-property-builder (new CfnEvaluationForm$EvaluationFormBaseItemProperty$Builder) id config))


(defn build-cfn-evaluation-form-evaluation-form-item-property-builder
  "The build-cfn-evaluation-form-evaluation-form-item-property-builder function updates a CfnEvaluationForm$EvaluationFormItemProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `question` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:question` |
| `section` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:section` |
"
  [^CfnEvaluationForm$EvaluationFormItemProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :question)]
    (. builder question data))
  (when-some [data (lookup-entry config id :section)]
    (. builder section data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-item-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-item-property-builder (new CfnEvaluationForm$EvaluationFormItemProperty$Builder) id config))


(defn build-cfn-evaluation-form-evaluation-form-numeric-question-automation-property-builder
  "The build-cfn-evaluation-form-evaluation-form-numeric-question-automation-property-builder function updates a CfnEvaluationForm$EvaluationFormNumericQuestionAutomationProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormNumericQuestionAutomationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `propertyValue` | software.amazon.awscdk.services.connect.CfnEvaluationForm$NumericQuestionPropertyValueAutomationProperty | [[cdk.support/lookup-entry]] | `:property-value` |
"
  [^CfnEvaluationForm$EvaluationFormNumericQuestionAutomationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :property-value)]
    (. builder propertyValue data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-numeric-question-automation-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormNumericQuestionAutomationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-numeric-question-automation-property-builder (new CfnEvaluationForm$EvaluationFormNumericQuestionAutomationProperty$Builder) id config))


(defn build-cfn-evaluation-form-evaluation-form-numeric-question-option-property-builder
  "The build-cfn-evaluation-form-evaluation-form-numeric-question-option-property-builder function updates a CfnEvaluationForm$EvaluationFormNumericQuestionOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormNumericQuestionOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticFail` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:automatic-fail` |
| `maxValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-value` |
| `minValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-value` |
| `score` | java.lang.Number | [[cdk.support/lookup-entry]] | `:score` |
"
  [^CfnEvaluationForm$EvaluationFormNumericQuestionOptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :automatic-fail)]
    (. builder automaticFail data))
  (when-some [data (lookup-entry config id :max-value)]
    (. builder maxValue data))
  (when-some [data (lookup-entry config id :min-value)]
    (. builder minValue data))
  (when-some [data (lookup-entry config id :score)]
    (. builder score data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-numeric-question-option-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormNumericQuestionOptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-numeric-question-option-property-builder (new CfnEvaluationForm$EvaluationFormNumericQuestionOptionProperty$Builder) id config))


(defn build-cfn-evaluation-form-evaluation-form-numeric-question-properties-property-builder
  "The build-cfn-evaluation-form-evaluation-form-numeric-question-properties-property-builder function updates a CfnEvaluationForm$EvaluationFormNumericQuestionPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormNumericQuestionPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automation` | software.amazon.awscdk.services.connect.CfnEvaluationForm$EvaluationFormNumericQuestionAutomationProperty | [[cdk.support/lookup-entry]] | `:automation` |
| `maxValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-value` |
| `minValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-value` |
| `options` | java.util.List | [[cdk.support/lookup-entry]] | `:options` |
"
  [^CfnEvaluationForm$EvaluationFormNumericQuestionPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :automation)]
    (. builder automation data))
  (when-some [data (lookup-entry config id :max-value)]
    (. builder maxValue data))
  (when-some [data (lookup-entry config id :min-value)]
    (. builder minValue data))
  (when-some [data (lookup-entry config id :options)]
    (. builder options data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-numeric-question-properties-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormNumericQuestionPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-numeric-question-properties-property-builder (new CfnEvaluationForm$EvaluationFormNumericQuestionPropertiesProperty$Builder) id config))


(defn build-cfn-evaluation-form-evaluation-form-question-property-builder
  "The build-cfn-evaluation-form-evaluation-form-question-property-builder function updates a CfnEvaluationForm$EvaluationFormQuestionProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormQuestionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instructions` | java.lang.String | [[cdk.support/lookup-entry]] | `:instructions` |
| `notApplicableEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:not-applicable-enabled` |
| `questionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:question-type` |
| `questionTypeProperties` | software.amazon.awscdk.services.connect.CfnEvaluationForm$EvaluationFormQuestionTypePropertiesProperty | [[cdk.support/lookup-entry]] | `:question-type-properties` |
| `refId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ref-id` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnEvaluationForm$EvaluationFormQuestionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instructions)]
    (. builder instructions data))
  (when-some [data (lookup-entry config id :not-applicable-enabled)]
    (. builder notApplicableEnabled data))
  (when-some [data (lookup-entry config id :question-type)]
    (. builder questionType data))
  (when-some [data (lookup-entry config id :question-type-properties)]
    (. builder questionTypeProperties data))
  (when-some [data (lookup-entry config id :ref-id)]
    (. builder refId data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-question-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormQuestionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-question-property-builder (new CfnEvaluationForm$EvaluationFormQuestionProperty$Builder) id config))


(defn build-cfn-evaluation-form-evaluation-form-question-type-properties-property-builder
  "The build-cfn-evaluation-form-evaluation-form-question-type-properties-property-builder function updates a CfnEvaluationForm$EvaluationFormQuestionTypePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormQuestionTypePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numeric` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:numeric` |
| `singleSelect` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:single-select` |
"
  [^CfnEvaluationForm$EvaluationFormQuestionTypePropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :numeric)]
    (. builder numeric data))
  (when-some [data (lookup-entry config id :single-select)]
    (. builder singleSelect data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-question-type-properties-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormQuestionTypePropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-question-type-properties-property-builder (new CfnEvaluationForm$EvaluationFormQuestionTypePropertiesProperty$Builder) id config))


(defn build-cfn-evaluation-form-evaluation-form-section-property-builder
  "The build-cfn-evaluation-form-evaluation-form-section-property-builder function updates a CfnEvaluationForm$EvaluationFormSectionProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormSectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instructions` | java.lang.String | [[cdk.support/lookup-entry]] | `:instructions` |
| `items` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:items` |
| `refId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ref-id` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnEvaluationForm$EvaluationFormSectionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :instructions)]
    (. builder instructions data))
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (when-some [data (lookup-entry config id :ref-id)]
    (. builder refId data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (when-some [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-section-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormSectionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-section-property-builder (new CfnEvaluationForm$EvaluationFormSectionProperty$Builder) id config))


(defn build-cfn-evaluation-form-evaluation-form-single-select-question-automation-option-property-builder
  "The build-cfn-evaluation-form-evaluation-form-single-select-question-automation-option-property-builder function updates a CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleCategory` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-category` |
"
  [^CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationOptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :rule-category)]
    (. builder ruleCategory data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-single-select-question-automation-option-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationOptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-single-select-question-automation-option-property-builder (new CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationOptionProperty$Builder) id config))


(defn build-cfn-evaluation-form-evaluation-form-single-select-question-automation-property-builder
  "The build-cfn-evaluation-form-evaluation-form-single-select-question-automation-property-builder function updates a CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultOptionRefId` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-option-ref-id` |
| `options` | java.util.List | [[cdk.support/lookup-entry]] | `:options` |
"
  [^CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :default-option-ref-id)]
    (. builder defaultOptionRefId data))
  (when-some [data (lookup-entry config id :options)]
    (. builder options data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-single-select-question-automation-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-single-select-question-automation-property-builder (new CfnEvaluationForm$EvaluationFormSingleSelectQuestionAutomationProperty$Builder) id config))


(defn build-cfn-evaluation-form-evaluation-form-single-select-question-option-property-builder
  "The build-cfn-evaluation-form-evaluation-form-single-select-question-option-property-builder function updates a CfnEvaluationForm$EvaluationFormSingleSelectQuestionOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormSingleSelectQuestionOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticFail` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:automatic-fail` |
| `refId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ref-id` |
| `score` | java.lang.Number | [[cdk.support/lookup-entry]] | `:score` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
"
  [^CfnEvaluationForm$EvaluationFormSingleSelectQuestionOptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :automatic-fail)]
    (. builder automaticFail data))
  (when-some [data (lookup-entry config id :ref-id)]
    (. builder refId data))
  (when-some [data (lookup-entry config id :score)]
    (. builder score data))
  (when-some [data (lookup-entry config id :text)]
    (. builder text data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-single-select-question-option-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormSingleSelectQuestionOptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-single-select-question-option-property-builder (new CfnEvaluationForm$EvaluationFormSingleSelectQuestionOptionProperty$Builder) id config))


(defn build-cfn-evaluation-form-evaluation-form-single-select-question-properties-property-builder
  "The build-cfn-evaluation-form-evaluation-form-single-select-question-properties-property-builder function updates a CfnEvaluationForm$EvaluationFormSingleSelectQuestionPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$EvaluationFormSingleSelectQuestionPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:automation` |
| `displayAs` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-as` |
| `options` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:options` |
"
  [^CfnEvaluationForm$EvaluationFormSingleSelectQuestionPropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :automation)]
    (. builder automation data))
  (when-some [data (lookup-entry config id :display-as)]
    (. builder displayAs data))
  (when-some [data (lookup-entry config id :options)]
    (. builder options data))
  (.build builder))


(defn cfn-evaluation-form-evaluation-form-single-select-question-properties-property-builder
  "Creates a  `CfnEvaluationForm$EvaluationFormSingleSelectQuestionPropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-evaluation-form-single-select-question-properties-property-builder (new CfnEvaluationForm$EvaluationFormSingleSelectQuestionPropertiesProperty$Builder) id config))


(defn build-cfn-evaluation-form-numeric-question-property-value-automation-property-builder
  "The build-cfn-evaluation-form-numeric-question-property-value-automation-property-builder function updates a CfnEvaluationForm$NumericQuestionPropertyValueAutomationProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$NumericQuestionPropertyValueAutomationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
"
  [^CfnEvaluationForm$NumericQuestionPropertyValueAutomationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :label)]
    (. builder label data))
  (.build builder))


(defn cfn-evaluation-form-numeric-question-property-value-automation-property-builder
  "Creates a  `CfnEvaluationForm$NumericQuestionPropertyValueAutomationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-numeric-question-property-value-automation-property-builder (new CfnEvaluationForm$NumericQuestionPropertyValueAutomationProperty$Builder) id config))


(defn build-cfn-evaluation-form-props-builder
  "The build-cfn-evaluation-form-props-builder function updates a CfnEvaluationFormProps$Builder instance using the provided configuration.
  The function takes the CfnEvaluationFormProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `items` | java.util.List | [[cdk.support/lookup-entry]] | `:items` |
| `scoringStrategy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scoring-strategy` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
"
  [^CfnEvaluationFormProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :items)]
    (. builder items data))
  (when-some [data (lookup-entry config id :scoring-strategy)]
    (. builder scoringStrategy data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :title)]
    (. builder title data))
  (.build builder))


(defn cfn-evaluation-form-props-builder
  "Creates a  `CfnEvaluationFormProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-props-builder (new CfnEvaluationFormProps$Builder) id config))


(defn build-cfn-evaluation-form-scoring-strategy-property-builder
  "The build-cfn-evaluation-form-scoring-strategy-property-builder function updates a CfnEvaluationForm$ScoringStrategyProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$ScoringStrategyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnEvaluationForm$ScoringStrategyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-evaluation-form-scoring-strategy-property-builder
  "Creates a  `CfnEvaluationForm$ScoringStrategyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-scoring-strategy-property-builder (new CfnEvaluationForm$ScoringStrategyProperty$Builder) id config))


(defn build-cfn-evaluation-form-single-select-question-rule-category-automation-property-builder
  "The build-cfn-evaluation-form-single-select-question-rule-category-automation-property-builder function updates a CfnEvaluationForm$SingleSelectQuestionRuleCategoryAutomationProperty$Builder instance using the provided configuration.
  The function takes the CfnEvaluationForm$SingleSelectQuestionRuleCategoryAutomationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `category` | java.lang.String | [[cdk.support/lookup-entry]] | `:category` |
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `optionRefId` | java.lang.String | [[cdk.support/lookup-entry]] | `:option-ref-id` |
"
  [^CfnEvaluationForm$SingleSelectQuestionRuleCategoryAutomationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :category)]
    (. builder category data))
  (when-some [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-some [data (lookup-entry config id :option-ref-id)]
    (. builder optionRefId data))
  (.build builder))


(defn cfn-evaluation-form-single-select-question-rule-category-automation-property-builder
  "Creates a  `CfnEvaluationForm$SingleSelectQuestionRuleCategoryAutomationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-evaluation-form-single-select-question-rule-category-automation-property-builder (new CfnEvaluationForm$SingleSelectQuestionRuleCategoryAutomationProperty$Builder) id config))


(defn build-cfn-hours-of-operation-builder
  "The build-cfn-hours-of-operation-builder function updates a CfnHoursOfOperation$Builder instance using the provided configuration.
  The function takes the CfnHoursOfOperation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |
"
  [^CfnHoursOfOperation$Builder builder id config]
  (when-some [data (lookup-entry config id :config)]
    (. builder config data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :time-zone)]
    (. builder timeZone data))
  (.build builder))


(defn cfn-hours-of-operation-builder
  "Creates a  `CfnHoursOfOperation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-hours-of-operation-builder (CfnHoursOfOperation$Builder/create scope (name id)) id config))


(defn build-cfn-hours-of-operation-hours-of-operation-config-property-builder
  "The build-cfn-hours-of-operation-hours-of-operation-config-property-builder function updates a CfnHoursOfOperation$HoursOfOperationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnHoursOfOperation$HoursOfOperationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `day` | java.lang.String | [[cdk.support/lookup-entry]] | `:day` |
| `endTime` | software.amazon.awscdk.services.connect.CfnHoursOfOperation$HoursOfOperationTimeSliceProperty | [[cdk.support/lookup-entry]] | `:end-time` |
| `startTime` | software.amazon.awscdk.services.connect.CfnHoursOfOperation$HoursOfOperationTimeSliceProperty | [[cdk.support/lookup-entry]] | `:start-time` |
"
  [^CfnHoursOfOperation$HoursOfOperationConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :day)]
    (. builder day data))
  (when-some [data (lookup-entry config id :end-time)]
    (. builder endTime data))
  (when-some [data (lookup-entry config id :start-time)]
    (. builder startTime data))
  (.build builder))


(defn cfn-hours-of-operation-hours-of-operation-config-property-builder
  "Creates a  `CfnHoursOfOperation$HoursOfOperationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-hours-of-operation-hours-of-operation-config-property-builder (new CfnHoursOfOperation$HoursOfOperationConfigProperty$Builder) id config))


(defn build-cfn-hours-of-operation-hours-of-operation-time-slice-property-builder
  "The build-cfn-hours-of-operation-hours-of-operation-time-slice-property-builder function updates a CfnHoursOfOperation$HoursOfOperationTimeSliceProperty$Builder instance using the provided configuration.
  The function takes the CfnHoursOfOperation$HoursOfOperationTimeSliceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hours` |
| `minutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minutes` |
"
  [^CfnHoursOfOperation$HoursOfOperationTimeSliceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :hours)]
    (. builder hours data))
  (when-some [data (lookup-entry config id :minutes)]
    (. builder minutes data))
  (.build builder))


(defn cfn-hours-of-operation-hours-of-operation-time-slice-property-builder
  "Creates a  `CfnHoursOfOperation$HoursOfOperationTimeSliceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-hours-of-operation-hours-of-operation-time-slice-property-builder (new CfnHoursOfOperation$HoursOfOperationTimeSliceProperty$Builder) id config))


(defn build-cfn-hours-of-operation-props-builder
  "The build-cfn-hours-of-operation-props-builder function updates a CfnHoursOfOperationProps$Builder instance using the provided configuration.
  The function takes the CfnHoursOfOperationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:config` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |
"
  [^CfnHoursOfOperationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :config)]
    (. builder config data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :time-zone)]
    (. builder timeZone data))
  (.build builder))


(defn cfn-hours-of-operation-props-builder
  "Creates a  `CfnHoursOfOperationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-hours-of-operation-props-builder (new CfnHoursOfOperationProps$Builder) id config))


(defn build-cfn-instance-attributes-property-builder
  "The build-cfn-instance-attributes-property-builder function updates a CfnInstance$AttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnInstance$AttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoResolveBestVoices` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-resolve-best-voices` |
| `contactLens` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contact-lens` |
| `contactflowLogs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:contactflow-logs` |
| `earlyMedia` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:early-media` |
| `inboundCalls` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:inbound-calls` |
| `outboundCalls` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outbound-calls` |
| `useCustomTtsVoices` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-custom-tts-voices` |
"
  [^CfnInstance$AttributesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :auto-resolve-best-voices)]
    (. builder autoResolveBestVoices data))
  (when-some [data (lookup-entry config id :contact-lens)]
    (. builder contactLens data))
  (when-some [data (lookup-entry config id :contactflow-logs)]
    (. builder contactflowLogs data))
  (when-some [data (lookup-entry config id :early-media)]
    (. builder earlyMedia data))
  (when-some [data (lookup-entry config id :inbound-calls)]
    (. builder inboundCalls data))
  (when-some [data (lookup-entry config id :outbound-calls)]
    (. builder outboundCalls data))
  (when-some [data (lookup-entry config id :use-custom-tts-voices)]
    (. builder useCustomTtsVoices data))
  (.build builder))


(defn cfn-instance-attributes-property-builder
  "Creates a  `CfnInstance$AttributesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-attributes-property-builder (new CfnInstance$AttributesProperty$Builder) id config))


(defn build-cfn-instance-builder
  "The build-cfn-instance-builder function updates a CfnInstance$Builder instance using the provided configuration.
  The function takes the CfnInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.services.connect.CfnInstance$AttributesProperty | [[cdk.support/lookup-entry]] | `:attributes` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `identityManagementType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-management-type` |
| `instanceAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-alias` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :directory-id)]
    (. builder directoryId data))
  (when-some [data (lookup-entry config id :identity-management-type)]
    (. builder identityManagementType data))
  (when-some [data (lookup-entry config id :instance-alias)]
    (. builder instanceAlias data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-instance-builder
  "Creates a  `CfnInstance$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-instance-builder (CfnInstance$Builder/create scope (name id)) id config))


(defn build-cfn-instance-props-builder
  "The build-cfn-instance-props-builder function updates a CfnInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.services.connect.CfnInstance$AttributesProperty | [[cdk.support/lookup-entry]] | `:attributes` |
| `directoryId` | java.lang.String | [[cdk.support/lookup-entry]] | `:directory-id` |
| `identityManagementType` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-management-type` |
| `instanceAlias` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-alias` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-some [data (lookup-entry config id :directory-id)]
    (. builder directoryId data))
  (when-some [data (lookup-entry config id :identity-management-type)]
    (. builder identityManagementType data))
  (when-some [data (lookup-entry config id :instance-alias)]
    (. builder instanceAlias data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-instance-props-builder
  "Creates a  `CfnInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-props-builder (new CfnInstanceProps$Builder) id config))


(defn build-cfn-instance-storage-config-builder
  "The build-cfn-instance-storage-config-builder function updates a CfnInstanceStorageConfig$Builder instance using the provided configuration.
  The function takes the CfnInstanceStorageConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `kinesisFirehoseConfig` | software.amazon.awscdk.services.connect.CfnInstanceStorageConfig$KinesisFirehoseConfigProperty | [[cdk.support/lookup-entry]] | `:kinesis-firehose-config` |
| `kinesisStreamConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-stream-config` |
| `kinesisVideoStreamConfig` | software.amazon.awscdk.services.connect.CfnInstanceStorageConfig$KinesisVideoStreamConfigProperty | [[cdk.support/lookup-entry]] | `:kinesis-video-stream-config` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `s3Config` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-config` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
"
  [^CfnInstanceStorageConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :kinesis-firehose-config)]
    (. builder kinesisFirehoseConfig data))
  (when-some [data (lookup-entry config id :kinesis-stream-config)]
    (. builder kinesisStreamConfig data))
  (when-some [data (lookup-entry config id :kinesis-video-stream-config)]
    (. builder kinesisVideoStreamConfig data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :s3-config)]
    (. builder s3Config data))
  (when-some [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (.build builder))


(defn cfn-instance-storage-config-builder
  "Creates a  `CfnInstanceStorageConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-instance-storage-config-builder (CfnInstanceStorageConfig$Builder/create scope (name id)) id config))


(defn build-cfn-instance-storage-config-encryption-config-property-builder
  "The build-cfn-instance-storage-config-encryption-config-property-builder function updates a CfnInstanceStorageConfig$EncryptionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceStorageConfig$EncryptionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-type` |
| `keyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-id` |
"
  [^CfnInstanceStorageConfig$EncryptionConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-type)]
    (. builder encryptionType data))
  (when-some [data (lookup-entry config id :key-id)]
    (. builder keyId data))
  (.build builder))


(defn cfn-instance-storage-config-encryption-config-property-builder
  "Creates a  `CfnInstanceStorageConfig$EncryptionConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-storage-config-encryption-config-property-builder (new CfnInstanceStorageConfig$EncryptionConfigProperty$Builder) id config))


(defn build-cfn-instance-storage-config-kinesis-firehose-config-property-builder
  "The build-cfn-instance-storage-config-kinesis-firehose-config-property-builder function updates a CfnInstanceStorageConfig$KinesisFirehoseConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceStorageConfig$KinesisFirehoseConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firehoseArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:firehose-arn` |
"
  [^CfnInstanceStorageConfig$KinesisFirehoseConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :firehose-arn)]
    (. builder firehoseArn data))
  (.build builder))


(defn cfn-instance-storage-config-kinesis-firehose-config-property-builder
  "Creates a  `CfnInstanceStorageConfig$KinesisFirehoseConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-storage-config-kinesis-firehose-config-property-builder (new CfnInstanceStorageConfig$KinesisFirehoseConfigProperty$Builder) id config))


(defn build-cfn-instance-storage-config-kinesis-stream-config-property-builder
  "The build-cfn-instance-storage-config-kinesis-stream-config-property-builder function updates a CfnInstanceStorageConfig$KinesisStreamConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceStorageConfig$KinesisStreamConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `streamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-arn` |
"
  [^CfnInstanceStorageConfig$KinesisStreamConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :stream-arn)]
    (. builder streamArn data))
  (.build builder))


(defn cfn-instance-storage-config-kinesis-stream-config-property-builder
  "Creates a  `CfnInstanceStorageConfig$KinesisStreamConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-storage-config-kinesis-stream-config-property-builder (new CfnInstanceStorageConfig$KinesisStreamConfigProperty$Builder) id config))


(defn build-cfn-instance-storage-config-kinesis-video-stream-config-property-builder
  "The build-cfn-instance-storage-config-kinesis-video-stream-config-property-builder function updates a CfnInstanceStorageConfig$KinesisVideoStreamConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceStorageConfig$KinesisVideoStreamConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-config` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `retentionPeriodHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:retention-period-hours` |
"
  [^CfnInstanceStorageConfig$KinesisVideoStreamConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-config)]
    (. builder encryptionConfig data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-some [data (lookup-entry config id :retention-period-hours)]
    (. builder retentionPeriodHours data))
  (.build builder))


(defn cfn-instance-storage-config-kinesis-video-stream-config-property-builder
  "Creates a  `CfnInstanceStorageConfig$KinesisVideoStreamConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-storage-config-kinesis-video-stream-config-property-builder (new CfnInstanceStorageConfig$KinesisVideoStreamConfigProperty$Builder) id config))


(defn build-cfn-instance-storage-config-props-builder
  "The build-cfn-instance-storage-config-props-builder function updates a CfnInstanceStorageConfigProps$Builder instance using the provided configuration.
  The function takes the CfnInstanceStorageConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `kinesisFirehoseConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-firehose-config` |
| `kinesisStreamConfig` | software.amazon.awscdk.services.connect.CfnInstanceStorageConfig$KinesisStreamConfigProperty | [[cdk.support/lookup-entry]] | `:kinesis-stream-config` |
| `kinesisVideoStreamConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kinesis-video-stream-config` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `s3Config` | software.amazon.awscdk.services.connect.CfnInstanceStorageConfig$S3ConfigProperty | [[cdk.support/lookup-entry]] | `:s3-config` |
| `storageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:storage-type` |
"
  [^CfnInstanceStorageConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :kinesis-firehose-config)]
    (. builder kinesisFirehoseConfig data))
  (when-some [data (lookup-entry config id :kinesis-stream-config)]
    (. builder kinesisStreamConfig data))
  (when-some [data (lookup-entry config id :kinesis-video-stream-config)]
    (. builder kinesisVideoStreamConfig data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :s3-config)]
    (. builder s3Config data))
  (when-some [data (lookup-entry config id :storage-type)]
    (. builder storageType data))
  (.build builder))


(defn cfn-instance-storage-config-props-builder
  "Creates a  `CfnInstanceStorageConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-storage-config-props-builder (new CfnInstanceStorageConfigProps$Builder) id config))


(defn build-cfn-instance-storage-config-s3-config-property-builder
  "The build-cfn-instance-storage-config-s3-config-property-builder function updates a CfnInstanceStorageConfig$S3ConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceStorageConfig$S3ConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `encryptionConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-config` |
"
  [^CfnInstanceStorageConfig$S3ConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :encryption-config)]
    (. builder encryptionConfig data))
  (.build builder))


(defn cfn-instance-storage-config-s3-config-property-builder
  "Creates a  `CfnInstanceStorageConfig$S3ConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-storage-config-s3-config-property-builder (new CfnInstanceStorageConfig$S3ConfigProperty$Builder) id config))


(defn build-cfn-integration-association-builder
  "The build-cfn-integration-association-builder function updates a CfnIntegrationAssociation$Builder instance using the provided configuration.
  The function takes the CfnIntegrationAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `integrationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-arn` |
| `integrationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-type` |
"
  [^CfnIntegrationAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :integration-arn)]
    (. builder integrationArn data))
  (when-some [data (lookup-entry config id :integration-type)]
    (. builder integrationType data))
  (.build builder))


(defn cfn-integration-association-builder
  "Creates a  `CfnIntegrationAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-integration-association-builder (CfnIntegrationAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-integration-association-props-builder
  "The build-cfn-integration-association-props-builder function updates a CfnIntegrationAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnIntegrationAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `integrationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-arn` |
| `integrationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-type` |
"
  [^CfnIntegrationAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :integration-arn)]
    (. builder integrationArn data))
  (when-some [data (lookup-entry config id :integration-type)]
    (. builder integrationType data))
  (.build builder))


(defn cfn-integration-association-props-builder
  "Creates a  `CfnIntegrationAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-integration-association-props-builder (new CfnIntegrationAssociationProps$Builder) id config))


(defn build-cfn-phone-number-builder
  "The build-cfn-phone-number-builder function updates a CfnPhoneNumber$Builder instance using the provided configuration.
  The function takes the CfnPhoneNumber$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `countryCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:country-code` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `sourcePhoneNumberArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-phone-number-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPhoneNumber$Builder builder id config]
  (when-some [data (lookup-entry config id :country-code)]
    (. builder countryCode data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-some [data (lookup-entry config id :source-phone-number-arn)]
    (. builder sourcePhoneNumberArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-phone-number-builder
  "Creates a  `CfnPhoneNumber$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-phone-number-builder (CfnPhoneNumber$Builder/create scope (name id)) id config))


(defn build-cfn-phone-number-props-builder
  "The build-cfn-phone-number-props-builder function updates a CfnPhoneNumberProps$Builder instance using the provided configuration.
  The function takes the CfnPhoneNumberProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `countryCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:country-code` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |
| `sourcePhoneNumberArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-phone-number-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-arn` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPhoneNumberProps$Builder builder id config]
  (when-some [data (lookup-entry config id :country-code)]
    (. builder countryCode data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :prefix)]
    (. builder prefix data))
  (when-some [data (lookup-entry config id :source-phone-number-arn)]
    (. builder sourcePhoneNumberArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-arn)]
    (. builder targetArn data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-phone-number-props-builder
  "Creates a  `CfnPhoneNumberProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-phone-number-props-builder (new CfnPhoneNumberProps$Builder) id config))


(defn build-cfn-predefined-attribute-builder
  "The build-cfn-predefined-attribute-builder function updates a CfnPredefinedAttribute$Builder instance using the provided configuration.
  The function takes the CfnPredefinedAttribute$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnPredefinedAttribute$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-predefined-attribute-builder
  "Creates a  `CfnPredefinedAttribute$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-predefined-attribute-builder (CfnPredefinedAttribute$Builder/create scope (name id)) id config))


(defn build-cfn-predefined-attribute-props-builder
  "The build-cfn-predefined-attribute-props-builder function updates a CfnPredefinedAttributeProps$Builder instance using the provided configuration.
  The function takes the CfnPredefinedAttributeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnPredefinedAttributeProps$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-predefined-attribute-props-builder
  "Creates a  `CfnPredefinedAttributeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-predefined-attribute-props-builder (new CfnPredefinedAttributeProps$Builder) id config))


(defn build-cfn-predefined-attribute-values-property-builder
  "The build-cfn-predefined-attribute-values-property-builder function updates a CfnPredefinedAttribute$ValuesProperty$Builder instance using the provided configuration.
  The function takes the CfnPredefinedAttribute$ValuesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stringList` | java.util.List | [[cdk.support/lookup-entry]] | `:string-list` |
"
  [^CfnPredefinedAttribute$ValuesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :string-list)]
    (. builder stringList data))
  (.build builder))


(defn cfn-predefined-attribute-values-property-builder
  "Creates a  `CfnPredefinedAttribute$ValuesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-predefined-attribute-values-property-builder (new CfnPredefinedAttribute$ValuesProperty$Builder) id config))


(defn build-cfn-prompt-builder
  "The build-cfn-prompt-builder function updates a CfnPrompt$Builder instance using the provided configuration.
  The function takes the CfnPrompt$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPrompt$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-prompt-builder
  "Creates a  `CfnPrompt$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-prompt-builder (CfnPrompt$Builder/create scope (name id)) id config))


(defn build-cfn-prompt-props-builder
  "The build-cfn-prompt-props-builder function updates a CfnPromptProps$Builder instance using the provided configuration.
  The function takes the CfnPromptProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `s3Uri` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-uri` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPromptProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :s3-uri)]
    (. builder s3Uri data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-prompt-props-builder
  "Creates a  `CfnPromptProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-prompt-props-builder (new CfnPromptProps$Builder) id config))


(defn build-cfn-queue-builder
  "The build-cfn-queue-builder function updates a CfnQueue$Builder instance using the provided configuration.
  The function takes the CfnQueue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnQueue$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :hours-of-operation-arn)]
    (. builder hoursOfOperationArn data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :max-contacts)]
    (. builder maxContacts data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :outbound-caller-config)]
    (. builder outboundCallerConfig data))
  (when-some [data (lookup-entry config id :quick-connect-arns)]
    (. builder quickConnectArns data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-queue-builder
  "Creates a  `CfnQueue$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-queue-builder (CfnQueue$Builder/create scope (name id)) id config))


(defn build-cfn-queue-outbound-caller-config-property-builder
  "The build-cfn-queue-outbound-caller-config-property-builder function updates a CfnQueue$OutboundCallerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnQueue$OutboundCallerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `outboundCallerIdName` | java.lang.String | [[cdk.support/lookup-entry]] | `:outbound-caller-id-name` |
| `outboundCallerIdNumberArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outbound-caller-id-number-arn` |
| `outboundFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outbound-flow-arn` |
"
  [^CfnQueue$OutboundCallerConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :outbound-caller-id-name)]
    (. builder outboundCallerIdName data))
  (when-some [data (lookup-entry config id :outbound-caller-id-number-arn)]
    (. builder outboundCallerIdNumberArn data))
  (when-some [data (lookup-entry config id :outbound-flow-arn)]
    (. builder outboundFlowArn data))
  (.build builder))


(defn cfn-queue-outbound-caller-config-property-builder
  "Creates a  `CfnQueue$OutboundCallerConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-queue-outbound-caller-config-property-builder (new CfnQueue$OutboundCallerConfigProperty$Builder) id config))


(defn build-cfn-queue-props-builder
  "The build-cfn-queue-props-builder function updates a CfnQueueProps$Builder instance using the provided configuration.
  The function takes the CfnQueueProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnQueueProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :hours-of-operation-arn)]
    (. builder hoursOfOperationArn data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :max-contacts)]
    (. builder maxContacts data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :outbound-caller-config)]
    (. builder outboundCallerConfig data))
  (when-some [data (lookup-entry config id :quick-connect-arns)]
    (. builder quickConnectArns data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-queue-props-builder
  "Creates a  `CfnQueueProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-queue-props-builder (new CfnQueueProps$Builder) id config))


(defn build-cfn-quick-connect-builder
  "The build-cfn-quick-connect-builder function updates a CfnQuickConnect$Builder instance using the provided configuration.
  The function takes the CfnQuickConnect$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `quickConnectConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:quick-connect-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnQuickConnect$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :quick-connect-config)]
    (. builder quickConnectConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-quick-connect-builder
  "Creates a  `CfnQuickConnect$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-quick-connect-builder (CfnQuickConnect$Builder/create scope (name id)) id config))


(defn build-cfn-quick-connect-phone-number-quick-connect-config-property-builder
  "The build-cfn-quick-connect-phone-number-quick-connect-config-property-builder function updates a CfnQuickConnect$PhoneNumberQuickConnectConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnQuickConnect$PhoneNumberQuickConnectConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `phoneNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone-number` |
"
  [^CfnQuickConnect$PhoneNumberQuickConnectConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :phone-number)]
    (. builder phoneNumber data))
  (.build builder))


(defn cfn-quick-connect-phone-number-quick-connect-config-property-builder
  "Creates a  `CfnQuickConnect$PhoneNumberQuickConnectConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-quick-connect-phone-number-quick-connect-config-property-builder (new CfnQuickConnect$PhoneNumberQuickConnectConfigProperty$Builder) id config))


(defn build-cfn-quick-connect-props-builder
  "The build-cfn-quick-connect-props-builder function updates a CfnQuickConnectProps$Builder instance using the provided configuration.
  The function takes the CfnQuickConnectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `quickConnectConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:quick-connect-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnQuickConnectProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :quick-connect-config)]
    (. builder quickConnectConfig data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-quick-connect-props-builder
  "Creates a  `CfnQuickConnectProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-quick-connect-props-builder (new CfnQuickConnectProps$Builder) id config))


(defn build-cfn-quick-connect-queue-quick-connect-config-property-builder
  "The build-cfn-quick-connect-queue-quick-connect-config-property-builder function updates a CfnQuickConnect$QueueQuickConnectConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnQuickConnect$QueueQuickConnectConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-flow-arn` |
| `queueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-arn` |
"
  [^CfnQuickConnect$QueueQuickConnectConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :contact-flow-arn)]
    (. builder contactFlowArn data))
  (when-some [data (lookup-entry config id :queue-arn)]
    (. builder queueArn data))
  (.build builder))


(defn cfn-quick-connect-queue-quick-connect-config-property-builder
  "Creates a  `CfnQuickConnect$QueueQuickConnectConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-quick-connect-queue-quick-connect-config-property-builder (new CfnQuickConnect$QueueQuickConnectConfigProperty$Builder) id config))


(defn build-cfn-quick-connect-quick-connect-config-property-builder
  "The build-cfn-quick-connect-quick-connect-config-property-builder function updates a CfnQuickConnect$QuickConnectConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnQuickConnect$QuickConnectConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `phoneConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:phone-config` |
| `queueConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:queue-config` |
| `quickConnectType` | java.lang.String | [[cdk.support/lookup-entry]] | `:quick-connect-type` |
| `userConfig` | software.amazon.awscdk.services.connect.CfnQuickConnect$UserQuickConnectConfigProperty | [[cdk.support/lookup-entry]] | `:user-config` |
"
  [^CfnQuickConnect$QuickConnectConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :phone-config)]
    (. builder phoneConfig data))
  (when-some [data (lookup-entry config id :queue-config)]
    (. builder queueConfig data))
  (when-some [data (lookup-entry config id :quick-connect-type)]
    (. builder quickConnectType data))
  (when-some [data (lookup-entry config id :user-config)]
    (. builder userConfig data))
  (.build builder))


(defn cfn-quick-connect-quick-connect-config-property-builder
  "Creates a  `CfnQuickConnect$QuickConnectConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-quick-connect-quick-connect-config-property-builder (new CfnQuickConnect$QuickConnectConfigProperty$Builder) id config))


(defn build-cfn-quick-connect-user-quick-connect-config-property-builder
  "The build-cfn-quick-connect-user-quick-connect-config-property-builder function updates a CfnQuickConnect$UserQuickConnectConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnQuickConnect$UserQuickConnectConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-flow-arn` |
| `userArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-arn` |
"
  [^CfnQuickConnect$UserQuickConnectConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :contact-flow-arn)]
    (. builder contactFlowArn data))
  (when-some [data (lookup-entry config id :user-arn)]
    (. builder userArn data))
  (.build builder))


(defn cfn-quick-connect-user-quick-connect-config-property-builder
  "Creates a  `CfnQuickConnect$UserQuickConnectConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-quick-connect-user-quick-connect-config-property-builder (new CfnQuickConnect$UserQuickConnectConfigProperty$Builder) id config))


(defn build-cfn-routing-profile-builder
  "The build-cfn-routing-profile-builder function updates a CfnRoutingProfile$Builder instance using the provided configuration.
  The function takes the CfnRoutingProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentAvailabilityTimer` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-availability-timer` |
| `defaultOutboundQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-outbound-queue-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `mediaConcurrencies` | java.util.List | [[cdk.support/lookup-entry]] | `:media-concurrencies` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queueConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:queue-configs` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRoutingProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-availability-timer)]
    (. builder agentAvailabilityTimer data))
  (when-some [data (lookup-entry config id :default-outbound-queue-arn)]
    (. builder defaultOutboundQueueArn data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :media-concurrencies)]
    (. builder mediaConcurrencies data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :queue-configs)]
    (. builder queueConfigs data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-routing-profile-builder
  "Creates a  `CfnRoutingProfile$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-routing-profile-builder (CfnRoutingProfile$Builder/create scope (name id)) id config))


(defn build-cfn-routing-profile-cross-channel-behavior-property-builder
  "The build-cfn-routing-profile-cross-channel-behavior-property-builder function updates a CfnRoutingProfile$CrossChannelBehaviorProperty$Builder instance using the provided configuration.
  The function takes the CfnRoutingProfile$CrossChannelBehaviorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behaviorType` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior-type` |
"
  [^CfnRoutingProfile$CrossChannelBehaviorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :behavior-type)]
    (. builder behaviorType data))
  (.build builder))


(defn cfn-routing-profile-cross-channel-behavior-property-builder
  "Creates a  `CfnRoutingProfile$CrossChannelBehaviorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-routing-profile-cross-channel-behavior-property-builder (new CfnRoutingProfile$CrossChannelBehaviorProperty$Builder) id config))


(defn build-cfn-routing-profile-media-concurrency-property-builder
  "The build-cfn-routing-profile-media-concurrency-property-builder function updates a CfnRoutingProfile$MediaConcurrencyProperty$Builder instance using the provided configuration.
  The function takes the CfnRoutingProfile$MediaConcurrencyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channel` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel` |
| `concurrency` | java.lang.Number | [[cdk.support/lookup-entry]] | `:concurrency` |
| `crossChannelBehavior` | software.amazon.awscdk.services.connect.CfnRoutingProfile$CrossChannelBehaviorProperty | [[cdk.support/lookup-entry]] | `:cross-channel-behavior` |
"
  [^CfnRoutingProfile$MediaConcurrencyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :channel)]
    (. builder channel data))
  (when-some [data (lookup-entry config id :concurrency)]
    (. builder concurrency data))
  (when-some [data (lookup-entry config id :cross-channel-behavior)]
    (. builder crossChannelBehavior data))
  (.build builder))


(defn cfn-routing-profile-media-concurrency-property-builder
  "Creates a  `CfnRoutingProfile$MediaConcurrencyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-routing-profile-media-concurrency-property-builder (new CfnRoutingProfile$MediaConcurrencyProperty$Builder) id config))


(defn build-cfn-routing-profile-props-builder
  "The build-cfn-routing-profile-props-builder function updates a CfnRoutingProfileProps$Builder instance using the provided configuration.
  The function takes the CfnRoutingProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentAvailabilityTimer` | java.lang.String | [[cdk.support/lookup-entry]] | `:agent-availability-timer` |
| `defaultOutboundQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-outbound-queue-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `mediaConcurrencies` | java.util.List | [[cdk.support/lookup-entry]] | `:media-concurrencies` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queueConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:queue-configs` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRoutingProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :agent-availability-timer)]
    (. builder agentAvailabilityTimer data))
  (when-some [data (lookup-entry config id :default-outbound-queue-arn)]
    (. builder defaultOutboundQueueArn data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :media-concurrencies)]
    (. builder mediaConcurrencies data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :queue-configs)]
    (. builder queueConfigs data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-routing-profile-props-builder
  "Creates a  `CfnRoutingProfileProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-routing-profile-props-builder (new CfnRoutingProfileProps$Builder) id config))


(defn build-cfn-routing-profile-routing-profile-queue-config-property-builder
  "The build-cfn-routing-profile-routing-profile-queue-config-property-builder function updates a CfnRoutingProfile$RoutingProfileQueueConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnRoutingProfile$RoutingProfileQueueConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `delay` | java.lang.Number | [[cdk.support/lookup-entry]] | `:delay` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `queueReference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:queue-reference` |
"
  [^CfnRoutingProfile$RoutingProfileQueueConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :delay)]
    (. builder delay data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :queue-reference)]
    (. builder queueReference data))
  (.build builder))


(defn cfn-routing-profile-routing-profile-queue-config-property-builder
  "Creates a  `CfnRoutingProfile$RoutingProfileQueueConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-routing-profile-routing-profile-queue-config-property-builder (new CfnRoutingProfile$RoutingProfileQueueConfigProperty$Builder) id config))


(defn build-cfn-routing-profile-routing-profile-queue-reference-property-builder
  "The build-cfn-routing-profile-routing-profile-queue-reference-property-builder function updates a CfnRoutingProfile$RoutingProfileQueueReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnRoutingProfile$RoutingProfileQueueReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `channel` | java.lang.String | [[cdk.support/lookup-entry]] | `:channel` |
| `queueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:queue-arn` |
"
  [^CfnRoutingProfile$RoutingProfileQueueReferenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :channel)]
    (. builder channel data))
  (when-some [data (lookup-entry config id :queue-arn)]
    (. builder queueArn data))
  (.build builder))


(defn cfn-routing-profile-routing-profile-queue-reference-property-builder
  "Creates a  `CfnRoutingProfile$RoutingProfileQueueReferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-routing-profile-routing-profile-queue-reference-property-builder (new CfnRoutingProfile$RoutingProfileQueueReferenceProperty$Builder) id config))


(defn build-cfn-rule-actions-property-builder
  "The build-cfn-rule-actions-property-builder function updates a CfnRule$ActionsProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$ActionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignContactCategoryActions` | java.util.List | [[cdk.support/lookup-entry]] | `:assign-contact-category-actions` |
| `createCaseActions` | java.util.List | [[cdk.support/lookup-entry]] | `:create-case-actions` |
| `endAssociatedTasksActions` | java.util.List | [[cdk.support/lookup-entry]] | `:end-associated-tasks-actions` |
| `eventBridgeActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-bridge-actions` |
| `sendNotificationActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:send-notification-actions` |
| `taskActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:task-actions` |
| `updateCaseActions` | java.util.List | [[cdk.support/lookup-entry]] | `:update-case-actions` |
"
  [^CfnRule$ActionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-contact-category-actions)]
    (. builder assignContactCategoryActions data))
  (when-some [data (lookup-entry config id :create-case-actions)]
    (. builder createCaseActions data))
  (when-some [data (lookup-entry config id :end-associated-tasks-actions)]
    (. builder endAssociatedTasksActions data))
  (when-some [data (lookup-entry config id :event-bridge-actions)]
    (. builder eventBridgeActions data))
  (when-some [data (lookup-entry config id :send-notification-actions)]
    (. builder sendNotificationActions data))
  (when-some [data (lookup-entry config id :task-actions)]
    (. builder taskActions data))
  (when-some [data (lookup-entry config id :update-case-actions)]
    (. builder updateCaseActions data))
  (.build builder))


(defn cfn-rule-actions-property-builder
  "Creates a  `CfnRule$ActionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-actions-property-builder (new CfnRule$ActionsProperty$Builder) id config))


(defn build-cfn-rule-builder
  "The build-cfn-rule-builder function updates a CfnRule$Builder instance using the provided configuration.
  The function takes the CfnRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `function` | java.lang.String | [[cdk.support/lookup-entry]] | `:function` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publishStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:publish-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggerEventSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:trigger-event-source` |
"
  [^CfnRule$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :function)]
    (. builder function data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :publish-status)]
    (. builder publishStatus data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :trigger-event-source)]
    (. builder triggerEventSource data))
  (.build builder))


(defn cfn-rule-builder
  "Creates a  `CfnRule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-rule-builder (CfnRule$Builder/create scope (name id)) id config))


(defn build-cfn-rule-create-case-action-property-builder
  "The build-cfn-rule-create-case-action-property-builder function updates a CfnRule$CreateCaseActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$CreateCaseActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fields` |
| `templateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-id` |
"
  [^CfnRule$CreateCaseActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :template-id)]
    (. builder templateId data))
  (.build builder))


(defn cfn-rule-create-case-action-property-builder
  "Creates a  `CfnRule$CreateCaseActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-create-case-action-property-builder (new CfnRule$CreateCaseActionProperty$Builder) id config))


(defn build-cfn-rule-event-bridge-action-property-builder
  "The build-cfn-rule-event-bridge-action-property-builder function updates a CfnRule$EventBridgeActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$EventBridgeActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnRule$EventBridgeActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-rule-event-bridge-action-property-builder
  "Creates a  `CfnRule$EventBridgeActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-event-bridge-action-property-builder (new CfnRule$EventBridgeActionProperty$Builder) id config))


(defn build-cfn-rule-field-property-builder
  "The build-cfn-rule-field-property-builder function updates a CfnRule$FieldProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$FieldProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `value` | software.amazon.awscdk.services.connect.CfnRule$FieldValueProperty | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRule$FieldProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-rule-field-property-builder
  "Creates a  `CfnRule$FieldProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-field-property-builder (new CfnRule$FieldProperty$Builder) id config))


(defn build-cfn-rule-field-value-property-builder
  "The build-cfn-rule-field-value-property-builder function updates a CfnRule$FieldValueProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$FieldValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:double-value` |
| `emptyValue` | java.lang.Object | [[cdk.support/lookup-entry]] | `:empty-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
"
  [^CfnRule$FieldValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :boolean-value)]
    (. builder booleanValue data))
  (when-some [data (lookup-entry config id :double-value)]
    (. builder doubleValue data))
  (when-some [data (lookup-entry config id :empty-value)]
    (. builder emptyValue data))
  (when-some [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn cfn-rule-field-value-property-builder
  "Creates a  `CfnRule$FieldValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-field-value-property-builder (new CfnRule$FieldValueProperty$Builder) id config))


(defn build-cfn-rule-notification-recipient-type-property-builder
  "The build-cfn-rule-notification-recipient-type-property-builder function updates a CfnRule$NotificationRecipientTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$NotificationRecipientTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `userArns` | java.util.List | [[cdk.support/lookup-entry]] | `:user-arns` |
| `userTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-tags` |
"
  [^CfnRule$NotificationRecipientTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :user-arns)]
    (. builder userArns data))
  (when-some [data (lookup-entry config id :user-tags)]
    (. builder userTags data))
  (.build builder))


(defn cfn-rule-notification-recipient-type-property-builder
  "Creates a  `CfnRule$NotificationRecipientTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-notification-recipient-type-property-builder (new CfnRule$NotificationRecipientTypeProperty$Builder) id config))


(defn build-cfn-rule-props-builder
  "The build-cfn-rule-props-builder function updates a CfnRuleProps$Builder instance using the provided configuration.
  The function takes the CfnRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:actions` |
| `function` | java.lang.String | [[cdk.support/lookup-entry]] | `:function` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publishStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:publish-status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `triggerEventSource` | software.amazon.awscdk.services.connect.CfnRule$RuleTriggerEventSourceProperty | [[cdk.support/lookup-entry]] | `:trigger-event-source` |
"
  [^CfnRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :function)]
    (. builder function data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :publish-status)]
    (. builder publishStatus data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :trigger-event-source)]
    (. builder triggerEventSource data))
  (.build builder))


(defn cfn-rule-props-builder
  "Creates a  `CfnRuleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-props-builder (new CfnRuleProps$Builder) id config))


(defn build-cfn-rule-reference-property-builder
  "The build-cfn-rule-reference-property-builder function updates a CfnRule$ReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$ReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRule$ReferenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-rule-reference-property-builder
  "Creates a  `CfnRule$ReferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-reference-property-builder (new CfnRule$ReferenceProperty$Builder) id config))


(defn build-cfn-rule-rule-trigger-event-source-property-builder
  "The build-cfn-rule-rule-trigger-event-source-property-builder function updates a CfnRule$RuleTriggerEventSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$RuleTriggerEventSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-source-name` |
| `integrationAssociationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:integration-association-arn` |
"
  [^CfnRule$RuleTriggerEventSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :event-source-name)]
    (. builder eventSourceName data))
  (when-some [data (lookup-entry config id :integration-association-arn)]
    (. builder integrationAssociationArn data))
  (.build builder))


(defn cfn-rule-rule-trigger-event-source-property-builder
  "Creates a  `CfnRule$RuleTriggerEventSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-rule-trigger-event-source-property-builder (new CfnRule$RuleTriggerEventSourceProperty$Builder) id config))


(defn build-cfn-rule-send-notification-action-property-builder
  "The build-cfn-rule-send-notification-action-property-builder function updates a CfnRule$SendNotificationActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$SendNotificationActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
| `deliveryMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-method` |
| `recipient` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recipient` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
"
  [^CfnRule$SendNotificationActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (when-some [data (lookup-entry config id :delivery-method)]
    (. builder deliveryMethod data))
  (when-some [data (lookup-entry config id :recipient)]
    (. builder recipient data))
  (when-some [data (lookup-entry config id :subject)]
    (. builder subject data))
  (.build builder))


(defn cfn-rule-send-notification-action-property-builder
  "Creates a  `CfnRule$SendNotificationActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-send-notification-action-property-builder (new CfnRule$SendNotificationActionProperty$Builder) id config))


(defn build-cfn-rule-task-action-property-builder
  "The build-cfn-rule-task-action-property-builder function updates a CfnRule$TaskActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$TaskActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-flow-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `references` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:references` |
"
  [^CfnRule$TaskActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :contact-flow-arn)]
    (. builder contactFlowArn data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :references)]
    (. builder references data))
  (.build builder))


(defn cfn-rule-task-action-property-builder
  "Creates a  `CfnRule$TaskActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-task-action-property-builder (new CfnRule$TaskActionProperty$Builder) id config))


(defn build-cfn-rule-update-case-action-property-builder
  "The build-cfn-rule-update-case-action-property-builder function updates a CfnRule$UpdateCaseActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$UpdateCaseActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fields` |
"
  [^CfnRule$UpdateCaseActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (.build builder))


(defn cfn-rule-update-case-action-property-builder
  "Creates a  `CfnRule$UpdateCaseActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-rule-update-case-action-property-builder (new CfnRule$UpdateCaseActionProperty$Builder) id config))


(defn build-cfn-security-key-builder
  "The build-cfn-security-key-builder function updates a CfnSecurityKey$Builder instance using the provided configuration.
  The function takes the CfnSecurityKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
"
  [^CfnSecurityKey$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (.build builder))


(defn cfn-security-key-builder
  "Creates a  `CfnSecurityKey$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-security-key-builder (CfnSecurityKey$Builder/create scope (name id)) id config))


(defn build-cfn-security-key-props-builder
  "The build-cfn-security-key-props-builder function updates a CfnSecurityKeyProps$Builder instance using the provided configuration.
  The function takes the CfnSecurityKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
"
  [^CfnSecurityKeyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (.build builder))


(defn cfn-security-key-props-builder
  "Creates a  `CfnSecurityKeyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-security-key-props-builder (new CfnSecurityKeyProps$Builder) id config))


(defn build-cfn-security-profile-application-property-builder
  "The build-cfn-security-profile-application-property-builder function updates a CfnSecurityProfile$ApplicationProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$ApplicationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationPermissions` | java.util.List | [[cdk.support/lookup-entry]] | `:application-permissions` |
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnSecurityProfile$ApplicationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :application-permissions)]
    (. builder applicationPermissions data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-security-profile-application-property-builder
  "Creates a  `CfnSecurityProfile$ApplicationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-security-profile-application-property-builder (new CfnSecurityProfile$ApplicationProperty$Builder) id config))


(defn build-cfn-security-profile-builder
  "The build-cfn-security-profile-builder function updates a CfnSecurityProfile$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfile$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSecurityProfile$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-access-control-hierarchy-group-id)]
    (. builder allowedAccessControlHierarchyGroupId data))
  (when-some [data (lookup-entry config id :allowed-access-control-tags)]
    (. builder allowedAccessControlTags data))
  (when-some [data (lookup-entry config id :applications)]
    (. builder applications data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :hierarchy-restricted-resources)]
    (. builder hierarchyRestrictedResources data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (when-some [data (lookup-entry config id :security-profile-name)]
    (. builder securityProfileName data))
  (when-some [data (lookup-entry config id :tag-restricted-resources)]
    (. builder tagRestrictedResources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-security-profile-builder
  "Creates a  `CfnSecurityProfile$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-security-profile-builder (CfnSecurityProfile$Builder/create scope (name id)) id config))


(defn build-cfn-security-profile-props-builder
  "The build-cfn-security-profile-props-builder function updates a CfnSecurityProfileProps$Builder instance using the provided configuration.
  The function takes the CfnSecurityProfileProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSecurityProfileProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-access-control-hierarchy-group-id)]
    (. builder allowedAccessControlHierarchyGroupId data))
  (when-some [data (lookup-entry config id :allowed-access-control-tags)]
    (. builder allowedAccessControlTags data))
  (when-some [data (lookup-entry config id :applications)]
    (. builder applications data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :hierarchy-restricted-resources)]
    (. builder hierarchyRestrictedResources data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :permissions)]
    (. builder permissions data))
  (when-some [data (lookup-entry config id :security-profile-name)]
    (. builder securityProfileName data))
  (when-some [data (lookup-entry config id :tag-restricted-resources)]
    (. builder tagRestrictedResources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-security-profile-props-builder
  "Creates a  `CfnSecurityProfileProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-security-profile-props-builder (new CfnSecurityProfileProps$Builder) id config))


(defn build-cfn-task-template-builder
  "The build-cfn-task-template-builder function updates a CfnTaskTemplate$Builder instance using the provided configuration.
  The function takes the CfnTaskTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTaskTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-some [data (lookup-entry config id :constraints)]
    (. builder constraints data))
  (when-some [data (lookup-entry config id :contact-flow-arn)]
    (. builder contactFlowArn data))
  (when-some [data (lookup-entry config id :defaults)]
    (. builder defaults data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-task-template-builder
  "Creates a  `CfnTaskTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-task-template-builder (CfnTaskTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-task-template-constraints-property-builder
  "The build-cfn-task-template-constraints-property-builder function updates a CfnTaskTemplate$ConstraintsProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskTemplate$ConstraintsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invisibleFields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:invisible-fields` |
| `readOnlyFields` | java.util.List | [[cdk.support/lookup-entry]] | `:read-only-fields` |
| `requiredFields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:required-fields` |
"
  [^CfnTaskTemplate$ConstraintsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :invisible-fields)]
    (. builder invisibleFields data))
  (when-some [data (lookup-entry config id :read-only-fields)]
    (. builder readOnlyFields data))
  (when-some [data (lookup-entry config id :required-fields)]
    (. builder requiredFields data))
  (.build builder))


(defn cfn-task-template-constraints-property-builder
  "Creates a  `CfnTaskTemplate$ConstraintsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-task-template-constraints-property-builder (new CfnTaskTemplate$ConstraintsProperty$Builder) id config))


(defn build-cfn-task-template-default-field-value-property-builder
  "The build-cfn-task-template-default-field-value-property-builder function updates a CfnTaskTemplate$DefaultFieldValueProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskTemplate$DefaultFieldValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `id` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnTaskTemplate$DefaultFieldValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn cfn-task-template-default-field-value-property-builder
  "Creates a  `CfnTaskTemplate$DefaultFieldValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-task-template-default-field-value-property-builder (new CfnTaskTemplate$DefaultFieldValueProperty$Builder) id config))


(defn build-cfn-task-template-field-identifier-property-builder
  "The build-cfn-task-template-field-identifier-property-builder function updates a CfnTaskTemplate$FieldIdentifierProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskTemplate$FieldIdentifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnTaskTemplate$FieldIdentifierProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-task-template-field-identifier-property-builder
  "Creates a  `CfnTaskTemplate$FieldIdentifierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-task-template-field-identifier-property-builder (new CfnTaskTemplate$FieldIdentifierProperty$Builder) id config))


(defn build-cfn-task-template-field-property-builder
  "The build-cfn-task-template-field-property-builder function updates a CfnTaskTemplate$FieldProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskTemplate$FieldProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `id` | software.amazon.awscdk.services.connect.CfnTaskTemplate$FieldIdentifierProperty | [[cdk.support/lookup-entry]] | `:id` |
| `singleSelectOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:single-select-options` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnTaskTemplate$FieldProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :single-select-options)]
    (. builder singleSelectOptions data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-task-template-field-property-builder
  "Creates a  `CfnTaskTemplate$FieldProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-task-template-field-property-builder (new CfnTaskTemplate$FieldProperty$Builder) id config))


(defn build-cfn-task-template-invisible-field-info-property-builder
  "The build-cfn-task-template-invisible-field-info-property-builder function updates a CfnTaskTemplate$InvisibleFieldInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskTemplate$InvisibleFieldInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnTaskTemplate$InvisibleFieldInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn cfn-task-template-invisible-field-info-property-builder
  "Creates a  `CfnTaskTemplate$InvisibleFieldInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-task-template-invisible-field-info-property-builder (new CfnTaskTemplate$InvisibleFieldInfoProperty$Builder) id config))


(defn build-cfn-task-template-props-builder
  "The build-cfn-task-template-props-builder function updates a CfnTaskTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnTaskTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTaskTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :client-token)]
    (. builder clientToken data))
  (when-some [data (lookup-entry config id :constraints)]
    (. builder constraints data))
  (when-some [data (lookup-entry config id :contact-flow-arn)]
    (. builder contactFlowArn data))
  (when-some [data (lookup-entry config id :defaults)]
    (. builder defaults data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-task-template-props-builder
  "Creates a  `CfnTaskTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-task-template-props-builder (new CfnTaskTemplateProps$Builder) id config))


(defn build-cfn-task-template-read-only-field-info-property-builder
  "The build-cfn-task-template-read-only-field-info-property-builder function updates a CfnTaskTemplate$ReadOnlyFieldInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskTemplate$ReadOnlyFieldInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnTaskTemplate$ReadOnlyFieldInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn cfn-task-template-read-only-field-info-property-builder
  "Creates a  `CfnTaskTemplate$ReadOnlyFieldInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-task-template-read-only-field-info-property-builder (new CfnTaskTemplate$ReadOnlyFieldInfoProperty$Builder) id config))


(defn build-cfn-task-template-required-field-info-property-builder
  "The build-cfn-task-template-required-field-info-property-builder function updates a CfnTaskTemplate$RequiredFieldInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnTaskTemplate$RequiredFieldInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnTaskTemplate$RequiredFieldInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn cfn-task-template-required-field-info-property-builder
  "Creates a  `CfnTaskTemplate$RequiredFieldInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-task-template-required-field-info-property-builder (new CfnTaskTemplate$RequiredFieldInfoProperty$Builder) id config))


(defn build-cfn-traffic-distribution-group-builder
  "The build-cfn-traffic-distribution-group-builder function updates a CfnTrafficDistributionGroup$Builder instance using the provided configuration.
  The function takes the CfnTrafficDistributionGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTrafficDistributionGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-traffic-distribution-group-builder
  "Creates a  `CfnTrafficDistributionGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-traffic-distribution-group-builder (CfnTrafficDistributionGroup$Builder/create scope (name id)) id config))


(defn build-cfn-traffic-distribution-group-props-builder
  "The build-cfn-traffic-distribution-group-props-builder function updates a CfnTrafficDistributionGroupProps$Builder instance using the provided configuration.
  The function takes the CfnTrafficDistributionGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnTrafficDistributionGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-traffic-distribution-group-props-builder
  "Creates a  `CfnTrafficDistributionGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-traffic-distribution-group-props-builder (new CfnTrafficDistributionGroupProps$Builder) id config))


(defn build-cfn-user-builder
  "The build-cfn-user-builder function updates a CfnUser$Builder instance using the provided configuration.
  The function takes the CfnUser$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnUser$Builder builder id config]
  (when-some [data (lookup-entry config id :directory-user-id)]
    (. builder directoryUserId data))
  (when-some [data (lookup-entry config id :hierarchy-group-arn)]
    (. builder hierarchyGroupArn data))
  (when-some [data (lookup-entry config id :identity-info)]
    (. builder identityInfo data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :phone-config)]
    (. builder phoneConfig data))
  (when-some [data (lookup-entry config id :routing-profile-arn)]
    (. builder routingProfileArn data))
  (when-some [data (lookup-entry config id :security-profile-arns)]
    (. builder securityProfileArns data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-proficiencies)]
    (. builder userProficiencies data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-user-builder
  "Creates a  `CfnUser$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-user-builder (CfnUser$Builder/create scope (name id)) id config))


(defn build-cfn-user-hierarchy-group-builder
  "The build-cfn-user-hierarchy-group-builder function updates a CfnUserHierarchyGroup$Builder instance using the provided configuration.
  The function takes the CfnUserHierarchyGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-group-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnUserHierarchyGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parent-group-arn)]
    (. builder parentGroupArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-user-hierarchy-group-builder
  "Creates a  `CfnUserHierarchyGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-user-hierarchy-group-builder (CfnUserHierarchyGroup$Builder/create scope (name id)) id config))


(defn build-cfn-user-hierarchy-group-props-builder
  "The build-cfn-user-hierarchy-group-props-builder function updates a CfnUserHierarchyGroupProps$Builder instance using the provided configuration.
  The function takes the CfnUserHierarchyGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-group-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnUserHierarchyGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parent-group-arn)]
    (. builder parentGroupArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-user-hierarchy-group-props-builder
  "Creates a  `CfnUserHierarchyGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-hierarchy-group-props-builder (new CfnUserHierarchyGroupProps$Builder) id config))


(defn build-cfn-user-props-builder
  "The build-cfn-user-props-builder function updates a CfnUserProps$Builder instance using the provided configuration.
  The function takes the CfnUserProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |
"
  [^CfnUserProps$Builder builder id config]
  (when-some [data (lookup-entry config id :directory-user-id)]
    (. builder directoryUserId data))
  (when-some [data (lookup-entry config id :hierarchy-group-arn)]
    (. builder hierarchyGroupArn data))
  (when-some [data (lookup-entry config id :identity-info)]
    (. builder identityInfo data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :password)]
    (. builder password data))
  (when-some [data (lookup-entry config id :phone-config)]
    (. builder phoneConfig data))
  (when-some [data (lookup-entry config id :routing-profile-arn)]
    (. builder routingProfileArn data))
  (when-some [data (lookup-entry config id :security-profile-arns)]
    (. builder securityProfileArns data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :user-proficiencies)]
    (. builder userProficiencies data))
  (when-some [data (lookup-entry config id :username)]
    (. builder username data))
  (.build builder))


(defn cfn-user-props-builder
  "Creates a  `CfnUserProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-props-builder (new CfnUserProps$Builder) id config))


(defn build-cfn-user-user-identity-info-property-builder
  "The build-cfn-user-user-identity-info-property-builder function updates a CfnUser$UserIdentityInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnUser$UserIdentityInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `email` | java.lang.String | [[cdk.support/lookup-entry]] | `:email` |
| `firstName` | java.lang.String | [[cdk.support/lookup-entry]] | `:first-name` |
| `lastName` | java.lang.String | [[cdk.support/lookup-entry]] | `:last-name` |
| `mobile` | java.lang.String | [[cdk.support/lookup-entry]] | `:mobile` |
| `secondaryEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:secondary-email` |
"
  [^CfnUser$UserIdentityInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :email)]
    (. builder email data))
  (when-some [data (lookup-entry config id :first-name)]
    (. builder firstName data))
  (when-some [data (lookup-entry config id :last-name)]
    (. builder lastName data))
  (when-some [data (lookup-entry config id :mobile)]
    (. builder mobile data))
  (when-some [data (lookup-entry config id :secondary-email)]
    (. builder secondaryEmail data))
  (.build builder))


(defn cfn-user-user-identity-info-property-builder
  "Creates a  `CfnUser$UserIdentityInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-user-identity-info-property-builder (new CfnUser$UserIdentityInfoProperty$Builder) id config))


(defn build-cfn-user-user-phone-config-property-builder
  "The build-cfn-user-user-phone-config-property-builder function updates a CfnUser$UserPhoneConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnUser$UserPhoneConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `afterContactWorkTimeLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:after-contact-work-time-limit` |
| `autoAccept` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-accept` |
| `deskPhoneNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:desk-phone-number` |
| `phoneType` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone-type` |
"
  [^CfnUser$UserPhoneConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :after-contact-work-time-limit)]
    (. builder afterContactWorkTimeLimit data))
  (when-some [data (lookup-entry config id :auto-accept)]
    (. builder autoAccept data))
  (when-some [data (lookup-entry config id :desk-phone-number)]
    (. builder deskPhoneNumber data))
  (when-some [data (lookup-entry config id :phone-type)]
    (. builder phoneType data))
  (.build builder))


(defn cfn-user-user-phone-config-property-builder
  "Creates a  `CfnUser$UserPhoneConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-user-phone-config-property-builder (new CfnUser$UserPhoneConfigProperty$Builder) id config))


(defn build-cfn-user-user-proficiency-property-builder
  "The build-cfn-user-user-proficiency-property-builder function updates a CfnUser$UserProficiencyProperty$Builder instance using the provided configuration.
  The function takes the CfnUser$UserProficiencyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-name` |
| `attributeValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-value` |
| `level` | java.lang.Number | [[cdk.support/lookup-entry]] | `:level` |
"
  [^CfnUser$UserProficiencyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute-name)]
    (. builder attributeName data))
  (when-some [data (lookup-entry config id :attribute-value)]
    (. builder attributeValue data))
  (when-some [data (lookup-entry config id :level)]
    (. builder level data))
  (.build builder))


(defn cfn-user-user-proficiency-property-builder
  "Creates a  `CfnUser$UserProficiencyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-user-user-proficiency-property-builder (new CfnUser$UserProficiencyProperty$Builder) id config))


(defn build-cfn-view-builder
  "The build-cfn-view-builder function updates a CfnView$Builder instance using the provided configuration.
  The function takes the CfnView$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `template` | java.lang.Object | [[cdk.support/lookup-entry]] | `:template` |
"
  [^CfnView$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template)]
    (. builder template data))
  (.build builder))


(defn cfn-view-builder
  "Creates a  `CfnView$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-view-builder (CfnView$Builder/create scope (name id)) id config))


(defn build-cfn-view-props-builder
  "The build-cfn-view-props-builder function updates a CfnViewProps$Builder instance using the provided configuration.
  The function takes the CfnViewProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `template` | java.lang.Object | [[cdk.support/lookup-entry]] | `:template` |
"
  [^CfnViewProps$Builder builder id config]
  (when-some [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :template)]
    (. builder template data))
  (.build builder))


(defn cfn-view-props-builder
  "Creates a  `CfnViewProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-view-props-builder (new CfnViewProps$Builder) id config))


(defn build-cfn-view-version-builder
  "The build-cfn-view-version-builder function updates a CfnViewVersion$Builder instance using the provided configuration.
  The function takes the CfnViewVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `versionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-description` |
| `viewArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-arn` |
| `viewContentSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-content-sha256` |
"
  [^CfnViewVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :version-description)]
    (. builder versionDescription data))
  (when-some [data (lookup-entry config id :view-arn)]
    (. builder viewArn data))
  (when-some [data (lookup-entry config id :view-content-sha256)]
    (. builder viewContentSha256 data))
  (.build builder))


(defn cfn-view-version-builder
  "Creates a  `CfnViewVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-view-version-builder (CfnViewVersion$Builder/create scope (name id)) id config))


(defn build-cfn-view-version-props-builder
  "The build-cfn-view-version-props-builder function updates a CfnViewVersionProps$Builder instance using the provided configuration.
  The function takes the CfnViewVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `versionDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-description` |
| `viewArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-arn` |
| `viewContentSha256` | java.lang.String | [[cdk.support/lookup-entry]] | `:view-content-sha256` |
"
  [^CfnViewVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :version-description)]
    (. builder versionDescription data))
  (when-some [data (lookup-entry config id :view-arn)]
    (. builder viewArn data))
  (when-some [data (lookup-entry config id :view-content-sha256)]
    (. builder viewContentSha256 data))
  (.build builder))


(defn cfn-view-version-props-builder
  "Creates a  `CfnViewVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-view-version-props-builder (new CfnViewVersionProps$Builder) id config))