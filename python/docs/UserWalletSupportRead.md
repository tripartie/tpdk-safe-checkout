# UserWalletSupportRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ledger** | **float** |  | [optional] 
**available** | **float** |  | [optional] 
**external_id** | **str** |  | 
**provider_name** | **str** |  | 
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | 

## Example

```python
from tpdk_safe_checkout.models.user_wallet_support_read import UserWalletSupportRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserWalletSupportRead from a JSON string
user_wallet_support_read_instance = UserWalletSupportRead.from_json(json)
# print the JSON string representation of the object
print(UserWalletSupportRead.to_json())

# convert the object into a dict
user_wallet_support_read_dict = user_wallet_support_read_instance.to_dict()
# create an instance of UserWalletSupportRead from a dict
user_wallet_support_read_from_dict = UserWalletSupportRead.from_dict(user_wallet_support_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


