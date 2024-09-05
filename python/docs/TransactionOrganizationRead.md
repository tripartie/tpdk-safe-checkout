# TransactionOrganizationRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**website_url** | **str** |  | [optional] 
**icon** | [**TransactionMediaRead**](TransactionMediaRead.md) |  | [optional] 
**logo** | [**TransactionMediaRead**](TransactionMediaRead.md) |  | [optional] 
**primary_color** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.transaction_organization_read import TransactionOrganizationRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionOrganizationRead from a JSON string
transaction_organization_read_instance = TransactionOrganizationRead.from_json(json)
# print the JSON string representation of the object
print(TransactionOrganizationRead.to_json())

# convert the object into a dict
transaction_organization_read_dict = transaction_organization_read_instance.to_dict()
# create an instance of TransactionOrganizationRead from a dict
transaction_organization_read_from_dict = TransactionOrganizationRead.from_dict(transaction_organization_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


