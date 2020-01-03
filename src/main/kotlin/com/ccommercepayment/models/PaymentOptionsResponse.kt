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
package com.ccommercepayment.models

import com.ccommercepayment.models.PaymentOption

import com.squareup.moshi.Json
/**
 * All payment option list data for the response
 * @param responseCode The response code of the service
 * @param paymentOptions All payment options data
 * @param responseMessage The global response message
 */

data class PaymentOptionsResponse (
    /* The response code of the service */
    @Json(name = "responseCode")
    val responseCode: PaymentOptionsResponse.ResponseCode? = null,
    /* All payment options data */
    @Json(name = "paymentOptions")
    val paymentOptions: kotlin.Array<PaymentOption>? = null,
    /* The global response message */
    @Json(name = "responseMessage")
    val responseMessage: kotlin.String? = null
) 


{
    /**
    * The response code of the service
    * Values: unknown,success,refused,internalFailure
    */
    
    enum class ResponseCode(val value: kotlin.String){
        @Json(name = "unknown") unknown("unknown"),
        @Json(name = "success") success("success"),
        @Json(name = "refused") refused("refused"),
        @Json(name = "internalFailure") internalFailure("internalFailure");
    }
}

