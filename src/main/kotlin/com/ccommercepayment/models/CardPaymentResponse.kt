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

import com.ccommercepayment.models.ScheduleLight
import com.ccommercepayment.models.StoredCard

import com.squareup.moshi.Json
/**
 * The card payment response
 * @param merchantAccountRef The merchant account reference of the payment
 * @param responseCode The response code of the service
 * @param complementaryResponseCode The complementary code for more details
 * @param schedules All schedules data
 * @param storedCard 
 * @param responseMessage The global response message
 */

data class CardPaymentResponse (
    /* The merchant account reference of the payment */
    @Json(name = "merchantAccountRef")
    val merchantAccountRef: kotlin.String? = null,
    /* The response code of the service */
    @Json(name = "responseCode")
    val responseCode: CardPaymentResponse.ResponseCode? = null,
    /* The complementary code for more details */
    @Json(name = "complementaryResponseCode")
    val complementaryResponseCode: CardPaymentResponse.ComplementaryResponseCode? = null,
    /* All schedules data */
    @Json(name = "schedules")
    val schedules: kotlin.Array<ScheduleLight>? = null,
    @Json(name = "storedCard")
    val storedCard: StoredCard? = null,
    /* The global response message */
    @Json(name = "responseMessage")
    val responseMessage: kotlin.String? = null
) 


{
    /**
    * The response code of the service
    * Values: unknown,succeeded,badRequest,refusedByBank,failed,pending
    */
    
    enum class ResponseCode(val value: kotlin.String){
        @Json(name = "unknown") unknown("unknown"),
        @Json(name = "succeeded") succeeded("succeeded"),
        @Json(name = "badRequest") badRequest("badRequest"),
        @Json(name = "refusedByBank") refusedByBank("refusedByBank"),
        @Json(name = "failed") failed("failed"),
        @Json(name = "pending") pending("pending");
    }
    /**
    * The complementary code for more details
    * Values: unknown,amountLimitExceeded,limitExceeded,technicalProblem,authorized,bankFraudSuspicion,cardExpired,cardIssuerUnavailable,cardholderNotAuthenticated,dateOfValidityExpired,duplicateRequest,formatError,fraudSuspicion,illegalTransaction,invalidAcceptor,invalidAccount,invalidCardIssuer,invalidTransaction,lostCard,referenceNumberCannotBeFound,referred,refused,requestedFunctionNotSupported,securityBreach,securityRulesViolated,serverUnavailableNetworkRoutingAskedAgain,stolenCard,systemUnavailable,temporaryBankServerUnavailability,temporaryOfficeServerUnavailability,transactionNotPermitted,transactionTimedOut,unknownAcquirerAccountCode,unknownCard,updateOfFileImpossible,transactionArchived,refusedByScoring,refusedByScoring2,notAvailable,deprecatedCardToken,exceededAuthorizedAmount,reportDelayLimitExceeded
    */
    
    enum class ComplementaryResponseCode(val value: kotlin.String){
        @Json(name = "unknown") unknown("unknown"),
        @Json(name = "amountLimitExceeded") amountLimitExceeded("amountLimitExceeded"),
        @Json(name = "limitExceeded") limitExceeded("limitExceeded"),
        @Json(name = "technicalProblem") technicalProblem("technicalProblem"),
        @Json(name = "authorized") authorized("authorized"),
        @Json(name = "bankFraudSuspicion") bankFraudSuspicion("bankFraudSuspicion"),
        @Json(name = "cardExpired") cardExpired("cardExpired"),
        @Json(name = "cardIssuerUnavailable") cardIssuerUnavailable("cardIssuerUnavailable"),
        @Json(name = "cardholderNotAuthenticated") cardholderNotAuthenticated("cardholderNotAuthenticated"),
        @Json(name = "dateOfValidityExpired") dateOfValidityExpired("dateOfValidityExpired"),
        @Json(name = "duplicateRequest") duplicateRequest("duplicateRequest"),
        @Json(name = "formatError") formatError("formatError"),
        @Json(name = "fraudSuspicion") fraudSuspicion("fraudSuspicion"),
        @Json(name = "illegalTransaction") illegalTransaction("illegalTransaction"),
        @Json(name = "invalidAcceptor") invalidAcceptor("invalidAcceptor"),
        @Json(name = "invalidAccount") invalidAccount("invalidAccount"),
        @Json(name = "invalidCardIssuer") invalidCardIssuer("invalidCardIssuer"),
        @Json(name = "invalidTransaction") invalidTransaction("invalidTransaction"),
        @Json(name = "lostCard") lostCard("lostCard"),
        @Json(name = "referenceNumberCannotBeFound") referenceNumberCannotBeFound("referenceNumberCannotBeFound"),
        @Json(name = "referred") referred("referred"),
        @Json(name = "refused") refused("refused"),
        @Json(name = "requestedFunctionNotSupported") requestedFunctionNotSupported("requestedFunctionNotSupported"),
        @Json(name = "securityBreach") securityBreach("securityBreach"),
        @Json(name = "securityRulesViolated") securityRulesViolated("securityRulesViolated"),
        @Json(name = "serverUnavailableNetworkRoutingAskedAgain") serverUnavailableNetworkRoutingAskedAgain("serverUnavailableNetworkRoutingAskedAgain"),
        @Json(name = "stolenCard") stolenCard("stolenCard"),
        @Json(name = "systemUnavailable") systemUnavailable("systemUnavailable"),
        @Json(name = "temporaryBankServerUnavailability") temporaryBankServerUnavailability("temporaryBankServerUnavailability"),
        @Json(name = "temporaryOfficeServerUnavailability") temporaryOfficeServerUnavailability("temporaryOfficeServerUnavailability"),
        @Json(name = "transactionNotPermitted") transactionNotPermitted("transactionNotPermitted"),
        @Json(name = "transactionTimedOut") transactionTimedOut("transactionTimedOut"),
        @Json(name = "unknownAcquirerAccountCode") unknownAcquirerAccountCode("unknownAcquirerAccountCode"),
        @Json(name = "unknownCard") unknownCard("unknownCard"),
        @Json(name = "updateOfFileImpossible") updateOfFileImpossible("updateOfFileImpossible"),
        @Json(name = "transactionArchived") transactionArchived("transactionArchived"),
        @Json(name = "refusedByScoring") refusedByScoring("refusedByScoring"),
        @Json(name = "refusedByScoring2") refusedByScoring2("refusedByScoring2"),
        @Json(name = "notAvailable") notAvailable("notAvailable"),
        @Json(name = "deprecatedCardToken") deprecatedCardToken("deprecatedCardToken"),
        @Json(name = "exceededAuthorizedAmount") exceededAuthorizedAmount("exceededAuthorizedAmount"),
        @Json(name = "reportDelayLimitExceeded") reportDelayLimitExceeded("reportDelayLimitExceeded");
    }
}

