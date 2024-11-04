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


(defn cfn-campaign-agentless-dialer-config-property-builder
  "The cfn-campaign-agentless-dialer-config-property-builder function buildes out new instances of 
CfnCampaign$AgentlessDialerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dialingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dialing-capacity` |"
  [stack id config]
  (let [builder (CfnCampaign$AgentlessDialerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :dialing-capacity)]
      (. builder dialingCapacity data))
    (.build builder)))


(defn cfn-campaign-answer-machine-detection-config-property-builder
  "The cfn-campaign-answer-machine-detection-config-property-builder function buildes out new instances of 
CfnCampaign$AnswerMachineDetectionConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awaitAnswerMachinePrompt` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:await-answer-machine-prompt` |
| `enableAnswerMachineDetection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-answer-machine-detection` |"
  [stack id config]
  (let [builder (CfnCampaign$AnswerMachineDetectionConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :await-answer-machine-prompt)]
      (. builder awaitAnswerMachinePrompt data))
    (when-let [data (lookup-entry config id :enable-answer-machine-detection)]
      (. builder enableAnswerMachineDetection data))
    (.build builder)))


(defn cfn-campaign-builder
  "The cfn-campaign-builder function buildes out new instances of 
CfnCampaign$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-instance-arn` |
| `dialerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dialer-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outboundCallConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outbound-call-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCampaign$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-campaign-dialer-config-property-builder
  "The cfn-campaign-dialer-config-property-builder function buildes out new instances of 
CfnCampaign$DialerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `agentlessDialerConfig` | software.amazon.awscdk.services.connectcampaigns.CfnCampaign$AgentlessDialerConfigProperty | [[cdk.support/lookup-entry]] | `:agentless-dialer-config` |
| `predictiveDialerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:predictive-dialer-config` |
| `progressiveDialerConfig` | software.amazon.awscdk.services.connectcampaigns.CfnCampaign$ProgressiveDialerConfigProperty | [[cdk.support/lookup-entry]] | `:progressive-dialer-config` |"
  [stack id config]
  (let [builder (CfnCampaign$DialerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :agentless-dialer-config)]
      (. builder agentlessDialerConfig data))
    (when-let [data (lookup-entry config id :predictive-dialer-config)]
      (. builder predictiveDialerConfig data))
    (when-let [data (lookup-entry config id :progressive-dialer-config)]
      (. builder progressiveDialerConfig data))
    (.build builder)))


(defn cfn-campaign-outbound-call-config-property-builder
  "The cfn-campaign-outbound-call-config-property-builder function buildes out new instances of 
CfnCampaign$OutboundCallConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `answerMachineDetectionConfig` | software.amazon.awscdk.services.connectcampaigns.CfnCampaign$AnswerMachineDetectionConfigProperty | [[cdk.support/lookup-entry]] | `:answer-machine-detection-config` |
| `connectContactFlowArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-contact-flow-arn` |
| `connectQueueArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-queue-arn` |
| `connectSourcePhoneNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-source-phone-number` |"
  [stack id config]
  (let [builder (CfnCampaign$OutboundCallConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :answer-machine-detection-config)]
      (. builder answerMachineDetectionConfig data))
    (when-let [data (lookup-entry config id :connect-contact-flow-arn)]
      (. builder connectContactFlowArn data))
    (when-let [data (lookup-entry config id :connect-queue-arn)]
      (. builder connectQueueArn data))
    (when-let [data (lookup-entry config id :connect-source-phone-number)]
      (. builder connectSourcePhoneNumber data))
    (.build builder)))


(defn cfn-campaign-predictive-dialer-config-property-builder
  "The cfn-campaign-predictive-dialer-config-property-builder function buildes out new instances of 
CfnCampaign$PredictiveDialerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bandwidthAllocation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bandwidth-allocation` |
| `dialingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dialing-capacity` |"
  [stack id config]
  (let [builder (CfnCampaign$PredictiveDialerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bandwidth-allocation)]
      (. builder bandwidthAllocation data))
    (when-let [data (lookup-entry config id :dialing-capacity)]
      (. builder dialingCapacity data))
    (.build builder)))


(defn cfn-campaign-progressive-dialer-config-property-builder
  "The cfn-campaign-progressive-dialer-config-property-builder function buildes out new instances of 
CfnCampaign$ProgressiveDialerConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bandwidthAllocation` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bandwidth-allocation` |
| `dialingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dialing-capacity` |"
  [stack id config]
  (let [builder (CfnCampaign$ProgressiveDialerConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :bandwidth-allocation)]
      (. builder bandwidthAllocation data))
    (when-let [data (lookup-entry config id :dialing-capacity)]
      (. builder dialingCapacity data))
    (.build builder)))


(defn cfn-campaign-props-builder
  "The cfn-campaign-props-builder function buildes out new instances of 
CfnCampaignProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `connectInstanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:connect-instance-arn` |
| `dialerConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dialer-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outboundCallConfig` | software.amazon.awscdk.services.connectcampaigns.CfnCampaign$OutboundCallConfigProperty | [[cdk.support/lookup-entry]] | `:outbound-call-config` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnCampaignProps$Builder.)]
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
    (.build builder)))