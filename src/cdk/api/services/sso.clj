(ns cdk.api.services.sso
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.sso package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.sso CfnApplication$Builder
                                                CfnApplication$PortalOptionsConfigurationProperty$Builder
                                                CfnApplication$SignInOptionsProperty$Builder
                                                CfnApplicationAssignment$Builder
                                                CfnApplicationAssignmentProps$Builder
                                                CfnApplicationProps$Builder
                                                CfnAssignment$Builder
                                                CfnAssignmentProps$Builder
                                                CfnInstance$Builder
                                                CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeProperty$Builder
                                                CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeValueProperty$Builder
                                                CfnInstanceAccessControlAttributeConfiguration$Builder
                                                CfnInstanceAccessControlAttributeConfiguration$InstanceAccessControlAttributeConfigurationProperty$Builder
                                                CfnInstanceAccessControlAttributeConfigurationProps$Builder
                                                CfnInstanceProps$Builder
                                                CfnPermissionSet$Builder
                                                CfnPermissionSet$CustomerManagedPolicyReferenceProperty$Builder
                                                CfnPermissionSet$PermissionsBoundaryProperty$Builder
                                                CfnPermissionSetProps$Builder]))


(defn cfn-application-assignment-builder>
  "The cfn-application-assignment-builder> function updates a CfnApplicationAssignment$Builder instance using the provided configuration.
  The function takes the CfnApplicationAssignment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
| `principalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-id` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |
"
  [^CfnApplicationAssignment$Builder builder id config]
  (when-some [data (lookup-entry config id :application-arn)]
    (. builder applicationArn data))
  (when-some [data (lookup-entry config id :principal-id)]
    (. builder principalId data))
  (when-some [data (lookup-entry config id :principal-type)]
    (. builder principalType data))
  (.build builder))


(defn cfn-application-assignment-builder
  "Creates a  `CfnApplicationAssignment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-application-assignment-builder> (CfnApplicationAssignment$Builder/create scope (name id)) id config))


(defn cfn-application-assignment-props-builder>
  "The cfn-application-assignment-props-builder> function updates a CfnApplicationAssignmentProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationAssignmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-arn` |
| `principalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-id` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |
"
  [^CfnApplicationAssignmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-arn)]
    (. builder applicationArn data))
  (when-some [data (lookup-entry config id :principal-id)]
    (. builder principalId data))
  (when-some [data (lookup-entry config id :principal-type)]
    (. builder principalType data))
  (.build builder))


(defn cfn-application-assignment-props-builder
  "Creates a  `CfnApplicationAssignmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-application-assignment-props-builder> (new CfnApplicationAssignmentProps$Builder) id config))


(defn cfn-application-builder>
  "The cfn-application-builder> function updates a CfnApplication$Builder instance using the provided configuration.
  The function takes the CfnApplication$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationProviderArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-provider-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `portalOptions` | software.amazon.awscdk.services.sso.CfnApplication$PortalOptionsConfigurationProperty | [[cdk.support/lookup-entry]] | `:portal-options` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplication$Builder builder id config]
  (when-some [data (lookup-entry config id :application-provider-arn)]
    (. builder applicationProviderArn data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :portal-options)]
    (. builder portalOptions data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-builder
  "Creates a  `CfnApplication$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-application-builder> (CfnApplication$Builder/create scope (name id)) id config))


(defn cfn-application-portal-options-configuration-property-builder>
  "The cfn-application-portal-options-configuration-property-builder> function updates a CfnApplication$PortalOptionsConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$PortalOptionsConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `signInOptions` | software.amazon.awscdk.services.sso.CfnApplication$SignInOptionsProperty | [[cdk.support/lookup-entry]] | `:sign-in-options` |
| `visibility` | java.lang.String | [[cdk.support/lookup-entry]] | `:visibility` |
"
  [^CfnApplication$PortalOptionsConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :sign-in-options)]
    (. builder signInOptions data))
  (when-some [data (lookup-entry config id :visibility)]
    (. builder visibility data))
  (.build builder))


(defn cfn-application-portal-options-configuration-property-builder
  "Creates a  `CfnApplication$PortalOptionsConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-application-portal-options-configuration-property-builder> (new CfnApplication$PortalOptionsConfigurationProperty$Builder) id config))


(defn cfn-application-props-builder>
  "The cfn-application-props-builder> function updates a CfnApplicationProps$Builder instance using the provided configuration.
  The function takes the CfnApplicationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationProviderArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-provider-arn` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `portalOptions` | software.amazon.awscdk.services.sso.CfnApplication$PortalOptionsConfigurationProperty | [[cdk.support/lookup-entry]] | `:portal-options` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnApplicationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :application-provider-arn)]
    (. builder applicationProviderArn data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :portal-options)]
    (. builder portalOptions data))
  (when-some [data (lookup-entry config id :status)]
    (. builder status data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-application-props-builder
  "Creates a  `CfnApplicationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-application-props-builder> (new CfnApplicationProps$Builder) id config))


(defn cfn-application-sign-in-options-property-builder>
  "The cfn-application-sign-in-options-property-builder> function updates a CfnApplication$SignInOptionsProperty$Builder instance using the provided configuration.
  The function takes the CfnApplication$SignInOptionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `applicationUrl` | java.lang.String | [[cdk.support/lookup-entry]] | `:application-url` |
| `origin` | java.lang.String | [[cdk.support/lookup-entry]] | `:origin` |
"
  [^CfnApplication$SignInOptionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :application-url)]
    (. builder applicationUrl data))
  (when-some [data (lookup-entry config id :origin)]
    (. builder origin data))
  (.build builder))


(defn cfn-application-sign-in-options-property-builder
  "Creates a  `CfnApplication$SignInOptionsProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-application-sign-in-options-property-builder> (new CfnApplication$SignInOptionsProperty$Builder) id config))


(defn cfn-assignment-builder>
  "The cfn-assignment-builder> function updates a CfnAssignment$Builder instance using the provided configuration.
  The function takes the CfnAssignment$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `permissionSetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission-set-arn` |
| `principalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-id` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
"
  [^CfnAssignment$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :permission-set-arn)]
    (. builder permissionSetArn data))
  (when-some [data (lookup-entry config id :principal-id)]
    (. builder principalId data))
  (when-some [data (lookup-entry config id :principal-type)]
    (. builder principalType data))
  (when-some [data (lookup-entry config id :target-id)]
    (. builder targetId data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn cfn-assignment-builder
  "Creates a  `CfnAssignment$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-assignment-builder> (CfnAssignment$Builder/create scope (name id)) id config))


(defn cfn-assignment-props-builder>
  "The cfn-assignment-props-builder> function updates a CfnAssignmentProps$Builder instance using the provided configuration.
  The function takes the CfnAssignmentProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `permissionSetArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:permission-set-arn` |
| `principalId` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-id` |
| `principalType` | java.lang.String | [[cdk.support/lookup-entry]] | `:principal-type` |
| `targetId` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-id` |
| `targetType` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-type` |
"
  [^CfnAssignmentProps$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :permission-set-arn)]
    (. builder permissionSetArn data))
  (when-some [data (lookup-entry config id :principal-id)]
    (. builder principalId data))
  (when-some [data (lookup-entry config id :principal-type)]
    (. builder principalType data))
  (when-some [data (lookup-entry config id :target-id)]
    (. builder targetId data))
  (when-some [data (lookup-entry config id :target-type)]
    (. builder targetType data))
  (.build builder))


(defn cfn-assignment-props-builder
  "Creates a  `CfnAssignmentProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-assignment-props-builder> (new CfnAssignmentProps$Builder) id config))


(defn cfn-instance-access-control-attribute-configuration-access-control-attribute-property-builder>
  "The cfn-instance-access-control-attribute-configuration-access-control-attribute-property-builder> function updates a CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :key)]
    (. builder key data))
  (when-some [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-instance-access-control-attribute-configuration-access-control-attribute-property-builder
  "Creates a  `CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-access-control-attribute-configuration-access-control-attribute-property-builder> (new CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeProperty$Builder) id config))


(defn cfn-instance-access-control-attribute-configuration-access-control-attribute-value-property-builder>
  "The cfn-instance-access-control-attribute-configuration-access-control-attribute-value-property-builder> function updates a CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeValueProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeValueProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `source` | java.util.List | [[cdk.support/lookup-entry]] | `:source` |
"
  [^CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeValueProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :source)]
    (. builder source data))
  (.build builder))


(defn cfn-instance-access-control-attribute-configuration-access-control-attribute-value-property-builder
  "Creates a  `CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeValueProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-access-control-attribute-configuration-access-control-attribute-value-property-builder> (new CfnInstanceAccessControlAttributeConfiguration$AccessControlAttributeValueProperty$Builder) id config))


(defn cfn-instance-access-control-attribute-configuration-builder>
  "The cfn-instance-access-control-attribute-configuration-builder> function updates a CfnInstanceAccessControlAttributeConfiguration$Builder instance using the provided configuration.
  The function takes the CfnInstanceAccessControlAttributeConfiguration$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlAttributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-control-attributes` |
| `instanceAccessControlAttributeConfiguration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:instance-access-control-attribute-configuration` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
"
  [^CfnInstanceAccessControlAttributeConfiguration$Builder builder id config]
  (when-some [data (lookup-entry config id :access-control-attributes)]
    (. builder accessControlAttributes data))
  (when-some [data (lookup-entry config id :instance-access-control-attribute-configuration)]
    (. builder instanceAccessControlAttributeConfiguration data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (.build builder))


(defn cfn-instance-access-control-attribute-configuration-builder
  "Creates a  `CfnInstanceAccessControlAttributeConfiguration$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-instance-access-control-attribute-configuration-builder> (CfnInstanceAccessControlAttributeConfiguration$Builder/create scope (name id)) id config))


(defn cfn-instance-access-control-attribute-configuration-instance-access-control-attribute-configuration-property-builder>
  "The cfn-instance-access-control-attribute-configuration-instance-access-control-attribute-configuration-property-builder> function updates a CfnInstanceAccessControlAttributeConfiguration$InstanceAccessControlAttributeConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnInstanceAccessControlAttributeConfiguration$InstanceAccessControlAttributeConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-attributes` |
"
  [^CfnInstanceAccessControlAttributeConfiguration$InstanceAccessControlAttributeConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :access-control-attributes)]
    (. builder accessControlAttributes data))
  (.build builder))


(defn cfn-instance-access-control-attribute-configuration-instance-access-control-attribute-configuration-property-builder
  "Creates a  `CfnInstanceAccessControlAttributeConfiguration$InstanceAccessControlAttributeConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-access-control-attribute-configuration-instance-access-control-attribute-configuration-property-builder> (new CfnInstanceAccessControlAttributeConfiguration$InstanceAccessControlAttributeConfigurationProperty$Builder) id config))


(defn cfn-instance-access-control-attribute-configuration-props-builder>
  "The cfn-instance-access-control-attribute-configuration-props-builder> function updates a CfnInstanceAccessControlAttributeConfigurationProps$Builder instance using the provided configuration.
  The function takes the CfnInstanceAccessControlAttributeConfigurationProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessControlAttributes` | java.util.List | [[cdk.support/lookup-entry]] | `:access-control-attributes` |
| `instanceAccessControlAttributeConfiguration` | software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration$InstanceAccessControlAttributeConfigurationProperty | [[cdk.support/lookup-entry]] | `:instance-access-control-attribute-configuration` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
"
  [^CfnInstanceAccessControlAttributeConfigurationProps$Builder builder id config]
  (when-some [data (lookup-entry config id :access-control-attributes)]
    (. builder accessControlAttributes data))
  (when-some [data (lookup-entry config id :instance-access-control-attribute-configuration)]
    (. builder instanceAccessControlAttributeConfiguration data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (.build builder))


(defn cfn-instance-access-control-attribute-configuration-props-builder
  "Creates a  `CfnInstanceAccessControlAttributeConfigurationProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-access-control-attribute-configuration-props-builder> (new CfnInstanceAccessControlAttributeConfigurationProps$Builder) id config))


(defn cfn-instance-builder>
  "The cfn-instance-builder> function updates a CfnInstance$Builder instance using the provided configuration.
  The function takes the CfnInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-instance-builder
  "Creates a  `CfnInstance$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-instance-builder> (CfnInstance$Builder/create scope (name id)) id config))


(defn cfn-instance-props-builder>
  "The cfn-instance-props-builder> function updates a CfnInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-instance-props-builder
  "Creates a  `CfnInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-instance-props-builder> (new CfnInstanceProps$Builder) id config))


(defn cfn-permission-set-builder>
  "The cfn-permission-set-builder> function updates a CfnPermissionSet$Builder instance using the provided configuration.
  The function takes the CfnPermissionSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedPolicyReferences` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customer-managed-policy-references` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inlinePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:inline-policy` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionsBoundary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `relayStateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:relay-state-type` |
| `sessionDuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-duration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPermissionSet$Builder builder id config]
  (when-some [data (lookup-entry config id :customer-managed-policy-references)]
    (. builder customerManagedPolicyReferences data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :inline-policy)]
    (. builder inlinePolicy data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :managed-policies)]
    (. builder managedPolicies data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :relay-state-type)]
    (. builder relayStateType data))
  (when-some [data (lookup-entry config id :session-duration)]
    (. builder sessionDuration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-permission-set-builder
  "Creates a  `CfnPermissionSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-permission-set-builder> (CfnPermissionSet$Builder/create scope (name id)) id config))


(defn cfn-permission-set-customer-managed-policy-reference-property-builder>
  "The cfn-permission-set-customer-managed-policy-reference-property-builder> function updates a CfnPermissionSet$CustomerManagedPolicyReferenceProperty$Builder instance using the provided configuration.
  The function takes the CfnPermissionSet$CustomerManagedPolicyReferenceProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
"
  [^CfnPermissionSet$CustomerManagedPolicyReferenceProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :path)]
    (. builder path data))
  (.build builder))


(defn cfn-permission-set-customer-managed-policy-reference-property-builder
  "Creates a  `CfnPermissionSet$CustomerManagedPolicyReferenceProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-permission-set-customer-managed-policy-reference-property-builder> (new CfnPermissionSet$CustomerManagedPolicyReferenceProperty$Builder) id config))


(defn cfn-permission-set-permissions-boundary-property-builder>
  "The cfn-permission-set-permissions-boundary-property-builder> function updates a CfnPermissionSet$PermissionsBoundaryProperty$Builder instance using the provided configuration.
  The function takes the CfnPermissionSet$PermissionsBoundaryProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedPolicyReference` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:customer-managed-policy-reference` |
| `managedPolicyArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:managed-policy-arn` |
"
  [^CfnPermissionSet$PermissionsBoundaryProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :customer-managed-policy-reference)]
    (. builder customerManagedPolicyReference data))
  (when-some [data (lookup-entry config id :managed-policy-arn)]
    (. builder managedPolicyArn data))
  (.build builder))


(defn cfn-permission-set-permissions-boundary-property-builder
  "Creates a  `CfnPermissionSet$PermissionsBoundaryProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-permission-set-permissions-boundary-property-builder> (new CfnPermissionSet$PermissionsBoundaryProperty$Builder) id config))


(defn cfn-permission-set-props-builder>
  "The cfn-permission-set-props-builder> function updates a CfnPermissionSetProps$Builder instance using the provided configuration.
  The function takes the CfnPermissionSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customerManagedPolicyReferences` | java.util.List | [[cdk.support/lookup-entry]] | `:customer-managed-policy-references` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `inlinePolicy` | java.lang.Object | [[cdk.support/lookup-entry]] | `:inline-policy` |
| `instanceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-arn` |
| `managedPolicies` | java.util.List | [[cdk.support/lookup-entry]] | `:managed-policies` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `permissionsBoundary` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:permissions-boundary` |
| `relayStateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:relay-state-type` |
| `sessionDuration` | java.lang.String | [[cdk.support/lookup-entry]] | `:session-duration` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPermissionSetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :customer-managed-policy-references)]
    (. builder customerManagedPolicyReferences data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :inline-policy)]
    (. builder inlinePolicy data))
  (when-some [data (lookup-entry config id :instance-arn)]
    (. builder instanceArn data))
  (when-some [data (lookup-entry config id :managed-policies)]
    (. builder managedPolicies data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :permissions-boundary)]
    (. builder permissionsBoundary data))
  (when-some [data (lookup-entry config id :relay-state-type)]
    (. builder relayStateType data))
  (when-some [data (lookup-entry config id :session-duration)]
    (. builder sessionDuration data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-permission-set-props-builder
  "Creates a  `CfnPermissionSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (cfn-permission-set-props-builder> (new CfnPermissionSetProps$Builder) id config))