# WebhookHistoryRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**object_id** | **str** |  | [optional] 
**event** | **str** |  | 
**url** | **str** |  | 
**normalized_object** | **List[str]** |  | [optional] 
**response_code** | **int** |  | [optional] 
**response_body** | **str** |  | [optional] 
**occurred_at** | **datetime** |  | 
**created_at** | **datetime** |  | [optional] [readonly] 
**attempted_at** | **datetime** |  | [optional] [readonly] 
**retry_count** | **int** |  | 
**in_progress** | **bool** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.webhook_history_read import WebhookHistoryRead

# TODO update the JSON string below
json = "{}"
# create an instance of WebhookHistoryRead from a JSON string
webhook_history_read_instance = WebhookHistoryRead.from_json(json)
# print the JSON string representation of the object
print(WebhookHistoryRead.to_json())

# convert the object into a dict
webhook_history_read_dict = webhook_history_read_instance.to_dict()
# create an instance of WebhookHistoryRead from a dict
webhook_history_read_from_dict = WebhookHistoryRead.from_dict(webhook_history_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


