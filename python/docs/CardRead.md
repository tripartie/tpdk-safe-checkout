# CardRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primary_account_number** | **str** |  | [optional] 
**expire_at** | **datetime** |  | 
**currency** | **str** |  | [optional] 
**country_code** | **str** |  | [optional] 
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | 
**metadata** | [**List[CardMetadataRead]**](CardMetadataRead.md) |  | [optional] 

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


