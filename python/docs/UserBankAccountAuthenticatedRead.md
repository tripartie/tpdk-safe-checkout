# UserBankAccountAuthenticatedRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iban** | **str** |  | 
**bic** | **str** |  | 
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.user_bank_account_authenticated_read import UserBankAccountAuthenticatedRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserBankAccountAuthenticatedRead from a JSON string
user_bank_account_authenticated_read_instance = UserBankAccountAuthenticatedRead.from_json(json)
# print the JSON string representation of the object
print(UserBankAccountAuthenticatedRead.to_json())

# convert the object into a dict
user_bank_account_authenticated_read_dict = user_bank_account_authenticated_read_instance.to_dict()
# create an instance of UserBankAccountAuthenticatedRead from a dict
user_bank_account_authenticated_read_from_dict = UserBankAccountAuthenticatedRead.from_dict(user_bank_account_authenticated_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


