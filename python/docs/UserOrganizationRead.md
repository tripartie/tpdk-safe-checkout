# UserOrganizationRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**name** | **str** |  | 
**domain_verified** | **bool** |  | [optional] 
**icon** | [**UserMediaRead**](UserMediaRead.md) |  | [optional] 
**logo** | [**UserMediaRead**](UserMediaRead.md) |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.user_organization_read import UserOrganizationRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserOrganizationRead from a JSON string
user_organization_read_instance = UserOrganizationRead.from_json(json)
# print the JSON string representation of the object
print(UserOrganizationRead.to_json())

# convert the object into a dict
user_organization_read_dict = user_organization_read_instance.to_dict()
# create an instance of UserOrganizationRead from a dict
user_organization_read_from_dict = UserOrganizationRead.from_dict(user_organization_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


