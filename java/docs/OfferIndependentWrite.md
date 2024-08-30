

# OfferIndependentWrite



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**publicUrl** | **URI** | The public URL for your Ad/Offer on your marketplace. |  [optional] |
|**redirectUrl** | **URI** | Fill-in that field IF you intend to redirect your customer instead of using a WebView. |  [optional] |
|**seller** | [**OfferPersonaIndependentWrite**](OfferPersonaIndependentWrite.md) |  |  |
|**presetBuyer** | [**OfferPersonaIndependentWrite**](OfferPersonaIndependentWrite.md) |  |  [optional] |
|**nature** | [**NatureEnum**](#NatureEnum) | This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information. |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**unitPrice** | **Float** |  |  [optional] |
|**minNegotiableUnitPrice** | **Float** |  |  [optional] |
|**allowToNegotiateUnitPrice** | **Boolean** |  |  |
|**currencyCode** | **String** |  |  [optional] |
|**itemCount** | **Integer** |  |  [optional] |
|**condition** | [**ConditionEnum**](#ConditionEnum) |  |  [optional] |
|**weightInGram** | **Integer** | Accepted values between 500g (0.5kg) and 10,000g (10kg). |  [optional] |
|**shippingAllowed** | **Boolean** | That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined. |  [optional] |
|**handDeliveryAllowed** | **Boolean** | Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product. |  [optional] |
|**shippingCarriers** | [**Set&lt;ShippingCarriersEnum&gt;**](#Set&lt;ShippingCarriersEnum&gt;) | If you wish to enable automated shipping label generation through a specific provider, specify it there. |  [optional] |
|**eanCode** | **String** |  |  [optional] |
|**canBeSoldSeparately** | **Boolean** | Set this flag to false to forbid a potential buyer to acquire less than \&quot;itemCount\&quot; item(s) |  [optional] |
|**metadata** | [**List&lt;OfferMetadataIndependentWrite&gt;**](OfferMetadataIndependentWrite.md) |  |  [optional] |



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



## Enum: Set&lt;ShippingCarriersEnum&gt;

| Name | Value |
|---- | -----|
| SWISS_POST | &quot;SwissPost&quot; |
| COLISSIMO | &quot;Colissimo&quot; |
| MONDIAL_RELAY | &quot;MondialRelay&quot; |



