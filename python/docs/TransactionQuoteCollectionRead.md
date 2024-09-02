# TransactionQuoteCollectionRead



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
**third_party_recipient_address** | **object** |  | [optional] 
**created_at** | **datetime** |  | 
**expire_at** | **datetime** |  | 
**iri** | **str** |  | [optional] [readonly] 
**unit_price** | **float** |  | [optional] [readonly] 
**price** | **float** |  | [optional] [readonly] 
**buyer_total** | **float** | The buyer pays for:  - A) item  - B) shipping (optional)  - C) fees     (optional) This method sum them automatically. | [optional] [readonly] 
**seller_total** | **float** | Represent what amount is to be expected released to the seller. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.transaction_quote_collection_read import TransactionQuoteCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionQuoteCollectionRead from a JSON string
transaction_quote_collection_read_instance = TransactionQuoteCollectionRead.from_json(json)
# print the JSON string representation of the object
print(TransactionQuoteCollectionRead.to_json())

# convert the object into a dict
transaction_quote_collection_read_dict = transaction_quote_collection_read_instance.to_dict()
# create an instance of TransactionQuoteCollectionRead from a dict
transaction_quote_collection_read_from_dict = TransactionQuoteCollectionRead.from_dict(transaction_quote_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


