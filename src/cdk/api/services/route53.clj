(ns cdk.api.services.route53
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.route53 package. "
  (:require [cdk.api :refer [removal-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.route53 ARecord$Builder
                                                    ARecordAttrs$Builder
                                                    ARecordProps$Builder
                                                    AaaaRecord$Builder
                                                    AaaaRecordProps$Builder
                                                    AliasRecordTargetConfig$Builder
                                                    CaaAmazonRecord$Builder
                                                    CaaAmazonRecordProps$Builder
                                                    CaaRecord$Builder
                                                    CaaRecordProps$Builder
                                                    CaaRecordValue$Builder
                                                    CaaTag
                                                    CfnCidrCollection$Builder
                                                    CfnCidrCollection$LocationProperty$Builder
                                                    CfnCidrCollectionProps$Builder
                                                    CfnDNSSEC$Builder
                                                    CfnDNSSECProps$Builder
                                                    CfnHealthCheck$AlarmIdentifierProperty$Builder
                                                    CfnHealthCheck$Builder
                                                    CfnHealthCheck$HealthCheckConfigProperty$Builder
                                                    CfnHealthCheck$HealthCheckTagProperty$Builder
                                                    CfnHealthCheckProps$Builder
                                                    CfnHostedZone$Builder
                                                    CfnHostedZone$HostedZoneConfigProperty$Builder
                                                    CfnHostedZone$HostedZoneTagProperty$Builder
                                                    CfnHostedZone$QueryLoggingConfigProperty$Builder
                                                    CfnHostedZone$VPCProperty$Builder
                                                    CfnHostedZoneProps$Builder
                                                    CfnKeySigningKey$Builder
                                                    CfnKeySigningKeyProps$Builder
                                                    CfnRecordSet$AliasTargetProperty$Builder
                                                    CfnRecordSet$Builder
                                                    CfnRecordSet$CidrRoutingConfigProperty$Builder
                                                    CfnRecordSet$CoordinatesProperty$Builder
                                                    CfnRecordSet$GeoLocationProperty$Builder
                                                    CfnRecordSet$GeoProximityLocationProperty$Builder
                                                    CfnRecordSetGroup$AliasTargetProperty$Builder
                                                    CfnRecordSetGroup$Builder
                                                    CfnRecordSetGroup$CidrRoutingConfigProperty$Builder
                                                    CfnRecordSetGroup$CoordinatesProperty$Builder
                                                    CfnRecordSetGroup$GeoLocationProperty$Builder
                                                    CfnRecordSetGroup$GeoProximityLocationProperty$Builder
                                                    CfnRecordSetGroup$RecordSetProperty$Builder
                                                    CfnRecordSetGroupProps$Builder
                                                    CfnRecordSetProps$Builder
                                                    CnameRecord$Builder
                                                    CnameRecordProps$Builder
                                                    CommonHostedZoneProps$Builder
                                                    Continent
                                                    CrossAccountZoneDelegationRecord$Builder
                                                    CrossAccountZoneDelegationRecordProps$Builder
                                                    DsRecord$Builder
                                                    DsRecordProps$Builder
                                                    HostedZone$Builder
                                                    HostedZoneAttributes$Builder
                                                    HostedZoneProps$Builder
                                                    HostedZoneProviderProps$Builder
                                                    KeySigningKey$Builder
                                                    KeySigningKeyAttributes$Builder
                                                    KeySigningKeyProps$Builder
                                                    KeySigningKeyStatus
                                                    MxRecord$Builder
                                                    MxRecordProps$Builder
                                                    MxRecordValue$Builder
                                                    NsRecord$Builder
                                                    NsRecordProps$Builder
                                                    PrivateHostedZone$Builder
                                                    PrivateHostedZoneProps$Builder
                                                    PublicHostedZone$Builder
                                                    PublicHostedZoneAttributes$Builder
                                                    PublicHostedZoneProps$Builder
                                                    RecordSet$Builder
                                                    RecordSetOptions$Builder
                                                    RecordSetProps$Builder
                                                    RecordType
                                                    SrvRecord$Builder
                                                    SrvRecordProps$Builder
                                                    SrvRecordValue$Builder
                                                    TxtRecord$Builder
                                                    TxtRecordProps$Builder
                                                    VpcEndpointServiceDomainName$Builder
                                                    VpcEndpointServiceDomainNameProps$Builder
                                                    ZoneDelegationOptions$Builder
                                                    ZoneDelegationRecord$Builder
                                                    ZoneDelegationRecordProps$Builder
                                                    ZoneSigningOptions$Builder]))


(defn caa-tag
  "The `caa-tag` function data interprets values in the provided config data into a 
`CaaTag` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `CaaTag` - the value is returned.
* is `:issuewild` - `CaaTag/ISSUEWILD` is returned
* is `:issue` - `CaaTag/ISSUE` is returned
* is `:iodef` - `CaaTag/IODEF` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? CaaTag data) data
      (= :issuewild data) CaaTag/ISSUEWILD
      (= :issue data) CaaTag/ISSUE
      (= :iodef data) CaaTag/IODEF)))


(defn continent
  "The `continent` function data interprets values in the provided config data into a 
`Continent` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `Continent` - the value is returned.
* is `:north-america` - `Continent/NORTH_AMERICA` is returned
* is `:europe` - `Continent/EUROPE` is returned
* is `:oceania` - `Continent/OCEANIA` is returned
* is `:antarctica` - `Continent/ANTARCTICA` is returned
* is `:asia` - `Continent/ASIA` is returned
* is `:africa` - `Continent/AFRICA` is returned
* is `:south-america` - `Continent/SOUTH_AMERICA` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? Continent data) data
      (= :north-america data) Continent/NORTH_AMERICA
      (= :europe data) Continent/EUROPE
      (= :oceania data) Continent/OCEANIA
      (= :antarctica data) Continent/ANTARCTICA
      (= :asia data) Continent/ASIA
      (= :africa data) Continent/AFRICA
      (= :south-america data) Continent/SOUTH_AMERICA)))


(defn key-signing-key-status
  "The `key-signing-key-status` function data interprets values in the provided config data into a 
`KeySigningKeyStatus` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `KeySigningKeyStatus` - the value is returned.
* is `:active` - `KeySigningKeyStatus/ACTIVE` is returned
* is `:inactive` - `KeySigningKeyStatus/INACTIVE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? KeySigningKeyStatus data) data
      (= :active data) KeySigningKeyStatus/ACTIVE
      (= :inactive data) KeySigningKeyStatus/INACTIVE)))


(defn record-type
  "The `record-type` function data interprets values in the provided config data into a 
`RecordType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `RecordType` - the value is returned.
* is `:ptr` - `RecordType/PTR` is returned
* is `:ds` - `RecordType/DS` is returned
* is `:spf` - `RecordType/SPF` is returned
* is `:ns` - `RecordType/NS` is returned
* is `:caa` - `RecordType/CAA` is returned
* is `:naptr` - `RecordType/NAPTR` is returned
* is `:a` - `RecordType/A` is returned
* is `:cname` - `RecordType/CNAME` is returned
* is `:soa` - `RecordType/SOA` is returned
* is `:srv` - `RecordType/SRV` is returned
* is `:mx` - `RecordType/MX` is returned
* is `:aaaa` - `RecordType/AAAA` is returned
* is `:txt` - `RecordType/TXT` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? RecordType data) data
      (= :ptr data) RecordType/PTR
      (= :ds data) RecordType/DS
      (= :spf data) RecordType/SPF
      (= :ns data) RecordType/NS
      (= :caa data) RecordType/CAA
      (= :naptr data) RecordType/NAPTR
      (= :a data) RecordType/A
      (= :cname data) RecordType/CNAME
      (= :soa data) RecordType/SOA
      (= :srv data) RecordType/SRV
      (= :mx data) RecordType/MX
      (= :aaaa data) RecordType/AAAA
      (= :txt data) RecordType/TXT)))


(defn build-a-record-attrs-builder
  "The build-a-record-attrs-builder function updates a ARecordAttrs$Builder instance using the provided configuration.
  The function takes the ARecordAttrs$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `targetDns` | java.lang.String | [[cdk.support/lookup-entry]] | `:target-dns` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^ARecordAttrs$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :target-dns)]
    (. builder targetDns data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn a-record-attrs-builder
  "Creates a  `ARecordAttrs$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-a-record-attrs-builder (new ARecordAttrs$Builder) id config))


(defn build-a-record-builder
  "The build-a-record-builder function updates a ARecord$Builder instance using the provided configuration.
  The function takes the ARecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `target` | software.amazon.awscdk.services.route53.RecordTarget | [[cdk.support/lookup-entry]] | `:target` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^ARecord$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn a-record-builder
  "Creates a  `ARecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-a-record-builder (ARecord$Builder/create scope (name id)) id config))


(defn build-a-record-props-builder
  "The build-a-record-props-builder function updates a ARecordProps$Builder instance using the provided configuration.
  The function takes the ARecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `target` | software.amazon.awscdk.services.route53.RecordTarget | [[cdk.support/lookup-entry]] | `:target` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^ARecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn a-record-props-builder
  "Creates a  `ARecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-a-record-props-builder (new ARecordProps$Builder) id config))


(defn build-aaaa-record-builder
  "The build-aaaa-record-builder function updates a AaaaRecord$Builder instance using the provided configuration.
  The function takes the AaaaRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `target` | software.amazon.awscdk.services.route53.RecordTarget | [[cdk.support/lookup-entry]] | `:target` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^AaaaRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn aaaa-record-builder
  "Creates a  `AaaaRecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-aaaa-record-builder (AaaaRecord$Builder/create scope (name id)) id config))


(defn build-aaaa-record-props-builder
  "The build-aaaa-record-props-builder function updates a AaaaRecordProps$Builder instance using the provided configuration.
  The function takes the AaaaRecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `target` | software.amazon.awscdk.services.route53.RecordTarget | [[cdk.support/lookup-entry]] | `:target` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^AaaaRecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn aaaa-record-props-builder
  "Creates a  `AaaaRecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-aaaa-record-props-builder (new AaaaRecordProps$Builder) id config))


(defn build-alias-record-target-config-builder
  "The build-alias-record-target-config-builder function updates a AliasRecordTargetConfig$Builder instance using the provided configuration.
  The function takes the AliasRecordTargetConfig$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
"
  [^AliasRecordTargetConfig$Builder builder id config]
  (when-let [data (lookup-entry config id :dns-name)]
    (. builder dnsName data))
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (.build builder))


(defn alias-record-target-config-builder
  "Creates a  `AliasRecordTargetConfig$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-alias-record-target-config-builder (new AliasRecordTargetConfig$Builder) id config))


(defn build-caa-amazon-record-builder
  "The build-caa-amazon-record-builder function updates a CaaAmazonRecord$Builder instance using the provided configuration.
  The function takes the CaaAmazonRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^CaaAmazonRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn caa-amazon-record-builder
  "Creates a  `CaaAmazonRecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-caa-amazon-record-builder (CaaAmazonRecord$Builder/create scope (name id)) id config))


(defn build-caa-amazon-record-props-builder
  "The build-caa-amazon-record-props-builder function updates a CaaAmazonRecordProps$Builder instance using the provided configuration.
  The function takes the CaaAmazonRecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^CaaAmazonRecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn caa-amazon-record-props-builder
  "Creates a  `CaaAmazonRecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-caa-amazon-record-props-builder (new CaaAmazonRecordProps$Builder) id config))


(defn build-caa-record-builder
  "The build-caa-record-builder function updates a CaaRecord$Builder instance using the provided configuration.
  The function takes the CaaRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^CaaRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn caa-record-builder
  "Creates a  `CaaRecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-caa-record-builder (CaaRecord$Builder/create scope (name id)) id config))


(defn build-caa-record-props-builder
  "The build-caa-record-props-builder function updates a CaaRecordProps$Builder instance using the provided configuration.
  The function takes the CaaRecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^CaaRecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn caa-record-props-builder
  "Creates a  `CaaRecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-caa-record-props-builder (new CaaRecordProps$Builder) id config))


(defn build-caa-record-value-builder
  "The build-caa-record-value-builder function updates a CaaRecordValue$Builder instance using the provided configuration.
  The function takes the CaaRecordValue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flag` | java.lang.Number | [[cdk.support/lookup-entry]] | `:flag` |
| `tag` | software.amazon.awscdk.services.route53.CaaTag | [[cdk.api.services.route53/caa-tag]] | `:tag` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CaaRecordValue$Builder builder id config]
  (when-let [data (lookup-entry config id :flag)]
    (. builder flag data))
  (when-let [data (caa-tag config id :tag)]
    (. builder tag data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn caa-record-value-builder
  "Creates a  `CaaRecordValue$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-caa-record-value-builder (new CaaRecordValue$Builder) id config))


(defn build-cfn-cidr-collection-builder
  "The build-cfn-cidr-collection-builder function updates a CfnCidrCollection$Builder instance using the provided configuration.
  The function takes the CfnCidrCollection$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locations` | java.util.List | [[cdk.support/lookup-entry]] | `:locations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnCidrCollection$Builder builder id config]
  (when-let [data (lookup-entry config id :locations)]
    (. builder locations data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-cidr-collection-builder
  "Creates a  `CfnCidrCollection$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-cidr-collection-builder (CfnCidrCollection$Builder/create scope (name id)) id config))


(defn build-cfn-cidr-collection-location-property-builder
  "The build-cfn-cidr-collection-location-property-builder function updates a CfnCidrCollection$LocationProperty$Builder instance using the provided configuration.
  The function takes the CfnCidrCollection$LocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrList` | java.util.List | [[cdk.support/lookup-entry]] | `:cidr-list` |
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |
"
  [^CfnCidrCollection$LocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cidr-list)]
    (. builder cidrList data))
  (when-let [data (lookup-entry config id :location-name)]
    (. builder locationName data))
  (.build builder))


(defn cfn-cidr-collection-location-property-builder
  "Creates a  `CfnCidrCollection$LocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cidr-collection-location-property-builder (new CfnCidrCollection$LocationProperty$Builder) id config))


(defn build-cfn-cidr-collection-props-builder
  "The build-cfn-cidr-collection-props-builder function updates a CfnCidrCollectionProps$Builder instance using the provided configuration.
  The function takes the CfnCidrCollectionProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locations` | java.util.List | [[cdk.support/lookup-entry]] | `:locations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
"
  [^CfnCidrCollectionProps$Builder builder id config]
  (when-let [data (lookup-entry config id :locations)]
    (. builder locations data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (.build builder))


(defn cfn-cidr-collection-props-builder
  "Creates a  `CfnCidrCollectionProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-cidr-collection-props-builder (new CfnCidrCollectionProps$Builder) id config))


(defn build-cfn-dnssec-builder
  "The build-cfn-dnssec-builder function updates a CfnDNSSEC$Builder instance using the provided configuration.
  The function takes the CfnDNSSEC$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
"
  [^CfnDNSSEC$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (.build builder))


(defn cfn-dnssec-builder
  "Creates a  `CfnDNSSEC$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-dnssec-builder (CfnDNSSEC$Builder/create scope (name id)) id config))


(defn build-cfn-dnssec-props-builder
  "The build-cfn-dnssec-props-builder function updates a CfnDNSSECProps$Builder instance using the provided configuration.
  The function takes the CfnDNSSECProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
"
  [^CfnDNSSECProps$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (.build builder))


(defn cfn-dnssec-props-builder
  "Creates a  `CfnDNSSECProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-dnssec-props-builder (new CfnDNSSECProps$Builder) id config))


(defn build-cfn-health-check-alarm-identifier-property-builder
  "The build-cfn-health-check-alarm-identifier-property-builder function updates a CfnHealthCheck$AlarmIdentifierProperty$Builder instance using the provided configuration.
  The function takes the CfnHealthCheck$AlarmIdentifierProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
"
  [^CfnHealthCheck$AlarmIdentifierProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (.build builder))


(defn cfn-health-check-alarm-identifier-property-builder
  "Creates a  `CfnHealthCheck$AlarmIdentifierProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-health-check-alarm-identifier-property-builder (new CfnHealthCheck$AlarmIdentifierProperty$Builder) id config))


(defn build-cfn-health-check-builder
  "The build-cfn-health-check-builder function updates a CfnHealthCheck$Builder instance using the provided configuration.
  The function takes the CfnHealthCheck$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthCheckConfig` | software.amazon.awscdk.services.route53.CfnHealthCheck$HealthCheckConfigProperty | [[cdk.support/lookup-entry]] | `:health-check-config` |
| `healthCheckTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-tags` |
"
  [^CfnHealthCheck$Builder builder id config]
  (when-let [data (lookup-entry config id :health-check-config)]
    (. builder healthCheckConfig data))
  (when-let [data (lookup-entry config id :health-check-tags)]
    (. builder healthCheckTags data))
  (.build builder))


(defn cfn-health-check-builder
  "Creates a  `CfnHealthCheck$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-health-check-builder (CfnHealthCheck$Builder/create scope (name id)) id config))


(defn build-cfn-health-check-health-check-config-property-builder
  "The build-cfn-health-check-health-check-config-property-builder function updates a CfnHealthCheck$HealthCheckConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnHealthCheck$HealthCheckConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `alarmIdentifier` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alarm-identifier` |
| `childHealthChecks` | java.util.List | [[cdk.support/lookup-entry]] | `:child-health-checks` |
| `enableSni` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-sni` |
| `failureThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:failure-threshold` |
| `fullyQualifiedDomainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:fully-qualified-domain-name` |
| `healthThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:health-threshold` |
| `insufficientDataHealthStatus` | java.lang.String | [[cdk.support/lookup-entry]] | `:insufficient-data-health-status` |
| `inverted` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:inverted` |
| `ipAddress` | java.lang.String | [[cdk.support/lookup-entry]] | `:ip-address` |
| `measureLatency` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:measure-latency` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `regions` | java.util.List | [[cdk.support/lookup-entry]] | `:regions` |
| `requestInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:request-interval` |
| `resourcePath` | java.lang.String | [[cdk.support/lookup-entry]] | `:resource-path` |
| `routingControlArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:routing-control-arn` |
| `searchString` | java.lang.String | [[cdk.support/lookup-entry]] | `:search-string` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
"
  [^CfnHealthCheck$HealthCheckConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alarm-identifier)]
    (. builder alarmIdentifier data))
  (when-let [data (lookup-entry config id :child-health-checks)]
    (. builder childHealthChecks data))
  (when-let [data (lookup-entry config id :enable-sni)]
    (. builder enableSni data))
  (when-let [data (lookup-entry config id :failure-threshold)]
    (. builder failureThreshold data))
  (when-let [data (lookup-entry config id :fully-qualified-domain-name)]
    (. builder fullyQualifiedDomainName data))
  (when-let [data (lookup-entry config id :health-threshold)]
    (. builder healthThreshold data))
  (when-let [data (lookup-entry config id :insufficient-data-health-status)]
    (. builder insufficientDataHealthStatus data))
  (when-let [data (lookup-entry config id :inverted)]
    (. builder inverted data))
  (when-let [data (lookup-entry config id :ip-address)]
    (. builder ipAddress data))
  (when-let [data (lookup-entry config id :measure-latency)]
    (. builder measureLatency data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :regions)]
    (. builder regions data))
  (when-let [data (lookup-entry config id :request-interval)]
    (. builder requestInterval data))
  (when-let [data (lookup-entry config id :resource-path)]
    (. builder resourcePath data))
  (when-let [data (lookup-entry config id :routing-control-arn)]
    (. builder routingControlArn data))
  (when-let [data (lookup-entry config id :search-string)]
    (. builder searchString data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (.build builder))


(defn cfn-health-check-health-check-config-property-builder
  "Creates a  `CfnHealthCheck$HealthCheckConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-health-check-health-check-config-property-builder (new CfnHealthCheck$HealthCheckConfigProperty$Builder) id config))


(defn build-cfn-health-check-health-check-tag-property-builder
  "The build-cfn-health-check-health-check-tag-property-builder function updates a CfnHealthCheck$HealthCheckTagProperty$Builder instance using the provided configuration.
  The function takes the CfnHealthCheck$HealthCheckTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnHealthCheck$HealthCheckTagProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-health-check-health-check-tag-property-builder
  "Creates a  `CfnHealthCheck$HealthCheckTagProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-health-check-health-check-tag-property-builder (new CfnHealthCheck$HealthCheckTagProperty$Builder) id config))


(defn build-cfn-health-check-props-builder
  "The build-cfn-health-check-props-builder function updates a CfnHealthCheckProps$Builder instance using the provided configuration.
  The function takes the CfnHealthCheckProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthCheckConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-config` |
| `healthCheckTags` | java.util.List | [[cdk.support/lookup-entry]] | `:health-check-tags` |
"
  [^CfnHealthCheckProps$Builder builder id config]
  (when-let [data (lookup-entry config id :health-check-config)]
    (. builder healthCheckConfig data))
  (when-let [data (lookup-entry config id :health-check-tags)]
    (. builder healthCheckTags data))
  (.build builder))


(defn cfn-health-check-props-builder
  "Creates a  `CfnHealthCheckProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-health-check-props-builder (new CfnHealthCheckProps$Builder) id config))


(defn build-cfn-hosted-zone-builder
  "The build-cfn-hosted-zone-builder function updates a CfnHostedZone$Builder instance using the provided configuration.
  The function takes the CfnHostedZone$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneConfig` | software.amazon.awscdk.services.route53.CfnHostedZone$HostedZoneConfigProperty | [[cdk.support/lookup-entry]] | `:hosted-zone-config` |
| `hostedZoneTags` | java.util.List | [[cdk.support/lookup-entry]] | `:hosted-zone-tags` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryLoggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-logging-config` |
| `vpcs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpcs` |
"
  [^CfnHostedZone$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone-config)]
    (. builder hostedZoneConfig data))
  (when-let [data (lookup-entry config id :hosted-zone-tags)]
    (. builder hostedZoneTags data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :query-logging-config)]
    (. builder queryLoggingConfig data))
  (when-let [data (lookup-entry config id :vpcs)]
    (. builder vpcs data))
  (.build builder))


(defn cfn-hosted-zone-builder
  "Creates a  `CfnHostedZone$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-hosted-zone-builder (CfnHostedZone$Builder/create scope (name id)) id config))


(defn build-cfn-hosted-zone-hosted-zone-config-property-builder
  "The build-cfn-hosted-zone-hosted-zone-config-property-builder function updates a CfnHostedZone$HostedZoneConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnHostedZone$HostedZoneConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
"
  [^CfnHostedZone$HostedZoneConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (.build builder))


(defn cfn-hosted-zone-hosted-zone-config-property-builder
  "Creates a  `CfnHostedZone$HostedZoneConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-hosted-zone-hosted-zone-config-property-builder (new CfnHostedZone$HostedZoneConfigProperty$Builder) id config))


(defn build-cfn-hosted-zone-hosted-zone-tag-property-builder
  "The build-cfn-hosted-zone-hosted-zone-tag-property-builder function updates a CfnHostedZone$HostedZoneTagProperty$Builder instance using the provided configuration.
  The function takes the CfnHostedZone$HostedZoneTagProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |
"
  [^CfnHostedZone$HostedZoneTagProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :key)]
    (. builder key data))
  (when-let [data (lookup-entry config id :value)]
    (. builder value data))
  (.build builder))


(defn cfn-hosted-zone-hosted-zone-tag-property-builder
  "Creates a  `CfnHostedZone$HostedZoneTagProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-hosted-zone-hosted-zone-tag-property-builder (new CfnHostedZone$HostedZoneTagProperty$Builder) id config))


(defn build-cfn-hosted-zone-props-builder
  "The build-cfn-hosted-zone-props-builder function updates a CfnHostedZoneProps$Builder instance using the provided configuration.
  The function takes the CfnHostedZoneProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneConfig` | software.amazon.awscdk.services.route53.CfnHostedZone$HostedZoneConfigProperty | [[cdk.support/lookup-entry]] | `:hosted-zone-config` |
| `hostedZoneTags` | java.util.List | [[cdk.support/lookup-entry]] | `:hosted-zone-tags` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryLoggingConfig` | software.amazon.awscdk.services.route53.CfnHostedZone$QueryLoggingConfigProperty | [[cdk.support/lookup-entry]] | `:query-logging-config` |
| `vpcs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpcs` |
"
  [^CfnHostedZoneProps$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone-config)]
    (. builder hostedZoneConfig data))
  (when-let [data (lookup-entry config id :hosted-zone-tags)]
    (. builder hostedZoneTags data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :query-logging-config)]
    (. builder queryLoggingConfig data))
  (when-let [data (lookup-entry config id :vpcs)]
    (. builder vpcs data))
  (.build builder))


(defn cfn-hosted-zone-props-builder
  "Creates a  `CfnHostedZoneProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-hosted-zone-props-builder (new CfnHostedZoneProps$Builder) id config))


(defn build-cfn-hosted-zone-query-logging-config-property-builder
  "The build-cfn-hosted-zone-query-logging-config-property-builder function updates a CfnHostedZone$QueryLoggingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnHostedZone$QueryLoggingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-log-group-arn` |
"
  [^CfnHostedZone$QueryLoggingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :cloud-watch-logs-log-group-arn)]
    (. builder cloudWatchLogsLogGroupArn data))
  (.build builder))


(defn cfn-hosted-zone-query-logging-config-property-builder
  "Creates a  `CfnHostedZone$QueryLoggingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-hosted-zone-query-logging-config-property-builder (new CfnHostedZone$QueryLoggingConfigProperty$Builder) id config))


(defn build-cfn-hosted-zone-vpc-property-builder
  "The build-cfn-hosted-zone-vpc-property-builder function updates a CfnHostedZone$VPCProperty$Builder instance using the provided configuration.
  The function takes the CfnHostedZone$VPCProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `vpcRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-region` |
"
  [^CfnHostedZone$VPCProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (when-let [data (lookup-entry config id :vpc-region)]
    (. builder vpcRegion data))
  (.build builder))


(defn cfn-hosted-zone-vpc-property-builder
  "Creates a  `CfnHostedZone$VPCProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-hosted-zone-vpc-property-builder (new CfnHostedZone$VPCProperty$Builder) id config))


(defn build-cfn-key-signing-key-builder
  "The build-cfn-key-signing-key-builder function updates a CfnKeySigningKey$Builder instance using the provided configuration.
  The function takes the CfnKeySigningKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `keyManagementServiceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-management-service-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnKeySigningKey$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :key-management-service-arn)]
    (. builder keyManagementServiceArn data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-key-signing-key-builder
  "Creates a  `CfnKeySigningKey$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-key-signing-key-builder (CfnKeySigningKey$Builder/create scope (name id)) id config))


(defn build-cfn-key-signing-key-props-builder
  "The build-cfn-key-signing-key-props-builder function updates a CfnKeySigningKeyProps$Builder instance using the provided configuration.
  The function takes the CfnKeySigningKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `keyManagementServiceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-management-service-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
"
  [^CfnKeySigningKeyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :key-management-service-arn)]
    (. builder keyManagementServiceArn data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :status)]
    (. builder status data))
  (.build builder))


(defn cfn-key-signing-key-props-builder
  "Creates a  `CfnKeySigningKeyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-key-signing-key-props-builder (new CfnKeySigningKeyProps$Builder) id config))


(defn build-cfn-record-set-alias-target-property-builder
  "The build-cfn-record-set-alias-target-property-builder function updates a CfnRecordSet$AliasTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordSet$AliasTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `evaluateTargetHealth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:evaluate-target-health` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
"
  [^CfnRecordSet$AliasTargetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dns-name)]
    (. builder dnsName data))
  (when-let [data (lookup-entry config id :evaluate-target-health)]
    (. builder evaluateTargetHealth data))
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (.build builder))


(defn cfn-record-set-alias-target-property-builder
  "Creates a  `CfnRecordSet$AliasTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-alias-target-property-builder (new CfnRecordSet$AliasTargetProperty$Builder) id config))


(defn build-cfn-record-set-builder
  "The build-cfn-record-set-builder function updates a CfnRecordSet$Builder instance using the provided configuration.
  The function takes the CfnRecordSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasTarget` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alias-target` |
| `cidrRoutingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cidr-routing-config` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `failover` | java.lang.String | [[cdk.support/lookup-entry]] | `:failover` |
| `geoLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:geo-location` |
| `geoProximityLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:geo-proximity-location` |
| `healthCheckId` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-id` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `hostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-name` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `resourceRecords` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-records` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | java.lang.String | [[cdk.support/lookup-entry]] | `:ttl` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnRecordSet$Builder builder id config]
  (when-let [data (lookup-entry config id :alias-target)]
    (. builder aliasTarget data))
  (when-let [data (lookup-entry config id :cidr-routing-config)]
    (. builder cidrRoutingConfig data))
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :failover)]
    (. builder failover data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :geo-proximity-location)]
    (. builder geoProximityLocation data))
  (when-let [data (lookup-entry config id :health-check-id)]
    (. builder healthCheckId data))
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :hosted-zone-name)]
    (. builder hostedZoneName data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :resource-records)]
    (. builder resourceRecords data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-record-set-builder
  "Creates a  `CfnRecordSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-record-set-builder (CfnRecordSet$Builder/create scope (name id)) id config))


(defn build-cfn-record-set-cidr-routing-config-property-builder
  "The build-cfn-record-set-cidr-routing-config-property-builder function updates a CfnRecordSet$CidrRoutingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordSet$CidrRoutingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |
"
  [^CfnRecordSet$CidrRoutingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :collection-id)]
    (. builder collectionId data))
  (when-let [data (lookup-entry config id :location-name)]
    (. builder locationName data))
  (.build builder))


(defn cfn-record-set-cidr-routing-config-property-builder
  "Creates a  `CfnRecordSet$CidrRoutingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-cidr-routing-config-property-builder (new CfnRecordSet$CidrRoutingConfigProperty$Builder) id config))


(defn build-cfn-record-set-coordinates-property-builder
  "The build-cfn-record-set-coordinates-property-builder function updates a CfnRecordSet$CoordinatesProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordSet$CoordinatesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `latitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:longitude` |
"
  [^CfnRecordSet$CoordinatesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :latitude)]
    (. builder latitude data))
  (when-let [data (lookup-entry config id :longitude)]
    (. builder longitude data))
  (.build builder))


(defn cfn-record-set-coordinates-property-builder
  "Creates a  `CfnRecordSet$CoordinatesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-coordinates-property-builder (new CfnRecordSet$CoordinatesProperty$Builder) id config))


(defn build-cfn-record-set-geo-location-property-builder
  "The build-cfn-record-set-geo-location-property-builder function updates a CfnRecordSet$GeoLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordSet$GeoLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `continentCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:continent-code` |
| `countryCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:country-code` |
| `subdivisionCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdivision-code` |
"
  [^CfnRecordSet$GeoLocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :continent-code)]
    (. builder continentCode data))
  (when-let [data (lookup-entry config id :country-code)]
    (. builder countryCode data))
  (when-let [data (lookup-entry config id :subdivision-code)]
    (. builder subdivisionCode data))
  (.build builder))


(defn cfn-record-set-geo-location-property-builder
  "Creates a  `CfnRecordSet$GeoLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-geo-location-property-builder (new CfnRecordSet$GeoLocationProperty$Builder) id config))


(defn build-cfn-record-set-geo-proximity-location-property-builder
  "The build-cfn-record-set-geo-proximity-location-property-builder function updates a CfnRecordSet$GeoProximityLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordSet$GeoProximityLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `bias` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bias` |
| `coordinates` | software.amazon.awscdk.services.route53.CfnRecordSet$CoordinatesProperty | [[cdk.support/lookup-entry]] | `:coordinates` |
| `localZoneGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-zone-group` |
"
  [^CfnRecordSet$GeoProximityLocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-region)]
    (. builder awsRegion data))
  (when-let [data (lookup-entry config id :bias)]
    (. builder bias data))
  (when-let [data (lookup-entry config id :coordinates)]
    (. builder coordinates data))
  (when-let [data (lookup-entry config id :local-zone-group)]
    (. builder localZoneGroup data))
  (.build builder))


(defn cfn-record-set-geo-proximity-location-property-builder
  "Creates a  `CfnRecordSet$GeoProximityLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-geo-proximity-location-property-builder (new CfnRecordSet$GeoProximityLocationProperty$Builder) id config))


(defn build-cfn-record-set-group-alias-target-property-builder
  "The build-cfn-record-set-group-alias-target-property-builder function updates a CfnRecordSetGroup$AliasTargetProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordSetGroup$AliasTargetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `evaluateTargetHealth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:evaluate-target-health` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
"
  [^CfnRecordSetGroup$AliasTargetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :dns-name)]
    (. builder dnsName data))
  (when-let [data (lookup-entry config id :evaluate-target-health)]
    (. builder evaluateTargetHealth data))
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (.build builder))


(defn cfn-record-set-group-alias-target-property-builder
  "Creates a  `CfnRecordSetGroup$AliasTargetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-group-alias-target-property-builder (new CfnRecordSetGroup$AliasTargetProperty$Builder) id config))


(defn build-cfn-record-set-group-builder
  "The build-cfn-record-set-group-builder function updates a CfnRecordSetGroup$Builder instance using the provided configuration.
  The function takes the CfnRecordSetGroup$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `hostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-name` |
| `recordSets` | java.util.List | [[cdk.support/lookup-entry]] | `:record-sets` |
"
  [^CfnRecordSetGroup$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :hosted-zone-name)]
    (. builder hostedZoneName data))
  (when-let [data (lookup-entry config id :record-sets)]
    (. builder recordSets data))
  (.build builder))


(defn cfn-record-set-group-builder
  "Creates a  `CfnRecordSetGroup$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cfn-record-set-group-builder (CfnRecordSetGroup$Builder/create scope (name id)) id config))


(defn build-cfn-record-set-group-cidr-routing-config-property-builder
  "The build-cfn-record-set-group-cidr-routing-config-property-builder function updates a CfnRecordSetGroup$CidrRoutingConfigProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordSetGroup$CidrRoutingConfigProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |
"
  [^CfnRecordSetGroup$CidrRoutingConfigProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :collection-id)]
    (. builder collectionId data))
  (when-let [data (lookup-entry config id :location-name)]
    (. builder locationName data))
  (.build builder))


(defn cfn-record-set-group-cidr-routing-config-property-builder
  "Creates a  `CfnRecordSetGroup$CidrRoutingConfigProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-group-cidr-routing-config-property-builder (new CfnRecordSetGroup$CidrRoutingConfigProperty$Builder) id config))


(defn build-cfn-record-set-group-coordinates-property-builder
  "The build-cfn-record-set-group-coordinates-property-builder function updates a CfnRecordSetGroup$CoordinatesProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordSetGroup$CoordinatesProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `latitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:longitude` |
"
  [^CfnRecordSetGroup$CoordinatesProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :latitude)]
    (. builder latitude data))
  (when-let [data (lookup-entry config id :longitude)]
    (. builder longitude data))
  (.build builder))


(defn cfn-record-set-group-coordinates-property-builder
  "Creates a  `CfnRecordSetGroup$CoordinatesProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-group-coordinates-property-builder (new CfnRecordSetGroup$CoordinatesProperty$Builder) id config))


(defn build-cfn-record-set-group-geo-location-property-builder
  "The build-cfn-record-set-group-geo-location-property-builder function updates a CfnRecordSetGroup$GeoLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordSetGroup$GeoLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `continentCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:continent-code` |
| `countryCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:country-code` |
| `subdivisionCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdivision-code` |
"
  [^CfnRecordSetGroup$GeoLocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :continent-code)]
    (. builder continentCode data))
  (when-let [data (lookup-entry config id :country-code)]
    (. builder countryCode data))
  (when-let [data (lookup-entry config id :subdivision-code)]
    (. builder subdivisionCode data))
  (.build builder))


(defn cfn-record-set-group-geo-location-property-builder
  "Creates a  `CfnRecordSetGroup$GeoLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-group-geo-location-property-builder (new CfnRecordSetGroup$GeoLocationProperty$Builder) id config))


(defn build-cfn-record-set-group-geo-proximity-location-property-builder
  "The build-cfn-record-set-group-geo-proximity-location-property-builder function updates a CfnRecordSetGroup$GeoProximityLocationProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordSetGroup$GeoProximityLocationProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `bias` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bias` |
| `coordinates` | software.amazon.awscdk.services.route53.CfnRecordSetGroup$CoordinatesProperty | [[cdk.support/lookup-entry]] | `:coordinates` |
| `localZoneGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-zone-group` |
"
  [^CfnRecordSetGroup$GeoProximityLocationProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :aws-region)]
    (. builder awsRegion data))
  (when-let [data (lookup-entry config id :bias)]
    (. builder bias data))
  (when-let [data (lookup-entry config id :coordinates)]
    (. builder coordinates data))
  (when-let [data (lookup-entry config id :local-zone-group)]
    (. builder localZoneGroup data))
  (.build builder))


(defn cfn-record-set-group-geo-proximity-location-property-builder
  "Creates a  `CfnRecordSetGroup$GeoProximityLocationProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-group-geo-proximity-location-property-builder (new CfnRecordSetGroup$GeoProximityLocationProperty$Builder) id config))


(defn build-cfn-record-set-group-props-builder
  "The build-cfn-record-set-group-props-builder function updates a CfnRecordSetGroupProps$Builder instance using the provided configuration.
  The function takes the CfnRecordSetGroupProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `hostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-name` |
| `recordSets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:record-sets` |
"
  [^CfnRecordSetGroupProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :hosted-zone-name)]
    (. builder hostedZoneName data))
  (when-let [data (lookup-entry config id :record-sets)]
    (. builder recordSets data))
  (.build builder))


(defn cfn-record-set-group-props-builder
  "Creates a  `CfnRecordSetGroupProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-group-props-builder (new CfnRecordSetGroupProps$Builder) id config))


(defn build-cfn-record-set-group-record-set-property-builder
  "The build-cfn-record-set-group-record-set-property-builder function updates a CfnRecordSetGroup$RecordSetProperty$Builder instance using the provided configuration.
  The function takes the CfnRecordSetGroup$RecordSetProperty$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasTarget` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alias-target` |
| `cidrRoutingConfig` | software.amazon.awscdk.services.route53.CfnRecordSetGroup$CidrRoutingConfigProperty | [[cdk.support/lookup-entry]] | `:cidr-routing-config` |
| `failover` | java.lang.String | [[cdk.support/lookup-entry]] | `:failover` |
| `geoLocation` | software.amazon.awscdk.services.route53.CfnRecordSetGroup$GeoLocationProperty | [[cdk.support/lookup-entry]] | `:geo-location` |
| `geoProximityLocation` | software.amazon.awscdk.services.route53.CfnRecordSetGroup$GeoProximityLocationProperty | [[cdk.support/lookup-entry]] | `:geo-proximity-location` |
| `healthCheckId` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-id` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `hostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-name` |
| `multiValueAnswer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `resourceRecords` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-records` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | java.lang.String | [[cdk.support/lookup-entry]] | `:ttl` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnRecordSetGroup$RecordSetProperty$Builder builder id config]
  (when-let [data (lookup-entry config id :alias-target)]
    (. builder aliasTarget data))
  (when-let [data (lookup-entry config id :cidr-routing-config)]
    (. builder cidrRoutingConfig data))
  (when-let [data (lookup-entry config id :failover)]
    (. builder failover data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :geo-proximity-location)]
    (. builder geoProximityLocation data))
  (when-let [data (lookup-entry config id :health-check-id)]
    (. builder healthCheckId data))
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :hosted-zone-name)]
    (. builder hostedZoneName data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :resource-records)]
    (. builder resourceRecords data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-record-set-group-record-set-property-builder
  "Creates a  `CfnRecordSetGroup$RecordSetProperty$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-group-record-set-property-builder (new CfnRecordSetGroup$RecordSetProperty$Builder) id config))


(defn build-cfn-record-set-props-builder
  "The build-cfn-record-set-props-builder function updates a CfnRecordSetProps$Builder instance using the provided configuration.
  The function takes the CfnRecordSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `aliasTarget` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:alias-target` |
| `cidrRoutingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:cidr-routing-config` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `failover` | java.lang.String | [[cdk.support/lookup-entry]] | `:failover` |
| `geoLocation` | software.amazon.awscdk.services.route53.CfnRecordSet$GeoLocationProperty | [[cdk.support/lookup-entry]] | `:geo-location` |
| `geoProximityLocation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:geo-proximity-location` |
| `healthCheckId` | java.lang.String | [[cdk.support/lookup-entry]] | `:health-check-id` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `hostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-name` |
| `multiValueAnswer` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `resourceRecords` | java.util.List | [[cdk.support/lookup-entry]] | `:resource-records` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | java.lang.String | [[cdk.support/lookup-entry]] | `:ttl` |
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^CfnRecordSetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :alias-target)]
    (. builder aliasTarget data))
  (when-let [data (lookup-entry config id :cidr-routing-config)]
    (. builder cidrRoutingConfig data))
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :failover)]
    (. builder failover data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :geo-proximity-location)]
    (. builder geoProximityLocation data))
  (when-let [data (lookup-entry config id :health-check-id)]
    (. builder healthCheckId data))
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :hosted-zone-name)]
    (. builder hostedZoneName data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :name)]
    (. builder name data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :resource-records)]
    (. builder resourceRecords data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :type)]
    (. builder type data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn cfn-record-set-props-builder
  "Creates a  `CfnRecordSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cfn-record-set-props-builder (new CfnRecordSetProps$Builder) id config))


(defn build-cname-record-builder
  "The build-cname-record-builder function updates a CnameRecord$Builder instance using the provided configuration.
  The function takes the CnameRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^CnameRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn cname-record-builder
  "Creates a  `CnameRecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cname-record-builder (CnameRecord$Builder/create scope (name id)) id config))


(defn build-cname-record-props-builder
  "The build-cname-record-props-builder function updates a CnameRecordProps$Builder instance using the provided configuration.
  The function takes the CnameRecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^CnameRecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn cname-record-props-builder
  "Creates a  `CnameRecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cname-record-props-builder (new CnameRecordProps$Builder) id config))


(defn build-common-hosted-zone-props-builder
  "The build-common-hosted-zone-props-builder function updates a CommonHostedZoneProps$Builder instance using the provided configuration.
  The function takes the CommonHostedZoneProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |
"
  [^CommonHostedZoneProps$Builder builder id config]
  (when-let [data (lookup-entry config id :add-trailing-dot)]
    (. builder addTrailingDot data))
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :query-logs-log-group-arn)]
    (. builder queryLogsLogGroupArn data))
  (when-let [data (lookup-entry config id :zone-name)]
    (. builder zoneName data))
  (.build builder))


(defn common-hosted-zone-props-builder
  "Creates a  `CommonHostedZoneProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-common-hosted-zone-props-builder (new CommonHostedZoneProps$Builder) id config))


(defn build-cross-account-zone-delegation-record-builder
  "The build-cross-account-zone-delegation-record-builder function updates a CrossAccountZoneDelegationRecord$Builder instance using the provided configuration.
  The function takes the CrossAccountZoneDelegationRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRoleRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-region` |
| `delegatedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:delegated-zone` |
| `delegationRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:delegation-role` |
| `parentHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-hosted-zone-id` |
| `parentHostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-hosted-zone-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
"
  [^CrossAccountZoneDelegationRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :assume-role-region)]
    (. builder assumeRoleRegion data))
  (when-let [data (lookup-entry config id :delegated-zone)]
    (. builder delegatedZone data))
  (when-let [data (lookup-entry config id :delegation-role)]
    (. builder delegationRole data))
  (when-let [data (lookup-entry config id :parent-hosted-zone-id)]
    (. builder parentHostedZoneId data))
  (when-let [data (lookup-entry config id :parent-hosted-zone-name)]
    (. builder parentHostedZoneName data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (.build builder))


(defn cross-account-zone-delegation-record-builder
  "Creates a  `CrossAccountZoneDelegationRecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-cross-account-zone-delegation-record-builder (CrossAccountZoneDelegationRecord$Builder/create scope (name id)) id config))


(defn build-cross-account-zone-delegation-record-props-builder
  "The build-cross-account-zone-delegation-record-props-builder function updates a CrossAccountZoneDelegationRecordProps$Builder instance using the provided configuration.
  The function takes the CrossAccountZoneDelegationRecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRoleRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-region` |
| `delegatedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:delegated-zone` |
| `delegationRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:delegation-role` |
| `parentHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-hosted-zone-id` |
| `parentHostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-hosted-zone-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
"
  [^CrossAccountZoneDelegationRecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :assume-role-region)]
    (. builder assumeRoleRegion data))
  (when-let [data (lookup-entry config id :delegated-zone)]
    (. builder delegatedZone data))
  (when-let [data (lookup-entry config id :delegation-role)]
    (. builder delegationRole data))
  (when-let [data (lookup-entry config id :parent-hosted-zone-id)]
    (. builder parentHostedZoneId data))
  (when-let [data (lookup-entry config id :parent-hosted-zone-name)]
    (. builder parentHostedZoneName data))
  (when-let [data (removal-policy config id :removal-policy)]
    (. builder removalPolicy data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (.build builder))


(defn cross-account-zone-delegation-record-props-builder
  "Creates a  `CrossAccountZoneDelegationRecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-cross-account-zone-delegation-record-props-builder (new CrossAccountZoneDelegationRecordProps$Builder) id config))


(defn build-ds-record-builder
  "The build-ds-record-builder function updates a DsRecord$Builder instance using the provided configuration.
  The function takes the DsRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^DsRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn ds-record-builder
  "Creates a  `DsRecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-ds-record-builder (DsRecord$Builder/create scope (name id)) id config))


(defn build-ds-record-props-builder
  "The build-ds-record-props-builder function updates a DsRecordProps$Builder instance using the provided configuration.
  The function takes the DsRecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^DsRecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn ds-record-props-builder
  "Creates a  `DsRecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ds-record-props-builder (new DsRecordProps$Builder) id config))


(defn build-hosted-zone-attributes-builder
  "The build-hosted-zone-attributes-builder function updates a HostedZoneAttributes$Builder instance using the provided configuration.
  The function takes the HostedZoneAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |
"
  [^HostedZoneAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :zone-name)]
    (. builder zoneName data))
  (.build builder))


(defn hosted-zone-attributes-builder
  "Creates a  `HostedZoneAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-hosted-zone-attributes-builder (new HostedZoneAttributes$Builder) id config))


(defn build-hosted-zone-builder
  "The build-hosted-zone-builder function updates a HostedZone$Builder instance using the provided configuration.
  The function takes the HostedZone$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `vpcs` | java.util.List | [[cdk.support/lookup-entry]] | `:vpcs` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |
"
  [^HostedZone$Builder builder id config]
  (when-let [data (lookup-entry config id :add-trailing-dot)]
    (. builder addTrailingDot data))
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :query-logs-log-group-arn)]
    (. builder queryLogsLogGroupArn data))
  (when-let [data (lookup-entry config id :vpcs)]
    (. builder vpcs data))
  (when-let [data (lookup-entry config id :zone-name)]
    (. builder zoneName data))
  (.build builder))


(defn hosted-zone-builder
  "Creates a  `HostedZone$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-hosted-zone-builder (HostedZone$Builder/create scope (name id)) id config))


(defn build-hosted-zone-props-builder
  "The build-hosted-zone-props-builder function updates a HostedZoneProps$Builder instance using the provided configuration.
  The function takes the HostedZoneProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `vpcs` | java.util.List | [[cdk.support/lookup-entry]] | `:vpcs` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |
"
  [^HostedZoneProps$Builder builder id config]
  (when-let [data (lookup-entry config id :add-trailing-dot)]
    (. builder addTrailingDot data))
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :query-logs-log-group-arn)]
    (. builder queryLogsLogGroupArn data))
  (when-let [data (lookup-entry config id :vpcs)]
    (. builder vpcs data))
  (when-let [data (lookup-entry config id :zone-name)]
    (. builder zoneName data))
  (.build builder))


(defn hosted-zone-props-builder
  "Creates a  `HostedZoneProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-hosted-zone-props-builder (new HostedZoneProps$Builder) id config))


(defn build-hosted-zone-provider-props-builder
  "The build-hosted-zone-provider-props-builder function updates a HostedZoneProviderProps$Builder instance using the provided configuration.
  The function takes the HostedZoneProviderProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `privateZone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:private-zone` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
"
  [^HostedZoneProviderProps$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :private-zone)]
    (. builder privateZone data))
  (when-let [data (lookup-entry config id :vpc-id)]
    (. builder vpcId data))
  (.build builder))


(defn hosted-zone-provider-props-builder
  "Creates a  `HostedZoneProviderProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-hosted-zone-provider-props-builder (new HostedZoneProviderProps$Builder) id config))


(defn build-key-signing-key-attributes-builder
  "The build-key-signing-key-attributes-builder function updates a KeySigningKeyAttributes$Builder instance using the provided configuration.
  The function takes the KeySigningKeyAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:hosted-zone` |
| `keySigningKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-signing-key-name` |
"
  [^KeySigningKeyAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone)]
    (. builder hostedZone data))
  (when-let [data (lookup-entry config id :key-signing-key-name)]
    (. builder keySigningKeyName data))
  (.build builder))


(defn key-signing-key-attributes-builder
  "Creates a  `KeySigningKeyAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-key-signing-key-attributes-builder (new KeySigningKeyAttributes$Builder) id config))


(defn build-key-signing-key-builder
  "The build-key-signing-key-builder function updates a KeySigningKey$Builder instance using the provided configuration.
  The function takes the KeySigningKey$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:hosted-zone` |
| `keySigningKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-signing-key-name` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `status` | software.amazon.awscdk.services.route53.KeySigningKeyStatus | [[cdk.api.services.route53/key-signing-key-status]] | `:status` |
"
  [^KeySigningKey$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone)]
    (. builder hostedZone data))
  (when-let [data (lookup-entry config id :key-signing-key-name)]
    (. builder keySigningKeyName data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (key-signing-key-status config id :status)]
    (. builder status data))
  (.build builder))


(defn key-signing-key-builder
  "Creates a  `KeySigningKey$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-key-signing-key-builder (KeySigningKey$Builder/create scope (name id)) id config))


(defn build-key-signing-key-props-builder
  "The build-key-signing-key-props-builder function updates a KeySigningKeyProps$Builder instance using the provided configuration.
  The function takes the KeySigningKeyProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:hosted-zone` |
| `keySigningKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-signing-key-name` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `status` | software.amazon.awscdk.services.route53.KeySigningKeyStatus | [[cdk.api.services.route53/key-signing-key-status]] | `:status` |
"
  [^KeySigningKeyProps$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone)]
    (. builder hostedZone data))
  (when-let [data (lookup-entry config id :key-signing-key-name)]
    (. builder keySigningKeyName data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (when-let [data (key-signing-key-status config id :status)]
    (. builder status data))
  (.build builder))


(defn key-signing-key-props-builder
  "Creates a  `KeySigningKeyProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-key-signing-key-props-builder (new KeySigningKeyProps$Builder) id config))


(defn build-mx-record-builder
  "The build-mx-record-builder function updates a MxRecord$Builder instance using the provided configuration.
  The function takes the MxRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^MxRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn mx-record-builder
  "Creates a  `MxRecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-mx-record-builder (MxRecord$Builder/create scope (name id)) id config))


(defn build-mx-record-props-builder
  "The build-mx-record-props-builder function updates a MxRecordProps$Builder instance using the provided configuration.
  The function takes the MxRecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^MxRecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn mx-record-props-builder
  "Creates a  `MxRecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-mx-record-props-builder (new MxRecordProps$Builder) id config))


(defn build-mx-record-value-builder
  "The build-mx-record-value-builder function updates a MxRecordValue$Builder instance using the provided configuration.
  The function takes the MxRecordValue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
"
  [^MxRecordValue$Builder builder id config]
  (when-let [data (lookup-entry config id :host-name)]
    (. builder hostName data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (.build builder))


(defn mx-record-value-builder
  "Creates a  `MxRecordValue$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-mx-record-value-builder (new MxRecordValue$Builder) id config))


(defn build-ns-record-builder
  "The build-ns-record-builder function updates a NsRecord$Builder instance using the provided configuration.
  The function takes the NsRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^NsRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn ns-record-builder
  "Creates a  `NsRecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-ns-record-builder (NsRecord$Builder/create scope (name id)) id config))


(defn build-ns-record-props-builder
  "The build-ns-record-props-builder function updates a NsRecordProps$Builder instance using the provided configuration.
  The function takes the NsRecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^NsRecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn ns-record-props-builder
  "Creates a  `NsRecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-ns-record-props-builder (new NsRecordProps$Builder) id config))


(defn build-private-hosted-zone-builder
  "The build-private-hosted-zone-builder function updates a PrivateHostedZone$Builder instance using the provided configuration.
  The function takes the PrivateHostedZone$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |
"
  [^PrivateHostedZone$Builder builder id config]
  (when-let [data (lookup-entry config id :add-trailing-dot)]
    (. builder addTrailingDot data))
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :query-logs-log-group-arn)]
    (. builder queryLogsLogGroupArn data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :zone-name)]
    (. builder zoneName data))
  (.build builder))


(defn private-hosted-zone-builder
  "Creates a  `PrivateHostedZone$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-private-hosted-zone-builder (PrivateHostedZone$Builder/create scope (name id)) id config))


(defn build-private-hosted-zone-props-builder
  "The build-private-hosted-zone-props-builder function updates a PrivateHostedZoneProps$Builder instance using the provided configuration.
  The function takes the PrivateHostedZoneProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |
"
  [^PrivateHostedZoneProps$Builder builder id config]
  (when-let [data (lookup-entry config id :add-trailing-dot)]
    (. builder addTrailingDot data))
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :query-logs-log-group-arn)]
    (. builder queryLogsLogGroupArn data))
  (when-let [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (when-let [data (lookup-entry config id :zone-name)]
    (. builder zoneName data))
  (.build builder))


(defn private-hosted-zone-props-builder
  "Creates a  `PrivateHostedZoneProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-private-hosted-zone-props-builder (new PrivateHostedZoneProps$Builder) id config))


(defn build-public-hosted-zone-attributes-builder
  "The build-public-hosted-zone-attributes-builder function updates a PublicHostedZoneAttributes$Builder instance using the provided configuration.
  The function takes the PublicHostedZoneAttributes$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |
"
  [^PublicHostedZoneAttributes$Builder builder id config]
  (when-let [data (lookup-entry config id :hosted-zone-id)]
    (. builder hostedZoneId data))
  (when-let [data (lookup-entry config id :zone-name)]
    (. builder zoneName data))
  (.build builder))


(defn public-hosted-zone-attributes-builder
  "Creates a  `PublicHostedZoneAttributes$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-public-hosted-zone-attributes-builder (new PublicHostedZoneAttributes$Builder) id config))


(defn build-public-hosted-zone-builder
  "The build-public-hosted-zone-builder function updates a PublicHostedZone$Builder instance using the provided configuration.
  The function takes the PublicHostedZone$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `caaAmazon` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caa-amazon` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `crossAccountZoneDelegationPrincipal` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:cross-account-zone-delegation-principal` |
| `crossAccountZoneDelegationRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cross-account-zone-delegation-role-name` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |
"
  [^PublicHostedZone$Builder builder id config]
  (when-let [data (lookup-entry config id :add-trailing-dot)]
    (. builder addTrailingDot data))
  (when-let [data (lookup-entry config id :caa-amazon)]
    (. builder caaAmazon data))
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :cross-account-zone-delegation-principal)]
    (. builder crossAccountZoneDelegationPrincipal data))
  (when-let [data (lookup-entry config id :cross-account-zone-delegation-role-name)]
    (. builder crossAccountZoneDelegationRoleName data))
  (when-let [data (lookup-entry config id :query-logs-log-group-arn)]
    (. builder queryLogsLogGroupArn data))
  (when-let [data (lookup-entry config id :zone-name)]
    (. builder zoneName data))
  (.build builder))


(defn public-hosted-zone-builder
  "Creates a  `PublicHostedZone$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-public-hosted-zone-builder (PublicHostedZone$Builder/create scope (name id)) id config))


(defn build-public-hosted-zone-props-builder
  "The build-public-hosted-zone-props-builder function updates a PublicHostedZoneProps$Builder instance using the provided configuration.
  The function takes the PublicHostedZoneProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `caaAmazon` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caa-amazon` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `crossAccountZoneDelegationPrincipal` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:cross-account-zone-delegation-principal` |
| `crossAccountZoneDelegationRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cross-account-zone-delegation-role-name` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |
"
  [^PublicHostedZoneProps$Builder builder id config]
  (when-let [data (lookup-entry config id :add-trailing-dot)]
    (. builder addTrailingDot data))
  (when-let [data (lookup-entry config id :caa-amazon)]
    (. builder caaAmazon data))
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :cross-account-zone-delegation-principal)]
    (. builder crossAccountZoneDelegationPrincipal data))
  (when-let [data (lookup-entry config id :cross-account-zone-delegation-role-name)]
    (. builder crossAccountZoneDelegationRoleName data))
  (when-let [data (lookup-entry config id :query-logs-log-group-arn)]
    (. builder queryLogsLogGroupArn data))
  (when-let [data (lookup-entry config id :zone-name)]
    (. builder zoneName data))
  (.build builder))


(defn public-hosted-zone-props-builder
  "Creates a  `PublicHostedZoneProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-public-hosted-zone-props-builder (new PublicHostedZoneProps$Builder) id config))


(defn build-record-set-builder
  "The build-record-set-builder function updates a RecordSet$Builder instance using the provided configuration.
  The function takes the RecordSet$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `recordType` | software.amazon.awscdk.services.route53.RecordType | [[cdk.api.services.route53/record-type]] | `:record-type` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `target` | software.amazon.awscdk.services.route53.RecordTarget | [[cdk.support/lookup-entry]] | `:target` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^RecordSet$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (record-type config id :record-type)]
    (. builder recordType data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn record-set-builder
  "Creates a  `RecordSet$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-record-set-builder (RecordSet$Builder/create scope (name id)) id config))


(defn build-record-set-options-builder
  "The build-record-set-options-builder function updates a RecordSetOptions$Builder instance using the provided configuration.
  The function takes the RecordSetOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^RecordSetOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn record-set-options-builder
  "Creates a  `RecordSetOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-record-set-options-builder (new RecordSetOptions$Builder) id config))


(defn build-record-set-props-builder
  "The build-record-set-props-builder function updates a RecordSetProps$Builder instance using the provided configuration.
  The function takes the RecordSetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `recordType` | software.amazon.awscdk.services.route53.RecordType | [[cdk.api.services.route53/record-type]] | `:record-type` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `target` | software.amazon.awscdk.services.route53.RecordTarget | [[cdk.support/lookup-entry]] | `:target` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^RecordSetProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (record-type config id :record-type)]
    (. builder recordType data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :target)]
    (. builder target data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn record-set-props-builder
  "Creates a  `RecordSetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-record-set-props-builder (new RecordSetProps$Builder) id config))


(defn build-srv-record-builder
  "The build-srv-record-builder function updates a SrvRecord$Builder instance using the provided configuration.
  The function takes the SrvRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^SrvRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn srv-record-builder
  "Creates a  `SrvRecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-srv-record-builder (SrvRecord$Builder/create scope (name id)) id config))


(defn build-srv-record-props-builder
  "The build-srv-record-props-builder function updates a SrvRecordProps$Builder instance using the provided configuration.
  The function takes the SrvRecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^SrvRecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn srv-record-props-builder
  "Creates a  `SrvRecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-srv-record-props-builder (new SrvRecordProps$Builder) id config))


(defn build-srv-record-value-builder
  "The build-srv-record-value-builder function updates a SrvRecordValue$Builder instance using the provided configuration.
  The function takes the SrvRecordValue$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
"
  [^SrvRecordValue$Builder builder id config]
  (when-let [data (lookup-entry config id :host-name)]
    (. builder hostName data))
  (when-let [data (lookup-entry config id :port)]
    (. builder port data))
  (when-let [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (.build builder))


(defn srv-record-value-builder
  "Creates a  `SrvRecordValue$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-srv-record-value-builder (new SrvRecordValue$Builder) id config))


(defn build-txt-record-builder
  "The build-txt-record-builder function updates a TxtRecord$Builder instance using the provided configuration.
  The function takes the TxtRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^TxtRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn txt-record-builder
  "Creates a  `TxtRecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-txt-record-builder (TxtRecord$Builder/create scope (name id)) id config))


(defn build-txt-record-props-builder
  "The build-txt-record-props-builder function updates a TxtRecordProps$Builder instance using the provided configuration.
  The function takes the TxtRecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `values` | java.util.List | [[cdk.support/lookup-entry]] | `:values` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^TxtRecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :values)]
    (. builder values data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn txt-record-props-builder
  "Creates a  `TxtRecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-txt-record-props-builder (new TxtRecordProps$Builder) id config))


(defn build-vpc-endpoint-service-domain-name-builder
  "The build-vpc-endpoint-service-domain-name-builder function updates a VpcEndpointServiceDomainName$Builder instance using the provided configuration.
  The function takes the VpcEndpointServiceDomainName$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointService` | software.amazon.awscdk.services.ec2.IVpcEndpointService | [[cdk.support/lookup-entry]] | `:endpoint-service` |
| `publicHostedZone` | software.amazon.awscdk.services.route53.IPublicHostedZone | [[cdk.support/lookup-entry]] | `:public-hosted-zone` |
"
  [^VpcEndpointServiceDomainName$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :endpoint-service)]
    (. builder endpointService data))
  (when-let [data (lookup-entry config id :public-hosted-zone)]
    (. builder publicHostedZone data))
  (.build builder))


(defn vpc-endpoint-service-domain-name-builder
  "Creates a  `VpcEndpointServiceDomainName$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-vpc-endpoint-service-domain-name-builder (VpcEndpointServiceDomainName$Builder/create scope (name id)) id config))


(defn build-vpc-endpoint-service-domain-name-props-builder
  "The build-vpc-endpoint-service-domain-name-props-builder function updates a VpcEndpointServiceDomainNameProps$Builder instance using the provided configuration.
  The function takes the VpcEndpointServiceDomainNameProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointService` | software.amazon.awscdk.services.ec2.IVpcEndpointService | [[cdk.support/lookup-entry]] | `:endpoint-service` |
| `publicHostedZone` | software.amazon.awscdk.services.route53.IPublicHostedZone | [[cdk.support/lookup-entry]] | `:public-hosted-zone` |
"
  [^VpcEndpointServiceDomainNameProps$Builder builder id config]
  (when-let [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-let [data (lookup-entry config id :endpoint-service)]
    (. builder endpointService data))
  (when-let [data (lookup-entry config id :public-hosted-zone)]
    (. builder publicHostedZone data))
  (.build builder))


(defn vpc-endpoint-service-domain-name-props-builder
  "Creates a  `VpcEndpointServiceDomainNameProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-vpc-endpoint-service-domain-name-props-builder (new VpcEndpointServiceDomainNameProps$Builder) id config))


(defn build-zone-delegation-options-builder
  "The build-zone-delegation-options-builder function updates a ZoneDelegationOptions$Builder instance using the provided configuration.
  The function takes the ZoneDelegationOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
"
  [^ZoneDelegationOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (.build builder))


(defn zone-delegation-options-builder
  "Creates a  `ZoneDelegationOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-zone-delegation-options-builder (new ZoneDelegationOptions$Builder) id config))


(defn build-zone-delegation-record-builder
  "The build-zone-delegation-record-builder function updates a ZoneDelegationRecord$Builder instance using the provided configuration.
  The function takes the ZoneDelegationRecord$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `nameServers` | java.util.List | [[cdk.support/lookup-entry]] | `:name-servers` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^ZoneDelegationRecord$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :name-servers)]
    (. builder nameServers data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn zone-delegation-record-builder
  "Creates a  `ZoneDelegationRecord$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (build-zone-delegation-record-builder (ZoneDelegationRecord$Builder/create scope (name id)) id config))


(defn build-zone-delegation-record-props-builder
  "The build-zone-delegation-record-props-builder function updates a ZoneDelegationRecordProps$Builder instance using the provided configuration.
  The function takes the ZoneDelegationRecordProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `deleteExisting` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:delete-existing` |
| `geoLocation` | software.amazon.awscdk.services.route53.GeoLocation | [[cdk.support/lookup-entry]] | `:geo-location` |
| `multiValueAnswer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:multi-value-answer` |
| `nameServers` | java.util.List | [[cdk.support/lookup-entry]] | `:name-servers` |
| `recordName` | java.lang.String | [[cdk.support/lookup-entry]] | `:record-name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |
| `setIdentifier` | java.lang.String | [[cdk.support/lookup-entry]] | `:set-identifier` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |
"
  [^ZoneDelegationRecordProps$Builder builder id config]
  (when-let [data (lookup-entry config id :comment)]
    (. builder comment data))
  (when-let [data (lookup-entry config id :delete-existing)]
    (. builder deleteExisting data))
  (when-let [data (lookup-entry config id :geo-location)]
    (. builder geoLocation data))
  (when-let [data (lookup-entry config id :multi-value-answer)]
    (. builder multiValueAnswer data))
  (when-let [data (lookup-entry config id :name-servers)]
    (. builder nameServers data))
  (when-let [data (lookup-entry config id :record-name)]
    (. builder recordName data))
  (when-let [data (lookup-entry config id :region)]
    (. builder region data))
  (when-let [data (lookup-entry config id :set-identifier)]
    (. builder setIdentifier data))
  (when-let [data (lookup-entry config id :ttl)]
    (. builder ttl data))
  (when-let [data (lookup-entry config id :weight)]
    (. builder weight data))
  (when-let [data (lookup-entry config id :zone)]
    (. builder zone data))
  (.build builder))


(defn zone-delegation-record-props-builder
  "Creates a  `ZoneDelegationRecordProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-zone-delegation-record-props-builder (new ZoneDelegationRecordProps$Builder) id config))


(defn build-zone-signing-options-builder
  "The build-zone-signing-options-builder function updates a ZoneSigningOptions$Builder instance using the provided configuration.
  The function takes the ZoneSigningOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keySigningKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-signing-key-name` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
"
  [^ZoneSigningOptions$Builder builder id config]
  (when-let [data (lookup-entry config id :key-signing-key-name)]
    (. builder keySigningKeyName data))
  (when-let [data (lookup-entry config id :kms-key)]
    (. builder kmsKey data))
  (.build builder))


(defn zone-signing-options-builder
  "Creates a  `ZoneSigningOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (build-zone-signing-options-builder (new ZoneSigningOptions$Builder) id config))