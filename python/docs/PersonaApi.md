# tpdk_safe_checkout.PersonaApi

All URIs are relative to *https://staging-api.tripartie.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_personas_get_collection**](PersonaApi.md#api_personas_get_collection) | **GET** /personas | Retrieves the collection of Persona resources.
[**api_personas_id_delete**](PersonaApi.md#api_personas_id_delete) | **DELETE** /personas/{id} | Unregister a Persona (Your customer)
[**api_personas_id_get**](PersonaApi.md#api_personas_id_get) | **GET** /personas/{id} | Retrieves a Persona resource.
[**api_personas_id_patch**](PersonaApi.md#api_personas_id_patch) | **PATCH** /personas/{id} | Updates the Persona resource.
[**api_personas_post**](PersonaApi.md#api_personas_post) | **POST** /personas | Register a Persona (Your customer)


# **api_personas_get_collection**
> List[PersonaCollectionRead] api_personas_get_collection(page=page, first_name=first_name, last_name=last_name, email=email, email2=email2, mobile_phone_number=mobile_phone_number, mobile_phone_number2=mobile_phone_number2, gender=gender, order_created_at=order_created_at, created_at_before=created_at_before, created_at_strictly_before=created_at_strictly_before, created_at_after=created_at_after, created_at_strictly_after=created_at_strictly_after, date_of_birth_before=date_of_birth_before, date_of_birth_strictly_before=date_of_birth_strictly_before, date_of_birth_after=date_of_birth_after, date_of_birth_strictly_after=date_of_birth_strictly_after, metadata=metadata)

Retrieves the collection of Persona resources.

Retrieves the collection of Persona resources.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.persona_collection_read import PersonaCollectionRead
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
    api_instance = tpdk_safe_checkout.PersonaApi(api_client)
    page = 1 # int | The collection page number (optional) (default to 1)
    first_name = 'first_name_example' # str |  (optional)
    last_name = 'last_name_example' # str |  (optional)
    email = 'email_example' # str |  (optional)
    email2 = ['email_example'] # List[str] |  (optional)
    mobile_phone_number = 'mobile_phone_number_example' # str |  (optional)
    mobile_phone_number2 = ['mobile_phone_number_example'] # List[str] |  (optional)
    gender = 'MALE' # str | Filter on a limited subset of gender (optional)
    order_created_at = 'order_created_at_example' # str |  (optional)
    created_at_before = 'created_at_before_example' # str |  (optional)
    created_at_strictly_before = 'created_at_strictly_before_example' # str |  (optional)
    created_at_after = 'created_at_after_example' # str |  (optional)
    created_at_strictly_after = 'created_at_strictly_after_example' # str |  (optional)
    date_of_birth_before = 'date_of_birth_before_example' # str |  (optional)
    date_of_birth_strictly_before = 'date_of_birth_strictly_before_example' # str |  (optional)
    date_of_birth_after = 'date_of_birth_after_example' # str |  (optional)
    date_of_birth_strictly_after = 'date_of_birth_strictly_after_example' # str |  (optional)
    metadata = ['[External-ID, 1254A]'] # List[str] | Flattened OrderedMap for metadata. Must be a multiple of two items count. Explicitly set \"null\" for desired value. (optional)

    try:
        # Retrieves the collection of Persona resources.
        api_response = api_instance.api_personas_get_collection(page=page, first_name=first_name, last_name=last_name, email=email, email2=email2, mobile_phone_number=mobile_phone_number, mobile_phone_number2=mobile_phone_number2, gender=gender, order_created_at=order_created_at, created_at_before=created_at_before, created_at_strictly_before=created_at_strictly_before, created_at_after=created_at_after, created_at_strictly_after=created_at_strictly_after, date_of_birth_before=date_of_birth_before, date_of_birth_strictly_before=date_of_birth_strictly_before, date_of_birth_after=date_of_birth_after, date_of_birth_strictly_after=date_of_birth_strictly_after, metadata=metadata)
        print("The response of PersonaApi->api_personas_get_collection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PersonaApi->api_personas_get_collection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| The collection page number | [optional] [default to 1]
 **first_name** | **str**|  | [optional] 
 **last_name** | **str**|  | [optional] 
 **email** | **str**|  | [optional] 
 **email2** | [**List[str]**](str.md)|  | [optional] 
 **mobile_phone_number** | **str**|  | [optional] 
 **mobile_phone_number2** | [**List[str]**](str.md)|  | [optional] 
 **gender** | **str**| Filter on a limited subset of gender | [optional] 
 **order_created_at** | **str**|  | [optional] 
 **created_at_before** | **str**|  | [optional] 
 **created_at_strictly_before** | **str**|  | [optional] 
 **created_at_after** | **str**|  | [optional] 
 **created_at_strictly_after** | **str**|  | [optional] 
 **date_of_birth_before** | **str**|  | [optional] 
 **date_of_birth_strictly_before** | **str**|  | [optional] 
 **date_of_birth_after** | **str**|  | [optional] 
 **date_of_birth_strictly_after** | **str**|  | [optional] 
 **metadata** | [**List[str]**](str.md)| Flattened OrderedMap for metadata. Must be a multiple of two items count. Explicitly set \&quot;null\&quot; for desired value. | [optional] 

### Return type

[**List[PersonaCollectionRead]**](PersonaCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Persona collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_personas_id_delete**
> api_personas_id_delete(id)

Unregister a Persona (Your customer)

You **MAY** unregister (or free the email/phone number) your Persona entry using that endpoint. *Please note that* this operation will fail if that Persona have any ongoing operations.

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
    api_instance = tpdk_safe_checkout.PersonaApi(api_client)
    id = 'id_example' # str | Persona identifier

    try:
        # Unregister a Persona (Your customer)
        api_instance.api_personas_id_delete(id)
    except Exception as e:
        print("Exception when calling PersonaApi->api_personas_id_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Persona identifier | 

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
**204** | Persona resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_personas_id_get**
> PersonaRead api_personas_id_get(id)

Retrieves a Persona resource.

Retrieves a Persona resource.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.persona_read import PersonaRead
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
    api_instance = tpdk_safe_checkout.PersonaApi(api_client)
    id = 'id_example' # str | Persona identifier

    try:
        # Retrieves a Persona resource.
        api_response = api_instance.api_personas_id_get(id)
        print("The response of PersonaApi->api_personas_id_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PersonaApi->api_personas_id_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Persona identifier | 

### Return type

[**PersonaRead**](PersonaRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Persona resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_personas_id_patch**
> PersonaRead api_personas_id_patch(id, persona_update)

Updates the Persona resource.

Update your Persona (eg. your customer/user entry) through that API call. _Beware that updating_ **email** and/or the **mobile phone number** must be done using non reserved values. Otherwise this operation will be rejected.

### Example

* Api Key Authentication (jwtPersonalKey):
* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.persona_read import PersonaRead
from tpdk_safe_checkout.models.persona_update import PersonaUpdate
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
    api_instance = tpdk_safe_checkout.PersonaApi(api_client)
    id = 'id_example' # str | Persona identifier
    persona_update = tpdk_safe_checkout.PersonaUpdate() # PersonaUpdate | The updated Persona resource

    try:
        # Updates the Persona resource.
        api_response = api_instance.api_personas_id_patch(id, persona_update)
        print("The response of PersonaApi->api_personas_id_patch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PersonaApi->api_personas_id_patch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Persona identifier | 
 **persona_update** | [**PersonaUpdate**](PersonaUpdate.md)| The updated Persona resource | 

### Return type

[**PersonaRead**](PersonaRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Persona resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_personas_post**
> PersonaRead api_personas_post(persona_write)

Register a Persona (Your customer)

You should not register your whole database of users, only those who are concerned by a Transaction operation. One Persona entry for your organization can be assigned as a seller or buyer.  **Notes:**   - (i) There is a unique constraint for the mobile phone numbers and email.   - (ii) You will have to issue a DELETE operation on a Persona that withhold a specific phone number or email.   - (iii) You are NOT REQUIRED to provide email OR a mobile phone number but it is highly recommended, if none provided the email will be generated as '{ulid}@your-domain.tld'. In that case, please specify at least one metadata in order to find your entry with ease.

### Example

* OAuth Authentication (oauth):

```python
import tpdk_safe_checkout
from tpdk_safe_checkout.models.persona_read import PersonaRead
from tpdk_safe_checkout.models.persona_write import PersonaWrite
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
    api_instance = tpdk_safe_checkout.PersonaApi(api_client)
    persona_write = tpdk_safe_checkout.PersonaWrite() # PersonaWrite | The new Persona resource

    try:
        # Register a Persona (Your customer)
        api_response = api_instance.api_personas_post(persona_write)
        print("The response of PersonaApi->api_personas_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PersonaApi->api_personas_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **persona_write** | [**PersonaWrite**](PersonaWrite.md)| The new Persona resource | 

### Return type

[**PersonaRead**](PersonaRead.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Persona resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
**401** | Authentication required |  -  |
**403** | Unauthorized access |  -  |
**429** | Rate limit exhausted |  -  |
**500** | Unexpected server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

