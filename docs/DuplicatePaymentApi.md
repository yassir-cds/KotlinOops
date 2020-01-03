# DuplicatePaymentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PaymentsDuplicatePaymentBatchPost**](DuplicatePaymentApi.md#v1PaymentsDuplicatePaymentBatchPost) | **POST** /v1/payments/duplicate-payment/batch | Duplicate payment batch
[**v1PaymentsDuplicatePaymentPost**](DuplicatePaymentApi.md#v1PaymentsDuplicatePaymentPost) | **POST** /v1/payments/duplicate-payment | Duplicate payment


<a name="v1PaymentsDuplicatePaymentBatchPost"></a>
# **v1PaymentsDuplicatePaymentBatchPost**
> CardPaymentResponse v1PaymentsDuplicatePaymentBatchPost(authToken, duplicatePaymentBatchRequest)

Duplicate payment batch

Achieve a batch of payments by copy of previously processed payments, with the same payment method.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = DuplicatePaymentApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val duplicatePaymentBatchRequest : DuplicatePaymentBatchRequest =  // DuplicatePaymentBatchRequest | All data needed to make process the payment, with the reference to the previously payment.
try {
    val result : CardPaymentResponse = apiInstance.v1PaymentsDuplicatePaymentBatchPost(authToken, duplicatePaymentBatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DuplicatePaymentApi#v1PaymentsDuplicatePaymentBatchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DuplicatePaymentApi#v1PaymentsDuplicatePaymentBatchPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **duplicatePaymentBatchRequest** | [**DuplicatePaymentBatchRequest**](DuplicatePaymentBatchRequest.md)| All data needed to make process the payment, with the reference to the previously payment. | [optional]

### Return type

[**CardPaymentResponse**](CardPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentsDuplicatePaymentPost"></a>
# **v1PaymentsDuplicatePaymentPost**
> CardPaymentResponse v1PaymentsDuplicatePaymentPost(authToken, duplicatePaymentRequest)

Duplicate payment

Achieve a payment by copy of a previously processed payment, with the same payment method.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = DuplicatePaymentApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val duplicatePaymentRequest : DuplicatePaymentRequest =  // DuplicatePaymentRequest | All data needed to make process the payment, with the reference to the previously payment.
try {
    val result : CardPaymentResponse = apiInstance.v1PaymentsDuplicatePaymentPost(authToken, duplicatePaymentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DuplicatePaymentApi#v1PaymentsDuplicatePaymentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DuplicatePaymentApi#v1PaymentsDuplicatePaymentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **duplicatePaymentRequest** | [**DuplicatePaymentRequest**](DuplicatePaymentRequest.md)| All data needed to make process the payment, with the reference to the previously payment. | [optional]

### Return type

[**CardPaymentResponse**](CardPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

