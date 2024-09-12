# StatisticWrite


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | **List[str]** |  | 
**focus_on** | **str** |  | [optional] 
**focus_type** | **str** |  | [optional] 
**start_at** | **datetime** |  | [optional] 
**end_at** | **datetime** |  | [optional] 
**group_by_period** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.statistic_write import StatisticWrite

# TODO update the JSON string below
json = "{}"
# create an instance of StatisticWrite from a JSON string
statistic_write_instance = StatisticWrite.from_json(json)
# print the JSON string representation of the object
print(StatisticWrite.to_json())

# convert the object into a dict
statistic_write_dict = statistic_write_instance.to_dict()
# create an instance of StatisticWrite from a dict
statistic_write_from_dict = StatisticWrite.from_dict(statistic_write_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


