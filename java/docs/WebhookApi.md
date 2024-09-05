# WebhookApi

All URIs are relative to *https://staging-api.tripartie.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiWebhookHistoriesGetCollection**](WebhookApi.md#apiWebhookHistoriesGetCollection) | **GET** /webhook-histories | Retrieves the collection of WebhookHistory resources. |
| [**apiWebhookHistoriesIdGet**](WebhookApi.md#apiWebhookHistoriesIdGet) | **GET** /webhook-histories/{id} | Retrieves a WebhookHistory resource. |
| [**apiWebhookHistoriesIdPut**](WebhookApi.md#apiWebhookHistoriesIdPut) | **PUT** /webhook-histories/{id} | Replay a Webhook that ended up in failure |
| [**apiWebhookSubscriptionsGetCollection**](WebhookApi.md#apiWebhookSubscriptionsGetCollection) | **GET** /webhook-subscriptions | Retrieves the collection of WebhookSubscription resources. |
| [**apiWebhookSubscriptionsIdDelete**](WebhookApi.md#apiWebhookSubscriptionsIdDelete) | **DELETE** /webhook-subscriptions/{id} | Removes the WebhookSubscription resource. |
| [**apiWebhookSubscriptionsPost**](WebhookApi.md#apiWebhookSubscriptionsPost) | **POST** /webhook-subscriptions | Subscribe to Event(s) |


<a id="apiWebhookHistoriesGetCollection"></a>
# **apiWebhookHistoriesGetCollection**
> List&lt;WebhookHistoryCollectionRead&gt; apiWebhookHistoriesGetCollection().page(page).event(event).event2(event2).objectId(objectId).objectId2(objectId2).execute();

Retrieves the collection of WebhookHistory resources.

Retrieves the collection of WebhookHistory resources.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer page = 1; // Integer | The collection page number
    String event = "event_example"; // String | 
    List<String> event2 = Arrays.asList(); // List<String> | 
    String objectId = "objectId_example"; // String | 
    List<String> objectId2 = Arrays.asList(); // List<String> | 
    try {
      List<WebhookHistoryCollectionRead> result = apiInstance.apiWebhookHistoriesGetCollection()
            .page(page)
            .event(event)
            .event2(event2)
            .objectId(objectId)
            .objectId2(objectId2)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#apiWebhookHistoriesGetCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| The collection page number | [optional] [default to 1] |
| **event** | **String**|  | [optional] |
| **event2** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **objectId** | **String**|  | [optional] |
| **objectId2** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**List&lt;WebhookHistoryCollectionRead&gt;**](WebhookHistoryCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WebhookHistory collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiWebhookHistoriesIdGet"></a>
# **apiWebhookHistoriesIdGet**
> WebhookHistoryRead apiWebhookHistoriesIdGet(id).execute();

Retrieves a WebhookHistory resource.

Retrieves a WebhookHistory resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    String id = "id_example"; // String | WebhookHistory identifier
    try {
      WebhookHistoryRead result = apiInstance.apiWebhookHistoriesIdGet(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#apiWebhookHistoriesIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| WebhookHistory identifier | |

### Return type

[**WebhookHistoryRead**](WebhookHistoryRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WebhookHistory resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiWebhookHistoriesIdPut"></a>
# **apiWebhookHistoriesIdPut**
> WebhookHistoryRead apiWebhookHistoriesIdPut(id, body).execute();

Replay a Webhook that ended up in failure

Replaces the WebhookHistory resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    String id = "id_example"; // String | WebhookHistory identifier
    Object body = null; // Object | The updated WebhookHistory resource
    try {
      WebhookHistoryRead result = apiInstance.apiWebhookHistoriesIdPut(id, body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#apiWebhookHistoriesIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| WebhookHistory identifier | |
| **body** | **Object**| The updated WebhookHistory resource | |

### Return type

[**WebhookHistoryRead**](WebhookHistoryRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WebhookHistory resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiWebhookSubscriptionsGetCollection"></a>
# **apiWebhookSubscriptionsGetCollection**
> List&lt;WebhookSubscriptionRead&gt; apiWebhookSubscriptionsGetCollection().page(page).event(event).event2(event2).execute();

Retrieves the collection of WebhookSubscription resources.

Retrieves the collection of WebhookSubscription resources.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer page = 1; // Integer | The collection page number
    String event = "offer.transaction.authorized"; // String | Filter on a specific value of event
    List<String> event2 = Arrays.asList(new ArrayList<>()); // List<String> | Filter on a limited subset of event
    try {
      List<WebhookSubscriptionRead> result = apiInstance.apiWebhookSubscriptionsGetCollection()
            .page(page)
            .event(event)
            .event2(event2)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#apiWebhookSubscriptionsGetCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| The collection page number | [optional] [default to 1] |
| **event** | **String**| Filter on a specific value of event | [optional] [enum: offer.transaction.authorized, offer.transaction.accepted, offer.transaction.shipped, offer.transaction.delivered, offer.transaction.completed, offer.transaction.canceled, offer.transaction.disputed, offer.closed, persona.added] |
| **event2** | [**List&lt;String&gt;**](String.md)| Filter on a limited subset of event | [optional] [enum: offer.transaction.authorized, offer.transaction.accepted, offer.transaction.shipped, offer.transaction.delivered, offer.transaction.completed, offer.transaction.canceled, offer.transaction.disputed, offer.closed, persona.added] |

### Return type

[**List&lt;WebhookSubscriptionRead&gt;**](WebhookSubscriptionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WebhookSubscription collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiWebhookSubscriptionsIdDelete"></a>
# **apiWebhookSubscriptionsIdDelete**
> apiWebhookSubscriptionsIdDelete(id).execute();

Removes the WebhookSubscription resource.

Removes the WebhookSubscription resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    String id = "id_example"; // String | WebhookSubscription identifier
    try {
      apiInstance.apiWebhookSubscriptionsIdDelete(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#apiWebhookSubscriptionsIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| WebhookSubscription identifier | |

### Return type

null (empty response body)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | WebhookSubscription resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiWebhookSubscriptionsPost"></a>
# **apiWebhookSubscriptionsPost**
> WebhookSubscriptionRead apiWebhookSubscriptionsPost(webhookSubscriptionWrite).execute();

Subscribe to Event(s)

Creates a WebhookSubscription resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    WebhookSubscriptionWrite webhookSubscriptionWrite = new WebhookSubscriptionWrite(); // WebhookSubscriptionWrite | The new WebhookSubscription resource
    try {
      WebhookSubscriptionRead result = apiInstance.apiWebhookSubscriptionsPost(webhookSubscriptionWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#apiWebhookSubscriptionsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookSubscriptionWrite** | [**WebhookSubscriptionWrite**](WebhookSubscriptionWrite.md)| The new WebhookSubscription resource | |

### Return type

[**WebhookSubscriptionRead**](WebhookSubscriptionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | WebhookSubscription resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

