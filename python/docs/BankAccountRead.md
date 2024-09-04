# BankAccountRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] 
**provider_updated_at** | **datetime** |  | [optional] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.bank_account_read import BankAccountRead

# TODO update the JSON string below
json = "{}"
# create an instance of BankAccountRead from a JSON string
bank_account_read_instance = BankAccountRead.from_json(json)
# print the JSON string representation of the object
print(BankAccountRead.to_json())

# convert the object into a dict
bank_account_read_dict = bank_account_read_instance.to_dict()
# create an instance of BankAccountRead from a dict
bank_account_read_from_dict = BankAccountRead.from_dict(bank_account_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


