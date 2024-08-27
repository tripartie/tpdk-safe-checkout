# CardMetadataUpdate



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.card_metadata_update import CardMetadataUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of CardMetadataUpdate from a JSON string
card_metadata_update_instance = CardMetadataUpdate.from_json(json)
# print the JSON string representation of the object
print(CardMetadataUpdate.to_json())

# convert the object into a dict
card_metadata_update_dict = card_metadata_update_instance.to_dict()
# create an instance of CardMetadataUpdate from a dict
card_metadata_update_from_dict = CardMetadataUpdate.from_dict(card_metadata_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


