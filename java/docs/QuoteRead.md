

# QuoteRead

Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ulid** | **String** |  |  [optional] |
|**shippingCarrier** | [**ShippingCarrierEnum**](#ShippingCarrierEnum) |  |  [optional] |
|**pickupCode** | **String** |  |  [optional] |
|**quantityToBeAcquired** | **Integer** |  |  [optional] |
|**attemptUnitPrice** | **Float** |  |  [optional] |
|**currency** | **String** | Expect &#39;EUR&#39; only for now. |  [optional] |
|**originalUnitPrice** | **Float** |  |  [optional] |
|**originalUnitPriceUnconverted** | **Float** |  |  [optional] |
|**transactionFees** | **Float** |  |  [optional] |
|**shippingFees** | **Float** |  |  [optional] |
|**thirdPartyRecipientFirstName** | **String** |  |  [optional] |
|**thirdPartyRecipientLastName** | **String** |  |  [optional] |
|**thirdPartyRecipientAddress** | [**QuoteAddressRead**](QuoteAddressRead.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**expireAt** | **OffsetDateTime** |  |  [optional] |
|**iri** | **String** |  |  [optional] [readonly] |
|**unitPrice** | **BigDecimal** |  |  [optional] [readonly] |
|**price** | **BigDecimal** |  |  [optional] [readonly] |
|**buyerTotal** | **BigDecimal** | The buyer pays for:  - A) item  - B) shipping (optional)  - C) fees     (optional) This method sum them automatically. |  [optional] [readonly] |
|**sellerTotal** | **BigDecimal** | Represent what amount is to be expected released to the seller. |  [optional] [readonly] |
|**exchangeRate** | **BigDecimal** | Exchange rate, if applicable. Between the offer currency and actual charged currency. |  [optional] [readonly] |



## Enum: ShippingCarrierEnum

| Name | Value |
|---- | -----|
| SWISS_POST | &quot;SwissPost&quot; |
| COLISSIMO | &quot;Colissimo&quot; |
| MONDIAL_RELAY | &quot;MondialRelay&quot; |



