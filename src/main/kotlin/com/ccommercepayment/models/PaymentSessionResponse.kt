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


import com.squareup.moshi.Json
/**
 * 
 * @param operationSucceeded Gets or sets a value indicating whether this instance had success.
 * @param paymentSessionId Gets or sets the payment session identifier.
 * @param paymentSessionUrl Gets or sets the payment session URL.
 * @param responseMessage The global response message
 */

data class PaymentSessionResponse (
    /* Gets or sets a value indicating whether this instance had success. */
    @Json(name = "operationSucceeded")
    val operationSucceeded: kotlin.Boolean? = null,
    /* Gets or sets the payment session identifier. */
    @Json(name = "paymentSessionId")
    val paymentSessionId: kotlin.String? = null,
    /* Gets or sets the payment session URL. */
    @Json(name = "paymentSessionUrl")
    val paymentSessionUrl: kotlin.String? = null,
    /* The global response message */
    @Json(name = "responseMessage")
    val responseMessage: kotlin.String? = null
) 



