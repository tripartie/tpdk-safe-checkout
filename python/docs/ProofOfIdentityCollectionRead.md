# ProofOfIdentityCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** |  | 
**original_filename** | **str** |  | [optional] 
**extension** | **str** |  | 
**created_at** | **datetime** |  | 
**updated_at** | **datetime** |  | 
**provider_name** | **str** |  | [optional] 
**provider_created_at** | **datetime** |  | [optional] [readonly] 
**provider_updated_at** | **datetime** |  | [optional] [readonly] 
**processor_status** | **str** | Automagically infer on what state the entity is at the Payment Processor. | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.proof_of_identity_collection_read import ProofOfIdentityCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of ProofOfIdentityCollectionRead from a JSON string
proof_of_identity_collection_read_instance = ProofOfIdentityCollectionRead.from_json(json)
# print the JSON string representation of the object
print(ProofOfIdentityCollectionRead.to_json())

# convert the object into a dict
proof_of_identity_collection_read_dict = proof_of_identity_collection_read_instance.to_dict()
# create an instance of ProofOfIdentityCollectionRead from a dict
proof_of_identity_collection_read_from_dict = ProofOfIdentityCollectionRead.from_dict(proof_of_identity_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


