

# TransactionOfferRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ulid** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**publicUrl** | **String** | The public URL for your Ad/Offer on your marketplace. |  [optional] |
|**redirectUrl** | **String** | Fill-in that field IF you intend to redirect your customer instead of using a WebView. |  [optional] |
|**seller** | [**TransactionPersonaRead**](TransactionPersonaRead.md) |  |  |
|**presetBuyer** | [**TransactionPersonaRead**](TransactionPersonaRead.md) |  |  [optional] |
|**nature** | [**NatureEnum**](#NatureEnum) | This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information. |  |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**unitPrice** | **Float** |  |  [optional] |
|**currencyCode** | **String** |  |  |
|**itemCount** | **Integer** |  |  [optional] |
|**condition** | [**ConditionEnum**](#ConditionEnum) |  |  [optional] |
|**weightInGram** | **Integer** | Accepted values between 500g (0.5kg) and 10,000g (10kg). |  |
|**shippingAllowed** | **Boolean** | That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined. |  |
|**handDeliveryAllowed** | **Boolean** | Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product. |  |
|**shippingCarriers** | [**List&lt;ShippingCarriersEnum&gt;**](#List&lt;ShippingCarriersEnum&gt;) | If you wish to enable automated shipping label generation through a specific provider, specify it there. |  [optional] |
|**eanCode** | **String** |  |  [optional] |
|**canBeSoldSeparately** | **Boolean** | Set this flag to false to forbid a potential buyer to acquire less than \&quot;itemCount\&quot; item(s) |  |
|**metadata** | [**List&lt;TransactionMetadataRead&gt;**](TransactionMetadataRead.md) |  |  [optional] |
|**medias** | **List&lt;String&gt;** |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ISSUED | &quot;issued&quot; |
| ACTIVE | &quot;active&quot; |
| FULFILLED | &quot;fulfilled&quot; |
| EXPIRED | &quot;expired&quot; |



## Enum: NatureEnum

| Name | Value |
|---- | -----|
| SERVICE | &quot;service&quot; |
| PHYSICAL_ITEM | &quot;physical_item&quot; |
| DEMATERIALIZED_ITEM | &quot;dematerialized_item&quot; |
| RENT_ITEM | &quot;rent_item&quot; |



## Enum: ConditionEnum

| Name | Value |
|---- | -----|
| NEW | &quot;NEW&quot; |
| USED | &quot;USED&quot; |
| DAMAGED | &quot;DAMAGED&quot; |
| DETERIORATED | &quot;DETERIORATED&quot; |
| UNRECOVERABLE | &quot;UNRECOVERABLE&quot; |



## Enum: List&lt;ShippingCarriersEnum&gt;

| Name | Value |
|---- | -----|
| SWISS_POST | &quot;SwissPost&quot; |
| COLISSIMO | &quot;Colissimo&quot; |
| MONDIAL_RELAY | &quot;MondialRelay&quot; |


