# UserApi

All URIs are relative to *https://staging-api.tripartie.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiApiClientsGetCollection**](UserApi.md#apiApiClientsGetCollection) | **GET** /api-clients | Retrieves the collection of ApiClient resources. |
| [**apiApiClientsIdentifierDelete**](UserApi.md#apiApiClientsIdentifierDelete) | **DELETE** /api-clients/{identifier} | Removes the ApiClient resource. |
| [**apiApiClientsIdentifierGet**](UserApi.md#apiApiClientsIdentifierGet) | **GET** /api-clients/{identifier} | Retrieves a ApiClient resource. |
| [**apiApiClientsPost**](UserApi.md#apiApiClientsPost) | **POST** /api-clients | Creates a ApiClient resource. |
| [**apiInvitePost**](UserApi.md#apiInvitePost) | **POST** /invite | Organization invite |
| [**apiMeGet**](UserApi.md#apiMeGet) | **GET** /me | Retrieves a User resource. |
| [**apiRegisterPost**](UserApi.md#apiRegisterPost) | **POST** /register | Customer onboarding |
| [**apiUsersGetCollection**](UserApi.md#apiUsersGetCollection) | **GET** /users | Retrieves the collection of User resources. |
| [**apiUsersIdDelete**](UserApi.md#apiUsersIdDelete) | **DELETE** /users/{id} | Removes the User resource. |
| [**apiUsersIdGet**](UserApi.md#apiUsersIdGet) | **GET** /users/{id} | Retrieves a User resource. |
| [**apiUsersIdPatch**](UserApi.md#apiUsersIdPatch) | **PATCH** /users/{id} | Updates the User resource. |
| [**apiUsersIdavatarDelete**](UserApi.md#apiUsersIdavatarDelete) | **DELETE** /users/{id}/avatar | Unset your personal avatar |
| [**apiUsersIdavatarPost**](UserApi.md#apiUsersIdavatarPost) | **POST** /users/{id}/avatar | Upload your personal avatar |
| [**apiUsersIdemailPatch**](UserApi.md#apiUsersIdemailPatch) | **PATCH** /users/{id}/email | Update user email |
| [**apiUsersIdemailValidationPatch**](UserApi.md#apiUsersIdemailValidationPatch) | **PATCH** /users/{id}/email-validation | Validate email ownership |
| [**apiUsersIdenablePatch**](UserApi.md#apiUsersIdenablePatch) | **PATCH** /users/{id}/enable | Updates the User resource. |
| [**apiUsersIdpasswordPatch**](UserApi.md#apiUsersIdpasswordPatch) | **PATCH** /users/{id}/password | Updates the User resource. |
| [**apiUsersIdtotpSetupPatch**](UserApi.md#apiUsersIdtotpSetupPatch) | **PATCH** /users/{id}/totp-setup | Updates the User resource. |
| [**apiUsersIdtotpTogglePatch**](UserApi.md#apiUsersIdtotpTogglePatch) | **PATCH** /users/{id}/totp-toggle | Updates the User resource. |
| [**authenticationPost**](UserApi.md#authenticationPost) | **POST** /authentication | User authentication |


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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    Integer page = 1; // Integer | The collection page number
    try {
      List<ApiClientRead> result = apiInstance.apiApiClientsGetCollection()
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiApiClientsGetCollection");
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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String identifier = "identifier_example"; // String | ApiClient identifier
    try {
      apiInstance.apiApiClientsIdentifierDelete(identifier)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiApiClientsIdentifierDelete");
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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String identifier = "identifier_example"; // String | ApiClient identifier
    try {
      ApiClientRead result = apiInstance.apiApiClientsIdentifierGet(identifier)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiApiClientsIdentifierGet");
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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    ApiClientWrite apiClientWrite = new ApiClientWrite(); // ApiClientWrite | The new ApiClient resource
    try {
      ApiClientPostCreationRead result = apiInstance.apiApiClientsPost(apiClientWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiApiClientsPost");
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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure API key authorization: personaAuthKey
    ApiKeyAuth personaAuthKey = (ApiKeyAuth) defaultClient.getAuthentication("personaAuthKey");
    personaAuthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //personaAuthKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    UserInvite userInvite = new UserInvite(); // UserInvite | The new User resource
    try {
      UserPostRegisterRead result = apiInstance.apiInvitePost(userInvite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiInvitePost");
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

[jwtPersonalKey](../README.md#jwtPersonalKey), [personaAuthKey](../README.md#personaAuthKey), [oauth](../README.md#oauth)

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

<a id="apiMeGet"></a>
# **apiMeGet**
> UserAuthenticatedRead apiMeGet().execute();

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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure API key authorization: personaAuthKey
    ApiKeyAuth personaAuthKey = (ApiKeyAuth) defaultClient.getAuthentication("personaAuthKey");
    personaAuthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //personaAuthKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      UserAuthenticatedRead result = apiInstance.apiMeGet()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiMeGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserAuthenticatedRead**](UserAuthenticatedRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [personaAuthKey](../README.md#personaAuthKey), [oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User resource |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiRegisterPost"></a>
# **apiRegisterPost**
> UserPostRegisterRead apiRegisterPost(userWrite).execute();

Customer onboarding

Internal-use only, protected by a captcha. User first-enrollment

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure API key authorization: personaAuthKey
    ApiKeyAuth personaAuthKey = (ApiKeyAuth) defaultClient.getAuthentication("personaAuthKey");
    personaAuthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //personaAuthKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    UserWrite userWrite = new UserWrite(); // UserWrite | The new User resource
    try {
      UserPostRegisterRead result = apiInstance.apiRegisterPost(userWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiRegisterPost");
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
| **userWrite** | [**UserWrite**](UserWrite.md)| The new User resource | |

### Return type

[**UserPostRegisterRead**](UserPostRegisterRead.md)

### Authorization

[jwtPersonalKey](../README.md#jwtPersonalKey), [personaAuthKey](../README.md#personaAuthKey), [oauth](../README.md#oauth)

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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    Integer page = 1; // Integer | The collection page number
    try {
      List<UserCollectionRead> result = apiInstance.apiUsersGetCollection()
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersGetCollection");
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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | User identifier
    try {
      apiInstance.apiUsersIdDelete(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersIdDelete");
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

[jwtPersonalKey](../README.md#jwtPersonalKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | User resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | User identifier
    try {
      UserSupportRead result = apiInstance.apiUsersIdGet(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersIdGet");
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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure API key authorization: personaAuthKey
    ApiKeyAuth personaAuthKey = (ApiKeyAuth) defaultClient.getAuthentication("personaAuthKey");
    personaAuthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //personaAuthKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | User identifier
    UserUpdate userUpdate = new UserUpdate(); // UserUpdate | The updated User resource
    try {
      UserPostRegisterRead result = apiInstance.apiUsersIdPatch(id, userUpdate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersIdPatch");
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

[jwtPersonalKey](../README.md#jwtPersonalKey), [personaAuthKey](../README.md#personaAuthKey), [oauth](../README.md#oauth)

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

<a id="apiUsersIdavatarDelete"></a>
# **apiUsersIdavatarDelete**
> apiUsersIdavatarDelete(id).execute();

Unset your personal avatar

Removes the Media resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    Integer id = 56; // Integer | User identifier
    try {
      apiInstance.apiUsersIdavatarDelete(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersIdavatarDelete");
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
| **id** | **Integer**| User identifier | |

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
| **204** | Media resource deleted |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **404** | Resource not found |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **401** | Authentication required |  -  |
| **403** | Unauthorized access |  -  |
| **429** | Rate limit exhausted |  -  |
| **500** | Unexpected server error |  -  |

<a id="apiUsersIdavatarPost"></a>
# **apiUsersIdavatarPost**
> MediaRead apiUsersIdavatarPost(id)._file(_file).execute();

Upload your personal avatar

Creates a Media resource.

### Example
```java
// Import classes:
import com.tripartie.safecheckout.ApiClient;
import com.tripartie.safecheckout.ApiException;
import com.tripartie.safecheckout.Configuration;
import com.tripartie.safecheckout.auth.*;
import com.tripartie.safecheckout.models.*;
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    Integer id = 56; // Integer | User identifier
    File _file = new File("/path/to/file"); // File | 
    try {
      MediaRead result = apiInstance.apiUsersIdavatarPost(id)
            ._file(_file)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersIdavatarPost");
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
| **id** | **Integer**| User identifier | |
| **_file** | **File**|  | [optional] |

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
| **201** | Media resource created |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **400** | Invalid input |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
| **422** | Unprocessable entity |  * X-Rate-Limit - HTTP standardized header for rate limit consumption status <br>  |
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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure API key authorization: personaAuthKey
    ApiKeyAuth personaAuthKey = (ApiKeyAuth) defaultClient.getAuthentication("personaAuthKey");
    personaAuthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //personaAuthKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | User identifier
    UserUserEmailUpdate userUserEmailUpdate = new UserUserEmailUpdate(); // UserUserEmailUpdate | The updated User resource
    try {
      UserUserRead result = apiInstance.apiUsersIdemailPatch(id, userUserEmailUpdate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersIdemailPatch");
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

[jwtPersonalKey](../README.md#jwtPersonalKey), [personaAuthKey](../README.md#personaAuthKey), [oauth](../README.md#oauth)

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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure API key authorization: personaAuthKey
    ApiKeyAuth personaAuthKey = (ApiKeyAuth) defaultClient.getAuthentication("personaAuthKey");
    personaAuthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //personaAuthKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | User identifier
    UserEmailValidationWrite userEmailValidationWrite = new UserEmailValidationWrite(); // UserEmailValidationWrite | The updated User resource
    try {
      UserPostRegisterRead result = apiInstance.apiUsersIdemailValidationPatch(id, userEmailValidationWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersIdemailValidationPatch");
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

[jwtPersonalKey](../README.md#jwtPersonalKey), [personaAuthKey](../README.md#personaAuthKey), [oauth](../README.md#oauth)

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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | User identifier
    Object body = null; // Object | The updated User resource
    try {
      UserUserSubscribed result = apiInstance.apiUsersIdenablePatch(id, body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersIdenablePatch");
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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure API key authorization: personaAuthKey
    ApiKeyAuth personaAuthKey = (ApiKeyAuth) defaultClient.getAuthentication("personaAuthKey");
    personaAuthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //personaAuthKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | User identifier
    UserUserPasswordUpdate userUserPasswordUpdate = new UserUserPasswordUpdate(); // UserUserPasswordUpdate | The updated User resource
    try {
      UserUserRead result = apiInstance.apiUsersIdpasswordPatch(id, userUserPasswordUpdate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersIdpasswordPatch");
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

[jwtPersonalKey](../README.md#jwtPersonalKey), [personaAuthKey](../README.md#personaAuthKey), [oauth](../README.md#oauth)

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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure API key authorization: personaAuthKey
    ApiKeyAuth personaAuthKey = (ApiKeyAuth) defaultClient.getAuthentication("personaAuthKey");
    personaAuthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //personaAuthKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | User identifier
    Object body = null; // Object | The updated User resource
    try {
      UserTotpSetupRead result = apiInstance.apiUsersIdtotpSetupPatch(id, body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersIdtotpSetupPatch");
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

[jwtPersonalKey](../README.md#jwtPersonalKey), [personaAuthKey](../README.md#personaAuthKey), [oauth](../README.md#oauth)

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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure API key authorization: personaAuthKey
    ApiKeyAuth personaAuthKey = (ApiKeyAuth) defaultClient.getAuthentication("personaAuthKey");
    personaAuthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //personaAuthKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    String id = "id_example"; // String | User identifier
    UserTotpToggleWrite userTotpToggleWrite = new UserTotpToggleWrite(); // UserTotpToggleWrite | The updated User resource
    try {
      Object result = apiInstance.apiUsersIdtotpTogglePatch(id, userTotpToggleWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#apiUsersIdtotpTogglePatch");
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

[jwtPersonalKey](../README.md#jwtPersonalKey), [personaAuthKey](../README.md#personaAuthKey), [oauth](../README.md#oauth)

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
import com.tripartie.safecheckout.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging-api.tripartie.app");
    
    // Configure API key authorization: jwtPersonalKey
    ApiKeyAuth jwtPersonalKey = (ApiKeyAuth) defaultClient.getAuthentication("jwtPersonalKey");
    jwtPersonalKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //jwtPersonalKey.setApiKeyPrefix("Token");

    // Configure API key authorization: personaAuthKey
    ApiKeyAuth personaAuthKey = (ApiKeyAuth) defaultClient.getAuthentication("personaAuthKey");
    personaAuthKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //personaAuthKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: oauth
    OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
    oauth.setAccessToken("YOUR ACCESS TOKEN");

    UserApi apiInstance = new UserApi(defaultClient);
    UserJwtWrite userJwtWrite = new UserJwtWrite(); // UserJwtWrite | 
    try {
      UserJwtCreated result = apiInstance.authenticationPost()
            .userJwtWrite(userJwtWrite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#authenticationPost");
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

[jwtPersonalKey](../README.md#jwtPersonalKey), [personaAuthKey](../README.md#personaAuthKey), [oauth](../README.md#oauth)

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

