

# TransactionUpdate



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**supplementalFees** | **BigDecimal** | usually set if the weight was underestimated and shipping carrier billed us an extra. |  [optional] |
|**balanceToRefund** | **BigDecimal** |  |  [optional] |
|**feesToRefund** | **BigDecimal** |  |  [optional] |
|**forceRefundShipping** | **Boolean** | Shipping is never refunded on purpose. Once deposited (parcel), we are billed for it. |  [optional] |
|**buyerReview** | **String** |  |  [optional] |
|**buyerRating** | **Integer** |  |  [optional] |
|**sellerReview** | **String** |  |  [optional] |
|**sellerRating** | **Integer** |  |  [optional] |
|**handOverCodeConfirmation** | **String** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**review** | **String** |  |  [optional] [readonly] |
|**rating** | **Integer** |  |  [optional] [readonly] |



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



