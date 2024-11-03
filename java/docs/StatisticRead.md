

# StatisticRead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**request** | [**Set&lt;RequestEnum&gt;**](#Set&lt;RequestEnum&gt;) |  |  |
|**focusOn** | **String** |  |  [optional] |
|**focusType** | [**FocusTypeEnum**](#FocusTypeEnum) |  |  [optional] |
|**startAt** | **OffsetDateTime** |  |  [optional] |
|**endAt** | **OffsetDateTime** |  |  [optional] |
|**groupByPeriod** | [**GroupByPeriodEnum**](#GroupByPeriodEnum) |  |  [optional] |
|**data** | [**List&lt;StatisticReadDataInner&gt;**](StatisticReadDataInner.md) |  |  [optional] |



## Enum: Set&lt;RequestEnum&gt;

| Name | Value |
|---- | -----|
| FINALIZED_CASHOUT_AMOUNT | &quot;FINALIZED_CASHOUT_AMOUNT&quot; |
| FINALIZED_CASHOUT_COUNT | &quot;FINALIZED_CASHOUT_COUNT&quot; |
| PENDING_CASHOUT_AMOUNT | &quot;PENDING_CASHOUT_AMOUNT&quot; |
| PENDING_CASHOUT_COUNT | &quot;PENDING_CASHOUT_COUNT&quot; |
| OFFER_PUBLISHED_AMOUNT | &quot;OFFER_PUBLISHED_AMOUNT&quot; |
| OFFER_PUBLISHED_COUNT | &quot;OFFER_PUBLISHED_COUNT&quot; |
| TRANSACTION_ACCEPTED_PROPOSAL_AMOUNT | &quot;TRANSACTION_ACCEPTED_PROPOSAL_AMOUNT&quot; |
| TRANSACTION_ACCEPTED_PROPOSAL_COUNT | &quot;TRANSACTION_ACCEPTED_PROPOSAL_COUNT&quot; |
| TRANSACTION_ACCEPTED_PROPOSAL_SERVICE_FEE | &quot;TRANSACTION_ACCEPTED_PROPOSAL_SERVICE_FEE&quot; |
| TRANSACTION_ACCEPTED_PROPOSAL_SHIPPING_FEE | &quot;TRANSACTION_ACCEPTED_PROPOSAL_SHIPPING_FEE&quot; |
| TRANSACTION_COMPLETED_AMOUNT | &quot;TRANSACTION_COMPLETED_AMOUNT&quot; |
| TRANSACTION_COMPLETED_COUNT | &quot;TRANSACTION_COMPLETED_COUNT&quot; |
| TRANSACTION_COMPLETED_SERVICE_FEE | &quot;TRANSACTION_COMPLETED_SERVICE_FEE&quot; |
| TRANSACTION_COMPLETED_SHIPPING_FEE | &quot;TRANSACTION_COMPLETED_SHIPPING_FEE&quot; |
| TRANSACTION_CREATED_AMOUNT | &quot;TRANSACTION_CREATED_AMOUNT&quot; |
| TRANSACTION_CREATED_COUNT | &quot;TRANSACTION_CREATED_COUNT&quot; |
| WALLET_AVAILABLE_AMOUNT | &quot;WALLET_AVAILABLE_AMOUNT&quot; |
| WALLET_IN_CUSTODY_AMOUNT | &quot;WALLET_IN_CUSTODY_AMOUNT&quot; |



## Enum: FocusTypeEnum

| Name | Value |
|---- | -----|
| ORGANIZATION | &quot;Organization&quot; |
| USER | &quot;User&quot; |
| PERSONA | &quot;Persona&quot; |



## Enum: GroupByPeriodEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;DAILY&quot; |
| WEEKLY | &quot;WEEKLY&quot; |
| MONTHLY | &quot;MONTHLY&quot; |
| QUARTERLY | &quot;QUARTERLY&quot; |
| YEARLY | &quot;YEARLY&quot; |



