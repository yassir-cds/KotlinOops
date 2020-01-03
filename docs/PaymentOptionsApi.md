# PaymentOptionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PaymentOptionsMerchantsByMerchantIdSitesByMerchantSiteIdGet**](PaymentOptionsApi.md#v1PaymentOptionsMerchantsByMerchantIdSitesByMerchantSiteIdGet) | **GET** /v1/payment-options/merchants/{merchantId}/sites/{merchantSiteId} | Gets payment options
[**v1PaymentOptionsPost**](PaymentOptionsApi.md#v1PaymentOptionsPost) | **POST** /v1/payment-options | Gets payment options for a context
[**v1PaymentOptionsValidateEligibilityPost**](PaymentOptionsApi.md#v1PaymentOptionsValidateEligibilityPost) | **POST** /v1/payment-options/validateEligibility | Validates eligibility


<a name="v1PaymentOptionsMerchantsByMerchantIdSitesByMerchantSiteIdGet"></a>
# **v1PaymentOptionsMerchantsByMerchantIdSitesByMerchantSiteIdGet**
> PaymentOptionsResponse v1PaymentOptionsMerchantsByMerchantIdSitesByMerchantSiteIdGet(merchantId, merchantSiteId, authToken)

Gets payment options

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentOptionsApi()
val merchantId : kotlin.Int = 56 // kotlin.Int | The merchant identifier.
val merchantSiteId : kotlin.String = merchantSiteId_example // kotlin.String | The merchant site identifier.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : PaymentOptionsResponse = apiInstance.v1PaymentOptionsMerchantsByMerchantIdSitesByMerchantSiteIdGet(merchantId, merchantSiteId, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentOptionsApi#v1PaymentOptionsMerchantsByMerchantIdSitesByMerchantSiteIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentOptionsApi#v1PaymentOptionsMerchantsByMerchantIdSitesByMerchantSiteIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.Int**| The merchant identifier. |
 **merchantSiteId** | **kotlin.String**| The merchant site identifier. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

[**PaymentOptionsResponse**](PaymentOptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PaymentOptionsPost"></a>
# **v1PaymentOptionsPost**
> PaymentOptionsResponse v1PaymentOptionsPost(authToken, paymentOptionsRequest)

Gets payment options for a context

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentOptionsApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val paymentOptionsRequest : PaymentOptionsRequest =  // PaymentOptionsRequest | The payment options request.
try {
    val result : PaymentOptionsResponse = apiInstance.v1PaymentOptionsPost(authToken, paymentOptionsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentOptionsApi#v1PaymentOptionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentOptionsApi#v1PaymentOptionsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **paymentOptionsRequest** | [**PaymentOptionsRequest**](PaymentOptionsRequest.md)| The payment options request. | [optional]

### Return type

[**PaymentOptionsResponse**](PaymentOptionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentOptionsValidateEligibilityPost"></a>
# **v1PaymentOptionsValidateEligibilityPost**
> v1PaymentOptionsValidateEligibilityPost(authToken, body)

Validates eligibility

WARNING : NOT IMPLEMENTED YET.     Validates the eligibility of the given payment option, according to context.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentOptionsApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val body : kotlin.Any = Object // kotlin.Any | The payment option eligibility request.
try {
    apiInstance.v1PaymentOptionsValidateEligibilityPost(authToken, body)
} catch (e: ClientException) {
    println("4xx response calling PaymentOptionsApi#v1PaymentOptionsValidateEligibilityPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentOptionsApi#v1PaymentOptionsValidateEligibilityPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **body** | **kotlin.Any**| The payment option eligibility request. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: Not defined

