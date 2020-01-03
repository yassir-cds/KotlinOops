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

import com.ccommercepayment.models.PaymentOptionsContextData

import com.squareup.moshi.Json
/**
 * 
 * @param merchantId The merchant identifier
 * @param merchantSiteId The merchant site identifier.
 * @param context 
 */

data class PaymentOptionsRequest (
    /* The merchant identifier */
    @Json(name = "merchantId")
    val merchantId: kotlin.Int,
    /* The merchant site identifier. */
    @Json(name = "merchantSiteId")
    val merchantSiteId: kotlin.String,
    @Json(name = "context")
    val context: PaymentOptionsContextData
) 


