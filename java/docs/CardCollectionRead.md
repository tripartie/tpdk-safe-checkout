

# CardCollectionRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**primaryAccountNumber** | **String** |  |  [optional] |
|**expireAt** | **OffsetDateTime** |  |  |
|**currency** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**brand** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**metadata** | [**List&lt;CardMetadataCollectionRead&gt;**](CardMetadataCollectionRead.md) |  |  [optional] |
|**providerName** | **String** |  |  [optional] |
|**providerCreatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**providerUpdatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**iri** | **String** |  |  [optional] [readonly] |
|**processorStatus** | [**ProcessorStatusEnum**](#ProcessorStatusEnum) | Automagically infer on what state the entity is at the Payment Processor. |  [optional] [readonly] |



## Enum: ProcessorStatusEnum

| Name | Value |
|---- | -----|
| UNALLOCATED | &quot;unallocated&quot; |
| ALLOCATING | &quot;allocating&quot; |
| ALLOCATED | &quot;allocated&quot; |
| FREED | &quot;freed&quot; |
| OUTDATED | &quot;outdated&quot; |


