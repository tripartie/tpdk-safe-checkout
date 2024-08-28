# TransactionWalletRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] [readonly] 
**provider_updated_at** | **datetime** |  | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.transaction_wallet_read import TransactionWalletRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionWalletRead from a JSON string
transaction_wallet_read_instance = TransactionWalletRead.from_json(json)
# print the JSON string representation of the object
print(TransactionWalletRead.to_json())

# convert the object into a dict
transaction_wallet_read_dict = transaction_wallet_read_instance.to_dict()
# create an instance of TransactionWalletRead from a dict
transaction_wallet_read_from_dict = TransactionWalletRead.from_dict(transaction_wallet_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

