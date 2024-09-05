# TransactionOrganizationCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | [optional] 
**website_url** | **str** |  | [optional] 
**icon** | [**TransactionMediaCollectionRead**](TransactionMediaCollectionRead.md) |  | [optional] 
**logo** | [**TransactionMediaCollectionRead**](TransactionMediaCollectionRead.md) |  | [optional] 
**primary_color** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.transaction_organization_collection_read import TransactionOrganizationCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionOrganizationCollectionRead from a JSON string
transaction_organization_collection_read_instance = TransactionOrganizationCollectionRead.from_json(json)
# print the JSON string representation of the object
print(TransactionOrganizationCollectionRead.to_json())

# convert the object into a dict
transaction_organization_collection_read_dict = transaction_organization_collection_read_instance.to_dict()
# create an instance of TransactionOrganizationCollectionRead from a dict
transaction_organization_collection_read_from_dict = TransactionOrganizationCollectionRead.from_dict(transaction_organization_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


