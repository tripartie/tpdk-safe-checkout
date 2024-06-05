# BankAccountUserRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iban** | **str** |  | 
**bic** | **str** |  | 
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.bank_account_user_read import BankAccountUserRead

# TODO update the JSON string below
json = "{}"
# create an instance of BankAccountUserRead from a JSON string
bank_account_user_read_instance = BankAccountUserRead.from_json(json)
# print the JSON string representation of the object
print(BankAccountUserRead.to_json())

# convert the object into a dict
bank_account_user_read_dict = bank_account_user_read_instance.to_dict()
# create an instance of BankAccountUserRead from a dict
bank_account_user_read_from_dict = BankAccountUserRead.from_dict(bank_account_user_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


