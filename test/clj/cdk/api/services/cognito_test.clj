(ns cdk.api.services.cognito-test
  "Functions that represent AWS CDK enums and builders in the software.amazon.awscdk.services.cognito package. "
  (:require [cdk.api.services.cognito :refer [account-recovery
                                              advanced-security-mode
                                              lambda-version
                                              mfa
                                              oidc-attribute-request-method
                                              signing-algorithm
                                              user-pool-identity-provider-saml-metadata-type
                                              verification-email-style]]
            [clojure.test :refer [deftest
                                  is
                                  testing]])
  (:import [software.amazon.awscdk.services.cognito AccountRecovery
                                                    AdvancedSecurityMode
                                                    LambdaVersion
                                                    Mfa
                                                    OidcAttributeRequestMethod
                                                    SigningAlgorithm
                                                    UserPoolIdentityProviderSamlMetadataType
                                                    VerificationEmailStyle]))


(deftest account-recovery-test
  (testing "Testing enum function account-recovery"
    (is (= AccountRecovery/NONE (account-recovery {:item AccountRecovery/NONE} "test" :item)))
    (is (= AccountRecovery/NONE (account-recovery {:test/item AccountRecovery/NONE} "test" :item)))
    (is (= AccountRecovery/EMAIL_ONLY (account-recovery {:item AccountRecovery/EMAIL_ONLY} "test" :item)))
    (is (= AccountRecovery/EMAIL_ONLY (account-recovery {:test/item AccountRecovery/EMAIL_ONLY} "test" :item)))
    (is (= AccountRecovery/PHONE_ONLY_WITHOUT_MFA (account-recovery {:item AccountRecovery/PHONE_ONLY_WITHOUT_MFA} "test" :item)))
    (is (= AccountRecovery/PHONE_ONLY_WITHOUT_MFA (account-recovery {:test/item AccountRecovery/PHONE_ONLY_WITHOUT_MFA} "test" :item)))
    (is (= AccountRecovery/PHONE_WITHOUT_MFA_AND_EMAIL (account-recovery {:item AccountRecovery/PHONE_WITHOUT_MFA_AND_EMAIL} "test" :item)))
    (is (= AccountRecovery/PHONE_WITHOUT_MFA_AND_EMAIL (account-recovery {:test/item AccountRecovery/PHONE_WITHOUT_MFA_AND_EMAIL} "test" :item)))
    (is (= AccountRecovery/PHONE_AND_EMAIL (account-recovery {:item AccountRecovery/PHONE_AND_EMAIL} "test" :item)))
    (is (= AccountRecovery/PHONE_AND_EMAIL (account-recovery {:test/item AccountRecovery/PHONE_AND_EMAIL} "test" :item)))
    (is (= AccountRecovery/EMAIL_AND_PHONE_WITHOUT_MFA (account-recovery {:item AccountRecovery/EMAIL_AND_PHONE_WITHOUT_MFA} "test" :item)))
    (is (= AccountRecovery/EMAIL_AND_PHONE_WITHOUT_MFA (account-recovery {:test/item AccountRecovery/EMAIL_AND_PHONE_WITHOUT_MFA} "test" :item)))
    (is (= AccountRecovery/NONE (account-recovery {:item :none} "test" :item)))
    (is (= AccountRecovery/NONE (account-recovery {:test/item :none} "test" :item)))
    (is (= AccountRecovery/EMAIL_ONLY (account-recovery {:item :email-only} "test" :item)))
    (is (= AccountRecovery/EMAIL_ONLY (account-recovery {:test/item :email-only} "test" :item)))
    (is (= AccountRecovery/PHONE_ONLY_WITHOUT_MFA (account-recovery {:item :phone-only-without-mfa} "test" :item)))
    (is (= AccountRecovery/PHONE_ONLY_WITHOUT_MFA (account-recovery {:test/item :phone-only-without-mfa} "test" :item)))
    (is (= AccountRecovery/PHONE_WITHOUT_MFA_AND_EMAIL (account-recovery {:item :phone-without-mfa-and-email} "test" :item)))
    (is (= AccountRecovery/PHONE_WITHOUT_MFA_AND_EMAIL (account-recovery {:test/item :phone-without-mfa-and-email} "test" :item)))
    (is (= AccountRecovery/PHONE_AND_EMAIL (account-recovery {:item :phone-and-email} "test" :item)))
    (is (= AccountRecovery/PHONE_AND_EMAIL (account-recovery {:test/item :phone-and-email} "test" :item)))
    (is (= AccountRecovery/EMAIL_AND_PHONE_WITHOUT_MFA (account-recovery {:item :email-and-phone-without-mfa} "test" :item)))
    (is (= AccountRecovery/EMAIL_AND_PHONE_WITHOUT_MFA (account-recovery {:test/item :email-and-phone-without-mfa} "test" :item)))))


(deftest advanced-security-mode-test
  (testing "Testing enum function advanced-security-mode"
    (is (= AdvancedSecurityMode/OFF (advanced-security-mode {:item AdvancedSecurityMode/OFF} "test" :item)))
    (is (= AdvancedSecurityMode/OFF (advanced-security-mode {:test/item AdvancedSecurityMode/OFF} "test" :item)))
    (is (= AdvancedSecurityMode/AUDIT (advanced-security-mode {:item AdvancedSecurityMode/AUDIT} "test" :item)))
    (is (= AdvancedSecurityMode/AUDIT (advanced-security-mode {:test/item AdvancedSecurityMode/AUDIT} "test" :item)))
    (is (= AdvancedSecurityMode/ENFORCED (advanced-security-mode {:item AdvancedSecurityMode/ENFORCED} "test" :item)))
    (is (= AdvancedSecurityMode/ENFORCED (advanced-security-mode {:test/item AdvancedSecurityMode/ENFORCED} "test" :item)))
    (is (= AdvancedSecurityMode/OFF (advanced-security-mode {:item :off} "test" :item)))
    (is (= AdvancedSecurityMode/OFF (advanced-security-mode {:test/item :off} "test" :item)))
    (is (= AdvancedSecurityMode/AUDIT (advanced-security-mode {:item :audit} "test" :item)))
    (is (= AdvancedSecurityMode/AUDIT (advanced-security-mode {:test/item :audit} "test" :item)))
    (is (= AdvancedSecurityMode/ENFORCED (advanced-security-mode {:item :enforced} "test" :item)))
    (is (= AdvancedSecurityMode/ENFORCED (advanced-security-mode {:test/item :enforced} "test" :item)))))


(deftest lambda-version-test
  (testing "Testing enum function lambda-version"
    (is (= LambdaVersion/V1_0 (lambda-version {:item LambdaVersion/V1_0} "test" :item)))
    (is (= LambdaVersion/V1_0 (lambda-version {:test/item LambdaVersion/V1_0} "test" :item)))
    (is (= LambdaVersion/V2_0 (lambda-version {:item LambdaVersion/V2_0} "test" :item)))
    (is (= LambdaVersion/V2_0 (lambda-version {:test/item LambdaVersion/V2_0} "test" :item)))
    (is (= LambdaVersion/V1_0 (lambda-version {:item :v1-0} "test" :item)))
    (is (= LambdaVersion/V1_0 (lambda-version {:test/item :v1-0} "test" :item)))
    (is (= LambdaVersion/V2_0 (lambda-version {:item :v2-0} "test" :item)))
    (is (= LambdaVersion/V2_0 (lambda-version {:test/item :v2-0} "test" :item)))))


(deftest mfa-test
  (testing "Testing enum function mfa"
    (is (= Mfa/OFF (mfa {:item Mfa/OFF} "test" :item)))
    (is (= Mfa/OFF (mfa {:test/item Mfa/OFF} "test" :item)))
    (is (= Mfa/OPTIONAL (mfa {:item Mfa/OPTIONAL} "test" :item)))
    (is (= Mfa/OPTIONAL (mfa {:test/item Mfa/OPTIONAL} "test" :item)))
    (is (= Mfa/REQUIRED (mfa {:item Mfa/REQUIRED} "test" :item)))
    (is (= Mfa/REQUIRED (mfa {:test/item Mfa/REQUIRED} "test" :item)))
    (is (= Mfa/OFF (mfa {:item :off} "test" :item)))
    (is (= Mfa/OFF (mfa {:test/item :off} "test" :item)))
    (is (= Mfa/OPTIONAL (mfa {:item :optional} "test" :item)))
    (is (= Mfa/OPTIONAL (mfa {:test/item :optional} "test" :item)))
    (is (= Mfa/REQUIRED (mfa {:item :required} "test" :item)))
    (is (= Mfa/REQUIRED (mfa {:test/item :required} "test" :item)))))


(deftest oidc-attribute-request-method-test
  (testing "Testing enum function oidc-attribute-request-method"
    (is (= OidcAttributeRequestMethod/GET (oidc-attribute-request-method {:item OidcAttributeRequestMethod/GET} "test" :item)))
    (is (= OidcAttributeRequestMethod/GET (oidc-attribute-request-method {:test/item OidcAttributeRequestMethod/GET} "test" :item)))
    (is (= OidcAttributeRequestMethod/POST (oidc-attribute-request-method {:item OidcAttributeRequestMethod/POST} "test" :item)))
    (is (= OidcAttributeRequestMethod/POST (oidc-attribute-request-method {:test/item OidcAttributeRequestMethod/POST} "test" :item)))
    (is (= OidcAttributeRequestMethod/GET (oidc-attribute-request-method {:item :get} "test" :item)))
    (is (= OidcAttributeRequestMethod/GET (oidc-attribute-request-method {:test/item :get} "test" :item)))
    (is (= OidcAttributeRequestMethod/POST (oidc-attribute-request-method {:item :post} "test" :item)))
    (is (= OidcAttributeRequestMethod/POST (oidc-attribute-request-method {:test/item :post} "test" :item)))))


(deftest signing-algorithm-test
  (testing "Testing enum function signing-algorithm"
    (is (= SigningAlgorithm/RSA_SHA256 (signing-algorithm {:item SigningAlgorithm/RSA_SHA256} "test" :item)))
    (is (= SigningAlgorithm/RSA_SHA256 (signing-algorithm {:test/item SigningAlgorithm/RSA_SHA256} "test" :item)))
    (is (= SigningAlgorithm/RSA_SHA256 (signing-algorithm {:item :rsa-sha256} "test" :item)))
    (is (= SigningAlgorithm/RSA_SHA256 (signing-algorithm {:test/item :rsa-sha256} "test" :item)))))


(deftest user-pool-identity-provider-saml-metadata-type-test
  (testing "Testing enum function user-pool-identity-provider-saml-metadata-type"
    (is (= UserPoolIdentityProviderSamlMetadataType/FILE (user-pool-identity-provider-saml-metadata-type {:item UserPoolIdentityProviderSamlMetadataType/FILE} "test" :item)))
    (is (= UserPoolIdentityProviderSamlMetadataType/FILE (user-pool-identity-provider-saml-metadata-type {:test/item UserPoolIdentityProviderSamlMetadataType/FILE} "test" :item)))
    (is (= UserPoolIdentityProviderSamlMetadataType/URL (user-pool-identity-provider-saml-metadata-type {:item UserPoolIdentityProviderSamlMetadataType/URL} "test" :item)))
    (is (= UserPoolIdentityProviderSamlMetadataType/URL (user-pool-identity-provider-saml-metadata-type {:test/item UserPoolIdentityProviderSamlMetadataType/URL} "test" :item)))
    (is (= UserPoolIdentityProviderSamlMetadataType/FILE (user-pool-identity-provider-saml-metadata-type {:item :file} "test" :item)))
    (is (= UserPoolIdentityProviderSamlMetadataType/FILE (user-pool-identity-provider-saml-metadata-type {:test/item :file} "test" :item)))
    (is (= UserPoolIdentityProviderSamlMetadataType/URL (user-pool-identity-provider-saml-metadata-type {:item :url} "test" :item)))
    (is (= UserPoolIdentityProviderSamlMetadataType/URL (user-pool-identity-provider-saml-metadata-type {:test/item :url} "test" :item)))))


(deftest verification-email-style-test
  (testing "Testing enum function verification-email-style"
    (is (= VerificationEmailStyle/CODE (verification-email-style {:item VerificationEmailStyle/CODE} "test" :item)))
    (is (= VerificationEmailStyle/CODE (verification-email-style {:test/item VerificationEmailStyle/CODE} "test" :item)))
    (is (= VerificationEmailStyle/LINK (verification-email-style {:item VerificationEmailStyle/LINK} "test" :item)))
    (is (= VerificationEmailStyle/LINK (verification-email-style {:test/item VerificationEmailStyle/LINK} "test" :item)))
    (is (= VerificationEmailStyle/CODE (verification-email-style {:item :code} "test" :item)))
    (is (= VerificationEmailStyle/CODE (verification-email-style {:test/item :code} "test" :item)))
    (is (= VerificationEmailStyle/LINK (verification-email-style {:item :link} "test" :item)))
    (is (= VerificationEmailStyle/LINK (verification-email-style {:test/item :link} "test" :item)))))