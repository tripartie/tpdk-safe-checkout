

# ProofOfIdentityCollectionRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**originalFilename** | **String** |  |  [optional] |
|**extension** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**providerName** | **String** |  |  [optional] |
|**providerCreatedAt** | **OffsetDateTime** |  |  [optional] |
|**providerUpdatedAt** | **OffsetDateTime** |  |  [optional] |
|**processorStatus** | [**ProcessorStatusEnum**](#ProcessorStatusEnum) | Automagically infer on what state the entity is at the Payment Processor. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFTED | &quot;drafted&quot; |
| UPLOADED | &quot;uploaded&quot; |
| SUBMITTED | &quot;submitted&quot; |
| ACCEPTED | &quot;accepted&quot; |
| REFUSED | &quot;refused&quot; |
| BLOCKED | &quot;blocked&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NATIONAL_ID | &quot;national_id&quot; |
| PASSPORT | &quot;passport&quot; |



## Enum: ProcessorStatusEnum

| Name | Value |
|---- | -----|
| UNALLOCATED | &quot;unallocated&quot; |
| ALLOCATING | &quot;allocating&quot; |
| ALLOCATED | &quot;allocated&quot; |
| FREED | &quot;freed&quot; |
| OUTDATED | &quot;outdated&quot; |



