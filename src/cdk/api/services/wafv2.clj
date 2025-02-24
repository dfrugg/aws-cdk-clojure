(ns cdk.api.services.wafv2
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.wafv2 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.wafv2 CfnIPSet$Builder
                                                  CfnIPSetProps$Builder
                                                  CfnLoggingConfiguration$ActionConditionProperty$Builder
                                                  CfnLoggingConfiguration$Builder
                                                  CfnLoggingConfiguration$ConditionProperty$Builder
                                                  CfnLoggingConfiguration$FieldToMatchProperty$Builder
                                                  CfnLoggingConfiguration$FilterProperty$Builder
                                                  CfnLoggingConfiguration$JsonBodyProperty$Builder
                                                  CfnLoggingConfiguration$LabelNameConditionProperty$Builder
                                                  CfnLoggingConfiguration$LoggingFilterProperty$Builder
                                                  CfnLoggingConfiguration$MatchPatternProperty$Builder
                                                  CfnLoggingConfiguration$SingleHeaderProperty$Builder
                                                  CfnLoggingConfigurationProps$Builder
                                                  CfnRegexPatternSet$Builder
                                                  CfnRegexPatternSetProps$Builder
                                                  CfnRuleGroup$AllowProperty$Builder
                                                  CfnRuleGroup$AndStatementProperty$Builder
                                                  CfnRuleGroup$BlockProperty$Builder
                                                  CfnRuleGroup$BodyProperty$Builder
                                                  CfnRuleGroup$Builder
                                                  CfnRuleGroup$ByteMatchStatementProperty$Builder
                                                  CfnRuleGroup$CaptchaConfigProperty$Builder
                                                  CfnRuleGroup$CaptchaProperty$Builder
                                                  CfnRuleGroup$ChallengeConfigProperty$Builder
                                                  CfnRuleGroup$ChallengeProperty$Builder
                                                  CfnRuleGroup$CookieMatchPatternProperty$Builder
                                                  CfnRuleGroup$CookiesProperty$Builder
                                                  CfnRuleGroup$CountProperty$Builder
                                                  CfnRuleGroup$CustomHTTPHeaderProperty$Builder
                                                  CfnRuleGroup$CustomRequestHandlingProperty$Builder
                                                  CfnRuleGroup$CustomResponseBodyProperty$Builder
                                                  CfnRuleGroup$CustomResponseProperty$Builder
                                                  CfnRuleGroup$FieldToMatchProperty$Builder
                                                  CfnRuleGroup$ForwardedIPConfigurationProperty$Builder
                                                  CfnRuleGroup$GeoMatchStatementProperty$Builder
                                                  CfnRuleGroup$HeaderMatchPatternProperty$Builder
                                                  CfnRuleGroup$HeadersProperty$Builder
                                                  CfnRuleGroup$IPSetForwardedIPConfigurationProperty$Builder
                                                  CfnRuleGroup$IPSetReferenceStatementProperty$Builder
                                                  CfnRuleGroup$ImmunityTimePropertyProperty$Builder
                                                  CfnRuleGroup$JA3FingerprintProperty$Builder
                                                  CfnRuleGroup$JsonBodyProperty$Builder
                                                  CfnRuleGroup$JsonMatchPatternProperty$Builder
                                                  CfnRuleGroup$LabelMatchStatementProperty$Builder
                                                  CfnRuleGroup$LabelProperty$Builder
                                                  CfnRuleGroup$LabelSummaryProperty$Builder
                                                  CfnRuleGroup$NotStatementProperty$Builder
                                                  CfnRuleGroup$OrStatementProperty$Builder
                                                  CfnRuleGroup$RateBasedStatementCustomKeyProperty$Builder
                                                  CfnRuleGroup$RateBasedStatementProperty$Builder
                                                  CfnRuleGroup$RateLimitCookieProperty$Builder
                                                  CfnRuleGroup$RateLimitHeaderProperty$Builder
                                                  CfnRuleGroup$RateLimitLabelNamespaceProperty$Builder
                                                  CfnRuleGroup$RateLimitQueryArgumentProperty$Builder
                                                  CfnRuleGroup$RateLimitQueryStringProperty$Builder
                                                  CfnRuleGroup$RateLimitUriPathProperty$Builder
                                                  CfnRuleGroup$RegexMatchStatementProperty$Builder
                                                  CfnRuleGroup$RegexPatternSetReferenceStatementProperty$Builder
                                                  CfnRuleGroup$RuleActionProperty$Builder
                                                  CfnRuleGroup$RuleProperty$Builder
                                                  CfnRuleGroup$SingleHeaderProperty$Builder
                                                  CfnRuleGroup$SingleQueryArgumentProperty$Builder
                                                  CfnRuleGroup$SizeConstraintStatementProperty$Builder
                                                  CfnRuleGroup$SqliMatchStatementProperty$Builder
                                                  CfnRuleGroup$StatementProperty$Builder
                                                  CfnRuleGroup$TextTransformationProperty$Builder
                                                  CfnRuleGroup$VisibilityConfigProperty$Builder
                                                  CfnRuleGroup$XssMatchStatementProperty$Builder
                                                  CfnRuleGroupProps$Builder
                                                  CfnWebACL$AWSManagedRulesACFPRuleSetProperty$Builder
                                                  CfnWebACL$AWSManagedRulesATPRuleSetProperty$Builder
                                                  CfnWebACL$AWSManagedRulesBotControlRuleSetProperty$Builder
                                                  CfnWebACL$AllowActionProperty$Builder
                                                  CfnWebACL$AndStatementProperty$Builder
                                                  CfnWebACL$AssociationConfigProperty$Builder
                                                  CfnWebACL$BlockActionProperty$Builder
                                                  CfnWebACL$BodyProperty$Builder
                                                  CfnWebACL$Builder
                                                  CfnWebACL$ByteMatchStatementProperty$Builder
                                                  CfnWebACL$CaptchaActionProperty$Builder
                                                  CfnWebACL$CaptchaConfigProperty$Builder
                                                  CfnWebACL$ChallengeActionProperty$Builder
                                                  CfnWebACL$ChallengeConfigProperty$Builder
                                                  CfnWebACL$CookieMatchPatternProperty$Builder
                                                  CfnWebACL$CookiesProperty$Builder
                                                  CfnWebACL$CountActionProperty$Builder
                                                  CfnWebACL$CustomHTTPHeaderProperty$Builder
                                                  CfnWebACL$CustomRequestHandlingProperty$Builder
                                                  CfnWebACL$CustomResponseBodyProperty$Builder
                                                  CfnWebACL$CustomResponseProperty$Builder
                                                  CfnWebACL$DefaultActionProperty$Builder
                                                  CfnWebACL$ExcludedRuleProperty$Builder
                                                  CfnWebACL$FieldIdentifierProperty$Builder
                                                  CfnWebACL$FieldToMatchProperty$Builder
                                                  CfnWebACL$ForwardedIPConfigurationProperty$Builder
                                                  CfnWebACL$GeoMatchStatementProperty$Builder
                                                  CfnWebACL$HeaderMatchPatternProperty$Builder
                                                  CfnWebACL$HeadersProperty$Builder
                                                  CfnWebACL$IPSetForwardedIPConfigurationProperty$Builder
                                                  CfnWebACL$IPSetReferenceStatementProperty$Builder
                                                  CfnWebACL$ImmunityTimePropertyProperty$Builder
                                                  CfnWebACL$JA3FingerprintProperty$Builder
                                                  CfnWebACL$JsonBodyProperty$Builder
                                                  CfnWebACL$JsonMatchPatternProperty$Builder
                                                  CfnWebACL$LabelMatchStatementProperty$Builder
                                                  CfnWebACL$LabelProperty$Builder
                                                  CfnWebACL$ManagedRuleGroupConfigProperty$Builder
                                                  CfnWebACL$ManagedRuleGroupStatementProperty$Builder
                                                  CfnWebACL$NotStatementProperty$Builder
                                                  CfnWebACL$OrStatementProperty$Builder
                                                  CfnWebACL$OverrideActionProperty$Builder
                                                  CfnWebACL$RateBasedStatementCustomKeyProperty$Builder
                                                  CfnWebACL$RateBasedStatementProperty$Builder
                                                  CfnWebACL$RateLimitCookieProperty$Builder
                                                  CfnWebACL$RateLimitHeaderProperty$Builder
                                                  CfnWebACL$RateLimitLabelNamespaceProperty$Builder
                                                  CfnWebACL$RateLimitQueryArgumentProperty$Builder
                                                  CfnWebACL$RateLimitQueryStringProperty$Builder
                                                  CfnWebACL$RateLimitUriPathProperty$Builder
                                                  CfnWebACL$RegexMatchStatementProperty$Builder
                                                  CfnWebACL$RegexPatternSetReferenceStatementProperty$Builder
                                                  CfnWebACL$RequestBodyAssociatedResourceTypeConfigProperty$Builder
                                                  CfnWebACL$RequestInspectionACFPProperty$Builder
                                                  CfnWebACL$RequestInspectionProperty$Builder
                                                  CfnWebACL$ResponseInspectionBodyContainsProperty$Builder
                                                  CfnWebACL$ResponseInspectionHeaderProperty$Builder
                                                  CfnWebACL$ResponseInspectionJsonProperty$Builder
                                                  CfnWebACL$ResponseInspectionProperty$Builder
                                                  CfnWebACL$ResponseInspectionStatusCodeProperty$Builder
                                                  CfnWebACL$RuleActionOverrideProperty$Builder
                                                  CfnWebACL$RuleActionProperty$Builder
                                                  CfnWebACL$RuleGroupReferenceStatementProperty$Builder
                                                  CfnWebACL$RuleProperty$Builder
                                                  CfnWebACL$SingleHeaderProperty$Builder
                                                  CfnWebACL$SingleQueryArgumentProperty$Builder
                                                  CfnWebACL$SizeConstraintStatementProperty$Builder
                                                  CfnWebACL$SqliMatchStatementProperty$Builder
                                                  CfnWebACL$StatementProperty$Builder
                                                  CfnWebACL$TextTransformationProperty$Builder
                                                  CfnWebACL$VisibilityConfigProperty$Builder
                                                  CfnWebACL$XssMatchStatementProperty$Builder
                                                  CfnWebACLAssociation$Builder
                                                  CfnWebACLAssociationProps$Builder
                                                  CfnWebACLProps$Builder]))


(defn build-cfn-ip-set-builder
  "The build-cfn-ip-set-builder function updates a CfnIPSet$Builder instance using the provided configuration.
  The function takes the CfnIPSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:addresses` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipAddressVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnIPSet$Builder builder id config]
  (when-let [data (lookup-entry config id :addresses)]
    (. builder addresses data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :ip-address-version)]
    (. builder ipAddressVersion data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-ip-set-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-ip-set-builder (CfnIPSet$Builder/create scope (name id)) id config))


(defn build-cfn-ip-set-props-builder
  "The build-cfn-ip-set-props-builder function updates a CfnIPSetProps$Builder instance using the provided configuration.
  The function takes the CfnIPSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:addresses` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipAddressVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnIPSetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :addresses)]
    (. builder addresses data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :ip-address-version)]
    (. builder ipAddressVersion data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-ip-set-props-builder
  ""
  [id config]
  (build-cfn-ip-set-props-builder (new CfnIPSetProps$Builder) id config))


(defn build-cfn-logging-configuration-action-condition-property-builder
  "The build-cfn-logging-configuration-action-condition-property-builder function updates a CfnLoggingConfiguration$ActionConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$ActionConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
"
  [^CfnLoggingConfiguration$ActionConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (.build builder))


(defn cfn-logging-configuration-action-condition-property-builder
  ""
  [id config]
  (build-cfn-logging-configuration-action-condition-property-builder (new CfnLoggingConfiguration$ActionConditionProperty$Builder) id config))


(defn build-cfn-logging-configuration-builder
  "The build-cfn-logging-configuration-builder function updates a CfnLoggingConfiguration$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDestinationConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:log-destination-configs` |
| `loggingFilter` | java.lang.Object | [[cdk.support/lookup-entry]] | `:logging-filter` |
| `redactedFields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redacted-fields` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnLoggingConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :log-destination-configs)]
    (. builder logDestinationConfigs data))
  (when-let [data (lookup-entry config id :logging-filter)]
    (. builder loggingFilter data))
  (when-let [data (lookup-entry config id :redacted-fields)]
    (. builder redactedFields data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-logging-configuration-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-logging-configuration-builder (CfnLoggingConfiguration$Builder/create scope (name id)) id config))


(defn build-cfn-logging-configuration-condition-property-builder
  "The build-cfn-logging-configuration-condition-property-builder function updates a CfnLoggingConfiguration$ConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$ConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action-condition` |
| `labelNameCondition` | software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration$LabelNameConditionProperty | [[cdk.support/lookup-entry]] | `:label-name-condition` |
"
  [^CfnLoggingConfiguration$ConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action-condition)]
    (. builder actionCondition data))
  (when-let [data (lookup-entry config id :label-name-condition)]
    (. builder labelNameCondition data))
  (.build builder))


(defn cfn-logging-configuration-condition-property-builder
  ""
  [id config]
  (build-cfn-logging-configuration-condition-property-builder (new CfnLoggingConfiguration$ConditionProperty$Builder) id config))


(defn build-cfn-logging-configuration-field-to-match-property-builder
  "The build-cfn-logging-configuration-field-to-match-property-builder function updates a CfnLoggingConfiguration$FieldToMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$FieldToMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonBody` | java.lang.Object | [[cdk.support/lookup-entry]] | `:json-body` |
| `method` | java.lang.Object | [[cdk.support/lookup-entry]] | `:method` |
| `queryString` | java.lang.Object | [[cdk.support/lookup-entry]] | `:query-string` |
| `singleHeader` | java.lang.Object | [[cdk.support/lookup-entry]] | `:single-header` |
| `uriPath` | java.lang.Object | [[cdk.support/lookup-entry]] | `:uri-path` |
"
  [^CfnLoggingConfiguration$FieldToMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :json-body)]
    (. builder jsonBody data))
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-let [data (lookup-entry config id :single-header)]
    (. builder singleHeader data))
  (when-let [data (lookup-entry config id :uri-path)]
    (. builder uriPath data))
  (.build builder))


(defn cfn-logging-configuration-field-to-match-property-builder
  ""
  [id config]
  (build-cfn-logging-configuration-field-to-match-property-builder (new CfnLoggingConfiguration$FieldToMatchProperty$Builder) id config))


(defn build-cfn-logging-configuration-filter-property-builder
  "The build-cfn-logging-configuration-filter-property-builder function updates a CfnLoggingConfiguration$FilterProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$FilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior` |
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `requirement` | java.lang.String | [[cdk.support/lookup-entry]] | `:requirement` |
"
  [^CfnLoggingConfiguration$FilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :behavior)]
    (. builder behavior data))
  (when-let [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-let [data (lookup-entry config id :requirement)]
    (. builder requirement data))
  (.build builder))


(defn cfn-logging-configuration-filter-property-builder
  ""
  [id config]
  (build-cfn-logging-configuration-filter-property-builder (new CfnLoggingConfiguration$FilterProperty$Builder) id config))


(defn build-cfn-logging-configuration-json-body-property-builder
  "The build-cfn-logging-configuration-json-body-property-builder function updates a CfnLoggingConfiguration$JsonBodyProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$JsonBodyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invalidFallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:invalid-fallback-behavior` |
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration$MatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
"
  [^CfnLoggingConfiguration$JsonBodyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :invalid-fallback-behavior)]
    (. builder invalidFallbackBehavior data))
  (when-let [data (lookup-entry config id :match-pattern)]
    (. builder matchPattern data))
  (when-let [data (lookup-entry config id :match-scope)]
    (. builder matchScope data))
  (.build builder))


(defn cfn-logging-configuration-json-body-property-builder
  ""
  [id config]
  (build-cfn-logging-configuration-json-body-property-builder (new CfnLoggingConfiguration$JsonBodyProperty$Builder) id config))


(defn build-cfn-logging-configuration-label-name-condition-property-builder
  "The build-cfn-logging-configuration-label-name-condition-property-builder function updates a CfnLoggingConfiguration$LabelNameConditionProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$LabelNameConditionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:label-name` |
"
  [^CfnLoggingConfiguration$LabelNameConditionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :label-name)]
    (. builder labelName data))
  (.build builder))


(defn cfn-logging-configuration-label-name-condition-property-builder
  ""
  [id config]
  (build-cfn-logging-configuration-label-name-condition-property-builder (new CfnLoggingConfiguration$LabelNameConditionProperty$Builder) id config))


(defn build-cfn-logging-configuration-logging-filter-property-builder
  "The build-cfn-logging-configuration-logging-filter-property-builder function updates a CfnLoggingConfiguration$LoggingFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$LoggingFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-behavior` |
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |
"
  [^CfnLoggingConfiguration$LoggingFilterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-behavior)]
    (. builder defaultBehavior data))
  (when-let [data (lookup-entry config id :filters)]
    (. builder filters data))
  (.build builder))


(defn cfn-logging-configuration-logging-filter-property-builder
  ""
  [id config]
  (build-cfn-logging-configuration-logging-filter-property-builder (new CfnLoggingConfiguration$LoggingFilterProperty$Builder) id config))


(defn build-cfn-logging-configuration-match-pattern-property-builder
  "The build-cfn-logging-configuration-match-pattern-property-builder function updates a CfnLoggingConfiguration$MatchPatternProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$MatchPatternProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `includedPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:included-paths` |
"
  [^CfnLoggingConfiguration$MatchPatternProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :all)]
    (. builder all data))
  (when-let [data (lookup-entry config id :included-paths)]
    (. builder includedPaths data))
  (.build builder))


(defn cfn-logging-configuration-match-pattern-property-builder
  ""
  [id config]
  (build-cfn-logging-configuration-match-pattern-property-builder (new CfnLoggingConfiguration$MatchPatternProperty$Builder) id config))


(defn build-cfn-logging-configuration-props-builder
  "The build-cfn-logging-configuration-props-builder function updates a CfnLoggingConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDestinationConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:log-destination-configs` |
| `loggingFilter` | java.lang.Object | [[cdk.support/lookup-entry]] | `:logging-filter` |
| `redactedFields` | java.util.List | [[cdk.support/lookup-entry]] | `:redacted-fields` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnLoggingConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :log-destination-configs)]
    (. builder logDestinationConfigs data))
  (when-let [data (lookup-entry config id :logging-filter)]
    (. builder loggingFilter data))
  (when-let [data (lookup-entry config id :redacted-fields)]
    (. builder redactedFields data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-logging-configuration-props-builder
  ""
  [id config]
  (build-cfn-logging-configuration-props-builder (new CfnLoggingConfigurationProps$Builder) id config))


(defn build-cfn-logging-configuration-single-header-property-builder
  "The build-cfn-logging-configuration-single-header-property-builder function updates a CfnLoggingConfiguration$SingleHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$SingleHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnLoggingConfiguration$SingleHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-logging-configuration-single-header-property-builder
  ""
  [id config]
  (build-cfn-logging-configuration-single-header-property-builder (new CfnLoggingConfiguration$SingleHeaderProperty$Builder) id config))


(defn build-cfn-regex-pattern-set-builder
  "The build-cfn-regex-pattern-set-builder function updates a CfnRegexPatternSet$Builder instance using the provided configuration.
  The function takes the CfnRegexPatternSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regularExpressionList` | java.util.List | [[cdk.support/lookup-entry]] | `:regular-expression-list` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRegexPatternSet$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :regular-expression-list)]
    (. builder regularExpressionList data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-regex-pattern-set-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-regex-pattern-set-builder (CfnRegexPatternSet$Builder/create scope (name id)) id config))


(defn build-cfn-regex-pattern-set-props-builder
  "The build-cfn-regex-pattern-set-props-builder function updates a CfnRegexPatternSetProps$Builder instance using the provided configuration.
  The function takes the CfnRegexPatternSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regularExpressionList` | java.util.List | [[cdk.support/lookup-entry]] | `:regular-expression-list` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRegexPatternSetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :regular-expression-list)]
    (. builder regularExpressionList data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-regex-pattern-set-props-builder
  ""
  [id config]
  (build-cfn-regex-pattern-set-props-builder (new CfnRegexPatternSetProps$Builder) id config))


(defn build-cfn-rule-group-allow-property-builder
  "The build-cfn-rule-group-allow-property-builder function updates a CfnRuleGroup$AllowProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$AllowProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-request-handling` |
"
  [^CfnRuleGroup$AllowProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-request-handling)]
    (. builder customRequestHandling data))
  (.build builder))


(defn cfn-rule-group-allow-property-builder
  ""
  [id config]
  (build-cfn-rule-group-allow-property-builder (new CfnRuleGroup$AllowProperty$Builder) id config))


(defn build-cfn-rule-group-and-statement-property-builder
  "The build-cfn-rule-group-and-statement-property-builder function updates a CfnRuleGroup$AndStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$AndStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
"
  [^CfnRuleGroup$AndStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :statements)]
    (. builder statements data))
  (.build builder))


(defn cfn-rule-group-and-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-and-statement-property-builder (new CfnRuleGroup$AndStatementProperty$Builder) id config))


(defn build-cfn-rule-group-block-property-builder
  "The build-cfn-rule-group-block-property-builder function updates a CfnRuleGroup$BlockProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$BlockProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customResponse` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$CustomResponseProperty | [[cdk.support/lookup-entry]] | `:custom-response` |
"
  [^CfnRuleGroup$BlockProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-response)]
    (. builder customResponse data))
  (.build builder))


(defn cfn-rule-group-block-property-builder
  ""
  [id config]
  (build-cfn-rule-group-block-property-builder (new CfnRuleGroup$BlockProperty$Builder) id config))


(defn build-cfn-rule-group-body-property-builder
  "The build-cfn-rule-group-body-property-builder function updates a CfnRuleGroup$BodyProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$BodyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |
"
  [^CfnRuleGroup$BodyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :oversize-handling)]
    (. builder oversizeHandling data))
  (.build builder))


(defn cfn-rule-group-body-property-builder
  ""
  [id config]
  (build-cfn-rule-group-body-property-builder (new CfnRuleGroup$BodyProperty$Builder) id config))


(defn build-cfn-rule-group-builder
  "The build-cfn-rule-group-builder function updates a CfnRuleGroup$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availableLabels` | java.util.List | [[cdk.support/lookup-entry]] | `:available-labels` |
| `capacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:capacity` |
| `consumedLabels` | java.util.List | [[cdk.support/lookup-entry]] | `:consumed-labels` |
| `customResponseBodies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-response-bodies` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `visibilityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:visibility-config` |
"
  [^CfnRuleGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :available-labels)]
    (. builder availableLabels data))
  (when-let [data (lookup-entry config id :capacity)]
    (. builder capacity data))
  (when-let [data (lookup-entry config id :consumed-labels)]
    (. builder consumedLabels data))
  (when-let [data (lookup-entry config id :custom-response-bodies)]
    (. builder customResponseBodies data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :visibility-config)]
    (. builder visibilityConfig data))
  (.build builder))


(defn cfn-rule-group-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-rule-group-builder (CfnRuleGroup$Builder/create scope (name id)) id config))


(defn build-cfn-rule-group-byte-match-statement-property-builder
  "The build-cfn-rule-group-byte-match-statement-property-builder function updates a CfnRuleGroup$ByteMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$ByteMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `positionalConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:positional-constraint` |
| `searchString` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-string` |
| `searchStringBase64` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-string-base64` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnRuleGroup$ByteMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :positional-constraint)]
    (. builder positionalConstraint data))
  (when-let [data (lookup-entry config id :search-string)]
    (. builder searchString data))
  (when-let [data (lookup-entry config id :search-string-base64)]
    (. builder searchStringBase64 data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-rule-group-byte-match-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-byte-match-statement-property-builder (new CfnRuleGroup$ByteMatchStatementProperty$Builder) id config))


(defn build-cfn-rule-group-captcha-config-property-builder
  "The build-cfn-rule-group-captcha-config-property-builder function updates a CfnRuleGroup$CaptchaConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$CaptchaConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTimeProperty` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$ImmunityTimePropertyProperty | [[cdk.support/lookup-entry]] | `:immunity-time-property` |
"
  [^CfnRuleGroup$CaptchaConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :immunity-time-property)]
    (. builder immunityTimeProperty data))
  (.build builder))


(defn cfn-rule-group-captcha-config-property-builder
  ""
  [id config]
  (build-cfn-rule-group-captcha-config-property-builder (new CfnRuleGroup$CaptchaConfigProperty$Builder) id config))


(defn build-cfn-rule-group-captcha-property-builder
  "The build-cfn-rule-group-captcha-property-builder function updates a CfnRuleGroup$CaptchaProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$CaptchaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$CustomRequestHandlingProperty | [[cdk.support/lookup-entry]] | `:custom-request-handling` |
"
  [^CfnRuleGroup$CaptchaProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-request-handling)]
    (. builder customRequestHandling data))
  (.build builder))


(defn cfn-rule-group-captcha-property-builder
  ""
  [id config]
  (build-cfn-rule-group-captcha-property-builder (new CfnRuleGroup$CaptchaProperty$Builder) id config))


(defn build-cfn-rule-group-challenge-config-property-builder
  "The build-cfn-rule-group-challenge-config-property-builder function updates a CfnRuleGroup$ChallengeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$ChallengeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTimeProperty` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:immunity-time-property` |
"
  [^CfnRuleGroup$ChallengeConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :immunity-time-property)]
    (. builder immunityTimeProperty data))
  (.build builder))


(defn cfn-rule-group-challenge-config-property-builder
  ""
  [id config]
  (build-cfn-rule-group-challenge-config-property-builder (new CfnRuleGroup$ChallengeConfigProperty$Builder) id config))


(defn build-cfn-rule-group-challenge-property-builder
  "The build-cfn-rule-group-challenge-property-builder function updates a CfnRuleGroup$ChallengeProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$ChallengeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-request-handling` |
"
  [^CfnRuleGroup$ChallengeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-request-handling)]
    (. builder customRequestHandling data))
  (.build builder))


(defn cfn-rule-group-challenge-property-builder
  ""
  [id config]
  (build-cfn-rule-group-challenge-property-builder (new CfnRuleGroup$ChallengeProperty$Builder) id config))


(defn build-cfn-rule-group-cookie-match-pattern-property-builder
  "The build-cfn-rule-group-cookie-match-pattern-property-builder function updates a CfnRuleGroup$CookieMatchPatternProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$CookieMatchPatternProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `excludedCookies` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-cookies` |
| `includedCookies` | java.util.List | [[cdk.support/lookup-entry]] | `:included-cookies` |
"
  [^CfnRuleGroup$CookieMatchPatternProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :all)]
    (. builder all data))
  (when-let [data (lookup-entry config id :excluded-cookies)]
    (. builder excludedCookies data))
  (when-let [data (lookup-entry config id :included-cookies)]
    (. builder includedCookies data))
  (.build builder))


(defn cfn-rule-group-cookie-match-pattern-property-builder
  ""
  [id config]
  (build-cfn-rule-group-cookie-match-pattern-property-builder (new CfnRuleGroup$CookieMatchPatternProperty$Builder) id config))


(defn build-cfn-rule-group-cookies-property-builder
  "The build-cfn-rule-group-cookies-property-builder function updates a CfnRuleGroup$CookiesProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$CookiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$CookieMatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |
"
  [^CfnRuleGroup$CookiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :match-pattern)]
    (. builder matchPattern data))
  (when-let [data (lookup-entry config id :match-scope)]
    (. builder matchScope data))
  (when-let [data (lookup-entry config id :oversize-handling)]
    (. builder oversizeHandling data))
  (.build builder))


(defn cfn-rule-group-cookies-property-builder
  ""
  [id config]
  (build-cfn-rule-group-cookies-property-builder (new CfnRuleGroup$CookiesProperty$Builder) id config))


(defn build-cfn-rule-group-count-property-builder
  "The build-cfn-rule-group-count-property-builder function updates a CfnRuleGroup$CountProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$CountProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$CustomRequestHandlingProperty | [[cdk.support/lookup-entry]] | `:custom-request-handling` |
"
  [^CfnRuleGroup$CountProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-request-handling)]
    (. builder customRequestHandling data))
  (.build builder))


(defn cfn-rule-group-count-property-builder
  ""
  [id config]
  (build-cfn-rule-group-count-property-builder (new CfnRuleGroup$CountProperty$Builder) id config))


(defn build-cfn-rule-group-custom-http-header-property-builder
  "The build-cfn-rule-group-custom-http-header-property-builder function updates a CfnRuleGroup$CustomHTTPHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$CustomHTTPHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRuleGroup$CustomHTTPHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-rule-group-custom-http-header-property-builder
  ""
  [id config]
  (build-cfn-rule-group-custom-http-header-property-builder (new CfnRuleGroup$CustomHTTPHeaderProperty$Builder) id config))


(defn build-cfn-rule-group-custom-request-handling-property-builder
  "The build-cfn-rule-group-custom-request-handling-property-builder function updates a CfnRuleGroup$CustomRequestHandlingProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$CustomRequestHandlingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `insertHeaders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:insert-headers` |
"
  [^CfnRuleGroup$CustomRequestHandlingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :insert-headers)]
    (. builder insertHeaders data))
  (.build builder))


(defn cfn-rule-group-custom-request-handling-property-builder
  ""
  [id config]
  (build-cfn-rule-group-custom-request-handling-property-builder (new CfnRuleGroup$CustomRequestHandlingProperty$Builder) id config))


(defn build-cfn-rule-group-custom-response-body-property-builder
  "The build-cfn-rule-group-custom-response-body-property-builder function updates a CfnRuleGroup$CustomResponseBodyProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$CustomResponseBodyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
"
  [^CfnRuleGroup$CustomResponseBodyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (.build builder))


(defn cfn-rule-group-custom-response-body-property-builder
  ""
  [id config]
  (build-cfn-rule-group-custom-response-body-property-builder (new CfnRuleGroup$CustomResponseBodyProperty$Builder) id config))


(defn build-cfn-rule-group-custom-response-property-builder
  "The build-cfn-rule-group-custom-response-property-builder function updates a CfnRuleGroup$CustomResponseProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$CustomResponseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customResponseBodyKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-response-body-key` |
| `responseCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:response-code` |
| `responseHeaders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-headers` |
"
  [^CfnRuleGroup$CustomResponseProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-response-body-key)]
    (. builder customResponseBodyKey data))
  (when-let [data (lookup-entry config id :response-code)]
    (. builder responseCode data))
  (when-let [data (lookup-entry config id :response-headers)]
    (. builder responseHeaders data))
  (.build builder))


(defn cfn-rule-group-custom-response-property-builder
  ""
  [id config]
  (build-cfn-rule-group-custom-response-property-builder (new CfnRuleGroup$CustomResponseProperty$Builder) id config))


(defn build-cfn-rule-group-field-to-match-property-builder
  "The build-cfn-rule-group-field-to-match-property-builder function updates a CfnRuleGroup$FieldToMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$FieldToMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allQueryArguments` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all-query-arguments` |
| `body` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$BodyProperty | [[cdk.support/lookup-entry]] | `:body` |
| `cookies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cookies` |
| `headers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:headers` |
| `ja3Fingerprint` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$JA3FingerprintProperty | [[cdk.support/lookup-entry]] | `:ja3-fingerprint` |
| `jsonBody` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json-body` |
| `method` | java.lang.Object | [[cdk.support/lookup-entry]] | `:method` |
| `queryString` | java.lang.Object | [[cdk.support/lookup-entry]] | `:query-string` |
| `singleHeader` | java.lang.Object | [[cdk.support/lookup-entry]] | `:single-header` |
| `singleQueryArgument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:single-query-argument` |
| `uriPath` | java.lang.Object | [[cdk.support/lookup-entry]] | `:uri-path` |
"
  [^CfnRuleGroup$FieldToMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :all-query-arguments)]
    (. builder allQueryArguments data))
  (when-let [data (lookup-entry config id :body)]
    (. builder body data))
  (when-let [data (lookup-entry config id :cookies)]
    (. builder cookies data))
  (when-let [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-let [data (lookup-entry config id :ja3-fingerprint)]
    (. builder ja3Fingerprint data))
  (when-let [data (lookup-entry config id :json-body)]
    (. builder jsonBody data))
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-let [data (lookup-entry config id :single-header)]
    (. builder singleHeader data))
  (when-let [data (lookup-entry config id :single-query-argument)]
    (. builder singleQueryArgument data))
  (when-let [data (lookup-entry config id :uri-path)]
    (. builder uriPath data))
  (.build builder))


(defn cfn-rule-group-field-to-match-property-builder
  ""
  [id config]
  (build-cfn-rule-group-field-to-match-property-builder (new CfnRuleGroup$FieldToMatchProperty$Builder) id config))


(defn build-cfn-rule-group-forwarded-ip-configuration-property-builder
  "The build-cfn-rule-group-forwarded-ip-configuration-property-builder function updates a CfnRuleGroup$ForwardedIPConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$ForwardedIPConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
"
  [^CfnRuleGroup$ForwardedIPConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :fallback-behavior)]
    (. builder fallbackBehavior data))
  (when-let [data (lookup-entry config id :header-name)]
    (. builder headerName data))
  (.build builder))


(defn cfn-rule-group-forwarded-ip-configuration-property-builder
  ""
  [id config]
  (build-cfn-rule-group-forwarded-ip-configuration-property-builder (new CfnRuleGroup$ForwardedIPConfigurationProperty$Builder) id config))


(defn build-cfn-rule-group-geo-match-statement-property-builder
  "The build-cfn-rule-group-geo-match-statement-property-builder function updates a CfnRuleGroup$GeoMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$GeoMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `countryCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:country-codes` |
| `forwardedIpConfig` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$ForwardedIPConfigurationProperty | [[cdk.support/lookup-entry]] | `:forwarded-ip-config` |
"
  [^CfnRuleGroup$GeoMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :country-codes)]
    (. builder countryCodes data))
  (when-let [data (lookup-entry config id :forwarded-ip-config)]
    (. builder forwardedIpConfig data))
  (.build builder))


(defn cfn-rule-group-geo-match-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-geo-match-statement-property-builder (new CfnRuleGroup$GeoMatchStatementProperty$Builder) id config))


(defn build-cfn-rule-group-header-match-pattern-property-builder
  "The build-cfn-rule-group-header-match-pattern-property-builder function updates a CfnRuleGroup$HeaderMatchPatternProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$HeaderMatchPatternProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `excludedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-headers` |
| `includedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:included-headers` |
"
  [^CfnRuleGroup$HeaderMatchPatternProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :all)]
    (. builder all data))
  (when-let [data (lookup-entry config id :excluded-headers)]
    (. builder excludedHeaders data))
  (when-let [data (lookup-entry config id :included-headers)]
    (. builder includedHeaders data))
  (.build builder))


(defn cfn-rule-group-header-match-pattern-property-builder
  ""
  [id config]
  (build-cfn-rule-group-header-match-pattern-property-builder (new CfnRuleGroup$HeaderMatchPatternProperty$Builder) id config))


(defn build-cfn-rule-group-headers-property-builder
  "The build-cfn-rule-group-headers-property-builder function updates a CfnRuleGroup$HeadersProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$HeadersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchPattern` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |
"
  [^CfnRuleGroup$HeadersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :match-pattern)]
    (. builder matchPattern data))
  (when-let [data (lookup-entry config id :match-scope)]
    (. builder matchScope data))
  (when-let [data (lookup-entry config id :oversize-handling)]
    (. builder oversizeHandling data))
  (.build builder))


(defn cfn-rule-group-headers-property-builder
  ""
  [id config]
  (build-cfn-rule-group-headers-property-builder (new CfnRuleGroup$HeadersProperty$Builder) id config))


(defn build-cfn-rule-group-immunity-time-property-property-builder
  "The build-cfn-rule-group-immunity-time-property-property-builder function updates a CfnRuleGroup$ImmunityTimePropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$ImmunityTimePropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:immunity-time` |
"
  [^CfnRuleGroup$ImmunityTimePropertyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :immunity-time)]
    (. builder immunityTime data))
  (.build builder))


(defn cfn-rule-group-immunity-time-property-property-builder
  ""
  [id config]
  (build-cfn-rule-group-immunity-time-property-property-builder (new CfnRuleGroup$ImmunityTimePropertyProperty$Builder) id config))


(defn build-cfn-rule-group-ip-set-forwarded-ip-configuration-property-builder
  "The build-cfn-rule-group-ip-set-forwarded-ip-configuration-property-builder function updates a CfnRuleGroup$IPSetForwardedIPConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$IPSetForwardedIPConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `position` | java.lang.String | [[cdk.support/lookup-entry]] | `:position` |
"
  [^CfnRuleGroup$IPSetForwardedIPConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :fallback-behavior)]
    (. builder fallbackBehavior data))
  (when-let [data (lookup-entry config id :header-name)]
    (. builder headerName data))
  (when-let [data (lookup-entry config id :position)]
    (. builder position data))
  (.build builder))


(defn cfn-rule-group-ip-set-forwarded-ip-configuration-property-builder
  ""
  [id config]
  (build-cfn-rule-group-ip-set-forwarded-ip-configuration-property-builder (new CfnRuleGroup$IPSetForwardedIPConfigurationProperty$Builder) id config))


(defn build-cfn-rule-group-ip-set-reference-statement-property-builder
  "The build-cfn-rule-group-ip-set-reference-statement-property-builder function updates a CfnRuleGroup$IPSetReferenceStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$IPSetReferenceStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `ipSetForwardedIpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-forwarded-ip-config` |
"
  [^CfnRuleGroup$IPSetReferenceStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :ip-set-forwarded-ip-config)]
    (. builder ipSetForwardedIpConfig data))
  (.build builder))


(defn cfn-rule-group-ip-set-reference-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-ip-set-reference-statement-property-builder (new CfnRuleGroup$IPSetReferenceStatementProperty$Builder) id config))


(defn build-cfn-rule-group-ja3-fingerprint-property-builder
  "The build-cfn-rule-group-ja3-fingerprint-property-builder function updates a CfnRuleGroup$JA3FingerprintProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$JA3FingerprintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |
"
  [^CfnRuleGroup$JA3FingerprintProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :fallback-behavior)]
    (. builder fallbackBehavior data))
  (.build builder))


(defn cfn-rule-group-ja3-fingerprint-property-builder
  ""
  [id config]
  (build-cfn-rule-group-ja3-fingerprint-property-builder (new CfnRuleGroup$JA3FingerprintProperty$Builder) id config))


(defn build-cfn-rule-group-json-body-property-builder
  "The build-cfn-rule-group-json-body-property-builder function updates a CfnRuleGroup$JsonBodyProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$JsonBodyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invalidFallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:invalid-fallback-behavior` |
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$JsonMatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |
"
  [^CfnRuleGroup$JsonBodyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :invalid-fallback-behavior)]
    (. builder invalidFallbackBehavior data))
  (when-let [data (lookup-entry config id :match-pattern)]
    (. builder matchPattern data))
  (when-let [data (lookup-entry config id :match-scope)]
    (. builder matchScope data))
  (when-let [data (lookup-entry config id :oversize-handling)]
    (. builder oversizeHandling data))
  (.build builder))


(defn cfn-rule-group-json-body-property-builder
  ""
  [id config]
  (build-cfn-rule-group-json-body-property-builder (new CfnRuleGroup$JsonBodyProperty$Builder) id config))


(defn build-cfn-rule-group-json-match-pattern-property-builder
  "The build-cfn-rule-group-json-match-pattern-property-builder function updates a CfnRuleGroup$JsonMatchPatternProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$JsonMatchPatternProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `includedPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:included-paths` |
"
  [^CfnRuleGroup$JsonMatchPatternProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :all)]
    (. builder all data))
  (when-let [data (lookup-entry config id :included-paths)]
    (. builder includedPaths data))
  (.build builder))


(defn cfn-rule-group-json-match-pattern-property-builder
  ""
  [id config]
  (build-cfn-rule-group-json-match-pattern-property-builder (new CfnRuleGroup$JsonMatchPatternProperty$Builder) id config))


(defn build-cfn-rule-group-label-match-statement-property-builder
  "The build-cfn-rule-group-label-match-statement-property-builder function updates a CfnRuleGroup$LabelMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$LabelMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
"
  [^CfnRuleGroup$LabelMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (.build builder))


(defn cfn-rule-group-label-match-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-label-match-statement-property-builder (new CfnRuleGroup$LabelMatchStatementProperty$Builder) id config))


(defn build-cfn-rule-group-label-property-builder
  "The build-cfn-rule-group-label-property-builder function updates a CfnRuleGroup$LabelProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$LabelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnRuleGroup$LabelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-rule-group-label-property-builder
  ""
  [id config]
  (build-cfn-rule-group-label-property-builder (new CfnRuleGroup$LabelProperty$Builder) id config))


(defn build-cfn-rule-group-label-summary-property-builder
  "The build-cfn-rule-group-label-summary-property-builder function updates a CfnRuleGroup$LabelSummaryProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$LabelSummaryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnRuleGroup$LabelSummaryProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-rule-group-label-summary-property-builder
  ""
  [id config]
  (build-cfn-rule-group-label-summary-property-builder (new CfnRuleGroup$LabelSummaryProperty$Builder) id config))


(defn build-cfn-rule-group-not-statement-property-builder
  "The build-cfn-rule-group-not-statement-property-builder function updates a CfnRuleGroup$NotStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$NotStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:statement` |
"
  [^CfnRuleGroup$NotStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :statement)]
    (. builder statement data))
  (.build builder))


(defn cfn-rule-group-not-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-not-statement-property-builder (new CfnRuleGroup$NotStatementProperty$Builder) id config))


(defn build-cfn-rule-group-or-statement-property-builder
  "The build-cfn-rule-group-or-statement-property-builder function updates a CfnRuleGroup$OrStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$OrStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statements` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:statements` |
"
  [^CfnRuleGroup$OrStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :statements)]
    (. builder statements data))
  (.build builder))


(defn cfn-rule-group-or-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-or-statement-property-builder (new CfnRuleGroup$OrStatementProperty$Builder) id config))


(defn build-cfn-rule-group-props-builder
  "The build-cfn-rule-group-props-builder function updates a CfnRuleGroupProps$Builder instance using the provided configuration.
  The function takes the CfnRuleGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availableLabels` | java.util.List | [[cdk.support/lookup-entry]] | `:available-labels` |
| `capacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:capacity` |
| `consumedLabels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:consumed-labels` |
| `customResponseBodies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-response-bodies` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `visibilityConfig` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$VisibilityConfigProperty | [[cdk.support/lookup-entry]] | `:visibility-config` |
"
  [^CfnRuleGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :available-labels)]
    (. builder availableLabels data))
  (when-let [data (lookup-entry config id :capacity)]
    (. builder capacity data))
  (when-let [data (lookup-entry config id :consumed-labels)]
    (. builder consumedLabels data))
  (when-let [data (lookup-entry config id :custom-response-bodies)]
    (. builder customResponseBodies data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :visibility-config)]
    (. builder visibilityConfig data))
  (.build builder))


(defn cfn-rule-group-props-builder
  ""
  [id config]
  (build-cfn-rule-group-props-builder (new CfnRuleGroupProps$Builder) id config))


(defn build-cfn-rule-group-rate-based-statement-custom-key-property-builder
  "The build-cfn-rule-group-rate-based-statement-custom-key-property-builder function updates a CfnRuleGroup$RateBasedStatementCustomKeyProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RateBasedStatementCustomKeyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookie` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cookie` |
| `forwardedIp` | java.lang.Object | [[cdk.support/lookup-entry]] | `:forwarded-ip` |
| `header` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$RateLimitHeaderProperty | [[cdk.support/lookup-entry]] | `:header` |
| `httpMethod` | java.lang.Object | [[cdk.support/lookup-entry]] | `:http-method` |
| `ip` | java.lang.Object | [[cdk.support/lookup-entry]] | `:ip` |
| `labelNamespace` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$RateLimitLabelNamespaceProperty | [[cdk.support/lookup-entry]] | `:label-namespace` |
| `queryArgument` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-argument` |
| `queryString` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$RateLimitQueryStringProperty | [[cdk.support/lookup-entry]] | `:query-string` |
| `uriPath` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$RateLimitUriPathProperty | [[cdk.support/lookup-entry]] | `:uri-path` |
"
  [^CfnRuleGroup$RateBasedStatementCustomKeyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cookie)]
    (. builder cookie data))
  (when-let [data (lookup-entry config id :forwarded-ip)]
    (. builder forwardedIp data))
  (when-let [data (lookup-entry config id :header)]
    (. builder header data))
  (when-let [data (lookup-entry config id :http-method)]
    (. builder httpMethod data))
  (when-let [data (lookup-entry config id :ip)]
    (. builder ip data))
  (when-let [data (lookup-entry config id :label-namespace)]
    (. builder labelNamespace data))
  (when-let [data (lookup-entry config id :query-argument)]
    (. builder queryArgument data))
  (when-let [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-let [data (lookup-entry config id :uri-path)]
    (. builder uriPath data))
  (.build builder))


(defn cfn-rule-group-rate-based-statement-custom-key-property-builder
  ""
  [id config]
  (build-cfn-rule-group-rate-based-statement-custom-key-property-builder (new CfnRuleGroup$RateBasedStatementCustomKeyProperty$Builder) id config))


(defn build-cfn-rule-group-rate-based-statement-property-builder
  "The build-cfn-rule-group-rate-based-statement-property-builder function updates a CfnRuleGroup$RateBasedStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RateBasedStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregateKeyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregate-key-type` |
| `customKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-keys` |
| `evaluationWindowSec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-window-sec` |
| `forwardedIpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forwarded-ip-config` |
| `limit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:limit` |
| `scopeDownStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scope-down-statement` |
"
  [^CfnRuleGroup$RateBasedStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aggregate-key-type)]
    (. builder aggregateKeyType data))
  (when-let [data (lookup-entry config id :custom-keys)]
    (. builder customKeys data))
  (when-let [data (lookup-entry config id :evaluation-window-sec)]
    (. builder evaluationWindowSec data))
  (when-let [data (lookup-entry config id :forwarded-ip-config)]
    (. builder forwardedIpConfig data))
  (when-let [data (lookup-entry config id :limit)]
    (. builder limit data))
  (when-let [data (lookup-entry config id :scope-down-statement)]
    (. builder scopeDownStatement data))
  (.build builder))


(defn cfn-rule-group-rate-based-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-rate-based-statement-property-builder (new CfnRuleGroup$RateBasedStatementProperty$Builder) id config))


(defn build-cfn-rule-group-rate-limit-cookie-property-builder
  "The build-cfn-rule-group-rate-limit-cookie-property-builder function updates a CfnRuleGroup$RateLimitCookieProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RateLimitCookieProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnRuleGroup$RateLimitCookieProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-rule-group-rate-limit-cookie-property-builder
  ""
  [id config]
  (build-cfn-rule-group-rate-limit-cookie-property-builder (new CfnRuleGroup$RateLimitCookieProperty$Builder) id config))


(defn build-cfn-rule-group-rate-limit-header-property-builder
  "The build-cfn-rule-group-rate-limit-header-property-builder function updates a CfnRuleGroup$RateLimitHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RateLimitHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnRuleGroup$RateLimitHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-rule-group-rate-limit-header-property-builder
  ""
  [id config]
  (build-cfn-rule-group-rate-limit-header-property-builder (new CfnRuleGroup$RateLimitHeaderProperty$Builder) id config))


(defn build-cfn-rule-group-rate-limit-label-namespace-property-builder
  "The build-cfn-rule-group-rate-limit-label-namespace-property-builder function updates a CfnRuleGroup$RateLimitLabelNamespaceProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RateLimitLabelNamespaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnRuleGroup$RateLimitLabelNamespaceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-rule-group-rate-limit-label-namespace-property-builder
  ""
  [id config]
  (build-cfn-rule-group-rate-limit-label-namespace-property-builder (new CfnRuleGroup$RateLimitLabelNamespaceProperty$Builder) id config))


(defn build-cfn-rule-group-rate-limit-query-argument-property-builder
  "The build-cfn-rule-group-rate-limit-query-argument-property-builder function updates a CfnRuleGroup$RateLimitQueryArgumentProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RateLimitQueryArgumentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnRuleGroup$RateLimitQueryArgumentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-rule-group-rate-limit-query-argument-property-builder
  ""
  [id config]
  (build-cfn-rule-group-rate-limit-query-argument-property-builder (new CfnRuleGroup$RateLimitQueryArgumentProperty$Builder) id config))


(defn build-cfn-rule-group-rate-limit-query-string-property-builder
  "The build-cfn-rule-group-rate-limit-query-string-property-builder function updates a CfnRuleGroup$RateLimitQueryStringProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RateLimitQueryStringProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnRuleGroup$RateLimitQueryStringProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-rule-group-rate-limit-query-string-property-builder
  ""
  [id config]
  (build-cfn-rule-group-rate-limit-query-string-property-builder (new CfnRuleGroup$RateLimitQueryStringProperty$Builder) id config))


(defn build-cfn-rule-group-rate-limit-uri-path-property-builder
  "The build-cfn-rule-group-rate-limit-uri-path-property-builder function updates a CfnRuleGroup$RateLimitUriPathProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RateLimitUriPathProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnRuleGroup$RateLimitUriPathProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-rule-group-rate-limit-uri-path-property-builder
  ""
  [id config]
  (build-cfn-rule-group-rate-limit-uri-path-property-builder (new CfnRuleGroup$RateLimitUriPathProperty$Builder) id config))


(defn build-cfn-rule-group-regex-match-statement-property-builder
  "The build-cfn-rule-group-regex-match-statement-property-builder function updates a CfnRuleGroup$RegexMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RegexMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `regexString` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex-string` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnRuleGroup$RegexMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :regex-string)]
    (. builder regexString data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-rule-group-regex-match-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-regex-match-statement-property-builder (new CfnRuleGroup$RegexMatchStatementProperty$Builder) id config))


(defn build-cfn-rule-group-regex-pattern-set-reference-statement-property-builder
  "The build-cfn-rule-group-regex-pattern-set-reference-statement-property-builder function updates a CfnRuleGroup$RegexPatternSetReferenceStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RegexPatternSetReferenceStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `fieldToMatch` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnRuleGroup$RegexPatternSetReferenceStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-rule-group-regex-pattern-set-reference-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-regex-pattern-set-reference-statement-property-builder (new CfnRuleGroup$RegexPatternSetReferenceStatementProperty$Builder) id config))


(defn build-cfn-rule-group-rule-action-property-builder
  "The build-cfn-rule-group-rule-action-property-builder function updates a CfnRuleGroup$RuleActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RuleActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allow` | java.lang.Object | [[cdk.support/lookup-entry]] | `:allow` |
| `block` | java.lang.Object | [[cdk.support/lookup-entry]] | `:block` |
| `captcha` | java.lang.Object | [[cdk.support/lookup-entry]] | `:captcha` |
| `challenge` | java.lang.Object | [[cdk.support/lookup-entry]] | `:challenge` |
| `count` | java.lang.Object | [[cdk.support/lookup-entry]] | `:count` |
"
  [^CfnRuleGroup$RuleActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow)]
    (. builder allow data))
  (when-let [data (lookup-entry config id :block)]
    (. builder block data))
  (when-let [data (lookup-entry config id :captcha)]
    (. builder captcha data))
  (when-let [data (lookup-entry config id :challenge)]
    (. builder challenge data))
  (when-let [data (lookup-entry config id :count)]
    (. builder count data))
  (.build builder))


(defn cfn-rule-group-rule-action-property-builder
  ""
  [id config]
  (build-cfn-rule-group-rule-action-property-builder (new CfnRuleGroup$RuleActionProperty$Builder) id config))


(defn build-cfn-rule-group-rule-property-builder
  "The build-cfn-rule-group-rule-property-builder function updates a CfnRuleGroup$RuleProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$RuleActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `captchaConfig` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$CaptchaConfigProperty | [[cdk.support/lookup-entry]] | `:captcha-config` |
| `challengeConfig` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$ChallengeConfigProperty | [[cdk.support/lookup-entry]] | `:challenge-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `ruleLabels` | java.util.List | [[cdk.support/lookup-entry]] | `:rule-labels` |
| `statement` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$StatementProperty | [[cdk.support/lookup-entry]] | `:statement` |
| `visibilityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:visibility-config` |
"
  [^CfnRuleGroup$RuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :captcha-config)]
    (. builder captchaConfig data))
  (when-let [data (lookup-entry config id :challenge-config)]
    (. builder challengeConfig data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :rule-labels)]
    (. builder ruleLabels data))
  (when-let [data (lookup-entry config id :statement)]
    (. builder statement data))
  (when-let [data (lookup-entry config id :visibility-config)]
    (. builder visibilityConfig data))
  (.build builder))


(defn cfn-rule-group-rule-property-builder
  ""
  [id config]
  (build-cfn-rule-group-rule-property-builder (new CfnRuleGroup$RuleProperty$Builder) id config))


(defn build-cfn-rule-group-single-header-property-builder
  "The build-cfn-rule-group-single-header-property-builder function updates a CfnRuleGroup$SingleHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$SingleHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnRuleGroup$SingleHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-rule-group-single-header-property-builder
  ""
  [id config]
  (build-cfn-rule-group-single-header-property-builder (new CfnRuleGroup$SingleHeaderProperty$Builder) id config))


(defn build-cfn-rule-group-single-query-argument-property-builder
  "The build-cfn-rule-group-single-query-argument-property-builder function updates a CfnRuleGroup$SingleQueryArgumentProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$SingleQueryArgumentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnRuleGroup$SingleQueryArgumentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-rule-group-single-query-argument-property-builder
  ""
  [id config]
  (build-cfn-rule-group-single-query-argument-property-builder (new CfnRuleGroup$SingleQueryArgumentProperty$Builder) id config))


(defn build-cfn-rule-group-size-constraint-statement-property-builder
  "The build-cfn-rule-group-size-constraint-statement-property-builder function updates a CfnRuleGroup$SizeConstraintStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$SizeConstraintStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `fieldToMatch` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnRuleGroup$SizeConstraintStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :size)]
    (. builder size data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-rule-group-size-constraint-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-size-constraint-statement-property-builder (new CfnRuleGroup$SizeConstraintStatementProperty$Builder) id config))


(defn build-cfn-rule-group-sqli-match-statement-property-builder
  "The build-cfn-rule-group-sqli-match-statement-property-builder function updates a CfnRuleGroup$SqliMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$SqliMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `sensitivityLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:sensitivity-level` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnRuleGroup$SqliMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :sensitivity-level)]
    (. builder sensitivityLevel data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-rule-group-sqli-match-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-sqli-match-statement-property-builder (new CfnRuleGroup$SqliMatchStatementProperty$Builder) id config))


(defn build-cfn-rule-group-statement-property-builder
  "The build-cfn-rule-group-statement-property-builder function updates a CfnRuleGroup$StatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$StatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `andStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:and-statement` |
| `byteMatchStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:byte-match-statement` |
| `geoMatchStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:geo-match-statement` |
| `ipSetReferenceStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-reference-statement` |
| `labelMatchStatement` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$LabelMatchStatementProperty | [[cdk.support/lookup-entry]] | `:label-match-statement` |
| `notStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:not-statement` |
| `orStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:or-statement` |
| `rateBasedStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rate-based-statement` |
| `regexMatchStatement` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$RegexMatchStatementProperty | [[cdk.support/lookup-entry]] | `:regex-match-statement` |
| `regexPatternSetReferenceStatement` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$RegexPatternSetReferenceStatementProperty | [[cdk.support/lookup-entry]] | `:regex-pattern-set-reference-statement` |
| `sizeConstraintStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:size-constraint-statement` |
| `sqliMatchStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sqli-match-statement` |
| `xssMatchStatement` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$XssMatchStatementProperty | [[cdk.support/lookup-entry]] | `:xss-match-statement` |
"
  [^CfnRuleGroup$StatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :and-statement)]
    (. builder andStatement data))
  (when-let [data (lookup-entry config id :byte-match-statement)]
    (. builder byteMatchStatement data))
  (when-let [data (lookup-entry config id :geo-match-statement)]
    (. builder geoMatchStatement data))
  (when-let [data (lookup-entry config id :ip-set-reference-statement)]
    (. builder ipSetReferenceStatement data))
  (when-let [data (lookup-entry config id :label-match-statement)]
    (. builder labelMatchStatement data))
  (when-let [data (lookup-entry config id :not-statement)]
    (. builder notStatement data))
  (when-let [data (lookup-entry config id :or-statement)]
    (. builder orStatement data))
  (when-let [data (lookup-entry config id :rate-based-statement)]
    (. builder rateBasedStatement data))
  (when-let [data (lookup-entry config id :regex-match-statement)]
    (. builder regexMatchStatement data))
  (when-let [data (lookup-entry config id :regex-pattern-set-reference-statement)]
    (. builder regexPatternSetReferenceStatement data))
  (when-let [data (lookup-entry config id :size-constraint-statement)]
    (. builder sizeConstraintStatement data))
  (when-let [data (lookup-entry config id :sqli-match-statement)]
    (. builder sqliMatchStatement data))
  (when-let [data (lookup-entry config id :xss-match-statement)]
    (. builder xssMatchStatement data))
  (.build builder))


(defn cfn-rule-group-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-statement-property-builder (new CfnRuleGroup$StatementProperty$Builder) id config))


(defn build-cfn-rule-group-text-transformation-property-builder
  "The build-cfn-rule-group-text-transformation-property-builder function updates a CfnRuleGroup$TextTransformationProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$TextTransformationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnRuleGroup$TextTransformationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-rule-group-text-transformation-property-builder
  ""
  [id config]
  (build-cfn-rule-group-text-transformation-property-builder (new CfnRuleGroup$TextTransformationProperty$Builder) id config))


(defn build-cfn-rule-group-visibility-config-property-builder
  "The build-cfn-rule-group-visibility-config-property-builder function updates a CfnRuleGroup$VisibilityConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$VisibilityConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-metrics-enabled` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `sampledRequestsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sampled-requests-enabled` |
"
  [^CfnRuleGroup$VisibilityConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-metrics-enabled)]
    (. builder cloudWatchMetricsEnabled data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :sampled-requests-enabled)]
    (. builder sampledRequestsEnabled data))
  (.build builder))


(defn cfn-rule-group-visibility-config-property-builder
  ""
  [id config]
  (build-cfn-rule-group-visibility-config-property-builder (new CfnRuleGroup$VisibilityConfigProperty$Builder) id config))


(defn build-cfn-rule-group-xss-match-statement-property-builder
  "The build-cfn-rule-group-xss-match-statement-property-builder function updates a CfnRuleGroup$XssMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$XssMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnRuleGroup$XssMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-rule-group-xss-match-statement-property-builder
  ""
  [id config]
  (build-cfn-rule-group-xss-match-statement-property-builder (new CfnRuleGroup$XssMatchStatementProperty$Builder) id config))


(defn build-cfn-web-acl-allow-action-property-builder
  "The build-cfn-web-acl-allow-action-property-builder function updates a CfnWebACL$AllowActionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$AllowActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.services.wafv2.CfnWebACL$CustomRequestHandlingProperty | [[cdk.support/lookup-entry]] | `:custom-request-handling` |
"
  [^CfnWebACL$AllowActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-request-handling)]
    (. builder customRequestHandling data))
  (.build builder))


(defn cfn-web-acl-allow-action-property-builder
  ""
  [id config]
  (build-cfn-web-acl-allow-action-property-builder (new CfnWebACL$AllowActionProperty$Builder) id config))


(defn build-cfn-web-acl-and-statement-property-builder
  "The build-cfn-web-acl-and-statement-property-builder function updates a CfnWebACL$AndStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$AndStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
"
  [^CfnWebACL$AndStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :statements)]
    (. builder statements data))
  (.build builder))


(defn cfn-web-acl-and-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-and-statement-property-builder (new CfnWebACL$AndStatementProperty$Builder) id config))


(defn build-cfn-web-acl-association-builder
  "The build-cfn-web-acl-association-builder function updates a CfnWebACLAssociation$Builder instance using the provided configuration.
  The function takes the CfnWebACLAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `webAclArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-arn` |
"
  [^CfnWebACLAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-let [data (lookup-entry config id :web-acl-arn)]
    (. builder webAclArn data))
  (.build builder))


(defn cfn-web-acl-association-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-web-acl-association-builder (CfnWebACLAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-web-acl-association-config-property-builder
  "The build-cfn-web-acl-association-config-property-builder function updates a CfnWebACL$AssociationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$AssociationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requestBody` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:request-body` |
"
  [^CfnWebACL$AssociationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :request-body)]
    (. builder requestBody data))
  (.build builder))


(defn cfn-web-acl-association-config-property-builder
  ""
  [id config]
  (build-cfn-web-acl-association-config-property-builder (new CfnWebACL$AssociationConfigProperty$Builder) id config))


(defn build-cfn-web-acl-association-props-builder
  "The build-cfn-web-acl-association-props-builder function updates a CfnWebACLAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnWebACLAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `webAclArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-arn` |
"
  [^CfnWebACLAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (when-let [data (lookup-entry config id :web-acl-arn)]
    (. builder webAclArn data))
  (.build builder))


(defn cfn-web-acl-association-props-builder
  ""
  [id config]
  (build-cfn-web-acl-association-props-builder (new CfnWebACLAssociationProps$Builder) id config))


(defn build-cfn-web-acl-aws-managed-rules-acfp-rule-set-property-builder
  "The build-cfn-web-acl-aws-managed-rules-acfp-rule-set-property-builder function updates a CfnWebACL$AWSManagedRulesACFPRuleSetProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$AWSManagedRulesACFPRuleSetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `creationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:creation-path` |
| `enableRegexInPath` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-regex-in-path` |
| `registrationPagePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:registration-page-path` |
| `requestInspection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:request-inspection` |
| `responseInspection` | software.amazon.awscdk.services.wafv2.CfnWebACL$ResponseInspectionProperty | [[cdk.support/lookup-entry]] | `:response-inspection` |
"
  [^CfnWebACL$AWSManagedRulesACFPRuleSetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :creation-path)]
    (. builder creationPath data))
  (when-let [data (lookup-entry config id :enable-regex-in-path)]
    (. builder enableRegexInPath data))
  (when-let [data (lookup-entry config id :registration-page-path)]
    (. builder registrationPagePath data))
  (when-let [data (lookup-entry config id :request-inspection)]
    (. builder requestInspection data))
  (when-let [data (lookup-entry config id :response-inspection)]
    (. builder responseInspection data))
  (.build builder))


(defn cfn-web-acl-aws-managed-rules-acfp-rule-set-property-builder
  ""
  [id config]
  (build-cfn-web-acl-aws-managed-rules-acfp-rule-set-property-builder (new CfnWebACL$AWSManagedRulesACFPRuleSetProperty$Builder) id config))


(defn build-cfn-web-acl-aws-managed-rules-atp-rule-set-property-builder
  "The build-cfn-web-acl-aws-managed-rules-atp-rule-set-property-builder function updates a CfnWebACL$AWSManagedRulesATPRuleSetProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$AWSManagedRulesATPRuleSetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableRegexInPath` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-regex-in-path` |
| `loginPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:login-path` |
| `requestInspection` | software.amazon.awscdk.services.wafv2.CfnWebACL$RequestInspectionProperty | [[cdk.support/lookup-entry]] | `:request-inspection` |
| `responseInspection` | software.amazon.awscdk.services.wafv2.CfnWebACL$ResponseInspectionProperty | [[cdk.support/lookup-entry]] | `:response-inspection` |
"
  [^CfnWebACL$AWSManagedRulesATPRuleSetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-regex-in-path)]
    (. builder enableRegexInPath data))
  (when-let [data (lookup-entry config id :login-path)]
    (. builder loginPath data))
  (when-let [data (lookup-entry config id :request-inspection)]
    (. builder requestInspection data))
  (when-let [data (lookup-entry config id :response-inspection)]
    (. builder responseInspection data))
  (.build builder))


(defn cfn-web-acl-aws-managed-rules-atp-rule-set-property-builder
  ""
  [id config]
  (build-cfn-web-acl-aws-managed-rules-atp-rule-set-property-builder (new CfnWebACL$AWSManagedRulesATPRuleSetProperty$Builder) id config))


(defn build-cfn-web-acl-aws-managed-rules-bot-control-rule-set-property-builder
  "The build-cfn-web-acl-aws-managed-rules-bot-control-rule-set-property-builder function updates a CfnWebACL$AWSManagedRulesBotControlRuleSetProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$AWSManagedRulesBotControlRuleSetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableMachineLearning` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-machine-learning` |
| `inspectionLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:inspection-level` |
"
  [^CfnWebACL$AWSManagedRulesBotControlRuleSetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enable-machine-learning)]
    (. builder enableMachineLearning data))
  (when-let [data (lookup-entry config id :inspection-level)]
    (. builder inspectionLevel data))
  (.build builder))


(defn cfn-web-acl-aws-managed-rules-bot-control-rule-set-property-builder
  ""
  [id config]
  (build-cfn-web-acl-aws-managed-rules-bot-control-rule-set-property-builder (new CfnWebACL$AWSManagedRulesBotControlRuleSetProperty$Builder) id config))


(defn build-cfn-web-acl-block-action-property-builder
  "The build-cfn-web-acl-block-action-property-builder function updates a CfnWebACL$BlockActionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$BlockActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customResponse` | software.amazon.awscdk.services.wafv2.CfnWebACL$CustomResponseProperty | [[cdk.support/lookup-entry]] | `:custom-response` |
"
  [^CfnWebACL$BlockActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-response)]
    (. builder customResponse data))
  (.build builder))


(defn cfn-web-acl-block-action-property-builder
  ""
  [id config]
  (build-cfn-web-acl-block-action-property-builder (new CfnWebACL$BlockActionProperty$Builder) id config))


(defn build-cfn-web-acl-body-property-builder
  "The build-cfn-web-acl-body-property-builder function updates a CfnWebACL$BodyProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$BodyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |
"
  [^CfnWebACL$BodyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :oversize-handling)]
    (. builder oversizeHandling data))
  (.build builder))


(defn cfn-web-acl-body-property-builder
  ""
  [id config]
  (build-cfn-web-acl-body-property-builder (new CfnWebACL$BodyProperty$Builder) id config))


(defn build-cfn-web-acl-builder
  "The build-cfn-web-acl-builder function updates a CfnWebACL$Builder instance using the provided configuration.
  The function takes the CfnWebACL$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:association-config` |
| `captchaConfig` | software.amazon.awscdk.services.wafv2.CfnWebACL$CaptchaConfigProperty | [[cdk.support/lookup-entry]] | `:captcha-config` |
| `challengeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:challenge-config` |
| `customResponseBodies` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-response-bodies` |
| `defaultAction` | software.amazon.awscdk.services.wafv2.CfnWebACL$DefaultActionProperty | [[cdk.support/lookup-entry]] | `:default-action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tokenDomains` | java.util.List | [[cdk.support/lookup-entry]] | `:token-domains` |
| `visibilityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:visibility-config` |
"
  [^CfnWebACL$Builder builder id config]
  (when-let [data (lookup-entry config id :association-config)]
    (. builder associationConfig data))
  (when-let [data (lookup-entry config id :captcha-config)]
    (. builder captchaConfig data))
  (when-let [data (lookup-entry config id :challenge-config)]
    (. builder challengeConfig data))
  (when-let [data (lookup-entry config id :custom-response-bodies)]
    (. builder customResponseBodies data))
  (when-let [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :token-domains)]
    (. builder tokenDomains data))
  (when-let [data (lookup-entry config id :visibility-config)]
    (. builder visibilityConfig data))
  (.build builder))


(defn cfn-web-acl-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-web-acl-builder (CfnWebACL$Builder/create scope (name id)) id config))


(defn build-cfn-web-acl-byte-match-statement-property-builder
  "The build-cfn-web-acl-byte-match-statement-property-builder function updates a CfnWebACL$ByteMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ByteMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `positionalConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:positional-constraint` |
| `searchString` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-string` |
| `searchStringBase64` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-string-base64` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnWebACL$ByteMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :positional-constraint)]
    (. builder positionalConstraint data))
  (when-let [data (lookup-entry config id :search-string)]
    (. builder searchString data))
  (when-let [data (lookup-entry config id :search-string-base64)]
    (. builder searchStringBase64 data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-web-acl-byte-match-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-byte-match-statement-property-builder (new CfnWebACL$ByteMatchStatementProperty$Builder) id config))


(defn build-cfn-web-acl-captcha-action-property-builder
  "The build-cfn-web-acl-captcha-action-property-builder function updates a CfnWebACL$CaptchaActionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$CaptchaActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-request-handling` |
"
  [^CfnWebACL$CaptchaActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-request-handling)]
    (. builder customRequestHandling data))
  (.build builder))


(defn cfn-web-acl-captcha-action-property-builder
  ""
  [id config]
  (build-cfn-web-acl-captcha-action-property-builder (new CfnWebACL$CaptchaActionProperty$Builder) id config))


(defn build-cfn-web-acl-captcha-config-property-builder
  "The build-cfn-web-acl-captcha-config-property-builder function updates a CfnWebACL$CaptchaConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$CaptchaConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTimeProperty` | software.amazon.awscdk.services.wafv2.CfnWebACL$ImmunityTimePropertyProperty | [[cdk.support/lookup-entry]] | `:immunity-time-property` |
"
  [^CfnWebACL$CaptchaConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :immunity-time-property)]
    (. builder immunityTimeProperty data))
  (.build builder))


(defn cfn-web-acl-captcha-config-property-builder
  ""
  [id config]
  (build-cfn-web-acl-captcha-config-property-builder (new CfnWebACL$CaptchaConfigProperty$Builder) id config))


(defn build-cfn-web-acl-challenge-action-property-builder
  "The build-cfn-web-acl-challenge-action-property-builder function updates a CfnWebACL$ChallengeActionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ChallengeActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.services.wafv2.CfnWebACL$CustomRequestHandlingProperty | [[cdk.support/lookup-entry]] | `:custom-request-handling` |
"
  [^CfnWebACL$ChallengeActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-request-handling)]
    (. builder customRequestHandling data))
  (.build builder))


(defn cfn-web-acl-challenge-action-property-builder
  ""
  [id config]
  (build-cfn-web-acl-challenge-action-property-builder (new CfnWebACL$ChallengeActionProperty$Builder) id config))


(defn build-cfn-web-acl-challenge-config-property-builder
  "The build-cfn-web-acl-challenge-config-property-builder function updates a CfnWebACL$ChallengeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ChallengeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTimeProperty` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:immunity-time-property` |
"
  [^CfnWebACL$ChallengeConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :immunity-time-property)]
    (. builder immunityTimeProperty data))
  (.build builder))


(defn cfn-web-acl-challenge-config-property-builder
  ""
  [id config]
  (build-cfn-web-acl-challenge-config-property-builder (new CfnWebACL$ChallengeConfigProperty$Builder) id config))


(defn build-cfn-web-acl-cookie-match-pattern-property-builder
  "The build-cfn-web-acl-cookie-match-pattern-property-builder function updates a CfnWebACL$CookieMatchPatternProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$CookieMatchPatternProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `excludedCookies` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-cookies` |
| `includedCookies` | java.util.List | [[cdk.support/lookup-entry]] | `:included-cookies` |
"
  [^CfnWebACL$CookieMatchPatternProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :all)]
    (. builder all data))
  (when-let [data (lookup-entry config id :excluded-cookies)]
    (. builder excludedCookies data))
  (when-let [data (lookup-entry config id :included-cookies)]
    (. builder includedCookies data))
  (.build builder))


(defn cfn-web-acl-cookie-match-pattern-property-builder
  ""
  [id config]
  (build-cfn-web-acl-cookie-match-pattern-property-builder (new CfnWebACL$CookieMatchPatternProperty$Builder) id config))


(defn build-cfn-web-acl-cookies-property-builder
  "The build-cfn-web-acl-cookies-property-builder function updates a CfnWebACL$CookiesProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$CookiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnWebACL$CookieMatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |
"
  [^CfnWebACL$CookiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :match-pattern)]
    (. builder matchPattern data))
  (when-let [data (lookup-entry config id :match-scope)]
    (. builder matchScope data))
  (when-let [data (lookup-entry config id :oversize-handling)]
    (. builder oversizeHandling data))
  (.build builder))


(defn cfn-web-acl-cookies-property-builder
  ""
  [id config]
  (build-cfn-web-acl-cookies-property-builder (new CfnWebACL$CookiesProperty$Builder) id config))


(defn build-cfn-web-acl-count-action-property-builder
  "The build-cfn-web-acl-count-action-property-builder function updates a CfnWebACL$CountActionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$CountActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-request-handling` |
"
  [^CfnWebACL$CountActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-request-handling)]
    (. builder customRequestHandling data))
  (.build builder))


(defn cfn-web-acl-count-action-property-builder
  ""
  [id config]
  (build-cfn-web-acl-count-action-property-builder (new CfnWebACL$CountActionProperty$Builder) id config))


(defn build-cfn-web-acl-custom-http-header-property-builder
  "The build-cfn-web-acl-custom-http-header-property-builder function updates a CfnWebACL$CustomHTTPHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$CustomHTTPHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnWebACL$CustomHTTPHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-web-acl-custom-http-header-property-builder
  ""
  [id config]
  (build-cfn-web-acl-custom-http-header-property-builder (new CfnWebACL$CustomHTTPHeaderProperty$Builder) id config))


(defn build-cfn-web-acl-custom-request-handling-property-builder
  "The build-cfn-web-acl-custom-request-handling-property-builder function updates a CfnWebACL$CustomRequestHandlingProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$CustomRequestHandlingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `insertHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:insert-headers` |
"
  [^CfnWebACL$CustomRequestHandlingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :insert-headers)]
    (. builder insertHeaders data))
  (.build builder))


(defn cfn-web-acl-custom-request-handling-property-builder
  ""
  [id config]
  (build-cfn-web-acl-custom-request-handling-property-builder (new CfnWebACL$CustomRequestHandlingProperty$Builder) id config))


(defn build-cfn-web-acl-custom-response-body-property-builder
  "The build-cfn-web-acl-custom-response-body-property-builder function updates a CfnWebACL$CustomResponseBodyProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$CustomResponseBodyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |
"
  [^CfnWebACL$CustomResponseBodyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :content)]
    (. builder content data))
  (when-let [data (lookup-entry config id :content-type)]
    (. builder contentType data))
  (.build builder))


(defn cfn-web-acl-custom-response-body-property-builder
  ""
  [id config]
  (build-cfn-web-acl-custom-response-body-property-builder (new CfnWebACL$CustomResponseBodyProperty$Builder) id config))


(defn build-cfn-web-acl-custom-response-property-builder
  "The build-cfn-web-acl-custom-response-property-builder function updates a CfnWebACL$CustomResponseProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$CustomResponseProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customResponseBodyKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-response-body-key` |
| `responseCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:response-code` |
| `responseHeaders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-headers` |
"
  [^CfnWebACL$CustomResponseProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-response-body-key)]
    (. builder customResponseBodyKey data))
  (when-let [data (lookup-entry config id :response-code)]
    (. builder responseCode data))
  (when-let [data (lookup-entry config id :response-headers)]
    (. builder responseHeaders data))
  (.build builder))


(defn cfn-web-acl-custom-response-property-builder
  ""
  [id config]
  (build-cfn-web-acl-custom-response-property-builder (new CfnWebACL$CustomResponseProperty$Builder) id config))


(defn build-cfn-web-acl-default-action-property-builder
  "The build-cfn-web-acl-default-action-property-builder function updates a CfnWebACL$DefaultActionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$DefaultActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow` |
| `block` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block` |
"
  [^CfnWebACL$DefaultActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow)]
    (. builder allow data))
  (when-let [data (lookup-entry config id :block)]
    (. builder block data))
  (.build builder))


(defn cfn-web-acl-default-action-property-builder
  ""
  [id config]
  (build-cfn-web-acl-default-action-property-builder (new CfnWebACL$DefaultActionProperty$Builder) id config))


(defn build-cfn-web-acl-excluded-rule-property-builder
  "The build-cfn-web-acl-excluded-rule-property-builder function updates a CfnWebACL$ExcludedRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ExcludedRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnWebACL$ExcludedRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-web-acl-excluded-rule-property-builder
  ""
  [id config]
  (build-cfn-web-acl-excluded-rule-property-builder (new CfnWebACL$ExcludedRuleProperty$Builder) id config))


(defn build-cfn-web-acl-field-identifier-property-builder
  "The build-cfn-web-acl-field-identifier-property-builder function updates a CfnWebACL$FieldIdentifierProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$FieldIdentifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
"
  [^CfnWebACL$FieldIdentifierProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (.build builder))


(defn cfn-web-acl-field-identifier-property-builder
  ""
  [id config]
  (build-cfn-web-acl-field-identifier-property-builder (new CfnWebACL$FieldIdentifierProperty$Builder) id config))


(defn build-cfn-web-acl-field-to-match-property-builder
  "The build-cfn-web-acl-field-to-match-property-builder function updates a CfnWebACL$FieldToMatchProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$FieldToMatchProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allQueryArguments` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all-query-arguments` |
| `body` | software.amazon.awscdk.services.wafv2.CfnWebACL$BodyProperty | [[cdk.support/lookup-entry]] | `:body` |
| `cookies` | software.amazon.awscdk.services.wafv2.CfnWebACL$CookiesProperty | [[cdk.support/lookup-entry]] | `:cookies` |
| `headers` | software.amazon.awscdk.services.wafv2.CfnWebACL$HeadersProperty | [[cdk.support/lookup-entry]] | `:headers` |
| `ja3Fingerprint` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ja3-fingerprint` |
| `jsonBody` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:json-body` |
| `method` | java.lang.Object | [[cdk.support/lookup-entry]] | `:method` |
| `queryString` | java.lang.Object | [[cdk.support/lookup-entry]] | `:query-string` |
| `singleHeader` | java.lang.Object | [[cdk.support/lookup-entry]] | `:single-header` |
| `singleQueryArgument` | java.lang.Object | [[cdk.support/lookup-entry]] | `:single-query-argument` |
| `uriPath` | java.lang.Object | [[cdk.support/lookup-entry]] | `:uri-path` |
"
  [^CfnWebACL$FieldToMatchProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :all-query-arguments)]
    (. builder allQueryArguments data))
  (when-let [data (lookup-entry config id :body)]
    (. builder body data))
  (when-let [data (lookup-entry config id :cookies)]
    (. builder cookies data))
  (when-let [data (lookup-entry config id :headers)]
    (. builder headers data))
  (when-let [data (lookup-entry config id :ja3-fingerprint)]
    (. builder ja3Fingerprint data))
  (when-let [data (lookup-entry config id :json-body)]
    (. builder jsonBody data))
  (when-let [data (lookup-entry config id :method)]
    (. builder method data))
  (when-let [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-let [data (lookup-entry config id :single-header)]
    (. builder singleHeader data))
  (when-let [data (lookup-entry config id :single-query-argument)]
    (. builder singleQueryArgument data))
  (when-let [data (lookup-entry config id :uri-path)]
    (. builder uriPath data))
  (.build builder))


(defn cfn-web-acl-field-to-match-property-builder
  ""
  [id config]
  (build-cfn-web-acl-field-to-match-property-builder (new CfnWebACL$FieldToMatchProperty$Builder) id config))


(defn build-cfn-web-acl-forwarded-ip-configuration-property-builder
  "The build-cfn-web-acl-forwarded-ip-configuration-property-builder function updates a CfnWebACL$ForwardedIPConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ForwardedIPConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
"
  [^CfnWebACL$ForwardedIPConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :fallback-behavior)]
    (. builder fallbackBehavior data))
  (when-let [data (lookup-entry config id :header-name)]
    (. builder headerName data))
  (.build builder))


(defn cfn-web-acl-forwarded-ip-configuration-property-builder
  ""
  [id config]
  (build-cfn-web-acl-forwarded-ip-configuration-property-builder (new CfnWebACL$ForwardedIPConfigurationProperty$Builder) id config))


(defn build-cfn-web-acl-geo-match-statement-property-builder
  "The build-cfn-web-acl-geo-match-statement-property-builder function updates a CfnWebACL$GeoMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$GeoMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `countryCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:country-codes` |
| `forwardedIpConfig` | software.amazon.awscdk.services.wafv2.CfnWebACL$ForwardedIPConfigurationProperty | [[cdk.support/lookup-entry]] | `:forwarded-ip-config` |
"
  [^CfnWebACL$GeoMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :country-codes)]
    (. builder countryCodes data))
  (when-let [data (lookup-entry config id :forwarded-ip-config)]
    (. builder forwardedIpConfig data))
  (.build builder))


(defn cfn-web-acl-geo-match-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-geo-match-statement-property-builder (new CfnWebACL$GeoMatchStatementProperty$Builder) id config))


(defn build-cfn-web-acl-header-match-pattern-property-builder
  "The build-cfn-web-acl-header-match-pattern-property-builder function updates a CfnWebACL$HeaderMatchPatternProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$HeaderMatchPatternProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `excludedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-headers` |
| `includedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:included-headers` |
"
  [^CfnWebACL$HeaderMatchPatternProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :all)]
    (. builder all data))
  (when-let [data (lookup-entry config id :excluded-headers)]
    (. builder excludedHeaders data))
  (when-let [data (lookup-entry config id :included-headers)]
    (. builder includedHeaders data))
  (.build builder))


(defn cfn-web-acl-header-match-pattern-property-builder
  ""
  [id config]
  (build-cfn-web-acl-header-match-pattern-property-builder (new CfnWebACL$HeaderMatchPatternProperty$Builder) id config))


(defn build-cfn-web-acl-headers-property-builder
  "The build-cfn-web-acl-headers-property-builder function updates a CfnWebACL$HeadersProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$HeadersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnWebACL$HeaderMatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |
"
  [^CfnWebACL$HeadersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :match-pattern)]
    (. builder matchPattern data))
  (when-let [data (lookup-entry config id :match-scope)]
    (. builder matchScope data))
  (when-let [data (lookup-entry config id :oversize-handling)]
    (. builder oversizeHandling data))
  (.build builder))


(defn cfn-web-acl-headers-property-builder
  ""
  [id config]
  (build-cfn-web-acl-headers-property-builder (new CfnWebACL$HeadersProperty$Builder) id config))


(defn build-cfn-web-acl-immunity-time-property-property-builder
  "The build-cfn-web-acl-immunity-time-property-property-builder function updates a CfnWebACL$ImmunityTimePropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ImmunityTimePropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:immunity-time` |
"
  [^CfnWebACL$ImmunityTimePropertyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :immunity-time)]
    (. builder immunityTime data))
  (.build builder))


(defn cfn-web-acl-immunity-time-property-property-builder
  ""
  [id config]
  (build-cfn-web-acl-immunity-time-property-property-builder (new CfnWebACL$ImmunityTimePropertyProperty$Builder) id config))


(defn build-cfn-web-acl-ip-set-forwarded-ip-configuration-property-builder
  "The build-cfn-web-acl-ip-set-forwarded-ip-configuration-property-builder function updates a CfnWebACL$IPSetForwardedIPConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$IPSetForwardedIPConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `position` | java.lang.String | [[cdk.support/lookup-entry]] | `:position` |
"
  [^CfnWebACL$IPSetForwardedIPConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :fallback-behavior)]
    (. builder fallbackBehavior data))
  (when-let [data (lookup-entry config id :header-name)]
    (. builder headerName data))
  (when-let [data (lookup-entry config id :position)]
    (. builder position data))
  (.build builder))


(defn cfn-web-acl-ip-set-forwarded-ip-configuration-property-builder
  ""
  [id config]
  (build-cfn-web-acl-ip-set-forwarded-ip-configuration-property-builder (new CfnWebACL$IPSetForwardedIPConfigurationProperty$Builder) id config))


(defn build-cfn-web-acl-ip-set-reference-statement-property-builder
  "The build-cfn-web-acl-ip-set-reference-statement-property-builder function updates a CfnWebACL$IPSetReferenceStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$IPSetReferenceStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `ipSetForwardedIpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-forwarded-ip-config` |
"
  [^CfnWebACL$IPSetReferenceStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :ip-set-forwarded-ip-config)]
    (. builder ipSetForwardedIpConfig data))
  (.build builder))


(defn cfn-web-acl-ip-set-reference-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-ip-set-reference-statement-property-builder (new CfnWebACL$IPSetReferenceStatementProperty$Builder) id config))


(defn build-cfn-web-acl-ja3-fingerprint-property-builder
  "The build-cfn-web-acl-ja3-fingerprint-property-builder function updates a CfnWebACL$JA3FingerprintProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$JA3FingerprintProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |
"
  [^CfnWebACL$JA3FingerprintProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :fallback-behavior)]
    (. builder fallbackBehavior data))
  (.build builder))


(defn cfn-web-acl-ja3-fingerprint-property-builder
  ""
  [id config]
  (build-cfn-web-acl-ja3-fingerprint-property-builder (new CfnWebACL$JA3FingerprintProperty$Builder) id config))


(defn build-cfn-web-acl-json-body-property-builder
  "The build-cfn-web-acl-json-body-property-builder function updates a CfnWebACL$JsonBodyProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$JsonBodyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invalidFallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:invalid-fallback-behavior` |
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnWebACL$JsonMatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |
"
  [^CfnWebACL$JsonBodyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :invalid-fallback-behavior)]
    (. builder invalidFallbackBehavior data))
  (when-let [data (lookup-entry config id :match-pattern)]
    (. builder matchPattern data))
  (when-let [data (lookup-entry config id :match-scope)]
    (. builder matchScope data))
  (when-let [data (lookup-entry config id :oversize-handling)]
    (. builder oversizeHandling data))
  (.build builder))


(defn cfn-web-acl-json-body-property-builder
  ""
  [id config]
  (build-cfn-web-acl-json-body-property-builder (new CfnWebACL$JsonBodyProperty$Builder) id config))


(defn build-cfn-web-acl-json-match-pattern-property-builder
  "The build-cfn-web-acl-json-match-pattern-property-builder function updates a CfnWebACL$JsonMatchPatternProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$JsonMatchPatternProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `includedPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:included-paths` |
"
  [^CfnWebACL$JsonMatchPatternProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :all)]
    (. builder all data))
  (when-let [data (lookup-entry config id :included-paths)]
    (. builder includedPaths data))
  (.build builder))


(defn cfn-web-acl-json-match-pattern-property-builder
  ""
  [id config]
  (build-cfn-web-acl-json-match-pattern-property-builder (new CfnWebACL$JsonMatchPatternProperty$Builder) id config))


(defn build-cfn-web-acl-label-match-statement-property-builder
  "The build-cfn-web-acl-label-match-statement-property-builder function updates a CfnWebACL$LabelMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$LabelMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
"
  [^CfnWebACL$LabelMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (.build builder))


(defn cfn-web-acl-label-match-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-label-match-statement-property-builder (new CfnWebACL$LabelMatchStatementProperty$Builder) id config))


(defn build-cfn-web-acl-label-property-builder
  "The build-cfn-web-acl-label-property-builder function updates a CfnWebACL$LabelProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$LabelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnWebACL$LabelProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-web-acl-label-property-builder
  ""
  [id config]
  (build-cfn-web-acl-label-property-builder (new CfnWebACL$LabelProperty$Builder) id config))


(defn build-cfn-web-acl-managed-rule-group-config-property-builder
  "The build-cfn-web-acl-managed-rule-group-config-property-builder function updates a CfnWebACL$ManagedRuleGroupConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ManagedRuleGroupConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsManagedRulesAcfpRuleSet` | software.amazon.awscdk.services.wafv2.CfnWebACL$AWSManagedRulesACFPRuleSetProperty | [[cdk.support/lookup-entry]] | `:aws-managed-rules-acfp-rule-set` |
| `awsManagedRulesAtpRuleSet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-managed-rules-atp-rule-set` |
| `awsManagedRulesBotControlRuleSet` | software.amazon.awscdk.services.wafv2.CfnWebACL$AWSManagedRulesBotControlRuleSetProperty | [[cdk.support/lookup-entry]] | `:aws-managed-rules-bot-control-rule-set` |
| `loginPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:login-path` |
| `passwordField` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldIdentifierProperty | [[cdk.support/lookup-entry]] | `:password-field` |
| `payloadType` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-type` |
| `usernameField` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:username-field` |
"
  [^CfnWebACL$ManagedRuleGroupConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-managed-rules-acfp-rule-set)]
    (. builder awsManagedRulesAcfpRuleSet data))
  (when-let [data (lookup-entry config id :aws-managed-rules-atp-rule-set)]
    (. builder awsManagedRulesAtpRuleSet data))
  (when-let [data (lookup-entry config id :aws-managed-rules-bot-control-rule-set)]
    (. builder awsManagedRulesBotControlRuleSet data))
  (when-let [data (lookup-entry config id :login-path)]
    (. builder loginPath data))
  (when-let [data (lookup-entry config id :password-field)]
    (. builder passwordField data))
  (when-let [data (lookup-entry config id :payload-type)]
    (. builder payloadType data))
  (when-let [data (lookup-entry config id :username-field)]
    (. builder usernameField data))
  (.build builder))


(defn cfn-web-acl-managed-rule-group-config-property-builder
  ""
  [id config]
  (build-cfn-web-acl-managed-rule-group-config-property-builder (new CfnWebACL$ManagedRuleGroupConfigProperty$Builder) id config))


(defn build-cfn-web-acl-managed-rule-group-statement-property-builder
  "The build-cfn-web-acl-managed-rule-group-statement-property-builder function updates a CfnWebACL$ManagedRuleGroupStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ManagedRuleGroupStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:excluded-rules` |
| `managedRuleGroupConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-rule-group-configs` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleActionOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:rule-action-overrides` |
| `scopeDownStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$StatementProperty | [[cdk.support/lookup-entry]] | `:scope-down-statement` |
| `vendorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor-name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnWebACL$ManagedRuleGroupStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :excluded-rules)]
    (. builder excludedRules data))
  (when-let [data (lookup-entry config id :managed-rule-group-configs)]
    (. builder managedRuleGroupConfigs data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :rule-action-overrides)]
    (. builder ruleActionOverrides data))
  (when-let [data (lookup-entry config id :scope-down-statement)]
    (. builder scopeDownStatement data))
  (when-let [data (lookup-entry config id :vendor-name)]
    (. builder vendorName data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-web-acl-managed-rule-group-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-managed-rule-group-statement-property-builder (new CfnWebACL$ManagedRuleGroupStatementProperty$Builder) id config))


(defn build-cfn-web-acl-not-statement-property-builder
  "The build-cfn-web-acl-not-statement-property-builder function updates a CfnWebACL$NotStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$NotStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statement` | software.amazon.awscdk.services.wafv2.CfnWebACL$StatementProperty | [[cdk.support/lookup-entry]] | `:statement` |
"
  [^CfnWebACL$NotStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :statement)]
    (. builder statement data))
  (.build builder))


(defn cfn-web-acl-not-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-not-statement-property-builder (new CfnWebACL$NotStatementProperty$Builder) id config))


(defn build-cfn-web-acl-or-statement-property-builder
  "The build-cfn-web-acl-or-statement-property-builder function updates a CfnWebACL$OrStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$OrStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |
"
  [^CfnWebACL$OrStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :statements)]
    (. builder statements data))
  (.build builder))


(defn cfn-web-acl-or-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-or-statement-property-builder (new CfnWebACL$OrStatementProperty$Builder) id config))


(defn build-cfn-web-acl-override-action-property-builder
  "The build-cfn-web-acl-override-action-property-builder function updates a CfnWebACL$OverrideActionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$OverrideActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Object | [[cdk.support/lookup-entry]] | `:count` |
| `none` | java.lang.Object | [[cdk.support/lookup-entry]] | `:none` |
"
  [^CfnWebACL$OverrideActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :count)]
    (. builder count data))
  (when-let [data (lookup-entry config id :none)]
    (. builder none data))
  (.build builder))


(defn cfn-web-acl-override-action-property-builder
  ""
  [id config]
  (build-cfn-web-acl-override-action-property-builder (new CfnWebACL$OverrideActionProperty$Builder) id config))


(defn build-cfn-web-acl-props-builder
  "The build-cfn-web-acl-props-builder function updates a CfnWebACLProps$Builder instance using the provided configuration.
  The function takes the CfnWebACLProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `associationConfig` | software.amazon.awscdk.services.wafv2.CfnWebACL$AssociationConfigProperty | [[cdk.support/lookup-entry]] | `:association-config` |
| `captchaConfig` | software.amazon.awscdk.services.wafv2.CfnWebACL$CaptchaConfigProperty | [[cdk.support/lookup-entry]] | `:captcha-config` |
| `challengeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:challenge-config` |
| `customResponseBodies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-response-bodies` |
| `defaultAction` | software.amazon.awscdk.services.wafv2.CfnWebACL$DefaultActionProperty | [[cdk.support/lookup-entry]] | `:default-action` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `rules` | java.util.List | [[cdk.support/lookup-entry]] | `:rules` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tokenDomains` | java.util.List | [[cdk.support/lookup-entry]] | `:token-domains` |
| `visibilityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:visibility-config` |
"
  [^CfnWebACLProps$Builder builder id config]
  (when-let [data (lookup-entry config id :association-config)]
    (. builder associationConfig data))
  (when-let [data (lookup-entry config id :captcha-config)]
    (. builder captchaConfig data))
  (when-let [data (lookup-entry config id :challenge-config)]
    (. builder challengeConfig data))
  (when-let [data (lookup-entry config id :custom-response-bodies)]
    (. builder customResponseBodies data))
  (when-let [data (lookup-entry config id :default-action)]
    (. builder defaultAction data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :rules)]
    (. builder rules data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :token-domains)]
    (. builder tokenDomains data))
  (when-let [data (lookup-entry config id :visibility-config)]
    (. builder visibilityConfig data))
  (.build builder))


(defn cfn-web-acl-props-builder
  ""
  [id config]
  (build-cfn-web-acl-props-builder (new CfnWebACLProps$Builder) id config))


(defn build-cfn-web-acl-rate-based-statement-custom-key-property-builder
  "The build-cfn-web-acl-rate-based-statement-custom-key-property-builder function updates a CfnWebACL$RateBasedStatementCustomKeyProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RateBasedStatementCustomKeyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookie` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cookie` |
| `forwardedIp` | java.lang.Object | [[cdk.support/lookup-entry]] | `:forwarded-ip` |
| `header` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:header` |
| `httpMethod` | java.lang.Object | [[cdk.support/lookup-entry]] | `:http-method` |
| `ip` | java.lang.Object | [[cdk.support/lookup-entry]] | `:ip` |
| `labelNamespace` | software.amazon.awscdk.services.wafv2.CfnWebACL$RateLimitLabelNamespaceProperty | [[cdk.support/lookup-entry]] | `:label-namespace` |
| `queryArgument` | software.amazon.awscdk.services.wafv2.CfnWebACL$RateLimitQueryArgumentProperty | [[cdk.support/lookup-entry]] | `:query-argument` |
| `queryString` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-string` |
| `uriPath` | software.amazon.awscdk.services.wafv2.CfnWebACL$RateLimitUriPathProperty | [[cdk.support/lookup-entry]] | `:uri-path` |
"
  [^CfnWebACL$RateBasedStatementCustomKeyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cookie)]
    (. builder cookie data))
  (when-let [data (lookup-entry config id :forwarded-ip)]
    (. builder forwardedIp data))
  (when-let [data (lookup-entry config id :header)]
    (. builder header data))
  (when-let [data (lookup-entry config id :http-method)]
    (. builder httpMethod data))
  (when-let [data (lookup-entry config id :ip)]
    (. builder ip data))
  (when-let [data (lookup-entry config id :label-namespace)]
    (. builder labelNamespace data))
  (when-let [data (lookup-entry config id :query-argument)]
    (. builder queryArgument data))
  (when-let [data (lookup-entry config id :query-string)]
    (. builder queryString data))
  (when-let [data (lookup-entry config id :uri-path)]
    (. builder uriPath data))
  (.build builder))


(defn cfn-web-acl-rate-based-statement-custom-key-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rate-based-statement-custom-key-property-builder (new CfnWebACL$RateBasedStatementCustomKeyProperty$Builder) id config))


(defn build-cfn-web-acl-rate-based-statement-property-builder
  "The build-cfn-web-acl-rate-based-statement-property-builder function updates a CfnWebACL$RateBasedStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RateBasedStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregateKeyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregate-key-type` |
| `customKeys` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-keys` |
| `evaluationWindowSec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-window-sec` |
| `forwardedIpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forwarded-ip-config` |
| `limit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:limit` |
| `scopeDownStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scope-down-statement` |
"
  [^CfnWebACL$RateBasedStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aggregate-key-type)]
    (. builder aggregateKeyType data))
  (when-let [data (lookup-entry config id :custom-keys)]
    (. builder customKeys data))
  (when-let [data (lookup-entry config id :evaluation-window-sec)]
    (. builder evaluationWindowSec data))
  (when-let [data (lookup-entry config id :forwarded-ip-config)]
    (. builder forwardedIpConfig data))
  (when-let [data (lookup-entry config id :limit)]
    (. builder limit data))
  (when-let [data (lookup-entry config id :scope-down-statement)]
    (. builder scopeDownStatement data))
  (.build builder))


(defn cfn-web-acl-rate-based-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rate-based-statement-property-builder (new CfnWebACL$RateBasedStatementProperty$Builder) id config))


(defn build-cfn-web-acl-rate-limit-cookie-property-builder
  "The build-cfn-web-acl-rate-limit-cookie-property-builder function updates a CfnWebACL$RateLimitCookieProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RateLimitCookieProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnWebACL$RateLimitCookieProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-web-acl-rate-limit-cookie-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rate-limit-cookie-property-builder (new CfnWebACL$RateLimitCookieProperty$Builder) id config))


(defn build-cfn-web-acl-rate-limit-header-property-builder
  "The build-cfn-web-acl-rate-limit-header-property-builder function updates a CfnWebACL$RateLimitHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RateLimitHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnWebACL$RateLimitHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-web-acl-rate-limit-header-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rate-limit-header-property-builder (new CfnWebACL$RateLimitHeaderProperty$Builder) id config))


(defn build-cfn-web-acl-rate-limit-label-namespace-property-builder
  "The build-cfn-web-acl-rate-limit-label-namespace-property-builder function updates a CfnWebACL$RateLimitLabelNamespaceProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RateLimitLabelNamespaceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |
"
  [^CfnWebACL$RateLimitLabelNamespaceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (.build builder))


(defn cfn-web-acl-rate-limit-label-namespace-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rate-limit-label-namespace-property-builder (new CfnWebACL$RateLimitLabelNamespaceProperty$Builder) id config))


(defn build-cfn-web-acl-rate-limit-query-argument-property-builder
  "The build-cfn-web-acl-rate-limit-query-argument-property-builder function updates a CfnWebACL$RateLimitQueryArgumentProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RateLimitQueryArgumentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnWebACL$RateLimitQueryArgumentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-web-acl-rate-limit-query-argument-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rate-limit-query-argument-property-builder (new CfnWebACL$RateLimitQueryArgumentProperty$Builder) id config))


(defn build-cfn-web-acl-rate-limit-query-string-property-builder
  "The build-cfn-web-acl-rate-limit-query-string-property-builder function updates a CfnWebACL$RateLimitQueryStringProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RateLimitQueryStringProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnWebACL$RateLimitQueryStringProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-web-acl-rate-limit-query-string-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rate-limit-query-string-property-builder (new CfnWebACL$RateLimitQueryStringProperty$Builder) id config))


(defn build-cfn-web-acl-rate-limit-uri-path-property-builder
  "The build-cfn-web-acl-rate-limit-uri-path-property-builder function updates a CfnWebACL$RateLimitUriPathProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RateLimitUriPathProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnWebACL$RateLimitUriPathProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-web-acl-rate-limit-uri-path-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rate-limit-uri-path-property-builder (new CfnWebACL$RateLimitUriPathProperty$Builder) id config))


(defn build-cfn-web-acl-regex-match-statement-property-builder
  "The build-cfn-web-acl-regex-match-statement-property-builder function updates a CfnWebACL$RegexMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RegexMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `regexString` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex-string` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnWebACL$RegexMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :regex-string)]
    (. builder regexString data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-web-acl-regex-match-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-regex-match-statement-property-builder (new CfnWebACL$RegexMatchStatementProperty$Builder) id config))


(defn build-cfn-web-acl-regex-pattern-set-reference-statement-property-builder
  "The build-cfn-web-acl-regex-pattern-set-reference-statement-property-builder function updates a CfnWebACL$RegexPatternSetReferenceStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RegexPatternSetReferenceStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnWebACL$RegexPatternSetReferenceStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-web-acl-regex-pattern-set-reference-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-regex-pattern-set-reference-statement-property-builder (new CfnWebACL$RegexPatternSetReferenceStatementProperty$Builder) id config))


(defn build-cfn-web-acl-request-body-associated-resource-type-config-property-builder
  "The build-cfn-web-acl-request-body-associated-resource-type-config-property-builder function updates a CfnWebACL$RequestBodyAssociatedResourceTypeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RequestBodyAssociatedResourceTypeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultSizeInspectionLimit` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-size-inspection-limit` |
"
  [^CfnWebACL$RequestBodyAssociatedResourceTypeConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-size-inspection-limit)]
    (. builder defaultSizeInspectionLimit data))
  (.build builder))


(defn cfn-web-acl-request-body-associated-resource-type-config-property-builder
  ""
  [id config]
  (build-cfn-web-acl-request-body-associated-resource-type-config-property-builder (new CfnWebACL$RequestBodyAssociatedResourceTypeConfigProperty$Builder) id config))


(defn build-cfn-web-acl-request-inspection-acfp-property-builder
  "The build-cfn-web-acl-request-inspection-acfp-property-builder function updates a CfnWebACL$RequestInspectionACFPProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RequestInspectionACFPProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressFields` | java.util.List | [[cdk.support/lookup-entry]] | `:address-fields` |
| `emailField` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldIdentifierProperty | [[cdk.support/lookup-entry]] | `:email-field` |
| `passwordField` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:password-field` |
| `payloadType` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-type` |
| `phoneNumberFields` | java.util.List | [[cdk.support/lookup-entry]] | `:phone-number-fields` |
| `usernameField` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldIdentifierProperty | [[cdk.support/lookup-entry]] | `:username-field` |
"
  [^CfnWebACL$RequestInspectionACFPProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :address-fields)]
    (. builder addressFields data))
  (when-let [data (lookup-entry config id :email-field)]
    (. builder emailField data))
  (when-let [data (lookup-entry config id :password-field)]
    (. builder passwordField data))
  (when-let [data (lookup-entry config id :payload-type)]
    (. builder payloadType data))
  (when-let [data (lookup-entry config id :phone-number-fields)]
    (. builder phoneNumberFields data))
  (when-let [data (lookup-entry config id :username-field)]
    (. builder usernameField data))
  (.build builder))


(defn cfn-web-acl-request-inspection-acfp-property-builder
  ""
  [id config]
  (build-cfn-web-acl-request-inspection-acfp-property-builder (new CfnWebACL$RequestInspectionACFPProperty$Builder) id config))


(defn build-cfn-web-acl-request-inspection-property-builder
  "The build-cfn-web-acl-request-inspection-property-builder function updates a CfnWebACL$RequestInspectionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RequestInspectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `passwordField` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldIdentifierProperty | [[cdk.support/lookup-entry]] | `:password-field` |
| `payloadType` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-type` |
| `usernameField` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:username-field` |
"
  [^CfnWebACL$RequestInspectionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :password-field)]
    (. builder passwordField data))
  (when-let [data (lookup-entry config id :payload-type)]
    (. builder payloadType data))
  (when-let [data (lookup-entry config id :username-field)]
    (. builder usernameField data))
  (.build builder))


(defn cfn-web-acl-request-inspection-property-builder
  ""
  [id config]
  (build-cfn-web-acl-request-inspection-property-builder (new CfnWebACL$RequestInspectionProperty$Builder) id config))


(defn build-cfn-web-acl-response-inspection-body-contains-property-builder
  "The build-cfn-web-acl-response-inspection-body-contains-property-builder function updates a CfnWebACL$ResponseInspectionBodyContainsProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ResponseInspectionBodyContainsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:failure-strings` |
| `successStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:success-strings` |
"
  [^CfnWebACL$ResponseInspectionBodyContainsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :failure-strings)]
    (. builder failureStrings data))
  (when-let [data (lookup-entry config id :success-strings)]
    (. builder successStrings data))
  (.build builder))


(defn cfn-web-acl-response-inspection-body-contains-property-builder
  ""
  [id config]
  (build-cfn-web-acl-response-inspection-body-contains-property-builder (new CfnWebACL$ResponseInspectionBodyContainsProperty$Builder) id config))


(defn build-cfn-web-acl-response-inspection-header-property-builder
  "The build-cfn-web-acl-response-inspection-header-property-builder function updates a CfnWebACL$ResponseInspectionHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ResponseInspectionHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureValues` | java.util.List | [[cdk.support/lookup-entry]] | `:failure-values` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `successValues` | java.util.List | [[cdk.support/lookup-entry]] | `:success-values` |
"
  [^CfnWebACL$ResponseInspectionHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :failure-values)]
    (. builder failureValues data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :success-values)]
    (. builder successValues data))
  (.build builder))


(defn cfn-web-acl-response-inspection-header-property-builder
  ""
  [id config]
  (build-cfn-web-acl-response-inspection-header-property-builder (new CfnWebACL$ResponseInspectionHeaderProperty$Builder) id config))


(defn build-cfn-web-acl-response-inspection-json-property-builder
  "The build-cfn-web-acl-response-inspection-json-property-builder function updates a CfnWebACL$ResponseInspectionJsonProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ResponseInspectionJsonProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureValues` | java.util.List | [[cdk.support/lookup-entry]] | `:failure-values` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `successValues` | java.util.List | [[cdk.support/lookup-entry]] | `:success-values` |
"
  [^CfnWebACL$ResponseInspectionJsonProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :failure-values)]
    (. builder failureValues data))
  (when-let [data (lookup-entry config id :identifier)]
    (. builder identifier data))
  (when-let [data (lookup-entry config id :success-values)]
    (. builder successValues data))
  (.build builder))


(defn cfn-web-acl-response-inspection-json-property-builder
  ""
  [id config]
  (build-cfn-web-acl-response-inspection-json-property-builder (new CfnWebACL$ResponseInspectionJsonProperty$Builder) id config))


(defn build-cfn-web-acl-response-inspection-property-builder
  "The build-cfn-web-acl-response-inspection-property-builder function updates a CfnWebACL$ResponseInspectionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ResponseInspectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bodyContains` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:body-contains` |
| `header` | software.amazon.awscdk.services.wafv2.CfnWebACL$ResponseInspectionHeaderProperty | [[cdk.support/lookup-entry]] | `:header` |
| `json` | software.amazon.awscdk.services.wafv2.CfnWebACL$ResponseInspectionJsonProperty | [[cdk.support/lookup-entry]] | `:json` |
| `statusCode` | software.amazon.awscdk.services.wafv2.CfnWebACL$ResponseInspectionStatusCodeProperty | [[cdk.support/lookup-entry]] | `:status-code` |
"
  [^CfnWebACL$ResponseInspectionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :body-contains)]
    (. builder bodyContains data))
  (when-let [data (lookup-entry config id :header)]
    (. builder header data))
  (when-let [data (lookup-entry config id :json)]
    (. builder json data))
  (when-let [data (lookup-entry config id :status-code)]
    (. builder statusCode data))
  (.build builder))


(defn cfn-web-acl-response-inspection-property-builder
  ""
  [id config]
  (build-cfn-web-acl-response-inspection-property-builder (new CfnWebACL$ResponseInspectionProperty$Builder) id config))


(defn build-cfn-web-acl-response-inspection-status-code-property-builder
  "The build-cfn-web-acl-response-inspection-status-code-property-builder function updates a CfnWebACL$ResponseInspectionStatusCodeProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$ResponseInspectionStatusCodeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:failure-codes` |
| `successCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:success-codes` |
"
  [^CfnWebACL$ResponseInspectionStatusCodeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :failure-codes)]
    (. builder failureCodes data))
  (when-let [data (lookup-entry config id :success-codes)]
    (. builder successCodes data))
  (.build builder))


(defn cfn-web-acl-response-inspection-status-code-property-builder
  ""
  [id config]
  (build-cfn-web-acl-response-inspection-status-code-property-builder (new CfnWebACL$ResponseInspectionStatusCodeProperty$Builder) id config))


(defn build-cfn-web-acl-rule-action-override-property-builder
  "The build-cfn-web-acl-rule-action-override-property-builder function updates a CfnWebACL$RuleActionOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RuleActionOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionToUse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action-to-use` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnWebACL$RuleActionOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action-to-use)]
    (. builder actionToUse data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-web-acl-rule-action-override-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rule-action-override-property-builder (new CfnWebACL$RuleActionOverrideProperty$Builder) id config))


(defn build-cfn-web-acl-rule-action-property-builder
  "The build-cfn-web-acl-rule-action-property-builder function updates a CfnWebACL$RuleActionProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RuleActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow` |
| `block` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block` |
| `captcha` | software.amazon.awscdk.services.wafv2.CfnWebACL$CaptchaActionProperty | [[cdk.support/lookup-entry]] | `:captcha` |
| `challenge` | software.amazon.awscdk.services.wafv2.CfnWebACL$ChallengeActionProperty | [[cdk.support/lookup-entry]] | `:challenge` |
| `count` | software.amazon.awscdk.services.wafv2.CfnWebACL$CountActionProperty | [[cdk.support/lookup-entry]] | `:count` |
"
  [^CfnWebACL$RuleActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allow)]
    (. builder allow data))
  (when-let [data (lookup-entry config id :block)]
    (. builder block data))
  (when-let [data (lookup-entry config id :captcha)]
    (. builder captcha data))
  (when-let [data (lookup-entry config id :challenge)]
    (. builder challenge data))
  (when-let [data (lookup-entry config id :count)]
    (. builder count data))
  (.build builder))


(defn cfn-web-acl-rule-action-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rule-action-property-builder (new CfnWebACL$RuleActionProperty$Builder) id config))


(defn build-cfn-web-acl-rule-group-reference-statement-property-builder
  "The build-cfn-web-acl-rule-group-reference-statement-property-builder function updates a CfnWebACL$RuleGroupReferenceStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RuleGroupReferenceStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `excludedRules` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-rules` |
| `ruleActionOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:rule-action-overrides` |
"
  [^CfnWebACL$RuleGroupReferenceStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (when-let [data (lookup-entry config id :excluded-rules)]
    (. builder excludedRules data))
  (when-let [data (lookup-entry config id :rule-action-overrides)]
    (. builder ruleActionOverrides data))
  (.build builder))


(defn cfn-web-acl-rule-group-reference-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rule-group-reference-statement-property-builder (new CfnWebACL$RuleGroupReferenceStatementProperty$Builder) id config))


(defn build-cfn-web-acl-rule-property-builder
  "The build-cfn-web-acl-rule-property-builder function updates a CfnWebACL$RuleProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$RuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action` |
| `captchaConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:captcha-config` |
| `challengeConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:challenge-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overrideAction` | software.amazon.awscdk.services.wafv2.CfnWebACL$OverrideActionProperty | [[cdk.support/lookup-entry]] | `:override-action` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `ruleLabels` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-labels` |
| `statement` | software.amazon.awscdk.services.wafv2.CfnWebACL$StatementProperty | [[cdk.support/lookup-entry]] | `:statement` |
| `visibilityConfig` | software.amazon.awscdk.services.wafv2.CfnWebACL$VisibilityConfigProperty | [[cdk.support/lookup-entry]] | `:visibility-config` |
"
  [^CfnWebACL$RuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :captcha-config)]
    (. builder captchaConfig data))
  (when-let [data (lookup-entry config id :challenge-config)]
    (. builder challengeConfig data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :override-action)]
    (. builder overrideAction data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :rule-labels)]
    (. builder ruleLabels data))
  (when-let [data (lookup-entry config id :statement)]
    (. builder statement data))
  (when-let [data (lookup-entry config id :visibility-config)]
    (. builder visibilityConfig data))
  (.build builder))


(defn cfn-web-acl-rule-property-builder
  ""
  [id config]
  (build-cfn-web-acl-rule-property-builder (new CfnWebACL$RuleProperty$Builder) id config))


(defn build-cfn-web-acl-single-header-property-builder
  "The build-cfn-web-acl-single-header-property-builder function updates a CfnWebACL$SingleHeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$SingleHeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnWebACL$SingleHeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-web-acl-single-header-property-builder
  ""
  [id config]
  (build-cfn-web-acl-single-header-property-builder (new CfnWebACL$SingleHeaderProperty$Builder) id config))


(defn build-cfn-web-acl-single-query-argument-property-builder
  "The build-cfn-web-acl-single-query-argument-property-builder function updates a CfnWebACL$SingleQueryArgumentProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$SingleQueryArgumentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnWebACL$SingleQueryArgumentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-web-acl-single-query-argument-property-builder
  ""
  [id config]
  (build-cfn-web-acl-single-query-argument-property-builder (new CfnWebACL$SingleQueryArgumentProperty$Builder) id config))


(defn build-cfn-web-acl-size-constraint-statement-property-builder
  "The build-cfn-web-acl-size-constraint-statement-property-builder function updates a CfnWebACL$SizeConstraintStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$SizeConstraintStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `fieldToMatch` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnWebACL$SizeConstraintStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comparison-operator)]
    (. builder comparisonOperator data))
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :size)]
    (. builder size data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-web-acl-size-constraint-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-size-constraint-statement-property-builder (new CfnWebACL$SizeConstraintStatementProperty$Builder) id config))


(defn build-cfn-web-acl-sqli-match-statement-property-builder
  "The build-cfn-web-acl-sqli-match-statement-property-builder function updates a CfnWebACL$SqliMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$SqliMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `sensitivityLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:sensitivity-level` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnWebACL$SqliMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :sensitivity-level)]
    (. builder sensitivityLevel data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-web-acl-sqli-match-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-sqli-match-statement-property-builder (new CfnWebACL$SqliMatchStatementProperty$Builder) id config))


(defn build-cfn-web-acl-statement-property-builder
  "The build-cfn-web-acl-statement-property-builder function updates a CfnWebACL$StatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$StatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `andStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$AndStatementProperty | [[cdk.support/lookup-entry]] | `:and-statement` |
| `byteMatchStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$ByteMatchStatementProperty | [[cdk.support/lookup-entry]] | `:byte-match-statement` |
| `geoMatchStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:geo-match-statement` |
| `ipSetReferenceStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-reference-statement` |
| `labelMatchStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:label-match-statement` |
| `managedRuleGroupStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$ManagedRuleGroupStatementProperty | [[cdk.support/lookup-entry]] | `:managed-rule-group-statement` |
| `notStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$NotStatementProperty | [[cdk.support/lookup-entry]] | `:not-statement` |
| `orStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$OrStatementProperty | [[cdk.support/lookup-entry]] | `:or-statement` |
| `rateBasedStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rate-based-statement` |
| `regexMatchStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$RegexMatchStatementProperty | [[cdk.support/lookup-entry]] | `:regex-match-statement` |
| `regexPatternSetReferenceStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$RegexPatternSetReferenceStatementProperty | [[cdk.support/lookup-entry]] | `:regex-pattern-set-reference-statement` |
| `ruleGroupReferenceStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$RuleGroupReferenceStatementProperty | [[cdk.support/lookup-entry]] | `:rule-group-reference-statement` |
| `sizeConstraintStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$SizeConstraintStatementProperty | [[cdk.support/lookup-entry]] | `:size-constraint-statement` |
| `sqliMatchStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$SqliMatchStatementProperty | [[cdk.support/lookup-entry]] | `:sqli-match-statement` |
| `xssMatchStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$XssMatchStatementProperty | [[cdk.support/lookup-entry]] | `:xss-match-statement` |
"
  [^CfnWebACL$StatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :and-statement)]
    (. builder andStatement data))
  (when-let [data (lookup-entry config id :byte-match-statement)]
    (. builder byteMatchStatement data))
  (when-let [data (lookup-entry config id :geo-match-statement)]
    (. builder geoMatchStatement data))
  (when-let [data (lookup-entry config id :ip-set-reference-statement)]
    (. builder ipSetReferenceStatement data))
  (when-let [data (lookup-entry config id :label-match-statement)]
    (. builder labelMatchStatement data))
  (when-let [data (lookup-entry config id :managed-rule-group-statement)]
    (. builder managedRuleGroupStatement data))
  (when-let [data (lookup-entry config id :not-statement)]
    (. builder notStatement data))
  (when-let [data (lookup-entry config id :or-statement)]
    (. builder orStatement data))
  (when-let [data (lookup-entry config id :rate-based-statement)]
    (. builder rateBasedStatement data))
  (when-let [data (lookup-entry config id :regex-match-statement)]
    (. builder regexMatchStatement data))
  (when-let [data (lookup-entry config id :regex-pattern-set-reference-statement)]
    (. builder regexPatternSetReferenceStatement data))
  (when-let [data (lookup-entry config id :rule-group-reference-statement)]
    (. builder ruleGroupReferenceStatement data))
  (when-let [data (lookup-entry config id :size-constraint-statement)]
    (. builder sizeConstraintStatement data))
  (when-let [data (lookup-entry config id :sqli-match-statement)]
    (. builder sqliMatchStatement data))
  (when-let [data (lookup-entry config id :xss-match-statement)]
    (. builder xssMatchStatement data))
  (.build builder))


(defn cfn-web-acl-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-statement-property-builder (new CfnWebACL$StatementProperty$Builder) id config))


(defn build-cfn-web-acl-text-transformation-property-builder
  "The build-cfn-web-acl-text-transformation-property-builder function updates a CfnWebACL$TextTransformationProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$TextTransformationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnWebACL$TextTransformationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-web-acl-text-transformation-property-builder
  ""
  [id config]
  (build-cfn-web-acl-text-transformation-property-builder (new CfnWebACL$TextTransformationProperty$Builder) id config))


(defn build-cfn-web-acl-visibility-config-property-builder
  "The build-cfn-web-acl-visibility-config-property-builder function updates a CfnWebACL$VisibilityConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$VisibilityConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-metrics-enabled` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `sampledRequestsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sampled-requests-enabled` |
"
  [^CfnWebACL$VisibilityConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-metrics-enabled)]
    (. builder cloudWatchMetricsEnabled data))
  (when-let [data (lookup-entry config id :metric-name)]
    (. builder metricName data))
  (when-let [data (lookup-entry config id :sampled-requests-enabled)]
    (. builder sampledRequestsEnabled data))
  (.build builder))


(defn cfn-web-acl-visibility-config-property-builder
  ""
  [id config]
  (build-cfn-web-acl-visibility-config-property-builder (new CfnWebACL$VisibilityConfigProperty$Builder) id config))


(defn build-cfn-web-acl-xss-match-statement-property-builder
  "The build-cfn-web-acl-xss-match-statement-property-builder function updates a CfnWebACL$XssMatchStatementProperty$Builder instance using the provided configuration.
  The function takes the CfnWebACL$XssMatchStatementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |
"
  [^CfnWebACL$XssMatchStatementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field-to-match)]
    (. builder fieldToMatch data))
  (when-let [data (lookup-entry config id :text-transformations)]
    (. builder textTransformations data))
  (.build builder))


(defn cfn-web-acl-xss-match-statement-property-builder
  ""
  [id config]
  (build-cfn-web-acl-xss-match-statement-property-builder (new CfnWebACL$XssMatchStatementProperty$Builder) id config))