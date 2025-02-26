(ns cdk.api.services.lex
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.lex package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.lex CfnBot$AdvancedRecognitionSettingProperty$Builder
                                                CfnBot$AllowedInputTypesProperty$Builder
                                                CfnBot$AudioAndDTMFInputSpecificationProperty$Builder
                                                CfnBot$AudioLogDestinationProperty$Builder
                                                CfnBot$AudioLogSettingProperty$Builder
                                                CfnBot$AudioSpecificationProperty$Builder
                                                CfnBot$BotAliasLocaleSettingsItemProperty$Builder
                                                CfnBot$BotAliasLocaleSettingsProperty$Builder
                                                CfnBot$BotLocaleProperty$Builder
                                                CfnBot$Builder
                                                CfnBot$ButtonProperty$Builder
                                                CfnBot$CloudWatchLogGroupLogDestinationProperty$Builder
                                                CfnBot$CodeHookSpecificationProperty$Builder
                                                CfnBot$ConditionProperty$Builder
                                                CfnBot$ConditionalBranchProperty$Builder
                                                CfnBot$ConditionalSpecificationProperty$Builder
                                                CfnBot$ConversationLogSettingsProperty$Builder
                                                CfnBot$CustomPayloadProperty$Builder
                                                CfnBot$CustomVocabularyItemProperty$Builder
                                                CfnBot$CustomVocabularyProperty$Builder
                                                CfnBot$DTMFSpecificationProperty$Builder
                                                CfnBot$DataPrivacyProperty$Builder
                                                CfnBot$DefaultConditionalBranchProperty$Builder
                                                CfnBot$DialogActionProperty$Builder
                                                CfnBot$DialogCodeHookInvocationSettingProperty$Builder
                                                CfnBot$DialogCodeHookSettingProperty$Builder
                                                CfnBot$DialogStateProperty$Builder
                                                CfnBot$ElicitationCodeHookInvocationSettingProperty$Builder
                                                CfnBot$ExternalSourceSettingProperty$Builder
                                                CfnBot$FulfillmentCodeHookSettingProperty$Builder
                                                CfnBot$FulfillmentStartResponseSpecificationProperty$Builder
                                                CfnBot$FulfillmentUpdateResponseSpecificationProperty$Builder
                                                CfnBot$FulfillmentUpdatesSpecificationProperty$Builder
                                                CfnBot$GrammarSlotTypeSettingProperty$Builder
                                                CfnBot$GrammarSlotTypeSourceProperty$Builder
                                                CfnBot$ImageResponseCardProperty$Builder
                                                CfnBot$InitialResponseSettingProperty$Builder
                                                CfnBot$InputContextProperty$Builder
                                                CfnBot$IntentClosingSettingProperty$Builder
                                                CfnBot$IntentConfirmationSettingProperty$Builder
                                                CfnBot$IntentOverrideProperty$Builder
                                                CfnBot$IntentProperty$Builder
                                                CfnBot$KendraConfigurationProperty$Builder
                                                CfnBot$LambdaCodeHookProperty$Builder
                                                CfnBot$MessageGroupProperty$Builder
                                                CfnBot$MessageProperty$Builder
                                                CfnBot$MultipleValuesSettingProperty$Builder
                                                CfnBot$ObfuscationSettingProperty$Builder
                                                CfnBot$OutputContextProperty$Builder
                                                CfnBot$PlainTextMessageProperty$Builder
                                                CfnBot$PostDialogCodeHookInvocationSpecificationProperty$Builder
                                                CfnBot$PostFulfillmentStatusSpecificationProperty$Builder
                                                CfnBot$PromptAttemptSpecificationProperty$Builder
                                                CfnBot$PromptSpecificationProperty$Builder
                                                CfnBot$ResponseSpecificationProperty$Builder
                                                CfnBot$S3BucketLogDestinationProperty$Builder
                                                CfnBot$S3LocationProperty$Builder
                                                CfnBot$SSMLMessageProperty$Builder
                                                CfnBot$SampleUtteranceProperty$Builder
                                                CfnBot$SampleValueProperty$Builder
                                                CfnBot$SentimentAnalysisSettingsProperty$Builder
                                                CfnBot$SessionAttributeProperty$Builder
                                                CfnBot$SlotCaptureSettingProperty$Builder
                                                CfnBot$SlotDefaultValueProperty$Builder
                                                CfnBot$SlotDefaultValueSpecificationProperty$Builder
                                                CfnBot$SlotPriorityProperty$Builder
                                                CfnBot$SlotProperty$Builder
                                                CfnBot$SlotTypeProperty$Builder
                                                CfnBot$SlotTypeValueProperty$Builder
                                                CfnBot$SlotValueElicitationSettingProperty$Builder
                                                CfnBot$SlotValueOverrideMapProperty$Builder
                                                CfnBot$SlotValueOverrideProperty$Builder
                                                CfnBot$SlotValueProperty$Builder
                                                CfnBot$SlotValueRegexFilterProperty$Builder
                                                CfnBot$SlotValueSelectionSettingProperty$Builder
                                                CfnBot$StillWaitingResponseSpecificationProperty$Builder
                                                CfnBot$TestBotAliasSettingsProperty$Builder
                                                CfnBot$TextInputSpecificationProperty$Builder
                                                CfnBot$TextLogDestinationProperty$Builder
                                                CfnBot$TextLogSettingProperty$Builder
                                                CfnBot$VoiceSettingsProperty$Builder
                                                CfnBot$WaitAndContinueSpecificationProperty$Builder
                                                CfnBotAlias$AudioLogDestinationProperty$Builder
                                                CfnBotAlias$AudioLogSettingProperty$Builder
                                                CfnBotAlias$BotAliasLocaleSettingsItemProperty$Builder
                                                CfnBotAlias$BotAliasLocaleSettingsProperty$Builder
                                                CfnBotAlias$Builder
                                                CfnBotAlias$CloudWatchLogGroupLogDestinationProperty$Builder
                                                CfnBotAlias$CodeHookSpecificationProperty$Builder
                                                CfnBotAlias$ConversationLogSettingsProperty$Builder
                                                CfnBotAlias$LambdaCodeHookProperty$Builder
                                                CfnBotAlias$S3BucketLogDestinationProperty$Builder
                                                CfnBotAlias$SentimentAnalysisSettingsProperty$Builder
                                                CfnBotAlias$TextLogDestinationProperty$Builder
                                                CfnBotAlias$TextLogSettingProperty$Builder
                                                CfnBotAliasProps$Builder
                                                CfnBotProps$Builder
                                                CfnBotVersion$BotVersionLocaleDetailsProperty$Builder
                                                CfnBotVersion$BotVersionLocaleSpecificationProperty$Builder
                                                CfnBotVersion$Builder
                                                CfnBotVersionProps$Builder
                                                CfnResourcePolicy$Builder
                                                CfnResourcePolicyProps$Builder]))


(defn build-cfn-bot-advanced-recognition-setting-property-builder
  "The build-cfn-bot-advanced-recognition-setting-property-builder function updates a CfnBot$AdvancedRecognitionSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$AdvancedRecognitionSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioRecognitionStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-recognition-strategy` |
"
  [^CfnBot$AdvancedRecognitionSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-recognition-strategy)]
    (. builder audioRecognitionStrategy data))
  (.build builder))


(defn cfn-bot-advanced-recognition-setting-property-builder
  "Creates a  `CfnBot$AdvancedRecognitionSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-advanced-recognition-setting-property-builder (new CfnBot$AdvancedRecognitionSettingProperty$Builder) id config))


(defn build-cfn-bot-alias-audio-log-destination-property-builder
  "The build-cfn-bot-alias-audio-log-destination-property-builder function updates a CfnBotAlias$AudioLogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$AudioLogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-bucket` |
"
  [^CfnBotAlias$AudioLogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (.build builder))


(defn cfn-bot-alias-audio-log-destination-property-builder
  "Creates a  `CfnBotAlias$AudioLogDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-audio-log-destination-property-builder (new CfnBotAlias$AudioLogDestinationProperty$Builder) id config))


(defn build-cfn-bot-alias-audio-log-setting-property-builder
  "The build-cfn-bot-alias-audio-log-setting-property-builder function updates a CfnBotAlias$AudioLogSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$AudioLogSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.lex.CfnBotAlias$AudioLogDestinationProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnBotAlias$AudioLogSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-bot-alias-audio-log-setting-property-builder
  "Creates a  `CfnBotAlias$AudioLogSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-audio-log-setting-property-builder (new CfnBotAlias$AudioLogSettingProperty$Builder) id config))


(defn build-cfn-bot-alias-bot-alias-locale-settings-item-property-builder
  "The build-cfn-bot-alias-bot-alias-locale-settings-item-property-builder function updates a CfnBotAlias$BotAliasLocaleSettingsItemProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$BotAliasLocaleSettingsItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botAliasLocaleSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-locale-setting` |
| `localeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale-id` |
"
  [^CfnBotAlias$BotAliasLocaleSettingsItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bot-alias-locale-setting)]
    (. builder botAliasLocaleSetting data))
  (when-let [data (lookup-entry config id :locale-id)]
    (. builder localeId data))
  (.build builder))


(defn cfn-bot-alias-bot-alias-locale-settings-item-property-builder
  "Creates a  `CfnBotAlias$BotAliasLocaleSettingsItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-bot-alias-locale-settings-item-property-builder (new CfnBotAlias$BotAliasLocaleSettingsItemProperty$Builder) id config))


(defn build-cfn-bot-alias-bot-alias-locale-settings-property-builder
  "The build-cfn-bot-alias-bot-alias-locale-settings-property-builder function updates a CfnBotAlias$BotAliasLocaleSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$BotAliasLocaleSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeHookSpecification` | software.amazon.awscdk.services.lex.CfnBotAlias$CodeHookSpecificationProperty | [[cdk.support/lookup-entry]] | `:code-hook-specification` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnBotAlias$BotAliasLocaleSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-hook-specification)]
    (. builder codeHookSpecification data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-bot-alias-bot-alias-locale-settings-property-builder
  "Creates a  `CfnBotAlias$BotAliasLocaleSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-bot-alias-locale-settings-property-builder (new CfnBotAlias$BotAliasLocaleSettingsProperty$Builder) id config))


(defn build-cfn-bot-alias-builder
  "The build-cfn-bot-alias-builder function updates a CfnBotAlias$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botAliasLocaleSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-locale-settings` |
| `botAliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-alias-name` |
| `botAliasTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-tags` |
| `botId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-id` |
| `botVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-version` |
| `conversationLogSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conversation-log-settings` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sentimentAnalysisSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:sentiment-analysis-settings` |
"
  [^CfnBotAlias$Builder builder id config]
  (when-let [data (lookup-entry config id :bot-alias-locale-settings)]
    (. builder botAliasLocaleSettings data))
  (when-let [data (lookup-entry config id :bot-alias-name)]
    (. builder botAliasName data))
  (when-let [data (lookup-entry config id :bot-alias-tags)]
    (. builder botAliasTags data))
  (when-let [data (lookup-entry config id :bot-id)]
    (. builder botId data))
  (when-let [data (lookup-entry config id :bot-version)]
    (. builder botVersion data))
  (when-let [data (lookup-entry config id :conversation-log-settings)]
    (. builder conversationLogSettings data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :sentiment-analysis-settings)]
    (. builder sentimentAnalysisSettings data))
  (.build builder))


(defn cfn-bot-alias-builder
  "Creates a  `CfnBotAlias$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-bot-alias-builder (CfnBotAlias$Builder/create scope (name id)) id config))


(defn build-cfn-bot-alias-cloud-watch-log-group-log-destination-property-builder
  "The build-cfn-bot-alias-cloud-watch-log-group-log-destination-property-builder function updates a CfnBotAlias$CloudWatchLogGroupLogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$CloudWatchLogGroupLogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-arn` |
| `logPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-prefix` |
"
  [^CfnBotAlias$CloudWatchLogGroupLogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-log-group-arn)]
    (. builder cloudWatchLogGroupArn data))
  (when-let [data (lookup-entry config id :log-prefix)]
    (. builder logPrefix data))
  (.build builder))


(defn cfn-bot-alias-cloud-watch-log-group-log-destination-property-builder
  "Creates a  `CfnBotAlias$CloudWatchLogGroupLogDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-cloud-watch-log-group-log-destination-property-builder (new CfnBotAlias$CloudWatchLogGroupLogDestinationProperty$Builder) id config))


(defn build-cfn-bot-alias-code-hook-specification-property-builder
  "The build-cfn-bot-alias-code-hook-specification-property-builder function updates a CfnBotAlias$CodeHookSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$CodeHookSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaCodeHook` | software.amazon.awscdk.services.lex.CfnBotAlias$LambdaCodeHookProperty | [[cdk.support/lookup-entry]] | `:lambda-code-hook` |
"
  [^CfnBotAlias$CodeHookSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :lambda-code-hook)]
    (. builder lambdaCodeHook data))
  (.build builder))


(defn cfn-bot-alias-code-hook-specification-property-builder
  "Creates a  `CfnBotAlias$CodeHookSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-code-hook-specification-property-builder (new CfnBotAlias$CodeHookSpecificationProperty$Builder) id config))


(defn build-cfn-bot-alias-conversation-log-settings-property-builder
  "The build-cfn-bot-alias-conversation-log-settings-property-builder function updates a CfnBotAlias$ConversationLogSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$ConversationLogSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioLogSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-log-settings` |
| `textLogSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:text-log-settings` |
"
  [^CfnBotAlias$ConversationLogSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-log-settings)]
    (. builder audioLogSettings data))
  (when-let [data (lookup-entry config id :text-log-settings)]
    (. builder textLogSettings data))
  (.build builder))


(defn cfn-bot-alias-conversation-log-settings-property-builder
  "Creates a  `CfnBotAlias$ConversationLogSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-conversation-log-settings-property-builder (new CfnBotAlias$ConversationLogSettingsProperty$Builder) id config))


(defn build-cfn-bot-alias-lambda-code-hook-property-builder
  "The build-cfn-bot-alias-lambda-code-hook-property-builder function updates a CfnBotAlias$LambdaCodeHookProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$LambdaCodeHookProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeHookInterfaceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-hook-interface-version` |
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
"
  [^CfnBotAlias$LambdaCodeHookProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-hook-interface-version)]
    (. builder codeHookInterfaceVersion data))
  (when-let [data (lookup-entry config id :lambda-arn)]
    (. builder lambdaArn data))
  (.build builder))


(defn cfn-bot-alias-lambda-code-hook-property-builder
  "Creates a  `CfnBotAlias$LambdaCodeHookProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-lambda-code-hook-property-builder (new CfnBotAlias$LambdaCodeHookProperty$Builder) id config))


(defn build-cfn-bot-alias-props-builder
  "The build-cfn-bot-alias-props-builder function updates a CfnBotAliasProps$Builder instance using the provided configuration.
  The function takes the CfnBotAliasProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botAliasLocaleSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-locale-settings` |
| `botAliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-alias-name` |
| `botAliasTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-tags` |
| `botId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-id` |
| `botVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-version` |
| `conversationLogSettings` | software.amazon.awscdk.services.lex.CfnBotAlias$ConversationLogSettingsProperty | [[cdk.support/lookup-entry]] | `:conversation-log-settings` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sentimentAnalysisSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:sentiment-analysis-settings` |
"
  [^CfnBotAliasProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bot-alias-locale-settings)]
    (. builder botAliasLocaleSettings data))
  (when-let [data (lookup-entry config id :bot-alias-name)]
    (. builder botAliasName data))
  (when-let [data (lookup-entry config id :bot-alias-tags)]
    (. builder botAliasTags data))
  (when-let [data (lookup-entry config id :bot-id)]
    (. builder botId data))
  (when-let [data (lookup-entry config id :bot-version)]
    (. builder botVersion data))
  (when-let [data (lookup-entry config id :conversation-log-settings)]
    (. builder conversationLogSettings data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :sentiment-analysis-settings)]
    (. builder sentimentAnalysisSettings data))
  (.build builder))


(defn cfn-bot-alias-props-builder
  "Creates a  `CfnBotAliasProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-props-builder (new CfnBotAliasProps$Builder) id config))


(defn build-cfn-bot-alias-s3-bucket-log-destination-property-builder
  "The build-cfn-bot-alias-s3-bucket-log-destination-property-builder function updates a CfnBotAlias$S3BucketLogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$S3BucketLogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `logPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-prefix` |
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |
"
  [^CfnBotAlias$S3BucketLogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-let [data (lookup-entry config id :log-prefix)]
    (. builder logPrefix data))
  (when-let [data (lookup-entry config id :s3-bucket-arn)]
    (. builder s3BucketArn data))
  (.build builder))


(defn cfn-bot-alias-s3-bucket-log-destination-property-builder
  "Creates a  `CfnBotAlias$S3BucketLogDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-s3-bucket-log-destination-property-builder (new CfnBotAlias$S3BucketLogDestinationProperty$Builder) id config))


(defn build-cfn-bot-alias-sentiment-analysis-settings-property-builder
  "The build-cfn-bot-alias-sentiment-analysis-settings-property-builder function updates a CfnBotAlias$SentimentAnalysisSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$SentimentAnalysisSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectSentiment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detect-sentiment` |
"
  [^CfnBotAlias$SentimentAnalysisSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :detect-sentiment)]
    (. builder detectSentiment data))
  (.build builder))


(defn cfn-bot-alias-sentiment-analysis-settings-property-builder
  "Creates a  `CfnBotAlias$SentimentAnalysisSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-sentiment-analysis-settings-property-builder (new CfnBotAlias$SentimentAnalysisSettingsProperty$Builder) id config))


(defn build-cfn-bot-alias-text-log-destination-property-builder
  "The build-cfn-bot-alias-text-log-destination-property-builder function updates a CfnBotAlias$TextLogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$TextLogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatch` | software.amazon.awscdk.services.lex.CfnBotAlias$CloudWatchLogGroupLogDestinationProperty | [[cdk.support/lookup-entry]] | `:cloud-watch` |
"
  [^CfnBotAlias$TextLogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch)]
    (. builder cloudWatch data))
  (.build builder))


(defn cfn-bot-alias-text-log-destination-property-builder
  "Creates a  `CfnBotAlias$TextLogDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-text-log-destination-property-builder (new CfnBotAlias$TextLogDestinationProperty$Builder) id config))


(defn build-cfn-bot-alias-text-log-setting-property-builder
  "The build-cfn-bot-alias-text-log-setting-property-builder function updates a CfnBotAlias$TextLogSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBotAlias$TextLogSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.lex.CfnBotAlias$TextLogDestinationProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnBotAlias$TextLogSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-bot-alias-text-log-setting-property-builder
  "Creates a  `CfnBotAlias$TextLogSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-alias-text-log-setting-property-builder (new CfnBotAlias$TextLogSettingProperty$Builder) id config))


(defn build-cfn-bot-allowed-input-types-property-builder
  "The build-cfn-bot-allowed-input-types-property-builder function updates a CfnBot$AllowedInputTypesProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$AllowedInputTypesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAudioInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-audio-input` |
| `allowDtmfInput` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-dtmf-input` |
"
  [^CfnBot$AllowedInputTypesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-audio-input)]
    (. builder allowAudioInput data))
  (when-let [data (lookup-entry config id :allow-dtmf-input)]
    (. builder allowDtmfInput data))
  (.build builder))


(defn cfn-bot-allowed-input-types-property-builder
  "Creates a  `CfnBot$AllowedInputTypesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-allowed-input-types-property-builder (new CfnBot$AllowedInputTypesProperty$Builder) id config))


(defn build-cfn-bot-audio-and-dtmf-input-specification-property-builder
  "The build-cfn-bot-audio-and-dtmf-input-specification-property-builder function updates a CfnBot$AudioAndDTMFInputSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$AudioAndDTMFInputSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-specification` |
| `dtmfSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dtmf-specification` |
| `startTimeoutMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-timeout-ms` |
"
  [^CfnBot$AudioAndDTMFInputSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-specification)]
    (. builder audioSpecification data))
  (when-let [data (lookup-entry config id :dtmf-specification)]
    (. builder dtmfSpecification data))
  (when-let [data (lookup-entry config id :start-timeout-ms)]
    (. builder startTimeoutMs data))
  (.build builder))


(defn cfn-bot-audio-and-dtmf-input-specification-property-builder
  "Creates a  `CfnBot$AudioAndDTMFInputSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-audio-and-dtmf-input-specification-property-builder (new CfnBot$AudioAndDTMFInputSpecificationProperty$Builder) id config))


(defn build-cfn-bot-audio-log-destination-property-builder
  "The build-cfn-bot-audio-log-destination-property-builder function updates a CfnBot$AudioLogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$AudioLogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-bucket` |
"
  [^CfnBot$AudioLogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (.build builder))


(defn cfn-bot-audio-log-destination-property-builder
  "Creates a  `CfnBot$AudioLogDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-audio-log-destination-property-builder (new CfnBot$AudioLogDestinationProperty$Builder) id config))


(defn build-cfn-bot-audio-log-setting-property-builder
  "The build-cfn-bot-audio-log-setting-property-builder function updates a CfnBot$AudioLogSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$AudioLogSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.lex.CfnBot$AudioLogDestinationProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnBot$AudioLogSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-bot-audio-log-setting-property-builder
  "Creates a  `CfnBot$AudioLogSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-audio-log-setting-property-builder (new CfnBot$AudioLogSettingProperty$Builder) id config))


(defn build-cfn-bot-audio-specification-property-builder
  "The build-cfn-bot-audio-specification-property-builder function updates a CfnBot$AudioSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$AudioSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTimeoutMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-timeout-ms` |
| `maxLengthMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-length-ms` |
"
  [^CfnBot$AudioSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :end-timeout-ms)]
    (. builder endTimeoutMs data))
  (when-let [data (lookup-entry config id :max-length-ms)]
    (. builder maxLengthMs data))
  (.build builder))


(defn cfn-bot-audio-specification-property-builder
  "Creates a  `CfnBot$AudioSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-audio-specification-property-builder (new CfnBot$AudioSpecificationProperty$Builder) id config))


(defn build-cfn-bot-bot-alias-locale-settings-item-property-builder
  "The build-cfn-bot-bot-alias-locale-settings-item-property-builder function updates a CfnBot$BotAliasLocaleSettingsItemProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$BotAliasLocaleSettingsItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botAliasLocaleSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-locale-setting` |
| `localeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale-id` |
"
  [^CfnBot$BotAliasLocaleSettingsItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bot-alias-locale-setting)]
    (. builder botAliasLocaleSetting data))
  (when-let [data (lookup-entry config id :locale-id)]
    (. builder localeId data))
  (.build builder))


(defn cfn-bot-bot-alias-locale-settings-item-property-builder
  "Creates a  `CfnBot$BotAliasLocaleSettingsItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-bot-alias-locale-settings-item-property-builder (new CfnBot$BotAliasLocaleSettingsItemProperty$Builder) id config))


(defn build-cfn-bot-bot-alias-locale-settings-property-builder
  "The build-cfn-bot-bot-alias-locale-settings-property-builder function updates a CfnBot$BotAliasLocaleSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$BotAliasLocaleSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeHookSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-hook-specification` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnBot$BotAliasLocaleSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-hook-specification)]
    (. builder codeHookSpecification data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-bot-bot-alias-locale-settings-property-builder
  "Creates a  `CfnBot$BotAliasLocaleSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-bot-alias-locale-settings-property-builder (new CfnBot$BotAliasLocaleSettingsProperty$Builder) id config))


(defn build-cfn-bot-bot-locale-property-builder
  "The build-cfn-bot-bot-locale-property-builder function updates a CfnBot$BotLocaleProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$BotLocaleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customVocabulary` | software.amazon.awscdk.services.lex.CfnBot$CustomVocabularyProperty | [[cdk.support/lookup-entry]] | `:custom-vocabulary` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `intents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:intents` |
| `localeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale-id` |
| `nluConfidenceThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:nlu-confidence-threshold` |
| `slotTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:slot-types` |
| `voiceSettings` | software.amazon.awscdk.services.lex.CfnBot$VoiceSettingsProperty | [[cdk.support/lookup-entry]] | `:voice-settings` |
"
  [^CfnBot$BotLocaleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-vocabulary)]
    (. builder customVocabulary data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :intents)]
    (. builder intents data))
  (when-let [data (lookup-entry config id :locale-id)]
    (. builder localeId data))
  (when-let [data (lookup-entry config id :nlu-confidence-threshold)]
    (. builder nluConfidenceThreshold data))
  (when-let [data (lookup-entry config id :slot-types)]
    (. builder slotTypes data))
  (when-let [data (lookup-entry config id :voice-settings)]
    (. builder voiceSettings data))
  (.build builder))


(defn cfn-bot-bot-locale-property-builder
  "Creates a  `CfnBot$BotLocaleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-bot-locale-property-builder (new CfnBot$BotLocaleProperty$Builder) id config))


(defn build-cfn-bot-builder
  "The build-cfn-bot-builder function updates a CfnBot$Builder instance using the provided configuration.
  The function takes the CfnBot$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoBuildBotLocales` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-build-bot-locales` |
| `botFileS3Location` | software.amazon.awscdk.services.lex.CfnBot$S3LocationProperty | [[cdk.support/lookup-entry]] | `:bot-file-s3-location` |
| `botLocales` | java.util.List | [[cdk.support/lookup-entry]] | `:bot-locales` |
| `botTags` | java.util.List | [[cdk.support/lookup-entry]] | `:bot-tags` |
| `dataPrivacy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-privacy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `idleSessionTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-session-ttl-in-seconds` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `testBotAliasSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:test-bot-alias-settings` |
| `testBotAliasTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:test-bot-alias-tags` |
"
  [^CfnBot$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-build-bot-locales)]
    (. builder autoBuildBotLocales data))
  (when-let [data (lookup-entry config id :bot-file-s3-location)]
    (. builder botFileS3Location data))
  (when-let [data (lookup-entry config id :bot-locales)]
    (. builder botLocales data))
  (when-let [data (lookup-entry config id :bot-tags)]
    (. builder botTags data))
  (when-let [data (lookup-entry config id :data-privacy)]
    (. builder dataPrivacy data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :idle-session-ttl-in-seconds)]
    (. builder idleSessionTtlInSeconds data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :test-bot-alias-settings)]
    (. builder testBotAliasSettings data))
  (when-let [data (lookup-entry config id :test-bot-alias-tags)]
    (. builder testBotAliasTags data))
  (.build builder))


(defn cfn-bot-builder
  "Creates a  `CfnBot$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-bot-builder (CfnBot$Builder/create scope (name id)) id config))


(defn build-cfn-bot-button-property-builder
  "The build-cfn-bot-button-property-builder function updates a CfnBot$ButtonProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$ButtonProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBot$ButtonProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :text)]
    (. builder text data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-bot-button-property-builder
  "Creates a  `CfnBot$ButtonProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-button-property-builder (new CfnBot$ButtonProperty$Builder) id config))


(defn build-cfn-bot-cloud-watch-log-group-log-destination-property-builder
  "The build-cfn-bot-cloud-watch-log-group-log-destination-property-builder function updates a CfnBot$CloudWatchLogGroupLogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$CloudWatchLogGroupLogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-arn` |
| `logPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-prefix` |
"
  [^CfnBot$CloudWatchLogGroupLogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-log-group-arn)]
    (. builder cloudWatchLogGroupArn data))
  (when-let [data (lookup-entry config id :log-prefix)]
    (. builder logPrefix data))
  (.build builder))


(defn cfn-bot-cloud-watch-log-group-log-destination-property-builder
  "Creates a  `CfnBot$CloudWatchLogGroupLogDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-cloud-watch-log-group-log-destination-property-builder (new CfnBot$CloudWatchLogGroupLogDestinationProperty$Builder) id config))


(defn build-cfn-bot-code-hook-specification-property-builder
  "The build-cfn-bot-code-hook-specification-property-builder function updates a CfnBot$CodeHookSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$CodeHookSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaCodeHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-code-hook` |
"
  [^CfnBot$CodeHookSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :lambda-code-hook)]
    (. builder lambdaCodeHook data))
  (.build builder))


(defn cfn-bot-code-hook-specification-property-builder
  "Creates a  `CfnBot$CodeHookSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-code-hook-specification-property-builder (new CfnBot$CodeHookSpecificationProperty$Builder) id config))


(defn build-cfn-bot-condition-property-builder
  "The build-cfn-bot-condition-property-builder function updates a CfnBot$ConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$ConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expressionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression-string` |
"
  [^CfnBot$ConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :expression-string)]
    (. builder expressionString data))
  (.build builder))


(defn cfn-bot-condition-property-builder
  "Creates a  `CfnBot$ConditionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-condition-property-builder (new CfnBot$ConditionProperty$Builder) id config))


(defn build-cfn-bot-conditional-branch-property-builder
  "The build-cfn-bot-conditional-branch-property-builder function updates a CfnBot$ConditionalBranchProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$ConditionalBranchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:condition` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nextStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:next-step` |
| `response` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:response` |
"
  [^CfnBot$ConditionalBranchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :next-step)]
    (. builder nextStep data))
  (when-let [data (lookup-entry config id :response)]
    (. builder response data))
  (.build builder))


(defn cfn-bot-conditional-branch-property-builder
  "Creates a  `CfnBot$ConditionalBranchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-conditional-branch-property-builder (new CfnBot$ConditionalBranchProperty$Builder) id config))


(defn build-cfn-bot-conditional-specification-property-builder
  "The build-cfn-bot-conditional-specification-property-builder function updates a CfnBot$ConditionalSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$ConditionalSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionalBranches` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditional-branches` |
| `defaultBranch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-branch` |
| `isActive` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-active` |
"
  [^CfnBot$ConditionalSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :conditional-branches)]
    (. builder conditionalBranches data))
  (when-let [data (lookup-entry config id :default-branch)]
    (. builder defaultBranch data))
  (when-let [data (lookup-entry config id :is-active)]
    (. builder isActive data))
  (.build builder))


(defn cfn-bot-conditional-specification-property-builder
  "Creates a  `CfnBot$ConditionalSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-conditional-specification-property-builder (new CfnBot$ConditionalSpecificationProperty$Builder) id config))


(defn build-cfn-bot-conversation-log-settings-property-builder
  "The build-cfn-bot-conversation-log-settings-property-builder function updates a CfnBot$ConversationLogSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$ConversationLogSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioLogSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:audio-log-settings` |
| `textLogSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-log-settings` |
"
  [^CfnBot$ConversationLogSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :audio-log-settings)]
    (. builder audioLogSettings data))
  (when-let [data (lookup-entry config id :text-log-settings)]
    (. builder textLogSettings data))
  (.build builder))


(defn cfn-bot-conversation-log-settings-property-builder
  "Creates a  `CfnBot$ConversationLogSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-conversation-log-settings-property-builder (new CfnBot$ConversationLogSettingsProperty$Builder) id config))


(defn build-cfn-bot-custom-payload-property-builder
  "The build-cfn-bot-custom-payload-property-builder function updates a CfnBot$CustomPayloadProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$CustomPayloadProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBot$CustomPayloadProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-bot-custom-payload-property-builder
  "Creates a  `CfnBot$CustomPayloadProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-custom-payload-property-builder (new CfnBot$CustomPayloadProperty$Builder) id config))


(defn build-cfn-bot-custom-vocabulary-item-property-builder
  "The build-cfn-bot-custom-vocabulary-item-property-builder function updates a CfnBot$CustomVocabularyItemProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$CustomVocabularyItemProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayAs` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-as` |
| `phrase` | java.lang.String | [[cdk.support/lookup-entry]] | `:phrase` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnBot$CustomVocabularyItemProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :display-as)]
    (. builder displayAs data))
  (when-let [data (lookup-entry config id :phrase)]
    (. builder phrase data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-bot-custom-vocabulary-item-property-builder
  "Creates a  `CfnBot$CustomVocabularyItemProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-custom-vocabulary-item-property-builder (new CfnBot$CustomVocabularyItemProperty$Builder) id config))


(defn build-cfn-bot-custom-vocabulary-property-builder
  "The build-cfn-bot-custom-vocabulary-property-builder function updates a CfnBot$CustomVocabularyProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$CustomVocabularyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customVocabularyItems` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-vocabulary-items` |
"
  [^CfnBot$CustomVocabularyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-vocabulary-items)]
    (. builder customVocabularyItems data))
  (.build builder))


(defn cfn-bot-custom-vocabulary-property-builder
  "Creates a  `CfnBot$CustomVocabularyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-custom-vocabulary-property-builder (new CfnBot$CustomVocabularyProperty$Builder) id config))


(defn build-cfn-bot-data-privacy-property-builder
  "The build-cfn-bot-data-privacy-property-builder function updates a CfnBot$DataPrivacyProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$DataPrivacyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childDirected` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:child-directed` |
"
  [^CfnBot$DataPrivacyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :child-directed)]
    (. builder childDirected data))
  (.build builder))


(defn cfn-bot-data-privacy-property-builder
  "Creates a  `CfnBot$DataPrivacyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-data-privacy-property-builder (new CfnBot$DataPrivacyProperty$Builder) id config))


(defn build-cfn-bot-default-conditional-branch-property-builder
  "The build-cfn-bot-default-conditional-branch-property-builder function updates a CfnBot$DefaultConditionalBranchProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$DefaultConditionalBranchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:next-step` |
| `response` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:response` |
"
  [^CfnBot$DefaultConditionalBranchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :next-step)]
    (. builder nextStep data))
  (when-let [data (lookup-entry config id :response)]
    (. builder response data))
  (.build builder))


(defn cfn-bot-default-conditional-branch-property-builder
  "Creates a  `CfnBot$DefaultConditionalBranchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-default-conditional-branch-property-builder (new CfnBot$DefaultConditionalBranchProperty$Builder) id config))


(defn build-cfn-bot-dialog-action-property-builder
  "The build-cfn-bot-dialog-action-property-builder function updates a CfnBot$DialogActionProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$DialogActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `slotToElicit` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-to-elicit` |
| `suppressNextMessage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:suppress-next-message` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnBot$DialogActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :slot-to-elicit)]
    (. builder slotToElicit data))
  (when-let [data (lookup-entry config id :suppress-next-message)]
    (. builder suppressNextMessage data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-bot-dialog-action-property-builder
  "Creates a  `CfnBot$DialogActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-dialog-action-property-builder (new CfnBot$DialogActionProperty$Builder) id config))


(defn build-cfn-bot-dialog-code-hook-invocation-setting-property-builder
  "The build-cfn-bot-dialog-code-hook-invocation-setting-property-builder function updates a CfnBot$DialogCodeHookInvocationSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$DialogCodeHookInvocationSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableCodeHookInvocation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-code-hook-invocation` |
| `invocationLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-label` |
| `isActive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-active` |
| `postCodeHookSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-code-hook-specification` |
"
  [^CfnBot$DialogCodeHookInvocationSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-code-hook-invocation)]
    (. builder enableCodeHookInvocation data))
  (when-let [data (lookup-entry config id :invocation-label)]
    (. builder invocationLabel data))
  (when-let [data (lookup-entry config id :is-active)]
    (. builder isActive data))
  (when-let [data (lookup-entry config id :post-code-hook-specification)]
    (. builder postCodeHookSpecification data))
  (.build builder))


(defn cfn-bot-dialog-code-hook-invocation-setting-property-builder
  "Creates a  `CfnBot$DialogCodeHookInvocationSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-dialog-code-hook-invocation-setting-property-builder (new CfnBot$DialogCodeHookInvocationSettingProperty$Builder) id config))


(defn build-cfn-bot-dialog-code-hook-setting-property-builder
  "The build-cfn-bot-dialog-code-hook-setting-property-builder function updates a CfnBot$DialogCodeHookSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$DialogCodeHookSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnBot$DialogCodeHookSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-bot-dialog-code-hook-setting-property-builder
  "Creates a  `CfnBot$DialogCodeHookSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-dialog-code-hook-setting-property-builder (new CfnBot$DialogCodeHookSettingProperty$Builder) id config))


(defn build-cfn-bot-dialog-state-property-builder
  "The build-cfn-bot-dialog-state-property-builder function updates a CfnBot$DialogStateProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$DialogStateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dialogAction` | software.amazon.awscdk.services.lex.CfnBot$DialogActionProperty | [[cdk.support/lookup-entry]] | `:dialog-action` |
| `intent` | software.amazon.awscdk.services.lex.CfnBot$IntentOverrideProperty | [[cdk.support/lookup-entry]] | `:intent` |
| `sessionAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:session-attributes` |
"
  [^CfnBot$DialogStateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dialog-action)]
    (. builder dialogAction data))
  (when-let [data (lookup-entry config id :intent)]
    (. builder intent data))
  (when-let [data (lookup-entry config id :session-attributes)]
    (. builder sessionAttributes data))
  (.build builder))


(defn cfn-bot-dialog-state-property-builder
  "Creates a  `CfnBot$DialogStateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-dialog-state-property-builder (new CfnBot$DialogStateProperty$Builder) id config))


(defn build-cfn-bot-dtmf-specification-property-builder
  "The build-cfn-bot-dtmf-specification-property-builder function updates a CfnBot$DTMFSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$DTMFSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionCharacter` | java.lang.String | [[cdk.support/lookup-entry]] | `:deletion-character` |
| `endCharacter` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-character` |
| `endTimeoutMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-timeout-ms` |
| `maxLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-length` |
"
  [^CfnBot$DTMFSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :deletion-character)]
    (. builder deletionCharacter data))
  (when-let [data (lookup-entry config id :end-character)]
    (. builder endCharacter data))
  (when-let [data (lookup-entry config id :end-timeout-ms)]
    (. builder endTimeoutMs data))
  (when-let [data (lookup-entry config id :max-length)]
    (. builder maxLength data))
  (.build builder))


(defn cfn-bot-dtmf-specification-property-builder
  "Creates a  `CfnBot$DTMFSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-dtmf-specification-property-builder (new CfnBot$DTMFSpecificationProperty$Builder) id config))


(defn build-cfn-bot-elicitation-code-hook-invocation-setting-property-builder
  "The build-cfn-bot-elicitation-code-hook-invocation-setting-property-builder function updates a CfnBot$ElicitationCodeHookInvocationSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$ElicitationCodeHookInvocationSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableCodeHookInvocation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-code-hook-invocation` |
| `invocationLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-label` |
"
  [^CfnBot$ElicitationCodeHookInvocationSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-code-hook-invocation)]
    (. builder enableCodeHookInvocation data))
  (when-let [data (lookup-entry config id :invocation-label)]
    (. builder invocationLabel data))
  (.build builder))


(defn cfn-bot-elicitation-code-hook-invocation-setting-property-builder
  "Creates a  `CfnBot$ElicitationCodeHookInvocationSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-elicitation-code-hook-invocation-setting-property-builder (new CfnBot$ElicitationCodeHookInvocationSettingProperty$Builder) id config))


(defn build-cfn-bot-external-source-setting-property-builder
  "The build-cfn-bot-external-source-setting-property-builder function updates a CfnBot$ExternalSourceSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$ExternalSourceSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grammarSlotTypeSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:grammar-slot-type-setting` |
"
  [^CfnBot$ExternalSourceSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :grammar-slot-type-setting)]
    (. builder grammarSlotTypeSetting data))
  (.build builder))


(defn cfn-bot-external-source-setting-property-builder
  "Creates a  `CfnBot$ExternalSourceSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-external-source-setting-property-builder (new CfnBot$ExternalSourceSettingProperty$Builder) id config))


(defn build-cfn-bot-fulfillment-code-hook-setting-property-builder
  "The build-cfn-bot-fulfillment-code-hook-setting-property-builder function updates a CfnBot$FulfillmentCodeHookSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$FulfillmentCodeHookSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `fulfillmentUpdatesSpecification` | software.amazon.awscdk.services.lex.CfnBot$FulfillmentUpdatesSpecificationProperty | [[cdk.support/lookup-entry]] | `:fulfillment-updates-specification` |
| `isActive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-active` |
| `postFulfillmentStatusSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-fulfillment-status-specification` |
"
  [^CfnBot$FulfillmentCodeHookSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :fulfillment-updates-specification)]
    (. builder fulfillmentUpdatesSpecification data))
  (when-let [data (lookup-entry config id :is-active)]
    (. builder isActive data))
  (when-let [data (lookup-entry config id :post-fulfillment-status-specification)]
    (. builder postFulfillmentStatusSpecification data))
  (.build builder))


(defn cfn-bot-fulfillment-code-hook-setting-property-builder
  "Creates a  `CfnBot$FulfillmentCodeHookSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-fulfillment-code-hook-setting-property-builder (new CfnBot$FulfillmentCodeHookSettingProperty$Builder) id config))


(defn build-cfn-bot-fulfillment-start-response-specification-property-builder
  "The build-cfn-bot-fulfillment-start-response-specification-property-builder function updates a CfnBot$FulfillmentStartResponseSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$FulfillmentStartResponseSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `delayInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:delay-in-seconds` |
| `messageGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:message-groups` |
"
  [^CfnBot$FulfillmentStartResponseSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-interrupt)]
    (. builder allowInterrupt data))
  (when-let [data (lookup-entry config id :delay-in-seconds)]
    (. builder delayInSeconds data))
  (when-let [data (lookup-entry config id :message-groups)]
    (. builder messageGroups data))
  (.build builder))


(defn cfn-bot-fulfillment-start-response-specification-property-builder
  "Creates a  `CfnBot$FulfillmentStartResponseSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-fulfillment-start-response-specification-property-builder (new CfnBot$FulfillmentStartResponseSpecificationProperty$Builder) id config))


(defn build-cfn-bot-fulfillment-update-response-specification-property-builder
  "The build-cfn-bot-fulfillment-update-response-specification-property-builder function updates a CfnBot$FulfillmentUpdateResponseSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$FulfillmentUpdateResponseSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `frequencyInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:frequency-in-seconds` |
| `messageGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:message-groups` |
"
  [^CfnBot$FulfillmentUpdateResponseSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-interrupt)]
    (. builder allowInterrupt data))
  (when-let [data (lookup-entry config id :frequency-in-seconds)]
    (. builder frequencyInSeconds data))
  (when-let [data (lookup-entry config id :message-groups)]
    (. builder messageGroups data))
  (.build builder))


(defn cfn-bot-fulfillment-update-response-specification-property-builder
  "Creates a  `CfnBot$FulfillmentUpdateResponseSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-fulfillment-update-response-specification-property-builder (new CfnBot$FulfillmentUpdateResponseSpecificationProperty$Builder) id config))


(defn build-cfn-bot-fulfillment-updates-specification-property-builder
  "The build-cfn-bot-fulfillment-updates-specification-property-builder function updates a CfnBot$FulfillmentUpdatesSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$FulfillmentUpdatesSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:active` |
| `startResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:start-response` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |
| `updateResponse` | software.amazon.awscdk.services.lex.CfnBot$FulfillmentUpdateResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:update-response` |
"
  [^CfnBot$FulfillmentUpdatesSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :active)]
    (. builder active data))
  (when-let [data (lookup-entry config id :start-response)]
    (. builder startResponse data))
  (when-let [data (lookup-entry config id :timeout-in-seconds)]
    (. builder timeoutInSeconds data))
  (when-let [data (lookup-entry config id :update-response)]
    (. builder updateResponse data))
  (.build builder))


(defn cfn-bot-fulfillment-updates-specification-property-builder
  "Creates a  `CfnBot$FulfillmentUpdatesSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-fulfillment-updates-specification-property-builder (new CfnBot$FulfillmentUpdatesSpecificationProperty$Builder) id config))


(defn build-cfn-bot-grammar-slot-type-setting-property-builder
  "The build-cfn-bot-grammar-slot-type-setting-property-builder function updates a CfnBot$GrammarSlotTypeSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$GrammarSlotTypeSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |
"
  [^CfnBot$GrammarSlotTypeSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn cfn-bot-grammar-slot-type-setting-property-builder
  "Creates a  `CfnBot$GrammarSlotTypeSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-grammar-slot-type-setting-property-builder (new CfnBot$GrammarSlotTypeSettingProperty$Builder) id config))


(defn build-cfn-bot-grammar-slot-type-source-property-builder
  "The build-cfn-bot-grammar-slot-type-source-property-builder function updates a CfnBot$GrammarSlotTypeSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$GrammarSlotTypeSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3ObjectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-key` |
"
  [^CfnBot$GrammarSlotTypeSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-let [data (lookup-entry config id :s3-bucket-name)]
    (. builder s3BucketName data))
  (when-let [data (lookup-entry config id :s3-object-key)]
    (. builder s3ObjectKey data))
  (.build builder))


(defn cfn-bot-grammar-slot-type-source-property-builder
  "Creates a  `CfnBot$GrammarSlotTypeSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-grammar-slot-type-source-property-builder (new CfnBot$GrammarSlotTypeSourceProperty$Builder) id config))


(defn build-cfn-bot-image-response-card-property-builder
  "The build-cfn-bot-image-response-card-property-builder function updates a CfnBot$ImageResponseCardProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$ImageResponseCardProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buttons` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:buttons` |
| `imageUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-url` |
| `subtitle` | java.lang.String | [[cdk.support/lookup-entry]] | `:subtitle` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
"
  [^CfnBot$ImageResponseCardProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :buttons)]
    (. builder buttons data))
  (when-let [data (lookup-entry config id :image-url)]
    (. builder imageUrl data))
  (when-let [data (lookup-entry config id :subtitle)]
    (. builder subtitle data))
  (when-let [data (lookup-entry config id :title)]
    (. builder title data))
  (.build builder))


(defn cfn-bot-image-response-card-property-builder
  "Creates a  `CfnBot$ImageResponseCardProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-image-response-card-property-builder (new CfnBot$ImageResponseCardProperty$Builder) id config))


(defn build-cfn-bot-initial-response-setting-property-builder
  "The build-cfn-bot-initial-response-setting-property-builder function updates a CfnBot$InitialResponseSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$InitialResponseSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-hook` |
| `conditional` | software.amazon.awscdk.services.lex.CfnBot$ConditionalSpecificationProperty | [[cdk.support/lookup-entry]] | `:conditional` |
| `initialResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-response` |
| `nextStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:next-step` |
"
  [^CfnBot$InitialResponseSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-hook)]
    (. builder codeHook data))
  (when-let [data (lookup-entry config id :conditional)]
    (. builder conditional data))
  (when-let [data (lookup-entry config id :initial-response)]
    (. builder initialResponse data))
  (when-let [data (lookup-entry config id :next-step)]
    (. builder nextStep data))
  (.build builder))


(defn cfn-bot-initial-response-setting-property-builder
  "Creates a  `CfnBot$InitialResponseSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-initial-response-setting-property-builder (new CfnBot$InitialResponseSettingProperty$Builder) id config))


(defn build-cfn-bot-input-context-property-builder
  "The build-cfn-bot-input-context-property-builder function updates a CfnBot$InputContextProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$InputContextProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnBot$InputContextProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-bot-input-context-property-builder
  "Creates a  `CfnBot$InputContextProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-input-context-property-builder (new CfnBot$InputContextProperty$Builder) id config))


(defn build-cfn-bot-intent-closing-setting-property-builder
  "The build-cfn-bot-intent-closing-setting-property-builder function updates a CfnBot$IntentClosingSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$IntentClosingSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `closingResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:closing-response` |
| `conditional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditional` |
| `isActive` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-active` |
| `nextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:next-step` |
"
  [^CfnBot$IntentClosingSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :closing-response)]
    (. builder closingResponse data))
  (when-let [data (lookup-entry config id :conditional)]
    (. builder conditional data))
  (when-let [data (lookup-entry config id :is-active)]
    (. builder isActive data))
  (when-let [data (lookup-entry config id :next-step)]
    (. builder nextStep data))
  (.build builder))


(defn cfn-bot-intent-closing-setting-property-builder
  "Creates a  `CfnBot$IntentClosingSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-intent-closing-setting-property-builder (new CfnBot$IntentClosingSettingProperty$Builder) id config))


(defn build-cfn-bot-intent-confirmation-setting-property-builder
  "The build-cfn-bot-intent-confirmation-setting-property-builder function updates a CfnBot$IntentConfirmationSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$IntentConfirmationSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-hook` |
| `confirmationConditional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:confirmation-conditional` |
| `confirmationNextStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:confirmation-next-step` |
| `confirmationResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:confirmation-response` |
| `declinationConditional` | software.amazon.awscdk.services.lex.CfnBot$ConditionalSpecificationProperty | [[cdk.support/lookup-entry]] | `:declination-conditional` |
| `declinationNextStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:declination-next-step` |
| `declinationResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:declination-response` |
| `elicitationCodeHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:elicitation-code-hook` |
| `failureConditional` | software.amazon.awscdk.services.lex.CfnBot$ConditionalSpecificationProperty | [[cdk.support/lookup-entry]] | `:failure-conditional` |
| `failureNextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:failure-next-step` |
| `failureResponse` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:failure-response` |
| `isActive` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-active` |
| `promptSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:prompt-specification` |
"
  [^CfnBot$IntentConfirmationSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-hook)]
    (. builder codeHook data))
  (when-let [data (lookup-entry config id :confirmation-conditional)]
    (. builder confirmationConditional data))
  (when-let [data (lookup-entry config id :confirmation-next-step)]
    (. builder confirmationNextStep data))
  (when-let [data (lookup-entry config id :confirmation-response)]
    (. builder confirmationResponse data))
  (when-let [data (lookup-entry config id :declination-conditional)]
    (. builder declinationConditional data))
  (when-let [data (lookup-entry config id :declination-next-step)]
    (. builder declinationNextStep data))
  (when-let [data (lookup-entry config id :declination-response)]
    (. builder declinationResponse data))
  (when-let [data (lookup-entry config id :elicitation-code-hook)]
    (. builder elicitationCodeHook data))
  (when-let [data (lookup-entry config id :failure-conditional)]
    (. builder failureConditional data))
  (when-let [data (lookup-entry config id :failure-next-step)]
    (. builder failureNextStep data))
  (when-let [data (lookup-entry config id :failure-response)]
    (. builder failureResponse data))
  (when-let [data (lookup-entry config id :is-active)]
    (. builder isActive data))
  (when-let [data (lookup-entry config id :prompt-specification)]
    (. builder promptSpecification data))
  (.build builder))


(defn cfn-bot-intent-confirmation-setting-property-builder
  "Creates a  `CfnBot$IntentConfirmationSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-intent-confirmation-setting-property-builder (new CfnBot$IntentConfirmationSettingProperty$Builder) id config))


(defn build-cfn-bot-intent-override-property-builder
  "The build-cfn-bot-intent-override-property-builder function updates a CfnBot$IntentOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$IntentOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `slots` | java.util.List | [[cdk.support/lookup-entry]] | `:slots` |
"
  [^CfnBot$IntentOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :slots)]
    (. builder slots data))
  (.build builder))


(defn cfn-bot-intent-override-property-builder
  "Creates a  `CfnBot$IntentOverrideProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-intent-override-property-builder (new CfnBot$IntentOverrideProperty$Builder) id config))


(defn build-cfn-bot-intent-property-builder
  "The build-cfn-bot-intent-property-builder function updates a CfnBot$IntentProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$IntentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dialogCodeHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dialog-code-hook` |
| `fulfillmentCodeHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:fulfillment-code-hook` |
| `initialResponseSetting` | software.amazon.awscdk.services.lex.CfnBot$InitialResponseSettingProperty | [[cdk.support/lookup-entry]] | `:initial-response-setting` |
| `inputContexts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-contexts` |
| `intentClosingSetting` | software.amazon.awscdk.services.lex.CfnBot$IntentClosingSettingProperty | [[cdk.support/lookup-entry]] | `:intent-closing-setting` |
| `intentConfirmationSetting` | software.amazon.awscdk.services.lex.CfnBot$IntentConfirmationSettingProperty | [[cdk.support/lookup-entry]] | `:intent-confirmation-setting` |
| `kendraConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kendra-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputContexts` | java.util.List | [[cdk.support/lookup-entry]] | `:output-contexts` |
| `parentIntentSignature` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-intent-signature` |
| `sampleUtterances` | java.util.List | [[cdk.support/lookup-entry]] | `:sample-utterances` |
| `slotPriorities` | java.util.List | [[cdk.support/lookup-entry]] | `:slot-priorities` |
| `slots` | java.util.List | [[cdk.support/lookup-entry]] | `:slots` |
"
  [^CfnBot$IntentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :dialog-code-hook)]
    (. builder dialogCodeHook data))
  (when-let [data (lookup-entry config id :fulfillment-code-hook)]
    (. builder fulfillmentCodeHook data))
  (when-let [data (lookup-entry config id :initial-response-setting)]
    (. builder initialResponseSetting data))
  (when-let [data (lookup-entry config id :input-contexts)]
    (. builder inputContexts data))
  (when-let [data (lookup-entry config id :intent-closing-setting)]
    (. builder intentClosingSetting data))
  (when-let [data (lookup-entry config id :intent-confirmation-setting)]
    (. builder intentConfirmationSetting data))
  (when-let [data (lookup-entry config id :kendra-configuration)]
    (. builder kendraConfiguration data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :output-contexts)]
    (. builder outputContexts data))
  (when-let [data (lookup-entry config id :parent-intent-signature)]
    (. builder parentIntentSignature data))
  (when-let [data (lookup-entry config id :sample-utterances)]
    (. builder sampleUtterances data))
  (when-let [data (lookup-entry config id :slot-priorities)]
    (. builder slotPriorities data))
  (when-let [data (lookup-entry config id :slots)]
    (. builder slots data))
  (.build builder))


(defn cfn-bot-intent-property-builder
  "Creates a  `CfnBot$IntentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-intent-property-builder (new CfnBot$IntentProperty$Builder) id config))


(defn build-cfn-bot-kendra-configuration-property-builder
  "The build-cfn-bot-kendra-configuration-property-builder function updates a CfnBot$KendraConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$KendraConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kendraIndex` | java.lang.String | [[cdk.support/lookup-entry]] | `:kendra-index` |
| `queryFilterString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-filter-string` |
| `queryFilterStringEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:query-filter-string-enabled` |
"
  [^CfnBot$KendraConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kendra-index)]
    (. builder kendraIndex data))
  (when-let [data (lookup-entry config id :query-filter-string)]
    (. builder queryFilterString data))
  (when-let [data (lookup-entry config id :query-filter-string-enabled)]
    (. builder queryFilterStringEnabled data))
  (.build builder))


(defn cfn-bot-kendra-configuration-property-builder
  "Creates a  `CfnBot$KendraConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-kendra-configuration-property-builder (new CfnBot$KendraConfigurationProperty$Builder) id config))


(defn build-cfn-bot-lambda-code-hook-property-builder
  "The build-cfn-bot-lambda-code-hook-property-builder function updates a CfnBot$LambdaCodeHookProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$LambdaCodeHookProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeHookInterfaceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-hook-interface-version` |
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |
"
  [^CfnBot$LambdaCodeHookProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code-hook-interface-version)]
    (. builder codeHookInterfaceVersion data))
  (when-let [data (lookup-entry config id :lambda-arn)]
    (. builder lambdaArn data))
  (.build builder))


(defn cfn-bot-lambda-code-hook-property-builder
  "Creates a  `CfnBot$LambdaCodeHookProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-lambda-code-hook-property-builder (new CfnBot$LambdaCodeHookProperty$Builder) id config))


(defn build-cfn-bot-message-group-property-builder
  "The build-cfn-bot-message-group-property-builder function updates a CfnBot$MessageGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$MessageGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:message` |
| `variations` | java.util.List | [[cdk.support/lookup-entry]] | `:variations` |
"
  [^CfnBot$MessageGroupProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (when-let [data (lookup-entry config id :variations)]
    (. builder variations data))
  (.build builder))


(defn cfn-bot-message-group-property-builder
  "Creates a  `CfnBot$MessageGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-message-group-property-builder (new CfnBot$MessageGroupProperty$Builder) id config))


(defn build-cfn-bot-message-property-builder
  "The build-cfn-bot-message-property-builder function updates a CfnBot$MessageProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$MessageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customPayload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-payload` |
| `imageResponseCard` | software.amazon.awscdk.services.lex.CfnBot$ImageResponseCardProperty | [[cdk.support/lookup-entry]] | `:image-response-card` |
| `plainTextMessage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:plain-text-message` |
| `ssmlMessage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ssml-message` |
"
  [^CfnBot$MessageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-payload)]
    (. builder customPayload data))
  (when-let [data (lookup-entry config id :image-response-card)]
    (. builder imageResponseCard data))
  (when-let [data (lookup-entry config id :plain-text-message)]
    (. builder plainTextMessage data))
  (when-let [data (lookup-entry config id :ssml-message)]
    (. builder ssmlMessage data))
  (.build builder))


(defn cfn-bot-message-property-builder
  "Creates a  `CfnBot$MessageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-message-property-builder (new CfnBot$MessageProperty$Builder) id config))


(defn build-cfn-bot-multiple-values-setting-property-builder
  "The build-cfn-bot-multiple-values-setting-property-builder function updates a CfnBot$MultipleValuesSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$MultipleValuesSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowMultipleValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-multiple-values` |
"
  [^CfnBot$MultipleValuesSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-multiple-values)]
    (. builder allowMultipleValues data))
  (.build builder))


(defn cfn-bot-multiple-values-setting-property-builder
  "Creates a  `CfnBot$MultipleValuesSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-multiple-values-setting-property-builder (new CfnBot$MultipleValuesSettingProperty$Builder) id config))


(defn build-cfn-bot-obfuscation-setting-property-builder
  "The build-cfn-bot-obfuscation-setting-property-builder function updates a CfnBot$ObfuscationSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$ObfuscationSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `obfuscationSettingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:obfuscation-setting-type` |
"
  [^CfnBot$ObfuscationSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :obfuscation-setting-type)]
    (. builder obfuscationSettingType data))
  (.build builder))


(defn cfn-bot-obfuscation-setting-property-builder
  "Creates a  `CfnBot$ObfuscationSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-obfuscation-setting-property-builder (new CfnBot$ObfuscationSettingProperty$Builder) id config))


(defn build-cfn-bot-output-context-property-builder
  "The build-cfn-bot-output-context-property-builder function updates a CfnBot$OutputContextProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$OutputContextProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `timeToLiveInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:time-to-live-in-seconds` |
| `turnsToLive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:turns-to-live` |
"
  [^CfnBot$OutputContextProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :time-to-live-in-seconds)]
    (. builder timeToLiveInSeconds data))
  (when-let [data (lookup-entry config id :turns-to-live)]
    (. builder turnsToLive data))
  (.build builder))


(defn cfn-bot-output-context-property-builder
  "Creates a  `CfnBot$OutputContextProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-output-context-property-builder (new CfnBot$OutputContextProperty$Builder) id config))


(defn build-cfn-bot-plain-text-message-property-builder
  "The build-cfn-bot-plain-text-message-property-builder function updates a CfnBot$PlainTextMessageProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$PlainTextMessageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBot$PlainTextMessageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-bot-plain-text-message-property-builder
  "Creates a  `CfnBot$PlainTextMessageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-plain-text-message-property-builder (new CfnBot$PlainTextMessageProperty$Builder) id config))


(defn build-cfn-bot-post-dialog-code-hook-invocation-specification-property-builder
  "The build-cfn-bot-post-dialog-code-hook-invocation-specification-property-builder function updates a CfnBot$PostDialogCodeHookInvocationSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$PostDialogCodeHookInvocationSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureConditional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:failure-conditional` |
| `failureNextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:failure-next-step` |
| `failureResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:failure-response` |
| `successConditional` | software.amazon.awscdk.services.lex.CfnBot$ConditionalSpecificationProperty | [[cdk.support/lookup-entry]] | `:success-conditional` |
| `successNextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:success-next-step` |
| `successResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:success-response` |
| `timeoutConditional` | software.amazon.awscdk.services.lex.CfnBot$ConditionalSpecificationProperty | [[cdk.support/lookup-entry]] | `:timeout-conditional` |
| `timeoutNextStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout-next-step` |
| `timeoutResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout-response` |
"
  [^CfnBot$PostDialogCodeHookInvocationSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :failure-conditional)]
    (. builder failureConditional data))
  (when-let [data (lookup-entry config id :failure-next-step)]
    (. builder failureNextStep data))
  (when-let [data (lookup-entry config id :failure-response)]
    (. builder failureResponse data))
  (when-let [data (lookup-entry config id :success-conditional)]
    (. builder successConditional data))
  (when-let [data (lookup-entry config id :success-next-step)]
    (. builder successNextStep data))
  (when-let [data (lookup-entry config id :success-response)]
    (. builder successResponse data))
  (when-let [data (lookup-entry config id :timeout-conditional)]
    (. builder timeoutConditional data))
  (when-let [data (lookup-entry config id :timeout-next-step)]
    (. builder timeoutNextStep data))
  (when-let [data (lookup-entry config id :timeout-response)]
    (. builder timeoutResponse data))
  (.build builder))


(defn cfn-bot-post-dialog-code-hook-invocation-specification-property-builder
  "Creates a  `CfnBot$PostDialogCodeHookInvocationSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-post-dialog-code-hook-invocation-specification-property-builder (new CfnBot$PostDialogCodeHookInvocationSpecificationProperty$Builder) id config))


(defn build-cfn-bot-post-fulfillment-status-specification-property-builder
  "The build-cfn-bot-post-fulfillment-status-specification-property-builder function updates a CfnBot$PostFulfillmentStatusSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$PostFulfillmentStatusSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureConditional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:failure-conditional` |
| `failureNextStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:failure-next-step` |
| `failureResponse` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:failure-response` |
| `successConditional` | software.amazon.awscdk.services.lex.CfnBot$ConditionalSpecificationProperty | [[cdk.support/lookup-entry]] | `:success-conditional` |
| `successNextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:success-next-step` |
| `successResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:success-response` |
| `timeoutConditional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout-conditional` |
| `timeoutNextStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout-next-step` |
| `timeoutResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout-response` |
"
  [^CfnBot$PostFulfillmentStatusSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :failure-conditional)]
    (. builder failureConditional data))
  (when-let [data (lookup-entry config id :failure-next-step)]
    (. builder failureNextStep data))
  (when-let [data (lookup-entry config id :failure-response)]
    (. builder failureResponse data))
  (when-let [data (lookup-entry config id :success-conditional)]
    (. builder successConditional data))
  (when-let [data (lookup-entry config id :success-next-step)]
    (. builder successNextStep data))
  (when-let [data (lookup-entry config id :success-response)]
    (. builder successResponse data))
  (when-let [data (lookup-entry config id :timeout-conditional)]
    (. builder timeoutConditional data))
  (when-let [data (lookup-entry config id :timeout-next-step)]
    (. builder timeoutNextStep data))
  (when-let [data (lookup-entry config id :timeout-response)]
    (. builder timeoutResponse data))
  (.build builder))


(defn cfn-bot-post-fulfillment-status-specification-property-builder
  "Creates a  `CfnBot$PostFulfillmentStatusSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-post-fulfillment-status-specification-property-builder (new CfnBot$PostFulfillmentStatusSpecificationProperty$Builder) id config))


(defn build-cfn-bot-prompt-attempt-specification-property-builder
  "The build-cfn-bot-prompt-attempt-specification-property-builder function updates a CfnBot$PromptAttemptSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$PromptAttemptSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `allowedInputTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allowed-input-types` |
| `audioAndDtmfInputSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-and-dtmf-input-specification` |
| `textInputSpecification` | software.amazon.awscdk.services.lex.CfnBot$TextInputSpecificationProperty | [[cdk.support/lookup-entry]] | `:text-input-specification` |
"
  [^CfnBot$PromptAttemptSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-interrupt)]
    (. builder allowInterrupt data))
  (when-let [data (lookup-entry config id :allowed-input-types)]
    (. builder allowedInputTypes data))
  (when-let [data (lookup-entry config id :audio-and-dtmf-input-specification)]
    (. builder audioAndDtmfInputSpecification data))
  (when-let [data (lookup-entry config id :text-input-specification)]
    (. builder textInputSpecification data))
  (.build builder))


(defn cfn-bot-prompt-attempt-specification-property-builder
  "Creates a  `CfnBot$PromptAttemptSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-prompt-attempt-specification-property-builder (new CfnBot$PromptAttemptSpecificationProperty$Builder) id config))


(defn build-cfn-bot-prompt-specification-property-builder
  "The build-cfn-bot-prompt-specification-property-builder function updates a CfnBot$PromptSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$PromptSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `messageGroupsList` | java.util.List | [[cdk.support/lookup-entry]] | `:message-groups-list` |
| `messageSelectionStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-selection-strategy` |
| `promptAttemptsSpecification` | java.util.Map | [[cdk.support/lookup-entry]] | `:prompt-attempts-specification` |
"
  [^CfnBot$PromptSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-interrupt)]
    (. builder allowInterrupt data))
  (when-let [data (lookup-entry config id :max-retries)]
    (. builder maxRetries data))
  (when-let [data (lookup-entry config id :message-groups-list)]
    (. builder messageGroupsList data))
  (when-let [data (lookup-entry config id :message-selection-strategy)]
    (. builder messageSelectionStrategy data))
  (when-let [data (lookup-entry config id :prompt-attempts-specification)]
    (. builder promptAttemptsSpecification data))
  (.build builder))


(defn cfn-bot-prompt-specification-property-builder
  "Creates a  `CfnBot$PromptSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-prompt-specification-property-builder (new CfnBot$PromptSpecificationProperty$Builder) id config))


(defn build-cfn-bot-props-builder
  "The build-cfn-bot-props-builder function updates a CfnBotProps$Builder instance using the provided configuration.
  The function takes the CfnBotProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoBuildBotLocales` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:auto-build-bot-locales` |
| `botFileS3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-file-s3-location` |
| `botLocales` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-locales` |
| `botTags` | java.util.List | [[cdk.support/lookup-entry]] | `:bot-tags` |
| `dataPrivacy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:data-privacy` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `idleSessionTtlInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-session-ttl-in-seconds` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `testBotAliasSettings` | software.amazon.awscdk.services.lex.CfnBot$TestBotAliasSettingsProperty | [[cdk.support/lookup-entry]] | `:test-bot-alias-settings` |
| `testBotAliasTags` | java.util.List | [[cdk.support/lookup-entry]] | `:test-bot-alias-tags` |
"
  [^CfnBotProps$Builder builder id config]
  (when-let [data (lookup-entry config id :auto-build-bot-locales)]
    (. builder autoBuildBotLocales data))
  (when-let [data (lookup-entry config id :bot-file-s3-location)]
    (. builder botFileS3Location data))
  (when-let [data (lookup-entry config id :bot-locales)]
    (. builder botLocales data))
  (when-let [data (lookup-entry config id :bot-tags)]
    (. builder botTags data))
  (when-let [data (lookup-entry config id :data-privacy)]
    (. builder dataPrivacy data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :idle-session-ttl-in-seconds)]
    (. builder idleSessionTtlInSeconds data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :test-bot-alias-settings)]
    (. builder testBotAliasSettings data))
  (when-let [data (lookup-entry config id :test-bot-alias-tags)]
    (. builder testBotAliasTags data))
  (.build builder))


(defn cfn-bot-props-builder
  "Creates a  `CfnBotProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-props-builder (new CfnBotProps$Builder) id config))


(defn build-cfn-bot-response-specification-property-builder
  "The build-cfn-bot-response-specification-property-builder function updates a CfnBot$ResponseSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$ResponseSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `messageGroupsList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:message-groups-list` |
"
  [^CfnBot$ResponseSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-interrupt)]
    (. builder allowInterrupt data))
  (when-let [data (lookup-entry config id :message-groups-list)]
    (. builder messageGroupsList data))
  (.build builder))


(defn cfn-bot-response-specification-property-builder
  "Creates a  `CfnBot$ResponseSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-response-specification-property-builder (new CfnBot$ResponseSpecificationProperty$Builder) id config))


(defn build-cfn-bot-s3-bucket-log-destination-property-builder
  "The build-cfn-bot-s3-bucket-log-destination-property-builder function updates a CfnBot$S3BucketLogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$S3BucketLogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `logPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-prefix` |
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |
"
  [^CfnBot$S3BucketLogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-let [data (lookup-entry config id :log-prefix)]
    (. builder logPrefix data))
  (when-let [data (lookup-entry config id :s3-bucket-arn)]
    (. builder s3BucketArn data))
  (.build builder))


(defn cfn-bot-s3-bucket-log-destination-property-builder
  "Creates a  `CfnBot$S3BucketLogDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-s3-bucket-log-destination-property-builder (new CfnBot$S3BucketLogDestinationProperty$Builder) id config))


(defn build-cfn-bot-s3-location-property-builder
  "The build-cfn-bot-s3-location-property-builder function updates a CfnBot$S3LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$S3LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3ObjectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-key` |
| `s3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-version` |
"
  [^CfnBot$S3LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-let [data (lookup-entry config id :s3-object-key)]
    (. builder s3ObjectKey data))
  (when-let [data (lookup-entry config id :s3-object-version)]
    (. builder s3ObjectVersion data))
  (.build builder))


(defn cfn-bot-s3-location-property-builder
  "Creates a  `CfnBot$S3LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-s3-location-property-builder (new CfnBot$S3LocationProperty$Builder) id config))


(defn build-cfn-bot-sample-utterance-property-builder
  "The build-cfn-bot-sample-utterance-property-builder function updates a CfnBot$SampleUtteranceProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SampleUtteranceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `utterance` | java.lang.String | [[cdk.support/lookup-entry]] | `:utterance` |
"
  [^CfnBot$SampleUtteranceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :utterance)]
    (. builder utterance data))
  (.build builder))


(defn cfn-bot-sample-utterance-property-builder
  "Creates a  `CfnBot$SampleUtteranceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-sample-utterance-property-builder (new CfnBot$SampleUtteranceProperty$Builder) id config))


(defn build-cfn-bot-sample-value-property-builder
  "The build-cfn-bot-sample-value-property-builder function updates a CfnBot$SampleValueProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SampleValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBot$SampleValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-bot-sample-value-property-builder
  "Creates a  `CfnBot$SampleValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-sample-value-property-builder (new CfnBot$SampleValueProperty$Builder) id config))


(defn build-cfn-bot-sentiment-analysis-settings-property-builder
  "The build-cfn-bot-sentiment-analysis-settings-property-builder function updates a CfnBot$SentimentAnalysisSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SentimentAnalysisSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectSentiment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detect-sentiment` |
"
  [^CfnBot$SentimentAnalysisSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :detect-sentiment)]
    (. builder detectSentiment data))
  (.build builder))


(defn cfn-bot-sentiment-analysis-settings-property-builder
  "Creates a  `CfnBot$SentimentAnalysisSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-sentiment-analysis-settings-property-builder (new CfnBot$SentimentAnalysisSettingsProperty$Builder) id config))


(defn build-cfn-bot-session-attribute-property-builder
  "The build-cfn-bot-session-attribute-property-builder function updates a CfnBot$SessionAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SessionAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBot$SessionAttributeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-bot-session-attribute-property-builder
  "Creates a  `CfnBot$SessionAttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-session-attribute-property-builder (new CfnBot$SessionAttributeProperty$Builder) id config))


(defn build-cfn-bot-slot-capture-setting-property-builder
  "The build-cfn-bot-slot-capture-setting-property-builder function updates a CfnBot$SlotCaptureSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotCaptureSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `captureConditional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capture-conditional` |
| `captureNextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:capture-next-step` |
| `captureResponse` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:capture-response` |
| `codeHook` | software.amazon.awscdk.services.lex.CfnBot$DialogCodeHookInvocationSettingProperty | [[cdk.support/lookup-entry]] | `:code-hook` |
| `elicitationCodeHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:elicitation-code-hook` |
| `failureConditional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:failure-conditional` |
| `failureNextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:failure-next-step` |
| `failureResponse` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:failure-response` |
"
  [^CfnBot$SlotCaptureSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :capture-conditional)]
    (. builder captureConditional data))
  (when-let [data (lookup-entry config id :capture-next-step)]
    (. builder captureNextStep data))
  (when-let [data (lookup-entry config id :capture-response)]
    (. builder captureResponse data))
  (when-let [data (lookup-entry config id :code-hook)]
    (. builder codeHook data))
  (when-let [data (lookup-entry config id :elicitation-code-hook)]
    (. builder elicitationCodeHook data))
  (when-let [data (lookup-entry config id :failure-conditional)]
    (. builder failureConditional data))
  (when-let [data (lookup-entry config id :failure-next-step)]
    (. builder failureNextStep data))
  (when-let [data (lookup-entry config id :failure-response)]
    (. builder failureResponse data))
  (.build builder))


(defn cfn-bot-slot-capture-setting-property-builder
  "Creates a  `CfnBot$SlotCaptureSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-capture-setting-property-builder (new CfnBot$SlotCaptureSettingProperty$Builder) id config))


(defn build-cfn-bot-slot-default-value-property-builder
  "The build-cfn-bot-slot-default-value-property-builder function updates a CfnBot$SlotDefaultValueProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotDefaultValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
"
  [^CfnBot$SlotDefaultValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (.build builder))


(defn cfn-bot-slot-default-value-property-builder
  "Creates a  `CfnBot$SlotDefaultValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-default-value-property-builder (new CfnBot$SlotDefaultValueProperty$Builder) id config))


(defn build-cfn-bot-slot-default-value-specification-property-builder
  "The build-cfn-bot-slot-default-value-specification-property-builder function updates a CfnBot$SlotDefaultValueSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotDefaultValueSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValueList` | java.util.List | [[cdk.support/lookup-entry]] | `:default-value-list` |
"
  [^CfnBot$SlotDefaultValueSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-value-list)]
    (. builder defaultValueList data))
  (.build builder))


(defn cfn-bot-slot-default-value-specification-property-builder
  "Creates a  `CfnBot$SlotDefaultValueSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-default-value-specification-property-builder (new CfnBot$SlotDefaultValueSpecificationProperty$Builder) id config))


(defn build-cfn-bot-slot-priority-property-builder
  "The build-cfn-bot-slot-priority-property-builder function updates a CfnBot$SlotPriorityProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotPriorityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `slotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-name` |
"
  [^CfnBot$SlotPriorityProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :slot-name)]
    (. builder slotName data))
  (.build builder))


(defn cfn-bot-slot-priority-property-builder
  "Creates a  `CfnBot$SlotPriorityProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-priority-property-builder (new CfnBot$SlotPriorityProperty$Builder) id config))


(defn build-cfn-bot-slot-property-builder
  "The build-cfn-bot-slot-property-builder function updates a CfnBot$SlotProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `multipleValuesSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multiple-values-setting` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `obfuscationSetting` | software.amazon.awscdk.services.lex.CfnBot$ObfuscationSettingProperty | [[cdk.support/lookup-entry]] | `:obfuscation-setting` |
| `slotTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-type-name` |
| `valueElicitationSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value-elicitation-setting` |
"
  [^CfnBot$SlotProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :multiple-values-setting)]
    (. builder multipleValuesSetting data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :obfuscation-setting)]
    (. builder obfuscationSetting data))
  (when-let [data (lookup-entry config id :slot-type-name)]
    (. builder slotTypeName data))
  (when-let [data (lookup-entry config id :value-elicitation-setting)]
    (. builder valueElicitationSetting data))
  (.build builder))


(defn cfn-bot-slot-property-builder
  "Creates a  `CfnBot$SlotProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-property-builder (new CfnBot$SlotProperty$Builder) id config))


(defn build-cfn-bot-slot-type-property-builder
  "The build-cfn-bot-slot-type-property-builder function updates a CfnBot$SlotTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `externalSourceSetting` | software.amazon.awscdk.services.lex.CfnBot$ExternalSourceSettingProperty | [[cdk.support/lookup-entry]] | `:external-source-setting` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentSlotTypeSignature` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-slot-type-signature` |
| `slotTypeValues` | java.util.List | [[cdk.support/lookup-entry]] | `:slot-type-values` |
| `valueSelectionSetting` | software.amazon.awscdk.services.lex.CfnBot$SlotValueSelectionSettingProperty | [[cdk.support/lookup-entry]] | `:value-selection-setting` |
"
  [^CfnBot$SlotTypeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :external-source-setting)]
    (. builder externalSourceSetting data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :parent-slot-type-signature)]
    (. builder parentSlotTypeSignature data))
  (when-let [data (lookup-entry config id :slot-type-values)]
    (. builder slotTypeValues data))
  (when-let [data (lookup-entry config id :value-selection-setting)]
    (. builder valueSelectionSetting data))
  (.build builder))


(defn cfn-bot-slot-type-property-builder
  "Creates a  `CfnBot$SlotTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-type-property-builder (new CfnBot$SlotTypeProperty$Builder) id config))


(defn build-cfn-bot-slot-type-value-property-builder
  "The build-cfn-bot-slot-type-value-property-builder function updates a CfnBot$SlotTypeValueProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotTypeValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sampleValue` | software.amazon.awscdk.services.lex.CfnBot$SampleValueProperty | [[cdk.support/lookup-entry]] | `:sample-value` |
| `synonyms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:synonyms` |
"
  [^CfnBot$SlotTypeValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :sample-value)]
    (. builder sampleValue data))
  (when-let [data (lookup-entry config id :synonyms)]
    (. builder synonyms data))
  (.build builder))


(defn cfn-bot-slot-type-value-property-builder
  "Creates a  `CfnBot$SlotTypeValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-type-value-property-builder (new CfnBot$SlotTypeValueProperty$Builder) id config))


(defn build-cfn-bot-slot-value-elicitation-setting-property-builder
  "The build-cfn-bot-slot-value-elicitation-setting-property-builder function updates a CfnBot$SlotValueElicitationSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotValueElicitationSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValueSpecification` | software.amazon.awscdk.services.lex.CfnBot$SlotDefaultValueSpecificationProperty | [[cdk.support/lookup-entry]] | `:default-value-specification` |
| `promptSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:prompt-specification` |
| `sampleUtterances` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sample-utterances` |
| `slotCaptureSetting` | software.amazon.awscdk.services.lex.CfnBot$SlotCaptureSettingProperty | [[cdk.support/lookup-entry]] | `:slot-capture-setting` |
| `slotConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-constraint` |
| `waitAndContinueSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:wait-and-continue-specification` |
"
  [^CfnBot$SlotValueElicitationSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-value-specification)]
    (. builder defaultValueSpecification data))
  (when-let [data (lookup-entry config id :prompt-specification)]
    (. builder promptSpecification data))
  (when-let [data (lookup-entry config id :sample-utterances)]
    (. builder sampleUtterances data))
  (when-let [data (lookup-entry config id :slot-capture-setting)]
    (. builder slotCaptureSetting data))
  (when-let [data (lookup-entry config id :slot-constraint)]
    (. builder slotConstraint data))
  (when-let [data (lookup-entry config id :wait-and-continue-specification)]
    (. builder waitAndContinueSpecification data))
  (.build builder))


(defn cfn-bot-slot-value-elicitation-setting-property-builder
  "Creates a  `CfnBot$SlotValueElicitationSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-value-elicitation-setting-property-builder (new CfnBot$SlotValueElicitationSettingProperty$Builder) id config))


(defn build-cfn-bot-slot-value-override-map-property-builder
  "The build-cfn-bot-slot-value-override-map-property-builder function updates a CfnBot$SlotValueOverrideMapProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotValueOverrideMapProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `slotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-name` |
| `slotValueOverride` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:slot-value-override` |
"
  [^CfnBot$SlotValueOverrideMapProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :slot-name)]
    (. builder slotName data))
  (when-let [data (lookup-entry config id :slot-value-override)]
    (. builder slotValueOverride data))
  (.build builder))


(defn cfn-bot-slot-value-override-map-property-builder
  "Creates a  `CfnBot$SlotValueOverrideMapProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-value-override-map-property-builder (new CfnBot$SlotValueOverrideMapProperty$Builder) id config))


(defn build-cfn-bot-slot-value-override-property-builder
  "The build-cfn-bot-slot-value-override-property-builder function updates a CfnBot$SlotValueOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotValueOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `shape` | java.lang.String | [[cdk.support/lookup-entry]] | `:shape` |
| `value` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnBot$SlotValueOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :shape)]
    (. builder shape data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-bot-slot-value-override-property-builder
  "Creates a  `CfnBot$SlotValueOverrideProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-value-override-property-builder (new CfnBot$SlotValueOverrideProperty$Builder) id config))


(defn build-cfn-bot-slot-value-property-builder
  "The build-cfn-bot-slot-value-property-builder function updates a CfnBot$SlotValueProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interpretedValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:interpreted-value` |
"
  [^CfnBot$SlotValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :interpreted-value)]
    (. builder interpretedValue data))
  (.build builder))


(defn cfn-bot-slot-value-property-builder
  "Creates a  `CfnBot$SlotValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-value-property-builder (new CfnBot$SlotValueProperty$Builder) id config))


(defn build-cfn-bot-slot-value-regex-filter-property-builder
  "The build-cfn-bot-slot-value-regex-filter-property-builder function updates a CfnBot$SlotValueRegexFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotValueRegexFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
"
  [^CfnBot$SlotValueRegexFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :pattern)]
    (. builder pattern data))
  (.build builder))


(defn cfn-bot-slot-value-regex-filter-property-builder
  "Creates a  `CfnBot$SlotValueRegexFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-value-regex-filter-property-builder (new CfnBot$SlotValueRegexFilterProperty$Builder) id config))


(defn build-cfn-bot-slot-value-selection-setting-property-builder
  "The build-cfn-bot-slot-value-selection-setting-property-builder function updates a CfnBot$SlotValueSelectionSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SlotValueSelectionSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `advancedRecognitionSetting` | software.amazon.awscdk.services.lex.CfnBot$AdvancedRecognitionSettingProperty | [[cdk.support/lookup-entry]] | `:advanced-recognition-setting` |
| `regexFilter` | software.amazon.awscdk.services.lex.CfnBot$SlotValueRegexFilterProperty | [[cdk.support/lookup-entry]] | `:regex-filter` |
| `resolutionStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolution-strategy` |
"
  [^CfnBot$SlotValueSelectionSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :advanced-recognition-setting)]
    (. builder advancedRecognitionSetting data))
  (when-let [data (lookup-entry config id :regex-filter)]
    (. builder regexFilter data))
  (when-let [data (lookup-entry config id :resolution-strategy)]
    (. builder resolutionStrategy data))
  (.build builder))


(defn cfn-bot-slot-value-selection-setting-property-builder
  "Creates a  `CfnBot$SlotValueSelectionSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-slot-value-selection-setting-property-builder (new CfnBot$SlotValueSelectionSettingProperty$Builder) id config))


(defn build-cfn-bot-ssml-message-property-builder
  "The build-cfn-bot-ssml-message-property-builder function updates a CfnBot$SSMLMessageProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$SSMLMessageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnBot$SSMLMessageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-bot-ssml-message-property-builder
  "Creates a  `CfnBot$SSMLMessageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-ssml-message-property-builder (new CfnBot$SSMLMessageProperty$Builder) id config))


(defn build-cfn-bot-still-waiting-response-specification-property-builder
  "The build-cfn-bot-still-waiting-response-specification-property-builder function updates a CfnBot$StillWaitingResponseSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$StillWaitingResponseSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `frequencyInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:frequency-in-seconds` |
| `messageGroupsList` | java.util.List | [[cdk.support/lookup-entry]] | `:message-groups-list` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |
"
  [^CfnBot$StillWaitingResponseSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow-interrupt)]
    (. builder allowInterrupt data))
  (when-let [data (lookup-entry config id :frequency-in-seconds)]
    (. builder frequencyInSeconds data))
  (when-let [data (lookup-entry config id :message-groups-list)]
    (. builder messageGroupsList data))
  (when-let [data (lookup-entry config id :timeout-in-seconds)]
    (. builder timeoutInSeconds data))
  (.build builder))


(defn cfn-bot-still-waiting-response-specification-property-builder
  "Creates a  `CfnBot$StillWaitingResponseSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-still-waiting-response-specification-property-builder (new CfnBot$StillWaitingResponseSpecificationProperty$Builder) id config))


(defn build-cfn-bot-test-bot-alias-settings-property-builder
  "The build-cfn-bot-test-bot-alias-settings-property-builder function updates a CfnBot$TestBotAliasSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$TestBotAliasSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botAliasLocaleSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:bot-alias-locale-settings` |
| `conversationLogSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conversation-log-settings` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sentimentAnalysisSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:sentiment-analysis-settings` |
"
  [^CfnBot$TestBotAliasSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bot-alias-locale-settings)]
    (. builder botAliasLocaleSettings data))
  (when-let [data (lookup-entry config id :conversation-log-settings)]
    (. builder conversationLogSettings data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :sentiment-analysis-settings)]
    (. builder sentimentAnalysisSettings data))
  (.build builder))


(defn cfn-bot-test-bot-alias-settings-property-builder
  "Creates a  `CfnBot$TestBotAliasSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-test-bot-alias-settings-property-builder (new CfnBot$TestBotAliasSettingsProperty$Builder) id config))


(defn build-cfn-bot-text-input-specification-property-builder
  "The build-cfn-bot-text-input-specification-property-builder function updates a CfnBot$TextInputSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$TextInputSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `startTimeoutMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-timeout-ms` |
"
  [^CfnBot$TextInputSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :start-timeout-ms)]
    (. builder startTimeoutMs data))
  (.build builder))


(defn cfn-bot-text-input-specification-property-builder
  "Creates a  `CfnBot$TextInputSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-text-input-specification-property-builder (new CfnBot$TextInputSpecificationProperty$Builder) id config))


(defn build-cfn-bot-text-log-destination-property-builder
  "The build-cfn-bot-text-log-destination-property-builder function updates a CfnBot$TextLogDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$TextLogDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch` |
"
  [^CfnBot$TextLogDestinationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch)]
    (. builder cloudWatch data))
  (.build builder))


(defn cfn-bot-text-log-destination-property-builder
  "Creates a  `CfnBot$TextLogDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-text-log-destination-property-builder (new CfnBot$TextLogDestinationProperty$Builder) id config))


(defn build-cfn-bot-text-log-setting-property-builder
  "The build-cfn-bot-text-log-setting-property-builder function updates a CfnBot$TextLogSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$TextLogSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnBot$TextLogSettingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-bot-text-log-setting-property-builder
  "Creates a  `CfnBot$TextLogSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-text-log-setting-property-builder (new CfnBot$TextLogSettingProperty$Builder) id config))


(defn build-cfn-bot-version-bot-version-locale-details-property-builder
  "The build-cfn-bot-version-bot-version-locale-details-property-builder function updates a CfnBotVersion$BotVersionLocaleDetailsProperty$Builder instance using the provided configuration.
  The function takes the CfnBotVersion$BotVersionLocaleDetailsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceBotVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-bot-version` |
"
  [^CfnBotVersion$BotVersionLocaleDetailsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :source-bot-version)]
    (. builder sourceBotVersion data))
  (.build builder))


(defn cfn-bot-version-bot-version-locale-details-property-builder
  "Creates a  `CfnBotVersion$BotVersionLocaleDetailsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-version-bot-version-locale-details-property-builder (new CfnBotVersion$BotVersionLocaleDetailsProperty$Builder) id config))


(defn build-cfn-bot-version-bot-version-locale-specification-property-builder
  "The build-cfn-bot-version-bot-version-locale-specification-property-builder function updates a CfnBotVersion$BotVersionLocaleSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBotVersion$BotVersionLocaleSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botVersionLocaleDetails` | software.amazon.awscdk.services.lex.CfnBotVersion$BotVersionLocaleDetailsProperty | [[cdk.support/lookup-entry]] | `:bot-version-locale-details` |
| `localeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale-id` |
"
  [^CfnBotVersion$BotVersionLocaleSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bot-version-locale-details)]
    (. builder botVersionLocaleDetails data))
  (when-let [data (lookup-entry config id :locale-id)]
    (. builder localeId data))
  (.build builder))


(defn cfn-bot-version-bot-version-locale-specification-property-builder
  "Creates a  `CfnBotVersion$BotVersionLocaleSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-version-bot-version-locale-specification-property-builder (new CfnBotVersion$BotVersionLocaleSpecificationProperty$Builder) id config))


(defn build-cfn-bot-version-builder
  "The build-cfn-bot-version-builder function updates a CfnBotVersion$Builder instance using the provided configuration.
  The function takes the CfnBotVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-id` |
| `botVersionLocaleSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-version-locale-specification` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^CfnBotVersion$Builder builder id config]
  (when-let [data (lookup-entry config id :bot-id)]
    (. builder botId data))
  (when-let [data (lookup-entry config id :bot-version-locale-specification)]
    (. builder botVersionLocaleSpecification data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn cfn-bot-version-builder
  "Creates a  `CfnBotVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-bot-version-builder (CfnBotVersion$Builder/create scope (name id)) id config))


(defn build-cfn-bot-version-props-builder
  "The build-cfn-bot-version-props-builder function updates a CfnBotVersionProps$Builder instance using the provided configuration.
  The function takes the CfnBotVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-id` |
| `botVersionLocaleSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-version-locale-specification` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
"
  [^CfnBotVersionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :bot-id)]
    (. builder botId data))
  (when-let [data (lookup-entry config id :bot-version-locale-specification)]
    (. builder botVersionLocaleSpecification data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (.build builder))


(defn cfn-bot-version-props-builder
  "Creates a  `CfnBotVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-version-props-builder (new CfnBotVersionProps$Builder) id config))


(defn build-cfn-bot-voice-settings-property-builder
  "The build-cfn-bot-voice-settings-property-builder function updates a CfnBot$VoiceSettingsProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$VoiceSettingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `voiceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:voice-id` |
"
  [^CfnBot$VoiceSettingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :engine)]
    (. builder engine data))
  (when-let [data (lookup-entry config id :voice-id)]
    (. builder voiceId data))
  (.build builder))


(defn cfn-bot-voice-settings-property-builder
  "Creates a  `CfnBot$VoiceSettingsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-voice-settings-property-builder (new CfnBot$VoiceSettingsProperty$Builder) id config))


(defn build-cfn-bot-wait-and-continue-specification-property-builder
  "The build-cfn-bot-wait-and-continue-specification-property-builder function updates a CfnBot$WaitAndContinueSpecificationProperty$Builder instance using the provided configuration.
  The function takes the CfnBot$WaitAndContinueSpecificationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `continueResponse` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:continue-response` |
| `isActive` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-active` |
| `stillWaitingResponse` | software.amazon.awscdk.services.lex.CfnBot$StillWaitingResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:still-waiting-response` |
| `waitingResponse` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:waiting-response` |
"
  [^CfnBot$WaitAndContinueSpecificationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :continue-response)]
    (. builder continueResponse data))
  (when-let [data (lookup-entry config id :is-active)]
    (. builder isActive data))
  (when-let [data (lookup-entry config id :still-waiting-response)]
    (. builder stillWaitingResponse data))
  (when-let [data (lookup-entry config id :waiting-response)]
    (. builder waitingResponse data))
  (.build builder))


(defn cfn-bot-wait-and-continue-specification-property-builder
  "Creates a  `CfnBot$WaitAndContinueSpecificationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-bot-wait-and-continue-specification-property-builder (new CfnBot$WaitAndContinueSpecificationProperty$Builder) id config))


(defn build-cfn-resource-policy-builder
  "The build-cfn-resource-policy-builder function updates a CfnResourcePolicy$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnResourcePolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-resource-policy-builder
  "Creates a  `CfnResourcePolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-policy-builder (CfnResourcePolicy$Builder/create scope (name id)) id config))


(defn build-cfn-resource-policy-props-builder
  "The build-cfn-resource-policy-props-builder function updates a CfnResourcePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnResourcePolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-resource-policy-props-builder
  "Creates a  `CfnResourcePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-policy-props-builder (new CfnResourcePolicyProps$Builder) id config))