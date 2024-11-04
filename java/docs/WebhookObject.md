

# WebhookObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ulid** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**publicUrl** | **String** | The public URL for your Ad/Offer on your marketplace. |  [optional] |
|**redirectUrl** | **String** | Fill-in that field IF you intend to redirect your customer instead of using a WebView. |  [optional] |
|**url** | **URI** |  |  [readonly] |
|**organization** | [**OfferOrganizationRead**](OfferOrganizationRead.md) |  |  [optional] |
|**seller** | [**OfferPersonaRead**](OfferPersonaRead.md) |  |  |
|**presetBuyer** | [**OfferPersonaRead**](OfferPersonaRead.md) |  |  [optional] |
|**nature** | [**NatureEnum**](#NatureEnum) | This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information. |  [optional] |
|**title** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**unitPrice** | **Float** |  |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**itemCount** | **Integer** |  |  [optional] |
|**condition** | [**ConditionEnum**](#ConditionEnum) |  |  [optional] |
|**weightInGram** | **Integer** | Accepted values between 500g (0.5kg) and 10,000g (10kg). |  [optional] |
|**shippingAllowed** | **Boolean** | That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined. |  [optional] |
|**handDeliveryAllowed** | **Boolean** | Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product. |  [optional] |
|**shippingCarriers** | [**List&lt;ShippingCarriersEnum&gt;**](#List&lt;ShippingCarriersEnum&gt;) | If you wish to enable automated shipping label generation through a specific provider, specify it there. |  [optional] |
|**eanCode** | **String** |  |  [optional] |
|**canBeSoldSeparately** | **Boolean** | Set this flag to false to forbid a potential buyer to acquire less than \&quot;itemCount\&quot; item(s) |  [optional] |
|**medias** | [**List&lt;OfferMediaRead&gt;**](OfferMediaRead.md) |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**iri** | **String** |  |  [optional] [readonly] |
|**id** | **Integer** |  |  [optional] [readonly] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**dateOfBirth** | **Object** |  |  [optional] |
|**language** | **String** | That data is used for rendering the frontend application with given language. If not set, will be inferred. Custom codes can be issued for specific requirements. |  [optional] |
|**email** | **String** |  |  [optional] |
|**mobilePhoneNumber** | **String** |  |  [optional] |
|**address** | [**PersonaAddressRead**](PersonaAddressRead.md) |  |  [optional] |
|**metadata** | [**List&lt;PersonaMetadataRead&gt;**](PersonaMetadataRead.md) | You can assign different meta to your Persona object for different purposes. eg. Ease searching. |  [optional] |
|**offerCount** | **Integer** | Issued Offers count owned by a given Persona |  [optional] [readonly] |
|**purchaseCount** | **Integer** |  |  [optional] [readonly] |
|**registered** | **Boolean** | Determine if the Persona have a Tripartie account |  [optional] [readonly] |
|**verified** | **Boolean** | Determine if the Persona have a VERIFIED Tripartie account |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ISSUED | &quot;issued&quot; |
| ACTIVE | &quot;active&quot; |
| FULFILLED | &quot;fulfilled&quot; |
| EXPIRED | &quot;expired&quot; |



## Enum: NatureEnum

| Name | Value |
|---- | -----|
| SERVICE | &quot;service&quot; |
| PHYSICAL_ITEM | &quot;physical_item&quot; |
| DEMATERIALIZED_ITEM | &quot;dematerialized_item&quot; |
| RENT_ITEM | &quot;rent_item&quot; |



## Enum: ConditionEnum

| Name | Value |
|---- | -----|
| NEW | &quot;NEW&quot; |
| USED | &quot;USED&quot; |
| DAMAGED | &quot;DAMAGED&quot; |
| DETERIORATED | &quot;DETERIORATED&quot; |
| UNRECOVERABLE | &quot;UNRECOVERABLE&quot; |



## Enum: List&lt;ShippingCarriersEnum&gt;

| Name | Value |
|---- | -----|
| SWISS_POST | &quot;SwissPost&quot; |
| COLISSIMO | &quot;Colissimo&quot; |
| MONDIAL_RELAY | &quot;MondialRelay&quot; |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| MALE | &quot;MALE&quot; |
| FEMALE | &quot;FEMALE&quot; |
| OTHER | &quot;OTHER&quot; |
| RATHER_NOT_SAY | &quot;RATHER_NOT_SAY&quot; |



