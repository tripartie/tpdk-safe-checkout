# WebhookObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ulid** | **str** |  | 
**status** | **str** |  | 
**public_url** | **str** | The public URL for your Ad/Offer on your marketplace. | [optional] 
**redirect_url** | **str** | Fill-in that field IF you intend to redirect your customer instead of using a WebView. | [optional] 
**url** | **str** |  | [readonly] 
**organization** | [**OfferOrganizationRead**](OfferOrganizationRead.md) |  | [optional] 
**seller** | [**OfferPersonaRead**](OfferPersonaRead.md) |  | 
**preset_buyer** | [**OfferPersonaRead**](OfferPersonaRead.md) |  | [optional] 
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
**medias** | [**List[OfferMediaRead]**](OfferMediaRead.md) |  | 
**created_at** | **datetime** |  | [optional] [readonly] 
**updated_at** | **datetime** |  | [optional] [readonly] 
**iri** | **str** |  | [optional] [readonly] 
**id** | **int** |  | [optional] [readonly] 
**first_name** | **str** |  | [optional] 
**last_name** | **str** |  | [optional] 
**gender** | **str** |  | [optional] [default to 'RATHER_NOT_SAY']
**date_of_birth** | **object** |  | [optional] 
**language** | **str** | That data is used for rendering the frontend application with given language. If not set, will be inferred. Custom codes can be issued for specific requirements. | [optional] 
**email** | **str** |  | [optional] 
**mobile_phone_number** | **str** |  | [optional] 
**address** | [**PersonaAddressRead**](PersonaAddressRead.md) |  | [optional] 
**metadata** | [**List[PersonaMetadataRead]**](PersonaMetadataRead.md) | You can assign different meta to your Persona object for different purposes. eg. Ease searching. | [optional] 
**offer_count** | **int** | Issued Offers count owned by a given Persona | [optional] [readonly] 
**purchase_count** | **int** |  | [optional] [readonly] 
**registered** | **bool** | Determine if the Persona have a Tripartie account | [optional] [readonly] 
**verified** | **bool** | Determine if the Persona have a VERIFIED Tripartie account | [optional] [readonly] 

## Example

```python
from tpdk_safe_checkout.models.webhook_object import WebhookObject

# TODO update the JSON string below
json = "{}"
# create an instance of WebhookObject from a JSON string
webhook_object_instance = WebhookObject.from_json(json)
# print the JSON string representation of the object
print(WebhookObject.to_json())

# convert the object into a dict
webhook_object_dict = webhook_object_instance.to_dict()
# create an instance of WebhookObject from a dict
webhook_object_from_dict = WebhookObject.from_dict(webhook_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


