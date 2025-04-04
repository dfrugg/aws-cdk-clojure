(ns cdk.api.services.opensearchserverless
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.opensearchserverless package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.opensearchserverless CfnAccessPolicy$Builder
                                                                 CfnAccessPolicyProps$Builder
                                                                 CfnCollection$Builder
                                                                 CfnCollectionProps$Builder
                                                                 CfnLifecyclePolicy$Builder
                                                                 CfnLifecyclePolicyProps$Builder
                                                                 CfnSecurityConfig$Builder
                                                                 CfnSecurityConfig$SamlConfigOptionsProperty$Builder
                                                                 CfnSecurityConfigProps$Builder
                                                                 CfnSecurityPolicy$Builder
                                                                 CfnSecurityPolicyProps$Builder
                                                                 CfnVpcEndpoint$Builder
                                                                 CfnVpcEndpointProps$Builder]))


(defn cfn-access-policy-builder>
  "The cfn-access-policy-builder> function updates a CfnAccessPolicy$Builder instance using the provided configuration.
  The function takes the CfnAccessPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAccessPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-access-policy-builder
  "Creates a  `CfnAccessPolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-access-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-access-policy-builder> (CfnAccessPolicy$Builder/create scope (name id)) id config))


(defn cfn-access-policy-props-builder>
  "The cfn-access-policy-props-builder> function updates a CfnAccessPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnAccessPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAccessPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-access-policy-props-builder
  "Creates a  `CfnAccessPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-policy-props-builder> (new CfnAccessPolicyProps$Builder) id config))


(defn cfn-collection-builder>
  "The cfn-collection-builder> function updates a CfnCollection$Builder instance using the provided configuration.
  The function takes the CfnCollection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `standbyReplicas` | java.lang.String | [[cdk.support/lookup-entry]] | `:standby-replicas` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCollection$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :standby-replicas)]
    (. builder standbyReplicas data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-collection-builder
  "Creates a  `CfnCollection$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-collection-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-collection-builder> (CfnCollection$Builder/create scope (name id)) id config))


(defn cfn-collection-props-builder>
  "The cfn-collection-props-builder> function updates a CfnCollectionProps$Builder instance using the provided configuration.
  The function takes the CfnCollectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `standbyReplicas` | java.lang.String | [[cdk.support/lookup-entry]] | `:standby-replicas` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnCollectionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :standby-replicas)]
    (. builder standbyReplicas data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-collection-props-builder
  "Creates a  `CfnCollectionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-collection-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-collection-props-builder> (new CfnCollectionProps$Builder) id config))


(defn cfn-lifecycle-policy-builder>
  "The cfn-lifecycle-policy-builder> function updates a CfnLifecyclePolicy$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnLifecyclePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-lifecycle-policy-builder
  "Creates a  `CfnLifecyclePolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-lifecycle-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-lifecycle-policy-builder> (CfnLifecyclePolicy$Builder/create scope (name id)) id config))


(defn cfn-lifecycle-policy-props-builder>
  "The cfn-lifecycle-policy-props-builder> function updates a CfnLifecyclePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnLifecyclePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnLifecyclePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-lifecycle-policy-props-builder
  "Creates a  `CfnLifecyclePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-lifecycle-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-lifecycle-policy-props-builder> (new CfnLifecyclePolicyProps$Builder) id config))


(defn cfn-security-config-builder>
  "The cfn-security-config-builder> function updates a CfnSecurityConfig$Builder instance using the provided configuration.
  The function takes the CfnSecurityConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `samlOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:saml-options` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSecurityConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :saml-options)]
    (. builder samlOptions data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-security-config-builder
  "Creates a  `CfnSecurityConfig$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-security-config-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-security-config-builder> (CfnSecurityConfig$Builder/create scope (name id)) id config))


(defn cfn-security-config-props-builder>
  "The cfn-security-config-props-builder> function updates a CfnSecurityConfigProps$Builder instance using the provided configuration.
  The function takes the CfnSecurityConfigProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `samlOptions` | software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig$SamlConfigOptionsProperty | [[cdk.support/lookup-entry]] | `:saml-options` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSecurityConfigProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :saml-options)]
    (. builder samlOptions data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-security-config-props-builder
  "Creates a  `CfnSecurityConfigProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-security-config-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-security-config-props-builder> (new CfnSecurityConfigProps$Builder) id config))


(defn cfn-security-config-saml-config-options-property-builder>
  "The cfn-security-config-saml-config-options-property-builder> function updates a CfnSecurityConfig$SamlConfigOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnSecurityConfig$SamlConfigOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-attribute` |
| `metadata` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata` |
| `sessionTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session-timeout` |
| `userAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-attribute` |
"
  [^CfnSecurityConfig$SamlConfigOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :group-attribute)]
    (. builder groupAttribute data))
  (when-some [data (lookup-entry config id :metadata)]
    (. builder metadata data))
  (when-some [data (lookup-entry config id :session-timeout)]
    (. builder sessionTimeout data))
  (when-some [data (lookup-entry config id :user-attribute)]
    (. builder userAttribute data))
  (.build builder))


(defn cfn-security-config-saml-config-options-property-builder
  "Creates a  `CfnSecurityConfig$SamlConfigOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-security-config-saml-config-options-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-security-config-saml-config-options-property-builder> (new CfnSecurityConfig$SamlConfigOptionsProperty$Builder) id config))


(defn cfn-security-policy-builder>
  "The cfn-security-policy-builder> function updates a CfnSecurityPolicy$Builder instance using the provided configuration.
  The function takes the CfnSecurityPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSecurityPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-security-policy-builder
  "Creates a  `CfnSecurityPolicy$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-security-policy-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-security-policy-builder> (CfnSecurityPolicy$Builder/create scope (name id)) id config))


(defn cfn-security-policy-props-builder>
  "The cfn-security-policy-props-builder> function updates a CfnSecurityPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnSecurityPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policy` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnSecurityPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-security-policy-props-builder
  "Creates a  `CfnSecurityPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-security-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-security-policy-props-builder> (new CfnSecurityPolicyProps$Builder) id config))


(defn cfn-vpc-endpoint-builder>
  "The cfn-vpc-endpoint-builder> function updates a CfnVpcEndpoint$Builder instance using the provided configuration.
  The function takes the CfnVpcEndpoint$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnVpcEndpoint$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-vpc-endpoint-builder
  "Creates a  `CfnVpcEndpoint$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-vpc-endpoint-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-vpc-endpoint-builder> (CfnVpcEndpoint$Builder/create scope (name id)) id config))


(defn cfn-vpc-endpoint-props-builder>
  "The cfn-vpc-endpoint-props-builder> function updates a CfnVpcEndpointProps$Builder instance using the provided configuration.
  The function takes the CfnVpcEndpointProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^CfnVpcEndpointProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-some [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (when-some [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn cfn-vpc-endpoint-props-builder
  "Creates a  `CfnVpcEndpointProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-vpc-endpoint-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-vpc-endpoint-props-builder> (new CfnVpcEndpointProps$Builder) id config))