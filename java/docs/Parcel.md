

# Parcel



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**carrier** | [**CarrierEnum**](#CarrierEnum) |  |  |
|**identifier** | **String** |  |  |
|**price** | **BigDecimal** |  |  [optional] |
|**refundable** | **Boolean** |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**transaction** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |



## Enum: CarrierEnum

| Name | Value |
|---- | -----|
| SWISS_POST | &quot;SwissPost&quot; |
| MONDIAL_RELAY | &quot;MondialRelay&quot; |
| COLISSIMO | &quot;Colissimo&quot; |
| DHL | &quot;Dhl&quot; |
| CHRONOPOST | &quot;Chronopost&quot; |
| COLIS_PRIVE | &quot;ColisPrive&quot; |
| DPD | &quot;Dpd&quot; |
| UPS | &quot;Ups&quot; |
| FED_EX | &quot;FedEx&quot; |
| RELAIS_COLIS | &quot;RelaisColis&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| SHIPPED | &quot;SHIPPED&quot; |
| IN_TRANSIT | &quot;IN_TRANSIT&quot; |
| DELIVERED | &quot;DELIVERED&quot; |
| ERROR | &quot;ERROR&quot; |
| ACCEPTED | &quot;ACCEPTED&quot; |
| REFUSED | &quot;REFUSED&quot; |
| NULL | &quot;null&quot; |



