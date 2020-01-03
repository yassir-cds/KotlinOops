# CardPaymentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PaymentsCardPaymentPost**](CardPaymentApi.md#v1PaymentsCardPaymentPost) | **POST** /v1/payments/card-payment | Authorization / payment


<a name="v1PaymentsCardPaymentPost"></a>
# **v1PaymentsCardPaymentPost**
> CardPaymentResponse v1PaymentsCardPaymentPost(authToken, cardPaymentRequest)

Authorization / payment

Achieve a payment with a card without 3DSecure.  To achieve a 3DS payment (CheckEnrollment), see the /payment/card3ds-payment resource.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = CardPaymentApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val cardPaymentRequest : CardPaymentRequest =  // CardPaymentRequest | All data needed to make card payment
try {
    val result : CardPaymentResponse = apiInstance.v1PaymentsCardPaymentPost(authToken, cardPaymentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CardPaymentApi#v1PaymentsCardPaymentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CardPaymentApi#v1PaymentsCardPaymentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **cardPaymentRequest** | [**CardPaymentRequest**](CardPaymentRequest.md)| All data needed to make card payment | [optional]

### Return type

[**CardPaymentResponse**](CardPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

