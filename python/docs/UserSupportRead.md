# UserSupportRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**main_address** | **object** |  | [optional] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**public_name** | **str** |  | [optional] 
**role_in_company** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**roles** | **List[str]** |  | 
**totp_enabled** | **bool** |  | [optional] 
**intl_phone_number** | **str** |  | [optional] 
**last_successful_log_in** | **datetime** |  | [optional] 
**avatar** | [**UserMediaSupportRead**](UserMediaSupportRead.md) |  | [optional] 
**created_at** | **datetime** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**organization** | [**UserOrganizationSupportRead**](UserOrganizationSupportRead.md) |  | [optional] 
**wallet** | [**UserWalletSupportRead**](UserWalletSupportRead.md) |  | [optional] 
**external_id** | **str** |  | [optional] 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] [readonly] 
**provider_updated_at** | **datetime** |  | [optional] [readonly] 
**iri** | **str** |  | [optional] [readonly] 
**second_auth_factor** | **bool** |  | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.user_support_read import UserSupportRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserSupportRead from a JSON string
user_support_read_instance = UserSupportRead.from_json(json)
# print the JSON string representation of the object
print(UserSupportRead.to_json())

# convert the object into a dict
user_support_read_dict = user_support_read_instance.to_dict()
# create an instance of UserSupportRead from a dict
user_support_read_from_dict = UserSupportRead.from_dict(user_support_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


