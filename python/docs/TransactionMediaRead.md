# TransactionMediaRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**public_url** | **str** |  | 
**thumbnail_url** | **str** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.transaction_media_read import TransactionMediaRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionMediaRead from a JSON string
transaction_media_read_instance = TransactionMediaRead.from_json(json)
# print the JSON string representation of the object
print(TransactionMediaRead.to_json())

# convert the object into a dict
transaction_media_read_dict = transaction_media_read_instance.to_dict()
# create an instance of TransactionMediaRead from a dict
transaction_media_read_from_dict = TransactionMediaRead.from_dict(transaction_media_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


