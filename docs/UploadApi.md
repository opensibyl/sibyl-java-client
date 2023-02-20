# UploadApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1ClazzPost**](UploadApi.md#apiV1ClazzPost) | **POST** /api/v1/clazz | upload class |
| [**apiV1FuncPost**](UploadApi.md#apiV1FuncPost) | **POST** /api/v1/func | upload functions |
| [**apiV1FuncctxPost**](UploadApi.md#apiV1FuncctxPost) | **POST** /api/v1/funcctx | upload functions ctx |


<a name="apiV1ClazzPost"></a>
# **apiV1ClazzPost**
> apiV1ClazzPost(payload)

upload class

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.UploadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UploadApi apiInstance = new UploadApi(defaultClient);
    ObjectClazzUploadUnit payload = new ObjectClazzUploadUnit(); // ObjectClazzUploadUnit | Payload description
    try {
      apiInstance.apiV1ClazzPost(payload);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadApi#apiV1ClazzPost");
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
| **payload** | [**ObjectClazzUploadUnit**](ObjectClazzUploadUnit.md)| Payload description | |

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

<a name="apiV1FuncPost"></a>
# **apiV1FuncPost**
> apiV1FuncPost(payload)

upload functions

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.UploadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UploadApi apiInstance = new UploadApi(defaultClient);
    ObjectFunctionUploadUnit payload = new ObjectFunctionUploadUnit(); // ObjectFunctionUploadUnit | Payload description
    try {
      apiInstance.apiV1FuncPost(payload);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadApi#apiV1FuncPost");
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
| **payload** | [**ObjectFunctionUploadUnit**](ObjectFunctionUploadUnit.md)| Payload description | |

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

<a name="apiV1FuncctxPost"></a>
# **apiV1FuncctxPost**
> apiV1FuncctxPost(payload)

upload functions ctx

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.UploadApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UploadApi apiInstance = new UploadApi(defaultClient);
    ObjectFunctionContextUploadUnit payload = new ObjectFunctionContextUploadUnit(); // ObjectFunctionContextUploadUnit | Payload description
    try {
      apiInstance.apiV1FuncctxPost(payload);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadApi#apiV1FuncctxPost");
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
| **payload** | [**ObjectFunctionContextUploadUnit**](ObjectFunctionContextUploadUnit.md)| Payload description | |

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

