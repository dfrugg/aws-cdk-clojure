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


(defn attached-secret-options-builder>
  "The attached-secret-options-builder> function updates a AttachedSecretOptions$Builder instance using the provided configuration.
  The function takes the AttachedSecretOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `target` | software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget | [[cdk.support/lookup-entry]] | `:target` |
"
  [^AttachedSecretOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn attached-secret-options-builder
  "Creates a  `AttachedSecretOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (attached-secret-options-builder> (new AttachedSecretOptions$Builder) id config))


(defn cfn-resource-policy-builder>
  "The cfn-resource-policy-builder> function updates a CfnResourcePolicy$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockPublicPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-policy` |
| `resourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |
"
  [^CfnResourcePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :block-public-policy)]
    (. builder blockPublicPolicy data))
  (when-some [data (lookup-entry config id :resource-policy)]
    (. builder resourcePolicy data))
  (when-some [data (lookup-entry config id :secret-id)]
    (. builder secretId data))
  (.build builder))


(defn cfn-resource-policy-builder
  "Creates a  `CfnResourcePolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-policy-builder> (CfnResourcePolicy$Builder/create scope (name id)) id config))


(defn cfn-resource-policy-props-builder>
  "The cfn-resource-policy-props-builder> function updates a CfnResourcePolicyProps$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `blockPublicPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-public-policy` |
| `resourcePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:resource-policy` |
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |
"
  [^CfnResourcePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :block-public-policy)]
    (. builder blockPublicPolicy data))
  (when-some [data (lookup-entry config id :resource-policy)]
    (. builder resourcePolicy data))
  (when-some [data (lookup-entry config id :secret-id)]
    (. builder secretId data))
  (.build builder))


(defn cfn-resource-policy-props-builder
  "Creates a  `CfnResourcePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-resource-policy-props-builder> (new CfnResourcePolicyProps$Builder) id config))


(defn cfn-rotation-schedule-builder>
  "The cfn-rotation-schedule-builder> function updates a CfnRotationSchedule$Builder instance using the provided configuration.
  The function takes the CfnRotationSchedule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedRotationLambda` | software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule$HostedRotationLambdaProperty | [[cdk.support/lookup-entry]] | `:hosted-rotation-lambda` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `rotationLambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:rotation-lambda-arn` |
| `rotationRules` | software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule$RotationRulesProperty | [[cdk.support/lookup-entry]] | `:rotation-rules` |
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |
"
  [^CfnRotationSchedule$Builder builder id config]
  (when-some [data (lookup-entry config id :hosted-rotation-lambda)]
    (. builder hostedRotationLambda data))
  (when-some [data (lookup-entry config id :rotate-immediately-on-update)]
    (. builder rotateImmediatelyOnUpdate data))
  (when-some [data (lookup-entry config id :rotation-lambda-arn)]
    (. builder rotationLambdaArn data))
  (when-some [data (lookup-entry config id :rotation-rules)]
    (. builder rotationRules data))
  (when-some [data (lookup-entry config id :secret-id)]
    (. builder secretId data))
  (.build builder))


(defn cfn-rotation-schedule-builder
  "Creates a  `CfnRotationSchedule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-rotation-schedule-builder> (CfnRotationSchedule$Builder/create scope (name id)) id config))


(defn cfn-rotation-schedule-hosted-rotation-lambda-property-builder>
  "The cfn-rotation-schedule-hosted-rotation-lambda-property-builder> function updates a CfnRotationSchedule$HostedRotationLambdaProperty$Builder instance using the provided configuration.
  The function takes the CfnRotationSchedule$HostedRotationLambdaProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcSubnetIds` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-subnet-ids` |
"
  [^CfnRotationSchedule$HostedRotationLambdaProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :master-secret-arn)]
    (. builder masterSecretArn data))
  (when-some [data (lookup-entry config id :master-secret-kms-key-arn)]
    (. builder masterSecretKmsKeyArn data))
  (when-some [data (lookup-entry config id :rotation-lambda-name)]
    (. builder rotationLambdaName data))
  (when-some [data (lookup-entry config id :rotation-type)]
    (. builder rotationType data))
  (when-some [data (lookup-entry config id :runtime)]
    (. builder runtime data))
  (when-some [data (lookup-entry config id :superuser-secret-arn)]
    (. builder superuserSecretArn data))
  (when-some [data (lookup-entry config id :superuser-secret-kms-key-arn)]
    (. builder superuserSecretKmsKeyArn data))
  (when-some [data (lookup-entry config id :vpc-security-group-ids)]
    (. builder vpcSecurityGroupIds data))
  (when-some [data (lookup-entry config id :vpc-subnet-ids)]
    (. builder vpcSubnetIds data))
  (.build builder))


(defn cfn-rotation-schedule-hosted-rotation-lambda-property-builder
  "Creates a  `CfnRotationSchedule$HostedRotationLambdaProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rotation-schedule-hosted-rotation-lambda-property-builder> (new CfnRotationSchedule$HostedRotationLambdaProperty$Builder) id config))


(defn cfn-rotation-schedule-props-builder>
  "The cfn-rotation-schedule-props-builder> function updates a CfnRotationScheduleProps$Builder instance using the provided configuration.
  The function takes the CfnRotationScheduleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedRotationLambda` | software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule$HostedRotationLambdaProperty | [[cdk.support/lookup-entry]] | `:hosted-rotation-lambda` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `rotationLambdaArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:rotation-lambda-arn` |
| `rotationRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:rotation-rules` |
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |
"
  [^CfnRotationScheduleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :hosted-rotation-lambda)]
    (. builder hostedRotationLambda data))
  (when-some [data (lookup-entry config id :rotate-immediately-on-update)]
    (. builder rotateImmediatelyOnUpdate data))
  (when-some [data (lookup-entry config id :rotation-lambda-arn)]
    (. builder rotationLambdaArn data))
  (when-some [data (lookup-entry config id :rotation-rules)]
    (. builder rotationRules data))
  (when-some [data (lookup-entry config id :secret-id)]
    (. builder secretId data))
  (.build builder))


(defn cfn-rotation-schedule-props-builder
  "Creates a  `CfnRotationScheduleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rotation-schedule-props-builder> (new CfnRotationScheduleProps$Builder) id config))


(defn cfn-rotation-schedule-rotation-rules-property-builder>
  "The cfn-rotation-schedule-rotation-rules-property-builder> function updates a CfnRotationSchedule$RotationRulesProperty$Builder instance using the provided configuration.
  The function takes the CfnRotationSchedule$RotationRulesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfterDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:automatically-after-days` |
| `duration` | java.lang.String | [[cdk.support/lookup-entry]] | `:duration` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
"
  [^CfnRotationSchedule$RotationRulesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :automatically-after-days)]
    (. builder automaticallyAfterDays data))
  (when-some [data (lookup-entry config id :duration)]
    (. builder duration data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (.build builder))


(defn cfn-rotation-schedule-rotation-rules-property-builder
  "Creates a  `CfnRotationSchedule$RotationRulesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-rotation-schedule-rotation-rules-property-builder> (new CfnRotationSchedule$RotationRulesProperty$Builder) id config))


(defn cfn-secret-builder>
  "The cfn-secret-builder> function updates a CfnSecret$Builder instance using the provided configuration.
  The function takes the CfnSecret$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `generateSecretString` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:generate-secret-string` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicaRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretString` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSecret$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :generate-secret-string)]
    (. builder generateSecretString data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :replica-regions)]
    (. builder replicaRegions data))
  (when-some [data (lookup-entry config id :secret-string)]
    (. builder secretString data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-secret-builder
  "Creates a  `CfnSecret$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-secret-builder> (CfnSecret$Builder/create scope (name id)) id config))


(defn cfn-secret-generate-secret-string-property-builder>
  "The cfn-secret-generate-secret-string-property-builder> function updates a CfnSecret$GenerateSecretStringProperty$Builder instance using the provided configuration.
  The function takes the CfnSecret$GenerateSecretStringProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `secretStringTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-string-template` |
"
  [^CfnSecret$GenerateSecretStringProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :exclude-lowercase)]
    (. builder excludeLowercase data))
  (when-some [data (lookup-entry config id :exclude-numbers)]
    (. builder excludeNumbers data))
  (when-some [data (lookup-entry config id :exclude-punctuation)]
    (. builder excludePunctuation data))
  (when-some [data (lookup-entry config id :exclude-uppercase)]
    (. builder excludeUppercase data))
  (when-some [data (lookup-entry config id :generate-string-key)]
    (. builder generateStringKey data))
  (when-some [data (lookup-entry config id :include-space)]
    (. builder includeSpace data))
  (when-some [data (lookup-entry config id :password-length)]
    (. builder passwordLength data))
  (when-some [data (lookup-entry config id :require-each-included-type)]
    (. builder requireEachIncludedType data))
  (when-some [data (lookup-entry config id :secret-string-template)]
    (. builder secretStringTemplate data))
  (.build builder))


(defn cfn-secret-generate-secret-string-property-builder
  "Creates a  `CfnSecret$GenerateSecretStringProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-secret-generate-secret-string-property-builder> (new CfnSecret$GenerateSecretStringProperty$Builder) id config))


(defn cfn-secret-props-builder>
  "The cfn-secret-props-builder> function updates a CfnSecretProps$Builder instance using the provided configuration.
  The function takes the CfnSecretProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `generateSecretString` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:generate-secret-string` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `replicaRegions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:replica-regions` |
| `secretString` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-string` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnSecretProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :generate-secret-string)]
    (. builder generateSecretString data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :replica-regions)]
    (. builder replicaRegions data))
  (when-some [data (lookup-entry config id :secret-string)]
    (. builder secretString data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-secret-props-builder
  "Creates a  `CfnSecretProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-secret-props-builder> (new CfnSecretProps$Builder) id config))


(defn cfn-secret-replica-region-property-builder>
  "The cfn-secret-replica-region-property-builder> function updates a CfnSecret$ReplicaRegionProperty$Builder instance using the provided configuration.
  The function takes the CfnSecret$ReplicaRegionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^CfnSecret$ReplicaRegionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn cfn-secret-replica-region-property-builder
  "Creates a  `CfnSecret$ReplicaRegionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-secret-replica-region-property-builder> (new CfnSecret$ReplicaRegionProperty$Builder) id config))


(defn cfn-secret-target-attachment-builder>
  "The cfn-secret-target-attachment-builder> function updates a CfnSecretTargetAttachment$Builder instance using the provided configuration.
  The function takes the CfnSecretTargetAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
"
  [^CfnSecretTargetAttachment$Builder builder id config]
  (when-some [data (lookup-entry config id :secret-id)]
    (. builder secretId data))
  (when-some [data (lookup-entry config id :target-id)]
    (. builder targetId data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn cfn-secret-target-attachment-builder
  "Creates a  `CfnSecretTargetAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-secret-target-attachment-builder> (CfnSecretTargetAttachment$Builder/create scope (name id)) id config))


(defn cfn-secret-target-attachment-props-builder>
  "The cfn-secret-target-attachment-props-builder> function updates a CfnSecretTargetAttachmentProps$Builder instance using the provided configuration.
  The function takes the CfnSecretTargetAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secretId` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-id` |
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
"
  [^CfnSecretTargetAttachmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :secret-id)]
    (. builder secretId data))
  (when-some [data (lookup-entry config id :target-id)]
    (. builder targetId data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn cfn-secret-target-attachment-props-builder
  "Creates a  `CfnSecretTargetAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-secret-target-attachment-props-builder> (new CfnSecretTargetAttachmentProps$Builder) id config))


(defn multi-user-hosted-rotation-options-builder>
  "The multi-user-hosted-rotation-options-builder> function updates a MultiUserHostedRotationOptions$Builder instance using the provided configuration.
  The function takes the MultiUserHostedRotationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `masterSecret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:master-secret` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^MultiUserHostedRotationOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-some [data (lookup-entry config id :master-secret)]
    (. builder masterSecret data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn multi-user-hosted-rotation-options-builder
  "Creates a  `MultiUserHostedRotationOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (multi-user-hosted-rotation-options-builder> (new MultiUserHostedRotationOptions$Builder) id config))


(defn replica-region-builder>
  "The replica-region-builder> function updates a ReplicaRegion$Builder instance using the provided configuration.
  The function takes the ReplicaRegion$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^ReplicaRegion$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn replica-region-builder
  "Creates a  `ReplicaRegion$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (replica-region-builder> (new ReplicaRegion$Builder) id config))


(defn resource-policy-builder>
  "The resource-policy-builder> function updates a ResourcePolicy$Builder instance using the provided configuration.
  The function takes the ResourcePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
"
  [^ResourcePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (.build builder))


(defn resource-policy-builder
  "Creates a  `ResourcePolicy$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (resource-policy-builder> (ResourcePolicy$Builder/create scope (name id)) id config))


(defn resource-policy-props-builder>
  "The resource-policy-props-builder> function updates a ResourcePolicyProps$Builder instance using the provided configuration.
  The function takes the ResourcePolicyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
"
  [^ResourcePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (.build builder))


(defn resource-policy-props-builder
  "Creates a  `ResourcePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (resource-policy-props-builder> (new ResourcePolicyProps$Builder) id config))


(defn rotation-schedule-builder>
  "The rotation-schedule-builder> function updates a RotationSchedule$Builder instance using the provided configuration.
  The function takes the RotationSchedule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `hostedRotation` | software.amazon.awscdk.services.secretsmanager.HostedRotation | [[cdk.support/lookup-entry]] | `:hosted-rotation` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `rotationLambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:rotation-lambda` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
"
  [^RotationSchedule$Builder builder id config]
  (when-some [data (lookup-entry config id :automatically-after)]
    (. builder automaticallyAfter data))
  (when-some [data (lookup-entry config id :hosted-rotation)]
    (. builder hostedRotation data))
  (when-some [data (lookup-entry config id :rotate-immediately-on-update)]
    (. builder rotateImmediatelyOnUpdate data))
  (when-some [data (lookup-entry config id :rotation-lambda)]
    (. builder rotationLambda data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (.build builder))


(defn rotation-schedule-builder
  "Creates a  `RotationSchedule$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (rotation-schedule-builder> (RotationSchedule$Builder/create scope (name id)) id config))


(defn rotation-schedule-options-builder>
  "The rotation-schedule-options-builder> function updates a RotationScheduleOptions$Builder instance using the provided configuration.
  The function takes the RotationScheduleOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `hostedRotation` | software.amazon.awscdk.services.secretsmanager.HostedRotation | [[cdk.support/lookup-entry]] | `:hosted-rotation` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `rotationLambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:rotation-lambda` |
"
  [^RotationScheduleOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :automatically-after)]
    (. builder automaticallyAfter data))
  (when-some [data (lookup-entry config id :hosted-rotation)]
    (. builder hostedRotation data))
  (when-some [data (lookup-entry config id :rotate-immediately-on-update)]
    (. builder rotateImmediatelyOnUpdate data))
  (when-some [data (lookup-entry config id :rotation-lambda)]
    (. builder rotationLambda data))
  (.build builder))


(defn rotation-schedule-options-builder
  "Creates a  `RotationScheduleOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (rotation-schedule-options-builder> (new RotationScheduleOptions$Builder) id config))


(defn rotation-schedule-props-builder>
  "The rotation-schedule-props-builder> function updates a RotationScheduleProps$Builder instance using the provided configuration.
  The function takes the RotationScheduleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `automaticallyAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:automatically-after` |
| `hostedRotation` | software.amazon.awscdk.services.secretsmanager.HostedRotation | [[cdk.support/lookup-entry]] | `:hosted-rotation` |
| `rotateImmediatelyOnUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:rotate-immediately-on-update` |
| `rotationLambda` | software.amazon.awscdk.services.lambda.IFunction | [[cdk.support/lookup-entry]] | `:rotation-lambda` |
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
"
  [^RotationScheduleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :automatically-after)]
    (. builder automaticallyAfter data))
  (when-some [data (lookup-entry config id :hosted-rotation)]
    (. builder hostedRotation data))
  (when-some [data (lookup-entry config id :rotate-immediately-on-update)]
    (. builder rotateImmediatelyOnUpdate data))
  (when-some [data (lookup-entry config id :rotation-lambda)]
    (. builder rotationLambda data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (.build builder))


(defn rotation-schedule-props-builder
  "Creates a  `RotationScheduleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (rotation-schedule-props-builder> (new RotationScheduleProps$Builder) id config))


(defn secret-attachment-target-props-builder>
  "The secret-attachment-target-props-builder> function updates a SecretAttachmentTargetProps$Builder instance using the provided configuration.
  The function takes the SecretAttachmentTargetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | software.amazon.awscdk.services.secretsmanager.AttachmentTargetType | [[cdk.api.services.secretsmanager/attachment-target-type]] | `:target-type` |
"
  [^SecretAttachmentTargetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :target-id)]
    (. builder targetId data))
  (when-some [data (attachment-target-type config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn secret-attachment-target-props-builder
  "Creates a  `SecretAttachmentTargetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (secret-attachment-target-props-builder> (new SecretAttachmentTargetProps$Builder) id config))


(defn secret-attributes-builder>
  "The secret-attributes-builder> function updates a SecretAttributes$Builder instance using the provided configuration.
  The function takes the SecretAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `secretCompleteArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-complete-arn` |
| `secretPartialArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-partial-arn` |
"
  [^SecretAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :secret-complete-arn)]
    (. builder secretCompleteArn data))
  (when-some [data (lookup-entry config id :secret-partial-arn)]
    (. builder secretPartialArn data))
  (.build builder))


(defn secret-attributes-builder
  "Creates a  `SecretAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (secret-attributes-builder> (new SecretAttributes$Builder) id config))


(defn secret-builder>
  "The secret-builder> function updates a Secret$Builder instance using the provided configuration.
  The function takes the Secret$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `secretStringValue` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:secret-string-value` |
"
  [^Secret$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :generate-secret-string)]
    (. builder generateSecretString data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :replica-regions)]
    (. builder replicaRegions data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (when-some [data (lookup-entry config id :secret-object-value)]
    (. builder secretObjectValue data))
  (when-some [data (lookup-entry config id :secret-string-beta1)]
    (. builder secretStringBeta1 data))
  (when-some [data (lookup-entry config id :secret-string-value)]
    (. builder secretStringValue data))
  (.build builder))


(defn secret-builder
  "Creates a  `Secret$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (secret-builder> (Secret$Builder/create scope (name id)) id config))


(defn secret-props-builder>
  "The secret-props-builder> function updates a SecretProps$Builder instance using the provided configuration.
  The function takes the SecretProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `secretStringValue` | software.amazon.awscdk.SecretValue | [[cdk.support/lookup-entry]] | `:secret-string-value` |
"
  [^SecretProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :generate-secret-string)]
    (. builder generateSecretString data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-some [data (lookup-entry config id :replica-regions)]
    (. builder replicaRegions data))
  (when-some [data (lookup-entry config id :secret-name)]
    (. builder secretName data))
  (when-some [data (lookup-entry config id :secret-object-value)]
    (. builder secretObjectValue data))
  (when-some [data (lookup-entry config id :secret-string-beta1)]
    (. builder secretStringBeta1 data))
  (when-some [data (lookup-entry config id :secret-string-value)]
    (. builder secretStringValue data))
  (.build builder))


(defn secret-props-builder
  "Creates a  `SecretProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (secret-props-builder> (new SecretProps$Builder) id config))


(defn secret-rotation-application-builder>
  "The secret-rotation-application-builder> function updates a SecretRotationApplication$Builder instance using the provided configuration.
  The function takes the SecretRotationApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isMultiUser` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-multi-user` |
"
  [^SecretRotationApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :is-multi-user)]
    (. builder isMultiUser data))
  (.build builder))


(defn secret-rotation-application-builder
  "Creates a  `SecretRotationApplication$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[java.lang.String java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| application-id | java.lang.String |  |
| semantic-version | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^String application-id ^String semantic-version id config]
  (secret-rotation-application-builder> (SecretRotationApplication$Builder/create application-id semantic-version) id config))


(defn secret-rotation-application-options-builder>
  "The secret-rotation-application-options-builder> function updates a SecretRotationApplicationOptions$Builder instance using the provided configuration.
  The function takes the SecretRotationApplicationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `isMultiUser` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:is-multi-user` |
"
  [^SecretRotationApplicationOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :is-multi-user)]
    (. builder isMultiUser data))
  (.build builder))


(defn secret-rotation-application-options-builder
  "Creates a  `SecretRotationApplicationOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (secret-rotation-application-options-builder> (new SecretRotationApplicationOptions$Builder) id config))


(defn secret-rotation-builder>
  "The secret-rotation-builder> function updates a SecretRotation$Builder instance using the provided configuration.
  The function takes the SecretRotation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^SecretRotation$Builder builder id config]
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :automatically-after)]
    (. builder automaticallyAfter data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :master-secret)]
    (. builder masterSecret data))
  (when-some [data (lookup-entry config id :rotate-immediately-on-update)]
    (. builder rotateImmediatelyOnUpdate data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn secret-rotation-builder
  "Creates a  `SecretRotation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (secret-rotation-builder> (SecretRotation$Builder/create scope (name id)) id config))


(defn secret-rotation-props-builder>
  "The secret-rotation-props-builder> function updates a SecretRotationProps$Builder instance using the provided configuration.
  The function takes the SecretRotationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^SecretRotationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application)]
    (. builder application data))
  (when-some [data (lookup-entry config id :automatically-after)]
    (. builder automaticallyAfter data))
  (when-some [data (lookup-entry config id :endpoint)]
    (. builder endpoint data))
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :master-secret)]
    (. builder masterSecret data))
  (when-some [data (lookup-entry config id :rotate-immediately-on-update)]
    (. builder rotateImmediatelyOnUpdate data))
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (lookup-entry config id :security-group)]
    (. builder securityGroup data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn secret-rotation-props-builder
  "Creates a  `SecretRotationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (secret-rotation-props-builder> (new SecretRotationProps$Builder) id config))


(defn secret-string-generator-builder>
  "The secret-string-generator-builder> function updates a SecretStringGenerator$Builder instance using the provided configuration.
  The function takes the SecretStringGenerator$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `secretStringTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:secret-string-template` |
"
  [^SecretStringGenerator$Builder builder id config]
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :exclude-lowercase)]
    (. builder excludeLowercase data))
  (when-some [data (lookup-entry config id :exclude-numbers)]
    (. builder excludeNumbers data))
  (when-some [data (lookup-entry config id :exclude-punctuation)]
    (. builder excludePunctuation data))
  (when-some [data (lookup-entry config id :exclude-uppercase)]
    (. builder excludeUppercase data))
  (when-some [data (lookup-entry config id :generate-string-key)]
    (. builder generateStringKey data))
  (when-some [data (lookup-entry config id :include-space)]
    (. builder includeSpace data))
  (when-some [data (lookup-entry config id :password-length)]
    (. builder passwordLength data))
  (when-some [data (lookup-entry config id :require-each-included-type)]
    (. builder requireEachIncludedType data))
  (when-some [data (lookup-entry config id :secret-string-template)]
    (. builder secretStringTemplate data))
  (.build builder))


(defn secret-string-generator-builder
  "Creates a  `SecretStringGenerator$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (secret-string-generator-builder> (new SecretStringGenerator$Builder) id config))


(defn secret-target-attachment-builder>
  "The secret-target-attachment-builder> function updates a SecretTargetAttachment$Builder instance using the provided configuration.
  The function takes the SecretTargetAttachment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `target` | software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget | [[cdk.support/lookup-entry]] | `:target` |
"
  [^SecretTargetAttachment$Builder builder id config]
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn secret-target-attachment-builder
  "Creates a  `SecretTargetAttachment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (secret-target-attachment-builder> (SecretTargetAttachment$Builder/create scope (name id)) id config))


(defn secret-target-attachment-props-builder>
  "The secret-target-attachment-props-builder> function updates a SecretTargetAttachmentProps$Builder instance using the provided configuration.
  The function takes the SecretTargetAttachmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `secret` | software.amazon.awscdk.services.secretsmanager.ISecret | [[cdk.support/lookup-entry]] | `:secret` |
| `target` | software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget | [[cdk.support/lookup-entry]] | `:target` |
"
  [^SecretTargetAttachmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :secret)]
    (. builder secret data))
  (when-some [data (lookup-entry config id :target)]
    (. builder target data))
  (.build builder))


(defn secret-target-attachment-props-builder
  "Creates a  `SecretTargetAttachmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (secret-target-attachment-props-builder> (new SecretTargetAttachmentProps$Builder) id config))


(defn single-user-hosted-rotation-options-builder>
  "The single-user-hosted-rotation-options-builder> function updates a SingleUserHostedRotationOptions$Builder instance using the provided configuration.
  The function takes the SingleUserHostedRotationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `excludeCharacters` | java.lang.String | [[cdk.support/lookup-entry]] | `:exclude-characters` |
| `functionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:function-name` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `vpcSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:vpc-subnets` |
"
  [^SingleUserHostedRotationOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :exclude-characters)]
    (. builder excludeCharacters data))
  (when-some [data (lookup-entry config id :function-name)]
    (. builder functionName data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-some [data (lookup-entry config id :vpc-subnets)]
    (. builder vpcSubnets data))
  (.build builder))


(defn single-user-hosted-rotation-options-builder
  "Creates a  `SingleUserHostedRotationOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (single-user-hosted-rotation-options-builder> (new SingleUserHostedRotationOptions$Builder) id config))