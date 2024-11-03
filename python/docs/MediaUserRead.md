# MediaUserRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**public_url** | **str** |  | 
**thumbnail_url** | **str** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.media_user_read import MediaUserRead

# TODO update the JSON string below
json = "{}"
# create an instance of MediaUserRead from a JSON string
media_user_read_instance = MediaUserRead.from_json(json)
# print the JSON string representation of the object
print(MediaUserRead.to_json())

# convert the object into a dict
media_user_read_dict = media_user_read_instance.to_dict()
# create an instance of MediaUserRead from a dict
media_user_read_from_dict = MediaUserRead.from_dict(media_user_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


