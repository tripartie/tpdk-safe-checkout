# CardUpdate



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadata** | [**List[CardMetadataUpdate]**](CardMetadataUpdate.md) |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.card_update import CardUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of CardUpdate from a JSON string
card_update_instance = CardUpdate.from_json(json)
# print the JSON string representation of the object
print(CardUpdate.to_json())

# convert the object into a dict
card_update_dict = card_update_instance.to_dict()
# create an instance of CardUpdate from a dict
card_update_from_dict = CardUpdate.from_dict(card_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


