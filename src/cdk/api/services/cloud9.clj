(ns cdk.api.services.cloud9
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloud9 package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cloud9 CfnEnvironmentEC2$Builder
                                                   CfnEnvironmentEC2$RepositoryProperty$Builder
                                                   CfnEnvironmentEC2Props$Builder]))


(defn cfn-environment-ec2-builder
  "The cfn-environment-ec2-builder function buildes out new instances of 
CfnEnvironmentEC2$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironmentEC2$Builder/create stack id)]
    (when-let [data (lookup-entry config id :automatic-stop-time-minutes)]
      (. builder automaticStopTimeMinutes data))
    (when-let [data (lookup-entry config id :connection-type)]
      (. builder connectionType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :owner-arn)]
      (. builder ownerArn data))
    (when-let [data (lookup-entry config id :repositories)]
      (. builder repositories data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-environment-ec2-props-builder
  "The cfn-environment-ec2-props-builder function buildes out new instances of 
CfnEnvironmentEC2Props$Builder using the provided configuration.  Each field is set as follows:

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
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnEnvironmentEC2Props$Builder.)]
    (when-let [data (lookup-entry config id :automatic-stop-time-minutes)]
      (. builder automaticStopTimeMinutes data))
    (when-let [data (lookup-entry config id :connection-type)]
      (. builder connectionType data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :image-id)]
      (. builder imageId data))
    (when-let [data (lookup-entry config id :instance-type)]
      (. builder instanceType data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :owner-arn)]
      (. builder ownerArn data))
    (when-let [data (lookup-entry config id :repositories)]
      (. builder repositories data))
    (when-let [data (lookup-entry config id :subnet-id)]
      (. builder subnetId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-environment-ec2-repository-property-builder
  "The cfn-environment-ec2-repository-property-builder function buildes out new instances of 
CfnEnvironmentEC2$RepositoryProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `pathComponent` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-component` |
| `repositoryUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository-url` |"
  [stack id config]
  (let [builder (CfnEnvironmentEC2$RepositoryProperty$Builder.)]
    (when-let [data (lookup-entry config id :path-component)]
      (. builder pathComponent data))
    (when-let [data (lookup-entry config id :repository-url)]
      (. builder repositoryUrl data))
    (.build builder)))