# ExtrasApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1ClazzDiffGet**](ExtrasApi.md#apiV1ClazzDiffGet) | **GET** /api/v1/clazz/diff | clazz diff query |
| [**apiV1FuncDiffGet**](ExtrasApi.md#apiV1FuncDiffGet) | **GET** /api/v1/func/diff | func diff query |
| [**apiV1FuncctxDiffGet**](ExtrasApi.md#apiV1FuncctxDiffGet) | **GET** /api/v1/funcctx/diff | func ctx diff query |


<a name="apiV1ClazzDiffGet"></a>
# **apiV1ClazzDiffGet**
> Map&lt;String, List&lt;Sibyl2ClazzWithPath&gt;&gt; apiV1ClazzDiffGet(repo, rev, diff)

clazz diff query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExtrasApi apiInstance = new ExtrasApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String diff = "diff_example"; // String | unified diff
    try {
      Map<String, List<Sibyl2ClazzWithPath>> result = apiInstance.apiV1ClazzDiffGet(repo, rev, diff);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtrasApi#apiV1ClazzDiffGet");
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
| **diff** | **String**| unified diff | |

### Return type

[**Map&lt;String, List&lt;Sibyl2ClazzWithPath&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1FuncDiffGet"></a>
# **apiV1FuncDiffGet**
> Map&lt;String, List&lt;Sibyl2FunctionWithPath&gt;&gt; apiV1FuncDiffGet(repo, rev, diff)

func diff query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExtrasApi apiInstance = new ExtrasApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String diff = "diff_example"; // String | unified diff
    try {
      Map<String, List<Sibyl2FunctionWithPath>> result = apiInstance.apiV1FuncDiffGet(repo, rev, diff);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtrasApi#apiV1FuncDiffGet");
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
| **diff** | **String**| unified diff | |

### Return type

[**Map&lt;String, List&lt;Sibyl2FunctionWithPath&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1FuncctxDiffGet"></a>
# **apiV1FuncctxDiffGet**
> Map&lt;String, List&lt;Sibyl2FunctionContext&gt;&gt; apiV1FuncctxDiffGet(repo, rev, diff)

func ctx diff query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExtrasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExtrasApi apiInstance = new ExtrasApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String diff = "diff_example"; // String | unified diff
    try {
      Map<String, List<Sibyl2FunctionContext>> result = apiInstance.apiV1FuncctxDiffGet(repo, rev, diff);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtrasApi#apiV1FuncctxDiffGet");
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
| **diff** | **String**| unified diff | |

### Return type

[**Map&lt;String, List&lt;Sibyl2FunctionContext&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

