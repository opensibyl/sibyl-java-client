# ExperimentalApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1ClazzWithRuleGet**](ExperimentalApi.md#apiV1ClazzWithRuleGet) | **GET** /api/v1/clazz/with/rule | clazz query |
| [**apiV1FuncSignatureGet**](ExperimentalApi.md#apiV1FuncSignatureGet) | **GET** /api/v1/func/signature | func query |
| [**apiV1FuncWithRuleGet**](ExperimentalApi.md#apiV1FuncWithRuleGet) | **GET** /api/v1/func/with/rule | func query |
| [**apiV1FuncWithSignatureGet**](ExperimentalApi.md#apiV1FuncWithSignatureGet) | **GET** /api/v1/func/with/signature | func query |
| [**apiV1FuncctxWithRuleGet**](ExperimentalApi.md#apiV1FuncctxWithRuleGet) | **GET** /api/v1/funcctx/with/rule | func ctx query |


<a name="apiV1ClazzWithRuleGet"></a>
# **apiV1ClazzWithRuleGet**
> List&lt;Sibyl2ClazzWithPath&gt; apiV1ClazzWithRuleGet(repo, rev, rule)

clazz query

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.ExperimentalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExperimentalApi apiInstance = new ExperimentalApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String rule = "rule_example"; // String | rule
    try {
      List<Sibyl2ClazzWithPath> result = apiInstance.apiV1ClazzWithRuleGet(repo, rev, rule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentalApi#apiV1ClazzWithRuleGet");
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
| **rule** | **String**| rule | |

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

<a name="apiV1FuncSignatureGet"></a>
# **apiV1FuncSignatureGet**
> List&lt;String&gt; apiV1FuncSignatureGet(repo, rev, regex)

func query

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.ExperimentalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExperimentalApi apiInstance = new ExperimentalApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String regex = "regex_example"; // String | regex
    try {
      List<String> result = apiInstance.apiV1FuncSignatureGet(repo, rev, regex);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentalApi#apiV1FuncSignatureGet");
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

<a name="apiV1FuncWithRuleGet"></a>
# **apiV1FuncWithRuleGet**
> List&lt;Sibyl2FunctionWithPath&gt; apiV1FuncWithRuleGet(repo, rev, rule)

func query

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.ExperimentalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExperimentalApi apiInstance = new ExperimentalApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String rule = "rule_example"; // String | rule
    try {
      List<Sibyl2FunctionWithPath> result = apiInstance.apiV1FuncWithRuleGet(repo, rev, rule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentalApi#apiV1FuncWithRuleGet");
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
| **rule** | **String**| rule | |

### Return type

[**List&lt;Sibyl2FunctionWithPath&gt;**](Sibyl2FunctionWithPath.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="apiV1FuncWithSignatureGet"></a>
# **apiV1FuncWithSignatureGet**
> Sibyl2FunctionWithPath apiV1FuncWithSignatureGet(repo, rev, signature)

func query

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.ExperimentalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExperimentalApi apiInstance = new ExperimentalApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String signature = "signature_example"; // String | signature
    try {
      Sibyl2FunctionWithPath result = apiInstance.apiV1FuncWithSignatureGet(repo, rev, signature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentalApi#apiV1FuncWithSignatureGet");
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

<a name="apiV1FuncctxWithRuleGet"></a>
# **apiV1FuncctxWithRuleGet**
> List&lt;Sibyl2FunctionContext&gt; apiV1FuncctxWithRuleGet(repo, rev, rule)

func ctx query

### Example
```java
// Import classes:
import com.github.opensibyl.client.ApiClient;
import com.github.opensibyl.client.ApiException;
import com.github.opensibyl.client.Configuration;
import com.github.opensibyl.client.models.*;
import com.github.opensibyl.client.api.ExperimentalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ExperimentalApi apiInstance = new ExperimentalApi(defaultClient);
    String repo = "repo_example"; // String | repo
    String rev = "rev_example"; // String | rev
    String rule = "rule_example"; // String | rule
    try {
      List<Sibyl2FunctionContext> result = apiInstance.apiV1FuncctxWithRuleGet(repo, rev, rule);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentalApi#apiV1FuncctxWithRuleGet");
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
| **rule** | **String**| rule | |

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

