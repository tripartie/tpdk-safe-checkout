# UserWalletCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | **float** |  | [optional] 
**currency** | **str** |  | 
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | 
**external_id** | **str** |  | [optional] 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] [readonly] 
**provider_updated_at** | **datetime** |  | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

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


