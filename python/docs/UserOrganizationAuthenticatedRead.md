# UserOrganizationAuthenticatedRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**name** | **str** |  | [optional] 
**domain_verified** | **bool** |  | 
**icon** | [**UserMediaAuthenticatedRead**](UserMediaAuthenticatedRead.md) |  | [optional] 
**logo** | [**UserMediaAuthenticatedRead**](UserMediaAuthenticatedRead.md) |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.user_organization_authenticated_read import UserOrganizationAuthenticatedRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserOrganizationAuthenticatedRead from a JSON string
user_organization_authenticated_read_instance = UserOrganizationAuthenticatedRead.from_json(json)
# print the JSON string representation of the object
print(UserOrganizationAuthenticatedRead.to_json())

# convert the object into a dict
user_organization_authenticated_read_dict = user_organization_authenticated_read_instance.to_dict()
# create an instance of UserOrganizationAuthenticatedRead from a dict
user_organization_authenticated_read_from_dict = UserOrganizationAuthenticatedRead.from_dict(user_organization_authenticated_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


