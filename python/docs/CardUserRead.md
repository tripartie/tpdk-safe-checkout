# CardUserRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primary_account_number** | **str** |  | [optional] 
**expire_at** | **datetime** |  | 
**currency** | **str** |  | [optional] 
**country_code** | **str** |  | [optional] 
**brand** | **str** |  | [optional] 
**ephemeral** | **bool** |  | [optional] [default to True]
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] 
**provider_updated_at** | **datetime** |  | [optional] 
**iri** | **str** |  | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.card_user_read import CardUserRead

# TODO update the JSON string below
json = "{}"
# create an instance of CardUserRead from a JSON string
card_user_read_instance = CardUserRead.from_json(json)
# print the JSON string representation of the object
print(CardUserRead.to_json())

# convert the object into a dict
card_user_read_dict = card_user_read_instance.to_dict()
# create an instance of CardUserRead from a dict
card_user_read_from_dict = CardUserRead.from_dict(card_user_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


