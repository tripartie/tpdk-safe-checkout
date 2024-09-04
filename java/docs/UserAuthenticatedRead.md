

# UserAuthenticatedRead



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**mainAddress** | [**UserAddressAuthenticatedRead**](UserAddressAuthenticatedRead.md) |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**publicName** | **String** |  |  [optional] |
|**roleInCompany** | **String** |  |  [optional] |
|**birthday** | **OffsetDateTime** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**roles** | [**List&lt;RolesEnum&gt;**](#List&lt;RolesEnum&gt;) |  |  |
|**totpEnabled** | **Boolean** |  |  [optional] |
|**intlPhoneNumber** | **String** |  |  [optional] |
|**originCountry** | **String** | The nationality of the current user. |  [optional] |
|**homeCountry** | **String** | The originating country |  [optional] |
|**preferredLanguage** | **String** |  |  [optional] |
|**lastSuccessfulLogIn** | **OffsetDateTime** |  |  [optional] |
|**avatar** | [**UserMediaAuthenticatedRead**](UserMediaAuthenticatedRead.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**consentMailAds** | **Boolean** |  |  |
|**lockdown** | **Boolean** |  |  |
|**timeZoneOffset** | **Integer** | Timezone offset. Expressed in minutes. Used for DT conversion and fraud prevention. |  [optional] |
|**organization** | [**UserOrganizationAuthenticatedRead**](UserOrganizationAuthenticatedRead.md) |  |  [optional] |
|**bankAccount** | [**UserBankAccountAuthenticatedRead**](UserBankAccountAuthenticatedRead.md) |  |  [optional] |
|**identityVerifiedAt** | **OffsetDateTime** |  |  [optional] |
|**profiles** | [**List&lt;UserPersonaAuthenticatedRead&gt;**](UserPersonaAuthenticatedRead.md) |  |  |
|**cards** | [**List&lt;UserCardAuthenticatedRead&gt;**](UserCardAuthenticatedRead.md) |  |  [optional] |
|**wallet** | [**UserWalletAuthenticatedRead**](UserWalletAuthenticatedRead.md) |  |  [optional] |
|**providerName** | **String** |  |  [optional] |
|**providerCreatedAt** | **OffsetDateTime** |  |  [optional] |
|**providerUpdatedAt** | **OffsetDateTime** |  |  [optional] |
|**iri** | **String** |  |  [optional] [readonly] |
|**impersonatingOrganization** | **Boolean** |  |  [optional] [readonly] |
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



