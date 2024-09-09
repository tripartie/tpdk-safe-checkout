# TransactionOfferRead



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ulid** | **str** |  | 
**status** | **str** |  | 
**public_url** | **str** | The public URL for your Ad/Offer on your marketplace. | [optional] 
**redirect_url** | **str** | Fill-in that field IF you intend to redirect your customer instead of using a WebView. | [optional] 
**organization** | [**TransactionOrganizationRead**](TransactionOrganizationRead.md) |  | [optional] 
**seller** | [**TransactionPersonaRead**](TransactionPersonaRead.md) |  | 
**preset_buyer** | [**TransactionPersonaRead**](TransactionPersonaRead.md) |  | [optional] 
**nature** | **str** | This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information. | [optional] [default to 'physical_item']
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**unit_price** | **float** |  | [optional] 
**currency_code** | **str** |  | [optional] [default to 'EUR']
**item_count** | **int** |  | [optional] [default to 1]
**condition** | **str** |  | [optional] [default to 'USED']
**weight_in_gram** | **int** | Accepted values between 500g (0.5kg) and 10,000g (10kg). | [optional] 
**shipping_allowed** | **bool** | That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined. | [optional] 
**hand_delivery_allowed** | **bool** | Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product. | [optional] [default to True]
**shipping_carriers** | **List[str]** | If you wish to enable automated shipping label generation through a specific provider, specify it there. | [optional] 
**ean_code** | **str** |  | [optional] 
**can_be_sold_separately** | **bool** | Set this flag to false to forbid a potential buyer to acquire less than \&quot;itemCount\&quot; item(s) | [optional] [default to True]
**metadata** | [**List[TransactionMetadataRead]**](TransactionMetadataRead.md) |  | [optional] 
**medias** | [**List[TransactionMediaRead]**](TransactionMediaRead.md) |  | 
**created_at** | **datetime** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.transaction_offer_read import TransactionOfferRead

# TODO update the JSON string below
json = "{}"
# create an instance of TransactionOfferRead from a JSON string
transaction_offer_read_instance = TransactionOfferRead.from_json(json)
# print the JSON string representation of the object
print(TransactionOfferRead.to_json())

# convert the object into a dict
transaction_offer_read_dict = transaction_offer_read_instance.to_dict()
# create an instance of TransactionOfferRead from a dict
transaction_offer_read_from_dict = TransactionOfferRead.from_dict(transaction_offer_read_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


