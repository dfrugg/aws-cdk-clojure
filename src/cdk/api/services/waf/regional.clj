(ns cdk.api.services.waf.regional
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.waf.regional package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.waf.regional CfnByteMatchSet$Builder
                                                         CfnByteMatchSet$ByteMatchTupleProperty$Builder
                                                         CfnByteMatchSet$FieldToMatchProperty$Builder
                                                         CfnByteMatchSetProps$Builder
                                                         CfnGeoMatchSet$Builder
                                                         CfnGeoMatchSet$GeoMatchConstraintProperty$Builder
                                                         CfnGeoMatchSetProps$Builder
                                                         CfnIPSet$Builder
                                                         CfnIPSet$IPSetDescriptorProperty$Builder
                                                         CfnIPSetProps$Builder
                                                         CfnRateBasedRule$Builder
                                                         CfnRateBasedRule$PredicateProperty$Builder
                                                         CfnRateBasedRuleProps$Builder
                                                         CfnRegexPatternSet$Builder
                                                         CfnRegexPatternSetProps$Builder
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
                                                         CfnWebACL$ActionProperty$Builder
                                                         CfnWebACL$Builder
                                                         CfnWebACL$RuleProperty$Builder
                                                         CfnWebACLAssociation$Builder
                                                         CfnWebACLAssociationProps$Builder
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
| `byteMatchTuples` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:byte-match-tuples` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnByteMatchSet$Builder builder id config]
  (when-some [data (lookup-entry config id :byte-match-tuples)]
    (. builder byteMatchTuples data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-byte-match-set-builder
  "Creates a  `CfnByteMatchSet$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-byte-match-set-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnByteMatchSet$ByteMatchTupleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-byte-match-set-byte-match-tuple-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnByteMatchSet$FieldToMatchProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-byte-match-set-field-to-match-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnByteMatchSetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-byte-match-set-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-byte-match-set-props-builder> (new CfnByteMatchSetProps$Builder) id config))


(defn cfn-geo-match-set-builder>
  "The cfn-geo-match-set-builder> function updates a CfnGeoMatchSet$Builder instance using the provided configuration.
  The function takes the CfnGeoMatchSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `geoMatchConstraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:geo-match-constraints` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnGeoMatchSet$Builder builder id config]
  (when-some [data (lookup-entry config id :geo-match-constraints)]
    (. builder geoMatchConstraints data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-geo-match-set-builder
  "Creates a  `CfnGeoMatchSet$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-geo-match-set-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-geo-match-set-builder> (CfnGeoMatchSet$Builder/create scope (name id)) id config))


(defn cfn-geo-match-set-geo-match-constraint-property-builder>
  "The cfn-geo-match-set-geo-match-constraint-property-builder> function updates a CfnGeoMatchSet$GeoMatchConstraintProperty$Builder instance using the provided configuration.
  The function takes the CfnGeoMatchSet$GeoMatchConstraintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnGeoMatchSet$GeoMatchConstraintProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-geo-match-set-geo-match-constraint-property-builder
  "Creates a  `CfnGeoMatchSet$GeoMatchConstraintProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-geo-match-set-geo-match-constraint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-geo-match-set-geo-match-constraint-property-builder> (new CfnGeoMatchSet$GeoMatchConstraintProperty$Builder) id config))


(defn cfn-geo-match-set-props-builder>
  "The cfn-geo-match-set-props-builder> function updates a CfnGeoMatchSetProps$Builder instance using the provided configuration.
  The function takes the CfnGeoMatchSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `geoMatchConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:geo-match-constraints` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnGeoMatchSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :geo-match-constraints)]
    (. builder geoMatchConstraints data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-geo-match-set-props-builder
  "Creates a  `CfnGeoMatchSetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-geo-match-set-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-geo-match-set-props-builder> (new CfnGeoMatchSetProps$Builder) id config))


(defn cfn-ip-set-builder>
  "The cfn-ip-set-builder> function updates a CfnIPSet$Builder instance using the provided configuration.
  The function takes the CfnIPSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipSetDescriptors` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-set-descriptors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnIPSet$Builder builder id config]
  (when-some [data (lookup-entry config id :ip-set-descriptors)]
    (. builder ipSetDescriptors data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-ip-set-builder
  "Creates a  `CfnIPSet$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-ip-set-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnIPSet$IPSetDescriptorProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-ip-set-ip-set-descriptor-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnIPSetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-ip-set-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-ip-set-props-builder> (new CfnIPSetProps$Builder) id config))


(defn cfn-rate-based-rule-builder>
  "The cfn-rate-based-rule-builder> function updates a CfnRateBasedRule$Builder instance using the provided configuration.
  The function takes the CfnRateBasedRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchPredicates` | java.util.List | [[cdk.support/lookup-entry]] | `:match-predicates` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:rate-key` |
| `rateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rate-limit` |
"
  [^CfnRateBasedRule$Builder builder id config]
  (when-some [data (lookup-entry config id :match-predicates)]
    (. builder matchPredicates data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rate-key)]
    (. builder rateKey data))
  (when-some [data (lookup-entry config id :rate-limit)]
    (. builder rateLimit data))
  (.build builder))


(defn cfn-rate-based-rule-builder
  "Creates a  `CfnRateBasedRule$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-rate-based-rule-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-rate-based-rule-builder> (CfnRateBasedRule$Builder/create scope (name id)) id config))


(defn cfn-rate-based-rule-predicate-property-builder>
  "The cfn-rate-based-rule-predicate-property-builder> function updates a CfnRateBasedRule$PredicateProperty$Builder instance using the provided configuration.
  The function takes the CfnRateBasedRule$PredicateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataId` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-id` |
| `negated` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:negated` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnRateBasedRule$PredicateProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-id)]
    (. builder dataId data))
  (when-some [data (lookup-entry config id :negated)]
    (. builder negated data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-rate-based-rule-predicate-property-builder
  "Creates a  `CfnRateBasedRule$PredicateProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-rate-based-rule-predicate-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-rate-based-rule-predicate-property-builder> (new CfnRateBasedRule$PredicateProperty$Builder) id config))


(defn cfn-rate-based-rule-props-builder>
  "The cfn-rate-based-rule-props-builder> function updates a CfnRateBasedRuleProps$Builder instance using the provided configuration.
  The function takes the CfnRateBasedRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchPredicates` | java.util.List | [[cdk.support/lookup-entry]] | `:match-predicates` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rateKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:rate-key` |
| `rateLimit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:rate-limit` |
"
  [^CfnRateBasedRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :match-predicates)]
    (. builder matchPredicates data))
  (when-some [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rate-key)]
    (. builder rateKey data))
  (when-some [data (lookup-entry config id :rate-limit)]
    (. builder rateLimit data))
  (.build builder))


(defn cfn-rate-based-rule-props-builder
  "Creates a  `CfnRateBasedRuleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-rate-based-rule-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-rate-based-rule-props-builder> (new CfnRateBasedRuleProps$Builder) id config))


(defn cfn-regex-pattern-set-builder>
  "The cfn-regex-pattern-set-builder> function updates a CfnRegexPatternSet$Builder instance using the provided configuration.
  The function takes the CfnRegexPatternSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regexPatternStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:regex-pattern-strings` |
"
  [^CfnRegexPatternSet$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :regex-pattern-strings)]
    (. builder regexPatternStrings data))
  (.build builder))


(defn cfn-regex-pattern-set-builder
  "Creates a  `CfnRegexPatternSet$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-regex-pattern-set-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-regex-pattern-set-builder> (CfnRegexPatternSet$Builder/create scope (name id)) id config))


(defn cfn-regex-pattern-set-props-builder>
  "The cfn-regex-pattern-set-props-builder> function updates a CfnRegexPatternSetProps$Builder instance using the provided configuration.
  The function takes the CfnRegexPatternSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regexPatternStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:regex-pattern-strings` |
"
  [^CfnRegexPatternSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :regex-pattern-strings)]
    (. builder regexPatternStrings data))
  (.build builder))


(defn cfn-regex-pattern-set-props-builder
  "Creates a  `CfnRegexPatternSetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-regex-pattern-set-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-regex-pattern-set-props-builder> (new CfnRegexPatternSetProps$Builder) id config))


(defn cfn-rule-builder>
  "The cfn-rule-builder> function updates a CfnRule$Builder instance using the provided configuration.
  The function takes the CfnRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `predicates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:predicates` |
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
  "Creates a  `CfnRule$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-rule-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnRule$PredicateProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-rule-predicate-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
| `predicates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:predicates` |
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
  "Creates a  `CfnRuleProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-rule-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnSizeConstraintSet$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-size-constraint-set-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnSizeConstraintSet$FieldToMatchProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-size-constraint-set-field-to-match-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
| `sizeConstraints` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:size-constraints` |
"
  [^CfnSizeConstraintSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :size-constraints)]
    (. builder sizeConstraints data))
  (.build builder))


(defn cfn-size-constraint-set-props-builder
  "Creates a  `CfnSizeConstraintSetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-size-constraint-set-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnSizeConstraintSet$SizeConstraintProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-size-constraint-set-size-constraint-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnSqlInjectionMatchSet$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-sql-injection-match-set-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnSqlInjectionMatchSet$FieldToMatchProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-sql-injection-match-set-field-to-match-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnSqlInjectionMatchSetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-sql-injection-match-set-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-sql-injection-match-set-props-builder> (new CfnSqlInjectionMatchSetProps$Builder) id config))


(defn cfn-sql-injection-match-set-sql-injection-match-tuple-property-builder>
  "The cfn-sql-injection-match-set-sql-injection-match-tuple-property-builder> function updates a CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder instance using the provided configuration.
  The function takes the CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:text-transformation` |
"
  [^CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-some [data (lookup-entry config id :text-transformation)]
    (. builder textTransformation data))
  (.build builder))


(defn cfn-sql-injection-match-set-sql-injection-match-tuple-property-builder
  "Creates a  `CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-sql-injection-match-set-sql-injection-match-tuple-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-sql-injection-match-set-sql-injection-match-tuple-property-builder> (new CfnSqlInjectionMatchSet$SqlInjectionMatchTupleProperty$Builder) id config))


(defn cfn-web-acl-action-property-builder>
  "The cfn-web-acl-action-property-builder> function updates a CfnWebACL$ActionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnWebACL$ActionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-web-acl-action-property-builder
  "Creates a  `CfnWebACL$ActionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-web-acl-action-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-web-acl-action-property-builder> (new CfnWebACL$ActionProperty$Builder) id config))


(defn cfn-web-acl-association-builder>
  "The cfn-web-acl-association-builder> function updates a CfnWebACLAssociation$Builder instance using the provided configuration.
  The function takes the CfnWebACLAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |
"
  [^CfnWebACLAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :web-acl-id)]
    (. builder webAclId data))
  (.build builder))


(defn cfn-web-acl-association-builder
  "Creates a  `CfnWebACLAssociation$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-web-acl-association-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-web-acl-association-builder> (CfnWebACLAssociation$Builder/create scope (name id)) id config))


(defn cfn-web-acl-association-props-builder>
  "The cfn-web-acl-association-props-builder> function updates a CfnWebACLAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnWebACLAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `webAclId` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-id` |
"
  [^CfnWebACLAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-some [data (lookup-entry config id :web-acl-id)]
    (. builder webAclId data))
  (.build builder))


(defn cfn-web-acl-association-props-builder
  "Creates a  `CfnWebACLAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-web-acl-association-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-web-acl-association-props-builder> (new CfnWebACLAssociationProps$Builder) id config))


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
| `rules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules` |
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
  "Creates a  `CfnWebACL$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-web-acl-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnWebACLProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-web-acl-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-web-acl-props-builder> (new CfnWebACLProps$Builder) id config))


(defn cfn-web-acl-rule-property-builder>
  "The cfn-web-acl-rule-property-builder> function updates a CfnWebACL$RuleProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.waf.regional.CfnWebACL$ActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `ruleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-id` |
"
  [^CfnWebACL$RuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :action)]
    (. builder action data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :rule-id)]
    (. builder ruleId data))
  (.build builder))


(defn cfn-web-acl-rule-property-builder
  "Creates a  `CfnWebACL$RuleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-web-acl-rule-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-web-acl-rule-property-builder> (new CfnWebACL$RuleProperty$Builder) id config))


(defn cfn-xss-match-set-builder>
  "The cfn-xss-match-set-builder> function updates a CfnXssMatchSet$Builder instance using the provided configuration.
  The function takes the CfnXssMatchSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `xssMatchTuples` | java.util.List | [[cdk.support/lookup-entry]] | `:xss-match-tuples` |
"
  [^CfnXssMatchSet$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :xss-match-tuples)]
    (. builder xssMatchTuples data))
  (.build builder))


(defn cfn-xss-match-set-builder
  "Creates a  `CfnXssMatchSet$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-xss-match-set-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnXssMatchSet$FieldToMatchProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-xss-match-set-field-to-match-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
| `xssMatchTuples` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:xss-match-tuples` |
"
  [^CfnXssMatchSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :xss-match-tuples)]
    (. builder xssMatchTuples data))
  (.build builder))


(defn cfn-xss-match-set-props-builder
  "Creates a  `CfnXssMatchSetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-xss-match-set-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
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
  "Creates a  `CfnXssMatchSet$XssMatchTupleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-xss-match-set-xss-match-tuple-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-xss-match-set-xss-match-tuple-property-builder> (new CfnXssMatchSet$XssMatchTupleProperty$Builder) id config))