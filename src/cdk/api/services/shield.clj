(ns cdk.api.services.shield
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.shield package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.shield CfnDRTAccess$Builder
                                                   CfnDRTAccessProps$Builder
                                                   CfnProactiveEngagement$Builder
                                                   CfnProactiveEngagement$EmergencyContactProperty$Builder
                                                   CfnProactiveEngagementProps$Builder
                                                   CfnProtection$ActionProperty$Builder
                                                   CfnProtection$ApplicationLayerAutomaticResponseConfigurationProperty$Builder
                                                   CfnProtection$Builder
                                                   CfnProtectionGroup$Builder
                                                   CfnProtectionGroupProps$Builder
                                                   CfnProtectionProps$Builder]))


(defn cfn-drt-access-builder
  "The cfn-drt-access-builder function buildes out new instances of 
CfnDRTAccess$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logBucketList` | java.util.List | [[cdk.support/lookup-entry]] | `:log-bucket-list` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDRTAccess$Builder/create stack id)]
    (when-let [data (lookup-entry config id :log-bucket-list)]
      (. builder logBucketList data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-drt-access-props-builder
  "The cfn-drt-access-props-builder function buildes out new instances of 
CfnDRTAccessProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logBucketList` | java.util.List | [[cdk.support/lookup-entry]] | `:log-bucket-list` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |"
  [stack id config]
  (let [builder (CfnDRTAccessProps$Builder.)]
    (when-let [data (lookup-entry config id :log-bucket-list)]
      (. builder logBucketList data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (.build builder)))


(defn cfn-proactive-engagement-builder
  "The cfn-proactive-engagement-builder function buildes out new instances of 
CfnProactiveEngagement$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emergencyContactList` | java.util.List | [[cdk.support/lookup-entry]] | `:emergency-contact-list` |
| `proactiveEngagementStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:proactive-engagement-status` |"
  [stack id config]
  (let [builder (CfnProactiveEngagement$Builder/create stack id)]
    (when-let [data (lookup-entry config id :emergency-contact-list)]
      (. builder emergencyContactList data))
    (when-let [data (lookup-entry config id :proactive-engagement-status)]
      (. builder proactiveEngagementStatus data))
    (.build builder)))


(defn cfn-proactive-engagement-emergency-contact-property-builder
  "The cfn-proactive-engagement-emergency-contact-property-builder function buildes out new instances of 
CfnProactiveEngagement$EmergencyContactProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `contactNotes` | java.lang.String | [[cdk.support/lookup-entry]] | `:contact-notes` |
| `emailAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-address` |
| `phoneNumber` | java.lang.String | [[cdk.support/lookup-entry]] | `:phone-number` |"
  [stack id config]
  (let [builder (CfnProactiveEngagement$EmergencyContactProperty$Builder.)]
    (when-let [data (lookup-entry config id :contact-notes)]
      (. builder contactNotes data))
    (when-let [data (lookup-entry config id :email-address)]
      (. builder emailAddress data))
    (when-let [data (lookup-entry config id :phone-number)]
      (. builder phoneNumber data))
    (.build builder)))


(defn cfn-proactive-engagement-props-builder
  "The cfn-proactive-engagement-props-builder function buildes out new instances of 
CfnProactiveEngagementProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emergencyContactList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:emergency-contact-list` |
| `proactiveEngagementStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:proactive-engagement-status` |"
  [stack id config]
  (let [builder (CfnProactiveEngagementProps$Builder.)]
    (when-let [data (lookup-entry config id :emergency-contact-list)]
      (. builder emergencyContactList data))
    (when-let [data (lookup-entry config id :proactive-engagement-status)]
      (. builder proactiveEngagementStatus data))
    (.build builder)))


(defn cfn-protection-action-property-builder
  "The cfn-protection-action-property-builder function buildes out new instances of 
CfnProtection$ActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `block` | java.lang.Object | [[cdk.support/lookup-entry]] | `:block` |
| `count` | java.lang.Object | [[cdk.support/lookup-entry]] | `:count` |"
  [stack id config]
  (let [builder (CfnProtection$ActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :block)]
      (. builder block data))
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (.build builder)))


(defn cfn-protection-application-layer-automatic-response-configuration-property-builder
  "The cfn-protection-application-layer-automatic-response-configuration-property-builder function buildes out new instances of 
CfnProtection$ApplicationLayerAutomaticResponseConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnProtection$ApplicationLayerAutomaticResponseConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-protection-builder
  "The cfn-protection-builder function buildes out new instances of 
CfnProtection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationLayerAutomaticResponseConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-layer-automatic-response-configuration` |
| `healthCheckArns` | java.util.List | [[cdk.support/lookup-entry]] | `:health-check-arns` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProtection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application-layer-automatic-response-configuration)]
      (. builder applicationLayerAutomaticResponseConfiguration data))
    (when-let [data (lookup-entry config id :health-check-arns)]
      (. builder healthCheckArns data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-protection-group-builder
  "The cfn-protection-group-builder function buildes out new instances of 
CfnProtectionGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregation` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregation` |
| `members` | java.util.List | [[cdk.support/lookup-entry]] | `:members` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `protectionGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:protection-group-id` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProtectionGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :aggregation)]
      (. builder aggregation data))
    (when-let [data (lookup-entry config id :members)]
      (. builder members data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (when-let [data (lookup-entry config id :protection-group-id)]
      (. builder protectionGroupId data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-protection-group-props-builder
  "The cfn-protection-group-props-builder function buildes out new instances of 
CfnProtectionGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregation` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregation` |
| `members` | java.util.List | [[cdk.support/lookup-entry]] | `:members` |
| `pattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:pattern` |
| `protectionGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:protection-group-id` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProtectionGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :aggregation)]
      (. builder aggregation data))
    (when-let [data (lookup-entry config id :members)]
      (. builder members data))
    (when-let [data (lookup-entry config id :pattern)]
      (. builder pattern data))
    (when-let [data (lookup-entry config id :protection-group-id)]
      (. builder protectionGroupId data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-protection-props-builder
  "The cfn-protection-props-builder function buildes out new instances of 
CfnProtectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationLayerAutomaticResponseConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:application-layer-automatic-response-configuration` |
| `healthCheckArns` | java.util.List | [[cdk.support/lookup-entry]] | `:health-check-arns` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProtectionProps$Builder.)]
    (when-let [data (lookup-entry config id :application-layer-automatic-response-configuration)]
      (. builder applicationLayerAutomaticResponseConfiguration data))
    (when-let [data (lookup-entry config id :health-check-arns)]
      (. builder healthCheckArns data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))