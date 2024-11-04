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


(defn cfn-assessment-assessment-reports-destination-property-builder
  "The cfn-assessment-assessment-reports-destination-property-builder function buildes out new instances of 
CfnAssessment$AssessmentReportsDestinationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `destinationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-type` |"
  [stack id config]
  (let [builder (CfnAssessment$AssessmentReportsDestinationProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination)]
      (. builder destination data))
    (when-let [data (lookup-entry config id :destination-type)]
      (. builder destinationType data))
    (.build builder)))


(defn cfn-assessment-aws-account-property-builder
  "The cfn-assessment-aws-account-property-builder function buildes out new instances of 
CfnAssessment$AWSAccountProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emailAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:email-address` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnAssessment$AWSAccountProperty$Builder.)]
    (when-let [data (lookup-entry config id :email-address)]
      (. builder emailAddress data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-assessment-aws-service-property-builder
  "The cfn-assessment-aws-service-property-builder function buildes out new instances of 
CfnAssessment$AWSServiceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (CfnAssessment$AWSServiceProperty$Builder.)]
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn cfn-assessment-builder
  "The cfn-assessment-builder function buildes out new instances of 
CfnAssessment$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAssessment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assessment-reports-destination)]
      (. builder assessmentReportsDestination data))
    (when-let [data (lookup-entry config id :aws-account)]
      (. builder awsAccount data))
    (when-let [data (lookup-entry config id :delegations)]
      (. builder delegations data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :framework-id)]
      (. builder frameworkId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-assessment-delegation-property-builder
  "The cfn-assessment-delegation-property-builder function buildes out new instances of 
CfnAssessment$DelegationProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnAssessment$DelegationProperty$Builder.)]
    (when-let [data (lookup-entry config id :assessment-id)]
      (. builder assessmentId data))
    (when-let [data (lookup-entry config id :assessment-name)]
      (. builder assessmentName data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :control-set-id)]
      (. builder controlSetId data))
    (when-let [data (lookup-entry config id :created-by)]
      (. builder createdBy data))
    (when-let [data (lookup-entry config id :creation-time)]
      (. builder creationTime data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :last-updated)]
      (. builder lastUpdated data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :role-type)]
      (. builder roleType data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-assessment-props-builder
  "The cfn-assessment-props-builder function buildes out new instances of 
CfnAssessmentProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAssessmentProps$Builder.)]
    (when-let [data (lookup-entry config id :assessment-reports-destination)]
      (. builder assessmentReportsDestination data))
    (when-let [data (lookup-entry config id :aws-account)]
      (. builder awsAccount data))
    (when-let [data (lookup-entry config id :delegations)]
      (. builder delegations data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :framework-id)]
      (. builder frameworkId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :roles)]
      (. builder roles data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-assessment-role-property-builder
  "The cfn-assessment-role-property-builder function buildes out new instances of 
CfnAssessment$RoleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `roleType` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-type` |"
  [stack id config]
  (let [builder (CfnAssessment$RoleProperty$Builder.)]
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :role-type)]
      (. builder roleType data))
    (.build builder)))


(defn cfn-assessment-scope-property-builder
  "The cfn-assessment-scope-property-builder function buildes out new instances of 
CfnAssessment$ScopeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsAccounts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-accounts` |
| `awsServices` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-services` |"
  [stack id config]
  (let [builder (CfnAssessment$ScopeProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-accounts)]
      (. builder awsAccounts data))
    (when-let [data (lookup-entry config id :aws-services)]
      (. builder awsServices data))
    (.build builder)))