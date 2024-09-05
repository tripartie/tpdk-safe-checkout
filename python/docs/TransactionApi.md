# tpdk_safe_checkout.TransactionApi

All URIs are relative to *https://staging-api.tripartie.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_quotes_id_get**](TransactionApi.md#api_quotes_id_get) | **GET** /quotes/{id} | Retrieve a Quote
[**api_quotes_id_patch**](TransactionApi.md#api_quotes_id_patch) | **PATCH** /quotes/{id} | Update a Quote prior to issuing a Transaction
[**api_quotes_post**](TransactionApi.md#api_quotes_post) | **POST** /quotes | Create a Quote prior to issuing a Transaction
[**api_transactions_get_collection**](TransactionApi.md#api_transactions_get_collection) | **GET** /transactions | List all Transaction
[**api_transactions_post**](TransactionApi.md#api_transactions_post) | **POST** /transactions | Initialize a new Transaction
[**api_transactions_ulid_get**](TransactionApi.md#api_transactions_ulid_get) | **GET** /transactions/{ulid} | Get a Transaction
[**api_transactions_ulid_patch**](TransactionApi.md#api_transactions_ulid_patch) | **PATCH** /transactions/{ulid} | Interact with a Transaction


# **api_quotes_id_get**
> QuoteRead api_quotes_id_get(id)

Retrieve a Quote

Retrieves a Quote resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.quote_read import QuoteRead
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
    api_instance = tpdk_safe_checkout.TransactionApi(api_client)
    id = 'id_example' # str | Quote identifier

    try:
        # Retrieve a Quote
        api_response = api_instance.api_quotes_id_get(id)
        print("The response of TransactionApi->api_quotes_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TransactionApi->api_quotes_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Quote identifier | 

### Return type

[**QuoteRead**](QuoteRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Quote resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_quotes_id_patch**
> QuoteRead api_quotes_id_patch(id, quote_update)

Update a Quote prior to issuing a Transaction

Updates the Quote resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.quote_read import QuoteRead
from tpdk_safe_checkout.models.quote_update import QuoteUpdate
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
    api_instance = tpdk_safe_checkout.TransactionApi(api_client)
    id = 'id_example' # str | Quote identifier
    quote_update = tpdk_safe_checkout.QuoteUpdate() # QuoteUpdate | The updated Quote resource

    try:
        # Update a Quote prior to issuing a Transaction
        api_response = api_instance.api_quotes_id_patch(id, quote_update)
        print("The response of TransactionApi->api_quotes_id_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TransactionApi->api_quotes_id_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Quote identifier | 
 **quote_update** | [**QuoteUpdate**](QuoteUpdate.md)| The updated Quote resource | 

### Return type

[**QuoteRead**](QuoteRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Quote resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_quotes_post**
> QuoteRead api_quotes_post(quote_write)

Create a Quote prior to issuing a Transaction

Creates a Quote resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.quote_read import QuoteRead
from tpdk_safe_checkout.models.quote_write import QuoteWrite
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
    api_instance = tpdk_safe_checkout.TransactionApi(api_client)
    quote_write = tpdk_safe_checkout.QuoteWrite() # QuoteWrite | The new Quote resource

    try:
        # Create a Quote prior to issuing a Transaction
        api_response = api_instance.api_quotes_post(quote_write)
        print("The response of TransactionApi->api_quotes_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TransactionApi->api_quotes_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote_write** | [**QuoteWrite**](QuoteWrite.md)| The new Quote resource | 

### Return type

[**QuoteRead**](QuoteRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Quote resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_transactions_get_collection**
> List[TransactionCollectionRead] api_transactions_get_collection(page=page, order_created_at=order_created_at, order_updated_at=order_updated_at, created_at_before=created_at_before, created_at_strictly_before=created_at_strictly_before, created_at_after=created_at_after, created_at_strictly_after=created_at_strictly_after, updated_at_before=updated_at_before, updated_at_strictly_before=updated_at_strictly_before, updated_at_after=updated_at_after, updated_at_strictly_after=updated_at_strictly_after, status=status, status2=status2, offer_title=offer_title)

List all Transaction

Retrieve a list of Transaction paginated

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.transaction_collection_read import TransactionCollectionRead
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
    api_instance = tpdk_safe_checkout.TransactionApi(api_client)
    page = 1 # int | The collection page number (optional) (default to 1)
    order_created_at = 'order_created_at_example' # str |  (optional)
    order_updated_at = 'order_updated_at_example' # str |  (optional)
    created_at_before = 'created_at_before_example' # str |  (optional)
    created_at_strictly_before = 'created_at_strictly_before_example' # str |  (optional)
    created_at_after = 'created_at_after_example' # str |  (optional)
    created_at_strictly_after = 'created_at_strictly_after_example' # str |  (optional)
    updated_at_before = 'updated_at_before_example' # str |  (optional)
    updated_at_strictly_before = 'updated_at_strictly_before_example' # str |  (optional)
    updated_at_after = 'updated_at_after_example' # str |  (optional)
    updated_at_strictly_after = 'updated_at_strictly_after_example' # str |  (optional)
    status = 'CREATED' # str | Filter on a specific value of status (optional)
    status2 = ['status_example'] # List[str] | Filter on a limited subset of status (optional)
    offer_title = 'offer_title_example' # str |  (optional)

    try:
        # List all Transaction
        api_response = api_instance.api_transactions_get_collection(page=page, order_created_at=order_created_at, order_updated_at=order_updated_at, created_at_before=created_at_before, created_at_strictly_before=created_at_strictly_before, created_at_after=created_at_after, created_at_strictly_after=created_at_strictly_after, updated_at_before=updated_at_before, updated_at_strictly_before=updated_at_strictly_before, updated_at_after=updated_at_after, updated_at_strictly_after=updated_at_strictly_after, status=status, status2=status2, offer_title=offer_title)
        print("The response of TransactionApi->api_transactions_get_collection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TransactionApi->api_transactions_get_collection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The collection page number | [optional] [default to 1]
 **order_created_at** | **str**|  | [optional] 
 **order_updated_at** | **str**|  | [optional] 
 **created_at_before** | **str**|  | [optional] 
 **created_at_strictly_before** | **str**|  | [optional] 
 **created_at_after** | **str**|  | [optional] 
 **created_at_strictly_after** | **str**|  | [optional] 
 **updated_at_before** | **str**|  | [optional] 
 **updated_at_strictly_before** | **str**|  | [optional] 
 **updated_at_after** | **str**|  | [optional] 
 **updated_at_strictly_after** | **str**|  | [optional] 
 **status** | **str**| Filter on a specific value of status | [optional] 
 **status2** | [**List[str]**](str.md)| Filter on a limited subset of status | [optional] 
 **offer_title** | **str**|  | [optional] 

### Return type

[**List[TransactionCollectionRead]**](TransactionCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Transaction collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_transactions_post**
> TransactionRead api_transactions_post(transaction_write)

Initialize a new Transaction

Create a new Transaction for Preauthorization

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.transaction_read import TransactionRead
from tpdk_safe_checkout.models.transaction_write import TransactionWrite
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
    api_instance = tpdk_safe_checkout.TransactionApi(api_client)
    transaction_write = tpdk_safe_checkout.TransactionWrite() # TransactionWrite | The new Transaction resource

    try:
        # Initialize a new Transaction
        api_response = api_instance.api_transactions_post(transaction_write)
        print("The response of TransactionApi->api_transactions_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TransactionApi->api_transactions_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_write** | [**TransactionWrite**](TransactionWrite.md)| The new Transaction resource | 

### Return type

[**TransactionRead**](TransactionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Transaction resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_transactions_ulid_get**
> TransactionRead api_transactions_ulid_get(ulid)

Get a Transaction

Retrieve a single Transaction by ID

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.transaction_read import TransactionRead
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
    api_instance = tpdk_safe_checkout.TransactionApi(api_client)
    ulid = 'ulid_example' # str | Transaction identifier

    try:
        # Get a Transaction
        api_response = api_instance.api_transactions_ulid_get(ulid)
        print("The response of TransactionApi->api_transactions_ulid_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TransactionApi->api_transactions_ulid_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ulid** | **str**| Transaction identifier | 

### Return type

[**TransactionRead**](TransactionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Transaction resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_transactions_ulid_patch**
> TransactionRead api_transactions_ulid_patch(ulid, transaction_update)

Interact with a Transaction

Make decision upon a Transaction in order to make it evolve

### Example

* Api Key Authentication (jwtPersonalKey):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.transaction_read import TransactionRead
from tpdk_safe_checkout.models.transaction_update import TransactionUpdate
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
    api_instance = tpdk_safe_checkout.TransactionApi(api_client)
    ulid = 'ulid_example' # str | Transaction identifier
    transaction_update = tpdk_safe_checkout.TransactionUpdate() # TransactionUpdate | The updated Transaction resource

    try:
        # Interact with a Transaction
        api_response = api_instance.api_transactions_ulid_patch(ulid, transaction_update)
        print("The response of TransactionApi->api_transactions_ulid_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TransactionApi->api_transactions_ulid_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ulid** | **str**| Transaction identifier | 
 **transaction_update** | [**TransactionUpdate**](TransactionUpdate.md)| The updated Transaction resource | 

### Return type

[**TransactionRead**](TransactionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Transaction resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

