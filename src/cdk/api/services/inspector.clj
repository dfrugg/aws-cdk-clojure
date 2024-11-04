(ns cdk.api.services.inspector
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.inspector package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.inspector CfnAssessmentTarget$Builder
                                                      CfnAssessmentTargetProps$Builder
                                                      CfnAssessmentTemplate$Builder
                                                      CfnAssessmentTemplateProps$Builder
                                                      CfnResourceGroup$Builder
                                                      CfnResourceGroupProps$Builder]))


(defn cfn-assessment-target-builder
  "The cfn-assessment-target-builder function buildes out new instances of 
CfnAssessmentTarget$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assessmentTargetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-target-name` |
| `resourceGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-group-arn` |"
  [stack id config]
  (let [builder (CfnAssessmentTarget$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assessment-target-name)]
      (. builder assessmentTargetName data))
    (when-let [data (lookup-entry config id :resource-group-arn)]
      (. builder resourceGroupArn data))
    (.build builder)))


(defn cfn-assessment-target-props-builder
  "The cfn-assessment-target-props-builder function buildes out new instances of 
CfnAssessmentTargetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assessmentTargetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-target-name` |
| `resourceGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-group-arn` |"
  [stack id config]
  (let [builder (CfnAssessmentTargetProps$Builder.)]
    (when-let [data (lookup-entry config id :assessment-target-name)]
      (. builder assessmentTargetName data))
    (when-let [data (lookup-entry config id :resource-group-arn)]
      (. builder resourceGroupArn data))
    (.build builder)))


(defn cfn-assessment-template-builder
  "The cfn-assessment-template-builder function buildes out new instances of 
CfnAssessmentTemplate$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assessmentTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-target-arn` |
| `assessmentTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-template-name` |
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
| `rulesPackageArns` | java.util.List | [[cdk.support/lookup-entry]] | `:rules-package-arns` |
| `userAttributesForFindings` | java.util.List | [[cdk.support/lookup-entry]] | `:user-attributes-for-findings` |"
  [stack id config]
  (let [builder (CfnAssessmentTemplate$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assessment-target-arn)]
      (. builder assessmentTargetArn data))
    (when-let [data (lookup-entry config id :assessment-template-name)]
      (. builder assessmentTemplateName data))
    (when-let [data (lookup-entry config id :duration-in-seconds)]
      (. builder durationInSeconds data))
    (when-let [data (lookup-entry config id :rules-package-arns)]
      (. builder rulesPackageArns data))
    (when-let [data (lookup-entry config id :user-attributes-for-findings)]
      (. builder userAttributesForFindings data))
    (.build builder)))


(defn cfn-assessment-template-props-builder
  "The cfn-assessment-template-props-builder function buildes out new instances of 
CfnAssessmentTemplateProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assessmentTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-target-arn` |
| `assessmentTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-template-name` |
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
| `rulesPackageArns` | java.util.List | [[cdk.support/lookup-entry]] | `:rules-package-arns` |
| `userAttributesForFindings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-attributes-for-findings` |"
  [stack id config]
  (let [builder (CfnAssessmentTemplateProps$Builder.)]
    (when-let [data (lookup-entry config id :assessment-target-arn)]
      (. builder assessmentTargetArn data))
    (when-let [data (lookup-entry config id :assessment-template-name)]
      (. builder assessmentTemplateName data))
    (when-let [data (lookup-entry config id :duration-in-seconds)]
      (. builder durationInSeconds data))
    (when-let [data (lookup-entry config id :rules-package-arns)]
      (. builder rulesPackageArns data))
    (when-let [data (lookup-entry config id :user-attributes-for-findings)]
      (. builder userAttributesForFindings data))
    (.build builder)))


(defn cfn-resource-group-builder
  "The cfn-resource-group-builder function buildes out new instances of 
CfnResourceGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceGroupTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-group-tags` |"
  [stack id config]
  (let [builder (CfnResourceGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :resource-group-tags)]
      (. builder resourceGroupTags data))
    (.build builder)))


(defn cfn-resource-group-props-builder
  "The cfn-resource-group-props-builder function buildes out new instances of 
CfnResourceGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceGroupTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-group-tags` |"
  [stack id config]
  (let [builder (CfnResourceGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :resource-group-tags)]
      (. builder resourceGroupTags data))
    (.build builder)))