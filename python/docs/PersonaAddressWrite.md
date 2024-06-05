# PersonaAddressWrite



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

## Example

```python
from tpdk_safe_checkout.models.persona_address_write import PersonaAddressWrite

# TODO update the JSON string below
json = "{}"
# create an instance of PersonaAddressWrite from a JSON string
persona_address_write_instance = PersonaAddressWrite.from_json(json)
# print the JSON string representation of the object
print(PersonaAddressWrite.to_json())

# convert the object into a dict
persona_address_write_dict = persona_address_write_instance.to_dict()
# create an instance of PersonaAddressWrite from a dict
persona_address_write_from_dict = PersonaAddressWrite.from_dict(persona_address_write_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


