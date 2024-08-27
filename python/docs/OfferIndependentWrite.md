# OfferIndependentWrite



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**public_url** | **str** | The public URL for your Ad/Offer on your marketplace. | [optional] 
**redirect_url** | **str** | Fill-in that field IF you intend to redirect your customer instead of using a WebView. | [optional] 
**seller** | [**OfferPersonaIndependentWrite**](OfferPersonaIndependentWrite.md) |  | 
**preset_buyer** | [**OfferPersonaIndependentWrite**](OfferPersonaIndependentWrite.md) |  | [optional] 
**nature** | **str** | This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information. | [optional] [default to 'physical_item']
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**unit_price** | **float** |  | [optional] 
**min_negotiable_unit_price** | **float** |  | [optional] 
**allow_to_negotiate_unit_price** | **bool** |  | [optional] 
**currency_code** | **str** |  | [optional] [default to 'EUR']
**item_count** | **int** |  | [optional] [default to 1]
**condition** | **str** |  | [optional] [default to 'USED']
**weight_in_gram** | **int** | Accepted values between 500g (0.5kg) and 10,000g (10kg). | [optional] 
**shipping_allowed** | **bool** | That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined. | [optional] 
**hand_delivery_allowed** | **bool** | Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product. | [optional] [default to True]
**shipping_carriers** | **List[str]** | If you wish to enable automated shipping label generation through a specific provider, specify it there. | [optional] 
**ean_code** | **str** |  | [optional] 
**can_be_sold_separately** | **bool** | Set this flag to false to forbid a potential buyer to acquire less than \&quot;itemCount\&quot; item(s) | [optional] [default to True]
**metadata** | [**List[OfferMetadataIndependentWrite]**](OfferMetadataIndependentWrite.md) |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.offer_independent_write import OfferIndependentWrite

# TODO update the JSON string below
json = "{}"
# create an instance of OfferIndependentWrite from a JSON string
offer_independent_write_instance = OfferIndependentWrite.from_json(json)
# print the JSON string representation of the object
print(OfferIndependentWrite.to_json())

# convert the object into a dict
offer_independent_write_dict = offer_independent_write_instance.to_dict()
# create an instance of OfferIndependentWrite from a dict
offer_independent_write_from_dict = OfferIndependentWrite.from_dict(offer_independent_write_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


