# UserOrganizationSupportRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**name** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.user_organization_support_read import UserOrganizationSupportRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserOrganizationSupportRead from a JSON string
user_organization_support_read_instance = UserOrganizationSupportRead.from_json(json)
# print the JSON string representation of the object
print(UserOrganizationSupportRead.to_json())

# convert the object into a dict
user_organization_support_read_dict = user_organization_support_read_instance.to_dict()
# create an instance of UserOrganizationSupportRead from a dict
user_organization_support_read_from_dict = UserOrganizationSupportRead.from_dict(user_organization_support_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


