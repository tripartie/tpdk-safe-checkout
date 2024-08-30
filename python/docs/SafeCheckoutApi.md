# tpdk_safe_checkout.SafeCheckoutApi

All URIs are relative to *https://staging-api.tripartie.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_offers_get_collection**](SafeCheckoutApi.md#api_offers_get_collection) | **GET** /offers | Search amongst Offers
[**api_offers_post**](SafeCheckoutApi.md#api_offers_post) | **POST** /offers | Create a public link for Offer
[**api_offers_ulid_delete**](SafeCheckoutApi.md#api_offers_ulid_delete) | **DELETE** /offers/{ulid} | Disable existing Offer
[**api_offers_ulid_get**](SafeCheckoutApi.md#api_offers_ulid_get) | **GET** /offers/{ulid} | Fetch a Offer details
[**api_offers_ulid_patch**](SafeCheckoutApi.md#api_offers_ulid_patch) | **PATCH** /offers/{ulid} | Update existing Offer
[**api_offers_ulidmedias_id_delete**](SafeCheckoutApi.md#api_offers_ulidmedias_id_delete) | **DELETE** /offers/{ulid}/medias/{id} | Removes the Media resource.
[**api_offers_ulidmedias_post**](SafeCheckoutApi.md#api_offers_ulidmedias_post) | **POST** /offers/{ulid}/medias | Upload a picture for a given Offer
[**api_users_idoffers_post**](SafeCheckoutApi.md#api_users_idoffers_post) | **POST** /users/{id}/offers | Issue an Offer as User


# **api_offers_get_collection**
> List[OfferCollectionRead] api_offers_get_collection(page=page, title=title, public_url=public_url, public_url2=public_url2, unit_price=unit_price, unit_price2=unit_price2, item_count=item_count, item_count2=item_count2, created_at_before=created_at_before, created_at_strictly_before=created_at_strictly_before, created_at_after=created_at_after, created_at_strictly_after=created_at_strictly_after, metadata=metadata, offer_metadata=offer_metadata, seller_metadata=seller_metadata, nature=nature, condition=condition, status=status, shipping_allowed=shipping_allowed)

Search amongst Offers

Retrieves the collection of Offer resources.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.offer_collection_read import OfferCollectionRead
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
    api_instance = tpdk_safe_checkout.SafeCheckoutApi(api_client)
    page = 1 # int | The collection page number (optional) (default to 1)
    title = 'title_example' # str |  (optional)
    public_url = 'public_url_example' # str |  (optional)
    public_url2 = ['public_url_example'] # List[str] |  (optional)
    unit_price = 'unit_price_example' # str |  (optional)
    unit_price2 = ['unit_price_example'] # List[str] |  (optional)
    item_count = 56 # int |  (optional)
    item_count2 = [56] # List[int] |  (optional)
    created_at_before = 'created_at_before_example' # str |  (optional)
    created_at_strictly_before = 'created_at_strictly_before_example' # str |  (optional)
    created_at_after = 'created_at_after_example' # str |  (optional)
    created_at_strictly_after = 'created_at_strictly_after_example' # str |  (optional)
    metadata = ['[\"External-ID\",\"1254A\"]'] # List[str] | Flattened OrderedMap for metadata. Must be a multiple of two items count. Explicitly set \"null\" for desired value. (optional)
    offer_metadata = ['[\"External-ID\",\"1254A\"]'] # List[str] | Flattened OrderedMap for offer.metadata. Must be a multiple of two items count. Explicitly set \"null\" for desired value. (optional)
    seller_metadata = ['[\"External-ID\",\"1254A\"]'] # List[str] | Flattened OrderedMap for seller.metadata. Must be a multiple of two items count. Explicitly set \"null\" for desired value. (optional)
    nature = 'service' # str | Filter on a limited subset of nature (optional)
    condition = 'NEW' # str | Filter on a limited subset of condition (optional)
    status = 'issued' # str | Filter on a limited subset of status (optional)
    shipping_allowed = True # bool |  (optional)

    try:
        # Search amongst Offers
        api_response = api_instance.api_offers_get_collection(page=page, title=title, public_url=public_url, public_url2=public_url2, unit_price=unit_price, unit_price2=unit_price2, item_count=item_count, item_count2=item_count2, created_at_before=created_at_before, created_at_strictly_before=created_at_strictly_before, created_at_after=created_at_after, created_at_strictly_after=created_at_strictly_after, metadata=metadata, offer_metadata=offer_metadata, seller_metadata=seller_metadata, nature=nature, condition=condition, status=status, shipping_allowed=shipping_allowed)
        print("The response of SafeCheckoutApi->api_offers_get_collection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SafeCheckoutApi->api_offers_get_collection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The collection page number | [optional] [default to 1]
 **title** | **str**|  | [optional] 
 **public_url** | **str**|  | [optional] 
 **public_url2** | [**List[str]**](str.md)|  | [optional] 
 **unit_price** | **str**|  | [optional] 
 **unit_price2** | [**List[str]**](str.md)|  | [optional] 
 **item_count** | **int**|  | [optional] 
 **item_count2** | [**List[int]**](int.md)|  | [optional] 
 **created_at_before** | **str**|  | [optional] 
 **created_at_strictly_before** | **str**|  | [optional] 
 **created_at_after** | **str**|  | [optional] 
 **created_at_strictly_after** | **str**|  | [optional] 
 **metadata** | [**List[str]**](str.md)| Flattened OrderedMap for metadata. Must be a multiple of two items count. Explicitly set \&quot;null\&quot; for desired value. | [optional] 
 **offer_metadata** | [**List[str]**](str.md)| Flattened OrderedMap for offer.metadata. Must be a multiple of two items count. Explicitly set \&quot;null\&quot; for desired value. | [optional] 
 **seller_metadata** | [**List[str]**](str.md)| Flattened OrderedMap for seller.metadata. Must be a multiple of two items count. Explicitly set \&quot;null\&quot; for desired value. | [optional] 
 **nature** | **str**| Filter on a limited subset of nature | [optional] 
 **condition** | **str**| Filter on a limited subset of condition | [optional] 
 **status** | **str**| Filter on a limited subset of status | [optional] 
 **shipping_allowed** | **bool**|  | [optional] 

### Return type

[**List[OfferCollectionRead]**](OfferCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Offer collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_offers_post**
> OfferPostCreationRead api_offers_post(offer_independent_write)

Create a public link for Offer

Create a public listening Offer linked to a specific Seller

### Example

* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.offer_independent_write import OfferIndependentWrite
from tpdk_safe_checkout.models.offer_post_creation_read import OfferPostCreationRead
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

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.SafeCheckoutApi(api_client)
    offer_independent_write = tpdk_safe_checkout.OfferIndependentWrite() # OfferIndependentWrite | The new Offer resource

    try:
        # Create a public link for Offer
        api_response = api_instance.api_offers_post(offer_independent_write)
        print("The response of SafeCheckoutApi->api_offers_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SafeCheckoutApi->api_offers_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer_independent_write** | [**OfferIndependentWrite**](OfferIndependentWrite.md)| The new Offer resource | 

### Return type

[**OfferPostCreationRead**](OfferPostCreationRead.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Offer resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_offers_ulid_delete**
> api_offers_ulid_delete(ulid)

Disable existing Offer

Make a specific Offer as non longer active

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
    api_instance = tpdk_safe_checkout.SafeCheckoutApi(api_client)
    ulid = 'ulid_example' # str | Offer identifier

    try:
        # Disable existing Offer
        api_instance.api_offers_ulid_delete(ulid)
    except Exception as e:
        print("Exception when calling SafeCheckoutApi->api_offers_ulid_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ulid** | **str**| Offer identifier | 

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
**204** | Offer resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_offers_ulid_get**
> OfferRead api_offers_ulid_get(ulid)

Fetch a Offer details

Retrieves a Offer resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.offer_read import OfferRead
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
    api_instance = tpdk_safe_checkout.SafeCheckoutApi(api_client)
    ulid = 'ulid_example' # str | Offer identifier

    try:
        # Fetch a Offer details
        api_response = api_instance.api_offers_ulid_get(ulid)
        print("The response of SafeCheckoutApi->api_offers_ulid_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SafeCheckoutApi->api_offers_ulid_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ulid** | **str**| Offer identifier | 

### Return type

[**OfferRead**](OfferRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Offer resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_offers_ulid_patch**
> OfferPostCreationRead api_offers_ulid_patch(ulid, offer_update)

Update existing Offer

Update your existing Offer and reuse existing generated link

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.offer_post_creation_read import OfferPostCreationRead
from tpdk_safe_checkout.models.offer_update import OfferUpdate
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
    api_instance = tpdk_safe_checkout.SafeCheckoutApi(api_client)
    ulid = 'ulid_example' # str | Offer identifier
    offer_update = tpdk_safe_checkout.OfferUpdate() # OfferUpdate | The updated Offer resource

    try:
        # Update existing Offer
        api_response = api_instance.api_offers_ulid_patch(ulid, offer_update)
        print("The response of SafeCheckoutApi->api_offers_ulid_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SafeCheckoutApi->api_offers_ulid_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ulid** | **str**| Offer identifier | 
 **offer_update** | [**OfferUpdate**](OfferUpdate.md)| The updated Offer resource | 

### Return type

[**OfferPostCreationRead**](OfferPostCreationRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Offer resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_offers_ulidmedias_id_delete**
> api_offers_ulidmedias_id_delete(ulid, id)

Removes the Media resource.

Removes the Media resource.

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
    api_instance = tpdk_safe_checkout.SafeCheckoutApi(api_client)
    ulid = 'ulid_example' # str | 
    id = 56 # int | 

    try:
        # Removes the Media resource.
        api_instance.api_offers_ulidmedias_id_delete(ulid, id)
    except Exception as e:
        print("Exception when calling SafeCheckoutApi->api_offers_ulidmedias_id_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ulid** | **str**|  | 
 **id** | **int**|  | 

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
**204** | Media resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_offers_ulidmedias_post**
> MediaRead api_offers_ulidmedias_post(ulid, file=file)

Upload a picture for a given Offer

Creates a Media resource.

### Example

* OAuth Authentication (oauth):

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

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with tpdk_safe_checkout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = tpdk_safe_checkout.SafeCheckoutApi(api_client)
    ulid = 'ulid_example' # str | 
    file = None # bytearray |  (optional)

    try:
        # Upload a picture for a given Offer
        api_response = api_instance.api_offers_ulidmedias_post(ulid, file=file)
        print("The response of SafeCheckoutApi->api_offers_ulidmedias_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SafeCheckoutApi->api_offers_ulidmedias_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ulid** | **str**|  | 
 **file** | **bytearray**|  | [optional] 

### Return type

[**MediaRead**](MediaRead.md)

### Authorization

[oauth](../README.md#oauth)

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

# **api_users_idoffers_post**
> OfferPostCreationRead api_users_idoffers_post(id, offer_solo_write)

Issue an Offer as User

Create a public listening Offer linked to a specific User

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.offer_post_creation_read import OfferPostCreationRead
from tpdk_safe_checkout.models.offer_solo_write import OfferSoloWrite
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
    api_instance = tpdk_safe_checkout.SafeCheckoutApi(api_client)
    id = 56 # int | User identifier
    offer_solo_write = tpdk_safe_checkout.OfferSoloWrite() # OfferSoloWrite | The new Offer resource

    try:
        # Issue an Offer as User
        api_response = api_instance.api_users_idoffers_post(id, offer_solo_write)
        print("The response of SafeCheckoutApi->api_users_idoffers_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SafeCheckoutApi->api_users_idoffers_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| User identifier | 
 **offer_solo_write** | [**OfferSoloWrite**](OfferSoloWrite.md)| The new Offer resource | 

### Return type

[**OfferPostCreationRead**](OfferPostCreationRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Offer resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

