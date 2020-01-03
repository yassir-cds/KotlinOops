# StoredPaymentMethodsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdCustomerRefByCustomerRefGet**](StoredPaymentMethodsApi.md#v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdCustomerRefByCustomerRefGet) | **GET** /v1/stored-payment-methods/merchants/{merchantId}/sites/{merchantSiteId}/customerRef/{customerRef} | Gets stored payment methods by CustomerRef
[**v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdDelete**](StoredPaymentMethodsApi.md#v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdDelete) | **DELETE** /v1/stored-payment-methods/merchants/{merchantId}/sites/{merchantSiteId}/storedPaymentMethodId/{storedPaymentMethodId} | Deletes a stored payment method
[**v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdGet**](StoredPaymentMethodsApi.md#v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdGet) | **GET** /v1/stored-payment-methods/merchants/{merchantId}/sites/{merchantSiteId}/storedPaymentMethodId/{storedPaymentMethodId} | Gets a stored payment method
[**v1StoredPaymentMethodsPost**](StoredPaymentMethodsApi.md#v1StoredPaymentMethodsPost) | **POST** /v1/stored-payment-methods | Stores a new payment method.


<a name="v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdCustomerRefByCustomerRefGet"></a>
# **v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdCustomerRefByCustomerRefGet**
> StoredPaymentMethodResponse v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdCustomerRefByCustomerRefGet(merchantId, merchantSiteId, customerRef, authToken)

Gets stored payment methods by CustomerRef

Gets the stored payment methods by customer reference.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = StoredPaymentMethodsApi()
val merchantId : kotlin.Int = 56 // kotlin.Int | The merchant identifier.
val merchantSiteId : kotlin.String = merchantSiteId_example // kotlin.String | The merchant site identifier.
val customerRef : kotlin.String = customerRef_example // kotlin.String | The customer reference.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : StoredPaymentMethodResponse = apiInstance.v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdCustomerRefByCustomerRefGet(merchantId, merchantSiteId, customerRef, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoredPaymentMethodsApi#v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdCustomerRefByCustomerRefGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoredPaymentMethodsApi#v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdCustomerRefByCustomerRefGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.Int**| The merchant identifier. |
 **merchantSiteId** | **kotlin.String**| The merchant site identifier. |
 **customerRef** | **kotlin.String**| The customer reference. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

[**StoredPaymentMethodResponse**](StoredPaymentMethodResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdDelete"></a>
# **v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdDelete**
> kotlin.String v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdDelete(merchantId, merchantSiteId, storedPaymentMethodId, authToken)

Deletes a stored payment method

Deletes the specified stored payment method.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = StoredPaymentMethodsApi()
val merchantId : kotlin.Int = 56 // kotlin.Int | The merchant identifier
val merchantSiteId : kotlin.String = merchantSiteId_example // kotlin.String | The merchant site identifier
val storedPaymentMethodId : kotlin.String = storedPaymentMethodId_example // kotlin.String | The stored payment method identifier
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : kotlin.String = apiInstance.v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdDelete(merchantId, merchantSiteId, storedPaymentMethodId, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoredPaymentMethodsApi#v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoredPaymentMethodsApi#v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.Int**| The merchant identifier |
 **merchantSiteId** | **kotlin.String**| The merchant site identifier |
 **storedPaymentMethodId** | **kotlin.String**| The stored payment method identifier |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdGet"></a>
# **v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdGet**
> StoredPaymentMethodResponse v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdGet(merchantId, merchantSiteId, storedPaymentMethodId, authToken)

Gets a stored payment method

Gets the stored payment method by its unique identifier.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = StoredPaymentMethodsApi()
val merchantId : kotlin.Int = 56 // kotlin.Int | 
val merchantSiteId : kotlin.String = merchantSiteId_example // kotlin.String | 
val storedPaymentMethodId : kotlin.String = storedPaymentMethodId_example // kotlin.String | The stored payment method identifier.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : StoredPaymentMethodResponse = apiInstance.v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdGet(merchantId, merchantSiteId, storedPaymentMethodId, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoredPaymentMethodsApi#v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoredPaymentMethodsApi#v1StoredPaymentMethodsMerchantsByMerchantIdSitesByMerchantSiteIdStoredPaymentMethodIdByStoredPaymentMethodIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **kotlin.Int**|  |
 **merchantSiteId** | **kotlin.String**|  |
 **storedPaymentMethodId** | **kotlin.String**| The stored payment method identifier. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

[**StoredPaymentMethodResponse**](StoredPaymentMethodResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1StoredPaymentMethodsPost"></a>
# **v1StoredPaymentMethodsPost**
> kotlin.String v1StoredPaymentMethodsPost(authToken, storedPaymentMethodRequest)

Stores a new payment method.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = StoredPaymentMethodsApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val storedPaymentMethodRequest : StoredPaymentMethodRequest =  // StoredPaymentMethodRequest | The payment method to store.
try {
    val result : kotlin.String = apiInstance.v1StoredPaymentMethodsPost(authToken, storedPaymentMethodRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoredPaymentMethodsApi#v1StoredPaymentMethodsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoredPaymentMethodsApi#v1StoredPaymentMethodsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **storedPaymentMethodRequest** | [**StoredPaymentMethodRequest**](StoredPaymentMethodRequest.md)| The payment method to store. | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

