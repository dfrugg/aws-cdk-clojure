(ns cdk.api.services.route53resolver
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.route53resolver package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.route53resolver CfnFirewallDomainList$Builder
                                                            CfnFirewallDomainListProps$Builder
                                                            CfnFirewallRuleGroup$Builder
                                                            CfnFirewallRuleGroup$FirewallRuleProperty$Builder
                                                            CfnFirewallRuleGroupAssociation$Builder
                                                            CfnFirewallRuleGroupAssociationProps$Builder
                                                            CfnFirewallRuleGroupProps$Builder
                                                            CfnOutpostResolver$Builder
                                                            CfnOutpostResolverProps$Builder
                                                            CfnResolverConfig$Builder
                                                            CfnResolverConfigProps$Builder
                                                            CfnResolverDNSSECConfig$Builder
                                                            CfnResolverDNSSECConfigProps$Builder
                                                            CfnResolverEndpoint$Builder
                                                            CfnResolverEndpoint$IpAddressRequestProperty$Builder
                                                            CfnResolverEndpointProps$Builder
                                                            CfnResolverQueryLoggingConfig$Builder
                                                            CfnResolverQueryLoggingConfigAssociation$Builder
                                                            CfnResolverQueryLoggingConfigAssociationProps$Builder
                                                            CfnResolverQueryLoggingConfigProps$Builder
                                                            CfnResolverRule$Builder
                                                            CfnResolverRule$TargetAddressProperty$Builder
                                                            CfnResolverRuleAssociation$Builder
                                                            CfnResolverRuleAssociationProps$Builder
                                                            CfnResolverRuleProps$Builder]))


(defn build-cfn-firewall-domain-list-builder
  "The build-cfn-firewall-domain-list-builder function updates a CfnFirewallDomainList$Builder instance using the provided configuration.
  The function takes the CfnFirewallDomainList$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainFileUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-file-url` |
| `domains` | java.util.List | [[cdk.support/lookup-entry]] | `:domains` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFirewallDomainList$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-file-url)]
    (. builder domainFileUrl data))
  (when-let [data (lookup-entry config id :domains)]
    (. builder domains data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-firewall-domain-list-builder
  "Creates a  `CfnFirewallDomainList$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-firewall-domain-list-builder (CfnFirewallDomainList$Builder/create scope (name id)) id config))


(defn build-cfn-firewall-domain-list-props-builder
  "The build-cfn-firewall-domain-list-props-builder function updates a CfnFirewallDomainListProps$Builder instance using the provided configuration.
  The function takes the CfnFirewallDomainListProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainFileUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-file-url` |
| `domains` | java.util.List | [[cdk.support/lookup-entry]] | `:domains` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFirewallDomainListProps$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-file-url)]
    (. builder domainFileUrl data))
  (when-let [data (lookup-entry config id :domains)]
    (. builder domains data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-firewall-domain-list-props-builder
  "Creates a  `CfnFirewallDomainListProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-firewall-domain-list-props-builder (new CfnFirewallDomainListProps$Builder) id config))


(defn build-cfn-firewall-rule-group-association-builder
  "The build-cfn-firewall-rule-group-association-builder function updates a CfnFirewallRuleGroupAssociation$Builder instance using the provided configuration.
  The function takes the CfnFirewallRuleGroupAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallRuleGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-rule-group-id` |
| `mutationProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:mutation-protection` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnFirewallRuleGroupAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :firewall-rule-group-id)]
    (. builder firewallRuleGroupId data))
  (when-let [data (lookup-entry config id :mutation-protection)]
    (. builder mutationProtection data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-firewall-rule-group-association-builder
  "Creates a  `CfnFirewallRuleGroupAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-firewall-rule-group-association-builder (CfnFirewallRuleGroupAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-firewall-rule-group-association-props-builder
  "The build-cfn-firewall-rule-group-association-props-builder function updates a CfnFirewallRuleGroupAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnFirewallRuleGroupAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallRuleGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-rule-group-id` |
| `mutationProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:mutation-protection` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnFirewallRuleGroupAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :firewall-rule-group-id)]
    (. builder firewallRuleGroupId data))
  (when-let [data (lookup-entry config id :mutation-protection)]
    (. builder mutationProtection data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-firewall-rule-group-association-props-builder
  "Creates a  `CfnFirewallRuleGroupAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-firewall-rule-group-association-props-builder (new CfnFirewallRuleGroupAssociationProps$Builder) id config))


(defn build-cfn-firewall-rule-group-builder
  "The build-cfn-firewall-rule-group-builder function updates a CfnFirewallRuleGroup$Builder instance using the provided configuration.
  The function takes the CfnFirewallRuleGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:firewall-rules` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFirewallRuleGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :firewall-rules)]
    (. builder firewallRules data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-firewall-rule-group-builder
  "Creates a  `CfnFirewallRuleGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-firewall-rule-group-builder (CfnFirewallRuleGroup$Builder/create scope (name id)) id config))


(defn build-cfn-firewall-rule-group-firewall-rule-property-builder
  "The build-cfn-firewall-rule-group-firewall-rule-property-builder function updates a CfnFirewallRuleGroup$FirewallRuleProperty$Builder instance using the provided configuration.
  The function takes the CfnFirewallRuleGroup$FirewallRuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `blockOverrideDnsType` | java.lang.String | [[cdk.support/lookup-entry]] | `:block-override-dns-type` |
| `blockOverrideDomain` | java.lang.String | [[cdk.support/lookup-entry]] | `:block-override-domain` |
| `blockOverrideTtl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:block-override-ttl` |
| `blockResponse` | java.lang.String | [[cdk.support/lookup-entry]] | `:block-response` |
| `firewallDomainListId` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-domain-list-id` |
| `firewallDomainRedirectionAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-domain-redirection-action` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `qtype` | java.lang.String | [[cdk.support/lookup-entry]] | `:qtype` |
"
  [^CfnFirewallRuleGroup$FirewallRuleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :block-override-dns-type)]
    (. builder blockOverrideDnsType data))
  (when-let [data (lookup-entry config id :block-override-domain)]
    (. builder blockOverrideDomain data))
  (when-let [data (lookup-entry config id :block-override-ttl)]
    (. builder blockOverrideTtl data))
  (when-let [data (lookup-entry config id :block-response)]
    (. builder blockResponse data))
  (when-let [data (lookup-entry config id :firewall-domain-list-id)]
    (. builder firewallDomainListId data))
  (when-let [data (lookup-entry config id :firewall-domain-redirection-action)]
    (. builder firewallDomainRedirectionAction data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :qtype)]
    (. builder qtype data))
  (.build builder))


(defn cfn-firewall-rule-group-firewall-rule-property-builder
  "Creates a  `CfnFirewallRuleGroup$FirewallRuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-firewall-rule-group-firewall-rule-property-builder (new CfnFirewallRuleGroup$FirewallRuleProperty$Builder) id config))


(defn build-cfn-firewall-rule-group-props-builder
  "The build-cfn-firewall-rule-group-props-builder function updates a CfnFirewallRuleGroupProps$Builder instance using the provided configuration.
  The function takes the CfnFirewallRuleGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:firewall-rules` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFirewallRuleGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :firewall-rules)]
    (. builder firewallRules data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-firewall-rule-group-props-builder
  "Creates a  `CfnFirewallRuleGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-firewall-rule-group-props-builder (new CfnFirewallRuleGroupProps$Builder) id config))


(defn build-cfn-outpost-resolver-builder
  "The build-cfn-outpost-resolver-builder function updates a CfnOutpostResolver$Builder instance using the provided configuration.
  The function takes the CfnOutpostResolver$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |
| `preferredInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-instance-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnOutpostResolver$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :outpost-arn)]
    (. builder outpostArn data))
  (when-let [data (lookup-entry config id :preferred-instance-type)]
    (. builder preferredInstanceType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-outpost-resolver-builder
  "Creates a  `CfnOutpostResolver$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-outpost-resolver-builder (CfnOutpostResolver$Builder/create scope (name id)) id config))


(defn build-cfn-outpost-resolver-props-builder
  "The build-cfn-outpost-resolver-props-builder function updates a CfnOutpostResolverProps$Builder instance using the provided configuration.
  The function takes the CfnOutpostResolverProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |
| `preferredInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-instance-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnOutpostResolverProps$Builder builder id config]
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :outpost-arn)]
    (. builder outpostArn data))
  (when-let [data (lookup-entry config id :preferred-instance-type)]
    (. builder preferredInstanceType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-outpost-resolver-props-builder
  "Creates a  `CfnOutpostResolverProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-outpost-resolver-props-builder (new CfnOutpostResolverProps$Builder) id config))


(defn build-cfn-resolver-config-builder
  "The build-cfn-resolver-config-builder function updates a CfnResolverConfig$Builder instance using the provided configuration.
  The function takes the CfnResolverConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autodefinedReverseFlag` | java.lang.String | [[cdk.support/lookup-entry]] | `:autodefined-reverse-flag` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
"
  [^CfnResolverConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :autodefined-reverse-flag)]
    (. builder autodefinedReverseFlag data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (.build builder))


(defn cfn-resolver-config-builder
  "Creates a  `CfnResolverConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resolver-config-builder (CfnResolverConfig$Builder/create scope (name id)) id config))


(defn build-cfn-resolver-config-props-builder
  "The build-cfn-resolver-config-props-builder function updates a CfnResolverConfigProps$Builder instance using the provided configuration.
  The function takes the CfnResolverConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autodefinedReverseFlag` | java.lang.String | [[cdk.support/lookup-entry]] | `:autodefined-reverse-flag` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
"
  [^CfnResolverConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :autodefined-reverse-flag)]
    (. builder autodefinedReverseFlag data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (.build builder))


(defn cfn-resolver-config-props-builder
  "Creates a  `CfnResolverConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resolver-config-props-builder (new CfnResolverConfigProps$Builder) id config))


(defn build-cfn-resolver-dnssec-config-builder
  "The build-cfn-resolver-dnssec-config-builder function updates a CfnResolverDNSSECConfig$Builder instance using the provided configuration.
  The function takes the CfnResolverDNSSECConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
"
  [^CfnResolverDNSSECConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (.build builder))


(defn cfn-resolver-dnssec-config-builder
  "Creates a  `CfnResolverDNSSECConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resolver-dnssec-config-builder (CfnResolverDNSSECConfig$Builder/create scope (name id)) id config))


(defn build-cfn-resolver-dnssec-config-props-builder
  "The build-cfn-resolver-dnssec-config-props-builder function updates a CfnResolverDNSSECConfigProps$Builder instance using the provided configuration.
  The function takes the CfnResolverDNSSECConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
"
  [^CfnResolverDNSSECConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (.build builder))


(defn cfn-resolver-dnssec-config-props-builder
  "Creates a  `CfnResolverDNSSECConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resolver-dnssec-config-props-builder (new CfnResolverDNSSECConfigProps$Builder) id config))


(defn build-cfn-resolver-endpoint-builder
  "The build-cfn-resolver-endpoint-builder function updates a CfnResolverEndpoint$Builder instance using the provided configuration.
  The function takes the CfnResolverEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `direction` | java.lang.String | [[cdk.support/lookup-entry]] | `:direction` |
| `ipAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-addresses` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |
| `preferredInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-instance-type` |
| `protocols` | java.util.List | [[cdk.support/lookup-entry]] | `:protocols` |
| `resolverEndpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-endpoint-type` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResolverEndpoint$Builder builder id config]
  (when-let [data (lookup-entry config id :direction)]
    (. builder direction data))
  (when-let [data (lookup-entry config id :ip-addresses)]
    (. builder ipAddresses data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :outpost-arn)]
    (. builder outpostArn data))
  (when-let [data (lookup-entry config id :preferred-instance-type)]
    (. builder preferredInstanceType data))
  (when-let [data (lookup-entry config id :protocols)]
    (. builder protocols data))
  (when-let [data (lookup-entry config id :resolver-endpoint-type)]
    (. builder resolverEndpointType data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-resolver-endpoint-builder
  "Creates a  `CfnResolverEndpoint$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resolver-endpoint-builder (CfnResolverEndpoint$Builder/create scope (name id)) id config))


(defn build-cfn-resolver-endpoint-ip-address-request-property-builder
  "The build-cfn-resolver-endpoint-ip-address-request-property-builder function updates a CfnResolverEndpoint$IpAddressRequestProperty$Builder instance using the provided configuration.
  The function takes the CfnResolverEndpoint$IpAddressRequestProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `ipv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
"
  [^CfnResolverEndpoint$IpAddressRequestProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ip)]
    (. builder ip data))
  (when-let [data (lookup-entry config id :ipv6)]
    (. builder ipv6 data))
  (when-let [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (.build builder))


(defn cfn-resolver-endpoint-ip-address-request-property-builder
  "Creates a  `CfnResolverEndpoint$IpAddressRequestProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resolver-endpoint-ip-address-request-property-builder (new CfnResolverEndpoint$IpAddressRequestProperty$Builder) id config))


(defn build-cfn-resolver-endpoint-props-builder
  "The build-cfn-resolver-endpoint-props-builder function updates a CfnResolverEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnResolverEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `direction` | java.lang.String | [[cdk.support/lookup-entry]] | `:direction` |
| `ipAddresses` | java.util.List | [[cdk.support/lookup-entry]] | `:ip-addresses` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |
| `preferredInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-instance-type` |
| `protocols` | java.util.List | [[cdk.support/lookup-entry]] | `:protocols` |
| `resolverEndpointType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-endpoint-type` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResolverEndpointProps$Builder builder id config]
  (when-let [data (lookup-entry config id :direction)]
    (. builder direction data))
  (when-let [data (lookup-entry config id :ip-addresses)]
    (. builder ipAddresses data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :outpost-arn)]
    (. builder outpostArn data))
  (when-let [data (lookup-entry config id :preferred-instance-type)]
    (. builder preferredInstanceType data))
  (when-let [data (lookup-entry config id :protocols)]
    (. builder protocols data))
  (when-let [data (lookup-entry config id :resolver-endpoint-type)]
    (. builder resolverEndpointType data))
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-resolver-endpoint-props-builder
  "Creates a  `CfnResolverEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resolver-endpoint-props-builder (new CfnResolverEndpointProps$Builder) id config))


(defn build-cfn-resolver-query-logging-config-association-builder
  "The build-cfn-resolver-query-logging-config-association-builder function updates a CfnResolverQueryLoggingConfigAssociation$Builder instance using the provided configuration.
  The function takes the CfnResolverQueryLoggingConfigAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resolverQueryLogConfigId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-query-log-config-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
"
  [^CfnResolverQueryLoggingConfigAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :resolver-query-log-config-id)]
    (. builder resolverQueryLogConfigId data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (.build builder))


(defn cfn-resolver-query-logging-config-association-builder
  "Creates a  `CfnResolverQueryLoggingConfigAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resolver-query-logging-config-association-builder (CfnResolverQueryLoggingConfigAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-resolver-query-logging-config-association-props-builder
  "The build-cfn-resolver-query-logging-config-association-props-builder function updates a CfnResolverQueryLoggingConfigAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnResolverQueryLoggingConfigAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resolverQueryLogConfigId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-query-log-config-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |
"
  [^CfnResolverQueryLoggingConfigAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :resolver-query-log-config-id)]
    (. builder resolverQueryLogConfigId data))
  (when-let [data (lookup-entry config id :resource-id)]
    (. builder resourceId data))
  (.build builder))


(defn cfn-resolver-query-logging-config-association-props-builder
  "Creates a  `CfnResolverQueryLoggingConfigAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resolver-query-logging-config-association-props-builder (new CfnResolverQueryLoggingConfigAssociationProps$Builder) id config))


(defn build-cfn-resolver-query-logging-config-builder
  "The build-cfn-resolver-query-logging-config-builder function updates a CfnResolverQueryLoggingConfig$Builder instance using the provided configuration.
  The function takes the CfnResolverQueryLoggingConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnResolverQueryLoggingConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-resolver-query-logging-config-builder
  "Creates a  `CfnResolverQueryLoggingConfig$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resolver-query-logging-config-builder (CfnResolverQueryLoggingConfig$Builder/create scope (name id)) id config))


(defn build-cfn-resolver-query-logging-config-props-builder
  "The build-cfn-resolver-query-logging-config-props-builder function updates a CfnResolverQueryLoggingConfigProps$Builder instance using the provided configuration.
  The function takes the CfnResolverQueryLoggingConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnResolverQueryLoggingConfigProps$Builder builder id config]
  (when-let [data (lookup-entry config id :destination-arn)]
    (. builder destinationArn data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-resolver-query-logging-config-props-builder
  "Creates a  `CfnResolverQueryLoggingConfigProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resolver-query-logging-config-props-builder (new CfnResolverQueryLoggingConfigProps$Builder) id config))


(defn build-cfn-resolver-rule-association-builder
  "The build-cfn-resolver-rule-association-builder function updates a CfnResolverRuleAssociation$Builder instance using the provided configuration.
  The function takes the CfnResolverRuleAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resolverRuleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-rule-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnResolverRuleAssociation$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :resolver-rule-id)]
    (. builder resolverRuleId data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-resolver-rule-association-builder
  "Creates a  `CfnResolverRuleAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resolver-rule-association-builder (CfnResolverRuleAssociation$Builder/create scope (name id)) id config))


(defn build-cfn-resolver-rule-association-props-builder
  "The build-cfn-resolver-rule-association-props-builder function updates a CfnResolverRuleAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnResolverRuleAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resolverRuleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-rule-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnResolverRuleAssociationProps$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :resolver-rule-id)]
    (. builder resolverRuleId data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-resolver-rule-association-props-builder
  "Creates a  `CfnResolverRuleAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resolver-rule-association-props-builder (new CfnResolverRuleAssociationProps$Builder) id config))


(defn build-cfn-resolver-rule-builder
  "The build-cfn-resolver-rule-builder function updates a CfnResolverRule$Builder instance using the provided configuration.
  The function takes the CfnResolverRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resolverEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-endpoint-id` |
| `ruleType` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-ips` |
"
  [^CfnResolverRule$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :resolver-endpoint-id)]
    (. builder resolverEndpointId data))
  (when-let [data (lookup-entry config id :rule-type)]
    (. builder ruleType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-ips)]
    (. builder targetIps data))
  (.build builder))


(defn cfn-resolver-rule-builder
  "Creates a  `CfnResolverRule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resolver-rule-builder (CfnResolverRule$Builder/create scope (name id)) id config))


(defn build-cfn-resolver-rule-props-builder
  "The build-cfn-resolver-rule-props-builder function updates a CfnResolverRuleProps$Builder instance using the provided configuration.
  The function takes the CfnResolverRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resolverEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-endpoint-id` |
| `ruleType` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-ips` |
"
  [^CfnResolverRuleProps$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :resolver-endpoint-id)]
    (. builder resolverEndpointId data))
  (when-let [data (lookup-entry config id :rule-type)]
    (. builder ruleType data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-ips)]
    (. builder targetIps data))
  (.build builder))


(defn cfn-resolver-rule-props-builder
  "Creates a  `CfnResolverRuleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resolver-rule-props-builder (new CfnResolverRuleProps$Builder) id config))


(defn build-cfn-resolver-rule-target-address-property-builder
  "The build-cfn-resolver-rule-target-address-property-builder function updates a CfnResolverRule$TargetAddressProperty$Builder instance using the provided configuration.
  The function takes the CfnResolverRule$TargetAddressProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `ipv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
"
  [^CfnResolverRule$TargetAddressProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ip)]
    (. builder ip data))
  (when-let [data (lookup-entry config id :ipv6)]
    (. builder ipv6 data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn cfn-resolver-rule-target-address-property-builder
  "Creates a  `CfnResolverRule$TargetAddressProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resolver-rule-target-address-property-builder (new CfnResolverRule$TargetAddressProperty$Builder) id config))