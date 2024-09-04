# UserWalletAuthenticatedRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | **float** |  | [optional] 
**currency** | **str** |  | 
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] 
**provider_updated_at** | **datetime** |  | [optional] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.user_wallet_authenticated_read import UserWalletAuthenticatedRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserWalletAuthenticatedRead from a JSON string
user_wallet_authenticated_read_instance = UserWalletAuthenticatedRead.from_json(json)
# print the JSON string representation of the object
print(UserWalletAuthenticatedRead.to_json())

# convert the object into a dict
user_wallet_authenticated_read_dict = user_wallet_authenticated_read_instance.to_dict()
# create an instance of UserWalletAuthenticatedRead from a dict
user_wallet_authenticated_read_from_dict = UserWalletAuthenticatedRead.from_dict(user_wallet_authenticated_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


