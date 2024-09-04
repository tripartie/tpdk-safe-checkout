

# TransactionRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ulid** | **String** |  |  |
|**offer** | [**TransactionOfferRead**](TransactionOfferRead.md) |  |  |
|**quote** | [**TransactionQuoteRead**](TransactionQuoteRead.md) |  |  |
|**buyerMessage** | **String** | Attach a note. Only the buyer can exercise this right. At the creation. |  [optional] |
|**buyer** | [**TransactionPersonaRead**](TransactionPersonaRead.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**fees** | **BigDecimal** |  |  [optional] |
|**supplementalFees** | **BigDecimal** |  |  [optional] |
|**card** | [**TransactionCardRead**](TransactionCardRead.md) |  |  [optional] |
|**escrow** | [**TransactionWalletRead**](TransactionWalletRead.md) |  |  [optional] |
|**remotePreAuthorizationId** | **String** |  |  [optional] |
|**remotePayInId** | **String** |  |  [optional] |
|**balanceToRefund** | **BigDecimal** |  |  [optional] |
|**feesToRefund** | **BigDecimal** |  |  [optional] |
|**forceRefundShipping** | **Boolean** | Shipping is never refunded on purpose. Once deposited (parcel), we are billed for it. |  [optional] |
|**review** | **String** |  |  [optional] |
|**rating** | **Integer** |  |  [optional] |
|**handOverCode** | **String** |  |  [optional] |
|**parcels** | [**List&lt;TransactionParcelRead&gt;**](TransactionParcelRead.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**providerName** | **String** |  |  [optional] |
|**providerCreatedAt** | **OffsetDateTime** |  |  [optional] |
|**providerUpdatedAt** | **OffsetDateTime** |  |  [optional] |
|**total** | **BigDecimal** |  |  [optional] [readonly] |
|**totalCharged** | **BigDecimal** |  |  [optional] [readonly] |
|**totalFees** | **BigDecimal** |  |  [optional] [readonly] |
|**awaitedParty** | [**AwaitedPartyEnum**](#AwaitedPartyEnum) | Determine who is awaited (actor) for the next transition |  [optional] [readonly] |
|**statusExpiration** | **OffsetDateTime** | Yield if eligible the date-time at which the transaction state expire. |  [optional] [readonly] |
|**processorStatus** | [**ProcessorStatusEnum**](#ProcessorStatusEnum) | Automagically infer on what state the entity is at the Payment Processor. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| AUTHORIZED | &quot;AUTHORIZED&quot; |
| REFUSED | &quot;REFUSED&quot; |
| ACCEPTED | &quot;ACCEPTED&quot; |
| SHIPPED | &quot;SHIPPED&quot; |
| IN_TRANSIT | &quot;IN_TRANSIT&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| DELIVERED | &quot;DELIVERED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| DISPUTED | &quot;DISPUTED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| NULL | &quot;null&quot; |



## Enum: AwaitedPartyEnum

| Name | Value |
|---- | -----|
| BUYER | &quot;BUYER&quot; |
| PLATFORM | &quot;PLATFORM&quot; |
| SELLER | &quot;SELLER&quot; |



## Enum: ProcessorStatusEnum

| Name | Value |
|---- | -----|
| UNALLOCATED | &quot;unallocated&quot; |
| ALLOCATING | &quot;allocating&quot; |
| ALLOCATED | &quot;allocated&quot; |
| FREED | &quot;freed&quot; |
| OUTDATED | &quot;outdated&quot; |



