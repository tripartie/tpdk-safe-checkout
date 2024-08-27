# TransactionQuoteCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ulid** | **str** |  | 
**shipping_carrier** | **str** |  | 
**quantity_to_be_acquired** | **int** |  | [default to 1]
**attempt_unit_price** | **float** |  | [optional] 
**transaction_fees** | **float** |  | [optional] 
**shipping_fees** | **float** |  | [optional] 
**created_at** | **datetime** |  | 
**expire_at** | **datetime** |  | 

## Example

```python
from tpdk_safe_checkout.models.transaction_quote_collection_read import TransactionQuoteCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionQuoteCollectionRead from a JSON string
transaction_quote_collection_read_instance = TransactionQuoteCollectionRead.from_json(json)
# print the JSON string representation of the object
print(TransactionQuoteCollectionRead.to_json())

# convert the object into a dict
transaction_quote_collection_read_dict = transaction_quote_collection_read_instance.to_dict()
# create an instance of TransactionQuoteCollectionRead from a dict
transaction_quote_collection_read_from_dict = TransactionQuoteCollectionRead.from_dict(transaction_quote_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


