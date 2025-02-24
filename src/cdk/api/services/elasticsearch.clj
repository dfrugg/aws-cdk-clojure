(ns cdk.api.services.elasticsearch
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.elasticsearch package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.elasticsearch CfnDomain$AdvancedSecurityOptionsInputProperty$Builder
                                                          CfnDomain$Builder
                                                          CfnDomain$CognitoOptionsProperty$Builder
                                                          CfnDomain$ColdStorageOptionsProperty$Builder
                                                          CfnDomain$DomainEndpointOptionsProperty$Builder
                                                          CfnDomain$EBSOptionsProperty$Builder
                                                          CfnDomain$ElasticsearchClusterConfigProperty$Builder
                                                          CfnDomain$EncryptionAtRestOptionsProperty$Builder
                                                          CfnDomain$LogPublishingOptionProperty$Builder
                                                          CfnDomain$MasterUserOptionsProperty$Builder
                                                          CfnDomain$NodeToNodeEncryptionOptionsProperty$Builder
                                                          CfnDomain$SnapshotOptionsProperty$Builder
                                                          CfnDomain$VPCOptionsProperty$Builder
                                                          CfnDomain$ZoneAwarenessConfigProperty$Builder
                                                          CfnDomainProps$Builder]))


(defn build-cfn-domain-advanced-security-options-input-property-builder
  "The build-cfn-domain-advanced-security-options-input-property-builder function updates a CfnDomain$AdvancedSecurityOptionsInputProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$AdvancedSecurityOptionsInputProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anonymousAuthEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:anonymous-auth-enabled` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `internalUserDatabaseEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:internal-user-database-enabled` |
| `masterUserOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:master-user-options` |
"
  [^CfnDomain$AdvancedSecurityOptionsInputProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :anonymous-auth-enabled)]
    (. builder anonymousAuthEnabled data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :internal-user-database-enabled)]
    (. builder internalUserDatabaseEnabled data))
  (when-let [data (lookup-entry config id :master-user-options)]
    (. builder masterUserOptions data))
  (.build builder))


(defn cfn-domain-advanced-security-options-input-property-builder
  ""
  [id config]
  (build-cfn-domain-advanced-security-options-input-property-builder (new CfnDomain$AdvancedSecurityOptionsInputProperty$Builder) id config))


(defn build-cfn-domain-builder
  "The build-cfn-domain-builder function updates a CfnDomain$Builder instance using the provided configuration.
  The function takes the CfnDomain$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicies` | java.lang.Object | [[cdk.support/lookup-entry]] | `:access-policies` |
| `advancedOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:advanced-options` |
| `advancedSecurityOptions` | software.amazon.awscdk.services.elasticsearch.CfnDomain$AdvancedSecurityOptionsInputProperty | [[cdk.support/lookup-entry]] | `:advanced-security-options` |
| `cognitoOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cognito-options` |
| `domainArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-arn` |
| `domainEndpointOptions` | software.amazon.awscdk.services.elasticsearch.CfnDomain$DomainEndpointOptionsProperty | [[cdk.support/lookup-entry]] | `:domain-endpoint-options` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `ebsOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-options` |
| `elasticsearchClusterConfig` | software.amazon.awscdk.services.elasticsearch.CfnDomain$ElasticsearchClusterConfigProperty | [[cdk.support/lookup-entry]] | `:elasticsearch-cluster-config` |
| `elasticsearchVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:elasticsearch-version` |
| `encryptionAtRestOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-at-rest-options` |
| `logPublishingOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:log-publishing-options` |
| `nodeToNodeEncryptionOptions` | software.amazon.awscdk.services.elasticsearch.CfnDomain$NodeToNodeEncryptionOptionsProperty | [[cdk.support/lookup-entry]] | `:node-to-node-encryption-options` |
| `snapshotOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshot-options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-options` |
"
  [^CfnDomain$Builder builder id config]
  (when-let [data (lookup-entry config id :access-policies)]
    (. builder accessPolicies data))
  (when-let [data (lookup-entry config id :advanced-options)]
    (. builder advancedOptions data))
  (when-let [data (lookup-entry config id :advanced-security-options)]
    (. builder advancedSecurityOptions data))
  (when-let [data (lookup-entry config id :cognito-options)]
    (. builder cognitoOptions data))
  (when-let [data (lookup-entry config id :domain-arn)]
    (. builder domainArn data))
  (when-let [data (lookup-entry config id :domain-endpoint-options)]
    (. builder domainEndpointOptions data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :ebs-options)]
    (. builder ebsOptions data))
  (when-let [data (lookup-entry config id :elasticsearch-cluster-config)]
    (. builder elasticsearchClusterConfig data))
  (when-let [data (lookup-entry config id :elasticsearch-version)]
    (. builder elasticsearchVersion data))
  (when-let [data (lookup-entry config id :encryption-at-rest-options)]
    (. builder encryptionAtRestOptions data))
  (when-let [data (lookup-entry config id :log-publishing-options)]
    (. builder logPublishingOptions data))
  (when-let [data (lookup-entry config id :node-to-node-encryption-options)]
    (. builder nodeToNodeEncryptionOptions data))
  (when-let [data (lookup-entry config id :snapshot-options)]
    (. builder snapshotOptions data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-options)]
    (. builder vpcOptions data))
  (.build builder))


(defn cfn-domain-builder
  ""
  [^software.constructs.Construct scope id config]
  (build-cfn-domain-builder (CfnDomain$Builder/create scope (name id)) id config))


(defn build-cfn-domain-cognito-options-property-builder
  "The build-cfn-domain-cognito-options-property-builder function updates a CfnDomain$CognitoOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$CognitoOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `identityPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-pool-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |
"
  [^CfnDomain$CognitoOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :identity-pool-id)]
    (. builder identityPoolId data))
  (when-let [data (lookup-entry config id :role-arn)]
    (. builder roleArn data))
  (when-let [data (lookup-entry config id :user-pool-id)]
    (. builder userPoolId data))
  (.build builder))


(defn cfn-domain-cognito-options-property-builder
  ""
  [id config]
  (build-cfn-domain-cognito-options-property-builder (new CfnDomain$CognitoOptionsProperty$Builder) id config))


(defn build-cfn-domain-cold-storage-options-property-builder
  "The build-cfn-domain-cold-storage-options-property-builder function updates a CfnDomain$ColdStorageOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$ColdStorageOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnDomain$ColdStorageOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-domain-cold-storage-options-property-builder
  ""
  [id config]
  (build-cfn-domain-cold-storage-options-property-builder (new CfnDomain$ColdStorageOptionsProperty$Builder) id config))


(defn build-cfn-domain-domain-endpoint-options-property-builder
  "The build-cfn-domain-domain-endpoint-options-property-builder function updates a CfnDomain$DomainEndpointOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$DomainEndpointOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-endpoint` |
| `customEndpointCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-endpoint-certificate-arn` |
| `customEndpointEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-endpoint-enabled` |
| `enforceHttps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enforce-https` |
| `tlsSecurityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-security-policy` |
"
  [^CfnDomain$DomainEndpointOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :custom-endpoint)]
    (. builder customEndpoint data))
  (when-let [data (lookup-entry config id :custom-endpoint-certificate-arn)]
    (. builder customEndpointCertificateArn data))
  (when-let [data (lookup-entry config id :custom-endpoint-enabled)]
    (. builder customEndpointEnabled data))
  (when-let [data (lookup-entry config id :enforce-https)]
    (. builder enforceHttps data))
  (when-let [data (lookup-entry config id :tls-security-policy)]
    (. builder tlsSecurityPolicy data))
  (.build builder))


(defn cfn-domain-domain-endpoint-options-property-builder
  ""
  [id config]
  (build-cfn-domain-domain-endpoint-options-property-builder (new CfnDomain$DomainEndpointOptionsProperty$Builder) id config))


(defn build-cfn-domain-ebs-options-property-builder
  "The build-cfn-domain-ebs-options-property-builder function updates a CfnDomain$EBSOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$EBSOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-enabled` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |
"
  [^CfnDomain$EBSOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :ebs-enabled)]
    (. builder ebsEnabled data))
  (when-let [data (lookup-entry config id :iops)]
    (. builder iops data))
  (when-let [data (lookup-entry config id :volume-size)]
    (. builder volumeSize data))
  (when-let [data (lookup-entry config id :volume-type)]
    (. builder volumeType data))
  (.build builder))


(defn cfn-domain-ebs-options-property-builder
  ""
  [id config]
  (build-cfn-domain-ebs-options-property-builder (new CfnDomain$EBSOptionsProperty$Builder) id config))


(defn build-cfn-domain-elasticsearch-cluster-config-property-builder
  "The build-cfn-domain-elasticsearch-cluster-config-property-builder function updates a CfnDomain$ElasticsearchClusterConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$ElasticsearchClusterConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coldStorageOptions` | software.amazon.awscdk.services.elasticsearch.CfnDomain$ColdStorageOptionsProperty | [[cdk.support/lookup-entry]] | `:cold-storage-options` |
| `dedicatedMasterCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dedicated-master-count` |
| `dedicatedMasterEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dedicated-master-enabled` |
| `dedicatedMasterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dedicated-master-type` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `warmCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:warm-count` |
| `warmEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:warm-enabled` |
| `warmType` | java.lang.String | [[cdk.support/lookup-entry]] | `:warm-type` |
| `zoneAwarenessConfig` | software.amazon.awscdk.services.elasticsearch.CfnDomain$ZoneAwarenessConfigProperty | [[cdk.support/lookup-entry]] | `:zone-awareness-config` |
| `zoneAwarenessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:zone-awareness-enabled` |
"
  [^CfnDomain$ElasticsearchClusterConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cold-storage-options)]
    (. builder coldStorageOptions data))
  (when-let [data (lookup-entry config id :dedicated-master-count)]
    (. builder dedicatedMasterCount data))
  (when-let [data (lookup-entry config id :dedicated-master-enabled)]
    (. builder dedicatedMasterEnabled data))
  (when-let [data (lookup-entry config id :dedicated-master-type)]
    (. builder dedicatedMasterType data))
  (when-let [data (lookup-entry config id :instance-count)]
    (. builder instanceCount data))
  (when-let [data (lookup-entry config id :instance-type)]
    (. builder instanceType data))
  (when-let [data (lookup-entry config id :warm-count)]
    (. builder warmCount data))
  (when-let [data (lookup-entry config id :warm-enabled)]
    (. builder warmEnabled data))
  (when-let [data (lookup-entry config id :warm-type)]
    (. builder warmType data))
  (when-let [data (lookup-entry config id :zone-awareness-config)]
    (. builder zoneAwarenessConfig data))
  (when-let [data (lookup-entry config id :zone-awareness-enabled)]
    (. builder zoneAwarenessEnabled data))
  (.build builder))


(defn cfn-domain-elasticsearch-cluster-config-property-builder
  ""
  [id config]
  (build-cfn-domain-elasticsearch-cluster-config-property-builder (new CfnDomain$ElasticsearchClusterConfigProperty$Builder) id config))


(defn build-cfn-domain-encryption-at-rest-options-property-builder
  "The build-cfn-domain-encryption-at-rest-options-property-builder function updates a CfnDomain$EncryptionAtRestOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$EncryptionAtRestOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
"
  [^CfnDomain$EncryptionAtRestOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-let [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (.build builder))


(defn cfn-domain-encryption-at-rest-options-property-builder
  ""
  [id config]
  (build-cfn-domain-encryption-at-rest-options-property-builder (new CfnDomain$EncryptionAtRestOptionsProperty$Builder) id config))


(defn build-cfn-domain-log-publishing-option-property-builder
  "The build-cfn-domain-log-publishing-option-property-builder function updates a CfnDomain$LogPublishingOptionProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$LogPublishingOptionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-log-group-arn` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnDomain$LogPublishingOptionProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-logs-log-group-arn)]
    (. builder cloudWatchLogsLogGroupArn data))
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-domain-log-publishing-option-property-builder
  ""
  [id config]
  (build-cfn-domain-log-publishing-option-property-builder (new CfnDomain$LogPublishingOptionProperty$Builder) id config))


(defn build-cfn-domain-master-user-options-property-builder
  "The build-cfn-domain-master-user-options-property-builder function updates a CfnDomain$MasterUserOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$MasterUserOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `masterUserArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-arn` |
| `masterUserName` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-name` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |
"
  [^CfnDomain$MasterUserOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :master-user-arn)]
    (. builder masterUserArn data))
  (when-let [data (lookup-entry config id :master-user-name)]
    (. builder masterUserName data))
  (when-let [data (lookup-entry config id :master-user-password)]
    (. builder masterUserPassword data))
  (.build builder))


(defn cfn-domain-master-user-options-property-builder
  ""
  [id config]
  (build-cfn-domain-master-user-options-property-builder (new CfnDomain$MasterUserOptionsProperty$Builder) id config))


(defn build-cfn-domain-node-to-node-encryption-options-property-builder
  "The build-cfn-domain-node-to-node-encryption-options-property-builder function updates a CfnDomain$NodeToNodeEncryptionOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$NodeToNodeEncryptionOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
"
  [^CfnDomain$NodeToNodeEncryptionOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (.build builder))


(defn cfn-domain-node-to-node-encryption-options-property-builder
  ""
  [id config]
  (build-cfn-domain-node-to-node-encryption-options-property-builder (new CfnDomain$NodeToNodeEncryptionOptionsProperty$Builder) id config))


(defn build-cfn-domain-props-builder
  "The build-cfn-domain-props-builder function updates a CfnDomainProps$Builder instance using the provided configuration.
  The function takes the CfnDomainProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicies` | java.lang.Object | [[cdk.support/lookup-entry]] | `:access-policies` |
| `advancedOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:advanced-options` |
| `advancedSecurityOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:advanced-security-options` |
| `cognitoOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cognito-options` |
| `domainArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-arn` |
| `domainEndpointOptions` | software.amazon.awscdk.services.elasticsearch.CfnDomain$DomainEndpointOptionsProperty | [[cdk.support/lookup-entry]] | `:domain-endpoint-options` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `ebsOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-options` |
| `elasticsearchClusterConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:elasticsearch-cluster-config` |
| `elasticsearchVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:elasticsearch-version` |
| `encryptionAtRestOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-at-rest-options` |
| `logPublishingOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:log-publishing-options` |
| `nodeToNodeEncryptionOptions` | software.amazon.awscdk.services.elasticsearch.CfnDomain$NodeToNodeEncryptionOptionsProperty | [[cdk.support/lookup-entry]] | `:node-to-node-encryption-options` |
| `snapshotOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshot-options` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpcOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-options` |
"
  [^CfnDomainProps$Builder builder id config]
  (when-let [data (lookup-entry config id :access-policies)]
    (. builder accessPolicies data))
  (when-let [data (lookup-entry config id :advanced-options)]
    (. builder advancedOptions data))
  (when-let [data (lookup-entry config id :advanced-security-options)]
    (. builder advancedSecurityOptions data))
  (when-let [data (lookup-entry config id :cognito-options)]
    (. builder cognitoOptions data))
  (when-let [data (lookup-entry config id :domain-arn)]
    (. builder domainArn data))
  (when-let [data (lookup-entry config id :domain-endpoint-options)]
    (. builder domainEndpointOptions data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :ebs-options)]
    (. builder ebsOptions data))
  (when-let [data (lookup-entry config id :elasticsearch-cluster-config)]
    (. builder elasticsearchClusterConfig data))
  (when-let [data (lookup-entry config id :elasticsearch-version)]
    (. builder elasticsearchVersion data))
  (when-let [data (lookup-entry config id :encryption-at-rest-options)]
    (. builder encryptionAtRestOptions data))
  (when-let [data (lookup-entry config id :log-publishing-options)]
    (. builder logPublishingOptions data))
  (when-let [data (lookup-entry config id :node-to-node-encryption-options)]
    (. builder nodeToNodeEncryptionOptions data))
  (when-let [data (lookup-entry config id :snapshot-options)]
    (. builder snapshotOptions data))
  (when-let [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-let [data (lookup-entry config id :vpc-options)]
    (. builder vpcOptions data))
  (.build builder))


(defn cfn-domain-props-builder
  ""
  [id config]
  (build-cfn-domain-props-builder (new CfnDomainProps$Builder) id config))


(defn build-cfn-domain-snapshot-options-property-builder
  "The build-cfn-domain-snapshot-options-property-builder function updates a CfnDomain$SnapshotOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$SnapshotOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automatedSnapshotStartHour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automated-snapshot-start-hour` |
"
  [^CfnDomain$SnapshotOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :automated-snapshot-start-hour)]
    (. builder automatedSnapshotStartHour data))
  (.build builder))


(defn cfn-domain-snapshot-options-property-builder
  ""
  [id config]
  (build-cfn-domain-snapshot-options-property-builder (new CfnDomain$SnapshotOptionsProperty$Builder) id config))


(defn build-cfn-domain-vpc-options-property-builder
  "The build-cfn-domain-vpc-options-property-builder function updates a CfnDomain$VPCOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$VPCOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |
"
  [^CfnDomain$VPCOptionsProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :security-group-ids)]
    (. builder securityGroupIds data))
  (when-let [data (lookup-entry config id :subnet-ids)]
    (. builder subnetIds data))
  (.build builder))


(defn cfn-domain-vpc-options-property-builder
  ""
  [id config]
  (build-cfn-domain-vpc-options-property-builder (new CfnDomain$VPCOptionsProperty$Builder) id config))


(defn build-cfn-domain-zone-awareness-config-property-builder
  "The build-cfn-domain-zone-awareness-config-property-builder function updates a CfnDomain$ZoneAwarenessConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnDomain$ZoneAwarenessConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZoneCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:availability-zone-count` |
"
  [^CfnDomain$ZoneAwarenessConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :availability-zone-count)]
    (. builder availabilityZoneCount data))
  (.build builder))


(defn cfn-domain-zone-awareness-config-property-builder
  ""
  [id config]
  (build-cfn-domain-zone-awareness-config-property-builder (new CfnDomain$ZoneAwarenessConfigProperty$Builder) id config))