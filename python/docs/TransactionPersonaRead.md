# TransactionPersonaRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**language** | **str** | That data is used for rendering the frontend application with given language. If not set, will be inferred. Custom codes can be issued for specific requirements. | [optional] 
**email** | **str** |  | [optional] 
**mobile_phone_number** | **str** |  | [optional] 
**address** | [**TransactionAddressRead**](TransactionAddressRead.md) |  | [optional] 
**registered** | **bool** | Determine if the Persona have a Tripartie account | [optional] [readonly] 
**verified** | **bool** | Determine if the Persona have a VERIFIED Tripartie account | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.transaction_persona_read import TransactionPersonaRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionPersonaRead from a JSON string
transaction_persona_read_instance = TransactionPersonaRead.from_json(json)
# print the JSON string representation of the object
print(TransactionPersonaRead.to_json())

# convert the object into a dict
transaction_persona_read_dict = transaction_persona_read_instance.to_dict()
# create an instance of TransactionPersonaRead from a dict
transaction_persona_read_from_dict = TransactionPersonaRead.from_dict(transaction_persona_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


