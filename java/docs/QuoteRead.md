

# QuoteRead

Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ulid** | **String** |  |  |
|**shippingCarrier** | [**ShippingCarrierEnum**](#ShippingCarrierEnum) |  |  [optional] |
|**pickupCode** | **String** |  |  [optional] |
|**quantityToBeAcquired** | **Integer** |  |  |
|**attemptUnitPrice** | **Float** |  |  [optional] |
|**currency** | **String** | Expect &#39;EUR&#39; only for now. |  [optional] |
|**originalUnitPrice** | **Float** |  |  [optional] |
|**transactionFees** | **Float** |  |  [optional] |
|**shippingFees** | **Float** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**expireAt** | **OffsetDateTime** |  |  |
|**iri** | **String** |  |  [optional] [readonly] |
|**unitPrice** | **BigDecimal** |  |  [optional] [readonly] |
|**price** | **BigDecimal** |  |  [optional] [readonly] |
|**buyerTotal** | **BigDecimal** | The buyer pays for:  - A) item  - B) shipping (optional)  - C) fees     (optional) This method sum them automatically. |  [optional] [readonly] |
|**sellerTotal** | **BigDecimal** | Represent what amount is to be expected released to the seller. |  [optional] [readonly] |



## Enum: ShippingCarrierEnum

| Name | Value |
|---- | -----|
| SWISS_POST | &quot;SwissPost&quot; |
| COLISSIMO | &quot;Colissimo&quot; |
| MONDIAL_RELAY | &quot;MondialRelay&quot; |
| NULL | &quot;null&quot; |



