# SignatureQueryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1SignatureFuncGet**](SignatureQueryApi.md#apiV1SignatureFuncGet) | **GET** /api/v1/signature/func | func query |
| [**apiV1SignatureFuncctxGet**](SignatureQueryApi.md#apiV1SignatureFuncctxGet) | **GET** /api/v1/signature/funcctx | funcctx query |
| [**apiV1SignatureFuncctxRchainGet**](SignatureQueryApi.md#apiV1SignatureFuncctxRchainGet) | **GET** /api/v1/signature/funcctx/rchain | funcctx reverse chain query |
| [**apiV1SignatureRegexFuncGet**](SignatureQueryApi.md#apiV1SignatureRegexFuncGet) | **GET** /api/v1/signature/regex/func | func query |


<a name="apiV1SignatureFuncGet"></a>
# **apiV1SignatureFuncGet**
> Sibyl2FunctionWithPath apiV1SignatureFuncGet(repo, rev, signature)

func query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignatureQueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SignatureQueryApi apiInstance = new SignatureQueryApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String signature = "signature_example"; // String | signature
    try {
      Sibyl2FunctionWithPath result = apiInstance.apiV1SignatureFuncGet(repo, rev, signature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatureQueryApi#apiV1SignatureFuncGet");
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
| **signature** | **String**| signature | |

### Return type

[**Sibyl2FunctionWithPath**](Sibyl2FunctionWithPath.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1SignatureFuncctxGet"></a>
# **apiV1SignatureFuncctxGet**
> Sibyl2FunctionContextSlim apiV1SignatureFuncctxGet(repo, rev, signature)

funcctx query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignatureQueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SignatureQueryApi apiInstance = new SignatureQueryApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String signature = "signature_example"; // String | signature
    try {
      Sibyl2FunctionContextSlim result = apiInstance.apiV1SignatureFuncctxGet(repo, rev, signature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatureQueryApi#apiV1SignatureFuncctxGet");
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
| **signature** | **String**| signature | |

### Return type

[**Sibyl2FunctionContextSlim**](Sibyl2FunctionContextSlim.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1SignatureFuncctxRchainGet"></a>
# **apiV1SignatureFuncctxRchainGet**
> ServiceFunctionContextReverseChain apiV1SignatureFuncctxRchainGet(repo, rev, signature, depth)

funcctx reverse chain query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignatureQueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SignatureQueryApi apiInstance = new SignatureQueryApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String signature = "signature_example"; // String | signature
    String depth = "depth_example"; // String | depth
    try {
      ServiceFunctionContextReverseChain result = apiInstance.apiV1SignatureFuncctxRchainGet(repo, rev, signature, depth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatureQueryApi#apiV1SignatureFuncctxRchainGet");
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
| **signature** | **String**| signature | |
| **depth** | **String**| depth | |

### Return type

[**ServiceFunctionContextReverseChain**](ServiceFunctionContextReverseChain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1SignatureRegexFuncGet"></a>
# **apiV1SignatureRegexFuncGet**
> List&lt;String&gt; apiV1SignatureRegexFuncGet(repo, rev, regex)

func query

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SignatureQueryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SignatureQueryApi apiInstance = new SignatureQueryApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String regex = "regex_example"; // String | regex
    try {
      List<String> result = apiInstance.apiV1SignatureRegexFuncGet(repo, rev, regex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignatureQueryApi#apiV1SignatureRegexFuncGet");
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
| **regex** | **String**| regex | |

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

