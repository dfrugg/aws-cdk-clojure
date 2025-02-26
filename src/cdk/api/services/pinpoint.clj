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


(defn build-cfn-adm-channel-builder
  "The build-cfn-adm-channel-builder function updates a CfnADMChannel$Builder instance using the provided configuration.
  The function takes the CfnADMChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnADMChannel$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-let [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-adm-channel-builder
  "Creates a  `CfnADMChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-adm-channel-builder (CfnADMChannel$Builder/create scope (name id)) id config))


(defn build-cfn-adm-channel-props-builder
  "The build-cfn-adm-channel-props-builder function updates a CfnADMChannelProps$Builder instance using the provided configuration.
  The function takes the CfnADMChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `clientId` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-id` |
| `clientSecret` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-secret` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnADMChannelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :client-id)]
    (. builder clientId data))
  (when-let [data (lookup-entry config id :client-secret)]
    (. builder clientSecret data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-adm-channel-props-builder
  "Creates a  `CfnADMChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-adm-channel-props-builder (new CfnADMChannelProps$Builder) id config))


(defn build-cfn-apns-channel-builder
  "The build-cfn-apns-channel-builder function updates a CfnAPNSChannel$Builder instance using the provided configuration.
  The function takes the CfnAPNSChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |
"
  [^CfnAPNSChannel$Builder builder id config]
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
  (.build builder))


(defn cfn-apns-channel-builder
  "Creates a  `CfnAPNSChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-apns-channel-builder (CfnAPNSChannel$Builder/create scope (name id)) id config))


(defn build-cfn-apns-channel-props-builder
  "The build-cfn-apns-channel-props-builder function updates a CfnAPNSChannelProps$Builder instance using the provided configuration.
  The function takes the CfnAPNSChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |
"
  [^CfnAPNSChannelProps$Builder builder id config]
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
  (.build builder))


(defn cfn-apns-channel-props-builder
  "Creates a  `CfnAPNSChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-apns-channel-props-builder (new CfnAPNSChannelProps$Builder) id config))


(defn build-cfn-apns-sandbox-channel-builder
  "The build-cfn-apns-sandbox-channel-builder function updates a CfnAPNSSandboxChannel$Builder instance using the provided configuration.
  The function takes the CfnAPNSSandboxChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |
"
  [^CfnAPNSSandboxChannel$Builder builder id config]
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
  (.build builder))


(defn cfn-apns-sandbox-channel-builder
  "Creates a  `CfnAPNSSandboxChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-apns-sandbox-channel-builder (CfnAPNSSandboxChannel$Builder/create scope (name id)) id config))


(defn build-cfn-apns-sandbox-channel-props-builder
  "The build-cfn-apns-sandbox-channel-props-builder function updates a CfnAPNSSandboxChannelProps$Builder instance using the provided configuration.
  The function takes the CfnAPNSSandboxChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |
"
  [^CfnAPNSSandboxChannelProps$Builder builder id config]
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
  (.build builder))


(defn cfn-apns-sandbox-channel-props-builder
  "Creates a  `CfnAPNSSandboxChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-apns-sandbox-channel-props-builder (new CfnAPNSSandboxChannelProps$Builder) id config))


(defn build-cfn-apns-voip-channel-builder
  "The build-cfn-apns-voip-channel-builder function updates a CfnAPNSVoipChannel$Builder instance using the provided configuration.
  The function takes the CfnAPNSVoipChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |
"
  [^CfnAPNSVoipChannel$Builder builder id config]
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
  (.build builder))


(defn cfn-apns-voip-channel-builder
  "Creates a  `CfnAPNSVoipChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-apns-voip-channel-builder (CfnAPNSVoipChannel$Builder/create scope (name id)) id config))


(defn build-cfn-apns-voip-channel-props-builder
  "The build-cfn-apns-voip-channel-props-builder function updates a CfnAPNSVoipChannelProps$Builder instance using the provided configuration.
  The function takes the CfnAPNSVoipChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |
"
  [^CfnAPNSVoipChannelProps$Builder builder id config]
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
  (.build builder))


(defn cfn-apns-voip-channel-props-builder
  "Creates a  `CfnAPNSVoipChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-apns-voip-channel-props-builder (new CfnAPNSVoipChannelProps$Builder) id config))


(defn build-cfn-apns-voip-sandbox-channel-builder
  "The build-cfn-apns-voip-sandbox-channel-builder function updates a CfnAPNSVoipSandboxChannel$Builder instance using the provided configuration.
  The function takes the CfnAPNSVoipSandboxChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |
"
  [^CfnAPNSVoipSandboxChannel$Builder builder id config]
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
  (.build builder))


(defn cfn-apns-voip-sandbox-channel-builder
  "Creates a  `CfnAPNSVoipSandboxChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-apns-voip-sandbox-channel-builder (CfnAPNSVoipSandboxChannel$Builder/create scope (name id)) id config))


(defn build-cfn-apns-voip-sandbox-channel-props-builder
  "The build-cfn-apns-voip-sandbox-channel-props-builder function updates a CfnAPNSVoipSandboxChannelProps$Builder instance using the provided configuration.
  The function takes the CfnAPNSVoipSandboxChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tokenKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-key-id` |
"
  [^CfnAPNSVoipSandboxChannelProps$Builder builder id config]
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
  (.build builder))


(defn cfn-apns-voip-sandbox-channel-props-builder
  "Creates a  `CfnAPNSVoipSandboxChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-apns-voip-sandbox-channel-props-builder (new CfnAPNSVoipSandboxChannelProps$Builder) id config))


(defn build-cfn-app-builder
  "The build-cfn-app-builder function updates a CfnApp$Builder instance using the provided configuration.
  The function takes the CfnApp$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApp$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-app-builder
  "Creates a  `CfnApp$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-app-builder (CfnApp$Builder/create scope (name id)) id config))


(defn build-cfn-app-props-builder
  "The build-cfn-app-props-builder function updates a CfnAppProps$Builder instance using the provided configuration.
  The function takes the CfnAppProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAppProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-app-props-builder
  "Creates a  `CfnAppProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-app-props-builder (new CfnAppProps$Builder) id config))


(defn build-cfn-application-settings-builder
  "The build-cfn-application-settings-builder function updates a CfnApplicationSettings$Builder instance using the provided configuration.
  The function takes the CfnApplicationSettings$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `campaignHook` | software.amazon.awscdk.services.pinpoint.CfnApplicationSettings$CampaignHookProperty | [[cdk.support/lookup-entry]] | `:campaign-hook` |
| `cloudWatchMetricsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-metrics-enabled` |
| `limits` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:limits` |
| `quietTime` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:quiet-time` |
"
  [^CfnApplicationSettings$Builder builder id config]
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
  (.build builder))


(defn cfn-application-settings-builder
  "Creates a  `CfnApplicationSettings$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-application-settings-builder (CfnApplicationSettings$Builder/create scope (name id)) id config))


(defn build-cfn-application-settings-campaign-hook-property-builder
  "The build-cfn-application-settings-campaign-hook-property-builder function updates a CfnApplicationSettings$CampaignHookProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationSettings$CampaignHookProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaFunctionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-name` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `webUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-url` |
"
  [^CfnApplicationSettings$CampaignHookProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :lambda-function-name)]
    (. builder lambdaFunctionName data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-let [data (lookup-entry config id :web-url)]
    (. builder webUrl data))
  (.build builder))


(defn cfn-application-settings-campaign-hook-property-builder
  "Creates a  `CfnApplicationSettings$CampaignHookProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-settings-campaign-hook-property-builder (new CfnApplicationSettings$CampaignHookProperty$Builder) id config))


(defn build-cfn-application-settings-limits-property-builder
  "The build-cfn-application-settings-limits-property-builder function updates a CfnApplicationSettings$LimitsProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationSettings$LimitsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daily` | java.lang.Number | [[cdk.support/lookup-entry]] | `:daily` |
| `maximumDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-duration` |
| `messagesPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:messages-per-second` |
| `total` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total` |
"
  [^CfnApplicationSettings$LimitsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :daily)]
    (. builder daily data))
  (when-let [data (lookup-entry config id :maximum-duration)]
    (. builder maximumDuration data))
  (when-let [data (lookup-entry config id :messages-per-second)]
    (. builder messagesPerSecond data))
  (when-let [data (lookup-entry config id :total)]
    (. builder total data))
  (.build builder))


(defn cfn-application-settings-limits-property-builder
  "Creates a  `CfnApplicationSettings$LimitsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-settings-limits-property-builder (new CfnApplicationSettings$LimitsProperty$Builder) id config))


(defn build-cfn-application-settings-props-builder
  "The build-cfn-application-settings-props-builder function updates a CfnApplicationSettingsProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationSettingsProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `campaignHook` | software.amazon.awscdk.services.pinpoint.CfnApplicationSettings$CampaignHookProperty | [[cdk.support/lookup-entry]] | `:campaign-hook` |
| `cloudWatchMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-metrics-enabled` |
| `limits` | software.amazon.awscdk.services.pinpoint.CfnApplicationSettings$LimitsProperty | [[cdk.support/lookup-entry]] | `:limits` |
| `quietTime` | software.amazon.awscdk.services.pinpoint.CfnApplicationSettings$QuietTimeProperty | [[cdk.support/lookup-entry]] | `:quiet-time` |
"
  [^CfnApplicationSettingsProps$Builder builder id config]
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
  (.build builder))


(defn cfn-application-settings-props-builder
  "Creates a  `CfnApplicationSettingsProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-settings-props-builder (new CfnApplicationSettingsProps$Builder) id config))


(defn build-cfn-application-settings-quiet-time-property-builder
  "The build-cfn-application-settings-quiet-time-property-builder function updates a CfnApplicationSettings$QuietTimeProperty$Builder instance using the provided configuration.
  The function takes the CfnApplicationSettings$QuietTimeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
"
  [^CfnApplicationSettings$QuietTimeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :end)]
    (. builder end data))
  (when-let [data (lookup-entry config id :start)]
    (. builder start data))
  (.build builder))


(defn cfn-application-settings-quiet-time-property-builder
  "Creates a  `CfnApplicationSettings$QuietTimeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-application-settings-quiet-time-property-builder (new CfnApplicationSettings$QuietTimeProperty$Builder) id config))


(defn build-cfn-baidu-channel-builder
  "The build-cfn-baidu-channel-builder function updates a CfnBaiduChannel$Builder instance using the provided configuration.
  The function takes the CfnBaiduChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `secretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-key` |
"
  [^CfnBaiduChannel$Builder builder id config]
  (when-let [data (lookup-entry config id :api-key)]
    (. builder apiKey data))
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :secret-key)]
    (. builder secretKey data))
  (.build builder))


(defn cfn-baidu-channel-builder
  "Creates a  `CfnBaiduChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-baidu-channel-builder (CfnBaiduChannel$Builder/create scope (name id)) id config))


(defn build-cfn-baidu-channel-props-builder
  "The build-cfn-baidu-channel-props-builder function updates a CfnBaiduChannelProps$Builder instance using the provided configuration.
  The function takes the CfnBaiduChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `secretKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-key` |
"
  [^CfnBaiduChannelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :api-key)]
    (. builder apiKey data))
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :secret-key)]
    (. builder secretKey data))
  (.build builder))


(defn cfn-baidu-channel-props-builder
  "Creates a  `CfnBaiduChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-baidu-channel-props-builder (new CfnBaiduChannelProps$Builder) id config))


(defn build-cfn-campaign-attribute-dimension-property-builder
  "The build-cfn-campaign-attribute-dimension-property-builder function updates a CfnCampaign$AttributeDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$AttributeDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-type` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnCampaign$AttributeDimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attribute-type)]
    (. builder attributeType data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-campaign-attribute-dimension-property-builder
  "Creates a  `CfnCampaign$AttributeDimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-attribute-dimension-property-builder (new CfnCampaign$AttributeDimensionProperty$Builder) id config))


(defn build-cfn-campaign-builder
  "The build-cfn-campaign-builder function updates a CfnCampaign$Builder instance using the provided configuration.
  The function takes the CfnCampaign$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `treatmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-name` |
"
  [^CfnCampaign$Builder builder id config]
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
  (.build builder))


(defn cfn-campaign-builder
  "Creates a  `CfnCampaign$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-campaign-builder (CfnCampaign$Builder/create scope (name id)) id config))


(defn build-cfn-campaign-campaign-custom-message-property-builder
  "The build-cfn-campaign-campaign-custom-message-property-builder function updates a CfnCampaign$CampaignCustomMessageProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$CampaignCustomMessageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
"
  [^CfnCampaign$CampaignCustomMessageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data)]
    (. builder data data))
  (.build builder))


(defn cfn-campaign-campaign-custom-message-property-builder
  "Creates a  `CfnCampaign$CampaignCustomMessageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-campaign-custom-message-property-builder (new CfnCampaign$CampaignCustomMessageProperty$Builder) id config))


(defn build-cfn-campaign-campaign-email-message-property-builder
  "The build-cfn-campaign-campaign-email-message-property-builder function updates a CfnCampaign$CampaignEmailMessageProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$CampaignEmailMessageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `fromAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:from-address` |
| `htmlBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:html-body` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
"
  [^CfnCampaign$CampaignEmailMessageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :body)]
    (. builder body data))
  (when-let [data (lookup-entry config id :from-address)]
    (. builder fromAddress data))
  (when-let [data (lookup-entry config id :html-body)]
    (. builder htmlBody data))
  (when-let [data (lookup-entry config id :title)]
    (. builder title data))
  (.build builder))


(defn cfn-campaign-campaign-email-message-property-builder
  "Creates a  `CfnCampaign$CampaignEmailMessageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-campaign-email-message-property-builder (new CfnCampaign$CampaignEmailMessageProperty$Builder) id config))


(defn build-cfn-campaign-campaign-event-filter-property-builder
  "The build-cfn-campaign-campaign-event-filter-property-builder function updates a CfnCampaign$CampaignEventFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$CampaignEventFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `filterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:filter-type` |
"
  [^CfnCampaign$CampaignEventFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-let [data (lookup-entry config id :filter-type)]
    (. builder filterType data))
  (.build builder))


(defn cfn-campaign-campaign-event-filter-property-builder
  "Creates a  `CfnCampaign$CampaignEventFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-campaign-event-filter-property-builder (new CfnCampaign$CampaignEventFilterProperty$Builder) id config))


(defn build-cfn-campaign-campaign-hook-property-builder
  "The build-cfn-campaign-campaign-hook-property-builder function updates a CfnCampaign$CampaignHookProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$CampaignHookProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `lambdaFunctionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:lambda-function-name` |
| `mode` | java.lang.String | [[cdk.support/lookup-entry]] | `:mode` |
| `webUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-url` |
"
  [^CfnCampaign$CampaignHookProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :lambda-function-name)]
    (. builder lambdaFunctionName data))
  (when-let [data (lookup-entry config id :mode)]
    (. builder mode data))
  (when-let [data (lookup-entry config id :web-url)]
    (. builder webUrl data))
  (.build builder))


(defn cfn-campaign-campaign-hook-property-builder
  "Creates a  `CfnCampaign$CampaignHookProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-campaign-hook-property-builder (new CfnCampaign$CampaignHookProperty$Builder) id config))


(defn build-cfn-campaign-campaign-in-app-message-property-builder
  "The build-cfn-campaign-campaign-in-app-message-property-builder function updates a CfnCampaign$CampaignInAppMessageProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$CampaignInAppMessageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.util.List | [[cdk.support/lookup-entry]] | `:content` |
| `customConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-config` |
| `layout` | java.lang.String | [[cdk.support/lookup-entry]] | `:layout` |
"
  [^CfnCampaign$CampaignInAppMessageProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (when-let [data (lookup-entry config id :custom-config)]
    (. builder customConfig data))
  (when-let [data (lookup-entry config id :layout)]
    (. builder layout data))
  (.build builder))


(defn cfn-campaign-campaign-in-app-message-property-builder
  "Creates a  `CfnCampaign$CampaignInAppMessageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-campaign-in-app-message-property-builder (new CfnCampaign$CampaignInAppMessageProperty$Builder) id config))


(defn build-cfn-campaign-campaign-sms-message-property-builder
  "The build-cfn-campaign-campaign-sms-message-property-builder function updates a CfnCampaign$CampaignSmsMessageProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$CampaignSmsMessageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `entityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id` |
| `messageType` | java.lang.String | [[cdk.support/lookup-entry]] | `:message-type` |
| `originationNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:origination-number` |
| `senderId` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender-id` |
| `templateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-id` |
"
  [^CfnCampaign$CampaignSmsMessageProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-campaign-campaign-sms-message-property-builder
  "Creates a  `CfnCampaign$CampaignSmsMessageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-campaign-sms-message-property-builder (new CfnCampaign$CampaignSmsMessageProperty$Builder) id config))


(defn build-cfn-campaign-custom-delivery-configuration-property-builder
  "The build-cfn-campaign-custom-delivery-configuration-property-builder function updates a CfnCampaign$CustomDeliveryConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$CustomDeliveryConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deliveryUri` | java.lang.String | [[cdk.support/lookup-entry]] | `:delivery-uri` |
| `endpointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:endpoint-types` |
"
  [^CfnCampaign$CustomDeliveryConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :delivery-uri)]
    (. builder deliveryUri data))
  (when-let [data (lookup-entry config id :endpoint-types)]
    (. builder endpointTypes data))
  (.build builder))


(defn cfn-campaign-custom-delivery-configuration-property-builder
  "Creates a  `CfnCampaign$CustomDeliveryConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-custom-delivery-configuration-property-builder (new CfnCampaign$CustomDeliveryConfigurationProperty$Builder) id config))


(defn build-cfn-campaign-default-button-configuration-property-builder
  "The build-cfn-campaign-default-button-configuration-property-builder function updates a CfnCampaign$DefaultButtonConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$DefaultButtonConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backgroundColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:background-color` |
| `borderRadius` | java.lang.Number | [[cdk.support/lookup-entry]] | `:border-radius` |
| `buttonAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:button-action` |
| `link` | java.lang.String | [[cdk.support/lookup-entry]] | `:link` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |
"
  [^CfnCampaign$DefaultButtonConfigurationProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-campaign-default-button-configuration-property-builder
  "Creates a  `CfnCampaign$DefaultButtonConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-default-button-configuration-property-builder (new CfnCampaign$DefaultButtonConfigurationProperty$Builder) id config))


(defn build-cfn-campaign-event-dimensions-property-builder
  "The build-cfn-campaign-event-dimensions-property-builder function updates a CfnCampaign$EventDimensionsProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$EventDimensionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `eventType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-type` |
| `metrics` | java.lang.Object | [[cdk.support/lookup-entry]] | `:metrics` |
"
  [^CfnCampaign$EventDimensionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attributes)]
    (. builder attributes data))
  (when-let [data (lookup-entry config id :event-type)]
    (. builder eventType data))
  (when-let [data (lookup-entry config id :metrics)]
    (. builder metrics data))
  (.build builder))


(defn cfn-campaign-event-dimensions-property-builder
  "Creates a  `CfnCampaign$EventDimensionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-event-dimensions-property-builder (new CfnCampaign$EventDimensionsProperty$Builder) id config))


(defn build-cfn-campaign-in-app-message-body-config-property-builder
  "The build-cfn-campaign-in-app-message-body-config-property-builder function updates a CfnCampaign$InAppMessageBodyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$InAppMessageBodyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:alignment` |
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |
"
  [^CfnCampaign$InAppMessageBodyConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alignment)]
    (. builder alignment data))
  (when-let [data (lookup-entry config id :body)]
    (. builder body data))
  (when-let [data (lookup-entry config id :text-color)]
    (. builder textColor data))
  (.build builder))


(defn cfn-campaign-in-app-message-body-config-property-builder
  "Creates a  `CfnCampaign$InAppMessageBodyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-in-app-message-body-config-property-builder (new CfnCampaign$InAppMessageBodyConfigProperty$Builder) id config))


(defn build-cfn-campaign-in-app-message-button-property-builder
  "The build-cfn-campaign-in-app-message-button-property-builder function updates a CfnCampaign$InAppMessageButtonProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$InAppMessageButtonProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `android` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:android` |
| `defaultConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-config` |
| `ios` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ios` |
| `web` | software.amazon.awscdk.services.pinpoint.CfnCampaign$OverrideButtonConfigurationProperty | [[cdk.support/lookup-entry]] | `:web` |
"
  [^CfnCampaign$InAppMessageButtonProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :android)]
    (. builder android data))
  (when-let [data (lookup-entry config id :default-config)]
    (. builder defaultConfig data))
  (when-let [data (lookup-entry config id :ios)]
    (. builder ios data))
  (when-let [data (lookup-entry config id :web)]
    (. builder web data))
  (.build builder))


(defn cfn-campaign-in-app-message-button-property-builder
  "Creates a  `CfnCampaign$InAppMessageButtonProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-in-app-message-button-property-builder (new CfnCampaign$InAppMessageButtonProperty$Builder) id config))


(defn build-cfn-campaign-in-app-message-content-property-builder
  "The build-cfn-campaign-in-app-message-content-property-builder function updates a CfnCampaign$InAppMessageContentProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$InAppMessageContentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backgroundColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:background-color` |
| `bodyConfig` | software.amazon.awscdk.services.pinpoint.CfnCampaign$InAppMessageBodyConfigProperty | [[cdk.support/lookup-entry]] | `:body-config` |
| `headerConfig` | software.amazon.awscdk.services.pinpoint.CfnCampaign$InAppMessageHeaderConfigProperty | [[cdk.support/lookup-entry]] | `:header-config` |
| `imageUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-url` |
| `primaryBtn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:primary-btn` |
| `secondaryBtn` | software.amazon.awscdk.services.pinpoint.CfnCampaign$InAppMessageButtonProperty | [[cdk.support/lookup-entry]] | `:secondary-btn` |
"
  [^CfnCampaign$InAppMessageContentProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-campaign-in-app-message-content-property-builder
  "Creates a  `CfnCampaign$InAppMessageContentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-in-app-message-content-property-builder (new CfnCampaign$InAppMessageContentProperty$Builder) id config))


(defn build-cfn-campaign-in-app-message-header-config-property-builder
  "The build-cfn-campaign-in-app-message-header-config-property-builder function updates a CfnCampaign$InAppMessageHeaderConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$InAppMessageHeaderConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:alignment` |
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |
"
  [^CfnCampaign$InAppMessageHeaderConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alignment)]
    (. builder alignment data))
  (when-let [data (lookup-entry config id :header)]
    (. builder header data))
  (when-let [data (lookup-entry config id :text-color)]
    (. builder textColor data))
  (.build builder))


(defn cfn-campaign-in-app-message-header-config-property-builder
  "Creates a  `CfnCampaign$InAppMessageHeaderConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-in-app-message-header-config-property-builder (new CfnCampaign$InAppMessageHeaderConfigProperty$Builder) id config))


(defn build-cfn-campaign-limits-property-builder
  "The build-cfn-campaign-limits-property-builder function updates a CfnCampaign$LimitsProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$LimitsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `daily` | java.lang.Number | [[cdk.support/lookup-entry]] | `:daily` |
| `maximumDuration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:maximum-duration` |
| `messagesPerSecond` | java.lang.Number | [[cdk.support/lookup-entry]] | `:messages-per-second` |
| `session` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session` |
| `total` | java.lang.Number | [[cdk.support/lookup-entry]] | `:total` |
"
  [^CfnCampaign$LimitsProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-campaign-limits-property-builder
  "Creates a  `CfnCampaign$LimitsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-limits-property-builder (new CfnCampaign$LimitsProperty$Builder) id config))


(defn build-cfn-campaign-message-configuration-property-builder
  "The build-cfn-campaign-message-configuration-property-builder function updates a CfnCampaign$MessageConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$MessageConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `smsMessage` | software.amazon.awscdk.services.pinpoint.CfnCampaign$CampaignSmsMessageProperty | [[cdk.support/lookup-entry]] | `:sms-message` |
"
  [^CfnCampaign$MessageConfigurationProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-campaign-message-configuration-property-builder
  "Creates a  `CfnCampaign$MessageConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-message-configuration-property-builder (new CfnCampaign$MessageConfigurationProperty$Builder) id config))


(defn build-cfn-campaign-message-property-builder
  "The build-cfn-campaign-message-property-builder function updates a CfnCampaign$MessageProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$MessageProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnCampaign$MessageProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-campaign-message-property-builder
  "Creates a  `CfnCampaign$MessageProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-message-property-builder (new CfnCampaign$MessageProperty$Builder) id config))


(defn build-cfn-campaign-metric-dimension-property-builder
  "The build-cfn-campaign-metric-dimension-property-builder function updates a CfnCampaign$MetricDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$MetricDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `value` | java.lang.Number | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnCampaign$MetricDimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-campaign-metric-dimension-property-builder
  "Creates a  `CfnCampaign$MetricDimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-metric-dimension-property-builder (new CfnCampaign$MetricDimensionProperty$Builder) id config))


(defn build-cfn-campaign-override-button-configuration-property-builder
  "The build-cfn-campaign-override-button-configuration-property-builder function updates a CfnCampaign$OverrideButtonConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$OverrideButtonConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buttonAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:button-action` |
| `link` | java.lang.String | [[cdk.support/lookup-entry]] | `:link` |
"
  [^CfnCampaign$OverrideButtonConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :button-action)]
    (. builder buttonAction data))
  (when-let [data (lookup-entry config id :link)]
    (. builder link data))
  (.build builder))


(defn cfn-campaign-override-button-configuration-property-builder
  "Creates a  `CfnCampaign$OverrideButtonConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-override-button-configuration-property-builder (new CfnCampaign$OverrideButtonConfigurationProperty$Builder) id config))


(defn build-cfn-campaign-props-builder
  "The build-cfn-campaign-props-builder function updates a CfnCampaignProps$Builder instance using the provided configuration.
  The function takes the CfnCampaignProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `treatmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-name` |
"
  [^CfnCampaignProps$Builder builder id config]
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
  (.build builder))


(defn cfn-campaign-props-builder
  "Creates a  `CfnCampaignProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-props-builder (new CfnCampaignProps$Builder) id config))


(defn build-cfn-campaign-quiet-time-property-builder
  "The build-cfn-campaign-quiet-time-property-builder function updates a CfnCampaign$QuietTimeProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$QuietTimeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `end` | java.lang.String | [[cdk.support/lookup-entry]] | `:end` |
| `start` | java.lang.String | [[cdk.support/lookup-entry]] | `:start` |
"
  [^CfnCampaign$QuietTimeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :end)]
    (. builder end data))
  (when-let [data (lookup-entry config id :start)]
    (. builder start data))
  (.build builder))


(defn cfn-campaign-quiet-time-property-builder
  "Creates a  `CfnCampaign$QuietTimeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-quiet-time-property-builder (new CfnCampaign$QuietTimeProperty$Builder) id config))


(defn build-cfn-campaign-schedule-property-builder
  "The build-cfn-campaign-schedule-property-builder function updates a CfnCampaign$ScheduleProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$ScheduleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `endTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-time` |
| `eventFilter` | software.amazon.awscdk.services.pinpoint.CfnCampaign$CampaignEventFilterProperty | [[cdk.support/lookup-entry]] | `:event-filter` |
| `frequency` | java.lang.String | [[cdk.support/lookup-entry]] | `:frequency` |
| `isLocalTime` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-local-time` |
| `quietTime` | software.amazon.awscdk.services.pinpoint.CfnCampaign$QuietTimeProperty | [[cdk.support/lookup-entry]] | `:quiet-time` |
| `startTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-time` |
| `timeZone` | java.lang.String | [[cdk.support/lookup-entry]] | `:time-zone` |
"
  [^CfnCampaign$ScheduleProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-campaign-schedule-property-builder
  "Creates a  `CfnCampaign$ScheduleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-schedule-property-builder (new CfnCampaign$ScheduleProperty$Builder) id config))


(defn build-cfn-campaign-set-dimension-property-builder
  "The build-cfn-campaign-set-dimension-property-builder function updates a CfnCampaign$SetDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$SetDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-type` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnCampaign$SetDimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dimension-type)]
    (. builder dimensionType data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-campaign-set-dimension-property-builder
  "Creates a  `CfnCampaign$SetDimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-set-dimension-property-builder (new CfnCampaign$SetDimensionProperty$Builder) id config))


(defn build-cfn-campaign-template-configuration-property-builder
  "The build-cfn-campaign-template-configuration-property-builder function updates a CfnCampaign$TemplateConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$TemplateConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emailTemplate` | software.amazon.awscdk.services.pinpoint.CfnCampaign$TemplateProperty | [[cdk.support/lookup-entry]] | `:email-template` |
| `pushTemplate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:push-template` |
| `smsTemplate` | software.amazon.awscdk.services.pinpoint.CfnCampaign$TemplateProperty | [[cdk.support/lookup-entry]] | `:sms-template` |
| `voiceTemplate` | software.amazon.awscdk.services.pinpoint.CfnCampaign$TemplateProperty | [[cdk.support/lookup-entry]] | `:voice-template` |
"
  [^CfnCampaign$TemplateConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :email-template)]
    (. builder emailTemplate data))
  (when-let [data (lookup-entry config id :push-template)]
    (. builder pushTemplate data))
  (when-let [data (lookup-entry config id :sms-template)]
    (. builder smsTemplate data))
  (when-let [data (lookup-entry config id :voice-template)]
    (. builder voiceTemplate data))
  (.build builder))


(defn cfn-campaign-template-configuration-property-builder
  "Creates a  `CfnCampaign$TemplateConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-template-configuration-property-builder (new CfnCampaign$TemplateConfigurationProperty$Builder) id config))


(defn build-cfn-campaign-template-property-builder
  "The build-cfn-campaign-template-property-builder function updates a CfnCampaign$TemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$TemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnCampaign$TemplateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-campaign-template-property-builder
  "Creates a  `CfnCampaign$TemplateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-template-property-builder (new CfnCampaign$TemplateProperty$Builder) id config))


(defn build-cfn-campaign-write-treatment-resource-property-builder
  "The build-cfn-campaign-write-treatment-resource-property-builder function updates a CfnCampaign$WriteTreatmentResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$WriteTreatmentResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customDeliveryConfiguration` | software.amazon.awscdk.services.pinpoint.CfnCampaign$CustomDeliveryConfigurationProperty | [[cdk.support/lookup-entry]] | `:custom-delivery-configuration` |
| `messageConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:message-configuration` |
| `schedule` | software.amazon.awscdk.services.pinpoint.CfnCampaign$ScheduleProperty | [[cdk.support/lookup-entry]] | `:schedule` |
| `sizePercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size-percent` |
| `templateConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:template-configuration` |
| `treatmentDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-description` |
| `treatmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:treatment-name` |
"
  [^CfnCampaign$WriteTreatmentResourceProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-campaign-write-treatment-resource-property-builder
  "Creates a  `CfnCampaign$WriteTreatmentResourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-campaign-write-treatment-resource-property-builder (new CfnCampaign$WriteTreatmentResourceProperty$Builder) id config))


(defn build-cfn-email-channel-builder
  "The build-cfn-email-channel-builder function updates a CfnEmailChannel$Builder instance using the provided configuration.
  The function takes the CfnEmailChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configurationSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `fromAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:from-address` |
| `identity` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity` |
| `orchestrationSendingRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:orchestration-sending-role-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnEmailChannel$Builder builder id config]
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
  (.build builder))


(defn cfn-email-channel-builder
  "Creates a  `CfnEmailChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-email-channel-builder (CfnEmailChannel$Builder/create scope (name id)) id config))


(defn build-cfn-email-channel-props-builder
  "The build-cfn-email-channel-props-builder function updates a CfnEmailChannelProps$Builder instance using the provided configuration.
  The function takes the CfnEmailChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `configurationSet` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration-set` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `fromAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:from-address` |
| `identity` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity` |
| `orchestrationSendingRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:orchestration-sending-role-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnEmailChannelProps$Builder builder id config]
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
  (.build builder))


(defn cfn-email-channel-props-builder
  "Creates a  `CfnEmailChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-email-channel-props-builder (new CfnEmailChannelProps$Builder) id config))


(defn build-cfn-email-template-builder
  "The build-cfn-email-template-builder function updates a CfnEmailTemplate$Builder instance using the provided configuration.
  The function takes the CfnEmailTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultSubstitutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-substitutions` |
| `htmlPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:html-part` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `textPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-part` |
"
  [^CfnEmailTemplate$Builder builder id config]
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
  (.build builder))


(defn cfn-email-template-builder
  "Creates a  `CfnEmailTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-email-template-builder (CfnEmailTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-email-template-props-builder
  "The build-cfn-email-template-props-builder function updates a CfnEmailTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnEmailTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultSubstitutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-substitutions` |
| `htmlPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:html-part` |
| `subject` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
| `textPart` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-part` |
"
  [^CfnEmailTemplateProps$Builder builder id config]
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
  (.build builder))


(defn cfn-email-template-props-builder
  "Creates a  `CfnEmailTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-email-template-props-builder (new CfnEmailTemplateProps$Builder) id config))


(defn build-cfn-event-stream-builder
  "The build-cfn-event-stream-builder function updates a CfnEventStream$Builder instance using the provided configuration.
  The function takes the CfnEventStream$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `destinationStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-stream-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnEventStream$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :destination-stream-arn)]
    (. builder destinationStreamArn data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-event-stream-builder
  "Creates a  `CfnEventStream$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-event-stream-builder (CfnEventStream$Builder/create scope (name id)) id config))


(defn build-cfn-event-stream-props-builder
  "The build-cfn-event-stream-props-builder function updates a CfnEventStreamProps$Builder instance using the provided configuration.
  The function takes the CfnEventStreamProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `destinationStreamArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-stream-arn` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
"
  [^CfnEventStreamProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :destination-stream-arn)]
    (. builder destinationStreamArn data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (.build builder))


(defn cfn-event-stream-props-builder
  "Creates a  `CfnEventStreamProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-event-stream-props-builder (new CfnEventStreamProps$Builder) id config))


(defn build-cfn-gcm-channel-builder
  "The build-cfn-gcm-channel-builder function updates a CfnGCMChannel$Builder instance using the provided configuration.
  The function takes the CfnGCMChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `serviceJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-json` |
"
  [^CfnGCMChannel$Builder builder id config]
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
  (.build builder))


(defn cfn-gcm-channel-builder
  "Creates a  `CfnGCMChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-gcm-channel-builder (CfnGCMChannel$Builder/create scope (name id)) id config))


(defn build-cfn-gcm-channel-props-builder
  "The build-cfn-gcm-channel-props-builder function updates a CfnGCMChannelProps$Builder instance using the provided configuration.
  The function takes the CfnGCMChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `apiKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:api-key` |
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `defaultAuthenticationMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-authentication-method` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `serviceJson` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-json` |
"
  [^CfnGCMChannelProps$Builder builder id config]
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
  (.build builder))


(defn cfn-gcm-channel-props-builder
  "Creates a  `CfnGCMChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-gcm-channel-props-builder (new CfnGCMChannelProps$Builder) id config))


(defn build-cfn-in-app-template-body-config-property-builder
  "The build-cfn-in-app-template-body-config-property-builder function updates a CfnInAppTemplate$BodyConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInAppTemplate$BodyConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:alignment` |
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |
"
  [^CfnInAppTemplate$BodyConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alignment)]
    (. builder alignment data))
  (when-let [data (lookup-entry config id :body)]
    (. builder body data))
  (when-let [data (lookup-entry config id :text-color)]
    (. builder textColor data))
  (.build builder))


(defn cfn-in-app-template-body-config-property-builder
  "Creates a  `CfnInAppTemplate$BodyConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-in-app-template-body-config-property-builder (new CfnInAppTemplate$BodyConfigProperty$Builder) id config))


(defn build-cfn-in-app-template-builder
  "The build-cfn-in-app-template-builder function updates a CfnInAppTemplate$Builder instance using the provided configuration.
  The function takes the CfnInAppTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.util.List | [[cdk.support/lookup-entry]] | `:content` |
| `customConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-config` |
| `layout` | java.lang.String | [[cdk.support/lookup-entry]] | `:layout` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
"
  [^CfnInAppTemplate$Builder builder id config]
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
  (.build builder))


(defn cfn-in-app-template-builder
  "Creates a  `CfnInAppTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-in-app-template-builder (CfnInAppTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-in-app-template-button-config-property-builder
  "The build-cfn-in-app-template-button-config-property-builder function updates a CfnInAppTemplate$ButtonConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInAppTemplate$ButtonConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `android` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:android` |
| `defaultConfig` | software.amazon.awscdk.services.pinpoint.CfnInAppTemplate$DefaultButtonConfigurationProperty | [[cdk.support/lookup-entry]] | `:default-config` |
| `ios` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ios` |
| `web` | software.amazon.awscdk.services.pinpoint.CfnInAppTemplate$OverrideButtonConfigurationProperty | [[cdk.support/lookup-entry]] | `:web` |
"
  [^CfnInAppTemplate$ButtonConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :android)]
    (. builder android data))
  (when-let [data (lookup-entry config id :default-config)]
    (. builder defaultConfig data))
  (when-let [data (lookup-entry config id :ios)]
    (. builder ios data))
  (when-let [data (lookup-entry config id :web)]
    (. builder web data))
  (.build builder))


(defn cfn-in-app-template-button-config-property-builder
  "Creates a  `CfnInAppTemplate$ButtonConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-in-app-template-button-config-property-builder (new CfnInAppTemplate$ButtonConfigProperty$Builder) id config))


(defn build-cfn-in-app-template-default-button-configuration-property-builder
  "The build-cfn-in-app-template-default-button-configuration-property-builder function updates a CfnInAppTemplate$DefaultButtonConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInAppTemplate$DefaultButtonConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backgroundColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:background-color` |
| `borderRadius` | java.lang.Number | [[cdk.support/lookup-entry]] | `:border-radius` |
| `buttonAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:button-action` |
| `link` | java.lang.String | [[cdk.support/lookup-entry]] | `:link` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |
"
  [^CfnInAppTemplate$DefaultButtonConfigurationProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-in-app-template-default-button-configuration-property-builder
  "Creates a  `CfnInAppTemplate$DefaultButtonConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-in-app-template-default-button-configuration-property-builder (new CfnInAppTemplate$DefaultButtonConfigurationProperty$Builder) id config))


(defn build-cfn-in-app-template-header-config-property-builder
  "The build-cfn-in-app-template-header-config-property-builder function updates a CfnInAppTemplate$HeaderConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnInAppTemplate$HeaderConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alignment` | java.lang.String | [[cdk.support/lookup-entry]] | `:alignment` |
| `header` | java.lang.String | [[cdk.support/lookup-entry]] | `:header` |
| `textColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-color` |
"
  [^CfnInAppTemplate$HeaderConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alignment)]
    (. builder alignment data))
  (when-let [data (lookup-entry config id :header)]
    (. builder header data))
  (when-let [data (lookup-entry config id :text-color)]
    (. builder textColor data))
  (.build builder))


(defn cfn-in-app-template-header-config-property-builder
  "Creates a  `CfnInAppTemplate$HeaderConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-in-app-template-header-config-property-builder (new CfnInAppTemplate$HeaderConfigProperty$Builder) id config))


(defn build-cfn-in-app-template-in-app-message-content-property-builder
  "The build-cfn-in-app-template-in-app-message-content-property-builder function updates a CfnInAppTemplate$InAppMessageContentProperty$Builder instance using the provided configuration.
  The function takes the CfnInAppTemplate$InAppMessageContentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backgroundColor` | java.lang.String | [[cdk.support/lookup-entry]] | `:background-color` |
| `bodyConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:body-config` |
| `headerConfig` | software.amazon.awscdk.services.pinpoint.CfnInAppTemplate$HeaderConfigProperty | [[cdk.support/lookup-entry]] | `:header-config` |
| `imageUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-url` |
| `primaryBtn` | software.amazon.awscdk.services.pinpoint.CfnInAppTemplate$ButtonConfigProperty | [[cdk.support/lookup-entry]] | `:primary-btn` |
| `secondaryBtn` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:secondary-btn` |
"
  [^CfnInAppTemplate$InAppMessageContentProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-in-app-template-in-app-message-content-property-builder
  "Creates a  `CfnInAppTemplate$InAppMessageContentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-in-app-template-in-app-message-content-property-builder (new CfnInAppTemplate$InAppMessageContentProperty$Builder) id config))


(defn build-cfn-in-app-template-override-button-configuration-property-builder
  "The build-cfn-in-app-template-override-button-configuration-property-builder function updates a CfnInAppTemplate$OverrideButtonConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInAppTemplate$OverrideButtonConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `buttonAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:button-action` |
| `link` | java.lang.String | [[cdk.support/lookup-entry]] | `:link` |
"
  [^CfnInAppTemplate$OverrideButtonConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :button-action)]
    (. builder buttonAction data))
  (when-let [data (lookup-entry config id :link)]
    (. builder link data))
  (.build builder))


(defn cfn-in-app-template-override-button-configuration-property-builder
  "Creates a  `CfnInAppTemplate$OverrideButtonConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-in-app-template-override-button-configuration-property-builder (new CfnInAppTemplate$OverrideButtonConfigurationProperty$Builder) id config))


(defn build-cfn-in-app-template-props-builder
  "The build-cfn-in-app-template-props-builder function updates a CfnInAppTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnInAppTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:content` |
| `customConfig` | java.lang.Object | [[cdk.support/lookup-entry]] | `:custom-config` |
| `layout` | java.lang.String | [[cdk.support/lookup-entry]] | `:layout` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
"
  [^CfnInAppTemplateProps$Builder builder id config]
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
  (.build builder))


(defn cfn-in-app-template-props-builder
  "Creates a  `CfnInAppTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-in-app-template-props-builder (new CfnInAppTemplateProps$Builder) id config))


(defn build-cfn-push-template-android-push-notification-template-property-builder
  "The build-cfn-push-template-android-push-notification-template-property-builder function updates a CfnPushTemplate$AndroidPushNotificationTemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnPushTemplate$AndroidPushNotificationTemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `imageIconUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-icon-url` |
| `imageUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-url` |
| `smallImageIconUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:small-image-icon-url` |
| `sound` | java.lang.String | [[cdk.support/lookup-entry]] | `:sound` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnPushTemplate$AndroidPushNotificationTemplateProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-push-template-android-push-notification-template-property-builder
  "Creates a  `CfnPushTemplate$AndroidPushNotificationTemplateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-push-template-android-push-notification-template-property-builder (new CfnPushTemplate$AndroidPushNotificationTemplateProperty$Builder) id config))


(defn build-cfn-push-template-apns-push-notification-template-property-builder
  "The build-cfn-push-template-apns-push-notification-template-property-builder function updates a CfnPushTemplate$APNSPushNotificationTemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnPushTemplate$APNSPushNotificationTemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `mediaUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:media-url` |
| `sound` | java.lang.String | [[cdk.support/lookup-entry]] | `:sound` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnPushTemplate$APNSPushNotificationTemplateProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-push-template-apns-push-notification-template-property-builder
  "Creates a  `CfnPushTemplate$APNSPushNotificationTemplateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-push-template-apns-push-notification-template-property-builder (new CfnPushTemplate$APNSPushNotificationTemplateProperty$Builder) id config))


(defn build-cfn-push-template-builder
  "The build-cfn-push-template-builder function updates a CfnPushTemplate$Builder instance using the provided configuration.
  The function takes the CfnPushTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
"
  [^CfnPushTemplate$Builder builder id config]
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
  (.build builder))


(defn cfn-push-template-builder
  "Creates a  `CfnPushTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-push-template-builder (CfnPushTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-push-template-default-push-notification-template-property-builder
  "The build-cfn-push-template-default-push-notification-template-property-builder function updates a CfnPushTemplate$DefaultPushNotificationTemplateProperty$Builder instance using the provided configuration.
  The function takes the CfnPushTemplate$DefaultPushNotificationTemplateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `sound` | java.lang.String | [[cdk.support/lookup-entry]] | `:sound` |
| `title` | java.lang.String | [[cdk.support/lookup-entry]] | `:title` |
| `url` | java.lang.String | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnPushTemplate$DefaultPushNotificationTemplateProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-push-template-default-push-notification-template-property-builder
  "Creates a  `CfnPushTemplate$DefaultPushNotificationTemplateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-push-template-default-push-notification-template-property-builder (new CfnPushTemplate$DefaultPushNotificationTemplateProperty$Builder) id config))


(defn build-cfn-push-template-props-builder
  "The build-cfn-push-template-props-builder function updates a CfnPushTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnPushTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
"
  [^CfnPushTemplateProps$Builder builder id config]
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
  (.build builder))


(defn cfn-push-template-props-builder
  "Creates a  `CfnPushTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-push-template-props-builder (new CfnPushTemplateProps$Builder) id config))


(defn build-cfn-segment-attribute-dimension-property-builder
  "The build-cfn-segment-attribute-dimension-property-builder function updates a CfnSegment$AttributeDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$AttributeDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:attribute-type` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnSegment$AttributeDimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :attribute-type)]
    (. builder attributeType data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-segment-attribute-dimension-property-builder
  "Creates a  `CfnSegment$AttributeDimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-attribute-dimension-property-builder (new CfnSegment$AttributeDimensionProperty$Builder) id config))


(defn build-cfn-segment-behavior-property-builder
  "The build-cfn-segment-behavior-property-builder function updates a CfnSegment$BehaviorProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$BehaviorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recency` | software.amazon.awscdk.services.pinpoint.CfnSegment$RecencyProperty | [[cdk.support/lookup-entry]] | `:recency` |
"
  [^CfnSegment$BehaviorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :recency)]
    (. builder recency data))
  (.build builder))


(defn cfn-segment-behavior-property-builder
  "Creates a  `CfnSegment$BehaviorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-behavior-property-builder (new CfnSegment$BehaviorProperty$Builder) id config))


(defn build-cfn-segment-builder
  "The build-cfn-segment-builder function updates a CfnSegment$Builder instance using the provided configuration.
  The function takes the CfnSegment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `dimensions` | software.amazon.awscdk.services.pinpoint.CfnSegment$SegmentDimensionsProperty | [[cdk.support/lookup-entry]] | `:dimensions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `segmentGroups` | software.amazon.awscdk.services.pinpoint.CfnSegment$SegmentGroupsProperty | [[cdk.support/lookup-entry]] | `:segment-groups` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSegment$Builder builder id config]
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
  (.build builder))


(defn cfn-segment-builder
  "Creates a  `CfnSegment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-segment-builder (CfnSegment$Builder/create scope (name id)) id config))


(defn build-cfn-segment-coordinates-property-builder
  "The build-cfn-segment-coordinates-property-builder function updates a CfnSegment$CoordinatesProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$CoordinatesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `latitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.Number | [[cdk.support/lookup-entry]] | `:longitude` |
"
  [^CfnSegment$CoordinatesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :latitude)]
    (. builder latitude data))
  (when-let [data (lookup-entry config id :longitude)]
    (. builder longitude data))
  (.build builder))


(defn cfn-segment-coordinates-property-builder
  "Creates a  `CfnSegment$CoordinatesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-coordinates-property-builder (new CfnSegment$CoordinatesProperty$Builder) id config))


(defn build-cfn-segment-demographic-property-builder
  "The build-cfn-segment-demographic-property-builder function updates a CfnSegment$DemographicProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$DemographicProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appVersion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:app-version` |
| `channel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:channel` |
| `deviceType` | software.amazon.awscdk.services.pinpoint.CfnSegment$SetDimensionProperty | [[cdk.support/lookup-entry]] | `:device-type` |
| `make` | software.amazon.awscdk.services.pinpoint.CfnSegment$SetDimensionProperty | [[cdk.support/lookup-entry]] | `:make` |
| `model` | software.amazon.awscdk.services.pinpoint.CfnSegment$SetDimensionProperty | [[cdk.support/lookup-entry]] | `:model` |
| `platform` | software.amazon.awscdk.services.pinpoint.CfnSegment$SetDimensionProperty | [[cdk.support/lookup-entry]] | `:platform` |
"
  [^CfnSegment$DemographicProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-segment-demographic-property-builder
  "Creates a  `CfnSegment$DemographicProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-demographic-property-builder (new CfnSegment$DemographicProperty$Builder) id config))


(defn build-cfn-segment-gps-point-property-builder
  "The build-cfn-segment-gps-point-property-builder function updates a CfnSegment$GPSPointProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$GPSPointProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coordinates` | software.amazon.awscdk.services.pinpoint.CfnSegment$CoordinatesProperty | [[cdk.support/lookup-entry]] | `:coordinates` |
| `rangeInKilometers` | java.lang.Number | [[cdk.support/lookup-entry]] | `:range-in-kilometers` |
"
  [^CfnSegment$GPSPointProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :coordinates)]
    (. builder coordinates data))
  (when-let [data (lookup-entry config id :range-in-kilometers)]
    (. builder rangeInKilometers data))
  (.build builder))


(defn cfn-segment-gps-point-property-builder
  "Creates a  `CfnSegment$GPSPointProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-gps-point-property-builder (new CfnSegment$GPSPointProperty$Builder) id config))


(defn build-cfn-segment-groups-property-builder
  "The build-cfn-segment-groups-property-builder function updates a CfnSegment$GroupsProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$GroupsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | java.util.List | [[cdk.support/lookup-entry]] | `:dimensions` |
| `sourceSegments` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:source-segments` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSegment$GroupsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (when-let [data (lookup-entry config id :source-segments)]
    (. builder sourceSegments data))
  (when-let [data (lookup-entry config id :source-type)]
    (. builder sourceType data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-segment-groups-property-builder
  "Creates a  `CfnSegment$GroupsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-groups-property-builder (new CfnSegment$GroupsProperty$Builder) id config))


(defn build-cfn-segment-location-property-builder
  "The build-cfn-segment-location-property-builder function updates a CfnSegment$LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `country` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:country` |
| `gpsPoint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gps-point` |
"
  [^CfnSegment$LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :country)]
    (. builder country data))
  (when-let [data (lookup-entry config id :gps-point)]
    (. builder gpsPoint data))
  (.build builder))


(defn cfn-segment-location-property-builder
  "Creates a  `CfnSegment$LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-location-property-builder (new CfnSegment$LocationProperty$Builder) id config))


(defn build-cfn-segment-props-builder
  "The build-cfn-segment-props-builder function updates a CfnSegmentProps$Builder instance using the provided configuration.
  The function takes the CfnSegmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `segmentGroups` | software.amazon.awscdk.services.pinpoint.CfnSegment$SegmentGroupsProperty | [[cdk.support/lookup-entry]] | `:segment-groups` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSegmentProps$Builder builder id config]
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
  (.build builder))


(defn cfn-segment-props-builder
  "Creates a  `CfnSegmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-props-builder (new CfnSegmentProps$Builder) id config))


(defn build-cfn-segment-recency-property-builder
  "The build-cfn-segment-recency-property-builder function updates a CfnSegment$RecencyProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$RecencyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `duration` | java.lang.String | [[cdk.support/lookup-entry]] | `:duration` |
| `recencyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:recency-type` |
"
  [^CfnSegment$RecencyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :duration)]
    (. builder duration data))
  (when-let [data (lookup-entry config id :recency-type)]
    (. builder recencyType data))
  (.build builder))


(defn cfn-segment-recency-property-builder
  "Creates a  `CfnSegment$RecencyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-recency-property-builder (new CfnSegment$RecencyProperty$Builder) id config))


(defn build-cfn-segment-segment-dimensions-property-builder
  "The build-cfn-segment-segment-dimensions-property-builder function updates a CfnSegment$SegmentDimensionsProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$SegmentDimensionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:attributes` |
| `behavior` | software.amazon.awscdk.services.pinpoint.CfnSegment$BehaviorProperty | [[cdk.support/lookup-entry]] | `:behavior` |
| `demographic` | software.amazon.awscdk.services.pinpoint.CfnSegment$DemographicProperty | [[cdk.support/lookup-entry]] | `:demographic` |
| `location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:location` |
| `metrics` | java.lang.Object | [[cdk.support/lookup-entry]] | `:metrics` |
| `userAttributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:user-attributes` |
"
  [^CfnSegment$SegmentDimensionsProperty$Builder builder id config]
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
  (.build builder))


(defn cfn-segment-segment-dimensions-property-builder
  "Creates a  `CfnSegment$SegmentDimensionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-segment-dimensions-property-builder (new CfnSegment$SegmentDimensionsProperty$Builder) id config))


(defn build-cfn-segment-segment-groups-property-builder
  "The build-cfn-segment-segment-groups-property-builder function updates a CfnSegment$SegmentGroupsProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$SegmentGroupsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groups` | java.util.List | [[cdk.support/lookup-entry]] | `:groups` |
| `include` | java.lang.String | [[cdk.support/lookup-entry]] | `:include` |
"
  [^CfnSegment$SegmentGroupsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :groups)]
    (. builder groups data))
  (when-let [data (lookup-entry config id :include)]
    (. builder include data))
  (.build builder))


(defn cfn-segment-segment-groups-property-builder
  "Creates a  `CfnSegment$SegmentGroupsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-segment-groups-property-builder (new CfnSegment$SegmentGroupsProperty$Builder) id config))


(defn build-cfn-segment-set-dimension-property-builder
  "The build-cfn-segment-set-dimension-property-builder function updates a CfnSegment$SetDimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$SetDimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dimension-type` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnSegment$SetDimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dimension-type)]
    (. builder dimensionType data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-segment-set-dimension-property-builder
  "Creates a  `CfnSegment$SetDimensionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-set-dimension-property-builder (new CfnSegment$SetDimensionProperty$Builder) id config))


(defn build-cfn-segment-source-segments-property-builder
  "The build-cfn-segment-source-segments-property-builder function updates a CfnSegment$SourceSegmentsProperty$Builder instance using the provided configuration.
  The function takes the CfnSegment$SourceSegmentsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnSegment$SourceSegmentsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-segment-source-segments-property-builder
  "Creates a  `CfnSegment$SourceSegmentsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-segment-source-segments-property-builder (new CfnSegment$SourceSegmentsProperty$Builder) id config))


(defn build-cfn-sms-channel-builder
  "The build-cfn-sms-channel-builder function updates a CfnSMSChannel$Builder instance using the provided configuration.
  The function takes the CfnSMSChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `senderId` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender-id` |
| `shortCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-code` |
"
  [^CfnSMSChannel$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :sender-id)]
    (. builder senderId data))
  (when-let [data (lookup-entry config id :short-code)]
    (. builder shortCode data))
  (.build builder))


(defn cfn-sms-channel-builder
  "Creates a  `CfnSMSChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-sms-channel-builder (CfnSMSChannel$Builder/create scope (name id)) id config))


(defn build-cfn-sms-channel-props-builder
  "The build-cfn-sms-channel-props-builder function updates a CfnSMSChannelProps$Builder instance using the provided configuration.
  The function takes the CfnSMSChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `senderId` | java.lang.String | [[cdk.support/lookup-entry]] | `:sender-id` |
| `shortCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:short-code` |
"
  [^CfnSMSChannelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :sender-id)]
    (. builder senderId data))
  (when-let [data (lookup-entry config id :short-code)]
    (. builder shortCode data))
  (.build builder))


(defn cfn-sms-channel-props-builder
  "Creates a  `CfnSMSChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-sms-channel-props-builder (new CfnSMSChannelProps$Builder) id config))


(defn build-cfn-sms-template-builder
  "The build-cfn-sms-template-builder function updates a CfnSmsTemplate$Builder instance using the provided configuration.
  The function takes the CfnSmsTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `defaultSubstitutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-substitutions` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
"
  [^CfnSmsTemplate$Builder builder id config]
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
  (.build builder))


(defn cfn-sms-template-builder
  "Creates a  `CfnSmsTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-sms-template-builder (CfnSmsTemplate$Builder/create scope (name id)) id config))


(defn build-cfn-sms-template-props-builder
  "The build-cfn-sms-template-props-builder function updates a CfnSmsTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnSmsTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `body` | java.lang.String | [[cdk.support/lookup-entry]] | `:body` |
| `defaultSubstitutions` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-substitutions` |
| `tags` | java.lang.Object | [[cdk.support/lookup-entry]] | `:tags` |
| `templateDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-description` |
| `templateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:template-name` |
"
  [^CfnSmsTemplateProps$Builder builder id config]
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
  (.build builder))


(defn cfn-sms-template-props-builder
  "Creates a  `CfnSmsTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-sms-template-props-builder (new CfnSmsTemplateProps$Builder) id config))


(defn build-cfn-voice-channel-builder
  "The build-cfn-voice-channel-builder function updates a CfnVoiceChannel$Builder instance using the provided configuration.
  The function takes the CfnVoiceChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnVoiceChannel$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-voice-channel-builder
  "Creates a  `CfnVoiceChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-voice-channel-builder (CfnVoiceChannel$Builder/create scope (name id)) id config))


(defn build-cfn-voice-channel-props-builder
  "The build-cfn-voice-channel-props-builder function updates a CfnVoiceChannelProps$Builder instance using the provided configuration.
  The function takes the CfnVoiceChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationId` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-id` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnVoiceChannelProps$Builder builder id config]
  (when-let [data (lookup-entry config id :application-id)]
    (. builder applicationId data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-voice-channel-props-builder
  "Creates a  `CfnVoiceChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-voice-channel-props-builder (new CfnVoiceChannelProps$Builder) id config))