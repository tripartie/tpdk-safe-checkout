# QuoteWrite

Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**captcha** | **str** |  | [optional] 
**offer** | **str** |  | [optional] 
**shipping_carrier** | **str** |  | 
**quantity_to_be_acquired** | **int** |  | [default to 1]
**attempt_unit_price** | **float** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.quote_write import QuoteWrite

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteWrite from a JSON string
quote_write_instance = QuoteWrite.from_json(json)
# print the JSON string representation of the object
print(QuoteWrite.to_json())

# convert the object into a dict
quote_write_dict = quote_write_instance.to_dict()
# create an instance of QuoteWrite from a dict
quote_write_from_dict = QuoteWrite.from_dict(quote_write_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


