(ns cdk.api.services.backup
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.backup package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.backup BackupPlan$Builder
                                                   BackupPlanCopyActionProps$Builder
                                                   BackupPlanProps$Builder
                                                   BackupPlanRule$Builder
                                                   BackupPlanRuleProps$Builder
                                                   BackupResource$Builder
                                                   BackupSelection$Builder
                                                   BackupSelectionOptions$Builder
                                                   BackupSelectionProps$Builder
                                                   BackupVault$Builder
                                                   BackupVaultEvents
                                                   BackupVaultProps$Builder
                                                   CfnBackupPlan$AdvancedBackupSettingResourceTypeProperty$Builder
                                                   CfnBackupPlan$BackupPlanResourceTypeProperty$Builder
                                                   CfnBackupPlan$BackupRuleResourceTypeProperty$Builder
                                                   CfnBackupPlan$Builder
                                                   CfnBackupPlan$CopyActionResourceTypeProperty$Builder
                                                   CfnBackupPlan$LifecycleResourceTypeProperty$Builder
                                                   CfnBackupPlanProps$Builder
                                                   CfnBackupSelection$BackupSelectionResourceTypeProperty$Builder
                                                   CfnBackupSelection$Builder
                                                   CfnBackupSelection$ConditionParameterProperty$Builder
                                                   CfnBackupSelection$ConditionResourceTypeProperty$Builder
                                                   CfnBackupSelection$ConditionsProperty$Builder
                                                   CfnBackupSelectionProps$Builder
                                                   CfnBackupVault$Builder
                                                   CfnBackupVault$LockConfigurationTypeProperty$Builder
                                                   CfnBackupVault$NotificationObjectTypeProperty$Builder
                                                   CfnBackupVaultProps$Builder
                                                   CfnFramework$Builder
                                                   CfnFramework$ControlInputParameterProperty$Builder
                                                   CfnFramework$ControlScopeProperty$Builder
                                                   CfnFramework$FrameworkControlProperty$Builder
                                                   CfnFrameworkProps$Builder
                                                   CfnReportPlan$Builder
                                                   CfnReportPlan$ReportDeliveryChannelProperty$Builder
                                                   CfnReportPlan$ReportSettingProperty$Builder
                                                   CfnReportPlanProps$Builder
                                                   CfnRestoreTestingPlan$Builder
                                                   CfnRestoreTestingPlan$RestoreTestingRecoveryPointSelectionProperty$Builder
                                                   CfnRestoreTestingPlanProps$Builder
                                                   CfnRestoreTestingSelection$Builder
                                                   CfnRestoreTestingSelection$KeyValueProperty$Builder
                                                   CfnRestoreTestingSelection$ProtectedResourceConditionsProperty$Builder
                                                   CfnRestoreTestingSelectionProps$Builder
                                                   LockConfiguration$Builder
                                                   TagCondition$Builder
                                                   TagOperation]))


(defn backup-vault-events
  "The `backup-vault-events` function data interprets values in the provided config data into a 
`BackupVaultEvents` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `BackupVaultEvents` - the value is returned.
* is `:restore-job-completed` - `BackupVaultEvents/RESTORE_JOB_COMPLETED` is returned
* is `:recovery-point-modified` - `BackupVaultEvents/RECOVERY_POINT_MODIFIED` is returned
* is `:restore-job-failed` - `BackupVaultEvents/RESTORE_JOB_FAILED` is returned
* is `:copy-job-successful` - `BackupVaultEvents/COPY_JOB_SUCCESSFUL` is returned
* is `:backup-plan-created` - `BackupVaultEvents/BACKUP_PLAN_CREATED` is returned
* is `:restore-job-successful` - `BackupVaultEvents/RESTORE_JOB_SUCCESSFUL` is returned
* is `:backup-job-expired` - `BackupVaultEvents/BACKUP_JOB_EXPIRED` is returned
* is `:s3-restore-object-failed` - `BackupVaultEvents/S3_RESTORE_OBJECT_FAILED` is returned
* is `:backup-job-failed` - `BackupVaultEvents/BACKUP_JOB_FAILED` is returned
* is `:backup-plan-modified` - `BackupVaultEvents/BACKUP_PLAN_MODIFIED` is returned
* is `:copy-job-started` - `BackupVaultEvents/COPY_JOB_STARTED` is returned
* is `:s3-backup-object-failed` - `BackupVaultEvents/S3_BACKUP_OBJECT_FAILED` is returned
* is `:backup-job-started` - `BackupVaultEvents/BACKUP_JOB_STARTED` is returned
* is `:backup-job-completed` - `BackupVaultEvents/BACKUP_JOB_COMPLETED` is returned
* is `:restore-job-started` - `BackupVaultEvents/RESTORE_JOB_STARTED` is returned
* is `:copy-job-failed` - `BackupVaultEvents/COPY_JOB_FAILED` is returned
* is `:backup-job-successful` - `BackupVaultEvents/BACKUP_JOB_SUCCESSFUL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? BackupVaultEvents data) data
      (= :restore-job-completed data) BackupVaultEvents/RESTORE_JOB_COMPLETED
      (= :recovery-point-modified data) BackupVaultEvents/RECOVERY_POINT_MODIFIED
      (= :restore-job-failed data) BackupVaultEvents/RESTORE_JOB_FAILED
      (= :copy-job-successful data) BackupVaultEvents/COPY_JOB_SUCCESSFUL
      (= :backup-plan-created data) BackupVaultEvents/BACKUP_PLAN_CREATED
      (= :restore-job-successful data) BackupVaultEvents/RESTORE_JOB_SUCCESSFUL
      (= :backup-job-expired data) BackupVaultEvents/BACKUP_JOB_EXPIRED
      (= :s3-restore-object-failed data) BackupVaultEvents/S3_RESTORE_OBJECT_FAILED
      (= :backup-job-failed data) BackupVaultEvents/BACKUP_JOB_FAILED
      (= :backup-plan-modified data) BackupVaultEvents/BACKUP_PLAN_MODIFIED
      (= :copy-job-started data) BackupVaultEvents/COPY_JOB_STARTED
      (= :s3-backup-object-failed data) BackupVaultEvents/S3_BACKUP_OBJECT_FAILED
      (= :backup-job-started data) BackupVaultEvents/BACKUP_JOB_STARTED
      (= :backup-job-completed data) BackupVaultEvents/BACKUP_JOB_COMPLETED
      (= :restore-job-started data) BackupVaultEvents/RESTORE_JOB_STARTED
      (= :copy-job-failed data) BackupVaultEvents/COPY_JOB_FAILED
      (= :backup-job-successful data) BackupVaultEvents/BACKUP_JOB_SUCCESSFUL)))


(defn tag-operation
  "The `tag-operation` function data interprets values in the provided config data into a 
`TagOperation` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `TagOperation` - the value is returned.
* is `:string-equals` - `TagOperation/STRING_EQUALS` is returned
* is `:dummy` - `TagOperation/DUMMY` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? TagOperation data) data
      (= :string-equals data) TagOperation/STRING_EQUALS
      (= :dummy data) TagOperation/DUMMY)))





(defn backup-plan-builder
  "The backup-plan-builder function buildes out new instances of 
BackupPlan$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-plan-name` |
| `backupPlanRules` | java.util.List | [[cdk.support/lookup-entry]] | `:backup-plan-rules` |
| `backupVault` | software.amazon.awscdk.services.backup.IBackupVault | [[cdk.support/lookup-entry]] | `:backup-vault` |
| `windowsVss` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:windows-vss` |"
  [stack id config]
  (let [builder (BackupPlan$Builder/create stack id)]
    (when-let [data (lookup-entry config id :backup-plan-name)]
      (. builder backupPlanName data))
    (when-let [data (lookup-entry config id :backup-plan-rules)]
      (. builder backupPlanRules data))
    (when-let [data (lookup-entry config id :backup-vault)]
      (. builder backupVault data))
    (when-let [data (lookup-entry config id :windows-vss)]
      (. builder windowsVss data))
    (.build builder)))


(defn backup-plan-copy-action-props-builder
  "The backup-plan-copy-action-props-builder function buildes out new instances of 
BackupPlanCopyActionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:delete-after` |
| `destinationBackupVault` | software.amazon.awscdk.services.backup.IBackupVault | [[cdk.support/lookup-entry]] | `:destination-backup-vault` |
| `moveToColdStorageAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:move-to-cold-storage-after` |"
  [stack id config]
  (let [builder (BackupPlanCopyActionProps$Builder.)]
    (when-let [data (lookup-entry config id :delete-after)]
      (. builder deleteAfter data))
    (when-let [data (lookup-entry config id :destination-backup-vault)]
      (. builder destinationBackupVault data))
    (when-let [data (lookup-entry config id :move-to-cold-storage-after)]
      (. builder moveToColdStorageAfter data))
    (.build builder)))


(defn backup-plan-props-builder
  "The backup-plan-props-builder function buildes out new instances of 
BackupPlanProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-plan-name` |
| `backupPlanRules` | java.util.List | [[cdk.support/lookup-entry]] | `:backup-plan-rules` |
| `backupVault` | software.amazon.awscdk.services.backup.IBackupVault | [[cdk.support/lookup-entry]] | `:backup-vault` |
| `windowsVss` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:windows-vss` |"
  [stack id config]
  (let [builder (BackupPlanProps$Builder.)]
    (when-let [data (lookup-entry config id :backup-plan-name)]
      (. builder backupPlanName data))
    (when-let [data (lookup-entry config id :backup-plan-rules)]
      (. builder backupPlanRules data))
    (when-let [data (lookup-entry config id :backup-vault)]
      (. builder backupVault data))
    (when-let [data (lookup-entry config id :windows-vss)]
      (. builder windowsVss data))
    (.build builder)))


(defn backup-plan-rule-builder
  "The backup-plan-rule-builder function buildes out new instances of 
BackupPlanRule$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupVault` | software.amazon.awscdk.services.backup.IBackupVault | [[cdk.support/lookup-entry]] | `:backup-vault` |
| `completionWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:completion-window` |
| `copyActions` | java.util.List | [[cdk.support/lookup-entry]] | `:copy-actions` |
| `deleteAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:delete-after` |
| `enableContinuousBackup` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-continuous-backup` |
| `moveToColdStorageAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:move-to-cold-storage-after` |
| `recoveryPointTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:recovery-point-tags` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `scheduleExpression` | software.amazon.awscdk.services.events.Schedule | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `startWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-window` |"
  [stack id config]
  (let [builder (BackupPlanRule$Builder/create)]
    (when-let [data (lookup-entry config id :backup-vault)]
      (. builder backupVault data))
    (when-let [data (lookup-entry config id :completion-window)]
      (. builder completionWindow data))
    (when-let [data (lookup-entry config id :copy-actions)]
      (. builder copyActions data))
    (when-let [data (lookup-entry config id :delete-after)]
      (. builder deleteAfter data))
    (when-let [data (lookup-entry config id :enable-continuous-backup)]
      (. builder enableContinuousBackup data))
    (when-let [data (lookup-entry config id :move-to-cold-storage-after)]
      (. builder moveToColdStorageAfter data))
    (when-let [data (lookup-entry config id :recovery-point-tags)]
      (. builder recoveryPointTags data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :start-window)]
      (. builder startWindow data))
    (.build builder)))


(defn backup-plan-rule-props-builder
  "The backup-plan-rule-props-builder function buildes out new instances of 
BackupPlanRuleProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupVault` | software.amazon.awscdk.services.backup.IBackupVault | [[cdk.support/lookup-entry]] | `:backup-vault` |
| `completionWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:completion-window` |
| `copyActions` | java.util.List | [[cdk.support/lookup-entry]] | `:copy-actions` |
| `deleteAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:delete-after` |
| `enableContinuousBackup` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-continuous-backup` |
| `moveToColdStorageAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:move-to-cold-storage-after` |
| `recoveryPointTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:recovery-point-tags` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `scheduleExpression` | software.amazon.awscdk.services.events.Schedule | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `startWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-window` |"
  [stack id config]
  (let [builder (BackupPlanRuleProps$Builder.)]
    (when-let [data (lookup-entry config id :backup-vault)]
      (. builder backupVault data))
    (when-let [data (lookup-entry config id :completion-window)]
      (. builder completionWindow data))
    (when-let [data (lookup-entry config id :copy-actions)]
      (. builder copyActions data))
    (when-let [data (lookup-entry config id :delete-after)]
      (. builder deleteAfter data))
    (when-let [data (lookup-entry config id :enable-continuous-backup)]
      (. builder enableContinuousBackup data))
    (when-let [data (lookup-entry config id :move-to-cold-storage-after)]
      (. builder moveToColdStorageAfter data))
    (when-let [data (lookup-entry config id :recovery-point-tags)]
      (. builder recoveryPointTags data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :start-window)]
      (. builder startWindow data))
    (.build builder)))


(defn backup-selection-builder
  "The backup-selection-builder function buildes out new instances of 
BackupSelection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowRestores` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-restores` |
| `backupPlan` | software.amazon.awscdk.services.backup.IBackupPlan | [[cdk.support/lookup-entry]] | `:backup-plan` |
| `backupSelectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-selection-name` |
| `disableDefaultBackupPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-default-backup-policy` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (BackupSelection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :allow-restores)]
      (. builder allowRestores data))
    (when-let [data (lookup-entry config id :backup-plan)]
      (. builder backupPlan data))
    (when-let [data (lookup-entry config id :backup-selection-name)]
      (. builder backupSelectionName data))
    (when-let [data (lookup-entry config id :disable-default-backup-policy)]
      (. builder disableDefaultBackupPolicy data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn backup-selection-options-builder
  "The backup-selection-options-builder function buildes out new instances of 
BackupSelectionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowRestores` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-restores` |
| `backupSelectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-selection-name` |
| `disableDefaultBackupPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-default-backup-policy` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (BackupSelectionOptions$Builder.)]
    (when-let [data (lookup-entry config id :allow-restores)]
      (. builder allowRestores data))
    (when-let [data (lookup-entry config id :backup-selection-name)]
      (. builder backupSelectionName data))
    (when-let [data (lookup-entry config id :disable-default-backup-policy)]
      (. builder disableDefaultBackupPolicy data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn backup-selection-props-builder
  "The backup-selection-props-builder function buildes out new instances of 
BackupSelectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowRestores` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-restores` |
| `backupPlan` | software.amazon.awscdk.services.backup.IBackupPlan | [[cdk.support/lookup-entry]] | `:backup-plan` |
| `backupSelectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-selection-name` |
| `disableDefaultBackupPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-default-backup-policy` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |"
  [stack id config]
  (let [builder (BackupSelectionProps$Builder.)]
    (when-let [data (lookup-entry config id :allow-restores)]
      (. builder allowRestores data))
    (when-let [data (lookup-entry config id :backup-plan)]
      (. builder backupPlan data))
    (when-let [data (lookup-entry config id :backup-selection-name)]
      (. builder backupSelectionName data))
    (when-let [data (lookup-entry config id :disable-default-backup-policy)]
      (. builder disableDefaultBackupPolicy data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :role)]
      (. builder role data))
    (.build builder)))


(defn backup-vault-builder
  "The backup-vault-builder function buildes out new instances of 
BackupVault$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:access-policy` |
| `backupVaultName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-vault-name` |
| `blockRecoveryPointDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-recovery-point-deletion` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `lockConfiguration` | software.amazon.awscdk.services.backup.LockConfiguration | [[cdk.support/lookup-entry]] | `:lock-configuration` |
| `notificationEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-events` |
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |"
  [stack id config]
  (let [builder (BackupVault$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-policy)]
      (. builder accessPolicy data))
    (when-let [data (lookup-entry config id :backup-vault-name)]
      (. builder backupVaultName data))
    (when-let [data (lookup-entry config id :block-recovery-point-deletion)]
      (. builder blockRecoveryPointDeletion data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :lock-configuration)]
      (. builder lockConfiguration data))
    (when-let [data (lookup-entry config id :notification-events)]
      (. builder notificationEvents data))
    (when-let [data (lookup-entry config id :notification-topic)]
      (. builder notificationTopic data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (.build builder)))


(defn backup-vault-props-builder
  "The backup-vault-props-builder function buildes out new instances of 
BackupVaultProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:access-policy` |
| `backupVaultName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-vault-name` |
| `blockRecoveryPointDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-recovery-point-deletion` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `lockConfiguration` | software.amazon.awscdk.services.backup.LockConfiguration | [[cdk.support/lookup-entry]] | `:lock-configuration` |
| `notificationEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-events` |
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |"
  [stack id config]
  (let [builder (BackupVaultProps$Builder.)]
    (when-let [data (lookup-entry config id :access-policy)]
      (. builder accessPolicy data))
    (when-let [data (lookup-entry config id :backup-vault-name)]
      (. builder backupVaultName data))
    (when-let [data (lookup-entry config id :block-recovery-point-deletion)]
      (. builder blockRecoveryPointDeletion data))
    (when-let [data (lookup-entry config id :encryption-key)]
      (. builder encryptionKey data))
    (when-let [data (lookup-entry config id :lock-configuration)]
      (. builder lockConfiguration data))
    (when-let [data (lookup-entry config id :notification-events)]
      (. builder notificationEvents data))
    (when-let [data (lookup-entry config id :notification-topic)]
      (. builder notificationTopic data))
    (when-let [data (removal-policy config id :removal-policy)]
      (. builder removalPolicy data))
    (.build builder)))


(defn cfn-backup-plan-advanced-backup-setting-resource-type-property-builder
  "The cfn-backup-plan-advanced-backup-setting-resource-type-property-builder function buildes out new instances of 
CfnBackupPlan$AdvancedBackupSettingResourceTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupOptions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:backup-options` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |"
  [stack id config]
  (let [builder (CfnBackupPlan$AdvancedBackupSettingResourceTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :backup-options)]
      (. builder backupOptions data))
    (when-let [data (lookup-entry config id :resource-type)]
      (. builder resourceType data))
    (.build builder)))


(defn cfn-backup-plan-backup-plan-resource-type-property-builder
  "The cfn-backup-plan-backup-plan-resource-type-property-builder function buildes out new instances of 
CfnBackupPlan$BackupPlanResourceTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `advancedBackupSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:advanced-backup-settings` |
| `backupPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-plan-name` |
| `backupPlanRule` | java.util.List | [[cdk.support/lookup-entry]] | `:backup-plan-rule` |"
  [stack id config]
  (let [builder (CfnBackupPlan$BackupPlanResourceTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :advanced-backup-settings)]
      (. builder advancedBackupSettings data))
    (when-let [data (lookup-entry config id :backup-plan-name)]
      (. builder backupPlanName data))
    (when-let [data (lookup-entry config id :backup-plan-rule)]
      (. builder backupPlanRule data))
    (.build builder)))


(defn cfn-backup-plan-backup-rule-resource-type-property-builder
  "The cfn-backup-plan-backup-rule-resource-type-property-builder function buildes out new instances of 
CfnBackupPlan$BackupRuleResourceTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `completionWindowMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:completion-window-minutes` |
| `copyActions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:copy-actions` |
| `enableContinuousBackup` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-continuous-backup` |
| `lifecycle` | software.amazon.awscdk.services.backup.CfnBackupPlan$LifecycleResourceTypeProperty | [[cdk.support/lookup-entry]] | `:lifecycle` |
| `recoveryPointTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recovery-point-tags` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleExpressionTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression-timezone` |
| `startWindowMinutes` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-window-minutes` |
| `targetBackupVault` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-backup-vault` |"
  [stack id config]
  (let [builder (CfnBackupPlan$BackupRuleResourceTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :completion-window-minutes)]
      (. builder completionWindowMinutes data))
    (when-let [data (lookup-entry config id :copy-actions)]
      (. builder copyActions data))
    (when-let [data (lookup-entry config id :enable-continuous-backup)]
      (. builder enableContinuousBackup data))
    (when-let [data (lookup-entry config id :lifecycle)]
      (. builder lifecycle data))
    (when-let [data (lookup-entry config id :recovery-point-tags)]
      (. builder recoveryPointTags data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :schedule-expression-timezone)]
      (. builder scheduleExpressionTimezone data))
    (when-let [data (lookup-entry config id :start-window-minutes)]
      (. builder startWindowMinutes data))
    (when-let [data (lookup-entry config id :target-backup-vault)]
      (. builder targetBackupVault data))
    (.build builder)))


(defn cfn-backup-plan-builder
  "The cfn-backup-plan-builder function buildes out new instances of 
CfnBackupPlan$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlan` | software.amazon.awscdk.services.backup.CfnBackupPlan$BackupPlanResourceTypeProperty | [[cdk.support/lookup-entry]] | `:backup-plan` |
| `backupPlanTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:backup-plan-tags` |"
  [stack id config]
  (let [builder (CfnBackupPlan$Builder/create stack id)]
    (when-let [data (lookup-entry config id :backup-plan)]
      (. builder backupPlan data))
    (when-let [data (lookup-entry config id :backup-plan-tags)]
      (. builder backupPlanTags data))
    (.build builder)))


(defn cfn-backup-plan-copy-action-resource-type-property-builder
  "The cfn-backup-plan-copy-action-resource-type-property-builder function buildes out new instances of 
CfnBackupPlan$CopyActionResourceTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationBackupVaultArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-backup-vault-arn` |
| `lifecycle` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle` |"
  [stack id config]
  (let [builder (CfnBackupPlan$CopyActionResourceTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :destination-backup-vault-arn)]
      (. builder destinationBackupVaultArn data))
    (when-let [data (lookup-entry config id :lifecycle)]
      (. builder lifecycle data))
    (.build builder)))


(defn cfn-backup-plan-lifecycle-resource-type-property-builder
  "The cfn-backup-plan-lifecycle-resource-type-property-builder function buildes out new instances of 
CfnBackupPlan$LifecycleResourceTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteAfterDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:delete-after-days` |
| `moveToColdStorageAfterDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:move-to-cold-storage-after-days` |
| `optInToArchiveForSupportedResources` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:opt-in-to-archive-for-supported-resources` |"
  [stack id config]
  (let [builder (CfnBackupPlan$LifecycleResourceTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :delete-after-days)]
      (. builder deleteAfterDays data))
    (when-let [data (lookup-entry config id :move-to-cold-storage-after-days)]
      (. builder moveToColdStorageAfterDays data))
    (when-let [data (lookup-entry config id :opt-in-to-archive-for-supported-resources)]
      (. builder optInToArchiveForSupportedResources data))
    (.build builder)))


(defn cfn-backup-plan-props-builder
  "The cfn-backup-plan-props-builder function buildes out new instances of 
CfnBackupPlanProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlan` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backup-plan` |
| `backupPlanTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:backup-plan-tags` |"
  [stack id config]
  (let [builder (CfnBackupPlanProps$Builder.)]
    (when-let [data (lookup-entry config id :backup-plan)]
      (. builder backupPlan data))
    (when-let [data (lookup-entry config id :backup-plan-tags)]
      (. builder backupPlanTags data))
    (.build builder)))


(defn cfn-backup-selection-backup-selection-resource-type-property-builder
  "The cfn-backup-selection-backup-selection-resource-type-property-builder function buildes out new instances of 
CfnBackupSelection$BackupSelectionResourceTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:conditions` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `listOfTags` | java.util.List | [[cdk.support/lookup-entry]] | `:list-of-tags` |
| `notResources` | java.util.List | [[cdk.support/lookup-entry]] | `:not-resources` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `selectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:selection-name` |"
  [stack id config]
  (let [builder (CfnBackupSelection$BackupSelectionResourceTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :conditions)]
      (. builder conditions data))
    (when-let [data (lookup-entry config id :iam-role-arn)]
      (. builder iamRoleArn data))
    (when-let [data (lookup-entry config id :list-of-tags)]
      (. builder listOfTags data))
    (when-let [data (lookup-entry config id :not-resources)]
      (. builder notResources data))
    (when-let [data (lookup-entry config id :resources)]
      (. builder resources data))
    (when-let [data (lookup-entry config id :selection-name)]
      (. builder selectionName data))
    (.build builder)))


(defn cfn-backup-selection-builder
  "The cfn-backup-selection-builder function buildes out new instances of 
CfnBackupSelection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlanId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-plan-id` |
| `backupSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backup-selection` |"
  [stack id config]
  (let [builder (CfnBackupSelection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :backup-plan-id)]
      (. builder backupPlanId data))
    (when-let [data (lookup-entry config id :backup-selection)]
      (. builder backupSelection data))
    (.build builder)))


(defn cfn-backup-selection-condition-parameter-property-builder
  "The cfn-backup-selection-condition-parameter-property-builder function buildes out new instances of 
CfnBackupSelection$ConditionParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-key` |
| `conditionValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-value` |"
  [stack id config]
  (let [builder (CfnBackupSelection$ConditionParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition-key)]
      (. builder conditionKey data))
    (when-let [data (lookup-entry config id :condition-value)]
      (. builder conditionValue data))
    (.build builder)))


(defn cfn-backup-selection-condition-resource-type-property-builder
  "The cfn-backup-selection-condition-resource-type-property-builder function buildes out new instances of 
CfnBackupSelection$ConditionResourceTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-key` |
| `conditionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-type` |
| `conditionValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-value` |"
  [stack id config]
  (let [builder (CfnBackupSelection$ConditionResourceTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition-key)]
      (. builder conditionKey data))
    (when-let [data (lookup-entry config id :condition-type)]
      (. builder conditionType data))
    (when-let [data (lookup-entry config id :condition-value)]
      (. builder conditionValue data))
    (.build builder)))


(defn cfn-backup-selection-conditions-property-builder
  "The cfn-backup-selection-conditions-property-builder function buildes out new instances of 
CfnBackupSelection$ConditionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stringEquals` | java.util.List | [[cdk.support/lookup-entry]] | `:string-equals` |
| `stringLike` | java.util.List | [[cdk.support/lookup-entry]] | `:string-like` |
| `stringNotEquals` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:string-not-equals` |
| `stringNotLike` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:string-not-like` |"
  [stack id config]
  (let [builder (CfnBackupSelection$ConditionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :string-equals)]
      (. builder stringEquals data))
    (when-let [data (lookup-entry config id :string-like)]
      (. builder stringLike data))
    (when-let [data (lookup-entry config id :string-not-equals)]
      (. builder stringNotEquals data))
    (when-let [data (lookup-entry config id :string-not-like)]
      (. builder stringNotLike data))
    (.build builder)))


(defn cfn-backup-selection-props-builder
  "The cfn-backup-selection-props-builder function buildes out new instances of 
CfnBackupSelectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlanId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-plan-id` |
| `backupSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backup-selection` |"
  [stack id config]
  (let [builder (CfnBackupSelectionProps$Builder.)]
    (when-let [data (lookup-entry config id :backup-plan-id)]
      (. builder backupPlanId data))
    (when-let [data (lookup-entry config id :backup-selection)]
      (. builder backupSelection data))
    (.build builder)))


(defn cfn-backup-vault-builder
  "The cfn-backup-vault-builder function buildes out new instances of 
CfnBackupVault$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:access-policy` |
| `backupVaultName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-vault-name` |
| `backupVaultTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:backup-vault-tags` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `lockConfiguration` | software.amazon.awscdk.services.backup.CfnBackupVault$LockConfigurationTypeProperty | [[cdk.support/lookup-entry]] | `:lock-configuration` |
| `notifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notifications` |"
  [stack id config]
  (let [builder (CfnBackupVault$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-policy)]
      (. builder accessPolicy data))
    (when-let [data (lookup-entry config id :backup-vault-name)]
      (. builder backupVaultName data))
    (when-let [data (lookup-entry config id :backup-vault-tags)]
      (. builder backupVaultTags data))
    (when-let [data (lookup-entry config id :encryption-key-arn)]
      (. builder encryptionKeyArn data))
    (when-let [data (lookup-entry config id :lock-configuration)]
      (. builder lockConfiguration data))
    (when-let [data (lookup-entry config id :notifications)]
      (. builder notifications data))
    (.build builder)))


(defn cfn-backup-vault-lock-configuration-type-property-builder
  "The cfn-backup-vault-lock-configuration-type-property-builder function buildes out new instances of 
CfnBackupVault$LockConfigurationTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeableForDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:changeable-for-days` |
| `maxRetentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retention-days` |
| `minRetentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-retention-days` |"
  [stack id config]
  (let [builder (CfnBackupVault$LockConfigurationTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :changeable-for-days)]
      (. builder changeableForDays data))
    (when-let [data (lookup-entry config id :max-retention-days)]
      (. builder maxRetentionDays data))
    (when-let [data (lookup-entry config id :min-retention-days)]
      (. builder minRetentionDays data))
    (.build builder)))


(defn cfn-backup-vault-notification-object-type-property-builder
  "The cfn-backup-vault-notification-object-type-property-builder function buildes out new instances of 
CfnBackupVault$NotificationObjectTypeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupVaultEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:backup-vault-events` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |"
  [stack id config]
  (let [builder (CfnBackupVault$NotificationObjectTypeProperty$Builder.)]
    (when-let [data (lookup-entry config id :backup-vault-events)]
      (. builder backupVaultEvents data))
    (when-let [data (lookup-entry config id :sns-topic-arn)]
      (. builder snsTopicArn data))
    (.build builder)))


(defn cfn-backup-vault-props-builder
  "The cfn-backup-vault-props-builder function buildes out new instances of 
CfnBackupVaultProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:access-policy` |
| `backupVaultName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-vault-name` |
| `backupVaultTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:backup-vault-tags` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `lockConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lock-configuration` |
| `notifications` | software.amazon.awscdk.services.backup.CfnBackupVault$NotificationObjectTypeProperty | [[cdk.support/lookup-entry]] | `:notifications` |"
  [stack id config]
  (let [builder (CfnBackupVaultProps$Builder.)]
    (when-let [data (lookup-entry config id :access-policy)]
      (. builder accessPolicy data))
    (when-let [data (lookup-entry config id :backup-vault-name)]
      (. builder backupVaultName data))
    (when-let [data (lookup-entry config id :backup-vault-tags)]
      (. builder backupVaultTags data))
    (when-let [data (lookup-entry config id :encryption-key-arn)]
      (. builder encryptionKeyArn data))
    (when-let [data (lookup-entry config id :lock-configuration)]
      (. builder lockConfiguration data))
    (when-let [data (lookup-entry config id :notifications)]
      (. builder notifications data))
    (.build builder)))


(defn cfn-framework-builder
  "The cfn-framework-builder function buildes out new instances of 
CfnFramework$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frameworkControls` | java.util.List | [[cdk.support/lookup-entry]] | `:framework-controls` |
| `frameworkDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-description` |
| `frameworkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-name` |
| `frameworkTags` | java.util.List | [[cdk.support/lookup-entry]] | `:framework-tags` |"
  [stack id config]
  (let [builder (CfnFramework$Builder/create stack id)]
    (when-let [data (lookup-entry config id :framework-controls)]
      (. builder frameworkControls data))
    (when-let [data (lookup-entry config id :framework-description)]
      (. builder frameworkDescription data))
    (when-let [data (lookup-entry config id :framework-name)]
      (. builder frameworkName data))
    (when-let [data (lookup-entry config id :framework-tags)]
      (. builder frameworkTags data))
    (.build builder)))


(defn cfn-framework-control-input-parameter-property-builder
  "The cfn-framework-control-input-parameter-property-builder function buildes out new instances of 
CfnFramework$ControlInputParameterProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |"
  [stack id config]
  (let [builder (CfnFramework$ControlInputParameterProperty$Builder.)]
    (when-let [data (lookup-entry config id :parameter-name)]
      (. builder parameterName data))
    (when-let [data (lookup-entry config id :parameter-value)]
      (. builder parameterValue data))
    (.build builder)))


(defn cfn-framework-control-scope-property-builder
  "The cfn-framework-control-scope-property-builder function buildes out new instances of 
CfnFramework$ControlScopeProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `complianceResourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:compliance-resource-ids` |
| `complianceResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:compliance-resource-types` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnFramework$ControlScopeProperty$Builder.)]
    (when-let [data (lookup-entry config id :compliance-resource-ids)]
      (. builder complianceResourceIds data))
    (when-let [data (lookup-entry config id :compliance-resource-types)]
      (. builder complianceResourceTypes data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-framework-framework-control-property-builder
  "The cfn-framework-framework-control-property-builder function buildes out new instances of 
CfnFramework$FrameworkControlProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `controlInputParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:control-input-parameters` |
| `controlName` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-name` |
| `controlScope` | java.lang.Object | [[cdk.support/lookup-entry]] | `:control-scope` |"
  [stack id config]
  (let [builder (CfnFramework$FrameworkControlProperty$Builder.)]
    (when-let [data (lookup-entry config id :control-input-parameters)]
      (. builder controlInputParameters data))
    (when-let [data (lookup-entry config id :control-name)]
      (. builder controlName data))
    (when-let [data (lookup-entry config id :control-scope)]
      (. builder controlScope data))
    (.build builder)))


(defn cfn-framework-props-builder
  "The cfn-framework-props-builder function buildes out new instances of 
CfnFrameworkProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frameworkControls` | java.util.List | [[cdk.support/lookup-entry]] | `:framework-controls` |
| `frameworkDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-description` |
| `frameworkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-name` |
| `frameworkTags` | java.util.List | [[cdk.support/lookup-entry]] | `:framework-tags` |"
  [stack id config]
  (let [builder (CfnFrameworkProps$Builder.)]
    (when-let [data (lookup-entry config id :framework-controls)]
      (. builder frameworkControls data))
    (when-let [data (lookup-entry config id :framework-description)]
      (. builder frameworkDescription data))
    (when-let [data (lookup-entry config id :framework-name)]
      (. builder frameworkName data))
    (when-let [data (lookup-entry config id :framework-tags)]
      (. builder frameworkTags data))
    (.build builder)))


(defn cfn-report-plan-builder
  "The cfn-report-plan-builder function buildes out new instances of 
CfnReportPlan$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportDeliveryChannel` | java.lang.Object | [[cdk.support/lookup-entry]] | `:report-delivery-channel` |
| `reportPlanDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-plan-description` |
| `reportPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-plan-name` |
| `reportPlanTags` | java.util.List | [[cdk.support/lookup-entry]] | `:report-plan-tags` |
| `reportSetting` | java.lang.Object | [[cdk.support/lookup-entry]] | `:report-setting` |"
  [stack id config]
  (let [builder (CfnReportPlan$Builder/create stack id)]
    (when-let [data (lookup-entry config id :report-delivery-channel)]
      (. builder reportDeliveryChannel data))
    (when-let [data (lookup-entry config id :report-plan-description)]
      (. builder reportPlanDescription data))
    (when-let [data (lookup-entry config id :report-plan-name)]
      (. builder reportPlanName data))
    (when-let [data (lookup-entry config id :report-plan-tags)]
      (. builder reportPlanTags data))
    (when-let [data (lookup-entry config id :report-setting)]
      (. builder reportSetting data))
    (.build builder)))


(defn cfn-report-plan-props-builder
  "The cfn-report-plan-props-builder function buildes out new instances of 
CfnReportPlanProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportDeliveryChannel` | java.lang.Object | [[cdk.support/lookup-entry]] | `:report-delivery-channel` |
| `reportPlanDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-plan-description` |
| `reportPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-plan-name` |
| `reportPlanTags` | java.util.List | [[cdk.support/lookup-entry]] | `:report-plan-tags` |
| `reportSetting` | java.lang.Object | [[cdk.support/lookup-entry]] | `:report-setting` |"
  [stack id config]
  (let [builder (CfnReportPlanProps$Builder.)]
    (when-let [data (lookup-entry config id :report-delivery-channel)]
      (. builder reportDeliveryChannel data))
    (when-let [data (lookup-entry config id :report-plan-description)]
      (. builder reportPlanDescription data))
    (when-let [data (lookup-entry config id :report-plan-name)]
      (. builder reportPlanName data))
    (when-let [data (lookup-entry config id :report-plan-tags)]
      (. builder reportPlanTags data))
    (when-let [data (lookup-entry config id :report-setting)]
      (. builder reportSetting data))
    (.build builder)))


(defn cfn-report-plan-report-delivery-channel-property-builder
  "The cfn-report-plan-report-delivery-channel-property-builder function buildes out new instances of 
CfnReportPlan$ReportDeliveryChannelProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `formats` | java.util.List | [[cdk.support/lookup-entry]] | `:formats` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |"
  [stack id config]
  (let [builder (CfnReportPlan$ReportDeliveryChannelProperty$Builder.)]
    (when-let [data (lookup-entry config id :formats)]
      (. builder formats data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-key-prefix)]
      (. builder s3KeyPrefix data))
    (.build builder)))


(defn cfn-report-plan-report-setting-property-builder
  "The cfn-report-plan-report-setting-property-builder function buildes out new instances of 
CfnReportPlan$ReportSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `frameworkArns` | java.util.List | [[cdk.support/lookup-entry]] | `:framework-arns` |
| `organizationUnits` | java.util.List | [[cdk.support/lookup-entry]] | `:organization-units` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
| `reportTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-template` |"
  [stack id config]
  (let [builder (CfnReportPlan$ReportSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :accounts)]
      (. builder accounts data))
    (when-let [data (lookup-entry config id :framework-arns)]
      (. builder frameworkArns data))
    (when-let [data (lookup-entry config id :organization-units)]
      (. builder organizationUnits data))
    (when-let [data (lookup-entry config id :regions)]
      (. builder regions data))
    (when-let [data (lookup-entry config id :report-template)]
      (. builder reportTemplate data))
    (.build builder)))


(defn cfn-restore-testing-plan-builder
  "The cfn-restore-testing-plan-builder function buildes out new instances of 
CfnRestoreTestingPlan$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recoveryPointSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recovery-point-selection` |
| `restoreTestingPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-plan-name` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleExpressionTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression-timezone` |
| `startWindowHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-window-hours` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRestoreTestingPlan$Builder/create stack id)]
    (when-let [data (lookup-entry config id :recovery-point-selection)]
      (. builder recoveryPointSelection data))
    (when-let [data (lookup-entry config id :restore-testing-plan-name)]
      (. builder restoreTestingPlanName data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :schedule-expression-timezone)]
      (. builder scheduleExpressionTimezone data))
    (when-let [data (lookup-entry config id :start-window-hours)]
      (. builder startWindowHours data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-restore-testing-plan-props-builder
  "The cfn-restore-testing-plan-props-builder function buildes out new instances of 
CfnRestoreTestingPlanProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recoveryPointSelection` | software.amazon.awscdk.services.backup.CfnRestoreTestingPlan$RestoreTestingRecoveryPointSelectionProperty | [[cdk.support/lookup-entry]] | `:recovery-point-selection` |
| `restoreTestingPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-plan-name` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleExpressionTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression-timezone` |
| `startWindowHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-window-hours` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRestoreTestingPlanProps$Builder.)]
    (when-let [data (lookup-entry config id :recovery-point-selection)]
      (. builder recoveryPointSelection data))
    (when-let [data (lookup-entry config id :restore-testing-plan-name)]
      (. builder restoreTestingPlanName data))
    (when-let [data (lookup-entry config id :schedule-expression)]
      (. builder scheduleExpression data))
    (when-let [data (lookup-entry config id :schedule-expression-timezone)]
      (. builder scheduleExpressionTimezone data))
    (when-let [data (lookup-entry config id :start-window-hours)]
      (. builder startWindowHours data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-restore-testing-plan-restore-testing-recovery-point-selection-property-builder
  "The cfn-restore-testing-plan-restore-testing-recovery-point-selection-property-builder function buildes out new instances of 
CfnRestoreTestingPlan$RestoreTestingRecoveryPointSelectionProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `excludeVaults` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-vaults` |
| `includeVaults` | java.util.List | [[cdk.support/lookup-entry]] | `:include-vaults` |
| `recoveryPointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:recovery-point-types` |
| `selectionWindowDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:selection-window-days` |"
  [stack id config]
  (let [builder (CfnRestoreTestingPlan$RestoreTestingRecoveryPointSelectionProperty$Builder.)]
    (when-let [data (lookup-entry config id :algorithm)]
      (. builder algorithm data))
    (when-let [data (lookup-entry config id :exclude-vaults)]
      (. builder excludeVaults data))
    (when-let [data (lookup-entry config id :include-vaults)]
      (. builder includeVaults data))
    (when-let [data (lookup-entry config id :recovery-point-types)]
      (. builder recoveryPointTypes data))
    (when-let [data (lookup-entry config id :selection-window-days)]
      (. builder selectionWindowDays data))
    (.build builder)))


(defn cfn-restore-testing-selection-builder
  "The cfn-restore-testing-selection-builder function buildes out new instances of 
CfnRestoreTestingSelection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `protectedResourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:protected-resource-arns` |
| `protectedResourceConditions` | software.amazon.awscdk.services.backup.CfnRestoreTestingSelection$ProtectedResourceConditionsProperty | [[cdk.support/lookup-entry]] | `:protected-resource-conditions` |
| `protectedResourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:protected-resource-type` |
| `restoreMetadataOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:restore-metadata-overrides` |
| `restoreTestingPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-plan-name` |
| `restoreTestingSelectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-selection-name` |
| `validationWindowHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:validation-window-hours` |"
  [stack id config]
  (let [builder (CfnRestoreTestingSelection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :iam-role-arn)]
      (. builder iamRoleArn data))
    (when-let [data (lookup-entry config id :protected-resource-arns)]
      (. builder protectedResourceArns data))
    (when-let [data (lookup-entry config id :protected-resource-conditions)]
      (. builder protectedResourceConditions data))
    (when-let [data (lookup-entry config id :protected-resource-type)]
      (. builder protectedResourceType data))
    (when-let [data (lookup-entry config id :restore-metadata-overrides)]
      (. builder restoreMetadataOverrides data))
    (when-let [data (lookup-entry config id :restore-testing-plan-name)]
      (. builder restoreTestingPlanName data))
    (when-let [data (lookup-entry config id :restore-testing-selection-name)]
      (. builder restoreTestingSelectionName data))
    (when-let [data (lookup-entry config id :validation-window-hours)]
      (. builder validationWindowHours data))
    (.build builder)))


(defn cfn-restore-testing-selection-key-value-property-builder
  "The cfn-restore-testing-selection-key-value-property-builder function buildes out new instances of 
CfnRestoreTestingSelection$KeyValueProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnRestoreTestingSelection$KeyValueProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-restore-testing-selection-props-builder
  "The cfn-restore-testing-selection-props-builder function buildes out new instances of 
CfnRestoreTestingSelectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `protectedResourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:protected-resource-arns` |
| `protectedResourceConditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:protected-resource-conditions` |
| `protectedResourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:protected-resource-type` |
| `restoreMetadataOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:restore-metadata-overrides` |
| `restoreTestingPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-plan-name` |
| `restoreTestingSelectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-selection-name` |
| `validationWindowHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:validation-window-hours` |"
  [stack id config]
  (let [builder (CfnRestoreTestingSelectionProps$Builder.)]
    (when-let [data (lookup-entry config id :iam-role-arn)]
      (. builder iamRoleArn data))
    (when-let [data (lookup-entry config id :protected-resource-arns)]
      (. builder protectedResourceArns data))
    (when-let [data (lookup-entry config id :protected-resource-conditions)]
      (. builder protectedResourceConditions data))
    (when-let [data (lookup-entry config id :protected-resource-type)]
      (. builder protectedResourceType data))
    (when-let [data (lookup-entry config id :restore-metadata-overrides)]
      (. builder restoreMetadataOverrides data))
    (when-let [data (lookup-entry config id :restore-testing-plan-name)]
      (. builder restoreTestingPlanName data))
    (when-let [data (lookup-entry config id :restore-testing-selection-name)]
      (. builder restoreTestingSelectionName data))
    (when-let [data (lookup-entry config id :validation-window-hours)]
      (. builder validationWindowHours data))
    (.build builder)))


(defn cfn-restore-testing-selection-protected-resource-conditions-property-builder
  "The cfn-restore-testing-selection-protected-resource-conditions-property-builder function buildes out new instances of 
CfnRestoreTestingSelection$ProtectedResourceConditionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stringEquals` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:string-equals` |
| `stringNotEquals` | java.util.List | [[cdk.support/lookup-entry]] | `:string-not-equals` |"
  [stack id config]
  (let [builder (CfnRestoreTestingSelection$ProtectedResourceConditionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :string-equals)]
      (. builder stringEquals data))
    (when-let [data (lookup-entry config id :string-not-equals)]
      (. builder stringNotEquals data))
    (.build builder)))


(defn lock-configuration-builder
  "The lock-configuration-builder function buildes out new instances of 
LockConfiguration$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeableFor` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:changeable-for` |
| `maxRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-retention` |
| `minRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:min-retention` |"
  [stack id config]
  (let [builder (LockConfiguration$Builder.)]
    (when-let [data (lookup-entry config id :changeable-for)]
      (. builder changeableFor data))
    (when-let [data (lookup-entry config id :max-retention)]
      (. builder maxRetention data))
    (when-let [data (lookup-entry config id :min-retention)]
      (. builder minRetention data))
    (.build builder)))


(defn tag-condition-builder
  "The tag-condition-builder function buildes out new instances of 
TagCondition$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `operation` | software.amazon.awscdk.services.backup.TagOperation | [[cdk.api.services.backup/tag-operation]] | `:operation` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (TagCondition$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (tag-operation config id :operation)]
      (. builder operation data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))