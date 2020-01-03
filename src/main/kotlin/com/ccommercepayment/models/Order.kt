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
 * All order data
 * @param orderRef The order reference linked to the schedule and transaction
 * @param invoiceId The invoice identifier
 * @param orderTag The order tag is a label for the schedule
 * @param orderDate Date of the order
 * @param amount The amount of the payment
 */

data class Order (
    /* The order reference linked to the schedule and transaction */
    @Json(name = "orderRef")
    val orderRef: kotlin.String,
    /* Date of the order */
    @Json(name = "orderDate")
    val orderDate: kotlin.String,
    /* The amount of the payment */
    @Json(name = "amount")
    val amount: kotlin.Long,
    /* The invoice identifier */
    @Json(name = "invoiceId")
    val invoiceId: kotlin.Long? = null,
    /* The order tag is a label for the schedule */
    @Json(name = "orderTag")
    val orderTag: kotlin.String? = null
) 



