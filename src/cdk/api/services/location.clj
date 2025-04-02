(ns cdk.api.services.location
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.location package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.location CfnAPIKey$ApiKeyRestrictionsProperty$Builder
                                                     CfnAPIKey$Builder
                                                     CfnAPIKeyProps$Builder
                                                     CfnGeofenceCollection$Builder
                                                     CfnGeofenceCollectionProps$Builder
                                                     CfnMap$Builder
                                                     CfnMap$MapConfigurationProperty$Builder
                                                     CfnMapProps$Builder
                                                     CfnPlaceIndex$Builder
                                                     CfnPlaceIndex$DataSourceConfigurationProperty$Builder
                                                     CfnPlaceIndexProps$Builder
                                                     CfnRouteCalculator$Builder
                                                     CfnRouteCalculatorProps$Builder
                                                     CfnTracker$Builder
                                                     CfnTrackerConsumer$Builder
                                                     CfnTrackerConsumerProps$Builder
                                                     CfnTrackerProps$Builder]))


(defn cfn-api-key-api-key-restrictions-property-builder>
  "The cfn-api-key-api-key-restrictions-property-builder> function updates a CfnAPIKey$ApiKeyRestrictionsProperty$Builder instance using the provided configuration.
  The function takes the CfnAPIKey$ApiKeyRestrictionsProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowActions` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-actions` |
| `allowReferers` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-referers` |
| `allowResources` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-resources` |
"
  [^CfnAPIKey$ApiKeyRestrictionsProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :allow-actions)]
    (. builder allowActions data))
  (when-some [data (lookup-entry config id :allow-referers)]
    (. builder allowReferers data))
  (when-some [data (lookup-entry config id :allow-resources)]
    (. builder allowResources data))
  (.build builder))


(defn cfn-api-key-api-key-restrictions-property-builder
  "Creates a  `CfnAPIKey$ApiKeyRestrictionsProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-api-key-api-key-restrictions-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-api-key-api-key-restrictions-property-builder> (new CfnAPIKey$ApiKeyRestrictionsProperty$Builder) id config))


(defn cfn-api-key-builder>
  "The cfn-api-key-builder> function updates a CfnAPIKey$Builder instance using the provided configuration.
  The function takes the CfnAPIKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expireTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:expire-time` |
| `forceDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-delete` |
| `forceUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:force-update` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `noExpiry` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-expiry` |
| `restrictions` | software.amazon.awscdk.services.location.CfnAPIKey$ApiKeyRestrictionsProperty | [[cdk.support/lookup-entry]] | `:restrictions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAPIKey$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :expire-time)]
    (. builder expireTime data))
  (when-some [data (lookup-entry config id :force-delete)]
    (. builder forceDelete data))
  (when-some [data (lookup-entry config id :force-update)]
    (. builder forceUpdate data))
  (when-some [data (lookup-entry config id :key-name)]
    (. builder keyName data))
  (when-some [data (lookup-entry config id :no-expiry)]
    (. builder noExpiry data))
  (when-some [data (lookup-entry config id :restrictions)]
    (. builder restrictions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-api-key-builder
  "Creates a  `CfnAPIKey$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-api-key-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-api-key-builder> (CfnAPIKey$Builder/create scope (name id)) id config))


(defn cfn-api-key-props-builder>
  "The cfn-api-key-props-builder> function updates a CfnAPIKeyProps$Builder instance using the provided configuration.
  The function takes the CfnAPIKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expireTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:expire-time` |
| `forceDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-delete` |
| `forceUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-update` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `noExpiry` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:no-expiry` |
| `restrictions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:restrictions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnAPIKeyProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :expire-time)]
    (. builder expireTime data))
  (when-some [data (lookup-entry config id :force-delete)]
    (. builder forceDelete data))
  (when-some [data (lookup-entry config id :force-update)]
    (. builder forceUpdate data))
  (when-some [data (lookup-entry config id :key-name)]
    (. builder keyName data))
  (when-some [data (lookup-entry config id :no-expiry)]
    (. builder noExpiry data))
  (when-some [data (lookup-entry config id :restrictions)]
    (. builder restrictions data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-api-key-props-builder
  "Creates a  `CfnAPIKeyProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-api-key-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-api-key-props-builder> (new CfnAPIKeyProps$Builder) id config))


(defn cfn-geofence-collection-builder>
  "The cfn-geofence-collection-builder> function updates a CfnGeofenceCollection$Builder instance using the provided configuration.
  The function takes the CfnGeofenceCollection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `pricingPlanDataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan-data-source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGeofenceCollection$Builder builder id config]
  (when-some [data (lookup-entry config id :collection-name)]
    (. builder collectionName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :pricing-plan-data-source)]
    (. builder pricingPlanDataSource data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-geofence-collection-builder
  "Creates a  `CfnGeofenceCollection$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-geofence-collection-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-geofence-collection-builder> (CfnGeofenceCollection$Builder/create scope (name id)) id config))


(defn cfn-geofence-collection-props-builder>
  "The cfn-geofence-collection-props-builder> function updates a CfnGeofenceCollectionProps$Builder instance using the provided configuration.
  The function takes the CfnGeofenceCollectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `pricingPlanDataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan-data-source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnGeofenceCollectionProps$Builder builder id config]
  (when-some [data (lookup-entry config id :collection-name)]
    (. builder collectionName data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :pricing-plan-data-source)]
    (. builder pricingPlanDataSource data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-geofence-collection-props-builder
  "Creates a  `CfnGeofenceCollectionProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-geofence-collection-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-geofence-collection-props-builder> (new CfnGeofenceCollectionProps$Builder) id config))


(defn cfn-map-builder>
  "The cfn-map-builder> function updates a CfnMap$Builder instance using the provided configuration.
  The function takes the CfnMap$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mapName` | java.lang.String | [[cdk.support/lookup-entry]] | `:map-name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMap$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :map-name)]
    (. builder mapName data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-map-builder
  "Creates a  `CfnMap$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-map-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-map-builder> (CfnMap$Builder/create scope (name id)) id config))


(defn cfn-map-map-configuration-property-builder>
  "The cfn-map-map-configuration-property-builder> function updates a CfnMap$MapConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnMap$MapConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customLayers` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-layers` |
| `politicalView` | java.lang.String | [[cdk.support/lookup-entry]] | `:political-view` |
| `style` | java.lang.String | [[cdk.support/lookup-entry]] | `:style` |
"
  [^CfnMap$MapConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-layers)]
    (. builder customLayers data))
  (when-some [data (lookup-entry config id :political-view)]
    (. builder politicalView data))
  (when-some [data (lookup-entry config id :style)]
    (. builder style data))
  (.build builder))


(defn cfn-map-map-configuration-property-builder
  "Creates a  `CfnMap$MapConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-map-map-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-map-map-configuration-property-builder> (new CfnMap$MapConfigurationProperty$Builder) id config))


(defn cfn-map-props-builder>
  "The cfn-map-props-builder> function updates a CfnMapProps$Builder instance using the provided configuration.
  The function takes the CfnMapProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mapName` | java.lang.String | [[cdk.support/lookup-entry]] | `:map-name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnMapProps$Builder builder id config]
  (when-some [data (lookup-entry config id :configuration)]
    (. builder configuration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :map-name)]
    (. builder mapName data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-map-props-builder
  "Creates a  `CfnMapProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-map-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-map-props-builder> (new CfnMapProps$Builder) id config))


(defn cfn-place-index-builder>
  "The cfn-place-index-builder> function updates a CfnPlaceIndex$Builder instance using the provided configuration.
  The function takes the CfnPlaceIndex$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `dataSourceConfiguration` | software.amazon.awscdk.services.location.CfnPlaceIndex$DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:data-source-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPlaceIndex$Builder builder id config]
  (when-some [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-some [data (lookup-entry config id :data-source-configuration)]
    (. builder dataSourceConfiguration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :index-name)]
    (. builder indexName data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-place-index-builder
  "Creates a  `CfnPlaceIndex$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-place-index-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-place-index-builder> (CfnPlaceIndex$Builder/create scope (name id)) id config))


(defn cfn-place-index-data-source-configuration-property-builder>
  "The cfn-place-index-data-source-configuration-property-builder> function updates a CfnPlaceIndex$DataSourceConfigurationProperty$Builder instance using the provided configuration.
  The function takes the CfnPlaceIndex$DataSourceConfigurationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intendedUse` | java.lang.String | [[cdk.support/lookup-entry]] | `:intended-use` |
"
  [^CfnPlaceIndex$DataSourceConfigurationProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :intended-use)]
    (. builder intendedUse data))
  (.build builder))


(defn cfn-place-index-data-source-configuration-property-builder
  "Creates a  `CfnPlaceIndex$DataSourceConfigurationProperty$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-place-index-data-source-configuration-property-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-place-index-data-source-configuration-property-builder> (new CfnPlaceIndex$DataSourceConfigurationProperty$Builder) id config))


(defn cfn-place-index-props-builder>
  "The cfn-place-index-props-builder> function updates a CfnPlaceIndexProps$Builder instance using the provided configuration.
  The function takes the CfnPlaceIndexProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `dataSourceConfiguration` | software.amazon.awscdk.services.location.CfnPlaceIndex$DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:data-source-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPlaceIndexProps$Builder builder id config]
  (when-some [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-some [data (lookup-entry config id :data-source-configuration)]
    (. builder dataSourceConfiguration data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :index-name)]
    (. builder indexName data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-place-index-props-builder
  "Creates a  `CfnPlaceIndexProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-place-index-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-place-index-props-builder> (new CfnPlaceIndexProps$Builder) id config))


(defn cfn-route-calculator-builder>
  "The cfn-route-calculator-builder> function updates a CfnRouteCalculator$Builder instance using the provided configuration.
  The function takes the CfnRouteCalculator$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `calculatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:calculator-name` |
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRouteCalculator$Builder builder id config]
  (when-some [data (lookup-entry config id :calculator-name)]
    (. builder calculatorName data))
  (when-some [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-route-calculator-builder
  "Creates a  `CfnRouteCalculator$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-route-calculator-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-route-calculator-builder> (CfnRouteCalculator$Builder/create scope (name id)) id config))


(defn cfn-route-calculator-props-builder>
  "The cfn-route-calculator-props-builder> function updates a CfnRouteCalculatorProps$Builder instance using the provided configuration.
  The function takes the CfnRouteCalculatorProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `calculatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:calculator-name` |
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnRouteCalculatorProps$Builder builder id config]
  (when-some [data (lookup-entry config id :calculator-name)]
    (. builder calculatorName data))
  (when-some [data (lookup-entry config id :data-source)]
    (. builder dataSource data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-route-calculator-props-builder
  "Creates a  `CfnRouteCalculatorProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-route-calculator-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-route-calculator-props-builder> (new CfnRouteCalculatorProps$Builder) id config))


(defn cfn-tracker-builder>
  "The cfn-tracker-builder> function updates a CfnTracker$Builder instance using the provided configuration.
  The function takes the CfnTracker$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBridgeEnabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:event-bridge-enabled` |
| `kmsKeyEnableGeospatialQueries` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:kms-key-enable-geospatial-queries` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `positionFiltering` | java.lang.String | [[cdk.support/lookup-entry]] | `:position-filtering` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `pricingPlanDataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan-data-source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trackerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracker-name` |
"
  [^CfnTracker$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-bridge-enabled)]
    (. builder eventBridgeEnabled data))
  (when-some [data (lookup-entry config id :kms-key-enable-geospatial-queries)]
    (. builder kmsKeyEnableGeospatialQueries data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :position-filtering)]
    (. builder positionFiltering data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :pricing-plan-data-source)]
    (. builder pricingPlanDataSource data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tracker-name)]
    (. builder trackerName data))
  (.build builder))


(defn cfn-tracker-builder
  "Creates a  `CfnTracker$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-tracker-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-tracker-builder> (CfnTracker$Builder/create scope (name id)) id config))


(defn cfn-tracker-consumer-builder>
  "The cfn-tracker-consumer-builder> function updates a CfnTrackerConsumer$Builder instance using the provided configuration.
  The function takes the CfnTrackerConsumer$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-arn` |
| `trackerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracker-name` |
"
  [^CfnTrackerConsumer$Builder builder id config]
  (when-some [data (lookup-entry config id :consumer-arn)]
    (. builder consumerArn data))
  (when-some [data (lookup-entry config id :tracker-name)]
    (. builder trackerName data))
  (.build builder))


(defn cfn-tracker-consumer-builder
  "Creates a  `CfnTrackerConsumer$Builder` instance using a scope and ID, applies the data configuration using the [[cfn-tracker-consumer-builder>]] function, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| `scope` | software.constructs.Construct | The parent scope construct of the object being built. |
| `id` | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (cfn-tracker-consumer-builder> (CfnTrackerConsumer$Builder/create scope (name id)) id config))


(defn cfn-tracker-consumer-props-builder>
  "The cfn-tracker-consumer-props-builder> function updates a CfnTrackerConsumerProps$Builder instance using the provided configuration.
  The function takes the CfnTrackerConsumerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-arn` |
| `trackerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracker-name` |
"
  [^CfnTrackerConsumerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :consumer-arn)]
    (. builder consumerArn data))
  (when-some [data (lookup-entry config id :tracker-name)]
    (. builder trackerName data))
  (.build builder))


(defn cfn-tracker-consumer-props-builder
  "Creates a  `CfnTrackerConsumerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-tracker-consumer-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-tracker-consumer-props-builder> (new CfnTrackerConsumerProps$Builder) id config))


(defn cfn-tracker-props-builder>
  "The cfn-tracker-props-builder> function updates a CfnTrackerProps$Builder instance using the provided configuration.
  The function takes the CfnTrackerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `eventBridgeEnabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:event-bridge-enabled` |
| `kmsKeyEnableGeospatialQueries` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:kms-key-enable-geospatial-queries` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `positionFiltering` | java.lang.String | [[cdk.support/lookup-entry]] | `:position-filtering` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `pricingPlanDataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan-data-source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `trackerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracker-name` |
"
  [^CfnTrackerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :event-bridge-enabled)]
    (. builder eventBridgeEnabled data))
  (when-some [data (lookup-entry config id :kms-key-enable-geospatial-queries)]
    (. builder kmsKeyEnableGeospatialQueries data))
  (when-some [data (lookup-entry config id :kms-key-id)]
    (. builder kmsKeyId data))
  (when-some [data (lookup-entry config id :position-filtering)]
    (. builder positionFiltering data))
  (when-some [data (lookup-entry config id :pricing-plan)]
    (. builder pricingPlan data))
  (when-some [data (lookup-entry config id :pricing-plan-data-source)]
    (. builder pricingPlanDataSource data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :tracker-name)]
    (. builder trackerName data))
  (.build builder))


(defn cfn-tracker-props-builder
  "Creates a  `CfnTrackerProps$Builder` instance using a no-argument constructor, applies the data configuration using the [[cfn-tracker-props-builder>]] function, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| `id` | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| `config` | map | Data configuration |"
  [id config]
  (cfn-tracker-props-builder> (new CfnTrackerProps$Builder) id config))