

# QuoteWrite

Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**captcha** | **String** |  |  |
|**offer** | **String** |  |  [optional] |
|**shippingCarrier** | [**ShippingCarrierEnum**](#ShippingCarrierEnum) |  |  [optional] |
|**pickupCode** | **String** |  |  [optional] |
|**quantityToBeAcquired** | **Integer** |  |  [optional] |
|**attemptUnitPrice** | **Float** |  |  [optional] |
|**thirdPartyRecipientFirstName** | **String** |  |  [optional] |
|**thirdPartyRecipientLastName** | **String** |  |  [optional] |
|**thirdPartyRecipientAddress** | [**QuoteAddressWrite**](QuoteAddressWrite.md) |  |  [optional] |



## Enum: ShippingCarrierEnum

| Name | Value |
|---- | -----|
| SWISS_POST | &quot;SwissPost&quot; |
| COLISSIMO | &quot;Colissimo&quot; |
| MONDIAL_RELAY | &quot;MondialRelay&quot; |



