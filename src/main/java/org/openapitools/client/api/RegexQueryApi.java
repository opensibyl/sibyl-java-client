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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Sibyl2ClazzWithPath;
import org.openapitools.client.model.Sibyl2FunctionContext;
import org.openapitools.client.model.Sibyl2FunctionWithPath;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RegexQueryApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RegexQueryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RegexQueryApi(ApiClient apiClient) {
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
     * Build call for apiV1RegexClazzGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
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
    public okhttp3.Call apiV1RegexClazzGetCall(String repo, String rev, String field, String regex, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/regex/clazz";

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

        if (field != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("field", field));
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
    private okhttp3.Call apiV1RegexClazzGetValidateBeforeCall(String repo, String rev, String field, String regex, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1RegexClazzGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1RegexClazzGet(Async)");
        }

        // verify the required parameter 'field' is set
        if (field == null) {
            throw new ApiException("Missing the required parameter 'field' when calling apiV1RegexClazzGet(Async)");
        }

        // verify the required parameter 'regex' is set
        if (regex == null) {
            throw new ApiException("Missing the required parameter 'regex' when calling apiV1RegexClazzGet(Async)");
        }

        return apiV1RegexClazzGetCall(repo, rev, field, regex, _callback);

    }

    /**
     * clazz query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
     * @param regex regex (required)
     * @return List&lt;Sibyl2ClazzWithPath&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Sibyl2ClazzWithPath> apiV1RegexClazzGet(String repo, String rev, String field, String regex) throws ApiException {
        ApiResponse<List<Sibyl2ClazzWithPath>> localVarResp = apiV1RegexClazzGetWithHttpInfo(repo, rev, field, regex);
        return localVarResp.getData();
    }

    /**
     * clazz query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
     * @param regex regex (required)
     * @return ApiResponse&lt;List&lt;Sibyl2ClazzWithPath&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Sibyl2ClazzWithPath>> apiV1RegexClazzGetWithHttpInfo(String repo, String rev, String field, String regex) throws ApiException {
        okhttp3.Call localVarCall = apiV1RegexClazzGetValidateBeforeCall(repo, rev, field, regex, null);
        Type localVarReturnType = new TypeToken<List<Sibyl2ClazzWithPath>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * clazz query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
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
    public okhttp3.Call apiV1RegexClazzGetAsync(String repo, String rev, String field, String regex, final ApiCallback<List<Sibyl2ClazzWithPath>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1RegexClazzGetValidateBeforeCall(repo, rev, field, regex, _callback);
        Type localVarReturnType = new TypeToken<List<Sibyl2ClazzWithPath>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1RegexFuncGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
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
    public okhttp3.Call apiV1RegexFuncGetCall(String repo, String rev, String field, String regex, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/regex/func";

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

        if (field != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("field", field));
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
    private okhttp3.Call apiV1RegexFuncGetValidateBeforeCall(String repo, String rev, String field, String regex, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1RegexFuncGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1RegexFuncGet(Async)");
        }

        // verify the required parameter 'field' is set
        if (field == null) {
            throw new ApiException("Missing the required parameter 'field' when calling apiV1RegexFuncGet(Async)");
        }

        // verify the required parameter 'regex' is set
        if (regex == null) {
            throw new ApiException("Missing the required parameter 'regex' when calling apiV1RegexFuncGet(Async)");
        }

        return apiV1RegexFuncGetCall(repo, rev, field, regex, _callback);

    }

    /**
     * func query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
     * @param regex regex (required)
     * @return List&lt;Sibyl2FunctionWithPath&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Sibyl2FunctionWithPath> apiV1RegexFuncGet(String repo, String rev, String field, String regex) throws ApiException {
        ApiResponse<List<Sibyl2FunctionWithPath>> localVarResp = apiV1RegexFuncGetWithHttpInfo(repo, rev, field, regex);
        return localVarResp.getData();
    }

    /**
     * func query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
     * @param regex regex (required)
     * @return ApiResponse&lt;List&lt;Sibyl2FunctionWithPath&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Sibyl2FunctionWithPath>> apiV1RegexFuncGetWithHttpInfo(String repo, String rev, String field, String regex) throws ApiException {
        okhttp3.Call localVarCall = apiV1RegexFuncGetValidateBeforeCall(repo, rev, field, regex, null);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionWithPath>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * func query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
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
    public okhttp3.Call apiV1RegexFuncGetAsync(String repo, String rev, String field, String regex, final ApiCallback<List<Sibyl2FunctionWithPath>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1RegexFuncGetValidateBeforeCall(repo, rev, field, regex, _callback);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionWithPath>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV1RegexFuncctxGet
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
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
    public okhttp3.Call apiV1RegexFuncctxGetCall(String repo, String rev, String field, String regex, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/regex/funcctx";

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

        if (field != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("field", field));
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
    private okhttp3.Call apiV1RegexFuncctxGetValidateBeforeCall(String repo, String rev, String field, String regex, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling apiV1RegexFuncctxGet(Async)");
        }

        // verify the required parameter 'rev' is set
        if (rev == null) {
            throw new ApiException("Missing the required parameter 'rev' when calling apiV1RegexFuncctxGet(Async)");
        }

        // verify the required parameter 'field' is set
        if (field == null) {
            throw new ApiException("Missing the required parameter 'field' when calling apiV1RegexFuncctxGet(Async)");
        }

        // verify the required parameter 'regex' is set
        if (regex == null) {
            throw new ApiException("Missing the required parameter 'regex' when calling apiV1RegexFuncctxGet(Async)");
        }

        return apiV1RegexFuncctxGetCall(repo, rev, field, regex, _callback);

    }

    /**
     * func ctx query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
     * @param regex regex (required)
     * @return List&lt;Sibyl2FunctionContext&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<Sibyl2FunctionContext> apiV1RegexFuncctxGet(String repo, String rev, String field, String regex) throws ApiException {
        ApiResponse<List<Sibyl2FunctionContext>> localVarResp = apiV1RegexFuncctxGetWithHttpInfo(repo, rev, field, regex);
        return localVarResp.getData();
    }

    /**
     * func ctx query
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
     * @param regex regex (required)
     * @return ApiResponse&lt;List&lt;Sibyl2FunctionContext&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Sibyl2FunctionContext>> apiV1RegexFuncctxGetWithHttpInfo(String repo, String rev, String field, String regex) throws ApiException {
        okhttp3.Call localVarCall = apiV1RegexFuncctxGetValidateBeforeCall(repo, rev, field, regex, null);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionContext>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * func ctx query (asynchronously)
     * 
     * @param repo repo (required)
     * @param rev rev (required)
     * @param field field (required)
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
    public okhttp3.Call apiV1RegexFuncctxGetAsync(String repo, String rev, String field, String regex, final ApiCallback<List<Sibyl2FunctionContext>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV1RegexFuncctxGetValidateBeforeCall(repo, rev, field, regex, _callback);
        Type localVarReturnType = new TypeToken<List<Sibyl2FunctionContext>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
