# MediaRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**public_url** | **str** |  | [optional] 
**thumbnail_url** | **str** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.media_read import MediaRead

# TODO update the JSON string below
json = "{}"
# create an instance of MediaRead from a JSON string
media_read_instance = MediaRead.from_json(json)
# print the JSON string representation of the object
print(MediaRead.to_json())

# convert the object into a dict
media_read_dict = media_read_instance.to_dict()
# create an instance of MediaRead from a dict
media_read_from_dict = MediaRead.from_dict(media_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


