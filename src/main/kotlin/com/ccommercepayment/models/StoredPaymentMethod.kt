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
 * @param lastTransactionDate The last transaction date associated
 * @param paymentMethodExpirationDate The expiration date
 * @param holderBirthDate The holder birth date
 * @param methodSubtype The payment method subtype
 * @param methodType The payment method type
 * @param customerRef The customer ref
 * @param paymentMethodRef The payment method ref
 * @param storedPaymentMethodId The stored payment method identifier
 * @param truncatedPaymentMethodNumber The truncated payment method number
 * @param label The Label
 */

data class StoredPaymentMethod (
    /* The last transaction date associated */
    @Json(name = "lastTransactionDate")
    val lastTransactionDate: kotlin.String? = null,
    /* The expiration date */
    @Json(name = "paymentMethodExpirationDate")
    val paymentMethodExpirationDate: kotlin.String? = null,
    /* The holder birth date */
    @Json(name = "holderBirthDate")
    val holderBirthDate: kotlin.String? = null,
    /* The payment method subtype */
    @Json(name = "methodSubtype")
    val methodSubtype: kotlin.String? = null,
    /* The payment method type */
    @Json(name = "methodType")
    val methodType: kotlin.String? = null,
    /* The customer ref */
    @Json(name = "customerRef")
    val customerRef: kotlin.String? = null,
    /* The payment method ref */
    @Json(name = "paymentMethodRef")
    val paymentMethodRef: kotlin.String? = null,
    /* The stored payment method identifier */
    @Json(name = "storedPaymentMethodId")
    val storedPaymentMethodId: kotlin.String? = null,
    /* The truncated payment method number */
    @Json(name = "truncatedPaymentMethodNumber")
    val truncatedPaymentMethodNumber: kotlin.String? = null,
    /* The Label */
    @Json(name = "Label")
    val label: kotlin.String? = null
) 



