# PersonaRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**gender** | **str** |  | [optional] [default to 'RATHER_NOT_SAY']
**date_of_birth** | **object** |  | [optional] 
**language** | **str** | That data is used for rendering the frontend application with given language. If not set, will be inferred. Custom codes can be issued for specific requirements. | [optional] 
**email** | **str** |  | [optional] 
**mobile_phone_number** | **str** |  | [optional] 
**address** | [**PersonaAddressRead**](PersonaAddressRead.md) |  | [optional] 
**metadata** | [**List[PersonaMetadataRead]**](PersonaMetadataRead.md) | You can assign different meta to your Persona object for different purposes. eg. Ease searching. | [optional] 
**created_at** | **datetime** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**offer_count** | **int** | Issued Offers count owned by a given Persona | [optional] [readonly] 
**purchase_count** | **int** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.persona_read import PersonaRead

# TODO update the JSON string below
json = "{}"
# create an instance of PersonaRead from a JSON string
persona_read_instance = PersonaRead.from_json(json)
# print the JSON string representation of the object
print(PersonaRead.to_json())

# convert the object into a dict
persona_read_dict = persona_read_instance.to_dict()
# create an instance of PersonaRead from a dict
persona_read_from_dict = PersonaRead.from_dict(persona_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


