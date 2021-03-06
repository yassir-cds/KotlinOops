/**
* Payment Gateway
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.0-oas3
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.ccommercepayment.apis

import com.ccommercepayment.models.Card3DsAuthorizeWithAuthDataRequest
import com.ccommercepayment.models.Card3DsCheckEnrollmentRequest
import com.ccommercepayment.models.Card3DsCheckEnrollmentResponse
import com.ccommercepayment.models.Card3DsValidateAuthenticationAndAuthorizeRequest
import com.ccommercepayment.models.Card3DsValidateAuthenticationRequest
import com.ccommercepayment.models.Card3DsValidateAuthenticationResponse
import com.ccommercepayment.models.CardPaymentResponse

import com.ccommercepayment.infrastructure.ApiClient
import com.ccommercepayment.infrastructure.ClientException
import com.ccommercepayment.infrastructure.ClientError
import com.ccommercepayment.infrastructure.ServerException
import com.ccommercepayment.infrastructure.ServerError
import com.ccommercepayment.infrastructure.MultiValueMap
import com.ccommercepayment.infrastructure.RequestConfig
import com.ccommercepayment.infrastructure.RequestMethod
import com.ccommercepayment.infrastructure.ResponseType
import com.ccommercepayment.infrastructure.Success
import com.ccommercepayment.infrastructure.toMultiValue

class Card3DsPaymentApi(basePath: kotlin.String = "http://localhost") : ApiClient(basePath) {

    /**
    * Validate authentication.
    * To process a payment authorization linked to this authentication, you should pass all authentication data.
    * @param authToken Gets or sets the authentication token. 
    * @param card3DsValidateAuthenticationRequest The validate authentication request. (optional)
    * @return Card3DsValidateAuthenticationResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun v1PaymentsCard3dsPaymentAuthenticationPost(authToken: kotlin.String, card3DsValidateAuthenticationRequest: Card3DsValidateAuthenticationRequest?) : Card3DsValidateAuthenticationResponse {
        val localVariableBody: kotlin.Any? = card3DsValidateAuthenticationRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("authToken" to authToken.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/v1/payments/card3ds-payment/authentication",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Card3DsValidateAuthenticationResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Card3DsValidateAuthenticationResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * Check enrollment
    * 
    * @param authToken Gets or sets the authentication token. 
    * @param card3DsCheckEnrollmentRequest All data needed to make a 3DS card payment (optional)
    * @return Card3DsCheckEnrollmentResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun v1PaymentsCard3dsPaymentPost(authToken: kotlin.String, card3DsCheckEnrollmentRequest: Card3DsCheckEnrollmentRequest?) : Card3DsCheckEnrollmentResponse {
        val localVariableBody: kotlin.Any? = card3DsCheckEnrollmentRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("authToken" to authToken.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/v1/payments/card3ds-payment",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<Card3DsCheckEnrollmentResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Card3DsCheckEnrollmentResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * Validate authentication AND authorize / payment
    * The payment3DSecure is done in three steps.    &lt;para&gt;  **Step 1**  Using the POST Method available, you can check the enrollment of the card that will be used.  Remember to take note of the merchantId, merchantSiteId and orderRef you are sending, as well as the paymentRequestId you receive. You will need them again in step 3.  Also please take note of the parameter values you receive in the response, as you will need them in step 2.  &lt;/para&gt;&lt;para&gt;  **Step 2**  Then, you need to create and send a form for the user to validate the 3DS part of the card validation. We have provided you an example for the form (see below).  Simply replace the placeholder values for the parameters you received.    &lt;pre&gt; &amp;lt;html lang&#x3D;\&quot;en\&quot;&amp;gt; &amp;lt;body&amp;gt; &amp;lt;form id &#x3D; \&quot;formulaire\&quot; method&#x3D;\&quot;post\&quot; action&#x3D;\&quot;https://fakeRoute.payment3DS.com\&quot;&amp;gt; &amp;lt;input type &#x3D; \&quot;hidden\&quot; id&#x3D;\&quot;param1\&quot; name&#x3D;\&quot;param1\&quot; value&#x3D;\&quot;value1\&quot;/&amp;gt; &amp;lt;input type &#x3D; \&quot;hidden\&quot; id&#x3D;\&quot;param2\&quot; name&#x3D;\&quot;param2\&quot; value&#x3D;\&quot;value2\&quot;/&amp;gt; &amp;lt;input type &#x3D; \&quot;hidden\&quot; id&#x3D;\&quot;param3\&quot; name&#x3D;\&quot;param3\&quot; value&#x3D;\&quot;value3\&quot;/&amp;gt; &amp;lt;input type &#x3D; \&quot;hidden\&quot; id&#x3D;\&quot;param4\&quot; name&#x3D;\&quot;param4\&quot; value&#x3D;\&quot;value4\&quot;/&amp;gt; &amp;lt;/form&amp;gt; &amp;lt;script&amp;gt; &amp;lt;document.forms[0].submit(); &amp;lt;/script&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt; &lt;/pre&gt;&lt;/para&gt;&lt;para&gt;  **Step 3**  Finally, you can proceed with this PUT method to finish the payment.  Replace the placeholder values of the merchantId, merchantSiteId and orderRef with the values you sent in the POST method, and the paymentRequestId with the value you received from said POST method.  &lt;/para&gt;
    * @param authToken Gets or sets the authentication token. 
    * @param card3DsValidateAuthenticationAndAuthorizeRequest The card payment put request. (optional)
    * @return CardPaymentResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun v1PaymentsCard3dsPaymentPut(authToken: kotlin.String, card3DsValidateAuthenticationAndAuthorizeRequest: Card3DsValidateAuthenticationAndAuthorizeRequest?) : CardPaymentResponse {
        val localVariableBody: kotlin.Any? = card3DsValidateAuthenticationAndAuthorizeRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("authToken" to authToken.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/v1/payments/card3ds-payment",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<CardPaymentResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CardPaymentResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

    /**
    * Authorization / payment -with- authentication data
    * To reuse the previously stored authenticationData in order to trigger a 3DS authorization, you must call the dedicated Authorize with authentication-data API, and pass all authentication data.    For this first version of the API, you must pass the same orderRef and orderTag as the authentication. In future versions, the authorization will be completely decorrelated of the authentication.
    * @param authToken Gets or sets the authentication token. 
    * @param card3DsAuthorizeWithAuthDataRequest The authorize with authentication data request. (optional)
    * @return CardPaymentResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun v1PaymentsCard3dsPaymentWithAuthenticationDataPost(authToken: kotlin.String, card3DsAuthorizeWithAuthDataRequest: Card3DsAuthorizeWithAuthDataRequest?) : CardPaymentResponse {
        val localVariableBody: kotlin.Any? = card3DsAuthorizeWithAuthDataRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("authToken" to authToken.toString())
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/v1/payments/card3ds-payment/with-authentication-data",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val localVarResponse = request<CardPaymentResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CardPaymentResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> throw ClientException((localVarResponse as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((localVarResponse as ServerError<*>).message ?: "Server error")
        }
    }

}
