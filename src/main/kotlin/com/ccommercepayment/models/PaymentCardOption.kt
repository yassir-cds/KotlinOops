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
 * All payment card option data
 * @param paymentCardOptionRef The payment card option reference
 * @param name The payment card option name
 * @param minAmount The minimum amount allowed
 * @param maxAmount The maximum amount allowed
 * @param totalBillingCycles The total billing cycles
 * @param effectiveRate The effective rate
 * @param cardOptionGroupName The card option group name
 * @param cardOptionGroupId The card option group identifier
 * @param cardOptionGroupPosition The card option group position
 * @param postponementDelayUnit The postponement lenght type
 * @param postponementDelay The postponement lenght
 */

data class PaymentCardOption (
    /* The payment card option reference */
    @Json(name = "paymentCardOptionRef")
    val paymentCardOptionRef: kotlin.String? = null,
    /* The payment card option name */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* The minimum amount allowed */
    @Json(name = "minAmount")
    val minAmount: kotlin.Long? = null,
    /* The maximum amount allowed */
    @Json(name = "maxAmount")
    val maxAmount: kotlin.Long? = null,
    /* The total billing cycles */
    @Json(name = "totalBillingCycles")
    val totalBillingCycles: kotlin.Int? = null,
    /* The effective rate */
    @Json(name = "effectiveRate")
    val effectiveRate: kotlin.Int? = null,
    /* The card option group name */
    @Json(name = "cardOptionGroupName")
    val cardOptionGroupName: kotlin.String? = null,
    /* The card option group identifier */
    @Json(name = "cardOptionGroupId")
    val cardOptionGroupId: kotlin.Int? = null,
    /* The card option group position */
    @Json(name = "cardOptionGroupPosition")
    val cardOptionGroupPosition: kotlin.Int? = null,
    /* The postponement lenght type */
    @Json(name = "postponementDelayUnit")
    val postponementDelayUnit: PaymentCardOption.PostponementDelayUnit? = null,
    /* The postponement lenght */
    @Json(name = "postponementDelay")
    val postponementDelay: kotlin.Int? = null
) 


{
    /**
    * The postponement lenght type
    * Values: unknown,day,week,month,year
    */
    
    enum class PostponementDelayUnit(val value: kotlin.String){
        @Json(name = "unknown") unknown("unknown"),
        @Json(name = "day") day("day"),
        @Json(name = "week") week("week"),
        @Json(name = "month") month("month"),
        @Json(name = "year") year("year");
    }
}

