# QuoteUpdate

Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shipping_carrier** | **str** |  | 
**quantity_to_be_acquired** | **int** |  | [default to 1]
**attempt_unit_price** | **float** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.quote_update import QuoteUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteUpdate from a JSON string
quote_update_instance = QuoteUpdate.from_json(json)
# print the JSON string representation of the object
print(QuoteUpdate.to_json())

# convert the object into a dict
quote_update_dict = quote_update_instance.to_dict()
# create an instance of QuoteUpdate from a dict
quote_update_from_dict = QuoteUpdate.from_dict(quote_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


