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


(defn cfn-access-policy-access-policy-identity-property-builder
  "The cfn-access-policy-access-policy-identity-property-builder function buildes out new instances of 
CfnAccessPolicy$AccessPolicyIdentityProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iamRole` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iam-role` |
| `iamUser` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:iam-user` |
| `user` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:user` |"
  [stack id config]
  (let [builder (CfnAccessPolicy$AccessPolicyIdentityProperty$Builder.)]
    (when-let [data (lookup-entry config id :iam-role)]
      (. builder iamRole data))
    (when-let [data (lookup-entry config id :iam-user)]
      (. builder iamUser data))
    (when-let [data (lookup-entry config id :user)]
      (. builder user data))
    (.build builder)))


(defn cfn-access-policy-access-policy-resource-property-builder
  "The cfn-access-policy-access-policy-resource-property-builder function buildes out new instances of 
CfnAccessPolicy$AccessPolicyResourceProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `portal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:portal` |
| `project` | software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy$ProjectProperty | [[cdk.support/lookup-entry]] | `:project` |"
  [stack id config]
  (let [builder (CfnAccessPolicy$AccessPolicyResourceProperty$Builder.)]
    (when-let [data (lookup-entry config id :portal)]
      (. builder portal data))
    (when-let [data (lookup-entry config id :project)]
      (. builder project data))
    (.build builder)))


(defn cfn-access-policy-builder
  "The cfn-access-policy-builder function buildes out new instances of 
CfnAccessPolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicyIdentity` | software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy$AccessPolicyIdentityProperty | [[cdk.support/lookup-entry]] | `:access-policy-identity` |
| `accessPolicyPermission` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-policy-permission` |
| `accessPolicyResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-policy-resource` |"
  [stack id config]
  (let [builder (CfnAccessPolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-policy-identity)]
      (. builder accessPolicyIdentity data))
    (when-let [data (lookup-entry config id :access-policy-permission)]
      (. builder accessPolicyPermission data))
    (when-let [data (lookup-entry config id :access-policy-resource)]
      (. builder accessPolicyResource data))
    (.build builder)))


(defn cfn-access-policy-iam-role-property-builder
  "The cfn-access-policy-iam-role-property-builder function buildes out new instances of 
CfnAccessPolicy$IamRoleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnAccessPolicy$IamRoleProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-access-policy-iam-user-property-builder
  "The cfn-access-policy-iam-user-property-builder function buildes out new instances of 
CfnAccessPolicy$IamUserProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnAccessPolicy$IamUserProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-access-policy-portal-property-builder
  "The cfn-access-policy-portal-property-builder function buildes out new instances of 
CfnAccessPolicy$PortalProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |"
  [stack id config]
  (let [builder (CfnAccessPolicy$PortalProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (.build builder)))


(defn cfn-access-policy-project-property-builder
  "The cfn-access-policy-project-property-builder function buildes out new instances of 
CfnAccessPolicy$ProjectProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |"
  [stack id config]
  (let [builder (CfnAccessPolicy$ProjectProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (.build builder)))


(defn cfn-access-policy-props-builder
  "The cfn-access-policy-props-builder function buildes out new instances of 
CfnAccessPolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicyIdentity` | software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy$AccessPolicyIdentityProperty | [[cdk.support/lookup-entry]] | `:access-policy-identity` |
| `accessPolicyPermission` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-policy-permission` |
| `accessPolicyResource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-policy-resource` |"
  [stack id config]
  (let [builder (CfnAccessPolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :access-policy-identity)]
      (. builder accessPolicyIdentity data))
    (when-let [data (lookup-entry config id :access-policy-permission)]
      (. builder accessPolicyPermission data))
    (when-let [data (lookup-entry config id :access-policy-resource)]
      (. builder accessPolicyResource data))
    (.build builder)))


(defn cfn-access-policy-user-property-builder
  "The cfn-access-policy-user-property-builder function buildes out new instances of 
CfnAccessPolicy$UserProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |"
  [stack id config]
  (let [builder (CfnAccessPolicy$UserProperty$Builder.)]
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (.build builder)))


(defn cfn-asset-asset-hierarchy-property-builder
  "The cfn-asset-asset-hierarchy-property-builder function buildes out new instances of 
CfnAsset$AssetHierarchyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childAssetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:child-asset-id` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |"
  [stack id config]
  (let [builder (CfnAsset$AssetHierarchyProperty$Builder.)]
    (when-let [data (lookup-entry config id :child-asset-id)]
      (. builder childAssetId data))
    (when-let [data (lookup-entry config id :external-id)]
      (. builder externalId data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :logical-id)]
      (. builder logicalId data))
    (.build builder)))


(defn cfn-asset-asset-property-property-builder
  "The cfn-asset-asset-property-property-builder function buildes out new instances of 
CfnAsset$AssetPropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alias` | java.lang.String | [[cdk.support/lookup-entry]] | `:alias` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `notificationState` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-state` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnAsset$AssetPropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :alias)]
      (. builder alias data))
    (when-let [data (lookup-entry config id :external-id)]
      (. builder externalId data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :logical-id)]
      (. builder logicalId data))
    (when-let [data (lookup-entry config id :notification-state)]
      (. builder notificationState data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-asset-builder
  "The cfn-asset-builder function buildes out new instances of 
CfnAsset$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-description` |
| `assetExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-external-id` |
| `assetHierarchies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:asset-hierarchies` |
| `assetModelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-id` |
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `assetProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAsset$Builder/create stack id)]
    (when-let [data (lookup-entry config id :asset-description)]
      (. builder assetDescription data))
    (when-let [data (lookup-entry config id :asset-external-id)]
      (. builder assetExternalId data))
    (when-let [data (lookup-entry config id :asset-hierarchies)]
      (. builder assetHierarchies data))
    (when-let [data (lookup-entry config id :asset-model-id)]
      (. builder assetModelId data))
    (when-let [data (lookup-entry config id :asset-name)]
      (. builder assetName data))
    (when-let [data (lookup-entry config id :asset-properties)]
      (. builder assetProperties data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-asset-model-asset-model-composite-model-property-builder
  "The cfn-asset-model-asset-model-composite-model-property-builder function buildes out new instances of 
CfnAssetModel$AssetModelCompositeModelProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnAssetModel$AssetModelCompositeModelProperty$Builder.)]
    (when-let [data (lookup-entry config id :composed-asset-model-id)]
      (. builder composedAssetModelId data))
    (when-let [data (lookup-entry config id :composite-model-properties)]
      (. builder compositeModelProperties data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :external-id)]
      (. builder externalId data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :parent-asset-model-composite-model-external-id)]
      (. builder parentAssetModelCompositeModelExternalId data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-asset-model-asset-model-hierarchy-property-builder
  "The cfn-asset-model-asset-model-hierarchy-property-builder function buildes out new instances of 
CfnAssetModel$AssetModelHierarchyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `childAssetModelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:child-asset-model-id` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnAssetModel$AssetModelHierarchyProperty$Builder.)]
    (when-let [data (lookup-entry config id :child-asset-model-id)]
      (. builder childAssetModelId data))
    (when-let [data (lookup-entry config id :external-id)]
      (. builder externalId data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :logical-id)]
      (. builder logicalId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-asset-model-asset-model-property-property-builder
  "The cfn-asset-model-asset-model-property-property-builder function buildes out new instances of 
CfnAssetModel$AssetModelPropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `dataTypeSpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type-spec` |
| `externalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:external-id` |
| `id` | java.lang.String | [[cdk.support/lookup-entry]] | `:id` |
| `logicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:logical-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `type` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:type` |
| `unit` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit` |"
  [stack id config]
  (let [builder (CfnAssetModel$AssetModelPropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :data-type)]
      (. builder dataType data))
    (when-let [data (lookup-entry config id :data-type-spec)]
      (. builder dataTypeSpec data))
    (when-let [data (lookup-entry config id :external-id)]
      (. builder externalId data))
    (when-let [data (lookup-entry config id :id)]
      (. builder id data))
    (when-let [data (lookup-entry config id :logical-id)]
      (. builder logicalId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (when-let [data (lookup-entry config id :unit)]
      (. builder unit data))
    (.build builder)))


(defn cfn-asset-model-attribute-property-builder
  "The cfn-asset-model-attribute-property-builder function buildes out new instances of 
CfnAssetModel$AttributeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |"
  [stack id config]
  (let [builder (CfnAssetModel$AttributeProperty$Builder.)]
    (when-let [data (lookup-entry config id :default-value)]
      (. builder defaultValue data))
    (.build builder)))


(defn cfn-asset-model-builder
  "The cfn-asset-model-builder function buildes out new instances of 
CfnAssetModel$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetModelCompositeModels` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-model-composite-models` |
| `assetModelDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-description` |
| `assetModelExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-external-id` |
| `assetModelHierarchies` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:asset-model-hierarchies` |
| `assetModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-name` |
| `assetModelProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-model-properties` |
| `assetModelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAssetModel$Builder/create stack id)]
    (when-let [data (lookup-entry config id :asset-model-composite-models)]
      (. builder assetModelCompositeModels data))
    (when-let [data (lookup-entry config id :asset-model-description)]
      (. builder assetModelDescription data))
    (when-let [data (lookup-entry config id :asset-model-external-id)]
      (. builder assetModelExternalId data))
    (when-let [data (lookup-entry config id :asset-model-hierarchies)]
      (. builder assetModelHierarchies data))
    (when-let [data (lookup-entry config id :asset-model-name)]
      (. builder assetModelName data))
    (when-let [data (lookup-entry config id :asset-model-properties)]
      (. builder assetModelProperties data))
    (when-let [data (lookup-entry config id :asset-model-type)]
      (. builder assetModelType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-asset-model-expression-variable-property-builder
  "The cfn-asset-model-expression-variable-property-builder function buildes out new instances of 
CfnAssetModel$ExpressionVariableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | software.amazon.awscdk.services.iotsitewise.CfnAssetModel$VariableValueProperty | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnAssetModel$ExpressionVariableProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-asset-model-metric-property-builder
  "The cfn-asset-model-metric-property-builder function buildes out new instances of 
CfnAssetModel$MetricProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `variables` | java.util.List | [[cdk.support/lookup-entry]] | `:variables` |
| `window` | software.amazon.awscdk.services.iotsitewise.CfnAssetModel$MetricWindowProperty | [[cdk.support/lookup-entry]] | `:window` |"
  [stack id config]
  (let [builder (CfnAssetModel$MetricProperty$Builder.)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (when-let [data (lookup-entry config id :window)]
      (. builder window data))
    (.build builder)))


(defn cfn-asset-model-metric-window-property-builder
  "The cfn-asset-model-metric-window-property-builder function buildes out new instances of 
CfnAssetModel$MetricWindowProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tumbling` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:tumbling` |"
  [stack id config]
  (let [builder (CfnAssetModel$MetricWindowProperty$Builder.)]
    (when-let [data (lookup-entry config id :tumbling)]
      (. builder tumbling data))
    (.build builder)))


(defn cfn-asset-model-property-path-definition-property-builder
  "The cfn-asset-model-property-path-definition-property-builder function buildes out new instances of 
CfnAssetModel$PropertyPathDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnAssetModel$PropertyPathDefinitionProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-asset-model-property-type-property-builder
  "The cfn-asset-model-property-type-property-builder function buildes out new instances of 
CfnAssetModel$PropertyTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attribute` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attribute` |
| `metric` | software.amazon.awscdk.services.iotsitewise.CfnAssetModel$MetricProperty | [[cdk.support/lookup-entry]] | `:metric` |
| `transform` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:transform` |
| `typeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:type-name` |"
  [stack id config]
  (let [builder (CfnAssetModel$PropertyTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :attribute)]
      (. builder attribute data))
    (when-let [data (lookup-entry config id :metric)]
      (. builder metric data))
    (when-let [data (lookup-entry config id :transform)]
      (. builder transform data))
    (when-let [data (lookup-entry config id :type-name)]
      (. builder typeName data))
    (.build builder)))


(defn cfn-asset-model-props-builder
  "The cfn-asset-model-props-builder function buildes out new instances of 
CfnAssetModelProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetModelCompositeModels` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-model-composite-models` |
| `assetModelDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-description` |
| `assetModelExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-external-id` |
| `assetModelHierarchies` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-model-hierarchies` |
| `assetModelName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-name` |
| `assetModelProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:asset-model-properties` |
| `assetModelType` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-type` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAssetModelProps$Builder.)]
    (when-let [data (lookup-entry config id :asset-model-composite-models)]
      (. builder assetModelCompositeModels data))
    (when-let [data (lookup-entry config id :asset-model-description)]
      (. builder assetModelDescription data))
    (when-let [data (lookup-entry config id :asset-model-external-id)]
      (. builder assetModelExternalId data))
    (when-let [data (lookup-entry config id :asset-model-hierarchies)]
      (. builder assetModelHierarchies data))
    (when-let [data (lookup-entry config id :asset-model-name)]
      (. builder assetModelName data))
    (when-let [data (lookup-entry config id :asset-model-properties)]
      (. builder assetModelProperties data))
    (when-let [data (lookup-entry config id :asset-model-type)]
      (. builder assetModelType data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-asset-model-transform-property-builder
  "The cfn-asset-model-transform-property-builder function buildes out new instances of 
CfnAssetModel$TransformProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `variables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variables` |"
  [stack id config]
  (let [builder (CfnAssetModel$TransformProperty$Builder.)]
    (when-let [data (lookup-entry config id :expression)]
      (. builder expression data))
    (when-let [data (lookup-entry config id :variables)]
      (. builder variables data))
    (.build builder)))


(defn cfn-asset-model-tumbling-window-property-builder
  "The cfn-asset-model-tumbling-window-property-builder function buildes out new instances of 
CfnAssetModel$TumblingWindowProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `interval` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval` |
| `offset` | java.lang.String | [[cdk.support/lookup-entry]] | `:offset` |"
  [stack id config]
  (let [builder (CfnAssetModel$TumblingWindowProperty$Builder.)]
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :offset)]
      (. builder offset data))
    (.build builder)))


(defn cfn-asset-model-variable-value-property-builder
  "The cfn-asset-model-variable-value-property-builder function buildes out new instances of 
CfnAssetModel$VariableValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hierarchyExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hierarchy-external-id` |
| `hierarchyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hierarchy-id` |
| `hierarchyLogicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hierarchy-logical-id` |
| `propertyExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-external-id` |
| `propertyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-id` |
| `propertyLogicalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:property-logical-id` |
| `propertyPath` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-path` |"
  [stack id config]
  (let [builder (CfnAssetModel$VariableValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :hierarchy-external-id)]
      (. builder hierarchyExternalId data))
    (when-let [data (lookup-entry config id :hierarchy-id)]
      (. builder hierarchyId data))
    (when-let [data (lookup-entry config id :hierarchy-logical-id)]
      (. builder hierarchyLogicalId data))
    (when-let [data (lookup-entry config id :property-external-id)]
      (. builder propertyExternalId data))
    (when-let [data (lookup-entry config id :property-id)]
      (. builder propertyId data))
    (when-let [data (lookup-entry config id :property-logical-id)]
      (. builder propertyLogicalId data))
    (when-let [data (lookup-entry config id :property-path)]
      (. builder propertyPath data))
    (.build builder)))


(defn cfn-asset-props-builder
  "The cfn-asset-props-builder function buildes out new instances of 
CfnAssetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-description` |
| `assetExternalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-external-id` |
| `assetHierarchies` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-hierarchies` |
| `assetModelId` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-model-id` |
| `assetName` | java.lang.String | [[cdk.support/lookup-entry]] | `:asset-name` |
| `assetProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:asset-properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAssetProps$Builder.)]
    (when-let [data (lookup-entry config id :asset-description)]
      (. builder assetDescription data))
    (when-let [data (lookup-entry config id :asset-external-id)]
      (. builder assetExternalId data))
    (when-let [data (lookup-entry config id :asset-hierarchies)]
      (. builder assetHierarchies data))
    (when-let [data (lookup-entry config id :asset-model-id)]
      (. builder assetModelId data))
    (when-let [data (lookup-entry config id :asset-name)]
      (. builder assetName data))
    (when-let [data (lookup-entry config id :asset-properties)]
      (. builder assetProperties data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dashboard-builder
  "The cfn-dashboard-builder function buildes out new instances of 
CfnDashboard$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-definition` |
| `dashboardDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-description` |
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |
| `projectId` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDashboard$Builder/create stack id)]
    (when-let [data (lookup-entry config id :dashboard-definition)]
      (. builder dashboardDefinition data))
    (when-let [data (lookup-entry config id :dashboard-description)]
      (. builder dashboardDescription data))
    (when-let [data (lookup-entry config id :dashboard-name)]
      (. builder dashboardName data))
    (when-let [data (lookup-entry config id :project-id)]
      (. builder projectId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-dashboard-props-builder
  "The cfn-dashboard-props-builder function buildes out new instances of 
CfnDashboardProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dashboardDefinition` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-definition` |
| `dashboardDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-description` |
| `dashboardName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dashboard-name` |
| `projectId` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnDashboardProps$Builder.)]
    (when-let [data (lookup-entry config id :dashboard-definition)]
      (. builder dashboardDefinition data))
    (when-let [data (lookup-entry config id :dashboard-description)]
      (. builder dashboardDescription data))
    (when-let [data (lookup-entry config id :dashboard-name)]
      (. builder dashboardName data))
    (when-let [data (lookup-entry config id :project-id)]
      (. builder projectId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-gateway-builder
  "The cfn-gateway-builder function buildes out new instances of 
CfnGateway$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayCapabilitySummaries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gateway-capability-summaries` |
| `gatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-name` |
| `gatewayPlatform` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:gateway-platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGateway$Builder/create stack id)]
    (when-let [data (lookup-entry config id :gateway-capability-summaries)]
      (. builder gatewayCapabilitySummaries data))
    (when-let [data (lookup-entry config id :gateway-name)]
      (. builder gatewayName data))
    (when-let [data (lookup-entry config id :gateway-platform)]
      (. builder gatewayPlatform data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-gateway-gateway-capability-summary-property-builder
  "The cfn-gateway-gateway-capability-summary-property-builder function buildes out new instances of 
CfnGateway$GatewayCapabilitySummaryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilityConfiguration` | java.lang.String | [[cdk.support/lookup-entry]] | `:capability-configuration` |
| `capabilityNamespace` | java.lang.String | [[cdk.support/lookup-entry]] | `:capability-namespace` |"
  [stack id config]
  (let [builder (CfnGateway$GatewayCapabilitySummaryProperty$Builder.)]
    (when-let [data (lookup-entry config id :capability-configuration)]
      (. builder capabilityConfiguration data))
    (when-let [data (lookup-entry config id :capability-namespace)]
      (. builder capabilityNamespace data))
    (.build builder)))


(defn cfn-gateway-gateway-platform-property-builder
  "The cfn-gateway-gateway-platform-property-builder function buildes out new instances of 
CfnGateway$GatewayPlatformProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `greengrass` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:greengrass` |
| `greengrassV2` | software.amazon.awscdk.services.iotsitewise.CfnGateway$GreengrassV2Property | [[cdk.support/lookup-entry]] | `:greengrass-v2` |"
  [stack id config]
  (let [builder (CfnGateway$GatewayPlatformProperty$Builder.)]
    (when-let [data (lookup-entry config id :greengrass)]
      (. builder greengrass data))
    (when-let [data (lookup-entry config id :greengrass-v2)]
      (. builder greengrassV2 data))
    (.build builder)))


(defn cfn-gateway-greengrass-property-builder
  "The cfn-gateway-greengrass-property-builder function buildes out new instances of 
CfnGateway$GreengrassProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-arn` |"
  [stack id config]
  (let [builder (CfnGateway$GreengrassProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-arn)]
      (. builder groupArn data))
    (.build builder)))


(defn cfn-gateway-greengrass-v2-property-builder
  "The cfn-gateway-greengrass-v2-property-builder function buildes out new instances of 
CfnGateway$GreengrassV2Property$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coreDeviceThingName` | java.lang.String | [[cdk.support/lookup-entry]] | `:core-device-thing-name` |"
  [stack id config]
  (let [builder (CfnGateway$GreengrassV2Property$Builder.)]
    (when-let [data (lookup-entry config id :core-device-thing-name)]
      (. builder coreDeviceThingName data))
    (.build builder)))


(defn cfn-gateway-props-builder
  "The cfn-gateway-props-builder function buildes out new instances of 
CfnGatewayProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `gatewayCapabilitySummaries` | java.util.List | [[cdk.support/lookup-entry]] | `:gateway-capability-summaries` |
| `gatewayName` | java.lang.String | [[cdk.support/lookup-entry]] | `:gateway-name` |
| `gatewayPlatform` | software.amazon.awscdk.services.iotsitewise.CfnGateway$GatewayPlatformProperty | [[cdk.support/lookup-entry]] | `:gateway-platform` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGatewayProps$Builder.)]
    (when-let [data (lookup-entry config id :gateway-capability-summaries)]
      (. builder gatewayCapabilitySummaries data))
    (when-let [data (lookup-entry config id :gateway-name)]
      (. builder gatewayName data))
    (when-let [data (lookup-entry config id :gateway-platform)]
      (. builder gatewayPlatform data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-portal-alarms-property-builder
  "The cfn-portal-alarms-property-builder function buildes out new instances of 
CfnPortal$AlarmsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:alarm-role-arn` |
| `notificationLambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-lambda-arn` |"
  [stack id config]
  (let [builder (CfnPortal$AlarmsProperty$Builder.)]
    (when-let [data (lookup-entry config id :alarm-role-arn)]
      (. builder alarmRoleArn data))
    (when-let [data (lookup-entry config id :notification-lambda-arn)]
      (. builder notificationLambdaArn data))
    (.build builder)))


(defn cfn-portal-builder
  "The cfn-portal-builder function buildes out new instances of 
CfnPortal$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.lang.Object | [[cdk.support/lookup-entry]] | `:alarms` |
| `notificationSenderEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-sender-email` |
| `portalAuthMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-auth-mode` |
| `portalContactEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-contact-email` |
| `portalDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-description` |
| `portalName` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPortal$Builder/create stack id)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :notification-sender-email)]
      (. builder notificationSenderEmail data))
    (when-let [data (lookup-entry config id :portal-auth-mode)]
      (. builder portalAuthMode data))
    (when-let [data (lookup-entry config id :portal-contact-email)]
      (. builder portalContactEmail data))
    (when-let [data (lookup-entry config id :portal-description)]
      (. builder portalDescription data))
    (when-let [data (lookup-entry config id :portal-name)]
      (. builder portalName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-portal-props-builder
  "The cfn-portal-props-builder function buildes out new instances of 
CfnPortalProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarms` | java.lang.Object | [[cdk.support/lookup-entry]] | `:alarms` |
| `notificationSenderEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-sender-email` |
| `portalAuthMode` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-auth-mode` |
| `portalContactEmail` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-contact-email` |
| `portalDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-description` |
| `portalName` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-name` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPortalProps$Builder.)]
    (when-let [data (lookup-entry config id :alarms)]
      (. builder alarms data))
    (when-let [data (lookup-entry config id :notification-sender-email)]
      (. builder notificationSenderEmail data))
    (when-let [data (lookup-entry config id :portal-auth-mode)]
      (. builder portalAuthMode data))
    (when-let [data (lookup-entry config id :portal-contact-email)]
      (. builder portalContactEmail data))
    (when-let [data (lookup-entry config id :portal-description)]
      (. builder portalDescription data))
    (when-let [data (lookup-entry config id :portal-name)]
      (. builder portalName data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-project-builder
  "The cfn-project-builder function buildes out new instances of 
CfnProject$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-ids` |
| `portalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-id` |
| `projectDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-description` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProject$Builder/create stack id)]
    (when-let [data (lookup-entry config id :asset-ids)]
      (. builder assetIds data))
    (when-let [data (lookup-entry config id :portal-id)]
      (. builder portalId data))
    (when-let [data (lookup-entry config id :project-description)]
      (. builder projectDescription data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-project-props-builder
  "The cfn-project-props-builder function buildes out new instances of 
CfnProjectProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:asset-ids` |
| `portalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:portal-id` |
| `projectDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-description` |
| `projectName` | java.lang.String | [[cdk.support/lookup-entry]] | `:project-name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnProjectProps$Builder.)]
    (when-let [data (lookup-entry config id :asset-ids)]
      (. builder assetIds data))
    (when-let [data (lookup-entry config id :portal-id)]
      (. builder portalId data))
    (when-let [data (lookup-entry config id :project-description)]
      (. builder projectDescription data))
    (when-let [data (lookup-entry config id :project-name)]
      (. builder projectName data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))