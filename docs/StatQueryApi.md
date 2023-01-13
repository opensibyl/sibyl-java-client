# StatQueryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1RevStatGet**](StatQueryApi.md#apiV1RevStatGet) | **GET** /api/v1/rev/stat | rev stat |


<a name="apiV1RevStatGet"></a>
# **apiV1RevStatGet**
> ServiceRevStat apiV1RevStatGet(repo, rev)

rev stat

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatQueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    StatQueryApi apiInstance = new StatQueryApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    try {
      ServiceRevStat result = apiInstance.apiV1RevStatGet(repo, rev);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatQueryApi#apiV1RevStatGet");
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

[**ServiceRevStat**](ServiceRevStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

