# OfferOrganizationCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**website_url** | **str** |  | [optional] 
**icon** | [**OfferMediaCollectionRead**](OfferMediaCollectionRead.md) |  | [optional] 
**logo** | [**OfferMediaCollectionRead**](OfferMediaCollectionRead.md) |  | [optional] 
**primary_color** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.offer_organization_collection_read import OfferOrganizationCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of OfferOrganizationCollectionRead from a JSON string
offer_organization_collection_read_instance = OfferOrganizationCollectionRead.from_json(json)
# print the JSON string representation of the object
print(OfferOrganizationCollectionRead.to_json())

# convert the object into a dict
offer_organization_collection_read_dict = offer_organization_collection_read_instance.to_dict()
# create an instance of OfferOrganizationCollectionRead from a dict
offer_organization_collection_read_from_dict = OfferOrganizationCollectionRead.from_dict(offer_organization_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


