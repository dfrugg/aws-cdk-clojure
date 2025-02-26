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


(defn build-cfn-app-builder
  "The build-cfn-app-builder function updates a CfnApp$Builder instance using the provided configuration.
  The function takes the CfnApp$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApp$Builder builder id config]
  (when-some [data (lookup-entry config id :app-assessment-schedule)]
    (. builder appAssessmentSchedule data))
  (when-some [data (lookup-entry config id :app-template-body)]
    (. builder appTemplateBody data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-subscriptions)]
    (. builder eventSubscriptions data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :permission-model)]
    (. builder permissionModel data))
  (when-some [data (lookup-entry config id :resiliency-policy-arn)]
    (. builder resiliencyPolicyArn data))
  (when-some [data (lookup-entry config id :resource-mappings)]
    (. builder resourceMappings data))
  (when-some [data (lookup-entry config id :tags)]
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


(defn build-cfn-app-event-subscription-property-builder
  "The build-cfn-app-event-subscription-property-builder function updates a CfnApp$EventSubscriptionProperty$Builder instance using the provided configuration.
  The function takes the CfnApp$EventSubscriptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eventType` | java.lang.String | [[cdk.support/lookup-entry]] | `:event-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
"
  [^CfnApp$EventSubscriptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :event-type)]
    (. builder eventType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (.build builder))


(defn cfn-app-event-subscription-property-builder
  "Creates a  `CfnApp$EventSubscriptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-app-event-subscription-property-builder (new CfnApp$EventSubscriptionProperty$Builder) id config))


(defn build-cfn-app-permission-model-property-builder
  "The build-cfn-app-permission-model-property-builder function updates a CfnApp$PermissionModelProperty$Builder instance using the provided configuration.
  The function takes the CfnApp$PermissionModelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `crossAccountRoleArns` | java.util.List | [[cdk.support/lookup-entry]] | `:cross-account-role-arns` |
| `invokerRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:invoker-role-name` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnApp$PermissionModelProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cross-account-role-arns)]
    (. builder crossAccountRoleArns data))
  (when-some [data (lookup-entry config id :invoker-role-name)]
    (. builder invokerRoleName data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-app-permission-model-property-builder
  "Creates a  `CfnApp$PermissionModelProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-app-permission-model-property-builder (new CfnApp$PermissionModelProperty$Builder) id config))


(defn build-cfn-app-physical-resource-id-property-builder
  "The build-cfn-app-physical-resource-id-property-builder function updates a CfnApp$PhysicalResourceIdProperty$Builder instance using the provided configuration.
  The function takes the CfnApp$PhysicalResourceIdProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccountId` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-account-id` |
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnApp$PhysicalResourceIdProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aws-account-id)]
    (. builder awsAccountId data))
  (when-some [data (lookup-entry config id :aws-region)]
    (. builder awsRegion data))
  (when-some [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-app-physical-resource-id-property-builder
  "Creates a  `CfnApp$PhysicalResourceIdProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-app-physical-resource-id-property-builder (new CfnApp$PhysicalResourceIdProperty$Builder) id config))


(defn build-cfn-app-props-builder
  "The build-cfn-app-props-builder function updates a CfnAppProps$Builder instance using the provided configuration.
  The function takes the CfnAppProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAppProps$Builder builder id config]
  (when-some [data (lookup-entry config id :app-assessment-schedule)]
    (. builder appAssessmentSchedule data))
  (when-some [data (lookup-entry config id :app-template-body)]
    (. builder appTemplateBody data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-subscriptions)]
    (. builder eventSubscriptions data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :permission-model)]
    (. builder permissionModel data))
  (when-some [data (lookup-entry config id :resiliency-policy-arn)]
    (. builder resiliencyPolicyArn data))
  (when-some [data (lookup-entry config id :resource-mappings)]
    (. builder resourceMappings data))
  (when-some [data (lookup-entry config id :tags)]
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


(defn build-cfn-app-resource-mapping-property-builder
  "The build-cfn-app-resource-mapping-property-builder function updates a CfnApp$ResourceMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnApp$ResourceMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `eksSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:eks-source-name` |
| `logicalStackName` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-stack-name` |
| `mappingType` | java.lang.String | [[cdk.support/lookup-entry]] | `:mapping-type` |
| `physicalResourceId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:physical-resource-id` |
| `resourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-name` |
| `terraformSourceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:terraform-source-name` |
"
  [^CfnApp$ResourceMappingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :eks-source-name)]
    (. builder eksSourceName data))
  (when-some [data (lookup-entry config id :logical-stack-name)]
    (. builder logicalStackName data))
  (when-some [data (lookup-entry config id :mapping-type)]
    (. builder mappingType data))
  (when-some [data (lookup-entry config id :physical-resource-id)]
    (. builder physicalResourceId data))
  (when-some [data (lookup-entry config id :resource-name)]
    (. builder resourceName data))
  (when-some [data (lookup-entry config id :terraform-source-name)]
    (. builder terraformSourceName data))
  (.build builder))


(defn cfn-app-resource-mapping-property-builder
  "Creates a  `CfnApp$ResourceMappingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-app-resource-mapping-property-builder (new CfnApp$ResourceMappingProperty$Builder) id config))


(defn build-cfn-resiliency-policy-builder
  "The build-cfn-resiliency-policy-builder function updates a CfnResiliencyPolicy$Builder instance using the provided configuration.
  The function takes the CfnResiliencyPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLocationConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-location-constraint` |
| `policy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy` |
| `policyDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-description` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |
"
  [^CfnResiliencyPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :data-location-constraint)]
    (. builder dataLocationConstraint data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :policy-description)]
    (. builder policyDescription data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tier)]
    (. builder tier data))
  (.build builder))


(defn cfn-resiliency-policy-builder
  "Creates a  `CfnResiliencyPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resiliency-policy-builder (CfnResiliencyPolicy$Builder/create scope (name id)) id config))


(defn build-cfn-resiliency-policy-failure-policy-property-builder
  "The build-cfn-resiliency-policy-failure-policy-property-builder function updates a CfnResiliencyPolicy$FailurePolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnResiliencyPolicy$FailurePolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rpoInSecs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rpo-in-secs` |
| `rtoInSecs` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rto-in-secs` |
"
  [^CfnResiliencyPolicy$FailurePolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :rpo-in-secs)]
    (. builder rpoInSecs data))
  (when-some [data (lookup-entry config id :rto-in-secs)]
    (. builder rtoInSecs data))
  (.build builder))


(defn cfn-resiliency-policy-failure-policy-property-builder
  "Creates a  `CfnResiliencyPolicy$FailurePolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resiliency-policy-failure-policy-property-builder (new CfnResiliencyPolicy$FailurePolicyProperty$Builder) id config))


(defn build-cfn-resiliency-policy-props-builder
  "The build-cfn-resiliency-policy-props-builder function updates a CfnResiliencyPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnResiliencyPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataLocationConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-location-constraint` |
| `policy` | java.util.Map | [[cdk.support/lookup-entry]] | `:policy` |
| `policyDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-description` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |
"
  [^CfnResiliencyPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :data-location-constraint)]
    (. builder dataLocationConstraint data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :policy-description)]
    (. builder policyDescription data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tier)]
    (. builder tier data))
  (.build builder))


(defn cfn-resiliency-policy-props-builder
  "Creates a  `CfnResiliencyPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resiliency-policy-props-builder (new CfnResiliencyPolicyProps$Builder) id config))