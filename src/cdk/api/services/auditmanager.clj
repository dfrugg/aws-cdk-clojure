(ns cdk.api.services.auditmanager
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.auditmanager package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.auditmanager CfnAssessment$AWSAccountProperty$Builder
                                                         CfnAssessment$AWSServiceProperty$Builder
                                                         CfnAssessment$AssessmentReportsDestinationProperty$Builder
                                                         CfnAssessment$Builder
                                                         CfnAssessment$DelegationProperty$Builder
                                                         CfnAssessment$RoleProperty$Builder
                                                         CfnAssessment$ScopeProperty$Builder
                                                         CfnAssessmentProps$Builder]))


(defn build-cfn-assessment-assessment-reports-destination-property-builder
  "The build-cfn-assessment-assessment-reports-destination-property-builder function updates a CfnAssessment$AssessmentReportsDestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnAssessment$AssessmentReportsDestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `destinationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-type` |
"
  [^CfnAssessment$AssessmentReportsDestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-some [data (lookup-entry config id :destination-type)]
    (. builder destinationType data))
  (.build builder))


(defn cfn-assessment-assessment-reports-destination-property-builder
  "Creates a  `CfnAssessment$AssessmentReportsDestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-assessment-assessment-reports-destination-property-builder (new CfnAssessment$AssessmentReportsDestinationProperty$Builder) id config))


(defn build-cfn-assessment-aws-account-property-builder
  "The build-cfn-assessment-aws-account-property-builder function updates a CfnAssessment$AWSAccountProperty$Builder instance using the provided configuration.
  The function takes the CfnAssessment$AWSAccountProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emailAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-address` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnAssessment$AWSAccountProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :email-address)]
    (. builder emailAddress data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-assessment-aws-account-property-builder
  "Creates a  `CfnAssessment$AWSAccountProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-assessment-aws-account-property-builder (new CfnAssessment$AWSAccountProperty$Builder) id config))


(defn build-cfn-assessment-aws-service-property-builder
  "The build-cfn-assessment-aws-service-property-builder function updates a CfnAssessment$AWSServiceProperty$Builder instance using the provided configuration.
  The function takes the CfnAssessment$AWSServiceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^CfnAssessment$AWSServiceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn cfn-assessment-aws-service-property-builder
  "Creates a  `CfnAssessment$AWSServiceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-assessment-aws-service-property-builder (new CfnAssessment$AWSServiceProperty$Builder) id config))


(defn build-cfn-assessment-builder
  "The build-cfn-assessment-builder function updates a CfnAssessment$Builder instance using the provided configuration.
  The function takes the CfnAssessment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assessmentReportsDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:assessment-reports-destination` |
| `awsAccount` | software.amazon.awscdk.services.auditmanager.CfnAssessment$AWSAccountProperty | [[cdk.support/lookup-entry]] | `:aws-account` |
| `delegations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delegations` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `frameworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roles` | java.util.List | [[cdk.support/lookup-entry]] | `:roles` |
| `scope` | software.amazon.awscdk.services.auditmanager.CfnAssessment$ScopeProperty | [[cdk.support/lookup-entry]] | `:scope` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAssessment$Builder builder id config]
  (when-some [data (lookup-entry config id :assessment-reports-destination)]
    (. builder assessmentReportsDestination data))
  (when-some [data (lookup-entry config id :aws-account)]
    (. builder awsAccount data))
  (when-some [data (lookup-entry config id :delegations)]
    (. builder delegations data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :framework-id)]
    (. builder frameworkId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-assessment-builder
  "Creates a  `CfnAssessment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-assessment-builder (CfnAssessment$Builder/create scope (name id)) id config))


(defn build-cfn-assessment-delegation-property-builder
  "The build-cfn-assessment-delegation-property-builder function updates a CfnAssessment$DelegationProperty$Builder instance using the provided configuration.
  The function takes the CfnAssessment$DelegationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assessmentId` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-id` |
| `assessmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-name` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `controlSetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-set-id` |
| `createdBy` | java.lang.String | [[cdk.support/lookup-entry]] | `:created-by` |
| `creationTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:creation-time` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `lastUpdated` | java.lang.Number | [[cdk.support/lookup-entry]] | `:last-updated` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `roleType` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-type` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnAssessment$DelegationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :assessment-id)]
    (. builder assessmentId data))
  (when-some [data (lookup-entry config id :assessment-name)]
    (. builder assessmentName data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :control-set-id)]
    (. builder controlSetId data))
  (when-some [data (lookup-entry config id :created-by)]
    (. builder createdBy data))
  (when-some [data (lookup-entry config id :creation-time)]
    (. builder creationTime data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :last-updated)]
    (. builder lastUpdated data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :role-type)]
    (. builder roleType data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-assessment-delegation-property-builder
  "Creates a  `CfnAssessment$DelegationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-assessment-delegation-property-builder (new CfnAssessment$DelegationProperty$Builder) id config))


(defn build-cfn-assessment-props-builder
  "The build-cfn-assessment-props-builder function updates a CfnAssessmentProps$Builder instance using the provided configuration.
  The function takes the CfnAssessmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assessmentReportsDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:assessment-reports-destination` |
| `awsAccount` | software.amazon.awscdk.services.auditmanager.CfnAssessment$AWSAccountProperty | [[cdk.support/lookup-entry]] | `:aws-account` |
| `delegations` | java.util.List | [[cdk.support/lookup-entry]] | `:delegations` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `frameworkId` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `roles` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:roles` |
| `scope` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scope` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAssessmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assessment-reports-destination)]
    (. builder assessmentReportsDestination data))
  (when-some [data (lookup-entry config id :aws-account)]
    (. builder awsAccount data))
  (when-some [data (lookup-entry config id :delegations)]
    (. builder delegations data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :framework-id)]
    (. builder frameworkId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :roles)]
    (. builder roles data))
  (when-some [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-assessment-props-builder
  "Creates a  `CfnAssessmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-assessment-props-builder (new CfnAssessmentProps$Builder) id config))


(defn build-cfn-assessment-role-property-builder
  "The build-cfn-assessment-role-property-builder function updates a CfnAssessment$RoleProperty$Builder instance using the provided configuration.
  The function takes the CfnAssessment$RoleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `roleType` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-type` |
"
  [^CfnAssessment$RoleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :role-type)]
    (. builder roleType data))
  (.build builder))


(defn cfn-assessment-role-property-builder
  "Creates a  `CfnAssessment$RoleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-assessment-role-property-builder (new CfnAssessment$RoleProperty$Builder) id config))


(defn build-cfn-assessment-scope-property-builder
  "The build-cfn-assessment-scope-property-builder function updates a CfnAssessment$ScopeProperty$Builder instance using the provided configuration.
  The function takes the CfnAssessment$ScopeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccounts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-accounts` |
| `awsServices` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-services` |
"
  [^CfnAssessment$ScopeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aws-accounts)]
    (. builder awsAccounts data))
  (when-some [data (lookup-entry config id :aws-services)]
    (. builder awsServices data))
  (.build builder))


(defn cfn-assessment-scope-property-builder
  "Creates a  `CfnAssessment$ScopeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-assessment-scope-property-builder (new CfnAssessment$ScopeProperty$Builder) id config))