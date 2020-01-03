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
 * @param culture Gets or sets the culture.
 * @param formType Gets or sets the type of the form.
 * @param merchantBackUrl Gets or sets the merchant back URL.
 * @param merchantHomeUrl Gets or sets the merchant home URL.
 * @param merchantNotifyUrl Gets or sets the merchant notify URL.
 * @param merchantReturnUrl Gets or sets the merchant return URL.
 * @param paymentOptionRef Gets or sets the payment option reference.
 * @param reportDelayInDays Gets or sets the report delay in days.
 * @param userAgent Gets or sets the user agent.
 * @param template Gets or sets the url template.
 * @param authenticationOnly If set to *true*, no authorization will be done. The process ends after the holder authentication.
 */

data class Configuration (
    /* Gets or sets the culture. */
    @Json(name = "culture")
    val culture: kotlin.String? = null,
    /* Gets or sets the type of the form. */
    @Json(name = "formType")
    val formType: Configuration.FormType? = null,
    /* Gets or sets the merchant back URL. */
    @Json(name = "merchantBackUrl")
    val merchantBackUrl: kotlin.String? = null,
    /* Gets or sets the merchant home URL. */
    @Json(name = "merchantHomeUrl")
    val merchantHomeUrl: kotlin.String? = null,
    /* Gets or sets the merchant notify URL. */
    @Json(name = "merchantNotifyUrl")
    val merchantNotifyUrl: kotlin.String? = null,
    /* Gets or sets the merchant return URL. */
    @Json(name = "merchantReturnUrl")
    val merchantReturnUrl: kotlin.String? = null,
    /* Gets or sets the payment option reference. */
    @Json(name = "paymentOptionRef")
    val paymentOptionRef: kotlin.String? = null,
    /* Gets or sets the report delay in days. */
    @Json(name = "reportDelayInDays")
    val reportDelayInDays: kotlin.Int? = null,
    /* Gets or sets the user agent. */
    @Json(name = "userAgent")
    val userAgent: kotlin.String? = null,
    /* Gets or sets the url template. */
    @Json(name = "template")
    val template: kotlin.String? = null,
    /* If set to *true*, no authorization will be done. The process ends after the holder authentication. */
    @Json(name = "authenticationOnly")
    val authenticationOnly: kotlin.Boolean? = null
) 


{
    /**
    * Gets or sets the type of the form.
    * Values: default,iframe,preview
    */
    
    enum class FormType(val value: kotlin.String){
        @Json(name = "default") default("default"),
        @Json(name = "iframe") iframe("iframe"),
        @Json(name = "preview") preview("preview");
    }
}

