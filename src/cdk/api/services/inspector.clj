(ns cdk.api.services.inspector
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.inspector package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.inspector CfnAssessmentTarget$Builder
                                                      CfnAssessmentTargetProps$Builder
                                                      CfnAssessmentTemplate$Builder
                                                      CfnAssessmentTemplateProps$Builder
                                                      CfnResourceGroup$Builder
                                                      CfnResourceGroupProps$Builder]))


(defn cfn-assessment-target-builder>
  "The cfn-assessment-target-builder> function updates a CfnAssessmentTarget$Builder instance using the provided configuration.
  The function takes the CfnAssessmentTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assessmentTargetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-target-name` |
| `resourceGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-group-arn` |
"
  [^CfnAssessmentTarget$Builder builder id config]
  (when-some [data (lookup-entry config id :assessment-target-name)]
    (. builder assessmentTargetName data))
  (when-some [data (lookup-entry config id :resource-group-arn)]
    (. builder resourceGroupArn data))
  (.build builder))


(defn cfn-assessment-target-builder
  "Creates a  `CfnAssessmentTarget$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-assessment-target-builder> (CfnAssessmentTarget$Builder/create scope (name id)) id config))


(defn cfn-assessment-target-props-builder>
  "The cfn-assessment-target-props-builder> function updates a CfnAssessmentTargetProps$Builder instance using the provided configuration.
  The function takes the CfnAssessmentTargetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assessmentTargetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-target-name` |
| `resourceGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-group-arn` |
"
  [^CfnAssessmentTargetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assessment-target-name)]
    (. builder assessmentTargetName data))
  (when-some [data (lookup-entry config id :resource-group-arn)]
    (. builder resourceGroupArn data))
  (.build builder))


(defn cfn-assessment-target-props-builder
  "Creates a  `CfnAssessmentTargetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-assessment-target-props-builder> (new CfnAssessmentTargetProps$Builder) id config))


(defn cfn-assessment-template-builder>
  "The cfn-assessment-template-builder> function updates a CfnAssessmentTemplate$Builder instance using the provided configuration.
  The function takes the CfnAssessmentTemplate$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assessmentTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-target-arn` |
| `assessmentTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-template-name` |
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
| `rulesPackageArns` | java.util.List | [[cdk.support/lookup-entry]] | `:rules-package-arns` |
| `userAttributesForFindings` | java.util.List | [[cdk.support/lookup-entry]] | `:user-attributes-for-findings` |
"
  [^CfnAssessmentTemplate$Builder builder id config]
  (when-some [data (lookup-entry config id :assessment-target-arn)]
    (. builder assessmentTargetArn data))
  (when-some [data (lookup-entry config id :assessment-template-name)]
    (. builder assessmentTemplateName data))
  (when-some [data (lookup-entry config id :duration-in-seconds)]
    (. builder durationInSeconds data))
  (when-some [data (lookup-entry config id :rules-package-arns)]
    (. builder rulesPackageArns data))
  (when-some [data (lookup-entry config id :user-attributes-for-findings)]
    (. builder userAttributesForFindings data))
  (.build builder))


(defn cfn-assessment-template-builder
  "Creates a  `CfnAssessmentTemplate$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-assessment-template-builder> (CfnAssessmentTemplate$Builder/create scope (name id)) id config))


(defn cfn-assessment-template-props-builder>
  "The cfn-assessment-template-props-builder> function updates a CfnAssessmentTemplateProps$Builder instance using the provided configuration.
  The function takes the CfnAssessmentTemplateProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assessmentTargetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-target-arn` |
| `assessmentTemplateName` | java.lang.String | [[cdk.support/lookup-entry]] | `:assessment-template-name` |
| `durationInSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration-in-seconds` |
| `rulesPackageArns` | java.util.List | [[cdk.support/lookup-entry]] | `:rules-package-arns` |
| `userAttributesForFindings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user-attributes-for-findings` |
"
  [^CfnAssessmentTemplateProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assessment-target-arn)]
    (. builder assessmentTargetArn data))
  (when-some [data (lookup-entry config id :assessment-template-name)]
    (. builder assessmentTemplateName data))
  (when-some [data (lookup-entry config id :duration-in-seconds)]
    (. builder durationInSeconds data))
  (when-some [data (lookup-entry config id :rules-package-arns)]
    (. builder rulesPackageArns data))
  (when-some [data (lookup-entry config id :user-attributes-for-findings)]
    (. builder userAttributesForFindings data))
  (.build builder))


(defn cfn-assessment-template-props-builder
  "Creates a  `CfnAssessmentTemplateProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-assessment-template-props-builder> (new CfnAssessmentTemplateProps$Builder) id config))


(defn cfn-resource-group-builder>
  "The cfn-resource-group-builder> function updates a CfnResourceGroup$Builder instance using the provided configuration.
  The function takes the CfnResourceGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceGroupTags` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-group-tags` |
"
  [^CfnResourceGroup$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-group-tags)]
    (. builder resourceGroupTags data))
  (.build builder))


(defn cfn-resource-group-builder
  "Creates a  `CfnResourceGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-group-builder> (CfnResourceGroup$Builder/create scope (name id)) id config))


(defn cfn-resource-group-props-builder>
  "The cfn-resource-group-props-builder> function updates a CfnResourceGroupProps$Builder instance using the provided configuration.
  The function takes the CfnResourceGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceGroupTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-group-tags` |
"
  [^CfnResourceGroupProps$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-group-tags)]
    (. builder resourceGroupTags data))
  (.build builder))


(defn cfn-resource-group-props-builder
  "Creates a  `CfnResourceGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-resource-group-props-builder> (new CfnResourceGroupProps$Builder) id config))