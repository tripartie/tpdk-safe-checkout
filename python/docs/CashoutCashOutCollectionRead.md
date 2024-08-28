# CashoutCashOutCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**amount** | **float** |  | [optional] 
**iban** | **str** |  | 
**bic** | **str** |  | 
**status** | **str** |  | 
**created_at** | **datetime** |  | 
**confirmed_at** | **datetime** |  | 

## Example

```python
from tpdk_safe_checkout.models.cashout_cash_out_collection_read import CashoutCashOutCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of CashoutCashOutCollectionRead from a JSON string
cashout_cash_out_collection_read_instance = CashoutCashOutCollectionRead.from_json(json)
# print the JSON string representation of the object
print(CashoutCashOutCollectionRead.to_json())

# convert the object into a dict
cashout_cash_out_collection_read_dict = cashout_cash_out_collection_read_instance.to_dict()
# create an instance of CashoutCashOutCollectionRead from a dict
cashout_cash_out_collection_read_from_dict = CashoutCashOutCollectionRead.from_dict(cashout_cash_out_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


