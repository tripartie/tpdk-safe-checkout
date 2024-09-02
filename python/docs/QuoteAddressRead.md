# QuoteAddressRead



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
**created_at** | **datetime** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.quote_address_read import QuoteAddressRead

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteAddressRead from a JSON string
quote_address_read_instance = QuoteAddressRead.from_json(json)
# print the JSON string representation of the object
print(QuoteAddressRead.to_json())

# convert the object into a dict
quote_address_read_dict = quote_address_read_instance.to_dict()
# create an instance of QuoteAddressRead from a dict
quote_address_read_from_dict = QuoteAddressRead.from_dict(quote_address_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


