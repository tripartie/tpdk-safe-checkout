# StatisticOutputMultipleValue


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | **str** |  | 
**values** | [**List[StatisticOutputArraySingleValue]**](StatisticOutputArraySingleValue.md) |  | 

## Example

```python
from tpdk_safe_checkout.models.statistic_output_multiple_value import StatisticOutputMultipleValue

# TODO update the JSON string below
json = "{}"
# create an instance of StatisticOutputMultipleValue from a JSON string
statistic_output_multiple_value_instance = StatisticOutputMultipleValue.from_json(json)
# print the JSON string representation of the object
print(StatisticOutputMultipleValue.to_json())

# convert the object into a dict
statistic_output_multiple_value_dict = statistic_output_multiple_value_instance.to_dict()
# create an instance of StatisticOutputMultipleValue from a dict
statistic_output_multiple_value_from_dict = StatisticOutputMultipleValue.from_dict(statistic_output_multiple_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


