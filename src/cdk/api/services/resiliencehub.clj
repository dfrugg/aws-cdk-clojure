(ns cdk.api.services.resiliencehub
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.resiliencehub package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.resiliencehub CfnApp$Builder
                                                          CfnApp$EventSubscriptionProperty$Builder
                                                          CfnApp$PermissionModelProperty$Builder
                                                          CfnApp$PhysicalResourceIdProperty$Builder
                                                          CfnApp$ResourceMappingProperty$Builder
                                                          CfnAppProps$Builder
                                                          CfnResiliencyPolicy$Builder
                                                          CfnResiliencyPolicy$FailurePolicyProperty$Builder
                                                          CfnResiliencyPolicyProps$Builder]))


(defn cfn-app-builder
  "The cfn-app-builder function buildes out new instances of 
CfnApp$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appAssessmentSchedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-assessment-schedule` |
| `appTemplateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-template-body` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventSubscriptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-subscriptions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionModel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:permission-model` |
| `resiliencyPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resiliency-policy-arn` |
| `resourceMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-mappings` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApp$Builder/create stack id)]
    (when-let [data (lookup-entry config id :app-assessment-schedule)]
      (. builder appAssessmentSchedule data))
    (when-let [data (lookup-entry config id :app-template-body)]
      (. builder appTemplateBody data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-subscriptions)]
      (. builder eventSubscriptions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :permission-model)]
      (. builder permissionModel data))
    (when-let [data (lookup-entry config id :resiliency-policy-arn)]
      (. builder resiliencyPolicyArn data))
    (when-let [data (lookup-entry config id :resource-mappings)]
      (. builder resourceMappings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-app-event-subscription-property-builder
  "The cfn-app-event-subscription-property-builder function buildes out new instances of 
CfnApp$EventSubscriptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |"
  [stack id config]
  (let [builder (CfnApp$EventSubscriptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :event-type)]
      (. builder eventType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (.build builder)))


(defn cfn-app-permission-model-property-builder
  "The cfn-app-permission-model-property-builder function buildes out new instances of 
CfnApp$PermissionModelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossAccountRoleArns` | java.util.List | [[cdk.support/lookup-entry]] | `:cross-account-role-arns` |
| `invokerRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:invoker-role-name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnApp$PermissionModelProperty$Builder.)]
    (when-let [data (lookup-entry config id :cross-account-role-arns)]
      (. builder crossAccountRoleArns data))
    (when-let [data (lookup-entry config id :invoker-role-name)]
      (. builder invokerRoleName data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-app-physical-resource-id-property-builder
  "The cfn-app-physical-resource-id-property-builder function buildes out new instances of 
CfnApp$PhysicalResourceIdProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-id` |
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnApp$PhysicalResourceIdProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-account-id)]
      (. builder awsAccountId data))
    (when-let [data (lookup-entry config id :aws-region)]
      (. builder awsRegion data))
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-app-props-builder
  "The cfn-app-props-builder function buildes out new instances of 
CfnAppProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appAssessmentSchedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-assessment-schedule` |
| `appTemplateBody` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-template-body` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventSubscriptions` | java.util.List | [[cdk.support/lookup-entry]] | `:event-subscriptions` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionModel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:permission-model` |
| `resiliencyPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resiliency-policy-arn` |
| `resourceMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-mappings` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAppProps$Builder.)]
    (when-let [data (lookup-entry config id :app-assessment-schedule)]
      (. builder appAssessmentSchedule data))
    (when-let [data (lookup-entry config id :app-template-body)]
      (. builder appTemplateBody data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-subscriptions)]
      (. builder eventSubscriptions data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :permission-model)]
      (. builder permissionModel data))
    (when-let [data (lookup-entry config id :resiliency-policy-arn)]
      (. builder resiliencyPolicyArn data))
    (when-let [data (lookup-entry config id :resource-mappings)]
      (. builder resourceMappings data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-app-resource-mapping-property-builder
  "The cfn-app-resource-mapping-property-builder function buildes out new instances of 
CfnApp$ResourceMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eksSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:eks-source-name` |
| `logicalStackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-stack-name` |
| `mappingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping-type` |
| `physicalResourceId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:physical-resource-id` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `terraformSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:terraform-source-name` |"
  [stack id config]
  (let [builder (CfnApp$ResourceMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :eks-source-name)]
      (. builder eksSourceName data))
    (when-let [data (lookup-entry config id :logical-stack-name)]
      (. builder logicalStackName data))
    (when-let [data (lookup-entry config id :mapping-type)]
      (. builder mappingType data))
    (when-let [data (lookup-entry config id :physical-resource-id)]
      (. builder physicalResourceId data))
    (when-let [data (lookup-entry config id :resource-name)]
      (. builder resourceName data))
    (when-let [data (lookup-entry config id :terraform-source-name)]
      (. builder terraformSourceName data))
    (.build builder)))


(defn cfn-resiliency-policy-builder
  "The cfn-resiliency-policy-builder function buildes out new instances of 
CfnResiliencyPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLocationConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-location-constraint` |
| `policy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy` |
| `policyDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-description` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |"
  [stack id config]
  (let [builder (CfnResiliencyPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data-location-constraint)]
      (. builder dataLocationConstraint data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :policy-description)]
      (. builder policyDescription data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tier)]
      (. builder tier data))
    (.build builder)))


(defn cfn-resiliency-policy-failure-policy-property-builder
  "The cfn-resiliency-policy-failure-policy-property-builder function buildes out new instances of 
CfnResiliencyPolicy$FailurePolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rpoInSecs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rpo-in-secs` |
| `rtoInSecs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rto-in-secs` |"
  [stack id config]
  (let [builder (CfnResiliencyPolicy$FailurePolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :rpo-in-secs)]
      (. builder rpoInSecs data))
    (when-let [data (lookup-entry config id :rto-in-secs)]
      (. builder rtoInSecs data))
    (.build builder)))


(defn cfn-resiliency-policy-props-builder
  "The cfn-resiliency-policy-props-builder function buildes out new instances of 
CfnResiliencyPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLocationConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-location-constraint` |
| `policy` | java.util.Map | [[cdk.support/lookup-entry]] | `:policy` |
| `policyDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-description` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |"
  [stack id config]
  (let [builder (CfnResiliencyPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :data-location-constraint)]
      (. builder dataLocationConstraint data))
    (when-let [data (lookup-entry config id :policy)]
      (. builder policy data))
    (when-let [data (lookup-entry config id :policy-description)]
      (. builder policyDescription data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tier)]
      (. builder tier data))
    (.build builder)))