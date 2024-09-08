# UserCardAuthenticatedRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**primary_account_number** | **str** |  | [optional] 
**expire_at** | **datetime** |  | [optional] 
**currency** | **str** |  | [optional] 
**country_code** | **str** |  | [optional] 
**brand** | **str** |  | [optional] 
**ephemeral** | **bool** |  | [optional] [default to True]
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | [optional] 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] 
**provider_updated_at** | **datetime** |  | [optional] 
**iri** | **str** |  | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.user_card_authenticated_read import UserCardAuthenticatedRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserCardAuthenticatedRead from a JSON string
user_card_authenticated_read_instance = UserCardAuthenticatedRead.from_json(json)
# print the JSON string representation of the object
print(UserCardAuthenticatedRead.to_json())

# convert the object into a dict
user_card_authenticated_read_dict = user_card_authenticated_read_instance.to_dict()
# create an instance of UserCardAuthenticatedRead from a dict
user_card_authenticated_read_from_dict = UserCardAuthenticatedRead.from_dict(user_card_authenticated_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


