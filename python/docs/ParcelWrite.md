# ParcelWrite



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**carrier** | **str** |  | [optional] 
**identifier** | **str** |  | [optional] 
**price** | **float** |  | [optional] 
**refundable** | **bool** |  | 
**currency** | **str** |  | [optional] [default to 'EUR']

## Example

```python
from tpdk_safe_checkout.models.parcel_write import ParcelWrite

# TODO update the JSON string below
json = "{}"
# create an instance of ParcelWrite from a JSON string
parcel_write_instance = ParcelWrite.from_json(json)
# print the JSON string representation of the object
print(ParcelWrite.to_json())

# convert the object into a dict
parcel_write_dict = parcel_write_instance.to_dict()
# create an instance of ParcelWrite from a dict
parcel_write_from_dict = ParcelWrite.from_dict(parcel_write_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


