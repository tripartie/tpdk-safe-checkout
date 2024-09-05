

# TransactionOfferCollectionRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ulid** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**publicUrl** | **String** | The public URL for your Ad/Offer on your marketplace. |  [optional] |
|**organization** | [**TransactionOrganizationCollectionRead**](TransactionOrganizationCollectionRead.md) |  |  [optional] |
|**seller** | [**TransactionPersonaCollectionRead**](TransactionPersonaCollectionRead.md) |  |  |
|**presetBuyer** | [**TransactionPersonaCollectionRead**](TransactionPersonaCollectionRead.md) |  |  [optional] |
|**nature** | [**NatureEnum**](#NatureEnum) | This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information. |  |
|**title** | **String** |  |  [optional] |
|**unitPrice** | **Float** |  |  [optional] |
|**minNegotiableUnitPrice** | **Float** |  |  [optional] |
|**allowToNegotiateUnitPrice** | **Boolean** |  |  [optional] |
|**currencyCode** | **String** |  |  |
|**itemCount** | **Integer** |  |  [optional] |
|**condition** | [**ConditionEnum**](#ConditionEnum) |  |  [optional] |
|**medias** | [**List&lt;TransactionMediaCollectionRead&gt;**](TransactionMediaCollectionRead.md) |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |



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



