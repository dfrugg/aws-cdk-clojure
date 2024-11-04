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


(defn cfn-bot-advanced-recognition-setting-property-builder
  "The cfn-bot-advanced-recognition-setting-property-builder function buildes out new instances of 
CfnBot$AdvancedRecognitionSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioRecognitionStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:audio-recognition-strategy` |"
  [stack id config]
  (let [builder (CfnBot$AdvancedRecognitionSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :audio-recognition-strategy)]
      (. builder audioRecognitionStrategy data))
    (.build builder)))


(defn cfn-bot-alias-audio-log-destination-property-builder
  "The cfn-bot-alias-audio-log-destination-property-builder function buildes out new instances of 
CfnBotAlias$AudioLogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-bucket` |"
  [stack id config]
  (let [builder (CfnBotAlias$AudioLogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (.build builder)))


(defn cfn-bot-alias-audio-log-setting-property-builder
  "The cfn-bot-alias-audio-log-setting-property-builder function buildes out new instances of 
CfnBotAlias$AudioLogSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.lex.CfnBotAlias$AudioLogDestinationProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnBotAlias$AudioLogSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-bot-alias-bot-alias-locale-settings-item-property-builder
  "The cfn-bot-alias-bot-alias-locale-settings-item-property-builder function buildes out new instances of 
CfnBotAlias$BotAliasLocaleSettingsItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botAliasLocaleSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-locale-setting` |
| `localeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale-id` |"
  [stack id config]
  (let [builder (CfnBotAlias$BotAliasLocaleSettingsItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :bot-alias-locale-setting)]
      (. builder botAliasLocaleSetting data))
    (when-let [data (lookup-entry config id :locale-id)]
      (. builder localeId data))
    (.build builder)))


(defn cfn-bot-alias-bot-alias-locale-settings-property-builder
  "The cfn-bot-alias-bot-alias-locale-settings-property-builder function buildes out new instances of 
CfnBotAlias$BotAliasLocaleSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeHookSpecification` | software.amazon.awscdk.services.lex.CfnBotAlias$CodeHookSpecificationProperty | [[cdk.support/lookup-entry]] | `:code-hook-specification` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnBotAlias$BotAliasLocaleSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-hook-specification)]
      (. builder codeHookSpecification data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-bot-alias-builder
  "The cfn-bot-alias-builder function buildes out new instances of 
CfnBotAlias$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botAliasLocaleSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-locale-settings` |
| `botAliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-alias-name` |
| `botAliasTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-tags` |
| `botId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-id` |
| `botVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-version` |
| `conversationLogSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conversation-log-settings` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sentimentAnalysisSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:sentiment-analysis-settings` |"
  [stack id config]
  (let [builder (CfnBotAlias$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-bot-alias-cloud-watch-log-group-log-destination-property-builder
  "The cfn-bot-alias-cloud-watch-log-group-log-destination-property-builder function buildes out new instances of 
CfnBotAlias$CloudWatchLogGroupLogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-arn` |
| `logPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-prefix` |"
  [stack id config]
  (let [builder (CfnBotAlias$CloudWatchLogGroupLogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-log-group-arn)]
      (. builder cloudWatchLogGroupArn data))
    (when-let [data (lookup-entry config id :log-prefix)]
      (. builder logPrefix data))
    (.build builder)))


(defn cfn-bot-alias-code-hook-specification-property-builder
  "The cfn-bot-alias-code-hook-specification-property-builder function buildes out new instances of 
CfnBotAlias$CodeHookSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaCodeHook` | software.amazon.awscdk.services.lex.CfnBotAlias$LambdaCodeHookProperty | [[cdk.support/lookup-entry]] | `:lambda-code-hook` |"
  [stack id config]
  (let [builder (CfnBotAlias$CodeHookSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda-code-hook)]
      (. builder lambdaCodeHook data))
    (.build builder)))


(defn cfn-bot-alias-conversation-log-settings-property-builder
  "The cfn-bot-alias-conversation-log-settings-property-builder function buildes out new instances of 
CfnBotAlias$ConversationLogSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioLogSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-log-settings` |
| `textLogSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:text-log-settings` |"
  [stack id config]
  (let [builder (CfnBotAlias$ConversationLogSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :audio-log-settings)]
      (. builder audioLogSettings data))
    (when-let [data (lookup-entry config id :text-log-settings)]
      (. builder textLogSettings data))
    (.build builder)))


(defn cfn-bot-alias-lambda-code-hook-property-builder
  "The cfn-bot-alias-lambda-code-hook-property-builder function buildes out new instances of 
CfnBotAlias$LambdaCodeHookProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeHookInterfaceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-hook-interface-version` |
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |"
  [stack id config]
  (let [builder (CfnBotAlias$LambdaCodeHookProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-hook-interface-version)]
      (. builder codeHookInterfaceVersion data))
    (when-let [data (lookup-entry config id :lambda-arn)]
      (. builder lambdaArn data))
    (.build builder)))


(defn cfn-bot-alias-props-builder
  "The cfn-bot-alias-props-builder function buildes out new instances of 
CfnBotAliasProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botAliasLocaleSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-locale-settings` |
| `botAliasName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-alias-name` |
| `botAliasTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-tags` |
| `botId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-id` |
| `botVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-version` |
| `conversationLogSettings` | software.amazon.awscdk.services.lex.CfnBotAlias$ConversationLogSettingsProperty | [[cdk.support/lookup-entry]] | `:conversation-log-settings` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sentimentAnalysisSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:sentiment-analysis-settings` |"
  [stack id config]
  (let [builder (CfnBotAliasProps$Builder.)]
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
    (.build builder)))


(defn cfn-bot-alias-s3-bucket-log-destination-property-builder
  "The cfn-bot-alias-s3-bucket-log-destination-property-builder function buildes out new instances of 
CfnBotAlias$S3BucketLogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `logPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-prefix` |
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |"
  [stack id config]
  (let [builder (CfnBotAlias$S3BucketLogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :log-prefix)]
      (. builder logPrefix data))
    (when-let [data (lookup-entry config id :s3-bucket-arn)]
      (. builder s3BucketArn data))
    (.build builder)))


(defn cfn-bot-alias-sentiment-analysis-settings-property-builder
  "The cfn-bot-alias-sentiment-analysis-settings-property-builder function buildes out new instances of 
CfnBotAlias$SentimentAnalysisSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectSentiment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detect-sentiment` |"
  [stack id config]
  (let [builder (CfnBotAlias$SentimentAnalysisSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :detect-sentiment)]
      (. builder detectSentiment data))
    (.build builder)))


(defn cfn-bot-alias-text-log-destination-property-builder
  "The cfn-bot-alias-text-log-destination-property-builder function buildes out new instances of 
CfnBotAlias$TextLogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatch` | software.amazon.awscdk.services.lex.CfnBotAlias$CloudWatchLogGroupLogDestinationProperty | [[cdk.support/lookup-entry]] | `:cloud-watch` |"
  [stack id config]
  (let [builder (CfnBotAlias$TextLogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch)]
      (. builder cloudWatch data))
    (.build builder)))


(defn cfn-bot-alias-text-log-setting-property-builder
  "The cfn-bot-alias-text-log-setting-property-builder function buildes out new instances of 
CfnBotAlias$TextLogSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.lex.CfnBotAlias$TextLogDestinationProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnBotAlias$TextLogSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-bot-allowed-input-types-property-builder
  "The cfn-bot-allowed-input-types-property-builder function buildes out new instances of 
CfnBot$AllowedInputTypesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowAudioInput` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-audio-input` |
| `allowDtmfInput` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-dtmf-input` |"
  [stack id config]
  (let [builder (CfnBot$AllowedInputTypesProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-audio-input)]
      (. builder allowAudioInput data))
    (when-let [data (lookup-entry config id :allow-dtmf-input)]
      (. builder allowDtmfInput data))
    (.build builder)))


(defn cfn-bot-audio-and-dtmf-input-specification-property-builder
  "The cfn-bot-audio-and-dtmf-input-specification-property-builder function buildes out new instances of 
CfnBot$AudioAndDTMFInputSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-specification` |
| `dtmfSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dtmf-specification` |
| `startTimeoutMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-timeout-ms` |"
  [stack id config]
  (let [builder (CfnBot$AudioAndDTMFInputSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :audio-specification)]
      (. builder audioSpecification data))
    (when-let [data (lookup-entry config id :dtmf-specification)]
      (. builder dtmfSpecification data))
    (when-let [data (lookup-entry config id :start-timeout-ms)]
      (. builder startTimeoutMs data))
    (.build builder)))


(defn cfn-bot-audio-log-destination-property-builder
  "The cfn-bot-audio-log-destination-property-builder function buildes out new instances of 
CfnBot$AudioLogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-bucket` |"
  [stack id config]
  (let [builder (CfnBot$AudioLogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (.build builder)))


(defn cfn-bot-audio-log-setting-property-builder
  "The cfn-bot-audio-log-setting-property-builder function buildes out new instances of 
CfnBot$AudioLogSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.services.lex.CfnBot$AudioLogDestinationProperty | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnBot$AudioLogSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-bot-audio-specification-property-builder
  "The cfn-bot-audio-specification-property-builder function buildes out new instances of 
CfnBot$AudioSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTimeoutMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-timeout-ms` |
| `maxLengthMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-length-ms` |"
  [stack id config]
  (let [builder (CfnBot$AudioSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :end-timeout-ms)]
      (. builder endTimeoutMs data))
    (when-let [data (lookup-entry config id :max-length-ms)]
      (. builder maxLengthMs data))
    (.build builder)))


(defn cfn-bot-bot-alias-locale-settings-item-property-builder
  "The cfn-bot-bot-alias-locale-settings-item-property-builder function buildes out new instances of 
CfnBot$BotAliasLocaleSettingsItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botAliasLocaleSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-alias-locale-setting` |
| `localeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale-id` |"
  [stack id config]
  (let [builder (CfnBot$BotAliasLocaleSettingsItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :bot-alias-locale-setting)]
      (. builder botAliasLocaleSetting data))
    (when-let [data (lookup-entry config id :locale-id)]
      (. builder localeId data))
    (.build builder)))


(defn cfn-bot-bot-alias-locale-settings-property-builder
  "The cfn-bot-bot-alias-locale-settings-property-builder function buildes out new instances of 
CfnBot$BotAliasLocaleSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeHookSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-hook-specification` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnBot$BotAliasLocaleSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-hook-specification)]
      (. builder codeHookSpecification data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-bot-bot-locale-property-builder
  "The cfn-bot-bot-locale-property-builder function buildes out new instances of 
CfnBot$BotLocaleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customVocabulary` | software.amazon.awscdk.services.lex.CfnBot$CustomVocabularyProperty | [[cdk.support/lookup-entry]] | `:custom-vocabulary` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `intents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:intents` |
| `localeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale-id` |
| `nluConfidenceThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:nlu-confidence-threshold` |
| `slotTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:slot-types` |
| `voiceSettings` | software.amazon.awscdk.services.lex.CfnBot$VoiceSettingsProperty | [[cdk.support/lookup-entry]] | `:voice-settings` |"
  [stack id config]
  (let [builder (CfnBot$BotLocaleProperty$Builder.)]
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
    (.build builder)))


(defn cfn-bot-builder
  "The cfn-bot-builder function buildes out new instances of 
CfnBot$Builder using the provided configuration.  Each field is set as follows:

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
| `testBotAliasTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:test-bot-alias-tags` |"
  [stack id config]
  (let [builder (CfnBot$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-bot-button-property-builder
  "The cfn-bot-button-property-builder function buildes out new instances of 
CfnBot$ButtonProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBot$ButtonProperty$Builder.)]
    (when-let [data (lookup-entry config id :text)]
      (. builder text data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-bot-cloud-watch-log-group-log-destination-property-builder
  "The cfn-bot-cloud-watch-log-group-log-destination-property-builder function buildes out new instances of 
CfnBot$CloudWatchLogGroupLogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-arn` |
| `logPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-prefix` |"
  [stack id config]
  (let [builder (CfnBot$CloudWatchLogGroupLogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-log-group-arn)]
      (. builder cloudWatchLogGroupArn data))
    (when-let [data (lookup-entry config id :log-prefix)]
      (. builder logPrefix data))
    (.build builder)))


(defn cfn-bot-code-hook-specification-property-builder
  "The cfn-bot-code-hook-specification-property-builder function buildes out new instances of 
CfnBot$CodeHookSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaCodeHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda-code-hook` |"
  [stack id config]
  (let [builder (CfnBot$CodeHookSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda-code-hook)]
      (. builder lambdaCodeHook data))
    (.build builder)))


(defn cfn-bot-condition-property-builder
  "The cfn-bot-condition-property-builder function buildes out new instances of 
CfnBot$ConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expressionString` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression-string` |"
  [stack id config]
  (let [builder (CfnBot$ConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :expression-string)]
      (. builder expressionString data))
    (.build builder)))


(defn cfn-bot-conditional-branch-property-builder
  "The cfn-bot-conditional-branch-property-builder function buildes out new instances of 
CfnBot$ConditionalBranchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:condition` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `nextStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:next-step` |
| `response` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:response` |"
  [stack id config]
  (let [builder (CfnBot$ConditionalBranchProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :next-step)]
      (. builder nextStep data))
    (when-let [data (lookup-entry config id :response)]
      (. builder response data))
    (.build builder)))


(defn cfn-bot-conditional-specification-property-builder
  "The cfn-bot-conditional-specification-property-builder function buildes out new instances of 
CfnBot$ConditionalSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionalBranches` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditional-branches` |
| `defaultBranch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-branch` |
| `isActive` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-active` |"
  [stack id config]
  (let [builder (CfnBot$ConditionalSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :conditional-branches)]
      (. builder conditionalBranches data))
    (when-let [data (lookup-entry config id :default-branch)]
      (. builder defaultBranch data))
    (when-let [data (lookup-entry config id :is-active)]
      (. builder isActive data))
    (.build builder)))


(defn cfn-bot-conversation-log-settings-property-builder
  "The cfn-bot-conversation-log-settings-property-builder function buildes out new instances of 
CfnBot$ConversationLogSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `audioLogSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:audio-log-settings` |
| `textLogSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-log-settings` |"
  [stack id config]
  (let [builder (CfnBot$ConversationLogSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :audio-log-settings)]
      (. builder audioLogSettings data))
    (when-let [data (lookup-entry config id :text-log-settings)]
      (. builder textLogSettings data))
    (.build builder)))


(defn cfn-bot-custom-payload-property-builder
  "The cfn-bot-custom-payload-property-builder function buildes out new instances of 
CfnBot$CustomPayloadProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBot$CustomPayloadProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-bot-custom-vocabulary-item-property-builder
  "The cfn-bot-custom-vocabulary-item-property-builder function buildes out new instances of 
CfnBot$CustomVocabularyItemProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayAs` | java.lang.String | [[cdk.support/lookup-entry]] | `:display-as` |
| `phrase` | java.lang.String | [[cdk.support/lookup-entry]] | `:phrase` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnBot$CustomVocabularyItemProperty$Builder.)]
    (when-let [data (lookup-entry config id :display-as)]
      (. builder displayAs data))
    (when-let [data (lookup-entry config id :phrase)]
      (. builder phrase data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn cfn-bot-custom-vocabulary-property-builder
  "The cfn-bot-custom-vocabulary-property-builder function buildes out new instances of 
CfnBot$CustomVocabularyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customVocabularyItems` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-vocabulary-items` |"
  [stack id config]
  (let [builder (CfnBot$CustomVocabularyProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-vocabulary-items)]
      (. builder customVocabularyItems data))
    (.build builder)))


(defn cfn-bot-data-privacy-property-builder
  "The cfn-bot-data-privacy-property-builder function buildes out new instances of 
CfnBot$DataPrivacyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childDirected` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:child-directed` |"
  [stack id config]
  (let [builder (CfnBot$DataPrivacyProperty$Builder.)]
    (when-let [data (lookup-entry config id :child-directed)]
      (. builder childDirected data))
    (.build builder)))


(defn cfn-bot-default-conditional-branch-property-builder
  "The cfn-bot-default-conditional-branch-property-builder function buildes out new instances of 
CfnBot$DefaultConditionalBranchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `nextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:next-step` |
| `response` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:response` |"
  [stack id config]
  (let [builder (CfnBot$DefaultConditionalBranchProperty$Builder.)]
    (when-let [data (lookup-entry config id :next-step)]
      (. builder nextStep data))
    (when-let [data (lookup-entry config id :response)]
      (. builder response data))
    (.build builder)))


(defn cfn-bot-dialog-action-property-builder
  "The cfn-bot-dialog-action-property-builder function buildes out new instances of 
CfnBot$DialogActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `slotToElicit` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-to-elicit` |
| `suppressNextMessage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:suppress-next-message` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnBot$DialogActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :slot-to-elicit)]
      (. builder slotToElicit data))
    (when-let [data (lookup-entry config id :suppress-next-message)]
      (. builder suppressNextMessage data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-bot-dialog-code-hook-invocation-setting-property-builder
  "The cfn-bot-dialog-code-hook-invocation-setting-property-builder function buildes out new instances of 
CfnBot$DialogCodeHookInvocationSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableCodeHookInvocation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-code-hook-invocation` |
| `invocationLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-label` |
| `isActive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-active` |
| `postCodeHookSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-code-hook-specification` |"
  [stack id config]
  (let [builder (CfnBot$DialogCodeHookInvocationSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-code-hook-invocation)]
      (. builder enableCodeHookInvocation data))
    (when-let [data (lookup-entry config id :invocation-label)]
      (. builder invocationLabel data))
    (when-let [data (lookup-entry config id :is-active)]
      (. builder isActive data))
    (when-let [data (lookup-entry config id :post-code-hook-specification)]
      (. builder postCodeHookSpecification data))
    (.build builder)))


(defn cfn-bot-dialog-code-hook-setting-property-builder
  "The cfn-bot-dialog-code-hook-setting-property-builder function buildes out new instances of 
CfnBot$DialogCodeHookSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnBot$DialogCodeHookSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-bot-dialog-state-property-builder
  "The cfn-bot-dialog-state-property-builder function buildes out new instances of 
CfnBot$DialogStateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dialogAction` | software.amazon.awscdk.services.lex.CfnBot$DialogActionProperty | [[cdk.support/lookup-entry]] | `:dialog-action` |
| `intent` | software.amazon.awscdk.services.lex.CfnBot$IntentOverrideProperty | [[cdk.support/lookup-entry]] | `:intent` |
| `sessionAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:session-attributes` |"
  [stack id config]
  (let [builder (CfnBot$DialogStateProperty$Builder.)]
    (when-let [data (lookup-entry config id :dialog-action)]
      (. builder dialogAction data))
    (when-let [data (lookup-entry config id :intent)]
      (. builder intent data))
    (when-let [data (lookup-entry config id :session-attributes)]
      (. builder sessionAttributes data))
    (.build builder)))


(defn cfn-bot-dtmf-specification-property-builder
  "The cfn-bot-dtmf-specification-property-builder function buildes out new instances of 
CfnBot$DTMFSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deletionCharacter` | java.lang.String | [[cdk.support/lookup-entry]] | `:deletion-character` |
| `endCharacter` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-character` |
| `endTimeoutMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:end-timeout-ms` |
| `maxLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-length` |"
  [stack id config]
  (let [builder (CfnBot$DTMFSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :deletion-character)]
      (. builder deletionCharacter data))
    (when-let [data (lookup-entry config id :end-character)]
      (. builder endCharacter data))
    (when-let [data (lookup-entry config id :end-timeout-ms)]
      (. builder endTimeoutMs data))
    (when-let [data (lookup-entry config id :max-length)]
      (. builder maxLength data))
    (.build builder)))


(defn cfn-bot-elicitation-code-hook-invocation-setting-property-builder
  "The cfn-bot-elicitation-code-hook-invocation-setting-property-builder function buildes out new instances of 
CfnBot$ElicitationCodeHookInvocationSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableCodeHookInvocation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-code-hook-invocation` |
| `invocationLabel` | java.lang.String | [[cdk.support/lookup-entry]] | `:invocation-label` |"
  [stack id config]
  (let [builder (CfnBot$ElicitationCodeHookInvocationSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-code-hook-invocation)]
      (. builder enableCodeHookInvocation data))
    (when-let [data (lookup-entry config id :invocation-label)]
      (. builder invocationLabel data))
    (.build builder)))


(defn cfn-bot-external-source-setting-property-builder
  "The cfn-bot-external-source-setting-property-builder function buildes out new instances of 
CfnBot$ExternalSourceSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `grammarSlotTypeSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:grammar-slot-type-setting` |"
  [stack id config]
  (let [builder (CfnBot$ExternalSourceSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :grammar-slot-type-setting)]
      (. builder grammarSlotTypeSetting data))
    (.build builder)))


(defn cfn-bot-fulfillment-code-hook-setting-property-builder
  "The cfn-bot-fulfillment-code-hook-setting-property-builder function buildes out new instances of 
CfnBot$FulfillmentCodeHookSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `fulfillmentUpdatesSpecification` | software.amazon.awscdk.services.lex.CfnBot$FulfillmentUpdatesSpecificationProperty | [[cdk.support/lookup-entry]] | `:fulfillment-updates-specification` |
| `isActive` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-active` |
| `postFulfillmentStatusSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:post-fulfillment-status-specification` |"
  [stack id config]
  (let [builder (CfnBot$FulfillmentCodeHookSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :fulfillment-updates-specification)]
      (. builder fulfillmentUpdatesSpecification data))
    (when-let [data (lookup-entry config id :is-active)]
      (. builder isActive data))
    (when-let [data (lookup-entry config id :post-fulfillment-status-specification)]
      (. builder postFulfillmentStatusSpecification data))
    (.build builder)))


(defn cfn-bot-fulfillment-start-response-specification-property-builder
  "The cfn-bot-fulfillment-start-response-specification-property-builder function buildes out new instances of 
CfnBot$FulfillmentStartResponseSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `delayInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:delay-in-seconds` |
| `messageGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:message-groups` |"
  [stack id config]
  (let [builder (CfnBot$FulfillmentStartResponseSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-interrupt)]
      (. builder allowInterrupt data))
    (when-let [data (lookup-entry config id :delay-in-seconds)]
      (. builder delayInSeconds data))
    (when-let [data (lookup-entry config id :message-groups)]
      (. builder messageGroups data))
    (.build builder)))


(defn cfn-bot-fulfillment-update-response-specification-property-builder
  "The cfn-bot-fulfillment-update-response-specification-property-builder function buildes out new instances of 
CfnBot$FulfillmentUpdateResponseSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `frequencyInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:frequency-in-seconds` |
| `messageGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:message-groups` |"
  [stack id config]
  (let [builder (CfnBot$FulfillmentUpdateResponseSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-interrupt)]
      (. builder allowInterrupt data))
    (when-let [data (lookup-entry config id :frequency-in-seconds)]
      (. builder frequencyInSeconds data))
    (when-let [data (lookup-entry config id :message-groups)]
      (. builder messageGroups data))
    (.build builder)))


(defn cfn-bot-fulfillment-updates-specification-property-builder
  "The cfn-bot-fulfillment-updates-specification-property-builder function buildes out new instances of 
CfnBot$FulfillmentUpdatesSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `active` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:active` |
| `startResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:start-response` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |
| `updateResponse` | software.amazon.awscdk.services.lex.CfnBot$FulfillmentUpdateResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:update-response` |"
  [stack id config]
  (let [builder (CfnBot$FulfillmentUpdatesSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :active)]
      (. builder active data))
    (when-let [data (lookup-entry config id :start-response)]
      (. builder startResponse data))
    (when-let [data (lookup-entry config id :timeout-in-seconds)]
      (. builder timeoutInSeconds data))
    (when-let [data (lookup-entry config id :update-response)]
      (. builder updateResponse data))
    (.build builder)))


(defn cfn-bot-grammar-slot-type-setting-property-builder
  "The cfn-bot-grammar-slot-type-setting-property-builder function buildes out new instances of 
CfnBot$GrammarSlotTypeSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `source` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source` |"
  [stack id config]
  (let [builder (CfnBot$GrammarSlotTypeSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (.build builder)))


(defn cfn-bot-grammar-slot-type-source-property-builder
  "The cfn-bot-grammar-slot-type-source-property-builder function buildes out new instances of 
CfnBot$GrammarSlotTypeSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3ObjectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-key` |"
  [stack id config]
  (let [builder (CfnBot$GrammarSlotTypeSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-object-key)]
      (. builder s3ObjectKey data))
    (.build builder)))


(defn cfn-bot-image-response-card-property-builder
  "The cfn-bot-image-response-card-property-builder function buildes out new instances of 
CfnBot$ImageResponseCardProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buttons` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:buttons` |
| `imageUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-url` |
| `subtitle` | java.lang.String | [[cdk.support/lookup-entry]] | `:subtitle` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |"
  [stack id config]
  (let [builder (CfnBot$ImageResponseCardProperty$Builder.)]
    (when-let [data (lookup-entry config id :buttons)]
      (. builder buttons data))
    (when-let [data (lookup-entry config id :image-url)]
      (. builder imageUrl data))
    (when-let [data (lookup-entry config id :subtitle)]
      (. builder subtitle data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (.build builder)))


(defn cfn-bot-initial-response-setting-property-builder
  "The cfn-bot-initial-response-setting-property-builder function buildes out new instances of 
CfnBot$InitialResponseSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:code-hook` |
| `conditional` | software.amazon.awscdk.services.lex.CfnBot$ConditionalSpecificationProperty | [[cdk.support/lookup-entry]] | `:conditional` |
| `initialResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:initial-response` |
| `nextStep` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:next-step` |"
  [stack id config]
  (let [builder (CfnBot$InitialResponseSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-hook)]
      (. builder codeHook data))
    (when-let [data (lookup-entry config id :conditional)]
      (. builder conditional data))
    (when-let [data (lookup-entry config id :initial-response)]
      (. builder initialResponse data))
    (when-let [data (lookup-entry config id :next-step)]
      (. builder nextStep data))
    (.build builder)))


(defn cfn-bot-input-context-property-builder
  "The cfn-bot-input-context-property-builder function buildes out new instances of 
CfnBot$InputContextProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnBot$InputContextProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-bot-intent-closing-setting-property-builder
  "The cfn-bot-intent-closing-setting-property-builder function buildes out new instances of 
CfnBot$IntentClosingSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `closingResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:closing-response` |
| `conditional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditional` |
| `isActive` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-active` |
| `nextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:next-step` |"
  [stack id config]
  (let [builder (CfnBot$IntentClosingSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :closing-response)]
      (. builder closingResponse data))
    (when-let [data (lookup-entry config id :conditional)]
      (. builder conditional data))
    (when-let [data (lookup-entry config id :is-active)]
      (. builder isActive data))
    (when-let [data (lookup-entry config id :next-step)]
      (. builder nextStep data))
    (.build builder)))


(defn cfn-bot-intent-confirmation-setting-property-builder
  "The cfn-bot-intent-confirmation-setting-property-builder function buildes out new instances of 
CfnBot$IntentConfirmationSettingProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `promptSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:prompt-specification` |"
  [stack id config]
  (let [builder (CfnBot$IntentConfirmationSettingProperty$Builder.)]
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
    (.build builder)))


(defn cfn-bot-intent-override-property-builder
  "The cfn-bot-intent-override-property-builder function buildes out new instances of 
CfnBot$IntentOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `slots` | java.util.List | [[cdk.support/lookup-entry]] | `:slots` |"
  [stack id config]
  (let [builder (CfnBot$IntentOverrideProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :slots)]
      (. builder slots data))
    (.build builder)))


(defn cfn-bot-intent-property-builder
  "The cfn-bot-intent-property-builder function buildes out new instances of 
CfnBot$IntentProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `slots` | java.util.List | [[cdk.support/lookup-entry]] | `:slots` |"
  [stack id config]
  (let [builder (CfnBot$IntentProperty$Builder.)]
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
    (.build builder)))


(defn cfn-bot-kendra-configuration-property-builder
  "The cfn-bot-kendra-configuration-property-builder function buildes out new instances of 
CfnBot$KendraConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kendraIndex` | java.lang.String | [[cdk.support/lookup-entry]] | `:kendra-index` |
| `queryFilterString` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-filter-string` |
| `queryFilterStringEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:query-filter-string-enabled` |"
  [stack id config]
  (let [builder (CfnBot$KendraConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kendra-index)]
      (. builder kendraIndex data))
    (when-let [data (lookup-entry config id :query-filter-string)]
      (. builder queryFilterString data))
    (when-let [data (lookup-entry config id :query-filter-string-enabled)]
      (. builder queryFilterStringEnabled data))
    (.build builder)))


(defn cfn-bot-lambda-code-hook-property-builder
  "The cfn-bot-lambda-code-hook-property-builder function buildes out new instances of 
CfnBot$LambdaCodeHookProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `codeHookInterfaceVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:code-hook-interface-version` |
| `lambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-arn` |"
  [stack id config]
  (let [builder (CfnBot$LambdaCodeHookProperty$Builder.)]
    (when-let [data (lookup-entry config id :code-hook-interface-version)]
      (. builder codeHookInterfaceVersion data))
    (when-let [data (lookup-entry config id :lambda-arn)]
      (. builder lambdaArn data))
    (.build builder)))


(defn cfn-bot-message-group-property-builder
  "The cfn-bot-message-group-property-builder function buildes out new instances of 
CfnBot$MessageGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `message` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:message` |
| `variations` | java.util.List | [[cdk.support/lookup-entry]] | `:variations` |"
  [stack id config]
  (let [builder (CfnBot$MessageGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :variations)]
      (. builder variations data))
    (.build builder)))


(defn cfn-bot-message-property-builder
  "The cfn-bot-message-property-builder function buildes out new instances of 
CfnBot$MessageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customPayload` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-payload` |
| `imageResponseCard` | software.amazon.awscdk.services.lex.CfnBot$ImageResponseCardProperty | [[cdk.support/lookup-entry]] | `:image-response-card` |
| `plainTextMessage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:plain-text-message` |
| `ssmlMessage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ssml-message` |"
  [stack id config]
  (let [builder (CfnBot$MessageProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-payload)]
      (. builder customPayload data))
    (when-let [data (lookup-entry config id :image-response-card)]
      (. builder imageResponseCard data))
    (when-let [data (lookup-entry config id :plain-text-message)]
      (. builder plainTextMessage data))
    (when-let [data (lookup-entry config id :ssml-message)]
      (. builder ssmlMessage data))
    (.build builder)))


(defn cfn-bot-multiple-values-setting-property-builder
  "The cfn-bot-multiple-values-setting-property-builder function buildes out new instances of 
CfnBot$MultipleValuesSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowMultipleValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-multiple-values` |"
  [stack id config]
  (let [builder (CfnBot$MultipleValuesSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-multiple-values)]
      (. builder allowMultipleValues data))
    (.build builder)))


(defn cfn-bot-obfuscation-setting-property-builder
  "The cfn-bot-obfuscation-setting-property-builder function buildes out new instances of 
CfnBot$ObfuscationSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `obfuscationSettingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:obfuscation-setting-type` |"
  [stack id config]
  (let [builder (CfnBot$ObfuscationSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :obfuscation-setting-type)]
      (. builder obfuscationSettingType data))
    (.build builder)))


(defn cfn-bot-output-context-property-builder
  "The cfn-bot-output-context-property-builder function buildes out new instances of 
CfnBot$OutputContextProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `timeToLiveInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:time-to-live-in-seconds` |
| `turnsToLive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:turns-to-live` |"
  [stack id config]
  (let [builder (CfnBot$OutputContextProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :time-to-live-in-seconds)]
      (. builder timeToLiveInSeconds data))
    (when-let [data (lookup-entry config id :turns-to-live)]
      (. builder turnsToLive data))
    (.build builder)))


(defn cfn-bot-plain-text-message-property-builder
  "The cfn-bot-plain-text-message-property-builder function buildes out new instances of 
CfnBot$PlainTextMessageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBot$PlainTextMessageProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-bot-post-dialog-code-hook-invocation-specification-property-builder
  "The cfn-bot-post-dialog-code-hook-invocation-specification-property-builder function buildes out new instances of 
CfnBot$PostDialogCodeHookInvocationSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `timeoutResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout-response` |"
  [stack id config]
  (let [builder (CfnBot$PostDialogCodeHookInvocationSpecificationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-bot-post-fulfillment-status-specification-property-builder
  "The cfn-bot-post-fulfillment-status-specification-property-builder function buildes out new instances of 
CfnBot$PostFulfillmentStatusSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `timeoutResponse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:timeout-response` |"
  [stack id config]
  (let [builder (CfnBot$PostFulfillmentStatusSpecificationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-bot-prompt-attempt-specification-property-builder
  "The cfn-bot-prompt-attempt-specification-property-builder function buildes out new instances of 
CfnBot$PromptAttemptSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `allowedInputTypes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allowed-input-types` |
| `audioAndDtmfInputSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:audio-and-dtmf-input-specification` |
| `textInputSpecification` | software.amazon.awscdk.services.lex.CfnBot$TextInputSpecificationProperty | [[cdk.support/lookup-entry]] | `:text-input-specification` |"
  [stack id config]
  (let [builder (CfnBot$PromptAttemptSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-interrupt)]
      (. builder allowInterrupt data))
    (when-let [data (lookup-entry config id :allowed-input-types)]
      (. builder allowedInputTypes data))
    (when-let [data (lookup-entry config id :audio-and-dtmf-input-specification)]
      (. builder audioAndDtmfInputSpecification data))
    (when-let [data (lookup-entry config id :text-input-specification)]
      (. builder textInputSpecification data))
    (.build builder)))


(defn cfn-bot-prompt-specification-property-builder
  "The cfn-bot-prompt-specification-property-builder function buildes out new instances of 
CfnBot$PromptSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `maxRetries` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retries` |
| `messageGroupsList` | java.util.List | [[cdk.support/lookup-entry]] | `:message-groups-list` |
| `messageSelectionStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-selection-strategy` |
| `promptAttemptsSpecification` | java.util.Map | [[cdk.support/lookup-entry]] | `:prompt-attempts-specification` |"
  [stack id config]
  (let [builder (CfnBot$PromptSpecificationProperty$Builder.)]
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
    (.build builder)))


(defn cfn-bot-props-builder
  "The cfn-bot-props-builder function buildes out new instances of 
CfnBotProps$Builder using the provided configuration.  Each field is set as follows:

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
| `testBotAliasTags` | java.util.List | [[cdk.support/lookup-entry]] | `:test-bot-alias-tags` |"
  [stack id config]
  (let [builder (CfnBotProps$Builder.)]
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
    (.build builder)))


(defn cfn-bot-response-specification-property-builder
  "The cfn-bot-response-specification-property-builder function buildes out new instances of 
CfnBot$ResponseSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `messageGroupsList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:message-groups-list` |"
  [stack id config]
  (let [builder (CfnBot$ResponseSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-interrupt)]
      (. builder allowInterrupt data))
    (when-let [data (lookup-entry config id :message-groups-list)]
      (. builder messageGroupsList data))
    (.build builder)))


(defn cfn-bot-s3-bucket-log-destination-property-builder
  "The cfn-bot-s3-bucket-log-destination-property-builder function buildes out new instances of 
CfnBot$S3BucketLogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `logPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-prefix` |
| `s3BucketArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-arn` |"
  [stack id config]
  (let [builder (CfnBot$S3BucketLogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :log-prefix)]
      (. builder logPrefix data))
    (when-let [data (lookup-entry config id :s3-bucket-arn)]
      (. builder s3BucketArn data))
    (.build builder)))


(defn cfn-bot-s3-location-property-builder
  "The cfn-bot-s3-location-property-builder function buildes out new instances of 
CfnBot$S3LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3ObjectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-key` |
| `s3ObjectVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-object-version` |"
  [stack id config]
  (let [builder (CfnBot$S3LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-object-key)]
      (. builder s3ObjectKey data))
    (when-let [data (lookup-entry config id :s3-object-version)]
      (. builder s3ObjectVersion data))
    (.build builder)))


(defn cfn-bot-sample-utterance-property-builder
  "The cfn-bot-sample-utterance-property-builder function buildes out new instances of 
CfnBot$SampleUtteranceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `utterance` | java.lang.String | [[cdk.support/lookup-entry]] | `:utterance` |"
  [stack id config]
  (let [builder (CfnBot$SampleUtteranceProperty$Builder.)]
    (when-let [data (lookup-entry config id :utterance)]
      (. builder utterance data))
    (.build builder)))


(defn cfn-bot-sample-value-property-builder
  "The cfn-bot-sample-value-property-builder function buildes out new instances of 
CfnBot$SampleValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBot$SampleValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-bot-sentiment-analysis-settings-property-builder
  "The cfn-bot-sentiment-analysis-settings-property-builder function buildes out new instances of 
CfnBot$SentimentAnalysisSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `detectSentiment` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:detect-sentiment` |"
  [stack id config]
  (let [builder (CfnBot$SentimentAnalysisSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :detect-sentiment)]
      (. builder detectSentiment data))
    (.build builder)))


(defn cfn-bot-session-attribute-property-builder
  "The cfn-bot-session-attribute-property-builder function buildes out new instances of 
CfnBot$SessionAttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBot$SessionAttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-bot-slot-capture-setting-property-builder
  "The cfn-bot-slot-capture-setting-property-builder function buildes out new instances of 
CfnBot$SlotCaptureSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `captureConditional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:capture-conditional` |
| `captureNextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:capture-next-step` |
| `captureResponse` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:capture-response` |
| `codeHook` | software.amazon.awscdk.services.lex.CfnBot$DialogCodeHookInvocationSettingProperty | [[cdk.support/lookup-entry]] | `:code-hook` |
| `elicitationCodeHook` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:elicitation-code-hook` |
| `failureConditional` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:failure-conditional` |
| `failureNextStep` | software.amazon.awscdk.services.lex.CfnBot$DialogStateProperty | [[cdk.support/lookup-entry]] | `:failure-next-step` |
| `failureResponse` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:failure-response` |"
  [stack id config]
  (let [builder (CfnBot$SlotCaptureSettingProperty$Builder.)]
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
    (.build builder)))


(defn cfn-bot-slot-default-value-property-builder
  "The cfn-bot-slot-default-value-property-builder function buildes out new instances of 
CfnBot$SlotDefaultValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |"
  [stack id config]
  (let [builder (CfnBot$SlotDefaultValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (.build builder)))


(defn cfn-bot-slot-default-value-specification-property-builder
  "The cfn-bot-slot-default-value-specification-property-builder function buildes out new instances of 
CfnBot$SlotDefaultValueSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValueList` | java.util.List | [[cdk.support/lookup-entry]] | `:default-value-list` |"
  [stack id config]
  (let [builder (CfnBot$SlotDefaultValueSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-value-list)]
      (. builder defaultValueList data))
    (.build builder)))


(defn cfn-bot-slot-priority-property-builder
  "The cfn-bot-slot-priority-property-builder function buildes out new instances of 
CfnBot$SlotPriorityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `slotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-name` |"
  [stack id config]
  (let [builder (CfnBot$SlotPriorityProperty$Builder.)]
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :slot-name)]
      (. builder slotName data))
    (.build builder)))


(defn cfn-bot-slot-property-builder
  "The cfn-bot-slot-property-builder function buildes out new instances of 
CfnBot$SlotProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `multipleValuesSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multiple-values-setting` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `obfuscationSetting` | software.amazon.awscdk.services.lex.CfnBot$ObfuscationSettingProperty | [[cdk.support/lookup-entry]] | `:obfuscation-setting` |
| `slotTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-type-name` |
| `valueElicitationSetting` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value-elicitation-setting` |"
  [stack id config]
  (let [builder (CfnBot$SlotProperty$Builder.)]
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
    (.build builder)))


(defn cfn-bot-slot-type-property-builder
  "The cfn-bot-slot-type-property-builder function buildes out new instances of 
CfnBot$SlotTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `externalSourceSetting` | software.amazon.awscdk.services.lex.CfnBot$ExternalSourceSettingProperty | [[cdk.support/lookup-entry]] | `:external-source-setting` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentSlotTypeSignature` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-slot-type-signature` |
| `slotTypeValues` | java.util.List | [[cdk.support/lookup-entry]] | `:slot-type-values` |
| `valueSelectionSetting` | software.amazon.awscdk.services.lex.CfnBot$SlotValueSelectionSettingProperty | [[cdk.support/lookup-entry]] | `:value-selection-setting` |"
  [stack id config]
  (let [builder (CfnBot$SlotTypeProperty$Builder.)]
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
    (.build builder)))


(defn cfn-bot-slot-type-value-property-builder
  "The cfn-bot-slot-type-value-property-builder function buildes out new instances of 
CfnBot$SlotTypeValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sampleValue` | software.amazon.awscdk.services.lex.CfnBot$SampleValueProperty | [[cdk.support/lookup-entry]] | `:sample-value` |
| `synonyms` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:synonyms` |"
  [stack id config]
  (let [builder (CfnBot$SlotTypeValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :sample-value)]
      (. builder sampleValue data))
    (when-let [data (lookup-entry config id :synonyms)]
      (. builder synonyms data))
    (.build builder)))


(defn cfn-bot-slot-value-elicitation-setting-property-builder
  "The cfn-bot-slot-value-elicitation-setting-property-builder function buildes out new instances of 
CfnBot$SlotValueElicitationSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValueSpecification` | software.amazon.awscdk.services.lex.CfnBot$SlotDefaultValueSpecificationProperty | [[cdk.support/lookup-entry]] | `:default-value-specification` |
| `promptSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:prompt-specification` |
| `sampleUtterances` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sample-utterances` |
| `slotCaptureSetting` | software.amazon.awscdk.services.lex.CfnBot$SlotCaptureSettingProperty | [[cdk.support/lookup-entry]] | `:slot-capture-setting` |
| `slotConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-constraint` |
| `waitAndContinueSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:wait-and-continue-specification` |"
  [stack id config]
  (let [builder (CfnBot$SlotValueElicitationSettingProperty$Builder.)]
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
    (.build builder)))


(defn cfn-bot-slot-value-override-map-property-builder
  "The cfn-bot-slot-value-override-map-property-builder function buildes out new instances of 
CfnBot$SlotValueOverrideMapProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `slotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-name` |
| `slotValueOverride` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:slot-value-override` |"
  [stack id config]
  (let [builder (CfnBot$SlotValueOverrideMapProperty$Builder.)]
    (when-let [data (lookup-entry config id :slot-name)]
      (. builder slotName data))
    (when-let [data (lookup-entry config id :slot-value-override)]
      (. builder slotValueOverride data))
    (.build builder)))


(defn cfn-bot-slot-value-override-property-builder
  "The cfn-bot-slot-value-override-property-builder function buildes out new instances of 
CfnBot$SlotValueOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `shape` | java.lang.String | [[cdk.support/lookup-entry]] | `:shape` |
| `value` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnBot$SlotValueOverrideProperty$Builder.)]
    (when-let [data (lookup-entry config id :shape)]
      (. builder shape data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-bot-slot-value-property-builder
  "The cfn-bot-slot-value-property-builder function buildes out new instances of 
CfnBot$SlotValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interpretedValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:interpreted-value` |"
  [stack id config]
  (let [builder (CfnBot$SlotValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :interpreted-value)]
      (. builder interpretedValue data))
    (.build builder)))


(defn cfn-bot-slot-value-regex-filter-property-builder
  "The cfn-bot-slot-value-regex-filter-property-builder function buildes out new instances of 
CfnBot$SlotValueRegexFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |"
  [stack id config]
  (let [builder (CfnBot$SlotValueRegexFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (.build builder)))


(defn cfn-bot-slot-value-selection-setting-property-builder
  "The cfn-bot-slot-value-selection-setting-property-builder function buildes out new instances of 
CfnBot$SlotValueSelectionSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `advancedRecognitionSetting` | software.amazon.awscdk.services.lex.CfnBot$AdvancedRecognitionSettingProperty | [[cdk.support/lookup-entry]] | `:advanced-recognition-setting` |
| `regexFilter` | software.amazon.awscdk.services.lex.CfnBot$SlotValueRegexFilterProperty | [[cdk.support/lookup-entry]] | `:regex-filter` |
| `resolutionStrategy` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolution-strategy` |"
  [stack id config]
  (let [builder (CfnBot$SlotValueSelectionSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :advanced-recognition-setting)]
      (. builder advancedRecognitionSetting data))
    (when-let [data (lookup-entry config id :regex-filter)]
      (. builder regexFilter data))
    (when-let [data (lookup-entry config id :resolution-strategy)]
      (. builder resolutionStrategy data))
    (.build builder)))


(defn cfn-bot-ssml-message-property-builder
  "The cfn-bot-ssml-message-property-builder function buildes out new instances of 
CfnBot$SSMLMessageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBot$SSMLMessageProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-bot-still-waiting-response-specification-property-builder
  "The cfn-bot-still-waiting-response-specification-property-builder function buildes out new instances of 
CfnBot$StillWaitingResponseSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowInterrupt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-interrupt` |
| `frequencyInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:frequency-in-seconds` |
| `messageGroupsList` | java.util.List | [[cdk.support/lookup-entry]] | `:message-groups-list` |
| `timeoutInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-in-seconds` |"
  [stack id config]
  (let [builder (CfnBot$StillWaitingResponseSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-interrupt)]
      (. builder allowInterrupt data))
    (when-let [data (lookup-entry config id :frequency-in-seconds)]
      (. builder frequencyInSeconds data))
    (when-let [data (lookup-entry config id :message-groups-list)]
      (. builder messageGroupsList data))
    (when-let [data (lookup-entry config id :timeout-in-seconds)]
      (. builder timeoutInSeconds data))
    (.build builder)))


(defn cfn-bot-test-bot-alias-settings-property-builder
  "The cfn-bot-test-bot-alias-settings-property-builder function buildes out new instances of 
CfnBot$TestBotAliasSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botAliasLocaleSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:bot-alias-locale-settings` |
| `conversationLogSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conversation-log-settings` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sentimentAnalysisSettings` | java.lang.Object | [[cdk.support/lookup-entry]] | `:sentiment-analysis-settings` |"
  [stack id config]
  (let [builder (CfnBot$TestBotAliasSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :bot-alias-locale-settings)]
      (. builder botAliasLocaleSettings data))
    (when-let [data (lookup-entry config id :conversation-log-settings)]
      (. builder conversationLogSettings data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :sentiment-analysis-settings)]
      (. builder sentimentAnalysisSettings data))
    (.build builder)))


(defn cfn-bot-text-input-specification-property-builder
  "The cfn-bot-text-input-specification-property-builder function buildes out new instances of 
CfnBot$TextInputSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `startTimeoutMs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-timeout-ms` |"
  [stack id config]
  (let [builder (CfnBot$TextInputSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :start-timeout-ms)]
      (. builder startTimeoutMs data))
    (.build builder)))


(defn cfn-bot-text-log-destination-property-builder
  "The cfn-bot-text-log-destination-property-builder function buildes out new instances of 
CfnBot$TextLogDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch` |"
  [stack id config]
  (let [builder (CfnBot$TextLogDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch)]
      (. builder cloudWatch data))
    (.build builder)))


(defn cfn-bot-text-log-setting-property-builder
  "The cfn-bot-text-log-setting-property-builder function buildes out new instances of 
CfnBot$TextLogSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnBot$TextLogSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-bot-version-bot-version-locale-details-property-builder
  "The cfn-bot-version-bot-version-locale-details-property-builder function buildes out new instances of 
CfnBotVersion$BotVersionLocaleDetailsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `sourceBotVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-bot-version` |"
  [stack id config]
  (let [builder (CfnBotVersion$BotVersionLocaleDetailsProperty$Builder.)]
    (when-let [data (lookup-entry config id :source-bot-version)]
      (. builder sourceBotVersion data))
    (.build builder)))


(defn cfn-bot-version-bot-version-locale-specification-property-builder
  "The cfn-bot-version-bot-version-locale-specification-property-builder function buildes out new instances of 
CfnBotVersion$BotVersionLocaleSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botVersionLocaleDetails` | software.amazon.awscdk.services.lex.CfnBotVersion$BotVersionLocaleDetailsProperty | [[cdk.support/lookup-entry]] | `:bot-version-locale-details` |
| `localeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:locale-id` |"
  [stack id config]
  (let [builder (CfnBotVersion$BotVersionLocaleSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :bot-version-locale-details)]
      (. builder botVersionLocaleDetails data))
    (when-let [data (lookup-entry config id :locale-id)]
      (. builder localeId data))
    (.build builder)))


(defn cfn-bot-version-builder
  "The cfn-bot-version-builder function buildes out new instances of 
CfnBotVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-id` |
| `botVersionLocaleSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-version-locale-specification` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnBotVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :bot-id)]
      (. builder botId data))
    (when-let [data (lookup-entry config id :bot-version-locale-specification)]
      (. builder botVersionLocaleSpecification data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-bot-version-props-builder
  "The cfn-bot-version-props-builder function buildes out new instances of 
CfnBotVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `botId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bot-id` |
| `botVersionLocaleSpecification` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bot-version-locale-specification` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |"
  [stack id config]
  (let [builder (CfnBotVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :bot-id)]
      (. builder botId data))
    (when-let [data (lookup-entry config id :bot-version-locale-specification)]
      (. builder botVersionLocaleSpecification data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (.build builder)))


(defn cfn-bot-voice-settings-property-builder
  "The cfn-bot-voice-settings-property-builder function buildes out new instances of 
CfnBot$VoiceSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `engine` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine` |
| `voiceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:voice-id` |"
  [stack id config]
  (let [builder (CfnBot$VoiceSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :engine)]
      (. builder engine data))
    (when-let [data (lookup-entry config id :voice-id)]
      (. builder voiceId data))
    (.build builder)))


(defn cfn-bot-wait-and-continue-specification-property-builder
  "The cfn-bot-wait-and-continue-specification-property-builder function buildes out new instances of 
CfnBot$WaitAndContinueSpecificationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `continueResponse` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:continue-response` |
| `isActive` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-active` |
| `stillWaitingResponse` | software.amazon.awscdk.services.lex.CfnBot$StillWaitingResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:still-waiting-response` |
| `waitingResponse` | software.amazon.awscdk.services.lex.CfnBot$ResponseSpecificationProperty | [[cdk.support/lookup-entry]] | `:waiting-response` |"
  [stack id config]
  (let [builder (CfnBot$WaitAndContinueSpecificationProperty$Builder.)]
    (when-let [data (lookup-entry config id :continue-response)]
      (. builder continueResponse data))
    (when-let [data (lookup-entry config id :is-active)]
      (. builder isActive data))
    (when-let [data (lookup-entry config id :still-waiting-response)]
      (. builder stillWaitingResponse data))
    (when-let [data (lookup-entry config id :waiting-response)]
      (. builder waitingResponse data))
    (.build builder)))


(defn cfn-resource-policy-builder
  "The cfn-resource-policy-builder function buildes out new instances of 
CfnResourcePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnResourcePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-resource-policy-props-builder
  "The cfn-resource-policy-props-builder function buildes out new instances of 
CfnResourcePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnResourcePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))