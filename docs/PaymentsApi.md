# PaymentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet**](PaymentsApi.md#v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet) | **GET** /v1/payments/all/{orderRef}/merchants/{merchantId}/sites/{merchantSiteId} | Gets all payment schedules
[**v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet**](PaymentsApi.md#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet) | **GET** /v1/payments/{orderRef}/merchants/{merchantId}/sites/{merchantSiteId}/{orderTag} | Gets payment schedule by tag.
[**v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet**](PaymentsApi.md#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet) | **GET** /v1/payments/{orderRef}/merchants/{merchantId}/sites/{merchantSiteId} | Gets payment schedule
[**v1PaymentsByOrderRefOperationsCancelOrRefundPut**](PaymentsApi.md#v1PaymentsByOrderRefOperationsCancelOrRefundPut) | **PUT** /v1/payments/{orderRef}/operations/cancelOrRefund | Cancel or refund
[**v1PaymentsByOrderRefOperationsCapturePut**](PaymentsApi.md#v1PaymentsByOrderRefOperationsCapturePut) | **PUT** /v1/payments/{orderRef}/operations/capture | Capture
[**v1PaymentsByOrderRefOperationsRecomputePut**](PaymentsApi.md#v1PaymentsByOrderRefOperationsRecomputePut) | **PUT** /v1/payments/{orderRef}/operations/recompute | Recompute schedule


<a name="v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet"></a>
# **v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet**
> PaymentOperationsResponse v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet(orderRef, merchantId, merchantSiteId, authToken)

Gets all payment schedules

This operation allows the merchant to retrieve some details about a payment giving an order reference.  When calling this operation, Payment SAAS returns all the schedules associated with the order reference (whatever the order tag) (and so does the amount, the state, the date...), and useful informations for making other operations, such as the captured, remaining, cancelled and refunded amount.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The order reference.
val merchantId : kotlin.Int = 56 // kotlin.Int | The merchant identifier.
val merchantSiteId : kotlin.String = merchantSiteId_example // kotlin.String | The merchant site identifier.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet(orderRef, merchantId, merchantSiteId, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsAllByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The order reference. |
 **merchantId** | **kotlin.Int**| The merchant identifier. |
 **merchantSiteId** | **kotlin.String**| The merchant site identifier. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet"></a>
# **v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet**
> PaymentOperationsResponse v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet(orderRef, merchantId, merchantSiteId, orderTag, authToken)

Gets payment schedule by tag.

This operation allows the merchant to retrieve some details about a payment giving an order reference and an order tag.  When calling this operation, Payment SAAS returns the schedule associated with the order referenceand the specified the order tag (and so does the amount, the state, the date...), and useful informations for making other operations, such as the captured, remaining, cancelled and refunded amount.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The order reference.
val merchantId : kotlin.Int = 56 // kotlin.Int | The merchant identifier.
val merchantSiteId : kotlin.String = merchantSiteId_example // kotlin.String | The merchant site identifier.
val orderTag : kotlin.String = orderTag_example // kotlin.String | The order Tag
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet(orderRef, merchantId, merchantSiteId, orderTag, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdByOrderTagGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The order reference. |
 **merchantId** | **kotlin.Int**| The merchant identifier. |
 **merchantSiteId** | **kotlin.String**| The merchant site identifier. |
 **orderTag** | **kotlin.String**| The order Tag |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet"></a>
# **v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet**
> PaymentOperationsResponse v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet(orderRef, merchantId, merchantSiteId, authToken)

Gets payment schedule

This operation allows the merchant to retrieve some details about a payment giving an order reference.  When calling this operation, Payment SAAS returns the schedule associated with the order reference(and so does the amount, the state, the date...), and useful informations for making other operations, such as the captured, remaining, cancelled and refunded amount.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The order reference.
val merchantId : kotlin.Int = 56 // kotlin.Int | The merchant identifier.
val merchantSiteId : kotlin.String = merchantSiteId_example // kotlin.String | The merchant site identifier.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet(orderRef, merchantId, merchantSiteId, authToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsByOrderRefMerchantsByMerchantIdSitesByMerchantSiteIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The order reference. |
 **merchantId** | **kotlin.Int**| The merchant identifier. |
 **merchantSiteId** | **kotlin.String**| The merchant site identifier. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1PaymentsByOrderRefOperationsCancelOrRefundPut"></a>
# **v1PaymentsByOrderRefOperationsCancelOrRefundPut**
> PaymentOperationsResponse v1PaymentsByOrderRefOperationsCancelOrRefundPut(orderRef, authToken, paymentOperationsRequest)

Cancel or refund

&lt;div id&#x3D;\&quot;doc\&quot;&gt;  &lt;link href&#x3D;\&quot;/redoc/font-awesome-4.7.0/css/font-awesome.min.css\&quot; rel&#x3D;\&quot;stylesheet\&quot; /&gt;  &lt;link href&#x3D;\&quot;/redoc/style.css\&quot; rel&#x3D;\&quot;stylesheet\&quot; /&gt;  &lt;p&gt;This operation allows the merchant to cancel (also refered to as \&quot;void\&quot;) or refund a transaction, according to its current state.&lt;/p&gt;  &lt;p&gt;You can find below the exhaustive list of cases which may happen.&lt;/p&gt;  &lt;div class&#x3D;\&quot;quote info\&quot;&gt;  With a &lt;strong&gt;Cancel&lt;/strong&gt; operation, the customer will not see movement on his bank account, contrary to &lt;strong&gt;Refund&lt;/strong&gt; which gives back the &lt;span&gt;charged &lt;/span&gt;amount.&lt;br /&gt;&lt;br /&gt;  Cancel is &lt;span&gt;only &lt;/span&gt;performed when :  &lt;ul&gt;&lt;li&gt;the transaction is not yet captured (in which case, the fund reservation on the customer payment method is cleared)&lt;/li&gt;&lt;li&gt;the operation occurs the same day as the capture operation.&lt;/li&gt;&lt;/ul&gt;&lt;/div&gt;  &lt;div class&#x3D;\&quot;quote success\&quot;&gt;  If you want to cancel or refund less than the original transaction amount, you can specify the amount in the request body. Alternatively you can specify an amount of 0 if you want to refund the total amount.  &lt;p&gt;&lt;strong&gt;&lt;u&gt;Partial operation&lt;/u&gt;&lt;/strong&gt; :  &lt;em&gt;  0 &lt;strong&gt;&amp;lt;&lt;/strong&gt;&lt;span style&#x3D;\&quot;color: rgb(0, 0, 128);\&quot;&gt;amount &lt;/span&gt;&lt;strong&gt;&amp;lt;&lt;/strong&gt; transaction&#39;s amount&lt;br /&gt;&lt;/em&gt;&lt;u&gt;&lt;strong&gt;Full operation&lt;/strong&gt;&lt;/u&gt; :  &lt;em&gt;&lt;em&gt;&lt;span style&#x3D;\&quot;color: rgb(0, 0, 128);\&quot;&gt;  amount  &lt;strong&gt;&lt;span style&#x3D;\&quot;color: rgb(0, 0, 0);\&quot;&gt;&#x3D;&#x3D;&lt;/span&gt;&lt;/strong&gt;&lt;/span&gt; transaction&#39;s amount &lt;strong&gt;OR&lt;/strong&gt;&lt;span style&#x3D;\&quot;color: rgb(0, 0, 128);\&quot;&gt;amount&lt;/span&gt;&lt;strong&gt;&#x3D;&#x3D;&lt;/strong&gt; 0                      &lt;/em&gt;&lt;/em&gt;&lt;/p&gt;&lt;/div&gt;  &lt;h3&gt;Cancel Or Refund cases&lt;/h3&gt;  &lt;h4&gt;              After the authorization, and before the capture          &lt;/h4&gt;  &lt;p class&#x3D;\&quot;quote info\&quot;&gt;  &lt;em&gt;  &lt;em&gt;Because the refund operation cannot be executed on a non-captured transaction&lt;/em&gt;, only the cancel operation is supported              &lt;/em&gt;    &lt;/p&gt;  &lt;table class&#x3D;\&quot;relative-table wrapped\&quot; style&#x3D;\&quot;width: 91.7576%;\&quot;&gt;  &lt;colgroup&gt;  &lt;col style&#x3D;\&quot;width: 51.1326%;\&quot; /&gt;  &lt;col style&#x3D;\&quot;width: 48.7893%;\&quot; /&gt;      &lt;/colgroup&gt;  &lt;tbody&gt;  &lt;tr&gt;  &lt;th&gt;  &lt;strong&gt; Partial operation&lt;/strong&gt;          &lt;/th&gt;  &lt;th&gt;  &lt;em&gt;  &lt;strong&gt;Full operation&lt;/strong&gt;            &lt;/em&gt;          &lt;/th&gt;        &lt;/tr&gt;  &lt;tr&gt;  &lt;td&gt;  &lt;p&gt;No interaction with partners because partial cancel/void is not supported.&lt;/p&gt;  &lt;p&gt;The only impact is an update of the remaining amount to capture in payment hub.&lt;/p&gt;          &lt;/td&gt;  &lt;td&gt;  &lt;p&gt;  &lt;strong&gt;Cancel&lt;/strong&gt; operation will be executed on the entire transaction.                          &lt;/p&gt;  &lt;p&gt;The fund reservation on the customer payment method will be cleared, and capture will no longer be possible.&lt;/p&gt;  &lt;p class&#x3D;\&quot;quote warning\&quot;&gt;                              Cancelling a non captured transaction is not worldwide supported. Depending on the payment partner (PSP), the acquiring bank, and the issuing bank.                          &lt;/p&gt;          &lt;/td&gt;        &lt;/tr&gt;      &lt;/tbody&gt;    &lt;/table&gt;  &lt;h4&gt;After the capture&lt;/h4&gt;  &lt;p class&#x3D;\&quot;quote info\&quot;&gt;              Because the balance is made at midnight, either the cancel operation or the refund operation will be selected depending on the date.          &lt;/p&gt;  &lt;table class&#x3D;\&quot;wrapped\&quot;&gt;  &lt;colgroup&gt;  &lt;col /&gt;  &lt;col /&gt;  &lt;col /&gt;      &lt;/colgroup&gt;  &lt;tbody&gt;  &lt;tr&gt;  &lt;th&gt;  &lt;br /&gt;          &lt;/th&gt;  &lt;th&gt;  &lt;em&gt;  &lt;strong&gt;Partial operation&lt;/strong&gt;            &lt;/em&gt;          &lt;/th&gt;  &lt;th&gt;  &lt;em&gt;  &lt;em&gt;  &lt;strong&gt;Full operation&lt;/strong&gt;              &lt;/em&gt;            &lt;/em&gt;          &lt;/th&gt;        &lt;/tr&gt;  &lt;tr&gt;  &lt;td class&#x3D;\&quot;highlight-grey\&quot; data-highlight-colour&#x3D;\&quot;grey\&quot;&gt;  &lt;strong&gt;On the same day as the capture operation&lt;/strong&gt;          &lt;/td&gt;  &lt;td&gt;  &lt;div class&#x3D;\&quot;content-wrapper\&quot;&gt;  &lt;p&gt;The &lt;strong&gt;cancel&lt;/strong&gt; operation will be executed.&lt;/p&gt;  &lt;p class&#x3D;\&quot;quote warning\&quot;&gt;  &lt;span&gt;Partial cancelling of a captured transaction is supported, but doesn&#39;t behave the same depending on the payment partner used.&lt;/span&gt;              &lt;/p&gt;            &lt;/div&gt;          &lt;/td&gt;  &lt;td&gt;  &lt;p&gt;The &lt;strong&gt;cancel&lt;/strong&gt; operation will be executed.&lt;/p&gt;  &lt;p&gt;Full cancel of a captured transaction is fully supported.&lt;/p&gt;          &lt;/td&gt;        &lt;/tr&gt;  &lt;tr&gt;  &lt;td class&#x3D;\&quot;highlight-grey\&quot; data-highlight-colour&#x3D;\&quot;grey\&quot;&gt;  &lt;strong&gt;D+1 and later&lt;/strong&gt;          &lt;/td&gt;  &lt;td&gt;The &lt;strong&gt;refund&lt;/strong&gt; operation will be executed.&lt;br /&gt;&lt;br /&gt;Partial refund is fully supported.&lt;/td&gt;  &lt;td&gt;The &lt;strong&gt;refund&lt;/strong&gt; operation will be executed.&lt;br /&gt;&lt;br /&gt;Full refund is fully supported.&lt;/td&gt;        &lt;/tr&gt;      &lt;/tbody&gt;    &lt;/table&gt;  &lt;/div&gt;

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The OrderRef.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val paymentOperationsRequest : PaymentOperationsRequest =  // PaymentOperationsRequest | The payment operation request. Materialized by the Body of the PUT request
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsByOrderRefOperationsCancelOrRefundPut(orderRef, authToken, paymentOperationsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsCancelOrRefundPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsCancelOrRefundPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The OrderRef. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **paymentOperationsRequest** | [**PaymentOperationsRequest**](PaymentOperationsRequest.md)| The payment operation request. Materialized by the Body of the PUT request | [optional]

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentsByOrderRefOperationsCapturePut"></a>
# **v1PaymentsByOrderRefOperationsCapturePut**
> PaymentOperationsResponse v1PaymentsByOrderRefOperationsCapturePut(orderRef, authToken, paymentOperationsRequest)

Capture

This operation charges the bank account of the customer, following a valid authorization done before. You need to provide a succeeded authorized OrderRef, and the amount you want to charge.  This is well suited for a \&quot;charge at shipping\&quot; scenario: the merchant makes an authorization when the customer place the order, and the bank account is charged when the merchant actually does the shipping.    - If you want to capture the total amount of the authorization, you can either set the amount to 0 in the request, or simply not specify it.    ### Useful reminders:    * You can capture the authorization multiple times, as long as there is some amount remaining. For instance, with an authorization of 100€, you can capture 20€ and then capture 80€ later, within the limited time.    * Please note that the authorization is only valid for a limited amount of time, and that you cannot capture a greater amount than the authorized one.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The OrderRef.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val paymentOperationsRequest : PaymentOperationsRequest =  // PaymentOperationsRequest | The payment operation request. Materialized by the Body of the PUT request
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsByOrderRefOperationsCapturePut(orderRef, authToken, paymentOperationsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsCapturePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsCapturePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The OrderRef. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **paymentOperationsRequest** | [**PaymentOperationsRequest**](PaymentOperationsRequest.md)| The payment operation request. Materialized by the Body of the PUT request | [optional]

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

<a name="v1PaymentsByOrderRefOperationsRecomputePut"></a>
# **v1PaymentsByOrderRefOperationsRecomputePut**
> PaymentOperationsResponse v1PaymentsByOrderRefOperationsRecomputePut(orderRef, authToken, paymentOperationsRequest)

Recompute schedule

This operation forces the recomputation of the payment schedule, using the default payment schedule rules.

### Example
```kotlin
// Import classes:
//import com.ccommercepayment.infrastructure.*
//import com.ccommercepayment.models.*

val apiInstance = PaymentsApi()
val orderRef : kotlin.String = orderRef_example // kotlin.String | The OrderRef.
val authToken : kotlin.String = authToken_example // kotlin.String | Gets or sets the authentication token.
val paymentOperationsRequest : PaymentOperationsRequest =  // PaymentOperationsRequest | The payment operation request. Materialized by the Body of the PUT request
try {
    val result : PaymentOperationsResponse = apiInstance.v1PaymentsByOrderRefOperationsRecomputePut(orderRef, authToken, paymentOperationsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsRecomputePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#v1PaymentsByOrderRefOperationsRecomputePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRef** | **kotlin.String**| The OrderRef. |
 **authToken** | **kotlin.String**| Gets or sets the authentication token. |
 **paymentOperationsRequest** | [**PaymentOperationsRequest**](PaymentOperationsRequest.md)| The payment operation request. Materialized by the Body of the PUT request | [optional]

### Return type

[**PaymentOperationsResponse**](PaymentOperationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json

