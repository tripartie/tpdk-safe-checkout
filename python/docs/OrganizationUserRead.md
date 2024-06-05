# OrganizationUserRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**name** | **str** |  | [optional] 
**domain_verified** | **bool** |  | 
**icon** | [**MediaUserRead**](MediaUserRead.md) |  | [optional] 
**logo** | [**MediaUserRead**](MediaUserRead.md) |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.organization_user_read import OrganizationUserRead

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationUserRead from a JSON string
organization_user_read_instance = OrganizationUserRead.from_json(json)
# print the JSON string representation of the object
print(OrganizationUserRead.to_json())

# convert the object into a dict
organization_user_read_dict = organization_user_read_instance.to_dict()
# create an instance of OrganizationUserRead from a dict
organization_user_read_from_dict = OrganizationUserRead.from_dict(organization_user_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


