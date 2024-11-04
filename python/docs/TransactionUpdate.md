# TransactionUpdate



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** |  | [optional] 
**supplemental_fees** | **float** | usually set if the weight was underestimated and shipping carrier billed us an extra. | [optional] 
**balance_to_refund** | **float** |  | [optional] 
**fees_to_refund** | **float** |  | [optional] 
**force_refund_shipping** | **bool** | Shipping is never refunded on purpose. Once deposited (parcel), we are billed for it. | [optional] 
**buyer_review** | **str** |  | [optional] 
**buyer_rating** | **int** |  | [optional] 
**seller_review** | **str** |  | [optional] 
**seller_rating** | **int** |  | [optional] 
**hand_over_code_confirmation** | **str** |  | [optional] 
**updated_at** | **datetime** |  | [optional] 
**review** | **str** |  | [optional] [readonly] 
**rating** | **int** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.transaction_update import TransactionUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionUpdate from a JSON string
transaction_update_instance = TransactionUpdate.from_json(json)
# print the JSON string representation of the object
print(TransactionUpdate.to_json())

# convert the object into a dict
transaction_update_dict = transaction_update_instance.to_dict()
# create an instance of TransactionUpdate from a dict
transaction_update_from_dict = TransactionUpdate.from_dict(transaction_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


