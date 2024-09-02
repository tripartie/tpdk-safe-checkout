# QuoteAddressUpdate



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country_code** | **str** |  | [optional] 
**zip_code** | **str** |  | [optional] 
**city_name** | **str** |  | [optional] 
**first_line** | **str** |  | [optional] 
**second_line** | **str** |  | [optional] 
**building_name** | **str** |  | [optional] 
**building_floor** | **str** |  | [optional] 
**gate_or_portal_or_inbox_code** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.quote_address_update import QuoteAddressUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteAddressUpdate from a JSON string
quote_address_update_instance = QuoteAddressUpdate.from_json(json)
# print the JSON string representation of the object
print(QuoteAddressUpdate.to_json())

# convert the object into a dict
quote_address_update_dict = quote_address_update_instance.to_dict()
# create an instance of QuoteAddressUpdate from a dict
quote_address_update_from_dict = QuoteAddressUpdate.from_dict(quote_address_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


