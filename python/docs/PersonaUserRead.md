# PersonaUserRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**organization** | [**OrganizationUserRead**](OrganizationUserRead.md) |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.persona_user_read import PersonaUserRead

# TODO update the JSON string below
json = "{}"
# create an instance of PersonaUserRead from a JSON string
persona_user_read_instance = PersonaUserRead.from_json(json)
# print the JSON string representation of the object
print(PersonaUserRead.to_json())

# convert the object into a dict
persona_user_read_dict = persona_user_read_instance.to_dict()
# create an instance of PersonaUserRead from a dict
persona_user_read_from_dict = PersonaUserRead.from_dict(persona_user_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


