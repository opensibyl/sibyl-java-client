# MainApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1ClazzGet**](MainApi.md#apiV1ClazzGet) | **GET** /api/v1/clazz | class query |
| [**apiV1FuncGet**](MainApi.md#apiV1FuncGet) | **GET** /api/v1/func | func query |
| [**apiV1FuncctxGet**](MainApi.md#apiV1FuncctxGet) | **GET** /api/v1/funcctx | func ctx query |


<a name="apiV1ClazzGet"></a>
# **apiV1ClazzGet**
> List&lt;Sibyl2ClazzWithPath&gt; apiV1ClazzGet(repo, rev, _file)

class query

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.MainApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MainApi apiInstance = new MainApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String _file = "_file_example"; // String | file
    try {
      List<Sibyl2ClazzWithPath> result = apiInstance.apiV1ClazzGet(repo, rev, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MainApi#apiV1ClazzGet");
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
| **_file** | **String**| file | |

### Return type

[**List&lt;Sibyl2ClazzWithPath&gt;**](Sibyl2ClazzWithPath.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1FuncGet"></a>
# **apiV1FuncGet**
> List&lt;ObjectFunctionWithSignature&gt; apiV1FuncGet(repo, rev, _file, lines)

func query

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.MainApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MainApi apiInstance = new MainApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String _file = "_file_example"; // String | file
    String lines = "lines_example"; // String | specific lines
    try {
      List<ObjectFunctionWithSignature> result = apiInstance.apiV1FuncGet(repo, rev, _file, lines);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MainApi#apiV1FuncGet");
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
| **_file** | **String**| file | |
| **lines** | **String**| specific lines | [optional] |

### Return type

[**List&lt;ObjectFunctionWithSignature&gt;**](ObjectFunctionWithSignature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1FuncctxGet"></a>
# **apiV1FuncctxGet**
> List&lt;Sibyl2FunctionContext&gt; apiV1FuncctxGet(repo, rev, _file, lines)

func ctx query

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.MainApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MainApi apiInstance = new MainApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String _file = "_file_example"; // String | file
    String lines = "lines_example"; // String | specific lines
    try {
      List<Sibyl2FunctionContext> result = apiInstance.apiV1FuncctxGet(repo, rev, _file, lines);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MainApi#apiV1FuncctxGet");
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
| **_file** | **String**| file | |
| **lines** | **String**| specific lines | [optional] |

### Return type

[**List&lt;Sibyl2FunctionContext&gt;**](Sibyl2FunctionContext.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

