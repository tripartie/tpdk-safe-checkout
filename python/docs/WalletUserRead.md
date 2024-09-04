# WalletUserRead



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
from tpdk_safe_checkout.models.wallet_user_read import WalletUserRead

# TODO update the JSON string below
json = "{}"
# create an instance of WalletUserRead from a JSON string
wallet_user_read_instance = WalletUserRead.from_json(json)
# print the JSON string representation of the object
print(WalletUserRead.to_json())

# convert the object into a dict
wallet_user_read_dict = wallet_user_read_instance.to_dict()
# create an instance of WalletUserRead from a dict
wallet_user_read_from_dict = WalletUserRead.from_dict(wallet_user_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


