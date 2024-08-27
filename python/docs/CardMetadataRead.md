# CardMetadataRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.card_metadata_read import CardMetadataRead

# TODO update the JSON string below
json = "{}"
# create an instance of CardMetadataRead from a JSON string
card_metadata_read_instance = CardMetadataRead.from_json(json)
# print the JSON string representation of the object
print(CardMetadataRead.to_json())

# convert the object into a dict
card_metadata_read_dict = card_metadata_read_instance.to_dict()
# create an instance of CardMetadataRead from a dict
card_metadata_read_from_dict = CardMetadataRead.from_dict(card_metadata_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


