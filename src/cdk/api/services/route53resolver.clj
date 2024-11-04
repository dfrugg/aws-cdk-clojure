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


(defn cfn-firewall-domain-list-builder
  "The cfn-firewall-domain-list-builder function buildes out new instances of 
CfnFirewallDomainList$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainFileUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-file-url` |
| `domains` | java.util.List | [[cdk.support/lookup-entry]] | `:domains` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFirewallDomainList$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain-file-url)]
      (. builder domainFileUrl data))
    (when-let [data (lookup-entry config id :domains)]
      (. builder domains data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-firewall-domain-list-props-builder
  "The cfn-firewall-domain-list-props-builder function buildes out new instances of 
CfnFirewallDomainListProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainFileUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-file-url` |
| `domains` | java.util.List | [[cdk.support/lookup-entry]] | `:domains` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFirewallDomainListProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-file-url)]
      (. builder domainFileUrl data))
    (when-let [data (lookup-entry config id :domains)]
      (. builder domains data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-firewall-rule-group-association-builder
  "The cfn-firewall-rule-group-association-builder function buildes out new instances of 
CfnFirewallRuleGroupAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallRuleGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-rule-group-id` |
| `mutationProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:mutation-protection` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnFirewallRuleGroupAssociation$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-firewall-rule-group-association-props-builder
  "The cfn-firewall-rule-group-association-props-builder function buildes out new instances of 
CfnFirewallRuleGroupAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallRuleGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-rule-group-id` |
| `mutationProtection` | java.lang.String | [[cdk.support/lookup-entry]] | `:mutation-protection` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnFirewallRuleGroupAssociationProps$Builder.)]
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
    (.build builder)))


(defn cfn-firewall-rule-group-builder
  "The cfn-firewall-rule-group-builder function buildes out new instances of 
CfnFirewallRuleGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:firewall-rules` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFirewallRuleGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :firewall-rules)]
      (. builder firewallRules data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-firewall-rule-group-firewall-rule-property-builder
  "The cfn-firewall-rule-group-firewall-rule-property-builder function buildes out new instances of 
CfnFirewallRuleGroup$FirewallRuleProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `qtype` | java.lang.String | [[cdk.support/lookup-entry]] | `:qtype` |"
  [stack id config]
  (let [builder (CfnFirewallRuleGroup$FirewallRuleProperty$Builder.)]
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
    (.build builder)))


(defn cfn-firewall-rule-group-props-builder
  "The cfn-firewall-rule-group-props-builder function buildes out new instances of 
CfnFirewallRuleGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:firewall-rules` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFirewallRuleGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :firewall-rules)]
      (. builder firewallRules data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-outpost-resolver-builder
  "The cfn-outpost-resolver-builder function buildes out new instances of 
CfnOutpostResolver$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |
| `preferredInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-instance-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnOutpostResolver$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-outpost-resolver-props-builder
  "The cfn-outpost-resolver-props-builder function buildes out new instances of 
CfnOutpostResolverProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outpostArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:outpost-arn` |
| `preferredInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:preferred-instance-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnOutpostResolverProps$Builder.)]
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
    (.build builder)))


(defn cfn-resolver-config-builder
  "The cfn-resolver-config-builder function buildes out new instances of 
CfnResolverConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autodefinedReverseFlag` | java.lang.String | [[cdk.support/lookup-entry]] | `:autodefined-reverse-flag` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |"
  [stack id config]
  (let [builder (CfnResolverConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :autodefined-reverse-flag)]
      (. builder autodefinedReverseFlag data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (.build builder)))


(defn cfn-resolver-config-props-builder
  "The cfn-resolver-config-props-builder function buildes out new instances of 
CfnResolverConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autodefinedReverseFlag` | java.lang.String | [[cdk.support/lookup-entry]] | `:autodefined-reverse-flag` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |"
  [stack id config]
  (let [builder (CfnResolverConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :autodefined-reverse-flag)]
      (. builder autodefinedReverseFlag data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (.build builder)))


(defn cfn-resolver-dnssec-config-builder
  "The cfn-resolver-dnssec-config-builder function buildes out new instances of 
CfnResolverDNSSECConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |"
  [stack id config]
  (let [builder (CfnResolverDNSSECConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (.build builder)))


(defn cfn-resolver-dnssec-config-props-builder
  "The cfn-resolver-dnssec-config-props-builder function buildes out new instances of 
CfnResolverDNSSECConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |"
  [stack id config]
  (let [builder (CfnResolverDNSSECConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (.build builder)))


(defn cfn-resolver-endpoint-builder
  "The cfn-resolver-endpoint-builder function buildes out new instances of 
CfnResolverEndpoint$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResolverEndpoint$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-resolver-endpoint-ip-address-request-property-builder
  "The cfn-resolver-endpoint-ip-address-request-property-builder function buildes out new instances of 
CfnResolverEndpoint$IpAddressRequestProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `ipv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |"
  [stack id config]
  (let [builder (CfnResolverEndpoint$IpAddressRequestProperty$Builder.)]
    (when-let [data (lookup-entry config id :ip)]
      (. builder ip data))
    (when-let [data (lookup-entry config id :ipv6)]
      (. builder ipv6 data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (.build builder)))


(defn cfn-resolver-endpoint-props-builder
  "The cfn-resolver-endpoint-props-builder function buildes out new instances of 
CfnResolverEndpointProps$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResolverEndpointProps$Builder.)]
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
    (.build builder)))


(defn cfn-resolver-query-logging-config-association-builder
  "The cfn-resolver-query-logging-config-association-builder function buildes out new instances of 
CfnResolverQueryLoggingConfigAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resolverQueryLogConfigId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-query-log-config-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |"
  [stack id config]
  (let [builder (CfnResolverQueryLoggingConfigAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :resolver-query-log-config-id)]
      (. builder resolverQueryLogConfigId data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (.build builder)))


(defn cfn-resolver-query-logging-config-association-props-builder
  "The cfn-resolver-query-logging-config-association-props-builder function buildes out new instances of 
CfnResolverQueryLoggingConfigAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `resolverQueryLogConfigId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-query-log-config-id` |
| `resourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-id` |"
  [stack id config]
  (let [builder (CfnResolverQueryLoggingConfigAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :resolver-query-log-config-id)]
      (. builder resolverQueryLogConfigId data))
    (when-let [data (lookup-entry config id :resource-id)]
      (. builder resourceId data))
    (.build builder)))


(defn cfn-resolver-query-logging-config-builder
  "The cfn-resolver-query-logging-config-builder function buildes out new instances of 
CfnResolverQueryLoggingConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnResolverQueryLoggingConfig$Builder/create stack id)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-resolver-query-logging-config-props-builder
  "The cfn-resolver-query-logging-config-props-builder function buildes out new instances of 
CfnResolverQueryLoggingConfigProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnResolverQueryLoggingConfigProps$Builder.)]
    (when-let [data (lookup-entry config id :destination-arn)]
      (. builder destinationArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-resolver-rule-association-builder
  "The cfn-resolver-rule-association-builder function buildes out new instances of 
CfnResolverRuleAssociation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resolverRuleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-rule-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnResolverRuleAssociation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resolver-rule-id)]
      (. builder resolverRuleId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-resolver-rule-association-props-builder
  "The cfn-resolver-rule-association-props-builder function buildes out new instances of 
CfnResolverRuleAssociationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resolverRuleId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-rule-id` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (CfnResolverRuleAssociationProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resolver-rule-id)]
      (. builder resolverRuleId data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn cfn-resolver-rule-builder
  "The cfn-resolver-rule-builder function buildes out new instances of 
CfnResolverRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resolverEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-endpoint-id` |
| `ruleType` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-ips` |"
  [stack id config]
  (let [builder (CfnResolverRule$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-resolver-rule-props-builder
  "The cfn-resolver-rule-props-builder function buildes out new instances of 
CfnResolverRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resolverEndpointId` | java.lang.String | [[cdk.support/lookup-entry]] | `:resolver-endpoint-id` |
| `ruleType` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target-ips` |"
  [stack id config]
  (let [builder (CfnResolverRuleProps$Builder.)]
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
    (.build builder)))


(defn cfn-resolver-rule-target-address-property-builder
  "The cfn-resolver-rule-target-address-property-builder function buildes out new instances of 
CfnResolverRule$TargetAddressProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ip` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip` |
| `ipv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6` |
| `port` | java.lang.String | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |"
  [stack id config]
  (let [builder (CfnResolverRule$TargetAddressProperty$Builder.)]
    (when-let [data (lookup-entry config id :ip)]
      (. builder ip data))
    (when-let [data (lookup-entry config id :ipv6)]
      (. builder ipv6 data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (.build builder)))