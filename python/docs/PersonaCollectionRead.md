# PersonaCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**offer_count** | **int** | Issued Offers count owned by a given Persona | [optional] [readonly] 
**purchase_count** | **int** |  | [optional] [readonly] 
**registered** | **bool** | Determine if the Persona have a Tripartie account | [optional] [readonly] 
**verified** | **bool** | Determine if the Persona have a VERIFIED Tripartie account | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.persona_collection_read import PersonaCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of PersonaCollectionRead from a JSON string
persona_collection_read_instance = PersonaCollectionRead.from_json(json)
# print the JSON string representation of the object
print(PersonaCollectionRead.to_json())

# convert the object into a dict
persona_collection_read_dict = persona_collection_read_instance.to_dict()
# create an instance of PersonaCollectionRead from a dict
persona_collection_read_from_dict = PersonaCollectionRead.from_dict(persona_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


