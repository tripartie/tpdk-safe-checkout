# OfferOrganizationRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**website_url** | **str** |  | [optional] 
**custom_base_url** | **str** |  | [optional] 
**icon** | [**OfferMediaRead**](OfferMediaRead.md) |  | [optional] 
**logo** | [**OfferMediaRead**](OfferMediaRead.md) |  | [optional] 
**primary_color** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.offer_organization_read import OfferOrganizationRead

# TODO update the JSON string below
json = "{}"
# create an instance of OfferOrganizationRead from a JSON string
offer_organization_read_instance = OfferOrganizationRead.from_json(json)
# print the JSON string representation of the object
print(OfferOrganizationRead.to_json())

# convert the object into a dict
offer_organization_read_dict = offer_organization_read_instance.to_dict()
# create an instance of OfferOrganizationRead from a dict
offer_organization_read_from_dict = OfferOrganizationRead.from_dict(offer_organization_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


