# RegexQueryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1RegexClazzGet**](RegexQueryApi.md#apiV1RegexClazzGet) | **GET** /api/v1/regex/clazz | clazz query |
| [**apiV1RegexFuncGet**](RegexQueryApi.md#apiV1RegexFuncGet) | **GET** /api/v1/regex/func | func query |
| [**apiV1RegexFuncctxGet**](RegexQueryApi.md#apiV1RegexFuncctxGet) | **GET** /api/v1/regex/funcctx | func ctx query |


<a name="apiV1RegexClazzGet"></a>
# **apiV1RegexClazzGet**
> List&lt;ObjectClazzServiceDTO&gt; apiV1RegexClazzGet(repo, rev, field, regex)

clazz query

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.RegexQueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RegexQueryApi apiInstance = new RegexQueryApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String field = "field_example"; // String | field
    String regex = "regex_example"; // String | regex
    try {
      List<ObjectClazzServiceDTO> result = apiInstance.apiV1RegexClazzGet(repo, rev, field, regex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegexQueryApi#apiV1RegexClazzGet");
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
| **field** | **String**| field | |
| **regex** | **String**| regex | |

### Return type

[**List&lt;ObjectClazzServiceDTO&gt;**](ObjectClazzServiceDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1RegexFuncGet"></a>
# **apiV1RegexFuncGet**
> List&lt;ObjectFunctionServiceDTO&gt; apiV1RegexFuncGet(repo, rev, field, regex)

func query

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.RegexQueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RegexQueryApi apiInstance = new RegexQueryApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String field = "field_example"; // String | field
    String regex = "regex_example"; // String | regex
    try {
      List<ObjectFunctionServiceDTO> result = apiInstance.apiV1RegexFuncGet(repo, rev, field, regex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegexQueryApi#apiV1RegexFuncGet");
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
| **field** | **String**| field | |
| **regex** | **String**| regex | |

### Return type

[**List&lt;ObjectFunctionServiceDTO&gt;**](ObjectFunctionServiceDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1RegexFuncctxGet"></a>
# **apiV1RegexFuncctxGet**
> List&lt;ObjectFuncCtxServiceDTO&gt; apiV1RegexFuncctxGet(repo, rev, field, regex)

func ctx query

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.RegexQueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RegexQueryApi apiInstance = new RegexQueryApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String field = "field_example"; // String | field
    String regex = "regex_example"; // String | regex
    try {
      List<ObjectFuncCtxServiceDTO> result = apiInstance.apiV1RegexFuncctxGet(repo, rev, field, regex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegexQueryApi#apiV1RegexFuncctxGet");
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
| **field** | **String**| field | |
| **regex** | **String**| regex | |

### Return type

[**List&lt;ObjectFuncCtxServiceDTO&gt;**](ObjectFuncCtxServiceDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

