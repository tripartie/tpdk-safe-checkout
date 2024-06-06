# UserWalletCollectionRead



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
from tpdk_safe_checkout.models.user_wallet_collection_read import UserWalletCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserWalletCollectionRead from a JSON string
user_wallet_collection_read_instance = UserWalletCollectionRead.from_json(json)
# print the JSON string representation of the object
print(UserWalletCollectionRead.to_json())

# convert the object into a dict
user_wallet_collection_read_dict = user_wallet_collection_read_instance.to_dict()
# create an instance of UserWalletCollectionRead from a dict
user_wallet_collection_read_from_dict = UserWalletCollectionRead.from_dict(user_wallet_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


