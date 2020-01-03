# CardApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1CardCreditHolderPost**](CardApi.md#v1CardCreditHolderPost) | **POST** /v1/card/creditHolder | Credit a card.


<a name="v1CardCreditHolderPost"></a>
# **v1CardCreditHolderPost**
> CardPaymentCreditHolderResponse v1CardCreditHolderPost(authToken, cardPaymentCreditHolderRequest)

Credit a card.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = CardApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val cardPaymentCreditHolderRequest : CardPaymentCreditHolderRequest =  // CardPaymentCreditHolderRequest | 
try {
    val result : CardPaymentCreditHolderResponse = apiInstance.v1CardCreditHolderPost(authToken, cardPaymentCreditHolderRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CardApi#v1CardCreditHolderPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CardApi#v1CardCreditHolderPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **cardPaymentCreditHolderRequest** | [**CardPaymentCreditHolderRequest**](CardPaymentCreditHolderRequest.md)|  | [optional]

### Return type

[**CardPaymentCreditHolderResponse**](CardPaymentCreditHolderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

