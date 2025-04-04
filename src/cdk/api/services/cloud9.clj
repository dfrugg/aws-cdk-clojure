(ns cdk.api.services.cloud9
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloud9 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cloud9 CfnEnvironmentEC2$Builder
                                                   CfnEnvironmentEC2$RepositoryProperty$Builder
                                                   CfnEnvironmentEC2Props$Builder]))


(defn cfn-environment-ec2-builder>
  "The cfn-environment-ec2-builder> function updates a CfnEnvironmentEC2$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentEC2$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticStopTimeMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automatic-stop-time-minutes` |
| `connectionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ownerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-arn` |
| `repositories` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:repositories` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironmentEC2$Builder builder id config]
  (when-some [data (lookup-entry config id :automatic-stop-time-minutes)]
    (. builder automaticStopTimeMinutes data))
  (when-some [data (lookup-entry config id :connection-type)]
    (. builder connectionType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :image-id)]
    (. builder imageId data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :owner-arn)]
    (. builder ownerArn data))
  (when-some [data (lookup-entry config id :repositories)]
    (. builder repositories data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-ec2-builder
  "Creates a  `CfnEnvironmentEC2$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-environment-ec2-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-environment-ec2-builder> (CfnEnvironmentEC2$Builder/create scope (name id)) id config))


(defn cfn-environment-ec2-props-builder>
  "The cfn-environment-ec2-props-builder> function updates a CfnEnvironmentEC2Props$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentEC2Props$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticStopTimeMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automatic-stop-time-minutes` |
| `connectionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:connection-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `imageId` | java.lang.String | [[cdk.support/lookup-entry]] | `:image-id` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ownerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-arn` |
| `repositories` | java.util.List | [[cdk.support/lookup-entry]] | `:repositories` |
| `subnetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:subnet-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnEnvironmentEC2Props$Builder builder id config]
  (when-some [data (lookup-entry config id :automatic-stop-time-minutes)]
    (. builder automaticStopTimeMinutes data))
  (when-some [data (lookup-entry config id :connection-type)]
    (. builder connectionType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :image-id)]
    (. builder imageId data))
  (when-some [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :owner-arn)]
    (. builder ownerArn data))
  (when-some [data (lookup-entry config id :repositories)]
    (. builder repositories data))
  (when-some [data (lookup-entry config id :subnet-id)]
    (. builder subnetId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-environment-ec2-props-builder
  "Creates a  `CfnEnvironmentEC2Props$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-ec2-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-ec2-props-builder> (new CfnEnvironmentEC2Props$Builder) id config))


(defn cfn-environment-ec2-repository-property-builder>
  "The cfn-environment-ec2-repository-property-builder> function updates a CfnEnvironmentEC2$RepositoryProperty$Builder instance using the provided configuration.
  The function takes the CfnEnvironmentEC2$RepositoryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pathComponent` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-component` |
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |
"
  [^CfnEnvironmentEC2$RepositoryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :path-component)]
    (. builder pathComponent data))
  (when-some [data (lookup-entry config id :repository-url)]
    (. builder repositoryUrl data))
  (.build builder))


(defn cfn-environment-ec2-repository-property-builder
  "Creates a  `CfnEnvironmentEC2$RepositoryProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-environment-ec2-repository-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-environment-ec2-repository-property-builder> (new CfnEnvironmentEC2$RepositoryProperty$Builder) id config))