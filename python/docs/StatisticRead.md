# StatisticRead


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | **List[str]** |  | 
**focus_on** | **str** |  | [optional] 
**focus_type** | **str** |  | [optional] 
**start_at** | **datetime** |  | [optional] 
**end_at** | **datetime** |  | [optional] 
**group_by_period** | **str** |  | [optional] 
**data** | [**List[StatisticReadDataInner]**](StatisticReadDataInner.md) |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.statistic_read import StatisticRead

# TODO update the JSON string below
json = "{}"
# create an instance of StatisticRead from a JSON string
statistic_read_instance = StatisticRead.from_json(json)
# print the JSON string representation of the object
print(StatisticRead.to_json())

# convert the object into a dict
statistic_read_dict = statistic_read_instance.to_dict()
# create an instance of StatisticRead from a dict
statistic_read_from_dict = StatisticRead.from_dict(statistic_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


