

# TransactionQuoteRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ulid** | **String** |  |  |
|**shippingCarrier** | [**ShippingCarrierEnum**](#ShippingCarrierEnum) |  |  |
|**quantityToBeAcquired** | **Integer** |  |  |
|**attemptUnitPrice** | **Float** |  |  [optional] |
|**transactionFees** | **Float** |  |  [optional] |
|**shippingFees** | **Float** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**expireAt** | **OffsetDateTime** |  |  |



## Enum: ShippingCarrierEnum

| Name | Value |
|---- | -----|
| SWISS_POST | &quot;SwissPost&quot; |
| COLISSIMO | &quot;Colissimo&quot; |
| MONDIAL_RELAY | &quot;MondialRelay&quot; |



