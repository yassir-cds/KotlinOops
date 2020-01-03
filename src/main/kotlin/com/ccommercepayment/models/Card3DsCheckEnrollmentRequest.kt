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

import com.ccommercepayment.models.CardData
import com.ccommercepayment.models.CardPaymentContextData
import com.ccommercepayment.models.Options
import com.ccommercepayment.models.Order
import com.ccommercepayment.models.StoredCard
import com.ccommercepayment.models.ValidationModeOverride

import com.squareup.moshi.Json
/**
 * The Card3DS Payment Request
 * @param returnUrl Url for the return after the payment process
 * @param context 
 * @param options 
 * @param order 
 * @param card 
 * @param storedCard 
 * @param validationMode 
 * @param notificationUrl Url for the notification of the payment
 */

data class Card3DsCheckEnrollmentRequest (
    /* Url for the return after the payment process */
    @Json(name = "returnUrl")
    val returnUrl: kotlin.String,
    @Json(name = "context")
    val context: CardPaymentContextData,
    @Json(name = "order")
    val order: Order,
    @Json(name = "options")
    val options: Options? = null,
    @Json(name = "card")
    val card: CardData? = null,
    @Json(name = "storedCard")
    val storedCard: StoredCard? = null,
    @Json(name = "validationMode")
    val validationMode: ValidationModeOverride? = null,
    /* Url for the notification of the payment */
    @Json(name = "notificationUrl")
    val notificationUrl: kotlin.String? = null
) 



