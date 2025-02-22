(ns cdk.api.services.networkfirewall
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.networkfirewall package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.networkfirewall CfnFirewall$Builder
                                                            CfnFirewall$SubnetMappingProperty$Builder
                                                            CfnFirewallPolicy$ActionDefinitionProperty$Builder
                                                            CfnFirewallPolicy$Builder
                                                            CfnFirewallPolicy$CustomActionProperty$Builder
                                                            CfnFirewallPolicy$DimensionProperty$Builder
                                                            CfnFirewallPolicy$FirewallPolicyProperty$Builder
                                                            CfnFirewallPolicy$IPSetProperty$Builder
                                                            CfnFirewallPolicy$PolicyVariablesProperty$Builder
                                                            CfnFirewallPolicy$PublishMetricActionProperty$Builder
                                                            CfnFirewallPolicy$StatefulEngineOptionsProperty$Builder
                                                            CfnFirewallPolicy$StatefulRuleGroupOverrideProperty$Builder
                                                            CfnFirewallPolicy$StatefulRuleGroupReferenceProperty$Builder
                                                            CfnFirewallPolicy$StatelessRuleGroupReferenceProperty$Builder
                                                            CfnFirewallPolicyProps$Builder
                                                            CfnFirewallProps$Builder
                                                            CfnLoggingConfiguration$Builder
                                                            CfnLoggingConfiguration$LogDestinationConfigProperty$Builder
                                                            CfnLoggingConfiguration$LoggingConfigurationProperty$Builder
                                                            CfnLoggingConfigurationProps$Builder
                                                            CfnRuleGroup$ActionDefinitionProperty$Builder
                                                            CfnRuleGroup$AddressProperty$Builder
                                                            CfnRuleGroup$Builder
                                                            CfnRuleGroup$CustomActionProperty$Builder
                                                            CfnRuleGroup$DimensionProperty$Builder
                                                            CfnRuleGroup$HeaderProperty$Builder
                                                            CfnRuleGroup$IPSetProperty$Builder
                                                            CfnRuleGroup$IPSetReferenceProperty$Builder
                                                            CfnRuleGroup$MatchAttributesProperty$Builder
                                                            CfnRuleGroup$PortRangeProperty$Builder
                                                            CfnRuleGroup$PortSetProperty$Builder
                                                            CfnRuleGroup$PublishMetricActionProperty$Builder
                                                            CfnRuleGroup$ReferenceSetsProperty$Builder
                                                            CfnRuleGroup$RuleDefinitionProperty$Builder
                                                            CfnRuleGroup$RuleGroupProperty$Builder
                                                            CfnRuleGroup$RuleOptionProperty$Builder
                                                            CfnRuleGroup$RuleVariablesProperty$Builder
                                                            CfnRuleGroup$RulesSourceListProperty$Builder
                                                            CfnRuleGroup$RulesSourceProperty$Builder
                                                            CfnRuleGroup$StatefulRuleOptionsProperty$Builder
                                                            CfnRuleGroup$StatefulRuleProperty$Builder
                                                            CfnRuleGroup$StatelessRuleProperty$Builder
                                                            CfnRuleGroup$StatelessRulesAndCustomActionsProperty$Builder
                                                            CfnRuleGroup$TCPFlagFieldProperty$Builder
                                                            CfnRuleGroupProps$Builder
                                                            CfnTLSInspectionConfiguration$AddressProperty$Builder
                                                            CfnTLSInspectionConfiguration$Builder
                                                            CfnTLSInspectionConfiguration$CheckCertificateRevocationStatusProperty$Builder
                                                            CfnTLSInspectionConfiguration$PortRangeProperty$Builder
                                                            CfnTLSInspectionConfiguration$ServerCertificateConfigurationProperty$Builder
                                                            CfnTLSInspectionConfiguration$ServerCertificateProperty$Builder
                                                            CfnTLSInspectionConfiguration$ServerCertificateScopeProperty$Builder
                                                            CfnTLSInspectionConfiguration$TLSInspectionConfigurationProperty$Builder
                                                            CfnTLSInspectionConfigurationProps$Builder]))


(defn build-cfn-firewall-builder
  "The build-cfn-firewall-builder function updates a CfnFirewall$Builder instance using the provided configuration.
  The function takes the CfnFirewall$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-protection` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `firewallName` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-name` |
| `firewallPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-policy-arn` |
| `firewallPolicyChangeProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:firewall-policy-change-protection` |
| `subnetChangeProtection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subnet-change-protection` |
| `subnetMappings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:subnet-mappings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnFirewall$Builder builder id config]
  (when-let [data (lookup-entry config id :delete-protection)]
    (. builder deleteProtection data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :firewall-name)]
    (. builder firewallName data))
  (when-let [data (lookup-entry config id :firewall-policy-arn)]
    (. builder firewallPolicyArn data))
  (when-let [data (lookup-entry config id :firewall-policy-change-protection)]
    (. builder firewallPolicyChangeProtection data))
  (when-let [data (lookup-entry config id :subnet-change-protection)]
    (. builder subnetChangeProtection data))
  (when-let [data (lookup-entry config id :subnet-mappings)]
    (. builder subnetMappings data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn build-cfn-firewall-policy-action-definition-property-builder
  "The build-cfn-firewall-policy-action-definition-property-builder function updates a CfnFirewallPolicy$ActionDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$ActionDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publishMetricAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publish-metric-action` |
"
  [^CfnFirewallPolicy$ActionDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :publish-metric-action)]
    (. builder publishMetricAction data))
  (.build builder))


(defn build-cfn-firewall-policy-builder
  "The build-cfn-firewall-policy-builder function updates a CfnFirewallPolicy$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `firewallPolicy` | software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy$FirewallPolicyProperty | [[cdk.support/lookup-entry]] | `:firewall-policy` |
| `firewallPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-policy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFirewallPolicy$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :firewall-policy)]
    (. builder firewallPolicy data))
  (when-let [data (lookup-entry config id :firewall-policy-name)]
    (. builder firewallPolicyName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-firewall-policy-custom-action-property-builder
  "The build-cfn-firewall-policy-custom-action-property-builder function updates a CfnFirewallPolicy$CustomActionProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$CustomActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionDefinition` | software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy$ActionDefinitionProperty | [[cdk.support/lookup-entry]] | `:action-definition` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
"
  [^CfnFirewallPolicy$CustomActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action-definition)]
    (. builder actionDefinition data))
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (.build builder))


(defn build-cfn-firewall-policy-dimension-property-builder
  "The build-cfn-firewall-policy-dimension-property-builder function updates a CfnFirewallPolicy$DimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$DimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnFirewallPolicy$DimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-firewall-policy-firewall-policy-property-builder
  "The build-cfn-firewall-policy-firewall-policy-property-builder function updates a CfnFirewallPolicy$FirewallPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$FirewallPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policyVariables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy-variables` |
| `statefulDefaultActions` | java.util.List | [[cdk.support/lookup-entry]] | `:stateful-default-actions` |
| `statefulEngineOptions` | software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy$StatefulEngineOptionsProperty | [[cdk.support/lookup-entry]] | `:stateful-engine-options` |
| `statefulRuleGroupReferences` | java.util.List | [[cdk.support/lookup-entry]] | `:stateful-rule-group-references` |
| `statelessCustomActions` | java.util.List | [[cdk.support/lookup-entry]] | `:stateless-custom-actions` |
| `statelessDefaultActions` | java.util.List | [[cdk.support/lookup-entry]] | `:stateless-default-actions` |
| `statelessFragmentDefaultActions` | java.util.List | [[cdk.support/lookup-entry]] | `:stateless-fragment-default-actions` |
| `statelessRuleGroupReferences` | java.util.List | [[cdk.support/lookup-entry]] | `:stateless-rule-group-references` |
| `tlsInspectionConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-inspection-configuration-arn` |
"
  [^CfnFirewallPolicy$FirewallPolicyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :policy-variables)]
    (. builder policyVariables data))
  (when-let [data (lookup-entry config id :stateful-default-actions)]
    (. builder statefulDefaultActions data))
  (when-let [data (lookup-entry config id :stateful-engine-options)]
    (. builder statefulEngineOptions data))
  (when-let [data (lookup-entry config id :stateful-rule-group-references)]
    (. builder statefulRuleGroupReferences data))
  (when-let [data (lookup-entry config id :stateless-custom-actions)]
    (. builder statelessCustomActions data))
  (when-let [data (lookup-entry config id :stateless-default-actions)]
    (. builder statelessDefaultActions data))
  (when-let [data (lookup-entry config id :stateless-fragment-default-actions)]
    (. builder statelessFragmentDefaultActions data))
  (when-let [data (lookup-entry config id :stateless-rule-group-references)]
    (. builder statelessRuleGroupReferences data))
  (when-let [data (lookup-entry config id :tls-inspection-configuration-arn)]
    (. builder tlsInspectionConfigurationArn data))
  (.build builder))


(defn build-cfn-firewall-policy-ip-set-property-builder
  "The build-cfn-firewall-policy-ip-set-property-builder function updates a CfnFirewallPolicy$IPSetProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$IPSetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.util.List | [[cdk.support/lookup-entry]] | `:definition` |
"
  [^CfnFirewallPolicy$IPSetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (.build builder))


(defn build-cfn-firewall-policy-policy-variables-property-builder
  "The build-cfn-firewall-policy-policy-variables-property-builder function updates a CfnFirewallPolicy$PolicyVariablesProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$PolicyVariablesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:rule-variables` |
"
  [^CfnFirewallPolicy$PolicyVariablesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rule-variables)]
    (. builder ruleVariables data))
  (.build builder))


(defn build-cfn-firewall-policy-props-builder
  "The build-cfn-firewall-policy-props-builder function updates a CfnFirewallPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `firewallPolicy` | software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy$FirewallPolicyProperty | [[cdk.support/lookup-entry]] | `:firewall-policy` |
| `firewallPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-policy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFirewallPolicyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :firewall-policy)]
    (. builder firewallPolicy data))
  (when-let [data (lookup-entry config id :firewall-policy-name)]
    (. builder firewallPolicyName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-firewall-policy-publish-metric-action-property-builder
  "The build-cfn-firewall-policy-publish-metric-action-property-builder function updates a CfnFirewallPolicy$PublishMetricActionProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$PublishMetricActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
"
  [^CfnFirewallPolicy$PublishMetricActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (.build builder))


(defn build-cfn-firewall-policy-stateful-engine-options-property-builder
  "The build-cfn-firewall-policy-stateful-engine-options-property-builder function updates a CfnFirewallPolicy$StatefulEngineOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$StatefulEngineOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-order` |
| `streamExceptionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-exception-policy` |
"
  [^CfnFirewallPolicy$StatefulEngineOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rule-order)]
    (. builder ruleOrder data))
  (when-let [data (lookup-entry config id :stream-exception-policy)]
    (. builder streamExceptionPolicy data))
  (.build builder))


(defn build-cfn-firewall-policy-stateful-rule-group-override-property-builder
  "The build-cfn-firewall-policy-stateful-rule-group-override-property-builder function updates a CfnFirewallPolicy$StatefulRuleGroupOverrideProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$StatefulRuleGroupOverrideProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
"
  [^CfnFirewallPolicy$StatefulRuleGroupOverrideProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (.build builder))


(defn build-cfn-firewall-policy-stateful-rule-group-reference-property-builder
  "The build-cfn-firewall-policy-stateful-rule-group-reference-property-builder function updates a CfnFirewallPolicy$StatefulRuleGroupReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$StatefulRuleGroupReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `override` | software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy$StatefulRuleGroupOverrideProperty | [[cdk.support/lookup-entry]] | `:override` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnFirewallPolicy$StatefulRuleGroupReferenceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :override)]
    (. builder override data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn build-cfn-firewall-policy-stateless-rule-group-reference-property-builder
  "The build-cfn-firewall-policy-stateless-rule-group-reference-property-builder function updates a CfnFirewallPolicy$StatelessRuleGroupReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallPolicy$StatelessRuleGroupReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnFirewallPolicy$StatelessRuleGroupReferenceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn build-cfn-firewall-props-builder
  "The build-cfn-firewall-props-builder function updates a CfnFirewallProps$Builder instance using the provided configuration.
  The function takes the CfnFirewallProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-protection` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `firewallName` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-name` |
| `firewallPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-policy-arn` |
| `firewallPolicyChangeProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:firewall-policy-change-protection` |
| `subnetChangeProtection` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:subnet-change-protection` |
| `subnetMappings` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-mappings` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnFirewallProps$Builder builder id config]
  (when-let [data (lookup-entry config id :delete-protection)]
    (. builder deleteProtection data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :firewall-name)]
    (. builder firewallName data))
  (when-let [data (lookup-entry config id :firewall-policy-arn)]
    (. builder firewallPolicyArn data))
  (when-let [data (lookup-entry config id :firewall-policy-change-protection)]
    (. builder firewallPolicyChangeProtection data))
  (when-let [data (lookup-entry config id :subnet-change-protection)]
    (. builder subnetChangeProtection data))
  (when-let [data (lookup-entry config id :subnet-mappings)]
    (. builder subnetMappings data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn build-cfn-firewall-subnet-mapping-property-builder
  "The build-cfn-firewall-subnet-mapping-property-builder function updates a CfnFirewall$SubnetMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewall$SubnetMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnFirewall$SubnetMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-let [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn build-cfn-logging-configuration-builder
  "The build-cfn-logging-configuration-builder function updates a CfnLoggingConfiguration$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-arn` |
| `firewallName` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-name` |
| `loggingConfiguration` | software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration$LoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:logging-configuration` |
"
  [^CfnLoggingConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :firewall-arn)]
    (. builder firewallArn data))
  (when-let [data (lookup-entry config id :firewall-name)]
    (. builder firewallName data))
  (when-let [data (lookup-entry config id :logging-configuration)]
    (. builder loggingConfiguration data))
  (.build builder))


(defn build-cfn-logging-configuration-log-destination-config-property-builder
  "The build-cfn-logging-configuration-log-destination-config-property-builder function updates a CfnLoggingConfiguration$LogDestinationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$LogDestinationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-destination` |
| `logDestinationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-destination-type` |
| `logType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-type` |
"
  [^CfnLoggingConfiguration$LogDestinationConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-destination)]
    (. builder logDestination data))
  (when-let [data (lookup-entry config id :log-destination-type)]
    (. builder logDestinationType data))
  (when-let [data (lookup-entry config id :log-type)]
    (. builder logType data))
  (.build builder))


(defn build-cfn-logging-configuration-logging-configuration-property-builder
  "The build-cfn-logging-configuration-logging-configuration-property-builder function updates a CfnLoggingConfiguration$LoggingConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfiguration$LoggingConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDestinationConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-destination-configs` |
"
  [^CfnLoggingConfiguration$LoggingConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :log-destination-configs)]
    (. builder logDestinationConfigs data))
  (.build builder))


(defn build-cfn-logging-configuration-props-builder
  "The build-cfn-logging-configuration-props-builder function updates a CfnLoggingConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnLoggingConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-arn` |
| `firewallName` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-name` |
| `loggingConfiguration` | software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration$LoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:logging-configuration` |
"
  [^CfnLoggingConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :firewall-arn)]
    (. builder firewallArn data))
  (when-let [data (lookup-entry config id :firewall-name)]
    (. builder firewallName data))
  (when-let [data (lookup-entry config id :logging-configuration)]
    (. builder loggingConfiguration data))
  (.build builder))


(defn build-cfn-rule-group-action-definition-property-builder
  "The build-cfn-rule-group-action-definition-property-builder function updates a CfnRuleGroup$ActionDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$ActionDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publishMetricAction` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$PublishMetricActionProperty | [[cdk.support/lookup-entry]] | `:publish-metric-action` |
"
  [^CfnRuleGroup$ActionDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :publish-metric-action)]
    (. builder publishMetricAction data))
  (.build builder))


(defn build-cfn-rule-group-address-property-builder
  "The build-cfn-rule-group-address-property-builder function updates a CfnRuleGroup$AddressProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$AddressProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:address-definition` |
"
  [^CfnRuleGroup$AddressProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :address-definition)]
    (. builder addressDefinition data))
  (.build builder))


(defn build-cfn-rule-group-builder
  "The build-cfn-rule-group-builder function updates a CfnRuleGroup$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:capacity` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ruleGroup` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$RuleGroupProperty | [[cdk.support/lookup-entry]] | `:rule-group` |
| `ruleGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnRuleGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :capacity)]
    (. builder capacity data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :rule-group)]
    (. builder ruleGroup data))
  (when-let [data (lookup-entry config id :rule-group-name)]
    (. builder ruleGroupName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-rule-group-custom-action-property-builder
  "The build-cfn-rule-group-custom-action-property-builder function updates a CfnRuleGroup$CustomActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$CustomActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action-definition` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |
"
  [^CfnRuleGroup$CustomActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action-definition)]
    (. builder actionDefinition data))
  (when-let [data (lookup-entry config id :action-name)]
    (. builder actionName data))
  (.build builder))


(defn build-cfn-rule-group-dimension-property-builder
  "The build-cfn-rule-group-dimension-property-builder function updates a CfnRuleGroup$DimensionProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$DimensionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRuleGroup$DimensionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-rule-group-header-property-builder
  "The build-cfn-rule-group-header-property-builder function updates a CfnRuleGroup$HeaderProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$HeaderProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `destinationPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-port` |
| `direction` | java.lang.String | [[cdk.support/lookup-entry]] | `:direction` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `sourcePort` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-port` |
"
  [^CfnRuleGroup$HeaderProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination)]
    (. builder destination data))
  (when-let [data (lookup-entry config id :destination-port)]
    (. builder destinationPort data))
  (when-let [data (lookup-entry config id :direction)]
    (. builder direction data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (when-let [data (lookup-entry config id :source)]
    (. builder source data))
  (when-let [data (lookup-entry config id :source-port)]
    (. builder sourcePort data))
  (.build builder))


(defn build-cfn-rule-group-ip-set-property-builder
  "The build-cfn-rule-group-ip-set-property-builder function updates a CfnRuleGroup$IPSetProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$IPSetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.util.List | [[cdk.support/lookup-entry]] | `:definition` |
"
  [^CfnRuleGroup$IPSetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (.build builder))


(defn build-cfn-rule-group-ip-set-reference-property-builder
  "The build-cfn-rule-group-ip-set-reference-property-builder function updates a CfnRuleGroup$IPSetReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$IPSetReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-arn` |
"
  [^CfnRuleGroup$IPSetReferenceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :reference-arn)]
    (. builder referenceArn data))
  (.build builder))


(defn build-cfn-rule-group-match-attributes-property-builder
  "The build-cfn-rule-group-match-attributes-property-builder function updates a CfnRuleGroup$MatchAttributesProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$MatchAttributesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPorts` | java.util.List | [[cdk.support/lookup-entry]] | `:destination-ports` |
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `protocols` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:protocols` |
| `sourcePorts` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ports` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tcpFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tcp-flags` |
"
  [^CfnRuleGroup$MatchAttributesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-ports)]
    (. builder destinationPorts data))
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-let [data (lookup-entry config id :protocols)]
    (. builder protocols data))
  (when-let [data (lookup-entry config id :source-ports)]
    (. builder sourcePorts data))
  (when-let [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-let [data (lookup-entry config id :tcp-flags)]
    (. builder tcpFlags data))
  (.build builder))


(defn build-cfn-rule-group-port-range-property-builder
  "The build-cfn-rule-group-port-range-property-builder function updates a CfnRuleGroup$PortRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$PortRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |
"
  [^CfnRuleGroup$PortRangeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :from-port)]
    (. builder fromPort data))
  (when-let [data (lookup-entry config id :to-port)]
    (. builder toPort data))
  (.build builder))


(defn build-cfn-rule-group-port-set-property-builder
  "The build-cfn-rule-group-port-set-property-builder function updates a CfnRuleGroup$PortSetProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$PortSetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.util.List | [[cdk.support/lookup-entry]] | `:definition` |
"
  [^CfnRuleGroup$PortSetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (.build builder))


(defn build-cfn-rule-group-props-builder
  "The build-cfn-rule-group-props-builder function updates a CfnRuleGroupProps$Builder instance using the provided configuration.
  The function takes the CfnRuleGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:capacity` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ruleGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-group` |
| `ruleGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnRuleGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :capacity)]
    (. builder capacity data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :rule-group)]
    (. builder ruleGroup data))
  (when-let [data (lookup-entry config id :rule-group-name)]
    (. builder ruleGroupName data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-rule-group-publish-metric-action-property-builder
  "The build-cfn-rule-group-publish-metric-action-property-builder function updates a CfnRuleGroup$PublishMetricActionProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$PublishMetricActionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |
"
  [^CfnRuleGroup$PublishMetricActionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dimensions)]
    (. builder dimensions data))
  (.build builder))


(defn build-cfn-rule-group-reference-sets-property-builder
  "The build-cfn-rule-group-reference-sets-property-builder function updates a CfnRuleGroup$ReferenceSetsProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$ReferenceSetsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipSetReferences` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-references` |
"
  [^CfnRuleGroup$ReferenceSetsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ip-set-references)]
    (. builder ipSetReferences data))
  (.build builder))


(defn build-cfn-rule-group-rule-definition-property-builder
  "The build-cfn-rule-group-rule-definition-property-builder function updates a CfnRuleGroup$RuleDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RuleDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `matchAttributes` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$MatchAttributesProperty | [[cdk.support/lookup-entry]] | `:match-attributes` |
"
  [^CfnRuleGroup$RuleDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :actions)]
    (. builder actions data))
  (when-let [data (lookup-entry config id :match-attributes)]
    (. builder matchAttributes data))
  (.build builder))


(defn build-cfn-rule-group-rule-group-property-builder
  "The build-cfn-rule-group-rule-group-property-builder function updates a CfnRuleGroup$RuleGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RuleGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceSets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference-sets` |
| `ruleVariables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-variables` |
| `rulesSource` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$RulesSourceProperty | [[cdk.support/lookup-entry]] | `:rules-source` |
| `statefulRuleOptions` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$StatefulRuleOptionsProperty | [[cdk.support/lookup-entry]] | `:stateful-rule-options` |
"
  [^CfnRuleGroup$RuleGroupProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :reference-sets)]
    (. builder referenceSets data))
  (when-let [data (lookup-entry config id :rule-variables)]
    (. builder ruleVariables data))
  (when-let [data (lookup-entry config id :rules-source)]
    (. builder rulesSource data))
  (when-let [data (lookup-entry config id :stateful-rule-options)]
    (. builder statefulRuleOptions data))
  (.build builder))


(defn build-cfn-rule-group-rule-option-property-builder
  "The build-cfn-rule-group-rule-option-property-builder function updates a CfnRuleGroup$RuleOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RuleOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyword` | java.lang.String | [[cdk.support/lookup-entry]] | `:keyword` |
| `settings` | java.util.List | [[cdk.support/lookup-entry]] | `:settings` |
"
  [^CfnRuleGroup$RuleOptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :keyword)]
    (. builder keyword data))
  (when-let [data (lookup-entry config id :settings)]
    (. builder settings data))
  (.build builder))


(defn build-cfn-rule-group-rule-variables-property-builder
  "The build-cfn-rule-group-rule-variables-property-builder function updates a CfnRuleGroup$RuleVariablesProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RuleVariablesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipSets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-sets` |
| `portSets` | java.util.Map | [[cdk.support/lookup-entry]] | `:port-sets` |
"
  [^CfnRuleGroup$RuleVariablesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ip-sets)]
    (. builder ipSets data))
  (when-let [data (lookup-entry config id :port-sets)]
    (. builder portSets data))
  (.build builder))


(defn build-cfn-rule-group-rules-source-list-property-builder
  "The build-cfn-rule-group-rules-source-list-property-builder function updates a CfnRuleGroup$RulesSourceListProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RulesSourceListProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `generatedRulesType` | java.lang.String | [[cdk.support/lookup-entry]] | `:generated-rules-type` |
| `targetTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:target-types` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
"
  [^CfnRuleGroup$RulesSourceListProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :generated-rules-type)]
    (. builder generatedRulesType data))
  (when-let [data (lookup-entry config id :target-types)]
    (. builder targetTypes data))
  (when-let [data (lookup-entry config id :targets)]
    (. builder targets data))
  (.build builder))


(defn build-cfn-rule-group-rules-source-property-builder
  "The build-cfn-rule-group-rules-source-property-builder function updates a CfnRuleGroup$RulesSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$RulesSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rulesSourceList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules-source-list` |
| `rulesString` | java.lang.String | [[cdk.support/lookup-entry]] | `:rules-string` |
| `statefulRules` | java.util.List | [[cdk.support/lookup-entry]] | `:stateful-rules` |
| `statelessRulesAndCustomActions` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$StatelessRulesAndCustomActionsProperty | [[cdk.support/lookup-entry]] | `:stateless-rules-and-custom-actions` |
"
  [^CfnRuleGroup$RulesSourceProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rules-source-list)]
    (. builder rulesSourceList data))
  (when-let [data (lookup-entry config id :rules-string)]
    (. builder rulesString data))
  (when-let [data (lookup-entry config id :stateful-rules)]
    (. builder statefulRules data))
  (when-let [data (lookup-entry config id :stateless-rules-and-custom-actions)]
    (. builder statelessRulesAndCustomActions data))
  (.build builder))


(defn build-cfn-rule-group-stateful-rule-options-property-builder
  "The build-cfn-rule-group-stateful-rule-options-property-builder function updates a CfnRuleGroup$StatefulRuleOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$StatefulRuleOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-order` |
"
  [^CfnRuleGroup$StatefulRuleOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :rule-order)]
    (. builder ruleOrder data))
  (.build builder))


(defn build-cfn-rule-group-stateful-rule-property-builder
  "The build-cfn-rule-group-stateful-rule-property-builder function updates a CfnRuleGroup$StatefulRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$StatefulRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `header` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$HeaderProperty | [[cdk.support/lookup-entry]] | `:header` |
| `ruleOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:rule-options` |
"
  [^CfnRuleGroup$StatefulRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :header)]
    (. builder header data))
  (when-let [data (lookup-entry config id :rule-options)]
    (. builder ruleOptions data))
  (.build builder))


(defn build-cfn-rule-group-stateless-rule-property-builder
  "The build-cfn-rule-group-stateless-rule-property-builder function updates a CfnRuleGroup$StatelessRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$StatelessRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `ruleDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-definition` |
"
  [^CfnRuleGroup$StatelessRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :rule-definition)]
    (. builder ruleDefinition data))
  (.build builder))


(defn build-cfn-rule-group-stateless-rules-and-custom-actions-property-builder
  "The build-cfn-rule-group-stateless-rules-and-custom-actions-property-builder function updates a CfnRuleGroup$StatelessRulesAndCustomActionsProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$StatelessRulesAndCustomActionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customActions` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-actions` |
| `statelessRules` | java.util.List | [[cdk.support/lookup-entry]] | `:stateless-rules` |
"
  [^CfnRuleGroup$StatelessRulesAndCustomActionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-actions)]
    (. builder customActions data))
  (when-let [data (lookup-entry config id :stateless-rules)]
    (. builder statelessRules data))
  (.build builder))


(defn build-cfn-rule-group-tcp-flag-field-property-builder
  "The build-cfn-rule-group-tcp-flag-field-property-builder function updates a CfnRuleGroup$TCPFlagFieldProperty$Builder instance using the provided configuration.
  The function takes the CfnRuleGroup$TCPFlagFieldProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flags` | java.util.List | [[cdk.support/lookup-entry]] | `:flags` |
| `masks` | java.util.List | [[cdk.support/lookup-entry]] | `:masks` |
"
  [^CfnRuleGroup$TCPFlagFieldProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :flags)]
    (. builder flags data))
  (when-let [data (lookup-entry config id :masks)]
    (. builder masks data))
  (.build builder))


(defn build-cfn-tls-inspection-configuration-address-property-builder
  "The build-cfn-tls-inspection-configuration-address-property-builder function updates a CfnTLSInspectionConfiguration$AddressProperty$Builder instance using the provided configuration.
  The function takes the CfnTLSInspectionConfiguration$AddressProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:address-definition` |
"
  [^CfnTLSInspectionConfiguration$AddressProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :address-definition)]
    (. builder addressDefinition data))
  (.build builder))


(defn build-cfn-tls-inspection-configuration-builder
  "The build-cfn-tls-inspection-configuration-builder function updates a CfnTLSInspectionConfiguration$Builder instance using the provided configuration.
  The function takes the CfnTLSInspectionConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tlsInspectionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls-inspection-configuration` |
| `tlsInspectionConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-inspection-configuration-name` |
"
  [^CfnTLSInspectionConfiguration$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :tls-inspection-configuration)]
    (. builder tlsInspectionConfiguration data))
  (when-let [data (lookup-entry config id :tls-inspection-configuration-name)]
    (. builder tlsInspectionConfigurationName data))
  (.build builder))


(defn build-cfn-tls-inspection-configuration-check-certificate-revocation-status-property-builder
  "The build-cfn-tls-inspection-configuration-check-certificate-revocation-status-property-builder function updates a CfnTLSInspectionConfiguration$CheckCertificateRevocationStatusProperty$Builder instance using the provided configuration.
  The function takes the CfnTLSInspectionConfiguration$CheckCertificateRevocationStatusProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `revokedStatusAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:revoked-status-action` |
| `unknownStatusAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:unknown-status-action` |
"
  [^CfnTLSInspectionConfiguration$CheckCertificateRevocationStatusProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :revoked-status-action)]
    (. builder revokedStatusAction data))
  (when-let [data (lookup-entry config id :unknown-status-action)]
    (. builder unknownStatusAction data))
  (.build builder))


(defn build-cfn-tls-inspection-configuration-port-range-property-builder
  "The build-cfn-tls-inspection-configuration-port-range-property-builder function updates a CfnTLSInspectionConfiguration$PortRangeProperty$Builder instance using the provided configuration.
  The function takes the CfnTLSInspectionConfiguration$PortRangeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |
"
  [^CfnTLSInspectionConfiguration$PortRangeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :from-port)]
    (. builder fromPort data))
  (when-let [data (lookup-entry config id :to-port)]
    (. builder toPort data))
  (.build builder))


(defn build-cfn-tls-inspection-configuration-props-builder
  "The build-cfn-tls-inspection-configuration-props-builder function updates a CfnTLSInspectionConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnTLSInspectionConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tlsInspectionConfiguration` | software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration$TLSInspectionConfigurationProperty | [[cdk.support/lookup-entry]] | `:tls-inspection-configuration` |
| `tlsInspectionConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-inspection-configuration-name` |
"
  [^CfnTLSInspectionConfigurationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :tls-inspection-configuration)]
    (. builder tlsInspectionConfiguration data))
  (when-let [data (lookup-entry config id :tls-inspection-configuration-name)]
    (. builder tlsInspectionConfigurationName data))
  (.build builder))


(defn build-cfn-tls-inspection-configuration-server-certificate-configuration-property-builder
  "The build-cfn-tls-inspection-configuration-server-certificate-configuration-property-builder function updates a CfnTLSInspectionConfiguration$ServerCertificateConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTLSInspectionConfiguration$ServerCertificateConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `checkCertificateRevocationStatus` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:check-certificate-revocation-status` |
| `scopes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scopes` |
| `serverCertificates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-certificates` |
"
  [^CfnTLSInspectionConfiguration$ServerCertificateConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :certificate-authority-arn)]
    (. builder certificateAuthorityArn data))
  (when-let [data (lookup-entry config id :check-certificate-revocation-status)]
    (. builder checkCertificateRevocationStatus data))
  (when-let [data (lookup-entry config id :scopes)]
    (. builder scopes data))
  (when-let [data (lookup-entry config id :server-certificates)]
    (. builder serverCertificates data))
  (.build builder))


(defn build-cfn-tls-inspection-configuration-server-certificate-property-builder
  "The build-cfn-tls-inspection-configuration-server-certificate-property-builder function updates a CfnTLSInspectionConfiguration$ServerCertificateProperty$Builder instance using the provided configuration.
  The function takes the CfnTLSInspectionConfiguration$ServerCertificateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnTLSInspectionConfiguration$ServerCertificateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn build-cfn-tls-inspection-configuration-server-certificate-scope-property-builder
  "The build-cfn-tls-inspection-configuration-server-certificate-scope-property-builder function updates a CfnTLSInspectionConfiguration$ServerCertificateScopeProperty$Builder instance using the provided configuration.
  The function takes the CfnTLSInspectionConfiguration$ServerCertificateScopeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPorts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-ports` |
| `destinations` | java.util.List | [[cdk.support/lookup-entry]] | `:destinations` |
| `protocols` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:protocols` |
| `sourcePorts` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ports` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
"
  [^CfnTLSInspectionConfiguration$ServerCertificateScopeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-ports)]
    (. builder destinationPorts data))
  (when-let [data (lookup-entry config id :destinations)]
    (. builder destinations data))
  (when-let [data (lookup-entry config id :protocols)]
    (. builder protocols data))
  (when-let [data (lookup-entry config id :source-ports)]
    (. builder sourcePorts data))
  (when-let [data (lookup-entry config id :sources)]
    (. builder sources data))
  (.build builder))


(defn build-cfn-tls-inspection-configuration-tls-inspection-configuration-property-builder
  "The build-cfn-tls-inspection-configuration-tls-inspection-configuration-property-builder function updates a CfnTLSInspectionConfiguration$TLSInspectionConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnTLSInspectionConfiguration$TLSInspectionConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serverCertificateConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:server-certificate-configurations` |
"
  [^CfnTLSInspectionConfiguration$TLSInspectionConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :server-certificate-configurations)]
    (. builder serverCertificateConfigurations data))
  (.build builder))