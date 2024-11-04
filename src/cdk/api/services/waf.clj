(ns cdk.api.services.waf
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.waf package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.waf CfnByteMatchSet$Builder
                                                CfnByteMatchSet$ByteMatchTupleProperty$Builder
                                                CfnByteMatchSet$FieldToMatchProperty$Builder
                                                CfnByteMatchSetProps$Builder
                                                CfnIPSet$Builder
                                                CfnIPSet$IPSetDescriptorProperty$Builder
                                                CfnIPSetProps$Builder
                                                CfnRule$Builder
                                                CfnRule$PredicateProperty$Builder
                                                CfnRuleProps$Builder
                                                CfnSizeConstraintSet$Builder
                                                CfnSizeConstraintSet$FieldToMatchProperty$Builder
                                                CfnSizeConstraintSet$SizeConstraintProperty$Builder
                                                CfnSizeConstraintSetProps$Builder
                                                CfnSqlInjectionMatchSet$Builder
                                                CfnSqlInjectionMatchSet$FieldToMatchProperty$Builder
                                                CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder
                                                CfnSqlInjectionMatchSetProps$Builder
                                                CfnWebACL$ActivatedRuleProperty$Builder
                                                CfnWebACL$Builder
                                                CfnWebACL$WafActionProperty$Builder
                                                CfnWebACLProps$Builder
                                                CfnXssMatchSet$Builder
                                                CfnXssMatchSet$FieldToMatchProperty$Builder
                                                CfnXssMatchSet$XssMatchTupleProperty$Builder
                                                CfnXssMatchSetProps$Builder]))


(defn cfn-byte-match-set-builder
  "The cfn-byte-match-set-builder function buildes out new instances of 
CfnByteMatchSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `byteMatchTuples` | java.util.List | [[cdk.support/lookup-entry]] | `:byte-match-tuples` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnByteMatchSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :byte-match-tuples)]
      (. builder byteMatchTuples data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-byte-match-set-byte-match-tuple-property-builder
  "The cfn-byte-match-set-byte-match-tuple-property-builder function buildes out new instances of 
CfnByteMatchSet$ByteMatchTupleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `positionalConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:positional-constraint` |
| `targetString` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-string` |
| `targetStringBase64` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-string-base64` |
| `textTransformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-transformation` |"
  [stack id config]
  (let [builder (CfnByteMatchSet$ByteMatchTupleProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :positional-constraint)]
      (. builder positionalConstraint data))
    (when-let [data (lookup-entry config id :target-string)]
      (. builder targetString data))
    (when-let [data (lookup-entry config id :target-string-base64)]
      (. builder targetStringBase64 data))
    (when-let [data (lookup-entry config id :text-transformation)]
      (. builder textTransformation data))
    (.build builder)))


(defn cfn-byte-match-set-field-to-match-property-builder
  "The cfn-byte-match-set-field-to-match-property-builder function buildes out new instances of 
CfnByteMatchSet$FieldToMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnByteMatchSet$FieldToMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-byte-match-set-props-builder
  "The cfn-byte-match-set-props-builder function buildes out new instances of 
CfnByteMatchSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `byteMatchTuples` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:byte-match-tuples` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnByteMatchSetProps$Builder.)]
    (when-let [data (lookup-entry config id :byte-match-tuples)]
      (. builder byteMatchTuples data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-ip-set-builder
  "The cfn-ip-set-builder function buildes out new instances of 
CfnIPSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipSetDescriptors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-descriptors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnIPSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :ip-set-descriptors)]
      (. builder ipSetDescriptors data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-ip-set-ip-set-descriptor-property-builder
  "The cfn-ip-set-ip-set-descriptor-property-builder function buildes out new instances of 
CfnIPSet$IPSetDescriptorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnIPSet$IPSetDescriptorProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-ip-set-props-builder
  "The cfn-ip-set-props-builder function buildes out new instances of 
CfnIPSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipSetDescriptors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-descriptors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnIPSetProps$Builder.)]
    (when-let [data (lookup-entry config id :ip-set-descriptors)]
      (. builder ipSetDescriptors data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-rule-builder
  "The cfn-rule-builder function buildes out new instances of 
CfnRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `predicates` | java.util.List | [[cdk.support/lookup-entry]] | `:predicates` |"
  [stack id config]
  (let [builder (CfnRule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :predicates)]
      (. builder predicates data))
    (.build builder)))


(defn cfn-rule-predicate-property-builder
  "The cfn-rule-predicate-property-builder function buildes out new instances of 
CfnRule$PredicateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataId` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-id` |
| `negated` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:negated` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnRule$PredicateProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-id)]
      (. builder dataId data))
    (when-let [data (lookup-entry config id :negated)]
      (. builder negated data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-rule-props-builder
  "The cfn-rule-props-builder function buildes out new instances of 
CfnRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `predicates` | java.util.List | [[cdk.support/lookup-entry]] | `:predicates` |"
  [stack id config]
  (let [builder (CfnRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :predicates)]
      (. builder predicates data))
    (.build builder)))


(defn cfn-size-constraint-set-builder
  "The cfn-size-constraint-set-builder function buildes out new instances of 
CfnSizeConstraintSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sizeConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:size-constraints` |"
  [stack id config]
  (let [builder (CfnSizeConstraintSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :size-constraints)]
      (. builder sizeConstraints data))
    (.build builder)))


(defn cfn-size-constraint-set-field-to-match-property-builder
  "The cfn-size-constraint-set-field-to-match-property-builder function buildes out new instances of 
CfnSizeConstraintSet$FieldToMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSizeConstraintSet$FieldToMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-size-constraint-set-props-builder
  "The cfn-size-constraint-set-props-builder function buildes out new instances of 
CfnSizeConstraintSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sizeConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:size-constraints` |"
  [stack id config]
  (let [builder (CfnSizeConstraintSetProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :size-constraints)]
      (. builder sizeConstraints data))
    (.build builder)))


(defn cfn-size-constraint-set-size-constraint-property-builder
  "The cfn-size-constraint-set-size-constraint-property-builder function buildes out new instances of 
CfnSizeConstraintSet$SizeConstraintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `textTransformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-transformation` |"
  [stack id config]
  (let [builder (CfnSizeConstraintSet$SizeConstraintProperty$Builder.)]
    (when-let [data (lookup-entry config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :text-transformation)]
      (. builder textTransformation data))
    (.build builder)))


(defn cfn-sql-injection-match-set-builder
  "The cfn-sql-injection-match-set-builder function buildes out new instances of 
CfnSqlInjectionMatchSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sqlInjectionMatchTuples` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sql-injection-match-tuples` |"
  [stack id config]
  (let [builder (CfnSqlInjectionMatchSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sql-injection-match-tuples)]
      (. builder sqlInjectionMatchTuples data))
    (.build builder)))


(defn cfn-sql-injection-match-set-field-to-match-property-builder
  "The cfn-sql-injection-match-set-field-to-match-property-builder function buildes out new instances of 
CfnSqlInjectionMatchSet$FieldToMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnSqlInjectionMatchSet$FieldToMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-sql-injection-match-set-props-builder
  "The cfn-sql-injection-match-set-props-builder function buildes out new instances of 
CfnSqlInjectionMatchSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sqlInjectionMatchTuples` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sql-injection-match-tuples` |"
  [stack id config]
  (let [builder (CfnSqlInjectionMatchSetProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :sql-injection-match-tuples)]
      (. builder sqlInjectionMatchTuples data))
    (.build builder)))


(defn cfn-sql-injection-match-set-sql-injection-match-tuple-property-builder
  "The cfn-sql-injection-match-set-sql-injection-match-tuple-property-builder function buildes out new instances of 
CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-transformation` |"
  [stack id config]
  (let [builder (CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :text-transformation)]
      (. builder textTransformation data))
    (.build builder)))


(defn cfn-web-acl-activated-rule-property-builder
  "The cfn-web-acl-activated-rule-property-builder function buildes out new instances of 
CfnWebACL$ActivatedRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `ruleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-id` |"
  [stack id config]
  (let [builder (CfnWebACL$ActivatedRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :rule-id)]
      (. builder ruleId data))
    (.build builder)))


(defn cfn-web-acl-builder
  "The cfn-web-acl-builder function buildes out new instances of 
CfnWebACL$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-action` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (CfnWebACL$Builder/create stack id)]
    (when-let [data (lookup-entry config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (.build builder)))


(defn cfn-web-acl-props-builder
  "The cfn-web-acl-props-builder function buildes out new instances of 
CfnWebACLProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-action` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |"
  [stack id config]
  (let [builder (CfnWebACLProps$Builder.)]
    (when-let [data (lookup-entry config id :default-action)]
      (. builder defaultAction data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rules)]
      (. builder rules data))
    (.build builder)))


(defn cfn-web-acl-waf-action-property-builder
  "The cfn-web-acl-waf-action-property-builder function buildes out new instances of 
CfnWebACL$WafActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnWebACL$WafActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-xss-match-set-builder
  "The cfn-xss-match-set-builder function buildes out new instances of 
CfnXssMatchSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `xssMatchTuples` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:xss-match-tuples` |"
  [stack id config]
  (let [builder (CfnXssMatchSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :xss-match-tuples)]
      (. builder xssMatchTuples data))
    (.build builder)))


(defn cfn-xss-match-set-field-to-match-property-builder
  "The cfn-xss-match-set-field-to-match-property-builder function buildes out new instances of 
CfnXssMatchSet$FieldToMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnXssMatchSet$FieldToMatchProperty$Builder.)]
    (when-let [data (lookup-entry config id :data)]
      (. builder data data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-xss-match-set-props-builder
  "The cfn-xss-match-set-props-builder function buildes out new instances of 
CfnXssMatchSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `xssMatchTuples` | java.util.List | [[cdk.support/lookup-entry]] | `:xss-match-tuples` |"
  [stack id config]
  (let [builder (CfnXssMatchSetProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :xss-match-tuples)]
      (. builder xssMatchTuples data))
    (.build builder)))


(defn cfn-xss-match-set-xss-match-tuple-property-builder
  "The cfn-xss-match-set-xss-match-tuple-property-builder function buildes out new instances of 
CfnXssMatchSet$XssMatchTupleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-transformation` |"
  [stack id config]
  (let [builder (CfnXssMatchSet$XssMatchTupleProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :text-transformation)]
      (. builder textTransformation data))
    (.build builder)))