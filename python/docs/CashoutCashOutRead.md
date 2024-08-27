# CashoutCashOutRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] [readonly] 
**provider_updated_at** | **datetime** |  | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.cashout_cash_out_read import CashoutCashOutRead

# TODO update the JSON string below
json = "{}"
# create an instance of CashoutCashOutRead from a JSON string
cashout_cash_out_read_instance = CashoutCashOutRead.from_json(json)
# print the JSON string representation of the object
print(CashoutCashOutRead.to_json())

# convert the object into a dict
cashout_cash_out_read_dict = cashout_cash_out_read_instance.to_dict()
# create an instance of CashoutCashOutRead from a dict
cashout_cash_out_read_from_dict = CashoutCashOutRead.from_dict(cashout_cash_out_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


