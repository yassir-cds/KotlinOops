
# CardPaymentResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantAccountRef** | **kotlin.String** | The merchant account reference of the payment |  [optional]
**responseCode** | [**inline**](#ResponseCodeEnum) | The response code of the service |  [optional]
**complementaryResponseCode** | [**inline**](#ComplementaryResponseCodeEnum) | The complementary code for more details |  [optional]
**schedules** | [**kotlin.Array&lt;ScheduleLight&gt;**](ScheduleLight.md) | All schedules data |  [optional]
**storedCard** | [**StoredCard**](StoredCard.md) |  |  [optional]
**responseMessage** | **kotlin.String** | The global response message |  [optional]


<a name="ResponseCodeEnum"></a>
## Enum: responseCode
Name | Value
---- | -----
responseCode | unknown, succeeded, badRequest, refusedByBank, failed, pending


<a name="ComplementaryResponseCodeEnum"></a>
## Enum: complementaryResponseCode
Name | Value
---- | -----
complementaryResponseCode | unknown, amountLimitExceeded, limitExceeded, technicalProblem, authorized, bankFraudSuspicion, cardExpired, cardIssuerUnavailable, cardholderNotAuthenticated, dateOfValidityExpired, duplicateRequest, formatError, fraudSuspicion, illegalTransaction, invalidAcceptor, invalidAccount, invalidCardIssuer, invalidTransaction, lostCard, referenceNumberCannotBeFound, referred, refused, requestedFunctionNotSupported, securityBreach, securityRulesViolated, serverUnavailableNetworkRoutingAskedAgain, stolenCard, systemUnavailable, temporaryBankServerUnavailability, temporaryOfficeServerUnavailability, transactionNotPermitted, transactionTimedOut, unknownAcquirerAccountCode, unknownCard, updateOfFileImpossible, transactionArchived, refusedByScoring, refusedByScoring2, notAvailable, deprecatedCardToken, exceededAuthorizedAmount, reportDelayLimitExceeded



