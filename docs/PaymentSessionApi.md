# PaymentSessionApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PaymentSessionsByPaymentSessionIdPaymentResultGet**](PaymentSessionApi.md#v1PaymentSessionsByPaymentSessionIdPaymentResultGet) | **GET** /v1/payment-sessions/{paymentSessionId}/paymentResult | Gets the payment result from its session id.
[**v1PaymentSessionsPost**](PaymentSessionApi.md#v1PaymentSessionsPost) | **POST** /v1/payment-sessions | Creates a payment session.


<a name="v1PaymentSessionsByPaymentSessionIdPaymentResultGet"></a>
# **v1PaymentSessionsByPaymentSessionIdPaymentResultGet**
> GetPaymentSessionResult v1PaymentSessionsByPaymentSessionIdPaymentResultGet(paymentSessionId, authToken)

Gets the payment result from its session id.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentSessionApi()
val paymentSessionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | The payment session id.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : GetPaymentSessionResult = apiInstance.v1PaymentSessionsByPaymentSessionIdPaymentResultGet(paymentSessionId, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentSessionApi#v1PaymentSessionsByPaymentSessionIdPaymentResultGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentSessionApi#v1PaymentSessionsByPaymentSessionIdPaymentResultGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentSessionId** | [**java.util.UUID**](.md)| The payment session id. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

[**GetPaymentSessionResult**](GetPaymentSessionResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PaymentSessionsPost"></a>
# **v1PaymentSessionsPost**
> PaymentSessionResponse v1PaymentSessionsPost(authToken, paymentSessionRequest)

Creates a payment session.

Initializes a hosted form payment session with all the necessary data (order informations, customer informations, payment method...).  This API route can be used for classic hosted form. In that case, this operation is a alternative to the \&quot;client redirection POST\&quot; method (with HMAC).  It&#39;s also the standard way for initializing a payment session for \&quot;iframe integration\&quot;.            You will get an URL pointing to a paymentform, so the customer will be able to complete the payment form with his card details.  You will also get a PaymentSessionId. It will be useful for calling the GetPaymentResult API when the payment will complete.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentSessionApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val paymentSessionRequest : PaymentSessionRequest =  // PaymentSessionRequest | The payment session request.
try {
    val result : PaymentSessionResponse = apiInstance.v1PaymentSessionsPost(authToken, paymentSessionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentSessionApi#v1PaymentSessionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentSessionApi#v1PaymentSessionsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **paymentSessionRequest** | [**PaymentSessionRequest**](PaymentSessionRequest.md)| The payment session request. | [optional]

### Return type

[**PaymentSessionResponse**](PaymentSessionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

