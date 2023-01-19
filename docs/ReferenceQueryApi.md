# ReferenceQueryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1ReferenceCountFuncctxGet**](ReferenceQueryApi.md#apiV1ReferenceCountFuncctxGet) | **GET** /api/v1/reference/count/funcctx | funcctx query by ref |
| [**apiV1ReferenceCountFuncctxReverseGet**](ReferenceQueryApi.md#apiV1ReferenceCountFuncctxReverseGet) | **GET** /api/v1/reference/count/funcctx/reverse | funcctx query by referenced |


<a name="apiV1ReferenceCountFuncctxGet"></a>
# **apiV1ReferenceCountFuncctxGet**
> List&lt;Sibyl2FunctionContextSlim&gt; apiV1ReferenceCountFuncctxGet(repo, rev, moreThan, lessThan)

funcctx query by ref

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferenceQueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceQueryApi apiInstance = new ReferenceQueryApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    Integer moreThan = 56; // Integer | moreThan
    Integer lessThan = 56; // Integer | lessThan
    try {
      List<Sibyl2FunctionContextSlim> result = apiInstance.apiV1ReferenceCountFuncctxGet(repo, rev, moreThan, lessThan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceQueryApi#apiV1ReferenceCountFuncctxGet");
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
| **moreThan** | **Integer**| moreThan | |
| **lessThan** | **Integer**| lessThan | |

### Return type

[**List&lt;Sibyl2FunctionContextSlim&gt;**](Sibyl2FunctionContextSlim.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1ReferenceCountFuncctxReverseGet"></a>
# **apiV1ReferenceCountFuncctxReverseGet**
> List&lt;Sibyl2FunctionContextSlim&gt; apiV1ReferenceCountFuncctxReverseGet(repo, rev, moreThan, lessThan)

funcctx query by referenced

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferenceQueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceQueryApi apiInstance = new ReferenceQueryApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    Integer moreThan = 56; // Integer | moreThan
    Integer lessThan = 56; // Integer | lessThan
    try {
      List<Sibyl2FunctionContextSlim> result = apiInstance.apiV1ReferenceCountFuncctxReverseGet(repo, rev, moreThan, lessThan);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceQueryApi#apiV1ReferenceCountFuncctxReverseGet");
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
| **moreThan** | **Integer**| moreThan | |
| **lessThan** | **Integer**| lessThan | |

### Return type

[**List&lt;Sibyl2FunctionContextSlim&gt;**](Sibyl2FunctionContextSlim.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

