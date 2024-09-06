# TransactionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ulid** | **str** |  | 
**offer** | [**TransactionOfferRead**](TransactionOfferRead.md) |  | 
**quote** | [**TransactionQuoteRead**](TransactionQuoteRead.md) |  | 
**buyer_message** | **str** | Attach a note. Only the buyer can exercise this right. At the creation. | [optional] 
**buyer** | [**TransactionPersonaRead**](TransactionPersonaRead.md) |  | 
**status** | **str** |  | [optional] 
**supplemental_fees** | **float** | usually set if the weight was underestimated and shipping carrier billed us an extra. | [optional] 
**card** | [**TransactionCardRead**](TransactionCardRead.md) |  | [optional] 
**escrow** | [**TransactionWalletRead**](TransactionWalletRead.md) |  | [optional] 
**remote_pre_authorization_id** | **str** |  | [optional] 
**remote_pay_in_id** | **str** |  | [optional] 
**balance_to_refund** | **float** |  | [optional] 
**fees_to_refund** | **float** |  | [optional] 
**force_refund_shipping** | **bool** | Shipping is never refunded on purpose. Once deposited (parcel), we are billed for it. | [optional] 
**review** | **str** |  | [optional] 
**rating** | **int** |  | [optional] 
**hand_over_code** | **str** |  | [optional] 
**parcels** | [**List[TransactionParcelRead]**](TransactionParcelRead.md) |  | [optional] 
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | [optional] 
**metadata** | [**List[TransactionMetadataRead]**](TransactionMetadataRead.md) |  | [optional] 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] 
**provider_updated_at** | **datetime** |  | [optional] 
**total** | **float** |  | [optional] [readonly] 
**total_charged** | **float** |  | [optional] [readonly] 
**total_fees** | **float** |  | [optional] [readonly] 
**awaited_party** | **str** | Determine who is awaited (actor) for the next transition | [optional] [readonly] 
**status_expiration** | **datetime** | Yield if eligible the date-time at which the transaction state expire. | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.transaction_read import TransactionRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionRead from a JSON string
transaction_read_instance = TransactionRead.from_json(json)
# print the JSON string representation of the object
print(TransactionRead.to_json())

# convert the object into a dict
transaction_read_dict = transaction_read_instance.to_dict()
# create an instance of TransactionRead from a dict
transaction_read_from_dict = TransactionRead.from_dict(transaction_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


