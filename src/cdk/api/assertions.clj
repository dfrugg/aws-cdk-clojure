(ns cdk.api.assertions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.assertions package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.assertions MatchCapture$Builder
                                              MatchFailure$Builder
                                              TemplateParsingOptions$Builder]))


(defn match-capture-builder>
  "The match-capture-builder> function updates a MatchCapture$Builder instance using the provided configuration.
  The function takes the MatchCapture$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capture` | software.amazon.awscdk.assertions.Capture | [[cdk.support/lookup-entry]] | `:capture` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |
"
  [^MatchCapture$Builder builder id config]
  (when-some [data (lookup-entry config id :capture)]
    (. builder capture data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn match-capture-builder
  "Creates a  `MatchCapture$Builder` instance using a no-argument constructor, applies the data configuration using the [[match-capture-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (match-capture-builder> (new MatchCapture$Builder) id config))


(defn match-failure-builder>
  "The match-failure-builder> function updates a MatchFailure$Builder instance using the provided configuration.
  The function takes the MatchFailure$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cost` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cost` |
| `matcher` | software.amazon.awscdk.assertions.Matcher | [[cdk.support/lookup-entry]] | `:matcher` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `path` | java.util.List | [[cdk.support/lookup-entry]] | `:path` |
"
  [^MatchFailure$Builder builder id config]
  (when-some [data (lookup-entry config id :cost)]
    (. builder cost data))
  (when-some [data (lookup-entry config id :matcher)]
    (. builder matcher data))
  (when-some [data (lookup-entry config id :message)]
    (. builder message data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn match-failure-builder
  "Creates a  `MatchFailure$Builder` instance using a no-argument constructor, applies the data configuration using the [[match-failure-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (match-failure-builder> (new MatchFailure$Builder) id config))


(defn template-parsing-options-builder>
  "The template-parsing-options-builder> function updates a TemplateParsingOptions$Builder instance using the provided configuration.
  The function takes the TemplateParsingOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `skipCyclicalDependenciesCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-cyclical-dependencies-check` |
"
  [^TemplateParsingOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :skip-cyclical-dependencies-check)]
    (. builder skipCyclicalDependenciesCheck data))
  (.build builder))


(defn template-parsing-options-builder
  "Creates a  `TemplateParsingOptions$Builder` instance using a no-argument constructor, applies the data configuration using the [[template-parsing-options-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (template-parsing-options-builder> (new TemplateParsingOptions$Builder) id config))