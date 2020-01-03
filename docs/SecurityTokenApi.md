# SecurityTokenApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AuthTokenGet**](SecurityTokenApi.md#v1AuthTokenGet) | **GET** /v1/auth/token | Authenticate


<a name="v1AuthTokenGet"></a>
# **v1AuthTokenGet**
> kotlin.String v1AuthTokenGet(authorization)

Authenticate

Get the token provided by the Security Token Service (STS).  The authentication token is mandatory for the others api calls.  It&#39;s expire after 48h by default.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = SecurityTokenApi()
val authorization : kotlin.String = authorization_example // kotlin.String | The credentials (login:password in base64)
try {
    val result : kotlin.String = apiInstance.v1AuthTokenGet(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityTokenApi#v1AuthTokenGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityTokenApi#v1AuthTokenGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**| The credentials (login:password in base64) | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

