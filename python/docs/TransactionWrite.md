# TransactionWrite



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**captcha** | **str** |  | [optional] 
**quote** | **str** |  | 
**buyer_message** | **str** | Attach a note. Only the buyer can exercise this right. At the creation. | [optional] 
**card** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.transaction_write import TransactionWrite

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionWrite from a JSON string
transaction_write_instance = TransactionWrite.from_json(json)
# print the JSON string representation of the object
print(TransactionWrite.to_json())

# convert the object into a dict
transaction_write_dict = transaction_write_instance.to_dict()
# create an instance of TransactionWrite from a dict
transaction_write_from_dict = TransactionWrite.from_dict(transaction_write_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


