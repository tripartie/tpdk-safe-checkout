

# QuoteUpdate

Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shippingCarrier** | [**ShippingCarrierEnum**](#ShippingCarrierEnum) |  |  [optional] |
|**pickupCode** | **String** |  |  [optional] |
|**quantityToBeAcquired** | **Integer** |  |  |
|**attemptUnitPrice** | **Float** |  |  [optional] |



## Enum: ShippingCarrierEnum

| Name | Value |
|---- | -----|
| SWISS_POST | &quot;SwissPost&quot; |
| COLISSIMO | &quot;Colissimo&quot; |
| MONDIAL_RELAY | &quot;MondialRelay&quot; |
| NULL | &quot;null&quot; |



