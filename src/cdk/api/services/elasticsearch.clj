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


(defn cfn-domain-advanced-security-options-input-property-builder
  "The cfn-domain-advanced-security-options-input-property-builder function buildes out new instances of 
CfnDomain$AdvancedSecurityOptionsInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anonymousAuthEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:anonymous-auth-enabled` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `internalUserDatabaseEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:internal-user-database-enabled` |
| `masterUserOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:master-user-options` |"
  [stack id config]
  (let [builder (CfnDomain$AdvancedSecurityOptionsInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :anonymous-auth-enabled)]
      (. builder anonymousAuthEnabled data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :internal-user-database-enabled)]
      (. builder internalUserDatabaseEnabled data))
    (when-let [data (lookup-entry config id :master-user-options)]
      (. builder masterUserOptions data))
    (.build builder)))


(defn cfn-domain-builder
  "The cfn-domain-builder function buildes out new instances of 
CfnDomain$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-options` |"
  [stack id config]
  (let [builder (CfnDomain$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-domain-cognito-options-property-builder
  "The cfn-domain-cognito-options-property-builder function buildes out new instances of 
CfnDomain$CognitoOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `identityPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-pool-id` |
| `roleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:role-arn` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |"
  [stack id config]
  (let [builder (CfnDomain$CognitoOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :identity-pool-id)]
      (. builder identityPoolId data))
    (when-let [data (lookup-entry config id :role-arn)]
      (. builder roleArn data))
    (when-let [data (lookup-entry config id :user-pool-id)]
      (. builder userPoolId data))
    (.build builder)))


(defn cfn-domain-cold-storage-options-property-builder
  "The cfn-domain-cold-storage-options-property-builder function buildes out new instances of 
CfnDomain$ColdStorageOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnDomain$ColdStorageOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-domain-domain-endpoint-options-property-builder
  "The cfn-domain-domain-endpoint-options-property-builder function buildes out new instances of 
CfnDomain$DomainEndpointOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-endpoint` |
| `customEndpointCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-endpoint-certificate-arn` |
| `customEndpointEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-endpoint-enabled` |
| `enforceHttps` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enforce-https` |
| `tlsSecurityPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:tls-security-policy` |"
  [stack id config]
  (let [builder (CfnDomain$DomainEndpointOptionsProperty$Builder.)]
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
    (.build builder)))


(defn cfn-domain-ebs-options-property-builder
  "The cfn-domain-ebs-options-property-builder function buildes out new instances of 
CfnDomain$EBSOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ebsEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:ebs-enabled` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnDomain$EBSOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :ebs-enabled)]
      (. builder ebsEnabled data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-domain-elasticsearch-cluster-config-property-builder
  "The cfn-domain-elasticsearch-cluster-config-property-builder function buildes out new instances of 
CfnDomain$ElasticsearchClusterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `zoneAwarenessEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:zone-awareness-enabled` |"
  [stack id config]
  (let [builder (CfnDomain$ElasticsearchClusterConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-domain-encryption-at-rest-options-property-builder
  "The cfn-domain-encryption-at-rest-options-property-builder function buildes out new instances of 
CfnDomain$EncryptionAtRestOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |"
  [stack id config]
  (let [builder (CfnDomain$EncryptionAtRestOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (.build builder)))


(defn cfn-domain-log-publishing-option-property-builder
  "The cfn-domain-log-publishing-option-property-builder function buildes out new instances of 
CfnDomain$LogPublishingOptionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-log-group-arn` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnDomain$LogPublishingOptionProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logs-log-group-arn)]
      (. builder cloudWatchLogsLogGroupArn data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-domain-master-user-options-property-builder
  "The cfn-domain-master-user-options-property-builder function buildes out new instances of 
CfnDomain$MasterUserOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `masterUserArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-arn` |
| `masterUserName` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-name` |
| `masterUserPassword` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-password` |"
  [stack id config]
  (let [builder (CfnDomain$MasterUserOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :master-user-arn)]
      (. builder masterUserArn data))
    (when-let [data (lookup-entry config id :master-user-name)]
      (. builder masterUserName data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (.build builder)))


(defn cfn-domain-node-to-node-encryption-options-property-builder
  "The cfn-domain-node-to-node-encryption-options-property-builder function buildes out new instances of 
CfnDomain$NodeToNodeEncryptionOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnDomain$NodeToNodeEncryptionOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-domain-props-builder
  "The cfn-domain-props-builder function buildes out new instances of 
CfnDomainProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpcOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpc-options` |"
  [stack id config]
  (let [builder (CfnDomainProps$Builder.)]
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
    (.build builder)))


(defn cfn-domain-snapshot-options-property-builder
  "The cfn-domain-snapshot-options-property-builder function buildes out new instances of 
CfnDomain$SnapshotOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automatedSnapshotStartHour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automated-snapshot-start-hour` |"
  [stack id config]
  (let [builder (CfnDomain$SnapshotOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :automated-snapshot-start-hour)]
      (. builder automatedSnapshotStartHour data))
    (.build builder)))


(defn cfn-domain-vpc-options-property-builder
  "The cfn-domain-vpc-options-property-builder function buildes out new instances of 
CfnDomain$VPCOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `securityGroupIds` | java.util.List | [[cdk.support/lookup-entry]] | `:security-group-ids` |
| `subnetIds` | java.util.List | [[cdk.support/lookup-entry]] | `:subnet-ids` |"
  [stack id config]
  (let [builder (CfnDomain$VPCOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :security-group-ids)]
      (. builder securityGroupIds data))
    (when-let [data (lookup-entry config id :subnet-ids)]
      (. builder subnetIds data))
    (.build builder)))


(defn cfn-domain-zone-awareness-config-property-builder
  "The cfn-domain-zone-awareness-config-property-builder function buildes out new instances of 
CfnDomain$ZoneAwarenessConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZoneCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:availability-zone-count` |"
  [stack id config]
  (let [builder (CfnDomain$ZoneAwarenessConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone-count)]
      (. builder availabilityZoneCount data))
    (.build builder)))