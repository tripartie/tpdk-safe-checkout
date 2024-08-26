# Persona



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**organization** | **str** |  | [optional] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**gender** | **str** |  | [optional] [default to 'RATHER_NOT_SAY']
**date_of_birth** | **object** |  | [optional] 
**language** | **str** | That data is used for rendering the frontend application with given language. If not set, will be inferred. Custom codes can be issued for specific requirements. | [optional] 
**email** | **str** |  | [optional] 
**mobile_phone_number** | **str** |  | [optional] 
**address** | [**Address**](Address.md) |  | [optional] 
**metadata** | [**List[Metadata]**](Metadata.md) | You can assign different meta to your Persona object for different purposes. eg. Ease searching. | [optional] 
**offers** | **List[str]** |  | 
**purchases** | **List[str]** |  | 
**views** | [**List[View]**](View.md) |  | 
**created_at** | **datetime** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**owned_by** | **str** |  | [optional] 
**offer_count** | **int** | Issued Offers count owned by a given Persona | [optional] [readonly] 
**purchase_count** | **int** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.persona import Persona

# TODO update the JSON string below
json = "{}"
# create an instance of Persona from a JSON string
persona_instance = Persona.from_json(json)
# print the JSON string representation of the object
print(Persona.to_json())

# convert the object into a dict
persona_dict = persona_instance.to_dict()
# create an instance of Persona from a dict
persona_from_dict = Persona.from_dict(persona_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


