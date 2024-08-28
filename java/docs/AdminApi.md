# AdminApi

All URIs are relative to *https://staging-api.tripartie.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiApiClientsGetCollection**](AdminApi.md#apiApiClientsGetCollection) | **GET** /api-clients | Retrieves the collection of ApiClient resources. |
| [**apiApiClientsIdentifierDelete**](AdminApi.md#apiApiClientsIdentifierDelete) | **DELETE** /api-clients/{identifier} | Removes the ApiClient resource. |
| [**apiApiClientsIdentifierGet**](AdminApi.md#apiApiClientsIdentifierGet) | **GET** /api-clients/{identifier} | Retrieves a ApiClient resource. |
| [**apiApiClientsPost**](AdminApi.md#apiApiClientsPost) | **POST** /api-clients | Creates a ApiClient resource. |
| [**apiInvitePost**](AdminApi.md#apiInvitePost) | **POST** /invite | Organization invite |
| [**apiOrganizationsGetCollection**](AdminApi.md#apiOrganizationsGetCollection) | **GET** /organizations | Retrieves the collection of Organization resources. |
| [**apiOrganizationsIdGet**](AdminApi.md#apiOrganizationsIdGet) | **GET** /organizations/{id} | Retrieves a Organization resource. |
| [**apiUsersGetCollection**](AdminApi.md#apiUsersGetCollection) | **GET** /users | Retrieves the collection of User resources. |
| [**apiUsersIdDelete**](AdminApi.md#apiUsersIdDelete) | **DELETE** /users/{id} | Removes the User resource. |
| [**apiUsersIdGet**](AdminApi.md#apiUsersIdGet) | **GET** /users/{id} | Retrieves a User resource. |
| [**apiUsersIdPatch**](AdminApi.md#apiUsersIdPatch) | **PATCH** /users/{id} | Update your profile |
| [**apiUsersIddisablePatch**](AdminApi.md#apiUsersIddisablePatch) | **PATCH** /users/{id}/disable | Updates the User resource. |
| [**apiUsersIdemailPatch**](AdminApi.md#apiUsersIdemailPatch) | **PATCH** /users/{id}/email | Update user email |
| [**apiUsersIdemailValidationPatch**](AdminApi.md#apiUsersIdemailValidationPatch) | **PATCH** /users/{id}/email-validation | Validate email ownership |
| [**apiUsersIdenablePatch**](AdminApi.md#apiUsersIdenablePatch) | **PATCH** /users/{id}/enable | Updates the User resource. |
| [**apiUsersIdpasswordPatch**](AdminApi.md#apiUsersIdpasswordPatch) | **PATCH** /users/{id}/password | Change your password |
| [**apiUsersIdtotpSetupPatch**](AdminApi.md#apiUsersIdtotpSetupPatch) | **PATCH** /users/{id}/totp-setup | Setup an additional authentication factor |
| [**apiUsersIdtotpTogglePatch**](AdminApi.md#apiUsersIdtotpTogglePatch) | **PATCH** /users/{id}/totp-toggle | Disable the second authentication factor |
| [**authenticationPost**](AdminApi.md#authenticationPost) | **POST** /authentication | User authentication |


<a id="apiApiClientsGetCollection"></a>
# **apiApiClientsGetCollection**
> List&lt;ApiClientRead&gt; apiApiClientsGetCollection().page(page).execute();

Retrieves the collection of ApiClient resources.

Retrieves the collection of ApiClient resources.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    AdminApi apiInstance = new AdminApi(defaultClient);
    Integer page = 1; // Integer | The collection page number
    try {
      List<ApiClientRead> result = apiInstance.apiApiClientsGetCollection()
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiApiClientsGetCollection");
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

### Return type

[**List&lt;ApiClientRead&gt;**](ApiClientRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ApiClient collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiApiClientsIdentifierDelete"></a>
# **apiApiClientsIdentifierDelete**
> apiApiClientsIdentifierDelete(identifier).execute();

Removes the ApiClient resource.

Removes the ApiClient resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String identifier = "identifier_example"; // String | ApiClient identifier
    try {
      apiInstance.apiApiClientsIdentifierDelete(identifier)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiApiClientsIdentifierDelete");
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
| **identifier** | **String**| ApiClient identifier | |

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
| **204** | ApiClient resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiApiClientsIdentifierGet"></a>
# **apiApiClientsIdentifierGet**
> ApiClientRead apiApiClientsIdentifierGet(identifier).execute();

Retrieves a ApiClient resource.

Retrieves a ApiClient resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String identifier = "identifier_example"; // String | ApiClient identifier
    try {
      ApiClientRead result = apiInstance.apiApiClientsIdentifierGet(identifier)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiApiClientsIdentifierGet");
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
| **identifier** | **String**| ApiClient identifier | |

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
| **200** | ApiClient resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiApiClientsPost"></a>
# **apiApiClientsPost**
> ApiClientPostCreationRead apiApiClientsPost(apiClientWrite).execute();

Creates a ApiClient resource.

Creates a ApiClient resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    AdminApi apiInstance = new AdminApi(defaultClient);
    ApiClientWrite apiClientWrite = new ApiClientWrite(); // ApiClientWrite | The new ApiClient resource
    try {
      ApiClientPostCreationRead result = apiInstance.apiApiClientsPost(apiClientWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiApiClientsPost");
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
| **apiClientWrite** | [**ApiClientWrite**](ApiClientWrite.md)| The new ApiClient resource | |

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
| **201** | ApiClient resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiInvitePost"></a>
# **apiInvitePost**
> UserPostRegisterRead apiInvitePost(userInvite).execute();

Organization invite

Invite a user to your organization workspace

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

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

    AdminApi apiInstance = new AdminApi(defaultClient);
    UserInvite userInvite = new UserInvite(); // UserInvite | The new User resource
    try {
      UserPostRegisterRead result = apiInstance.apiInvitePost(userInvite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiInvitePost");
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
| **userInvite** | [**UserInvite**](UserInvite.md)| The new User resource | |

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
| **201** | User resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiOrganizationsGetCollection"></a>
# **apiOrganizationsGetCollection**
> List&lt;OrganizationCollectionRead&gt; apiOrganizationsGetCollection().page(page).itemsPerPage(itemsPerPage).name(name).execute();

Retrieves the collection of Organization resources.

Retrieves the collection of Organization resources.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

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

    AdminApi apiInstance = new AdminApi(defaultClient);
    Integer page = 1; // Integer | The collection page number
    Integer itemsPerPage = 30; // Integer | The number of items per page
    String name = "name_example"; // String | 
    try {
      List<OrganizationCollectionRead> result = apiInstance.apiOrganizationsGetCollection()
            .page(page)
            .itemsPerPage(itemsPerPage)
            .name(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiOrganizationsGetCollection");
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
| **itemsPerPage** | **Integer**| The number of items per page | [optional] [default to 30] |
| **name** | **String**|  | [optional] |

### Return type

[**List&lt;OrganizationCollectionRead&gt;**](OrganizationCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiOrganizationsIdGet"></a>
# **apiOrganizationsIdGet**
> OrganizationRead apiOrganizationsIdGet(id).execute();

Retrieves a Organization resource.

Retrieves a Organization resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

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

    AdminApi apiInstance = new AdminApi(defaultClient);
    String id = "id_example"; // String | Organization identifier
    try {
      OrganizationRead result = apiInstance.apiOrganizationsIdGet(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiOrganizationsIdGet");
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
| **id** | **String**| Organization identifier | |

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
| **200** | Organization resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersGetCollection"></a>
# **apiUsersGetCollection**
> List&lt;UserCollectionRead&gt; apiUsersGetCollection().page(page).execute();

Retrieves the collection of User resources.

Retrieves the collection of User resources.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    AdminApi apiInstance = new AdminApi(defaultClient);
    Integer page = 1; // Integer | The collection page number
    try {
      List<UserCollectionRead> result = apiInstance.apiUsersGetCollection()
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiUsersGetCollection");
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

### Return type

[**List&lt;UserCollectionRead&gt;**](UserCollectionRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User collection |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  * Content-Range - HTTP standardized header for partial content, used for the pagination <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersIdDelete"></a>
# **apiUsersIdDelete**
> apiUsersIdDelete(id).execute();

Removes the User resource.

Removes the User resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

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

    AdminApi apiInstance = new AdminApi(defaultClient);
    String id = "id_example"; // String | User identifier
    try {
      apiInstance.apiUsersIdDelete(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiUsersIdDelete");
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
| **id** | **String**| User identifier | |

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
| **204** | User resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersIdGet"></a>
# **apiUsersIdGet**
> UserSupportRead apiUsersIdGet(id).execute();

Retrieves a User resource.

Retrieves a User resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String id = "id_example"; // String | User identifier
    try {
      UserSupportRead result = apiInstance.apiUsersIdGet(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiUsersIdGet");
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
| **id** | **String**| User identifier | |

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
| **200** | User resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersIdPatch"></a>
# **apiUsersIdPatch**
> UserPostRegisterRead apiUsersIdPatch(id, userUpdate).execute();

Update your profile

Updates the User resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

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

    AdminApi apiInstance = new AdminApi(defaultClient);
    String id = "id_example"; // String | User identifier
    UserUpdate userUpdate = new UserUpdate(); // UserUpdate | The updated User resource
    try {
      UserPostRegisterRead result = apiInstance.apiUsersIdPatch(id, userUpdate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiUsersIdPatch");
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
| **id** | **String**| User identifier | |
| **userUpdate** | [**UserUpdate**](UserUpdate.md)| The updated User resource | |

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
| **200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersIddisablePatch"></a>
# **apiUsersIddisablePatch**
> UserUserSubscribed apiUsersIddisablePatch(id, body).execute();

Updates the User resource.

Updates the User resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String id = "id_example"; // String | User identifier
    Object body = null; // Object | The updated User resource
    try {
      UserUserSubscribed result = apiInstance.apiUsersIddisablePatch(id, body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiUsersIddisablePatch");
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
| **id** | **String**| User identifier | |
| **body** | **Object**| The updated User resource | |

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
| **200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersIdemailPatch"></a>
# **apiUsersIdemailPatch**
> UserUserRead apiUsersIdemailPatch(id, userUserEmailUpdate).execute();

Update user email

Updates the User resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

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

    AdminApi apiInstance = new AdminApi(defaultClient);
    String id = "id_example"; // String | User identifier
    UserUserEmailUpdate userUserEmailUpdate = new UserUserEmailUpdate(); // UserUserEmailUpdate | The updated User resource
    try {
      UserUserRead result = apiInstance.apiUsersIdemailPatch(id, userUserEmailUpdate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiUsersIdemailPatch");
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
| **id** | **String**| User identifier | |
| **userUserEmailUpdate** | [**UserUserEmailUpdate**](UserUserEmailUpdate.md)| The updated User resource | |

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
| **200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersIdemailValidationPatch"></a>
# **apiUsersIdemailValidationPatch**
> UserPostRegisterRead apiUsersIdemailValidationPatch(id, userEmailValidationWrite).execute();

Validate email ownership

Updates the User resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

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

    AdminApi apiInstance = new AdminApi(defaultClient);
    String id = "id_example"; // String | User identifier
    UserEmailValidationWrite userEmailValidationWrite = new UserEmailValidationWrite(); // UserEmailValidationWrite | The updated User resource
    try {
      UserPostRegisterRead result = apiInstance.apiUsersIdemailValidationPatch(id, userEmailValidationWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiUsersIdemailValidationPatch");
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
| **id** | **String**| User identifier | |
| **userEmailValidationWrite** | [**UserEmailValidationWrite**](UserEmailValidationWrite.md)| The updated User resource | |

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
| **200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersIdenablePatch"></a>
# **apiUsersIdenablePatch**
> UserUserSubscribed apiUsersIdenablePatch(id, body).execute();

Updates the User resource.

Updates the User resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String id = "id_example"; // String | User identifier
    Object body = null; // Object | The updated User resource
    try {
      UserUserSubscribed result = apiInstance.apiUsersIdenablePatch(id, body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiUsersIdenablePatch");
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
| **id** | **String**| User identifier | |
| **body** | **Object**| The updated User resource | |

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
| **200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersIdpasswordPatch"></a>
# **apiUsersIdpasswordPatch**
> UserUserRead apiUsersIdpasswordPatch(id, userUserPasswordUpdate).execute();

Change your password

Updates the User resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

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

    AdminApi apiInstance = new AdminApi(defaultClient);
    String id = "id_example"; // String | User identifier
    UserUserPasswordUpdate userUserPasswordUpdate = new UserUserPasswordUpdate(); // UserUserPasswordUpdate | The updated User resource
    try {
      UserUserRead result = apiInstance.apiUsersIdpasswordPatch(id, userUserPasswordUpdate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiUsersIdpasswordPatch");
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
| **id** | **String**| User identifier | |
| **userUserPasswordUpdate** | [**UserUserPasswordUpdate**](UserUserPasswordUpdate.md)| The updated User resource | |

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
| **200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersIdtotpSetupPatch"></a>
# **apiUsersIdtotpSetupPatch**
> UserTotpSetupRead apiUsersIdtotpSetupPatch(id, body).execute();

Setup an additional authentication factor

Updates the User resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

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

    AdminApi apiInstance = new AdminApi(defaultClient);
    String id = "id_example"; // String | User identifier
    Object body = null; // Object | The updated User resource
    try {
      UserTotpSetupRead result = apiInstance.apiUsersIdtotpSetupPatch(id, body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiUsersIdtotpSetupPatch");
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
| **id** | **String**| User identifier | |
| **body** | **Object**| The updated User resource | |

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
| **200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersIdtotpTogglePatch"></a>
# **apiUsersIdtotpTogglePatch**
> Object apiUsersIdtotpTogglePatch(id, userTotpToggleWrite).execute();

Disable the second authentication factor

Updates the User resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

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

    AdminApi apiInstance = new AdminApi(defaultClient);
    String id = "id_example"; // String | User identifier
    UserTotpToggleWrite userTotpToggleWrite = new UserTotpToggleWrite(); // UserTotpToggleWrite | The updated User resource
    try {
      Object result = apiInstance.apiUsersIdtotpTogglePatch(id, userTotpToggleWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#apiUsersIdtotpTogglePatch");
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
| **id** | **String**| User identifier | |
| **userTotpToggleWrite** | [**UserTotpToggleWrite**](UserTotpToggleWrite.md)| The updated User resource | |

### Return type

**Object**

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User resource updated |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="authenticationPost"></a>
# **authenticationPost**
> UserJwtCreated authenticationPost().userJwtWrite(userJwtWrite).execute();

User authentication

This endpoint is protected by a captcha, do not try to use it to consume our API. IP/CIDR to be banned upon fraudulent/irregular usage. Follow the oauth 2.0 authentication challenge as described in the documentation.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.AdminApi;

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

    AdminApi apiInstance = new AdminApi(defaultClient);
    UserJwtWrite userJwtWrite = new UserJwtWrite(); // UserJwtWrite | 
    try {
      UserJwtCreated result = apiInstance.authenticationPost()
            .userJwtWrite(userJwtWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#authenticationPost");
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
| **userJwtWrite** | [**UserJwtWrite**](UserJwtWrite.md)|  | [optional] |

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
| **200** |  |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** |  |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

