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
 * All StoredCard data
 * @param id The stored card identifier
 * @param label The label for the stored card (display only)
 */

data class StoredCard (
    /* The stored card identifier */
    @Json(name = "id")
    val id: kotlin.String,
    /* The label for the stored card (display only) */
    @Json(name = "label")
    val label: kotlin.String? = null
) 


