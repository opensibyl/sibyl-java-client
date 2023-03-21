# TagApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1TagFuncGet**](TagApi.md#apiV1TagFuncGet) | **GET** /api/v1/tag/func | query func by tag |
| [**apiV1TagFuncPost**](TagApi.md#apiV1TagFuncPost) | **POST** /api/v1/tag/func | create func tag |


<a name="apiV1TagFuncGet"></a>
# **apiV1TagFuncGet**
> List&lt;String&gt; apiV1TagFuncGet(repo, rev, tag)

query func by tag

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TagApi apiInstance = new TagApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String tag = "tag_example"; // String | tag
    try {
      List<String> result = apiInstance.apiV1TagFuncGet(repo, rev, tag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#apiV1TagFuncGet");
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
| **tag** | **String**| tag | |

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

<a name="apiV1TagFuncPost"></a>
# **apiV1TagFuncPost**
> apiV1TagFuncPost(payload)

create func tag

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TagApi apiInstance = new TagApi(defaultClient);
    ServiceTagUpload payload = new ServiceTagUpload(); // ServiceTagUpload | tag upload payload
    try {
      apiInstance.apiV1TagFuncPost(payload);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#apiV1TagFuncPost");
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
| **payload** | [**ServiceTagUpload**](ServiceTagUpload.md)| tag upload payload | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

