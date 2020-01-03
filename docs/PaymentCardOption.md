
# PaymentCardOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentCardOptionRef** | **kotlin.String** | The payment card option reference |  [optional]
**name** | **kotlin.String** | The payment card option name |  [optional]
**minAmount** | **kotlin.Long** | The minimum amount allowed |  [optional]
**maxAmount** | **kotlin.Long** | The maximum amount allowed |  [optional]
**totalBillingCycles** | **kotlin.Int** | The total billing cycles |  [optional]
**effectiveRate** | **kotlin.Int** | The effective rate |  [optional]
**cardOptionGroupName** | **kotlin.String** | The card option group name |  [optional]
**cardOptionGroupId** | **kotlin.Int** | The card option group identifier |  [optional]
**cardOptionGroupPosition** | **kotlin.Int** | The card option group position |  [optional]
**postponementDelayUnit** | [**inline**](#PostponementDelayUnitEnum) | The postponement lenght type |  [optional]
**postponementDelay** | **kotlin.Int** | The postponement lenght |  [optional]


<a name="PostponementDelayUnitEnum"></a>
## Enum: postponementDelayUnit
Name | Value
---- | -----
postponementDelayUnit | unknown, day, week, month, year



