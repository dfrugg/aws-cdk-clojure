(ns cdk.api.services.iotsitewise
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iotsitewise package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iotsitewise CfnAccessPolicy$AccessPolicyIdentityProperty$Builder
                                                        CfnAccessPolicy$AccessPolicyResourceProperty$Builder
                                                        CfnAccessPolicy$Builder
                                                        CfnAccessPolicy$IamRoleProperty$Builder
                                                        CfnAccessPolicy$IamUserProperty$Builder
                                                        CfnAccessPolicy$PortalProperty$Builder
                                                        CfnAccessPolicy$ProjectProperty$Builder
                                                        CfnAccessPolicy$UserProperty$Builder
                                                        CfnAccessPolicyProps$Builder
                                                        CfnAsset$AssetHierarchyProperty$Builder
                                                        CfnAsset$AssetPropertyProperty$Builder
                                                        CfnAsset$Builder
                                                        CfnAssetModel$AssetModelCompositeModelProperty$Builder
                                                        CfnAssetModel$AssetModelHierarchyProperty$Builder
                                                        CfnAssetModel$AssetModelPropertyProperty$Builder
                                                        CfnAssetModel$AttributeProperty$Builder
                                                        CfnAssetModel$Builder
                                                        CfnAssetModel$ExpressionVariableProperty$Builder
                                                        CfnAssetModel$MetricProperty$Builder
                                                        CfnAssetModel$MetricWindowProperty$Builder
                                                        CfnAssetModel$PropertyPathDefinitionProperty$Builder
                                                        CfnAssetModel$PropertyTypeProperty$Builder
                                                        CfnAssetModel$TransformProperty$Builder
                                                        CfnAssetModel$TumblingWindowProperty$Builder
                                                        CfnAssetModel$VariableValueProperty$Builder
                                                        CfnAssetModelProps$Builder
                                                        CfnAssetProps$Builder
                                                        CfnDashboard$Builder
                                                        CfnDashboardProps$Builder
                                                        CfnGateway$Builder
                                                        CfnGateway$GatewayCapabilitySummaryProperty$Builder
                                                        CfnGateway$GatewayPlatformProperty$Builder
                                                        CfnGateway$GreengrassProperty$Builder
                                                        CfnGateway$GreengrassV2Property$Builder
                                                        CfnGatewayProps$Builder
                                                        CfnPortal$AlarmsProperty$Builder
                                                        CfnPortal$Builder
                                                        CfnPortalProps$Builder
                                                        CfnProject$Builder
                                                        CfnProjectProps$Builder]))


(defn cfn-access-policy-access-policy-identity-property-builder>
  "The cfn-access-policy-access-policy-identity-property-builder> function updates a CfnAccessPolicy$AccessPolicyIdentityProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPolicy$AccessPolicyIdentityProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iamRole` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iam-role` |
| `iamUser` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iam-user` |
| `user` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user` |
"
  [^CfnAccessPolicy$AccessPolicyIdentityProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :iam-role)]
    (. builder iamRole data))
  (when-some [data (lookup-entry config id :iam-user)]
    (. builder iamUser data))
  (when-some [data (lookup-entry config id :user)]
    (. builder user data))
  (.build builder))


(defn cfn-access-policy-access-policy-identity-property-builder
  "Creates a  `CfnAccessPolicy$AccessPolicyIdentityProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-policy-access-policy-identity-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-policy-access-policy-identity-property-builder> (new CfnAccessPolicy$AccessPolicyIdentityProperty$Builder) id config))


(defn cfn-access-policy-access-policy-resource-property-builder>
  "The cfn-access-policy-access-policy-resource-property-builder> function updates a CfnAccessPolicy$AccessPolicyResourceProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPolicy$AccessPolicyResourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `portal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:portal` |
| `project` | software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy$ProjectProperty | [[cdk.support/lookup-entry]] | `:project` |
"
  [^CfnAccessPolicy$AccessPolicyResourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :portal)]
    (. builder portal data))
  (when-some [data (lookup-entry config id :project)]
    (. builder project data))
  (.build builder))


(defn cfn-access-policy-access-policy-resource-property-builder
  "Creates a  `CfnAccessPolicy$AccessPolicyResourceProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-policy-access-policy-resource-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-policy-access-policy-resource-property-builder> (new CfnAccessPolicy$AccessPolicyResourceProperty$Builder) id config))


(defn cfn-access-policy-builder>
  "The cfn-access-policy-builder> function updates a CfnAccessPolicy$Builder instance using the provided configuration.
  The function takes the CfnAccessPolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicyIdentity` | software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy$AccessPolicyIdentityProperty | [[cdk.support/lookup-entry]] | `:access-policy-identity` |
| `accessPolicyPermission` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-policy-permission` |
| `accessPolicyResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-policy-resource` |
"
  [^CfnAccessPolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :access-policy-identity)]
    (. builder accessPolicyIdentity data))
  (when-some [data (lookup-entry config id :access-policy-permission)]
    (. builder accessPolicyPermission data))
  (when-some [data (lookup-entry config id :access-policy-resource)]
    (. builder accessPolicyResource data))
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


(defn cfn-access-policy-iam-role-property-builder>
  "The cfn-access-policy-iam-role-property-builder> function updates a CfnAccessPolicy$IamRoleProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPolicy$IamRoleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnAccessPolicy$IamRoleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-access-policy-iam-role-property-builder
  "Creates a  `CfnAccessPolicy$IamRoleProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-policy-iam-role-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-policy-iam-role-property-builder> (new CfnAccessPolicy$IamRoleProperty$Builder) id config))


(defn cfn-access-policy-iam-user-property-builder>
  "The cfn-access-policy-iam-user-property-builder> function updates a CfnAccessPolicy$IamUserProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPolicy$IamUserProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnAccessPolicy$IamUserProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-access-policy-iam-user-property-builder
  "Creates a  `CfnAccessPolicy$IamUserProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-policy-iam-user-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-policy-iam-user-property-builder> (new CfnAccessPolicy$IamUserProperty$Builder) id config))


(defn cfn-access-policy-portal-property-builder>
  "The cfn-access-policy-portal-property-builder> function updates a CfnAccessPolicy$PortalProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPolicy$PortalProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnAccessPolicy$PortalProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn cfn-access-policy-portal-property-builder
  "Creates a  `CfnAccessPolicy$PortalProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-policy-portal-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-policy-portal-property-builder> (new CfnAccessPolicy$PortalProperty$Builder) id config))


(defn cfn-access-policy-project-property-builder>
  "The cfn-access-policy-project-property-builder> function updates a CfnAccessPolicy$ProjectProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPolicy$ProjectProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnAccessPolicy$ProjectProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn cfn-access-policy-project-property-builder
  "Creates a  `CfnAccessPolicy$ProjectProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-policy-project-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-policy-project-property-builder> (new CfnAccessPolicy$ProjectProperty$Builder) id config))


(defn cfn-access-policy-props-builder>
  "The cfn-access-policy-props-builder> function updates a CfnAccessPolicyProps$Builder instance using the provided configuration.
  The function takes the CfnAccessPolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicyIdentity` | software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy$AccessPolicyIdentityProperty | [[cdk.support/lookup-entry]] | `:access-policy-identity` |
| `accessPolicyPermission` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-policy-permission` |
| `accessPolicyResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-policy-resource` |
"
  [^CfnAccessPolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-policy-identity)]
    (. builder accessPolicyIdentity data))
  (when-some [data (lookup-entry config id :access-policy-permission)]
    (. builder accessPolicyPermission data))
  (when-some [data (lookup-entry config id :access-policy-resource)]
    (. builder accessPolicyResource data))
  (.build builder))


(defn cfn-access-policy-props-builder
  "Creates a  `CfnAccessPolicyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-policy-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-policy-props-builder> (new CfnAccessPolicyProps$Builder) id config))


(defn cfn-access-policy-user-property-builder>
  "The cfn-access-policy-user-property-builder> function updates a CfnAccessPolicy$UserProperty$Builder instance using the provided configuration.
  The function takes the CfnAccessPolicy$UserProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
"
  [^CfnAccessPolicy$UserProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (.build builder))


(defn cfn-access-policy-user-property-builder
  "Creates a  `CfnAccessPolicy$UserProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-access-policy-user-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-access-policy-user-property-builder> (new CfnAccessPolicy$UserProperty$Builder) id config))


(defn cfn-asset-asset-hierarchy-property-builder>
  "The cfn-asset-asset-hierarchy-property-builder> function updates a CfnAsset$AssetHierarchyProperty$Builder instance using the provided configuration.
  The function takes the CfnAsset$AssetHierarchyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childAssetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:child-asset-id` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
"
  [^CfnAsset$AssetHierarchyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :child-asset-id)]
    (. builder childAssetId data))
  (when-some [data (lookup-entry config id :external-id)]
    (. builder externalId data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :logical-id)]
    (. builder logicalId data))
  (.build builder))


(defn cfn-asset-asset-hierarchy-property-builder
  "Creates a  `CfnAsset$AssetHierarchyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-asset-hierarchy-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-asset-hierarchy-property-builder> (new CfnAsset$AssetHierarchyProperty$Builder) id config))


(defn cfn-asset-asset-property-property-builder>
  "The cfn-asset-asset-property-property-builder> function updates a CfnAsset$AssetPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnAsset$AssetPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `notificationState` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-state` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnAsset$AssetPropertyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alias)]
    (. builder alias data))
  (when-some [data (lookup-entry config id :external-id)]
    (. builder externalId data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :logical-id)]
    (. builder logicalId data))
  (when-some [data (lookup-entry config id :notification-state)]
    (. builder notificationState data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-asset-asset-property-property-builder
  "Creates a  `CfnAsset$AssetPropertyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-asset-property-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-asset-property-property-builder> (new CfnAsset$AssetPropertyProperty$Builder) id config))


(defn cfn-asset-builder>
  "The cfn-asset-builder> function updates a CfnAsset$Builder instance using the provided configuration.
  The function takes the CfnAsset$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-description` |
| `assetExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-external-id` |
| `assetHierarchies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:asset-hierarchies` |
| `assetModelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-id` |
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `assetProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAsset$Builder builder id config]
  (when-some [data (lookup-entry config id :asset-description)]
    (. builder assetDescription data))
  (when-some [data (lookup-entry config id :asset-external-id)]
    (. builder assetExternalId data))
  (when-some [data (lookup-entry config id :asset-hierarchies)]
    (. builder assetHierarchies data))
  (when-some [data (lookup-entry config id :asset-model-id)]
    (. builder assetModelId data))
  (when-some [data (lookup-entry config id :asset-name)]
    (. builder assetName data))
  (when-some [data (lookup-entry config id :asset-properties)]
    (. builder assetProperties data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-asset-builder
  "Creates a  `CfnAsset$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-asset-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-asset-builder> (CfnAsset$Builder/create scope (name id)) id config))


(defn cfn-asset-model-asset-model-composite-model-property-builder>
  "The cfn-asset-model-asset-model-composite-model-property-builder> function updates a CfnAssetModel$AssetModelCompositeModelProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$AssetModelCompositeModelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `composedAssetModelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:composed-asset-model-id` |
| `compositeModelProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:composite-model-properties` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `parentAssetModelCompositeModelExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-asset-model-composite-model-external-id` |
| `path` | java.util.List | [[cdk.support/lookup-entry]] | `:path` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnAssetModel$AssetModelCompositeModelProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :composed-asset-model-id)]
    (. builder composedAssetModelId data))
  (when-some [data (lookup-entry config id :composite-model-properties)]
    (. builder compositeModelProperties data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :external-id)]
    (. builder externalId data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :parent-asset-model-composite-model-external-id)]
    (. builder parentAssetModelCompositeModelExternalId data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-asset-model-asset-model-composite-model-property-builder
  "Creates a  `CfnAssetModel$AssetModelCompositeModelProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-asset-model-composite-model-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-asset-model-composite-model-property-builder> (new CfnAssetModel$AssetModelCompositeModelProperty$Builder) id config))


(defn cfn-asset-model-asset-model-hierarchy-property-builder>
  "The cfn-asset-model-asset-model-hierarchy-property-builder> function updates a CfnAssetModel$AssetModelHierarchyProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$AssetModelHierarchyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childAssetModelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:child-asset-model-id` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnAssetModel$AssetModelHierarchyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :child-asset-model-id)]
    (. builder childAssetModelId data))
  (when-some [data (lookup-entry config id :external-id)]
    (. builder externalId data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :logical-id)]
    (. builder logicalId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-asset-model-asset-model-hierarchy-property-builder
  "Creates a  `CfnAssetModel$AssetModelHierarchyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-asset-model-hierarchy-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-asset-model-hierarchy-property-builder> (new CfnAssetModel$AssetModelHierarchyProperty$Builder) id config))


(defn cfn-asset-model-asset-model-property-property-builder>
  "The cfn-asset-model-asset-model-property-property-builder> function updates a CfnAssetModel$AssetModelPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$AssetModelPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `dataTypeSpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type-spec` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:type` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |
"
  [^CfnAssetModel$AssetModelPropertyProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-some [data (lookup-entry config id :data-type-spec)]
    (. builder dataTypeSpec data))
  (when-some [data (lookup-entry config id :external-id)]
    (. builder externalId data))
  (when-some [data (lookup-entry config id :id)]
    (. builder id data))
  (when-some [data (lookup-entry config id :logical-id)]
    (. builder logicalId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :unit)]
    (. builder unit data))
  (.build builder))


(defn cfn-asset-model-asset-model-property-property-builder
  "Creates a  `CfnAssetModel$AssetModelPropertyProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-asset-model-property-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-asset-model-property-property-builder> (new CfnAssetModel$AssetModelPropertyProperty$Builder) id config))


(defn cfn-asset-model-attribute-property-builder>
  "The cfn-asset-model-attribute-property-builder> function updates a CfnAssetModel$AttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$AttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
"
  [^CfnAssetModel$AttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (.build builder))


(defn cfn-asset-model-attribute-property-builder
  "Creates a  `CfnAssetModel$AttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-attribute-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-attribute-property-builder> (new CfnAssetModel$AttributeProperty$Builder) id config))


(defn cfn-asset-model-builder>
  "The cfn-asset-model-builder> function updates a CfnAssetModel$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetModelCompositeModels` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-model-composite-models` |
| `assetModelDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-description` |
| `assetModelExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-external-id` |
| `assetModelHierarchies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:asset-model-hierarchies` |
| `assetModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-name` |
| `assetModelProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-model-properties` |
| `assetModelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAssetModel$Builder builder id config]
  (when-some [data (lookup-entry config id :asset-model-composite-models)]
    (. builder assetModelCompositeModels data))
  (when-some [data (lookup-entry config id :asset-model-description)]
    (. builder assetModelDescription data))
  (when-some [data (lookup-entry config id :asset-model-external-id)]
    (. builder assetModelExternalId data))
  (when-some [data (lookup-entry config id :asset-model-hierarchies)]
    (. builder assetModelHierarchies data))
  (when-some [data (lookup-entry config id :asset-model-name)]
    (. builder assetModelName data))
  (when-some [data (lookup-entry config id :asset-model-properties)]
    (. builder assetModelProperties data))
  (when-some [data (lookup-entry config id :asset-model-type)]
    (. builder assetModelType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-asset-model-builder
  "Creates a  `CfnAssetModel$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-asset-model-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-asset-model-builder> (CfnAssetModel$Builder/create scope (name id)) id config))


(defn cfn-asset-model-expression-variable-property-builder>
  "The cfn-asset-model-expression-variable-property-builder> function updates a CfnAssetModel$ExpressionVariableProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$ExpressionVariableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | software.amazon.awscdk.services.iotsitewise.CfnAssetModel$VariableValueProperty | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnAssetModel$ExpressionVariableProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-asset-model-expression-variable-property-builder
  "Creates a  `CfnAssetModel$ExpressionVariableProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-expression-variable-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-expression-variable-property-builder> (new CfnAssetModel$ExpressionVariableProperty$Builder) id config))


(defn cfn-asset-model-metric-property-builder>
  "The cfn-asset-model-metric-property-builder> function updates a CfnAssetModel$MetricProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$MetricProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |
| `window` | software.amazon.awscdk.services.iotsitewise.CfnAssetModel$MetricWindowProperty | [[cdk.support/lookup-entry]] | `:window` |
"
  [^CfnAssetModel$MetricProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :variables)]
    (. builder variables data))
  (when-some [data (lookup-entry config id :window)]
    (. builder window data))
  (.build builder))


(defn cfn-asset-model-metric-property-builder
  "Creates a  `CfnAssetModel$MetricProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-metric-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-metric-property-builder> (new CfnAssetModel$MetricProperty$Builder) id config))


(defn cfn-asset-model-metric-window-property-builder>
  "The cfn-asset-model-metric-window-property-builder> function updates a CfnAssetModel$MetricWindowProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$MetricWindowProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tumbling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tumbling` |
"
  [^CfnAssetModel$MetricWindowProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :tumbling)]
    (. builder tumbling data))
  (.build builder))


(defn cfn-asset-model-metric-window-property-builder
  "Creates a  `CfnAssetModel$MetricWindowProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-metric-window-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-metric-window-property-builder> (new CfnAssetModel$MetricWindowProperty$Builder) id config))


(defn cfn-asset-model-property-path-definition-property-builder>
  "The cfn-asset-model-property-path-definition-property-builder> function updates a CfnAssetModel$PropertyPathDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$PropertyPathDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnAssetModel$PropertyPathDefinitionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-asset-model-property-path-definition-property-builder
  "Creates a  `CfnAssetModel$PropertyPathDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-property-path-definition-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-property-path-definition-property-builder> (new CfnAssetModel$PropertyPathDefinitionProperty$Builder) id config))


(defn cfn-asset-model-property-type-property-builder>
  "The cfn-asset-model-property-type-property-builder> function updates a CfnAssetModel$PropertyTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$PropertyTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute` |
| `metric` | software.amazon.awscdk.services.iotsitewise.CfnAssetModel$MetricProperty | [[cdk.support/lookup-entry]] | `:metric` |
| `transform` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transform` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |
"
  [^CfnAssetModel$PropertyTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :attribute)]
    (. builder attribute data))
  (when-some [data (lookup-entry config id :metric)]
    (. builder metric data))
  (when-some [data (lookup-entry config id :transform)]
    (. builder transform data))
  (when-some [data (lookup-entry config id :type-name)]
    (. builder typeName data))
  (.build builder))


(defn cfn-asset-model-property-type-property-builder
  "Creates a  `CfnAssetModel$PropertyTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-property-type-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-property-type-property-builder> (new CfnAssetModel$PropertyTypeProperty$Builder) id config))


(defn cfn-asset-model-props-builder>
  "The cfn-asset-model-props-builder> function updates a CfnAssetModelProps$Builder instance using the provided configuration.
  The function takes the CfnAssetModelProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetModelCompositeModels` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-model-composite-models` |
| `assetModelDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-description` |
| `assetModelExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-external-id` |
| `assetModelHierarchies` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-model-hierarchies` |
| `assetModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-name` |
| `assetModelProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:asset-model-properties` |
| `assetModelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAssetModelProps$Builder builder id config]
  (when-some [data (lookup-entry config id :asset-model-composite-models)]
    (. builder assetModelCompositeModels data))
  (when-some [data (lookup-entry config id :asset-model-description)]
    (. builder assetModelDescription data))
  (when-some [data (lookup-entry config id :asset-model-external-id)]
    (. builder assetModelExternalId data))
  (when-some [data (lookup-entry config id :asset-model-hierarchies)]
    (. builder assetModelHierarchies data))
  (when-some [data (lookup-entry config id :asset-model-name)]
    (. builder assetModelName data))
  (when-some [data (lookup-entry config id :asset-model-properties)]
    (. builder assetModelProperties data))
  (when-some [data (lookup-entry config id :asset-model-type)]
    (. builder assetModelType data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-asset-model-props-builder
  "Creates a  `CfnAssetModelProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-props-builder> (new CfnAssetModelProps$Builder) id config))


(defn cfn-asset-model-transform-property-builder>
  "The cfn-asset-model-transform-property-builder> function updates a CfnAssetModel$TransformProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$TransformProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `variables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variables` |
"
  [^CfnAssetModel$TransformProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-some [data (lookup-entry config id :variables)]
    (. builder variables data))
  (.build builder))


(defn cfn-asset-model-transform-property-builder
  "Creates a  `CfnAssetModel$TransformProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-transform-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-transform-property-builder> (new CfnAssetModel$TransformProperty$Builder) id config))


(defn cfn-asset-model-tumbling-window-property-builder>
  "The cfn-asset-model-tumbling-window-property-builder> function updates a CfnAssetModel$TumblingWindowProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$TumblingWindowProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval` |
| `offset` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset` |
"
  [^CfnAssetModel$TumblingWindowProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :interval)]
    (. builder interval data))
  (when-some [data (lookup-entry config id :offset)]
    (. builder offset data))
  (.build builder))


(defn cfn-asset-model-tumbling-window-property-builder
  "Creates a  `CfnAssetModel$TumblingWindowProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-tumbling-window-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-tumbling-window-property-builder> (new CfnAssetModel$TumblingWindowProperty$Builder) id config))


(defn cfn-asset-model-variable-value-property-builder>
  "The cfn-asset-model-variable-value-property-builder> function updates a CfnAssetModel$VariableValueProperty$Builder instance using the provided configuration.
  The function takes the CfnAssetModel$VariableValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hierarchyExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hierarchy-external-id` |
| `hierarchyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hierarchy-id` |
| `hierarchyLogicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hierarchy-logical-id` |
| `propertyExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-external-id` |
| `propertyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-id` |
| `propertyLogicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-logical-id` |
| `propertyPath` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-path` |
"
  [^CfnAssetModel$VariableValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :hierarchy-external-id)]
    (. builder hierarchyExternalId data))
  (when-some [data (lookup-entry config id :hierarchy-id)]
    (. builder hierarchyId data))
  (when-some [data (lookup-entry config id :hierarchy-logical-id)]
    (. builder hierarchyLogicalId data))
  (when-some [data (lookup-entry config id :property-external-id)]
    (. builder propertyExternalId data))
  (when-some [data (lookup-entry config id :property-id)]
    (. builder propertyId data))
  (when-some [data (lookup-entry config id :property-logical-id)]
    (. builder propertyLogicalId data))
  (when-some [data (lookup-entry config id :property-path)]
    (. builder propertyPath data))
  (.build builder))


(defn cfn-asset-model-variable-value-property-builder
  "Creates a  `CfnAssetModel$VariableValueProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-model-variable-value-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-model-variable-value-property-builder> (new CfnAssetModel$VariableValueProperty$Builder) id config))


(defn cfn-asset-props-builder>
  "The cfn-asset-props-builder> function updates a CfnAssetProps$Builder instance using the provided configuration.
  The function takes the CfnAssetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-description` |
| `assetExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-external-id` |
| `assetHierarchies` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-hierarchies` |
| `assetModelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-id` |
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `assetProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:asset-properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAssetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :asset-description)]
    (. builder assetDescription data))
  (when-some [data (lookup-entry config id :asset-external-id)]
    (. builder assetExternalId data))
  (when-some [data (lookup-entry config id :asset-hierarchies)]
    (. builder assetHierarchies data))
  (when-some [data (lookup-entry config id :asset-model-id)]
    (. builder assetModelId data))
  (when-some [data (lookup-entry config id :asset-name)]
    (. builder assetName data))
  (when-some [data (lookup-entry config id :asset-properties)]
    (. builder assetProperties data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-asset-props-builder
  "Creates a  `CfnAssetProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-asset-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-asset-props-builder> (new CfnAssetProps$Builder) id config))


(defn cfn-dashboard-builder>
  "The cfn-dashboard-builder> function updates a CfnDashboard$Builder instance using the provided configuration.
  The function takes the CfnDashboard$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-definition` |
| `dashboardDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-description` |
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |
| `projectId` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDashboard$Builder builder id config]
  (when-some [data (lookup-entry config id :dashboard-definition)]
    (. builder dashboardDefinition data))
  (when-some [data (lookup-entry config id :dashboard-description)]
    (. builder dashboardDescription data))
  (when-some [data (lookup-entry config id :dashboard-name)]
    (. builder dashboardName data))
  (when-some [data (lookup-entry config id :project-id)]
    (. builder projectId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-dashboard-builder
  "Creates a  `CfnDashboard$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-dashboard-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-dashboard-builder> (CfnDashboard$Builder/create scope (name id)) id config))


(defn cfn-dashboard-props-builder>
  "The cfn-dashboard-props-builder> function updates a CfnDashboardProps$Builder instance using the provided configuration.
  The function takes the CfnDashboardProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-definition` |
| `dashboardDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-description` |
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |
| `projectId` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnDashboardProps$Builder builder id config]
  (when-some [data (lookup-entry config id :dashboard-definition)]
    (. builder dashboardDefinition data))
  (when-some [data (lookup-entry config id :dashboard-description)]
    (. builder dashboardDescription data))
  (when-some [data (lookup-entry config id :dashboard-name)]
    (. builder dashboardName data))
  (when-some [data (lookup-entry config id :project-id)]
    (. builder projectId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-dashboard-props-builder
  "Creates a  `CfnDashboardProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-dashboard-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-dashboard-props-builder> (new CfnDashboardProps$Builder) id config))


(defn cfn-gateway-builder>
  "The cfn-gateway-builder> function updates a CfnGateway$Builder instance using the provided configuration.
  The function takes the CfnGateway$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayCapabilitySummaries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gateway-capability-summaries` |
| `gatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-name` |
| `gatewayPlatform` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gateway-platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGateway$Builder builder id config]
  (when-some [data (lookup-entry config id :gateway-capability-summaries)]
    (. builder gatewayCapabilitySummaries data))
  (when-some [data (lookup-entry config id :gateway-name)]
    (. builder gatewayName data))
  (when-some [data (lookup-entry config id :gateway-platform)]
    (. builder gatewayPlatform data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-gateway-builder
  "Creates a  `CfnGateway$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-gateway-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-gateway-builder> (CfnGateway$Builder/create scope (name id)) id config))


(defn cfn-gateway-gateway-capability-summary-property-builder>
  "The cfn-gateway-gateway-capability-summary-property-builder> function updates a CfnGateway$GatewayCapabilitySummaryProperty$Builder instance using the provided configuration.
  The function takes the CfnGateway$GatewayCapabilitySummaryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:capability-configuration` |
| `capabilityNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:capability-namespace` |
"
  [^CfnGateway$GatewayCapabilitySummaryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :capability-configuration)]
    (. builder capabilityConfiguration data))
  (when-some [data (lookup-entry config id :capability-namespace)]
    (. builder capabilityNamespace data))
  (.build builder))


(defn cfn-gateway-gateway-capability-summary-property-builder
  "Creates a  `CfnGateway$GatewayCapabilitySummaryProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-gateway-gateway-capability-summary-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-gateway-gateway-capability-summary-property-builder> (new CfnGateway$GatewayCapabilitySummaryProperty$Builder) id config))


(defn cfn-gateway-gateway-platform-property-builder>
  "The cfn-gateway-gateway-platform-property-builder> function updates a CfnGateway$GatewayPlatformProperty$Builder instance using the provided configuration.
  The function takes the CfnGateway$GatewayPlatformProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `greengrass` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:greengrass` |
| `greengrassV2` | software.amazon.awscdk.services.iotsitewise.CfnGateway$GreengrassV2Property | [[cdk.support/lookup-entry]] | `:greengrass-v2` |
"
  [^CfnGateway$GatewayPlatformProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :greengrass)]
    (. builder greengrass data))
  (when-some [data (lookup-entry config id :greengrass-v2)]
    (. builder greengrassV2 data))
  (.build builder))


(defn cfn-gateway-gateway-platform-property-builder
  "Creates a  `CfnGateway$GatewayPlatformProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-gateway-gateway-platform-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-gateway-gateway-platform-property-builder> (new CfnGateway$GatewayPlatformProperty$Builder) id config))


(defn cfn-gateway-greengrass-property-builder>
  "The cfn-gateway-greengrass-property-builder> function updates a CfnGateway$GreengrassProperty$Builder instance using the provided configuration.
  The function takes the CfnGateway$GreengrassProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-arn` |
"
  [^CfnGateway$GreengrassProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :group-arn)]
    (. builder groupArn data))
  (.build builder))


(defn cfn-gateway-greengrass-property-builder
  "Creates a  `CfnGateway$GreengrassProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-gateway-greengrass-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-gateway-greengrass-property-builder> (new CfnGateway$GreengrassProperty$Builder) id config))


(defn cfn-gateway-greengrass-v2-property-builder>
  "The cfn-gateway-greengrass-v2-property-builder> function updates a CfnGateway$GreengrassV2Property$Builder instance using the provided configuration.
  The function takes the CfnGateway$GreengrassV2Property$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreDeviceThingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-device-thing-name` |
"
  [^CfnGateway$GreengrassV2Property$Builder builder id config]
  (when-some [data (lookup-entry config id :core-device-thing-name)]
    (. builder coreDeviceThingName data))
  (.build builder))


(defn cfn-gateway-greengrass-v2-property-builder
  "Creates a  `CfnGateway$GreengrassV2Property$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-gateway-greengrass-v2-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-gateway-greengrass-v2-property-builder> (new CfnGateway$GreengrassV2Property$Builder) id config))


(defn cfn-gateway-props-builder>
  "The cfn-gateway-props-builder> function updates a CfnGatewayProps$Builder instance using the provided configuration.
  The function takes the CfnGatewayProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayCapabilitySummaries` | java.util.List | [[cdk.support/lookup-entry]] | `:gateway-capability-summaries` |
| `gatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-name` |
| `gatewayPlatform` | software.amazon.awscdk.services.iotsitewise.CfnGateway$GatewayPlatformProperty | [[cdk.support/lookup-entry]] | `:gateway-platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGatewayProps$Builder builder id config]
  (when-some [data (lookup-entry config id :gateway-capability-summaries)]
    (. builder gatewayCapabilitySummaries data))
  (when-some [data (lookup-entry config id :gateway-name)]
    (. builder gatewayName data))
  (when-some [data (lookup-entry config id :gateway-platform)]
    (. builder gatewayPlatform data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-gateway-props-builder
  "Creates a  `CfnGatewayProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-gateway-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-gateway-props-builder> (new CfnGatewayProps$Builder) id config))


(defn cfn-portal-alarms-property-builder>
  "The cfn-portal-alarms-property-builder> function updates a CfnPortal$AlarmsProperty$Builder instance using the provided configuration.
  The function takes the CfnPortal$AlarmsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-role-arn` |
| `notificationLambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-lambda-arn` |
"
  [^CfnPortal$AlarmsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :alarm-role-arn)]
    (. builder alarmRoleArn data))
  (when-some [data (lookup-entry config id :notification-lambda-arn)]
    (. builder notificationLambdaArn data))
  (.build builder))


(defn cfn-portal-alarms-property-builder
  "Creates a  `CfnPortal$AlarmsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-portal-alarms-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-portal-alarms-property-builder> (new CfnPortal$AlarmsProperty$Builder) id config))


(defn cfn-portal-builder>
  "The cfn-portal-builder> function updates a CfnPortal$Builder instance using the provided configuration.
  The function takes the CfnPortal$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.lang.Object | [[cdk.support/lookup-entry]] | `:alarms` |
| `notificationSenderEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-sender-email` |
| `portalAuthMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-auth-mode` |
| `portalContactEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-contact-email` |
| `portalDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-description` |
| `portalName` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPortal$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :notification-sender-email)]
    (. builder notificationSenderEmail data))
  (when-some [data (lookup-entry config id :portal-auth-mode)]
    (. builder portalAuthMode data))
  (when-some [data (lookup-entry config id :portal-contact-email)]
    (. builder portalContactEmail data))
  (when-some [data (lookup-entry config id :portal-description)]
    (. builder portalDescription data))
  (when-some [data (lookup-entry config id :portal-name)]
    (. builder portalName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-portal-builder
  "Creates a  `CfnPortal$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-portal-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-portal-builder> (CfnPortal$Builder/create scope (name id)) id config))


(defn cfn-portal-props-builder>
  "The cfn-portal-props-builder> function updates a CfnPortalProps$Builder instance using the provided configuration.
  The function takes the CfnPortalProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.lang.Object | [[cdk.support/lookup-entry]] | `:alarms` |
| `notificationSenderEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-sender-email` |
| `portalAuthMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-auth-mode` |
| `portalContactEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-contact-email` |
| `portalDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-description` |
| `portalName` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPortalProps$Builder builder id config]
  (when-some [data (lookup-entry config id :alarms)]
    (. builder alarms data))
  (when-some [data (lookup-entry config id :notification-sender-email)]
    (. builder notificationSenderEmail data))
  (when-some [data (lookup-entry config id :portal-auth-mode)]
    (. builder portalAuthMode data))
  (when-some [data (lookup-entry config id :portal-contact-email)]
    (. builder portalContactEmail data))
  (when-some [data (lookup-entry config id :portal-description)]
    (. builder portalDescription data))
  (when-some [data (lookup-entry config id :portal-name)]
    (. builder portalName data))
  (when-some [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-portal-props-builder
  "Creates a  `CfnPortalProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-portal-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-portal-props-builder> (new CfnPortalProps$Builder) id config))


(defn cfn-project-builder>
  "The cfn-project-builder> function updates a CfnProject$Builder instance using the provided configuration.
  The function takes the CfnProject$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-ids` |
| `portalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-id` |
| `projectDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-description` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProject$Builder builder id config]
  (when-some [data (lookup-entry config id :asset-ids)]
    (. builder assetIds data))
  (when-some [data (lookup-entry config id :portal-id)]
    (. builder portalId data))
  (when-some [data (lookup-entry config id :project-description)]
    (. builder projectDescription data))
  (when-some [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-project-builder
  "Creates a  `CfnProject$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-project-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-project-builder> (CfnProject$Builder/create scope (name id)) id config))


(defn cfn-project-props-builder>
  "The cfn-project-props-builder> function updates a CfnProjectProps$Builder instance using the provided configuration.
  The function takes the CfnProjectProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-ids` |
| `portalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-id` |
| `projectDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-description` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnProjectProps$Builder builder id config]
  (when-some [data (lookup-entry config id :asset-ids)]
    (. builder assetIds data))
  (when-some [data (lookup-entry config id :portal-id)]
    (. builder portalId data))
  (when-some [data (lookup-entry config id :project-description)]
    (. builder projectDescription data))
  (when-some [data (lookup-entry config id :project-name)]
    (. builder projectName data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-project-props-builder
  "Creates a  `CfnProjectProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-project-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-project-props-builder> (new CfnProjectProps$Builder) id config))