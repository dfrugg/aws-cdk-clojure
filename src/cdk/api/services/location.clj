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


(defn cfn-api-key-api-key-restrictions-property-builder
  "The cfn-api-key-api-key-restrictions-property-builder function buildes out new instances of 
CfnAPIKey$ApiKeyRestrictionsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowActions` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-actions` |
| `allowReferers` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-referers` |
| `allowResources` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-resources` |"
  [stack id config]
  (let [builder (CfnAPIKey$ApiKeyRestrictionsProperty$Builder.)]
    (when-let [data (lookup-entry config id :allow-actions)]
      (. builder allowActions data))
    (when-let [data (lookup-entry config id :allow-referers)]
      (. builder allowReferers data))
    (when-let [data (lookup-entry config id :allow-resources)]
      (. builder allowResources data))
    (.build builder)))


(defn cfn-api-key-builder
  "The cfn-api-key-builder function buildes out new instances of 
CfnAPIKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expireTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:expire-time` |
| `forceDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-delete` |
| `forceUpdate` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:force-update` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `noExpiry` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:no-expiry` |
| `restrictions` | software.amazon.awscdk.services.location.CfnAPIKey$ApiKeyRestrictionsProperty | [[cdk.support/lookup-entry]] | `:restrictions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAPIKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :expire-time)]
      (. builder expireTime data))
    (when-let [data (lookup-entry config id :force-delete)]
      (. builder forceDelete data))
    (when-let [data (lookup-entry config id :force-update)]
      (. builder forceUpdate data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :no-expiry)]
      (. builder noExpiry data))
    (when-let [data (lookup-entry config id :restrictions)]
      (. builder restrictions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-api-key-props-builder
  "The cfn-api-key-props-builder function buildes out new instances of 
CfnAPIKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `expireTime` | java.lang.String | [[cdk.support/lookup-entry]] | `:expire-time` |
| `forceDelete` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-delete` |
| `forceUpdate` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:force-update` |
| `keyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-name` |
| `noExpiry` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:no-expiry` |
| `restrictions` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:restrictions` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAPIKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :expire-time)]
      (. builder expireTime data))
    (when-let [data (lookup-entry config id :force-delete)]
      (. builder forceDelete data))
    (when-let [data (lookup-entry config id :force-update)]
      (. builder forceUpdate data))
    (when-let [data (lookup-entry config id :key-name)]
      (. builder keyName data))
    (when-let [data (lookup-entry config id :no-expiry)]
      (. builder noExpiry data))
    (when-let [data (lookup-entry config id :restrictions)]
      (. builder restrictions data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-geofence-collection-builder
  "The cfn-geofence-collection-builder function buildes out new instances of 
CfnGeofenceCollection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `pricingPlanDataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan-data-source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGeofenceCollection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :collection-name)]
      (. builder collectionName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :pricing-plan-data-source)]
      (. builder pricingPlanDataSource data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-geofence-collection-props-builder
  "The cfn-geofence-collection-props-builder function buildes out new instances of 
CfnGeofenceCollectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionName` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-name` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `kmsKeyId` | java.lang.String | [[cdk.support/lookup-entry]] | `:kms-key-id` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `pricingPlanDataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan-data-source` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnGeofenceCollectionProps$Builder.)]
    (when-let [data (lookup-entry config id :collection-name)]
      (. builder collectionName data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :pricing-plan-data-source)]
      (. builder pricingPlanDataSource data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-map-builder
  "The cfn-map-builder function buildes out new instances of 
CfnMap$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mapName` | java.lang.String | [[cdk.support/lookup-entry]] | `:map-name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMap$Builder/create stack id)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :map-name)]
      (. builder mapName data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-map-map-configuration-property-builder
  "The cfn-map-map-configuration-property-builder function buildes out new instances of 
CfnMap$MapConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customLayers` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-layers` |
| `politicalView` | java.lang.String | [[cdk.support/lookup-entry]] | `:political-view` |
| `style` | java.lang.String | [[cdk.support/lookup-entry]] | `:style` |"
  [stack id config]
  (let [builder (CfnMap$MapConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :custom-layers)]
      (. builder customLayers data))
    (when-let [data (lookup-entry config id :political-view)]
      (. builder politicalView data))
    (when-let [data (lookup-entry config id :style)]
      (. builder style data))
    (.build builder)))


(defn cfn-map-props-builder
  "The cfn-map-props-builder function buildes out new instances of 
CfnMapProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `configuration` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `mapName` | java.lang.String | [[cdk.support/lookup-entry]] | `:map-name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnMapProps$Builder.)]
    (when-let [data (lookup-entry config id :configuration)]
      (. builder configuration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :map-name)]
      (. builder mapName data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-place-index-builder
  "The cfn-place-index-builder function buildes out new instances of 
CfnPlaceIndex$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `dataSourceConfiguration` | software.amazon.awscdk.services.location.CfnPlaceIndex$DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:data-source-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPlaceIndex$Builder/create stack id)]
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (lookup-entry config id :data-source-configuration)]
      (. builder dataSourceConfiguration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-place-index-data-source-configuration-property-builder
  "The cfn-place-index-data-source-configuration-property-builder function buildes out new instances of 
CfnPlaceIndex$DataSourceConfigurationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `intendedUse` | java.lang.String | [[cdk.support/lookup-entry]] | `:intended-use` |"
  [stack id config]
  (let [builder (CfnPlaceIndex$DataSourceConfigurationProperty$Builder.)]
    (when-let [data (lookup-entry config id :intended-use)]
      (. builder intendedUse data))
    (.build builder)))


(defn cfn-place-index-props-builder
  "The cfn-place-index-props-builder function buildes out new instances of 
CfnPlaceIndexProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `dataSourceConfiguration` | software.amazon.awscdk.services.location.CfnPlaceIndex$DataSourceConfigurationProperty | [[cdk.support/lookup-entry]] | `:data-source-configuration` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `indexName` | java.lang.String | [[cdk.support/lookup-entry]] | `:index-name` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPlaceIndexProps$Builder.)]
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (lookup-entry config id :data-source-configuration)]
      (. builder dataSourceConfiguration data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :index-name)]
      (. builder indexName data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-route-calculator-builder
  "The cfn-route-calculator-builder function buildes out new instances of 
CfnRouteCalculator$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `calculatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:calculator-name` |
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRouteCalculator$Builder/create stack id)]
    (when-let [data (lookup-entry config id :calculator-name)]
      (. builder calculatorName data))
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-route-calculator-props-builder
  "The cfn-route-calculator-props-builder function buildes out new instances of 
CfnRouteCalculatorProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `calculatorName` | java.lang.String | [[cdk.support/lookup-entry]] | `:calculator-name` |
| `dataSource` | java.lang.String | [[cdk.support/lookup-entry]] | `:data-source` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `pricingPlan` | java.lang.String | [[cdk.support/lookup-entry]] | `:pricing-plan` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnRouteCalculatorProps$Builder.)]
    (when-let [data (lookup-entry config id :calculator-name)]
      (. builder calculatorName data))
    (when-let [data (lookup-entry config id :data-source)]
      (. builder dataSource data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-tracker-builder
  "The cfn-tracker-builder function buildes out new instances of 
CfnTracker$Builder using the provided configuration.  Each field is set as follows:

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
| `trackerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracker-name` |"
  [stack id config]
  (let [builder (CfnTracker$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-bridge-enabled)]
      (. builder eventBridgeEnabled data))
    (when-let [data (lookup-entry config id :kms-key-enable-geospatial-queries)]
      (. builder kmsKeyEnableGeospatialQueries data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :position-filtering)]
      (. builder positionFiltering data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :pricing-plan-data-source)]
      (. builder pricingPlanDataSource data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tracker-name)]
      (. builder trackerName data))
    (.build builder)))


(defn cfn-tracker-consumer-builder
  "The cfn-tracker-consumer-builder function buildes out new instances of 
CfnTrackerConsumer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-arn` |
| `trackerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracker-name` |"
  [stack id config]
  (let [builder (CfnTrackerConsumer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :consumer-arn)]
      (. builder consumerArn data))
    (when-let [data (lookup-entry config id :tracker-name)]
      (. builder trackerName data))
    (.build builder)))


(defn cfn-tracker-consumer-props-builder
  "The cfn-tracker-consumer-props-builder function buildes out new instances of 
CfnTrackerConsumerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `consumerArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:consumer-arn` |
| `trackerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracker-name` |"
  [stack id config]
  (let [builder (CfnTrackerConsumerProps$Builder.)]
    (when-let [data (lookup-entry config id :consumer-arn)]
      (. builder consumerArn data))
    (when-let [data (lookup-entry config id :tracker-name)]
      (. builder trackerName data))
    (.build builder)))


(defn cfn-tracker-props-builder
  "The cfn-tracker-props-builder function buildes out new instances of 
CfnTrackerProps$Builder using the provided configuration.  Each field is set as follows:

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
| `trackerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:tracker-name` |"
  [stack id config]
  (let [builder (CfnTrackerProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :event-bridge-enabled)]
      (. builder eventBridgeEnabled data))
    (when-let [data (lookup-entry config id :kms-key-enable-geospatial-queries)]
      (. builder kmsKeyEnableGeospatialQueries data))
    (when-let [data (lookup-entry config id :kms-key-id)]
      (. builder kmsKeyId data))
    (when-let [data (lookup-entry config id :position-filtering)]
      (. builder positionFiltering data))
    (when-let [data (lookup-entry config id :pricing-plan)]
      (. builder pricingPlan data))
    (when-let [data (lookup-entry config id :pricing-plan-data-source)]
      (. builder pricingPlanDataSource data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :tracker-name)]
      (. builder trackerName data))
    (.build builder)))