(ns cdk.api.services.iottwinmaker
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.iottwinmaker package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.iottwinmaker CfnComponentType$Builder
                                                         CfnComponentType$CompositeComponentTypeProperty$Builder
                                                         CfnComponentType$DataConnectorProperty$Builder
                                                         CfnComponentType$DataTypeProperty$Builder
                                                         CfnComponentType$DataValueProperty$Builder
                                                         CfnComponentType$ErrorProperty$Builder
                                                         CfnComponentType$FunctionProperty$Builder
                                                         CfnComponentType$LambdaFunctionProperty$Builder
                                                         CfnComponentType$PropertyDefinitionProperty$Builder
                                                         CfnComponentType$PropertyGroupProperty$Builder
                                                         CfnComponentType$RelationshipProperty$Builder
                                                         CfnComponentType$RelationshipValueProperty$Builder
                                                         CfnComponentType$StatusProperty$Builder
                                                         CfnComponentTypeProps$Builder
                                                         CfnEntity$Builder
                                                         CfnEntity$ComponentProperty$Builder
                                                         CfnEntity$CompositeComponentProperty$Builder
                                                         CfnEntity$DataTypeProperty$Builder
                                                         CfnEntity$DataValueProperty$Builder
                                                         CfnEntity$DefinitionProperty$Builder
                                                         CfnEntity$ErrorProperty$Builder
                                                         CfnEntity$PropertyGroupProperty$Builder
                                                         CfnEntity$PropertyProperty$Builder
                                                         CfnEntity$RelationshipProperty$Builder
                                                         CfnEntity$RelationshipValueProperty$Builder
                                                         CfnEntity$StatusProperty$Builder
                                                         CfnEntityProps$Builder
                                                         CfnScene$Builder
                                                         CfnSceneProps$Builder
                                                         CfnSyncJob$Builder
                                                         CfnSyncJobProps$Builder
                                                         CfnWorkspace$Builder
                                                         CfnWorkspaceProps$Builder]))


(defn build-cfn-component-type-builder
  "The build-cfn-component-type-builder function updates a CfnComponentType$Builder instance using the provided configuration.
  The function takes the CfnComponentType$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-type-id` |
| `compositeComponentTypes` | java.util.Map | [[cdk.support/lookup-entry]] | `:composite-component-types` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `extendsFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:extends-from` |
| `functions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:functions` |
| `isSingleton` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-singleton` |
| `propertyDefinitions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-definitions` |
| `propertyGroups` | java.util.Map | [[cdk.support/lookup-entry]] | `:property-groups` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |
"
  [^CfnComponentType$Builder builder id config]
  (when-let [data (lookup-entry config id :component-type-id)]
    (. builder componentTypeId data))
  (when-let [data (lookup-entry config id :composite-component-types)]
    (. builder compositeComponentTypes data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :extends-from)]
    (. builder extendsFrom data))
  (when-let [data (lookup-entry config id :functions)]
    (. builder functions data))
  (when-let [data (lookup-entry config id :is-singleton)]
    (. builder isSingleton data))
  (when-let [data (lookup-entry config id :property-definitions)]
    (. builder propertyDefinitions data))
  (when-let [data (lookup-entry config id :property-groups)]
    (. builder propertyGroups data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workspace-id)]
    (. builder workspaceId data))
  (.build builder))


(defn cfn-component-type-builder
  "Creates a  `CfnComponentType$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-component-type-builder (CfnComponentType$Builder/create scope (name id)) id config))


(defn build-cfn-component-type-composite-component-type-property-builder
  "The build-cfn-component-type-composite-component-type-property-builder function updates a CfnComponentType$CompositeComponentTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$CompositeComponentTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-type-id` |
"
  [^CfnComponentType$CompositeComponentTypeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :component-type-id)]
    (. builder componentTypeId data))
  (.build builder))


(defn cfn-component-type-composite-component-type-property-builder
  "Creates a  `CfnComponentType$CompositeComponentTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-composite-component-type-property-builder (new CfnComponentType$CompositeComponentTypeProperty$Builder) id config))


(defn build-cfn-component-type-data-connector-property-builder
  "The build-cfn-component-type-data-connector-property-builder function updates a CfnComponentType$DataConnectorProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$DataConnectorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isNative` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-native` |
| `lambda` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda` |
"
  [^CfnComponentType$DataConnectorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :is-native)]
    (. builder isNative data))
  (when-let [data (lookup-entry config id :lambda)]
    (. builder lambda data))
  (.build builder))


(defn cfn-component-type-data-connector-property-builder
  "Creates a  `CfnComponentType$DataConnectorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-data-connector-property-builder (new CfnComponentType$DataConnectorProperty$Builder) id config))


(defn build-cfn-component-type-data-type-property-builder
  "The build-cfn-component-type-data-type-property-builder function updates a CfnComponentType$DataTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$DataTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `nestedType` | software.amazon.awscdk.services.iottwinmaker.CfnComponentType$DataTypeProperty | [[cdk.support/lookup-entry]] | `:nested-type` |
| `relationship` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:relationship` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `unitOfMeasure` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-of-measure` |
"
  [^CfnComponentType$DataTypeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-values)]
    (. builder allowedValues data))
  (when-let [data (lookup-entry config id :nested-type)]
    (. builder nestedType data))
  (when-let [data (lookup-entry config id :relationship)]
    (. builder relationship data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :unit-of-measure)]
    (. builder unitOfMeasure data))
  (.build builder))


(defn cfn-component-type-data-type-property-builder
  "Creates a  `CfnComponentType$DataTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-data-type-property-builder (new CfnComponentType$DataTypeProperty$Builder) id config))


(defn build-cfn-component-type-data-value-property-builder
  "The build-cfn-component-type-data-value-property-builder function updates a CfnComponentType$DataValueProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$DataValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:double-value` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `integerValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:integer-value` |
| `listValue` | java.util.List | [[cdk.support/lookup-entry]] | `:list-value` |
| `longValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:long-value` |
| `mapValue` | java.util.Map | [[cdk.support/lookup-entry]] | `:map-value` |
| `relationshipValue` | java.lang.Object | [[cdk.support/lookup-entry]] | `:relationship-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
"
  [^CfnComponentType$DataValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :boolean-value)]
    (. builder booleanValue data))
  (when-let [data (lookup-entry config id :double-value)]
    (. builder doubleValue data))
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :integer-value)]
    (. builder integerValue data))
  (when-let [data (lookup-entry config id :list-value)]
    (. builder listValue data))
  (when-let [data (lookup-entry config id :long-value)]
    (. builder longValue data))
  (when-let [data (lookup-entry config id :map-value)]
    (. builder mapValue data))
  (when-let [data (lookup-entry config id :relationship-value)]
    (. builder relationshipValue data))
  (when-let [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn cfn-component-type-data-value-property-builder
  "Creates a  `CfnComponentType$DataValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-data-value-property-builder (new CfnComponentType$DataValueProperty$Builder) id config))


(defn build-cfn-component-type-error-property-builder
  "The build-cfn-component-type-error-property-builder function updates a CfnComponentType$ErrorProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$ErrorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | java.lang.String | [[cdk.support/lookup-entry]] | `:code` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
"
  [^CfnComponentType$ErrorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (.build builder))


(defn cfn-component-type-error-property-builder
  "Creates a  `CfnComponentType$ErrorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-error-property-builder (new CfnComponentType$ErrorProperty$Builder) id config))


(defn build-cfn-component-type-function-property-builder
  "The build-cfn-component-type-function-property-builder function updates a CfnComponentType$FunctionProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$FunctionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `implementedBy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:implemented-by` |
| `requiredProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:required-properties` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |
"
  [^CfnComponentType$FunctionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :implemented-by)]
    (. builder implementedBy data))
  (when-let [data (lookup-entry config id :required-properties)]
    (. builder requiredProperties data))
  (when-let [data (lookup-entry config id :scope)]
    (. builder scope data))
  (.build builder))


(defn cfn-component-type-function-property-builder
  "Creates a  `CfnComponentType$FunctionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-function-property-builder (new CfnComponentType$FunctionProperty$Builder) id config))


(defn build-cfn-component-type-lambda-function-property-builder
  "The build-cfn-component-type-lambda-function-property-builder function updates a CfnComponentType$LambdaFunctionProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$LambdaFunctionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |
"
  [^CfnComponentType$LambdaFunctionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :arn)]
    (. builder arn data))
  (.build builder))


(defn cfn-component-type-lambda-function-property-builder
  "Creates a  `CfnComponentType$LambdaFunctionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-lambda-function-property-builder (new CfnComponentType$LambdaFunctionProperty$Builder) id config))


(defn build-cfn-component-type-property-definition-property-builder
  "The build-cfn-component-type-property-definition-property-builder function updates a CfnComponentType$PropertyDefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$PropertyDefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |
| `dataType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-type` |
| `defaultValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-value` |
| `isExternalId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-external-id` |
| `isRequiredInEntity` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-required-in-entity` |
| `isStoredExternally` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-stored-externally` |
| `isTimeSeries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-time-series` |
"
  [^CfnComponentType$PropertyDefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :configurations)]
    (. builder configurations data))
  (when-let [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :is-external-id)]
    (. builder isExternalId data))
  (when-let [data (lookup-entry config id :is-required-in-entity)]
    (. builder isRequiredInEntity data))
  (when-let [data (lookup-entry config id :is-stored-externally)]
    (. builder isStoredExternally data))
  (when-let [data (lookup-entry config id :is-time-series)]
    (. builder isTimeSeries data))
  (.build builder))


(defn cfn-component-type-property-definition-property-builder
  "Creates a  `CfnComponentType$PropertyDefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-property-definition-property-builder (new CfnComponentType$PropertyDefinitionProperty$Builder) id config))


(defn build-cfn-component-type-property-group-property-builder
  "The build-cfn-component-type-property-group-property-builder function updates a CfnComponentType$PropertyGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$PropertyGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupType` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-type` |
| `propertyNames` | java.util.List | [[cdk.support/lookup-entry]] | `:property-names` |
"
  [^CfnComponentType$PropertyGroupProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :group-type)]
    (. builder groupType data))
  (when-let [data (lookup-entry config id :property-names)]
    (. builder propertyNames data))
  (.build builder))


(defn cfn-component-type-property-group-property-builder
  "Creates a  `CfnComponentType$PropertyGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-property-group-property-builder (new CfnComponentType$PropertyGroupProperty$Builder) id config))


(defn build-cfn-component-type-props-builder
  "The build-cfn-component-type-props-builder function updates a CfnComponentTypeProps$Builder instance using the provided configuration.
  The function takes the CfnComponentTypeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-type-id` |
| `compositeComponentTypes` | java.util.Map | [[cdk.support/lookup-entry]] | `:composite-component-types` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `extendsFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:extends-from` |
| `functions` | java.util.Map | [[cdk.support/lookup-entry]] | `:functions` |
| `isSingleton` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-singleton` |
| `propertyDefinitions` | java.util.Map | [[cdk.support/lookup-entry]] | `:property-definitions` |
| `propertyGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-groups` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |
"
  [^CfnComponentTypeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :component-type-id)]
    (. builder componentTypeId data))
  (when-let [data (lookup-entry config id :composite-component-types)]
    (. builder compositeComponentTypes data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :extends-from)]
    (. builder extendsFrom data))
  (when-let [data (lookup-entry config id :functions)]
    (. builder functions data))
  (when-let [data (lookup-entry config id :is-singleton)]
    (. builder isSingleton data))
  (when-let [data (lookup-entry config id :property-definitions)]
    (. builder propertyDefinitions data))
  (when-let [data (lookup-entry config id :property-groups)]
    (. builder propertyGroups data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workspace-id)]
    (. builder workspaceId data))
  (.build builder))


(defn cfn-component-type-props-builder
  "Creates a  `CfnComponentTypeProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-props-builder (new CfnComponentTypeProps$Builder) id config))


(defn build-cfn-component-type-relationship-property-builder
  "The build-cfn-component-type-relationship-property-builder function updates a CfnComponentType$RelationshipProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$RelationshipProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `relationshipType` | java.lang.String | [[cdk.support/lookup-entry]] | `:relationship-type` |
| `targetComponentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-component-type-id` |
"
  [^CfnComponentType$RelationshipProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :relationship-type)]
    (. builder relationshipType data))
  (when-let [data (lookup-entry config id :target-component-type-id)]
    (. builder targetComponentTypeId data))
  (.build builder))


(defn cfn-component-type-relationship-property-builder
  "Creates a  `CfnComponentType$RelationshipProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-relationship-property-builder (new CfnComponentType$RelationshipProperty$Builder) id config))


(defn build-cfn-component-type-relationship-value-property-builder
  "The build-cfn-component-type-relationship-value-property-builder function updates a CfnComponentType$RelationshipValueProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$RelationshipValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetComponentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-component-name` |
| `targetEntityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-entity-id` |
"
  [^CfnComponentType$RelationshipValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :target-component-name)]
    (. builder targetComponentName data))
  (when-let [data (lookup-entry config id :target-entity-id)]
    (. builder targetEntityId data))
  (.build builder))


(defn cfn-component-type-relationship-value-property-builder
  "Creates a  `CfnComponentType$RelationshipValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-relationship-value-property-builder (new CfnComponentType$RelationshipValueProperty$Builder) id config))


(defn build-cfn-component-type-status-property-builder
  "The build-cfn-component-type-status-property-builder function updates a CfnComponentType$StatusProperty$Builder instance using the provided configuration.
  The function takes the CfnComponentType$StatusProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `error` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
"
  [^CfnComponentType$StatusProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :error)]
    (. builder error data))
  (when-let [data (lookup-entry config id :state)]
    (. builder state data))
  (.build builder))


(defn cfn-component-type-status-property-builder
  "Creates a  `CfnComponentType$StatusProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-component-type-status-property-builder (new CfnComponentType$StatusProperty$Builder) id config))


(defn build-cfn-entity-builder
  "The build-cfn-entity-builder function updates a CfnEntity$Builder instance using the provided configuration.
  The function takes the CfnEntity$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `components` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:components` |
| `compositeComponents` | java.util.Map | [[cdk.support/lookup-entry]] | `:composite-components` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id` |
| `entityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-name` |
| `parentEntityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-entity-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |
"
  [^CfnEntity$Builder builder id config]
  (when-let [data (lookup-entry config id :components)]
    (. builder components data))
  (when-let [data (lookup-entry config id :composite-components)]
    (. builder compositeComponents data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :entity-id)]
    (. builder entityId data))
  (when-let [data (lookup-entry config id :entity-name)]
    (. builder entityName data))
  (when-let [data (lookup-entry config id :parent-entity-id)]
    (. builder parentEntityId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workspace-id)]
    (. builder workspaceId data))
  (.build builder))


(defn cfn-entity-builder
  "Creates a  `CfnEntity$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-entity-builder (CfnEntity$Builder/create scope (name id)) id config))


(defn build-cfn-entity-component-property-builder
  "The build-cfn-entity-component-property-builder function updates a CfnEntity$ComponentProperty$Builder instance using the provided configuration.
  The function takes the CfnEntity$ComponentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `componentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-type-id` |
| `definedIn` | java.lang.String | [[cdk.support/lookup-entry]] | `:defined-in` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `properties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:properties` |
| `propertyGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-groups` |
| `status` | software.amazon.awscdk.services.iottwinmaker.CfnEntity$StatusProperty | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnEntity$ComponentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :component-name)]
    (. builder componentName data))
  (when-let [data (lookup-entry config id :component-type-id)]
    (. builder componentTypeId data))
  (when-let [data (lookup-entry config id :defined-in)]
    (. builder definedIn data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :property-groups)]
    (. builder propertyGroups data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-entity-component-property-builder
  "Creates a  `CfnEntity$ComponentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-component-property-builder (new CfnEntity$ComponentProperty$Builder) id config))


(defn build-cfn-entity-composite-component-property-builder
  "The build-cfn-entity-composite-component-property-builder function updates a CfnEntity$CompositeComponentProperty$Builder instance using the provided configuration.
  The function takes the CfnEntity$CompositeComponentProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `componentPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-path` |
| `componentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-type-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `properties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:properties` |
| `propertyGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-groups` |
| `status` | software.amazon.awscdk.services.iottwinmaker.CfnEntity$StatusProperty | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnEntity$CompositeComponentProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :component-name)]
    (. builder componentName data))
  (when-let [data (lookup-entry config id :component-path)]
    (. builder componentPath data))
  (when-let [data (lookup-entry config id :component-type-id)]
    (. builder componentTypeId data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :property-groups)]
    (. builder propertyGroups data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-entity-composite-component-property-builder
  "Creates a  `CfnEntity$CompositeComponentProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-composite-component-property-builder (new CfnEntity$CompositeComponentProperty$Builder) id config))


(defn build-cfn-entity-data-type-property-builder
  "The build-cfn-entity-data-type-property-builder function updates a CfnEntity$DataTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnEntity$DataTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValues` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `nestedType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:nested-type` |
| `relationship` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:relationship` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `unitOfMeasure` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-of-measure` |
"
  [^CfnEntity$DataTypeProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :allowed-values)]
    (. builder allowedValues data))
  (when-let [data (lookup-entry config id :nested-type)]
    (. builder nestedType data))
  (when-let [data (lookup-entry config id :relationship)]
    (. builder relationship data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :unit-of-measure)]
    (. builder unitOfMeasure data))
  (.build builder))


(defn cfn-entity-data-type-property-builder
  "Creates a  `CfnEntity$DataTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-data-type-property-builder (new CfnEntity$DataTypeProperty$Builder) id config))


(defn build-cfn-entity-data-value-property-builder
  "The build-cfn-entity-data-value-property-builder function updates a CfnEntity$DataValueProperty$Builder instance using the provided configuration.
  The function takes the CfnEntity$DataValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `booleanValue` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:boolean-value` |
| `doubleValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:double-value` |
| `expression` | java.lang.String | [[cdk.support/lookup-entry]] | `:expression` |
| `integerValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:integer-value` |
| `listValue` | java.util.List | [[cdk.support/lookup-entry]] | `:list-value` |
| `longValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:long-value` |
| `mapValue` | java.util.Map | [[cdk.support/lookup-entry]] | `:map-value` |
| `relationshipValue` | java.lang.Object | [[cdk.support/lookup-entry]] | `:relationship-value` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
"
  [^CfnEntity$DataValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :boolean-value)]
    (. builder booleanValue data))
  (when-let [data (lookup-entry config id :double-value)]
    (. builder doubleValue data))
  (when-let [data (lookup-entry config id :expression)]
    (. builder expression data))
  (when-let [data (lookup-entry config id :integer-value)]
    (. builder integerValue data))
  (when-let [data (lookup-entry config id :list-value)]
    (. builder listValue data))
  (when-let [data (lookup-entry config id :long-value)]
    (. builder longValue data))
  (when-let [data (lookup-entry config id :map-value)]
    (. builder mapValue data))
  (when-let [data (lookup-entry config id :relationship-value)]
    (. builder relationshipValue data))
  (when-let [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (.build builder))


(defn cfn-entity-data-value-property-builder
  "Creates a  `CfnEntity$DataValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-data-value-property-builder (new CfnEntity$DataValueProperty$Builder) id config))


(defn build-cfn-entity-definition-property-builder
  "The build-cfn-entity-definition-property-builder function updates a CfnEntity$DefinitionProperty$Builder instance using the provided configuration.
  The function takes the CfnEntity$DefinitionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `dataType` | software.amazon.awscdk.services.iottwinmaker.CfnEntity$DataTypeProperty | [[cdk.support/lookup-entry]] | `:data-type` |
| `defaultValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-value` |
| `isExternalId` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-external-id` |
| `isFinal` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-final` |
| `isImported` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-imported` |
| `isInherited` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-inherited` |
| `isRequiredInEntity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-required-in-entity` |
| `isStoredExternally` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-stored-externally` |
| `isTimeSeries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-time-series` |
"
  [^CfnEntity$DefinitionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-let [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :is-external-id)]
    (. builder isExternalId data))
  (when-let [data (lookup-entry config id :is-final)]
    (. builder isFinal data))
  (when-let [data (lookup-entry config id :is-imported)]
    (. builder isImported data))
  (when-let [data (lookup-entry config id :is-inherited)]
    (. builder isInherited data))
  (when-let [data (lookup-entry config id :is-required-in-entity)]
    (. builder isRequiredInEntity data))
  (when-let [data (lookup-entry config id :is-stored-externally)]
    (. builder isStoredExternally data))
  (when-let [data (lookup-entry config id :is-time-series)]
    (. builder isTimeSeries data))
  (.build builder))


(defn cfn-entity-definition-property-builder
  "Creates a  `CfnEntity$DefinitionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-definition-property-builder (new CfnEntity$DefinitionProperty$Builder) id config))


(defn build-cfn-entity-error-property-builder
  "The build-cfn-entity-error-property-builder function updates a CfnEntity$ErrorProperty$Builder instance using the provided configuration.
  The function takes the CfnEntity$ErrorProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | java.lang.String | [[cdk.support/lookup-entry]] | `:code` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
"
  [^CfnEntity$ErrorProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :code)]
    (. builder code data))
  (when-let [data (lookup-entry config id :message)]
    (. builder message data))
  (.build builder))


(defn cfn-entity-error-property-builder
  "Creates a  `CfnEntity$ErrorProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-error-property-builder (new CfnEntity$ErrorProperty$Builder) id config))


(defn build-cfn-entity-property-group-property-builder
  "The build-cfn-entity-property-group-property-builder function updates a CfnEntity$PropertyGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnEntity$PropertyGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupType` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-type` |
| `propertyNames` | java.util.List | [[cdk.support/lookup-entry]] | `:property-names` |
"
  [^CfnEntity$PropertyGroupProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :group-type)]
    (. builder groupType data))
  (when-let [data (lookup-entry config id :property-names)]
    (. builder propertyNames data))
  (.build builder))


(defn cfn-entity-property-group-property-builder
  "Creates a  `CfnEntity$PropertyGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-property-group-property-builder (new CfnEntity$PropertyGroupProperty$Builder) id config))


(defn build-cfn-entity-property-property-builder
  "The build-cfn-entity-property-property-builder function updates a CfnEntity$PropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnEntity$PropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition` |
| `value` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnEntity$PropertyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :definition)]
    (. builder definition data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-entity-property-property-builder
  "Creates a  `CfnEntity$PropertyProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-property-property-builder (new CfnEntity$PropertyProperty$Builder) id config))


(defn build-cfn-entity-props-builder
  "The build-cfn-entity-props-builder function updates a CfnEntityProps$Builder instance using the provided configuration.
  The function takes the CfnEntityProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `components` | java.util.Map | [[cdk.support/lookup-entry]] | `:components` |
| `compositeComponents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:composite-components` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id` |
| `entityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-name` |
| `parentEntityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-entity-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |
"
  [^CfnEntityProps$Builder builder id config]
  (when-let [data (lookup-entry config id :components)]
    (. builder components data))
  (when-let [data (lookup-entry config id :composite-components)]
    (. builder compositeComponents data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :entity-id)]
    (. builder entityId data))
  (when-let [data (lookup-entry config id :entity-name)]
    (. builder entityName data))
  (when-let [data (lookup-entry config id :parent-entity-id)]
    (. builder parentEntityId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workspace-id)]
    (. builder workspaceId data))
  (.build builder))


(defn cfn-entity-props-builder
  "Creates a  `CfnEntityProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-props-builder (new CfnEntityProps$Builder) id config))


(defn build-cfn-entity-relationship-property-builder
  "The build-cfn-entity-relationship-property-builder function updates a CfnEntity$RelationshipProperty$Builder instance using the provided configuration.
  The function takes the CfnEntity$RelationshipProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `relationshipType` | java.lang.String | [[cdk.support/lookup-entry]] | `:relationship-type` |
| `targetComponentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-component-type-id` |
"
  [^CfnEntity$RelationshipProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :relationship-type)]
    (. builder relationshipType data))
  (when-let [data (lookup-entry config id :target-component-type-id)]
    (. builder targetComponentTypeId data))
  (.build builder))


(defn cfn-entity-relationship-property-builder
  "Creates a  `CfnEntity$RelationshipProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-relationship-property-builder (new CfnEntity$RelationshipProperty$Builder) id config))


(defn build-cfn-entity-relationship-value-property-builder
  "The build-cfn-entity-relationship-value-property-builder function updates a CfnEntity$RelationshipValueProperty$Builder instance using the provided configuration.
  The function takes the CfnEntity$RelationshipValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetComponentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-component-name` |
| `targetEntityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-entity-id` |
"
  [^CfnEntity$RelationshipValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :target-component-name)]
    (. builder targetComponentName data))
  (when-let [data (lookup-entry config id :target-entity-id)]
    (. builder targetEntityId data))
  (.build builder))


(defn cfn-entity-relationship-value-property-builder
  "Creates a  `CfnEntity$RelationshipValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-relationship-value-property-builder (new CfnEntity$RelationshipValueProperty$Builder) id config))


(defn build-cfn-entity-status-property-builder
  "The build-cfn-entity-status-property-builder function updates a CfnEntity$StatusProperty$Builder instance using the provided configuration.
  The function takes the CfnEntity$StatusProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `error` | java.lang.Object | [[cdk.support/lookup-entry]] | `:error` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |
"
  [^CfnEntity$StatusProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :error)]
    (. builder error data))
  (when-let [data (lookup-entry config id :state)]
    (. builder state data))
  (.build builder))


(defn cfn-entity-status-property-builder
  "Creates a  `CfnEntity$StatusProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-entity-status-property-builder (new CfnEntity$StatusProperty$Builder) id config))


(defn build-cfn-scene-builder
  "The build-cfn-scene-builder function updates a CfnScene$Builder instance using the provided configuration.
  The function takes the CfnScene$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `contentLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-location` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sceneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:scene-id` |
| `sceneMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scene-metadata` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |
"
  [^CfnScene$Builder builder id config]
  (when-let [data (lookup-entry config id :capabilities)]
    (. builder capabilities data))
  (when-let [data (lookup-entry config id :content-location)]
    (. builder contentLocation data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :scene-id)]
    (. builder sceneId data))
  (when-let [data (lookup-entry config id :scene-metadata)]
    (. builder sceneMetadata data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workspace-id)]
    (. builder workspaceId data))
  (.build builder))


(defn cfn-scene-builder
  "Creates a  `CfnScene$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-scene-builder (CfnScene$Builder/create scope (name id)) id config))


(defn build-cfn-scene-props-builder
  "The build-cfn-scene-props-builder function updates a CfnSceneProps$Builder instance using the provided configuration.
  The function takes the CfnSceneProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `contentLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-location` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sceneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:scene-id` |
| `sceneMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scene-metadata` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |
"
  [^CfnSceneProps$Builder builder id config]
  (when-let [data (lookup-entry config id :capabilities)]
    (. builder capabilities data))
  (when-let [data (lookup-entry config id :content-location)]
    (. builder contentLocation data))
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :scene-id)]
    (. builder sceneId data))
  (when-let [data (lookup-entry config id :scene-metadata)]
    (. builder sceneMetadata data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workspace-id)]
    (. builder workspaceId data))
  (.build builder))


(defn cfn-scene-props-builder
  "Creates a  `CfnSceneProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-scene-props-builder (new CfnSceneProps$Builder) id config))


(defn build-cfn-sync-job-builder
  "The build-cfn-sync-job-builder function updates a CfnSyncJob$Builder instance using the provided configuration.
  The function takes the CfnSyncJob$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `syncRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-role` |
| `syncSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-source` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |
"
  [^CfnSyncJob$Builder builder id config]
  (when-let [data (lookup-entry config id :sync-role)]
    (. builder syncRole data))
  (when-let [data (lookup-entry config id :sync-source)]
    (. builder syncSource data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workspace-id)]
    (. builder workspaceId data))
  (.build builder))


(defn cfn-sync-job-builder
  "Creates a  `CfnSyncJob$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-sync-job-builder (CfnSyncJob$Builder/create scope (name id)) id config))


(defn build-cfn-sync-job-props-builder
  "The build-cfn-sync-job-props-builder function updates a CfnSyncJobProps$Builder instance using the provided configuration.
  The function takes the CfnSyncJobProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `syncRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-role` |
| `syncSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-source` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |
"
  [^CfnSyncJobProps$Builder builder id config]
  (when-let [data (lookup-entry config id :sync-role)]
    (. builder syncRole data))
  (when-let [data (lookup-entry config id :sync-source)]
    (. builder syncSource data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workspace-id)]
    (. builder workspaceId data))
  (.build builder))


(defn cfn-sync-job-props-builder
  "Creates a  `CfnSyncJobProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-sync-job-props-builder (new CfnSyncJobProps$Builder) id config))


(defn build-cfn-workspace-builder
  "The build-cfn-workspace-builder function updates a CfnWorkspace$Builder instance using the provided configuration.
  The function takes the CfnWorkspace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `s3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-location` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |
"
  [^CfnWorkspace$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workspace-id)]
    (. builder workspaceId data))
  (.build builder))


(defn cfn-workspace-builder
  "Creates a  `CfnWorkspace$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-workspace-builder (CfnWorkspace$Builder/create scope (name id)) id config))


(defn build-cfn-workspace-props-builder
  "The build-cfn-workspace-props-builder function updates a CfnWorkspaceProps$Builder instance using the provided configuration.
  The function takes the CfnWorkspaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `s3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-location` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |
"
  [^CfnWorkspaceProps$Builder builder id config]
  (when-let [data (lookup-entry config id :description)]
    (. builder description data))
  (when-let [data (lookup-entry config id :role)]
    (. builder role data))
  (when-let [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :workspace-id)]
    (. builder workspaceId data))
  (.build builder))


(defn cfn-workspace-props-builder
  "Creates a  `CfnWorkspaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-workspace-props-builder (new CfnWorkspaceProps$Builder) id config))