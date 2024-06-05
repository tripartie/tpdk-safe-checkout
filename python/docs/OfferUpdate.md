# OfferUpdate



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**public_url** | **str** | The public URL for your Ad/Offer on your marketplace. | [optional] 
**redirect_url** | **str** | Fill-in that field IF you intend to redirect your customer instead of using a WebView. | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**unit_price** | **float** |  | [optional] 
**currency_code** | **str** |  | [optional] [default to 'EUR']
**shipping_allowed** | **bool** | That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined. | [optional] 
**hand_delivery_allowed** | **bool** | Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product. | [optional] [default to True]
**shipping_carriers** | **List[str]** | If you wish to enable automated shipping label generation through a specific provider, specify it there. | [optional] 
**ean_code** | **str** |  | [optional] 
**can_be_sold_separately** | **bool** | Set this flag to false to forbid a potential buyer to acquire less than \&quot;itemCount\&quot; item(s) | [optional] [default to True]
**metadata** | [**List[OfferMetadataUpdate]**](OfferMetadataUpdate.md) |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.offer_update import OfferUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of OfferUpdate from a JSON string
offer_update_instance = OfferUpdate.from_json(json)
# print the JSON string representation of the object
print(OfferUpdate.to_json())

# convert the object into a dict
offer_update_dict = offer_update_instance.to_dict()
# create an instance of OfferUpdate from a dict
offer_update_from_dict = OfferUpdate.from_dict(offer_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


