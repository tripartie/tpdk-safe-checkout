# TransactionPersonaCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.transaction_persona_collection_read import TransactionPersonaCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionPersonaCollectionRead from a JSON string
transaction_persona_collection_read_instance = TransactionPersonaCollectionRead.from_json(json)
# print the JSON string representation of the object
print(TransactionPersonaCollectionRead.to_json())

# convert the object into a dict
transaction_persona_collection_read_dict = transaction_persona_collection_read_instance.to_dict()
# create an instance of TransactionPersonaCollectionRead from a dict
transaction_persona_collection_read_from_dict = TransactionPersonaCollectionRead.from_dict(transaction_persona_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


