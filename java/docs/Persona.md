

# Persona



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**organization** | **String** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**dateOfBirth** | **LocalDate** |  |  [optional] |
|**language** | **String** | That data is used for rendering the frontend application with given language. If not set, will be inferred. Custom codes can be issued for specific requirements. |  [optional] |
|**email** | **String** |  |  [optional] |
|**mobilePhoneNumber** | **String** |  |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**metadata** | [**List&lt;Metadata&gt;**](Metadata.md) | You can assign different meta to your Persona object for different purposes. eg. Ease searching. |  [optional] |
|**offers** | **List&lt;String&gt;** |  |  |
|**purchases** | **List&lt;String&gt;** |  |  |
|**views** | [**List&lt;View&gt;**](View.md) |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**ownedBy** | **String** |  |  [optional] |
|**offerCount** | **Integer** | Issued Offers count owned by a given Persona |  [optional] [readonly] |
|**purchaseCount** | **Integer** |  |  [optional] [readonly] |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| MALE | &quot;MALE&quot; |
| FEMALE | &quot;FEMALE&quot; |
| OTHER | &quot;OTHER&quot; |
| RATHER_NOT_SAY | &quot;RATHER_NOT_SAY&quot; |



