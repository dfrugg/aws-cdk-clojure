(ns cdk.api.services.ecs.patterns
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.ecs.patterns package. "
  (:require [cdk.support :refer [lookup-entry]]
            [cdk.api.services.ecs :refer [fargate-platform-version
                                          propagated-tag-source
                                          protocol]]
            [cdk.api.services.elasticloadbalancingv2 :refer [application-protocol
                                                             application-protocol-version
                                                             ip-address-type
                                                             ssl-policy]])
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


(defn application-listener-props-builder
  "The application-listener-props-builder function buildes out new instances of 
ApplicationListenerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificate` | software.amazon.awscdk.services.certificatemanager.ICertificate | [[cdk.support/lookup-entry]] | `:certificate` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |
| `protocol` | software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol | [[cdk.api.services.elasticloadbalancingv2/application-protocol]] | `:protocol` |
| `sslPolicy` | software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy | [[cdk.api.services.elasticloadbalancingv2/ssl-policy]] | `:ssl-policy` |"
  [stack id config]
  (let [builder (ApplicationListenerProps$Builder.)]
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (.build builder)))


(defn application-load-balanced-ec2-service-builder
  "The application-load-balanced-ec2-service-builder function buildes out new instances of 
ApplicationLoadBalancedEc2Service$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancedEc2Service$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :idle-timeout)]
      (. builder idleTimeout data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :open-listener)]
      (. builder openListener data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (application-protocol-version config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (when-let [data (application-load-balanced-service-record-type config id :record-type)]
      (. builder recordType data))
    (when-let [data (lookup-entry config id :redirect-http)]
      (. builder redirectHttp data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (when-let [data (application-protocol config id :target-protocol)]
      (. builder targetProtocol data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-load-balanced-ec2-service-props-builder
  "The application-load-balanced-ec2-service-props-builder function buildes out new instances of 
ApplicationLoadBalancedEc2ServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancedEc2ServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :idle-timeout)]
      (. builder idleTimeout data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :open-listener)]
      (. builder openListener data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (application-protocol-version config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (when-let [data (application-load-balanced-service-record-type config id :record-type)]
      (. builder recordType data))
    (when-let [data (lookup-entry config id :redirect-http)]
      (. builder redirectHttp data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (when-let [data (application-protocol config id :target-protocol)]
      (. builder targetProtocol data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-load-balanced-fargate-service-builder
  "The application-load-balanced-fargate-service-builder function buildes out new instances of 
ApplicationLoadBalancedFargateService$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancedFargateService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :idle-timeout)]
      (. builder idleTimeout data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :open-listener)]
      (. builder openListener data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (application-protocol-version config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (when-let [data (application-load-balanced-service-record-type config id :record-type)]
      (. builder recordType data))
    (when-let [data (lookup-entry config id :redirect-http)]
      (. builder redirectHttp data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (when-let [data (application-protocol config id :target-protocol)]
      (. builder targetProtocol data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :task-subnets)]
      (. builder taskSubnets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-load-balanced-fargate-service-props-builder
  "The application-load-balanced-fargate-service-props-builder function buildes out new instances of 
ApplicationLoadBalancedFargateServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancedFargateServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :idle-timeout)]
      (. builder idleTimeout data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :open-listener)]
      (. builder openListener data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (application-protocol-version config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (when-let [data (application-load-balanced-service-record-type config id :record-type)]
      (. builder recordType data))
    (when-let [data (lookup-entry config id :redirect-http)]
      (. builder redirectHttp data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (when-let [data (application-protocol config id :target-protocol)]
      (. builder targetProtocol data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :task-subnets)]
      (. builder taskSubnets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-load-balanced-service-base-props-builder
  "The application-load-balanced-service-base-props-builder function buildes out new instances of 
ApplicationLoadBalancedServiceBaseProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancedServiceBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :certificate)]
      (. builder certificate data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :idle-timeout)]
      (. builder idleTimeout data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :load-balancer-name)]
      (. builder loadBalancerName data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :open-listener)]
      (. builder openListener data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (application-protocol config id :protocol)]
      (. builder protocol data))
    (when-let [data (application-protocol-version config id :protocol-version)]
      (. builder protocolVersion data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (when-let [data (application-load-balanced-service-record-type config id :record-type)]
      (. builder recordType data))
    (when-let [data (lookup-entry config id :redirect-http)]
      (. builder redirectHttp data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (ssl-policy config id :ssl-policy)]
      (. builder sslPolicy data))
    (when-let [data (application-protocol config id :target-protocol)]
      (. builder targetProtocol data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-load-balanced-task-image-options-builder
  "The application-load-balanced-task-image-options-builder function buildes out new instances of 
ApplicationLoadBalancedTaskImageOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancedTaskImageOptions$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :docker-labels)]
      (. builder dockerLabels data))
    (when-let [data (lookup-entry config id :enable-logging)]
      (. builder enableLogging data))
    (when-let [data (lookup-entry config id :entry-point)]
      (. builder entryPoint data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (.build builder)))


(defn application-load-balanced-task-image-props-builder
  "The application-load-balanced-task-image-props-builder function buildes out new instances of 
ApplicationLoadBalancedTaskImageProps$Builder using the provided configuration.  Each field is set as follows:

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
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancedTaskImageProps$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :container-ports)]
      (. builder containerPorts data))
    (when-let [data (lookup-entry config id :docker-labels)]
      (. builder dockerLabels data))
    (when-let [data (lookup-entry config id :enable-logging)]
      (. builder enableLogging data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (.build builder)))


(defn application-load-balancer-props-builder
  "The application-load-balancer-props-builder function buildes out new instances of 
ApplicationLoadBalancerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `idleTimeout` | software.amazon.awscdk.Duration | [[cdk.support/lookup-entry]] | `:idle-timeout` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |"
  [stack id config]
  (let [builder (ApplicationLoadBalancerProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :idle-timeout)]
      (. builder idleTimeout data))
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (.build builder)))


(defn application-multiple-target-groups-ec2-service-builder
  "The application-multiple-target-groups-ec2-service-builder function buildes out new instances of 
ApplicationMultipleTargetGroupsEc2Service$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationMultipleTargetGroupsEc2Service$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-multiple-target-groups-ec2-service-props-builder
  "The application-multiple-target-groups-ec2-service-props-builder function buildes out new instances of 
ApplicationMultipleTargetGroupsEc2ServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationMultipleTargetGroupsEc2ServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-multiple-target-groups-fargate-service-builder
  "The application-multiple-target-groups-fargate-service-builder function buildes out new instances of 
ApplicationMultipleTargetGroupsFargateService$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationMultipleTargetGroupsFargateService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-multiple-target-groups-fargate-service-props-builder
  "The application-multiple-target-groups-fargate-service-props-builder function buildes out new instances of 
ApplicationMultipleTargetGroupsFargateServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationMultipleTargetGroupsFargateServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-multiple-target-groups-service-base-props-builder
  "The application-multiple-target-groups-service-base-props-builder function buildes out new instances of 
ApplicationMultipleTargetGroupsServiceBaseProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ApplicationMultipleTargetGroupsServiceBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn application-target-props-builder
  "The application-target-props-builder function buildes out new instances of 
ApplicationTargetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `hostHeader` | java.lang.String | [[cdk.support/lookup-entry]] | `:host-header` |
| `listener` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener` |
| `pathPattern` | java.lang.String | [[cdk.support/lookup-entry]] | `:path-pattern` |
| `priority` | java.lang.Number | [[cdk.support/lookup-entry]] | `:priority` |
| `protocol` | software.amazon.awscdk.services.ecs.Protocol | [[cdk.api.services.ecs/protocol]] | `:protocol` |"
  [stack id config]
  (let [builder (ApplicationTargetProps$Builder.)]
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :host-header)]
      (. builder hostHeader data))
    (when-let [data (lookup-entry config id :listener)]
      (. builder listener data))
    (when-let [data (lookup-entry config id :path-pattern)]
      (. builder pathPattern data))
    (when-let [data (lookup-entry config id :priority)]
      (. builder priority data))
    (when-let [data (protocol config id :protocol)]
      (. builder protocol data))
    (.build builder)))


(defn fargate-service-base-props-builder
  "The fargate-service-base-props-builder function buildes out new instances of 
FargateServiceBaseProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `cpu` | java.lang.Number | [[cdk.support/lookup-entry]] | `:cpu` |
| `ephemeralStorageGiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:ephemeral-storage-gi-b` |
| `memoryLimitMiB` | java.lang.Number | [[cdk.support/lookup-entry]] | `:memory-limit-mi-b` |
| `platformVersion` | software.amazon.awscdk.services.ecs.FargatePlatformVersion | [[cdk.api.services.ecs/fargate-platform-version]] | `:platform-version` |
| `runtimePlatform` | software.amazon.awscdk.services.ecs.RuntimePlatform | [[cdk.support/lookup-entry]] | `:runtime-platform` |
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |"
  [stack id config]
  (let [builder (FargateServiceBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (.build builder)))


(defn network-listener-props-builder
  "The network-listener-props-builder function buildes out new instances of 
NetworkListenerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `port` | java.lang.Number | [[cdk.support/lookup-entry]] | `:port` |"
  [stack id config]
  (let [builder (NetworkListenerProps$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :port)]
      (. builder port data))
    (.build builder)))


(defn network-load-balanced-ec2-service-builder
  "The network-load-balanced-ec2-service-builder function buildes out new instances of 
NetworkLoadBalancedEc2Service$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkLoadBalancedEc2Service$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (when-let [data (network-load-balanced-service-record-type config id :record-type)]
      (. builder recordType data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-load-balanced-ec2-service-props-builder
  "The network-load-balanced-ec2-service-props-builder function buildes out new instances of 
NetworkLoadBalancedEc2ServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkLoadBalancedEc2ServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (when-let [data (network-load-balanced-service-record-type config id :record-type)]
      (. builder recordType data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-load-balanced-fargate-service-builder
  "The network-load-balanced-fargate-service-builder function buildes out new instances of 
NetworkLoadBalancedFargateService$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkLoadBalancedFargateService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (when-let [data (network-load-balanced-service-record-type config id :record-type)]
      (. builder recordType data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :task-subnets)]
      (. builder taskSubnets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-load-balanced-fargate-service-props-builder
  "The network-load-balanced-fargate-service-props-builder function buildes out new instances of 
NetworkLoadBalancedFargateServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkLoadBalancedFargateServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (when-let [data (network-load-balanced-service-record-type config id :record-type)]
      (. builder recordType data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :task-subnets)]
      (. builder taskSubnets data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-load-balanced-service-base-props-builder
  "The network-load-balanced-service-base-props-builder function buildes out new instances of 
NetworkLoadBalancedServiceBaseProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkLoadBalancedServiceBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (ip-address-type config id :ip-address-type)]
      (. builder ipAddressType data))
    (when-let [data (lookup-entry config id :listener-port)]
      (. builder listenerPort data))
    (when-let [data (lookup-entry config id :load-balancer)]
      (. builder loadBalancer data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (when-let [data (network-load-balanced-service-record-type config id :record-type)]
      (. builder recordType data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-load-balanced-task-image-options-builder
  "The network-load-balanced-task-image-options-builder function buildes out new instances of 
NetworkLoadBalancedTaskImageOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |"
  [stack id config]
  (let [builder (NetworkLoadBalancedTaskImageOptions$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :docker-labels)]
      (. builder dockerLabels data))
    (when-let [data (lookup-entry config id :enable-logging)]
      (. builder enableLogging data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (.build builder)))


(defn network-load-balanced-task-image-props-builder
  "The network-load-balanced-task-image-props-builder function buildes out new instances of 
NetworkLoadBalancedTaskImageProps$Builder using the provided configuration.  Each field is set as follows:

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
| `taskRole` | software.amazon.awscdk.services.iam.IRole | [[cdk.support/lookup-entry]] | `:task-role` |"
  [stack id config]
  (let [builder (NetworkLoadBalancedTaskImageProps$Builder.)]
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :container-ports)]
      (. builder containerPorts data))
    (when-let [data (lookup-entry config id :docker-labels)]
      (. builder dockerLabels data))
    (when-let [data (lookup-entry config id :enable-logging)]
      (. builder enableLogging data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :execution-role)]
      (. builder executionRole data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :task-role)]
      (. builder taskRole data))
    (.build builder)))


(defn network-load-balancer-props-builder
  "The network-load-balancer-props-builder function buildes out new instances of 
NetworkLoadBalancerProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `domainZone` | software.amazon.awscdk.services.route53.IHostedZone | [[cdk.support/lookup-entry]] | `:domain-zone` |
| `listeners` | java.util.List | [[cdk.support/lookup-entry]] | `:listeners` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `publicLoadBalancer` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:public-load-balancer` |"
  [stack id config]
  (let [builder (NetworkLoadBalancerProps$Builder.)]
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :domain-zone)]
      (. builder domainZone data))
    (when-let [data (lookup-entry config id :listeners)]
      (. builder listeners data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :public-load-balancer)]
      (. builder publicLoadBalancer data))
    (.build builder)))


(defn network-multiple-target-groups-ec2-service-builder
  "The network-multiple-target-groups-ec2-service-builder function buildes out new instances of 
NetworkMultipleTargetGroupsEc2Service$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkMultipleTargetGroupsEc2Service$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-multiple-target-groups-ec2-service-props-builder
  "The network-multiple-target-groups-ec2-service-props-builder function buildes out new instances of 
NetworkMultipleTargetGroupsEc2ServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkMultipleTargetGroupsEc2ServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-multiple-target-groups-fargate-service-builder
  "The network-multiple-target-groups-fargate-service-builder function buildes out new instances of 
NetworkMultipleTargetGroupsFargateService$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkMultipleTargetGroupsFargateService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-multiple-target-groups-fargate-service-props-builder
  "The network-multiple-target-groups-fargate-service-props-builder function buildes out new instances of 
NetworkMultipleTargetGroupsFargateServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkMultipleTargetGroupsFargateServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-multiple-target-groups-service-base-props-builder
  "The network-multiple-target-groups-service-base-props-builder function buildes out new instances of 
NetworkMultipleTargetGroupsServiceBaseProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (NetworkMultipleTargetGroupsServiceBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :cloud-map-options)]
      (. builder cloudMapOptions data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :desired-count)]
      (. builder desiredCount data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :health-check-grace-period)]
      (. builder healthCheckGracePeriod data))
    (when-let [data (lookup-entry config id :load-balancers)]
      (. builder loadBalancers data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :target-groups)]
      (. builder targetGroups data))
    (when-let [data (lookup-entry config id :task-image-options)]
      (. builder taskImageOptions data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn network-target-props-builder
  "The network-target-props-builder function buildes out new instances of 
NetworkTargetProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `containerPort` | java.lang.Number | [[cdk.support/lookup-entry]] | `:container-port` |
| `listener` | java.lang.String | [[cdk.support/lookup-entry]] | `:listener` |"
  [stack id config]
  (let [builder (NetworkTargetProps$Builder.)]
    (when-let [data (lookup-entry config id :container-port)]
      (. builder containerPort data))
    (when-let [data (lookup-entry config id :listener)]
      (. builder listener data))
    (.build builder)))


(defn queue-processing-ec2-service-builder
  "The queue-processing-ec2-service-builder function buildes out new instances of 
QueueProcessingEc2Service$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (QueueProcessingEc2Service$Builder/create stack id)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :cpu-target-utilization-percent)]
      (. builder cpuTargetUtilizationPercent data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :disable-cpu-based-scaling)]
      (. builder disableCpuBasedScaling data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :enable-logging)]
      (. builder enableLogging data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :gpu-count)]
      (. builder gpuCount data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :max-receive-count)]
      (. builder maxReceiveCount data))
    (when-let [data (lookup-entry config id :max-scaling-capacity)]
      (. builder maxScalingCapacity data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :min-scaling-capacity)]
      (. builder minScalingCapacity data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :queue)]
      (. builder queue data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :scaling-steps)]
      (. builder scalingSteps data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :visibility-timeout)]
      (. builder visibilityTimeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn queue-processing-ec2-service-props-builder
  "The queue-processing-ec2-service-props-builder function buildes out new instances of 
QueueProcessingEc2ServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (QueueProcessingEc2ServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :cpu-target-utilization-percent)]
      (. builder cpuTargetUtilizationPercent data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :disable-cpu-based-scaling)]
      (. builder disableCpuBasedScaling data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :enable-logging)]
      (. builder enableLogging data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :gpu-count)]
      (. builder gpuCount data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :max-receive-count)]
      (. builder maxReceiveCount data))
    (when-let [data (lookup-entry config id :max-scaling-capacity)]
      (. builder maxScalingCapacity data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :min-scaling-capacity)]
      (. builder minScalingCapacity data))
    (when-let [data (lookup-entry config id :placement-constraints)]
      (. builder placementConstraints data))
    (when-let [data (lookup-entry config id :placement-strategies)]
      (. builder placementStrategies data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :queue)]
      (. builder queue data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :scaling-steps)]
      (. builder scalingSteps data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :visibility-timeout)]
      (. builder visibilityTimeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn queue-processing-fargate-service-builder
  "The queue-processing-fargate-service-builder function buildes out new instances of 
QueueProcessingFargateService$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (QueueProcessingFargateService$Builder/create stack id)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :cpu-target-utilization-percent)]
      (. builder cpuTargetUtilizationPercent data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :disable-cpu-based-scaling)]
      (. builder disableCpuBasedScaling data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :enable-logging)]
      (. builder enableLogging data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :max-receive-count)]
      (. builder maxReceiveCount data))
    (when-let [data (lookup-entry config id :max-scaling-capacity)]
      (. builder maxScalingCapacity data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :min-scaling-capacity)]
      (. builder minScalingCapacity data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :queue)]
      (. builder queue data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :scaling-steps)]
      (. builder scalingSteps data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-subnets)]
      (. builder taskSubnets data))
    (when-let [data (lookup-entry config id :visibility-timeout)]
      (. builder visibilityTimeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn queue-processing-fargate-service-props-builder
  "The queue-processing-fargate-service-props-builder function buildes out new instances of 
QueueProcessingFargateServiceProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (QueueProcessingFargateServiceProps$Builder.)]
    (when-let [data (lookup-entry config id :assign-public-ip)]
      (. builder assignPublicIp data))
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :cpu-target-utilization-percent)]
      (. builder cpuTargetUtilizationPercent data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :disable-cpu-based-scaling)]
      (. builder disableCpuBasedScaling data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :enable-logging)]
      (. builder enableLogging data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :health-check)]
      (. builder healthCheck data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :max-receive-count)]
      (. builder maxReceiveCount data))
    (when-let [data (lookup-entry config id :max-scaling-capacity)]
      (. builder maxScalingCapacity data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :min-scaling-capacity)]
      (. builder minScalingCapacity data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :queue)]
      (. builder queue data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :scaling-steps)]
      (. builder scalingSteps data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :task-subnets)]
      (. builder taskSubnets data))
    (when-let [data (lookup-entry config id :visibility-timeout)]
      (. builder visibilityTimeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn queue-processing-service-base-props-builder
  "The queue-processing-service-base-props-builder function buildes out new instances of 
QueueProcessingServiceBaseProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (QueueProcessingServiceBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :capacity-provider-strategies)]
      (. builder capacityProviderStrategies data))
    (when-let [data (lookup-entry config id :circuit-breaker)]
      (. builder circuitBreaker data))
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :cooldown)]
      (. builder cooldown data))
    (when-let [data (lookup-entry config id :cpu-target-utilization-percent)]
      (. builder cpuTargetUtilizationPercent data))
    (when-let [data (lookup-entry config id :deployment-controller)]
      (. builder deploymentController data))
    (when-let [data (lookup-entry config id :disable-cpu-based-scaling)]
      (. builder disableCpuBasedScaling data))
    (when-let [data (lookup-entry config id :enable-ecs-managed-tags)]
      (. builder enableEcsManagedTags data))
    (when-let [data (lookup-entry config id :enable-execute-command)]
      (. builder enableExecuteCommand data))
    (when-let [data (lookup-entry config id :enable-logging)]
      (. builder enableLogging data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :family)]
      (. builder family data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :max-healthy-percent)]
      (. builder maxHealthyPercent data))
    (when-let [data (lookup-entry config id :max-receive-count)]
      (. builder maxReceiveCount data))
    (when-let [data (lookup-entry config id :max-scaling-capacity)]
      (. builder maxScalingCapacity data))
    (when-let [data (lookup-entry config id :min-healthy-percent)]
      (. builder minHealthyPercent data))
    (when-let [data (lookup-entry config id :min-scaling-capacity)]
      (. builder minScalingCapacity data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :queue)]
      (. builder queue data))
    (when-let [data (lookup-entry config id :retention-period)]
      (. builder retentionPeriod data))
    (when-let [data (lookup-entry config id :scaling-steps)]
      (. builder scalingSteps data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :service-name)]
      (. builder serviceName data))
    (when-let [data (lookup-entry config id :visibility-timeout)]
      (. builder visibilityTimeout data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn scheduled-ec2-task-builder
  "The scheduled-ec2-task-builder function buildes out new instances of 
ScheduledEc2Task$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ScheduledEc2Task$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :desired-task-count)]
      (. builder desiredTaskCount data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :scheduled-ec2-task-definition-options)]
      (. builder scheduledEc2TaskDefinitionOptions data))
    (when-let [data (lookup-entry config id :scheduled-ec2-task-image-options)]
      (. builder scheduledEc2TaskImageOptions data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn scheduled-ec2-task-definition-options-builder
  "The scheduled-ec2-task-definition-options-builder function buildes out new instances of 
ScheduledEc2TaskDefinitionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `taskDefinition` | software.amazon.awscdk.services.ecs.Ec2TaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |"
  [stack id config]
  (let [builder (ScheduledEc2TaskDefinitionOptions$Builder.)]
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (.build builder)))


(defn scheduled-ec2-task-image-options-builder
  "The scheduled-ec2-task-image-options-builder function buildes out new instances of 
ScheduledEc2TaskImageOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |"
  [stack id config]
  (let [builder (ScheduledEc2TaskImageOptions$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (lookup-entry config id :memory-reservation-mi-b)]
      (. builder memoryReservationMiB data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (.build builder)))


(defn scheduled-ec2-task-props-builder
  "The scheduled-ec2-task-props-builder function buildes out new instances of 
ScheduledEc2TaskProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ScheduledEc2TaskProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :desired-task-count)]
      (. builder desiredTaskCount data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :scheduled-ec2-task-definition-options)]
      (. builder scheduledEc2TaskDefinitionOptions data))
    (when-let [data (lookup-entry config id :scheduled-ec2-task-image-options)]
      (. builder scheduledEc2TaskImageOptions data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn scheduled-fargate-task-builder
  "The scheduled-fargate-task-builder function buildes out new instances of 
ScheduledFargateTask$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ScheduledFargateTask$Builder/create stack id)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :desired-task-count)]
      (. builder desiredTaskCount data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :scheduled-fargate-task-definition-options)]
      (. builder scheduledFargateTaskDefinitionOptions data))
    (when-let [data (lookup-entry config id :scheduled-fargate-task-image-options)]
      (. builder scheduledFargateTaskImageOptions data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn scheduled-fargate-task-definition-options-builder
  "The scheduled-fargate-task-definition-options-builder function buildes out new instances of 
ScheduledFargateTaskDefinitionOptions$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |"
  [stack id config]
  (let [builder (ScheduledFargateTaskDefinitionOptions$Builder.)]
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (.build builder)))


(defn scheduled-fargate-task-image-options-builder
  "The scheduled-fargate-task-image-options-builder function buildes out new instances of 
ScheduledFargateTaskImageOptions$Builder using the provided configuration.  Each field is set as follows:

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
| `taskDefinition` | software.amazon.awscdk.services.ecs.FargateTaskDefinition | [[cdk.support/lookup-entry]] | `:task-definition` |"
  [stack id config]
  (let [builder (ScheduledFargateTaskImageOptions$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (.build builder)))


(defn scheduled-fargate-task-props-builder
  "The scheduled-fargate-task-props-builder function buildes out new instances of 
ScheduledFargateTaskProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ScheduledFargateTaskProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :cpu)]
      (. builder cpu data))
    (when-let [data (lookup-entry config id :desired-task-count)]
      (. builder desiredTaskCount data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (lookup-entry config id :ephemeral-storage-gi-b)]
      (. builder ephemeralStorageGiB data))
    (when-let [data (lookup-entry config id :memory-limit-mi-b)]
      (. builder memoryLimitMiB data))
    (when-let [data (fargate-platform-version config id :platform-version)]
      (. builder platformVersion data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :runtime-platform)]
      (. builder runtimePlatform data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :scheduled-fargate-task-definition-options)]
      (. builder scheduledFargateTaskDefinitionOptions data))
    (when-let [data (lookup-entry config id :scheduled-fargate-task-image-options)]
      (. builder scheduledFargateTaskImageOptions data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :task-definition)]
      (. builder taskDefinition data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn scheduled-task-base-props-builder
  "The scheduled-task-base-props-builder function buildes out new instances of 
ScheduledTaskBaseProps$Builder using the provided configuration.  Each field is set as follows:

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
| `vpc` | software.amazon.awscdk.services.ec2.IVpc | [[cdk.support/lookup-entry]] | `:vpc` |"
  [stack id config]
  (let [builder (ScheduledTaskBaseProps$Builder.)]
    (when-let [data (lookup-entry config id :cluster)]
      (. builder cluster data))
    (when-let [data (lookup-entry config id :desired-task-count)]
      (. builder desiredTaskCount data))
    (when-let [data (lookup-entry config id :enabled)]
      (. builder enabled data))
    (when-let [data (propagated-tag-source config id :propagate-tags)]
      (. builder propagateTags data))
    (when-let [data (lookup-entry config id :rule-name)]
      (. builder ruleName data))
    (when-let [data (lookup-entry config id :schedule)]
      (. builder schedule data))
    (when-let [data (lookup-entry config id :security-groups)]
      (. builder securityGroups data))
    (when-let [data (lookup-entry config id :subnet-selection)]
      (. builder subnetSelection data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (when-let [data (lookup-entry config id :vpc)]
      (. builder vpc data))
    (.build builder)))


(defn scheduled-task-image-props-builder
  "The scheduled-task-image-props-builder function buildes out new instances of 
ScheduledTaskImageProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `command` | java.util.List | [[cdk.support/lookup-entry]] | `:command` |
| `containerName` | java.lang.String | [[cdk.support/lookup-entry]] | `:container-name` |
| `environment` | java.util.Map | [[cdk.support/lookup-entry]] | `:environment` |
| `image` | software.amazon.awscdk.services.ecs.ContainerImage | [[cdk.support/lookup-entry]] | `:image` |
| `logDriver` | software.amazon.awscdk.services.ecs.LogDriver | [[cdk.support/lookup-entry]] | `:log-driver` |
| `secrets` | java.util.Map | [[cdk.support/lookup-entry]] | `:secrets` |"
  [stack id config]
  (let [builder (ScheduledTaskImageProps$Builder.)]
    (when-let [data (lookup-entry config id :command)]
      (. builder command data))
    (when-let [data (lookup-entry config id :container-name)]
      (. builder containerName data))
    (when-let [data (lookup-entry config id :environment)]
      (. builder environment data))
    (when-let [data (lookup-entry config id :image)]
      (. builder image data))
    (when-let [data (lookup-entry config id :log-driver)]
      (. builder logDriver data))
    (when-let [data (lookup-entry config id :secrets)]
      (. builder secrets data))
    (.build builder)))