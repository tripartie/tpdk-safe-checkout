# StatisticOutputArraySingleValue


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_at** | **datetime** |  | 
**end_at** | **datetime** |  | 
**value** | **float** |  | 

## Example

```python
from tpdk_safe_checkout.models.statistic_output_array_single_value import StatisticOutputArraySingleValue

# TODO update the JSON string below
json = "{}"
# create an instance of StatisticOutputArraySingleValue from a JSON string
statistic_output_array_single_value_instance = StatisticOutputArraySingleValue.from_json(json)
# print the JSON string representation of the object
print(StatisticOutputArraySingleValue.to_json())

# convert the object into a dict
statistic_output_array_single_value_dict = statistic_output_array_single_value_instance.to_dict()
# create an instance of StatisticOutputArraySingleValue from a dict
statistic_output_array_single_value_from_dict = StatisticOutputArraySingleValue.from_dict(statistic_output_array_single_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


