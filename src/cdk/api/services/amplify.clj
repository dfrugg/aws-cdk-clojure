(ns cdk.api.services.amplify
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.amplify package. "
  (:require [cdk.support :refer [lookup-entry]])
  (:import [software.amazon.awscdk.services.amplify CfnApp$AutoBranchCreationConfigProperty$Builder
                                                    CfnApp$BasicAuthConfigProperty$Builder
                                                    CfnApp$Builder
                                                    CfnApp$CustomRuleProperty$Builder
                                                    CfnApp$EnvironmentVariableProperty$Builder
                                                    CfnAppProps$Builder
                                                    CfnBranch$BackendProperty$Builder
                                                    CfnBranch$BasicAuthConfigProperty$Builder
                                                    CfnBranch$Builder
                                                    CfnBranch$EnvironmentVariableProperty$Builder
                                                    CfnBranchProps$Builder
                                                    CfnDomain$Builder
                                                    CfnDomain$CertificateProperty$Builder
                                                    CfnDomain$CertificateSettingsProperty$Builder
                                                    CfnDomain$SubDomainSettingProperty$Builder
                                                    CfnDomainProps$Builder]))


(defn cfn-app-auto-branch-creation-config-property-builder
  "The cfn-app-auto-branch-creation-config-property-builder function buildes out new instances of 
CfnApp$AutoBranchCreationConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `autoBranchCreationPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:auto-branch-creation-patterns` |
| `basicAuthConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:basic-auth-config` |
| `buildSpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-spec` |
| `enableAutoBranchCreation` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-auto-branch-creation` |
| `enableAutoBuild` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-auto-build` |
| `enablePerformanceMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-performance-mode` |
| `enablePullRequestPreview` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-pull-request-preview` |
| `environmentVariables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `framework` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework` |
| `pullRequestEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pull-request-environment-name` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |"
  [stack id config]
  (let [builder (CfnApp$AutoBranchCreationConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :auto-branch-creation-patterns)]
      (. builder autoBranchCreationPatterns data))
    (when-let [data (lookup-entry config id :basic-auth-config)]
      (. builder basicAuthConfig data))
    (when-let [data (lookup-entry config id :build-spec)]
      (. builder buildSpec data))
    (when-let [data (lookup-entry config id :enable-auto-branch-creation)]
      (. builder enableAutoBranchCreation data))
    (when-let [data (lookup-entry config id :enable-auto-build)]
      (. builder enableAutoBuild data))
    (when-let [data (lookup-entry config id :enable-performance-mode)]
      (. builder enablePerformanceMode data))
    (when-let [data (lookup-entry config id :enable-pull-request-preview)]
      (. builder enablePullRequestPreview data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :framework)]
      (. builder framework data))
    (when-let [data (lookup-entry config id :pull-request-environment-name)]
      (. builder pullRequestEnvironmentName data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (.build builder)))


(defn cfn-app-basic-auth-config-property-builder
  "The cfn-app-basic-auth-config-property-builder function buildes out new instances of 
CfnApp$BasicAuthConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableBasicAuth` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-basic-auth` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnApp$BasicAuthConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-basic-auth)]
      (. builder enableBasicAuth data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-app-builder
  "The cfn-app-builder function buildes out new instances of 
CfnApp$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `autoBranchCreationConfig` | software.amazon.awscdk.services.amplify.CfnApp$AutoBranchCreationConfigProperty | [[cdk.support/lookup-entry]] | `:auto-branch-creation-config` |
| `basicAuthConfig` | software.amazon.awscdk.services.amplify.CfnApp$BasicAuthConfigProperty | [[cdk.support/lookup-entry]] | `:basic-auth-config` |
| `buildSpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-spec` |
| `customHeaders` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `customRules` | java.util.List | [[cdk.support/lookup-entry]] | `:custom-rules` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableBranchAutoDeletion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-branch-auto-deletion` |
| `environmentVariables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `iamServiceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-service-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `oauthToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:oauth-token` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnApp$Builder/create stack id)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (when-let [data (lookup-entry config id :auto-branch-creation-config)]
      (. builder autoBranchCreationConfig data))
    (when-let [data (lookup-entry config id :basic-auth-config)]
      (. builder basicAuthConfig data))
    (when-let [data (lookup-entry config id :build-spec)]
      (. builder buildSpec data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :custom-rules)]
      (. builder customRules data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enable-branch-auto-deletion)]
      (. builder enableBranchAutoDeletion data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :iam-service-role)]
      (. builder iamServiceRole data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :oauth-token)]
      (. builder oauthToken data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-app-custom-rule-property-builder
  "The cfn-app-custom-rule-property-builder function buildes out new instances of 
CfnApp$CustomRuleProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `condition` | java.lang.String | [[cdk.support/lookup-entry]] | `:condition` |
| `source` | java.lang.String | [[cdk.support/lookup-entry]] | `:source` |
| `status` | java.lang.String | [[cdk.support/lookup-entry]] | `:status` |
| `target` | java.lang.String | [[cdk.support/lookup-entry]] | `:target` |"
  [stack id config]
  (let [builder (CfnApp$CustomRuleProperty$Builder.)]
    (when-let [data (lookup-entry config id :condition)]
      (. builder condition data))
    (when-let [data (lookup-entry config id :source)]
      (. builder source data))
    (when-let [data (lookup-entry config id :status)]
      (. builder status data))
    (when-let [data (lookup-entry config id :target)]
      (. builder target data))
    (.build builder)))


(defn cfn-app-environment-variable-property-builder
  "The cfn-app-environment-variable-property-builder function buildes out new instances of 
CfnApp$EnvironmentVariableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnApp$EnvironmentVariableProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-app-props-builder
  "The cfn-app-props-builder function buildes out new instances of 
CfnAppProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `accessToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:access-token` |
| `autoBranchCreationConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:auto-branch-creation-config` |
| `basicAuthConfig` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:basic-auth-config` |
| `buildSpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-spec` |
| `customHeaders` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-headers` |
| `customRules` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:custom-rules` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableBranchAutoDeletion` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-branch-auto-deletion` |
| `environmentVariables` | java.util.List | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `iamServiceRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:iam-service-role` |
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `oauthToken` | java.lang.String | [[cdk.support/lookup-entry]] | `:oauth-token` |
| `platform` | java.lang.String | [[cdk.support/lookup-entry]] | `:platform` |
| `repository` | java.lang.String | [[cdk.support/lookup-entry]] | `:repository` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnAppProps$Builder.)]
    (when-let [data (lookup-entry config id :access-token)]
      (. builder accessToken data))
    (when-let [data (lookup-entry config id :auto-branch-creation-config)]
      (. builder autoBranchCreationConfig data))
    (when-let [data (lookup-entry config id :basic-auth-config)]
      (. builder basicAuthConfig data))
    (when-let [data (lookup-entry config id :build-spec)]
      (. builder buildSpec data))
    (when-let [data (lookup-entry config id :custom-headers)]
      (. builder customHeaders data))
    (when-let [data (lookup-entry config id :custom-rules)]
      (. builder customRules data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enable-branch-auto-deletion)]
      (. builder enableBranchAutoDeletion data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :iam-service-role)]
      (. builder iamServiceRole data))
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :oauth-token)]
      (. builder oauthToken data))
    (when-let [data (lookup-entry config id :platform)]
      (. builder platform data))
    (when-let [data (lookup-entry config id :repository)]
      (. builder repository data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-branch-backend-property-builder
  "The cfn-branch-backend-property-builder function buildes out new instances of 
CfnBranch$BackendProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `stackArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:stack-arn` |"
  [stack id config]
  (let [builder (CfnBranch$BackendProperty$Builder.)]
    (when-let [data (lookup-entry config id :stack-arn)]
      (. builder stackArn data))
    (.build builder)))


(defn cfn-branch-basic-auth-config-property-builder
  "The cfn-branch-basic-auth-config-property-builder function buildes out new instances of 
CfnBranch$BasicAuthConfigProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `enableBasicAuth` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-basic-auth` |
| `password` | java.lang.String | [[cdk.support/lookup-entry]] | `:password` |
| `username` | java.lang.String | [[cdk.support/lookup-entry]] | `:username` |"
  [stack id config]
  (let [builder (CfnBranch$BasicAuthConfigProperty$Builder.)]
    (when-let [data (lookup-entry config id :enable-basic-auth)]
      (. builder enableBasicAuth data))
    (when-let [data (lookup-entry config id :password)]
      (. builder password data))
    (when-let [data (lookup-entry config id :username)]
      (. builder username data))
    (.build builder)))


(defn cfn-branch-builder
  "The cfn-branch-builder function buildes out new instances of 
CfnBranch$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appId` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id` |
| `backend` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:backend` |
| `basicAuthConfig` | software.amazon.awscdk.services.amplify.CfnBranch$BasicAuthConfigProperty | [[cdk.support/lookup-entry]] | `:basic-auth-config` |
| `branchName` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-name` |
| `buildSpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-spec` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableAutoBuild` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-auto-build` |
| `enablePerformanceMode` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-performance-mode` |
| `enablePullRequestPreview` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-pull-request-preview` |
| `environmentVariables` | java.util.List | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `framework` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework` |
| `pullRequestEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pull-request-environment-name` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBranch$Builder/create stack id)]
    (when-let [data (lookup-entry config id :app-id)]
      (. builder appId data))
    (when-let [data (lookup-entry config id :backend)]
      (. builder backend data))
    (when-let [data (lookup-entry config id :basic-auth-config)]
      (. builder basicAuthConfig data))
    (when-let [data (lookup-entry config id :branch-name)]
      (. builder branchName data))
    (when-let [data (lookup-entry config id :build-spec)]
      (. builder buildSpec data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enable-auto-build)]
      (. builder enableAutoBuild data))
    (when-let [data (lookup-entry config id :enable-performance-mode)]
      (. builder enablePerformanceMode data))
    (when-let [data (lookup-entry config id :enable-pull-request-preview)]
      (. builder enablePullRequestPreview data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :framework)]
      (. builder framework data))
    (when-let [data (lookup-entry config id :pull-request-environment-name)]
      (. builder pullRequestEnvironmentName data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-branch-environment-variable-property-builder
  "The cfn-branch-environment-variable-property-builder function buildes out new instances of 
CfnBranch$EnvironmentVariableProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `name` | java.lang.String | [[cdk.support/lookup-entry]] | `:name` |
| `value` | java.lang.String | [[cdk.support/lookup-entry]] | `:value` |"
  [stack id config]
  (let [builder (CfnBranch$EnvironmentVariableProperty$Builder.)]
    (when-let [data (lookup-entry config id :name)]
      (. builder name data))
    (when-let [data (lookup-entry config id :value)]
      (. builder value data))
    (.build builder)))


(defn cfn-branch-props-builder
  "The cfn-branch-props-builder function buildes out new instances of 
CfnBranchProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appId` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id` |
| `backend` | software.amazon.awscdk.services.amplify.CfnBranch$BackendProperty | [[cdk.support/lookup-entry]] | `:backend` |
| `basicAuthConfig` | software.amazon.awscdk.services.amplify.CfnBranch$BasicAuthConfigProperty | [[cdk.support/lookup-entry]] | `:basic-auth-config` |
| `branchName` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-name` |
| `buildSpec` | java.lang.String | [[cdk.support/lookup-entry]] | `:build-spec` |
| `description` | java.lang.String | [[cdk.support/lookup-entry]] | `:description` |
| `enableAutoBuild` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-auto-build` |
| `enablePerformanceMode` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-performance-mode` |
| `enablePullRequestPreview` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:enable-pull-request-preview` |
| `environmentVariables` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:environment-variables` |
| `framework` | java.lang.String | [[cdk.support/lookup-entry]] | `:framework` |
| `pullRequestEnvironmentName` | java.lang.String | [[cdk.support/lookup-entry]] | `:pull-request-environment-name` |
| `stage` | java.lang.String | [[cdk.support/lookup-entry]] | `:stage` |
| `tags` | java.util.List | [[cdk.support/lookup-entry]] | `:tags` |"
  [stack id config]
  (let [builder (CfnBranchProps$Builder.)]
    (when-let [data (lookup-entry config id :app-id)]
      (. builder appId data))
    (when-let [data (lookup-entry config id :backend)]
      (. builder backend data))
    (when-let [data (lookup-entry config id :basic-auth-config)]
      (. builder basicAuthConfig data))
    (when-let [data (lookup-entry config id :branch-name)]
      (. builder branchName data))
    (when-let [data (lookup-entry config id :build-spec)]
      (. builder buildSpec data))
    (when-let [data (lookup-entry config id :description)]
      (. builder description data))
    (when-let [data (lookup-entry config id :enable-auto-build)]
      (. builder enableAutoBuild data))
    (when-let [data (lookup-entry config id :enable-performance-mode)]
      (. builder enablePerformanceMode data))
    (when-let [data (lookup-entry config id :enable-pull-request-preview)]
      (. builder enablePullRequestPreview data))
    (when-let [data (lookup-entry config id :environment-variables)]
      (. builder environmentVariables data))
    (when-let [data (lookup-entry config id :framework)]
      (. builder framework data))
    (when-let [data (lookup-entry config id :pull-request-environment-name)]
      (. builder pullRequestEnvironmentName data))
    (when-let [data (lookup-entry config id :stage)]
      (. builder stage data))
    (when-let [data (lookup-entry config id :tags)]
      (. builder tags data))
    (.build builder)))


(defn cfn-domain-builder
  "The cfn-domain-builder function buildes out new instances of 
CfnDomain$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appId` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id` |
| `autoSubDomainCreationPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:auto-sub-domain-creation-patterns` |
| `autoSubDomainIamRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-sub-domain-iam-role` |
| `certificateSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate-settings` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `enableAutoSubDomain` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-auto-sub-domain` |
| `subDomainSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:sub-domain-settings` |"
  [stack id config]
  (let [builder (CfnDomain$Builder/create stack id)]
    (when-let [data (lookup-entry config id :app-id)]
      (. builder appId data))
    (when-let [data (lookup-entry config id :auto-sub-domain-creation-patterns)]
      (. builder autoSubDomainCreationPatterns data))
    (when-let [data (lookup-entry config id :auto-sub-domain-iam-role)]
      (. builder autoSubDomainIamRole data))
    (when-let [data (lookup-entry config id :certificate-settings)]
      (. builder certificateSettings data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :enable-auto-sub-domain)]
      (. builder enableAutoSubDomain data))
    (when-let [data (lookup-entry config id :sub-domain-settings)]
      (. builder subDomainSettings data))
    (.build builder)))


(defn cfn-domain-certificate-property-builder
  "The cfn-domain-certificate-property-builder function buildes out new instances of 
CfnDomain$CertificateProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-arn` |
| `certificateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-type` |
| `certificateVerificationDnsRecord` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-verification-dns-record` |"
  [stack id config]
  (let [builder (CfnDomain$CertificateProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-arn)]
      (. builder certificateArn data))
    (when-let [data (lookup-entry config id :certificate-type)]
      (. builder certificateType data))
    (when-let [data (lookup-entry config id :certificate-verification-dns-record)]
      (. builder certificateVerificationDnsRecord data))
    (.build builder)))


(defn cfn-domain-certificate-settings-property-builder
  "The cfn-domain-certificate-settings-property-builder function buildes out new instances of 
CfnDomain$CertificateSettingsProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `certificateType` | java.lang.String | [[cdk.support/lookup-entry]] | `:certificate-type` |
| `customCertificateArn` | java.lang.String | [[cdk.support/lookup-entry]] | `:custom-certificate-arn` |"
  [stack id config]
  (let [builder (CfnDomain$CertificateSettingsProperty$Builder.)]
    (when-let [data (lookup-entry config id :certificate-type)]
      (. builder certificateType data))
    (when-let [data (lookup-entry config id :custom-certificate-arn)]
      (. builder customCertificateArn data))
    (.build builder)))


(defn cfn-domain-props-builder
  "The cfn-domain-props-builder function buildes out new instances of 
CfnDomainProps$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `appId` | java.lang.String | [[cdk.support/lookup-entry]] | `:app-id` |
| `autoSubDomainCreationPatterns` | java.util.List | [[cdk.support/lookup-entry]] | `:auto-sub-domain-creation-patterns` |
| `autoSubDomainIamRole` | java.lang.String | [[cdk.support/lookup-entry]] | `:auto-sub-domain-iam-role` |
| `certificateSettings` | software.amazon.awscdk.IResolvable | [[cdk.support/lookup-entry]] | `:certificate-settings` |
| `domainName` | java.lang.String | [[cdk.support/lookup-entry]] | `:domain-name` |
| `enableAutoSubDomain` | java.lang.Boolean | [[cdk.support/lookup-entry]] | `:enable-auto-sub-domain` |
| `subDomainSettings` | java.util.List | [[cdk.support/lookup-entry]] | `:sub-domain-settings` |"
  [stack id config]
  (let [builder (CfnDomainProps$Builder.)]
    (when-let [data (lookup-entry config id :app-id)]
      (. builder appId data))
    (when-let [data (lookup-entry config id :auto-sub-domain-creation-patterns)]
      (. builder autoSubDomainCreationPatterns data))
    (when-let [data (lookup-entry config id :auto-sub-domain-iam-role)]
      (. builder autoSubDomainIamRole data))
    (when-let [data (lookup-entry config id :certificate-settings)]
      (. builder certificateSettings data))
    (when-let [data (lookup-entry config id :domain-name)]
      (. builder domainName data))
    (when-let [data (lookup-entry config id :enable-auto-sub-domain)]
      (. builder enableAutoSubDomain data))
    (when-let [data (lookup-entry config id :sub-domain-settings)]
      (. builder subDomainSettings data))
    (.build builder)))


(defn cfn-domain-sub-domain-setting-property-builder
  "The cfn-domain-sub-domain-setting-property-builder function buildes out new instances of 
CfnDomain$SubDomainSettingProperty$Builder using the provided configuration.  Each field is set as follows:

| Field | DataType | Lookup Function | Data Key |
|---|---|---|---|
| `branchName` | java.lang.String | [[cdk.support/lookup-entry]] | `:branch-name` |
| `prefix` | java.lang.String | [[cdk.support/lookup-entry]] | `:prefix` |"
  [stack id config]
  (let [builder (CfnDomain$SubDomainSettingProperty$Builder.)]
    (when-let [data (lookup-entry config id :branch-name)]
      (. builder branchName data))
    (when-let [data (lookup-entry config id :prefix)]
      (. builder prefix data))
    (.build builder)))