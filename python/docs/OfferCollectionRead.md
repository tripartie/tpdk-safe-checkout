# OfferCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ulid** | **str** |  | 
**status** | **str** |  | 
**public_url** | **str** | The public URL for your Ad/Offer on your marketplace. | [optional] 
**url** | **str** |  | [readonly] 
**organization** | [**OfferOrganizationCollectionRead**](OfferOrganizationCollectionRead.md) |  | [optional] 
**seller** | [**OfferPersonaCollectionRead**](OfferPersonaCollectionRead.md) |  | 
**preset_buyer** | [**OfferPersonaCollectionRead**](OfferPersonaCollectionRead.md) |  | [optional] 
**nature** | **str** | This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information. | [optional] [default to 'physical_item']
**title** | **str** |  | [optional] 
**unit_price** | **float** |  | [optional] 
**min_negotiable_unit_price** | **float** |  | [optional] 
**allow_to_negotiate_unit_price** | **bool** |  | [optional] 
**currency_code** | **str** |  | [optional] [default to 'EUR']
**item_count** | **int** |  | [optional] [default to 1]
**condition** | **str** |  | [optional] [default to 'USED']
**shipping_allowed** | **bool** | That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined. | [optional] 
**hand_delivery_allowed** | **bool** | Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product. | [optional] [default to True]
**shipping_carriers** | **List[str]** | If you wish to enable automated shipping label generation through a specific provider, specify it there. | [optional] 
**created_at** | **datetime** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**iri** | **str** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.offer_collection_read import OfferCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of OfferCollectionRead from a JSON string
offer_collection_read_instance = OfferCollectionRead.from_json(json)
# print the JSON string representation of the object
print(OfferCollectionRead.to_json())

# convert the object into a dict
offer_collection_read_dict = offer_collection_read_instance.to_dict()
# create an instance of OfferCollectionRead from a dict
offer_collection_read_from_dict = OfferCollectionRead.from_dict(offer_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


