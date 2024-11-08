(ns cdk.api.services.elasticloadbalancing
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.elasticloadbalancing package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.elasticloadbalancing CfnLoadBalancer$AccessLoggingPolicyProperty$Builder
                                                                 CfnLoadBalancer$AppCookieStickinessPolicyProperty$Builder
                                                                 CfnLoadBalancer$Builder
                                                                 CfnLoadBalancer$ConnectionDrainingPolicyProperty$Builder
                                                                 CfnLoadBalancer$ConnectionSettingsProperty$Builder
                                                                 CfnLoadBalancer$HealthCheckProperty$Builder
                                                                 CfnLoadBalancer$LBCookieStickinessPolicyProperty$Builder
                                                                 CfnLoadBalancer$ListenersProperty$Builder
                                                                 CfnLoadBalancer$PoliciesProperty$Builder
                                                                 CfnLoadBalancerProps$Builder
                                                                 HealthCheck$Builder
                                                                 LoadBalancer$Builder
                                                                 LoadBalancerListener$Builder
                                                                 LoadBalancerProps$Builder
                                                                 LoadBalancingProtocol]))


(defn load-balancing-protocol
  "The `load-balancing-protocol` function data interprets values in the provided config data into a 
`LoadBalancingProtocol` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `LoadBalancingProtocol` - the value is returned.
* is `:http` - `LoadBalancingProtocol/HTTP` is returned
* is `:tcp` - `LoadBalancingProtocol/TCP` is returned
* is `:https` - `LoadBalancingProtocol/HTTPS` is returned
* is `:ssl` - `LoadBalancingProtocol/SSL` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? LoadBalancingProtocol data) data
      (= :http data) LoadBalancingProtocol/HTTP
      (= :tcp data) LoadBalancingProtocol/TCP
      (= :https data) LoadBalancingProtocol/HTTPS
      (= :ssl data) LoadBalancingProtocol/SSL)))


(defn cfn-load-balancer-access-logging-policy-property-builder
  "The cfn-load-balancer-access-logging-policy-property-builder function buildes out new instances of 
CfnLoadBalancer$AccessLoggingPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `emitInterval` | java.lang.Number | [[cdk.support/lookup-entry]] | `:emit-interval` |
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `s3BucketName` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-name` |
| `s3BucketPrefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:s3-bucket-prefix` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$AccessLoggingPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :emit-interval)]
      (. builder emitInterval data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :s3-bucket-name)]
      (. builder s3BucketName data))
    (when-let [data (lookup-entry config id :s3-bucket-prefix)]
      (. builder s3BucketPrefix data))
    (.build builder)))


(defn cfn-load-balancer-app-cookie-stickiness-policy-property-builder
  "The cfn-load-balancer-app-cookie-stickiness-policy-property-builder function buildes out new instances of 
CfnLoadBalancer$AppCookieStickinessPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookieName` | java.lang.String | [[cdk.support/lookup-entry]] | `:cookie-name` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$AppCookieStickinessPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :cookie-name)]
      (. builder cookieName data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (.build builder)))


(defn cfn-load-balancer-builder
  "The cfn-load-balancer-builder function buildes out new instances of 
CfnLoadBalancer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLoggingPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:access-logging-policy` |
| `appCookieStickinessPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:app-cookie-stickiness-policy` |
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `connectionDrainingPolicy` | software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer$ConnectionDrainingPolicyProperty | [[cdk.support/lookup-entry]] | `:connection-draining-policy` |
| `connectionSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connection-settings` |
| `crossZone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-zone` |
| `healthCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check` |
| `instances` | java.util.List | [[cdk.support/lookup-entry]] | `:instances` |
| `lbCookieStickinessPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:lb-cookie-stickiness-policy` |
| `listeners` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:listeners` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `policies` | java.util.List | [[cdk.support/lookup-entry]] | `:policies` |
| `scheme` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheme` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-logging-policy)]
      (. builder accessLoggingPolicy data))
    (when-let [data (lookup-entry config id :app-cookie-stickiness-policy)]
      (. builder appCookieStickinessPolicy data))
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :connection-draining-policy)]
      (. builder connectionDrainingPolicy data))
    (when-let [data (lookup-entry config id :connection-settings)]
      (. builder connectionSettings data))
    (when-let [data (lookup-entry config id :cross-zone)]
      (. builder crossZone data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (lookup-entry config id :lb-cookie-stickiness-policy)]
      (. builder lbCookieStickinessPolicy data))
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :policies)]
      (. builder policies data))
    (when-let [data (lookup-entry config id :scheme)]
      (. builder scheme data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-load-balancer-connection-draining-policy-property-builder
  "The cfn-load-balancer-connection-draining-policy-property-builder function buildes out new instances of 
CfnLoadBalancer$ConnectionDrainingPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enabled` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enabled` |
| `timeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:timeout` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$ConnectionDrainingPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (.build builder)))


(defn cfn-load-balancer-connection-settings-property-builder
  "The cfn-load-balancer-connection-settings-property-builder function buildes out new instances of 
CfnLoadBalancer$ConnectionSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `idleTimeout` | java.lang.Number | [[cdk.support/lookup-entry]] | `:idle-timeout` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$ConnectionSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :idle-timeout)]
      (. builder idleTimeout data))
    (.build builder)))


(defn cfn-load-balancer-health-check-property-builder
  "The cfn-load-balancer-health-check-property-builder function buildes out new instances of 
CfnLoadBalancer$HealthCheckProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.String | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `interval` | java.lang.String | [[cdk.support/lookup-entry]] | `:interval` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |
| `timeout` | java.lang.String | [[cdk.support/lookup-entry]] | `:timeout` |
| `unhealthyThreshold` | java.lang.String | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$HealthCheckProperty$Builder.)]
    (when-let [data (lookup-entry config id :healthy-threshold)]
      (. builder healthyThreshold data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :unhealthy-threshold)]
      (. builder unhealthyThreshold data))
    (.build builder)))


(defn cfn-load-balancer-lb-cookie-stickiness-policy-property-builder
  "The cfn-load-balancer-lb-cookie-stickiness-policy-property-builder function buildes out new instances of 
CfnLoadBalancer$LBCookieStickinessPolicyProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cookieExpirationPeriod` | java.lang.String | [[cdk.support/lookup-entry]] | `:cookie-expiration-period` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$LBCookieStickinessPolicyProperty$Builder.)]
    (when-let [data (lookup-entry config id :cookie-expiration-period)]
      (. builder cookieExpirationPeriod data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (.build builder)))


(defn cfn-load-balancer-listeners-property-builder
  "The cfn-load-balancer-listeners-property-builder function buildes out new instances of 
CfnLoadBalancer$ListenersProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `instancePort` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-port` |
| `instanceProtocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:instance-protocol` |
| `loadBalancerPort` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-port` |
| `policyNames` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-names` |
| `protocol` | java.lang.String | [[cdk.support/lookup-entry]] | `:protocol` |
| `sslCertificateId` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-certificate-id` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$ListenersProperty$Builder.)]
    (when-let [data (lookup-entry config id :instance-port)]
      (. builder instancePort data))
    (when-let [data (lookup-entry config id :instance-protocol)]
      (. builder instanceProtocol data))
    (when-let [data (lookup-entry config id :load-balancer-port)]
      (. builder loadBalancerPort data))
    (when-let [data (lookup-entry config id :policy-names)]
      (. builder policyNames data))
    (when-let [data (lookup-entry config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :ssl-certificate-id)]
      (. builder sslCertificateId data))
    (.build builder)))


(defn cfn-load-balancer-policies-property-builder
  "The cfn-load-balancer-policies-property-builder function buildes out new instances of 
CfnLoadBalancer$PoliciesProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `attributes` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:attributes` |
| `instancePorts` | java.util.List | [[cdk.support/lookup-entry]] | `:instance-ports` |
| `loadBalancerPorts` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancer-ports` |
| `policyName` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-name` |
| `policyType` | java.lang.String | [[cdk.support/lookup-entry]] | `:policy-type` |"
  [stack id config]
  (let [builder (CfnLoadBalancer$PoliciesProperty$Builder.)]
    (when-let [data (lookup-entry config id :attributes)]
      (. builder attributes data))
    (when-let [data (lookup-entry config id :instance-ports)]
      (. builder instancePorts data))
    (when-let [data (lookup-entry config id :load-balancer-ports)]
      (. builder loadBalancerPorts data))
    (when-let [data (lookup-entry config id :policy-name)]
      (. builder policyName data))
    (when-let [data (lookup-entry config id :policy-type)]
      (. builder policyType data))
    (.build builder)))


(defn cfn-load-balancer-props-builder
  "The cfn-load-balancer-props-builder function buildes out new instances of 
CfnLoadBalancerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLoggingPolicy` | software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer$AccessLoggingPolicyProperty | [[cdk.support/lookup-entry]] | `:access-logging-policy` |
| `appCookieStickinessPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:app-cookie-stickiness-policy` |
| `availabilityZones` | java.util.List | [[cdk.support/lookup-entry]] | `:availability-zones` |
| `connectionDrainingPolicy` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connection-draining-policy` |
| `connectionSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:connection-settings` |
| `crossZone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-zone` |
| `healthCheck` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:health-check` |
| `instances` | java.util.List | [[cdk.support/lookup-entry]] | `:instances` |
| `lbCookieStickinessPolicy` | java.util.List | [[cdk.support/lookup-entry]] | `:lb-cookie-stickiness-policy` |
| `listeners` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:listeners` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `policies` | java.util.List | [[cdk.support/lookup-entry]] | `:policies` |
| `scheme` | java.lang.String | [[cdk.support/lookup-entry]] | `:scheme` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnets` | java.util.List | [[cdk.support/lookup-entry]] | `:subnets` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnLoadBalancerProps$Builder.)]
    (when-let [data (lookup-entry config id :access-logging-policy)]
      (. builder accessLoggingPolicy data))
    (when-let [data (lookup-entry config id :app-cookie-stickiness-policy)]
      (. builder appCookieStickinessPolicy data))
    (when-let [data (lookup-entry config id :availability-zones)]
      (. builder availabilityZones data))
    (when-let [data (lookup-entry config id :connection-draining-policy)]
      (. builder connectionDrainingPolicy data))
    (when-let [data (lookup-entry config id :connection-settings)]
      (. builder connectionSettings data))
    (when-let [data (lookup-entry config id :cross-zone)]
      (. builder crossZone data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :instances)]
      (. builder instances data))
    (when-let [data (lookup-entry config id :lb-cookie-stickiness-policy)]
      (. builder lbCookieStickinessPolicy data))
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :policies)]
      (. builder policies data))
    (when-let [data (lookup-entry config id :scheme)]
      (. builder scheme data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnets)]
      (. builder subnets data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn health-check-builder
  "The health-check-builder function buildes out new instances of 
HealthCheck$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `healthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:healthy-threshold` |
| `interval` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:interval` |
| `path` | java.lang.String | [[cdk.support/lookup-entry]] | `:path` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol | [[cdk.api.services.elasticloadbalancing/load-balancing-protocol]] | `:protocol` |
| `timeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:timeout` |
| `unhealthyThreshold` | java.lang.Number | [[cdk.support/lookup-entry]] | `:unhealthy-threshold` |"
  [stack id config]
  (let [builder (HealthCheck$Builder.)]
    (when-let [data (lookup-entry config id :healthy-threshold)]
      (. builder healthyThreshold data))
    (when-let [data (lookup-entry config id :interval)]
      (. builder interval data))
    (when-let [data (lookup-entry config id :path)]
      (. builder path data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (load-balancing-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (lookup-entry config id :timeout)]
      (. builder timeout data))
    (when-let [data (lookup-entry config id :unhealthy-threshold)]
      (. builder unhealthyThreshold data))
    (.build builder)))


(defn load-balancer-builder
  "The load-balancer-builder function buildes out new instances of 
LoadBalancer$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLoggingPolicy` | software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer$AccessLoggingPolicyProperty | [[cdk.support/lookup-entry]] | `:access-logging-policy` |
| `crossZone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-zone` |
| `healthCheck` | software.amazon.awscdk.services.elasticloadbalancing.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `internetFacing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:internet-facing` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (LoadBalancer$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-logging-policy)]
      (. builder accessLoggingPolicy data))
    (when-let [data (lookup-entry config id :cross-zone)]
      (. builder crossZone data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :internet-facing)]
      (. builder internetFacing data))
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn load-balancer-listener-builder
  "The load-balancer-listener-builder function buildes out new instances of 
LoadBalancerListener$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `allowConnectionsFrom` | java.util.List | [[cdk.support/lookup-entry]] | `:allow-connections-from` |
| `externalPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:external-port` |
| `externalProtocol` | software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol | [[cdk.api.services.elasticloadbalancing/load-balancing-protocol]] | `:external-protocol` |
| `internalPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:internal-port` |
| `internalProtocol` | software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol | [[cdk.api.services.elasticloadbalancing/load-balancing-protocol]] | `:internal-protocol` |
| `policyNames` | java.util.List | [[cdk.support/lookup-entry]] | `:policy-names` |
| `sslCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:ssl-certificate-arn` |"
  [stack id config]
  (let [builder (LoadBalancerListener$Builder.)]
    (when-let [data (lookup-entry config id :allow-connections-from)]
      (. builder allowConnectionsFrom data))
    (when-let [data (lookup-entry config id :external-port)]
      (. builder externalPort data))
    (when-let [data (load-balancing-protocol config id :external-protocol)]
      (. builder externalProtocol data))
    (when-let [data (lookup-entry config id :internal-port)]
      (. builder internalPort data))
    (when-let [data (load-balancing-protocol config id :internal-protocol)]
      (. builder internalProtocol data))
    (when-let [data (lookup-entry config id :policy-names)]
      (. builder policyNames data))
    (when-let [data (lookup-entry config id :ssl-certificate-arn)]
      (. builder sslCertificateArn data))
    (.build builder)))


(defn load-balancer-props-builder
  "The load-balancer-props-builder function buildes out new instances of 
LoadBalancerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessLoggingPolicy` | software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer$AccessLoggingPolicyProperty | [[cdk.support/lookup-entry]] | `:access-logging-policy` |
| `crossZone` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:cross-zone` |
| `healthCheck` | software.amazon.awscdk.services.elasticloadbalancing.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `internetFacing` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:internet-facing` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `targets` | java.util.List | [[cdk.support/lookup-entry]] | `:targets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (LoadBalancerProps$Builder.)]
    (when-let [data (lookup-entry config id :access-logging-policy)]
      (. builder accessLoggingPolicy data))
    (when-let [data (lookup-entry config id :cross-zone)]
      (. builder crossZone data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :internet-facing)]
      (. builder internetFacing data))
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :targets)]
      (. builder targets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))