(ns cdk.api.services.amplifyuibuilder
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.amplifyuibuilder package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.amplifyuibuilder CfnComponent$ActionParametersProperty$Builder
                                                             CfnComponent$Builder
                                                             CfnComponent$ComponentBindingPropertiesValuePropertiesProperty$Builder
                                                             CfnComponent$ComponentBindingPropertiesValueProperty$Builder
                                                             CfnComponent$ComponentChildProperty$Builder
                                                             CfnComponent$ComponentConditionPropertyProperty$Builder
                                                             CfnComponent$ComponentDataConfigurationProperty$Builder
                                                             CfnComponent$ComponentEventProperty$Builder
                                                             CfnComponent$ComponentPropertyBindingPropertiesProperty$Builder
                                                             CfnComponent$ComponentPropertyProperty$Builder
                                                             CfnComponent$ComponentVariantProperty$Builder
                                                             CfnComponent$FormBindingElementProperty$Builder
                                                             CfnComponent$MutationActionSetStateParameterProperty$Builder
                                                             CfnComponent$PredicateProperty$Builder
                                                             CfnComponent$SortPropertyProperty$Builder
                                                             CfnComponentProps$Builder
                                                             CfnForm$Builder
                                                             CfnForm$FieldConfigProperty$Builder
                                                             CfnForm$FieldInputConfigProperty$Builder
                                                             CfnForm$FieldPositionProperty$Builder
                                                             CfnForm$FieldValidationConfigurationProperty$Builder
                                                             CfnForm$FileUploaderFieldConfigProperty$Builder
                                                             CfnForm$FormButtonProperty$Builder
                                                             CfnForm$FormCTAProperty$Builder
                                                             CfnForm$FormDataTypeConfigProperty$Builder
                                                             CfnForm$FormInputBindingPropertiesValuePropertiesProperty$Builder
                                                             CfnForm$FormInputBindingPropertiesValueProperty$Builder
                                                             CfnForm$FormInputValuePropertyBindingPropertiesProperty$Builder
                                                             CfnForm$FormInputValuePropertyProperty$Builder
                                                             CfnForm$FormStyleConfigProperty$Builder
                                                             CfnForm$FormStyleProperty$Builder
                                                             CfnForm$SectionalElementProperty$Builder
                                                             CfnForm$ValueMappingProperty$Builder
                                                             CfnForm$ValueMappingsProperty$Builder
                                                             CfnFormProps$Builder
                                                             CfnTheme$Builder
                                                             CfnTheme$ThemeValueProperty$Builder
                                                             CfnTheme$ThemeValuesProperty$Builder
                                                             CfnThemeProps$Builder]))


(defn build-cfn-component-action-parameters-property-builder
  "The build-cfn-component-action-parameters-property-builder function updates a CfnComponent$ActionParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$ActionParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anchor` | software.amazon.awscdk.services.amplifyuibuilder.CfnComponent$ComponentPropertyProperty | [[cdk.support/lookup-entry]] | `:anchor` |
| `fields` | java.util.Map | [[cdk.support/lookup-entry]] | `:fields` |
| `global` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:global` |
| `id` | software.amazon.awscdk.services.amplifyuibuilder.CfnComponent$ComponentPropertyProperty | [[cdk.support/lookup-entry]] | `:id` |
| `model` | java.lang.String | [[cdk.support/lookup-entry]] | `:model` |
| `state` | software.amazon.awscdk.services.amplifyuibuilder.CfnComponent$MutationActionSetStateParameterProperty | [[cdk.support/lookup-entry]] | `:state` |
| `target` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:target` |
| `type` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:type` |
| `url` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:url` |
"
  [^CfnComponent$ActionParametersProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :anchor)]
    (. builder anchor data))
  (when-let [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-let [data (lookup-entry config id :global)]
    (. builder global data))
  (when-let [data (lookup-entry config id :id)]
    (. builder id data))
  (when-let [data (lookup-entry config id :model)]
    (. builder model data))
  (when-let [data (lookup-entry config id :state)]
    (. builder state data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :url)]
    (. builder url data))
  (.build builder))


(defn build-cfn-component-builder
  "The build-cfn-component-builder function updates a CfnComponent$Builder instance using the provided configuration.
  The function takes the CfnComponent$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appId` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id` |
| `bindingProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:binding-properties` |
| `children` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:children` |
| `collectionProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:collection-properties` |
| `componentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-type` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `events` | java.util.Map | [[cdk.support/lookup-entry]] | `:events` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overrides` | java.lang.Object | [[cdk.support/lookup-entry]] | `:overrides` |
| `properties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:properties` |
| `schemaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version` |
| `sourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `variants` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variants` |
"
  [^CfnComponent$Builder builder id config]
  (when-let [data (lookup-entry config id :app-id)]
    (. builder appId data))
  (when-let [data (lookup-entry config id :binding-properties)]
    (. builder bindingProperties data))
  (when-let [data (lookup-entry config id :children)]
    (. builder children data))
  (when-let [data (lookup-entry config id :collection-properties)]
    (. builder collectionProperties data))
  (when-let [data (lookup-entry config id :component-type)]
    (. builder componentType data))
  (when-let [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :overrides)]
    (. builder overrides data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :schema-version)]
    (. builder schemaVersion data))
  (when-let [data (lookup-entry config id :source-id)]
    (. builder sourceId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variants)]
    (. builder variants data))
  (.build builder))


(defn build-cfn-component-component-binding-properties-value-properties-property-builder
  "The build-cfn-component-component-binding-properties-value-properties-property-builder function updates a CfnComponent$ComponentBindingPropertiesValuePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$ComponentBindingPropertiesValuePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket` |
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `model` | java.lang.String | [[cdk.support/lookup-entry]] | `:model` |
| `predicates` | java.util.List | [[cdk.support/lookup-entry]] | `:predicates` |
| `slotName` | java.lang.String | [[cdk.support/lookup-entry]] | `:slot-name` |
| `userAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-attribute` |
"
  [^CfnComponent$ComponentBindingPropertiesValuePropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :bucket)]
    (. builder bucket data))
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :field)]
    (. builder field data))
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :model)]
    (. builder model data))
  (when-let [data (lookup-entry config id :predicates)]
    (. builder predicates data))
  (when-let [data (lookup-entry config id :slot-name)]
    (. builder slotName data))
  (when-let [data (lookup-entry config id :user-attribute)]
    (. builder userAttribute data))
  (.build builder))


(defn build-cfn-component-component-binding-properties-value-property-builder
  "The build-cfn-component-component-binding-properties-value-property-builder function updates a CfnComponent$ComponentBindingPropertiesValueProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$ComponentBindingPropertiesValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bindingProperties` | software.amazon.awscdk.services.amplifyuibuilder.CfnComponent$ComponentBindingPropertiesValuePropertiesProperty | [[cdk.support/lookup-entry]] | `:binding-properties` |
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnComponent$ComponentBindingPropertiesValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :binding-properties)]
    (. builder bindingProperties data))
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-component-component-child-property-builder
  "The build-cfn-component-component-child-property-builder function updates a CfnComponent$ComponentChildProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$ComponentChildProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `children` | java.util.List | [[cdk.support/lookup-entry]] | `:children` |
| `componentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-type` |
| `events` | java.util.Map | [[cdk.support/lookup-entry]] | `:events` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `sourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-id` |
"
  [^CfnComponent$ComponentChildProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :children)]
    (. builder children data))
  (when-let [data (lookup-entry config id :component-type)]
    (. builder componentType data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :source-id)]
    (. builder sourceId data))
  (.build builder))


(defn build-cfn-component-component-condition-property-property-builder
  "The build-cfn-component-component-condition-property-property-builder function updates a CfnComponent$ComponentConditionPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$ComponentConditionPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `elseValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:else-value` |
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `operand` | java.lang.String | [[cdk.support/lookup-entry]] | `:operand` |
| `operandType` | java.lang.String | [[cdk.support/lookup-entry]] | `:operand-type` |
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |
| `property` | java.lang.String | [[cdk.support/lookup-entry]] | `:property` |
| `then` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:then` |
"
  [^CfnComponent$ComponentConditionPropertyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :else-value)]
    (. builder elseValue data))
  (when-let [data (lookup-entry config id :field)]
    (. builder field data))
  (when-let [data (lookup-entry config id :operand)]
    (. builder operand data))
  (when-let [data (lookup-entry config id :operand-type)]
    (. builder operandType data))
  (when-let [data (lookup-entry config id :operator)]
    (. builder operator data))
  (when-let [data (lookup-entry config id :property)]
    (. builder property data))
  (when-let [data (lookup-entry config id :then)]
    (. builder then data))
  (.build builder))


(defn build-cfn-component-component-data-configuration-property-builder
  "The build-cfn-component-component-data-configuration-property-builder function updates a CfnComponent$ComponentDataConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$ComponentDataConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identifiers` | java.util.List | [[cdk.support/lookup-entry]] | `:identifiers` |
| `model` | java.lang.String | [[cdk.support/lookup-entry]] | `:model` |
| `predicate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:predicate` |
| `sort` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sort` |
"
  [^CfnComponent$ComponentDataConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :identifiers)]
    (. builder identifiers data))
  (when-let [data (lookup-entry config id :model)]
    (. builder model data))
  (when-let [data (lookup-entry config id :predicate)]
    (. builder predicate data))
  (when-let [data (lookup-entry config id :sort)]
    (. builder sort data))
  (.build builder))


(defn build-cfn-component-component-event-property-builder
  "The build-cfn-component-component-event-property-builder function updates a CfnComponent$ComponentEventProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$ComponentEventProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `action` | java.lang.String | [[cdk.support/lookup-entry]] | `:action` |
| `bindingEvent` | java.lang.String | [[cdk.support/lookup-entry]] | `:binding-event` |
| `parameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^CfnComponent$ComponentEventProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :action)]
    (. builder action data))
  (when-let [data (lookup-entry config id :binding-event)]
    (. builder bindingEvent data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn build-cfn-component-component-property-binding-properties-property-builder
  "The build-cfn-component-component-property-binding-properties-property-builder function updates a CfnComponent$ComponentPropertyBindingPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$ComponentPropertyBindingPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `property` | java.lang.String | [[cdk.support/lookup-entry]] | `:property` |
"
  [^CfnComponent$ComponentPropertyBindingPropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field)]
    (. builder field data))
  (when-let [data (lookup-entry config id :property)]
    (. builder property data))
  (.build builder))


(defn build-cfn-component-component-property-property-builder
  "The build-cfn-component-component-property-property-builder function updates a CfnComponent$ComponentPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$ComponentPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bindingProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:binding-properties` |
| `bindings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:bindings` |
| `collectionBindingProperties` | software.amazon.awscdk.services.amplifyuibuilder.CfnComponent$ComponentPropertyBindingPropertiesProperty | [[cdk.support/lookup-entry]] | `:collection-binding-properties` |
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `concat` | java.util.List | [[cdk.support/lookup-entry]] | `:concat` |
| `condition` | software.amazon.awscdk.services.amplifyuibuilder.CfnComponent$ComponentConditionPropertyProperty | [[cdk.support/lookup-entry]] | `:condition` |
| `configured` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configured` |
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `event` | java.lang.String | [[cdk.support/lookup-entry]] | `:event` |
| `importedValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:imported-value` |
| `model` | java.lang.String | [[cdk.support/lookup-entry]] | `:model` |
| `property` | java.lang.String | [[cdk.support/lookup-entry]] | `:property` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `userAttribute` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-attribute` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnComponent$ComponentPropertyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :binding-properties)]
    (. builder bindingProperties data))
  (when-let [data (lookup-entry config id :bindings)]
    (. builder bindings data))
  (when-let [data (lookup-entry config id :collection-binding-properties)]
    (. builder collectionBindingProperties data))
  (when-let [data (lookup-entry config id :component-name)]
    (. builder componentName data))
  (when-let [data (lookup-entry config id :concat)]
    (. builder concat data))
  (when-let [data (lookup-entry config id :condition)]
    (. builder condition data))
  (when-let [data (lookup-entry config id :configured)]
    (. builder configured data))
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :event)]
    (. builder event data))
  (when-let [data (lookup-entry config id :imported-value)]
    (. builder importedValue data))
  (when-let [data (lookup-entry config id :model)]
    (. builder model data))
  (when-let [data (lookup-entry config id :property)]
    (. builder property data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :user-attribute)]
    (. builder userAttribute data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-component-component-variant-property-builder
  "The build-cfn-component-component-variant-property-builder function updates a CfnComponent$ComponentVariantProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$ComponentVariantProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `overrides` | java.lang.Object | [[cdk.support/lookup-entry]] | `:overrides` |
| `variantValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variant-values` |
"
  [^CfnComponent$ComponentVariantProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :overrides)]
    (. builder overrides data))
  (when-let [data (lookup-entry config id :variant-values)]
    (. builder variantValues data))
  (.build builder))


(defn build-cfn-component-form-binding-element-property-builder
  "The build-cfn-component-form-binding-element-property-builder function updates a CfnComponent$FormBindingElementProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$FormBindingElementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `element` | java.lang.String | [[cdk.support/lookup-entry]] | `:element` |
| `property` | java.lang.String | [[cdk.support/lookup-entry]] | `:property` |
"
  [^CfnComponent$FormBindingElementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :element)]
    (. builder element data))
  (when-let [data (lookup-entry config id :property)]
    (. builder property data))
  (.build builder))


(defn build-cfn-component-mutation-action-set-state-parameter-property-builder
  "The build-cfn-component-mutation-action-set-state-parameter-property-builder function updates a CfnComponent$MutationActionSetStateParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$MutationActionSetStateParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `componentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-name` |
| `property` | java.lang.String | [[cdk.support/lookup-entry]] | `:property` |
| `set` | software.amazon.awscdk.services.amplifyuibuilder.CfnComponent$ComponentPropertyProperty | [[cdk.support/lookup-entry]] | `:set` |
"
  [^CfnComponent$MutationActionSetStateParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :component-name)]
    (. builder componentName data))
  (when-let [data (lookup-entry config id :property)]
    (. builder property data))
  (when-let [data (lookup-entry config id :set)]
    (. builder set data))
  (.build builder))


(defn build-cfn-component-predicate-property-builder
  "The build-cfn-component-predicate-property-builder function updates a CfnComponent$PredicateProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$PredicateProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `and` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:and` |
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `operand` | java.lang.String | [[cdk.support/lookup-entry]] | `:operand` |
| `operandType` | java.lang.String | [[cdk.support/lookup-entry]] | `:operand-type` |
| `operator` | java.lang.String | [[cdk.support/lookup-entry]] | `:operator` |
| `or` | java.util.List | [[cdk.support/lookup-entry]] | `:or` |
"
  [^CfnComponent$PredicateProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :and)]
    (. builder and data))
  (when-let [data (lookup-entry config id :field)]
    (. builder field data))
  (when-let [data (lookup-entry config id :operand)]
    (. builder operand data))
  (when-let [data (lookup-entry config id :operand-type)]
    (. builder operandType data))
  (when-let [data (lookup-entry config id :operator)]
    (. builder operator data))
  (when-let [data (lookup-entry config id :or)]
    (. builder or data))
  (.build builder))


(defn build-cfn-component-props-builder
  "The build-cfn-component-props-builder function updates a CfnComponentProps$Builder instance using the provided configuration.
  The function takes the CfnComponentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appId` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id` |
| `bindingProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:binding-properties` |
| `children` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:children` |
| `collectionProperties` | java.util.Map | [[cdk.support/lookup-entry]] | `:collection-properties` |
| `componentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:component-type` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `events` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:events` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overrides` | java.lang.Object | [[cdk.support/lookup-entry]] | `:overrides` |
| `properties` | java.util.Map | [[cdk.support/lookup-entry]] | `:properties` |
| `schemaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version` |
| `sourceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-id` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `variants` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:variants` |
"
  [^CfnComponentProps$Builder builder id config]
  (when-let [data (lookup-entry config id :app-id)]
    (. builder appId data))
  (when-let [data (lookup-entry config id :binding-properties)]
    (. builder bindingProperties data))
  (when-let [data (lookup-entry config id :children)]
    (. builder children data))
  (when-let [data (lookup-entry config id :collection-properties)]
    (. builder collectionProperties data))
  (when-let [data (lookup-entry config id :component-type)]
    (. builder componentType data))
  (when-let [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-let [data (lookup-entry config id :events)]
    (. builder events data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :overrides)]
    (. builder overrides data))
  (when-let [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-let [data (lookup-entry config id :schema-version)]
    (. builder schemaVersion data))
  (when-let [data (lookup-entry config id :source-id)]
    (. builder sourceId data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :variants)]
    (. builder variants data))
  (.build builder))


(defn build-cfn-component-sort-property-property-builder
  "The build-cfn-component-sort-property-property-builder function updates a CfnComponent$SortPropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnComponent$SortPropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `direction` | java.lang.String | [[cdk.support/lookup-entry]] | `:direction` |
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
"
  [^CfnComponent$SortPropertyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :direction)]
    (. builder direction data))
  (when-let [data (lookup-entry config id :field)]
    (. builder field data))
  (.build builder))


(defn build-cfn-form-builder
  "The build-cfn-form-builder function updates a CfnForm$Builder instance using the provided configuration.
  The function takes the CfnForm$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appId` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id` |
| `cta` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cta` |
| `dataType` | software.amazon.awscdk.services.amplifyuibuilder.CfnForm$FormDataTypeConfigProperty | [[cdk.support/lookup-entry]] | `:data-type` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `fields` | java.util.Map | [[cdk.support/lookup-entry]] | `:fields` |
| `formActionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:form-action-type` |
| `labelDecorator` | java.lang.String | [[cdk.support/lookup-entry]] | `:label-decorator` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schemaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version` |
| `sectionalElements` | java.util.Map | [[cdk.support/lookup-entry]] | `:sectional-elements` |
| `style` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:style` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnForm$Builder builder id config]
  (when-let [data (lookup-entry config id :app-id)]
    (. builder appId data))
  (when-let [data (lookup-entry config id :cta)]
    (. builder cta data))
  (when-let [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-let [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-let [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-let [data (lookup-entry config id :form-action-type)]
    (. builder formActionType data))
  (when-let [data (lookup-entry config id :label-decorator)]
    (. builder labelDecorator data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :schema-version)]
    (. builder schemaVersion data))
  (when-let [data (lookup-entry config id :sectional-elements)]
    (. builder sectionalElements data))
  (when-let [data (lookup-entry config id :style)]
    (. builder style data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-form-field-config-property-builder
  "The build-cfn-form-field-config-property-builder function updates a CfnForm$FieldConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FieldConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excluded` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:excluded` |
| `inputType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:input-type` |
| `label` | java.lang.String | [[cdk.support/lookup-entry]] | `:label` |
| `position` | software.amazon.awscdk.services.amplifyuibuilder.CfnForm$FieldPositionProperty | [[cdk.support/lookup-entry]] | `:position` |
| `validations` | java.util.List | [[cdk.support/lookup-entry]] | `:validations` |
"
  [^CfnForm$FieldConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :excluded)]
    (. builder excluded data))
  (when-let [data (lookup-entry config id :input-type)]
    (. builder inputType data))
  (when-let [data (lookup-entry config id :label)]
    (. builder label data))
  (when-let [data (lookup-entry config id :position)]
    (. builder position data))
  (when-let [data (lookup-entry config id :validations)]
    (. builder validations data))
  (.build builder))


(defn build-cfn-form-field-input-config-property-builder
  "The build-cfn-form-field-input-config-property-builder function updates a CfnForm$FieldInputConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FieldInputConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `defaultChecked` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-checked` |
| `defaultCountryCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-country-code` |
| `defaultValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:default-value` |
| `descriptiveText` | java.lang.String | [[cdk.support/lookup-entry]] | `:descriptive-text` |
| `fileUploaderConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:file-uploader-config` |
| `isArray` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-array` |
| `maxValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-value` |
| `minValue` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-value` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `placeholder` | java.lang.String | [[cdk.support/lookup-entry]] | `:placeholder` |
| `readOnly` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:read-only` |
| `required` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:required` |
| `step` | java.lang.Number | [[cdk.support/lookup-entry]] | `:step` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
| `valueMappings` | software.amazon.awscdk.services.amplifyuibuilder.CfnForm$ValueMappingsProperty | [[cdk.support/lookup-entry]] | `:value-mappings` |
"
  [^CfnForm$FieldInputConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :default-checked)]
    (. builder defaultChecked data))
  (when-let [data (lookup-entry config id :default-country-code)]
    (. builder defaultCountryCode data))
  (when-let [data (lookup-entry config id :default-value)]
    (. builder defaultValue data))
  (when-let [data (lookup-entry config id :descriptive-text)]
    (. builder descriptiveText data))
  (when-let [data (lookup-entry config id :file-uploader-config)]
    (. builder fileUploaderConfig data))
  (when-let [data (lookup-entry config id :is-array)]
    (. builder isArray data))
  (when-let [data (lookup-entry config id :max-value)]
    (. builder maxValue data))
  (when-let [data (lookup-entry config id :min-value)]
    (. builder minValue data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :placeholder)]
    (. builder placeholder data))
  (when-let [data (lookup-entry config id :read-only)]
    (. builder readOnly data))
  (when-let [data (lookup-entry config id :required)]
    (. builder required data))
  (when-let [data (lookup-entry config id :step)]
    (. builder step data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (when-let [data (lookup-entry config id :value-mappings)]
    (. builder valueMappings data))
  (.build builder))


(defn build-cfn-form-field-position-property-builder
  "The build-cfn-form-field-position-property-builder function updates a CfnForm$FieldPositionProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FieldPositionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `below` | java.lang.String | [[cdk.support/lookup-entry]] | `:below` |
| `fixed` | java.lang.String | [[cdk.support/lookup-entry]] | `:fixed` |
| `rightOf` | java.lang.String | [[cdk.support/lookup-entry]] | `:right-of` |
"
  [^CfnForm$FieldPositionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :below)]
    (. builder below data))
  (when-let [data (lookup-entry config id :fixed)]
    (. builder fixed data))
  (when-let [data (lookup-entry config id :right-of)]
    (. builder rightOf data))
  (.build builder))


(defn build-cfn-form-field-validation-configuration-property-builder
  "The build-cfn-form-field-validation-configuration-property-builder function updates a CfnForm$FieldValidationConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FieldValidationConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `numValues` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:num-values` |
| `strValues` | java.util.List | [[cdk.support/lookup-entry]] | `:str-values` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `validationMessage` | java.lang.String | [[cdk.support/lookup-entry]] | `:validation-message` |
"
  [^CfnForm$FieldValidationConfigurationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :num-values)]
    (. builder numValues data))
  (when-let [data (lookup-entry config id :str-values)]
    (. builder strValues data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :validation-message)]
    (. builder validationMessage data))
  (.build builder))


(defn build-cfn-form-file-uploader-field-config-property-builder
  "The build-cfn-form-file-uploader-field-config-property-builder function updates a CfnForm$FileUploaderFieldConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FileUploaderFieldConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `acceptedFileTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:accepted-file-types` |
| `accessLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-level` |
| `isResumable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-resumable` |
| `maxFileCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-file-count` |
| `maxSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-size` |
| `showThumbnails` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:show-thumbnails` |
"
  [^CfnForm$FileUploaderFieldConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :accepted-file-types)]
    (. builder acceptedFileTypes data))
  (when-let [data (lookup-entry config id :access-level)]
    (. builder accessLevel data))
  (when-let [data (lookup-entry config id :is-resumable)]
    (. builder isResumable data))
  (when-let [data (lookup-entry config id :max-file-count)]
    (. builder maxFileCount data))
  (when-let [data (lookup-entry config id :max-size)]
    (. builder maxSize data))
  (when-let [data (lookup-entry config id :show-thumbnails)]
    (. builder showThumbnails data))
  (.build builder))


(defn build-cfn-form-form-button-property-builder
  "The build-cfn-form-form-button-property-builder function updates a CfnForm$FormButtonProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FormButtonProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `children` | java.lang.String | [[cdk.support/lookup-entry]] | `:children` |
| `excluded` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:excluded` |
| `position` | software.amazon.awscdk.services.amplifyuibuilder.CfnForm$FieldPositionProperty | [[cdk.support/lookup-entry]] | `:position` |
"
  [^CfnForm$FormButtonProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :children)]
    (. builder children data))
  (when-let [data (lookup-entry config id :excluded)]
    (. builder excluded data))
  (when-let [data (lookup-entry config id :position)]
    (. builder position data))
  (.build builder))


(defn build-cfn-form-form-cta-property-builder
  "The build-cfn-form-form-cta-property-builder function updates a CfnForm$FormCTAProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FormCTAProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cancel` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cancel` |
| `clear` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:clear` |
| `position` | java.lang.String | [[cdk.support/lookup-entry]] | `:position` |
| `submit` | software.amazon.awscdk.services.amplifyuibuilder.CfnForm$FormButtonProperty | [[cdk.support/lookup-entry]] | `:submit` |
"
  [^CfnForm$FormCTAProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cancel)]
    (. builder cancel data))
  (when-let [data (lookup-entry config id :clear)]
    (. builder clear data))
  (when-let [data (lookup-entry config id :position)]
    (. builder position data))
  (when-let [data (lookup-entry config id :submit)]
    (. builder submit data))
  (.build builder))


(defn build-cfn-form-form-data-type-config-property-builder
  "The build-cfn-form-form-data-type-config-property-builder function updates a CfnForm$FormDataTypeConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FormDataTypeConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source-type` |
| `dataTypeName` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type-name` |
"
  [^CfnForm$FormDataTypeConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :data-source-type)]
    (. builder dataSourceType data))
  (when-let [data (lookup-entry config id :data-type-name)]
    (. builder dataTypeName data))
  (.build builder))


(defn build-cfn-form-form-input-binding-properties-value-properties-property-builder
  "The build-cfn-form-form-input-binding-properties-value-properties-property-builder function updates a CfnForm$FormInputBindingPropertiesValuePropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FormInputBindingPropertiesValuePropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `model` | java.lang.String | [[cdk.support/lookup-entry]] | `:model` |
"
  [^CfnForm$FormInputBindingPropertiesValuePropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :model)]
    (. builder model data))
  (.build builder))


(defn build-cfn-form-form-input-binding-properties-value-property-builder
  "The build-cfn-form-form-input-binding-properties-value-property-builder function updates a CfnForm$FormInputBindingPropertiesValueProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FormInputBindingPropertiesValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bindingProperties` | software.amazon.awscdk.services.amplifyuibuilder.CfnForm$FormInputBindingPropertiesValuePropertiesProperty | [[cdk.support/lookup-entry]] | `:binding-properties` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnForm$FormInputBindingPropertiesValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :binding-properties)]
    (. builder bindingProperties data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-form-form-input-value-property-binding-properties-property-builder
  "The build-cfn-form-form-input-value-property-binding-properties-property-builder function updates a CfnForm$FormInputValuePropertyBindingPropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FormInputValuePropertyBindingPropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `field` | java.lang.String | [[cdk.support/lookup-entry]] | `:field` |
| `property` | java.lang.String | [[cdk.support/lookup-entry]] | `:property` |
"
  [^CfnForm$FormInputValuePropertyBindingPropertiesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :field)]
    (. builder field data))
  (when-let [data (lookup-entry config id :property)]
    (. builder property data))
  (.build builder))


(defn build-cfn-form-form-input-value-property-property-builder
  "The build-cfn-form-form-input-value-property-property-builder function updates a CfnForm$FormInputValuePropertyProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FormInputValuePropertyProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bindingProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:binding-properties` |
| `concat` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:concat` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnForm$FormInputValuePropertyProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :binding-properties)]
    (. builder bindingProperties data))
  (when-let [data (lookup-entry config id :concat)]
    (. builder concat data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-form-form-style-config-property-builder
  "The build-cfn-form-form-style-config-property-builder function updates a CfnForm$FormStyleConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FormStyleConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `tokenReference` | java.lang.String | [[cdk.support/lookup-entry]] | `:token-reference` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnForm$FormStyleConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :token-reference)]
    (. builder tokenReference data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-form-form-style-property-builder
  "The build-cfn-form-form-style-property-builder function updates a CfnForm$FormStyleProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$FormStyleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `horizontalGap` | software.amazon.awscdk.services.amplifyuibuilder.CfnForm$FormStyleConfigProperty | [[cdk.support/lookup-entry]] | `:horizontal-gap` |
| `outerPadding` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:outer-padding` |
| `verticalGap` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vertical-gap` |
"
  [^CfnForm$FormStyleProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :horizontal-gap)]
    (. builder horizontalGap data))
  (when-let [data (lookup-entry config id :outer-padding)]
    (. builder outerPadding data))
  (when-let [data (lookup-entry config id :vertical-gap)]
    (. builder verticalGap data))
  (.build builder))


(defn build-cfn-form-props-builder
  "The build-cfn-form-props-builder function updates a CfnFormProps$Builder instance using the provided configuration.
  The function takes the CfnFormProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appId` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id` |
| `cta` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cta` |
| `dataType` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:data-type` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `fields` | java.util.Map | [[cdk.support/lookup-entry]] | `:fields` |
| `formActionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:form-action-type` |
| `labelDecorator` | java.lang.String | [[cdk.support/lookup-entry]] | `:label-decorator` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schemaVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:schema-version` |
| `sectionalElements` | java.util.Map | [[cdk.support/lookup-entry]] | `:sectional-elements` |
| `style` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:style` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFormProps$Builder builder id config]
  (when-let [data (lookup-entry config id :app-id)]
    (. builder appId data))
  (when-let [data (lookup-entry config id :cta)]
    (. builder cta data))
  (when-let [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-let [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-let [data (lookup-entry config id :fields)]
    (. builder fields data))
  (when-let [data (lookup-entry config id :form-action-type)]
    (. builder formActionType data))
  (when-let [data (lookup-entry config id :label-decorator)]
    (. builder labelDecorator data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :schema-version)]
    (. builder schemaVersion data))
  (when-let [data (lookup-entry config id :sectional-elements)]
    (. builder sectionalElements data))
  (when-let [data (lookup-entry config id :style)]
    (. builder style data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn build-cfn-form-sectional-element-property-builder
  "The build-cfn-form-sectional-element-property-builder function updates a CfnForm$SectionalElementProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$SectionalElementProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excluded` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:excluded` |
| `level` | java.lang.Number | [[cdk.support/lookup-entry]] | `:level` |
| `orientation` | java.lang.String | [[cdk.support/lookup-entry]] | `:orientation` |
| `position` | software.amazon.awscdk.services.amplifyuibuilder.CfnForm$FieldPositionProperty | [[cdk.support/lookup-entry]] | `:position` |
| `text` | java.lang.String | [[cdk.support/lookup-entry]] | `:text` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnForm$SectionalElementProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :excluded)]
    (. builder excluded data))
  (when-let [data (lookup-entry config id :level)]
    (. builder level data))
  (when-let [data (lookup-entry config id :orientation)]
    (. builder orientation data))
  (when-let [data (lookup-entry config id :position)]
    (. builder position data))
  (when-let [data (lookup-entry config id :text)]
    (. builder text data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn build-cfn-form-value-mapping-property-builder
  "The build-cfn-form-value-mapping-property-builder function updates a CfnForm$ValueMappingProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$ValueMappingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `displayValue` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:display-value` |
| `value` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnForm$ValueMappingProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :display-value)]
    (. builder displayValue data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-form-value-mappings-property-builder
  "The build-cfn-form-value-mappings-property-builder function updates a CfnForm$ValueMappingsProperty$Builder instance using the provided configuration.
  The function takes the CfnForm$ValueMappingsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bindingProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:binding-properties` |
| `values` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnForm$ValueMappingsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :binding-properties)]
    (. builder bindingProperties data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn build-cfn-theme-builder
  "The build-cfn-theme-builder function updates a CfnTheme$Builder instance using the provided configuration.
  The function takes the CfnTheme$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appId` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overrides` | java.util.List | [[cdk.support/lookup-entry]] | `:overrides` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnTheme$Builder builder id config]
  (when-let [data (lookup-entry config id :app-id)]
    (. builder appId data))
  (when-let [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :overrides)]
    (. builder overrides data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn build-cfn-theme-props-builder
  "The build-cfn-theme-props-builder function updates a CfnThemeProps$Builder instance using the provided configuration.
  The function takes the CfnThemeProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appId` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id` |
| `environmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment-name` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `overrides` | java.util.List | [[cdk.support/lookup-entry]] | `:overrides` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `values` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnThemeProps$Builder builder id config]
  (when-let [data (lookup-entry config id :app-id)]
    (. builder appId data))
  (when-let [data (lookup-entry config id :environment-name)]
    (. builder environmentName data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :overrides)]
    (. builder overrides data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn build-cfn-theme-theme-value-property-builder
  "The build-cfn-theme-theme-value-property-builder function updates a CfnTheme$ThemeValueProperty$Builder instance using the provided configuration.
  The function takes the CfnTheme$ThemeValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `children` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:children` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTheme$ThemeValueProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :children)]
    (. builder children data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn build-cfn-theme-theme-values-property-builder
  "The build-cfn-theme-theme-values-property-builder function updates a CfnTheme$ThemeValuesProperty$Builder instance using the provided configuration.
  The function takes the CfnTheme$ThemeValuesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | software.amazon.awscdk.services.amplifyuibuilder.CfnTheme$ThemeValueProperty | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnTheme$ThemeValuesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))