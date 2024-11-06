# OfferPersonaCollectionRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] [readonly] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**registered** | **bool** | Determine if the Persona have a Tripartie account | [optional] [readonly] 
**verified** | **bool** | Determine if the Persona have a VERIFIED Tripartie account | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.offer_persona_collection_read import OfferPersonaCollectionRead

# TODO update the JSON string below
json = "{}"
# create an instance of OfferPersonaCollectionRead from a JSON string
offer_persona_collection_read_instance = OfferPersonaCollectionRead.from_json(json)
# print the JSON string representation of the object
print(OfferPersonaCollectionRead.to_json())

# convert the object into a dict
offer_persona_collection_read_dict = offer_persona_collection_read_instance.to_dict()
# create an instance of OfferPersonaCollectionRead from a dict
offer_persona_collection_read_from_dict = OfferPersonaCollectionRead.from_dict(offer_persona_collection_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


