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


(defn alias-target-instance-builder
  "The alias-target-instance-builder function buildes out new instances of 
AliasTargetInstance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (AliasTargetInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn alias-target-instance-props-builder
  "The alias-target-instance-props-builder function buildes out new instances of 
AliasTargetInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (AliasTargetInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn base-instance-props-builder
  "The base-instance-props-builder function buildes out new instances of 
BaseInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |"
  [stack id config]
  (let [builder (BaseInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (.build builder)))


(defn base-namespace-props-builder
  "The base-namespace-props-builder function buildes out new instances of 
BaseNamespaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (BaseNamespaceProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn base-service-props-builder
  "The base-service-props-builder function buildes out new instances of 
BaseServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customHealthCheck` | software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig | [[cdk.support/lookup-entry]] | `:custom-health-check` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `healthCheck` | software.amazon.awscdk.services.servicediscovery.HealthCheckConfig | [[cdk.support/lookup-entry]] | `:health-check` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (BaseServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-health-check)]
      (. builder customHealthCheck data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-http-namespace-builder
  "The cfn-http-namespace-builder function buildes out new instances of 
CfnHttpNamespace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnHttpNamespace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-http-namespace-props-builder
  "The cfn-http-namespace-props-builder function buildes out new instances of 
CfnHttpNamespaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnHttpNamespaceProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-instance-builder
  "The cfn-instance-builder function buildes out new instances of 
CfnInstance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceAttributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:instance-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `serviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-id` |"
  [stack id config]
  (let [builder (CfnInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :instance-attributes)]
      (. builder instanceAttributes data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :service-id)]
      (. builder serviceId data))
    (.build builder)))


(defn cfn-instance-props-builder
  "The cfn-instance-props-builder function buildes out new instances of 
CfnInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instanceAttributes` | java.lang.Object | [[cdk.support/lookup-entry]] | `:instance-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `serviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-id` |"
  [stack id config]
  (let [builder (CfnInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :instance-attributes)]
      (. builder instanceAttributes data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :service-id)]
      (. builder serviceId data))
    (.build builder)))


(defn cfn-private-dns-namespace-builder
  "The cfn-private-dns-namespace-builder function buildes out new instances of 
CfnPrivateDnsNamespace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `properties` | software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace$PropertiesProperty | [[cdk.support/lookup-entry]] | `:properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpc` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (CfnPrivateDnsNamespace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn cfn-private-dns-namespace-private-dns-properties-mutable-property-builder
  "The cfn-private-dns-namespace-private-dns-properties-mutable-property-builder function buildes out new instances of 
CfnPrivateDnsNamespace$PrivateDnsPropertiesMutableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `soa` | software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace$SOAProperty | [[cdk.support/lookup-entry]] | `:soa` |"
  [stack id config]
  (let [builder (CfnPrivateDnsNamespace$PrivateDnsPropertiesMutableProperty$Builder.)]
    (when-let [data (lookup-entry config id :soa)]
      (. builder soa data))
    (.build builder)))


(defn cfn-private-dns-namespace-properties-property-builder
  "The cfn-private-dns-namespace-properties-property-builder function buildes out new instances of 
CfnPrivateDnsNamespace$PropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-properties` |"
  [stack id config]
  (let [builder (CfnPrivateDnsNamespace$PropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :dns-properties)]
      (. builder dnsProperties data))
    (.build builder)))


(defn cfn-private-dns-namespace-props-builder
  "The cfn-private-dns-namespace-props-builder function buildes out new instances of 
CfnPrivateDnsNamespaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `properties` | software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace$PropertiesProperty | [[cdk.support/lookup-entry]] | `:properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpc` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (CfnPrivateDnsNamespaceProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn cfn-private-dns-namespace-soa-property-builder
  "The cfn-private-dns-namespace-soa-property-builder function buildes out new instances of 
CfnPrivateDnsNamespace$SOAProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |"
  [stack id config]
  (let [builder (CfnPrivateDnsNamespace$SOAProperty$Builder.)]
    (when-let [data (lookup-entry config id :ttl)]
      (. builder ttl data))
    (.build builder)))


(defn cfn-public-dns-namespace-builder
  "The cfn-public-dns-namespace-builder function buildes out new instances of 
CfnPublicDnsNamespace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `properties` | software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace$PropertiesProperty | [[cdk.support/lookup-entry]] | `:properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPublicDnsNamespace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-public-dns-namespace-properties-property-builder
  "The cfn-public-dns-namespace-properties-property-builder function buildes out new instances of 
CfnPublicDnsNamespace$PropertiesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsProperties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-properties` |"
  [stack id config]
  (let [builder (CfnPublicDnsNamespace$PropertiesProperty$Builder.)]
    (when-let [data (lookup-entry config id :dns-properties)]
      (. builder dnsProperties data))
    (.build builder)))


(defn cfn-public-dns-namespace-props-builder
  "The cfn-public-dns-namespace-props-builder function buildes out new instances of 
CfnPublicDnsNamespaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `properties` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:properties` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnPublicDnsNamespaceProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :properties)]
      (. builder properties data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-public-dns-namespace-public-dns-properties-mutable-property-builder
  "The cfn-public-dns-namespace-public-dns-properties-mutable-property-builder function buildes out new instances of 
CfnPublicDnsNamespace$PublicDnsPropertiesMutableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `soa` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:soa` |"
  [stack id config]
  (let [builder (CfnPublicDnsNamespace$PublicDnsPropertiesMutableProperty$Builder.)]
    (when-let [data (lookup-entry config id :soa)]
      (. builder soa data))
    (.build builder)))


(defn cfn-public-dns-namespace-soa-property-builder
  "The cfn-public-dns-namespace-soa-property-builder function buildes out new instances of 
CfnPublicDnsNamespace$SOAProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |"
  [stack id config]
  (let [builder (CfnPublicDnsNamespace$SOAProperty$Builder.)]
    (when-let [data (lookup-entry config id :ttl)]
      (. builder ttl data))
    (.build builder)))


(defn cfn-service-builder
  "The cfn-service-builder function buildes out new instances of 
CfnService$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dnsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-config` |
| `healthCheckConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-config` |
| `healthCheckCustomConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-custom-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dns-config)]
      (. builder dnsConfig data))
    (when-let [data (lookup-entry config id :health-check-config)]
      (. builder healthCheckConfig data))
    (when-let [data (lookup-entry config id :health-check-custom-config)]
      (. builder healthCheckCustomConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace-id)]
      (. builder namespaceId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-service-dns-config-property-builder
  "The cfn-service-dns-config-property-builder function buildes out new instances of 
CfnService$DnsConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsRecords` | java.util.List | [[cdk.support/lookup-entry]] | `:dns-records` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `routingPolicy` | java.lang.String | [[cdk.support/lookup-entry]] | `:routing-policy` |"
  [stack id config]
  (let [builder (CfnService$DnsConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :dns-records)]
      (. builder dnsRecords data))
    (when-let [data (lookup-entry config id :namespace-id)]
      (. builder namespaceId data))
    (when-let [data (lookup-entry config id :routing-policy)]
      (. builder routingPolicy data))
    (.build builder)))


(defn cfn-service-dns-record-property-builder
  "The cfn-service-dns-record-property-builder function buildes out new instances of 
CfnService$DnsRecordProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `ttl` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ttl` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnService$DnsRecordProperty$Builder.)]
    (when-let [data (lookup-entry config id :ttl)]
      (. builder ttl data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-service-health-check-config-property-builder
  "The cfn-service-health-check-config-property-builder function buildes out new instances of 
CfnService$HealthCheckConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-threshold` |
| `resourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-path` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnService$HealthCheckConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :failure-threshold)]
      (. builder failureThreshold data))
    (when-let [data (lookup-entry config id :resource-path)]
      (. builder resourcePath data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cfn-service-health-check-custom-config-property-builder
  "The cfn-service-health-check-custom-config-property-builder function buildes out new instances of 
CfnService$HealthCheckCustomConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-threshold` |"
  [stack id config]
  (let [builder (CfnService$HealthCheckCustomConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :failure-threshold)]
      (. builder failureThreshold data))
    (.build builder)))


(defn cfn-service-props-builder
  "The cfn-service-props-builder function buildes out new instances of 
CfnServiceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `dnsConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:dns-config` |
| `healthCheckConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-config` |
| `healthCheckCustomConfig` | software.amazon.awscdk.services.servicediscovery.CfnService$HealthCheckCustomConfigProperty | [[cdk.support/lookup-entry]] | `:health-check-custom-config` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :dns-config)]
      (. builder dnsConfig data))
    (when-let [data (lookup-entry config id :health-check-config)]
      (. builder healthCheckConfig data))
    (when-let [data (lookup-entry config id :health-check-custom-config)]
      (. builder healthCheckCustomConfig data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace-id)]
      (. builder namespaceId data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :type)]
      (. builder type data))
    (.build builder)))


(defn cname-instance-base-props-builder
  "The cname-instance-base-props-builder function buildes out new instances of 
CnameInstanceBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceCname` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-cname` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |"
  [stack id config]
  (let [builder (CnameInstanceBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :instance-cname)]
      (. builder instanceCname data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (.build builder)))


(defn cname-instance-builder
  "The cname-instance-builder function buildes out new instances of 
CnameInstance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceCname` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-cname` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (CnameInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :instance-cname)]
      (. builder instanceCname data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn cname-instance-props-builder
  "The cname-instance-props-builder function buildes out new instances of 
CnameInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceCname` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-cname` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (CnameInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :instance-cname)]
      (. builder instanceCname data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn dns-service-props-builder
  "The dns-service-props-builder function buildes out new instances of 
DnsServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `routingPolicy` | software.amazon.awscdk.services.servicediscovery.RoutingPolicy | [[cdk.api.services.servicediscovery/routing-policy]] | `:routing-policy` |"
  [stack id config]
  (let [builder (DnsServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-health-check)]
      (. builder customHealthCheck data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (discovery-type config id :discovery-type)]
      (. builder discoveryType data))
    (when-let [data (dns-record-type config id :dns-record-type)]
      (. builder dnsRecordType data))
    (when-let [data (lookup-entry config id :dns-ttl)]
      (. builder dnsTtl data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (routing-policy config id :routing-policy)]
      (. builder routingPolicy data))
    (.build builder)))


(defn health-check-config-builder
  "The health-check-config-builder function buildes out new instances of 
HealthCheckConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-threshold` |
| `resourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-path` |
| `type` | software.amazon.awscdk.services.servicediscovery.HealthCheckType | [[cdk.api.services.servicediscovery/health-check-type]] | `:type` |"
  [stack id config]
  (let [builder (HealthCheckConfig$Builder.)]
    (when-let [data (lookup-entry config id :failure-threshold)]
      (. builder failureThreshold data))
    (when-let [data (lookup-entry config id :resource-path)]
      (. builder resourcePath data))
    (when-let [data (health-check-type config id :type)]
      (. builder type data))
    (.build builder)))


(defn health-check-custom-config-builder
  "The health-check-custom-config-builder function buildes out new instances of 
HealthCheckCustomConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `failureThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-threshold` |"
  [stack id config]
  (let [builder (HealthCheckCustomConfig$Builder.)]
    (when-let [data (lookup-entry config id :failure-threshold)]
      (. builder failureThreshold data))
    (.build builder)))


(defn http-namespace-attributes-builder
  "The http-namespace-attributes-builder function buildes out new instances of 
HttpNamespaceAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespaceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-arn` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |"
  [stack id config]
  (let [builder (HttpNamespaceAttributes$Builder.)]
    (when-let [data (lookup-entry config id :namespace-arn)]
      (. builder namespaceArn data))
    (when-let [data (lookup-entry config id :namespace-id)]
      (. builder namespaceId data))
    (when-let [data (lookup-entry config id :namespace-name)]
      (. builder namespaceName data))
    (.build builder)))


(defn http-namespace-builder
  "The http-namespace-builder function buildes out new instances of 
HttpNamespace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (HttpNamespace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn http-namespace-props-builder
  "The http-namespace-props-builder function buildes out new instances of 
HttpNamespaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (HttpNamespaceProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn ip-instance-base-props-builder
  "The ip-instance-base-props-builder function buildes out new instances of 
IpInstanceBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `ipv4` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4` |
| `ipv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (IpInstanceBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :ipv4)]
      (. builder ipv4 data))
    (when-let [data (lookup-entry config id :ipv6)]
      (. builder ipv6 data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn ip-instance-builder
  "The ip-instance-builder function buildes out new instances of 
IpInstance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `ipv4` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4` |
| `ipv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (IpInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :ipv4)]
      (. builder ipv4 data))
    (when-let [data (lookup-entry config id :ipv6)]
      (. builder ipv6 data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn ip-instance-props-builder
  "The ip-instance-props-builder function buildes out new instances of 
IpInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `ipv4` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv4` |
| `ipv6` | java.lang.String | [[cdk.support/lookup-entry]] | `:ipv6` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (IpInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :ipv4)]
      (. builder ipv4 data))
    (when-let [data (lookup-entry config id :ipv6)]
      (. builder ipv6 data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn non-ip-instance-base-props-builder
  "The non-ip-instance-base-props-builder function buildes out new instances of 
NonIpInstanceBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |"
  [stack id config]
  (let [builder (NonIpInstanceBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (.build builder)))


(defn non-ip-instance-builder
  "The non-ip-instance-builder function buildes out new instances of 
NonIpInstance$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (NonIpInstance$Builder/create stack id)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn non-ip-instance-props-builder
  "The non-ip-instance-props-builder function buildes out new instances of 
NonIpInstanceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `customAttributes` | java.util.Map | [[cdk.support/lookup-entry]] | `:custom-attributes` |
| `instanceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-id` |
| `service` | software.amazon.awscdk.services.servicediscovery.IService | [[cdk.support/lookup-entry]] | `:service` |"
  [stack id config]
  (let [builder (NonIpInstanceProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-attributes)]
      (. builder customAttributes data))
    (when-let [data (lookup-entry config id :instance-id)]
      (. builder instanceId data))
    (when-let [data (lookup-entry config id :service)]
      (. builder service data))
    (.build builder)))


(defn private-dns-namespace-attributes-builder
  "The private-dns-namespace-attributes-builder function buildes out new instances of 
PrivateDnsNamespaceAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespaceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-arn` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |"
  [stack id config]
  (let [builder (PrivateDnsNamespaceAttributes$Builder.)]
    (when-let [data (lookup-entry config id :namespace-arn)]
      (. builder namespaceArn data))
    (when-let [data (lookup-entry config id :namespace-id)]
      (. builder namespaceId data))
    (when-let [data (lookup-entry config id :namespace-name)]
      (. builder namespaceName data))
    (.build builder)))


(defn private-dns-namespace-builder
  "The private-dns-namespace-builder function buildes out new instances of 
PrivateDnsNamespace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (PrivateDnsNamespace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn private-dns-namespace-props-builder
  "The private-dns-namespace-props-builder function buildes out new instances of 
PrivateDnsNamespaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (PrivateDnsNamespaceProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn public-dns-namespace-attributes-builder
  "The public-dns-namespace-attributes-builder function buildes out new instances of 
PublicDnsNamespaceAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `namespaceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-arn` |
| `namespaceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-id` |
| `namespaceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:namespace-name` |"
  [stack id config]
  (let [builder (PublicDnsNamespaceAttributes$Builder.)]
    (when-let [data (lookup-entry config id :namespace-arn)]
      (. builder namespaceArn data))
    (when-let [data (lookup-entry config id :namespace-id)]
      (. builder namespaceId data))
    (when-let [data (lookup-entry config id :namespace-name)]
      (. builder namespaceName data))
    (.build builder)))


(defn public-dns-namespace-builder
  "The public-dns-namespace-builder function buildes out new instances of 
PublicDnsNamespace$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (PublicDnsNamespace$Builder/create stack id)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn public-dns-namespace-props-builder
  "The public-dns-namespace-props-builder function buildes out new instances of 
PublicDnsNamespaceProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (PublicDnsNamespaceProps$Builder.)]
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn service-attributes-builder
  "The service-attributes-builder function buildes out new instances of 
ServiceAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `discoveryType` | software.amazon.awscdk.services.servicediscovery.DiscoveryType | [[cdk.api.services.servicediscovery/discovery-type]] | `:discovery-type` |
| `dnsRecordType` | software.amazon.awscdk.services.servicediscovery.DnsRecordType | [[cdk.api.services.servicediscovery/dns-record-type]] | `:dns-record-type` |
| `namespace` | software.amazon.awscdk.services.servicediscovery.INamespace | [[cdk.support/lookup-entry]] | `:namespace` |
| `routingPolicy` | software.amazon.awscdk.services.servicediscovery.RoutingPolicy | [[cdk.api.services.servicediscovery/routing-policy]] | `:routing-policy` |
| `serviceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-arn` |
| `serviceId` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-id` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |"
  [stack id config]
  (let [builder (ServiceAttributes$Builder.)]
    (when-let [data (discovery-type config id :discovery-type)]
      (. builder discoveryType data))
    (when-let [data (dns-record-type config id :dns-record-type)]
      (. builder dnsRecordType data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (routing-policy config id :routing-policy)]
      (. builder routingPolicy data))
    (when-let [data (lookup-entry config id :service-arn)]
      (. builder serviceArn data))
    (when-let [data (lookup-entry config id :service-id)]
      (. builder serviceId data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (.build builder)))


(defn service-builder
  "The service-builder function buildes out new instances of 
Service$Builder using the provided configuration.  Each field is set as follows:

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
| `routingPolicy` | software.amazon.awscdk.services.servicediscovery.RoutingPolicy | [[cdk.api.services.servicediscovery/routing-policy]] | `:routing-policy` |"
  [stack id config]
  (let [builder (Service$Builder/create stack id)]
    (when-let [data (lookup-entry config id :custom-health-check)]
      (. builder customHealthCheck data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (discovery-type config id :discovery-type)]
      (. builder discoveryType data))
    (when-let [data (dns-record-type config id :dns-record-type)]
      (. builder dnsRecordType data))
    (when-let [data (lookup-entry config id :dns-ttl)]
      (. builder dnsTtl data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (routing-policy config id :routing-policy)]
      (. builder routingPolicy data))
    (.build builder)))


(defn service-props-builder
  "The service-props-builder function buildes out new instances of 
ServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `routingPolicy` | software.amazon.awscdk.services.servicediscovery.RoutingPolicy | [[cdk.api.services.servicediscovery/routing-policy]] | `:routing-policy` |"
  [stack id config]
  (let [builder (ServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :custom-health-check)]
      (. builder customHealthCheck data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (discovery-type config id :discovery-type)]
      (. builder discoveryType data))
    (when-let [data (dns-record-type config id :dns-record-type)]
      (. builder dnsRecordType data))
    (when-let [data (lookup-entry config id :dns-ttl)]
      (. builder dnsTtl data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :namespace)]
      (. builder namespace data))
    (when-let [data (routing-policy config id :routing-policy)]
      (. builder routingPolicy data))
    (.build builder)))