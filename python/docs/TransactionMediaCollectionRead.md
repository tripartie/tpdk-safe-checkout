# TransactionMediaCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**public_url** | **str** |  | 
**thumbnail_url** | **str** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.transaction_media_collection_read import TransactionMediaCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionMediaCollectionRead from a JSON string
transaction_media_collection_read_instance = TransactionMediaCollectionRead.from_json(json)
# print the JSON string representation of the object
print(TransactionMediaCollectionRead.to_json())

# convert the object into a dict
transaction_media_collection_read_dict = transaction_media_collection_read_instance.to_dict()
# create an instance of TransactionMediaCollectionRead from a dict
transaction_media_collection_read_from_dict = TransactionMediaCollectionRead.from_dict(transaction_media_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


