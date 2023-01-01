# MainApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1ClazzGet**](MainApi.md#apiV1ClazzGet) | **GET** /api/v1/clazz | class query |
| [**apiV1FileGet**](MainApi.md#apiV1FileGet) | **GET** /api/v1/file | file query |
| [**apiV1FuncGet**](MainApi.md#apiV1FuncGet) | **GET** /api/v1/func | func query |
| [**apiV1FuncctxGet**](MainApi.md#apiV1FuncctxGet) | **GET** /api/v1/funcctx | func ctx query |
| [**apiV1RepoGet**](MainApi.md#apiV1RepoGet) | **GET** /api/v1/repo | repo query |
| [**apiV1RevGet**](MainApi.md#apiV1RevGet) | **GET** /api/v1/rev | rev query |


<a name="apiV1ClazzGet"></a>
# **apiV1ClazzGet**
> List&lt;Sibyl2ClazzWithPath&gt; apiV1ClazzGet(repo, rev, _file)

class query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MainApi;

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

<a name="apiV1FileGet"></a>
# **apiV1FileGet**
> List&lt;String&gt; apiV1FileGet(repo, rev)

file query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MainApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MainApi apiInstance = new MainApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    try {
      List<String> result = apiInstance.apiV1FileGet(repo, rev);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MainApi#apiV1FileGet");
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

<a name="apiV1FuncGet"></a>
# **apiV1FuncGet**
> List&lt;ObjectFunctionWithSignature&gt; apiV1FuncGet(repo, rev, _file, lines)

func query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MainApi;

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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MainApi;

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
import org.openapitools.client.api.MainApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MainApi apiInstance = new MainApi(defaultClient);
    try {
      List<String> result = apiInstance.apiV1RepoGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MainApi#apiV1RepoGet");
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
import org.openapitools.client.api.MainApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    MainApi apiInstance = new MainApi(defaultClient);
    String repo = "repo_example"; // String | rev search by repo
    try {
      List<String> result = apiInstance.apiV1RevGet(repo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MainApi#apiV1RevGet");
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

