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


(defn cfn-enabled-baseline-builder
  "The cfn-enabled-baseline-builder function buildes out new instances of 
CfnEnabledBaseline$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baselineIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:baseline-identifier` |
| `baselineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:baseline-version` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-identifier` |"
  [stack id config]
  (let [builder (CfnEnabledBaseline$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-enabled-baseline-parameter-property-builder
  "The cfn-enabled-baseline-parameter-property-builder function buildes out new instances of 
CfnEnabledBaseline$ParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnEnabledBaseline$ParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-enabled-baseline-props-builder
  "The cfn-enabled-baseline-props-builder function buildes out new instances of 
CfnEnabledBaselineProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `baselineIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:baseline-identifier` |
| `baselineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:baseline-version` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-identifier` |"
  [stack id config]
  (let [builder (CfnEnabledBaselineProps$Builder.)]
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
    (.build builder)))


(defn cfn-enabled-control-builder
  "The cfn-enabled-control-builder function buildes out new instances of 
CfnEnabledControl$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `controlIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-identifier` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-identifier` |"
  [stack id config]
  (let [builder (CfnEnabledControl$Builder/create stack id)]
    (when-let [data (lookup-entry config id :control-identifier)]
      (. builder controlIdentifier data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-identifier)]
      (. builder targetIdentifier data))
    (.build builder)))


(defn cfn-enabled-control-enabled-control-parameter-property-builder
  "The cfn-enabled-control-enabled-control-parameter-property-builder function buildes out new instances of 
CfnEnabledControl$EnabledControlParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnEnabledControl$EnabledControlParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-enabled-control-props-builder
  "The cfn-enabled-control-props-builder function buildes out new instances of 
CfnEnabledControlProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `controlIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-identifier` |
| `parameters` | java.util.List | [[cdk.support/lookup-entry]] | `:parameters` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-identifier` |"
  [stack id config]
  (let [builder (CfnEnabledControlProps$Builder.)]
    (when-let [data (lookup-entry config id :control-identifier)]
      (. builder controlIdentifier data))
    (when-let [data (lookup-entry config id :parameters)]
      (. builder parameters data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :target-identifier)]
      (. builder targetIdentifier data))
    (.build builder)))


(defn cfn-landing-zone-builder
  "The cfn-landing-zone-builder function buildes out new instances of 
CfnLandingZone$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifest` | java.lang.Object | [[cdk.support/lookup-entry]] | `:manifest` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnLandingZone$Builder/create stack id)]
    (when-let [data (lookup-entry config id :manifest)]
      (. builder manifest data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-landing-zone-props-builder
  "The cfn-landing-zone-props-builder function buildes out new instances of 
CfnLandingZoneProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `manifest` | java.lang.Object | [[cdk.support/lookup-entry]] | `:manifest` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnLandingZoneProps$Builder.)]
    (when-let [data (lookup-entry config id :manifest)]
      (. builder manifest data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))