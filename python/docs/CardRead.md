# CardRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primary_account_number** | **str** |  | [optional] 
**expire_at** | **datetime** |  | 
**currency** | **str** |  | [optional] 
**country_code** | **str** |  | [optional] 
**brand** | **str** |  | [optional] 
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | 
**metadata** | [**List[CardMetadataRead]**](CardMetadataRead.md) |  | [optional] 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] 
**provider_updated_at** | **datetime** |  | [optional] 
**iri** | **str** |  | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.card_read import CardRead

# TODO update the JSON string below
json = "{}"
# create an instance of CardRead from a JSON string
card_read_instance = CardRead.from_json(json)
# print the JSON string representation of the object
print(CardRead.to_json())

# convert the object into a dict
card_read_dict = card_read_instance.to_dict()
# create an instance of CardRead from a dict
card_read_from_dict = CardRead.from_dict(card_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


