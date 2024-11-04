(ns cdk.api.services.pinpoint
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.pinpoint package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.pinpoint CfnADMChannel$Builder
                                                     CfnADMChannelProps$Builder
                                                     CfnAPNSChannel$Builder
                                                     CfnAPNSChannelProps$Builder
                                                     CfnAPNSSandboxChannel$Builder
                                                     CfnAPNSSandboxChannelProps$Builder
                                                     CfnAPNSVoipChannel$Builder
                                                     CfnAPNSVoipChannelProps$Builder
                                                     CfnAPNSVoipSandboxChannel$Builder
                                                     CfnAPNSVoipSandboxChannelProps$Builder
                                                     CfnApp$Builder
                                                     CfnAppProps$Builder
                                                     CfnApplicationSettings$Builder
                                                     CfnApplicationSettings$CampaignHookProperty$Builder
                                                     CfnApplicationSettings$LimitsProperty$Builder
                                                     CfnApplicationSettings$QuietTimeProperty$Builder
                                                     CfnApplicationSettingsProps$Builder
                                                     CfnBaiduChannel$Builder
                                                     CfnBaiduChannelProps$Builder
                                                     CfnCampaign$AttributeDimensionProperty$Builder
                                                     CfnCampaign$Builder
                                                     CfnCampaign$CampaignCustomMessageProperty$Builder
                                                     CfnCampaign$CampaignEmailMessageProperty$Builder
                                                     CfnCampaign$CampaignEventFilterProperty$Builder
                                                     CfnCampaign$CampaignHookProperty$Builder
                                                     CfnCampaign$CampaignInAppMessageProperty$Builder
                                                     CfnCampaign$CampaignSmsMessageProperty$Builder
                                                     CfnCampaign$CustomDeliveryConfigurationProperty$Builder
                                                     CfnCampaign$DefaultButtonConfigurationProperty$Builder
                                                     CfnCampaign$EventDimensionsProperty$Builder
                                                     CfnCampaign$InAppMessageBodyConfigProperty$Builder
                                                     CfnCampaign$InAppMessageButtonProperty$Builder
                                                     CfnCampaign$InAppMessageContentProperty$Builder
                                                     CfnCampaign$InAppMessageHeaderConfigProperty$Builder
                                                     CfnCampaign$LimitsProperty$Builder
                                                     CfnCampaign$MessageConfigurationProperty$Builder
                                                     CfnCampaign$MessageProperty$Builder
                                                     CfnCampaign$MetricDimensionProperty$Builder
                                                     CfnCampaign$OverrideButtonConfigurationProperty$Builder
                                                     CfnCampaign$QuietTimeProperty$Builder
                                                     CfnCampaign$ScheduleProperty$Builder
                                                     CfnCampaign$SetDimensionProperty$Builder
                                                     CfnCampaign$TemplateConfigurationProperty$Builder
                                                     CfnCampaign$TemplateProperty$Builder
                                                     CfnCampaign$WriteTreatmentResourceProperty$Builder
                                                     CfnCampaignProps$Builder
                                                     CfnEmailChannel$Builder
                                                     CfnEmailChannelProps$Builder
                                                     CfnEmailTemplate$Builder
                                                     CfnEmailTemplateProps$Builder
                                                     CfnEventStream$Builder
                                                     CfnEventStreamProps$Builder
                                                     CfnGCMChannel$Builder
                                                     CfnGCMChannelProps$Builder
                                                     CfnInAppTemplate$BodyConfigProperty$Builder
                                                     CfnInAppTemplate$Builder
                                                     CfnInAppTemplate$ButtonConfigProperty$Builder
                                                     CfnInAppTemplate$DefaultButtonConfigurationProperty$Builder
                                                     CfnInAppTemplate$HeaderConfigProperty$Builder
                                                     CfnInAppTemplate$InAppMessageContentProperty$Builder
                                                     CfnInAppTemplate$OverrideButtonConfigurationProperty$Builder
                                                     CfnInAppTemplateProps$Builder
                                                     CfnPushTemplate$APNSPushNotificationTemplateProperty$Builder
                                                     CfnPushTemplate$AndroidPushNotificationTemplateProperty$Builder
                                                     CfnPushTemplate$Builder
                                                     CfnPushTemplate$DefaultPushNotificationTemplateProperty$Builder
                                                     CfnPushTemplateProps$Builder
                                                     CfnSMSChannel$Builder
                                                     CfnSMSChannelProps$Builder
                                                     CfnSegment$AttributeDimensionProperty$Builder
                                                     CfnSegment$BehaviorProperty$Builder
                                                     CfnSegment$Builder
                                                     CfnSegment$CoordinatesProperty$Builder
                                                     CfnSegment$DemographicProperty$Builder
                                                     CfnSegment$GPSPointProperty$Builder
                                                     CfnSegment$GroupsProperty$Builder
                                                     CfnSegment$LocationProperty$Builder
                                                     CfnSegment$RecencyProperty$Builder
                                                     CfnSegment$SegmentDimensionsProperty$Builder
                                                     CfnSegment$SegmentGroupsProperty$Builder
                                                     CfnSegment$SetDimensionProperty$Builder
                                                     CfnSegment$SourceSegmentsProperty$Builder
                                                     CfnSegmentProps$Builder
                                                     CfnSmsTemplate$Builder
                                                     CfnSmsTemplateProps$Builder
                                                     CfnVoiceChannel$Builder
                                                     CfnVoiceChannelProps$Builder]))


(defn cfn-adm-channel-builder
  "The cfn-adm-channel-builder function buildes out new instances of 
CfnADMChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnADMChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-adm-channel-props-builder
  "The cfn-adm-channel-props-builder function buildes out new instances of 
CfnADMChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnADMChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :client-id)]
      (. builder clientId data))
    (when-let [data (lookup-entry config id :client-secret)]
      (. builder clientSecret data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-apns-channel-builder
  "The cfn-apns-channel-builder function buildes out new instances of 
CfnAPNSChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `tokenKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key` |
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |"
  [stack id config]
  (let [builder (CfnAPNSChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :default-authentication-method)]
      (. builder defaultAuthenticationMethod data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :team-id)]
      (. builder teamId data))
    (when-let [data (lookup-entry config id :token-key)]
      (. builder tokenKey data))
    (when-let [data (lookup-entry config id :token-key-id)]
      (. builder tokenKeyId data))
    (.build builder)))


(defn cfn-apns-channel-props-builder
  "The cfn-apns-channel-props-builder function buildes out new instances of 
CfnAPNSChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `tokenKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key` |
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |"
  [stack id config]
  (let [builder (CfnAPNSChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :default-authentication-method)]
      (. builder defaultAuthenticationMethod data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :team-id)]
      (. builder teamId data))
    (when-let [data (lookup-entry config id :token-key)]
      (. builder tokenKey data))
    (when-let [data (lookup-entry config id :token-key-id)]
      (. builder tokenKeyId data))
    (.build builder)))


(defn cfn-apns-sandbox-channel-builder
  "The cfn-apns-sandbox-channel-builder function buildes out new instances of 
CfnAPNSSandboxChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `tokenKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key` |
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |"
  [stack id config]
  (let [builder (CfnAPNSSandboxChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :default-authentication-method)]
      (. builder defaultAuthenticationMethod data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :team-id)]
      (. builder teamId data))
    (when-let [data (lookup-entry config id :token-key)]
      (. builder tokenKey data))
    (when-let [data (lookup-entry config id :token-key-id)]
      (. builder tokenKeyId data))
    (.build builder)))


(defn cfn-apns-sandbox-channel-props-builder
  "The cfn-apns-sandbox-channel-props-builder function buildes out new instances of 
CfnAPNSSandboxChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `tokenKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key` |
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |"
  [stack id config]
  (let [builder (CfnAPNSSandboxChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :default-authentication-method)]
      (. builder defaultAuthenticationMethod data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :team-id)]
      (. builder teamId data))
    (when-let [data (lookup-entry config id :token-key)]
      (. builder tokenKey data))
    (when-let [data (lookup-entry config id :token-key-id)]
      (. builder tokenKeyId data))
    (.build builder)))


(defn cfn-apns-voip-channel-builder
  "The cfn-apns-voip-channel-builder function buildes out new instances of 
CfnAPNSVoipChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `tokenKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key` |
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |"
  [stack id config]
  (let [builder (CfnAPNSVoipChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :default-authentication-method)]
      (. builder defaultAuthenticationMethod data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :team-id)]
      (. builder teamId data))
    (when-let [data (lookup-entry config id :token-key)]
      (. builder tokenKey data))
    (when-let [data (lookup-entry config id :token-key-id)]
      (. builder tokenKeyId data))
    (.build builder)))


(defn cfn-apns-voip-channel-props-builder
  "The cfn-apns-voip-channel-props-builder function buildes out new instances of 
CfnAPNSVoipChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `tokenKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key` |
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |"
  [stack id config]
  (let [builder (CfnAPNSVoipChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :default-authentication-method)]
      (. builder defaultAuthenticationMethod data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :team-id)]
      (. builder teamId data))
    (when-let [data (lookup-entry config id :token-key)]
      (. builder tokenKey data))
    (when-let [data (lookup-entry config id :token-key-id)]
      (. builder tokenKeyId data))
    (.build builder)))


(defn cfn-apns-voip-sandbox-channel-builder
  "The cfn-apns-voip-sandbox-channel-builder function buildes out new instances of 
CfnAPNSVoipSandboxChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `tokenKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key` |
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |"
  [stack id config]
  (let [builder (CfnAPNSVoipSandboxChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :default-authentication-method)]
      (. builder defaultAuthenticationMethod data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :team-id)]
      (. builder teamId data))
    (when-let [data (lookup-entry config id :token-key)]
      (. builder tokenKey data))
    (when-let [data (lookup-entry config id :token-key-id)]
      (. builder tokenKeyId data))
    (.build builder)))


(defn cfn-apns-voip-sandbox-channel-props-builder
  "The cfn-apns-voip-sandbox-channel-props-builder function buildes out new instances of 
CfnAPNSVoipSandboxChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `bundleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:bundle-id` |
| `certificate` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `privateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:private-key` |
| `teamId` | java.lang.String | [[cdk.support/lookup-entry]] | `:team-id` |
| `tokenKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key` |
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |"
  [stack id config]
  (let [builder (CfnAPNSVoipSandboxChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :bundle-id)]
      (. builder bundleId data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :default-authentication-method)]
      (. builder defaultAuthenticationMethod data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :private-key)]
      (. builder privateKey data))
    (when-let [data (lookup-entry config id :team-id)]
      (. builder teamId data))
    (when-let [data (lookup-entry config id :token-key)]
      (. builder tokenKey data))
    (when-let [data (lookup-entry config id :token-key-id)]
      (. builder tokenKeyId data))
    (.build builder)))


(defn cfn-app-builder
  "The cfn-app-builder function buildes out new instances of 
CfnApp$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApp$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-app-props-builder
  "The cfn-app-props-builder function buildes out new instances of 
CfnAppProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAppProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-application-settings-builder
  "The cfn-application-settings-builder function buildes out new instances of 
CfnApplicationSettings$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `campaignHook` | software.amazon.awscdk.services.pinpoint.CfnApplicationSettings$CampaignHookProperty | [[cdk.support/lookup-entry]] | `:campaign-hook` |
| `cloudWatchMetricsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-metrics-enabled` |
| `limits` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:limits` |
| `quietTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:quiet-time` |"
  [stack id config]
  (let [builder (CfnApplicationSettings$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :campaign-hook)]
      (. builder campaignHook data))
    (when-let [data (lookup-entry config id :cloud-watch-metrics-enabled)]
      (. builder cloudWatchMetricsEnabled data))
    (when-let [data (lookup-entry config id :limits)]
      (. builder limits data))
    (when-let [data (lookup-entry config id :quiet-time)]
      (. builder quietTime data))
    (.build builder)))


(defn cfn-application-settings-campaign-hook-property-builder
  "The cfn-application-settings-campaign-hook-property-builder function buildes out new instances of 
CfnApplicationSettings$CampaignHookProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaFunctionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-name` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `webUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-url` |"
  [stack id config]
  (let [builder (CfnApplicationSettings$CampaignHookProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda-function-name)]
      (. builder lambdaFunctionName data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :web-url)]
      (. builder webUrl data))
    (.build builder)))


(defn cfn-application-settings-limits-property-builder
  "The cfn-application-settings-limits-property-builder function buildes out new instances of 
CfnApplicationSettings$LimitsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daily` | java.lang.Number | [[cdk.support/lookup-entry]] | `:daily` |
| `maximumDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-duration` |
| `messagesPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:messages-per-second` |
| `total` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total` |"
  [stack id config]
  (let [builder (CfnApplicationSettings$LimitsProperty$Builder.)]
    (when-let [data (lookup-entry config id :daily)]
      (. builder daily data))
    (when-let [data (lookup-entry config id :maximum-duration)]
      (. builder maximumDuration data))
    (when-let [data (lookup-entry config id :messages-per-second)]
      (. builder messagesPerSecond data))
    (when-let [data (lookup-entry config id :total)]
      (. builder total data))
    (.build builder)))


(defn cfn-application-settings-props-builder
  "The cfn-application-settings-props-builder function buildes out new instances of 
CfnApplicationSettingsProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `campaignHook` | software.amazon.awscdk.services.pinpoint.CfnApplicationSettings$CampaignHookProperty | [[cdk.support/lookup-entry]] | `:campaign-hook` |
| `cloudWatchMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-metrics-enabled` |
| `limits` | software.amazon.awscdk.services.pinpoint.CfnApplicationSettings$LimitsProperty | [[cdk.support/lookup-entry]] | `:limits` |
| `quietTime` | software.amazon.awscdk.services.pinpoint.CfnApplicationSettings$QuietTimeProperty | [[cdk.support/lookup-entry]] | `:quiet-time` |"
  [stack id config]
  (let [builder (CfnApplicationSettingsProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :campaign-hook)]
      (. builder campaignHook data))
    (when-let [data (lookup-entry config id :cloud-watch-metrics-enabled)]
      (. builder cloudWatchMetricsEnabled data))
    (when-let [data (lookup-entry config id :limits)]
      (. builder limits data))
    (when-let [data (lookup-entry config id :quiet-time)]
      (. builder quietTime data))
    (.build builder)))


(defn cfn-application-settings-quiet-time-property-builder
  "The cfn-application-settings-quiet-time-property-builder function buildes out new instances of 
CfnApplicationSettings$QuietTimeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |"
  [stack id config]
  (let [builder (CfnApplicationSettings$QuietTimeProperty$Builder.)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (.build builder)))


(defn cfn-baidu-channel-builder
  "The cfn-baidu-channel-builder function buildes out new instances of 
CfnBaiduChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `secretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-key` |"
  [stack id config]
  (let [builder (CfnBaiduChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-key)]
      (. builder apiKey data))
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :secret-key)]
      (. builder secretKey data))
    (.build builder)))


(defn cfn-baidu-channel-props-builder
  "The cfn-baidu-channel-props-builder function buildes out new instances of 
CfnBaiduChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `secretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-key` |"
  [stack id config]
  (let [builder (CfnBaiduChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :api-key)]
      (. builder apiKey data))
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :secret-key)]
      (. builder secretKey data))
    (.build builder)))


(defn cfn-campaign-attribute-dimension-property-builder
  "The cfn-campaign-attribute-dimension-property-builder function buildes out new instances of 
CfnCampaign$AttributeDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-type` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnCampaign$AttributeDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-type)]
      (. builder attributeType data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-campaign-builder
  "The cfn-campaign-builder function buildes out new instances of 
CfnCampaign$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalTreatments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-treatments` |
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `campaignHook` | software.amazon.awscdk.services.pinpoint.CfnCampaign$CampaignHookProperty | [[cdk.support/lookup-entry]] | `:campaign-hook` |
| `customDeliveryConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-delivery-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `holdoutPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:holdout-percent` |
| `isPaused` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-paused` |
| `limits` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:limits` |
| `messageConfiguration` | software.amazon.awscdk.services.pinpoint.CfnCampaign$MessageConfigurationProperty | [[cdk.support/lookup-entry]] | `:message-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `segmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-id` |
| `segmentVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-version` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:template-configuration` |
| `treatmentDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-description` |
| `treatmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-name` |"
  [stack id config]
  (let [builder (CfnCampaign$Builder/create stack id)]
    (when-let [data (lookup-entry config id :additional-treatments)]
      (. builder additionalTreatments data))
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :campaign-hook)]
      (. builder campaignHook data))
    (when-let [data (lookup-entry config id :custom-delivery-configuration)]
      (. builder customDeliveryConfiguration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :holdout-percent)]
      (. builder holdoutPercent data))
    (when-let [data (lookup-entry config id :is-paused)]
      (. builder isPaused data))
    (when-let [data (lookup-entry config id :limits)]
      (. builder limits data))
    (when-let [data (lookup-entry config id :message-configuration)]
      (. builder messageConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :segment-id)]
      (. builder segmentId data))
    (when-let [data (lookup-entry config id :segment-version)]
      (. builder segmentVersion data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-configuration)]
      (. builder templateConfiguration data))
    (when-let [data (lookup-entry config id :treatment-description)]
      (. builder treatmentDescription data))
    (when-let [data (lookup-entry config id :treatment-name)]
      (. builder treatmentName data))
    (.build builder)))


(defn cfn-campaign-campaign-custom-message-property-builder
  "The cfn-campaign-campaign-custom-message-property-builder function buildes out new instances of 
CfnCampaign$CampaignCustomMessageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |"
  [stack id config]
  (let [builder (CfnCampaign$CampaignCustomMessageProperty$Builder.)]
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (.build builder)))


(defn cfn-campaign-campaign-email-message-property-builder
  "The cfn-campaign-campaign-email-message-property-builder function buildes out new instances of 
CfnCampaign$CampaignEmailMessageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `fromAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:from-address` |
| `htmlBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:html-body` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |"
  [stack id config]
  (let [builder (CfnCampaign$CampaignEmailMessageProperty$Builder.)]
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :from-address)]
      (. builder fromAddress data))
    (when-let [data (lookup-entry config id :html-body)]
      (. builder htmlBody data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (.build builder)))


(defn cfn-campaign-campaign-event-filter-property-builder
  "The cfn-campaign-campaign-event-filter-property-builder function buildes out new instances of 
CfnCampaign$CampaignEventFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `filterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-type` |"
  [stack id config]
  (let [builder (CfnCampaign$CampaignEventFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :filter-type)]
      (. builder filterType data))
    (.build builder)))


(defn cfn-campaign-campaign-hook-property-builder
  "The cfn-campaign-campaign-hook-property-builder function buildes out new instances of 
CfnCampaign$CampaignHookProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaFunctionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-name` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `webUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-url` |"
  [stack id config]
  (let [builder (CfnCampaign$CampaignHookProperty$Builder.)]
    (when-let [data (lookup-entry config id :lambda-function-name)]
      (. builder lambdaFunctionName data))
    (when-let [data (lookup-entry config id :mode)]
      (. builder mode data))
    (when-let [data (lookup-entry config id :web-url)]
      (. builder webUrl data))
    (.build builder)))


(defn cfn-campaign-campaign-in-app-message-property-builder
  "The cfn-campaign-campaign-in-app-message-property-builder function buildes out new instances of 
CfnCampaign$CampaignInAppMessageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.util.List | [[cdk.support/lookup-entry]] | `:content` |
| `customConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-config` |
| `layout` | java.lang.String | [[cdk.support/lookup-entry]] | `:layout` |"
  [stack id config]
  (let [builder (CfnCampaign$CampaignInAppMessageProperty$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :custom-config)]
      (. builder customConfig data))
    (when-let [data (lookup-entry config id :layout)]
      (. builder layout data))
    (.build builder)))


(defn cfn-campaign-campaign-sms-message-property-builder
  "The cfn-campaign-campaign-sms-message-property-builder function buildes out new instances of 
CfnCampaign$CampaignSmsMessageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `entityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id` |
| `messageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-type` |
| `originationNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:origination-number` |
| `senderId` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender-id` |
| `templateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-id` |"
  [stack id config]
  (let [builder (CfnCampaign$CampaignSmsMessageProperty$Builder.)]
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :entity-id)]
      (. builder entityId data))
    (when-let [data (lookup-entry config id :message-type)]
      (. builder messageType data))
    (when-let [data (lookup-entry config id :origination-number)]
      (. builder originationNumber data))
    (when-let [data (lookup-entry config id :sender-id)]
      (. builder senderId data))
    (when-let [data (lookup-entry config id :template-id)]
      (. builder templateId data))
    (.build builder)))


(defn cfn-campaign-custom-delivery-configuration-property-builder
  "The cfn-campaign-custom-delivery-configuration-property-builder function buildes out new instances of 
CfnCampaign$CustomDeliveryConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-uri` |
| `endpointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-types` |"
  [stack id config]
  (let [builder (CfnCampaign$CustomDeliveryConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :delivery-uri)]
      (. builder deliveryUri data))
    (when-let [data (lookup-entry config id :endpoint-types)]
      (. builder endpointTypes data))
    (.build builder)))


(defn cfn-campaign-default-button-configuration-property-builder
  "The cfn-campaign-default-button-configuration-property-builder function buildes out new instances of 
CfnCampaign$DefaultButtonConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backgroundColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:background-color` |
| `borderRadius` | java.lang.Number | [[cdk.support/lookup-entry]] | `:border-radius` |
| `buttonAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:button-action` |
| `link` | java.lang.String | [[cdk.support/lookup-entry]] | `:link` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |"
  [stack id config]
  (let [builder (CfnCampaign$DefaultButtonConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :background-color)]
      (. builder backgroundColor data))
    (when-let [data (lookup-entry config id :border-radius)]
      (. builder borderRadius data))
    (when-let [data (lookup-entry config id :button-action)]
      (. builder buttonAction data))
    (when-let [data (lookup-entry config id :link)]
      (. builder link data))
    (when-let [data (lookup-entry config id :text)]
      (. builder text data))
    (when-let [data (lookup-entry config id :text-color)]
      (. builder textColor data))
    (.build builder)))


(defn cfn-campaign-event-dimensions-property-builder
  "The cfn-campaign-event-dimensions-property-builder function buildes out new instances of 
CfnCampaign$EventDimensionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `eventType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-type` |
| `metrics` | java.lang.Object | [[cdk.support/lookup-entry]] | `:metrics` |"
  [stack id config]
  (let [builder (CfnCampaign$EventDimensionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :event-type)]
      (. builder eventType data))
    (when-let [data (lookup-entry config id :metrics)]
      (. builder metrics data))
    (.build builder)))


(defn cfn-campaign-in-app-message-body-config-property-builder
  "The cfn-campaign-in-app-message-body-config-property-builder function buildes out new instances of 
CfnCampaign$InAppMessageBodyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:alignment` |
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |"
  [stack id config]
  (let [builder (CfnCampaign$InAppMessageBodyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :alignment)]
      (. builder alignment data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :text-color)]
      (. builder textColor data))
    (.build builder)))


(defn cfn-campaign-in-app-message-button-property-builder
  "The cfn-campaign-in-app-message-button-property-builder function buildes out new instances of 
CfnCampaign$InAppMessageButtonProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `android` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:android` |
| `defaultConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-config` |
| `ios` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ios` |
| `web` | software.amazon.awscdk.services.pinpoint.CfnCampaign$OverrideButtonConfigurationProperty | [[cdk.support/lookup-entry]] | `:web` |"
  [stack id config]
  (let [builder (CfnCampaign$InAppMessageButtonProperty$Builder.)]
    (when-let [data (lookup-entry config id :android)]
      (. builder android data))
    (when-let [data (lookup-entry config id :default-config)]
      (. builder defaultConfig data))
    (when-let [data (lookup-entry config id :ios)]
      (. builder ios data))
    (when-let [data (lookup-entry config id :web)]
      (. builder web data))
    (.build builder)))


(defn cfn-campaign-in-app-message-content-property-builder
  "The cfn-campaign-in-app-message-content-property-builder function buildes out new instances of 
CfnCampaign$InAppMessageContentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backgroundColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:background-color` |
| `bodyConfig` | software.amazon.awscdk.services.pinpoint.CfnCampaign$InAppMessageBodyConfigProperty | [[cdk.support/lookup-entry]] | `:body-config` |
| `headerConfig` | software.amazon.awscdk.services.pinpoint.CfnCampaign$InAppMessageHeaderConfigProperty | [[cdk.support/lookup-entry]] | `:header-config` |
| `imageUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-url` |
| `primaryBtn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary-btn` |
| `secondaryBtn` | software.amazon.awscdk.services.pinpoint.CfnCampaign$InAppMessageButtonProperty | [[cdk.support/lookup-entry]] | `:secondary-btn` |"
  [stack id config]
  (let [builder (CfnCampaign$InAppMessageContentProperty$Builder.)]
    (when-let [data (lookup-entry config id :background-color)]
      (. builder backgroundColor data))
    (when-let [data (lookup-entry config id :body-config)]
      (. builder bodyConfig data))
    (when-let [data (lookup-entry config id :header-config)]
      (. builder headerConfig data))
    (when-let [data (lookup-entry config id :image-url)]
      (. builder imageUrl data))
    (when-let [data (lookup-entry config id :primary-btn)]
      (. builder primaryBtn data))
    (when-let [data (lookup-entry config id :secondary-btn)]
      (. builder secondaryBtn data))
    (.build builder)))


(defn cfn-campaign-in-app-message-header-config-property-builder
  "The cfn-campaign-in-app-message-header-config-property-builder function buildes out new instances of 
CfnCampaign$InAppMessageHeaderConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:alignment` |
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |"
  [stack id config]
  (let [builder (CfnCampaign$InAppMessageHeaderConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :alignment)]
      (. builder alignment data))
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (when-let [data (lookup-entry config id :text-color)]
      (. builder textColor data))
    (.build builder)))


(defn cfn-campaign-limits-property-builder
  "The cfn-campaign-limits-property-builder function buildes out new instances of 
CfnCampaign$LimitsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daily` | java.lang.Number | [[cdk.support/lookup-entry]] | `:daily` |
| `maximumDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-duration` |
| `messagesPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:messages-per-second` |
| `session` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session` |
| `total` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total` |"
  [stack id config]
  (let [builder (CfnCampaign$LimitsProperty$Builder.)]
    (when-let [data (lookup-entry config id :daily)]
      (. builder daily data))
    (when-let [data (lookup-entry config id :maximum-duration)]
      (. builder maximumDuration data))
    (when-let [data (lookup-entry config id :messages-per-second)]
      (. builder messagesPerSecond data))
    (when-let [data (lookup-entry config id :session)]
      (. builder session data))
    (when-let [data (lookup-entry config id :total)]
      (. builder total data))
    (.build builder)))


(defn cfn-campaign-message-configuration-property-builder
  "The cfn-campaign-message-configuration-property-builder function buildes out new instances of 
CfnCampaign$MessageConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `admMessage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:adm-message` |
| `apnsMessage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:apns-message` |
| `baiduMessage` | software.amazon.awscdk.services.pinpoint.CfnCampaign$MessageProperty | [[cdk.support/lookup-entry]] | `:baidu-message` |
| `customMessage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-message` |
| `defaultMessage` | software.amazon.awscdk.services.pinpoint.CfnCampaign$MessageProperty | [[cdk.support/lookup-entry]] | `:default-message` |
| `emailMessage` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:email-message` |
| `gcmMessage` | software.amazon.awscdk.services.pinpoint.CfnCampaign$MessageProperty | [[cdk.support/lookup-entry]] | `:gcm-message` |
| `inAppMessage` | software.amazon.awscdk.services.pinpoint.CfnCampaign$CampaignInAppMessageProperty | [[cdk.support/lookup-entry]] | `:in-app-message` |
| `smsMessage` | software.amazon.awscdk.services.pinpoint.CfnCampaign$CampaignSmsMessageProperty | [[cdk.support/lookup-entry]] | `:sms-message` |"
  [stack id config]
  (let [builder (CfnCampaign$MessageConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :adm-message)]
      (. builder admMessage data))
    (when-let [data (lookup-entry config id :apns-message)]
      (. builder apnsMessage data))
    (when-let [data (lookup-entry config id :baidu-message)]
      (. builder baiduMessage data))
    (when-let [data (lookup-entry config id :custom-message)]
      (. builder customMessage data))
    (when-let [data (lookup-entry config id :default-message)]
      (. builder defaultMessage data))
    (when-let [data (lookup-entry config id :email-message)]
      (. builder emailMessage data))
    (when-let [data (lookup-entry config id :gcm-message)]
      (. builder gcmMessage data))
    (when-let [data (lookup-entry config id :in-app-message)]
      (. builder inAppMessage data))
    (when-let [data (lookup-entry config id :sms-message)]
      (. builder smsMessage data))
    (.build builder)))


(defn cfn-campaign-message-property-builder
  "The cfn-campaign-message-property-builder function buildes out new instances of 
CfnCampaign$MessageProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `imageIconUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-icon-url` |
| `imageSmallIconUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-small-icon-url` |
| `imageUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-url` |
| `jsonBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:json-body` |
| `mediaUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-url` |
| `rawContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:raw-content` |
| `silentPush` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:silent-push` |
| `timeToLive` | java.lang.Number | [[cdk.support/lookup-entry]] | `:time-to-live` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnCampaign$MessageProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :image-icon-url)]
      (. builder imageIconUrl data))
    (when-let [data (lookup-entry config id :image-small-icon-url)]
      (. builder imageSmallIconUrl data))
    (when-let [data (lookup-entry config id :image-url)]
      (. builder imageUrl data))
    (when-let [data (lookup-entry config id :json-body)]
      (. builder jsonBody data))
    (when-let [data (lookup-entry config id :media-url)]
      (. builder mediaUrl data))
    (when-let [data (lookup-entry config id :raw-content)]
      (. builder rawContent data))
    (when-let [data (lookup-entry config id :silent-push)]
      (. builder silentPush data))
    (when-let [data (lookup-entry config id :time-to-live)]
      (. builder timeToLive data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-campaign-metric-dimension-property-builder
  "The cfn-campaign-metric-dimension-property-builder function buildes out new instances of 
CfnCampaign$MetricDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnCampaign$MetricDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-campaign-override-button-configuration-property-builder
  "The cfn-campaign-override-button-configuration-property-builder function buildes out new instances of 
CfnCampaign$OverrideButtonConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buttonAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:button-action` |
| `link` | java.lang.String | [[cdk.support/lookup-entry]] | `:link` |"
  [stack id config]
  (let [builder (CfnCampaign$OverrideButtonConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :button-action)]
      (. builder buttonAction data))
    (when-let [data (lookup-entry config id :link)]
      (. builder link data))
    (.build builder)))


(defn cfn-campaign-props-builder
  "The cfn-campaign-props-builder function buildes out new instances of 
CfnCampaignProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `additionalTreatments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:additional-treatments` |
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `campaignHook` | software.amazon.awscdk.services.pinpoint.CfnCampaign$CampaignHookProperty | [[cdk.support/lookup-entry]] | `:campaign-hook` |
| `customDeliveryConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-delivery-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `holdoutPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:holdout-percent` |
| `isPaused` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-paused` |
| `limits` | software.amazon.awscdk.services.pinpoint.CfnCampaign$LimitsProperty | [[cdk.support/lookup-entry]] | `:limits` |
| `messageConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:message-configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `schedule` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:schedule` |
| `segmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:segment-id` |
| `segmentVersion` | java.lang.Number | [[cdk.support/lookup-entry]] | `:segment-version` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateConfiguration` | software.amazon.awscdk.services.pinpoint.CfnCampaign$TemplateConfigurationProperty | [[cdk.support/lookup-entry]] | `:template-configuration` |
| `treatmentDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-description` |
| `treatmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-name` |"
  [stack id config]
  (let [builder (CfnCampaignProps$Builder.)]
    (when-let [data (lookup-entry config id :additional-treatments)]
      (. builder additionalTreatments data))
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :campaign-hook)]
      (. builder campaignHook data))
    (when-let [data (lookup-entry config id :custom-delivery-configuration)]
      (. builder customDeliveryConfiguration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :holdout-percent)]
      (. builder holdoutPercent data))
    (when-let [data (lookup-entry config id :is-paused)]
      (. builder isPaused data))
    (when-let [data (lookup-entry config id :limits)]
      (. builder limits data))
    (when-let [data (lookup-entry config id :message-configuration)]
      (. builder messageConfiguration data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :segment-id)]
      (. builder segmentId data))
    (when-let [data (lookup-entry config id :segment-version)]
      (. builder segmentVersion data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-configuration)]
      (. builder templateConfiguration data))
    (when-let [data (lookup-entry config id :treatment-description)]
      (. builder treatmentDescription data))
    (when-let [data (lookup-entry config id :treatment-name)]
      (. builder treatmentName data))
    (.build builder)))


(defn cfn-campaign-quiet-time-property-builder
  "The cfn-campaign-quiet-time-property-builder function buildes out new instances of 
CfnCampaign$QuietTimeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |"
  [stack id config]
  (let [builder (CfnCampaign$QuietTimeProperty$Builder.)]
    (when-let [data (lookup-entry config id :end)]
      (. builder end data))
    (when-let [data (lookup-entry config id :start)]
      (. builder start data))
    (.build builder)))


(defn cfn-campaign-schedule-property-builder
  "The cfn-campaign-schedule-property-builder function buildes out new instances of 
CfnCampaign$ScheduleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `eventFilter` | software.amazon.awscdk.services.pinpoint.CfnCampaign$CampaignEventFilterProperty | [[cdk.support/lookup-entry]] | `:event-filter` |
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |
| `isLocalTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-local-time` |
| `quietTime` | software.amazon.awscdk.services.pinpoint.CfnCampaign$QuietTimeProperty | [[cdk.support/lookup-entry]] | `:quiet-time` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |"
  [stack id config]
  (let [builder (CfnCampaign$ScheduleProperty$Builder.)]
    (when-let [data (lookup-entry config id :end-time)]
      (. builder endTime data))
    (when-let [data (lookup-entry config id :event-filter)]
      (. builder eventFilter data))
    (when-let [data (lookup-entry config id :frequency)]
      (. builder frequency data))
    (when-let [data (lookup-entry config id :is-local-time)]
      (. builder isLocalTime data))
    (when-let [data (lookup-entry config id :quiet-time)]
      (. builder quietTime data))
    (when-let [data (lookup-entry config id :start-time)]
      (. builder startTime data))
    (when-let [data (lookup-entry config id :time-zone)]
      (. builder timeZone data))
    (.build builder)))


(defn cfn-campaign-set-dimension-property-builder
  "The cfn-campaign-set-dimension-property-builder function buildes out new instances of 
CfnCampaign$SetDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-type` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnCampaign$SetDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimension-type)]
      (. builder dimensionType data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-campaign-template-configuration-property-builder
  "The cfn-campaign-template-configuration-property-builder function buildes out new instances of 
CfnCampaign$TemplateConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emailTemplate` | software.amazon.awscdk.services.pinpoint.CfnCampaign$TemplateProperty | [[cdk.support/lookup-entry]] | `:email-template` |
| `pushTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:push-template` |
| `smsTemplate` | software.amazon.awscdk.services.pinpoint.CfnCampaign$TemplateProperty | [[cdk.support/lookup-entry]] | `:sms-template` |
| `voiceTemplate` | software.amazon.awscdk.services.pinpoint.CfnCampaign$TemplateProperty | [[cdk.support/lookup-entry]] | `:voice-template` |"
  [stack id config]
  (let [builder (CfnCampaign$TemplateConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :email-template)]
      (. builder emailTemplate data))
    (when-let [data (lookup-entry config id :push-template)]
      (. builder pushTemplate data))
    (when-let [data (lookup-entry config id :sms-template)]
      (. builder smsTemplate data))
    (when-let [data (lookup-entry config id :voice-template)]
      (. builder voiceTemplate data))
    (.build builder)))


(defn cfn-campaign-template-property-builder
  "The cfn-campaign-template-property-builder function buildes out new instances of 
CfnCampaign$TemplateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnCampaign$TemplateProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-campaign-write-treatment-resource-property-builder
  "The cfn-campaign-write-treatment-resource-property-builder function buildes out new instances of 
CfnCampaign$WriteTreatmentResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customDeliveryConfiguration` | software.amazon.awscdk.services.pinpoint.CfnCampaign$CustomDeliveryConfigurationProperty | [[cdk.support/lookup-entry]] | `:custom-delivery-configuration` |
| `messageConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:message-configuration` |
| `schedule` | software.amazon.awscdk.services.pinpoint.CfnCampaign$ScheduleProperty | [[cdk.support/lookup-entry]] | `:schedule` |
| `sizePercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-percent` |
| `templateConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:template-configuration` |
| `treatmentDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-description` |
| `treatmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-name` |"
  [stack id config]
  (let [builder (CfnCampaign$WriteTreatmentResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-delivery-configuration)]
      (. builder customDeliveryConfiguration data))
    (when-let [data (lookup-entry config id :message-configuration)]
      (. builder messageConfiguration data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :size-percent)]
      (. builder sizePercent data))
    (when-let [data (lookup-entry config id :template-configuration)]
      (. builder templateConfiguration data))
    (when-let [data (lookup-entry config id :treatment-description)]
      (. builder treatmentDescription data))
    (when-let [data (lookup-entry config id :treatment-name)]
      (. builder treatmentName data))
    (.build builder)))


(defn cfn-email-channel-builder
  "The cfn-email-channel-builder function buildes out new instances of 
CfnEmailChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configurationSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `fromAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:from-address` |
| `identity` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity` |
| `orchestrationSendingRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:orchestration-sending-role-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnEmailChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :configuration-set)]
      (. builder configurationSet data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :from-address)]
      (. builder fromAddress data))
    (when-let [data (lookup-entry config id :identity)]
      (. builder identity data))
    (when-let [data (lookup-entry config id :orchestration-sending-role-arn)]
      (. builder orchestrationSendingRoleArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-email-channel-props-builder
  "The cfn-email-channel-props-builder function buildes out new instances of 
CfnEmailChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configurationSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `fromAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:from-address` |
| `identity` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity` |
| `orchestrationSendingRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:orchestration-sending-role-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnEmailChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :configuration-set)]
      (. builder configurationSet data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :from-address)]
      (. builder fromAddress data))
    (when-let [data (lookup-entry config id :identity)]
      (. builder identity data))
    (when-let [data (lookup-entry config id :orchestration-sending-role-arn)]
      (. builder orchestrationSendingRoleArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-email-template-builder
  "The cfn-email-template-builder function buildes out new instances of 
CfnEmailTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultSubstitutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-substitutions` |
| `htmlPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:html-part` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `textPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-part` |"
  [stack id config]
  (let [builder (CfnEmailTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :default-substitutions)]
      (. builder defaultSubstitutions data))
    (when-let [data (lookup-entry config id :html-part)]
      (. builder htmlPart data))
    (when-let [data (lookup-entry config id :subject)]
      (. builder subject data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-description)]
      (. builder templateDescription data))
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (when-let [data (lookup-entry config id :text-part)]
      (. builder textPart data))
    (.build builder)))


(defn cfn-email-template-props-builder
  "The cfn-email-template-props-builder function buildes out new instances of 
CfnEmailTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultSubstitutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-substitutions` |
| `htmlPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:html-part` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `textPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-part` |"
  [stack id config]
  (let [builder (CfnEmailTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :default-substitutions)]
      (. builder defaultSubstitutions data))
    (when-let [data (lookup-entry config id :html-part)]
      (. builder htmlPart data))
    (when-let [data (lookup-entry config id :subject)]
      (. builder subject data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-description)]
      (. builder templateDescription data))
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (when-let [data (lookup-entry config id :text-part)]
      (. builder textPart data))
    (.build builder)))


(defn cfn-event-stream-builder
  "The cfn-event-stream-builder function buildes out new instances of 
CfnEventStream$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `destinationStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-stream-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnEventStream$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :destination-stream-arn)]
      (. builder destinationStreamArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-event-stream-props-builder
  "The cfn-event-stream-props-builder function buildes out new instances of 
CfnEventStreamProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `destinationStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-stream-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnEventStreamProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :destination-stream-arn)]
      (. builder destinationStreamArn data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-gcm-channel-builder
  "The cfn-gcm-channel-builder function buildes out new instances of 
CfnGCMChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `serviceJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-json` |"
  [stack id config]
  (let [builder (CfnGCMChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :api-key)]
      (. builder apiKey data))
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :default-authentication-method)]
      (. builder defaultAuthenticationMethod data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :service-json)]
      (. builder serviceJson data))
    (.build builder)))


(defn cfn-gcm-channel-props-builder
  "The cfn-gcm-channel-props-builder function buildes out new instances of 
CfnGCMChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `serviceJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-json` |"
  [stack id config]
  (let [builder (CfnGCMChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :api-key)]
      (. builder apiKey data))
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :default-authentication-method)]
      (. builder defaultAuthenticationMethod data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :service-json)]
      (. builder serviceJson data))
    (.build builder)))


(defn cfn-in-app-template-body-config-property-builder
  "The cfn-in-app-template-body-config-property-builder function buildes out new instances of 
CfnInAppTemplate$BodyConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:alignment` |
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |"
  [stack id config]
  (let [builder (CfnInAppTemplate$BodyConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :alignment)]
      (. builder alignment data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :text-color)]
      (. builder textColor data))
    (.build builder)))


(defn cfn-in-app-template-builder
  "The cfn-in-app-template-builder function buildes out new instances of 
CfnInAppTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.util.List | [[cdk.support/lookup-entry]] | `:content` |
| `customConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-config` |
| `layout` | java.lang.String | [[cdk.support/lookup-entry]] | `:layout` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |"
  [stack id config]
  (let [builder (CfnInAppTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :custom-config)]
      (. builder customConfig data))
    (when-let [data (lookup-entry config id :layout)]
      (. builder layout data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-description)]
      (. builder templateDescription data))
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (.build builder)))


(defn cfn-in-app-template-button-config-property-builder
  "The cfn-in-app-template-button-config-property-builder function buildes out new instances of 
CfnInAppTemplate$ButtonConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `android` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:android` |
| `defaultConfig` | software.amazon.awscdk.services.pinpoint.CfnInAppTemplate$DefaultButtonConfigurationProperty | [[cdk.support/lookup-entry]] | `:default-config` |
| `ios` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ios` |
| `web` | software.amazon.awscdk.services.pinpoint.CfnInAppTemplate$OverrideButtonConfigurationProperty | [[cdk.support/lookup-entry]] | `:web` |"
  [stack id config]
  (let [builder (CfnInAppTemplate$ButtonConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :android)]
      (. builder android data))
    (when-let [data (lookup-entry config id :default-config)]
      (. builder defaultConfig data))
    (when-let [data (lookup-entry config id :ios)]
      (. builder ios data))
    (when-let [data (lookup-entry config id :web)]
      (. builder web data))
    (.build builder)))


(defn cfn-in-app-template-default-button-configuration-property-builder
  "The cfn-in-app-template-default-button-configuration-property-builder function buildes out new instances of 
CfnInAppTemplate$DefaultButtonConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backgroundColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:background-color` |
| `borderRadius` | java.lang.Number | [[cdk.support/lookup-entry]] | `:border-radius` |
| `buttonAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:button-action` |
| `link` | java.lang.String | [[cdk.support/lookup-entry]] | `:link` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |"
  [stack id config]
  (let [builder (CfnInAppTemplate$DefaultButtonConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :background-color)]
      (. builder backgroundColor data))
    (when-let [data (lookup-entry config id :border-radius)]
      (. builder borderRadius data))
    (when-let [data (lookup-entry config id :button-action)]
      (. builder buttonAction data))
    (when-let [data (lookup-entry config id :link)]
      (. builder link data))
    (when-let [data (lookup-entry config id :text)]
      (. builder text data))
    (when-let [data (lookup-entry config id :text-color)]
      (. builder textColor data))
    (.build builder)))


(defn cfn-in-app-template-header-config-property-builder
  "The cfn-in-app-template-header-config-property-builder function buildes out new instances of 
CfnInAppTemplate$HeaderConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:alignment` |
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |"
  [stack id config]
  (let [builder (CfnInAppTemplate$HeaderConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :alignment)]
      (. builder alignment data))
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (when-let [data (lookup-entry config id :text-color)]
      (. builder textColor data))
    (.build builder)))


(defn cfn-in-app-template-in-app-message-content-property-builder
  "The cfn-in-app-template-in-app-message-content-property-builder function buildes out new instances of 
CfnInAppTemplate$InAppMessageContentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backgroundColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:background-color` |
| `bodyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:body-config` |
| `headerConfig` | software.amazon.awscdk.services.pinpoint.CfnInAppTemplate$HeaderConfigProperty | [[cdk.support/lookup-entry]] | `:header-config` |
| `imageUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-url` |
| `primaryBtn` | software.amazon.awscdk.services.pinpoint.CfnInAppTemplate$ButtonConfigProperty | [[cdk.support/lookup-entry]] | `:primary-btn` |
| `secondaryBtn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secondary-btn` |"
  [stack id config]
  (let [builder (CfnInAppTemplate$InAppMessageContentProperty$Builder.)]
    (when-let [data (lookup-entry config id :background-color)]
      (. builder backgroundColor data))
    (when-let [data (lookup-entry config id :body-config)]
      (. builder bodyConfig data))
    (when-let [data (lookup-entry config id :header-config)]
      (. builder headerConfig data))
    (when-let [data (lookup-entry config id :image-url)]
      (. builder imageUrl data))
    (when-let [data (lookup-entry config id :primary-btn)]
      (. builder primaryBtn data))
    (when-let [data (lookup-entry config id :secondary-btn)]
      (. builder secondaryBtn data))
    (.build builder)))


(defn cfn-in-app-template-override-button-configuration-property-builder
  "The cfn-in-app-template-override-button-configuration-property-builder function buildes out new instances of 
CfnInAppTemplate$OverrideButtonConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buttonAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:button-action` |
| `link` | java.lang.String | [[cdk.support/lookup-entry]] | `:link` |"
  [stack id config]
  (let [builder (CfnInAppTemplate$OverrideButtonConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :button-action)]
      (. builder buttonAction data))
    (when-let [data (lookup-entry config id :link)]
      (. builder link data))
    (.build builder)))


(defn cfn-in-app-template-props-builder
  "The cfn-in-app-template-props-builder function buildes out new instances of 
CfnInAppTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:content` |
| `customConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-config` |
| `layout` | java.lang.String | [[cdk.support/lookup-entry]] | `:layout` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |"
  [stack id config]
  (let [builder (CfnInAppTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :custom-config)]
      (. builder customConfig data))
    (when-let [data (lookup-entry config id :layout)]
      (. builder layout data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-description)]
      (. builder templateDescription data))
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (.build builder)))


(defn cfn-push-template-android-push-notification-template-property-builder
  "The cfn-push-template-android-push-notification-template-property-builder function buildes out new instances of 
CfnPushTemplate$AndroidPushNotificationTemplateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `imageIconUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-icon-url` |
| `imageUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-url` |
| `smallImageIconUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:small-image-icon-url` |
| `sound` | java.lang.String | [[cdk.support/lookup-entry]] | `:sound` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnPushTemplate$AndroidPushNotificationTemplateProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :image-icon-url)]
      (. builder imageIconUrl data))
    (when-let [data (lookup-entry config id :image-url)]
      (. builder imageUrl data))
    (when-let [data (lookup-entry config id :small-image-icon-url)]
      (. builder smallImageIconUrl data))
    (when-let [data (lookup-entry config id :sound)]
      (. builder sound data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-push-template-apns-push-notification-template-property-builder
  "The cfn-push-template-apns-push-notification-template-property-builder function buildes out new instances of 
CfnPushTemplate$APNSPushNotificationTemplateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `mediaUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-url` |
| `sound` | java.lang.String | [[cdk.support/lookup-entry]] | `:sound` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnPushTemplate$APNSPushNotificationTemplateProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :media-url)]
      (. builder mediaUrl data))
    (when-let [data (lookup-entry config id :sound)]
      (. builder sound data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-push-template-builder
  "The cfn-push-template-builder function buildes out new instances of 
CfnPushTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adm` | software.amazon.awscdk.services.pinpoint.CfnPushTemplate$AndroidPushNotificationTemplateProperty | [[cdk.support/lookup-entry]] | `:adm` |
| `apns` | software.amazon.awscdk.services.pinpoint.CfnPushTemplate$APNSPushNotificationTemplateProperty | [[cdk.support/lookup-entry]] | `:apns` |
| `baidu` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:baidu` |
| `defaultSubstitutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-substitutions` |
| `defaultValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-value` |
| `gcm` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gcm` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |"
  [stack id config]
  (let [builder (CfnPushTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :adm)]
      (. builder adm data))
    (when-let [data (lookup-entry config id :apns)]
      (. builder apns data))
    (when-let [data (lookup-entry config id :baidu)]
      (. builder baidu data))
    (when-let [data (lookup-entry config id :default-substitutions)]
      (. builder defaultSubstitutions data))
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :gcm)]
      (. builder gcm data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-description)]
      (. builder templateDescription data))
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (.build builder)))


(defn cfn-push-template-default-push-notification-template-property-builder
  "The cfn-push-template-default-push-notification-template-property-builder function buildes out new instances of 
CfnPushTemplate$DefaultPushNotificationTemplateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `sound` | java.lang.String | [[cdk.support/lookup-entry]] | `:sound` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |"
  [stack id config]
  (let [builder (CfnPushTemplate$DefaultPushNotificationTemplateProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :sound)]
      (. builder sound data))
    (when-let [data (lookup-entry config id :title)]
      (. builder title data))
    (when-let [data (lookup-entry config id :url)]
      (. builder url data))
    (.build builder)))


(defn cfn-push-template-props-builder
  "The cfn-push-template-props-builder function buildes out new instances of 
CfnPushTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `adm` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:adm` |
| `apns` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:apns` |
| `baidu` | software.amazon.awscdk.services.pinpoint.CfnPushTemplate$AndroidPushNotificationTemplateProperty | [[cdk.support/lookup-entry]] | `:baidu` |
| `defaultSubstitutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-substitutions` |
| `defaultValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-value` |
| `gcm` | software.amazon.awscdk.services.pinpoint.CfnPushTemplate$AndroidPushNotificationTemplateProperty | [[cdk.support/lookup-entry]] | `:gcm` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |"
  [stack id config]
  (let [builder (CfnPushTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :adm)]
      (. builder adm data))
    (when-let [data (lookup-entry config id :apns)]
      (. builder apns data))
    (when-let [data (lookup-entry config id :baidu)]
      (. builder baidu data))
    (when-let [data (lookup-entry config id :default-substitutions)]
      (. builder defaultSubstitutions data))
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (when-let [data (lookup-entry config id :gcm)]
      (. builder gcm data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-description)]
      (. builder templateDescription data))
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (.build builder)))


(defn cfn-segment-attribute-dimension-property-builder
  "The cfn-segment-attribute-dimension-property-builder function buildes out new instances of 
CfnSegment$AttributeDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-type` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnSegment$AttributeDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute-type)]
      (. builder attributeType data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-segment-behavior-property-builder
  "The cfn-segment-behavior-property-builder function buildes out new instances of 
CfnSegment$BehaviorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recency` | software.amazon.awscdk.services.pinpoint.CfnSegment$RecencyProperty | [[cdk.support/lookup-entry]] | `:recency` |"
  [stack id config]
  (let [builder (CfnSegment$BehaviorProperty$Builder.)]
    (when-let [data (lookup-entry config id :recency)]
      (. builder recency data))
    (.build builder)))


(defn cfn-segment-builder
  "The cfn-segment-builder function buildes out new instances of 
CfnSegment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `dimensions` | software.amazon.awscdk.services.pinpoint.CfnSegment$SegmentDimensionsProperty | [[cdk.support/lookup-entry]] | `:dimensions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `segmentGroups` | software.amazon.awscdk.services.pinpoint.CfnSegment$SegmentGroupsProperty | [[cdk.support/lookup-entry]] | `:segment-groups` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSegment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :segment-groups)]
      (. builder segmentGroups data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-segment-coordinates-property-builder
  "The cfn-segment-coordinates-property-builder function buildes out new instances of 
CfnSegment$CoordinatesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `latitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:longitude` |"
  [stack id config]
  (let [builder (CfnSegment$CoordinatesProperty$Builder.)]
    (when-let [data (lookup-entry config id :latitude)]
      (. builder latitude data))
    (when-let [data (lookup-entry config id :longitude)]
      (. builder longitude data))
    (.build builder)))


(defn cfn-segment-demographic-property-builder
  "The cfn-segment-demographic-property-builder function buildes out new instances of 
CfnSegment$DemographicProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:app-version` |
| `channel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:channel` |
| `deviceType` | software.amazon.awscdk.services.pinpoint.CfnSegment$SetDimensionProperty | [[cdk.support/lookup-entry]] | `:device-type` |
| `make` | software.amazon.awscdk.services.pinpoint.CfnSegment$SetDimensionProperty | [[cdk.support/lookup-entry]] | `:make` |
| `model` | software.amazon.awscdk.services.pinpoint.CfnSegment$SetDimensionProperty | [[cdk.support/lookup-entry]] | `:model` |
| `platform` | software.amazon.awscdk.services.pinpoint.CfnSegment$SetDimensionProperty | [[cdk.support/lookup-entry]] | `:platform` |"
  [stack id config]
  (let [builder (CfnSegment$DemographicProperty$Builder.)]
    (when-let [data (lookup-entry config id :app-version)]
      (. builder appVersion data))
    (when-let [data (lookup-entry config id :channel)]
      (. builder channel data))
    (when-let [data (lookup-entry config id :device-type)]
      (. builder deviceType data))
    (when-let [data (lookup-entry config id :make)]
      (. builder make data))
    (when-let [data (lookup-entry config id :model)]
      (. builder model data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (.build builder)))


(defn cfn-segment-gps-point-property-builder
  "The cfn-segment-gps-point-property-builder function buildes out new instances of 
CfnSegment$GPSPointProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coordinates` | software.amazon.awscdk.services.pinpoint.CfnSegment$CoordinatesProperty | [[cdk.support/lookup-entry]] | `:coordinates` |
| `rangeInKilometers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:range-in-kilometers` |"
  [stack id config]
  (let [builder (CfnSegment$GPSPointProperty$Builder.)]
    (when-let [data (lookup-entry config id :coordinates)]
      (. builder coordinates data))
    (when-let [data (lookup-entry config id :range-in-kilometers)]
      (. builder rangeInKilometers data))
    (.build builder)))


(defn cfn-segment-groups-property-builder
  "The cfn-segment-groups-property-builder function buildes out new instances of 
CfnSegment$GroupsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `sourceSegments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-segments` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSegment$GroupsProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :source-segments)]
      (. builder sourceSegments data))
    (when-let [data (lookup-entry config id :source-type)]
      (. builder sourceType data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-segment-location-property-builder
  "The cfn-segment-location-property-builder function buildes out new instances of 
CfnSegment$LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `country` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:country` |
| `gpsPoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gps-point` |"
  [stack id config]
  (let [builder (CfnSegment$LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :country)]
      (. builder country data))
    (when-let [data (lookup-entry config id :gps-point)]
      (. builder gpsPoint data))
    (.build builder)))


(defn cfn-segment-props-builder
  "The cfn-segment-props-builder function buildes out new instances of 
CfnSegmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `segmentGroups` | software.amazon.awscdk.services.pinpoint.CfnSegment$SegmentGroupsProperty | [[cdk.support/lookup-entry]] | `:segment-groups` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSegmentProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :segment-groups)]
      (. builder segmentGroups data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-segment-recency-property-builder
  "The cfn-segment-recency-property-builder function buildes out new instances of 
CfnSegment$RecencyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `duration` | java.lang.String | [[cdk.support/lookup-entry]] | `:duration` |
| `recencyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:recency-type` |"
  [stack id config]
  (let [builder (CfnSegment$RecencyProperty$Builder.)]
    (when-let [data (lookup-entry config id :duration)]
      (. builder duration data))
    (when-let [data (lookup-entry config id :recency-type)]
      (. builder recencyType data))
    (.build builder)))


(defn cfn-segment-segment-dimensions-property-builder
  "The cfn-segment-segment-dimensions-property-builder function buildes out new instances of 
CfnSegment$SegmentDimensionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `behavior` | software.amazon.awscdk.services.pinpoint.CfnSegment$BehaviorProperty | [[cdk.support/lookup-entry]] | `:behavior` |
| `demographic` | software.amazon.awscdk.services.pinpoint.CfnSegment$DemographicProperty | [[cdk.support/lookup-entry]] | `:demographic` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `metrics` | java.lang.Object | [[cdk.support/lookup-entry]] | `:metrics` |
| `userAttributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:user-attributes` |"
  [stack id config]
  (let [builder (CfnSegment$SegmentDimensionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :behavior)]
      (. builder behavior data))
    (when-let [data (lookup-entry config id :demographic)]
      (. builder demographic data))
    (when-let [data (lookup-entry config id :location)]
      (. builder location data))
    (when-let [data (lookup-entry config id :metrics)]
      (. builder metrics data))
    (when-let [data (lookup-entry config id :user-attributes)]
      (. builder userAttributes data))
    (.build builder)))


(defn cfn-segment-segment-groups-property-builder
  "The cfn-segment-segment-groups-property-builder function buildes out new instances of 
CfnSegment$SegmentGroupsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `include` | java.lang.String | [[cdk.support/lookup-entry]] | `:include` |"
  [stack id config]
  (let [builder (CfnSegment$SegmentGroupsProperty$Builder.)]
    (when-let [data (lookup-entry config id :groups)]
      (. builder groups data))
    (when-let [data (lookup-entry config id :include)]
      (. builder include data))
    (.build builder)))


(defn cfn-segment-set-dimension-property-builder
  "The cfn-segment-set-dimension-property-builder function buildes out new instances of 
CfnSegment$SetDimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-type` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |"
  [stack id config]
  (let [builder (CfnSegment$SetDimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimension-type)]
      (. builder dimensionType data))
    (when-let [data (lookup-entry config id :values)]
      (. builder values data))
    (.build builder)))


(defn cfn-segment-source-segments-property-builder
  "The cfn-segment-source-segments-property-builder function buildes out new instances of 
CfnSegment$SourceSegmentsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnSegment$SourceSegmentsProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-sms-channel-builder
  "The cfn-sms-channel-builder function buildes out new instances of 
CfnSMSChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `senderId` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender-id` |
| `shortCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-code` |"
  [stack id config]
  (let [builder (CfnSMSChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :sender-id)]
      (. builder senderId data))
    (when-let [data (lookup-entry config id :short-code)]
      (. builder shortCode data))
    (.build builder)))


(defn cfn-sms-channel-props-builder
  "The cfn-sms-channel-props-builder function buildes out new instances of 
CfnSMSChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `senderId` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender-id` |
| `shortCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-code` |"
  [stack id config]
  (let [builder (CfnSMSChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :sender-id)]
      (. builder senderId data))
    (when-let [data (lookup-entry config id :short-code)]
      (. builder shortCode data))
    (.build builder)))


(defn cfn-sms-template-builder
  "The cfn-sms-template-builder function buildes out new instances of 
CfnSmsTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `defaultSubstitutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-substitutions` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |"
  [stack id config]
  (let [builder (CfnSmsTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :default-substitutions)]
      (. builder defaultSubstitutions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-description)]
      (. builder templateDescription data))
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (.build builder)))


(defn cfn-sms-template-props-builder
  "The cfn-sms-template-props-builder function buildes out new instances of 
CfnSmsTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `defaultSubstitutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-substitutions` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |"
  [stack id config]
  (let [builder (CfnSmsTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :body)]
      (. builder body data))
    (when-let [data (lookup-entry config id :default-substitutions)]
      (. builder defaultSubstitutions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :template-description)]
      (. builder templateDescription data))
    (when-let [data (lookup-entry config id :template-name)]
      (. builder templateName data))
    (.build builder)))


(defn cfn-voice-channel-builder
  "The cfn-voice-channel-builder function buildes out new instances of 
CfnVoiceChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnVoiceChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-voice-channel-props-builder
  "The cfn-voice-channel-props-builder function buildes out new instances of 
CfnVoiceChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnVoiceChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :application-id)]
      (. builder applicationId data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))