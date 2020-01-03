
# GetPaymentSessionResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderRef** | **kotlin.String** | The orderRef |  [optional]
**paymentResultCode** | **kotlin.Int** | The response code of the service |  [optional]
**paymentResultCodeMessage** | [**inline**](#PaymentResultCodeMessageEnum) | The response code message of the service |  [optional]
**paymentResultComplementaryCode** | **kotlin.Int** | The complementary response code of the service |  [optional]
**paymentResultComplementaryCodeMessage** | [**inline**](#PaymentResultComplementaryCodeMessageEnum) | The complementary response code message of the service |  [optional]
**storedPaymentMethodId** | **kotlin.String** | Stored Payment Method Id |  [optional]
**storedPaymentMethodLabel** | **kotlin.String** | Stored Payment Label |  [optional]
**authenticationStatus** | [**inline**](#AuthenticationStatusEnum) | The authentication status |  [optional]
**liabilityShiftStatus** | [**inline**](#LiabilityShiftStatusEnum) | The liability shift status |  [optional]
**authenticationData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | All authentication data, as a dictionary of multiple key/value pairs. |  [optional]
**responseMessage** | **kotlin.String** | The global response message |  [optional]


<a name="PaymentResultCodeMessageEnum"></a>
## Enum: paymentResultCodeMessage
Name | Value
---- | -----
paymentResultCodeMessage | undefined, succeeded, refused, refusedByBank, failed, pending, unknown, cancelled, notProcessed


<a name="PaymentResultComplementaryCodeMessageEnum"></a>
## Enum: paymentResultComplementaryCodeMessage
Name | Value
---- | -----
paymentResultComplementaryCodeMessage | unknown, amountLimitExceeded, limitExceeded, technicalProblem, authorized, bankFraudSuspicion, cardExpired, cardIssuerUnavailable, cardholderNotAuthenticated, dateOfValidityExpired, duplicateRequest, formatError, fraudSuspicion, illegalTransaction, invalidAcceptor, invalidAccount, invalidCardIssuer, invalidTransaction, lostCard, referenceNumberCannotBeFound, referred, refused, requestedFunctionNotSupported, securityBreach, securityRulesViolated, serverUnavailableNetworkRoutingAskedAgain, stolenCard, systemUnavailable, temporaryBankServerUnavailability, temporaryOfficeServerUnavailability, transactionNotPermitted, transactionTimedOut, unknownAcquirerAccountCode, unknownCard, updateOfFileImpossible, transactionArchived, refusedByScoring, paymentInformationFillingAttemptLimitExceeded, refusedByScoring2, notAvailable


<a name="AuthenticationStatusEnum"></a>
## Enum: authenticationStatus
Name | Value
---- | -----
authenticationStatus | undefined, authenticated, notAuthenticated


<a name="LiabilityShiftStatusEnum"></a>
## Enum: liabilityShiftStatus
Name | Value
---- | -----
liabilityShiftStatus | undefined, shift, noShift



