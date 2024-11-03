

# WebhookSubscriptionRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**event** | [**EventEnum**](#EventEnum) |  |  [optional] |
|**callbackUrl** | **String** |  |  [optional] |
|**webhookSecret** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: EventEnum

| Name | Value |
|---- | -----|
| OFFER_TRANSACTION_AUTHORIZED | &quot;offer.transaction.authorized&quot; |
| OFFER_TRANSACTION_ACCEPTED | &quot;offer.transaction.accepted&quot; |
| OFFER_TRANSACTION_SHIPPED | &quot;offer.transaction.shipped&quot; |
| OFFER_TRANSACTION_DELIVERED | &quot;offer.transaction.delivered&quot; |
| OFFER_TRANSACTION_COMPLETED | &quot;offer.transaction.completed&quot; |
| OFFER_TRANSACTION_CANCELED | &quot;offer.transaction.canceled&quot; |
| OFFER_TRANSACTION_DISPUTED | &quot;offer.transaction.disputed&quot; |
| OFFER_CLOSED | &quot;offer.closed&quot; |
| PERSONA_ADDED | &quot;persona.added&quot; |



