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


(defn a-record-attrs-builder
  "The a-record-attrs-builder function buildes out new instances of 
ARecordAttrs$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (ARecordAttrs$Builder.)]
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
    (.build builder)))


(defn a-record-builder
  "The a-record-builder function buildes out new instances of 
ARecord$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (ARecord$Builder/create stack id)]
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
    (.build builder)))


(defn a-record-props-builder
  "The a-record-props-builder function buildes out new instances of 
ARecordProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (ARecordProps$Builder.)]
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
    (.build builder)))


(defn aaaa-record-builder
  "The aaaa-record-builder function buildes out new instances of 
AaaaRecord$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (AaaaRecord$Builder/create stack id)]
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
    (.build builder)))


(defn aaaa-record-props-builder
  "The aaaa-record-props-builder function buildes out new instances of 
AaaaRecordProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (AaaaRecordProps$Builder.)]
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
    (.build builder)))


(defn alias-record-target-config-builder
  "The alias-record-target-config-builder function buildes out new instances of 
AliasRecordTargetConfig$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |"
  [stack id config]
  (let [builder (AliasRecordTargetConfig$Builder.)]
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (.build builder)))


(defn caa-amazon-record-builder
  "The caa-amazon-record-builder function buildes out new instances of 
CaaAmazonRecord$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (CaaAmazonRecord$Builder/create stack id)]
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
    (.build builder)))


(defn caa-amazon-record-props-builder
  "The caa-amazon-record-props-builder function buildes out new instances of 
CaaAmazonRecordProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (CaaAmazonRecordProps$Builder.)]
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
    (.build builder)))


(defn caa-record-builder
  "The caa-record-builder function buildes out new instances of 
CaaRecord$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (CaaRecord$Builder/create stack id)]
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
    (.build builder)))


(defn caa-record-props-builder
  "The caa-record-props-builder function buildes out new instances of 
CaaRecordProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (CaaRecordProps$Builder.)]
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
    (.build builder)))


(defn caa-record-value-builder
  "The caa-record-value-builder function buildes out new instances of 
CaaRecordValue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `flag` | java.lang.Number | [[cdk.support/lookup-entry]] | `:flag` |
| `tag` | software.amazon.awscdk.services.route53.CaaTag | [[cdk.api.services.route53/caa-tag]] | `:tag` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CaaRecordValue$Builder.)]
    (when-let [data (lookup-entry config id :flag)]
      (. builder flag data))
    (when-let [data (caa-tag config id :tag)]
      (. builder tag data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-cidr-collection-builder
  "The cfn-cidr-collection-builder function buildes out new instances of 
CfnCidrCollection$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locations` | java.util.List | [[cdk.support/lookup-entry]] | `:locations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnCidrCollection$Builder/create stack id)]
    (when-let [data (lookup-entry config id :locations)]
      (. builder locations data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-cidr-collection-location-property-builder
  "The cfn-cidr-collection-location-property-builder function buildes out new instances of 
CfnCidrCollection$LocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cidrList` | java.util.List | [[cdk.support/lookup-entry]] | `:cidr-list` |
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |"
  [stack id config]
  (let [builder (CfnCidrCollection$LocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :cidr-list)]
      (. builder cidrList data))
    (when-let [data (lookup-entry config id :location-name)]
      (. builder locationName data))
    (.build builder)))


(defn cfn-cidr-collection-props-builder
  "The cfn-cidr-collection-props-builder function buildes out new instances of 
CfnCidrCollectionProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `locations` | java.util.List | [[cdk.support/lookup-entry]] | `:locations` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |"
  [stack id config]
  (let [builder (CfnCidrCollectionProps$Builder.)]
    (when-let [data (lookup-entry config id :locations)]
      (. builder locations data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (.build builder)))


(defn cfn-dnssec-builder
  "The cfn-dnssec-builder function buildes out new instances of 
CfnDNSSEC$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |"
  [stack id config]
  (let [builder (CfnDNSSEC$Builder/create stack id)]
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (.build builder)))


(defn cfn-dnssec-props-builder
  "The cfn-dnssec-props-builder function buildes out new instances of 
CfnDNSSECProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |"
  [stack id config]
  (let [builder (CfnDNSSECProps$Builder.)]
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (.build builder)))


(defn cfn-health-check-alarm-identifier-property-builder
  "The cfn-health-check-alarm-identifier-property-builder function buildes out new instances of 
CfnHealthCheck$AlarmIdentifierProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `region` | java.lang.String | [[cdk.support/lookup-entry]] | `:region` |"
  [stack id config]
  (let [builder (CfnHealthCheck$AlarmIdentifierProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :region)]
      (. builder region data))
    (.build builder)))


(defn cfn-health-check-builder
  "The cfn-health-check-builder function buildes out new instances of 
CfnHealthCheck$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthCheckConfig` | software.amazon.awscdk.services.route53.CfnHealthCheck$HealthCheckConfigProperty | [[cdk.support/lookup-entry]] | `:health-check-config` |
| `healthCheckTags` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-tags` |"
  [stack id config]
  (let [builder (CfnHealthCheck$Builder/create stack id)]
    (when-let [data (lookup-entry config id :health-check-config)]
      (. builder healthCheckConfig data))
    (when-let [data (lookup-entry config id :health-check-tags)]
      (. builder healthCheckTags data))
    (.build builder)))


(defn cfn-health-check-health-check-config-property-builder
  "The cfn-health-check-health-check-config-property-builder function buildes out new instances of 
CfnHealthCheck$HealthCheckConfigProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `type` | java.lang.String | [[cdk.support/lookup-entry]] | `:type` |"
  [stack id config]
  (let [builder (CfnHealthCheck$HealthCheckConfigProperty$Builder.)]
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
    (.build builder)))


(defn cfn-health-check-health-check-tag-property-builder
  "The cfn-health-check-health-check-tag-property-builder function buildes out new instances of 
CfnHealthCheck$HealthCheckTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnHealthCheck$HealthCheckTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-health-check-props-builder
  "The cfn-health-check-props-builder function buildes out new instances of 
CfnHealthCheckProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthCheckConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check-config` |
| `healthCheckTags` | java.util.List | [[cdk.support/lookup-entry]] | `:health-check-tags` |"
  [stack id config]
  (let [builder (CfnHealthCheckProps$Builder.)]
    (when-let [data (lookup-entry config id :health-check-config)]
      (. builder healthCheckConfig data))
    (when-let [data (lookup-entry config id :health-check-tags)]
      (. builder healthCheckTags data))
    (.build builder)))


(defn cfn-hosted-zone-builder
  "The cfn-hosted-zone-builder function buildes out new instances of 
CfnHostedZone$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneConfig` | software.amazon.awscdk.services.route53.CfnHostedZone$HostedZoneConfigProperty | [[cdk.support/lookup-entry]] | `:hosted-zone-config` |
| `hostedZoneTags` | java.util.List | [[cdk.support/lookup-entry]] | `:hosted-zone-tags` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryLoggingConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:query-logging-config` |
| `vpcs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpcs` |"
  [stack id config]
  (let [builder (CfnHostedZone$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-hosted-zone-hosted-zone-config-property-builder
  "The cfn-hosted-zone-hosted-zone-config-property-builder function buildes out new instances of 
CfnHostedZone$HostedZoneConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |"
  [stack id config]
  (let [builder (CfnHostedZone$HostedZoneConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (.build builder)))


(defn cfn-hosted-zone-hosted-zone-tag-property-builder
  "The cfn-hosted-zone-hosted-zone-tag-property-builder function buildes out new instances of 
CfnHostedZone$HostedZoneTagProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `key` | java.lang.String | [[cdk.support/lookup-entry]] | `:key` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnHostedZone$HostedZoneTagProperty$Builder.)]
    (when-let [data (lookup-entry config id :key)]
      (. builder key data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-hosted-zone-props-builder
  "The cfn-hosted-zone-props-builder function buildes out new instances of 
CfnHostedZoneProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneConfig` | software.amazon.awscdk.services.route53.CfnHostedZone$HostedZoneConfigProperty | [[cdk.support/lookup-entry]] | `:hosted-zone-config` |
| `hostedZoneTags` | java.util.List | [[cdk.support/lookup-entry]] | `:hosted-zone-tags` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `queryLoggingConfig` | software.amazon.awscdk.services.route53.CfnHostedZone$QueryLoggingConfigProperty | [[cdk.support/lookup-entry]] | `:query-logging-config` |
| `vpcs` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:vpcs` |"
  [stack id config]
  (let [builder (CfnHostedZoneProps$Builder.)]
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
    (.build builder)))


(defn cfn-hosted-zone-query-logging-config-property-builder
  "The cfn-hosted-zone-query-logging-config-property-builder function buildes out new instances of 
CfnHostedZone$QueryLoggingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudWatchLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:cloud-watch-logs-log-group-arn` |"
  [stack id config]
  (let [builder (CfnHostedZone$QueryLoggingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :cloud-watch-logs-log-group-arn)]
      (. builder cloudWatchLogsLogGroupArn data))
    (.build builder)))


(defn cfn-hosted-zone-vpc-property-builder
  "The cfn-hosted-zone-vpc-property-builder function buildes out new instances of 
CfnHostedZone$VPCProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |
| `vpcRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-region` |"
  [stack id config]
  (let [builder (CfnHostedZone$VPCProperty$Builder.)]
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (when-let [data (lookup-entry config id :vpc-region)]
      (. builder vpcRegion data))
    (.build builder)))


(defn cfn-key-signing-key-builder
  "The cfn-key-signing-key-builder function buildes out new instances of 
CfnKeySigningKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `keyManagementServiceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-management-service-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnKeySigningKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (when-let [data (lookup-entry config id :key-management-service-arn)]
      (. builder keyManagementServiceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-key-signing-key-props-builder
  "The cfn-key-signing-key-props-builder function buildes out new instances of 
CfnKeySigningKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `keyManagementServiceArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-management-service-arn` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |"
  [stack id config]
  (let [builder (CfnKeySigningKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (when-let [data (lookup-entry config id :key-management-service-arn)]
      (. builder keyManagementServiceArn data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (.build builder)))


(defn cfn-record-set-alias-target-property-builder
  "The cfn-record-set-alias-target-property-builder function buildes out new instances of 
CfnRecordSet$AliasTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `evaluateTargetHealth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:evaluate-target-health` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |"
  [stack id config]
  (let [builder (CfnRecordSet$AliasTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :evaluate-target-health)]
      (. builder evaluateTargetHealth data))
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (.build builder)))


(defn cfn-record-set-builder
  "The cfn-record-set-builder function buildes out new instances of 
CfnRecordSet$Builder using the provided configuration.  Each field is set as follows:

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
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnRecordSet$Builder/create stack id)]
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
    (.build builder)))


(defn cfn-record-set-cidr-routing-config-property-builder
  "The cfn-record-set-cidr-routing-config-property-builder function buildes out new instances of 
CfnRecordSet$CidrRoutingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |"
  [stack id config]
  (let [builder (CfnRecordSet$CidrRoutingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :collection-id)]
      (. builder collectionId data))
    (when-let [data (lookup-entry config id :location-name)]
      (. builder locationName data))
    (.build builder)))


(defn cfn-record-set-coordinates-property-builder
  "The cfn-record-set-coordinates-property-builder function buildes out new instances of 
CfnRecordSet$CoordinatesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `latitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:longitude` |"
  [stack id config]
  (let [builder (CfnRecordSet$CoordinatesProperty$Builder.)]
    (when-let [data (lookup-entry config id :latitude)]
      (. builder latitude data))
    (when-let [data (lookup-entry config id :longitude)]
      (. builder longitude data))
    (.build builder)))


(defn cfn-record-set-geo-location-property-builder
  "The cfn-record-set-geo-location-property-builder function buildes out new instances of 
CfnRecordSet$GeoLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `continentCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:continent-code` |
| `countryCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:country-code` |
| `subdivisionCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdivision-code` |"
  [stack id config]
  (let [builder (CfnRecordSet$GeoLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :continent-code)]
      (. builder continentCode data))
    (when-let [data (lookup-entry config id :country-code)]
      (. builder countryCode data))
    (when-let [data (lookup-entry config id :subdivision-code)]
      (. builder subdivisionCode data))
    (.build builder)))


(defn cfn-record-set-geo-proximity-location-property-builder
  "The cfn-record-set-geo-proximity-location-property-builder function buildes out new instances of 
CfnRecordSet$GeoProximityLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `bias` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bias` |
| `coordinates` | software.amazon.awscdk.services.route53.CfnRecordSet$CoordinatesProperty | [[cdk.support/lookup-entry]] | `:coordinates` |
| `localZoneGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-zone-group` |"
  [stack id config]
  (let [builder (CfnRecordSet$GeoProximityLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-region)]
      (. builder awsRegion data))
    (when-let [data (lookup-entry config id :bias)]
      (. builder bias data))
    (when-let [data (lookup-entry config id :coordinates)]
      (. builder coordinates data))
    (when-let [data (lookup-entry config id :local-zone-group)]
      (. builder localZoneGroup data))
    (.build builder)))


(defn cfn-record-set-group-alias-target-property-builder
  "The cfn-record-set-group-alias-target-property-builder function buildes out new instances of 
CfnRecordSetGroup$AliasTargetProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `dnsName` | java.lang.String | [[cdk.support/lookup-entry]] | `:dns-name` |
| `evaluateTargetHealth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:evaluate-target-health` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |"
  [stack id config]
  (let [builder (CfnRecordSetGroup$AliasTargetProperty$Builder.)]
    (when-let [data (lookup-entry config id :dns-name)]
      (. builder dnsName data))
    (when-let [data (lookup-entry config id :evaluate-target-health)]
      (. builder evaluateTargetHealth data))
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (.build builder)))


(defn cfn-record-set-group-builder
  "The cfn-record-set-group-builder function buildes out new instances of 
CfnRecordSetGroup$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `hostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-name` |
| `recordSets` | java.util.List | [[cdk.support/lookup-entry]] | `:record-sets` |"
  [stack id config]
  (let [builder (CfnRecordSetGroup$Builder/create stack id)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (when-let [data (lookup-entry config id :hosted-zone-name)]
      (. builder hostedZoneName data))
    (when-let [data (lookup-entry config id :record-sets)]
      (. builder recordSets data))
    (.build builder)))


(defn cfn-record-set-group-cidr-routing-config-property-builder
  "The cfn-record-set-group-cidr-routing-config-property-builder function buildes out new instances of 
CfnRecordSetGroup$CidrRoutingConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `collectionId` | java.lang.String | [[cdk.support/lookup-entry]] | `:collection-id` |
| `locationName` | java.lang.String | [[cdk.support/lookup-entry]] | `:location-name` |"
  [stack id config]
  (let [builder (CfnRecordSetGroup$CidrRoutingConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :collection-id)]
      (. builder collectionId data))
    (when-let [data (lookup-entry config id :location-name)]
      (. builder locationName data))
    (.build builder)))


(defn cfn-record-set-group-coordinates-property-builder
  "The cfn-record-set-group-coordinates-property-builder function buildes out new instances of 
CfnRecordSetGroup$CoordinatesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `latitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:latitude` |
| `longitude` | java.lang.String | [[cdk.support/lookup-entry]] | `:longitude` |"
  [stack id config]
  (let [builder (CfnRecordSetGroup$CoordinatesProperty$Builder.)]
    (when-let [data (lookup-entry config id :latitude)]
      (. builder latitude data))
    (when-let [data (lookup-entry config id :longitude)]
      (. builder longitude data))
    (.build builder)))


(defn cfn-record-set-group-geo-location-property-builder
  "The cfn-record-set-group-geo-location-property-builder function buildes out new instances of 
CfnRecordSetGroup$GeoLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `continentCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:continent-code` |
| `countryCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:country-code` |
| `subdivisionCode` | java.lang.String | [[cdk.support/lookup-entry]] | `:subdivision-code` |"
  [stack id config]
  (let [builder (CfnRecordSetGroup$GeoLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :continent-code)]
      (. builder continentCode data))
    (when-let [data (lookup-entry config id :country-code)]
      (. builder countryCode data))
    (when-let [data (lookup-entry config id :subdivision-code)]
      (. builder subdivisionCode data))
    (.build builder)))


(defn cfn-record-set-group-geo-proximity-location-property-builder
  "The cfn-record-set-group-geo-proximity-location-property-builder function buildes out new instances of 
CfnRecordSetGroup$GeoProximityLocationProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `awsRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:aws-region` |
| `bias` | java.lang.Number | [[cdk.support/lookup-entry]] | `:bias` |
| `coordinates` | software.amazon.awscdk.services.route53.CfnRecordSetGroup$CoordinatesProperty | [[cdk.support/lookup-entry]] | `:coordinates` |
| `localZoneGroup` | java.lang.String | [[cdk.support/lookup-entry]] | `:local-zone-group` |"
  [stack id config]
  (let [builder (CfnRecordSetGroup$GeoProximityLocationProperty$Builder.)]
    (when-let [data (lookup-entry config id :aws-region)]
      (. builder awsRegion data))
    (when-let [data (lookup-entry config id :bias)]
      (. builder bias data))
    (when-let [data (lookup-entry config id :coordinates)]
      (. builder coordinates data))
    (when-let [data (lookup-entry config id :local-zone-group)]
      (. builder localZoneGroup data))
    (.build builder)))


(defn cfn-record-set-group-props-builder
  "The cfn-record-set-group-props-builder function buildes out new instances of 
CfnRecordSetGroupProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `hostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-name` |
| `recordSets` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:record-sets` |"
  [stack id config]
  (let [builder (CfnRecordSetGroupProps$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (when-let [data (lookup-entry config id :hosted-zone-name)]
      (. builder hostedZoneName data))
    (when-let [data (lookup-entry config id :record-sets)]
      (. builder recordSets data))
    (.build builder)))


(defn cfn-record-set-group-record-set-property-builder
  "The cfn-record-set-group-record-set-property-builder function buildes out new instances of 
CfnRecordSetGroup$RecordSetProperty$Builder using the provided configuration.  Each field is set as follows:

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
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnRecordSetGroup$RecordSetProperty$Builder.)]
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
    (.build builder)))


(defn cfn-record-set-props-builder
  "The cfn-record-set-props-builder function buildes out new instances of 
CfnRecordSetProps$Builder using the provided configuration.  Each field is set as follows:

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
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (CfnRecordSetProps$Builder.)]
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
    (.build builder)))


(defn cname-record-builder
  "The cname-record-builder function buildes out new instances of 
CnameRecord$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (CnameRecord$Builder/create stack id)]
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
    (.build builder)))


(defn cname-record-props-builder
  "The cname-record-props-builder function buildes out new instances of 
CnameRecordProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (CnameRecordProps$Builder.)]
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
    (.build builder)))


(defn common-hosted-zone-props-builder
  "The common-hosted-zone-props-builder function buildes out new instances of 
CommonHostedZoneProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |"
  [stack id config]
  (let [builder (CommonHostedZoneProps$Builder.)]
    (when-let [data (lookup-entry config id :add-trailing-dot)]
      (. builder addTrailingDot data))
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :query-logs-log-group-arn)]
      (. builder queryLogsLogGroupArn data))
    (when-let [data (lookup-entry config id :zone-name)]
      (. builder zoneName data))
    (.build builder)))


(defn cross-account-zone-delegation-record-builder
  "The cross-account-zone-delegation-record-builder function buildes out new instances of 
CrossAccountZoneDelegationRecord$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRoleRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-region` |
| `delegatedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:delegated-zone` |
| `delegationRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:delegation-role` |
| `parentHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-hosted-zone-id` |
| `parentHostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-hosted-zone-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |"
  [stack id config]
  (let [builder (CrossAccountZoneDelegationRecord$Builder/create stack id)]
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
    (.build builder)))


(defn cross-account-zone-delegation-record-props-builder
  "The cross-account-zone-delegation-record-props-builder function buildes out new instances of 
CrossAccountZoneDelegationRecordProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assumeRoleRegion` | java.lang.String | [[cdk.support/lookup-entry]] | `:assume-role-region` |
| `delegatedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:delegated-zone` |
| `delegationRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:delegation-role` |
| `parentHostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-hosted-zone-id` |
| `parentHostedZoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:parent-hosted-zone-name` |
| `removalPolicy` | software.amazon.awscdk.RemovalPolicy | [[cdk.api/removal-policy]] | `:removal-policy` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |"
  [stack id config]
  (let [builder (CrossAccountZoneDelegationRecordProps$Builder.)]
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
    (.build builder)))


(defn ds-record-builder
  "The ds-record-builder function buildes out new instances of 
DsRecord$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (DsRecord$Builder/create stack id)]
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
    (.build builder)))


(defn ds-record-props-builder
  "The ds-record-props-builder function buildes out new instances of 
DsRecordProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (DsRecordProps$Builder.)]
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
    (.build builder)))


(defn hosted-zone-attributes-builder
  "The hosted-zone-attributes-builder function buildes out new instances of 
HostedZoneAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |"
  [stack id config]
  (let [builder (HostedZoneAttributes$Builder.)]
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (when-let [data (lookup-entry config id :zone-name)]
      (. builder zoneName data))
    (.build builder)))


(defn hosted-zone-builder
  "The hosted-zone-builder function buildes out new instances of 
HostedZone$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `vpcs` | java.util.List | [[cdk.support/lookup-entry]] | `:vpcs` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |"
  [stack id config]
  (let [builder (HostedZone$Builder/create stack id)]
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
    (.build builder)))


(defn hosted-zone-props-builder
  "The hosted-zone-props-builder function buildes out new instances of 
HostedZoneProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `vpcs` | java.util.List | [[cdk.support/lookup-entry]] | `:vpcs` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |"
  [stack id config]
  (let [builder (HostedZoneProps$Builder.)]
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
    (.build builder)))


(defn hosted-zone-provider-props-builder
  "The hosted-zone-provider-props-builder function buildes out new instances of 
HostedZoneProviderProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `privateZone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:private-zone` |
| `vpcId` | java.lang.String | [[cdk.support/lookup-entry]] | `:vpc-id` |"
  [stack id config]
  (let [builder (HostedZoneProviderProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :private-zone)]
      (. builder privateZone data))
    (when-let [data (lookup-entry config id :vpc-id)]
      (. builder vpcId data))
    (.build builder)))


(defn key-signing-key-attributes-builder
  "The key-signing-key-attributes-builder function buildes out new instances of 
KeySigningKeyAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:hosted-zone` |
| `keySigningKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-signing-key-name` |"
  [stack id config]
  (let [builder (KeySigningKeyAttributes$Builder.)]
    (when-let [data (lookup-entry config id :hosted-zone)]
      (. builder hostedZone data))
    (when-let [data (lookup-entry config id :key-signing-key-name)]
      (. builder keySigningKeyName data))
    (.build builder)))


(defn key-signing-key-builder
  "The key-signing-key-builder function buildes out new instances of 
KeySigningKey$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:hosted-zone` |
| `keySigningKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-signing-key-name` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `status` | software.amazon.awscdk.services.route53.KeySigningKeyStatus | [[cdk.api.services.route53/key-signing-key-status]] | `:status` |"
  [stack id config]
  (let [builder (KeySigningKey$Builder/create stack id)]
    (when-let [data (lookup-entry config id :hosted-zone)]
      (. builder hostedZone data))
    (when-let [data (lookup-entry config id :key-signing-key-name)]
      (. builder keySigningKeyName data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (key-signing-key-status config id :status)]
      (. builder status data))
    (.build builder)))


(defn key-signing-key-props-builder
  "The key-signing-key-props-builder function buildes out new instances of 
KeySigningKeyProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:hosted-zone` |
| `keySigningKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-signing-key-name` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |
| `status` | software.amazon.awscdk.services.route53.KeySigningKeyStatus | [[cdk.api.services.route53/key-signing-key-status]] | `:status` |"
  [stack id config]
  (let [builder (KeySigningKeyProps$Builder.)]
    (when-let [data (lookup-entry config id :hosted-zone)]
      (. builder hostedZone data))
    (when-let [data (lookup-entry config id :key-signing-key-name)]
      (. builder keySigningKeyName data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (when-let [data (key-signing-key-status config id :status)]
      (. builder status data))
    (.build builder)))


(defn mx-record-builder
  "The mx-record-builder function buildes out new instances of 
MxRecord$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (MxRecord$Builder/create stack id)]
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
    (.build builder)))


(defn mx-record-props-builder
  "The mx-record-props-builder function buildes out new instances of 
MxRecordProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (MxRecordProps$Builder.)]
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
    (.build builder)))


(defn mx-record-value-builder
  "The mx-record-value-builder function buildes out new instances of 
MxRecordValue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-name` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |"
  [stack id config]
  (let [builder (MxRecordValue$Builder.)]
    (when-let [data (lookup-entry config id :host-name)]
      (. builder hostName data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (.build builder)))


(defn ns-record-builder
  "The ns-record-builder function buildes out new instances of 
NsRecord$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (NsRecord$Builder/create stack id)]
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
    (.build builder)))


(defn ns-record-props-builder
  "The ns-record-props-builder function buildes out new instances of 
NsRecordProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (NsRecordProps$Builder.)]
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
    (.build builder)))


(defn private-hosted-zone-builder
  "The private-hosted-zone-builder function buildes out new instances of 
PrivateHostedZone$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |"
  [stack id config]
  (let [builder (PrivateHostedZone$Builder/create stack id)]
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
    (.build builder)))


(defn private-hosted-zone-props-builder
  "The private-hosted-zone-props-builder function buildes out new instances of 
PrivateHostedZoneProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |"
  [stack id config]
  (let [builder (PrivateHostedZoneProps$Builder.)]
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
    (.build builder)))


(defn public-hosted-zone-attributes-builder
  "The public-hosted-zone-attributes-builder function buildes out new instances of 
PublicHostedZoneAttributes$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostedZoneId` | java.lang.String | [[cdk.support/lookup-entry]] | `:hosted-zone-id` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |"
  [stack id config]
  (let [builder (PublicHostedZoneAttributes$Builder.)]
    (when-let [data (lookup-entry config id :hosted-zone-id)]
      (. builder hostedZoneId data))
    (when-let [data (lookup-entry config id :zone-name)]
      (. builder zoneName data))
    (.build builder)))


(defn public-hosted-zone-builder
  "The public-hosted-zone-builder function buildes out new instances of 
PublicHostedZone$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `caaAmazon` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caa-amazon` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `crossAccountZoneDelegationPrincipal` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:cross-account-zone-delegation-principal` |
| `crossAccountZoneDelegationRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cross-account-zone-delegation-role-name` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |"
  [stack id config]
  (let [builder (PublicHostedZone$Builder/create stack id)]
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
    (.build builder)))


(defn public-hosted-zone-props-builder
  "The public-hosted-zone-props-builder function buildes out new instances of 
PublicHostedZoneProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `addTrailingDot` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:add-trailing-dot` |
| `caaAmazon` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:caa-amazon` |
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `crossAccountZoneDelegationPrincipal` | software.amazon.awscdk.services.iam.IPrincipal | [[cdk.support/lookup-entry]] | `:cross-account-zone-delegation-principal` |
| `crossAccountZoneDelegationRoleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cross-account-zone-delegation-role-name` |
| `queryLogsLogGroupArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:query-logs-log-group-arn` |
| `zoneName` | java.lang.String | [[cdk.support/lookup-entry]] | `:zone-name` |"
  [stack id config]
  (let [builder (PublicHostedZoneProps$Builder.)]
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
    (.build builder)))


(defn record-set-builder
  "The record-set-builder function buildes out new instances of 
RecordSet$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (RecordSet$Builder/create stack id)]
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
    (.build builder)))


(defn record-set-options-builder
  "The record-set-options-builder function buildes out new instances of 
RecordSetOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (RecordSetOptions$Builder.)]
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
    (.build builder)))


(defn record-set-props-builder
  "The record-set-props-builder function buildes out new instances of 
RecordSetProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (RecordSetProps$Builder.)]
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
    (.build builder)))


(defn srv-record-builder
  "The srv-record-builder function buildes out new instances of 
SrvRecord$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (SrvRecord$Builder/create stack id)]
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
    (.build builder)))


(defn srv-record-props-builder
  "The srv-record-props-builder function buildes out new instances of 
SrvRecordProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (SrvRecordProps$Builder.)]
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
    (.build builder)))


(defn srv-record-value-builder
  "The srv-record-value-builder function buildes out new instances of 
SrvRecordValue$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `hostName` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `weight` | java.lang.Number | [[cdk.support/lookup-entry]] | `:weight` |"
  [stack id config]
  (let [builder (SrvRecordValue$Builder.)]
    (when-let [data (lookup-entry config id :host-name)]
      (. builder hostName data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (lookup-entry config id :weight)]
      (. builder weight data))
    (.build builder)))


(defn txt-record-builder
  "The txt-record-builder function buildes out new instances of 
TxtRecord$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (TxtRecord$Builder/create stack id)]
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
    (.build builder)))


(defn txt-record-props-builder
  "The txt-record-props-builder function buildes out new instances of 
TxtRecordProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (TxtRecordProps$Builder.)]
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
    (.build builder)))


(defn vpc-endpoint-service-domain-name-builder
  "The vpc-endpoint-service-domain-name-builder function buildes out new instances of 
VpcEndpointServiceDomainName$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointService` | software.amazon.awscdk.services.ec2.IVpcEndpointService | [[cdk.support/lookup-entry]] | `:endpoint-service` |
| `publicHostedZone` | software.amazon.awscdk.services.route53.IPublicHostedZone | [[cdk.support/lookup-entry]] | `:public-hosted-zone` |"
  [stack id config]
  (let [builder (VpcEndpointServiceDomainName$Builder/create stack id)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-service)]
      (. builder endpointService data))
    (when-let [data (lookup-entry config id :public-hosted-zone)]
      (. builder publicHostedZone data))
    (.build builder)))


(defn vpc-endpoint-service-domain-name-props-builder
  "The vpc-endpoint-service-domain-name-props-builder function buildes out new instances of 
VpcEndpointServiceDomainNameProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `endpointService` | software.amazon.awscdk.services.ec2.IVpcEndpointService | [[cdk.support/lookup-entry]] | `:endpoint-service` |
| `publicHostedZone` | software.amazon.awscdk.services.route53.IPublicHostedZone | [[cdk.support/lookup-entry]] | `:public-hosted-zone` |"
  [stack id config]
  (let [builder (VpcEndpointServiceDomainNameProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :endpoint-service)]
      (. builder endpointService data))
    (when-let [data (lookup-entry config id :public-hosted-zone)]
      (. builder publicHostedZone data))
    (.build builder)))


(defn zone-delegation-options-builder
  "The zone-delegation-options-builder function buildes out new instances of 
ZoneDelegationOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `comment` | java.lang.String | [[cdk.support/lookup-entry]] | `:comment` |
| `ttl` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:ttl` |"
  [stack id config]
  (let [builder (ZoneDelegationOptions$Builder.)]
    (when-let [data (lookup-entry config id :comment)]
      (. builder comment data))
    (when-let [data (lookup-entry config id :ttl)]
      (. builder ttl data))
    (.build builder)))


(defn zone-delegation-record-builder
  "The zone-delegation-record-builder function buildes out new instances of 
ZoneDelegationRecord$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (ZoneDelegationRecord$Builder/create stack id)]
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
    (.build builder)))


(defn zone-delegation-record-props-builder
  "The zone-delegation-record-props-builder function buildes out new instances of 
ZoneDelegationRecordProps$Builder using the provided configuration.  Each field is set as follows:

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
| `zone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:zone` |"
  [stack id config]
  (let [builder (ZoneDelegationRecordProps$Builder.)]
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
    (.build builder)))


(defn zone-signing-options-builder
  "The zone-signing-options-builder function buildes out new instances of 
ZoneSigningOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `keySigningKeyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:key-signing-key-name` |
| `kmsKey` | software.amazon.awscdk.services.kms.IKey | [[cdk.support/lookup-entry]] | `:kms-key` |"
  [stack id config]
  (let [builder (ZoneSigningOptions$Builder.)]
    (when-let [data (lookup-entry config id :key-signing-key-name)]
      (. builder keySigningKeyName data))
    (when-let [data (lookup-entry config id :kms-key)]
      (. builder kmsKey data))
    (.build builder)))