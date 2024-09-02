# QuoteRead

Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ulid** | **str** |  | 
**shipping_carrier** | **str** |  | [optional] 
**pickup_code** | **str** |  | [optional] 
**quantity_to_be_acquired** | **int** |  | [default to 1]
**attempt_unit_price** | **float** |  | [optional] 
**currency** | **str** | Expect &#39;EUR&#39; only for now. | [optional] [default to 'EUR']
**original_unit_price** | **float** |  | [optional] 
**original_unit_price_unconverted** | **float** |  | [optional] 
**transaction_fees** | **float** |  | [optional] 
**shipping_fees** | **float** |  | [optional] 
**third_party_recipient_first_name** | **str** |  | [optional] 
**third_party_recipient_last_name** | **str** |  | [optional] 
**third_party_recipient_address** | [**QuoteAddressRead**](QuoteAddressRead.md) |  | [optional] 
**created_at** | **datetime** |  | 
**expire_at** | **datetime** |  | 
**iri** | **str** |  | [optional] [readonly] 
**unit_price** | **float** |  | [optional] [readonly] 
**price** | **float** |  | [optional] [readonly] 
**buyer_total** | **float** | The buyer pays for:  - A) item  - B) shipping (optional)  - C) fees     (optional) This method sum them automatically. | [optional] [readonly] 
**seller_total** | **float** | Represent what amount is to be expected released to the seller. | [optional] [readonly] 
**exchange_rate** | **float** | Exchange rate, if applicable. Between the offer currency and actual charged currency. | [optional] [readonly] 

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


