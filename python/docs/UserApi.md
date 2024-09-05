# tpdk_safe_checkout.UserApi

All URIs are relative to *https://staging-api.tripartie.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_bank_accounts_id_delete**](UserApi.md#api_bank_accounts_id_delete) | **DELETE** /bank-accounts/{id} | Removes the BankAccount resource.
[**api_bank_accounts_id_get**](UserApi.md#api_bank_accounts_id_get) | **GET** /bank-accounts/{id} | Retrieves a BankAccount resource.
[**api_bank_accounts_post**](UserApi.md#api_bank_accounts_post) | **POST** /bank-accounts | Creates a BankAccount resource.
[**api_cards_get_collection**](UserApi.md#api_cards_get_collection) | **GET** /cards | Retrieves the collection of Card resources.
[**api_cards_id_delete**](UserApi.md#api_cards_id_delete) | **DELETE** /cards/{id} | Removes the Card resource.
[**api_cards_id_get**](UserApi.md#api_cards_id_get) | **GET** /cards/{id} | Retrieves a Card resource.
[**api_cards_id_patch**](UserApi.md#api_cards_id_patch) | **PATCH** /cards/{id} | Push back the tokenization output from the external provider
[**api_cards_post**](UserApi.md#api_cards_post) | **POST** /cards | Creates a Card resource.
[**api_cash_outs_get_collection**](UserApi.md#api_cash_outs_get_collection) | **GET** /cash-outs | Retrieves the collection of CashOut resources.
[**api_cash_outs_id_get**](UserApi.md#api_cash_outs_id_get) | **GET** /cash-outs/{id} | Retrieves a CashOut resource.
[**api_cash_outs_post**](UserApi.md#api_cash_outs_post) | **POST** /cash-outs | Withdraw the full amount available in the user wallet to set bank account
[**api_me_get**](UserApi.md#api_me_get) | **GET** /me | Retrieves a User resource.
[**api_proof_of_identities_get_collection**](UserApi.md#api_proof_of_identities_get_collection) | **GET** /proof-of-identities | List all submitted PoI
[**api_proof_of_identities_id_get**](UserApi.md#api_proof_of_identities_id_get) | **GET** /proof-of-identities/{id} | Retrieve a specific PoI
[**api_proof_of_identities_iddocument_post**](UserApi.md#api_proof_of_identities_iddocument_post) | **POST** /proof-of-identities/{id}/document | Upload the document for your PoI slot
[**api_proof_of_identities_post**](UserApi.md#api_proof_of_identities_post) | **POST** /proof-of-identities | Submit a slot for a PoI
[**api_register_post**](UserApi.md#api_register_post) | **POST** /register | Customer onboarding
[**api_users_id_delete**](UserApi.md#api_users_id_delete) | **DELETE** /users/{id} | Removes the User resource.
[**api_users_id_patch**](UserApi.md#api_users_id_patch) | **PATCH** /users/{id} | Update your profile
[**api_users_idavatar_delete**](UserApi.md#api_users_idavatar_delete) | **DELETE** /users/{id}/avatar | Unset your personal avatar
[**api_users_idavatar_post**](UserApi.md#api_users_idavatar_post) | **POST** /users/{id}/avatar | Upload your personal avatar
[**api_users_idemail_patch**](UserApi.md#api_users_idemail_patch) | **PATCH** /users/{id}/email | Update user email
[**api_users_idemail_validation_patch**](UserApi.md#api_users_idemail_validation_patch) | **PATCH** /users/{id}/email-validation | Validate email ownership
[**api_users_idpassword_patch**](UserApi.md#api_users_idpassword_patch) | **PATCH** /users/{id}/password | Change your password
[**api_users_idtotp_setup_patch**](UserApi.md#api_users_idtotp_setup_patch) | **PATCH** /users/{id}/totp-setup | Setup an additional authentication factor
[**api_users_idtotp_toggle_patch**](UserApi.md#api_users_idtotp_toggle_patch) | **PATCH** /users/{id}/totp-toggle | Disable the second authentication factor
[**authentication_post**](UserApi.md#authentication_post) | **POST** /authentication | User authentication


# **api_bank_accounts_id_delete**
> api_bank_accounts_id_delete(id)

Removes the BankAccount resource.

Removes the BankAccount resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | BankAccount identifier

    try:
        # Removes the BankAccount resource.
        api_instance.api_bank_accounts_id_delete(id)
    except Exception as e:
        print("Exception when calling UserApi->api_bank_accounts_id_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| BankAccount identifier | 

### Return type

void (empty response body)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | BankAccount resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_bank_accounts_id_get**
> BankAccountRead api_bank_accounts_id_get(id)

Retrieves a BankAccount resource.

Retrieves a BankAccount resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.bank_account_read import BankAccountRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | BankAccount identifier

    try:
        # Retrieves a BankAccount resource.
        api_response = api_instance.api_bank_accounts_id_get(id)
        print("The response of UserApi->api_bank_accounts_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_bank_accounts_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| BankAccount identifier | 

### Return type

[**BankAccountRead**](BankAccountRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | BankAccount resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_bank_accounts_post**
> BankAccountRead api_bank_accounts_post(bank_account_write)

Creates a BankAccount resource.

Creates a BankAccount resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.bank_account_read import BankAccountRead
from tpdk_safe_checkout.models.bank_account_write import BankAccountWrite
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    bank_account_write = tpdk_safe_checkout.BankAccountWrite() # BankAccountWrite | The new BankAccount resource

    try:
        # Creates a BankAccount resource.
        api_response = api_instance.api_bank_accounts_post(bank_account_write)
        print("The response of UserApi->api_bank_accounts_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_bank_accounts_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_account_write** | [**BankAccountWrite**](BankAccountWrite.md)| The new BankAccount resource | 

### Return type

[**BankAccountRead**](BankAccountRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | BankAccount resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_cards_get_collection**
> List[CardCollectionRead] api_cards_get_collection(page=page)

Retrieves the collection of Card resources.

Retrieves the collection of Card resources.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.card_collection_read import CardCollectionRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    page = 1 # int | The collection page number (optional) (default to 1)

    try:
        # Retrieves the collection of Card resources.
        api_response = api_instance.api_cards_get_collection(page=page)
        print("The response of UserApi->api_cards_get_collection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_cards_get_collection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The collection page number | [optional] [default to 1]

### Return type

[**List[CardCollectionRead]**](CardCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Card collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_cards_id_delete**
> api_cards_id_delete(id)

Removes the Card resource.

Removes the Card resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | Card identifier

    try:
        # Removes the Card resource.
        api_instance.api_cards_id_delete(id)
    except Exception as e:
        print("Exception when calling UserApi->api_cards_id_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Card identifier | 

### Return type

void (empty response body)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Card resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_cards_id_get**
> CardRead api_cards_id_get(id)

Retrieves a Card resource.

Retrieves a Card resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.card_read import CardRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | Card identifier

    try:
        # Retrieves a Card resource.
        api_response = api_instance.api_cards_id_get(id)
        print("The response of UserApi->api_cards_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_cards_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Card identifier | 

### Return type

[**CardRead**](CardRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Card resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_cards_id_patch**
> CardRead api_cards_id_patch(id, card_update)

Push back the tokenization output from the external provider

Updates the Card resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.card_read import CardRead
from tpdk_safe_checkout.models.card_update import CardUpdate
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | Card identifier
    card_update = tpdk_safe_checkout.CardUpdate() # CardUpdate | The updated Card resource

    try:
        # Push back the tokenization output from the external provider
        api_response = api_instance.api_cards_id_patch(id, card_update)
        print("The response of UserApi->api_cards_id_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_cards_id_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Card identifier | 
 **card_update** | [**CardUpdate**](CardUpdate.md)| The updated Card resource | 

### Return type

[**CardRead**](CardRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Card resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_cards_post**
> CardRead api_cards_post(card_write)

Creates a Card resource.

Creates a Card resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.card_read import CardRead
from tpdk_safe_checkout.models.card_write import CardWrite
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    card_write = tpdk_safe_checkout.CardWrite() # CardWrite | The new Card resource

    try:
        # Creates a Card resource.
        api_response = api_instance.api_cards_post(card_write)
        print("The response of UserApi->api_cards_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_cards_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_write** | [**CardWrite**](CardWrite.md)| The new Card resource | 

### Return type

[**CardRead**](CardRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Card resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_cash_outs_get_collection**
> List[CashoutCashOutCollectionRead] api_cash_outs_get_collection(page=page)

Retrieves the collection of CashOut resources.

Retrieves the collection of CashOut resources.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.cashout_cash_out_collection_read import CashoutCashOutCollectionRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    page = 1 # int | The collection page number (optional) (default to 1)

    try:
        # Retrieves the collection of CashOut resources.
        api_response = api_instance.api_cash_outs_get_collection(page=page)
        print("The response of UserApi->api_cash_outs_get_collection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_cash_outs_get_collection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The collection page number | [optional] [default to 1]

### Return type

[**List[CashoutCashOutCollectionRead]**](CashoutCashOutCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | CashOut collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_cash_outs_id_get**
> CashoutCashOutRead api_cash_outs_id_get(id)

Retrieves a CashOut resource.

Retrieves a CashOut resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.cashout_cash_out_read import CashoutCashOutRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | CashOut identifier

    try:
        # Retrieves a CashOut resource.
        api_response = api_instance.api_cash_outs_id_get(id)
        print("The response of UserApi->api_cash_outs_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_cash_outs_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| CashOut identifier | 

### Return type

[**CashoutCashOutRead**](CashoutCashOutRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | CashOut resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_cash_outs_post**
> CashoutCashOutRead api_cash_outs_post(cashout_cash_out_write)

Withdraw the full amount available in the user wallet to set bank account

Creates a CashOut resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.cashout_cash_out_read import CashoutCashOutRead
from tpdk_safe_checkout.models.cashout_cash_out_write import CashoutCashOutWrite
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    cashout_cash_out_write = tpdk_safe_checkout.CashoutCashOutWrite() # CashoutCashOutWrite | The new CashOut resource

    try:
        # Withdraw the full amount available in the user wallet to set bank account
        api_response = api_instance.api_cash_outs_post(cashout_cash_out_write)
        print("The response of UserApi->api_cash_outs_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_cash_outs_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cashout_cash_out_write** | [**CashoutCashOutWrite**](CashoutCashOutWrite.md)| The new CashOut resource | 

### Return type

[**CashoutCashOutRead**](CashoutCashOutRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | CashOut resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_me_get**
> UserAuthenticatedRead api_me_get()

Retrieves a User resource.

Retrieves a User resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_authenticated_read import UserAuthenticatedRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)

    try:
        # Retrieves a User resource.
        api_response = api_instance.api_me_get()
        print("The response of UserApi->api_me_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_me_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**UserAuthenticatedRead**](UserAuthenticatedRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_proof_of_identities_get_collection**
> List[ProofOfIdentityCollectionRead] api_proof_of_identities_get_collection(page=page)

List all submitted PoI

Retrieves the collection of ProofOfIdentity resources.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.proof_of_identity_collection_read import ProofOfIdentityCollectionRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    page = 1 # int | The collection page number (optional) (default to 1)

    try:
        # List all submitted PoI
        api_response = api_instance.api_proof_of_identities_get_collection(page=page)
        print("The response of UserApi->api_proof_of_identities_get_collection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_proof_of_identities_get_collection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The collection page number | [optional] [default to 1]

### Return type

[**List[ProofOfIdentityCollectionRead]**](ProofOfIdentityCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ProofOfIdentity collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_proof_of_identities_id_get**
> ProofOfIdentityRead api_proof_of_identities_id_get(id)

Retrieve a specific PoI

Retrieves a ProofOfIdentity resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.proof_of_identity_read import ProofOfIdentityRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | ProofOfIdentity identifier

    try:
        # Retrieve a specific PoI
        api_response = api_instance.api_proof_of_identities_id_get(id)
        print("The response of UserApi->api_proof_of_identities_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_proof_of_identities_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ProofOfIdentity identifier | 

### Return type

[**ProofOfIdentityRead**](ProofOfIdentityRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ProofOfIdentity resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_proof_of_identities_iddocument_post**
> ProofOfIdentityRead api_proof_of_identities_iddocument_post(id, file=file)

Upload the document for your PoI slot

Creates a ProofOfIdentity resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.proof_of_identity_read import ProofOfIdentityRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 3.4 # float | 
    file = None # bytearray |  (optional)

    try:
        # Upload the document for your PoI slot
        api_response = api_instance.api_proof_of_identities_iddocument_post(id, file=file)
        print("The response of UserApi->api_proof_of_identities_iddocument_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_proof_of_identities_iddocument_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **float**|  | 
 **file** | **bytearray**|  | [optional] 

### Return type

[**ProofOfIdentityRead**](ProofOfIdentityRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | ProofOfIdentity resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_proof_of_identities_post**
> ProofOfIdentityRead api_proof_of_identities_post(proof_of_identity_write)

Submit a slot for a PoI

Creates a ProofOfIdentity resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.proof_of_identity_read import ProofOfIdentityRead
from tpdk_safe_checkout.models.proof_of_identity_write import ProofOfIdentityWrite
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    proof_of_identity_write = tpdk_safe_checkout.ProofOfIdentityWrite() # ProofOfIdentityWrite | The new ProofOfIdentity resource

    try:
        # Submit a slot for a PoI
        api_response = api_instance.api_proof_of_identities_post(proof_of_identity_write)
        print("The response of UserApi->api_proof_of_identities_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_proof_of_identities_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proof_of_identity_write** | [**ProofOfIdentityWrite**](ProofOfIdentityWrite.md)| The new ProofOfIdentity resource | 

### Return type

[**ProofOfIdentityRead**](ProofOfIdentityRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | ProofOfIdentity resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_register_post**
> UserPostRegisterRead api_register_post(user_write)

Customer onboarding

Internal-use only, protected by a captcha. User first-enrollment

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_post_register_read import UserPostRegisterRead
from tpdk_safe_checkout.models.user_write import UserWrite
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    user_write = tpdk_safe_checkout.UserWrite() # UserWrite | The new User resource

    try:
        # Customer onboarding
        api_response = api_instance.api_register_post(user_write)
        print("The response of UserApi->api_register_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_register_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_write** | [**UserWrite**](UserWrite.md)| The new User resource | 

### Return type

[**UserPostRegisterRead**](UserPostRegisterRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | User resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_users_id_delete**
> api_users_id_delete(id)

Removes the User resource.

Removes the User resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | User identifier

    try:
        # Removes the User resource.
        api_instance.api_users_id_delete(id)
    except Exception as e:
        print("Exception when calling UserApi->api_users_id_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User identifier | 

### Return type

void (empty response body)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | User resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_users_id_patch**
> UserPostRegisterRead api_users_id_patch(id, user_update)

Update your profile

Updates the User resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_post_register_read import UserPostRegisterRead
from tpdk_safe_checkout.models.user_update import UserUpdate
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | User identifier
    user_update = tpdk_safe_checkout.UserUpdate() # UserUpdate | The updated User resource

    try:
        # Update your profile
        api_response = api_instance.api_users_id_patch(id, user_update)
        print("The response of UserApi->api_users_id_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_users_id_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User identifier | 
 **user_update** | [**UserUpdate**](UserUpdate.md)| The updated User resource | 

### Return type

[**UserPostRegisterRead**](UserPostRegisterRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_users_idavatar_delete**
> api_users_idavatar_delete(id)

Unset your personal avatar

Removes the Media resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 56 # int | User identifier

    try:
        # Unset your personal avatar
        api_instance.api_users_idavatar_delete(id)
    except Exception as e:
        print("Exception when calling UserApi->api_users_idavatar_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| User identifier | 

### Return type

void (empty response body)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Media resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_users_idavatar_post**
> MediaRead api_users_idavatar_post(id, file=file)

Upload your personal avatar

Creates a Media resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.media_read import MediaRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 56 # int | User identifier
    file = None # bytearray |  (optional)

    try:
        # Upload your personal avatar
        api_response = api_instance.api_users_idavatar_post(id, file=file)
        print("The response of UserApi->api_users_idavatar_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_users_idavatar_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| User identifier | 
 **file** | **bytearray**|  | [optional] 

### Return type

[**MediaRead**](MediaRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Media resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_users_idemail_patch**
> UserUserRead api_users_idemail_patch(id, user_user_email_update)

Update user email

Updates the User resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_user_email_update import UserUserEmailUpdate
from tpdk_safe_checkout.models.user_user_read import UserUserRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | User identifier
    user_user_email_update = tpdk_safe_checkout.UserUserEmailUpdate() # UserUserEmailUpdate | The updated User resource

    try:
        # Update user email
        api_response = api_instance.api_users_idemail_patch(id, user_user_email_update)
        print("The response of UserApi->api_users_idemail_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_users_idemail_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User identifier | 
 **user_user_email_update** | [**UserUserEmailUpdate**](UserUserEmailUpdate.md)| The updated User resource | 

### Return type

[**UserUserRead**](UserUserRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_users_idemail_validation_patch**
> UserPostRegisterRead api_users_idemail_validation_patch(id, user_email_validation_write)

Validate email ownership

Updates the User resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_email_validation_write import UserEmailValidationWrite
from tpdk_safe_checkout.models.user_post_register_read import UserPostRegisterRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | User identifier
    user_email_validation_write = tpdk_safe_checkout.UserEmailValidationWrite() # UserEmailValidationWrite | The updated User resource

    try:
        # Validate email ownership
        api_response = api_instance.api_users_idemail_validation_patch(id, user_email_validation_write)
        print("The response of UserApi->api_users_idemail_validation_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_users_idemail_validation_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User identifier | 
 **user_email_validation_write** | [**UserEmailValidationWrite**](UserEmailValidationWrite.md)| The updated User resource | 

### Return type

[**UserPostRegisterRead**](UserPostRegisterRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_users_idpassword_patch**
> UserUserRead api_users_idpassword_patch(id, user_user_password_update)

Change your password

Updates the User resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_user_password_update import UserUserPasswordUpdate
from tpdk_safe_checkout.models.user_user_read import UserUserRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | User identifier
    user_user_password_update = tpdk_safe_checkout.UserUserPasswordUpdate() # UserUserPasswordUpdate | The updated User resource

    try:
        # Change your password
        api_response = api_instance.api_users_idpassword_patch(id, user_user_password_update)
        print("The response of UserApi->api_users_idpassword_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_users_idpassword_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User identifier | 
 **user_user_password_update** | [**UserUserPasswordUpdate**](UserUserPasswordUpdate.md)| The updated User resource | 

### Return type

[**UserUserRead**](UserUserRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_users_idtotp_setup_patch**
> UserTotpSetupRead api_users_idtotp_setup_patch(id, body)

Setup an additional authentication factor

Updates the User resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_totp_setup_read import UserTotpSetupRead
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | User identifier
    body = None # object | The updated User resource

    try:
        # Setup an additional authentication factor
        api_response = api_instance.api_users_idtotp_setup_patch(id, body)
        print("The response of UserApi->api_users_idtotp_setup_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_users_idtotp_setup_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User identifier | 
 **body** | **object**| The updated User resource | 

### Return type

[**UserTotpSetupRead**](UserTotpSetupRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_users_idtotp_toggle_patch**
> object api_users_idtotp_toggle_patch(id, user_totp_toggle_write)

Disable the second authentication factor

Updates the User resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_totp_toggle_write import UserTotpToggleWrite
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    id = 'id_example' # str | User identifier
    user_totp_toggle_write = tpdk_safe_checkout.UserTotpToggleWrite() # UserTotpToggleWrite | The updated User resource

    try:
        # Disable the second authentication factor
        api_response = api_instance.api_users_idtotp_toggle_patch(id, user_totp_toggle_write)
        print("The response of UserApi->api_users_idtotp_toggle_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->api_users_idtotp_toggle_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User identifier | 
 **user_totp_toggle_write** | [**UserTotpToggleWrite**](UserTotpToggleWrite.md)| The updated User resource | 

### Return type

**object**

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **authentication_post**
> UserJwtCreated authentication_post(user_jwt_write=user_jwt_write)

User authentication

This endpoint is protected by a captcha, do not try to use it to consume our API. IP/CIDR to be banned upon fraudulent/irregular usage. Follow the oauth 2.0 authentication challenge as described in the documentation.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_jwt_created import UserJwtCreated
from tpdk_safe_checkout.models.user_jwt_write import UserJwtWrite
from tpdk_safe_checkout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://staging-api.tripartie.app
# See configuration.py for a list of all supported configuration parameters.
configuration = tpdk_safe_checkout.Configuration(
    host = "https://staging-api.tripartie.app"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: jwtPersonalKey
configuration.api_key['jwtPersonalKey'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['jwtPersonalKey'] = 'Bearer'

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.UserApi(api_client)
    user_jwt_write = tpdk_safe_checkout.UserJwtWrite() # UserJwtWrite |  (optional)

    try:
        # User authentication
        api_response = api_instance.authentication_post(user_jwt_write=user_jwt_write)
        print("The response of UserApi->authentication_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserApi->authentication_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_jwt_write** | [**UserJwtWrite**](UserJwtWrite.md)|  | [optional] 

### Return type

[**UserJwtCreated**](UserJwtCreated.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** |  |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

