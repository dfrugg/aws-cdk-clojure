(ns cdk.api.services.ssm
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ssm package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ssm CfnAssociation$Builder
                                                CfnAssociation$InstanceAssociationOutputLocationProperty$Builder
                                                CfnAssociation$S3OutputLocationProperty$Builder
                                                CfnAssociation$TargetProperty$Builder
                                                CfnAssociationProps$Builder
                                                CfnDocument$AttachmentsSourceProperty$Builder
                                                CfnDocument$Builder
                                                CfnDocument$DocumentRequiresProperty$Builder
                                                CfnDocumentProps$Builder
                                                CfnMaintenanceWindow$Builder
                                                CfnMaintenanceWindowProps$Builder
                                                CfnMaintenanceWindowTarget$Builder
                                                CfnMaintenanceWindowTarget$TargetsProperty$Builder
                                                CfnMaintenanceWindowTargetProps$Builder
                                                CfnMaintenanceWindowTask$Builder
                                                CfnMaintenanceWindowTask$CloudWatchOutputConfigProperty$Builder
                                                CfnMaintenanceWindowTask$LoggingInfoProperty$Builder
                                                CfnMaintenanceWindowTask$MaintenanceWindowAutomationParametersProperty$Builder
                                                CfnMaintenanceWindowTask$MaintenanceWindowLambdaParametersProperty$Builder
                                                CfnMaintenanceWindowTask$MaintenanceWindowRunCommandParametersProperty$Builder
                                                CfnMaintenanceWindowTask$MaintenanceWindowStepFunctionsParametersProperty$Builder
                                                CfnMaintenanceWindowTask$NotificationConfigProperty$Builder
                                                CfnMaintenanceWindowTask$TargetProperty$Builder
                                                CfnMaintenanceWindowTask$TaskInvocationParametersProperty$Builder
                                                CfnMaintenanceWindowTaskProps$Builder
                                                CfnParameter$Builder
                                                CfnParameterProps$Builder
                                                CfnPatchBaseline$Builder
                                                CfnPatchBaseline$PatchFilterGroupProperty$Builder
                                                CfnPatchBaseline$PatchFilterProperty$Builder
                                                CfnPatchBaseline$PatchSourceProperty$Builder
                                                CfnPatchBaseline$RuleGroupProperty$Builder
                                                CfnPatchBaseline$RuleProperty$Builder
                                                CfnPatchBaselineProps$Builder
                                                CfnResourceDataSync$AwsOrganizationsSourceProperty$Builder
                                                CfnResourceDataSync$Builder
                                                CfnResourceDataSync$S3DestinationProperty$Builder
                                                CfnResourceDataSync$SyncSourceProperty$Builder
                                                CfnResourceDataSyncProps$Builder
                                                CfnResourcePolicy$Builder
                                                CfnResourcePolicyProps$Builder
                                                CommonStringParameterAttributes$Builder
                                                ListParameterAttributes$Builder
                                                ParameterDataType
                                                ParameterOptions$Builder
                                                ParameterTier
                                                ParameterValueType
                                                SecureStringParameterAttributes$Builder
                                                StringListParameter$Builder
                                                StringListParameterProps$Builder
                                                StringParameter$Builder
                                                StringParameterAttributes$Builder
                                                StringParameterProps$Builder]))


(defn parameter-data-type
  "The `parameter-data-type` function data interprets values in the provided config data into a 
`ParameterDataType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ParameterDataType` - the value is returned.
* is `:text` - `ParameterDataType/TEXT` is returned
* is `:aws-ec2-image` - `ParameterDataType/AWS_EC2_IMAGE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ParameterDataType data) data
      (= :text data) ParameterDataType/TEXT
      (= :aws-ec2-image data) ParameterDataType/AWS_EC2_IMAGE)))


(defn parameter-tier
  "The `parameter-tier` function data interprets values in the provided config data into a 
`ParameterTier` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ParameterTier` - the value is returned.
* is `:standard` - `ParameterTier/STANDARD` is returned
* is `:intelligent-tiering` - `ParameterTier/INTELLIGENT_TIERING` is returned
* is `:advanced` - `ParameterTier/ADVANCED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ParameterTier data) data
      (= :standard data) ParameterTier/STANDARD
      (= :intelligent-tiering data) ParameterTier/INTELLIGENT_TIERING
      (= :advanced data) ParameterTier/ADVANCED)))


(defn parameter-value-type
  "The `parameter-value-type` function data interprets values in the provided config data into a 
`ParameterValueType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ParameterValueType` - the value is returned.
* is `:aws-ec2-volume-id` - `ParameterValueType/AWS_EC2_VOLUME_ID` is returned
* is `:aws-ec2-subnet-id` - `ParameterValueType/AWS_EC2_SUBNET_ID` is returned
* is `:aws-ec2-instance-id` - `ParameterValueType/AWS_EC2_INSTANCE_ID` is returned
* is `:aws-ec2-vpc-id` - `ParameterValueType/AWS_EC2_VPC_ID` is returned
* is `:aws-route53-hostedzone-id` - `ParameterValueType/AWS_ROUTE53_HOSTEDZONE_ID` is returned
* is `:aws-ec2-securitygroup-groupname` - `ParameterValueType/AWS_EC2_SECURITYGROUP_GROUPNAME` is returned
* is `:aws-ec2-securitygroup-id` - `ParameterValueType/AWS_EC2_SECURITYGROUP_ID` is returned
* is `:aws-ec2-image-id` - `ParameterValueType/AWS_EC2_IMAGE_ID` is returned
* is `:aws-ec2-availabilityzone-name` - `ParameterValueType/AWS_EC2_AVAILABILITYZONE_NAME` is returned
* is `:string` - `ParameterValueType/STRING` is returned
* is `:aws-ec2-keypair-keyname` - `ParameterValueType/AWS_EC2_KEYPAIR_KEYNAME` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ParameterValueType data) data
      (= :aws-ec2-volume-id data) ParameterValueType/AWS_EC2_VOLUME_ID
      (= :aws-ec2-subnet-id data) ParameterValueType/AWS_EC2_SUBNET_ID
      (= :aws-ec2-instance-id data) ParameterValueType/AWS_EC2_INSTANCE_ID
      (= :aws-ec2-vpc-id data) ParameterValueType/AWS_EC2_VPC_ID
      (= :aws-route53-hostedzone-id data) ParameterValueType/AWS_ROUTE53_HOSTEDZONE_ID
      (= :aws-ec2-securitygroup-groupname data) ParameterValueType/AWS_EC2_SECURITYGROUP_GROUPNAME
      (= :aws-ec2-securitygroup-id data) ParameterValueType/AWS_EC2_SECURITYGROUP_ID
      (= :aws-ec2-image-id data) ParameterValueType/AWS_EC2_IMAGE_ID
      (= :aws-ec2-availabilityzone-name data) ParameterValueType/AWS_EC2_AVAILABILITYZONE_NAME
      (= :string data) ParameterValueType/STRING
      (= :aws-ec2-keypair-keyname data) ParameterValueType/AWS_EC2_KEYPAIR_KEYNAME)))


(defn cfn-association-builder>
  "The cfn-association-builder> function updates a CfnAssociation$Builder instance using the provided configuration.
  The function takes the CfnAssociation$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyOnlyAtCronInterval` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:apply-only-at-cron-interval` |
| `associationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-name` |
| `automationTargetParameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:automation-target-parameter-name` |
| `calendarNames` | java.util.List | [[cdk.support/lookup-entry]] | `:calendar-names` |
| `complianceSeverity` | java.lang.String | [[cdk.support/lookup-entry]] | `:compliance-severity` |
| `documentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-version` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `maxConcurrency` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxErrors` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-errors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputLocation` | software.amazon.awscdk.services.ssm.CfnAssociation$InstanceAssociationOutputLocationProperty | [[cdk.support/lookup-entry]] | `:output-location` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-offset` |
| `syncCompliance` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-compliance` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |
| `waitForSuccessTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-for-success-timeout-seconds` |
"
  [^CfnAssociation$Builder builder id config]
  (when-some [data (lookup-entry config id :apply-only-at-cron-interval)]
    (. builder applyOnlyAtCronInterval data))
  (when-some [data (lookup-entry config id :association-name)]
    (. builder associationName data))
  (when-some [data (lookup-entry config id :automation-target-parameter-name)]
    (. builder automationTargetParameterName data))
  (when-some [data (lookup-entry config id :calendar-names)]
    (. builder calendarNames data))
  (when-some [data (lookup-entry config id :compliance-severity)]
    (. builder complianceSeverity data))
  (when-some [data (lookup-entry config id :document-version)]
    (. builder documentVersion data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :max-errors)]
    (. builder maxErrors data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-location)]
    (. builder outputLocation data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (when-some [data (lookup-entry config id :schedule-offset)]
    (. builder scheduleOffset data))
  (when-some [data (lookup-entry config id :sync-compliance)]
    (. builder syncCompliance data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :wait-for-success-timeout-seconds)]
    (. builder waitForSuccessTimeoutSeconds data))
  (.build builder))


(defn cfn-association-builder
  "Creates a  `CfnAssociation$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-association-builder> (CfnAssociation$Builder/create scope (name id)) id config))


(defn cfn-association-instance-association-output-location-property-builder>
  "The cfn-association-instance-association-output-location-property-builder> function updates a CfnAssociation$InstanceAssociationOutputLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnAssociation$InstanceAssociationOutputLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `s3Location` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-location` |
"
  [^CfnAssociation$InstanceAssociationOutputLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :s3-location)]
    (. builder s3Location data))
  (.build builder))


(defn cfn-association-instance-association-output-location-property-builder
  "Creates a  `CfnAssociation$InstanceAssociationOutputLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-association-instance-association-output-location-property-builder> (new CfnAssociation$InstanceAssociationOutputLocationProperty$Builder) id config))


(defn cfn-association-props-builder>
  "The cfn-association-props-builder> function updates a CfnAssociationProps$Builder instance using the provided configuration.
  The function takes the CfnAssociationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applyOnlyAtCronInterval` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:apply-only-at-cron-interval` |
| `associationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:association-name` |
| `automationTargetParameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:automation-target-parameter-name` |
| `calendarNames` | java.util.List | [[cdk.support/lookup-entry]] | `:calendar-names` |
| `complianceSeverity` | java.lang.String | [[cdk.support/lookup-entry]] | `:compliance-severity` |
| `documentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-version` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `maxConcurrency` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxErrors` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-errors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `outputLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:output-location` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-offset` |
| `syncCompliance` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-compliance` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `waitForSuccessTimeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:wait-for-success-timeout-seconds` |
"
  [^CfnAssociationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :apply-only-at-cron-interval)]
    (. builder applyOnlyAtCronInterval data))
  (when-some [data (lookup-entry config id :association-name)]
    (. builder associationName data))
  (when-some [data (lookup-entry config id :automation-target-parameter-name)]
    (. builder automationTargetParameterName data))
  (when-some [data (lookup-entry config id :calendar-names)]
    (. builder calendarNames data))
  (when-some [data (lookup-entry config id :compliance-severity)]
    (. builder complianceSeverity data))
  (when-some [data (lookup-entry config id :document-version)]
    (. builder documentVersion data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :max-errors)]
    (. builder maxErrors data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :output-location)]
    (. builder outputLocation data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (when-some [data (lookup-entry config id :schedule-offset)]
    (. builder scheduleOffset data))
  (when-some [data (lookup-entry config id :sync-compliance)]
    (. builder syncCompliance data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :wait-for-success-timeout-seconds)]
    (. builder waitForSuccessTimeoutSeconds data))
  (.build builder))


(defn cfn-association-props-builder
  "Creates a  `CfnAssociationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-association-props-builder> (new CfnAssociationProps$Builder) id config))


(defn cfn-association-s3-output-location-property-builder>
  "The cfn-association-s3-output-location-property-builder> function updates a CfnAssociation$S3OutputLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnAssociation$S3OutputLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `outputS3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-s3-bucket-name` |
| `outputS3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-s3-key-prefix` |
| `outputS3Region` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-s3-region` |
"
  [^CfnAssociation$S3OutputLocationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :output-s3-bucket-name)]
    (. builder outputS3BucketName data))
  (when-some [data (lookup-entry config id :output-s3-key-prefix)]
    (. builder outputS3KeyPrefix data))
  (when-some [data (lookup-entry config id :output-s3-region)]
    (. builder outputS3Region data))
  (.build builder))


(defn cfn-association-s3-output-location-property-builder
  "Creates a  `CfnAssociation$S3OutputLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-association-s3-output-location-property-builder> (new CfnAssociation$S3OutputLocationProperty$Builder) id config))


(defn cfn-association-target-property-builder>
  "The cfn-association-target-property-builder> function updates a CfnAssociation$TargetProperty$Builder instance using the provided configuration.
  The function takes the CfnAssociation$TargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnAssociation$TargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-association-target-property-builder
  "Creates a  `CfnAssociation$TargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-association-target-property-builder> (new CfnAssociation$TargetProperty$Builder) id config))


(defn cfn-document-attachments-source-property-builder>
  "The cfn-document-attachments-source-property-builder> function updates a CfnDocument$AttachmentsSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnDocument$AttachmentsSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnDocument$AttachmentsSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-document-attachments-source-property-builder
  "Creates a  `CfnDocument$AttachmentsSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-document-attachments-source-property-builder> (new CfnDocument$AttachmentsSourceProperty$Builder) id config))


(defn cfn-document-builder>
  "The cfn-document-builder> function updates a CfnDocument$Builder instance using the provided configuration.
  The function takes the CfnDocument$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachments` | java.util.List | [[cdk.support/lookup-entry]] | `:attachments` |
| `content` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content` |
| `documentFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-format` |
| `documentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requires` | java.util.List | [[cdk.support/lookup-entry]] | `:requires` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
| `updateMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-method` |
| `versionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-name` |
"
  [^CfnDocument$Builder builder id config]
  (when-some [data (lookup-entry config id :attachments)]
    (. builder attachments data))
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :document-format)]
    (. builder documentFormat data))
  (when-some [data (lookup-entry config id :document-type)]
    (. builder documentType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :requires)]
    (. builder requires data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (when-some [data (lookup-entry config id :update-method)]
    (. builder updateMethod data))
  (when-some [data (lookup-entry config id :version-name)]
    (. builder versionName data))
  (.build builder))


(defn cfn-document-builder
  "Creates a  `CfnDocument$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-document-builder> (CfnDocument$Builder/create scope (name id)) id config))


(defn cfn-document-document-requires-property-builder>
  "The cfn-document-document-requires-property-builder> function updates a CfnDocument$DocumentRequiresProperty$Builder instance using the provided configuration.
  The function takes the CfnDocument$DocumentRequiresProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `version` | java.lang.String | [[cdk.support/lookup-entry]] | `:version` |
"
  [^CfnDocument$DocumentRequiresProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn cfn-document-document-requires-property-builder
  "Creates a  `CfnDocument$DocumentRequiresProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-document-document-requires-property-builder> (new CfnDocument$DocumentRequiresProperty$Builder) id config))


(defn cfn-document-props-builder>
  "The cfn-document-props-builder> function updates a CfnDocumentProps$Builder instance using the provided configuration.
  The function takes the CfnDocumentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attachments` | java.util.List | [[cdk.support/lookup-entry]] | `:attachments` |
| `content` | java.lang.Object | [[cdk.support/lookup-entry]] | `:content` |
| `documentFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-format` |
| `documentType` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-type` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `requires` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:requires` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
| `updateMethod` | java.lang.String | [[cdk.support/lookup-entry]] | `:update-method` |
| `versionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:version-name` |
"
  [^CfnDocumentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :attachments)]
    (. builder attachments data))
  (when-some [data (lookup-entry config id :content)]
    (. builder content data))
  (when-some [data (lookup-entry config id :document-format)]
    (. builder documentFormat data))
  (when-some [data (lookup-entry config id :document-type)]
    (. builder documentType data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :requires)]
    (. builder requires data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (when-some [data (lookup-entry config id :update-method)]
    (. builder updateMethod data))
  (when-some [data (lookup-entry config id :version-name)]
    (. builder versionName data))
  (.build builder))


(defn cfn-document-props-builder
  "Creates a  `CfnDocumentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-document-props-builder> (new CfnDocumentProps$Builder) id config))


(defn cfn-maintenance-window-builder>
  "The cfn-maintenance-window-builder> function updates a CfnMaintenanceWindow$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindow$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowUnassociatedTargets` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-unassociated-targets` |
| `cutoff` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cutoff` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `duration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration` |
| `endDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `scheduleOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-offset` |
| `scheduleTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-timezone` |
| `startDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-date` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMaintenanceWindow$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-unassociated-targets)]
    (. builder allowUnassociatedTargets data))
  (when-some [data (lookup-entry config id :cutoff)]
    (. builder cutoff data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :duration)]
    (. builder duration data))
  (when-some [data (lookup-entry config id :end-date)]
    (. builder endDate data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :schedule-offset)]
    (. builder scheduleOffset data))
  (when-some [data (lookup-entry config id :schedule-timezone)]
    (. builder scheduleTimezone data))
  (when-some [data (lookup-entry config id :start-date)]
    (. builder startDate data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-maintenance-window-builder
  "Creates a  `CfnMaintenanceWindow$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-maintenance-window-builder> (CfnMaintenanceWindow$Builder/create scope (name id)) id config))


(defn cfn-maintenance-window-props-builder>
  "The cfn-maintenance-window-props-builder> function updates a CfnMaintenanceWindowProps$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowUnassociatedTargets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:allow-unassociated-targets` |
| `cutoff` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cutoff` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `duration` | java.lang.Number | [[cdk.support/lookup-entry]] | `:duration` |
| `endDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:end-date` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `schedule` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule` |
| `scheduleOffset` | java.lang.Number | [[cdk.support/lookup-entry]] | `:schedule-offset` |
| `scheduleTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-timezone` |
| `startDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:start-date` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMaintenanceWindowProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-unassociated-targets)]
    (. builder allowUnassociatedTargets data))
  (when-some [data (lookup-entry config id :cutoff)]
    (. builder cutoff data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :duration)]
    (. builder duration data))
  (when-some [data (lookup-entry config id :end-date)]
    (. builder endDate data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :schedule-offset)]
    (. builder scheduleOffset data))
  (when-some [data (lookup-entry config id :schedule-timezone)]
    (. builder scheduleTimezone data))
  (when-some [data (lookup-entry config id :start-date)]
    (. builder startDate data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-maintenance-window-props-builder
  "Creates a  `CfnMaintenanceWindowProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-props-builder> (new CfnMaintenanceWindowProps$Builder) id config))


(defn cfn-maintenance-window-target-builder>
  "The cfn-maintenance-window-target-builder> function updates a CfnMaintenanceWindowTarget$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTarget$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ownerInformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-information` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `windowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:window-id` |
"
  [^CfnMaintenanceWindowTarget$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :owner-information)]
    (. builder ownerInformation data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :window-id)]
    (. builder windowId data))
  (.build builder))


(defn cfn-maintenance-window-target-builder
  "Creates a  `CfnMaintenanceWindowTarget$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-maintenance-window-target-builder> (CfnMaintenanceWindowTarget$Builder/create scope (name id)) id config))


(defn cfn-maintenance-window-target-props-builder>
  "The cfn-maintenance-window-target-props-builder> function updates a CfnMaintenanceWindowTargetProps$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTargetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `ownerInformation` | java.lang.String | [[cdk.support/lookup-entry]] | `:owner-information` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `windowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:window-id` |
"
  [^CfnMaintenanceWindowTargetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :owner-information)]
    (. builder ownerInformation data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :window-id)]
    (. builder windowId data))
  (.build builder))


(defn cfn-maintenance-window-target-props-builder
  "Creates a  `CfnMaintenanceWindowTargetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-target-props-builder> (new CfnMaintenanceWindowTargetProps$Builder) id config))


(defn cfn-maintenance-window-target-targets-property-builder>
  "The cfn-maintenance-window-target-targets-property-builder> function updates a CfnMaintenanceWindowTarget$TargetsProperty$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTarget$TargetsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnMaintenanceWindowTarget$TargetsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-maintenance-window-target-targets-property-builder
  "Creates a  `CfnMaintenanceWindowTarget$TargetsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-target-targets-property-builder> (new CfnMaintenanceWindowTarget$TargetsProperty$Builder) id config))


(defn cfn-maintenance-window-task-builder>
  "The cfn-maintenance-window-task-builder> function updates a CfnMaintenanceWindowTask$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTask$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cutoffBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:cutoff-behavior` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `loggingInfo` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:logging-info` |
| `maxConcurrency` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxErrors` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-errors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `serviceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role-arn` |
| `targets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:targets` |
| `taskArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-arn` |
| `taskInvocationParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:task-invocation-parameters` |
| `taskParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:task-parameters` |
| `taskType` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-type` |
| `windowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:window-id` |
"
  [^CfnMaintenanceWindowTask$Builder builder id config]
  (when-some [data (lookup-entry config id :cutoff-behavior)]
    (. builder cutoffBehavior data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :logging-info)]
    (. builder loggingInfo data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :max-errors)]
    (. builder maxErrors data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :service-role-arn)]
    (. builder serviceRoleArn data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :task-arn)]
    (. builder taskArn data))
  (when-some [data (lookup-entry config id :task-invocation-parameters)]
    (. builder taskInvocationParameters data))
  (when-some [data (lookup-entry config id :task-parameters)]
    (. builder taskParameters data))
  (when-some [data (lookup-entry config id :task-type)]
    (. builder taskType data))
  (when-some [data (lookup-entry config id :window-id)]
    (. builder windowId data))
  (.build builder))


(defn cfn-maintenance-window-task-builder
  "Creates a  `CfnMaintenanceWindowTask$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-maintenance-window-task-builder> (CfnMaintenanceWindowTask$Builder/create scope (name id)) id config))


(defn cfn-maintenance-window-task-cloud-watch-output-config-property-builder>
  "The cfn-maintenance-window-task-cloud-watch-output-config-property-builder> function updates a CfnMaintenanceWindowTask$CloudWatchOutputConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTask$CloudWatchOutputConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogGroupName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-log-group-name` |
| `cloudWatchOutputEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cloud-watch-output-enabled` |
"
  [^CfnMaintenanceWindowTask$CloudWatchOutputConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-log-group-name)]
    (. builder cloudWatchLogGroupName data))
  (when-some [data (lookup-entry config id :cloud-watch-output-enabled)]
    (. builder cloudWatchOutputEnabled data))
  (.build builder))


(defn cfn-maintenance-window-task-cloud-watch-output-config-property-builder
  "Creates a  `CfnMaintenanceWindowTask$CloudWatchOutputConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-task-cloud-watch-output-config-property-builder> (new CfnMaintenanceWindowTask$CloudWatchOutputConfigProperty$Builder) id config))


(defn cfn-maintenance-window-task-logging-info-property-builder>
  "The cfn-maintenance-window-task-logging-info-property-builder> function updates a CfnMaintenanceWindowTask$LoggingInfoProperty$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTask$LoggingInfoProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `s3Bucket` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket` |
| `s3Prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-prefix` |
"
  [^CfnMaintenanceWindowTask$LoggingInfoProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :region)]
    (. builder region data))
  (when-some [data (lookup-entry config id :s3-bucket)]
    (. builder s3Bucket data))
  (when-some [data (lookup-entry config id :s3-prefix)]
    (. builder s3Prefix data))
  (.build builder))


(defn cfn-maintenance-window-task-logging-info-property-builder
  "Creates a  `CfnMaintenanceWindowTask$LoggingInfoProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-task-logging-info-property-builder> (new CfnMaintenanceWindowTask$LoggingInfoProperty$Builder) id config))


(defn cfn-maintenance-window-task-maintenance-window-automation-parameters-property-builder>
  "The cfn-maintenance-window-task-maintenance-window-automation-parameters-property-builder> function updates a CfnMaintenanceWindowTask$MaintenanceWindowAutomationParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTask$MaintenanceWindowAutomationParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `documentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-version` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
"
  [^CfnMaintenanceWindowTask$MaintenanceWindowAutomationParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :document-version)]
    (. builder documentVersion data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (.build builder))


(defn cfn-maintenance-window-task-maintenance-window-automation-parameters-property-builder
  "Creates a  `CfnMaintenanceWindowTask$MaintenanceWindowAutomationParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-task-maintenance-window-automation-parameters-property-builder> (new CfnMaintenanceWindowTask$MaintenanceWindowAutomationParametersProperty$Builder) id config))


(defn cfn-maintenance-window-task-maintenance-window-lambda-parameters-property-builder>
  "The cfn-maintenance-window-task-maintenance-window-lambda-parameters-property-builder> function updates a CfnMaintenanceWindowTask$MaintenanceWindowLambdaParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTask$MaintenanceWindowLambdaParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `clientContext` | java.lang.String | [[cdk.support/lookup-entry]] | `:client-context` |
| `payload` | java.lang.String | [[cdk.support/lookup-entry]] | `:payload` |
| `qualifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:qualifier` |
"
  [^CfnMaintenanceWindowTask$MaintenanceWindowLambdaParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :client-context)]
    (. builder clientContext data))
  (when-some [data (lookup-entry config id :payload)]
    (. builder payload data))
  (when-some [data (lookup-entry config id :qualifier)]
    (. builder qualifier data))
  (.build builder))


(defn cfn-maintenance-window-task-maintenance-window-lambda-parameters-property-builder
  "Creates a  `CfnMaintenanceWindowTask$MaintenanceWindowLambdaParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-task-maintenance-window-lambda-parameters-property-builder> (new CfnMaintenanceWindowTask$MaintenanceWindowLambdaParametersProperty$Builder) id config))


(defn cfn-maintenance-window-task-maintenance-window-run-command-parameters-property-builder>
  "The cfn-maintenance-window-task-maintenance-window-run-command-parameters-property-builder> function updates a CfnMaintenanceWindowTask$MaintenanceWindowRunCommandParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTask$MaintenanceWindowRunCommandParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchOutputConfig` | software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask$CloudWatchOutputConfigProperty | [[cdk.support/lookup-entry]] | `:cloud-watch-output-config` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `documentHash` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-hash` |
| `documentHashType` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-hash-type` |
| `documentVersion` | java.lang.String | [[cdk.support/lookup-entry]] | `:document-version` |
| `notificationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notification-config` |
| `outputS3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-s3-bucket-name` |
| `outputS3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:output-s3-key-prefix` |
| `parameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:parameters` |
| `serviceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role-arn` |
| `timeoutSeconds` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout-seconds` |
"
  [^CfnMaintenanceWindowTask$MaintenanceWindowRunCommandParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-watch-output-config)]
    (. builder cloudWatchOutputConfig data))
  (when-some [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-some [data (lookup-entry config id :document-hash)]
    (. builder documentHash data))
  (when-some [data (lookup-entry config id :document-hash-type)]
    (. builder documentHashType data))
  (when-some [data (lookup-entry config id :document-version)]
    (. builder documentVersion data))
  (when-some [data (lookup-entry config id :notification-config)]
    (. builder notificationConfig data))
  (when-some [data (lookup-entry config id :output-s3-bucket-name)]
    (. builder outputS3BucketName data))
  (when-some [data (lookup-entry config id :output-s3-key-prefix)]
    (. builder outputS3KeyPrefix data))
  (when-some [data (lookup-entry config id :parameters)]
    (. builder parameters data))
  (when-some [data (lookup-entry config id :service-role-arn)]
    (. builder serviceRoleArn data))
  (when-some [data (lookup-entry config id :timeout-seconds)]
    (. builder timeoutSeconds data))
  (.build builder))


(defn cfn-maintenance-window-task-maintenance-window-run-command-parameters-property-builder
  "Creates a  `CfnMaintenanceWindowTask$MaintenanceWindowRunCommandParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-task-maintenance-window-run-command-parameters-property-builder> (new CfnMaintenanceWindowTask$MaintenanceWindowRunCommandParametersProperty$Builder) id config))


(defn cfn-maintenance-window-task-maintenance-window-step-functions-parameters-property-builder>
  "The cfn-maintenance-window-task-maintenance-window-step-functions-parameters-property-builder> function updates a CfnMaintenanceWindowTask$MaintenanceWindowStepFunctionsParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTask$MaintenanceWindowStepFunctionsParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `input` | java.lang.String | [[cdk.support/lookup-entry]] | `:input` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnMaintenanceWindowTask$MaintenanceWindowStepFunctionsParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :input)]
    (. builder input data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-maintenance-window-task-maintenance-window-step-functions-parameters-property-builder
  "Creates a  `CfnMaintenanceWindowTask$MaintenanceWindowStepFunctionsParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-task-maintenance-window-step-functions-parameters-property-builder> (new CfnMaintenanceWindowTask$MaintenanceWindowStepFunctionsParametersProperty$Builder) id config))


(defn cfn-maintenance-window-task-notification-config-property-builder>
  "The cfn-maintenance-window-task-notification-config-property-builder> function updates a CfnMaintenanceWindowTask$NotificationConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTask$NotificationConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `notificationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-arn` |
| `notificationEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-events` |
| `notificationType` | java.lang.String | [[cdk.support/lookup-entry]] | `:notification-type` |
"
  [^CfnMaintenanceWindowTask$NotificationConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :notification-arn)]
    (. builder notificationArn data))
  (when-some [data (lookup-entry config id :notification-events)]
    (. builder notificationEvents data))
  (when-some [data (lookup-entry config id :notification-type)]
    (. builder notificationType data))
  (.build builder))


(defn cfn-maintenance-window-task-notification-config-property-builder
  "Creates a  `CfnMaintenanceWindowTask$NotificationConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-task-notification-config-property-builder> (new CfnMaintenanceWindowTask$NotificationConfigProperty$Builder) id config))


(defn cfn-maintenance-window-task-props-builder>
  "The cfn-maintenance-window-task-props-builder> function updates a CfnMaintenanceWindowTaskProps$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTaskProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cutoffBehavior` | java.lang.String | [[cdk.support/lookup-entry]] | `:cutoff-behavior` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `loggingInfo` | software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask$LoggingInfoProperty | [[cdk.support/lookup-entry]] | `:logging-info` |
| `maxConcurrency` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-concurrency` |
| `maxErrors` | java.lang.String | [[cdk.support/lookup-entry]] | `:max-errors` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `serviceRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-role-arn` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `taskArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-arn` |
| `taskInvocationParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:task-invocation-parameters` |
| `taskParameters` | java.lang.Object | [[cdk.support/lookup-entry]] | `:task-parameters` |
| `taskType` | java.lang.String | [[cdk.support/lookup-entry]] | `:task-type` |
| `windowId` | java.lang.String | [[cdk.support/lookup-entry]] | `:window-id` |
"
  [^CfnMaintenanceWindowTaskProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cutoff-behavior)]
    (. builder cutoffBehavior data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :logging-info)]
    (. builder loggingInfo data))
  (when-some [data (lookup-entry config id :max-concurrency)]
    (. builder maxConcurrency data))
  (when-some [data (lookup-entry config id :max-errors)]
    (. builder maxErrors data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (lookup-entry config id :service-role-arn)]
    (. builder serviceRoleArn data))
  (when-some [data (lookup-entry config id :targets)]
    (. builder targets data))
  (when-some [data (lookup-entry config id :task-arn)]
    (. builder taskArn data))
  (when-some [data (lookup-entry config id :task-invocation-parameters)]
    (. builder taskInvocationParameters data))
  (when-some [data (lookup-entry config id :task-parameters)]
    (. builder taskParameters data))
  (when-some [data (lookup-entry config id :task-type)]
    (. builder taskType data))
  (when-some [data (lookup-entry config id :window-id)]
    (. builder windowId data))
  (.build builder))


(defn cfn-maintenance-window-task-props-builder
  "Creates a  `CfnMaintenanceWindowTaskProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-task-props-builder> (new CfnMaintenanceWindowTaskProps$Builder) id config))


(defn cfn-maintenance-window-task-target-property-builder>
  "The cfn-maintenance-window-task-target-property-builder> function updates a CfnMaintenanceWindowTask$TargetProperty$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTask$TargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnMaintenanceWindowTask$TargetProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-maintenance-window-task-target-property-builder
  "Creates a  `CfnMaintenanceWindowTask$TargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-task-target-property-builder> (new CfnMaintenanceWindowTask$TargetProperty$Builder) id config))


(defn cfn-maintenance-window-task-task-invocation-parameters-property-builder>
  "The cfn-maintenance-window-task-task-invocation-parameters-property-builder> function updates a CfnMaintenanceWindowTask$TaskInvocationParametersProperty$Builder instance using the provided configuration.
  The function takes the CfnMaintenanceWindowTask$TaskInvocationParametersProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `maintenanceWindowAutomationParameters` | software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask$MaintenanceWindowAutomationParametersProperty | [[cdk.support/lookup-entry]] | `:maintenance-window-automation-parameters` |
| `maintenanceWindowLambdaParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maintenance-window-lambda-parameters` |
| `maintenanceWindowRunCommandParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maintenance-window-run-command-parameters` |
| `maintenanceWindowStepFunctionsParameters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:maintenance-window-step-functions-parameters` |
"
  [^CfnMaintenanceWindowTask$TaskInvocationParametersProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :maintenance-window-automation-parameters)]
    (. builder maintenanceWindowAutomationParameters data))
  (when-some [data (lookup-entry config id :maintenance-window-lambda-parameters)]
    (. builder maintenanceWindowLambdaParameters data))
  (when-some [data (lookup-entry config id :maintenance-window-run-command-parameters)]
    (. builder maintenanceWindowRunCommandParameters data))
  (when-some [data (lookup-entry config id :maintenance-window-step-functions-parameters)]
    (. builder maintenanceWindowStepFunctionsParameters data))
  (.build builder))


(defn cfn-maintenance-window-task-task-invocation-parameters-property-builder
  "Creates a  `CfnMaintenanceWindowTask$TaskInvocationParametersProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-maintenance-window-task-task-invocation-parameters-property-builder> (new CfnMaintenanceWindowTask$TaskInvocationParametersProperty$Builder) id config))


(defn cfn-parameter-builder>
  "The cfn-parameter-builder> function updates a CfnParameter$Builder instance using the provided configuration.
  The function takes the CfnParameter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-pattern` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policies` | java.lang.String | [[cdk.support/lookup-entry]] | `:policies` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnParameter$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-pattern)]
    (. builder allowedPattern data))
  (when-some [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tier)]
    (. builder tier data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-parameter-builder
  "Creates a  `CfnParameter$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-parameter-builder> (CfnParameter$Builder/create scope (name id)) id config))


(defn cfn-parameter-props-builder>
  "The cfn-parameter-props-builder> function updates a CfnParameterProps$Builder instance using the provided configuration.
  The function takes the CfnParameterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-pattern` |
| `dataType` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `policies` | java.lang.String | [[cdk.support/lookup-entry]] | `:policies` |
| `tags` | java.util.Map | [[cdk.support/lookup-entry]] | `:tags` |
| `tier` | java.lang.String | [[cdk.support/lookup-entry]] | `:tier` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnParameterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-pattern)]
    (. builder allowedPattern data))
  (when-some [data (lookup-entry config id :data-type)]
    (. builder dataType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :policies)]
    (. builder policies data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tier)]
    (. builder tier data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-parameter-props-builder
  "Creates a  `CfnParameterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-parameter-props-builder> (new CfnParameterProps$Builder) id config))


(defn cfn-patch-baseline-builder>
  "The cfn-patch-baseline-builder> function updates a CfnPatchBaseline$Builder instance using the provided configuration.
  The function takes the CfnPatchBaseline$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `approvalRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:approval-rules` |
| `approvedPatches` | java.util.List | [[cdk.support/lookup-entry]] | `:approved-patches` |
| `approvedPatchesComplianceLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:approved-patches-compliance-level` |
| `approvedPatchesEnableNonSecurity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:approved-patches-enable-non-security` |
| `defaultBaseline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-baseline` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalFilters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:global-filters` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operatingSystem` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system` |
| `patchGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:patch-groups` |
| `rejectedPatches` | java.util.List | [[cdk.support/lookup-entry]] | `:rejected-patches` |
| `rejectedPatchesAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:rejected-patches-action` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPatchBaseline$Builder builder id config]
  (when-some [data (lookup-entry config id :approval-rules)]
    (. builder approvalRules data))
  (when-some [data (lookup-entry config id :approved-patches)]
    (. builder approvedPatches data))
  (when-some [data (lookup-entry config id :approved-patches-compliance-level)]
    (. builder approvedPatchesComplianceLevel data))
  (when-some [data (lookup-entry config id :approved-patches-enable-non-security)]
    (. builder approvedPatchesEnableNonSecurity data))
  (when-some [data (lookup-entry config id :default-baseline)]
    (. builder defaultBaseline data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :global-filters)]
    (. builder globalFilters data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :operating-system)]
    (. builder operatingSystem data))
  (when-some [data (lookup-entry config id :patch-groups)]
    (. builder patchGroups data))
  (when-some [data (lookup-entry config id :rejected-patches)]
    (. builder rejectedPatches data))
  (when-some [data (lookup-entry config id :rejected-patches-action)]
    (. builder rejectedPatchesAction data))
  (when-some [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-patch-baseline-builder
  "Creates a  `CfnPatchBaseline$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-patch-baseline-builder> (CfnPatchBaseline$Builder/create scope (name id)) id config))


(defn cfn-patch-baseline-patch-filter-group-property-builder>
  "The cfn-patch-baseline-patch-filter-group-property-builder> function updates a CfnPatchBaseline$PatchFilterGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnPatchBaseline$PatchFilterGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `patchFilters` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:patch-filters` |
"
  [^CfnPatchBaseline$PatchFilterGroupProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :patch-filters)]
    (. builder patchFilters data))
  (.build builder))


(defn cfn-patch-baseline-patch-filter-group-property-builder
  "Creates a  `CfnPatchBaseline$PatchFilterGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-patch-baseline-patch-filter-group-property-builder> (new CfnPatchBaseline$PatchFilterGroupProperty$Builder) id config))


(defn cfn-patch-baseline-patch-filter-property-builder>
  "The cfn-patch-baseline-patch-filter-property-builder> function updates a CfnPatchBaseline$PatchFilterProperty$Builder instance using the provided configuration.
  The function takes the CfnPatchBaseline$PatchFilterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
"
  [^CfnPatchBaseline$PatchFilterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :values)]
    (. builder values data))
  (.build builder))


(defn cfn-patch-baseline-patch-filter-property-builder
  "Creates a  `CfnPatchBaseline$PatchFilterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-patch-baseline-patch-filter-property-builder> (new CfnPatchBaseline$PatchFilterProperty$Builder) id config))


(defn cfn-patch-baseline-patch-source-property-builder>
  "The cfn-patch-baseline-patch-source-property-builder> function updates a CfnPatchBaseline$PatchSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnPatchBaseline$PatchSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:configuration` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `products` | java.util.List | [[cdk.support/lookup-entry]] | `:products` |
"
  [^CfnPatchBaseline$PatchSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :products)]
    (. builder products data))
  (.build builder))


(defn cfn-patch-baseline-patch-source-property-builder
  "Creates a  `CfnPatchBaseline$PatchSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-patch-baseline-patch-source-property-builder> (new CfnPatchBaseline$PatchSourceProperty$Builder) id config))


(defn cfn-patch-baseline-props-builder>
  "The cfn-patch-baseline-props-builder> function updates a CfnPatchBaselineProps$Builder instance using the provided configuration.
  The function takes the CfnPatchBaselineProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `approvalRules` | software.amazon.awscdk.services.ssm.CfnPatchBaseline$RuleGroupProperty | [[cdk.support/lookup-entry]] | `:approval-rules` |
| `approvedPatches` | java.util.List | [[cdk.support/lookup-entry]] | `:approved-patches` |
| `approvedPatchesComplianceLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:approved-patches-compliance-level` |
| `approvedPatchesEnableNonSecurity` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:approved-patches-enable-non-security` |
| `defaultBaseline` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:default-baseline` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `globalFilters` | software.amazon.awscdk.services.ssm.CfnPatchBaseline$PatchFilterGroupProperty | [[cdk.support/lookup-entry]] | `:global-filters` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `operatingSystem` | java.lang.String | [[cdk.support/lookup-entry]] | `:operating-system` |
| `patchGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:patch-groups` |
| `rejectedPatches` | java.util.List | [[cdk.support/lookup-entry]] | `:rejected-patches` |
| `rejectedPatchesAction` | java.lang.String | [[cdk.support/lookup-entry]] | `:rejected-patches-action` |
| `sources` | java.util.List | [[cdk.support/lookup-entry]] | `:sources` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPatchBaselineProps$Builder builder id config]
  (when-some [data (lookup-entry config id :approval-rules)]
    (. builder approvalRules data))
  (when-some [data (lookup-entry config id :approved-patches)]
    (. builder approvedPatches data))
  (when-some [data (lookup-entry config id :approved-patches-compliance-level)]
    (. builder approvedPatchesComplianceLevel data))
  (when-some [data (lookup-entry config id :approved-patches-enable-non-security)]
    (. builder approvedPatchesEnableNonSecurity data))
  (when-some [data (lookup-entry config id :default-baseline)]
    (. builder defaultBaseline data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :global-filters)]
    (. builder globalFilters data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :operating-system)]
    (. builder operatingSystem data))
  (when-some [data (lookup-entry config id :patch-groups)]
    (. builder patchGroups data))
  (when-some [data (lookup-entry config id :rejected-patches)]
    (. builder rejectedPatches data))
  (when-some [data (lookup-entry config id :rejected-patches-action)]
    (. builder rejectedPatchesAction data))
  (when-some [data (lookup-entry config id :sources)]
    (. builder sources data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-patch-baseline-props-builder
  "Creates a  `CfnPatchBaselineProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-patch-baseline-props-builder> (new CfnPatchBaselineProps$Builder) id config))


(defn cfn-patch-baseline-rule-group-property-builder>
  "The cfn-patch-baseline-rule-group-property-builder> function updates a CfnPatchBaseline$RuleGroupProperty$Builder instance using the provided configuration.
  The function takes the CfnPatchBaseline$RuleGroupProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `patchRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:patch-rules` |
"
  [^CfnPatchBaseline$RuleGroupProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :patch-rules)]
    (. builder patchRules data))
  (.build builder))


(defn cfn-patch-baseline-rule-group-property-builder
  "Creates a  `CfnPatchBaseline$RuleGroupProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-patch-baseline-rule-group-property-builder> (new CfnPatchBaseline$RuleGroupProperty$Builder) id config))


(defn cfn-patch-baseline-rule-property-builder>
  "The cfn-patch-baseline-rule-property-builder> function updates a CfnPatchBaseline$RuleProperty$Builder instance using the provided configuration.
  The function takes the CfnPatchBaseline$RuleProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `approveAfterDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:approve-after-days` |
| `approveUntilDate` | java.lang.String | [[cdk.support/lookup-entry]] | `:approve-until-date` |
| `complianceLevel` | java.lang.String | [[cdk.support/lookup-entry]] | `:compliance-level` |
| `enableNonSecurity` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-non-security` |
| `patchFilterGroup` | software.amazon.awscdk.services.ssm.CfnPatchBaseline$PatchFilterGroupProperty | [[cdk.support/lookup-entry]] | `:patch-filter-group` |
"
  [^CfnPatchBaseline$RuleProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :approve-after-days)]
    (. builder approveAfterDays data))
  (when-some [data (lookup-entry config id :approve-until-date)]
    (. builder approveUntilDate data))
  (when-some [data (lookup-entry config id :compliance-level)]
    (. builder complianceLevel data))
  (when-some [data (lookup-entry config id :enable-non-security)]
    (. builder enableNonSecurity data))
  (when-some [data (lookup-entry config id :patch-filter-group)]
    (. builder patchFilterGroup data))
  (.build builder))


(defn cfn-patch-baseline-rule-property-builder
  "Creates a  `CfnPatchBaseline$RuleProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-patch-baseline-rule-property-builder> (new CfnPatchBaseline$RuleProperty$Builder) id config))


(defn cfn-resource-data-sync-aws-organizations-source-property-builder>
  "The cfn-resource-data-sync-aws-organizations-source-property-builder> function updates a CfnResourceDataSync$AwsOrganizationsSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDataSync$AwsOrganizationsSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `organizationSourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:organization-source-type` |
| `organizationalUnits` | java.util.List | [[cdk.support/lookup-entry]] | `:organizational-units` |
"
  [^CfnResourceDataSync$AwsOrganizationsSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :organization-source-type)]
    (. builder organizationSourceType data))
  (when-some [data (lookup-entry config id :organizational-units)]
    (. builder organizationalUnits data))
  (.build builder))


(defn cfn-resource-data-sync-aws-organizations-source-property-builder
  "Creates a  `CfnResourceDataSync$AwsOrganizationsSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-resource-data-sync-aws-organizations-source-property-builder> (new CfnResourceDataSync$AwsOrganizationsSourceProperty$Builder) id config))


(defn cfn-resource-data-sync-builder>
  "The cfn-resource-data-sync-builder> function updates a CfnResourceDataSync$Builder instance using the provided configuration.
  The function takes the CfnResourceDataSync$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `bucketRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-region` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `s3Destination` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:s3-destination` |
| `syncFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-format` |
| `syncName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-name` |
| `syncSource` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sync-source` |
| `syncType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-type` |
"
  [^CfnResourceDataSync$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :bucket-region)]
    (. builder bucketRegion data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :s3-destination)]
    (. builder s3Destination data))
  (when-some [data (lookup-entry config id :sync-format)]
    (. builder syncFormat data))
  (when-some [data (lookup-entry config id :sync-name)]
    (. builder syncName data))
  (when-some [data (lookup-entry config id :sync-source)]
    (. builder syncSource data))
  (when-some [data (lookup-entry config id :sync-type)]
    (. builder syncType data))
  (.build builder))


(defn cfn-resource-data-sync-builder
  "Creates a  `CfnResourceDataSync$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-resource-data-sync-builder> (CfnResourceDataSync$Builder/create scope (name id)) id config))


(defn cfn-resource-data-sync-props-builder>
  "The cfn-resource-data-sync-props-builder> function updates a CfnResourceDataSyncProps$Builder instance using the provided configuration.
  The function takes the CfnResourceDataSyncProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `bucketRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-region` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `s3Destination` | software.amazon.awscdk.services.ssm.CfnResourceDataSync$S3DestinationProperty | [[cdk.support/lookup-entry]] | `:s3-destination` |
| `syncFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-format` |
| `syncName` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-name` |
| `syncSource` | software.amazon.awscdk.services.ssm.CfnResourceDataSync$SyncSourceProperty | [[cdk.support/lookup-entry]] | `:sync-source` |
| `syncType` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-type` |
"
  [^CfnResourceDataSyncProps$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :bucket-region)]
    (. builder bucketRegion data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :s3-destination)]
    (. builder s3Destination data))
  (when-some [data (lookup-entry config id :sync-format)]
    (. builder syncFormat data))
  (when-some [data (lookup-entry config id :sync-name)]
    (. builder syncName data))
  (when-some [data (lookup-entry config id :sync-source)]
    (. builder syncSource data))
  (when-some [data (lookup-entry config id :sync-type)]
    (. builder syncType data))
  (.build builder))


(defn cfn-resource-data-sync-props-builder
  "Creates a  `CfnResourceDataSyncProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-resource-data-sync-props-builder> (new CfnResourceDataSyncProps$Builder) id config))


(defn cfn-resource-data-sync-s3-destination-property-builder>
  "The cfn-resource-data-sync-s3-destination-property-builder> function updates a CfnResourceDataSync$S3DestinationProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDataSync$S3DestinationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `bucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-name` |
| `bucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-prefix` |
| `bucketRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:bucket-region` |
| `kmsKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-arn` |
| `syncFormat` | java.lang.String | [[cdk.support/lookup-entry]] | `:sync-format` |
"
  [^CfnResourceDataSync$S3DestinationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :bucket-name)]
    (. builder bucketName data))
  (when-some [data (lookup-entry config id :bucket-prefix)]
    (. builder bucketPrefix data))
  (when-some [data (lookup-entry config id :bucket-region)]
    (. builder bucketRegion data))
  (when-some [data (lookup-entry config id :kms-key-arn)]
    (. builder kmsKeyArn data))
  (when-some [data (lookup-entry config id :sync-format)]
    (. builder syncFormat data))
  (.build builder))


(defn cfn-resource-data-sync-s3-destination-property-builder
  "Creates a  `CfnResourceDataSync$S3DestinationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-resource-data-sync-s3-destination-property-builder> (new CfnResourceDataSync$S3DestinationProperty$Builder) id config))


(defn cfn-resource-data-sync-sync-source-property-builder>
  "The cfn-resource-data-sync-sync-source-property-builder> function updates a CfnResourceDataSync$SyncSourceProperty$Builder instance using the provided configuration.
  The function takes the CfnResourceDataSync$SyncSourceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsOrganizationsSource` | software.amazon.awscdk.services.ssm.CfnResourceDataSync$AwsOrganizationsSourceProperty | [[cdk.support/lookup-entry]] | `:aws-organizations-source` |
| `includeFutureRegions` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:include-future-regions` |
| `sourceRegions` | java.util.List | [[cdk.support/lookup-entry]] | `:source-regions` |
| `sourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:source-type` |
"
  [^CfnResourceDataSync$SyncSourceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :aws-organizations-source)]
    (. builder awsOrganizationsSource data))
  (when-some [data (lookup-entry config id :include-future-regions)]
    (. builder includeFutureRegions data))
  (when-some [data (lookup-entry config id :source-regions)]
    (. builder sourceRegions data))
  (when-some [data (lookup-entry config id :source-type)]
    (. builder sourceType data))
  (.build builder))


(defn cfn-resource-data-sync-sync-source-property-builder
  "Creates a  `CfnResourceDataSync$SyncSourceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-resource-data-sync-sync-source-property-builder> (new CfnResourceDataSync$SyncSourceProperty$Builder) id config))


(defn cfn-resource-policy-builder>
  "The cfn-resource-policy-builder> function updates a CfnResourcePolicy$Builder instance using the provided configuration.
  The function takes the CfnResourcePolicy$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnResourcePolicy$Builder builder id config]
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
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
| `policy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:policy` |
| `resourceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-arn` |
"
  [^CfnResourcePolicyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :policy)]
    (. builder policy data))
  (when-some [data (lookup-entry config id :resource-arn)]
    (. builder resourceArn data))
  (.build builder))


(defn cfn-resource-policy-props-builder
  "Creates a  `CfnResourcePolicyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-resource-policy-props-builder> (new CfnResourcePolicyProps$Builder) id config))


(defn common-string-parameter-attributes-builder>
  "The common-string-parameter-attributes-builder> function updates a CommonStringParameterAttributes$Builder instance using the provided configuration.
  The function takes the CommonStringParameterAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `simpleName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:simple-name` |
"
  [^CommonStringParameterAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :simple-name)]
    (. builder simpleName data))
  (.build builder))


(defn common-string-parameter-attributes-builder
  "Creates a  `CommonStringParameterAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (common-string-parameter-attributes-builder> (new CommonStringParameterAttributes$Builder) id config))


(defn list-parameter-attributes-builder>
  "The list-parameter-attributes-builder> function updates a ListParameterAttributes$Builder instance using the provided configuration.
  The function takes the ListParameterAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `elementType` | software.amazon.awscdk.services.ssm.ParameterValueType | [[cdk.api.services.ssm/parameter-value-type]] | `:element-type` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `simpleName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:simple-name` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |
"
  [^ListParameterAttributes$Builder builder id config]
  (when-some [data (parameter-value-type config id :element-type)]
    (. builder elementType data))
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :simple-name)]
    (. builder simpleName data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn list-parameter-attributes-builder
  "Creates a  `ListParameterAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (list-parameter-attributes-builder> (new ListParameterAttributes$Builder) id config))


(defn parameter-options-builder>
  "The parameter-options-builder> function updates a ParameterOptions$Builder instance using the provided configuration.
  The function takes the ParameterOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-pattern` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `simpleName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:simple-name` |
| `tier` | software.amazon.awscdk.services.ssm.ParameterTier | [[cdk.api.services.ssm/parameter-tier]] | `:tier` |
"
  [^ParameterOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-pattern)]
    (. builder allowedPattern data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :simple-name)]
    (. builder simpleName data))
  (when-some [data (parameter-tier config id :tier)]
    (. builder tier data))
  (.build builder))


(defn parameter-options-builder
  "Creates a  `ParameterOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (parameter-options-builder> (new ParameterOptions$Builder) id config))


(defn secure-string-parameter-attributes-builder>
  "The secure-string-parameter-attributes-builder> function updates a SecureStringParameterAttributes$Builder instance using the provided configuration.
  The function takes the SecureStringParameterAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `simpleName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:simple-name` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |
"
  [^SecureStringParameterAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :simple-name)]
    (. builder simpleName data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn secure-string-parameter-attributes-builder
  "Creates a  `SecureStringParameterAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (secure-string-parameter-attributes-builder> (new SecureStringParameterAttributes$Builder) id config))


(defn string-list-parameter-builder>
  "The string-list-parameter-builder> function updates a StringListParameter$Builder instance using the provided configuration.
  The function takes the StringListParameter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-pattern` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `simpleName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:simple-name` |
| `stringListValue` | java.util.List | [[cdk.support/lookup-entry]] | `:string-list-value` |
| `tier` | software.amazon.awscdk.services.ssm.ParameterTier | [[cdk.api.services.ssm/parameter-tier]] | `:tier` |
"
  [^StringListParameter$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-pattern)]
    (. builder allowedPattern data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :simple-name)]
    (. builder simpleName data))
  (when-some [data (lookup-entry config id :string-list-value)]
    (. builder stringListValue data))
  (when-some [data (parameter-tier config id :tier)]
    (. builder tier data))
  (.build builder))


(defn string-list-parameter-builder
  "Creates a  `StringListParameter$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (string-list-parameter-builder> (StringListParameter$Builder/create scope (name id)) id config))


(defn string-list-parameter-props-builder>
  "The string-list-parameter-props-builder> function updates a StringListParameterProps$Builder instance using the provided configuration.
  The function takes the StringListParameterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-pattern` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `simpleName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:simple-name` |
| `stringListValue` | java.util.List | [[cdk.support/lookup-entry]] | `:string-list-value` |
| `tier` | software.amazon.awscdk.services.ssm.ParameterTier | [[cdk.api.services.ssm/parameter-tier]] | `:tier` |
"
  [^StringListParameterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-pattern)]
    (. builder allowedPattern data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :simple-name)]
    (. builder simpleName data))
  (when-some [data (lookup-entry config id :string-list-value)]
    (. builder stringListValue data))
  (when-some [data (parameter-tier config id :tier)]
    (. builder tier data))
  (.build builder))


(defn string-list-parameter-props-builder
  "Creates a  `StringListParameterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (string-list-parameter-props-builder> (new StringListParameterProps$Builder) id config))


(defn string-parameter-attributes-builder>
  "The string-parameter-attributes-builder> function updates a StringParameterAttributes$Builder instance using the provided configuration.
  The function takes the StringParameterAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `forceDynamicReference` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-dynamic-reference` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `simpleName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:simple-name` |
| `type` | software.amazon.awscdk.services.ssm.ParameterType | [[cdk.support/lookup-entry]] | `:type` |
| `valueType` | software.amazon.awscdk.services.ssm.ParameterValueType | [[cdk.api.services.ssm/parameter-value-type]] | `:value-type` |
| `version` | java.lang.Number | [[cdk.support/lookup-entry]] | `:version` |
"
  [^StringParameterAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :force-dynamic-reference)]
    (. builder forceDynamicReference data))
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :simple-name)]
    (. builder simpleName data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (when-some [data (parameter-value-type config id :value-type)]
    (. builder valueType data))
  (when-some [data (lookup-entry config id :version)]
    (. builder version data))
  (.build builder))


(defn string-parameter-attributes-builder
  "Creates a  `StringParameterAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (string-parameter-attributes-builder> (new StringParameterAttributes$Builder) id config))


(defn string-parameter-builder>
  "The string-parameter-builder> function updates a StringParameter$Builder instance using the provided configuration.
  The function takes the StringParameter$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-pattern` |
| `dataType` | software.amazon.awscdk.services.ssm.ParameterDataType | [[cdk.api.services.ssm/parameter-data-type]] | `:data-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `simpleName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:simple-name` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
| `tier` | software.amazon.awscdk.services.ssm.ParameterTier | [[cdk.api.services.ssm/parameter-tier]] | `:tier` |
| `type` | software.amazon.awscdk.services.ssm.ParameterType | [[cdk.support/lookup-entry]] | `:type` |
"
  [^StringParameter$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-pattern)]
    (. builder allowedPattern data))
  (when-some [data (parameter-data-type config id :data-type)]
    (. builder dataType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :simple-name)]
    (. builder simpleName data))
  (when-some [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (when-some [data (parameter-tier config id :tier)]
    (. builder tier data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn string-parameter-builder
  "Creates a  `StringParameter$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (string-parameter-builder> (StringParameter$Builder/create scope (name id)) id config))


(defn string-parameter-props-builder>
  "The string-parameter-props-builder> function updates a StringParameterProps$Builder instance using the provided configuration.
  The function takes the StringParameterProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowedPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:allowed-pattern` |
| `dataType` | software.amazon.awscdk.services.ssm.ParameterDataType | [[cdk.api.services.ssm/parameter-data-type]] | `:data-type` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `simpleName` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:simple-name` |
| `stringValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:string-value` |
| `tier` | software.amazon.awscdk.services.ssm.ParameterTier | [[cdk.api.services.ssm/parameter-tier]] | `:tier` |
| `type` | software.amazon.awscdk.services.ssm.ParameterType | [[cdk.support/lookup-entry]] | `:type` |
"
  [^StringParameterProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allowed-pattern)]
    (. builder allowedPattern data))
  (when-some [data (parameter-data-type config id :data-type)]
    (. builder dataType data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :simple-name)]
    (. builder simpleName data))
  (when-some [data (lookup-entry config id :string-value)]
    (. builder stringValue data))
  (when-some [data (parameter-tier config id :tier)]
    (. builder tier data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn string-parameter-props-builder
  "Creates a  `StringParameterProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (string-parameter-props-builder> (new StringParameterProps$Builder) id config))