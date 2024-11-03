# OfferMediaCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**public_url** | **str** |  | 
**thumbnail_url** | **str** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.offer_media_collection_read import OfferMediaCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of OfferMediaCollectionRead from a JSON string
offer_media_collection_read_instance = OfferMediaCollectionRead.from_json(json)
# print the JSON string representation of the object
print(OfferMediaCollectionRead.to_json())

# convert the object into a dict
offer_media_collection_read_dict = offer_media_collection_read_instance.to_dict()
# create an instance of OfferMediaCollectionRead from a dict
offer_media_collection_read_from_dict = OfferMediaCollectionRead.from_dict(offer_media_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


