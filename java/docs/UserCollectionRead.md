

# UserCollectionRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**mainAddress** | [**UserAddressCollectionRead**](UserAddressCollectionRead.md) |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**publicName** | **String** |  |  [optional] |
|**roleInCompany** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) |  |  |
|**totpEnabled** | **Boolean** |  |  [optional] |
|**intlPhoneNumber** | **String** |  |  [optional] |
|**lastSuccessfulLogIn** | **OffsetDateTime** |  |  [optional] |
|**avatar** | [**UserMediaCollectionRead**](UserMediaCollectionRead.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**timeZoneOffset** | **Integer** | Timezone offset. Expressed in minutes. Used for DT conversion and fraud prevention. |  [optional] |
|**organization** | [**UserOrganizationCollectionRead**](UserOrganizationCollectionRead.md) |  |  [optional] |
|**wallet** | [**UserWalletCollectionRead**](UserWalletCollectionRead.md) |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**providerName** | **String** |  |  [optional] |
|**providerCreatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**providerUpdatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**iri** | **String** |  |  [optional] [readonly] |
|**secondAuthFactor** | **Boolean** |  |  [optional] [readonly] |
|**processorStatus** | [**ProcessorStatusEnum**](#ProcessorStatusEnum) | Automagically infer on what state the entity is at the Payment Processor. |  [optional] [readonly] |



## Enum: List&lt;RolesEnum&gt;

| Name | Value |
|---- | -----|
| ORGANIZATION_OWNER | &quot;ROLE_ORGANIZATION_OWNER&quot; |
| ADMIN | &quot;ROLE_ADMIN&quot; |
| CONSULTANT | &quot;ROLE_CONSULTANT&quot; |
| ACCOUNTING_MANAGER | &quot;ROLE_ACCOUNTING_MANAGER&quot; |
| BILLING_MANAGER | &quot;ROLE_BILLING_MANAGER&quot; |
| CUSTOMER_SERVICE | &quot;ROLE_CUSTOMER_SERVICE&quot; |
| PLATFORM_SUPPORT | &quot;ROLE_PLATFORM_SUPPORT&quot; |
| PLATFORM_ADMIN | &quot;ROLE_PLATFORM_ADMIN&quot; |
| USER | &quot;ROLE_USER&quot; |



## Enum: ProcessorStatusEnum

| Name | Value |
|---- | -----|
| UNALLOCATED | &quot;unallocated&quot; |
| ALLOCATING | &quot;allocating&quot; |
| ALLOCATED | &quot;allocated&quot; |
| FREED | &quot;freed&quot; |
| OUTDATED | &quot;outdated&quot; |



