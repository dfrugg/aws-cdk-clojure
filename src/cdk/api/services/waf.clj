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


(defn cfn-byte-match-set-builder>
  "The cfn-byte-match-set-builder> function updates a CfnByteMatchSet$Builder instance using the provided configuration.
  The function takes the CfnByteMatchSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `byteMatchTuples` | java.util.List | [[cdk.support/lookup-entry]] | `:byte-match-tuples` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnByteMatchSet$Builder builder id config]
  (when-some [data (lookup-entry config id :byte-match-tuples)]
    (. builder byteMatchTuples data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-byte-match-set-builder
  "Creates a  `CfnByteMatchSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-byte-match-set-builder> (CfnByteMatchSet$Builder/create scope (name id)) id config))


(defn cfn-byte-match-set-byte-match-tuple-property-builder>
  "The cfn-byte-match-set-byte-match-tuple-property-builder> function updates a CfnByteMatchSet$ByteMatchTupleProperty$Builder instance using the provided configuration.
  The function takes the CfnByteMatchSet$ByteMatchTupleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `positionalConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:positional-constraint` |
| `targetString` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-string` |
| `targetStringBase64` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-string-base64` |
| `textTransformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-transformation` |
"
  [^CfnByteMatchSet$ByteMatchTupleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-some [data (lookup-entry config id :positional-constraint)]
    (. builder positionalConstraint data))
  (when-some [data (lookup-entry config id :target-string)]
    (. builder targetString data))
  (when-some [data (lookup-entry config id :target-string-base64)]
    (. builder targetStringBase64 data))
  (when-some [data (lookup-entry config id :text-transformation)]
    (. builder textTransformation data))
  (.build builder))


(defn cfn-byte-match-set-byte-match-tuple-property-builder
  "Creates a  `CfnByteMatchSet$ByteMatchTupleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-byte-match-set-byte-match-tuple-property-builder> (new CfnByteMatchSet$ByteMatchTupleProperty$Builder) id config))


(defn cfn-byte-match-set-field-to-match-property-builder>
  "The cfn-byte-match-set-field-to-match-property-builder> function updates a CfnByteMatchSet$FieldToMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnByteMatchSet$FieldToMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnByteMatchSet$FieldToMatchProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-byte-match-set-field-to-match-property-builder
  "Creates a  `CfnByteMatchSet$FieldToMatchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-byte-match-set-field-to-match-property-builder> (new CfnByteMatchSet$FieldToMatchProperty$Builder) id config))


(defn cfn-byte-match-set-props-builder>
  "The cfn-byte-match-set-props-builder> function updates a CfnByteMatchSetProps$Builder instance using the provided configuration.
  The function takes the CfnByteMatchSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `byteMatchTuples` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:byte-match-tuples` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnByteMatchSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :byte-match-tuples)]
    (. builder byteMatchTuples data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-byte-match-set-props-builder
  "Creates a  `CfnByteMatchSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-byte-match-set-props-builder> (new CfnByteMatchSetProps$Builder) id config))


(defn cfn-ip-set-builder>
  "The cfn-ip-set-builder> function updates a CfnIPSet$Builder instance using the provided configuration.
  The function takes the CfnIPSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipSetDescriptors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-descriptors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnIPSet$Builder builder id config]
  (when-some [data (lookup-entry config id :ip-set-descriptors)]
    (. builder ipSetDescriptors data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-ip-set-builder
  "Creates a  `CfnIPSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-ip-set-builder> (CfnIPSet$Builder/create scope (name id)) id config))


(defn cfn-ip-set-ip-set-descriptor-property-builder>
  "The cfn-ip-set-ip-set-descriptor-property-builder> function updates a CfnIPSet$IPSetDescriptorProperty$Builder instance using the provided configuration.
  The function takes the CfnIPSet$IPSetDescriptorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnIPSet$IPSetDescriptorProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-ip-set-ip-set-descriptor-property-builder
  "Creates a  `CfnIPSet$IPSetDescriptorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ip-set-ip-set-descriptor-property-builder> (new CfnIPSet$IPSetDescriptorProperty$Builder) id config))


(defn cfn-ip-set-props-builder>
  "The cfn-ip-set-props-builder> function updates a CfnIPSetProps$Builder instance using the provided configuration.
  The function takes the CfnIPSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipSetDescriptors` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-descriptors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnIPSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :ip-set-descriptors)]
    (. builder ipSetDescriptors data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-ip-set-props-builder
  "Creates a  `CfnIPSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-ip-set-props-builder> (new CfnIPSetProps$Builder) id config))


(defn cfn-rule-builder>
  "The cfn-rule-builder> function updates a CfnRule$Builder instance using the provided configuration.
  The function takes the CfnRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `predicates` | java.util.List | [[cdk.support/lookup-entry]] | `:predicates` |
"
  [^CfnRule$Builder builder id config]
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :predicates)]
    (. builder predicates data))
  (.build builder))


(defn cfn-rule-builder
  "Creates a  `CfnRule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-rule-builder> (CfnRule$Builder/create scope (name id)) id config))


(defn cfn-rule-predicate-property-builder>
  "The cfn-rule-predicate-property-builder> function updates a CfnRule$PredicateProperty$Builder instance using the provided configuration.
  The function takes the CfnRule$PredicateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataId` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-id` |
| `negated` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:negated` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnRule$PredicateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-id)]
    (. builder dataId data))
  (when-some [data (lookup-entry config id :negated)]
    (. builder negated data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-rule-predicate-property-builder
  "Creates a  `CfnRule$PredicateProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-predicate-property-builder> (new CfnRule$PredicateProperty$Builder) id config))


(defn cfn-rule-props-builder>
  "The cfn-rule-props-builder> function updates a CfnRuleProps$Builder instance using the provided configuration.
  The function takes the CfnRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `predicates` | java.util.List | [[cdk.support/lookup-entry]] | `:predicates` |
"
  [^CfnRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :predicates)]
    (. builder predicates data))
  (.build builder))


(defn cfn-rule-props-builder
  "Creates a  `CfnRuleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rule-props-builder> (new CfnRuleProps$Builder) id config))


(defn cfn-size-constraint-set-builder>
  "The cfn-size-constraint-set-builder> function updates a CfnSizeConstraintSet$Builder instance using the provided configuration.
  The function takes the CfnSizeConstraintSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sizeConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:size-constraints` |
"
  [^CfnSizeConstraintSet$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :size-constraints)]
    (. builder sizeConstraints data))
  (.build builder))


(defn cfn-size-constraint-set-builder
  "Creates a  `CfnSizeConstraintSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-size-constraint-set-builder> (CfnSizeConstraintSet$Builder/create scope (name id)) id config))


(defn cfn-size-constraint-set-field-to-match-property-builder>
  "The cfn-size-constraint-set-field-to-match-property-builder> function updates a CfnSizeConstraintSet$FieldToMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnSizeConstraintSet$FieldToMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSizeConstraintSet$FieldToMatchProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-size-constraint-set-field-to-match-property-builder
  "Creates a  `CfnSizeConstraintSet$FieldToMatchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-size-constraint-set-field-to-match-property-builder> (new CfnSizeConstraintSet$FieldToMatchProperty$Builder) id config))


(defn cfn-size-constraint-set-props-builder>
  "The cfn-size-constraint-set-props-builder> function updates a CfnSizeConstraintSetProps$Builder instance using the provided configuration.
  The function takes the CfnSizeConstraintSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sizeConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:size-constraints` |
"
  [^CfnSizeConstraintSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :size-constraints)]
    (. builder sizeConstraints data))
  (.build builder))


(defn cfn-size-constraint-set-props-builder
  "Creates a  `CfnSizeConstraintSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-size-constraint-set-props-builder> (new CfnSizeConstraintSetProps$Builder) id config))


(defn cfn-size-constraint-set-size-constraint-property-builder>
  "The cfn-size-constraint-set-size-constraint-property-builder> function updates a CfnSizeConstraintSet$SizeConstraintProperty$Builder instance using the provided configuration.
  The function takes the CfnSizeConstraintSet$SizeConstraintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `textTransformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-transformation` |
"
  [^CfnSizeConstraintSet$SizeConstraintProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-some [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-some [data (lookup-entry config id :size)]
    (. builder size data))
  (when-some [data (lookup-entry config id :text-transformation)]
    (. builder textTransformation data))
  (.build builder))


(defn cfn-size-constraint-set-size-constraint-property-builder
  "Creates a  `CfnSizeConstraintSet$SizeConstraintProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-size-constraint-set-size-constraint-property-builder> (new CfnSizeConstraintSet$SizeConstraintProperty$Builder) id config))


(defn cfn-sql-injection-match-set-builder>
  "The cfn-sql-injection-match-set-builder> function updates a CfnSqlInjectionMatchSet$Builder instance using the provided configuration.
  The function takes the CfnSqlInjectionMatchSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sqlInjectionMatchTuples` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sql-injection-match-tuples` |
"
  [^CfnSqlInjectionMatchSet$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sql-injection-match-tuples)]
    (. builder sqlInjectionMatchTuples data))
  (.build builder))


(defn cfn-sql-injection-match-set-builder
  "Creates a  `CfnSqlInjectionMatchSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-sql-injection-match-set-builder> (CfnSqlInjectionMatchSet$Builder/create scope (name id)) id config))


(defn cfn-sql-injection-match-set-field-to-match-property-builder>
  "The cfn-sql-injection-match-set-field-to-match-property-builder> function updates a CfnSqlInjectionMatchSet$FieldToMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnSqlInjectionMatchSet$FieldToMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSqlInjectionMatchSet$FieldToMatchProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-sql-injection-match-set-field-to-match-property-builder
  "Creates a  `CfnSqlInjectionMatchSet$FieldToMatchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-sql-injection-match-set-field-to-match-property-builder> (new CfnSqlInjectionMatchSet$FieldToMatchProperty$Builder) id config))


(defn cfn-sql-injection-match-set-props-builder>
  "The cfn-sql-injection-match-set-props-builder> function updates a CfnSqlInjectionMatchSetProps$Builder instance using the provided configuration.
  The function takes the CfnSqlInjectionMatchSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `sqlInjectionMatchTuples` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sql-injection-match-tuples` |
"
  [^CfnSqlInjectionMatchSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :sql-injection-match-tuples)]
    (. builder sqlInjectionMatchTuples data))
  (.build builder))


(defn cfn-sql-injection-match-set-props-builder
  "Creates a  `CfnSqlInjectionMatchSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-sql-injection-match-set-props-builder> (new CfnSqlInjectionMatchSetProps$Builder) id config))


(defn cfn-sql-injection-match-set-sql-injection-match-tuple-property-builder>
  "The cfn-sql-injection-match-set-sql-injection-match-tuple-property-builder> function updates a CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder instance using the provided configuration.
  The function takes the CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSet$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-transformation` |
"
  [^CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-some [data (lookup-entry config id :text-transformation)]
    (. builder textTransformation data))
  (.build builder))


(defn cfn-sql-injection-match-set-sql-injection-match-tuple-property-builder
  "Creates a  `CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-sql-injection-match-set-sql-injection-match-tuple-property-builder> (new CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder) id config))


(defn cfn-web-acl-activated-rule-property-builder>
  "The cfn-web-acl-activated-rule-property-builder> function updates a CfnWebACL$ActivatedRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ActivatedRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `ruleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-id` |
"
  [^CfnWebACL$ActivatedRuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :rule-id)]
    (. builder ruleId data))
  (.build builder))


(defn cfn-web-acl-activated-rule-property-builder
  "Creates a  `CfnWebACL$ActivatedRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-web-acl-activated-rule-property-builder> (new CfnWebACL$ActivatedRuleProperty$Builder) id config))


(defn cfn-web-acl-builder>
  "The cfn-web-acl-builder> function updates a CfnWebACL$Builder instance using the provided configuration.
  The function takes the CfnWebACL$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-action` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnWebACL$Builder builder id config]
  (when-some [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn cfn-web-acl-builder
  "Creates a  `CfnWebACL$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-web-acl-builder> (CfnWebACL$Builder/create scope (name id)) id config))


(defn cfn-web-acl-props-builder>
  "The cfn-web-acl-props-builder> function updates a CfnWebACLProps$Builder instance using the provided configuration.
  The function takes the CfnWebACLProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-action` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
"
  [^CfnWebACLProps$Builder builder id config]
  (when-some [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rules)]
    (. builder rules data))
  (.build builder))


(defn cfn-web-acl-props-builder
  "Creates a  `CfnWebACLProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-web-acl-props-builder> (new CfnWebACLProps$Builder) id config))


(defn cfn-web-acl-waf-action-property-builder>
  "The cfn-web-acl-waf-action-property-builder> function updates a CfnWebACL$WafActionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$WafActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnWebACL$WafActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-web-acl-waf-action-property-builder
  "Creates a  `CfnWebACL$WafActionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-web-acl-waf-action-property-builder> (new CfnWebACL$WafActionProperty$Builder) id config))


(defn cfn-xss-match-set-builder>
  "The cfn-xss-match-set-builder> function updates a CfnXssMatchSet$Builder instance using the provided configuration.
  The function takes the CfnXssMatchSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `xssMatchTuples` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:xss-match-tuples` |
"
  [^CfnXssMatchSet$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :xss-match-tuples)]
    (. builder xssMatchTuples data))
  (.build builder))


(defn cfn-xss-match-set-builder
  "Creates a  `CfnXssMatchSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-xss-match-set-builder> (CfnXssMatchSet$Builder/create scope (name id)) id config))


(defn cfn-xss-match-set-field-to-match-property-builder>
  "The cfn-xss-match-set-field-to-match-property-builder> function updates a CfnXssMatchSet$FieldToMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnXssMatchSet$FieldToMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `data` | java.lang.String | [[cdk.support/lookup-entry]] | `:data` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnXssMatchSet$FieldToMatchProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data)]
    (. builder data data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-xss-match-set-field-to-match-property-builder
  "Creates a  `CfnXssMatchSet$FieldToMatchProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-xss-match-set-field-to-match-property-builder> (new CfnXssMatchSet$FieldToMatchProperty$Builder) id config))


(defn cfn-xss-match-set-props-builder>
  "The cfn-xss-match-set-props-builder> function updates a CfnXssMatchSetProps$Builder instance using the provided configuration.
  The function takes the CfnXssMatchSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `xssMatchTuples` | java.util.List | [[cdk.support/lookup-entry]] | `:xss-match-tuples` |
"
  [^CfnXssMatchSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :xss-match-tuples)]
    (. builder xssMatchTuples data))
  (.build builder))


(defn cfn-xss-match-set-props-builder
  "Creates a  `CfnXssMatchSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-xss-match-set-props-builder> (new CfnXssMatchSetProps$Builder) id config))


(defn cfn-xss-match-set-xss-match-tuple-property-builder>
  "The cfn-xss-match-set-xss-match-tuple-property-builder> function updates a CfnXssMatchSet$XssMatchTupleProperty$Builder instance using the provided configuration.
  The function takes the CfnXssMatchSet$XssMatchTupleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-transformation` |
"
  [^CfnXssMatchSet$XssMatchTupleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-some [data (lookup-entry config id :text-transformation)]
    (. builder textTransformation data))
  (.build builder))


(defn cfn-xss-match-set-xss-match-tuple-property-builder
  "Creates a  `CfnXssMatchSet$XssMatchTupleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-xss-match-set-xss-match-tuple-property-builder> (new CfnXssMatchSet$XssMatchTupleProperty$Builder) id config))