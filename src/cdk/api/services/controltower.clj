(ns cdk.api.services.controltower
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.controltower package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.controltower CfnEnabledBaseline$Builder
                                                         CfnEnabledBaseline$ParameterProperty$Builder
                                                         CfnEnabledBaselineProps$Builder
                                                         CfnEnabledControl$Builder
                                                         CfnEnabledControl$EnabledControlParameterProperty$Builder
                                                         CfnEnabledControlProps$Builder
                                                         CfnLandingZone$Builder
                                                         CfnLandingZoneProps$Builder]))


(defn build-cfn-enabled-baseline-builder
  "The build-cfn-enabled-baseline-builder function updates a CfnEnabledBaseline$Builder instance using the provided configuration.
  The function takes the CfnEnabledBaseline$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baselineIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:baseline-identifier` |
| `baselineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:baseline-version` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-identifier` |
"
  [^CfnEnabledBaseline$Builder builder id config]
  (when-let [data (lookup-entry config id :baseline-identifier)]
    (. builder baselineIdentifier data))
  (when-let [data (lookup-entry config id :baseline-version)]
    (. builder baselineVersion data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-identifier)]
    (. builder targetIdentifier data))
  (.build builder))


(defn cfn-enabled-baseline-builder
  "Creates a  `CfnEnabledBaseline$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-enabled-baseline-builder (CfnEnabledBaseline$Builder/create scope (name id)) id config))


(defn build-cfn-enabled-baseline-parameter-property-builder
  "The build-cfn-enabled-baseline-parameter-property-builder function updates a CfnEnabledBaseline$ParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnEnabledBaseline$ParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnEnabledBaseline$ParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-enabled-baseline-parameter-property-builder
  "Creates a  `CfnEnabledBaseline$ParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-enabled-baseline-parameter-property-builder (new CfnEnabledBaseline$ParameterProperty$Builder) id config))


(defn build-cfn-enabled-baseline-props-builder
  "The build-cfn-enabled-baseline-props-builder function updates a CfnEnabledBaselineProps$Builder instance using the provided configuration.
  The function takes the CfnEnabledBaselineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baselineIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:baseline-identifier` |
| `baselineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:baseline-version` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-identifier` |
"
  [^CfnEnabledBaselineProps$Builder builder id config]
  (when-let [data (lookup-entry config id :baseline-identifier)]
    (. builder baselineIdentifier data))
  (when-let [data (lookup-entry config id :baseline-version)]
    (. builder baselineVersion data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-identifier)]
    (. builder targetIdentifier data))
  (.build builder))


(defn cfn-enabled-baseline-props-builder
  "Creates a  `CfnEnabledBaselineProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-enabled-baseline-props-builder (new CfnEnabledBaselineProps$Builder) id config))


(defn build-cfn-enabled-control-builder
  "The build-cfn-enabled-control-builder function updates a CfnEnabledControl$Builder instance using the provided configuration.
  The function takes the CfnEnabledControl$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `controlIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-identifier` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-identifier` |
"
  [^CfnEnabledControl$Builder builder id config]
  (when-let [data (lookup-entry config id :control-identifier)]
    (. builder controlIdentifier data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-identifier)]
    (. builder targetIdentifier data))
  (.build builder))


(defn cfn-enabled-control-builder
  "Creates a  `CfnEnabledControl$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-enabled-control-builder (CfnEnabledControl$Builder/create scope (name id)) id config))


(defn build-cfn-enabled-control-enabled-control-parameter-property-builder
  "The build-cfn-enabled-control-enabled-control-parameter-property-builder function updates a CfnEnabledControl$EnabledControlParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnEnabledControl$EnabledControlParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnEnabledControl$EnabledControlParameterProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-enabled-control-enabled-control-parameter-property-builder
  "Creates a  `CfnEnabledControl$EnabledControlParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-enabled-control-enabled-control-parameter-property-builder (new CfnEnabledControl$EnabledControlParameterProperty$Builder) id config))


(defn build-cfn-enabled-control-props-builder
  "The build-cfn-enabled-control-props-builder function updates a CfnEnabledControlProps$Builder instance using the provided configuration.
  The function takes the CfnEnabledControlProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `controlIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-identifier` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-identifier` |
"
  [^CfnEnabledControlProps$Builder builder id config]
  (when-let [data (lookup-entry config id :control-identifier)]
    (. builder controlIdentifier data))
  (when-let [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :target-identifier)]
    (. builder targetIdentifier data))
  (.build builder))


(defn cfn-enabled-control-props-builder
  "Creates a  `CfnEnabledControlProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-enabled-control-props-builder (new CfnEnabledControlProps$Builder) id config))


(defn build-cfn-landing-zone-builder
  "The build-cfn-landing-zone-builder function updates a CfnLandingZone$Builder instance using the provided configuration.
  The function takes the CfnLandingZone$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifest` | java.lang.Object | [[cdk.support/lookup-entry]] | `:manifest` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnLandingZone$Builder builder id config]
  (when-let [data (lookup-entry config id :manifest)]
    (. builder manifest data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-landing-zone-builder
  "Creates a  `CfnLandingZone$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-landing-zone-builder (CfnLandingZone$Builder/create scope (name id)) id config))


(defn build-cfn-landing-zone-props-builder
  "The build-cfn-landing-zone-props-builder function updates a CfnLandingZoneProps$Builder instance using the provided configuration.
  The function takes the CfnLandingZoneProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifest` | java.lang.Object | [[cdk.support/lookup-entry]] | `:manifest` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnLandingZoneProps$Builder builder id config]
  (when-let [data (lookup-entry config id :manifest)]
    (. builder manifest data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-landing-zone-props-builder
  "Creates a  `CfnLandingZoneProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-landing-zone-props-builder (new CfnLandingZoneProps$Builder) id config))