# UserAddressSupportRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company_name** | **str** |  | [optional] 
**country_code** | **str** |  | [optional] 
**zip_code** | **str** |  | [optional] 
**city_name** | **str** |  | [optional] 
**first_line** | **str** |  | [optional] 
**second_line** | **str** |  | [optional] 
**building_name** | **str** |  | [optional] 
**building_floor** | **str** |  | [optional] 
**gate_or_portal_or_inbox_code** | **str** |  | [optional] 
**formatted_address** | **str** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.user_address_support_read import UserAddressSupportRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserAddressSupportRead from a JSON string
user_address_support_read_instance = UserAddressSupportRead.from_json(json)
# print the JSON string representation of the object
print(UserAddressSupportRead.to_json())

# convert the object into a dict
user_address_support_read_dict = user_address_support_read_instance.to_dict()
# create an instance of UserAddressSupportRead from a dict
user_address_support_read_from_dict = UserAddressSupportRead.from_dict(user_address_support_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


