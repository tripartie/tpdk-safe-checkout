# UserMediaSupportRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**public_url** | **str** |  | 
**thumbnail_url** | **str** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.user_media_support_read import UserMediaSupportRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserMediaSupportRead from a JSON string
user_media_support_read_instance = UserMediaSupportRead.from_json(json)
# print the JSON string representation of the object
print(UserMediaSupportRead.to_json())

# convert the object into a dict
user_media_support_read_dict = user_media_support_read_instance.to_dict()
# create an instance of UserMediaSupportRead from a dict
user_media_support_read_from_dict = UserMediaSupportRead.from_dict(user_media_support_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


