# OfferPersonaRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**registered** | **bool** | Determine if the Persona have a Tripartie account | [optional] [readonly] 
**verified** | **bool** | Determine if the Persona have a VERIFIED Tripartie account | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.offer_persona_read import OfferPersonaRead

# TODO update the JSON string below
json = "{}"
# create an instance of OfferPersonaRead from a JSON string
offer_persona_read_instance = OfferPersonaRead.from_json(json)
# print the JSON string representation of the object
print(OfferPersonaRead.to_json())

# convert the object into a dict
offer_persona_read_dict = offer_persona_read_instance.to_dict()
# create an instance of OfferPersonaRead from a dict
offer_persona_read_from_dict = OfferPersonaRead.from_dict(offer_persona_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


