# CardWrite



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**captcha** | **str** |  | 
**ephemeral** | **bool** |  | [default to True]

## Example

```python
from tpdk_safe_checkout.models.card_write import CardWrite

# TODO update the JSON string below
json = "{}"
# create an instance of CardWrite from a JSON string
card_write_instance = CardWrite.from_json(json)
# print the JSON string representation of the object
print(CardWrite.to_json())

# convert the object into a dict
card_write_dict = card_write_instance.to_dict()
# create an instance of CardWrite from a dict
card_write_from_dict = CardWrite.from_dict(card_write_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


