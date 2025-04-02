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
                                                   TagOperation]
           [software.constructs Construct]))


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


(defn backup-plan-builder>
  "The backup-plan-builder> function updates a BackupPlan$Builder instance using the provided configuration.
  The function takes the BackupPlan$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-plan-name` |
| `backupPlanRules` | java.util.List | [[cdk.support/lookup-entry]] | `:backup-plan-rules` |
| `backupVault` | software.amazon.awscdk.services.backup.IBackupVault | [[cdk.support/lookup-entry]] | `:backup-vault` |
| `windowsVss` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:windows-vss` |
"
  [^BackupPlan$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-plan-name)]
    (. builder backupPlanName data))
  (when-some [data (lookup-entry config id :backup-plan-rules)]
    (. builder backupPlanRules data))
  (when-some [data (lookup-entry config id :backup-vault)]
    (. builder backupVault data))
  (when-some [data (lookup-entry config id :windows-vss)]
    (. builder windowsVss data))
  (.build builder))


(defn backup-plan-builder
  "Creates a  `BackupPlan$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (backup-plan-builder> (BackupPlan$Builder/create scope (name id)) id config))


(defn backup-plan-copy-action-props-builder>
  "The backup-plan-copy-action-props-builder> function updates a BackupPlanCopyActionProps$Builder instance using the provided configuration.
  The function takes the BackupPlanCopyActionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:delete-after` |
| `destinationBackupVault` | software.amazon.awscdk.services.backup.IBackupVault | [[cdk.support/lookup-entry]] | `:destination-backup-vault` |
| `moveToColdStorageAfter` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:move-to-cold-storage-after` |
"
  [^BackupPlanCopyActionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-after)]
    (. builder deleteAfter data))
  (when-some [data (lookup-entry config id :destination-backup-vault)]
    (. builder destinationBackupVault data))
  (when-some [data (lookup-entry config id :move-to-cold-storage-after)]
    (. builder moveToColdStorageAfter data))
  (.build builder))


(defn backup-plan-copy-action-props-builder
  "Creates a  `BackupPlanCopyActionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (backup-plan-copy-action-props-builder> (new BackupPlanCopyActionProps$Builder) id config))


(defn backup-plan-props-builder>
  "The backup-plan-props-builder> function updates a BackupPlanProps$Builder instance using the provided configuration.
  The function takes the BackupPlanProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-plan-name` |
| `backupPlanRules` | java.util.List | [[cdk.support/lookup-entry]] | `:backup-plan-rules` |
| `backupVault` | software.amazon.awscdk.services.backup.IBackupVault | [[cdk.support/lookup-entry]] | `:backup-vault` |
| `windowsVss` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:windows-vss` |
"
  [^BackupPlanProps$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-plan-name)]
    (. builder backupPlanName data))
  (when-some [data (lookup-entry config id :backup-plan-rules)]
    (. builder backupPlanRules data))
  (when-some [data (lookup-entry config id :backup-vault)]
    (. builder backupVault data))
  (when-some [data (lookup-entry config id :windows-vss)]
    (. builder windowsVss data))
  (.build builder))


(defn backup-plan-props-builder
  "Creates a  `BackupPlanProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (backup-plan-props-builder> (new BackupPlanProps$Builder) id config))


(defn backup-plan-rule-builder>
  "The backup-plan-rule-builder> function updates a BackupPlanRule$Builder instance using the provided configuration.
  The function takes the BackupPlanRule$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `startWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-window` |
"
  [^BackupPlanRule$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-vault)]
    (. builder backupVault data))
  (when-some [data (lookup-entry config id :completion-window)]
    (. builder completionWindow data))
  (when-some [data (lookup-entry config id :copy-actions)]
    (. builder copyActions data))
  (when-some [data (lookup-entry config id :delete-after)]
    (. builder deleteAfter data))
  (when-some [data (lookup-entry config id :enable-continuous-backup)]
    (. builder enableContinuousBackup data))
  (when-some [data (lookup-entry config id :move-to-cold-storage-after)]
    (. builder moveToColdStorageAfter data))
  (when-some [data (lookup-entry config id :recovery-point-tags)]
    (. builder recoveryPointTags data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (when-some [data (lookup-entry config id :start-window)]
    (. builder startWindow data))
  (.build builder))


(defn backup-plan-rule-builder
  "Creates a  `BackupPlanRule$Builder` instance using a no-argument create, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (backup-plan-rule-builder> (BackupPlanRule$Builder/create) id config))


(defn backup-plan-rule-props-builder>
  "The backup-plan-rule-props-builder> function updates a BackupPlanRuleProps$Builder instance using the provided configuration.
  The function takes the BackupPlanRuleProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `startWindow` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:start-window` |
"
  [^BackupPlanRuleProps$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-vault)]
    (. builder backupVault data))
  (when-some [data (lookup-entry config id :completion-window)]
    (. builder completionWindow data))
  (when-some [data (lookup-entry config id :copy-actions)]
    (. builder copyActions data))
  (when-some [data (lookup-entry config id :delete-after)]
    (. builder deleteAfter data))
  (when-some [data (lookup-entry config id :enable-continuous-backup)]
    (. builder enableContinuousBackup data))
  (when-some [data (lookup-entry config id :move-to-cold-storage-after)]
    (. builder moveToColdStorageAfter data))
  (when-some [data (lookup-entry config id :recovery-point-tags)]
    (. builder recoveryPointTags data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (when-some [data (lookup-entry config id :start-window)]
    (. builder startWindow data))
  (.build builder))


(defn backup-plan-rule-props-builder
  "Creates a  `BackupPlanRuleProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (backup-plan-rule-props-builder> (new BackupPlanRuleProps$Builder) id config))


(defn backup-resource-builder>
  "The backup-resource-builder> function updates a BackupResource$Builder instance using the provided configuration.
  The function takes the BackupResource$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `operation` | software.amazon.awscdk.services.backup.TagOperation | [[cdk.api.services.backup/tag-operation]] | `:operation` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^BackupResource$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (tag-operation config id :operation)]
    (. builder operation data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn backup-resource-builder
  "Creates a  `BackupResource$Builder` instance using provided forms, applies the data configuration, then builds it.  Takes the following arguments: 


__Create Form:__ ____[java.lang.String software.constructs.Construct]___
| Argument | DataType | Description |
|---|---|---|
| resource | java.lang.String |  |
| construct | software.constructs.Construct |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |


__Create Form:__ ____[java.lang.String]___
| Argument | DataType | Description |
|---|---|---|
| resource | java.lang.String |  |
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |


__Create Form:__ ____[]___
| Argument | DataType | Description |
|---|---|---|

| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  ([^String resource ^Construct construct id config]
   (backup-resource-builder> (BackupResource$Builder/create resource construct) id config))
  ([^String resource id config]
   (backup-resource-builder> (BackupResource$Builder/create resource) id config))
  ([id config]
   (backup-resource-builder> (BackupResource$Builder/create) id config)))


(defn backup-selection-builder>
  "The backup-selection-builder> function updates a BackupSelection$Builder instance using the provided configuration.
  The function takes the BackupSelection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowRestores` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-restores` |
| `backupPlan` | software.amazon.awscdk.services.backup.IBackupPlan | [[cdk.support/lookup-entry]] | `:backup-plan` |
| `backupSelectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-selection-name` |
| `disableDefaultBackupPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-default-backup-policy` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^BackupSelection$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-restores)]
    (. builder allowRestores data))
  (when-some [data (lookup-entry config id :backup-plan)]
    (. builder backupPlan data))
  (when-some [data (lookup-entry config id :backup-selection-name)]
    (. builder backupSelectionName data))
  (when-some [data (lookup-entry config id :disable-default-backup-policy)]
    (. builder disableDefaultBackupPolicy data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn backup-selection-builder
  "Creates a  `BackupSelection$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (backup-selection-builder> (BackupSelection$Builder/create scope (name id)) id config))


(defn backup-selection-options-builder>
  "The backup-selection-options-builder> function updates a BackupSelectionOptions$Builder instance using the provided configuration.
  The function takes the BackupSelectionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowRestores` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-restores` |
| `backupSelectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-selection-name` |
| `disableDefaultBackupPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-default-backup-policy` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^BackupSelectionOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-restores)]
    (. builder allowRestores data))
  (when-some [data (lookup-entry config id :backup-selection-name)]
    (. builder backupSelectionName data))
  (when-some [data (lookup-entry config id :disable-default-backup-policy)]
    (. builder disableDefaultBackupPolicy data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn backup-selection-options-builder
  "Creates a  `BackupSelectionOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (backup-selection-options-builder> (new BackupSelectionOptions$Builder) id config))


(defn backup-selection-props-builder>
  "The backup-selection-props-builder> function updates a BackupSelectionProps$Builder instance using the provided configuration.
  The function takes the BackupSelectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowRestores` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:allow-restores` |
| `backupPlan` | software.amazon.awscdk.services.backup.IBackupPlan | [[cdk.support/lookup-entry]] | `:backup-plan` |
| `backupSelectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-selection-name` |
| `disableDefaultBackupPolicy` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-default-backup-policy` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `role` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:role` |
"
  [^BackupSelectionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-restores)]
    (. builder allowRestores data))
  (when-some [data (lookup-entry config id :backup-plan)]
    (. builder backupPlan data))
  (when-some [data (lookup-entry config id :backup-selection-name)]
    (. builder backupSelectionName data))
  (when-some [data (lookup-entry config id :disable-default-backup-policy)]
    (. builder disableDefaultBackupPolicy data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :role)]
    (. builder role data))
  (.build builder))


(defn backup-selection-props-builder
  "Creates a  `BackupSelectionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (backup-selection-props-builder> (new BackupSelectionProps$Builder) id config))


(defn backup-vault-builder>
  "The backup-vault-builder> function updates a BackupVault$Builder instance using the provided configuration.
  The function takes the BackupVault$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:access-policy` |
| `backupVaultName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-vault-name` |
| `blockRecoveryPointDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-recovery-point-deletion` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `lockConfiguration` | software.amazon.awscdk.services.backup.LockConfiguration | [[cdk.support/lookup-entry]] | `:lock-configuration` |
| `notificationEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-events` |
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^BackupVault$Builder builder id config]
  (when-some [data (lookup-entry config id :access-policy)]
    (. builder accessPolicy data))
  (when-some [data (lookup-entry config id :backup-vault-name)]
    (. builder backupVaultName data))
  (when-some [data (lookup-entry config id :block-recovery-point-deletion)]
    (. builder blockRecoveryPointDeletion data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :lock-configuration)]
    (. builder lockConfiguration data))
  (when-some [data (lookup-entry config id :notification-events)]
    (. builder notificationEvents data))
  (when-some [data (lookup-entry config id :notification-topic)]
    (. builder notificationTopic data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn backup-vault-builder
  "Creates a  `BackupVault$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (backup-vault-builder> (BackupVault$Builder/create scope (name id)) id config))


(defn backup-vault-props-builder>
  "The backup-vault-props-builder> function updates a BackupVaultProps$Builder instance using the provided configuration.
  The function takes the BackupVaultProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicy` | software.amazon.awscdk.services.iam.PolicyDocument | [[cdk.support/lookup-entry]] | `:access-policy` |
| `backupVaultName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-vault-name` |
| `blockRecoveryPointDeletion` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:block-recovery-point-deletion` |
| `encryptionKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:encryption-key` |
| `lockConfiguration` | software.amazon.awscdk.services.backup.LockConfiguration | [[cdk.support/lookup-entry]] | `:lock-configuration` |
| `notificationEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:notification-events` |
| `notificationTopic` | software.amazon.awscdk.services.sns.ITopic | [[cdk.support/lookup-entry]] | `:notification-topic` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
"
  [^BackupVaultProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-policy)]
    (. builder accessPolicy data))
  (when-some [data (lookup-entry config id :backup-vault-name)]
    (. builder backupVaultName data))
  (when-some [data (lookup-entry config id :block-recovery-point-deletion)]
    (. builder blockRecoveryPointDeletion data))
  (when-some [data (lookup-entry config id :encryption-key)]
    (. builder encryptionKey data))
  (when-some [data (lookup-entry config id :lock-configuration)]
    (. builder lockConfiguration data))
  (when-some [data (lookup-entry config id :notification-events)]
    (. builder notificationEvents data))
  (when-some [data (lookup-entry config id :notification-topic)]
    (. builder notificationTopic data))
  (when-some [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (.build builder))


(defn backup-vault-props-builder
  "Creates a  `BackupVaultProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (backup-vault-props-builder> (new BackupVaultProps$Builder) id config))


(defn cfn-backup-plan-advanced-backup-setting-resource-type-property-builder>
  "The cfn-backup-plan-advanced-backup-setting-resource-type-property-builder> function updates a CfnBackupPlan$AdvancedBackupSettingResourceTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnBackupPlan$AdvancedBackupSettingResourceTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupOptions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:backup-options` |
| `resourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-type` |
"
  [^CfnBackupPlan$AdvancedBackupSettingResourceTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-options)]
    (. builder backupOptions data))
  (when-some [data (lookup-entry config id :resource-type)]
    (. builder resourceType data))
  (.build builder))


(defn cfn-backup-plan-advanced-backup-setting-resource-type-property-builder
  "Creates a  `CfnBackupPlan$AdvancedBackupSettingResourceTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-plan-advanced-backup-setting-resource-type-property-builder> (new CfnBackupPlan$AdvancedBackupSettingResourceTypeProperty$Builder) id config))


(defn cfn-backup-plan-backup-plan-resource-type-property-builder>
  "The cfn-backup-plan-backup-plan-resource-type-property-builder> function updates a CfnBackupPlan$BackupPlanResourceTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnBackupPlan$BackupPlanResourceTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `advancedBackupSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:advanced-backup-settings` |
| `backupPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-plan-name` |
| `backupPlanRule` | java.util.List | [[cdk.support/lookup-entry]] | `:backup-plan-rule` |
"
  [^CfnBackupPlan$BackupPlanResourceTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :advanced-backup-settings)]
    (. builder advancedBackupSettings data))
  (when-some [data (lookup-entry config id :backup-plan-name)]
    (. builder backupPlanName data))
  (when-some [data (lookup-entry config id :backup-plan-rule)]
    (. builder backupPlanRule data))
  (.build builder))


(defn cfn-backup-plan-backup-plan-resource-type-property-builder
  "Creates a  `CfnBackupPlan$BackupPlanResourceTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-plan-backup-plan-resource-type-property-builder> (new CfnBackupPlan$BackupPlanResourceTypeProperty$Builder) id config))


(defn cfn-backup-plan-backup-rule-resource-type-property-builder>
  "The cfn-backup-plan-backup-rule-resource-type-property-builder> function updates a CfnBackupPlan$BackupRuleResourceTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnBackupPlan$BackupRuleResourceTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

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
| `targetBackupVault` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-backup-vault` |
"
  [^CfnBackupPlan$BackupRuleResourceTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :completion-window-minutes)]
    (. builder completionWindowMinutes data))
  (when-some [data (lookup-entry config id :copy-actions)]
    (. builder copyActions data))
  (when-some [data (lookup-entry config id :enable-continuous-backup)]
    (. builder enableContinuousBackup data))
  (when-some [data (lookup-entry config id :lifecycle)]
    (. builder lifecycle data))
  (when-some [data (lookup-entry config id :recovery-point-tags)]
    (. builder recoveryPointTags data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (when-some [data (lookup-entry config id :schedule-expression-timezone)]
    (. builder scheduleExpressionTimezone data))
  (when-some [data (lookup-entry config id :start-window-minutes)]
    (. builder startWindowMinutes data))
  (when-some [data (lookup-entry config id :target-backup-vault)]
    (. builder targetBackupVault data))
  (.build builder))


(defn cfn-backup-plan-backup-rule-resource-type-property-builder
  "Creates a  `CfnBackupPlan$BackupRuleResourceTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-plan-backup-rule-resource-type-property-builder> (new CfnBackupPlan$BackupRuleResourceTypeProperty$Builder) id config))


(defn cfn-backup-plan-builder>
  "The cfn-backup-plan-builder> function updates a CfnBackupPlan$Builder instance using the provided configuration.
  The function takes the CfnBackupPlan$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlan` | software.amazon.awscdk.services.backup.CfnBackupPlan$BackupPlanResourceTypeProperty | [[cdk.support/lookup-entry]] | `:backup-plan` |
| `backupPlanTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:backup-plan-tags` |
"
  [^CfnBackupPlan$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-plan)]
    (. builder backupPlan data))
  (when-some [data (lookup-entry config id :backup-plan-tags)]
    (. builder backupPlanTags data))
  (.build builder))


(defn cfn-backup-plan-builder
  "Creates a  `CfnBackupPlan$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-backup-plan-builder> (CfnBackupPlan$Builder/create scope (name id)) id config))


(defn cfn-backup-plan-copy-action-resource-type-property-builder>
  "The cfn-backup-plan-copy-action-resource-type-property-builder> function updates a CfnBackupPlan$CopyActionResourceTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnBackupPlan$CopyActionResourceTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `destinationBackupVaultArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:destination-backup-vault-arn` |
| `lifecycle` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lifecycle` |
"
  [^CfnBackupPlan$CopyActionResourceTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :destination-backup-vault-arn)]
    (. builder destinationBackupVaultArn data))
  (when-some [data (lookup-entry config id :lifecycle)]
    (. builder lifecycle data))
  (.build builder))


(defn cfn-backup-plan-copy-action-resource-type-property-builder
  "Creates a  `CfnBackupPlan$CopyActionResourceTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-plan-copy-action-resource-type-property-builder> (new CfnBackupPlan$CopyActionResourceTypeProperty$Builder) id config))


(defn cfn-backup-plan-lifecycle-resource-type-property-builder>
  "The cfn-backup-plan-lifecycle-resource-type-property-builder> function updates a CfnBackupPlan$LifecycleResourceTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnBackupPlan$LifecycleResourceTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `deleteAfterDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:delete-after-days` |
| `moveToColdStorageAfterDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:move-to-cold-storage-after-days` |
| `optInToArchiveForSupportedResources` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:opt-in-to-archive-for-supported-resources` |
"
  [^CfnBackupPlan$LifecycleResourceTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :delete-after-days)]
    (. builder deleteAfterDays data))
  (when-some [data (lookup-entry config id :move-to-cold-storage-after-days)]
    (. builder moveToColdStorageAfterDays data))
  (when-some [data (lookup-entry config id :opt-in-to-archive-for-supported-resources)]
    (. builder optInToArchiveForSupportedResources data))
  (.build builder))


(defn cfn-backup-plan-lifecycle-resource-type-property-builder
  "Creates a  `CfnBackupPlan$LifecycleResourceTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-plan-lifecycle-resource-type-property-builder> (new CfnBackupPlan$LifecycleResourceTypeProperty$Builder) id config))


(defn cfn-backup-plan-props-builder>
  "The cfn-backup-plan-props-builder> function updates a CfnBackupPlanProps$Builder instance using the provided configuration.
  The function takes the CfnBackupPlanProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlan` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backup-plan` |
| `backupPlanTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:backup-plan-tags` |
"
  [^CfnBackupPlanProps$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-plan)]
    (. builder backupPlan data))
  (when-some [data (lookup-entry config id :backup-plan-tags)]
    (. builder backupPlanTags data))
  (.build builder))


(defn cfn-backup-plan-props-builder
  "Creates a  `CfnBackupPlanProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-plan-props-builder> (new CfnBackupPlanProps$Builder) id config))


(defn cfn-backup-selection-backup-selection-resource-type-property-builder>
  "The cfn-backup-selection-backup-selection-resource-type-property-builder> function updates a CfnBackupSelection$BackupSelectionResourceTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnBackupSelection$BackupSelectionResourceTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditions` | java.lang.Object | [[cdk.support/lookup-entry]] | `:conditions` |
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `listOfTags` | java.util.List | [[cdk.support/lookup-entry]] | `:list-of-tags` |
| `notResources` | java.util.List | [[cdk.support/lookup-entry]] | `:not-resources` |
| `resources` | java.util.List | [[cdk.support/lookup-entry]] | `:resources` |
| `selectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:selection-name` |
"
  [^CfnBackupSelection$BackupSelectionResourceTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :conditions)]
    (. builder conditions data))
  (when-some [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-some [data (lookup-entry config id :list-of-tags)]
    (. builder listOfTags data))
  (when-some [data (lookup-entry config id :not-resources)]
    (. builder notResources data))
  (when-some [data (lookup-entry config id :resources)]
    (. builder resources data))
  (when-some [data (lookup-entry config id :selection-name)]
    (. builder selectionName data))
  (.build builder))


(defn cfn-backup-selection-backup-selection-resource-type-property-builder
  "Creates a  `CfnBackupSelection$BackupSelectionResourceTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-selection-backup-selection-resource-type-property-builder> (new CfnBackupSelection$BackupSelectionResourceTypeProperty$Builder) id config))


(defn cfn-backup-selection-builder>
  "The cfn-backup-selection-builder> function updates a CfnBackupSelection$Builder instance using the provided configuration.
  The function takes the CfnBackupSelection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlanId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-plan-id` |
| `backupSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backup-selection` |
"
  [^CfnBackupSelection$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-plan-id)]
    (. builder backupPlanId data))
  (when-some [data (lookup-entry config id :backup-selection)]
    (. builder backupSelection data))
  (.build builder))


(defn cfn-backup-selection-builder
  "Creates a  `CfnBackupSelection$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-backup-selection-builder> (CfnBackupSelection$Builder/create scope (name id)) id config))


(defn cfn-backup-selection-condition-parameter-property-builder>
  "The cfn-backup-selection-condition-parameter-property-builder> function updates a CfnBackupSelection$ConditionParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnBackupSelection$ConditionParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-key` |
| `conditionValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-value` |
"
  [^CfnBackupSelection$ConditionParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :condition-key)]
    (. builder conditionKey data))
  (when-some [data (lookup-entry config id :condition-value)]
    (. builder conditionValue data))
  (.build builder))


(defn cfn-backup-selection-condition-parameter-property-builder
  "Creates a  `CfnBackupSelection$ConditionParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-selection-condition-parameter-property-builder> (new CfnBackupSelection$ConditionParameterProperty$Builder) id config))


(defn cfn-backup-selection-condition-resource-type-property-builder>
  "The cfn-backup-selection-condition-resource-type-property-builder> function updates a CfnBackupSelection$ConditionResourceTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnBackupSelection$ConditionResourceTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `conditionKey` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-key` |
| `conditionType` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-type` |
| `conditionValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition-value` |
"
  [^CfnBackupSelection$ConditionResourceTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :condition-key)]
    (. builder conditionKey data))
  (when-some [data (lookup-entry config id :condition-type)]
    (. builder conditionType data))
  (when-some [data (lookup-entry config id :condition-value)]
    (. builder conditionValue data))
  (.build builder))


(defn cfn-backup-selection-condition-resource-type-property-builder
  "Creates a  `CfnBackupSelection$ConditionResourceTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-selection-condition-resource-type-property-builder> (new CfnBackupSelection$ConditionResourceTypeProperty$Builder) id config))


(defn cfn-backup-selection-conditions-property-builder>
  "The cfn-backup-selection-conditions-property-builder> function updates a CfnBackupSelection$ConditionsProperty$Builder instance using the provided configuration.
  The function takes the CfnBackupSelection$ConditionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stringEquals` | java.util.List | [[cdk.support/lookup-entry]] | `:string-equals` |
| `stringLike` | java.util.List | [[cdk.support/lookup-entry]] | `:string-like` |
| `stringNotEquals` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:string-not-equals` |
| `stringNotLike` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:string-not-like` |
"
  [^CfnBackupSelection$ConditionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :string-equals)]
    (. builder stringEquals data))
  (when-some [data (lookup-entry config id :string-like)]
    (. builder stringLike data))
  (when-some [data (lookup-entry config id :string-not-equals)]
    (. builder stringNotEquals data))
  (when-some [data (lookup-entry config id :string-not-like)]
    (. builder stringNotLike data))
  (.build builder))


(defn cfn-backup-selection-conditions-property-builder
  "Creates a  `CfnBackupSelection$ConditionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-selection-conditions-property-builder> (new CfnBackupSelection$ConditionsProperty$Builder) id config))


(defn cfn-backup-selection-props-builder>
  "The cfn-backup-selection-props-builder> function updates a CfnBackupSelectionProps$Builder instance using the provided configuration.
  The function takes the CfnBackupSelectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupPlanId` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-plan-id` |
| `backupSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backup-selection` |
"
  [^CfnBackupSelectionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-plan-id)]
    (. builder backupPlanId data))
  (when-some [data (lookup-entry config id :backup-selection)]
    (. builder backupSelection data))
  (.build builder))


(defn cfn-backup-selection-props-builder
  "Creates a  `CfnBackupSelectionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-selection-props-builder> (new CfnBackupSelectionProps$Builder) id config))


(defn cfn-backup-vault-builder>
  "The cfn-backup-vault-builder> function updates a CfnBackupVault$Builder instance using the provided configuration.
  The function takes the CfnBackupVault$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:access-policy` |
| `backupVaultName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-vault-name` |
| `backupVaultTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:backup-vault-tags` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `lockConfiguration` | software.amazon.awscdk.services.backup.CfnBackupVault$LockConfigurationTypeProperty | [[cdk.support/lookup-entry]] | `:lock-configuration` |
| `notifications` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:notifications` |
"
  [^CfnBackupVault$Builder builder id config]
  (when-some [data (lookup-entry config id :access-policy)]
    (. builder accessPolicy data))
  (when-some [data (lookup-entry config id :backup-vault-name)]
    (. builder backupVaultName data))
  (when-some [data (lookup-entry config id :backup-vault-tags)]
    (. builder backupVaultTags data))
  (when-some [data (lookup-entry config id :encryption-key-arn)]
    (. builder encryptionKeyArn data))
  (when-some [data (lookup-entry config id :lock-configuration)]
    (. builder lockConfiguration data))
  (when-some [data (lookup-entry config id :notifications)]
    (. builder notifications data))
  (.build builder))


(defn cfn-backup-vault-builder
  "Creates a  `CfnBackupVault$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-backup-vault-builder> (CfnBackupVault$Builder/create scope (name id)) id config))


(defn cfn-backup-vault-lock-configuration-type-property-builder>
  "The cfn-backup-vault-lock-configuration-type-property-builder> function updates a CfnBackupVault$LockConfigurationTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnBackupVault$LockConfigurationTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeableForDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:changeable-for-days` |
| `maxRetentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-retention-days` |
| `minRetentionDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-retention-days` |
"
  [^CfnBackupVault$LockConfigurationTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :changeable-for-days)]
    (. builder changeableForDays data))
  (when-some [data (lookup-entry config id :max-retention-days)]
    (. builder maxRetentionDays data))
  (when-some [data (lookup-entry config id :min-retention-days)]
    (. builder minRetentionDays data))
  (.build builder))


(defn cfn-backup-vault-lock-configuration-type-property-builder
  "Creates a  `CfnBackupVault$LockConfigurationTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-vault-lock-configuration-type-property-builder> (new CfnBackupVault$LockConfigurationTypeProperty$Builder) id config))


(defn cfn-backup-vault-notification-object-type-property-builder>
  "The cfn-backup-vault-notification-object-type-property-builder> function updates a CfnBackupVault$NotificationObjectTypeProperty$Builder instance using the provided configuration.
  The function takes the CfnBackupVault$NotificationObjectTypeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `backupVaultEvents` | java.util.List | [[cdk.support/lookup-entry]] | `:backup-vault-events` |
| `snsTopicArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:sns-topic-arn` |
"
  [^CfnBackupVault$NotificationObjectTypeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :backup-vault-events)]
    (. builder backupVaultEvents data))
  (when-some [data (lookup-entry config id :sns-topic-arn)]
    (. builder snsTopicArn data))
  (.build builder))


(defn cfn-backup-vault-notification-object-type-property-builder
  "Creates a  `CfnBackupVault$NotificationObjectTypeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-vault-notification-object-type-property-builder> (new CfnBackupVault$NotificationObjectTypeProperty$Builder) id config))


(defn cfn-backup-vault-props-builder>
  "The cfn-backup-vault-props-builder> function updates a CfnBackupVaultProps$Builder instance using the provided configuration.
  The function takes the CfnBackupVaultProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessPolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:access-policy` |
| `backupVaultName` | java.lang.String | [[cdk.support/lookup-entry]] | `:backup-vault-name` |
| `backupVaultTags` | java.util.Map | [[cdk.support/lookup-entry]] | `:backup-vault-tags` |
| `encryptionKeyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:encryption-key-arn` |
| `lockConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:lock-configuration` |
| `notifications` | software.amazon.awscdk.services.backup.CfnBackupVault$NotificationObjectTypeProperty | [[cdk.support/lookup-entry]] | `:notifications` |
"
  [^CfnBackupVaultProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-policy)]
    (. builder accessPolicy data))
  (when-some [data (lookup-entry config id :backup-vault-name)]
    (. builder backupVaultName data))
  (when-some [data (lookup-entry config id :backup-vault-tags)]
    (. builder backupVaultTags data))
  (when-some [data (lookup-entry config id :encryption-key-arn)]
    (. builder encryptionKeyArn data))
  (when-some [data (lookup-entry config id :lock-configuration)]
    (. builder lockConfiguration data))
  (when-some [data (lookup-entry config id :notifications)]
    (. builder notifications data))
  (.build builder))


(defn cfn-backup-vault-props-builder
  "Creates a  `CfnBackupVaultProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-backup-vault-props-builder> (new CfnBackupVaultProps$Builder) id config))


(defn cfn-framework-builder>
  "The cfn-framework-builder> function updates a CfnFramework$Builder instance using the provided configuration.
  The function takes the CfnFramework$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frameworkControls` | java.util.List | [[cdk.support/lookup-entry]] | `:framework-controls` |
| `frameworkDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-description` |
| `frameworkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-name` |
| `frameworkTags` | java.util.List | [[cdk.support/lookup-entry]] | `:framework-tags` |
"
  [^CfnFramework$Builder builder id config]
  (when-some [data (lookup-entry config id :framework-controls)]
    (. builder frameworkControls data))
  (when-some [data (lookup-entry config id :framework-description)]
    (. builder frameworkDescription data))
  (when-some [data (lookup-entry config id :framework-name)]
    (. builder frameworkName data))
  (when-some [data (lookup-entry config id :framework-tags)]
    (. builder frameworkTags data))
  (.build builder))


(defn cfn-framework-builder
  "Creates a  `CfnFramework$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-framework-builder> (CfnFramework$Builder/create scope (name id)) id config))


(defn cfn-framework-control-input-parameter-property-builder>
  "The cfn-framework-control-input-parameter-property-builder> function updates a CfnFramework$ControlInputParameterProperty$Builder instance using the provided configuration.
  The function takes the CfnFramework$ControlInputParameterProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `parameterName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-name` |
| `parameterValue` | java.lang.String | [[cdk.support/lookup-entry]] | `:parameter-value` |
"
  [^CfnFramework$ControlInputParameterProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :parameter-name)]
    (. builder parameterName data))
  (when-some [data (lookup-entry config id :parameter-value)]
    (. builder parameterValue data))
  (.build builder))


(defn cfn-framework-control-input-parameter-property-builder
  "Creates a  `CfnFramework$ControlInputParameterProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-framework-control-input-parameter-property-builder> (new CfnFramework$ControlInputParameterProperty$Builder) id config))


(defn cfn-framework-control-scope-property-builder>
  "The cfn-framework-control-scope-property-builder> function updates a CfnFramework$ControlScopeProperty$Builder instance using the provided configuration.
  The function takes the CfnFramework$ControlScopeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `complianceResourceIds` | java.util.List | [[cdk.support/lookup-entry]] | `:compliance-resource-ids` |
| `complianceResourceTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:compliance-resource-types` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnFramework$ControlScopeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :compliance-resource-ids)]
    (. builder complianceResourceIds data))
  (when-some [data (lookup-entry config id :compliance-resource-types)]
    (. builder complianceResourceTypes data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-framework-control-scope-property-builder
  "Creates a  `CfnFramework$ControlScopeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-framework-control-scope-property-builder> (new CfnFramework$ControlScopeProperty$Builder) id config))


(defn cfn-framework-framework-control-property-builder>
  "The cfn-framework-framework-control-property-builder> function updates a CfnFramework$FrameworkControlProperty$Builder instance using the provided configuration.
  The function takes the CfnFramework$FrameworkControlProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `controlInputParameters` | java.util.List | [[cdk.support/lookup-entry]] | `:control-input-parameters` |
| `controlName` | java.lang.String | [[cdk.support/lookup-entry]] | `:control-name` |
| `controlScope` | java.lang.Object | [[cdk.support/lookup-entry]] | `:control-scope` |
"
  [^CfnFramework$FrameworkControlProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :control-input-parameters)]
    (. builder controlInputParameters data))
  (when-some [data (lookup-entry config id :control-name)]
    (. builder controlName data))
  (when-some [data (lookup-entry config id :control-scope)]
    (. builder controlScope data))
  (.build builder))


(defn cfn-framework-framework-control-property-builder
  "Creates a  `CfnFramework$FrameworkControlProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-framework-framework-control-property-builder> (new CfnFramework$FrameworkControlProperty$Builder) id config))


(defn cfn-framework-props-builder>
  "The cfn-framework-props-builder> function updates a CfnFrameworkProps$Builder instance using the provided configuration.
  The function takes the CfnFrameworkProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `frameworkControls` | java.util.List | [[cdk.support/lookup-entry]] | `:framework-controls` |
| `frameworkDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-description` |
| `frameworkName` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework-name` |
| `frameworkTags` | java.util.List | [[cdk.support/lookup-entry]] | `:framework-tags` |
"
  [^CfnFrameworkProps$Builder builder id config]
  (when-some [data (lookup-entry config id :framework-controls)]
    (. builder frameworkControls data))
  (when-some [data (lookup-entry config id :framework-description)]
    (. builder frameworkDescription data))
  (when-some [data (lookup-entry config id :framework-name)]
    (. builder frameworkName data))
  (when-some [data (lookup-entry config id :framework-tags)]
    (. builder frameworkTags data))
  (.build builder))


(defn cfn-framework-props-builder
  "Creates a  `CfnFrameworkProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-framework-props-builder> (new CfnFrameworkProps$Builder) id config))


(defn cfn-report-plan-builder>
  "The cfn-report-plan-builder> function updates a CfnReportPlan$Builder instance using the provided configuration.
  The function takes the CfnReportPlan$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportDeliveryChannel` | java.lang.Object | [[cdk.support/lookup-entry]] | `:report-delivery-channel` |
| `reportPlanDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-plan-description` |
| `reportPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-plan-name` |
| `reportPlanTags` | java.util.List | [[cdk.support/lookup-entry]] | `:report-plan-tags` |
| `reportSetting` | java.lang.Object | [[cdk.support/lookup-entry]] | `:report-setting` |
"
  [^CfnReportPlan$Builder builder id config]
  (when-some [data (lookup-entry config id :report-delivery-channel)]
    (. builder reportDeliveryChannel data))
  (when-some [data (lookup-entry config id :report-plan-description)]
    (. builder reportPlanDescription data))
  (when-some [data (lookup-entry config id :report-plan-name)]
    (. builder reportPlanName data))
  (when-some [data (lookup-entry config id :report-plan-tags)]
    (. builder reportPlanTags data))
  (when-some [data (lookup-entry config id :report-setting)]
    (. builder reportSetting data))
  (.build builder))


(defn cfn-report-plan-builder
  "Creates a  `CfnReportPlan$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-report-plan-builder> (CfnReportPlan$Builder/create scope (name id)) id config))


(defn cfn-report-plan-props-builder>
  "The cfn-report-plan-props-builder> function updates a CfnReportPlanProps$Builder instance using the provided configuration.
  The function takes the CfnReportPlanProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `reportDeliveryChannel` | java.lang.Object | [[cdk.support/lookup-entry]] | `:report-delivery-channel` |
| `reportPlanDescription` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-plan-description` |
| `reportPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-plan-name` |
| `reportPlanTags` | java.util.List | [[cdk.support/lookup-entry]] | `:report-plan-tags` |
| `reportSetting` | java.lang.Object | [[cdk.support/lookup-entry]] | `:report-setting` |
"
  [^CfnReportPlanProps$Builder builder id config]
  (when-some [data (lookup-entry config id :report-delivery-channel)]
    (. builder reportDeliveryChannel data))
  (when-some [data (lookup-entry config id :report-plan-description)]
    (. builder reportPlanDescription data))
  (when-some [data (lookup-entry config id :report-plan-name)]
    (. builder reportPlanName data))
  (when-some [data (lookup-entry config id :report-plan-tags)]
    (. builder reportPlanTags data))
  (when-some [data (lookup-entry config id :report-setting)]
    (. builder reportSetting data))
  (.build builder))


(defn cfn-report-plan-props-builder
  "Creates a  `CfnReportPlanProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-report-plan-props-builder> (new CfnReportPlanProps$Builder) id config))


(defn cfn-report-plan-report-delivery-channel-property-builder>
  "The cfn-report-plan-report-delivery-channel-property-builder> function updates a CfnReportPlan$ReportDeliveryChannelProperty$Builder instance using the provided configuration.
  The function takes the CfnReportPlan$ReportDeliveryChannelProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `formats` | java.util.List | [[cdk.support/lookup-entry]] | `:formats` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3KeyPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-key-prefix` |
"
  [^CfnReportPlan$ReportDeliveryChannelProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :formats)]
    (. builder formats data))
  (when-some [data (lookup-entry config id :s3-bucket-name)]
    (. builder s3BucketName data))
  (when-some [data (lookup-entry config id :s3-key-prefix)]
    (. builder s3KeyPrefix data))
  (.build builder))


(defn cfn-report-plan-report-delivery-channel-property-builder
  "Creates a  `CfnReportPlan$ReportDeliveryChannelProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-report-plan-report-delivery-channel-property-builder> (new CfnReportPlan$ReportDeliveryChannelProperty$Builder) id config))


(defn cfn-report-plan-report-setting-property-builder>
  "The cfn-report-plan-report-setting-property-builder> function updates a CfnReportPlan$ReportSettingProperty$Builder instance using the provided configuration.
  The function takes the CfnReportPlan$ReportSettingProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accounts` | java.util.List | [[cdk.support/lookup-entry]] | `:accounts` |
| `frameworkArns` | java.util.List | [[cdk.support/lookup-entry]] | `:framework-arns` |
| `organizationUnits` | java.util.List | [[cdk.support/lookup-entry]] | `:organization-units` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
| `reportTemplate` | java.lang.String | [[cdk.support/lookup-entry]] | `:report-template` |
"
  [^CfnReportPlan$ReportSettingProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :accounts)]
    (. builder accounts data))
  (when-some [data (lookup-entry config id :framework-arns)]
    (. builder frameworkArns data))
  (when-some [data (lookup-entry config id :organization-units)]
    (. builder organizationUnits data))
  (when-some [data (lookup-entry config id :regions)]
    (. builder regions data))
  (when-some [data (lookup-entry config id :report-template)]
    (. builder reportTemplate data))
  (.build builder))


(defn cfn-report-plan-report-setting-property-builder
  "Creates a  `CfnReportPlan$ReportSettingProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-report-plan-report-setting-property-builder> (new CfnReportPlan$ReportSettingProperty$Builder) id config))


(defn cfn-restore-testing-plan-builder>
  "The cfn-restore-testing-plan-builder> function updates a CfnRestoreTestingPlan$Builder instance using the provided configuration.
  The function takes the CfnRestoreTestingPlan$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recoveryPointSelection` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:recovery-point-selection` |
| `restoreTestingPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-plan-name` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleExpressionTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression-timezone` |
| `startWindowHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-window-hours` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRestoreTestingPlan$Builder builder id config]
  (when-some [data (lookup-entry config id :recovery-point-selection)]
    (. builder recoveryPointSelection data))
  (when-some [data (lookup-entry config id :restore-testing-plan-name)]
    (. builder restoreTestingPlanName data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (when-some [data (lookup-entry config id :schedule-expression-timezone)]
    (. builder scheduleExpressionTimezone data))
  (when-some [data (lookup-entry config id :start-window-hours)]
    (. builder startWindowHours data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-restore-testing-plan-builder
  "Creates a  `CfnRestoreTestingPlan$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-restore-testing-plan-builder> (CfnRestoreTestingPlan$Builder/create scope (name id)) id config))


(defn cfn-restore-testing-plan-props-builder>
  "The cfn-restore-testing-plan-props-builder> function updates a CfnRestoreTestingPlanProps$Builder instance using the provided configuration.
  The function takes the CfnRestoreTestingPlanProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `recoveryPointSelection` | software.amazon.awscdk.services.backup.CfnRestoreTestingPlan$RestoreTestingRecoveryPointSelectionProperty | [[cdk.support/lookup-entry]] | `:recovery-point-selection` |
| `restoreTestingPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-plan-name` |
| `scheduleExpression` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression` |
| `scheduleExpressionTimezone` | java.lang.String | [[cdk.support/lookup-entry]] | `:schedule-expression-timezone` |
| `startWindowHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:start-window-hours` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRestoreTestingPlanProps$Builder builder id config]
  (when-some [data (lookup-entry config id :recovery-point-selection)]
    (. builder recoveryPointSelection data))
  (when-some [data (lookup-entry config id :restore-testing-plan-name)]
    (. builder restoreTestingPlanName data))
  (when-some [data (lookup-entry config id :schedule-expression)]
    (. builder scheduleExpression data))
  (when-some [data (lookup-entry config id :schedule-expression-timezone)]
    (. builder scheduleExpressionTimezone data))
  (when-some [data (lookup-entry config id :start-window-hours)]
    (. builder startWindowHours data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-restore-testing-plan-props-builder
  "Creates a  `CfnRestoreTestingPlanProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-restore-testing-plan-props-builder> (new CfnRestoreTestingPlanProps$Builder) id config))


(defn cfn-restore-testing-plan-restore-testing-recovery-point-selection-property-builder>
  "The cfn-restore-testing-plan-restore-testing-recovery-point-selection-property-builder> function updates a CfnRestoreTestingPlan$RestoreTestingRecoveryPointSelectionProperty$Builder instance using the provided configuration.
  The function takes the CfnRestoreTestingPlan$RestoreTestingRecoveryPointSelectionProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `algorithm` | java.lang.String | [[cdk.support/lookup-entry]] | `:algorithm` |
| `excludeVaults` | java.util.List | [[cdk.support/lookup-entry]] | `:exclude-vaults` |
| `includeVaults` | java.util.List | [[cdk.support/lookup-entry]] | `:include-vaults` |
| `recoveryPointTypes` | java.util.List | [[cdk.support/lookup-entry]] | `:recovery-point-types` |
| `selectionWindowDays` | java.lang.Number | [[cdk.support/lookup-entry]] | `:selection-window-days` |
"
  [^CfnRestoreTestingPlan$RestoreTestingRecoveryPointSelectionProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :algorithm)]
    (. builder algorithm data))
  (when-some [data (lookup-entry config id :exclude-vaults)]
    (. builder excludeVaults data))
  (when-some [data (lookup-entry config id :include-vaults)]
    (. builder includeVaults data))
  (when-some [data (lookup-entry config id :recovery-point-types)]
    (. builder recoveryPointTypes data))
  (when-some [data (lookup-entry config id :selection-window-days)]
    (. builder selectionWindowDays data))
  (.build builder))


(defn cfn-restore-testing-plan-restore-testing-recovery-point-selection-property-builder
  "Creates a  `CfnRestoreTestingPlan$RestoreTestingRecoveryPointSelectionProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-restore-testing-plan-restore-testing-recovery-point-selection-property-builder> (new CfnRestoreTestingPlan$RestoreTestingRecoveryPointSelectionProperty$Builder) id config))


(defn cfn-restore-testing-selection-builder>
  "The cfn-restore-testing-selection-builder> function updates a CfnRestoreTestingSelection$Builder instance using the provided configuration.
  The function takes the CfnRestoreTestingSelection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `protectedResourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:protected-resource-arns` |
| `protectedResourceConditions` | software.amazon.awscdk.services.backup.CfnRestoreTestingSelection$ProtectedResourceConditionsProperty | [[cdk.support/lookup-entry]] | `:protected-resource-conditions` |
| `protectedResourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:protected-resource-type` |
| `restoreMetadataOverrides` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:restore-metadata-overrides` |
| `restoreTestingPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-plan-name` |
| `restoreTestingSelectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-selection-name` |
| `validationWindowHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:validation-window-hours` |
"
  [^CfnRestoreTestingSelection$Builder builder id config]
  (when-some [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-some [data (lookup-entry config id :protected-resource-arns)]
    (. builder protectedResourceArns data))
  (when-some [data (lookup-entry config id :protected-resource-conditions)]
    (. builder protectedResourceConditions data))
  (when-some [data (lookup-entry config id :protected-resource-type)]
    (. builder protectedResourceType data))
  (when-some [data (lookup-entry config id :restore-metadata-overrides)]
    (. builder restoreMetadataOverrides data))
  (when-some [data (lookup-entry config id :restore-testing-plan-name)]
    (. builder restoreTestingPlanName data))
  (when-some [data (lookup-entry config id :restore-testing-selection-name)]
    (. builder restoreTestingSelectionName data))
  (when-some [data (lookup-entry config id :validation-window-hours)]
    (. builder validationWindowHours data))
  (.build builder))


(defn cfn-restore-testing-selection-builder
  "Creates a  `CfnRestoreTestingSelection$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-restore-testing-selection-builder> (CfnRestoreTestingSelection$Builder/create scope (name id)) id config))


(defn cfn-restore-testing-selection-key-value-property-builder>
  "The cfn-restore-testing-selection-key-value-property-builder> function updates a CfnRestoreTestingSelection$KeyValueProperty$Builder instance using the provided configuration.
  The function takes the CfnRestoreTestingSelection$KeyValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnRestoreTestingSelection$KeyValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-restore-testing-selection-key-value-property-builder
  "Creates a  `CfnRestoreTestingSelection$KeyValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-restore-testing-selection-key-value-property-builder> (new CfnRestoreTestingSelection$KeyValueProperty$Builder) id config))


(defn cfn-restore-testing-selection-props-builder>
  "The cfn-restore-testing-selection-props-builder> function updates a CfnRestoreTestingSelectionProps$Builder instance using the provided configuration.
  The function takes the CfnRestoreTestingSelectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `iamRoleArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-role-arn` |
| `protectedResourceArns` | java.util.List | [[cdk.support/lookup-entry]] | `:protected-resource-arns` |
| `protectedResourceConditions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:protected-resource-conditions` |
| `protectedResourceType` | java.lang.String | [[cdk.support/lookup-entry]] | `:protected-resource-type` |
| `restoreMetadataOverrides` | java.util.Map | [[cdk.support/lookup-entry]] | `:restore-metadata-overrides` |
| `restoreTestingPlanName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-plan-name` |
| `restoreTestingSelectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:restore-testing-selection-name` |
| `validationWindowHours` | java.lang.Number | [[cdk.support/lookup-entry]] | `:validation-window-hours` |
"
  [^CfnRestoreTestingSelectionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :iam-role-arn)]
    (. builder iamRoleArn data))
  (when-some [data (lookup-entry config id :protected-resource-arns)]
    (. builder protectedResourceArns data))
  (when-some [data (lookup-entry config id :protected-resource-conditions)]
    (. builder protectedResourceConditions data))
  (when-some [data (lookup-entry config id :protected-resource-type)]
    (. builder protectedResourceType data))
  (when-some [data (lookup-entry config id :restore-metadata-overrides)]
    (. builder restoreMetadataOverrides data))
  (when-some [data (lookup-entry config id :restore-testing-plan-name)]
    (. builder restoreTestingPlanName data))
  (when-some [data (lookup-entry config id :restore-testing-selection-name)]
    (. builder restoreTestingSelectionName data))
  (when-some [data (lookup-entry config id :validation-window-hours)]
    (. builder validationWindowHours data))
  (.build builder))


(defn cfn-restore-testing-selection-props-builder
  "Creates a  `CfnRestoreTestingSelectionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-restore-testing-selection-props-builder> (new CfnRestoreTestingSelectionProps$Builder) id config))


(defn cfn-restore-testing-selection-protected-resource-conditions-property-builder>
  "The cfn-restore-testing-selection-protected-resource-conditions-property-builder> function updates a CfnRestoreTestingSelection$ProtectedResourceConditionsProperty$Builder instance using the provided configuration.
  The function takes the CfnRestoreTestingSelection$ProtectedResourceConditionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stringEquals` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:string-equals` |
| `stringNotEquals` | java.util.List | [[cdk.support/lookup-entry]] | `:string-not-equals` |
"
  [^CfnRestoreTestingSelection$ProtectedResourceConditionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :string-equals)]
    (. builder stringEquals data))
  (when-some [data (lookup-entry config id :string-not-equals)]
    (. builder stringNotEquals data))
  (.build builder))


(defn cfn-restore-testing-selection-protected-resource-conditions-property-builder
  "Creates a  `CfnRestoreTestingSelection$ProtectedResourceConditionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-restore-testing-selection-protected-resource-conditions-property-builder> (new CfnRestoreTestingSelection$ProtectedResourceConditionsProperty$Builder) id config))


(defn lock-configuration-builder>
  "The lock-configuration-builder> function updates a LockConfiguration$Builder instance using the provided configuration.
  The function takes the LockConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `changeableFor` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:changeable-for` |
| `maxRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:max-retention` |
| `minRetention` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:min-retention` |
"
  [^LockConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :changeable-for)]
    (. builder changeableFor data))
  (when-some [data (lookup-entry config id :max-retention)]
    (. builder maxRetention data))
  (when-some [data (lookup-entry config id :min-retention)]
    (. builder minRetention data))
  (.build builder))


(defn lock-configuration-builder
  "Creates a  `LockConfiguration$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (lock-configuration-builder> (new LockConfiguration$Builder) id config))


(defn tag-condition-builder>
  "The tag-condition-builder> function updates a TagCondition$Builder instance using the provided configuration.
  The function takes the TagCondition$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `operation` | software.amazon.awscdk.services.backup.TagOperation | [[cdk.api.services.backup/tag-operation]] | `:operation` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^TagCondition$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (tag-operation config id :operation)]
    (. builder operation data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn tag-condition-builder
  "Creates a  `TagCondition$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (tag-condition-builder> (new TagCondition$Builder) id config))