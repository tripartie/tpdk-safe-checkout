# SafeCheckoutApi

All URIs are relative to *https://staging-api.tripartie.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiOffersGetCollection**](SafeCheckoutApi.md#apiOffersGetCollection) | **GET** /offers | Search amongst Offers |
| [**apiOffersPost**](SafeCheckoutApi.md#apiOffersPost) | **POST** /offers | Create a public link for Offer |
| [**apiOffersUlidGet**](SafeCheckoutApi.md#apiOffersUlidGet) | **GET** /offers/{ulid} | Fetch a Offer details |
| [**apiOffersUlidPatch**](SafeCheckoutApi.md#apiOffersUlidPatch) | **PATCH** /offers/{ulid} | Update existing Offer |
| [**apiOffersUlidmediasIdDelete**](SafeCheckoutApi.md#apiOffersUlidmediasIdDelete) | **DELETE** /offers/{ulid}/medias/{id} | Removes the Media resource. |
| [**apiOffersUlidmediasPost**](SafeCheckoutApi.md#apiOffersUlidmediasPost) | **POST** /offers/{ulid}/medias | Upload a picture for a given Offer |


<a id="apiOffersGetCollection"></a>
# **apiOffersGetCollection**
> List&lt;OfferCollectionRead&gt; apiOffersGetCollection().page(page).title(title).publicUrl(publicUrl).publicUrl2(publicUrl2).unitPrice(unitPrice).unitPrice2(unitPrice2).itemCount(itemCount).itemCount2(itemCount2).createdAtBefore(createdAtBefore).createdAtStrictlyBefore(createdAtStrictlyBefore).createdAtAfter(createdAtAfter).createdAtStrictlyAfter(createdAtStrictlyAfter).metadata(metadata).offerMetadata(offerMetadata).sellerMetadata(sellerMetadata).nature(nature).condition(condition).status(status).shippingAllowed(shippingAllowed).execute();

Search amongst Offers

Retrieves the collection of Offer resources.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.SafeCheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    SafeCheckoutApi apiInstance = new SafeCheckoutApi(defaultClient);
    Integer page = 1; // Integer | The collection page number
    String title = "title_example"; // String | 
    String publicUrl = "publicUrl_example"; // String | 
    List<String> publicUrl2 = Arrays.asList(); // List<String> | 
    String unitPrice = "unitPrice_example"; // String | 
    List<String> unitPrice2 = Arrays.asList(); // List<String> | 
    Integer itemCount = 56; // Integer | 
    List<Integer> itemCount2 = Arrays.asList(); // List<Integer> | 
    String createdAtBefore = "createdAtBefore_example"; // String | 
    String createdAtStrictlyBefore = "createdAtStrictlyBefore_example"; // String | 
    String createdAtAfter = "createdAtAfter_example"; // String | 
    String createdAtStrictlyAfter = "createdAtStrictlyAfter_example"; // String | 
    List<String> metadata = Arrays.asList(new ArrayList<>()); // List<String> | Flattened OrderedMap for metadata. Must be a multiple of two items count. Explicitly set \"null\" for desired value.
    List<String> offerMetadata = Arrays.asList(new ArrayList<>()); // List<String> | Flattened OrderedMap for offer.metadata. Must be a multiple of two items count. Explicitly set \"null\" for desired value.
    List<String> sellerMetadata = Arrays.asList(new ArrayList<>()); // List<String> | Flattened OrderedMap for seller.metadata. Must be a multiple of two items count. Explicitly set \"null\" for desired value.
    String nature = "service"; // String | Filter on a limited subset of nature
    String condition = "NEW"; // String | Filter on a limited subset of condition
    String status = "issued"; // String | Filter on a limited subset of status
    Boolean shippingAllowed = true; // Boolean | 
    try {
      List<OfferCollectionRead> result = apiInstance.apiOffersGetCollection()
            .page(page)
            .title(title)
            .publicUrl(publicUrl)
            .publicUrl2(publicUrl2)
            .unitPrice(unitPrice)
            .unitPrice2(unitPrice2)
            .itemCount(itemCount)
            .itemCount2(itemCount2)
            .createdAtBefore(createdAtBefore)
            .createdAtStrictlyBefore(createdAtStrictlyBefore)
            .createdAtAfter(createdAtAfter)
            .createdAtStrictlyAfter(createdAtStrictlyAfter)
            .metadata(metadata)
            .offerMetadata(offerMetadata)
            .sellerMetadata(sellerMetadata)
            .nature(nature)
            .condition(condition)
            .status(status)
            .shippingAllowed(shippingAllowed)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SafeCheckoutApi#apiOffersGetCollection");
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
| **title** | **String**|  | [optional] |
| **publicUrl** | **String**|  | [optional] |
| **publicUrl2** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **unitPrice** | **String**|  | [optional] |
| **unitPrice2** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **itemCount** | **Integer**|  | [optional] |
| **itemCount2** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **createdAtBefore** | **String**|  | [optional] |
| **createdAtStrictlyBefore** | **String**|  | [optional] |
| **createdAtAfter** | **String**|  | [optional] |
| **createdAtStrictlyAfter** | **String**|  | [optional] |
| **metadata** | [**List&lt;String&gt;**](String.md)| Flattened OrderedMap for metadata. Must be a multiple of two items count. Explicitly set \&quot;null\&quot; for desired value. | [optional] |
| **offerMetadata** | [**List&lt;String&gt;**](String.md)| Flattened OrderedMap for offer.metadata. Must be a multiple of two items count. Explicitly set \&quot;null\&quot; for desired value. | [optional] |
| **sellerMetadata** | [**List&lt;String&gt;**](String.md)| Flattened OrderedMap for seller.metadata. Must be a multiple of two items count. Explicitly set \&quot;null\&quot; for desired value. | [optional] |
| **nature** | **String**| Filter on a limited subset of nature | [optional] [enum: service, physical_item, dematerialized_item, rent_item] |
| **condition** | **String**| Filter on a limited subset of condition | [optional] [enum: NEW, USED, DAMAGED, DETERIORATED, UNRECOVERABLE] |
| **status** | **String**| Filter on a limited subset of status | [optional] [enum: issued, active, fulfilled, expired] |
| **shippingAllowed** | **Boolean**|  | [optional] |

### Return type

[**List&lt;OfferCollectionRead&gt;**](OfferCollectionRead.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Offer collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiOffersPost"></a>
# **apiOffersPost**
> OfferPostCreationRead apiOffersPost(offerIndependentWrite).execute();

Create a public link for Offer

Create a public listening Offer linked to a specific Seller

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.SafeCheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    SafeCheckoutApi apiInstance = new SafeCheckoutApi(defaultClient);
    OfferIndependentWrite offerIndependentWrite = new OfferIndependentWrite(); // OfferIndependentWrite | The new Offer resource
    try {
      OfferPostCreationRead result = apiInstance.apiOffersPost(offerIndependentWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SafeCheckoutApi#apiOffersPost");
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
| **offerIndependentWrite** | [**OfferIndependentWrite**](OfferIndependentWrite.md)| The new Offer resource | |

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
| **201** | Offer resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiOffersUlidGet"></a>
# **apiOffersUlidGet**
> OfferRead apiOffersUlidGet(ulid).execute();

Fetch a Offer details

Retrieves a Offer resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.SafeCheckoutApi;

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

    SafeCheckoutApi apiInstance = new SafeCheckoutApi(defaultClient);
    String ulid = "ulid_example"; // String | Offer identifier
    try {
      OfferRead result = apiInstance.apiOffersUlidGet(ulid)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SafeCheckoutApi#apiOffersUlidGet");
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
| **ulid** | **String**| Offer identifier | |

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
| **200** | Offer resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiOffersUlidPatch"></a>
# **apiOffersUlidPatch**
> OfferPostCreationRead apiOffersUlidPatch(ulid, offerUpdate).execute();

Update existing Offer

Update your existing Offer and reuse existing generated link

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.SafeCheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    SafeCheckoutApi apiInstance = new SafeCheckoutApi(defaultClient);
    String ulid = "ulid_example"; // String | Offer identifier
    OfferUpdate offerUpdate = new OfferUpdate(); // OfferUpdate | The updated Offer resource
    try {
      OfferPostCreationRead result = apiInstance.apiOffersUlidPatch(ulid, offerUpdate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SafeCheckoutApi#apiOffersUlidPatch");
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
| **ulid** | **String**| Offer identifier | |
| **offerUpdate** | [**OfferUpdate**](OfferUpdate.md)| The updated Offer resource | |

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
| **200** | Offer resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiOffersUlidmediasIdDelete"></a>
# **apiOffersUlidmediasIdDelete**
> apiOffersUlidmediasIdDelete(ulid, id).execute();

Removes the Media resource.

Removes the Media resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.SafeCheckoutApi;

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

    SafeCheckoutApi apiInstance = new SafeCheckoutApi(defaultClient);
    String ulid = "ulid_example"; // String | 
    Integer id = 56; // Integer | 
    try {
      apiInstance.apiOffersUlidmediasIdDelete(ulid, id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SafeCheckoutApi#apiOffersUlidmediasIdDelete");
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
| **ulid** | **String**|  | |
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Media resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiOffersUlidmediasPost"></a>
# **apiOffersUlidmediasPost**
> MediaRead apiOffersUlidmediasPost(ulid)._file(_file).execute();

Upload a picture for a given Offer

Creates a Media resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.SafeCheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    SafeCheckoutApi apiInstance = new SafeCheckoutApi(defaultClient);
    String ulid = "ulid_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    try {
      MediaRead result = apiInstance.apiOffersUlidmediasPost(ulid)
            ._file(_file)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SafeCheckoutApi#apiOffersUlidmediasPost");
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
| **ulid** | **String**|  | |
| **_file** | **File**|  | [optional] |

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
| **201** | Media resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

