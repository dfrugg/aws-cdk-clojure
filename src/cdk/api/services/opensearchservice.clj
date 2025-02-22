(ns cdk.api.services.opensearchservice
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.opensearchservice package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.api.services.ec2 :refer [ebs-device-volume-type]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.opensearchservice AdvancedSecurityOptions$Builder
                                                              CapacityConfig$Builder
                                                              CfnDomain$AdvancedSecurityOptionsInputProperty$Builder
                                                              CfnDomain$Builder
                                                              CfnDomain$ClusterConfigProperty$Builder
                                                              CfnDomain$CognitoOptionsProperty$Builder
                                                              CfnDomain$ColdStorageOptionsProperty$Builder
                                                              CfnDomain$DomainEndpointOptionsProperty$Builder
                                                              CfnDomain$EBSOptionsProperty$Builder
                                                              CfnDomain$EncryptionAtRestOptionsProperty$Builder
                                                              CfnDomain$IdpProperty$Builder
                                                              CfnDomain$LogPublishingOptionProperty$Builder
                                                              CfnDomain$MasterUserOptionsProperty$Builder
                                                              CfnDomain$NodeToNodeEncryptionOptionsProperty$Builder
                                                              CfnDomain$OffPeakWindowOptionsProperty$Builder
                                                              CfnDomain$OffPeakWindowProperty$Builder
                                                              CfnDomain$SAMLOptionsProperty$Builder
                                                              CfnDomain$ServiceSoftwareOptionsProperty$Builder
                                                              CfnDomain$SnapshotOptionsProperty$Builder
                                                              CfnDomain$SoftwareUpdateOptionsProperty$Builder
                                                              CfnDomain$VPCOptionsProperty$Builder
                                                              CfnDomain$WindowStartTimeProperty$Builder
                                                              CfnDomain$ZoneAwarenessConfigProperty$Builder
                                                              CfnDomainProps$Builder
                                                              CognitoOptions$Builder
                                                              CustomEndpointOptions$Builder
                                                              Domain$Builder
                                                              DomainAttributes$Builder
                                                              DomainProps$Builder
                                                              EbsOptions$Builder
                                                              EncryptionAtRestOptions$Builder
                                                              IpAddressType
                                                              LoggingOptions$Builder
                                                              SAMLOptionsProperty$Builder
                                                              TLSSecurityPolicy
                                                              WindowStartTime$Builder
                                                              ZoneAwarenessConfig$Builder]))


(defn ip-address-type
  "The `ip-address-type` function data interprets values in the provided config data into a 
`IpAddressType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `IpAddressType` - the value is returned.
* is `:ipv4` - `IpAddressType/IPV4` is returned
* is `:dual-stack` - `IpAddressType/DUAL_STACK` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? IpAddressType data) data
      (= :ipv4 data) IpAddressType/IPV4
      (= :dual-stack data) IpAddressType/DUAL_STACK)))


(defn tls-security-policy
  "The `tls-security-policy` function data interprets values in the provided config data into a 
`TLSSecurityPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TLSSecurityPolicy` - the value is returned.
* is `:tls-1-2-pfs` - `TLSSecurityPolicy/TLS_1_2_PFS` is returned
* is `:tls-1-2` - `TLSSecurityPolicy/TLS_1_2` is returned
* is `:tls-1-0` - `TLSSecurityPolicy/TLS_1_0` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TLSSecurityPolicy data) data
      (= :tls-1-2-pfs data) TLSSecurityPolicy/TLS_1_2_PFS
      (= :tls-1-2 data) TLSSecurityPolicy/TLS_1_2
      (= :tls-1-0 data) TLSSecurityPolicy/TLS_1_0)))


(defn advanced-security-options-builder
  "The advanced-security-options-builder function buildes out new instances of 
AdvancedSecurityOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `masterUserArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-arn` |
| `masterUserName` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-name` |
| `masterUserPassword` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:master-user-password` |
| `samlAuthenticationEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:saml-authentication-enabled` |
| `samlAuthenticationOptions` | software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty | [[cdk.support/lookup-entry]] | `:saml-authentication-options` |"
  [stack id config]
  (let [builder (AdvancedSecurityOptions$Builder.)]
    (when-let [data (lookup-entry config id :master-user-arn)]
      (. builder masterUserArn data))
    (when-let [data (lookup-entry config id :master-user-name)]
      (. builder masterUserName data))
    (when-let [data (lookup-entry config id :master-user-password)]
      (. builder masterUserPassword data))
    (when-let [data (lookup-entry config id :saml-authentication-enabled)]
      (. builder samlAuthenticationEnabled data))
    (when-let [data (lookup-entry config id :saml-authentication-options)]
      (. builder samlAuthenticationOptions data))
    (.build builder)))


(defn capacity-config-builder
  "The capacity-config-builder function buildes out new instances of 
CapacityConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataNodeInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-node-instance-type` |
| `dataNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:data-nodes` |
| `masterNodeInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-node-instance-type` |
| `masterNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:master-nodes` |
| `multiAzWithStandbyEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-az-with-standby-enabled` |
| `warmInstanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:warm-instance-type` |
| `warmNodes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:warm-nodes` |"
  [stack id config]
  (let [builder (CapacityConfig$Builder.)]
    (when-let [data (lookup-entry config id :data-node-instance-type)]
      (. builder dataNodeInstanceType data))
    (when-let [data (lookup-entry config id :data-nodes)]
      (. builder dataNodes data))
    (when-let [data (lookup-entry config id :master-node-instance-type)]
      (. builder masterNodeInstanceType data))
    (when-let [data (lookup-entry config id :master-nodes)]
      (. builder masterNodes data))
    (when-let [data (lookup-entry config id :multi-az-with-standby-enabled)]
      (. builder multiAzWithStandbyEnabled data))
    (when-let [data (lookup-entry config id :warm-instance-type)]
      (. builder warmInstanceType data))
    (when-let [data (lookup-entry config id :warm-nodes)]
      (. builder warmNodes data))
    (.build builder)))


(defn cfn-domain-advanced-security-options-input-property-builder
  "The cfn-domain-advanced-security-options-input-property-builder function buildes out new instances of 
CfnDomain$AdvancedSecurityOptionsInputProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `anonymousAuthDisableDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:anonymous-auth-disable-date` |
| `anonymousAuthEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:anonymous-auth-enabled` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `internalUserDatabaseEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:internal-user-database-enabled` |
| `masterUserOptions` | software.amazon.awscdk.services.opensearchservice.CfnDomain$MasterUserOptionsProperty | [[cdk.support/lookup-entry]] | `:master-user-options` |
| `samlOptions` | software.amazon.awscdk.services.opensearchservice.CfnDomain$SAMLOptionsProperty | [[cdk.support/lookup-entry]] | `:saml-options` |"
  [stack id config]
  (let [builder (CfnDomain$AdvancedSecurityOptionsInputProperty$Builder.)]
    (when-let [data (lookup-entry config id :anonymous-auth-disable-date)]
      (. builder anonymousAuthDisableDate data))
    (when-let [data (lookup-entry config id :anonymous-auth-enabled)]
      (. builder anonymousAuthEnabled data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :internal-user-database-enabled)]
      (. builder internalUserDatabaseEnabled data))
    (when-let [data (lookup-entry config id :master-user-options)]
      (. builder masterUserOptions data))
    (when-let [data (lookup-entry config id :saml-options)]
      (. builder samlOptions data))
    (.build builder)))


(defn cfn-domain-builder
  "The cfn-domain-builder function buildes out new instances of 
CfnDomain$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicies` | java.lang.Object | [[cdk.support/lookup-entry]] | `:access-policies` |
| `advancedOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:advanced-options` |
| `advancedSecurityOptions` | software.amazon.awscdk.services.opensearchservice.CfnDomain$AdvancedSecurityOptionsInputProperty | [[cdk.support/lookup-entry]] | `:advanced-security-options` |
| `clusterConfig` | software.amazon.awscdk.services.opensearchservice.CfnDomain$ClusterConfigProperty | [[cdk.support/lookup-entry]] | `:cluster-config` |
| `cognitoOptions` | software.amazon.awscdk.services.opensearchservice.CfnDomain$CognitoOptionsProperty | [[cdk.support/lookup-entry]] | `:cognito-options` |
| `domainArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-arn` |
| `domainEndpointOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:domain-endpoint-options` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `ebsOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-options` |
| `encryptionAtRestOptions` | software.amazon.awscdk.services.opensearchservice.CfnDomain$EncryptionAtRestOptionsProperty | [[cdk.support/lookup-entry]] | `:encryption-at-rest-options` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `logPublishingOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:log-publishing-options` |
| `nodeToNodeEncryptionOptions` | software.amazon.awscdk.services.opensearchservice.CfnDomain$NodeToNodeEncryptionOptionsProperty | [[cdk.support/lookup-entry]] | `:node-to-node-encryption-options` |
| `offPeakWindowOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:off-peak-window-options` |
| `snapshotOptions` | software.amazon.awscdk.services.opensearchservice.CfnDomain$SnapshotOptionsProperty | [[cdk.support/lookup-entry]] | `:snapshot-options` |
| `softwareUpdateOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:software-update-options` |
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
    (when-let [data (lookup-entry config id :cluster-config)]
      (. builder clusterConfig data))
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
    (when-let [data (lookup-entry config id :encryption-at-rest-options)]
      (. builder encryptionAtRestOptions data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :log-publishing-options)]
      (. builder logPublishingOptions data))
    (when-let [data (lookup-entry config id :node-to-node-encryption-options)]
      (. builder nodeToNodeEncryptionOptions data))
    (when-let [data (lookup-entry config id :off-peak-window-options)]
      (. builder offPeakWindowOptions data))
    (when-let [data (lookup-entry config id :snapshot-options)]
      (. builder snapshotOptions data))
    (when-let [data (lookup-entry config id :software-update-options)]
      (. builder softwareUpdateOptions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-options)]
      (. builder vpcOptions data))
    (.build builder)))


(defn cfn-domain-cluster-config-property-builder
  "The cfn-domain-cluster-config-property-builder function buildes out new instances of 
CfnDomain$ClusterConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `coldStorageOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cold-storage-options` |
| `dedicatedMasterCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:dedicated-master-count` |
| `dedicatedMasterEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:dedicated-master-enabled` |
| `dedicatedMasterType` | java.lang.String | [[cdk.support/lookup-entry]] | `:dedicated-master-type` |
| `instanceCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:instance-count` |
| `instanceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-type` |
| `multiAzWithStandbyEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-az-with-standby-enabled` |
| `warmCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:warm-count` |
| `warmEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:warm-enabled` |
| `warmType` | java.lang.String | [[cdk.support/lookup-entry]] | `:warm-type` |
| `zoneAwarenessConfig` | software.amazon.awscdk.services.opensearchservice.CfnDomain$ZoneAwarenessConfigProperty | [[cdk.support/lookup-entry]] | `:zone-awareness-config` |
| `zoneAwarenessEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:zone-awareness-enabled` |"
  [stack id config]
  (let [builder (CfnDomain$ClusterConfigProperty$Builder.)]
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
    (when-let [data (lookup-entry config id :multi-az-with-standby-enabled)]
      (. builder multiAzWithStandbyEnabled data))
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


(defn cfn-domain-cognito-options-property-builder
  "The cfn-domain-cognito-options-property-builder function buildes out new instances of 
CfnDomain$CognitoOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
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
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
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
| `customEndpointEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:custom-endpoint-enabled` |
| `enforceHttps` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-https` |
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
| `ebsEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-enabled` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | java.lang.String | [[cdk.support/lookup-entry]] | `:volume-type` |"
  [stack id config]
  (let [builder (CfnDomain$EBSOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :ebs-enabled)]
      (. builder ebsEnabled data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (lookup-entry config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn cfn-domain-encryption-at-rest-options-property-builder
  "The cfn-domain-encryption-at-rest-options-property-builder function buildes out new instances of 
CfnDomain$EncryptionAtRestOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |"
  [stack id config]
  (let [builder (CfnDomain$EncryptionAtRestOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (.build builder)))


(defn cfn-domain-idp-property-builder
  "The cfn-domain-idp-property-builder function buildes out new instances of 
CfnDomain$IdpProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `entityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:entity-id` |
| `metadataContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:metadata-content` |"
  [stack id config]
  (let [builder (CfnDomain$IdpProperty$Builder.)]
    (when-let [data (lookup-entry config id :entity-id)]
      (. builder entityId data))
    (when-let [data (lookup-entry config id :metadata-content)]
      (. builder metadataContent data))
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
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (CfnDomain$NodeToNodeEncryptionOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))


(defn cfn-domain-off-peak-window-options-property-builder
  "The cfn-domain-off-peak-window-options-property-builder function buildes out new instances of 
CfnDomain$OffPeakWindowOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `offPeakWindow` | software.amazon.awscdk.services.opensearchservice.CfnDomain$OffPeakWindowProperty | [[cdk.support/lookup-entry]] | `:off-peak-window` |"
  [stack id config]
  (let [builder (CfnDomain$OffPeakWindowOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :off-peak-window)]
      (. builder offPeakWindow data))
    (.build builder)))


(defn cfn-domain-off-peak-window-property-builder
  "The cfn-domain-off-peak-window-property-builder function buildes out new instances of 
CfnDomain$OffPeakWindowProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `windowStartTime` | software.amazon.awscdk.services.opensearchservice.CfnDomain$WindowStartTimeProperty | [[cdk.support/lookup-entry]] | `:window-start-time` |"
  [stack id config]
  (let [builder (CfnDomain$OffPeakWindowProperty$Builder.)]
    (when-let [data (lookup-entry config id :window-start-time)]
      (. builder windowStartTime data))
    (.build builder)))


(defn cfn-domain-props-builder
  "The cfn-domain-props-builder function buildes out new instances of 
CfnDomainProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicies` | java.lang.Object | [[cdk.support/lookup-entry]] | `:access-policies` |
| `advancedOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:advanced-options` |
| `advancedSecurityOptions` | software.amazon.awscdk.services.opensearchservice.CfnDomain$AdvancedSecurityOptionsInputProperty | [[cdk.support/lookup-entry]] | `:advanced-security-options` |
| `clusterConfig` | software.amazon.awscdk.services.opensearchservice.CfnDomain$ClusterConfigProperty | [[cdk.support/lookup-entry]] | `:cluster-config` |
| `cognitoOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cognito-options` |
| `domainArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-arn` |
| `domainEndpointOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:domain-endpoint-options` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `ebsOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:ebs-options` |
| `encryptionAtRestOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:encryption-at-rest-options` |
| `engineVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:engine-version` |
| `ipAddressType` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address-type` |
| `logPublishingOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:log-publishing-options` |
| `nodeToNodeEncryptionOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:node-to-node-encryption-options` |
| `offPeakWindowOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:off-peak-window-options` |
| `snapshotOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:snapshot-options` |
| `softwareUpdateOptions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:software-update-options` |
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
    (when-let [data (lookup-entry config id :cluster-config)]
      (. builder clusterConfig data))
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
    (when-let [data (lookup-entry config id :encryption-at-rest-options)]
      (. builder encryptionAtRestOptions data))
    (when-let [data (lookup-entry config id :engine-version)]
      (. builder engineVersion data))
    (when-let [data (lookup-entry config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :log-publishing-options)]
      (. builder logPublishingOptions data))
    (when-let [data (lookup-entry config id :node-to-node-encryption-options)]
      (. builder nodeToNodeEncryptionOptions data))
    (when-let [data (lookup-entry config id :off-peak-window-options)]
      (. builder offPeakWindowOptions data))
    (when-let [data (lookup-entry config id :snapshot-options)]
      (. builder snapshotOptions data))
    (when-let [data (lookup-entry config id :software-update-options)]
      (. builder softwareUpdateOptions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc-options)]
      (. builder vpcOptions data))
    (.build builder)))


(defn cfn-domain-saml-options-property-builder
  "The cfn-domain-saml-options-property-builder function buildes out new instances of 
CfnDomain$SAMLOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `idp` | software.amazon.awscdk.services.opensearchservice.CfnDomain$IdpProperty | [[cdk.support/lookup-entry]] | `:idp` |
| `masterBackendRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-backend-role` |
| `masterUserName` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-name` |
| `rolesKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:roles-key` |
| `sessionTimeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session-timeout-minutes` |
| `subjectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject-key` |"
  [stack id config]
  (let [builder (CfnDomain$SAMLOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :idp)]
      (. builder idp data))
    (when-let [data (lookup-entry config id :master-backend-role)]
      (. builder masterBackendRole data))
    (when-let [data (lookup-entry config id :master-user-name)]
      (. builder masterUserName data))
    (when-let [data (lookup-entry config id :roles-key)]
      (. builder rolesKey data))
    (when-let [data (lookup-entry config id :session-timeout-minutes)]
      (. builder sessionTimeoutMinutes data))
    (when-let [data (lookup-entry config id :subject-key)]
      (. builder subjectKey data))
    (.build builder)))


(defn cfn-domain-service-software-options-property-builder
  "The cfn-domain-service-software-options-property-builder function buildes out new instances of 
CfnDomain$ServiceSoftwareOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automatedUpdateDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:automated-update-date` |
| `cancellable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cancellable` |
| `currentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:current-version` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `newVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:new-version` |
| `optionalDeployment` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:optional-deployment` |
| `updateAvailable` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:update-available` |
| `updateStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-status` |"
  [stack id config]
  (let [builder (CfnDomain$ServiceSoftwareOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :automated-update-date)]
      (. builder automatedUpdateDate data))
    (when-let [data (lookup-entry config id :cancellable)]
      (. builder cancellable data))
    (when-let [data (lookup-entry config id :current-version)]
      (. builder currentVersion data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :new-version)]
      (. builder newVersion data))
    (when-let [data (lookup-entry config id :optional-deployment)]
      (. builder optionalDeployment data))
    (when-let [data (lookup-entry config id :update-available)]
      (. builder updateAvailable data))
    (when-let [data (lookup-entry config id :update-status)]
      (. builder updateStatus data))
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


(defn cfn-domain-software-update-options-property-builder
  "The cfn-domain-software-update-options-property-builder function buildes out new instances of 
CfnDomain$SoftwareUpdateOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoSoftwareUpdateEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-software-update-enabled` |"
  [stack id config]
  (let [builder (CfnDomain$SoftwareUpdateOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-software-update-enabled)]
      (. builder autoSoftwareUpdateEnabled data))
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


(defn cfn-domain-window-start-time-property-builder
  "The cfn-domain-window-start-time-property-builder function buildes out new instances of 
CfnDomain$WindowStartTimeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hours` |
| `minutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minutes` |"
  [stack id config]
  (let [builder (CfnDomain$WindowStartTimeProperty$Builder.)]
    (when-let [data (lookup-entry config id :hours)]
      (. builder hours data))
    (when-let [data (lookup-entry config id :minutes)]
      (. builder minutes data))
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


(defn cognito-options-builder
  "The cognito-options-builder function buildes out new instances of 
CognitoOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `identityPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:identity-pool-id` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
| `userPoolId` | java.lang.String | [[cdk.support/lookup-entry]] | `:user-pool-id` |"
  [stack id config]
  (let [builder (CognitoOptions$Builder.)]
    (when-let [data (lookup-entry config id :identity-pool-id)]
      (. builder identityPoolId data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (when-let [data (lookup-entry config id :user-pool-id)]
      (. builder userPoolId data))
    (.build builder)))


(defn custom-endpoint-options-builder
  "The custom-endpoint-options-builder function buildes out new instances of 
CustomEndpointOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `hostedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:hosted-zone` |"
  [stack id config]
  (let [builder (CustomEndpointOptions$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :hosted-zone)]
      (. builder hostedZone data))
    (.build builder)))


(defn domain-attributes-builder
  "The domain-attributes-builder function buildes out new instances of 
DomainAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-arn` |
| `domainEndpoint` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-endpoint` |"
  [stack id config]
  (let [builder (DomainAttributes$Builder.)]
    (when-let [data (lookup-entry config id :domain-arn)]
      (. builder domainArn data))
    (when-let [data (lookup-entry config id :domain-endpoint)]
      (. builder domainEndpoint data))
    (.build builder)))


(defn domain-builder
  "The domain-builder function buildes out new instances of 
Domain$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:access-policies` |
| `advancedOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:advanced-options` |
| `automatedSnapshotStartHour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automated-snapshot-start-hour` |
| `capacity` | software.amazon.awscdk.services.opensearchservice.CapacityConfig | [[cdk.support/lookup-entry]] | `:capacity` |
| `cognitoDashboardsAuth` | software.amazon.awscdk.services.opensearchservice.CognitoOptions | [[cdk.support/lookup-entry]] | `:cognito-dashboards-auth` |
| `coldStorageEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cold-storage-enabled` |
| `customEndpoint` | software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions | [[cdk.support/lookup-entry]] | `:custom-endpoint` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `ebs` | software.amazon.awscdk.services.opensearchservice.EbsOptions | [[cdk.support/lookup-entry]] | `:ebs` |
| `enableAutoSoftwareUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-auto-software-update` |
| `enableVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-version-upgrade` |
| `encryptionAtRest` | software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions | [[cdk.support/lookup-entry]] | `:encryption-at-rest` |
| `enforceHttps` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-https` |
| `fineGrainedAccessControl` | software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions | [[cdk.support/lookup-entry]] | `:fine-grained-access-control` |
| `ipAddressType` | software.amazon.awscdk.services.opensearchservice.IpAddressType | [[cdk.api.services.opensearchservice/ip-address-type]] | `:ip-address-type` |
| `logging` | software.amazon.awscdk.services.opensearchservice.LoggingOptions | [[cdk.support/lookup-entry]] | `:logging` |
| `nodeToNodeEncryption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:node-to-node-encryption` |
| `offPeakWindowEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:off-peak-window-enabled` |
| `offPeakWindowStart` | software.amazon.awscdk.services.opensearchservice.WindowStartTime | [[cdk.support/lookup-entry]] | `:off-peak-window-start` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `suppressLogsResourcePolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:suppress-logs-resource-policy` |
| `tlsSecurityPolicy` | software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy | [[cdk.api.services.opensearchservice/tls-security-policy]] | `:tls-security-policy` |
| `useUnsignedBasicAuth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-unsigned-basic-auth` |
| `version` | software.amazon.awscdk.services.opensearchservice.EngineVersion | [[cdk.support/lookup-entry]] | `:version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `zoneAwareness` | software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig | [[cdk.support/lookup-entry]] | `:zone-awareness` |"
  [stack id config]
  (let [builder (Domain$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-policies)]
      (. builder accessPolicies data))
    (when-let [data (lookup-entry config id :advanced-options)]
      (. builder advancedOptions data))
    (when-let [data (lookup-entry config id :automated-snapshot-start-hour)]
      (. builder automatedSnapshotStartHour data))
    (when-let [data (lookup-entry config id :capacity)]
      (. builder capacity data))
    (when-let [data (lookup-entry config id :cognito-dashboards-auth)]
      (. builder cognitoDashboardsAuth data))
    (when-let [data (lookup-entry config id :cold-storage-enabled)]
      (. builder coldStorageEnabled data))
    (when-let [data (lookup-entry config id :custom-endpoint)]
      (. builder customEndpoint data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :ebs)]
      (. builder ebs data))
    (when-let [data (lookup-entry config id :enable-auto-software-update)]
      (. builder enableAutoSoftwareUpdate data))
    (when-let [data (lookup-entry config id :enable-version-upgrade)]
      (. builder enableVersionUpgrade data))
    (when-let [data (lookup-entry config id :encryption-at-rest)]
      (. builder encryptionAtRest data))
    (when-let [data (lookup-entry config id :enforce-https)]
      (. builder enforceHttps data))
    (when-let [data (lookup-entry config id :fine-grained-access-control)]
      (. builder fineGrainedAccessControl data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :node-to-node-encryption)]
      (. builder nodeToNodeEncryption data))
    (when-let [data (lookup-entry config id :off-peak-window-enabled)]
      (. builder offPeakWindowEnabled data))
    (when-let [data (lookup-entry config id :off-peak-window-start)]
      (. builder offPeakWindowStart data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :suppress-logs-resource-policy)]
      (. builder suppressLogsResourcePolicy data))
    (when-let [data (tls-security-policy config id :tls-security-policy)]
      (. builder tlsSecurityPolicy data))
    (when-let [data (lookup-entry config id :use-unsigned-basic-auth)]
      (. builder useUnsignedBasicAuth data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (when-let [data (lookup-entry config id :zone-awareness)]
      (. builder zoneAwareness data))
    (.build builder)))


(defn domain-props-builder
  "The domain-props-builder function buildes out new instances of 
DomainProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:access-policies` |
| `advancedOptions` | java.util.Map | [[cdk.support/lookup-entry]] | `:advanced-options` |
| `automatedSnapshotStartHour` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automated-snapshot-start-hour` |
| `capacity` | software.amazon.awscdk.services.opensearchservice.CapacityConfig | [[cdk.support/lookup-entry]] | `:capacity` |
| `cognitoDashboardsAuth` | software.amazon.awscdk.services.opensearchservice.CognitoOptions | [[cdk.support/lookup-entry]] | `:cognito-dashboards-auth` |
| `coldStorageEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cold-storage-enabled` |
| `customEndpoint` | software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions | [[cdk.support/lookup-entry]] | `:custom-endpoint` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `ebs` | software.amazon.awscdk.services.opensearchservice.EbsOptions | [[cdk.support/lookup-entry]] | `:ebs` |
| `enableAutoSoftwareUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-auto-software-update` |
| `enableVersionUpgrade` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-version-upgrade` |
| `encryptionAtRest` | software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions | [[cdk.support/lookup-entry]] | `:encryption-at-rest` |
| `enforceHttps` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enforce-https` |
| `fineGrainedAccessControl` | software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions | [[cdk.support/lookup-entry]] | `:fine-grained-access-control` |
| `ipAddressType` | software.amazon.awscdk.services.opensearchservice.IpAddressType | [[cdk.api.services.opensearchservice/ip-address-type]] | `:ip-address-type` |
| `logging` | software.amazon.awscdk.services.opensearchservice.LoggingOptions | [[cdk.support/lookup-entry]] | `:logging` |
| `nodeToNodeEncryption` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:node-to-node-encryption` |
| `offPeakWindowEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:off-peak-window-enabled` |
| `offPeakWindowStart` | software.amazon.awscdk.services.opensearchservice.WindowStartTime | [[cdk.support/lookup-entry]] | `:off-peak-window-start` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `suppressLogsResourcePolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:suppress-logs-resource-policy` |
| `tlsSecurityPolicy` | software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy | [[cdk.api.services.opensearchservice/tls-security-policy]] | `:tls-security-policy` |
| `useUnsignedBasicAuth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:use-unsigned-basic-auth` |
| `version` | software.amazon.awscdk.services.opensearchservice.EngineVersion | [[cdk.support/lookup-entry]] | `:version` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | java.util.List | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
| `zoneAwareness` | software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig | [[cdk.support/lookup-entry]] | `:zone-awareness` |"
  [stack id config]
  (let [builder (DomainProps$Builder.)]
    (when-let [data (lookup-entry config id :access-policies)]
      (. builder accessPolicies data))
    (when-let [data (lookup-entry config id :advanced-options)]
      (. builder advancedOptions data))
    (when-let [data (lookup-entry config id :automated-snapshot-start-hour)]
      (. builder automatedSnapshotStartHour data))
    (when-let [data (lookup-entry config id :capacity)]
      (. builder capacity data))
    (when-let [data (lookup-entry config id :cognito-dashboards-auth)]
      (. builder cognitoDashboardsAuth data))
    (when-let [data (lookup-entry config id :cold-storage-enabled)]
      (. builder coldStorageEnabled data))
    (when-let [data (lookup-entry config id :custom-endpoint)]
      (. builder customEndpoint data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :ebs)]
      (. builder ebs data))
    (when-let [data (lookup-entry config id :enable-auto-software-update)]
      (. builder enableAutoSoftwareUpdate data))
    (when-let [data (lookup-entry config id :enable-version-upgrade)]
      (. builder enableVersionUpgrade data))
    (when-let [data (lookup-entry config id :encryption-at-rest)]
      (. builder encryptionAtRest data))
    (when-let [data (lookup-entry config id :enforce-https)]
      (. builder enforceHttps data))
    (when-let [data (lookup-entry config id :fine-grained-access-control)]
      (. builder fineGrainedAccessControl data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :logging)]
      (. builder logging data))
    (when-let [data (lookup-entry config id :node-to-node-encryption)]
      (. builder nodeToNodeEncryption data))
    (when-let [data (lookup-entry config id :off-peak-window-enabled)]
      (. builder offPeakWindowEnabled data))
    (when-let [data (lookup-entry config id :off-peak-window-start)]
      (. builder offPeakWindowStart data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :suppress-logs-resource-policy)]
      (. builder suppressLogsResourcePolicy data))
    (when-let [data (tls-security-policy config id :tls-security-policy)]
      (. builder tlsSecurityPolicy data))
    (when-let [data (lookup-entry config id :use-unsigned-basic-auth)]
      (. builder useUnsignedBasicAuth data))
    (when-let [data (lookup-entry config id :version)]
      (. builder version data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (when-let [data (lookup-entry config id :zone-awareness)]
      (. builder zoneAwareness data))
    (.build builder)))


(defn ebs-options-builder
  "The ebs-options-builder function buildes out new instances of 
EbsOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `iops` | java.lang.Number | [[cdk.support/lookup-entry]] | `:iops` |
| `throughput` | java.lang.Number | [[cdk.support/lookup-entry]] | `:throughput` |
| `volumeSize` | java.lang.Number | [[cdk.support/lookup-entry]] | `:volume-size` |
| `volumeType` | software.amazon.awscdk.services.ec2.EbsDeviceVolumeType | [[cdk.api.services.ec2/ebs-device-volume-type]] | `:volume-type` |"
  [stack id config]
  (let [builder (EbsOptions$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :iops)]
      (. builder iops data))
    (when-let [data (lookup-entry config id :throughput)]
      (. builder throughput data))
    (when-let [data (lookup-entry config id :volume-size)]
      (. builder volumeSize data))
    (when-let [data (ebs-device-volume-type config id :volume-type)]
      (. builder volumeType data))
    (.build builder)))


(defn encryption-at-rest-options-builder
  "The encryption-at-rest-options-builder function buildes out new instances of 
EncryptionAtRestOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |"
  [stack id config]
  (let [builder (EncryptionAtRestOptions$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (.build builder)))


(defn logging-options-builder
  "The logging-options-builder function buildes out new instances of 
LoggingOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appLogEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:app-log-enabled` |
| `appLogGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:app-log-group` |
| `auditLogEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:audit-log-enabled` |
| `auditLogGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:audit-log-group` |
| `slowIndexLogEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:slow-index-log-enabled` |
| `slowIndexLogGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:slow-index-log-group` |
| `slowSearchLogEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:slow-search-log-enabled` |
| `slowSearchLogGroup` | software.amazon.awscdk.services.logs.ILogGroup | [[cdk.support/lookup-entry]] | `:slow-search-log-group` |"
  [stack id config]
  (let [builder (LoggingOptions$Builder.)]
    (when-let [data (lookup-entry config id :app-log-enabled)]
      (. builder appLogEnabled data))
    (when-let [data (lookup-entry config id :app-log-group)]
      (. builder appLogGroup data))
    (when-let [data (lookup-entry config id :audit-log-enabled)]
      (. builder auditLogEnabled data))
    (when-let [data (lookup-entry config id :audit-log-group)]
      (. builder auditLogGroup data))
    (when-let [data (lookup-entry config id :slow-index-log-enabled)]
      (. builder slowIndexLogEnabled data))
    (when-let [data (lookup-entry config id :slow-index-log-group)]
      (. builder slowIndexLogGroup data))
    (when-let [data (lookup-entry config id :slow-search-log-enabled)]
      (. builder slowSearchLogEnabled data))
    (when-let [data (lookup-entry config id :slow-search-log-group)]
      (. builder slowSearchLogGroup data))
    (.build builder)))


(defn saml-options-property-builder
  "The saml-options-property-builder function buildes out new instances of 
SAMLOptionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idpEntityId` | java.lang.String | [[cdk.support/lookup-entry]] | `:idp-entity-id` |
| `idpMetadataContent` | java.lang.String | [[cdk.support/lookup-entry]] | `:idp-metadata-content` |
| `masterBackendRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-backend-role` |
| `masterUserName` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-user-name` |
| `rolesKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:roles-key` |
| `sessionTimeoutMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:session-timeout-minutes` |
| `subjectKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:subject-key` |"
  [stack id config]
  (let [builder (SAMLOptionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :idp-entity-id)]
      (. builder idpEntityId data))
    (when-let [data (lookup-entry config id :idp-metadata-content)]
      (. builder idpMetadataContent data))
    (when-let [data (lookup-entry config id :master-backend-role)]
      (. builder masterBackendRole data))
    (when-let [data (lookup-entry config id :master-user-name)]
      (. builder masterUserName data))
    (when-let [data (lookup-entry config id :roles-key)]
      (. builder rolesKey data))
    (when-let [data (lookup-entry config id :session-timeout-minutes)]
      (. builder sessionTimeoutMinutes data))
    (when-let [data (lookup-entry config id :subject-key)]
      (. builder subjectKey data))
    (.build builder)))


(defn window-start-time-builder
  "The window-start-time-builder function buildes out new instances of 
WindowStartTime$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:hours` |
| `minutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:minutes` |"
  [stack id config]
  (let [builder (WindowStartTime$Builder.)]
    (when-let [data (lookup-entry config id :hours)]
      (. builder hours data))
    (when-let [data (lookup-entry config id :minutes)]
      (. builder minutes data))
    (.build builder)))


(defn zone-awareness-config-builder
  "The zone-awareness-config-builder function buildes out new instances of 
ZoneAwarenessConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `availabilityZoneCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:availability-zone-count` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |"
  [stack id config]
  (let [builder (ZoneAwarenessConfig$Builder.)]
    (when-let [data (lookup-entry config id :availability-zone-count)]
      (. builder availabilityZoneCount data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (.build builder)))