

# ProofOfIdentityCollectionRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**originalFilename** | **String** |  |  [optional] |
|**extension** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**providerName** | **String** |  |  [optional] |
|**providerCreatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**providerUpdatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**processorStatus** | [**ProcessorStatusEnum**](#ProcessorStatusEnum) | Automagically infer on what state the entity is at the Payment Processor. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFTED | &quot;drafted&quot; |
| UPLOADED | &quot;uploaded&quot; |
| SUBMITTED | &quot;submitted&quot; |
| ACCEPTED | &quot;accepted&quot; |
| REFUSED | &quot;refused&quot; |



## Enum: ProcessorStatusEnum

| Name | Value |
|---- | -----|
| UNALLOCATED | &quot;unallocated&quot; |
| ALLOCATING | &quot;allocating&quot; |
| ALLOCATED | &quot;allocated&quot; |
| FREED | &quot;freed&quot; |
| OUTDATED | &quot;outdated&quot; |



