# UserPersonaAuthenticatedRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organization** | [**UserOrganizationAuthenticatedRead**](UserOrganizationAuthenticatedRead.md) |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.user_persona_authenticated_read import UserPersonaAuthenticatedRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserPersonaAuthenticatedRead from a JSON string
user_persona_authenticated_read_instance = UserPersonaAuthenticatedRead.from_json(json)
# print the JSON string representation of the object
print(UserPersonaAuthenticatedRead.to_json())

# convert the object into a dict
user_persona_authenticated_read_dict = user_persona_authenticated_read_instance.to_dict()
# create an instance of UserPersonaAuthenticatedRead from a dict
user_persona_authenticated_read_from_dict = UserPersonaAuthenticatedRead.from_dict(user_persona_authenticated_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


