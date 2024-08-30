

# CashoutCashOutCollectionRead



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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| SUBMITTED | &quot;submitted&quot; |
| REFUSED | &quot;refused&quot; |
| BLOCKED | &quot;blocked&quot; |
| ACCEPTED | &quot;accepted&quot; |



