(ns cdk.api.assertions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.assertions package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.assertions MatchCapture$Builder
                                              MatchFailure$Builder
                                              TemplateParsingOptions$Builder]))


(defn match-capture-builder
  "The match-capture-builder function buildes out new instances of 
MatchCapture$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capture` | software.amazon.awscdk.assertions.Capture | [[cdk.support/lookup-entry]] | `:capture` |
| `value` | java.lang.Object | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (MatchCapture$Builder.)]
    (when-let [data (lookup-entry config id :capture)]
      (. builder capture data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn match-failure-builder
  "The match-failure-builder function buildes out new instances of 
MatchFailure$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cost` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cost` |
| `matcher` | software.amazon.awscdk.assertions.Matcher | [[cdk.support/lookup-entry]] | `:matcher` |
| `message` | java.lang.String | [[cdk.support/lookup-entry]] | `:message` |
| `path` | java.util.List | [[cdk.support/lookup-entry]] | `:path` |"
  [stack id config]
  (let [builder (MatchFailure$Builder.)]
    (when-let [data (lookup-entry config id :cost)]
      (. builder cost data))
    (when-let [data (lookup-entry config id :matcher)]
      (. builder matcher data))
    (when-let [data (lookup-entry config id :message)]
      (. builder message data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (.build builder)))


(defn template-parsing-options-builder
  "The template-parsing-options-builder function buildes out new instances of 
TemplateParsingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `skipCyclicalDependenciesCheck` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:skip-cyclical-dependencies-check` |"
  [stack id config]
  (let [builder (TemplateParsingOptions$Builder.)]
    (when-let [data (lookup-entry config id :skip-cyclical-dependencies-check)]
      (. builder skipCyclicalDependenciesCheck data))
    (.build builder)))