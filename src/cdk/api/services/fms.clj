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


(defn build-cfn-notification-channel-builder
  "The build-cfn-notification-channel-builder function updates a CfnNotificationChannel$Builder instance using the provided configuration.
  The function takes the CfnNotificationChannel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snsRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-role-name` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
"
  [^CfnNotificationChannel$Builder builder id config]
  (when-some [data (lookup-entry config id :sns-role-name)]
    (. builder snsRoleName data))
  (when-some [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (.build builder))


(defn cfn-notification-channel-builder
  "Creates a  `CfnNotificationChannel$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-notification-channel-builder (CfnNotificationChannel$Builder/create scope (name id)) id config))


(defn build-cfn-notification-channel-props-builder
  "The build-cfn-notification-channel-props-builder function updates a CfnNotificationChannelProps$Builder instance using the provided configuration.
  The function takes the CfnNotificationChannelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `snsRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-role-name` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
"
  [^CfnNotificationChannelProps$Builder builder id config]
  (when-some [data (lookup-entry config id :sns-role-name)]
    (. builder snsRoleName data))
  (when-some [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (.build builder))


(defn cfn-notification-channel-props-builder
  "Creates a  `CfnNotificationChannelProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-notification-channel-props-builder (new CfnNotificationChannelProps$Builder) id config))


(defn build-cfn-policy-builder
  "The build-cfn-policy-builder function updates a CfnPolicy$Builder instance using the provided configuration.
  The function takes the CfnPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-all-policy-resources)]
    (. builder deleteAllPolicyResources data))
  (when-some [data (lookup-entry config id :exclude-map)]
    (. builder excludeMap data))
  (when-some [data (lookup-entry config id :exclude-resource-tags)]
    (. builder excludeResourceTags data))
  (when-some [data (lookup-entry config id :include-map)]
    (. builder includeMap data))
  (when-some [data (lookup-entry config id :policy-description)]
    (. builder policyDescription data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :remediation-enabled)]
    (. builder remediationEnabled data))
  (when-some [data (lookup-entry config id :resource-set-ids)]
    (. builder resourceSetIds data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :resource-type-list)]
    (. builder resourceTypeList data))
  (when-some [data (lookup-entry config id :resources-clean-up)]
    (. builder resourcesCleanUp data))
  (when-some [data (lookup-entry config id :security-service-policy-data)]
    (. builder securityServicePolicyData data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-policy-builder
  "Creates a  `CfnPolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-policy-builder (CfnPolicy$Builder/create scope (name id)) id config))


(defn build-cfn-policy-ie-map-property-builder
  "The build-cfn-policy-ie-map-property-builder function updates a CfnPolicy$IEMapProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicy$IEMapProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `account` | java.util.List | [[cdk.support/lookup-entry]] | `:account` |
| `orgunit` | java.util.List | [[cdk.support/lookup-entry]] | `:orgunit` |
"
  [^CfnPolicy$IEMapProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :account)]
    (. builder account data))
  (when-some [data (lookup-entry config id :orgunit)]
    (. builder orgunit data))
  (.build builder))


(defn cfn-policy-ie-map-property-builder
  "Creates a  `CfnPolicy$IEMapProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-policy-ie-map-property-builder (new CfnPolicy$IEMapProperty$Builder) id config))


(defn build-cfn-policy-network-firewall-policy-property-builder
  "The build-cfn-policy-network-firewall-policy-property-builder function updates a CfnPolicy$NetworkFirewallPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicy$NetworkFirewallPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallDeploymentModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-deployment-model` |
"
  [^CfnPolicy$NetworkFirewallPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :firewall-deployment-model)]
    (. builder firewallDeploymentModel data))
  (.build builder))


(defn cfn-policy-network-firewall-policy-property-builder
  "Creates a  `CfnPolicy$NetworkFirewallPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-policy-network-firewall-policy-property-builder (new CfnPolicy$NetworkFirewallPolicyProperty$Builder) id config))


(defn build-cfn-policy-policy-option-property-builder
  "The build-cfn-policy-policy-option-property-builder function updates a CfnPolicy$PolicyOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicy$PolicyOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `networkFirewallPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:network-firewall-policy` |
| `thirdPartyFirewallPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:third-party-firewall-policy` |
"
  [^CfnPolicy$PolicyOptionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :network-firewall-policy)]
    (. builder networkFirewallPolicy data))
  (when-some [data (lookup-entry config id :third-party-firewall-policy)]
    (. builder thirdPartyFirewallPolicy data))
  (.build builder))


(defn cfn-policy-policy-option-property-builder
  "Creates a  `CfnPolicy$PolicyOptionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-policy-policy-option-property-builder (new CfnPolicy$PolicyOptionProperty$Builder) id config))


(defn build-cfn-policy-policy-tag-property-builder
  "The build-cfn-policy-policy-tag-property-builder function updates a CfnPolicy$PolicyTagProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicy$PolicyTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnPolicy$PolicyTagProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-policy-policy-tag-property-builder
  "Creates a  `CfnPolicy$PolicyTagProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-policy-policy-tag-property-builder (new CfnPolicy$PolicyTagProperty$Builder) id config))


(defn build-cfn-policy-props-builder
  "The build-cfn-policy-props-builder function updates a CfnPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-all-policy-resources)]
    (. builder deleteAllPolicyResources data))
  (when-some [data (lookup-entry config id :exclude-map)]
    (. builder excludeMap data))
  (when-some [data (lookup-entry config id :exclude-resource-tags)]
    (. builder excludeResourceTags data))
  (when-some [data (lookup-entry config id :include-map)]
    (. builder includeMap data))
  (when-some [data (lookup-entry config id :policy-description)]
    (. builder policyDescription data))
  (when-some [data (lookup-entry config id :policy-name)]
    (. builder policyName data))
  (when-some [data (lookup-entry config id :remediation-enabled)]
    (. builder remediationEnabled data))
  (when-some [data (lookup-entry config id :resource-set-ids)]
    (. builder resourceSetIds data))
  (when-some [data (lookup-entry config id :resource-tags)]
    (. builder resourceTags data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :resource-type-list)]
    (. builder resourceTypeList data))
  (when-some [data (lookup-entry config id :resources-clean-up)]
    (. builder resourcesCleanUp data))
  (when-some [data (lookup-entry config id :security-service-policy-data)]
    (. builder securityServicePolicyData data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-policy-props-builder
  "Creates a  `CfnPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-policy-props-builder (new CfnPolicyProps$Builder) id config))


(defn build-cfn-policy-resource-tag-property-builder
  "The build-cfn-policy-resource-tag-property-builder function updates a CfnPolicy$ResourceTagProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicy$ResourceTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnPolicy$ResourceTagProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-policy-resource-tag-property-builder
  "Creates a  `CfnPolicy$ResourceTagProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-policy-resource-tag-property-builder (new CfnPolicy$ResourceTagProperty$Builder) id config))


(defn build-cfn-policy-security-service-policy-data-property-builder
  "The build-cfn-policy-security-service-policy-data-property-builder function updates a CfnPolicy$SecurityServicePolicyDataProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicy$SecurityServicePolicyDataProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `managedServiceData` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-service-data` |
| `policyOption` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:policy-option` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnPolicy$SecurityServicePolicyDataProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :managed-service-data)]
    (. builder managedServiceData data))
  (when-some [data (lookup-entry config id :policy-option)]
    (. builder policyOption data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-policy-security-service-policy-data-property-builder
  "Creates a  `CfnPolicy$SecurityServicePolicyDataProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-policy-security-service-policy-data-property-builder (new CfnPolicy$SecurityServicePolicyDataProperty$Builder) id config))


(defn build-cfn-policy-third-party-firewall-policy-property-builder
  "The build-cfn-policy-third-party-firewall-policy-property-builder function updates a CfnPolicy$ThirdPartyFirewallPolicyProperty$Builder instance using the provided configuration.
  The function takes the CfnPolicy$ThirdPartyFirewallPolicyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `firewallDeploymentModel` | java.lang.String | [[cdk.support/lookup-entry]] | `:firewall-deployment-model` |
"
  [^CfnPolicy$ThirdPartyFirewallPolicyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :firewall-deployment-model)]
    (. builder firewallDeploymentModel data))
  (.build builder))


(defn cfn-policy-third-party-firewall-policy-property-builder
  "Creates a  `CfnPolicy$ThirdPartyFirewallPolicyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-policy-third-party-firewall-policy-property-builder (new CfnPolicy$ThirdPartyFirewallPolicyProperty$Builder) id config))


(defn build-cfn-resource-set-builder
  "The build-cfn-resource-set-builder function updates a CfnResourceSet$Builder instance using the provided configuration.
  The function takes the CfnResourceSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceTypeList` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-type-list` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResourceSet$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource-type-list)]
    (. builder resourceTypeList data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-resource-set-builder
  "Creates a  `CfnResourceSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-resource-set-builder (CfnResourceSet$Builder/create scope (name id)) id config))


(defn build-cfn-resource-set-props-builder
  "The build-cfn-resource-set-props-builder function updates a CfnResourceSetProps$Builder instance using the provided configuration.
  The function takes the CfnResourceSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `resourceTypeList` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-type-list` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnResourceSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :resource-type-list)]
    (. builder resourceTypeList data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-resource-set-props-builder
  "Creates a  `CfnResourceSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-resource-set-props-builder (new CfnResourceSetProps$Builder) id config))