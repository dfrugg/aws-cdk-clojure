(ns cdk.api.services.secretsmanager
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.secretsmanager package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.secretsmanager AttachedSecretOptions$Builder
                                                           AttachmentTargetType
                                                           CfnResourcePolicy$Builder
                                                           CfnResourcePolicyProps$Builder
                                                           CfnRotationSchedule$Builder
                                                           CfnRotationSchedule$HostedRotationLambdaProperty$Builder
                                                           CfnRotationSchedule$RotationRulesProperty$Builder
                                                           CfnRotationScheduleProps$Builder
                                                           CfnSecret$Builder
                                                           CfnSecret$GenerateSecretStringProperty$Builder
                                                           CfnSecret$ReplicaRegionProperty$Builder
                                                           CfnSecretProps$Builder
                                                           CfnSecretTargetAttachment$Builder
                                                           CfnSecretTargetAttachmentProps$Builder
                                                           MultiUserHostedRotationOptions$Builder
                                                           ReplicaRegion$Builder
                                                           ResourcePolicy$Builder
                                                           ResourcePolicyProps$Builder
                                                           RotationSchedule$Builder
                                                           RotationScheduleOptions$Builder
                                                           RotationScheduleProps$Builder
                                                           Secret$Builder
                                                           SecretAttachmentTargetProps$Builder
                                                           SecretAttributes$Builder
                                                           SecretProps$Builder
                                                           SecretRotation$Builder
                                                           SecretRotationApplication$Builder
                                                           SecretRotationApplicationOptions$Builder
                                                           SecretRotationProps$Builder
                                                           SecretStringGenerator$Builder
                                                           SecretTargetAttachment$Builder
                                                           SecretTargetAttachmentProps$Builder
                                                           SingleUserHostedRotationOptions$Builder]))


(defn attachment-target-type
  "The `attachment-target-type` function data interprets values in the provided config data into a 
`AttachmentTargetType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `AttachmentTargetType` - the value is returned.
* is `:docdb-db-instance` - `AttachmentTargetType/DOCDB_DB_INSTANCE` is returned
* is `:rds-db-instance` - `AttachmentTargetType/RDS_DB_INSTANCE` is returned
* is `:rds-db-cluster` - `AttachmentTargetType/RDS_DB_CLUSTER` is returned
* is `:rds-db-proxy` - `AttachmentTargetType/RDS_DB_PROXY` is returned
* is `:docdb-db-cluster` - `AttachmentTargetType/DOCDB_DB_CLUSTER` is returned
* is `:redshift-cluster` - `AttachmentTargetType/REDSHIFT_CLUSTER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? AttachmentTargetType data) data
      (= :docdb-db-instance data) AttachmentTargetType/DOCDB_DB_INSTANCE
      (= :rds-db-instance data) AttachmentTargetType/RDS_DB_INSTANCE
      (= :rds-db-cluster data) AttachmentTargetType/RDS_DB_CLUSTER
      (= :rds-db-proxy data) AttachmentTargetType/RDS_DB_PROXY
      (= :docdb-db-cluster data) AttachmentTargetType/DOCDB_DB_CLUSTER
      (= :redshift-cluster data) AttachmentTargetType/REDSHIFT_CLUSTER)))


(defn attached-secret-options-builder
  "The attached-secret-options-builder function buildes out new instances of 
AttachedSecretOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `target` | software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (AttachedSecretOptions$Builder.)]
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-resource-policy-builder
  "The cfn-resource-policy-builder function buildes out new instances of 
CfnResourcePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockPublicPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-policy` |
| `resourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |"
  [stack id config]
  (let [builder (CfnResourcePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :block-public-policy)]
      (. builder blockPublicPolicy data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (lookup-entry config id :secret-id)]
      (. builder secretId data))
    (.build builder)))


(defn cfn-resource-policy-props-builder
  "The cfn-resource-policy-props-builder function buildes out new instances of 
CfnResourcePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockPublicPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-policy` |
| `resourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |"
  [stack id config]
  (let [builder (CfnResourcePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :block-public-policy)]
      (. builder blockPublicPolicy data))
    (when-let [data (lookup-entry config id :resource-policy)]
      (. builder resourcePolicy data))
    (when-let [data (lookup-entry config id :secret-id)]
      (. builder secretId data))
    (.build builder)))


(defn cfn-rotation-schedule-builder
  "The cfn-rotation-schedule-builder function buildes out new instances of 
CfnRotationSchedule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedRotationLambda` | software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule$HostedRotationLambdaProperty | [[cdk.support/lookup-entry]] | `:hosted-rotation-lambda` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `rotationLambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:rotation-lambda-arn` |
| `rotationRules` | software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule$RotationRulesProperty | [[cdk.support/lookup-entry]] | `:rotation-rules` |
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |"
  [stack id config]
  (let [builder (CfnRotationSchedule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :hosted-rotation-lambda)]
      (. builder hostedRotationLambda data))
    (when-let [data (lookup-entry config id :rotate-immediately-on-update)]
      (. builder rotateImmediatelyOnUpdate data))
    (when-let [data (lookup-entry config id :rotation-lambda-arn)]
      (. builder rotationLambdaArn data))
    (when-let [data (lookup-entry config id :rotation-rules)]
      (. builder rotationRules data))
    (when-let [data (lookup-entry config id :secret-id)]
      (. builder secretId data))
    (.build builder)))


(defn cfn-rotation-schedule-hosted-rotation-lambda-property-builder
  "The cfn-rotation-schedule-hosted-rotation-lambda-property-builder function buildes out new instances of 
CfnRotationSchedule$HostedRotationLambdaProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `masterSecretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-secret-arn` |
| `masterSecretKmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:master-secret-kms-key-arn` |
| `rotationLambdaName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rotation-lambda-name` |
| `rotationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:rotation-type` |
| `runtime` | java.lang.String | [[cdk.support/lookup-entry]] | `:runtime` |
| `superuserSecretArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:superuser-secret-arn` |
| `superuserSecretKmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:superuser-secret-kms-key-arn` |
| `vpcSecurityGroupIds` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-security-group-ids` |
| `vpcSubnetIds` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |"
  [stack id config]
  (let [builder (CfnRotationSchedule$HostedRotationLambdaProperty$Builder.)]
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :kms-key-arn)]
      (. builder kmsKeyArn data))
    (when-let [data (lookup-entry config id :master-secret-arn)]
      (. builder masterSecretArn data))
    (when-let [data (lookup-entry config id :master-secret-kms-key-arn)]
      (. builder masterSecretKmsKeyArn data))
    (when-let [data (lookup-entry config id :rotation-lambda-name)]
      (. builder rotationLambdaName data))
    (when-let [data (lookup-entry config id :rotation-type)]
      (. builder rotationType data))
    (when-let [data (lookup-entry config id :runtime)]
      (. builder runtime data))
    (when-let [data (lookup-entry config id :superuser-secret-arn)]
      (. builder superuserSecretArn data))
    (when-let [data (lookup-entry config id :superuser-secret-kms-key-arn)]
      (. builder superuserSecretKmsKeyArn data))
    (when-let [data (lookup-entry config id :vpc-security-group-ids)]
      (. builder vpcSecurityGroupIds data))
    (when-let [data (lookup-entry config id :vpc-subnet-ids)]
      (. builder vpcSubnetIds data))
    (.build builder)))


(defn cfn-rotation-schedule-props-builder
  "The cfn-rotation-schedule-props-builder function buildes out new instances of 
CfnRotationScheduleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedRotationLambda` | software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule$HostedRotationLambdaProperty | [[cdk.support/lookup-entry]] | `:hosted-rotation-lambda` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `rotationLambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:rotation-lambda-arn` |
| `rotationRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rotation-rules` |
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |"
  [stack id config]
  (let [builder (CfnRotationScheduleProps$Builder.)]
    (when-let [data (lookup-entry config id :hosted-rotation-lambda)]
      (. builder hostedRotationLambda data))
    (when-let [data (lookup-entry config id :rotate-immediately-on-update)]
      (. builder rotateImmediatelyOnUpdate data))
    (when-let [data (lookup-entry config id :rotation-lambda-arn)]
      (. builder rotationLambdaArn data))
    (when-let [data (lookup-entry config id :rotation-rules)]
      (. builder rotationRules data))
    (when-let [data (lookup-entry config id :secret-id)]
      (. builder secretId data))
    (.build builder)))


(defn cfn-rotation-schedule-rotation-rules-property-builder
  "The cfn-rotation-schedule-rotation-rules-property-builder function buildes out new instances of 
CfnRotationSchedule$RotationRulesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfterDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automatically-after-days` |
| `duration` | java.lang.String | [[cdk.support/lookup-entry]] | `:duration` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |"
  [stack id config]
  (let [builder (CfnRotationSchedule$RotationRulesProperty$Builder.)]
    (when-let [data (lookup-entry config id :automatically-after-days)]
      (. builder automaticallyAfterDays data))
    (when-let [data (lookup-entry config id :duration)]
      (. builder duration data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (.build builder)))


(defn cfn-secret-builder
  "The cfn-secret-builder function buildes out new instances of 
CfnSecret$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `generateSecretString` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:generate-secret-string` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretString` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSecret$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :generate-secret-string)]
      (. builder generateSecretString data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :replica-regions)]
      (. builder replicaRegions data))
    (when-let [data (lookup-entry config id :secret-string)]
      (. builder secretString data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-secret-generate-secret-string-property-builder
  "The cfn-secret-generate-secret-string-property-builder function buildes out new instances of 
CfnSecret$GenerateSecretStringProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `excludeLowercase` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclude-lowercase` |
| `excludeNumbers` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-numbers` |
| `excludePunctuation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclude-punctuation` |
| `excludeUppercase` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:exclude-uppercase` |
| `generateStringKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:generate-string-key` |
| `includeSpace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-space` |
| `passwordLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:password-length` |
| `requireEachIncludedType` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-each-included-type` |
| `secretStringTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-string-template` |"
  [stack id config]
  (let [builder (CfnSecret$GenerateSecretStringProperty$Builder.)]
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :exclude-lowercase)]
      (. builder excludeLowercase data))
    (when-let [data (lookup-entry config id :exclude-numbers)]
      (. builder excludeNumbers data))
    (when-let [data (lookup-entry config id :exclude-punctuation)]
      (. builder excludePunctuation data))
    (when-let [data (lookup-entry config id :exclude-uppercase)]
      (. builder excludeUppercase data))
    (when-let [data (lookup-entry config id :generate-string-key)]
      (. builder generateStringKey data))
    (when-let [data (lookup-entry config id :include-space)]
      (. builder includeSpace data))
    (when-let [data (lookup-entry config id :password-length)]
      (. builder passwordLength data))
    (when-let [data (lookup-entry config id :require-each-included-type)]
      (. builder requireEachIncludedType data))
    (when-let [data (lookup-entry config id :secret-string-template)]
      (. builder secretStringTemplate data))
    (.build builder)))


(defn cfn-secret-props-builder
  "The cfn-secret-props-builder function buildes out new instances of 
CfnSecretProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `generateSecretString` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:generate-secret-string` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicaRegions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretString` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnSecretProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :generate-secret-string)]
      (. builder generateSecretString data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :replica-regions)]
      (. builder replicaRegions data))
    (when-let [data (lookup-entry config id :secret-string)]
      (. builder secretString data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-secret-replica-region-property-builder
  "The cfn-secret-replica-region-property-builder function buildes out new instances of 
CfnSecret$ReplicaRegionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (CfnSecret$ReplicaRegionProperty$Builder.)]
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn cfn-secret-target-attachment-builder
  "The cfn-secret-target-attachment-builder function buildes out new instances of 
CfnSecretTargetAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |"
  [stack id config]
  (let [builder (CfnSecretTargetAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :secret-id)]
      (. builder secretId data))
    (when-let [data (lookup-entry config id :target-id)]
      (. builder targetId data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (.build builder)))


(defn cfn-secret-target-attachment-props-builder
  "The cfn-secret-target-attachment-props-builder function buildes out new instances of 
CfnSecretTargetAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |"
  [stack id config]
  (let [builder (CfnSecretTargetAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :secret-id)]
      (. builder secretId data))
    (when-let [data (lookup-entry config id :target-id)]
      (. builder targetId data))
    (when-let [data (lookup-entry config id :target-type)]
      (. builder targetType data))
    (.build builder)))


(defn multi-user-hosted-rotation-options-builder
  "The multi-user-hosted-rotation-options-builder function buildes out new instances of 
MultiUserHostedRotationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (MultiUserHostedRotationOptions$Builder.)]
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (when-let [data (lookup-entry config id :master-secret)]
      (. builder masterSecret data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn replica-region-builder
  "The replica-region-builder function buildes out new instances of 
ReplicaRegion$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (ReplicaRegion$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn resource-policy-builder
  "The resource-policy-builder function buildes out new instances of 
ResourcePolicy$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |"
  [stack id config]
  (let [builder (ResourcePolicy$Builder/create stack id)]
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (.build builder)))


(defn resource-policy-props-builder
  "The resource-policy-props-builder function buildes out new instances of 
ResourcePolicyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |"
  [stack id config]
  (let [builder (ResourcePolicyProps$Builder.)]
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (.build builder)))


(defn rotation-schedule-builder
  "The rotation-schedule-builder function buildes out new instances of 
RotationSchedule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `hostedRotation` | software.amazon.awscdk.services.secretsmanager.HostedRotation | [[cdk.support/lookup-entry]] | `:hosted-rotation` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `rotationLambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:rotation-lambda` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |"
  [stack id config]
  (let [builder (RotationSchedule$Builder/create stack id)]
    (when-let [data (lookup-entry config id :automatically-after)]
      (. builder automaticallyAfter data))
    (when-let [data (lookup-entry config id :hosted-rotation)]
      (. builder hostedRotation data))
    (when-let [data (lookup-entry config id :rotate-immediately-on-update)]
      (. builder rotateImmediatelyOnUpdate data))
    (when-let [data (lookup-entry config id :rotation-lambda)]
      (. builder rotationLambda data))
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (.build builder)))


(defn rotation-schedule-options-builder
  "The rotation-schedule-options-builder function buildes out new instances of 
RotationScheduleOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `hostedRotation` | software.amazon.awscdk.services.secretsmanager.HostedRotation | [[cdk.support/lookup-entry]] | `:hosted-rotation` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `rotationLambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:rotation-lambda` |"
  [stack id config]
  (let [builder (RotationScheduleOptions$Builder.)]
    (when-let [data (lookup-entry config id :automatically-after)]
      (. builder automaticallyAfter data))
    (when-let [data (lookup-entry config id :hosted-rotation)]
      (. builder hostedRotation data))
    (when-let [data (lookup-entry config id :rotate-immediately-on-update)]
      (. builder rotateImmediatelyOnUpdate data))
    (when-let [data (lookup-entry config id :rotation-lambda)]
      (. builder rotationLambda data))
    (.build builder)))


(defn rotation-schedule-props-builder
  "The rotation-schedule-props-builder function buildes out new instances of 
RotationScheduleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `hostedRotation` | software.amazon.awscdk.services.secretsmanager.HostedRotation | [[cdk.support/lookup-entry]] | `:hosted-rotation` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `rotationLambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:rotation-lambda` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |"
  [stack id config]
  (let [builder (RotationScheduleProps$Builder.)]
    (when-let [data (lookup-entry config id :automatically-after)]
      (. builder automaticallyAfter data))
    (when-let [data (lookup-entry config id :hosted-rotation)]
      (. builder hostedRotation data))
    (when-let [data (lookup-entry config id :rotate-immediately-on-update)]
      (. builder rotateImmediatelyOnUpdate data))
    (when-let [data (lookup-entry config id :rotation-lambda)]
      (. builder rotationLambda data))
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (.build builder)))


(defn secret-attachment-target-props-builder
  "The secret-attachment-target-props-builder function buildes out new instances of 
SecretAttachmentTargetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | software.amazon.awscdk.services.secretsmanager.AttachmentTargetType | [[cdk.api.services.secretsmanager/attachment-target-type]] | `:target-type` |"
  [stack id config]
  (let [builder (SecretAttachmentTargetProps$Builder.)]
    (when-let [data (lookup-entry config id :target-id)]
      (. builder targetId data))
    (when-let [data (attachment-target-type config id :target-type)]
      (. builder targetType data))
    (.build builder)))


(defn secret-attributes-builder
  "The secret-attributes-builder function buildes out new instances of 
SecretAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `secretCompleteArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-complete-arn` |
| `secretPartialArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-partial-arn` |"
  [stack id config]
  (let [builder (SecretAttributes$Builder.)]
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :secret-complete-arn)]
      (. builder secretCompleteArn data))
    (when-let [data (lookup-entry config id :secret-partial-arn)]
      (. builder secretPartialArn data))
    (.build builder)))


(defn secret-builder
  "The secret-builder function buildes out new instances of 
Secret$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `generateSecretString` | software.amazon.awscdk.services.secretsmanager.SecretStringGenerator | [[cdk.support/lookup-entry]] | `:generate-secret-string` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `secretObjectValue` | java.util.Map | [[cdk.support/lookup-entry]] | `:secret-object-value` |
| `secretStringBeta1` | software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1 | [[cdk.support/lookup-entry]] | `:secret-string-beta1` |
| `secretStringValue` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:secret-string-value` |"
  [stack id config]
  (let [builder (Secret$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :generate-secret-string)]
      (. builder generateSecretString data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :replica-regions)]
      (. builder replicaRegions data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (when-let [data (lookup-entry config id :secret-object-value)]
      (. builder secretObjectValue data))
    (when-let [data (lookup-entry config id :secret-string-beta1)]
      (. builder secretStringBeta1 data))
    (when-let [data (lookup-entry config id :secret-string-value)]
      (. builder secretStringValue data))
    (.build builder)))


(defn secret-props-builder
  "The secret-props-builder function buildes out new instances of 
SecretProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `generateSecretString` | software.amazon.awscdk.services.secretsmanager.SecretStringGenerator | [[cdk.support/lookup-entry]] | `:generate-secret-string` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretName` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-name` |
| `secretObjectValue` | java.util.Map | [[cdk.support/lookup-entry]] | `:secret-object-value` |
| `secretStringBeta1` | software.amazon.awscdk.services.secretsmanager.SecretStringValueBeta1 | [[cdk.support/lookup-entry]] | `:secret-string-beta1` |
| `secretStringValue` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:secret-string-value` |"
  [stack id config]
  (let [builder (SecretProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :generate-secret-string)]
      (. builder generateSecretString data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (when-let [data (lookup-entry config id :replica-regions)]
      (. builder replicaRegions data))
    (when-let [data (lookup-entry config id :secret-name)]
      (. builder secretName data))
    (when-let [data (lookup-entry config id :secret-object-value)]
      (. builder secretObjectValue data))
    (when-let [data (lookup-entry config id :secret-string-beta1)]
      (. builder secretStringBeta1 data))
    (when-let [data (lookup-entry config id :secret-string-value)]
      (. builder secretStringValue data))
    (.build builder)))


(defn secret-rotation-application-builder
  "The secret-rotation-application-builder function buildes out new instances of 
SecretRotationApplication$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isMultiUser` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-multi-user` |"
  [stack id config ^java.lang.String application-id ^java.lang.String semantic-version]
  (let [builder (SecretRotationApplication$Builder/create ^java.lang.String application-id ^java.lang.String semantic-version)]
    (when-let [data (lookup-entry config id :is-multi-user)]
      (. builder isMultiUser data))
    (.build builder)))


(defn secret-rotation-application-options-builder
  "The secret-rotation-application-options-builder function buildes out new instances of 
SecretRotationApplicationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isMultiUser` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-multi-user` |"
  [stack id config]
  (let [builder (SecretRotationApplicationOptions$Builder.)]
    (when-let [data (lookup-entry config id :is-multi-user)]
      (. builder isMultiUser data))
    (.build builder)))


(defn secret-rotation-builder
  "The secret-rotation-builder function buildes out new instances of 
SecretRotation$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.secretsmanager.SecretRotationApplication | [[cdk.support/lookup-entry]] | `:application` |
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `endpoint` | software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint | [[cdk.support/lookup-entry]] | `:endpoint` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `target` | software.amazon.awscdk.services.ec2.IConnectable | [[cdk.support/lookup-entry]] | `:target` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (SecretRotation$Builder/create stack id)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :automatically-after)]
      (. builder automaticallyAfter data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :master-secret)]
      (. builder masterSecret data))
    (when-let [data (lookup-entry config id :rotate-immediately-on-update)]
      (. builder rotateImmediatelyOnUpdate data))
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn secret-rotation-props-builder
  "The secret-rotation-props-builder function buildes out new instances of 
SecretRotationProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `application` | software.amazon.awscdk.services.secretsmanager.SecretRotationApplication | [[cdk.support/lookup-entry]] | `:application` |
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `endpoint` | software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint | [[cdk.support/lookup-entry]] | `:endpoint` |
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `securityGroup` | software.amazon.awscdk.services.ec2.ISecurityGroup | [[cdk.support/lookup-entry]] | `:security-group` |
| `target` | software.amazon.awscdk.services.ec2.IConnectable | [[cdk.support/lookup-entry]] | `:target` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (SecretRotationProps$Builder.)]
    (when-let [data (lookup-entry config id :application)]
      (. builder application data))
    (when-let [data (lookup-entry config id :automatically-after)]
      (. builder automaticallyAfter data))
    (when-let [data (lookup-entry config id :endpoint)]
      (. builder endpoint data))
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :master-secret)]
      (. builder masterSecret data))
    (when-let [data (lookup-entry config id :rotate-immediately-on-update)]
      (. builder rotateImmediatelyOnUpdate data))
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (when-let [data (lookup-entry config id :security-group)]
      (. builder securityGroup data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))


(defn secret-string-generator-builder
  "The secret-string-generator-builder function buildes out new instances of 
SecretStringGenerator$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `excludeLowercase` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclude-lowercase` |
| `excludeNumbers` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclude-numbers` |
| `excludePunctuation` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclude-punctuation` |
| `excludeUppercase` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:exclude-uppercase` |
| `generateStringKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:generate-string-key` |
| `includeSpace` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-space` |
| `passwordLength` | java.lang.Number | [[cdk.support/lookup-entry]] | `:password-length` |
| `requireEachIncludedType` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:require-each-included-type` |
| `secretStringTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-string-template` |"
  [stack id config]
  (let [builder (SecretStringGenerator$Builder.)]
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :exclude-lowercase)]
      (. builder excludeLowercase data))
    (when-let [data (lookup-entry config id :exclude-numbers)]
      (. builder excludeNumbers data))
    (when-let [data (lookup-entry config id :exclude-punctuation)]
      (. builder excludePunctuation data))
    (when-let [data (lookup-entry config id :exclude-uppercase)]
      (. builder excludeUppercase data))
    (when-let [data (lookup-entry config id :generate-string-key)]
      (. builder generateStringKey data))
    (when-let [data (lookup-entry config id :include-space)]
      (. builder includeSpace data))
    (when-let [data (lookup-entry config id :password-length)]
      (. builder passwordLength data))
    (when-let [data (lookup-entry config id :require-each-included-type)]
      (. builder requireEachIncludedType data))
    (when-let [data (lookup-entry config id :secret-string-template)]
      (. builder secretStringTemplate data))
    (.build builder)))


(defn secret-target-attachment-builder
  "The secret-target-attachment-builder function buildes out new instances of 
SecretTargetAttachment$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `target` | software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (SecretTargetAttachment$Builder/create stack id)]
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn secret-target-attachment-props-builder
  "The secret-target-attachment-props-builder function buildes out new instances of 
SecretTargetAttachmentProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `target` | software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (SecretTargetAttachmentProps$Builder.)]
    (when-let [data (lookup-entry config id :secret)]
      (. builder secret data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn single-user-hosted-rotation-options-builder
  "The single-user-hosted-rotation-options-builder function buildes out new instances of 
SingleUserHostedRotationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |"
  [stack id config]
  (let [builder (SingleUserHostedRotationOptions$Builder.)]
    (when-let [data (lookup-entry config id :exclude-characters)]
      (. builder excludeCharacters data))
    (when-let [data (lookup-entry config id :function-name)]
      (. builder functionName data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (when-let [data (lookup-entry config id :vpc-subnets)]
      (. builder vpcSubnets data))
    (.build builder)))