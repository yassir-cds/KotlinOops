
# PaymentOperationsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderTag** | **kotlin.String** | The orderTag |  [optional]
**schedules** | [**kotlin.Array&lt;Schedule&gt;**](Schedule.md) | All schedules data |  [optional]
**orderRef** | **kotlin.String** | The orderRef |  [optional]
**responseCode** | [**inline**](#ResponseCodeEnum) | The response code of the service |  [optional]
**actionType** | **kotlin.String** | The action type |  [optional]
**responseMessage** | **kotlin.String** | The global response message |  [optional]


<a name="ResponseCodeEnum"></a>
## Enum: responseCode
Name | Value
---- | -----
responseCode | undetermined, success, refused, refusedByBank, internalFailure, pending, unavailable



