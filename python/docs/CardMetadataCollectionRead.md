# CardMetadataCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.card_metadata_collection_read import CardMetadataCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of CardMetadataCollectionRead from a JSON string
card_metadata_collection_read_instance = CardMetadataCollectionRead.from_json(json)
# print the JSON string representation of the object
print(CardMetadataCollectionRead.to_json())

# convert the object into a dict
card_metadata_collection_read_dict = card_metadata_collection_read_instance.to_dict()
# create an instance of CardMetadataCollectionRead from a dict
card_metadata_collection_read_from_dict = CardMetadataCollectionRead.from_dict(card_metadata_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


