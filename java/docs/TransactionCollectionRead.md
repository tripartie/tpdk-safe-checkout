

# TransactionCollectionRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ulid** | **String** |  |  |
|**offer** | [**TransactionOfferCollectionRead**](TransactionOfferCollectionRead.md) |  |  |
|**quote** | [**TransactionQuoteCollectionRead**](TransactionQuoteCollectionRead.md) |  |  |
|**buyer** | [**TransactionPersonaCollectionRead**](TransactionPersonaCollectionRead.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**fees** | **BigDecimal** |  |  [optional] |
|**supplementalFees** | **BigDecimal** |  |  [optional] |
|**total** | **BigDecimal** |  |  [optional] [readonly] |
|**totalCharged** | **BigDecimal** |  |  [optional] [readonly] |
|**totalFees** | **BigDecimal** |  |  [optional] [readonly] |
|**awaitedParty** | [**AwaitedPartyEnum**](#AwaitedPartyEnum) | Determine who is awaited (actor) for the next transition |  [optional] [readonly] |
|**statusExpiration** | **OffsetDateTime** | Yield if eligible the date-time at which the transaction state expire. |  [optional] [readonly] |



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



