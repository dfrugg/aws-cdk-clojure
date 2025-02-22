(ns cdk.api.services.connectcampaigns
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.connectcampaigns package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.connectcampaigns CfnCampaign$AgentlessDialerConfigProperty$Builder
                                                             CfnCampaign$AnswerMachineDetectionConfigProperty$Builder
                                                             CfnCampaign$Builder
                                                             CfnCampaign$DialerConfigProperty$Builder
                                                             CfnCampaign$OutboundCallConfigProperty$Builder
                                                             CfnCampaign$PredictiveDialerConfigProperty$Builder
                                                             CfnCampaign$ProgressiveDialerConfigProperty$Builder
                                                             CfnCampaignProps$Builder]))


(defn build-cfn-campaign-agentless-dialer-config-property-builder
  "The build-cfn-campaign-agentless-dialer-config-property-builder function updates a CfnCampaign$AgentlessDialerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$AgentlessDialerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dialingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dialing-capacity` |
"
  [^CfnCampaign$AgentlessDialerConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dialing-capacity)]
    (. builder dialingCapacity data))
  (.build builder))


(defn build-cfn-campaign-answer-machine-detection-config-property-builder
  "The build-cfn-campaign-answer-machine-detection-config-property-builder function updates a CfnCampaign$AnswerMachineDetectionConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$AnswerMachineDetectionConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awaitAnswerMachinePrompt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:await-answer-machine-prompt` |
| `enableAnswerMachineDetection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-answer-machine-detection` |
"
  [^CfnCampaign$AnswerMachineDetectionConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :await-answer-machine-prompt)]
    (. builder awaitAnswerMachinePrompt data))
  (when-let [data (lookup-entry config id :enable-answer-machine-detection)]
    (. builder enableAnswerMachineDetection data))
  (.build builder))


(defn build-cfn-campaign-builder
  "The build-cfn-campaign-builder function updates a CfnCampaign$Builder instance using the provided configuration.
  The function takes the CfnCampaign$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-instance-arn` |
| `dialerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dialer-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outboundCallConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outbound-call-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCampaign$Builder builder id config]
  (when-let [data (lookup-entry config id :connect-instance-arn)]
    (. builder connectInstanceArn data))
  (when-let [data (lookup-entry config id :dialer-config)]
    (. builder dialerConfig data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :outbound-call-config)]
    (. builder outboundCallConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-campaign-dialer-config-property-builder
  "The build-cfn-campaign-dialer-config-property-builder function updates a CfnCampaign$DialerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$DialerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentlessDialerConfig` | software.amazon.awscdk.services.connectcampaigns.CfnCampaign$AgentlessDialerConfigProperty | [[cdk.support/lookup-entry]] | `:agentless-dialer-config` |
| `predictiveDialerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:predictive-dialer-config` |
| `progressiveDialerConfig` | software.amazon.awscdk.services.connectcampaigns.CfnCampaign$ProgressiveDialerConfigProperty | [[cdk.support/lookup-entry]] | `:progressive-dialer-config` |
"
  [^CfnCampaign$DialerConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :agentless-dialer-config)]
    (. builder agentlessDialerConfig data))
  (when-let [data (lookup-entry config id :predictive-dialer-config)]
    (. builder predictiveDialerConfig data))
  (when-let [data (lookup-entry config id :progressive-dialer-config)]
    (. builder progressiveDialerConfig data))
  (.build builder))


(defn build-cfn-campaign-outbound-call-config-property-builder
  "The build-cfn-campaign-outbound-call-config-property-builder function updates a CfnCampaign$OutboundCallConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$OutboundCallConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `answerMachineDetectionConfig` | software.amazon.awscdk.services.connectcampaigns.CfnCampaign$AnswerMachineDetectionConfigProperty | [[cdk.support/lookup-entry]] | `:answer-machine-detection-config` |
| `connectContactFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-contact-flow-arn` |
| `connectQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-queue-arn` |
| `connectSourcePhoneNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-source-phone-number` |
"
  [^CfnCampaign$OutboundCallConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :answer-machine-detection-config)]
    (. builder answerMachineDetectionConfig data))
  (when-let [data (lookup-entry config id :connect-contact-flow-arn)]
    (. builder connectContactFlowArn data))
  (when-let [data (lookup-entry config id :connect-queue-arn)]
    (. builder connectQueueArn data))
  (when-let [data (lookup-entry config id :connect-source-phone-number)]
    (. builder connectSourcePhoneNumber data))
  (.build builder))


(defn build-cfn-campaign-predictive-dialer-config-property-builder
  "The build-cfn-campaign-predictive-dialer-config-property-builder function updates a CfnCampaign$PredictiveDialerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$PredictiveDialerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bandwidthAllocation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bandwidth-allocation` |
| `dialingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dialing-capacity` |
"
  [^CfnCampaign$PredictiveDialerConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bandwidth-allocation)]
    (. builder bandwidthAllocation data))
  (when-let [data (lookup-entry config id :dialing-capacity)]
    (. builder dialingCapacity data))
  (.build builder))


(defn build-cfn-campaign-progressive-dialer-config-property-builder
  "The build-cfn-campaign-progressive-dialer-config-property-builder function updates a CfnCampaign$ProgressiveDialerConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnCampaign$ProgressiveDialerConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bandwidthAllocation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bandwidth-allocation` |
| `dialingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dialing-capacity` |
"
  [^CfnCampaign$ProgressiveDialerConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bandwidth-allocation)]
    (. builder bandwidthAllocation data))
  (when-let [data (lookup-entry config id :dialing-capacity)]
    (. builder dialingCapacity data))
  (.build builder))


(defn build-cfn-campaign-props-builder
  "The build-cfn-campaign-props-builder function updates a CfnCampaignProps$Builder instance using the provided configuration.
  The function takes the CfnCampaignProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-instance-arn` |
| `dialerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dialer-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outboundCallConfig` | software.amazon.awscdk.services.connectcampaigns.CfnCampaign$OutboundCallConfigProperty | [[cdk.support/lookup-entry]] | `:outbound-call-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnCampaignProps$Builder builder id config]
  (when-let [data (lookup-entry config id :connect-instance-arn)]
    (. builder connectInstanceArn data))
  (when-let [data (lookup-entry config id :dialer-config)]
    (. builder dialerConfig data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :outbound-call-config)]
    (. builder outboundCallConfig data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))