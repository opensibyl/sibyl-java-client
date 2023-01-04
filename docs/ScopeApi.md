# ScopeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1FileGet**](ScopeApi.md#apiV1FileGet) | **GET** /api/v1/file | file query |
| [**apiV1RepoGet**](ScopeApi.md#apiV1RepoGet) | **GET** /api/v1/repo | repo query |
| [**apiV1RevGet**](ScopeApi.md#apiV1RevGet) | **GET** /api/v1/rev | rev query |


<a name="apiV1FileGet"></a>
# **apiV1FileGet**
> List&lt;String&gt; apiV1FileGet(repo, rev, includeRegex)

file query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScopeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ScopeApi apiInstance = new ScopeApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String includeRegex = "includeRegex_example"; // String | includeRegex
    try {
      List<String> result = apiInstance.apiV1FileGet(repo, rev, includeRegex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScopeApi#apiV1FileGet");
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
| **repo** | **String**| repo | |
| **rev** | **String**| rev | |
| **includeRegex** | **String**| includeRegex | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1RepoGet"></a>
# **apiV1RepoGet**
> List&lt;String&gt; apiV1RepoGet()

repo query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScopeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ScopeApi apiInstance = new ScopeApi(defaultClient);
    try {
      List<String> result = apiInstance.apiV1RepoGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScopeApi#apiV1RepoGet");
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

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1RevGet"></a>
# **apiV1RevGet**
> List&lt;String&gt; apiV1RevGet(repo)

rev query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScopeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ScopeApi apiInstance = new ScopeApi(defaultClient);
    String repo = "repo_example"; // String | rev search by repo
    try {
      List<String> result = apiInstance.apiV1RevGet(repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScopeApi#apiV1RevGet");
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
| **repo** | **String**| rev search by repo | |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

