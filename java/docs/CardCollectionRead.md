

# CardCollectionRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**primaryAccountNumber** | **String** |  |  [optional] |
|**expireAt** | **OffsetDateTime** |  |  |
|**currency** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**brand** | [**BrandEnum**](#BrandEnum) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**metadata** | [**List&lt;CardMetadataCollectionRead&gt;**](CardMetadataCollectionRead.md) |  |  [optional] |
|**providerName** | **String** |  |  [optional] |
|**providerCreatedAt** | **OffsetDateTime** |  |  [optional] |
|**providerUpdatedAt** | **OffsetDateTime** |  |  [optional] |
|**iri** | **String** |  |  [optional] [readonly] |
|**processorStatus** | [**ProcessorStatusEnum**](#ProcessorStatusEnum) | Automagically infer on what state the entity is at the Payment Processor. |  [optional] [readonly] |



## Enum: BrandEnum

| Name | Value |
|---- | -----|
| CB | &quot;CB&quot; |
| VISA | &quot;VISA&quot; |
| MASTERCARD | &quot;MASTERCARD&quot; |
| AMEX | &quot;AMEX&quot; |
| MAESTRO | &quot;MAESTRO&quot; |
| BCMC | &quot;BCMC&quot; |
| JCB | &quot;JCB&quot; |
| DISCOVER | &quot;DISCOVER&quot; |



## Enum: ProcessorStatusEnum

| Name | Value |
|---- | -----|
| UNALLOCATED | &quot;unallocated&quot; |
| ALLOCATING | &quot;allocating&quot; |
| ALLOCATED | &quot;allocated&quot; |
| FREED | &quot;freed&quot; |
| OUTDATED | &quot;outdated&quot; |



