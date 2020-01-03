
# Card3DsValidateAuthenticationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authenticationStatus** | [**inline**](#AuthenticationStatusEnum) | The authentication status |  [optional]
**liabilityShiftStatus** | [**inline**](#LiabilityShiftStatusEnum) | The liability shift status |  [optional]
**authenticationData** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | All authentication data, as a dictionary of multiple key/value pairs. |  [optional]
**responseMessage** | **kotlin.String** | The global response message |  [optional]


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



