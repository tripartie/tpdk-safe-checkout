# UserWalletSupportRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | **float** |  | [optional] 
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | 
**external_id** | **str** |  | [optional] 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] [readonly] 
**provider_updated_at** | **datetime** |  | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

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


