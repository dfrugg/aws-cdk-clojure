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


(defn cfn-firewall-builder
  "The cfn-firewall-builder function buildes out new instances of 
CfnFirewall$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnFirewall$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-firewall-policy-action-definition-property-builder
  "The cfn-firewall-policy-action-definition-property-builder function buildes out new instances of 
CfnFirewallPolicy$ActionDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publishMetricAction` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:publish-metric-action` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$ActionDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :publish-metric-action)]
      (. builder publishMetricAction data))
    (.build builder)))


(defn cfn-firewall-policy-builder
  "The cfn-firewall-policy-builder function buildes out new instances of 
CfnFirewallPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `firewallPolicy` | software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy$FirewallPolicyProperty | [[cdk.support/lookup-entry]] | `:firewall-policy` |
| `firewallPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-policy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :firewall-policy)]
      (. builder firewallPolicy data))
    (when-let [data (lookup-entry config id :firewall-policy-name)]
      (. builder firewallPolicyName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-firewall-policy-custom-action-property-builder
  "The cfn-firewall-policy-custom-action-property-builder function buildes out new instances of 
CfnFirewallPolicy$CustomActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionDefinition` | software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy$ActionDefinitionProperty | [[cdk.support/lookup-entry]] | `:action-definition` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$CustomActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :action-definition)]
      (. builder actionDefinition data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (.build builder)))


(defn cfn-firewall-policy-dimension-property-builder
  "The cfn-firewall-policy-dimension-property-builder function buildes out new instances of 
CfnFirewallPolicy$DimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$DimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-firewall-policy-firewall-policy-property-builder
  "The cfn-firewall-policy-firewall-policy-property-builder function buildes out new instances of 
CfnFirewallPolicy$FirewallPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `tlsInspectionConfigurationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-inspection-configuration-arn` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$FirewallPolicyProperty$Builder.)]
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
    (.build builder)))


(defn cfn-firewall-policy-ip-set-property-builder
  "The cfn-firewall-policy-ip-set-property-builder function buildes out new instances of 
CfnFirewallPolicy$IPSetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.util.List | [[cdk.support/lookup-entry]] | `:definition` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$IPSetProperty$Builder.)]
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (.build builder)))


(defn cfn-firewall-policy-policy-variables-property-builder
  "The cfn-firewall-policy-policy-variables-property-builder function buildes out new instances of 
CfnFirewallPolicy$PolicyVariablesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleVariables` | java.util.Map | [[cdk.support/lookup-entry]] | `:rule-variables` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$PolicyVariablesProperty$Builder.)]
    (when-let [data (lookup-entry config id :rule-variables)]
      (. builder ruleVariables data))
    (.build builder)))


(defn cfn-firewall-policy-props-builder
  "The cfn-firewall-policy-props-builder function buildes out new instances of 
CfnFirewallPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `firewallPolicy` | software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy$FirewallPolicyProperty | [[cdk.support/lookup-entry]] | `:firewall-policy` |
| `firewallPolicyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-policy-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFirewallPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :firewall-policy)]
      (. builder firewallPolicy data))
    (when-let [data (lookup-entry config id :firewall-policy-name)]
      (. builder firewallPolicyName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-firewall-policy-publish-metric-action-property-builder
  "The cfn-firewall-policy-publish-metric-action-property-builder function buildes out new instances of 
CfnFirewallPolicy$PublishMetricActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$PublishMetricActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (.build builder)))


(defn cfn-firewall-policy-stateful-engine-options-property-builder
  "The cfn-firewall-policy-stateful-engine-options-property-builder function buildes out new instances of 
CfnFirewallPolicy$StatefulEngineOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-order` |
| `streamExceptionPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:stream-exception-policy` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$StatefulEngineOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :rule-order)]
      (. builder ruleOrder data))
    (when-let [data (lookup-entry config id :stream-exception-policy)]
      (. builder streamExceptionPolicy data))
    (.build builder)))


(defn cfn-firewall-policy-stateful-rule-group-override-property-builder
  "The cfn-firewall-policy-stateful-rule-group-override-property-builder function buildes out new instances of 
CfnFirewallPolicy$StatefulRuleGroupOverrideProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$StatefulRuleGroupOverrideProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (.build builder)))


(defn cfn-firewall-policy-stateful-rule-group-reference-property-builder
  "The cfn-firewall-policy-stateful-rule-group-reference-property-builder function buildes out new instances of 
CfnFirewallPolicy$StatefulRuleGroupReferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `override` | software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy$StatefulRuleGroupOverrideProperty | [[cdk.support/lookup-entry]] | `:override` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$StatefulRuleGroupReferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :override)]
      (. builder override data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-firewall-policy-stateless-rule-group-reference-property-builder
  "The cfn-firewall-policy-stateless-rule-group-reference-property-builder function buildes out new instances of 
CfnFirewallPolicy$StatelessRuleGroupReferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnFirewallPolicy$StatelessRuleGroupReferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-firewall-props-builder
  "The cfn-firewall-props-builder function buildes out new instances of 
CfnFirewallProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnFirewallProps$Builder.)]
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
    (.build builder)))


(defn cfn-firewall-subnet-mapping-property-builder
  "The cfn-firewall-subnet-mapping-property-builder function buildes out new instances of 
CfnFirewall$SubnetMappingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnFirewall$SubnetMappingProperty$Builder.)]
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-logging-configuration-builder
  "The cfn-logging-configuration-builder function buildes out new instances of 
CfnLoggingConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-arn` |
| `firewallName` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-name` |
| `loggingConfiguration` | software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration$LoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:logging-configuration` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :firewall-arn)]
      (. builder firewallArn data))
    (when-let [data (lookup-entry config id :firewall-name)]
      (. builder firewallName data))
    (when-let [data (lookup-entry config id :logging-configuration)]
      (. builder loggingConfiguration data))
    (.build builder)))


(defn cfn-logging-configuration-log-destination-config-property-builder
  "The cfn-logging-configuration-log-destination-config-property-builder function buildes out new instances of 
CfnLoggingConfiguration$LogDestinationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDestination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-destination` |
| `logDestinationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-destination-type` |
| `logType` | java.lang.String | [[cdk.support/lookup-entry]] | `:log-type` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$LogDestinationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-destination)]
      (. builder logDestination data))
    (when-let [data (lookup-entry config id :log-destination-type)]
      (. builder logDestinationType data))
    (when-let [data (lookup-entry config id :log-type)]
      (. builder logType data))
    (.build builder)))


(defn cfn-logging-configuration-logging-configuration-property-builder
  "The cfn-logging-configuration-logging-configuration-property-builder function buildes out new instances of 
CfnLoggingConfiguration$LoggingConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `logDestinationConfigs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-destination-configs` |"
  [stack id config]
  (let [builder (CfnLoggingConfiguration$LoggingConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :log-destination-configs)]
      (. builder logDestinationConfigs data))
    (.build builder)))


(defn cfn-logging-configuration-props-builder
  "The cfn-logging-configuration-props-builder function buildes out new instances of 
CfnLoggingConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-arn` |
| `firewallName` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-name` |
| `loggingConfiguration` | software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration$LoggingConfigurationProperty | [[cdk.support/lookup-entry]] | `:logging-configuration` |"
  [stack id config]
  (let [builder (CfnLoggingConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :firewall-arn)]
      (. builder firewallArn data))
    (when-let [data (lookup-entry config id :firewall-name)]
      (. builder firewallName data))
    (when-let [data (lookup-entry config id :logging-configuration)]
      (. builder loggingConfiguration data))
    (.build builder)))


(defn cfn-rule-group-action-definition-property-builder
  "The cfn-rule-group-action-definition-property-builder function buildes out new instances of 
CfnRuleGroup$ActionDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `publishMetricAction` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$PublishMetricActionProperty | [[cdk.support/lookup-entry]] | `:publish-metric-action` |"
  [stack id config]
  (let [builder (CfnRuleGroup$ActionDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :publish-metric-action)]
      (. builder publishMetricAction data))
    (.build builder)))


(defn cfn-rule-group-address-property-builder
  "The cfn-rule-group-address-property-builder function buildes out new instances of 
CfnRuleGroup$AddressProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:address-definition` |"
  [stack id config]
  (let [builder (CfnRuleGroup$AddressProperty$Builder.)]
    (when-let [data (lookup-entry config id :address-definition)]
      (. builder addressDefinition data))
    (.build builder)))


(defn cfn-rule-group-builder
  "The cfn-rule-group-builder function buildes out new instances of 
CfnRuleGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:capacity` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ruleGroup` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$RuleGroupProperty | [[cdk.support/lookup-entry]] | `:rule-group` |
| `ruleGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnRuleGroup$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-rule-group-custom-action-property-builder
  "The cfn-rule-group-custom-action-property-builder function buildes out new instances of 
CfnRuleGroup$CustomActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actionDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:action-definition` |
| `actionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:action-name` |"
  [stack id config]
  (let [builder (CfnRuleGroup$CustomActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :action-definition)]
      (. builder actionDefinition data))
    (when-let [data (lookup-entry config id :action-name)]
      (. builder actionName data))
    (.build builder)))


(defn cfn-rule-group-dimension-property-builder
  "The cfn-rule-group-dimension-property-builder function buildes out new instances of 
CfnRuleGroup$DimensionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRuleGroup$DimensionProperty$Builder.)]
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-rule-group-header-property-builder
  "The cfn-rule-group-header-property-builder function buildes out new instances of 
CfnRuleGroup$HeaderProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destination` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination` |
| `destinationPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-port` |
| `direction` | java.lang.String | [[cdk.support/lookup-entry]] | `:direction` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `sourcePort` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-port` |"
  [stack id config]
  (let [builder (CfnRuleGroup$HeaderProperty$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-ip-set-property-builder
  "The cfn-rule-group-ip-set-property-builder function buildes out new instances of 
CfnRuleGroup$IPSetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.util.List | [[cdk.support/lookup-entry]] | `:definition` |"
  [stack id config]
  (let [builder (CfnRuleGroup$IPSetProperty$Builder.)]
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (.build builder)))


(defn cfn-rule-group-ip-set-reference-property-builder
  "The cfn-rule-group-ip-set-reference-property-builder function buildes out new instances of 
CfnRuleGroup$IPSetReferenceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:reference-arn` |"
  [stack id config]
  (let [builder (CfnRuleGroup$IPSetReferenceProperty$Builder.)]
    (when-let [data (lookup-entry config id :reference-arn)]
      (. builder referenceArn data))
    (.build builder)))


(defn cfn-rule-group-match-attributes-property-builder
  "The cfn-rule-group-match-attributes-property-builder function buildes out new instances of 
CfnRuleGroup$MatchAttributesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPorts` | java.util.List | [[cdk.support/lookup-entry]] | `:destination-ports` |
| `destinations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destinations` |
| `protocols` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:protocols` |
| `sourcePorts` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ports` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tcpFlags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tcp-flags` |"
  [stack id config]
  (let [builder (CfnRuleGroup$MatchAttributesProperty$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-port-range-property-builder
  "The cfn-rule-group-port-range-property-builder function buildes out new instances of 
CfnRuleGroup$PortRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnRuleGroup$PortRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-rule-group-port-set-property-builder
  "The cfn-rule-group-port-set-property-builder function buildes out new instances of 
CfnRuleGroup$PortSetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.util.List | [[cdk.support/lookup-entry]] | `:definition` |"
  [stack id config]
  (let [builder (CfnRuleGroup$PortSetProperty$Builder.)]
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (.build builder)))


(defn cfn-rule-group-props-builder
  "The cfn-rule-group-props-builder function buildes out new instances of 
CfnRuleGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:capacity` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `ruleGroup` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-group` |
| `ruleGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-group-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnRuleGroupProps$Builder.)]
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
    (.build builder)))


(defn cfn-rule-group-publish-metric-action-property-builder
  "The cfn-rule-group-publish-metric-action-property-builder function buildes out new instances of 
CfnRuleGroup$PublishMetricActionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dimensions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dimensions` |"
  [stack id config]
  (let [builder (CfnRuleGroup$PublishMetricActionProperty$Builder.)]
    (when-let [data (lookup-entry config id :dimensions)]
      (. builder dimensions data))
    (.build builder)))


(defn cfn-rule-group-reference-sets-property-builder
  "The cfn-rule-group-reference-sets-property-builder function buildes out new instances of 
CfnRuleGroup$ReferenceSetsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipSetReferences` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-set-references` |"
  [stack id config]
  (let [builder (CfnRuleGroup$ReferenceSetsProperty$Builder.)]
    (when-let [data (lookup-entry config id :ip-set-references)]
      (. builder ipSetReferences data))
    (.build builder)))


(defn cfn-rule-group-rule-definition-property-builder
  "The cfn-rule-group-rule-definition-property-builder function buildes out new instances of 
CfnRuleGroup$RuleDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `actions` | java.util.List | [[cdk.support/lookup-entry]] | `:actions` |
| `matchAttributes` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$MatchAttributesProperty | [[cdk.support/lookup-entry]] | `:match-attributes` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RuleDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :actions)]
      (. builder actions data))
    (when-let [data (lookup-entry config id :match-attributes)]
      (. builder matchAttributes data))
    (.build builder)))


(defn cfn-rule-group-rule-group-property-builder
  "The cfn-rule-group-rule-group-property-builder function buildes out new instances of 
CfnRuleGroup$RuleGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `referenceSets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:reference-sets` |
| `ruleVariables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-variables` |
| `rulesSource` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$RulesSourceProperty | [[cdk.support/lookup-entry]] | `:rules-source` |
| `statefulRuleOptions` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$StatefulRuleOptionsProperty | [[cdk.support/lookup-entry]] | `:stateful-rule-options` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RuleGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :reference-sets)]
      (. builder referenceSets data))
    (when-let [data (lookup-entry config id :rule-variables)]
      (. builder ruleVariables data))
    (when-let [data (lookup-entry config id :rules-source)]
      (. builder rulesSource data))
    (when-let [data (lookup-entry config id :stateful-rule-options)]
      (. builder statefulRuleOptions data))
    (.build builder)))


(defn cfn-rule-group-rule-option-property-builder
  "The cfn-rule-group-rule-option-property-builder function buildes out new instances of 
CfnRuleGroup$RuleOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keyword` | java.lang.String | [[cdk.support/lookup-entry]] | `:keyword` |
| `settings` | java.util.List | [[cdk.support/lookup-entry]] | `:settings` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RuleOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :keyword)]
      (. builder keyword data))
    (when-let [data (lookup-entry config id :settings)]
      (. builder settings data))
    (.build builder)))


(defn cfn-rule-group-rule-variables-property-builder
  "The cfn-rule-group-rule-variables-property-builder function buildes out new instances of 
CfnRuleGroup$RuleVariablesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ipSets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ip-sets` |
| `portSets` | java.util.Map | [[cdk.support/lookup-entry]] | `:port-sets` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RuleVariablesProperty$Builder.)]
    (when-let [data (lookup-entry config id :ip-sets)]
      (. builder ipSets data))
    (when-let [data (lookup-entry config id :port-sets)]
      (. builder portSets data))
    (.build builder)))


(defn cfn-rule-group-rules-source-list-property-builder
  "The cfn-rule-group-rules-source-list-property-builder function buildes out new instances of 
CfnRuleGroup$RulesSourceListProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `generatedRulesType` | java.lang.String | [[cdk.support/lookup-entry]] | `:generated-rules-type` |
| `targetTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:target-types` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RulesSourceListProperty$Builder.)]
    (when-let [data (lookup-entry config id :generated-rules-type)]
      (. builder generatedRulesType data))
    (when-let [data (lookup-entry config id :target-types)]
      (. builder targetTypes data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (.build builder)))


(defn cfn-rule-group-rules-source-property-builder
  "The cfn-rule-group-rules-source-property-builder function buildes out new instances of 
CfnRuleGroup$RulesSourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `rulesSourceList` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rules-source-list` |
| `rulesString` | java.lang.String | [[cdk.support/lookup-entry]] | `:rules-string` |
| `statefulRules` | java.util.List | [[cdk.support/lookup-entry]] | `:stateful-rules` |
| `statelessRulesAndCustomActions` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$StatelessRulesAndCustomActionsProperty | [[cdk.support/lookup-entry]] | `:stateless-rules-and-custom-actions` |"
  [stack id config]
  (let [builder (CfnRuleGroup$RulesSourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :rules-source-list)]
      (. builder rulesSourceList data))
    (when-let [data (lookup-entry config id :rules-string)]
      (. builder rulesString data))
    (when-let [data (lookup-entry config id :stateful-rules)]
      (. builder statefulRules data))
    (when-let [data (lookup-entry config id :stateless-rules-and-custom-actions)]
      (. builder statelessRulesAndCustomActions data))
    (.build builder)))


(defn cfn-rule-group-stateful-rule-options-property-builder
  "The cfn-rule-group-stateful-rule-options-property-builder function buildes out new instances of 
CfnRuleGroup$StatefulRuleOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ruleOrder` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-order` |"
  [stack id config]
  (let [builder (CfnRuleGroup$StatefulRuleOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :rule-order)]
      (. builder ruleOrder data))
    (.build builder)))


(defn cfn-rule-group-stateful-rule-property-builder
  "The cfn-rule-group-stateful-rule-property-builder function buildes out new instances of 
CfnRuleGroup$StatefulRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `header` | software.amazon.awscdk.services.networkfirewall.CfnRuleGroup$HeaderProperty | [[cdk.support/lookup-entry]] | `:header` |
| `ruleOptions` | java.util.List | [[cdk.support/lookup-entry]] | `:rule-options` |"
  [stack id config]
  (let [builder (CfnRuleGroup$StatefulRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :action)]
      (. builder action data))
    (when-let [data (lookup-entry config id :header)]
      (. builder header data))
    (when-let [data (lookup-entry config id :rule-options)]
      (. builder ruleOptions data))
    (.build builder)))


(defn cfn-rule-group-stateless-rule-property-builder
  "The cfn-rule-group-stateless-rule-property-builder function buildes out new instances of 
CfnRuleGroup$StatelessRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `ruleDefinition` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rule-definition` |"
  [stack id config]
  (let [builder (CfnRuleGroup$StatelessRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :rule-definition)]
      (. builder ruleDefinition data))
    (.build builder)))


(defn cfn-rule-group-stateless-rules-and-custom-actions-property-builder
  "The cfn-rule-group-stateless-rules-and-custom-actions-property-builder function buildes out new instances of 
CfnRuleGroup$StatelessRulesAndCustomActionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customActions` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-actions` |
| `statelessRules` | java.util.List | [[cdk.support/lookup-entry]] | `:stateless-rules` |"
  [stack id config]
  (let [builder (CfnRuleGroup$StatelessRulesAndCustomActionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-actions)]
      (. builder customActions data))
    (when-let [data (lookup-entry config id :stateless-rules)]
      (. builder statelessRules data))
    (.build builder)))


(defn cfn-rule-group-tcp-flag-field-property-builder
  "The cfn-rule-group-tcp-flag-field-property-builder function buildes out new instances of 
CfnRuleGroup$TCPFlagFieldProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flags` | java.util.List | [[cdk.support/lookup-entry]] | `:flags` |
| `masks` | java.util.List | [[cdk.support/lookup-entry]] | `:masks` |"
  [stack id config]
  (let [builder (CfnRuleGroup$TCPFlagFieldProperty$Builder.)]
    (when-let [data (lookup-entry config id :flags)]
      (. builder flags data))
    (when-let [data (lookup-entry config id :masks)]
      (. builder masks data))
    (.build builder)))


(defn cfn-tls-inspection-configuration-address-property-builder
  "The cfn-tls-inspection-configuration-address-property-builder function buildes out new instances of 
CfnTLSInspectionConfiguration$AddressProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addressDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:address-definition` |"
  [stack id config]
  (let [builder (CfnTLSInspectionConfiguration$AddressProperty$Builder.)]
    (when-let [data (lookup-entry config id :address-definition)]
      (. builder addressDefinition data))
    (.build builder)))


(defn cfn-tls-inspection-configuration-builder
  "The cfn-tls-inspection-configuration-builder function buildes out new instances of 
CfnTLSInspectionConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tlsInspectionConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tls-inspection-configuration` |
| `tlsInspectionConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-inspection-configuration-name` |"
  [stack id config]
  (let [builder (CfnTLSInspectionConfiguration$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tls-inspection-configuration)]
      (. builder tlsInspectionConfiguration data))
    (when-let [data (lookup-entry config id :tls-inspection-configuration-name)]
      (. builder tlsInspectionConfigurationName data))
    (.build builder)))


(defn cfn-tls-inspection-configuration-check-certificate-revocation-status-property-builder
  "The cfn-tls-inspection-configuration-check-certificate-revocation-status-property-builder function buildes out new instances of 
CfnTLSInspectionConfiguration$CheckCertificateRevocationStatusProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `revokedStatusAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:revoked-status-action` |
| `unknownStatusAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:unknown-status-action` |"
  [stack id config]
  (let [builder (CfnTLSInspectionConfiguration$CheckCertificateRevocationStatusProperty$Builder.)]
    (when-let [data (lookup-entry config id :revoked-status-action)]
      (. builder revokedStatusAction data))
    (when-let [data (lookup-entry config id :unknown-status-action)]
      (. builder unknownStatusAction data))
    (.build builder)))


(defn cfn-tls-inspection-configuration-port-range-property-builder
  "The cfn-tls-inspection-configuration-port-range-property-builder function buildes out new instances of 
CfnTLSInspectionConfiguration$PortRangeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `fromPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:from-port` |
| `toPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:to-port` |"
  [stack id config]
  (let [builder (CfnTLSInspectionConfiguration$PortRangeProperty$Builder.)]
    (when-let [data (lookup-entry config id :from-port)]
      (. builder fromPort data))
    (when-let [data (lookup-entry config id :to-port)]
      (. builder toPort data))
    (.build builder)))


(defn cfn-tls-inspection-configuration-props-builder
  "The cfn-tls-inspection-configuration-props-builder function buildes out new instances of 
CfnTLSInspectionConfigurationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `tlsInspectionConfiguration` | software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration$TLSInspectionConfigurationProperty | [[cdk.support/lookup-entry]] | `:tls-inspection-configuration` |
| `tlsInspectionConfigurationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-inspection-configuration-name` |"
  [stack id config]
  (let [builder (CfnTLSInspectionConfigurationProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tls-inspection-configuration)]
      (. builder tlsInspectionConfiguration data))
    (when-let [data (lookup-entry config id :tls-inspection-configuration-name)]
      (. builder tlsInspectionConfigurationName data))
    (.build builder)))


(defn cfn-tls-inspection-configuration-server-certificate-configuration-property-builder
  "The cfn-tls-inspection-configuration-server-certificate-configuration-property-builder function buildes out new instances of 
CfnTLSInspectionConfiguration$ServerCertificateConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateAuthorityArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-authority-arn` |
| `checkCertificateRevocationStatus` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:check-certificate-revocation-status` |
| `scopes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scopes` |
| `serverCertificates` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:server-certificates` |"
  [stack id config]
  (let [builder (CfnTLSInspectionConfiguration$ServerCertificateConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-authority-arn)]
      (. builder certificateAuthorityArn data))
    (when-let [data (lookup-entry config id :check-certificate-revocation-status)]
      (. builder checkCertificateRevocationStatus data))
    (when-let [data (lookup-entry config id :scopes)]
      (. builder scopes data))
    (when-let [data (lookup-entry config id :server-certificates)]
      (. builder serverCertificates data))
    (.build builder)))


(defn cfn-tls-inspection-configuration-server-certificate-property-builder
  "The cfn-tls-inspection-configuration-server-certificate-property-builder function buildes out new instances of 
CfnTLSInspectionConfiguration$ServerCertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |"
  [stack id config]
  (let [builder (CfnTLSInspectionConfiguration$ServerCertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :resource-arn)]
      (. builder resourceArn data))
    (.build builder)))


(defn cfn-tls-inspection-configuration-server-certificate-scope-property-builder
  "The cfn-tls-inspection-configuration-server-certificate-scope-property-builder function buildes out new instances of 
CfnTLSInspectionConfiguration$ServerCertificateScopeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationPorts` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:destination-ports` |
| `destinations` | java.util.List | [[cdk.support/lookup-entry]] | `:destinations` |
| `protocols` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:protocols` |
| `sourcePorts` | java.util.List | [[cdk.support/lookup-entry]] | `:source-ports` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |"
  [stack id config]
  (let [builder (CfnTLSInspectionConfiguration$ServerCertificateScopeProperty$Builder.)]
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
    (.build builder)))


(defn cfn-tls-inspection-configuration-tls-inspection-configuration-property-builder
  "The cfn-tls-inspection-configuration-tls-inspection-configuration-property-builder function buildes out new instances of 
CfnTLSInspectionConfiguration$TLSInspectionConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `serverCertificateConfigurations` | java.util.List | [[cdk.support/lookup-entry]] | `:server-certificate-configurations` |"
  [stack id config]
  (let [builder (CfnTLSInspectionConfiguration$TLSInspectionConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :server-certificate-configurations)]
      (. builder serverCertificateConfigurations data))
    (.build builder)))