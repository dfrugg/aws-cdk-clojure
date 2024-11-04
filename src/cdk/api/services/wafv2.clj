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


(defn cfn-ip-set-builder
  "The cfn-ip-set-builder function buildes out new instances of 
CfnIPSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:addresses` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipAddressVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPSet$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-ip-set-props-builder
  "The cfn-ip-set-props-builder function buildes out new instances of 
CfnIPSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addresses` | java.util.List | [[cdk.support/lookup-entry]] | `:addresses` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ipAddressVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-version` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnIPSetProps$Builder.)]
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
    (.build builder)))


(defn cfn-logging-configuration-action-condition-property-builder
  "The cfn-logging-configuration-action-condition-property-builder function buildes out new instances of 
CfnLoggingConfiguration$ActionConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$ActionConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (.build builder)))


(defn cfn-logging-configuration-builder
  "The cfn-logging-configuration-builder function buildes out new instances of 
CfnLoggingConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDestinationConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:log-destination-configs` |
| `loggingFilter` | java.lang.Object | [[cdk.support/lookup-entry]] | `:logging-filter` |
| `redactedFields` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:redacted-fields` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :log-destination-configs)]
      (. builder logDestinationConfigs data))
    (when-let [data (lookup-entry config id :logging-filter)]
      (. builder loggingFilter data))
    (when-let [data (lookup-entry config id :redacted-fields)]
      (. builder redactedFields data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-logging-configuration-condition-property-builder
  "The cfn-logging-configuration-condition-property-builder function buildes out new instances of 
CfnLoggingConfiguration$ConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionCondition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action-condition` |
| `labelNameCondition` | software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration$LabelNameConditionProperty | [[cdk.support/lookup-entry]] | `:label-name-condition` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$ConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :action-condition)]
      (. builder actionCondition data))
    (when-let [data (lookup-entry config id :label-name-condition)]
      (. builder labelNameCondition data))
    (.build builder)))


(defn cfn-logging-configuration-field-to-match-property-builder
  "The cfn-logging-configuration-field-to-match-property-builder function buildes out new instances of 
CfnLoggingConfiguration$FieldToMatchProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `jsonBody` | java.lang.Object | [[cdk.support/lookup-entry]] | `:json-body` |
| `method` | java.lang.Object | [[cdk.support/lookup-entry]] | `:method` |
| `queryString` | java.lang.Object | [[cdk.support/lookup-entry]] | `:query-string` |
| `singleHeader` | java.lang.Object | [[cdk.support/lookup-entry]] | `:single-header` |
| `uriPath` | java.lang.Object | [[cdk.support/lookup-entry]] | `:uri-path` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$FieldToMatchProperty$Builder.)]
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
    (.build builder)))


(defn cfn-logging-configuration-filter-property-builder
  "The cfn-logging-configuration-filter-property-builder function buildes out new instances of 
CfnLoggingConfiguration$FilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `behavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:behavior` |
| `conditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:conditions` |
| `requirement` | java.lang.String | [[cdk.support/lookup-entry]] | `:requirement` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$FilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :behavior)]
      (. builder behavior data))
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :requirement)]
      (. builder requirement data))
    (.build builder)))


(defn cfn-logging-configuration-json-body-property-builder
  "The cfn-logging-configuration-json-body-property-builder function buildes out new instances of 
CfnLoggingConfiguration$JsonBodyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invalidFallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:invalid-fallback-behavior` |
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration$MatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$JsonBodyProperty$Builder.)]
    (when-let [data (lookup-entry config id :invalid-fallback-behavior)]
      (. builder invalidFallbackBehavior data))
    (when-let [data (lookup-entry config id :match-pattern)]
      (. builder matchPattern data))
    (when-let [data (lookup-entry config id :match-scope)]
      (. builder matchScope data))
    (.build builder)))


(defn cfn-logging-configuration-label-name-condition-property-builder
  "The cfn-logging-configuration-label-name-condition-property-builder function buildes out new instances of 
CfnLoggingConfiguration$LabelNameConditionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `labelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:label-name` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$LabelNameConditionProperty$Builder.)]
    (when-let [data (lookup-entry config id :label-name)]
      (. builder labelName data))
    (.build builder)))


(defn cfn-logging-configuration-logging-filter-property-builder
  "The cfn-logging-configuration-logging-filter-property-builder function buildes out new instances of 
CfnLoggingConfiguration$LoggingFilterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-behavior` |
| `filters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:filters` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$LoggingFilterProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-behavior)]
      (. builder defaultBehavior data))
    (when-let [data (lookup-entry config id :filters)]
      (. builder filters data))
    (.build builder)))


(defn cfn-logging-configuration-match-pattern-property-builder
  "The cfn-logging-configuration-match-pattern-property-builder function buildes out new instances of 
CfnLoggingConfiguration$MatchPatternProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `includedPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:included-paths` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$MatchPatternProperty$Builder.)]
    (when-let [data (lookup-entry config id :all)]
      (. builder all data))
    (when-let [data (lookup-entry config id :included-paths)]
      (. builder includedPaths data))
    (.build builder)))


(defn cfn-logging-configuration-props-builder
  "The cfn-logging-configuration-props-builder function buildes out new instances of 
CfnLoggingConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDestinationConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:log-destination-configs` |
| `loggingFilter` | java.lang.Object | [[cdk.support/lookup-entry]] | `:logging-filter` |
| `redactedFields` | java.util.List | [[cdk.support/lookup-entry]] | `:redacted-fields` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnLoggingConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :log-destination-configs)]
      (. builder logDestinationConfigs data))
    (when-let [data (lookup-entry config id :logging-filter)]
      (. builder loggingFilter data))
    (when-let [data (lookup-entry config id :redacted-fields)]
      (. builder redactedFields data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-logging-configuration-single-header-property-builder
  "The cfn-logging-configuration-single-header-property-builder function buildes out new instances of 
CfnLoggingConfiguration$SingleHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$SingleHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-regex-pattern-set-builder
  "The cfn-regex-pattern-set-builder function buildes out new instances of 
CfnRegexPatternSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regularExpressionList` | java.util.List | [[cdk.support/lookup-entry]] | `:regular-expression-list` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRegexPatternSet$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-regex-pattern-set-props-builder
  "The cfn-regex-pattern-set-props-builder function buildes out new instances of 
CfnRegexPatternSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `regularExpressionList` | java.util.List | [[cdk.support/lookup-entry]] | `:regular-expression-list` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRegexPatternSetProps$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-allow-property-builder
  "The cfn-rule-group-allow-property-builder function buildes out new instances of 
CfnRuleGroup$AllowProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-request-handling` |"
  [stack id config]
  (let [builder (CfnRuleGroup$AllowProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-request-handling)]
      (. builder customRequestHandling data))
    (.build builder)))


(defn cfn-rule-group-and-statement-property-builder
  "The cfn-rule-group-and-statement-property-builder function buildes out new instances of 
CfnRuleGroup$AndStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |"
  [stack id config]
  (let [builder (CfnRuleGroup$AndStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :statements)]
      (. builder statements data))
    (.build builder)))


(defn cfn-rule-group-block-property-builder
  "The cfn-rule-group-block-property-builder function buildes out new instances of 
CfnRuleGroup$BlockProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customResponse` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$CustomResponseProperty | [[cdk.support/lookup-entry]] | `:custom-response` |"
  [stack id config]
  (let [builder (CfnRuleGroup$BlockProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-response)]
      (. builder customResponse data))
    (.build builder)))


(defn cfn-rule-group-body-property-builder
  "The cfn-rule-group-body-property-builder function buildes out new instances of 
CfnRuleGroup$BodyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |"
  [stack id config]
  (let [builder (CfnRuleGroup$BodyProperty$Builder.)]
    (when-let [data (lookup-entry config id :oversize-handling)]
      (. builder oversizeHandling data))
    (.build builder)))


(defn cfn-rule-group-builder
  "The cfn-rule-group-builder function buildes out new instances of 
CfnRuleGroup$Builder using the provided configuration.  Each field is set as follows:

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
| `visibilityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:visibility-config` |"
  [stack id config]
  (let [builder (CfnRuleGroup$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-rule-group-byte-match-statement-property-builder
  "The cfn-rule-group-byte-match-statement-property-builder function buildes out new instances of 
CfnRuleGroup$ByteMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `positionalConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:positional-constraint` |
| `searchString` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-string` |
| `searchStringBase64` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-string-base64` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnRuleGroup$ByteMatchStatementProperty$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-captcha-config-property-builder
  "The cfn-rule-group-captcha-config-property-builder function buildes out new instances of 
CfnRuleGroup$CaptchaConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTimeProperty` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$ImmunityTimePropertyProperty | [[cdk.support/lookup-entry]] | `:immunity-time-property` |"
  [stack id config]
  (let [builder (CfnRuleGroup$CaptchaConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :immunity-time-property)]
      (. builder immunityTimeProperty data))
    (.build builder)))


(defn cfn-rule-group-captcha-property-builder
  "The cfn-rule-group-captcha-property-builder function buildes out new instances of 
CfnRuleGroup$CaptchaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$CustomRequestHandlingProperty | [[cdk.support/lookup-entry]] | `:custom-request-handling` |"
  [stack id config]
  (let [builder (CfnRuleGroup$CaptchaProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-request-handling)]
      (. builder customRequestHandling data))
    (.build builder)))


(defn cfn-rule-group-challenge-config-property-builder
  "The cfn-rule-group-challenge-config-property-builder function buildes out new instances of 
CfnRuleGroup$ChallengeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTimeProperty` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:immunity-time-property` |"
  [stack id config]
  (let [builder (CfnRuleGroup$ChallengeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :immunity-time-property)]
      (. builder immunityTimeProperty data))
    (.build builder)))


(defn cfn-rule-group-challenge-property-builder
  "The cfn-rule-group-challenge-property-builder function buildes out new instances of 
CfnRuleGroup$ChallengeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-request-handling` |"
  [stack id config]
  (let [builder (CfnRuleGroup$ChallengeProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-request-handling)]
      (. builder customRequestHandling data))
    (.build builder)))


(defn cfn-rule-group-cookie-match-pattern-property-builder
  "The cfn-rule-group-cookie-match-pattern-property-builder function buildes out new instances of 
CfnRuleGroup$CookieMatchPatternProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `excludedCookies` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-cookies` |
| `includedCookies` | java.util.List | [[cdk.support/lookup-entry]] | `:included-cookies` |"
  [stack id config]
  (let [builder (CfnRuleGroup$CookieMatchPatternProperty$Builder.)]
    (when-let [data (lookup-entry config id :all)]
      (. builder all data))
    (when-let [data (lookup-entry config id :excluded-cookies)]
      (. builder excludedCookies data))
    (when-let [data (lookup-entry config id :included-cookies)]
      (. builder includedCookies data))
    (.build builder)))


(defn cfn-rule-group-cookies-property-builder
  "The cfn-rule-group-cookies-property-builder function buildes out new instances of 
CfnRuleGroup$CookiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$CookieMatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |"
  [stack id config]
  (let [builder (CfnRuleGroup$CookiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :match-pattern)]
      (. builder matchPattern data))
    (when-let [data (lookup-entry config id :match-scope)]
      (. builder matchScope data))
    (when-let [data (lookup-entry config id :oversize-handling)]
      (. builder oversizeHandling data))
    (.build builder)))


(defn cfn-rule-group-count-property-builder
  "The cfn-rule-group-count-property-builder function buildes out new instances of 
CfnRuleGroup$CountProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$CustomRequestHandlingProperty | [[cdk.support/lookup-entry]] | `:custom-request-handling` |"
  [stack id config]
  (let [builder (CfnRuleGroup$CountProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-request-handling)]
      (. builder customRequestHandling data))
    (.build builder)))


(defn cfn-rule-group-custom-http-header-property-builder
  "The cfn-rule-group-custom-http-header-property-builder function buildes out new instances of 
CfnRuleGroup$CustomHTTPHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRuleGroup$CustomHTTPHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-rule-group-custom-request-handling-property-builder
  "The cfn-rule-group-custom-request-handling-property-builder function buildes out new instances of 
CfnRuleGroup$CustomRequestHandlingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `insertHeaders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:insert-headers` |"
  [stack id config]
  (let [builder (CfnRuleGroup$CustomRequestHandlingProperty$Builder.)]
    (when-let [data (lookup-entry config id :insert-headers)]
      (. builder insertHeaders data))
    (.build builder)))


(defn cfn-rule-group-custom-response-body-property-builder
  "The cfn-rule-group-custom-response-body-property-builder function buildes out new instances of 
CfnRuleGroup$CustomResponseBodyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |"
  [stack id config]
  (let [builder (CfnRuleGroup$CustomResponseBodyProperty$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (.build builder)))


(defn cfn-rule-group-custom-response-property-builder
  "The cfn-rule-group-custom-response-property-builder function buildes out new instances of 
CfnRuleGroup$CustomResponseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customResponseBodyKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-response-body-key` |
| `responseCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:response-code` |
| `responseHeaders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-headers` |"
  [stack id config]
  (let [builder (CfnRuleGroup$CustomResponseProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-response-body-key)]
      (. builder customResponseBodyKey data))
    (when-let [data (lookup-entry config id :response-code)]
      (. builder responseCode data))
    (when-let [data (lookup-entry config id :response-headers)]
      (. builder responseHeaders data))
    (.build builder)))


(defn cfn-rule-group-field-to-match-property-builder
  "The cfn-rule-group-field-to-match-property-builder function buildes out new instances of 
CfnRuleGroup$FieldToMatchProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `uriPath` | java.lang.Object | [[cdk.support/lookup-entry]] | `:uri-path` |"
  [stack id config]
  (let [builder (CfnRuleGroup$FieldToMatchProperty$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-forwarded-ip-configuration-property-builder
  "The cfn-rule-group-forwarded-ip-configuration-property-builder function buildes out new instances of 
CfnRuleGroup$ForwardedIPConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |"
  [stack id config]
  (let [builder (CfnRuleGroup$ForwardedIPConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :fallback-behavior)]
      (. builder fallbackBehavior data))
    (when-let [data (lookup-entry config id :header-name)]
      (. builder headerName data))
    (.build builder)))


(defn cfn-rule-group-geo-match-statement-property-builder
  "The cfn-rule-group-geo-match-statement-property-builder function buildes out new instances of 
CfnRuleGroup$GeoMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `countryCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:country-codes` |
| `forwardedIpConfig` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$ForwardedIPConfigurationProperty | [[cdk.support/lookup-entry]] | `:forwarded-ip-config` |"
  [stack id config]
  (let [builder (CfnRuleGroup$GeoMatchStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :country-codes)]
      (. builder countryCodes data))
    (when-let [data (lookup-entry config id :forwarded-ip-config)]
      (. builder forwardedIpConfig data))
    (.build builder)))


(defn cfn-rule-group-header-match-pattern-property-builder
  "The cfn-rule-group-header-match-pattern-property-builder function buildes out new instances of 
CfnRuleGroup$HeaderMatchPatternProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `excludedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-headers` |
| `includedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:included-headers` |"
  [stack id config]
  (let [builder (CfnRuleGroup$HeaderMatchPatternProperty$Builder.)]
    (when-let [data (lookup-entry config id :all)]
      (. builder all data))
    (when-let [data (lookup-entry config id :excluded-headers)]
      (. builder excludedHeaders data))
    (when-let [data (lookup-entry config id :included-headers)]
      (. builder includedHeaders data))
    (.build builder)))


(defn cfn-rule-group-headers-property-builder
  "The cfn-rule-group-headers-property-builder function buildes out new instances of 
CfnRuleGroup$HeadersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchPattern` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |"
  [stack id config]
  (let [builder (CfnRuleGroup$HeadersProperty$Builder.)]
    (when-let [data (lookup-entry config id :match-pattern)]
      (. builder matchPattern data))
    (when-let [data (lookup-entry config id :match-scope)]
      (. builder matchScope data))
    (when-let [data (lookup-entry config id :oversize-handling)]
      (. builder oversizeHandling data))
    (.build builder)))


(defn cfn-rule-group-immunity-time-property-property-builder
  "The cfn-rule-group-immunity-time-property-property-builder function buildes out new instances of 
CfnRuleGroup$ImmunityTimePropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:immunity-time` |"
  [stack id config]
  (let [builder (CfnRuleGroup$ImmunityTimePropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :immunity-time)]
      (. builder immunityTime data))
    (.build builder)))


(defn cfn-rule-group-ip-set-forwarded-ip-configuration-property-builder
  "The cfn-rule-group-ip-set-forwarded-ip-configuration-property-builder function buildes out new instances of 
CfnRuleGroup$IPSetForwardedIPConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `position` | java.lang.String | [[cdk.support/lookup-entry]] | `:position` |"
  [stack id config]
  (let [builder (CfnRuleGroup$IPSetForwardedIPConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :fallback-behavior)]
      (. builder fallbackBehavior data))
    (when-let [data (lookup-entry config id :header-name)]
      (. builder headerName data))
    (when-let [data (lookup-entry config id :position)]
      (. builder position data))
    (.build builder)))


(defn cfn-rule-group-ip-set-reference-statement-property-builder
  "The cfn-rule-group-ip-set-reference-statement-property-builder function buildes out new instances of 
CfnRuleGroup$IPSetReferenceStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `ipSetForwardedIpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-forwarded-ip-config` |"
  [stack id config]
  (let [builder (CfnRuleGroup$IPSetReferenceStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :ip-set-forwarded-ip-config)]
      (. builder ipSetForwardedIpConfig data))
    (.build builder)))


(defn cfn-rule-group-ja3-fingerprint-property-builder
  "The cfn-rule-group-ja3-fingerprint-property-builder function buildes out new instances of 
CfnRuleGroup$JA3FingerprintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |"
  [stack id config]
  (let [builder (CfnRuleGroup$JA3FingerprintProperty$Builder.)]
    (when-let [data (lookup-entry config id :fallback-behavior)]
      (. builder fallbackBehavior data))
    (.build builder)))


(defn cfn-rule-group-json-body-property-builder
  "The cfn-rule-group-json-body-property-builder function buildes out new instances of 
CfnRuleGroup$JsonBodyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invalidFallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:invalid-fallback-behavior` |
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$JsonMatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |"
  [stack id config]
  (let [builder (CfnRuleGroup$JsonBodyProperty$Builder.)]
    (when-let [data (lookup-entry config id :invalid-fallback-behavior)]
      (. builder invalidFallbackBehavior data))
    (when-let [data (lookup-entry config id :match-pattern)]
      (. builder matchPattern data))
    (when-let [data (lookup-entry config id :match-scope)]
      (. builder matchScope data))
    (when-let [data (lookup-entry config id :oversize-handling)]
      (. builder oversizeHandling data))
    (.build builder)))


(defn cfn-rule-group-json-match-pattern-property-builder
  "The cfn-rule-group-json-match-pattern-property-builder function buildes out new instances of 
CfnRuleGroup$JsonMatchPatternProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `includedPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:included-paths` |"
  [stack id config]
  (let [builder (CfnRuleGroup$JsonMatchPatternProperty$Builder.)]
    (when-let [data (lookup-entry config id :all)]
      (. builder all data))
    (when-let [data (lookup-entry config id :included-paths)]
      (. builder includedPaths data))
    (.build builder)))


(defn cfn-rule-group-label-match-statement-property-builder
  "The cfn-rule-group-label-match-statement-property-builder function buildes out new instances of 
CfnRuleGroup$LabelMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |"
  [stack id config]
  (let [builder (CfnRuleGroup$LabelMatchStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (.build builder)))


(defn cfn-rule-group-label-property-builder
  "The cfn-rule-group-label-property-builder function buildes out new instances of 
CfnRuleGroup$LabelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRuleGroup$LabelProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-rule-group-label-summary-property-builder
  "The cfn-rule-group-label-summary-property-builder function buildes out new instances of 
CfnRuleGroup$LabelSummaryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRuleGroup$LabelSummaryProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-rule-group-not-statement-property-builder
  "The cfn-rule-group-not-statement-property-builder function buildes out new instances of 
CfnRuleGroup$NotStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:statement` |"
  [stack id config]
  (let [builder (CfnRuleGroup$NotStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :statement)]
      (. builder statement data))
    (.build builder)))


(defn cfn-rule-group-or-statement-property-builder
  "The cfn-rule-group-or-statement-property-builder function buildes out new instances of 
CfnRuleGroup$OrStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statements` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:statements` |"
  [stack id config]
  (let [builder (CfnRuleGroup$OrStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :statements)]
      (. builder statements data))
    (.build builder)))


(defn cfn-rule-group-props-builder
  "The cfn-rule-group-props-builder function buildes out new instances of 
CfnRuleGroupProps$Builder using the provided configuration.  Each field is set as follows:

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
| `visibilityConfig` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$VisibilityConfigProperty | [[cdk.support/lookup-entry]] | `:visibility-config` |"
  [stack id config]
  (let [builder (CfnRuleGroupProps$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-rate-based-statement-custom-key-property-builder
  "The cfn-rule-group-rate-based-statement-custom-key-property-builder function buildes out new instances of 
CfnRuleGroup$RateBasedStatementCustomKeyProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `uriPath` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$RateLimitUriPathProperty | [[cdk.support/lookup-entry]] | `:uri-path` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RateBasedStatementCustomKeyProperty$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-rate-based-statement-property-builder
  "The cfn-rule-group-rate-based-statement-property-builder function buildes out new instances of 
CfnRuleGroup$RateBasedStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregateKeyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregate-key-type` |
| `customKeys` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-keys` |
| `evaluationWindowSec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-window-sec` |
| `forwardedIpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forwarded-ip-config` |
| `limit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:limit` |
| `scopeDownStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scope-down-statement` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RateBasedStatementProperty$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-rate-limit-cookie-property-builder
  "The cfn-rule-group-rate-limit-cookie-property-builder function buildes out new instances of 
CfnRuleGroup$RateLimitCookieProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RateLimitCookieProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-rule-group-rate-limit-header-property-builder
  "The cfn-rule-group-rate-limit-header-property-builder function buildes out new instances of 
CfnRuleGroup$RateLimitHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RateLimitHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-rule-group-rate-limit-label-namespace-property-builder
  "The cfn-rule-group-rate-limit-label-namespace-property-builder function buildes out new instances of 
CfnRuleGroup$RateLimitLabelNamespaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RateLimitLabelNamespaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-rule-group-rate-limit-query-argument-property-builder
  "The cfn-rule-group-rate-limit-query-argument-property-builder function buildes out new instances of 
CfnRuleGroup$RateLimitQueryArgumentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RateLimitQueryArgumentProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-rule-group-rate-limit-query-string-property-builder
  "The cfn-rule-group-rate-limit-query-string-property-builder function buildes out new instances of 
CfnRuleGroup$RateLimitQueryStringProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RateLimitQueryStringProperty$Builder.)]
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-rule-group-rate-limit-uri-path-property-builder
  "The cfn-rule-group-rate-limit-uri-path-property-builder function buildes out new instances of 
CfnRuleGroup$RateLimitUriPathProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RateLimitUriPathProperty$Builder.)]
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-rule-group-regex-match-statement-property-builder
  "The cfn-rule-group-regex-match-statement-property-builder function buildes out new instances of 
CfnRuleGroup$RegexMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `regexString` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex-string` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RegexMatchStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :regex-string)]
      (. builder regexString data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-rule-group-regex-pattern-set-reference-statement-property-builder
  "The cfn-rule-group-regex-pattern-set-reference-statement-property-builder function buildes out new instances of 
CfnRuleGroup$RegexPatternSetReferenceStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `fieldToMatch` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RegexPatternSetReferenceStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-rule-group-rule-action-property-builder
  "The cfn-rule-group-rule-action-property-builder function buildes out new instances of 
CfnRuleGroup$RuleActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allow` | java.lang.Object | [[cdk.support/lookup-entry]] | `:allow` |
| `block` | java.lang.Object | [[cdk.support/lookup-entry]] | `:block` |
| `captcha` | java.lang.Object | [[cdk.support/lookup-entry]] | `:captcha` |
| `challenge` | java.lang.Object | [[cdk.support/lookup-entry]] | `:challenge` |
| `count` | java.lang.Object | [[cdk.support/lookup-entry]] | `:count` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RuleActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-rule-property-builder
  "The cfn-rule-group-rule-property-builder function buildes out new instances of 
CfnRuleGroup$RuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$RuleActionProperty | [[cdk.support/lookup-entry]] | `:action` |
| `captchaConfig` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$CaptchaConfigProperty | [[cdk.support/lookup-entry]] | `:captcha-config` |
| `challengeConfig` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$ChallengeConfigProperty | [[cdk.support/lookup-entry]] | `:challenge-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `ruleLabels` | java.util.List | [[cdk.support/lookup-entry]] | `:rule-labels` |
| `statement` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$StatementProperty | [[cdk.support/lookup-entry]] | `:statement` |
| `visibilityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:visibility-config` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RuleProperty$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-single-header-property-builder
  "The cfn-rule-group-single-header-property-builder function buildes out new instances of 
CfnRuleGroup$SingleHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRuleGroup$SingleHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-rule-group-single-query-argument-property-builder
  "The cfn-rule-group-single-query-argument-property-builder function buildes out new instances of 
CfnRuleGroup$SingleQueryArgumentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnRuleGroup$SingleQueryArgumentProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-rule-group-size-constraint-statement-property-builder
  "The cfn-rule-group-size-constraint-statement-property-builder function buildes out new instances of 
CfnRuleGroup$SizeConstraintStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `fieldToMatch` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnRuleGroup$SizeConstraintStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-rule-group-sqli-match-statement-property-builder
  "The cfn-rule-group-sqli-match-statement-property-builder function buildes out new instances of 
CfnRuleGroup$SqliMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `sensitivityLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:sensitivity-level` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnRuleGroup$SqliMatchStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :sensitivity-level)]
      (. builder sensitivityLevel data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-rule-group-statement-property-builder
  "The cfn-rule-group-statement-property-builder function buildes out new instances of 
CfnRuleGroup$StatementProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `xssMatchStatement` | software.amazon.awscdk.services.wafv2.CfnRuleGroup$XssMatchStatementProperty | [[cdk.support/lookup-entry]] | `:xss-match-statement` |"
  [stack id config]
  (let [builder (CfnRuleGroup$StatementProperty$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-text-transformation-property-builder
  "The cfn-rule-group-text-transformation-property-builder function buildes out new instances of 
CfnRuleGroup$TextTransformationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnRuleGroup$TextTransformationProperty$Builder.)]
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-rule-group-visibility-config-property-builder
  "The cfn-rule-group-visibility-config-property-builder function buildes out new instances of 
CfnRuleGroup$VisibilityConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-metrics-enabled` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `sampledRequestsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sampled-requests-enabled` |"
  [stack id config]
  (let [builder (CfnRuleGroup$VisibilityConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-metrics-enabled)]
      (. builder cloudWatchMetricsEnabled data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :sampled-requests-enabled)]
      (. builder sampledRequestsEnabled data))
    (.build builder)))


(defn cfn-rule-group-xss-match-statement-property-builder
  "The cfn-rule-group-xss-match-statement-property-builder function buildes out new instances of 
CfnRuleGroup$XssMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnRuleGroup$XssMatchStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-web-acl-allow-action-property-builder
  "The cfn-web-acl-allow-action-property-builder function buildes out new instances of 
CfnWebACL$AllowActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.services.wafv2.CfnWebACL$CustomRequestHandlingProperty | [[cdk.support/lookup-entry]] | `:custom-request-handling` |"
  [stack id config]
  (let [builder (CfnWebACL$AllowActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-request-handling)]
      (. builder customRequestHandling data))
    (.build builder)))


(defn cfn-web-acl-and-statement-property-builder
  "The cfn-web-acl-and-statement-property-builder function buildes out new instances of 
CfnWebACL$AndStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |"
  [stack id config]
  (let [builder (CfnWebACL$AndStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :statements)]
      (. builder statements data))
    (.build builder)))


(defn cfn-web-acl-association-builder
  "The cfn-web-acl-association-builder function buildes out new instances of 
CfnWebACLAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `webAclArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-arn` |"
  [stack id config]
  (let [builder (CfnWebACLAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (when-let [data (lookup-entry config id :web-acl-arn)]
      (. builder webAclArn data))
    (.build builder)))


(defn cfn-web-acl-association-config-property-builder
  "The cfn-web-acl-association-config-property-builder function buildes out new instances of 
CfnWebACL$AssociationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `requestBody` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:request-body` |"
  [stack id config]
  (let [builder (CfnWebACL$AssociationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :request-body)]
      (. builder requestBody data))
    (.build builder)))


(defn cfn-web-acl-association-props-builder
  "The cfn-web-acl-association-props-builder function buildes out new instances of 
CfnWebACLAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
| `webAclArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:web-acl-arn` |"
  [stack id config]
  (let [builder (CfnWebACLAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (when-let [data (lookup-entry config id :web-acl-arn)]
      (. builder webAclArn data))
    (.build builder)))


(defn cfn-web-acl-aws-managed-rules-acfp-rule-set-property-builder
  "The cfn-web-acl-aws-managed-rules-acfp-rule-set-property-builder function buildes out new instances of 
CfnWebACL$AWSManagedRulesACFPRuleSetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `creationPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:creation-path` |
| `enableRegexInPath` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-regex-in-path` |
| `registrationPagePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:registration-page-path` |
| `requestInspection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:request-inspection` |
| `responseInspection` | software.amazon.awscdk.services.wafv2.CfnWebACL$ResponseInspectionProperty | [[cdk.support/lookup-entry]] | `:response-inspection` |"
  [stack id config]
  (let [builder (CfnWebACL$AWSManagedRulesACFPRuleSetProperty$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-aws-managed-rules-atp-rule-set-property-builder
  "The cfn-web-acl-aws-managed-rules-atp-rule-set-property-builder function buildes out new instances of 
CfnWebACL$AWSManagedRulesATPRuleSetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableRegexInPath` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-regex-in-path` |
| `loginPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:login-path` |
| `requestInspection` | software.amazon.awscdk.services.wafv2.CfnWebACL$RequestInspectionProperty | [[cdk.support/lookup-entry]] | `:request-inspection` |
| `responseInspection` | software.amazon.awscdk.services.wafv2.CfnWebACL$ResponseInspectionProperty | [[cdk.support/lookup-entry]] | `:response-inspection` |"
  [stack id config]
  (let [builder (CfnWebACL$AWSManagedRulesATPRuleSetProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-regex-in-path)]
      (. builder enableRegexInPath data))
    (when-let [data (lookup-entry config id :login-path)]
      (. builder loginPath data))
    (when-let [data (lookup-entry config id :request-inspection)]
      (. builder requestInspection data))
    (when-let [data (lookup-entry config id :response-inspection)]
      (. builder responseInspection data))
    (.build builder)))


(defn cfn-web-acl-aws-managed-rules-bot-control-rule-set-property-builder
  "The cfn-web-acl-aws-managed-rules-bot-control-rule-set-property-builder function buildes out new instances of 
CfnWebACL$AWSManagedRulesBotControlRuleSetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableMachineLearning` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-machine-learning` |
| `inspectionLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:inspection-level` |"
  [stack id config]
  (let [builder (CfnWebACL$AWSManagedRulesBotControlRuleSetProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-machine-learning)]
      (. builder enableMachineLearning data))
    (when-let [data (lookup-entry config id :inspection-level)]
      (. builder inspectionLevel data))
    (.build builder)))


(defn cfn-web-acl-block-action-property-builder
  "The cfn-web-acl-block-action-property-builder function buildes out new instances of 
CfnWebACL$BlockActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customResponse` | software.amazon.awscdk.services.wafv2.CfnWebACL$CustomResponseProperty | [[cdk.support/lookup-entry]] | `:custom-response` |"
  [stack id config]
  (let [builder (CfnWebACL$BlockActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-response)]
      (. builder customResponse data))
    (.build builder)))


(defn cfn-web-acl-body-property-builder
  "The cfn-web-acl-body-property-builder function buildes out new instances of 
CfnWebACL$BodyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |"
  [stack id config]
  (let [builder (CfnWebACL$BodyProperty$Builder.)]
    (when-let [data (lookup-entry config id :oversize-handling)]
      (. builder oversizeHandling data))
    (.build builder)))


(defn cfn-web-acl-builder
  "The cfn-web-acl-builder function buildes out new instances of 
CfnWebACL$Builder using the provided configuration.  Each field is set as follows:

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
| `visibilityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:visibility-config` |"
  [stack id config]
  (let [builder (CfnWebACL$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-web-acl-byte-match-statement-property-builder
  "The cfn-web-acl-byte-match-statement-property-builder function buildes out new instances of 
CfnWebACL$ByteMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `positionalConstraint` | java.lang.String | [[cdk.support/lookup-entry]] | `:positional-constraint` |
| `searchString` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-string` |
| `searchStringBase64` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-string-base64` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnWebACL$ByteMatchStatementProperty$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-captcha-action-property-builder
  "The cfn-web-acl-captcha-action-property-builder function buildes out new instances of 
CfnWebACL$CaptchaActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-request-handling` |"
  [stack id config]
  (let [builder (CfnWebACL$CaptchaActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-request-handling)]
      (. builder customRequestHandling data))
    (.build builder)))


(defn cfn-web-acl-captcha-config-property-builder
  "The cfn-web-acl-captcha-config-property-builder function buildes out new instances of 
CfnWebACL$CaptchaConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTimeProperty` | software.amazon.awscdk.services.wafv2.CfnWebACL$ImmunityTimePropertyProperty | [[cdk.support/lookup-entry]] | `:immunity-time-property` |"
  [stack id config]
  (let [builder (CfnWebACL$CaptchaConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :immunity-time-property)]
      (. builder immunityTimeProperty data))
    (.build builder)))


(defn cfn-web-acl-challenge-action-property-builder
  "The cfn-web-acl-challenge-action-property-builder function buildes out new instances of 
CfnWebACL$ChallengeActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.services.wafv2.CfnWebACL$CustomRequestHandlingProperty | [[cdk.support/lookup-entry]] | `:custom-request-handling` |"
  [stack id config]
  (let [builder (CfnWebACL$ChallengeActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-request-handling)]
      (. builder customRequestHandling data))
    (.build builder)))


(defn cfn-web-acl-challenge-config-property-builder
  "The cfn-web-acl-challenge-config-property-builder function buildes out new instances of 
CfnWebACL$ChallengeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTimeProperty` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:immunity-time-property` |"
  [stack id config]
  (let [builder (CfnWebACL$ChallengeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :immunity-time-property)]
      (. builder immunityTimeProperty data))
    (.build builder)))


(defn cfn-web-acl-cookie-match-pattern-property-builder
  "The cfn-web-acl-cookie-match-pattern-property-builder function buildes out new instances of 
CfnWebACL$CookieMatchPatternProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `excludedCookies` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-cookies` |
| `includedCookies` | java.util.List | [[cdk.support/lookup-entry]] | `:included-cookies` |"
  [stack id config]
  (let [builder (CfnWebACL$CookieMatchPatternProperty$Builder.)]
    (when-let [data (lookup-entry config id :all)]
      (. builder all data))
    (when-let [data (lookup-entry config id :excluded-cookies)]
      (. builder excludedCookies data))
    (when-let [data (lookup-entry config id :included-cookies)]
      (. builder includedCookies data))
    (.build builder)))


(defn cfn-web-acl-cookies-property-builder
  "The cfn-web-acl-cookies-property-builder function buildes out new instances of 
CfnWebACL$CookiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnWebACL$CookieMatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |"
  [stack id config]
  (let [builder (CfnWebACL$CookiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :match-pattern)]
      (. builder matchPattern data))
    (when-let [data (lookup-entry config id :match-scope)]
      (. builder matchScope data))
    (when-let [data (lookup-entry config id :oversize-handling)]
      (. builder oversizeHandling data))
    (.build builder)))


(defn cfn-web-acl-count-action-property-builder
  "The cfn-web-acl-count-action-property-builder function buildes out new instances of 
CfnWebACL$CountActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customRequestHandling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-request-handling` |"
  [stack id config]
  (let [builder (CfnWebACL$CountActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-request-handling)]
      (. builder customRequestHandling data))
    (.build builder)))


(defn cfn-web-acl-custom-http-header-property-builder
  "The cfn-web-acl-custom-http-header-property-builder function buildes out new instances of 
CfnWebACL$CustomHTTPHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnWebACL$CustomHTTPHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-web-acl-custom-request-handling-property-builder
  "The cfn-web-acl-custom-request-handling-property-builder function buildes out new instances of 
CfnWebACL$CustomRequestHandlingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `insertHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:insert-headers` |"
  [stack id config]
  (let [builder (CfnWebACL$CustomRequestHandlingProperty$Builder.)]
    (when-let [data (lookup-entry config id :insert-headers)]
      (. builder insertHeaders data))
    (.build builder)))


(defn cfn-web-acl-custom-response-body-property-builder
  "The cfn-web-acl-custom-response-body-property-builder function buildes out new instances of 
CfnWebACL$CustomResponseBodyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `content` | java.lang.String | [[cdk.support/lookup-entry]] | `:content` |
| `contentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-type` |"
  [stack id config]
  (let [builder (CfnWebACL$CustomResponseBodyProperty$Builder.)]
    (when-let [data (lookup-entry config id :content)]
      (. builder content data))
    (when-let [data (lookup-entry config id :content-type)]
      (. builder contentType data))
    (.build builder)))


(defn cfn-web-acl-custom-response-property-builder
  "The cfn-web-acl-custom-response-property-builder function buildes out new instances of 
CfnWebACL$CustomResponseProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customResponseBodyKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-response-body-key` |
| `responseCode` | java.lang.Number | [[cdk.support/lookup-entry]] | `:response-code` |
| `responseHeaders` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:response-headers` |"
  [stack id config]
  (let [builder (CfnWebACL$CustomResponseProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-response-body-key)]
      (. builder customResponseBodyKey data))
    (when-let [data (lookup-entry config id :response-code)]
      (. builder responseCode data))
    (when-let [data (lookup-entry config id :response-headers)]
      (. builder responseHeaders data))
    (.build builder)))


(defn cfn-web-acl-default-action-property-builder
  "The cfn-web-acl-default-action-property-builder function buildes out new instances of 
CfnWebACL$DefaultActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow` |
| `block` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block` |"
  [stack id config]
  (let [builder (CfnWebACL$DefaultActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow)]
      (. builder allow data))
    (when-let [data (lookup-entry config id :block)]
      (. builder block data))
    (.build builder)))


(defn cfn-web-acl-excluded-rule-property-builder
  "The cfn-web-acl-excluded-rule-property-builder function buildes out new instances of 
CfnWebACL$ExcludedRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnWebACL$ExcludedRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-web-acl-field-identifier-property-builder
  "The cfn-web-acl-field-identifier-property-builder function buildes out new instances of 
CfnWebACL$FieldIdentifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |"
  [stack id config]
  (let [builder (CfnWebACL$FieldIdentifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (.build builder)))


(defn cfn-web-acl-field-to-match-property-builder
  "The cfn-web-acl-field-to-match-property-builder function buildes out new instances of 
CfnWebACL$FieldToMatchProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `uriPath` | java.lang.Object | [[cdk.support/lookup-entry]] | `:uri-path` |"
  [stack id config]
  (let [builder (CfnWebACL$FieldToMatchProperty$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-forwarded-ip-configuration-property-builder
  "The cfn-web-acl-forwarded-ip-configuration-property-builder function buildes out new instances of 
CfnWebACL$ForwardedIPConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |"
  [stack id config]
  (let [builder (CfnWebACL$ForwardedIPConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :fallback-behavior)]
      (. builder fallbackBehavior data))
    (when-let [data (lookup-entry config id :header-name)]
      (. builder headerName data))
    (.build builder)))


(defn cfn-web-acl-geo-match-statement-property-builder
  "The cfn-web-acl-geo-match-statement-property-builder function buildes out new instances of 
CfnWebACL$GeoMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `countryCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:country-codes` |
| `forwardedIpConfig` | software.amazon.awscdk.services.wafv2.CfnWebACL$ForwardedIPConfigurationProperty | [[cdk.support/lookup-entry]] | `:forwarded-ip-config` |"
  [stack id config]
  (let [builder (CfnWebACL$GeoMatchStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :country-codes)]
      (. builder countryCodes data))
    (when-let [data (lookup-entry config id :forwarded-ip-config)]
      (. builder forwardedIpConfig data))
    (.build builder)))


(defn cfn-web-acl-header-match-pattern-property-builder
  "The cfn-web-acl-header-match-pattern-property-builder function buildes out new instances of 
CfnWebACL$HeaderMatchPatternProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `excludedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-headers` |
| `includedHeaders` | java.util.List | [[cdk.support/lookup-entry]] | `:included-headers` |"
  [stack id config]
  (let [builder (CfnWebACL$HeaderMatchPatternProperty$Builder.)]
    (when-let [data (lookup-entry config id :all)]
      (. builder all data))
    (when-let [data (lookup-entry config id :excluded-headers)]
      (. builder excludedHeaders data))
    (when-let [data (lookup-entry config id :included-headers)]
      (. builder includedHeaders data))
    (.build builder)))


(defn cfn-web-acl-headers-property-builder
  "The cfn-web-acl-headers-property-builder function buildes out new instances of 
CfnWebACL$HeadersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnWebACL$HeaderMatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |"
  [stack id config]
  (let [builder (CfnWebACL$HeadersProperty$Builder.)]
    (when-let [data (lookup-entry config id :match-pattern)]
      (. builder matchPattern data))
    (when-let [data (lookup-entry config id :match-scope)]
      (. builder matchScope data))
    (when-let [data (lookup-entry config id :oversize-handling)]
      (. builder oversizeHandling data))
    (.build builder)))


(defn cfn-web-acl-immunity-time-property-property-builder
  "The cfn-web-acl-immunity-time-property-property-builder function buildes out new instances of 
CfnWebACL$ImmunityTimePropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `immunityTime` | java.lang.Number | [[cdk.support/lookup-entry]] | `:immunity-time` |"
  [stack id config]
  (let [builder (CfnWebACL$ImmunityTimePropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :immunity-time)]
      (. builder immunityTime data))
    (.build builder)))


(defn cfn-web-acl-ip-set-forwarded-ip-configuration-property-builder
  "The cfn-web-acl-ip-set-forwarded-ip-configuration-property-builder function buildes out new instances of 
CfnWebACL$IPSetForwardedIPConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |
| `headerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:header-name` |
| `position` | java.lang.String | [[cdk.support/lookup-entry]] | `:position` |"
  [stack id config]
  (let [builder (CfnWebACL$IPSetForwardedIPConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :fallback-behavior)]
      (. builder fallbackBehavior data))
    (when-let [data (lookup-entry config id :header-name)]
      (. builder headerName data))
    (when-let [data (lookup-entry config id :position)]
      (. builder position data))
    (.build builder)))


(defn cfn-web-acl-ip-set-reference-statement-property-builder
  "The cfn-web-acl-ip-set-reference-statement-property-builder function buildes out new instances of 
CfnWebACL$IPSetReferenceStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `ipSetForwardedIpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-forwarded-ip-config` |"
  [stack id config]
  (let [builder (CfnWebACL$IPSetReferenceStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :ip-set-forwarded-ip-config)]
      (. builder ipSetForwardedIpConfig data))
    (.build builder)))


(defn cfn-web-acl-ja3-fingerprint-property-builder
  "The cfn-web-acl-ja3-fingerprint-property-builder function buildes out new instances of 
CfnWebACL$JA3FingerprintProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:fallback-behavior` |"
  [stack id config]
  (let [builder (CfnWebACL$JA3FingerprintProperty$Builder.)]
    (when-let [data (lookup-entry config id :fallback-behavior)]
      (. builder fallbackBehavior data))
    (.build builder)))


(defn cfn-web-acl-json-body-property-builder
  "The cfn-web-acl-json-body-property-builder function buildes out new instances of 
CfnWebACL$JsonBodyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `invalidFallbackBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:invalid-fallback-behavior` |
| `matchPattern` | software.amazon.awscdk.services.wafv2.CfnWebACL$JsonMatchPatternProperty | [[cdk.support/lookup-entry]] | `:match-pattern` |
| `matchScope` | java.lang.String | [[cdk.support/lookup-entry]] | `:match-scope` |
| `oversizeHandling` | java.lang.String | [[cdk.support/lookup-entry]] | `:oversize-handling` |"
  [stack id config]
  (let [builder (CfnWebACL$JsonBodyProperty$Builder.)]
    (when-let [data (lookup-entry config id :invalid-fallback-behavior)]
      (. builder invalidFallbackBehavior data))
    (when-let [data (lookup-entry config id :match-pattern)]
      (. builder matchPattern data))
    (when-let [data (lookup-entry config id :match-scope)]
      (. builder matchScope data))
    (when-let [data (lookup-entry config id :oversize-handling)]
      (. builder oversizeHandling data))
    (.build builder)))


(defn cfn-web-acl-json-match-pattern-property-builder
  "The cfn-web-acl-json-match-pattern-property-builder function buildes out new instances of 
CfnWebACL$JsonMatchPatternProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `all` | java.lang.Object | [[cdk.support/lookup-entry]] | `:all` |
| `includedPaths` | java.util.List | [[cdk.support/lookup-entry]] | `:included-paths` |"
  [stack id config]
  (let [builder (CfnWebACL$JsonMatchPatternProperty$Builder.)]
    (when-let [data (lookup-entry config id :all)]
      (. builder all data))
    (when-let [data (lookup-entry config id :included-paths)]
      (. builder includedPaths data))
    (.build builder)))


(defn cfn-web-acl-label-match-statement-property-builder
  "The cfn-web-acl-label-match-statement-property-builder function buildes out new instances of 
CfnWebACL$LabelMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |"
  [stack id config]
  (let [builder (CfnWebACL$LabelMatchStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (.build builder)))


(defn cfn-web-acl-label-property-builder
  "The cfn-web-acl-label-property-builder function buildes out new instances of 
CfnWebACL$LabelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnWebACL$LabelProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-web-acl-managed-rule-group-config-property-builder
  "The cfn-web-acl-managed-rule-group-config-property-builder function buildes out new instances of 
CfnWebACL$ManagedRuleGroupConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsManagedRulesAcfpRuleSet` | software.amazon.awscdk.services.wafv2.CfnWebACL$AWSManagedRulesACFPRuleSetProperty | [[cdk.support/lookup-entry]] | `:aws-managed-rules-acfp-rule-set` |
| `awsManagedRulesAtpRuleSet` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:aws-managed-rules-atp-rule-set` |
| `awsManagedRulesBotControlRuleSet` | software.amazon.awscdk.services.wafv2.CfnWebACL$AWSManagedRulesBotControlRuleSetProperty | [[cdk.support/lookup-entry]] | `:aws-managed-rules-bot-control-rule-set` |
| `loginPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:login-path` |
| `passwordField` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldIdentifierProperty | [[cdk.support/lookup-entry]] | `:password-field` |
| `payloadType` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-type` |
| `usernameField` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:username-field` |"
  [stack id config]
  (let [builder (CfnWebACL$ManagedRuleGroupConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-managed-rule-group-statement-property-builder
  "The cfn-web-acl-managed-rule-group-statement-property-builder function buildes out new instances of 
CfnWebACL$ManagedRuleGroupStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludedRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:excluded-rules` |
| `managedRuleGroupConfigs` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-rule-group-configs` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ruleActionOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:rule-action-overrides` |
| `scopeDownStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$StatementProperty | [[cdk.support/lookup-entry]] | `:scope-down-statement` |
| `vendorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:vendor-name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnWebACL$ManagedRuleGroupStatementProperty$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-not-statement-property-builder
  "The cfn-web-acl-not-statement-property-builder function buildes out new instances of 
CfnWebACL$NotStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statement` | software.amazon.awscdk.services.wafv2.CfnWebACL$StatementProperty | [[cdk.support/lookup-entry]] | `:statement` |"
  [stack id config]
  (let [builder (CfnWebACL$NotStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :statement)]
      (. builder statement data))
    (.build builder)))


(defn cfn-web-acl-or-statement-property-builder
  "The cfn-web-acl-or-statement-property-builder function buildes out new instances of 
CfnWebACL$OrStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `statements` | java.util.List | [[cdk.support/lookup-entry]] | `:statements` |"
  [stack id config]
  (let [builder (CfnWebACL$OrStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :statements)]
      (. builder statements data))
    (.build builder)))


(defn cfn-web-acl-override-action-property-builder
  "The cfn-web-acl-override-action-property-builder function buildes out new instances of 
CfnWebACL$OverrideActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `count` | java.lang.Object | [[cdk.support/lookup-entry]] | `:count` |
| `none` | java.lang.Object | [[cdk.support/lookup-entry]] | `:none` |"
  [stack id config]
  (let [builder (CfnWebACL$OverrideActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :count)]
      (. builder count data))
    (when-let [data (lookup-entry config id :none)]
      (. builder none data))
    (.build builder)))


(defn cfn-web-acl-props-builder
  "The cfn-web-acl-props-builder function buildes out new instances of 
CfnWebACLProps$Builder using the provided configuration.  Each field is set as follows:

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
| `visibilityConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:visibility-config` |"
  [stack id config]
  (let [builder (CfnWebACLProps$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-rate-based-statement-custom-key-property-builder
  "The cfn-web-acl-rate-based-statement-custom-key-property-builder function buildes out new instances of 
CfnWebACL$RateBasedStatementCustomKeyProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `uriPath` | software.amazon.awscdk.services.wafv2.CfnWebACL$RateLimitUriPathProperty | [[cdk.support/lookup-entry]] | `:uri-path` |"
  [stack id config]
  (let [builder (CfnWebACL$RateBasedStatementCustomKeyProperty$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-rate-based-statement-property-builder
  "The cfn-web-acl-rate-based-statement-property-builder function buildes out new instances of 
CfnWebACL$RateBasedStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aggregateKeyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:aggregate-key-type` |
| `customKeys` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-keys` |
| `evaluationWindowSec` | java.lang.Number | [[cdk.support/lookup-entry]] | `:evaluation-window-sec` |
| `forwardedIpConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:forwarded-ip-config` |
| `limit` | java.lang.Number | [[cdk.support/lookup-entry]] | `:limit` |
| `scopeDownStatement` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scope-down-statement` |"
  [stack id config]
  (let [builder (CfnWebACL$RateBasedStatementProperty$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-rate-limit-cookie-property-builder
  "The cfn-web-acl-rate-limit-cookie-property-builder function buildes out new instances of 
CfnWebACL$RateLimitCookieProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnWebACL$RateLimitCookieProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-web-acl-rate-limit-header-property-builder
  "The cfn-web-acl-rate-limit-header-property-builder function buildes out new instances of 
CfnWebACL$RateLimitHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnWebACL$RateLimitHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-web-acl-rate-limit-label-namespace-property-builder
  "The cfn-web-acl-rate-limit-label-namespace-property-builder function buildes out new instances of 
CfnWebACL$RateLimitLabelNamespaceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace` |"
  [stack id config]
  (let [builder (CfnWebACL$RateLimitLabelNamespaceProperty$Builder.)]
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (.build builder)))


(defn cfn-web-acl-rate-limit-query-argument-property-builder
  "The cfn-web-acl-rate-limit-query-argument-property-builder function buildes out new instances of 
CfnWebACL$RateLimitQueryArgumentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnWebACL$RateLimitQueryArgumentProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-web-acl-rate-limit-query-string-property-builder
  "The cfn-web-acl-rate-limit-query-string-property-builder function buildes out new instances of 
CfnWebACL$RateLimitQueryStringProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnWebACL$RateLimitQueryStringProperty$Builder.)]
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-web-acl-rate-limit-uri-path-property-builder
  "The cfn-web-acl-rate-limit-uri-path-property-builder function buildes out new instances of 
CfnWebACL$RateLimitUriPathProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnWebACL$RateLimitUriPathProperty$Builder.)]
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-web-acl-regex-match-statement-property-builder
  "The cfn-web-acl-regex-match-statement-property-builder function buildes out new instances of 
CfnWebACL$RegexMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `regexString` | java.lang.String | [[cdk.support/lookup-entry]] | `:regex-string` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnWebACL$RegexMatchStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :regex-string)]
      (. builder regexString data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-web-acl-regex-pattern-set-reference-statement-property-builder
  "The cfn-web-acl-regex-pattern-set-reference-statement-property-builder function buildes out new instances of 
CfnWebACL$RegexPatternSetReferenceStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnWebACL$RegexPatternSetReferenceStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-web-acl-request-body-associated-resource-type-config-property-builder
  "The cfn-web-acl-request-body-associated-resource-type-config-property-builder function buildes out new instances of 
CfnWebACL$RequestBodyAssociatedResourceTypeConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultSizeInspectionLimit` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-size-inspection-limit` |"
  [stack id config]
  (let [builder (CfnWebACL$RequestBodyAssociatedResourceTypeConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-size-inspection-limit)]
      (. builder defaultSizeInspectionLimit data))
    (.build builder)))


(defn cfn-web-acl-request-inspection-acfp-property-builder
  "The cfn-web-acl-request-inspection-acfp-property-builder function buildes out new instances of 
CfnWebACL$RequestInspectionACFPProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressFields` | java.util.List | [[cdk.support/lookup-entry]] | `:address-fields` |
| `emailField` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldIdentifierProperty | [[cdk.support/lookup-entry]] | `:email-field` |
| `passwordField` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:password-field` |
| `payloadType` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-type` |
| `phoneNumberFields` | java.util.List | [[cdk.support/lookup-entry]] | `:phone-number-fields` |
| `usernameField` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldIdentifierProperty | [[cdk.support/lookup-entry]] | `:username-field` |"
  [stack id config]
  (let [builder (CfnWebACL$RequestInspectionACFPProperty$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-request-inspection-property-builder
  "The cfn-web-acl-request-inspection-property-builder function buildes out new instances of 
CfnWebACL$RequestInspectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `passwordField` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldIdentifierProperty | [[cdk.support/lookup-entry]] | `:password-field` |
| `payloadType` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload-type` |
| `usernameField` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:username-field` |"
  [stack id config]
  (let [builder (CfnWebACL$RequestInspectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :password-field)]
      (. builder passwordField data))
    (when-let [data (lookup-entry config id :payload-type)]
      (. builder payloadType data))
    (when-let [data (lookup-entry config id :username-field)]
      (. builder usernameField data))
    (.build builder)))


(defn cfn-web-acl-response-inspection-body-contains-property-builder
  "The cfn-web-acl-response-inspection-body-contains-property-builder function buildes out new instances of 
CfnWebACL$ResponseInspectionBodyContainsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:failure-strings` |
| `successStrings` | java.util.List | [[cdk.support/lookup-entry]] | `:success-strings` |"
  [stack id config]
  (let [builder (CfnWebACL$ResponseInspectionBodyContainsProperty$Builder.)]
    (when-let [data (lookup-entry config id :failure-strings)]
      (. builder failureStrings data))
    (when-let [data (lookup-entry config id :success-strings)]
      (. builder successStrings data))
    (.build builder)))


(defn cfn-web-acl-response-inspection-header-property-builder
  "The cfn-web-acl-response-inspection-header-property-builder function buildes out new instances of 
CfnWebACL$ResponseInspectionHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureValues` | java.util.List | [[cdk.support/lookup-entry]] | `:failure-values` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `successValues` | java.util.List | [[cdk.support/lookup-entry]] | `:success-values` |"
  [stack id config]
  (let [builder (CfnWebACL$ResponseInspectionHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :failure-values)]
      (. builder failureValues data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :success-values)]
      (. builder successValues data))
    (.build builder)))


(defn cfn-web-acl-response-inspection-json-property-builder
  "The cfn-web-acl-response-inspection-json-property-builder function buildes out new instances of 
CfnWebACL$ResponseInspectionJsonProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureValues` | java.util.List | [[cdk.support/lookup-entry]] | `:failure-values` |
| `identifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:identifier` |
| `successValues` | java.util.List | [[cdk.support/lookup-entry]] | `:success-values` |"
  [stack id config]
  (let [builder (CfnWebACL$ResponseInspectionJsonProperty$Builder.)]
    (when-let [data (lookup-entry config id :failure-values)]
      (. builder failureValues data))
    (when-let [data (lookup-entry config id :identifier)]
      (. builder identifier data))
    (when-let [data (lookup-entry config id :success-values)]
      (. builder successValues data))
    (.build builder)))


(defn cfn-web-acl-response-inspection-property-builder
  "The cfn-web-acl-response-inspection-property-builder function buildes out new instances of 
CfnWebACL$ResponseInspectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bodyContains` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:body-contains` |
| `header` | software.amazon.awscdk.services.wafv2.CfnWebACL$ResponseInspectionHeaderProperty | [[cdk.support/lookup-entry]] | `:header` |
| `json` | software.amazon.awscdk.services.wafv2.CfnWebACL$ResponseInspectionJsonProperty | [[cdk.support/lookup-entry]] | `:json` |
| `statusCode` | software.amazon.awscdk.services.wafv2.CfnWebACL$ResponseInspectionStatusCodeProperty | [[cdk.support/lookup-entry]] | `:status-code` |"
  [stack id config]
  (let [builder (CfnWebACL$ResponseInspectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :body-contains)]
      (. builder bodyContains data))
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (when-let [data (lookup-entry config id :json)]
      (. builder json data))
    (when-let [data (lookup-entry config id :status-code)]
      (. builder statusCode data))
    (.build builder)))


(defn cfn-web-acl-response-inspection-status-code-property-builder
  "The cfn-web-acl-response-inspection-status-code-property-builder function buildes out new instances of 
CfnWebACL$ResponseInspectionStatusCodeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:failure-codes` |
| `successCodes` | java.util.List | [[cdk.support/lookup-entry]] | `:success-codes` |"
  [stack id config]
  (let [builder (CfnWebACL$ResponseInspectionStatusCodeProperty$Builder.)]
    (when-let [data (lookup-entry config id :failure-codes)]
      (. builder failureCodes data))
    (when-let [data (lookup-entry config id :success-codes)]
      (. builder successCodes data))
    (.build builder)))


(defn cfn-web-acl-rule-action-override-property-builder
  "The cfn-web-acl-rule-action-override-property-builder function buildes out new instances of 
CfnWebACL$RuleActionOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionToUse` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action-to-use` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnWebACL$RuleActionOverrideProperty$Builder.)]
    (when-let [data (lookup-entry config id :action-to-use)]
      (. builder actionToUse data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-web-acl-rule-action-property-builder
  "The cfn-web-acl-rule-action-property-builder function buildes out new instances of 
CfnWebACL$RuleActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allow` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow` |
| `block` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:block` |
| `captcha` | software.amazon.awscdk.services.wafv2.CfnWebACL$CaptchaActionProperty | [[cdk.support/lookup-entry]] | `:captcha` |
| `challenge` | software.amazon.awscdk.services.wafv2.CfnWebACL$ChallengeActionProperty | [[cdk.support/lookup-entry]] | `:challenge` |
| `count` | software.amazon.awscdk.services.wafv2.CfnWebACL$CountActionProperty | [[cdk.support/lookup-entry]] | `:count` |"
  [stack id config]
  (let [builder (CfnWebACL$RuleActionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-rule-group-reference-statement-property-builder
  "The cfn-web-acl-rule-group-reference-statement-property-builder function buildes out new instances of 
CfnWebACL$RuleGroupReferenceStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
| `excludedRules` | java.util.List | [[cdk.support/lookup-entry]] | `:excluded-rules` |
| `ruleActionOverrides` | java.util.List | [[cdk.support/lookup-entry]] | `:rule-action-overrides` |"
  [stack id config]
  (let [builder (CfnWebACL$RuleGroupReferenceStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (when-let [data (lookup-entry config id :excluded-rules)]
      (. builder excludedRules data))
    (when-let [data (lookup-entry config id :rule-action-overrides)]
      (. builder ruleActionOverrides data))
    (.build builder)))


(defn cfn-web-acl-rule-property-builder
  "The cfn-web-acl-rule-property-builder function buildes out new instances of 
CfnWebACL$RuleProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `visibilityConfig` | software.amazon.awscdk.services.wafv2.CfnWebACL$VisibilityConfigProperty | [[cdk.support/lookup-entry]] | `:visibility-config` |"
  [stack id config]
  (let [builder (CfnWebACL$RuleProperty$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-single-header-property-builder
  "The cfn-web-acl-single-header-property-builder function buildes out new instances of 
CfnWebACL$SingleHeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnWebACL$SingleHeaderProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-web-acl-single-query-argument-property-builder
  "The cfn-web-acl-single-query-argument-property-builder function buildes out new instances of 
CfnWebACL$SingleQueryArgumentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnWebACL$SingleQueryArgumentProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-web-acl-size-constraint-statement-property-builder
  "The cfn-web-acl-size-constraint-statement-property-builder function buildes out new instances of 
CfnWebACL$SizeConstraintStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comparisonOperator` | java.lang.String | [[cdk.support/lookup-entry]] | `:comparison-operator` |
| `fieldToMatch` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `size` | java.lang.Number | [[cdk.support/lookup-entry]] | `:size` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnWebACL$SizeConstraintStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :comparison-operator)]
      (. builder comparisonOperator data))
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :size)]
      (. builder size data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-web-acl-sqli-match-statement-property-builder
  "The cfn-web-acl-sqli-match-statement-property-builder function buildes out new instances of 
CfnWebACL$SqliMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `sensitivityLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:sensitivity-level` |
| `textTransformations` | java.util.List | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnWebACL$SqliMatchStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :sensitivity-level)]
      (. builder sensitivityLevel data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))


(defn cfn-web-acl-statement-property-builder
  "The cfn-web-acl-statement-property-builder function buildes out new instances of 
CfnWebACL$StatementProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `xssMatchStatement` | software.amazon.awscdk.services.wafv2.CfnWebACL$XssMatchStatementProperty | [[cdk.support/lookup-entry]] | `:xss-match-statement` |"
  [stack id config]
  (let [builder (CfnWebACL$StatementProperty$Builder.)]
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
    (.build builder)))


(defn cfn-web-acl-text-transformation-property-builder
  "The cfn-web-acl-text-transformation-property-builder function buildes out new instances of 
CfnWebACL$TextTransformationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnWebACL$TextTransformationProperty$Builder.)]
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-web-acl-visibility-config-property-builder
  "The cfn-web-acl-visibility-config-property-builder function buildes out new instances of 
CfnWebACL$VisibilityConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchMetricsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cloud-watch-metrics-enabled` |
| `metricName` | java.lang.String | [[cdk.support/lookup-entry]] | `:metric-name` |
| `sampledRequestsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:sampled-requests-enabled` |"
  [stack id config]
  (let [builder (CfnWebACL$VisibilityConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-metrics-enabled)]
      (. builder cloudWatchMetricsEnabled data))
    (when-let [data (lookup-entry config id :metric-name)]
      (. builder metricName data))
    (when-let [data (lookup-entry config id :sampled-requests-enabled)]
      (. builder sampledRequestsEnabled data))
    (.build builder)))


(defn cfn-web-acl-xss-match-statement-property-builder
  "The cfn-web-acl-xss-match-statement-property-builder function buildes out new instances of 
CfnWebACL$XssMatchStatementProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fieldToMatch` | software.amazon.awscdk.services.wafv2.CfnWebACL$FieldToMatchProperty | [[cdk.support/lookup-entry]] | `:field-to-match` |
| `textTransformations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:text-transformations` |"
  [stack id config]
  (let [builder (CfnWebACL$XssMatchStatementProperty$Builder.)]
    (when-let [data (lookup-entry config id :field-to-match)]
      (. builder fieldToMatch data))
    (when-let [data (lookup-entry config id :text-transformations)]
      (. builder textTransformations data))
    (.build builder)))