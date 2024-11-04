(ns cdk.api.services.fms
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.fms package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.fms CfnNotificationChannel$Builder
                                                CfnNotificationChannelProps$Builder
                                                CfnPolicy$Builder
                                                CfnPolicy$IEMapProperty$Builder
                                                CfnPolicy$NetworkFirewallPolicyProperty$Builder
                                                CfnPolicy$PolicyOptionProperty$Builder
                                                CfnPolicy$PolicyTagProperty$Builder
                                                CfnPolicy$ResourceTagProperty$Builder
                                                CfnPolicy$SecurityServicePolicyDataProperty$Builder
                                                CfnPolicy$ThirdPartyFirewallPolicyProperty$Builder
                                                CfnPolicyProps$Builder
                                                CfnResourceSet$Builder
                                                CfnResourceSetProps$Builder]))


(defn cfn-notification-channel-builder
  "The cfn-notification-channel-builder function buildes out new instances of 
CfnNotificationChannel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snsRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-role-name` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |"
  [stack id config]
  (let [builder (CfnNotificationChannel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :sns-role-name)]
      (. builder snsRoleName data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (.build builder)))


(defn cfn-notification-channel-props-builder
  "The cfn-notification-channel-props-builder function buildes out new instances of 
CfnNotificationChannelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snsRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-role-name` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |"
  [stack id config]
  (let [builder (CfnNotificationChannelProps$Builder.)]
    (when-let [data (lookup-entry config id :sns-role-name)]
      (. builder snsRoleName data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (.build builder)))


(defn cfn-policy-builder
  "The cfn-policy-builder function buildes out new instances of 
CfnPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteAllPolicyResources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-all-policy-resources` |
| `excludeMap` | software.amazon.awscdk.services.fms.CfnPolicy$IEMapProperty | [[cdk.support/lookup-entry]] | `:exclude-map` |
| `excludeResourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-resource-tags` |
| `includeMap` | software.amazon.awscdk.services.fms.CfnPolicy$IEMapProperty | [[cdk.support/lookup-entry]] | `:include-map` |
| `policyDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-description` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `remediationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remediation-enabled` |
| `resourceSetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-set-ids` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `resourceTypeList` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-type-list` |
| `resourcesCleanUp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:resources-clean-up` |
| `securityServicePolicyData` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:security-service-policy-data` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :delete-all-policy-resources)]
      (. builder deleteAllPolicyResources data))
    (when-let [data (lookup-entry config id :exclude-map)]
      (. builder excludeMap data))
    (when-let [data (lookup-entry config id :exclude-resource-tags)]
      (. builder excludeResourceTags data))
    (when-let [data (lookup-entry config id :include-map)]
      (. builder includeMap data))
    (when-let [data (lookup-entry config id :policy-description)]
      (. builder policyDescription data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :remediation-enabled)]
      (. builder remediationEnabled data))
    (when-let [data (lookup-entry config id :resource-set-ids)]
      (. builder resourceSetIds data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :resource-type-list)]
      (. builder resourceTypeList data))
    (when-let [data (lookup-entry config id :resources-clean-up)]
      (. builder resourcesCleanUp data))
    (when-let [data (lookup-entry config id :security-service-policy-data)]
      (. builder securityServicePolicyData data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-policy-ie-map-property-builder
  "The cfn-policy-ie-map-property-builder function buildes out new instances of 
CfnPolicy$IEMapProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.util.List | [[cdk.support/lookup-entry]] | `:account` |
| `orgunit` | java.util.List | [[cdk.support/lookup-entry]] | `:orgunit` |"
  [stack id config]
  (let [builder (CfnPolicy$IEMapProperty$Builder.)]
    (when-let [data (lookup-entry config id :account)]
      (. builder account data))
    (when-let [data (lookup-entry config id :orgunit)]
      (. builder orgunit data))
    (.build builder)))


(defn cfn-policy-network-firewall-policy-property-builder
  "The cfn-policy-network-firewall-policy-property-builder function buildes out new instances of 
CfnPolicy$NetworkFirewallPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallDeploymentModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-deployment-model` |"
  [stack id config]
  (let [builder (CfnPolicy$NetworkFirewallPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :firewall-deployment-model)]
      (. builder firewallDeploymentModel data))
    (.build builder)))


(defn cfn-policy-policy-option-property-builder
  "The cfn-policy-policy-option-property-builder function buildes out new instances of 
CfnPolicy$PolicyOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkFirewallPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-firewall-policy` |
| `thirdPartyFirewallPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:third-party-firewall-policy` |"
  [stack id config]
  (let [builder (CfnPolicy$PolicyOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :network-firewall-policy)]
      (. builder networkFirewallPolicy data))
    (when-let [data (lookup-entry config id :third-party-firewall-policy)]
      (. builder thirdPartyFirewallPolicy data))
    (.build builder)))


(defn cfn-policy-policy-tag-property-builder
  "The cfn-policy-policy-tag-property-builder function buildes out new instances of 
CfnPolicy$PolicyTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnPolicy$PolicyTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-policy-props-builder
  "The cfn-policy-props-builder function buildes out new instances of 
CfnPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteAllPolicyResources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:delete-all-policy-resources` |
| `excludeMap` | software.amazon.awscdk.services.fms.CfnPolicy$IEMapProperty | [[cdk.support/lookup-entry]] | `:exclude-map` |
| `excludeResourceTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclude-resource-tags` |
| `includeMap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:include-map` |
| `policyDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-description` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `remediationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:remediation-enabled` |
| `resourceSetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-set-ids` |
| `resourceTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:resource-tags` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `resourceTypeList` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-type-list` |
| `resourcesCleanUp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:resources-clean-up` |
| `securityServicePolicyData` | software.amazon.awscdk.services.fms.CfnPolicy$SecurityServicePolicyDataProperty | [[cdk.support/lookup-entry]] | `:security-service-policy-data` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :delete-all-policy-resources)]
      (. builder deleteAllPolicyResources data))
    (when-let [data (lookup-entry config id :exclude-map)]
      (. builder excludeMap data))
    (when-let [data (lookup-entry config id :exclude-resource-tags)]
      (. builder excludeResourceTags data))
    (when-let [data (lookup-entry config id :include-map)]
      (. builder includeMap data))
    (when-let [data (lookup-entry config id :policy-description)]
      (. builder policyDescription data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :remediation-enabled)]
      (. builder remediationEnabled data))
    (when-let [data (lookup-entry config id :resource-set-ids)]
      (. builder resourceSetIds data))
    (when-let [data (lookup-entry config id :resource-tags)]
      (. builder resourceTags data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (when-let [data (lookup-entry config id :resource-type-list)]
      (. builder resourceTypeList data))
    (when-let [data (lookup-entry config id :resources-clean-up)]
      (. builder resourcesCleanUp data))
    (when-let [data (lookup-entry config id :security-service-policy-data)]
      (. builder securityServicePolicyData data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-policy-resource-tag-property-builder
  "The cfn-policy-resource-tag-property-builder function buildes out new instances of 
CfnPolicy$ResourceTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnPolicy$ResourceTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-policy-security-service-policy-data-property-builder
  "The cfn-policy-security-service-policy-data-property-builder function buildes out new instances of 
CfnPolicy$SecurityServicePolicyDataProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `managedServiceData` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-service-data` |
| `policyOption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy-option` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnPolicy$SecurityServicePolicyDataProperty$Builder.)]
    (when-let [data (lookup-entry config id :managed-service-data)]
      (. builder managedServiceData data))
    (when-let [data (lookup-entry config id :policy-option)]
      (. builder policyOption data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-policy-third-party-firewall-policy-property-builder
  "The cfn-policy-third-party-firewall-policy-property-builder function buildes out new instances of 
CfnPolicy$ThirdPartyFirewallPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallDeploymentModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-deployment-model` |"
  [stack id config]
  (let [builder (CfnPolicy$ThirdPartyFirewallPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :firewall-deployment-model)]
      (. builder firewallDeploymentModel data))
    (.build builder)))


(defn cfn-resource-set-builder
  "The cfn-resource-set-builder function buildes out new instances of 
CfnResourceSet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceTypeList` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-type-list` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResourceSet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-type-list)]
      (. builder resourceTypeList data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-resource-set-props-builder
  "The cfn-resource-set-props-builder function buildes out new instances of 
CfnResourceSetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceTypeList` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-type-list` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnResourceSetProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :resource-type-list)]
      (. builder resourceTypeList data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))