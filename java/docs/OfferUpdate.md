

# OfferUpdate



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**publicUrl** | **URI** | The public URL for your Ad/Offer on your marketplace. |  [optional] |
|**redirectUrl** | **URI** | Fill-in that field IF you intend to redirect your customer instead of using a WebView. |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**unitPrice** | **Float** |  |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**shippingAllowed** | **Boolean** | That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined. |  [optional] |
|**handDeliveryAllowed** | **Boolean** | Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product. |  [optional] |
|**shippingCarriers** | [**Set&lt;ShippingCarriersEnum&gt;**](#Set&lt;ShippingCarriersEnum&gt;) | If you wish to enable automated shipping label generation through a specific provider, specify it there. |  [optional] |
|**eanCode** | **String** |  |  [optional] |
|**canBeSoldSeparately** | **Boolean** | Set this flag to false to forbid a potential buyer to acquire less than \&quot;itemCount\&quot; item(s) |  [optional] |
|**metadata** | [**List&lt;OfferMetadataUpdate&gt;**](OfferMetadataUpdate.md) |  |  [optional] |



## Enum: Set&lt;ShippingCarriersEnum&gt;

| Name | Value |
|---- | -----|
| SWISS_POST | &quot;SwissPost&quot; |
| COLISSIMO | &quot;Colissimo&quot; |
| MONDIAL_RELAY | &quot;MondialRelay&quot; |



