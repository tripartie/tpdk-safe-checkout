# UserPostRegisterRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**iri** | **str** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.user_post_register_read import UserPostRegisterRead

# TODO update the JSON string below
json = "{}"
# create an instance of UserPostRegisterRead from a JSON string
user_post_register_read_instance = UserPostRegisterRead.from_json(json)
# print the JSON string representation of the object
print(UserPostRegisterRead.to_json())

# convert the object into a dict
user_post_register_read_dict = user_post_register_read_instance.to_dict()
# create an instance of UserPostRegisterRead from a dict
user_post_register_read_from_dict = UserPostRegisterRead.from_dict(user_post_register_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


