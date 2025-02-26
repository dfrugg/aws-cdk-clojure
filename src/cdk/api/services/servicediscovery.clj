(ns cdk.api.services.servicediscovery
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.servicediscovery package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.servicediscovery AliasTargetInstance$Builder
                                                             AliasTargetInstanceProps$Builder
                                                             BaseInstanceProps$Builder
                                                             BaseNamespaceProps$Builder
                                                             BaseServiceProps$Builder
                                                             CfnHttpNamespace$Builder
                                                             CfnHttpNamespaceProps$Builder
                                                             CfnInstance$Builder
                                                             CfnInstanceProps$Builder
                                                             CfnPrivateDnsNamespace$Builder
                                                             CfnPrivateDnsNamespace$PrivateDnsPropertiesMutableProperty$Builder
                                                             CfnPrivateDnsNamespace$PropertiesProperty$Builder
                                                             CfnPrivateDnsNamespace$SOAProperty$Builder
                                                             CfnPrivateDnsNamespaceProps$Builder
                                                             CfnPublicDnsNamespace$Builder
                                                             CfnPublicDnsNamespace$PropertiesProperty$Builder
                                                             CfnPublicDnsNamespace$PublicDnsPropertiesMutableProperty$Builder
                                                             CfnPublicDnsNamespace$SOAProperty$Builder
                                                             CfnPublicDnsNamespaceProps$Builder
                                                             CfnService$Builder
                                                             CfnService$DnsConfigProperty$Builder
                                                             CfnService$DnsRecordProperty$Builder
                                                             CfnService$HealthCheckConfigProperty$Builder
                                                             CfnService$HealthCheckCustomConfigProperty$Builder
                                                             CfnServiceProps$Builder
                                                             CnameInstance$Builder
                                                             CnameInstanceBaseProps$Builder
                                                             CnameInstanceProps$Builder
                                                             DiscoveryType
                                                             DnsRecordType
                                                             DnsServiceProps$Builder
                                                             HealthCheckConfig$Builder
                                                             HealthCheckCustomConfig$Builder
                                                             HealthCheckType
                                                             HttpNamespace$Builder
                                                             HttpNamespaceAttributes$Builder
                                                             HttpNamespaceProps$Builder
                                                             IpInstance$Builder
                                                             IpInstanceBaseProps$Builder
                                                             IpInstanceProps$Builder
                                                             NamespaceType
                                                             NonIpInstance$Builder
                                                             NonIpInstanceBaseProps$Builder
                                                             NonIpInstanceProps$Builder
                                                             PrivateDnsNamespace$Builder
                                                             PrivateDnsNamespaceAttributes$Builder
                                                             PrivateDnsNamespaceProps$Builder
                                                             PublicDnsNamespace$Builder
                                                             PublicDnsNamespaceAttributes$Builder
                                                             PublicDnsNamespaceProps$Builder
                                                             RoutingPolicy
                                                             Service$Builder
                                                             ServiceAttributes$Builder
                                                             ServiceProps$Builder]))


(defn discovery-type
  "The `discovery-type` function data interprets values in the provided config data into a 
`DiscoveryType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DiscoveryType` - the value is returned.
* is `:dns-and-api` - `DiscoveryType/DNS_AND_API` is returned
* is `:api` - `DiscoveryType/API` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DiscoveryType data) data
      (= :dns-and-api data) DiscoveryType/DNS_AND_API
      (= :api data) DiscoveryType/API)))


(defn dns-record-type
  "The `dns-record-type` function data interprets values in the provided config data into a 
`DnsRecordType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `DnsRecordType` - the value is returned.
* is `:srv` - `DnsRecordType/SRV` is returned
* is `:cname` - `DnsRecordType/CNAME` is returned
* is `:a` - `DnsRecordType/A` is returned
* is `:aaaa` - `DnsRecordType/AAAA` is returned
* is `:a-aaaa` - `DnsRecordType/A_AAAA` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? DnsRecordType data) data
      (= :srv data) DnsRecordType/SRV
      (= :cname data) DnsRecordType/CNAME
      (= :a data) DnsRecordType/A
      (= :aaaa data) DnsRecordType/AAAA
      (= :a-aaaa data) DnsRecordType/A_AAAA)))


(defn health-check-type
  "The `health-check-type` function data interprets values in the provided config data into a 
`HealthCheckType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `HealthCheckType` - the value is returned.
* is `:http` - `HealthCheckType/HTTP` is returned
* is `:https` - `HealthCheckType/HTTPS` is returned
* is `:tcp` - `HealthCheckType/TCP` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? HealthCheckType data) data
      (= :http data) HealthCheckType/HTTP
      (= :https data) HealthCheckType/HTTPS
      (= :tcp data) HealthCheckType/TCP)))


(defn namespace-type
  "The `namespace-type` function data interprets values in the provided config data into a 
`NamespaceType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `NamespaceType` - the value is returned.
* is `:dns-private` - `NamespaceType/DNS_PRIVATE` is returned
* is `:http` - `NamespaceType/HTTP` is returned
* is `:dns-public` - `NamespaceType/DNS_PUBLIC` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? NamespaceType data) data
      (= :dns-private data) NamespaceType/DNS_PRIVATE
      (= :http data) NamespaceType/HTTP
      (= :dns-public data) NamespaceType/DNS_PUBLIC)))


(defn routing-policy
  "The `routing-policy` function data interprets values in the provided config data into a 
`RoutingPolicy` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RoutingPolicy` - the value is returned.
* is `:multivalue` - `RoutingPolicy/MULTIVALUE` is returned
* is `:weighted` - `RoutingPolicy/WEIGHTED` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RoutingPolicy data) data
      (= :multivalue data) RoutingPolicy/MULTIVALUE
      (= :weighted data) RoutingPolicy/WEIGHTED)))


(defn build-alias-target-instance-builder
  "The build-alias-target-instance-builder function updates a AliasTargetInstance$Builder instance using the provided configuration.
  The function takes the AliasTargetInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |
"
  [^AliasTargetInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :dns-name)]
    (. builder dnsName data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn alias-target-instance-builder
  "Creates a  `AliasTargetInstance$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-alias-target-instance-builder (AliasTargetInstance$Builder/create scope (name id)) id config))


(defn build-alias-target-instance-props-builder
  "The build-alias-target-instance-props-builder function updates a AliasTargetInstanceProps$Builder instance using the provided configuration.
  The function takes the AliasTargetInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |
"
  [^AliasTargetInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :dns-name)]
    (. builder dnsName data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn alias-target-instance-props-builder
  "Creates a  `AliasTargetInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-alias-target-instance-props-builder (new AliasTargetInstanceProps$Builder) id config))


(defn build-base-instance-props-builder
  "The build-base-instance-props-builder function updates a BaseInstanceProps$Builder instance using the provided configuration.
  The function takes the BaseInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
"
  [^BaseInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (.build builder))


(defn base-instance-props-builder
  "Creates a  `BaseInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-base-instance-props-builder (new BaseInstanceProps$Builder) id config))


(defn build-base-namespace-props-builder
  "The build-base-namespace-props-builder function updates a BaseNamespaceProps$Builder instance using the provided configuration.
  The function takes the BaseNamespaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^BaseNamespaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn base-namespace-props-builder
  "Creates a  `BaseNamespaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-base-namespace-props-builder (new BaseNamespaceProps$Builder) id config))


(defn build-base-service-props-builder
  "The build-base-service-props-builder function updates a BaseServiceProps$Builder instance using the provided configuration.
  The function takes the BaseServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customHealthCheck` | software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig | [[cdk.support/lookup-entry]] | `:custom-health-check` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `healthCheck` | software.amazon.awscdk.services.servicediscovery.HealthCheckConfig | [[cdk.support/lookup-entry]] | `:health-check` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^BaseServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-health-check)]
    (. builder customHealthCheck data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn base-service-props-builder
  "Creates a  `BaseServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-base-service-props-builder (new BaseServiceProps$Builder) id config))


(defn build-cfn-http-namespace-builder
  "The build-cfn-http-namespace-builder function updates a CfnHttpNamespace$Builder instance using the provided configuration.
  The function takes the CfnHttpNamespace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnHttpNamespace$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-http-namespace-builder
  "Creates a  `CfnHttpNamespace$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-http-namespace-builder (CfnHttpNamespace$Builder/create scope (name id)) id config))


(defn build-cfn-http-namespace-props-builder
  "The build-cfn-http-namespace-props-builder function updates a CfnHttpNamespaceProps$Builder instance using the provided configuration.
  The function takes the CfnHttpNamespaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnHttpNamespaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-http-namespace-props-builder
  "Creates a  `CfnHttpNamespaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-http-namespace-props-builder (new CfnHttpNamespaceProps$Builder) id config))


(defn build-cfn-instance-builder
  "The build-cfn-instance-builder function updates a CfnInstance$Builder instance using the provided configuration.
  The function takes the CfnInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceAttributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:instance-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `serviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-id` |
"
  [^CfnInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-attributes)]
    (. builder instanceAttributes data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :service-id)]
    (. builder serviceId data))
  (.build builder))


(defn cfn-instance-builder
  "Creates a  `CfnInstance$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-instance-builder (CfnInstance$Builder/create scope (name id)) id config))


(defn build-cfn-instance-props-builder
  "The build-cfn-instance-props-builder function updates a CfnInstanceProps$Builder instance using the provided configuration.
  The function takes the CfnInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceAttributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:instance-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `serviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-id` |
"
  [^CfnInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :instance-attributes)]
    (. builder instanceAttributes data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :service-id)]
    (. builder serviceId data))
  (.build builder))


(defn cfn-instance-props-builder
  "Creates a  `CfnInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-instance-props-builder (new CfnInstanceProps$Builder) id config))


(defn build-cfn-private-dns-namespace-builder
  "The build-cfn-private-dns-namespace-builder function updates a CfnPrivateDnsNamespace$Builder instance using the provided configuration.
  The function takes the CfnPrivateDnsNamespace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `properties` | software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace$PropertiesProperty | [[cdk.support/lookup-entry]] | `:properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpc` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CfnPrivateDnsNamespace$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn cfn-private-dns-namespace-builder
  "Creates a  `CfnPrivateDnsNamespace$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-private-dns-namespace-builder (CfnPrivateDnsNamespace$Builder/create scope (name id)) id config))


(defn build-cfn-private-dns-namespace-private-dns-properties-mutable-property-builder
  "The build-cfn-private-dns-namespace-private-dns-properties-mutable-property-builder function updates a CfnPrivateDnsNamespace$PrivateDnsPropertiesMutableProperty$Builder instance using the provided configuration.
  The function takes the CfnPrivateDnsNamespace$PrivateDnsPropertiesMutableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `soa` | software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace$SOAProperty | [[cdk.support/lookup-entry]] | `:soa` |
"
  [^CfnPrivateDnsNamespace$PrivateDnsPropertiesMutableProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :soa)]
    (. builder soa data))
  (.build builder))


(defn cfn-private-dns-namespace-private-dns-properties-mutable-property-builder
  "Creates a  `CfnPrivateDnsNamespace$PrivateDnsPropertiesMutableProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-private-dns-namespace-private-dns-properties-mutable-property-builder (new CfnPrivateDnsNamespace$PrivateDnsPropertiesMutableProperty$Builder) id config))


(defn build-cfn-private-dns-namespace-properties-property-builder
  "The build-cfn-private-dns-namespace-properties-property-builder function updates a CfnPrivateDnsNamespace$PropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnPrivateDnsNamespace$PropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-properties` |
"
  [^CfnPrivateDnsNamespace$PropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dns-properties)]
    (. builder dnsProperties data))
  (.build builder))


(defn cfn-private-dns-namespace-properties-property-builder
  "Creates a  `CfnPrivateDnsNamespace$PropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-private-dns-namespace-properties-property-builder (new CfnPrivateDnsNamespace$PropertiesProperty$Builder) id config))


(defn build-cfn-private-dns-namespace-props-builder
  "The build-cfn-private-dns-namespace-props-builder function updates a CfnPrivateDnsNamespaceProps$Builder instance using the provided configuration.
  The function takes the CfnPrivateDnsNamespaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `properties` | software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace$PropertiesProperty | [[cdk.support/lookup-entry]] | `:properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpc` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^CfnPrivateDnsNamespaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn cfn-private-dns-namespace-props-builder
  "Creates a  `CfnPrivateDnsNamespaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-private-dns-namespace-props-builder (new CfnPrivateDnsNamespaceProps$Builder) id config))


(defn build-cfn-private-dns-namespace-soa-property-builder
  "The build-cfn-private-dns-namespace-soa-property-builder function updates a CfnPrivateDnsNamespace$SOAProperty$Builder instance using the provided configuration.
  The function takes the CfnPrivateDnsNamespace$SOAProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |
"
  [^CfnPrivateDnsNamespace$SOAProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (.build builder))


(defn cfn-private-dns-namespace-soa-property-builder
  "Creates a  `CfnPrivateDnsNamespace$SOAProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-private-dns-namespace-soa-property-builder (new CfnPrivateDnsNamespace$SOAProperty$Builder) id config))


(defn build-cfn-public-dns-namespace-builder
  "The build-cfn-public-dns-namespace-builder function updates a CfnPublicDnsNamespace$Builder instance using the provided configuration.
  The function takes the CfnPublicDnsNamespace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `properties` | software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace$PropertiesProperty | [[cdk.support/lookup-entry]] | `:properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPublicDnsNamespace$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-public-dns-namespace-builder
  "Creates a  `CfnPublicDnsNamespace$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-public-dns-namespace-builder (CfnPublicDnsNamespace$Builder/create scope (name id)) id config))


(defn build-cfn-public-dns-namespace-properties-property-builder
  "The build-cfn-public-dns-namespace-properties-property-builder function updates a CfnPublicDnsNamespace$PropertiesProperty$Builder instance using the provided configuration.
  The function takes the CfnPublicDnsNamespace$PropertiesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-properties` |
"
  [^CfnPublicDnsNamespace$PropertiesProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dns-properties)]
    (. builder dnsProperties data))
  (.build builder))


(defn cfn-public-dns-namespace-properties-property-builder
  "Creates a  `CfnPublicDnsNamespace$PropertiesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-public-dns-namespace-properties-property-builder (new CfnPublicDnsNamespace$PropertiesProperty$Builder) id config))


(defn build-cfn-public-dns-namespace-props-builder
  "The build-cfn-public-dns-namespace-props-builder function updates a CfnPublicDnsNamespaceProps$Builder instance using the provided configuration.
  The function takes the CfnPublicDnsNamespaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `properties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
"
  [^CfnPublicDnsNamespaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :properties)]
    (. builder properties data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (.build builder))


(defn cfn-public-dns-namespace-props-builder
  "Creates a  `CfnPublicDnsNamespaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-public-dns-namespace-props-builder (new CfnPublicDnsNamespaceProps$Builder) id config))


(defn build-cfn-public-dns-namespace-public-dns-properties-mutable-property-builder
  "The build-cfn-public-dns-namespace-public-dns-properties-mutable-property-builder function updates a CfnPublicDnsNamespace$PublicDnsPropertiesMutableProperty$Builder instance using the provided configuration.
  The function takes the CfnPublicDnsNamespace$PublicDnsPropertiesMutableProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `soa` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:soa` |
"
  [^CfnPublicDnsNamespace$PublicDnsPropertiesMutableProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :soa)]
    (. builder soa data))
  (.build builder))


(defn cfn-public-dns-namespace-public-dns-properties-mutable-property-builder
  "Creates a  `CfnPublicDnsNamespace$PublicDnsPropertiesMutableProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-public-dns-namespace-public-dns-properties-mutable-property-builder (new CfnPublicDnsNamespace$PublicDnsPropertiesMutableProperty$Builder) id config))


(defn build-cfn-public-dns-namespace-soa-property-builder
  "The build-cfn-public-dns-namespace-soa-property-builder function updates a CfnPublicDnsNamespace$SOAProperty$Builder instance using the provided configuration.
  The function takes the CfnPublicDnsNamespace$SOAProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |
"
  [^CfnPublicDnsNamespace$SOAProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (.build builder))


(defn cfn-public-dns-namespace-soa-property-builder
  "Creates a  `CfnPublicDnsNamespace$SOAProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-public-dns-namespace-soa-property-builder (new CfnPublicDnsNamespace$SOAProperty$Builder) id config))


(defn build-cfn-service-builder
  "The build-cfn-service-builder function updates a CfnService$Builder instance using the provided configuration.
  The function takes the CfnService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dnsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-config` |
| `healthCheckConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-config` |
| `healthCheckCustomConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-custom-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnService$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :dns-config)]
    (. builder dnsConfig data))
  (when-some [data (lookup-entry config id :health-check-config)]
    (. builder healthCheckConfig data))
  (when-some [data (lookup-entry config id :health-check-custom-config)]
    (. builder healthCheckCustomConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :namespace-id)]
    (. builder namespaceId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-service-builder
  "Creates a  `CfnService$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-service-builder (CfnService$Builder/create scope (name id)) id config))


(defn build-cfn-service-dns-config-property-builder
  "The build-cfn-service-dns-config-property-builder function updates a CfnService$DnsConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnService$DnsConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsRecords` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-records` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `routingPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:routing-policy` |
"
  [^CfnService$DnsConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :dns-records)]
    (. builder dnsRecords data))
  (when-some [data (lookup-entry config id :namespace-id)]
    (. builder namespaceId data))
  (when-some [data (lookup-entry config id :routing-policy)]
    (. builder routingPolicy data))
  (.build builder))


(defn cfn-service-dns-config-property-builder
  "Creates a  `CfnService$DnsConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-service-dns-config-property-builder (new CfnService$DnsConfigProperty$Builder) id config))


(defn build-cfn-service-dns-record-property-builder
  "The build-cfn-service-dns-record-property-builder function updates a CfnService$DnsRecordProperty$Builder instance using the provided configuration.
  The function takes the CfnService$DnsRecordProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnService$DnsRecordProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-service-dns-record-property-builder
  "Creates a  `CfnService$DnsRecordProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-service-dns-record-property-builder (new CfnService$DnsRecordProperty$Builder) id config))


(defn build-cfn-service-health-check-config-property-builder
  "The build-cfn-service-health-check-config-property-builder function updates a CfnService$HealthCheckConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnService$HealthCheckConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-threshold` |
| `resourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-path` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnService$HealthCheckConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :failure-threshold)]
    (. builder failureThreshold data))
  (when-some [data (lookup-entry config id :resource-path)]
    (. builder resourcePath data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-service-health-check-config-property-builder
  "Creates a  `CfnService$HealthCheckConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-service-health-check-config-property-builder (new CfnService$HealthCheckConfigProperty$Builder) id config))


(defn build-cfn-service-health-check-custom-config-property-builder
  "The build-cfn-service-health-check-custom-config-property-builder function updates a CfnService$HealthCheckCustomConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnService$HealthCheckCustomConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-threshold` |
"
  [^CfnService$HealthCheckCustomConfigProperty$Builder builder id config]
  (when-some [data (lookup-entry config id :failure-threshold)]
    (. builder failureThreshold data))
  (.build builder))


(defn cfn-service-health-check-custom-config-property-builder
  "Creates a  `CfnService$HealthCheckCustomConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-service-health-check-custom-config-property-builder (new CfnService$HealthCheckCustomConfigProperty$Builder) id config))


(defn build-cfn-service-props-builder
  "The build-cfn-service-props-builder function updates a CfnServiceProps$Builder instance using the provided configuration.
  The function takes the CfnServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dnsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-config` |
| `healthCheckConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-config` |
| `healthCheckCustomConfig` | software.amazon.awscdk.services.servicediscovery.CfnService$HealthCheckCustomConfigProperty | [[cdk.support/lookup-entry]] | `:health-check-custom-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :dns-config)]
    (. builder dnsConfig data))
  (when-some [data (lookup-entry config id :health-check-config)]
    (. builder healthCheckConfig data))
  (when-some [data (lookup-entry config id :health-check-custom-config)]
    (. builder healthCheckCustomConfig data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :namespace-id)]
    (. builder namespaceId data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-service-props-builder
  "Creates a  `CfnServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-service-props-builder (new CfnServiceProps$Builder) id config))


(defn build-cname-instance-base-props-builder
  "The build-cname-instance-base-props-builder function updates a CnameInstanceBaseProps$Builder instance using the provided configuration.
  The function takes the CnameInstanceBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceCname` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-cname` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
"
  [^CnameInstanceBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :instance-cname)]
    (. builder instanceCname data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (.build builder))


(defn cname-instance-base-props-builder
  "Creates a  `CnameInstanceBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cname-instance-base-props-builder (new CnameInstanceBaseProps$Builder) id config))


(defn build-cname-instance-builder
  "The build-cname-instance-builder function updates a CnameInstance$Builder instance using the provided configuration.
  The function takes the CnameInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceCname` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-cname` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |
"
  [^CnameInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :instance-cname)]
    (. builder instanceCname data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn cname-instance-builder
  "Creates a  `CnameInstance$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cname-instance-builder (CnameInstance$Builder/create scope (name id)) id config))


(defn build-cname-instance-props-builder
  "The build-cname-instance-props-builder function updates a CnameInstanceProps$Builder instance using the provided configuration.
  The function takes the CnameInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceCname` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-cname` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |
"
  [^CnameInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :instance-cname)]
    (. builder instanceCname data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn cname-instance-props-builder
  "Creates a  `CnameInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cname-instance-props-builder (new CnameInstanceProps$Builder) id config))


(defn build-dns-service-props-builder
  "The build-dns-service-props-builder function updates a DnsServiceProps$Builder instance using the provided configuration.
  The function takes the DnsServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customHealthCheck` | software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig | [[cdk.support/lookup-entry]] | `:custom-health-check` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `discoveryType` | software.amazon.awscdk.services.servicediscovery.DiscoveryType | [[cdk.api.services.servicediscovery/discovery-type]] | `:discovery-type` |
| `dnsRecordType` | software.amazon.awscdk.services.servicediscovery.DnsRecordType | [[cdk.api.services.servicediscovery/dns-record-type]] | `:dns-record-type` |
| `dnsTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:dns-ttl` |
| `healthCheck` | software.amazon.awscdk.services.servicediscovery.HealthCheckConfig | [[cdk.support/lookup-entry]] | `:health-check` |
| `loadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `routingPolicy` | software.amazon.awscdk.services.servicediscovery.RoutingPolicy | [[cdk.api.services.servicediscovery/routing-policy]] | `:routing-policy` |
"
  [^DnsServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-health-check)]
    (. builder customHealthCheck data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (discovery-type config id :discovery-type)]
    (. builder discoveryType data))
  (when-some [data (dns-record-type config id :dns-record-type)]
    (. builder dnsRecordType data))
  (when-some [data (lookup-entry config id :dns-ttl)]
    (. builder dnsTtl data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (routing-policy config id :routing-policy)]
    (. builder routingPolicy data))
  (.build builder))


(defn dns-service-props-builder
  "Creates a  `DnsServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-dns-service-props-builder (new DnsServiceProps$Builder) id config))


(defn build-health-check-config-builder
  "The build-health-check-config-builder function updates a HealthCheckConfig$Builder instance using the provided configuration.
  The function takes the HealthCheckConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-threshold` |
| `resourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-path` |
| `type` | software.amazon.awscdk.services.servicediscovery.HealthCheckType | [[cdk.api.services.servicediscovery/health-check-type]] | `:type` |
"
  [^HealthCheckConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :failure-threshold)]
    (. builder failureThreshold data))
  (when-some [data (lookup-entry config id :resource-path)]
    (. builder resourcePath data))
  (when-some [data (health-check-type config id :type)]
    (. builder type data))
  (.build builder))


(defn health-check-config-builder
  "Creates a  `HealthCheckConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-health-check-config-builder (new HealthCheckConfig$Builder) id config))


(defn build-health-check-custom-config-builder
  "The build-health-check-custom-config-builder function updates a HealthCheckCustomConfig$Builder instance using the provided configuration.
  The function takes the HealthCheckCustomConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-threshold` |
"
  [^HealthCheckCustomConfig$Builder builder id config]
  (when-some [data (lookup-entry config id :failure-threshold)]
    (. builder failureThreshold data))
  (.build builder))


(defn health-check-custom-config-builder
  "Creates a  `HealthCheckCustomConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-health-check-custom-config-builder (new HealthCheckCustomConfig$Builder) id config))


(defn build-http-namespace-attributes-builder
  "The build-http-namespace-attributes-builder function updates a HttpNamespaceAttributes$Builder instance using the provided configuration.
  The function takes the HttpNamespaceAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespaceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-arn` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |
"
  [^HttpNamespaceAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :namespace-arn)]
    (. builder namespaceArn data))
  (when-some [data (lookup-entry config id :namespace-id)]
    (. builder namespaceId data))
  (when-some [data (lookup-entry config id :namespace-name)]
    (. builder namespaceName data))
  (.build builder))


(defn http-namespace-attributes-builder
  "Creates a  `HttpNamespaceAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-http-namespace-attributes-builder (new HttpNamespaceAttributes$Builder) id config))


(defn build-http-namespace-builder
  "The build-http-namespace-builder function updates a HttpNamespace$Builder instance using the provided configuration.
  The function takes the HttpNamespace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^HttpNamespace$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn http-namespace-builder
  "Creates a  `HttpNamespace$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-http-namespace-builder (HttpNamespace$Builder/create scope (name id)) id config))


(defn build-http-namespace-props-builder
  "The build-http-namespace-props-builder function updates a HttpNamespaceProps$Builder instance using the provided configuration.
  The function takes the HttpNamespaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^HttpNamespaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn http-namespace-props-builder
  "Creates a  `HttpNamespaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-http-namespace-props-builder (new HttpNamespaceProps$Builder) id config))


(defn build-ip-instance-base-props-builder
  "The build-ip-instance-base-props-builder function updates a IpInstanceBaseProps$Builder instance using the provided configuration.
  The function takes the IpInstanceBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `ipv4` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4` |
| `ipv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^IpInstanceBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :ipv4)]
    (. builder ipv4 data))
  (when-some [data (lookup-entry config id :ipv6)]
    (. builder ipv6 data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn ip-instance-base-props-builder
  "Creates a  `IpInstanceBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ip-instance-base-props-builder (new IpInstanceBaseProps$Builder) id config))


(defn build-ip-instance-builder
  "The build-ip-instance-builder function updates a IpInstance$Builder instance using the provided configuration.
  The function takes the IpInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `ipv4` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4` |
| `ipv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |
"
  [^IpInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :ipv4)]
    (. builder ipv4 data))
  (when-some [data (lookup-entry config id :ipv6)]
    (. builder ipv6 data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn ip-instance-builder
  "Creates a  `IpInstance$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-ip-instance-builder (IpInstance$Builder/create scope (name id)) id config))


(defn build-ip-instance-props-builder
  "The build-ip-instance-props-builder function updates a IpInstanceProps$Builder instance using the provided configuration.
  The function takes the IpInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `ipv4` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4` |
| `ipv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |
"
  [^IpInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :ipv4)]
    (. builder ipv4 data))
  (when-some [data (lookup-entry config id :ipv6)]
    (. builder ipv6 data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn ip-instance-props-builder
  "Creates a  `IpInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ip-instance-props-builder (new IpInstanceProps$Builder) id config))


(defn build-non-ip-instance-base-props-builder
  "The build-non-ip-instance-base-props-builder function updates a NonIpInstanceBaseProps$Builder instance using the provided configuration.
  The function takes the NonIpInstanceBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
"
  [^NonIpInstanceBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (.build builder))


(defn non-ip-instance-base-props-builder
  "Creates a  `NonIpInstanceBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-non-ip-instance-base-props-builder (new NonIpInstanceBaseProps$Builder) id config))


(defn build-non-ip-instance-builder
  "The build-non-ip-instance-builder function updates a NonIpInstance$Builder instance using the provided configuration.
  The function takes the NonIpInstance$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |
"
  [^NonIpInstance$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn non-ip-instance-builder
  "Creates a  `NonIpInstance$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-non-ip-instance-builder (NonIpInstance$Builder/create scope (name id)) id config))


(defn build-non-ip-instance-props-builder
  "The build-non-ip-instance-props-builder function updates a NonIpInstanceProps$Builder instance using the provided configuration.
  The function takes the NonIpInstanceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |
"
  [^NonIpInstanceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-attributes)]
    (. builder customAttributes data))
  (when-some [data (lookup-entry config id :instance-id)]
    (. builder instanceId data))
  (when-some [data (lookup-entry config id :service)]
    (. builder service data))
  (.build builder))


(defn non-ip-instance-props-builder
  "Creates a  `NonIpInstanceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-non-ip-instance-props-builder (new NonIpInstanceProps$Builder) id config))


(defn build-private-dns-namespace-attributes-builder
  "The build-private-dns-namespace-attributes-builder function updates a PrivateDnsNamespaceAttributes$Builder instance using the provided configuration.
  The function takes the PrivateDnsNamespaceAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespaceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-arn` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |
"
  [^PrivateDnsNamespaceAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :namespace-arn)]
    (. builder namespaceArn data))
  (when-some [data (lookup-entry config id :namespace-id)]
    (. builder namespaceId data))
  (when-some [data (lookup-entry config id :namespace-name)]
    (. builder namespaceName data))
  (.build builder))


(defn private-dns-namespace-attributes-builder
  "Creates a  `PrivateDnsNamespaceAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-private-dns-namespace-attributes-builder (new PrivateDnsNamespaceAttributes$Builder) id config))


(defn build-private-dns-namespace-builder
  "The build-private-dns-namespace-builder function updates a PrivateDnsNamespace$Builder instance using the provided configuration.
  The function takes the PrivateDnsNamespace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^PrivateDnsNamespace$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn private-dns-namespace-builder
  "Creates a  `PrivateDnsNamespace$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-private-dns-namespace-builder (PrivateDnsNamespace$Builder/create scope (name id)) id config))


(defn build-private-dns-namespace-props-builder
  "The build-private-dns-namespace-props-builder function updates a PrivateDnsNamespaceProps$Builder instance using the provided configuration.
  The function takes the PrivateDnsNamespaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^PrivateDnsNamespaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn private-dns-namespace-props-builder
  "Creates a  `PrivateDnsNamespaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-private-dns-namespace-props-builder (new PrivateDnsNamespaceProps$Builder) id config))


(defn build-public-dns-namespace-attributes-builder
  "The build-public-dns-namespace-attributes-builder function updates a PublicDnsNamespaceAttributes$Builder instance using the provided configuration.
  The function takes the PublicDnsNamespaceAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespaceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-arn` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |
"
  [^PublicDnsNamespaceAttributes$Builder builder id config]
  (when-some [data (lookup-entry config id :namespace-arn)]
    (. builder namespaceArn data))
  (when-some [data (lookup-entry config id :namespace-id)]
    (. builder namespaceId data))
  (when-some [data (lookup-entry config id :namespace-name)]
    (. builder namespaceName data))
  (.build builder))


(defn public-dns-namespace-attributes-builder
  "Creates a  `PublicDnsNamespaceAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-public-dns-namespace-attributes-builder (new PublicDnsNamespaceAttributes$Builder) id config))


(defn build-public-dns-namespace-builder
  "The build-public-dns-namespace-builder function updates a PublicDnsNamespace$Builder instance using the provided configuration.
  The function takes the PublicDnsNamespace$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^PublicDnsNamespace$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn public-dns-namespace-builder
  "Creates a  `PublicDnsNamespace$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-public-dns-namespace-builder (PublicDnsNamespace$Builder/create scope (name id)) id config))


(defn build-public-dns-namespace-props-builder
  "The build-public-dns-namespace-props-builder function updates a PublicDnsNamespaceProps$Builder instance using the provided configuration.
  The function takes the PublicDnsNamespaceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^PublicDnsNamespaceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn public-dns-namespace-props-builder
  "Creates a  `PublicDnsNamespaceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-public-dns-namespace-props-builder (new PublicDnsNamespaceProps$Builder) id config))


(defn build-service-attributes-builder
  "The build-service-attributes-builder function updates a ServiceAttributes$Builder instance using the provided configuration.
  The function takes the ServiceAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `discoveryType` | software.amazon.awscdk.services.servicediscovery.DiscoveryType | [[cdk.api.services.servicediscovery/discovery-type]] | `:discovery-type` |
| `dnsRecordType` | software.amazon.awscdk.services.servicediscovery.DnsRecordType | [[cdk.api.services.servicediscovery/dns-record-type]] | `:dns-record-type` |
| `namespace` | software.amazon.awscdk.services.servicediscovery.INamespace | [[cdk.support/lookup-entry]] | `:namespace` |
| `routingPolicy` | software.amazon.awscdk.services.servicediscovery.RoutingPolicy | [[cdk.api.services.servicediscovery/routing-policy]] | `:routing-policy` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `serviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-id` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
"
  [^ServiceAttributes$Builder builder id config]
  (when-some [data (discovery-type config id :discovery-type)]
    (. builder discoveryType data))
  (when-some [data (dns-record-type config id :dns-record-type)]
    (. builder dnsRecordType data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (routing-policy config id :routing-policy)]
    (. builder routingPolicy data))
  (when-some [data (lookup-entry config id :service-arn)]
    (. builder serviceArn data))
  (when-some [data (lookup-entry config id :service-id)]
    (. builder serviceId data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (.build builder))


(defn service-attributes-builder
  "Creates a  `ServiceAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-service-attributes-builder (new ServiceAttributes$Builder) id config))


(defn build-service-builder
  "The build-service-builder function updates a Service$Builder instance using the provided configuration.
  The function takes the Service$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customHealthCheck` | software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig | [[cdk.support/lookup-entry]] | `:custom-health-check` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `discoveryType` | software.amazon.awscdk.services.servicediscovery.DiscoveryType | [[cdk.api.services.servicediscovery/discovery-type]] | `:discovery-type` |
| `dnsRecordType` | software.amazon.awscdk.services.servicediscovery.DnsRecordType | [[cdk.api.services.servicediscovery/dns-record-type]] | `:dns-record-type` |
| `dnsTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:dns-ttl` |
| `healthCheck` | software.amazon.awscdk.services.servicediscovery.HealthCheckConfig | [[cdk.support/lookup-entry]] | `:health-check` |
| `loadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | software.amazon.awscdk.services.servicediscovery.INamespace | [[cdk.support/lookup-entry]] | `:namespace` |
| `routingPolicy` | software.amazon.awscdk.services.servicediscovery.RoutingPolicy | [[cdk.api.services.servicediscovery/routing-policy]] | `:routing-policy` |
"
  [^Service$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-health-check)]
    (. builder customHealthCheck data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (discovery-type config id :discovery-type)]
    (. builder discoveryType data))
  (when-some [data (dns-record-type config id :dns-record-type)]
    (. builder dnsRecordType data))
  (when-some [data (lookup-entry config id :dns-ttl)]
    (. builder dnsTtl data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (routing-policy config id :routing-policy)]
    (. builder routingPolicy data))
  (.build builder))


(defn service-builder
  "Creates a  `Service$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-service-builder (Service$Builder/create scope (name id)) id config))


(defn build-service-props-builder
  "The build-service-props-builder function updates a ServiceProps$Builder instance using the provided configuration.
  The function takes the ServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customHealthCheck` | software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig | [[cdk.support/lookup-entry]] | `:custom-health-check` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `discoveryType` | software.amazon.awscdk.services.servicediscovery.DiscoveryType | [[cdk.api.services.servicediscovery/discovery-type]] | `:discovery-type` |
| `dnsRecordType` | software.amazon.awscdk.services.servicediscovery.DnsRecordType | [[cdk.api.services.servicediscovery/dns-record-type]] | `:dns-record-type` |
| `dnsTtl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:dns-ttl` |
| `healthCheck` | software.amazon.awscdk.services.servicediscovery.HealthCheckConfig | [[cdk.support/lookup-entry]] | `:health-check` |
| `loadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespace` | software.amazon.awscdk.services.servicediscovery.INamespace | [[cdk.support/lookup-entry]] | `:namespace` |
| `routingPolicy` | software.amazon.awscdk.services.servicediscovery.RoutingPolicy | [[cdk.api.services.servicediscovery/routing-policy]] | `:routing-policy` |
"
  [^ServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :custom-health-check)]
    (. builder customHealthCheck data))
  (when-some [data (lookup-entry config id :description)]
    (. builder description data))
  (when-some [data (discovery-type config id :discovery-type)]
    (. builder discoveryType data))
  (when-some [data (dns-record-type config id :dns-record-type)]
    (. builder dnsRecordType data))
  (when-some [data (lookup-entry config id :dns-ttl)]
    (. builder dnsTtl data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :namespace)]
    (. builder namespace data))
  (when-some [data (routing-policy config id :routing-policy)]
    (. builder routingPolicy data))
  (.build builder))


(defn service-props-builder
  "Creates a  `ServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-service-props-builder (new ServiceProps$Builder) id config))