# StatisticOutputSingleValue


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request** | **str** |  | 
**start_at** | **datetime** |  | 
**end_at** | **datetime** |  | 
**value** | **float** |  | 

## Example

```python
from tpdk_safe_checkout.models.statistic_output_single_value import StatisticOutputSingleValue

# TODO update the JSON string below
json = "{}"
# create an instance of StatisticOutputSingleValue from a JSON string
statistic_output_single_value_instance = StatisticOutputSingleValue.from_json(json)
# print the JSON string representation of the object
print(StatisticOutputSingleValue.to_json())

# convert the object into a dict
statistic_output_single_value_dict = statistic_output_single_value_instance.to_dict()
# create an instance of StatisticOutputSingleValue from a dict
statistic_output_single_value_from_dict = StatisticOutputSingleValue.from_dict(statistic_output_single_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


