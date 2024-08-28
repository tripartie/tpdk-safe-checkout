# QuoteRead

Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ulid** | **str** |  | 
**shipping_carrier** | **str** |  | 
**quantity_to_be_acquired** | **int** |  | [default to 1]
**attempt_unit_price** | **float** |  | [optional] 
**transaction_fees** | **float** |  | [optional] 
**shipping_fees** | **float** |  | [optional] 
**created_at** | **datetime** |  | 
**expire_at** | **datetime** |  | 
**iri** | **str** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.quote_read import QuoteRead

# TODO update the JSON string below
json = "{}"
# create an instance of QuoteRead from a JSON string
quote_read_instance = QuoteRead.from_json(json)
# print the JSON string representation of the object
print(QuoteRead.to_json())

# convert the object into a dict
quote_read_dict = quote_read_instance.to_dict()
# create an instance of QuoteRead from a dict
quote_read_from_dict = QuoteRead.from_dict(quote_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


