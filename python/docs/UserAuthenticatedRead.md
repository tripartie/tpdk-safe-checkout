# UserAuthenticatedRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**main_address** | [**UserAddressAuthenticatedRead**](UserAddressAuthenticatedRead.md) |  | [optional] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**public_name** | **str** |  | [optional] 
**role_in_company** | **str** |  | [optional] 
**birthday** | **datetime** |  | [optional] 
**email** | **str** |  | [optional] 
**roles** | **List[str]** |  | 
**totp_enabled** | **bool** |  | [optional] 
**intl_phone_number** | **str** |  | [optional] 
**origin_country** | **str** | The nationality of the current user. | [optional] 
**home_country** | **str** | The originating country | [optional] 
**preferred_language** | **str** |  | [optional] 
**last_successful_log_in** | **datetime** |  | [optional] 
**avatar** | [**UserMediaAuthenticatedRead**](UserMediaAuthenticatedRead.md) |  | [optional] 
**created_at** | **datetime** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**consent_mail_ads** | **bool** |  | 
**lockdown** | **bool** |  | 
**time_zone_offset** | **int** | Timezone offset. Expressed in minutes. Used for DT conversion and fraud prevention. | [optional] 
**organization** | [**UserOrganizationAuthenticatedRead**](UserOrganizationAuthenticatedRead.md) |  | [optional] 
**bank_account** | [**UserBankAccountAuthenticatedRead**](UserBankAccountAuthenticatedRead.md) |  | [optional] 
**identity_verified_at** | **datetime** |  | [optional] 
**profiles** | [**List[UserPersonaAuthenticatedRead]**](UserPersonaAuthenticatedRead.md) |  | 
**cards** | [**List[UserCardAuthenticatedRead]**](UserCardAuthenticatedRead.md) |  | [optional] 
**wallet** | [**UserWalletAuthenticatedRead**](UserWalletAuthenticatedRead.md) |  | [optional] 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] 
**provider_updated_at** | **datetime** |  | [optional] 
**iri** | **str** |  | [optional] [readonly] 
**impersonating_organization** | **bool** |  | [optional] [readonly] 
**second_auth_factor** | **bool** |  | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.user_authenticated_read import UserAuthenticatedRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserAuthenticatedRead from a JSON string
user_authenticated_read_instance = UserAuthenticatedRead.from_json(json)
# print the JSON string representation of the object
print(UserAuthenticatedRead.to_json())

# convert the object into a dict
user_authenticated_read_dict = user_authenticated_read_instance.to_dict()
# create an instance of UserAuthenticatedRead from a dict
user_authenticated_read_from_dict = UserAuthenticatedRead.from_dict(user_authenticated_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


