(ns cdk.api.services.ecs.patterns
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ecs.patterns package. "
  (:require [cdk.api.services.ecs :refer [fargate-platform-version
                                          propagated-tag-source
                                          protocol]]
            [cdk.api.services.elasticloadbalancingv2 :refer [application-protocol
                                                             application-protocol-version
                                                             ip-address-type
                                                             ssl-policy]]
            [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.ecs.patterns ApplicationListenerProps$Builder
                                                         ApplicationLoadBalancedEc2Service$Builder
                                                         ApplicationLoadBalancedEc2ServiceProps$Builder
                                                         ApplicationLoadBalancedFargateService$Builder
                                                         ApplicationLoadBalancedFargateServiceProps$Builder
                                                         ApplicationLoadBalancedServiceBaseProps$Builder
                                                         ApplicationLoadBalancedServiceRecordType
                                                         ApplicationLoadBalancedTaskImageOptions$Builder
                                                         ApplicationLoadBalancedTaskImageProps$Builder
                                                         ApplicationLoadBalancerProps$Builder
                                                         ApplicationMultipleTargetGroupsEc2Service$Builder
                                                         ApplicationMultipleTargetGroupsEc2ServiceProps$Builder
                                                         ApplicationMultipleTargetGroupsFargateService$Builder
                                                         ApplicationMultipleTargetGroupsFargateServiceProps$Builder
                                                         ApplicationMultipleTargetGroupsServiceBaseProps$Builder
                                                         ApplicationTargetProps$Builder
                                                         FargateServiceBaseProps$Builder
                                                         NetworkListenerProps$Builder
                                                         NetworkLoadBalancedEc2Service$Builder
                                                         NetworkLoadBalancedEc2ServiceProps$Builder
                                                         NetworkLoadBalancedFargateService$Builder
                                                         NetworkLoadBalancedFargateServiceProps$Builder
                                                         NetworkLoadBalancedServiceBaseProps$Builder
                                                         NetworkLoadBalancedServiceRecordType
                                                         NetworkLoadBalancedTaskImageOptions$Builder
                                                         NetworkLoadBalancedTaskImageProps$Builder
                                                         NetworkLoadBalancerProps$Builder
                                                         NetworkMultipleTargetGroupsEc2Service$Builder
                                                         NetworkMultipleTargetGroupsEc2ServiceProps$Builder
                                                         NetworkMultipleTargetGroupsFargateService$Builder
                                                         NetworkMultipleTargetGroupsFargateServiceProps$Builder
                                                         NetworkMultipleTargetGroupsServiceBaseProps$Builder
                                                         NetworkTargetProps$Builder
                                                         QueueProcessingEc2Service$Builder
                                                         QueueProcessingEc2ServiceProps$Builder
                                                         QueueProcessingFargateService$Builder
                                                         QueueProcessingFargateServiceProps$Builder
                                                         QueueProcessingServiceBaseProps$Builder
                                                         ScheduledEc2Task$Builder
                                                         ScheduledEc2TaskDefinitionOptions$Builder
                                                         ScheduledEc2TaskImageOptions$Builder
                                                         ScheduledEc2TaskProps$Builder
                                                         ScheduledFargateTask$Builder
                                                         ScheduledFargateTaskDefinitionOptions$Builder
                                                         ScheduledFargateTaskImageOptions$Builder
                                                         ScheduledFargateTaskProps$Builder
                                                         ScheduledTaskBaseProps$Builder
                                                         ScheduledTaskImageProps$Builder]))


(defn application-load-balanced-service-record-type
  "The `application-load-balanced-service-record-type` function data interprets values in the provided config data into a 
`ApplicationLoadBalancedServiceRecordType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `ApplicationLoadBalancedServiceRecordType` - the value is returned.
* is `:alias` - `ApplicationLoadBalancedServiceRecordType/ALIAS` is returned
* is `:cname` - `ApplicationLoadBalancedServiceRecordType/CNAME` is returned
* is `:none` - `ApplicationLoadBalancedServiceRecordType/NONE` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? ApplicationLoadBalancedServiceRecordType data) data
      (= :alias data) ApplicationLoadBalancedServiceRecordType/ALIAS
      (= :cname data) ApplicationLoadBalancedServiceRecordType/CNAME
      (= :none data) ApplicationLoadBalancedServiceRecordType/NONE)))


(defn network-load-balanced-service-record-type
  "The `network-load-balanced-service-record-type` function data interprets values in the provided config data into a 
`NetworkLoadBalancedServiceRecordType` instance.  This simplifies the use of keywords in place of actual enum values in 
the configuration provided to builders.  The value is found using the `cdk.support/lookup-entry` 
function on the data with the provided namespace id and item-key.  The found value is interpretted as follows: 

* instance of `NetworkLoadBalancedServiceRecordType` - the value is returned.
* is `:none` - `NetworkLoadBalancedServiceRecordType/NONE` is returned
* is `:cname` - `NetworkLoadBalancedServiceRecordType/CNAME` is returned
* is `:alias` - `NetworkLoadBalancedServiceRecordType/ALIAS` is returned

 If a value is not found or matches the above criteria, nil is returned."
  [config id item-key]
  (let [data (lookup-entry config id item-key)]
    (cond
      (instance? NetworkLoadBalancedServiceRecordType data) data
      (= :none data) NetworkLoadBalancedServiceRecordType/NONE
      (= :cname data) NetworkLoadBalancedServiceRecordType/CNAME
      (= :alias data) NetworkLoadBalancedServiceRecordType/ALIAS)))


(defn application-listener-props-builder>
  "The application-listener-props-builder> function updates a ApplicationListenerProps$Builder instance using the provided configuration.
  The function takes the ApplicationListenerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
"
  [^ApplicationListenerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (.build builder))


(defn application-listener-props-builder
  "Creates a  `ApplicationListenerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-listener-props-builder> (new ApplicationListenerProps$Builder) id config))


(defn application-load-balanced-ec2-service-builder>
  "The application-load-balanced-ec2-service-builder> function updates a ApplicationLoadBalancedEc2Service$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancedEc2Service$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `idleTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-timeout` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `openListener` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open-listener` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `protocolVersion` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion | [[cdk.api.services.elasticloadbalancingv2/application-protocol-version]] | `:protocol-version` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
| `recordType` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType | [[cdk.api.services.ecs.patterns/application-load-balanced-service-record-type]] | `:record-type` |
| `redirectHttp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:redirect-http` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
| `targetProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:target-protocol` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.Ec2TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationLoadBalancedEc2Service$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :idle-timeout)]
    (. builder idleTimeout data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :memory-reservation-mi-b)]
    (. builder memoryReservationMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :open-listener)]
    (. builder openListener data))
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (application-protocol-version config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (when-some [data (application-load-balanced-service-record-type config id :record-type)]
    (. builder recordType data))
  (when-some [data (lookup-entry config id :redirect-http)]
    (. builder redirectHttp data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (when-some [data (application-protocol config id :target-protocol)]
    (. builder targetProtocol data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-load-balanced-ec2-service-builder
  "Creates a  `ApplicationLoadBalancedEc2Service$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (application-load-balanced-ec2-service-builder> (ApplicationLoadBalancedEc2Service$Builder/create scope (name id)) id config))


(defn application-load-balanced-ec2-service-props-builder>
  "The application-load-balanced-ec2-service-props-builder> function updates a ApplicationLoadBalancedEc2ServiceProps$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancedEc2ServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `idleTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-timeout` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `openListener` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open-listener` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `protocolVersion` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion | [[cdk.api.services.elasticloadbalancingv2/application-protocol-version]] | `:protocol-version` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
| `recordType` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType | [[cdk.api.services.ecs.patterns/application-load-balanced-service-record-type]] | `:record-type` |
| `redirectHttp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:redirect-http` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
| `targetProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:target-protocol` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.Ec2TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationLoadBalancedEc2ServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :idle-timeout)]
    (. builder idleTimeout data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :memory-reservation-mi-b)]
    (. builder memoryReservationMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :open-listener)]
    (. builder openListener data))
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (application-protocol-version config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (when-some [data (application-load-balanced-service-record-type config id :record-type)]
    (. builder recordType data))
  (when-some [data (lookup-entry config id :redirect-http)]
    (. builder redirectHttp data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (when-some [data (application-protocol config id :target-protocol)]
    (. builder targetProtocol data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-load-balanced-ec2-service-props-builder
  "Creates a  `ApplicationLoadBalancedEc2ServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-load-balanced-ec2-service-props-builder> (new ApplicationLoadBalancedEc2ServiceProps$Builder) id config))


(defn application-load-balanced-fargate-service-builder>
  "The application-load-balanced-fargate-service-builder> function updates a ApplicationLoadBalancedFargateService$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancedFargateService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `healthCheck` | software.amazon.awscdk.services.ecs.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `idleTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-timeout` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `openListener` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open-listener` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `protocolVersion` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion | [[cdk.api.services.elasticloadbalancingv2/application-protocol-version]] | `:protocol-version` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
| `recordType` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType | [[cdk.api.services.ecs.patterns/application-load-balanced-service-record-type]] | `:record-type` |
| `redirectHttp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:redirect-http` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
| `targetProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:target-protocol` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `taskSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:task-subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationLoadBalancedFargateService$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :idle-timeout)]
    (. builder idleTimeout data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :open-listener)]
    (. builder openListener data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (application-protocol-version config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (when-some [data (application-load-balanced-service-record-type config id :record-type)]
    (. builder recordType data))
  (when-some [data (lookup-entry config id :redirect-http)]
    (. builder redirectHttp data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (when-some [data (application-protocol config id :target-protocol)]
    (. builder targetProtocol data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :task-subnets)]
    (. builder taskSubnets data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-load-balanced-fargate-service-builder
  "Creates a  `ApplicationLoadBalancedFargateService$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (application-load-balanced-fargate-service-builder> (ApplicationLoadBalancedFargateService$Builder/create scope (name id)) id config))


(defn application-load-balanced-fargate-service-props-builder>
  "The application-load-balanced-fargate-service-props-builder> function updates a ApplicationLoadBalancedFargateServiceProps$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancedFargateServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `healthCheck` | software.amazon.awscdk.services.ecs.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `idleTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-timeout` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `openListener` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open-listener` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `protocolVersion` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion | [[cdk.api.services.elasticloadbalancingv2/application-protocol-version]] | `:protocol-version` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
| `recordType` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType | [[cdk.api.services.ecs.patterns/application-load-balanced-service-record-type]] | `:record-type` |
| `redirectHttp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:redirect-http` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
| `targetProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:target-protocol` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `taskSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:task-subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationLoadBalancedFargateServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :idle-timeout)]
    (. builder idleTimeout data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :open-listener)]
    (. builder openListener data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (application-protocol-version config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (when-some [data (application-load-balanced-service-record-type config id :record-type)]
    (. builder recordType data))
  (when-some [data (lookup-entry config id :redirect-http)]
    (. builder redirectHttp data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (when-some [data (application-protocol config id :target-protocol)]
    (. builder targetProtocol data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :task-subnets)]
    (. builder taskSubnets data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-load-balanced-fargate-service-props-builder
  "Creates a  `ApplicationLoadBalancedFargateServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-load-balanced-fargate-service-props-builder> (new ApplicationLoadBalancedFargateServiceProps$Builder) id config))


(defn application-load-balanced-service-base-props-builder>
  "The application-load-balanced-service-base-props-builder> function updates a ApplicationLoadBalancedServiceBaseProps$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancedServiceBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `idleTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-timeout` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `loadBalancerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:load-balancer-name` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `openListener` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:open-listener` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `protocolVersion` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion | [[cdk.api.services.elasticloadbalancingv2/application-protocol-version]] | `:protocol-version` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
| `recordType` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedServiceRecordType | [[cdk.api.services.ecs.patterns/application-load-balanced-service-record-type]] | `:record-type` |
| `redirectHttp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:redirect-http` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |
| `targetProtocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:target-protocol` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationLoadBalancedServiceBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :certificate)]
    (. builder certificate data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :idle-timeout)]
    (. builder idleTimeout data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :load-balancer-name)]
    (. builder loadBalancerName data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :open-listener)]
    (. builder openListener data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (application-protocol config id :protocol)]
    (. builder protocol data))
  (when-some [data (application-protocol-version config id :protocol-version)]
    (. builder protocolVersion data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (when-some [data (application-load-balanced-service-record-type config id :record-type)]
    (. builder recordType data))
  (when-some [data (lookup-entry config id :redirect-http)]
    (. builder redirectHttp data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (ssl-policy config id :ssl-policy)]
    (. builder sslPolicy data))
  (when-some [data (application-protocol config id :target-protocol)]
    (. builder targetProtocol data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-load-balanced-service-base-props-builder
  "Creates a  `ApplicationLoadBalancedServiceBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-load-balanced-service-base-props-builder> (new ApplicationLoadBalancedServiceBaseProps$Builder) id config))


(defn application-load-balanced-task-image-options-builder>
  "The application-load-balanced-task-image-options-builder> function updates a ApplicationLoadBalancedTaskImageOptions$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancedTaskImageOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `dockerLabels` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-labels` |
| `enableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-logging` |
| `entryPoint` | java.util.List | [[cdk.support/lookup-entry]] | `:entry-point` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
"
  [^ApplicationLoadBalancedTaskImageOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :container-port)]
    (. builder containerPort data))
  (when-some [data (lookup-entry config id :docker-labels)]
    (. builder dockerLabels data))
  (when-some [data (lookup-entry config id :enable-logging)]
    (. builder enableLogging data))
  (when-some [data (lookup-entry config id :entry-point)]
    (. builder entryPoint data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :task-role)]
    (. builder taskRole data))
  (.build builder))


(defn application-load-balanced-task-image-options-builder
  "Creates a  `ApplicationLoadBalancedTaskImageOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-load-balanced-task-image-options-builder> (new ApplicationLoadBalancedTaskImageOptions$Builder) id config))


(defn application-load-balanced-task-image-props-builder>
  "The application-load-balanced-task-image-props-builder> function updates a ApplicationLoadBalancedTaskImageProps$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancedTaskImageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPorts` | java.util.List | [[cdk.support/lookup-entry]] | `:container-ports` |
| `dockerLabels` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-labels` |
| `enableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-logging` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
"
  [^ApplicationLoadBalancedTaskImageProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :container-ports)]
    (. builder containerPorts data))
  (when-some [data (lookup-entry config id :docker-labels)]
    (. builder dockerLabels data))
  (when-some [data (lookup-entry config id :enable-logging)]
    (. builder enableLogging data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :task-role)]
    (. builder taskRole data))
  (.build builder))


(defn application-load-balanced-task-image-props-builder
  "Creates a  `ApplicationLoadBalancedTaskImageProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-load-balanced-task-image-props-builder> (new ApplicationLoadBalancedTaskImageProps$Builder) id config))


(defn application-load-balancer-props-builder>
  "The application-load-balancer-props-builder> function updates a ApplicationLoadBalancerProps$Builder instance using the provided configuration.
  The function takes the ApplicationLoadBalancerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `idleTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-timeout` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
"
  [^ApplicationLoadBalancerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :idle-timeout)]
    (. builder idleTimeout data))
  (when-some [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (.build builder))


(defn application-load-balancer-props-builder
  "Creates a  `ApplicationLoadBalancerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-load-balancer-props-builder> (new ApplicationLoadBalancerProps$Builder) id config))


(defn application-multiple-target-groups-ec2-service-builder>
  "The application-multiple-target-groups-ec2-service-builder> function updates a ApplicationMultipleTargetGroupsEc2Service$Builder instance using the provided configuration.
  The function takes the ApplicationMultipleTargetGroupsEc2Service$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.Ec2TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationMultipleTargetGroupsEc2Service$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :memory-reservation-mi-b)]
    (. builder memoryReservationMiB data))
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-multiple-target-groups-ec2-service-builder
  "Creates a  `ApplicationMultipleTargetGroupsEc2Service$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (application-multiple-target-groups-ec2-service-builder> (ApplicationMultipleTargetGroupsEc2Service$Builder/create scope (name id)) id config))


(defn application-multiple-target-groups-ec2-service-props-builder>
  "The application-multiple-target-groups-ec2-service-props-builder> function updates a ApplicationMultipleTargetGroupsEc2ServiceProps$Builder instance using the provided configuration.
  The function takes the ApplicationMultipleTargetGroupsEc2ServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.Ec2TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationMultipleTargetGroupsEc2ServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :memory-reservation-mi-b)]
    (. builder memoryReservationMiB data))
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-multiple-target-groups-ec2-service-props-builder
  "Creates a  `ApplicationMultipleTargetGroupsEc2ServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-multiple-target-groups-ec2-service-props-builder> (new ApplicationMultipleTargetGroupsEc2ServiceProps$Builder) id config))


(defn application-multiple-target-groups-fargate-service-builder>
  "The application-multiple-target-groups-fargate-service-builder> function updates a ApplicationMultipleTargetGroupsFargateService$Builder instance using the provided configuration.
  The function takes the ApplicationMultipleTargetGroupsFargateService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationMultipleTargetGroupsFargateService$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-multiple-target-groups-fargate-service-builder
  "Creates a  `ApplicationMultipleTargetGroupsFargateService$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (application-multiple-target-groups-fargate-service-builder> (ApplicationMultipleTargetGroupsFargateService$Builder/create scope (name id)) id config))


(defn application-multiple-target-groups-fargate-service-props-builder>
  "The application-multiple-target-groups-fargate-service-props-builder> function updates a ApplicationMultipleTargetGroupsFargateServiceProps$Builder instance using the provided configuration.
  The function takes the ApplicationMultipleTargetGroupsFargateServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationMultipleTargetGroupsFargateServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-multiple-target-groups-fargate-service-props-builder
  "Creates a  `ApplicationMultipleTargetGroupsFargateServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-multiple-target-groups-fargate-service-props-builder> (new ApplicationMultipleTargetGroupsFargateServiceProps$Builder) id config))


(defn application-multiple-target-groups-service-base-props-builder>
  "The application-multiple-target-groups-service-base-props-builder> function updates a ApplicationMultipleTargetGroupsServiceBaseProps$Builder instance using the provided configuration.
  The function takes the ApplicationMultipleTargetGroupsServiceBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ApplicationMultipleTargetGroupsServiceBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn application-multiple-target-groups-service-base-props-builder
  "Creates a  `ApplicationMultipleTargetGroupsServiceBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-multiple-target-groups-service-base-props-builder> (new ApplicationMultipleTargetGroupsServiceBaseProps$Builder) id config))


(defn application-target-props-builder>
  "The application-target-props-builder> function updates a ApplicationTargetProps$Builder instance using the provided configuration.
  The function takes the ApplicationTargetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `hostHeader` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-header` |
| `listener` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener` |
| `pathPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-pattern` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |
"
  [^ApplicationTargetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container-port)]
    (. builder containerPort data))
  (when-some [data (lookup-entry config id :host-header)]
    (. builder hostHeader data))
  (when-some [data (lookup-entry config id :listener)]
    (. builder listener data))
  (when-some [data (lookup-entry config id :path-pattern)]
    (. builder pathPattern data))
  (when-some [data (lookup-entry config id :priority)]
    (. builder priority data))
  (when-some [data (protocol config id :protocol)]
    (. builder protocol data))
  (.build builder))


(defn application-target-props-builder
  "Creates a  `ApplicationTargetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (application-target-props-builder> (new ApplicationTargetProps$Builder) id config))


(defn fargate-service-base-props-builder>
  "The fargate-service-base-props-builder> function updates a FargateServiceBaseProps$Builder instance using the provided configuration.
  The function takes the FargateServiceBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
"
  [^FargateServiceBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (.build builder))


(defn fargate-service-base-props-builder
  "Creates a  `FargateServiceBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (fargate-service-base-props-builder> (new FargateServiceBaseProps$Builder) id config))


(defn network-listener-props-builder>
  "The network-listener-props-builder> function updates a NetworkListenerProps$Builder instance using the provided configuration.
  The function takes the NetworkListenerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
"
  [^NetworkListenerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :port)]
    (. builder port data))
  (.build builder))


(defn network-listener-props-builder
  "Creates a  `NetworkListenerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-listener-props-builder> (new NetworkListenerProps$Builder) id config))


(defn network-load-balanced-ec2-service-builder>
  "The network-load-balanced-ec2-service-builder> function updates a NetworkLoadBalancedEc2Service$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancedEc2Service$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `ipAddressType` | software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType | [[cdk.api.services.elasticloadbalancingv2/ip-address-type]] | `:ip-address-type` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
| `recordType` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType | [[cdk.api.services.ecs.patterns/network-load-balanced-service-record-type]] | `:record-type` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.Ec2TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkLoadBalancedEc2Service$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :memory-reservation-mi-b)]
    (. builder memoryReservationMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (when-some [data (network-load-balanced-service-record-type config id :record-type)]
    (. builder recordType data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-load-balanced-ec2-service-builder
  "Creates a  `NetworkLoadBalancedEc2Service$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (network-load-balanced-ec2-service-builder> (NetworkLoadBalancedEc2Service$Builder/create scope (name id)) id config))


(defn network-load-balanced-ec2-service-props-builder>
  "The network-load-balanced-ec2-service-props-builder> function updates a NetworkLoadBalancedEc2ServiceProps$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancedEc2ServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `ipAddressType` | software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType | [[cdk.api.services.elasticloadbalancingv2/ip-address-type]] | `:ip-address-type` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
| `recordType` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType | [[cdk.api.services.ecs.patterns/network-load-balanced-service-record-type]] | `:record-type` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.Ec2TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkLoadBalancedEc2ServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :memory-reservation-mi-b)]
    (. builder memoryReservationMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (when-some [data (network-load-balanced-service-record-type config id :record-type)]
    (. builder recordType data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-load-balanced-ec2-service-props-builder
  "Creates a  `NetworkLoadBalancedEc2ServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-load-balanced-ec2-service-props-builder> (new NetworkLoadBalancedEc2ServiceProps$Builder) id config))


(defn network-load-balanced-fargate-service-builder>
  "The network-load-balanced-fargate-service-builder> function updates a NetworkLoadBalancedFargateService$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancedFargateService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `ipAddressType` | software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType | [[cdk.api.services.elasticloadbalancingv2/ip-address-type]] | `:ip-address-type` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
| `recordType` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType | [[cdk.api.services.ecs.patterns/network-load-balanced-service-record-type]] | `:record-type` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `taskSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:task-subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkLoadBalancedFargateService$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (when-some [data (network-load-balanced-service-record-type config id :record-type)]
    (. builder recordType data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :task-subnets)]
    (. builder taskSubnets data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-load-balanced-fargate-service-builder
  "Creates a  `NetworkLoadBalancedFargateService$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (network-load-balanced-fargate-service-builder> (NetworkLoadBalancedFargateService$Builder/create scope (name id)) id config))


(defn network-load-balanced-fargate-service-props-builder>
  "The network-load-balanced-fargate-service-props-builder> function updates a NetworkLoadBalancedFargateServiceProps$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancedFargateServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `ipAddressType` | software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType | [[cdk.api.services.elasticloadbalancingv2/ip-address-type]] | `:ip-address-type` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
| `recordType` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType | [[cdk.api.services.ecs.patterns/network-load-balanced-service-record-type]] | `:record-type` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `taskSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:task-subnets` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkLoadBalancedFargateServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (when-some [data (network-load-balanced-service-record-type config id :record-type)]
    (. builder recordType data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :task-subnets)]
    (. builder taskSubnets data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-load-balanced-fargate-service-props-builder
  "Creates a  `NetworkLoadBalancedFargateServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-load-balanced-fargate-service-props-builder> (new NetworkLoadBalancedFargateServiceProps$Builder) id config))


(defn network-load-balanced-service-base-props-builder>
  "The network-load-balanced-service-base-props-builder> function updates a NetworkLoadBalancedServiceBaseProps$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancedServiceBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `ipAddressType` | software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType | [[cdk.api.services.elasticloadbalancingv2/ip-address-type]] | `:ip-address-type` |
| `listenerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:listener-port` |
| `loadBalancer` | software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer | [[cdk.support/lookup-entry]] | `:load-balancer` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
| `recordType` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType | [[cdk.api.services.ecs.patterns/network-load-balanced-service-record-type]] | `:record-type` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkLoadBalancedServiceBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (ip-address-type config id :ip-address-type)]
    (. builder ipAddressType data))
  (when-some [data (lookup-entry config id :listener-port)]
    (. builder listenerPort data))
  (when-some [data (lookup-entry config id :load-balancer)]
    (. builder loadBalancer data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (when-some [data (network-load-balanced-service-record-type config id :record-type)]
    (. builder recordType data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-load-balanced-service-base-props-builder
  "Creates a  `NetworkLoadBalancedServiceBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-load-balanced-service-base-props-builder> (new NetworkLoadBalancedServiceBaseProps$Builder) id config))


(defn network-load-balanced-task-image-options-builder>
  "The network-load-balanced-task-image-options-builder> function updates a NetworkLoadBalancedTaskImageOptions$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancedTaskImageOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `dockerLabels` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-labels` |
| `enableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-logging` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
"
  [^NetworkLoadBalancedTaskImageOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :container-port)]
    (. builder containerPort data))
  (when-some [data (lookup-entry config id :docker-labels)]
    (. builder dockerLabels data))
  (when-some [data (lookup-entry config id :enable-logging)]
    (. builder enableLogging data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :task-role)]
    (. builder taskRole data))
  (.build builder))


(defn network-load-balanced-task-image-options-builder
  "Creates a  `NetworkLoadBalancedTaskImageOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-load-balanced-task-image-options-builder> (new NetworkLoadBalancedTaskImageOptions$Builder) id config))


(defn network-load-balanced-task-image-props-builder>
  "The network-load-balanced-task-image-props-builder> function updates a NetworkLoadBalancedTaskImageProps$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancedTaskImageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `containerPorts` | java.util.List | [[cdk.support/lookup-entry]] | `:container-ports` |
| `dockerLabels` | java.util.Map | [[cdk.support/lookup-entry]] | `:docker-labels` |
| `enableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-logging` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `executionRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:execution-role` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |
"
  [^NetworkLoadBalancedTaskImageProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :container-ports)]
    (. builder containerPorts data))
  (when-some [data (lookup-entry config id :docker-labels)]
    (. builder dockerLabels data))
  (when-some [data (lookup-entry config id :enable-logging)]
    (. builder enableLogging data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :execution-role)]
    (. builder executionRole data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :task-role)]
    (. builder taskRole data))
  (.build builder))


(defn network-load-balanced-task-image-props-builder
  "Creates a  `NetworkLoadBalancedTaskImageProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-load-balanced-task-image-props-builder> (new NetworkLoadBalancedTaskImageProps$Builder) id config))


(defn network-load-balancer-props-builder>
  "The network-load-balancer-props-builder> function updates a NetworkLoadBalancerProps$Builder instance using the provided configuration.
  The function takes the NetworkLoadBalancerProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |
"
  [^NetworkLoadBalancerProps$Builder builder id config]
  (when-some [data (lookup-entry config id :domain-name)]
    (. builder domainName data))
  (when-some [data (lookup-entry config id :domain-zone)]
    (. builder domainZone data))
  (when-some [data (lookup-entry config id :listeners)]
    (. builder listeners data))
  (when-some [data (lookup-entry config id :name)]
    (. builder name data))
  (when-some [data (lookup-entry config id :public-load-balancer)]
    (. builder publicLoadBalancer data))
  (.build builder))


(defn network-load-balancer-props-builder
  "Creates a  `NetworkLoadBalancerProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-load-balancer-props-builder> (new NetworkLoadBalancerProps$Builder) id config))


(defn network-multiple-target-groups-ec2-service-builder>
  "The network-multiple-target-groups-ec2-service-builder> function updates a NetworkMultipleTargetGroupsEc2Service$Builder instance using the provided configuration.
  The function takes the NetworkMultipleTargetGroupsEc2Service$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.Ec2TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkMultipleTargetGroupsEc2Service$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :memory-reservation-mi-b)]
    (. builder memoryReservationMiB data))
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-multiple-target-groups-ec2-service-builder
  "Creates a  `NetworkMultipleTargetGroupsEc2Service$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (network-multiple-target-groups-ec2-service-builder> (NetworkMultipleTargetGroupsEc2Service$Builder/create scope (name id)) id config))


(defn network-multiple-target-groups-ec2-service-props-builder>
  "The network-multiple-target-groups-ec2-service-props-builder> function updates a NetworkMultipleTargetGroupsEc2ServiceProps$Builder instance using the provided configuration.
  The function takes the NetworkMultipleTargetGroupsEc2ServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.Ec2TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkMultipleTargetGroupsEc2ServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :memory-reservation-mi-b)]
    (. builder memoryReservationMiB data))
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-multiple-target-groups-ec2-service-props-builder
  "Creates a  `NetworkMultipleTargetGroupsEc2ServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-multiple-target-groups-ec2-service-props-builder> (new NetworkMultipleTargetGroupsEc2ServiceProps$Builder) id config))


(defn network-multiple-target-groups-fargate-service-builder>
  "The network-multiple-target-groups-fargate-service-builder> function updates a NetworkMultipleTargetGroupsFargateService$Builder instance using the provided configuration.
  The function takes the NetworkMultipleTargetGroupsFargateService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkMultipleTargetGroupsFargateService$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-multiple-target-groups-fargate-service-builder
  "Creates a  `NetworkMultipleTargetGroupsFargateService$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (network-multiple-target-groups-fargate-service-builder> (NetworkMultipleTargetGroupsFargateService$Builder/create scope (name id)) id config))


(defn network-multiple-target-groups-fargate-service-props-builder>
  "The network-multiple-target-groups-fargate-service-props-builder> function updates a NetworkMultipleTargetGroupsFargateServiceProps$Builder instance using the provided configuration.
  The function takes the NetworkMultipleTargetGroupsFargateServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkMultipleTargetGroupsFargateServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-multiple-target-groups-fargate-service-props-builder
  "Creates a  `NetworkMultipleTargetGroupsFargateServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-multiple-target-groups-fargate-service-props-builder> (new NetworkMultipleTargetGroupsFargateServiceProps$Builder) id config))


(defn network-multiple-target-groups-service-base-props-builder>
  "The network-multiple-target-groups-service-base-props-builder> function updates a NetworkMultipleTargetGroupsServiceBaseProps$Builder instance using the provided configuration.
  The function takes the NetworkMultipleTargetGroupsServiceBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cloudMapOptions` | software.amazon.awscdk.services.ecs.CloudMapOptions | [[cdk.support/lookup-entry]] | `:cloud-map-options` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `desiredCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-count` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `healthCheckGracePeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:health-check-grace-period` |
| `loadBalancers` | java.util.List | [[cdk.support/lookup-entry]] | `:load-balancers` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `targetGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:target-groups` |
| `taskImageOptions` | software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps | [[cdk.support/lookup-entry]] | `:task-image-options` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^NetworkMultipleTargetGroupsServiceBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cloud-map-options)]
    (. builder cloudMapOptions data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :desired-count)]
    (. builder desiredCount data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :health-check-grace-period)]
    (. builder healthCheckGracePeriod data))
  (when-some [data (lookup-entry config id :load-balancers)]
    (. builder loadBalancers data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :target-groups)]
    (. builder targetGroups data))
  (when-some [data (lookup-entry config id :task-image-options)]
    (. builder taskImageOptions data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn network-multiple-target-groups-service-base-props-builder
  "Creates a  `NetworkMultipleTargetGroupsServiceBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-multiple-target-groups-service-base-props-builder> (new NetworkMultipleTargetGroupsServiceBaseProps$Builder) id config))


(defn network-target-props-builder>
  "The network-target-props-builder> function updates a NetworkTargetProps$Builder instance using the provided configuration.
  The function takes the NetworkTargetProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `listener` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener` |
"
  [^NetworkTargetProps$Builder builder id config]
  (when-some [data (lookup-entry config id :container-port)]
    (. builder containerPort data))
  (when-some [data (lookup-entry config id :listener)]
    (. builder listener data))
  (.build builder))


(defn network-target-props-builder
  "Creates a  `NetworkTargetProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (network-target-props-builder> (new NetworkTargetProps$Builder) id config))


(defn queue-processing-ec2-service-builder>
  "The queue-processing-ec2-service-builder> function updates a QueueProcessingEc2Service$Builder instance using the provided configuration.
  The function takes the QueueProcessingEc2Service$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `cpuTargetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-target-utilization-percent` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `disableCpuBasedScaling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-cpu-based-scaling` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `enableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-logging` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `maxReceiveCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-receive-count` |
| `maxScalingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-scaling-capacity` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `minScalingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-scaling-capacity` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `queue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:queue` |
| `retentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention-period` |
| `scalingSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-steps` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `visibilityTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:visibility-timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^QueueProcessingEc2Service$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :cpu-target-utilization-percent)]
    (. builder cpuTargetUtilizationPercent data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :disable-cpu-based-scaling)]
    (. builder disableCpuBasedScaling data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :enable-logging)]
    (. builder enableLogging data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :gpu-count)]
    (. builder gpuCount data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :max-receive-count)]
    (. builder maxReceiveCount data))
  (when-some [data (lookup-entry config id :max-scaling-capacity)]
    (. builder maxScalingCapacity data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :memory-reservation-mi-b)]
    (. builder memoryReservationMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :min-scaling-capacity)]
    (. builder minScalingCapacity data))
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :queue)]
    (. builder queue data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :scaling-steps)]
    (. builder scalingSteps data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :visibility-timeout)]
    (. builder visibilityTimeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn queue-processing-ec2-service-builder
  "Creates a  `QueueProcessingEc2Service$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (queue-processing-ec2-service-builder> (QueueProcessingEc2Service$Builder/create scope (name id)) id config))


(defn queue-processing-ec2-service-props-builder>
  "The queue-processing-ec2-service-props-builder> function updates a QueueProcessingEc2ServiceProps$Builder instance using the provided configuration.
  The function takes the QueueProcessingEc2ServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `cpuTargetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-target-utilization-percent` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `disableCpuBasedScaling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-cpu-based-scaling` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `enableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-logging` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `gpuCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:gpu-count` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `maxReceiveCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-receive-count` |
| `maxScalingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-scaling-capacity` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `minScalingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-scaling-capacity` |
| `placementConstraints` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-constraints` |
| `placementStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:placement-strategies` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `queue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:queue` |
| `retentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention-period` |
| `scalingSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-steps` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `visibilityTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:visibility-timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^QueueProcessingEc2ServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :cpu-target-utilization-percent)]
    (. builder cpuTargetUtilizationPercent data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :disable-cpu-based-scaling)]
    (. builder disableCpuBasedScaling data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :enable-logging)]
    (. builder enableLogging data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :gpu-count)]
    (. builder gpuCount data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :max-receive-count)]
    (. builder maxReceiveCount data))
  (when-some [data (lookup-entry config id :max-scaling-capacity)]
    (. builder maxScalingCapacity data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :memory-reservation-mi-b)]
    (. builder memoryReservationMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :min-scaling-capacity)]
    (. builder minScalingCapacity data))
  (when-some [data (lookup-entry config id :placement-constraints)]
    (. builder placementConstraints data))
  (when-some [data (lookup-entry config id :placement-strategies)]
    (. builder placementStrategies data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :queue)]
    (. builder queue data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :scaling-steps)]
    (. builder scalingSteps data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :visibility-timeout)]
    (. builder visibilityTimeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn queue-processing-ec2-service-props-builder
  "Creates a  `QueueProcessingEc2ServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (queue-processing-ec2-service-props-builder> (new QueueProcessingEc2ServiceProps$Builder) id config))


(defn queue-processing-fargate-service-builder>
  "The queue-processing-fargate-service-builder> function updates a QueueProcessingFargateService$Builder instance using the provided configuration.
  The function takes the QueueProcessingFargateService$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `cpuTargetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-target-utilization-percent` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `disableCpuBasedScaling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-cpu-based-scaling` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `enableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-logging` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `healthCheck` | software.amazon.awscdk.services.ecs.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `maxReceiveCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-receive-count` |
| `maxScalingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-scaling-capacity` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `minScalingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-scaling-capacity` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `queue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:queue` |
| `retentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention-period` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `scalingSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-steps` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:task-subnets` |
| `visibilityTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:visibility-timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^QueueProcessingFargateService$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :cpu-target-utilization-percent)]
    (. builder cpuTargetUtilizationPercent data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :disable-cpu-based-scaling)]
    (. builder disableCpuBasedScaling data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :enable-logging)]
    (. builder enableLogging data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :max-receive-count)]
    (. builder maxReceiveCount data))
  (when-some [data (lookup-entry config id :max-scaling-capacity)]
    (. builder maxScalingCapacity data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :min-scaling-capacity)]
    (. builder minScalingCapacity data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :queue)]
    (. builder queue data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :scaling-steps)]
    (. builder scalingSteps data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-subnets)]
    (. builder taskSubnets data))
  (when-some [data (lookup-entry config id :visibility-timeout)]
    (. builder visibilityTimeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn queue-processing-fargate-service-builder
  "Creates a  `QueueProcessingFargateService$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (queue-processing-fargate-service-builder> (QueueProcessingFargateService$Builder/create scope (name id)) id config))


(defn queue-processing-fargate-service-props-builder>
  "The queue-processing-fargate-service-props-builder> function updates a QueueProcessingFargateServiceProps$Builder instance using the provided configuration.
  The function takes the QueueProcessingFargateServiceProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `assignPublicIp` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:assign-public-ip` |
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `cpuTargetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-target-utilization-percent` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `disableCpuBasedScaling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-cpu-based-scaling` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `enableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-logging` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `healthCheck` | software.amazon.awscdk.services.ecs.HealthCheck | [[cdk.support/lookup-entry]] | `:health-check` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `maxReceiveCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-receive-count` |
| `maxScalingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-scaling-capacity` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `minScalingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-scaling-capacity` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `queue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:queue` |
| `retentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention-period` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `scalingSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-steps` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `taskSubnets` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:task-subnets` |
| `visibilityTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:visibility-timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^QueueProcessingFargateServiceProps$Builder builder id config]
  (when-some [data (lookup-entry config id :assign-public-ip)]
    (. builder assignPublicIp data))
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :cpu-target-utilization-percent)]
    (. builder cpuTargetUtilizationPercent data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :disable-cpu-based-scaling)]
    (. builder disableCpuBasedScaling data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :enable-logging)]
    (. builder enableLogging data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :health-check)]
    (. builder healthCheck data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :max-receive-count)]
    (. builder maxReceiveCount data))
  (when-some [data (lookup-entry config id :max-scaling-capacity)]
    (. builder maxScalingCapacity data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :min-scaling-capacity)]
    (. builder minScalingCapacity data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :queue)]
    (. builder queue data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :scaling-steps)]
    (. builder scalingSteps data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :task-subnets)]
    (. builder taskSubnets data))
  (when-some [data (lookup-entry config id :visibility-timeout)]
    (. builder visibilityTimeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn queue-processing-fargate-service-props-builder
  "Creates a  `QueueProcessingFargateServiceProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (queue-processing-fargate-service-props-builder> (new QueueProcessingFargateServiceProps$Builder) id config))


(defn queue-processing-service-base-props-builder>
  "The queue-processing-service-base-props-builder> function updates a QueueProcessingServiceBaseProps$Builder instance using the provided configuration.
  The function takes the QueueProcessingServiceBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `capacityProviderStrategies` | java.util.List | [[cdk.support/lookup-entry]] | `:capacity-provider-strategies` |
| `circuitBreaker` | software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker | [[cdk.support/lookup-entry]] | `:circuit-breaker` |
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `cooldown` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:cooldown` |
| `cpuTargetUtilizationPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu-target-utilization-percent` |
| `deploymentController` | software.amazon.awscdk.services.ecs.DeploymentController | [[cdk.support/lookup-entry]] | `:deployment-controller` |
| `disableCpuBasedScaling` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:disable-cpu-based-scaling` |
| `enableEcsManagedTags` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-ecs-managed-tags` |
| `enableExecuteCommand` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-execute-command` |
| `enableLogging` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-logging` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `family` | java.lang.String | [[cdk.support/lookup-entry]] | `:family` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `maxHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-healthy-percent` |
| `maxReceiveCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-receive-count` |
| `maxScalingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:max-scaling-capacity` |
| `minHealthyPercent` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-healthy-percent` |
| `minScalingCapacity` | java.lang.Number | [[cdk.support/lookup-entry]] | `:min-scaling-capacity` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `queue` | software.amazon.awscdk.services.sqs.IQueue | [[cdk.support/lookup-entry]] | `:queue` |
| `retentionPeriod` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:retention-period` |
| `scalingSteps` | java.util.List | [[cdk.support/lookup-entry]] | `:scaling-steps` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `serviceName` | java.lang.String | [[cdk.support/lookup-entry]] | `:service-name` |
| `visibilityTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:visibility-timeout` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^QueueProcessingServiceBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :capacity-provider-strategies)]
    (. builder capacityProviderStrategies data))
  (when-some [data (lookup-entry config id :circuit-breaker)]
    (. builder circuitBreaker data))
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :cooldown)]
    (. builder cooldown data))
  (when-some [data (lookup-entry config id :cpu-target-utilization-percent)]
    (. builder cpuTargetUtilizationPercent data))
  (when-some [data (lookup-entry config id :deployment-controller)]
    (. builder deploymentController data))
  (when-some [data (lookup-entry config id :disable-cpu-based-scaling)]
    (. builder disableCpuBasedScaling data))
  (when-some [data (lookup-entry config id :enable-ecs-managed-tags)]
    (. builder enableEcsManagedTags data))
  (when-some [data (lookup-entry config id :enable-execute-command)]
    (. builder enableExecuteCommand data))
  (when-some [data (lookup-entry config id :enable-logging)]
    (. builder enableLogging data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :family)]
    (. builder family data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :max-healthy-percent)]
    (. builder maxHealthyPercent data))
  (when-some [data (lookup-entry config id :max-receive-count)]
    (. builder maxReceiveCount data))
  (when-some [data (lookup-entry config id :max-scaling-capacity)]
    (. builder maxScalingCapacity data))
  (when-some [data (lookup-entry config id :min-healthy-percent)]
    (. builder minHealthyPercent data))
  (when-some [data (lookup-entry config id :min-scaling-capacity)]
    (. builder minScalingCapacity data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :queue)]
    (. builder queue data))
  (when-some [data (lookup-entry config id :retention-period)]
    (. builder retentionPeriod data))
  (when-some [data (lookup-entry config id :scaling-steps)]
    (. builder scalingSteps data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :service-name)]
    (. builder serviceName data))
  (when-some [data (lookup-entry config id :visibility-timeout)]
    (. builder visibilityTimeout data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn queue-processing-service-base-props-builder
  "Creates a  `QueueProcessingServiceBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (queue-processing-service-base-props-builder> (new QueueProcessingServiceBaseProps$Builder) id config))


(defn scheduled-ec2-task-builder>
  "The scheduled-ec2-task-builder> function updates a ScheduledEc2Task$Builder instance using the provided configuration.
  The function takes the ScheduledEc2Task$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `desiredTaskCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-task-count` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `schedule` | software.amazon.awscdk.services.applicationautoscaling.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `scheduledEc2TaskDefinitionOptions` | software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions | [[cdk.support/lookup-entry]] | `:scheduled-ec2-task-definition-options` |
| `scheduledEc2TaskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions | [[cdk.support/lookup-entry]] | `:scheduled-ec2-task-image-options` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ScheduledEc2Task$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :desired-task-count)]
    (. builder desiredTaskCount data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :scheduled-ec2-task-definition-options)]
    (. builder scheduledEc2TaskDefinitionOptions data))
  (when-some [data (lookup-entry config id :scheduled-ec2-task-image-options)]
    (. builder scheduledEc2TaskImageOptions data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn scheduled-ec2-task-builder
  "Creates a  `ScheduledEc2Task$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (scheduled-ec2-task-builder> (ScheduledEc2Task$Builder/create scope (name id)) id config))


(defn scheduled-ec2-task-definition-options-builder>
  "The scheduled-ec2-task-definition-options-builder> function updates a ScheduledEc2TaskDefinitionOptions$Builder instance using the provided configuration.
  The function takes the ScheduledEc2TaskDefinitionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `taskDefinition` | software.amazon.awscdk.services.ecs.Ec2TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
"
  [^ScheduledEc2TaskDefinitionOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (.build builder))


(defn scheduled-ec2-task-definition-options-builder
  "Creates a  `ScheduledEc2TaskDefinitionOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (scheduled-ec2-task-definition-options-builder> (new ScheduledEc2TaskDefinitionOptions$Builder) id config))


(defn scheduled-ec2-task-image-options-builder>
  "The scheduled-ec2-task-image-options-builder> function updates a ScheduledEc2TaskImageOptions$Builder instance using the provided configuration.
  The function takes the ScheduledEc2TaskImageOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `memoryReservationMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-reservation-mi-b` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
"
  [^ScheduledEc2TaskImageOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (lookup-entry config id :memory-reservation-mi-b)]
    (. builder memoryReservationMiB data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (.build builder))


(defn scheduled-ec2-task-image-options-builder
  "Creates a  `ScheduledEc2TaskImageOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (scheduled-ec2-task-image-options-builder> (new ScheduledEc2TaskImageOptions$Builder) id config))


(defn scheduled-ec2-task-props-builder>
  "The scheduled-ec2-task-props-builder> function updates a ScheduledEc2TaskProps$Builder instance using the provided configuration.
  The function takes the ScheduledEc2TaskProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `desiredTaskCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-task-count` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `schedule` | software.amazon.awscdk.services.applicationautoscaling.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `scheduledEc2TaskDefinitionOptions` | software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskDefinitionOptions | [[cdk.support/lookup-entry]] | `:scheduled-ec2-task-definition-options` |
| `scheduledEc2TaskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions | [[cdk.support/lookup-entry]] | `:scheduled-ec2-task-image-options` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ScheduledEc2TaskProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :desired-task-count)]
    (. builder desiredTaskCount data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :scheduled-ec2-task-definition-options)]
    (. builder scheduledEc2TaskDefinitionOptions data))
  (when-some [data (lookup-entry config id :scheduled-ec2-task-image-options)]
    (. builder scheduledEc2TaskImageOptions data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn scheduled-ec2-task-props-builder
  "Creates a  `ScheduledEc2TaskProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (scheduled-ec2-task-props-builder> (new ScheduledEc2TaskProps$Builder) id config))


(defn scheduled-fargate-task-builder>
  "The scheduled-fargate-task-builder> function updates a ScheduledFargateTask$Builder instance using the provided configuration.
  The function takes the ScheduledFargateTask$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `desiredTaskCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-task-count` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `schedule` | software.amazon.awscdk.services.applicationautoscaling.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `scheduledFargateTaskDefinitionOptions` | software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions | [[cdk.support/lookup-entry]] | `:scheduled-fargate-task-definition-options` |
| `scheduledFargateTaskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions | [[cdk.support/lookup-entry]] | `:scheduled-fargate-task-image-options` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ScheduledFargateTask$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :desired-task-count)]
    (. builder desiredTaskCount data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :scheduled-fargate-task-definition-options)]
    (. builder scheduledFargateTaskDefinitionOptions data))
  (when-some [data (lookup-entry config id :scheduled-fargate-task-image-options)]
    (. builder scheduledFargateTaskImageOptions data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn scheduled-fargate-task-builder
  "Creates a  `ScheduledFargateTask$Builder` instance using a scope and ID, applies the data configuration, then builds it.  Takes the following arguments: 
| Argument | DataType | Description |
|---|---|---|
| scope | software.constructs.Construct | The parent scope construct of the object being built. |
| id | String or Keyword or Symbol | Value to use as both the ID of the object being build and the namespace when looking up configuration values. |
| config | map | Data configuration |"
  [^software.constructs.Construct scope id config]
  (scheduled-fargate-task-builder> (ScheduledFargateTask$Builder/create scope (name id)) id config))


(defn scheduled-fargate-task-definition-options-builder>
  "The scheduled-fargate-task-definition-options-builder> function updates a ScheduledFargateTaskDefinitionOptions$Builder instance using the provided configuration.
  The function takes the ScheduledFargateTaskDefinitionOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
"
  [^ScheduledFargateTaskDefinitionOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (.build builder))


(defn scheduled-fargate-task-definition-options-builder
  "Creates a  `ScheduledFargateTaskDefinitionOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (scheduled-fargate-task-definition-options-builder> (new ScheduledFargateTaskDefinitionOptions$Builder) id config))


(defn scheduled-fargate-task-image-options-builder>
  "The scheduled-fargate-task-image-options-builder> function updates a ScheduledFargateTaskImageOptions$Builder instance using the provided configuration.
  The function takes the ScheduledFargateTaskImageOptions$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
"
  [^ScheduledFargateTaskImageOptions$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (.build builder))


(defn scheduled-fargate-task-image-options-builder
  "Creates a  `ScheduledFargateTaskImageOptions$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (scheduled-fargate-task-image-options-builder> (new ScheduledFargateTaskImageOptions$Builder) id config))


(defn scheduled-fargate-task-props-builder>
  "The scheduled-fargate-task-props-builder> function updates a ScheduledFargateTaskProps$Builder instance using the provided configuration.
  The function takes the ScheduledFargateTaskProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `desiredTaskCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-task-count` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `schedule` | software.amazon.awscdk.services.applicationautoscaling.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `scheduledFargateTaskDefinitionOptions` | software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskDefinitionOptions | [[cdk.support/lookup-entry]] | `:scheduled-fargate-task-definition-options` |
| `scheduledFargateTaskImageOptions` | software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions | [[cdk.support/lookup-entry]] | `:scheduled-fargate-task-image-options` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ScheduledFargateTaskProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :cpu)]
    (. builder cpu data))
  (when-some [data (lookup-entry config id :desired-task-count)]
    (. builder desiredTaskCount data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (lookup-entry config id :ephemeral-storage-gi-b)]
    (. builder ephemeralStorageGiB data))
  (when-some [data (lookup-entry config id :memory-limit-mi-b)]
    (. builder memoryLimitMiB data))
  (when-some [data (fargate-platform-version config id :platform-version)]
    (. builder platformVersion data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :runtime-platform)]
    (. builder runtimePlatform data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :scheduled-fargate-task-definition-options)]
    (. builder scheduledFargateTaskDefinitionOptions data))
  (when-some [data (lookup-entry config id :scheduled-fargate-task-image-options)]
    (. builder scheduledFargateTaskImageOptions data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :task-definition)]
    (. builder taskDefinition data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn scheduled-fargate-task-props-builder
  "Creates a  `ScheduledFargateTaskProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (scheduled-fargate-task-props-builder> (new ScheduledFargateTaskProps$Builder) id config))


(defn scheduled-task-base-props-builder>
  "The scheduled-task-base-props-builder> function updates a ScheduledTaskBaseProps$Builder instance using the provided configuration.
  The function takes the ScheduledTaskBaseProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cluster` | software.amazon.awscdk.services.ecs.ICluster | [[cdk.support/lookup-entry]] | `:cluster` |
| `desiredTaskCount` | java.lang.Number | [[cdk.support/lookup-entry]] | `:desired-task-count` |
| `enabled` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enabled` |
| `propagateTags` | software.amazon.awscdk.services.ecs.PropagatedTagSource | [[cdk.api.services.ecs/propagated-tag-source]] | `:propagate-tags` |
| `ruleName` | java.lang.String | [[cdk.support/lookup-entry]] | `:rule-name` |
| `schedule` | software.amazon.awscdk.services.applicationautoscaling.Schedule | [[cdk.support/lookup-entry]] | `:schedule` |
| `securityGroups` | java.util.List | [[cdk.support/lookup-entry]] | `:security-groups` |
| `subnetSelection` | software.amazon.awscdk.services.ec2.SubnetSelection | [[cdk.support/lookup-entry]] | `:subnet-selection` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |
"
  [^ScheduledTaskBaseProps$Builder builder id config]
  (when-some [data (lookup-entry config id :cluster)]
    (. builder cluster data))
  (when-some [data (lookup-entry config id :desired-task-count)]
    (. builder desiredTaskCount data))
  (when-some [data (lookup-entry config id :enabled)]
    (. builder enabled data))
  (when-some [data (propagated-tag-source config id :propagate-tags)]
    (. builder propagateTags data))
  (when-some [data (lookup-entry config id :rule-name)]
    (. builder ruleName data))
  (when-some [data (lookup-entry config id :schedule)]
    (. builder schedule data))
  (when-some [data (lookup-entry config id :security-groups)]
    (. builder securityGroups data))
  (when-some [data (lookup-entry config id :subnet-selection)]
    (. builder subnetSelection data))
  (when-some [data (lookup-entry config id :tags)]
    (. builder tags data))
  (when-some [data (lookup-entry config id :vpc)]
    (. builder vpc data))
  (.build builder))


(defn scheduled-task-base-props-builder
  "Creates a  `ScheduledTaskBaseProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (scheduled-task-base-props-builder> (new ScheduledTaskBaseProps$Builder) id config))


(defn scheduled-task-image-props-builder>
  "The scheduled-task-image-props-builder> function updates a ScheduledTaskImageProps$Builder instance using the provided configuration.
  The function takes the ScheduledTaskImageProps$Builder instance, an optional namespace to use when looking up a value in the configuration,
  and the configuration itself.

  Fields on the builder are populated by looking up their respective data key, where the namespaced value takes precendence over the non-namespaced value:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |
"
  [^ScheduledTaskImageProps$Builder builder id config]
  (when-some [data (lookup-entry config id :command)]
    (. builder command data))
  (when-some [data (lookup-entry config id :container-name)]
    (. builder containerName data))
  (when-some [data (lookup-entry config id :environment)]
    (. builder environment data))
  (when-some [data (lookup-entry config id :image)]
    (. builder image data))
  (when-some [data (lookup-entry config id :log-driver)]
    (. builder logDriver data))
  (when-some [data (lookup-entry config id :secrets)]
    (. builder secrets data))
  (.build builder))


(defn scheduled-task-image-props-builder
  "Creates a  `ScheduledTaskImageProps$Builder` instance using a no-argument constructor, applies the data configuration, then builds it.  Takes the following arguments: 

| Argument | DataType | Description |
|---|---|---|
| id | String or Keyword or Symbol | Value to use as namespace when looking up configuration values. |
| config | map | Data configuration |"
  [id config]
  (scheduled-task-image-props-builder> (new ScheduledTaskImageProps$Builder) id config))