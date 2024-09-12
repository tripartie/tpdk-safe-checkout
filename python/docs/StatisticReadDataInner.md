# StatisticReadDataInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | **str** |  | 
**start_at** | **datetime** |  | 
**end_at** | **datetime** |  | 
**value** | **float** |  | 
**values** | [**List[StatisticOutputArraySingleValue]**](StatisticOutputArraySingleValue.md) |  | 

## Example

```python
from tpdk_safe_checkout.models.statistic_read_data_inner import StatisticReadDataInner

# TODO update the JSON string below
json = "{}"
# create an instance of StatisticReadDataInner from a JSON string
statistic_read_data_inner_instance = StatisticReadDataInner.from_json(json)
# print the JSON string representation of the object
print(StatisticReadDataInner.to_json())

# convert the object into a dict
statistic_read_data_inner_dict = statistic_read_data_inner_instance.to_dict()
# create an instance of StatisticReadDataInner from a dict
statistic_read_data_inner_from_dict = StatisticReadDataInner.from_dict(statistic_read_data_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


