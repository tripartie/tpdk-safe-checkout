

# CashoutCashOutRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**amount** | **Float** |  |  [optional] |
|**currency** | **String** |  |  |
|**iban** | **String** |  |  |
|**bic** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**confirmedAt** | **OffsetDateTime** |  |  |
|**providerName** | **String** |  |  [optional] |
|**providerCreatedAt** | **OffsetDateTime** |  |  [optional] |
|**providerUpdatedAt** | **OffsetDateTime** |  |  [optional] |
|**processorStatus** | [**ProcessorStatusEnum**](#ProcessorStatusEnum) | Automagically infer on what state the entity is at the Payment Processor. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| SUBMITTED | &quot;submitted&quot; |
| REFUSED | &quot;refused&quot; |
| BLOCKED | &quot;blocked&quot; |
| ACCEPTED | &quot;accepted&quot; |



## Enum: ProcessorStatusEnum

| Name | Value |
|---- | -----|
| UNALLOCATED | &quot;unallocated&quot; |
| ALLOCATING | &quot;allocating&quot; |
| ALLOCATED | &quot;allocated&quot; |
| FREED | &quot;freed&quot; |
| OUTDATED | &quot;outdated&quot; |



