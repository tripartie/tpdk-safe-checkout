# OrganizationRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**vat_number** | **str** |  | [optional] 
**commercial_registry_number** | **str** |  | [optional] 
**website_url** | **str** |  | [optional] 
**custom_base_url** | **str** |  | [optional] 
**domain_verified** | **bool** |  | 
**icon** | [**OrganizationMediaRead**](OrganizationMediaRead.md) |  | [optional] 
**logo** | [**OrganizationMediaRead**](OrganizationMediaRead.md) |  | [optional] 
**primary_color** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.organization_read import OrganizationRead

# TODO update the JSON string below
json = "{}"
# create an instance of OrganizationRead from a JSON string
organization_read_instance = OrganizationRead.from_json(json)
# print the JSON string representation of the object
print(OrganizationRead.to_json())

# convert the object into a dict
organization_read_dict = organization_read_instance.to_dict()
# create an instance of OrganizationRead from a dict
organization_read_from_dict = OrganizationRead.from_dict(organization_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


