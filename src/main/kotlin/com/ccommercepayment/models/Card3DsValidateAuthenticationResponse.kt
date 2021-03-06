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
 * The card payment response
 * @param authenticationStatus The authentication status
 * @param liabilityShiftStatus The liability shift status
 * @param authenticationData All authentication data, as a dictionary of multiple key/value pairs.
 * @param responseMessage The global response message
 */

data class Card3DsValidateAuthenticationResponse (
    /* The authentication status */
    @Json(name = "authenticationStatus")
    val authenticationStatus: Card3DsValidateAuthenticationResponse.AuthenticationStatus? = null,
    /* The liability shift status */
    @Json(name = "liabilityShiftStatus")
    val liabilityShiftStatus: Card3DsValidateAuthenticationResponse.LiabilityShiftStatus? = null,
    /* All authentication data, as a dictionary of multiple key/value pairs. */
    @Json(name = "authenticationData")
    val authenticationData: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    /* The global response message */
    @Json(name = "responseMessage")
    val responseMessage: kotlin.String? = null
) 


{
    /**
    * The authentication status
    * Values: undefined,authenticated,notAuthenticated
    */
    
    enum class AuthenticationStatus(val value: kotlin.String){
        @Json(name = "undefined") undefined("undefined"),
        @Json(name = "authenticated") authenticated("authenticated"),
        @Json(name = "notAuthenticated") notAuthenticated("notAuthenticated");
    }
    /**
    * The liability shift status
    * Values: undefined,shift,noShift
    */
    
    enum class LiabilityShiftStatus(val value: kotlin.String){
        @Json(name = "undefined") undefined("undefined"),
        @Json(name = "shift") shift("shift"),
        @Json(name = "noShift") noShift("noShift");
    }
}

