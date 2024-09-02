# TransactionCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ulid** | **str** |  | 
**offer** | [**TransactionOfferCollectionRead**](TransactionOfferCollectionRead.md) |  | 
**quote** | [**TransactionQuoteCollectionRead**](TransactionQuoteCollectionRead.md) |  | 
**buyer_message** | **str** | Attach a note. Only the buyer can exercise this right. At the creation. | [optional] 
**buyer** | [**TransactionPersonaCollectionRead**](TransactionPersonaCollectionRead.md) |  | 
**status** | **str** |  | [optional] 
**fees** | **float** |  | [optional] 
**supplemental_fees** | **float** |  | [optional] 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] [readonly] 
**provider_updated_at** | **datetime** |  | [optional] [readonly] 
**total** | **float** |  | [optional] [readonly] 
**total_charged** | **float** |  | [optional] [readonly] 
**total_fees** | **float** |  | [optional] [readonly] 
**awaited_party** | **str** | Determine who is awaited (actor) for the next transition | [optional] [readonly] 
**status_expiration** | **datetime** | Yield if eligible the date-time at which the transaction state expire. | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.transaction_collection_read import TransactionCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionCollectionRead from a JSON string
transaction_collection_read_instance = TransactionCollectionRead.from_json(json)
# print the JSON string representation of the object
print(TransactionCollectionRead.to_json())

# convert the object into a dict
transaction_collection_read_dict = transaction_collection_read_instance.to_dict()
# create an instance of TransactionCollectionRead from a dict
transaction_collection_read_from_dict = TransactionCollectionRead.from_dict(transaction_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


