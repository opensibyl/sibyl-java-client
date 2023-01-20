/*
 * openapi for sibyl2 server
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.opensibyl.client.api;

import com.github.opensibyl.client.*;
import com.github.opensibyl.client.model.Sibyl2ClazzWithPath;
import com.github.opensibyl.client.model.Sibyl2FunctionContext;
import com.github.opensibyl.client.model.Sibyl2FunctionWithPath;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExperimentalApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ExperimentalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExperimentalApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for apiV1ClazzWithRuleGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1ClazzWithRuleGetCall(String repo, String rev, String rule, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/clazz/with/rule";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (repo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("repo", repo));
        }

        if (rev != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rev", rev));
        }

        if (rule != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rule", rule));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV1ClazzWithRuleGetValidateBeforeCall(String repo, String rev, String rule, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1ClazzWithRuleGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1ClazzWithRuleGet(Async)");
        }

        // verify the required parameter 'rule' is set
        if (rule == null) {
            throw new ApiException("Missing the required parameter 'rule' when calling apiV1ClazzWithRuleGet(Async)");
        }

        return apiV1ClazzWithRuleGetCall(repo, rev, rule, _callback);

    }

    /**
     * clazz query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @return List&lt;Sibyl2ClazzWithPath&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Sibyl2ClazzWithPath> apiV1ClazzWithRuleGet(String repo, String rev, String rule) throws ApiException {
        ApiResponse<List<Sibyl2ClazzWithPath>> localVarResp = apiV1ClazzWithRuleGetWithHttpInfo(repo, rev, rule);
        return localVarResp.getData();
    }

    /**
     * clazz query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @return ApiResponse&lt;List&lt;Sibyl2ClazzWithPath&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Sibyl2ClazzWithPath>> apiV1ClazzWithRuleGetWithHttpInfo(String repo, String rev, String rule) throws ApiException {
        okhttp3.Call localVarCall = apiV1ClazzWithRuleGetValidateBeforeCall(repo, rev, rule, null);
        Type localVarReturnType = new TypeToken<List<Sibyl2ClazzWithPath>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * clazz query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1ClazzWithRuleGetAsync(String repo, String rev, String rule, final ApiCallback<List<Sibyl2ClazzWithPath>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1ClazzWithRuleGetValidateBeforeCall(repo, rev, rule, _callback);
        Type localVarReturnType = new TypeToken<List<Sibyl2ClazzWithPath>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1FuncSignatureGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param regex regex (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncSignatureGetCall(String repo, String rev, String regex, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/func/signature";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (repo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("repo", repo));
        }

        if (rev != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rev", rev));
        }

        if (regex != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("regex", regex));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV1FuncSignatureGetValidateBeforeCall(String repo, String rev, String regex, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1FuncSignatureGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1FuncSignatureGet(Async)");
        }

        // verify the required parameter 'regex' is set
        if (regex == null) {
            throw new ApiException("Missing the required parameter 'regex' when calling apiV1FuncSignatureGet(Async)");
        }

        return apiV1FuncSignatureGetCall(repo, rev, regex, _callback);

    }

    /**
     * func query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param regex regex (required)
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<String> apiV1FuncSignatureGet(String repo, String rev, String regex) throws ApiException {
        ApiResponse<List<String>> localVarResp = apiV1FuncSignatureGetWithHttpInfo(repo, rev, regex);
        return localVarResp.getData();
    }

    /**
     * func query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param regex regex (required)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<String>> apiV1FuncSignatureGetWithHttpInfo(String repo, String rev, String regex) throws ApiException {
        okhttp3.Call localVarCall = apiV1FuncSignatureGetValidateBeforeCall(repo, rev, regex, null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * func query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param regex regex (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncSignatureGetAsync(String repo, String rev, String regex, final ApiCallback<List<String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1FuncSignatureGetValidateBeforeCall(repo, rev, regex, _callback);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1FuncWithRuleGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncWithRuleGetCall(String repo, String rev, String rule, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/func/with/rule";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (repo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("repo", repo));
        }

        if (rev != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rev", rev));
        }

        if (rule != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rule", rule));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV1FuncWithRuleGetValidateBeforeCall(String repo, String rev, String rule, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1FuncWithRuleGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1FuncWithRuleGet(Async)");
        }

        // verify the required parameter 'rule' is set
        if (rule == null) {
            throw new ApiException("Missing the required parameter 'rule' when calling apiV1FuncWithRuleGet(Async)");
        }

        return apiV1FuncWithRuleGetCall(repo, rev, rule, _callback);

    }

    /**
     * func query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @return List&lt;Sibyl2FunctionWithPath&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Sibyl2FunctionWithPath> apiV1FuncWithRuleGet(String repo, String rev, String rule) throws ApiException {
        ApiResponse<List<Sibyl2FunctionWithPath>> localVarResp = apiV1FuncWithRuleGetWithHttpInfo(repo, rev, rule);
        return localVarResp.getData();
    }

    /**
     * func query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @return ApiResponse&lt;List&lt;Sibyl2FunctionWithPath&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Sibyl2FunctionWithPath>> apiV1FuncWithRuleGetWithHttpInfo(String repo, String rev, String rule) throws ApiException {
        okhttp3.Call localVarCall = apiV1FuncWithRuleGetValidateBeforeCall(repo, rev, rule, null);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionWithPath>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * func query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncWithRuleGetAsync(String repo, String rev, String rule, final ApiCallback<List<Sibyl2FunctionWithPath>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1FuncWithRuleGetValidateBeforeCall(repo, rev, rule, _callback);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionWithPath>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1FuncWithSignatureGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param signature signature (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncWithSignatureGetCall(String repo, String rev, String signature, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/func/with/signature";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (repo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("repo", repo));
        }

        if (rev != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rev", rev));
        }

        if (signature != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("signature", signature));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV1FuncWithSignatureGetValidateBeforeCall(String repo, String rev, String signature, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1FuncWithSignatureGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1FuncWithSignatureGet(Async)");
        }

        // verify the required parameter 'signature' is set
        if (signature == null) {
            throw new ApiException("Missing the required parameter 'signature' when calling apiV1FuncWithSignatureGet(Async)");
        }

        return apiV1FuncWithSignatureGetCall(repo, rev, signature, _callback);

    }

    /**
     * func query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param signature signature (required)
     * @return Sibyl2FunctionWithPath
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Sibyl2FunctionWithPath apiV1FuncWithSignatureGet(String repo, String rev, String signature) throws ApiException {
        ApiResponse<Sibyl2FunctionWithPath> localVarResp = apiV1FuncWithSignatureGetWithHttpInfo(repo, rev, signature);
        return localVarResp.getData();
    }

    /**
     * func query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param signature signature (required)
     * @return ApiResponse&lt;Sibyl2FunctionWithPath&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Sibyl2FunctionWithPath> apiV1FuncWithSignatureGetWithHttpInfo(String repo, String rev, String signature) throws ApiException {
        okhttp3.Call localVarCall = apiV1FuncWithSignatureGetValidateBeforeCall(repo, rev, signature, null);
        Type localVarReturnType = new TypeToken<Sibyl2FunctionWithPath>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * func query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param signature signature (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncWithSignatureGetAsync(String repo, String rev, String signature, final ApiCallback<Sibyl2FunctionWithPath> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1FuncWithSignatureGetValidateBeforeCall(repo, rev, signature, _callback);
        Type localVarReturnType = new TypeToken<Sibyl2FunctionWithPath>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1FuncctxWithRuleGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncctxWithRuleGetCall(String repo, String rev, String rule, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/funcctx/with/rule";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (repo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("repo", repo));
        }

        if (rev != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rev", rev));
        }

        if (rule != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rule", rule));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV1FuncctxWithRuleGetValidateBeforeCall(String repo, String rev, String rule, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1FuncctxWithRuleGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1FuncctxWithRuleGet(Async)");
        }

        // verify the required parameter 'rule' is set
        if (rule == null) {
            throw new ApiException("Missing the required parameter 'rule' when calling apiV1FuncctxWithRuleGet(Async)");
        }

        return apiV1FuncctxWithRuleGetCall(repo, rev, rule, _callback);

    }

    /**
     * func ctx query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @return List&lt;Sibyl2FunctionContext&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Sibyl2FunctionContext> apiV1FuncctxWithRuleGet(String repo, String rev, String rule) throws ApiException {
        ApiResponse<List<Sibyl2FunctionContext>> localVarResp = apiV1FuncctxWithRuleGetWithHttpInfo(repo, rev, rule);
        return localVarResp.getData();
    }

    /**
     * func ctx query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @return ApiResponse&lt;List&lt;Sibyl2FunctionContext&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Sibyl2FunctionContext>> apiV1FuncctxWithRuleGetWithHttpInfo(String repo, String rev, String rule) throws ApiException {
        okhttp3.Call localVarCall = apiV1FuncctxWithRuleGetValidateBeforeCall(repo, rev, rule, null);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionContext>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * func ctx query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param rule rule (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV1FuncctxWithRuleGetAsync(String repo, String rev, String rule, final ApiCallback<List<Sibyl2FunctionContext>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1FuncctxWithRuleGetValidateBeforeCall(repo, rev, rule, _callback);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionContext>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
