# com.ccommercepayment - Kotlin client library for Payment Gateway

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CardApi* | [**v1CardCreditHolderPost**](docs/CardApi.md#v1cardcreditholderpost) | **POST** /v1/card/creditHolder | Credit a card.
*Card3DsPaymentApi* | [**v1PaymentsCard3dsPaymentAuthenticationPost**](docs/Card3DsPaymentApi.md#v1paymentscard3dspaymentauthenticationpost) | **POST** /v1/payments/card3ds-payment/authentication | Validate authentication.
*Card3DsPaymentApi* | [**v1PaymentsCard3dsPaymentPost**](docs/Card3DsPaymentApi.md#v1paymentscard3dspaymentpost) | **POST** /v1/payments/card3ds-payment | Check enrollment
*Card3DsPaymentApi* | [**v1PaymentsCard3dsPaymentPut**](docs/Card3DsPaymentApi.md#v1paymentscard3dspaymentput) | **PUT** /v1/payments/card3ds-payment | Validate authentication AND authorize / payment
*Card3DsPaymentApi* | [**v1PaymentsCard3dsPaymentWithAuthenticationDataPost**](docs/Card3DsPaymentApi.md#v1paymentscard3dspaymentwithauthenticationdatapost) | **POST** /v1/payments/card3ds-payment/with-authentication-data | Authorization / payment -with- authentication data
*CardPaymentApi* | [**v1PaymentsCardPaymentPost**](docs/CardPaymentApi.md#v1paymentscardpaymentpost) | **POST** /v1/payments/card-payment | Authorization / payment
*DuplicatePaymentApi* | [**v1PaymentsDuplicatePaymentBatchPost**](docs/DuplicatePaymentApi.md#v1paymentsduplicatepaymentbatchpost) | **POST** /v1/payments/duplicate-payment/batch | Duplicate payment batch
*DuplicatePaymentApi* | [**v1PaymentsDuplicatePaymentPost**](docs/DuplicatePaymentApi.md#v1paymentsduplicatepaymentpost) | **POST** /v1/payments/duplicate-payment | Duplicate payment
*PaymentOptionsApi* | [**v1PaymentOptionsMerchantsByMerchantIdSitesByMerchantSiteIdGet**](docs/PaymentOptionsApi.md#v1paymentoptionsmerchantsbymerchantidsitesbymerchantsiteidget) | **GET** /v1/payment-options/merchants/{merchantId}/sites/{merchantSiteId} | Gets payment options
*PaymentOptionsApi* | [**v1PaymentOptionsPost**](docs/PaymentOptionsApi.md#v1paymentoptionspost) | **POST** /v1/payment-options | Gets payment options for a context
*PaymentOptionsApi* | [**v1PaymentOptionsValidateEligibilityPost**](docs/PaymentOptionsApi.md#v1paymentoptionsvalidateeligibilitypost) | **POST** /v1/payment-options/validateEligibility | Validates eligibility
*PaymentSessionApi* | [**v1PaymentSessionsByPaymentSessionIdPaymentResultGet**](docs/PaymentSessionApi.md#v1paymentsessionsbypaymentsessionidpaymentresultget) | **GET** /v1/payment-sessions/{paymentSessionId}/paymentResult | Gets the payment result from its session id.
*PaymentSessionApi* | [**v1PaymentSessionsPost**](docs/PaymentSessionApi.md#v1paymentsessionspost) | **POST** /v1/payment-sessions | Creates a payment session.
*PaymentsApi* | [**v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet**](docs/PaymentsApi.md#v1paymentsallbyorderrefmerchantsbymerchantidsitesbymerchantsiteidget) | **GET** /v1/payments/all/{orderRef}/merchants/{merchantId}/sites/{merchantSiteId} | Gets all payment schedules
*PaymentsApi* | [**v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet**](docs/PaymentsApi.md#v1paymentsbyorderrefmerchantsbymerchantidsitesbymerchantsiteidbyordertagget) | **GET** /v1/payments/{orderRef}/merchants/{merchantId}/sites/{merchantSiteId}/{orderTag} | Gets payment schedule by tag.
*PaymentsApi* | [**v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet**](docs/PaymentsApi.md#v1paymentsbyorderrefmerchantsbymerchantidsitesbymerchantsiteidget) | **GET** /v1/payments/{orderRef}/merchants/{merchantId}/sites/{merchantSiteId} | Gets payment schedule
*PaymentsApi* | [**v1PaymentsByOrderRefOperationsCancelOrRefundPut**](docs/PaymentsApi.md#v1paymentsbyorderrefoperationscancelorrefundput) | **PUT** /v1/payments/{orderRef}/operations/cancelOrRefund | Cancel or refund
*PaymentsApi* | [**v1PaymentsByOrderRefOperationsCapturePut**](docs/PaymentsApi.md#v1paymentsbyorderrefoperationscaptureput) | **PUT** /v1/payments/{orderRef}/operations/capture | Capture
*PaymentsApi* | [**v1PaymentsByOrderRefOperationsRecomputePut**](docs/PaymentsApi.md#v1paymentsbyorderrefoperationsrecomputeput) | **PUT** /v1/payments/{orderRef}/operations/recompute | Recompute schedule
*SecurityTokenApi* | [**v1AuthTokenGet**](docs/SecurityTokenApi.md#v1authtokenget) | **GET** /v1/auth/token | Authenticate
*StoredPaymentMethodsApi* | [**v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdCustomerRefByCustomerRefGet**](docs/StoredPaymentMethodsApi.md#v1storedpaymentmethodsmerchantsbymerchantidsitesbymerchantsiteidcustomerrefbycustomerrefget) | **GET** /v1/stored-payment-methods/merchants/{merchantId}/sites/{merchantSiteId}/customerRef/{customerRef} | Gets stored payment methods by CustomerRef
*StoredPaymentMethodsApi* | [**v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdDelete**](docs/StoredPaymentMethodsApi.md#v1storedpaymentmethodsmerchantsbymerchantidsitesbymerchantsiteidstoredpaymentmethodidbystoredpaymentmethodiddelete) | **DELETE** /v1/stored-payment-methods/merchants/{merchantId}/sites/{merchantSiteId}/storedPaymentMethodId/{storedPaymentMethodId} | Deletes a stored payment method
*StoredPaymentMethodsApi* | [**v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdGet**](docs/StoredPaymentMethodsApi.md#v1storedpaymentmethodsmerchantsbymerchantidsitesbymerchantsiteidstoredpaymentmethodidbystoredpaymentmethodidget) | **GET** /v1/stored-payment-methods/merchants/{merchantId}/sites/{merchantSiteId}/storedPaymentMethodId/{storedPaymentMethodId} | Gets a stored payment method
*StoredPaymentMethodsApi* | [**v1StoredPaymentMethodsPost**](docs/StoredPaymentMethodsApi.md#v1storedpaymentmethodspost) | **POST** /v1/stored-payment-methods | Stores a new payment method.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.ccommercepayment.models.AcquiringBank](docs/AcquiringBank.md)
 - [com.ccommercepayment.models.Card3DsAuthorizeWithAuthDataRequest](docs/Card3DsAuthorizeWithAuthDataRequest.md)
 - [com.ccommercepayment.models.Card3DsCheckEnrollmentRequest](docs/Card3DsCheckEnrollmentRequest.md)
 - [com.ccommercepayment.models.Card3DsCheckEnrollmentResponse](docs/Card3DsCheckEnrollmentResponse.md)
 - [com.ccommercepayment.models.Card3DsValidateAuthenticationAndAuthorizeRequest](docs/Card3DsValidateAuthenticationAndAuthorizeRequest.md)
 - [com.ccommercepayment.models.Card3DsValidateAuthenticationRequest](docs/Card3DsValidateAuthenticationRequest.md)
 - [com.ccommercepayment.models.Card3DsValidateAuthenticationResponse](docs/Card3DsValidateAuthenticationResponse.md)
 - [com.ccommercepayment.models.CardData](docs/CardData.md)
 - [com.ccommercepayment.models.CardPaymentContextData](docs/CardPaymentContextData.md)
 - [com.ccommercepayment.models.CardPaymentCreditHolderRequest](docs/CardPaymentCreditHolderRequest.md)
 - [com.ccommercepayment.models.CardPaymentCreditHolderResponse](docs/CardPaymentCreditHolderResponse.md)
 - [com.ccommercepayment.models.CardPaymentRequest](docs/CardPaymentRequest.md)
 - [com.ccommercepayment.models.CardPaymentResponse](docs/CardPaymentResponse.md)
 - [com.ccommercepayment.models.Configuration](docs/Configuration.md)
 - [com.ccommercepayment.models.CopyReference](docs/CopyReference.md)
 - [com.ccommercepayment.models.Customer](docs/Customer.md)
 - [com.ccommercepayment.models.DuplicatePaymentBatchRequest](docs/DuplicatePaymentBatchRequest.md)
 - [com.ccommercepayment.models.DuplicatePaymentRequest](docs/DuplicatePaymentRequest.md)
 - [com.ccommercepayment.models.GetPaymentSessionResult](docs/GetPaymentSessionResult.md)
 - [com.ccommercepayment.models.LoanOffer](docs/LoanOffer.md)
 - [com.ccommercepayment.models.LoanTerm](docs/LoanTerm.md)
 - [com.ccommercepayment.models.Options](docs/Options.md)
 - [com.ccommercepayment.models.Order](docs/Order.md)
 - [com.ccommercepayment.models.OrderData](docs/OrderData.md)
 - [com.ccommercepayment.models.PaymentCard](docs/PaymentCard.md)
 - [com.ccommercepayment.models.PaymentCardOption](docs/PaymentCardOption.md)
 - [com.ccommercepayment.models.PaymentFee](docs/PaymentFee.md)
 - [com.ccommercepayment.models.PaymentOperationsRequest](docs/PaymentOperationsRequest.md)
 - [com.ccommercepayment.models.PaymentOperationsResponse](docs/PaymentOperationsResponse.md)
 - [com.ccommercepayment.models.PaymentOption](docs/PaymentOption.md)
 - [com.ccommercepayment.models.PaymentOptionsContextData](docs/PaymentOptionsContextData.md)
 - [com.ccommercepayment.models.PaymentOptionsRequest](docs/PaymentOptionsRequest.md)
 - [com.ccommercepayment.models.PaymentOptionsResponse](docs/PaymentOptionsResponse.md)
 - [com.ccommercepayment.models.PaymentScheduleRule](docs/PaymentScheduleRule.md)
 - [com.ccommercepayment.models.PaymentSessionRequest](docs/PaymentSessionRequest.md)
 - [com.ccommercepayment.models.PaymentSessionResponse](docs/PaymentSessionResponse.md)
 - [com.ccommercepayment.models.RedirectionData](docs/RedirectionData.md)
 - [com.ccommercepayment.models.Schedule](docs/Schedule.md)
 - [com.ccommercepayment.models.ScheduleLight](docs/ScheduleLight.md)
 - [com.ccommercepayment.models.ShippingAddress](docs/ShippingAddress.md)
 - [com.ccommercepayment.models.StoredCard](docs/StoredCard.md)
 - [com.ccommercepayment.models.StoredPaymentMethod](docs/StoredPaymentMethod.md)
 - [com.ccommercepayment.models.StoredPaymentMethodRequest](docs/StoredPaymentMethodRequest.md)
 - [com.ccommercepayment.models.StoredPaymentMethodResponse](docs/StoredPaymentMethodResponse.md)
 - [com.ccommercepayment.models.SubOrder](docs/SubOrder.md)
 - [com.ccommercepayment.models.ValidationModeOverride](docs/ValidationModeOverride.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
