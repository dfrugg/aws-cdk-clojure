(ns cdk.api.services.robomaker
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.robomaker package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.robomaker CfnFleet$Builder
                                                      CfnFleetProps$Builder
                                                      CfnRobot$Builder
                                                      CfnRobotApplication$Builder
                                                      CfnRobotApplication$RobotSoftwareSuiteProperty$Builder
                                                      CfnRobotApplication$SourceConfigProperty$Builder
                                                      CfnRobotApplicationProps$Builder
                                                      CfnRobotApplicationVersion$Builder
                                                      CfnRobotApplicationVersionProps$Builder
                                                      CfnRobotProps$Builder
                                                      CfnSimulationApplication$Builder
                                                      CfnSimulationApplication$RenderingEngineProperty$Builder
                                                      CfnSimulationApplication$RobotSoftwareSuiteProperty$Builder
                                                      CfnSimulationApplication$SimulationSoftwareSuiteProperty$Builder
                                                      CfnSimulationApplication$SourceConfigProperty$Builder
                                                      CfnSimulationApplicationProps$Builder
                                                      CfnSimulationApplicationVersion$Builder
                                                      CfnSimulationApplicationVersionProps$Builder]))


(defn cfn-fleet-builder>
  "The cfn-fleet-builder> function updates a CfnFleet$Builder instance using the provided configuration.
  The function takes the CfnFleet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFleet$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-fleet-builder
  "Creates a  `CfnFleet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-fleet-builder> (CfnFleet$Builder/create scope (name id)) id config))


(defn cfn-fleet-props-builder>
  "The cfn-fleet-props-builder> function updates a CfnFleetProps$Builder instance using the provided configuration.
  The function takes the CfnFleetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFleetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-fleet-props-builder
  "Creates a  `CfnFleetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-fleet-props-builder> (new CfnFleetProps$Builder) id config))


(defn cfn-robot-application-builder>
  "The cfn-robot-application-builder> function updates a CfnRobotApplication$Builder instance using the provided configuration.
  The function takes the CfnRobotApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `robotSoftwareSuite` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:robot-software-suite` |
| `sources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRobotApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :current-revision-id)]
    (. builder currentRevisionId data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :robot-software-suite)]
    (. builder robotSoftwareSuite data))
  (when-some [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-robot-application-builder
  "Creates a  `CfnRobotApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-robot-application-builder> (CfnRobotApplication$Builder/create scope (name id)) id config))


(defn cfn-robot-application-props-builder>
  "The cfn-robot-application-props-builder> function updates a CfnRobotApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnRobotApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `robotSoftwareSuite` | software.amazon.awscdk.services.robomaker.CfnRobotApplication$RobotSoftwareSuiteProperty | [[cdk.support/lookup-entry]] | `:robot-software-suite` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRobotApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :current-revision-id)]
    (. builder currentRevisionId data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :robot-software-suite)]
    (. builder robotSoftwareSuite data))
  (when-some [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-robot-application-props-builder
  "Creates a  `CfnRobotApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-robot-application-props-builder> (new CfnRobotApplicationProps$Builder) id config))


(defn cfn-robot-application-robot-software-suite-property-builder>
  "The cfn-robot-application-robot-software-suite-property-builder> function updates a CfnRobotApplication$RobotSoftwareSuiteProperty$Builder instance using the provided configuration.
  The function takes the CfnRobotApplication$RobotSoftwareSuiteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnRobotApplication$RobotSoftwareSuiteProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-robot-application-robot-software-suite-property-builder
  "Creates a  `CfnRobotApplication$RobotSoftwareSuiteProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-robot-application-robot-software-suite-property-builder> (new CfnRobotApplication$RobotSoftwareSuiteProperty$Builder) id config))


(defn cfn-robot-application-source-config-property-builder>
  "The cfn-robot-application-source-config-property-builder> function updates a CfnRobotApplication$SourceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnRobotApplication$SourceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
"
  [^CfnRobotApplication$SourceConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-some [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-some [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (.build builder))


(defn cfn-robot-application-source-config-property-builder
  "Creates a  `CfnRobotApplication$SourceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-robot-application-source-config-property-builder> (new CfnRobotApplication$SourceConfigProperty$Builder) id config))


(defn cfn-robot-application-version-builder>
  "The cfn-robot-application-version-builder> function updates a CfnRobotApplicationVersion$Builder instance using the provided configuration.
  The function takes the CfnRobotApplicationVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
"
  [^CfnRobotApplicationVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :current-revision-id)]
    (. builder currentRevisionId data))
  (.build builder))


(defn cfn-robot-application-version-builder
  "Creates a  `CfnRobotApplicationVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-robot-application-version-builder> (CfnRobotApplicationVersion$Builder/create scope (name id)) id config))


(defn cfn-robot-application-version-props-builder>
  "The cfn-robot-application-version-props-builder> function updates a CfnRobotApplicationVersionProps$Builder instance using the provided configuration.
  The function takes the CfnRobotApplicationVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
"
  [^CfnRobotApplicationVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :current-revision-id)]
    (. builder currentRevisionId data))
  (.build builder))


(defn cfn-robot-application-version-props-builder
  "Creates a  `CfnRobotApplicationVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-robot-application-version-props-builder> (new CfnRobotApplicationVersionProps$Builder) id config))


(defn cfn-robot-builder>
  "The cfn-robot-builder> function updates a CfnRobot$Builder instance using the provided configuration.
  The function takes the CfnRobot$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `fleet` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet` |
| `greengrassGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:greengrass-group-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRobot$Builder builder id config]
  (when-some [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-some [data (lookup-entry config id :fleet)]
    (. builder fleet data))
  (when-some [data (lookup-entry config id :greengrass-group-id)]
    (. builder greengrassGroupId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-robot-builder
  "Creates a  `CfnRobot$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-robot-builder> (CfnRobot$Builder/create scope (name id)) id config))


(defn cfn-robot-props-builder>
  "The cfn-robot-props-builder> function updates a CfnRobotProps$Builder instance using the provided configuration.
  The function takes the CfnRobotProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `fleet` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet` |
| `greengrassGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:greengrass-group-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRobotProps$Builder builder id config]
  (when-some [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-some [data (lookup-entry config id :fleet)]
    (. builder fleet data))
  (when-some [data (lookup-entry config id :greengrass-group-id)]
    (. builder greengrassGroupId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-robot-props-builder
  "Creates a  `CfnRobotProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-robot-props-builder> (new CfnRobotProps$Builder) id config))


(defn cfn-simulation-application-builder>
  "The cfn-simulation-application-builder> function updates a CfnSimulationApplication$Builder instance using the provided configuration.
  The function takes the CfnSimulationApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `renderingEngine` | software.amazon.awscdk.services.robomaker.CfnSimulationApplication$RenderingEngineProperty | [[cdk.support/lookup-entry]] | `:rendering-engine` |
| `robotSoftwareSuite` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:robot-software-suite` |
| `simulationSoftwareSuite` | software.amazon.awscdk.services.robomaker.CfnSimulationApplication$SimulationSoftwareSuiteProperty | [[cdk.support/lookup-entry]] | `:simulation-software-suite` |
| `sources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSimulationApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :current-revision-id)]
    (. builder currentRevisionId data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rendering-engine)]
    (. builder renderingEngine data))
  (when-some [data (lookup-entry config id :robot-software-suite)]
    (. builder robotSoftwareSuite data))
  (when-some [data (lookup-entry config id :simulation-software-suite)]
    (. builder simulationSoftwareSuite data))
  (when-some [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-simulation-application-builder
  "Creates a  `CfnSimulationApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-simulation-application-builder> (CfnSimulationApplication$Builder/create scope (name id)) id config))


(defn cfn-simulation-application-props-builder>
  "The cfn-simulation-application-props-builder> function updates a CfnSimulationApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnSimulationApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `renderingEngine` | software.amazon.awscdk.services.robomaker.CfnSimulationApplication$RenderingEngineProperty | [[cdk.support/lookup-entry]] | `:rendering-engine` |
| `robotSoftwareSuite` | software.amazon.awscdk.services.robomaker.CfnSimulationApplication$RobotSoftwareSuiteProperty | [[cdk.support/lookup-entry]] | `:robot-software-suite` |
| `simulationSoftwareSuite` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:simulation-software-suite` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSimulationApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :current-revision-id)]
    (. builder currentRevisionId data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :rendering-engine)]
    (. builder renderingEngine data))
  (when-some [data (lookup-entry config id :robot-software-suite)]
    (. builder robotSoftwareSuite data))
  (when-some [data (lookup-entry config id :simulation-software-suite)]
    (. builder simulationSoftwareSuite data))
  (when-some [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-simulation-application-props-builder
  "Creates a  `CfnSimulationApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-simulation-application-props-builder> (new CfnSimulationApplicationProps$Builder) id config))


(defn cfn-simulation-application-rendering-engine-property-builder>
  "The cfn-simulation-application-rendering-engine-property-builder> function updates a CfnSimulationApplication$RenderingEngineProperty$Builder instance using the provided configuration.
  The function takes the CfnSimulationApplication$RenderingEngineProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnSimulationApplication$RenderingEngineProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-simulation-application-rendering-engine-property-builder
  "Creates a  `CfnSimulationApplication$RenderingEngineProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-simulation-application-rendering-engine-property-builder> (new CfnSimulationApplication$RenderingEngineProperty$Builder) id config))


(defn cfn-simulation-application-robot-software-suite-property-builder>
  "The cfn-simulation-application-robot-software-suite-property-builder> function updates a CfnSimulationApplication$RobotSoftwareSuiteProperty$Builder instance using the provided configuration.
  The function takes the CfnSimulationApplication$RobotSoftwareSuiteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnSimulationApplication$RobotSoftwareSuiteProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-simulation-application-robot-software-suite-property-builder
  "Creates a  `CfnSimulationApplication$RobotSoftwareSuiteProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-simulation-application-robot-software-suite-property-builder> (new CfnSimulationApplication$RobotSoftwareSuiteProperty$Builder) id config))


(defn cfn-simulation-application-simulation-software-suite-property-builder>
  "The cfn-simulation-application-simulation-software-suite-property-builder> function updates a CfnSimulationApplication$SimulationSoftwareSuiteProperty$Builder instance using the provided configuration.
  The function takes the CfnSimulationApplication$SimulationSoftwareSuiteProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnSimulationApplication$SimulationSoftwareSuiteProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-simulation-application-simulation-software-suite-property-builder
  "Creates a  `CfnSimulationApplication$SimulationSoftwareSuiteProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-simulation-application-simulation-software-suite-property-builder> (new CfnSimulationApplication$SimulationSoftwareSuiteProperty$Builder) id config))


(defn cfn-simulation-application-source-config-property-builder>
  "The cfn-simulation-application-source-config-property-builder> function updates a CfnSimulationApplication$SourceConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnSimulationApplication$SourceConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |
"
  [^CfnSimulationApplication$SourceConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :architecture)]
    (. builder architecture data))
  (when-some [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-some [data (lookup-entry config id :s3-key)]
    (. builder s3Key data))
  (.build builder))


(defn cfn-simulation-application-source-config-property-builder
  "Creates a  `CfnSimulationApplication$SourceConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-simulation-application-source-config-property-builder> (new CfnSimulationApplication$SourceConfigProperty$Builder) id config))


(defn cfn-simulation-application-version-builder>
  "The cfn-simulation-application-version-builder> function updates a CfnSimulationApplicationVersion$Builder instance using the provided configuration.
  The function takes the CfnSimulationApplicationVersion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
"
  [^CfnSimulationApplicationVersion$Builder builder id config]
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :current-revision-id)]
    (. builder currentRevisionId data))
  (.build builder))


(defn cfn-simulation-application-version-builder
  "Creates a  `CfnSimulationApplicationVersion$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-simulation-application-version-builder> (CfnSimulationApplicationVersion$Builder/create scope (name id)) id config))


(defn cfn-simulation-application-version-props-builder>
  "The cfn-simulation-application-version-props-builder> function updates a CfnSimulationApplicationVersionProps$Builder instance using the provided configuration.
  The function takes the CfnSimulationApplicationVersionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
"
  [^CfnSimulationApplicationVersionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :current-revision-id)]
    (. builder currentRevisionId data))
  (.build builder))


(defn cfn-simulation-application-version-props-builder
  "Creates a  `CfnSimulationApplicationVersionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-simulation-application-version-props-builder> (new CfnSimulationApplicationVersionProps$Builder) id config))