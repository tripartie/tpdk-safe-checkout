# TransactionAddressRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country_code** | **str** |  | [optional] 
**zip_code** | **str** |  | [optional] 
**city_name** | **str** |  | [optional] 
**first_line** | **str** |  | [optional] 
**second_line** | **str** |  | [optional] 
**building_name** | **str** |  | [optional] 
**building_floor** | **str** |  | [optional] 
**gate_or_portal_or_inbox_code** | **str** |  | [optional] 

## Example

```python
from tpdk_safe_checkout.models.transaction_address_read import TransactionAddressRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionAddressRead from a JSON string
transaction_address_read_instance = TransactionAddressRead.from_json(json)
# print the JSON string representation of the object
print(TransactionAddressRead.to_json())

# convert the object into a dict
transaction_address_read_dict = transaction_address_read_instance.to_dict()
# create an instance of TransactionAddressRead from a dict
transaction_address_read_from_dict = TransactionAddressRead.from_dict(transaction_address_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


