(ns cdk.api.services.cloudwatch.actions
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cloudwatch.actions package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.cloudwatch.actions Ec2InstanceAction
                                                               OpsItemCategory
                                                               OpsItemSeverity]))


(defn ec2-instance-action
  "The `ec2-instance-action` function data interprets values in the provided config data into a 
`Ec2InstanceAction` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Ec2InstanceAction` - the value is returned.
* is `:terminate` - `Ec2InstanceAction/TERMINATE` is returned
* is `:stop` - `Ec2InstanceAction/STOP` is returned
* is `:reboot` - `Ec2InstanceAction/REBOOT` is returned
* is `:recover` - `Ec2InstanceAction/RECOVER` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Ec2InstanceAction data) data
      (= :terminate data) Ec2InstanceAction/TERMINATE
      (= :stop data) Ec2InstanceAction/STOP
      (= :reboot data) Ec2InstanceAction/REBOOT
      (= :recover data) Ec2InstanceAction/RECOVER)))


(defn ops-item-category
  "The `ops-item-category` function data interprets values in the provided config data into a 
`OpsItemCategory` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `OpsItemCategory` - the value is returned.
* is `:recovery` - `OpsItemCategory/RECOVERY` is returned
* is `:availability` - `OpsItemCategory/AVAILABILITY` is returned
* is `:security` - `OpsItemCategory/SECURITY` is returned
* is `:cost` - `OpsItemCategory/COST` is returned
* is `:performance` - `OpsItemCategory/PERFORMANCE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? OpsItemCategory data) data
      (= :recovery data) OpsItemCategory/RECOVERY
      (= :availability data) OpsItemCategory/AVAILABILITY
      (= :security data) OpsItemCategory/SECURITY
      (= :cost data) OpsItemCategory/COST
      (= :performance data) OpsItemCategory/PERFORMANCE)))


(defn ops-item-severity
  "The `ops-item-severity` function data interprets values in the provided config data into a 
`OpsItemSeverity` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `OpsItemSeverity` - the value is returned.
* is `:medium` - `OpsItemSeverity/MEDIUM` is returned
* is `:critical` - `OpsItemSeverity/CRITICAL` is returned
* is `:low` - `OpsItemSeverity/LOW` is returned
* is `:high` - `OpsItemSeverity/HIGH` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? OpsItemSeverity data) data
      (= :medium data) OpsItemSeverity/MEDIUM
      (= :critical data) OpsItemSeverity/CRITICAL
      (= :low data) OpsItemSeverity/LOW
      (= :high data) OpsItemSeverity/HIGH)))