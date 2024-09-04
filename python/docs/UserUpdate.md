# UserUpdate



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**main_address** | [**UserAddressUpdate**](UserAddressUpdate.md) |  | [optional] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**public_name** | **str** |  | [optional] 
**role_in_company** | **str** |  | [optional] 
**birthday** | **datetime** |  | [optional] 
**intl_phone_number** | **str** |  | [optional] 
**origin_country** | **str** | The nationality of the current user. | [optional] 
**home_country** | **str** | The originating country | [optional] 
**preferred_language** | **str** |  | [optional] 
**consent_mail_ads** | **bool** |  | 
**time_zone_offset** | **int** | Timezone offset. Expressed in minutes. Used for DT conversion and fraud prevention. | [optional] 

## Example

```python
from tpdk_safe_checkout.models.user_update import UserUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of UserUpdate from a JSON string
user_update_instance = UserUpdate.from_json(json)
# print the JSON string representation of the object
print(UserUpdate.to_json())

# convert the object into a dict
user_update_dict = user_update_instance.to_dict()
# create an instance of UserUpdate from a dict
user_update_from_dict = UserUpdate.from_dict(user_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


