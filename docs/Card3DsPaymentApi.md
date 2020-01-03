# Card3DsPaymentApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PaymentsCard3dsPaymentAuthenticationPost**](Card3DsPaymentApi.md#v1PaymentsCard3dsPaymentAuthenticationPost) | **POST** /v1/payments/card3ds-payment/authentication | Validate authentication.
[**v1PaymentsCard3dsPaymentPost**](Card3DsPaymentApi.md#v1PaymentsCard3dsPaymentPost) | **POST** /v1/payments/card3ds-payment | Check enrollment
[**v1PaymentsCard3dsPaymentPut**](Card3DsPaymentApi.md#v1PaymentsCard3dsPaymentPut) | **PUT** /v1/payments/card3ds-payment | Validate authentication AND authorize / payment
[**v1PaymentsCard3dsPaymentWithAuthenticationDataPost**](Card3DsPaymentApi.md#v1PaymentsCard3dsPaymentWithAuthenticationDataPost) | **POST** /v1/payments/card3ds-payment/with-authentication-data | Authorization / payment -with- authentication data


<a name="v1PaymentsCard3dsPaymentAuthenticationPost"></a>
# **v1PaymentsCard3dsPaymentAuthenticationPost**
> Card3DsValidateAuthenticationResponse v1PaymentsCard3dsPaymentAuthenticationPost(authToken, card3DsValidateAuthenticationRequest)

Validate authentication.

To process a payment authorization linked to this authentication, you should pass all authentication data.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = Card3DsPaymentApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val card3DsValidateAuthenticationRequest : Card3DsValidateAuthenticationRequest =  // Card3DsValidateAuthenticationRequest | The validate authentication request.
try {
    val result : Card3DsValidateAuthenticationResponse = apiInstance.v1PaymentsCard3dsPaymentAuthenticationPost(authToken, card3DsValidateAuthenticationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentAuthenticationPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentAuthenticationPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **card3DsValidateAuthenticationRequest** | [**Card3DsValidateAuthenticationRequest**](Card3DsValidateAuthenticationRequest.md)| The validate authentication request. | [optional]

### Return type

[**Card3DsValidateAuthenticationResponse**](Card3DsValidateAuthenticationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentsCard3dsPaymentPost"></a>
# **v1PaymentsCard3dsPaymentPost**
> Card3DsCheckEnrollmentResponse v1PaymentsCard3dsPaymentPost(authToken, card3DsCheckEnrollmentRequest)

Check enrollment

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = Card3DsPaymentApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val card3DsCheckEnrollmentRequest : Card3DsCheckEnrollmentRequest =  // Card3DsCheckEnrollmentRequest | All data needed to make a 3DS card payment
try {
    val result : Card3DsCheckEnrollmentResponse = apiInstance.v1PaymentsCard3dsPaymentPost(authToken, card3DsCheckEnrollmentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **card3DsCheckEnrollmentRequest** | [**Card3DsCheckEnrollmentRequest**](Card3DsCheckEnrollmentRequest.md)| All data needed to make a 3DS card payment | [optional]

### Return type

[**Card3DsCheckEnrollmentResponse**](Card3DsCheckEnrollmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentsCard3dsPaymentPut"></a>
# **v1PaymentsCard3dsPaymentPut**
> CardPaymentResponse v1PaymentsCard3dsPaymentPut(authToken, card3DsValidateAuthenticationAndAuthorizeRequest)

Validate authentication AND authorize / payment

The payment3DSecure is done in three steps.    &lt;para&gt;  **Step 1**  Using the POST Method available, you can check the enrollment of the card that will be used.  Remember to take note of the merchantId, merchantSiteId and orderRef you are sending, as well as the paymentRequestId you receive. You will need them again in step 3.  Also please take note of the parameter values you receive in the response, as you will need them in step 2.  &lt;/para&gt;&lt;para&gt;  **Step 2**  Then, you need to create and send a form for the user to validate the 3DS part of the card validation. We have provided you an example for the form (see below).  Simply replace the placeholder values for the parameters you received.    &lt;pre&gt; &amp;lt;html lang&#x3D;\&quot;en\&quot;&amp;gt; &amp;lt;body&amp;gt; &amp;lt;form id &#x3D; \&quot;formulaire\&quot; method&#x3D;\&quot;post\&quot; action&#x3D;\&quot;https://fakeRoute.payment3DS.com\&quot;&amp;gt; &amp;lt;input type &#x3D; \&quot;hidden\&quot; id&#x3D;\&quot;param1\&quot; name&#x3D;\&quot;param1\&quot; value&#x3D;\&quot;value1\&quot;/&amp;gt; &amp;lt;input type &#x3D; \&quot;hidden\&quot; id&#x3D;\&quot;param2\&quot; name&#x3D;\&quot;param2\&quot; value&#x3D;\&quot;value2\&quot;/&amp;gt; &amp;lt;input type &#x3D; \&quot;hidden\&quot; id&#x3D;\&quot;param3\&quot; name&#x3D;\&quot;param3\&quot; value&#x3D;\&quot;value3\&quot;/&amp;gt; &amp;lt;input type &#x3D; \&quot;hidden\&quot; id&#x3D;\&quot;param4\&quot; name&#x3D;\&quot;param4\&quot; value&#x3D;\&quot;value4\&quot;/&amp;gt; &amp;lt;/form&amp;gt; &amp;lt;script&amp;gt; &amp;lt;document.forms[0].submit(); &amp;lt;/script&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt; &lt;/pre&gt;&lt;/para&gt;&lt;para&gt;  **Step 3**  Finally, you can proceed with this PUT method to finish the payment.  Replace the placeholder values of the merchantId, merchantSiteId and orderRef with the values you sent in the POST method, and the paymentRequestId with the value you received from said POST method.  &lt;/para&gt;

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = Card3DsPaymentApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val card3DsValidateAuthenticationAndAuthorizeRequest : Card3DsValidateAuthenticationAndAuthorizeRequest =  // Card3DsValidateAuthenticationAndAuthorizeRequest | The card payment put request.
try {
    val result : CardPaymentResponse = apiInstance.v1PaymentsCard3dsPaymentPut(authToken, card3DsValidateAuthenticationAndAuthorizeRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **card3DsValidateAuthenticationAndAuthorizeRequest** | [**Card3DsValidateAuthenticationAndAuthorizeRequest**](Card3DsValidateAuthenticationAndAuthorizeRequest.md)| The card payment put request. | [optional]

### Return type

[**CardPaymentResponse**](CardPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentsCard3dsPaymentWithAuthenticationDataPost"></a>
# **v1PaymentsCard3dsPaymentWithAuthenticationDataPost**
> CardPaymentResponse v1PaymentsCard3dsPaymentWithAuthenticationDataPost(authToken, card3DsAuthorizeWithAuthDataRequest)

Authorization / payment -with- authentication data

To reuse the previously stored authenticationData in order to trigger a 3DS authorization, you must call the dedicated Authorize with authentication-data API, and pass all authentication data.    For this first version of the API, you must pass the same orderRef and orderTag as the authentication. In future versions, the authorization will be completely decorrelated of the authentication.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = Card3DsPaymentApi()
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val card3DsAuthorizeWithAuthDataRequest : Card3DsAuthorizeWithAuthDataRequest =  // Card3DsAuthorizeWithAuthDataRequest | The authorize with authentication data request.
try {
    val result : CardPaymentResponse = apiInstance.v1PaymentsCard3dsPaymentWithAuthenticationDataPost(authToken, card3DsAuthorizeWithAuthDataRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentWithAuthenticationDataPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Card3DsPaymentApi#v1PaymentsCard3dsPaymentWithAuthenticationDataPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **card3DsAuthorizeWithAuthDataRequest** | [**Card3DsAuthorizeWithAuthDataRequest**](Card3DsAuthorizeWithAuthDataRequest.md)| The authorize with authentication data request. | [optional]

### Return type

[**CardPaymentResponse**](CardPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

