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


(defn cfn-fleet-builder
  "The cfn-fleet-builder function buildes out new instances of 
CfnFleet$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFleet$Builder/create stack id)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-fleet-props-builder
  "The cfn-fleet-props-builder function buildes out new instances of 
CfnFleetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFleetProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-robot-application-builder
  "The cfn-robot-application-builder function buildes out new instances of 
CfnRobotApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `robotSoftwareSuite` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:robot-software-suite` |
| `sources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRobotApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :current-revision-id)]
      (. builder currentRevisionId data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :robot-software-suite)]
      (. builder robotSoftwareSuite data))
    (when-let [data (lookup-entry config id :sources)]
      (. builder sources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-robot-application-props-builder
  "The cfn-robot-application-props-builder function buildes out new instances of 
CfnRobotApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `robotSoftwareSuite` | software.amazon.awscdk.services.robomaker.CfnRobotApplication$RobotSoftwareSuiteProperty | [[cdk.support/lookup-entry]] | `:robot-software-suite` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRobotApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :current-revision-id)]
      (. builder currentRevisionId data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :robot-software-suite)]
      (. builder robotSoftwareSuite data))
    (when-let [data (lookup-entry config id :sources)]
      (. builder sources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-robot-application-robot-software-suite-property-builder
  "The cfn-robot-application-robot-software-suite-property-builder function buildes out new instances of 
CfnRobotApplication$RobotSoftwareSuiteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnRobotApplication$RobotSoftwareSuiteProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-robot-application-source-config-property-builder
  "The cfn-robot-application-source-config-property-builder function buildes out new instances of 
CfnRobotApplication$SourceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |"
  [stack id config]
  (let [builder (CfnRobotApplication$SourceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :architecture)]
      (. builder architecture data))
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-key)]
      (. builder s3Key data))
    (.build builder)))


(defn cfn-robot-application-version-builder
  "The cfn-robot-application-version-builder function buildes out new instances of 
CfnRobotApplicationVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |"
  [stack id config]
  (let [builder (CfnRobotApplicationVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :current-revision-id)]
      (. builder currentRevisionId data))
    (.build builder)))


(defn cfn-robot-application-version-props-builder
  "The cfn-robot-application-version-props-builder function buildes out new instances of 
CfnRobotApplicationVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |"
  [stack id config]
  (let [builder (CfnRobotApplicationVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :current-revision-id)]
      (. builder currentRevisionId data))
    (.build builder)))


(defn cfn-robot-builder
  "The cfn-robot-builder function buildes out new instances of 
CfnRobot$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `fleet` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet` |
| `greengrassGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:greengrass-group-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRobot$Builder/create stack id)]
    (when-let [data (lookup-entry config id :architecture)]
      (. builder architecture data))
    (when-let [data (lookup-entry config id :fleet)]
      (. builder fleet data))
    (when-let [data (lookup-entry config id :greengrass-group-id)]
      (. builder greengrassGroupId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-robot-props-builder
  "The cfn-robot-props-builder function buildes out new instances of 
CfnRobotProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `fleet` | java.lang.String | [[cdk.support/lookup-entry]] | `:fleet` |
| `greengrassGroupId` | java.lang.String | [[cdk.support/lookup-entry]] | `:greengrass-group-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRobotProps$Builder.)]
    (when-let [data (lookup-entry config id :architecture)]
      (. builder architecture data))
    (when-let [data (lookup-entry config id :fleet)]
      (. builder fleet data))
    (when-let [data (lookup-entry config id :greengrass-group-id)]
      (. builder greengrassGroupId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-simulation-application-builder
  "The cfn-simulation-application-builder function buildes out new instances of 
CfnSimulationApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `renderingEngine` | software.amazon.awscdk.services.robomaker.CfnSimulationApplication$RenderingEngineProperty | [[cdk.support/lookup-entry]] | `:rendering-engine` |
| `robotSoftwareSuite` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:robot-software-suite` |
| `simulationSoftwareSuite` | software.amazon.awscdk.services.robomaker.CfnSimulationApplication$SimulationSoftwareSuiteProperty | [[cdk.support/lookup-entry]] | `:simulation-software-suite` |
| `sources` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSimulationApplication$Builder/create stack id)]
    (when-let [data (lookup-entry config id :current-revision-id)]
      (. builder currentRevisionId data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rendering-engine)]
      (. builder renderingEngine data))
    (when-let [data (lookup-entry config id :robot-software-suite)]
      (. builder robotSoftwareSuite data))
    (when-let [data (lookup-entry config id :simulation-software-suite)]
      (. builder simulationSoftwareSuite data))
    (when-let [data (lookup-entry config id :sources)]
      (. builder sources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-simulation-application-props-builder
  "The cfn-simulation-application-props-builder function buildes out new instances of 
CfnSimulationApplicationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |
| `environment` | java.lang.String | [[cdk.support/lookup-entry]] | `:environment` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `renderingEngine` | software.amazon.awscdk.services.robomaker.CfnSimulationApplication$RenderingEngineProperty | [[cdk.support/lookup-entry]] | `:rendering-engine` |
| `robotSoftwareSuite` | software.amazon.awscdk.services.robomaker.CfnSimulationApplication$RobotSoftwareSuiteProperty | [[cdk.support/lookup-entry]] | `:robot-software-suite` |
| `simulationSoftwareSuite` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:simulation-software-suite` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSimulationApplicationProps$Builder.)]
    (when-let [data (lookup-entry config id :current-revision-id)]
      (. builder currentRevisionId data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :rendering-engine)]
      (. builder renderingEngine data))
    (when-let [data (lookup-entry config id :robot-software-suite)]
      (. builder robotSoftwareSuite data))
    (when-let [data (lookup-entry config id :simulation-software-suite)]
      (. builder simulationSoftwareSuite data))
    (when-let [data (lookup-entry config id :sources)]
      (. builder sources data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-simulation-application-rendering-engine-property-builder
  "The cfn-simulation-application-rendering-engine-property-builder function buildes out new instances of 
CfnSimulationApplication$RenderingEngineProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnSimulationApplication$RenderingEngineProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-simulation-application-robot-software-suite-property-builder
  "The cfn-simulation-application-robot-software-suite-property-builder function buildes out new instances of 
CfnSimulationApplication$RobotSoftwareSuiteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnSimulationApplication$RobotSoftwareSuiteProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-simulation-application-simulation-software-suite-property-builder
  "The cfn-simulation-application-simulation-software-suite-property-builder function buildes out new instances of 
CfnSimulationApplication$SimulationSoftwareSuiteProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |"
  [stack id config]
  (let [builder (CfnSimulationApplication$SimulationSoftwareSuiteProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (.build builder)))


(defn cfn-simulation-application-source-config-property-builder
  "The cfn-simulation-application-source-config-property-builder function buildes out new instances of 
CfnSimulationApplication$SourceConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `architecture` | java.lang.String | [[cdk.support/lookup-entry]] | `:architecture` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Key` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key` |"
  [stack id config]
  (let [builder (CfnSimulationApplication$SourceConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :architecture)]
      (. builder architecture data))
    (when-let [data (lookup-entry config id :s3-bucket)]
      (. builder s3Bucket data))
    (when-let [data (lookup-entry config id :s3-key)]
      (. builder s3Key data))
    (.build builder)))


(defn cfn-simulation-application-version-builder
  "The cfn-simulation-application-version-builder function buildes out new instances of 
CfnSimulationApplicationVersion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |"
  [stack id config]
  (let [builder (CfnSimulationApplicationVersion$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :current-revision-id)]
      (. builder currentRevisionId data))
    (.build builder)))


(defn cfn-simulation-application-version-props-builder
  "The cfn-simulation-application-version-props-builder function buildes out new instances of 
CfnSimulationApplicationVersionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | java.lang.String | [[cdk.support/lookup-entry]] | `:application` |
| `currentRevisionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-revision-id` |"
  [stack id config]
  (let [builder (CfnSimulationApplicationVersionProps$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :current-revision-id)]
      (. builder currentRevisionId data))
    (.build builder)))