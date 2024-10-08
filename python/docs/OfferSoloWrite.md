# OfferSoloWrite



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**captcha** | **str** |  | 
**nature** | **str** | This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information. | [default to 'physical_item']
**title** | **str** |  | 
**description** | **str** |  | 
**unit_price** | **float** |  | [optional] 
**min_negotiable_unit_price** | **float** |  | [optional] 
**allow_to_negotiate_unit_price** | **bool** |  | 
**currency_code** | **str** |  | [default to 'EUR']
**item_count** | **int** |  | [optional] [default to 1]
**condition** | **str** |  | [optional] [default to 'USED']
**weight_in_gram** | **int** | Accepted values between 500g (0.5kg) and 10,000g (10kg). | 
**shipping_allowed** | **bool** | That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined. | 
**hand_delivery_allowed** | **bool** | Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product. | [default to True]
**shipping_carriers** | **List[str]** | If you wish to enable automated shipping label generation through a specific provider, specify it there. | [optional] 
**can_be_sold_separately** | **bool** | Set this flag to false to forbid a potential buyer to acquire less than \&quot;itemCount\&quot; item(s) | [default to True]

## Example

```python
from tpdk_safe_checkout.models.offer_solo_write import OfferSoloWrite

# TODO update the JSON string below
json = "{}"
# create an instance of OfferSoloWrite from a JSON string
offer_solo_write_instance = OfferSoloWrite.from_json(json)
# print the JSON string representation of the object
print(OfferSoloWrite.to_json())

# convert the object into a dict
offer_solo_write_dict = offer_solo_write_instance.to_dict()
# create an instance of OfferSoloWrite from a dict
offer_solo_write_from_dict = OfferSoloWrite.from_dict(offer_solo_write_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


