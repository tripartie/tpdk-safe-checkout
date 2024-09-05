# TransactionCardRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primary_account_number** | **str** |  | [optional] 
**brand** | **str** |  | [optional] 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] 
**provider_updated_at** | **datetime** |  | [optional] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.transaction_card_read import TransactionCardRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionCardRead from a JSON string
transaction_card_read_instance = TransactionCardRead.from_json(json)
# print the JSON string representation of the object
print(TransactionCardRead.to_json())

# convert the object into a dict
transaction_card_read_dict = transaction_card_read_instance.to_dict()
# create an instance of TransactionCardRead from a dict
transaction_card_read_from_dict = TransactionCardRead.from_dict(transaction_card_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


