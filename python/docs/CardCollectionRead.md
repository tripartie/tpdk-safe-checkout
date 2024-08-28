# CardCollectionRead



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
**metadata** | [**List[CardMetadataCollectionRead]**](CardMetadataCollectionRead.md) |  | [optional] 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] [readonly] 
**provider_updated_at** | **datetime** |  | [optional] [readonly] 
**iri** | **str** |  | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.card_collection_read import CardCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of CardCollectionRead from a JSON string
card_collection_read_instance = CardCollectionRead.from_json(json)
# print the JSON string representation of the object
print(CardCollectionRead.to_json())

# convert the object into a dict
card_collection_read_dict = card_collection_read_instance.to_dict()
# create an instance of CardCollectionRead from a dict
card_collection_read_from_dict = CardCollectionRead.from_dict(card_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


