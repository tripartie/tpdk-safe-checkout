# BankAccountWrite



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iban** | **str** |  | 
**bic** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.bank_account_write import BankAccountWrite

# TODO update the JSON string below
json = "{}"
# create an instance of BankAccountWrite from a JSON string
bank_account_write_instance = BankAccountWrite.from_json(json)
# print the JSON string representation of the object
print(BankAccountWrite.to_json())

# convert the object into a dict
bank_account_write_dict = bank_account_write_instance.to_dict()
# create an instance of BankAccountWrite from a dict
bank_account_write_from_dict = BankAccountWrite.from_dict(bank_account_write_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


