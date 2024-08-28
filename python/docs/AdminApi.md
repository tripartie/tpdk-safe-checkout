# tpdk_safe_checkout.AdminApi

All URIs are relative to *https://staging-api.tripartie.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_api_clients_get_collection**](AdminApi.md#api_api_clients_get_collection) | **GET** /api-clients | Retrieves the collection of ApiClient resources.
[**api_api_clients_identifier_delete**](AdminApi.md#api_api_clients_identifier_delete) | **DELETE** /api-clients/{identifier} | Removes the ApiClient resource.
[**api_api_clients_identifier_get**](AdminApi.md#api_api_clients_identifier_get) | **GET** /api-clients/{identifier} | Retrieves a ApiClient resource.
[**api_api_clients_post**](AdminApi.md#api_api_clients_post) | **POST** /api-clients | Creates a ApiClient resource.
[**api_invite_post**](AdminApi.md#api_invite_post) | **POST** /invite | Organization invite
[**api_organizations_get_collection**](AdminApi.md#api_organizations_get_collection) | **GET** /organizations | Retrieves the collection of Organization resources.
[**api_organizations_id_get**](AdminApi.md#api_organizations_id_get) | **GET** /organizations/{id} | Retrieves a Organization resource.
[**api_users_get_collection**](AdminApi.md#api_users_get_collection) | **GET** /users | Retrieves the collection of User resources.
[**api_users_id_delete**](AdminApi.md#api_users_id_delete) | **DELETE** /users/{id} | Removes the User resource.
[**api_users_id_get**](AdminApi.md#api_users_id_get) | **GET** /users/{id} | Retrieves a User resource.
[**api_users_id_patch**](AdminApi.md#api_users_id_patch) | **PATCH** /users/{id} | Update your profile
[**api_users_iddisable_patch**](AdminApi.md#api_users_iddisable_patch) | **PATCH** /users/{id}/disable | Updates the User resource.
[**api_users_idemail_patch**](AdminApi.md#api_users_idemail_patch) | **PATCH** /users/{id}/email | Update user email
[**api_users_idemail_validation_patch**](AdminApi.md#api_users_idemail_validation_patch) | **PATCH** /users/{id}/email-validation | Validate email ownership
[**api_users_idenable_patch**](AdminApi.md#api_users_idenable_patch) | **PATCH** /users/{id}/enable | Updates the User resource.
[**api_users_idpassword_patch**](AdminApi.md#api_users_idpassword_patch) | **PATCH** /users/{id}/password | Change your password
[**api_users_idtotp_setup_patch**](AdminApi.md#api_users_idtotp_setup_patch) | **PATCH** /users/{id}/totp-setup | Setup an additional authentication factor
[**api_users_idtotp_toggle_patch**](AdminApi.md#api_users_idtotp_toggle_patch) | **PATCH** /users/{id}/totp-toggle | Disable the second authentication factor
[**authentication_post**](AdminApi.md#authentication_post) | **POST** /authentication | User authentication


# **api_api_clients_get_collection**
> List[ApiClientRead] api_api_clients_get_collection(page=page)

Retrieves the collection of ApiClient resources.

Retrieves the collection of ApiClient resources.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.api_client_read import ApiClientRead
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    page = 1 # int | The collection page number (optional) (default to 1)

    try:
        # Retrieves the collection of ApiClient resources.
        api_response = api_instance.api_api_clients_get_collection(page=page)
        print("The response of AdminApi->api_api_clients_get_collection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_api_clients_get_collection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The collection page number | [optional] [default to 1]

### Return type

[**List[ApiClientRead]**](ApiClientRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ApiClient collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_api_clients_identifier_delete**
> api_api_clients_identifier_delete(identifier)

Removes the ApiClient resource.

Removes the ApiClient resource.

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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    identifier = 'identifier_example' # str | ApiClient identifier

    try:
        # Removes the ApiClient resource.
        api_instance.api_api_clients_identifier_delete(identifier)
    except Exception as e:
        print("Exception when calling AdminApi->api_api_clients_identifier_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| ApiClient identifier | 

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
**204** | ApiClient resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_api_clients_identifier_get**
> ApiClientRead api_api_clients_identifier_get(identifier)

Retrieves a ApiClient resource.

Retrieves a ApiClient resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.api_client_read import ApiClientRead
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    identifier = 'identifier_example' # str | ApiClient identifier

    try:
        # Retrieves a ApiClient resource.
        api_response = api_instance.api_api_clients_identifier_get(identifier)
        print("The response of AdminApi->api_api_clients_identifier_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_api_clients_identifier_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| ApiClient identifier | 

### Return type

[**ApiClientRead**](ApiClientRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ApiClient resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_api_clients_post**
> ApiClientPostCreationRead api_api_clients_post(api_client_write)

Creates a ApiClient resource.

Creates a ApiClient resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.api_client_post_creation_read import ApiClientPostCreationRead
from tpdk_safe_checkout.models.api_client_write import ApiClientWrite
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    api_client_write = tpdk_safe_checkout.ApiClientWrite() # ApiClientWrite | The new ApiClient resource

    try:
        # Creates a ApiClient resource.
        api_response = api_instance.api_api_clients_post(api_client_write)
        print("The response of AdminApi->api_api_clients_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_api_clients_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_client_write** | [**ApiClientWrite**](ApiClientWrite.md)| The new ApiClient resource | 

### Return type

[**ApiClientPostCreationRead**](ApiClientPostCreationRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | ApiClient resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_invite_post**
> UserPostRegisterRead api_invite_post(user_invite)

Organization invite

Invite a user to your organization workspace

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_invite import UserInvite
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    user_invite = tpdk_safe_checkout.UserInvite() # UserInvite | The new User resource

    try:
        # Organization invite
        api_response = api_instance.api_invite_post(user_invite)
        print("The response of AdminApi->api_invite_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_invite_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_invite** | [**UserInvite**](UserInvite.md)| The new User resource | 

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

# **api_organizations_get_collection**
> List[OrganizationCollectionRead] api_organizations_get_collection(page=page, items_per_page=items_per_page, name=name)

Retrieves the collection of Organization resources.

Retrieves the collection of Organization resources.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.organization_collection_read import OrganizationCollectionRead
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    page = 1 # int | The collection page number (optional) (default to 1)
    items_per_page = 30 # int | The number of items per page (optional) (default to 30)
    name = 'name_example' # str |  (optional)

    try:
        # Retrieves the collection of Organization resources.
        api_response = api_instance.api_organizations_get_collection(page=page, items_per_page=items_per_page, name=name)
        print("The response of AdminApi->api_organizations_get_collection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_organizations_get_collection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The collection page number | [optional] [default to 1]
 **items_per_page** | **int**| The number of items per page | [optional] [default to 30]
 **name** | **str**|  | [optional] 

### Return type

[**List[OrganizationCollectionRead]**](OrganizationCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Organization collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_organizations_id_get**
> OrganizationRead api_organizations_id_get(id)

Retrieves a Organization resource.

Retrieves a Organization resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.organization_read import OrganizationRead
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    id = 'id_example' # str | Organization identifier

    try:
        # Retrieves a Organization resource.
        api_response = api_instance.api_organizations_id_get(id)
        print("The response of AdminApi->api_organizations_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_organizations_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Organization identifier | 

### Return type

[**OrganizationRead**](OrganizationRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Organization resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_users_get_collection**
> List[UserCollectionRead] api_users_get_collection(page=page)

Retrieves the collection of User resources.

Retrieves the collection of User resources.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_collection_read import UserCollectionRead
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    page = 1 # int | The collection page number (optional) (default to 1)

    try:
        # Retrieves the collection of User resources.
        api_response = api_instance.api_users_get_collection(page=page)
        print("The response of AdminApi->api_users_get_collection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_users_get_collection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The collection page number | [optional] [default to 1]

### Return type

[**List[UserCollectionRead]**](UserCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    id = 'id_example' # str | User identifier

    try:
        # Removes the User resource.
        api_instance.api_users_id_delete(id)
    except Exception as e:
        print("Exception when calling AdminApi->api_users_id_delete: %s\n" % e)
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

# **api_users_id_get**
> UserSupportRead api_users_id_get(id)

Retrieves a User resource.

Retrieves a User resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_support_read import UserSupportRead
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    id = 'id_example' # str | User identifier

    try:
        # Retrieves a User resource.
        api_response = api_instance.api_users_id_get(id)
        print("The response of AdminApi->api_users_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_users_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User identifier | 

### Return type

[**UserSupportRead**](UserSupportRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    id = 'id_example' # str | User identifier
    user_update = tpdk_safe_checkout.UserUpdate() # UserUpdate | The updated User resource

    try:
        # Update your profile
        api_response = api_instance.api_users_id_patch(id, user_update)
        print("The response of AdminApi->api_users_id_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_users_id_patch: %s\n" % e)
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

# **api_users_iddisable_patch**
> UserUserSubscribed api_users_iddisable_patch(id, body)

Updates the User resource.

Updates the User resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_user_subscribed import UserUserSubscribed
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    id = 'id_example' # str | User identifier
    body = None # object | The updated User resource

    try:
        # Updates the User resource.
        api_response = api_instance.api_users_iddisable_patch(id, body)
        print("The response of AdminApi->api_users_iddisable_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_users_iddisable_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User identifier | 
 **body** | **object**| The updated User resource | 

### Return type

[**UserUserSubscribed**](UserUserSubscribed.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    id = 'id_example' # str | User identifier
    user_user_email_update = tpdk_safe_checkout.UserUserEmailUpdate() # UserUserEmailUpdate | The updated User resource

    try:
        # Update user email
        api_response = api_instance.api_users_idemail_patch(id, user_user_email_update)
        print("The response of AdminApi->api_users_idemail_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_users_idemail_patch: %s\n" % e)
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    id = 'id_example' # str | User identifier
    user_email_validation_write = tpdk_safe_checkout.UserEmailValidationWrite() # UserEmailValidationWrite | The updated User resource

    try:
        # Validate email ownership
        api_response = api_instance.api_users_idemail_validation_patch(id, user_email_validation_write)
        print("The response of AdminApi->api_users_idemail_validation_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_users_idemail_validation_patch: %s\n" % e)
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

# **api_users_idenable_patch**
> UserUserSubscribed api_users_idenable_patch(id, body)

Updates the User resource.

Updates the User resource.

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.user_user_subscribed import UserUserSubscribed
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    id = 'id_example' # str | User identifier
    body = None # object | The updated User resource

    try:
        # Updates the User resource.
        api_response = api_instance.api_users_idenable_patch(id, body)
        print("The response of AdminApi->api_users_idenable_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_users_idenable_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| User identifier | 
 **body** | **object**| The updated User resource | 

### Return type

[**UserUserSubscribed**](UserUserSubscribed.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

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
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    id = 'id_example' # str | User identifier
    user_user_password_update = tpdk_safe_checkout.UserUserPasswordUpdate() # UserUserPasswordUpdate | The updated User resource

    try:
        # Change your password
        api_response = api_instance.api_users_idpassword_patch(id, user_user_password_update)
        print("The response of AdminApi->api_users_idpassword_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_users_idpassword_patch: %s\n" % e)
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    id = 'id_example' # str | User identifier
    body = None # object | The updated User resource

    try:
        # Setup an additional authentication factor
        api_response = api_instance.api_users_idtotp_setup_patch(id, body)
        print("The response of AdminApi->api_users_idtotp_setup_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_users_idtotp_setup_patch: %s\n" % e)
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    id = 'id_example' # str | User identifier
    user_totp_toggle_write = tpdk_safe_checkout.UserTotpToggleWrite() # UserTotpToggleWrite | The updated User resource

    try:
        # Disable the second authentication factor
        api_response = api_instance.api_users_idtotp_toggle_patch(id, user_totp_toggle_write)
        print("The response of AdminApi->api_users_idtotp_toggle_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->api_users_idtotp_toggle_patch: %s\n" % e)
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
    api_instance = tpdk_safe_checkout.AdminApi(api_client)
    user_jwt_write = tpdk_safe_checkout.UserJwtWrite() # UserJwtWrite |  (optional)

    try:
        # User authentication
        api_response = api_instance.authentication_post(user_jwt_write=user_jwt_write)
        print("The response of AdminApi->authentication_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdminApi->authentication_post: %s\n" % e)
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
