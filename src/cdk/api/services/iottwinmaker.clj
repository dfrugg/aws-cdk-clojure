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


(defn cfn-component-type-builder
  "The cfn-component-type-builder function buildes out new instances of 
CfnComponentType$Builder using the provided configuration.  Each field is set as follows:

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
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |"
  [stack id config]
  (let [builder (CfnComponentType$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-component-type-composite-component-type-property-builder
  "The cfn-component-type-composite-component-type-property-builder function buildes out new instances of 
CfnComponentType$CompositeComponentTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-type-id` |"
  [stack id config]
  (let [builder (CfnComponentType$CompositeComponentTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :component-type-id)]
      (. builder componentTypeId data))
    (.build builder)))


(defn cfn-component-type-data-connector-property-builder
  "The cfn-component-type-data-connector-property-builder function buildes out new instances of 
CfnComponentType$DataConnectorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isNative` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-native` |
| `lambda` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lambda` |"
  [stack id config]
  (let [builder (CfnComponentType$DataConnectorProperty$Builder.)]
    (when-let [data (lookup-entry config id :is-native)]
      (. builder isNative data))
    (when-let [data (lookup-entry config id :lambda)]
      (. builder lambda data))
    (.build builder)))


(defn cfn-component-type-data-type-property-builder
  "The cfn-component-type-data-type-property-builder function buildes out new instances of 
CfnComponentType$DataTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `nestedType` | software.amazon.awscdk.services.iottwinmaker.CfnComponentType$DataTypeProperty | [[cdk.support/lookup-entry]] | `:nested-type` |
| `relationship` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:relationship` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `unitOfMeasure` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-of-measure` |"
  [stack id config]
  (let [builder (CfnComponentType$DataTypeProperty$Builder.)]
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
    (.build builder)))


(defn cfn-component-type-data-value-property-builder
  "The cfn-component-type-data-value-property-builder function buildes out new instances of 
CfnComponentType$DataValueProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |"
  [stack id config]
  (let [builder (CfnComponentType$DataValueProperty$Builder.)]
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
    (.build builder)))


(defn cfn-component-type-error-property-builder
  "The cfn-component-type-error-property-builder function buildes out new instances of 
CfnComponentType$ErrorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | java.lang.String | [[cdk.support/lookup-entry]] | `:code` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |"
  [stack id config]
  (let [builder (CfnComponentType$ErrorProperty$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (.build builder)))


(defn cfn-component-type-function-property-builder
  "The cfn-component-type-function-property-builder function buildes out new instances of 
CfnComponentType$FunctionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `implementedBy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:implemented-by` |
| `requiredProperties` | java.util.List | [[cdk.support/lookup-entry]] | `:required-properties` |
| `scope` | java.lang.String | [[cdk.support/lookup-entry]] | `:scope` |"
  [stack id config]
  (let [builder (CfnComponentType$FunctionProperty$Builder.)]
    (when-let [data (lookup-entry config id :implemented-by)]
      (. builder implementedBy data))
    (when-let [data (lookup-entry config id :required-properties)]
      (. builder requiredProperties data))
    (when-let [data (lookup-entry config id :scope)]
      (. builder scope data))
    (.build builder)))


(defn cfn-component-type-lambda-function-property-builder
  "The cfn-component-type-lambda-function-property-builder function buildes out new instances of 
CfnComponentType$LambdaFunctionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `arn` | java.lang.String | [[cdk.support/lookup-entry]] | `:arn` |"
  [stack id config]
  (let [builder (CfnComponentType$LambdaFunctionProperty$Builder.)]
    (when-let [data (lookup-entry config id :arn)]
      (. builder arn data))
    (.build builder)))


(defn cfn-component-type-property-definition-property-builder
  "The cfn-component-type-property-definition-property-builder function buildes out new instances of 
CfnComponentType$PropertyDefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configurations` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configurations` |
| `dataType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-type` |
| `defaultValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-value` |
| `isExternalId` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-external-id` |
| `isRequiredInEntity` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-required-in-entity` |
| `isStoredExternally` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-stored-externally` |
| `isTimeSeries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-time-series` |"
  [stack id config]
  (let [builder (CfnComponentType$PropertyDefinitionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-component-type-property-group-property-builder
  "The cfn-component-type-property-group-property-builder function buildes out new instances of 
CfnComponentType$PropertyGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupType` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-type` |
| `propertyNames` | java.util.List | [[cdk.support/lookup-entry]] | `:property-names` |"
  [stack id config]
  (let [builder (CfnComponentType$PropertyGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-type)]
      (. builder groupType data))
    (when-let [data (lookup-entry config id :property-names)]
      (. builder propertyNames data))
    (.build builder)))


(defn cfn-component-type-props-builder
  "The cfn-component-type-props-builder function buildes out new instances of 
CfnComponentTypeProps$Builder using the provided configuration.  Each field is set as follows:

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
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |"
  [stack id config]
  (let [builder (CfnComponentTypeProps$Builder.)]
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
    (.build builder)))


(defn cfn-component-type-relationship-property-builder
  "The cfn-component-type-relationship-property-builder function buildes out new instances of 
CfnComponentType$RelationshipProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `relationshipType` | java.lang.String | [[cdk.support/lookup-entry]] | `:relationship-type` |
| `targetComponentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-component-type-id` |"
  [stack id config]
  (let [builder (CfnComponentType$RelationshipProperty$Builder.)]
    (when-let [data (lookup-entry config id :relationship-type)]
      (. builder relationshipType data))
    (when-let [data (lookup-entry config id :target-component-type-id)]
      (. builder targetComponentTypeId data))
    (.build builder)))


(defn cfn-component-type-relationship-value-property-builder
  "The cfn-component-type-relationship-value-property-builder function buildes out new instances of 
CfnComponentType$RelationshipValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetComponentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-component-name` |
| `targetEntityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-entity-id` |"
  [stack id config]
  (let [builder (CfnComponentType$RelationshipValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-component-name)]
      (. builder targetComponentName data))
    (when-let [data (lookup-entry config id :target-entity-id)]
      (. builder targetEntityId data))
    (.build builder)))


(defn cfn-component-type-status-property-builder
  "The cfn-component-type-status-property-builder function buildes out new instances of 
CfnComponentType$StatusProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `error` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:error` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |"
  [stack id config]
  (let [builder (CfnComponentType$StatusProperty$Builder.)]
    (when-let [data (lookup-entry config id :error)]
      (. builder error data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (.build builder)))


(defn cfn-entity-builder
  "The cfn-entity-builder function buildes out new instances of 
CfnEntity$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `components` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:components` |
| `compositeComponents` | java.util.Map | [[cdk.support/lookup-entry]] | `:composite-components` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id` |
| `entityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-name` |
| `parentEntityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-entity-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |"
  [stack id config]
  (let [builder (CfnEntity$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-entity-component-property-builder
  "The cfn-entity-component-property-builder function buildes out new instances of 
CfnEntity$ComponentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `componentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-type-id` |
| `definedIn` | java.lang.String | [[cdk.support/lookup-entry]] | `:defined-in` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `properties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:properties` |
| `propertyGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-groups` |
| `status` | software.amazon.awscdk.services.iottwinmaker.CfnEntity$StatusProperty | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnEntity$ComponentProperty$Builder.)]
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
    (.build builder)))


(defn cfn-entity-composite-component-property-builder
  "The cfn-entity-composite-component-property-builder function buildes out new instances of 
CfnEntity$CompositeComponentProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `componentPath` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-path` |
| `componentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-type-id` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `properties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:properties` |
| `propertyGroups` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:property-groups` |
| `status` | software.amazon.awscdk.services.iottwinmaker.CfnEntity$StatusProperty | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnEntity$CompositeComponentProperty$Builder.)]
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
    (.build builder)))


(defn cfn-entity-data-type-property-builder
  "The cfn-entity-data-type-property-builder function buildes out new instances of 
CfnEntity$DataTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedValues` | java.util.List | [[cdk.support/lookup-entry]] | `:allowed-values` |
| `nestedType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:nested-type` |
| `relationship` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:relationship` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `unitOfMeasure` | java.lang.String | [[cdk.support/lookup-entry]] | `:unit-of-measure` |"
  [stack id config]
  (let [builder (CfnEntity$DataTypeProperty$Builder.)]
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
    (.build builder)))


(defn cfn-entity-data-value-property-builder
  "The cfn-entity-data-value-property-builder function buildes out new instances of 
CfnEntity$DataValueProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |"
  [stack id config]
  (let [builder (CfnEntity$DataValueProperty$Builder.)]
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
    (.build builder)))


(defn cfn-entity-definition-property-builder
  "The cfn-entity-definition-property-builder function buildes out new instances of 
CfnEntity$DefinitionProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `isTimeSeries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:is-time-series` |"
  [stack id config]
  (let [builder (CfnEntity$DefinitionProperty$Builder.)]
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
    (.build builder)))


(defn cfn-entity-error-property-builder
  "The cfn-entity-error-property-builder function buildes out new instances of 
CfnEntity$ErrorProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `code` | java.lang.String | [[cdk.support/lookup-entry]] | `:code` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |"
  [stack id config]
  (let [builder (CfnEntity$ErrorProperty$Builder.)]
    (when-let [data (lookup-entry config id :code)]
      (. builder code data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (.build builder)))


(defn cfn-entity-property-group-property-builder
  "The cfn-entity-property-group-property-builder function buildes out new instances of 
CfnEntity$PropertyGroupProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `groupType` | java.lang.String | [[cdk.support/lookup-entry]] | `:group-type` |
| `propertyNames` | java.util.List | [[cdk.support/lookup-entry]] | `:property-names` |"
  [stack id config]
  (let [builder (CfnEntity$PropertyGroupProperty$Builder.)]
    (when-let [data (lookup-entry config id :group-type)]
      (. builder groupType data))
    (when-let [data (lookup-entry config id :property-names)]
      (. builder propertyNames data))
    (.build builder)))


(defn cfn-entity-property-property-builder
  "The cfn-entity-property-property-builder function buildes out new instances of 
CfnEntity$PropertyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `definition` | java.lang.Object | [[cdk.support/lookup-entry]] | `:definition` |
| `value` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnEntity$PropertyProperty$Builder.)]
    (when-let [data (lookup-entry config id :definition)]
      (. builder definition data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-entity-props-builder
  "The cfn-entity-props-builder function buildes out new instances of 
CfnEntityProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `components` | java.util.Map | [[cdk.support/lookup-entry]] | `:components` |
| `compositeComponents` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:composite-components` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `entityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id` |
| `entityName` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-name` |
| `parentEntityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-entity-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |"
  [stack id config]
  (let [builder (CfnEntityProps$Builder.)]
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
    (.build builder)))


(defn cfn-entity-relationship-property-builder
  "The cfn-entity-relationship-property-builder function buildes out new instances of 
CfnEntity$RelationshipProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `relationshipType` | java.lang.String | [[cdk.support/lookup-entry]] | `:relationship-type` |
| `targetComponentTypeId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-component-type-id` |"
  [stack id config]
  (let [builder (CfnEntity$RelationshipProperty$Builder.)]
    (when-let [data (lookup-entry config id :relationship-type)]
      (. builder relationshipType data))
    (when-let [data (lookup-entry config id :target-component-type-id)]
      (. builder targetComponentTypeId data))
    (.build builder)))


(defn cfn-entity-relationship-value-property-builder
  "The cfn-entity-relationship-value-property-builder function buildes out new instances of 
CfnEntity$RelationshipValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetComponentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-component-name` |
| `targetEntityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-entity-id` |"
  [stack id config]
  (let [builder (CfnEntity$RelationshipValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :target-component-name)]
      (. builder targetComponentName data))
    (when-let [data (lookup-entry config id :target-entity-id)]
      (. builder targetEntityId data))
    (.build builder)))


(defn cfn-entity-status-property-builder
  "The cfn-entity-status-property-builder function buildes out new instances of 
CfnEntity$StatusProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `error` | java.lang.Object | [[cdk.support/lookup-entry]] | `:error` |
| `state` | java.lang.String | [[cdk.support/lookup-entry]] | `:state` |"
  [stack id config]
  (let [builder (CfnEntity$StatusProperty$Builder.)]
    (when-let [data (lookup-entry config id :error)]
      (. builder error data))
    (when-let [data (lookup-entry config id :state)]
      (. builder state data))
    (.build builder)))


(defn cfn-scene-builder
  "The cfn-scene-builder function buildes out new instances of 
CfnScene$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `contentLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-location` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sceneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:scene-id` |
| `sceneMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scene-metadata` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |"
  [stack id config]
  (let [builder (CfnScene$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-scene-props-builder
  "The cfn-scene-props-builder function buildes out new instances of 
CfnSceneProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capabilities` | java.util.List | [[cdk.support/lookup-entry]] | `:capabilities` |
| `contentLocation` | java.lang.String | [[cdk.support/lookup-entry]] | `:content-location` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `sceneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:scene-id` |
| `sceneMetadata` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:scene-metadata` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |"
  [stack id config]
  (let [builder (CfnSceneProps$Builder.)]
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
    (.build builder)))


(defn cfn-sync-job-builder
  "The cfn-sync-job-builder function buildes out new instances of 
CfnSyncJob$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `syncRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-role` |
| `syncSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-source` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |"
  [stack id config]
  (let [builder (CfnSyncJob$Builder/create stack id)]
    (when-let [data (lookup-entry config id :sync-role)]
      (. builder syncRole data))
    (when-let [data (lookup-entry config id :sync-source)]
      (. builder syncSource data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workspace-id)]
      (. builder workspaceId data))
    (.build builder)))


(defn cfn-sync-job-props-builder
  "The cfn-sync-job-props-builder function buildes out new instances of 
CfnSyncJobProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `syncRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-role` |
| `syncSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-source` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |"
  [stack id config]
  (let [builder (CfnSyncJobProps$Builder.)]
    (when-let [data (lookup-entry config id :sync-role)]
      (. builder syncRole data))
    (when-let [data (lookup-entry config id :sync-source)]
      (. builder syncSource data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :workspace-id)]
      (. builder workspaceId data))
    (.build builder)))


(defn cfn-workspace-builder
  "The cfn-workspace-builder function buildes out new instances of 
CfnWorkspace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `s3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-location` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |"
  [stack id config]
  (let [builder (CfnWorkspace$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-workspace-props-builder
  "The cfn-workspace-props-builder function buildes out new instances of 
CfnWorkspaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `role` | java.lang.String | [[cdk.support/lookup-entry]] | `:role` |
| `s3Location` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-location` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `workspaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:workspace-id` |"
  [stack id config]
  (let [builder (CfnWorkspaceProps$Builder.)]
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
    (.build builder)))