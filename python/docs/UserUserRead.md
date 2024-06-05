# UserUserRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**public_name** | **str** |  | [optional] 
**role_in_company** | **str** |  | [optional] 
**birthday** | **datetime** |  | [optional] 
**email** | **str** |  | 
**roles** | **List[str]** |  | [optional] 
**totp_enabled** | **bool** |  | [optional] 
**intl_phone_number** | **str** |  | [optional] 
**origin_country** | **str** | The originating country | [optional] 
**preferred_language** | **str** |  | [optional] 
**last_successful_log_in** | **datetime** |  | [optional] 
**avatar** | [**MediaUserRead**](MediaUserRead.md) |  | [optional] 
**created_at** | **datetime** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**consent_mail_ads** | **bool** |  | [optional] 
**lockdown** | **bool** |  | [optional] 
**organization** | [**OrganizationUserRead**](OrganizationUserRead.md) |  | [optional] 
**bank_account** | [**BankAccountUserRead**](BankAccountUserRead.md) |  | [optional] 
**identity_verified_at** | **datetime** |  | [optional] 
**iri** | **str** |  | [optional] [readonly] 
**impersonating_organization** | **bool** |  | [optional] [readonly] 
**second_auth_factor** | **bool** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.user_user_read import UserUserRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserUserRead from a JSON string
user_user_read_instance = UserUserRead.from_json(json)
# print the JSON string representation of the object
print(UserUserRead.to_json())

# convert the object into a dict
user_user_read_dict = user_user_read_instance.to_dict()
# create an instance of UserUserRead from a dict
user_user_read_from_dict = UserUserRead.from_dict(user_user_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


