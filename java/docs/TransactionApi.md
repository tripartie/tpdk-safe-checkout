# TransactionApi

All URIs are relative to *https://staging-api.tripartie.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiQuotesIdGet**](TransactionApi.md#apiQuotesIdGet) | **GET** /quotes/{id} | Retrieve a Quote |
| [**apiQuotesIdPatch**](TransactionApi.md#apiQuotesIdPatch) | **PATCH** /quotes/{id} | Update a Quote prior to issuing a Transaction |
| [**apiQuotesPost**](TransactionApi.md#apiQuotesPost) | **POST** /quotes | Create a Quote prior to issuing a Transaction |
| [**apiTransactionsGetCollection**](TransactionApi.md#apiTransactionsGetCollection) | **GET** /transactions | List all Transaction |
| [**apiTransactionsPost**](TransactionApi.md#apiTransactionsPost) | **POST** /transactions | Initialize a new Transaction |
| [**apiTransactionsUlidGet**](TransactionApi.md#apiTransactionsUlidGet) | **GET** /transactions/{ulid} | Get a Transaction |
| [**apiTransactionsUlidPatch**](TransactionApi.md#apiTransactionsUlidPatch) | **PATCH** /transactions/{ulid} | Interact with a Transaction |


<a id="apiQuotesIdGet"></a>
# **apiQuotesIdGet**
> QuoteRead apiQuotesIdGet(id).execute();

Retrieve a Quote

Retrieves a Quote resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.TransactionApi;

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

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    String id = "id_example"; // String | Quote identifier
    try {
      QuoteRead result = apiInstance.apiQuotesIdGet(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#apiQuotesIdGet");
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
| **id** | **String**| Quote identifier | |

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
| **200** | Quote resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiQuotesIdPatch"></a>
# **apiQuotesIdPatch**
> QuoteRead apiQuotesIdPatch(id, quoteUpdate).execute();

Update a Quote prior to issuing a Transaction

Updates the Quote resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.TransactionApi;

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

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    String id = "id_example"; // String | Quote identifier
    QuoteUpdate quoteUpdate = new QuoteUpdate(); // QuoteUpdate | The updated Quote resource
    try {
      QuoteRead result = apiInstance.apiQuotesIdPatch(id, quoteUpdate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#apiQuotesIdPatch");
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
| **id** | **String**| Quote identifier | |
| **quoteUpdate** | [**QuoteUpdate**](QuoteUpdate.md)| The updated Quote resource | |

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
| **200** | Quote resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiQuotesPost"></a>
# **apiQuotesPost**
> QuoteRead apiQuotesPost(quoteWrite).execute();

Create a Quote prior to issuing a Transaction

Creates a Quote resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.TransactionApi;

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

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    QuoteWrite quoteWrite = new QuoteWrite(); // QuoteWrite | The new Quote resource
    try {
      QuoteRead result = apiInstance.apiQuotesPost(quoteWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#apiQuotesPost");
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
| **quoteWrite** | [**QuoteWrite**](QuoteWrite.md)| The new Quote resource | |

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
| **201** | Quote resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiTransactionsGetCollection"></a>
# **apiTransactionsGetCollection**
> List&lt;TransactionCollectionRead&gt; apiTransactionsGetCollection().page(page).orderCreatedAt(orderCreatedAt).orderUpdatedAt(orderUpdatedAt).createdAtBefore(createdAtBefore).createdAtStrictlyBefore(createdAtStrictlyBefore).createdAtAfter(createdAtAfter).createdAtStrictlyAfter(createdAtStrictlyAfter).updatedAtBefore(updatedAtBefore).updatedAtStrictlyBefore(updatedAtStrictlyBefore).updatedAtAfter(updatedAtAfter).updatedAtStrictlyAfter(updatedAtStrictlyAfter).status(status).status2(status2).offerTitle(offerTitle).execute();

List all Transaction

Retrieve a list of Transaction paginated

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    Integer page = 1; // Integer | The collection page number
    String orderCreatedAt = "asc"; // String | 
    String orderUpdatedAt = "asc"; // String | 
    String createdAtBefore = "createdAtBefore_example"; // String | 
    String createdAtStrictlyBefore = "createdAtStrictlyBefore_example"; // String | 
    String createdAtAfter = "createdAtAfter_example"; // String | 
    String createdAtStrictlyAfter = "createdAtStrictlyAfter_example"; // String | 
    String updatedAtBefore = "updatedAtBefore_example"; // String | 
    String updatedAtStrictlyBefore = "updatedAtStrictlyBefore_example"; // String | 
    String updatedAtAfter = "updatedAtAfter_example"; // String | 
    String updatedAtStrictlyAfter = "updatedAtStrictlyAfter_example"; // String | 
    String status = "CREATED"; // String | Filter on a specific value of status
    List<String> status2 = Arrays.asList(new ArrayList<>()); // List<String> | Filter on a limited subset of status
    String offerTitle = "offerTitle_example"; // String | 
    try {
      List<TransactionCollectionRead> result = apiInstance.apiTransactionsGetCollection()
            .page(page)
            .orderCreatedAt(orderCreatedAt)
            .orderUpdatedAt(orderUpdatedAt)
            .createdAtBefore(createdAtBefore)
            .createdAtStrictlyBefore(createdAtStrictlyBefore)
            .createdAtAfter(createdAtAfter)
            .createdAtStrictlyAfter(createdAtStrictlyAfter)
            .updatedAtBefore(updatedAtBefore)
            .updatedAtStrictlyBefore(updatedAtStrictlyBefore)
            .updatedAtAfter(updatedAtAfter)
            .updatedAtStrictlyAfter(updatedAtStrictlyAfter)
            .status(status)
            .status2(status2)
            .offerTitle(offerTitle)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#apiTransactionsGetCollection");
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
| **orderCreatedAt** | **String**|  | [optional] [enum: asc, desc] |
| **orderUpdatedAt** | **String**|  | [optional] [enum: asc, desc] |
| **createdAtBefore** | **String**|  | [optional] |
| **createdAtStrictlyBefore** | **String**|  | [optional] |
| **createdAtAfter** | **String**|  | [optional] |
| **createdAtStrictlyAfter** | **String**|  | [optional] |
| **updatedAtBefore** | **String**|  | [optional] |
| **updatedAtStrictlyBefore** | **String**|  | [optional] |
| **updatedAtAfter** | **String**|  | [optional] |
| **updatedAtStrictlyAfter** | **String**|  | [optional] |
| **status** | **String**| Filter on a specific value of status | [optional] [enum: CREATED, AUTHORIZED, REFUSED, ACCEPTED, SHIPPED, IN_TRANSIT, BLOCKED, DELIVERED, COMPLETED, DISPUTED, CANCELLED] |
| **status2** | [**List&lt;String&gt;**](String.md)| Filter on a limited subset of status | [optional] [enum: CREATED, AUTHORIZED, REFUSED, ACCEPTED, SHIPPED, IN_TRANSIT, BLOCKED, DELIVERED, COMPLETED, DISPUTED, CANCELLED] |
| **offerTitle** | **String**|  | [optional] |

### Return type

[**List&lt;TransactionCollectionRead&gt;**](TransactionCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiTransactionsPost"></a>
# **apiTransactionsPost**
> TransactionRead apiTransactionsPost(transactionWrite).execute();

Initialize a new Transaction

Create a new Transaction for Preauthorization

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    TransactionWrite transactionWrite = new TransactionWrite(); // TransactionWrite | The new Transaction resource
    try {
      TransactionRead result = apiInstance.apiTransactionsPost(transactionWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#apiTransactionsPost");
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
| **transactionWrite** | [**TransactionWrite**](TransactionWrite.md)| The new Transaction resource | |

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
| **201** | Transaction resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiTransactionsUlidGet"></a>
# **apiTransactionsUlidGet**
> TransactionRead apiTransactionsUlidGet(ulid).execute();

Get a Transaction

Retrieve a single Transaction by ID

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    String ulid = "ulid_example"; // String | Transaction identifier
    try {
      TransactionRead result = apiInstance.apiTransactionsUlidGet(ulid)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#apiTransactionsUlidGet");
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
| **ulid** | **String**| Transaction identifier | |

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
| **200** | Transaction resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiTransactionsUlidPatch"></a>
# **apiTransactionsUlidPatch**
> TransactionRead apiTransactionsUlidPatch(ulid, transactionUpdate).execute();

Interact with a Transaction

Make decision upon a Transaction in order to make it evolve

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    String ulid = "ulid_example"; // String | Transaction identifier
    TransactionUpdate transactionUpdate = new TransactionUpdate(); // TransactionUpdate | The updated Transaction resource
    try {
      TransactionRead result = apiInstance.apiTransactionsUlidPatch(ulid, transactionUpdate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#apiTransactionsUlidPatch");
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
| **ulid** | **String**| Transaction identifier | |
| **transactionUpdate** | [**TransactionUpdate**](TransactionUpdate.md)| The updated Transaction resource | |

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
| **200** | Transaction resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

